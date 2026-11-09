package su.catlean;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.class_2338;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_634;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import org.joml.Quaternionfc;
import su.catlean.api.event.events.client.InputSuggestorEvent;
import su.catlean.api.event.events.network.SendMessageEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.gofra.Flow;

public final class pf implements ym {
@NotNull
public static final pf E;
@NotNull
private static String o;
@Nullable
private static class_2338 Y;
@NotNull
private static final List R;
@NotNull
private static final CommandDispatcher I;
private static final long a = yz.a(-121892667972105778L, 725839728142484046L, MethodHandles.lookup().lookupClass()).a(180540112065643L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private pf() {
}

@NotNull
public final String Z() {
return o;
}

public final void E(int a, byte a, @NotNull String <set-?>, int a) {
long var5 = ((long)axxx << 32 | (long)ax << 56 >>> 32 | (long)axx << 40 >>> 40) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"d">(17865, 7398130347326456112L ^ var5));
o = <set-?>;
}

@Nullable
public final class_2338 i() {
return Y;
}

public final void W(@Nullable class_2338 <set-?>) {
Y = <set-?>;
}

@NotNull
public final List d() {
return R;
}

@NotNull
public final CommandDispatcher m() {
return I;
}

private final void e(a3 var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 108222498918684L;
var1.q(var4, I);
R.add(var1);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@Flow
private final void b(SendMessageEvent var1) {
long var2 = a ^ 5089764962315L;
long var4 = var2 ^ 136263564589459L;
boolean var6 = vm.a<"Å">(2675343858335439961L, var2);

label29: {
label28: {
try {
boolean var10000 = StringsKt.startsWith$default(var1.getMessage(), o, false, 2, null);
if (!var6) {
break label28;
}

if (!var10000) {
return;
}
} catch (CommandSyntaxException var10) {
throw vm.a<"Å">(var10, 2692202846336844959L, var2);
}

try {
CommandDispatcher var11 = I;
String var10001 = var1.getMessage().substring(o.length());
Intrinsics.checkNotNullExpressionValue(var10001, a<"d">(28019, 4354274356282308323L ^ var2));
class_634 var10002 = zf.F(var4).method_1562();
Intrinsics.checkNotNull(var10002);
var11.execute(var10001, var10002.method_2875());
} catch (CommandSyntaxException var9) {
break label29;
}
}

try {
;
} catch (CommandSyntaxException var8) {
}
}

var1.cancel();
}

@Flow
private final void r(InputSuggestorEvent var1) {
long var2 = a ^ 57858764633618L;
long var4 = var2 ^ 83357058858890L;
class_634 var10001 = zf.F(var4).method_1562();
Intrinsics.checkNotNull(var10001);
var1.setSource(var10001.method_2875());
var1.setPrefix(o);
var1.setDispatcher(I);
var1.cancel();
}

@Flow
private final void u(Render2DEvent var1) {
long var2 = a ^ 73612587649674L;
long var4 = var2 ^ 67878147474194L;
long var10001 = var2 ^ 573252104522L;
int var6 = (int)((var2 ^ 573252104522L) >>> 32);
int var7 = (int)((var2 ^ 573252104522L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
var10001 = var2 ^ 44904245910337L;
int var9 = (int)((var2 ^ 44904245910337L) >>> 32);
int var10 = (int)((var2 ^ 44904245910337L) << 32 >>> 48);
int var11 = (int)(var10001 << 48 >>> 48);
var10001 = var2 ^ 2567371702200L;
int var12 = (int)((var2 ^ 2567371702200L) >>> 48);
int var13 = (int)((var2 ^ 2567371702200L) << 16 >>> 48);
int var14 = (int)(var10001 << 32 >>> 32);
long var15 = var2 ^ 121918406925750L;
long var17 = var2 ^ 119747229024825L;
long var19 = var2 ^ 39957711438696L;
long var21 = var2 ^ 137977898426317L;
var10001 = var2 ^ 41230469005500L;
int var23 = (int)((var2 ^ 41230469005500L) >>> 32);
int var24 = (int)((var2 ^ 41230469005500L) << 32 >>> 40);
int var25 = (int)(var10001 << 56 >>> 56);
long var26 = var2 ^ 31995718028596L;
if (Y != null) {
float var28 = zf.F(var4).method_22683().method_4486() / 2.0F;
float var29 = 40.0F;
class_4587 var30 = new class_4587();
var30.method_22903();
var30.method_46416(var28, var29, 0.0F);
var30.method_22907(
(Quaternionfc)class_7833.field_40714
.rotationDegrees(90.0F / Math.abs(90.0F / Math.clamp(55.0F, zf.v(var26).method_36455(), 90.0F)) - b<"l">(2589, 6766493654877555588L ^ var2))
);
var30.method_46416(-var28, -var29, 0.0F);
var30.method_22903();
double var31 = jl.y.W(zf.v(var26).field_6014, zf.v(var26).method_23317(), zi.v.n(var9, (char)var10, var11));
double var33 = jl.y.W(zf.v(var26).field_5969, zf.v(var26).method_23321(), zi.v.n(var9, (char)var10, var11));
class_2338 var10000 = Y;
Intrinsics.checkNotNull(Y);
double var38 = var10000.method_10260() - var33;
class_2338 var45 = Y;
Intrinsics.checkNotNull(Y);
float var35 = (float)class_3532.method_15338(Math.toDegrees(Math.atan2(var38, var45.method_10263() - var31)) - 90.0) - zf.v(var26).method_36454();
var30.method_46416(var28, var29, 0.0F);
var30.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(var35));
var30.method_46416(-var28, -var29, 0.0F);
kv.K.L(var23, var24, var30, var28, (byte)var25, var29, 32.0F, jh.f.Z(var15, 0));
var30.method_46416(var28, var29, 0.0F);
var30.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(-var35));
var30.method_46416(-var28, -var29, 0.0F);
var30.method_22909();
var30.method_22909();
dm var39 = dm.h;
class_2338 var46 = Y;
Intrinsics.checkNotNull(Y);
double var10003 = var46.method_46558().field_1352;
class_2338 var10004 = Y;
Intrinsics.checkNotNull(Y);
String var36 = (int)var39.r(var6, var7, var10003, var8, var10004.method_46558().field_1350) + "m";
float var37 = b8.f(var19).D(var17, var36);
Matrix3x2fStack var40 = var1.getContext().method_51448();
Intrinsics.checkNotNullExpressionValue(var40, a<"d">(5600, 1344516731447112947L ^ var2));
x1.n(
var40,
(char)var12,
var28 - var37 / 2.0F - 2.0F,
56.0F,
var37 + 4.0F,
11.0F,
3.0F,
1.5F,
0.0F,
1.0F,
jh.f.T(),
jh.f.F(),
0.0F,
(short)var13,
0.0F,
var14,
0.0F,
b<"l">(27004, 3325976866499209444L ^ var2),
null
);
c6 var41 = b8.f(var19);
class_332 var47 = var1.getContext();
Color var10005 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"d">(31820, 7889304040172395870L ^ var2));
var41.I(var47, var36, var28, 60.0F, var10005, var21);
}
}

static {
long var20 = a ^ 138495540677814L;
long var22 = var20 ^ 56578279649875L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[4];
int var16 = 0;
String var15 = "õV\u0095û\u001a\u0010¨\u009c9\u0016\u0086ðPîÐK\u0018 pZ¶}x\u009e:Ê1\u0013ç\u000fq\u000bÙgÒ]EjE\u001dÇ";
int var17 = "õV\u0095û\u001a\u0010¨\u009c9\u0016\u0086ðPîÐK\u0018 pZ¶}x\u009e:Ê1\u0013ç\u000fq\u000bÙgÒ]EjE\u001dÇ".length();
char var14 = 16;
int var25 = -1;

label45:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var35 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var35;
if ((var25 += var14) >= var17) {
b = var18;
c = new String[4];
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
String var4 = "\u0001q\u0098%D?©'X(L¾ûçä÷";
int var5 = "\u0001q\u0098%D?©'X(L¾ûçä÷".length();
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
byte var40 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
E = new pf();
o = "^";
R = new ArrayList();
I = new CommandDispatcher();
E.e(ad.x, var22);
E.e(a5.t, var22);
E.e(ac.P, var22);
E.e(ay.T, var22);
E.e(ae.M, var22);
E.e(ai.W, var22);
E.e(a4.r, var22);
return;
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var35;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label45;
}

var15 = "ùy\u00adÉCvfZØaÌß\u0086Ðãi Y\fö\u0080]f~#-Ç\u008fÞ\u0007v\u0084\næ\u0014\u009c\u0096«ìqdSux½@¤\u008aÃ";
var17 = "ùy\u00adÉCvfZØaÌß\u0086Ðãi Y\fö\u0080]f~#-Ç\u008fÞ\u0007v\u0084\næ\u0014\u009c\u0096«ìqdSux½@¤\u008aÃ".length();
var14 = 16;
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

private static CommandSyntaxException a(CommandSyntaxException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32587;
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
throw new RuntimeException("su/catlean/pf", var10);
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
throw new RuntimeException("su/catlean/pf" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24515;
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
throw new RuntimeException("su/catlean/pf", var14);
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
throw new RuntimeException("su/catlean/pf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
