package su.catlean;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

final class fw {
private float z;
private float K;
private float f;
private float a;
private float x;
private float b;
private float U;
private float v;
private float G;
private int I;
private float O;
private final float F;
private final int e;
private final int E;
private static final long c = yz.a(3219430370203488093L, -687638557866968794L, MethodHandles.lookup().lookupClass()).a(209337593382170L);
private static final long[] d;
private static final Integer[] g;
private static final Map h = new HashMap(13);

public fw(
float x,
float y,
long a,
float z,
float prevX,
float prevY,
float prevZ,
float motionX,
float motionY,
float motionZ,
int age,
float rotation,
float rotationSpeed,
int offset,
int maxAge
) {
ax = c ^ ax;
vm.a<"Å">(-4830229378078622355L, ax);
super();

try {
this.z = xx;
this.K = y;
this.f = zx;
this.a = prevX;
this.x = prevY;
this.b = prevZ;
this.U = motionX;
this.v = motionY;
this.G = motionZ;
this.I = age;
this.O = rotation;
this.F = rotationSpeed;
this.e = offset;
this.E = maxAge;
if (vm.a<"Å">(-4872979926855081266L, ax) != null) {
vm.a<"Å">(new _g[1], -4843556904864620608L, ax);
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -4844032065714604777L, ax);
}
}

public fw(
float var1,
float var2,
char var3,
float var4,
int var5,
char var6,
float var7,
float var8,
float var9,
float var10,
float var11,
float var12,
int var13,
float var14,
float var15,
int var16,
int var17,
int var18,
DefaultConstructorMarker var19
) {
long var20 = ((long)var3 << 48 | (long)var5 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ c;
long var22 = var20 ^ 60516841238957L;
long var24 = var20 ^ 35136678743447L;
long var26 = var20 ^ 31653195771796L;
_g[] var28 = vm.a<"Å">(-815468723834456780L, var20);
if ((var18 & a<"u">(9159, 8314624926737833424L ^ var20)) != 0) {
var7 = var1;
}

if ((var18 & a<"u">(23236, 852815380896408795L ^ var20)) != 0) {
var8 = var2;
}

if ((var18 & a<"u">(10561, 601451879787829084L ^ var20)) != 0) {
var9 = var4;
}

if ((var18 & a<"u">(24378, 6093111458420220196L ^ var20)) != 0) {
var10 = mf.p(RangesKt.rangeTo(-0.1F, 0.1F), var24, false, 2, null);
}

if ((var18 & a<"u">(2590, 1795938967382012932L ^ var20)) != 0) {
var11 = mf.p(RangesKt.rangeTo(0.01F, 0.03F), var24, false, 2, null);
}

if ((var18 & a<"u">(26030, 9222223256167668669L ^ var20)) != 0) {
var12 = mf.p(RangesKt.rangeTo(-0.1F, 0.1F), var24, false, 2, null);
}

if ((var18 & a<"u">(7561, 4744010326500025241L ^ var20)) != 0) {
var13 = 0;
}

if ((var18 & a<"u">(7468, 2167955794739471159L ^ var20)) != 0) {
var14 = mf.p(RangesKt.rangeTo(-15.0F, 15.0F), var24, false, 2, null);
}

if ((var18 & a<"u">(16055, 6700789498404077743L ^ var20)) != 0) {
var15 = mf.p(RangesKt.rangeTo(-0.5F, 0.5F), var24, false, 2, null);
}

if ((var18 & a<"u">(8446, 5188426965546933986L ^ var20)) != 0) {
var16 = mf.f(new IntRange(0, a<"u">(25347, 1666493172013915410L ^ var20)), false, var26, 2, null);
}

if ((var18 & a<"u">(19971, 8588414949719633941L ^ var20)) != 0) {
var17 = mf.f(new IntRange(a<"u">(3776, 221395491850727641L ^ var20), a<"u">(27607, 3751286000455931333L ^ var20)), false, var26, 2, null);
}

this(var1, var2, var22, var4, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
_g[] var10000 = var28;
if (var6 > 0) {
if (var28 != null) {
return;
}

var10000 = new _g[2];
}

vm.a<"Å">(var10000, -832928074887594419L, var20);
}

public final float q() {
return this.z;
}

public final void x(float <set-?>) {
this.z = <set-?>;
}

public final float S() {
return this.K;
}

public final void h(float <set-?>) {
this.K = <set-?>;
}

public final float Y() {
return this.f;
}

public final void a(float <set-?>) {
this.f = <set-?>;
}

public final float s() {
return this.a;
}

public final void j(float <set-?>) {
this.a = <set-?>;
}

public final float a() {
return this.x;
}

public final void e(float <set-?>) {
this.x = <set-?>;
}

public final float V() {
return this.b;
}

public final void W(float <set-?>) {
this.b = <set-?>;
}

public final float C() {
return this.U;
}

public final void J(float <set-?>) {
this.U = <set-?>;
}

public final float H() {
return this.v;
}

public final void N(float <set-?>) {
this.v = <set-?>;
}

public final float R() {
return this.G;
}

public final void n(float <set-?>) {
this.G = <set-?>;
}

public final int N() {
return this.I;
}

public final void e(int <set-?>) {
this.I = <set-?>;
}

public final float K() {
return this.O;
}

public final void T(float <set-?>) {
this.O = <set-?>;
}

public final float b() {
return this.F;
}

public final int F() {
return this.e;
}

public final int g() {
return this.E;
}

static {
long var0 = c ^ 53315603422676L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var8 = new long[14];
int var5 = 0;
String var6 = "uf|\u0083(\u0085´ÌØ æçqÁ0\nPOuÝ\u0088\u0016 Bt\u009d\u0092Ù\u001e\u008ca\u0004Cö\tbsa99ª\r\u0012\u0004¢à\u0012ñYj\"1\u008bZ¼SaÚ«8BÎÑVò\u000eé)9ªè@è\u009eklûä>¥\u0091O>ºÜ½@\u0092M\u00adxúý\u0098Å¢";
int var7 = "uf|\u0083(\u0085´ÌØ æçqÁ0\nPOuÝ\u0088\u0016 Bt\u009d\u0092Ù\u001e\u008ca\u0004Cö\tbsa99ª\r\u0012\u0004¢à\u0012ñYj\"1\u008bZ¼SaÚ«8BÎÑVò\u000eé)9ªè@è\u009eklûä>¥\u0091O>ºÜ½@\u0092M\u00adxúý\u0098Å¢"
.length();
byte var4 = 0;

label23:
while (true) {
int var10001 = var4;
var4 += 8;
byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
long[] var14 = var8;
var10001 = var5++;
long var17 = (var9[0] & 255L) << 56
| (var9[1] & 255L) << 48
| (var9[2] & 255L) << 40
| (var9[3] & 255L) << 32
| (var9[4] & 255L) << 24
| (var9[5] & 255L) << 16
| (var9[6] & 255L) << 8
| var9[7] & 255L;
byte var19 = -1;

while (true) {
long var10 = var17;
byte[] var12 = var2.doFinal(
new byte[]{
(byte)(var10 >>> 56),
(byte)(var10 >>> 48),
(byte)(var10 >>> 40),
(byte)(var10 >>> 32),
(byte)(var10 >>> 24),
(byte)(var10 >>> 16),
(byte)(var10 >>> 8),
(byte)var10
}
);
long var21 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
switch (var19) {
case 0:
var14[var10001] = var21;
if (var4 >= var7) {
d = var8;
g = new Integer[14];
return;
}
break;
default:
var14[var10001] = var21;
if (var4 < var7) {
continue label23;
}

var6 = "\u009aiÔ·(a«\u0086þ&Ìý,Ú\u0015N";
var7 = "\u009aiÔ·(a«\u0086þ&Ìý,Ú\u0015N".length();
var4 = 0;
}

byte var16 = var4;
var4 += 8;
var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
var14 = var8;
var10001 = var5++;
var17 = (var9[0] & 255L) << 56
| (var9[1] & 255L) << 48
| (var9[2] & 255L) << 40
| (var9[3] & 255L) << 32
| (var9[4] & 255L) << 24
| (var9[5] & 255L) << 16
| (var9[6] & 255L) << 8
| var9[7] & 255L;
var19 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 19277;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = d[var3];
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
throw new RuntimeException("su/catlean/fw", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
}

private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/fw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
