package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class kz extends _g {
@NotNull
public static final kz e;
static final KProperty[] C;
@NotNull
private static final cw X;
@NotNull
private static final cs h;
@NotNull
private static final c8 t;
private static int G;
@NotNull
private static List m;
private static final long a = yz.a(6680345788288045339L, 5452596865731013714L, MethodHandles.lookup().lookupClass()).a(216175532279012L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map i;

private kz(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 94412641402865L;
super(b<"k">(26194, 5034510585594246300L ^ var4), jt.z(), null, 4, null, var6);
}

private final xn T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 36767806932219L;
return (xn)X.E(this, var3, C[0]);
}

private final Color Y(byte var1, long var2) {
long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
long var6 = var4 ^ 33841796604001L;
return (Color)h.E(this, var6, C[1]);
}

private final int H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 106719522404832L;
return ((Number)t.E(this, var3, C[2])).intValue();
}

private final void N(int var1, int var2, byte var3, int var4) {
long var5 = ((long)var2 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
long var7 = var5 ^ 56838713178993L;
t.b(this, var7, C[2], var1);
}

@Flow
private final void H(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kz.a J
// 003: ldc2_w 5386926709730
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 105494621833672
// 00d: lxor
// 00e: dup2
// 00f: bipush 48
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 16
// 018: lshl
// 019: bipush 32
// 01b: lushr
// 01c: l2i
// 01d: istore 5
// 01f: dup2
// 020: bipush 48
// 022: lshl
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 6
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 72259046360113
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 111420833125149
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 99926364944263
// 03c: lxor
// 03d: dup2
// 03e: bipush 56
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: dup2
// 045: bipush 8
// 047: lshl
// 048: bipush 8
// 04a: lushr
// 04b: lstore 12
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 34098800751567
// 052: lxor
// 053: dup2
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 14
// 05a: dup2
// 05b: bipush 16
// 05d: lshl
// 05e: bipush 32
// 060: lushr
// 061: l2i
// 062: istore 15
// 064: dup2
// 065: bipush 48
// 067: lshl
// 068: bipush 48
// 06a: lushr
// 06b: l2i
// 06c: istore 16
// 06e: pop2
// 06f: dup2
// 070: ldc2_w 88851676173437
// 073: lxor
// 074: lstore 17
// 076: pop2
// 077: ldc2_w 1186078642140302116
// 07a: lload 2
// 07b: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: getstatic su/catlean/kz.m Ljava/util/List;
// 083: checkcast java/lang/Iterable
// 086: astore 27
// 088: istore 26
// 08a: bipush 0
// 08b: istore 28
// 08d: aload 27
// 08f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 094: astore 29
// 096: aload 29
// 098: invokeinterface java/util/Iterator.hasNext ()Z 1
// 09d: ifeq 2fc
// 0a0: aload 29
// 0a2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0a7: astore 30
// 0a9: aload 30
// 0ab: checkcast net/minecraft/class_2338
// 0ae: astore 31
// 0b0: bipush 0
// 0b1: istore 32
// 0b3: new net/minecraft/class_238
// 0b6: dup
// 0b7: aload 31
// 0b9: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 0bc: astore 33
// 0be: iload 26
// 0c0: ifeq 2fd
// 0c3: getstatic su/catlean/kz.e Lsu/catlean/kz;
// 0c6: lload 9
// 0c8: invokespecial su/catlean/kz.T (J)Lsu/catlean/xn;
// 0cb: getstatic su/catlean/rv.u [I
// 0ce: swap
// 0cf: invokevirtual su/catlean/xn.ordinal ()I
// 0d2: iaload
// 0d3: iload 26
// 0d5: ifeq 196
// 0d8: goto 0e5
// 0db: ldc2_w 1178722747331759617
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: tableswitch 519 1 4 41 180 247 289
// 104: ldc2_w 1178722747331759617
// 107: lload 2
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: lload 7
// 110: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 113: aload 33
// 115: aload 31
// 117: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 11a: i2d
// 11b: invokevirtual net/minecraft/class_238.method_35578 (D)Lnet/minecraft/class_238;
// 11e: dup
// 11f: sipush 15070
// 122: ldc2_w 7794043912300041857
// 125: lload 2
// 126: lxor
// 127: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/kz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12f: getstatic su/catlean/kz.e Lsu/catlean/kz;
// 132: iload 11
// 134: i2b
// 135: lload 12
// 137: invokespecial su/catlean/kz.Y (BJ)Ljava/awt/Color;
// 13a: aconst_null
// 13b: bipush 4
// 13c: aconst_null
// 13d: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 140: pop
// 141: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 144: aload 33
// 146: aload 31
// 148: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 14b: i2d
// 14c: invokevirtual net/minecraft/class_238.method_35578 (D)Lnet/minecraft/class_238;
// 14f: dup
// 150: sipush 1043
// 153: ldc2_w 5889136382244825166
// 156: lload 2
// 157: lxor
// 158: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/kz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 160: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 163: getstatic su/catlean/kz.e Lsu/catlean/kz;
// 166: iload 11
// 168: i2b
// 169: lload 12
// 16b: invokespecial su/catlean/kz.Y (BJ)Ljava/awt/Color;
// 16e: iload 14
// 170: i2c
// 171: iload 15
// 173: fconst_1
// 174: iload 16
// 176: i2s
// 177: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 17a: aconst_null
// 17b: bipush 4
// 17c: aconst_null
// 17d: astore 19
// 17f: istore 20
// 181: astore 21
// 183: astore 22
// 185: astore 23
// 187: lload 17
// 189: aload 23
// 18b: aload 22
// 18d: aload 21
// 18f: iload 20
// 191: aload 19
// 193: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 196: goto 2f4
// 199: lload 7
// 19b: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 19e: aload 33
// 1a0: getstatic su/catlean/kz.e Lsu/catlean/kz;
// 1a3: iload 11
// 1a5: i2b
// 1a6: lload 12
// 1a8: invokespecial su/catlean/kz.Y (BJ)Ljava/awt/Color;
// 1ab: aconst_null
// 1ac: bipush 4
// 1ad: aconst_null
// 1ae: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 1b1: pop
// 1b2: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1b5: lload 17
// 1b7: aload 33
// 1b9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1bc: getstatic su/catlean/kz.e Lsu/catlean/kz;
// 1bf: iload 11
// 1c1: i2b
// 1c2: lload 12
// 1c4: invokespecial su/catlean/kz.Y (BJ)Ljava/awt/Color;
// 1c7: iload 14
// 1c9: i2c
// 1ca: iload 15
// 1cc: fconst_1
// 1cd: iload 16
// 1cf: i2s
// 1d0: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1d3: aconst_null
// 1d4: bipush 4
// 1d5: aconst_null
// 1d6: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 1d9: goto 2f4
// 1dc: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1df: lload 17
// 1e1: aload 33
// 1e3: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1e6: getstatic su/catlean/kz.e Lsu/catlean/kz;
// 1e9: iload 11
// 1eb: i2b
// 1ec: lload 12
// 1ee: invokespecial su/catlean/kz.Y (BJ)Ljava/awt/Color;
// 1f1: iload 14
// 1f3: i2c
// 1f4: iload 15
// 1f6: fconst_1
// 1f7: iload 16
// 1f9: i2s
// 1fa: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1fd: aconst_null
// 1fe: bipush 4
// 1ff: aconst_null
// 200: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 203: goto 2f4
// 206: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 209: new net/minecraft/class_243
// 20c: dup
// 20d: aload 33
// 20f: getfield net/minecraft/class_238.field_1323 D
// 212: aload 33
// 214: getfield net/minecraft/class_238.field_1322 D
// 217: aload 33
// 219: getfield net/minecraft/class_238.field_1324 D
// 21c: invokespecial net/minecraft/class_243.<init> (DDD)V
// 21f: new net/minecraft/class_243
// 222: dup
// 223: aload 33
// 225: getfield net/minecraft/class_238.field_1320 D
// 228: aload 33
// 22a: getfield net/minecraft/class_238.field_1322 D
// 22d: aload 33
// 22f: getfield net/minecraft/class_238.field_1321 D
// 232: invokespecial net/minecraft/class_243.<init> (DDD)V
// 235: getstatic su/catlean/kz.e Lsu/catlean/kz;
// 238: iload 11
// 23a: i2b
// 23b: lload 12
// 23d: invokespecial su/catlean/kz.Y (BJ)Ljava/awt/Color;
// 240: aconst_null
// 241: bipush 1
// 242: sipush 14827
// 245: ldc2_w 1167930398573502100
// 248: lload 2
// 249: lxor
// 24a: invokedynamic n (IJ)I bsm=su/catlean/kz.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: aconst_null
// 250: astore 19
// 252: istore 20
// 254: istore 21
// 256: astore 22
// 258: astore 23
// 25a: astore 24
// 25c: astore 25
// 25e: iload 4
// 260: i2s
// 261: aload 25
// 263: aload 24
// 265: aload 23
// 267: aload 22
// 269: iload 21
// 26b: iload 5
// 26d: iload 6
// 26f: i2c
// 270: iload 20
// 272: aload 19
// 274: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// 277: pop
// 278: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 27b: new net/minecraft/class_243
// 27e: dup
// 27f: aload 33
// 281: getfield net/minecraft/class_238.field_1320 D
// 284: aload 33
// 286: getfield net/minecraft/class_238.field_1322 D
// 289: aload 33
// 28b: getfield net/minecraft/class_238.field_1324 D
// 28e: invokespecial net/minecraft/class_243.<init> (DDD)V
// 291: new net/minecraft/class_243
// 294: dup
// 295: aload 33
// 297: getfield net/minecraft/class_238.field_1323 D
// 29a: aload 33
// 29c: getfield net/minecraft/class_238.field_1322 D
// 29f: aload 33
// 2a1: getfield net/minecraft/class_238.field_1321 D
// 2a4: invokespecial net/minecraft/class_243.<init> (DDD)V
// 2a7: getstatic su/catlean/kz.e Lsu/catlean/kz;
// 2aa: iload 11
// 2ac: i2b
// 2ad: lload 12
// 2af: invokespecial su/catlean/kz.Y (BJ)Ljava/awt/Color;
// 2b2: aconst_null
// 2b3: bipush 1
// 2b4: sipush 29089
// 2b7: ldc2_w 1523962774952236763
// 2ba: lload 2
// 2bb: lxor
// 2bc: invokedynamic n (IJ)I bsm=su/catlean/kz.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c1: aconst_null
// 2c2: astore 19
// 2c4: istore 20
// 2c6: istore 21
// 2c8: astore 22
// 2ca: astore 23
// 2cc: astore 24
// 2ce: astore 25
// 2d0: iload 4
// 2d2: i2s
// 2d3: aload 25
// 2d5: aload 24
// 2d7: aload 23
// 2d9: aload 22
// 2db: iload 21
// 2dd: iload 5
// 2df: iload 6
// 2e1: i2c
// 2e2: iload 20
// 2e4: aload 19
// 2e6: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// 2e9: goto 2f4
// 2ec: new kotlin/NoWhenBranchMatchedException
// 2ef: dup
// 2f0: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 2f3: athrow
// 2f4: pop
// 2f5: nop
// 2f6: nop
// 2f7: iload 26
// 2f9: ifne 096
// 2fc: nop
// 2fd: return
}

@Flow
private final void b(PlayerUpdateEvent var1) {
long var2 = a ^ 8560657640362L;
long var4 = var2 ^ 11142842453395L;
m = this.s(var4);
}

private final List s(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kz.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 56714730674570
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 55560895220721
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 53460686959958
// 018: lxor
// 019: lstore 7
// 01b: pop2
// 01c: ldc2_w -6342798355523568472
// 01f: lload 1
// 020: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 025: new java/util/ArrayList
// 028: dup
// 029: invokespecial java/util/ArrayList.<init> ()V
// 02c: astore 10
// 02e: lload 7
// 030: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 033: invokevirtual net/minecraft/class_746.method_23317 ()D
// 036: aload 0
// 037: lload 3
// 038: invokespecial su/catlean/kz.H (J)I
// 03b: i2d
// 03c: dsub
// 03d: d2i
// 03e: istore 11
// 040: lload 7
// 042: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 045: invokevirtual net/minecraft/class_746.method_23317 ()D
// 048: aload 0
// 049: lload 3
// 04a: invokespecial su/catlean/kz.H (J)I
// 04d: i2d
// 04e: dadd
// 04f: d2i
// 050: istore 12
// 052: istore 9
// 054: iload 11
// 056: iload 12
// 058: if_icmpge 115
// 05b: lload 7
// 05d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 060: invokevirtual net/minecraft/class_746.method_23321 ()D
// 063: aload 0
// 064: lload 3
// 065: invokespecial su/catlean/kz.H (J)I
// 068: i2d
// 069: dsub
// 06a: d2i
// 06b: istore 13
// 06d: lload 7
// 06f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 072: invokevirtual net/minecraft/class_746.method_23321 ()D
// 075: aload 0
// 076: lload 3
// 077: invokespecial su/catlean/kz.H (J)I
// 07a: i2d
// 07b: dadd
// 07c: d2i
// 07d: istore 14
// 07f: iload 13
// 081: iload 14
// 083: if_icmpge 107
// 086: iload 11
// 088: i2d
// 089: lload 5
// 08b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 08e: invokevirtual net/minecraft/class_638.method_31607 ()I
// 091: i2d
// 092: iload 13
// 094: i2d
// 095: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 098: dup
// 099: sipush 4550
// 09c: ldc2_w 3943051180462803487
// 09f: lload 1
// 0a0: lxor
// 0a1: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/kz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a9: astore 15
// 0ab: iload 9
// 0ad: lload 1
// 0ae: lconst_0
// 0af: lcmp
// 0b0: iflt 104
// 0b3: ifeq 102
// 0b6: lload 5
// 0b8: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0bb: aload 15
// 0bd: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0c0: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0c3: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
// 0c6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c9: iload 9
// 0cb: ifeq 056
// 0ce: lload 1
// 0cf: lconst_0
// 0d0: lcmp
// 0d1: iflt 07d
// 0d4: goto 0e1
// 0d7: ldc2_w -6352401310816962163
// 0da: lload 1
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: lload 1
// 0e2: lconst_0
// 0e3: lcmp
// 0e4: ifle 0f1
// 0e7: ifne 0ff
// 0ea: aload 10
// 0ec: aload 15
// 0ee: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 0f1: pop
// 0f2: goto 0ff
// 0f5: ldc2_w -6352401310816962163
// 0f8: lload 1
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: iinc 13 1
// 102: iload 9
// 104: ifne 07f
// 107: iinc 11 1
// 10a: iload 9
// 10c: lload 1
// 10d: lconst_0
// 10e: lcmp
// 10f: ifle 088
// 112: ifne 054
// 115: lload 1
// 116: lconst_0
// 117: lcmp
// 118: ifle 05b
// 11b: aload 10
// 11d: checkcast java/util/List
// 120: areturn
}

static {
long var20 = a ^ 97045749215361L;
long var22 = var20 ^ 90926102622562L;
int var24 = (int)((var20 ^ 16711171831441L) >>> 48);
long var25 = (var20 ^ 16711171831441L) << 16 >>> 16;
long var27 = var20 ^ 66419313706672L;
long var10001 = var20 ^ 49101872504745L;
int var29 = (int)((var20 ^ 49101872504745L) >>> 32);
int var30 = (int)((var20 ^ 49101872504745L) << 32 >>> 48);
int var31 = (int)(var10001 << 48 >>> 48);
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
String var15 = "ïó~\u0005Á\u001dmæöÛrE\u000e\u000e¥·U\u0084ÌD3Ó\u008a\u009f\u008d\u009c¶£/ÄGy8Éö}b\u007fu>DÉ5ûÉæy5ZÝ\ní\u0084\u0095o0\u009dÈº¬F\u008fÑ\u0092âX\u0018\u0087Ë@:ÜòEóW\u0092-Í\u0006uP7\u0005ë\u0018ß\u008c¯\u0010=>\u008aËk_éÈu_\u0001qª\u0001_Æ\u0010Ä[Z\u0006=~\u008ecT\u0082ÌWN\u0087Ån\u0010zä\u0003:Ðl©\u001d&é¦ègÂýK\u0010NjÝI\u000bh\u0010_o½\u009d!î\tùH ÞQ\u0004Û\u0089úf\u0018\u009f.íú¯³\u0088\u009eV1v\u0011\u008fqM]&Õ#Ìü\u0015\u001cç\u0010¥8\bB\u0083/SËñ\r²\u009cYÙ\u0018\r QOµf\u000e|\u00adKõïÒ§ØB£cSò3÷\u0081ä\u0098\u0001º»³~\u001f¬'Q\u0010F\f7\u0080$É9üP\u0085\u0014ÓÏbVj\u0018·CëW_\u0099\u009c\u001fýÀ$cÁìNÈ¥X0Ùª\u0099¼\u008288ÎAêeî¤Û\u0089e\u0013ô5/ \u001c/J×\u0011B\u0017\u0087¦\u0003E\u0098\u000b0\u009f\u001b\"Ó¬3º\u00041ÒET\u0013\u009f¤´jº¼é£\u0091ÁX\u0015]Å";
int var17 = "ïó~\u0005Á\u001dmæöÛrE\u000e\u000e¥·U\u0084ÌD3Ó\u008a\u009f\u008d\u009c¶£/ÄGy8Éö}b\u007fu>DÉ5ûÉæy5ZÝ\ní\u0084\u0095o0\u009dÈº¬F\u008fÑ\u0092âX\u0018\u0087Ë@:ÜòEóW\u0092-Í\u0006uP7\u0005ë\u0018ß\u008c¯\u0010=>\u008aËk_éÈu_\u0001qª\u0001_Æ\u0010Ä[Z\u0006=~\u008ecT\u0082ÌWN\u0087Ån\u0010zä\u0003:Ðl©\u001d&é¦ègÂýK\u0010NjÝI\u000bh\u0010_o½\u009d!î\tùH ÞQ\u0004Û\u0089úf\u0018\u009f.íú¯³\u0088\u009eV1v\u0011\u008fqM]&Õ#Ìü\u0015\u001cç\u0010¥8\bB\u0083/SËñ\r²\u009cYÙ\u0018\r QOµf\u000e|\u00adKõïÒ§ØB£cSò3÷\u0081ä\u0098\u0001º»³~\u001f¬'Q\u0010F\f7\u0080$É9üP\u0085\u0014ÓÏbVj\u0018·CëW_\u0099\u009c\u001fýÀ$cÁìNÈ¥X0Ùª\u0099¼\u008288ÎAêeî¤Û\u0089e\u0013ô5/ \u001c/J×\u0011B\u0017\u0087¦\u0003E\u0098\u000b0\u009f\u001b\"Ó¬3º\u00041ÒET\u0013\u009f¤´jº¼é£\u0091ÁX\u0015]Å"
.length();
char var14 = ' ';
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
byte var41 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var50 = b(var19).intern();
switch (var41) {
case 0:
var18[var16++] = var50;
if ((var35 += var14) >= var17) {
b = var18;
c = new String[14];
i = new HashMap(13);
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
String var4 = "\u0010OÅ¸ß ìÖÝ\u009faL}jð\u009e6\u007f7\u0087kB»Â¥Wåî\u009aä©¢<y·,<=#z";
int var5 = "\u0010OÅ¸ß ìÖÝ\u009faL}jð\u009e6\u007f7\u0087kB»Â¥Wåî\u009aä©¢<y·,<=#z".length();
byte var2 = 0;

label36:
while (true) {
byte var45 = var2;
var2 += 8;
byte[] var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
int var46 = var3++;
long var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var58 = -1;

while (true) {
long var8 = var54;
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
switch (var58) {
case 0:
var39[var46] = var61;
if (var2 >= var5) {
f = var6;
g = new Integer[7];
KProperty[] var32 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(kz.class, b<"k">(32173, 1186427514750122642L ^ var20), b<"k">(17272, 4700643265643414597L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kz.class, b<"k">(2487, 8518819102230171268L ^ var20), b<"k">(3328, 3800732760406018615L ^ var20), 0)),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kz.class, b<"k">(10242, 2990225100736556851L ^ var20), b<"k">(23490, 9019532152803859704L ^ var20), 0)
)
};
C = var32;
e = new kz(var29, (short)var30, (char)var31);
X = yp.L(e, b<"k">(19753, 6466427584446958107L ^ var20), xn.CROSS, null, null, c<"n">(17345, 4114591831613312987L ^ var20), null, var27);
jk var40 = e;
short var48 = (short)var24;
String var56 = b<"k">(11012, 4613437855165115441L ^ var20);
Color var60 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"k">(11313, 300387444207872773L ^ var20));
h = yp.b(var40, var48, var56, var60, null, null, c<"n">(19613, 4400962590507925637L ^ var20), null, var25);
t = yp.L(
e,
b<"k">(19573, 4462735316334447438L ^ var20),
c<"n">(7823, 9041372182328365712L ^ var20),
new IntRange(1, c<"n">(282, 4517607872492719361L ^ var20)),
var22,
null,
null,
c<"n">(17533, 3474003619399403616L ^ var20),
null
);
m = new ArrayList();
return;
}
break;
default:
var39[var46] = var61;
if (var2 < var5) {
continue label36;
}

var4 = "ý\u0085åÈ±\u007fØV§í1ì 97/";
var5 = "ý\u0085åÈ±\u007fØV§í1ì 97/".length();
var2 = 0;
}

byte var47 = var2;
var2 += 8;
var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var39 = var6;
var46 = var3++;
var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var58 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var50;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "Fi\u0093!\u009d×\u001ekÜ$bü\u0010Â:\u008eô\u008f\u0005\u0018\u00ad\u0094\u0014pûè\u0094º2d}^\u0010A¯V\u001a\u001e¾¨\u0088>\f +u[ÛZ";
var17 = "Fi\u0093!\u009d×\u001ekÜ$bü\u0010Â:\u008eô\u008f\u0005\u0018\u00ad\u0094\u0014pûè\u0094º2d}^\u0010A¯V\u001a\u001e¾¨\u0088>\f +u[ÛZ".length();
var14 = ' ';
var35 = -1;
}

var36 = var15.substring(++var35, var35 + var14);
var41 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15840;
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
throw new RuntimeException("su/catlean/kz", var10);
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
throw new RuntimeException("su/catlean/kz" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 14031;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/kz", var14);
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
throw new RuntimeException("su/catlean/kz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
