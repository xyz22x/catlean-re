package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum af {
public static final af DEFAULT;
public static final af MATRIX;
public static final af MATRIX_2;
public static final af WATER_BUCKET;
public static final af FT_FENCE;
private static final af[] p;
private static final EnumEntries u;
private static String[] E;

@NotNull
public static EnumEntries F() {
return u;
}

private static final af[] c() {
return new af[]{DEFAULT, MATRIX, MATRIX_2, WATER_BUCKET, FT_FENCE};
}

static {
long var9 = yz.a(-5939860606891966860L, 91943142864566276L, MethodHandles.lookup().lookupClass()).a(32225959345879L) ^ 85434103527433L;
if (vm.a<"Å">(-7612687952487564635L, var9) == null) {
vm.a<"Å">(new String[2], -7599056912821452240L, var9);
}

Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[5];
int var6 = 0;
String var5 = "\u0097\n1®Èß\u009fiÿÓ¹Wú\u0002ùW\u0010Ë'¼\u0082ëæ\u0091ùT\u008e\u001c£\u0005°Ác\b\u0094tþ¹1Ï\u0001,";
int var7 = "\u0097\n1®Èß\u009fiÿÓ¹Wú\u0002ùW\u0010Ë'¼\u0082ëæ\u0091ùT\u008e\u001c£\u0005°Ác\b\u0094tþ¹1Ï\u0001,".length();
char var4 = 16;
int var12 = -1;

label32:
while (true) {
String var13 = var5.substring(++var12, var12 + var4);
byte var10001 = -1;

while (true) {
byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var8).intern();
switch (var10001) {
case 0:
var0[var6++] = var19;
if ((var12 += var4) >= var7) {
DEFAULT = new af();
MATRIX = new af();
MATRIX_2 = new af();
WATER_BUCKET = new af();
FT_FENCE = new af();
p = c();
u = EnumEntriesKt.enumEntries(p);
return;
}

var4 = var5.charAt(var12);
break;
default:
var0[var6++] = var19;
if ((var12 += var4) < var7) {
var4 = var5.charAt(var12);
continue label32;
}

var5 = "\bZ\u0017e?(GÍ\u0010\u001cÒæ®U;®M\u0083`Ið§\u0099Çç";
var7 = "\bZ\u0017e?(GÍ\u0010\u001cÒæ®U;®M\u0083`Ið§\u0099Çç".length();
var4 = '\b';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
var10001 = 0;
}
}
}

public static void T(String[] var0) {
E = var0;
}

public static String[] R() {
return E;
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
