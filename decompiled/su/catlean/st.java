package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum st {
public static final st REPEAT;
public static final st OFF;
public static final st NONE;
private static final st[] K;
private static final EnumEntries v;
private static _g[] F;

@NotNull
public static EnumEntries d() {
return v;
}

private static final st[] M() {
return new st[]{REPEAT, OFF, NONE};
}

static {
long var9 = yz.a(-2656821758572010543L, -2785104965501049143L, MethodHandles.lookup().lookupClass()).a(159000456412414L) ^ 93797480174662L;
if (vm.a<"Å">(-4429362287985085544L, var9) != null) {
vm.a<"Å">(new _g[3], -4414796607424525843L, var9);
}

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
String var5 = "(\\P\u0018S\u0099zÍ\b\u008c®QkZ9)\u0096\bRJÎÂÀo\u0083P";
int var7 = "(\\P\u0018S\u0099zÍ\b\u008c®QkZ9)\u0096\bRJÎÂÀo\u0083P".length();
char var4 = '\b';
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
REPEAT = new st();
OFF = new st();
NONE = new st();
K = M();
v = EnumEntriesKt.enumEntries(K);
return;
}

var4 = var5.charAt(var3);
}
}

public static void i(_g[] var0) {
F = var0;
}

public static _g[] L() {
return F;
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
