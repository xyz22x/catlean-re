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
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2596;
import net.minecraft.class_7202;
import net.minecraft.class_7204;
import org.jetbrains.annotations.NotNull;

public final class _r {
private static int R;
private static final long a = yz.a(3968893076603198003L, -6139546723945905808L, MethodHandles.lookup().lookupClass()).a(280235471804239L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public static final void a(long a, @NotNull class_2596 packet) {
ax = a ^ ax;
long var3 = ax ^ 13169632580300L;
Intrinsics.checkNotNullParameter(packet, a<"h">(26123, 7534980123858906630L ^ ax));
zf.k(var3).method_52787(packet);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static final void M(char a, @NotNull class_2596[] packet, char a, int a) {
long var4 = ((long)ax << 48 | (long)axxx << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
long var6 = var4 ^ 85542662619481L;
int var10000 = vm.a<"Å">(1508911718877913000L, var4);
Intrinsics.checkNotNullParameter(packet, a<"h">(16863, 2607290031045728833L ^ var4));
int var8 = var10000;
class_2596[] var9 = packet;
boolean var10 = false;
int var11 = 0;
int var12 = packet.length;

label45:
while (var11 < var12) {
class_2596 var13 = var9[var11];
class_2596 var14 = var13;
boolean var15 = false;

try {
zf.k(var6).method_52787(var14);
var11++;
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 1479537097887458393L, var4);
}

while (true) {
try {
if (ax < 0 || var8 != 0) {
break label45;
}

if (var8 == 0) {
break;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 1479537097887458393L, var4);
}

if (axxx > 0) {
break label45;
}
}
}

try {
if (ax >= 0 && vm.a<"Å">(1496221886930618962L, var4) != null) {
vm.a<"Å">(++var8, 1543598150584641248L, var4);
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 1479537097887458393L, var4);
}
}

public static final void R(long a, @NotNull class_7204 packetCreator) {
ax = a ^ ax;
long var3 = ax ^ 29405395821529L;
long var5 = ax ^ 27469437118779L;
int var10000 = vm.a<"Å">(-3473739818357143243L, ax);
Intrinsics.checkNotNullParameter(packetCreator, a<"h">(29116, 411937797862568357L ^ ax));
int var7 = var10000;
var var8 = (AutoCloseable & class_7202)zf.z(var3).method_41925().method_41937();
Throwable var9 = null;

try {
class_7202 var10 = (class_7202)var8;
boolean var11 = false;
class_2596 var20 = packetCreator.predict(var10.method_41942());
Intrinsics.checkNotNullExpressionValue(var20, a<"h">(23533, 5688665273136782325L ^ ax));
a(var5, var20);
Unit var19 = Unit.INSTANCE;
} catch (Throwable var15) {
var9 = var15;
throw var15;
} finally {
AutoCloseableKt.closeFinally(var8, var9);
}

try {
var10000 = var7;
if (ax >= 0L) {
if (var7 != 0) {
return;
}

var10000 = 1;
}

vm.a<"Å">(new _g[var10000], -3515459881481878261L, ax);
} catch (Throwable var17) {
throw vm.a<"Å">(var17, -3527638330987577382L, ax);
}
}

public static final void J(@NotNull String command, long a) {
ax = a ^ ax;
long var3 = ax ^ 116249805041997L;
Intrinsics.checkNotNullParameter(command, a<"h">(1993, 9212140276470639684L ^ ax));
zf.k(var3).method_45730(command);
}

public static void X(int var0) {
R = var0;
}

public static int Y() {
return R;
}

public static int w() {
int var0 = Y();

try {
return var0 == 0 ? 122 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var9 = a ^ 100485939174887L;
vm.a<"Å">(0, -4885325726180601928L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[5];
int var5 = 0;
String var4 = "'Ô\u008dW¯\u0091%Õ>Îí;wÎ|\u008a\u0002¦6Ý\u008e\u00941 ;[°à¶j\"Þ\u0018¦çòñ\u0087ÿ-,\u0095\u001f®õ\u001fÈ\u0085ê²öø\u0004¶\u0011\u007f\u0014\u0010òx\u000böõÇç\u0019wR¶ífýÙZ";
int var6 = "'Ô\u008dW¯\u0091%Õ>Îí;wÎ|\u008a\u0002¦6Ý\u008e\u00941 ;[°à¶j\"Þ\u0018¦çòñ\u0087ÿ-,\u0095\u001f®õ\u001fÈ\u0085ê²öø\u0004¶\u0011\u007f\u0014\u0010òx\u000böõÇç\u0019wR¶ífýÙZ"
.length();
char var3 = ' ';
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
c = new String[5];
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

var4 = "¢Ì\u009c\u001ehÌ-\u0087\u0085ÇSÛ\u0080jþ\u0092\u0010 \u0099\u000b\u0006ÛªvSnt¾\u0014pK\u0087:";
var6 = "¢Ì\u009c\u001ehÌ-\u0087\u0085ÇSÛ\u0080jþ\u0092\u0010 \u0099\u000b\u0006ÛªvSnt¾\u0014pK\u0087:".length();
var3 = 16;
var12 = -1;
}

var13 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
}
}

private static Throwable a(Throwable var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3592;
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
throw new RuntimeException("su/catlean/_r", var10);
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
throw new RuntimeException("su/catlean/_r" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
