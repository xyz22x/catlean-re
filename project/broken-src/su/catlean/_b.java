package su.catlean;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;

public final class _b {
@NotNull
public static final _b E;
@NotNull
private static final class_2960 y;
@NotNull
private static final List q;
private static final long a = yz.a(-3705592923189375570L, 1094611980104253637L, MethodHandles.lookup().lookupClass()).a(24076002932298L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private _b() {
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void o(@NotNull class_4587 m, char a, @NotNull class_238 box, char a, int a) {
long var6 = ((long)ax << 48 | (long)axxx << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
long var8 = var6 ^ 115300975949194L;
long var10 = var6 ^ 57308836162297L;
long var12 = var6 ^ 30344502629059L;
long var14 = var6 ^ 134852058834734L;
long var16 = var6 ^ 96065177261101L;
long var10001 = var6 ^ 129643377512620L;
int var18 = (int)((var6 ^ 129643377512620L) >>> 48);
int var19 = (int)((var6 ^ 129643377512620L) << 16 >>> 32);
int var20 = (int)(var10001 << 48 >>> 48);
long var21 = var6 ^ 113529060996189L;
long var23 = var6 ^ 68515651641831L;
long var25 = var6 ^ 6943741407510L;
var10001 = var6 ^ 50144878024138L;
int var27 = (int)((var6 ^ 50144878024138L) >>> 48);
int var28 = (int)((var6 ^ 50144878024138L) << 16 >>> 32);
int var29 = (int)(var10001 << 48 >>> 48);
long var30 = var6 ^ 103092447488214L;
long var32 = var6 ^ 22792475272415L;
Intrinsics.checkNotNullParameter(m, "m");
_g[] var10000 = vm.a<"Å">(-5261562545398654726L, var6);
Intrinsics.checkNotNullParameter(box, a<"r">(8049, 4854102783809977130L ^ var6));
VertexFormat var10003 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, a<"r">(23837, 3503555647866222912L ^ var6));
int var10004 = b<"b">(9209, 609650728365440031L ^ var6);
Object var34 = null;
byte var35 = 4;
boolean var36 = false;
int var37 = var10004;
VertexFormat var38 = var10003;
g7 var40 = new g7(var8, var38, var37, var36, var35, (DefaultConstructorMarker)var34);
Color var41 = jl.y.p(jh.f.Z(var21, 0), (char)var27, var28, 0.1F, (short)var29);
Color var42 = jl.y.p(jh.f.Z(var21, b<"b">(6359, 8057698829057820467L ^ var6)), (char)var27, var28, 1.0F, (short)var29);
_g[] var39 = var10000;

try {
if (!zi.v.K().method_23093(box)) {
return;
}
} catch (NumberFormatException var61) {
throw vm.a<"Å">(var61, -5331990678747058469L, var6);
}

class_4184 var65 = zf.F(var10).method_1561().field_4686;
Intrinsics.checkNotNull(var65);
class_243 var66 = var65.method_71156();
Intrinsics.checkNotNullExpressionValue(var66, a<"r">(16564, 6379294115170329838L ^ var6));
class_243 var43 = var66;
float var44 = (float)(box.field_1323 - var43.method_10216());
float var45 = (float)(box.field_1322 - var43.method_10214());
float var46 = (float)(box.field_1321 - var43.method_10215());
float var47 = (float)(box.field_1320 - var43.method_10216());
float var48 = (float)(box.field_1325 - var43.method_10214());
float var49 = (float)(box.field_1324 - var43.method_10215());
float var50 = jl.y.T(zf.v(var32).field_6012 - 1.0F, zf.v(var32).field_6012, var30) % b<"b">(17305, 1239611091463036030L ^ var6) / 80.0F;
var40.G(var44, var12, var45, var46).j(0.0F + var50, var25, 1.0F).n(var41, var16);
var40.G(var44, var12, var48, var46).j(0.0F + var50, var25, 0.0F).n(var42, var16);
var40.G(var47, var12, var48, var46).j(0.32F + var50, var25, 0.0F).n(var42, var16);
var40.G(var47, var12, var45, var46).j(0.32F + var50, var25, 1.0F).n(var41, var16);
var40.G(var47, var12, var45, var46).j(0.32F + var50, var25, 1.0F).n(var41, var16);
var40.G(var47, var12, var48, var46).j(0.32F + var50, var25, 0.0F).n(var42, var16);
var40.G(var47, var12, var48, var49).j(0.64F + var50, var25, 0.0F).n(var42, var16);
var40.G(var47, var12, var45, var49).j(0.64F + var50, var25, 1.0F).n(var41, var16);
var40.G(var47, var12, var45, var49).j(0.64F + var50, var25, 1.0F).n(var41, var16);
var40.G(var44, var12, var45, var49).j(0.96F + var50, var25, 1.0F).n(var41, var16);
var40.G(var44, var12, var48, var49).j(0.96F + var50, var25, 0.0F).n(var42, var16);
var40.G(var47, var12, var48, var49).j(0.64F + var50, var25, 0.0F).n(var42, var16);
var40.G(var44, var12, var45, var49).j(0.96F + var50, var25, 1.0F).n(var41, var16);
var40.G(var44, var12, var45, var46).j(1.28F + var50, var25, 1.0F).n(var41, var16);
var40.G(var44, var12, var48, var46).j(1.28F + var50, var25, 0.0F).n(var42, var16);
var40.G(var44, var12, var48, var49).j(0.96F + var50, var25, 0.0F).n(var42, var16);
zi.v.S(box, class_2350.field_11036, var14, jl.y.p(var42, (char)var27, var28, 0.4F, (short)var29));
zi.v.c((char)var18, box, var19, (short)var20, class_2350.field_11036, jl.y.p(var42, (char)var27, var28, 0.4F, (short)var29));
g7.R(
var23,
var40,
b6.R.S(),
null,
null,
m.method_23760().method_23761(),
null,
MapsKt.mapOf(TuplesKt.to(a<"r">(18948, 5292985837035040349L ^ var6), zf.F(var10).method_1531().method_4619(y).method_71659())),
b<"b">(2421, 2226978569543030416L ^ var6),
null
);
Iterable var51 = q;
boolean var52 = false;

label43:
for (Object var54 : var51) {
bt var55 = (bt)var54;
boolean var56 = false;
double var57 = 0.5 + RangesKt.coerceIn(jl.y.T(var55.M() + 1.0F, var55.M(), var30) / 8.0F, 0.0F, 0.5F);
zi var67 = zi.v;
class_238 var70 = box.method_35578(box.field_1325 - (1.0 - var57)).method_1009(-var57, 0.0, -var57);
Intrinsics.checkNotNullExpressionValue(var70, a<"r">(29991, 7864388916488180095L ^ var6));
class_2350 var10002 = class_2350.field_11036;
var34 = jl.y.p(var42, (char)var27, var28, (float)var57, (short)var29);
class_2350 var63 = var10002;
class_238 var64 = var70;

try {
var67.c((char)var18, var64, var19, (short)var20, var63, (Color)var34);
} catch (NumberFormatException var59) {
throw vm.a<"Å">(var59, -5331990678747058469L, var6);
}

do {
try {
var10000 = var39;
if (axx <= 0) {
if (var39 != null) {
return;
}

var10000 = var39;
}

if (var10000 == null) {
continue label43;
}
} catch (NumberFormatException var60) {
throw vm.a<"Å">(var60, -5331990678747058469L, var6);
}
} while (axx >= 0);

return;
}
}

public final void S(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 140401763644291L;
q.add(new bt(var3, 0, 1, null));
}

public final void e() {
q.removeIf(_b::j);
}

private static final boolean q(bt var0) {
long var1 = a ^ 93537942928919L;
Intrinsics.checkNotNullParameter(var0, a<"r">(1704, 4961466815036146973L ^ var1));
_g[] var10000 = vm.a<"Å">(1229776461818035984L, var1);
int var4 = var0.M();
var0.j(var4 + -1);
_g[] var3 = var10000;

try {
if (var3 != null) {
return (boolean)var4;
}

if (var4 < 0) {
return (boolean)1;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 1291074223767931185L, var1);
}

return (boolean)0;
}

private static final boolean j(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 31979969786481L;
long var22 = var20 ^ 59857282987839L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[8];
int var16 = 0;
String var15 = "v\u0093®\u000b\u0007\u0013tk\u001b\u0091Ì\u0017B7Ëq\u0010oß\u0015B\u009dWÔÐÿ:í Å¶çõ(-Q&C\u0002\u0080/9M\u009e*-\u0000Ìqÿ#\u0085Ñë\u008ci\fj\u000f«\u00017=|Ñ½?¡¦ÑÅ\"\u0084³8 \u0094\u000b¹<ù\tEô\u008eF|yÐæ\u0002:²9\\:Hïs\u008a\u0088¹.Xv\bá\n\u0080ó\u008a\u00047Ä\u0005«\nÞãfþã\u00066\u0096\u000fI\u0002:ùÙ\u0010ºEæ?q\u009eæ\u001cÌ[l\u0087\u0003j|! ;©û¦y\u00822\u00172:\u0090%´üÓÒ¨\u001aVuáÊX2\u0011¶Ðdm¬Md";
int var17 = "v\u0093®\u000b\u0007\u0013tk\u001b\u0091Ì\u0017B7Ëq\u0010oß\u0015B\u009dWÔÐÿ:í Å¶çõ(-Q&C\u0002\u0080/9M\u009e*-\u0000Ìqÿ#\u0085Ñë\u008ci\fj\u000f«\u00017=|Ñ½?¡¦ÑÅ\"\u0084³8 \u0094\u000b¹<ù\tEô\u008eF|yÐæ\u0002:²9\\:Hïs\u008a\u0088¹.Xv\bá\n\u0080ó\u008a\u00047Ä\u0005«\nÞãfþã\u00066\u0096\u000fI\u0002:ùÙ\u0010ºEæ?q\u009eæ\u001cÌ[l\u0087\u0003j|! ;©û¦y\u00822\u00172:\u0090%´üÓÒ¨\u001aVuáÊX2\u0011¶Ðdm¬Md"
.length();
char var14 = 16;
int var26 = -1;

label54:
while (true) {
String var27 = var15.substring(++var26, var26 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var26 += var14) >= var17) {
b = var18;
c = new String[8];
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
String var4 = "F\u0000;ô4ç6\u0004-GNvf\u001aã\u0096";
int var5 = "F\u0000;ô4ç6\u0004-GNvf\u001aã\u0096".length();
byte var2 = 0;

label36:
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
e = var6;
f = new Integer[4];
E = new _b();
y = l6.J(a<"r">(6487, 492522006287062661L ^ var20), a<"r">(15517, 329077134311469901L ^ var20), var22);
q = new ArrayList();
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "ìtD\u009a¯n¾µÃ¢\\\u0084]\u0089v\u0014";
var5 = "ìtD\u009a¯n¾µÃ¢\\\u0084]\u0089v\u0014".length();
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

var14 = var15.charAt(var26);
break;
default:
var18[var16++] = var38;
if ((var26 += var14) < var17) {
var14 = var15.charAt(var26);
continue label54;
}

var15 = "nr\u0099\u0097(Zµ\u0011\u0097ßP±²åü»a¡õHàÂpFè$[\u0094\u008fÅ\u0011\u0007 0üt¾v?$ÐX§«êø\n8]&ù/5¢¢\u0015§\u0010Q\u0095Þ\u0099Î6¿";
var17 = "nr\u0099\u0097(Zµ\u0011\u0097ßP±²åü»a¡õHàÂpFè$[\u0094\u008fÅ\u0011\u0007 0üt¾v?$ÐX§«êø\n8]&ù/5¢¢\u0015§\u0010Q\u0095Þ\u0099Î6¿".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21487;
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
throw new RuntimeException("su/catlean/_b", var10);
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
throw new RuntimeException("su/catlean/_b" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 10325;
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
throw new RuntimeException("su/catlean/_b", var14);
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
throw new RuntimeException("su/catlean/_b" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
