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
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public final class r1 extends r2 {
private static final long b = yz.a(8078699832611229112L, 2431510014000333583L, MethodHandles.lookup().lookupClass()).a(257009133824529L);
private static final String[] k;
private static final String[] l;
private static final Map m = new HashMap(13);

public r1(long a, @NotNull a1 setting) {
a = b ^ a;
long var4 = a ^ 61151757464285L;
Intrinsics.checkNotNullParameter(setting, b<"r">(20415, 7355809176143048651L ^ a));
super(var4, setting);
}

@Override
public void K(long a, int mouseX) {
long var10001 = a ^ 13989052645633L;
int var4 = (int)((a ^ 13989052645633L) >>> 32);
int var5 = (int)((a ^ 13989052645633L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
_g[] var7 = vm.a<"Å">(-8664070826218471330L, a);

int var10000;
label20: {
try {
var10000 = this.k();
if (var7 == null) {
break label20;
}

if (var10000 == 0) {
return;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -8655160246565992583L, a);
}

var10000 = mouseX;
}

float var8 = Math.clamp((var10000 - this.x()) / (this.F() - 7.0F), 0.0F, 1.0F);
this.A()
.H(MathKt.roundToInt(this.H(var4, (char)var5, var6).getFirst() + (this.H(var4, (char)var5, var6).getLast() - this.H(var4, (char)var5, var6).getFirst()) * var8));
}

@Override
public float J(char var1, long var2) {
long var4 = (long)var1 << 48 | var2 << 16 >>> 16;
long var10001 = var4 ^ 43274661890022L;
int var6 = (int)((var4 ^ 43274661890022L) >>> 32);
int var7 = (int)((var4 ^ 43274661890022L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
return Math.clamp(
((float)((Number)this.A().F()).intValue() - this.H(var6, (char)var7, var8).getFirst())
/ (this.H(var6, (char)var7, var8).getLast() - this.H(var6, (char)var7, var8).getFirst()),
0.0F,
1.0F
);
}

@NotNull
public Integer t(@NotNull String value, long a) {
a = b ^ a;
Intrinsics.checkNotNullParameter(value, b<"r">(24470, 596572392213621193L ^ a));
return Integer.parseInt(value);
}

@NotNull
public Integer u(int current, long a, int step) {
a = b ^ a;
long var10001 = a ^ 1825760539888L;
int var5 = (int)((a ^ 1825760539888L) >>> 32);
int var6 = (int)((a ^ 1825760539888L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
return RangesKt.coerceIn(current + step, this.H(var5, (char)var6, var7).getFirst(), this.H(var5, (char)var6, var7).getLast());
}

@Override
public void L() {
this.k(false);
}

@Override
public Number s(int a, char a, int a, String value) {
long var5 = (long)a << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48;
long var7 = var5 ^ 29274642336829L;
return this.t(value, var7);
}

@Override
public Number i(int a, Number current, int a, char a, int step) {
long var6 = (long)a << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48;
long var8 = var6 ^ 74496559134582L;
return this.u(current.intValue(), var8, step);
}

static {
long var0 = b ^ 17080880578215L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[2];
int var7 = 0;
String var6 = "ê{ø¥p0=ÄäæÒ\u0088Æey.\u0010\u0091\u0093\u0092r\u0006vÈ§v®jÛÌ .·";
int var8 = "ê{ø¥p0=ÄäæÒ\u0088Æey.\u0010\u0091\u0093\u0092r\u0006vÈ§v®jÛÌ .·".length();
char var5 = 16;
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = c(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
k = var9;
l = new String[2];
return;
}

var5 = var6.charAt(var4);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String c(byte[] var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18957;
if (l[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])m.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
m.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/r1", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = k[var5].getBytes("ISO-8859-1");
l[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return l[var5];
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
throw new RuntimeException("su/catlean/r1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
