package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum ji {
public static final ji NONE;
public static final ji RANDOM;
public static final ji ROAMING;
public static final ji SINE;
public static final ji DRUNK_SINE;
private static final ji[] a;
private static final EnumEntries Q;
private static String V;

@NotNull
public static EnumEntries m() {
return Q;
}

private static final ji[] P() {
return new ji[]{NONE, RANDOM, ROAMING, SINE, DRUNK_SINE};
}

static {
long var9 = yz.a(-4781377104962693916L, 6836573162517082784L, MethodHandles.lookup().lookupClass()).a(62645829198134L) ^ 129393143799090L;
if (vm.a<"Å">(1024855617711578594L, var9) != null) {
vm.a<"Å">("cSZjo", 1043539721536487520L, var9);
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
String var5 = "NO+\u00adbêÆß\b=mò¾\u0014SV\u0004\u0010\u008c¸Yükváé\u0010a\u0016²½bò\u0088";
int var7 = "NO+\u00adbêÆß\b=mò¾\u0014SV\u0004\u0010\u008c¸Yükváé\u0010a\u0016²½bò\u0088".length();
char var4 = '\b';
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
NONE = new ji();
RANDOM = new ji();
ROAMING = new ji();
SINE = new ji();
DRUNK_SINE = new ji();
a = P();
Q = EnumEntriesKt.enumEntries(a);
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

var5 = "ä¡\u0090;\u0088\u0089\u001d¼\b)æGkBüç\u008b";
var7 = "ä¡\u0090;\u0088\u0089\u001d¼\b)æGkBüç\u008b".length();
var4 = '\b';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
var10001 = 0;
}
}
}

public static void x(String var0) {
V = var0;
}

public static String Y() {
return V;
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
