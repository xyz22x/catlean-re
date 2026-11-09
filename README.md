# CatLean 0.1.2 — reconstrução (reversão)

Reconstrução do mod Fabric **CatLean 0.1.2** a partir do artefato distribuído (`catlean.jar`, SHA-256 `d15e0afafc2ecbbc3883d3a1369542c16dfc3ed395e13e9de233fadaeb003f4c`).

> **Aviso:** o mod original é *All Rights Reserved* (autores: pan4ur, 06ED). Este repositório é destinado a estudo/análise. Não é um build oficial e não deve ser redistribuído como obra própria ou dos autores originais.

## Artefato original
- **Mod:** CatLean 0.1.2 (cliente PvP/anarquia, `environment: client`)
- **Minecraft 1.21.11** · Fabric Loader **0.18.2** · Loom **1.14.10** · Java **21** (namespace de remapeamento `intermediary`)
- **Kotlin/Fabric:** fabric-language-kotlin 1.13.6 + Kotlin 2.2.20
- **Conteúdo:** ~959 classes ofuscadas em `su.catlean.*` (eventos, mixins, UI `gofra`, RPC Discord, cliente HTTP/proxy Netty, info de mídia `dev.redstones`) + assets (shaders, fontes, sons, ícones SVG, traduções)
- **Ofuscação:** Zelix KlassMaster 2 (ZKM2) — nomes embaralhados, strings cifradas/decodificadas em runtime e `invokedynamic` com bootstraps próprios.

## O que este repositório contém
```
catlean-re/
├── project/                 # projeto Gradle/Fabric reconstruído (build verificado)
│   ├── src/main/java/       # fontes decompiladas que compilam (287 .java)
│   ├── src/main/resources/  # fabric.mod.json, mixins, access widener, assets
│   ├── libs-precompiled/    # .class originais usados onde o decompile ZKM2 não recompila (1031)
│   ├── broken-src/          # fontes decompiladas substituídas (937, evidência)
│   ├── mappings/            # mapeamento identity intermediary->named (tiny v2)
│   ├── build.gradle / settings.gradle / gradle.properties
│   └── fix-compile.ps1      # loop de correção híbrida (compile → swap p/ .class original)
├── decompiled/              # saída bruta do decompilador (su.catlean + dev.redstones)
├── run-decompile.ps1        # script de decompilação (Vineflower)
└── README.md
```

## Decompilação
- Decompilador: **Vineflower 1.11.1** (oficial), executado em lotes (`run-decompile.ps1`) com JAR de referência.
- **1.225 / 1.225** classes decompiladas (0 falhas reportadas): `su.catlean` (1.219) + `dev.redstones.mediaplayerinfo` (10), preservadas em `decompiled/`.

## Reconstrução e build (verificado)
Devido à ofuscação ZKM2, parte do código decompilado não recompila fielmente (artefatos de descompilação, colisões de nomes/símbolos, bootstraps/crypto de runtime). Para um **build correto e sem erros**, foi usada uma reconstrução **híbrida**:
- fontes mantidas quando compilam;
- quando não compilam de forma recuperável, o `.java` vai para `project/broken-src/` e o(s) `.class` **original(is)** correspondente(s) entram em `project/libs-precompiled/` (incluindo entrypoints com decompile Kotlin inválido e impls dependentes de D-Bus).

Dependências resolvidas por Maven oficial (Fabric/Mojang): Fabric API 0.141.3+1.21.11, fabric-language-kotlin 1.13.6+kotlin.2.2.20, Netty proxy/socks 4.1.90.Final, jsvg 1.4.0, kotlinx-serialization 1.9.0, anotações/Kotlin stdlib; `dev.redstones.mediaplayerinfo` é mantido como no original. O acesso nativo usa um mapeamento *identity* `intermediary->named` (`project/mappings/intermediary-identity.jar`) para compilar/remapear as fontes no namespace `intermediary` sem renomear o código ofuscado.

### Como compilar
Requisitos: **JDK 21** e **Gradle 9.2.1+** (ou o wrapper do projeto).

```powershell
cd project
$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-21.0.13.9-hotspot"  # ajuste se necessário
.\gradlew.bat build -x test --console=plain --no-daemon
# ou: C:\tools\gradle-9.2.1\bin\gradle.bat build -x test --console=plain --no-daemon
```

Saída esperada: `BUILD SUCCESSFUL` e `project/build/libs/catlean-re-0.1.2-re.jar` (remapeado, `remapJar`).

## Notas
- `build/` e `.gradle/` são gerados e ficam ignorados pelo Git; `decompiled/`, `broken-src/` e `libs-precompiled/` são mantidos como evidência/reprodutibilidade da reconstrução.
- Reescrever manualmente as unidades ofuscadas para fonte equivalente é uma etapa de desofuscação separada; a abordagem híbrida acima preserva a semântica do bytecode original e garante um build reproduzível sem erros.
