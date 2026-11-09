$ErrorActionPreference = "Continue"
$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-21.0.13.9-hotspot"
$env:Path = "$env:JAVA_HOME\bin;" + $env:Path
$proj = "C:\Users\marcos\Documents\Default Project\catlean-re\project"
$src  = "C:\Users\marcos\AppData\Local\Temp\rea-extracted-6ac91064-7b8a-417d-9573-62883bce750a"
$gradle = "C:\tools\gradle-9.2.1\bin\gradle.bat"
$log = "$proj\compile-fix.log"
$pre = "$proj\libs-precompiled"
$bak = "$proj\broken-src"
Set-Location $proj

"=== fix loop $(Get-Date -Format o) ===" | Out-File $log -Encoding utf8
for ($i = 1; $i -le 60; $i++) {
  "----- iteration $i -----" | Out-File $log -Append
  & $gradle compileJava --console=plain --no-daemon -q 2>&1 | Out-File "$proj\compile-last.log" -Encoding utf8
  $code = $LASTEXITCODE
  $out = Get-Content "$proj\compile-last.log" -Raw -ErrorAction SilentlyContinue
  if ($code -eq 0) { "SUCCESS compileJava at iteration $i" | Out-File $log -Append; break }
  # extract error files
  $errFiles = [regex]::Matches($out, [regex]::Escape("$proj\src\main\java\") + "([^\s:]+\.java):\d+: error:") |
    ForEach-Object { $_.Groups[1].Value } | Sort-Object -Unique
  # also try relative/variant patterns
  if ($errFiles.Count -eq 0) {
    $errFiles = [regex]::Matches($out, 'src\\main\\java\\([^\s:]+\.java):\d+: error:') |
      ForEach-Object { $_.Groups[1].Value } | Sort-Object -Unique
  }
  "errors in $($errFiles.Count) files (exit $code)" | Out-File $log -Append
  if ($errFiles.Count -eq 0) {
    # show tail for diagnosis
    ($out | Select-Object -Last 15) -join "`n" | Out-File $log -Append
    "no parseable error files - stopping" | Out-File $log -Append; break
  }
  $fixed = 0
  foreach ($rel in $errFiles) {
    $javaPath = Join-Path "$proj\src\main\java" $rel
    if (!(Test-Path $javaPath)) { continue }
    $clsRel = [IO.Path]::ChangeExtension($rel, $null).TrimEnd('.') # su\catlean\a1
    $clsDir = Join-Path $src (Split-Path $clsRel -Parent)
    $clsName = Split-Path $clsRel -Leaf
    $orig = Get-ChildItem $clsDir -Filter "$clsName*.class" -EA SilentlyContinue
    if ($orig) {
      foreach ($m in $orig) {
        $mRel = $m.FullName.Substring($src.Length+1)
        $dest = Join-Path $pre $mRel
        New-Item -ItemType Directory -Force (Split-Path $dest) | Out-Null
        Copy-Item $m.FullName $dest -Force
      }
      $bakDest = Join-Path $bak $rel
      New-Item -ItemType Directory -Force (Split-Path $bakDest) | Out-Null
      Move-Item $javaPath $bakDest -Force
      $fixed++
    } else {
      "  MISS original for $rel" | Out-File $log -Append
    }
  }
  "  replaced $fixed files with precompiled classes" | Out-File $log -Append
  $srcCount = (Get-ChildItem "$proj\src\main\java" -Recurse -Filter *.java -EA SilentlyContinue).Count
  $preCount = (Get-ChildItem $pre -Recurse -Filter *.class -EA SilentlyContinue).Count
  "  remaining java=$srcCount precompiled=$preCount" | Out-File $log -Append
}
"=== end $(Get-Date -Format o) ===" | Out-File $log -Append
# final full build if compile passed
$lastOk = Select-String -Path $log -Pattern 'SUCCESS compileJava' -Quiet
if ($lastOk) {
  "running full build..." | Out-File $log -Append
  & $gradle build -x test --console=plain --no-daemon 2>&1 | Out-File "$proj\build.log" -Encoding utf8
  "full build exit=$LASTEXITCODE" | Out-File $log -Append
}