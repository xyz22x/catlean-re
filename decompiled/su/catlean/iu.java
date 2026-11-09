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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

public final class iu {
@NotNull
public static final iu W;
@NotNull
private static final bj a;
private static final long b = yz.a(6819336676105349059L, -3568924390718009616L, MethodHandles.lookup().lookupClass()).a(97183731294217L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private iu() {
}

@NotNull
public final List p(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 24402265897689L;
return yl.g.f().M(var3).Q();
}

@Flow
private final void P(Render2DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/iu.b J
// 003: ldc2_w 29422717842063
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 39607326811391
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 67420923624553
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 55779533282853
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 116373988348845
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 17116927748117
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 35313350527833
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 20950120895941
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 110795860228128
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 34274742384962
// 045: lxor
// 046: lstore 20
// 048: dup2
// 049: ldc2_w 5086400162521
// 04c: lxor
// 04d: lstore 22
// 04f: pop2
// 050: ldc2_w -569404973952883607
// 053: lload 2
// 054: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 059: aload 0
// 05a: lload 12
// 05c: invokevirtual su/catlean/iu.p (J)Ljava/util/List;
// 05f: checkcast java/lang/Iterable
// 062: astore 25
// 064: astore 24
// 066: bipush 0
// 067: istore 26
// 069: aload 25
// 06b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 070: astore 27
// 072: aload 27
// 074: invokeinterface java/util/Iterator.hasNext ()Z 1
// 079: ifeq 1d4
// 07c: aload 27
// 07e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 083: astore 28
// 085: aload 28
// 087: checkcast su/catlean/s4
// 08a: astore 29
// 08c: bipush 0
// 08d: istore 30
// 08f: aload 24
// 091: ifnull 1d5
// 094: aload 24
// 096: ifnull 1cf
// 099: goto 0a6
// 09c: ldc2_w -531516266612671342
// 09f: lload 2
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: getstatic su/catlean/iu.W Lsu/catlean/iu;
// 0a9: aload 29
// 0ab: lload 8
// 0ad: invokespecial su/catlean/iu.J (Lsu/catlean/s4;J)Z
// 0b0: ifeq 1cd
// 0b3: goto 0c0
// 0b6: ldc2_w -531516266612671342
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: new net/minecraft/class_243
// 0c3: dup
// 0c4: aload 29
// 0c6: invokevirtual su/catlean/s4.I ()I
// 0c9: i2d
// 0ca: aload 29
// 0cc: invokevirtual su/catlean/s4.r ()I
// 0cf: i2d
// 0d0: aload 29
// 0d2: invokevirtual su/catlean/s4.u ()I
// 0d5: i2d
// 0d6: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0d9: astore 31
// 0db: aload 24
// 0dd: ifnull 1cf
// 0e0: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0e3: lload 16
// 0e5: aload 31
// 0e7: lload 4
// 0e9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0ec: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0ef: invokevirtual net/minecraft/class_315.method_41808 ()Lnet/minecraft/class_7172;
// 0f2: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
// 0f5: dup
// 0f6: sipush 4837
// 0f9: ldc2_w 6034066721899821057
// 0fc: lload 2
// 0fd: lxor
// 0fe: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/iu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 106: checkcast java/lang/Number
// 109: invokevirtual java/lang/Number.intValue ()I
// 10c: invokevirtual su/catlean/dm.v (JLnet/minecraft/class_243;I)Z
// 10f: ifeq 1cd
// 112: goto 11f
// 115: ldc2_w -531516266612671342
// 118: lload 2
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 122: aload 31
// 124: lload 14
// 126: invokevirtual su/catlean/jl.i (Lnet/minecraft/class_243;J)Lnet/minecraft/class_243;
// 129: astore 32
// 12b: lload 10
// 12d: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 130: aload 1
// 131: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 134: aload 29
// 136: invokevirtual su/catlean/s4.e ()Ljava/lang/String;
// 139: lload 22
// 13b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13e: lload 6
// 140: dup2_x1
// 141: pop2
// 142: checkcast net/minecraft/class_1297
// 145: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 148: aload 31
// 14a: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 14d: d2i
// 14e: sipush 25362
// 151: ldc2_w 3468159064694704628
// 154: lload 2
// 155: lxor
// 156: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/iu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: swap
// 15c: sipush 9282
// 15f: ldc2_w 373275385309531821
// 162: lload 2
// 163: lxor
// 164: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/iu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
// 16e: aload 32
// 170: getfield net/minecraft/class_243.field_1352 D
// 173: d2f
// 174: aload 32
// 176: getfield net/minecraft/class_243.field_1351 D
// 179: d2f
// 17a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 17d: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 180: lload 18
// 182: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 185: getstatic su/catlean/iu.a Lsu/catlean/bj;
// 188: aload 1
// 189: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 18c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 18f: dup
// 190: sipush 15603
// 193: ldc2_w 3108662095256622618
// 196: lload 2
// 197: lxor
// 198: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/iu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1a0: checkcast org/joml/Matrix3x2f
// 1a3: aload 32
// 1a5: getfield net/minecraft/class_243.field_1352 D
// 1a8: ldc2_w 10.0
// 1ab: dsub
// 1ac: aload 32
// 1ae: getfield net/minecraft/class_243.field_1351 D
// 1b1: ldc2_w 25.0
// 1b4: dsub
// 1b5: fconst_0
// 1b6: fconst_0
// 1b7: aconst_null
// 1b8: aconst_null
// 1b9: fconst_0
// 1ba: sipush 13132
// 1bd: ldc2_w 493474110809926481
// 1c0: lload 2
// 1c1: lxor
// 1c2: invokedynamic x (IJ)I bsm=su/catlean/iu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: lload 20
// 1c9: aconst_null
// 1ca: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 1cd: nop
// 1ce: nop
// 1cf: aload 24
// 1d1: ifnonnull 072
// 1d4: nop
// 1d5: return
}

private final boolean J(s4 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/iu.b J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 58996321530339
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 25403143127394
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 36879534339019
// 019: lxor
// 01a: lstore 8
// 01c: pop2
// 01d: ldc2_w 7855685797186253173
// 020: lload 2
// 021: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: astore 10
// 028: aload 1
// 029: invokevirtual su/catlean/s4.g ()Z
// 02c: aload 10
// 02e: ifnull 062
// 031: ifeq 164
// 034: goto 041
// 037: ldc2_w 7891359228107499918
// 03a: lload 2
// 03b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: athrow
// 041: aload 1
// 042: invokevirtual su/catlean/s4.h ()Ljava/lang/String;
// 045: sipush 5898
// 048: ldc2_w 655489787562764539
// 04b: lload 2
// 04c: lxor
// 04d: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/iu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 055: goto 062
// 058: ldc2_w 7891359228107499918
// 05b: lload 2
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: aload 10
// 064: ifnull 119
// 067: ifne 108
// 06a: goto 077
// 06d: ldc2_w 7891359228107499918
// 070: lload 2
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: aload 1
// 078: invokevirtual su/catlean/s4.h ()Ljava/lang/String;
// 07b: aload 10
// 07d: ifnull 0e9
// 080: goto 08d
// 083: ldc2_w 7891359228107499918
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: lload 2
// 08e: lconst_0
// 08f: lcmp
// 090: iflt 0dc
// 093: lload 4
// 095: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 098: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// 09b: dup
// 09c: ifnull 0db
// 09f: goto 0ac
// 0a2: ldc2_w 7891359228107499918
// 0a5: lload 2
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 0af: dup
// 0b0: ifnull 0db
// 0b3: goto 0c0
// 0b6: ldc2_w 7891359228107499918
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 0c3: lload 2
// 0c4: lconst_0
// 0c5: lcmp
// 0c6: iflt 0ea
// 0c9: aload 10
// 0cb: ifnonnull 0ea
// 0ce: goto 0db
// 0d1: ldc2_w 7891359228107499918
// 0d4: lload 2
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: pop
// 0dc: goto 0e9
// 0df: ldc2_w 7891359228107499918
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: aconst_null
// 0ea: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ed: aload 10
// 0ef: lload 2
// 0f0: lconst_0
// 0f1: lcmp
// 0f2: ifle 11b
// 0f5: ifnull 119
// 0f8: ifeq 164
// 0fb: goto 108
// 0fe: ldc2_w 7891359228107499918
// 101: lload 2
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: aload 1
// 109: invokevirtual su/catlean/s4.W ()I
// 10c: goto 119
// 10f: ldc2_w 7891359228107499918
// 112: lload 2
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: aload 10
// 11b: ifnull 161
// 11e: aload 0
// 11f: lload 6
// 121: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 124: invokevirtual net/minecraft/class_638.method_27983 ()Lnet/minecraft/class_5321;
// 127: invokevirtual net/minecraft/class_5321.method_29177 ()Lnet/minecraft/class_2960;
// 12a: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
// 12d: dup
// 12e: sipush 27640
// 131: ldc2_w 748799481948427274
// 134: lload 2
// 135: lxor
// 136: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/iu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 13e: lload 8
// 140: invokevirtual su/catlean/iu.K (Ljava/lang/String;J)I
// 143: if_icmpne 164
// 146: goto 153
// 149: ldc2_w 7891359228107499918
// 14c: lload 2
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: bipush 1
// 154: goto 161
// 157: ldc2_w 7891359228107499918
// 15a: lload 2
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: goto 165
// 164: bipush 0
// 165: ireturn
}

public final boolean W(char a, @NotNull s4 wayPoint, int a, short a) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ b;
long var7 = var5 ^ 31119938159400L;
Intrinsics.checkNotNullParameter(wayPoint, a<"s">(29247, 1465035517071471598L ^ var5));
return this.p(var7).remove(wayPoint);
}

public final boolean D(int a, char a, @NotNull s4 wayPoint, short a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ b;
long var7 = var5 ^ 102899337669858L;
Intrinsics.checkNotNullParameter(wayPoint, a<"s">(23695, 1316043373159854739L ^ var5));
return this.p(var7).add(wayPoint);
}

public final int K(@NotNull String i, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/iu.b J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -7640636039845000825
// 09: lload 2
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 1
// 10: ldc "i"
// 12: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 15: aload 1
// 16: astore 5
// 18: astore 4
// 1a: aload 5
// 1c: sipush 8079
// 1f: ldc2_w 1828933442170771593
// 22: lload 2
// 23: lxor
// 24: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/iu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2c: aload 4
// 2e: ifnull 61
// 31: ifeq 4f
// 34: goto 41
// 37: ldc2_w -7678144834846404228
// 3a: lload 2
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: bipush 0
// 42: goto 7b
// 45: ldc2_w -7678144834846404228
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: aload 5
// 51: sipush 2409
// 54: ldc2_w 7782478344785088109
// 57: lload 2
// 58: lxor
// 59: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/iu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 61: aload 4
// 63: ifnull 77
// 66: ifeq 7a
// 69: goto 76
// 6c: ldc2_w -7678144834846404228
// 6f: lload 2
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: bipush 1
// 77: goto 7b
// 7a: bipush 2
// 7b: ireturn
}

static {
long var20 = b ^ 19796028894514L;
long var22 = var20 ^ 24999155071176L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[11];
int var16 = 0;
String var15 = "½\u009bÜ»~èM×LIµ\u0004¼\u0086§Ãy¦7c\u008f3+'\u0018Eð¡0ù»0§\u000e©,#\u00110YY;Oh@xe?ì é-\u0083\u001ckÐ+WÀ±ìqª\u0016z°W\u0003Ê\u0097Î\u0016A\u001d]è\u0018êo\fBã\u0010JÆ`uÏb\u0001.\u0098P\u0002\u0000Jí\u001c\u0090 q»\u0084Ûh³àFßä(?¿;\u009c:S0´ç}Üïcåå¿hÊÃ\u0014¶\u0018\u0084_°\u0003hÒ\u0005¥d·ÎÊÖ\u0099ÐLS5\u0093qßÆÓ¯\u0018\u008d\u0007ùÿ¾Ì¼É¶i\u0081\u0000?Ô\u000f§úD\u0090(Z\u0003\u0080Î G\u0097\f\u009a§R\u009b¹\u0018Cìì\u00888Ít\u0004Ð1\u000e\u001ft\u008cW?\u0083GÃË\u008c>\u008d \u0000\u008b(\u0014iÆ:\u009a¢\u0013²ÇÑ\b\u0004À\nUl§\u0097òç:b\u0082\u009elq\u0083Î\u0011";
int var17 = "½\u009bÜ»~èM×LIµ\u0004¼\u0086§Ãy¦7c\u008f3+'\u0018Eð¡0ù»0§\u000e©,#\u00110YY;Oh@xe?ì é-\u0083\u001ckÐ+WÀ±ìqª\u0016z°W\u0003Ê\u0097Î\u0016A\u001d]è\u0018êo\fBã\u0010JÆ`uÏb\u0001.\u0098P\u0002\u0000Jí\u001c\u0090 q»\u0084Ûh³àFßä(?¿;\u009c:S0´ç}Üïcåå¿hÊÃ\u0014¶\u0018\u0084_°\u0003hÒ\u0005¥d·ÎÊÖ\u0099ÐLS5\u0093qßÆÓ¯\u0018\u008d\u0007ùÿ¾Ì¼É¶i\u0081\u0000?Ô\u000f§úD\u0090(Z\u0003\u0080Î G\u0097\f\u009a§R\u009b¹\u0018Cìì\u00888Ít\u0004Ð1\u000e\u001ft\u008cW?\u0083GÃË\u008c>\u008d \u0000\u008b(\u0014iÆ:\u009a¢\u0013²ÇÑ\b\u0004À\nUl§\u0097òç:b\u0082\u009elq\u0083Î\u0011"
.length();
char var14 = 24;
int var25 = -1;

label45:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var35 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var35;
if ((var25 += var14) >= var17) {
c = var18;
d = new String[11];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "@\u0081_W! \u0081\u0018ªr\n;q©ø\u009bÕÅ\u008dw\u0004£\u0000x";
int var5 = "@\u0081_W! \u0081\u0018ªr\n;q©ø\u009bÕÅ\u008dw\u0004£\u0000x".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var40 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

f = var6;
g = new Integer[3];
W = new iu();
a = new bj(a<"s">(29699, 8581856410095698267L ^ var20), b<"x">(11207, 949289408555183206L ^ var20), b<"x">(28696, 2071298003462633403L ^ var20), var22);
return;
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var35;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label45;
}

var15 = "\u0013Jª®©\u0085ôQ¶\u000et®é\u000e\u001b_\u0010\u0016J\u0017Ù\u0095Ý¨Ñ\u0011\u0084Ä\nÍ\u0092cS";
var17 = "\u0013Jª®©\u0085ôQ¶\u000et®é\u000e\u001b_\u0010\u0016J\u0017Ù\u0095Ý¨Ñ\u0011\u0084Ä\nÍ\u0092cS".length();
var14 = 16;
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21338;
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
throw new RuntimeException("su/catlean/iu", var10);
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
throw new RuntimeException("su/catlean/iu" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 8618;
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
throw new RuntimeException("su/catlean/iu", var14);
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
throw new RuntimeException("su/catlean/iu" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
