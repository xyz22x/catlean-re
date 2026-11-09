package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

enum xb {
public static final xb Select;
public static final xb All;
public static final xb BlackList;
public static final xb WhiteList;
private static final xb[] P;
private static final EnumEntries l;

@NotNull
public static EnumEntries n() {
return l;
}

private static final xb[] T() {
return new xb[]{Select, All, BlackList, WhiteList};
}

static {
long var9 = yz.a(5170981708187696684L, -1579051143705660869L, MethodHandles.lookup().lookupClass()).a(142410184547896L) ^ 20149370402434L;
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
String var5 = "\u0007öw\u0095 (\\\u0095P1<Ã¾\u009d\u0016·\u0010\u008fì\u001e-Ê½ú\u001e}\u000f.&ð³ø\u0093";
int var7 = "\u0007öw\u0095 (\\\u0095P1<Ã¾\u009d\u0016·\u0010\u008fì\u001e-Ê½ú\u001e}\u000f.&ð³ø\u0093".length();
char var4 = 16;
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
Select = new xb();
All = new xb();
BlackList = new xb();
WhiteList = new xb();
P = T();
l = EnumEntriesKt.enumEntries(P);
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

var5 = "\u000f¿îâ\u0010\u00adìÀ\b\u0005I@d\u0014\bæè";
var7 = "\u000f¿îâ\u0010\u00adìÀ\b\u0005I@d\u0014\bæè".length();
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
