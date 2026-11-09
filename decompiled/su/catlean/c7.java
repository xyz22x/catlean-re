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

public final class c7 implements ym {
@NotNull
public static final c7 b;
private static boolean M;
private static final long a = yz.a(6441365239734619426L, -2548520157343966958L, MethodHandles.lookup().lookupClass()).a(27629258573058L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);

private c7() {
}

public final boolean Y(long a, @NotNull String name) {
ax = a ^ ax;
long var4 = ax ^ 71238238757772L;
Intrinsics.checkNotNullParameter(name, a<"q">(8902, 8933048608194119181L ^ ax));
return yl.g.g().P(var4).contains(name);
}

public final boolean Q(@NotNull class_1657 player, long a) {
ax = a ^ ax;
long var10001 = ax ^ 13706023131856L;
int var4 = (int)((ax ^ 13706023131856L) >>> 48);
int var5 = (int)((ax ^ 13706023131856L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(player, a<"q">(3211, 2000729433070491173L ^ ax));
String var9 = player.method_7334().name();
Intrinsics.checkNotNullExpressionValue(var9, a<"q">(22364, 3883689854696525299L ^ ax));
String var7 = var9;
return this.h((char)var4, var5, (short)var6, var7);
}

public final boolean h(char a, int a, short a, @NotNull String name) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 18827239259379L;
Intrinsics.checkNotNullParameter(name, a<"q">(26604, 9169933196658646107L ^ var5));
return yl.g.g().P(var7).add(name);
}

public final boolean u(long a, @NotNull class_1657 player) {
ax = a ^ ax;
long var4 = ax ^ 11226144653212L;
Intrinsics.checkNotNullParameter(player, a<"q">(28047, 755588162498614627L ^ ax));
String var10001 = player.method_7334().name();
Intrinsics.checkNotNullExpressionValue(var10001, a<"q">(24622, 1806330715274467521L ^ ax));
return this.j(var4, var10001);
}

public final boolean j(long a, @NotNull String name) {
ax = a ^ ax;
long var4 = ax ^ 7963875474427L;
Intrinsics.checkNotNullParameter(name, a<"q">(26604, 9169948458104724307L ^ ax));
return yl.g.g().P(var4).remove(name);
}

public final void K(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 75690207907022L;
yl.g.g().P(var3).clear();
}

static {
long var9 = a ^ 139875772915231L;
vm.a<"Å">(true, 2676611456589916195L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[6];
int var5 = 0;
String var4 = "Cc¾\u008e\nðs¬$hÜ\u00827¾Ô\u0086Ã±ä¶¥»Òe\u0010»\u0012'#Ô\u000e\u0084\u009a\u0083\n@ØÉa\u0090·\u0010öï\u0015$Ê#ê\u0083ñáoÐ\u000fõ¬ÿ\u0010>~·\t\u009c\u0089Ù\u0005c\u0090:\u001d&\u0082¤E";
int var6 = "Cc¾\u008e\nðs¬$hÜ\u00827¾Ô\u0086Ã±ä¶¥»Òe\u0010»\u0012'#Ô\u000e\u0084\u009a\u0083\n@ØÉa\u0090·\u0010öï\u0015$Ê#ê\u0083ñáoÐ\u000fõ¬ÿ\u0010>~·\t\u009c\u0089Ù\u0005c\u0090:\u001d&\u0082¤E"
.length();
char var3 = 24;
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
c = var7;
d = new String[6];
b = new c7();
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

var4 = "\u0080=w¬Z¤ë\u0081\u0011e@Iäé\u009aL\u0083R=\u00822f&\u0083\u0010\u007fGºu\u001ceÉj\u0014&ÜëÝ©òh";
var6 = "\u0080=w¬Z¤ë\u0081\u0011e@Iäé\u009aL\u0083R=\u00822f&\u0083\u0010\u007fGºu\u001ceÉj\u0014&ÜëÝ©òh".length();
var3 = 24;
var12 = -1;
}

var13 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
}
}

public static void r(boolean var0) {
M = var0;
}

public static boolean e() {
return M;
}

public static boolean Z() {
boolean var0 = e();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27917;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/c7", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/c7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
