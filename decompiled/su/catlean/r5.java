package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;

public final class r5 {
private static int[] b;
private static final long a = yz.a(-8951303050468135118L, 8625399071338096972L, MethodHandles.lookup().lookupClass()).a(133516138501493L);
private static final String c;

@NotNull
public static final String D(long a, @NotNull class_2561 $this$toLegacy) {
ax = a ^ ax;
long var3 = ax ^ 98416203623553L;
Intrinsics.checkNotNullParameter($this$toLegacy, c);
return mi.B.X($this$toLegacy, var3);
}

public static void X(int[] var0) {
b = var0;
}

public static int[] t() {
return b;
}

static {
long var3 = a ^ 89384224115998L;
if (vm.a<"Å">(4507464497600228805L, var3) == null) {
vm.a<"Å">(new int[3], 4548436355922991499L, var3);
}

Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("^\u001bÀdûDW\u0097".getBytes("ISO-8859-1"));
String var5 = a(var2).intern();
byte var10001 = -1;
c = var5;
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
