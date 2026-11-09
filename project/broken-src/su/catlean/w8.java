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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.CrosshairRenderEvent;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.ScreenMouseCoordsEvent;
import su.catlean.gofra.Flow;

public final class w8 implements ym {
@NotNull
public static final w8 T;
@NotNull
private static List k;
@NotNull
private static final ab W;
@NotNull
private static List A;
@NotNull
private static List c;
@Nullable
private static gf z;
@Nullable
private static gf N;
private static float U;
private static float s;
public static final float u = 5.0F;
private static int i;
private static final long a = yz.a(2968210992011873301L, 703918193530156074L, MethodHandles.lookup().lookupClass()).a(213037719741682L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private w8() {
}

@NotNull
public final List C() {
return k;
}

public final void u(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"a">(22839, 3616156181020518593L ^ ax));
k = <set-?>;
}

@NotNull
public final ab c() {
return W;
}

@NotNull
public final List B() {
return A;
}

public final void t(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"a">(25006, 8205698193564135985L ^ ax));
A = <set-?>;
}

@NotNull
public final List X() {
return c;
}

public final void k(long a, @NotNull List <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"a">(25006, 8205616301706672973L ^ ax));
c = <set-?>;
}

@Nullable
public final gf q() {
return z;
}

public final void R(@Nullable gf <set-?>) {
z = <set-?>;
}

@Nullable
public final gf a() {
return N;
}

public final void w(@Nullable gf <set-?>) {
N = <set-?>;
}

public final float H() {
return U;
}

public final void V(float <set-?>) {
U = <set-?>;
}

public final float u() {
return s;
}

public final void m(float <set-?>) {
s = <set-?>;
}

@Flow
private final void p(ScreenMouseCoordsEvent var1) {
U = var1.getX();
s = var1.getY();
}

@Flow
private final void n(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/w8.a J
// 03: ldc2_w 57469884423856
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 48133219538008
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 13173222554461
// 14: lxor
// 15: dup2
// 16: bipush 48
// 18: lushr
// 19: l2i
// 1a: istore 6
// 1c: dup2
// 1d: bipush 16
// 1f: lshl
// 20: bipush 48
// 22: lushr
// 23: l2i
// 24: istore 7
// 26: dup2
// 27: bipush 32
// 29: lshl
// 2a: bipush 32
// 2c: lushr
// 2d: l2i
// 2e: istore 8
// 30: pop2
// 31: pop2
// 32: getstatic su/catlean/w8.k Ljava/util/List;
// 35: checkcast java/lang/Iterable
// 38: astore 10
// 3a: ldc2_w -8074612982084901174
// 3d: lload 2
// 3e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43: bipush 0
// 44: istore 11
// 46: astore 9
// 48: aload 10
// 4a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 4f: astore 12
// 51: aload 12
// 53: invokeinterface java/util/Iterator.hasNext ()Z 1
// 58: ifeq bd
// 5b: aload 12
// 5d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 62: astore 13
// 64: aload 13
// 66: checkcast su/catlean/gf
// 69: astore 14
// 6b: bipush 0
// 6c: istore 15
// 6e: aload 9
// 70: ifnull be
// 73: aload 9
// 75: ifnull b8
// 78: goto 85
// 7b: ldc2_w -8100864052459602528
// 7e: lload 2
// 7f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: athrow
// 85: aload 14
// 87: iload 6
// 89: i2s
// 8a: iload 7
// 8c: i2c
// 8d: iload 8
// 8f: invokevirtual su/catlean/gf.U (SCI)Z
// 92: ifeq b6
// 95: goto a2
// 98: ldc2_w -8100864052459602528
// 9b: lload 2
// 9c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1: athrow
// a2: aload 14
// a4: lload 4
// a6: invokevirtual su/catlean/gf.w (J)V
// a9: goto b6
// ac: ldc2_w -8100864052459602528
// af: lload 2
// b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b5: athrow
// b6: nop
// b7: nop
// b8: aload 9
// ba: ifnonnull 51
// bd: nop
// be: return
}

@Flow(
priority = -20
)
private final void A(Render2DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/w8.a J
// 003: ldc2_w 68000014849732
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 101463516520530
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 137939387974757
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 37092240998486
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 48350973775880
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 36098811175529
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 61972631542636
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 2644054717225
// 051: lxor
// 052: dup2
// 053: bipush 48
// 055: lushr
// 056: l2i
// 057: istore 17
// 059: dup2
// 05a: bipush 16
// 05c: lshl
// 05d: bipush 48
// 05f: lushr
// 060: l2i
// 061: istore 18
// 063: dup2
// 064: bipush 32
// 066: lshl
// 067: bipush 32
// 069: lushr
// 06a: l2i
// 06b: istore 19
// 06d: pop2
// 06e: dup2
// 06f: ldc2_w 61788979356709
// 072: lxor
// 073: dup2
// 074: bipush 48
// 076: lushr
// 077: l2i
// 078: istore 20
// 07a: dup2
// 07b: bipush 16
// 07d: lshl
// 07e: bipush 32
// 080: lushr
// 081: l2i
// 082: istore 21
// 084: dup2
// 085: bipush 48
// 087: lshl
// 088: bipush 48
// 08a: lushr
// 08b: l2i
// 08c: istore 22
// 08e: pop2
// 08f: dup2
// 090: ldc2_w 120321799028260
// 093: lxor
// 094: dup2
// 095: bipush 32
// 097: lushr
// 098: l2i
// 099: istore 23
// 09b: dup2
// 09c: bipush 32
// 09e: lshl
// 09f: bipush 32
// 0a1: lushr
// 0a2: l2i
// 0a3: istore 24
// 0a5: pop2
// 0a6: dup2
// 0a7: ldc2_w 58773674615927
// 0aa: lxor
// 0ab: lstore 25
// 0ad: pop2
// 0ae: ldc2_w -8681462498523386178
// 0b1: lload 2
// 0b2: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: aconst_null
// 0b8: putstatic su/catlean/w8.N Lsu/catlean/gf;
// 0bb: astore 32
// 0bd: getstatic su/catlean/w8.k Ljava/util/List;
// 0c0: checkcast java/lang/Iterable
// 0c3: astore 33
// 0c5: bipush 0
// 0c6: istore 34
// 0c8: aload 33
// 0ca: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0cf: astore 35
// 0d1: aload 35
// 0d3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0d8: ifeq 143
// 0db: aload 35
// 0dd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0e2: astore 36
// 0e4: aload 36
// 0e6: checkcast su/catlean/gf
// 0e9: astore 37
// 0eb: bipush 0
// 0ec: istore 38
// 0ee: aload 32
// 0f0: ifnull 13e
// 0f3: aload 37
// 0f5: iload 17
// 0f7: i2s
// 0f8: iload 18
// 0fa: i2c
// 0fb: iload 19
// 0fd: invokevirtual su/catlean/gf.U (SCI)Z
// 100: aload 32
// 102: ifnull 1cd
// 105: goto 112
// 108: ldc2_w -8653672678695569964
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: ifeq 13c
// 115: goto 122
// 118: ldc2_w -8653672678695569964
// 11b: lload 2
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: aload 37
// 124: aload 1
// 125: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 128: lload 25
// 12a: dup2_x1
// 12b: pop2
// 12c: invokevirtual su/catlean/gf.O (JLnet/minecraft/class_332;)V
// 12f: goto 13c
// 132: ldc2_w -8653672678695569964
// 135: lload 2
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: nop
// 13d: nop
// 13e: aload 32
// 140: ifnonnull 0d1
// 143: nop
// 144: getstatic su/catlean/w8.W Lsu/catlean/ab;
// 147: aload 1
// 148: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 14b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 14e: dup
// 14f: sipush 29101
// 152: ldc2_w 5426883206282759665
// 155: lload 2
// 156: lxor
// 157: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/w8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 162: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 165: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 168: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 16b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 16e: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 171: lload 4
// 173: dup2_x1
// 174: pop2
// 175: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 178: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 17b: invokevirtual su/catlean/jl.t ()F
// 17e: fmul
// 17f: iload 20
// 181: i2c
// 182: swap
// 183: iload 21
// 185: swap
// 186: iload 22
// 188: i2s
// 189: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 18c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 18f: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 192: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 195: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 198: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 19b: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 19e: lload 4
// 1a0: dup2_x1
// 1a1: pop2
// 1a2: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 1a5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1a8: invokevirtual su/catlean/jl.t ()F
// 1ab: fmul
// 1ac: iload 20
// 1ae: i2c
// 1af: swap
// 1b0: iload 21
// 1b2: swap
// 1b3: iload 22
// 1b5: i2s
// 1b6: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1b9: iload 23
// 1bb: swap
// 1bc: iload 24
// 1be: bipush 0
// 1bf: invokevirtual su/catlean/ab.w (Lorg/joml/Matrix3x2fStack;Ljava/awt/Color;ILjava/awt/Color;IZ)V
// 1c2: getstatic su/catlean/w8.A Ljava/util/List;
// 1c5: checkcast java/util/Collection
// 1c8: invokeinterface java/util/Collection.isEmpty ()Z 1
// 1cd: aload 32
// 1cf: ifnull 1e3
// 1d2: ifne 1e6
// 1d5: goto 1e2
// 1d8: ldc2_w -8653672678695569964
// 1db: lload 2
// 1dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: athrow
// 1e2: bipush 1
// 1e3: goto 1e7
// 1e6: bipush 0
// 1e7: ifeq 286
// 1ea: new su/catlean/g7
// 1ed: dup
// 1ee: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 1f1: dup
// 1f2: sipush 29826
// 1f5: ldc2_w 1573130001319315667
// 1f8: lload 2
// 1f9: lxor
// 1fa: invokedynamic a (IJ)Ljava/lang/String; bsm=su/catlean/w8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ff: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 202: getstatic su/catlean/w8.A Ljava/util/List;
// 205: invokeinterface java/util/List.size ()I 1
// 20a: bipush 0
// 20b: bipush 4
// 20c: aconst_null
// 20d: astore 27
// 20f: istore 28
// 211: istore 29
// 213: istore 30
// 215: astore 31
// 217: lload 6
// 219: aload 31
// 21b: iload 30
// 21d: iload 29
// 21f: iload 28
// 221: aload 27
// 223: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 226: astore 33
// 228: new java/awt/Color
// 22b: dup
// 22c: sipush 15173
// 22f: ldc2_w 5056286134948393415
// 232: lload 2
// 233: lxor
// 234: invokedynamic f (IJ)I bsm=su/catlean/w8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: bipush 1
// 23a: invokespecial java/awt/Color.<init> (IZ)V
// 23d: astore 34
// 23f: getstatic su/catlean/w8.A Ljava/util/List;
// 242: aload 33
// 244: aload 34
// 246: invokedynamic invoke (Lsu/catlean/g7;Ljava/awt/Color;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/w8.J (Lsu/catlean/g7;Ljava/awt/Color;Lsu/catlean/aj;)Z, (Lsu/catlean/aj;)Ljava/lang/Boolean; ]
// 24b: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/w8.g (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 250: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 255: pop
// 256: lload 11
// 258: aload 33
// 25a: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 25d: invokevirtual su/catlean/b6.Z ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 260: aconst_null
// 261: aconst_null
// 262: aconst_null
// 263: new org/joml/Matrix3x2f
// 266: dup
// 267: aload 1
// 268: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 26b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 26e: checkcast org/joml/Matrix3x2fc
// 271: invokespecial org/joml/Matrix3x2f.<init> (Lorg/joml/Matrix3x2fc;)V
// 274: aconst_null
// 275: sipush 29831
// 278: ldc2_w 5372805531299134976
// 27b: lload 2
// 27c: lxor
// 27d: invokedynamic f (IJ)I bsm=su/catlean/w8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 282: aconst_null
// 283: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 286: getstatic su/catlean/w8.c Ljava/util/List;
// 289: checkcast java/util/Collection
// 28c: invokeinterface java/util/Collection.isEmpty ()Z 1
// 291: aload 32
// 293: ifnull 2a7
// 296: ifne 2aa
// 299: goto 2a6
// 29c: ldc2_w -8653672678695569964
// 29f: lload 2
// 2a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a5: athrow
// 2a6: bipush 1
// 2a7: goto 2ab
// 2aa: bipush 0
// 2ab: ifeq 2ce
// 2ae: getstatic su/catlean/w8.c Ljava/util/List;
// 2b1: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/w8.H (Lsu/catlean/ff;)Z, (Lsu/catlean/ff;)Ljava/lang/Boolean; ]
// 2b6: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/w8.k (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 2bb: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 2c0: pop
// 2c1: goto 2ce
// 2c4: ldc2_w -8653672678695569964
// 2c7: lload 2
// 2c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cd: athrow
// 2ce: getstatic su/catlean/w8.k Ljava/util/List;
// 2d1: checkcast java/lang/Iterable
// 2d4: astore 33
// 2d6: bipush 0
// 2d7: istore 34
// 2d9: aload 33
// 2db: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2e0: astore 35
// 2e2: aload 35
// 2e4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2e9: ifeq 352
// 2ec: aload 35
// 2ee: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2f3: astore 36
// 2f5: aload 36
// 2f7: checkcast su/catlean/gf
// 2fa: astore 37
// 2fc: bipush 0
// 2fd: istore 38
// 2ff: aload 32
// 301: ifnull 363
// 304: aload 32
// 306: ifnull 34d
// 309: goto 316
// 30c: ldc2_w -8653672678695569964
// 30f: lload 2
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: aload 37
// 318: iload 17
// 31a: i2s
// 31b: iload 18
// 31d: i2c
// 31e: iload 19
// 320: invokevirtual su/catlean/gf.U (SCI)Z
// 323: ifeq 34b
// 326: goto 333
// 329: ldc2_w -8653672678695569964
// 32c: lload 2
// 32d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 332: athrow
// 333: aload 37
// 335: aload 1
// 336: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 339: lload 13
// 33b: invokevirtual su/catlean/gf.H (Lnet/minecraft/class_332;J)V
// 33e: goto 34b
// 341: ldc2_w -8653672678695569964
// 344: lload 2
// 345: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34a: athrow
// 34b: nop
// 34c: nop
// 34d: aload 32
// 34f: ifnonnull 2e2
// 352: nop
// 353: lload 15
// 355: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 358: iload 8
// 35a: iload 9
// 35c: i2c
// 35d: iload 10
// 35f: i2s
// 360: invokevirtual su/catlean/c6.g (ICS)V
// 363: return
}

@Flow
private final void R(InputEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/w8.a J
// 003: ldc2_w 9328222466084
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 22083723886070
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 95559162625406
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 32
// 029: lshl
// 02a: bipush 32
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 61315022919113
// 035: lxor
// 036: dup2
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 16
// 040: lshl
// 041: bipush 48
// 043: lushr
// 044: l2i
// 045: istore 10
// 047: dup2
// 048: bipush 32
// 04a: lshl
// 04b: bipush 32
// 04d: lushr
// 04e: l2i
// 04f: istore 11
// 051: pop2
// 052: pop2
// 053: ldc2_w -6817030946056091554
// 056: lload 2
// 057: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: astore 12
// 05e: aload 1
// 05f: invokevirtual su/catlean/api/event/events/client/InputEvent.getDevice ()Lsu/catlean/api/event/events/client/InputEvent$Device;
// 062: getstatic su/catlean/api/event/events/client/InputEvent$Device.Mouse Lsu/catlean/api/event/events/client/InputEvent$Device;
// 065: if_acmpne 13c
// 068: lload 4
// 06a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06d: aload 12
// 06f: ifnull 0a4
// 072: goto 07f
// 075: ldc2_w -6843273305210694860
// 078: lload 2
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 082: ifnull 13c
// 085: goto 092
// 088: ldc2_w -6843273305210694860
// 08b: lload 2
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: lload 4
// 094: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 097: goto 0a4
// 09a: ldc2_w -6843273305210694860
// 09d: lload 2
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 0a7: ifnull 13c
// 0aa: getstatic su/catlean/w8.k Ljava/util/List;
// 0ad: checkcast java/lang/Iterable
// 0b0: astore 13
// 0b2: bipush 0
// 0b3: istore 14
// 0b5: aload 13
// 0b7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0bc: astore 15
// 0be: aload 15
// 0c0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c5: ifeq 13b
// 0c8: aload 15
// 0ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0cf: astore 16
// 0d1: aload 16
// 0d3: checkcast su/catlean/gf
// 0d6: astore 17
// 0d8: bipush 0
// 0d9: istore 18
// 0db: aload 12
// 0dd: ifnull 13c
// 0e0: aload 12
// 0e2: ifnull 136
// 0e5: goto 0f2
// 0e8: ldc2_w -6843273305210694860
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: aload 17
// 0f4: iload 9
// 0f6: i2s
// 0f7: iload 10
// 0f9: i2c
// 0fa: iload 11
// 0fc: invokevirtual su/catlean/gf.U (SCI)Z
// 0ff: ifeq 134
// 102: goto 10f
// 105: ldc2_w -6843273305210694860
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: aload 17
// 111: aload 1
// 112: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 115: iload 6
// 117: i2c
// 118: swap
// 119: iload 7
// 11b: i2s
// 11c: swap
// 11d: aload 1
// 11e: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 121: iload 8
// 123: swap
// 124: invokevirtual su/catlean/gf.O (CSIILsu/catlean/api/event/events/client/InputEvent$Action;)V
// 127: goto 134
// 12a: ldc2_w -6843273305210694860
// 12d: lload 2
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: nop
// 135: nop
// 136: aload 12
// 138: ifnonnull 0be
// 13b: nop
// 13c: return
}

@Flow
private final void k(FrameBufferEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/w8.a J
// 03: ldc2_w 36199105724748
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 34444087747745
// 0d: lxor
// 0e: dup2
// 0f: bipush 48
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 16
// 18: lshl
// 19: bipush 48
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 32
// 22: lshl
// 23: bipush 32
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: pop2
// 2b: ldc2_w -3455066930794251978
// 2e: lload 2
// 2f: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: astore 7
// 36: getstatic su/catlean/ps.b Lsu/catlean/ps;
// 39: iload 4
// 3b: i2s
// 3c: iload 5
// 3e: i2c
// 3f: iload 6
// 41: invokevirtual su/catlean/ps.U (SCI)Z
// 44: aload 7
// 46: ifnull 6c
// 49: ifeq 8d
// 4c: goto 59
// 4f: ldc2_w -3427266013917044132
// 52: lload 2
// 53: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58: athrow
// 59: getstatic su/catlean/ps.b Lsu/catlean/ps;
// 5c: invokevirtual su/catlean/ps.a ()Z
// 5f: goto 6c
// 62: ldc2_w -3427266013917044132
// 65: lload 2
// 66: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: athrow
// 6c: ifeq 8d
// 6f: aload 1
// 70: getstatic su/catlean/ps.b Lsu/catlean/ps;
// 73: invokevirtual su/catlean/ps.k ()Lnet/minecraft/class_6364;
// 76: checkcast net/minecraft/class_276
// 79: invokevirtual su/catlean/api/event/events/render/FrameBufferEvent.setFrameBuffer (Lnet/minecraft/class_276;)V
// 7c: aload 1
// 7d: invokevirtual su/catlean/api/event/events/render/FrameBufferEvent.cancel ()V
// 80: goto 8d
// 83: ldc2_w -3427266013917044132
// 86: lload 2
// 87: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c: athrow
// 8d: return
}

@Flow
private final void e(CrosshairRenderEvent var1) {
long var2 = a ^ 114427059499135L;
long var10001 = var2 ^ 96403786306962L;
int var4 = (int)((var2 ^ 96403786306962L) >>> 48);
int var5 = (int)((var2 ^ 96403786306962L) << 16 >>> 48);
int var6 = (int)(var10001 << 32 >>> 32);

try {
if (g6.F.U((short)var4, (char)var5, var6)) {
var1.cancel();
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -6819383018896370833L, var2);
}
}

private final void I(long var1) {
var1 = a ^ var1;
List var10000 = k;
gf[] var3 = new gf[b<"f">(17560, 7999893116545841597L ^ var1)];
var3[0] = g1.I;
var3[1] = pq.i;
var3[2] = pj.J;
var3[3] = pr.z;
var3[4] = ph.H;
var3[5] = pg.k;
var3[b<"f">(2606, 6887954601059153695L ^ var1)] = p3.Y;
var3[b<"f">(16858, 6650448214510091517L ^ var1)] = pd.f;
var3[b<"f">(11781, 6156900648770556707L ^ var1)] = pc.m;
var3[b<"f">(26515, 6155576751232621233L ^ var1)] = pp.n;
var3[b<"f">(21055, 4185265321915232028L ^ var1)] = p7.b;
var3[b<"f">(28278, 2508940990665069398L ^ var1)] = ps.b;
var3[b<"f">(32670, 7327589950729978550L ^ var1)] = gv.N;
var3[b<"f">(31138, 6176138800356787342L ^ var1)] = pt.S;
var3[b<"f">(26808, 9156847282672899467L ^ var1)] = go.E;
var3[b<"f">(14514, 3235761193573074332L ^ var1)] = g2.N;
var3[b<"f">(20646, 5114541787015261584L ^ var1)] = pl.N;
var3[b<"f">(11104, 5694122554914133584L ^ var1)] = pb.o;
var3[b<"f">(2161, 4557411070417597776L ^ var1)] = g6.F;
var3[b<"f">(30729, 7315110471786857762L ^ var1)] = gz.x;
var3[b<"f">(7849, 4287179759749456781L ^ var1)] = p8.S;
var3[b<"f">(22826, 54186347325465603L ^ var1)] = ga.N;
var3[b<"f">(21098, 8101608633279033159L ^ var1)] = pw.G;
var10000.addAll(CollectionsKt.listOf(var3));
}

public final void p(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 59860262225302L;
long var5 = var1 ^ 98907165691242L;
Iterable var7 = k;
boolean var8 = false;
Iterator var9 = var7.iterator();

label102:
while (true) {
Iterator var10000 = var9;

label99:
while (var10000.hasNext()) {
Object var10 = var9.next();
gf var11 = (gf)var10;
boolean var12 = false;
Iterable var13 = var11.c();
boolean var14 = false;
if (var1 <= 0L) {
return;
}

for (Object var16 : var13) {
a1 var17 = (a1)var16;
boolean var18 = false;
Iterable var19 = yl.g.d().n(var3).B();
var10000 = var19.iterator();
if (var1 < 0L) {
continue label99;
}

Iterator var20 = var10000;

label93:
while (true) {
if (var20.hasNext()) {
Object var21 = var20.next();
var10000 = (Iterator)var21;

while (true) {
sd var22 = (sd)var10000;
boolean var23 = false;
if (!Intrinsics.areEqual(var22.y(), var11.I())) {
continue label93;
}

var10000 = (Iterator)var21;
if (var1 > 0L) {
break label93;
}
}
}

var10000 = null;
break;
}

label109: {
try {
var40 = (sd)var10000;
if ((sd)var10000 == null) {
break label109;
}
} catch (Exception var33) {
throw vm.a<"Å">(var33, -5308097691640150938L, var1);
}

sd var24 = var40;
Iterable var35 = var24.p();
Iterator var36 = var35.iterator();

label75:
while (true) {
if (!var36.hasNext()) {
var10000 = null;
break;
}

Object var37 = var36.next();
var10000 = (Iterator)var37;

while (true) {
sh var38 = (sh)var10000;
boolean var25 = false;
if (!Intrinsics.areEqual(var38.d(), var17.e())) {
break;
}

var10000 = (Iterator)var37;
if (var1 > 0L) {
break label75;
}
}
}

try {
var42 = (sh)var10000;
if ((sh)var10000 == null) {
break label109;
}
} catch (Exception var32) {
throw vm.a<"Å">(var32, -5308097691640150938L, var1);
}

sh var26 = var42;

try {
var17.P(var26.G(), var5);
} catch (Exception var31) {
var17.A();
Logger var43 = zf.x();
String var10001 = var17.Q();
String var10002 = var11.A();
String var28 = var31.getMessage();
String var29 = var10002;
String var30 = var10001;
var43.warn(
a<"a">(13091, 5611329874906332878L ^ var1) + var30 + a<"a">(32632, 1347161944863437460L ^ var1) + var29 + a<"a">(5488, 1011961030697654424L ^ var1) + var28
);
}
}

if (var1 <= 0L) {
break;
}
}

if (var1 >= 0L) {
continue label102;
}

return;
}

return;
}
}

private static final boolean J(g7 var0, Color var1, aj var2) {
long var3 = a ^ 17331048964966L;
long var5 = var3 ^ 42758592089606L;
long var7 = var3 ^ 124162017628256L;
Intrinsics.checkNotNullParameter(var2, a<"a">(3625, 9192707858852284371L ^ var3));
var0.b(var5, var2.D(), var2.d(), var2.v() + var2.J(), 0.0F)
.n(var1, var7)
.b(var5, var2.D(), var2.d() + var2.C(), var2.v() + var2.J(), 0.0F)
.n(var1, var7)
.b(var5, var2.D(), var2.d() + var2.C(), var2.v(), 0.0F)
.n(var1, var7)
.b(var5, var2.D(), var2.d(), var2.v(), 0.0F)
.n(var1, var7);
return true;
}

private static final boolean g(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean H(ff var0) {
long var1 = a ^ 127350983097218L;
long var3 = var1 ^ 92998633286637L;
Intrinsics.checkNotNullParameter(var0, a<"a">(20037, 1475299721436356440L ^ var1));
bj.p(var0.v(), var0.B(), var0.l(), var0.I(), var0.E(), var0.r(), null, null, var0.m(), b<"f">(19445, 170510273017719852L ^ var1), var3, null);
return true;
}

private static final boolean k(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 119902178546712L;
long var22 = var20 ^ 1813831001578L;
long var24 = var20 ^ 126044134253557L;
vm.a<"Å">(0, -4220815506572243468L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[9];
int var16 = 0;
String var15 = "BÐ^\u0012f\u0080²Ñ@O½\u0019¤µ4L\u0010U8,_o;½Î¼b\u000f5û½\rÁ\u0010Ø^2\u0089\\í»Dq\f\u0013\u001eW\u0006Þ¨\u0010\u0081ãX\u0000\u001dIOÚx\\\u001dóÑ£ëÖ\u0010é\u000b\u0098ºÍd¤XdÒ\u0010Azô\u009aO\u0018UBç]\u0001\u0018\u00adû\u009a-\u0019+7 \u001f\u0095\u0083ëå\u00adÔ`C\u00890ã\u0095+iÎ¯\u008aª\u001b\u0093\u008f_\u0099ìX\u0018Å*KRpÚbi?{K\u001e\u009bßà\u0085\u0086\u0019\u0002QF\u0014ðzlruì¥\u0007d]";
int var17 = "BÐ^\u0012f\u0080²Ñ@O½\u0019¤µ4L\u0010U8,_o;½Î¼b\u000f5û½\rÁ\u0010Ø^2\u0089\\í»Dq\f\u0013\u001eW\u0006Þ¨\u0010\u0081ãX\u0000\u001dIOÚx\\\u001dóÑ£ëÖ\u0010é\u000b\u0098ºÍd¤XdÒ\u0010Azô\u009aO\u0018UBç]\u0001\u0018\u00adû\u009a-\u0019+7 \u001f\u0095\u0083ëå\u00adÔ`C\u00890ã\u0095+iÎ¯\u008aª\u001b\u0093\u008f_\u0099ìX\u0018Å*KRpÚbi?{K\u001e\u009bßà\u0085\u0086\u0019\u0002QF\u0014ðzlruì¥\u0007d]"
.length();
char var14 = 16;
int var28 = -1;

label54:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var40 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var40;
if ((var28 += var14) >= var17) {
b = var18;
d = new String[9];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[21];
int var3 = 0;
String var4 = "\u008d!\\È\u0088k_\u008a}õT9jÙ8¸\u0002XÖ\u0081½\u0084ÀèÎ\u008a¹%'\u0014æ¦1n:¾\u0012\u0019\u001du\u0092ø8ºç&ãÎb\u000ec\u0002Îi»D¡©(\u0088\u0010Û\tÿ'$ø[\u009a{\u009c\u0013)Ü\u009d},È[Ö=<\u007f\u0010<\u009c\u009eý\bÃ\u0095® Ë:Æ\u0002ö¹®DÓ\nE\u001b\u0018\u000e\u0084GÙ*±\u0091\u0012mOì\u001c\u009awõÓ¨\u0085òEÏé!kV\u0099\u0001\u0015?±Ò\u0017\u0001\u00adH§H\bi#Â>\u0000\u008aY9";
int var5 = "\u008d!\\È\u0088k_\u008a}õT9jÙ8¸\u0002XÖ\u0081½\u0084ÀèÎ\u008a¹%'\u0014æ¦1n:¾\u0012\u0019\u001du\u0092ø8ºç&ãÎb\u000ec\u0002Îi»D¡©(\u0088\u0010Û\tÿ'$ø[\u009a{\u009c\u0013)Ü\u009d},È[Ö=<\u007f\u0010<\u009c\u009eý\bÃ\u0095® Ë:Æ\u0002ö¹®DÓ\nE\u001b\u0018\u000e\u0084GÙ*±\u0091\u0012mOì\u001c\u009awõÓ¨\u0085òEÏé!kV\u0099\u0001\u0015?±Ò\u0017\u0001\u00adH§H\bi#Â>\u0000\u008aY9"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var32 = var6;
var10001 = var3++;
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
var32[var10001] = var49;
if (var2 >= var5) {
f = var6;
g = new Integer[21];
T = new w8();
k = new ArrayList();
W = new ab();
A = new ArrayList();
c = new ArrayList();
T.I(var22);
T.p(var24);
return;
}
break;
default:
var32[var10001] = var49;
if (var2 < var5) {
continue label36;
}

var4 = "\u0010q\u0001/½\u008b|VFìæÜ÷Ç$\u0019";
var5 = "\u0010q\u0001/½\u008b|VFìæÜ÷Ç$\u0019".length();
var2 = 0;
}

byte var38 = var2;
var2 += 8;
var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
var32 = var6;
var10001 = var3++;
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

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var40;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label54;
}

var15 = "¥\tÛ\u0011\u0019\u0092¼\u0093\u0083¦j\u001cÛ(\u008c\u0011\u0018¨+ò¯«¥@E¡Jnàu\u0016\u0081Q\u0097W\u0006F\u0087Ü)±";
var17 = "¥\tÛ\u0011\u0019\u0092¼\u0093\u0083¦j\u001cÛ(\u008c\u0011\u0018¨+ò¯«¥@E¡Jnàu\u0016\u0081Q\u0097W\u0006F\u0087Ü)±".length();
var14 = 16;
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
var10001 = 0;
}
}
}

public static void D(int var0) {
i = var0;
}

public static int F() {
return i;
}

public static int R() {
int var0 = F();

try {
return var0 == 0 ? 46 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14854;
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
throw new RuntimeException("su/catlean/w8", var10);
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
throw new RuntimeException("su/catlean/w8" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 19664;
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
throw new RuntimeException("su/catlean/w8", var14);
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
throw new RuntimeException("su/catlean/w8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
