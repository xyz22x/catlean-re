package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum zn {
public static final zn Cancel;
public static final zn Custom;
public static final zn OldGrim;
public static final zn GrimNew;
private static final zn[] d;
private static final EnumEntries w;
private static boolean b;

@NotNull
public static EnumEntries L() {
return w;
}

private static final zn[] d() {
return new zn[]{Cancel, Custom, OldGrim, GrimNew};
}

static {
long var9 = yz.a(1652038190971609697L, -2252690783727045464L, MethodHandles.lookup().lookupClass()).a(121684452093189L) ^ 74546236387324L;
if (!vm.a<"Å">(-7926869590436354611L, var9)) {
vm.a<"Å">(true, -8009707464507758986L, var9);
}

Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[4];
int var6 = 0;
String var5 = "\u0099L®~\u0081W~v\bÁ\u00adá\u0094XÄ{ã";
int var7 = "\u0099L®~\u0081W~v\bÁ\u00adá\u0094XÄ{ã".length();
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
Cancel = new zn();
Custom = new zn();
OldGrim = new zn();
GrimNew = new zn();
d = d();
w = EnumEntriesKt.enumEntries(d);
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

var5 = "\u0000\u0013Åù¬QÎL\b[\u0019pEñ\u0016x¸";
var7 = "\u0000\u0013Åù¬QÎL\b[\u0019pEñ\u0016x¸".length();
var4 = '\b';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
var10001 = 0;
}
}
}

public static void h(boolean var0) {
b = var0;
}

public static boolean O() {
return b;
}

public static boolean w() {
boolean var0 = O();

try {
return !var0;
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
