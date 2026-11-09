# Decompilação em lotes de su.catlean (para máquina com pouca RAM)
# Roda sequencialmente; seguro para deixar overnight.
$ErrorActionPreference = "Continue"
$jf   = "$env:TEMP\vineflower.jar"
$libs = "$env:TEMP\catlean-all.jar"
$src  = "C:\Users\marcos\AppData\Local\Temp\rea-extracted-6ac91064-7b8a-417d-9573-62883bce750a"
$out  = "C:\Users\marcos\Documents\Default Project\catlean-re\decompiled"
$log  = "C:\Users\marcos\Documents\Default Project\catlean-re\decompile.log"
$stg  = "$env:TEMP\vf-staging"
$heap = "-Xmx900m"
$batchSize = 160

"=== start $(Get-Date -Format o) ===" | Out-File $log -Encoding utf8
$all = Get-ChildItem "$src\su" -Recurse -File -Filter *.class | Sort-Object FullName
$total = $all.Count
"classes total (su): $total" | Out-File $log -Append

$chunks = @()
for ($i = 0; $i -lt $total; $i += $batchSize) {
    $end = [Math]::Min($i + $batchSize - 1, $total - 1)
    $chunks += ,@($all[$i..$end])
}
"chunks: $($chunks.Count) (batch $batchSize, heap $heap)" | Out-File $log -Append

$idx = 0; $ok = 0; $fail = 0
foreach ($chunk in $chunks) {
    $idx++
    if (Test-Path $stg) { Remove-Item $stg -Recurse -Force -ErrorAction SilentlyContinue }
    New-Item -ItemType Directory -Force $stg | Out-Null
    foreach ($f in $chunk) {
        $rel = $f.FullName.Substring($src.Length + 1) # e.g. su\catlean\...
        $dest = Join-Path $stg $rel
        $destDir = Split-Path $dest -Parent
        if (!(Test-Path $destDir)) { New-Item -ItemType Directory -Force $destDir | Out-Null }
        Copy-Item $f.FullName $dest -Force
    }
    $t0 = Get-Date
    $proc = Start-Process -FilePath "java" -ArgumentList @($heap, "-jar", $jf, "--ind=    ", "-e=$libs", $stg, $out) -NoNewWindow -Wait -PassThru -RedirectStandardOutput "$env:TEMP\vf-chunk.out" -RedirectStandardError "$env:TEMP\vf-chunk.err"
    $sec = [int]((Get-Date) - $t0).TotalSeconds
    $code = $proc.ExitCode
    $produced = (Get-ChildItem $stg -Recurse -Filter *.class).Count
    if ($code -eq 0) { $ok++ } else { $fail++ }
    $oom = Select-String -Path "$env:TEMP\vf-chunk.err" -Pattern "OutOfMemoryError" -Quiet -ErrorAction SilentlyContinue
    "[$idx/$($chunks.Count)] exit=$code ${sec}s classes=$produced oom=$oom ok=$ok fail=$fail" | Out-File $log -Append
}
if (Test-Path $stg) { Remove-Item $stg -Recurse -Force -ErrorAction SilentlyContinue }
$javaCount = (Get-ChildItem "$out\su" -Recurse -File -Filter *.java -ErrorAction SilentlyContinue).Count
"=== done $(Get-Date -Format o) java_su=$javaCount ok=$ok fail=$fail ===" | Out-File $log -Append
