package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _4 extends _d {
@NotNull
public static final _4 l;
private static final long i = yz.a(8483872058818725846L, -6435918021674741058L, MethodHandles.lookup().lookupClass()).a(49829903838760L);
private static final String o;

private _4(long var1) {
var1 = i ^ var1;
long var3 = var1 ^ 4738147213897L;
super(o, jt.n(), var3);
}

@Flow
private final void a(PlayerUpdateEvent var1) {
long var2 = i ^ 8337758205231L;
int var4 = (int)((var2 ^ 78802197779788L) >>> 32);
int var5 = (int)((var2 ^ 78802197779788L) << 32 >>> 32);
long var6 = var2 ^ 32951491083350L;
this.J(var4, (class_1657)zf.v(var6), var5);
}

static {
long var3 = i ^ 112512926829860L;
long var5 = var3 ^ 105919699084151L;
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var3 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var3 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
byte[] var2 = var0.doFinal("Î7¬\u0092Ý\b©Ô\u0014C\u008aµ=÷3È".getBytes("ISO-8859-1"));
String var7 = d(var2).intern();
byte var10001 = -1;
o = var7;
l = new _4(var5);
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
