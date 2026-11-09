package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.IPasteable;

public final class ts {
private static String H;
private static final long a = yz.a(-4332792662564074818L, 8009182429647770983L, MethodHandles.lookup().lookupClass()).a(243791059165854L);
private static final String b;

public static final void l(@NotNull IPasteable $this$hooks, long a) {
ax = a ^ ax;
String var10000 = vm.a<"Å">(1811870809382217748L, ax);
Intrinsics.checkNotNullParameter($this$hooks, b);
String var3 = var10000;

try {
Runtime.getRuntime().addShutdownHook(new m9());
if (var3 == null) {
vm.a<"Å">(new _g[5], 1846716677247538077L, ax);
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, 1845335138928816445L, ax);
}
}

public static void j(String var0) {
H = var0;
}

public static String R() {
return H;
}

static {
long var3 = a ^ 8190226764401L;
if (vm.a<"Å">(6122783737849259465L, var3) == null) {
vm.a<"Å">("mUTaRb", 6080580890759503779L, var3);
}

Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("Äø\u0086\u009b\"h\u009a\u0091".getBytes("ISO-8859-1"));
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
