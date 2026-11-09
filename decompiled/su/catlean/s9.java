package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum s9 {
public static final s9 OFF;
public static final s9 COMETS;
public static final s9 SELECTION;
public static final s9 BLOOM_CIRCLE;
private static final s9[] r;
private static final EnumEntries D;
private static String[] F;

@NotNull
public static EnumEntries K() {
return D;
}

private static final s9[] q() {
return new s9[]{OFF, COMETS, SELECTION, BLOOM_CIRCLE};
}

static {
long var9 = yz.a(-8757791319968255937L, -8215806995277794035L, MethodHandles.lookup().lookupClass()).a(51276432287758L) ^ 48721193389081L;
if (vm.a<"Å">(5010085600819078305L, var9) != null) {
vm.a<"Å">(new String[4], 4998235497353153942L, var9);
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
String var5 = ":¯\u001a\u001b°\u0004\u0091Ë\u0010\fl0ñ¿\u009c\u009c\u0010\u0086]n{³Å.¼";
int var7 = ":¯\u001a\u001b°\u0004\u0091Ë\u0010\fl0ñ¿\u009c\u009c\u0010\u0086]n{³Å.¼".length();
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
OFF = new s9();
COMETS = new s9();
SELECTION = new s9();
BLOOM_CIRCLE = new s9();
r = q();
D = EnumEntriesKt.enumEntries(r);
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

var5 = "?ó 7\u0085\\¾Õ£\u000bÕ\u009cd.¦î\bÔ¹Tô}\u0086ÿX";
var7 = "?ó 7\u0085\\¾Õ£\u000bÕ\u009cd.¦î\bÔ¹Tô}\u0086ÿX".length();
var4 = 16;
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
var10001 = 0;
}
}
}

public static void D(String[] var0) {
F = var0;
}

public static String[] g() {
return F;
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
