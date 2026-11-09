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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cq extends a1 {
private static int[] g;
private static final long c = yz.a(-4070681658916624801L, -8140552360894492050L, MethodHandles.lookup().lookupClass()).a(126300479277855L);
private static final String[] d;
private static final String[] i;
private static final Map l = new HashMap(13);
private static final long m;

public cq(@NotNull String id, boolean defaultValue, @Nullable h group, long a, @NotNull Function0 visible) {
a = c ^ a;
long var7 = a ^ 68084126435354L;
Intrinsics.checkNotNullParameter(id, b<"z">(21870, 1281129330182102047L ^ a));
Intrinsics.checkNotNullParameter(visible, b<"z">(23458, 155845752237953745L ^ a));
super(var7, id, defaultValue, null, group, visible, 4, null);
}

@Override
public void P(@NotNull String setting, long a) {
Intrinsics.checkNotNullParameter(setting, b<"z">(22777, 4213523905988238296L ^ a));
this.H(Boolean.parseBoolean(setting));
}

@NotNull
@Override
public String toString() {
return String.valueOf(((Boolean)this.F()).booleanValue());
}

private static final boolean k() {
return true;
}

public static void l(int[] var0) {
g = var0;
}

public static int[] X() {
return g;
}

static {
long var14 = c ^ 24972059637053L;
int[] var10000 = new int[3];
vm.a<"Å">(var10000, -4345652834058660552L, var14);
Cipher var5;
Cipher var17 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[3];
int var10 = 0;
String var9 = "wê×Ó\u0097½æ¬°AìÑ®\b\u0098\u0015\u0010ÿ\r\u0098Ô\u0080\u0084\u0003|¡âX\u0096Flq\u0097\u0010\u0092§®2<ôf\u0007FWs;vÓ{Õ";
int var11 = "wê×Ó\u0097½æ¬°AìÑ®\b\u0098\u0015\u0010ÿ\r\u0098Ô\u0080\u0084\u0003|¡âX\u0096Flq\u0097\u0010\u0092§®2<ôf\u0007FWs;vÓ{Õ".length();
char var8 = 16;
int var7 = -1;

while (true) {
byte[] var13 = var5.doFinal(var9.substring(++var7, var7 + var8).getBytes("ISO-8859-1"));
String var21 = b(var13).intern();
byte var10001 = -1;
var12[var10++] = var21;
if ((var7 += var8) >= var11) {
d = var12;
i = new String[3];
Cipher var0;
Cipher var18 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -1950570832088800749L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var24 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
m = var24;
return;
}

var8 = var9.charAt(var7);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31143;
if (i[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])l.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/cq", var10);
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
i[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return i[var5];
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
throw new RuntimeException("su/catlean/cq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
