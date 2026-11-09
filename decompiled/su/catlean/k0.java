package su.catlean;

import java.awt.Color;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_238;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class k0 extends _g {
@NotNull
public static final k0 T;
static final KProperty[] c;
@NotNull
private static final cw x;
@NotNull
private static final c8 S;
@NotNull
private static final c8 L;
@NotNull
private static final ct U;
@NotNull
private static final cq e;
@NotNull
private static final cs K;
@NotNull
private static final cs y;
@NotNull
private static final cq n;
@NotNull
private static final ct j;
@NotNull
private static final ct m;
@NotNull
private static final c8 C;
private static final long a = yz.a(4696067619984066282L, 3508764399116935613L, MethodHandles.lookup().lookupClass()).a(86927432214438L);
private static final String[] b;
private static final String[] d;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private k0(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 20161706846849L;
super(b<"x">(3407, 893836602524277190L ^ var1), jt.z(), null, 4, null, var3);
}

private final xh C(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 109137939578645L;
return (xh)x.E(this, var3, c[0]);
}

public final int R(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 32320452226181L;
return ((Number)S.E(this, var3, c[1])).intValue();
}

public final int g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 32100562681570L;
String[] var5 = vm.a<"Å">(8319483437292713775L, var1);

try {
int var10000 = ((Number)L.E(this, var3, c[2])).intValue();
if (vm.a<"Å">(8338358956359707942L, var1) != null) {
vm.a<"Å">(new String[3], 8306382964690499827L, var1);
}

return var10000;
} catch (NoWhenBranchMatchedException var6) {
throw vm.a<"Å">(var6, 8291772383051250796L, var1);
}
}

private final float P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 6705944873178L;
return ((Number)U.E(this, var3, c[3])).floatValue();
}

private final boolean Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 75912552447310L;
return (Boolean)e.E(this, var3, c[4]);
}

private final Color L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 105134418925179L;
return (Color)K.E(this, var3, c[5]);
}

private final Color E(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 59847634365936L;
return (Color)y.E(this, var6, c[c<"z">(25404, 7320888781268194067L ^ var4)]);
}

private final boolean H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 747720136327L;
return (Boolean)n.E(this, var3, c[c<"z">(13687, 3507692635436465709L ^ var1)]);
}

private final float G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 29867013334894L;
return ((Number)j.E(this, var3, c[c<"z">(29127, 31268402869291903L ^ var1)])).floatValue();
}

private final float Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 10868300978721L;
return ((Number)m.E(this, var3, c[c<"z">(13148, 5589352661837378738L ^ var1)])).floatValue();
}

private final int a(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 71502676282775L;
return ((Number)C.E(this, var3, c[c<"z">(29573, 413955582716273600L ^ var1)])).intValue();
}

@Flow
private final void z(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k0.a J
// 003: ldc2_w 17887529718277
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 95232918640347
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 1930010073892
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 73435133443861
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 94799660371201
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 10307243347497
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 124430879667454
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 16608614320250
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 32843788384659
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 45024590435411
// 045: lxor
// 046: lstore 20
// 048: dup2
// 049: ldc2_w 7738682747324
// 04c: lxor
// 04d: dup2
// 04e: bipush 48
// 050: lushr
// 051: l2i
// 052: istore 22
// 054: dup2
// 055: bipush 16
// 057: lshl
// 058: bipush 32
// 05a: lushr
// 05b: l2i
// 05c: istore 23
// 05e: dup2
// 05f: bipush 48
// 061: lshl
// 062: bipush 48
// 064: lushr
// 065: l2i
// 066: istore 24
// 068: pop2
// 069: dup2
// 06a: ldc2_w 56929072292116
// 06d: lxor
// 06e: lstore 25
// 070: dup2
// 071: ldc2_w 113155774854129
// 074: lxor
// 075: dup2
// 076: bipush 16
// 078: lushr
// 079: lstore 27
// 07b: dup2
// 07c: bipush 48
// 07e: lshl
// 07f: bipush 48
// 081: lushr
// 082: l2i
// 083: istore 29
// 085: pop2
// 086: dup2
// 087: ldc2_w 126863685030248
// 08a: lxor
// 08b: lstore 30
// 08d: dup2
// 08e: ldc2_w 18374537137000
// 091: lxor
// 092: lstore 32
// 094: pop2
// 095: ldc2_w -3516545202116932759
// 098: lload 2
// 099: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: astore 34
// 0a0: aload 0
// 0a1: aload 34
// 0a3: ifnonnull 0cc
// 0a6: lload 25
// 0a8: invokespecial su/catlean/k0.C (J)Lsu/catlean/xh;
// 0ab: getstatic su/catlean/xh.BLOOM Lsu/catlean/xh;
// 0ae: if_acmpne 0d6
// 0b1: goto 0be
// 0b4: ldc2_w -3507092644141645782
// 0b7: lload 2
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: aload 0
// 0bf: goto 0cc
// 0c2: ldc2_w -3507092644141645782
// 0c5: lload 2
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: aload 1
// 0cd: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 0d0: lload 14
// 0d2: invokespecial su/catlean/k0.y (Lnet/minecraft/class_4587;J)V
// 0d5: return
// 0d6: getstatic su/catlean/wc.g Lsu/catlean/wc;
// 0d9: lload 30
// 0db: invokevirtual su/catlean/wc.b (J)Ljava/util/List;
// 0de: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0e3: astore 35
// 0e5: aload 35
// 0e7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ec: ifeq 275
// 0ef: aload 35
// 0f1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0f6: checkcast su/catlean/z7
// 0f9: astore 36
// 0fb: aload 36
// 0fd: aload 0
// 0fe: lload 4
// 100: invokespecial su/catlean/k0.P (J)F
// 103: lload 12
// 105: invokevirtual su/catlean/z7.g (FJ)Lnet/minecraft/class_238;
// 108: astore 37
// 10a: aload 36
// 10c: invokevirtual su/catlean/z7.s ()Lsu/catlean/ld;
// 10f: getstatic su/catlean/ld.UNSAFE Lsu/catlean/ld;
// 112: if_acmpne 12b
// 115: aload 0
// 116: lload 27
// 118: iload 29
// 11a: i2c
// 11b: invokespecial su/catlean/k0.E (JC)Ljava/awt/Color;
// 11e: goto 131
// 121: ldc2_w -3507092644141645782
// 124: lload 2
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: aload 0
// 12c: lload 16
// 12e: invokespecial su/catlean/k0.L (J)Ljava/awt/Color;
// 131: astore 38
// 133: aload 0
// 134: lload 25
// 136: invokespecial su/catlean/k0.C (J)Lsu/catlean/xh;
// 139: getstatic su/catlean/xz.h [I
// 13c: swap
// 13d: invokevirtual su/catlean/xh.ordinal ()I
// 140: iaload
// 141: aload 34
// 143: ifnonnull 19d
// 146: tableswitch 289 1 6 48 90 121 150 206 288
// 16c: ldc2_w -3507092644141645782
// 16f: lload 2
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: lload 6
// 178: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 17b: aload 37
// 17d: aload 0
// 17e: lload 20
// 180: aload 37
// 182: aload 38
// 184: bipush 0
// 185: bipush 4
// 186: aconst_null
// 187: invokestatic su/catlean/k0.t (Lsu/catlean/k0;JLnet/minecraft/class_238;Ljava/awt/Color;IILjava/lang/Object;)Ljava/awt/Color;
// 18a: aconst_null
// 18b: bipush 4
// 18c: aconst_null
// 18d: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 190: goto 19d
// 193: ldc2_w -3507092644141645782
// 196: lload 2
// 197: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: athrow
// 19d: goto 26f
// 1a0: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1a3: aload 37
// 1a5: aload 0
// 1a6: lload 20
// 1a8: aload 37
// 1aa: aload 38
// 1ac: bipush 0
// 1ad: bipush 4
// 1ae: aconst_null
// 1af: invokestatic su/catlean/k0.t (Lsu/catlean/k0;JLnet/minecraft/class_238;Ljava/awt/Color;IILjava/lang/Object;)Ljava/awt/Color;
// 1b2: lload 10
// 1b4: dup2_x1
// 1b5: pop2
// 1b6: aconst_null
// 1b7: bipush 4
// 1b8: aconst_null
// 1b9: invokestatic su/catlean/zi.g (Lsu/catlean/zi;Lnet/minecraft/class_238;JLjava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 1bc: goto 26f
// 1bf: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1c2: lload 32
// 1c4: aload 37
// 1c6: aload 0
// 1c7: lload 20
// 1c9: aload 37
// 1cb: aload 38
// 1cd: bipush 0
// 1ce: bipush 4
// 1cf: aconst_null
// 1d0: invokestatic su/catlean/k0.t (Lsu/catlean/k0;JLnet/minecraft/class_238;Ljava/awt/Color;IILjava/lang/Object;)Ljava/awt/Color;
// 1d3: aconst_null
// 1d4: bipush 4
// 1d5: aconst_null
// 1d6: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 1d9: goto 26f
// 1dc: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1df: lload 32
// 1e1: aload 37
// 1e3: aload 0
// 1e4: lload 20
// 1e6: aload 37
// 1e8: aload 38
// 1ea: bipush 0
// 1eb: bipush 4
// 1ec: aconst_null
// 1ed: invokestatic su/catlean/k0.t (Lsu/catlean/k0;JLnet/minecraft/class_238;Ljava/awt/Color;IILjava/lang/Object;)Ljava/awt/Color;
// 1f0: aconst_null
// 1f1: bipush 4
// 1f2: aconst_null
// 1f3: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 1f6: pop
// 1f7: lload 6
// 1f9: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1fc: aload 37
// 1fe: aload 0
// 1ff: lload 20
// 201: aload 37
// 203: aload 38
// 205: bipush 0
// 206: bipush 4
// 207: aconst_null
// 208: invokestatic su/catlean/k0.t (Lsu/catlean/k0;JLnet/minecraft/class_238;Ljava/awt/Color;IILjava/lang/Object;)Ljava/awt/Color;
// 20b: aconst_null
// 20c: bipush 4
// 20d: aconst_null
// 20e: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 211: goto 26f
// 214: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 217: aload 37
// 219: aload 0
// 21a: aload 37
// 21c: aload 38
// 21e: lload 8
// 220: sipush 15966
// 223: ldc2_w 2853948820688593207
// 226: lload 2
// 227: lxor
// 228: invokedynamic z (IJ)I bsm=su/catlean/k0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: invokespecial su/catlean/k0.q (Lnet/minecraft/class_238;Ljava/awt/Color;JI)Ljava/awt/Color;
// 230: aload 0
// 231: aload 37
// 233: aload 38
// 235: lload 8
// 237: bipush 0
// 238: invokespecial su/catlean/k0.q (Lnet/minecraft/class_238;Ljava/awt/Color;JI)Ljava/awt/Color;
// 23b: lload 18
// 23d: dup2_x1
// 23e: pop2
// 23f: invokevirtual su/catlean/zi.F (Lnet/minecraft/class_238;Ljava/awt/Color;JLjava/awt/Color;)Z
// 242: pop
// 243: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 246: iload 22
// 248: i2c
// 249: aload 37
// 24b: iload 23
// 24d: iload 24
// 24f: i2s
// 250: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 253: aload 0
// 254: lload 20
// 256: aload 37
// 258: aload 38
// 25a: bipush 0
// 25b: bipush 4
// 25c: aconst_null
// 25d: invokestatic su/catlean/k0.t (Lsu/catlean/k0;JLnet/minecraft/class_238;Ljava/awt/Color;IILjava/lang/Object;)Ljava/awt/Color;
// 260: invokevirtual su/catlean/zi.c (CLnet/minecraft/class_238;ISLnet/minecraft/class_2350;Ljava/awt/Color;)Z
// 263: goto 26f
// 266: return
// 267: new kotlin/NoWhenBranchMatchedException
// 26a: dup
// 26b: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 26e: athrow
// 26f: pop
// 270: aload 34
// 272: ifnull 0e5
// 275: return
}

private final void y(class_4587 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k0.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 137155931519922
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 119697518493312
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 109016476789883
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 117003749712093
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 48155625880525
// 027: lxor
// 028: lstore 12
// 02a: dup2
// 02b: ldc2_w 125266712056116
// 02e: lxor
// 02f: lstore 14
// 031: dup2
// 032: ldc2_w 56211253536370
// 035: lxor
// 036: lstore 16
// 038: dup2
// 039: ldc2_w 86800978452573
// 03c: lxor
// 03d: lstore 18
// 03f: dup2
// 040: ldc2_w 111300216980609
// 043: lxor
// 044: dup2
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 20
// 04b: dup2
// 04c: bipush 16
// 04e: lshl
// 04f: bipush 32
// 051: lushr
// 052: l2i
// 053: istore 21
// 055: dup2
// 056: bipush 48
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 22
// 05f: pop2
// 060: dup2
// 061: ldc2_w 58663261052961
// 064: lxor
// 065: lstore 23
// 067: dup2
// 068: ldc2_w 101273502594452
// 06b: lxor
// 06c: lstore 25
// 06e: dup2
// 06f: ldc2_w 35720235803841
// 072: lxor
// 073: lstore 27
// 075: dup2
// 076: ldc2_w 1441348698358
// 079: lxor
// 07a: lstore 29
// 07c: dup2
// 07d: ldc2_w 20562137103368
// 080: lxor
// 081: lstore 31
// 083: dup2
// 084: ldc2_w 35183038678374
// 087: lxor
// 088: lstore 33
// 08a: dup2
// 08b: ldc2_w 117332728819726
// 08e: lxor
// 08f: lstore 35
// 091: dup2
// 092: ldc2_w 130780971020460
// 095: lxor
// 096: lstore 37
// 098: dup2
// 099: ldc2_w 101886381988778
// 09c: lxor
// 09d: dup2
// 09e: bipush 16
// 0a0: lushr
// 0a1: lstore 39
// 0a3: dup2
// 0a4: bipush 48
// 0a6: lshl
// 0a7: bipush 48
// 0a9: lushr
// 0aa: l2i
// 0ab: istore 41
// 0ad: pop2
// 0ae: dup2
// 0af: ldc2_w 65337635929988
// 0b2: lxor
// 0b3: lstore 42
// 0b5: dup2
// 0b6: ldc2_w 80408846350643
// 0b9: lxor
// 0ba: lstore 44
// 0bc: dup2
// 0bd: ldc2_w 23511975852445
// 0c0: lxor
// 0c1: lstore 46
// 0c3: pop2
// 0c4: new su/catlean/g7
// 0c7: dup
// 0c8: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 0cb: dup
// 0cc: sipush 32537
// 0cf: ldc2_w 5096485538944235270
// 0d2: lload 2
// 0d3: lxor
// 0d4: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/k0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0dc: sipush 6206
// 0df: ldc2_w 365161762103783193
// 0e2: lload 2
// 0e3: lxor
// 0e4: invokedynamic z (IJ)I bsm=su/catlean/k0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: getstatic su/catlean/wc.g Lsu/catlean/wc;
// 0ec: lload 44
// 0ee: invokevirtual su/catlean/wc.b (J)Ljava/util/List;
// 0f1: invokeinterface java/util/List.size ()I 1
// 0f6: imul
// 0f7: bipush 0
// 0f8: bipush 4
// 0f9: aconst_null
// 0fa: astore 48
// 0fc: istore 49
// 0fe: istore 50
// 100: istore 51
// 102: astore 52
// 104: lload 27
// 106: aload 52
// 108: iload 51
// 10a: iload 50
// 10c: iload 49
// 10e: aload 48
// 110: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 113: astore 54
// 115: new net/minecraft/class_4587
// 118: dup
// 119: invokespecial net/minecraft/class_4587.<init> ()V
// 11c: astore 55
// 11e: new org/joml/Quaternionf
// 121: dup
// 122: invokespecial org/joml/Quaternionf.<init> ()V
// 125: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 128: invokevirtual su/catlean/zi.x ()F
// 12b: fneg
// 12c: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 12f: invokevirtual su/catlean/zi.F ()F
// 132: fconst_0
// 133: invokevirtual org/joml/Quaternionf.rotateYXZ (FFF)Lorg/joml/Quaternionf;
// 136: astore 56
// 138: ldc2_w 7451630567334863666
// 13b: lload 2
// 13c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: aload 55
// 143: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 146: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 149: invokevirtual su/catlean/zi.F ()F
// 14c: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 151: dup
// 152: sipush 18066
// 155: ldc2_w 2432592988380597939
// 158: lload 2
// 159: lxor
// 15a: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/k0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 162: checkcast org/joml/Quaternionfc
// 165: lload 42
// 167: dup2_x1
// 168: pop2
// 169: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 16c: aload 55
// 16e: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 171: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 174: invokevirtual su/catlean/zi.b ()F
// 177: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 17c: dup
// 17d: sipush 5135
// 180: ldc2_w 7910020221705083952
// 183: lload 2
// 184: lxor
// 185: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/k0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 18d: checkcast org/joml/Quaternionfc
// 190: lload 42
// 192: dup2_x1
// 193: pop2
// 194: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 197: astore 53
// 199: getstatic su/catlean/wc.g Lsu/catlean/wc;
// 19c: lload 44
// 19e: invokevirtual su/catlean/wc.b (J)Ljava/util/List;
// 1a1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 1a6: astore 57
// 1a8: aload 57
// 1aa: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1af: ifeq 662
// 1b2: aload 57
// 1b4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1b9: checkcast su/catlean/z7
// 1bc: astore 58
// 1be: aload 58
// 1c0: aload 0
// 1c1: lload 6
// 1c3: invokespecial su/catlean/k0.P (J)F
// 1c6: lload 16
// 1c8: invokevirtual su/catlean/z7.g (FJ)Lnet/minecraft/class_238;
// 1cb: astore 59
// 1cd: aload 58
// 1cf: invokevirtual su/catlean/z7.s ()Lsu/catlean/ld;
// 1d2: getstatic su/catlean/ld.UNSAFE Lsu/catlean/ld;
// 1d5: if_acmpne 1ee
// 1d8: aload 0
// 1d9: lload 39
// 1db: iload 41
// 1dd: i2c
// 1de: invokespecial su/catlean/k0.E (JC)Ljava/awt/Color;
// 1e1: goto 1f4
// 1e4: ldc2_w 7426285780241606769
// 1e7: lload 2
// 1e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ed: athrow
// 1ee: aload 0
// 1ef: lload 23
// 1f1: invokespecial su/catlean/k0.L (J)Ljava/awt/Color;
// 1f4: astore 60
// 1f6: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1f9: invokevirtual su/catlean/zi.K ()Lnet/minecraft/class_4604;
// 1fc: aload 59
// 1fe: invokevirtual net/minecraft/class_4604.method_23093 (Lnet/minecraft/class_238;)Z
// 201: ifne 216
// 204: aload 53
// 206: ifnull 1a8
// 209: goto 216
// 20c: ldc2_w 7426285780241606769
// 20f: lload 2
// 210: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 215: athrow
// 216: aload 0
// 217: lload 31
// 219: aload 59
// 21b: aload 60
// 21d: bipush 0
// 21e: bipush 4
// 21f: aconst_null
// 220: invokestatic su/catlean/k0.t (Lsu/catlean/k0;JLnet/minecraft/class_238;Ljava/awt/Color;IILjava/lang/Object;)Ljava/awt/Color;
// 223: astore 61
// 225: sipush 23798
// 228: lload 4
// 22a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 22d: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 230: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 233: dup
// 234: sipush 23358
// 237: ldc2_w 995379034906956586
// 23a: lload 2
// 23b: lxor
// 23c: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/k0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 241: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 244: astore 62
// 246: ldc2_w 3451539640661388252
// 249: lload 2
// 24a: lxor
// 24b: aload 59
// 24d: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 250: getfield net/minecraft/class_243.field_1352 D
// 253: aload 62
// 255: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 258: getfield net/minecraft/class_243.field_1352 D
// 25b: dsub
// 25c: dstore 63
// 25e: aload 59
// 260: getfield net/minecraft/class_238.field_1322 D
// 263: aload 62
// 265: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 268: getfield net/minecraft/class_243.field_1351 D
// 26b: dsub
// 26c: dstore 65
// 26e: aload 59
// 270: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 273: getfield net/minecraft/class_243.field_1350 D
// 276: aload 62
// 278: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 27b: getfield net/minecraft/class_243.field_1350 D
// 27e: dsub
// 27f: dstore 67
// 281: dconst_1
// 282: dstore 69
// 284: ldc 0.16
// 286: fstore 71
// 288: invokedynamic z (IJ)I bsm=su/catlean/k0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28d: istore 72
// 28f: sipush 28475
// 292: ldc2_w 6527984974894766111
// 295: lload 2
// 296: lxor
// 297: invokedynamic z (IJ)I bsm=su/catlean/k0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: istore 73
// 29e: getstatic su/catlean/gi.FIREFLY Lsu/catlean/gi;
// 2a1: astore 74
// 2a3: bipush 0
// 2a4: istore 75
// 2a6: iload 75
// 2a8: sipush 31457
// 2ab: ldc2_w 3561411233558433237
// 2ae: lload 2
// 2af: lxor
// 2b0: invokedynamic z (IJ)I bsm=su/catlean/k0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b5: if_icmpge 1a8
// 2b8: bipush 0
// 2b9: istore 76
// 2bb: iload 72
// 2bd: bipush 1
// 2be: isub
// 2bf: istore 77
// 2c1: aload 53
// 2c3: lload 2
// 2c4: lconst_0
// 2c5: lcmp
// 2c6: ifle 1b9
// 2c9: lload 2
// 2ca: lconst_0
// 2cb: lcmp
// 2cc: iflt 65f
// 2cf: ifnonnull 65d
// 2d2: iload 76
// 2d4: iload 77
// 2d6: aload 53
// 2d8: ifnonnull 2b5
// 2db: lload 2
// 2dc: lconst_0
// 2dd: lcmp
// 2de: ifle 2be
// 2e1: goto 2ee
// 2e4: ldc2_w 7426285780241606769
// 2e7: lload 2
// 2e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: athrow
// 2ee: if_icmpgt 65a
// 2f1: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2f4: lload 29
// 2f6: aload 61
// 2f8: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 2fb: fstore 78
// 2fd: aload 0
// 2fe: lload 10
// 300: invokespecial su/catlean/k0.H (J)Z
// 303: ifeq 397
// 306: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 309: lload 25
// 30b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 30e: getfield net/minecraft/class_746.field_6012 I
// 311: i2f
// 312: fconst_1
// 313: fsub
// 314: lload 25
// 316: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 319: getfield net/minecraft/class_746.field_6012 I
// 31c: i2f
// 31d: lload 46
// 31f: invokevirtual su/catlean/jl.T (FFJ)F
// 322: fstore 79
// 324: iload 72
// 326: i2f
// 327: aload 0
// 328: lload 12
// 32a: invokespecial su/catlean/k0.a (J)I
// 32d: i2f
// 32e: fdiv
// 32f: fstore 80
// 331: fload 79
// 333: iload 76
// 335: i2f
// 336: fadd
// 337: fload 80
// 339: fdiv
// 33a: fstore 81
// 33c: fload 81
// 33e: fload 81
// 340: f2d
// 341: invokestatic java/lang/Math.floor (D)D
// 344: d2f
// 345: fsub
// 346: fstore 81
// 348: aload 0
// 349: lload 14
// 34b: invokespecial su/catlean/k0.G (J)F
// 34e: fneg
// 34f: fstore 82
// 351: fload 81
// 353: fload 82
// 355: fsub
// 356: invokestatic java/lang/Math.abs (F)F
// 359: fstore 83
// 35b: fload 83
// 35d: fconst_1
// 35e: fload 83
// 360: fsub
// 361: invokestatic java/lang/Math.min (FF)F
// 364: fstore 83
// 366: fload 83
// 368: aload 0
// 369: lload 8
// 36b: invokespecial su/catlean/k0.Y (J)F
// 36e: fdiv
// 36f: fstore 84
// 371: fload 84
// 373: fload 84
// 375: fmul
// 376: fneg
// 377: fconst_2
// 378: fdiv
// 379: f2d
// 37a: invokestatic java/lang/Math.exp (D)D
// 37d: d2f
// 37e: fstore 85
// 380: fload 85
// 382: fconst_0
// 383: fconst_1
// 384: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 387: fload 78
// 389: fmul
// 38a: lload 2
// 38b: lconst_0
// 38c: lcmp
// 38d: ifle 399
// 390: aload 53
// 392: ifnonnull 399
// 395: fstore 78
// 397: fload 78
// 399: lload 2
// 39a: lconst_0
// 39b: lcmp
// 39c: iflt 3e5
// 39f: ldc 0.01
// 3a1: aload 53
// 3a3: ifnonnull 3e4
// 3a6: fcmpg
// 3a7: ifge 3cf
// 3aa: goto 3b7
// 3ad: ldc2_w 7426285780241606769
// 3b0: lload 2
// 3b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b6: athrow
// 3b7: lload 2
// 3b8: lconst_0
// 3b9: lcmp
// 3ba: iflt 632
// 3bd: aload 53
// 3bf: ifnull 632
// 3c2: goto 3cf
// 3c5: ldc2_w 7426285780241606769
// 3c8: lload 2
// 3c9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ce: athrow
// 3cf: ldc 0.45
// 3d1: aload 59
// 3d3: invokevirtual net/minecraft/class_238.method_17939 ()D
// 3d6: d2f
// 3d7: goto 3e4
// 3da: ldc2_w 7426285780241606769
// 3dd: lload 2
// 3de: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e3: athrow
// 3e4: fmul
// 3e5: fstore 79
// 3e7: ldc 0.45
// 3e9: aload 59
// 3eb: invokevirtual net/minecraft/class_238.method_17941 ()D
// 3ee: d2f
// 3ef: fmul
// 3f0: fstore 80
// 3f2: iload 76
// 3f4: i2f
// 3f5: ldc 1.5
// 3f7: fdiv
// 3f8: f2d
// 3f9: dload 69
// 3fb: dadd
// 3fc: iload 73
// 3fe: i2d
// 3ff: dmul
// 400: ldc 360.0
// 402: f2d
// 403: drem
// 404: ldc 360.0
// 406: f2d
// 407: ddiv
// 408: dstore 81
// 40a: ldc 4.0
// 40c: fload 79
// 40e: fload 80
// 410: fadd
// 411: fmul
// 412: fstore 83
// 414: dload 81
// 416: d2f
// 417: fload 83
// 419: fmul
// 41a: fstore 84
// 41c: fconst_0
// 41d: fstore 85
// 41f: fconst_0
// 420: fstore 86
// 422: nop
// 423: fload 84
// 425: fconst_2
// 426: fload 79
// 428: fmul
// 429: fcmpg
// 42a: aload 53
// 42c: lload 2
// 42d: lconst_0
// 42e: lcmp
// 42f: iflt 477
// 432: ifnonnull 475
// 435: ifge 45c
// 438: goto 445
// 43b: ldc2_w 7426285780241606769
// 43e: lload 2
// 43f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 444: athrow
// 445: fload 79
// 447: fneg
// 448: fload 84
// 44a: fadd
// 44b: fstore 85
// 44d: fload 80
// 44f: fstore 86
// 451: lload 2
// 452: lconst_0
// 453: lcmp
// 454: ifle 550
// 457: aload 53
// 459: ifnull 51f
// 45c: fload 84
// 45e: fconst_2
// 45f: fload 79
// 461: fmul
// 462: fconst_2
// 463: fload 80
// 465: fmul
// 466: fadd
// 467: fcmpg
// 468: goto 475
// 46b: ldc2_w 7426285780241606769
// 46e: lload 2
// 46f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 474: athrow
// 475: aload 53
// 477: ifnonnull 4db
// 47a: ifge 4a9
// 47d: goto 48a
// 480: ldc2_w 7426285780241606769
// 483: lload 2
// 484: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 489: athrow
// 48a: fload 84
// 48c: fconst_2
// 48d: fload 79
// 48f: fmul
// 490: fsub
// 491: fstore 84
// 493: fload 79
// 495: fstore 85
// 497: fload 80
// 499: fload 84
// 49b: fsub
// 49c: fstore 86
// 49e: lload 2
// 49f: lconst_0
// 4a0: lcmp
// 4a1: iflt 550
// 4a4: aload 53
// 4a6: ifnull 51f
// 4a9: fload 84
// 4ab: lload 2
// 4ac: lconst_0
// 4ad: lcmp
// 4ae: ifle 51d
// 4b1: ldc 4.0
// 4b3: fload 79
// 4b5: fmul
// 4b6: fconst_2
// 4b7: fload 80
// 4b9: fmul
// 4ba: fadd
// 4bb: aload 53
// 4bd: ifnonnull 51c
// 4c0: goto 4cd
// 4c3: ldc2_w 7426285780241606769
// 4c6: lload 2
// 4c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4cc: athrow
// 4cd: fcmpg
// 4ce: goto 4db
// 4d1: ldc2_w 7426285780241606769
// 4d4: lload 2
// 4d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4da: athrow
// 4db: ifge 503
// 4de: fload 84
// 4e0: fconst_2
// 4e1: fload 79
// 4e3: fmul
// 4e4: fconst_2
// 4e5: fload 80
// 4e7: fmul
// 4e8: fadd
// 4e9: fsub
// 4ea: fstore 84
// 4ec: fload 79
// 4ee: fload 84
// 4f0: fsub
// 4f1: fstore 85
// 4f3: fload 80
// 4f5: fneg
// 4f6: fstore 86
// 4f8: lload 2
// 4f9: lconst_0
// 4fa: lcmp
// 4fb: ifle 550
// 4fe: aload 53
// 500: ifnull 51f
// 503: fload 84
// 505: ldc 4.0
// 507: fload 79
// 509: fmul
// 50a: fconst_2
// 50b: fload 80
// 50d: fmul
// 50e: fadd
// 50f: fsub
// 510: fstore 84
// 512: fload 79
// 514: fneg
// 515: fstore 85
// 517: fload 80
// 519: fneg
// 51a: fload 84
// 51c: fadd
// 51d: fstore 86
// 51f: aload 55
// 521: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 524: aload 55
// 526: dload 63
// 528: fload 85
// 52a: f2d
// 52b: dadd
// 52c: dload 65
// 52e: iload 75
// 530: i2f
// 531: ldc 15.0
// 533: fdiv
// 534: f2d
// 535: dadd
// 536: dload 67
// 538: fload 86
// 53a: f2d
// 53b: dadd
// 53c: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 53f: aload 55
// 541: aload 56
// 543: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 546: lload 42
// 548: aload 56
// 54a: checkcast org/joml/Quaternionfc
// 54d: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 550: aload 55
// 552: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 555: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 558: dup
// 559: sipush 14419
// 55c: ldc2_w 3430149807603380343
// 55f: lload 2
// 560: lxor
// 561: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/k0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 566: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 569: astore 87
// 56b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 56e: aload 61
// 570: fconst_1
// 571: iload 75
// 573: bipush 1
// 574: iadd
// 575: i2f
// 576: fdiv
// 577: fload 78
// 579: fmul
// 57a: iload 20
// 57c: i2c
// 57d: swap
// 57e: iload 21
// 580: swap
// 581: iload 22
// 583: i2s
// 584: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 587: astore 88
// 589: aload 54
// 58b: aload 87
// 58d: fload 71
// 58f: fneg
// 590: lload 35
// 592: fload 71
// 594: fconst_0
// 595: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 598: aload 74
// 59a: invokevirtual su/catlean/gi.o ()F
// 59d: aload 74
// 59f: invokevirtual su/catlean/gi.w ()F
// 5a2: lload 18
// 5a4: dup2_x1
// 5a5: pop2
// 5a6: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 5a9: aload 88
// 5ab: lload 33
// 5ad: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 5b0: pop
// 5b1: aload 54
// 5b3: aload 87
// 5b5: fload 71
// 5b7: lload 35
// 5b9: fload 71
// 5bb: fconst_0
// 5bc: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 5bf: aload 74
// 5c1: invokevirtual su/catlean/gi.L ()F
// 5c4: aload 74
// 5c6: invokevirtual su/catlean/gi.w ()F
// 5c9: lload 18
// 5cb: dup2_x1
// 5cc: pop2
// 5cd: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 5d0: aload 88
// 5d2: lload 33
// 5d4: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 5d7: pop
// 5d8: aload 54
// 5da: aload 87
// 5dc: fload 71
// 5de: fload 71
// 5e0: fneg
// 5e1: lload 35
// 5e3: dup2_x1
// 5e4: pop2
// 5e5: fconst_0
// 5e6: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 5e9: aload 74
// 5eb: invokevirtual su/catlean/gi.L ()F
// 5ee: aload 74
// 5f0: invokevirtual su/catlean/gi.v ()F
// 5f3: lload 18
// 5f5: dup2_x1
// 5f6: pop2
// 5f7: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 5fa: aload 88
// 5fc: lload 33
// 5fe: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 601: pop
// 602: aload 54
// 604: aload 87
// 606: fload 71
// 608: fneg
// 609: fload 71
// 60b: fneg
// 60c: lload 35
// 60e: dup2_x1
// 60f: pop2
// 610: fconst_0
// 611: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 614: aload 74
// 616: invokevirtual su/catlean/gi.o ()F
// 619: aload 74
// 61b: invokevirtual su/catlean/gi.v ()F
// 61e: lload 18
// 620: dup2_x1
// 621: pop2
// 622: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 625: aload 88
// 627: lload 33
// 629: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 62c: pop
// 62d: aload 55
// 62f: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 632: lload 2
// 633: lconst_0
// 634: lcmp
// 635: iflt 642
// 638: iload 76
// 63a: iload 77
// 63c: if_icmpeq 65a
// 63f: iinc 76 1
// 642: aload 53
// 644: ifnull 2f1
// 647: lload 2
// 648: lconst_0
// 649: lcmp
// 64a: ifle 632
// 64d: goto 65a
// 650: ldc2_w 7426285780241606769
// 653: lload 2
// 654: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 659: athrow
// 65a: iinc 75 1
// 65d: aload 53
// 65f: ifnull 2a6
// 662: lload 4
// 664: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 667: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 66a: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 66d: dup
// 66e: sipush 5823
// 671: ldc2_w 8234640152352611973
// 674: lload 2
// 675: lxor
// 676: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/k0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 67e: lload 2
// 67f: lconst_0
// 680: lcmp
// 681: ifle 1b9
// 684: astore 57
// 686: lload 4
// 688: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 68b: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 68e: invokestatic su/catlean/n1.o ()Lnet/minecraft/class_2960;
// 691: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 694: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 697: dup
// 698: sipush 849
// 69b: ldc2_w 3081455228276853603
// 69e: lload 2
// 69f: lxor
// 6a0: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/k0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6a8: astore 58
// 6aa: aload 1
// 6ab: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 6ae: aload 1
// 6af: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 6b2: aload 57
// 6b4: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 6b7: fneg
// 6b8: ldc 180.0
// 6ba: fadd
// 6bb: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 6c0: checkcast org/joml/Quaternionfc
// 6c3: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 6c6: aload 1
// 6c7: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 6ca: aload 57
// 6cc: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 6cf: fneg
// 6d0: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 6d5: checkcast org/joml/Quaternionfc
// 6d8: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 6db: lload 37
// 6dd: aload 54
// 6df: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 6e2: invokevirtual su/catlean/b6.S ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 6e5: aconst_null
// 6e6: aconst_null
// 6e7: aload 1
// 6e8: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 6eb: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 6ee: aconst_null
// 6ef: sipush 711
// 6f2: ldc2_w 1927723479233612521
// 6f5: lload 2
// 6f6: lxor
// 6f7: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/k0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fc: aload 58
// 6fe: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 701: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 704: sipush 5728
// 707: ldc2_w 1917521126708437324
// 70a: lload 2
// 70b: lxor
// 70c: invokedynamic z (IJ)I bsm=su/catlean/k0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 711: aconst_null
// 712: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 715: aload 1
// 716: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 719: return
}

private final Color q(class_238 param1, Color param2, long param3, int param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k0.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 125781864497665
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 6
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 7
// 01d: dup2
// 01e: bipush 48
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 8
// 027: pop2
// 028: dup2
// 029: ldc2_w 30977396310271
// 02c: lxor
// 02d: lstore 9
// 02f: dup2
// 030: ldc2_w 95488809291626
// 033: lxor
// 034: dup2
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 11
// 03b: dup2
// 03c: bipush 16
// 03e: lshl
// 03f: bipush 32
// 041: lushr
// 042: l2i
// 043: istore 12
// 045: dup2
// 046: bipush 48
// 048: lshl
// 049: bipush 48
// 04b: lushr
// 04c: l2i
// 04d: istore 13
// 04f: pop2
// 050: dup2
// 051: ldc2_w 75056853946676
// 054: lxor
// 055: lstore 14
// 057: pop2
// 058: ldc2_w 3207320944372918489
// 05b: lload 3
// 05c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: astore 16
// 063: aload 0
// 064: lload 9
// 066: invokespecial su/catlean/k0.Q (J)Z
// 069: aload 16
// 06b: ifnonnull 0a6
// 06e: ifne 0a0
// 071: goto 07e
// 074: ldc2_w 3234785682513634202
// 077: lload 3
// 078: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: athrow
// 07e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 081: aload 2
// 082: iload 5
// 084: i2f
// 085: ldc 255.0
// 087: fdiv
// 088: iload 11
// 08a: i2c
// 08b: swap
// 08c: iload 12
// 08e: swap
// 08f: iload 13
// 091: i2s
// 092: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 095: areturn
// 096: ldc2_w 3234785682513634202
// 099: lload 3
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: aload 0
// 0a1: lload 14
// 0a3: invokevirtual su/catlean/k0.R (J)I
// 0a6: i2f
// 0a7: ldc 0.5
// 0a9: fmul
// 0aa: fstore 17
// 0ac: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0af: aload 1
// 0b0: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 0b3: invokevirtual net/minecraft/class_243.method_10216 ()D
// 0b6: iload 6
// 0b8: dup_x2
// 0b9: pop
// 0ba: iload 7
// 0bc: dup_x2
// 0bd: pop
// 0be: aload 1
// 0bf: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 0c2: invokevirtual net/minecraft/class_243.method_10215 ()D
// 0c5: iload 8
// 0c7: dup_x2
// 0c8: pop
// 0c9: invokevirtual su/catlean/dm.r (IIDID)F
// 0cc: fstore 18
// 0ce: fload 18
// 0d0: fload 17
// 0d2: aload 16
// 0d4: ifnonnull 101
// 0d7: fcmpg
// 0d8: ifgt 0f6
// 0db: goto 0e8
// 0de: ldc2_w 3234785682513634202
// 0e1: lload 3
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: fconst_1
// 0e9: goto 105
// 0ec: ldc2_w 3234785682513634202
// 0ef: lload 3
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: fconst_1
// 0f7: fload 18
// 0f9: fload 17
// 0fb: fsub
// 0fc: fload 17
// 0fe: fdiv
// 0ff: fsub
// 100: fconst_0
// 101: fconst_1
// 102: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 105: fstore 19
// 107: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 10a: aload 2
// 10b: fload 19
// 10d: f2d
// 10e: iload 5
// 110: i2d
// 111: ldc2_w 255.0
// 114: ddiv
// 115: dmul
// 116: d2f
// 117: iload 11
// 119: i2c
// 11a: swap
// 11b: iload 12
// 11d: swap
// 11e: iload 13
// 120: i2s
// 121: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 124: areturn
}

static Color t(k0 param0, long param1, class_238 param3, Color param4, int param5, int param6, Object param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/k0.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 36635526559715
// 0b: lxor
// 0c: lstore 8
// 0e: pop2
// 0f: ldc2_w -4051872572051668065
// 12: lload 1
// 13: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 10
// 1a: iload 6
// 1c: bipush 4
// 1d: iand
// 1e: aload 10
// 20: ifnonnull 45
// 23: ifeq 47
// 26: goto 33
// 29: ldc2_w -4061633016910559012
// 2c: lload 1
// 2d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: athrow
// 33: aload 4
// 35: invokevirtual java/awt/Color.getAlpha ()I
// 38: goto 45
// 3b: ldc2_w -4061633016910559012
// 3e: lload 1
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: istore 5
// 47: aload 0
// 48: aload 3
// 49: aload 4
// 4b: lload 8
// 4d: iload 5
// 4f: invokespecial su/catlean/k0.q (Lnet/minecraft/class_238;Ljava/awt/Color;JI)Ljava/awt/Color;
// 52: lload 1
// 53: lconst_0
// 54: lcmp
// 55: iflt 6a
// 58: aload 10
// 5a: ifnull 77
// 5d: bipush 1
// 5e: anewarray 470
// 61: ldc2_w -4075319268447630004
// 64: lload 1
// 65: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: goto 77
// 6d: ldc2_w -4061633016910559012
// 70: lload 1
// 71: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76: athrow
// 77: areturn
}

private static final boolean x() {
long var0 = a ^ 110417979319125L;
long var2 = var0 ^ 39591429880278L;
return T.H(var2);
}

private static final boolean s() {
long var0 = a ^ 117673050367121L;
long var2 = var0 ^ 47739856485906L;
return T.H(var2);
}

private static final boolean n() {
long var0 = a ^ 138049668580223L;
long var2 = var0 ^ 68034832570876L;
return T.H(var2);
}

static {
long var20 = a ^ 120737098428936L;
long var22 = var20 ^ 104094936287312L;
long var24 = var20 ^ 48694851905073L;
long var26 = var20 ^ 57061557806361L;
long var28 = var20 ^ 31069840255103L;
int var30 = (int)((var20 ^ 121380349403882L) >>> 48);
long var31 = (var20 ^ 121380349403882L) << 16 >>> 16;
long var33 = var20 ^ 102528326275787L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[42];
int var16 = 0;
String var15 = "Pò¯¿x> Z9£Ó(\n(w\u009d\u0010\u000f:^\u000e,:\u0007 m¦¸}úÓ\u0088R\u000bµÕë<ç\u0092 É\u0094\\\u0096\u001bcè]YÁ+\u00adxÓ¨ö\u0017\u0091ç]Æh/Á\u007f\u0003¼÷|®\u0004\u0017\u0018UAãð_pDòB\u0003}\u009264\u008bªl\u00ad×ñ=SæÓ ¥äK¶\u009fÍÜV±d¹\u0000\u009c«¤*; A\u009bÍÒ.\"â\u001d\u0081\u0085_Àäå\u0010@\u0099\u009fö÷\u0085>Ó\u0094tjäð¢Ö\u001a(~ÿún£x\u0096éxr£\u001fÐG\"¨Ûó\u0015)\u0016|Í\u0001\u0098jÕW^\u0013\u0088ºDèÞZ¦?vÈ(åZÉ»\u0011gK\u0093\u0012ú\u0003\u0012\u0080å¥,çuwÔ¹\u0019\u008ci\u0098_TD\u0099\u0094¯ÈM$<\u0097B\u008e%¯\u0010·waÀü\u0090@e\u0090KiwÜ¸&:\u0018Ì\u008c\u0094`Q×l^>\rjYFR\u0098Å#A\u008d£D¿ýK\u00104¤\u009côÚÎ<2\u000bÆöE\u0017\u0016\u001b\u008b\u0010\u0090\u009f±V\u0011mÜ\u0086\"å\u0014çÝè</8\u008a¸ñ\u000bçACB\u0019>{å\u008eÙ²f\u001aQB\\\u0097µ\u008a{(ÜÔD\u008a¿S¬¾\u009f\u009bé$Ò1þæ?SSëßT©~\u008c\u0082\u0091w\u008eQb ¾\u0098\u0083Êð\u0016Ù-\u0081õ\u009c\u001fEIø\u0099\u001du.LJ@òÉü8Òùtb5A(å\u000b¸¸1â÷°çýÝ\u0094\u0004\u0091ÝÝÐ\u0085IÓN\u0093g¶O\u0012\u0096\u0087ÂUF1\u0005OÃÖ\u0093\u001e«ª \u001e\u000e$b\u009euàï\u0003\u001f+@ùàñþ\u0084\u00adl\u0003Ç\u0093B½\u0019ÂºÃ·B\b\u008d\u0010ïHeDílàÌI\u0097%ëAÀ\u009b| ëû\u0006¬_24âèBø4/\u009a¬vpVN6\u0087\u0018¾\u0086\"\u008f]5î1~\u0003 \u0001¸p\t¤Z\u008f,\nY<`¯!Ã6)O\u0005\"0\u0086½\u00ad<sÌ£\u0081ö®\u0085 \u00adµ²EÂ\u0098M&b\f6OYëñÖ\u001aV\u001eë\u0000[K´\u008a\u001dì;=àÅ\u008a jI\u001b%æm\u0016å4\u0088\u0010áù\u0018\býî\u0013Å÷ÌÓ×à|Lè0\nö{\u0082\u0010\u0099n\u0007\u0092\fÞl©°W\u00ad&úþ\u001aÁ@\u0011\u0081w°\u001d\u0088Þ7D\u001b\u0011Iõ¡*ó}%h2ë0°4õ\u001b\u001ah\u0088¨³\u0089\u0086æÙÃìîÎµ\u000e-T8\b\u001b\u0001³0EÍ\u008f{A\f{é)·6·vù^ \u0016\u0082þ%\u0082\u0097ÿk8ÍýÕwSßß`\u000ee\rìh\nIMBö¿¹µéÝ \u009a\u0087Ý\u0014\u0014\u0002Ò\u0097\u0005Üz\u0007~\u0019v\u0085\u0017ÐÿÓåóªÝC<\u0084¶±\u000b6\u000f\u0018\\_ÿæ)\u0005ô\u0082)aeÔÉ\u0016iÓ,óâ\u0087è×»è \u0095jåBÐ¡ ü9l\u0000\u0003U#xÎ'ÃTþ\u0004p\u0016tñ¿ÛÁ£\u0094VÎ \bb\u009caµß\u0094z%%JdÜ-\"\r\u0001\u008f\u008a\u001a¿¥!<#6ÁÃôïr\u0086\u0018Uð3m³bzyÊ\u001d\f\\\u00995å%çö\u0084ÿÂQ\\¸\u0018²·æî\u0092«Ô\nÖÔÐj-\u00848À9\u0095~N\u00958\u000ec H\u008a\u0012PºeÍ%\u0085}dK\u0098ÁS\u001f5¯´/\u0080\u001e\u007fÂ\u0081lâÂ8Æòñ\u0010~OÂÑÊ\u0015å\u0005\u0001åéÊt\u001e,¶\u0010+1\u0084ò¼ SJ¤\u008c\u0094.\u0085©+ô sÔ´#\r\u0099«\nãÿ;\nîõ\u0007j0\u0000[ÕBW\u0010ÙÜ1&\u0092\u009bMvlP³-\u0018ÒB=Í{)\u0089\u008e\u0019ë0`/t¦=©^\"\u0084TôËÃùáôx§õ±Lè\u009f§.?ec\tI\u00ad/Cpzë4\u008d@D²\fQ`³¥½y\u0091Ë\\ \u0017\"÷á´\u008b»n\u001có\u008e/\u001dç \u0016\u0015Ìv<¸\u008b³\u008b2\u0019\u0095\u0017«\u0089@N\u0010À!I\u008eRÍîsÅ\u0090GY!o(\u009aåóÀñ:»3`'ó\t³Eö\u00982«_\u009a;\u008dá'îÙw¶|MN\u00ads\niËFc¨Þ \u0088Ã¡_\u001cÜ\u0091;FæUo`\u0017\u0018\u0084<\u0098\u001a\u00836ÞAS;\u0017²<NP+O\u0010z\u0018yM\u000e\u0081Uó\u0003æk°ÂH\u0016L\u0010h\u0082zM*kîNÅió´:\u0005\n\u001b\u0010´Y?Vàkð+\u0094ÍA\u001bVÕ\u008d¶";
int var17 = "Pò¯¿x> Z9£Ó(\n(w\u009d\u0010\u000f:^\u000e,:\u0007 m¦¸}úÓ\u0088R\u000bµÕë<ç\u0092 É\u0094\\\u0096\u001bcè]YÁ+\u00adxÓ¨ö\u0017\u0091ç]Æh/Á\u007f\u0003¼÷|®\u0004\u0017\u0018UAãð_pDòB\u0003}\u009264\u008bªl\u00ad×ñ=SæÓ ¥äK¶\u009fÍÜV±d¹\u0000\u009c«¤*; A\u009bÍÒ.\"â\u001d\u0081\u0085_Àäå\u0010@\u0099\u009fö÷\u0085>Ó\u0094tjäð¢Ö\u001a(~ÿún£x\u0096éxr£\u001fÐG\"¨Ûó\u0015)\u0016|Í\u0001\u0098jÕW^\u0013\u0088ºDèÞZ¦?vÈ(åZÉ»\u0011gK\u0093\u0012ú\u0003\u0012\u0080å¥,çuwÔ¹\u0019\u008ci\u0098_TD\u0099\u0094¯ÈM$<\u0097B\u008e%¯\u0010·waÀü\u0090@e\u0090KiwÜ¸&:\u0018Ì\u008c\u0094`Q×l^>\rjYFR\u0098Å#A\u008d£D¿ýK\u00104¤\u009côÚÎ<2\u000bÆöE\u0017\u0016\u001b\u008b\u0010\u0090\u009f±V\u0011mÜ\u0086\"å\u0014çÝè</8\u008a¸ñ\u000bçACB\u0019>{å\u008eÙ²f\u001aQB\\\u0097µ\u008a{(ÜÔD\u008a¿S¬¾\u009f\u009bé$Ò1þæ?SSëßT©~\u008c\u0082\u0091w\u008eQb ¾\u0098\u0083Êð\u0016Ù-\u0081õ\u009c\u001fEIø\u0099\u001du.LJ@òÉü8Òùtb5A(å\u000b¸¸1â÷°çýÝ\u0094\u0004\u0091ÝÝÐ\u0085IÓN\u0093g¶O\u0012\u0096\u0087ÂUF1\u0005OÃÖ\u0093\u001e«ª \u001e\u000e$b\u009euàï\u0003\u001f+@ùàñþ\u0084\u00adl\u0003Ç\u0093B½\u0019ÂºÃ·B\b\u008d\u0010ïHeDílàÌI\u0097%ëAÀ\u009b| ëû\u0006¬_24âèBø4/\u009a¬vpVN6\u0087\u0018¾\u0086\"\u008f]5î1~\u0003 \u0001¸p\t¤Z\u008f,\nY<`¯!Ã6)O\u0005\"0\u0086½\u00ad<sÌ£\u0081ö®\u0085 \u00adµ²EÂ\u0098M&b\f6OYëñÖ\u001aV\u001eë\u0000[K´\u008a\u001dì;=àÅ\u008a jI\u001b%æm\u0016å4\u0088\u0010áù\u0018\býî\u0013Å÷ÌÓ×à|Lè0\nö{\u0082\u0010\u0099n\u0007\u0092\fÞl©°W\u00ad&úþ\u001aÁ@\u0011\u0081w°\u001d\u0088Þ7D\u001b\u0011Iõ¡*ó}%h2ë0°4õ\u001b\u001ah\u0088¨³\u0089\u0086æÙÃìîÎµ\u000e-T8\b\u001b\u0001³0EÍ\u008f{A\f{é)·6·vù^ \u0016\u0082þ%\u0082\u0097ÿk8ÍýÕwSßß`\u000ee\rìh\nIMBö¿¹µéÝ \u009a\u0087Ý\u0014\u0014\u0002Ò\u0097\u0005Üz\u0007~\u0019v\u0085\u0017ÐÿÓåóªÝC<\u0084¶±\u000b6\u000f\u0018\\_ÿæ)\u0005ô\u0082)aeÔÉ\u0016iÓ,óâ\u0087è×»è \u0095jåBÐ¡ ü9l\u0000\u0003U#xÎ'ÃTþ\u0004p\u0016tñ¿ÛÁ£\u0094VÎ \bb\u009caµß\u0094z%%JdÜ-\"\r\u0001\u008f\u008a\u001a¿¥!<#6ÁÃôïr\u0086\u0018Uð3m³bzyÊ\u001d\f\\\u00995å%çö\u0084ÿÂQ\\¸\u0018²·æî\u0092«Ô\nÖÔÐj-\u00848À9\u0095~N\u00958\u000ec H\u008a\u0012PºeÍ%\u0085}dK\u0098ÁS\u001f5¯´/\u0080\u001e\u007fÂ\u0081lâÂ8Æòñ\u0010~OÂÑÊ\u0015å\u0005\u0001åéÊt\u001e,¶\u0010+1\u0084ò¼ SJ¤\u008c\u0094.\u0085©+ô sÔ´#\r\u0099«\nãÿ;\nîõ\u0007j0\u0000[ÕBW\u0010ÙÜ1&\u0092\u009bMvlP³-\u0018ÒB=Í{)\u0089\u008e\u0019ë0`/t¦=©^\"\u0084TôËÃùáôx§õ±Lè\u009f§.?ec\tI\u00ad/Cpzë4\u008d@D²\fQ`³¥½y\u0091Ë\\ \u0017\"÷á´\u008b»n\u001có\u008e/\u001dç \u0016\u0015Ìv<¸\u008b³\u008b2\u0019\u0095\u0017«\u0089@N\u0010À!I\u008eRÍîsÅ\u0090GY!o(\u009aåóÀñ:»3`'ó\t³Eö\u00982«_\u009a;\u008dá'îÙw¶|MN\u00ads\niËFc¨Þ \u0088Ã¡_\u001cÜ\u0091;FæUo`\u0017\u0018\u0084<\u0098\u001a\u00836ÞAS;\u0017²<NP+O\u0010z\u0018yM\u000e\u0081Uó\u0003æk°ÂH\u0016L\u0010h\u0082zM*kîNÅió´:\u0005\n\u001b\u0010´Y?Vàkð+\u0094ÍA\u001bVÕ\u008d¶"
.length();
char var14 = '(';
int var38 = -1;

label54:
while (true) {
String var39 = var15.substring(++var38, var38 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var39.getBytes("ISO-8859-1"));
String var50 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var50;
if ((var38 += var14) >= var17) {
b = var18;
d = new String[42];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[24];
int var3 = 0;
String var4 = "Y\u001c\u0088\u0097\u000fìkçþ³\fôÖ¼eÝ\u0099\u0013'ü³\u0093Ê&\u0015\u000bâ\u0016\u009eR?hbÀÒ 1eà¬È^\bÊl\"\u001f]°S`×Xw¶)ví,V\u001eéûÌ\u001aD\u0081iO\u0093\u0018)¾ñ\u009f\u009f\bh%Q\u0011Æ\u009a\u0017\u0016\u009föÿÉJs\u0015Þ>ªKäÉ3àÈ;\u0013À\u008cÚb<¯ô(\u0094óîÌ©ÒO\u00ad8\r\u0090pÈ°Í¸Ö\u0019Ð¸.\u0000ðU\u0085¡\u001cu¡ý»t¼Ô\u00991[\u001d]\u0094úx¼K\u008b\\ürJ%¶\u0080ë\u0013¢\u008d\\×ØJ³úïDA";
int var5 = "Y\u001c\u0088\u0097\u000fìkçþ³\fôÖ¼eÝ\u0099\u0013'ü³\u0093Ê&\u0015\u000bâ\u0016\u009eR?hbÀÒ 1eà¬È^\bÊl\"\u001f]°S`×Xw¶)ví,V\u001eéûÌ\u001aD\u0081iO\u0093\u0018)¾ñ\u009f\u009f\bh%Q\u0011Æ\u009a\u0017\u0016\u009föÿÉJs\u0015Þ>ªKäÉ3àÈ;\u0013À\u008cÚb<¯ô(\u0094óîÌ©ÒO\u00ad8\r\u0090pÈ°Í¸Ö\u0019Ð¸.\u0000ðU\u0085¡\u001cu¡ý»t¼Ô\u00991[\u001d]\u0094úx¼K\u008b\\ürJ%¶\u0080ë\u0013¢\u008d\\×ØJ³úïDA"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var42 = var6;
var10001 = var3++;
long var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var57 = -1;

while (true) {
long var8 = var54;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var59 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var57) {
case 0:
var42[var10001] = var59;
if (var2 >= var5) {
g = var6;
h = new Integer[24];
KProperty[] var35 = new KProperty[c<"z">(26353, 7552148223651289484L ^ var20)];
var35[0] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(21719, 7937156924000572604L ^ var20), b<"x">(27172, 4855106864185584206L ^ var20), 0)
);
var35[1] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(16168, 1387374756001414976L ^ var20), b<"x">(30933, 5027568975840852116L ^ var20), 0)
);
var35[2] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(10329, 6057833157722630199L ^ var20), b<"x">(21558, 2635593890582828108L ^ var20), 0)
);
var35[3] = Reflection.property1(new PropertyReference1Impl(k0.class, b<"x">(585, 711225788083651087L ^ var20), b<"x">(26441, 5099240720453052198L ^ var20), 0));
var35[4] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(10102, 7185360167555065653L ^ var20), b<"x">(25569, 934877212094768018L ^ var20), 0)
);
var35[5] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(30610, 7292872712712239089L ^ var20), b<"x">(25161, 4719564703434875453L ^ var20), 0)
);
var35[c<"z">(25404, 7320976701408582730L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(11854, 5191506240631369227L ^ var20), b<"x">(25980, 6616079774031422780L ^ var20), 0)
);
var35[c<"z">(16464, 9064381921203568421L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(6373, 5288436242256844947L ^ var20), b<"x">(2677, 1455072415915624978L ^ var20), 0)
);
var35[c<"z">(14928, 6781566050823062830L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(13753, 2110485750257350100L ^ var20), b<"x">(91, 3511469961987244089L ^ var20), 0)
);
var35[c<"z">(22980, 7477722494196328125L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(20837, 3669853049238393109L ^ var20), b<"x">(5191, 5984203920076002342L ^ var20), 0)
);
var35[c<"z">(12532, 4613070462852550540L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(k0.class, b<"x">(1864, 4402238956786566973L ^ var20), b<"x">(27243, 8749444475066984986L ^ var20), 0)
);
c = var35;
T = new k0(var22);
x = yp.L(T, b<"x">(17878, 3125766324256802227L ^ var20), xh.CubeOutline, null, null, c<"z">(22720, 3528227922148796321L ^ var20), null, var33);
S = yp.L(
T,
b<"x">(30427, 7987313735512209062L ^ var20),
c<"z">(12532, 4613070462852550540L ^ var20),
new IntRange(1, c<"z">(2186, 1844642393702955002L ^ var20)),
var26,
null,
null,
c<"z">(12370, 4077154366467919666L ^ var20),
null
);
L = yp.L(
T,
b<"x">(9430, 1334486635376829615L ^ var20),
5,
new IntRange(1, c<"z">(7145, 6422294622386676876L ^ var20)),
var26,
null,
null,
c<"z">(18660, 5851831508920645527L ^ var20),
null
);
U = yp.k(
T, b<"x">(17154, 4562657667917251428L ^ var20), 1.0F, var24, RangesKt.rangeTo(0.01F, 5.0F), null, null, c<"z">(18660, 5851831508920645527L ^ var20), null
);
e = yp.t(T, b<"x">(30782, 8434471340841318494L ^ var20), true, var28, null, null, c<"z">(5496, 4943999525099498011L ^ var20), null);
K = yp.b(
T,
(short)var30,
b<"x">(32576, 4731983394277670718L ^ var20),
new Color(c<"z">(7867, 8851301823253012956L ^ var20)),
null,
null,
c<"z">(5496, 4943999525099498011L ^ var20),
null,
var31
);
y = yp.b(
T,
(short)var30,
b<"x">(4999, 5194614255061259256L ^ var20),
new Color(c<"z">(8561, 1349336796907625990L ^ var20)),
null,
null,
c<"z">(5496, 4943999525099498011L ^ var20),
null,
var31
);
n = yp.t(T, b<"x">(29216, 428564127388545627L ^ var20), true, var28, null, null, c<"z">(5496, 4943999525099498011L ^ var20), null);
j = yp.k(
T, b<"x">(23894, 3534826461169065234L ^ var20), 0.8F, var24, RangesKt.rangeTo(0.0F, 1.0F), null, k0::x, c<"z">(14928, 6781566050823062830L ^ var20), null
);
m = yp.k(
T, b<"x">(23731, 2522917983761407227L ^ var20), 0.4F, var24, RangesKt.rangeTo(0.0F, 1.0F), null, k0::s, c<"z">(14928, 6781566050823062830L ^ var20), null
);
C = yp.L(
T,
b<"x">(10556, 3602522007403161979L ^ var20),
2,
new IntRange(1, c<"z">(12532, 4613070462852550540L ^ var20)),
var26,
null,
k0::n,
c<"z">(14928, 6781566050823062830L ^ var20),
null
);
return;
}
break;
default:
var42[var10001] = var59;
if (var2 < var5) {
continue label36;
}

var4 = "+Â&\u000f\u009eº¤þ\\Ë\u0098\u0005/úÓ\u0012";
var5 = "+Â&\u000f\u009eº¤þ\\Ë\u0098\u0005/úÓ\u0012".length();
var2 = 0;
}

byte var48 = var2;
var2 += 8;
var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
var42 = var6;
var10001 = var3++;
var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var57 = 0;
}
}
}

var14 = var15.charAt(var38);
break;
default:
var18[var16++] = var50;
if ((var38 += var14) < var17) {
var14 = var15.charAt(var38);
continue label54;
}

var15 = "qà¬\u0006xÁ>{J@>¦\u000bN¸\u0098á \u008doG6'¿\u0013Ï\u0015¿f\u001c4Â ÔkÈbÄ}è#\u009b8D+Yÿ&°¾ùI\u0018\u0098ú¡ãÊ3\u0017\u009eõ\u00ad\u001d\u009c";
var17 = "qà¬\u0006xÁ>{J@>¦\u000bN¸\u0098á \u008doG6'¿\u0013Ï\u0015¿f\u001c4Â ÔkÈbÄ}è#\u009b8D+Yÿ&°¾ùI\u0018\u0098ú¡ãÊ3\u0017\u009eõ\u00ad\u001d\u009c".length();
var14 = ' ';
var38 = -1;
}

var39 = var15.substring(++var38, var38 + var14);
var10001 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 11980;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/k0", var10);
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
throw new RuntimeException("su/catlean/k0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 4569;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/k0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/k0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
