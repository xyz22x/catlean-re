package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum gq {
public static final gq STRICT_STRAFE;
public static final gq MATRIX;
public static final gq NCP;
public static final gq GRIM_ENTITY;
public static final gq FIREWORK;
public static final gq OLD_MATRIX;
private static final gq[] E;
private static final EnumEntries s;
private static final long a = yz.a(-2003766743952275696L, 8788956032272094176L, MethodHandles.lookup().lookupClass()).a(183804323741146L);
private static final long b;

@NotNull
public static EnumEntries G() {
return s;
}

private static final gq[] N(long var0) {
var0 = a ^ var0;
gq[] var2 = new gq[(int)b];
var2[0] = STRICT_STRAFE;
var2[1] = MATRIX;
var2[2] = NCP;
var2[3] = GRIM_ENTITY;
var2[4] = FIREWORK;
var2[5] = OLD_MATRIX;
return var2;
}

static {
long var14 = a ^ 108815835749568L;
long var16 = var14 ^ 134493461081667L;
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
String var10 = "ê\u0011×\u0088\u0095M\n\u0097\bs\"Í¯gfæò\u0010Ê:ê\u008eòl\t¢\u0095ÿ\u0096õ\t¦¹X\u0010\u0089¯\u0088\u0081Xî|Ðw\u0000\u0010\u00adÀ\u0002«ç";
int var12 = "ê\u0011×\u0088\u0095M\n\u0097\bs\"Í¯gfæò\u0010Ê:ê\u008eòl\t¢\u0095ÿ\u0096õ\t¦¹X\u0010\u0089¯\u0088\u0081Xî|Ðw\u0000\u0010\u00adÀ\u0002«ç".length();
char var9 = '\b';
int var19 = -1;

label37:
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
long var2 = 6977424103892772639L;
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
b = var32;
STRICT_STRAFE = new gq();
MATRIX = new gq();
NCP = new gq();
GRIM_ENTITY = new gq();
FIREWORK = new gq();
OLD_MATRIX = new gq();
E = N(var16);
s = EnumEntriesKt.enumEntries(E);
return;
}

var9 = var10.charAt(var19);
break;
default:
var5[var11++] = var28;
if ((var19 += var9) < var12) {
var9 = var10.charAt(var19);
continue label37;
}

var10 = "pÍÓ\u0095-ád;!\rN/nAËÛ\u0010Ù\u0015\u0095)\u0087\u0084\u0084¬\u0098Tõ\u009a!%\u000bÔ";
var12 = "pÍÓ\u0095-ád;!\rN/nAËÛ\u0010Ù\u0015\u0095)\u0087\u0084\u0084¬\u0098Tõ\u009a!%\u000bÔ".length();
var9 = 16;
var19 = -1;
}

var20 = var10.substring(++var19, var19 + var9);
var10001 = 0;
}
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
