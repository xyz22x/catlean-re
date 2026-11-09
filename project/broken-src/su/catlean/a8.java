package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import net.minecraft.class_1041;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class a8 {
@NotNull
public static final a8 k;
@NotNull
private static final ArrayDeque G;
private static final long a = yz.a(8980837311664535047L, -5844576313151723954L, MethodHandles.lookup().lookupClass()).a(69118081339174L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

private a8() {
}

public final void I(long a, @NotNull o7 scissor) {
ax = a ^ ax;
long var4 = ax ^ 101318441107436L;
Intrinsics.checkNotNullParameter(scissor, a<"a">(11194, 9099557937395126306L ^ ax));
class_1041 var10000 = zf.F(var4).method_22683();
Intrinsics.checkNotNullExpressionValue(var10000, a<"a">(1973, 5005389749741288492L ^ ax));
class_1041 var6 = var10000;
int var7 = var6.method_4495();
int var8 = var6.method_4506();
float var9 = MathKt.roundToInt(scissor.R() * var7) - 1.0F;
float var10 = MathKt.roundToInt(var8 - scissor.O() * var7) - 1.0F;
float var11 = MathKt.roundToInt((scissor.t() - scissor.R()) * var7) + 1.0F;
float var12 = MathKt.roundToInt((scissor.O() - scissor.w()) * var7) + 1.0F;
G.addLast(new o7(var9, var10, var11, var12));
}

@NotNull
public final o7 y(int var1, char var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
Object var10000 = G.removeLast();
Intrinsics.checkNotNullExpressionValue(var10000, a<"a">(1218, 4090237621646369470L ^ var4));
return (o7)var10000;
}

@Nullable
public final o7 c() {
return (o7)G.peekLast();
}

static {
long var0 = a ^ 111891172971856L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[3];
int var7 = 0;
String var6 = "Û\u001b>JJÎç\u0088þO q\u009e\u001b¹* nG\u009d¥\u0083ùÈ=ÓU$G>\u0092Xb7GZÏ\u0004ß¢¤(|\u0096*W.JA\u0018¯5=ÌÆè\u000b¬Íô7\u0014c\\?\u001a\u009aóÓ%Üµ.2";
int var8 = "Û\u001b>JJÎç\u0088þO q\u009e\u001b¹* nG\u009d¥\u0083ùÈ=ÓU$G>\u0092Xb7GZÏ\u0004ß¢¤(|\u0096*W.JA\u0018¯5=ÌÆè\u000b¬Íô7\u0014c\\?\u001a\u009aóÓ%Üµ.2"
.length();
char var5 = 16;
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
b = var9;
c = new String[3];
k = new a8();
G = new ArrayDeque();
return;
}

var5 = var6.charAt(var4);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 22845;
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
throw new RuntimeException("su/catlean/a8", var10);
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
throw new RuntimeException("su/catlean/a8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
