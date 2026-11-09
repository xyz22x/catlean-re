package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum tz {
public static final tz CUSTOM;
public static final tz SYNC;
public static final tz RGB;
public static final tz SKY;
public static final tz LIGHT_RGB;
private static final tz[] l;
private static final EnumEntries R;
private static String[] W;

@NotNull
public static EnumEntries W() {
return R;
}

private static final tz[] k() {
return new tz[]{CUSTOM, SYNC, RGB, SKY, LIGHT_RGB};
}

static {
long var9 = yz.a(-6764769074393202073L, 5356158761306579670L, MethodHandles.lookup().lookupClass()).a(200735882615803L) ^ 111353807826257L;
if (vm.a<"Å">(-2706192256201761490L, var9) == null) {
vm.a<"Å">(new String[1], -2670653563025241138L, var9);
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
String var5 = "ùb\u001f~ÿ`õ9\b\u0005C\u0086÷O\u0005Ô\u0083\u0010\u0095F\u0016D\u0090ôgµ4= Ã[r\u0004Y";
int var7 = "ùb\u001f~ÿ`õ9\b\u0005C\u0086÷O\u0005Ô\u0083\u0010\u0095F\u0016D\u0090ôgµ4= Ã[r\u0004Y".length();
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
CUSTOM = new tz();
SYNC = new tz();
RGB = new tz();
SKY = new tz();
LIGHT_RGB = new tz();
l = k();
R = EnumEntriesKt.enumEntries(l);
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

var5 = "\u0088¶\u0012oÕfiÐ\b\u0093\u009d\u008dæÍU\u000f¸";
var7 = "\u0088¶\u0012oÕfiÐ\b\u0093\u009d\u008dæÍU\u000f¸".length();
var4 = '\b';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
var10001 = 0;
}
}
}

public static void Z(String[] var0) {
W = var0;
}

public static String[] x() {
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
