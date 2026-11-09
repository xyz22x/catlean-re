package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum r7 {
public static final r7 INVENTORY;
public static final r7 ALWAYS;
public static final r7 NOT_IN_INVENTORY;
public static final r7 OFF;
private static final r7[] I;
private static final EnumEntries D;

@NotNull
public static EnumEntries u() {
return D;
}

private static final r7[] y() {
return new r7[]{INVENTORY, ALWAYS, NOT_IN_INVENTORY, OFF};
}

static {
long var9 = yz.a(-6067065945642038472L, -3805465629103244954L, MethodHandles.lookup().lookupClass()).a(45041308095109L) ^ 70064781364105L;
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
String var5 = "z¸qõö(¹R\u0010ÎJ û\u0013\u008d\u0089ê,IñXÑ&M^";
int var7 = "z¸qõö(¹R\u0010ÎJ û\u0013\u008d\u0089ê,IñXÑ&M^".length();
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
INVENTORY = new r7();
ALWAYS = new r7();
NOT_IN_INVENTORY = new r7();
OFF = new r7();
I = y();
D = EnumEntriesKt.enumEntries(I);
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

var5 = "f\u000eª\u009f¿²¬@\u0018È=\u0003\u0002\u000bk\u0083÷IÏjD\u0000\u0013a\u009bµôýÉ\u0088P+h";
var7 = "f\u000eª\u009f¿²¬@\u0018È=\u0003\u0002\u000bk\u0083÷IÏjD\u0000\u0013a\u009bµôýÉ\u0088P+h".length();
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
