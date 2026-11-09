package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum wa {
public static final wa AUTO;
public static final wa ALL;
private static final wa[] t;
private static final EnumEntries u;
private static boolean F;

@NotNull
public static EnumEntries r() {
return u;
}

private static final wa[] f() {
return new wa[]{AUTO, ALL};
}

static {
long var9 = yz.a(8297554724617641741L, -6004046721809987967L, MethodHandles.lookup().lookupClass()).a(111407080355946L) ^ 124618480722733L;
if (!vm.a<"Å">(-6921408823236039489L, var9)) {
vm.a<"Å">(true, -6953071281635062214L, var9);
}

Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[2];
int var6 = 0;
String var5 = "9\u0017\u001f6ñ\u0001\u009d\u0087\bÚ«rÀä\u0081mm";
int var7 = "9\u0017\u001f6ñ\u0001\u009d\u0087\bÚ«rÀä\u0081mm".length();
char var4 = '\b';
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
AUTO = new wa();
ALL = new wa();
t = f();
u = EnumEntriesKt.enumEntries(t);
return;
}

var4 = var5.charAt(var3);
}
}

public static void d(boolean var0) {
F = var0;
}

public static boolean W() {
return F;
}

public static boolean R() {
boolean var0 = W();

try {
return !var0;
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
