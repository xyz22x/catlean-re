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
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class nu {
@NotNull
private final class_243 h;
private final float T;
private final float O;
@NotNull
private final bg a;
private static _g[] d;
private static final long b = yz.a(-6889127401910834784L, -6310379068711708749L, MethodHandles.lookup().lookupClass()).a(264696519164811L);
private static final String[] c;
private static final String[] e;
private static final Map f = new HashMap(13);

public nu(@NotNull class_243 vec, float yaw, float pitch, long a, @NotNull bg life) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(vec, a<"u">(29531, 5636188417964100539L ^ ax));
Intrinsics.checkNotNullParameter(life, a<"u">(30661, 9017283570512187172L ^ ax));
_g[] var10000 = vm.a<"Å">(-3425563735433408849L, ax);
super();
_g[] var7 = var10000;

try {
this.h = vec;
this.T = yaw;
this.O = pitch;
this.a = life;
if (var7 == null) {
vm.a<"Å">(new _g[1], -3390971610375071027L, ax);
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -3401463448414842303L, ax);
}
}

@NotNull
public final class_243 U() {
return this.h;
}

public final float G() {
return this.T;
}

public final float v() {
return this.O;
}

@NotNull
public final bg m() {
return this.a;
}

public static void o(_g[] var0) {
d = var0;
}

public static _g[] E() {
return d;
}

static {
long var9 = b ^ 84548380629788L;
_g[] var10000 = new _g[5];
vm.a<"Å">(var10000, 1286767681041154547L, var9);
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
String var4 = "]^\u0015å×æU©qó\"êºî\u0016\u008b\u0010Í¦úÌÐú\u0091í/\u000e\u0013ã°fÙô";
int var6 = "]^\u0015å×æU©qó\"êºî\u0016\u008b\u0010Í¦úÌÐú\u0091í/\u000e\u0013ã°fÙô".length();
char var3 = 16;
int var2 = -1;

while (true) {
byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
String var14 = a(var8).intern();
byte var10001 = -1;
var7[var5++] = var14;
if ((var2 += var3) >= var6) {
c = var7;
e = new String[2];
return;
}

var3 = var4.charAt(var2);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26935;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/nu", var10);
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
e[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/nu" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
