package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;

final class x implements Runnable {
public static final x T;
private static final long a = yz.a(1437604419555595558L, 8539370777938963589L, MethodHandles.lookup().lookupClass()).a(26819831194817L);
private static final long b;

@Override
public final void run() {
long var1 = a ^ 43127506335385L;
long var3 = var1 ^ 63884308527647L;
long var5 = var1 ^ 55522468719253L;
ag.K(class_1268.field_5808, 0.0F, var3, 0.0F, (int)b, null);
zf.v(var5).method_6104(class_1268.field_5808);
e7.M().l();
}

static {
long var0 = a ^ 114340359284615L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -1495713910619522761L;
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
T = new x();
}
}
