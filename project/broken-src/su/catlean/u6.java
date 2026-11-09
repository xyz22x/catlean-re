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
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class u6 extends _g {
@NotNull
public static final u6 k;
static final KProperty[] F;
@NotNull
private static final c8 T;
@NotNull
private static final cq N;
@NotNull
private static final av h;
@NotNull
private static i9 A;
private static final long a = yz.a(650419375391998831L, -521477186697016015L, MethodHandles.lookup().lookupClass()).a(138568193974860L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private u6(int var1, int var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 89232876250065L;
super(b<"l">(26854, 6379841145742596305L ^ var4), jt.A(), null, 4, null, var6);
}

private final int F(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 122935761616424L;
return ((Number)T.E(this, var6, F[0])).intValue();
}

private final boolean Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 31228902253090L;
return (Boolean)N.E(this, var3, F[1]);
}

private final lj v(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 23181496776205L;
return (lj)h.E(this, var3, F[2]);
}

@Flow
private final void p(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u6.a J
// 003: ldc2_w 59776049719975
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 112642722234540
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 13388621185695
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 57297216830775
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 109437112094894
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 75592144334893
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 127725043572358
// 04a: lxor
// 04b: dup2
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 15
// 052: dup2
// 053: bipush 16
// 055: lshl
// 056: bipush 32
// 058: lushr
// 059: l2i
// 05a: istore 16
// 05c: dup2
// 05d: bipush 48
// 05f: lshl
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 17
// 066: pop2
// 067: dup2
// 068: ldc2_w 138602790017048
// 06b: lxor
// 06c: lstore 18
// 06e: dup2
// 06f: ldc2_w 27840963074187
// 072: lxor
// 073: dup2
// 074: bipush 48
// 076: lushr
// 077: l2i
// 078: istore 20
// 07a: dup2
// 07b: bipush 16
// 07d: lshl
// 07e: bipush 32
// 080: lushr
// 081: l2i
// 082: istore 21
// 084: dup2
// 085: bipush 48
// 087: lshl
// 088: bipush 48
// 08a: lushr
// 08b: l2i
// 08c: istore 22
// 08e: pop2
// 08f: dup2
// 090: ldc2_w 77889848741514
// 093: lxor
// 094: lstore 23
// 096: pop2
// 097: ldc2_w -2532369485964129371
// 09a: lload 2
// 09b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: astore 25
// 0a2: aload 0
// 0a3: lload 11
// 0a5: invokespecial su/catlean/u6.v (J)Lsu/catlean/lj;
// 0a8: invokevirtual su/catlean/lj.X ()I
// 0ab: iload 15
// 0ad: i2s
// 0ae: swap
// 0af: iload 16
// 0b1: swap
// 0b2: iload 17
// 0b4: i2c
// 0b5: swap
// 0b6: invokestatic su/catlean/bx.k (SICI)Z
// 0b9: ifeq 2c9
// 0bc: getstatic su/catlean/u6.A Lsu/catlean/i9;
// 0bf: aload 0
// 0c0: iload 20
// 0c2: i2c
// 0c3: iload 21
// 0c5: iload 22
// 0c7: i2c
// 0c8: invokespecial su/catlean/u6.F (CIC)I
// 0cb: aload 25
// 0cd: ifnull 116
// 0d0: goto 0dd
// 0d3: ldc2_w -2544869052661239561
// 0d6: lload 2
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: ifle 119
// 0e0: goto 0ed
// 0e3: ldc2_w -2544869052661239561
// 0e6: lload 2
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: aload 0
// 0ee: iload 20
// 0f0: i2c
// 0f1: iload 21
// 0f3: iload 22
// 0f5: i2c
// 0f6: invokespecial su/catlean/u6.F (CIC)I
// 0f9: bipush 5
// 0fa: imul
// 0fb: sipush 3527
// 0fe: ldc2_w 5701775411789467076
// 101: lload 2
// 102: lxor
// 103: invokedynamic i (IJ)I bsm=su/catlean/u6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: iadd
// 109: goto 116
// 10c: ldc2_w -2544869052661239561
// 10f: lload 2
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: goto 11a
// 119: bipush 2
// 11a: lload 18
// 11c: invokevirtual su/catlean/i9.e (IJ)Z
// 11f: ifeq 2c9
// 122: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 125: bipush 1
// 126: anewarray 426
// 129: astore 27
// 12b: aload 27
// 12d: bipush 0
// 12e: getstatic net/minecraft/class_1802.field_8801 Lnet/minecraft/class_1792;
// 131: dup
// 132: sipush 26080
// 135: ldc2_w 6393026284595919667
// 138: lload 2
// 139: lxor
// 13a: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/u6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 142: aastore
// 143: iload 6
// 145: aload 27
// 147: iload 7
// 149: iload 8
// 14b: i2c
// 14c: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 14f: invokevirtual su/catlean/fg.a ()I
// 152: istore 26
// 154: lload 23
// 156: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 159: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 15c: lload 23
// 15e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 161: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 164: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 167: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 16a: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 16d: getstatic net/minecraft/class_1802.field_8801 Lnet/minecraft/class_1792;
// 170: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 173: istore 27
// 175: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 178: bipush 1
// 179: anewarray 426
// 17c: astore 29
// 17e: aload 29
// 180: bipush 0
// 181: getstatic net/minecraft/class_1802.field_23141 Lnet/minecraft/class_1792;
// 184: dup
// 185: sipush 13145
// 188: ldc2_w 4499037321870601614
// 18b: lload 2
// 18c: lxor
// 18d: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/u6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 195: aastore
// 196: iload 6
// 198: aload 29
// 19a: iload 7
// 19c: iload 8
// 19e: i2c
// 19f: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 1a2: invokevirtual su/catlean/fg.a ()I
// 1a5: istore 28
// 1a7: lload 23
// 1a9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ac: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1af: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 1b2: istore 29
// 1b4: lload 4
// 1b6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b9: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 1bc: instanceof net/minecraft/class_3965
// 1bf: aload 25
// 1c1: ifnull 211
// 1c4: ifeq 22a
// 1c7: goto 1d4
// 1ca: ldc2_w -2544869052661239561
// 1cd: lload 2
// 1ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: athrow
// 1d4: lload 13
// 1d6: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1d9: lload 4
// 1db: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1de: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 1e1: dup
// 1e2: sipush 32249
// 1e5: ldc2_w 2606299067536909095
// 1e8: lload 2
// 1e9: lxor
// 1ea: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/u6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1f2: checkcast net/minecraft/class_3965
// 1f5: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 1f8: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 1fb: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 1fe: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
// 201: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 204: goto 211
// 207: ldc2_w -2544869052661239561
// 20a: lload 2
// 20b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: athrow
// 211: aload 25
// 213: ifnull 227
// 216: ifeq 22a
// 219: goto 226
// 21c: ldc2_w -2544869052661239561
// 21f: lload 2
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: bipush 1
// 227: goto 22b
// 22a: bipush 0
// 22b: istore 30
// 22d: iload 26
// 22f: bipush -1
// 230: aload 25
// 232: ifnull 267
// 235: if_icmpeq 26a
// 238: goto 245
// 23b: ldc2_w -2544869052661239561
// 23e: lload 2
// 23f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 244: athrow
// 245: iload 28
// 247: aload 25
// 249: ifnull 26d
// 24c: goto 259
// 24f: ldc2_w -2544869052661239561
// 252: lload 2
// 253: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: athrow
// 259: bipush -1
// 25a: goto 267
// 25d: ldc2_w -2544869052661239561
// 260: lload 2
// 261: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 266: athrow
// 267: if_icmpne 26b
// 26a: return
// 26b: iload 30
// 26d: ifeq 28e
// 270: aload 0
// 271: bipush 2
// 272: newarray 10
// 274: astore 31
// 276: aload 31
// 278: bipush 0
// 279: iload 26
// 27b: iastore
// 27c: aload 31
// 27e: bipush 1
// 27f: iload 29
// 281: iastore
// 282: aload 31
// 284: lload 9
// 286: invokespecial su/catlean/u6.N ([IJ)V
// 289: aload 25
// 28b: ifnonnull 2c9
// 28e: aload 0
// 28f: bipush 3
// 290: newarray 10
// 292: astore 31
// 294: aload 31
// 296: bipush 0
// 297: iload 28
// 299: iastore
// 29a: aload 31
// 29c: bipush 1
// 29d: iload 26
// 29f: iastore
// 2a0: aload 31
// 2a2: bipush 2
// 2a3: iload 27
// 2a5: aload 25
// 2a7: ifnull 2bc
// 2aa: ifeq 2bf
// 2ad: goto 2ba
// 2b0: ldc2_w -2544869052661239561
// 2b3: lload 2
// 2b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: athrow
// 2ba: iload 28
// 2bc: goto 2c1
// 2bf: iload 29
// 2c1: iastore
// 2c2: aload 31
// 2c4: lload 9
// 2c6: invokespecial su/catlean/u6.N ([IJ)V
// 2c9: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void N(int[] var1, long var2) {
var2 = a ^ var2;
Function0 var5 = null;
String var10000 = vm.a<"Å">(-2977355732048952880L, var2);
var5 = u6::e;
String var4 = var10000;
Iterable var6 = ArraysKt.reversed(var1);
boolean var7 = false;

label38:
for (Object var9 : var6) {
int var10 = ((Number)var9).intValue();
boolean var11 = false;
var5 = u6::Z;

try {
;
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -2964574760201880958L, var2);
}

do {
try {
var10000 = var4;
if (var2 >= 0L) {
if (var4 == null) {
return;
}

var10000 = var4;
}

if (var10000 != null) {
continue label38;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -2964574760201880958L, var2);
}
} while (var2 < 0L);
break;
}

var5.invoke();
}

private static final Unit e() {
return Unit.INSTANCE;
}

private static final void T(Function0 var0) {
var0.invoke();
}

private static final void R(Function0 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u6.a J
// 003: ldc2_w 102991771884301
// 006: lxor
// 007: lstore 1
// 008: lload 1
// 009: dup2
// 00a: ldc2_w 14863753408774
// 00d: lxor
// 00e: lstore 3
// 00f: dup2
// 010: ldc2_w 36547416558001
// 013: lxor
// 014: lstore 5
// 016: dup2
// 017: ldc2_w 108614061307532
// 01a: lxor
// 01b: lstore 7
// 01d: dup2
// 01e: ldc2_w 1151432897835
// 021: lxor
// 022: lstore 9
// 024: dup2
// 025: ldc2_w 126049429563681
// 028: lxor
// 029: dup2
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 11
// 030: dup2
// 031: bipush 16
// 033: lshl
// 034: bipush 32
// 036: lushr
// 037: l2i
// 038: istore 12
// 03a: dup2
// 03b: bipush 48
// 03d: lshl
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 13
// 044: pop2
// 045: pop2
// 046: ldc2_w 3274500283062696463
// 049: lload 1
// 04a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: lload 3
// 050: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 053: dup
// 054: sipush 25220
// 057: ldc2_w 7557974859748232703
// 05a: lload 1
// 05b: lxor
// 05c: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/u6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 064: checkcast su/catlean/mixins/accessors/MinecraftAccessor
// 067: invokeinterface su/catlean/mixins/accessors/MinecraftAccessor.idoItemUse ()V 1
// 06c: astore 14
// 06e: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 071: getstatic su/catlean/u6.k Lsu/catlean/u6;
// 074: iload 11
// 076: i2c
// 077: iload 12
// 079: iload 13
// 07b: i2c
// 07c: invokespecial su/catlean/u6.F (CIC)I
// 07f: bipush 2
// 080: isub
// 081: getstatic su/catlean/u6.k Lsu/catlean/u6;
// 084: lload 9
// 086: invokespecial su/catlean/u6.Y (J)Z
// 089: aload 14
// 08b: ifnull 0bf
// 08e: ifeq 0c2
// 091: goto 09e
// 094: ldc2_w 3243898923893522781
// 097: lload 1
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: new kotlin/ranges/IntRange
// 0a1: dup
// 0a2: bipush -1
// 0a3: bipush 1
// 0a4: invokespecial kotlin/ranges/IntRange.<init> (II)V
// 0a7: checkcast kotlin/ranges/ClosedRange
// 0aa: bipush 0
// 0ab: lload 7
// 0ad: bipush 2
// 0ae: aconst_null
// 0af: invokestatic su/catlean/mf.f (Lkotlin/ranges/ClosedRange;ZJILjava/lang/Object;)I
// 0b2: goto 0bf
// 0b5: ldc2_w 3243898923893522781
// 0b8: lload 1
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: goto 0c3
// 0c2: bipush 0
// 0c3: iadd
// 0c4: sipush 22614
// 0c7: ldc2_w 7589258720284551677
// 0ca: lload 1
// 0cb: lxor
// 0cc: invokedynamic i (IJ)I bsm=su/catlean/u6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: getstatic su/catlean/u6.k Lsu/catlean/u6;
// 0d4: iload 11
// 0d6: i2c
// 0d7: iload 12
// 0d9: iload 13
// 0db: i2c
// 0dc: invokespecial su/catlean/u6.F (CIC)I
// 0df: aload 14
// 0e1: ifnull 0f5
// 0e4: ifle 0f8
// 0e7: goto 0f4
// 0ea: ldc2_w 3243898923893522781
// 0ed: lload 1
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: bipush 1
// 0f5: goto 0f9
// 0f8: bipush 0
// 0f9: aload 0
// 0fa: invokedynamic run (Lkotlin/jvm/functions/Function0;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/u6.T (Lkotlin/jvm/functions/Function0;)V, ()V ]
// 0ff: lload 5
// 101: invokevirtual su/catlean/o8.X (IBZLjava/lang/Runnable;J)V
// 104: return
}

private static final Unit Z(int param0, Function0 param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u6.a J
// 03: ldc2_w 134497963594202
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 110333534658685
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 7446523642726
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 76073302178907
// 1b: lxor
// 1c: lstore 8
// 1e: dup2
// 1f: ldc2_w 42831730327548
// 22: lxor
// 23: lstore 10
// 25: dup2
// 26: ldc2_w 93856709518326
// 29: lxor
// 2a: dup2
// 2b: bipush 48
// 2d: lushr
// 2e: l2i
// 2f: istore 12
// 31: dup2
// 32: bipush 16
// 34: lshl
// 35: bipush 32
// 37: lushr
// 38: l2i
// 39: istore 13
// 3b: dup2
// 3c: bipush 48
// 3e: lshl
// 3f: bipush 48
// 41: lushr
// 42: l2i
// 43: istore 14
// 45: pop2
// 46: pop2
// 47: ldc2_w -6366265439437999912
// 4a: lload 2
// 4b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 53: iload 0
// 54: lload 4
// 56: invokevirtual su/catlean/gg.f (IJ)V
// 59: astore 15
// 5b: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 5e: getstatic su/catlean/u6.k Lsu/catlean/u6;
// 61: iload 12
// 63: i2c
// 64: iload 13
// 66: iload 14
// 68: i2c
// 69: invokespecial su/catlean/u6.F (CIC)I
// 6c: bipush 2
// 6d: isub
// 6e: getstatic su/catlean/u6.k Lsu/catlean/u6;
// 71: lload 10
// 73: invokespecial su/catlean/u6.Y (J)Z
// 76: aload 15
// 78: ifnull ac
// 7b: ifeq af
// 7e: goto 8b
// 81: ldc2_w -6353590497413461110
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: new kotlin/ranges/IntRange
// 8e: dup
// 8f: bipush -1
// 90: bipush 1
// 91: invokespecial kotlin/ranges/IntRange.<init> (II)V
// 94: checkcast kotlin/ranges/ClosedRange
// 97: bipush 0
// 98: lload 8
// 9a: bipush 2
// 9b: aconst_null
// 9c: invokestatic su/catlean/mf.f (Lkotlin/ranges/ClosedRange;ZJILjava/lang/Object;)I
// 9f: goto ac
// a2: ldc2_w -6353590497413461110
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: goto b0
// af: bipush 0
// b0: iadd
// b1: sipush 590
// b4: ldc2_w 5790990351789521207
// b7: lload 2
// b8: lxor
// b9: invokedynamic i (IJ)I bsm=su/catlean/u6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// be: getstatic su/catlean/u6.k Lsu/catlean/u6;
// c1: iload 12
// c3: i2c
// c4: iload 13
// c6: iload 14
// c8: i2c
// c9: invokespecial su/catlean/u6.F (CIC)I
// cc: aload 15
// ce: ifnull e2
// d1: ifle e5
// d4: goto e1
// d7: ldc2_w -6353590497413461110
// da: lload 2
// db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e0: athrow
// e1: bipush 1
// e2: goto e6
// e5: bipush 0
// e6: aload 1
// e7: invokedynamic run (Lkotlin/jvm/functions/Function0;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/u6.R (Lkotlin/jvm/functions/Function0;)V, ()V ]
// ec: lload 6
// ee: invokevirtual su/catlean/o8.X (IBZLjava/lang/Runnable;J)V
// f1: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// f4: areturn
}

static {
long var20 = a ^ 55550742311905L;
long var22 = var20 ^ 96238686147239L;
long var24 = var20 ^ 116800262737687L;
long var26 = var20 ^ 76540629156465L;
long var28 = var20 ^ 19570164524611L;
long var10001 = var20 ^ 58205829367120L;
int var30 = (int)((var20 ^ 58205829367120L) >>> 32);
int var31 = (int)((var20 ^ 58205829367120L) << 32 >>> 48);
int var32 = (int)(var10001 << 48 >>> 48);
var10001 = var20 ^ 73223732936937L;
int var33 = (int)((var20 ^ 73223732936937L) >>> 32);
int var34 = (int)((var20 ^ 73223732936937L) << 32 >>> 48);
int var35 = (int)(var10001 << 48 >>> 48);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[14];
int var16 = 0;
String var15 = "W\bóþCdó7\u0086-;~2í\u0087Jï¢½\u0083Ï\u0014\f|èÎØ1nhCt ÕÍ*#a\u008e\u0012\u00934{\u0085Üó\u008b+\u0016Wöïî´h¶v\u0095ìI\u009e\u0086@<u\u0090Y\u0081E6µ&Ü_p9¹õó¬\u0016@¸0@\u0019d\u000fÑz¾Sñ\n\u0083\u0097u×FÂ5\b\u0080¾1Uñ\u001b»\u001bq\u009b\u0085ü\u009e'\u0014ß0ª\rBã(í\u0007\u0018[yå\u001cý\bz\u0099\u0018éõ$Õ+\u0090\f\t'L\"DC\u0081ÐW\u0007\u001c\u008a/þS@\u0016âùÌt«8<i\u007fùN\u001a§^\u008aZù¨z§Ïvç)ÓéñßvÑ©á\u0016â.9=0}0ý\u000f\u0018M\u0089^\u000e\u001b\u001bÉ\u0018#\b$r¬[\u0007«|¾\u009aô±IBïvãÐá\u008a\u009a¯\u008d 8 1O{õJT\r¶+Á\u000fY\u0016_\u0093É\u0010\u0014\u0093\u0010tûU?\u000bG\u009cç+W\u0010;\"¦\u001fó\u0019\u009e\u0087§Â©I\u0012Eûé ÊP%?\u001dþ»è;tç$Ð\u0016å\u00911\u00ad\u001fTjÁ.¥\u0012Ú\u009f3ïÏ\u009c¯\u00187ÿI¹®\u0013®Ì_Ø)¨¹¹#%£jxZN\u0080\u008c/(®S¤9ú\u0091S\u0006ó4ëmí\u0010Ú×jþ¢øw»\u0093XºZò\u0093j%qÒB$\u0016\u0019WñKs \u0094B\u000eÁ\u001bÉþ\u0012Ñ®¶\r@\u0097t8(È÷X¡Îª/WoÞÃ\u001d<\u0083\u009d8p\u0001\u000b#\u009dk\u0003í7OõáËål ñ\u0006f\u009b»±,êÒ\u0003%Ò3\u0018¹µgdáÖU~#\u0096Ôk4ø\u0003d7+ò\r\u0080\u001a\u008bÍÉT(%w2\\I¨\u007f4%\u0091¹¶À(\u0090\u0012³Ü\u0092?\u0086¸\u0090\u0097\u0081\u0012²0%Þ\u008ff\u0089u\u0088²:^a=";
int var17 = "W\bóþCdó7\u0086-;~2í\u0087Jï¢½\u0083Ï\u0014\f|èÎØ1nhCt ÕÍ*#a\u008e\u0012\u00934{\u0085Üó\u008b+\u0016Wöïî´h¶v\u0095ìI\u009e\u0086@<u\u0090Y\u0081E6µ&Ü_p9¹õó¬\u0016@¸0@\u0019d\u000fÑz¾Sñ\n\u0083\u0097u×FÂ5\b\u0080¾1Uñ\u001b»\u001bq\u009b\u0085ü\u009e'\u0014ß0ª\rBã(í\u0007\u0018[yå\u001cý\bz\u0099\u0018éõ$Õ+\u0090\f\t'L\"DC\u0081ÐW\u0007\u001c\u008a/þS@\u0016âùÌt«8<i\u007fùN\u001a§^\u008aZù¨z§Ïvç)ÓéñßvÑ©á\u0016â.9=0}0ý\u000f\u0018M\u0089^\u000e\u001b\u001bÉ\u0018#\b$r¬[\u0007«|¾\u009aô±IBïvãÐá\u008a\u009a¯\u008d 8 1O{õJT\r¶+Á\u000fY\u0016_\u0093É\u0010\u0014\u0093\u0010tûU?\u000bG\u009cç+W\u0010;\"¦\u001fó\u0019\u009e\u0087§Â©I\u0012Eûé ÊP%?\u001dþ»è;tç$Ð\u0016å\u00911\u00ad\u001fTjÁ.¥\u0012Ú\u009f3ïÏ\u009c¯\u00187ÿI¹®\u0013®Ì_Ø)¨¹¹#%£jxZN\u0080\u008c/(®S¤9ú\u0091S\u0006ó4ëmí\u0010Ú×jþ¢øw»\u0093XºZò\u0093j%qÒB$\u0016\u0019WñKs \u0094B\u000eÁ\u001bÉþ\u0012Ñ®¶\r@\u0097t8(È÷X¡Îª/WoÞÃ\u001d<\u0083\u009d8p\u0001\u000b#\u009dk\u0003í7OõáËål ñ\u0006f\u009b»±,êÒ\u0003%Ò3\u0018¹µgdáÖU~#\u0096Ôk4ø\u0003d7+ò\r\u0080\u001a\u008bÍÉT(%w2\\I¨\u007f4%\u0091¹¶À(\u0090\u0012³Ü\u0092?\u0086¸\u0090\u0097\u0081\u0012²0%Þ\u008ff\u0089u\u0088²:^a="
.length();
char var14 = ' ';
int var39 = -1;

label54:
while (true) {
String var40 = var15.substring(++var39, var39 + var14);
byte var45 = -1;

while (true) {
byte[] var19 = var11.doFinal(var40.getBytes("ISO-8859-1"));
String var53 = b(var19).intern();
switch (var45) {
case 0:
var18[var16++] = var53;
if ((var39 += var14) >= var17) {
b = var18;
c = new String[14];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = "MÌÑ2¡¼Z\u008f\u008bçò\u0007õÝ|\u007f4]$ÙÐËl\u000f\u0012Ï\u008b\u0001á'7æ\u00123¤\u0080X\f¸\u009e";
int var5 = "MÌÑ2¡¼Z\u008f\u008bçò\u0007õÝ|\u007f4]$ÙÐËl\u000f\u0012Ï\u008b\u0001á'7æ\u00123¤\u0080X\f¸\u009e".length();
byte var2 = 0;

label36:
while (true) {
byte var49 = var2;
var2 += 8;
byte[] var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
long[] var43 = var6;
int var50 = var3++;
long var57 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var60 = -1;

while (true) {
long var8 = var57;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var62 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var60) {
case 0:
var43[var50] = var62;
if (var2 >= var5) {
e = var6;
f = new Integer[7];
KProperty[] var36 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(u6.class, b<"l">(7242, 6988506346768096222L ^ var20), b<"l">(12667, 3037305254370277093L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(u6.class, b<"l">(27744, 5272456769414409206L ^ var20), b<"l">(30090, 3145034606648013335L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(u6.class, b<"l">(20089, 5886289351885490656L ^ var20), b<"l">(15125, 3037428443343715466L ^ var20), 0))
};
F = var36;
k = new u6(var33, var34, (short)var35);
T = yp.L(k, b<"l">(17169, 4683614899633063041L ^ var20), 1, new IntRange(0, 5), var24, null, null, c<"i">(14918, 2507407704079442693L ^ var20), null);
N = yp.t(k, b<"l">(29702, 4860987491551228821L ^ var20), false, var26, null, null, c<"i">(29082, 6143440115882354906L ^ var20), null);
h = yp.J(
k,
b<"l">(3572, 6344529176944298598L ^ var20),
new lj(0, false, var28, false, c<"i">(10364, 4327255120303108410L ^ var20), null),
null,
var30,
null,
var31,
(char)var32,
c<"i">(11108, 6993713510590100000L ^ var20),
null
);
A = new i9(var22);
return;
}
break;
default:
var43[var50] = var62;
if (var2 < var5) {
continue label36;
}

var4 = "(ÆÃ\u008c:ç$\u0000Tl\u0095wYAdW";
var5 = "(ÆÃ\u008c:ç$\u0000Tl\u0095wYAdW".length();
var2 = 0;
}

byte var51 = var2;
var2 += 8;
var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
var43 = var6;
var50 = var3++;
var57 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var60 = 0;
}
}
}

var14 = var15.charAt(var39);
break;
default:
var18[var16++] = var53;
if ((var39 += var14) < var17) {
var14 = var15.charAt(var39);
continue label54;
}

var15 = "\u0001Ï\u0081@?3¸\u0090$2ÉÂV\u0012\u0007fVúØ\u0089XO¯²t3\u0093Ö0õ\u001b¾\u0080Ã$ÊókP\rw\u009a Æ\u0086kë\u0099î \u0002Âõ\u0099\u0095jÕïÝÜ\u009f\u0019q»ëF)\u0018\u0090(>\u0004ë¾\u0011\u00ad=\u0011¶«³Ïÿîk6V¤þ\u008d÷\rvóP6|»WâS9\u001e»\u001apê^±\u0084mzG¹ø\u008d \u000by¼\u009e¸\u009bË2/»2$Ý\u008e\u00adEq¢¯¦Þ\u0081ð'\u008fþ\u0007¶¼Æ\u001c\u0084Ü\u0084Ëlf\u008cE?Hß¹Q";
var17 = "\u0001Ï\u0081@?3¸\u0090$2ÉÂV\u0012\u0007fVúØ\u0089XO¯²t3\u0093Ö0õ\u001b¾\u0080Ã$ÊókP\rw\u009a Æ\u0086kë\u0099î \u0002Âõ\u0099\u0095jÕïÝÜ\u009f\u0019q»ëF)\u0018\u0090(>\u0004ë¾\u0011\u00ad=\u0011¶«³Ïÿîk6V¤þ\u008d÷\rvóP6|»WâS9\u001e»\u001apê^±\u0084mzG¹ø\u008d \u000by¼\u009e¸\u009bË2/»2$Ý\u008e\u00adEq¢¯¦Þ\u0081ð'\u008fþ\u0007¶¼Æ\u001c\u0084Ü\u0084Ëlf\u008cE?Hß¹Q"
.length();
var14 = ' ';
var39 = -1;
}

var40 = var15.substring(++var39, var39 + var14);
var45 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String b(byte[] var0) {
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 822;
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
throw new RuntimeException("su/catlean/u6", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/u6" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24037;
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
throw new RuntimeException("su/catlean/u6", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/u6" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
