package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class o0 {
@NotNull
private final class_1304 B;
private final int V;
private int U;
private int A;
private int I;
private static final long a = yz.a(-3929895574944108731L, 4051851449162225347L, MethodHandles.lookup().lookupClass()).a(72818857753439L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public o0(long a, @NotNull class_1304 equipmentSlot, int armorSlot, int prevProt, int newSlot, int newProtection) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(equipmentSlot, a<"f">(24684, 6437349697040182427L ^ ax));
super();
this.B = equipmentSlot;
this.V = armorSlot;
this.U = prevProt;
this.A = newSlot;
this.I = newProtection;
}

@NotNull
public final class_1304 p() {
return this.B;
}

public final int q() {
return this.V;
}

public final int t() {
return this.U;
}

public final void e(int <set-?>) {
this.U = <set-?>;
}

public final int J() {
return this.A;
}

public final void B(int <set-?>) {
this.A = <set-?>;
}

public final int s() {
return this.I;
}

public final void q(int <set-?>) {
this.I = <set-?>;
}

public final void k(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 109262154147993L;
long var8 = var4 ^ 81736986216742L;
ql var10002 = ql.k;
class_1799 var10003 = zf.v(var8).method_31548().method_5438(this.V);
Intrinsics.checkNotNullExpressionValue(var10003, a<"f">(15696, 596640068196605133L ^ var4));
this.U = ql.p(var6, var10002, var10003);
this.A = -1;
this.I = -1;
}

@NotNull
public final class_1304 G() {
return this.B;
}

public final int O() {
return this.V;
}

public final int E() {
return this.U;
}

public final int i() {
return this.A;
}

public final int g() {
return this.I;
}

@NotNull
public final o0 i(@NotNull class_1304 equipmentSlot, int armorSlot, long a, int prevProt, int newSlot, int newProtection) {
ax = a ^ ax;
long var8 = ax ^ 136159595446232L;
Intrinsics.checkNotNullParameter(equipmentSlot, a<"f">(5761, 7455746390002444452L ^ ax));
return new o0(var8, equipmentSlot, armorSlot, prevProt, newSlot, newProtection);
}

public static o0 o(o0 param0, class_1304 param1, int param2, int param3, int param4, long param5, int param7, int param8, Object param9) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/o0.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 82567173455576
// 00e: lxor
// 00f: lstore 10
// 011: pop2
// 012: ldc2_w -5232939142689025903
// 015: lload 5
// 017: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01c: astore 12
// 01e: iload 8
// 020: bipush 1
// 021: iand
// 022: aload 12
// 024: ifnonnull 041
// 027: ifeq 03d
// 02a: goto 038
// 02d: ldc2_w -5255628936920768683
// 030: lload 5
// 032: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: athrow
// 038: aload 0
// 039: getfield su/catlean/o0.B Lnet/minecraft/class_1304;
// 03c: astore 1
// 03d: iload 8
// 03f: bipush 2
// 040: iand
// 041: aload 12
// 043: lload 5
// 045: lconst_0
// 046: lcmp
// 047: ifle 069
// 04a: ifnonnull 067
// 04d: ifeq 063
// 050: goto 05e
// 053: ldc2_w -5255628936920768683
// 056: lload 5
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: aload 0
// 05f: getfield su/catlean/o0.V I
// 062: istore 2
// 063: iload 8
// 065: bipush 4
// 066: iand
// 067: aload 12
// 069: lload 5
// 06b: lconst_0
// 06c: lcmp
// 06d: ifle 09c
// 070: ifnonnull 09a
// 073: ifeq 089
// 076: goto 084
// 079: ldc2_w -5255628936920768683
// 07c: lload 5
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: aload 0
// 085: getfield su/catlean/o0.U I
// 088: istore 3
// 089: iload 8
// 08b: sipush 28530
// 08e: ldc2_w 7549053624185341841
// 091: lload 5
// 093: lxor
// 094: invokedynamic o (IJ)I bsm=su/catlean/o0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: iand
// 09a: aload 12
// 09c: lload 5
// 09e: lconst_0
// 09f: lcmp
// 0a0: iflt 0d0
// 0a3: ifnonnull 0ce
// 0a6: ifeq 0bd
// 0a9: goto 0b7
// 0ac: ldc2_w -5255628936920768683
// 0af: lload 5
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: aload 0
// 0b8: getfield su/catlean/o0.A I
// 0bb: istore 4
// 0bd: iload 8
// 0bf: sipush 16203
// 0c2: ldc2_w 2995728581433759659
// 0c5: lload 5
// 0c7: lxor
// 0c8: invokedynamic o (IJ)I bsm=su/catlean/o0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: iand
// 0ce: aload 12
// 0d0: ifnonnull 0f6
// 0d3: ifeq 0f8
// 0d6: goto 0e4
// 0d9: ldc2_w -5255628936920768683
// 0dc: lload 5
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: aload 0
// 0e5: getfield su/catlean/o0.I I
// 0e8: goto 0f6
// 0eb: ldc2_w -5255628936920768683
// 0ee: lload 5
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: istore 7
// 0f8: aload 0
// 0f9: aload 1
// 0fa: iload 2
// 0fb: lload 10
// 0fd: iload 3
// 0fe: iload 4
// 100: iload 7
// 102: invokevirtual su/catlean/o0.i (Lnet/minecraft/class_1304;IJIII)Lsu/catlean/o0;
// 105: lload 5
// 107: lconst_0
// 108: lcmp
// 109: ifle 126
// 10c: ldc2_w -5226809492468094489
// 10f: lload 5
// 111: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: ifnull 134
// 119: bipush 4
// 11a: newarray 10
// 11c: ldc2_w -5200405544947547426
// 11f: lload 5
// 121: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: goto 134
// 129: ldc2_w -5255628936920768683
// 12c: lload 5
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 109444256799703L;
int var3 = this.I;
int var4 = this.A;
int var5 = this.U;
int var6 = this.V;
class_1304 var7 = this.B;
return a<"f">(27909, 7506581387022450703L ^ var1)
+ var7
+ a<"f">(10684, 6306471190730933428L ^ var1)
+ var6
+ a<"f">(17995, 8957033186099358533L ^ var1)
+ var5
+ a<"f">(25133, 936217218567655204L ^ var1)
+ var4
+ a<"f">(8830, 1284424568906649458L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 114387280355199L;
int[] var10000 = vm.a<"Å">(-3228808698846513983L, var1);
int var4 = this.B.hashCode();
int[] var3 = var10000;
var4 = var4 * b<"o">(2221, 7853089255652082719L ^ var1) + Integer.hashCode(this.V);
var4 = var4 * b<"o">(28922, 3320398027976621131L ^ var1) + Integer.hashCode(this.U);
var4 = var4 * b<"o">(28922, 3320398027976621131L ^ var1) + Integer.hashCode(this.A);
var4 = var4 * b<"o">(28922, 3320398027976621131L ^ var1) + Integer.hashCode(this.I);

try {
if (var3 != null) {
vm.a<"Å">(new _g[2], -3219888168787125907L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -3224459305032500475L, var1);
}
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/o0.a J
// 003: ldc2_w 118093593431100
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 4644324984491501442
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 4612645030959261766
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 4612645030959261766
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/o0
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 4612645030959261766
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 4612645030959261766
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/o0
// 05f: astore 5
// 061: aload 0
// 062: aload 4
// 064: ifnonnull 08c
// 067: getfield su/catlean/o0.B Lnet/minecraft/class_1304;
// 06a: aload 5
// 06c: getfield su/catlean/o0.B Lnet/minecraft/class_1304;
// 06f: if_acmpeq 08b
// 072: goto 07f
// 075: ldc2_w 4612645030959261766
// 078: lload 2
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: bipush 0
// 080: ireturn
// 081: ldc2_w 4612645030959261766
// 084: lload 2
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: aload 0
// 08c: getfield su/catlean/o0.V I
// 08f: aload 5
// 091: getfield su/catlean/o0.V I
// 094: aload 4
// 096: ifnonnull 0be
// 099: if_icmpeq 0b5
// 09c: goto 0a9
// 09f: ldc2_w 4612645030959261766
// 0a2: lload 2
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: bipush 0
// 0aa: ireturn
// 0ab: ldc2_w 4612645030959261766
// 0ae: lload 2
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: aload 0
// 0b6: getfield su/catlean/o0.U I
// 0b9: aload 5
// 0bb: getfield su/catlean/o0.U I
// 0be: aload 4
// 0c0: ifnonnull 0e8
// 0c3: if_icmpeq 0df
// 0c6: goto 0d3
// 0c9: ldc2_w 4612645030959261766
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: bipush 0
// 0d4: ireturn
// 0d5: ldc2_w 4612645030959261766
// 0d8: lload 2
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: aload 0
// 0e0: getfield su/catlean/o0.A I
// 0e3: aload 5
// 0e5: getfield su/catlean/o0.A I
// 0e8: aload 4
// 0ea: ifnonnull 124
// 0ed: if_icmpeq 109
// 0f0: goto 0fd
// 0f3: ldc2_w 4612645030959261766
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: bipush 0
// 0fe: ireturn
// 0ff: ldc2_w 4612645030959261766
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: aload 0
// 10a: getfield su/catlean/o0.I I
// 10d: aload 4
// 10f: ifnonnull 134
// 112: aload 5
// 114: getfield su/catlean/o0.I I
// 117: goto 124
// 11a: ldc2_w 4612645030959261766
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: if_icmpeq 133
// 127: bipush 0
// 128: ireturn
// 129: ldc2_w 4612645030959261766
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: bipush 1
// 134: ireturn
}

static {
long var11 = a ^ 34851018826139L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[8];
int var18 = 0;
String var17 = "a¨\u000b<Ým\u0004¦ÆOj\u00056\u0012/xÇqD£\túÉ\b3\u001c\u009f\\\u0018ù7À()u³Õ\u009e61\u001d\u008bá3üR\u0096EÞ«^á\rÞ\u00904\u0098ª\u0001\u0094³.æv+ççÁFRð\u0005\u0084\u0018\u0011].Î¼°\u0093\t\u0001\u0095~\u0007dÊ<\u009c\u0080wk¸Êq¿\u0089 ÒQD, <ÈÌSÄ.\u009f¢ª¤ªLçÉÜ\t'\u0093Ö!§\u009fçI\u00ady\u0013 \u001dE\u001bÞo¦R\u0094Â%\u0013UñÃ\u008b}ìÍàLfí¹\u009eµò½T8©©ÿ \u0087\u00adý¶\u0099=\u0001ëðt\n(4=Uß\u0089\u0082èè©(àÇf \u001c6È\u0098\u008a\u0090";
int var19 = "a¨\u000b<Ým\u0004¦ÆOj\u00056\u0012/xÇqD£\túÉ\b3\u001c\u009f\\\u0018ù7À()u³Õ\u009e61\u001d\u008bá3üR\u0096EÞ«^á\rÞ\u00904\u0098ª\u0001\u0094³.æv+ççÁFRð\u0005\u0084\u0018\u0011].Î¼°\u0093\t\u0001\u0095~\u0007dÊ<\u009c\u0080wk¸Êq¿\u0089 ÒQD, <ÈÌSÄ.\u009f¢ª¤ªLçÉÜ\t'\u0093Ö!§\u009fçI\u00ady\u0013 \u001dE\u001bÞo¦R\u0094Â%\u0013UñÃ\u008b}ìÍàLfí¹\u009eµò½T8©©ÿ \u0087\u00adý¶\u0099=\u0001ëðt\n(4=Uß\u0089\u0082èè©(àÇf \u001c6È\u0098\u008a\u0090"
.length();
char var16 = ' ';
int var24 = -1;

label54:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var36;
if ((var24 += var16) >= var19) {
b = var20;
c = new String[8];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "úEÔßÍî(»\u000e\u0081\u0096%\u00ad\u0007.\u008f";
int var5 = "úEÔßÍî(»\u000e\u0081\u0096%\u00ad\u0007.\u008f".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
e = var6;
f = new Integer[4];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "Nõ¯sºw+\u0003Ã\u0092s'%ôpË";
var5 = "Nõ¯sºw+\u0003Ã\u0092s'%ôpË".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var36;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label54;
}

var17 = "Æ\u0094\u0081·ÕÜÃ«\u001a}\u009aÁ[\u009e6\u0013§4Rõ\u0014¶éÕÎ¯\u009e\u000b\u000eINO0\u009e;·\u00037EeÄ\u0092Za\u0091ùöòùØ¤ýÚô²\u0082\u009f3åSø\u0082\u0088*C¢[Ë\u0007j\u001c \u0092P\u008d»m:(8y";
var19 = "Æ\u0094\u0081·ÕÜÃ«\u001a}\u009aÁ[\u009e6\u0013§4Rõ\u0014¶éÕÎ¯\u009e\u000b\u000eINO0\u009e;·\u00037EeÄ\u0092Za\u0091ùöòùØ¤ýÚô²\u0082\u009f3åSø\u0082\u0088*C¢[Ë\u0007j\u001c \u0092P\u008d»m:(8y"
.length();
var16 = ' ';
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String a(byte[] var0) {
int var1 = 0;
int var2;
char[] var3 = new char[var2 = var0.length];

for (int var4 = 0; var4 < var2; var4++) {
int var5;
if ((var5 = 255 & var0[var4]) < 192) {
var3[var1++] = (char)var5;
} else if (var5 < 224) {
char var6 = (char)((char)(var5 & 31) << 6);
byte var8 = var0[++var4];
var6 = (char)(var6 | (char)(var8 & 63));
var3[var1++] = var6;
} else if (var4 < var2 - 2) {
char var12 = (char)((char)(var5 & 15) << '\f');
byte var9 = var0[++var4];
var12 = (char)(var12 | (char)(var9 & 63) << 6);
var9 = var0[++var4];
var12 = (char)(var12 | (char)(var9 & 63));
var3[var1++] = var12;
}
}

return new String(var3, 0, var1);
}

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15314;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])d.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/o0", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = b[var5].getBytes("ISO-8859-1");
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite a(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/o0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7877;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/o0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite b(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/o0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
