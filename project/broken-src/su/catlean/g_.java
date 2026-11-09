package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public final class g_ {
public static final int[] U;
private static int[] S;

static {
long var11 = yz.a(8812510347309605629L, -8638373890432316000L, MethodHandles.lookup().lookupClass()).a(12842099158326L) ^ 64580000981265L;
if (vm.a<"Å">(288612428818374819L, var11) != null) {
vm.a<"Å">(new int[5], 340905215072903697L, var11);
}

Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var11 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var0 = new long[6];
int var4 = 0;
String var5 = "ê]qI¶¿VÔÙ\u000e\u008búÆ\u0097²Ê5Z\u0092%xyíµÜ¶îÚV\u009dØX";
int var6 = "ê]qI¶¿VÔÙ\u000e\u008búÆ\u0097²Ê5Z\u0092%xyíµÜ¶îÚV\u009dØX".length();
byte var3 = 0;

label97:
while (true) {
int var10001 = var3;
var3 += 8;
byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
long[] var27 = var0;
var10001 = var4++;
long var30 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var32 = -1;

while (true) {
long var8 = var30;
byte[] var10 = var1.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var34 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var32) {
case 0:
var27[var10001] = var34;
if (var3 >= var6) {
int[] var13 = new int[df.values().length];

try {
var13[df.Default.ordinal()] = 1;
} catch (NoSuchFieldError var25) {
}

try {
var13[df.Bonk.ordinal()] = 2;
} catch (NoSuchFieldError var24) {
}

try {
var13[df.Rubber.ordinal()] = 3;
} catch (NoSuchFieldError var23) {
}

try {
var13[df.Flip.ordinal()] = 4;
} catch (NoSuchFieldError var22) {
}

try {
var13[df.Snap.ordinal()] = 5;
} catch (NoSuchFieldError var21) {
}

try {
var13[df.Hook.ordinal()] = (int)var0[4];
} catch (NoSuchFieldError var20) {
}

try {
var13[df.Swipe.ordinal()] = (int)var0[3];
} catch (NoSuchFieldError var19) {
}

try {
var13[df.Tap.ordinal()] = (int)var0[1];
} catch (NoSuchFieldError var18) {
}

try {
var13[df.Inject.ordinal()] = (int)var0[2];
} catch (NoSuchFieldError var17) {
}

try {
var13[df.Slap.ordinal()] = (int)var0[5];
} catch (NoSuchFieldError var16) {
}

try {
var13[df.Akrien.ordinal()] = (int)var0[0];
} catch (NoSuchFieldError var15) {
}

U = var13;
return;
}
break;
default:
var27[var10001] = var34;
if (var3 < var6) {
continue label97;
}

var5 = "\u0010\u00833@7ók\u000b\u0017Õö]ZCê\u0004";
var6 = "\u0010\u00833@7ók\u000b\u0017Õö]ZCê\u0004".length();
var3 = 0;
}

byte var29 = var3;
var3 += 8;
var7 = var5.substring(var29, var3).getBytes("ISO-8859-1");
var27 = var0;
var10001 = var4++;
var30 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var32 = 0;
}
}
}

public static void h(int[] var0) {
S = var0;
}

public static int[] M() {
return S;
}
}
