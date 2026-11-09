package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.jetbrains.annotations.NotNull;

public final class CatLeanKt {
@NotNull
public static final String K;
@NotNull
private static final ModContainer u;

@NotNull
public static final ModContainer y() {
return u;
}

static {
long var9 = yz.a(-2813126912829381979L, -1174520337878320957L, MethodHandles.lookup().lookupClass()).a(121828399357397L) ^ 66403820449893L;
Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[3];
int var6 = 0;
String var5 = "ã28ýmºz´\u0018d\u009a>¦Å\u001d»ÂT{=Ã\u0087\u0088\u0004º².gKß\u0089\u001c=\bã28ýmºz´";
int var7 = "ã28ýmºz´\u0018d\u009a>¦Å\u001d»ÂT{=Ã\u0087\u0088\u0004º².gKß\u0089\u001c=\bã28ýmºz´".length();
char var4 = '\b';
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var14 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var14;
if ((var3 += var4) >= var7) {
K = var0[0];
Object var12 = FabricLoader.getInstance().getModContainer(var0[2]).orElseThrow();
Intrinsics.checkNotNullExpressionValue(var12, var0[1]);
u = (ModContainer)var12;
return;
}

var4 = var5.charAt(var3);
}
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
