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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class tb extends tt {
@NotNull
public static final tb P;
private static final long a = yz.a(-17110349452919294L, -1990569012554070685L, MethodHandles.lookup().lookupClass()).a(116189225696354L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long e;

private tb(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 51677331550931L;
int var3 = (int)((var1 ^ 51677331550931L) >>> 48);
int var4 = (int)((var1 ^ 51677331550931L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, (short)var5);
}

@NotNull
@Override
public _w o(@NotNull class_1297 target, long a, @NotNull _w currentRotation, boolean attackTick) {
long var6 = ax ^ 38753063586444L;
long var8 = ax ^ 43306842265647L;
Intrinsics.checkNotNullParameter(target, b<"l">(23436, 1480546328091375746L ^ ax));
Intrinsics.checkNotNullParameter(currentRotation, b<"l">(9263, 2303630284693817123L ^ ax));
return new _w(zf.v(var8).method_36454(), var6, zf.v(var8).method_36455(), false, null, (int)e, null);
}

@NotNull
@Override
public class_243 B(long a, @NotNull class_1297 target) {
Intrinsics.checkNotNullParameter(target, b<"l">(23924, 2611847981889146935L ^ ax));
class_243 var10000 = target.method_33571();
Intrinsics.checkNotNullExpressionValue(var10000, b<"l">(29445, 3559245668660084292L ^ ax));
return var10000;
}

@Override
public boolean p() {
return false;
}

@Override
public boolean i() {
return false;
}

static {
long var14 = a ^ 95703299619548L;
long var16 = var14 ^ 42180151594647L;
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[4];
int var10 = 0;
String var9 = "Ê\u0013ø¹\"(MÜcÜ\u009f\nA<³ò\u0010Cæ!\u001fm]vÚÂ\u0084+9}\u008e1ý";
int var11 = "Ê\u0013ø¹\"(MÜcÜ\u009f\nA<³ò\u0010Cæ!\u001fm]vÚÂ\u0084+9}\u008e1ý".length();
char var8 = 16;
int var19 = -1;

label37:
while (true) {
String var20 = var9.substring(++var19, var19 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var20.getBytes("ISO-8859-1"));
String var28 = b(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var28;
if ((var19 += var8) >= var11) {
b = var12;
c = new String[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 1140729049839079505L;
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
e = var32;
P = new tb(var16);
return;
}

var8 = var9.charAt(var19);
break;
default:
var12[var10++] = var28;
if ((var19 += var8) < var11) {
var8 = var9.charAt(var19);
continue label37;
}

var9 = "Æ#à±5(cªtÜ7\u0096Úbô\u000bÚØ\u00979Û0\u008eck\u009b4ë²ÑÊ\u0012(À*\u009d]×,]ú¤Ä°\u0011À\u0098µü@Ì\u0013§0®ß\u00819\u008a\u000b\fëP5Îð8/\u009bë´Ù ";
var11 = "Æ#à±5(cªtÜ7\u0096Úbô\u000bÚØ\u00979Û0\u008eck\u009b4ë²ÑÊ\u0012(À*\u009d]×,]ú¤Ä°\u0011À\u0098µü@Ì\u0013§0®ß\u00819\u008a\u000b\fëP5Îð8/\u009bë´Ù "
.length();
var8 = ' ';
var19 = -1;
}

var20 = var9.substring(++var19, var19 + var8);
var10001 = 0;
}
}
}

private static String b(byte[] var0) {
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 10318;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])d.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/tb", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = b[var5].getBytes("ISO-8859-1");
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite b(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/tb" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
