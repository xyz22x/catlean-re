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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.IPasteable;
import su.catlean.gofra.Gofra;

public final class cv {
private static _g[] b;
private static final long a = yz.a(-8764471517711460568L, -8821986877305501265L, MethodHandles.lookup().lookupClass()).a(117897264108743L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);

public static final void K(@NotNull IPasteable $this$font, int a, char a, char a) {
long var4 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var6 = var4 ^ 89362916405424L;
long var8 = var4 ^ 26011866588120L;
long var10001 = var4 ^ 106778399697033L;
int var10 = (int)((var4 ^ 106778399697033L) >>> 48);
int var11 = (int)((var4 ^ 106778399697033L) << 16 >>> 32);
int var12 = (int)(var10001 << 48 >>> 48);
long var13 = var4 ^ 87078620732862L;
int var15 = (int)((var4 ^ 2168665790268L) >>> 32);
long var16 = (var4 ^ 2168665790268L) << 32 >>> 32;
long var18 = var4 ^ 125122871657044L;
long var20 = var4 ^ 71781484687864L;
long var22 = var4 ^ 95852642598955L;
long var24 = var4 ^ 135779300673105L;
long var26 = var4 ^ 79989124990179L;
long var28 = var4 ^ 130094157243275L;
Intrinsics.checkNotNullParameter($this$font, a<"q">(25864, 8309351758695045065L ^ var4));
b8.t(b8.x((char)var10, var11, 7.5F, (short)var12, a<"q">(28251, 5436559192255011993L ^ var4)), var26);
b8.f(b8.x((char)var10, var11, 8.0F, (short)var12, a<"q">(7914, 3795498830135127086L ^ var4)), var18);
b8.B(var28, b8.x((char)var10, var11, 9.5F, (short)var12, a<"q">(7914, 3795498830135127086L ^ var4)));
vm.a<"Å">(5018217458700045245L, var4);
b8.G(b8.x((char)var10, var11, 6.5F, (short)var12, a<"q">(7914, 3795498830135127086L ^ var4)), var13);

try {
b8.Q(var15, var16, b8.x((char)var10, var11, 12.0F, (short)var12, a<"q">(21364, 5672601630589329847L ^ var4)));
b8.a(b8.x((char)var10, var11, 8.0F, (short)var12, a<"q">(16198, 8119846418153164160L ^ var4)), var24);
b8.e(var6, b8.x((char)var10, var11, 20.0F, (short)var12, a<"q">(16198, 8119846418153164160L ^ var4)));
b8.g(var20, b8.x((char)var10, var11, 25.0F, (short)var12, a<"q">(16198, 8119846418153164160L ^ var4)));
b8.i(var22, b8.x((char)var10, var11, 12.0F, (short)var12, a<"q">(14758, 1670713383957842790L ^ var4)));
b8.q(var8, b8.x((char)var10, var11, 7.5F, (short)var12, a<"q">(4463, 1035443354496623528L ^ var4)));
Gofra.INSTANCE.plug(cz.H);
if (vm.a<"Å">(5027680665065708372L, var4) != null) {
vm.a<"Å">(new _g[5], 5000384642100955994L, var4);
}
} catch (NumberFormatException var31) {
throw vm.a<"Å">(var31, 4996328583941764891L, var4);
}
}

public static void w(_g[] var0) {
b = var0;
}

public static _g[] o() {
return b;
}

static {
long var9 = a ^ 137908168386722L;
_g[] var10000 = new _g[5];
vm.a<"Å">(var10000, -5722117206188097880L, var9);
Cipher var0;
Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[7];
int var5 = 0;
String var4 = "âI}d\u000e 6ª\u0087\u008b7j4lâ\u000eÏ®ü\u0086=þeK\u0010\r\u0092\u0086ÊkÚØ7sT\u008aEPiºô @à\u0000Z\u0098þV\u0011\u0094¥\u009aÚå¼r\u0085ûÍ\u009aN-\u0013Â_~\u001fð\u009d\u009fÙï_\u0010\u008cÛ\u0013.òäÙuIá\u0011|\u001b\u0086.=\u0010\u0090\u00adÛVÆ§]\u0087v\u001bæào\u001a:%";
int var6 = "âI}d\u000e 6ª\u0087\u008b7j4lâ\u000eÏ®ü\u0086=þeK\u0010\r\u0092\u0086ÊkÚØ7sT\u008aEPiºô @à\u0000Z\u0098þV\u0011\u0094¥\u009aÚå¼r\u0085ûÍ\u009aN-\u0013Â_~\u001fð\u009d\u009fÙï_\u0010\u008cÛ\u0013.òäÙuIá\u0011|\u001b\u0086.=\u0010\u0090\u00adÛVÆ§]\u0087v\u001bæào\u001a:%"
.length();
char var3 = 24;
int var12 = -1;

label27:
while (true) {
String var14 = var4.substring(++var12, var12 + var3);
byte var10001 = -1;

while (true) {
byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
String var20 = a(var8).intern();
switch (var10001) {
case 0:
var7[var5++] = var20;
if ((var12 += var3) >= var6) {
c = var7;
d = new String[7];
return;
}

var3 = var4.charAt(var12);
break;
default:
var7[var5++] = var20;
if ((var12 += var3) < var6) {
var3 = var4.charAt(var12);
continue label27;
}

var4 = "ÿ\u0011\u0013\u009c\u0088è÷©ø\u0003\u0098¦evsQ·>À®¡fÃ\u001b Ò2)\u0002\u00812\u0099tn\u0012\u009ds\u0081´ÙÑ>.\u0006&â\u000b\u0096×oñ2ø\u0094\u0017\u008aÂ";
var6 = "ÿ\u0011\u0013\u009c\u0088è÷©ø\u0003\u0098¦evsQ·>À®¡fÃ\u001b Ò2)\u0002\u00812\u0099tn\u0012\u009ds\u0081´ÙÑ>.\u0006&â\u000b\u0096×oñ2ø\u0094\u0017\u008aÂ"
.length();
var3 = 24;
var12 = -1;
}

var14 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13910;
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
throw new RuntimeException("su/catlean/cv", var10);
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
throw new RuntimeException("su/catlean/cv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
