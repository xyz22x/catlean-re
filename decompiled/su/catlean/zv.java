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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;

public final class zv {
private static String[] W;
private static final long a = yz.a(-2042604440430459720L, -2509223532470052561L, MethodHandles.lookup().lookupClass()).a(96248766747759L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public static final boolean a(@NotNull class_1657 $this$isHomie, long a) {
ax = a ^ ax;
long var3 = ax ^ 98055092013699L;
Intrinsics.checkNotNullParameter($this$isHomie, a<"l">(7651, 2010793749049142302L ^ ax));
c7 var10000 = c7.b;
String var10001 = $this$isHomie.method_7334().name();
Intrinsics.checkNotNullExpressionValue(var10001, a<"l">(16814, 634155749962166354L ^ ax));
return var10000.Y(var3, var10001);
}

public static void S(String[] var0) {
W = var0;
}

public static String[] S() {
return W;
}

static {
long var9 = a ^ 49253370351424L;
String[] var10000 = new String[3];
vm.a<"Å">(var10000, -318243383440431972L, var9);
Cipher var0;
Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[2];
int var5 = 0;
String var4 = " \u0005pi\u001cÙNYõ\u0004Þ\u00ad´OQ\u0012zí$q'\u0005±{\u0010µÏ\u0095ºnõ\u0091\u0099Gã)s2JT+";
int var6 = " \u0005pi\u001cÙNYõ\u0004Þ\u00ad´OQ\u0012zí$q'\u0005±{\u0010µÏ\u0095ºnõ\u0091\u0099Gã)s2JT+".length();
char var3 = 24;
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var14 = a(var8).intern();
byte var10001 = -1;
var7[var5++] = var14;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[2];
return;
}

var3 = var4.charAt(var2);
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 2422;
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
throw new RuntimeException("su/catlean/zv", var10);
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
throw new RuntimeException("su/catlean/zv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
