package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;

public final class n1 {
@NotNull
private static final class_2960 X;
private static String b;

@NotNull
public static final class_2960 o() {
return X;
}

static {
long var9 = yz.a(2256221254648424753L, 4550385900885864279L, MethodHandles.lookup().lookupClass()).a(147232830067080L) ^ 2644265586697L;
long var11 = var9 ^ 122870750063192L;
if (vm.a<"Å">(-9184302892509960686L, var9) == null) {
vm.a<"Å">("NdmhB", -9103745371701381048L, var9);
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
String var5 = "Ù\u0088Ã\u0011@FóU\u0087uJâ\r<\b=ä&ãS&\u001f\nû\bGÔ\u009au\u008c¥\"ä";
int var7 = "Ù\u0088Ã\u0011@FóU\u0087uJâ\r<\b=ä&ãS&\u001f\nû\bGÔ\u009au\u008c¥\"ä".length();
char var4 = 24;
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var15 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var15;
if ((var3 += var4) >= var7) {
X = l6.J(var0[1], var0[0], var11);
return;
}

var4 = var5.charAt(var3);
}
}

public static void H(String var0) {
b = var0;
}

public static String m() {
return b;
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
