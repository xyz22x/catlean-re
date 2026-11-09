package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum su {
public static final su NONE;
public static final su DISABLE_CLICKS;
public static final su STRICT_NCP;
public static final su STRICT_NCP_2;
public static final su MATRIX_NCP;
public static final su LEGIT;
private static final su[] g;
private static final EnumEntries P;
private static int[] b;
private static final long a = yz.a(-4406643182448525154L, 6278846469353377371L, MethodHandles.lookup().lookupClass()).a(259725957479237L);
private static final long c;

@NotNull
public static EnumEntries z() {
return P;
}

private static final su[] O(long var0) {
var0 = a ^ var0;
su[] var2 = new su[(int)c];
var2[0] = NONE;
var2[1] = DISABLE_CLICKS;
var2[2] = STRICT_NCP;
var2[3] = STRICT_NCP_2;
var2[4] = MATRIX_NCP;
var2[5] = LEGIT;
return var2;
}

static {
long var14 = a ^ 128218432040569L;
long var16 = var14 ^ 102157191394961L;
if (vm.a<"Å">(-236722848395895894L, var14) == null) {
vm.a<"Å">(new int[1], -247769395615672536L, var14);
}

Cipher var6;
Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var7 = 1; var7 < 8; var7++) {
var10003[var7] = (byte)(var14 << var7 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var5 = new String[6];
int var11 = 0;
String var10 = "\f\u008eI/«Ê\u009f7\u0010\u0003{\u001d$=&TõÖ@â¥¬ä\u001bì\u0010Z\u0019ò¹þ\u0012²cI¬ýÍøà=ï\u0010\u0003{\u001d$=&Tõ\u0097ÞN^\u0094ºîÎ";
int var12 = "\f\u008eI/«Ê\u009f7\u0010\u0003{\u001d$=&TõÖ@â¥¬ä\u001bì\u0010Z\u0019ò¹þ\u0012²cI¬ýÍøà=ï\u0010\u0003{\u001d$=&Tõ\u0097ÞN^\u0094ºîÎ".length();
char var9 = '\b';
int var19 = -1;

label41:
while (true) {
String var20 = var10.substring(++var19, var19 + var9);
byte var10001 = -1;

while (true) {
byte[] var13 = var6.doFinal(var20.getBytes("ISO-8859-1"));
String var28 = a(var13).intern();
switch (var10001) {
case 0:
var5[var11++] = var28;
if ((var19 += var9) >= var12) {
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 5281545409517828338L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var32 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
c = var32;
NONE = new su();
DISABLE_CLICKS = new su();
STRICT_NCP = new su();
STRICT_NCP_2 = new su();
MATRIX_NCP = new su();
LEGIT = new su();
g = O(var16);
P = EnumEntriesKt.enumEntries(g);
return;
}

var9 = var10.charAt(var19);
break;
default:
var5[var11++] = var28;
if ((var19 += var9) < var12) {
var9 = var10.charAt(var19);
continue label41;
}

var10 = "Åk=Òa\u009cA4}°ã\u008c\u0001X:y\býÆ\u008eåQHðÎ";
var12 = "Åk=Òa\u009cA4}°ã\u008c\u0001X:y\býÆ\u008eåQHðÎ".length();
var9 = 16;
var19 = -1;
}

var20 = var10.substring(++var19, var19 + var9);
var10001 = 0;
}
}
}

public static void e(int[] var0) {
b = var0;
}

public static int[] u() {
return b;
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
