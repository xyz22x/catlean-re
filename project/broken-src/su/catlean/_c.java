package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _c extends _d {
@NotNull
public static final _c o;
private static final long i = yz.a(-759289137490635207L, -8442851803711357492L, MethodHandles.lookup().lookupClass()).a(108679341349742L);
private static final String l;
private static final long O;

private _c(long var1) {
var1 = i ^ var1;
long var3 = var1 ^ 112840147166597L;
super(l, jt.Q(), var3);
}

@Flow
private final void T(PlayerUpdateEvent var1) {
long var2 = i ^ 91769781790107L;
int var4 = (int)((var2 ^ 48131890059899L) >>> 32);
int var5 = (int)((var2 ^ 48131890059899L) << 32 >>> 32);
long var10001 = var2 ^ 1589232921427L;
int var6 = (int)((var2 ^ 1589232921427L) >>> 48);
int var7 = (int)((var2 ^ 1589232921427L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
long var9 = var2 ^ 53067929445375L;
this.J(var4, dx.Y((char)var6, dx.K, this.Y(var9), w2.FOV, false, false, (int)O, var7, (char)var8, null), var5);
}

static {
long var8 = i ^ 132187818140202L;
long var10 = var8 ^ 31713963445173L;
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var8 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var8 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var7 = var5.doFinal("\u001fÌ\u0087ª¸Í\u008d+".getBytes("ISO-8859-1"));
String var14 = d(var7).intern();
byte var10001 = -1;
l = var14;
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var8 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var8 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -6823798321185593901L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var16 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
O = var16;
o = new _c(var10);
}

private static String d(byte[] var0) {
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
