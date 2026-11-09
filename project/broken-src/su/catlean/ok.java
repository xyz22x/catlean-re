package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum ok {
public static final ok FadeOut;
public static final ok Size;
public static final ok Otkisuli;
public static final ok Insert;
public static final ok Fall;
public static final ok Rocket;
public static final ok Roll;
public static final ok Off;
private static final ok[] B;
private static final EnumEntries z;
private static String[] b;
private static final long a = yz.a(-2518757387356245084L, 2668000300818992312L, MethodHandles.lookup().lookupClass()).a(175336574948623L);
private static final long[] c;
private static final Integer[] d;
private static final Map e;

@NotNull
public static EnumEntries q() {
return z;
}

private static final ok[] L(long var0) {
var0 = a ^ var0;
ok[] var2 = new ok[a<"x">(26914, 8996309716633391417L ^ var0)];
var2[0] = FadeOut;
var2[1] = Size;
var2[2] = Otkisuli;
var2[3] = Insert;
var2[4] = Fall;
var2[5] = Rocket;
var2[a<"x">(12081, 3948959932605454124L ^ var0)] = Roll;
var2[a<"x">(29587, 7515320418064665487L ^ var0)] = Off;
return var2;
}

static {
long var20 = a ^ 96332334421688L;
long var22 = var20 ^ 36093279423352L;
if (vm.a<"Å">(-8387985237131921936L, var20) != null) {
vm.a<"Å">(new String[1], -8388164723928481708L, var20);
}

Cipher var12;
Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var13 = 1; var13 < 8; var13++) {
var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var11 = new String[8];
int var17 = 0;
String var16 = "`ìq½î\u0099Ìß\b?\n\u008du%Ôd¨\u0010\u009b2¿fåGÃ\u0098¨K\u0091\u009cÈ.±Ö\b &\u0084|MoR«\b\u00adoA:\u0089¡\u008b\u0014\bÛuÎJvoô\u0093";
int var18 = "`ìq½î\u0099Ìß\b?\n\u008du%Ôd¨\u0010\u009b2¿fåGÃ\u0098¨K\u0091\u009cÈ.±Ö\b &\u0084|MoR«\b\u00adoA:\u0089¡\u008b\u0014\bÛuÎJvoô\u0093".length();
char var15 = '\b';
int var26 = -1;

label58:
while (true) {
String var27 = var16.substring(++var26, var26 + var15);
int var10001 = -1;

while (true) {
byte[] var19 = var12.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = a(var19).intern();
switch (var10001) {
case 0:
var11[var17++] = var38;
if ((var26 += var15) >= var18) {
e = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "çw\f$áòÜ_c.5ä^\u0084z\"\u0091t4HHRg\u0093";
int var5 = "çw\f$áòÜ_c.5ä^\u0084z\"\u0091t4HHRg\u0093".length();
byte var2 = 0;

label40:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var30[var10001] = var47;
if (var2 >= var5) {
c = var6;
d = new Integer[5];
FadeOut = new ok();
Size = new ok();
Otkisuli = new ok();
Insert = new ok();
Fall = new ok();
Rocket = new ok();
Roll = new ok();
Off = new ok();
B = L(var22);
z = EnumEntriesKt.enumEntries(B);
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label40;
}

var4 = "mX\u0003«cöó[0Õ\u0098\u0089\u0000ä£.";
var5 = "mX\u0003«cöó[0Õ\u0098\u0089\u0000ä£.".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var15 = var16.charAt(var26);
break;
default:
var11[var17++] = var38;
if ((var26 += var15) < var18) {
var15 = var16.charAt(var26);
continue label58;
}

var16 = "å\u0091\u0011Õ'=ÿd\bªå\u0095Ñ\u0002Ì(d";
var18 = "å\u0091\u0011Õ'=ÿd\bªå\u0095Ñ\u0002Ì(d".length();
var15 = '\b';
var26 = -1;
}

var27 = var16.substring(++var26, var26 + var15);
var10001 = 0;
}
}
}

public static void G(String[] var0) {
b = var0;
}

public static String[] t() {
return b;
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

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26079;
if (d[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = c[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])e.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ok", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
d[var3] = var15;
}

return d[var3];
}

private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite a(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ok" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
