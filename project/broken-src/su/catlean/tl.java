package su.catlean;

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
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import org.jetbrains.annotations.NotNull;

public final class tl extends tt {
@NotNull
public static final tl J;
private static double g;
private static int S;
private static int O;
private static double D;
@NotNull
private static ArrayList s;
@NotNull
private static ArrayList T;
private static double L;
private static final long a = yz.a(4361498762655927363L, -2915740554165235190L, MethodHandles.lookup().lookupClass()).a(205847304981409L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map i;

private tl(byte var1, int var2, int var3) {
long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ a;
long var10001 = var4 ^ 140547910564152L;
int var6 = (int)((var4 ^ 140547910564152L) >>> 48);
int var7 = (int)((var4 ^ 140547910564152L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, (short)var8);
}

@NotNull
@Override
public _w o(@NotNull class_1297 target, long a, @NotNull _w currentRotation, boolean attackTick) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: dup2
// 002: ldc2_w 33615733051039
// 005: lxor
// 006: lstore 6
// 008: dup2
// 009: ldc2_w 17529635141180
// 00c: lxor
// 00d: lstore 8
// 00f: dup2
// 010: ldc2_w 122620728483203
// 013: lxor
// 014: lstore 10
// 016: dup2
// 017: ldc2_w 28158549830711
// 01a: lxor
// 01b: lstore 12
// 01d: dup2
// 01e: ldc2_w 38753063586444
// 021: lxor
// 022: lstore 14
// 024: dup2
// 025: ldc2_w 25377842513472
// 028: lxor
// 029: dup2
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 16
// 030: dup2
// 031: bipush 16
// 033: lshl
// 034: bipush 32
// 036: lushr
// 037: l2i
// 038: istore 17
// 03a: dup2
// 03b: bipush 48
// 03d: lshl
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 18
// 044: pop2
// 045: dup2
// 046: ldc2_w 43306842265647
// 049: lxor
// 04a: lstore 19
// 04c: pop2
// 04d: ldc2_w -3889368070291334691
// 050: lload 2
// 051: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: aload 1
// 057: sipush 13521
// 05a: ldc2_w 9170323706890986452
// 05d: lload 2
// 05e: lxor
// 05f: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/tl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 067: astore 21
// 069: aload 4
// 06b: sipush 11523
// 06e: ldc2_w 6740865346455648772
// 071: lload 2
// 072: lxor
// 073: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/tl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07b: aload 1
// 07c: getfield net/minecraft/class_1297.field_6012 I
// 07f: i2d
// 080: ldc 4.0
// 082: f2d
// 083: ddiv
// 084: dstore 22
// 086: aload 1
// 087: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 08a: invokevirtual net/minecraft/class_238.method_17939 ()D
// 08d: ldc2_w 2.3
// 090: ddiv
// 091: dload 22
// 093: invokestatic java/lang/Math.toRadians (D)D
// 096: invokestatic java/lang/Math.sin (D)D
// 099: dmul
// 09a: dstore 24
// 09c: aload 1
// 09d: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 0a0: invokevirtual net/minecraft/class_238.method_17940 ()D
// 0a3: ldc2_w 10.0
// 0a6: ddiv
// 0a7: dload 22
// 0a9: ldc2_w 10.0
// 0ac: dadd
// 0ad: invokestatic java/lang/Math.toRadians (D)D
// 0b0: invokestatic java/lang/Math.sin (D)D
// 0b3: dmul
// 0b4: dstore 26
// 0b6: aload 1
// 0b7: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 0ba: invokevirtual net/minecraft/class_238.method_17941 ()D
// 0bd: ldc2_w 2.3
// 0c0: ddiv
// 0c1: dload 22
// 0c3: invokestatic java/lang/Math.toRadians (D)D
// 0c6: invokestatic java/lang/Math.cos (D)D
// 0c9: dneg
// 0ca: dmul
// 0cb: dstore 28
// 0cd: lload 6
// 0cf: aload 1
// 0d0: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0d3: dload 24
// 0d5: aload 1
// 0d6: invokevirtual net/minecraft/class_1297.method_17682 ()F
// 0d9: f2d
// 0da: ldc2_w 2.0
// 0dd: ddiv
// 0de: dload 26
// 0e0: dadd
// 0e1: dload 28
// 0e3: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0e6: dup
// 0e7: sipush 258
// 0ea: ldc2_w 6426594396810122756
// 0ed: lload 2
// 0ee: lxor
// 0ef: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/tl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f7: astore 30
// 0f9: aload 30
// 0fb: getfield net/minecraft/class_243.field_1350 D
// 0fe: lload 19
// 100: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 103: invokevirtual net/minecraft/class_746.method_23321 ()D
// 106: dsub
// 107: aload 30
// 109: getfield net/minecraft/class_243.field_1352 D
// 10c: lload 19
// 10e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 111: invokevirtual net/minecraft/class_746.method_23317 ()D
// 114: dsub
// 115: invokestatic java/lang/Math.atan2 (DD)D
// 118: invokestatic java/lang/Math.toDegrees (D)D
// 11b: sipush 6484
// 11e: ldc2_w 4338261849465294680
// 121: lload 2
// 122: lxor
// 123: invokedynamic m (IJ)I bsm=su/catlean/tl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: i2d
// 129: dsub
// 12a: aload 4
// 12c: invokevirtual su/catlean/_w.q ()F
// 12f: f2d
// 130: dsub
// 131: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 134: dstore 31
// 136: aload 30
// 138: getfield net/minecraft/class_243.field_1351 D
// 13b: lload 19
// 13d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 140: lload 6
// 142: dup2_x1
// 143: pop2
// 144: checkcast net/minecraft/class_1297
// 147: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 14a: getfield net/minecraft/class_243.field_1351 D
// 14d: lload 19
// 14f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 152: lload 19
// 154: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 157: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 15a: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 15d: f2d
// 15e: dadd
// 15f: dsub
// 160: aload 30
// 162: getfield net/minecraft/class_243.field_1352 D
// 165: lload 19
// 167: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16a: invokevirtual net/minecraft/class_746.method_23317 ()D
// 16d: dsub
// 16e: aload 30
// 170: getfield net/minecraft/class_243.field_1350 D
// 173: lload 19
// 175: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 178: invokevirtual net/minecraft/class_746.method_23321 ()D
// 17b: dsub
// 17c: invokestatic java/lang/Math.hypot (DD)D
// 17f: invokestatic java/lang/Math.atan2 (DD)D
// 182: invokestatic java/lang/Math.toDegrees (D)D
// 185: dneg
// 186: aload 4
// 188: invokevirtual su/catlean/_w.N ()F
// 18b: f2d
// 18c: dsub
// 18d: dstore 33
// 18f: getstatic su/catlean/tl.g D
// 192: invokestatic java/lang/Math.abs (D)D
// 195: ldc2_w 300.0
// 198: dcmpl
// 199: aload 21
// 19b: ifnonnull 1f4
// 19e: ifgt 1dd
// 1a1: goto 1ae
// 1a4: ldc2_w -3849343119947322408
// 1a7: lload 2
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: getstatic su/catlean/tl.L D
// 1b1: ldc2_w 100.0
// 1b4: dcmpl
// 1b5: aload 21
// 1b7: lload 2
// 1b8: lconst_0
// 1b9: lcmp
// 1ba: iflt 204
// 1bd: ifnonnull 202
// 1c0: goto 1cd
// 1c3: ldc2_w -3849343119947322408
// 1c6: lload 2
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: ifle 1ff
// 1d0: goto 1dd
// 1d3: ldc2_w -3849343119947322408
// 1d6: lload 2
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: dconst_0
// 1de: putstatic su/catlean/tl.g D
// 1e1: bipush 1
// 1e2: bipush 3
// 1e3: bipush 0
// 1e4: invokestatic su/catlean/mf.O (IIZ)I
// 1e7: goto 1f4
// 1ea: ldc2_w -3849343119947322408
// 1ed: lload 2
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: putstatic su/catlean/tl.S I
// 1f7: dconst_0
// 1f8: putstatic su/catlean/tl.D D
// 1fb: dconst_0
// 1fc: putstatic su/catlean/tl.L D
// 1ff: getstatic su/catlean/tl.S I
// 202: aload 21
// 204: lload 2
// 205: lconst_0
// 206: lcmp
// 207: ifle 26a
// 20a: ifnonnull 268
// 20d: ifle 265
// 210: goto 21d
// 213: ldc2_w -3849343119947322408
// 216: lload 2
// 217: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: athrow
// 21d: getstatic su/catlean/tl.S I
// 220: istore 35
// 222: iload 35
// 224: bipush -1
// 225: iadd
// 226: putstatic su/catlean/tl.S I
// 229: dconst_0
// 22a: putstatic su/catlean/tl.D D
// 22d: ldc 0.15
// 22f: ldc 0.4
// 231: bipush 0
// 232: invokestatic su/catlean/mf.q (FFZ)F
// 235: fstore 35
// 237: new su/catlean/_w
// 23a: dup
// 23b: aload 4
// 23d: invokevirtual su/catlean/_w.q ()F
// 240: fload 35
// 242: fadd
// 243: aload 4
// 245: invokevirtual su/catlean/_w.N ()F
// 248: fload 35
// 24a: fconst_2
// 24b: fdiv
// 24c: fsub
// 24d: lload 14
// 24f: dup2_x1
// 250: pop2
// 251: bipush 0
// 252: aconst_null
// 253: sipush 32161
// 256: ldc2_w 7793163156593372074
// 259: lload 2
// 25a: lxor
// 25b: invokedynamic m (IJ)I bsm=su/catlean/tl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 260: aconst_null
// 261: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 264: areturn
// 265: getstatic su/catlean/tl.O I
// 268: aload 21
// 26a: lload 2
// 26b: lconst_0
// 26c: lcmp
// 26d: ifle 2a5
// 270: ifnonnull 2a3
// 273: sipush 15813
// 276: ldc2_w 3872390320298109895
// 279: lload 2
// 27a: lxor
// 27b: invokedynamic m (IJ)I bsm=su/catlean/tl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 280: if_icmple 2bc
// 283: goto 290
// 286: ldc2_w -3849343119947322408
// 289: lload 2
// 28a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28f: athrow
// 290: dload 31
// 292: ldc2_w 60.0
// 295: dcmpl
// 296: goto 2a3
// 299: ldc2_w -3849343119947322408
// 29c: lload 2
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: aload 21
// 2a5: ifnonnull 2b9
// 2a8: ifle 2bc
// 2ab: goto 2b8
// 2ae: ldc2_w -3849343119947322408
// 2b1: lload 2
// 2b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b7: athrow
// 2b8: bipush 1
// 2b9: goto 2bd
// 2bc: bipush 0
// 2bd: istore 35
// 2bf: iload 35
// 2c1: aload 21
// 2c3: ifnonnull 2d7
// 2c6: ifeq 2da
// 2c9: goto 2d6
// 2cc: ldc2_w -3849343119947322408
// 2cf: lload 2
// 2d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d5: athrow
// 2d6: bipush 0
// 2d7: putstatic su/catlean/tl.O I
// 2da: ldc 25.0
// 2dc: ldc 35.0
// 2de: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 2e1: astore 36
// 2e3: iload 35
// 2e5: ifeq 309
// 2e8: ldc2_w 84.0
// 2eb: ldc -1.0
// 2ed: fconst_1
// 2ee: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 2f1: checkcast kotlin/ranges/ClosedRange
// 2f4: bipush 0
// 2f5: lload 8
// 2f7: invokestatic su/catlean/mf.G (Lkotlin/ranges/ClosedRange;ZJ)F
// 2fa: f2d
// 2fb: dadd
// 2fc: goto 315
// 2ff: ldc2_w -3849343119947322408
// 302: lload 2
// 303: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 308: athrow
// 309: aload 36
// 30b: checkcast kotlin/ranges/ClosedRange
// 30e: bipush 1
// 30f: lload 8
// 311: invokestatic su/catlean/mf.G (Lkotlin/ranges/ClosedRange;ZJ)F
// 314: f2d
// 315: dstore 37
// 317: ldc2_w -5.1
// 31a: ldc2_w 5.1
// 31d: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 320: iload 16
// 322: i2c
// 323: swap
// 324: checkcast kotlin/ranges/ClosedRange
// 327: iload 17
// 329: bipush 1
// 32a: iload 18
// 32c: i2c
// 32d: invokestatic su/catlean/mf.x (CLkotlin/ranges/ClosedRange;IZC)D
// 330: invokestatic java/lang/Math.abs (D)D
// 333: dstore 39
// 335: aload 21
// 337: ifnonnull 390
// 33a: lload 19
// 33c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 33f: getfield net/minecraft/class_746.field_6012 I
// 342: bipush 2
// 343: sipush 22222
// 346: ldc2_w 8060306988514820291
// 349: lload 2
// 34a: lxor
// 34b: invokedynamic m (IJ)I bsm=su/catlean/tl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 350: bipush 0
// 351: invokestatic su/catlean/mf.O (IIZ)I
// 354: irem
// 355: ifne 36d
// 358: goto 365
// 35b: ldc2_w -3849343119947322408
// 35e: lload 2
// 35f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 364: athrow
// 365: dload 37
// 367: ldc 10.0
// 369: f2d
// 36a: ddiv
// 36b: dstore 37
// 36d: dload 31
// 36f: dload 37
// 371: dneg
// 372: dload 37
// 374: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 377: dstore 31
// 379: dload 33
// 37b: dload 39
// 37d: dneg
// 37e: dload 39
// 380: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 383: dstore 33
// 385: dload 33
// 387: dload 31
// 389: ldc 20.0
// 38b: f2d
// 38c: ddiv
// 38d: dadd
// 38e: dstore 33
// 390: aload 4
// 392: invokevirtual su/catlean/_w.q ()F
// 395: dload 31
// 397: d2f
// 398: fadd
// 399: fstore 41
// 39b: aload 4
// 39d: invokevirtual su/catlean/_w.N ()F
// 3a0: dload 33
// 3a2: d2f
// 3a3: fadd
// 3a4: fstore 42
// 3a6: aload 1
// 3a7: invokevirtual net/minecraft/class_1297.method_33571 ()Lnet/minecraft/class_243;
// 3aa: lload 19
// 3ac: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3af: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 3b2: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 3b5: ldc2_w 1.5
// 3b8: dcmpg
// 3b9: aload 21
// 3bb: ifnonnull 3cf
// 3be: ifge 3d2
// 3c1: goto 3ce
// 3c4: ldc2_w -3849343119947322408
// 3c7: lload 2
// 3c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cd: athrow
// 3ce: bipush 1
// 3cf: goto 3d3
// 3d2: bipush 0
// 3d3: istore 43
// 3d5: iload 43
// 3d7: ifeq 40d
// 3da: ldc -40.0
// 3dc: lload 19
// 3de: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3e1: getfield net/minecraft/class_746.field_6012 I
// 3e4: sipush 7079
// 3e7: ldc2_w 7652825249127599535
// 3ea: lload 2
// 3eb: lxor
// 3ec: invokedynamic m (IJ)I bsm=su/catlean/tl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f1: irem
// 3f2: i2f
// 3f3: ldc 25.0
// 3f5: fdiv
// 3f6: fadd
// 3f7: ldc -0.1
// 3f9: ldc 0.1
// 3fb: bipush 0
// 3fc: invokestatic su/catlean/mf.q (FFZ)F
// 3ff: fadd
// 400: goto 40f
// 403: ldc2_w -3849343119947322408
// 406: lload 2
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: ldc -90.0
// 40f: fstore 44
// 411: iload 43
// 413: ifeq 449
// 416: ldc 60.0
// 418: lload 19
// 41a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 41d: getfield net/minecraft/class_746.field_6012 I
// 420: sipush 1507
// 423: ldc2_w 822651319963227114
// 426: lload 2
// 427: lxor
// 428: invokedynamic m (IJ)I bsm=su/catlean/tl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42d: irem
// 42e: i2f
// 42f: ldc 25.0
// 431: fdiv
// 432: fadd
// 433: ldc -0.1
// 435: ldc 0.1
// 437: bipush 0
// 438: invokestatic su/catlean/mf.q (FFZ)F
// 43b: fadd
// 43c: goto 44b
// 43f: ldc2_w -3849343119947322408
// 442: lload 2
// 443: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 448: athrow
// 449: ldc 90.0
// 44b: fstore 45
// 44d: getstatic su/catlean/tl.g D
// 450: dload 31
// 452: dadd
// 453: putstatic su/catlean/tl.g D
// 456: dload 31
// 458: ldc2_w 20.0
// 45b: dcmpg
// 45c: aload 21
// 45e: ifnonnull 498
// 461: ifge 488
// 464: goto 471
// 467: ldc2_w -3849343119947322408
// 46a: lload 2
// 46b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 470: athrow
// 471: getstatic su/catlean/tl.O I
// 474: istore 46
// 476: iload 46
// 478: bipush 1
// 479: iadd
// 47a: putstatic su/catlean/tl.O I
// 47d: aload 21
// 47f: lload 2
// 480: lconst_0
// 481: lcmp
// 482: iflt 4eb
// 485: ifnull 4a1
// 488: getstatic su/catlean/tl.O I
// 48b: goto 498
// 48e: ldc2_w -3849343119947322408
// 491: lload 2
// 492: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 497: athrow
// 498: istore 46
// 49a: iload 46
// 49c: bipush -1
// 49d: iadd
// 49e: putstatic su/catlean/tl.O I
// 4a1: fload 41
// 4a3: ldc -2.0
// 4a5: fconst_2
// 4a6: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 4a9: checkcast kotlin/ranges/ClosedRange
// 4ac: bipush 0
// 4ad: lload 8
// 4af: invokestatic su/catlean/mf.G (Lkotlin/ranges/ClosedRange;ZJ)F
// 4b2: fadd
// 4b3: fstore 41
// 4b5: fload 42
// 4b7: ldc -0.5
// 4b9: ldc 0.5
// 4bb: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 4be: checkcast kotlin/ranges/ClosedRange
// 4c1: bipush 0
// 4c2: lload 8
// 4c4: invokestatic su/catlean/mf.G (Lkotlin/ranges/ClosedRange;ZJ)F
// 4c7: fadd
// 4c8: fstore 42
// 4ca: getstatic su/catlean/tl.s Ljava/util/ArrayList;
// 4cd: fload 41
// 4cf: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 4d2: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 4d5: pop
// 4d6: getstatic su/catlean/tl.T Ljava/util/ArrayList;
// 4d9: dload 31
// 4db: d2f
// 4dc: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 4df: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 4e2: lload 2
// 4e3: lconst_0
// 4e4: lcmp
// 4e5: iflt 4f4
// 4e8: pop
// 4e9: aload 21
// 4eb: ifnonnull 557
// 4ee: getstatic su/catlean/tl.s Ljava/util/ArrayList;
// 4f1: invokevirtual java/util/ArrayList.size ()I
// 4f4: sipush 13529
// 4f7: ldc2_w 6136924763244503767
// 4fa: lload 2
// 4fb: lxor
// 4fc: invokedynamic m (IJ)I bsm=su/catlean/tl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 501: if_icmplt 537
// 504: goto 511
// 507: ldc2_w -3849343119947322408
// 50a: lload 2
// 50b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 510: athrow
// 511: aload 0
// 512: aload 0
// 513: lload 10
// 515: getstatic su/catlean/tl.s Ljava/util/ArrayList;
// 518: checkcast java/util/List
// 51b: invokespecial su/catlean/tl.z (JLjava/util/List;)Ljava/util/List;
// 51e: lload 12
// 520: dup2_x1
// 521: pop2
// 522: invokespecial su/catlean/tl.G (JLjava/util/List;)F
// 525: fstore 46
// 527: getstatic su/catlean/tl.L D
// 52a: fload 46
// 52c: f2d
// 52d: dadd
// 52e: putstatic su/catlean/tl.L D
// 531: getstatic su/catlean/tl.s Ljava/util/ArrayList;
// 534: invokevirtual java/util/ArrayList.clear ()V
// 537: getstatic su/catlean/tl.D D
// 53a: ldc2_w 0.1
// 53d: ldc2_w 0.3
// 540: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 543: iload 16
// 545: i2c
// 546: swap
// 547: checkcast kotlin/ranges/ClosedRange
// 54a: iload 17
// 54c: bipush 0
// 54d: iload 18
// 54f: i2c
// 550: invokestatic su/catlean/mf.x (CLkotlin/ranges/ClosedRange;IZC)D
// 553: dadd
// 554: putstatic su/catlean/tl.D D
// 557: new su/catlean/_w
// 55a: dup
// 55b: fload 41
// 55d: fload 42
// 55f: fload 44
// 561: fload 45
// 563: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 566: lload 14
// 568: dup2_x1
// 569: pop2
// 56a: bipush 0
// 56b: aconst_null
// 56c: sipush 9900
// 56f: ldc2_w 944524908548829350
// 572: lload 2
// 573: lxor
// 574: invokedynamic m (IJ)I bsm=su/catlean/tl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 579: aconst_null
// 57a: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 57d: areturn
}

private final List z(long param1, List param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tl.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: ldc2_w -404138394086938177
// 009: lload 1
// 00a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: new java/util/ArrayList
// 012: dup
// 013: invokespecial java/util/ArrayList.<init> ()V
// 016: checkcast java/util/List
// 019: astore 5
// 01b: astore 4
// 01d: aload 3
// 01e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 023: astore 6
// 025: aload 6
// 027: invokeinterface java/util/Iterator.hasNext ()Z 1
// 02c: ifeq 06e
// 02f: aload 6
// 031: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 036: checkcast java/lang/Number
// 039: invokevirtual java/lang/Number.floatValue ()F
// 03c: fstore 7
// 03e: lload 1
// 03f: lconst_0
// 040: lcmp
// 041: iflt 056
// 044: aload 5
// 046: fload 7
// 048: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 04b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 050: aload 4
// 052: ifnonnull 06f
// 055: pop
// 056: aload 4
// 058: ifnull 025
// 05b: lload 1
// 05c: lconst_0
// 05d: lcmp
// 05e: iflt 03e
// 061: goto 06e
// 064: ldc2_w -362991880253596742
// 067: lload 1
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: bipush 0
// 06f: istore 6
// 071: iload 6
// 073: sipush 14416
// 076: ldc2_w 7881194373680275005
// 079: lload 1
// 07a: lxor
// 07b: invokedynamic m (IJ)I bsm=su/catlean/tl.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: if_icmpge 13a
// 083: new java/util/ArrayList
// 086: dup
// 087: invokespecial java/util/ArrayList.<init> ()V
// 08a: checkcast java/util/List
// 08d: astore 7
// 08f: ldc 1.4E-45
// 091: fstore 8
// 093: aload 5
// 095: aload 4
// 097: ifnonnull 142
// 09a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 09f: astore 9
// 0a1: aload 9
// 0a3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0a8: ifeq 11b
// 0ab: aload 9
// 0ad: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0b2: checkcast java/lang/Number
// 0b5: invokevirtual java/lang/Number.floatValue ()F
// 0b8: fstore 10
// 0ba: fload 8
// 0bc: ldc 1.4E-45
// 0be: fcmpg
// 0bf: aload 4
// 0c1: ifnonnull 073
// 0c4: aload 4
// 0c6: lload 1
// 0c7: lconst_0
// 0c8: lcmp
// 0c9: iflt 0c1
// 0cc: ifnonnull 0e0
// 0cf: ifne 0e3
// 0d2: goto 0df
// 0d5: ldc2_w -362991880253596742
// 0d8: lload 1
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: bipush 1
// 0e0: goto 0e4
// 0e3: bipush 0
// 0e4: ifeq 0f6
// 0e7: fload 10
// 0e9: fstore 8
// 0eb: aload 4
// 0ed: lload 1
// 0ee: lconst_0
// 0ef: lcmp
// 0f0: ifle 118
// 0f3: ifnull 0a1
// 0f6: aload 7
// 0f8: fload 10
// 0fa: f2d
// 0fb: invokestatic java/lang/Math.abs (D)D
// 0fe: fload 8
// 100: f2d
// 101: invokestatic java/lang/Math.abs (D)D
// 104: dsub
// 105: invokestatic java/lang/Math.abs (D)D
// 108: d2f
// 109: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 10c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 111: pop
// 112: fload 10
// 114: fstore 8
// 116: aload 4
// 118: ifnull 0a1
// 11b: new java/util/ArrayList
// 11e: dup
// 11f: aload 7
// 121: checkcast java/util/Collection
// 124: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
// 127: checkcast java/util/List
// 12a: astore 5
// 12c: iinc 6 1
// 12f: aload 4
// 131: lload 1
// 132: lconst_0
// 133: lcmp
// 134: iflt 0b2
// 137: ifnull 071
// 13a: lload 1
// 13b: lconst_0
// 13c: lcmp
// 13d: iflt 083
// 140: aload 5
// 142: areturn
}

private final float G(long var1, List var3) {
var1 = a ^ var1;
String var10000 = vm.a<"Å">(5462937113575249931L, var1);
List var5 = var3.stream().sorted().collect(Collectors.toList());
String var4 = var10000;
int var6 = var5.size();
float var7 = 0.0F;
int var8 = 0;

while (true) {
if (var8 < var6) {
float var11 = (var8 + 1.0F) / var6;
Object var10001 = var5.get(var8);
Intrinsics.checkNotNullExpressionValue(var10001, b<"g">(12099, 2282501728313719185L ^ var1));
float var9 = Math.abs(var11 - ((Number)var10001).floatValue());
if (var1 > 0L) {
var12 = Math.max(var7, var9);
if (var4 != null) {
break;
}

var7 = var12;
var8++;
}

if (var4 == null) {
continue;
}
}

var12 = var7;
break;
}

return var12;
}

static {
long var20 = a ^ 140263073958541L;
long var10001 = var20 ^ 103440996463917L;
int var22 = (int)((var20 ^ 103440996463917L) >>> 56);
int var23 = (int)((var20 ^ 103440996463917L) << 8 >>> 32);
int var24 = (int)(var10001 << 40 >>> 40);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[4];
int var16 = 0;
String var15 = "v¼\u008azígÈ´_Á\u000b¥z)ÆL\u0096<Þ4\u009d¹\u001f|F1âèyµºÛ\u0010Æ~áO);cGåÂê°89xÆ";
int var17 = "v¼\u008azígÈ´_Á\u000b¥z)ÆL\u0096<Þ4\u009d¹\u001f|F1âèyµºÛ\u0010Æ~áO);cGåÂê°89xÆ".length();
char var14 = ' ';
int var27 = -1;

label54:
while (true) {
String var28 = var15.substring(++var27, var27 + var14);
byte var32 = -1;

while (true) {
byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
String var40 = b(var19).intern();
switch (var32) {
case 0:
var18[var16++] = var40;
if ((var27 += var14) >= var17) {
b = var18;
c = new String[4];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[9];
int var3 = 0;
String var4 = "}\u0015ð³\u000b:ÞfÓ\u009fÂ8Síj\u0084\u0098\u009blW\u0014¯Æ«2ÛÒ¨\u000bÉÆ·T\u0012_µ\u009cv7ï_\u008eU§ysÄ¿A©\u0081fuäl\u0005";
int var5 = "}\u0015ð³\u000b:ÞfÓ\u009fÂ8Síj\u0084\u0098\u009blW\u0014¯Æ«2ÛÒ¨\u000bÉÆ·T\u0012_µ\u009cv7ï_\u008eU§ysÄ¿A©\u0081fuäl\u0005".length();
byte var2 = 0;

label36:
while (true) {
byte var36 = var2;
var2 += 8;
byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
long[] var31 = var6;
int var37 = var3++;
long var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var47 = -1;

while (true) {
long var8 = var44;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var49 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var47) {
case 0:
var31[var37] = var49;
if (var2 >= var5) {
e = var6;
f = new Integer[9];
J = new tl((byte)var22, var23, var24);
s = new ArrayList();
T = new ArrayList();
return;
}
break;
default:
var31[var37] = var49;
if (var2 < var5) {
continue label36;
}

var4 = ":Å]!\u0083Ð\u0088\u0018\u0099\u007f\u007fc3Ñ¥\u0015";
var5 = ":Å]!\u0083Ð\u0088\u0018\u0099\u007f\u007fc3Ñ¥\u0015".length();
var2 = 0;
}

byte var38 = var2;
var2 += 8;
var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
var31 = var6;
var37 = var3++;
var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var47 = 0;
}
}
}

var14 = var15.charAt(var27);
break;
default:
var18[var16++] = var40;
if ((var27 += var14) < var17) {
var14 = var15.charAt(var27);
continue label54;
}

var15 = "Õ\u0092\u0087\u0088qÆ\u001bP\u009aÇ\u009cùB\u0088Á\u0093\u008b¬m[V4[r t\u0015\u0003SQ>¾]úxoS\u0006É\ráv]·¤Re§\u0003E\u000fH\u001dPGf\u0094";
var17 = "Õ\u0092\u0087\u0088qÆ\u001bP\u009aÇ\u009cùB\u0088Á\u0093\u008b¬m[V4[r t\u0015\u0003SQ>¾]úxoS\u0006É\ráv]·¤Re§\u0003E\u000fH\u001dPGf\u0094".length();
var14 = 24;
var27 = -1;
}

var28 = var15.substring(++var27, var27 + var14);
var32 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23620;
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
throw new RuntimeException("su/catlean/tl", var10);
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
throw new RuntimeException("su/catlean/tl" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 23882;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
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
throw new RuntimeException("su/catlean/tl", var14);
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
throw new RuntimeException("su/catlean/tl" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
