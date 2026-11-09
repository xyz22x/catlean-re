package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public final class jt {
@NotNull
private static final fu g;
@NotNull
private static final fu D;
@NotNull
private static final fu u;
@NotNull
private static final fu O;
@NotNull
private static final fu s;
@NotNull
private static final fu h;
@NotNull
private static final fu e;
@NotNull
private static final fu H;
@NotNull
private static final fu W;
@NotNull
private static final fu v;
@NotNull
private static final fu L;
private static _g[] k;

@NotNull
public static final fu n() {
return g;
}

@NotNull
public static final fu Q() {
return D;
}

@NotNull
public static final fu A() {
return u;
}

@NotNull
public static final fu c() {
return O;
}

@NotNull
public static final fu V() {
return s;
}

@NotNull
public static final fu F() {
return h;
}

@NotNull
public static final fu z() {
return e;
}

@NotNull
public static final fu y() {
return H;
}

@NotNull
public static final fu I() {
return W;
}

@NotNull
public static final fu v() {
return v;
}

@NotNull
public static final fu d() {
return L;
}

static {
long var9 = yz.a(-1411855101450747916L, 3514975155890691561L, MethodHandles.lookup().lookupClass()).a(68634786437873L) ^ 137543174313079L;
long var11 = var9 ^ 236692984055L;
if (vm.a<"Å">(-6916539072279976941L, var9) == null) {
vm.a<"Å">(new _g[3], -6875134307901612531L, var9);
}

Cipher var1;
Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var2 = 1; var2 < 8; var2++) {
var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var0 = new String[11];
int var6 = 0;
String var5 = "\u008cªd\u009fµ\u008cd\u0084\bÙ)<£PäV\u0095\u0010zÈ¿Î*\u0090ôõ\u0093\u009bdp÷w1Ö\bS/\u007f\n¢\u000búã\b¸°¾\u001aZÃT\u0010\bùlÞ°\u0006\u008aÌ\u0096\b$\u007fÞÏ³ðw\u000f\bÊüD\rÛxIÑ\bZ\u0012°\u001bªêC\u009e";
int var7 = "\u008cªd\u009fµ\u008cd\u0084\bÙ)<£PäV\u0095\u0010zÈ¿Î*\u0090ôõ\u0093\u009bdp÷w1Ö\bS/\u007f\n¢\u000búã\b¸°¾\u001aZÃT\u0010\bùlÞ°\u0006\u008aÌ\u0096\b$\u007fÞÏ³ðw\u000f\bÊüD\rÛxIÑ\bZ\u0012°\u001bªêC\u009e"
.length();
char var4 = '\b';
int var14 = -1;

label32:
while (true) {
String var15 = var5.substring(++var14, var14 + var4);
byte var10001 = -1;

while (true) {
byte[] var8 = var1.doFinal(var15.getBytes("ISO-8859-1"));
String var21 = a(var8).intern();
switch (var10001) {
case 0:
var0[var6++] = var21;
if ((var14 += var4) >= var7) {
g = new fu(var11, var0[0]);
D = new fu(var11, var0[10]);
u = new fu(var11, var0[7]);
O = new fu(var11, var0[4]);
s = new fu(var11, var0[9]);
h = new fu(var11, var0[2]);
e = new fu(var11, var0[3]);
H = new fu(var11, var0[1]);
W = new fu(var11, var0[5]);
v = new fu(var11, var0[6]);
L = new fu(var11, var0[8]);
return;
}

var4 = var5.charAt(var14);
break;
default:
var0[var6++] = var21;
if ((var14 += var4) < var7) {
var4 = var5.charAt(var14);
continue label32;
}

var5 = "u®ò\u0005\\\u0099Î§\b\u001e¬, aþb©";
var7 = "u®ò\u0005\\\u0099Î§\b\u001e¬, aþb©".length();
var4 = '\b';
var14 = -1;
}

var15 = var5.substring(++var14, var14 + var4);
var10001 = 0;
}
}
}

public static void o(_g[] var0) {
k = var0;
}

public static _g[] h() {
return k;
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
