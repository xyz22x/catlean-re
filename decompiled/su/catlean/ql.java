package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ql extends _g {
@NotNull
public static final ql k;
static final KProperty[] C;
@NotNull
private static final cw I;
@NotNull
private static final cw D;
@NotNull
private static final cw F;
@NotNull
private static final cw L;
@NotNull
private static final cw S;
@NotNull
private static final c8 a;
@NotNull
private static final cq V;
@NotNull
private static final cq U;
@NotNull
private static final cq x;
@NotNull
private static final cq y;
@NotNull
private static final cq n;
@NotNull
private static i9 m;
@NotNull
private static i9 K;
@NotNull
private static final List T;
private static final long b = yz.a(-5570765986815099006L, 8395397587163049665L, MethodHandles.lookup().lookupClass()).a(29513188429153L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private ql(int var1, int var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 15309197839966L;
super(b<"t">(15509, 627058729675314392L ^ var4), jt.I(), null, 4, null, var6);
}

private final d9 L(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 40621604480837L;
return (d9)I.E(this, var3, C[0]);
}

private final d9 K(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 137531381873171L;
return (d9)D.E(this, var3, C[1]);
}

private final d9 I(short var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
long var6 = var4 ^ 127221995575583L;
return (d9)F.E(this, var6, C[2]);
}

private final d9 W(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 68036088701698L;
return (d9)L.E(this, var3, C[3]);
}

private final mb q(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 84689629736907L;
return (mb)S.E(this, var3, C[4]);
}

private final int r(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 115015628717326L;
return ((Number)a.E(this, var3, C[5])).intValue();
}

private final boolean P(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 92481912524022L;
return (Boolean)V.E(this, var3, C[c<"n">(25047, 3663824779676348326L ^ var1)]);
}

private final boolean w(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 126570000772294L;
return (Boolean)U.E(this, var3, C[c<"n">(2675, 6437142188465071146L ^ var1)]);
}

private final boolean z(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 42473008328853L;
return (Boolean)x.E(this, var3, C[c<"n">(11418, 924635799116029583L ^ var1)]);
}

private final boolean T(int var1, short var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 117999757399932L;
return (Boolean)y.E(this, var6, C[c<"n">(11153, 49287882764910206L ^ var4)]);
}

private final boolean G(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 136734705492898L;
return (Boolean)n.E(this, var3, C[c<"n">(11864, 1265870377415593824L ^ var1)]);
}

@NotNull
public final i9 Y() {
return m;
}

public final void F(long a, @NotNull i9 <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"t">(32233, 7944486924504680510L ^ ax));
m = <set-?>;
}

@Flow(
priority = -10
)
private final void L(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ql.b J
// 003: ldc2_w 139480574753579
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 14112710718751
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 27190908110778
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 71158238720860
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 139891338519691
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 33842683544562
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 18602473570071
// 030: lxor
// 031: dup2
// 032: bipush 16
// 034: lushr
// 035: lstore 14
// 037: dup2
// 038: bipush 48
// 03a: lshl
// 03b: bipush 48
// 03d: lushr
// 03e: l2i
// 03f: istore 16
// 041: pop2
// 042: dup2
// 043: ldc2_w 116580368448473
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 47294772426541
// 04d: lxor
// 04e: lstore 19
// 050: dup2
// 051: ldc2_w 84691303980009
// 054: lxor
// 055: lstore 21
// 057: dup2
// 058: ldc2_w 48861002201913
// 05b: lxor
// 05c: lstore 23
// 05e: dup2
// 05f: ldc2_w 111824296090422
// 062: lxor
// 063: lstore 25
// 065: dup2
// 066: ldc2_w 119519322502174
// 069: lxor
// 06a: lstore 27
// 06c: dup2
// 06d: ldc2_w 107666656886912
// 070: lxor
// 071: lstore 29
// 073: dup2
// 074: ldc2_w 95111199902241
// 077: lxor
// 078: lstore 31
// 07a: dup2
// 07b: ldc2_w 127689811774595
// 07e: lxor
// 07f: lstore 33
// 081: dup2
// 082: ldc2_w 39673589115827
// 085: lxor
// 086: lstore 35
// 088: dup2
// 089: ldc2_w 43415921894642
// 08c: lxor
// 08d: lstore 37
// 08f: dup2
// 090: ldc2_w 72876526212237
// 093: lxor
// 094: lstore 39
// 096: dup2
// 097: ldc2_w 119636761425642
// 09a: lxor
// 09b: dup2
// 09c: bipush 48
// 09e: lushr
// 09f: l2i
// 0a0: istore 41
// 0a2: dup2
// 0a3: bipush 16
// 0a5: lshl
// 0a6: bipush 32
// 0a8: lushr
// 0a9: l2i
// 0aa: istore 42
// 0ac: dup2
// 0ad: bipush 48
// 0af: lshl
// 0b0: bipush 48
// 0b2: lushr
// 0b3: l2i
// 0b4: istore 43
// 0b6: pop2
// 0b7: dup2
// 0b8: ldc2_w 48527101546364
// 0bb: lxor
// 0bc: lstore 44
// 0be: pop2
// 0bf: ldc2_w 2959419493173169888
// 0c2: lload 2
// 0c3: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: astore 51
// 0ca: lload 4
// 0cc: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0cf: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0d2: ifnull 12b
// 0d5: aload 0
// 0d6: lload 21
// 0d8: invokespecial su/catlean/ql.w (J)Z
// 0db: aload 51
// 0dd: ifnonnull 142
// 0e0: goto 0ed
// 0e3: ldc2_w 2931491017652520786
// 0e6: lload 2
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: ifeq 12b
// 0f0: goto 0fd
// 0f3: ldc2_w 2931491017652520786
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: lload 4
// 0ff: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 102: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 105: instanceof net/minecraft/class_408
// 108: aload 51
// 10a: ifnonnull 142
// 10d: goto 11a
// 110: ldc2_w 2931491017652520786
// 113: lload 2
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: ifne 12b
// 11d: goto 12a
// 120: ldc2_w 2931491017652520786
// 123: lload 2
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: return
// 12b: getstatic su/catlean/ql.m Lsu/catlean/i9;
// 12e: aload 0
// 12f: lload 31
// 131: invokespecial su/catlean/ql.r (J)I
// 134: iload 41
// 136: i2s
// 137: swap
// 138: iload 42
// 13a: swap
// 13b: iload 43
// 13d: i2s
// 13e: swap
// 13f: invokevirtual su/catlean/i9.g (SISI)Z
// 142: ifne 146
// 145: return
// 146: getstatic su/catlean/ql.T Ljava/util/List;
// 149: checkcast java/lang/Iterable
// 14c: astore 52
// 14e: bipush 0
// 14f: istore 53
// 151: aload 52
// 153: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 158: astore 54
// 15a: aload 54
// 15c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 161: ifeq 199
// 164: aload 54
// 166: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 16b: astore 55
// 16d: aload 55
// 16f: checkcast su/catlean/o0
// 172: astore 56
// 174: bipush 0
// 175: istore 57
// 177: aload 56
// 179: lload 14
// 17b: iload 16
// 17d: i2c
// 17e: invokevirtual su/catlean/o0.k (JC)V
// 181: nop
// 182: aload 51
// 184: ifnonnull 19a
// 187: aload 51
// 189: ifnull 15a
// 18c: goto 199
// 18f: ldc2_w 2931491017652520786
// 192: lload 2
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: nop
// 19a: lload 23
// 19c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19f: getfield net/minecraft/class_746.field_6012 I
// 1a2: sipush 32521
// 1a5: ldc2_w 7242096692894620125
// 1a8: lload 2
// 1a9: lxor
// 1aa: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: irem
// 1b0: aload 51
// 1b2: ifnonnull 20e
// 1b5: ifne 20d
// 1b8: goto 1c5
// 1bb: ldc2_w 2931491017652520786
// 1be: lload 2
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: aload 0
// 1c6: lload 39
// 1c8: invokespecial su/catlean/ql.G (J)Z
// 1cb: aload 51
// 1cd: ifnonnull 20e
// 1d0: goto 1dd
// 1d3: ldc2_w 2931491017652520786
// 1d6: lload 2
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: ifeq 20d
// 1e0: goto 1ed
// 1e3: ldc2_w 2931491017652520786
// 1e6: lload 2
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: bipush 5
// 1ee: bipush 0
// 1ef: getstatic net/minecraft/class_1713.field_7794 Lnet/minecraft/class_1713;
// 1f2: bipush 1
// 1f3: lload 29
// 1f5: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 1f8: getstatic su/catlean/ql.K Lsu/catlean/i9;
// 1fb: lload 25
// 1fd: invokevirtual su/catlean/i9.X (J)V
// 200: goto 20d
// 203: ldc2_w 2931491017652520786
// 206: lload 2
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: bipush 0
// 20e: istore 52
// 210: iload 52
// 212: sipush 6871
// 215: ldc2_w 912667695785131027
// 218: lload 2
// 219: lxor
// 21a: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: if_icmpge 36e
// 222: lload 23
// 224: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 227: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 22a: iload 52
// 22c: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 22f: dup
// 230: sipush 31237
// 233: ldc2_w 3352957343913665684
// 236: lload 2
// 237: lxor
// 238: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ql.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 240: astore 53
// 242: aload 0
// 243: lload 12
// 245: aload 53
// 247: invokespecial su/catlean/ql.U (JLnet/minecraft/class_1799;)I
// 24a: istore 54
// 24c: aload 51
// 24e: ifnonnull 369
// 251: iload 54
// 253: ifle 366
// 256: goto 263
// 259: ldc2_w 2931491017652520786
// 25c: lload 2
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: getstatic su/catlean/ql.T Ljava/util/List;
// 266: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 26b: astore 55
// 26d: aload 55
// 26f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 274: ifeq 366
// 277: aload 55
// 279: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 27e: checkcast su/catlean/o0
// 281: astore 56
// 283: aload 0
// 284: lload 39
// 286: invokespecial su/catlean/ql.G (J)Z
// 289: aload 51
// 28b: ifnonnull 212
// 28e: aload 51
// 290: ifnonnull 2bf
// 293: ifeq 2fe
// 296: goto 2a3
// 299: ldc2_w 2931491017652520786
// 29c: lload 2
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: getstatic su/catlean/ql.K Lsu/catlean/i9;
// 2a6: iload 41
// 2a8: i2s
// 2a9: iload 42
// 2ab: iload 43
// 2ad: i2s
// 2ae: bipush 1
// 2af: invokevirtual su/catlean/i9.g (SISI)Z
// 2b2: goto 2bf
// 2b5: ldc2_w 2931491017652520786
// 2b8: lload 2
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: ifne 2fe
// 2c2: aload 56
// 2c4: invokevirtual su/catlean/o0.p ()Lnet/minecraft/class_1304;
// 2c7: aload 51
// 2c9: ifnonnull 303
// 2cc: goto 2d9
// 2cf: ldc2_w 2931491017652520786
// 2d2: lload 2
// 2d3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d8: athrow
// 2d9: getstatic net/minecraft/class_1304.field_6169 Lnet/minecraft/class_1304;
// 2dc: if_acmpne 2fe
// 2df: goto 2ec
// 2e2: ldc2_w 2931491017652520786
// 2e5: lload 2
// 2e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2eb: athrow
// 2ec: aload 51
// 2ee: ifnull 26d
// 2f1: goto 2fe
// 2f4: ldc2_w 2931491017652520786
// 2f7: lload 2
// 2f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: athrow
// 2fe: aload 56
// 300: invokevirtual su/catlean/o0.p ()Lnet/minecraft/class_1304;
// 303: lload 8
// 305: aload 53
// 307: invokestatic su/catlean/xa.F (JLnet/minecraft/class_1799;)Z
// 30a: ifeq 322
// 30d: aload 0
// 30e: lload 33
// 310: aload 53
// 312: invokespecial su/catlean/ql.g (JLnet/minecraft/class_1799;)Lnet/minecraft/class_1304;
// 315: goto 325
// 318: ldc2_w 2931491017652520786
// 31b: lload 2
// 31c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 321: athrow
// 322: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 325: if_acmpne 26d
// 328: iload 54
// 32a: aload 56
// 32c: invokevirtual su/catlean/o0.t ()I
// 32f: aload 51
// 331: ifnonnull 350
// 334: if_icmple 26d
// 337: goto 344
// 33a: ldc2_w 2931491017652520786
// 33d: lload 2
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: iload 54
// 346: aload 51
// 348: ifnonnull 274
// 34b: aload 56
// 34d: invokevirtual su/catlean/o0.s ()I
// 350: if_icmple 26d
// 353: aload 56
// 355: iload 52
// 357: invokevirtual su/catlean/o0.B (I)V
// 35a: aload 56
// 35c: iload 54
// 35e: invokevirtual su/catlean/o0.q (I)V
// 361: aload 51
// 363: ifnull 26d
// 366: iinc 52 1
// 369: aload 51
// 36b: ifnull 210
// 36e: getstatic su/catlean/ql.T Ljava/util/List;
// 371: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 376: astore 52
// 378: aload 52
// 37a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 37f: ifeq 5e0
// 382: aload 52
// 384: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 389: checkcast su/catlean/o0
// 38c: astore 53
// 38e: aload 53
// 390: invokevirtual su/catlean/o0.J ()I
// 393: istore 54
// 395: iload 54
// 397: bipush -1
// 398: if_icmpeq 378
// 39b: aload 53
// 39d: invokevirtual su/catlean/o0.t ()I
// 3a0: bipush -1
// 3a1: aload 51
// 3a3: ifnonnull 398
// 3a6: aload 51
// 3a8: ifnonnull 411
// 3ab: if_icmpeq 3e3
// 3ae: goto 3bb
// 3b1: ldc2_w 2931491017652520786
// 3b4: lload 2
// 3b5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ba: athrow
// 3bb: aload 0
// 3bc: lload 17
// 3be: invokespecial su/catlean/ql.P (J)Z
// 3c1: aload 51
// 3c3: ifnonnull 47a
// 3c6: goto 3d3
// 3c9: ldc2_w 2931491017652520786
// 3cc: lload 2
// 3cd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d2: athrow
// 3d3: ifne 465
// 3d6: goto 3e3
// 3d9: ldc2_w 2931491017652520786
// 3dc: lload 2
// 3dd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e2: athrow
// 3e3: iload 54
// 3e5: aload 51
// 3e7: ifnonnull 47a
// 3ea: goto 3f7
// 3ed: ldc2_w 2931491017652520786
// 3f0: lload 2
// 3f1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f6: athrow
// 3f7: sipush 32707
// 3fa: ldc2_w 3435768370596305161
// 3fd: lload 2
// 3fe: lxor
// 3ff: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 404: goto 411
// 407: ldc2_w 2931491017652520786
// 40a: lload 2
// 40b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 410: athrow
// 411: if_icmpge 465
// 414: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 417: lload 27
// 419: iload 54
// 41b: invokevirtual su/catlean/gg.B (JI)V
// 41e: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 421: fconst_0
// 422: lload 35
// 424: fconst_0
// 425: sipush 23285
// 428: ldc2_w 4719065308625370162
// 42b: lload 2
// 42c: lxor
// 42d: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 432: aconst_null
// 433: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 436: pop
// 437: new net/minecraft/class_2879
// 43a: dup
// 43b: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 43e: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 441: checkcast net/minecraft/class_2596
// 444: lload 44
// 446: dup2_x1
// 447: pop2
// 448: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 44b: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 44e: lload 19
// 450: invokevirtual su/catlean/gg.d (J)V
// 453: aload 51
// 455: ifnull 5d7
// 458: goto 465
// 45b: ldc2_w 2931491017652520786
// 45e: lload 2
// 45f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 464: athrow
// 465: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 468: lload 37
// 46a: invokevirtual su/catlean/dm.Y (J)Z
// 46d: goto 47a
// 470: ldc2_w 2931491017652520786
// 473: lload 2
// 474: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 479: athrow
// 47a: aload 51
// 47c: ifnonnull 4ba
// 47f: ifeq 4b8
// 482: goto 48f
// 485: ldc2_w 2931491017652520786
// 488: lload 2
// 489: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48e: athrow
// 48f: aload 0
// 490: lload 6
// 492: invokespecial su/catlean/ql.z (J)Z
// 495: aload 51
// 497: ifnonnull 4ba
// 49a: goto 4a7
// 49d: ldc2_w 2931491017652520786
// 4a0: lload 2
// 4a1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a6: athrow
// 4a7: ifeq 4b8
// 4aa: goto 4b7
// 4ad: ldc2_w 2931491017652520786
// 4b0: lload 2
// 4b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b6: athrow
// 4b7: return
// 4b8: iload 54
// 4ba: sipush 32707
// 4bd: ldc2_w 3435768370596305161
// 4c0: lload 2
// 4c1: lxor
// 4c2: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c7: aload 51
// 4c9: ifnonnull 4f8
// 4cc: if_icmpge 4fc
// 4cf: goto 4dc
// 4d2: ldc2_w 2931491017652520786
// 4d5: lload 2
// 4d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4db: athrow
// 4dc: sipush 6871
// 4df: ldc2_w 912667695785131027
// 4e2: lload 2
// 4e3: lxor
// 4e4: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e9: iload 54
// 4eb: goto 4f8
// 4ee: ldc2_w 2931491017652520786
// 4f1: lload 2
// 4f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f7: athrow
// 4f8: iadd
// 4f9: goto 4fe
// 4fc: iload 54
// 4fe: istore 55
// 500: iload 55
// 502: lload 10
// 504: bipush 0
// 505: aconst_null
// 506: bipush 0
// 507: sipush 7517
// 50a: ldc2_w 279444766604508046
// 50d: lload 2
// 50e: lxor
// 50f: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 514: aconst_null
// 515: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 518: aload 53
// 51a: invokevirtual su/catlean/o0.q ()I
// 51d: sipush 11113
// 520: ldc2_w 3634162294531329470
// 523: lload 2
// 524: lxor
// 525: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52a: isub
// 52b: sipush 14601
// 52e: ldc2_w 6675107646986526681
// 531: lload 2
// 532: lxor
// 533: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 538: aload 53
// 53a: invokevirtual su/catlean/o0.q ()I
// 53d: isub
// 53e: bipush 2
// 53f: imul
// 540: iadd
// 541: bipush 0
// 542: aconst_null
// 543: aload 53
// 545: invokevirtual su/catlean/o0.t ()I
// 548: aload 51
// 54a: ifnonnull 56c
// 54d: bipush -1
// 54e: if_icmpne 56f
// 551: goto 55e
// 554: ldc2_w 2931491017652520786
// 557: lload 2
// 558: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55d: athrow
// 55e: bipush 1
// 55f: goto 56c
// 562: ldc2_w 2931491017652520786
// 565: lload 2
// 566: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56b: athrow
// 56c: goto 570
// 56f: bipush 0
// 570: sipush 23285
// 573: ldc2_w 4719065308625370162
// 576: lload 2
// 577: lxor
// 578: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57d: aconst_null
// 57e: astore 46
// 580: istore 47
// 582: istore 48
// 584: astore 49
// 586: istore 50
// 588: lload 10
// 58a: iload 50
// 58c: aload 49
// 58e: iload 48
// 590: iload 47
// 592: aload 46
// 594: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 597: aload 51
// 599: ifnonnull 5df
// 59c: aload 53
// 59e: invokevirtual su/catlean/o0.t ()I
// 5a1: bipush -1
// 5a2: if_icmpeq 5d7
// 5a5: goto 5b2
// 5a8: ldc2_w 2931491017652520786
// 5ab: lload 2
// 5ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b1: athrow
// 5b2: iload 55
// 5b4: lload 10
// 5b6: bipush 0
// 5b7: aconst_null
// 5b8: bipush 1
// 5b9: sipush 23285
// 5bc: ldc2_w 4719065308625370162
// 5bf: lload 2
// 5c0: lxor
// 5c1: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c6: aconst_null
// 5c7: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 5ca: goto 5d7
// 5cd: ldc2_w 2931491017652520786
// 5d0: lload 2
// 5d1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d6: athrow
// 5d7: getstatic su/catlean/ql.m Lsu/catlean/i9;
// 5da: lload 25
// 5dc: invokevirtual su/catlean/i9.X (J)V
// 5df: return
// 5e0: return
}

private final int U(long param1, class_1799 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ql.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 126321784079522
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 5748995234828
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 54628805010387
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 55074145312179
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 90205761664849
// 027: lxor
// 028: lstore 12
// 02a: dup2
// 02b: ldc2_w 39936793833692
// 02e: lxor
// 02f: dup2
// 030: bipush 32
// 032: lushr
// 033: l2i
// 034: istore 14
// 036: dup2
// 037: bipush 32
// 039: lshl
// 03a: bipush 48
// 03c: lushr
// 03d: l2i
// 03e: istore 15
// 040: dup2
// 041: bipush 48
// 043: lshl
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 16
// 04a: pop2
// 04b: dup2
// 04c: ldc2_w 105002480571665
// 04f: lxor
// 050: lstore 17
// 052: dup2
// 053: ldc2_w 118689336213733
// 056: lxor
// 057: lstore 19
// 059: dup2
// 05a: ldc2_w 2221047318635
// 05d: lxor
// 05e: lstore 21
// 060: dup2
// 061: ldc2_w 68555589762792
// 064: lxor
// 065: lstore 23
// 067: dup2
// 068: ldc2_w 102704573787062
// 06b: lxor
// 06c: lstore 25
// 06e: dup2
// 06f: ldc2_w 66753894678207
// 072: lxor
// 073: dup2
// 074: bipush 48
// 076: lushr
// 077: l2i
// 078: istore 27
// 07a: dup2
// 07b: bipush 16
// 07d: lshl
// 07e: bipush 16
// 080: lushr
// 081: lstore 28
// 083: pop2
// 084: pop2
// 085: ldc2_w -459779195435032977
// 088: lload 1
// 089: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: astore 30
// 090: lload 8
// 092: aload 3
// 093: invokestatic su/catlean/xa.F (JLnet/minecraft/class_1799;)Z
// 096: aload 30
// 098: ifnonnull 0de
// 09b: ifne 0dd
// 09e: goto 0ab
// 0a1: ldc2_w -566944942712973347
// 0a4: lload 1
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: aload 3
// 0ac: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0af: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 0b2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b5: aload 30
// 0b7: lload 1
// 0b8: lconst_0
// 0b9: lcmp
// 0ba: ifle 6d7
// 0bd: ifnonnull 6d5
// 0c0: goto 0cd
// 0c3: ldc2_w -566944942712973347
// 0c6: lload 1
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: ifeq 6d1
// 0d0: goto 0dd
// 0d3: ldc2_w -566944942712973347
// 0d6: lload 1
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: bipush 0
// 0de: istore 31
// 0e0: aload 0
// 0e1: lload 6
// 0e3: aload 3
// 0e4: invokespecial su/catlean/ql.g (JLnet/minecraft/class_1799;)Lnet/minecraft/class_1304;
// 0e7: astore 32
// 0e9: aload 3
// 0ea: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0ed: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 0f0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f3: aload 30
// 0f5: ifnonnull 269
// 0f8: ifeq 268
// 0fb: goto 108
// 0fe: ldc2_w -566944942712973347
// 101: lload 1
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 10b: lload 12
// 10d: aload 3
// 10e: invokevirtual su/catlean/ut.Y (JLnet/minecraft/class_1799;)Z
// 111: aload 30
// 113: ifnonnull 134
// 116: goto 123
// 119: ldc2_w -566944942712973347
// 11c: lload 1
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: ifne 135
// 126: goto 133
// 129: ldc2_w -566944942712973347
// 12c: lload 1
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: bipush 0
// 134: ireturn
// 135: aload 0
// 136: lload 21
// 138: invokespecial su/catlean/ql.q (J)Lsu/catlean/mb;
// 13b: getstatic su/catlean/mb.ELYTRA_PLUS Lsu/catlean/mb;
// 13e: if_acmpne 199
// 141: getstatic su/catlean/_0.D Lsu/catlean/_0;
// 144: lload 23
// 146: invokevirtual su/catlean/_0.f (J)Z
// 149: aload 30
// 14b: ifnonnull 196
// 14e: goto 15b
// 151: ldc2_w -566944942712973347
// 154: lload 1
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: ifne 195
// 15e: goto 16b
// 161: ldc2_w -566944942712973347
// 164: lload 1
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 16e: lload 23
// 170: invokevirtual su/catlean/ut.f (J)Z
// 173: aload 30
// 175: ifnonnull 196
// 178: goto 185
// 17b: ldc2_w -566944942712973347
// 17e: lload 1
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: ifeq 199
// 188: goto 195
// 18b: ldc2_w -566944942712973347
// 18e: lload 1
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: bipush 1
// 196: goto 19a
// 199: bipush 0
// 19a: istore 33
// 19c: aload 0
// 19d: lload 21
// 19f: invokespecial su/catlean/ql.q (J)Lsu/catlean/mb;
// 1a2: getstatic su/catlean/mb.IGNORE Lsu/catlean/mb;
// 1a5: if_acmpne 1ef
// 1a8: lload 25
// 1aa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ad: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1b0: sipush 6100
// 1b3: ldc2_w 5746320666374037908
// 1b6: lload 1
// 1b7: lxor
// 1b8: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 1c0: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1c3: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 1c6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1c9: aload 30
// 1cb: ifnonnull 1ec
// 1ce: goto 1db
// 1d1: ldc2_w -566944942712973347
// 1d4: lload 1
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: ifeq 1ef
// 1de: goto 1eb
// 1e1: ldc2_w -566944942712973347
// 1e4: lload 1
// 1e5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ea: athrow
// 1eb: bipush 1
// 1ec: goto 1f0
// 1ef: bipush 0
// 1f0: istore 34
// 1f2: iload 33
// 1f4: aload 30
// 1f6: ifnonnull 266
// 1f9: ifne 24c
// 1fc: goto 209
// 1ff: ldc2_w -566944942712973347
// 202: lload 1
// 203: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 208: athrow
// 209: iload 34
// 20b: aload 30
// 20d: ifnonnull 266
// 210: goto 21d
// 213: ldc2_w -566944942712973347
// 216: lload 1
// 217: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: athrow
// 21d: lload 1
// 21e: lconst_0
// 21f: lcmp
// 220: iflt 259
// 223: ifne 24c
// 226: goto 233
// 229: ldc2_w -566944942712973347
// 22c: lload 1
// 22d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 232: athrow
// 233: aload 0
// 234: lload 21
// 236: invokespecial su/catlean/ql.q (J)Lsu/catlean/mb;
// 239: getstatic su/catlean/mb.ALWAYS Lsu/catlean/mb;
// 23c: if_acmpne 268
// 23f: goto 24c
// 242: ldc2_w -566944942712973347
// 245: lload 1
// 246: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: athrow
// 24c: sipush 11213
// 24f: ldc2_w 3939309144619408769
// 252: lload 1
// 253: lxor
// 254: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 259: goto 266
// 25c: ldc2_w -566944942712973347
// 25f: lload 1
// 260: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 265: athrow
// 266: istore 31
// 268: bipush 1
// 269: istore 33
// 26b: bipush 1
// 26c: istore 34
// 26e: aload 32
// 270: getstatic su/catlean/it.C [I
// 273: swap
// 274: invokevirtual net/minecraft/class_1304.ordinal ()I
// 277: iaload
// 278: aload 30
// 27a: lload 1
// 27b: lconst_0
// 27c: lcmp
// 27d: iflt 382
// 280: ifnonnull 380
// 283: tableswitch 249 1 4 39 92 145 201
// 2a0: ldc2_w -566944942712973347
// 2a3: lload 1
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: aload 0
// 2ab: lload 19
// 2ad: invokespecial su/catlean/ql.L (J)Lsu/catlean/d9;
// 2b0: getstatic su/catlean/d9.PROTECTION Lsu/catlean/d9;
// 2b3: if_acmpne 2d4
// 2b6: goto 2c3
// 2b9: ldc2_w -566944942712973347
// 2bc: lload 1
// 2bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c2: athrow
// 2c3: iload 34
// 2c5: bipush 2
// 2c6: imul
// 2c7: istore 34
// 2c9: aload 30
// 2cb: lload 1
// 2cc: lconst_0
// 2cd: lcmp
// 2ce: ifle 2dc
// 2d1: ifnull 37c
// 2d4: iload 33
// 2d6: bipush 2
// 2d7: imul
// 2d8: istore 33
// 2da: aload 30
// 2dc: ifnull 37c
// 2df: aload 0
// 2e0: lload 10
// 2e2: invokespecial su/catlean/ql.K (J)Lsu/catlean/d9;
// 2e5: getstatic su/catlean/d9.PROTECTION Lsu/catlean/d9;
// 2e8: if_acmpne 309
// 2eb: goto 2f8
// 2ee: ldc2_w -566944942712973347
// 2f1: lload 1
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: iload 34
// 2fa: bipush 2
// 2fb: imul
// 2fc: istore 34
// 2fe: aload 30
// 300: lload 1
// 301: lconst_0
// 302: lcmp
// 303: ifle 311
// 306: ifnull 37c
// 309: iload 33
// 30b: bipush 2
// 30c: imul
// 30d: istore 33
// 30f: aload 30
// 311: ifnull 37c
// 314: aload 0
// 315: iload 27
// 317: i2s
// 318: lload 28
// 31a: invokespecial su/catlean/ql.I (SJ)Lsu/catlean/d9;
// 31d: getstatic su/catlean/d9.PROTECTION Lsu/catlean/d9;
// 320: if_acmpne 341
// 323: goto 330
// 326: ldc2_w -566944942712973347
// 329: lload 1
// 32a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32f: athrow
// 330: iload 34
// 332: bipush 2
// 333: imul
// 334: istore 34
// 336: aload 30
// 338: lload 1
// 339: lconst_0
// 33a: lcmp
// 33b: iflt 349
// 33e: ifnull 37c
// 341: iload 33
// 343: bipush 2
// 344: imul
// 345: istore 33
// 347: aload 30
// 349: ifnull 37c
// 34c: aload 0
// 34d: lload 4
// 34f: invokespecial su/catlean/ql.W (J)Lsu/catlean/d9;
// 352: getstatic su/catlean/d9.PROTECTION Lsu/catlean/d9;
// 355: if_acmpne 376
// 358: goto 365
// 35b: ldc2_w -566944942712973347
// 35e: lload 1
// 35f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 364: athrow
// 365: iload 34
// 367: bipush 2
// 368: imul
// 369: lload 1
// 36a: lconst_0
// 36b: lcmp
// 36c: ifle 37a
// 36f: istore 34
// 371: aload 30
// 373: ifnull 37c
// 376: iload 33
// 378: bipush 2
// 379: imul
// 37a: istore 33
// 37c: aload 3
// 37d: invokevirtual net/minecraft/class_1799.method_7942 ()Z
// 380: aload 30
// 382: ifnonnull 53f
// 385: ifeq 538
// 388: goto 395
// 38b: ldc2_w -566944942712973347
// 38e: lload 1
// 38f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 394: athrow
// 395: aload 3
// 396: invokestatic net/minecraft/class_1890.method_57532 (Lnet/minecraft/class_1799;)Lnet/minecraft/class_9304;
// 399: dup
// 39a: sipush 25310
// 39d: ldc2_w 7317967969828285662
// 3a0: lload 1
// 3a1: lxor
// 3a2: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ql.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3aa: astore 35
// 3ac: lload 17
// 3ae: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 3b1: invokevirtual net/minecraft/class_638.method_30349 ()Lnet/minecraft/class_5455;
// 3b4: getstatic net/minecraft/class_1893.field_9111 Lnet/minecraft/class_5321;
// 3b7: invokevirtual net/minecraft/class_5321.method_58273 ()Lnet/minecraft/class_5321;
// 3ba: invokeinterface net/minecraft/class_5455.method_46759 (Lnet/minecraft/class_5321;)Ljava/util/Optional; 2
// 3bf: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 3c2: checkcast net/minecraft/class_2378
// 3c5: getstatic net/minecraft/class_1893.field_9111 Lnet/minecraft/class_5321;
// 3c8: invokevirtual net/minecraft/class_5321.method_29177 ()Lnet/minecraft/class_2960;
// 3cb: invokeinterface net/minecraft/class_2378.method_10223 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
// 3d0: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 3d3: dup
// 3d4: sipush 23076
// 3d7: ldc2_w 3315807590580065336
// 3da: lload 1
// 3db: lxor
// 3dc: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ql.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3e4: checkcast net/minecraft/class_6880$class_6883
// 3e7: astore 36
// 3e9: lload 17
// 3eb: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 3ee: invokevirtual net/minecraft/class_638.method_30349 ()Lnet/minecraft/class_5455;
// 3f1: getstatic net/minecraft/class_1893.field_9107 Lnet/minecraft/class_5321;
// 3f4: invokevirtual net/minecraft/class_5321.method_58273 ()Lnet/minecraft/class_5321;
// 3f7: invokeinterface net/minecraft/class_5455.method_46759 (Lnet/minecraft/class_5321;)Ljava/util/Optional; 2
// 3fc: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 3ff: checkcast net/minecraft/class_2378
// 402: getstatic net/minecraft/class_1893.field_9107 Lnet/minecraft/class_5321;
// 405: invokevirtual net/minecraft/class_5321.method_29177 ()Lnet/minecraft/class_2960;
// 408: invokeinterface net/minecraft/class_2378.method_10223 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
// 40d: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 410: dup
// 411: sipush 27799
// 414: ldc2_w 5812744265113608882
// 417: lload 1
// 418: lxor
// 419: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ql.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 421: checkcast net/minecraft/class_6880$class_6883
// 424: astore 37
// 426: lload 17
// 428: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 42b: invokevirtual net/minecraft/class_638.method_30349 ()Lnet/minecraft/class_5455;
// 42e: getstatic net/minecraft/class_1893.field_9113 Lnet/minecraft/class_5321;
// 431: invokevirtual net/minecraft/class_5321.method_58273 ()Lnet/minecraft/class_5321;
// 434: invokeinterface net/minecraft/class_5455.method_46759 (Lnet/minecraft/class_5321;)Ljava/util/Optional; 2
// 439: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 43c: checkcast net/minecraft/class_2378
// 43f: getstatic net/minecraft/class_1893.field_9113 Lnet/minecraft/class_5321;
// 442: invokevirtual net/minecraft/class_5321.method_29177 ()Lnet/minecraft/class_2960;
// 445: invokeinterface net/minecraft/class_2378.method_10223 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
// 44a: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 44d: dup
// 44e: sipush 27799
// 451: ldc2_w 5812744265113608882
// 454: lload 1
// 455: lxor
// 456: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ql.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 45e: checkcast net/minecraft/class_6880$class_6883
// 461: astore 38
// 463: aload 35
// 465: invokevirtual net/minecraft/class_9304.method_57534 ()Ljava/util/Set;
// 468: aload 36
// 46a: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
// 46f: aload 30
// 471: lload 1
// 472: lconst_0
// 473: lcmp
// 474: iflt 4aa
// 477: ifnonnull 4a8
// 47a: ifeq 49c
// 47d: goto 48a
// 480: ldc2_w -566944942712973347
// 483: lload 1
// 484: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 489: athrow
// 48a: iload 31
// 48c: aload 35
// 48e: aload 36
// 490: checkcast net/minecraft/class_6880
// 493: invokevirtual net/minecraft/class_9304.method_57536 (Lnet/minecraft/class_6880;)I
// 496: iload 34
// 498: imul
// 499: iadd
// 49a: istore 31
// 49c: aload 35
// 49e: invokevirtual net/minecraft/class_9304.method_57534 ()Ljava/util/Set;
// 4a1: aload 37
// 4a3: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
// 4a8: aload 30
// 4aa: lload 1
// 4ab: lconst_0
// 4ac: lcmp
// 4ad: iflt 4e3
// 4b0: ifnonnull 4e1
// 4b3: ifeq 4d5
// 4b6: goto 4c3
// 4b9: ldc2_w -566944942712973347
// 4bc: lload 1
// 4bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c2: athrow
// 4c3: iload 31
// 4c5: aload 35
// 4c7: aload 37
// 4c9: checkcast net/minecraft/class_6880
// 4cc: invokevirtual net/minecraft/class_9304.method_57536 (Lnet/minecraft/class_6880;)I
// 4cf: iload 33
// 4d1: imul
// 4d2: iadd
// 4d3: istore 31
// 4d5: aload 35
// 4d7: invokevirtual net/minecraft/class_9304.method_57534 ()Ljava/util/Set;
// 4da: aload 38
// 4dc: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
// 4e1: aload 30
// 4e3: ifnonnull 53f
// 4e6: ifeq 538
// 4e9: goto 4f6
// 4ec: ldc2_w -566944942712973347
// 4ef: lload 1
// 4f0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f5: athrow
// 4f6: aload 0
// 4f7: iload 14
// 4f9: iload 15
// 4fb: i2s
// 4fc: iload 16
// 4fe: invokespecial su/catlean/ql.T (ISI)Z
// 501: aload 30
// 503: lload 1
// 504: lconst_0
// 505: lcmp
// 506: iflt 541
// 509: ifnonnull 53f
// 50c: goto 519
// 50f: ldc2_w -566944942712973347
// 512: lload 1
// 513: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 518: athrow
// 519: ifeq 538
// 51c: goto 529
// 51f: ldc2_w -566944942712973347
// 522: lload 1
// 523: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 528: athrow
// 529: sipush 18458
// 52c: ldc2_w 2634289464129928793
// 52f: lload 1
// 530: lxor
// 531: invokedynamic n (IJ)I bsm=su/catlean/ql.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 536: istore 31
// 538: aload 3
// 539: getstatic net/minecraft/class_9334.field_49636 Lnet/minecraft/class_9331;
// 53c: invokevirtual net/minecraft/class_1799.method_57826 (Lnet/minecraft/class_9331;)Z
// 53f: aload 30
// 541: ifnonnull 6d0
// 544: ifeq 6ce
// 547: goto 554
// 54a: ldc2_w -566944942712973347
// 54d: lload 1
// 54e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 553: athrow
// 554: aload 3
// 555: getstatic net/minecraft/class_9334.field_49636 Lnet/minecraft/class_9331;
// 558: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
// 55b: checkcast net/minecraft/class_9285
// 55e: astore 35
// 560: aload 30
// 562: ifnonnull 59a
// 565: aload 35
// 567: dup
// 568: ifnull 58c
// 56b: goto 578
// 56e: ldc2_w -566944942712973347
// 571: lload 1
// 572: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 577: athrow
// 578: invokevirtual net/minecraft/class_9285.comp_2393 ()Ljava/util/List;
// 57b: dup
// 57c: ifnonnull 59d
// 57f: goto 58c
// 582: ldc2_w -566944942712973347
// 585: lload 1
// 586: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58b: athrow
// 58c: pop
// 58d: goto 59a
// 590: ldc2_w -566944942712973347
// 593: lload 1
// 594: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 599: athrow
// 59a: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 59d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 5a2: astore 36
// 5a4: aload 36
// 5a6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5ab: ifeq 6ce
// 5ae: aload 36
// 5b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5b5: dup
// 5b6: sipush 526
// 5b9: ldc2_w 4835990266498337834
// 5bc: lload 1
// 5bd: lxor
// 5be: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ql.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5c6: checkcast net/minecraft/class_9285$class_9287
// 5c9: astore 37
// 5cb: aload 37
// 5cd: aload 30
// 5cf: ifnonnull 655
// 5d2: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
// 5d5: getstatic net/minecraft/class_5134.field_23724 Lnet/minecraft/class_6880;
// 5d8: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5db: aload 30
// 5dd: ifnonnull 6d0
// 5e0: goto 5ed
// 5e3: ldc2_w -566944942712973347
// 5e6: lload 1
// 5e7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ec: athrow
// 5ed: ifne 653
// 5f0: goto 5fd
// 5f3: ldc2_w -566944942712973347
// 5f6: lload 1
// 5f7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5fc: athrow
// 5fd: aload 37
// 5ff: lload 1
// 600: lconst_0
// 601: lcmp
// 602: ifle 638
// 605: aload 30
// 607: ifnonnull 638
// 60a: goto 617
// 60d: ldc2_w -566944942712973347
// 610: lload 1
// 611: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 616: athrow
// 617: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
// 61a: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
// 61d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 620: lload 1
// 621: lconst_0
// 622: lcmp
// 623: iflt 5ab
// 626: ifeq 5a4
// 629: goto 636
// 62c: ldc2_w -566944942712973347
// 62f: lload 1
// 630: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 635: athrow
// 636: aload 37
// 638: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
// 63b: aload 30
// 63d: ifnonnull 658
// 640: invokevirtual net/minecraft/class_1322.comp_2450 ()Lnet/minecraft/class_1322$class_1323;
// 643: ifnull 5a4
// 646: goto 653
// 649: ldc2_w -566944942712973347
// 64c: lload 1
// 64d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 652: athrow
// 653: aload 37
// 655: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
// 658: invokevirtual net/minecraft/class_1322.comp_2449 ()D
// 65b: dstore 38
// 65d: aload 37
// 65f: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
// 662: invokevirtual net/minecraft/class_1322.comp_2450 ()Lnet/minecraft/class_1322$class_1323;
// 665: dup
// 666: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 669: getstatic su/catlean/it.l [I
// 66c: swap
// 66d: invokevirtual net/minecraft/class_1322$class_1323.ordinal ()I
// 670: iaload
// 671: tableswitch 70 1 3 27 42 61
// 68c: dload 38
// 68e: goto 6bf
// 691: ldc2_w -566944942712973347
// 694: lload 1
// 695: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69a: athrow
// 69b: dload 38
// 69d: lload 25
// 69f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6a2: aload 37
// 6a4: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
// 6a7: invokevirtual net/minecraft/class_746.method_45326 (Lnet/minecraft/class_6880;)D
// 6aa: dmul
// 6ab: goto 6bf
// 6ae: dload 38
// 6b0: iload 31
// 6b2: i2d
// 6b3: dmul
// 6b4: goto 6bf
// 6b7: new kotlin/NoWhenBranchMatchedException
// 6ba: dup
// 6bb: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 6be: athrow
// 6bf: dstore 40
// 6c1: iload 31
// 6c3: dload 40
// 6c5: d2i
// 6c6: iadd
// 6c7: istore 31
// 6c9: aload 30
// 6cb: ifnull 5a4
// 6ce: iload 31
// 6d0: ireturn
// 6d1: aload 3
// 6d2: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 6d5: aload 30
// 6d7: ifnonnull 6f7
// 6da: ifne 6f6
// 6dd: goto 6ea
// 6e0: ldc2_w -566944942712973347
// 6e3: lload 1
// 6e4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e9: athrow
// 6ea: bipush 0
// 6eb: ireturn
// 6ec: ldc2_w -566944942712973347
// 6ef: lload 1
// 6f0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f5: athrow
// 6f6: bipush -1
// 6f7: ireturn
}

private final class_1304 g(long param1, class_1799 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ql.b J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 3958632893009629470
// 09: lload 1
// 0a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 4
// 11: aload 3
// 12: getstatic net/minecraft/class_9334.field_54197 Lnet/minecraft/class_9331;
// 15: invokevirtual net/minecraft/class_1799.method_57826 (Lnet/minecraft/class_9331;)Z
// 18: aload 4
// 1a: ifnonnull 61
// 1d: ifeq 3b
// 20: goto 2d
// 23: ldc2_w 3985866477988042924
// 26: lload 1
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 30: areturn
// 31: ldc2_w 3985866477988042924
// 34: lload 1
// 35: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: athrow
// 3b: aload 3
// 3c: getstatic net/minecraft/class_9334.field_54196 Lnet/minecraft/class_9331;
// 3f: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
// 42: dup
// 43: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 46: checkcast net/minecraft/class_10192
// 49: invokevirtual net/minecraft/class_10192.comp_3174 ()Lnet/minecraft/class_1304;
// 4c: aload 4
// 4e: ifnonnull 7f
// 51: invokevirtual net/minecraft/class_1304.method_5927 ()I
// 54: goto 61
// 57: ldc2_w 3985866477988042924
// 5a: lload 1
// 5b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: athrow
// 61: tableswitch 45 0 2 27 33 39
// 7c: getstatic net/minecraft/class_1304.field_6166 Lnet/minecraft/class_1304;
// 7f: goto 91
// 82: getstatic net/minecraft/class_1304.field_6172 Lnet/minecraft/class_1304;
// 85: goto 91
// 88: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 8b: goto 91
// 8e: getstatic net/minecraft/class_1304.field_6169 Lnet/minecraft/class_1304;
// 91: areturn
}

public static final int p(long a, ql $this, class_1799 stack) {
ax = b ^ ax;
long var4 = ax ^ 127963018742281L;
return $this.U(var4, stack);
}

static {
long var20 = b ^ 68529692513286L;
long var22 = var20 ^ 133525957906815L;
long var24 = var20 ^ 38763338038612L;
long var10001 = var20 ^ 20387295808129L;
int var26 = (int)((var20 ^ 20387295808129L) >>> 32);
int var27 = (int)((var20 ^ 20387295808129L) << 32 >>> 48);
int var28 = (int)(var10001 << 48 >>> 48);
long var29 = var20 ^ 75647557962959L;
long var31 = var20 ^ 118106214793641L;
long var33 = var20 ^ 46278277315357L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[40];
int var16 = 0;
String var15 = "J±Mÿ.¼\u008c?@ `FÍ{\u001e±\u0010Ò\u0003Î7u^\u0001\u0085\u0003\u0002\"\u0082G\u0096Îè84°Ù»¸Çs¿IêG!å½}\u009d\u0080\u0082ÄM5\u007fv\u001d\u0001!¬Æ\u009fI\\sM$Ù\u000fA\u009für\u0099Û\u0086\u009es\u008c\u0012Ý\u009bX¾÷\u0094]úÆ03Wû\u0094Åø\u0006\u0001!x²®-ÇÙó\u0018\u0080f/!\u0088bÏ+é\u009e+)\u009eN¸ªì\u001cMÙ,Ç\u000eÝü\u009f\fU\u0006\u001f&\u0010\u001büÞN®\u001a;ª\u0007pP\u000f?¦k*\u0018\u0088î Õ`T\u0096ON62\\=\u0011(\u009f4¢z$±hïÀ8rðÇ\u0014¡ô\u0014î<¾B\u0082\u0089\u0013Ât\r3Aý#AÕ\u0005fÖ¤[ÌÙ\u009aR\fv°\u0094è\u0007ã\u0002~^\t?vK\u0095¿al/\u0082\u0002p\u009bñ\u0010Þ\u008cÁ¬§\u0010<\u0089«øµa\n\u008cÉÕ\u0010¨,\u0088S8öÒ\u001eè\te\"-\u009aÒ.(\u0099\n8\u00894BÏCÙpÕà\u001a\u0098ÂráÎê+]\u000eòNÂÛûx¾Am.Ó5Ú ZHF¡0¤q2Eo>Ô\u00173§ò\u008aÛ\u0096¸!çç&\\ý\u001e~\u0093êS\u001cÆ\r\u009f@aÜÔ#\u000f³f\u0091\u0007Pm\u0087oõ\u008f¼\u0086\u0018ô{êï~aµPÙ\u0011ðV|[\nþà:AY£\u0016Ð\u0001\u0010ËDn«iE¯L\u008d1\u009aÑrk;¥\u00182'B\u0006\u0012\u008bÌ\u009a\u0014=(Ê| \u0085\u009b\u00ad\u009e\u0086g\u0007NÄg ÈÛ\"R\u0001L!&3\u0010:Ø\u0012êÙÁå~Êp®é\u0081\u0095ÇCY\u009a @\u001b8\u0010\u0082÷\u0001Ø\u001dùTIÌ\\\u0092\u008fª\u0087û(\u0010Àï\u001dê\u009d|\u001c\u0007\u0092¬Ícx\nü} s~i\u0007\\:DÙ\rË¢a7ÊN\u0081\u0094ï\u007fK\u0011\"\u0086¢\t}\u0012\u0004N\u0089\u0084Ð0G.ü\u0089\u008aé3áI\u00169÷\u008e\u0081\u008d\u0095!\u008eO\u009f&^×ï\fn'ø¬\u001cÂÀmñª\u0093ñ«Rü%íµ/ÿ_\u0096\u0018  ¤Ý\u0011Ä\u001aïã¨MAÚ\u0005Æ~YÔCZ\u0099°ÅÕ\u0000ê%uÇ\u009ffÇ\u0089\u0010O©\u0003\bf\u001eµ\u008f\u000b\f½´\u0016r¥&(\u0016ÀN\u0006§ç0uN~à\u0006\u0099!+qîyA3\u0094\u0004b\u000bBZ\u0086\u0090ï¤ø)tA\u001f\u008f\u0091&´2 E\u001d\u0005ìM\u001c\u0003ªEÙÕú7N;Ød\u000fs;\u0096\u0094Í\u0095éJv`>Óÿ\" ¥\u0003íT\t\u00817uè\u0003Ï×ïPTÊ¶>y\u009c\u0012¡øûöó\u0099Oï\u0090\n|(ß\u008d\"s\u0091\u0096480æ,¥aN¯ßËUî\u0087Y\u0099Å=¼G6¼\u009f{¡£\u0093Jn\u0007ý©\u008db\u0018\u0014h>r\u0096Î\u001c\u001b¼\u0006\u0005<àG7!\u009a,If+ì{¼\u0018R»\u0089.[\u001e_«¦p\u000fmpóù5\n'ä\u0080\u0019\u0090Ê¡\u0010\u0000\u008e\u009a´¼¯gx\t,N_\u0081]\u0005± «\u009e5h\u008e\u0006B¦[v\u000e\u0088\u009aõ](DyýH\u0091Õ[ø9y\u0084r\u009d[®¥\u0010\u008cD'\u001cH-Cmá\u001c9²0'<{ +LÀ»\u0011\u0018K9¹Ül B®>´¦ø±±vJ\u000bÒ\u007fòÝqx\u0084Ì8\u0018L#²+Î\u0016âäèÙ\u0090y\u009a\u0000\u000b\u0094!À2ü\u0002\u00121Ø\u0010\u0010RðÁ,NØ)ãïõ¾Q}eº@\u000b\u0084,ZäY»Ý=\u0085vKæ\u0015\u0091='\u009dÙÙ\u0099Ç\u0004iå\u008b\u0082\b\\à\u0085ëèfÃV g±»c\u0004ìß\u0097TQ\u0003nÉ¨>Ñ\u0086\u0092QòqôÖ\u008aîÌw \u0084±Ó^s©=¡\u000b¼RHä[\u0018\u009bS;8²Þ\u0002ZÉ\u009eg¹^*G¤\u00968\u0093A\u001eh¶0Ð\u001c?7NÐ\u0098Õz\u000eÈ\u000bd\u0090ÌJ\u008cd\u0010îFÊ\u000e]Im\u008c&sT\u0082æ\u001a¼1\u008c·d\u0004¡Îho\u0002\"Gv+þ\u008d\u0018¸¹\u0080UÐ\u007f\u0089ò'(\u001e \u0000\u0014µû¯\u0004ÜLøÿ\u0082¢\u0010Ö\u001eQÛMÍhA±\u009aÉ\u001a\u009cìX\u0099";
int var17 = "J±Mÿ.¼\u008c?@ `FÍ{\u001e±\u0010Ò\u0003Î7u^\u0001\u0085\u0003\u0002\"\u0082G\u0096Îè84°Ù»¸Çs¿IêG!å½}\u009d\u0080\u0082ÄM5\u007fv\u001d\u0001!¬Æ\u009fI\\sM$Ù\u000fA\u009für\u0099Û\u0086\u009es\u008c\u0012Ý\u009bX¾÷\u0094]úÆ03Wû\u0094Åø\u0006\u0001!x²®-ÇÙó\u0018\u0080f/!\u0088bÏ+é\u009e+)\u009eN¸ªì\u001cMÙ,Ç\u000eÝü\u009f\fU\u0006\u001f&\u0010\u001büÞN®\u001a;ª\u0007pP\u000f?¦k*\u0018\u0088î Õ`T\u0096ON62\\=\u0011(\u009f4¢z$±hïÀ8rðÇ\u0014¡ô\u0014î<¾B\u0082\u0089\u0013Ât\r3Aý#AÕ\u0005fÖ¤[ÌÙ\u009aR\fv°\u0094è\u0007ã\u0002~^\t?vK\u0095¿al/\u0082\u0002p\u009bñ\u0010Þ\u008cÁ¬§\u0010<\u0089«øµa\n\u008cÉÕ\u0010¨,\u0088S8öÒ\u001eè\te\"-\u009aÒ.(\u0099\n8\u00894BÏCÙpÕà\u001a\u0098ÂráÎê+]\u000eòNÂÛûx¾Am.Ó5Ú ZHF¡0¤q2Eo>Ô\u00173§ò\u008aÛ\u0096¸!çç&\\ý\u001e~\u0093êS\u001cÆ\r\u009f@aÜÔ#\u000f³f\u0091\u0007Pm\u0087oõ\u008f¼\u0086\u0018ô{êï~aµPÙ\u0011ðV|[\nþà:AY£\u0016Ð\u0001\u0010ËDn«iE¯L\u008d1\u009aÑrk;¥\u00182'B\u0006\u0012\u008bÌ\u009a\u0014=(Ê| \u0085\u009b\u00ad\u009e\u0086g\u0007NÄg ÈÛ\"R\u0001L!&3\u0010:Ø\u0012êÙÁå~Êp®é\u0081\u0095ÇCY\u009a @\u001b8\u0010\u0082÷\u0001Ø\u001dùTIÌ\\\u0092\u008fª\u0087û(\u0010Àï\u001dê\u009d|\u001c\u0007\u0092¬Ícx\nü} s~i\u0007\\:DÙ\rË¢a7ÊN\u0081\u0094ï\u007fK\u0011\"\u0086¢\t}\u0012\u0004N\u0089\u0084Ð0G.ü\u0089\u008aé3áI\u00169÷\u008e\u0081\u008d\u0095!\u008eO\u009f&^×ï\fn'ø¬\u001cÂÀmñª\u0093ñ«Rü%íµ/ÿ_\u0096\u0018  ¤Ý\u0011Ä\u001aïã¨MAÚ\u0005Æ~YÔCZ\u0099°ÅÕ\u0000ê%uÇ\u009ffÇ\u0089\u0010O©\u0003\bf\u001eµ\u008f\u000b\f½´\u0016r¥&(\u0016ÀN\u0006§ç0uN~à\u0006\u0099!+qîyA3\u0094\u0004b\u000bBZ\u0086\u0090ï¤ø)tA\u001f\u008f\u0091&´2 E\u001d\u0005ìM\u001c\u0003ªEÙÕú7N;Ød\u000fs;\u0096\u0094Í\u0095éJv`>Óÿ\" ¥\u0003íT\t\u00817uè\u0003Ï×ïPTÊ¶>y\u009c\u0012¡øûöó\u0099Oï\u0090\n|(ß\u008d\"s\u0091\u0096480æ,¥aN¯ßËUî\u0087Y\u0099Å=¼G6¼\u009f{¡£\u0093Jn\u0007ý©\u008db\u0018\u0014h>r\u0096Î\u001c\u001b¼\u0006\u0005<àG7!\u009a,If+ì{¼\u0018R»\u0089.[\u001e_«¦p\u000fmpóù5\n'ä\u0080\u0019\u0090Ê¡\u0010\u0000\u008e\u009a´¼¯gx\t,N_\u0081]\u0005± «\u009e5h\u008e\u0006B¦[v\u000e\u0088\u009aõ](DyýH\u0091Õ[ø9y\u0084r\u009d[®¥\u0010\u008cD'\u001cH-Cmá\u001c9²0'<{ +LÀ»\u0011\u0018K9¹Ül B®>´¦ø±±vJ\u000bÒ\u007fòÝqx\u0084Ì8\u0018L#²+Î\u0016âäèÙ\u0090y\u009a\u0000\u000b\u0094!À2ü\u0002\u00121Ø\u0010\u0010RðÁ,NØ)ãïõ¾Q}eº@\u000b\u0084,ZäY»Ý=\u0085vKæ\u0015\u0091='\u009dÙÙ\u0099Ç\u0004iå\u008b\u0082\b\\à\u0085ëèfÃV g±»c\u0004ìß\u0097TQ\u0003nÉ¨>Ñ\u0086\u0092QòqôÖ\u008aîÌw \u0084±Ó^s©=¡\u000b¼RHä[\u0018\u009bS;8²Þ\u0002ZÉ\u009eg¹^*G¤\u00968\u0093A\u001eh¶0Ð\u001c?7NÐ\u0098Õz\u000eÈ\u000bd\u0090ÌJ\u008cd\u0010îFÊ\u000e]Im\u008c&sT\u0082æ\u001a¼1\u008c·d\u0004¡Îho\u0002\"Gv+þ\u008d\u0018¸¹\u0080UÐ\u007f\u0089ò'(\u001e \u0000\u0014µû¯\u0004ÜLøÿ\u0082¢\u0010Ö\u001eQÛMÍhA±\u009aÉ\u001a\u009cìX\u0099"
.length();
char var14 = 16;
int var38 = -1;

label54:
while (true) {
String var40 = var15.substring(++var38, var38 + var14);
byte var44 = -1;

while (true) {
byte[] var19 = var11.doFinal(var40.getBytes("ISO-8859-1"));
String var52 = b(var19).intern();
switch (var44) {
case 0:
var18[var16++] = var52;
if ((var38 += var14) >= var17) {
c = var18;
d = new String[40];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[25];
int var3 = 0;
String var4 = "[ý9\u00054÷\u0017Ô\u0094\fãé,\u0002UéÜ\u0000\\\u0092\u0004\u009f[É¿°&\u009c÷³í\r\u001cG7\u0097\u0018¾>¥\u001d\u0015Ñ\u001aÙ4\u0093å\u0082\u0005 µâÖô>ÏË\u0010ùßQ\u0011xf\u008dïwÑ·³wø^®o&jpÑ0Ð\u0001Z\u0082èæ\u0082é|·\u00101ð\u001d\u0010\u001f!Å|\u009b,YíQ[\u00adÌ^\r\u0094¸¤\u007fgx\u0015ö#\u009e©æ·õ\u0085/§\u0090<$*S\u000e¤ÃþÂ\u0006\u001by\u0002_,2\u000e\u0098L¸p<è°Ï\u0084\r]Wì~-\u007fk-\u008bíÜ\u009e óf¾ÖG eÓ\u0018\b]Í~>m|";
int var5 = "[ý9\u00054÷\u0017Ô\u0094\fãé,\u0002UéÜ\u0000\\\u0092\u0004\u009f[É¿°&\u009c÷³í\r\u001cG7\u0097\u0018¾>¥\u001d\u0015Ñ\u001aÙ4\u0093å\u0082\u0005 µâÖô>ÏË\u0010ùßQ\u0011xf\u008dïwÑ·³wø^®o&jpÑ0Ð\u0001Z\u0082èæ\u0082é|·\u00101ð\u001d\u0010\u001f!Å|\u009b,YíQ[\u00adÌ^\r\u0094¸¤\u007fgx\u0015ö#\u009e©æ·õ\u0085/§\u0090<$*S\u000e¤ÃþÂ\u0006\u001by\u0002_,2\u000e\u0098L¸p<è°Ï\u0084\r]Wì~-\u007fk-\u008bíÜ\u009e óf¾ÖG eÓ\u0018\b]Í~>m|"
.length();
byte var2 = 0;

label36:
while (true) {
byte var48 = var2;
var2 += 8;
byte[] var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
long[] var43 = var6;
int var49 = var3++;
long var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var59 = -1;

while (true) {
long var8 = var56;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var61 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var59) {
case 0:
var43[var49] = var61;
if (var2 >= var5) {
f = var6;
g = new Integer[25];
KProperty[] var35 = new KProperty[c<"n">(31087, 4471601344668512403L ^ var20)];
var35[0] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(22927, 8391500401543882795L ^ var20), b<"t">(15563, 4593065528314842465L ^ var20), 0)
);
var35[1] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(12776, 5813991963867988047L ^ var20), b<"t">(2396, 3233325637251725535L ^ var20), 0)
);
var35[2] = Reflection.property1(new PropertyReference1Impl(ql.class, b<"t">(913, 7897778497936093733L ^ var20), b<"t">(3923, 3800796337223794421L ^ var20), 0));
var35[3] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(15619, 5606374957608619139L ^ var20), b<"t">(22378, 257505214864762584L ^ var20), 0)
);
var35[4] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(12810, 4065512915567788988L ^ var20), b<"t">(24984, 4188888390286217241L ^ var20), 0)
);
var35[5] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(26829, 6156860908101441901L ^ var20), b<"t">(19862, 1371231628907068449L ^ var20), 0)
);
var35[c<"n">(23285, 4718994426987090719L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(2809, 2881350251669126011L ^ var20), b<"t">(32165, 4282449623774956573L ^ var20), 0)
);
var35[c<"n">(31815, 8868983991654692284L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(14506, 1826905903676377351L ^ var20), b<"t">(6239, 668176643466914282L ^ var20), 0)
);
var35[c<"n">(10331, 7536087675269276093L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(1429, 12826386851558458L ^ var20), b<"t">(17175, 8242515604868018876L ^ var20), 0)
);
var35[c<"n">(32707, 3435698588419405348L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(10007, 2980544188727350957L ^ var20), b<"t">(25372, 1390553969687106239L ^ var20), 0)
);
var35[c<"n">(32521, 7242166548723742448L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(ql.class, b<"t">(25250, 7152828116079481607L ^ var20), b<"t">(31510, 4106094894039796415L ^ var20), 0)
);
C = var35;
k = new ql(var26, var27, (short)var28);
I = yp.L(k, b<"t">(8373, 2872172594916020505L ^ var20), d9.PROTECTION, null, null, c<"n">(14082, 5190036998248267504L ^ var20), null, var33);
D = yp.L(k, b<"t">(10412, 2427009434678614295L ^ var20), d9.PROTECTION, null, null, c<"n">(22941, 842654350328991870L ^ var20), null, var33);
F = yp.L(k, b<"t">(22300, 6352842357871355545L ^ var20), d9.PROTECTION, null, null, c<"n">(22941, 842654350328991870L ^ var20), null, var33);
L = yp.L(k, b<"t">(8850, 3223690112061395759L ^ var20), d9.PROTECTION, null, null, c<"n">(22941, 842654350328991870L ^ var20), null, var33);
S = yp.L(k, b<"t">(9577, 5972196408806593754L ^ var20), mb.IGNORE, null, null, c<"n">(22941, 842654350328991870L ^ var20), null, var33);
a = yp.L(
k,
b<"t">(16718, 2604833685870915814L ^ var20),
1,
new IntRange(0, c<"n">(32521, 7242166548723742448L ^ var20)),
var29,
null,
null,
c<"n">(16507, 9196733045999045012L ^ var20),
null
);
V = yp.t(k, b<"t">(31826, 8019833758775938556L ^ var20), false, var31, null, null, c<"n">(22941, 842654350328991870L ^ var20), null);
U = yp.t(k, b<"t">(18865, 3784358007311939592L ^ var20), false, var31, null, null, c<"n">(22941, 842654350328991870L ^ var20), null);
x = yp.t(k, b<"t">(31339, 141564262609226698L ^ var20), false, var31, null, null, c<"n">(22941, 842654350328991870L ^ var20), null);
y = yp.t(k, b<"t">(25827, 5491369594631427431L ^ var20), true, var31, null, null, c<"n">(22941, 842654350328991870L ^ var20), null);
n = yp.t(k, b<"t">(4177, 3564763237527282158L ^ var20), false, var31, null, null, c<"n">(22941, 842654350328991870L ^ var20), null);
m = new i9(var22);
K = new i9(var22);
o0[] var39 = new o0[]{
new o0(var24, class_1304.field_6166, c<"n">(25382, 3594629130920241867L ^ var20), -1, -1, -1),
new o0(var24, class_1304.field_6172, c<"n">(17990, 2450246843296321454L ^ var20), -1, -1, -1),
new o0(var24, class_1304.field_6174, c<"n">(16646, 2934882377696217314L ^ var20), -1, -1, -1),
new o0(var24, class_1304.field_6169, c<"n">(800, 1450470280470153931L ^ var20), -1, -1, -1)
};
T = CollectionsKt.listOf(var39);
return;
}
break;
default:
var43[var49] = var61;
if (var2 < var5) {
continue label36;
}

var4 = "l\u0096\tyziW\u0000\u009c\u008f¸\u0019xöå\u0087";
var5 = "l\u0096\tyziW\u0000\u009c\u008f¸\u0019xöå\u0087".length();
var2 = 0;
}

byte var50 = var2;
var2 += 8;
var7 = var4.substring(var50, var2).getBytes("ISO-8859-1");
var43 = var6;
var49 = var3++;
var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var59 = 0;
}
}
}

var14 = var15.charAt(var38);
break;
default:
var18[var16++] = var52;
if ((var38 += var14) < var17) {
var14 = var15.charAt(var38);
continue label54;
}

var15 = ",ë\u0096¿l.\u0086Ñ\u001c\u0091h\u0012Mú\u0080®\u0002\u009f;H=V³6\u0006µ¹²7{\u0090Ï\u0018Ã¶\u001d!µw6îÔFÅ\u0099@\u0081\u0003û\u0016ë×Éõ¯\u0006·";
var17 = ",ë\u0096¿l.\u0086Ñ\u001c\u0091h\u0012Mú\u0080®\u0002\u009f;H=V³6\u0006µ¹²7{\u0090Ï\u0018Ã¶\u001d!µw6îÔFÅ\u0099@\u0081\u0003û\u0016ë×Éõ¯\u0006·"
.length();
var14 = ' ';
var38 = -1;
}

var40 = var15.substring(++var38, var38 + var14);
var44 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14043;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ql", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/ql" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 3729;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ql", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/ql" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
