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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
public enum d1 {
@NotNull
public static final rt Companion;
@NotNull
private static final Lazy q;
public static final d1 ERROR;
public static final d1 READY;
private static final d1[] d;
private static final EnumEntries E;
private static final long a = yz.a(4880831238751005309L, 2332814840260784352L, MethodHandles.lookup().lookupClass()).a(21092520305389L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);

@NotNull
public static EnumEntries F() {
return E;
}

private static final KSerializer T() {
long var0 = a ^ 37759655632090L;
return EnumsKt.createSimpleEnumSerializer(a<"t">(2202, 770658403831719197L ^ var0), values());
}

private static final d1[] y() {
return new d1[]{ERROR, READY};
}

public static final Lazy o() {
return q;
}

static {
long var9 = a ^ 102985908818108L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[3];
int var5 = 0;
String var4 = "E\rÜ\bÆ¢\u0083a+¢\\²\u009a\u0080\u009dg\u009eòû\u0085\u001aÏ¼\u0006óÇnÖ-p=á\u0010U\u0099´NÃíÛAá>q)2\u0011Y\u0017\u0010Â{\u0082¹í\u00989R\u001a½\"\u0017æÎ7%";
int var6 = "E\rÜ\bÆ¢\u0083a+¢\\²\u009a\u0080\u009dg\u009eòû\u0085\u001aÏ¼\u0006óÇnÖ-p=á\u0010U\u0099´NÃíÛAá>q)2\u0011Y\u0017\u0010Â{\u0082¹í\u00989R\u001a½\"\u0017æÎ7%"
.length();
char var3 = ' ';
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var7[var5++] = var13;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[3];
ERROR = new d1();
READY = new d1();
d = y();
E = EnumEntriesKt.enumEntries(d);
Companion = new rt(null);
q = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, d1::T);
return;
}

var3 = var4.charAt(var2);
}
}

private static String a(byte[] var0) {
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23509;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/d1", var10);
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
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/d1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
