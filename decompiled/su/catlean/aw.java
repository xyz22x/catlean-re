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
public enum aw {
@NotNull
public static final jj Companion;
@NotNull
private static final Lazy f;
public static final aw DISPATCH;
public static final aw SET_ACTIVITY;
private static final aw[] T;
private static final EnumEntries q;
private static final long a = yz.a(-6507926676261367734L, -7118833704870300995L, MethodHandles.lookup().lookupClass()).a(71660955810081L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@NotNull
public static EnumEntries L() {
return q;
}

private static final KSerializer c() {
long var0 = a ^ 40843488791199L;
return EnumsKt.createSimpleEnumSerializer(a<"d">(22006, 4642144836637725600L ^ var0), values());
}

private static final aw[] M() {
return new aw[]{DISPATCH, SET_ACTIVITY};
}

public static final Lazy O() {
return f;
}

static {
long var9 = a ^ 117336956133540L;
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
String var4 = "\u0002\u0012=~÷1 Ø)\u001bPüÉ}óç\u0097¾wÑ\u009b-\u001d¡\u0087ì¶!pÝ\u0092\u0095 \u001fD\n\u0080Ñ°e\u001b\u0012zÓÄÆIQ0#\u0013Ñ¾ßuê¥üxhl´\u0004´C Àï¥~\u008b©Ñ?ló¦åú\u009c\u0085«ôU\u007f>¸,}k`Âg\u0014\u0096\u008d\u0086ÿ";
int var6 = "\u0002\u0012=~÷1 Ø)\u001bPüÉ}óç\u0097¾wÑ\u009b-\u001d¡\u0087ì¶!pÝ\u0092\u0095 \u001fD\n\u0080Ñ°e\u001b\u0012zÓÄÆIQ0#\u0013Ñ¾ßuê¥üxhl´\u0004´C Àï¥~\u008b©Ñ?ló¦åú\u009c\u0085«ôU\u007f>¸,}k`Âg\u0014\u0096\u008d\u0086ÿ"
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
DISPATCH = new aw();
SET_ACTIVITY = new aw();
T = M();
q = EnumEntriesKt.enumEntries(T);
Companion = new jj(null);
f = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, aw::c);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1741;
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
throw new RuntimeException("su/catlean/aw", var10);
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
throw new RuntimeException("su/catlean/aw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
