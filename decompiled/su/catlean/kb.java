package su.catlean;

import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

public final class kb extends _g {
@NotNull
public static final kb D;
static final KProperty[] G;
@NotNull
private static final cq o;
@NotNull
private static final cs b;
@NotNull
private static final c8 i;
@NotNull
private static final cq e;
@NotNull
private static final cs J;
@NotNull
private static final class_2960 l;
@Nullable
private static class_243 n;
@Nullable
private static class_243 t;
@NotNull
private static final List N;
private static final long a = yz.a(-7427343753510430064L, -7004497900810951094L, MethodHandles.lookup().lookupClass()).a(173270329073630L);
private static final String[] c;
private static final String[] d;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map j;

private kb(int var1, long var2) {
long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
long var6 = var4 ^ 114566792996742L;
super(b<"t">(9399, 1459828498679743725L ^ var4), jt.F(), null, 4, null, var6);
}

private final boolean Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 100520922466533L;
return (Boolean)o.E(this, var3, G[0]);
}

private final Color Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 68873439562450L;
return (Color)b.E(this, var3, G[1]);
}

private final int D(byte var1, long var2) {
long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
long var6 = var4 ^ 39809495494906L;
return ((Number)i.E(this, var6, G[2])).intValue();
}

private final boolean z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 120086381716640L;
return (Boolean)e.E(this, var3, G[3]);
}

private final Color g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 9596307010105L;
return (Color)J.E(this, var3, G[4]);
}

@Flow
private final void s(Render2DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kb.a J
// 003: ldc2_w 70908801664743
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 100954731627014
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 100729198509682
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 90856470622479
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 101020994204255
// 022: lxor
// 023: dup2
// 024: bipush 16
// 026: lushr
// 027: lstore 10
// 029: dup2
// 02a: bipush 48
// 02c: lshl
// 02d: bipush 48
// 02f: lushr
// 030: l2i
// 031: istore 12
// 033: pop2
// 034: dup2
// 035: ldc2_w 120442846539331
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 31657035020119
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 107554236222190
// 046: lxor
// 047: dup2
// 048: bipush 32
// 04a: lushr
// 04b: l2i
// 04c: istore 17
// 04e: dup2
// 04f: bipush 32
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 18
// 058: dup2
// 059: bipush 48
// 05b: lshl
// 05c: bipush 48
// 05e: lushr
// 05f: l2i
// 060: istore 19
// 062: pop2
// 063: dup2
// 064: ldc2_w 40174551366169
// 067: lxor
// 068: dup2
// 069: bipush 56
// 06b: lushr
// 06c: l2i
// 06d: istore 20
// 06f: dup2
// 070: bipush 8
// 072: lshl
// 073: bipush 8
// 075: lushr
// 076: lstore 21
// 078: pop2
// 079: dup2
// 07a: ldc2_w 28046951311917
// 07d: lxor
// 07e: lstore 23
// 080: dup2
// 081: ldc2_w 72674528084289
// 084: lxor
// 085: dup2
// 086: bipush 48
// 088: lushr
// 089: l2i
// 08a: istore 25
// 08c: dup2
// 08d: bipush 16
// 08f: lshl
// 090: bipush 32
// 092: lushr
// 093: l2i
// 094: istore 26
// 096: dup2
// 097: bipush 48
// 099: lshl
// 09a: bipush 48
// 09c: lushr
// 09d: l2i
// 09e: istore 27
// 0a0: pop2
// 0a1: dup2
// 0a2: ldc2_w 135486113738836
// 0a5: lxor
// 0a6: lstore 28
// 0a8: dup2
// 0a9: ldc2_w 68302259666993
// 0ac: lxor
// 0ad: lstore 30
// 0af: pop2
// 0b0: ldc2_w -6760785710827380763
// 0b3: lload 2
// 0b4: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: astore 32
// 0bb: lload 28
// 0bd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c0: getfield net/minecraft/class_746.field_6235 I
// 0c3: aload 32
// 0c5: ifnonnull 175
// 0c8: ifle 16f
// 0cb: goto 0d8
// 0ce: ldc2_w -6711227938448689326
// 0d1: lload 2
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: getstatic su/catlean/kb.n Lnet/minecraft/class_243;
// 0db: aload 32
// 0dd: ifnonnull 13f
// 0e0: goto 0ed
// 0e3: ldc2_w -6711227938448689326
// 0e6: lload 2
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: ifnull 12f
// 0f0: goto 0fd
// 0f3: ldc2_w -6711227938448689326
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: getstatic su/catlean/kb.N Ljava/util/List;
// 100: new su/catlean/m3
// 103: dup
// 104: getstatic su/catlean/kb.n Lnet/minecraft/class_243;
// 107: dup
// 108: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 10b: aconst_null
// 10c: lload 23
// 10e: bipush 2
// 10f: aconst_null
// 110: invokespecial su/catlean/m3.<init> (Lnet/minecraft/class_243;Lsu/catlean/fd;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 113: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 118: pop
// 119: aconst_null
// 11a: putstatic su/catlean/kb.n Lnet/minecraft/class_243;
// 11d: aload 32
// 11f: ifnull 16f
// 122: goto 12f
// 125: ldc2_w -6711227938448689326
// 128: lload 2
// 129: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: athrow
// 12f: getstatic su/catlean/kb.t Lnet/minecraft/class_243;
// 132: goto 13f
// 135: ldc2_w -6711227938448689326
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: ifnull 16f
// 142: getstatic su/catlean/kb.N Ljava/util/List;
// 145: new su/catlean/m3
// 148: dup
// 149: getstatic su/catlean/kb.t Lnet/minecraft/class_243;
// 14c: dup
// 14d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 150: aconst_null
// 151: lload 23
// 153: bipush 2
// 154: aconst_null
// 155: invokespecial su/catlean/m3.<init> (Lnet/minecraft/class_243;Lsu/catlean/fd;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 158: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 15d: pop
// 15e: aconst_null
// 15f: putstatic su/catlean/kb.t Lnet/minecraft/class_243;
// 162: goto 16f
// 165: ldc2_w -6711227938448689326
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 0
// 170: lload 13
// 172: invokespecial su/catlean/kb.z (J)Z
// 175: aload 32
// 177: ifnonnull 1a9
// 17a: ifeq 1a3
// 17d: goto 18a
// 180: ldc2_w -6711227938448689326
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: aload 0
// 18b: lload 10
// 18d: ldc 10.0
// 18f: fconst_2
// 190: iload 12
// 192: i2s
// 193: invokevirtual su/catlean/kb.U (JFFS)V
// 196: goto 1a3
// 199: ldc2_w -6711227938448689326
// 19c: lload 2
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 0
// 1a4: lload 4
// 1a6: invokespecial su/catlean/kb.Y (J)Z
// 1a9: aload 32
// 1ab: ifnonnull 2bc
// 1ae: ifeq 2aa
// 1b1: goto 1be
// 1b4: ldc2_w -6711227938448689326
// 1b7: lload 2
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: getstatic su/catlean/kb.N Ljava/util/List;
// 1c1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 1c6: astore 33
// 1c8: aload 33
// 1ca: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1cf: ifeq 2aa
// 1d2: aload 33
// 1d4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d9: checkcast su/catlean/m3
// 1dc: astore 34
// 1de: aload 34
// 1e0: invokevirtual su/catlean/m3.n ()Lsu/catlean/fd;
// 1e3: lload 8
// 1e5: fconst_1
// 1e6: invokevirtual su/catlean/fd.B (JF)V
// 1e9: lload 6
// 1eb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1ee: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 1f1: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 1f4: i2f
// 1f5: fconst_2
// 1f6: fdiv
// 1f7: fstore 35
// 1f9: lload 6
// 1fb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1fe: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 201: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 204: i2f
// 205: fconst_2
// 206: fdiv
// 207: fstore 36
// 209: new net/minecraft/class_4587
// 20c: dup
// 20d: invokespecial net/minecraft/class_4587.<init> ()V
// 210: astore 37
// 212: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 215: aload 34
// 217: invokevirtual su/catlean/m3.a ()Lnet/minecraft/class_243;
// 21a: lload 15
// 21c: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 21f: invokevirtual su/catlean/_w.q ()F
// 222: lload 28
// 224: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 227: invokevirtual net/minecraft/class_746.method_36454 ()F
// 22a: fsub
// 22b: fstore 38
// 22d: aload 37
// 22f: fload 35
// 231: fload 36
// 233: fconst_0
// 234: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 237: aload 37
// 239: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 23c: fload 38
// 23e: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 243: checkcast org/joml/Quaternionfc
// 246: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 249: aload 37
// 24b: fload 35
// 24d: fneg
// 24e: fload 36
// 250: fneg
// 251: fconst_0
// 252: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 255: aload 0
// 256: aload 37
// 258: fload 35
// 25a: fload 36
// 25c: aload 0
// 25d: iload 20
// 25f: i2b
// 260: lload 21
// 262: invokespecial su/catlean/kb.D (BJ)I
// 265: i2f
// 266: iload 17
// 268: swap
// 269: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 26c: aload 0
// 26d: lload 30
// 26f: invokespecial su/catlean/kb.Q (J)Ljava/awt/Color;
// 272: fconst_1
// 273: aload 34
// 275: invokevirtual su/catlean/m3.n ()Lsu/catlean/fd;
// 278: invokevirtual su/catlean/fd.a ()F
// 27b: fsub
// 27c: iload 25
// 27e: i2c
// 27f: swap
// 280: iload 26
// 282: swap
// 283: iload 27
// 285: i2s
// 286: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 289: iload 18
// 28b: swap
// 28c: iload 19
// 28e: i2c
// 28f: swap
// 290: invokevirtual su/catlean/kb.S (Lnet/minecraft/class_4587;FFIFICLjava/awt/Color;)V
// 293: aload 32
// 295: ifnonnull 2bd
// 298: aload 32
// 29a: ifnull 1c8
// 29d: goto 2aa
// 2a0: ldc2_w -6711227938448689326
// 2a3: lload 2
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: getstatic su/catlean/kb.N Ljava/util/List;
// 2ad: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/kb.n (Lsu/catlean/m3;)Z, (Lsu/catlean/m3;)Ljava/lang/Boolean; ]
// 2b2: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/kb.T (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 2b7: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 2bc: pop
// 2bd: return
}

public final void S(@NotNull class_4587 matrices, float x, float y, int a, float size, int a, char a, @NotNull Color color) {
long var9 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var11 = var9 ^ 116847651515481L;
Intrinsics.checkNotNullParameter(matrices, b<"t">(26338, 5298416795602009597L ^ var9));
Intrinsics.checkNotNullParameter(color, b<"t">(30269, 1994492766155943205L ^ var9));
Matrix4f var10000 = matrices.method_23760().method_23761();
Intrinsics.checkNotNullExpressionValue(var10000, b<"t">(32231, 2125741238283740919L ^ var9));
Matrix4f var14 = var10000;
vm.a<"Å">(945398401511223511L, var9);
jl.y.D(var14, n1.o(), x, y, size, size, color, color, color, color, true, gi.HALO.o(), gi.HALO.v(), gi.HALO.L(), var11, gi.HALO.w());

try {
if (vm.a<"Å">(961713236043305929L, var9) != null) {
vm.a<"Å">(new String[3], 974028557493057320L, var9);
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 1003891904905091168L, var9);
}
}

public final void U(long a, float threshold, float power, short a) {
long var6 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
long var8 = var6 ^ 6927761205745L;
long var10 = var6 ^ 99566600468098L;
long var12 = var6 ^ 38554337954328L;
long var14 = var6 ^ 111107929315109L;
long var16 = var6 ^ 13207921976047L;
long var10001 = var6 ^ 86690159706802L;
int var18 = (int)((var6 ^ 86690159706802L) >>> 48);
int var19 = (int)((var6 ^ 86690159706802L) << 16 >>> 48);
int var20 = (int)(var10001 << 32 >>> 32);
long var21 = (var6 ^ 93927952011708L) >>> 32;
int var23 = (int)((var6 ^ 93927952011708L) << 32 >>> 32);
long var24 = var6 ^ 96632563514852L;
long var26 = var6 ^ 62805515694158L;
long var28 = var6 ^ 57187645911582L;
long var30 = var6 ^ 94383883186009L;
long var32 = var6 ^ 42784166307799L;
String[] var10000 = vm.a<"Å">(3868452336460253286L, var6);
float var40 = zf.v(var32).method_6032() + zf.v(var32).method_6067();
String[] var39 = var10000;

label72: {
label71: {
try {
float var58;
var53 = (var58 = var40 - threshold) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1);
if (var39 != null) {
break label72;
}

if (var53 <= 0) {
break label71;
}
} catch (NumberFormatException var51) {
throw vm.a<"Å">(var51, 3845986598737944785L, var6);
}

var53 = 0;
break label72;
}

var53 = 1;
}

int var41 = var53;

label62: {
try {
if (var41 != 0) {
var54 = var40 / threshold;
break label62;
}
} catch (NumberFormatException var50) {
throw vm.a<"Å">(var50, 3845986598737944785L, var6);
}

var54 = 1.0F;
}

float var42 = Math.abs(var54 - 1.0F) * power;

label54: {
label53: {
label52: {
try {
var55 = var40;
if (axx < 0L) {
break label54;
}

var57 = 4.0F;
if (var39 != null) {
break label53;
}

if (!(var40 <= 4.0F)) {
break label52;
}
} catch (NumberFormatException var49) {
throw vm.a<"Å">(var49, 3845986598737944785L, var6);
}

var42 += Math.abs(0.2F * (float)Math.sin((float)Math.toRadians(zf.v(var32).field_6012 * 16.0 + jl.y.K(var24))));
}

var55 = var42;
var57 = 0.0F;
}

var55 = RangesKt.coerceIn(var55, var57, 1.0F);
}

var42 = var55;
Color var43 = new Color(
(int)((1.0F - jl.y.y(this.g(var30), (char)var18, (short)var19, var20)) * var42 * c<"g">(13050, 4166973138854311560L ^ var6)),
(int)((1.0F - jl.y.M(var12, this.g(var30))) * var42 * c<"g">(4307, 6858109196311745698L ^ var6)),
(int)((1.0F - jl.y.r(this.g(var30), var21, var23)) * var42 * c<"g">(4307, 6858109196311745698L ^ var6)),
c<"g">(4307, 6858109196311745698L ^ var6)
);
float var44 = zf.F(var8).method_22683().method_4486();
float var45 = zf.F(var8).method_22683().method_4502();
GpuTextureView var56 = zf.F(var8).method_1531().method_4619(l).method_71659();
Intrinsics.checkNotNullExpressionValue(var56, b<"t">(12097, 5466539770411961577L ^ var6));
GpuTextureView var46 = var56;
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, b<"t">(8129, 238825130954914918L ^ var6));
int var10005 = c<"g">(29160, 3019716171046925723L ^ var6);
Object var34 = null;
int var35 = var10005;
boolean var36 = false;
byte var37 = 0;
VertexFormat var38 = var10002;
g7 var47 = new g7(var10, var38, var37, var36, var35, (DefaultConstructorMarker)var34);

try {
g7.j(var47, 0.0F, var45, 0.0F, 4, var26, null).j(0.0F, var28, 1.0F).n(var43, var14);
g7.j(var47, var44, var45, 0.0F, 4, var26, null).j(1.0F, var28, 1.0F).n(var43, var14);
g7.j(var47, var44, 0.0F, 0.0F, 4, var26, null).j(1.0F, var28, 0.0F).n(var43, var14);
g7.j(var47, 0.0F, 0.0F, 0.0F, 4, var26, null).j(0.0F, var28, 0.0F).n(var43, var14);
g7.R(
var16,
var47,
b6.R.j(),
null,
null,
null,
null,
MapsKt.mapOf(TuplesKt.to(b<"t">(6585, 7754413663038142994L ^ var6), var46)),
c<"g">(17267, 7929344951710222087L ^ var6),
null
);
if (axx > 0L && var39 != null) {
vm.a<"Å">(new _g[2], 3863997895349583778L, var6);
}
} catch (NumberFormatException var48) {
throw vm.a<"Å">(var48, 3845986598737944785L, var6);
}
}

@Flow
private final void r(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kb.a J
// 003: ldc2_w 14252710815372
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 93457968025662
// 00d: lxor
// 00e: dup2
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 8
// 018: lshl
// 019: bipush 8
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 61240252747839
// 023: lxor
// 024: lstore 7
// 026: pop2
// 027: ldc2_w 164260150708043662
// 02a: lload 2
// 02b: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 030: astore 9
// 032: aload 1
// 033: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 036: instanceof net/minecraft/class_2743
// 039: aload 9
// 03b: ifnonnull 151
// 03e: ifeq 138
// 041: goto 04e
// 044: ldc2_w 195802356346656569
// 047: lload 2
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: aload 1
// 04f: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 052: astore 10
// 054: aload 10
// 056: checkcast net/minecraft/class_2743
// 059: invokevirtual net/minecraft/class_2743.method_11818 ()I
// 05c: aload 9
// 05e: ifnonnull 151
// 061: lload 7
// 063: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 066: invokevirtual net/minecraft/class_746.method_5628 ()I
// 069: if_icmpne 138
// 06c: goto 079
// 06f: ldc2_w 195802356346656569
// 072: lload 2
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: aload 10
// 07b: checkcast net/minecraft/class_2743
// 07e: invokevirtual net/minecraft/class_2743.method_73085 ()Lnet/minecraft/class_243;
// 081: getfield net/minecraft/class_243.field_1352 D
// 084: dconst_0
// 085: dcmpg
// 086: aload 9
// 088: ifnonnull 0a9
// 08b: goto 098
// 08e: ldc2_w 195802356346656569
// 091: lload 2
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: ifne 0ac
// 09b: goto 0a8
// 09e: ldc2_w 195802356346656569
// 0a1: lload 2
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: bipush 1
// 0a9: goto 0ad
// 0ac: bipush 0
// 0ad: ifne 138
// 0b0: aload 10
// 0b2: checkcast net/minecraft/class_2743
// 0b5: invokevirtual net/minecraft/class_2743.method_73085 ()Lnet/minecraft/class_243;
// 0b8: getfield net/minecraft/class_243.field_1350 D
// 0bb: dconst_0
// 0bc: dcmpg
// 0bd: aload 9
// 0bf: ifnonnull 0e0
// 0c2: goto 0cf
// 0c5: ldc2_w 195802356346656569
// 0c8: lload 2
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: ifne 0e3
// 0d2: goto 0df
// 0d5: ldc2_w 195802356346656569
// 0d8: lload 2
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: bipush 1
// 0e0: goto 0e4
// 0e3: bipush 0
// 0e4: ifne 138
// 0e7: new net/minecraft/class_243
// 0ea: dup
// 0eb: aload 10
// 0ed: checkcast net/minecraft/class_2743
// 0f0: invokevirtual net/minecraft/class_2743.method_73085 ()Lnet/minecraft/class_243;
// 0f3: getfield net/minecraft/class_243.field_1352 D
// 0f6: dneg
// 0f7: aload 10
// 0f9: checkcast net/minecraft/class_2743
// 0fc: invokevirtual net/minecraft/class_2743.method_73085 ()Lnet/minecraft/class_243;
// 0ff: getfield net/minecraft/class_243.field_1351 D
// 102: aload 10
// 104: checkcast net/minecraft/class_2743
// 107: invokevirtual net/minecraft/class_2743.method_73085 ()Lnet/minecraft/class_243;
// 10a: getfield net/minecraft/class_243.field_1350 D
// 10d: dneg
// 10e: invokespecial net/minecraft/class_243.<init> (DDD)V
// 111: aload 0
// 112: lload 7
// 114: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 117: iload 4
// 119: i2b
// 11a: swap
// 11b: lload 5
// 11d: dup2_x1
// 11e: pop2
// 11f: checkcast net/minecraft/class_1297
// 122: invokevirtual su/catlean/kb.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 125: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 128: putstatic su/catlean/kb.t Lnet/minecraft/class_243;
// 12b: goto 138
// 12e: ldc2_w 195802356346656569
// 131: lload 2
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: aload 1
// 139: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 13c: aload 9
// 13e: ifnonnull 165
// 141: instanceof net/minecraft/class_2664
// 144: goto 151
// 147: ldc2_w 195802356346656569
// 14a: lload 2
// 14b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 150: athrow
// 151: ifeq 192
// 154: aload 1
// 155: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 158: goto 165
// 15b: ldc2_w 195802356346656569
// 15e: lload 2
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: astore 10
// 167: new net/minecraft/class_243
// 16a: dup
// 16b: aload 10
// 16d: checkcast net/minecraft/class_2664
// 170: invokevirtual net/minecraft/class_2664.comp_2883 ()Lnet/minecraft/class_243;
// 173: getfield net/minecraft/class_243.field_1352 D
// 176: aload 10
// 178: checkcast net/minecraft/class_2664
// 17b: invokevirtual net/minecraft/class_2664.comp_2883 ()Lnet/minecraft/class_243;
// 17e: getfield net/minecraft/class_243.field_1351 D
// 181: aload 10
// 183: checkcast net/minecraft/class_2664
// 186: invokevirtual net/minecraft/class_2664.comp_2883 ()Lnet/minecraft/class_243;
// 189: getfield net/minecraft/class_243.field_1350 D
// 18c: invokespecial net/minecraft/class_243.<init> (DDD)V
// 18f: putstatic su/catlean/kb.n Lnet/minecraft/class_243;
// 192: return
}

private static final boolean G() {
long var0 = a ^ 117669721356635L;
long var2 = var0 ^ 123875362127290L;
return D.Y(var2);
}

private static final boolean p() {
long var0 = a ^ 70492390176383L;
long var2 = var0 ^ 100812259177118L;
return D.Y(var2);
}

private static final boolean L() {
long var0 = a ^ 17513032134060L;
long var2 = var0 ^ 37498939311368L;
return D.z(var2);
}

private static final boolean n(m3 var0) {
long var1 = a ^ 113406969890095L;
Intrinsics.checkNotNullParameter(var0, b<"t">(26540, 5014472604008583260L ^ var1));
return var0.n().x();
}

private static final boolean T(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 126034206619642L;
int var22 = (int)((var20 ^ 65590556541093L) >>> 32);
long var23 = (var20 ^ 65590556541093L) << 32 >>> 32;
long var25 = var20 ^ 86269550777588L;
long var27 = var20 ^ 107552939792786L;
int var29 = (int)((var20 ^ 66319189581409L) >>> 48);
long var30 = (var20 ^ 66319189581409L) << 16 >>> 16;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[27];
int var16 = 0;
String var15 = "RFR\u0011\u0017¾\u001e!uÁ\u0093ªÚÕ?;\u0098£®\u0004°ø|Á\u0081iv\u001cE\u0088T¬ PÙ~fª|B\u0001\u0089xXÄ\u0012;i\u008fþ\u001c\u0096\u0083BDc\u0005è\n³Õ\u008cH\u0019ó «ý\u008bÚÀ{*\u001c3\u0085ÿ5pÞ\u0013b\u0006\u001f{\u00ad\u0006/\u009e\u009eÝ\u0098U\u0011öogD Í\u0001xZµa7U\u0086êqqåÈÜ,Û/©Ò\u001c\u0083_\u0090RÀY¨ÿí\u0091ö8\u0082\u0007\u0080ô?\u0095^¥ù\u0019l\u0099\u0019`\u0086\u0094ÿ\n\u0016\u000bO¬\u008fµdð;¡§M[ù¾\u0013þ3d\t©AÒ`}^ÀwmNQC\u00936\u0019ÁG\u008a\u0018\u0098:p²\u000f.àìÖ©s©\u0090îÿ\u0005×çìÍ¦\u008a©;(£`r\u0017\u0098ÓK\u0085{-Z\u0095ã\u009e}N\\UÒò¶ç\u008d0¹5Ê/V·DJà«Éà\u0007pÒ'\u0010aÐØ\u008bçï\"\u0010¢ô\b±Fà\u0088ü8c\u0007×\u008b?\u0013¹ºÍ]öY\u008b_äJaw÷CôªáQ\u009c^øÔÉ¼S\u008b\u0089hëoÙ{ô\u0095Õ\u0098Bò\u0089»é¡d\u0081bÑ25\u0007Ú(gì\u0016vJ¶,c\u0016\u001bXg©\u0093\u0088dU:|º?Æî«wÿaÕ\u001eE»>Ý\u0084¤\u009c®xËÿ\u0010e\u0011®ã=i\u0017\u0010\u001ac\u00899\u000fd\u009az \bSP+\u0080èGi7[d'1¾Þ7R¥*\u0005éÆ\u000býRhfÃ\th¯\u009c\u0018Í\u0019\u0096P°_\u0002;=\u00017U\u0015r´¯qÊ\b\u009c<kts(\u008aù°~\nà\u0097)\u000fb;\u0095Ë£¤B £¶AxM¢8£\n\u009cÞ!ÂÍtr{ÈåN`\u0005\u0013\u00107á\\¤¥HÓ@2»õ\u001bØJ+| @º¥\u001dÔöñ¶ Ue½.SW\u0091\u001cû½\u001b¿êh\u0000i\u0089\u007f\u0086a[ý\u001e\u0018\u0090wÆw;/&ÇS\u0006ûÒV\u0006\u000bR\u009b=\u0000¼ïT\u0011ü\u0010\u0081M·\u009a\u009bD\u0080\u0019}P±\u008aàí\u0082q@xø+ô=\"9Ö\u0016ÝÞ\u0080ï×\u0000Ôw÷\r\u0083{c¬R¬\u0091à{«©&\u008f*\u0012\u0085Ü\u0090\u0006È\u0095\u009bóÕ9x\u0087O\u0080OeÈY|\u0012\u001fßBÛû\b ùï  \u008fÒ*ÊY\u0015\u0011\u008eRÂ¡\u0098È\u001fL0.µ\t\u009c×¼\u008e]\u0011Ù*o<)³\u00188\u001e,d÷åù \u0091\u009aïd\t\u0089Ë\u0090ÉÕ\u0012\rÕÿ©üEÙ\u0001\u009fPI$5¹Ú\u0013úÒ\nb®¤P÷C(\foÛ«\u0017NzË%i¡À\u0010XÍF\u0095Â\u000fUªþà¤øc\u0002\u0094Ù\u0010snå\u001a\u0007\u0003\u0018ðÃg vRÕÔy\u0010ñ\u009c\u0000Ä±=Éh.¦^|]ó¡Õ ÂÉp,\u009d\u00052çæÝû\r]¢¿Ò,àHèßM\u0089\u0014\u0085\u0091\u001d¹\u000e\u009cÊ+";
int var17 = "RFR\u0011\u0017¾\u001e!uÁ\u0093ªÚÕ?;\u0098£®\u0004°ø|Á\u0081iv\u001cE\u0088T¬ PÙ~fª|B\u0001\u0089xXÄ\u0012;i\u008fþ\u001c\u0096\u0083BDc\u0005è\n³Õ\u008cH\u0019ó «ý\u008bÚÀ{*\u001c3\u0085ÿ5pÞ\u0013b\u0006\u001f{\u00ad\u0006/\u009e\u009eÝ\u0098U\u0011öogD Í\u0001xZµa7U\u0086êqqåÈÜ,Û/©Ò\u001c\u0083_\u0090RÀY¨ÿí\u0091ö8\u0082\u0007\u0080ô?\u0095^¥ù\u0019l\u0099\u0019`\u0086\u0094ÿ\n\u0016\u000bO¬\u008fµdð;¡§M[ù¾\u0013þ3d\t©AÒ`}^ÀwmNQC\u00936\u0019ÁG\u008a\u0018\u0098:p²\u000f.àìÖ©s©\u0090îÿ\u0005×çìÍ¦\u008a©;(£`r\u0017\u0098ÓK\u0085{-Z\u0095ã\u009e}N\\UÒò¶ç\u008d0¹5Ê/V·DJà«Éà\u0007pÒ'\u0010aÐØ\u008bçï\"\u0010¢ô\b±Fà\u0088ü8c\u0007×\u008b?\u0013¹ºÍ]öY\u008b_äJaw÷CôªáQ\u009c^øÔÉ¼S\u008b\u0089hëoÙ{ô\u0095Õ\u0098Bò\u0089»é¡d\u0081bÑ25\u0007Ú(gì\u0016vJ¶,c\u0016\u001bXg©\u0093\u0088dU:|º?Æî«wÿaÕ\u001eE»>Ý\u0084¤\u009c®xËÿ\u0010e\u0011®ã=i\u0017\u0010\u001ac\u00899\u000fd\u009az \bSP+\u0080èGi7[d'1¾Þ7R¥*\u0005éÆ\u000býRhfÃ\th¯\u009c\u0018Í\u0019\u0096P°_\u0002;=\u00017U\u0015r´¯qÊ\b\u009c<kts(\u008aù°~\nà\u0097)\u000fb;\u0095Ë£¤B £¶AxM¢8£\n\u009cÞ!ÂÍtr{ÈåN`\u0005\u0013\u00107á\\¤¥HÓ@2»õ\u001bØJ+| @º¥\u001dÔöñ¶ Ue½.SW\u0091\u001cû½\u001b¿êh\u0000i\u0089\u007f\u0086a[ý\u001e\u0018\u0090wÆw;/&ÇS\u0006ûÒV\u0006\u000bR\u009b=\u0000¼ïT\u0011ü\u0010\u0081M·\u009a\u009bD\u0080\u0019}P±\u008aàí\u0082q@xø+ô=\"9Ö\u0016ÝÞ\u0080ï×\u0000Ôw÷\r\u0083{c¬R¬\u0091à{«©&\u008f*\u0012\u0085Ü\u0090\u0006È\u0095\u009bóÕ9x\u0087O\u0080OeÈY|\u0012\u001fßBÛû\b ùï  \u008fÒ*ÊY\u0015\u0011\u008eRÂ¡\u0098È\u001fL0.µ\t\u009c×¼\u008e]\u0011Ù*o<)³\u00188\u001e,d÷åù \u0091\u009aïd\t\u0089Ë\u0090ÉÕ\u0012\rÕÿ©üEÙ\u0001\u009fPI$5¹Ú\u0013úÒ\nb®¤P÷C(\foÛ«\u0017NzË%i¡À\u0010XÍF\u0095Â\u000fUªþà¤øc\u0002\u0094Ù\u0010snå\u001a\u0007\u0003\u0018ðÃg vRÕÔy\u0010ñ\u009c\u0000Ä±=Éh.¦^|]ó¡Õ ÂÉp,\u009d\u00052çæÝû\r]¢¿Ò,àHèßM\u0089\u0014\u0085\u0091\u001d¹\u000e\u009cÊ+"
.length();
char var14 = ' ';
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var52 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var52;
if ((var35 += var14) >= var17) {
c = var18;
d = new String[27];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[10];
int var3 = 0;
String var4 = "Z\u0005ùãá<\u0080½{\u0012¿øÚ\f\u0094\u008a\u0084Ecû~ÜK\u001dµG>_ÿU\u009a\u0089}8~\tw\u0010\u009eMM!ÇeÈç\u0011¥½F\u0010ánRÓnE0ìjËG\u008c!";
int var5 = "Z\u0005ùãá<\u0080½{\u0012¿øÚ\f\u0094\u008a\u0084Ecû~ÜK\u001dµG>_ÿU\u009a\u0089}8~\tw\u0010\u009eMM!ÇeÈç\u0011¥½F\u0010ánRÓnE0ìjËG\u008c!".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
var10001 = var3++;
long var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var61 = -1;

while (true) {
long var8 = var56;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var65 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var61) {
case 0:
var39[var10001] = var65;
if (var2 >= var5) {
g = var6;
h = new Integer[10];
KProperty[] var32 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(kb.class, b<"t">(26322, 2193341291248231412L ^ var20), b<"t">(30625, 7465017612577223312L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kb.class, b<"t">(12384, 3107766543312385362L ^ var20), b<"t">(1520, 9133675629754958034L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kb.class, b<"t">(14912, 2512533809971625851L ^ var20), b<"t">(13982, 2637296629917479843L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kb.class, b<"t">(1394, 4381626167703453781L ^ var20), b<"t">(24724, 8933862073779529127L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kb.class, b<"t">(28501, 170192899698961001L ^ var20), b<"t">(30419, 7646596105376936935L ^ var20), 0))
};
G = var32;
D = new kb(var22, var23);
o = yp.t(D, b<"t">(9109, 2623898225514211007L ^ var20), true, var25, null, null, c<"g">(11064, 7073873676322556368L ^ var20), null);
jk var40 = D;
short var49 = (short)var29;
String var58 = b<"t">(9679, 5396361466211164391L ^ var20);
Color var63 = Color.RED;
Intrinsics.checkNotNullExpressionValue(Color.RED, b<"t">(14852, 298889748669660986L ^ var20));
b = yp.b(var40, var49, var58, var63, null, kb::G, 4, null, var30);
i = yp.L(
D,
b<"t">(3405, 4198628273268836461L ^ var20),
c<"g">(20677, 5440885154072539682L ^ var20),
new IntRange(c<"g">(18840, 318077064403692403L ^ var20), c<"g">(4280, 5500327925953884758L ^ var20)),
var27,
null,
kb::p,
c<"g">(9017, 7876412259519873488L ^ var20),
null
);
e = yp.t(D, b<"t">(28055, 1681087430199355565L ^ var20), true, var25, null, null, c<"g">(30982, 7693572567289175008L ^ var20), null);
jk var41 = D;
var49 = (short)var29;
String var59 = b<"t">(13431, 4092625271633473886L ^ var20);
Color var64 = Color.RED;
Intrinsics.checkNotNullExpressionValue(Color.RED, b<"t">(6467, 2289388937046514786L ^ var20));
J = yp.b(var41, var49, var59, var64, null, kb::L, 4, null, var30);
class_2960 var42 = class_2960.method_60656(b<"t">(10846, 1946517400982810490L ^ var20));
Intrinsics.checkNotNullExpressionValue(var42, b<"t">(1895, 418577816208720479L ^ var20));
l = var42;
N = new ArrayList();
return;
}
break;
default:
var39[var10001] = var65;
if (var2 < var5) {
continue label36;
}

var4 = "îPP=Õ£ÇõmÚÚç\u001c\u009f\u0095ö";
var5 = "îPP=Õ£ÇõmÚÚç\u001c\u009f\u0095ö".length();
var2 = 0;
}

byte var48 = var2;
var2 += 8;
var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
var39 = var6;
var10001 = var3++;
var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var61 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var52;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "Ì\nåú\u0005BQ ±Á¨®GÚkªNa~&E\u0093â=\u0010ÕÉ£ð\u0004ÅÃ\u001e\u0082\u009db\u0086p&Ïc";
var17 = "Ì\nåú\u0005BQ ±Á¨®GÚkªNa~&E\u0093â=\u0010ÕÉ£ð\u0004ÅÃ\u001e\u0082\u009db\u0086p&Ïc".length();
var14 = 24;
var35 = -1;
}

var36 = var15.substring(++var35, var35 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22294;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/kb", var10);
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
throw new RuntimeException("su/catlean/kb" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28872;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/kb", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/kb" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
