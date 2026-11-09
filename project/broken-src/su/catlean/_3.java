package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

public abstract class _3 extends _g {
static final KProperty[] D;
private final int L;
private boolean z;
@NotNull
private final cw K;
@NotNull
private final c8 C;
@NotNull
private final c8 P;
@NotNull
private final cq U;
@NotNull
private final cq G;
@NotNull
private final cw d;
@NotNull
private final cw J;
@NotNull
private final cw E;
@NotNull
private final ct T;
@NotNull
private final ct b;
@NotNull
private final cp N;
@NotNull
private final cq X;
@NotNull
private final cq e;
@NotNull
private final cq Y;
@NotNull
private final cq k;
@NotNull
private final cw g;
@NotNull
private final cw V;
@NotNull
private final cq j;
@NotNull
private final cs x;
@NotNull
private final cs a;
@NotNull
private final bg A;
private int f;
private static int[] u;
private static final long ab = yz.a(-2385895560131446595L, -5478889964095762468L, MethodHandles.lookup().lookupClass()).a(20760250163599L);
private static final String[] fb;
private static final String[] gb;
private static final Map hb = new HashMap(13);
private static final long[] lb;
private static final Integer[] mb;
private static final Map nb;

public _3(@NotNull String id, @NotNull fu category, int priority, long a, boolean withRange) {
ax = ab ^ ax;
long var7 = ax ^ 115427431229773L;
long var9 = ax ^ 21908390111652L;
long var11 = ax ^ 61797570933217L;
long var13 = ax ^ 43535214113481L;
long var15 = ax ^ 9070900707247L;
long var10001 = ax ^ 16138477103773L;
int var17 = (int)((ax ^ 16138477103773L) >>> 48);
int var18 = (int)((ax ^ 16138477103773L) << 16 >>> 32);
int var19 = (int)(var10001 << 48 >>> 48);
int var20 = (int)((ax ^ 134247415362874L) >>> 48);
long var21 = (ax ^ 134247415362874L) << 16 >>> 16;
long var23 = ax ^ 80548981458203L;
Intrinsics.checkNotNullParameter(id, b<"y">(18081, 5866307501426490800L ^ ax));
Intrinsics.checkNotNullParameter(category, b<"y">(23431, 3150813991069556973L ^ ax));
super(id, category, null, 4, null, var9);
this.L = priority;
this.z = withRange;
this.K = yp.L(this, b<"y">(1820, 2953447228396928001L ^ ax), xl.Vanilla, null, null, e<"c">(7505, 7871531241355932960L ^ ax), null, var23);
this.C = yp.L(
this,
b<"y">(2727, 8383546877272846814L ^ ax),
e<"c">(26364, 4556914306655948423L ^ ax),
new IntRange(2, e<"c">(30003, 1534188413143260491L ^ ax)),
var13,
null,
_3::h,
e<"c">(31704, 6299871341462328234L ^ ax),
null
);
this.P = yp.L(
this,
b<"y">(23887, 7803813854351861248L ^ ax),
0,
new IntRange(0, e<"c">(21236, 3690893947851750029L ^ ax)),
var13,
null,
_3::X,
e<"c">(31704, 6299871341462328234L ^ ax),
null
);
this.U = yp.t(this, b<"y">(29307, 2314206506485221671L ^ ax), true, var15, null, null, e<"c">(7505, 7871531241355932960L ^ ax), null);
this.G = yp.t(this, b<"y">(13156, 2663175184434972797L ^ ax), false, var15, null, _3::j, 4, null);
this.d = yp.L(this, b<"y">(9714, 7992238503053680287L ^ ax), zr.Normal, null, null, e<"c">(7505, 7871531241355932960L ^ ax), null, var23);
this.J = yp.L(this, b<"y">(24977, 256026324460214998L ^ ax), xx.Strict, null, null, e<"c">(7505, 7871531241355932960L ^ ax), null, var23);
this.E = yp.L(this, b<"y">(30461, 5149990909386689983L ^ ax), yi.Silent, null, null, e<"c">(7505, 7871531241355932960L ^ ax), null, var23);
this.T = yp.k(
this, b<"y">(30771, 2154397162079486787L ^ ax), 4.0F, var11, RangesKt.rangeTo(2.0F, 10.0F), null, _3::u, e<"c">(31704, 6299871341462328234L ^ ax), null
);
this.b = yp.k(
this, b<"y">(6906, 3297368279016530402L ^ ax), 4.0F, var11, RangesKt.rangeTo(2.0F, 10.0F), null, _3::W, e<"c">(31704, 6299871341462328234L ^ ax), null
);
this.N = yp.B(this, b<"y">(3955, 258902950973240376L ^ ax), (short)var17, w7.BOOLS, null, 4, var18, null, (char)var19);
this.X = yp.t(this, b<"y">(31746, 2474401039284733802L ^ ax), false, var15, this.v(var7), null, e<"c">(31704, 6299871341462328234L ^ ax), null);
this.e = yp.t(this, b<"y">(1798, 4526687014487391326L ^ ax), false, var15, this.v(var7), null, e<"c">(31704, 6299871341462328234L ^ ax), null);
this.Y = yp.t(this, b<"y">(26531, 7442828367559105731L ^ ax), false, var15, this.v(var7), null, e<"c">(31704, 6299871341462328234L ^ ax), null);
this.k = yp.t(this, b<"y">(7266, 493813710492296979L ^ ax), false, var15, this.v(var7), null, e<"c">(31704, 6299871341462328234L ^ ax), null);
this.g = yp.L(this, b<"y">(30092, 7115252705502334620L ^ ax), lr.BOTH, null, null, e<"c">(7505, 7871531241355932960L ^ ax), null, var23);
this.V = yp.L(this, b<"y">(4962, 1986423049512151074L ^ ax), og.Fade, null, null, e<"c">(7505, 7871531241355932960L ^ ax), null, var23);
this.j = yp.t(this, b<"y">(3770, 5530351557418874335L ^ ax), false, var15, null, null, e<"c">(7505, 7871531241355932960L ^ ax), null);
jk var26 = this;
short var10002 = (short)var20;
String var10003 = b<"y">(2836, 8699250144786903040L ^ ax);
Color var10004 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"y">(29089, 7032254663337478876L ^ ax));
this.x = yp.b(var26, var10002, var10003, var10004, null, _3::k, 4, null, var21);
jk var27 = this;
var10002 = (short)var20;
var10003 = b<"y">(16287, 1903737809144628458L ^ ax);
var10004 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"y">(20141, 3175944607494878679L ^ ax));
this.a = yp.b(var27, var10002, var10003, var10004, null, _3::O, 4, null, var21);
this.A = new bg();
}

public _3(String var1, short var2, fu var3, int var4, boolean var5, int var6, short var7, int var8, DefaultConstructorMarker var9) {
long var10 = ((long)var2 << 48 | (long)var7 << 48 >>> 16 | (long)var8 << 32 >>> 32) ^ ab;
long var12 = var10 ^ 19777967815507L;
if ((var6 & 4) != 0) {
var4 = e<"c">(17776, 5845187269335968814L ^ var10);
}

if ((var6 & e<"c">(20669, 179461351252687357L ^ var10)) != 0) {
var5 = true;
}

this(var1, var3, var4, var12, var5);
}

public final int e() {
return this.L;
}

private final xl K(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 120573102331404L;
return (xl)this.K.E(this, var3, D[0]);
}

private final void a(long var1, xl var3) {
var1 = ab ^ var1;
long var4 = var1 ^ 118079935616336L;
this.K.b(this, var4, D[0], var3);
}

private final int z(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 26509584060272L;
return ((Number)this.C.E(this, var3, D[1])).intValue();
}

private final void a(long var1, int var3) {
var1 = ab ^ var1;
long var4 = var1 ^ 105462548937371L;
this.C.b(this, var4, D[1], var3);
}

private final int C(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 92453957235794L;
return ((Number)this.P.E(this, var3, D[2])).intValue();
}

private final void M(int var1, long var2) {
var2 = ab ^ var2;
long var4 = var2 ^ 62291960017269L;
this.P.b(this, var4, D[2], var1);
}

protected final boolean h(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 57496035320061L;
return (Boolean)this.U.E(this, var3, D[3]);
}

protected final void H(long a, boolean <set-?>) {
ax = ab ^ ax;
long var4 = ax ^ 109744926264116L;
this.U.b(this, var4, D[3], <set-?>);
}

protected final boolean E(int var1, char var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ ab;
long var6 = var4 ^ 61223432574780L;
return (Boolean)this.G.E(this, var6, D[4]);
}

protected final void s(boolean <set-?>, short a, int a, char a) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ ab;
long var7 = var5 ^ 64432408106211L;
this.G.b(this, var7, D[4], <set-?>);
}

@NotNull
protected final zr r(long var1, short var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ ab;
long var6 = var4 ^ 118526483438614L;
return (zr)this.d.E(this, var6, D[5]);
}

protected final void l(long a, @NotNull zr <set-?>) {
ax = ab ^ ax;
long var4 = ax ^ 3728319365740L;
Intrinsics.checkNotNullParameter(<set-?>, b<"y">(9627, 5270203287100849727L ^ ax));
this.d.b(this, var4, D[5], <set-?>);
}

@NotNull
protected final xx w(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 123555968685451L;
return (xx)this.J.E(this, var3, D[e<"c">(21519, 7135644200347524241L ^ var1)]);
}

protected final void Z(int a, char a, @NotNull xx <set-?>, char a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ ab;
long var7 = var5 ^ 17201467469866L;
Intrinsics.checkNotNullParameter(<set-?>, b<"y">(9627, 5270206856453721209L ^ var5));
this.J.b(this, var7, D[e<"c">(26364, 4556834836447747128L ^ var5)], <set-?>);
}

@NotNull
protected final yi a(int var1, int var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ ab;
long var6 = var4 ^ 123430307473609L;
return (yi)this.E.E(this, var6, D[e<"c">(29869, 7789813839176450428L ^ var4)]);
}

protected final void a(@NotNull yi <set-?>, int a, int a, char a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ ab;
long var7 = var5 ^ 110446372353500L;
Intrinsics.checkNotNullParameter(<set-?>, b<"y">(15372, 6192691952538636350L ^ var5));
this.E.b(this, var7, D[e<"c">(27053, 7964578319394641540L ^ var5)], <set-?>);
}

protected final float Y(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 20461861107089L;
return ((Number)this.T.E(this, var3, D[e<"c">(31704, 6299905988475097922L ^ var1)])).floatValue();
}

protected final void n(float <set-?>, long a) {
ax = ab ^ ax;
long var4 = ax ^ 98280203085225L;
this.T.b(this, var4, D[e<"c">(31704, 6299899347823924374L ^ ax)], <set-?>);
}

protected final float Q(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 95389596677855L;
return ((Number)this.b.E(this, var3, D[e<"c">(31523, 473857450147549432L ^ var1)])).floatValue();
}

protected final void Y(float <set-?>, long a) {
ax = ab ^ ax;
long var4 = ax ^ 25017551864232L;
this.b.b(this, var4, D[e<"c">(24671, 4051424895171275524L ^ ax)], <set-?>);
}

@NotNull
protected final h v(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 57296597313104L;
return (h)this.N.E(this, var3, D[e<"c">(29084, 5064867317070990039L ^ var1)]);
}

protected final boolean x(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 109444432388511L;
return (Boolean)this.X.E(this, var3, D[e<"c">(14875, 7466110760427701913L ^ var1)]);
}

protected final boolean W(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 24496785454771L;
return (Boolean)this.e.E(this, var3, D[e<"c">(14875, 882129250012778913L ^ var1)]);
}

protected final boolean B(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 83257132603906L;
return (Boolean)this.Y.E(this, var3, D[e<"c">(1421, 264559722851091089L ^ var1)]);
}

protected final boolean G(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 76828083625559L;
return (Boolean)this.k.E(this, var3, D[e<"c">(26014, 4628861928148494031L ^ var1)]);
}

@NotNull
protected final lr D(short var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ ab;
long var6 = var4 ^ 2619579479762L;
return (lr)this.g.E(this, var6, D[e<"c">(2994, 6028266663000154179L ^ var4)]);
}

protected final void J(long a, @NotNull lr <set-?>) {
ax = ab ^ ax;
long var4 = ax ^ 53377559090169L;
Intrinsics.checkNotNullParameter(<set-?>, b<"y">(9627, 5270256205211234218L ^ ax));
this.g.b(this, var4, D[e<"c">(20474, 3393224476530349817L ^ ax)], <set-?>);
}

@NotNull
protected final og H(int var1, int var2, byte var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ ab;
long var6 = var4 ^ 127712625548161L;
return (og)this.V.E(this, var6, D[e<"c">(18956, 7496291538082008215L ^ var4)]);
}

protected final void I(@NotNull og <set-?>, long a) {
ax = ab ^ ax;
long var4 = ax ^ 121115908992076L;
Intrinsics.checkNotNullParameter(<set-?>, b<"y">(9627, 5270311852673355807L ^ ax));
this.V.b(this, var4, D[e<"c">(20575, 2293994151714797301L ^ ax)], <set-?>);
}

protected final boolean n(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 137335833347677L;
return (Boolean)this.j.E(this, var3, D[e<"c">(8802, 7551717229234288947L ^ var1)]);
}

@NotNull
protected final Color P(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 46537487466733L;
return (Color)this.x.E(this, var3, D[e<"c">(20077, 2805939579330859907L ^ var1)]);
}

@NotNull
protected final Color A(long var1) {
var1 = ab ^ var1;
long var3 = var1 ^ 17808481147381L;
return (Color)this.a.E(this, var3, D[e<"c">(2080, 2079024786315201754L ^ var1)]);
}

@NotNull
protected final bg p() {
return this.A;
}

@Flow
protected final void h(@NotNull ReceivePacket e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_3.ab J
// 03: ldc2_w 115782480572864
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 134781164776590
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 13005478502683
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -8498944904247978477
// 1b: lload 2
// 1c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: aload 1
// 22: ldc "e"
// 24: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 27: astore 8
// 29: aload 1
// 2a: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 2d: instanceof net/minecraft/class_3944
// 30: aload 8
// 32: ifnonnull 68
// 35: ifeq 97
// 38: goto 45
// 3b: ldc2_w -8404026909282059694
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: aload 0
// 46: getfield su/catlean/_3.A Lsu/catlean/bg;
// 49: sipush 24828
// 4c: ldc2_w 2736427886308440653
// 4f: lload 2
// 50: lxor
// 51: invokedynamic c (IJ)I bsm=su/catlean/_3.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56: lload 6
// 58: invokevirtual su/catlean/bg.c (IJ)Z
// 5b: goto 68
// 5e: ldc2_w -8404026909282059694
// 61: lload 2
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: ifne 97
// 6b: new net/minecraft/class_2815
// 6e: dup
// 6f: aload 1
// 70: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 73: checkcast net/minecraft/class_3944
// 76: invokevirtual net/minecraft/class_3944.method_17592 ()I
// 79: invokespecial net/minecraft/class_2815.<init> (I)V
// 7c: checkcast net/minecraft/class_2596
// 7f: lload 4
// 81: dup2_x1
// 82: pop2
// 83: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 86: aload 1
// 87: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 8a: goto 97
// 8d: ldc2_w -8404026909282059694
// 90: lload 2
// 91: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 96: athrow
// 97: return
}

// $VF: Irreducible bytecode was duplicated to produce valid code
protected final boolean o(@NotNull List positions, long a, boolean async, boolean ignoreStrict, @NotNull List blocks, boolean invertSelection) {
ax = ab ^ ax;
long var8 = ax ^ 102097442346659L;
Intrinsics.checkNotNullParameter(positions, b<"y">(28498, 6955686765444421919L ^ ax));
String var10000 = vm.a<"Å">(8502510248031103456L, ax);
Intrinsics.checkNotNullParameter(blocks, b<"y">(441, 2513650397171627912L ^ ax));
String var10 = var10000;
Iterable var11 = blocks;
boolean var12 = false;
Collection var14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var11, e<"c">(21236, 3690866684448667559L ^ ax)));
boolean var15 = false;
Iterator var16 = var11.iterator();

label22:
while (true) {
if (var16.hasNext()) {
var10000 = (String)var16.next();
} else {
var10000 = var14;
if (ax > 0L) {
break;
}
}

while (true) {
Object var17 = var10000;
var10000 = var14;
class_2248 var18 = (class_2248)var17;
if (var10 != null) {
break label22;
}

boolean var19 = false;
class_1792 var27 = var18.method_8389();
Intrinsics.checkNotNullExpressionValue(var27, b<"y">(22340, 5760240601830383908L ^ ax));
var14.add(var27);
if (var10 == null) {
break;
}

var10000 = var14;
if (ax > 0L) {
break label22;
}
}
}

List var24 = (List)var10000;
return this.v(positions, async, var8, ignoreStrict, var24, invertSelection);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static boolean s(_3 var0, List var1, boolean var2, boolean var3, List var4, boolean var5, int var6, long var7, Object var9) {
var7 = ab ^ var7;
long var10 = var7 ^ 111567359980138L;
long var12 = var7 ^ 88065703133033L;
String var14 = vm.a<"Å">(-148417011689938450L, var7);

try {
if (var9 != null) {
throw new UnsupportedOperationException(b<"y">(4958, 1995443092623043859L ^ var7));
}
} catch (UnsupportedOperationException var18) {
throw vm.a<"Å">(var18, -242069384626090577L, var7);
}

int var10000;
String var10001;
label100: {
label99: {
label98: {
try {
var10000 = var6 & 2;
var10001 = var14;
if (var7 <= 0L) {
break label100;
}

if (var14 != null) {
break label99;
}

if (var10000 == 0) {
break label98;
}
} catch (UnsupportedOperationException var22) {
throw vm.a<"Å">(var22, -242069384626090577L, var7);
}

var2 = false;
}

var10000 = var6 & 4;
}

try {
var10001 = var14;
} catch (UnsupportedOperationException var17) {
throw vm.a<"Å">(var17, -242069384626090577L, var7);
}
}

label87: {
label86: {
label85: {
try {
if (var7 < 0L) {
break label87;
}

if (var10001 != null) {
break label86;
}

if (var10000 == 0) {
break label85;
}
} catch (UnsupportedOperationException var21) {
throw vm.a<"Å">(var21, -242069384626090577L, var7);
}

var3 = false;
}

var10000 = var6 & e<"c">(31704, 6299919950495110798L ^ var7);
}

try {
var10001 = var14;
} catch (UnsupportedOperationException var16) {
throw vm.a<"Å">(var16, -242069384626090577L, var7);
}
}

label74: {
label73: {
label72: {
try {
if (var7 < 0L) {
break label74;
}

if (var10001 != null) {
break label73;
}

if (var10000 == 0) {
break label72;
}
} catch (UnsupportedOperationException var20) {
throw vm.a<"Å">(var20, -242069384626090577L, var7);
}

var4 = var0.R(var12);
}

var10000 = var6 & e<"c">(20575, 2293917732582653192L ^ var7);
}

try {
var10001 = var14;
} catch (UnsupportedOperationException var15) {
throw vm.a<"Å">(var15, -242069384626090577L, var7);
}
}

try {
if (var10001 != null) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var0.o(var1, var10, var2, var3, var4, var5);
}
} catch (UnsupportedOperationException var19) {
throw vm.a<"Å">(var19, -242069384626090577L, var7);
}

var5 = false;
return var0.o(var1, var10, var2, var3, var4, var5);
}

protected final boolean v(@NotNull List positions, boolean async, long a, boolean ignoreStrict, @NotNull List blocks, boolean invertSelection) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_3.ab J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 18769597456768
// 00b: lxor
// 00c: lstore 8
// 00e: dup2
// 00f: ldc2_w 110668448020732
// 012: lxor
// 013: lstore 10
// 015: dup2
// 016: ldc2_w 102357662718626
// 019: lxor
// 01a: lstore 12
// 01c: dup2
// 01d: ldc2_w 80513354399680
// 020: lxor
// 021: lstore 14
// 023: pop2
// 024: aload 1
// 025: sipush 13181
// 028: ldc2_w 1299751059927214531
// 02b: lload 3
// 02c: lxor
// 02d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 035: ldc2_w 6429326213395514663
// 038: lload 3
// 039: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: aload 6
// 040: sipush 12633
// 043: ldc2_w 2768340352589704138
// 046: lload 3
// 047: lxor
// 048: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 050: astore 16
// 052: aload 0
// 053: getfield su/catlean/_3.f I
// 056: aload 16
// 058: ifnonnull 081
// 05b: ifle 07b
// 05e: goto 06b
// 061: ldc2_w 6371122938125085030
// 064: lload 3
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: aload 0
// 06c: getfield su/catlean/_3.f I
// 06f: istore 17
// 071: aload 0
// 072: iload 17
// 074: bipush -1
// 075: iadd
// 076: putfield su/catlean/_3.f I
// 079: bipush 0
// 07a: ireturn
// 07b: aload 1
// 07c: invokeinterface java/util/List.isEmpty ()Z 1
// 081: aload 16
// 083: ifnonnull 0a8
// 086: ifeq 0a2
// 089: goto 096
// 08c: ldc2_w 6371122938125085030
// 08f: lload 3
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: bipush 0
// 097: ireturn
// 098: ldc2_w 6371122938125085030
// 09b: lload 3
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: aload 0
// 0a3: lload 8
// 0a5: invokespecial su/catlean/_3.z (J)I
// 0a8: istore 17
// 0aa: bipush 0
// 0ab: istore 18
// 0ad: aload 1
// 0ae: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0b3: astore 19
// 0b5: aload 19
// 0b7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0bc: ifeq 198
// 0bf: aload 19
// 0c1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c6: checkcast net/minecraft/class_2338
// 0c9: astore 20
// 0cb: iload 17
// 0cd: aload 16
// 0cf: lload 3
// 0d0: lconst_0
// 0d1: lcmp
// 0d2: iflt 0da
// 0d5: ifnonnull 19a
// 0d8: aload 16
// 0da: lload 3
// 0db: lconst_0
// 0dc: lcmp
// 0dd: ifle 136
// 0e0: ifnonnull 134
// 0e3: goto 0f0
// 0e6: ldc2_w 6371122938125085030
// 0e9: lload 3
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: lload 3
// 0f1: lconst_0
// 0f2: lcmp
// 0f3: ifle 127
// 0f6: ifgt 118
// 0f9: goto 106
// 0fc: ldc2_w 6371122938125085030
// 0ff: lload 3
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: aload 16
// 108: ifnull 198
// 10b: goto 118
// 10e: ldc2_w 6371122938125085030
// 111: lload 3
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: aload 0
// 119: lload 14
// 11b: aload 20
// 11d: aload 6
// 11f: iload 2
// 120: iload 5
// 122: iload 7
// 124: invokespecial su/catlean/_3.d (JLnet/minecraft/class_2338;Ljava/util/List;ZZZ)Z
// 127: goto 134
// 12a: ldc2_w 6371122938125085030
// 12d: lload 3
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: aload 16
// 136: ifnonnull 14a
// 139: ifeq 0b5
// 13c: goto 149
// 13f: ldc2_w 6371122938125085030
// 142: lload 3
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: bipush 1
// 14a: istore 18
// 14c: lload 3
// 14d: lconst_0
// 14e: lcmp
// 14f: ifle 18a
// 152: aload 0
// 153: aload 16
// 155: ifnonnull 181
// 158: lload 10
// 15a: invokespecial su/catlean/_3.K (J)Lsu/catlean/xl;
// 15d: getstatic su/catlean/xl.Instant Lsu/catlean/xl;
// 160: if_acmpne 18f
// 163: goto 170
// 166: ldc2_w 6371122938125085030
// 169: lload 3
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: iinc 17 -1
// 173: aload 0
// 174: goto 181
// 177: ldc2_w 6371122938125085030
// 17a: lload 3
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: aload 0
// 182: lload 12
// 184: invokespecial su/catlean/_3.C (J)I
// 187: putfield su/catlean/_3.f I
// 18a: aload 16
// 18c: ifnull 0b5
// 18f: lload 3
// 190: lconst_0
// 191: lcmp
// 192: iflt 0cb
// 195: goto 198
// 198: iload 18
// 19a: ireturn
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static boolean p(_3 var0, List var1, boolean var2, boolean var3, long var4, List var6, boolean var7, int var8, Object var9) {
var4 = ab ^ var4;
long var10 = var4 ^ 115830692985355L;
long var12 = var4 ^ 77576500565137L;
String var14 = vm.a<"Å">(-5202530233969153070L, var4);

try {
if (var9 != null) {
throw new UnsupportedOperationException(b<"y">(17041, 9008183637158213337L ^ var4));
}
} catch (UnsupportedOperationException var18) {
throw vm.a<"Å">(var18, -5287315031517821037L, var4);
}

int var10000;
String var10001;
label100: {
label99: {
label98: {
try {
var10000 = var8 & 2;
var10001 = var14;
if (var4 <= 0L) {
break label100;
}

if (var14 != null) {
break label99;
}

if (var10000 == 0) {
break label98;
}
} catch (UnsupportedOperationException var22) {
throw vm.a<"Å">(var22, -5287315031517821037L, var4);
}

var2 = false;
}

var10000 = var8 & 4;
}

try {
var10001 = var14;
} catch (UnsupportedOperationException var17) {
throw vm.a<"Å">(var17, -5287315031517821037L, var4);
}
}

label87: {
label86: {
label85: {
try {
if (var4 <= 0L) {
break label87;
}

if (var10001 != null) {
break label86;
}

if (var10000 == 0) {
break label85;
}
} catch (UnsupportedOperationException var21) {
throw vm.a<"Å">(var21, -5287315031517821037L, var4);
}

var3 = false;
}

var10000 = var8 & e<"c">(31704, 6299865186634898610L ^ var4);
}

try {
var10001 = var14;
} catch (UnsupportedOperationException var16) {
throw vm.a<"Å">(var16, -5287315031517821037L, var4);
}
}

label74: {
label73: {
label72: {
try {
if (var4 <= 0L) {
break label74;
}

if (var10001 != null) {
break label73;
}

if (var10000 == 0) {
break label72;
}
} catch (UnsupportedOperationException var20) {
throw vm.a<"Å">(var20, -5287315031517821037L, var4);
}

var6 = var0.g(var10);
}

var10000 = var8 & e<"c">(20575, 2294007683350509364L ^ var4);
}

try {
var10001 = var14;
} catch (UnsupportedOperationException var15) {
throw vm.a<"Å">(var15, -5287315031517821037L, var4);
}
}

try {
if (var10001 != null) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var0.v(var1, var2, var12, var3, var6, var7);
}
} catch (UnsupportedOperationException var19) {
throw vm.a<"Å">(var19, -5287315031517821037L, var4);
}

var7 = false;
return var0.v(var1, var2, var12, var3, var6, var7);
}

private final boolean d(long param1, class_2338 param3, List param4, boolean param5, boolean param6, boolean param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_3.ab J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 91172208796914
// 00b: lxor
// 00c: lstore 8
// 00e: dup2
// 00f: ldc2_w 3713773927768
// 012: lxor
// 013: lstore 10
// 015: dup2
// 016: ldc2_w 52784224653952
// 019: lxor
// 01a: lstore 12
// 01c: dup2
// 01d: ldc2_w 98298953251944
// 020: lxor
// 021: dup2
// 022: bipush 32
// 024: lushr
// 025: l2i
// 026: istore 14
// 028: dup2
// 029: bipush 32
// 02b: lshl
// 02c: bipush 48
// 02e: lushr
// 02f: l2i
// 030: istore 15
// 032: dup2
// 033: bipush 48
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 16
// 03c: pop2
// 03d: dup2
// 03e: ldc2_w 126225828223269
// 041: lxor
// 042: dup2
// 043: bipush 48
// 045: lushr
// 046: l2i
// 047: istore 17
// 049: dup2
// 04a: bipush 16
// 04c: lshl
// 04d: bipush 32
// 04f: lushr
// 050: l2i
// 051: istore 18
// 053: dup2
// 054: bipush 48
// 056: lshl
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 19
// 05d: pop2
// 05e: dup2
// 05f: ldc2_w 67634343136859
// 062: lxor
// 063: lstore 20
// 065: dup2
// 066: ldc2_w 126023418279124
// 069: lxor
// 06a: lstore 22
// 06c: dup2
// 06d: ldc2_w 5519740958530
// 070: lxor
// 071: dup2
// 072: bipush 16
// 074: lushr
// 075: lstore 24
// 077: dup2
// 078: bipush 48
// 07a: lshl
// 07b: bipush 48
// 07d: lushr
// 07e: l2i
// 07f: istore 26
// 081: pop2
// 082: dup2
// 083: ldc2_w 29613185970389
// 086: lxor
// 087: dup2
// 088: bipush 32
// 08a: lushr
// 08b: l2i
// 08c: istore 27
// 08e: dup2
// 08f: bipush 32
// 091: lshl
// 092: bipush 40
// 094: lushr
// 095: l2i
// 096: istore 28
// 098: dup2
// 099: bipush 56
// 09b: lshl
// 09c: bipush 56
// 09e: lushr
// 09f: l2i
// 0a0: istore 29
// 0a2: pop2
// 0a3: dup2
// 0a4: ldc2_w 136707050938053
// 0a7: lxor
// 0a8: lstore 30
// 0aa: dup2
// 0ab: ldc2_w 33630388518623
// 0ae: lxor
// 0af: lstore 32
// 0b1: dup2
// 0b2: ldc2_w 67970390096414
// 0b5: lxor
// 0b6: lstore 34
// 0b8: dup2
// 0b9: ldc2_w 139620510773921
// 0bc: lxor
// 0bd: lstore 36
// 0bf: dup2
// 0c0: ldc2_w 29149599740053
// 0c3: lxor
// 0c4: lstore 38
// 0c6: dup2
// 0c7: ldc2_w 21282620204467
// 0ca: lxor
// 0cb: lstore 40
// 0cd: dup2
// 0ce: ldc2_w 9984156207472
// 0d1: lxor
// 0d2: lstore 42
// 0d4: dup2
// 0d5: ldc2_w 75432119184313
// 0d8: lxor
// 0d9: lstore 44
// 0db: dup2
// 0dc: ldc2_w 105793334262609
// 0df: lxor
// 0e0: dup2
// 0e1: bipush 48
// 0e3: lushr
// 0e4: l2i
// 0e5: istore 46
// 0e7: dup2
// 0e8: bipush 16
// 0ea: lshl
// 0eb: bipush 48
// 0ed: lushr
// 0ee: l2i
// 0ef: istore 47
// 0f1: dup2
// 0f2: bipush 32
// 0f4: lshl
// 0f5: bipush 32
// 0f7: lushr
// 0f8: l2i
// 0f9: istore 48
// 0fb: pop2
// 0fc: dup2
// 0fd: ldc2_w 33586264818589
// 100: lxor
// 101: dup2
// 102: bipush 32
// 104: lushr
// 105: l2i
// 106: istore 49
// 108: dup2
// 109: bipush 32
// 10b: lshl
// 10c: bipush 48
// 10e: lushr
// 10f: l2i
// 110: istore 50
// 112: dup2
// 113: bipush 48
// 115: lshl
// 116: bipush 48
// 118: lushr
// 119: l2i
// 11a: istore 51
// 11c: pop2
// 11d: dup2
// 11e: ldc2_w 5097358589774
// 121: lxor
// 122: dup2
// 123: bipush 48
// 125: lushr
// 126: l2i
// 127: istore 52
// 129: dup2
// 12a: bipush 16
// 12c: lshl
// 12d: bipush 32
// 12f: lushr
// 130: l2i
// 131: istore 53
// 133: dup2
// 134: bipush 48
// 136: lshl
// 137: bipush 48
// 139: lushr
// 13a: l2i
// 13b: istore 54
// 13d: pop2
// 13e: dup2
// 13f: ldc2_w 99520365005737
// 142: lxor
// 143: lstore 55
// 145: dup2
// 146: ldc2_w 37913520004140
// 149: lxor
// 14a: lstore 57
// 14c: dup2
// 14d: ldc2_w 138728407807922
// 150: lxor
// 151: dup2
// 152: bipush 48
// 154: lushr
// 155: l2i
// 156: istore 59
// 158: dup2
// 159: bipush 16
// 15b: lshl
// 15c: bipush 16
// 15e: lushr
// 15f: lstore 60
// 161: pop2
// 162: dup2
// 163: ldc2_w 61607778819467
// 166: lxor
// 167: lstore 62
// 169: dup2
// 16a: ldc2_w 19990108187913
// 16d: lxor
// 16e: lstore 64
// 170: dup2
// 171: ldc2_w 119470317723014
// 174: lxor
// 175: dup2
// 176: bipush 48
// 178: lushr
// 179: l2i
// 17a: istore 66
// 17c: dup2
// 17d: bipush 16
// 17f: lshl
// 180: bipush 32
// 182: lushr
// 183: l2i
// 184: istore 67
// 186: dup2
// 187: bipush 48
// 189: lshl
// 18a: bipush 48
// 18c: lushr
// 18d: l2i
// 18e: istore 68
// 190: pop2
// 191: dup2
// 192: ldc2_w 132991045273423
// 195: lxor
// 196: dup2
// 197: bipush 48
// 199: lushr
// 19a: l2i
// 19b: istore 69
// 19d: dup2
// 19e: bipush 16
// 1a0: lshl
// 1a1: bipush 48
// 1a3: lushr
// 1a4: l2i
// 1a5: istore 70
// 1a7: dup2
// 1a8: bipush 32
// 1aa: lshl
// 1ab: bipush 32
// 1ad: lushr
// 1ae: l2i
// 1af: istore 71
// 1b1: pop2
// 1b2: dup2
// 1b3: ldc2_w 23490003299472
// 1b6: lxor
// 1b7: lstore 72
// 1b9: pop2
// 1ba: ldc2_w -7161310653411966845
// 1bd: lload 1
// 1be: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c3: astore 78
// 1c5: iload 7
// 1c7: ifeq 1e8
// 1ca: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1cd: aload 4
// 1cf: invokedynamic b (Ljava/util/List;)Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/_3.w (Ljava/util/List;Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 1d4: lload 57
// 1d6: dup2_x1
// 1d7: pop2
// 1d8: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 1db: goto 1f2
// 1de: ldc2_w -7075540626075472702
// 1e1: lload 1
// 1e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: athrow
// 1e8: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1eb: lload 22
// 1ed: aload 4
// 1ef: invokevirtual su/catlean/gg.U (JLjava/util/List;)Lsu/catlean/fg;
// 1f2: astore 79
// 1f4: aload 79
// 1f6: invokevirtual su/catlean/fg.R ()Z
// 1f9: aload 78
// 1fb: lload 1
// 1fc: lconst_0
// 1fd: lcmp
// 1fe: ifle 228
// 201: ifnonnull 226
// 204: ifne 220
// 207: goto 214
// 20a: ldc2_w -7075540626075472702
// 20d: lload 1
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: bipush 0
// 215: ireturn
// 216: ldc2_w -7075540626075472702
// 219: lload 1
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: aload 0
// 221: lload 8
// 223: invokevirtual su/catlean/_3.M (J)Z
// 226: aload 78
// 228: ifnonnull 23c
// 22b: ifeq 23d
// 22e: goto 23b
// 231: ldc2_w -7075540626075472702
// 234: lload 1
// 235: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23a: athrow
// 23b: bipush 0
// 23c: ireturn
// 23d: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 240: aload 3
// 241: aload 79
// 243: invokevirtual su/catlean/fg.a ()I
// 246: iload 6
// 248: ifeq 25b
// 24b: getstatic su/catlean/xx.Vanilla Lsu/catlean/xx;
// 24e: goto 261
// 251: ldc2_w -7075540626075472702
// 254: lload 1
// 255: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25a: athrow
// 25b: aload 0
// 25c: lload 32
// 25e: invokevirtual su/catlean/_3.w (J)Lsu/catlean/xx;
// 261: aload 0
// 262: lload 24
// 264: iload 26
// 266: i2s
// 267: invokevirtual su/catlean/_3.r (JS)Lsu/catlean/zr;
// 26a: aload 0
// 26b: invokevirtual su/catlean/_3.s ()Lsu/catlean/y4;
// 26e: aload 0
// 26f: lload 30
// 271: invokevirtual su/catlean/_3.Y (J)F
// 274: aload 0
// 275: lload 62
// 277: invokevirtual su/catlean/_3.Q (J)F
// 27a: aload 0
// 27b: getfield su/catlean/_3.L I
// 27e: aload 0
// 27f: iload 49
// 281: iload 50
// 283: iload 51
// 285: invokevirtual su/catlean/_3.a (III)Lsu/catlean/yi;
// 288: lload 12
// 28a: dup2_x1
// 28b: pop2
// 28c: aconst_null
// 28d: aload 0
// 28e: iload 14
// 290: iload 15
// 292: i2c
// 293: iload 16
// 295: i2c
// 296: invokevirtual su/catlean/_3.E (ICC)Z
// 299: sipush 11972
// 29c: ldc2_w 6067057103827297017
// 29f: lload 1
// 2a0: lxor
// 2a1: invokedynamic c (IJ)I bsm=su/catlean/_3.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a6: aconst_null
// 2a7: invokestatic su/catlean/gw.P (Lsu/catlean/gw;Lnet/minecraft/class_2338;ILsu/catlean/xx;Lsu/catlean/zr;Lsu/catlean/y4;FFIJLsu/catlean/yi;Ljava/util/List;ZILjava/lang/Object;)Lsu/catlean/t5;
// 2aa: astore 80
// 2ac: aload 80
// 2ae: aload 78
// 2b0: ifnonnull 2c5
// 2b3: ifnull 692
// 2b6: goto 2c3
// 2b9: ldc2_w -7075540626075472702
// 2bc: lload 1
// 2bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c2: athrow
// 2c3: aload 80
// 2c5: astore 81
// 2c7: bipush 0
// 2c8: istore 82
// 2ca: aload 0
// 2cb: lload 42
// 2cd: aload 3
// 2ce: invokespecial su/catlean/_3.x (JLnet/minecraft/class_2338;)Lnet/minecraft/class_1297;
// 2d1: astore 83
// 2d3: lload 1
// 2d4: lconst_0
// 2d5: lcmp
// 2d6: ifle 36e
// 2d9: aload 83
// 2db: ifnull 36e
// 2de: aload 0
// 2df: aload 83
// 2e1: lload 38
// 2e3: invokevirtual su/catlean/_3.m (Lnet/minecraft/class_1297;J)Z
// 2e6: aload 78
// 2e8: ifnonnull 36d
// 2eb: goto 2f8
// 2ee: ldc2_w -7075540626075472702
// 2f1: lload 1
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: ifeq 35f
// 2fb: goto 308
// 2fe: ldc2_w -7075540626075472702
// 301: lload 1
// 302: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 307: athrow
// 308: lload 20
// 30a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 30d: checkcast net/minecraft/class_1297
// 310: lload 20
// 312: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 315: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 318: invokestatic net/minecraft/class_2824.method_34206 (Lnet/minecraft/class_1297;Z)Lnet/minecraft/class_2824;
// 31b: dup
// 31c: sipush 1962
// 31f: ldc2_w 1941274036019386551
// 322: lload 1
// 323: lxor
// 324: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 32c: astore 84
// 32e: iload 59
// 330: i2s
// 331: aload 84
// 333: aload 83
// 335: invokevirtual net/minecraft/class_1297.method_5628 ()I
// 338: lload 60
// 33a: dup2_x1
// 33b: pop2
// 33c: invokestatic su/catlean/t0.x (SLnet/minecraft/class_2824;JI)V
// 33f: lload 34
// 341: aload 84
// 343: checkcast net/minecraft/class_2596
// 346: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 349: lload 20
// 34b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 34e: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 351: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 354: lload 1
// 355: lconst_0
// 356: lcmp
// 357: iflt 36e
// 35a: aload 78
// 35c: ifnull 36e
// 35f: bipush 0
// 360: goto 36d
// 363: ldc2_w -7075540626075472702
// 366: lload 1
// 367: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36c: athrow
// 36d: ireturn
// 36e: aload 0
// 36f: lload 55
// 371: invokevirtual su/catlean/_3.h (J)Z
// 374: aload 78
// 376: lload 1
// 377: lconst_0
// 378: lcmp
// 379: ifle 3ea
// 37c: ifnonnull 3e8
// 37f: ifeq 3e6
// 382: goto 38f
// 385: ldc2_w -7075540626075472702
// 388: lload 1
// 389: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38e: athrow
// 38f: lload 1
// 390: lconst_0
// 391: lcmp
// 392: iflt 3d9
// 395: aload 0
// 396: lload 10
// 398: invokespecial su/catlean/_3.K (J)Lsu/catlean/xl;
// 39b: getstatic su/catlean/xl.Instant Lsu/catlean/xl;
// 39e: if_acmpne 3cf
// 3a1: goto 3ae
// 3a4: ldc2_w -7075540626075472702
// 3a7: lload 1
// 3a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ad: athrow
// 3ae: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 3b1: aload 80
// 3b3: iload 17
// 3b5: i2s
// 3b6: iload 18
// 3b8: iload 19
// 3ba: invokevirtual su/catlean/_8.o (Lsu/catlean/t5;SII)V
// 3bd: aload 78
// 3bf: ifnull 3e6
// 3c2: goto 3cf
// 3c5: ldc2_w -7075540626075472702
// 3c8: lload 1
// 3c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ce: athrow
// 3cf: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 3d2: lload 40
// 3d4: aload 80
// 3d6: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 3d9: goto 3e6
// 3dc: ldc2_w -7075540626075472702
// 3df: lload 1
// 3e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e5: athrow
// 3e6: iload 5
// 3e8: aload 78
// 3ea: lload 1
// 3eb: lconst_0
// 3ec: lcmp
// 3ed: ifle 446
// 3f0: ifnonnull 444
// 3f3: ifne 431
// 3f6: goto 403
// 3f9: ldc2_w -7075540626075472702
// 3fc: lload 1
// 3fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 402: athrow
// 403: aload 0
// 404: aload 78
// 406: lload 1
// 407: lconst_0
// 408: lcmp
// 409: iflt 596
// 40c: ifnonnull 594
// 40f: goto 41c
// 412: ldc2_w -7075540626075472702
// 415: lload 1
// 416: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41b: athrow
// 41c: lload 55
// 41e: invokevirtual su/catlean/_3.h (J)Z
// 421: ifne 593
// 424: goto 431
// 427: ldc2_w -7075540626075472702
// 42a: lload 1
// 42b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 430: athrow
// 431: aload 0
// 432: lload 55
// 434: invokevirtual su/catlean/_3.h (J)Z
// 437: goto 444
// 43a: ldc2_w -7075540626075472702
// 43d: lload 1
// 43e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 443: athrow
// 444: aload 78
// 446: ifnonnull 50c
// 449: ifeq 4e3
// 44c: goto 459
// 44f: ldc2_w -7075540626075472702
// 452: lload 1
// 453: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 458: athrow
// 459: aload 0
// 45a: iload 14
// 45c: iload 15
// 45e: i2c
// 45f: iload 16
// 461: i2c
// 462: invokevirtual su/catlean/_3.E (ICC)Z
// 465: lload 1
// 466: lconst_0
// 467: lcmp
// 468: ifle 50c
// 46b: aload 78
// 46d: ifnonnull 50c
// 470: goto 47d
// 473: ldc2_w -7075540626075472702
// 476: lload 1
// 477: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47c: athrow
// 47d: ifeq 4e3
// 480: goto 48d
// 483: ldc2_w -7075540626075472702
// 486: lload 1
// 487: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48c: athrow
// 48d: aload 0
// 48e: lload 10
// 490: lload 1
// 491: lconst_0
// 492: lcmp
// 493: ifle 509
// 496: invokespecial su/catlean/_3.K (J)Lsu/catlean/xl;
// 499: aload 78
// 49b: ifnonnull 505
// 49e: goto 4ab
// 4a1: ldc2_w -7075540626075472702
// 4a4: lload 1
// 4a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4aa: athrow
// 4ab: getstatic su/catlean/xl.Instant Lsu/catlean/xl;
// 4ae: if_acmpne 4e3
// 4b1: goto 4be
// 4b4: ldc2_w -7075540626075472702
// 4b7: lload 1
// 4b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bd: athrow
// 4be: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 4c1: aload 81
// 4c3: invokevirtual su/catlean/t5.O ()Lsu/catlean/_w;
// 4c6: invokevirtual su/catlean/_w.q ()F
// 4c9: aload 81
// 4cb: invokevirtual su/catlean/t5.O ()Lsu/catlean/_w;
// 4ce: invokevirtual su/catlean/_w.N ()F
// 4d1: lload 72
// 4d3: invokevirtual su/catlean/_8.r (FFJ)V
// 4d6: goto 4e3
// 4d9: ldc2_w -7075540626075472702
// 4dc: lload 1
// 4dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e2: athrow
// 4e3: aload 80
// 4e5: lload 1
// 4e6: lconst_0
// 4e7: lcmp
// 4e8: iflt 4f8
// 4eb: aload 78
// 4ed: ifnonnull 583
// 4f0: invokevirtual su/catlean/t5.A ()Lkotlin/jvm/functions/Function0;
// 4f3: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 4f8: goto 505
// 4fb: ldc2_w -7075540626075472702
// 4fe: lload 1
// 4ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 504: athrow
// 505: pop
// 506: aload 0
// 507: lload 55
// 509: invokevirtual su/catlean/_3.h (J)Z
// 50c: ifeq 581
// 50f: aload 0
// 510: lload 1
// 511: lconst_0
// 512: lcmp
// 513: iflt 551
// 516: aload 78
// 518: ifnonnull 551
// 51b: goto 528
// 51e: ldc2_w -7075540626075472702
// 521: lload 1
// 522: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 527: athrow
// 528: iload 14
// 52a: iload 15
// 52c: i2c
// 52d: iload 16
// 52f: i2c
// 530: invokevirtual su/catlean/_3.E (ICC)Z
// 533: ifeq 581
// 536: goto 543
// 539: ldc2_w -7075540626075472702
// 53c: lload 1
// 53d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 542: athrow
// 543: aload 0
// 544: goto 551
// 547: ldc2_w -7075540626075472702
// 54a: lload 1
// 54b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 550: athrow
// 551: lload 10
// 553: invokespecial su/catlean/_3.K (J)Lsu/catlean/xl;
// 556: getstatic su/catlean/xl.Instant Lsu/catlean/xl;
// 559: if_acmpne 581
// 55c: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 55f: lload 20
// 561: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 564: invokevirtual net/minecraft/class_746.method_36454 ()F
// 567: lload 20
// 569: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 56c: invokevirtual net/minecraft/class_746.method_36455 ()F
// 56f: lload 72
// 571: invokevirtual su/catlean/_8.r (FFJ)V
// 574: goto 581
// 577: ldc2_w -7075540626075472702
// 57a: lload 1
// 57b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 580: athrow
// 581: aload 80
// 583: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/_3.q ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 588: iload 69
// 58a: i2s
// 58b: iload 70
// 58d: i2s
// 58e: iload 71
// 590: invokevirtual su/catlean/t5.c (Lkotlin/jvm/functions/Function0;SSI)V
// 593: aload 0
// 594: aload 78
// 596: ifnonnull 68a
// 599: iload 66
// 59b: i2s
// 59c: iload 67
// 59e: iload 68
// 5a0: i2c
// 5a1: invokevirtual su/catlean/_3.D (SIC)Lsu/catlean/lr;
// 5a4: getstatic su/catlean/lr.NONE Lsu/catlean/lr;
// 5a7: if_acmpeq 680
// 5aa: goto 5b7
// 5ad: ldc2_w -7075540626075472702
// 5b0: lload 1
// 5b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b6: athrow
// 5b7: getstatic su/catlean/nz.B Lsu/catlean/nz;
// 5ba: aload 3
// 5bb: aload 0
// 5bc: aload 78
// 5be: ifnonnull 606
// 5c1: goto 5ce
// 5c4: ldc2_w -7075540626075472702
// 5c7: lload 1
// 5c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5cd: athrow
// 5ce: lload 64
// 5d0: invokevirtual su/catlean/_3.n (J)Z
// 5d3: ifeq 605
// 5d6: goto 5e3
// 5d9: ldc2_w -7075540626075472702
// 5dc: lload 1
// 5dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e2: athrow
// 5e3: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 5e6: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 5e9: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 5ec: iload 52
// 5ee: i2c
// 5ef: iload 53
// 5f1: fconst_1
// 5f2: iload 54
// 5f4: i2s
// 5f5: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 5f8: goto 60b
// 5fb: ldc2_w -7075540626075472702
// 5fe: lload 1
// 5ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 604: athrow
// 605: aload 0
// 606: lload 36
// 608: invokevirtual su/catlean/_3.A (J)Ljava/awt/Color;
// 60b: aload 0
// 60c: aload 78
// 60e: ifnonnull 649
// 611: lload 64
// 613: invokevirtual su/catlean/_3.n (J)Z
// 616: ifeq 648
// 619: goto 626
// 61c: ldc2_w -7075540626075472702
// 61f: lload 1
// 620: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 625: athrow
// 626: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 629: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 62c: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 62f: iload 52
// 631: i2c
// 632: iload 53
// 634: fconst_1
// 635: iload 54
// 637: i2s
// 638: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 63b: goto 64e
// 63e: ldc2_w -7075540626075472702
// 641: lload 1
// 642: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 647: athrow
// 648: aload 0
// 649: lload 44
// 64b: invokevirtual su/catlean/_3.P (J)Ljava/awt/Color;
// 64e: aload 0
// 64f: iload 27
// 651: iload 28
// 653: iload 29
// 655: i2b
// 656: invokevirtual su/catlean/_3.H (IIB)Lsu/catlean/og;
// 659: aload 0
// 65a: iload 66
// 65c: i2s
// 65d: iload 67
// 65f: iload 68
// 661: i2c
// 662: invokevirtual su/catlean/_3.D (SIC)Lsu/catlean/lr;
// 665: astore 74
// 667: astore 75
// 669: astore 76
// 66b: astore 77
// 66d: iload 46
// 66f: i2c
// 670: iload 47
// 672: i2s
// 673: aload 77
// 675: aload 76
// 677: aload 75
// 679: aload 74
// 67b: iload 48
// 67d: invokevirtual su/catlean/nz.p (Lnet/minecraft/class_2338;CSLjava/awt/Color;Ljava/awt/Color;Lsu/catlean/og;Lsu/catlean/lr;I)V
// 680: getstatic su/catlean/eg.e Lsu/catlean/eg;
// 683: invokevirtual su/catlean/eg.Y ()Lsu/catlean/bg;
// 686: invokevirtual su/catlean/bg.l ()V
// 689: aload 0
// 68a: getfield su/catlean/_3.A Lsu/catlean/bg;
// 68d: invokevirtual su/catlean/bg.l ()V
// 690: bipush 1
// 691: ireturn
// 692: bipush 0
// 693: ireturn
}

static boolean v(long var0, _3 var2, class_2338 var3, List var4, boolean var5, boolean var6, boolean var7, int var8, Object var9) {
var0 = ab ^ var0;
long var10 = var0 ^ 85941835673356L;
String var12 = vm.a<"Å">(717630557503706603L, var0);

try {
if (var9 != null) {
throw new UnsupportedOperationException(b<"y">(23462, 6272147884778557841L ^ var0));
}
} catch (UnsupportedOperationException var13) {
throw vm.a<"Å">(var13, 623398484501641642L, var0);
}

try {
int var10000 = var8 & e<"c">(20575, 2293911886735804685L ^ var0);
if (var12 != null) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var2.d(var10, var3, var4, var5, var6, var7);
}
} catch (UnsupportedOperationException var14) {
throw vm.a<"Å">(var14, 623398484501641642L, var0);
}

var7 = false;
return var2.d(var10, var3, var4, var5, var6, var7);
}

protected boolean m(@NotNull class_1297 crystal, long a) {
long var4 = ax ^ 79616959566951L;
String var10000 = vm.a<"Å">(3173053555865120790L, ax);
Intrinsics.checkNotNullParameter(crystal, b<"y">(28384, 7546024537418039659L ^ ax));
String var6 = var10000;

try {
boolean var8 = this.M(var4);
if (var6 != null) {
return var8;
}

if (!var8) {
return true;
}
} catch (UnsupportedOperationException var7) {
throw vm.a<"Å">(var7, 3268412436203740247L, ax);
}

return false;
}

private final class_1297 x(long var1, class_2338 var3) {
var1 = ab ^ var1;
long var4 = var1 ^ 26932104152040L;
String var10000 = vm.a<"Å">(-5797876486249974889L, var1);
List var10001 = zf.z(var4).method_18467(class_1297.class, new class_238(var3));
Intrinsics.checkNotNullExpressionValue(var10001, b<"y">(29150, 622943989303549343L ^ var1));
Iterable var7 = var10001;
String var6 = var10000;
boolean var8 = false;

label27:
for (Object var14 : var7) {
label25:
while (true) {
Object var10 = var14;
var14 = var10;

do {
class_1297 var11 = (class_1297)var14;
boolean var12 = false;
if (!(var11 instanceof class_1511)) {
continue label27;
}

var14 = var10;
if (var1 <= 0L) {
continue label25;
}
} while (var6 != null);

return (class_1297)var10;
}
}

return (class_1297)null;
}

protected final boolean m(long a, @NotNull class_2338 bp) {
ax = ab ^ ax;
long var4 = ax ^ 62813429259920L;
long var6 = ax ^ 96786957890921L;
String var10000 = vm.a<"Å">(-5552393723195035921L, ax);
Intrinsics.checkNotNullParameter(bp, b<"y">(17158, 7548443677625823866L ^ ax));
String var8 = var10000;

Class<class_1309> var10001;
class_238 var10002;
label34: {
try {
var12 = zf.z(var4);
var10001 = class_1309.class;
if (e4.j.f(var6)) {
var10002 = new class_238(bp).method_1009(-1.0E-12, 0.0, -1.0E-12);
break label34;
}
} catch (UnsupportedOperationException var10) {
throw vm.a<"Å">(var10, -5502651087911648594L, ax);
}

var10002 = new class_238(bp);
}

try {
List var13 = var12.method_18467(var10001, var10002);
Intrinsics.checkNotNullExpressionValue(var13, b<"y">(6463, 5529297371398170733L ^ ax));
boolean var14 = var13.isEmpty();
if (var8 != null) {
return var14;
}

if (!var14) {
return true;
}
} catch (UnsupportedOperationException var9) {
throw vm.a<"Å">(var9, -5502651087911648594L, ax);
}

return false;
}

@NotNull
protected List R(long var1) {
class_2248[] var3 = new class_2248[]{class_2246.field_10540, class_2246.field_10443, class_2246.field_22108, class_2246.field_23152};
return CollectionsKt.listOf(var3);
}

@NotNull
protected List g(long var1) {
return CollectionsKt.emptyList();
}

@NotNull
protected y4 s() {
return y4.ONLY_CRYSTALS;
}

protected boolean M(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_3.ab J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 124615508218973
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 101206355698114
// 011: lxor
// 012: dup2
// 013: bipush 32
// 015: lushr
// 016: l2i
// 017: istore 5
// 019: dup2
// 01a: bipush 32
// 01c: lshl
// 01d: bipush 32
// 01f: lushr
// 020: lstore 6
// 022: pop2
// 023: dup2
// 024: ldc2_w 98288251072448
// 027: lxor
// 028: lstore 8
// 02a: dup2
// 02b: ldc2_w 95673168440213
// 02e: lxor
// 02f: lstore 10
// 031: dup2
// 032: ldc2_w 5067284136817
// 035: lxor
// 036: lstore 12
// 038: dup2
// 039: ldc2_w 38103667869075
// 03c: lxor
// 03d: lstore 14
// 03f: dup2
// 040: ldc2_w 72115212947661
// 043: lxor
// 044: lstore 16
// 046: pop2
// 047: ldc2_w 4759062301358759445
// 04a: lload 1
// 04b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: astore 18
// 052: iload 5
// 054: lload 6
// 056: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 059: invokevirtual net/minecraft/class_636.method_2923 ()Z
// 05c: aload 18
// 05e: ifnonnull 0b2
// 061: ifeq 0aa
// 064: goto 071
// 067: ldc2_w 4852871986465272404
// 06a: lload 1
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aload 0
// 072: lload 3
// 073: invokevirtual su/catlean/_3.x (J)Z
// 076: aload 18
// 078: lload 1
// 079: lconst_0
// 07a: lcmp
// 07b: ifle 0b4
// 07e: ifnonnull 0b2
// 081: goto 08e
// 084: ldc2_w 4852871986465272404
// 087: lload 1
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: ifeq 0aa
// 091: goto 09e
// 094: ldc2_w 4852871986465272404
// 097: lload 1
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: bipush 1
// 09f: ireturn
// 0a0: ldc2_w 4852871986465272404
// 0a3: lload 1
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: getstatic su/catlean/us.z Lsu/catlean/us;
// 0ad: lload 14
// 0af: invokevirtual su/catlean/us.f (J)Z
// 0b2: aload 18
// 0b4: ifnonnull 109
// 0b7: ifeq 101
// 0ba: goto 0c7
// 0bd: ldc2_w 4852871986465272404
// 0c0: lload 1
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: aload 0
// 0c8: lload 10
// 0ca: invokevirtual su/catlean/_3.G (J)Z
// 0cd: aload 18
// 0cf: lload 1
// 0d0: lconst_0
// 0d1: lcmp
// 0d2: iflt 10b
// 0d5: ifnonnull 109
// 0d8: goto 0e5
// 0db: ldc2_w 4852871986465272404
// 0de: lload 1
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: ifeq 101
// 0e8: goto 0f5
// 0eb: ldc2_w 4852871986465272404
// 0ee: lload 1
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: bipush 1
// 0f6: ireturn
// 0f7: ldc2_w 4852871986465272404
// 0fa: lload 1
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: lload 16
// 103: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 106: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 109: aload 18
// 10b: ifnonnull 161
// 10e: ifeq 158
// 111: goto 11e
// 114: ldc2_w 4852871986465272404
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: aload 0
// 11f: lload 12
// 121: invokevirtual su/catlean/_3.W (J)Z
// 124: aload 18
// 126: lload 1
// 127: lconst_0
// 128: lcmp
// 129: iflt 163
// 12c: ifnonnull 161
// 12f: goto 13c
// 132: ldc2_w 4852871986465272404
// 135: lload 1
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: ifeq 158
// 13f: goto 14c
// 142: ldc2_w 4852871986465272404
// 145: lload 1
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: bipush 1
// 14d: ireturn
// 14e: ldc2_w 4852871986465272404
// 151: lload 1
// 152: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: athrow
// 158: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 15b: invokevirtual su/catlean/ex.P ()Ljava/util/concurrent/atomic/AtomicBoolean;
// 15e: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
// 161: aload 18
// 163: lload 1
// 164: lconst_0
// 165: lcmp
// 166: iflt 190
// 169: ifnonnull 18e
// 16c: ifeq 188
// 16f: goto 17c
// 172: ldc2_w 4852871986465272404
// 175: lload 1
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: bipush 1
// 17d: ireturn
// 17e: ldc2_w 4852871986465272404
// 181: lload 1
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 18b: invokevirtual su/catlean/dm.I ()Z
// 18e: aload 18
// 190: ifnonnull 1d8
// 193: ifeq 1d7
// 196: goto 1a3
// 199: ldc2_w 4852871986465272404
// 19c: lload 1
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 0
// 1a4: lload 8
// 1a6: invokevirtual su/catlean/_3.B (J)Z
// 1a9: aload 18
// 1ab: ifnonnull 1d8
// 1ae: goto 1bb
// 1b1: ldc2_w 4852871986465272404
// 1b4: lload 1
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: ifeq 1d7
// 1be: goto 1cb
// 1c1: ldc2_w 4852871986465272404
// 1c4: lload 1
// 1c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ca: athrow
// 1cb: bipush 1
// 1cc: ireturn
// 1cd: ldc2_w 4852871986465272404
// 1d0: lload 1
// 1d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: athrow
// 1d7: bipush 0
// 1d8: ireturn
}

private static final boolean h(_3 var0) {
long var1 = ab ^ 129244065153879L;
long var3 = var1 ^ 97729172543839L;

try {
if (var0.K(var3) == xl.Instant) {
return true;
}
} catch (UnsupportedOperationException var5) {
throw vm.a<"Å">(var5, 8775821099269933253L, var1);
}

return false;
}

private static final boolean X(_3 var0) {
long var1 = ab ^ 58753786039479L;
long var3 = var1 ^ 26414258656959L;

try {
if (var0.K(var3) == xl.Instant) {
return true;
}
} catch (UnsupportedOperationException var5) {
throw vm.a<"Å">(var5, 8514541283530819365L, var1);
}

return false;
}

private static final boolean j(_3 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_3.ab J
// 03: ldc2_w 104536489088628
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 125872309177468
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 47936741014157
// 13: lxor
// 14: lstore 5
// 16: pop2
// 17: ldc2_w -1316853201869033049
// 1a: lload 1
// 1b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: astore 7
// 22: aload 0
// 23: aload 7
// 25: ifnonnull 4b
// 28: lload 5
// 2a: invokevirtual su/catlean/_3.h (J)Z
// 2d: ifeq 63
// 30: goto 3d
// 33: ldc2_w -1375057678815502874
// 36: lload 1
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: aload 0
// 3e: goto 4b
// 41: ldc2_w -1375057678815502874
// 44: lload 1
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: lload 3
// 4c: invokespecial su/catlean/_3.K (J)Lsu/catlean/xl;
// 4f: getstatic su/catlean/xl.Instant Lsu/catlean/xl;
// 52: if_acmpne 63
// 55: bipush 1
// 56: goto 64
// 59: ldc2_w -1375057678815502874
// 5c: lload 1
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: bipush 0
// 64: ireturn
}

private static final boolean u(_3 var0) {
return var0.z;
}

private static final boolean W(_3 var0) {
return var0.z;
}

private static final boolean k(_3 var0) {
long var1 = ab ^ 60630640267023L;
long var3 = var1 ^ 12111416427862L;
String var5 = vm.a<"Å">(3801865788223678684L, var1);

try {
boolean var10000 = var0.n(var3);
if (var5 != null) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (UnsupportedOperationException var6) {
throw vm.a<"Å">(var6, 3860069097199731869L, var1);
}

return false;
}

private static final boolean O(_3 var0) {
long var1 = ab ^ 67902295511414L;
long var3 = var1 ^ 2091638463279L;
String var5 = vm.a<"Å">(-6144042184275724635L, var1);

try {
boolean var10000 = var0.n(var3);
if (var5 != null) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (UnsupportedOperationException var6) {
throw vm.a<"Å">(var6, -6059397029812036892L, var1);
}

return false;
}

private static final boolean w(List param0, class_1799 param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_3.ab J
// 03: ldc2_w 71091033386037
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 1727279192061791206
// 0b: lload 2
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 1
// 12: sipush 17892
// 15: ldc2_w 4697932330959442339
// 18: lload 2
// 19: lxor
// 1a: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/_3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 22: astore 4
// 24: aload 1
// 25: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 28: instanceof net/minecraft/class_1747
// 2b: aload 4
// 2d: ifnonnull 57
// 30: ifeq 70
// 33: goto 40
// 36: ldc2_w 1633627889268271015
// 39: lload 2
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: aload 0
// 41: aload 1
// 42: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 45: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 4a: goto 57
// 4d: ldc2_w 1633627889268271015
// 50: lload 2
// 51: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56: athrow
// 57: aload 4
// 59: ifnonnull 6d
// 5c: ifne 70
// 5f: goto 6c
// 62: ldc2_w 1633627889268271015
// 65: lload 2
// 66: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/UnsupportedOperationException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6b: athrow
// 6c: bipush 1
// 6d: goto 71
// 70: bipush 0
// 71: ireturn
}

private static final Unit q() {
return Unit.INSTANCE;
}

static {
long var20 = ab ^ 107889819955667L;
vm.a<"Å">(null, 784870051371612062L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[80];
int var16 = 0;
String var15 = "'òv¾\u000b\u0097)mË¥p\\/x¸\u009a\u0010\u0002£\nõÛLÞ=\u001458\u0093z¹hí \u008cx~P\u0006£ó\u0004Ç¶¾auÉWÉ\r\u0091è!jÍ«\fkÒÄ7¢qVÞ\u0018\u0088]SS\u008a&\u008d\u0084YÃFb2Í\bÊ´\u001e|¿\"×%å\u0010l³\u008e åðÐw\\ìCf¢`;\\\u0010\u008eøq\u0093n¶K\u0011\u008aö\u001e Àé¥Ä@³\u0089u.Ô´\u009cÙJ¬\u008d\u0085ªö}ÐA¸{\u0011õ=»\u008a\u008b\u0086Xs±Ö\u009c¤ÃÂ\u0002\u00adö\u0099¹dqÀìWÕz\u008eC\t\u008c\u0014`\u008dXý\u008aSpé\u0089\u009a¡Eï \u007ffx-ÑGTLµ\u0082]ÓoWF`÷¼ÚúhãTå\u001eÕÈÏÅ\u0001ÊÍ(Áü\u0011\f¥\u000fÇ±bÖ½\u008d\u0088\u0085D,)¤$k;LÛ\u0010éj\u000fë®\fk\u0019f.\u00ad¬¬Ld\u0012(ö\u0084¨5|Ôó¤\u0014ô~¯<v6·\u0014\u0001\u008c\u0090Ô\u0088úNâöåh¨ðôm\r5E=²Fg\u009d\u0010\u0007\u0013N\u008eá¶Wÿ¡\u0096<S´.\u001e\u00030½Ê\u0005ê\u0006\u001fóÔl\nª¯ö&Ù\u0082WÐ\u000fV¡¨[\u008cøêÁ)Ì\u00881\u008d±^r.3ßá²»\f=\u0011\u0081Ék\u0015\u0010\u009d¡}Kï³ÝdòÔð+'à|¤\u0088¬CÌ9©Ü{¯\u0091Ì[§\u0080#\u0003°Í\u0099¦kæt8¤z\u0006º7\u0010\u00adM\t\nÙ0qEÉ§\u008f[xñ\u00862YÈ \u0000Ï¶7Ò\u0016æ\u009fbZ\u0019é\u0083À\u0011\u0085'ô\"áq\u0018\u009bs¶MÇ\f\u0013\u0083}\u007fÇé\u001cv\u001b·È¬Ç\u008dÑl\u0080@\\\rî*x¬(SIêo\u0001×ö©m>°ÈNÃaû¡\u000fÎ\u001e\u00045½M¦\u0096aT§¸ÇÙ,0\u0004 2£¦ÛiXJiÛH\u0099JÂp1\u0086?\u0098\u009bå\u0012ã\u0003\u0081P©&®FÕuñ\u0018Ü2½ -·ì\r\u0093\\ç\u009e\u0086\u0095þºcTÃ?%O\u0017æ8=f1©\u0092\u0093(ÝÓªãæZ\u001cl´\u009d\u0090¸\u0098Út\u0018ë\u0096Â¶^\u009fÒ\\\n\f\u001fFR\u0082W5æê{\tsûxÞ\u001c\u009awÐ\u009f)\r6Ø({(9ufk\u0005S\u0085kQ\næ\u0000þ/ò\u0007\"¸\u008fø®\u008b|©\u0013bºSßfWï_âTð\u008f\u001a(DFÓs\u009d\u0081@q\u0088ÿéZ\u0094^,áá\"/\u0017q·r\u0000Du8\u0013ÐG{jÒüH};Ç\u0096É \u0007W\u0098|$Ãª¸¸0V\u0005ÅãT\u0016]\u0090Úm¦;/\u0097Ìéy\u0018¸Cpe ü\u0096d\u0016k\u001e\u008fò\u0099ÏaW\u008e\u001f\u0098k~ÐÆ\u0005¹c%Mq\u0005´æ\u0085\u009aFÊ \u00adâSnbZ\u000e\u0012\u008a/$eªFB¨\u00ad}¹\"Ö\n´Î°A¦î\b\u001eR»\u0010ÂHk\u0002Qj¢áRY°/ØöOë ]ÛB\u0098g¡ü\bZ\tß±\u0019Þ\u0007àõ\u009c}\u0083T\u009dN^ A\u0015\tú\u007f\r\u0084\u0018;/Ûf<\u008chm®ojAs9Â1(\u0092\bF,j ã\u0018ÎNVD}dR'\u0091Ñ\bBò\t-2G\u0081í ã¥Fª \u008e\u009aÆV`ðû>MømñÝ\u008bÜ\u0019jÂDR\u00030ª\u008c\nTAOï\b»n\u0010\u008eÕtâÆØ)D\u0005rÕ94I\u0094´ \u009fVð4\u0080·\u008bJá-\u0081æ\u0090ëÐæ,\u008f\u0005\u0096ü \u0087¼\u0012Ô|\u001c\u0083Á#Õ \u008fû\u008aD\u0012\u0087¹þ¿7\u0097¶ªûï¾¦U\u001fÍ\u0002#Ií¥ø«¦{\u0082Çâ8¿\u008d§Ñ\u000eì\u0014\u007f\u0006\u0089\u0097\u000bÐ\u000b,V\u0011\u0004D\tÌ$&\u0010xÍûâÆ\u008c]\u0081©j)RÍ\u001e£WÛfÝ«èu_\u0090\u001dx4M\u008f\u0013\u0002Û\u0010+4ÞâCPéö½\u008a'pµéFQ\u00103\u009b\u0098n\u0007\u0090¥;3z\u000f\u0090\u0085\r\u009fg8\n\u0017ÃðkìN\u008e\u0087R±|Ò\u0016W\u0091\u0089è\u008aU\u008a\n®S\u0002\u0089ä7CÓýZ¸>=\u0003úwTñ¥ÑÝk \u0092ù\t\u009d\u0001\u0089ljS³(\u0018;Ò(Q=9²·\u001cÇ¹ÿ\u008f\u0014£®C ÆW\u0012\u0007u±\u0010?kÊys*Ã\u0006\u0097à\u0099\u0000¦äËÍ(3CÁwKsøQ\u0085Ìy\tÕER¤ýDeà3}å\u0012\u0000¯\u008e\u0018dÖûé®\u0012EáS°ü¤\u0010kcÅ3\u0089\u0084u¾KBHÙÃu\u0087?\u0010HyS8!ï°É \u0094\u009b$2À\u001f>\u0010Ãx\b¶\u0015K\u0012\u0086Û÷ímÉ\u009c¬\u009e \u0085×\"h\u0019ò\u00014\u0003®D\u0084\u000e\u00adÄ.ÿöeVU\u008eYó`ß\u0014àu@)«8ê`¥¨Nhm\u007f\r±ñ»\u001d½:¾ÿ¦-¬d\u009b¡\u00adÛÖ\u008f\u0010l\u009eGí.\u0004ë½\u0087Í\u008a\b\u0010ÿW\u001c\u0085B\u0018>î\u0098~ê+\u0003I\u0000(TÕH:¦(2\u0013\u0094)>¯ùê»\u0089Õ4ß^Ë£y¿\u0003J×zgX7Tp¯Ú\u0002\u0094Æ¸ä Ö\u001c\tO\u000e±Ä\u000b4O\u0091\bÀ\u0093\"K7BÒÈQ!}üÄ\u0019B´~<Fö\u0010\u0087£\u0088Îú×wd0ÝÜâ\u0094ÏBV\u0010¶\u008f¡ç\u0001è\u0084'-ã8¢êýeY(üB!A|©äÊ\u008e+n\u009f\u0019»ñ¬ù0Ìpé\u0081R\u001fa3Ø³\u00ad±íí\u001b\u0094®{\u000ff¼³ 5Ã¦ø\u0019¹Ö\u00115Ï\u0014pú\u0010¡%}G\u008a\u0004\u0097\u0090\u0094\u008b\u0092Ñ»WÑ{§Ú\u0018\u0018æ\u001dÑ3Ã\"¨)Éz\u000b\u0097J\u0085Þ\u007fv¸Ë;ºß\u0012\u0018\u0088ùËn5;¶\u0088\u00009\u001eÃ$ãÛ\u0089ù\u0089m\u009d\u0086n\u0083×\u0010\rÓkITÑjþ\u0097ÿú\u008aRóXôH!yôe{>Ý\u009c\f\"NíU\u0010 :ñ\u0088'\u001b\u009a\n\u0082;3FOÊÈU.3\u0006Ë\r\u0012Ë\u0018Iqkn-)\u0000.\u0083Uå*&R\baî\u008b}x²B¦\r\u0001æld¥\u00804 \u000e3\u0090TNâ_'\u0004Ô\u00863ÛP¨õÊ\u0080ùª\u0085P*í=I\u009c_¾`³Úc\u0011ýéÔ\u0007Õ\u0084Äð3²i:\r\u008aí®£<\u0081û¡@ÄÍ\u001aE\u009eïÍ\u008bB)½\u0082\u00914(ð;MgMZÐ\u00195j\u0097\u0084Ý7è}\u0016\r6@ºXÙEÅdÖç\u0081À\u001a½,5\u0018NRy{`_ÐTî\u00877\u000fÊuz¤fÀ\u0017¬&¥\t\u00ad\u0098±c¡\u001d2\u0095\u000eÝµ\u0089¬ó´\u0000\u0093\u0089\u0010·M[\u001d{ECùI¨çà.Âoê\u0010{\u008a\u0086óhÃ/xZ\n\u0015LEû\u009a# \u001c\u008dç\u00815\u001f'~µ]\u000fØ\u0090Qá(MôÞÈ \u0092£¯Qt¾£Ñ½km\u0018j\u008beÇÜðkcÛl\u0003¬ÇMV\u0097÷\u007f\u0085FD\u0017\u0093\u00ad ÔÇ\u0007\u0007ÌRd\u0085æ g¯\u0007¢lg\u0087²9.ª·\u00adN\u000fkOÿ'\u0014ôõ :9\u0094*Hòl\u000b\u008dæmÃ#\u0085bÍ@ªW ä\u001ateO*Ø9\u0005\u008bßè\u0018[#\u009b9\u001c\u001dwïâ`\u008f\u001b]\rÛéLI6A\\~\u0080É ×\bðùJÉ6î\u0085j`\u0087\u0019\u0004×>¢Ù\u008aU\u007fp\u009a¸ÌbúI1KÚ\u0086\u0018ßwäÖ¬\u001cKrÙîàw'$p\u0013\u009f*ùMá\u0016;Û \u0092v\u009d\u0088päB0\u0090ö0JB\nÊu\u0087ýÑÃg³\u0084«cHÙaà\u009b]\u008e8-\u0011S\u009a\u0082<áqu\u0002±ãY\u0012;#ªÇ\u0090¡%Á\u0097cp+.pC\u0085%%\u0082ë¾5Ä+»j,\u009c$B\u008eº<\u007f@Ý.ú\u0091¦î¢\u00106»ùAM\u0016UéH¡åp´o\u001f½(>PÍ.¶äö/§\u0019âGÆâ\u0087§¦wÁú\u009bþ\u0019?ï¨\u0084À\u0018\u0004O\u0081ï±~ì\u009aÅ\u0011J P\u0096ëîUÊ9ExnúRºþ¦=>6Tª\u0003jD\u008c<ÉÁ XÇÀ»\u0010ÅýúêË^Î\u000b\u0083ßºÓEa?O ²§\teò¤ùL\u0082\u0091/Ü&\u009eVÂ\u0012êo·\u009cU9^¨¯4F\u0081ö\u001dë \u0097` \"WË\u0003:XÅ~#Ö\u009f\u009dò\u0011Îñ[\u008c\u009f\u0094°\u0005SZêvû(²\u0010f\r@\b#Ê©\u008ejt\u009eMÈè!O\u0010\tõ\u0014?0|ï\u0010°}\u0003¢\u0081_\u00050 \u0084á?@\u0098¹\"ml\u0099,qá¾\u009a\u001d5ýiX|\u0081\u0019\u008du\u0090\u009e\u0093OPâ! ¢kÆ\u0083O4ô7\u0012ÇþI2\rY\u0098ó\u0015\u0097,\u0013ÙüÌºÚù/\u00056\u0019\u00070¯`\u0014_Ö~9ûIãe»1ÃHô¦4órøÁî\u0098\u0012\u0096\u009e;yÙ¢\u009da\u009b\u001d\u0093\u0099·\u0005r!Í\u001b\u001ay2¾\u008c\u0088\u0088ñ°\bè\u0085\u001c[\u0095a{nÜ³ñ(\u0082\u001cL¹@·\u008dÊü×{z\u001aÅ(þÅ\u00127â¦Þ\u0092\u0013\u00999I-uýS0·)\u0091¿6Ä\u0017\u0088æ(\u00adr§Jù\"e¶YÃ.\\Å\u0091\u0016x¦\u008e\u0091o\tñ\u0081¸í±©\u0084ð\u0010!\u0099²Z\u000f¼\u0095H?UVx¹ÍNîÏ;n¬\u0085p\u001bYñ\u0010\u0091âÔË\u0083ôÑ\u0080\u0088¹¢b°ÐÂE¦Xª/B\u0094\u0010n_ÕÛ³a¾Qs\u009d\u001aLa/ 2\u0010Í \u00193\u0088\u000f3\u0016<IrÆ\u0099\u0082\u0002Ö";
int var17 = "'òv¾\u000b\u0097)mË¥p\\/x¸\u009a\u0010\u0002£\nõÛLÞ=\u001458\u0093z¹hí \u008cx~P\u0006£ó\u0004Ç¶¾auÉWÉ\r\u0091è!jÍ«\fkÒÄ7¢qVÞ\u0018\u0088]SS\u008a&\u008d\u0084YÃFb2Í\bÊ´\u001e|¿\"×%å\u0010l³\u008e åðÐw\\ìCf¢`;\\\u0010\u008eøq\u0093n¶K\u0011\u008aö\u001e Àé¥Ä@³\u0089u.Ô´\u009cÙJ¬\u008d\u0085ªö}ÐA¸{\u0011õ=»\u008a\u008b\u0086Xs±Ö\u009c¤ÃÂ\u0002\u00adö\u0099¹dqÀìWÕz\u008eC\t\u008c\u0014`\u008dXý\u008aSpé\u0089\u009a¡Eï \u007ffx-ÑGTLµ\u0082]ÓoWF`÷¼ÚúhãTå\u001eÕÈÏÅ\u0001ÊÍ(Áü\u0011\f¥\u000fÇ±bÖ½\u008d\u0088\u0085D,)¤$k;LÛ\u0010éj\u000fë®\fk\u0019f.\u00ad¬¬Ld\u0012(ö\u0084¨5|Ôó¤\u0014ô~¯<v6·\u0014\u0001\u008c\u0090Ô\u0088úNâöåh¨ðôm\r5E=²Fg\u009d\u0010\u0007\u0013N\u008eá¶Wÿ¡\u0096<S´.\u001e\u00030½Ê\u0005ê\u0006\u001fóÔl\nª¯ö&Ù\u0082WÐ\u000fV¡¨[\u008cøêÁ)Ì\u00881\u008d±^r.3ßá²»\f=\u0011\u0081Ék\u0015\u0010\u009d¡}Kï³ÝdòÔð+'à|¤\u0088¬CÌ9©Ü{¯\u0091Ì[§\u0080#\u0003°Í\u0099¦kæt8¤z\u0006º7\u0010\u00adM\t\nÙ0qEÉ§\u008f[xñ\u00862YÈ \u0000Ï¶7Ò\u0016æ\u009fbZ\u0019é\u0083À\u0011\u0085'ô\"áq\u0018\u009bs¶MÇ\f\u0013\u0083}\u007fÇé\u001cv\u001b·È¬Ç\u008dÑl\u0080@\\\rî*x¬(SIêo\u0001×ö©m>°ÈNÃaû¡\u000fÎ\u001e\u00045½M¦\u0096aT§¸ÇÙ,0\u0004 2£¦ÛiXJiÛH\u0099JÂp1\u0086?\u0098\u009bå\u0012ã\u0003\u0081P©&®FÕuñ\u0018Ü2½ -·ì\r\u0093\\ç\u009e\u0086\u0095þºcTÃ?%O\u0017æ8=f1©\u0092\u0093(ÝÓªãæZ\u001cl´\u009d\u0090¸\u0098Út\u0018ë\u0096Â¶^\u009fÒ\\\n\f\u001fFR\u0082W5æê{\tsûxÞ\u001c\u009awÐ\u009f)\r6Ø({(9ufk\u0005S\u0085kQ\næ\u0000þ/ò\u0007\"¸\u008fø®\u008b|©\u0013bºSßfWï_âTð\u008f\u001a(DFÓs\u009d\u0081@q\u0088ÿéZ\u0094^,áá\"/\u0017q·r\u0000Du8\u0013ÐG{jÒüH};Ç\u0096É \u0007W\u0098|$Ãª¸¸0V\u0005ÅãT\u0016]\u0090Úm¦;/\u0097Ìéy\u0018¸Cpe ü\u0096d\u0016k\u001e\u008fò\u0099ÏaW\u008e\u001f\u0098k~ÐÆ\u0005¹c%Mq\u0005´æ\u0085\u009aFÊ \u00adâSnbZ\u000e\u0012\u008a/$eªFB¨\u00ad}¹\"Ö\n´Î°A¦î\b\u001eR»\u0010ÂHk\u0002Qj¢áRY°/ØöOë ]ÛB\u0098g¡ü\bZ\tß±\u0019Þ\u0007àõ\u009c}\u0083T\u009dN^ A\u0015\tú\u007f\r\u0084\u0018;/Ûf<\u008chm®ojAs9Â1(\u0092\bF,j ã\u0018ÎNVD}dR'\u0091Ñ\bBò\t-2G\u0081í ã¥Fª \u008e\u009aÆV`ðû>MømñÝ\u008bÜ\u0019jÂDR\u00030ª\u008c\nTAOï\b»n\u0010\u008eÕtâÆØ)D\u0005rÕ94I\u0094´ \u009fVð4\u0080·\u008bJá-\u0081æ\u0090ëÐæ,\u008f\u0005\u0096ü \u0087¼\u0012Ô|\u001c\u0083Á#Õ \u008fû\u008aD\u0012\u0087¹þ¿7\u0097¶ªûï¾¦U\u001fÍ\u0002#Ií¥ø«¦{\u0082Çâ8¿\u008d§Ñ\u000eì\u0014\u007f\u0006\u0089\u0097\u000bÐ\u000b,V\u0011\u0004D\tÌ$&\u0010xÍûâÆ\u008c]\u0081©j)RÍ\u001e£WÛfÝ«èu_\u0090\u001dx4M\u008f\u0013\u0002Û\u0010+4ÞâCPéö½\u008a'pµéFQ\u00103\u009b\u0098n\u0007\u0090¥;3z\u000f\u0090\u0085\r\u009fg8\n\u0017ÃðkìN\u008e\u0087R±|Ò\u0016W\u0091\u0089è\u008aU\u008a\n®S\u0002\u0089ä7CÓýZ¸>=\u0003úwTñ¥ÑÝk \u0092ù\t\u009d\u0001\u0089ljS³(\u0018;Ò(Q=9²·\u001cÇ¹ÿ\u008f\u0014£®C ÆW\u0012\u0007u±\u0010?kÊys*Ã\u0006\u0097à\u0099\u0000¦äËÍ(3CÁwKsøQ\u0085Ìy\tÕER¤ýDeà3}å\u0012\u0000¯\u008e\u0018dÖûé®\u0012EáS°ü¤\u0010kcÅ3\u0089\u0084u¾KBHÙÃu\u0087?\u0010HyS8!ï°É \u0094\u009b$2À\u001f>\u0010Ãx\b¶\u0015K\u0012\u0086Û÷ímÉ\u009c¬\u009e \u0085×\"h\u0019ò\u00014\u0003®D\u0084\u000e\u00adÄ.ÿöeVU\u008eYó`ß\u0014àu@)«8ê`¥¨Nhm\u007f\r±ñ»\u001d½:¾ÿ¦-¬d\u009b¡\u00adÛÖ\u008f\u0010l\u009eGí.\u0004ë½\u0087Í\u008a\b\u0010ÿW\u001c\u0085B\u0018>î\u0098~ê+\u0003I\u0000(TÕH:¦(2\u0013\u0094)>¯ùê»\u0089Õ4ß^Ë£y¿\u0003J×zgX7Tp¯Ú\u0002\u0094Æ¸ä Ö\u001c\tO\u000e±Ä\u000b4O\u0091\bÀ\u0093\"K7BÒÈQ!}üÄ\u0019B´~<Fö\u0010\u0087£\u0088Îú×wd0ÝÜâ\u0094ÏBV\u0010¶\u008f¡ç\u0001è\u0084'-ã8¢êýeY(üB!A|©äÊ\u008e+n\u009f\u0019»ñ¬ù0Ìpé\u0081R\u001fa3Ø³\u00ad±íí\u001b\u0094®{\u000ff¼³ 5Ã¦ø\u0019¹Ö\u00115Ï\u0014pú\u0010¡%}G\u008a\u0004\u0097\u0090\u0094\u008b\u0092Ñ»WÑ{§Ú\u0018\u0018æ\u001dÑ3Ã\"¨)Éz\u000b\u0097J\u0085Þ\u007fv¸Ë;ºß\u0012\u0018\u0088ùËn5;¶\u0088\u00009\u001eÃ$ãÛ\u0089ù\u0089m\u009d\u0086n\u0083×\u0010\rÓkITÑjþ\u0097ÿú\u008aRóXôH!yôe{>Ý\u009c\f\"NíU\u0010 :ñ\u0088'\u001b\u009a\n\u0082;3FOÊÈU.3\u0006Ë\r\u0012Ë\u0018Iqkn-)\u0000.\u0083Uå*&R\baî\u008b}x²B¦\r\u0001æld¥\u00804 \u000e3\u0090TNâ_'\u0004Ô\u00863ÛP¨õÊ\u0080ùª\u0085P*í=I\u009c_¾`³Úc\u0011ýéÔ\u0007Õ\u0084Äð3²i:\r\u008aí®£<\u0081û¡@ÄÍ\u001aE\u009eïÍ\u008bB)½\u0082\u00914(ð;MgMZÐ\u00195j\u0097\u0084Ý7è}\u0016\r6@ºXÙEÅdÖç\u0081À\u001a½,5\u0018NRy{`_ÐTî\u00877\u000fÊuz¤fÀ\u0017¬&¥\t\u00ad\u0098±c¡\u001d2\u0095\u000eÝµ\u0089¬ó´\u0000\u0093\u0089\u0010·M[\u001d{ECùI¨çà.Âoê\u0010{\u008a\u0086óhÃ/xZ\n\u0015LEû\u009a# \u001c\u008dç\u00815\u001f'~µ]\u000fØ\u0090Qá(MôÞÈ \u0092£¯Qt¾£Ñ½km\u0018j\u008beÇÜðkcÛl\u0003¬ÇMV\u0097÷\u007f\u0085FD\u0017\u0093\u00ad ÔÇ\u0007\u0007ÌRd\u0085æ g¯\u0007¢lg\u0087²9.ª·\u00adN\u000fkOÿ'\u0014ôõ :9\u0094*Hòl\u000b\u008dæmÃ#\u0085bÍ@ªW ä\u001ateO*Ø9\u0005\u008bßè\u0018[#\u009b9\u001c\u001dwïâ`\u008f\u001b]\rÛéLI6A\\~\u0080É ×\bðùJÉ6î\u0085j`\u0087\u0019\u0004×>¢Ù\u008aU\u007fp\u009a¸ÌbúI1KÚ\u0086\u0018ßwäÖ¬\u001cKrÙîàw'$p\u0013\u009f*ùMá\u0016;Û \u0092v\u009d\u0088päB0\u0090ö0JB\nÊu\u0087ýÑÃg³\u0084«cHÙaà\u009b]\u008e8-\u0011S\u009a\u0082<áqu\u0002±ãY\u0012;#ªÇ\u0090¡%Á\u0097cp+.pC\u0085%%\u0082ë¾5Ä+»j,\u009c$B\u008eº<\u007f@Ý.ú\u0091¦î¢\u00106»ùAM\u0016UéH¡åp´o\u001f½(>PÍ.¶äö/§\u0019âGÆâ\u0087§¦wÁú\u009bþ\u0019?ï¨\u0084À\u0018\u0004O\u0081ï±~ì\u009aÅ\u0011J P\u0096ëîUÊ9ExnúRºþ¦=>6Tª\u0003jD\u008c<ÉÁ XÇÀ»\u0010ÅýúêË^Î\u000b\u0083ßºÓEa?O ²§\teò¤ùL\u0082\u0091/Ü&\u009eVÂ\u0012êo·\u009cU9^¨¯4F\u0081ö\u001dë \u0097` \"WË\u0003:XÅ~#Ö\u009f\u009dò\u0011Îñ[\u008c\u009f\u0094°\u0005SZêvû(²\u0010f\r@\b#Ê©\u008ejt\u009eMÈè!O\u0010\tõ\u0014?0|ï\u0010°}\u0003¢\u0081_\u00050 \u0084á?@\u0098¹\"ml\u0099,qá¾\u009a\u001d5ýiX|\u0081\u0019\u008du\u0090\u009e\u0093OPâ! ¢kÆ\u0083O4ô7\u0012ÇþI2\rY\u0098ó\u0015\u0097,\u0013ÙüÌºÚù/\u00056\u0019\u00070¯`\u0014_Ö~9ûIãe»1ÃHô¦4órøÁî\u0098\u0012\u0096\u009e;yÙ¢\u009da\u009b\u001d\u0093\u0099·\u0005r!Í\u001b\u001ay2¾\u008c\u0088\u0088ñ°\bè\u0085\u001c[\u0095a{nÜ³ñ(\u0082\u001cL¹@·\u008dÊü×{z\u001aÅ(þÅ\u00127â¦Þ\u0092\u0013\u00999I-uýS0·)\u0091¿6Ä\u0017\u0088æ(\u00adr§Jù\"e¶YÃ.\\Å\u0091\u0016x¦\u008e\u0091o\tñ\u0081¸í±©\u0084ð\u0010!\u0099²Z\u000f¼\u0095H?UVx¹ÍNîÏ;n¬\u0085p\u001bYñ\u0010\u0091âÔË\u0083ôÑ\u0080\u0088¹¢b°ÐÂE¦Xª/B\u0094\u0010n_ÕÛ³a¾Qs\u009d\u001aLa/ 2\u0010Í \u00193\u0088\u000f3\u0016<IrÆ\u0099\u0082\u0002Ö"
.length();
char var14 = 16;
int var25 = -1;

label54:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var37;
if ((var25 += var14) >= var17) {
fb = var18;
gb = new String[80];
nb = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[33];
int var3 = 0;
String var4 = "\rÓ§Ý!M}Á\u009bãDJ\u008f\u0012ú¤~\u0083\u0012Õõ£ßÑé HºåÕ\u0088s\u000f^\u007f\u0000¹à**Fy\u0089ô|½\u0019 ¾×Y©o\u0015¶'Ð%ýÖþºð\u008fÐ\u0096cìfr¹\r_r\u0092\u001a|+\u0005×TÒÃ\u0091(j\u001cªÇ+Ø¥X\u0095\u0016\u001051è¸W{eK\u0004\u009d\tù¸_áÈ+o\u007f\u009f-¥}A~¿éË\u00848dÓ\\úgd>Ç7 |tÎ\n,6±\u009cë\u009e5Øæ\u008c7¿<\u0019\u008a\u0010\u00034:F\u0013Jû©AÄ\u0082\"§\u0092ÉJ¦ì\u009f:Í:>+~Á\u008eI)4æv\u0002Êüe£\u009a[ÓÒ*nªxÓö,P6\u0000ý-Ìð®\u0098ñx$\u0088/ö¿Ð½µ»ü¯íYrèv/9?O§s\u008e½K\u0014'éî^P\u009c6";
int var5 = "\rÓ§Ý!M}Á\u009bãDJ\u008f\u0012ú¤~\u0083\u0012Õõ£ßÑé HºåÕ\u0088s\u000f^\u007f\u0000¹à**Fy\u0089ô|½\u0019 ¾×Y©o\u0015¶'Ð%ýÖþºð\u008fÐ\u0096cìfr¹\r_r\u0092\u001a|+\u0005×TÒÃ\u0091(j\u001cªÇ+Ø¥X\u0095\u0016\u001051è¸W{eK\u0004\u009d\tù¸_áÈ+o\u007f\u009f-¥}A~¿éË\u00848dÓ\\úgd>Ç7 |tÎ\n,6±\u009cë\u009e5Øæ\u008c7¿<\u0019\u008a\u0010\u00034:F\u0013Jû©AÄ\u0082\"§\u0092ÉJ¦ì\u009f:Í:>+~Á\u008eI)4æv\u0002Êüe£\u009a[ÓÒ*nªxÓö,P6\u0000ý-Ìð®\u0098ñx$\u0088/ö¿Ð½µ»ü¯íYrèv/9?O§s\u008e½K\u0014'éî^P\u009c6"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var29 = var6;
var10001 = var3++;
long var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var44 = -1;

while (true) {
long var8 = var41;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var46 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var44) {
case 0:
var29[var10001] = var46;
if (var2 >= var5) {
lb = var6;
mb = new Integer[33];
KProperty[] var22 = new KProperty[e<"c">(23973, 6756113314880947970L ^ var20)];
var22[0] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(23780, 5959496085819364712L ^ var20), b<"y">(7102, 2906511151494418944L ^ var20), 0)
);
var22[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(20591, 4270011049473776065L ^ var20), b<"y">(4887, 8329486912728816302L ^ var20), 0)
);
var22[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(13512, 3066790991382609240L ^ var20), b<"y">(13081, 512394730572675718L ^ var20), 0)
);
var22[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(25412, 7330170346817792738L ^ var20), b<"y">(8453, 4444737128261118096L ^ var20), 0)
);
var22[4] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(28397, 4272148227923453806L ^ var20), b<"y">(2592, 3679126637198754748L ^ var20), 0)
);
var22[5] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(24782, 2646446229902174529L ^ var20), b<"y">(3044, 9133856028515779133L ^ var20), 0)
);
var22[e<"c">(26364, 4556824153893878861L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(24999, 3656838410015484018L ^ var20), b<"y">(7056, 779884337161392678L ^ var20), 0)
);
var22[e<"c">(29869, 7789686074727443974L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(14576, 8921307806779568416L ^ var20), b<"y">(13748, 2546453933080050716L ^ var20), 0)
);
var22[e<"c">(31704, 6299935118032806240L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(24218, 3556108703469639502L ^ var20), b<"y">(16515, 3973660389774887175L ^ var20), 0)
);
var22[e<"c">(31523, 473757606280110484L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(28106, 1501857665406018628L ^ var20), b<"y">(16100, 9183513319409612603L ^ var20), 0)
);
var22[e<"c">(21236, 3690926919446661191L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_3.class, b<"y">(13568, 185273533996203180L ^ var20), b<"y">(11716, 316033961283740749L ^ var20), 0)
);
var22[e<"c">(193, 5642690996021910113L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_3.class, b<"y">(25032, 5315601425612711952L ^ var20), b<"y">(15677, 8194303660025640065L ^ var20), 0)
);
var22[e<"c">(7505, 7871507040092604394L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_3.class, b<"y">(7552, 4021521452821730341L ^ var20), b<"y">(4952, 654860045386013388L ^ var20), 0)
);
var22[e<"c">(32248, 5711661238132811598L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_3.class, b<"y">(31913, 5295431028162147601L ^ var20), b<"y">(13632, 8809913525380578520L ^ var20), 0)
);
var22[e<"c">(32696, 7099942340327515417L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_3.class, b<"y">(16528, 7435550200958224674L ^ var20), b<"y">(24117, 3895917306064115584L ^ var20), 0)
);
var22[e<"c">(20474, 3393232311875900767L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(17166, 4468142544706570901L ^ var20), b<"y">(31864, 2467881843547649445L ^ var20), 0)
);
var22[e<"c">(20575, 2293933424110209766L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_3.class, b<"y">(5934, 2295388501934825093L ^ var20), b<"y">(7310, 5096380514442335519L ^ var20), 0)
);
var22[e<"c">(22372, 4631641001054506432L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_3.class, b<"y">(15721, 7011984097927984363L ^ var20), b<"y">(22693, 4591205138175103267L ^ var20), 0)
);
var22[e<"c">(31454, 4567493942274498666L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_3.class, b<"y">(3565, 2996492452029645926L ^ var20), b<"y">(13847, 8295595623969849232L ^ var20), 0)
);
var22[e<"c">(13221, 6146595669833312522L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_3.class, b<"y">(32378, 2493226501514835923L ^ var20), b<"y">(23314, 9004712556336353974L ^ var20), 0)
);
D = var22;
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "Ùæ\u0014X\u0005qÚVG\u0015#õ¬^\u008dÇ";
var5 = "Ùæ\u0014X\u0005qÚVG\u0015#õ¬^\u008dÇ".length();
var2 = 0;
}

byte var35 = var2;
var2 += 8;
var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
var29 = var6;
var10001 = var3++;
var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var44 = 0;
}
}
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var37;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "×5¬\u0005P\u0099ûW\bq\u0095~\u0018×NjÊCy]9dõc\u0012\u000evÛ9\u0011)P¢\u0085¶È\u0015½\u009fÛSsªéf+\tÛ\u000b\u00adX!7¿Hj\u0010\u0019\u001eUÛ2_M\u0016m©ZÊ\u0013Ý#¯";
var17 = "×5¬\u0005P\u0099ûW\bq\u0095~\u0018×NjÊCy]9dõc\u0012\u000evÛ9\u0011)P¢\u0085¶È\u0015½\u009fÛSsªéf+\tÛ\u000b\u00adX!7¿Hj\u0010\u0019\u001eUÛ2_M\u0016m©ZÊ\u0013Ý#¯"
.length();
var14 = '8';
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

public static void D(int[] var0) {
u = var0;
}

public static int[] j() {
return u;
}

private static UnsupportedOperationException a(UnsupportedOperationException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16928;
if (gb[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])hb.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
hb.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_3", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = fb[var5].getBytes("ISO-8859-1");
gb[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return gb[var5];
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
throw new RuntimeException("su/catlean/_3" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int e(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 20743;
if (mb[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = lb[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])nb.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
nb.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_3", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
mb[var3] = var15;
}

return mb[var3];
}

private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = e(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite e(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/_3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
