package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2824;
import org.jetbrains.annotations.NotNull;
import su.catlean.mixins.accessors.ServerboundInteractPacketAccessor;

public final class t0 {
private static _g[] X;
private static final long a = yz.a(6620207715319971561L, -6228618399305279641L, MethodHandles.lookup().lookupClass()).a(97101883332843L);
private static final String b;

public static final void x(short a, @NotNull class_2824 $this$setEntityId, long a, int id) {
long var5 = ((long)ax << 48 | axx << 16 >>> 16) ^ a;
_g[] var10000 = vm.a<"Å">(6311463154675973129L, var5);
Intrinsics.checkNotNullParameter($this$setEntityId, b);
_g[] var7 = var10000;

try {
((ServerboundInteractPacketAccessor)$this$setEntityId).setEntityId(id);
if (var7 == null) {
vm.a<"Å">(new _g[3], 6276572240414072103L, var5);
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, 6317417237275615736L, var5);
}
}

public static void o(_g[] var0) {
X = var0;
}

public static _g[] X() {
return X;
}

static {
long var3 = a ^ 18950716089014L;
if (vm.a<"Å">(2280718806110712889L, var3) == null) {
vm.a<"Å">(new _g[2], 2248467155167855840L, var3);
}

Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("ö»Q\u0010UGÛ+".getBytes("ISO-8859-1"));
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
