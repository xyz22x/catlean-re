package su.catlean;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_276;
import net.minecraft.class_290;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class k3 extends _g {
@NotNull
public static final k3 P;
static final KProperty[] G;
@NotNull
private static final cq A;
@NotNull
private static final cq T;
@NotNull
private static final cw o;
@NotNull
private static final ct b;
@NotNull
private static final c8 j;
@NotNull
private static final c8 f;
@NotNull
private static final ct I;
@NotNull
private static final ct N;
@NotNull
private static final ct g;
@NotNull
private static final List B;
private static final long a = yz.a(-7003897176433897630L, 2477269595516142226L, MethodHandles.lookup().lookupClass()).a(203595004427975L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map k;

private k3(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 62439613565038L;
super(b<"n">(15576, 2918120875220154649L ^ var1), jt.F(), null, 4, null, var3);
}

private final boolean Z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 115402573648746L;
return (Boolean)A.E(this, var3, G[0]);
}

private final void V(long var1, boolean var3) {
var1 = a ^ var1;
long var4 = var1 ^ 121734373060545L;
A.b(this, var4, G[0], var3);
}

private final boolean l(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 129100266795344L;
return (Boolean)T.E(this, var3, G[1]);
}

private final void E(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 44583403777124L;
T.b(this, var4, G[1], var1);
}

private final fo a(int var1, int var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 101305267803914L;
return (fo)o.E(this, var6, G[2]);
}

private final void H(fo var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 109557474822141L;
o.b(this, var4, G[2], var1);
}

private final float r(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 65467375514301L;
return ((Number)b.E(this, var3, G[3])).floatValue();
}

private final void N(float var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 48514803688613L;
b.b(this, var4, G[3], var1);
}

private final int q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 10886772371591L;
return ((Number)j.E(this, var3, G[4])).intValue();
}

private final void G(long var1, int var3) {
var1 = a ^ var1;
long var4 = var1 ^ 22789098934214L;
j.b(this, var4, G[4], var3);
}

private final int G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 93572249339748L;
return ((Number)f.E(this, var3, G[5])).intValue();
}

private final void Q(long var1, int var3) {
var1 = a ^ var1;
long var4 = var1 ^ 34801158228811L;
f.b(this, var4, G[5], var3);
}

private final float g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 100409027565991L;
return ((Number)I.E(this, var3, G[c<"u">(16946, 8217903588791541288L ^ var1)])).floatValue();
}

private final void T(long var1, float var3) {
var1 = a ^ var1;
long var4 = var1 ^ 78128357703343L;
I.b(this, var4, G[c<"u">(16946, 8217928500048342732L ^ var1)], var3);
}

private final float H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 31585336317786L;
return ((Number)N.E(this, var3, G[c<"u">(21680, 5729422025495545408L ^ var1)])).floatValue();
}

private final void d(long var1, float var3) {
var1 = a ^ var1;
long var4 = var1 ^ 69795145263629L;
N.b(this, var4, G[c<"u">(21680, 5729397644546567419L ^ var1)], var3);
}

private final float L(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 32138682683201L;
return ((Number)g.E(this, var6, G[c<"u">(23708, 4170315710977349225L ^ var4)])).floatValue();
}

private final void q(long var1, float var3) {
var1 = a ^ var1;
long var4 = var1 ^ 74419288997316L;
g.b(this, var4, G[c<"u">(23708, 4170222660213224192L ^ var1)], var3);
}

@Flow
private final void i(SendPacket var1) {
long var2 = a ^ 17431992150514L;
long var4 = var2 ^ 121072140337196L;
zf.F(var4).method_40000(k3::z);
}

@Flow
private final void Q(Render3DEvent var1) {
long var2 = a ^ 16771270695647L;
long var4 = var2 ^ 55276138720370L;
long var6 = var2 ^ 121526703108865L;
long var8 = var2 ^ 68003969396133L;
long var10 = var2 ^ 110814052333599L;
long var12 = var2 ^ 45155723226873L;
long var10001 = var2 ^ 130855314787378L;
int var14 = (int)((var2 ^ 130855314787378L) >>> 48);
int var15 = (int)((var2 ^ 130855314787378L) << 16 >>> 32);
int var16 = (int)(var10001 << 48 >>> 48);
ArrayList var10000 = Lists.newArrayList(B);
Intrinsics.checkNotNullExpressionValue(var10000, b<"n">(424, 522996318198543002L ^ var2));
ArrayList var23 = var10000;
_g[] var39 = vm.a<"Å">(-1158850135421275856L, var2);
VertexFormat var10003 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, b<"n">(20463, 8077560444140715221L ^ var2));
int var10004 = var23.size() * 2;
Object var17 = null;
byte var18 = 4;
boolean var19 = false;
int var20 = var10004;
VertexFormat var21 = var10003;
g7 var24 = new g7(var4, var21, var20, var19, var18, (DefaultConstructorMarker)var17);
Iterable var25 = var23;
_g[] var22 = var39;
boolean var26 = false;

for (Object var28 : var25) {
nu var29 = (nu)var28;
boolean var30 = false;
int var31 = RangesKt.coerceIn((int)((float)var29.m().N() / 40.0F), 0, c<"u">(23708, 4170296592886135652L ^ var2));
float var32 = (gi.SMOKE.L() - gi.SMOKE.o()) / 3.0F;
float var33 = (gi.SMOKE.w() - gi.SMOKE.v()) / 3.0F;
float var34 = gi.SMOKE.o() + var31 % 3 * var32;
float var35 = gi.SMOKE.v() + var31 / 3 * var33;
float var36 = (float)var29.m().N() / 450.0F;

try {
zi.e(
zi.v,
n1.o(),
var29.U(),
var29.G(),
var29.v(),
0.0F,
1.0F + var36,
var12,
jl.y.p(jh.f.Z(var8, c<"u">(25693, 6993129655310566306L ^ var2)), (char)var14, var15, 1.0F, (short)var16),
false,
var24,
var34,
var35,
var34 + var32,
var35 + var33,
true,
c<"u">(3522, 3015888636944198193L ^ var2),
null
);
if (var22 != null && var22 != null) {
continue;
}
break;
} catch (NumberFormatException var37) {
throw vm.a<"Å">(var37, -1201997763288729422L, var2);
}
}

GpuTextureView var40 = zf.F(var6).method_1531().method_4619(n1.o()).method_71659();
Intrinsics.checkNotNullExpressionValue(var40, b<"n">(14799, 221609536337414893L ^ var2));
GpuTextureView var38 = var40;
RenderPipeline var10002 = b6.R.S();
class_276 var41 = zf.F(var6).method_1522();
Intrinsics.checkNotNullExpressionValue(var41, b<"n">(13862, 922313504704300318L ^ var2));
g7.R(
var10,
var24,
var10002,
var41,
null,
var1.getStack().method_23760().method_23761(),
null,
MapsKt.mapOf(TuplesKt.to(b<"n">(29461, 8101682451266551845L ^ var2), var38)),
c<"u">(3534, 1471731569948895795L ^ var2),
null
);
B.removeIf(k3::J);
}

private static final boolean P() {
long var0 = a ^ 40640580743259L;
long var2 = var0 ^ 19089486499087L;
return P.l(var2);
}

private static final boolean s() {
long var0 = a ^ 72691019585721L;
long var2 = var0 ^ 131625497765357L;
return P.l(var2);
}

private static final boolean Q() {
long var0 = a ^ 51848296769261L;
long var2 = var0 ^ 29193398164409L;
return P.l(var2);
}

private static final boolean z() {
long var0 = a ^ 65208926269591L;
long var2 = var0 ^ 16374085569987L;
return P.l(var2);
}

private static final boolean M() {
long var0 = a ^ 128692106463711L;
long var2 = var0 ^ 71063289836683L;
return P.l(var2);
}

private static final boolean Y() {
long var0 = a ^ 48947536019154L;
long var2 = var0 ^ 27688531133318L;
return P.l(var2);
}

private static final boolean j() {
long var0 = a ^ 109422368747028L;
long var2 = var0 ^ 94756105638720L;
return P.l(var2);
}

private static final void z(SendPacket param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k3.a J
// 003: ldc2_w 88936030917813
// 006: lxor
// 007: lstore 1
// 008: lload 1
// 009: dup2
// 00a: ldc2_w 132864662997979
// 00d: lxor
// 00e: lstore 3
// 00f: dup2
// 010: ldc2_w 34605526950046
// 013: lxor
// 014: lstore 5
// 016: dup2
// 017: ldc2_w 125047528435443
// 01a: lxor
// 01b: lstore 7
// 01d: dup2
// 01e: ldc2_w 14402780780528
// 021: lxor
// 022: dup2
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 9
// 029: dup2
// 02a: bipush 16
// 02c: lshl
// 02d: bipush 32
// 02f: lushr
// 030: l2i
// 031: istore 10
// 033: dup2
// 034: bipush 48
// 036: lshl
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 11
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 48006892841484
// 042: lxor
// 043: lstore 12
// 045: dup2
// 046: ldc2_w 111367594502625
// 049: lxor
// 04a: lstore 14
// 04c: dup2
// 04d: ldc2_w 13854467837931
// 050: lxor
// 051: lstore 16
// 053: dup2
// 054: ldc2_w 82952898314518
// 057: lxor
// 058: lstore 18
// 05a: dup2
// 05b: ldc2_w 44938901797310
// 05e: lxor
// 05f: lstore 20
// 061: dup2
// 062: ldc2_w 8946010010620
// 065: lxor
// 066: lstore 22
// 068: dup2
// 069: ldc2_w 35589095783448
// 06c: lxor
// 06d: lstore 24
// 06f: dup2
// 070: ldc2_w 30630093186670
// 073: lxor
// 074: dup2
// 075: bipush 48
// 077: lushr
// 078: l2i
// 079: istore 26
// 07b: dup2
// 07c: bipush 16
// 07e: lshl
// 07f: bipush 48
// 081: lushr
// 082: l2i
// 083: istore 27
// 085: dup2
// 086: bipush 32
// 088: lshl
// 089: bipush 32
// 08b: lushr
// 08c: l2i
// 08d: istore 28
// 08f: pop2
// 090: dup2
// 091: ldc2_w 83568502132667
// 094: lxor
// 095: dup2
// 096: bipush 32
// 098: lushr
// 099: l2i
// 09a: istore 29
// 09c: dup2
// 09d: bipush 32
// 09f: lshl
// 0a0: bipush 48
// 0a2: lushr
// 0a3: l2i
// 0a4: istore 30
// 0a6: dup2
// 0a7: bipush 48
// 0a9: lshl
// 0aa: bipush 48
// 0ac: lushr
// 0ad: l2i
// 0ae: istore 31
// 0b0: pop2
// 0b1: dup2
// 0b2: ldc2_w 76114517876693
// 0b5: lxor
// 0b6: lstore 32
// 0b8: dup2
// 0b9: ldc2_w 67257562062018
// 0bc: lxor
// 0bd: lstore 34
// 0bf: dup2
// 0c0: ldc2_w 17490384312867
// 0c3: lxor
// 0c4: lstore 36
// 0c6: dup2
// 0c7: ldc2_w 28335783618614
// 0ca: lxor
// 0cb: lstore 38
// 0cd: dup2
// 0ce: ldc2_w 32839577738535
// 0d1: lxor
// 0d2: lstore 40
// 0d4: dup2
// 0d5: ldc2_w 59600808950432
// 0d8: lxor
// 0d9: lstore 42
// 0db: pop2
// 0dc: ldc2_w -2197562748577300646
// 0df: lload 1
// 0e0: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: astore 44
// 0e7: aload 0
// 0e8: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0eb: instanceof net/minecraft/class_2824
// 0ee: ifeq 3fd
// 0f1: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 0f4: aload 0
// 0f5: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 0f8: iload 26
// 0fa: i2s
// 0fb: swap
// 0fc: iload 27
// 0fe: i2s
// 0ff: swap
// 100: iload 28
// 102: swap
// 103: checkcast net/minecraft/class_2824
// 106: invokevirtual su/catlean/u2.V (SSILnet/minecraft/class_2824;)Lnet/minecraft/class_2824$class_5907;
// 109: getstatic net/minecraft/class_2824$class_5907.field_29172 Lnet/minecraft/class_2824$class_5907;
// 10c: if_acmpne 3fd
// 10f: goto 11c
// 112: ldc2_w -2216902668348393768
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: aconst_null
// 11d: astore 45
// 11f: aload 44
// 121: ifnull 163
// 124: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 127: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 12a: lload 5
// 12c: invokevirtual su/catlean/dm.U (J)F
// 12f: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 132: lload 7
// 134: invokevirtual su/catlean/dm.w (J)F
// 137: getstatic su/catlean/um.E Lsu/catlean/um;
// 13a: lload 22
// 13c: invokevirtual su/catlean/um.P (J)F
// 13f: lload 20
// 141: invokevirtual su/catlean/dm.J (FFFJ)Lnet/minecraft/class_243;
// 144: dup
// 145: ifnonnull 1b4
// 148: goto 155
// 14b: ldc2_w -2216902668348393768
// 14e: lload 1
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: pop
// 156: goto 163
// 159: ldc2_w -2216902668348393768
// 15c: lload 1
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 166: aload 0
// 167: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 16a: lload 24
// 16c: dup2_x1
// 16d: pop2
// 16e: checkcast net/minecraft/class_2824
// 171: invokevirtual su/catlean/u2.G (JLnet/minecraft/class_2824;)Lnet/minecraft/class_1297;
// 174: astore 47
// 176: aload 47
// 178: aload 44
// 17a: ifnull 18f
// 17d: ifnull 1b3
// 180: goto 18d
// 183: ldc2_w -2216902668348393768
// 186: lload 1
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: aload 47
// 18f: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 192: astore 48
// 194: aload 48
// 196: aload 44
// 198: ifnull 1ad
// 19b: ifnull 1b3
// 19e: goto 1ab
// 1a1: ldc2_w -2216902668348393768
// 1a4: lload 1
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: aload 48
// 1ad: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 1b0: goto 1b4
// 1b3: aconst_null
// 1b4: astore 45
// 1b6: aload 45
// 1b8: aload 44
// 1ba: ifnull 27b
// 1bd: ifnonnull 279
// 1c0: goto 1cd
// 1c3: ldc2_w -2216902668348393768
// 1c6: lload 1
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 1d0: bipush 0
// 1d1: bipush 1
// 1d2: lload 36
// 1d4: aconst_null
// 1d5: invokestatic su/catlean/_8.S (Lsu/catlean/_8;ZIJLjava/lang/Object;)Lsu/catlean/_w;
// 1d8: astore 46
// 1da: aload 44
// 1dc: ifnull 218
// 1df: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1e2: aload 46
// 1e4: invokevirtual su/catlean/_w.q ()F
// 1e7: aload 46
// 1e9: invokevirtual su/catlean/_w.N ()F
// 1ec: getstatic su/catlean/um.E Lsu/catlean/um;
// 1ef: lload 22
// 1f1: invokevirtual su/catlean/um.P (J)F
// 1f4: lload 20
// 1f6: invokevirtual su/catlean/dm.J (FFFJ)Lnet/minecraft/class_243;
// 1f9: dup
// 1fa: ifnonnull 277
// 1fd: goto 20a
// 200: ldc2_w -2216902668348393768
// 203: lload 1
// 204: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 209: athrow
// 20a: pop
// 20b: goto 218
// 20e: ldc2_w -2216902668348393768
// 211: lload 1
// 212: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 217: athrow
// 218: aload 44
// 21a: ifnull 276
// 21d: getstatic su/catlean/u2.u Lsu/catlean/u2;
// 220: aload 0
// 221: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 224: lload 24
// 226: dup2_x1
// 227: pop2
// 228: checkcast net/minecraft/class_2824
// 22b: invokevirtual su/catlean/u2.G (JLnet/minecraft/class_2824;)Lnet/minecraft/class_1297;
// 22e: dup
// 22f: ifnull 268
// 232: goto 23f
// 235: ldc2_w -2216902668348393768
// 238: lload 1
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 242: dup
// 243: ifnull 268
// 246: goto 253
// 249: ldc2_w -2216902668348393768
// 24c: lload 1
// 24d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: athrow
// 253: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 256: aload 44
// 258: ifnonnull 277
// 25b: goto 268
// 25e: ldc2_w -2216902668348393768
// 261: lload 1
// 262: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 267: athrow
// 268: pop
// 269: goto 276
// 26c: ldc2_w -2216902668348393768
// 26f: lload 1
// 270: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 275: athrow
// 276: aconst_null
// 277: astore 45
// 279: aload 45
// 27b: dup
// 27c: ifnull 3fb
// 27f: astore 48
// 281: bipush 0
// 282: istore 49
// 284: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 287: lload 3
// 288: invokespecial su/catlean/k3.Z (J)Z
// 28b: aload 44
// 28d: ifnull 2e3
// 290: ifeq 2db
// 293: goto 2a0
// 296: ldc2_w -2216902668348393768
// 299: lload 1
// 29a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29f: athrow
// 2a0: getstatic su/catlean/k3.B Ljava/util/List;
// 2a3: new su/catlean/nu
// 2a6: dup
// 2a7: aload 45
// 2a9: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2ac: lload 5
// 2ae: invokevirtual su/catlean/dm.U (J)F
// 2b1: fneg
// 2b2: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2b5: lload 7
// 2b7: invokevirtual su/catlean/dm.w (J)F
// 2ba: new su/catlean/bg
// 2bd: dup
// 2be: invokespecial su/catlean/bg.<init> ()V
// 2c1: lload 42
// 2c3: dup2_x1
// 2c4: pop2
// 2c5: invokespecial su/catlean/nu.<init> (Lnet/minecraft/class_243;FFJLsu/catlean/bg;)V
// 2c8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 2cd: pop
// 2ce: goto 2db
// 2d1: ldc2_w -2216902668348393768
// 2d4: lload 1
// 2d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2da: athrow
// 2db: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 2de: lload 14
// 2e0: invokespecial su/catlean/k3.l (J)Z
// 2e3: aload 44
// 2e5: ifnull 30d
// 2e8: ifeq 3f7
// 2eb: goto 2f8
// 2ee: ldc2_w -2216902668348393768
// 2f1: lload 1
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 2fb: lload 32
// 2fd: invokespecial su/catlean/k3.G (J)I
// 300: goto 30d
// 303: ldc2_w -2216902668348393768
// 306: lload 1
// 307: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30c: athrow
// 30d: istore 50
// 30f: bipush 0
// 310: istore 51
// 312: iload 51
// 314: iload 50
// 316: if_icmpge 3f7
// 319: iload 51
// 31b: istore 52
// 31d: bipush 0
// 31e: istore 53
// 320: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 323: new su/catlean/bk
// 326: dup
// 327: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 32a: iload 29
// 32c: iload 30
// 32e: iload 31
// 330: i2s
// 331: invokespecial su/catlean/k3.a (IIS)Lsu/catlean/fo;
// 334: invokevirtual su/catlean/fo.g ()Lsu/catlean/gi;
// 337: aload 45
// 339: invokestatic java/lang/Math.random ()D
// 33c: ldc 50.0
// 33e: f2d
// 33f: dmul
// 340: d2f
// 341: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 344: lload 12
// 346: invokespecial su/catlean/k3.r (J)F
// 349: lload 40
// 34b: dup2_x1
// 34c: pop2
// 34d: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 350: lload 38
// 352: invokespecial su/catlean/k3.q (J)I
// 355: new net/minecraft/class_243
// 358: dup
// 359: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 35c: lload 16
// 35e: invokespecial su/catlean/k3.H (J)F
// 361: fneg
// 362: lload 34
// 364: dup2_x1
// 365: pop2
// 366: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 369: lload 16
// 36b: invokespecial su/catlean/k3.H (J)F
// 36e: bipush 0
// 36f: bipush 4
// 370: aconst_null
// 371: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 374: f2d
// 375: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 378: iload 9
// 37a: i2c
// 37b: iload 10
// 37d: iload 11
// 37f: i2c
// 380: invokespecial su/catlean/k3.L (CIC)F
// 383: fneg
// 384: lload 34
// 386: dup2_x1
// 387: pop2
// 388: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 38b: iload 9
// 38d: i2c
// 38e: iload 10
// 390: iload 11
// 392: i2c
// 393: invokespecial su/catlean/k3.L (CIC)F
// 396: bipush 0
// 397: bipush 4
// 398: aconst_null
// 399: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 39c: f2d
// 39d: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 3a0: lload 16
// 3a2: invokespecial su/catlean/k3.H (J)F
// 3a5: fneg
// 3a6: lload 34
// 3a8: dup2_x1
// 3a9: pop2
// 3aa: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 3ad: lload 16
// 3af: invokespecial su/catlean/k3.H (J)F
// 3b2: bipush 0
// 3b3: bipush 4
// 3b4: aconst_null
// 3b5: invokestatic su/catlean/mf.D (JFFZILjava/lang/Object;)F
// 3b8: f2d
// 3b9: invokespecial net/minecraft/class_243.<init> (DDD)V
// 3bc: aconst_null
// 3bd: getstatic su/catlean/k3.P Lsu/catlean/k3;
// 3c0: lload 18
// 3c2: invokespecial su/catlean/k3.g (J)F
// 3c5: fconst_0
// 3c6: bipush 0
// 3c7: sipush 21771
// 3ca: ldc2_w 7482760801320402074
// 3cd: lload 1
// 3ce: lxor
// 3cf: invokedynamic u (IJ)I bsm=su/catlean/k3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d4: aconst_null
// 3d5: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 3d8: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 3db: pop
// 3dc: nop
// 3dd: iinc 51 1
// 3e0: aload 44
// 3e2: ifnull 3f8
// 3e5: aload 44
// 3e7: ifnonnull 312
// 3ea: goto 3f7
// 3ed: ldc2_w -2216902668348393768
// 3f0: lload 1
// 3f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f6: athrow
// 3f7: nop
// 3f8: goto 3fd
// 3fb: pop
// 3fc: nop
// 3fd: return
}

private static final boolean f(nu var0) {
long var1 = a ^ 43984575763614L;
long var3 = var1 ^ 26875514063542L;
Intrinsics.checkNotNullParameter(var0, b<"n">(31216, 5912554980429071533L ^ var1));
return var0.m().c(c<"u">(17749, 8346492178335640808L ^ var1), var3);
}

private static final boolean J(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 65433859242015L;
long var22 = var20 ^ 85180712928276L;
long var24 = var20 ^ 37931777745064L;
long var26 = var20 ^ 137933070912090L;
long var28 = var20 ^ 91073248053052L;
long var30 = var20 ^ 66033864732910L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[34];
int var16 = 0;
String var15 = "º?ê±^«b9Àÿ\u0001Ys7\u009a\u000f÷\u0003\u0088\u0015C:\u0003bÒ@£[¡¼\u0016\u009d\u0010Ú#q\u0085\u001fÙ\u0000 \b¸4¥rAM\u008f\u0010U|\u0084ç35\u008dÅv!·.&%Íâ\u0018·\u009c]ß6$Ï?øÍ%\u00012M¬i`ÀZ\\´\u0094\u0012-8M{ï\u0001µ.j\u0080Q\u0018J'\u0081§Å§ÁN6\u001e\u009e§ö\u009c[\u009aÁ¡81\u0019\u008fß³ÙF`ûÇèf\u00881h\u001a³a 2\u000bÌ0ðÙKÒ8\u0088u\u0011\u001b\u0086ê{\u001fïöÓÝÔ\u009b\u0094Fâì²\faó\fFÅú\u009cw\u0018,\fÃÆZJZ7GþU\u0081\fVÐõzA\u00820\\í±Ûv¬_(÷¢»»$\u0082÷Ü\u001aüÀ\u009b\u001c\u001cº¤A\u009cNh\u001atxÛg\b{n\u009d¾\r;é\u001b«\u007f7S(û(þ\u00114\u00ad×â\u001d·\u007fáåP\u0081³.\u0092\u0080\u008býFË^\u00adå\u009c\u007f¶é6Å9à\u0086âds\u009f:c\\\u0010\u0080\u009eØ×,ç\u0082N\u009d\u001alÂÇ4~\r\u0018x«!¦þ\u0007¥\"dÕGT÷¨x(-9AÌ\u001dr\u0012` ×Â~ÐÔ\u0087±\u00adj,I:Ü\u0096HÜ7¦Ã´\u0083(\u0002ÖäÓ\u000e|ð\u0086Ü\u0015\u0010\rW®\b\u0093¸n\u0013\u0016\u0087p\u008d½<\u0001º \u0091§\u0004-\u000e}?å\u001e~P\u0006þþ!7Jó¬\u0005O'VP\u0085\"HÏE\t v aÈÏLò\u0003ößDÊR8¬A³\u0086f[S\u0012ò)_Q\nB\u0014Ã\u0010T\u009b\u00ad(ËÚr\u008büa\u0000¯¸/g§&\u0014\u0015\u0082É\u008cÁ\u008dòèú»)\u0085\u009a\r\u0087óå¹\u000f,Çñ×;ûà\u0018¥·¹4ü\u009d\u0005\u009b\u0092ÏBx?³µ¸]¤¶îlÛ5Û\u00183c\u008dü\u009a\u0085ý_«ìâ\u0083±Ux¼8·9G\u0006©\u008c \u0010PZ\u000f&bÔ·Ï\u008e\u0081HYßiÔ@\u0010>qK¸Ì)/s\u0013¸\rf^\u001d\u000fµ :]U\u0099\u0087éÐûz\u008d¸q¿<ñ\u0086\u001e9\u0081ÿ\u0093Å%ªå\u0002-ñ\nGæ\u0097 ÀäjÞ\u0088I\\¤\u0007\u0004Ý\u0083!p\u0014æÛèF\u008eYH7n²\u0015H\fmW±\u0081\u0018Ð]\u0002J\u008b\"\u001f1¨åh\u0016Yí¾h\u0086r\u001cà\u0099¯\"¯(CÈÆ\u008fW\u0006(\u0097\u0019ÇhÌ\"ëª_\u0097EEG2ÞýÒí\u0012%Ì\u0000\u001dã\tÒ*ç~*}e* iç¦\u008f\u0083\u0003\u0001Õ'§ *´ÒªqÜ\u0085Ä7W?õL¸$ÁjÌTË² A\u0093+`[t¾\u0005l98ª¡ºG×\"\u009fMyZ'õ3\u0081Õ\u0000\u0097&ú\u000e\u000b ¤¬\u000fþº5B\u0000^è¬Õûª1ÃIYn\u000eP+ã¤eulÛ}Xæ\u0001\u0010ù\u0083O&°P\u0011pïÃSÉowS~\u0010\"µÌFÒ3¾ÞWá\u009e\u001d\u0004\u0018£g\u0010f_NÎìs;ÂÍq<{Õ%Õ,\u0018Ì\u009f5\u0005¾ÔU\u0094\u00877~\u008aâÿ5È\u001e¶\b7\nÇ\u0017O(f\u000f_\u0004ãÖLÖ\u001cGò\u008bi\u0016ÙÛ\u009c {¾%¨<µ\u0083\u0090g\u0015^\u001a\u008cw\nÜ1\u0018ò1cM 7Ç@\u0015íÂy¾8ï\u0088Q\u008eK\u001c\u0012_\u0007\fD»\u009c\u008d;\u0002\u000b;¾øÿ>¹";
int var17 = "º?ê±^«b9Àÿ\u0001Ys7\u009a\u000f÷\u0003\u0088\u0015C:\u0003bÒ@£[¡¼\u0016\u009d\u0010Ú#q\u0085\u001fÙ\u0000 \b¸4¥rAM\u008f\u0010U|\u0084ç35\u008dÅv!·.&%Íâ\u0018·\u009c]ß6$Ï?øÍ%\u00012M¬i`ÀZ\\´\u0094\u0012-8M{ï\u0001µ.j\u0080Q\u0018J'\u0081§Å§ÁN6\u001e\u009e§ö\u009c[\u009aÁ¡81\u0019\u008fß³ÙF`ûÇèf\u00881h\u001a³a 2\u000bÌ0ðÙKÒ8\u0088u\u0011\u001b\u0086ê{\u001fïöÓÝÔ\u009b\u0094Fâì²\faó\fFÅú\u009cw\u0018,\fÃÆZJZ7GþU\u0081\fVÐõzA\u00820\\í±Ûv¬_(÷¢»»$\u0082÷Ü\u001aüÀ\u009b\u001c\u001cº¤A\u009cNh\u001atxÛg\b{n\u009d¾\r;é\u001b«\u007f7S(û(þ\u00114\u00ad×â\u001d·\u007fáåP\u0081³.\u0092\u0080\u008býFË^\u00adå\u009c\u007f¶é6Å9à\u0086âds\u009f:c\\\u0010\u0080\u009eØ×,ç\u0082N\u009d\u001alÂÇ4~\r\u0018x«!¦þ\u0007¥\"dÕGT÷¨x(-9AÌ\u001dr\u0012` ×Â~ÐÔ\u0087±\u00adj,I:Ü\u0096HÜ7¦Ã´\u0083(\u0002ÖäÓ\u000e|ð\u0086Ü\u0015\u0010\rW®\b\u0093¸n\u0013\u0016\u0087p\u008d½<\u0001º \u0091§\u0004-\u000e}?å\u001e~P\u0006þþ!7Jó¬\u0005O'VP\u0085\"HÏE\t v aÈÏLò\u0003ößDÊR8¬A³\u0086f[S\u0012ò)_Q\nB\u0014Ã\u0010T\u009b\u00ad(ËÚr\u008büa\u0000¯¸/g§&\u0014\u0015\u0082É\u008cÁ\u008dòèú»)\u0085\u009a\r\u0087óå¹\u000f,Çñ×;ûà\u0018¥·¹4ü\u009d\u0005\u009b\u0092ÏBx?³µ¸]¤¶îlÛ5Û\u00183c\u008dü\u009a\u0085ý_«ìâ\u0083±Ux¼8·9G\u0006©\u008c \u0010PZ\u000f&bÔ·Ï\u008e\u0081HYßiÔ@\u0010>qK¸Ì)/s\u0013¸\rf^\u001d\u000fµ :]U\u0099\u0087éÐûz\u008d¸q¿<ñ\u0086\u001e9\u0081ÿ\u0093Å%ªå\u0002-ñ\nGæ\u0097 ÀäjÞ\u0088I\\¤\u0007\u0004Ý\u0083!p\u0014æÛèF\u008eYH7n²\u0015H\fmW±\u0081\u0018Ð]\u0002J\u008b\"\u001f1¨åh\u0016Yí¾h\u0086r\u001cà\u0099¯\"¯(CÈÆ\u008fW\u0006(\u0097\u0019ÇhÌ\"ëª_\u0097EEG2ÞýÒí\u0012%Ì\u0000\u001dã\tÒ*ç~*}e* iç¦\u008f\u0083\u0003\u0001Õ'§ *´ÒªqÜ\u0085Ä7W?õL¸$ÁjÌTË² A\u0093+`[t¾\u0005l98ª¡ºG×\"\u009fMyZ'õ3\u0081Õ\u0000\u0097&ú\u000e\u000b ¤¬\u000fþº5B\u0000^è¬Õûª1ÃIYn\u000eP+ã¤eulÛ}Xæ\u0001\u0010ù\u0083O&°P\u0011pïÃSÉowS~\u0010\"µÌFÒ3¾ÞWá\u009e\u001d\u0004\u0018£g\u0010f_NÎìs;ÂÍq<{Õ%Õ,\u0018Ì\u009f5\u0005¾ÔU\u0094\u00877~\u008aâÿ5È\u001e¶\b7\nÇ\u0017O(f\u000f_\u0004ãÖLÖ\u001cGò\u008bi\u0016ÙÛ\u009c {¾%¨<µ\u0083\u0090g\u0015^\u001a\u008cw\nÜ1\u0018ò1cM 7Ç@\u0015íÂy¾8ï\u0088Q\u008eK\u001c\u0012_\u0007\fD»\u009c\u008d;\u0002\u000b;¾øÿ>¹"
.length();
char var14 = ' ';
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var47 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var47;
if ((var35 += var14) >= var17) {
c = var18;
d = new String[34];
k = new HashMap(13);
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
String var4 = "W\u0095\u009em³\u0098bE\u008a\u0010GU\u001f´8É5ÜDFïÚÌº;[ºe×ØöJÆ¬\u00842õ\u0015\u0004\u000fâ\u001b|\u0094U\u008d_\u0093y\u001c'æq&¬\u009b\u000e5é\u0088K\t\u0081?\u00ad\u008c«Ñ8¶¾ñâÃ÷\u0097Òwhÿã±\u001f\u009aµ\u0010Ðáy(Ì\u0085Î¨6\u009f8©9³ &\u001dÞF)a6|ýòðÁ43ËOÿ*j\u008a\u0003yuÁA£Î";
int var5 = "W\u0095\u009em³\u0098bE\u008a\u0010GU\u001f´8É5ÜDFïÚÌº;[ºe×ØöJÆ¬\u00842õ\u0015\u0004\u000fâ\u001b|\u0094U\u008d_\u0093y\u001c'æq&¬\u009b\u000e5é\u0088K\t\u0081?\u00ad\u008c«Ñ8¶¾ñâÃ÷\u0097Òwhÿã±\u001f\u009aµ\u0010Ðáy(Ì\u0085Î¨6\u009f8©9³ &\u001dÞF)a6|ýòðÁ43ËOÿ*j\u008a\u0003yuÁA£Î"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
var10001 = var3++;
long var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var54 = -1;

while (true) {
long var8 = var51;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var56 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var54) {
case 0:
var39[var10001] = var56;
if (var2 >= var5) {
h = var6;
i = new Integer[18];
KProperty[] var32 = new KProperty[c<"u">(30550, 9020035800145506918L ^ var20)];
var32[0] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k3.class, b<"n">(28913, 7071079125189304581L ^ var20), b<"n">(25984, 4101604940463354988L ^ var20), 0)
);
var32[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k3.class, b<"n">(17278, 1299354786078429825L ^ var20), b<"n">(4152, 5639602506900783575L ^ var20), 0)
);
var32[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k3.class, b<"n">(20718, 5546237310030545181L ^ var20), b<"n">(14555, 4061365554329970978L ^ var20), 0)
);
var32[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k3.class, b<"n">(9293, 4214250130851231136L ^ var20), b<"n">(10594, 7748043313103239316L ^ var20), 0)
);
var32[4] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k3.class, b<"n">(20225, 1051332934193520360L ^ var20), b<"n">(7724, 2570715939790376905L ^ var20), 0)
);
var32[5] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k3.class, b<"n">(7201, 8464050972072857030L ^ var20), b<"n">(5054, 7274928993450017366L ^ var20), 0)
);
var32[c<"u">(32692, 8293910094637349507L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k3.class, b<"n">(21017, 8210669734966887406L ^ var20), b<"n">(23749, 3345959025940729121L ^ var20), 0)
);
var32[c<"u">(6629, 4381967111627300051L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k3.class, b<"n">(5277, 6217533465953879360L ^ var20), b<"n">(4224, 2805287162204111227L ^ var20), 0)
);
var32[c<"u">(23687, 3105006300879985085L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(k3.class, b<"n">(20360, 6948947679298592372L ^ var20), b<"n">(15574, 4580508373158030631L ^ var20), 0)
);
G = var32;
P = new k3(var24);
A = yp.t(P, b<"n">(876, 4776447479946007170L ^ var20), true, var26, null, null, c<"u">(16054, 3545244264950987652L ^ var20), null);
T = yp.t(P, b<"n">(6456, 1023503377357555929L ^ var20), true, var26, null, null, c<"u">(8288, 740791266920981831L ^ var20), null);
o = yp.L(P, b<"n">(29949, 4878232981049156894L ^ var20), fo.HEART, null, k3::P, 4, null, var30);
b = yp.k(
P, b<"n">(12231, 5146352497300241978L ^ var20), 0.2F, var22, RangesKt.rangeTo(0.01F, 0.5F), null, k3::s, c<"u">(23708, 4170309495969388964L ^ var20), null
);
j = yp.L(
P,
b<"n">(1975, 7075273373779121756L ^ var20),
c<"u">(13249, 424595019475973876L ^ var20),
new IntRange(5, c<"u">(24561, 3320697590584679112L ^ var20)),
var28,
null,
k3::Q,
c<"u">(23708, 4170309495969388964L ^ var20),
null
);
f = yp.L(
P,
b<"n">(25405, 1803249778658063069L ^ var20),
c<"u">(1711, 2872801258626466705L ^ var20),
new IntRange(5, c<"u">(26838, 4390986111337115106L ^ var20)),
var28,
null,
k3::z,
c<"u">(23708, 4170309495969388964L ^ var20),
null
);
I = yp.k(
P, b<"n">(11828, 3621098193630330834L ^ var20), 0.03F, var22, RangesKt.rangeTo(-0.15F, 0.15F), null, k3::M, c<"u">(23708, 4170309495969388964L ^ var20), null
);
N = yp.k(
P, b<"n">(3064, 672958490915691026L ^ var20), 0.25F, var22, RangesKt.rangeTo(0.01F, 2.0F), null, k3::Y, c<"u">(23708, 4170309495969388964L ^ var20), null
);
g = yp.k(
P, b<"n">(25226, 6783715704373556095L ^ var20), 0.5F, var22, RangesKt.rangeTo(0.01F, 2.0F), null, k3::j, c<"u">(23708, 4170309495969388964L ^ var20), null
);
B = new ArrayList();
return;
}
break;
default:
var39[var10001] = var56;
if (var2 < var5) {
continue label36;
}

var4 = "´?å~B\u000f$Ãþ:\u0082\u0013òÙ\u001a3";
var5 = "´?å~B\u000f$Ãþ:\u0082\u0013òÙ\u001a3".length();
var2 = 0;
}

byte var45 = var2;
var2 += 8;
var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
var39 = var6;
var10001 = var3++;
var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var54 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var47;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "1_\u0014\u0099o\u009a\u0098\u0086¨:'\u0087\u0085<¿¶ \u0001w>9a\u000enB »\t\u0094öÕÛiô2\u008e\u0012¾b¢ùþeÊE[Ò)®";
var17 = "1_\u0014\u0099o\u009a\u0098\u0086¨:'\u0087\u0085<¿¶ \u0001w>9a\u000enB »\t\u0094öÕÛiô2\u008e\u0012¾b¢ùþeÊE[Ò)®".length();
var14 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23924;
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
throw new RuntimeException("su/catlean/k3", var10);
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
throw new RuntimeException("su/catlean/k3" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18879;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])k.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/k3", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/k3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
