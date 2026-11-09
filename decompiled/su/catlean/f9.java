package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum f9 {
public static final f9 NORMAL;
public static final f9 SILENT;
public static final f9 INVENTORY_SILENT;
public static final f9 INVENTORY_NORMAL;
public static final f9 SILENT_FULL;
public static final f9 NORMAL_FULL;
private static int[] W;
private static final long a = yz.a(-2460490841605179726L, 3010727246982738471L, MethodHandles.lookup().lookupClass()).a(138189253279460L);
private static final long b;

@NotNull
public static EnumEntries V() {
return E;
}

static {
long var14 = a ^ 139451424496508L;
long var16 = var14 ^ 99371773543388L;
if (vm.a<"Å">(-5843468407400574527L, var14) == null) {
vm.a<"Å">(new int[2], -5883897451851502944L, var14);
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
String var10 = "àÉ\u0084\u009aÎ@7¯\u0018åf\u0081 ;\u0087\u0005s$`\t\"núâûf>ñàûm\u0007ý\u0010ÂÛkÿªQºo°¥Ô@¨\u000f\u0080Ó\u0018åf\u0081 ;\u0087\u0005sÆÇ\u0081snâî¹Ïúf|\u009d¹ø¥";
int var12 = "àÉ\u0084\u009aÎ@7¯\u0018åf\u0081 ;\u0087\u0005s$`\t\"núâûf>ñàûm\u0007ý\u0010ÂÛkÿªQºo°¥Ô@¨\u000f\u0080Ó\u0018åf\u0081 ;\u0087\u0005sÆÇ\u0081snâî¹Ïúf|\u009d¹ø¥"
.length();
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
long var2 = 1147271853331915866L;
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
NORMAL = new f9();
SILENT = new f9();
INVENTORY_SILENT = new f9();
INVENTORY_NORMAL = new f9();
SILENT_FULL = new f9();
NORMAL_FULL = new f9();
E = EnumEntriesKt.enumEntries(R);
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

var10 = "àØ\u008fihÊ\u0092ó\u0010\u0002\u0010(à-FÃ]\t[\u008fø6_¬\u0089";
var12 = "àØ\u008fihÊ\u0092ó\u0010\u0002\u0010(à-FÃ]\t[\u008fø6_¬\u0089".length();
var9 = '\b';
var19 = -1;
}

var20 = var10.substring(++var19, var19 + var9);
var10001 = 0;
}
}
}

public static void T(int[] var0) {
W = var0;
}

public static int[] N() {
return W;
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
