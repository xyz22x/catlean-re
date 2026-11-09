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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_276;
import net.minecraft.class_290;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;

public final class l7 {
private static boolean y;
private static final long a = yz.a(-6561247305792826447L, 5766918529340632019L, MethodHandles.lookup().lookupClass()).a(158894545764928L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public static final void p(
float x,
float y,
long a,
float w,
float h,
float originRadius,
@NotNull Color colorValue1,
@NotNull Color colorValue2,
@NotNull Color colorValue3,
@NotNull Color colorValue4,
@NotNull Matrix3x2fStack matrix,
float originOutline,
@NotNull Color outlineColorValue
) {
ax = a ^ ax;
long var14 = ax ^ 12806868235729L;
long var16 = ax ^ 96100122897058L;
long var18 = ax ^ 57340626097270L;
long var20 = ax ^ 121100870705528L;
long var22 = ax ^ 102429709410748L;
long var24 = ax ^ 114576833983261L;
Intrinsics.checkNotNullParameter(colorValue1, a<"e">(15256, 7997924700305977725L ^ ax));
Intrinsics.checkNotNullParameter(colorValue2, a<"e">(27203, 396564584167710880L ^ ax));
Intrinsics.checkNotNullParameter(colorValue3, a<"e">(24558, 1669593165285168393L ^ ax));
Intrinsics.checkNotNullParameter(colorValue4, a<"e">(20699, 6194237003735407163L ^ ax));
vm.a<"Å">(-713005342683416462L, ax);
Intrinsics.checkNotNullParameter(matrix, a<"e">(6210, 3361886680891183779L ^ ax));
Intrinsics.checkNotNullParameter(outlineColorValue, a<"e">(11369, 1842136403456976527L ^ ax));
VertexFormat var10003 = class_290.field_1576;
Intrinsics.checkNotNullExpressionValue(class_290.field_1576, a<"e">(1474, 1616090329942183722L ^ ax));
int var10006 = b<"l">(19412, 8849295080912814210L ^ ax);
Object var26 = null;
int var27 = var10006;
boolean var28 = false;
byte var29 = 0;
VertexFormat var30 = var10003;
g7 var32 = g7.j(
g7.j(
g7.j(
g7.j(new g7(var14, var30, var29, var28, var27, (DefaultConstructorMarker)var26), x - 1.0F, yx - 1.0F, 0.0F, 4, var24, null).n(colorValue2, var18),
x - 1.0F,
yx + h + 2.0F,
0.0F,
4,
var24,
null
)
.n(colorValue1, var18),
x + w + 2.0F,
yx + h + 2.0F,
0.0F,
4,
var24,
null
)
.n(colorValue3, var18),
x + w + 2.0F,
yx - 1.0F,
0.0F,
4,
var24,
null
)
.n(colorValue4, var18);
RenderPipeline var33 = b6.R.H();
class_276 var10001 = zf.F(var16).method_1522();
Intrinsics.checkNotNullExpressionValue(var10001, a<"e">(31369, 3279991051747504237L ^ ax));
class_276 var34 = var10001;
Matrix3x2f var35 = new Matrix3x2f((Matrix3x2fc)matrix);
GpuBufferSlice var36 = jb.p.v().method_71102(new jd(w, h, originRadius, originOutline / 2.0F, var20, outlineColorValue));

try {
g7.R(var22, var32, var33, var34, var36, null, var35, null, b<"l">(4901, 2094162028031236209L ^ ax), null);
if (vm.a<"Å">(-667981844983322581L, ax) != null) {
vm.a<"Å">(new int[4], -677097248844010675L, ax);
}
} catch (NumberFormatException var37) {
throw vm.a<"Å">(var37, -649702644936843758L, ax);
}
}

public static void E(
float var0,
float var1,
float var2,
float var3,
float var4,
Color var5,
Color var6,
long var7,
Color var9,
Color var10,
Matrix3x2fStack var11,
float var12,
Color var13,
int var14,
Object var15
) {
var7 = a ^ var7;
long var16 = var7 ^ 41384777079975L;
int[] var18 = vm.a<"Å">(-3915890144018823217L, var7);

int var10000;
label25: {
label24: {
try {
var10000 = var14 & b<"l">(11942, 1854377298731162190L ^ var7);
if (var18 != null) {
break label25;
}

if (var10000 == 0) {
break label24;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, -3943225689724919377L, var7);
}

var12 = 0.0F;
}

var10000 = var14 & b<"l">(18861, 312581979938012487L ^ var7);
}

if (var10000 != 0) {
Color var21 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"e">(2278, 4016934730646191545L ^ var7));
var13 = var21;
}

p(var0, var1, var16, var2, var3, var4, var5, var6, var9, var10, var11, var12, var13);
}

public static void A(boolean var0) {
y = var0;
}

public static boolean h() {
return y;
}

public static boolean S() {
boolean var0 = h();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var20 = a ^ 55108927160265L;
vm.a<"Å">(false, 2095877757169240676L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[9];
int var16 = 0;
String var15 = "\u001bÆ\u0019~\u008b*\u0005\u0092_\u00016æÝ,@@\u009enÐ\u0090¢\u0092\u001e\u008a\u0010\u009eL\u0007\u0095Â\u0013q\u009b\u0010¯\u001f\u0003}A¿.\u0010¾[GME´¯üs\u009cä>ðTb\u000e \u008cåÁàúÊ¦\u001b4]æO\u009b\u0088ºµ¢à \u008fºf¶tP\u001eW4Ò¨ÒL0¡\u009bàë£ïâ=µnåêç0\u00868;¸x(b\u0080Çû\u0098\u0016+\u001f#¼h=\u0014S»xè\u0080Ú5kª\u0083zÁ~â\u0095 *0}àE·\u008a\u0084g\u009c\u0092K\u0088úö·´y¹°VÒ\u0006\u0085Ït\"Í*ãßp(¹7ÈÉ\u0019º\u0019Ç#ï}Sm(4Ð}h´\u009b\u001eT\u001fÞ\u001a\r\u0092Í¥\u0098°MVæ\u0017k\u0094`ü×";
int var17 = "\u001bÆ\u0019~\u008b*\u0005\u0092_\u00016æÝ,@@\u009enÐ\u0090¢\u0092\u001e\u008a\u0010\u009eL\u0007\u0095Â\u0013q\u009b\u0010¯\u001f\u0003}A¿.\u0010¾[GME´¯üs\u009cä>ðTb\u000e \u008cåÁàúÊ¦\u001b4]æO\u009b\u0088ºµ¢à \u008fºf¶tP\u001eW4Ò¨ÒL0¡\u009bàë£ïâ=µnåêç0\u00868;¸x(b\u0080Çû\u0098\u0016+\u001f#¼h=\u0014S»xè\u0080Ú5kª\u0083zÁ~â\u0095 *0}àE·\u008a\u0084g\u009c\u0092K\u0088úö·´y¹°VÒ\u0006\u0085Ït\"Í*ãßp(¹7ÈÉ\u0019º\u0019Ç#ï}Sm(4Ð}h´\u009b\u001eT\u001fÞ\u001a\r\u0092Í¥\u0098°MVæ\u0017k\u0094`ü×"
.length();
char var14 = 24;
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
c = new String[9];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "Í¡ÒWå|C\u0014 \u008bÛ¤ý\u009aÜÌ";
int var5 = "Í¡ÒWå|C\u0014 \u008bÛ¤ý\u009aÜÌ".length();
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
f = new Integer[4];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "¶Þ\u008aª«\u001eN\n\u0092An³û¡Ó\u0093";
var5 = "¶Þ\u008aª«\u001eN\n\u0092An³û¡Ó\u0093".length();
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

var15 = "\u0006ã\u0019Ï!\u009f°Z\u001býË§ño2¯SÁÑÿ$3\\}\u0089¬\u0018@Ía.Ú\u0018i+íâÉÓ*Ý£&\u009f\u001aö\u0002\u008f\u001c\u0084\f\u0082\u0011Ù\u0091\u0088;";
var17 = "\u0006ã\u0019Ï!\u009f°Z\u001býË§ño2¯SÁÑÿ$3\\}\u0089¬\u0018@Ía.Ú\u0018i+íâÉÓ*Ý£&\u009f\u001aö\u0002\u008f\u001c\u0084\f\u0082\u0011Ù\u0091\u0088;"
.length();
var14 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15627;
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
throw new RuntimeException("su/catlean/l7", var10);
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
throw new RuntimeException("su/catlean/l7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 15549;
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
throw new RuntimeException("su/catlean/l7", var14);
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
throw new RuntimeException("su/catlean/l7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
