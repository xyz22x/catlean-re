package su.catlean;

import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.Color;
import java.awt.Font;
import java.io.Closeable;
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
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

public final class c6 implements Closeable {
@NotNull
private Font h;
@NotNull
private Font t;
private final float m;
@NotNull
private final Object2ObjectOpenHashMap M;
@NotNull
private final Object2ObjectOpenHashMap w;
@NotNull
private final ObjectArrayList D;
@NotNull
private final Char2ObjectArrayMap V;
private int y;
private float i;
private static int[] I;
private static final long a = yz.a(6736742733309809660L, -9218772071814161005L, MethodHandles.lookup().lookupClass()).a(1594835597882L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public c6(@NotNull Font font, @NotNull Font fallBack, long a, float size) {
ax = a ^ ax;
long var6 = ax ^ 115346155808634L;
Intrinsics.checkNotNullParameter(font, a<"j">(27153, 3016822751050632091L ^ ax));
Intrinsics.checkNotNullParameter(fallBack, a<"j">(19609, 5219290038900993304L ^ ax));
super();
this.h = font;
this.t = fallBack;
this.m = size;
this.M = new Object2ObjectOpenHashMap();
this.w = new Object2ObjectOpenHashMap();
this.D = new ObjectArrayList();
this.V = new Char2ObjectArrayMap();
this.F(var6);
}

public final float J() {
return this.i;
}

public final void b(float <set-?>) {
this.i = <set-?>;
}

public final void F(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 101048953319893L;
this.y = zf.F(var3).method_22683().method_4495();
Font var10001 = this.h.deriveFont(this.m * this.y);
Intrinsics.checkNotNullExpressionValue(var10001, a<"j">(19199, 6397190035156566258L ^ var1));
this.h = var10001;
var10001 = this.t.deriveFont(this.m * this.y);
Intrinsics.checkNotNullExpressionValue(var10001, a<"j">(20066, 2622515511379854441L ^ var1));
this.t = var10001;
}

public final void e(@NotNull class_332 context, @NotNull String s, long a, float x, float y, @NotNull Color color) {
ax = a ^ ax;
int var8 = (int)((ax ^ 34791294620017L) >>> 48);
long var9 = (ax ^ 34791294620017L) << 16 >>> 16;
Intrinsics.checkNotNullParameter(context, a<"j">(15468, 6914308122302651183L ^ ax));
Intrinsics.checkNotNullParameter(s, "s");
Intrinsics.checkNotNullParameter(color, a<"j">(12395, 1153435409164015402L ^ ax));
Matrix3x2fStack var10001 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10001, a<"j">(24506, 5674438031609690358L ^ ax));
v(this, var10001, s, (short)var8, x, yx, var9, color, false, 0, b<"m">(15317, 7062647088452828649L ^ ax), null);
}

public final void s(@NotNull Matrix3x2fStack m, long a, @NotNull String s, float x, float y, @NotNull Color color, boolean gradient, int offset) {
ax = a ^ ax;
long var10 = ax ^ 21090385204602L;
Intrinsics.checkNotNullParameter(mx, "m");
Intrinsics.checkNotNullParameter(s, "s");
Intrinsics.checkNotNullParameter(color, a<"j">(26189, 2825046110318547260L ^ ax));
float var10008 = this.y;
float var12 = this.i;
Font var27 = this.t;
Font var26 = this.h;
ObjectArrayList var25 = this.D;
Char2ObjectArrayMap var24 = this.V;
float var23 = var10008;
y3 var15 = y3.i;
boolean var14 = false;
this.i += 0.1F;
Unit var28 = Unit.INSTANCE;
var15.c(mx, s, x, yx, color, gradient, offset, var23, var10, var24, var25, var26, var27, var12, this.w);
}

public final void e(long a, @NotNull Matrix3x2fStack m, @NotNull String s, float x, float y, @NotNull Color color, boolean gradient, int offset) {
ax = a ^ ax;
long var10001 = ax ^ 78317654340373L;
int var10 = (int)((ax ^ 78317654340373L) >>> 32);
int var11 = (int)((ax ^ 78317654340373L) << 32 >>> 40);
int var12 = (int)(var10001 << 56 >>> 56);
Intrinsics.checkNotNullParameter(mx, "m");
Intrinsics.checkNotNullParameter(s, "s");
Intrinsics.checkNotNullParameter(color, a<"j">(26189, 2825027537706605287L ^ ax));
y3.i.e(mx, s, var10, x, yx, var11, color, gradient, offset, this.y, this.V, (byte)var12, this.D, this.h, this.t, this.M);
}

public final void U(@NotNull Matrix3x2fStack m, @NotNull String s, float x, float y, long a, @NotNull Color color) {
ax = a ^ ax;
long var8 = (ax ^ 117605970826437L) >>> 8;
int var10 = (int)((ax ^ 117605970826437L) << 56 >>> 56);
long var11 = ax ^ 59900836795598L;
int var13 = (int)((ax ^ 103929427597315L) >>> 48);
long var14 = (ax ^ 103929427597315L) << 16 >>> 16;
Intrinsics.checkNotNullParameter(mx, "m");
Intrinsics.checkNotNullParameter(s, "s");
Intrinsics.checkNotNullParameter(color, a<"j">(26189, 2825142269264889973L ^ ax));
v(
this,
mx,
s,
(short)var13,
x - this.D(var11, s) / 2.0F,
yx - y3.i.l(s, this.V, this.D, var8, this.h, (byte)var10, this.t, this.y) / 2.0F,
var14,
color,
false,
0,
b<"m">(2825, 2335382811096286276L ^ ax),
null
);
}

public final void I(@NotNull class_332 context, @NotNull String s, float x, float y, @NotNull Color color, long a) {
ax = a ^ ax;
long var8 = (ax ^ 58767449936141L) >>> 8;
int var10 = (int)((ax ^ 58767449936141L) << 56 >>> 56);
long var11 = ax ^ 116541169225990L;
int var13 = (int)((ax ^ 1105660091851L) >>> 48);
long var14 = (ax ^ 1105660091851L) << 16 >>> 16;
Intrinsics.checkNotNullParameter(context, a<"j">(15468, 6914309930825111445L ^ ax));
Intrinsics.checkNotNullParameter(s, "s");
Intrinsics.checkNotNullParameter(color, a<"j">(26189, 2825081226876849597L ^ ax));
Matrix3x2fStack var10001 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10001, a<"j">(6021, 8754234424432753778L ^ ax));
v(
this,
var10001,
s,
(short)var13,
x - this.D(var11, s) / 2.0F,
yx - y3.i.l(s, this.V, this.D, var8, this.h, (byte)var10, this.t, this.y) / 2.0F,
var14,
color,
false,
0,
b<"m">(2825, 2335307513761989004L ^ ax),
null
);
}

public final void g(int var1, char var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 228582250798L;
y3.i.F(this.w, var6);
this.i = 0.0F;
}

public final float D(long a, @NotNull String s) {
ax = a ^ ax;
int var4 = (int)((ax ^ 132821835272198L) >>> 48);
long var5 = (ax ^ 132821835272198L) << 16 >>> 16;
Intrinsics.checkNotNullParameter(s, "s");
return y3.i.p(s, this.V, this.D, (char)var4, this.h, var5, this.t, this.y);
}

@Override
public void close() {
c6 var1 = this;

try {
c6 var5 = var1;
boolean var3 = false;
var5.D.removeIf(c6::B);
var5.V.clear();
var5 = (c6)Result.constructor-impl(Unit.INSTANCE);
} catch (Throwable var4) {
Object var2 = Result.constructor-impl(ResultKt.createFailure(var4));
}
}

public final void A(@NotNull class_332 context, @NotNull String s, long a, float x, float y, int offset) {
ax = a ^ ax;
long var8 = ax ^ 138142124648502L;
Intrinsics.checkNotNullParameter(context, a<"j">(15468, 6914329501615531019L ^ ax));
Intrinsics.checkNotNullParameter(s, "s");
Matrix3x2fStack var10001 = context.method_51448();
Intrinsics.checkNotNullExpressionValue(var10001, a<"j">(6021, 8754289454472630252L ^ ax));
Color var10005 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"j">(19004, 2508132227816313424L ^ ax));
boolean var11 = true;
Color var12 = var10005;
Matrix3x2fStack var16 = var10001;
this.e(var8, var16, s, x, yx, var12, var11, offset);
}

public final void g(long a, @NotNull class_332 context, @NotNull String s, float x, float y, int i) {
ax = a ^ ax;
long var8 = ax ^ 405227637233L;
long var10 = ax ^ 39548728223643L;
Intrinsics.checkNotNullParameter(context, a<"j">(25291, 196229219828596642L ^ ax));
Intrinsics.checkNotNullParameter(s, "s");
this.A(context, s, var8, x - this.D(var10, s) / 2.0F, yx, ix);
}

private static final boolean z(fj var0) {
long var1 = a ^ 38967728241588L;
long var3 = var1 ^ 50430882285468L;
var0.q(var3);
return true;
}

private static final boolean B(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

public static void M(int[] var0) {
I = var0;
}

public static int[] t() {
return I;
}

static {
long var20 = a ^ 7374643077087L;
int[] var10000 = new int[3];
vm.a<"Å">(var10000, -7869436503064945672L, var20);
Cipher var11;
Cipher var25 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var25.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[11];
int var16 = 0;
String var15 = "ºyÓ^\u008dËö¢o\u0087Í¶\u0095¾YÄ<\u0005µ_\u0095×©\u0081FÒe\u0088\fíþ\u00ad\u0010\u0092¬\u0086hÐh\u0014\u0097ý_E§ýv,Ê ß¢n¼\u0092|-;«%W\t÷\u008a2T(\u0093Ü°>ÛÈú\u001a\u0091éO\u0091£\u0007H\u0010êÆarI\u0094¨DaÑMÝ:ð\u0019\u009a A\\Ê\u008a\u0097X\u001e!ø&nàå6?VÓz$\u001eÔ\u0015\r.¬D\u00993îåvÇ\u0018rv´\u000ePÇá\u0081FÈÉ\u0001LÈ$\u0086Ñv}î\u0016Ù/\u001e\u00181ï»ª\u0099\u008bD¿T,C\u0083qñ\u0017ðx;»hqæøH\u0010_\u0010\u0099y\"¹³KÛ\\Búu\u009b½Z\u0010¦\u008cY¡¯©ÿÙ/\u0010T#\u0014Ú\u007fº";
int var17 = "ºyÓ^\u008dËö¢o\u0087Í¶\u0095¾YÄ<\u0005µ_\u0095×©\u0081FÒe\u0088\fíþ\u00ad\u0010\u0092¬\u0086hÐh\u0014\u0097ý_E§ýv,Ê ß¢n¼\u0092|-;«%W\t÷\u008a2T(\u0093Ü°>ÛÈú\u001a\u0091éO\u0091£\u0007H\u0010êÆarI\u0094¨DaÑMÝ:ð\u0019\u009a A\\Ê\u008a\u0097X\u001e!ø&nàå6?VÓz$\u001eÔ\u0015\r.¬D\u00993îåvÇ\u0018rv´\u000ePÇá\u0081FÈÉ\u0001LÈ$\u0086Ñv}î\u0016Ù/\u001e\u00181ï»ª\u0099\u008bD¿T,C\u0083qñ\u0017ðx;»hqæøH\u0010_\u0010\u0099y\"¹³KÛ\\Búu\u009b½Z\u0010¦\u008cY¡¯©ÿÙ/\u0010T#\u0014Ú\u007fº"
.length();
char var14 = ' ';
int var24 = -1;

label54:
while (true) {
String var26 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var37;
if ((var24 += var14) >= var17) {
b = var18;
c = new String[11];
g = new HashMap(13);
Cipher var0;
Cipher var28 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var28.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[6];
int var3 = 0;
String var4 = "Z\u0016\u0018Ò\u0010\u0091¹'FgbÇ \u0000\u0089 K\u0010\u0004¸h\u0099ô\"L\böÌ¿\u008bª\u0085";
int var5 = "Z\u0016\u0018Ò\u0010\u0091¹'FgbÇ \u0000\u0089 K\u0010\u0004¸h\u0099ô\"L\böÌ¿\u008bª\u0085".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var29 = var6;
var10001 = var3++;
long var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var44 = -1;

while (true) {
long var8 = var41;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var46 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var44) {
case 0:
var29[var10001] = var46;
if (var2 >= var5) {
e = var6;
f = new Integer[6];
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "¿=â+\u0093ÅúË\\¤\u0099ù\u001a©Mo";
var5 = "¿=â+\u0093ÅúË\\¤\u0099ù\u001a©Mo".length();
var2 = 0;
}

byte var35 = var2;
var2 += 8;
var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
var29 = var6;
var10001 = var3++;
var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var44 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var37;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "6Ò/³\u008bÉ¹*ÈV\u008d`\u001b÷èZ\u0010S¨Ú½\u0083¾;.\u0096ïÌs©j\u0084-";
var17 = "6Ò/³\u008bÉ¹*ÈV\u008d`\u001b÷èZ\u0010S¨Ú½\u0083¾;.\u0096ïÌs©j\u0084-".length();
var14 = 16;
var24 = -1;
}

var26 = var15.substring(++var24, var24 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9879;
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
throw new RuntimeException("su/catlean/c6", var10);
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
throw new RuntimeException("su/catlean/c6" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18403;
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
throw new RuntimeException("su/catlean/c6", var14);
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
throw new RuntimeException("su/catlean/c6" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
