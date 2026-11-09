package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum dz {
@NotNull
private final jr C;
public static final dz FIRE_WORK;
public static final dz BOOST;
public static final dz CONTROL;
public static final dz INFINITE;
public static final dz PACKET;
public static final dz SILENT_FIRE_WORK;
private static final dz[] r;
private static final EnumEntries D;
private static final long a = yz.a(-7743637682022269349L, -4965175275003478585L, MethodHandles.lookup().lookupClass()).a(31003046970029L);
private static final long b;

private dz(jr var3) {
this.C = var3;
}

@NotNull
public final jr Y() {
return this.C;
}

@NotNull
public static EnumEntries z() {
return D;
}

private static final dz[] f(long var0) {
var0 = a ^ var0;
dz[] var2 = new dz[(int)b];
var2[0] = FIRE_WORK;
var2[1] = BOOST;
var2[2] = CONTROL;
var2[3] = INFINITE;
var2[4] = PACKET;
var2[5] = SILENT_FIRE_WORK;
return var2;
}

static {
long var14 = a ^ 94637348281511L;
long var16 = var14 ^ 123608319440499L;
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
String var10 = "\u001aHRäGÜ:\u0003\u0010üØ\u00035H¿·Î\u00adXë8JÆ\u0004ñ\u0010#ò\u0099år\u0087@4û ID|ì\u0088ü\u0018\u009aÒ\n\fV³æ\u0098÷Ñ8\nùÈ0Âgí~¯A\u0019ov";
int var12 = "\u001aHRäGÜ:\u0003\u0010üØ\u00035H¿·Î\u00adXë8JÆ\u0004ñ\u0010#ò\u0099år\u0087@4û ID|ì\u0088ü\u0018\u009aÒ\n\fV³æ\u0098÷Ñ8\nùÈ0Âgí~¯A\u0019ov"
.length();
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
long var2 = -3846383075834793118L;
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
FIRE_WORK = new dz(m1.L);
BOOST = new dz(pu.Q);
CONTROL = new dz(sn.w);
INFINITE = new dz(l3.l);
PACKET = new dz(tx.o);
SILENT_FIRE_WORK = new dz(f1.x);
r = f(var16);
D = EnumEntriesKt.enumEntries(r);
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

var10 = "\t\u0084\u009c\u001cUJ\u0087¥\b\u00856 %ª²+\u0004";
var12 = "\t\u0084\u009c\u001cUJ\u0087¥\b\u00856 %ª²+\u0004".length();
var9 = '\b';
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
