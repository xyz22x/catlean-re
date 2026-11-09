package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum rw {
public static final rw MIRROR;
public static final rw DEFAULT;
public static final rw BLOOM;
public static final rw DOUBLE;
public static final rw CAMOUFLAGE;
private static final rw[] X;
private static final EnumEntries G;
private static int v;

@NotNull
public static EnumEntries T() {
return G;
}

private static final rw[] S() {
return new rw[]{MIRROR, DEFAULT, BLOOM, DOUBLE, CAMOUFLAGE};
}

static {
long var9 = yz.a(7319074314789041939L, -1086925738408626528L, MethodHandles.lookup().lookupClass()).a(228645840305507L) ^ 69548038974762L;
if (vm.a<"Å">(-7615565463409832330L, var9) == 0) {
vm.a<"Å">(69, -7624596103289823411L, var9);
}

Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[5];
int var6 = 0;
String var5 = "ë\u000bJ\u009d1\t\u0089®\bm\u0005bW#?}Î\bT\u009e\u000bï}¾\"¬";
int var7 = "ë\u000bJ\u009d1\t\u0089®\bm\u0005bW#?}Î\bT\u009e\u000bï}¾\"¬".length();
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
MIRROR = new rw();
DEFAULT = new rw();
BLOOM = new rw();
DOUBLE = new rw();
CAMOUFLAGE = new rw();
X = S();
G = EnumEntriesKt.enumEntries(X);
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

var5 = "Ì8õ¿\u001fû?e\u0010ódNiðÐ\u009cqdopýµ}i\u0003";
var7 = "Ì8õ¿\u001fû?e\u0010ódNiðÐ\u009cqdopýµ}i\u0003".length();
var4 = '\b';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
var10001 = 0;
}
}
}

public static void P(int var0) {
v = var0;
}

public static int G() {
return v;
}

public static int R() {
int var0 = G();

try {
return var0 == 0 ? 44 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
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
