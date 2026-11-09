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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10014;
import net.minecraft.class_10017;
import net.minecraft.class_10055;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_7833;
import net.minecraft.class_892;
import net.minecraft.class_897;
import net.minecraft.class_9946;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import su.catlean.mixins.accessors.EndCrystalRendererAccessor;

public final class nn {
@NotNull
public static final nn x;
private static boolean q;
private static final long a = yz.a(5495117789964301002L, -1040850817570672223L, MethodHandles.lookup().lookupClass()).a(213472768619827L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private nn() {
}

public final void w(
int a, @NotNull class_4587 stack, byte a, @NotNull s8 mode, int a, @NotNull Color fillColor, @NotNull Color lineColor, int vDistance, int hDistance
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 56
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 5
// 010: i2l
// 011: bipush 40
// 013: lshl
// 014: bipush 40
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/nn.a J
// 01b: lxor
// 01c: lstore 10
// 01e: lload 10
// 020: dup2
// 021: ldc2_w 38300180208858
// 024: lxor
// 025: lstore 12
// 027: dup2
// 028: ldc2_w 138640164783017
// 02b: lxor
// 02c: lstore 14
// 02e: dup2
// 02f: ldc2_w 65425508664396
// 032: lxor
// 033: lstore 16
// 035: dup2
// 036: ldc2_w 70923977314133
// 039: lxor
// 03a: lstore 18
// 03c: dup2
// 03d: ldc2_w 61291294934153
// 040: lxor
// 041: dup2
// 042: bipush 32
// 044: lushr
// 045: l2i
// 046: istore 20
// 048: dup2
// 049: bipush 32
// 04b: lshl
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 21
// 052: dup2
// 053: bipush 48
// 055: lshl
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 22
// 05c: pop2
// 05d: dup2
// 05e: ldc2_w 68319044891318
// 061: lxor
// 062: lstore 23
// 064: dup2
// 065: ldc2_w 44645101033412
// 068: lxor
// 069: lstore 25
// 06b: dup2
// 06c: ldc2_w 3011005422746
// 06f: lxor
// 070: dup2
// 071: bipush 32
// 073: lushr
// 074: l2i
// 075: istore 27
// 077: dup2
// 078: bipush 32
// 07a: lshl
// 07b: bipush 32
// 07d: lushr
// 07e: lstore 28
// 080: pop2
// 081: dup2
// 082: ldc2_w 446462291035
// 085: lxor
// 086: lstore 30
// 088: dup2
// 089: ldc2_w 2684305593084
// 08c: lxor
// 08d: lstore 32
// 08f: pop2
// 090: ldc2_w 43097030806701046
// 093: lload 10
// 095: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: aload 2
// 09b: sipush 17025
// 09e: ldc2_w 1154975221418114235
// 0a1: lload 10
// 0a3: lxor
// 0a4: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0ac: istore 39
// 0ae: aload 4
// 0b0: sipush 17579
// 0b3: ldc2_w 7003217307994012299
// 0b6: lload 10
// 0b8: lxor
// 0b9: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c1: aload 6
// 0c3: sipush 1306
// 0c6: ldc2_w 1486152748685032229
// 0c9: lload 10
// 0cb: lxor
// 0cc: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0d4: aload 7
// 0d6: sipush 26297
// 0d9: ldc2_w 9061883187366336661
// 0dc: lload 10
// 0de: lxor
// 0df: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0e7: lload 12
// 0e9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0ec: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 0ef: iload 39
// 0f1: ifne 136
// 0f4: dup
// 0f5: ifnull 11f
// 0f8: goto 106
// 0fb: ldc2_w 4979566017344881
// 0fe: lload 10
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: lload 16
// 108: dup2_x1
// 109: pop2
// 10a: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 10d: dup
// 10e: ifnonnull 13d
// 111: goto 11f
// 114: ldc2_w 4979566017344881
// 117: lload 10
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: pop
// 120: lload 32
// 122: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 125: checkcast net/minecraft/class_1297
// 128: goto 136
// 12b: ldc2_w 4979566017344881
// 12e: lload 10
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: lload 16
// 138: dup2_x1
// 139: pop2
// 13a: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 13d: astore 40
// 13f: lload 30
// 141: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 144: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 147: dup
// 148: sipush 22261
// 14b: ldc2_w 8530642022600485068
// 14e: lload 10
// 150: lxor
// 151: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 159: astore 42
// 15b: nop
// 15c: bipush 0
// 15d: istore 43
// 15f: aload 42
// 161: astore 44
// 163: new java/util/ArrayList
// 166: dup
// 167: invokespecial java/util/ArrayList.<init> ()V
// 16a: checkcast java/util/Collection
// 16d: astore 45
// 16f: bipush 0
// 170: istore 46
// 172: aload 44
// 174: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 179: astore 47
// 17b: aload 47
// 17d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 182: ifeq 1cf
// 185: aload 47
// 187: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 18c: astore 48
// 18e: iload 1
// 18f: iflt 1f5
// 192: aload 48
// 194: instanceof net/minecraft/class_1511
// 197: iload 39
// 199: ifne 1f3
// 19c: iload 39
// 19e: ifne 1c9
// 1a1: goto 1af
// 1a4: ldc2_w 4979566017344881
// 1a7: lload 10
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: ifeq 17b
// 1b2: goto 1c0
// 1b5: ldc2_w 4979566017344881
// 1b8: lload 10
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: aload 45
// 1c2: aload 48
// 1c4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1c9: pop
// 1ca: iload 39
// 1cc: ifeq 17b
// 1cf: aload 45
// 1d1: checkcast java/util/List
// 1d4: nop
// 1d5: checkcast java/lang/Iterable
// 1d8: astore 42
// 1da: nop
// 1db: bipush 0
// 1dc: istore 43
// 1de: aload 42
// 1e0: astore 44
// 1e2: new java/util/ArrayList
// 1e5: dup
// 1e6: invokespecial java/util/ArrayList.<init> ()V
// 1e9: checkcast java/util/Collection
// 1ec: astore 45
// 1ee: iload 1
// 1ef: iflt 1f5
// 1f2: bipush 0
// 1f3: istore 46
// 1f5: aload 44
// 1f7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1fc: astore 47
// 1fe: aload 47
// 200: invokeinterface java/util/Iterator.hasNext ()Z 1
// 205: ifeq 29f
// 208: aload 47
// 20a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 20f: astore 48
// 211: aload 48
// 213: checkcast net/minecraft/class_1511
// 216: astore 49
// 218: bipush 0
// 219: istore 50
// 21b: aload 40
// 21d: getfield net/minecraft/class_243.field_1352 D
// 220: aload 49
// 222: invokevirtual net/minecraft/class_1511.method_23317 ()D
// 225: dsub
// 226: aload 40
// 228: getfield net/minecraft/class_243.field_1350 D
// 22b: aload 49
// 22d: invokevirtual net/minecraft/class_1511.method_23321 ()D
// 230: dsub
// 231: invokestatic java/lang/Math.hypot (DD)D
// 234: iload 9
// 236: i2d
// 237: dcmpg
// 238: iload 39
// 23a: iload 1
// 23b: iflt 274
// 23e: ifne 272
// 241: ifge 28c
// 244: goto 252
// 247: ldc2_w 4979566017344881
// 24a: lload 10
// 24c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 251: athrow
// 252: aload 40
// 254: getfield net/minecraft/class_243.field_1351 D
// 257: aload 49
// 259: invokevirtual net/minecraft/class_1511.method_23318 ()D
// 25c: dsub
// 25d: invokestatic java/lang/Math.abs (D)D
// 260: iload 8
// 262: i2d
// 263: dcmpg
// 264: goto 272
// 267: ldc2_w 4979566017344881
// 26a: lload 10
// 26c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 271: athrow
// 272: iload 39
// 274: ifne 289
// 277: ifge 28c
// 27a: goto 288
// 27d: ldc2_w 4979566017344881
// 280: lload 10
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: bipush 1
// 289: goto 28d
// 28c: bipush 0
// 28d: ifeq 1fe
// 290: aload 45
// 292: aload 48
// 294: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 299: pop
// 29a: iload 39
// 29c: ifeq 1fe
// 29f: aload 45
// 2a1: checkcast java/util/List
// 2a4: nop
// 2a5: astore 41
// 2a7: iload 5
// 2a9: iflt 2c6
// 2ac: aload 41
// 2ae: invokeinterface java/util/List.isEmpty ()Z 1
// 2b3: iload 1
// 2b4: iflt 205
// 2b7: ifeq 2c6
// 2ba: return
// 2bb: ldc2_w 4979566017344881
// 2be: lload 10
// 2c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: athrow
// 2c6: aload 4
// 2c8: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 2cb: iload 39
// 2cd: iload 1
// 2ce: iflt 2fa
// 2d1: ifne 2f8
// 2d4: if_acmpeq 313
// 2d7: goto 2e5
// 2da: ldc2_w 4979566017344881
// 2dd: lload 10
// 2df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e4: athrow
// 2e5: aload 4
// 2e7: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 2ea: goto 2f8
// 2ed: ldc2_w 4979566017344881
// 2f0: lload 10
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: iload 39
// 2fa: iload 5
// 2fc: iflt 412
// 2ff: ifne 410
// 302: if_acmpne 40b
// 305: goto 313
// 308: ldc2_w 4979566017344881
// 30b: lload 10
// 30d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 312: athrow
// 313: new su/catlean/g7
// 316: dup
// 317: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 31a: dup
// 31b: sipush 31095
// 31e: ldc2_w 2499097138682660702
// 321: lload 10
// 323: lxor
// 324: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 32c: aload 41
// 32e: invokeinterface java/util/List.size ()I 1
// 333: sipush 22056
// 336: ldc2_w 92685154401859322
// 339: lload 10
// 33b: lxor
// 33c: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 341: imul
// 342: bipush 0
// 343: bipush 4
// 344: aconst_null
// 345: astore 34
// 347: istore 35
// 349: istore 36
// 34b: istore 37
// 34d: astore 38
// 34f: lload 14
// 351: aload 38
// 353: iload 37
// 355: iload 36
// 357: iload 35
// 359: aload 34
// 35b: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 35e: astore 42
// 360: aload 41
// 362: checkcast java/lang/Iterable
// 365: astore 43
// 367: bipush 0
// 368: istore 44
// 36a: aload 43
// 36c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 371: astore 45
// 373: aload 45
// 375: invokeinterface java/util/Iterator.hasNext ()Z 1
// 37a: ifeq 3e3
// 37d: aload 45
// 37f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 384: astore 46
// 386: aload 46
// 388: checkcast net/minecraft/class_1511
// 38b: astore 47
// 38d: bipush 0
// 38e: istore 48
// 390: getstatic su/catlean/nn.x Lsu/catlean/nn;
// 393: aload 2
// 394: aload 47
// 396: checkcast net/minecraft/class_1297
// 399: aload 6
// 39b: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 39e: lload 18
// 3a0: aload 42
// 3a2: getstatic su/catlean/k8.Y Lsu/catlean/k8;
// 3a5: aload 47
// 3a7: getfield net/minecraft/class_1511.field_6012 I
// 3aa: i2f
// 3ab: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 3ae: iload 20
// 3b0: iload 21
// 3b2: i2c
// 3b3: iload 22
// 3b5: invokevirtual su/catlean/zi.n (ICI)F
// 3b8: fadd
// 3b9: lload 23
// 3bb: invokevirtual su/catlean/k8.o (FJ)F
// 3be: invokespecial su/catlean/nn.I (Lnet/minecraft/class_4587;Lnet/minecraft/class_1297;Ljava/awt/Color;Lsu/catlean/s8;JLsu/catlean/g7;F)V
// 3c1: nop
// 3c2: nop
// 3c3: iload 39
// 3c5: iload 1
// 3c6: iflt 3ce
// 3c9: ifne 3e4
// 3cc: iload 39
// 3ce: ifeq 373
// 3d1: iload 3
// 3d2: ifle 3c3
// 3d5: goto 3e3
// 3d8: ldc2_w 4979566017344881
// 3db: lload 10
// 3dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e2: athrow
// 3e3: nop
// 3e4: lload 25
// 3e6: aload 42
// 3e8: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 3eb: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 3ee: aconst_null
// 3ef: aconst_null
// 3f0: aload 2
// 3f1: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 3f4: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 3f7: aconst_null
// 3f8: aconst_null
// 3f9: sipush 11690
// 3fc: ldc2_w 8776634815572888958
// 3ff: lload 10
// 401: lxor
// 402: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 407: aconst_null
// 408: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 40b: aload 4
// 40d: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 410: iload 39
// 412: ifne 439
// 415: if_acmpeq 43c
// 418: goto 426
// 41b: ldc2_w 4979566017344881
// 41e: lload 10
// 420: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 425: athrow
// 426: aload 4
// 428: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 42b: goto 439
// 42e: ldc2_w 4979566017344881
// 431: lload 10
// 433: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 438: athrow
// 439: if_acmpne 52c
// 43c: new su/catlean/g7
// 43f: dup
// 440: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 443: dup
// 444: sipush 15481
// 447: ldc2_w 4802182670849163868
// 44a: lload 10
// 44c: lxor
// 44d: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 452: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 455: aload 41
// 457: invokeinterface java/util/List.size ()I 1
// 45c: sipush 21499
// 45f: ldc2_w 7550613437786534701
// 462: lload 10
// 464: lxor
// 465: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46a: imul
// 46b: bipush 1
// 46c: istore 34
// 46e: istore 35
// 470: astore 36
// 472: iload 27
// 474: lload 28
// 476: aload 36
// 478: iload 35
// 47a: iload 34
// 47c: invokespecial su/catlean/g7.<init> (IJLcom/mojang/blaze3d/vertex/VertexFormat;IZ)V
// 47f: astore 42
// 481: aload 41
// 483: checkcast java/lang/Iterable
// 486: astore 43
// 488: bipush 0
// 489: istore 44
// 48b: aload 43
// 48d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 492: astore 45
// 494: aload 45
// 496: invokeinterface java/util/Iterator.hasNext ()Z 1
// 49b: ifeq 504
// 49e: aload 45
// 4a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4a5: astore 46
// 4a7: aload 46
// 4a9: checkcast net/minecraft/class_1511
// 4ac: astore 47
// 4ae: bipush 0
// 4af: istore 48
// 4b1: getstatic su/catlean/nn.x Lsu/catlean/nn;
// 4b4: aload 2
// 4b5: aload 47
// 4b7: checkcast net/minecraft/class_1297
// 4ba: aload 7
// 4bc: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 4bf: lload 18
// 4c1: aload 42
// 4c3: getstatic su/catlean/k8.Y Lsu/catlean/k8;
// 4c6: aload 47
// 4c8: getfield net/minecraft/class_1511.field_6012 I
// 4cb: i2f
// 4cc: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 4cf: iload 20
// 4d1: iload 21
// 4d3: i2c
// 4d4: iload 22
// 4d6: invokevirtual su/catlean/zi.n (ICI)F
// 4d9: fadd
// 4da: lload 23
// 4dc: invokevirtual su/catlean/k8.o (FJ)F
// 4df: invokespecial su/catlean/nn.I (Lnet/minecraft/class_4587;Lnet/minecraft/class_1297;Ljava/awt/Color;Lsu/catlean/s8;JLsu/catlean/g7;F)V
// 4e2: nop
// 4e3: nop
// 4e4: iload 39
// 4e6: iload 1
// 4e7: ifle 4ef
// 4ea: ifne 505
// 4ed: iload 39
// 4ef: ifeq 494
// 4f2: iload 3
// 4f3: ifle 4e4
// 4f6: goto 504
// 4f9: ldc2_w 4979566017344881
// 4fc: lload 10
// 4fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 503: athrow
// 504: nop
// 505: lload 25
// 507: aload 42
// 509: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 50c: invokevirtual su/catlean/b6.w ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 50f: aconst_null
// 510: aconst_null
// 511: aload 2
// 512: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 515: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 518: aconst_null
// 519: aconst_null
// 51a: sipush 5003
// 51d: ldc2_w 2234692005962085200
// 520: lload 10
// 522: lxor
// 523: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 528: aconst_null
// 529: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 52c: return
}

public final void Z(
@NotNull class_4587 stack,
@NotNull s8 mode,
@NotNull Color fillColor,
@NotNull Color lineColor,
@NotNull Color friendFillColor,
@NotNull Color friendLineColor,
long a,
int vDistance,
int hDistance
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/nn.a J
// 003: lload 7
// 005: lxor
// 006: lstore 7
// 008: lload 7
// 00a: dup2
// 00b: ldc2_w 111314172313098
// 00e: lxor
// 00f: lstore 11
// 011: dup2
// 012: ldc2_w 63769540960633
// 015: lxor
// 016: lstore 13
// 018: dup2
// 019: ldc2_w 136791439189660
// 01c: lxor
// 01d: lstore 15
// 01f: dup2
// 020: ldc2_w 122537873995028
// 023: lxor
// 024: lstore 17
// 026: dup2
// 027: ldc2_w 76231927709258
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 19
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 32
// 038: lushr
// 039: lstore 20
// 03b: pop2
// 03c: dup2
// 03d: ldc2_w 78683233177227
// 040: lxor
// 041: lstore 22
// 043: dup2
// 044: ldc2_w 132088240362541
// 047: lxor
// 048: lstore 24
// 04a: dup2
// 04b: ldc2_w 75695512153742
// 04e: lxor
// 04f: lstore 26
// 051: dup2
// 052: ldc2_w 76522627330092
// 055: lxor
// 056: lstore 28
// 058: pop2
// 059: ldc2_w 2470606395390271782
// 05c: lload 7
// 05e: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: aload 1
// 064: sipush 21144
// 067: ldc2_w 5996044170234891877
// 06a: lload 7
// 06c: lxor
// 06d: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 072: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 075: aload 2
// 076: sipush 10994
// 079: ldc2_w 7690429039325836805
// 07c: lload 7
// 07e: lxor
// 07f: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 087: istore 35
// 089: aload 3
// 08a: sipush 25630
// 08d: ldc2_w 5616570878482168042
// 090: lload 7
// 092: lxor
// 093: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 09b: aload 4
// 09d: sipush 3795
// 0a0: ldc2_w 2499105752108651041
// 0a3: lload 7
// 0a5: lxor
// 0a6: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0ae: aload 5
// 0b0: sipush 29661
// 0b3: ldc2_w 8108884242745044795
// 0b6: lload 7
// 0b8: lxor
// 0b9: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c1: aload 6
// 0c3: sipush 29467
// 0c6: ldc2_w 6900651845490520048
// 0c9: lload 7
// 0cb: lxor
// 0cc: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0d4: lload 11
// 0d6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d9: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 0dc: iload 35
// 0de: ifne 123
// 0e1: dup
// 0e2: ifnull 10c
// 0e5: goto 0f3
// 0e8: ldc2_w 2504554497138317217
// 0eb: lload 7
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: lload 15
// 0f5: dup2_x1
// 0f6: pop2
// 0f7: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0fa: dup
// 0fb: ifnonnull 12a
// 0fe: goto 10c
// 101: ldc2_w 2504554497138317217
// 104: lload 7
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: pop
// 10d: lload 28
// 10f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 112: checkcast net/minecraft/class_1297
// 115: goto 123
// 118: ldc2_w 2504554497138317217
// 11b: lload 7
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: lload 15
// 125: dup2_x1
// 126: pop2
// 127: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 12a: astore 36
// 12c: lload 22
// 12e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 131: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 134: dup
// 135: sipush 134
// 138: ldc2_w 8006214038422674558
// 13b: lload 7
// 13d: lxor
// 13e: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 146: astore 38
// 148: nop
// 149: bipush 0
// 14a: istore 39
// 14c: aload 38
// 14e: astore 40
// 150: new java/util/ArrayList
// 153: dup
// 154: invokespecial java/util/ArrayList.<init> ()V
// 157: checkcast java/util/Collection
// 15a: astore 41
// 15c: bipush 0
// 15d: istore 42
// 15f: aload 40
// 161: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 166: astore 43
// 168: aload 43
// 16a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 16f: ifeq 299
// 172: aload 43
// 174: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 179: astore 44
// 17b: aload 44
// 17d: checkcast net/minecraft/class_1297
// 180: astore 45
// 182: bipush 0
// 183: istore 46
// 185: aload 45
// 187: instanceof net/minecraft/class_1657
// 18a: iload 35
// 18c: lload 7
// 18e: lconst_0
// 18f: lcmp
// 190: ifle 1c1
// 193: ifne 1bf
// 196: ifeq 286
// 199: goto 1a7
// 19c: ldc2_w 2504554497138317217
// 19f: lload 7
// 1a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: athrow
// 1a7: aload 45
// 1a9: lload 28
// 1ab: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ae: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1b1: goto 1bf
// 1b4: ldc2_w 2504554497138317217
// 1b7: lload 7
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: iload 35
// 1c1: lload 7
// 1c3: lconst_0
// 1c4: lcmp
// 1c5: iflt 22e
// 1c8: ifne 22c
// 1cb: ifeq 1fb
// 1ce: goto 1dc
// 1d1: ldc2_w 2504554497138317217
// 1d4: lload 7
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: lload 11
// 1de: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1e4: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 1e7: getstatic net/minecraft/class_5498.field_26664 Lnet/minecraft/class_5498;
// 1ea: if_acmpeq 286
// 1ed: goto 1fb
// 1f0: ldc2_w 2504554497138317217
// 1f3: lload 7
// 1f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: athrow
// 1fb: aload 36
// 1fd: getfield net/minecraft/class_243.field_1352 D
// 200: aload 45
// 202: checkcast net/minecraft/class_1657
// 205: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 208: dsub
// 209: aload 36
// 20b: getfield net/minecraft/class_243.field_1350 D
// 20e: aload 45
// 210: checkcast net/minecraft/class_1657
// 213: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 216: dsub
// 217: invokestatic java/lang/Math.hypot (DD)D
// 21a: iload 10
// 21c: i2d
// 21d: dcmpg
// 21e: goto 22c
// 221: ldc2_w 2504554497138317217
// 224: lload 7
// 226: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22b: athrow
// 22c: iload 35
// 22e: lload 7
// 230: lconst_0
// 231: lcmp
// 232: ifle 26e
// 235: ifne 26c
// 238: ifge 286
// 23b: goto 249
// 23e: ldc2_w 2504554497138317217
// 241: lload 7
// 243: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 248: athrow
// 249: aload 36
// 24b: getfield net/minecraft/class_243.field_1351 D
// 24e: aload 45
// 250: checkcast net/minecraft/class_1657
// 253: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 256: dsub
// 257: invokestatic java/lang/Math.abs (D)D
// 25a: iload 9
// 25c: i2d
// 25d: dcmpg
// 25e: goto 26c
// 261: ldc2_w 2504554497138317217
// 264: lload 7
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: iload 35
// 26e: ifne 283
// 271: ifge 286
// 274: goto 282
// 277: ldc2_w 2504554497138317217
// 27a: lload 7
// 27c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 281: athrow
// 282: bipush 1
// 283: goto 287
// 286: bipush 0
// 287: ifeq 168
// 28a: aload 41
// 28c: aload 44
// 28e: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 293: pop
// 294: iload 35
// 296: ifeq 168
// 299: aload 41
// 29b: checkcast java/util/List
// 29e: nop
// 29f: astore 37
// 2a1: lload 7
// 2a3: lconst_0
// 2a4: lcmp
// 2a5: ifle 2c5
// 2a8: aload 37
// 2aa: invokeinterface java/util/List.isEmpty ()Z 1
// 2af: lload 7
// 2b1: lconst_0
// 2b2: lcmp
// 2b3: ifle 16f
// 2b6: ifeq 2c5
// 2b9: return
// 2ba: ldc2_w 2504554497138317217
// 2bd: lload 7
// 2bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c4: athrow
// 2c5: aload 2
// 2c6: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 2c9: iload 35
// 2cb: lload 7
// 2cd: lconst_0
// 2ce: lcmp
// 2cf: ifle 2fa
// 2d2: ifne 2f8
// 2d5: if_acmpeq 315
// 2d8: goto 2e6
// 2db: ldc2_w 2504554497138317217
// 2de: lload 7
// 2e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e5: athrow
// 2e6: aload 2
// 2e7: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 2ea: goto 2f8
// 2ed: ldc2_w 2504554497138317217
// 2f0: lload 7
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: iload 35
// 2fa: lload 7
// 2fc: lconst_0
// 2fd: lcmp
// 2fe: ifle 42c
// 301: ifne 42a
// 304: if_acmpne 426
// 307: goto 315
// 30a: ldc2_w 2504554497138317217
// 30d: lload 7
// 30f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 314: athrow
// 315: new su/catlean/g7
// 318: dup
// 319: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 31c: dup
// 31d: sipush 15481
// 320: ldc2_w 4802104227248758924
// 323: lload 7
// 325: lxor
// 326: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 32e: aload 37
// 330: invokeinterface java/util/List.size ()I 1
// 335: sipush 21628
// 338: ldc2_w 5192111678162703993
// 33b: lload 7
// 33d: lxor
// 33e: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: imul
// 344: bipush 0
// 345: bipush 4
// 346: aconst_null
// 347: astore 30
// 349: istore 31
// 34b: istore 32
// 34d: istore 33
// 34f: astore 34
// 351: lload 13
// 353: aload 34
// 355: iload 33
// 357: iload 32
// 359: iload 31
// 35b: aload 30
// 35d: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 360: astore 38
// 362: aload 37
// 364: checkcast java/lang/Iterable
// 367: astore 39
// 369: nop
// 36a: bipush 0
// 36b: istore 40
// 36d: aload 39
// 36f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 374: astore 41
// 376: aload 41
// 378: invokeinterface java/util/Iterator.hasNext ()Z 1
// 37d: ifeq 3f7
// 380: aload 41
// 382: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 387: astore 42
// 389: aload 42
// 38b: checkcast net/minecraft/class_1297
// 38e: astore 43
// 390: bipush 0
// 391: istore 44
// 393: getstatic su/catlean/nn.x Lsu/catlean/nn;
// 396: aload 1
// 397: aload 43
// 399: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 39c: aload 43
// 39e: aload 43
// 3a0: checkcast net/minecraft/class_1657
// 3a3: lload 26
// 3a5: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 3a8: lload 7
// 3aa: lconst_0
// 3ab: lcmp
// 3ac: ifle 4f2
// 3af: iload 35
// 3b1: ifne 4f2
// 3b4: ifeq 3d5
// 3b7: goto 3c5
// 3ba: ldc2_w 2504554497138317217
// 3bd: lload 7
// 3bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c4: athrow
// 3c5: aload 5
// 3c7: goto 3d6
// 3ca: ldc2_w 2504554497138317217
// 3cd: lload 7
// 3cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d4: athrow
// 3d5: aload 3
// 3d6: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 3d9: aload 38
// 3db: fconst_0
// 3dc: sipush 17046
// 3df: ldc2_w 8596767833091702933
// 3e2: lload 7
// 3e4: lxor
// 3e5: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ea: aconst_null
// 3eb: lload 24
// 3ed: invokestatic su/catlean/nn.z (Lsu/catlean/nn;Lnet/minecraft/class_4587;Lnet/minecraft/class_1297;Ljava/awt/Color;Lsu/catlean/s8;Lsu/catlean/g7;FILjava/lang/Object;J)V
// 3f0: nop
// 3f1: nop
// 3f2: iload 35
// 3f4: ifeq 376
// 3f7: nop
// 3f8: lload 17
// 3fa: aload 38
// 3fc: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 3ff: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 402: aconst_null
// 403: aconst_null
// 404: aload 1
// 405: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 408: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 40b: aconst_null
// 40c: aconst_null
// 40d: sipush 5003
// 410: ldc2_w 2234769899808772480
// 413: lload 7
// 415: lxor
// 416: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41b: aconst_null
// 41c: lload 7
// 41e: lconst_0
// 41f: lcmp
// 420: iflt 554
// 423: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 426: aload 2
// 427: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 42a: iload 35
// 42c: ifne 452
// 42f: if_acmpeq 455
// 432: goto 440
// 435: ldc2_w 2504554497138317217
// 438: lload 7
// 43a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43f: athrow
// 440: aload 2
// 441: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 444: goto 452
// 447: ldc2_w 2504554497138317217
// 44a: lload 7
// 44c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 451: athrow
// 452: if_acmpne 557
// 455: new su/catlean/g7
// 458: dup
// 459: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 45c: dup
// 45d: sipush 15481
// 460: ldc2_w 4802104227248758924
// 463: lload 7
// 465: lxor
// 466: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 46e: aload 37
// 470: invokeinterface java/util/List.size ()I 1
// 475: sipush 9284
// 478: ldc2_w 8379359186780382789
// 47b: lload 7
// 47d: lxor
// 47e: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 483: imul
// 484: bipush 1
// 485: istore 30
// 487: istore 31
// 489: astore 32
// 48b: iload 19
// 48d: lload 20
// 48f: aload 32
// 491: iload 31
// 493: iload 30
// 495: invokespecial su/catlean/g7.<init> (IJLcom/mojang/blaze3d/vertex/VertexFormat;IZ)V
// 498: astore 38
// 49a: aload 37
// 49c: checkcast java/lang/Iterable
// 49f: astore 39
// 4a1: bipush 0
// 4a2: istore 40
// 4a4: aload 39
// 4a6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 4ab: astore 41
// 4ad: aload 41
// 4af: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4b4: ifeq 528
// 4b7: aload 41
// 4b9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4be: astore 42
// 4c0: aload 42
// 4c2: checkcast net/minecraft/class_1297
// 4c5: astore 43
// 4c7: bipush 0
// 4c8: istore 44
// 4ca: iload 35
// 4cc: ifne 530
// 4cf: getstatic su/catlean/nn.x Lsu/catlean/nn;
// 4d2: aload 1
// 4d3: aload 43
// 4d5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 4d8: aload 43
// 4da: aload 43
// 4dc: checkcast net/minecraft/class_1657
// 4df: lload 26
// 4e1: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 4e4: goto 4f2
// 4e7: ldc2_w 2504554497138317217
// 4ea: lload 7
// 4ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f1: athrow
// 4f2: ifeq 505
// 4f5: aload 6
// 4f7: goto 507
// 4fa: ldc2_w 2504554497138317217
// 4fd: lload 7
// 4ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 504: athrow
// 505: aload 4
// 507: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 50a: aload 38
// 50c: fconst_0
// 50d: sipush 4847
// 510: ldc2_w 847127572870582503
// 513: lload 7
// 515: lxor
// 516: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51b: aconst_null
// 51c: lload 24
// 51e: invokestatic su/catlean/nn.z (Lsu/catlean/nn;Lnet/minecraft/class_4587;Lnet/minecraft/class_1297;Ljava/awt/Color;Lsu/catlean/s8;Lsu/catlean/g7;FILjava/lang/Object;J)V
// 521: nop
// 522: nop
// 523: iload 35
// 525: ifeq 4ad
// 528: nop
// 529: lload 7
// 52b: lconst_0
// 52c: lcmp
// 52d: ifle 530
// 530: lload 17
// 532: aload 38
// 534: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 537: invokevirtual su/catlean/b6.w ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 53a: aconst_null
// 53b: aconst_null
// 53c: aload 1
// 53d: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 540: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 543: aconst_null
// 544: aconst_null
// 545: sipush 5003
// 548: ldc2_w 2234769899808772480
// 54b: lload 7
// 54d: lxor
// 54e: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 553: aconst_null
// 554: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 557: return
}

public final void B(
@NotNull class_4587 stack, @NotNull s8 mode, @NotNull Color fillColor, @NotNull Color lineColor, long a, @NotNull ArrayList list, int vDistance, int hDistance
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/nn.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 1640815541088
// 00e: lxor
// 00f: lstore 10
// 011: dup2
// 012: ldc2_w 103065547891731
// 015: lxor
// 016: lstore 12
// 018: dup2
// 019: ldc2_w 26570490962934
// 01c: lxor
// 01d: lstore 14
// 01f: dup2
// 020: ldc2_w 12308369354878
// 023: lxor
// 024: lstore 16
// 026: dup2
// 027: ldc2_w 36380276194080
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 18
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 32
// 038: lushr
// 039: lstore 19
// 03b: pop2
// 03c: dup2
// 03d: ldc2_w 108537185921405
// 040: lxor
// 041: dup2
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 21
// 048: dup2
// 049: bipush 16
// 04b: lshl
// 04c: bipush 16
// 04e: lushr
// 04f: lstore 22
// 051: pop2
// 052: dup2
// 053: ldc2_w 37226655003974
// 056: lxor
// 057: lstore 24
// 059: pop2
// 05a: ldc2_w -1769389872835341339
// 05d: lload 5
// 05f: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: aload 1
// 065: sipush 21144
// 068: ldc2_w 5996083466258598671
// 06b: lload 5
// 06d: lxor
// 06e: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 076: istore 31
// 078: aload 2
// 079: sipush 10994
// 07c: ldc2_w 7690318801196659567
// 07f: lload 5
// 081: lxor
// 082: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08a: aload 3
// 08b: sipush 25630
// 08e: ldc2_w 5616680566820928896
// 091: lload 5
// 093: lxor
// 094: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 09c: aload 4
// 09e: sipush 3795
// 0a1: ldc2_w 2499215439945176907
// 0a4: lload 5
// 0a6: lxor
// 0a7: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0af: aload 7
// 0b1: sipush 4606
// 0b4: ldc2_w 1314259725651282044
// 0b7: lload 5
// 0b9: lxor
// 0ba: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c2: lload 10
// 0c4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c7: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 0ca: iload 31
// 0cc: ifeq 111
// 0cf: dup
// 0d0: ifnull 0fa
// 0d3: goto 0e1
// 0d6: ldc2_w -1753145688406781237
// 0d9: lload 5
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: lload 14
// 0e3: dup2_x1
// 0e4: pop2
// 0e5: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0e8: dup
// 0e9: ifnonnull 118
// 0ec: goto 0fa
// 0ef: ldc2_w -1753145688406781237
// 0f2: lload 5
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: pop
// 0fb: lload 24
// 0fd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 100: checkcast net/minecraft/class_1297
// 103: goto 111
// 106: ldc2_w -1753145688406781237
// 109: lload 5
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: lload 14
// 113: dup2_x1
// 114: pop2
// 115: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 118: astore 32
// 11a: aload 7
// 11c: checkcast java/lang/Iterable
// 11f: astore 34
// 121: bipush 0
// 122: istore 35
// 124: aload 34
// 126: astore 36
// 128: new java/util/ArrayList
// 12b: dup
// 12c: invokespecial java/util/ArrayList.<init> ()V
// 12f: checkcast java/util/Collection
// 132: astore 37
// 134: bipush 0
// 135: istore 38
// 137: aload 36
// 139: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 13e: astore 39
// 140: aload 39
// 142: invokeinterface java/util/Iterator.hasNext ()Z 1
// 147: ifeq 231
// 14a: aload 39
// 14c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 151: astore 40
// 153: aload 40
// 155: checkcast net/minecraft/class_1657
// 158: astore 41
// 15a: bipush 0
// 15b: istore 42
// 15d: aload 41
// 15f: lload 24
// 161: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 164: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 167: iload 31
// 169: ifeq 21b
// 16c: ifeq 21a
// 16f: goto 17d
// 172: ldc2_w -1753145688406781237
// 175: lload 5
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: lload 10
// 17f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 182: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 185: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 188: getstatic net/minecraft/class_5498.field_26664 Lnet/minecraft/class_5498;
// 18b: if_acmpeq 21e
// 18e: goto 19c
// 191: ldc2_w -1753145688406781237
// 194: lload 5
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: aload 32
// 19e: getfield net/minecraft/class_243.field_1352 D
// 1a1: aload 41
// 1a3: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 1a6: dsub
// 1a7: aload 32
// 1a9: getfield net/minecraft/class_243.field_1350 D
// 1ac: aload 41
// 1ae: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 1b1: dsub
// 1b2: invokestatic java/lang/Math.hypot (DD)D
// 1b5: iload 9
// 1b7: i2d
// 1b8: dcmpg
// 1b9: iload 31
// 1bb: lload 5
// 1bd: lconst_0
// 1be: lcmp
// 1bf: iflt 206
// 1c2: ifeq 204
// 1c5: goto 1d3
// 1c8: ldc2_w -1753145688406781237
// 1cb: lload 5
// 1cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: athrow
// 1d3: ifge 21e
// 1d6: goto 1e4
// 1d9: ldc2_w -1753145688406781237
// 1dc: lload 5
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: aload 32
// 1e6: getfield net/minecraft/class_243.field_1351 D
// 1e9: aload 41
// 1eb: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 1ee: dsub
// 1ef: invokestatic java/lang/Math.abs (D)D
// 1f2: iload 8
// 1f4: i2d
// 1f5: dcmpg
// 1f6: goto 204
// 1f9: ldc2_w -1753145688406781237
// 1fc: lload 5
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: iload 31
// 206: ifeq 21b
// 209: ifge 21e
// 20c: goto 21a
// 20f: ldc2_w -1753145688406781237
// 212: lload 5
// 214: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: athrow
// 21a: bipush 1
// 21b: goto 21f
// 21e: bipush 0
// 21f: ifeq 140
// 222: aload 37
// 224: aload 40
// 226: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 22b: pop
// 22c: iload 31
// 22e: ifne 140
// 231: aload 37
// 233: checkcast java/util/List
// 236: nop
// 237: astore 33
// 239: lload 5
// 23b: lconst_0
// 23c: lcmp
// 23d: ifle 25d
// 240: aload 33
// 242: invokeinterface java/util/List.isEmpty ()Z 1
// 247: lload 5
// 249: lconst_0
// 24a: lcmp
// 24b: iflt 147
// 24e: ifeq 25d
// 251: return
// 252: ldc2_w -1753145688406781237
// 255: lload 5
// 257: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25c: athrow
// 25d: aload 2
// 25e: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 261: iload 31
// 263: lload 5
// 265: lconst_0
// 266: lcmp
// 267: iflt 292
// 26a: ifeq 290
// 26d: if_acmpeq 2ad
// 270: goto 27e
// 273: ldc2_w -1753145688406781237
// 276: lload 5
// 278: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27d: athrow
// 27e: aload 2
// 27f: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 282: goto 290
// 285: ldc2_w -1753145688406781237
// 288: lload 5
// 28a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28f: athrow
// 290: iload 31
// 292: lload 5
// 294: lconst_0
// 295: lcmp
// 296: ifle 396
// 299: ifeq 394
// 29c: if_acmpne 390
// 29f: goto 2ad
// 2a2: ldc2_w -1753145688406781237
// 2a5: lload 5
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: new su/catlean/g7
// 2b0: dup
// 2b1: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 2b4: dup
// 2b5: sipush 15481
// 2b8: ldc2_w 4802213900019344870
// 2bb: lload 5
// 2bd: lxor
// 2be: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c6: aload 7
// 2c8: invokevirtual java/util/ArrayList.size ()I
// 2cb: sipush 21628
// 2ce: ldc2_w 5192213093874357011
// 2d1: lload 5
// 2d3: lxor
// 2d4: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: imul
// 2da: bipush 0
// 2db: bipush 4
// 2dc: aconst_null
// 2dd: astore 26
// 2df: istore 27
// 2e1: istore 28
// 2e3: istore 29
// 2e5: astore 30
// 2e7: lload 12
// 2e9: aload 30
// 2eb: iload 29
// 2ed: iload 28
// 2ef: iload 27
// 2f1: aload 26
// 2f3: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 2f6: astore 34
// 2f8: aload 33
// 2fa: checkcast java/lang/Iterable
// 2fd: astore 35
// 2ff: bipush 0
// 300: istore 36
// 302: aload 35
// 304: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 309: astore 37
// 30b: aload 37
// 30d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 312: ifeq 368
// 315: aload 37
// 317: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 31c: astore 38
// 31e: aload 38
// 320: checkcast net/minecraft/class_1657
// 323: astore 39
// 325: bipush 0
// 326: istore 40
// 328: getstatic su/catlean/nn.x Lsu/catlean/nn;
// 32b: iload 21
// 32d: i2s
// 32e: aload 1
// 32f: aload 39
// 331: checkcast net/minecraft/class_1297
// 334: aload 3
// 335: getstatic su/catlean/s8.FILL Lsu/catlean/s8;
// 338: aload 34
// 33a: fconst_1
// 33b: lload 22
// 33d: invokespecial su/catlean/nn.Q (SLnet/minecraft/class_4587;Lnet/minecraft/class_1297;Ljava/awt/Color;Lsu/catlean/s8;Lsu/catlean/g7;FJ)V
// 340: nop
// 341: nop
// 342: iload 31
// 344: lload 5
// 346: lconst_0
// 347: lcmp
// 348: ifle 350
// 34b: ifeq 369
// 34e: iload 31
// 350: ifne 30b
// 353: lload 5
// 355: lconst_0
// 356: lcmp
// 357: iflt 342
// 35a: goto 368
// 35d: ldc2_w -1753145688406781237
// 360: lload 5
// 362: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 367: athrow
// 368: nop
// 369: lload 16
// 36b: aload 34
// 36d: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 370: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 373: aconst_null
// 374: aconst_null
// 375: aload 1
// 376: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 379: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 37c: aconst_null
// 37d: aconst_null
// 37e: sipush 5003
// 381: ldc2_w 2234659670287357162
// 384: lload 5
// 386: lxor
// 387: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38c: aconst_null
// 38d: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 390: aload 2
// 391: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 394: iload 31
// 396: ifeq 3bc
// 399: if_acmpeq 3bf
// 39c: goto 3aa
// 39f: ldc2_w -1753145688406781237
// 3a2: lload 5
// 3a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a9: athrow
// 3aa: aload 2
// 3ab: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 3ae: goto 3bc
// 3b1: ldc2_w -1753145688406781237
// 3b4: lload 5
// 3b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bb: athrow
// 3bc: if_acmpne 49b
// 3bf: new su/catlean/g7
// 3c2: dup
// 3c3: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 3c6: dup
// 3c7: sipush 15481
// 3ca: ldc2_w 4802213900019344870
// 3cd: lload 5
// 3cf: lxor
// 3d0: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3d8: aload 7
// 3da: invokevirtual java/util/ArrayList.size ()I
// 3dd: sipush 2745
// 3e0: ldc2_w 6805121401186651603
// 3e3: lload 5
// 3e5: lxor
// 3e6: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3eb: imul
// 3ec: bipush 1
// 3ed: istore 26
// 3ef: istore 27
// 3f1: astore 28
// 3f3: iload 18
// 3f5: lload 19
// 3f7: aload 28
// 3f9: iload 27
// 3fb: iload 26
// 3fd: invokespecial su/catlean/g7.<init> (IJLcom/mojang/blaze3d/vertex/VertexFormat;IZ)V
// 400: astore 34
// 402: aload 33
// 404: checkcast java/lang/Iterable
// 407: astore 35
// 409: bipush 0
// 40a: istore 36
// 40c: aload 35
// 40e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 413: astore 37
// 415: aload 37
// 417: invokeinterface java/util/Iterator.hasNext ()Z 1
// 41c: ifeq 473
// 41f: aload 37
// 421: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 426: astore 38
// 428: aload 38
// 42a: checkcast net/minecraft/class_1657
// 42d: astore 39
// 42f: bipush 0
// 430: istore 40
// 432: getstatic su/catlean/nn.x Lsu/catlean/nn;
// 435: iload 21
// 437: i2s
// 438: aload 1
// 439: aload 39
// 43b: checkcast net/minecraft/class_1297
// 43e: aload 4
// 440: getstatic su/catlean/s8.OUTLINE Lsu/catlean/s8;
// 443: aload 34
// 445: fconst_1
// 446: lload 22
// 448: invokespecial su/catlean/nn.Q (SLnet/minecraft/class_4587;Lnet/minecraft/class_1297;Ljava/awt/Color;Lsu/catlean/s8;Lsu/catlean/g7;FJ)V
// 44b: nop
// 44c: nop
// 44d: iload 31
// 44f: lload 5
// 451: lconst_0
// 452: lcmp
// 453: ifle 45b
// 456: ifeq 474
// 459: iload 31
// 45b: ifne 415
// 45e: lload 5
// 460: lconst_0
// 461: lcmp
// 462: ifle 44d
// 465: goto 473
// 468: ldc2_w -1753145688406781237
// 46b: lload 5
// 46d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 472: athrow
// 473: nop
// 474: lload 16
// 476: aload 34
// 478: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 47b: invokevirtual su/catlean/b6.w ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 47e: aconst_null
// 47f: aconst_null
// 480: aload 1
// 481: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 484: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 487: aconst_null
// 488: aconst_null
// 489: sipush 5003
// 48c: ldc2_w 2234659670287357162
// 48f: lload 5
// 491: lxor
// 492: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 497: aconst_null
// 498: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 49b: return
}

private final void Q(short param1, class_4587 param2, class_1297 param3, Color param4, s8 param5, g7 param6, float param7, long param8) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: lload 8
// 007: bipush 16
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/nn.a J
// 011: lxor
// 012: lstore 10
// 014: lload 10
// 016: dup2
// 017: ldc2_w 71460759678122
// 01a: lxor
// 01b: lstore 12
// 01d: dup2
// 01e: ldc2_w 94099651441913
// 021: lxor
// 022: dup2
// 023: bipush 32
// 025: lushr
// 026: l2i
// 027: istore 14
// 029: dup2
// 02a: bipush 32
// 02c: lshl
// 02d: bipush 48
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
// 03f: ldc2_w 97889262564848
// 042: lxor
// 043: dup2
// 044: bipush 16
// 046: lushr
// 047: lstore 17
// 049: dup2
// 04a: bipush 48
// 04c: lshl
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 19
// 053: pop2
// 054: dup2
// 055: ldc2_w 58433242961745
// 058: lxor
// 059: lstore 20
// 05b: dup2
// 05c: ldc2_w 64424025528343
// 05f: lxor
// 060: lstore 22
// 062: pop2
// 063: ldc2_w -1100113295761619921
// 066: lload 10
// 068: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: istore 24
// 06f: aload 3
// 070: instanceof net/minecraft/class_1657
// 073: ifne 082
// 076: return
// 077: ldc2_w -1125386672309435135
// 07a: lload 10
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: new su/catlean/a
// 085: dup
// 086: lload 20
// 088: aload 6
// 08a: aload 5
// 08c: aload 4
// 08e: invokespecial su/catlean/a.<init> (JLsu/catlean/g7;Lsu/catlean/s8;Ljava/awt/Color;)V
// 091: astore 25
// 093: lload 12
// 095: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 098: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 09b: aload 3
// 09c: invokevirtual net/minecraft/class_898.method_3953 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_897;
// 09f: dup
// 0a0: sipush 23842
// 0a3: ldc2_w 396594843723027301
// 0a6: lload 10
// 0a8: lxor
// 0a9: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0b1: checkcast net/minecraft/class_1007
// 0b4: invokevirtual net/minecraft/class_1007.method_4038 ()Lnet/minecraft/class_583;
// 0b7: dup
// 0b8: sipush 30158
// 0bb: ldc2_w 1219448354751445888
// 0be: lload 10
// 0c0: lxor
// 0c1: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c9: checkcast net/minecraft/class_591
// 0cc: astore 26
// 0ce: lload 12
// 0d0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d3: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 0d6: aload 3
// 0d7: invokevirtual net/minecraft/class_898.method_3953 (Lnet/minecraft/class_1297;)Lnet/minecraft/class_897;
// 0da: aload 3
// 0db: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0de: iload 14
// 0e0: iload 15
// 0e2: i2c
// 0e3: iload 16
// 0e5: invokevirtual su/catlean/zi.n (ICI)F
// 0e8: invokevirtual net/minecraft/class_897.method_62425 (Lnet/minecraft/class_1297;F)Lnet/minecraft/class_10017;
// 0eb: dup
// 0ec: sipush 13916
// 0ef: ldc2_w 1720113463672813578
// 0f2: lload 10
// 0f4: lxor
// 0f5: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0fd: checkcast net/minecraft/class_10055
// 100: astore 27
// 102: aload 2
// 103: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 106: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 109: lload 22
// 10b: aload 3
// 10c: checkcast net/minecraft/class_1657
// 10f: fload 7
// 111: invokevirtual su/catlean/zi.Q (JLnet/minecraft/class_1657;F)Lnet/minecraft/class_243;
// 114: astore 28
// 116: aload 28
// 118: getfield net/minecraft/class_243.field_1352 D
// 11b: dstore 29
// 11d: aload 28
// 11f: getfield net/minecraft/class_243.field_1351 D
// 122: dstore 31
// 124: aload 28
// 126: getfield net/minecraft/class_243.field_1350 D
// 129: dstore 33
// 12b: lload 12
// 12d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 130: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 133: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 136: dup
// 137: sipush 16405
// 13a: ldc2_w 2150049248374607430
// 13d: lload 10
// 13f: lxor
// 140: invokedynamic l (IJ)Ljava/lang/String; bsm=su/catlean/nn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 148: astore 35
// 14a: aload 2
// 14b: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 14e: aload 35
// 150: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 153: fneg
// 154: ldc 180.0
// 156: fadd
// 157: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 15c: checkcast org/joml/Quaternionfc
// 15f: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 162: aload 2
// 163: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 166: aload 35
// 168: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 16b: fneg
// 16c: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 171: checkcast org/joml/Quaternionfc
// 174: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 177: aload 2
// 178: dload 29
// 17a: d2f
// 17b: dload 31
// 17d: d2f
// 17e: dload 33
// 180: d2f
// 181: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 184: aload 2
// 185: aload 27
// 187: getfield net/minecraft/class_10055.field_53453 F
// 18a: aload 27
// 18c: getfield net/minecraft/class_10055.field_53453 F
// 18f: aload 27
// 191: getfield net/minecraft/class_10055.field_53453 F
// 194: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 197: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 19a: lload 17
// 19c: aload 27
// 19e: iload 19
// 1a0: i2s
// 1a1: aload 2
// 1a2: aload 27
// 1a4: getfield net/minecraft/class_10055.field_53446 F
// 1a7: invokevirtual su/catlean/kf.g (JLnet/minecraft/class_10055;SLnet/minecraft/class_4587;F)V
// 1aa: aload 2
// 1ab: ldc -1.0
// 1ad: ldc -1.0
// 1af: fconst_1
// 1b0: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 1b3: aload 2
// 1b4: ldc 0.9375
// 1b6: lload 8
// 1b8: lconst_0
// 1b9: lcmp
// 1ba: iflt 1cb
// 1bd: ldc 0.9375
// 1bf: iload 24
// 1c1: ifeq 1f3
// 1c4: ldc 0.9375
// 1c6: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
// 1c9: aload 2
// 1ca: fconst_0
// 1cb: aload 3
// 1cc: checkcast net/minecraft/class_1657
// 1cf: invokevirtual net/minecraft/class_1657.method_5715 ()Z
// 1d2: ifeq 1f6
// 1d5: goto 1e3
// 1d8: ldc2_w -1125386672309435135
// 1db: lload 10
// 1dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: athrow
// 1e3: ldc -1.37
// 1e5: goto 1f3
// 1e8: ldc2_w -1125386672309435135
// 1eb: lload 10
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: goto 1f8
// 1f6: ldc -1.501
// 1f8: fconst_0
// 1f9: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 1fc: aload 26
// 1fe: aload 27
// 200: invokevirtual net/minecraft/class_591.method_62110 (Lnet/minecraft/class_10055;)V
// 203: aload 26
// 205: getfield net/minecraft/class_591.field_3483 Lnet/minecraft/class_630;
// 208: bipush 0
// 209: putfield net/minecraft/class_630.field_3665 Z
// 20c: aload 26
// 20e: getfield net/minecraft/class_591.field_3484 Lnet/minecraft/class_630;
// 211: bipush 0
// 212: putfield net/minecraft/class_630.field_3665 Z
// 215: aload 26
// 217: getfield net/minecraft/class_591.field_3486 Lnet/minecraft/class_630;
// 21a: bipush 0
// 21b: putfield net/minecraft/class_630.field_3665 Z
// 21e: aload 26
// 220: getfield net/minecraft/class_591.field_3482 Lnet/minecraft/class_630;
// 223: bipush 0
// 224: putfield net/minecraft/class_630.field_3665 Z
// 227: aload 26
// 229: getfield net/minecraft/class_591.field_3479 Lnet/minecraft/class_630;
// 22c: bipush 0
// 22d: putfield net/minecraft/class_630.field_3665 Z
// 230: aload 26
// 232: getfield net/minecraft/class_591.field_3394 Lnet/minecraft/class_630;
// 235: bipush 0
// 236: putfield net/minecraft/class_630.field_3665 Z
// 239: aload 26
// 23b: aload 2
// 23c: aload 25
// 23e: checkcast net/minecraft/class_4588
// 241: sipush 23443
// 244: ldc2_w 7215778335162354489
// 247: lload 10
// 249: lxor
// 24a: invokedynamic n (IJ)I bsm=su/catlean/nn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: bipush 0
// 250: invokevirtual net/minecraft/class_591.method_60879 (Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;II)V
// 253: aload 2
// 254: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 257: return
}

static void z(nn var0, class_4587 var1, class_1297 var2, Color var3, s8 var4, g7 var5, float var6, int var7, Object var8, long var9) {
var9 = a ^ var9;
long var10001 = var9 ^ 47566243286211L;
int var11 = (int)((var9 ^ 47566243286211L) >>> 32);
int var12 = (int)((var9 ^ 47566243286211L) << 32 >>> 48);
int var13 = (int)(var10001 << 48 >>> 48);
int var14 = (int)((var9 ^ 103221622572685L) >>> 48);
long var15 = (var9 ^ 103221622572685L) << 16 >>> 16;
if ((var7 & b<"n">(4847, 847170542697446013L ^ var9)) != 0) {
var6 = zi.v.n(var11, (char)var12, var13);
}

var0.Q((short)var14, var1, var2, var3, var4, var5, var6, var15);
}

public final void h(
long a,
@NotNull class_4587 stack,
@NotNull class_591 model,
@NotNull class_10055 state,
@NotNull class_243 pos,
@NotNull Color color,
@NotNull s8 mode,
@NotNull g7 polygon
) {
ax = a ^ ax;
long var10 = ax ^ 52098759450502L;
long var12 = (ax ^ 60043366368988L) >>> 16;
int var14 = (int)((ax ^ 60043366368988L) << 48 >>> 48);
long var15 = ax ^ 99752721933437L;
Intrinsics.checkNotNullParameter(stack, a<"l">(21144, 5996103343499980777L ^ ax));
Intrinsics.checkNotNullParameter(model, a<"l">(32073, 2992402957900939304L ^ ax));
Intrinsics.checkNotNullParameter(state, a<"l">(20029, 7666396013267923805L ^ ax));
Intrinsics.checkNotNullParameter(pos, a<"l">(7612, 1139639903367356628L ^ ax));
Intrinsics.checkNotNullParameter(color, a<"l">(20234, 4991177401011548792L ^ ax));
Intrinsics.checkNotNullParameter(mode, a<"l">(10994, 7690369327058605961L ^ ax));
Intrinsics.checkNotNullParameter(polygon, a<"l">(24942, 3940533921984060417L ^ ax));
a var18 = new a(var15, polygon, mode, color);
stack.method_22903();
class_4184 var10000 = zf.F(var10).method_1561().field_4686;
Intrinsics.checkNotNull(var10000);
class_243 var29 = var10000.method_71156();
Intrinsics.checkNotNullExpressionValue(var29, a<"l">(25758, 151993774526863849L ^ ax));
class_243 var19 = var29;
double var20 = pos.field_1352 - var19.field_1352;
double var22 = pos.field_1351 - var19.field_1351;
double var24 = pos.field_1350 - var19.field_1350;
var10000 = zf.F(var10).field_1773.method_19418();
Intrinsics.checkNotNullExpressionValue(var10000, a<"l">(22936, 1289639335477093611L ^ ax));
class_4184 var26 = var10000;
stack.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-var26.method_19330() + 180.0F));
boolean var31 = vm.a<"Å">(258943050805360387L, ax);
stack.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(-var26.method_19329()));
stack.method_46416((float)var20, (float)var22, (float)var24);
stack.method_22905(state.field_53453, state.field_53453, state.field_53453);
kf.G.g(var12, state, (short)var14, stack, state.field_53446);
stack.method_22905(-1.0F, -1.0F, 1.0F);
stack.method_22905(0.9375F, 0.9375F, 0.9375F);
boolean var17 = var31;

try {
stack.method_46416(0.0F, -1.501F, 0.0F);
model.method_62110(state);
model.field_3483.field_3665 = false;
model.field_3484.field_3665 = false;
model.field_3486.field_3665 = false;
model.field_3482.field_3665 = false;
model.field_3479.field_3665 = false;
model.field_3394.field_3665 = false;
model.method_60879(stack, var18, b<"n">(29778, 4876313219090159577L ^ ax), 0);
stack.method_22909();
if (!var17) {
vm.a<"Å">(new _g[2], 281620884326255061L, ax);
}
} catch (NumberFormatException var27) {
throw vm.a<"Å">(var27, 238054527204816429L, ax);
}
}

private final void I(class_4587 var1, class_1297 var2, Color var3, s8 var4, long var5, g7 var7, float var8) {
var5 = a ^ var5;
long var9 = var5 ^ 71892177972536L;
long var10001 = var5 ^ 92400764908907L;
int var11 = (int)((var5 ^ 92400764908907L) >>> 32);
int var12 = (int)((var5 ^ 92400764908907L) << 32 >>> 48);
int var13 = (int)(var10001 << 48 >>> 48);
long var14 = var5 ^ 57973438699203L;

try {
if (!(var2 instanceof class_1511)) {
return;
}
} catch (NumberFormatException var28) {
throw vm.a<"Å">(var28, 3599452886146303123L, var5);
}

a var16 = new a(var14, var7, var4, var3);
class_897 var10000 = zf.F(var9).method_1561().method_3953(var2);
Intrinsics.checkNotNullExpressionValue(var10000, a<"l">(16554, 8030692521740930914L ^ var5));
class_897 var17 = var10000;
class_9946 var18 = ((EndCrystalRendererAccessor)((class_892)var17)).getModel();
class_10017 var30 = ((class_892)var17).method_62425(var2, zi.v.n(var11, (char)var12, var13));
Intrinsics.checkNotNullExpressionValue(var30, a<"l">(4861, 1224880373109316906L ^ var5));
class_10014 var19 = (class_10014)var30;
class_4184 var31 = zf.F(var9).method_1561().field_4686;
Intrinsics.checkNotNull(var31);
class_243 var32 = var31.method_71156();
Intrinsics.checkNotNullExpressionValue(var32, a<"l">(21101, 5863835783818845614L ^ var5));
class_243 var20 = var32;
double var21 = ((class_1511)var2).method_23317() - var20.field_1352;
double var23 = ((class_1511)var2).method_23318() - var20.field_1351;
double var25 = ((class_1511)var2).method_23321() - var20.field_1350;
var1.method_22903();
class_4184 var33 = zf.F(var9).field_1773.method_19418();
Intrinsics.checkNotNullExpressionValue(var33, a<"l">(16405, 2150050984305233876L ^ var5));
class_4184 var27 = var33;
var1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(-var27.method_19330() + 180.0F));
var1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(-var27.method_19329()));
var1.method_22904(var21, var23, var25);
var1.method_22905(var8, var8, var8);
var1.method_22905(2.0F, 2.0F, 2.0F);
var1.method_46416(0.0F, -0.5F, 0.0F);
var18.method_62083(var19);
var18.method_60879(var1, var16, b<"n">(23443, 7215780038426692267L ^ var5), 0);
var1.method_22909();
}

static {
long var20 = a ^ 133055295838957L;
vm.a<"Å">(true, -6527723093957517531L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[29];
int var16 = 0;
String var15 = "»²è4yËöæ\u0017¶Å\u0000\nâ\u001fØ\u001fë\u0013w\u0005/\u009c¥¢î]\u0016:\u0012ðêï\u0099ÿ\røLay\u0010Ø\u0006-¯JpJ@i¿èH\u008aiË>\u0010Ç\u0012\u00981\u0003£ñÒ\u0004x{¦òÞ×\u0013 \u0090e\nÌ.\u0094ã\u000føIÞ\u0017H\u0097\u001cÜ\u009dÈÚ³\u0091ü¡Ìö\u0004\t\u0093ú\u0094PG +\n\u009f\u0087¢6é0¢MÕTÛh\u0001 Ð\f§îßm\u0080Ïchr\u0098]\u0015¡Ý(Ì\u009f7©,M\nLl3Mño_eôÆc6\u0084%¬Zâ½Ñ'ùÓÈ0Kb~\u0012Ê\u0098Y!±\u0018µFf{ÂEåopËÐ¾U\u0001±g/ï?¹\f\u0094\u0094¡8DåÐÎ6FÂ|P\u0095ÖA}çìØs\u0094º¨\u008dé^\u00adúS»ð\u009b³î\u0097\u007f\f¶ÂYñTz\u0018\u0096\u0084@ï\u0004\u0092\u001bÃGùJR÷2S\u0010Ít\u0088\u0097G\u008e\u008cz\u0096;-ûÂ\u0018¾  )~\u0097¦r\u0081«Ï8\tÍP\u0017\u0011\râ¨@\u0010g«\u009d\u001a\u0017iJr\u009f¸É«.\u009a\u008býî\u0092w2+x\u008cÑBØ¨Ò\rR=\u0083ìQíã®4.Ûc}aÖ±¬\u0092)¼¼Ñì\u0002«[\tàZÈEÃ\u00186z\u0001¦¥\u0004<$\u0097øTìàÞ\u0002X\u0088B7è9/³\u0012\u001dÛ\\Ïa[¶\u000b]\u008b\u009d\u001bZ\u001eJÿj\u0019\u008b\\À>äú©\u000f<\u001f=:5½{vMyÐ\u0007Ý¼Nà,¡Ù\u0081Ê0\t'ú\u0081»iÍ \u0090\u0081\u0016\u0012%\u0095ÊÇÕ^0.qÞ´jJÚæ`\u0007¬éT\tL\u0090¦üÎµ\u008d ô>\u0018\u0080\u0081J1\f1ÄÏà\u001bM\u008dþ\u0015\u0004'EÀ\u008fÏ\u0088\u008dö\u0093búH?^(0\u0087¿|õ\u0094¨Ôc\u008aÜ¥RÐM%Ó8)]\u0005ÇO\u0082e£\u0011>\u009e\u0091Û\u0092 ö±'ünêa |áeN/\u0098ììjØ¿ó\u008cc\u0092ÂmP¾\u0083°D±¿Ü\u0094ý]¶'q\u0082\u0018\rC\u001fâ Âp\u0088°d)\u0002{t|\u0015^\u001b3¯;Æø=\u0010\u007fàM\nGÕ«\u001c=\u0003¿\bÑìµ\u0095 hN.çS£á;®c¨\u001bú\u0004;Ä»\u000bþà¸¹\u0080ßåp\u0091\u0094í\u0012³\u0015 bSï0EI 4ùË?Ã\u00826iç·\u0012Çá\u0006Zí\u0018ð\u0088\u000eK\f`{»\u0010hÆ~\t\b\b\u0005\u0005¨\u0091¬|\u0091\u0095A¶\u0010\u0091>a¹\u008bC³&LÌJ<0ò\u0011^ ñ\u008a\u0015xksÚ7ntÍ»2\u0088¤\u0015·¯ \u008f\u00804ÉBCÍ\u0004.\u0095ËrÕ\u0010\u0004#0\u001dýPÆ×[îk\u0006°×\u0004S0\u0083\u0092Jªa\u0019ÑÊ\u008b\u0019NÇGÀl\u0097Ø¥UÁ)¬\u0019°»YÑ!\u0088;ª\u001fK\u008c-T\u0012\u0099ëCª\u008bÆ\u0015Á,Br\u0010àå\u008d8¾òæò\u0012ÐÆx6\u0095°ÝĀ©õµÀô\u008e´AÚ¯õL\"¸^@4z¸\u000bþ¡Ò\u0017Ã1°!¿êC¥3v³¨\u008eùl\u008acÖ©ä\u0011\u001bþIìë=\tA\u001a±¨N ¼Íã\u0080nÙ±\u008d(\u000fHdÑµ:\u000bú¥=×\u0002Lx%â\u0003ãy\u001a\u000e$|UE\n`Ð°KtD»ô\u008d\u0002\u0094År{\u0085ï\u008bý\u009dÐÔ\u007f\u0004J\u00adG) õnÞ\u0096sÓ\u0006¶\u0081ë\u0011¯\t\fÄD¬Ò\u00069zô$6\u000f±\u0096)\u0097µª\u008eY\u0088\u0015Î\u0088\"\u0005S¨Ì³ä±'Õ\u007fç\u0011\t%\u007fóp3O0\u0097#~\u009fl\u001d\u001f|ÃÓErZ½Ó\u0099|\u0088\\\u0007\u0007ük³û?{ü5H&ò\u0092¾æê,[_\u0082\nëL_Ä.*\u0089\t\u0080¥\u0088ZC¬¯±~uÎ\u001d\u001aúÒ¥4ÙÏÔ\u0095\u0013¨R\u0082Ñ2z ç%¿\u0015£\u009b8Úñí\u0083\u009b-\u001fÏqËK\u009d>¦\u00927I\u0003\u0016]gõ\u009a²\u008d(ÜÂx\u001d\u0019·èËët)ï\u008aW5\u001aõMà\u0089Ã\u009aú/\u0019\u0099\u008f¨|Ú¦¾\u0012\u009c;0\u001d\fRÛ";
int var17 = "»²è4yËöæ\u0017¶Å\u0000\nâ\u001fØ\u001fë\u0013w\u0005/\u009c¥¢î]\u0016:\u0012ðêï\u0099ÿ\røLay\u0010Ø\u0006-¯JpJ@i¿èH\u008aiË>\u0010Ç\u0012\u00981\u0003£ñÒ\u0004x{¦òÞ×\u0013 \u0090e\nÌ.\u0094ã\u000føIÞ\u0017H\u0097\u001cÜ\u009dÈÚ³\u0091ü¡Ìö\u0004\t\u0093ú\u0094PG +\n\u009f\u0087¢6é0¢MÕTÛh\u0001 Ð\f§îßm\u0080Ïchr\u0098]\u0015¡Ý(Ì\u009f7©,M\nLl3Mño_eôÆc6\u0084%¬Zâ½Ñ'ùÓÈ0Kb~\u0012Ê\u0098Y!±\u0018µFf{ÂEåopËÐ¾U\u0001±g/ï?¹\f\u0094\u0094¡8DåÐÎ6FÂ|P\u0095ÖA}çìØs\u0094º¨\u008dé^\u00adúS»ð\u009b³î\u0097\u007f\f¶ÂYñTz\u0018\u0096\u0084@ï\u0004\u0092\u001bÃGùJR÷2S\u0010Ít\u0088\u0097G\u008e\u008cz\u0096;-ûÂ\u0018¾  )~\u0097¦r\u0081«Ï8\tÍP\u0017\u0011\râ¨@\u0010g«\u009d\u001a\u0017iJr\u009f¸É«.\u009a\u008býî\u0092w2+x\u008cÑBØ¨Ò\rR=\u0083ìQíã®4.Ûc}aÖ±¬\u0092)¼¼Ñì\u0002«[\tàZÈEÃ\u00186z\u0001¦¥\u0004<$\u0097øTìàÞ\u0002X\u0088B7è9/³\u0012\u001dÛ\\Ïa[¶\u000b]\u008b\u009d\u001bZ\u001eJÿj\u0019\u008b\\À>äú©\u000f<\u001f=:5½{vMyÐ\u0007Ý¼Nà,¡Ù\u0081Ê0\t'ú\u0081»iÍ \u0090\u0081\u0016\u0012%\u0095ÊÇÕ^0.qÞ´jJÚæ`\u0007¬éT\tL\u0090¦üÎµ\u008d ô>\u0018\u0080\u0081J1\f1ÄÏà\u001bM\u008dþ\u0015\u0004'EÀ\u008fÏ\u0088\u008dö\u0093búH?^(0\u0087¿|õ\u0094¨Ôc\u008aÜ¥RÐM%Ó8)]\u0005ÇO\u0082e£\u0011>\u009e\u0091Û\u0092 ö±'ünêa |áeN/\u0098ììjØ¿ó\u008cc\u0092ÂmP¾\u0083°D±¿Ü\u0094ý]¶'q\u0082\u0018\rC\u001fâ Âp\u0088°d)\u0002{t|\u0015^\u001b3¯;Æø=\u0010\u007fàM\nGÕ«\u001c=\u0003¿\bÑìµ\u0095 hN.çS£á;®c¨\u001bú\u0004;Ä»\u000bþà¸¹\u0080ßåp\u0091\u0094í\u0012³\u0015 bSï0EI 4ùË?Ã\u00826iç·\u0012Çá\u0006Zí\u0018ð\u0088\u000eK\f`{»\u0010hÆ~\t\b\b\u0005\u0005¨\u0091¬|\u0091\u0095A¶\u0010\u0091>a¹\u008bC³&LÌJ<0ò\u0011^ ñ\u008a\u0015xksÚ7ntÍ»2\u0088¤\u0015·¯ \u008f\u00804ÉBCÍ\u0004.\u0095ËrÕ\u0010\u0004#0\u001dýPÆ×[îk\u0006°×\u0004S0\u0083\u0092Jªa\u0019ÑÊ\u008b\u0019NÇGÀl\u0097Ø¥UÁ)¬\u0019°»YÑ!\u0088;ª\u001fK\u008c-T\u0012\u0099ëCª\u008bÆ\u0015Á,Br\u0010àå\u008d8¾òæò\u0012ÐÆx6\u0095°ÝĀ©õµÀô\u008e´AÚ¯õL\"¸^@4z¸\u000bþ¡Ò\u0017Ã1°!¿êC¥3v³¨\u008eùl\u008acÖ©ä\u0011\u001bþIìë=\tA\u001a±¨N ¼Íã\u0080nÙ±\u008d(\u000fHdÑµ:\u000bú¥=×\u0002Lx%â\u0003ãy\u001a\u000e$|UE\n`Ð°KtD»ô\u008d\u0002\u0094År{\u0085ï\u008bý\u009dÐÔ\u007f\u0004J\u00adG) õnÞ\u0096sÓ\u0006¶\u0081ë\u0011¯\t\fÄD¬Ò\u00069zô$6\u000f±\u0096)\u0097µª\u008eY\u0088\u0015Î\u0088\"\u0005S¨Ì³ä±'Õ\u007fç\u0011\t%\u007fóp3O0\u0097#~\u009fl\u001d\u001f|ÃÓErZ½Ó\u0099|\u0088\\\u0007\u0007ük³û?{ü5H&ò\u0092¾æê,[_\u0082\nëL_Ä.*\u0089\t\u0080¥\u0088ZC¬¯±~uÎ\u001d\u001aúÒ¥4ÙÏÔ\u0095\u0013¨R\u0082Ñ2z ç%¿\u0015£\u009b8Úñí\u0083\u009b-\u001fÏqËK\u009d>¦\u00927I\u0003\u0016]gõ\u009a²\u008d(ÜÂx\u001d\u0019·èËët)ï\u008aW5\u001aõMà\u0089Ã\u009aú/\u0019\u0099\u008f¨|Ú¦¾\u0012\u009c;0\u001d\fRÛ"
.length();
char var14 = '(';
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[29];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[11];
int var3 = 0;
String var4 = "lö\u009e¶\u0011Ò18Á·b#ÔsF¿#\u0081FBÛA\u0092Õ¾r\u0093\u0017%Ðs\u00947\u009f\u0000&ÈH»¼1Àùòk\u001c\u0095\u000b}òUñ#ð?B\u0010`\u0012\u0015åÃ\u0090M $ícs/\t\u009b";
int var5 = "lö\u009e¶\u0011Ò18Á·b#ÔsF¿#\u0081FBÛA\u0092Õ¾r\u0093\u0017%Ðs\u00947\u009f\u0000&ÈH»¼1Àùòk\u001c\u0095\u000b}òUñ#ð?B\u0010`\u0012\u0015åÃ\u0090M $ícs/\t\u009b"
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
f = new Integer[11];
x = new nn();
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "Ñ¾ÓIN\u0095EroXû°òly\u0000";
var5 = "Ñ¾ÓIN\u0095EroXû°òly\u0000".length();
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

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "\u0015\u0080êÈ\u0080\u001dP\u00074Ë\u009cw^\"n\u0080\u0010z\u000b\u001c\rßko±e\u000b'=ìo*ë";
var17 = "\u0015\u0080êÈ\u0080\u001dP\u00074Ë\u009cw^\"n\u0080\u0010z\u000b\u001c\rßko±e\u000b'=ìo*ë".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void B(boolean var0) {
q = var0;
}

public static boolean J() {
return q;
}

public static boolean v() {
boolean var0 = J();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32700;
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
throw new RuntimeException("su/catlean/nn", var10);
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
throw new RuntimeException("su/catlean/nn" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24897;
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
throw new RuntimeException("su/catlean/nn", var14);
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
throw new RuntimeException("su/catlean/nn" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
