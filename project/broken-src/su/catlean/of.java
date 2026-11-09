package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum of {
@NotNull
private final String x;
@NotNull
private final Map k;
public static final of EN;
public static final of RU;
public static final of PL;
private static final of[] N;
private static final EnumEntries t;

private of(String var3, Map var4) {
this.x = var3;
this.k = var4;
}

@NotNull
public final String i() {
return this.x;
}

@NotNull
public final Map A() {
return this.k;
}

@NotNull
public static EnumEntries b() {
return t;
}

private static final of[] y() {
return new of[]{EN, RU, PL};
}

static {
long var9 = yz.a(1268896906261118318L, -8345833253705726917L, MethodHandles.lookup().lookupClass()).a(24725270067053L) ^ 70496827022608L;
Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[6];
int var6 = 0;
String var5 = "t\u0086S\u001d¸\u0007\u0092Ü\bÌ÷8~\u0081}\u009aÑ\bþ&\"f\u001a\u0000\u0083Ê\bmÎ\u009cß\u001d³K=";
int var7 = "t\u0086S\u001d¸\u0007\u0092Ü\bÌ÷8~\u0081}\u009aÑ\bþ&\"f\u001a\u0000\u0083Ê\bmÎ\u009cß\u001d³K=".length();
char var4 = '\b';
int var12 = -1;

label28:
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
EN = new of(var0[1], new LinkedHashMap());
RU = new of(var0[4], new LinkedHashMap());
PL = new of(var0[0], new LinkedHashMap());
N = y();
t = EnumEntriesKt.enumEntries(N);
return;
}

var4 = var5.charAt(var12);
break;
default:
var0[var6++] = var19;
if ((var12 += var4) < var7) {
var4 = var5.charAt(var12);
continue label28;
}

var5 = "^4\u009a¤\u0089!ía\bc\u0015AÇ\u0016\u0087Àí";
var7 = "^4\u009a¤\u0089!ía\bc\u0015AÇ\u0016\u0087Àí".length();
var4 = '\b';
var12 = -1;
}

var13 = var5.substring(++var12, var12 + var4);
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
