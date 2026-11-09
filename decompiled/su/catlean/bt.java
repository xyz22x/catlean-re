package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class bt {
private int J;
private static final long a = yz.a(3242951441362517114L, -8823181283307768657L, MethodHandles.lookup().lookupClass()).a(198596334574532L);
private static final long b;

public bt(int age) {
this.J = age;
}

public bt(long var1, int var3, int var4, DefaultConstructorMarker var5) {
var1 = a ^ var1;
if ((var4 & 1) != 0) {
var3 = (int)b;
}

this(var3);
}

public final int M() {
return this.J;
}

public final void j(int <set-?>) {
this.J = <set-?>;
}

public bt(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 55663659173475L;
this(var3, 0, 1, null);
}

static {
long var0 = a ^ 137365152972035L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -3760902851541398864L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var7 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var10001 = -1;
b = var7;
}
}
