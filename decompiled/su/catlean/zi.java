package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_10017;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4604;
import net.minecraft.class_583;
import net.minecraft.class_591;
import net.minecraft.class_742;
import net.minecraft.class_897;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix4f;
import org.joml.Vector4d;
import su.catlean.api.event.events.render.FrustrumEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class zi {
@NotNull
public static final zi v;
@NotNull
private static Matrix4f t;
@NotNull
private static class_4604 m;
private static float o;
private static float Z;
private static float c;
private static int N;
private static final long a = yz.a(-4174707533709301951L, 9017164347033285973L, MethodHandles.lookup().lookupClass()).a(19905865458321L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private zi() {
}

@NotNull
public final Matrix4f s() {
return t;
}

public final void H(int a, char a, short a, @NotNull Matrix4f <set-?>) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"i">(30126, 747195667638112551L ^ var5));
t = <set-?>;
}

@NotNull
public final class_4604 K() {
return m;
}

public final void J(@NotNull class_4604 <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"i">(18458, 6172863861180606483L ^ ax));
m = <set-?>;
}

public final float x() {
return o;
}

public final void E(float <set-?>) {
o = <set-?>;
}

public final float b() {
return Z;
}

public final void G(float <set-?>) {
Z = <set-?>;
}

public final float F() {
return c;
}

public final void j(float <set-?>) {
c = <set-?>;
}

@Flow
private final void Q(FrustrumEvent var1) {
m = var1.getFrustrum();
}

@Flow(
priority = 20
)
private final void p(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zi.a J
// 003: ldc2_w 49177084550140
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 5355276310440
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 39660684172088
// 014: lxor
// 015: lstore 6
// 017: pop2
// 018: lload 4
// 01a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 01d: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 020: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 023: dup
// 024: sipush 25836
// 027: ldc2_w 6947468910626674427
// 02a: lload 2
// 02b: lxor
// 02c: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 031: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 034: astore 9
// 036: aload 9
// 038: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 03b: invokestatic org/joml/Math.toRadians (F)F
// 03e: putstatic su/catlean/zi.o F
// 041: aload 9
// 043: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 046: ldc 180.0
// 048: fadd
// 049: invokestatic org/joml/Math.toRadians (F)F
// 04c: putstatic su/catlean/zi.Z F
// 04f: aload 9
// 051: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 054: invokestatic org/joml/Math.toRadians (F)F
// 057: putstatic su/catlean/zi.c F
// 05a: ldc2_w 5452201619691578795
// 05d: lload 2
// 05e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: getstatic su/catlean/api/event/GofraState.INSTANCE Lsu/catlean/api/event/GofraState;
// 066: bipush 0
// 067: invokevirtual su/catlean/api/event/GofraState.setModifyBuffer (Z)V
// 06a: astore 8
// 06c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 06f: invokevirtual su/catlean/jl.b ()Lorg/joml/Matrix4f;
// 072: invokestatic com/mojang/blaze3d/systems/RenderSystem.getModelViewMatrix ()Lorg/joml/Matrix4f;
// 075: checkcast org/joml/Matrix4fc
// 078: invokevirtual org/joml/Matrix4f.set (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
// 07b: pop
// 07c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 07f: invokevirtual su/catlean/jl.m ()Lorg/joml/Matrix4f;
// 082: aload 1
// 083: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 086: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 089: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 08c: checkcast org/joml/Matrix4fc
// 08f: invokevirtual org/joml/Matrix4f.set (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
// 092: pop
// 093: sipush 10870
// 096: ldc2_w 2909859863333772313
// 099: lload 2
// 09a: lxor
// 09b: invokedynamic t (IJ)I bsm=su/catlean/zi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: aload 8
// 0a2: ifnonnull 0e6
// 0a5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0a8: invokevirtual su/catlean/jl.u ()[I
// 0ab: invokestatic org/lwjgl/opengl/GL32C.glGetIntegerv (I[I)V
// 0ae: aload 1
// 0af: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getProjection ()Lorg/joml/Matrix4f;
// 0b2: putstatic su/catlean/zi.t Lorg/joml/Matrix4f;
// 0b5: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0b8: lload 6
// 0ba: invokevirtual su/catlean/jh.P (J)V
// 0bd: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 0c0: invokevirtual su/catlean/w8.a ()Lsu/catlean/gf;
// 0c3: ifnonnull 139
// 0c6: goto 0d3
// 0c9: ldc2_w 5439369684692683628
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 0d6: invokevirtual su/catlean/fi.V ()Z
// 0d9: goto 0e6
// 0dc: ldc2_w 5439369684692683628
// 0df: lload 2
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: aload 8
// 0e8: ifnonnull 0fe
// 0eb: ifeq 139
// 0ee: goto 0fb
// 0f1: ldc2_w 5439369684692683628
// 0f4: lload 2
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 0fe: sipush 21485
// 101: ldc2_w 4277866405938685342
// 104: lload 2
// 105: lxor
// 106: invokedynamic t (IJ)I bsm=su/catlean/zi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: if_icmpeq 139
// 10e: lload 4
// 110: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 113: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 116: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 119: sipush 28929
// 11c: ldc2_w 3167872138082830184
// 11f: lload 2
// 120: lxor
// 121: invokedynamic t (IJ)I bsm=su/catlean/zi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 129: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 12c: goto 139
// 12f: ldc2_w 5439369684692683628
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: return
}

public final void y(
int a, byte a, @NotNull String text, @NotNull class_243 pos, @NotNull Color color, float offX, int a, float offY, boolean shadow, @NotNull c6 font
) {
long var11 = ((long)ax << 32 | (long)axxx << 56 >>> 32 | (long)axx << 40 >>> 40) ^ a;
long var13 = var11 ^ 109666755875816L;
long var15 = var11 ^ 33312932849836L;
int var17 = (int)((var11 ^ 35550430993871L) >>> 56);
long var18 = (var11 ^ 35550430993871L) << 8 >>> 8;
long var20 = var11 ^ 137405493480191L;
long var22 = var11 ^ 28171773987925L;
long var10001 = var11 ^ 134388644916443L;
int var24 = (int)((var11 ^ 134388644916443L) >>> 48);
int var25 = (int)((var11 ^ 134388644916443L) << 16 >>> 32);
int var26 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(text, a<"i">(3042, 607568883903856061L ^ var11));
Intrinsics.checkNotNullParameter(pos, a<"i">(10904, 8094206557974387957L ^ var11));
Intrinsics.checkNotNullParameter(color, a<"i">(27188, 3515682366252948600L ^ var11));
Intrinsics.checkNotNullParameter(font, a<"i">(24739, 2152955378997171947L ^ var11));
Vector4d var28 = jl.y.t(var22, pos);
if (var28 != null) {
Matrix3x2fStack var29 = new Matrix3x2fStack(b<"t">(8302, 7530266177068438091L ^ var11));
var29.translate((float)var28.x, (float)var28.y);
Matrix3x2fStack var10000 = var29;
float var31 = 1.0F;
kf var10002 = kf.G;
class_1297 var10003 = zf.F(var13).method_1560();
Intrinsics.checkNotNull(var10003);
class_1297 var27 = var10003;

try {
var10000.scale(var31 - RangesKt.coerceIn((float)var10002.J((byte)var17, var18, var27).method_1022(pos), RangesKt.rangeTo(1.0F, 10.0F)).floatValue() / 10.0F);
if (ax >= 0 && shadow) {
float var32 = offX + 1.0F;
float var10004 = offY + 1.0F;
jl var10005 = jl.y;
Color var10006 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, a<"i">(18563, 1439779157764718289L ^ var11));
font.U(var29, text, var32, var10004, var20, var10005.p(var10006, (char)var24, var25, jl.y.G(var15, color), (short)var26));
}
} catch (NumberFormatException var30) {
throw vm.a<"Å">(var30, -3513684519046459604L, var11);
}

font.U(var29, text, offX, offY, var20, color);
}
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static void h(zi var0, long var1, String var3, class_243 var4, Color var5, float var6, float var7, boolean var8, c6 var9, int var10, Object var11) {
var1 = a ^ var1;
long var10001 = var1 ^ 40409624637688L;
int var12 = (int)((var1 ^ 40409624637688L) >>> 32);
int var13 = (int)((var1 ^ 40409624637688L) << 32 >>> 56);
int var14 = (int)(var10001 << 40 >>> 40);
long var15 = var1 ^ 34617773774194L;
_g[] var17 = vm.a<"Å">(3318988450763161614L, var1);

int var10000;
label65: {
label64: {
try {
var10000 = var10 & b<"t">(29324, 5265515644411355481L ^ var1);
if (var17 != null) {
break label65;
}

if (var10000 == 0) {
break label64;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, 3375997667786665673L, var1);
}

var6 = 0.0F;
}

var10000 = var10 & b<"t">(5631, 2705032757883029050L ^ var1);
}

label56: {
label55: {
label54: {
try {
var23 = var17;
if (var1 < 0L) {
break label56;
}

if (var17 != null) {
break label55;
}

if (var10000 == 0) {
break label54;
}
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, 3375997667786665673L, var1);
}

var7 = 0.0F;
}

var10000 = var10 & b<"t">(20857, 8036883807961842363L ^ var1);
}

try {
var23 = var17;
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 3375997667786665673L, var1);
}
}

label43: {
label42: {
try {
if (var23 != null) {
break label43;
}

if (var10000 == 0) {
break label42;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, 3375997667786665673L, var1);
}

var8 = false;
}

var10000 = var10 & b<"t">(4689, 4764794855698514322L ^ var1);
}

if (var10000 != 0) {
var9 = b8.i(var15);
}

var0.y(var12, (byte)var13, var3, var4, var5, var6, var14, var7, var8, var9);
}

public final float n(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 36136573897038L;
return zf.F(var6).method_61966().method_60637(true);
}

public final boolean Q(short a, char a, @NotNull class_238 box, int a, @NotNull Color color, @NotNull Color color2) {
long var7 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
long var9 = var7 ^ 14250967117543L;
Intrinsics.checkNotNullParameter(box, a<"i">(25235, 3767035662539926465L ^ var7));
Intrinsics.checkNotNullParameter(color, a<"i">(27188, 3515741348500054851L ^ var7));
Intrinsics.checkNotNullParameter(color2, a<"i">(5475, 1647972678821731389L ^ var7));
return cz.H.a().add(new x9(box, var9, color, color2));
}

public static boolean g(zi var0, class_238 var1, long var2, Color var4, Color var5, int var6, Object var7) {
var2 = a ^ var2;
long var10001 = var2 ^ 45246712640059L;
int var8 = (int)((var2 ^ 45246712640059L) >>> 48);
int var9 = (int)((var2 ^ 45246712640059L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
_g[] var11 = vm.a<"Å">(-7784685457948377610L, var2);

try {
int var10000 = var6 & 4;
if (var11 != null) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var0.Q((short)var8, (char)var9, var1, var10, var4, var5);
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -7844808452706528463L, var2);
}

return var0.Q((short)var8, (char)var9, var1, var10, var4, var4);
}

public final boolean F(@NotNull class_238 box, @NotNull Color color, long a, @NotNull Color color2) {
ax = a ^ ax;
long var6 = ax ^ 100610304407891L;
Intrinsics.checkNotNullParameter(box, a<"i">(8486, 2735373846111371256L ^ ax));
Intrinsics.checkNotNullParameter(color, a<"i">(7900, 429837257357197318L ^ ax));
Intrinsics.checkNotNullParameter(color2, a<"i">(32384, 5056039973304754260L ^ ax));
return cz.H.F().add(new x9(box, var6, color, color2));
}

public static boolean E(long var0, zi var2, class_238 var3, Color var4, Color var5, int var6, Object var7) {
var0 = a ^ var0;
long var8 = var0 ^ 45805509473194L;
_g[] var10 = vm.a<"Å">(-4192171569284240429L, var0);

try {
int var10000 = var6 & 4;
if (var10 != null) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var2.F(var3, var4, var8, var5);
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -4250004144435870444L, var0);
}

return var2.F(var3, var4, var8, var4);
}

public final boolean q(long a, short a, @NotNull class_238 box, @NotNull Color color, @NotNull Color color2) {
long var7 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
long var9 = var7 ^ 110330311035655L;
Intrinsics.checkNotNullParameter(box, a<"i">(25235, 3767078945992855073L ^ var7));
Intrinsics.checkNotNullParameter(color, a<"i">(27188, 3515627472925607587L ^ var7));
Intrinsics.checkNotNullParameter(color2, a<"i">(5475, 1647946678044309981L ^ var7));
return cz.H.x().add(new x9(box, var9, color, color2));
}

public static boolean x(zi var0, long var1, class_238 var3, Color var4, Color var5, int var6, Object var7) {
var1 = a ^ var1;
long var8 = (var1 ^ 7726524993970L) >>> 16;
int var10 = (int)((var1 ^ 7726524993970L) << 48 >>> 48);
_g[] var11 = vm.a<"Å">(1557818157475888031L, var1);

try {
int var10000 = var6 & 4;
if (var11 != null) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var0.q(var8, (short)var10, var3, var4, var5);
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 1533725026013189464L, var1);
}

return var0.q(var8, (short)var10, var3, var4, var4);
}

public final boolean S(@NotNull class_238 box, @NotNull class_2350 side, long a, @NotNull Color color) {
ax = a ^ ax;
int var6 = (int)((ax ^ 88768033569183L) >>> 48);
long var7 = (ax ^ 88768033569183L) << 16 >>> 16;
Intrinsics.checkNotNullParameter(box, a<"i">(25235, 3767102850326666200L ^ ax));
Intrinsics.checkNotNullParameter(side, a<"i">(9720, 1265298044039486623L ^ ax));
Intrinsics.checkNotNullParameter(color, a<"i">(27188, 3515673920147624794L ^ ax));
return cz.H.O().add(new to(box, (char)var6, color, side, var7));
}

public final boolean c(char a, @NotNull class_238 box, int a, short a, @NotNull class_2350 side, @NotNull Color color) {
long var7 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
int var9 = (int)((var7 ^ 105513010138653L) >>> 48);
long var10 = (var7 ^ 105513010138653L) << 16 >>> 16;
Intrinsics.checkNotNullParameter(box, a<"i">(25235, 3767119629662792794L ^ var7));
Intrinsics.checkNotNullParameter(side, a<"i">(28582, 6092412085568905582L ^ var7));
Intrinsics.checkNotNullParameter(color, a<"i">(27188, 3515659296898000088L ^ var7));
return cz.H.h().add(new to(box, (char)var9, color, side, var10));
}

public final boolean T(@NotNull class_243 start, @NotNull class_243 end, @NotNull Color startColor, @NotNull Color endColor, long a, boolean ignoreFrustrum) {
ax = a ^ ax;
long var8 = ax ^ 71752019206572L;
Intrinsics.checkNotNullParameter(start, a<"i">(8353, 5503162730599837844L ^ ax));
Intrinsics.checkNotNullParameter(end, a<"i">(7716, 2920879958989098557L ^ ax));
Intrinsics.checkNotNullParameter(startColor, a<"i">(19250, 3161789600019061506L ^ ax));
Intrinsics.checkNotNullParameter(endColor, a<"i">(10593, 3487417123322984768L ^ ax));
return cz.H.V().add(new oj(start, end, startColor, endColor, ignoreFrustrum, var8));
}

public static boolean L(zi var0, short var1, class_243 var2, class_243 var3, Color var4, Color var5, boolean var6, int var7, char var8, int var9, Object var10) {
long var11 = ((long)var1 << 48 | (long)var7 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ a;
long var13 = var11 ^ 102564888195235L;
_g[] var15 = vm.a<"Å">(5200378155913553450L, var11);

int var10000;
label37: {
label36: {
try {
var10000 = var9 & b<"t">(8302, 7530280599135065482L ^ var11);
if (var15 != null) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 5259621580577294573L, var11);
}

var5 = var4;
}

var10000 = var9 & b<"t">(2189, 6518150480732601696L ^ var11);
}

try {
if (var15 != null) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var0.T(var2, var3, var4, var5, var13, var6);
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 5259621580577294573L, var11);
}

var6 = false;
return var0.T(var2, var3, var4, var5, var13, var6);
}

public final boolean t(@NotNull class_243 start, @NotNull class_243 end, @NotNull Color startColor, @NotNull Color endColor, long a) {
ax = a ^ ax;
long var7 = ax ^ 24588818667846L;
Intrinsics.checkNotNullParameter(start, a<"i">(13011, 4430049478997959767L ^ ax));
Intrinsics.checkNotNullParameter(end, a<"i">(1856, 6968595462481433031L ^ ax));
Intrinsics.checkNotNullParameter(startColor, a<"i">(29638, 7101692584838309205L ^ ax));
Intrinsics.checkNotNullParameter(endColor, a<"i">(30926, 8128028820734717550L ^ ax));
return cz.H.N().add(new oj(start, end, startColor, endColor, false, var7, b<"t">(2189, 6518209844064229986L ^ ax), null));
}

public static boolean C(zi var0, int var1, byte var2, class_243 var3, class_243 var4, Color var5, int var6, Color var7, int var8, Object var9) {
long var10 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var6 << 40 >>> 40) ^ a;
long var12 = var10 ^ 110931939881423L;
_g[] var14 = vm.a<"Å">(-8071735650843926022L, var10);

try {
int var10000 = var8 & b<"t">(8302, 7530288088309617242L ^ var10);
if (var14 != null) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var0.t(var3, var4, var5, var7, var12);
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -8129570560830927043L, var10);
}

return var0.t(var3, var4, var5, var5, var12);
}

@NotNull
public final class_238 r(@NotNull class_238 from, @NotNull class_238 to, long a, float delta) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(from, a<"i">(31834, 5102539692015479415L ^ ax));
Intrinsics.checkNotNullParameter(to, a<"i">(22929, 6105391959150579636L ^ ax));
return new class_238(
jl.y.a(from.field_1323, to.field_1323, delta),
jl.y.a(from.field_1322, to.field_1322, delta),
jl.y.a(from.field_1321, to.field_1321, delta),
jl.y.a(from.field_1320, to.field_1320, delta),
jl.y.a(from.field_1325, to.field_1325, delta),
jl.y.a(from.field_1324, to.field_1324, delta)
);
}

public static class_238 h(int var0, zi var1, class_238 var2, class_238 var3, float var4, int var5, short var6, short var7, Object var8) {
long var9 = ((long)var0 << 32 | (long)var6 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
long var10001 = var9 ^ 55485315902734L;
int var11 = (int)((var9 ^ 55485315902734L) >>> 32);
int var12 = (int)((var9 ^ 55485315902734L) << 32 >>> 48);
int var13 = (int)(var10001 << 48 >>> 48);
long var14 = var9 ^ 87866977851367L;
if ((var5 & 4) != 0) {
var4 = var1.n(var11, (char)var12, var13);
}

return var1.r(var2, var3, var14, var4);
}

@NotNull
public final class_243 q(long a, @NotNull class_243 from, @NotNull class_243 to, float delta) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(from, a<"i">(7915, 2603498067896173614L ^ ax));
Intrinsics.checkNotNullParameter(to, a<"i">(17510, 178408748477210299L ^ ax));
return new class_243(
jl.y.W(from.field_1352, to.field_1352, delta), jl.y.W(from.field_1351, to.field_1351, delta), jl.y.W(from.field_1350, to.field_1350, delta)
);
}

public static class_243 n(int var0, zi var1, class_243 var2, class_243 var3, float var4, int var5, byte var6, Object var7, int var8) {
long var9 = ((long)var0 << 32 | (long)var6 << 56 >>> 32 | (long)var8 << 40 >>> 40) ^ a;
long var10001 = var9 ^ 89054059048595L;
int var11 = (int)((var9 ^ 89054059048595L) >>> 32);
int var12 = (int)((var9 ^ 89054059048595L) << 32 >>> 48);
int var13 = (int)(var10001 << 48 >>> 48);
long var14 = var9 ^ 72900528134307L;
if ((var5 & 4) != 0) {
var4 = var1.n(var11, (char)var12, var13);
}

return var1.q(var14, var2, var3, var4);
}

private final class_238 l(byte var1, class_1297 var2, long var3) {
long var5 = ((long)var1 << 56 | var3 << 8 >>> 8) ^ a;
long var7 = var5 ^ 71696625411859L;
double var9 = jl.y.b(var7, var2.field_6014, var2.method_23317());
double var11 = jl.y.b(var7, var2.field_6036, var2.method_23318());
double var13 = jl.y.b(var7, var2.field_5969, var2.method_23321());
class_238 var15 = var2.method_5829();
boolean var16 = false;
return new class_238(
var15.field_1323 - var2.method_23317() + var9 - 0.05,
var15.field_1322 - var2.method_23318() + var11,
var15.field_1321 - var2.method_23321() + var13 - 0.05,
var15.field_1320 - var2.method_23317() + var9 + 0.05,
var15.field_1325 - var2.method_23318() + var11 + 0.15,
var15.field_1324 - var2.method_23321() + var13 + 0.05
);
}

public final void f(
@NotNull class_2960 texture,
@NotNull class_243 pos,
float yaw,
float pitch,
long a,
float roll,
float scale,
@NotNull Color color,
boolean altBlend,
@Nullable g7 polygon,
float uStart,
float vStart,
float uEnd,
float vEnd,
boolean altRtotate
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/zi.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 127781284085668
// 00e: lxor
// 00f: lstore 17
// 011: dup2
// 012: ldc2_w 45035943829719
// 015: lxor
// 016: lstore 19
// 018: dup2
// 019: ldc2_w 83236826471939
// 01c: lxor
// 01d: lstore 21
// 01f: dup2
// 020: ldc2_w 69256387734379
// 023: lxor
// 024: lstore 23
// 026: dup2
// 027: ldc2_w 38184216865737
// 02a: lxor
// 02b: lstore 25
// 02d: dup2
// 02e: ldc2_w 26003034487144
// 031: lxor
// 032: lstore 27
// 034: dup2
// 035: ldc2_w 29387382602552
// 038: lxor
// 039: lstore 29
// 03b: pop2
// 03c: aload 1
// 03d: sipush 11395
// 040: ldc2_w 8255838722474011125
// 043: lload 5
// 045: lxor
// 046: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04e: aload 2
// 04f: sipush 11735
// 052: ldc2_w 8923988571470096562
// 055: lload 5
// 057: lxor
// 058: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 060: ldc2_w -228223055594384684
// 063: lload 5
// 065: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: aload 9
// 06c: sipush 27188
// 06f: ldc2_w 3515760122497642311
// 072: lload 5
// 074: lxor
// 075: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07d: astore 40
// 07f: aload 11
// 081: astore 41
// 083: aload 41
// 085: ifnull 097
// 088: bipush 1
// 089: goto 098
// 08c: ldc2_w -287199293518218221
// 08f: lload 5
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: bipush 0
// 098: istore 42
// 09a: new net/minecraft/class_4587
// 09d: dup
// 09e: invokespecial net/minecraft/class_4587.<init> ()V
// 0a1: astore 43
// 0a3: iload 42
// 0a5: ifne 0ed
// 0a8: new su/catlean/g7
// 0ab: dup
// 0ac: getstatic net/minecraft/class_290.field_1575 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 0af: dup
// 0b0: sipush 13370
// 0b3: ldc2_w 8713830957723578722
// 0b6: lload 5
// 0b8: lxor
// 0b9: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c1: bipush 0
// 0c2: bipush 0
// 0c3: sipush 21625
// 0c6: ldc2_w 3154570933632718193
// 0c9: lload 5
// 0cb: lxor
// 0cc: invokedynamic t (IJ)I bsm=su/catlean/zi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: aconst_null
// 0d2: astore 31
// 0d4: istore 32
// 0d6: istore 33
// 0d8: istore 34
// 0da: astore 35
// 0dc: lload 17
// 0de: aload 35
// 0e0: iload 34
// 0e2: iload 33
// 0e4: iload 32
// 0e6: aload 31
// 0e8: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 0eb: astore 41
// 0ed: lload 19
// 0ef: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f2: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 0f5: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 0f8: dup
// 0f9: sipush 2144
// 0fc: ldc2_w 9191194385117498635
// 0ff: lload 5
// 101: lxor
// 102: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 10a: astore 44
// 10c: aload 2
// 10d: aload 44
// 10f: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 112: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 115: dup
// 116: sipush 30660
// 119: ldc2_w 2572673930499011235
// 11c: lload 5
// 11e: lxor
// 11f: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 127: astore 45
// 129: iload 16
// 12b: aload 40
// 12d: lload 5
// 12f: lconst_0
// 130: lcmp
// 131: iflt 208
// 134: ifnonnull 206
// 137: ifeq 199
// 13a: goto 148
// 13d: ldc2_w -287199293518218221
// 140: lload 5
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: aload 43
// 14a: aload 45
// 14c: getfield net/minecraft/class_243.field_1352 D
// 14f: aload 45
// 151: getfield net/minecraft/class_243.field_1351 D
// 154: aload 45
// 156: getfield net/minecraft/class_243.field_1350 D
// 159: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 15c: aload 43
// 15e: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 161: fload 3
// 162: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 167: checkcast org/joml/Quaternionfc
// 16a: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 16d: aload 43
// 16f: lload 5
// 171: lconst_0
// 172: lcmp
// 173: iflt 275
// 176: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 179: fload 4
// 17b: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 180: checkcast org/joml/Quaternionfc
// 183: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 186: aload 40
// 188: ifnull 273
// 18b: goto 199
// 18e: ldc2_w -287199293518218221
// 191: lload 5
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 43
// 19b: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 19e: aload 44
// 1a0: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 1a3: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 1a8: checkcast org/joml/Quaternionfc
// 1ab: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 1ae: aload 43
// 1b0: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 1b3: aload 44
// 1b5: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 1b8: fload 3
// 1b9: fadd
// 1ba: ldc 180.0
// 1bc: fadd
// 1bd: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 1c2: checkcast org/joml/Quaternionfc
// 1c5: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 1c8: aload 43
// 1ca: aload 45
// 1cc: getfield net/minecraft/class_243.field_1352 D
// 1cf: aload 45
// 1d1: getfield net/minecraft/class_243.field_1351 D
// 1d4: aload 45
// 1d6: getfield net/minecraft/class_243.field_1350 D
// 1d9: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 1dc: aload 43
// 1de: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 1e1: aload 44
// 1e3: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 1e6: fload 3
// 1e7: fadd
// 1e8: fneg
// 1e9: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 1ee: checkcast org/joml/Quaternionfc
// 1f1: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 1f4: fload 4
// 1f6: fconst_0
// 1f7: fcmpg
// 1f8: goto 206
// 1fb: ldc2_w -287199293518218221
// 1fe: lload 5
// 200: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: athrow
// 206: aload 40
// 208: ifnonnull 21d
// 20b: ifne 220
// 20e: goto 21c
// 211: ldc2_w -287199293518218221
// 214: lload 5
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: bipush 1
// 21d: goto 221
// 220: bipush 0
// 221: ifeq 253
// 224: aload 43
// 226: lload 5
// 228: lconst_0
// 229: lcmp
// 22a: iflt 275
// 22d: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 230: aload 44
// 232: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 235: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 23a: checkcast org/joml/Quaternionfc
// 23d: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 240: aload 40
// 242: ifnull 273
// 245: goto 253
// 248: ldc2_w -287199293518218221
// 24b: lload 5
// 24d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: athrow
// 253: aload 43
// 255: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 258: fload 4
// 25a: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 25f: checkcast org/joml/Quaternionfc
// 262: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 265: goto 273
// 268: ldc2_w -287199293518218221
// 26b: lload 5
// 26d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 272: athrow
// 273: aload 43
// 275: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 278: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 27b: dup
// 27c: sipush 1934
// 27f: ldc2_w 5196112492210340595
// 282: lload 5
// 284: lxor
// 285: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 28d: astore 46
// 28f: aload 43
// 291: fload 8
// 293: fneg
// 294: f2d
// 295: ldc2_w 2.0
// 298: ddiv
// 299: fload 8
// 29b: fneg
// 29c: f2d
// 29d: ldc2_w 2.0
// 2a0: ddiv
// 2a1: ldc2_w -0.01
// 2a4: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 2a7: lload 19
// 2a9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2ac: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 2af: aload 1
// 2b0: invokevirtual net/minecraft/class_1060.method_4619 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1044;
// 2b3: invokevirtual net/minecraft/class_1044.method_71659 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 2b6: dup
// 2b7: sipush 1340
// 2ba: ldc2_w 3969319539882278990
// 2bd: lload 5
// 2bf: lxor
// 2c0: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c8: astore 47
// 2ca: lload 5
// 2cc: lconst_0
// 2cd: lcmp
// 2ce: ifle 3fa
// 2d1: aload 40
// 2d3: ifnonnull 3fa
// 2d6: iload 42
// 2d8: ifeq 374
// 2db: goto 2e9
// 2de: ldc2_w -287199293518218221
// 2e1: lload 5
// 2e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e8: athrow
// 2e9: aload 41
// 2eb: aload 46
// 2ed: fconst_0
// 2ee: lload 23
// 2f0: fload 8
// 2f2: fconst_0
// 2f3: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2f6: fload 12
// 2f8: lload 29
// 2fa: fload 15
// 2fc: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 2ff: aload 9
// 301: lload 21
// 303: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 306: pop
// 307: aload 41
// 309: aload 46
// 30b: fload 8
// 30d: lload 23
// 30f: fload 8
// 311: fconst_0
// 312: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 315: fload 14
// 317: lload 29
// 319: fload 15
// 31b: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 31e: aload 9
// 320: lload 21
// 322: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 325: pop
// 326: aload 41
// 328: aload 46
// 32a: fload 8
// 32c: lload 23
// 32e: fconst_0
// 32f: fconst_0
// 330: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 333: fload 14
// 335: lload 29
// 337: fload 13
// 339: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 33c: aload 9
// 33e: lload 21
// 340: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 343: pop
// 344: aload 41
// 346: aload 46
// 348: fconst_0
// 349: lload 23
// 34b: fconst_0
// 34c: fconst_0
// 34d: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 350: fload 12
// 352: lload 29
// 354: fload 13
// 356: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 359: aload 9
// 35b: lload 21
// 35d: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 360: pop
// 361: aload 40
// 363: ifnull 487
// 366: goto 374
// 369: ldc2_w -287199293518218221
// 36c: lload 5
// 36e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 373: athrow
// 374: aload 41
// 376: fconst_0
// 377: fload 8
// 379: fconst_0
// 37a: bipush 4
// 37b: lload 27
// 37d: aconst_null
// 37e: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 381: fload 12
// 383: lload 29
// 385: fload 15
// 387: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 38a: aload 9
// 38c: lload 21
// 38e: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 391: pop
// 392: aload 41
// 394: fload 8
// 396: fload 8
// 398: fconst_0
// 399: bipush 4
// 39a: lload 27
// 39c: aconst_null
// 39d: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 3a0: fload 14
// 3a2: lload 29
// 3a4: fload 15
// 3a6: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 3a9: aload 9
// 3ab: lload 21
// 3ad: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3b0: pop
// 3b1: aload 41
// 3b3: fload 8
// 3b5: fconst_0
// 3b6: fconst_0
// 3b7: bipush 4
// 3b8: lload 27
// 3ba: aconst_null
// 3bb: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 3be: fload 14
// 3c0: lload 29
// 3c2: fload 13
// 3c4: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 3c7: aload 9
// 3c9: lload 21
// 3cb: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3ce: pop
// 3cf: aload 41
// 3d1: fconst_0
// 3d2: fconst_0
// 3d3: fconst_0
// 3d4: bipush 4
// 3d5: lload 27
// 3d7: aconst_null
// 3d8: invokestatic su/catlean/g7.j (Lsu/catlean/g7;FFFIJLjava/lang/Object;)Lsu/catlean/g7;
// 3db: fload 12
// 3dd: lload 29
// 3df: fload 13
// 3e1: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 3e4: aload 9
// 3e6: lload 21
// 3e8: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3eb: pop
// 3ec: goto 3fa
// 3ef: ldc2_w -287199293518218221
// 3f2: lload 5
// 3f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f9: athrow
// 3fa: aload 41
// 3fc: iload 10
// 3fe: ifeq 415
// 401: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 404: invokevirtual su/catlean/b6.S ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 407: goto 41b
// 40a: ldc2_w -287199293518218221
// 40d: lload 5
// 40f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 414: athrow
// 415: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 418: invokevirtual su/catlean/b6.O ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 41b: lload 19
// 41d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 420: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 423: dup
// 424: sipush 4390
// 427: ldc2_w 6938081604279882842
// 42a: lload 5
// 42c: lxor
// 42d: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 432: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 435: aconst_null
// 436: aload 46
// 438: aconst_null
// 439: sipush 15158
// 43c: ldc2_w 7580242539973672533
// 43f: lload 5
// 441: lxor
// 442: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 447: aload 47
// 449: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 44c: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 44f: sipush 32525
// 452: ldc2_w 3556680859219525145
// 455: lload 5
// 457: lxor
// 458: invokedynamic t (IJ)I bsm=su/catlean/zi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45d: aconst_null
// 45e: astore 31
// 460: istore 32
// 462: astore 33
// 464: astore 34
// 466: astore 35
// 468: astore 36
// 46a: astore 37
// 46c: astore 38
// 46e: astore 39
// 470: lload 25
// 472: aload 39
// 474: aload 38
// 476: aload 37
// 478: aload 36
// 47a: aload 35
// 47c: aload 34
// 47e: aload 33
// 480: iload 32
// 482: aload 31
// 484: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 487: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static void e(
zi var0,
class_2960 var1,
class_243 var2,
float var3,
float var4,
float var5,
float var6,
long var7,
Color var9,
boolean var10,
g7 var11,
float var12,
float var13,
float var14,
float var15,
boolean var16,
int var17,
Object var18
) {
var7 = a ^ var7;
long var19 = var7 ^ 122472036875567L;
_g[] var21 = vm.a<"Å">(-3393626685119775002L, var7);

int var10000;
label157: {
label156: {
try {
var10000 = var17 & b<"t">(11134, 5866401046834513488L ^ var7);
if (var21 != null) {
break label157;
}

if (var10000 == 0) {
break label156;
}
} catch (NumberFormatException var33) {
throw vm.a<"Å">(var33, -3444704963500814303L, var7);
}

var10 = true;
}

var10000 = var17 & b<"t">(11323, 4183769590636839175L ^ var7);
}

_g[] var10001;
label148: {
label147: {
label146: {
try {
var10001 = var21;
if (var7 < 0L) {
break label148;
}

if (var21 != null) {
break label147;
}

if (var10000 == 0) {
break label146;
}
} catch (NumberFormatException var32) {
throw vm.a<"Å">(var32, -3444704963500814303L, var7);
}

var11 = null;
}

var10000 = var17 & b<"t">(17327, 4284072728519241359L ^ var7);
}

try {
var10001 = var21;
} catch (NumberFormatException var26) {
throw vm.a<"Å">(var26, -3444704963500814303L, var7);
}
}

label135: {
label134: {
label133: {
try {
if (var7 < 0L) {
break label135;
}

if (var10001 != null) {
break label134;
}

if (var10000 == 0) {
break label133;
}
} catch (NumberFormatException var31) {
throw vm.a<"Å">(var31, -3444704963500814303L, var7);
}

var12 = 0.0F;
}

var10000 = var17 & b<"t">(4397, 4413621700743871490L ^ var7);
}

try {
var10001 = var21;
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, -3444704963500814303L, var7);
}
}

label122: {
label121: {
label120: {
try {
if (var7 < 0L) {
break label122;
}

if (var10001 != null) {
break label121;
}

if (var10000 == 0) {
break label120;
}
} catch (NumberFormatException var30) {
throw vm.a<"Å">(var30, -3444704963500814303L, var7);
}

var13 = 0.0F;
}

var10000 = var17 & b<"t">(10001, 4731341608042564142L ^ var7);
}

try {
var10001 = var21;
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, -3444704963500814303L, var7);
}
}

label109: {
label108: {
label107: {
try {
if (var7 <= 0L) {
break label109;
}

if (var10001 != null) {
break label108;
}

if (var10000 == 0) {
break label107;
}
} catch (NumberFormatException var29) {
throw vm.a<"Å">(var29, -3444704963500814303L, var7);
}

var14 = 1.0F;
}

var10000 = var17 & b<"t">(6426, 2155578584005325875L ^ var7);
}

try {
var10001 = var21;
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, -3444704963500814303L, var7);
}
}

label96: {
label95: {
label94: {
try {
if (var7 <= 0L) {
break label96;
}

if (var10001 != null) {
break label95;
}

if (var10000 == 0) {
break label94;
}
} catch (NumberFormatException var28) {
throw vm.a<"Å">(var28, -3444704963500814303L, var7);
}

var15 = 1.0F;
}

var10000 = var17 & b<"t">(8581, 910309432412507302L ^ var7);
}

try {
var10001 = var21;
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, -3444704963500814303L, var7);
}
}

label83: {
label82: {
try {
if (var10001 != null) {
break label82;
}

if (var10000 == 0) {
break label83;
}
} catch (NumberFormatException var27) {
throw vm.a<"Å">(var27, -3444704963500814303L, var7);
}

var10000 = 0;
}

var16 = var10000;
}

var0.f(var1, var2, var3, var4, var19, var5, var6, var9, var10, var11, var12, var13, var14, var15, (boolean)var16);
}

public final void D(@NotNull class_4587 stack, @NotNull class_243 pos, @NotNull class_1657 entity, long a, float alpha, boolean depthTest) {
ax = a ^ ax;
long var8 = ax ^ 57611794277199L;
long var10 = ax ^ 115066803108924L;
long var10001 = ax ^ 36347300969244L;
int var12 = (int)((ax ^ 36347300969244L) >>> 32);
int var13 = (int)((ax ^ 36347300969244L) << 32 >>> 48);
int var14 = (int)(var10001 << 48 >>> 48);
long var15 = ax ^ 57691186797662L;
long var17 = ax ^ 68350131169361L;
long var19 = (ax ^ 50148390648341L) >>> 16;
int var21 = (int)((ax ^ 50148390648341L) << 48 >>> 48);
var10001 = ax ^ 50447779781756L;
int var22 = (int)((ax ^ 50447779781756L) >>> 48);
int var23 = (int)((ax ^ 50447779781756L) << 16 >>> 32);
int var24 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(stack, a<"i">(9998, 3079808149485494729L ^ ax));
Intrinsics.checkNotNullParameter(pos, a<"i">(10904, 8094149555127069778L ^ ax));
Intrinsics.checkNotNullParameter(entity, a<"i">(25367, 1024238266618242513L ^ ax));
_g[] var10000 = vm.a<"Å">(-4662020804364906164L, ax);
GpuTextureView var68 = zf.F(var8).method_1531().method_4619(((class_742)entity).method_52814().comp_1626().comp_3627()).method_71659();
Intrinsics.checkNotNullExpressionValue(var68, a<"i">(22556, 8303026383531466485L ^ ax));
GpuTextureView var35 = var68;
_g[] var34 = var10000;

label64: {
label63: {
try {
float var73;
var57 = (var73 = alpha - 1.0F) == 0.0F ? 0 : (var73 < 0.0F ? -1 : 1);
if (var34 != null) {
break label64;
}

if (!var57) {
break label63;
}
} catch (NumberFormatException var50) {
throw vm.a<"Å">(var50, -4639915619364552821L, ax);
}

var57 = 0;
break label64;
}

var57 = 1;
}

label55: {
try {
if (var57) {
var58 = new Color(0.8F, 0.8F, 0.8F, alpha);
break label55;
}
} catch (NumberFormatException var49) {
throw vm.a<"Å">(var49, -4639915619364552821L, ax);
}

var58 = jl.y.p(jh.f.t(), (char)var22, var23, alpha, (short)var24);
}

Color var36 = var58;
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, a<"i">(8324, 212981386828949063L ^ ax));
int var10003 = b<"t">(12003, 6827109497846918252L ^ ax);
Object var25 = null;
int var26 = 4;
boolean var27 = false;
int var28 = var10003;
VertexFormat var29 = var10002;
g7 var37 = new g7(var10, var29, var28, var27, var26, (DefaultConstructorMarker)var25);
sp var38 = new sp(var37, var36, var15);
class_897 var59 = zf.F(var8).method_1561().method_3953((class_1297)entity);
Intrinsics.checkNotNull(var59, a<"i">(21915, 3721587553514050391L ^ ax));
class_583 var60 = ((class_1007)var59).method_4038();
Intrinsics.checkNotNullExpressionValue(var60, a<"i">(16289, 9030459240411019600L ^ ax));
class_591 var39 = (class_591)var60;
class_10017 var61 = zf.F(var8).method_1561().method_3953((class_1297)entity).method_62425((class_1297)entity, this.n(var12, (char)var13, var14));
Intrinsics.checkNotNull(var61, a<"i">(8165, 1108814715563120900L ^ ax));
class_10055 var40 = (class_10055)var61;
stack.method_22903();
double var62 = pos.field_1352;
class_4184 var69 = zf.F(var8).method_1561().field_4686;
Intrinsics.checkNotNull(var69);
double var41 = var62 - var69.method_71156().method_10216();
double var63 = pos.field_1351;
class_4184 var70 = zf.F(var8).method_1561().field_4686;
Intrinsics.checkNotNull(var70);
double var43 = var63 - var70.method_71156().method_10214();
double var64 = pos.field_1350;
class_4184 var71 = zf.F(var8).method_1561().field_4686;
Intrinsics.checkNotNull(var71);
double var45 = var64 - var71.method_71156().method_10215();

label47: {
try {
stack.method_46416((float)var41, (float)var43, (float)var45);
stack.method_22905(var40.field_53453, var40.field_53453, var40.field_53453);
kf.G.g(var19, var40, (short)var21, stack, var40.field_53446);
stack.method_22905(-1.0F, -1.0F, 1.0F);
stack.method_22905(0.9375F, 0.9375F, 0.9375F);
stack.method_46416(0.0F, -1.501F, 0.0F);
var39.method_62110(var40);
var39.method_62100(stack, var38, b<"t">(2220, 882758722365835818L ^ ax), 0, var36.getRGB());
var65 = var37;
if (depthTest) {
var72 = b6.R.m();
break label47;
}
} catch (NumberFormatException var48) {
throw vm.a<"Å">(var48, -4639915619364552821L, ax);
}

var72 = b6.R.J();
}

Matrix4f var10004 = new class_4587().method_23760().method_23761();
Map var10006 = MapsKt.mapOf(TuplesKt.to(a<"i">(14344, 8612002275887955702L ^ ax), var35));
int var10007 = b<"t">(13061, 5925875356444520840L ^ ax);
var25 = null;
var26 = var10007;
Map var54 = var10006;
Object var55 = null;
Matrix4f var56 = var10004;
Object var30 = null;
Object var31 = null;
RenderPipeline var32 = var72;
g7 var33 = var65;

try {
g7.R(var17, var33, var32, (class_276)var31, (GpuBufferSlice)var30, var56, (Matrix3x2f)var55, var54, var26, var25);
stack.method_22909();
var10000 = var34;
if (ax >= 0L) {
if (var34 == null) {
return;
}

var10000 = new _g[5];
}

vm.a<"Å">(var10000, -4674279341832686308L, ax);
} catch (NumberFormatException var47) {
throw vm.a<"Å">(var47, -4639915619364552821L, ax);
}
}

public static void Q(zi var0, class_4587 var1, class_243 var2, class_1657 var3, float var4, boolean var5, int var6, Object var7, long var8) {
var8 = a ^ var8;
long var10 = var8 ^ 23026865700239L;
_g[] var12 = vm.a<"Å">(6043564070553501150L, var8);

label21: {
int var10000;
label20: {
try {
var10000 = var6 & b<"t">(2189, 6518228950761711252L ^ var8);
if (var12 != null) {
break label20;
}

if (var10000 == 0) {
break label21;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 5983476394381005593L, var8);
}

var10000 = 0;
}

var5 = var10000;
}

var0.D(var1, var2, var3, var10, var4, (boolean)var5);
}

@NotNull
public final class_238 S(@NotNull class_1297 $this$interpolatedBox, long a) {
ax = a ^ ax;
int var4 = (int)((ax ^ 67536027187511L) >>> 56);
long var5 = (ax ^ 67536027187511L) << 8 >>> 8;
Intrinsics.checkNotNullParameter($this$interpolatedBox, a<"i">(13738, 6140045520351466941L ^ ax));
return this.l((byte)var4, $this$interpolatedBox, var5);
}

@NotNull
public final class_243 Q(long a, @NotNull class_1657 entity, float factor) {
ax = a ^ ax;
long var5 = ax ^ 87819611710880L;
Intrinsics.checkNotNullParameter(entity, a<"i">(25463, 2339524926321238911L ^ ax));
class_4184 var10000 = zf.F(var5).method_1561().field_4686;
Intrinsics.checkNotNull(var10000);
class_243 var15 = var10000.method_71156();
Intrinsics.checkNotNullExpressionValue(var15, a<"i">(27903, 1685724731792010456L ^ ax));
class_243 var7 = var15;
double var8 = entity.field_6014 + (entity.method_23317() - entity.field_6014) * factor - var7.field_1352;
double var10 = entity.field_6036 + (entity.method_23318() - entity.field_6036) * factor - var7.field_1351;
double var12 = entity.field_5969 + (entity.method_23321() - entity.field_5969) * factor - var7.field_1350;
return new class_243(var8, var10, var12);
}

public static class_243 I(long var0, byte var2, zi var3, class_1657 var4, float var5, int var6, Object var7) {
long var8 = (var0 << 8 | (long)var2 << 56 >>> 56) ^ a;
long var10001 = var8 ^ 132474409112281L;
int var10 = (int)((var8 ^ 132474409112281L) >>> 32);
int var11 = (int)((var8 ^ 132474409112281L) << 32 >>> 48);
int var12 = (int)(var10001 << 48 >>> 48);
long var13 = var8 ^ 25832911076919L;
if ((var6 & 2) != 0) {
var5 = var3.n(var10, (char)var11, var12);
}

return var3.Q(var13, var4, var5);
}

static {
long var20 = a ^ 6478026844419L;
vm.a<"Å">(0, -5046523004156509534L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[47];
int var16 = 0;
String var15 = "\u0093\u0014Î×_©k¼Äm~ÝPÁ\u009d{r\u008a\u0011Q]\u0088\u008c\u00ad¯æ-\u0081D«Ó(ÜG¹\u0097?â\u0013ªd ¡[XÑ\u0014\u009c\u009d®¯§úx\u0011\u007f )ØðÆ\u0015¤G¦c\u001e\u0013Ä÷ç\u008c\u0098\u008cæìU4gÇÃ£ã\u008eÏ\u0082ÛOy\u0010W\u0003\u009d²\rq|)ég=\u0089 6yö\u0010%?\u0096N\u0084ãÖ\u0086\u0093}\u009a\u0087E \u000f\u0081\u0010\u0015*³\"Èøq¡zº¤D\u00972\u0018n ×y\r±µ;\u0093÷<@Ñ÷\u0014\u0099\u0091\u0082\u009cÉÌí«nbôj¹©)Ý/ë=\u0089wKÆ57,ÀNµ\u0002\u009bàr©aWÛgyÕôlüh,NU\u00adô'\u0085\u008f§àãéG\u00ad\u001aû½î}üÇËçLÞ\u0081\u0092µâAÅÇXÑü\u009d\tÎö©]=¨¾°Å\u0090>nmÝ(\tP\u0005\u001bÍ¼\u0085 #¿¹\u008bÅ\u0013\u0004r°4K\u0098$¾ûY\u009e¦F\u0097Î\u0094\u0089\u008c[\b\u009a½\u0091¤à»\u0088F¸Ç'`o(\u0094½Ô\u0010(@´gép¨\u008cÝçL·\u0002M³ó\u0010È\u0080|ÑÅ*IUª\u00033Ï£ÅxÍ\u0010GìÕ\u0006g7\u001a-7\u0007\u0001ºq\u0014\u0016^\u0010G©\u008aÜ $.\u0096Nî¥F\u0014kë\u0017\u0010×\u0006¡2Ù\u0081ô\u0099ÙÖI`¡Ñ\u0081\"\u0010ÉË\u008b\u0096\u008eÅ\u009aÂ\u001dÇ/úq\u0004U³ ¿èÞÚt$}\u008eáf\u0099Íè\u0010A\u0099t\u0085ý\u0098þ\u0093cÔXúÆ£\u0092' â(\u008e¬8\u0083}Q\u009b45IÈØAd[ä`\u008dB\u0098\u0098eh]¿µÛ{\u0087ñÿPÃFõ6 Úúü(v|Âä5\u0082~F\u0003\u0007\u009cèë\u009a\u001f\u0082îÇÏtß\u0081Jêl\u0090*~N%3`¤ÖÛ\u0006\u00027jÈ\u0010/l\r¾3Za×é\u001f«ÔñÀPÍ\u0010Fs³&=\u0019:þ\u000f\u0010\u0085À\bÃ|>\u0010e\u0012gkç³\u0091\u0088 \u0011>yn\u001cÌp\u0010·qþ\u009d\u0091ÒB\r\u0006éÀ·±ó\u0084\u001b E\u00017c\u0095üàÛZÐé\u0081f\u008b¸FÌ\u000e{yÙ\u0081o\u0004\t±z\u0084CP\u001dé(\u001bjK\u001ch\u0094¼uHï\u0087µÐuÀ=\u0011z\u0096Êb\"?8\u0016EÔ\u0014\u009dË\u0091çº÷\u009a)&ñ\u00adw\u0018(\u001f×o\u001dí\u0080\u0000{ÿõÌÈ WñKç]\f²;ðA\u0010Â,Åð\u0016\u0080v\fò/WhxF05(ä¦z¨mf´ÈèðÜõ\\¶\u001a:â³´46$m\u008eT?·4wÅz\u008d*\u0084\u009aì\u0085é\u0014¥\u0010Î*³ÒÕ\u009cá2F4mðbJyg\u0010A,Í\u000eÙðDYÔ\u0013S\u0011A÷\u008a÷ S\u008a¦f~\u0080ìA®}§\t\u008d\u008a\u0098§\u00ad-ÙX{\u000e/Q\u008b\u000b\u0082mM\nâc Å-Ï¤0ñød\u000biOHÓ8À·¨\u0083\u008e\u0081p*l,Ì°=\u0005 ¯\u0080\u001f\u0010\t<\u0090d\u0012U¯P}§jÒT¯Í\u0003 ²aÊ1wLnÿz\u009a\u000f\u0091xY#µç²ùÇÜ>ñt3b\f\u0013\"UAü\u0010ÀË¿ra\u008cø\u009cr\u009f÷B\u0013\b7@\u0018 \u009fÒKÿäyÎe\u0015dMt\u008b\u0094C'/>SiP\u0086\u001a \u0002Of\u008d\u009fÓÖpoï³¨\bxIn\u0097u\u009d/u\u0001øN\u001fj\u009fauæÓ^\u0010.¾8'Drì\u0097«\u0011$\u00961ðh\u001c\u0010¹~}ß\u008d\u0097\u0082`!«\u0088Ìl\r´\u0082\u0010_K\u001c7Ý\u0011Q\u001bo\u009d@Nÿ®\n\u0001(¶¡\u0006õp$âøë\u0094\u001dà>ö÷H\u0001n®Ò¨\fqFÄ³\u000f\u008d\u0094×Y\u0001Þaì7QGMÛ\u0010wªB\u0090Ô\u0006£¹O\u0015G\u009b\tn\u0088ã\u0010Û!Ü¯o\u007fb°Ôß*\u008e(ïm\u009f(Àu,\u0089y\u0011/¯\u0093îÿÅ\r\n\u0016\u0019r>\u008b\u008aÕIé\u0014à¬\u0099«®r\u00863\u000e£ÐTÌG±\u001cø\u000b,\u00ad(Í6´Å2m!©\u0093\"»sªÃßXûÊ\u009exL\u0010óÄÙ\u001b\u0019ùaZHþgi\u0087\u0086eLq»½õ\u0091kXçÑp!\u001a\f\u009eÇ+\u0091\bß\u0001\u0086R\u0019ö\u0003ëf2\u0092h\ff³¹¢\u0089\u00adîO\u008b\u009ce÷\u0006\u008cv%ß\rÚÌ\u0017ÿã´E7\u0010s ^~\u008a\u0081Ò¹\u00880]P½W\u0087©!;ßá²¯¢w>ÖA³,d\u007f\u008dç1´Ê\u0083\u009dîû¤Ä[÷Z\nÑÀ\u00159#E±U¦\u0088U\u0015»;\u0089&zæÓ\u009fBÖ{þ.MÉº\u0088\u001d\u009fñ(Äº¤²¢Ú\nQ\t7½\u0088ä\u0015¡¬°\u0016¾ÀÈÐlS,Z©·íß \u0016P§Qõb\u008ar\u001bxë\u009a\u0012V§\u009dñR\bí\u008fhØ±]ÚbD´P·F\u0092\u0094§î`L\u0010mHâÓ\u009bl}ïC\u009fç8wç\u0012j\u0010}\u0093\u0001®z^££à±#\u000bO»)'\u0010º\u0093\u001bêF\u0005¼>èªÚÎ/=àÀ ÙòfÎNÁM\u008c\u0000\u0018¸DãU\u0093^\u0015Ti[ZÙ¸»Ø6z³@\tZ\u0013";
int var17 = "\u0093\u0014Î×_©k¼Äm~ÝPÁ\u009d{r\u008a\u0011Q]\u0088\u008c\u00ad¯æ-\u0081D«Ó(ÜG¹\u0097?â\u0013ªd ¡[XÑ\u0014\u009c\u009d®¯§úx\u0011\u007f )ØðÆ\u0015¤G¦c\u001e\u0013Ä÷ç\u008c\u0098\u008cæìU4gÇÃ£ã\u008eÏ\u0082ÛOy\u0010W\u0003\u009d²\rq|)ég=\u0089 6yö\u0010%?\u0096N\u0084ãÖ\u0086\u0093}\u009a\u0087E \u000f\u0081\u0010\u0015*³\"Èøq¡zº¤D\u00972\u0018n ×y\r±µ;\u0093÷<@Ñ÷\u0014\u0099\u0091\u0082\u009cÉÌí«nbôj¹©)Ý/ë=\u0089wKÆ57,ÀNµ\u0002\u009bàr©aWÛgyÕôlüh,NU\u00adô'\u0085\u008f§àãéG\u00ad\u001aû½î}üÇËçLÞ\u0081\u0092µâAÅÇXÑü\u009d\tÎö©]=¨¾°Å\u0090>nmÝ(\tP\u0005\u001bÍ¼\u0085 #¿¹\u008bÅ\u0013\u0004r°4K\u0098$¾ûY\u009e¦F\u0097Î\u0094\u0089\u008c[\b\u009a½\u0091¤à»\u0088F¸Ç'`o(\u0094½Ô\u0010(@´gép¨\u008cÝçL·\u0002M³ó\u0010È\u0080|ÑÅ*IUª\u00033Ï£ÅxÍ\u0010GìÕ\u0006g7\u001a-7\u0007\u0001ºq\u0014\u0016^\u0010G©\u008aÜ $.\u0096Nî¥F\u0014kë\u0017\u0010×\u0006¡2Ù\u0081ô\u0099ÙÖI`¡Ñ\u0081\"\u0010ÉË\u008b\u0096\u008eÅ\u009aÂ\u001dÇ/úq\u0004U³ ¿èÞÚt$}\u008eáf\u0099Íè\u0010A\u0099t\u0085ý\u0098þ\u0093cÔXúÆ£\u0092' â(\u008e¬8\u0083}Q\u009b45IÈØAd[ä`\u008dB\u0098\u0098eh]¿µÛ{\u0087ñÿPÃFõ6 Úúü(v|Âä5\u0082~F\u0003\u0007\u009cèë\u009a\u001f\u0082îÇÏtß\u0081Jêl\u0090*~N%3`¤ÖÛ\u0006\u00027jÈ\u0010/l\r¾3Za×é\u001f«ÔñÀPÍ\u0010Fs³&=\u0019:þ\u000f\u0010\u0085À\bÃ|>\u0010e\u0012gkç³\u0091\u0088 \u0011>yn\u001cÌp\u0010·qþ\u009d\u0091ÒB\r\u0006éÀ·±ó\u0084\u001b E\u00017c\u0095üàÛZÐé\u0081f\u008b¸FÌ\u000e{yÙ\u0081o\u0004\t±z\u0084CP\u001dé(\u001bjK\u001ch\u0094¼uHï\u0087µÐuÀ=\u0011z\u0096Êb\"?8\u0016EÔ\u0014\u009dË\u0091çº÷\u009a)&ñ\u00adw\u0018(\u001f×o\u001dí\u0080\u0000{ÿõÌÈ WñKç]\f²;ðA\u0010Â,Åð\u0016\u0080v\fò/WhxF05(ä¦z¨mf´ÈèðÜõ\\¶\u001a:â³´46$m\u008eT?·4wÅz\u008d*\u0084\u009aì\u0085é\u0014¥\u0010Î*³ÒÕ\u009cá2F4mðbJyg\u0010A,Í\u000eÙðDYÔ\u0013S\u0011A÷\u008a÷ S\u008a¦f~\u0080ìA®}§\t\u008d\u008a\u0098§\u00ad-ÙX{\u000e/Q\u008b\u000b\u0082mM\nâc Å-Ï¤0ñød\u000biOHÓ8À·¨\u0083\u008e\u0081p*l,Ì°=\u0005 ¯\u0080\u001f\u0010\t<\u0090d\u0012U¯P}§jÒT¯Í\u0003 ²aÊ1wLnÿz\u009a\u000f\u0091xY#µç²ùÇÜ>ñt3b\f\u0013\"UAü\u0010ÀË¿ra\u008cø\u009cr\u009f÷B\u0013\b7@\u0018 \u009fÒKÿäyÎe\u0015dMt\u008b\u0094C'/>SiP\u0086\u001a \u0002Of\u008d\u009fÓÖpoï³¨\bxIn\u0097u\u009d/u\u0001øN\u001fj\u009fauæÓ^\u0010.¾8'Drì\u0097«\u0011$\u00961ðh\u001c\u0010¹~}ß\u008d\u0097\u0082`!«\u0088Ìl\r´\u0082\u0010_K\u001c7Ý\u0011Q\u001bo\u009d@Nÿ®\n\u0001(¶¡\u0006õp$âøë\u0094\u001dà>ö÷H\u0001n®Ò¨\fqFÄ³\u000f\u008d\u0094×Y\u0001Þaì7QGMÛ\u0010wªB\u0090Ô\u0006£¹O\u0015G\u009b\tn\u0088ã\u0010Û!Ü¯o\u007fb°Ôß*\u008e(ïm\u009f(Àu,\u0089y\u0011/¯\u0093îÿÅ\r\n\u0016\u0019r>\u008b\u008aÕIé\u0014à¬\u0099«®r\u00863\u000e£ÐTÌG±\u001cø\u000b,\u00ad(Í6´Å2m!©\u0093\"»sªÃßXûÊ\u009exL\u0010óÄÙ\u001b\u0019ùaZHþgi\u0087\u0086eLq»½õ\u0091kXçÑp!\u001a\f\u009eÇ+\u0091\bß\u0001\u0086R\u0019ö\u0003ëf2\u0092h\ff³¹¢\u0089\u00adîO\u008b\u009ce÷\u0006\u008cv%ß\rÚÌ\u0017ÿã´E7\u0010s ^~\u008a\u0081Ò¹\u00880]P½W\u0087©!;ßá²¯¢w>ÖA³,d\u007f\u008dç1´Ê\u0083\u009dîû¤Ä[÷Z\nÑÀ\u00159#E±U¦\u0088U\u0015»;\u0089&zæÓ\u009fBÖ{þ.MÉº\u0088\u001d\u009fñ(Äº¤²¢Ú\nQ\t7½\u0088ä\u0015¡¬°\u0016¾ÀÈÐlS,Z©·íß \u0016P§Qõb\u008ar\u001bxë\u009a\u0012V§\u009dñR\bí\u008fhØ±]ÚbD´P·F\u0092\u0094§î`L\u0010mHâÓ\u009bl}ïC\u009fç8wç\u0012j\u0010}\u0093\u0001®z^££à±#\u000bO»)'\u0010º\u0093\u001bêF\u0005¼>èªÚÎ/=àÀ ÙòfÎNÁM\u008c\u0000\u0018¸DãU\u0093^\u0015Ti[ZÙ¸»Ø6z³@\tZ\u0013"
.length();
char var14 = '8';
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
d = new String[47];
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
String var4 = "`.KK\u0086Aù©Ú\u0094f\u00ad\u008d\u0011E\\2p\u008d$÷]\bÁ÷\u008d\u009eäïLE£ÀÞc\u0085\u0007\u0099-ÁOWH\u009f\u008cu§\u0081Çõé²Ã\u0088\u0099È«½YÂ÷çñ9\u00865\"{»W\n\u009d¬\u0014@ÌIa\u0011V-äÏ\u001euõ´Ùkå8\u0016Î\b\u008ctôQ}5=-ê¦\u008c\u0018\u0081C¼ý×Aî.\"p\u000f1ß{`íø-\u0001\fYý\u0017½Q\u0094¹[ý>g©=áâîä\r»\u0011fÉ³6\u0099ù";
int var5 = "`.KK\u0086Aù©Ú\u0094f\u00ad\u008d\u0011E\\2p\u008d$÷]\bÁ÷\u008d\u009eäïLE£ÀÞc\u0085\u0007\u0099-ÁOWH\u009f\u008cu§\u0081Çõé²Ã\u0088\u0099È«½YÂ÷çñ9\u00865\"{»W\n\u009d¬\u0014@ÌIa\u0011V-äÏ\u001euõ´Ùkå8\u0016Î\b\u008ctôQ}5=-ê¦\u008c\u0018\u0081C¼ý×Aî.\"p\u000f1ß{`íø-\u0001\fYý\u0017½Q\u0094¹[ý>g©=áâîä\r»\u0011fÉ³6\u0099ù"
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
f = var6;
g = new Integer[21];
v = new zi();
t = new Matrix4f();
m = new class_4604(new Matrix4f(), new Matrix4f());
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "Kà]\u00899\u0094\u0086ëp4à\u009eÿ»àÖ";
var5 = "Kà]\u00899\u0094\u0086ëp4à\u009eÿ»àÖ".length();
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

var15 = "W\u0092Äßü\u0018£Ô\u0091,*k¸\u0081!\u008f\u0010º\u0082C©R«|Yí'\u000fV²hð¢";
var17 = "W\u0092Äßü\u0018£Ô\u0091,*k¸\u0081!\u008f\u0010º\u0082C©R«|Yí'\u000fV²hð¢".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

public static void h(int var0) {
N = var0;
}

public static int r() {
return N;
}

public static int A() {
int var0 = r();

try {
return var0 == 0 ? 28 : 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14562;
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
throw new RuntimeException("su/catlean/zi", var10);
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
throw new RuntimeException("su/catlean/zi" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31874;
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
throw new RuntimeException("su/catlean/zi", var14);
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
throw new RuntimeException("su/catlean/zi" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
