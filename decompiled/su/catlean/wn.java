package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum wn {
public static final wn NORMAL;
public static final wn STRICT;
public static final wn OLD;
public static final wn NEW;
private static final wn[] b;
private static final EnumEntries a;
private static int[] m;

@NotNull
public static EnumEntries u() {
return a;
}

private static final wn[] l() {
return new wn[]{NORMAL, STRICT, OLD, NEW};
}

static {
long var9 = yz.a(3373477859934996033L, -3650849159881896032L, MethodHandles.lookup().lookupClass()).a(238607397265992L) ^ 102308242131373L;
if (vm.a<"Å">(6582397668750659441L, var9) != null) {
vm.a<"Å">(new int[5], 6578381966953648624L, var9);
}

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
String var5 = "Ñ·\r\u0096â\u0080ÏÐ\b\u0099\r\u001a¯\u0019\u00902§";
int var7 = "Ñ·\r\u0096â\u0080ÏÐ\b\u0099\r\u001a¯\u0019\u00902§".length();
char var4 = '\b';
int var12 = -1;

label32:
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
NORMAL = new wn();
STRICT = new wn();
OLD = new wn();
NEW = new wn();
b = l();
a = EnumEntriesKt.enumEntries(b);
return;
}

var4 = var5.charAt(var12);
break;
default:
var0[var6++] = var19;
if ((var12 += var4) < var7) {
var4 = var5.charAt(var12);
continue label32;
}

var5 = "Í\u0080QiÑÓ¬G\bt\u008eì\u0098ô~Hc";
var7 = "Í\u0080QiÑÓ¬G\bt\u008eì\u0098ô~Hc".length();
var4 = '\b';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
var10001 = 0;
}
}
}

public static void G(int[] var0) {
m = var0;
}

public static int[] O() {
return m;
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
