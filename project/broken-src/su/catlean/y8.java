package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum y8 {
public static final y8 DEFAULT;
public static final y8 LINES;
public static final y8 DOTS;
private static final y8[] n;
private static final EnumEntries J;
private static int[] q;

@NotNull
public static EnumEntries E() {
return J;
}

private static final y8[] N() {
return new y8[]{DEFAULT, LINES, DOTS};
}

static {
long var9 = yz.a(8815998564268878848L, 6904128356196001765L, MethodHandles.lookup().lookupClass()).a(8432005734363L) ^ 91042157120508L;
if (vm.a<"Å">(-3297509086702599760L, var9) == null) {
vm.a<"Å">(new int[5], -3227976704151434893L, var9);
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
String var5 = "Ù=k;\u0094C\u0012\u0001\b\t\u008dâ\u0089_¡\u000f#\bñçÇ/-~!ì";
int var7 = "Ù=k;\u0094C\u0012\u0001\b\t\u008dâ\u0089_¡\u000f#\bñçÇ/-~!ì".length();
char var4 = '\b';
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
DEFAULT = new y8();
LINES = new y8();
DOTS = new y8();
n = N();
J = EnumEntriesKt.enumEntries(n);
return;
}

var4 = var5.charAt(var3);
}
}

public static void j(int[] var0) {
q = var0;
}

public static int[] g() {
return q;
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
