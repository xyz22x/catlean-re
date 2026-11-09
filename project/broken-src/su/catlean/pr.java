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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class pr extends gf {
@NotNull
public static final pr z;
private static final long a = yz.a(2944415395569019370L, 6383122042323949211L, MethodHandles.lookup().lookupClass()).a(236406255604837L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);

private pr(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 140553292422384L;
int var3 = (int)((var1 ^ 140553292422384L) >>> 48);
int var4 = (int)((var1 ^ 140553292422384L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
super((char)var3, var4, b<"g">(27029, 5296106978354462090L ^ var1), (char)var5);
}

@Override
public void h(long a, @NotNull class_332 context) {
long var4 = ax ^ 116853176505585L;
long var6 = (ax ^ 116341584688376L) >>> 16;
int var8 = (int)((ax ^ 116341584688376L) << 48 >>> 48);
Intrinsics.checkNotNullParameter(context, b<"g">(14804, 2041706212884633306L ^ ax));
this.X(context, var4, nf.f(nf.Z, null, var6, 1, (char)var8, null) + b<"g">(4017, 8885551082468892860L ^ ax));
}

static {
long var9 = a ^ 37883919381514L;
long var11 = var9 ^ 7756868149873L;
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
String var4 = "À\u0015z¸\u00ad\u00937\u007f~ð\u000b\u0017ít[YÜi\u0004«¯\"f/\u008fE\tòß÷\u008fâ\u0010þ\u0087Í¿\u0098ók\u0019ÄýåC8¿ªî\u0010¡-Ùëì\u000e¬\u0004\u0011¢óé¦Xçd";
int var6 = "À\u0015z¸\u00ad\u00937\u007f~ð\u000b\u0017ít[YÜi\u0004«¯\"f/\u008fE\tòß÷\u008fâ\u0010þ\u0087Í¿\u0098ók\u0019ÄýåC8¿ªî\u0010¡-Ùëì\u000e¬\u0004\u0011¢óé¦Xçd"
.length();
char var3 = ' ';
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var15 = b(var8).intern();
byte var10001 = -1;
var7[var5++] = var15;
if ((var2 += var3) >= var6) {
b = var7;
c = new String[3];
z = new pr(var11);
return;
}

var3 = var4.charAt(var2);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16996;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/pr", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/pr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
