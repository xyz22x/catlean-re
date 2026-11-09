package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.PlayerListSizeEvent;
import su.catlean.gofra.Flow;

public final class qf extends _g {
@NotNull
public static final qf C;
private static final long a = yz.a(6612110598266433187L, -5962283146217009369L, MethodHandles.lookup().lookupClass()).a(266627686077058L);
private static final String b;

private qf(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 63719881663828L;
super(b, jt.d(), null, 4, null, var3);
}

@Flow
private final void o(PlayerListSizeEvent var1) {
var1.cancel();
}

static {
long var3 = a ^ 50510552909860L;
long var5 = var3 ^ 58509840973225L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("\u0012\u0089\u0091AýÌ\u008cÎ\u009b(6á*>a=".getBytes("ISO-8859-1"));
String var7 = b(var2).intern();
byte var10001 = -1;
b = var7;
C = new qf(var5);
}

private static String b(byte[] var0) {
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
