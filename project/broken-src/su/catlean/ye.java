package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class ye {
private static int e;
private static final long a = yz.a(-1036912924419414533L, -4055579241957218084L, MethodHandles.lookup().lookupClass()).a(232147425670404L);
private static final String b;

private ye() {
}

@NotNull
public final _w I(@NotNull class_243 vector, long a) {
ax = a ^ ax;
long var4 = ax ^ 15715521929867L;
Intrinsics.checkNotNullParameter(vector, b);
return _8.P.P(vector, var4);
}

public ye(DefaultConstructorMarker $constructor_marker) {
this();
}

public static void c(int var0) {
e = var0;
}

public static int y() {
return e;
}

public static int g() {
int var0 = y();

try {
return var0 == 0 ? 13 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var3 = a ^ 7794521134129L;
if (vm.a<"Å">(8617547426508521861L, var3) == 0) {
vm.a<"Å">(28, 8576904310713583269L, var3);
}

Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("¼ú\t§ÓR_)".getBytes("ISO-8859-1"));
String var5 = a(var2).intern();
byte var10001 = -1;
b = var5;
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
