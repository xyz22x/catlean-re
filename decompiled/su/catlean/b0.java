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

enum b0 {
public static final b0 GAPPLE_SHIELD;
public static final b0 BALL_SHIELD;
public static final b0 GAPPLE_BALL;
public static final b0 BALL_TOTEM;
public static final b0 TOTEM_TOTEM;
public static final b0 BALL_BALL;
public static final b0 CUSTOM;
private static final b0[] Z;
private static final EnumEntries V;
private static final long a = yz.a(4486383793670934218L, 6193478350103408119L, MethodHandles.lookup().lookupClass()).a(149682455931762L);
private static final long[] b;
private static final Integer[] c;
private static final Map d;

@NotNull
public static EnumEntries f() {
return V;
}

private static final b0[] V(long var0) {
var0 = a ^ var0;
b0[] var2 = new b0[a<"k">(3831, 1485022046067121458L ^ var0)];
var2[0] = GAPPLE_SHIELD;
var2[1] = BALL_SHIELD;
var2[2] = GAPPLE_BALL;
var2[3] = BALL_TOTEM;
var2[4] = TOTEM_TOTEM;
var2[5] = BALL_BALL;
var2[a<"k">(16, 6758881762276856791L ^ var0)] = CUSTOM;
return var2;
}

static {
long var20 = a ^ 99593750669540L;
long var22 = var20 ^ 75717816860925L;
Cipher var12;
Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var13 = 1; var13 < 8; var13++) {
var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var11 = new String[7];
int var17 = 0;
String var16 = "µWt 9·À½¸å\u0095÷:~ø\u0086\u0010\u0014í!jìés³\u0091}f½ô\rX«\u0010Ä<â\b\u00810l\u0003ôÃ¾kR\u001aîì\u0010Qî]CEobèu§êéY\u0002 ¹\u0010=z\u0005²\u0014\u0096z\u0093Ü\u000ev\u009d\u008e\u0088\u009d¯";
int var18 = "µWt 9·À½¸å\u0095÷:~ø\u0086\u0010\u0014í!jìés³\u0091}f½ô\rX«\u0010Ä<â\b\u00810l\u0003ôÃ¾kR\u001aîì\u0010Qî]CEobèu§êéY\u0002 ¹\u0010=z\u0005²\u0014\u0096z\u0093Ü\u000ev\u009d\u008e\u0088\u009d¯"
.length();
char var15 = 16;
int var25 = -1;

label45:
while (true) {
String var26 = var16.substring(++var25, var25 + var15);
int var10001 = -1;

while (true) {
byte[] var19 = var12.doFinal(var26.getBytes("ISO-8859-1"));
String var35 = a(var19).intern();
switch (var10001) {
case 0:
var11[var17++] = var35;
if ((var25 += var15) >= var18) {
d = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "2\u0087cñ8Ë¦\u0087+c\u0086\"\u0086\u0090?P\u0090q\u008d«ïÆôÍ";
int var5 = "2\u0087cñ8Ë¦\u0087+c\u0086\"\u0086\u0090?P\u0090q\u008d«ïÆôÍ".length();
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
byte var40 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

b = var6;
c = new Integer[3];
GAPPLE_SHIELD = new b0();
BALL_SHIELD = new b0();
GAPPLE_BALL = new b0();
BALL_TOTEM = new b0();
TOTEM_TOTEM = new b0();
BALL_BALL = new b0();
CUSTOM = new b0();
Z = V(var22);
V = EnumEntriesKt.enumEntries(Z);
return;
}

var15 = var16.charAt(var25);
break;
default:
var11[var17++] = var35;
if ((var25 += var15) < var18) {
var15 = var16.charAt(var25);
continue label45;
}

var16 = "t¨íóõ\u0010º¿\rÙÝ\u00adn\u009e?Ù\b\u0095P\u00ad1ë3SO";
var18 = "t¨íóõ\u0010º¿\rÙÝ\u00adn\u009e?Ù\b\u0095P\u00ad1ë3SO".length();
var15 = 16;
var25 = -1;
}

var26 = var16.substring(++var25, var25 + var15);
var10001 = 0;
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
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31710;
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
throw new RuntimeException("su/catlean/b0", var14);
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
throw new RuntimeException("su/catlean/b0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
