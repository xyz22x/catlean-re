package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.awt.Color;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;

public final class l2 {
private static final long a = yz.a(-7116543996789564644L, 7759814965901559400L, MethodHandles.lookup().lookupClass()).a(86980861110973L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public static final void h(
float x,
float y,
float w,
float h,
float radiusValue,
float outline,
float mixValue,
float alphaValue,
@NotNull Color colorValue,
@NotNull Color outlineColorValue,
@Nullable Matrix3x2fStack matrix,
long a,
@NotNull class_2960 textureId
) {
ax = a ^ ax;
long var14 = ax ^ 43291684430278L;
long var16 = ax ^ 135916255198901L;
long var10001 = ax ^ 58543751370837L;
int var18 = (int)((ax ^ 58543751370837L) >>> 48);
int var19 = (int)((ax ^ 58543751370837L) << 16 >>> 32);
int var20 = (int)(var10001 << 48 >>> 48);
long var21 = ax ^ 49548533263064L;
long var23 = ax ^ 26441223108729L;
Intrinsics.checkNotNullParameter(colorValue, a<"y">(27058, 8555744829374963323L ^ ax));
Intrinsics.checkNotNullParameter(outlineColorValue, a<"y">(21140, 2038859596871476571L ^ ax));
Intrinsics.checkNotNullParameter(textureId, a<"y">(4324, 2212345797157316399L ^ ax));
GpuTextureView var10000 = zf.F(var14).method_1531().method_4619(textureId).method_71659();
Intrinsics.checkNotNullExpressionValue(var10000, a<"y">(39, 4971443441311807471L ^ ax));
GpuTextureView var25 = var10000;
g7 var26 = g7.j(
g7.j(
g7.j(
g7.j(new g7(var16, null, 0, false, b<"v">(6440, 6880852772527731981L ^ ax), null), x - 1.0F, y - 1.0F, 0.0F, 4, var23, null),
x - 1.0F,
y + h + 2.0F,
0.0F,
4,
var23,
null
),
x + w + 2.0F,
y + h + 2.0F,
0.0F,
4,
var23,
null
),
x + w + 2.0F,
y - 1.0F,
0.0F,
4,
var23,
null
);
RenderPipeline var27 = b6.R.g();
Matrix3x2f var28 = new Matrix3x2f((Matrix3x2fc)matrix);
GpuBufferSlice var29 = ck.l
.R()
.method_71102(new a_((short)var18, w, h, radiusValue, alphaValue, outline / 2.0F, var19, colorValue, outlineColorValue, (short)var20, mixValue));
Map var30 = MapsKt.mapOf(TuplesKt.to(a<"y">(6208, 5562125693012602762L ^ ax), var25));
g7.R(var21, var26, var27, null, var29, null, var28, var30, b<"v">(22515, 2795059554458811351L ^ ax), null);
}

static {
long var11 = a ^ 31590412476535L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[5];
int var18 = 0;
String var17 = "òV\u0096o\u009cÓQV\u0099³¶ëÒ~¬\u001c\u0085\u0094©?\u008d\u0014\u001bs;üt\u0017\u0093CsL\u0018ðC0êKÌ\u0016?\u008a«±k*æ\u009bË¦Mú«À<&{ 4ñýH\u0088&z\u0088èXdþæ¨Åä4\u0000\u001fÄC\u001a\u00866m)ºÃÏhIK";
int var19 = "òV\u0096o\u009cÓQV\u0099³¶ëÒ~¬\u001c\u0085\u0094©?\u008d\u0014\u001bs;üt\u0017\u0093CsL\u0018ðC0êKÌ\u0016?\u008a«±k*æ\u009bË¦Mú«À<&{ 4ñýH\u0088&z\u0088èXdþæ¨Åä4\u0000\u001fÄC\u001a\u00866m)ºÃÏhIK"
.length();
char var16 = ' ';
int var23 = -1;

label45:
while (true) {
String var24 = var17.substring(++var23, var23 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var33;
if ((var23 += var16) >= var19) {
b = var20;
c = new String[5];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = " \u0010g¾<\u0083ðSvG|\u008cåAòÒ";
int var5 = " \u0010g¾<\u0083ðSvG|\u008cåAòÒ".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
return;
}

var16 = var17.charAt(var23);
break;
default:
var20[var18++] = var33;
if ((var23 += var16) < var19) {
var16 = var17.charAt(var23);
continue label45;
}

var17 = "e\u008c\u0086CH\u0098\u0092&ýlsût\u0094^ûb÷$j\u0082Ü\u0091\u0004|\u008a&\u0086gü\u007f\u00ad\u008eC\u009d_¦Q\u0003år&ÂEº:aí(¸«%^¯\r:\u0002J\u0017\u0000\u0019x®g¿Ù\u0016D\u009f\u008ar3×K²3ÖÑ\u001dnÃE\u0019.TX«\u009fñ";
var19 = "e\u008c\u0086CH\u0098\u0092&ýlsût\u0094^ûb÷$j\u0082Ü\u0091\u0004|\u008a&\u0086gü\u007f\u00ad\u008eC\u009d_¦Q\u0003år&ÂEº:aí(¸«%^¯\r:\u0002J\u0017\u0000\u0019x®g¿Ù\u0016D\u009f\u008ar3×K²3ÖÑ\u001dnÃE\u0019.TX«\u009fñ"
.length();
var16 = '0';
var23 = -1;
}

var24 = var17.substring(++var23, var23 + var16);
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19268;
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
throw new RuntimeException("su/catlean/l2", var10);
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
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
}

private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/l2" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 20650;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/l2", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/l2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
