package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.LightMapUpdateEvent;
import su.catlean.gofra.Flow;

public final class k7 extends _g {
@NotNull
public static final k7 K;
private static final long a = yz.a(-9195525975579449357L, 4719443943078375094L, MethodHandles.lookup().lookupClass()).a(128320992531031L);
private static final String b;

private k7(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 25309013583409L;
super(b, jt.F(), null, 4, null, var3);
}

@Flow
private final void j(LightMapUpdateEvent var1) {
var1.cancel();
}

static {
long var3 = a ^ 113571029453303L;
long var5 = var3 ^ 89589044608799L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("%Ôø³§b\u0091\u0091çé\u0018?\u001c§?¹".getBytes("ISO-8859-1"));
String var7 = b(var2).intern();
byte var10001 = -1;
b = var7;
K = new k7(var5);
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
