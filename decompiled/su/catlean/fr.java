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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class fr {
@NotNull
public static final fr a;
private static final long b = yz.a(-1892577867384747402L, -8191973748843455894L, MethodHandles.lookup().lookupClass()).a(1059541003579L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private fr() {
}

public final void Y(@NotNull class_332 context, @NotNull Color lineColor, long a, byte a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 3
// 001: bipush 8
// 003: lshl
// 004: iload 5
// 006: i2l
// 007: bipush 56
// 009: lshl
// 00a: bipush 56
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/fr.b J
// 011: lxor
// 012: lstore 6
// 014: lload 6
// 016: dup2
// 017: ldc2_w 977113143554
// 01a: lxor
// 01b: lstore 8
// 01d: dup2
// 01e: ldc2_w 132730337917469
// 021: lxor
// 022: lstore 10
// 024: dup2
// 025: ldc2_w 95032910417263
// 028: lxor
// 029: lstore 12
// 02b: dup2
// 02c: ldc2_w 120171577441629
// 02f: lxor
// 030: lstore 14
// 032: dup2
// 033: ldc2_w 139173558531824
// 036: lxor
// 037: lstore 16
// 039: dup2
// 03a: ldc2_w 97008581634519
// 03d: lxor
// 03e: lstore 18
// 040: pop2
// 041: ldc2_w 6499365450821327197
// 044: lload 6
// 046: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: aload 1
// 04c: sipush 8010
// 04f: ldc2_w 8938533820049884562
// 052: lload 6
// 054: lxor
// 055: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 05d: aload 2
// 05e: sipush 29351
// 061: ldc2_w 6090630879612790905
// 064: lload 6
// 066: lxor
// 067: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06f: lload 16
// 071: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 074: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 077: dup
// 078: sipush 24313
// 07b: ldc2_w 698763530839802915
// 07e: lload 6
// 080: lxor
// 081: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 089: astore 27
// 08b: istore 25
// 08d: bipush 0
// 08e: istore 28
// 090: aload 27
// 092: astore 29
// 094: new java/util/ArrayList
// 097: dup
// 098: invokespecial java/util/ArrayList.<init> ()V
// 09b: checkcast java/util/Collection
// 09e: astore 30
// 0a0: bipush 0
// 0a1: istore 31
// 0a3: aload 29
// 0a5: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0aa: astore 32
// 0ac: aload 32
// 0ae: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0b3: ifeq 0ef
// 0b6: aload 32
// 0b8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0bd: astore 33
// 0bf: aload 33
// 0c1: instanceof net/minecraft/class_1511
// 0c4: lload 3
// 0c5: lconst_0
// 0c6: lcmp
// 0c7: ifle 0ec
// 0ca: iload 25
// 0cc: ifne 0e9
// 0cf: ifeq 0ac
// 0d2: goto 0e0
// 0d5: ldc2_w 6529771597866837570
// 0d8: lload 6
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: aload 30
// 0e2: aload 33
// 0e4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0e9: pop
// 0ea: iload 25
// 0ec: ifeq 0ac
// 0ef: aload 30
// 0f1: checkcast java/util/List
// 0f4: nop
// 0f5: astore 26
// 0f7: new su/catlean/g7
// 0fa: dup
// 0fb: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 0fe: dup
// 0ff: sipush 13261
// 102: ldc2_w 4741898399177648402
// 105: lload 6
// 107: lxor
// 108: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 110: aload 26
// 112: invokeinterface java/util/List.size ()I 1
// 117: sipush 27061
// 11a: ldc2_w 6191835215704135012
// 11d: lload 6
// 11f: lxor
// 120: invokedynamic n (IJ)I bsm=su/catlean/fr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: imul
// 126: bipush 0
// 127: bipush 4
// 128: aconst_null
// 129: astore 20
// 12b: istore 21
// 12d: istore 22
// 12f: istore 23
// 131: astore 24
// 133: lload 8
// 135: aload 24
// 137: iload 23
// 139: iload 22
// 13b: iload 21
// 13d: aload 20
// 13f: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 142: iload 5
// 144: ifgt 0bd
// 147: astore 27
// 149: aload 26
// 14b: checkcast java/lang/Iterable
// 14e: astore 28
// 150: bipush 0
// 151: istore 29
// 153: aload 28
// 155: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 15a: astore 30
// 15c: aload 30
// 15e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 163: ifeq 2fe
// 166: aload 30
// 168: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 16d: astore 31
// 16f: aload 31
// 171: checkcast net/minecraft/class_1511
// 174: astore 32
// 176: bipush 0
// 177: istore 33
// 179: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 17c: lload 10
// 17e: aload 32
// 180: checkcast net/minecraft/class_1297
// 183: invokevirtual su/catlean/jl.L (JLnet/minecraft/class_1297;)[Lnet/minecraft/class_243;
// 186: astore 34
// 188: aconst_null
// 189: astore 35
// 18b: bipush 0
// 18c: istore 36
// 18e: iload 25
// 190: lload 3
// 191: lconst_0
// 192: lcmp
// 193: iflt 19c
// 196: ifne 333
// 199: aload 34
// 19b: arraylength
// 19c: istore 37
// 19e: iload 36
// 1a0: iload 37
// 1a2: if_icmpge 2a6
// 1a5: aload 34
// 1a7: iload 36
// 1a9: aaload
// 1aa: astore 38
// 1ac: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1af: new net/minecraft/class_243
// 1b2: dup
// 1b3: aload 38
// 1b5: getfield net/minecraft/class_243.field_1352 D
// 1b8: aload 38
// 1ba: getfield net/minecraft/class_243.field_1351 D
// 1bd: aload 38
// 1bf: getfield net/minecraft/class_243.field_1350 D
// 1c2: invokespecial net/minecraft/class_243.<init> (DDD)V
// 1c5: lload 18
// 1c7: invokevirtual su/catlean/jl.i (Lnet/minecraft/class_243;J)Lnet/minecraft/class_243;
// 1ca: astore 39
// 1cc: iload 25
// 1ce: lload 3
// 1cf: lconst_0
// 1d0: lcmp
// 1d1: ifle 2a3
// 1d4: ifne 2a1
// 1d7: aload 39
// 1d9: getfield net/minecraft/class_243.field_1350 D
// 1dc: dconst_0
// 1dd: dcmpl
// 1de: iload 25
// 1e0: ifne 163
// 1e3: lload 3
// 1e4: lconst_0
// 1e5: lcmp
// 1e6: iflt 177
// 1e9: goto 1f7
// 1ec: ldc2_w 6529771597866837570
// 1ef: lload 6
// 1f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f6: athrow
// 1f7: iload 5
// 1f9: ifge 206
// 1fc: ifle 29e
// 1ff: aload 39
// 201: getfield net/minecraft/class_243.field_1350 D
// 204: dconst_1
// 205: dcmpg
// 206: ifge 29e
// 209: goto 217
// 20c: ldc2_w 6529771597866837570
// 20f: lload 6
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: aload 35
// 219: iload 25
// 21b: ifne 28e
// 21e: goto 22c
// 221: ldc2_w 6529771597866837570
// 224: lload 6
// 226: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22b: athrow
// 22c: ifnonnull 256
// 22f: goto 23d
// 232: ldc2_w 6529771597866837570
// 235: lload 6
// 237: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23c: athrow
// 23d: new org/joml/Vector4d
// 240: dup
// 241: aload 39
// 243: getfield net/minecraft/class_243.field_1352 D
// 246: aload 39
// 248: getfield net/minecraft/class_243.field_1351 D
// 24b: aload 39
// 24d: getfield net/minecraft/class_243.field_1350 D
// 250: dconst_0
// 251: invokespecial org/joml/Vector4d.<init> (DDDD)V
// 254: astore 35
// 256: aload 35
// 258: aload 39
// 25a: getfield net/minecraft/class_243.field_1352 D
// 25d: aload 35
// 25f: getfield org/joml/Vector4d.x D
// 262: invokestatic java/lang/Math.min (DD)D
// 265: putfield org/joml/Vector4d.x D
// 268: aload 35
// 26a: aload 39
// 26c: getfield net/minecraft/class_243.field_1351 D
// 26f: aload 35
// 271: getfield org/joml/Vector4d.y D
// 274: invokestatic java/lang/Math.min (DD)D
// 277: putfield org/joml/Vector4d.y D
// 27a: aload 35
// 27c: aload 39
// 27e: getfield net/minecraft/class_243.field_1352 D
// 281: aload 35
// 283: getfield org/joml/Vector4d.z D
// 286: invokestatic java/lang/Math.max (DD)D
// 289: putfield org/joml/Vector4d.z D
// 28c: aload 35
// 28e: aload 39
// 290: getfield net/minecraft/class_243.field_1351 D
// 293: aload 35
// 295: getfield org/joml/Vector4d.w D
// 298: invokestatic java/lang/Math.max (DD)D
// 29b: putfield org/joml/Vector4d.w D
// 29e: iinc 36 1
// 2a1: iload 25
// 2a3: ifeq 19e
// 2a6: aload 35
// 2a8: lload 3
// 2a9: lconst_0
// 2aa: lcmp
// 2ab: ifle 171
// 2ae: iload 25
// 2b0: ifne 2c6
// 2b3: ifnull 2f7
// 2b6: goto 2c4
// 2b9: ldc2_w 6529771597866837570
// 2bc: lload 6
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: aload 35
// 2c6: getfield org/joml/Vector4d.x D
// 2c9: d2f
// 2ca: fstore 36
// 2cc: aload 35
// 2ce: getfield org/joml/Vector4d.y D
// 2d1: d2f
// 2d2: fstore 37
// 2d4: aload 35
// 2d6: getfield org/joml/Vector4d.z D
// 2d9: d2f
// 2da: fstore 38
// 2dc: aload 35
// 2de: getfield org/joml/Vector4d.w D
// 2e1: d2f
// 2e2: fstore 39
// 2e4: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2e7: aload 27
// 2e9: fload 36
// 2eb: lload 14
// 2ed: fload 37
// 2ef: fload 38
// 2f1: fload 39
// 2f3: aload 2
// 2f4: invokevirtual su/catlean/jl.P (Lsu/catlean/g7;FJFFFLjava/awt/Color;)V
// 2f7: nop
// 2f8: nop
// 2f9: iload 25
// 2fb: ifeq 15c
// 2fe: nop
// 2ff: lload 12
// 301: aload 27
// 303: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 306: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 309: aconst_null
// 30a: aconst_null
// 30b: aconst_null
// 30c: new org/joml/Matrix3x2f
// 30f: dup
// 310: aload 1
// 311: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 314: checkcast org/joml/Matrix3x2fc
// 317: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
// 31a: aconst_null
// 31b: sipush 4994
// 31e: ldc2_w 7315087803377643345
// 321: lload 6
// 323: lxor
// 324: invokedynamic n (IJ)I bsm=su/catlean/fr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: aconst_null
// 32a: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 32d: lload 3
// 32e: lconst_0
// 32f: lcmp
// 330: ifle 333
// 333: return
}

public final void w(long a, @NotNull class_332 context, @NotNull Color lineColor, @NotNull Color friendLineColor) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/fr.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 75171994917490
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 27060465108225
// 012: lxor
// 013: lstore 8
// 015: dup2
// 016: ldc2_w 106415091230238
// 019: lxor
// 01a: lstore 10
// 01c: dup2
// 01d: ldc2_w 85837401051500
// 020: lxor
// 021: lstore 12
// 023: dup2
// 024: ldc2_w 128868903887198
// 027: lxor
// 028: lstore 14
// 02a: dup2
// 02b: ldc2_w 113167549524723
// 02e: lxor
// 02f: lstore 16
// 031: dup2
// 032: ldc2_w 70667565151700
// 035: lxor
// 036: lstore 18
// 038: dup2
// 039: ldc2_w 111854867434230
// 03c: lxor
// 03d: lstore 20
// 03f: dup2
// 040: ldc2_w 111032718316628
// 043: lxor
// 044: lstore 22
// 046: pop2
// 047: aload 3
// 048: sipush 26575
// 04b: ldc2_w 9034764250304618775
// 04e: lload 1
// 04f: lxor
// 050: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 058: aload 4
// 05a: sipush 4776
// 05d: ldc2_w 3057063759605027959
// 060: lload 1
// 061: lxor
// 062: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06a: aload 5
// 06c: sipush 18742
// 06f: ldc2_w 5018632038062034920
// 072: lload 1
// 073: lxor
// 074: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07c: lload 16
// 07e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 081: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 084: dup
// 085: sipush 919
// 088: ldc2_w 2211315561804219716
// 08b: lload 1
// 08c: lxor
// 08d: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 095: astore 31
// 097: nop
// 098: bipush 0
// 099: istore 32
// 09b: aload 31
// 09d: astore 33
// 09f: new java/util/ArrayList
// 0a2: dup
// 0a3: invokespecial java/util/ArrayList.<init> ()V
// 0a6: checkcast java/util/Collection
// 0a9: astore 34
// 0ab: ldc2_w 446272039720093022
// 0ae: lload 1
// 0af: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: bipush 0
// 0b5: istore 35
// 0b7: istore 29
// 0b9: aload 33
// 0bb: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0c0: astore 36
// 0c2: aload 36
// 0c4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c9: ifeq 16d
// 0cc: aload 36
// 0ce: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0d3: astore 37
// 0d5: aload 37
// 0d7: checkcast net/minecraft/class_1297
// 0da: astore 38
// 0dc: bipush 0
// 0dd: istore 39
// 0df: aload 38
// 0e1: instanceof net/minecraft/class_1657
// 0e4: iload 29
// 0e6: lload 1
// 0e7: lconst_0
// 0e8: lcmp
// 0e9: iflt 118
// 0ec: ifne 116
// 0ef: ifeq 15a
// 0f2: goto 0ff
// 0f5: ldc2_w 476661187285350977
// 0f8: lload 1
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: aload 38
// 101: lload 22
// 103: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 106: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 109: goto 116
// 10c: ldc2_w 476661187285350977
// 10f: lload 1
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: iload 29
// 118: ifne 157
// 11b: ifeq 149
// 11e: goto 12b
// 121: ldc2_w 476661187285350977
// 124: lload 1
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: lload 6
// 12d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 130: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 133: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 136: getstatic net/minecraft/class_5498.field_26664 Lnet/minecraft/class_5498;
// 139: if_acmpeq 15a
// 13c: goto 149
// 13f: ldc2_w 476661187285350977
// 142: lload 1
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: bipush 1
// 14a: goto 157
// 14d: ldc2_w 476661187285350977
// 150: lload 1
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: goto 15b
// 15a: bipush 0
// 15b: ifeq 0c2
// 15e: aload 34
// 160: aload 37
// 162: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 167: pop
// 168: iload 29
// 16a: ifeq 0c2
// 16d: aload 34
// 16f: checkcast java/util/List
// 172: nop
// 173: astore 30
// 175: new su/catlean/g7
// 178: dup
// 179: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 17c: dup
// 17d: sipush 17864
// 180: ldc2_w 6701999645302424338
// 183: lload 1
// 184: lxor
// 185: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 18d: aload 30
// 18f: invokeinterface java/util/List.size ()I 1
// 194: sipush 11783
// 197: ldc2_w 5289976110915489492
// 19a: lload 1
// 19b: lxor
// 19c: invokedynamic n (IJ)I bsm=su/catlean/fr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: imul
// 1a2: bipush 0
// 1a3: bipush 4
// 1a4: aconst_null
// 1a5: astore 24
// 1a7: istore 25
// 1a9: istore 26
// 1ab: istore 27
// 1ad: astore 28
// 1af: lload 8
// 1b1: aload 28
// 1b3: iload 27
// 1b5: iload 26
// 1b7: iload 25
// 1b9: aload 24
// 1bb: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1be: lload 1
// 1bf: lconst_0
// 1c0: lcmp
// 1c1: ifle 0d3
// 1c4: astore 31
// 1c6: aload 30
// 1c8: checkcast java/lang/Iterable
// 1cb: astore 32
// 1cd: bipush 0
// 1ce: istore 33
// 1d0: aload 32
// 1d2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1d7: astore 34
// 1d9: aload 34
// 1db: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1e0: ifeq 3a6
// 1e3: aload 34
// 1e5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1ea: astore 35
// 1ec: aload 35
// 1ee: checkcast net/minecraft/class_1297
// 1f1: astore 36
// 1f3: bipush 0
// 1f4: istore 37
// 1f6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1f9: aload 36
// 1fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1fe: lload 10
// 200: aload 36
// 202: invokevirtual su/catlean/jl.L (JLnet/minecraft/class_1297;)[Lnet/minecraft/class_243;
// 205: astore 38
// 207: aconst_null
// 208: astore 39
// 20a: bipush 0
// 20b: istore 40
// 20d: iload 29
// 20f: lload 1
// 210: lconst_0
// 211: lcmp
// 212: iflt 21b
// 215: ifne 3da
// 218: aload 38
// 21a: arraylength
// 21b: istore 41
// 21d: iload 40
// 21f: iload 41
// 221: if_icmpge 322
// 224: aload 38
// 226: iload 40
// 228: aaload
// 229: astore 42
// 22b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 22e: new net/minecraft/class_243
// 231: dup
// 232: aload 42
// 234: getfield net/minecraft/class_243.field_1352 D
// 237: aload 42
// 239: getfield net/minecraft/class_243.field_1351 D
// 23c: aload 42
// 23e: getfield net/minecraft/class_243.field_1350 D
// 241: invokespecial net/minecraft/class_243.<init> (DDD)V
// 244: lload 18
// 246: invokevirtual su/catlean/jl.i (Lnet/minecraft/class_243;J)Lnet/minecraft/class_243;
// 249: astore 43
// 24b: iload 29
// 24d: lload 1
// 24e: lconst_0
// 24f: lcmp
// 250: ifle 31f
// 253: ifne 31d
// 256: aload 43
// 258: getfield net/minecraft/class_243.field_1350 D
// 25b: dconst_0
// 25c: dcmpl
// 25d: iload 29
// 25f: ifne 1e0
// 262: lload 1
// 263: lconst_0
// 264: lcmp
// 265: iflt 1f4
// 268: goto 275
// 26b: ldc2_w 476661187285350977
// 26e: lload 1
// 26f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 274: athrow
// 275: lload 1
// 276: lconst_0
// 277: lcmp
// 278: ifle 285
// 27b: ifle 31a
// 27e: aload 43
// 280: getfield net/minecraft/class_243.field_1350 D
// 283: dconst_1
// 284: dcmpg
// 285: ifge 31a
// 288: goto 295
// 28b: ldc2_w 476661187285350977
// 28e: lload 1
// 28f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 294: athrow
// 295: aload 39
// 297: iload 29
// 299: ifne 30a
// 29c: goto 2a9
// 29f: ldc2_w 476661187285350977
// 2a2: lload 1
// 2a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a8: athrow
// 2a9: ifnonnull 2d2
// 2ac: goto 2b9
// 2af: ldc2_w 476661187285350977
// 2b2: lload 1
// 2b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b8: athrow
// 2b9: new org/joml/Vector4d
// 2bc: dup
// 2bd: aload 43
// 2bf: getfield net/minecraft/class_243.field_1352 D
// 2c2: aload 43
// 2c4: getfield net/minecraft/class_243.field_1351 D
// 2c7: aload 43
// 2c9: getfield net/minecraft/class_243.field_1350 D
// 2cc: dconst_0
// 2cd: invokespecial org/joml/Vector4d.<init> (DDDD)V
// 2d0: astore 39
// 2d2: aload 39
// 2d4: aload 43
// 2d6: getfield net/minecraft/class_243.field_1352 D
// 2d9: aload 39
// 2db: getfield org/joml/Vector4d.x D
// 2de: invokestatic java/lang/Math.min (DD)D
// 2e1: putfield org/joml/Vector4d.x D
// 2e4: aload 39
// 2e6: aload 43
// 2e8: getfield net/minecraft/class_243.field_1351 D
// 2eb: aload 39
// 2ed: getfield org/joml/Vector4d.y D
// 2f0: invokestatic java/lang/Math.min (DD)D
// 2f3: putfield org/joml/Vector4d.y D
// 2f6: aload 39
// 2f8: aload 43
// 2fa: getfield net/minecraft/class_243.field_1352 D
// 2fd: aload 39
// 2ff: getfield org/joml/Vector4d.z D
// 302: invokestatic java/lang/Math.max (DD)D
// 305: putfield org/joml/Vector4d.z D
// 308: aload 39
// 30a: aload 43
// 30c: getfield net/minecraft/class_243.field_1351 D
// 30f: aload 39
// 311: getfield org/joml/Vector4d.w D
// 314: invokestatic java/lang/Math.max (DD)D
// 317: putfield org/joml/Vector4d.w D
// 31a: iinc 40 1
// 31d: iload 29
// 31f: ifeq 21d
// 322: aload 39
// 324: lload 1
// 325: lconst_0
// 326: lcmp
// 327: ifle 1ee
// 32a: iload 29
// 32c: ifne 341
// 32f: ifnull 39f
// 332: goto 33f
// 335: ldc2_w 476661187285350977
// 338: lload 1
// 339: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33e: athrow
// 33f: aload 39
// 341: getfield org/joml/Vector4d.x D
// 344: d2f
// 345: fstore 40
// 347: aload 39
// 349: getfield org/joml/Vector4d.y D
// 34c: d2f
// 34d: fstore 41
// 34f: aload 39
// 351: getfield org/joml/Vector4d.z D
// 354: d2f
// 355: fstore 42
// 357: aload 39
// 359: getfield org/joml/Vector4d.w D
// 35c: d2f
// 35d: fstore 43
// 35f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 362: aload 31
// 364: fload 40
// 366: fload 41
// 368: fload 42
// 36a: fload 43
// 36c: aload 36
// 36e: checkcast net/minecraft/class_1657
// 371: lload 20
// 373: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 376: ifeq 388
// 379: aload 5
// 37b: goto 38a
// 37e: ldc2_w 476661187285350977
// 381: lload 1
// 382: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 387: athrow
// 388: aload 4
// 38a: astore 24
// 38c: fstore 25
// 38e: fstore 26
// 390: fstore 27
// 392: lload 14
// 394: fload 27
// 396: fload 26
// 398: fload 25
// 39a: aload 24
// 39c: invokevirtual su/catlean/jl.P (Lsu/catlean/g7;FJFFFLjava/awt/Color;)V
// 39f: nop
// 3a0: nop
// 3a1: iload 29
// 3a3: ifeq 1d9
// 3a6: nop
// 3a7: lload 12
// 3a9: aload 31
// 3ab: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 3ae: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 3b1: aconst_null
// 3b2: aconst_null
// 3b3: aconst_null
// 3b4: new org/joml/Matrix3x2f
// 3b7: dup
// 3b8: aload 3
// 3b9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3bc: checkcast org/joml/Matrix3x2fc
// 3bf: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
// 3c2: aconst_null
// 3c3: sipush 27496
// 3c6: ldc2_w 8823523352726096825
// 3c9: lload 1
// 3ca: lxor
// 3cb: invokedynamic n (IJ)I bsm=su/catlean/fr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d0: aconst_null
// 3d1: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 3d4: lload 1
// 3d5: lconst_0
// 3d6: lcmp
// 3d7: ifle 3da
// 3da: return
}

static {
long var11 = b ^ 48464439052171L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[9];
int var18 = 0;
String var17 = "~UOàFòÞVXPp\u0000¿M\u000b\r (Þ\u0018Ú/#\u0082$\u0015\u000e`\u0010,Uì=4\u0000-]¹\u0083@±®\u009f\rÉ\u001d'r\u00990PRÊ;»ÌÛî.\u0097·ÿ~pû\u0018\u0007\u008f\u001bÅB\u009e\u0096¨K\u0007±\u009d;½J\u0086\u0081Î-ú÷ä¹2\u00876g#&\u008a\u008a!\u0010\u0001ú6Ø\u008f\u0001ð\u009aì\u001fZéC¤6Ú ¡e\u009c¦óæ\u0088ÄTI$e;ýfI´äÒ¢ÇjÝüOÓ±N]´\u0019\u0091 ûâ1I°õ5ûUé\u0087\u009d\rOÃè\u00ad´ü¸\u0091\u0014àó÷\u0005\u0090\u009at\u0088K\u0097\u0018\u000fæoÚìç÷\u0007³sXTÎ\u0017\r©D\\rê¯u|«";
int var19 = "~UOàFòÞVXPp\u0000¿M\u000b\r (Þ\u0018Ú/#\u0082$\u0015\u000e`\u0010,Uì=4\u0000-]¹\u0083@±®\u009f\rÉ\u001d'r\u00990PRÊ;»ÌÛî.\u0097·ÿ~pû\u0018\u0007\u008f\u001bÅB\u009e\u0096¨K\u0007±\u009d;½J\u0086\u0081Î-ú÷ä¹2\u00876g#&\u008a\u008a!\u0010\u0001ú6Ø\u008f\u0001ð\u009aì\u001fZéC¤6Ú ¡e\u009c¦óæ\u0088ÄTI$e;ýfI´äÒ¢ÇjÝüOÓ±N]´\u0019\u0091 ûâ1I°õ5ûUé\u0087\u009d\rOÃè\u00ad´ü¸\u0091\u0014àó÷\u0005\u0090\u009at\u0088K\u0097\u0018\u000fæoÚìç÷\u0007³sXTÎ\u0017\r©D\\rê¯u|«"
.length();
char var16 = 16;
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
c = var20;
d = new String[9];
h = new HashMap(13);
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
String var4 = "vF·ª\u0002Ü\u001eUÚÎJz\u008c $\u0094";
int var5 = "vF·ª\u0002Ü\u001eUÚÎJz\u008c $\u0094".length();
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
f = var6;
g = new Integer[4];
a = new fr();
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "{\u0015eÍGhqóYgãÎ%\u000e T";
var5 = "{\u0015eÍGhqóYgãÎ%\u000e T".length();
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

var17 = "ûë¥'8ûJNTB½\u0001\u0088\u001fÍé6à\u008aïL¾ûóåeQ\u0090ã}7ñ8\u008d\\\u008cuj\u0015Ç:\u0095H\u001a Ð\u007f\u0012¯Hü#ýÔ§ìÃ6äXD¼ÈÉ\u0094ö\u0086â%Ï+Û\u000búÿ-\u001d@ÒnÌ_\u008f\u0086õåj:3";
var19 = "ûë¥'8ûJNTB½\u0001\u0088\u001fÍé6à\u008aïL¾ûóåeQ\u0090ã}7ñ8\u008d\\\u008cuj\u0015Ç:\u0095H\u001a Ð\u007f\u0012¯Hü#ýÔ§ìÃ6äXD¼ÈÉ\u0094ö\u0086â%Ï+Û\u000búÿ-\u001d@ÒnÌ_\u008f\u0086õåj:3"
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16864;
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
throw new RuntimeException("su/catlean/fr", var10);
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
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/fr" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 10216;
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
throw new RuntimeException("su/catlean/fr", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/fr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
