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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ct extends a1 {
@NotNull
private final ClosedFloatingPointRange P;
private static String o;
private static final long c = yz.a(-2581682055250234497L, 1482073113571217526L, MethodHandles.lookup().lookupClass()).a(48085034017535L);
private static final String[] d;
private static final String[] g;
private static final Map i = new HashMap(13);
private static final long[] l;
private static final Integer[] m;
private static final Map n;

public ct(@NotNull String id, float defaultValue, long a, @NotNull ClosedFloatingPointRange range, @Nullable h group, @NotNull Function0 visible) {
a = c ^ a;
long var8 = a ^ 23052941541257L;
Intrinsics.checkNotNullParameter(id, b<"y">(5573, 86099042538144563L ^ a));
Intrinsics.checkNotNullParameter(range, b<"y">(9786, 7854851509879861453L ^ a));
Intrinsics.checkNotNullParameter(visible, b<"y">(3856, 7280732349435763172L ^ a));
super(var8, id, defaultValue, null, group, visible, 4, null);
this.P = range;
}

@NotNull
public final ClosedFloatingPointRange r() {
return this.P;
}

@Override
public void P(@NotNull String setting, long a) {
Intrinsics.checkNotNullParameter(setting, b<"y">(4006, 8870789723179525267L ^ a));
this.H(Float.parseFloat(setting));
}

@NotNull
@Override
public String toString() {
return String.valueOf(((Number)this.F()).floatValue());
}

private static final boolean p() {
return true;
}

public static void f(String var0) {
o = var0;
}

public static String n() {
return o;
}

static {
long var20 = c ^ 34275186914730L;
vm.a<"Å">(null, -7068662112350663806L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[4];
int var16 = 0;
String var15 = "¶u£\u0016¡\u0013¤ú9ëfEy\u0018öó\u0010!mìó*T\u001bÏA N:\u0080\u0002z\u0097";
int var17 = "¶u£\u0016¡\u0013¤ú9ëfEy\u0018öó\u0010!mìó*T\u001bÏA N:\u0080\u0002z\u0097".length();
char var14 = 16;
int var23 = -1;

label45:
while (true) {
String var24 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var33;
if ((var23 += var14) >= var17) {
d = var18;
g = new String[4];
n = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "\u0091\u001e\u00968b\u0010\u008dR§F\u0096Ê¾c \b";
int var5 = "\u0091\u001e\u00968b\u0010\u008dR§F\u0096Ê¾c \b".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

l = var6;
m = new Integer[2];
return;
}

var14 = var15.charAt(var23);
break;
default:
var18[var16++] = var33;
if ((var23 += var14) < var17) {
var14 = var15.charAt(var23);
continue label45;
}

var15 = "ð\u001dÝ³¿\u008bÞû5\u008eLNE\b9g\u0010×}\u0000¹ã2y?>Õ\u0005LSÜ¨K";
var17 = "ð\u001dÝ³¿\u008bÞû5\u008eLNE\b9g\u0010×}\u0000¹ã2y?>Õ\u0005LSÜ¨K".length();
var14 = 16;
var23 = -1;
}

var24 = var15.substring(++var23, var23 + var14);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4530;
if (g[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ct", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
g[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return g[var5];
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
throw new RuntimeException("su/catlean/ct" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17877;
if (m[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = l[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])n.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
n.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ct", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
m[var3] = var15;
}

return m[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ct" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
