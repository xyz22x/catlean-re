package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class ky extends _g {
@NotNull
public static final ky i;
private static final long a = yz.a(-6087483583114611890L, 1560149138984422937L, MethodHandles.lookup().lookupClass()).a(79624201852193L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private ky(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 8844980488238L;
super(b<"a">(16636, 6247312428455906174L ^ var1), jt.d(), null, 4, null, var3);
}

@Flow
public final void i(@NotNull PlayerUpdateEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Flow
private final void I(Render3DEvent var1) {
long var2 = a ^ 42657662686206L;
long var4 = var2 ^ 49235751892378L;
long var6 = var2 ^ 103268646042711L;
long var8 = var2 ^ 11136405932277L;
class_2338 var10000 = class_2338.method_49638((class_2374)zf.v(var8).method_33571());
Intrinsics.checkNotNullExpressionValue(var10000, b<"a">(632, 8984687489869613714L ^ var2));
class_2338 var11 = var10000;
int var12 = c<"g">(19698, 4945938151529732024L ^ var2);
IntRange var13 = new IntRange(var11.method_10263() - var12, var11.method_10263() + var12);
IntRange var14 = new IntRange(var11.method_10264() - var12, var11.method_10264() + var12);
IntRange var15 = new IntRange(var11.method_10260() - var12, var11.method_10260() + var12);
long var63 = 0L;
long var65 = 0L;
Iterable var16 = var13;
int var79 = vm.a<"Å">(-2735167759481087765L, var2);
boolean var17 = false;
Collection var19 = new ArrayList();
boolean var20 = false;
Iterator var21 = var16.iterator();
int var10 = var79;

label77:
while (true) {
Iterator var80 = var21;

label74:
while (true) {
if (!var80.hasNext()) {
break label77;
}

int var22 = ((IntIterator)var21).nextInt();
int var23 = var22;
boolean var24 = false;
Iterable var25 = var14;
boolean var26 = false;
var var28 = new ArrayList();
boolean var29 = false;
if (var10 != 0) {
break label77;
}

Iterator var30 = var25.iterator();

label71:
while (true) {
int var81 = var30.hasNext();

label69:
while (true) {
if (!var81) {
break label71;
}

int var31 = ((IntIterator)var30).nextInt();
int var32 = var31;
boolean var33 = false;
Iterable var34 = var15;
boolean var35 = false;
var var37 = new ArrayList();
boolean var38 = false;
boolean var40 = false;
var80 = var34.iterator();
if (var10 != 0) {
continue label74;
}

Iterator var41 = var80;

while (var41.hasNext()) {
int var42 = ((IntIterator)var41).nextInt();
boolean var44 = false;
int var45 = var42;
boolean var46 = false;
la.l.t(false);
float var47 = 0.0F;
boolean var48 = false;
long var49 = zf.A();
boolean var53 = false;
la var82 = la.l;
class_243 var10001 = new class_2338(var23, var32, var42).method_46558().method_1031(0.0, 0.5, 0.0);
Intrinsics.checkNotNullExpressionValue(var10001, b<"a">(11635, 299915561196561823L ^ var2));
var47 = la.K(var82, var10001, null, 0, true, null, false, c<"g">(12931, 4431221431229721034L ^ var2), null, var6);
Unit var54 = Unit.INSTANCE;
var65 += TuplesKt.to(var54, zf.A() - var49).getSecond().longValue();
la.l.t(true);
float var76 = 0.0F;
boolean var55 = false;
long var56 = zf.A();
boolean var58 = false;
la var83 = la.l;
var10001 = new class_2338(var23, var32, var42).method_46558().method_1031(0.0, 0.5, 0.0);
Intrinsics.checkNotNullExpressionValue(var10001, b<"a">(26675, 8400330094333550810L ^ var2));
float var77 = la.K(var83, var10001, null, 0, true, null, false, c<"g">(13119, 1780541821551880308L ^ var2), null, var6);
var54 = Unit.INSTANCE;
var63 += TuplesKt.to(var54, zf.A() - var56).getSecond().longValue();
float var85;
var81 = (var85 = var47 - var77) == 0.0F ? 0 : (var85 < 0.0F ? -1 : 1);
if (var10 != 0) {
continue label69;
}

label63: {
label62: {
try {
if (var10 != 0) {
break label63;
}

if (!var81) {
break label62;
}
} catch (NumberFormatException var73) {
throw vm.a<"Å">(var73, -2724730764411336464L, var2);
}

var81 = 0;
break label63;
}

var81 = 1;
}

try {
if (!var81) {
o2.S(i, new class_2338(var23, var32, var45) + " " + var47 + b<"a">(5864, 7279393270654868997L ^ var2) + var77, false, 2, null, var4);
}
} catch (NumberFormatException var72) {
throw vm.a<"Å">(var72, -2724730764411336464L, var2);
}

Unit var59 = Unit.INSTANCE;
boolean var60 = false;
var37.add(var59);
if (var10 != 0) {
break;
}
}

var var61 = var37;
CollectionsKt.addAll(var28, var61);
if (var10 != 0) {
break label71;
}
break;
}
}

var var62 = var28;
CollectionsKt.addAll(var19, var62);
if (var10 == 0) {
break;
}
break label77;
}
}

int var74 = (int)((float)(var65 - var63) / (float)Math.max(var65, 1L) * 100.0F);
o2.S(
this,
b<"a">(9866, 7389913208485293668L ^ var2)
+ var65
+ b<"a">(14282, 7080206436270980897L ^ var2)
+ var63
+ b<"a">(22067, 8389765021697105627L ^ var2)
+ var74
+ "%",
false,
2,
null,
var4
);
}

static {
long var20 = a ^ 91727540528158L;
long var22 = var20 ^ 134496626408681L;
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
String var15 = "\r®úÚ\u0010Ö\u0087\u0011ý[\u008f\u0082ò\u001d!\u0002JHVJAða½\u008fÖ\u0094g¸¤ý&\u0018\u0010dr\u0096Ñ-\u0097°âß&ì3É¹ç\nï]µx\u001e\u007f\u0004 \u001f:\u008fÅñ\u0096ªÜd\u0096Î\u0081\u008dÝ!\u0002Vð_³FÐ£\u0002Ý\u0084>K\u009f\u00ad¸¡\u0018\u0014\u008c\u001d\u009cW¶\u0010º\u008bäåë\u0001ùqÖÜ.¸ë¦ghL\u0010t\u0088ê§\u0098sF\u008dÜ]ïnòn)`\u0010\u0017ß»º6\u0014[D\u0098; lóçû\u009a";
int var17 = "\r®úÚ\u0010Ö\u0087\u0011ý[\u008f\u0082ò\u001d!\u0002JHVJAða½\u008fÖ\u0094g¸¤ý&\u0018\u0010dr\u0096Ñ-\u0097°âß&ì3É¹ç\nï]µx\u001e\u007f\u0004 \u001f:\u008fÅñ\u0096ªÜd\u0096Î\u0081\u008dÝ!\u0002Vð_³FÐ£\u0002Ý\u0084>K\u009f\u00ad¸¡\u0018\u0014\u008c\u001d\u009cW¶\u0010º\u008bäåë\u0001ùqÖÜ.¸ë¦ghL\u0010t\u0088ê§\u0098sF\u008dÜ]ïnòn)`\u0010\u0017ß»º6\u0014[D\u0098; lóçû\u009a"
.length();
char var14 = ' ';
int var25 = -1;

label45:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var35 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var35;
if ((var25 += var14) >= var17) {
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
long[] var6 = new long[3];
int var3 = 0;
String var4 = "ª\t[D.\t\u0093;Ä\u0001\t¬«\\jyñt_¾ó\u001a\u00883";
int var5 = "ª\t[D.\t\u0093;Ä\u0001\t¬«\\jyñt_¾ó\u001a\u00883".length();
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
f = new Integer[3];
i = new ky(var22);
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

var15 = "º@&%\u0016Ì®råkÖ%\u0090aÖ´-ýýâ\u0088\u0007~\u0002JMkhX¹»´\u0010\u0098l&_ótFUÔÛÏ\u0098af{¥";
var17 = "º@&%\u0016Ì®råkÖ%\u0090aÖ´-ýýâ\u0088\u0007~\u0002JMkhX¹»´\u0010\u0098l&_ótFUÔÛÏ\u0098af{¥".length();
var14 = ' ';
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21360;
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
throw new RuntimeException("su/catlean/ky", var10);
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
throw new RuntimeException("su/catlean/ky" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16593;
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
throw new RuntimeException("su/catlean/ky", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ky" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
