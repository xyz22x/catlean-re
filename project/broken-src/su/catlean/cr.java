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
import net.minecraft.class_1792;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cr extends a1 {
private static final long c = yz.a(-7557863578377661354L, -9198139886062345870L, MethodHandles.lookup().lookupClass()).a(1314150921750L);
private static final String[] d;
private static final String[] g;
private static final Map i = new HashMap(13);
private static final long[] l;
private static final Integer[] m;
private static final Map n;

public cr(@NotNull String id, long a, @NotNull nv defaultValue, @Nullable h group, @NotNull Function0 visible) {
a = c ^ a;
long var7 = a ^ 32630506022674L;
Intrinsics.checkNotNullParameter(id, b<"r">(26191, 2014684509813270974L ^ a));
Intrinsics.checkNotNullParameter(defaultValue, b<"r">(2220, 8155753247531239258L ^ a));
Intrinsics.checkNotNullParameter(visible, b<"r">(15615, 5779694564240241420L ^ a));
super(var7, id, defaultValue, null, group, visible, 4, null);
}

public cr(short var1, String var2, nv var3, h var4, Function0 var5, int var6, int var7, DefaultConstructorMarker var8, int var9) {
long var10 = ((long)var1 << 48 | (long)var7 << 32 >>> 16 | (long)var9 << 48 >>> 48) ^ c;
long var12 = var10 ^ 52224221454291L;
if ((var6 & 4) != 0) {
var4 = null;
}

if ((var6 & d<"d">(17698, 7686133927174357481L ^ var10)) != 0) {
var5 = cr::k;
}

this(var2, var12, var3, var4, var5);
}

@Override
public void P(@NotNull String setting, long a) {
long var10001 = a ^ 100557064647339L;
int var4 = (int)((a ^ 100557064647339L) >>> 32);
int var5 = (int)((a ^ 100557064647339L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(setting, b<"r">(22268, 6772680682802084949L ^ a));
Json var8 = a1.G.C();
boolean var10 = false;
var8.getSerializersModule();
Iterable var31 = var8.decodeFromString(new ArrayListSerializer<>(StringSerializer.INSTANCE), setting);
boolean var9 = false;
int[] var7 = vm.a<"Å">(-4949701183071367693L, a);
var var11 = new ArrayList();
boolean var12 = false;
boolean var14 = false;
Iterator var15 = var31.iterator();

while (true) {
if (var15.hasNext()) {
Object var16 = var15.next();
boolean var18 = false;
String var19 = (String)var16;
boolean var20 = false;
class_7922 var10000 = class_7923.field_41178;
Intrinsics.checkNotNullExpressionValue(class_7923.field_41178, b<"r">(26642, 5944984114480988857L ^ a));
Iterable var21 = (Iterable)var10000;
boolean var22 = false;
if (var7 == null) {
break;
}

Iterator var23 = var21.iterator();

label43:
while (true) {
if (!var23.hasNext()) {
var10000 = null;
break;
}

var10000 = (class_7922)var23.next();

while (true) {
Object var24 = var10000;
var10000 = (class_7922)var24;

while (true) {
class_1792 var25 = (class_1792)var10000;
boolean var26 = false;
if (!Intrinsics.areEqual(var25.method_7876(), var19)) {
continue label43;
}

var10000 = (class_7922)var24;
if (a < 0L) {
break;
}

if (var7 != null) {
break label43;
}
}
}
}

class_1792 var33 = (class_1792)var10000;
if ((class_1792)var10000 != null) {
class_1792 var27 = var33;
boolean var28 = false;
var11.add(var27);
}

if (var7 != null) {
continue;
}
}

if (a >= 0L) {
}
break;
}

List var30 = CollectionsKt.toMutableList(var11);
this.H(new nv(var30, var4, (short)var5, (char)var6));
}

@NotNull
@Override
public String toString() {
long var1 = c ^ 87177708184336L;
int[] var10000 = vm.a<"Å">(-451980509849645306L, var1);
Json var4 = a1.G.C();
Iterable var5 = ((nv)this.F()).x();
boolean var6 = false;
int[] var3 = var10000;
Collection var8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, d<"d">(13788, 734908834575553033L ^ var1)));
boolean var9 = false;
Iterator var10 = var5.iterator();

while (true) {
if (var10.hasNext()) {
Object var11 = var10.next();
var17 = var8;
class_1792 var12 = (class_1792)var11;
if (var3 == null) {
break;
}

boolean var13 = false;
var8.add(var12.method_7876());
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

private static final boolean k() {
return true;
}

static {
long var11 = c ^ 8583584161116L;
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
String var17 = "\u0087\u00adòáúãö\u0085\u008d\\X\u0081þ×Ñ©\u0010Ì\u0099\u009f%\u001añ\n]0\u00ad0\u009b\u0097\u0095NÐ\u0010E\u007fppÝ\u009b\\Ô \u0097\u0084\u0089+/\u0018n";
int var19 = "\u0087\u00adòáúãö\u0085\u008d\\X\u0081þ×Ñ©\u0010Ì\u0099\u009f%\u001añ\n]0\u00ad0\u009b\u0097\u0095NÐ\u0010E\u007fppÝ\u009b\\Ô \u0097\u0084\u0089+/\u0018n"
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
String var4 = "\u0095MÊ}\u00974ÙêQé\u001f\u008cØïÕá";
int var5 = "\u0095MÊ}\u00974ÙêQé\u001f\u008cØïÕá".length();
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

var17 = "\u000b¶\u00808eë\u0001*\u009aå¢¥ø\u00ad®\u000e\u0018ñì~\u0001\u0007©6¾X¢\u0083EÁ¢¢±3 \u0082ß\u0097¯IÔ";
var19 = "\u000b¶\u00808eë\u0001*\u009aå¢¥ø\u00ad®\u000e\u0018ñì~\u0001\u0007©6¾X¢\u0083EÁ¢¢±3 \u0082ß\u0097¯IÔ".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4142;
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
throw new RuntimeException("su/catlean/cr", var10);
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
throw new RuntimeException("su/catlean/cr" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24486;
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
throw new RuntimeException("su/catlean/cr", var14);
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
throw new RuntimeException("su/catlean/cr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
