package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum xi {
public static final xi ALWAYS;
public static final xi AIR_REBREAK;
public static final xi REBREAK;
public static final xi OFF;
private static final xi[] N;
private static final EnumEntries f;

@NotNull
public static EnumEntries F() {
return f;
}

private static final xi[] D() {
return new xi[]{ALWAYS, AIR_REBREAK, REBREAK, OFF};
}

static {
long var9 = yz.a(1948764539025470230L, -7942601080177276727L, MethodHandles.lookup().lookupClass()).a(112864324952125L) ^ 19480043615521L;
Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[4];
int var6 = 0;
String var5 = "\u0090u\u009fÉ(¡\u0088\u008a\u0010\u0086Ð Ù\u0091,^\u000e\u008eÐ¤\u001eÇ>Hµ";
int var7 = "\u0090u\u009fÉ(¡\u0088\u008a\u0010\u0086Ð Ù\u0091,^\u000e\u008eÐ¤\u001eÇ>Hµ".length();
char var4 = '\b';
int var12 = -1;

label28:
while (true) {
String var13 = var5.substring(++var12, var12 + var4);
byte var10001 = -1;

while (true) {
byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var8).intern();
switch (var10001) {
case 0:
var0[var6++] = var19;
if ((var12 += var4) >= var7) {
ALWAYS = new xi();
AIR_REBREAK = new xi();
REBREAK = new xi();
OFF = new xi();
N = D();
f = EnumEntriesKt.enumEntries(N);
return;
}

var4 = var5.charAt(var12);
break;
default:
var0[var6++] = var19;
if ((var12 += var4) < var7) {
var4 = var5.charAt(var12);
continue label28;
}

var5 = "ø³¥ÕÜ²ç\u008a\b6\u0096½\u0098`{ªÿ";
var7 = "ø³¥ÕÜ²ç\u008a\b6\u0096½\u0098`{ªÿ".length();
var4 = '\b';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
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
}
