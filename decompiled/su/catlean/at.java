package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum at {
public static final at ON;
public static final at ANONYMOUSLY;
public static final at OFF;
private static final at[] h;
private static final EnumEntries I;
private static int L;

@NotNull
public static EnumEntries L() {
return I;
}

private static final at[] n() {
return new at[]{ON, ANONYMOUSLY, OFF};
}

static {
long var9 = yz.a(3930256523858628277L, 2816251230300084115L, MethodHandles.lookup().lookupClass()).a(134990515210451L) ^ 112564528121032L;
if (vm.a<"Å">(7598100791886340478L, var9) == 0) {
vm.a<"Å">(117, 7615668240544081768L, var9);
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
String var5 = "\u001ch0K\u0097ù¨&\u0010\u008b\u0017A\"L\u009b\u008b¸ËIæ\u000bk\u0005\u0086\u009d\bÔTõdF\u0098\bæ";
int var7 = "\u001ch0K\u0097ù¨&\u0010\u008b\u0017A\"L\u009b\u008b¸ËIæ\u000bk\u0005\u0086\u009d\bÔTõdF\u0098\bæ".length();
char var4 = '\b';
int var3 = -1;

while (true) {
byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
String var13 = a(var8).intern();
byte var10001 = -1;
var0[var6++] = var13;
if ((var3 += var4) >= var7) {
ON = new at();
ANONYMOUSLY = new at();
OFF = new at();
h = n();
I = EnumEntriesKt.enumEntries(h);
return;
}

var4 = var5.charAt(var3);
}
}

public static void V(int var0) {
L = var0;
}

public static int Z() {
return L;
}

public static int B() {
int var0 = Z();

try {
return var0 == 0 ? 111 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
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
