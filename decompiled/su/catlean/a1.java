package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class a1 {
@NotNull
public static final om G;
@NotNull
private final String C;
private final Object X;
private Object k;
@Nullable
private h K;
@NotNull
private Function0 e;
@NotNull
private final String T;
@NotNull
private static final Json W;
private static int b;
private static final long a = yz.a(-80565656895778137L, 4596118210747371218L, MethodHandles.lookup().lookupClass()).a(202152887717538L);
private static final String[] f;
private static final String[] h;
private static final Map j = new HashMap(13);
private static final long[] p;
private static final Integer[] q;
private static final Map r;

public a1(@NotNull String id, Object defaultValue, long a, Object value, @Nullable h group, @NotNull Function0 visible) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(id, a<"i">(28965, 7011543114372773533L ^ ax));
Intrinsics.checkNotNullParameter(visible, a<"i">(20965, 5772791761972778577L ^ ax));
super();
this.C = id;
this.X = defaultValue;
this.k = value;
this.K = group;
this.e = visible;
StringBuilder var8 = new StringBuilder();
StringBuilder var9 = var8;
boolean var10 = false;
CharSequence var10000 = this.C;
String[] var11 = new String[]{"-"};
Iterable var23 = StringsKt.split$default(var10000, var11, false, 0, c<"g">(4167, 5947173683324246845L ^ ax), null);
boolean var12 = false;
var var14 = new ArrayList();
boolean var15 = false;
Iterator var16 = var23.iterator();

while (true) {
if (var16.hasNext()) {
Object var17 = var16.next();
String var18 = (String)var17;
boolean var19 = false;

label51: {
try {
var27 = var18.length();
if (ax < 0L) {
break;
}

if (ax < 0L) {
break label51;
}

if (var27 > 0) {
var27 = 1;
break label51;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, 8390506912941757336L, ax);
}

var27 = 0;
}

if (ax > 0L) {
if (var27 == 0) {
continue;
}

var14.add(var17);
}

if (ax >= 0L) {
continue;
}
}

var23 = var14;
boolean var28 = false;
break;
}

Iterator var13 = var23.iterator();

while (true) {
if (var13.hasNext()) {
Object var24 = var13.next();
String var25 = (String)var24;
boolean var26 = false;
var9.append(" ");
String var10001 = var25.substring(0, 1);
Intrinsics.checkNotNullExpressionValue(var10001, a<"i">(31923, 2778076440368085772L ^ ax));
var10001 = var10001.toUpperCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var10001, a<"i">(11120, 8513624315327392973L ^ ax));
var9.append(var10001);
var10001 = var25.substring(1);
Intrinsics.checkNotNullExpressionValue(var10001, a<"i">(27923, 1296234360175487663L ^ ax));
var10001 = var10001.toLowerCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var10001, a<"i">(12068, 2038257147469146270L ^ ax));
var9.append(var10001);
if (ax < 0L) {
break;
}

if (ax >= 0L) {
continue;
}
}

this.T = var8.toString();
break;
}
}

public a1(long var1, String var3, Object var4, Object var5, h var6, Function0 var7, int var8, DefaultConstructorMarker var9) {
var1 = a ^ var1;
long var10 = var1 ^ 42366080420949L;
if ((var8 & 4) != 0) {
var5 = var4;
}

if ((var8 & c<"g">(17316, 4017556356788142087L ^ var1)) != 0) {
var6 = null;
}

if ((var8 & c<"g">(3042, 5268259786534651971L ^ var1)) != 0) {
var7 = a1::y;
}

this(var3, var4, var10, var5, var6, var7);
}

@NotNull
public final String e() {
return this.C;
}

public final Object h() {
return this.X;
}

public final Object F() {
return this.k;
}

public final void H(Object <set-?>) {
this.k = <set-?>;
}

@Nullable
public final h m() {
return this.K;
}

public final void i(@Nullable h <set-?>) {
this.K = <set-?>;
}

@NotNull
public final Function0 c() {
return this.e;
}

public final void u(@NotNull Function0 <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"i">(6253, 5547608452167550795L ^ ax));
this.e = <set-?>;
}

@NotNull
public final String Q() {
return this.T;
}

public final Object E(@Nullable Object thisRef, long a, @NotNull KProperty property) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(property, a<"i">(12510, 7304339117654788976L ^ ax));
return this.k;
}

public final void b(@Nullable Object thisRef, long a, @NotNull KProperty property, Object value) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(property, a<"i">(24597, 3941381526233943132L ^ ax));
this.k = value;
}

public final void A() {
this.k = this.X;
}

public abstract void P(@NotNull String var1, long var2);

private static final boolean y() {
return true;
}

private static final Unit B(JsonBuilder var0) {
long var1 = a ^ 60351554231L;
Intrinsics.checkNotNullParameter(var0, a<"i">(15802, 4174030272011643042L ^ var1));
var0.setIgnoreUnknownKeys(true);
var0.setEncodeDefaults(true);
return Unit.INSTANCE;
}

public static final Json P() {
return W;
}

static {
long var20 = a ^ 82522546182656L;
vm.a<"Å">(0, 6868793528612521096L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "n\u0004\u0015jà\u001f\u0010IèN\u0016÷hd-\u0089§ó¿=Å³p©\u0007º ¯\u0017É±\u0011(p¡ Ð9[\u008c\u007f\u009a¸Ûb¾±»Â×á\u0000ãù\u0005..D¤Åª\u0090zY\u0005Þ{\u0014ØøÇø<\u0018\u001c;î¾M\r:\u0099ñ\u0018\u0006é\u008eÿ\u00ads*\u0017v)q,Ò\u0003 {\b,úîÄ\u008eI!\u0001ïüf\u0098\u001f\ra\u0007¡'R:\u008ejEÃy\u0014²Ë@¦\u0010Ô^2êB\u009fÕ©½\u0088\u000f¢\u0094\u000f\u0016\u009a\u0010»\u008db\u000bð\u000f=ÿÍP\u0080Í<6ÒÈ(}.¼u®vo\u0013¶\u0018½ÈZ0;÷\u0091\u009bPÚ\u00121ag¾\\Åþ\u0002K\u009d£°\u0013ñæá\u009døM \u009f\u0013*Mvà+/çÿ'dÄ¬Y´^Á\f\u0097Î=\u009d&\u0099Ê B\u0018ÃÂ\u0089";
int var17 = "n\u0004\u0015jà\u001f\u0010IèN\u0016÷hd-\u0089§ó¿=Å³p©\u0007º ¯\u0017É±\u0011(p¡ Ð9[\u008c\u007f\u009a¸Ûb¾±»Â×á\u0000ãù\u0005..D¤Åª\u0090zY\u0005Þ{\u0014ØøÇø<\u0018\u001c;î¾M\r:\u0099ñ\u0018\u0006é\u008eÿ\u00ads*\u0017v)q,Ò\u0003 {\b,úîÄ\u008eI!\u0001ïüf\u0098\u001f\ra\u0007¡'R:\u008ejEÃy\u0014²Ë@¦\u0010Ô^2êB\u009fÕ©½\u0088\u000f¢\u0094\u000f\u0016\u009a\u0010»\u008db\u000bð\u000f=ÿÍP\u0080Í<6ÒÈ(}.¼u®vo\u0013¶\u0018½ÈZ0;÷\u0091\u009bPÚ\u00121ag¾\\Åþ\u0002K\u009d£°\u0013ñæá\u009døM \u009f\u0013*Mvà+/çÿ'dÄ¬Y´^Á\f\u0097Î=\u009d&\u0099Ê B\u0018ÃÂ\u0089"
.length();
char var14 = ' ';
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
f = var18;
h = new String[10];
r = new HashMap(13);
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
String var4 = "È\u009c6\u009bß\u0080Ï<Ê@ø~\u0090\u007fcÏ\u0085\u0087úI\u0092ºvQ";
int var5 = "È\u009c6\u009bß\u0080Ï<Ê@ø~\u0090\u007fcÏ\u0085\u0087úI\u0092ºvQ".length();
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

p = var6;
q = new Integer[3];
G = new om(null);
W = JsonKt.Json$default(null, a1::B, 1, null);
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

var15 = "B\"\u00ad¥ÚÑ\u0003ÂâGKÍÆÅ\u0092\"\u0018¹¨äÏ\u008f\u008cÔ¨K<#¯\u0098\u000fÙ»xö\u0094§5îä\"";
var17 = "B\"\u00ad¥ÚÑ\u0003ÂâGKÍÆÅ\u0092\"\u0018¹¨äÏ\u008f\u008cÔ¨K<#¯\u0098\u000fÙ»xö\u0094§5îä\"".length();
var14 = 16;
var23 = -1;
}

var24 = var15.substring(++var23, var23 + var14);
var10001 = 0;
}
}
}

public static void Y(int var0) {
b = var0;
}

public static int L() {
return b;
}

public static int u() {
int var0 = L();

try {
return var0 == 0 ? 62 : 0;
} catch (NumberFormatException var1) {
throw b(var1);
}
}

private static NumberFormatException b(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29479;
if (h[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])j.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/a1", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = f[var5].getBytes("ISO-8859-1");
h[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return h[var5];
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
throw new RuntimeException("su/catlean/a1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16352;
if (q[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = p[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])r.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
r.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/a1", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
q[var3] = var15;
}

return q[var3];
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
throw new RuntimeException("su/catlean/a1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
