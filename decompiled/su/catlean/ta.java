package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

enum ta {
public static final ta NONE;
public static final ta WHITE_LIST;
public static final ta BLACK_LIST;
private static final ta[] x;
private static final EnumEntries C;

@NotNull
public static EnumEntries H() {
return C;
}

private static final ta[] p() {
return new ta[]{NONE, WHITE_LIST, BLACK_LIST};
}

static {
long var9 = yz.a(-2256986737403996747L, -9071631990665175722L, MethodHandles.lookup().lookupClass()).a(243234246589586L) ^ 62566612012256L;
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
String var5 = "y2\u0094üÍäH§mÖùÙÂ\u007fIC\b]\u0089\u0081\u0081»y\u00894\u0010\u009e¬t¸á#þÑÝ¸´=}(@'";
int var7 = "y2\u0094üÍäH§mÖùÙÂ\u007fIC\b]\u0089\u0081\u0081»y\u00894\u0010\u009e¬t¸á#þÑÝ¸´=}(@'".length();
char var4 = 16;
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
NONE = new ta();
WHITE_LIST = new ta();
BLACK_LIST = new ta();
x = p();
C = EnumEntriesKt.enumEntries(x);
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
