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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import net.minecraft.class_1299;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cj extends a1 {
private static final long c = yz.a(2886572752063812200L, -6668596215421424527L, MethodHandles.lookup().lookupClass()).a(183416573698685L);
private static final String[] d;
private static final String[] g;
private static final Map i = new HashMap(13);
private static final long[] l;
private static final Integer[] m;
private static final Map n;

public cj(@NotNull String id, @NotNull d4 defaultValue, @Nullable h group, long a, @NotNull Function0 visible) {
a = c ^ a;
long var7 = a ^ 54837865062657L;
Intrinsics.checkNotNullParameter(id, b<"f">(31637, 739231505294401273L ^ a));
Intrinsics.checkNotNullParameter(defaultValue, b<"f">(25571, 4497655602581964424L ^ a));
Intrinsics.checkNotNullParameter(visible, b<"f">(4634, 899126369959409525L ^ a));
super(var7, id, defaultValue, null, group, visible, 4, null);
}

public cj(String var1, d4 var2, h var3, long var4, Function0 var6, int var7, DefaultConstructorMarker var8) {
var4 = c ^ var4;
long var9 = var4 ^ 31886007045353L;
if ((var7 & 4) != 0) {
var3 = null;
}

if ((var7 & d<"m">(7054, 1815434658987423833L ^ var4)) != 0) {
var6 = cj::b;
}

this(var1, var2, var3, var9, var6);
}

@Override
public void P(@NotNull String setting, long a) {
long var4 = a ^ 100022379618323L;
Intrinsics.checkNotNullParameter(setting, b<"f">(22828, 8085262179128401674L ^ a));
Json var7 = a1.G.C();
boolean var9 = false;
var7.getSerializersModule();
Iterable var30 = var7.decodeFromString(new ArrayListSerializer<>(StringSerializer.INSTANCE), setting);
boolean var8 = false;
int[] var10000 = vm.a<"Å">(-4949701183071367693L, a);
var var10 = new ArrayList();
boolean var11 = false;
int[] var6 = var10000;
boolean var13 = false;

label56:
for (Object var15 : var30) {
boolean var17 = false;
var10000 = (int[])var15;

do {
String var18 = (String)var10000;
boolean var19 = false;
class_7922 var32 = class_7923.field_41177;
Intrinsics.checkNotNullExpressionValue(class_7923.field_41177, b<"f">(6134, 5785206724299461075L ^ a));
Iterable var20 = (Iterable)var32;
boolean var21 = false;
if (var6 == null) {
break label56;
}

Iterator var22 = var20.iterator();

label48:
while (true) {
if (!var22.hasNext()) {
var10000 = null;
break;
}

var10000 = (int[])var22.next();

while (true) {
Object var23 = var10000;
var10000 = (int[])var23;

while (true) {
class_1299 var24 = (class_1299)var10000;
boolean var25 = false;
if (!Intrinsics.areEqual(var24.method_5882(), var18)) {
continue label48;
}

var10000 = (int[])var23;
if (a < 0L) {
break;
}

if (var6 != null) {
break label48;
}
}
}
}

class_1299 var34 = (class_1299)var10000;
if ((class_1299)var10000 != null) {
class_1299 var26 = var34;
boolean var27 = false;
var10.add(var26);
}

if (var6 != null) {
continue label56;
}

var10000 = (int[])(new _g[2]);
} while (a < 0L);

vm.a<"Å">(var10000, -4926673718981381731L, a);
break;
}

List var29 = CollectionsKt.toMutableList(var10);
this.H(new d4(var29, var4));
}

@NotNull
@Override
public String toString() {
long var1 = c ^ 77380289323881L;
Json var4 = a1.G.C();
Iterable var5 = ((d4)this.F()).q();
int[] var10000 = vm.a<"Å">(-613024985276415550L, var1);
boolean var6 = false;
int[] var3 = var10000;
Collection var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, d<"m">(18496, 2587028142061772249L ^ var1)));
boolean var9 = false;
Iterator var10 = var5.iterator();

while (true) {
if (var10.hasNext()) {
Object var11 = var10.next();
var17 = var8;
class_1299 var12 = (class_1299)var11;
if (var3 == null) {
break;
}

boolean var13 = false;
var8.add(var12.method_5882());
if (var3 != null) {
continue;
}
}

var17 = var8;
break;
}

List var15 = (List)var17;
var6 = false;
var4.getSerializersModule();
return var4.encodeToString(new ArrayListSerializer<>(StringSerializer.INSTANCE), var15);
}

private static final boolean b() {
return true;
}

static {
long var11 = c ^ 125652881387553L;
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
String var17 = "\u0013&\u0007\u008aô\u000bG\u0099\u0082\u001buq\u001bÉÞþ\u0010*\u0004ëíÕ\u0084\u0088\u0017X\u0011à\r0\u000e\rñ \u0098Pv¼\re\u000bå°\u0092\u0015ï¥ã¿\u00197A\u0016\u0005T\u009b(\u0080\u0099ÀÕsðÕ?\u008f";
int var19 = "\u0013&\u0007\u008aô\u000bG\u0099\u0082\u001buq\u001bÉÞþ\u0010*\u0004ëíÕ\u0084\u0088\u0017X\u0011à\r0\u000e\rñ \u0098Pv¼\re\u000bå°\u0092\u0015ï¥ã¿\u00197A\u0016\u0005T\u009b(\u0080\u0099ÀÕsðÕ?\u008f"
.length();
char var16 = 16;
int var23 = -1;

label45:
while (true) {
String var24 = var17.substring(++var23, var23 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = b(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var33;
if ((var23 += var16) >= var19) {
d = var20;
g = new String[5];
n = new HashMap(13);
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
String var4 = "\u007fÂî9\u00973þÍD\u00912\u0016Fñ\u0004Ë";
int var5 = "\u007fÂî9\u00973þÍD\u00912\u0016Fñ\u0004Ë".length();
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

l = var6;
m = new Integer[2];
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

var17 = "\\\u001fzQ¯p»4õ7`\u0085ÞBWÜ Q~\u009f\u0088øî\u0081kK°Æ~«á±y,s® *\u0004?«óX<Ò\b\u0088T\\";
var19 = "\\\u001fzQ¯p»4õ7`\u0085ÞBWÜ Q~\u009f\u0088øî\u0081kK°Æ~«á±y,s® *\u0004?«óX<Ò\b\u0088T\\".length();
var16 = 16;
var23 = -1;
}

var24 = var17.substring(++var23, var23 + var16);
var10001 = 0;
}
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15520;
if (g[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/cj", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
g[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return g[var5];
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
throw new RuntimeException("su/catlean/cj" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25390;
if (m[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = l[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])n.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
n.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/cj", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
m[var3] = var15;
}

return m[var3];
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
throw new RuntimeException("su/catlean/cj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
