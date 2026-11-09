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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.gofra.Flow;

public final class kp extends _g {
@NotNull
public static final kp G;
@NotNull
private static final List A;
private static int Y;
private static final long a = yz.a(1935642746144268048L, 7250887553497893412L, MethodHandles.lookup().lookupClass()).a(133675555345181L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private kp(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 12190063978904L;
super(b<"c">(30777, 6269690347546151704L ^ var1), jt.F(), null, 4, null, var3);
}

@Flow
private final void w(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kp.a J
// 003: ldc2_w 119673418975353
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 102744767392301
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 1859590305118
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 68391101175033
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 82989980606865
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 95923440804147
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 29277204196891
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 122311385805250
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 57923895601154
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 75823925875998
// 045: lxor
// 046: dup2
// 047: bipush 48
// 049: lushr
// 04a: l2i
// 04b: istore 20
// 04d: dup2
// 04e: bipush 16
// 050: lshl
// 051: bipush 32
// 053: lushr
// 054: l2i
// 055: istore 21
// 057: dup2
// 058: bipush 48
// 05a: lshl
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 22
// 061: pop2
// 062: pop2
// 063: ldc2_w 3892358595981636622
// 066: lload 2
// 067: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: lload 4
// 06e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 071: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 074: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 077: dup
// 078: sipush 25566
// 07b: ldc2_w 4671845553384660697
// 07e: lload 2
// 07f: lxor
// 080: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 088: astore 29
// 08a: aload 1
// 08b: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 08e: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 091: aload 1
// 092: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 095: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 098: aload 29
// 09a: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 09d: fneg
// 09e: ldc 180.0
// 0a0: fadd
// 0a1: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 0a6: dup
// 0a7: sipush 9911
// 0aa: ldc2_w 6310479692465527732
// 0ad: lload 2
// 0ae: lxor
// 0af: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b7: checkcast org/joml/Quaternionfc
// 0ba: lload 14
// 0bc: dup2_x1
// 0bd: pop2
// 0be: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 0c1: aload 1
// 0c2: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 0c5: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 0c8: aload 29
// 0ca: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 0cd: fneg
// 0ce: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 0d3: dup
// 0d4: sipush 12169
// 0d7: ldc2_w 3695336287453631104
// 0da: lload 2
// 0db: lxor
// 0dc: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e4: checkcast org/joml/Quaternionfc
// 0e7: lload 14
// 0e9: dup2_x1
// 0ea: pop2
// 0eb: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 0ee: istore 28
// 0f0: new su/catlean/g7
// 0f3: dup
// 0f4: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 0f7: dup
// 0f8: sipush 24680
// 0fb: ldc2_w 5779734906418732393
// 0fe: lload 2
// 0ff: lxor
// 100: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 108: getstatic su/catlean/kp.A Ljava/util/List;
// 10b: invokeinterface java/util/List.size ()I 1
// 110: bipush 2
// 111: imul
// 112: bipush 0
// 113: bipush 4
// 114: aconst_null
// 115: astore 23
// 117: istore 24
// 119: istore 25
// 11b: istore 26
// 11d: astore 27
// 11f: lload 6
// 121: aload 27
// 123: iload 26
// 125: iload 25
// 127: iload 24
// 129: aload 23
// 12b: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 12e: astore 30
// 130: getstatic su/catlean/kp.A Ljava/util/List;
// 133: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 138: astore 31
// 13a: aload 31
// 13c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 141: ifeq 4a6
// 144: aload 31
// 146: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 14b: checkcast su/catlean/w_
// 14e: astore 32
// 150: fconst_0
// 151: fstore 33
// 153: ldc 90.0
// 155: fstore 34
// 157: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 15a: bipush 1
// 15b: aload 32
// 15d: invokevirtual su/catlean/w_.J ()I
// 160: bipush 1
// 161: isub
// 162: invokestatic java/lang/Math.max (II)I
// 165: i2f
// 166: aload 32
// 168: invokevirtual su/catlean/w_.J ()I
// 16b: i2f
// 16c: lload 18
// 16e: invokevirtual su/catlean/jl.T (FFJ)F
// 171: fstore 35
// 173: iload 28
// 175: ifeq 4f9
// 178: aload 32
// 17a: invokevirtual su/catlean/w_.J ()I
// 17d: bipush 3
// 17e: iload 28
// 180: ifeq 1c4
// 183: goto 190
// 186: ldc2_w 3939198788746869279
// 189: lload 2
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: if_icmpge 1b2
// 193: goto 1a0
// 196: ldc2_w 3939198788746869279
// 199: lload 2
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: fload 35
// 1a2: ldc 3.0
// 1a4: fdiv
// 1a5: goto 1df
// 1a8: ldc2_w 3939198788746869279
// 1ab: lload 2
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: aload 32
// 1b4: invokevirtual su/catlean/w_.J ()I
// 1b7: sipush 14489
// 1ba: ldc2_w 1526606822331565875
// 1bd: lload 2
// 1be: lxor
// 1bf: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: if_icmple 1de
// 1c7: fconst_1
// 1c8: fload 35
// 1ca: ldc 25.0
// 1cc: fsub
// 1cd: ldc 5.0
// 1cf: fdiv
// 1d0: fsub
// 1d1: goto 1df
// 1d4: ldc2_w 3939198788746869279
// 1d7: lload 2
// 1d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: athrow
// 1de: fconst_1
// 1df: fstore 36
// 1e1: ldc 8.0
// 1e3: fload 36
// 1e5: fmul
// 1e6: fstore 37
// 1e8: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1eb: new java/awt/Color
// 1ee: dup
// 1ef: aload 32
// 1f1: invokevirtual su/catlean/w_.m ()I
// 1f4: invokespecial java/awt/Color.<init> (I)V
// 1f7: iload 20
// 1f9: i2c
// 1fa: iload 21
// 1fc: fload 36
// 1fe: iload 22
// 200: i2s
// 201: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 204: astore 38
// 206: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 209: new java/awt/Color
// 20c: dup
// 20d: aload 32
// 20f: invokevirtual su/catlean/w_.m ()I
// 212: invokespecial java/awt/Color.<init> (I)V
// 215: fload 36
// 217: ldc 0.3
// 219: fmul
// 21a: iload 20
// 21c: i2c
// 21d: swap
// 21e: iload 21
// 220: swap
// 221: iload 22
// 223: i2s
// 224: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 227: astore 39
// 229: new net/minecraft/class_4587
// 22c: dup
// 22d: invokespecial net/minecraft/class_4587.<init> ()V
// 230: astore 40
// 232: aload 40
// 234: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 237: aload 40
// 239: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 23c: aload 29
// 23e: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 241: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 246: dup
// 247: sipush 12169
// 24a: ldc2_w 3695336287453631104
// 24d: lload 2
// 24e: lxor
// 24f: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 254: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 257: checkcast org/joml/Quaternionfc
// 25a: lload 14
// 25c: dup2_x1
// 25d: pop2
// 25e: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 261: aload 40
// 263: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 266: aload 29
// 268: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 26b: ldc 180.0
// 26d: fadd
// 26e: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 273: dup
// 274: sipush 12169
// 277: ldc2_w 3695336287453631104
// 27a: lload 2
// 27b: lxor
// 27c: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 281: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 284: checkcast org/joml/Quaternionfc
// 287: lload 14
// 289: dup2_x1
// 28a: pop2
// 28b: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 28e: aload 40
// 290: aload 32
// 292: invokevirtual su/catlean/w_.R ()Lnet/minecraft/class_243;
// 295: getfield net/minecraft/class_243.field_1352 D
// 298: aload 29
// 29a: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 29d: getfield net/minecraft/class_243.field_1352 D
// 2a0: dsub
// 2a1: aload 32
// 2a3: invokevirtual su/catlean/w_.R ()Lnet/minecraft/class_243;
// 2a6: getfield net/minecraft/class_243.field_1351 D
// 2a9: ldc 0.05
// 2ab: f2d
// 2ac: dadd
// 2ad: aload 29
// 2af: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 2b2: getfield net/minecraft/class_243.field_1351 D
// 2b5: dsub
// 2b6: aload 32
// 2b8: invokevirtual su/catlean/w_.R ()Lnet/minecraft/class_243;
// 2bb: getfield net/minecraft/class_243.field_1350 D
// 2be: aload 29
// 2c0: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 2c3: getfield net/minecraft/class_243.field_1350 D
// 2c6: dsub
// 2c7: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 2ca: aload 40
// 2cc: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 2cf: fload 33
// 2d1: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 2d6: dup
// 2d7: sipush 12169
// 2da: ldc2_w 3695336287453631104
// 2dd: lload 2
// 2de: lxor
// 2df: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e7: checkcast org/joml/Quaternionfc
// 2ea: lload 14
// 2ec: dup2_x1
// 2ed: pop2
// 2ee: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 2f1: aload 40
// 2f3: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 2f6: fload 34
// 2f8: fneg
// 2f9: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 2fe: dup
// 2ff: sipush 12169
// 302: ldc2_w 3695336287453631104
// 305: lload 2
// 306: lxor
// 307: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 30f: checkcast org/joml/Quaternionfc
// 312: lload 14
// 314: dup2_x1
// 315: pop2
// 316: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 319: aload 40
// 31b: ldc2_w -4.0
// 31e: ldc2_w -4.0
// 321: dconst_0
// 322: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 325: aload 40
// 327: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 32a: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 32d: dup
// 32e: sipush 20908
// 331: ldc2_w 3258170279670099118
// 334: lload 2
// 335: lxor
// 336: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 33e: astore 41
// 340: getstatic su/catlean/gi.CRACK Lsu/catlean/gi;
// 343: astore 42
// 345: aload 30
// 347: aload 41
// 349: fconst_0
// 34a: lload 10
// 34c: ldc 8.0
// 34e: fconst_0
// 34f: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 352: aload 42
// 354: invokevirtual su/catlean/gi.L ()F
// 357: aload 42
// 359: invokevirtual su/catlean/gi.v ()F
// 35c: lload 16
// 35e: dup2_x1
// 35f: pop2
// 360: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 363: aload 39
// 365: lload 8
// 367: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 36a: pop
// 36b: aload 30
// 36d: aload 41
// 36f: ldc 8.0
// 371: lload 10
// 373: ldc 8.0
// 375: fconst_0
// 376: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 379: aload 42
// 37b: invokevirtual su/catlean/gi.o ()F
// 37e: aload 42
// 380: invokevirtual su/catlean/gi.v ()F
// 383: lload 16
// 385: dup2_x1
// 386: pop2
// 387: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 38a: aload 39
// 38c: lload 8
// 38e: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 391: pop
// 392: aload 30
// 394: aload 41
// 396: ldc 8.0
// 398: lload 10
// 39a: fconst_0
// 39b: fconst_0
// 39c: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 39f: aload 42
// 3a1: invokevirtual su/catlean/gi.o ()F
// 3a4: aload 42
// 3a6: invokevirtual su/catlean/gi.w ()F
// 3a9: lload 16
// 3ab: dup2_x1
// 3ac: pop2
// 3ad: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 3b0: aload 39
// 3b2: lload 8
// 3b4: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3b7: pop
// 3b8: aload 30
// 3ba: aload 41
// 3bc: fconst_0
// 3bd: lload 10
// 3bf: fconst_0
// 3c0: fconst_0
// 3c1: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 3c4: aload 42
// 3c6: invokevirtual su/catlean/gi.L ()F
// 3c9: aload 42
// 3cb: invokevirtual su/catlean/gi.w ()F
// 3ce: lload 16
// 3d0: dup2_x1
// 3d1: pop2
// 3d2: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 3d5: aload 39
// 3d7: lload 8
// 3d9: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3dc: pop
// 3dd: aload 40
// 3df: ldc2_w 4.0
// 3e2: ldc2_w 4.0
// 3e5: dconst_0
// 3e6: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 3e9: getstatic su/catlean/gi.CIRCLE Lsu/catlean/gi;
// 3ec: astore 43
// 3ee: aload 40
// 3f0: fload 37
// 3f2: fneg
// 3f3: f2d
// 3f4: ldc2_w 2.0
// 3f7: ddiv
// 3f8: fload 37
// 3fa: fneg
// 3fb: f2d
// 3fc: ldc2_w 2.0
// 3ff: ddiv
// 400: dconst_0
// 401: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 404: aload 30
// 406: aload 41
// 408: fconst_0
// 409: lload 10
// 40b: fload 37
// 40d: fconst_0
// 40e: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 411: aload 43
// 413: invokevirtual su/catlean/gi.L ()F
// 416: aload 43
// 418: invokevirtual su/catlean/gi.v ()F
// 41b: lload 16
// 41d: dup2_x1
// 41e: pop2
// 41f: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 422: aload 38
// 424: lload 8
// 426: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 429: pop
// 42a: aload 30
// 42c: aload 41
// 42e: fload 37
// 430: lload 10
// 432: fload 37
// 434: fconst_0
// 435: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 438: aload 43
// 43a: invokevirtual su/catlean/gi.o ()F
// 43d: aload 43
// 43f: invokevirtual su/catlean/gi.v ()F
// 442: lload 16
// 444: dup2_x1
// 445: pop2
// 446: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 449: aload 38
// 44b: lload 8
// 44d: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 450: pop
// 451: aload 30
// 453: aload 41
// 455: fload 37
// 457: lload 10
// 459: fconst_0
// 45a: fconst_0
// 45b: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 45e: aload 43
// 460: invokevirtual su/catlean/gi.o ()F
// 463: aload 43
// 465: invokevirtual su/catlean/gi.w ()F
// 468: lload 16
// 46a: dup2_x1
// 46b: pop2
// 46c: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 46f: aload 38
// 471: lload 8
// 473: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 476: pop
// 477: aload 30
// 479: aload 41
// 47b: fconst_0
// 47c: lload 10
// 47e: fconst_0
// 47f: fconst_0
// 480: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 483: aload 43
// 485: invokevirtual su/catlean/gi.L ()F
// 488: aload 43
// 48a: invokevirtual su/catlean/gi.w ()F
// 48d: lload 16
// 48f: dup2_x1
// 490: pop2
// 491: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 494: aload 38
// 496: lload 8
// 498: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 49b: pop
// 49c: aload 40
// 49e: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 4a1: iload 28
// 4a3: ifne 13a
// 4a6: lload 12
// 4a8: aload 30
// 4aa: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 4ad: invokevirtual su/catlean/b6.B ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 4b0: aconst_null
// 4b1: aconst_null
// 4b2: aload 1
// 4b3: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 4b6: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 4b9: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 4bc: aconst_null
// 4bd: sipush 2238
// 4c0: ldc2_w 3900346484471821755
// 4c3: lload 2
// 4c4: lxor
// 4c5: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ca: lload 4
// 4cc: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4cf: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 4d2: invokestatic su/catlean/n1.o ()Lnet/minecraft/class_2960;
// 4d5: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 4d8: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 4db: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 4de: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 4e1: sipush 12408
// 4e4: ldc2_w 8739909924707323865
// 4e7: lload 2
// 4e8: lxor
// 4e9: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ee: aconst_null
// 4ef: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 4f2: aload 1
// 4f3: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 4f6: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 4f9: return
}

@Flow
private final void j(TickEvent var1) {
A.removeIf(kp::D);
}

@Flow
private final void m(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kp.a J
// 003: ldc2_w 47593621114420
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -1132329731242479037
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: istore 4
// 013: aload 1
// 014: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 017: instanceof net/minecraft/class_2673
// 01a: iload 4
// 01c: ifeq 046
// 01f: ifeq 161
// 022: goto 02f
// 025: ldc2_w -1087724916450116526
// 028: lload 2
// 029: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e: athrow
// 02f: aload 1
// 030: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 033: checkcast net/minecraft/class_2673
// 036: invokevirtual net/minecraft/class_2673.method_11532 ()I
// 039: goto 046
// 03c: ldc2_w -1087724916450116526
// 03f: lload 2
// 040: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: athrow
// 046: iload 4
// 048: ifeq 0b8
// 04b: sipush 16993
// 04e: ldc2_w 6881766232239930240
// 051: lload 2
// 052: lxor
// 053: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: if_icmpeq 0a1
// 05b: goto 068
// 05e: ldc2_w -1087724916450116526
// 061: lload 2
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: aload 1
// 069: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 06c: checkcast net/minecraft/class_2673
// 06f: invokevirtual net/minecraft/class_2673.method_11532 ()I
// 072: iload 4
// 074: ifeq 0b8
// 077: goto 084
// 07a: ldc2_w -1087724916450116526
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: sipush 846
// 087: ldc2_w 7544621928158411438
// 08a: lload 2
// 08b: lxor
// 08c: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: if_icmpne 161
// 094: goto 0a1
// 097: ldc2_w -1087724916450116526
// 09a: lload 2
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: aload 1
// 0a2: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0a5: checkcast net/minecraft/class_2673
// 0a8: invokevirtual net/minecraft/class_2673.method_11534 ()I
// 0ab: goto 0b8
// 0ae: ldc2_w -1087724916450116526
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: istore 5
// 0ba: iload 5
// 0bc: sipush 11583
// 0bf: ldc2_w 4850998509001381077
// 0c2: lload 2
// 0c3: lxor
// 0c4: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: ishr
// 0ca: sipush 25724
// 0cd: ldc2_w 4863345789000113554
// 0d0: lload 2
// 0d1: lxor
// 0d2: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: iand
// 0d8: i2f
// 0d9: ldc 255.0
// 0db: fdiv
// 0dc: fstore 6
// 0de: iload 5
// 0e0: sipush 4035
// 0e3: ldc2_w 7181724671737574958
// 0e6: lload 2
// 0e7: lxor
// 0e8: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: ishr
// 0ee: bipush 120
// 0f0: ldc2_w 120663448924109207
// 0f3: lload 2
// 0f4: lxor
// 0f5: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: iand
// 0fb: i2f
// 0fc: ldc 255.0
// 0fe: fdiv
// 0ff: fstore 7
// 101: iload 5
// 103: bipush 0
// 104: ishr
// 105: bipush 120
// 107: ldc2_w 120663448924109207
// 10a: lload 2
// 10b: lxor
// 10c: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: iand
// 112: i2f
// 113: ldc 255.0
// 115: fdiv
// 116: fstore 8
// 118: new java/awt/Color
// 11b: dup
// 11c: fload 6
// 11e: fload 7
// 120: fload 8
// 122: invokespecial java/awt/Color.<init> (FFF)V
// 125: astore 9
// 127: aload 9
// 129: invokevirtual java/awt/Color.getRGB ()I
// 12c: iload 4
// 12e: ifeq 15e
// 131: sipush 30074
// 134: ldc2_w 4196913941606616223
// 137: lload 2
// 138: lxor
// 139: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: if_icmpne 159
// 141: goto 14e
// 144: ldc2_w -1087724916450116526
// 147: lload 2
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: return
// 14f: ldc2_w -1087724916450116526
// 152: lload 2
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: aload 9
// 15b: invokevirtual java/awt/Color.getRGB ()I
// 15e: putstatic su/catlean/kp.Y I
// 161: return
}

@Flow
private final void P(EntityRemove param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kp.a J
// 03: ldc2_w 62127086857363
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 82241758003424
// 0d: lxor
// 0e: dup2
// 0f: bipush 56
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 8
// 18: lshl
// 19: bipush 8
// 1b: lushr
// 1c: lstore 5
// 1e: pop2
// 1f: dup2
// 20: ldc2_w 124725371767640
// 23: lxor
// 24: lstore 7
// 26: pop2
// 27: ldc2_w -3247592501468622620
// 2a: lload 2
// 2b: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30: istore 9
// 32: aload 1
// 33: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 36: iload 9
// 38: ifeq 70
// 3b: instanceof net/minecraft/class_10691
// 3e: ifeq d2
// 41: goto 4e
// 44: ldc2_w -3296480738920751371
// 47: lload 2
// 48: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d: athrow
// 4e: aload 1
// 4f: invokevirtual su/catlean/api/event/events/world/EntityRemove.getEntity ()Lnet/minecraft/class_1297;
// 52: dup
// 53: sipush 32644
// 56: ldc2_w 3684419553303225957
// 59: lload 2
// 5a: lxor
// 5b: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 63: goto 70
// 66: ldc2_w -3296480738920751371
// 69: lload 2
// 6a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f: athrow
// 70: checkcast net/minecraft/class_10691
// 73: astore 10
// 75: aload 0
// 76: iload 4
// 78: i2b
// 79: lload 5
// 7b: aload 10
// 7d: checkcast net/minecraft/class_1297
// 80: invokevirtual su/catlean/kp.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 83: checkcast net/minecraft/class_2374
// 86: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 89: dup
// 8a: sipush 11279
// 8d: ldc2_w 6726354388218197477
// 90: lload 2
// 91: lxor
// 92: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9a: astore 11
// 9c: getstatic su/catlean/kp.A Ljava/util/List;
// 9f: new su/catlean/w_
// a2: dup
// a3: aload 11
// a5: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// a8: dconst_0
// a9: ldc2_w -0.5
// ac: dconst_0
// ad: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// b0: dup
// b1: sipush 12814
// b4: ldc2_w 7802149851465296866
// b7: lload 2
// b8: lxor
// b9: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// c1: getstatic su/catlean/kp.Y I
// c4: bipush 0
// c5: bipush 4
// c6: aconst_null
// c7: lload 7
// c9: invokespecial su/catlean/w_.<init> (Lnet/minecraft/class_243;IIILkotlin/jvm/internal/DefaultConstructorMarker;J)V
// cc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// d1: pop
// d2: return
}

private static final boolean m(w_ param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kp.a J
// 003: ldc2_w 100982366599264
// 006: lxor
// 007: lstore 1
// 008: lload 1
// 009: dup2
// 00a: ldc2_w 131039734958086
// 00d: lxor
// 00e: lstore 3
// 00f: dup2
// 010: ldc2_w 77552905960056
// 013: lxor
// 014: lstore 5
// 016: dup2
// 017: ldc2_w 127501667706119
// 01a: lxor
// 01b: dup2
// 01c: bipush 48
// 01e: lushr
// 01f: l2i
// 020: istore 7
// 022: dup2
// 023: bipush 16
// 025: lshl
// 026: bipush 32
// 028: lushr
// 029: l2i
// 02a: istore 8
// 02c: dup2
// 02d: bipush 48
// 02f: lshl
// 030: bipush 48
// 032: lushr
// 033: l2i
// 034: istore 9
// 036: pop2
// 037: pop2
// 038: ldc2_w 5052291686615090199
// 03b: lload 1
// 03c: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: aload 0
// 042: sipush 15929
// 045: ldc2_w 7530183841265267496
// 048: lload 1
// 049: lxor
// 04a: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 052: istore 10
// 054: aload 0
// 055: invokevirtual su/catlean/w_.J ()I
// 058: iload 10
// 05a: ifeq 1e0
// 05d: bipush 3
// 05e: if_icmpne 1dc
// 061: goto 06e
// 064: ldc2_w 5094678855442074118
// 067: lload 1
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: sipush 2792
// 071: ldc2_w 8179692628637484376
// 074: lload 1
// 075: lxor
// 076: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: istore 11
// 07d: bipush 0
// 07e: istore 12
// 080: iload 12
// 082: iload 11
// 084: if_icmpge 13d
// 087: iload 12
// 089: istore 13
// 08b: bipush 0
// 08c: istore 14
// 08e: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 091: new su/catlean/bk
// 094: dup
// 095: getstatic su/catlean/gi.FIREFLY Lsu/catlean/gi;
// 098: aload 0
// 099: invokevirtual su/catlean/w_.R ()Lnet/minecraft/class_243;
// 09c: lload 3
// 09d: ldc2_w -3.0
// 0a0: ldc2_w 3.0
// 0a3: bipush 0
// 0a4: bipush 4
// 0a5: aconst_null
// 0a6: invokestatic su/catlean/mf.a (JDDZILjava/lang/Object;)D
// 0a9: dconst_0
// 0aa: lload 3
// 0ab: ldc2_w -3.0
// 0ae: ldc2_w 3.0
// 0b1: bipush 0
// 0b2: bipush 4
// 0b3: aconst_null
// 0b4: invokestatic su/catlean/mf.a (JDDZILjava/lang/Object;)D
// 0b7: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 0ba: dup
// 0bb: sipush 18652
// 0be: ldc2_w 5325465194643441103
// 0c1: lload 1
// 0c2: lxor
// 0c3: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0cb: fconst_0
// 0cc: lload 5
// 0ce: ldc 0.25
// 0d0: sipush 22755
// 0d3: ldc2_w 5973666219128674133
// 0d6: lload 1
// 0d7: lxor
// 0d8: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: new net/minecraft/class_243
// 0e0: dup
// 0e1: invokestatic java/lang/Math.random ()D
// 0e4: fconst_2
// 0e5: f2d
// 0e6: ddiv
// 0e7: ldc 0.25
// 0e9: f2d
// 0ea: dsub
// 0eb: invokestatic java/lang/Math.random ()D
// 0ee: ldc 4.0
// 0f0: f2d
// 0f1: ddiv
// 0f2: invokestatic java/lang/Math.random ()D
// 0f5: fconst_2
// 0f6: f2d
// 0f7: ddiv
// 0f8: ldc 0.25
// 0fa: f2d
// 0fb: dsub
// 0fc: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0ff: new java/awt/Color
// 102: dup
// 103: aload 0
// 104: invokevirtual su/catlean/w_.m ()I
// 107: invokespecial java/awt/Color.<init> (I)V
// 10a: fconst_0
// 10b: fconst_0
// 10c: bipush 0
// 10d: sipush 22955
// 110: ldc2_w 3496378699357017620
// 113: lload 1
// 114: lxor
// 115: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: aconst_null
// 11b: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 11e: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 121: pop
// 122: nop
// 123: iinc 12 1
// 126: iload 10
// 128: ifeq 140
// 12b: iload 10
// 12d: ifne 080
// 130: goto 13d
// 133: ldc2_w 5094678855442074118
// 136: lload 1
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: bipush 5
// 13e: istore 11
// 140: bipush 0
// 141: istore 12
// 143: iload 12
// 145: iload 11
// 147: if_icmpge 1dc
// 14a: iload 12
// 14c: istore 13
// 14e: bipush 0
// 14f: istore 14
// 151: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 154: new su/catlean/bk
// 157: dup
// 158: getstatic su/catlean/gi.FIREFLY Lsu/catlean/gi;
// 15b: aload 0
// 15c: invokevirtual su/catlean/w_.R ()Lnet/minecraft/class_243;
// 15f: dconst_0
// 160: ldc2_w -0.3
// 163: dconst_0
// 164: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 167: dup
// 168: sipush 18652
// 16b: ldc2_w 5325465194643441103
// 16e: lload 1
// 16f: lxor
// 170: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/kp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 178: fconst_0
// 179: lload 5
// 17b: ldc 6.0
// 17d: bipush 4
// 17e: new net/minecraft/class_243
// 181: dup
// 182: dconst_0
// 183: iload 13
// 185: i2d
// 186: ldc2_w 0.15
// 189: dmul
// 18a: dconst_0
// 18b: invokespecial net/minecraft/class_243.<init> (DDD)V
// 18e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 191: new java/awt/Color
// 194: dup
// 195: aload 0
// 196: invokevirtual su/catlean/w_.m ()I
// 199: invokespecial java/awt/Color.<init> (I)V
// 19c: iload 7
// 19e: i2c
// 19f: iload 8
// 1a1: ldc 0.5
// 1a3: iload 9
// 1a5: i2s
// 1a6: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1a9: fconst_0
// 1aa: fconst_0
// 1ab: bipush 0
// 1ac: sipush 8057
// 1af: ldc2_w 3571367794945069262
// 1b2: lload 1
// 1b3: lxor
// 1b4: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: aconst_null
// 1ba: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1bd: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 1c0: pop
// 1c1: nop
// 1c2: iinc 12 1
// 1c5: iload 10
// 1c7: ifeq 1ea
// 1ca: iload 10
// 1cc: ifne 143
// 1cf: goto 1dc
// 1d2: ldc2_w 5094678855442074118
// 1d5: lload 1
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: aload 0
// 1dd: invokevirtual su/catlean/w_.J ()I
// 1e0: istore 11
// 1e2: aload 0
// 1e3: iload 11
// 1e5: bipush 1
// 1e6: iadd
// 1e7: invokevirtual su/catlean/w_.a (I)V
// 1ea: iload 11
// 1ec: iload 10
// 1ee: ifeq 21c
// 1f1: sipush 3540
// 1f4: ldc2_w 952599462844007014
// 1f7: lload 1
// 1f8: lxor
// 1f9: invokedynamic y (IJ)I bsm=su/catlean/kp.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: if_icmple 21f
// 201: goto 20e
// 204: ldc2_w 5094678855442074118
// 207: lload 1
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: bipush 1
// 20f: goto 21c
// 212: ldc2_w 5094678855442074118
// 215: lload 1
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: goto 220
// 21f: bipush 0
// 220: ireturn
}

private static final boolean D(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 2705839345856L;
long var22 = var20 ^ 44346842376577L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[12];
int var16 = 0;
String var15 = "~Þ\u009dµ\u0080¹\u0002»ñk§£«¯\u008buE®*îí®\u00adV&óN¦ÀÅC\u001dduM_ZÝ\u001fï jYÄ\u0085RTä0\u0098[ñXìõs\"¢~:»«\"ì\u001ad-buû}Bï(\u0087\u0088/80/|}\u0003n£Cé\u000fV@\u0090\u001eÏ^¦ñåáPx\u0014ü\u009eÌMèY\u0005j4\u0018ûÀs Û`SlÑ\u0099=\u001e%²\u0092Á\u0089\u0082Ú)8bGU-ïÒó N1ÒÞ(mU â\bÁÐý\u000eI\u001a¾Q\u009d\rWÝ\u0095~\u000f£WÒþÙ±Æ)ÉÇ\u0098aTSV\u0018\u0002¯ý «\nnÚÖ,1âúl½¦CQm\u0088\u009f\u0015ÞÊ(¾5¡\u0004\u00adó\u008bRwÉ\u0013\u0085ð´|U8\u0086¥pÙn»Ñ:T\u0018ò\u008aJ' \u0005¤^Õ\u0086ýT<\u0018,o¼\u0002\u0090\u00811\bQ<¸\u0006 ¾b\u0001ÛÉÎ\"u\u0018R\u008a(ÎÎ¼ì»\rÊ\u0094¿\u0094©kV\u009e\u0093¥ÇËrä\u008b\u009añ\u0010\u0002³n{\u0086\u009dðÈWÈ® \u0084¸ª\u008b\u0010KÐ\u0016-\u0086Â9\u0094é\tña©\u001a;÷";
int var17 = "~Þ\u009dµ\u0080¹\u0002»ñk§£«¯\u008buE®*îí®\u00adV&óN¦ÀÅC\u001dduM_ZÝ\u001fï jYÄ\u0085RTä0\u0098[ñXìõs\"¢~:»«\"ì\u001ad-buû}Bï(\u0087\u0088/80/|}\u0003n£Cé\u000fV@\u0090\u001eÏ^¦ñåáPx\u0014ü\u009eÌMèY\u0005j4\u0018ûÀs Û`SlÑ\u0099=\u001e%²\u0092Á\u0089\u0082Ú)8bGU-ïÒó N1ÒÞ(mU â\bÁÐý\u000eI\u001a¾Q\u009d\rWÝ\u0095~\u000f£WÒþÙ±Æ)ÉÇ\u0098aTSV\u0018\u0002¯ý «\nnÚÖ,1âúl½¦CQm\u0088\u009f\u0015ÞÊ(¾5¡\u0004\u00adó\u008bRwÉ\u0013\u0085ð´|U8\u0086¥pÙn»Ñ:T\u0018ò\u008aJ' \u0005¤^Õ\u0086ýT<\u0018,o¼\u0002\u0090\u00811\bQ<¸\u0006 ¾b\u0001ÛÉÎ\"u\u0018R\u008a(ÎÎ¼ì»\rÊ\u0094¿\u0094©kV\u009e\u0093¥ÇËrä\u008b\u009añ\u0010\u0002³n{\u0086\u009dðÈWÈ® \u0084¸ª\u008b\u0010KÐ\u0016-\u0086Â9\u0094é\tña©\u001a;÷"
.length();
char var14 = '(';
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
c = new String[12];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[14];
int var3 = 0;
String var4 = "\u0003nÎßÒ\u0088\u0093\u0090\u0087\u0087Á±bjÄº-\u0005BúBA¡ãp.-å\u0011\u0018AÛjé\râà¼w\\8í\u0001ËýQl\u0087\u000fZî&\u008cH:O\u000e@¥mARÆËBÜ\u00ad4Ç\u0007ÑØ`^\u0005Ýÿ\u009dk\u009fI2¼Ìåh\u009d«!·ËS/(\u0003K";
int var5 = "\u0003nÎßÒ\u0088\u0093\u0090\u0087\u0087Á±bjÄº-\u0005BúBA¡ãp.-å\u0011\u0018AÛjé\râà¼w\\8í\u0001ËýQl\u0087\u000fZî&\u008cH:O\u000e@¥mARÆËBÜ\u00ad4Ç\u0007ÑØ`^\u0005Ýÿ\u009dk\u009fI2¼Ìåh\u009d«!·ËS/(\u0003K"
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
e = var6;
f = new Integer[14];
G = new kp(var22);
A = new ArrayList();
Y = -1;
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "\u0089Ïü\u0014<[Çd\u001e\u0090Ù¸\u0015Æ\u009b¬";
var5 = "\u0089Ïü\u0014<[Çd\u001e\u0090Ù¸\u0015Æ\u009b¬".length();
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

var15 = "bpÙ!0\u001b\u009a\u001aÏ?\r@Ë·\u001eüc\u0092ecë®\u0084±} ìÔ\f0Pa\u0084þÿ\u0015¼¾4:\u0088}\r\u0080×\u0092nà6\u0013³L(mUaz)û\u0001ð\u009cIE\u000e>2ÿzêìê¦å¦[ÅÑ£nI}oÜ\f\u001bÕ®ÄôNâõÌì2è\u0016j\u0010{«÷ÐTÁ©Û\u0004UÙ\u001f\u0094\tût\u0084ç\n\u001c\u0092û\\ì lqâõ0\u0080,\u0013@m\u0011-T4Jq6R\u0010Ø\u0095k\u0094¹qìäÅÞ¼47n§#\u0097É2él5¼\u0018\u0007¸\u0081N\u008cy\u008b9\u000bXÓ\u000bø¹øV ÔSÝ«Ýn{\u0097\u009d·%\u0096\u0010\u0096f8C{$û¼æwþ\u0097¥nÛ^t´\u0084";
var17 = "bpÙ!0\u001b\u009a\u001aÏ?\r@Ë·\u001eüc\u0092ecë®\u0084±} ìÔ\f0Pa\u0084þÿ\u0015¼¾4:\u0088}\r\u0080×\u0092nà6\u0013³L(mUaz)û\u0001ð\u009cIE\u000e>2ÿzêìê¦å¦[ÅÑ£nI}oÜ\f\u001bÕ®ÄôNâõÌì2è\u0016j\u0010{«÷ÐTÁ©Û\u0004UÙ\u001f\u0094\tût\u0084ç\n\u001c\u0092û\\ì lqâõ0\u0080,\u0013@m\u0011-T4Jq6R\u0010Ø\u0095k\u0094¹qìäÅÞ¼47n§#\u0097É2él5¼\u0018\u0007¸\u0081N\u008cy\u008b9\u000bXÓ\u000bø¹øV ÔSÝ«Ýn{\u0097\u009d·%\u0096\u0010\u0096f8C{$û¼æwþ\u0097¥nÛ^t´\u0084"
.length();
var14 = 184;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19045;
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
throw new RuntimeException("su/catlean/kp", var10);
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
throw new RuntimeException("su/catlean/kp" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18638;
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
throw new RuntimeException("su/catlean/kp", var14);
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
throw new RuntimeException("su/catlean/kp" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
