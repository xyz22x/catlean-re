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

public final class re {
@NotNull
private String v;
private float a;
private float f;
@NotNull
private final i0 N;
private static final long b = yz.a(607635567562931596L, -592057539300811217L, MethodHandles.lookup().lookupClass()).a(268642272196785L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);

public re(@NotNull String name, short a, float x, float y, int a, char a, @NotNull i0 type) {
long var8 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ b;
Intrinsics.checkNotNullParameter(name, a<"t">(18334, 8931308083935915512L ^ var8));
Intrinsics.checkNotNullParameter(type, a<"t">(8072, 6021092297101342189L ^ var8));
super();
this.v = name;
this.a = x;
this.f = y;
this.N = type;
}

@NotNull
public final String w() {
return this.v;
}

public final void J(long a, @NotNull String <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"t">(2285, 6589175614924522842L ^ ax));
this.v = <set-?>;
}

public final float d() {
return this.a;
}

public final void K(float <set-?>) {
this.a = <set-?>;
}

public final float D() {
return this.f;
}

public final void y(float <set-?>) {
this.f = <set-?>;
}

@NotNull
public final i0 y() {
return this.N;
}

static {
long var0 = b ^ 96806679967279L;
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
String var6 = "\t\u0014\u009a(z\u000b)]öç)\u0088\u009cL01\u0010~\u0017ìÿ\u0013{\\òýÄ1(é8c%\u0010sÝ¨çíõpB! î8O\"\u0011\u008f";
int var8 = "\t\u0014\u009a(z\u000b)]öç)\u0088\u009cL01\u0010~\u0017ìÿ\u0013{\\òýÄ1(é8c%\u0010sÝ¨çíõpB! î8O\"\u0011\u008f".length();
char var5 = 16;
int var4 = -1;

while (true) {
byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
String var13 = a(var10).intern();
byte var10001 = -1;
var9[var7++] = var13;
if ((var4 += var5) >= var8) {
c = var9;
d = new String[3];
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6603;
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
throw new RuntimeException("su/catlean/re", var10);
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
throw new RuntimeException("su/catlean/re" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
