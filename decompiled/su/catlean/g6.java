package su.catlean;

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
import kotlin.ranges.RangesKt;
import net.minecraft.class_290;
import net.minecraft.class_332;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;

public final class g6 extends gf {
@NotNull
public static final g6 F;
private static float h;
private static final long a = yz.a(5841002753880898457L, -1457486917065574799L, MethodHandles.lookup().lookupClass()).a(12815323864929L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] i;
private static final Map k;

private g6(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
long var10001 = var4 ^ 78450318097521L;
int var6 = (int)((var4 ^ 78450318097521L) >>> 48);
int var7 = (int)((var4 ^ 78450318097521L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, b<"a">(9497, 130294385796245897L ^ var4), (char)var8);
}

public final float k() {
return h;
}

public final void S(float <set-?>) {
h = <set-?>;
}

@Override
public void h(long a, @NotNull class_332 context) {
long var4 = ax ^ 73719739740194L;
long var6 = ax ^ 34973642043217L;
long var8 = ax ^ 17946477735558L;
long var10 = ax ^ 80556358892348L;
long var12 = ax ^ 41533572548145L;
long var14 = ax ^ 20494741382199L;
Intrinsics.checkNotNullParameter(context, b<"a">(15441, 4987783582685702998L ^ ax));
Color var22 = jh.f.Z(var8, 0);
float var23 = zf.F(var4).method_22683().method_4486() / 2.0F;
float var24 = zf.F(var4).method_22683().method_4502() / 2.0F;
class_746 var10001 = zf.F(var4).field_1724;
Intrinsics.checkNotNull(var10001);
float var25 = 3.0F - var10001.method_7261(0.5F) * 3.0F + RangesKt.coerceIn(dm.h.r() * 10.0F, 0.0F, 3.0F);
boolean var10000 = vm.a<"Å">(-5990705277528627281L, ax);
float var26 = jl.y.B(h, var25, jl.y.K(var14)) + 7.0F;
h = var25;
VertexFormat var10003 = class_290.field_1576;
Intrinsics.checkNotNullExpressionValue(class_290.field_1576, b<"a">(25784, 7819702333978571704L ^ ax));
int var10004 = d<"s">(9737, 1058124202986338515L ^ ax);
Object var16 = null;
byte var17 = 4;
boolean var18 = false;
int var19 = var10004;
VertexFormat var20 = var10003;
g7 var27 = new g7(var6, var20, var19, var18, var17, (DefaultConstructorMarker)var16);
jl var40 = jl.y;
float var48 = var23 - 1.0F;
float var56 = var24 - 6.0F + var26;
Color[] var28 = new Color[1];
Color var10009 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, b<"a">(21021, 9144173880792499486L ^ ax));
var28[0] = var10009;
var40.q(var27, var48, var56, 2.0F, 4.0F, var12, var28);
jl var41 = jl.y;
float var49 = var23 - 0.5F;
float var57 = var24 - 5.5F + var26;
var28 = new Color[]{var22};
var41.q(var27, var49, var57, 1.0F, 3.0F, var12, var28);
jl var42 = jl.y;
float var50 = var23 - 1.0F;
float var58 = var24 + 2.0F - var26;
var28 = new Color[1];
var10009 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, b<"a">(4012, 1464068106395424942L ^ ax));
var28[0] = var10009;
var42.q(var27, var50, var58, 2.0F, 4.0F, var12, var28);
jl var43 = jl.y;
float var51 = var23 - 0.5F;
float var59 = var24 + 2.5F - var26;
var28 = new Color[]{var22};
var43.q(var27, var51, var59, 1.0F, 3.0F, var12, var28);
jl var44 = jl.y;
float var52 = var23 - 6.0F + var26;
float var60 = var24 - 1.0F;
var28 = new Color[1];
var10009 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, b<"a">(4012, 1464068106395424942L ^ ax));
var28[0] = var10009;
var44.q(var27, var52, var60, 4.0F, 2.0F, var12, var28);
boolean var21 = var10000;
jl var37 = jl.y;
float var10002 = var23 - 5.5F + var26;
float var53 = var24 - 0.5F;
var28 = new Color[]{var22};
var37.q(var27, var10002, var53, 3.0F, 1.0F, var12, var28);
jl var38 = jl.y;
var10002 = var23 + 2.0F - var26;
float var54 = var24 - 1.0F;
var28 = new Color[1];
Color var10008 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, b<"a">(4012, 1464068106395424942L ^ ax));
var28[0] = var10008;
var38.q(var27, var10002, var54, 4.0F, 2.0F, var12, var28);
jl var39 = jl.y;
g7 var45 = var27;
var10002 = var23 + 2.5F - var26;
float var55 = var24 - 0.5F;
float var61 = 3.0F;
float var10005 = 1.0F;
var28 = new Color[1];

try {
var28[0] = var22;
var39.q(var45, var10002, var55, var61, var10005, var12, var28);
g7.R(var10, var27, b6.R.Z(), null, null, null, new Matrix3x2f((Matrix3x2fc)context.method_51448()), null, d<"s">(32471, 3541342135729037324L ^ ax), null);
if (!var21) {
vm.a<"Å">(new _g[3], -6031189761757829519L, ax);
}
} catch (NumberFormatException var29) {
throw vm.a<"Å">(var29, -6037461906750728233L, ax);
}
}

static {
long var20 = a ^ 88508942317237L;
long var22 = (var20 ^ 85253599658063L) >>> 8;
int var24 = (int)((var20 ^ 85253599658063L) << 56 >>> 56);
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
String var15 = "\u008b§©\u001b8qÃ_\u000fâ\u00adw\u0093hç\u0099\u0010@-°>\u0099Ð\u0091\u0081Q\u008ce\u0083\u0095>%ô\u0018N\u0096F\u0087òÝ\u0092\u00145,°ÍVwúN_['\"°!o\u00ad";
int var17 = "\u008b§©\u001b8qÃ_\u000fâ\u00adw\u0093hç\u0099\u0010@-°>\u0099Ð\u0091\u0081Q\u008ce\u0083\u0095>%ô\u0018N\u0096F\u0087òÝ\u0092\u00145,°ÍVwúN_['\"°!o\u00ad"
.length();
char var14 = 16;
int var26 = -1;

label45:
while (true) {
String var27 = var15.substring(++var26, var26 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var36 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var26 += var14) >= var17) {
b = var18;
c = new String[5];
k = new HashMap(13);
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
String var4 = "ÔÇü»¤\u0085Eï×ë\\ÈÁE\u0084b";
int var5 = "ÔÇü»¤\u0085Eï×ë\\ÈÁE\u0084b".length();
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
byte var41 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

g = var6;
i = new Integer[2];
F = new g6(var22, (byte)var24);
return;
}

var14 = var15.charAt(var26);
break;
default:
var18[var16++] = var36;
if ((var26 += var14) < var17) {
var14 = var15.charAt(var26);
continue label45;
}

var15 = "õ\u0012\b\tÜ$û/ý\u0096Ó\u009bð\u009b\u0091×ä\u001dþ\u0002<ÎSUJø\u001bÖ»zØ¿\u0010µ\u008c¹\u000f\u0006\u008eèÏFe®b\u0001{\u0012n";
var17 = "õ\u0012\b\tÜ$û/ý\u0096Ó\u009bð\u009b\u0091×ä\u001dþ\u0002<ÎSUJø\u001bÖ»zØ¿\u0010µ\u008c¹\u000f\u0006\u008eèÏFe®b\u0001{\u0012n".length();
var14 = ' ';
var26 = -1;
}

var27 = var15.substring(++var26, var26 + var14);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14952;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/g6", var10);
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
throw new RuntimeException("su/catlean/g6" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 29617;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])k.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/g6", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/g6" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
