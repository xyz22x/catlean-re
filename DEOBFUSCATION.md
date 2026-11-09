# Deobfuscação — CatLean 0.1.2 (ZKM2)

Alvo: `C:\Users\marcos\Downloads\catlean.jar` (Fabric/MC 1.21.11, Loader 0.18.2, Java 21, namespace `intermediary`, 3092 classes, ofuscação **Zelix KlassMaster 2 / ZKM2**). Sem `ChangeLog` ZKM disponível.

## Limite fundamental (evidência)
- **Nomes originais:** sem `changeLogFileOut` do ZKM, a restauração exata de nomes de `su.catlean.*` **não é garantida** (confirmado pela documentação ZKM e por todas as ferramentas usadas). Mantidos nomes ofuscados/intermediary.
- **Criptografia de strings (modo endurecido):** detector do *java-deobfuscator* identificou em `su/catlean/oy` criptografia DES `(IJ)Ljava/lang/String;` com **mudança de parâmetros de método / magic number** (“method parameter change string encryption … This mode is currently not supported / Recommend transformers: None”). Os indys `(IJ)Ljava/lang/String;` (bootstrap p/ classe, ex. `su/catlean/CatLean.a`, nome `k`) recebem argumentos **computados em runtime** (ex.: `LLOAD`+`LXOR` derivados de parâmetros mágicos), não literais — confirmado por `javap`/ASM no jar original e no transformado. Isso impede substituição estática simples.

## Ferramentas usadas (todas oficiais/GitHub, quando aplicável)
| Ferramenta | Comando/uso | Resultado (evidência) |
|---|---|---|
| `zkm-deobfuscator-1.0.3-all.jar` (DarkCreative1, ASM) — estático | `java -Xmx1536m -jar ... catlean.jar -o catlean-deobf-v103.jar --no-dyn --no-rename` | `verify OK 3092`; `str_patched=0 str_skipped=49 int_patched=0 flow_folded=14504 dead_removed=272 handlers_removed=0 ref_inlined=0 param_calls=1 param_callees=3 renamed=0` (`zkm-deobf-v103.log`) |
| `zkm-deobfuscator-1.0.3-all.jar` — **dinâmico (autorizado)** | `java -Xmx1536m -jar ... catlean.jar -o catlean-deobf-v103-dyn.jar --no-rename` | `verify OK 3092`; **`str_patched=30 str_skipped=19`** `int_patched=0 flow_folded=14504 dead_removed=306 handlers_removed=0 ref_inlined=0` (`zkm-deobf-v103-dyn.log`) → **melhor** |
| `java-deobfuscator` (`deobfuscator.jar`) — detecção | `--config detect.yml` (`detect:true`) | ZKM; `vm` reflection → recomendou `zelix.ReflectionObfuscationTransformer`; DES param-change `(IJ)` em `oy` = não suportado/None |
| `java-deobfuscator` — reflection | `zelix.ReflectionObfuscationTransformer` | `javadeobf-catlean/catlean-jd.jar` (10.927.910 B). Contagens indy globais inalteradas: original/jd/dyn = `indy=39974 vm_bsm=21799 (IJ)String=11934` (amostra ASM) |
| `java-deobfuscator` — string enhanced | `zelix.string.EnhancedStringEncryptionTransformer` | **Falhou** (NPE `componentType` em `VirtualMachine`/native hook do JavaVM do deobfuscator) — incompatível neste caso |
| `zkm27-full-deobfuscator-1.0.0.jar` (ZKM27) | `input report [output]` | 0 sites (01/02/05), sem jar final; templates ZKM27 ≠ ZKM2 aqui |
| Decompiladores (legibilidade) | Vineflower 1.11.1, **CFR 0.152** sobre `catlean-deobf-v103-dyn.jar` (su+dev) | `decompiled-deobf-dyn/` (1.225 `.java`, Vineflower), `decompiled-cfr-dyn/` (1.227 `.java`, CFR) — fluxo simplificado + 30 strings resolvidas refletidas; strings param-change permanecem como chamadas ao decryptor (ex. `oy.a(...)`) |
| Recaf | `recaf2` 2.21.14 (J8, baixado), `recaf 4.0.0-alpha` win (requer Java 22; host com JDK 21) | disponíveis em `opencode temp`; uso headless/GUI limitado neste ambiente/versão |

## Reconstrução / compilação sem erro
- **`project/` (baseline, verificado):** `BUILD SUCCESSFUL` → `build/libs/catlean-re-0.1.2-re.jar` (8.353.225 B, remapJar). Híbrido: 287 `.java` compilados + 1.031 `.class` originais (`libs-precompiled/`), 937 fontes decompiladas irrecuperáveis em `broken-src/`. Evidência: `build-final.log`, `compile-fix.log`.
- **`project-deobf/` (sobre deobf dinâmico, em validação):** fontes de `decompiled-deobf-dyn` (fluxo dobrado + 30 strings) + loop híbrido; contagens/resultado registrados em `project-deobf/compile-fix.log` e `project-deobf/build.log`/`build/libs` quando concluído.

## O que foi deobfuscado / o que resta
- **Revertido/parcial:** simplificação de fluxo (14.504 dobras) e remoção de código morto/handlers (306) verificadas; 30 literais de string recuperados (dinâmico); reflection transformer aplicado (sem redução mensurável dos indys `vm`). Código decompilado mais legível (CFR/Vineflower) sobre o bytecode transformado.
- **Resta (bloqueado sem changelog/apoio de runtime específico):** nomes originais; ~19 strings `str_skipped` + o grande conjunto de indys DES `(IJ)` com args computados (method-parameter-changes) e referências/indys `vm` (21.799 bsm vm / 39.974 indys totais observados) — exigem suporte específico ao modo ZKM2 param-change ou emulação/runtime direcionado por site (complexo e dependente do modelo do ofuscador).

## Tentativas próprias (custom, ASM)
- `strdeobf/StrDeobf.java` + `Dbg.java` (ASM via `zkm-deobfuscator-all.jar`, resolução dinâmica de bootstraps, autorizada): identificou 18.626 indys `(IJ)/(JI)`; ao inspecionar `CatLean.(IJ)String` (bootstrap `su/catlean/CatLean.a`) os **2 args anteriores ao indy são `LLOAD`+`LXOR` (computados, não constantes)** no original e no jar transformado — logo substituição `LDC` por constantes é inviável sem rastrear/avaliar o fluxo de parâmetros mágicos. Resultado: `patched=0 skipped=11934` (execução de prova). Métrica indy global estável (original/jd/dyn): `indy=39974 vm_bsm=21799 (IJ)String=11934`.

## Artefatos
- Jars deobf: `opencode temp` (`catlean-deobf-v103*.jar`, `catlean-deobf-v103-dyn.jar`, `catlean-jd*.jar`, `cfr.jar`, `recaf*.jar`, `strdeobf/`).
- Fontes legíveis: `decompiled/`, `decompiled-deobf-dyn/`, `decompiled-cfr-dyn/`, `decompiled-cfr-jd/`, `decompiled-built-cfr/` (CFR do JAR construído).
- Build compilável: `project/` (**BUILD SUCCESSFUL**, jar 8.353.225 B) e `project-deobf/` (híbrido sobre deobf-dyn).
