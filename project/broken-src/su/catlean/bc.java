package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum bc {
public static final bc CENTER;
public static final bc LEFT;
private static final bc[] a;
private static final EnumEntries R;
private static int q;

@NotNull
public static EnumEntries C() {
return R;
}

private static final bc[] P() {
return new bc[]{CENTER, LEFT};
}

static {
long var9 = yz.a(4032788424236711666L, -3719495614645525276L, MethodHandles.lookup().lookupClass()).a(173556589701170L) ^ 64488133916612L;
if (vm.a<"Å">(6984926248146344626L, var9) != 0) {
vm.a<"Å">(31, 6963120707720462864L, var9);
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
String var5 = "\u0013¿\u000b&¦L\u008c\u001a\b§L9?£¤¤\u0083";
int var7 = "\u0013¿\u000b&¦L\u008c\u001a\b§L9?£¤¤\u0083".length();
char var4 = '\b';
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
CENTER = new bc();
LEFT = new bc();
a = P();
R = EnumEntriesKt.enumEntries(a);
return;
}

var4 = var5.charAt(var3);
}
}

public static void y(int var0) {
q = var0;
}

public static int b() {
return q;
}

public static int x() {
int var0 = b();

try {
return var0 == 0 ? 60 : 0;
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
