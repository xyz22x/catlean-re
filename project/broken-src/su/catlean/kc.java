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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class kc extends _g {
@NotNull
public static final kc t;
static final KProperty[] y;
@NotNull
private static final cw G;
@NotNull
private static final cw K;
@NotNull
private static final cw W;
@NotNull
private static final cs n;
@NotNull
private static final c8 h;
@NotNull
private static final c8 O;
@NotNull
private static final ct x;
@NotNull
private static final ArrayList e;
@NotNull
private static final ArrayList w;
private static int J;
private static final long a = yz.a(4915798448623905153L, -6097011542707585148L, MethodHandles.lookup().lookupClass()).a(104992542069783L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map i;

private kc(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 36375696965829L;
super(b<"q">(32139, 7987192713728511647L ^ var4), jt.F(), null, 4, null, var6);
}

private final fo Z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 30287479597193L;
return (fo)G.E(this, var3, y[0]);
}

private final tz n(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 105456185614090L;
return (tz)K.E(this, var6, y[1]);
}

private final j E(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 743393496043L;
return (j)W.E(this, var3, y[2]);
}

private final Color l(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 54290973219044L;
return (Color)n.E(this, var3, y[3]);
}

private final int i(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 10649468660194L;
return ((Number)h.E(this, var3, y[4])).intValue();
}

private final int D(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 71614743824352L;
return ((Number)O.E(this, var3, y[5])).intValue();
}

private final float j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 60980131743934L;
return ((Number)x.E(this, var3, y[c<"e">(10645, 4256127048436194952L ^ var1)])).floatValue();
}

// $VF: Unable to simplify switch on enum
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
@Flow
private final void x(PlayerUpdateEvent var1) {
long var2 = a ^ 121088316525848L;
int var4 = (int)((var2 ^ 117305193584344L) >>> 56);
long var5 = (var2 ^ 117305193584344L) << 8 >>> 8;
long var7 = var2 ^ 43216652593406L;
long var9 = var2 ^ 28139147577762L;
long var11 = var2 ^ 41058367584598L;
long var13 = var2 ^ 50907060800247L;
long var10001 = var2 ^ 68605213685501L;
int var15 = (int)((var2 ^ 68605213685501L) >>> 48);
int var16 = (int)((var2 ^ 68605213685501L) << 16 >>> 48);
int var17 = (int)(var10001 << 32 >>> 32);
long var18 = var2 ^ 10983390729945L;
String[] var10000 = vm.a<"Å">(-8881216344973704224L, var2);
e.removeIf(kc::R);
String[] var29 = var10000;
w.removeIf(kc::T);
class_243 var38 = this.J((byte)var4, var5, (class_1297)zf.v(var18)).method_1019(zf.v(var18).method_18798().method_1021(10.0));
Intrinsics.checkNotNullExpressionValue(var38, b<"q">(12382, 1156694515965220581L ^ var2));
class_243 var30 = var38;
int var31 = this.i(var7);
int var32 = 0;

while (var32 < var31) {
boolean var34 = false;

label63: {
try {
if (t.E(var13) == j.RAIN) {
var39 = new r4(
(char)var15,
(char)var16,
(float)(var30.field_1352 + mf.D(var11, -48.0F, 48.0F, false, 4, null)),
var17,
(float)(var30.field_1351 + c<"e">(15143, 4856300106708356409L ^ var2) + mf.D(var11, -2.0F, 2.0F, false, 4, null)),
(float)(var30.field_1350 + mf.D(var11, -48.0F, 48.0F, false, 4, null)),
0.0F,
mf.D(var11, -0.3F, -0.1F, false, 4, null),
0.0F,
mf.D(var11, 0.0F, 360.0F, false, 4, null),
mf.D(var11, 3.0F, 10.0F, false, 4, null),
t.j(var9)
);
break label63;
}
} catch (NumberFormatException var37) {
throw vm.a<"Å">(var37, -8877833363251818236L, var2);
}

float var10002;
float var10003;
float var10004;
float var10005;
label45: {
label44: {
try {
var39 = new r4;
var40 = var39;
var10002 = (float)(var30.field_1352 + mf.D(var11, -64.0F, 64.0F, false, 4, null) * 2);
var10003 = (float)(var30.field_1351 + mf.D(var11, 2.0F, 48.0F, false, 4, null));
var10004 = (float)(var30.field_1350 + mf.D(var11, -64.0F, 64.0F, false, 4, null) * 2);
switch (gy.G[t.E(var13).ordinal()]) {
case 1:
var10005 = 0.0F;
break label45;
case 2:
break label44;
}
} catch (NumberFormatException var36) {
throw vm.a<"Å">(var36, -8877833363251818236L, var2);
}

var10005 = mf.D(var11, 0.1F, 0.25F, false, 4, null);
break label45;
}

var10005 = mf.D(var11, -0.4F, 0.4F, false, 4, null);
}
float var10006 = switch (gy.G[t.E(var13).ordinal()]) {
case 1 -> mf.D(var11, -0.2F, -0.05F, false, 4, null);
case 2 -> mf.D(var11, -0.1F, 0.1F, false, 4, null);
default -> mf.D(var11, -0.4F, -0.1F, false, 4, null);
};

float var10007 = switch (gy.G[t.E(var13).ordinal()]) {
case 1 -> 0.0F;
case 2 -> mf.D(var11, -0.4F, 0.4F, false, 4, null);
default -> mf.D(var11, 0.1F, 0.25F, false, 4, null);
};
float var20 = t.j(var9);
float var21 = 0.0F;
float var22 = 0.0F;
float var23 = var10007;
float var24 = var10006;
float var25 = var10005;
float var26 = var10004;
float var27 = var10003;
float var28 = var10002;
var40./* $VF: Unable to resugar constructor */<init>((char)var15, (char)var16, var28, var17, var27, var26, var25, var24, var23, var22, var21, var20);
}

r4 var35 = var39;
e.add(var35);
var32++;
if (var29 == null) {
break;
}
}
}

@Flow
private final void y(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kc.a J
// 003: ldc2_w 28489558225241
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 103976381244606
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 2552185764813
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 67969087609450
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 30316694844881
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 79819254034178
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 93317434273696
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 27772923879560
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 119705380323153
// 03e: lxor
// 03f: lstore 18
// 041: dup2
// 042: ldc2_w 60802629412497
// 045: lxor
// 046: lstore 20
// 048: dup2
// 049: ldc2_w 78154986347405
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
// 069: pop2
// 06a: ldc2_w 4106969507260252065
// 06d: lload 2
// 06e: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: lload 4
// 075: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 078: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 07b: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 07e: dup
// 07f: sipush 1922
// 082: ldc2_w 5001819564176334179
// 085: lload 2
// 086: lxor
// 087: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08f: astore 31
// 091: aload 1
// 092: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 095: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 098: aload 1
// 099: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 09c: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 09f: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0a2: invokevirtual su/catlean/zi.b ()F
// 0a5: fneg
// 0a6: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 0ab: dup
// 0ac: sipush 795
// 0af: ldc2_w 4261751407949732333
// 0b2: lload 2
// 0b3: lxor
// 0b4: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0bc: checkcast org/joml/Quaternionfc
// 0bf: lload 16
// 0c1: dup2_x1
// 0c2: pop2
// 0c3: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 0c6: aload 1
// 0c7: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 0ca: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 0cd: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0d0: invokevirtual su/catlean/zi.F ()F
// 0d3: fneg
// 0d4: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 0d9: dup
// 0da: sipush 12278
// 0dd: ldc2_w 1235080619976455445
// 0e0: lload 2
// 0e1: lxor
// 0e2: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ea: checkcast org/joml/Quaternionfc
// 0ed: lload 16
// 0ef: dup2_x1
// 0f0: pop2
// 0f1: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 0f4: new su/catlean/g7
// 0f7: dup
// 0f8: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 0fb: dup
// 0fc: sipush 12758
// 0ff: ldc2_w 6913114760736795431
// 102: lload 2
// 103: lxor
// 104: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 10c: getstatic su/catlean/kc.e Ljava/util/ArrayList;
// 10f: invokevirtual java/util/ArrayList.size ()I
// 112: getstatic su/catlean/kc.w Ljava/util/ArrayList;
// 115: invokevirtual java/util/ArrayList.size ()I
// 118: iadd
// 119: bipush 0
// 11a: bipush 4
// 11b: aconst_null
// 11c: astore 25
// 11e: istore 26
// 120: istore 27
// 122: istore 28
// 124: astore 29
// 126: lload 6
// 128: aload 29
// 12a: iload 28
// 12c: iload 27
// 12e: iload 26
// 130: aload 25
// 132: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 135: astore 32
// 137: new net/minecraft/class_4587
// 13a: dup
// 13b: invokespecial net/minecraft/class_4587.<init> ()V
// 13e: astore 33
// 140: aload 33
// 142: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 145: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 148: invokevirtual su/catlean/zi.F ()F
// 14b: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 150: dup
// 151: sipush 12278
// 154: ldc2_w 1235080619976455445
// 157: lload 2
// 158: lxor
// 159: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 161: checkcast org/joml/Quaternionfc
// 164: lload 16
// 166: dup2_x1
// 167: pop2
// 168: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 16b: aload 33
// 16d: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 170: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 173: invokevirtual su/catlean/zi.b ()F
// 176: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 17b: dup
// 17c: sipush 12278
// 17f: ldc2_w 1235080619976455445
// 182: lload 2
// 183: lxor
// 184: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 18c: checkcast org/joml/Quaternionfc
// 18f: lload 16
// 191: dup2_x1
// 192: pop2
// 193: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 196: astore 30
// 198: new org/joml/Quaternionf
// 19b: dup
// 19c: invokespecial org/joml/Quaternionf.<init> ()V
// 19f: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1a2: invokevirtual su/catlean/zi.x ()F
// 1a5: fneg
// 1a6: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1a9: invokevirtual su/catlean/zi.F ()F
// 1ac: fconst_0
// 1ad: invokevirtual org/joml/Quaternionf.rotateYXZ (FFF)Lorg/joml/Quaternionf;
// 1b0: astore 34
// 1b2: getstatic su/catlean/kc.e Ljava/util/ArrayList;
// 1b5: checkcast java/lang/Iterable
// 1b8: astore 35
// 1ba: bipush 0
// 1bb: istore 36
// 1bd: aload 35
// 1bf: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1c4: astore 37
// 1c6: aload 37
// 1c8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1cd: ifeq 214
// 1d0: aload 37
// 1d2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d7: astore 38
// 1d9: aload 38
// 1db: checkcast su/catlean/r4
// 1de: astore 39
// 1e0: bipush 0
// 1e1: istore 40
// 1e3: getstatic su/catlean/kc.t Lsu/catlean/kc;
// 1e6: aload 39
// 1e8: aload 33
// 1ea: aload 34
// 1ec: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1ef: aload 34
// 1f1: checkcast org/joml/Quaternionfc
// 1f4: aload 32
// 1f6: lload 10
// 1f8: invokespecial su/catlean/kc.F (Lsu/catlean/r4;Lnet/minecraft/class_4587;Lorg/joml/Quaternionfc;Lsu/catlean/g7;J)V
// 1fb: nop
// 1fc: nop
// 1fd: aload 30
// 1ff: ifnull 215
// 202: aload 30
// 204: ifnonnull 1c6
// 207: goto 214
// 20a: ldc2_w 4074330908586093893
// 20d: lload 2
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: nop
// 215: new org/joml/Quaternionf
// 218: dup
// 219: invokespecial org/joml/Quaternionf.<init> ()V
// 21c: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 21f: invokevirtual su/catlean/zi.x ()F
// 222: fneg
// 223: ldc 1.5708
// 225: fconst_0
// 226: invokevirtual org/joml/Quaternionf.rotateYXZ (FFF)Lorg/joml/Quaternionf;
// 229: astore 35
// 22b: getstatic su/catlean/kc.w Ljava/util/ArrayList;
// 22e: checkcast java/lang/Iterable
// 231: astore 36
// 233: bipush 0
// 234: istore 37
// 236: aload 36
// 238: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 23d: astore 38
// 23f: aload 38
// 241: invokeinterface java/util/Iterator.hasNext ()Z 1
// 246: ifeq 40a
// 249: aload 38
// 24b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 250: astore 39
// 252: aload 39
// 254: checkcast su/catlean/w1
// 257: astore 40
// 259: bipush 0
// 25a: istore 41
// 25c: aload 30
// 25e: ifnull 45e
// 261: aload 30
// 263: ifnull 405
// 266: goto 273
// 269: ldc2_w 4074330908586093893
// 26c: lload 2
// 26d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 272: athrow
// 273: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 276: invokevirtual su/catlean/zi.K ()Lnet/minecraft/class_4604;
// 279: aload 40
// 27b: invokevirtual su/catlean/w1.u ()F
// 27e: f2d
// 27f: aload 40
// 281: invokevirtual su/catlean/w1.G ()F
// 284: f2d
// 285: aload 40
// 287: invokevirtual su/catlean/w1.d ()F
// 28a: f2d
// 28b: invokevirtual net/minecraft/class_4604.method_74404 (DDD)Z
// 28e: ifeq 403
// 291: goto 29e
// 294: ldc2_w 4074330908586093893
// 297: lload 2
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: aload 33
// 2a0: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 2a3: aload 33
// 2a5: aload 40
// 2a7: invokevirtual su/catlean/w1.u ()F
// 2aa: f2d
// 2ab: aload 31
// 2ad: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 2b0: getfield net/minecraft/class_243.field_1352 D
// 2b3: dsub
// 2b4: aload 40
// 2b6: invokevirtual su/catlean/w1.G ()F
// 2b9: f2d
// 2ba: aload 31
// 2bc: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 2bf: getfield net/minecraft/class_243.field_1351 D
// 2c2: dsub
// 2c3: aload 40
// 2c5: invokevirtual su/catlean/w1.d ()F
// 2c8: f2d
// 2c9: aload 31
// 2cb: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 2ce: getfield net/minecraft/class_243.field_1350 D
// 2d1: dsub
// 2d2: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 2d5: aload 33
// 2d7: aload 35
// 2d9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2dc: lload 16
// 2de: aload 35
// 2e0: checkcast org/joml/Quaternionfc
// 2e3: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 2e6: aload 33
// 2e8: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 2eb: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 2ee: dup
// 2ef: sipush 12359
// 2f2: ldc2_w 3482035809751263923
// 2f5: lload 2
// 2f6: lxor
// 2f7: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2ff: astore 42
// 301: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 304: bipush 1
// 305: aload 40
// 307: invokevirtual su/catlean/w1.H ()I
// 30a: bipush 1
// 30b: isub
// 30c: invokestatic java/lang/Math.max (II)I
// 30f: i2f
// 310: aload 40
// 312: invokevirtual su/catlean/w1.H ()I
// 315: i2f
// 316: lload 20
// 318: invokevirtual su/catlean/jl.T (FFJ)F
// 31b: fstore 43
// 31d: fconst_1
// 31e: fload 43
// 320: ldc 15.0
// 322: fdiv
// 323: fsub
// 324: fstore 44
// 326: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 329: aload 40
// 32b: invokevirtual su/catlean/w1.z ()Ljava/awt/Color;
// 32e: iload 22
// 330: i2c
// 331: iload 23
// 333: fload 44
// 335: iload 24
// 337: i2s
// 338: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 33b: astore 45
// 33d: ldc 0.5
// 33f: fconst_1
// 340: fload 43
// 342: ldc 15.0
// 344: fdiv
// 345: fmul
// 346: fadd
// 347: fstore 46
// 349: getstatic su/catlean/gi.CIRCLE Lsu/catlean/gi;
// 34c: astore 47
// 34e: aload 33
// 350: fload 46
// 352: fneg
// 353: f2d
// 354: ldc2_w 2.0
// 357: ddiv
// 358: fload 46
// 35a: fneg
// 35b: f2d
// 35c: ldc2_w 2.0
// 35f: ddiv
// 360: ldc2_w -0.01
// 363: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 366: aload 32
// 368: aload 42
// 36a: fconst_0
// 36b: lload 12
// 36d: fload 46
// 36f: fconst_0
// 370: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 373: aload 47
// 375: invokevirtual su/catlean/gi.L ()F
// 378: aload 47
// 37a: invokevirtual su/catlean/gi.v ()F
// 37d: lload 18
// 37f: dup2_x1
// 380: pop2
// 381: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 384: aload 45
// 386: lload 8
// 388: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 38b: pop
// 38c: aload 32
// 38e: aload 42
// 390: fload 46
// 392: lload 12
// 394: fload 46
// 396: fconst_0
// 397: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 39a: aload 47
// 39c: invokevirtual su/catlean/gi.o ()F
// 39f: aload 47
// 3a1: invokevirtual su/catlean/gi.v ()F
// 3a4: lload 18
// 3a6: dup2_x1
// 3a7: pop2
// 3a8: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 3ab: aload 45
// 3ad: lload 8
// 3af: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3b2: pop
// 3b3: aload 32
// 3b5: aload 42
// 3b7: fload 46
// 3b9: lload 12
// 3bb: fconst_0
// 3bc: fconst_0
// 3bd: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 3c0: aload 47
// 3c2: invokevirtual su/catlean/gi.o ()F
// 3c5: aload 47
// 3c7: invokevirtual su/catlean/gi.w ()F
// 3ca: lload 18
// 3cc: dup2_x1
// 3cd: pop2
// 3ce: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 3d1: aload 45
// 3d3: lload 8
// 3d5: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3d8: pop
// 3d9: aload 32
// 3db: aload 42
// 3dd: fconst_0
// 3de: lload 12
// 3e0: fconst_0
// 3e1: fconst_0
// 3e2: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 3e5: aload 47
// 3e7: invokevirtual su/catlean/gi.L ()F
// 3ea: aload 47
// 3ec: invokevirtual su/catlean/gi.w ()F
// 3ef: lload 18
// 3f1: dup2_x1
// 3f2: pop2
// 3f3: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 3f6: aload 45
// 3f8: lload 8
// 3fa: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3fd: pop
// 3fe: aload 33
// 400: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 403: nop
// 404: nop
// 405: aload 30
// 407: ifnonnull 23f
// 40a: nop
// 40b: lload 14
// 40d: aload 32
// 40f: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 412: invokevirtual su/catlean/b6.B ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 415: aconst_null
// 416: aconst_null
// 417: aload 1
// 418: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 41b: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 41e: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 421: aconst_null
// 422: sipush 2482
// 425: ldc2_w 51904045476795222
// 428: lload 2
// 429: lxor
// 42a: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42f: lload 4
// 431: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 434: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 437: invokestatic su/catlean/n1.o ()Lnet/minecraft/class_2960;
// 43a: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 43d: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 440: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 443: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 446: sipush 20061
// 449: ldc2_w 4888411420946088980
// 44c: lload 2
// 44d: lxor
// 44e: invokedynamic e (IJ)I bsm=su/catlean/kc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 453: aconst_null
// 454: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 457: aload 1
// 458: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 45b: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 45e: return
}

private final boolean V(long param1, r4 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kc.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 29223260524890
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 77147734697358
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 133063234379427
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 42142497989038
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 49817538777615
// 027: lxor
// 028: lstore 12
// 02a: dup2
// 02b: ldc2_w 7290721312843
// 02e: lxor
// 02f: lstore 14
// 031: dup2
// 032: ldc2_w 12090080169505
// 035: lxor
// 036: lstore 16
// 038: dup2
// 039: ldc2_w 137227243418960
// 03c: lxor
// 03d: dup2
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 18
// 044: dup2
// 045: bipush 16
// 047: lshl
// 048: bipush 16
// 04a: lushr
// 04b: lstore 19
// 04d: pop2
// 04e: pop2
// 04f: ldc2_w -2573921766879110376
// 052: lload 1
// 053: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: astore 21
// 05a: aload 21
// 05c: ifnull 0d9
// 05f: lload 16
// 061: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 064: aload 3
// 065: invokevirtual su/catlean/r4.X ()F
// 068: f2d
// 069: aload 3
// 06a: invokevirtual su/catlean/r4.z ()F
// 06d: f2d
// 06e: aload 3
// 06f: invokevirtual su/catlean/r4.W ()F
// 072: f2d
// 073: invokevirtual net/minecraft/class_746.method_5649 (DDD)D
// 076: ldc2_w 4096.0
// 079: dcmpl
// 07a: ifgt 0b6
// 07d: goto 08a
// 080: ldc2_w -2579548198998193668
// 083: lload 1
// 084: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: athrow
// 08a: aload 3
// 08b: invokevirtual su/catlean/r4.r ()Z
// 08e: aload 21
// 090: ifnull 0f5
// 093: goto 0a0
// 096: ldc2_w -2579548198998193668
// 099: lload 1
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: lload 1
// 0a1: lconst_0
// 0a2: lcmp
// 0a3: iflt 0e8
// 0a6: ifeq 0e4
// 0a9: goto 0b6
// 0ac: ldc2_w -2579548198998193668
// 0af: lload 1
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: aload 3
// 0b7: aload 3
// 0b8: invokevirtual su/catlean/r4.E ()I
// 0bb: sipush 14419
// 0be: ldc2_w 5758085125681043127
// 0c1: lload 1
// 0c2: lxor
// 0c3: invokedynamic e (IJ)I bsm=su/catlean/kc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: isub
// 0c9: invokevirtual su/catlean/r4.q (I)V
// 0cc: goto 0d9
// 0cf: ldc2_w -2579548198998193668
// 0d2: lload 1
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: lload 1
// 0da: lconst_0
// 0db: lcmp
// 0dc: ifle 102
// 0df: aload 21
// 0e1: ifnonnull 102
// 0e4: aload 3
// 0e5: invokevirtual su/catlean/r4.E ()I
// 0e8: goto 0f5
// 0eb: ldc2_w -2579548198998193668
// 0ee: lload 1
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: istore 22
// 0f7: aload 3
// 0f8: iload 22
// 0fa: bipush -1
// 0fb: iadd
// 0fc: invokevirtual su/catlean/r4.q (I)V
// 0ff: iload 22
// 101: pop
// 102: aload 3
// 103: lload 1
// 104: lconst_0
// 105: lcmp
// 106: iflt 175
// 109: aload 21
// 10b: ifnull 175
// 10e: invokevirtual su/catlean/r4.E ()I
// 111: ifge 12d
// 114: goto 121
// 117: ldc2_w -2579548198998193668
// 11a: lload 1
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: bipush 1
// 122: ireturn
// 123: ldc2_w -2579548198998193668
// 126: lload 1
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: aload 3
// 12e: aload 3
// 12f: invokevirtual su/catlean/r4.X ()F
// 132: invokevirtual su/catlean/r4.M (F)V
// 135: aload 3
// 136: aload 3
// 137: invokevirtual su/catlean/r4.z ()F
// 13a: invokevirtual su/catlean/r4.q (F)V
// 13d: aload 3
// 13e: aload 3
// 13f: invokevirtual su/catlean/r4.W ()F
// 142: invokevirtual su/catlean/r4.f (F)V
// 145: aload 3
// 146: aload 3
// 147: invokevirtual su/catlean/r4.X ()F
// 14a: aload 3
// 14b: invokevirtual su/catlean/r4.b ()F
// 14e: fadd
// 14f: invokevirtual su/catlean/r4.t (F)V
// 152: aload 3
// 153: aload 3
// 154: invokevirtual su/catlean/r4.z ()F
// 157: aload 3
// 158: invokevirtual su/catlean/r4.G ()F
// 15b: fadd
// 15c: invokevirtual su/catlean/r4.N (F)V
// 15f: aload 3
// 160: aload 3
// 161: invokevirtual su/catlean/r4.W ()F
// 164: aload 3
// 165: invokevirtual su/catlean/r4.s ()F
// 168: fadd
// 169: invokevirtual su/catlean/r4.l (F)V
// 16c: aload 3
// 16d: aload 3
// 16e: invokevirtual su/catlean/r4.C ()F
// 171: invokevirtual su/catlean/r4.b (F)V
// 174: aload 3
// 175: aload 3
// 176: invokevirtual su/catlean/r4.C ()F
// 179: aload 3
// 17a: invokevirtual su/catlean/r4.R ()F
// 17d: fadd
// 17e: invokevirtual su/catlean/r4.s (F)V
// 181: aload 0
// 182: lload 12
// 184: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 187: getstatic su/catlean/j.FALLING_STARS Lsu/catlean/j;
// 18a: aload 21
// 18c: lload 1
// 18d: lconst_0
// 18e: lcmp
// 18f: ifle 1d9
// 192: ifnull 1d1
// 195: if_acmpeq 1c8
// 198: goto 1a5
// 19b: ldc2_w -2579548198998193668
// 19e: lload 1
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: aload 3
// 1a6: aload 3
// 1a7: invokevirtual su/catlean/r4.b ()F
// 1aa: ldc 0.9
// 1ac: fmul
// 1ad: invokevirtual su/catlean/r4.k (F)V
// 1b0: aload 3
// 1b1: aload 3
// 1b2: invokevirtual su/catlean/r4.s ()F
// 1b5: ldc 0.9
// 1b7: fmul
// 1b8: invokevirtual su/catlean/r4.y (F)V
// 1bb: goto 1c8
// 1be: ldc2_w -2579548198998193668
// 1c1: lload 1
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: athrow
// 1c8: aload 0
// 1c9: lload 12
// 1cb: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 1ce: getstatic su/catlean/j.FLY Lsu/catlean/j;
// 1d1: lload 1
// 1d2: lconst_0
// 1d3: lcmp
// 1d4: iflt 202
// 1d7: aload 21
// 1d9: ifnull 202
// 1dc: if_acmpeq 231
// 1df: goto 1ec
// 1e2: ldc2_w -2579548198998193668
// 1e5: lload 1
// 1e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1eb: athrow
// 1ec: aload 0
// 1ed: lload 12
// 1ef: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 1f2: getstatic su/catlean/j.RAIN Lsu/catlean/j;
// 1f5: goto 202
// 1f8: ldc2_w -2579548198998193668
// 1fb: lload 1
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: if_acmpne 249
// 205: aload 3
// 206: lload 1
// 207: lconst_0
// 208: lcmp
// 209: ifle 24a
// 20c: aload 21
// 20e: ifnull 24a
// 211: goto 21e
// 214: ldc2_w -2579548198998193668
// 217: lload 1
// 218: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: athrow
// 21e: invokevirtual su/catlean/r4.r ()Z
// 221: ifeq 249
// 224: goto 231
// 227: ldc2_w -2579548198998193668
// 22a: lload 1
// 22b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: athrow
// 231: aload 3
// 232: aload 3
// 233: invokevirtual su/catlean/r4.G ()F
// 236: ldc 0.9
// 238: fmul
// 239: invokevirtual su/catlean/r4.d (F)V
// 23c: goto 249
// 23f: ldc2_w -2579548198998193668
// 242: lload 1
// 243: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 248: athrow
// 249: aload 3
// 24a: aload 3
// 24b: invokevirtual su/catlean/r4.G ()F
// 24e: aload 0
// 24f: lload 12
// 251: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 254: getstatic su/catlean/j.RAIN Lsu/catlean/j;
// 257: lload 1
// 258: lconst_0
// 259: lcmp
// 25a: ifle 29e
// 25d: aload 21
// 25f: ifnull 29e
// 262: if_acmpne 295
// 265: goto 272
// 268: ldc2_w -2579548198998193668
// 26b: lload 1
// 26c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 271: athrow
// 272: aload 3
// 273: invokevirtual su/catlean/r4.r ()Z
// 276: ifeq 295
// 279: goto 286
// 27c: ldc2_w -2579548198998193668
// 27f: lload 1
// 280: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 285: athrow
// 286: ldc 0.08
// 288: goto 2b2
// 28b: ldc2_w -2579548198998193668
// 28e: lload 1
// 28f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 294: athrow
// 295: aload 0
// 296: lload 12
// 298: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 29b: getstatic su/catlean/j.RAIN Lsu/catlean/j;
// 29e: if_acmpne 2b0
// 2a1: ldc 0.02
// 2a3: goto 2b2
// 2a6: ldc2_w -2579548198998193668
// 2a9: lload 1
// 2aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2af: athrow
// 2b0: ldc 0.001
// 2b2: fsub
// 2b3: invokevirtual su/catlean/r4.d (F)V
// 2b6: aload 3
// 2b7: aload 21
// 2b9: ifnull 45e
// 2bc: invokevirtual su/catlean/r4.z ()F
// 2bf: aload 0
// 2c0: lload 4
// 2c2: invokespecial su/catlean/kc.j (J)F
// 2c5: fsub
// 2c6: aload 3
// 2c7: invokevirtual su/catlean/r4.B ()F
// 2ca: fcmpg
// 2cb: ifge 45d
// 2ce: goto 2db
// 2d1: ldc2_w -2579548198998193668
// 2d4: lload 1
// 2d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2da: athrow
// 2db: aload 3
// 2dc: lload 1
// 2dd: lconst_0
// 2de: lcmp
// 2df: iflt 45e
// 2e2: aload 21
// 2e4: ifnull 45e
// 2e7: goto 2f4
// 2ea: ldc2_w -2579548198998193668
// 2ed: lload 1
// 2ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f3: athrow
// 2f4: invokevirtual su/catlean/r4.r ()Z
// 2f7: ifne 45d
// 2fa: goto 307
// 2fd: ldc2_w -2579548198998193668
// 300: lload 1
// 301: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 306: athrow
// 307: aload 0
// 308: lload 12
// 30a: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 30d: getstatic su/catlean/j.RAIN Lsu/catlean/j;
// 310: if_acmpne 45d
// 313: goto 320
// 316: ldc2_w -2579548198998193668
// 319: lload 1
// 31a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31f: athrow
// 320: aload 3
// 321: aload 3
// 322: invokevirtual su/catlean/r4.G ()F
// 325: fneg
// 326: ldc 4.0
// 328: fdiv
// 329: invokevirtual su/catlean/r4.d (F)V
// 32c: aload 3
// 32d: bipush 1
// 32e: invokevirtual su/catlean/r4.K (Z)V
// 331: aload 3
// 332: sipush 23464
// 335: ldc2_w 1728781469679170885
// 338: lload 1
// 339: lxor
// 33a: invokedynamic e (IJ)I bsm=su/catlean/kc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33f: invokevirtual su/catlean/r4.q (I)V
// 342: aload 3
// 343: lload 10
// 345: ldc -0.2
// 347: ldc 0.2
// 349: bipush 0
// 34a: bipush 4
// 34b: aconst_null
// 34c: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 34f: invokevirtual su/catlean/r4.k (F)V
// 352: aload 3
// 353: lload 10
// 355: ldc -0.2
// 357: ldc 0.2
// 359: bipush 0
// 35a: bipush 4
// 35b: aconst_null
// 35c: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 35f: invokevirtual su/catlean/r4.y (F)V
// 362: bipush 5
// 363: istore 22
// 365: bipush 0
// 366: istore 23
// 368: iload 23
// 36a: iload 22
// 36c: if_icmpge 423
// 36f: iload 23
// 371: istore 24
// 373: bipush 0
// 374: istore 25
// 376: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 379: new su/catlean/bk
// 37c: dup
// 37d: getstatic su/catlean/gi.FIREFLY Lsu/catlean/gi;
// 380: new net/minecraft/class_243
// 383: dup
// 384: aload 3
// 385: invokevirtual su/catlean/r4.X ()F
// 388: f2d
// 389: aload 3
// 38a: invokevirtual su/catlean/r4.B ()F
// 38d: f2d
// 38e: aload 3
// 38f: invokevirtual su/catlean/r4.W ()F
// 392: f2d
// 393: invokespecial net/minecraft/class_243.<init> (DDD)V
// 396: fconst_0
// 397: lload 14
// 399: ldc 0.1
// 39b: sipush 32292
// 39e: ldc2_w 7029509346325696714
// 3a1: lload 1
// 3a2: lxor
// 3a3: invokedynamic e (IJ)I bsm=su/catlean/kc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: new net/minecraft/class_243
// 3ab: dup
// 3ac: invokestatic java/lang/Math.random ()D
// 3af: fconst_2
// 3b0: f2d
// 3b1: ddiv
// 3b2: ldc 0.25
// 3b4: f2d
// 3b5: dsub
// 3b6: invokestatic java/lang/Math.random ()D
// 3b9: ldc 4.0
// 3bb: f2d
// 3bc: ddiv
// 3bd: invokestatic java/lang/Math.random ()D
// 3c0: fconst_2
// 3c1: f2d
// 3c2: ddiv
// 3c3: ldc 0.25
// 3c5: f2d
// 3c6: dsub
// 3c7: invokespecial net/minecraft/class_243.<init> (DDD)V
// 3ca: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3cd: iload 24
// 3cf: sipush 22095
// 3d2: ldc2_w 3528997171991263404
// 3d5: lload 1
// 3d6: lxor
// 3d7: invokedynamic e (IJ)I bsm=su/catlean/kc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3dc: imul
// 3dd: lload 8
// 3df: dup2_x1
// 3e0: pop2
// 3e1: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 3e4: fconst_0
// 3e5: fconst_0
// 3e6: bipush 0
// 3e7: sipush 18510
// 3ea: ldc2_w 6664949396000515749
// 3ed: lload 1
// 3ee: lxor
// 3ef: invokedynamic e (IJ)I bsm=su/catlean/kc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f4: aconst_null
// 3f5: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 3f8: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 3fb: lload 1
// 3fc: lconst_0
// 3fd: lcmp
// 3fe: ifle 45c
// 401: pop
// 402: nop
// 403: iinc 23 1
// 406: aload 21
// 408: ifnull 439
// 40b: aload 21
// 40d: ifnonnull 368
// 410: lload 1
// 411: lconst_0
// 412: lcmp
// 413: iflt 406
// 416: goto 423
// 419: ldc2_w -2579548198998193668
// 41c: lload 1
// 41d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 422: athrow
// 423: aload 3
// 424: ldc -20.0
// 426: ldc 20.0
// 428: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 42b: checkcast kotlin/ranges/ClosedRange
// 42e: lload 6
// 430: bipush 0
// 431: bipush 2
// 432: aconst_null
// 433: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 436: invokevirtual su/catlean/r4.P (F)V
// 439: getstatic su/catlean/kc.w Ljava/util/ArrayList;
// 43c: new su/catlean/w1
// 43f: dup
// 440: aload 3
// 441: invokevirtual su/catlean/r4.X ()F
// 444: aload 3
// 445: invokevirtual su/catlean/r4.B ()F
// 448: aload 3
// 449: invokevirtual su/catlean/r4.W ()F
// 44c: iload 18
// 44e: i2s
// 44f: bipush 0
// 450: aload 3
// 451: invokevirtual su/catlean/r4.j ()Ljava/awt/Color;
// 454: lload 19
// 456: invokespecial su/catlean/w1.<init> (FFFSILjava/awt/Color;J)V
// 459: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 45c: pop
// 45d: aload 3
// 45e: aload 3
// 45f: invokevirtual su/catlean/r4.X ()F
// 462: f2d
// 463: lload 16
// 465: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 468: invokevirtual net/minecraft/class_746.method_23317 ()D
// 46b: dsub
// 46c: lload 1
// 46d: lconst_0
// 46e: lcmp
// 46f: iflt 488
// 472: aload 3
// 473: invokevirtual su/catlean/r4.W ()F
// 476: aload 21
// 478: ifnull 4b0
// 47b: f2d
// 47c: lload 16
// 47e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 481: invokevirtual net/minecraft/class_746.method_23321 ()D
// 484: dsub
// 485: invokestatic java/lang/Math.hypot (DD)D
// 488: aload 0
// 489: lload 12
// 48b: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 48e: getstatic su/catlean/j.RAIN Lsu/catlean/j;
// 491: if_acmpne 4b3
// 494: goto 4a1
// 497: ldc2_w -2579548198998193668
// 49a: lload 1
// 49b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a0: athrow
// 4a1: ldc 1024.0
// 4a3: goto 4b0
// 4a6: ldc2_w -2579548198998193668
// 4a9: lload 1
// 4aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4af: athrow
// 4b0: goto 4b5
// 4b3: ldc 2304.0
// 4b5: f2d
// 4b6: dcmpg
// 4b7: aload 21
// 4b9: ifnull 4cd
// 4bc: ifge 4d0
// 4bf: goto 4cc
// 4c2: ldc2_w -2579548198998193668
// 4c5: lload 1
// 4c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4cb: athrow
// 4cc: bipush 1
// 4cd: goto 4d1
// 4d0: bipush 0
// 4d1: invokevirtual su/catlean/r4.k (Z)V
// 4d4: bipush 0
// 4d5: ireturn
}

private final void F(r4 param1, class_4587 param2, Quaternionfc param3, g7 param4, long param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kc.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 34815290382785
// 00e: lxor
// 00f: lstore 7
// 011: dup2
// 012: ldc2_w 52112890071196
// 015: lxor
// 016: lstore 9
// 018: dup2
// 019: ldc2_w 137351897704213
// 01c: lxor
// 01d: lstore 11
// 01f: dup2
// 020: ldc2_w 10594275594877
// 023: lxor
// 024: lstore 13
// 026: dup2
// 027: ldc2_w 3954241710251
// 02a: lxor
// 02b: lstore 15
// 02d: dup2
// 02e: ldc2_w 97274852269559
// 031: lxor
// 032: lstore 17
// 034: dup2
// 035: ldc2_w 27206016224201
// 038: lxor
// 039: lstore 19
// 03b: dup2
// 03c: ldc2_w 50465444921902
// 03f: lxor
// 040: lstore 21
// 042: dup2
// 043: ldc2_w 130250342161390
// 046: lxor
// 047: lstore 23
// 049: dup2
// 04a: ldc2_w 6794947733234
// 04d: lxor
// 04e: dup2
// 04f: bipush 48
// 051: lushr
// 052: l2i
// 053: istore 25
// 055: dup2
// 056: bipush 16
// 058: lshl
// 059: bipush 32
// 05b: lushr
// 05c: l2i
// 05d: istore 26
// 05f: dup2
// 060: bipush 48
// 062: lshl
// 063: bipush 48
// 065: lushr
// 066: l2i
// 067: istore 27
// 069: pop2
// 06a: dup2
// 06b: ldc2_w 14147213114359
// 06e: lxor
// 06f: lstore 28
// 071: pop2
// 072: ldc2_w -4214909401320176930
// 075: lload 5
// 077: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: astore 30
// 07e: aload 1
// 07f: invokevirtual su/catlean/r4.t ()Z
// 082: aload 30
// 084: ifnull 0be
// 087: ifeq 0c1
// 08a: goto 098
// 08d: ldc2_w -4182243830249304006
// 090: lload 5
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 09b: invokevirtual su/catlean/zi.K ()Lnet/minecraft/class_4604;
// 09e: aload 1
// 09f: invokevirtual su/catlean/r4.X ()F
// 0a2: f2d
// 0a3: aload 1
// 0a4: invokevirtual su/catlean/r4.z ()F
// 0a7: f2d
// 0a8: aload 1
// 0a9: invokevirtual su/catlean/r4.W ()F
// 0ac: f2d
// 0ad: invokevirtual net/minecraft/class_4604.method_74404 (DDD)Z
// 0b0: goto 0be
// 0b3: ldc2_w -4182243830249304006
// 0b6: lload 5
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: ifne 0c2
// 0c1: return
// 0c2: lload 7
// 0c4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c7: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 0ca: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 0cd: dup
// 0ce: bipush 39
// 0d0: ldc2_w 4441645762746034111
// 0d3: lload 5
// 0d5: lxor
// 0d6: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0de: astore 31
// 0e0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0e3: aload 1
// 0e4: invokevirtual su/catlean/r4.f ()F
// 0e7: aload 1
// 0e8: invokevirtual su/catlean/r4.X ()F
// 0eb: lload 23
// 0ed: invokevirtual su/catlean/jl.T (FFJ)F
// 0f0: f2d
// 0f1: dstore 32
// 0f3: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0f6: aload 1
// 0f7: invokevirtual su/catlean/r4.h ()F
// 0fa: aload 1
// 0fb: invokevirtual su/catlean/r4.z ()F
// 0fe: lload 23
// 100: invokevirtual su/catlean/jl.T (FFJ)F
// 103: f2d
// 104: dstore 34
// 106: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 109: aload 1
// 10a: invokevirtual su/catlean/r4.k ()F
// 10d: aload 1
// 10e: invokevirtual su/catlean/r4.W ()F
// 111: lload 23
// 113: invokevirtual su/catlean/jl.T (FFJ)F
// 116: f2d
// 117: dstore 36
// 119: aload 2
// 11a: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 11d: aload 2
// 11e: dload 32
// 120: aload 31
// 122: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 125: getfield net/minecraft/class_243.field_1352 D
// 128: dsub
// 129: dload 34
// 12b: aload 31
// 12d: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 130: getfield net/minecraft/class_243.field_1351 D
// 133: dsub
// 134: dload 36
// 136: aload 31
// 138: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 13b: getfield net/minecraft/class_243.field_1350 D
// 13e: dsub
// 13f: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 142: lload 5
// 144: lconst_0
// 145: lcmp
// 146: ifle 155
// 149: aload 2
// 14a: aload 30
// 14c: ifnull 1b3
// 14f: lload 17
// 151: aload 3
// 152: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 155: aload 0
// 156: lload 19
// 158: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 15b: getstatic su/catlean/j.RAIN Lsu/catlean/j;
// 15e: if_acmpne 1b2
// 161: goto 16f
// 164: ldc2_w -4182243830249304006
// 167: lload 5
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 2
// 170: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 173: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 176: aload 1
// 177: invokevirtual su/catlean/r4.Y ()F
// 17a: aload 1
// 17b: invokevirtual su/catlean/r4.C ()F
// 17e: lload 23
// 180: invokevirtual su/catlean/jl.T (FFJ)F
// 183: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 188: dup
// 189: sipush 31024
// 18c: ldc2_w 2452480912153665199
// 18f: lload 5
// 191: lxor
// 192: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 19a: checkcast org/joml/Quaternionfc
// 19d: lload 17
// 19f: dup2_x1
// 1a0: pop2
// 1a1: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 1a4: goto 1b2
// 1a7: ldc2_w -4182243830249304006
// 1aa: lload 5
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: aload 2
// 1b3: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 1b6: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 1b9: dup
// 1ba: sipush 19391
// 1bd: ldc2_w 8862353819656875068
// 1c0: lload 5
// 1c2: lxor
// 1c3: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1cb: astore 38
// 1cd: aload 1
// 1ce: invokevirtual su/catlean/r4.E ()I
// 1d1: i2f
// 1d2: aload 1
// 1d3: invokevirtual su/catlean/r4.H ()I
// 1d6: i2f
// 1d7: fdiv
// 1d8: fstore 39
// 1da: aload 0
// 1db: lload 19
// 1dd: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 1e0: getstatic su/catlean/j.RAIN Lsu/catlean/j;
// 1e3: if_acmpne 20e
// 1e6: aload 1
// 1e7: aload 30
// 1e9: ifnull 231
// 1ec: goto 1fa
// 1ef: ldc2_w -4182243830249304006
// 1f2: lload 5
// 1f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: athrow
// 1fa: invokevirtual su/catlean/r4.r ()Z
// 1fd: ifeq 230
// 200: goto 20e
// 203: ldc2_w -4182243830249304006
// 206: lload 5
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 211: aload 1
// 212: invokevirtual su/catlean/r4.j ()Ljava/awt/Color;
// 215: iload 25
// 217: i2c
// 218: iload 26
// 21a: fload 39
// 21c: iload 27
// 21e: i2s
// 21f: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 222: goto 234
// 225: ldc2_w -4182243830249304006
// 228: lload 5
// 22a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22f: athrow
// 230: aload 1
// 231: invokevirtual su/catlean/r4.j ()Ljava/awt/Color;
// 234: astore 40
// 236: aload 2
// 237: aload 0
// 238: lload 9
// 23a: invokespecial su/catlean/kc.j (J)F
// 23d: fneg
// 23e: f2d
// 23f: ldc2_w 2.0
// 242: ddiv
// 243: aload 0
// 244: lload 9
// 246: invokespecial su/catlean/kc.j (J)F
// 249: fneg
// 24a: f2d
// 24b: ldc2_w 2.0
// 24e: ddiv
// 24f: ldc2_w -0.01
// 252: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 255: aload 0
// 256: lload 15
// 258: invokespecial su/catlean/kc.Z (J)Lsu/catlean/fo;
// 25b: invokevirtual su/catlean/fo.g ()Lsu/catlean/gi;
// 25e: astore 41
// 260: nop
// 261: aload 4
// 263: aload 38
// 265: fconst_0
// 266: aload 0
// 267: lload 9
// 269: invokespecial su/catlean/kc.j (J)F
// 26c: lload 13
// 26e: dup2_x1
// 26f: pop2
// 270: fconst_0
// 271: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 274: aload 41
// 276: invokevirtual su/catlean/gi.L ()F
// 279: aload 41
// 27b: invokevirtual su/catlean/gi.v ()F
// 27e: lload 21
// 280: dup2_x1
// 281: pop2
// 282: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 285: aload 40
// 287: lload 11
// 289: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 28c: pop
// 28d: aload 4
// 28f: aload 38
// 291: aload 0
// 292: lload 9
// 294: invokespecial su/catlean/kc.j (J)F
// 297: aload 0
// 298: lload 9
// 29a: invokespecial su/catlean/kc.j (J)F
// 29d: lload 13
// 29f: dup2_x1
// 2a0: pop2
// 2a1: fconst_0
// 2a2: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2a5: aload 41
// 2a7: invokevirtual su/catlean/gi.o ()F
// 2aa: aload 41
// 2ac: invokevirtual su/catlean/gi.v ()F
// 2af: lload 21
// 2b1: dup2_x1
// 2b2: pop2
// 2b3: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 2b6: aload 40
// 2b8: lload 11
// 2ba: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2bd: pop
// 2be: aload 4
// 2c0: aload 38
// 2c2: aload 0
// 2c3: lload 9
// 2c5: invokespecial su/catlean/kc.j (J)F
// 2c8: lload 13
// 2ca: fconst_0
// 2cb: fconst_0
// 2cc: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2cf: aload 41
// 2d1: invokevirtual su/catlean/gi.o ()F
// 2d4: aload 41
// 2d6: invokevirtual su/catlean/gi.w ()F
// 2d9: lload 21
// 2db: dup2_x1
// 2dc: pop2
// 2dd: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 2e0: aload 40
// 2e2: lload 11
// 2e4: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2e7: pop
// 2e8: aload 4
// 2ea: aload 38
// 2ec: fconst_0
// 2ed: lload 13
// 2ef: fconst_0
// 2f0: fconst_0
// 2f1: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2f4: aload 41
// 2f6: invokevirtual su/catlean/gi.L ()F
// 2f9: aload 41
// 2fb: invokevirtual su/catlean/gi.w ()F
// 2fe: lload 21
// 300: dup2_x1
// 301: pop2
// 302: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 305: aload 40
// 307: lload 11
// 309: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 30c: pop
// 30d: aload 2
// 30e: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 311: aload 1
// 312: invokevirtual su/catlean/r4.r ()Z
// 315: ifne 38f
// 318: aload 0
// 319: lload 19
// 31b: invokespecial su/catlean/kc.E (J)Lsu/catlean/j;
// 31e: getstatic su/catlean/j.RAIN Lsu/catlean/j;
// 321: if_acmpne 38f
// 324: goto 332
// 327: ldc2_w -4182243830249304006
// 32a: lload 5
// 32c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 331: athrow
// 332: aload 1
// 333: invokevirtual su/catlean/r4.E ()I
// 336: i2f
// 337: ldc 20.0
// 339: fdiv
// 33a: fconst_0
// 33b: fconst_1
// 33c: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 33f: fstore 42
// 341: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 344: new net/minecraft/class_243
// 347: dup
// 348: dload 32
// 34a: dload 34
// 34c: dload 36
// 34e: invokespecial net/minecraft/class_243.<init> (DDD)V
// 351: new net/minecraft/class_243
// 354: dup
// 355: dload 32
// 357: dload 34
// 359: bipush 3
// 35a: i2d
// 35b: dadd
// 35c: dload 36
// 35e: invokespecial net/minecraft/class_243.<init> (DDD)V
// 361: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 364: aload 40
// 366: fload 42
// 368: ldc 3.0
// 36a: fdiv
// 36b: iload 25
// 36d: i2c
// 36e: swap
// 36f: iload 26
// 371: swap
// 372: iload 27
// 374: i2s
// 375: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 378: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 37b: aload 40
// 37d: iload 25
// 37f: i2c
// 380: iload 26
// 382: fconst_0
// 383: iload 27
// 385: i2s
// 386: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 389: lload 28
// 38b: invokevirtual su/catlean/zi.t (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;J)Z
// 38e: pop
// 38f: return
}

private static final boolean z() {
long var0 = a ^ 113010974749532L;
long var10001 = var0 ^ 134010422370386L;
int var2 = (int)((var0 ^ 134010422370386L) >>> 48);
int var3 = (int)((var0 ^ 134010422370386L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (t.n((char)var2, (short)var3, var4) == tz.CUSTOM) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 4219751349196500800L, var0);
}

return false;
}

private static final boolean C(r4 var0) {
long var1 = a ^ 74477658608453L;
long var3 = var1 ^ 127776821825035L;
Intrinsics.checkNotNullParameter(var0, b<"q">(14209, 280437099323395941L ^ var1));
return t.V(var3, var0);
}

private static final boolean R(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean k(w1 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kc.a J
// 03: ldc2_w 11888668700965
// 06: lxor
// 07: lstore 1
// 08: ldc2_w -5151290896662446115
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 0
// 12: sipush 30567
// 15: ldc2_w 8800240259206524363
// 18: lload 1
// 19: lxor
// 1a: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/kc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 22: aload 0
// 23: invokevirtual su/catlean/w1.H ()I
// 26: istore 4
// 28: aload 0
// 29: iload 4
// 2b: bipush 1
// 2c: iadd
// 2d: invokevirtual su/catlean/w1.W (I)V
// 30: astore 3
// 31: iload 4
// 33: aload 3
// 34: ifnull 62
// 37: sipush 24407
// 3a: ldc2_w 1705550401944868211
// 3d: lload 1
// 3e: lxor
// 3f: invokedynamic e (IJ)I bsm=su/catlean/kc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: if_icmple 65
// 47: goto 54
// 4a: ldc2_w -5118625308415906503
// 4d: lload 1
// 4e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: athrow
// 54: bipush 1
// 55: goto 62
// 58: ldc2_w -5118625308415906503
// 5b: lload 1
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: goto 66
// 65: bipush 0
// 66: ireturn
}

private static final boolean T(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

public static final j a(long a, kc $this) {
ax = a ^ ax;
long var3 = ax ^ 85384069373874L;
return $this.E(var3);
}

public static final int q(short a, int a, kc $this, int a) {
long var4 = ((long)ax << 48 | (long)axxx << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var6 = var4 ^ 26077562701436L;
return $this.D(var6);
}

public static final tz W(byte a, kc $this, int a, int a) {
long var4 = ((long)ax << 56 | (long)axxx << 32 >>> 8 | (long)axx << 40 >>> 40) ^ a;
long var10001 = var4 ^ 59326650495154L;
int var6 = (int)((var4 ^ 59326650495154L) >>> 48);
int var7 = (int)((var4 ^ 59326650495154L) << 16 >>> 48);
int var8 = (int)(var10001 << 32 >>> 32);
return $this.n((char)var6, (short)var7, var8);
}

public static final Color E(long a, kc $this) {
ax = a ^ ax;
long var3 = ax ^ 128274428139929L;
return $this.l(var3);
}

static {
long var20 = a ^ 61579862930044L;
long var10001 = var20 ^ 61717481890400L;
int var22 = (int)((var20 ^ 61717481890400L) >>> 32);
int var23 = (int)((var20 ^ 61717481890400L) << 32 >>> 48);
int var24 = (int)(var10001 << 48 >>> 48);
long var25 = var20 ^ 114641853608526L;
long var27 = var20 ^ 131838992347494L;
int var29 = (int)((var20 ^ 46628668421781L) >>> 48);
long var30 = (var20 ^ 46628668421781L) << 16 >>> 16;
long var32 = var20 ^ 27703509763764L;
vm.a<"Å">(0, -4951711361787608222L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[35];
int var16 = 0;
String var15 = "\u0090Úú\u0010\u008f\u0002&ý¢õ\u001b±\u0094c²é8Ûûy·Á\u001eë_$³¢m\u0081îs\u008d+ÀªW0\u0093ÔRæE\u007f4\u0088©ÉÉªÂàr^sÇ]S\u009f}Åqð¿\u0005-\u0017\"æcò×ÿ \u0012Päð °\u0016È\u009cøp©C\u0018:ê%Å\"éÞaõ¾1úo×K\u0082Uà(\rPh\u001b\u0007ú)\u0095<\u0002Ío9à: \u008dêê\u008e\u001a·ÅÒ{ÜÂÜ¿\u0012yl.É´_ñ|ç\u0010 g²2ÐÁ Ú\u0087*\u0014Èj\"µjÊ=àÚ\u0099~\u009d3z\u001d\f\u0004xÚ\u0012\u0093´\u0010\u009a2îò\t\u0095,\fH9-\u000bbw$\u0082 d°g<\u0082:IÀÑ<q\u001ePña¢Þ#?b»¹Qe\u001bºq\u0002\u000b«ÖX\u0010ºØ\u0018\u000e¿m\u001a¨ê 0\u0005\u0098!%\u008e zÑ~rb®fá®¡_\u0006$W\u0083\u009e4#\u008c\u0012*m:\u008a\u0018\u000ezêO)\fy8_\u0086!\u0096\u0099\u001b\np\u0011ë?þ¡&3Dy<\u001d\u001di4«\u0084\u0003\u0007á\u0083«\u000bß\u0005\u008dÉV8Ýó\u009e\u0000k»ÒMTL,\t£§ ®OCÆm\u0010²5a' Ô\u0006\nÿì\u0005\u001e-øk\u009a\u0010;Çÿg?\fÒæ°êã[\u0007\u009f¯\u001d\u0010g\u0096PhÆ'^dÉ(\u001còÒT.Þ\u0018!:\u0090\u009f\u0099C\u0007¨\u0096Þ\u0082\u0001¦\u009e¤^-{ÝóxÐX¯ Çù:\u0003e_\u008e\u0096ã¶=FÊÏ\n\u009aÚýéLÄ\u0082>}}½§RûÞ )8ÓÂ¸Î\u0095éÏÖ£ñA\u0087¡A\t\u008dÓê±\u0093L\u0084Ï4^lÎ\u0094\u0014j\u009aÕâbluE=\u0002ë\u0011¥\u0011\u0010½\u0081e%½¢ûp\u0089\u001et\u009c ûr:wyß±@B?ÒRhÕè\\\u008f\u0018g¹å=Hìõ\u007f\u0098n{\u008dB¾ \u008a\u0091Â#ôK9)<ß\u0094\u001d\u0010¯fß\u00057±\u009d\u0087\u0015\u0018g«aq\u0099µàd!(ö\rDP\u0001Àî\u009a@÷«\u0011pE/Û{¤\u0084\u000f\u008eüI(\u001d½>%¶\u0082#NØØÖÃ-\u0012\u0086;(\u009bô\u00864¼ ¤`É³'\u001e#P\u0095¼B\u00adÒ\u0085ñ=c.)ê$\u0002\u008f\u0096ÿTO1aÜ\u0096\n/)\u0010s¸sR\u001fü\u0006í±=\u0017\u0091c¤\u0085\u008d(]®7Â.|2f\r5\u009c\u009dª6C:×nÍ\u0015f{\u0000\u007fã¢÷¦\u009f\u0092o9Ç-T&\u0003\u009b\u0010\u0015\u0018g¥°\u0004\u009c\u0001U|xõ©¹¾mú9\tO\u0013\u008ay²[s mº\b-Ð§\u0097Þ¸\u0018>N\u0007¤¬`I\u0093^\u001c\u001aèÆ\u0091¶S\u009eç\u0003É)\u009b\u0010vGR|+\u009fîÿ0\n\u001f·g\u009b\u0017\b\u0010e\u001eá\u001c_JPf\u008a_£\u0019Ú$ÊÖ\u0010uý?6MNP\u0097V² 3N^D\u0081\u0010[BfR¦û&\u009b<Q§\u0005m\u00867\u0013\u0090\u0096íç\u0018Æ:\u0087]\u008b£\u001d¡Pì$å\u00ad©ý\u001b.'?\u0086Tô\u009en<øÿúKW\u0004Ó\u000fÖ?Øà\u0013rÚ*¹Cee\u0092\u009bÌp©M\u0091û±3\u001c\\¬ÚdJs\u0095\u0011\u0099\fÁDPâí\u007fDe^op{\u0006²SÖ×ïX ÇDî\u0010nyöÅ37ô>i=>:*g\u0085N\u0084ù\u0090\u008fUÈT¼d\u0094ÃcQ.å+^¯Å_\u001c\u0019\u0088}¦I\u009c¥Re\u0014ø\u000b½\u0010\u0092\u0082¬¼Fy&\u000bÂJ¢1j&\f$\u0018N\u0005÷±\u0093û$®Qø1\u009cf#Qîj\u0017²\u0091\u000f`\u000fB\u0010ð\u0018õ#á{ÿ ¹~Cæçôú\u001a\u0010 +¼Õ°¥ØBL,j\u009bh.\u009c\u001f";
int var17 = "\u0090Úú\u0010\u008f\u0002&ý¢õ\u001b±\u0094c²é8Ûûy·Á\u001eë_$³¢m\u0081îs\u008d+ÀªW0\u0093ÔRæE\u007f4\u0088©ÉÉªÂàr^sÇ]S\u009f}Åqð¿\u0005-\u0017\"æcò×ÿ \u0012Päð °\u0016È\u009cøp©C\u0018:ê%Å\"éÞaõ¾1úo×K\u0082Uà(\rPh\u001b\u0007ú)\u0095<\u0002Ío9à: \u008dêê\u008e\u001a·ÅÒ{ÜÂÜ¿\u0012yl.É´_ñ|ç\u0010 g²2ÐÁ Ú\u0087*\u0014Èj\"µjÊ=àÚ\u0099~\u009d3z\u001d\f\u0004xÚ\u0012\u0093´\u0010\u009a2îò\t\u0095,\fH9-\u000bbw$\u0082 d°g<\u0082:IÀÑ<q\u001ePña¢Þ#?b»¹Qe\u001bºq\u0002\u000b«ÖX\u0010ºØ\u0018\u000e¿m\u001a¨ê 0\u0005\u0098!%\u008e zÑ~rb®fá®¡_\u0006$W\u0083\u009e4#\u008c\u0012*m:\u008a\u0018\u000ezêO)\fy8_\u0086!\u0096\u0099\u001b\np\u0011ë?þ¡&3Dy<\u001d\u001di4«\u0084\u0003\u0007á\u0083«\u000bß\u0005\u008dÉV8Ýó\u009e\u0000k»ÒMTL,\t£§ ®OCÆm\u0010²5a' Ô\u0006\nÿì\u0005\u001e-øk\u009a\u0010;Çÿg?\fÒæ°êã[\u0007\u009f¯\u001d\u0010g\u0096PhÆ'^dÉ(\u001còÒT.Þ\u0018!:\u0090\u009f\u0099C\u0007¨\u0096Þ\u0082\u0001¦\u009e¤^-{ÝóxÐX¯ Çù:\u0003e_\u008e\u0096ã¶=FÊÏ\n\u009aÚýéLÄ\u0082>}}½§RûÞ )8ÓÂ¸Î\u0095éÏÖ£ñA\u0087¡A\t\u008dÓê±\u0093L\u0084Ï4^lÎ\u0094\u0014j\u009aÕâbluE=\u0002ë\u0011¥\u0011\u0010½\u0081e%½¢ûp\u0089\u001et\u009c ûr:wyß±@B?ÒRhÕè\\\u008f\u0018g¹å=Hìõ\u007f\u0098n{\u008dB¾ \u008a\u0091Â#ôK9)<ß\u0094\u001d\u0010¯fß\u00057±\u009d\u0087\u0015\u0018g«aq\u0099µàd!(ö\rDP\u0001Àî\u009a@÷«\u0011pE/Û{¤\u0084\u000f\u008eüI(\u001d½>%¶\u0082#NØØÖÃ-\u0012\u0086;(\u009bô\u00864¼ ¤`É³'\u001e#P\u0095¼B\u00adÒ\u0085ñ=c.)ê$\u0002\u008f\u0096ÿTO1aÜ\u0096\n/)\u0010s¸sR\u001fü\u0006í±=\u0017\u0091c¤\u0085\u008d(]®7Â.|2f\r5\u009c\u009dª6C:×nÍ\u0015f{\u0000\u007fã¢÷¦\u009f\u0092o9Ç-T&\u0003\u009b\u0010\u0015\u0018g¥°\u0004\u009c\u0001U|xõ©¹¾mú9\tO\u0013\u008ay²[s mº\b-Ð§\u0097Þ¸\u0018>N\u0007¤¬`I\u0093^\u001c\u001aèÆ\u0091¶S\u009eç\u0003É)\u009b\u0010vGR|+\u009fîÿ0\n\u001f·g\u009b\u0017\b\u0010e\u001eá\u001c_JPf\u008a_£\u0019Ú$ÊÖ\u0010uý?6MNP\u0097V² 3N^D\u0081\u0010[BfR¦û&\u009b<Q§\u0005m\u00867\u0013\u0090\u0096íç\u0018Æ:\u0087]\u008b£\u001d¡Pì$å\u00ad©ý\u001b.'?\u0086Tô\u009en<øÿúKW\u0004Ó\u000fÖ?Øà\u0013rÚ*¹Cee\u0092\u009bÌp©M\u0091û±3\u001c\\¬ÚdJs\u0095\u0011\u0099\fÁDPâí\u007fDe^op{\u0006²SÖ×ïX ÇDî\u0010nyöÅ37ô>i=>:*g\u0085N\u0084ù\u0090\u008fUÈT¼d\u0094ÃcQ.å+^¯Å_\u001c\u0019\u0088}¦I\u009c¥Re\u0014ø\u000b½\u0010\u0092\u0082¬¼Fy&\u000bÂJ¢1j&\f$\u0018N\u0005÷±\u0093û$®Qø1\u009cf#Qîj\u0017²\u0091\u000f`\u000fB\u0010ð\u0018õ#á{ÿ ¹~Cæçôú\u001a\u0010 +¼Õ°¥ØBL,j\u009bh.\u009c\u001f"
.length();
char var14 = 16;
int var37 = -1;

label54:
while (true) {
String var38 = var15.substring(++var37, var37 + var14);
byte var43 = -1;

while (true) {
byte[] var19 = var11.doFinal(var38.getBytes("ISO-8859-1"));
String var52 = b(var19).intern();
switch (var43) {
case 0:
var18[var16++] = var52;
if ((var37 += var14) >= var17) {
b = var18;
c = new String[35];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[18];
int var3 = 0;
String var4 = "z\u008eÞC\u008eEOè£8\u0090îºõÖ\u0082Un\u0086¸µ{QÜQ«\u0013Ôÿ\nØ\u0099\u001dñ\u0012NÉeA\u0019«èå\u0084¦<µ[1\u0017t\box\u0085!CÁ·\u0006\u0083=ç=¼\u0096B<\u0016úèD\u000f&k\u007fí\u0011<±$Ý\u008f\u009e¹uK\u0080þ\u0001v=Æ\u001671\u009e¶Ø\u001e: Ö\b×õÉ\u0094\\c\u0099¡ \u0088\u0096Ú\u0015\u0089Dh«LuÝsOû0";
int var5 = "z\u008eÞC\u008eEOè£8\u0090îºõÖ\u0082Un\u0086¸µ{QÜQ«\u0013Ôÿ\nØ\u0099\u001dñ\u0012NÉeA\u0019«èå\u0084¦<µ[1\u0017t\box\u0085!CÁ·\u0006\u0083=ç=¼\u0096B<\u0016úèD\u000f&k\u007fí\u0011<±$Ý\u008f\u009e¹uK\u0080þ\u0001v=Æ\u001671\u009e¶Ø\u001e: Ö\b×õÉ\u0094\\c\u0099¡ \u0088\u0096Ú\u0015\u0089Dh«LuÝsOû0"
.length();
byte var2 = 0;

label36:
while (true) {
byte var47 = var2;
var2 += 8;
byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
long[] var41 = var6;
int var48 = var3++;
long var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var60 = -1;

while (true) {
long var8 = var56;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var63 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var60) {
case 0:
var41[var48] = var63;
if (var2 >= var5) {
f = var6;
g = new Integer[18];
KProperty[] var34 = new KProperty[c<"e">(4371, 8590804553208338558L ^ var20)];
var34[0] = Reflection.property1(
new PropertyReference1Impl(kc.class, b<"q">(18668, 3730803313490694447L ^ var20), b<"q">(10785, 2058245798616036345L ^ var20), 0)
);
var34[1] = Reflection.property1(new PropertyReference1Impl(kc.class, b<"q">(29121, 387588222208911389L ^ var20), b<"q">(13971, 837270320028544856L ^ var20), 0));
var34[2] = Reflection.property1(new PropertyReference1Impl(kc.class, b<"q">(6358, 8607572339848265990L ^ var20), b<"q">(8306, 4317599606146988452L ^ var20), 0));
var34[3] = Reflection.property1(
new PropertyReference1Impl(kc.class, b<"q">(18924, 5164461848190128163L ^ var20), b<"q">(12652, 6411484189601589426L ^ var20), 0)
);
var34[4] = Reflection.property1(
new PropertyReference1Impl(kc.class, b<"q">(24320, 9057023172020176594L ^ var20), b<"q">(10288, 4169287306264474096L ^ var20), 0)
);
var34[5] = Reflection.property1(
new PropertyReference1Impl(kc.class, b<"q">(7197, 2035145432483644872L ^ var20), b<"q">(28271, 7901993981456168857L ^ var20), 0)
);
var34[c<"e">(16094, 133069191131412386L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(kc.class, b<"q">(18976, 8017946530690143223L ^ var20), b<"q">(11175, 8233422249815863918L ^ var20), 0)
);
y = var34;
t = new kc(var22, (char)var23, var24);
G = yp.L(t, b<"q">(8573, 5989482633670850736L ^ var20), fo.SNOW_FLAKE, null, null, c<"e">(27412, 3233314259831415396L ^ var20), null, var32);
K = yp.L(t, b<"q">(14890, 223320135358211053L ^ var20), tz.SYNC, null, null, c<"e">(8717, 7806150992299666294L ^ var20), null, var32);
W = yp.L(t, b<"q">(11293, 5863444709791430103L ^ var20), j.FLY, null, null, c<"e">(8717, 7806150992299666294L ^ var20), null, var32);
jk var42 = t;
short var50 = (short)var29;
String var58 = b<"q">(9163, 7769764474808826384L ^ var20);
Color var62 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"q">(32356, 1131711492152010666L ^ var20));
n = yp.b(var42, var50, var58, var62, null, kc::z, 4, null, var30);
h = yp.L(
t,
b<"q">(16934, 6650320703346449361L ^ var20),
c<"e">(12332, 1038574123989333L ^ var20),
new IntRange(1, c<"e">(21529, 1875206934610304359L ^ var20)),
var27,
null,
null,
c<"e">(19080, 3116950839304799230L ^ var20),
null
);
O = yp.L(
t,
b<"q">(27063, 8011060492012302463L ^ var20),
c<"e">(10364, 2570402565205729544L ^ var20),
new IntRange(5, c<"e">(21779, 3735240360581291104L ^ var20)),
var27,
null,
null,
c<"e">(15143, 4856390127104438877L ^ var20),
null
);
x = yp.k(
t, b<"q">(8170, 8291879118236042790L ^ var20), 1.0F, var25, RangesKt.rangeTo(0.1F, 1.5F), null, null, c<"e">(15143, 4856390127104438877L ^ var20), null
);
e = new ArrayList();
w = new ArrayList();
return;
}
break;
default:
var41[var48] = var63;
if (var2 < var5) {
continue label36;
}

var4 = "\u000föv\u0014\u0014%4*%Ø\u001d/M\u008bLc";
var5 = "\u000föv\u0014\u0014%4*%Ø\u001d/M\u008bLc".length();
var2 = 0;
}

byte var49 = var2;
var2 += 8;
var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
var41 = var6;
var48 = var3++;
var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var60 = 0;
}
}
}

var14 = var15.charAt(var37);
break;
default:
var18[var16++] = var52;
if ((var37 += var14) < var17) {
var14 = var15.charAt(var37);
continue label54;
}

var15 = "ÐQD\u0081\u001d\u000e[Ü\u001cü¥\u0018\u009b\u0084\u0006qÃ\u0088CÑ\u0091UæÞ\u0010P\\¢îÓw¾Ãlj-pûE\\[";
var17 = "ÐQD\u0081\u001d\u000e[Ü\u001cü¥\u0018\u009b\u0084\u0006qÃ\u0088CÑ\u0091UæÞ\u0010P\\¢îÓw¾Ãlj-pûE\\[".length();
var14 = 24;
var37 = -1;
}

var38 = var15.substring(++var37, var37 + var14);
var43 = 0;
}
}
}

public static void S(int var0) {
J = var0;
}

public static int t() {
return J;
}

public static int h() {
int var0 = t();

try {
return var0 == 0 ? 17 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25349;
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
throw new RuntimeException("su/catlean/kc", var10);
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
throw new RuntimeException("su/catlean/kc" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13231;
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
throw new RuntimeException("su/catlean/kc", var14);
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
throw new RuntimeException("su/catlean/kc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
