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
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class zf {
@NotNull
private static final Logger O;
private static boolean X;
private static final long a = yz.a(333958358984929967L, -4704986976773013367L, MethodHandles.lookup().lookupClass()).a(201317353123063L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@NotNull
public static final class_310 F(long var0) {
var0 = a ^ var0;
class_310 var10000 = class_310.method_1551();
Intrinsics.checkNotNullExpressionValue(var10000, a<"a">(16159, 8687639840359631911L ^ var0));
return var10000;
}

@NotNull
public static final class_746 v(long var0) {
var0 = a ^ var0;
long var2 = var0 ^ 113184718242280L;
class_746 var10000 = F(var2).field_1724;
Intrinsics.checkNotNull(var10000);
return var10000;
}

@NotNull
public static final class_638 z(long var0) {
var0 = a ^ var0;
long var2 = var0 ^ 110946802597711L;
class_638 var10000 = F(var2).field_1687;
Intrinsics.checkNotNull(var10000);
return var10000;
}

@NotNull
public static final class_636 Z(int var0, long var1) {
long var3 = ((long)var0 << 32 | var1 << 32 >>> 32) ^ a;
long var5 = var3 ^ 135710492012775L;
class_636 var10000 = F(var5).field_1761;
Intrinsics.checkNotNull(var10000);
return var10000;
}

@NotNull
public static final class_634 k(long var0) {
var0 = a ^ var0;
long var2 = var0 ^ 38565587174988L;
class_634 var10000 = F(var2).method_1562();
Intrinsics.checkNotNull(var10000);
return var10000;
}

public static final long A() {
return System.currentTimeMillis();
}

@NotNull
public static final Logger x() {
return O;
}

static {
long var9 = a ^ 52529360893046L;
vm.a<"Å">(false, -4953348250851906931L, var9);
Cipher var0;
Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[3];
int var5 = 0;
String var4 = "\u008c\u0013s\u008f\u009e±\u001c\u0085Æ?~ùÔ\u0006\u0092)v¯C\u007fLìÉ]í\u007fÊA)PDi\u0010¨M\u00adñK\u001fceaÿzd§(_¨0øDð\u0093%\u0098Ö\u009d»!=õ|\u0091«Á9\r`©ÝÝT\u001b\n>G¦û\u0012s$ î]TíZ@\u0091~2\u009f\u0098D}a\u0012";
int var6 = "\u008c\u0013s\u008f\u009e±\u001c\u0085Æ?~ùÔ\u0006\u0092)v¯C\u007fLìÉ]í\u007fÊA)PDi\u0010¨M\u00adñK\u001fceaÿzd§(_¨0øDð\u0093%\u0098Ö\u009d»!=õ|\u0091«Á9\r`©ÝÝT\u001b\n>G¦û\u0012s$ î]TíZ@\u0091~2\u009f\u0098D}a\u0012"
.length();
char var3 = ' ';
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var14 = a(var8).intern();
byte var10001 = -1;
var7[var5++] = var14;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[3];
Logger var12 = LoggerFactory.getLogger(a<"a">(3996, 1602177782504084888L ^ var9));
Intrinsics.checkNotNullExpressionValue(var12, a<"a">(4761, 6044804997121296540L ^ var9));
O = var12;
return;
}

var3 = var4.charAt(var2);
}
}

public static void R(boolean var0) {
X = var0;
}

public static boolean m() {
return X;
}

public static boolean c() {
boolean var0 = m();

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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 25021;
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
throw new RuntimeException("su/catlean/zf", var10);
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
throw new RuntimeException("su/catlean/zf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
