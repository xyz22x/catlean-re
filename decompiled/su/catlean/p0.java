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

public class p0 {
private float F;
private float o;
private float a;
private float m;
private int e;
private float N;
private float w;
private boolean C;
private static final long b = yz.a(9064517651357581070L, -7975892058122228012L, MethodHandles.lookup().lookupClass()).a(51774186114702L);
private static final long[] c;
private static final Integer[] d;
private static final Map f = new HashMap(13);

public p0(float x, float y, float motionX, float motionY, int time, float lastX, float lastY, boolean flame) {
this.F = x;
this.o = y;
this.a = motionX;
this.m = motionY;
this.e = time;
this.N = lastX;
this.w = lastY;
this.C = flame;
}

public final float Z() {
return this.F;
}

public final void C(float <set-?>) {
this.F = <set-?>;
}

public final float e() {
return this.o;
}

public final void R(float <set-?>) {
this.o = <set-?>;
}

public final float R() {
return this.a;
}

public final void G(float <set-?>) {
this.a = <set-?>;
}

public final float r() {
return this.m;
}

public final void S(float <set-?>) {
this.m = <set-?>;
}

public final int T() {
return this.e;
}

public final void Y(int <set-?>) {
this.e = <set-?>;
}

public final float V() {
return this.N;
}

public final void N(float <set-?>) {
this.N = <set-?>;
}

public final float t() {
return this.w;
}

public final void J(float <set-?>) {
this.w = <set-?>;
}

public final boolean H() {
return this.C;
}

public final void y(boolean <set-?>) {
this.C = <set-?>;
}

static {
long var0 = b ^ 15570144994171L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var8 = new long[3];
int var5 = 0;
String var6 = "\u0086¨Ô{°Pñ=ú\rcoÉ \u0090è×âÁP ñ?\u0081";
int var7 = "\u0086¨Ô{°Pñ=ú\rcoÉ \u0090è×âÁP ñ?\u0081".length();
byte var4 = 0;

do {
int var10001 = var4;
var4 += 8;
byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
var10001 = var5++;
long var10 = (var9[0] & 255L) << 56
| (var9[1] & 255L) << 48
| (var9[2] & 255L) << 40
| (var9[3] & 255L) << 32
| (var9[4] & 255L) << 24
| (var9[5] & 255L) << 16
| (var9[6] & 255L) << 8
| var9[7] & 255L;
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
long var10004 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var14 = -1;
var8[var10001] = var10004;
} while (var4 < var7);

c = var8;
d = new Integer[3];
}

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26320;
if (d[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = c[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])f.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/p0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
d[var3] = var15;
}

return d[var3];
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
throw new RuntimeException("su/catlean/p0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
