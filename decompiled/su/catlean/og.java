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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum og {
public static final og Fade;
public static final og Hover;
public static final og Decrease;
public static final og Static;
public static final og Flash;
public static final og Grow;
public static final og FILL;
public static final og TNT;
public static final og Pull;
private static final long a = yz.a(1227855188693642107L, 3946986171911208265L, MethodHandles.lookup().lookupClass()).a(230187653829232L);
private static final long[] b;
private static final Integer[] c;
private static final Map d;

@NotNull
public static EnumEntries f() {
return V;
}

static {
long var20 = a ^ 33395059979564L;
long var10001 = var20 ^ 26567221285378L;
int var22 = (int)((var20 ^ 26567221285378L) >>> 32);
int var23 = (int)((var20 ^ 26567221285378L) << 32 >>> 48);
int var24 = (int)(var10001 << 48 >>> 48);
Cipher var12;
Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var13 = 1; var13 < 8; var13++) {
var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var11 = new String[9];
int var17 = 0;
String var16 = "]\u0080Í\u00070A>ü\bÒS\u000f\u00ad6O\u009d\u008c\b»ýÿñÄ\u00047¸\bbb4[Ù\u0001 Ù\b\u0010f6Èrþôü\bdDÀ±a\u0092\u009fk\u0010\u009aÂ\u008f÷\u0006û\u0006¡\u001f\u008a\u0014â\u007f\u0086Ô-";
int var18 = "]\u0080Í\u00070A>ü\bÒS\u000f\u00ad6O\u009d\u008c\b»ýÿñÄ\u00047¸\bbb4[Ù\u0001 Ù\b\u0010f6Èrþôü\bdDÀ±a\u0092\u009fk\u0010\u009aÂ\u008f÷\u0006û\u0006¡\u001f\u008a\u0014â\u007f\u0086Ô-"
.length();
char var15 = '\b';
int var27 = -1;

label54:
while (true) {
String var28 = var16.substring(++var27, var27 + var15);
byte var32 = -1;

while (true) {
byte[] var19 = var12.doFinal(var28.getBytes("ISO-8859-1"));
String var40 = a(var19).intern();
switch (var32) {
case 0:
var11[var17++] = var40;
if ((var27 += var15) >= var18) {
d = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = "&²´\u0015·ëõ\u0096>i\u009c\u0016à\u0091\u009dÒßÐ0\u0095z;4Þx\u001c¢\u001cºd\u007fqH\u0004å©òö\u009bæ";
int var5 = "&²´\u0015·ëõ\u0096>i\u009c\u0016à\u0091\u009dÒßÐ0\u0095z;4Þx\u001c¢\u001cºd\u007fqH\u0004å©òö\u009bæ".length();
byte var2 = 0;

label36:
while (true) {
byte var36 = var2;
var2 += 8;
byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
long[] var31 = var6;
int var37 = var3++;
long var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var47 = -1;

while (true) {
long var8 = var44;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var49 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var47) {
case 0:
var31[var37] = var49;
if (var2 >= var5) {
b = var6;
c = new Integer[7];
Fade = new og();
Hover = new og();
Decrease = new og();
Static = new og();
Flash = new og();
Grow = new og();
FILL = new og();
TNT = new og();
Pull = new og();
V = EnumEntriesKt.enumEntries(H);
return;
}
break;
default:
var31[var37] = var49;
if (var2 < var5) {
continue label36;
}

var4 = "+2õr\u0097À.¡\u0007÷\u0090\u001f×z\u008dË";
var5 = "+2õr\u0097À.¡\u0007÷\u0090\u001f×z\u008dË".length();
var2 = 0;
}

byte var38 = var2;
var2 += 8;
var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
var31 = var6;
var37 = var3++;
var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var47 = 0;
}
}
}

var15 = var16.charAt(var27);
break;
default:
var11[var17++] = var40;
if ((var27 += var15) < var18) {
var15 = var16.charAt(var27);
continue label54;
}

var16 = "¬\u0007Õ\u0010Ï\u00925\u008c\b´ÖU\u0018#\u000e O";
var18 = "¬\u0007Õ\u0010Ï\u00925\u008c\b´ÖU\u0018#\u000e O".length();
var15 = '\b';
var27 = -1;
}

var28 = var16.substring(++var27, var27 + var15);
var32 = 0;
}
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

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7312;
if (c[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = b[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])d.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/og", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
c[var3] = var15;
}

return c[var3];
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
throw new RuntimeException("su/catlean/og" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
