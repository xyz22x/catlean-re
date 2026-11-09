package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum px {
public static final px CLIENT;
public static final px SERVER;
public static final px PREDICT;
private static final px[] l;
private static final EnumEntries X;
private static int b;

@NotNull
public static EnumEntries K() {
return X;
}

private static final px[] d() {
return new px[]{CLIENT, SERVER, PREDICT};
}

static {
long var9 = yz.a(-215940243364797820L, -2928266778495009530L, MethodHandles.lookup().lookupClass()).a(8704444188403L) ^ 37778945394487L;
if (vm.a<"Å">(1893469200383856058L, var9) != 0) {
vm.a<"Å">(29, 1909622180299921719L, var9);
}

Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[3];
int var6 = 0;
String var5 = "®A×QæÂ\u00ad£\bQ=\fÆQyj£\b\u008f\u0090tá«zÓ\u0005";
int var7 = "®A×QæÂ\u00ad£\bQ=\fÆQyj£\b\u008f\u0090tá«zÓ\u0005".length();
char var4 = '\b';
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
CLIENT = new px();
SERVER = new px();
PREDICT = new px();
l = d();
X = EnumEntriesKt.enumEntries(l);
return;
}

var4 = var5.charAt(var3);
}
}

public static void n(int var0) {
b = var0;
}

public static int g() {
return b;
}

public static int n() {
int var0 = g();

try {
return var0 == 0 ? 110 : 0;
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
