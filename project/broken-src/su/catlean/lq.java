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
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import org.jetbrains.annotations.NotNull;

public final class lq {
private static int[] w;
private static final long a = yz.a(-1605791883118183523L, -4771472817612256384L, MethodHandles.lookup().lookupClass()).a(73443944577409L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public static final boolean v(long a, @NotNull class_1799 stack, @NotNull class_5321 enchantment) {
ax = a ^ ax;
long var4 = ax ^ 117831916034411L;
Intrinsics.checkNotNullParameter(stack, a<"q">(42, 7491321449697621666L ^ ax));
Intrinsics.checkNotNullParameter(enchantment, a<"q">(17543, 1611922273399894540L ^ ax));
return class_1890.method_57532(stack).method_57534().contains(zf.z(var4).method_30349().method_58561(enchantment).get());
}

public static final int F(long a, @NotNull class_1799 stack, @NotNull class_5321 enchantment) {
ax = a ^ ax;
long var4 = ax ^ 11884748087543L;
Intrinsics.checkNotNullParameter(stack, a<"q">(2136, 7334472584367408974L ^ ax));
Intrinsics.checkNotNullParameter(enchantment, a<"q">(22891, 2805872082135832190L ^ ax));
return class_1890.method_8225((class_6880)zf.z(var4).method_30349().method_58561(enchantment).get(), stack);
}

public static void R(int[] var0) {
w = var0;
}

public static int[] w() {
return w;
}

static {
long var9 = a ^ 65198939429476L;
vm.a<"Å">(null, -2893437055055322165L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[4];
int var5 = 0;
String var4 = "\u0083\u008dd$®H\b\u008b\u0090Ú\u001c5\u0080½Ö±\u00184ì¥,É6\u0097\rå\u0016{\u0019-\u008aÿr¿\u008b\u0002C(\u0094\u0084z";
int var6 = "\u0083\u008dd$®H\b\u008b\u0090Ú\u001c5\u0080½Ö±\u00184ì¥,É6\u0097\rå\u0016{\u0019-\u008aÿr¿\u008b\u0002C(\u0094\u0084z".length();
char var3 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var4.substring(++var12, var12 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var19;
if ((var12 += var3) >= var6) {
b = var7;
c = new String[4];
return;
}

var3 = var4.charAt(var12);
break;
default:
var7[var5++] = var19;
if ((var12 += var3) < var6) {
var3 = var4.charAt(var12);
continue label27;
}

var4 = "6¦\u001e¸æ$\u0001«C¿¥P§<\u0098û =\u000fø\u0081\u001cY8¹x\u0003¬G&È\u001d\u008c\u0018+XÙÈyë³úÐ¸!\u0086\u0002\u009dW";
var6 = "6¦\u001e¸æ$\u0001«C¿¥P§<\u0098û =\u000fø\u0081\u001cY8¹x\u0003¬G&È\u001d\u008c\u0018+XÙÈyë³úÐ¸!\u0086\u0002\u009dW".length();
var3 = 16;
var12 = -1;
}

var13 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16939;
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
throw new RuntimeException("su/catlean/lq", var10);
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
throw new RuntimeException("su/catlean/lq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
