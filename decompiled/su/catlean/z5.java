package su.catlean;

import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11280;
import org.jetbrains.annotations.NotNull;

public final class z5 {
@NotNull
public static final z5 B;
private static final int d;
@NotNull
private static final class_11280 r;
private static String[] S;

private z5() {
}

@NotNull
public final class_11280 R() {
return r;
}

static {
long var11 = yz.a(-2597813749890686459L, 1775514039369777723L, MethodHandles.lookup().lookupClass()).a(95751105397273L) ^ 37371531739072L;
if (vm.a<"Å">(-7456194211774630728L, var11) != null) {
vm.a<"Å">(new String[3], -7395238466470445480L, var11);
}

Cipher var8;
Cipher var10000 = var8 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var9 = 1; var9 < 8; var9++) {
var10003[var9] = (byte)(var11 << var9 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var10 = var8.doFinal("=À»¾bÌ\u0085kÙñº¢\u0099Þ\u00936,KAÕ\t\u0083.?".getBytes("ISO-8859-1"));
String var15 = a(var10).intern();
byte var10001 = -1;
String var7 = var15;
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var11 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -1360562010043607585L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var17 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
var10001 = -1;
long var0 = var17;
B = new z5();
d = new Std140SizeCalculator().putVec4().putFloat().putVec4().putVec4().putFloat().get();
r = new class_11280(var7, d, (int)var0);
}

public static void t(String[] var0) {
S = var0;
}

public static String[] z() {
return S;
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
