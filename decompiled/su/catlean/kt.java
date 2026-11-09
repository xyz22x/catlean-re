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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.BasicProjectionMatrixEvent;
import su.catlean.gofra.Flow;

public final class kt extends _g {
@NotNull
public static final kt w;
@NotNull
private static final ct o;
private static final long a = yz.a(714477943417894983L, -7809358327132937927L, MethodHandles.lookup().lookupClass()).a(115988175889358L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private kt(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 20198151277227L;
super(b<"q">(18724, 6104633909760226572L ^ var1), jt.F(), null, 4, null, var3);
}

public final float I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 65881915751592L;
int var5 = vm.a<"Å">(-5686244698223139974L, var1);

try {
float var10000 = ((Number)o.E(this, var3, V[0])).floatValue();
if (vm.a<"Å">(-5621077754150015124L, var1) != null) {
vm.a<"Å">(++var5, -5627616606940666580L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -5673892491534248025L, var1);
}
}

public final void p(long a, char a, float <set-?>) {
long var5 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
long var7 = var5 ^ 61003665472529L;
int var9 = vm.a<"Å">(-6415541145217489750L, var5);

try {
o.b(this, var7, V[0], <set-?>);
if (var9 == 0) {
vm.a<"Å">(new _g[2], -6422427395887813405L, var5);
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -6478584524691128078L, var5);
}
}

@Flow
private final void i(BasicProjectionMatrixEvent var1) {
long var2 = a ^ 85999478251595L;
long var4 = var2 ^ 58397505392871L;
var1.setRatio(this.I(var4));
var1.cancel();
}

static {
long var16 = a ^ 120433890711398L;
long var18 = var16 ^ 24280073777842L;
long var20 = var16 ^ 104331094773012L;
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[4];
int var12 = 0;
String var11 = "Ë®]g\u0085'¦§F\n0\u0015Òh\u0083y\u0010¥\u000bÊh#èF\u00138{Kpu\u009dô&";
int var13 = "Ë®]g\u0085'¦§F\n0\u0015Òh\u0083y\u0010¥\u000bÊh#èF\u00138{Kpu\u009dô&".length();
char var10 = 16;
int var24 = -1;

label37:
while (true) {
String var25 = var11.substring(++var24, var24 + var10);
byte var10001 = -1;

while (true) {
byte[] var15 = var7.doFinal(var25.getBytes("ISO-8859-1"));
String var33 = b(var15).intern();
switch (var10001) {
case 0:
var14[var12++] = var33;
if ((var24 += var10) >= var13) {
b = var14;
c = new String[4];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 4482947985482280774L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var37 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
var10001 = -1;
long var0 = var37;
KProperty[] var22 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kt.class, b<"q">(10213, 3059421774157020051L ^ var16), b<"q">(15722, 3704222813982417181L ^ var16), 0)
)
};
V = var22;
w = new kt(var20);
o = yp.k(w, b<"q">(22428, 4468298388648528873L ^ var16), 1.0F, var18, RangesKt.rangeTo(0.1F, 10.0F), null, null, (int)var0, null);
return;
}

var10 = var11.charAt(var24);
break;
default:
var14[var12++] = var33;
if ((var24 += var10) < var13) {
var10 = var11.charAt(var24);
continue label37;
}

var11 = "Nv¿\u0015*{\u0001Ä~»q\u0016\u0083\u0082¢Z\u0018Íix»(?2ÒU§ÄÇ\u0017Êþ\u000bª8Ç:çà\u009c\u001c";
var13 = "Nv¿\u0015*{\u0001Ä~»q\u0016\u0083\u0082¢Z\u0018Íix»(?2ÒU§ÄÇ\u0017Êþ\u000bª8Ç:çà\u009c\u001c".length();
var10 = 16;
var24 = -1;
}

var25 = var11.substring(++var24, var24 + var10);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9818;
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
throw new RuntimeException("su/catlean/kt", var10);
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
throw new RuntimeException("su/catlean/kt" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
