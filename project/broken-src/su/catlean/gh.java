package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

enum gh {
public static final gh NONE;
public static final gh WHITE_LIST;
public static final gh BLACK_LIST;
private static final gh[] g;
private static final EnumEntries J;

@NotNull
public static EnumEntries f() {
return J;
}

private static final gh[] M() {
return new gh[]{NONE, WHITE_LIST, BLACK_LIST};
}

static {
long var9 = yz.a(-2156196764533259870L, 1043553272528788290L, MethodHandles.lookup().lookupClass()).a(40606834420834L) ^ 123396149231246L;
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
String var5 = "Î\u0092 Ôäá£¦ç/\u008f+e® µ\u0010µÓ\u00ad\n¶íÄ\u009d\u009f·ç\"\u0084>Ü\u0001\bF©¢K\u008e\u0097ÿÕ";
int var7 = "Î\u0092 Ôäá£¦ç/\u008f+e® µ\u0010µÓ\u00ad\n¶íÄ\u009d\u009f·ç\"\u0084>Ü\u0001\bF©¢K\u008e\u0097ÿÕ".length();
char var4 = 16;
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
NONE = new gh();
WHITE_LIST = new gh();
BLACK_LIST = new gh();
g = M();
J = EnumEntriesKt.enumEntries(g);
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
