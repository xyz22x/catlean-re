package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2350;

// $VF: synthetic class
public final class wg {
public static final int[] C;
private static String[] A;

static {
long var7 = yz.a(9147116390576385902L, -5277438541826152537L, MethodHandles.lookup().lookupClass()).a(56722648314282L) ^ 101877046404411L;
if (vm.a<"Å">(117706238553703395L, var7) == null) {
vm.a<"Å">(new String[1], 113476021589286192L, var7);
}

Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var7 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var7 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -2748526503713696466L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var17 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var10001 = -1;
long var0 = var17;
int[] var9 = new int[class_2350.values().length];

try {
var9[class_2350.field_11043.ordinal()] = 1;
} catch (NoSuchFieldError var16) {
}

try {
var9[class_2350.field_11035.ordinal()] = 2;
} catch (NoSuchFieldError var15) {
}

try {
var9[class_2350.field_11034.ordinal()] = 3;
} catch (NoSuchFieldError var14) {
}

try {
var9[class_2350.field_11039.ordinal()] = 4;
} catch (NoSuchFieldError var13) {
}

try {
var9[class_2350.field_11036.ordinal()] = 5;
} catch (NoSuchFieldError var12) {
}

try {
var9[class_2350.field_11033.ordinal()] = (int)var0;
} catch (NoSuchFieldError var11) {
}

C = var9;
}

public static void P(String[] var0) {
A = var0;
}

public static String[] L() {
return A;
}
}
