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

enum df {
public static final df Default;
public static final df Bonk;
public static final df Rubber;
public static final df Akrien;
public static final df Flip;
public static final df Snap;
public static final df Hook;
public static final df Swipe;
public static final df Tap;
public static final df Inject;
public static final df Slap;
private static final df[] o;
private static final EnumEntries N;
private static final long a = yz.a(4373514013005079342L, -3002697738789848869L, MethodHandles.lookup().lookupClass()).a(128408058988668L);
private static final long[] b;
private static final Integer[] c;
private static final Map d;

@NotNull
public static EnumEntries S() {
return N;
}

private static final df[] U(long var0) {
var0 = a ^ var0;
df[] var2 = new df[a<"f">(23647, 76171680790873185L ^ var0)];
var2[0] = Default;
var2[1] = Bonk;
var2[2] = Rubber;
var2[3] = Akrien;
var2[4] = Flip;
var2[5] = Snap;
var2[a<"f">(8796, 6482128928589773409L ^ var0)] = Hook;
var2[a<"f">(32000, 4256156799528707382L ^ var0)] = Swipe;
var2[a<"f">(26781, 8744158665978065063L ^ var0)] = Tap;
var2[a<"f">(5557, 5797765332589464972L ^ var0)] = Inject;
var2[a<"f">(32110, 1225398741551424853L ^ var0)] = Slap;
return var2;
}

static {
long var20 = a ^ 137957882997376L;
long var22 = var20 ^ 32596857650501L;
Cipher var12;
Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var13 = 1; var13 < 8; var13++) {
var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var11 = new String[11];
int var17 = 0;
String var16 = "¯Ùî½\u000b¿\u001d%\b*U¨on&\u008d\u0001\bQ¡\u0007£Æè1\u0001\bÀÙKq»\u0098\u000fC\bs¦Ã~U\b)-\b?\te\u0099_\\¾\u0007\bÒØ\u0097d<s\u0089\u009f\b\u0013káþS\u0092\u0015G\b\u0013N\u007fÙ\u0094àå¼";
int var18 = "¯Ùî½\u000b¿\u001d%\b*U¨on&\u008d\u0001\bQ¡\u0007£Æè1\u0001\bÀÙKq»\u0098\u000fC\bs¦Ã~U\b)-\b?\te\u0099_\\¾\u0007\bÒØ\u0097d<s\u0089\u009f\b\u0013káþS\u0092\u0015G\b\u0013N\u007fÙ\u0094àå¼"
.length();
char var15 = '\b';
int var26 = -1;

label54:
while (true) {
String var27 = var16.substring(++var26, var26 + var15);
int var10001 = -1;

while (true) {
byte[] var19 = var12.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = a(var19).intern();
switch (var10001) {
case 0:
var11[var17++] = var38;
if ((var26 += var15) >= var18) {
d = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[11];
int var3 = 0;
String var4 = "F\u009aW\u009c8¥\u001bÏ@ö©ßORh3-ú\f cö\u001eN´w¶Îu\u0004ý\u008dü´\u0015h±wÂ; 5Á\u001cè\u009b\u000eË;ïO¾\u009b=(w\u0087Ð\u001eyBÃÈ½.0\u000bè\u008cGÚô";
int var5 = "F\u009aW\u009c8¥\u001bÏ@ö©ßORh3-ú\f cö\u001eN´w¶Îu\u0004ý\u008dü´\u0015h±wÂ; 5Á\u001cè\u009b\u000eË;ïO¾\u009b=(w\u0087Ð\u001eyBÃÈ½.0\u000bè\u008cGÚô"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var30[var10001] = var47;
if (var2 >= var5) {
b = var6;
c = new Integer[11];
Default = new df();
Bonk = new df();
Rubber = new df();
Akrien = new df();
Flip = new df();
Snap = new df();
Hook = new df();
Swipe = new df();
Tap = new df();
Inject = new df();
Slap = new df();
o = U(var22);
N = EnumEntriesKt.enumEntries(o);
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "¤\u0094@§ê\u001fn¬]ò\u00adíHZª¸";
var5 = "¤\u0094@§ê\u001fn¬]ò\u00adíHZª¸".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var15 = var16.charAt(var26);
break;
default:
var11[var17++] = var38;
if ((var26 += var15) < var18) {
var15 = var16.charAt(var26);
continue label54;
}

var16 = "Ë\u0095$T=\b\r\u007f\bÊüa\u009bÕ/\u0094\u0019";
var18 = "Ë\u0095$T=\b\r\u007f\bÊüa\u009bÕ/\u0094\u0019".length();
var15 = '\b';
var26 = -1;
}

var27 = var16.substring(++var26, var26 + var15);
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
int var3 = var0 ^ (int)(var1 & 32767L) ^ 4090;
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
throw new RuntimeException("su/catlean/df", var14);
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
throw new RuntimeException("su/catlean/df" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
