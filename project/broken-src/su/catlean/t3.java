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

public final class t3 extends tt {
@NotNull
public static final t3 s;
private static double l;
private static int H;
private static int F;
private static double y;
@NotNull
private static ArrayList A;
@NotNull
private static ArrayList c;
private static double g;
private static final long a = yz.a(-3441898825856632967L, -1414880216948657166L, MethodHandles.lookup().lookupClass()).a(206634219364825L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] i;
private static final Map j;

private t3(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 55343109458381L;
int var3 = (int)((var1 ^ 55343109458381L) >>> 48);
int var4 = (int)((var1 ^ 55343109458381L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, (short)var5);
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
// 009: ldc2_w 138908704574179
// 00c: lxor
// 00d: lstore 8
// 00f: dup2
// 010: ldc2_w 17529635141180
// 013: lxor
// 014: lstore 10
// 016: dup2
// 017: ldc2_w 38753063586444
// 01a: lxor
// 01b: lstore 12
// 01d: dup2
// 01e: ldc2_w 25377842513472
// 021: lxor
// 022: dup2
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 14
// 029: dup2
// 02a: bipush 16
// 02c: lshl
// 02d: bipush 32
// 02f: lushr
// 030: l2i
// 031: istore 15
// 033: dup2
// 034: bipush 48
// 036: lshl
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 16
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 56047677749854
// 042: lxor
// 043: dup2
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 17
// 04a: dup2
// 04b: bipush 16
// 04d: lshl
// 04e: bipush 32
// 050: lushr
// 051: l2i
// 052: istore 18
// 054: dup2
// 055: bipush 48
// 057: lshl
// 058: bipush 48
// 05a: lushr
// 05b: l2i
// 05c: istore 19
// 05e: pop2
// 05f: dup2
// 060: ldc2_w 43306842265647
// 063: lxor
// 064: lstore 20
// 066: pop2
// 067: ldc2_w -3889368070291334691
// 06a: lload 2
// 06b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: aload 1
// 071: sipush 1655
// 074: ldc2_w 4009490306158236939
// 077: lload 2
// 078: lxor
// 079: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/t3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 081: aload 4
// 083: sipush 3913
// 086: ldc2_w 6530542890145881140
// 089: lload 2
// 08a: lxor
// 08b: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/t3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 093: aload 1
// 094: getfield net/minecraft/class_1297.field_6012 I
// 097: i2d
// 098: ldc 4.0
// 09a: f2d
// 09b: ddiv
// 09c: dstore 23
// 09e: aload 1
// 09f: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 0a2: invokevirtual net/minecraft/class_238.method_17939 ()D
// 0a5: ldc2_w 2.3
// 0a8: ddiv
// 0a9: dload 23
// 0ab: invokestatic java/lang/Math.toRadians (D)D
// 0ae: invokestatic java/lang/Math.sin (D)D
// 0b1: dmul
// 0b2: dstore 25
// 0b4: aload 1
// 0b5: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 0b8: invokevirtual net/minecraft/class_238.method_17940 ()D
// 0bb: ldc2_w 10.0
// 0be: ddiv
// 0bf: dload 23
// 0c1: ldc2_w 10.0
// 0c4: dadd
// 0c5: invokestatic java/lang/Math.toRadians (D)D
// 0c8: invokestatic java/lang/Math.sin (D)D
// 0cb: dmul
// 0cc: dstore 27
// 0ce: aload 1
// 0cf: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 0d2: invokevirtual net/minecraft/class_238.method_17941 ()D
// 0d5: ldc2_w 2.3
// 0d8: ddiv
// 0d9: dload 23
// 0db: invokestatic java/lang/Math.toRadians (D)D
// 0de: invokestatic java/lang/Math.cos (D)D
// 0e1: dneg
// 0e2: dmul
// 0e3: dstore 29
// 0e5: astore 22
// 0e7: lload 6
// 0e9: aload 1
// 0ea: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0ed: dload 25
// 0ef: aload 1
// 0f0: invokevirtual net/minecraft/class_1297.method_17682 ()F
// 0f3: f2d
// 0f4: ldc2_w 2.0
// 0f7: ddiv
// 0f8: dload 27
// 0fa: dadd
// 0fb: dload 29
// 0fd: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 100: dup
// 101: sipush 29288
// 104: ldc2_w 8496802699928658198
// 107: lload 2
// 108: lxor
// 109: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/t3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 111: astore 31
// 113: aload 31
// 115: getfield net/minecraft/class_243.field_1350 D
// 118: lload 20
// 11a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 11d: invokevirtual net/minecraft/class_746.method_23321 ()D
// 120: dsub
// 121: aload 31
// 123: getfield net/minecraft/class_243.field_1352 D
// 126: lload 20
// 128: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12b: invokevirtual net/minecraft/class_746.method_23317 ()D
// 12e: dsub
// 12f: invokestatic java/lang/Math.atan2 (DD)D
// 132: invokestatic java/lang/Math.toDegrees (D)D
// 135: sipush 25422
// 138: ldc2_w 9164710777081223462
// 13b: lload 2
// 13c: lxor
// 13d: invokedynamic v (IJ)I bsm=su/catlean/t3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: i2d
// 143: dsub
// 144: aload 4
// 146: invokevirtual su/catlean/_w.q ()F
// 149: f2d
// 14a: dsub
// 14b: invokestatic net/minecraft/class_3532.method_15338 (D)D
// 14e: dstore 32
// 150: aload 31
// 152: getfield net/minecraft/class_243.field_1351 D
// 155: lload 20
// 157: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 15a: lload 6
// 15c: dup2_x1
// 15d: pop2
// 15e: checkcast net/minecraft/class_1297
// 161: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 164: getfield net/minecraft/class_243.field_1351 D
// 167: lload 20
// 169: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16c: lload 20
// 16e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 171: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 174: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 177: f2d
// 178: dadd
// 179: dsub
// 17a: aload 31
// 17c: getfield net/minecraft/class_243.field_1352 D
// 17f: lload 20
// 181: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 184: invokevirtual net/minecraft/class_746.method_23317 ()D
// 187: dsub
// 188: aload 31
// 18a: getfield net/minecraft/class_243.field_1350 D
// 18d: lload 20
// 18f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 192: invokevirtual net/minecraft/class_746.method_23321 ()D
// 195: dsub
// 196: invokestatic java/lang/Math.hypot (DD)D
// 199: invokestatic java/lang/Math.atan2 (DD)D
// 19c: invokestatic java/lang/Math.toDegrees (D)D
// 19f: dneg
// 1a0: aload 4
// 1a2: invokevirtual su/catlean/_w.N ()F
// 1a5: f2d
// 1a6: dsub
// 1a7: dstore 34
// 1a9: getstatic su/catlean/t3.l D
// 1ac: invokestatic java/lang/Math.abs (D)D
// 1af: ldc2_w 300.0
// 1b2: dcmpl
// 1b3: aload 22
// 1b5: ifnonnull 20e
// 1b8: ifgt 1f7
// 1bb: goto 1c8
// 1be: ldc2_w -3886762910636525986
// 1c1: lload 2
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: athrow
// 1c8: getstatic su/catlean/t3.g D
// 1cb: ldc2_w 100.0
// 1ce: dcmpl
// 1cf: aload 22
// 1d1: lload 2
// 1d2: lconst_0
// 1d3: lcmp
// 1d4: ifle 21e
// 1d7: ifnonnull 21c
// 1da: goto 1e7
// 1dd: ldc2_w -3886762910636525986
// 1e0: lload 2
// 1e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: athrow
// 1e7: ifle 219
// 1ea: goto 1f7
// 1ed: ldc2_w -3886762910636525986
// 1f0: lload 2
// 1f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f6: athrow
// 1f7: dconst_0
// 1f8: putstatic su/catlean/t3.l D
// 1fb: bipush 1
// 1fc: bipush 3
// 1fd: bipush 0
// 1fe: invokestatic su/catlean/mf.O (IIZ)I
// 201: goto 20e
// 204: ldc2_w -3886762910636525986
// 207: lload 2
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: putstatic su/catlean/t3.H I
// 211: dconst_0
// 212: putstatic su/catlean/t3.y D
// 215: dconst_0
// 216: putstatic su/catlean/t3.g D
// 219: getstatic su/catlean/t3.H I
// 21c: aload 22
// 21e: lload 2
// 21f: lconst_0
// 220: lcmp
// 221: ifle 284
// 224: ifnonnull 282
// 227: ifle 27f
// 22a: goto 237
// 22d: ldc2_w -3886762910636525986
// 230: lload 2
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: getstatic su/catlean/t3.H I
// 23a: istore 36
// 23c: iload 36
// 23e: bipush -1
// 23f: iadd
// 240: putstatic su/catlean/t3.H I
// 243: dconst_0
// 244: putstatic su/catlean/t3.y D
// 247: ldc 0.15
// 249: ldc 0.4
// 24b: bipush 0
// 24c: invokestatic su/catlean/mf.q (FFZ)F
// 24f: fstore 36
// 251: new su/catlean/_w
// 254: dup
// 255: aload 4
// 257: invokevirtual su/catlean/_w.q ()F
// 25a: fload 36
// 25c: fadd
// 25d: aload 4
// 25f: invokevirtual su/catlean/_w.N ()F
// 262: fload 36
// 264: fconst_2
// 265: fdiv
// 266: fsub
// 267: lload 12
// 269: dup2_x1
// 26a: pop2
// 26b: bipush 0
// 26c: aconst_null
// 26d: sipush 14630
// 270: ldc2_w 4970484379033502530
// 273: lload 2
// 274: lxor
// 275: invokedynamic v (IJ)I bsm=su/catlean/t3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27a: aconst_null
// 27b: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 27e: areturn
// 27f: getstatic su/catlean/t3.F I
// 282: aload 22
// 284: lload 2
// 285: lconst_0
// 286: lcmp
// 287: iflt 2bf
// 28a: ifnonnull 2bd
// 28d: sipush 15033
// 290: ldc2_w 2888695757426557150
// 293: lload 2
// 294: lxor
// 295: invokedynamic v (IJ)I bsm=su/catlean/t3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29a: if_icmple 2d6
// 29d: goto 2aa
// 2a0: ldc2_w -3886762910636525986
// 2a3: lload 2
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: dload 32
// 2ac: ldc2_w 60.0
// 2af: dcmpl
// 2b0: goto 2bd
// 2b3: ldc2_w -3886762910636525986
// 2b6: lload 2
// 2b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bc: athrow
// 2bd: aload 22
// 2bf: ifnonnull 2d3
// 2c2: ifle 2d6
// 2c5: goto 2d2
// 2c8: ldc2_w -3886762910636525986
// 2cb: lload 2
// 2cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d1: athrow
// 2d2: bipush 1
// 2d3: goto 2d7
// 2d6: bipush 0
// 2d7: istore 36
// 2d9: iload 36
// 2db: aload 22
// 2dd: ifnonnull 2f1
// 2e0: ifeq 2f4
// 2e3: goto 2f0
// 2e6: ldc2_w -3886762910636525986
// 2e9: lload 2
// 2ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ef: athrow
// 2f0: bipush 0
// 2f1: putstatic su/catlean/t3.F I
// 2f4: ldc 25.0
// 2f6: ldc 35.0
// 2f8: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 2fb: astore 37
// 2fd: iload 36
// 2ff: ifeq 323
// 302: ldc2_w 84.0
// 305: ldc -1.0
// 307: fconst_1
// 308: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 30b: checkcast kotlin/ranges/ClosedRange
// 30e: bipush 0
// 30f: lload 10
// 311: invokestatic su/catlean/mf.G (Lkotlin/ranges/ClosedRange;ZJ)F
// 314: f2d
// 315: dadd
// 316: goto 32f
// 319: ldc2_w -3886762910636525986
// 31c: lload 2
// 31d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 322: athrow
// 323: aload 37
// 325: checkcast kotlin/ranges/ClosedRange
// 328: bipush 1
// 329: lload 10
// 32b: invokestatic su/catlean/mf.G (Lkotlin/ranges/ClosedRange;ZJ)F
// 32e: f2d
// 32f: dstore 38
// 331: ldc2_w -5.1
// 334: ldc2_w 5.1
// 337: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 33a: iload 14
// 33c: i2c
// 33d: swap
// 33e: checkcast kotlin/ranges/ClosedRange
// 341: iload 15
// 343: bipush 1
// 344: iload 16
// 346: i2c
// 347: invokestatic su/catlean/mf.x (CLkotlin/ranges/ClosedRange;IZC)D
// 34a: invokestatic java/lang/Math.abs (D)D
// 34d: dstore 40
// 34f: aload 22
// 351: ifnonnull 3aa
// 354: lload 20
// 356: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 359: getfield net/minecraft/class_746.field_6012 I
// 35c: bipush 2
// 35d: sipush 12964
// 360: ldc2_w 447276373413726401
// 363: lload 2
// 364: lxor
// 365: invokedynamic v (IJ)I bsm=su/catlean/t3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36a: bipush 0
// 36b: invokestatic su/catlean/mf.O (IIZ)I
// 36e: irem
// 36f: ifne 387
// 372: goto 37f
// 375: ldc2_w -3886762910636525986
// 378: lload 2
// 379: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37e: athrow
// 37f: dload 38
// 381: ldc 10.0
// 383: f2d
// 384: ddiv
// 385: dstore 38
// 387: dload 32
// 389: dload 38
// 38b: dneg
// 38c: dload 38
// 38e: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 391: dstore 32
// 393: dload 34
// 395: dload 40
// 397: dneg
// 398: dload 40
// 39a: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 39d: dstore 34
// 39f: dload 34
// 3a1: dload 32
// 3a3: ldc 20.0
// 3a5: f2d
// 3a6: ddiv
// 3a7: dadd
// 3a8: dstore 34
// 3aa: aload 4
// 3ac: invokevirtual su/catlean/_w.q ()F
// 3af: dload 32
// 3b1: d2f
// 3b2: fadd
// 3b3: fstore 42
// 3b5: aload 4
// 3b7: invokevirtual su/catlean/_w.N ()F
// 3ba: dload 34
// 3bc: d2f
// 3bd: fadd
// 3be: fstore 43
// 3c0: aload 1
// 3c1: invokevirtual net/minecraft/class_1297.method_33571 ()Lnet/minecraft/class_243;
// 3c4: lload 20
// 3c6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3c9: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 3cc: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 3cf: ldc2_w 1.5
// 3d2: dcmpg
// 3d3: aload 22
// 3d5: ifnonnull 3e9
// 3d8: ifge 3ec
// 3db: goto 3e8
// 3de: ldc2_w -3886762910636525986
// 3e1: lload 2
// 3e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e7: athrow
// 3e8: bipush 1
// 3e9: goto 3ed
// 3ec: bipush 0
// 3ed: istore 44
// 3ef: iload 44
// 3f1: ifeq 427
// 3f4: ldc -40.0
// 3f6: lload 20
// 3f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3fb: getfield net/minecraft/class_746.field_6012 I
// 3fe: sipush 1586
// 401: ldc2_w 4818234163957185617
// 404: lload 2
// 405: lxor
// 406: invokedynamic v (IJ)I bsm=su/catlean/t3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40b: irem
// 40c: i2f
// 40d: ldc 25.0
// 40f: fdiv
// 410: fadd
// 411: ldc -0.1
// 413: ldc 0.1
// 415: bipush 0
// 416: invokestatic su/catlean/mf.q (FFZ)F
// 419: fadd
// 41a: goto 429
// 41d: ldc2_w -3886762910636525986
// 420: lload 2
// 421: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 426: athrow
// 427: ldc -90.0
// 429: fstore 45
// 42b: iload 44
// 42d: ifeq 463
// 430: ldc 60.0
// 432: lload 20
// 434: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 437: getfield net/minecraft/class_746.field_6012 I
// 43a: sipush 1970
// 43d: ldc2_w 5753555358921407955
// 440: lload 2
// 441: lxor
// 442: invokedynamic v (IJ)I bsm=su/catlean/t3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 447: irem
// 448: i2f
// 449: ldc 25.0
// 44b: fdiv
// 44c: fadd
// 44d: ldc -0.1
// 44f: ldc 0.1
// 451: bipush 0
// 452: invokestatic su/catlean/mf.q (FFZ)F
// 455: fadd
// 456: goto 465
// 459: ldc2_w -3886762910636525986
// 45c: lload 2
// 45d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 462: athrow
// 463: ldc 90.0
// 465: fstore 46
// 467: getstatic su/catlean/t3.l D
// 46a: dload 32
// 46c: dadd
// 46d: putstatic su/catlean/t3.l D
// 470: dload 32
// 472: ldc2_w 20.0
// 475: dcmpg
// 476: aload 22
// 478: ifnonnull 4b2
// 47b: ifge 4a2
// 47e: goto 48b
// 481: ldc2_w -3886762910636525986
// 484: lload 2
// 485: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48a: athrow
// 48b: getstatic su/catlean/t3.F I
// 48e: istore 47
// 490: iload 47
// 492: bipush 1
// 493: iadd
// 494: putstatic su/catlean/t3.F I
// 497: aload 22
// 499: lload 2
// 49a: lconst_0
// 49b: lcmp
// 49c: ifle 505
// 49f: ifnull 4bb
// 4a2: getstatic su/catlean/t3.F I
// 4a5: goto 4b2
// 4a8: ldc2_w -3886762910636525986
// 4ab: lload 2
// 4ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b1: athrow
// 4b2: istore 47
// 4b4: iload 47
// 4b6: bipush -1
// 4b7: iadd
// 4b8: putstatic su/catlean/t3.F I
// 4bb: fload 42
// 4bd: ldc -2.0
// 4bf: fconst_2
// 4c0: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 4c3: checkcast kotlin/ranges/ClosedRange
// 4c6: bipush 0
// 4c7: lload 10
// 4c9: invokestatic su/catlean/mf.G (Lkotlin/ranges/ClosedRange;ZJ)F
// 4cc: fadd
// 4cd: fstore 42
// 4cf: fload 43
// 4d1: ldc -0.5
// 4d3: ldc 0.5
// 4d5: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 4d8: checkcast kotlin/ranges/ClosedRange
// 4db: bipush 0
// 4dc: lload 10
// 4de: invokestatic su/catlean/mf.G (Lkotlin/ranges/ClosedRange;ZJ)F
// 4e1: fadd
// 4e2: fstore 43
// 4e4: getstatic su/catlean/t3.A Ljava/util/ArrayList;
// 4e7: fload 42
// 4e9: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 4ec: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 4ef: pop
// 4f0: getstatic su/catlean/t3.c Ljava/util/ArrayList;
// 4f3: dload 32
// 4f5: d2f
// 4f6: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 4f9: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 4fc: lload 2
// 4fd: lconst_0
// 4fe: lcmp
// 4ff: ifle 50e
// 502: pop
// 503: aload 22
// 505: ifnonnull 574
// 508: getstatic su/catlean/t3.A Ljava/util/ArrayList;
// 50b: invokevirtual java/util/ArrayList.size ()I
// 50e: sipush 4817
// 511: ldc2_w 7833581305339390131
// 514: lload 2
// 515: lxor
// 516: invokedynamic v (IJ)I bsm=su/catlean/t3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51b: if_icmplt 554
// 51e: goto 52b
// 521: ldc2_w -3886762910636525986
// 524: lload 2
// 525: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52a: athrow
// 52b: aload 0
// 52c: aload 0
// 52d: getstatic su/catlean/t3.A Ljava/util/ArrayList;
// 530: checkcast java/util/List
// 533: iload 17
// 535: i2c
// 536: iload 18
// 538: iload 19
// 53a: invokespecial su/catlean/t3.N (Ljava/util/List;CII)Ljava/util/List;
// 53d: lload 8
// 53f: invokespecial su/catlean/t3.v (Ljava/util/List;J)F
// 542: fstore 47
// 544: getstatic su/catlean/t3.g D
// 547: fload 47
// 549: f2d
// 54a: dadd
// 54b: putstatic su/catlean/t3.g D
// 54e: getstatic su/catlean/t3.A Ljava/util/ArrayList;
// 551: invokevirtual java/util/ArrayList.clear ()V
// 554: getstatic su/catlean/t3.y D
// 557: ldc2_w 0.1
// 55a: ldc2_w 0.3
// 55d: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 560: iload 14
// 562: i2c
// 563: swap
// 564: checkcast kotlin/ranges/ClosedRange
// 567: iload 15
// 569: bipush 0
// 56a: iload 16
// 56c: i2c
// 56d: invokestatic su/catlean/mf.x (CLkotlin/ranges/ClosedRange;IZC)D
// 570: dadd
// 571: putstatic su/catlean/t3.y D
// 574: new su/catlean/_w
// 577: dup
// 578: fload 42
// 57a: fload 43
// 57c: fload 45
// 57e: fload 46
// 580: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 583: lload 12
// 585: dup2_x1
// 586: pop2
// 587: bipush 0
// 588: aconst_null
// 589: sipush 18420
// 58c: ldc2_w 7257829509271354770
// 58f: lload 2
// 590: lxor
// 591: invokedynamic v (IJ)I bsm=su/catlean/t3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 596: aconst_null
// 597: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 59a: areturn
}

private final List N(List param1, char param2, int param3, int param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/t3.a J
// 01b: lxor
// 01c: lstore 5
// 01e: ldc2_w -8304035160081981671
// 021: lload 5
// 023: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: new java/util/ArrayList
// 02b: dup
// 02c: invokespecial java/util/ArrayList.<init> ()V
// 02f: checkcast java/util/List
// 032: astore 8
// 034: astore 7
// 036: aload 1
// 037: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 03c: astore 9
// 03e: aload 9
// 040: invokeinterface java/util/Iterator.hasNext ()Z 1
// 045: ifeq 085
// 048: aload 9
// 04a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 04f: checkcast java/lang/Number
// 052: invokevirtual java/lang/Number.floatValue ()F
// 055: fstore 10
// 057: iload 2
// 058: iflt 06d
// 05b: aload 8
// 05d: fload 10
// 05f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 062: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 067: aload 7
// 069: ifnonnull 086
// 06c: pop
// 06d: aload 7
// 06f: ifnull 03e
// 072: iload 4
// 074: ifle 057
// 077: goto 085
// 07a: ldc2_w -8301429450681814886
// 07d: lload 5
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: bipush 0
// 086: istore 9
// 088: iload 9
// 08a: sipush 31307
// 08d: ldc2_w 4575132926137337583
// 090: lload 5
// 092: lxor
// 093: invokedynamic v (IJ)I bsm=su/catlean/t3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: if_icmpge 14e
// 09b: new java/util/ArrayList
// 09e: dup
// 09f: invokespecial java/util/ArrayList.<init> ()V
// 0a2: checkcast java/util/List
// 0a5: astore 10
// 0a7: ldc 1.4E-45
// 0a9: fstore 11
// 0ab: aload 8
// 0ad: aload 7
// 0af: ifnonnull 154
// 0b2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0b7: astore 12
// 0b9: aload 12
// 0bb: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c0: ifeq 131
// 0c3: aload 12
// 0c5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0ca: checkcast java/lang/Number
// 0cd: invokevirtual java/lang/Number.floatValue ()F
// 0d0: fstore 13
// 0d2: fload 11
// 0d4: ldc 1.4E-45
// 0d6: fcmpg
// 0d7: aload 7
// 0d9: ifnonnull 08a
// 0dc: aload 7
// 0de: iload 4
// 0e0: iflt 0d9
// 0e3: ifnonnull 0f8
// 0e6: ifne 0fb
// 0e9: goto 0f7
// 0ec: ldc2_w -8301429450681814886
// 0ef: lload 5
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: bipush 1
// 0f8: goto 0fc
// 0fb: bipush 0
// 0fc: ifeq 10c
// 0ff: fload 13
// 101: fstore 11
// 103: aload 7
// 105: iload 3
// 106: iflt 12e
// 109: ifnull 0b9
// 10c: aload 10
// 10e: fload 13
// 110: f2d
// 111: invokestatic java/lang/Math.abs (D)D
// 114: fload 11
// 116: f2d
// 117: invokestatic java/lang/Math.abs (D)D
// 11a: dsub
// 11b: invokestatic java/lang/Math.abs (D)D
// 11e: d2f
// 11f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 122: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 127: pop
// 128: fload 13
// 12a: fstore 11
// 12c: aload 7
// 12e: ifnull 0b9
// 131: new java/util/ArrayList
// 134: dup
// 135: aload 10
// 137: checkcast java/util/Collection
// 13a: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
// 13d: checkcast java/util/List
// 140: astore 8
// 142: iinc 9 1
// 145: aload 7
// 147: iload 2
// 148: iflt 0ca
// 14b: ifnull 088
// 14e: iload 2
// 14f: iflt 09b
// 152: aload 8
// 154: areturn
}

private final float v(List var1, long var2) {
var2 = a ^ var2;
String var10000 = vm.a<"Å">(-4864053987027472476L, var2);
List var5 = var1.stream().sorted().collect(Collectors.toList());
int var6 = var5.size();
float var7 = 0.0F;
String var4 = var10000;
int var8 = 0;

while (true) {
if (var8 < var6) {
float var11 = (var8 + 1.0F) / var6;
Object var10001 = var5.get(var8);
Intrinsics.checkNotNullExpressionValue(var10001, b<"p">(4770, 4968298790031718308L ^ var2));
float var9 = Math.abs(var11 - ((Number)var10001).floatValue());
if (var2 > 0L) {
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
long var20 = a ^ 136193875155883L;
long var22 = var20 ^ 26241793922302L;
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
String var15 = "³ðg6A°vï\u0012ôNÀAYÙrü~ácâ¸üß\u0018þel<gm\u0002çJg÷Â\u00018\u0016C\u0004\u0095å\u00adM©m ";
int var17 = "³ðg6A°vï\u0012ôNÀAYÙrü~ácâ¸üß\u0018þel<gm\u0002çJg÷Â\u00018\u0016C\u0004\u0095å\u00adM©m ".length();
char var14 = 24;
int var26 = -1;

label54:
while (true) {
String var27 = var15.substring(++var26, var26 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var26 += var14) >= var17) {
b = var18;
d = new String[4];
j = new HashMap(13);
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
String var4 = "¾Z~!\u008c?K\"\u0000w>®cuÑ\u000f\u0018\u009a£\u0002\u001bs<¥\u0012¥=.ÑU\u009b¹\u00ad\u009eÇl\u0087&\u0003\f\u009b\u0088\u0013Í¢K$/Åç\u0003Â¢\u0092^î";
int var5 = "¾Z~!\u008c?K\"\u0000w>®cuÑ\u000f\u0018\u009a£\u0002\u001bs<¥\u0012¥=.ÑU\u009b¹\u00ad\u009eÇl\u0087&\u0003\f\u009b\u0088\u0013Í¢K$/Åç\u0003Â¢\u0092^î"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var30[var10001] = var47;
if (var2 >= var5) {
f = var6;
i = new Integer[9];
s = new t3(var22);
A = new ArrayList();
c = new ArrayList();
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "G\u0007\u0085\u008f÷nð)õ¿óÆ°ËÓ\u001b";
var5 = "G\u0007\u0085\u008f÷nð)õ¿óÆ°ËÓ\u001b".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var14 = var15.charAt(var26);
break;
default:
var18[var16++] = var38;
if ((var26 += var14) < var17) {
var14 = var15.charAt(var26);
continue label54;
}

var15 = "j\t¦gÅy6Â\u0082\u008e{\u0098\bO ; \u009a,,ÏN`Q ·]CiÔ÷leU\u0095\u009fµ¸\u00ad\u008c\u0084ÄÖ\\æ¶\nY¬";
var17 = "j\t¦gÅy6Â\u0082\u008e{\u0098\bO ; \u009a,,ÏN`Q ·]CiÔ÷leU\u0095\u009fµ¸\u00ad\u008c\u0084ÄÖ\\æ¶\nY¬".length();
var14 = 16;
var26 = -1;
}

var27 = var15.substring(++var26, var26 + var14);
var10001 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22590;
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
throw new RuntimeException("su/catlean/t3", var10);
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
throw new RuntimeException("su/catlean/t3" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28960;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])j.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/t3", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/t3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
