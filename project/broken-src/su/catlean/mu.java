package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public final class mu {
public static final int[] T;

static {
long var11 = yz.a(-5799819934080933809L, 8268067155742603775L, MethodHandles.lookup().lookupClass()).a(189016999667405L) ^ 4265537606034L;
Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var11 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[4];
int var4 = 0;
String var5 = "è0a\u009b \f\u0091á}\u00137»£\u008cÑª";
int var6 = "è0a\u009b \f\u0091á}\u00137»£\u008cÑª".length();
byte var3 = 0;

label81:
while (true) {
int var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
long[] var25 = var0;
var10001 = var4++;
long var28 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var30 = -1;

while (true) {
long var8 = var28;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var32 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var30) {
case 0:
var25[var10001] = var32;
if (var3 >= var6) {
int[] var13 = new int[og.values().length];

try {
var13[og.Static.ordinal()] = 1;
} catch (NoSuchFieldError var23) {
}

try {
var13[og.Decrease.ordinal()] = 2;
} catch (NoSuchFieldError var22) {
}

try {
var13[og.Fade.ordinal()] = 3;
} catch (NoSuchFieldError var21) {
}

try {
var13[og.FILL.ordinal()] = 4;
} catch (NoSuchFieldError var20) {
}

try {
var13[og.Flash.ordinal()] = 5;
} catch (NoSuchFieldError var19) {
}

try {
var13[og.Grow.ordinal()] = (int)var0[0];
} catch (NoSuchFieldError var18) {
}

try {
var13[og.TNT.ordinal()] = (int)var0[1];
} catch (NoSuchFieldError var17) {
}

try {
var13[og.Pull.ordinal()] = (int)var0[3];
} catch (NoSuchFieldError var16) {
}

try {
var13[og.Hover.ordinal()] = (int)var0[2];
} catch (NoSuchFieldError var15) {
}

T = var13;
return;
}
break;
default:
var25[var10001] = var32;
if (var3 < var6) {
continue label81;
}

var5 = "¯\u0091\u0087\u009d=\u000eiQ\u0006ÍæÝL©Ù\u0089";
var6 = "¯\u0091\u0087\u009d=\u000eiQ\u0006ÍæÝL©Ù\u0089".length();
var3 = 0;
}

byte var27 = var3;
var3 += 8;
var7 = var5.substring(var27, var3).getBytes("ISO-8859-1");
var25 = var0;
var10001 = var4++;
var28 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var30 = 0;
}
}
}
}
