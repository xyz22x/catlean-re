package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum i5 {
public static final i5 DolphinGrace;
public static final i5 Vanilla;
public static final i5 Legit;
private static final i5[] n;
private static final EnumEntries I;
private static int[] w;

@NotNull
public static EnumEntries o() {
return I;
}

private static final i5[] f() {
return new i5[]{DolphinGrace, Vanilla, Legit};
}

static {
long var9 = yz.a(6216400581323690239L, -3266457304470007553L, MethodHandles.lookup().lookupClass()).a(240451194362858L) ^ 109132107185908L;
if (vm.a<"Å">(2190562635843526471L, var9) == null) {
vm.a<"Å">(new int[3], 2258055406001250121L, var9);
}

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
String var5 = "x\u0011\u0099Ö\u0081Leóö\u0086\u00992\tÈO\u001e\b\u009aÎâèðË0Z\bi\u0015ðÇ\r\u0097\u0016¨";
int var7 = "x\u0011\u0099Ö\u0081Leóö\u0086\u00992\tÈO\u001e\b\u009aÎâèðË0Z\bi\u0015ðÇ\r\u0097\u0016¨".length();
char var4 = 16;
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
DolphinGrace = new i5();
Vanilla = new i5();
Legit = new i5();
n = f();
I = EnumEntriesKt.enumEntries(n);
return;
}

var4 = var5.charAt(var3);
}
}

public static void o(int[] var0) {
w = var0;
}

public static int[] k() {
return w;
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
