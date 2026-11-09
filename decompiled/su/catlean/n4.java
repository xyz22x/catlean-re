package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class n4 implements Comparator {
private static final long a = yz.a(5739702954352047097L, 1253868914171673046L, MethodHandles.lookup().lookupClass()).a(115921592367369L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

@Override
public final int compare(Object a, Object b) {
long var3 = a ^ 22551944432562L;
long var5 = var3 ^ 28241772562184L;
long var10001 = var3 ^ 27415726801783L;
int var7 = (int)((var3 ^ 27415726801783L) >>> 32);
int var8 = (int)((var3 ^ 27415726801783L) << 32 >>> 56);
int var9 = (int)(var10001 << 40 >>> 40);
long var10 = var3 ^ 39060094562566L;
int[] var10000 = vm.a<"Å">(-7180961053569242623L, var3);
class_2338 var13 = (class_2338)ax;
int[] var12 = var10000;
boolean var14 = false;

label39: {
try {
if (ev.j(var5, ev.N) == bm.FOV) {
var22 = u_.c.l(var7, (byte)var8, var13, var9);
break label39;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -7092937242493282983L, var3);
}

dm var21 = dm.h;
class_243 var27 = var13.method_46558();
Intrinsics.checkNotNullExpressionValue(var27, a<"a">(1216, 1579698057423261428L ^ var3));
var22 = var21.R(var10, var27);
}

Comparable var23 = var22;
var13 = (class_2338)bx;
Comparable var15 = var23;
var14 = false;

label31: {
try {
if (ev.j(var5, ev.N) == bm.FOV) {
var25 = u_.c.l(var7, (byte)var8, var13, var9);
break label31;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, -7092937242493282983L, var3);
}

dm var24 = dm.h;
class_243 var28 = var13.method_46558();
Intrinsics.checkNotNullExpressionValue(var28, a<"a">(18621, 8461860914566087304L ^ var3));
var25 = var24.R(var10, var28);
}

try {
int var26 = ComparisonsKt.compareValues(var15, var25);
if (var12 != null) {
vm.a<"Å">(new _g[3], -7179056060346886557L, var3);
}

return var26;
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, -7092937242493282983L, var3);
}
}

static {
long var0 = a ^ 108030937050812L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[2];
int var7 = 0;
String var6 = "n\u0092\b\u0004\u0095\u000ep\u008e\u008aæ\u000fÖ\u007fÌÊ÷Ü¾\\ò\u0000sWÎ\u0003Ñ/J\u009f\u007f\u001b\u0001 (îª;ñc\u0001êÜÎIì\u0005¶QV\u008e÷`\u009bDmf¢ª÷\u001b\fÓ\u008cñ\u0017";
int var8 = "n\u0092\b\u0004\u0095\u000ep\u008e\u008aæ\u000fÖ\u007fÌÊ÷Ü¾\\ò\u0000sWÎ\u0003Ñ/J\u009f\u007f\u001b\u0001 (îª;ñc\u0001êÜÎIì\u0005¶QV\u008e÷`\u009bDmf¢ª÷\u001b\fÓ\u008cñ\u0017"
.length();
char var5 = ' ';
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
b = var9;
c = new String[2];
return;
}

var5 = var6.charAt(var4);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5964;
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
throw new RuntimeException("su/catlean/n4", var10);
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
throw new RuntimeException("su/catlean/n4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
