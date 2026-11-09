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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class _a extends _g {
@NotNull
public static final _a n;
static final KProperty[] a;
@NotNull
private static final cw U;
private static _g[] P;
private static final long b = yz.a(-2185901550709602802L, -1557163849045337001L, MethodHandles.lookup().lookupClass()).a(264240335578388L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);

private _a(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 106112803602091L;
super(b<"j">(6121, 4859008183429647720L ^ var4), jt.c(), null, 4, null, var6);
}

@NotNull
public final lu j(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 66839909420864L;
String var5 = vm.a<"Å">(193943624711497557L, var1);

try {
lu var10000 = (lu)U.E(this, var3, a[0]);
if (var5 != null) {
vm.a<"Å">(new _g[3], 172203357876127838L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 213477512841546260L, var1);
}
}

static {
long var16 = b ^ 38743268804392L;
long var10001 = var16 ^ 108351891499354L;
int var18 = (int)((var16 ^ 108351891499354L) >>> 48);
int var19 = (int)((var16 ^ 108351891499354L) << 16 >>> 48);
int var20 = (int)(var10001 << 32 >>> 32);
long var21 = var16 ^ 51881441033695L;
_g[] var10000 = new _g[2];
vm.a<"Å">(var10000, -9157634257101796545L, var16);
Cipher var7;
Cipher var26 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var26.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[4];
int var12 = 0;
String var11 = "OB¨é\u001d\u0018d£ê\roj\u00ad\u0087F\u0080á\u0093\\.ïáAM\r\u00990d\u001dp+é\u0010¥û\u0016\u0093g\u000eØbÕ-\u0098\u0093\u000e'Ð,";
int var13 = "OB¨é\u001d\u0018d£ê\roj\u00ad\u0087F\u0080á\u0093\\.ïáAM\r\u00990d\u001dp+é\u0010¥û\u0016\u0093g\u000eØbÕ-\u0098\u0093\u000e'Ð,".length();
char var10 = ' ';
int var25 = -1;

label37:
while (true) {
String var27 = var11.substring(++var25, var25 + var10);
byte var30 = -1;

while (true) {
byte[] var15 = var7.doFinal(var27.getBytes("ISO-8859-1"));
String var36 = b(var15).intern();
switch (var30) {
case 0:
var14[var12++] = var36;
if ((var25 += var10) >= var13) {
c = var14;
d = new String[4];
Cipher var2;
Cipher var29 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var29.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 4224505819637840718L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var40 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var34 = -1;
long var0 = var40;
KProperty[] var23 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(_a.class, b<"j">(971, 5466455321618216576L ^ var16), b<"j">(13192, 750484913111746240L ^ var16), 0))
};
a = var23;
n = new _a((short)var18, (short)var19, var20);
U = yp.L(n, b<"j">(27563, 3828415402191494882L ^ var16), lu.FREE, null, null, (int)var0, null, var21);
return;
}

var10 = var11.charAt(var25);
break;
default:
var14[var12++] = var36;
if ((var25 += var10) < var13) {
var10 = var11.charAt(var25);
continue label37;
}

var11 = "(µAïf¦õ\u0013õÆB\u000fþ*ÚX{\u0014\u000e\u0095°§â0\u001f\u0002oÈ^I«\u008cVU\f\u0018!^¼f\u0092\u0007ï\u0081Ý\u000e\u001b;jÎ=.]Zh\u0080\u0010\u0015=BV_5\u0007óO\r©\u0082\u0090B\u0097_";
var13 = "(µAïf¦õ\u0013õÆB\u000fþ*ÚX{\u0014\u000e\u0095°§â0\u001f\u0002oÈ^I«\u008cVU\f\u0018!^¼f\u0092\u0007ï\u0081Ý\u000e\u001b;jÎ=.]Zh\u0080\u0010\u0015=BV_5\u0007óO\r©\u0082\u0090B\u0097_"
.length();
var10 = '8';
var25 = -1;
}

var27 = var11.substring(++var25, var25 + var10);
var30 = 0;
}
}
}

public static void A(_g[] var0) {
P = var0;
}

public static _g[] s() {
return P;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29939;
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
throw new RuntimeException("su/catlean/_a", var10);
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
throw new RuntimeException("su/catlean/_a" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
