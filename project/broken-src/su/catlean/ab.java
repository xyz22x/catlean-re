package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_290;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;

public final class ab {
@NotNull
private List A = new ArrayList();
private static boolean o;
private static final long a = yz.a(4392267268387207078L, 125771913496169175L, MethodHandles.lookup().lookupClass()).a(242678106587575L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void w(@NotNull Matrix3x2fStack stack, @NotNull Color c1, int a, @NotNull Color c2, int a, boolean depth) {
long var7 = ((long)axx << 32 | (long)ax << 32 >>> 32) ^ a;
long var9 = var7 ^ 72763149078975L;
long var11 = var7 ^ 47971371593342L;
long var13 = var7 ^ 37305127902589L;
long var15 = var7 ^ 138186526683160L;
long var17 = var7 ^ 22679289726418L;
long var19 = var7 ^ 49067101820195L;
Intrinsics.checkNotNullParameter(stack, a<"b">(5827, 5897233890492831373L ^ var7));
Intrinsics.checkNotNullParameter(c1, a<"b">(6111, 2006791419772196755L ^ var7));
Intrinsics.checkNotNullParameter(c2, a<"b">(20218, 6289033551521156786L ^ var7));
boolean var10000 = vm.a<"Å">(5909101001413523958L, var7);
float var27 = 0.0F;
boolean var26 = var10000;

label75: {
label74: {
try {
var10000 = this.A.isEmpty();
if (var26) {
break label75;
}

if (!var10000) {
break label74;
}
} catch (NumberFormatException var42) {
throw vm.a<"Å">(var42, 5932820324146087094L, var7);
}

var10000 = false;
break label75;
}

var10000 = true;
}

if (var10000) {
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, a<"b">(9981, 5500019644116100784L ^ var7));
int var10003 = this.A.size();
Object var21 = null;
byte var22 = 4;
boolean var23 = false;
int var24 = var10003;
VertexFormat var25 = var10002;
g7 var28 = new g7(var9, var25, var24, var23, var22, (DefaultConstructorMarker)var21);
Iterable var29 = this.A;
boolean var30 = false;

label63: {
label62:
for (Object var32 : var29) {
ah var33 = (ah)var32;
boolean var34 = false;
float var35 = RangesKt.coerceIn(var33.q() / 10000.0F, 0.0F, 1.0F);
float var36 = RangesKt.coerceIn(var33.V() / 10000.0F, 0.0F, 1.0F);
float var37 = RangesKt.coerceIn(var33.F(), 0.0F, 1.0F);
var28.b(var11, var33.E(), var33.U() - 1.0F, var33.d() + var33.V() + 2.0F, var27)
.j(var35, var19, var36)
.n(new Color(0.0F, 0.0F, var37, var37), var15)
.b(var11, var33.E(), var33.U() - 1.0F, var33.d() - 1.0F, var27)
.j(var35, var19, var36)
.n(new Color(0.0F, 0.0F, var37, var37), var15)
.b(var11, var33.E(), var33.U() + var33.q() + 2.0F, var33.d() - 1.0F, var27)
.j(var35, var19, var36)
.n(new Color(0.0F, 0.0F, var37, var37), var15)
.b(var11, var33.E(), var33.U() + var33.q() + 2.0F, var33.d() + var33.V() + 2.0F, var27)
.j(var35, var19, var36)
.n(new Color(0.0F, 0.0F, var37, var37), var15);
var27 += 0.1F;

try {
;
} catch (NumberFormatException var39) {
throw vm.a<"Å">(var39, 5932820324146087094L, var7);
}

while (true) {
try {
var10000 = var26;
if (axx <= 0) {
break label63;
}

if (var26) {
break label62;
}

if (!var26) {
break;
}
} catch (NumberFormatException var41) {
throw vm.a<"Å">(var41, 5932820324146087094L, var7);
}

if (ax >= 0) {
break label62;
}
}
}

try {
var10000 = depth;
} catch (NumberFormatException var38) {
throw vm.a<"Å">(var38, 5932820324146087094L, var7);
}
}

label45: {
try {
if (var10000) {
var49 = b6.R.b();
break label45;
}
} catch (NumberFormatException var40) {
throw vm.a<"Å">(var40, 5932820324146087094L, var7);
}

var49 = b6.R.U();
}

RenderPipeline var43 = var49;
Matrix3x2f var44 = new Matrix3x2f((Matrix3x2fc)stack);
long var10001 = 8777503339703922744L ^ var7;
GpuBufferSlice var45 = z5.B.R().method_71102(new du(3.0F, 3.0F, 3.0F, 3.0F, 0.75F, c1, var13, c2, 0.0F));
Map var46 = MapsKt.mapOf(TuplesKt.to(a<"b">(12407, var10001), dv.D.R()));
g7.R(var17, var28, var43, null, var45, null, var44, var46, b<"t">(9136, 3878414438112260156L ^ var7), null);
this.A.clear();
}
}

public final void K(@NotNull Matrix3x2fStack m, float x, float y, float w, float h, float a) {
Intrinsics.checkNotNullParameter(m, "m");
Matrix3x2f var7 = new Matrix3x2f((Matrix3x2fc)m);
this.A.add(new ah(var7, x, y, w, h, ax));
}

public static void N(long var0, ab var2, Matrix3x2fStack var3, float var4, float var5, float var6, float var7, float var8, int var9, Object var10) {
var0 = a ^ var0;
if ((var9 & b<"t">(26504, 7599913532010602139L ^ var0)) != 0) {
var8 = 1.0F;
}

var2.K(var3, var4, var5, var6, var7, var8);
}

public static void d(boolean var0) {
o = var0;
}

public static boolean x() {
return o;
}

public static boolean U() {
boolean var0 = x();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var20 = a ^ 78760021526594L;
vm.a<"Å">(true, 2495374308721937484L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[5];
int var16 = 0;
String var15 = "uÈ\u000f\t\u009d±6]@![çb|\u008bö(ð>\u009d\u001d\u001eè-\"7dyo]\u001c9¦\u0015÷7eÜ\u0001`\u0016Ý\u0085&åº\\`¶P\u0085qØÉ°¯\u0013\u00108\u0095ér.X\u0091ïsNÎ)Í½¼\u0090";
int var17 = "uÈ\u000f\t\u009d±6]@![çb|\u008bö(ð>\u009d\u001d\u001eè-\"7dyo]\u001c9¦\u0015÷7eÜ\u0001`\u0016Ý\u0085&åº\\`¶P\u0085qØÉ°¯\u0013\u00108\u0095ér.X\u0091ïsNÎ)Í½¼\u0090"
.length();
char var14 = 16;
int var23 = -1;

label45:
while (true) {
String var24 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var33;
if ((var23 += var14) >= var17) {
b = var18;
c = new String[5];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "ÎK`Bß Aú\f\u0000\u009b¸î\u009e\u001aÓ";
int var5 = "ÎK`Bß Aú\f\u0000\u009b¸î\u009e\u001aÓ".length();
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

var14 = var15.charAt(var23);
break;
default:
var18[var16++] = var33;
if ((var23 += var14) < var17) {
var14 = var15.charAt(var23);
continue label45;
}

var15 = "â\u0006¦q&ä\u000fPÞP\u0091åå§^\u001a^¯öápÈ9)\u0010\u000f5w_kp\u0003Í\u0087\u001e\u001f\u0099ýÕ\u0004|";
var17 = "â\u0006¦q&ä\u000fPÞP\u0091åå§^\u001a^¯öápÈ9)\u0010\u000f5w_kp\u0003Í\u0087\u001e\u001f\u0099ýÕ\u0004|".length();
var14 = 24;
var23 = -1;
}

var24 = var15.substring(++var23, var23 + var14);
var10001 = 0;
}
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5065;
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
throw new RuntimeException("su/catlean/ab", var10);
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
throw new RuntimeException("su/catlean/ab" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9;
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
throw new RuntimeException("su/catlean/ab", var14);
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
throw new RuntimeException("su/catlean/ab" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
