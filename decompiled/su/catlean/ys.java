package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

public enum ys {
@NotNull
private final class_124 T;
public static final ys SUCCESS;
public static final ys INFO;
public static final ys WARNING;
public static final ys ERROR;
public static final ys ENABLED;
public static final ys DISABLED;
private static String g;
private static final long a = yz.a(-2295633224315276900L, -1860336450316868268L, MethodHandles.lookup().lookupClass()).a(184002270856504L);
private static final long b;

private ys(class_124 var3) {
this.T = var3;
}

@NotNull
public final class_124 F() {
return this.T;
}

@NotNull
public static EnumEntries o() {
return y;
}

static {
long var14 = a ^ 117951188915796L;
long var16 = var14 ^ 120169622875494L;
if (vm.a<"Å">(8199958907577407735L, var14) == null) {
vm.a<"Å">("iqa4h", 8138204700462019660L, var14);
}

Cipher var6;
Cipher var10000 = var6 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var7 = 1; var7 < 8; var7++) {
var10003[var7] = (byte)(var14 << var7 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var5 = new String[6];
int var11 = 0;
String var10 = "\u00881sÈF\u009fÜ\b\b³Þ\u0006\u0007ò²Wé\b\u0089>@Q.OJx\b}\u0088§#÷7MF";
int var12 = "\u00881sÈF\u009fÜ\b\b³Þ\u0006\u0007ò²Wé\b\u0089>@Q.OJx\b}\u0088§#÷7MF".length();
char var9 = '\b';
int var19 = -1;

label41:
while (true) {
String var20 = var10.substring(++var19, var19 + var9);
byte var10001 = -1;

while (true) {
byte[] var13 = var6.doFinal(var20.getBytes("ISO-8859-1"));
String var28 = a(var13).intern();
switch (var10001) {
case 0:
var5[var11++] = var28;
if ((var19 += var9) >= var12) {
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -311342042003823557L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var32 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
b = var32;
SUCCESS = new ys(class_124.field_1060);
INFO = new ys(class_124.field_1075);
WARNING = new ys(class_124.field_1065);
ERROR = new ys(class_124.field_1061);
ENABLED = new ys(class_124.field_1077);
DISABLED = new ys(class_124.field_1079);
y = EnumEntriesKt.enumEntries(Y);
return;
}

var9 = var10.charAt(var19);
break;
default:
var5[var11++] = var28;
if ((var19 += var9) < var12) {
var9 = var10.charAt(var19);
continue label41;
}

var10 = "|Ö\u008aÀÐ\u008d.\u0090\u0010j%¦'`o·PýµÀ\u0098ª~nÇ";
var12 = "|Ö\u008aÀÐ\u008d.\u0090\u0010j%¦'`o·PýµÀ\u0098ª~nÇ".length();
var9 = '\b';
var19 = -1;
}

var20 = var10.substring(++var19, var19 + var9);
var10001 = 0;
}
}
}

public static void q(String var0) {
g = var0;
}

public static String I() {
return g;
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
