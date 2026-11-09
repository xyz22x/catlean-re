package su.catlean;

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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class dh {
@NotNull
public static final dh S;
@NotNull
private static final ArrayList g;
private static _g[] n;
private static final long a = yz.a(4183442388880205054L, 1249731790012697374L, MethodHandles.lookup().lookupClass()).a(198072916641736L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

private dh() {
}

@Flow
private final void e(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dh.a J
// 003: ldc2_w 49931731380712
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 127134108523689
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 52099799073754
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 35944068546217
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
// 039: ldc2_w 134069495076791
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 57665160435871
// 043: lxor
// 044: lstore 13
// 046: pop2
// 047: ldc2_w 4659935896210091690
// 04a: lload 2
// 04b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: astore 20
// 052: aload 20
// 054: ifnonnull 0db
// 057: getstatic su/catlean/dh.g Ljava/util/ArrayList;
// 05a: invokevirtual java/util/ArrayList.isEmpty ()Z
// 05d: ifeq 078
// 060: goto 06d
// 063: ldc2_w 4624017934239006629
// 066: lload 2
// 067: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: athrow
// 06d: return
// 06e: ldc2_w 4624017934239006629
// 071: lload 2
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: aload 1
// 079: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 07c: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 07f: aload 1
// 080: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 083: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 086: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 089: invokevirtual su/catlean/zi.b ()F
// 08c: fneg
// 08d: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 092: dup
// 093: sipush 11215
// 096: ldc2_w 3984371843186289800
// 099: lload 2
// 09a: lxor
// 09b: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/dh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a3: checkcast org/joml/Quaternionfc
// 0a6: lload 13
// 0a8: dup2_x1
// 0a9: pop2
// 0aa: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 0ad: aload 1
// 0ae: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 0b1: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 0b4: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0b7: invokevirtual su/catlean/zi.F ()F
// 0ba: fneg
// 0bb: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 0c0: dup
// 0c1: sipush 16873
// 0c4: ldc2_w 3907333247584372394
// 0c7: lload 2
// 0c8: lxor
// 0c9: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/dh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d1: checkcast org/joml/Quaternionfc
// 0d4: lload 13
// 0d6: dup2_x1
// 0d7: pop2
// 0d8: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 0db: lload 4
// 0dd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0e0: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 0e3: invokestatic su/catlean/n1.o ()Lnet/minecraft/class_2960;
// 0e6: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 0e9: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 0ec: dup
// 0ed: sipush 17154
// 0f0: ldc2_w 9172236786617189440
// 0f3: lload 2
// 0f4: lxor
// 0f5: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/dh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0fd: astore 21
// 0ff: new su/catlean/g7
// 102: dup
// 103: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 106: dup
// 107: sipush 20663
// 10a: ldc2_w 190752551032100850
// 10d: lload 2
// 10e: lxor
// 10f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/dh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 117: getstatic su/catlean/dh.g Ljava/util/ArrayList;
// 11a: invokevirtual java/util/ArrayList.size ()I
// 11d: bipush 0
// 11e: bipush 4
// 11f: aconst_null
// 120: astore 15
// 122: istore 16
// 124: istore 17
// 126: istore 18
// 128: astore 19
// 12a: lload 6
// 12c: aload 19
// 12e: iload 18
// 130: iload 17
// 132: iload 16
// 134: aload 15
// 136: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 139: astore 22
// 13b: new net/minecraft/class_4587
// 13e: dup
// 13f: invokespecial net/minecraft/class_4587.<init> ()V
// 142: astore 23
// 144: aload 23
// 146: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 149: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 14c: invokevirtual su/catlean/zi.F ()F
// 14f: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 154: dup
// 155: sipush 16873
// 158: ldc2_w 3907333247584372394
// 15b: lload 2
// 15c: lxor
// 15d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/dh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 165: checkcast org/joml/Quaternionfc
// 168: lload 13
// 16a: dup2_x1
// 16b: pop2
// 16c: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 16f: aload 23
// 171: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 174: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 177: invokevirtual su/catlean/zi.b ()F
// 17a: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 17f: dup
// 180: sipush 16873
// 183: ldc2_w 3907333247584372394
// 186: lload 2
// 187: lxor
// 188: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/dh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 190: checkcast org/joml/Quaternionfc
// 193: lload 13
// 195: dup2_x1
// 196: pop2
// 197: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 19a: new org/joml/Quaternionf
// 19d: dup
// 19e: invokespecial org/joml/Quaternionf.<init> ()V
// 1a1: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1a4: invokevirtual su/catlean/zi.x ()F
// 1a7: fneg
// 1a8: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1ab: invokevirtual su/catlean/zi.F ()F
// 1ae: fconst_0
// 1af: invokevirtual org/joml/Quaternionf.rotateYXZ (FFF)Lorg/joml/Quaternionf;
// 1b2: astore 24
// 1b4: getstatic su/catlean/dh.g Ljava/util/ArrayList;
// 1b7: checkcast java/lang/Iterable
// 1ba: astore 25
// 1bc: bipush 0
// 1bd: istore 26
// 1bf: aload 25
// 1c1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1c6: astore 27
// 1c8: aload 27
// 1ca: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1cf: ifeq 25c
// 1d2: aload 27
// 1d4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d9: astore 28
// 1db: aload 28
// 1dd: checkcast su/catlean/bk
// 1e0: astore 29
// 1e2: bipush 0
// 1e3: istore 30
// 1e5: aload 20
// 1e7: ifnonnull 298
// 1ea: aload 20
// 1ec: ifnonnull 257
// 1ef: goto 1fc
// 1f2: ldc2_w 4624017934239006629
// 1f5: lload 2
// 1f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: athrow
// 1fc: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 1ff: invokevirtual su/catlean/zi.K ()Lnet/minecraft/class_4604;
// 202: aload 29
// 204: invokevirtual su/catlean/bk.r ()Lnet/minecraft/class_243;
// 207: getfield net/minecraft/class_243.field_1352 D
// 20a: aload 29
// 20c: invokevirtual su/catlean/bk.r ()Lnet/minecraft/class_243;
// 20f: getfield net/minecraft/class_243.field_1351 D
// 212: aload 29
// 214: invokevirtual su/catlean/bk.r ()Lnet/minecraft/class_243;
// 217: getfield net/minecraft/class_243.field_1350 D
// 21a: invokevirtual net/minecraft/class_4604.method_74404 (DDD)Z
// 21d: ifeq 255
// 220: goto 22d
// 223: ldc2_w 4624017934239006629
// 226: lload 2
// 227: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22c: athrow
// 22d: aload 29
// 22f: iload 8
// 231: iload 9
// 233: i2s
// 234: aload 23
// 236: aload 24
// 238: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 23b: iload 10
// 23d: i2c
// 23e: aload 24
// 240: checkcast org/joml/Quaternionfc
// 243: aload 22
// 245: invokevirtual su/catlean/bk.f (ISLnet/minecraft/class_4587;CLorg/joml/Quaternionfc;Lsu/catlean/g7;)V
// 248: goto 255
// 24b: ldc2_w 4624017934239006629
// 24e: lload 2
// 24f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 254: athrow
// 255: nop
// 256: nop
// 257: aload 20
// 259: ifnull 1c8
// 25c: nop
// 25d: lload 11
// 25f: aload 22
// 261: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 264: invokevirtual su/catlean/b6.B ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 267: aconst_null
// 268: aconst_null
// 269: aload 1
// 26a: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 26d: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 270: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 273: aconst_null
// 274: sipush 19806
// 277: ldc2_w 5608123236156607000
// 27a: lload 2
// 27b: lxor
// 27c: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/dh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 281: aload 21
// 283: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 286: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 289: getstatic su/catlean/dh.e J
// 28c: l2i
// 28d: aconst_null
// 28e: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 291: aload 1
// 292: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 295: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 298: return
}

@Flow
private final void P(PlayerUpdateEvent var1) {
g.removeIf(dh::S);
}

public final boolean a(@NotNull bk p) {
Intrinsics.checkNotNullParameter(p, "p");
return g.add(p);
}

private static final boolean P(bk var0) {
long var1 = a ^ 29783923891289L;
long var3 = var1 ^ 90571256016985L;
Intrinsics.checkNotNullParameter(var0, a<"m">(21914, 3949922918709897071L ^ var1));
return var0.v(var3);
}

private static final boolean S(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var14 = a ^ 88344582763178L;
vm.a<"Å">(null, -2637910897022544306L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[6];
int var10 = 0;
String var9 = "\\^4\u008ai¬®èP\u0096\u000f9ÜB\u0082p¸ÍÂªuVìË¼\u0084\u0019C¡\u008a\u0087¸ |\u009eÇfkéhïh\u0082\u0011â\u0003«;\u0080Ü¡wìiTë¥\u009b\u0083©ú\u0092æMÏ\u0010¾â-±ó¿N\u0014\u0086NË\u0085d\u001a£h(7£\u0014'\u00910\u0096°¤Jr\u0019Á\u0013\u0093T\u001c\u008b\t±Ô_\u0017\u0081?.Á5¢ËG+\u0006\u0019K\u007fÚ-cR";
int var11 = "\\^4\u008ai¬®èP\u0096\u000f9ÜB\u0082p¸ÍÂªuVìË¼\u0084\u0019C¡\u008a\u0087¸ |\u009eÇfkéhïh\u0082\u0011â\u0003«;\u0080Ü¡wìiTë¥\u009b\u0083©ú\u0092æMÏ\u0010¾â-±ó¿N\u0014\u0086NË\u0085d\u001a£h(7£\u0014'\u00910\u0096°¤Jr\u0019Á\u0013\u0093T\u001c\u008b\t±Ô_\u0017\u0081?.Á5¢ËG+\u0006\u0019K\u007fÚ-cR"
.length();
char var8 = ' ';
int var17 = -1;

label37:
while (true) {
String var18 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = a(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var26;
if ((var17 += var8) >= var11) {
b = var12;
c = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -3576054719284250693L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
e = var30;
S = new dh();
g = new ArrayList();
return;
}

var8 = var9.charAt(var17);
break;
default:
var12[var10++] = var26;
if ((var17 += var8) < var11) {
var8 = var9.charAt(var17);
continue label37;
}

var9 = "ÀîíÐ[\u001cÄUý¹\u0091Ma^qÁ\u009a-¯#ÀkeÅ|;\"DK\u000fÓ\u0094-áË\u001at²\u008a\u0099 5\u001c=>ÀUDpÖÃYi%\u0081&\u0005\u008fÞf\u0082RH\u0095\u009a\u0083ÿ\u0087\t\u000ey÷Ò";
var11 = "ÀîíÐ[\u001cÄUý¹\u0091Ma^qÁ\u009a-¯#ÀkeÅ|;\"DK\u000fÓ\u0094-áË\u001at²\u008a\u0099 5\u001c=>ÀUDpÖÃYi%\u0081&\u0005\u008fÞf\u0082RH\u0095\u009a\u0083ÿ\u0087\t\u000ey÷Ò"
.length();
var8 = '(';
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
var10001 = 0;
}
}
}

public static void N(_g[] var0) {
n = var0;
}

public static _g[] d() {
return n;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1702;
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
throw new RuntimeException("su/catlean/dh", var10);
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
throw new RuntimeException("su/catlean/dh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
