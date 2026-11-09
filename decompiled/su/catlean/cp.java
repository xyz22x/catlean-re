package su.catlean;

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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

public final class cp extends a1 {
@NotNull
private final Json O;
private static boolean R;
private static final long c = yz.a(-4449504676016077563L, 2514791606364915833L, MethodHandles.lookup().lookupClass()).a(94163464099200L);
private static final String[] d;
private static final String[] g;
private static final Map i = new HashMap(13);
private static final long l;

public cp(@NotNull String id, long a, @NotNull h defaultValue, @NotNull Function0 visible) {
a = c ^ a;
long var6 = a ^ 53502979339980L;
Intrinsics.checkNotNullParameter(id, b<"d">(31103, 7212638214138686196L ^ a));
Intrinsics.checkNotNullParameter(defaultValue, b<"d">(19434, 3844441610100725862L ^ a));
Intrinsics.checkNotNullParameter(visible, b<"d">(8821, 7569904881246351869L ^ a));
super(var6, id, defaultValue, null, null, visible, (int)l, null);
this.O = JsonKt.Json$default(null, cp::Q, 1, null);
}

@Override
public void P(@NotNull String setting, long a) {
Intrinsics.checkNotNullParameter(setting, b<"d">(15552, 9119464687576259528L ^ a));
this.H(this.h());
}

@NotNull
@Override
public String toString() {
long var1 = c ^ 39449621398747L;
return b<"d">(27104, 3615085952265221204L ^ var1) + this.e();
}

private static final boolean Z() {
return true;
}

private static final Unit Q(JsonBuilder var0) {
long var1 = c ^ 14351894777572L;
Intrinsics.checkNotNullParameter(var0, b<"d">(8782, 8596439157633070534L ^ var1));
var0.setIgnoreUnknownKeys(true);
var0.setEncodeDefaults(true);
return Unit.INSTANCE;
}

public static void y(boolean var0) {
R = var0;
}

public static boolean W() {
return R;
}

public static boolean w() {
boolean var0 = W();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var14 = c ^ 97834440019814L;
vm.a<"Å">(false, -3846817111430781945L, var14);
Cipher var5;
Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var12 = new String[6];
int var10 = 0;
String var9 = "\u0010)qªçÜ\r¸\u0082²tRfÁåb ü³U\f±\n«\u0013iãNÖ$Çp<2Êy`cl\u009b»\t¦'?a\u0000\u0097)\u0010<\u0096v\u0014'\u008dëeê\u00936R\u000e1è'\u0010éã5°M\u00adá(oÁ\u0081ue#|±";
int var11 = "\u0010)qªçÜ\r¸\u0082²tRfÁåb ü³U\f±\n«\u0013iãNÖ$Çp<2Êy`cl\u009b»\t¦'?a\u0000\u0097)\u0010<\u0096v\u0014'\u008dëeê\u00936R\u000e1è'\u0010éã5°M\u00adá(oÁ\u0081ue#|±"
.length();
char var8 = 16;
int var17 = -1;

label37:
while (true) {
String var18 = var9.substring(++var17, var17 + var8);
byte var10001 = -1;

while (true) {
byte[] var13 = var5.doFinal(var18.getBytes("ISO-8859-1"));
String var26 = b(var13).intern();
switch (var10001) {
case 0:
var12[var10++] = var26;
if ((var17 += var8) >= var11) {
d = var12;
g = new String[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 1406886801301855544L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var30 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
var10001 = -1;
l = var30;
return;
}

var8 = var9.charAt(var17);
break;
default:
var12[var10++] = var26;
if ((var17 += var8) < var11) {
var8 = var9.charAt(var17);
continue label37;
}

var9 = ")4:e#oZeê)ãÎFb£\u001cöYel\u001bËÞ!Ç\n¸\bZ\bÄ\u008c\u0010\u0090\u0087\u0010/\u008ca®Ü\u0011\u0013¨\u008aRrË\u0011";
var11 = ")4:e#oZeê)ãÎFb£\u001cöYel\u001bËÞ!Ç\n¸\bZ\bÄ\u008c\u0010\u0090\u0087\u0010/\u008ca®Ü\u0011\u0013¨\u008aRrË\u0011".length();
var8 = ' ';
var17 = -1;
}

var18 = var9.substring(++var17, var17 + var8);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 7562;
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
throw new RuntimeException("su/catlean/cp", var10);
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
throw new RuntimeException("su/catlean/cp" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
