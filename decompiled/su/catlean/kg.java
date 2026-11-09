package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_11280;
import net.minecraft.class_241;
import net.minecraft.class_276;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.FrameBufferEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.render.RenderHandEvent;
import su.catlean.gofra.Flow;

public final class kg extends _g {
@NotNull
public static final kg W;
static final KProperty[] h;
@NotNull
private static final cw S;
@NotNull
private static final cs z;
@NotNull
private static final cq J;
@NotNull
private static final ct o;
@NotNull
private static final cq x;
@NotNull
private static final ct I;
@NotNull
private static final ct d;
@NotNull
private static final ct E;
@NotNull
private static final ct a;
@NotNull
private static final cw N;
@NotNull
private static final cs P;
@NotNull
private static final c8 n;
@NotNull
private static final ct j;
@NotNull
private static final ct t;
@NotNull
private static final ct X;
@NotNull
private static final ct Y;
@NotNull
private static final ct f;
@Nullable
private static class_6364 w;
@Nullable
private static class_6364 y;
@Nullable
private static class_6364 B;
private static boolean D;
private static boolean k;
@NotNull
private static final float[] u;
private static int A;
private static int l;
private static final long b = yz.a(5320219153522008638L, 4081742540418562671L, MethodHandles.lookup().lookupClass()).a(40106061994746L);
private static final String[] c;
private static final String[] e;
private static final Map g = new HashMap(13);
private static final long[] i;
private static final Integer[] m;
private static final Map C;

private kg(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 129977037585852L;
super(b<"y">(19673, 6625198418052388124L ^ var1), jt.F(), null, 4, null, var3);
}

private final rw h(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 111268759367519L;
return (rw)S.E(this, var6, h[0]);
}

private final void A(rw var1, int var2, int var3, int var4) {
long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
long var7 = var5 ^ 58079890695230L;
S.b(this, var7, h[0], var1);
}

private final Color e(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 62613074777367L;
return (Color)z.E(this, var3, h[1]);
}

private final void N(byte var1, long var2, Color var4) {
long var5 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
long var7 = var5 ^ 92502818131068L;
z.b(this, var7, h[1], var4);
}

private final boolean K(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 33177928049829L;
return (Boolean)J.E(this, var3, h[2]);
}

private final void F(int var1, int var2, boolean var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ b;
long var6 = var4 ^ 41442231926802L;
J.b(this, var6, h[2], var3);
}

private final float L(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 80179311310495L;
return ((Number)o.E(this, var3, h[3])).floatValue();
}

private final void H(int var1, float var2, char var3, short var4) {
long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
long var7 = var5 ^ 89621461011964L;
o.b(this, var7, h[3], var2);
}

private final boolean v(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 9133284700375L;
return (Boolean)x.E(this, var3, h[4]);
}

private final void w(int var1, int var2, boolean var3, byte var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var4 << 56 >>> 56) ^ b;
long var7 = var5 ^ 48915219019291L;
x.b(this, var7, h[4], var3);
}

private final float i(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 17075534234793L;
return ((Number)I.E(this, var3, h[5])).floatValue();
}

private final void X(float var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 64957859018883L;
I.b(this, var4, h[5], var1);
}

private final float j(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 60838987513004L;
return ((Number)d.E(this, var3, h[c<"n">(5451, 8244733780599759721L ^ var1)])).floatValue();
}

private final void r(long var1, float var3) {
var1 = b ^ var1;
long var4 = var1 ^ 42569576676861L;
d.b(this, var4, h[c<"n">(5451, 8244694153846666708L ^ var1)], var3);
}

private final float D(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 23279350523191L;
return ((Number)E.E(this, var3, h[c<"n">(9004, 7691128080366390406L ^ var1)])).floatValue();
}

private final void Q(long var1, float var3) {
var1 = b ^ var1;
long var4 = var1 ^ 97376004047737L;
E.b(this, var4, h[c<"n">(9004, 7691049156592729380L ^ var1)], var3);
}

private final float R(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 125090089706117L;
return ((Number)a.E(this, var3, h[c<"n">(29922, 7302976103686151395L ^ var1)])).floatValue();
}

private final void e(int var1, char var2, float var3, char var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
long var7 = var5 ^ 19723975262378L;
a.b(this, var7, h[c<"n">(29922, 7302929648029968672L ^ var5)], var3);
}

private final sa t(byte var1, int var2, int var3) {
long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ b;
long var6 = var4 ^ 132789897563440L;
return (sa)N.E(this, var6, h[c<"n">(32352, 7219264193875425742L ^ var4)]);
}

private final void B(sa var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 94629348845769L;
N.b(this, var4, h[c<"n">(12045, 2929413059809106610L ^ var2)], var1);
}

private final Color I(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 70772464060847L;
return (Color)P.E(this, var3, h[c<"n">(32767, 8269408252086500551L ^ var1)]);
}

private final void z(long var1, Color var3) {
var1 = b ^ var1;
long var4 = var1 ^ 13223983002183L;
P.b(this, var4, h[c<"n">(32767, 8269364633314136259L ^ var1)], var3);
}

private final int l(int var1, int var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 118315530600831L;
return ((Number)n.E(this, var6, h[c<"n">(20365, 7545012469649228927L ^ var4)])).intValue();
}

private final void n(int var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 66818521803215L;
n.b(this, var4, h[c<"n">(14926, 3913871499464789743L ^ var2)], var1);
}

private final float T(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 35269679429516L;
return ((Number)j.E(this, var3, h[c<"n">(20589, 1480803074461216114L ^ var1)])).floatValue();
}

private final void x(float var1, short var2, int var3, int var4) {
long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
long var7 = var5 ^ 81836882583030L;
j.b(this, var7, h[c<"n">(7851, 9051401301616369193L ^ var5)], var1);
}

private final float a(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 60829729128212L;
return ((Number)t.E(this, var3, h[c<"n">(30019, 3103487727926853832L ^ var1)])).floatValue();
}

private final void p(float var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 20475023732965L;
t.b(this, var4, h[c<"n">(24975, 2394987992215424016L ^ var2)], var1);
}

private final float Q(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 59561034328353L;
return ((Number)X.E(this, var3, h[c<"n">(19398, 3819920914026014839L ^ var1)])).floatValue();
}

private final void T(long var1, float var3) {
var1 = b ^ var1;
long var4 = var1 ^ 135740803497935L;
X.b(this, var4, h[c<"n">(19398, 3820017301055777141L ^ var1)], var3);
}

private final float w(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 33440474764259L;
return ((Number)Y.E(this, var3, h[c<"n">(6921, 4480594853306712682L ^ var1)])).floatValue();
}

private final void o(long var1, float var3) {
var1 = b ^ var1;
long var4 = var1 ^ 62176661819267L;
Y.b(this, var4, h[c<"n">(6921, 4480613607323372006L ^ var1)], var3);
}

private final float g(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ b;
long var5 = var3 ^ 17452210877283L;
return ((Number)f.E(this, var5, h[c<"n">(18742, 6125453313648226524L ^ var3)])).floatValue();
}

private final void z(long var1, float var3) {
var1 = b ^ var1;
long var4 = var1 ^ 2280416411589L;
f.b(this, var4, h[c<"n">(18742, 6125391840855747478L ^ var1)], var3);
}

@Flow
private final void p(FrameBufferEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kg.b J
// 03: ldc2_w 65785488324693
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -4238789324831716048
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: iload 4
// 15: ifne 42
// 18: getstatic su/catlean/kg.k Z
// 1b: ifeq 46
// 1e: goto 2b
// 21: ldc2_w -4242137772937542722
// 24: lload 2
// 25: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: athrow
// 2b: aload 1
// 2c: getstatic su/catlean/kg.w Lnet/minecraft/class_6364;
// 2f: checkcast net/minecraft/class_276
// 32: invokevirtual su/catlean/api/event/events/render/FrameBufferEvent.setFrameBuffer (Lnet/minecraft/class_276;)V
// 35: goto 42
// 38: ldc2_w -4242137772937542722
// 3b: lload 2
// 3c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: athrow
// 42: aload 1
// 43: invokevirtual su/catlean/api/event/events/render/FrameBufferEvent.cancel ()V
// 46: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@Flow(
priority = -10
)
private final void Z(RenderHandEvent var1) {
long var2 = b ^ 37706273517211L;
int var4 = vm.a<"Å">(-7790433444033438722L, var2);

label33: {
label32: {
boolean var10000;
label31: {
try {
var10000 = k;
if (var4 != 0) {
break label31;
}

if (k) {
break label32;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -7787005556741712528L, var2);
}

var10000 = D;
}

try {
if (!var10000) {
break label33;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -7787005556741712528L, var2);
}
}

try {
var1.cancel();
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -7787005556741712528L, var2);
}
}

try {
;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -7787005556741712528L, var2);
}
}

@Flow(
priority = -10
)
private final void j(Render2DEvent var1) {
long var2 = b ^ 51202198518773L;
long var4 = var2 ^ 95262109065958L;
long var10001 = var2 ^ 12519978506414L;
int var6 = (int)((var2 ^ 12519978506414L) >>> 48);
int var7 = (int)((var2 ^ 12519978506414L) << 16 >>> 48);
int var8 = (int)(var10001 << 32 >>> 32);
long var9 = var2 ^ 86045685825661L;
long var11 = var2 ^ 97868486150373L;
long var13 = var2 ^ 125690318109841L;
var10001 = var2 ^ 24825994410689L;
int var15 = (int)((var2 ^ 24825994410689L) >>> 56);
int var16 = (int)((var2 ^ 24825994410689L) << 8 >>> 32);
int var17 = (int)(var10001 << 40 >>> 40);
long var18 = var2 ^ 123682586547028L;
long var20 = var2 ^ 50629907840606L;
long var22 = var2 ^ 42597441667438L;
long var24 = var2 ^ 135780749300422L;
long var26 = var2 ^ 97282828820176L;
var10001 = var2 ^ 6368179467918L;
int var28 = (int)((var2 ^ 6368179467918L) >>> 32);
int var29 = (int)((var2 ^ 6368179467918L) << 32 >>> 48);
int var30 = (int)(var10001 << 48 >>> 48);
long var31 = var2 ^ 107573816095576L;
int var33 = (int)((var2 ^ 107265313670290L) >>> 32);
int var34 = (int)((var2 ^ 107265313670290L) << 32 >>> 32);
long var35 = var2 ^ 112284606121766L;
long var37 = var2 ^ 123386787390482L;
long var39 = var2 ^ 34724817130868L;
long var41 = var2 ^ 97877472987997L;
int var43 = vm.a<"Å">(-4107487466787627303L, var2);

class_6364 var10000;
label36: {
try {
var10000 = w;
if (var43 == 0) {
break label36;
}

if (w == null) {
return;
}
} catch (NumberFormatException var45) {
throw vm.a<"Å">(var45, -4143044002138456034L, var2);
}

var10000 = y;
}

label28: {
try {
if (var43 == 0) {
break label28;
}

if (var10000 == null) {
return;
}
} catch (NumberFormatException var44) {
throw vm.a<"Å">(var44, -4143044002138456034L, var2);
}

var10000 = B;
}

if (var10000 != null) {
GofraState.INSTANCE.setModifyBuffer(true);
k = true;
rw var48 = this.h((char)var6, (short)var7, var8);
Color var10002 = this.e(var4);
class_6364 var10003 = w;
Intrinsics.checkNotNull(w);
class_6364 var10004 = y;
Intrinsics.checkNotNull(y);
this.d(
var48,
var10002,
var10003,
var10004,
this.K(var18),
this.v(var35),
this.i(var31),
this.j(var41),
this.D(var24),
this.R(var39),
this.t((byte)var15, var16, var17).ordinal(),
this.e(var4),
this.I(var20),
this.l(var28, var29, var30),
var13,
this.T(var9),
this.a(var11),
this.Q(var26),
this.w(var37),
this.g(var33, var34),
this.L(var22)
);
k = false;
GofraState.INSTANCE.setModifyBuffer(false);
}
}

@Flow(
priority = -10
)
public final void g(@NotNull Render3DEvent event) {
long var2 = b ^ 90349734434078L;
long var10001 = var2 ^ 125918067047549L;
int var4 = (int)((var2 ^ 125918067047549L) >>> 48);
int var5 = (int)((var2 ^ 125918067047549L) << 16 >>> 48);
int var6 = (int)(var10001 << 32 >>> 32);
var10001 = var2 ^ 9869780306906L;
int var7 = (int)((var2 ^ 9869780306906L) >>> 48);
int var8 = (int)((var2 ^ 9869780306906L) << 16 >>> 48);
int var9 = (int)(var10001 << 32 >>> 32);
Intrinsics.checkNotNullParameter(event, b<"y">(9668, 2144151631924902123L ^ var2));
GofraState.INSTANCE.setModifyBuffer(true);
int var10000 = vm.a<"Å">(-1700211758682464133L, var2);
k = true;
this.n((short)var4, (short)var5, var6);
this.X((short)var7, event.getStack(), (short)var8, var9);
k = false;
GofraState.INSTANCE.setModifyBuffer(false);
int var10 = var10000;

try {
if (vm.a<"Å">(-1666098310708988303L, var2) != null) {
vm.a<"Å">(++var10, -1699030346204159735L, var2);
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -1699106297654235403L, var2);
}
}

public final void d(
@Nullable rw mode,
@NotNull Color color,
@NotNull class_6364 frameBuffer,
@NotNull class_6364 secondary,
boolean glass,
boolean borders,
float radiusValue,
float distanceValue,
float glowAlphaValue,
float lineWithValue,
int colorModev,
@NotNull Color color1v,
@NotNull Color color2v,
int glowQualityV,
long a,
float glowRadiusV,
float glowAlphaMultV,
float fillAlphaMultV,
float saturationV,
float brightnessV,
float alpha
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kg.b J
// 003: lload 15
// 005: lxor
// 006: lstore 15
// 008: lload 15
// 00a: dup2
// 00b: ldc2_w 113938497400140
// 00e: lxor
// 00f: lstore 23
// 011: dup2
// 012: ldc2_w 74926566457762
// 015: lxor
// 016: lstore 25
// 018: dup2
// 019: ldc2_w 30891499889584
// 01c: lxor
// 01d: lstore 27
// 01f: dup2
// 020: ldc2_w 71610349058647
// 023: lxor
// 024: lstore 29
// 026: dup2
// 027: ldc2_w 88001217547906
// 02a: lxor
// 02b: lstore 31
// 02d: pop2
// 02e: aload 2
// 02f: sipush 19907
// 032: ldc2_w 7633154126891171341
// 035: lload 15
// 037: lxor
// 038: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 040: aload 3
// 041: sipush 2914
// 044: ldc2_w 2123751663857891460
// 047: lload 15
// 049: lxor
// 04a: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 052: aload 4
// 054: sipush 1697
// 057: ldc2_w 7046732962578494799
// 05a: lload 15
// 05c: lxor
// 05d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 065: ldc2_w -8736665210856841497
// 068: lload 15
// 06a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: aload 12
// 071: sipush 20060
// 074: ldc2_w 6151559478016982431
// 077: lload 15
// 079: lxor
// 07a: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 082: istore 33
// 084: aload 13
// 086: sipush 14243
// 089: ldc2_w 4136511089596482643
// 08c: lload 15
// 08e: lxor
// 08f: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 097: iload 33
// 099: ifeq 0be
// 09c: aload 1
// 09d: dup
// 09e: ifnonnull 0c2
// 0a1: goto 0af
// 0a4: ldc2_w -8737379373677166560
// 0a7: lload 15
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: pop
// 0b0: goto 0be
// 0b3: ldc2_w -8737379373677166560
// 0b6: lload 15
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: bipush -1
// 0bf: goto 0ca
// 0c2: getstatic su/catlean/t.K [I
// 0c5: swap
// 0c6: invokevirtual su/catlean/rw.ordinal ()I
// 0c9: iaload
// 0ca: lload 15
// 0cc: lconst_0
// 0cd: lcmp
// 0ce: ifle 104
// 0d1: tableswitch 283 1 5 35 96 118 155 199
// 0f4: aload 0
// 0f5: aload 3
// 0f6: aload 2
// 0f7: iload 6
// 0f9: iload 5
// 0fb: fload 22
// 0fd: lload 25
// 0ff: invokespecial su/catlean/kg.b (Lnet/minecraft/class_6364;Ljava/awt/Color;ZZFJ)V
// 102: iload 33
// 104: ifne 200
// 107: goto 115
// 10a: ldc2_w -8737379373677166560
// 10d: lload 15
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: bipush 4
// 116: anewarray 1085
// 119: ldc2_w -8771909532279075714
// 11c: lload 15
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: goto 131
// 126: ldc2_w -8737379373677166560
// 129: lload 15
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: aload 0
// 132: aload 2
// 133: fload 10
// 135: aload 3
// 136: lload 29
// 138: invokespecial su/catlean/kg.j (Ljava/awt/Color;FLnet/minecraft/class_6364;J)V
// 13b: iload 33
// 13d: lload 15
// 13f: lconst_0
// 140: lcmp
// 141: ifle 15b
// 144: ifne 200
// 147: aload 0
// 148: lload 31
// 14a: aload 2
// 14b: aload 3
// 14c: aload 4
// 14e: fload 7
// 150: fload 8
// 152: fload 9
// 154: fload 10
// 156: invokespecial su/catlean/kg.B (JLjava/awt/Color;Lnet/minecraft/class_6364;Lnet/minecraft/class_6364;FFFF)V
// 159: iload 33
// 15b: ifne 200
// 15e: goto 16c
// 161: ldc2_w -8737379373677166560
// 164: lload 15
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: aload 0
// 16d: iload 11
// 16f: lload 27
// 171: aload 12
// 173: aload 13
// 175: iload 14
// 177: fload 17
// 179: fload 18
// 17b: fload 19
// 17d: fload 20
// 17f: fload 21
// 181: aload 3
// 182: invokespecial su/catlean/kg.o (IJLjava/awt/Color;Ljava/awt/Color;IFFFFFLnet/minecraft/class_6364;)V
// 185: iload 33
// 187: ifne 200
// 18a: goto 198
// 18d: ldc2_w -8737379373677166560
// 190: lload 15
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: aload 0
// 199: aload 12
// 19b: lload 23
// 19d: aload 13
// 19f: aload 12
// 1a1: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 1a4: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 1a7: dup
// 1a8: sipush 26046
// 1ab: ldc2_w 5226088235759605309
// 1ae: lload 15
// 1b0: lxor
// 1b1: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b9: aload 13
// 1bb: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 1be: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 1c1: dup
// 1c2: sipush 16662
// 1c5: ldc2_w 616870708810756814
// 1c8: lload 15
// 1ca: lxor
// 1cb: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1d3: fload 10
// 1d5: aload 3
// 1d6: invokespecial su/catlean/kg.F (Ljava/awt/Color;JLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FLnet/minecraft/class_6364;)V
// 1d9: iload 33
// 1db: ifne 200
// 1de: goto 1ec
// 1e1: ldc2_w -8737379373677166560
// 1e4: lload 15
// 1e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1eb: athrow
// 1ec: aload 0
// 1ed: aload 2
// 1ee: aload 3
// 1ef: invokespecial su/catlean/kg.l (Ljava/awt/Color;Lnet/minecraft/class_6364;)V
// 1f2: goto 200
// 1f5: ldc2_w -8737379373677166560
// 1f8: lload 15
// 1fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ff: athrow
// 200: return
}

private final void l(Color var1, class_6364 var2) {
}

private final void B(long param1, Color param3, class_6364 param4, class_6364 param5, float param6, float param7, float param8, float param9) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kg.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 100217093699443
// 00b: lxor
// 00c: lstore 10
// 00e: dup2
// 00f: ldc2_w 8689878689792
// 012: lxor
// 013: lstore 12
// 015: dup2
// 016: ldc2_w 15017602736926
// 019: lxor
// 01a: lstore 14
// 01c: dup2
// 01d: ldc2_w 124203696588030
// 020: lxor
// 021: lstore 16
// 023: dup2
// 024: ldc2_w 8616333166714
// 027: lxor
// 028: lstore 18
// 02a: dup2
// 02b: ldc2_w 61812458233926
// 02e: lxor
// 02f: lstore 20
// 031: pop2
// 032: ldc2_w 3813536992794111178
// 035: lload 1
// 036: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03b: aload 0
// 03c: aload 3
// 03d: fload 9
// 03f: aload 4
// 041: lload 18
// 043: invokespecial su/catlean/kg.j (Ljava/awt/Color;FLnet/minecraft/class_6364;J)V
// 046: istore 22
// 048: fload 6
// 04a: f2i
// 04b: istore 23
// 04d: fload 7
// 04f: fstore 24
// 051: getstatic su/catlean/kg.A I
// 054: iload 22
// 056: ifeq 07a
// 059: iload 23
// 05b: if_icmpeq 0b9
// 05e: goto 06b
// 061: ldc2_w 3788601748457091597
// 064: lload 1
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: iload 23
// 06d: goto 07a
// 070: ldc2_w 3788601748457091597
// 073: lload 1
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: istore 25
// 07c: bipush -1
// 07d: iload 25
// 07f: if_icmpge 0b4
// 082: getstatic su/catlean/kg.u [F
// 085: iload 25
// 087: aload 0
// 088: iload 25
// 08a: invokespecial su/catlean/kg.W (I)F
// 08d: fastore
// 08e: iinc 25 -1
// 091: iload 22
// 093: lload 1
// 094: lconst_0
// 095: lcmp
// 096: iflt 09e
// 099: ifeq 0b9
// 09c: iload 22
// 09e: ifne 07c
// 0a1: lload 1
// 0a2: lconst_0
// 0a3: lcmp
// 0a4: ifle 091
// 0a7: goto 0b4
// 0aa: ldc2_w 3788601748457091597
// 0ad: lload 1
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: iload 23
// 0b6: putstatic su/catlean/kg.A I
// 0b9: new org/joml/Matrix4f
// 0bc: dup
// 0bd: invokespecial org/joml/Matrix4f.<init> ()V
// 0c0: getstatic su/catlean/kg.u [F
// 0c3: bipush 0
// 0c4: faload
// 0c5: getstatic su/catlean/kg.u [F
// 0c8: bipush 1
// 0c9: faload
// 0ca: getstatic su/catlean/kg.u [F
// 0cd: bipush 2
// 0ce: faload
// 0cf: getstatic su/catlean/kg.u [F
// 0d2: bipush 3
// 0d3: faload
// 0d4: getstatic su/catlean/kg.u [F
// 0d7: bipush 4
// 0d8: faload
// 0d9: getstatic su/catlean/kg.u [F
// 0dc: bipush 5
// 0dd: faload
// 0de: getstatic su/catlean/kg.u [F
// 0e1: sipush 5451
// 0e4: ldc2_w 8244753996311307912
// 0e7: lload 1
// 0e8: lxor
// 0e9: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: faload
// 0ef: getstatic su/catlean/kg.u [F
// 0f2: sipush 9004
// 0f5: ldc2_w 7691074933727858940
// 0f8: lload 1
// 0f9: lxor
// 0fa: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: faload
// 100: getstatic su/catlean/kg.u [F
// 103: sipush 29922
// 106: ldc2_w 7302948674455291691
// 109: lload 1
// 10a: lxor
// 10b: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: faload
// 111: getstatic su/catlean/kg.u [F
// 114: sipush 32352
// 117: ldc2_w 7219227025534635443
// 11a: lload 1
// 11b: lxor
// 11c: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: faload
// 122: getstatic su/catlean/kg.u [F
// 125: sipush 32767
// 128: ldc2_w 8269396537544854565
// 12b: lload 1
// 12c: lxor
// 12d: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: faload
// 133: getstatic su/catlean/kg.u [F
// 136: sipush 14926
// 139: ldc2_w 3913784909792774529
// 13c: lload 1
// 13d: lxor
// 13e: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: faload
// 144: getstatic su/catlean/kg.u [F
// 147: sipush 20589
// 14a: ldc2_w 1480739149983736755
// 14d: lload 1
// 14e: lxor
// 14f: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: faload
// 155: getstatic su/catlean/kg.u [F
// 158: sipush 30019
// 15b: ldc2_w 3103437540990174865
// 15e: lload 1
// 15f: lxor
// 160: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: faload
// 166: getstatic su/catlean/kg.u [F
// 169: sipush 19398
// 16c: ldc2_w 3820029987633559579
// 16f: lload 1
// 170: lxor
// 171: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: faload
// 177: getstatic su/catlean/kg.u [F
// 17a: sipush 6921
// 17d: ldc2_w 4480520707087280324
// 180: lload 1
// 181: lxor
// 182: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: faload
// 188: invokevirtual org/joml/Matrix4f.set (FFFFFFFFFFFFFFFF)Lorg/joml/Matrix4f;
// 18b: astore 25
// 18d: new su/catlean/g7
// 190: dup
// 191: lload 10
// 193: aconst_null
// 194: bipush 0
// 195: bipush 0
// 196: sipush 9004
// 199: ldc2_w 7691074933727858940
// 19c: lload 1
// 19d: lxor
// 19e: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: aconst_null
// 1a4: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1a7: lload 20
// 1a9: invokevirtual su/catlean/g7.u (J)Lsu/catlean/g7;
// 1ac: lload 14
// 1ae: dup2_x1
// 1af: pop2
// 1b0: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 1b3: invokevirtual su/catlean/b6.A ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 1b6: aload 5
// 1b8: checkcast net/minecraft/class_276
// 1bb: getstatic su/catlean/o9.R Lsu/catlean/o9;
// 1be: invokevirtual su/catlean/o9.Z ()Lnet/minecraft/class_11280;
// 1c1: new su/catlean/zj
// 1c4: dup
// 1c5: new net/minecraft/class_241
// 1c8: dup
// 1c9: fconst_1
// 1ca: lload 12
// 1cc: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1cf: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 1d2: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 1d5: i2f
// 1d6: fdiv
// 1d7: fconst_1
// 1d8: lload 12
// 1da: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1dd: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 1e0: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 1e3: i2f
// 1e4: fdiv
// 1e5: invokespecial net/minecraft/class_241.<init> (FF)V
// 1e8: new net/minecraft/class_241
// 1eb: dup
// 1ec: fload 24
// 1ee: fconst_0
// 1ef: invokespecial net/minecraft/class_241.<init> (FF)V
// 1f2: iload 23
// 1f4: i2f
// 1f5: fload 8
// 1f7: aload 25
// 1f9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1fc: aload 25
// 1fe: lload 16
// 200: aload 3
// 201: invokespecial su/catlean/zj.<init> (Lnet/minecraft/class_241;Lnet/minecraft/class_241;FFLorg/joml/Matrix4f;JLjava/awt/Color;)V
// 204: checkcast net/minecraft/class_11280$class_11281
// 207: invokevirtual net/minecraft/class_11280.method_71102 (Lnet/minecraft/class_11280$class_11281;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
// 20a: aconst_null
// 20b: aconst_null
// 20c: sipush 506
// 20f: ldc2_w 6635301210321502254
// 212: lload 1
// 213: lxor
// 214: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: aload 4
// 21b: invokevirtual net/minecraft/class_6364.method_71639 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 21e: dup
// 21f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 222: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 225: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
// 228: sipush 15801
// 22b: ldc2_w 3069737678474612335
// 22e: lload 1
// 22f: lxor
// 230: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: aconst_null
// 236: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 239: new su/catlean/g7
// 23c: dup
// 23d: lload 10
// 23f: aconst_null
// 240: bipush 0
// 241: bipush 0
// 242: sipush 9004
// 245: ldc2_w 7691074933727858940
// 248: lload 1
// 249: lxor
// 24a: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: aconst_null
// 250: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 253: lload 20
// 255: invokevirtual su/catlean/g7.u (J)Lsu/catlean/g7;
// 258: lload 14
// 25a: dup2_x1
// 25b: pop2
// 25c: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 25f: invokevirtual su/catlean/b6.A ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 262: lload 12
// 264: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 267: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 26a: dup
// 26b: sipush 12682
// 26e: ldc2_w 7824154680554516514
// 271: lload 1
// 272: lxor
// 273: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 278: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 27b: getstatic su/catlean/o9.R Lsu/catlean/o9;
// 27e: invokevirtual su/catlean/o9.Z ()Lnet/minecraft/class_11280;
// 281: new su/catlean/zj
// 284: dup
// 285: new net/minecraft/class_241
// 288: dup
// 289: fconst_1
// 28a: lload 12
// 28c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 28f: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 292: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 295: i2f
// 296: fdiv
// 297: fconst_1
// 298: lload 12
// 29a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 29d: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 2a0: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 2a3: i2f
// 2a4: fdiv
// 2a5: invokespecial net/minecraft/class_241.<init> (FF)V
// 2a8: new net/minecraft/class_241
// 2ab: dup
// 2ac: fconst_0
// 2ad: fload 24
// 2af: invokespecial net/minecraft/class_241.<init> (FF)V
// 2b2: iload 23
// 2b4: i2f
// 2b5: fload 8
// 2b7: aload 25
// 2b9: lload 16
// 2bb: aload 3
// 2bc: invokespecial su/catlean/zj.<init> (Lnet/minecraft/class_241;Lnet/minecraft/class_241;FFLorg/joml/Matrix4f;JLjava/awt/Color;)V
// 2bf: checkcast net/minecraft/class_11280$class_11281
// 2c2: invokevirtual net/minecraft/class_11280.method_71102 (Lnet/minecraft/class_11280$class_11281;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
// 2c5: aconst_null
// 2c6: aconst_null
// 2c7: bipush 2
// 2c8: anewarray 679
// 2cb: astore 26
// 2cd: aload 26
// 2cf: bipush 0
// 2d0: sipush 31970
// 2d3: ldc2_w 8171906274749693198
// 2d6: lload 1
// 2d7: lxor
// 2d8: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dd: aload 4
// 2df: invokevirtual net/minecraft/class_6364.method_71639 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 2e2: dup
// 2e3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2e6: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 2e9: aastore
// 2ea: aload 26
// 2ec: bipush 1
// 2ed: sipush 506
// 2f0: ldc2_w 6635301210321502254
// 2f3: lload 1
// 2f4: lxor
// 2f5: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fa: aload 5
// 2fc: invokevirtual net/minecraft/class_6364.method_71639 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
// 2ff: dup
// 300: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 303: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 306: aastore
// 307: aload 26
// 309: invokestatic kotlin/collections/MapsKt.mapOf ([Lkotlin/Pair;)Ljava/util/Map;
// 30c: sipush 15801
// 30f: ldc2_w 3069737678474612335
// 312: lload 1
// 313: lxor
// 314: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 319: aconst_null
// 31a: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 31d: return
}

private final void n(short param1, short param2, int param3) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 32
// 012: lshl
// 013: bipush 32
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/kg.b J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 67586432922666
// 023: lxor
// 024: lstore 6
// 026: pop2
// 027: ldc2_w -6285233769926397728
// 02a: lload 4
// 02c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 031: istore 8
// 033: getstatic su/catlean/kg.w Lnet/minecraft/class_6364;
// 036: iload 8
// 038: ifeq 082
// 03b: ifnonnull 07a
// 03e: goto 04c
// 041: ldc2_w -6288736294364778969
// 044: lload 4
// 046: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: athrow
// 04c: new net/minecraft/class_6364
// 04f: dup
// 050: lload 6
// 052: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 055: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 058: getfield net/minecraft/class_276.field_1482 I
// 05b: lload 6
// 05d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 060: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 063: getfield net/minecraft/class_276.field_1481 I
// 066: invokespecial net/minecraft/class_6364.<init> (II)V
// 069: putstatic su/catlean/kg.w Lnet/minecraft/class_6364;
// 06c: goto 07a
// 06f: ldc2_w -6288736294364778969
// 072: lload 4
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: lload 6
// 07c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 07f: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 082: getfield net/minecraft/class_276.field_1482 I
// 085: getstatic su/catlean/kg.w Lnet/minecraft/class_6364;
// 088: dup
// 089: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 08c: getfield net/minecraft/class_6364.field_1482 I
// 08f: iload 3
// 090: ifgt 0cc
// 093: iload 8
// 095: ifeq 0cc
// 098: if_icmpne 0cf
// 09b: goto 0a9
// 09e: ldc2_w -6288736294364778969
// 0a1: lload 4
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: lload 6
// 0ab: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0ae: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0b1: getfield net/minecraft/class_276.field_1481 I
// 0b4: getstatic su/catlean/kg.w Lnet/minecraft/class_6364;
// 0b7: dup
// 0b8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0bb: getfield net/minecraft/class_6364.field_1481 I
// 0be: goto 0cc
// 0c1: ldc2_w -6288736294364778969
// 0c4: lload 4
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: if_icmpeq 0fd
// 0cf: getstatic su/catlean/kg.w Lnet/minecraft/class_6364;
// 0d2: dup
// 0d3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0d6: lload 6
// 0d8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0db: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0de: getfield net/minecraft/class_276.field_1482 I
// 0e1: lload 6
// 0e3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0e6: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 0e9: getfield net/minecraft/class_276.field_1481 I
// 0ec: invokevirtual net/minecraft/class_6364.method_1234 (II)V
// 0ef: goto 0fd
// 0f2: ldc2_w -6288736294364778969
// 0f5: lload 4
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
// 100: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
// 105: dup
// 106: sipush 4382
// 109: ldc2_w 3252833999504887009
// 10c: lload 4
// 10e: lxor
// 10f: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 117: astore 9
// 119: aload 9
// 11b: getstatic su/catlean/kg.w Lnet/minecraft/class_6364;
// 11e: dup
// 11f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 122: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 125: dup
// 126: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 129: bipush 0
// 12a: getstatic su/catlean/kg.w Lnet/minecraft/class_6364;
// 12d: dup
// 12e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 131: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 134: dup
// 135: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 138: dconst_1
// 139: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 13e: getstatic su/catlean/kg.y Lnet/minecraft/class_6364;
// 141: iload 2
// 142: iflt 191
// 145: iload 8
// 147: ifeq 191
// 14a: ifnonnull 189
// 14d: goto 15b
// 150: ldc2_w -6288736294364778969
// 153: lload 4
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: new net/minecraft/class_6364
// 15e: dup
// 15f: lload 6
// 161: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 164: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 167: getfield net/minecraft/class_276.field_1482 I
// 16a: lload 6
// 16c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 16f: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 172: getfield net/minecraft/class_276.field_1481 I
// 175: invokespecial net/minecraft/class_6364.<init> (II)V
// 178: putstatic su/catlean/kg.y Lnet/minecraft/class_6364;
// 17b: goto 189
// 17e: ldc2_w -6288736294364778969
// 181: lload 4
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: lload 6
// 18b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 18e: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 191: getfield net/minecraft/class_276.field_1482 I
// 194: getstatic su/catlean/kg.y Lnet/minecraft/class_6364;
// 197: dup
// 198: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 19b: getfield net/minecraft/class_6364.field_1482 I
// 19e: iload 3
// 19f: ifge 1db
// 1a2: iload 8
// 1a4: ifeq 1db
// 1a7: if_icmpne 1de
// 1aa: goto 1b8
// 1ad: ldc2_w -6288736294364778969
// 1b0: lload 4
// 1b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: athrow
// 1b8: lload 6
// 1ba: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1bd: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 1c0: getfield net/minecraft/class_276.field_1481 I
// 1c3: getstatic su/catlean/kg.y Lnet/minecraft/class_6364;
// 1c6: dup
// 1c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1ca: getfield net/minecraft/class_6364.field_1481 I
// 1cd: goto 1db
// 1d0: ldc2_w -6288736294364778969
// 1d3: lload 4
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: if_icmpeq 20c
// 1de: getstatic su/catlean/kg.y Lnet/minecraft/class_6364;
// 1e1: dup
// 1e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1e5: lload 6
// 1e7: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1ea: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 1ed: getfield net/minecraft/class_276.field_1482 I
// 1f0: lload 6
// 1f2: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1f5: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 1f8: getfield net/minecraft/class_276.field_1481 I
// 1fb: invokevirtual net/minecraft/class_6364.method_1234 (II)V
// 1fe: goto 20c
// 201: ldc2_w -6288736294364778969
// 204: lload 4
// 206: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: athrow
// 20c: aload 9
// 20e: getstatic su/catlean/kg.y Lnet/minecraft/class_6364;
// 211: dup
// 212: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 215: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 218: dup
// 219: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 21c: bipush 0
// 21d: getstatic su/catlean/kg.y Lnet/minecraft/class_6364;
// 220: dup
// 221: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 224: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 227: dup
// 228: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 22b: dconst_1
// 22c: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 231: getstatic su/catlean/kg.B Lnet/minecraft/class_6364;
// 234: iload 2
// 235: iflt 284
// 238: iload 8
// 23a: ifeq 284
// 23d: ifnonnull 27c
// 240: goto 24e
// 243: ldc2_w -6288736294364778969
// 246: lload 4
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: new net/minecraft/class_6364
// 251: dup
// 252: lload 6
// 254: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 257: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 25a: getfield net/minecraft/class_276.field_1482 I
// 25d: lload 6
// 25f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 262: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 265: getfield net/minecraft/class_276.field_1481 I
// 268: invokespecial net/minecraft/class_6364.<init> (II)V
// 26b: putstatic su/catlean/kg.B Lnet/minecraft/class_6364;
// 26e: goto 27c
// 271: ldc2_w -6288736294364778969
// 274: lload 4
// 276: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: athrow
// 27c: lload 6
// 27e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 281: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 284: getfield net/minecraft/class_276.field_1482 I
// 287: getstatic su/catlean/kg.B Lnet/minecraft/class_6364;
// 28a: dup
// 28b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 28e: getfield net/minecraft/class_6364.field_1482 I
// 291: iload 3
// 292: ifge 2ce
// 295: iload 8
// 297: ifeq 2ce
// 29a: if_icmpne 2d1
// 29d: goto 2ab
// 2a0: ldc2_w -6288736294364778969
// 2a3: lload 4
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: lload 6
// 2ad: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2b0: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 2b3: getfield net/minecraft/class_276.field_1481 I
// 2b6: getstatic su/catlean/kg.B Lnet/minecraft/class_6364;
// 2b9: dup
// 2ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2bd: getfield net/minecraft/class_6364.field_1481 I
// 2c0: goto 2ce
// 2c3: ldc2_w -6288736294364778969
// 2c6: lload 4
// 2c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cd: athrow
// 2ce: if_icmpeq 2ff
// 2d1: getstatic su/catlean/kg.B Lnet/minecraft/class_6364;
// 2d4: dup
// 2d5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2d8: lload 6
// 2da: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2dd: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 2e0: getfield net/minecraft/class_276.field_1482 I
// 2e3: lload 6
// 2e5: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2e8: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
// 2eb: getfield net/minecraft/class_276.field_1481 I
// 2ee: invokevirtual net/minecraft/class_6364.method_1234 (II)V
// 2f1: goto 2ff
// 2f4: ldc2_w -6288736294364778969
// 2f7: lload 4
// 2f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fe: athrow
// 2ff: aload 9
// 301: getstatic su/catlean/kg.B Lnet/minecraft/class_6364;
// 304: dup
// 305: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 308: invokevirtual net/minecraft/class_6364.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 30b: dup
// 30c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 30f: bipush 0
// 310: getstatic su/catlean/kg.B Lnet/minecraft/class_6364;
// 313: dup
// 314: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 317: invokevirtual net/minecraft/class_6364.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
// 31a: dup
// 31b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 31e: dconst_1
// 31f: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
// 324: return
}

private final void X(short param1, class_4587 param2, short param3, int param4) {
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
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 32
// 013: lshl
// 014: bipush 32
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/kg.b J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 78083986326413
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 116384926695728
// 02b: lxor
// 02c: dup2
// 02d: bipush 48
// 02f: lushr
// 030: l2i
// 031: istore 9
// 033: dup2
// 034: bipush 16
// 036: lshl
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 10
// 03d: dup2
// 03e: bipush 32
// 040: lshl
// 041: bipush 32
// 043: lushr
// 044: l2i
// 045: istore 11
// 047: pop2
// 048: dup2
// 049: ldc2_w 90638057642974
// 04c: lxor
// 04d: dup2
// 04e: bipush 32
// 050: lushr
// 051: l2i
// 052: istore 12
// 054: dup2
// 055: bipush 32
// 057: lshl
// 058: bipush 48
// 05a: lushr
// 05b: l2i
// 05c: istore 13
// 05e: dup2
// 05f: bipush 48
// 061: lshl
// 062: bipush 48
// 064: lushr
// 065: l2i
// 066: istore 14
// 068: pop2
// 069: dup2
// 06a: ldc2_w 121575094087593
// 06d: lxor
// 06e: lstore 15
// 070: pop2
// 071: ldc2_w 6850745165111006990
// 074: lload 5
// 076: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: invokestatic com/mojang/blaze3d/systems/RenderSystem.backupProjectionMatrix ()V
// 07e: istore 17
// 080: bipush 0
// 081: iload 17
// 083: ifne 101
// 086: putstatic su/catlean/kg.D Z
// 089: aload 0
// 08a: lload 7
// 08c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08f: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 092: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 095: dup
// 096: sipush 16687
// 099: ldc2_w 7731791509383244559
// 09c: lload 5
// 09e: lxor
// 09f: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a7: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0aa: iload 12
// 0ac: iload 13
// 0ae: i2c
// 0af: iload 14
// 0b1: invokevirtual su/catlean/zi.n (ICI)F
// 0b4: aload 2
// 0b5: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 0b8: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 0bb: dup
// 0bc: sipush 1924
// 0bf: ldc2_w 6988715324031413752
// 0c2: lload 5
// 0c4: lxor
// 0c5: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0cd: lload 15
// 0cf: invokespecial su/catlean/kg.v (Lnet/minecraft/class_4184;FLorg/joml/Matrix4f;J)V
// 0d2: aload 0
// 0d3: iload 9
// 0d5: i2c
// 0d6: iload 10
// 0d8: i2s
// 0d9: iload 11
// 0db: invokespecial su/catlean/kg.h (CSI)Lsu/catlean/rw;
// 0de: getstatic su/catlean/rw.MIRROR Lsu/catlean/rw;
// 0e1: if_acmpne 104
// 0e4: goto 0f2
// 0e7: ldc2_w 6854076025732602240
// 0ea: lload 5
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: bipush 1
// 0f3: goto 101
// 0f6: ldc2_w 6854076025732602240
// 0f9: lload 5
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: goto 105
// 104: bipush 0
// 105: putstatic su/catlean/kg.D Z
// 108: invokestatic com/mojang/blaze3d/systems/RenderSystem.restoreProjectionMatrix ()V
// 10b: return
}

private final void o(int var1, long var2, Color var4, Color var5, int var6, float var7, float var8, float var9, float var10, float var11, class_6364 var12) {
var2 = b ^ var2;
long var13 = var2 ^ 25514285357633L;
long var15 = var2 ^ 83521419773234L;
long var17 = var2 ^ 72265296186924L;
long var19 = var2 ^ 28972300587303L;
long var21 = var2 ^ 22821087532552L;
long var23 = var2 ^ 127709916351860L;
long var25 = var2 ^ 118007736601364L;
g7 var10001 = new g7(var13, null, 0, false, c<"n">(11263, 2173619882322294044L ^ var2), null).u(var23);
RenderPipeline var10002 = b6.R.n();
class_276 var10003 = zf.F(var15).method_1522();
Intrinsics.checkNotNullExpressionValue(var10003, b<"y">(7752, 3434366199017812667L ^ var2));
GpuBufferSlice var10004 = xc.I
.V()
.method_71102(
new i6(
Math.abs(jl.y.B((zf.v(var25).field_6012 - 1) / 6.0F, zf.v(var25).field_6012 / 6.0F, jl.y.K(var19))),
var4,
var5,
var1,
var6,
var7,
var8,
1,
var9,
new class_241(1.0F / var12.field_1482, 1.0F / var12.field_1481),
var10,
var21,
var11
)
);
String var10007 = b<"y">(9435, 7670968165434427431L ^ var2);
GpuTextureView var10008 = var12.method_71639();
Intrinsics.checkNotNull(var10008);
g7.R(var17, var10001, var10002, var10003, var10004, null, null, MapsKt.mapOf(TuplesKt.to(var10007, var10008)), c<"n">(8673, 505809945037045533L ^ var2), null);
}

private final void j(Color var1, float var2, class_6364 var3, long var4) {
var4 = b ^ var4;
long var6 = var4 ^ 81423593636774L;
long var8 = var4 ^ 25079136443605L;
long var10 = var4 ^ 31340288628683L;
long var12 = var4 ^ 2866338507164L;
long var14 = var4 ^ 45215833953427L;
g7 var10001 = new g7(var6, null, 0, false, c<"n">(9004, 7691091323526816809L ^ var4), null).u(var14);
RenderPipeline var10002 = b6.R.p();
class_276 var10003 = zf.F(var8).method_1522();
Intrinsics.checkNotNullExpressionValue(var10003, b<"y">(12682, 7824135816318043383L ^ var4));
GpuBufferSlice var10004 = cf.O.P().method_71102(new z0(1.0F / var3.field_1482, 1.0F / var3.field_1481, var12, var1, var2));
String var10007 = b<"y">(31970, 8171887479097952731L ^ var4);
GpuTextureView var10008 = var3.method_71639();
Intrinsics.checkNotNull(var10008);
g7.R(var10, var10001, var10002, var10003, var10004, null, null, MapsKt.mapOf(TuplesKt.to(var10007, var10008)), c<"n">(15801, 3069756268906920634L ^ var4), null);
}

private final void F(Color var1, long var2, Color var4, Color var5, Color var6, float var7, class_6364 var8) {
var2 = b ^ var2;
long var9 = var2 ^ 119351279817917L;
long var11 = var2 ^ 53113642273742L;
int var13 = (int)((var2 ^ 119497767166676L) >>> 56);
long var14 = (var2 ^ 119497767166676L) << 8 >>> 8;
long var16 = var2 ^ 63778922578128L;
long var18 = var2 ^ 107621158100955L;
long var20 = var2 ^ 17175229989768L;
long var22 = var2 ^ 18605570901480L;
g7 var10001 = new g7(var9, null, 0, false, c<"n">(9004, 7691048987115434802L ^ var2), null).u(var20);
RenderPipeline var10002 = b6.R.G();
class_276 var10003 = zf.F(var11).method_1522();
Intrinsics.checkNotNullExpressionValue(var10003, b<"y">(12682, 7824103386207179756L ^ var2));
GpuBufferSlice var10004 = ol.f
.g()
.method_71102(
new lc(
(byte)var13,
1.0F / var8.field_1482,
1.0F / var8.field_1481,
var1,
var4,
var5,
var14,
var6,
var7,
Math.abs(jl.y.B((zf.v(var22).field_6012 - 1) / 1000.0F, zf.v(var22).field_6012 / 1000.0F, jl.y.K(var18)))
)
);
String var10007 = b<"y">(31970, 8171859438510776000L ^ var2);
GpuTextureView var10008 = var8.method_71639();
Intrinsics.checkNotNull(var10008);
g7.R(var16, var10001, var10002, var10003, var10004, null, null, MapsKt.mapOf(TuplesKt.to(var10007, var10008)), c<"n">(15801, 3069715031965478305L ^ var2), null);
}

private final void b(class_6364 var1, Color var2, boolean var3, boolean var4, float var5, long var6) {
var6 = b ^ var6;
long var8 = var6 ^ 86903536367699L;
long var10 = var6 ^ 21762986141472L;
long var12 = var6 ^ 28058430958654L;
long var14 = var6 ^ 32749837289029L;
long var16 = var6 ^ 48496752373606L;

g7 var10000;
RenderPipeline var10001;
class_276 var10002;
class_11280 var10003;
c1 var10004;
c1 var10005;
class_241 var10006;
class_241 var10007;
float var10008;
float var10009;
label22: {
try {
var10000 = new g7(var8, null, 0, false, c<"n">(9004, 7691088008449990620L ^ var6), null).u(var16);
var10001 = b6.R.N();
var10002 = zf.F(var10).method_1522();
Intrinsics.checkNotNullExpressionValue(var10002, b<"y">(12682, 7824141330418138882L ^ var6));
var10003 = j5.r.W();
var10004 = new c1;
var10005 = var10004;
var10006 = new class_241;
var10007 = var10006;
var10008 = 0.0F;
if (var4) {
var10009 = 0.0F;
break label22;
}
} catch (NumberFormatException var28) {
throw vm.a<"Å">(var28, 4301998792952675629L, var6);
}

var10009 = 0.5F;
}

var10007./* $VF: Unable to resugar constructor */<init>(var10008, var10009);
var10007 = new class_241(1.0F / var1.field_1482, 1.0F / var1.field_1481);
float var20 = var3 ? 1.0F : 0.0F;
var10005./* $VF: Unable to resugar constructor */<init>(var10006, var10007, var14, var2, var20, var5, var5);
GpuBufferSlice var31 = var10003.method_71102(var10004);
Pair[] var27 = new Pair[2];
String var35 = b<"y">(31970, 8171892959039631918L ^ var6);
GpuTextureView var36 = var1.method_71639();
Intrinsics.checkNotNull(var36);
var27[0] = TuplesKt.to(var35, var36);
var27[1] = TuplesKt.to(b<"y">(13189, 3267871285696068958L ^ var6), dv.D.R());
Map var32 = MapsKt.mapOf(var27);
int var34 = c<"n">(15801, 3069750753665188175L ^ var6);
Object var18 = null;
int var19 = var34;
Map var30 = var32;
Object var21 = null;
Object var22 = null;
GpuBufferSlice var23 = var31;
class_276 var24 = var10002;
RenderPipeline var25 = var10001;
g7 var26 = var10000;
g7.R(var12, var26, var25, var24, var23, (Matrix4f)var22, (Matrix3x2f)var21, var30, var19, var18);
}

private final void v(class_4184 param1, float param2, Matrix4f param3, long param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kg.b J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 69717541785739
// 00e: lxor
// 00f: lstore 6
// 011: dup2
// 012: ldc2_w 137425981934579
// 015: lxor
// 016: lstore 8
// 018: dup2
// 019: ldc2_w 34969236151981
// 01c: lxor
// 01d: lstore 10
// 01f: pop2
// 020: ldc2_w -3741149875618839544
// 023: lload 4
// 025: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02a: istore 12
// 02c: getstatic su/catlean/kt.w Lsu/catlean/kt;
// 02f: lload 8
// 031: invokevirtual su/catlean/kt.f (J)Z
// 034: ifeq 0c7
// 037: new org/joml/Matrix4f
// 03a: dup
// 03b: invokespecial org/joml/Matrix4f.<init> ()V
// 03e: lload 6
// 040: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 043: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 046: dup
// 047: sipush 7778
// 04a: ldc2_w 8443207246730602296
// 04d: lload 4
// 04f: lxor
// 050: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 058: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 05b: aload 1
// 05c: fload 2
// 05d: bipush 0
// 05e: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.iGetFov (Lnet/minecraft/class_4184;FZ)F 4
// 063: ldc 0.017453292
// 065: fmul
// 066: lload 6
// 068: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06b: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 06e: invokevirtual net/minecraft/class_1041.method_4489 ()I
// 071: i2f
// 072: lload 6
// 074: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 077: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 07a: invokevirtual net/minecraft/class_1041.method_4506 ()I
// 07d: i2f
// 07e: fdiv
// 07f: ldc 0.05
// 081: lload 6
// 083: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 086: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 089: invokevirtual net/minecraft/class_757.method_3193 ()F
// 08c: ldc 4.0
// 08e: fmul
// 08f: lload 6
// 091: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 094: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 097: invokevirtual net/minecraft/class_315.method_71270 ()Lnet/minecraft/class_7172;
// 09a: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
// 09d: checkcast java/lang/Number
// 0a0: invokevirtual java/lang/Number.intValue ()I
// 0a3: sipush 18742
// 0a6: ldc2_w 6125342940978250361
// 0a9: lload 4
// 0ab: lxor
// 0ac: invokedynamic n (IJ)I bsm=su/catlean/kg.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: imul
// 0b2: i2f
// 0b3: invokestatic java/lang/Math.max (FF)F
// 0b6: invokevirtual org/joml/Matrix4f.perspective (FFFF)Lorg/joml/Matrix4f;
// 0b9: goto 0f7
// 0bc: ldc2_w -3739982511895967098
// 0bf: lload 4
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: lload 6
// 0c9: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0cc: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 0cf: lload 6
// 0d1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d4: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 0d7: dup
// 0d8: sipush 27325
// 0db: ldc2_w 4603147713130583018
// 0de: lload 4
// 0e0: lxor
// 0e1: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0e9: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 0ec: aload 1
// 0ed: fload 2
// 0ee: bipush 0
// 0ef: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.iGetFov (Lnet/minecraft/class_4184;FZ)F 4
// 0f4: invokevirtual net/minecraft/class_757.method_22973 (F)Lorg/joml/Matrix4f;
// 0f7: astore 13
// 0f9: lload 6
// 0fb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0fe: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 101: dup
// 102: sipush 27325
// 105: ldc2_w 4603147713130583018
// 108: lload 4
// 10a: lxor
// 10b: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 113: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 116: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.getLevelProjectionMatrixBuffer ()Lnet/minecraft/class_11286; 1
// 11b: aload 13
// 11d: invokevirtual net/minecraft/class_11286.method_71123 (Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
// 120: getstatic net/minecraft/class_10366.field_54953 Lnet/minecraft/class_10366;
// 123: invokestatic com/mojang/blaze3d/systems/RenderSystem.setProjectionMatrix (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lnet/minecraft/class_10366;)V
// 126: new net/minecraft/class_4587
// 129: dup
// 12a: invokespecial net/minecraft/class_4587.<init> ()V
// 12d: astore 14
// 12f: aload 14
// 131: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 134: aload 14
// 136: aload 3
// 137: new org/joml/Matrix4f
// 13a: dup
// 13b: invokespecial org/joml/Matrix4f.<init> ()V
// 13e: invokevirtual org/joml/Matrix4f.invert (Lorg/joml/Matrix4f;)Lorg/joml/Matrix4f;
// 141: checkcast org/joml/Matrix4fc
// 144: invokevirtual net/minecraft/class_4587.method_34425 (Lorg/joml/Matrix4fc;)V
// 147: invokestatic com/mojang/blaze3d/systems/RenderSystem.getModelViewStack ()Lorg/joml/Matrix4fStack;
// 14a: dup
// 14b: sipush 15921
// 14e: ldc2_w 4952921736587085635
// 151: lload 4
// 153: lxor
// 154: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15c: astore 15
// 15e: aload 15
// 160: invokevirtual org/joml/Matrix4fStack.pushMatrix ()Lorg/joml/Matrix4fStack;
// 163: aload 3
// 164: checkcast org/joml/Matrix4fc
// 167: invokevirtual org/joml/Matrix4fStack.mul (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
// 16a: pop
// 16b: lload 6
// 16d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 170: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 173: dup
// 174: sipush 27325
// 177: ldc2_w 4603147713130583018
// 17a: lload 4
// 17c: lxor
// 17d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 185: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 188: aload 14
// 18a: fload 2
// 18b: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.itiltViewWhenHurt (Lnet/minecraft/class_4587;F)V 3
// 190: lload 6
// 192: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 195: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 198: invokevirtual net/minecraft/class_315.method_42448 ()Lnet/minecraft/class_7172;
// 19b: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
// 19e: checkcast java/lang/Boolean
// 1a1: invokevirtual java/lang/Boolean.booleanValue ()Z
// 1a4: iload 12
// 1a6: lload 4
// 1a8: lconst_0
// 1a9: lcmp
// 1aa: iflt 201
// 1ad: ifne 1ff
// 1b0: ifeq 1f4
// 1b3: goto 1c1
// 1b6: ldc2_w -3739982511895967098
// 1b9: lload 4
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: lload 6
// 1c3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1c6: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 1c9: dup
// 1ca: sipush 27325
// 1cd: ldc2_w 4603147713130583018
// 1d0: lload 4
// 1d2: lxor
// 1d3: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1db: checkcast su/catlean/mixins/accessors/GameRendererAccessor
// 1de: aload 14
// 1e0: fload 2
// 1e1: invokeinterface su/catlean/mixins/accessors/GameRendererAccessor.ibobView (Lnet/minecraft/class_4587;F)V 3
// 1e6: goto 1f4
// 1e9: ldc2_w -3739982511895967098
// 1ec: lload 4
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: lload 6
// 1f6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1f9: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 1fc: instanceof net/minecraft/class_1309
// 1ff: iload 12
// 201: lload 4
// 203: lconst_0
// 204: lcmp
// 205: iflt 24c
// 208: ifne 24a
// 20b: ifeq 264
// 20e: goto 21c
// 211: ldc2_w -3739982511895967098
// 214: lload 4
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: lload 6
// 21e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 221: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
// 224: dup
// 225: sipush 30070
// 228: ldc2_w 3973876050678729739
// 22b: lload 4
// 22d: lxor
// 22e: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 233: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 236: checkcast net/minecraft/class_1309
// 239: invokevirtual net/minecraft/class_1309.method_6113 ()Z
// 23c: goto 24a
// 23f: ldc2_w -3739982511895967098
// 242: lload 4
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: iload 12
// 24c: ifne 261
// 24f: ifeq 264
// 252: goto 260
// 255: ldc2_w -3739982511895967098
// 258: lload 4
// 25a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25f: athrow
// 260: bipush 1
// 261: goto 265
// 264: bipush 0
// 265: istore 16
// 267: lload 6
// 269: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 26c: iload 12
// 26e: ifne 392
// 271: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 274: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 277: invokevirtual net/minecraft/class_5498.method_31034 ()Z
// 27a: ifeq 371
// 27d: goto 28b
// 280: ldc2_w -3739982511895967098
// 283: lload 4
// 285: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: athrow
// 28b: iload 16
// 28d: lload 4
// 28f: lconst_0
// 290: lcmp
// 291: ifle 2e4
// 294: iload 12
// 296: ifne 2e4
// 299: goto 2a7
// 29c: ldc2_w -3739982511895967098
// 29f: lload 4
// 2a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a6: athrow
// 2a7: ifne 371
// 2aa: goto 2b8
// 2ad: ldc2_w -3739982511895967098
// 2b0: lload 4
// 2b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b7: athrow
// 2b8: lload 6
// 2ba: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2bd: iload 12
// 2bf: ifne 392
// 2c2: goto 2d0
// 2c5: ldc2_w -3739982511895967098
// 2c8: lload 4
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 2d3: getfield net/minecraft/class_315.field_1842 Z
// 2d6: goto 2e4
// 2d9: ldc2_w -3739982511895967098
// 2dc: lload 4
// 2de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e3: athrow
// 2e4: ifne 371
// 2e7: lload 4
// 2e9: lconst_0
// 2ea: lcmp
// 2eb: iflt 3a6
// 2ee: lload 6
// 2f0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2f3: iload 12
// 2f5: ifne 392
// 2f8: goto 306
// 2fb: ldc2_w -3739982511895967098
// 2fe: lload 4
// 300: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 305: athrow
// 306: lload 4
// 308: lconst_0
// 309: lcmp
// 30a: iflt 384
// 30d: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
// 310: dup
// 311: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 314: invokevirtual net/minecraft/class_636.method_2920 ()Lnet/minecraft/class_1934;
// 317: getstatic net/minecraft/class_1934.field_9219 Lnet/minecraft/class_1934;
// 31a: if_acmpeq 371
// 31d: goto 32b
// 320: ldc2_w -3739982511895967098
// 323: lload 4
// 325: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32a: athrow
// 32b: lload 6
// 32d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 330: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 333: getfield net/minecraft/class_757.field_4012 Lnet/minecraft/class_759;
// 336: fload 2
// 337: aload 14
// 339: lload 6
// 33b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 33e: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 341: invokevirtual net/minecraft/class_757.method_72910 ()Lnet/minecraft/class_11661;
// 344: checkcast net/minecraft/class_11659
// 347: lload 10
// 349: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 34c: lload 6
// 34e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 351: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
// 354: lload 10
// 356: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 359: checkcast net/minecraft/class_1297
// 35c: fload 2
// 35d: invokevirtual net/minecraft/class_898.method_23839 (Lnet/minecraft/class_1297;F)I
// 360: invokevirtual net/minecraft/class_759.method_22976 (FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V
// 363: goto 371
// 366: ldc2_w -3739982511895967098
// 369: lload 4
// 36b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: athrow
// 371: lload 6
// 373: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 376: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 379: invokevirtual net/minecraft/class_757.method_72911 ()Lnet/minecraft/class_11684;
// 37c: invokevirtual net/minecraft/class_11684.method_73002 ()V
// 37f: lload 6
// 381: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 384: invokevirtual net/minecraft/class_310.method_22940 ()Lnet/minecraft/class_4599;
// 387: invokevirtual net/minecraft/class_4599.method_23000 ()Lnet/minecraft/class_4597$class_4598;
// 38a: invokevirtual net/minecraft/class_4597$class_4598.method_22993 ()V
// 38d: lload 6
// 38f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 392: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 395: invokevirtual net/minecraft/class_757.method_72910 ()Lnet/minecraft/class_11661;
// 398: invokevirtual net/minecraft/class_11661.method_72953 ()V
// 39b: aload 15
// 39d: invokevirtual org/joml/Matrix4fStack.popMatrix ()Lorg/joml/Matrix4fStack;
// 3a0: pop
// 3a1: aload 14
// 3a3: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 3a6: return
}

private final float W(int var1) {
return (float)(0.06649038007 * Math.exp(-(var1 * var1) / 72.0));
}

private static final boolean M() {
long var0 = b ^ 100039296136409L;
long var10001 = var0 ^ 139699426432898L;
int var2 = (int)((var0 ^ 139699426432898L) >>> 48);
int var3 = (int)((var0 ^ 139699426432898L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.MIRROR) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -3914605528904986830L, var0);
}

return false;
}

private static final boolean r() {
long var0 = b ^ 18275551939684L;
long var10001 = var0 ^ 58743942131519L;
int var2 = (int)((var0 ^ 58743942131519L) >>> 48);
int var3 = (int)((var0 ^ 58743942131519L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.MIRROR) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 8147519013638584207L, var0);
}

return false;
}

private static final boolean x() {
long var0 = b ^ 17754820589399L;
long var10001 = var0 ^ 59200315298828L;
int var2 = (int)((var0 ^ 59200315298828L) >>> 48);
int var3 = (int)((var0 ^ 59200315298828L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.MIRROR) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 5342058448070970556L, var0);
}

return false;
}

private static final boolean V() {
long var0 = b ^ 136222705666488L;
long var10001 = var0 ^ 103451434347235L;
int var2 = (int)((var0 ^ 103451434347235L) >>> 48);
int var3 = (int)((var0 ^ 103451434347235L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.BLOOM) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 3804879899028124243L, var0);
}

return false;
}

private static final boolean P() {
long var0 = b ^ 6219216730265L;
long var10001 = var0 ^ 35573036325826L;
int var2 = (int)((var0 ^ 35573036325826L) >>> 48);
int var3 = (int)((var0 ^ 35573036325826L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.BLOOM) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 5038639952323609458L, var0);
}

return false;
}

private static final boolean q() {
long var0 = b ^ 52013966246890L;
long var10001 = var0 ^ 11802737828017L;
int var2 = (int)((var0 ^ 11802737828017L) >>> 48);
int var3 = (int)((var0 ^ 11802737828017L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.BLOOM) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 4512592194923165697L, var0);
}

return false;
}

private static final boolean Z() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kg.b J
// 03: ldc2_w 20869906108624
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 60513393488779
// 0d: lxor
// 0e: dup2
// 0f: bipush 48
// 11: lushr
// 12: l2i
// 13: istore 2
// 14: dup2
// 15: bipush 16
// 17: lshl
// 18: bipush 48
// 1a: lushr
// 1b: l2i
// 1c: istore 3
// 1d: dup2
// 1e: bipush 32
// 20: lshl
// 21: bipush 32
// 23: lushr
// 24: l2i
// 25: istore 4
// 27: pop2
// 28: pop2
// 29: ldc2_w 7902096330767377845
// 2c: lload 0
// 2d: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: istore 5
// 34: getstatic su/catlean/kg.W Lsu/catlean/kg;
// 37: iload 2
// 38: i2c
// 39: iload 3
// 3a: i2s
// 3b: iload 4
// 3d: invokespecial su/catlean/kg.h (CSI)Lsu/catlean/rw;
// 40: getstatic su/catlean/rw.DEFAULT Lsu/catlean/rw;
// 43: iload 5
// 45: ifne 74
// 48: if_acmpeq a8
// 4b: goto 58
// 4e: ldc2_w 7900948737851403067
// 51: lload 0
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: getstatic su/catlean/kg.W Lsu/catlean/kg;
// 5b: iload 2
// 5c: i2c
// 5d: iload 3
// 5e: i2s
// 5f: iload 4
// 61: invokespecial su/catlean/kg.h (CSI)Lsu/catlean/rw;
// 64: getstatic su/catlean/rw.BLOOM Lsu/catlean/rw;
// 67: goto 74
// 6a: ldc2_w 7900948737851403067
// 6d: lload 0
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: iload 5
// 76: ifne a5
// 79: if_acmpeq a8
// 7c: goto 89
// 7f: ldc2_w 7900948737851403067
// 82: lload 0
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: getstatic su/catlean/kg.W Lsu/catlean/kg;
// 8c: iload 2
// 8d: i2c
// 8e: iload 3
// 8f: i2s
// 90: iload 4
// 92: invokespecial su/catlean/kg.h (CSI)Lsu/catlean/rw;
// 95: getstatic su/catlean/rw.CAMOUFLAGE Lsu/catlean/rw;
// 98: goto a5
// 9b: ldc2_w 7900948737851403067
// 9e: lload 0
// 9f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: athrow
// a5: if_acmpne b6
// a8: bipush 1
// a9: goto b7
// ac: ldc2_w 7900948737851403067
// af: lload 0
// b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b5: athrow
// b6: bipush 0
// b7: ireturn
}

private static final boolean F() {
long var0 = b ^ 100448337755869L;
long var10001 = var0 ^ 139264507043206L;
int var2 = (int)((var0 ^ 139264507043206L) >>> 48);
int var3 = (int)((var0 ^ 139264507043206L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.DOUBLE) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 263608618343875894L, var0);
}

return false;
}

private static final boolean z() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kg.b J
// 03: ldc2_w 70434748025078
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 112137941248941
// 0d: lxor
// 0e: dup2
// 0f: bipush 48
// 11: lushr
// 12: l2i
// 13: istore 2
// 14: dup2
// 15: bipush 16
// 17: lshl
// 18: bipush 48
// 1a: lushr
// 1b: l2i
// 1c: istore 3
// 1d: dup2
// 1e: bipush 32
// 20: lshl
// 21: bipush 32
// 23: lushr
// 24: l2i
// 25: istore 4
// 27: pop2
// 28: pop2
// 29: ldc2_w -5363874796864307821
// 2c: lload 0
// 2d: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: istore 5
// 34: getstatic su/catlean/kg.W Lsu/catlean/kg;
// 37: iload 2
// 38: i2c
// 39: iload 3
// 3a: i2s
// 3b: iload 4
// 3d: invokespecial su/catlean/kg.h (CSI)Lsu/catlean/rw;
// 40: getstatic su/catlean/rw.DOUBLE Lsu/catlean/rw;
// 43: iload 5
// 45: ifne 74
// 48: if_acmpeq 77
// 4b: goto 58
// 4e: ldc2_w -5367272675078966499
// 51: lload 0
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: getstatic su/catlean/kg.W Lsu/catlean/kg;
// 5b: iload 2
// 5c: i2c
// 5d: iload 3
// 5e: i2s
// 5f: iload 4
// 61: invokespecial su/catlean/kg.h (CSI)Lsu/catlean/rw;
// 64: getstatic su/catlean/rw.CAMOUFLAGE Lsu/catlean/rw;
// 67: goto 74
// 6a: ldc2_w -5367272675078966499
// 6d: lload 0
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: if_acmpne 85
// 77: bipush 1
// 78: goto 86
// 7b: ldc2_w -5367272675078966499
// 7e: lload 0
// 7f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: athrow
// 85: bipush 0
// 86: ireturn
}

private static final boolean W() {
long var0 = b ^ 65693818704659L;
long var10001 = var0 ^ 33320100425800L;
int var2 = (int)((var0 ^ 33320100425800L) >>> 48);
int var3 = (int)((var0 ^ 33320100425800L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.DOUBLE) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 3343612938938837240L, var0);
}

return false;
}

private static final boolean s() {
long var0 = b ^ 94154309963359L;
long var10001 = var0 ^ 123490950098180L;
int var2 = (int)((var0 ^ 123490950098180L) >>> 48);
int var3 = (int)((var0 ^ 123490950098180L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.DOUBLE) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 8298595197358454196L, var0);
}

return false;
}

private static final boolean Y() {
long var0 = b ^ 77623738000653L;
long var10001 = var0 ^ 109312677627478L;
int var2 = (int)((var0 ^ 109312677627478L) >>> 48);
int var3 = (int)((var0 ^ 109312677627478L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.DOUBLE) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 1763330116843691750L, var0);
}

return false;
}

private static final boolean p() {
long var0 = b ^ 121499010168569L;
long var10001 = var0 ^ 82956376004002L;
int var2 = (int)((var0 ^ 82956376004002L) >>> 48);
int var3 = (int)((var0 ^ 82956376004002L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.DOUBLE) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 832237391517601042L, var0);
}

return false;
}

private static final boolean G() {
long var0 = b ^ 79641969145963L;
long var10001 = var0 ^ 120522943896368L;
int var2 = (int)((var0 ^ 120522943896368L) >>> 48);
int var3 = (int)((var0 ^ 120522943896368L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.DOUBLE) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -4242789352488008832L, var0);
}

return false;
}

private static final boolean C() {
long var0 = b ^ 67138334714220L;
long var10001 = var0 ^ 27477666875959L;
int var2 = (int)((var0 ^ 27477666875959L) >>> 48);
int var3 = (int)((var0 ^ 27477666875959L) << 16 >>> 48);
int var4 = (int)(var10001 << 32 >>> 32);

try {
if (W.h((char)var2, (short)var3, var4) == rw.DOUBLE) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 1448436080464646791L, var0);
}

return false;
}

static {
long var20 = b ^ 68224145163156L;
long var22 = var20 ^ 37517077460903L;
long var24 = var20 ^ 19879348419049L;
long var26 = var20 ^ 67839724139663L;
int var28 = (int)((var20 ^ 105774706684796L) >>> 48);
long var29 = (var20 ^ 105774706684796L) << 16 >>> 16;
long var31 = var20 ^ 91711430525789L;
long var33 = var20 ^ 115515257728753L;
vm.a<"Å">(111, 9127398779637833640L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[73];
int var16 = 0;
String var15 = "\u0013Ì\u001bÒ4\u0080Ý´\u0013â½\u001b\u0007(}iY´\u0087µqß\u0082À Lpjá¦»@ð\u0096Ô¹5Ò\u000e\neF\u008b¯\u0003Ä\u00ad¨¦|\u0013sÈ&öâ\u0083\u0010\u00825qÆÊL\\\u0097Øc1tM\u0005ê4 \\³ø\u0012ñ\u0014ßGBµ;yrRÙÛØ1ÑþH°\u0094<íH\u0097E\u008c\ráù\u0018\u0005 ¿#³\u0003>f§ÁZMU\u001f\u0002R\u0095Î{ªfÝ÷Ò(/çw>º\u001dà-\u008bt\txßI\b\u0000w¼\u008e\u008f\u0094j\u009aè°k¨÷ÇÔ©.\n¾Â6\nJ}D\u0010ä#\u001cò\u009c¥ãüW¦þ\u0093fkÖå\u0018\u0085C¥¶1'\u009e¢Ë0û(\u0017\u0005\u0004èùÛoCð¶\u008a]\u0010Çn·\t\u0093\u007f\u0018BpßÎ(\u000e÷\u0088\b(N\u009dÙ9$\u009dþp¿Wxµ\u0017\u0018\u0099tk©9ª²Ë¢ÓR\u0005¥\u0091ß\u009cuÄ\u009e=\u009c·\u0091Ï\u000bå\u0018V°\u001eÃõ3\u0001_\n\u007frnDÅ7\u0093yí}*Ö\u0095J'\u0010ÀäÌ½±pâOJ\u007fk\rÖË)]\u0018¢Àm©ÎM-9\u007f\u0012@B·£zÅÊ5>\u0081±\u001ciÊ0\u0004[ËÖÌÃÇ*°\u0004CxßÉY\"ÌÿýøïÇv\u001cÒ}¨æJÅ¥\u0015bp»zûC·ÄªÐ\u0004O¥Þ\u0010Ò(îÂD\u0014TÅ*Ð¿5Ð\u0092z`ò[ÏU©\u0001\u001a\f+p'\u007fÔ\u0018[Eéùù9æ\u0014\u0018èr* =Ãa1\u008c-\u0099|\u0085\u008cé,[uz\u009cø-\u0093n\u0088¬\u001f\u009cAò<Z\u0006f2\u0093@x\u0093\u008d\u009eÁ`ø?c?°Þ}\u0098$Û \u009b\u0094\u001fÜ7|¨5=\u000b¨Cº\u0017ó\u000f)Í\u008dÐ6ãCV£º\u0001ø)2wÿ\u0012±zãøÄâ/Ç\u001bÿ#A´Î(Ü;\u0017\u008f÷lÐzõIuR\u0015°\u0095xvNaA3\u0084ó\u0005¯\u0004Oÿ½ÄÄ-¨+À¤³ø1? LÂä\u0096\u0097\u0017ô×y\"Ð÷¸\u0018<>ã÷KÐ\u0019ÇÝgþ´¹\u009fû|÷\u0080\u0018W7G3Ì\u0004?\u0004ÛÁÓ®A^xG!Ý\u0096c%/\u0005æ\u0018ê\u0001\u0093l\u009b´\\`£%>£C\u0090ØÒ\u009eBì(³û\bè ú0Ú\u0017 ±]ôÉ\u0018Õ*Ð¦9su\u000e\u000b\u001bÙPq\u0090QÐØ¥\u000bÆÍÏ0V\u0001,+è%\u0096ü\u000f-(\u0089\u001b\u0093Ar\u0093&Õ\u0001\u001ao\u0017#¹ï\u001a4áMÖÈ\rHùÀ\u000eý4ýym\u001dÉZè\u0083¾(6ZG#\u0089dmi#¿\u0011\u0091Ð¸épw<\u0086b\u008bóésH\u008d&i\u0082LíÞp\u0014åî\u0015\r\fÌ %\u0093\u0000×²}úÔ\u001a\u00806kâ\u0095f\u0089ô\u001e\u001a±#¼\u000f\u0096\u001bG,\u000b%mè\u0093 c\u009b3ÑØA±©'V\u0091»6é²Õ?\u001ea\u000em|\u009ePO§sM~¤©É(òÉ¨é\u00adQô\u000b·Ú\u00146\u0013á-f\u009dÓ\t\u0005\rF¥Ï\u0002çY@H\u001e\u0014\u0005Ú\u0016°z 'ôâ ºÙ9\u0095Â\u001c.qßqÀG\u0019\u008d\u009d¨rmpàK\u0085^2Ék\u0098\u008bÏ~\u0005á@\u0087EDLó\u0004\u0088Szá\u0002\u0085Ó\r\u0013E¯IáÄCé«áb\\8¯6ÿ\u0001i5íÓ;\u001b\u0001N\r³g/kÍ~Hä\\\u0001\u0093ù0\u0001^X²\u0013f\u0001|\u0015¿\f \u0094#ú\u000f\u0002¿Î\u0087\u001cy®Ø\u0006S¦¡\u0082Z³û+¶\n3r|æÑæo\u0094êx#gT\u009e\u0089\u0097_\nèLBÄÿ\u0012Bét\u0088\u008f'\rS\u0002ÿÔ'Q\u0015\"gqxÝkb¿W\r\u0090×á\të\u0007,e¨\u0017\f6ú9vj?\u0085)ÔÏ)±®$_°±¯g9ÖÜ\u0090²D ×Êâ´á\u0004\u0018\u0013û\u000bÏ\u0004¶§JMjß¹s\u009a+h·\u000e\u0002\f$ÜeVø\u0006;ÎrìÏ¾Y0F\u0094÷\u0091 &<\u008f\u0094°MQy{\u000389ÚøG³O\u0087\u0016»\u00941/k!0¸ÚsÂ\\\r0&èGW67\u001cä\u001b£7\u008f\u0083Äý©\bæO\u0013\u001a3[\u000emT³ø<\u0001\u0017ª\u0018\u0084:ÍùÍ3öü®)û\u009cû¦å(a\r5Ìáî§æ\u009aT=\fÕ\u00adÌ\\\u009bÌ¼³\u0003T\u0096éâ#\u007f\u009eo`Î\u0086D`\\\u009fÛì·ã \u0088EP¸Õi\u0015±Ë\u000f¨~\u0091;}A`Ç\u0002¼\u0097\u0006æÖéÑQ\u0001\u0004¬\u000f`\u0018\u0096ì\u0083\u0007H¼b)Ö\"Sô\u008a\u008cì\u0080#\u0096K\u008e.âÈÛ\u0010í\u0090\u0010\u0091©\u000e\u000b.\u0098â\u0087Zõû{À\u0010Ä\u0002ú=\f%TÐ%#ÓIEð\u007fÖ \u0016ø\u001b<é9\u00ad¿\u0015µîØz\u0092iÐ$Sò[\u001cë*öÌ\u007fzp\u0088Tö8\u0018ë©?2\u0005K `à\u009e\u008eî¿\u001fêY\u009b?\u001fí\u009a:u8\u0010Ü}öH±\u00821\nO0ÃË+¨5v8Ã\u0002\u0016çwR®B\u001bv`¹hÔ>DÜYC\u0007A¤»ÆÂeÓñlö9\u0088¶ÜÌÉ´Ä/¾\u001c\u0094¦:\u0004HS\u0082\u0015\u009eÄ,½¼!´ \u001a\\~î9@ÊÕ\u0091\b\u0005t\u0094eO\t*\u0083¢b\u0090d¤Ú9bz\u008cÃ|\\L òÏâi7ÌÜâJÁKôç\u00015\u001b\u00938¦B\u0016\u008etJR´Ó\u008a\u0018Þ\u0099\u001b xxÏö/Ó\u0093vCOÑÒ\f%T\u000eW¾n\u0019N\u009c¢\u009c46I;Î`µ< V:Ï©¯r\u0012hVyz¨Kc\u001b6k ñìæ\u000ew\u0012\u009bÕSäoÌ#Ú0u\u0097 \"ãZ{Ë>h)õ\u0010è\u0017ÝôGM\u0097ïþ\u0089>\u009c\u0001\u0087&r\u0004øÓö\u0092à\u00ad\u008bi\u008dÚz³WB\u0010v\u0099\u007f \u008cI\u0096à*w<·\u0017HHáF*\u0013|Ë@¬£\u009d¦FÓyº{\u001f\\XÛÎ\u0010.¬\u008c\u0082µ¼\u0010h\u0015îW½ÎÃ²C :A\u0094\t\u0090t\f\u0006\u0002\u0002\u0011\u00aduÌ\u001c\u0097kÂÎ?\u0093\u000f¡f\u0086&c8\u0002hñ*8{^\u009dN©\u0002\u0006\bø\u0084\u001d/ð\u001c`D\n\u0003Sö\u0082à\u0016\u0011\u0006¯ ´\u001cj£µsyÝ¶¸¬Ü9\u0091+34#$+\u008b§ë\u0005VÓô\u0016\u0087\u0018îï\u009a\u008d\u0097K\u0007ñ¼`f\r|\u0014\u0001õK,1\u0013ä\u0081\u000fç\u0088ÃÍ\u0092NQÕ0ËÍ\u0090DÙö\u001c½\u008c×l»\u0006\u001eÀËá\u001362\u0081½7õpc\u0093\u008apýeLsÛ¨q\u0094»©,\u001e\u000f\u0080U´zm¶$\u009aë»\u0003\u0017âl0\u001fÿ¶o«¶A©Òª\u008e2bnÐ\u0081\u008d·\u0085ù\u008e\u0081\u0084²Õï'qÍ3HZæ¯Ö`Ò×ÝwI\nò(ÒÀ\"\u0098\u008ayNT\u0081û\u0096\u0016âÍ.ÏB\u009fsN¹\u0097\u0002Ý%l¦j\u0010n×XWÌøÂÑÎú\u0093Å$w,±\u0010\u0080\u0098\u0089lzg¬/R[\nöù~ØA\u0018Û\u0011±Z¯KäÎ'¿¢\u008e Þ\u0090\t[î÷üÜï\u0017\u001d\u0010þb\u0080?#-\u0087#ÞÏZ-ÿô£\u009d\u0090b\u0004Épæ¬àgQ÷¶K\u0001Çe·æ·[ôß.¸\u0011A?D\u009d,Ñ\u0098fÈ±\u009e U\u0087\u0092bê*\u0091-¹í3«Fö·\u0019²Ýý\u0081Úø³Ý4ièi.>\u009fê\rVý´\u001c!\u009e\u0088\u009cýÍ³¢\u0082|Ð\u0082DAèºg\u0082¨C¬_Æ³I\u008eCØ\u0098\u0018Hj^\u0014h_vboñÇYnæSqÚÔ\u0001,\u009e\u0082î¦¦@9'\u009b\u0006q\u009bé+Á\u009e\u009b_?s  è5_\u0095h©³Þqé\u001a^ÂÎ\u0016ñðù?Õ×#v±\u0084ÙL\u000be+ã'(q{2¥\u0093z\u0098§\"ëO\u0010y0a\u000f?\u009cä±\u0088¨Q¿\u008b\b*\u007fóu~¯yloq×¨k8\u0018a\u0005\u0003dl9;cCÎÕCÝþåà\u009bs\u001b¥(\u0014V\u008c0ð¨3\u009fcþ\u0004ù\u0094Hì\u0014ç\u008d¤[YÕÉÚE+*\u0096¯\u0098\n\r)T±2\u0084\u0002ÔøùþÁÇE\u0080\u00adªQ\u001ayA\u0018&\u0097qÜ]P\u00adÐSô\u0088\u0098Ê\ns\u008bk©\u0083\u0090 ,dE\u0010yü\rÕê\u00adJü\u0082§õü\u0093\r/®8\u0014I6x\u009cjè\u0089d\b%\u001c*î²È3\"ðæ¨\u0084\u0006Ö§.âÝ\b*\u0016´ß«q¼?Þ\u009a0O\fG\u009f\u0091ó§á\u0002½\u007f\u009214¼ª8t\u001c\u0010µ&Óõ\u009dãºDQJ\u0091±Î\u00adÏêk\u0093¥4\u0002L\u009b\u0097¡å\u008e\u001fÏÓúG!\bîþiÐD»®¡×;ä(\u0005³ÊÌúD±(\u009cnNÏ\u0084\u0082\u008dqZ\u001f¦k\u0000\u00143\u0093X³Z\nÕö²zäODãÜ/;|Ã¶Äâ\f¯\u000eå\u0010dò·f\u0005ø:\u0001!6\"±\u001bpõ¡ ?Ã\u001d\u000e\u000ed?Â°$µVÏs\u0096\u008d\u001f\\Sw\u001c½î£_\u0085c8\ts\u0082\u0002(\u009eI|Z\nÓþ\u0005\u009d\"\u0097¯5m\u0099J-\u008bí\u0016Þ=`\u0016c\u001c\u0089¶\u0081\u0099\b\u0086×:\u0099Ì÷É\u0083\r\u0018\u0010\u000f¤dvk\u0087\u000e'\u0095×¡ìC\u000f\u008euì>vAÓkå";
int var17 = "\u0013Ì\u001bÒ4\u0080Ý´\u0013â½\u001b\u0007(}iY´\u0087µqß\u0082À Lpjá¦»@ð\u0096Ô¹5Ò\u000e\neF\u008b¯\u0003Ä\u00ad¨¦|\u0013sÈ&öâ\u0083\u0010\u00825qÆÊL\\\u0097Øc1tM\u0005ê4 \\³ø\u0012ñ\u0014ßGBµ;yrRÙÛØ1ÑþH°\u0094<íH\u0097E\u008c\ráù\u0018\u0005 ¿#³\u0003>f§ÁZMU\u001f\u0002R\u0095Î{ªfÝ÷Ò(/çw>º\u001dà-\u008bt\txßI\b\u0000w¼\u008e\u008f\u0094j\u009aè°k¨÷ÇÔ©.\n¾Â6\nJ}D\u0010ä#\u001cò\u009c¥ãüW¦þ\u0093fkÖå\u0018\u0085C¥¶1'\u009e¢Ë0û(\u0017\u0005\u0004èùÛoCð¶\u008a]\u0010Çn·\t\u0093\u007f\u0018BpßÎ(\u000e÷\u0088\b(N\u009dÙ9$\u009dþp¿Wxµ\u0017\u0018\u0099tk©9ª²Ë¢ÓR\u0005¥\u0091ß\u009cuÄ\u009e=\u009c·\u0091Ï\u000bå\u0018V°\u001eÃõ3\u0001_\n\u007frnDÅ7\u0093yí}*Ö\u0095J'\u0010ÀäÌ½±pâOJ\u007fk\rÖË)]\u0018¢Àm©ÎM-9\u007f\u0012@B·£zÅÊ5>\u0081±\u001ciÊ0\u0004[ËÖÌÃÇ*°\u0004CxßÉY\"ÌÿýøïÇv\u001cÒ}¨æJÅ¥\u0015bp»zûC·ÄªÐ\u0004O¥Þ\u0010Ò(îÂD\u0014TÅ*Ð¿5Ð\u0092z`ò[ÏU©\u0001\u001a\f+p'\u007fÔ\u0018[Eéùù9æ\u0014\u0018èr* =Ãa1\u008c-\u0099|\u0085\u008cé,[uz\u009cø-\u0093n\u0088¬\u001f\u009cAò<Z\u0006f2\u0093@x\u0093\u008d\u009eÁ`ø?c?°Þ}\u0098$Û \u009b\u0094\u001fÜ7|¨5=\u000b¨Cº\u0017ó\u000f)Í\u008dÐ6ãCV£º\u0001ø)2wÿ\u0012±zãøÄâ/Ç\u001bÿ#A´Î(Ü;\u0017\u008f÷lÐzõIuR\u0015°\u0095xvNaA3\u0084ó\u0005¯\u0004Oÿ½ÄÄ-¨+À¤³ø1? LÂä\u0096\u0097\u0017ô×y\"Ð÷¸\u0018<>ã÷KÐ\u0019ÇÝgþ´¹\u009fû|÷\u0080\u0018W7G3Ì\u0004?\u0004ÛÁÓ®A^xG!Ý\u0096c%/\u0005æ\u0018ê\u0001\u0093l\u009b´\\`£%>£C\u0090ØÒ\u009eBì(³û\bè ú0Ú\u0017 ±]ôÉ\u0018Õ*Ð¦9su\u000e\u000b\u001bÙPq\u0090QÐØ¥\u000bÆÍÏ0V\u0001,+è%\u0096ü\u000f-(\u0089\u001b\u0093Ar\u0093&Õ\u0001\u001ao\u0017#¹ï\u001a4áMÖÈ\rHùÀ\u000eý4ýym\u001dÉZè\u0083¾(6ZG#\u0089dmi#¿\u0011\u0091Ð¸épw<\u0086b\u008bóésH\u008d&i\u0082LíÞp\u0014åî\u0015\r\fÌ %\u0093\u0000×²}úÔ\u001a\u00806kâ\u0095f\u0089ô\u001e\u001a±#¼\u000f\u0096\u001bG,\u000b%mè\u0093 c\u009b3ÑØA±©'V\u0091»6é²Õ?\u001ea\u000em|\u009ePO§sM~¤©É(òÉ¨é\u00adQô\u000b·Ú\u00146\u0013á-f\u009dÓ\t\u0005\rF¥Ï\u0002çY@H\u001e\u0014\u0005Ú\u0016°z 'ôâ ºÙ9\u0095Â\u001c.qßqÀG\u0019\u008d\u009d¨rmpàK\u0085^2Ék\u0098\u008bÏ~\u0005á@\u0087EDLó\u0004\u0088Szá\u0002\u0085Ó\r\u0013E¯IáÄCé«áb\\8¯6ÿ\u0001i5íÓ;\u001b\u0001N\r³g/kÍ~Hä\\\u0001\u0093ù0\u0001^X²\u0013f\u0001|\u0015¿\f \u0094#ú\u000f\u0002¿Î\u0087\u001cy®Ø\u0006S¦¡\u0082Z³û+¶\n3r|æÑæo\u0094êx#gT\u009e\u0089\u0097_\nèLBÄÿ\u0012Bét\u0088\u008f'\rS\u0002ÿÔ'Q\u0015\"gqxÝkb¿W\r\u0090×á\të\u0007,e¨\u0017\f6ú9vj?\u0085)ÔÏ)±®$_°±¯g9ÖÜ\u0090²D ×Êâ´á\u0004\u0018\u0013û\u000bÏ\u0004¶§JMjß¹s\u009a+h·\u000e\u0002\f$ÜeVø\u0006;ÎrìÏ¾Y0F\u0094÷\u0091 &<\u008f\u0094°MQy{\u000389ÚøG³O\u0087\u0016»\u00941/k!0¸ÚsÂ\\\r0&èGW67\u001cä\u001b£7\u008f\u0083Äý©\bæO\u0013\u001a3[\u000emT³ø<\u0001\u0017ª\u0018\u0084:ÍùÍ3öü®)û\u009cû¦å(a\r5Ìáî§æ\u009aT=\fÕ\u00adÌ\\\u009bÌ¼³\u0003T\u0096éâ#\u007f\u009eo`Î\u0086D`\\\u009fÛì·ã \u0088EP¸Õi\u0015±Ë\u000f¨~\u0091;}A`Ç\u0002¼\u0097\u0006æÖéÑQ\u0001\u0004¬\u000f`\u0018\u0096ì\u0083\u0007H¼b)Ö\"Sô\u008a\u008cì\u0080#\u0096K\u008e.âÈÛ\u0010í\u0090\u0010\u0091©\u000e\u000b.\u0098â\u0087Zõû{À\u0010Ä\u0002ú=\f%TÐ%#ÓIEð\u007fÖ \u0016ø\u001b<é9\u00ad¿\u0015µîØz\u0092iÐ$Sò[\u001cë*öÌ\u007fzp\u0088Tö8\u0018ë©?2\u0005K `à\u009e\u008eî¿\u001fêY\u009b?\u001fí\u009a:u8\u0010Ü}öH±\u00821\nO0ÃË+¨5v8Ã\u0002\u0016çwR®B\u001bv`¹hÔ>DÜYC\u0007A¤»ÆÂeÓñlö9\u0088¶ÜÌÉ´Ä/¾\u001c\u0094¦:\u0004HS\u0082\u0015\u009eÄ,½¼!´ \u001a\\~î9@ÊÕ\u0091\b\u0005t\u0094eO\t*\u0083¢b\u0090d¤Ú9bz\u008cÃ|\\L òÏâi7ÌÜâJÁKôç\u00015\u001b\u00938¦B\u0016\u008etJR´Ó\u008a\u0018Þ\u0099\u001b xxÏö/Ó\u0093vCOÑÒ\f%T\u000eW¾n\u0019N\u009c¢\u009c46I;Î`µ< V:Ï©¯r\u0012hVyz¨Kc\u001b6k ñìæ\u000ew\u0012\u009bÕSäoÌ#Ú0u\u0097 \"ãZ{Ë>h)õ\u0010è\u0017ÝôGM\u0097ïþ\u0089>\u009c\u0001\u0087&r\u0004øÓö\u0092à\u00ad\u008bi\u008dÚz³WB\u0010v\u0099\u007f \u008cI\u0096à*w<·\u0017HHáF*\u0013|Ë@¬£\u009d¦FÓyº{\u001f\\XÛÎ\u0010.¬\u008c\u0082µ¼\u0010h\u0015îW½ÎÃ²C :A\u0094\t\u0090t\f\u0006\u0002\u0002\u0011\u00aduÌ\u001c\u0097kÂÎ?\u0093\u000f¡f\u0086&c8\u0002hñ*8{^\u009dN©\u0002\u0006\bø\u0084\u001d/ð\u001c`D\n\u0003Sö\u0082à\u0016\u0011\u0006¯ ´\u001cj£µsyÝ¶¸¬Ü9\u0091+34#$+\u008b§ë\u0005VÓô\u0016\u0087\u0018îï\u009a\u008d\u0097K\u0007ñ¼`f\r|\u0014\u0001õK,1\u0013ä\u0081\u000fç\u0088ÃÍ\u0092NQÕ0ËÍ\u0090DÙö\u001c½\u008c×l»\u0006\u001eÀËá\u001362\u0081½7õpc\u0093\u008apýeLsÛ¨q\u0094»©,\u001e\u000f\u0080U´zm¶$\u009aë»\u0003\u0017âl0\u001fÿ¶o«¶A©Òª\u008e2bnÐ\u0081\u008d·\u0085ù\u008e\u0081\u0084²Õï'qÍ3HZæ¯Ö`Ò×ÝwI\nò(ÒÀ\"\u0098\u008ayNT\u0081û\u0096\u0016âÍ.ÏB\u009fsN¹\u0097\u0002Ý%l¦j\u0010n×XWÌøÂÑÎú\u0093Å$w,±\u0010\u0080\u0098\u0089lzg¬/R[\nöù~ØA\u0018Û\u0011±Z¯KäÎ'¿¢\u008e Þ\u0090\t[î÷üÜï\u0017\u001d\u0010þb\u0080?#-\u0087#ÞÏZ-ÿô£\u009d\u0090b\u0004Épæ¬àgQ÷¶K\u0001Çe·æ·[ôß.¸\u0011A?D\u009d,Ñ\u0098fÈ±\u009e U\u0087\u0092bê*\u0091-¹í3«Fö·\u0019²Ýý\u0081Úø³Ý4ièi.>\u009fê\rVý´\u001c!\u009e\u0088\u009cýÍ³¢\u0082|Ð\u0082DAèºg\u0082¨C¬_Æ³I\u008eCØ\u0098\u0018Hj^\u0014h_vboñÇYnæSqÚÔ\u0001,\u009e\u0082î¦¦@9'\u009b\u0006q\u009bé+Á\u009e\u009b_?s  è5_\u0095h©³Þqé\u001a^ÂÎ\u0016ñðù?Õ×#v±\u0084ÙL\u000be+ã'(q{2¥\u0093z\u0098§\"ëO\u0010y0a\u000f?\u009cä±\u0088¨Q¿\u008b\b*\u007fóu~¯yloq×¨k8\u0018a\u0005\u0003dl9;cCÎÕCÝþåà\u009bs\u001b¥(\u0014V\u008c0ð¨3\u009fcþ\u0004ù\u0094Hì\u0014ç\u008d¤[YÕÉÚE+*\u0096¯\u0098\n\r)T±2\u0084\u0002ÔøùþÁÇE\u0080\u00adªQ\u001ayA\u0018&\u0097qÜ]P\u00adÐSô\u0088\u0098Ê\ns\u008bk©\u0083\u0090 ,dE\u0010yü\rÕê\u00adJü\u0082§õü\u0093\r/®8\u0014I6x\u009cjè\u0089d\b%\u001c*î²È3\"ðæ¨\u0084\u0006Ö§.âÝ\b*\u0016´ß«q¼?Þ\u009a0O\fG\u009f\u0091ó§á\u0002½\u007f\u009214¼ª8t\u001c\u0010µ&Óõ\u009dãºDQJ\u0091±Î\u00adÏêk\u0093¥4\u0002L\u009b\u0097¡å\u008e\u001fÏÓúG!\bîþiÐD»®¡×;ä(\u0005³ÊÌúD±(\u009cnNÏ\u0084\u0082\u008dqZ\u001f¦k\u0000\u00143\u0093X³Z\nÕö²zäODãÜ/;|Ã¶Äâ\f¯\u000eå\u0010dò·f\u0005ø:\u0001!6\"±\u001bpõ¡ ?Ã\u001d\u000e\u000ed?Â°$µVÏs\u0096\u008d\u001f\\Sw\u001c½î£_\u0085c8\ts\u0082\u0002(\u009eI|Z\nÓþ\u0005\u009d\"\u0097¯5m\u0099J-\u008bí\u0016Þ=`\u0016c\u001c\u0089¶\u0081\u0099\b\u0086×:\u0099Ì÷É\u0083\r\u0018\u0010\u000f¤dvk\u0087\u000e'\u0095×¡ìC\u000f\u008euì>vAÓkå"
.length();
char var14 = 24;
int var38 = -1;

label54:
while (true) {
String var39 = var15.substring(++var38, var38 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var39.getBytes("ISO-8859-1"));
String var50 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var50;
if ((var38 += var14) >= var17) {
c = var18;
e = new String[73];
C = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[29];
int var3 = 0;
String var4 = "\u009f½Ô«\u008b2ÁHÒH@\u009c\u008eâ£v\u0014YQã\u0015Û6ñ©ø¥$Û\u0001\u0012ª\u008b\t¼\u008b\u0083Û7\u009d\u0083P \u0015~]b|3»\u0090\u009bòM?ÛM|ùÚv:zÍO\u008dô¸ÐÌ\u0094Íj¢Ü\u0093ºEµÿÂQ\b«ÐKù\u009b\u0080Ûq»\u0086ØÜËz|\u009297\u0091)\u008c¬öÕ?Íå\u009b\u008cKU\u0012Wå\u0091¨tG\u008c57\u000b/Ô<Ã\u0096N·ÿu~:!/Tt\u0000)\u0084\u0004\u007f\u0085ÉMüÒ'kFÊø\u001a×\u00032(Ýx¨vî\u0017æ\u0012²+£1%\u0083°\u0092?c{y*â\u0096°Ý<\u0081t\u008fX\u001bT²Ö.Í\u0095ïÂJz{\u0018$7[ù±]\u000e\u0003\u0085þï)\u0087";
int var5 = "\u009f½Ô«\u008b2ÁHÒH@\u009c\u008eâ£v\u0014YQã\u0015Û6ñ©ø¥$Û\u0001\u0012ª\u008b\t¼\u008b\u0083Û7\u009d\u0083P \u0015~]b|3»\u0090\u009bòM?ÛM|ùÚv:zÍO\u008dô¸ÐÌ\u0094Íj¢Ü\u0093ºEµÿÂQ\b«ÐKù\u009b\u0080Ûq»\u0086ØÜËz|\u009297\u0091)\u008c¬öÕ?Íå\u009b\u008cKU\u0012Wå\u0091¨tG\u008c57\u000b/Ô<Ã\u0096N·ÿu~:!/Tt\u0000)\u0084\u0004\u007f\u0085ÉMüÒ'kFÊø\u001a×\u00032(Ýx¨vî\u0017æ\u0012²+£1%\u0083°\u0092?c{y*â\u0096°Ý<\u0081t\u008fX\u001bT²Ö.Í\u0095ïÂJz{\u0018$7[ù±]\u000e\u0003\u0085þï)\u0087"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var42 = var6;
var10001 = var3++;
long var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var57 = -1;

while (true) {
long var8 = var54;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var59 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var57) {
case 0:
var42[var10001] = var59;
if (var2 >= var5) {
i = var6;
m = new Integer[29];
KProperty[] var35 = new KProperty[c<"n">(6676, 7787336779242038177L ^ var20)];
var35[0] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(18810, 2378646157155058391L ^ var20), b<"y">(11260, 2140059831831830567L ^ var20), 0)
);
var35[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(17661, 2362839349601619832L ^ var20), b<"y">(27522, 954517908865245226L ^ var20), 0)
);
var35[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(24463, 7698302092403201069L ^ var20), b<"y">(11665, 402679908046480929L ^ var20), 0)
);
var35[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(17599, 1644063803931414311L ^ var20), b<"y">(6090, 5217900690662628477L ^ var20), 0)
);
var35[4] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(29334, 5773492016287775016L ^ var20), b<"y">(15697, 6170980046287681260L ^ var20), 0)
);
var35[5] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(14346, 7128923665826984895L ^ var20), b<"y">(19302, 8591798811107541191L ^ var20), 0)
);
var35[c<"n">(21586, 6792626528755953144L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(1940, 1276129333386284041L ^ var20), b<"y">(12468, 4198608648158395175L ^ var20), 0)
);
var35[c<"n">(9004, 7691054299826412174L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(15465, 5568774482505611217L ^ var20), b<"y">(20543, 1441859538360622055L ^ var20), 0)
);
var35[c<"n">(8777, 9084535161847569378L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(21452, 4845301852556515417L ^ var20), b<"y">(26693, 2689053553128104958L ^ var20), 0)
);
var35[c<"n">(32352, 7219246559907678145L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(14533, 221829461963748164L ^ var20), b<"y">(21716, 7778549217683529566L ^ var20), 0)
);
var35[c<"n">(6604, 6087070175457763452L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(15515, 6600534922094425876L ^ var20), b<"y">(29004, 7348848688898898634L ^ var20), 0)
);
var35[c<"n">(14926, 3913835229434725363L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(17235, 3234438550017493194L ^ var20), b<"y">(12508, 3465085958807796561L ^ var20), 0)
);
var35[c<"n">(20589, 1480724049073875393L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(32648, 6291832618806277155L ^ var20), b<"y">(15998, 2772771432075310538L ^ var20), 0)
);
var35[c<"n">(30019, 3103422988778900707L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(13074, 6615877606175750351L ^ var20), b<"y">(4569, 950559497914128974L ^ var20), 0)
);
var35[c<"n">(2740, 9199003271623340825L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(707, 8442897462755887477L ^ var20), b<"y">(1520, 9190875232612847178L ^ var20), 0)
);
var35[c<"n">(20847, 1287652579670042843L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(32611, 7432383091131675893L ^ var20), b<"y">(9051, 425383321674754267L ^ var20), 0)
);
var35[c<"n">(30344, 5603071348793347894L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kg.class, b<"y">(23790, 6547933925320349500L ^ var20), b<"y">(31406, 7792427425061990705L ^ var20), 0)
);
h = var35;
W = new kg(var33);
S = yp.L(W, b<"y">(5901, 4800583184787283105L ^ var20), rw.MIRROR, null, null, c<"n">(20589, 1480724049073875393L ^ var20), null, var31);
z = yp.b(
W,
(short)var28,
b<"y">(21627, 7515617236920393673L ^ var20),
new Color(c<"n">(7153, 3628697563169907270L ^ var20), c<"n">(7639, 7699333614402888825L ^ var20), c<"n">(25788, 4133065190741220634L ^ var20)),
null,
null,
c<"n">(20589, 1480724049073875393L ^ var20),
null,
var29
);
J = yp.t(W, b<"y">(5953, 2284612133558623467L ^ var20), false, var24, null, kg::M, 4, null);
o = yp.k(
W, b<"y">(24138, 1624934798803883480L ^ var20), 0.2F, var22, RangesKt.rangeTo(0.0F, 2.0F), null, kg::r, c<"n">(29922, 7303004491106159961L ^ var20), null
);
x = yp.t(W, b<"y">(1064, 601878676569952151L ^ var20), false, var24, null, kg::x, 4, null);
I = yp.k(
W, b<"y">(15899, 7427960860465018306L ^ var20), 6.0F, var22, RangesKt.rangeTo(0.0F, 15.0F), null, kg::V, c<"n">(29922, 7303004491106159961L ^ var20), null
);
d = yp.k(
W, b<"y">(23197, 5540549594934726964L ^ var20), 1.3F, var22, RangesKt.rangeTo(0.0F, 15.0F), null, kg::P, c<"n">(29922, 7303004491106159961L ^ var20), null
);
E = yp.k(
W, b<"y">(6279, 9032925950997893911L ^ var20), 1.7F, var22, RangesKt.rangeTo(1.0F, 5.0F), null, kg::q, c<"n">(29922, 7303004491106159961L ^ var20), null
);
a = yp.k(
W, b<"y">(31647, 6633965458673627153L ^ var20), 4.0F, var22, RangesKt.rangeTo(1.0F, 4.0F), null, kg::Z, c<"n">(29922, 7303004491106159961L ^ var20), null
);
N = yp.L(W, b<"y">(24589, 8671116789567941545L ^ var20), sa.RGB, null, kg::F, 4, null, var31);
P = yp.b(
W,
(short)var28,
b<"y">(12552, 3160227863565613696L ^ var20),
new Color(c<"n">(7639, 7699333614402888825L ^ var20), c<"n">(7639, 7699333614402888825L ^ var20), c<"n">(22361, 6051938128992841450L ^ var20)),
null,
kg::z,
4,
null,
var29
);
n = yp.L(W, b<"y">(20330, 7854411381681571018L ^ var20), 2, new IntRange(1, 4), var26, null, kg::W, c<"n">(29922, 7303004491106159961L ^ var20), null);
j = yp.k(
W, b<"y">(9453, 4727067177481482103L ^ var20), 4.0F, var22, RangesKt.rangeTo(1.0F, 16.0F), null, kg::s, c<"n">(29922, 7303004491106159961L ^ var20), null
);
t = yp.k(
W, b<"y">(26743, 8434261588106634211L ^ var20), 2.0F, var22, RangesKt.rangeTo(0.0F, 4.0F), null, kg::Y, c<"n">(29922, 7303004491106159961L ^ var20), null
);
X = yp.k(
W, b<"y">(26398, 7991615515469114514L ^ var20), 0.6F, var22, RangesKt.rangeTo(0.0F, 1.0F), null, kg::p, c<"n">(29922, 7303004491106159961L ^ var20), null
);
Y = yp.k(
W, b<"y">(5204, 6895491491530841994L ^ var20), 0.7F, var22, RangesKt.rangeTo(0.0F, 5.0F), null, kg::G, c<"n">(29922, 7303004491106159961L ^ var20), null
);
f = yp.k(
W, b<"y">(14910, 4982922883547738556L ^ var20), 2.0F, var22, RangesKt.rangeTo(0.0F, 45.0F), null, kg::C, c<"n">(29922, 7303004491106159961L ^ var20), null
);
u = new float[c<"n">(18742, 6125349284916441216L ^ var20)];
A = -1;
return;
}
break;
default:
var42[var10001] = var59;
if (var2 < var5) {
continue label36;
}

var4 = "ÿ\u00195\rww®ñ\u0012¹\u0001t\u000e-I]";
var5 = "ÿ\u00195\rww®ñ\u0012¹\u0001t\u000e-I]".length();
var2 = 0;
}

byte var48 = var2;
var2 += 8;
var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
var42 = var6;
var10001 = var3++;
var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var57 = 0;
}
}
}

var14 = var15.charAt(var38);
break;
default:
var18[var16++] = var50;
if ((var38 += var14) < var17) {
var14 = var15.charAt(var38);
continue label54;
}

var15 = "¯ºkÄ§s\\r°Ô÷\u0081ßä\u0093ÏJ~CÕ\\¥»ÿÇ0#\u0087¢£\u0082U\u0017ÉÐ!:v\"gÉ\u001br\u0080\u001e.\u0003x\u0018©rÇè\u0011º\u008c]é\u0010ýYÇ\u0081öA\u008f·q\u008d»¹\t\u0095";
var17 = "¯ºkÄ§s\\r°Ô÷\u0081ßä\u0093ÏJ~CÕ\\¥»ÿÇ0#\u0087¢£\u0082U\u0017ÉÐ!:v\"gÉ\u001br\u0080\u001e.\u0003x\u0018©rÇè\u0011º\u008c]é\u0010ýYÇ\u0081öA\u008f·q\u008d»¹\t\u0095"
.length();
var14 = '0';
var38 = -1;
}

var39 = var15.substring(++var38, var38 + var14);
var10001 = 0;
}
}
}

public static void b(int var0) {
l = var0;
}

public static int E() {
return l;
}

public static int A() {
int var0 = E();

try {
return var0 == 0 ? 4 : 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29857;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/kg", var10);
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
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/kg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 1692;
if (m[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])C.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
C.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/kg", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
m[var3] = var15;
}

return m[var3];
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
throw new RuntimeException("su/catlean/kg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
