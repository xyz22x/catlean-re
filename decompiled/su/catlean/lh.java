package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum lh {
public static final lh Rubberband;
public static final lh Items;
public static final lh MatrixOffGround;
public static final lh Vanilla;
public static final lh GrimOld;
public static final lh GRIM_NEW;
private static final lh[] X;
private static final EnumEntries r;
private static String g;
private static final long a = yz.a(4021310861868705062L, -4192194598425580617L, MethodHandles.lookup().lookupClass()).a(123105220857966L);
private static final long b;

@NotNull
public static EnumEntries B() {
return r;
}

private static final lh[] a(char var0, long var1) {
long var3 = ((long)var0 << 48 | var1 << 16 >>> 16) ^ a;
lh[] var5 = new lh[(int)b];
var5[0] = Rubberband;
var5[1] = Items;
var5[2] = MatrixOffGround;
var5[3] = Vanilla;
var5[4] = GrimOld;
var5[5] = GRIM_NEW;
return var5;
}

static {
long var14 = a ^ 62058228819542L;
int var16 = (int)((var14 ^ 39084053381842L) >>> 48);
long var17 = (var14 ^ 39084053381842L) << 16 >>> 16;
if (vm.a<"Å">(-6564526584814979091L, var14) == null) {
vm.a<"Å">("xTEolc", -6599745310139158330L, var14);
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
String var10 = "FIK\u000f)¾ýÉ²ïa\u008c+\u001cN½\b\u008aÌ±¤DÇ5ò\bÐ\u0099ÚÍi nL\u0010¤=\u001d\u0019Rf\u0091\u0005-B\u0007àñ÷\u0019.";
int var12 = "FIK\u000f)¾ýÉ²ïa\u008c+\u001cN½\b\u008aÌ±¤DÇ5ò\bÐ\u0099ÚÍi nL\u0010¤=\u001d\u0019Rf\u0091\u0005-B\u0007àñ÷\u0019.".length();
char var9 = 16;
int var20 = -1;

label41:
while (true) {
String var21 = var10.substring(++var20, var20 + var9);
byte var10001 = -1;

while (true) {
byte[] var13 = var6.doFinal(var21.getBytes("ISO-8859-1"));
String var29 = a(var13).intern();
switch (var10001) {
case 0:
var5[var11++] = var29;
if ((var20 += var9) >= var12) {
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -922811668978151865L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var33 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
b = var33;
Rubberband = new lh();
Items = new lh();
MatrixOffGround = new lh();
Vanilla = new lh();
GrimOld = new lh();
GRIM_NEW = new lh();
X = a((char)var16, var17);
r = EnumEntriesKt.enumEntries(X);
return;
}

var9 = var10.charAt(var20);
break;
default:
var5[var11++] = var29;
if ((var20 += var9) < var12) {
var9 = var10.charAt(var20);
continue label41;
}

var10 = "0\u001b,A]\u0093¦r\u0010\u008d³®ÛÎ\u008d1[Êô«¬\u0087dÜq";
var12 = "0\u001b,A]\u0093¦r\u0010\u008d³®ÛÎ\u008d1[Êô«¬\u0087dÜq".length();
var9 = '\b';
var20 = -1;
}

var21 = var10.substring(++var20, var20 + var9);
var10001 = 0;
}
}
}

public static void K(String var0) {
g = var0;
}

public static String F() {
return g;
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
