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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4587;
import net.minecraft.class_630;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Quaternionfc;

public final class lt {
@NotNull
public static final lt o;
private static final long a = yz.a(3667303866055336807L, 2436327542982929003L, MethodHandles.lookup().lookupClass()).a(92525562334414L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private lt() {
}

public final void Y(@NotNull class_4587 stack, @NotNull Color lineColor, long a, @NotNull Color friendLineColor, boolean extraPart) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/lt.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 124146182274850
// 00b: lxor
// 00c: lstore 7
// 00e: dup2
// 00f: ldc2_w 111609026848625
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 9
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 10
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 11
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 129927887514509
// 033: lxor
// 034: lstore 12
// 036: dup2
// 037: ldc2_w 53288099982522
// 03a: lxor
// 03b: lstore 14
// 03d: dup2
// 03e: ldc2_w 90553186455459
// 041: lxor
// 042: lstore 16
// 044: dup2
// 045: ldc2_w 89113805336486
// 048: lxor
// 049: lstore 18
// 04b: dup2
// 04c: ldc2_w 56614423766106
// 04f: lxor
// 050: lstore 20
// 052: dup2
// 053: ldc2_w 88289506636036
// 056: lxor
// 057: lstore 22
// 059: dup2
// 05a: ldc2_w 21615011054070
// 05d: lxor
// 05e: lstore 24
// 060: dup2
// 061: ldc2_w 113119574930590
// 064: lxor
// 065: lstore 26
// 067: dup2
// 068: ldc2_w 134856652207164
// 06b: lxor
// 06c: lstore 28
// 06e: dup2
// 06f: ldc2_w 88516865458018
// 072: lxor
// 073: dup2
// 074: bipush 32
// 076: lushr
// 077: l2i
// 078: istore 30
// 07a: dup2
// 07b: bipush 32
// 07d: lshl
// 07e: bipush 32
// 080: lushr
// 081: lstore 31
// 083: pop2
// 084: dup2
// 085: ldc2_w 44292398015669
// 088: lxor
// 089: dup2
// 08a: bipush 8
// 08c: lushr
// 08d: lstore 33
// 08f: dup2
// 090: bipush 56
// 092: lshl
// 093: bipush 56
// 095: lushr
// 096: l2i
// 097: istore 35
// 099: pop2
// 09a: dup2
// 09b: ldc2_w 36588595309367
// 09e: lxor
// 09f: lstore 36
// 0a1: pop2
// 0a2: ldc2_w -2075124933647935577
// 0a5: lload 3
// 0a6: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: aload 1
// 0ac: sipush 1151
// 0af: ldc2_w 6848351643204487293
// 0b2: lload 3
// 0b3: lxor
// 0b4: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0bc: aload 2
// 0bd: sipush 22866
// 0c0: ldc2_w 6103505437113931101
// 0c3: lload 3
// 0c4: lxor
// 0c5: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0cd: aload 5
// 0cf: sipush 4951
// 0d2: ldc2_w 7982404010952204121
// 0d5: lload 3
// 0d6: lxor
// 0d7: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0df: lload 16
// 0e1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0e4: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 0e7: dup
// 0e8: sipush 11530
// 0eb: ldc2_w 6783439353451389191
// 0ee: lload 3
// 0ef: lxor
// 0f0: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f8: astore 43
// 0fa: bipush 0
// 0fb: istore 44
// 0fd: aload 43
// 0ff: astore 45
// 101: new java/util/ArrayList
// 104: dup
// 105: invokespecial java/util/ArrayList.<init> ()V
// 108: checkcast java/util/Collection
// 10b: astore 46
// 10d: istore 41
// 10f: bipush 0
// 110: istore 47
// 112: aload 45
// 114: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 119: astore 48
// 11b: aload 48
// 11d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 122: ifeq 15d
// 125: aload 48
// 127: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 12c: astore 49
// 12e: aload 49
// 130: instanceof net/minecraft/class_1657
// 133: lload 3
// 134: lconst_0
// 135: lcmp
// 136: ifle 15a
// 139: iload 41
// 13b: ifeq 157
// 13e: ifeq 11b
// 141: goto 14e
// 144: ldc2_w -2072666079028620423
// 147: lload 3
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: aload 46
// 150: aload 49
// 152: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 157: pop
// 158: iload 41
// 15a: ifne 11b
// 15d: aload 46
// 15f: checkcast java/util/List
// 162: nop
// 163: astore 42
// 165: aload 42
// 167: invokeinterface java/util/List.isEmpty ()Z 1
// 16c: lload 3
// 16d: lconst_0
// 16e: lcmp
// 16f: iflt 122
// 172: ifeq 180
// 175: return
// 176: ldc2_w -2072666079028620423
// 179: lload 3
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 183: lload 36
// 185: invokevirtual su/catlean/jl.K (J)F
// 188: fstore 43
// 18a: new su/catlean/g7
// 18d: dup
// 18e: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 191: dup
// 192: sipush 1864
// 195: ldc2_w 766567344616311619
// 198: lload 3
// 199: lxor
// 19a: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1a2: sipush 28486
// 1a5: ldc2_w 624403390758093926
// 1a8: lload 3
// 1a9: lxor
// 1aa: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: aload 42
// 1b1: invokeinterface java/util/List.size ()I 1
// 1b6: imul
// 1b7: bipush 1
// 1b8: istore 38
// 1ba: istore 39
// 1bc: astore 40
// 1be: iload 30
// 1c0: lload 31
// 1c2: aload 40
// 1c4: iload 39
// 1c6: iload 38
// 1c8: invokespecial su/catlean/g7.<init> (IJLcom/mojang/blaze3d/vertex/VertexFormat;IZ)V
// 1cb: astore 44
// 1cd: lload 7
// 1cf: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1d2: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 1d5: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 1d8: dup
// 1d9: sipush 24890
// 1dc: ldc2_w 5843870660549143867
// 1df: lload 3
// 1e0: lxor
// 1e1: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e9: astore 45
// 1eb: aload 42
// 1ed: checkcast java/lang/Iterable
// 1f0: astore 46
// 1f2: bipush 0
// 1f3: istore 47
// 1f5: aload 46
// 1f7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1fc: astore 48
// 1fe: aload 48
// 200: invokeinterface java/util/Iterator.hasNext ()Z 1
// 205: ifeq ac2
// 208: aload 48
// 20a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 20f: astore 49
// 211: aload 49
// 213: checkcast net/minecraft/class_1657
// 216: astore 50
// 218: bipush 0
// 219: istore 51
// 21b: iload 41
// 21d: lload 3
// 21e: lconst_0
// 21f: lcmp
// 220: iflt 228
// 223: ifeq b2c
// 226: iload 41
// 228: ifeq 2ff
// 22b: goto 238
// 22e: ldc2_w -2072666079028620423
// 231: lload 3
// 232: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: athrow
// 238: lload 3
// 239: lconst_0
// 23a: lcmp
// 23b: ifle 2f2
// 23e: lload 7
// 240: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 243: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 246: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 249: getstatic net/minecraft/class_5498.field_26664 Lnet/minecraft/class_5498;
// 24c: if_acmpne 2c1
// 24f: goto 25c
// 252: ldc2_w -2072666079028620423
// 255: lload 3
// 256: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: athrow
// 25c: getstatic su/catlean/ea.D Lsu/catlean/ea;
// 25f: lload 20
// 261: invokevirtual su/catlean/ea.f (J)Z
// 264: iload 41
// 266: ifeq 306
// 269: goto 276
// 26c: ldc2_w -2072666079028620423
// 26f: lload 3
// 270: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 275: athrow
// 276: ifne 2c1
// 279: goto 286
// 27c: ldc2_w -2072666079028620423
// 27f: lload 3
// 280: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 285: athrow
// 286: lload 7
// 288: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 28b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 28e: aload 50
// 290: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 293: lload 3
// 294: lconst_0
// 295: lcmp
// 296: ifle 306
// 299: iload 41
// 29b: ifeq 306
// 29e: goto 2ab
// 2a1: ldc2_w -2072666079028620423
// 2a4: lload 3
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: lload 3
// 2ac: lconst_0
// 2ad: lcmp
// 2ae: iflt abf
// 2b1: ifne abc
// 2b4: goto 2c1
// 2b7: ldc2_w -2072666079028620423
// 2ba: lload 3
// 2bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c0: athrow
// 2c1: aload 1
// 2c2: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 2c5: aload 1
// 2c6: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 2c9: aload 45
// 2cb: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 2ce: fneg
// 2cf: ldc 180.0
// 2d1: fadd
// 2d2: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 2d7: checkcast org/joml/Quaternionfc
// 2da: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 2dd: aload 1
// 2de: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 2e1: aload 45
// 2e3: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 2e6: fneg
// 2e7: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 2ec: checkcast org/joml/Quaternionfc
// 2ef: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 2f2: goto 2ff
// 2f5: ldc2_w -2072666079028620423
// 2f8: lload 3
// 2f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fe: athrow
// 2ff: aload 50
// 301: lload 18
// 303: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 306: ifeq 318
// 309: aload 5
// 30b: goto 319
// 30e: ldc2_w -2072666079028620423
// 311: lload 3
// 312: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 317: athrow
// 318: aload 2
// 319: astore 52
// 31b: lload 33
// 31d: iload 35
// 31f: i2b
// 320: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 323: aload 50
// 325: fconst_0
// 326: bipush 2
// 327: aconst_null
// 328: invokestatic su/catlean/zi.I (JBLsu/catlean/zi;Lnet/minecraft/class_1657;FILjava/lang/Object;)Lnet/minecraft/class_243;
// 32b: astore 53
// 32d: lload 7
// 32f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 332: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 335: aload 50
// 337: checkcast net/minecraft/class_1297
// 33a: invokevirtual net/minecraft/class_898.method_3953 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_897;
// 33d: dup
// 33e: sipush 6088
// 341: ldc2_w 2903304491273493442
// 344: lload 3
// 345: lxor
// 346: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 34e: checkcast net/minecraft/class_1007
// 351: invokevirtual net/minecraft/class_1007.method_4038 ()Lnet/minecraft/class_583;
// 354: dup
// 355: sipush 14154
// 358: ldc2_w 9216547586505653069
// 35b: lload 3
// 35c: lxor
// 35d: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 362: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 365: checkcast net/minecraft/class_591
// 368: astore 54
// 36a: lload 7
// 36c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 36f: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 372: aload 50
// 374: checkcast net/minecraft/class_1297
// 377: invokevirtual net/minecraft/class_898.method_3953 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_897;
// 37a: aload 50
// 37c: checkcast net/minecraft/class_1297
// 37f: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 382: iload 9
// 384: iload 10
// 386: i2c
// 387: iload 11
// 389: invokevirtual su/catlean/zi.n (ICI)F
// 38c: invokevirtual net/minecraft/class_897.method_62425 (Lnet/minecraft/class_1297;F)Lnet/minecraft/class_10017;
// 38f: astore 55
// 391: aload 55
// 393: sipush 10139
// 396: ldc2_w 7267390037253827486
// 399: lload 3
// 39a: lxor
// 39b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 3a3: aload 55
// 3a5: checkcast net/minecraft/class_10055
// 3a8: astore 56
// 3aa: aload 50
// 3ac: lload 22
// 3ae: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3b1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3b4: ifeq 438
// 3b7: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 3ba: invokevirtual su/catlean/_8.H ()Lsu/catlean/_w;
// 3bd: lload 3
// 3be: lconst_0
// 3bf: lcmp
// 3c0: iflt 3f8
// 3c3: iload 41
// 3c5: ifeq 3f8
// 3c8: goto 3d5
// 3cb: ldc2_w -2072666079028620423
// 3ce: lload 3
// 3cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d4: athrow
// 3d5: ifnull 438
// 3d8: goto 3e5
// 3db: ldc2_w -2072666079028620423
// 3de: lload 3
// 3df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: athrow
// 3e5: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 3e8: invokevirtual su/catlean/_8.c ()Lsu/catlean/_w;
// 3eb: goto 3f8
// 3ee: ldc2_w -2072666079028620423
// 3f1: lload 3
// 3f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f7: athrow
// 3f8: ifnull 438
// 3fb: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3fe: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 401: invokevirtual su/catlean/_8.H ()Lsu/catlean/_w;
// 404: dup
// 405: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 408: invokevirtual su/catlean/_w.q ()F
// 40b: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 40e: invokevirtual su/catlean/_8.c ()Lsu/catlean/_w;
// 411: dup
// 412: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 415: invokevirtual su/catlean/_w.q ()F
// 418: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 41b: iload 9
// 41d: iload 10
// 41f: i2c
// 420: iload 11
// 422: invokevirtual su/catlean/zi.n (ICI)F
// 425: invokevirtual su/catlean/jl.B (FFF)F
// 428: invokestatic net/minecraft/class_3532.method_15393 (F)F
// 42b: goto 447
// 42e: ldc2_w -2072666079028620423
// 431: lload 3
// 432: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 437: athrow
// 438: fload 43
// 43a: aload 50
// 43c: getfield net/minecraft/class_1657.field_6220 F
// 43f: aload 50
// 441: getfield net/minecraft/class_1657.field_6283 F
// 444: invokestatic net/minecraft/class_3532.method_17821 (FFF)F
// 447: fstore 55
// 449: aload 50
// 44b: iload 41
// 44d: ifeq 47f
// 450: lload 22
// 452: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 455: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 458: ifeq 47d
// 45b: goto 468
// 45e: ldc2_w -2072666079028620423
// 461: lload 3
// 462: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 467: athrow
// 468: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 46b: lload 14
// 46d: invokevirtual su/catlean/dm.w (J)F
// 470: goto 484
// 473: ldc2_w -2072666079028620423
// 476: lload 3
// 477: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47c: athrow
// 47d: aload 50
// 47f: fload 43
// 481: invokevirtual net/minecraft/class_1657.method_5695 (F)F
// 484: fstore 57
// 486: aload 54
// 488: aload 56
// 48a: invokevirtual net/minecraft/class_591.method_62110 (Lnet/minecraft/class_10055;)V
// 48d: aload 50
// 48f: invokevirtual net/minecraft/class_1657.method_20232 ()Z
// 492: istore 58
// 494: aload 50
// 496: invokevirtual net/minecraft/class_1657.method_5715 ()Z
// 499: istore 59
// 49b: aload 50
// 49d: invokevirtual net/minecraft/class_1657.method_6128 ()Z
// 4a0: istore 60
// 4a2: aload 1
// 4a3: aload 53
// 4a5: getfield net/minecraft/class_243.field_1352 D
// 4a8: aload 53
// 4aa: getfield net/minecraft/class_243.field_1351 D
// 4ad: aload 53
// 4af: getfield net/minecraft/class_243.field_1350 D
// 4b2: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 4b5: iload 58
// 4b7: lload 3
// 4b8: lconst_0
// 4b9: lcmp
// 4ba: ifle 521
// 4bd: iload 41
// 4bf: ifeq 521
// 4c2: ifeq 4e7
// 4c5: goto 4d2
// 4c8: ldc2_w -2072666079028620423
// 4cb: lload 3
// 4cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d1: athrow
// 4d2: aload 1
// 4d3: fconst_0
// 4d4: ldc 0.35
// 4d6: fconst_0
// 4d7: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 4da: goto 4e7
// 4dd: ldc2_w -2072666079028620423
// 4e0: lload 3
// 4e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e6: athrow
// 4e7: lload 3
// 4e8: lconst_0
// 4e9: lcmp
// 4ea: iflt 512
// 4ed: aload 1
// 4ee: getstatic net/minecraft/class_7833.field_40715 Lnet/minecraft/class_7833;
// 4f1: fload 55
// 4f3: sipush 28085
// 4f6: ldc2_w 8846480529312056978
// 4f9: lload 3
// 4fa: lxor
// 4fb: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 500: i2f
// 501: fadd
// 502: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 507: checkcast org/joml/Quaternionfc
// 50a: iload 41
// 50c: ifeq 57e
// 50f: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 512: iload 58
// 514: goto 521
// 517: ldc2_w -2072666079028620423
// 51a: lload 3
// 51b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 520: athrow
// 521: lload 3
// 522: lconst_0
// 523: lcmp
// 524: iflt 52c
// 527: ifne 554
// 52a: iload 60
// 52c: lload 3
// 52d: lconst_0
// 52e: lcmp
// 52f: iflt 583
// 532: iload 41
// 534: ifeq 583
// 537: goto 544
// 53a: ldc2_w -2072666079028620423
// 53d: lload 3
// 53e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 543: athrow
// 544: ifeq 581
// 547: goto 554
// 54a: ldc2_w -2072666079028620423
// 54d: lload 3
// 54e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 553: athrow
// 554: aload 1
// 555: getstatic net/minecraft/class_7833.field_40713 Lnet/minecraft/class_7833;
// 558: sipush 12915
// 55b: ldc2_w 6107075511304575325
// 55e: lload 3
// 55f: lxor
// 560: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 565: i2f
// 566: fload 57
// 568: fadd
// 569: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 56e: checkcast org/joml/Quaternionfc
// 571: goto 57e
// 574: ldc2_w -2072666079028620423
// 577: lload 3
// 578: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57d: athrow
// 57e: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 581: iload 58
// 583: ifeq 59b
// 586: aload 1
// 587: fconst_0
// 588: ldc -0.95
// 58a: fconst_0
// 58b: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 58e: goto 59b
// 591: ldc2_w -2072666079028620423
// 594: lload 3
// 595: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59a: athrow
// 59b: aload 44
// 59d: aload 1
// 59e: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 5a1: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 5a4: dup
// 5a5: sipush 5455
// 5a8: ldc2_w 6913517456846625095
// 5ab: lload 3
// 5ac: lxor
// 5ad: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5b5: fconst_0
// 5b6: iload 59
// 5b8: ifeq 5ca
// 5bb: ldc 0.6
// 5bd: goto 5cc
// 5c0: ldc2_w -2072666079028620423
// 5c3: lload 3
// 5c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c9: athrow
// 5ca: ldc 0.7
// 5cc: iload 59
// 5ce: ifeq 5e0
// 5d1: ldc 0.23
// 5d3: goto 5e1
// 5d6: ldc2_w -2072666079028620423
// 5d9: lload 3
// 5da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5df: athrow
// 5e0: fconst_0
// 5e1: lload 26
// 5e3: dup2_x2
// 5e4: pop2
// 5e5: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 5e8: aload 52
// 5ea: lload 24
// 5ec: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 5ef: aload 1
// 5f0: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 5f3: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 5f6: dup
// 5f7: sipush 5455
// 5fa: ldc2_w 6913517456846625095
// 5fd: lload 3
// 5fe: lxor
// 5ff: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 604: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 607: fconst_0
// 608: iload 59
// 60a: ifeq 61c
// 60d: ldc 1.05
// 60f: goto 61e
// 612: ldc2_w -2072666079028620423
// 615: lload 3
// 616: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61b: athrow
// 61c: ldc 1.4
// 61e: lload 3
// 61f: lconst_0
// 620: lcmp
// 621: ifle 654
// 624: fconst_0
// 625: lload 26
// 627: dup2_x2
// 628: pop2
// 629: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 62c: aload 52
// 62e: lload 24
// 630: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 633: aload 1
// 634: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 637: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 63a: dup
// 63b: sipush 5455
// 63e: ldc2_w 6913517456846625095
// 641: lload 3
// 642: lxor
// 643: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 648: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 64b: ldc -0.37
// 64d: iload 59
// 64f: ifeq 661
// 652: ldc 1.05
// 654: goto 663
// 657: ldc2_w -2072666079028620423
// 65a: lload 3
// 65b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 660: athrow
// 661: ldc 1.35
// 663: lload 3
// 664: lconst_0
// 665: lcmp
// 666: ifle 699
// 669: fconst_0
// 66a: lload 26
// 66c: dup2_x2
// 66d: pop2
// 66e: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 671: aload 52
// 673: lload 24
// 675: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 678: aload 1
// 679: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 67c: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 67f: dup
// 680: sipush 5455
// 683: ldc2_w 6913517456846625095
// 686: lload 3
// 687: lxor
// 688: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 690: ldc 0.37
// 692: iload 59
// 694: ifeq 6a6
// 697: ldc 1.05
// 699: goto 6a8
// 69c: ldc2_w -2072666079028620423
// 69f: lload 3
// 6a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a5: athrow
// 6a6: ldc 1.35
// 6a8: lload 3
// 6a9: lconst_0
// 6aa: lcmp
// 6ab: ifle 6de
// 6ae: fconst_0
// 6af: lload 26
// 6b1: dup2_x2
// 6b2: pop2
// 6b3: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 6b6: aload 52
// 6b8: lload 24
// 6ba: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 6bd: aload 1
// 6be: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 6c1: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 6c4: dup
// 6c5: sipush 5455
// 6c8: ldc2_w 6913517456846625095
// 6cb: lload 3
// 6cc: lxor
// 6cd: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6d5: ldc -0.15
// 6d7: iload 59
// 6d9: ifeq 6eb
// 6dc: ldc 0.6
// 6de: goto 6ed
// 6e1: ldc2_w -2072666079028620423
// 6e4: lload 3
// 6e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ea: athrow
// 6eb: ldc 0.7
// 6ed: iload 59
// 6ef: ifeq 701
// 6f2: ldc 0.23
// 6f4: goto 702
// 6f7: ldc2_w -2072666079028620423
// 6fa: lload 3
// 6fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 700: athrow
// 701: fconst_0
// 702: lload 26
// 704: dup2_x2
// 705: pop2
// 706: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 709: aload 52
// 70b: lload 24
// 70d: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 710: aload 1
// 711: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 714: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 717: dup
// 718: sipush 5455
// 71b: ldc2_w 6913517456846625095
// 71e: lload 3
// 71f: lxor
// 720: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 725: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 728: ldc 0.15
// 72a: iload 59
// 72c: ifeq 73e
// 72f: ldc 0.6
// 731: goto 740
// 734: ldc2_w -2072666079028620423
// 737: lload 3
// 738: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73d: athrow
// 73e: ldc 0.7
// 740: iload 59
// 742: ifeq 754
// 745: ldc 0.23
// 747: goto 755
// 74a: ldc2_w -2072666079028620423
// 74d: lload 3
// 74e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 753: athrow
// 754: fconst_0
// 755: lload 26
// 757: dup2_x2
// 758: pop2
// 759: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 75c: aload 52
// 75e: lload 24
// 760: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 763: pop
// 764: aload 1
// 765: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 768: aload 1
// 769: fconst_0
// 76a: iload 59
// 76c: ifeq 77e
// 76f: ldc 1.05
// 771: goto 780
// 774: ldc2_w -2072666079028620423
// 777: lload 3
// 778: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77d: athrow
// 77e: ldc 1.4
// 780: fconst_0
// 781: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 784: getstatic su/catlean/lt.o Lsu/catlean/lt;
// 787: aload 54
// 789: getfield net/minecraft/class_591.field_3398 Lnet/minecraft/class_630;
// 78c: dup
// 78d: sipush 3100
// 790: ldc2_w 6194370774323429402
// 793: lload 3
// 794: lxor
// 795: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 79d: ldc 0.3
// 79f: lload 12
// 7a1: aload 1
// 7a2: aload 52
// 7a4: aload 44
// 7a6: invokespecial su/catlean/lt.V (Lnet/minecraft/class_630;FJLnet/minecraft/class_4587;Ljava/awt/Color;Lsu/catlean/g7;)V
// 7a9: lload 3
// 7aa: lconst_0
// 7ab: lcmp
// 7ac: ifle 88c
// 7af: iload 41
// 7b1: ifeq 88c
// 7b4: iload 6
// 7b6: ifeq 888
// 7b9: goto 7c6
// 7bc: ldc2_w -2072666079028620423
// 7bf: lload 3
// 7c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c5: athrow
// 7c6: aload 1
// 7c7: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 7ca: aload 1
// 7cb: fconst_0
// 7cc: iload 59
// 7ce: ifeq 7ed
// 7d1: goto 7de
// 7d4: ldc2_w -2072666079028620423
// 7d7: lload 3
// 7d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7dd: athrow
// 7de: ldc 0.5
// 7e0: goto 7ef
// 7e3: ldc2_w -2072666079028620423
// 7e6: lload 3
// 7e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ec: athrow
// 7ed: ldc 0.7
// 7ef: fconst_0
// 7f0: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 7f3: aload 1
// 7f4: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 7f7: aload 54
// 7f9: getfield net/minecraft/class_591.field_3398 Lnet/minecraft/class_630;
// 7fc: getfield net/minecraft/class_630.field_3674 F
// 7ff: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 804: checkcast org/joml/Quaternionfc
// 807: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 80a: aload 1
// 80b: getstatic net/minecraft/class_7833.field_40715 Lnet/minecraft/class_7833;
// 80e: aload 54
// 810: getfield net/minecraft/class_591.field_3398 Lnet/minecraft/class_630;
// 813: getfield net/minecraft/class_630.field_3675 F
// 816: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 81b: checkcast org/joml/Quaternionfc
// 81e: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 821: aload 1
// 822: getstatic net/minecraft/class_7833.field_40713 Lnet/minecraft/class_7833;
// 825: ldc 1.1
// 827: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 82c: checkcast org/joml/Quaternionfc
// 82f: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 832: aload 44
// 834: aload 1
// 835: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 838: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 83b: dup
// 83c: sipush 5455
// 83f: ldc2_w 6913517456846625095
// 842: lload 3
// 843: lxor
// 844: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 849: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 84c: fconst_0
// 84d: lload 26
// 84f: fconst_0
// 850: fconst_0
// 851: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 854: aload 52
// 856: lload 24
// 858: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 85b: aload 1
// 85c: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 85f: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 862: dup
// 863: sipush 5455
// 866: ldc2_w 6913517456846625095
// 869: lload 3
// 86a: lxor
// 86b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 870: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 873: fconst_0
// 874: lload 26
// 876: ldc 0.3
// 878: fconst_0
// 879: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 87c: aload 52
// 87e: lload 24
// 880: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 883: pop
// 884: aload 1
// 885: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 888: aload 1
// 889: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 88c: aload 1
// 88d: ldc 0.15
// 88f: iload 59
// 891: ifeq 8a3
// 894: ldc 0.6
// 896: goto 8a5
// 899: ldc2_w -2072666079028620423
// 89c: lload 3
// 89d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a2: athrow
// 8a3: ldc 0.7
// 8a5: iload 59
// 8a7: ifeq 8b9
// 8aa: ldc 0.23
// 8ac: goto 8ba
// 8af: ldc2_w -2072666079028620423
// 8b2: lload 3
// 8b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b8: athrow
// 8b9: fconst_0
// 8ba: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 8bd: getstatic su/catlean/lt.o Lsu/catlean/lt;
// 8c0: aload 54
// 8c2: getfield net/minecraft/class_591.field_3392 Lnet/minecraft/class_630;
// 8c5: dup
// 8c6: sipush 13535
// 8c9: ldc2_w 9134880949291137244
// 8cc: lload 3
// 8cd: lxor
// 8ce: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 8d6: ldc -0.6
// 8d8: lload 12
// 8da: aload 1
// 8db: aload 52
// 8dd: aload 44
// 8df: invokespecial su/catlean/lt.V (Lnet/minecraft/class_630;FJLnet/minecraft/class_4587;Ljava/awt/Color;Lsu/catlean/g7;)V
// 8e2: aload 1
// 8e3: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 8e6: aload 1
// 8e7: ldc -0.15
// 8e9: iload 59
// 8eb: ifeq 8fd
// 8ee: ldc 0.6
// 8f0: goto 8ff
// 8f3: ldc2_w -2072666079028620423
// 8f6: lload 3
// 8f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8fc: athrow
// 8fd: ldc 0.7
// 8ff: iload 59
// 901: ifeq 913
// 904: ldc 0.23
// 906: goto 914
// 909: ldc2_w -2072666079028620423
// 90c: lload 3
// 90d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 912: athrow
// 913: fconst_0
// 914: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 917: getstatic su/catlean/lt.o Lsu/catlean/lt;
// 91a: aload 54
// 91c: getfield net/minecraft/class_591.field_3397 Lnet/minecraft/class_630;
// 91f: dup
// 920: sipush 5310
// 923: ldc2_w 4684860898869319858
// 926: lload 3
// 927: lxor
// 928: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 930: ldc -0.6
// 932: lload 12
// 934: aload 1
// 935: aload 52
// 937: aload 44
// 939: invokespecial su/catlean/lt.V (Lnet/minecraft/class_630;FJLnet/minecraft/class_4587;Ljava/awt/Color;Lsu/catlean/g7;)V
// 93c: aload 1
// 93d: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 940: aload 1
// 941: ldc 0.37
// 943: iload 59
// 945: ifeq 957
// 948: ldc 1.05
// 94a: goto 959
// 94d: ldc2_w -2072666079028620423
// 950: lload 3
// 951: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 956: athrow
// 957: ldc 1.35
// 959: lload 3
// 95a: lconst_0
// 95b: lcmp
// 95c: ifle 996
// 95f: fconst_0
// 960: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 963: getstatic su/catlean/lt.o Lsu/catlean/lt;
// 966: aload 54
// 968: getfield net/minecraft/class_591.field_3401 Lnet/minecraft/class_630;
// 96b: dup
// 96c: sipush 3616
// 96f: ldc2_w 6832769415199162912
// 972: lload 3
// 973: lxor
// 974: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 979: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 97c: ldc -0.55
// 97e: lload 12
// 980: aload 1
// 981: aload 52
// 983: aload 44
// 985: invokespecial su/catlean/lt.V (Lnet/minecraft/class_630;FJLnet/minecraft/class_4587;Ljava/awt/Color;Lsu/catlean/g7;)V
// 988: aload 1
// 989: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 98c: aload 1
// 98d: ldc -0.37
// 98f: iload 59
// 991: ifeq 9a3
// 994: ldc 1.05
// 996: goto 9a5
// 999: ldc2_w -2072666079028620423
// 99c: lload 3
// 99d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a2: athrow
// 9a3: ldc 1.35
// 9a5: fconst_0
// 9a6: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 9a9: getstatic su/catlean/lt.o Lsu/catlean/lt;
// 9ac: aload 54
// 9ae: getfield net/minecraft/class_591.field_27433 Lnet/minecraft/class_630;
// 9b1: dup
// 9b2: sipush 31853
// 9b5: ldc2_w 6028073345032220777
// 9b8: lload 3
// 9b9: lxor
// 9ba: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/lt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9c2: ldc -0.55
// 9c4: lload 12
// 9c6: aload 1
// 9c7: aload 52
// 9c9: aload 44
// 9cb: invokespecial su/catlean/lt.V (Lnet/minecraft/class_630;FJLnet/minecraft/class_4587;Ljava/awt/Color;Lsu/catlean/g7;)V
// 9ce: iload 58
// 9d0: iload 41
// 9d2: lload 3
// 9d3: lconst_0
// 9d4: lcmp
// 9d5: ifle a04
// 9d8: ifeq a02
// 9db: ifeq a00
// 9de: goto 9eb
// 9e1: ldc2_w -2072666079028620423
// 9e4: lload 3
// 9e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9ea: athrow
// 9eb: aload 1
// 9ec: fconst_0
// 9ed: ldc 0.95
// 9ef: fconst_0
// 9f0: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 9f3: goto a00
// 9f6: ldc2_w -2072666079028620423
// 9f9: lload 3
// 9fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9ff: athrow
// a00: iload 58
// a02: iload 41
// a04: lload 3
// a05: lconst_0
// a06: lcmp
// a07: ifle a27
// a0a: ifeq a1f
// a0d: ifne a3a
// a10: goto a1d
// a13: ldc2_w -2072666079028620423
// a16: lload 3
// a17: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1c: athrow
// a1d: iload 60
// a1f: lload 3
// a20: lconst_0
// a21: lcmp
// a22: iflt a69
// a25: iload 41
// a27: ifeq a69
// a2a: ifeq a67
// a2d: goto a3a
// a30: ldc2_w -2072666079028620423
// a33: lload 3
// a34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a39: athrow
// a3a: aload 1
// a3b: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// a3e: sipush 25329
// a41: ldc2_w 3379466972114553298
// a44: lload 3
// a45: lxor
// a46: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4b: i2f
// a4c: fload 57
// a4e: fadd
// a4f: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// a54: checkcast org/joml/Quaternionfc
// a57: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// a5a: goto a67
// a5d: ldc2_w -2072666079028620423
// a60: lload 3
// a61: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a66: athrow
// a67: iload 58
// a69: ifeq a81
// a6c: aload 1
// a6d: fconst_0
// a6e: ldc -0.35
// a70: fconst_0
// a71: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// a74: goto a81
// a77: ldc2_w -2072666079028620423
// a7a: lload 3
// a7b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a80: athrow
// a81: aload 1
// a82: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// a85: fload 55
// a87: sipush 30401
// a8a: ldc2_w 3449736298635304430
// a8d: lload 3
// a8e: lxor
// a8f: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a94: i2f
// a95: fadd
// a96: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// a9b: checkcast org/joml/Quaternionfc
// a9e: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// aa1: aload 1
// aa2: aload 53
// aa4: getfield net/minecraft/class_243.field_1352 D
// aa7: dneg
// aa8: aload 53
// aaa: getfield net/minecraft/class_243.field_1351 D
// aad: dneg
// aae: aload 53
// ab0: getfield net/minecraft/class_243.field_1350 D
// ab3: dneg
// ab4: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// ab7: aload 1
// ab8: invokevirtual net/minecraft/class_4587.method_22909 ()V
// abb: nop
// abc: nop
// abd: iload 41
// abf: ifne 1fe
// ac2: nop
// ac3: sipush 8752
// ac6: ldc2_w 8948094628709419282
// ac9: lload 3
// aca: lxor
// acb: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ad0: invokestatic org/lwjgl/opengl/GL32C.glEnable (I)V
// ad3: sipush 20321
// ad6: ldc2_w 9201424856783037509
// ad9: lload 3
// ada: lxor
// adb: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae0: sipush 31726
// ae3: ldc2_w 5765930917092954319
// ae6: lload 3
// ae7: lxor
// ae8: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aed: invokestatic org/lwjgl/opengl/GL32C.glHint (II)V
// af0: lload 28
// af2: aload 44
// af4: getstatic su/catlean/b6.R Lsu/catlean/b6;
// af7: invokevirtual su/catlean/b6.w ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// afa: aconst_null
// afb: aconst_null
// afc: aload 1
// afd: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// b00: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// b03: aconst_null
// b04: aconst_null
// b05: sipush 2763
// b08: ldc2_w 4621228136953373165
// b0b: lload 3
// b0c: lxor
// b0d: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b12: aconst_null
// b13: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// b16: sipush 13428
// b19: ldc2_w 8048657595212029777
// b1c: lload 3
// b1d: lxor
// b1e: invokedynamic t (IJ)I bsm=su/catlean/lt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b23: invokestatic org/lwjgl/opengl/GL32C.glDisable (I)V
// b26: lload 3
// b27: lconst_0
// b28: lcmp
// b29: ifle b2c
// b2c: return
}

private final void V(class_630 var1, float var2, long var3, class_4587 var5, Color var6, g7 var7) {
var3 = a ^ var3;
long var8 = var3 ^ 87669790822224L;
long var10 = var3 ^ 117018389532544L;
long var12 = var3 ^ 34241099381480L;
this.m(var5, var1, var8);
Matrix4f var10001 = var5.method_23760().method_23761();
Intrinsics.checkNotNullExpressionValue(var10001, a<"i">(4259, 3663885410575586012L ^ var3));
g7 var10000 = var7.O(var10001, 0.0F, var12, 0.0F, 0.0F).n(var6, var10);
var10001 = var5.method_23760().method_23761();
Intrinsics.checkNotNullExpressionValue(var10001, a<"i">(5455, 6913525408231724849L ^ var3));
var10000.O(var10001, 0.0F, var12, var2, 0.0F).n(var6, var10);
var5.method_22909();
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void m(class_4587 var1, class_630 var2, long var3) {
var3 = a ^ var3;
boolean var5 = vm.a<"Å">(5183244362157552506L, var3);

int var10000;
label100: {
label99: {
try {
float var15;
var10000 = (var15 = var2.field_3674 - 0.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
if (!var5) {
break label100;
}

if (!var10000) {
break label99;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 5179509805078214564L, var3);
}

var10000 = 0;
break label100;
}

var10000 = 1;
}

label91: {
try {
if (var3 < 0L) {
break label91;
}

if (!var10000) {
var1.method_22907((Quaternionfc)class_7833.field_40718.rotation(var2.field_3674));
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 5179509805078214564L, var3);
}

try {
float var16;
var10000 = (var16 = var2.field_3675 - 0.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, 5179509805078214564L, var3);
}
}

label82: {
label81: {
try {
if (!var5) {
break label82;
}

if (!var10000) {
break label81;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 5179509805078214564L, var3);
}

var10000 = 0;
break label82;
}

var10000 = 1;
}

label73: {
try {
if (var3 <= 0L) {
break label73;
}

if (!var10000) {
var1.method_22907((Quaternionfc)class_7833.field_40715.rotation(var2.field_3675));
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 5179509805078214564L, var3);
}

try {
float var17;
var10000 = (var17 = var2.field_3654 - 0.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 5179509805078214564L, var3);
}
}

label64: {
label63: {
try {
if (!var5) {
break label64;
}

if (!var10000) {
break label63;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 5179509805078214564L, var3);
}

var10000 = 0;
break label64;
}

var10000 = 1;
}

try {
if (!var10000) {
var1.method_22907((Quaternionfc)class_7833.field_40713.rotation(var2.field_3654));
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 5179509805078214564L, var3);
}
}

static {
long var11 = a ^ 140611028640746L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[16];
int var18 = 0;
String var17 = "\u0006\u0091ìªá\u000e¸«h+Ò/-ð\u0015ç×/h\u001d¬?E=\u0006\u0015#k°@/\nt¾É<\u0088E\u0014Ô®¹\u0000½¨ÑºÝ)rÀý;\u0088\u0089¹\u00ad;\u008aÅ\u007fÄ\u009d\u0002¯\u0081\u0001\u0086+4F\u00869¥\u0011U«Ñ¼Âõj1§Påç\u0003&«ÖÇ\u0006zñîy\u009c4à[Ï¤Lµ3ä@\u0014\u0089\u001c\u0011\nÓ¹\u0089Ë\u0096\u0010%\u0085¤\f¶\u0082\u008f£\u0012oA«Ú\u0000Ä¾\u0085û!£?Që}\u0014\u001a»z0-ü ¹Ý\u008b«°7}8Ìek¦\u0084È\u0090F\\\u001a%hÙYÿ4\u0084\u009b·\u009d\u0005®ØØÍ£\u0014¹h\u0093D,\u0016#Ñ\u001d\u0099r\u0000>Ü)ðõë±=4\u0096\u001fØ\f§ÇÎ0\u0096<ÀcÅO\u0014ñ\u007f¸YØ\u0083¿1?ð\u0092Ú\u0098\u0083\u001dbbv\u0003&{Á\u0089³ä\tXI´¦I 0! Z\u0006\u000bþ\\\u000e×\u0096üÝÙ\u009e´î\u0015·¤!rºOi88_\u009aÂ\bÀß\u001bÍ \u00078ÃA5\\ê×0kø\u001a@\u00adØæ³\u0005%Ûx@Ï\u0006Lñ-@÷\nàg t\u0094jg|Ýå%J²å\u0095\u0011¯¶\u0084ôJFAåO»Tk\nk\u0002\u0007É\u0090×\u0018\u0099ÄÈ£ôÿNÖE\u001d\u0005¹\u0016ª\u0097\u0096\u009fZC0Ä¸Ã\u0097 AÕE\u001e\u0018á´\u000eUt\u001e\u009dÕ3àPT@/>\u0089ÒÛÉàºò\r¸}ú´\u0010\u001c\t7+\u0013\u00890Êî\u0012·\u009bA|ú 8=¬iïárS\u008aã\t°\u00ad\nÛ¼\u008d¦yr\u0002ií\u0098Rrµ>ãÙÜ\u009a^v\u009cæc¦¾éRSÑ\u0087\"\u0006ÊÊ\u0080Ë\u0088\u001a²ïÌÀ¾\u0010\u001e3Õ\u0080gFã\u0083ØR!RÅhsÿ\u0018^ã\u0085f\u008aõ\u0016\rÍU´óvd:\u000e\u0014zº \u001c11k\u0018\u001eÅ\u0085\u0007©(\u008fl¹\u0091\r(%ñÃ=Ó>ÍK\u007f¢tù(G\u0087¬§\u0007·¥R=§VL0§e\\\u008eñ\rEä~`nñ&¿\"«\u0011g´\u0094öÆy\u0086\u0013ìy\u0010\u001d\u0007Ú×¤YZ(\u009e\u009a[ÏnÌ=[ \u0097$vXðAá\u0006¨¦°D7én\u000f\f\u000bih°åR\u000e\u0006LK¿]\u0089¤ ";
int var19 = "\u0006\u0091ìªá\u000e¸«h+Ò/-ð\u0015ç×/h\u001d¬?E=\u0006\u0015#k°@/\nt¾É<\u0088E\u0014Ô®¹\u0000½¨ÑºÝ)rÀý;\u0088\u0089¹\u00ad;\u008aÅ\u007fÄ\u009d\u0002¯\u0081\u0001\u0086+4F\u00869¥\u0011U«Ñ¼Âõj1§Påç\u0003&«ÖÇ\u0006zñîy\u009c4à[Ï¤Lµ3ä@\u0014\u0089\u001c\u0011\nÓ¹\u0089Ë\u0096\u0010%\u0085¤\f¶\u0082\u008f£\u0012oA«Ú\u0000Ä¾\u0085û!£?Që}\u0014\u001a»z0-ü ¹Ý\u008b«°7}8Ìek¦\u0084È\u0090F\\\u001a%hÙYÿ4\u0084\u009b·\u009d\u0005®ØØÍ£\u0014¹h\u0093D,\u0016#Ñ\u001d\u0099r\u0000>Ü)ðõë±=4\u0096\u001fØ\f§ÇÎ0\u0096<ÀcÅO\u0014ñ\u007f¸YØ\u0083¿1?ð\u0092Ú\u0098\u0083\u001dbbv\u0003&{Á\u0089³ä\tXI´¦I 0! Z\u0006\u000bþ\\\u000e×\u0096üÝÙ\u009e´î\u0015·¤!rºOi88_\u009aÂ\bÀß\u001bÍ \u00078ÃA5\\ê×0kø\u001a@\u00adØæ³\u0005%Ûx@Ï\u0006Lñ-@÷\nàg t\u0094jg|Ýå%J²å\u0095\u0011¯¶\u0084ôJFAåO»Tk\nk\u0002\u0007É\u0090×\u0018\u0099ÄÈ£ôÿNÖE\u001d\u0005¹\u0016ª\u0097\u0096\u009fZC0Ä¸Ã\u0097 AÕE\u001e\u0018á´\u000eUt\u001e\u009dÕ3àPT@/>\u0089ÒÛÉàºò\r¸}ú´\u0010\u001c\t7+\u0013\u00890Êî\u0012·\u009bA|ú 8=¬iïárS\u008aã\t°\u00ad\nÛ¼\u008d¦yr\u0002ií\u0098Rrµ>ãÙÜ\u009a^v\u009cæc¦¾éRSÑ\u0087\"\u0006ÊÊ\u0080Ë\u0088\u001a²ïÌÀ¾\u0010\u001e3Õ\u0080gFã\u0083ØR!RÅhsÿ\u0018^ã\u0085f\u008aõ\u0016\rÍU´óvd:\u000e\u0014zº \u001c11k\u0018\u001eÅ\u0085\u0007©(\u008fl¹\u0091\r(%ñÃ=Ó>ÍK\u007f¢tù(G\u0087¬§\u0007·¥R=§VL0§e\\\u008eñ\rEä~`nñ&¿\"«\u0011g´\u0094öÆy\u0086\u0013ìy\u0010\u001d\u0007Ú×¤YZ(\u009e\u009a[ÏnÌ=[ \u0097$vXðAá\u0006¨¦°D7én\u000f\f\u000bih°åR\u000e\u0006LK¿]\u0089¤ "
.length();
char var16 = 256;
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
c = new String[16];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[10];
int var3 = 0;
String var4 = "í\f\u0003\u0017gå@\u00022·Ú}\u0085Ü\\\u009cU\u001dÓF®\tIÀ@Ðo(°\u007fÇ¿¬Ë\u0082CîV\u0086µ9\u0095\u0019V®ì&µ,Ç\u008aÏ«\u001e3=Cïè\u000e\u0096Ìæ\u0089";
int var5 = "í\f\u0003\u0017gå@\u00022·Ú}\u0085Ü\\\u009cU\u001dÓF®\tIÀ@Ðo(°\u007fÇ¿¬Ë\u0082CîV\u0086µ9\u0095\u0019V®ì&µ,Ç\u008aÏ«\u001e3=Cïè\u000e\u0096Ìæ\u0089"
.length();
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
f = new Integer[10];
o = new lt();
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u0083\u0099\u009f'òùX\u0099d\r^×\u0092\bæÀ";
var5 = "\u0083\u0099\u009f'òùX\u0099d\r^×\u0092\bæÀ".length();
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

var17 = "Ã\u009b\u0088\u0085Ö\u0010mo\u001cRþ\u0012ÀóÐ¶\u0098NQ²,çJca\u001d\u0004Nô=õÝF0<\u0012\u00adjâ\u008f\t\u009dc²\u0088\u009dx_æ\u001c\u001bÃ¾ÔÙù\u0093»OB0úþ×8ðë%ûß\u001f \u008e\u001eL\u0012HT\u0016(\u0004ÌíU54\u0095j\u0007Vkã\u0019¤\u0096aÎþ\u0092Ü§Õ\u0094\bIÈ³ø\u0084\u0007n\u0011ý½dÃ¼ö·¾\u0080ôIÖicSÚæ\u0098\u0010Åò\u008b`µÆìÐ®~vä\u001b³SyxÃ\u008eíÏBÊ4Fª+n\u0096\u008b\u009c\u0015Bä;\u0006\u0003]";
var19 = "Ã\u009b\u0088\u0085Ö\u0010mo\u001cRþ\u0012ÀóÐ¶\u0098NQ²,çJca\u001d\u0004Nô=õÝF0<\u0012\u00adjâ\u008f\t\u009dc²\u0088\u009dx_æ\u001c\u001bÃ¾ÔÙù\u0093»OB0úþ×8ðë%ûß\u001f \u008e\u001eL\u0012HT\u0016(\u0004ÌíU54\u0095j\u0007Vkã\u0019¤\u0096aÎþ\u0092Ü§Õ\u0094\bIÈ³ø\u0084\u0007n\u0011ý½dÃ¼ö·¾\u0080ôIÖicSÚæ\u0098\u0010Åò\u008b`µÆìÐ®~vä\u001b³SyxÃ\u008eíÏBÊ4Fª+n\u0096\u008b\u009c\u0015Bä;\u0006\u0003]"
.length();
var16 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28257;
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
throw new RuntimeException("su/catlean/lt", var10);
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
throw new RuntimeException("su/catlean/lt" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 2381;
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
throw new RuntimeException("su/catlean/lt", var14);
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
throw new RuntimeException("su/catlean/lt" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
