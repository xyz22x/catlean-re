package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;

public final class mf {
@NotNull
private static final Random h;
private static String V;
private static final long a = yz.a(5536565806165132523L, -9036113055716603830L, MethodHandles.lookup().lookupClass()).a(141477773666705L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@NotNull
public static final Random c() {
return h;
}

public static final int O(int from, int to, boolean normalDistribution) {
return MathKt.roundToInt(from + (to - from) * (float)T(normalDistribution));
}

public static final float q(float from, float to, boolean normalDistribution) {
return from + (to - from) * (float)T(normalDistribution);
}

public static final double q(double from, double to, boolean normalDistribution) {
return from + (to - from) * T(normalDistribution);
}

public static final double x(char a, @NotNull ClosedRange range, int a, boolean normalDistribution, char a) {
long var5 = ((long)ax << 48 | (long)axxx << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(range, a<"p">(17089, 6256282029613139003L ^ var5));
return q(((Number)range.getStart()).doubleValue(), ((Number)range.getEndInclusive()).doubleValue(), normalDistribution);
}

public static final float G(@NotNull ClosedRange range, boolean normalDistribution, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(range, a<"p">(17089, 6256308839627715655L ^ ax));
return q(((Number)range.getStart()).floatValue(), ((Number)range.getEndInclusive()).floatValue(), normalDistribution);
}

public static final int N(int a, @NotNull ClosedRange range, boolean normalDistribution, int a) {
long var4 = ((long)ax << 32 | (long)axx << 32 >>> 32) ^ a;
vm.a<"Å">(6829613467392648739L, var4);
Intrinsics.checkNotNullParameter(range, a<"p">(1417, 7650430124582356178L ^ var4));

try {
int var10000 = O(((Number)range.getStart()).intValue(), ((Number)range.getEndInclusive()).intValue(), normalDistribution);
if (vm.a<"Å">(6880019209929441771L, var4) != null) {
vm.a<"Å">("sx0s2", 6880583297803749017L, var4);
}

return var10000;
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 6869676539841772883L, var4);
}
}

public static final double T(boolean normalDistribution) {
return h.nextDouble();
}

public static final double x() {
return h.nextGaussian();
}

static {
long var16 = a ^ 54138755450234L;
vm.a<"Å">(null, 1199877685893810499L, var16);
Cipher var7;
Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var14 = new String[2];
int var12 = 0;
String var11 = "\"Àâ°\u0083å'qå\u0005?úøéÌ¥\u0010âbc½Ñ\u001a¿vÊÐ\\\u008bk ¢\t";
int var13 = "\"Àâ°\u0083å'qå\u0005?úøéÌ¥\u0010âbc½Ñ\u001a¿vÊÐ\\\u008bk ¢\t".length();
char var10 = 16;
int var9 = -1;

while (true) {
byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
String var22 = a(var15).intern();
byte var10001 = -1;
var14[var12++] = var22;
if ((var9 += var10) >= var13) {
b = var14;
c = new String[2];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = 4021029342340558443L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var25 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
var10001 = -1;
long var0 = var25;
h = new Random(var0);
return;
}

var10 = var11.charAt(var9);
}
}

public static void V(String var0) {
V = var0;
}

public static String y() {
return V;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8049;
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
throw new RuntimeException("su/catlean/mf", var10);
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
throw new RuntimeException("su/catlean/mf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
