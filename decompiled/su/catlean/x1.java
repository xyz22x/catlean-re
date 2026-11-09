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
import java.util.HashMap;
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

public final class x1 {
private static int[] m;
private static final long a = yz.a(-2748965304596077913L, 4159641113029925133L, MethodHandles.lookup().lookupClass()).a(141912870959410L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public static final void R(
@NotNull Matrix3x2fStack stack,
float x,
float y,
float w,
float h,
float radiusValue,
float outlineWidth,
float mixValue,
float alphaValue,
@NotNull Color colorValue,
@NotNull Color outlineColorValue,
float radius2,
long a,
float radius3,
float radius4
) {
ax = a ^ ax;
long var16 = ax ^ 127354505476091L;
long var18 = ax ^ 91153649865676L;
long var20 = ax ^ 17681093622585L;
long var22 = ax ^ 83938617693788L;
long var24 = ax ^ 41064629691286L;
long var26 = ax ^ 17889136931127L;
long var28 = ax ^ 32268735542119L;
long var10001 = ax ^ 60004218296251L;
int var30 = (int)((ax ^ 60004218296251L) >>> 48);
int var31 = (int)((ax ^ 60004218296251L) << 16 >>> 32);
int var32 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(stack, a<"a">(31639, 3451152089614511236L ^ ax));
Intrinsics.checkNotNullParameter(colorValue, a<"a">(8442, 7031340623149185000L ^ ax));
Intrinsics.checkNotNullParameter(outlineColorValue, a<"a">(21522, 3904959092061782787L ^ ax));
int[] var10000 = vm.a<"Å">(3760678428122937944L, ax);
float var39 = RangesKt.coerceIn(w / 10000.0F, 0.0F, 1.0F);
float var40 = RangesKt.coerceIn(h / 10000.0F, 0.0F, 1.0F);
float var41 = RangesKt.coerceIn(alphaValue, 0.0F, 1.0F);
VertexFormat var10003 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, a<"a">(1584, 6357527879624495398L ^ ax));
int var10006 = b<"p">(18501, 7233251564486319625L ^ ax);
Object var33 = null;
int var34 = var10006;
boolean var35 = false;
byte var36 = 0;
VertexFormat var37 = var10003;
g7 var42 = g7.j(
g7.j(
g7.j(
g7.j(new g7(var16, var37, var36, var35, var34, (DefaultConstructorMarker)var33), x - 1.0F, y + h + 2.0F, 0.0F, 4, var26, null)
.j(var39, var28, var40)
.n(new Color(0.0F, 0.0F, var41, var41), var22),
x - 1.0F,
y - 1.0F,
0.0F,
4,
var26,
null
)
.j(var39, var28, var40)
.n(new Color(0.0F, 0.0F, var41, var41), var22),
x + w + 2.0F,
y - 1.0F,
0.0F,
4,
var26,
null
)
.j(var39, var28, var40)
.n(new Color(0.0F, 0.0F, var41, var41), var22),
x + w + 2.0F,
y + h + 2.0F,
0.0F,
4,
var26,
null
)
.j(var39, var28, var40)
.n(new Color(0.0F, 0.0F, var41, var41), var22);
RenderPipeline var43 = b6.R.U();
Matrix3x2f var44 = new Matrix3x2f((Matrix3x2fc)stack);
GpuBufferSlice var45 = z5.B
.R()
.method_71102(
new du(
radiusValue,
radius2,
radius3,
radius4,
outlineWidth / 2.0F,
jl.y.p(colorValue, (char)var30, var31, jl.y.G(var18, colorValue) * jl.y.t(), (short)var32),
var20,
jl.y.p(outlineColorValue, (char)var30, var31, jl.y.G(var18, outlineColorValue) * jl.y.t(), (short)var32),
mixValue
)
);
Map var46 = MapsKt.mapOf(TuplesKt.to(a<"a">(31981, 3508250126543186941L ^ ax), dv.D.R()));
int[] var38 = var10000;

try {
g7.R(var24, var42, var43, null, var45, null, var44, var46, b<"p">(4124, 4321819927604495957L ^ ax), null);
if (var38 != null) {
vm.a<"Å">(new _g[2], 3811880125436149467L, ax);
}
} catch (NumberFormatException var47) {
throw vm.a<"Å">(var47, 3785158334925933555L, ax);
}
}

public static void n(
Matrix3x2fStack var0,
char var1,
float var2,
float var3,
float var4,
float var5,
float var6,
float var7,
float var8,
float var9,
Color var10,
Color var11,
float var12,
short var13,
float var14,
int var15,
float var16,
int var17,
Object var18
) {
long var19 = ((long)var1 << 48 | (long)var13 << 48 >>> 16 | (long)var15 << 32 >>> 32) ^ a;
long var21 = var19 ^ 18687653483554L;
int[] var23 = vm.a<"Å">(2533489858671209792L, var19);

int var10000;
label41: {
label40: {
try {
var10000 = var17 & b<"p">(26117, 632766253257680722L ^ var19);
if (var23 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, 2566994561209834731L, var19);
}

var12 = var6;
}

var10000 = var17 & b<"p">(19734, 3622045423505853507L ^ var19);
}

label32: {
label31: {
try {
if (var23 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, 2566994561209834731L, var19);
}

var14 = var6;
}

var10000 = var17 & b<"p">(9085, 2715388398329602603L ^ var19);
}

if (var10000 != 0) {
var16 = var6;
}

R(var0, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var21, var14, var16);
}

public static void L(int[] var0) {
m = var0;
}

public static int[] L() {
return m;
}

static {
long var20 = a ^ 54647878959256L;
vm.a<"Å">(null, 4815265926462742276L, var20);
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
String var15 = "\u009dbòG\u009bwØû\u0089oå¥ßú\u000eÐµe°ºW¿\u0014¬\u0083:ß¤EMKÿ\u0010bÐ` \u0010_oû\u00056î¸\u009bmÄJ\u0018§e÷Ô\u0002X´\u009f\u008d3\u009fÁ\u0016&à®»r\u009f7\u0093q\u0099#";
int var17 = "\u009dbòG\u009bwØû\u0089oå¥ßú\u000eÐµe°ºW¿\u0014¬\u0083:ß¤EMKÿ\u0010bÐ` \u0010_oû\u00056î¸\u009bmÄJ\u0018§e÷Ô\u0002X´\u009f\u008d3\u009fÁ\u0016&à®»r\u009f7\u0093q\u0099#"
.length();
char var14 = ' ';
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
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
long[] var6 = new long[5];
int var3 = 0;
String var4 = "L«o\u0018y÷íÈª\u008cEæs]j\b\u0089'v?\u0000 yZ";
int var5 = "L«o\u0018y÷íÈª\u008cEæs]j\b\u0089'v?\u0000 yZ".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
e = var6;
f = new Integer[5];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "loû@.\u0019\u0006¨Â\u009bE\u0003McË)";
var5 = "loû@.\u0019\u0006¨Â\u009bE\u0003McË)".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "J5Ñ\u0016\u0084í1¯á\u0018®ü4¤wr\u0081&ªò¥\u008c\u000f[\u0096úh\u0018ÔÓ\u0007ÁköI¤?\u0006__(N\u0010£Ø{\u0085è\u0014\u009fMA8gß\u0096ã¸2\u0093ºó\u00adÁ\n\u008c2úNéwz´Ór\u0093õäÕ\u0086|";
var17 = "J5Ñ\u0016\u0084í1¯á\u0018®ü4¤wr\u0081&ªò¥\u008c\u000f[\u0096úh\u0018ÔÓ\u0007ÁköI¤?\u0006__(N\u0010£Ø{\u0085è\u0014\u009fMA8gß\u0096ã¸2\u0093ºó\u00adÁ\n\u008c2úNéwz´Ór\u0093õäÕ\u0086|"
.length();
var14 = '(';
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8915;
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
throw new RuntimeException("su/catlean/x1", var10);
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
throw new RuntimeException("su/catlean/x1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9100;
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
throw new RuntimeException("su/catlean/x1", var14);
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
throw new RuntimeException("su/catlean/x1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
