package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public final class dy {
@NotNull
public static final dy u;
public static final int A;
public static final int m;
public static final int w;
public static final int i;
public static final int v;
public static final int G = 0;

private dy() {
}

static {
long var1 = yz.a(6115731909346166342L, -2224935160261448626L, MethodHandles.lookup().lookupClass()).a(191397439557427L) ^ 31136701203871L;
Cipher var3;
Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var1 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var4 = 1; var4 < 8; var4++) {
var10003[var4] = (byte)(var1 << var4 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[5];
int var6 = 0;
String var7 = "&\u0003¤SKÁ\u0014ªYókÌ¢mþ\u0083U\u009c6\u0090\u009cÎÇ~";
int var8 = "&\u0003¤SKÁ\u0014ªYókÌ¢mþ\u0083U\u009c6\u0090\u009cÎÇ~".length();
byte var5 = 0;

label23:
while (true) {
int var10001 = var5;
var5 += 8;
byte[] var9 = var7.substring(var10001, var5).getBytes("ISO-8859-1");
long[] var14 = var0;
var10001 = var6++;
long var17 = (var9[0] & 255L) << 56
| (var9[1] & 255L) << 48
| (var9[2] & 255L) << 40
| (var9[3] & 255L) << 32
| (var9[4] & 255L) << 24
| (var9[5] & 255L) << 16
| (var9[6] & 255L) << 8
| var9[7] & 255L;
byte var19 = -1;

while (true) {
long var10 = var17;
byte[] var12 = var3.doFinal(
new byte[]{
(byte)(var10 >>> 56),
(byte)(var10 >>> 48),
(byte)(var10 >>> 40),
(byte)(var10 >>> 32),
(byte)(var10 >>> 24),
(byte)(var10 >>> 16),
(byte)(var10 >>> 8),
(byte)var10
}
);
long var21 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
switch (var19) {
case 0:
var14[var10001] = var21;
if (var5 >= var8) {
i = (int)var0[0];
v = (int)var0[4];
m = (int)var0[2];
w = (int)var0[1];
A = (int)var0[3];
u = new dy();
return;
}
break;
default:
var14[var10001] = var21;
if (var5 < var8) {
continue label23;
}

var7 = "xk»\u00ad\fà\u008f\u0010\u0097·o(×g»x";
var8 = "xk»\u00ad\fà\u008f\u0010\u0097·o(×g»x".length();
var5 = 0;
}

byte var16 = var5;
var5 += 8;
var9 = var7.substring(var16, var5).getBytes("ISO-8859-1");
var14 = var0;
var10001 = var6++;
var17 = (var9[0] & 255L) << 56
| (var9[1] & 255L) << 48
| (var9[2] & 255L) << 40
| (var9[3] & 255L) << 32
| (var9[4] & 255L) << 24
| (var9[5] & 255L) << 16
| (var9[6] & 255L) << 8
| var9[7] & 255L;
var19 = 0;
}
}
}
}
