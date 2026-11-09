package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class c_ implements co {
@NotNull
private final Json w;
@NotNull
private final File E;
public js p;
private static final long a = yz.a(5732193083935570093L, 5933953737853453803L, MethodHandles.lookup().lookupClass()).a(165257755444180L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public c_(@NotNull Json json, short a, long a) {
long var5 = ((long)axx << 48 | ax << 16 >>> 16) ^ a;
Intrinsics.checkNotNullParameter(json, a<"i">(20090, 3041108291162550623L ^ var5));
super();
this.w = json;
this.E = new File(mj.v(), a<"i">(6342, 764847287286687714L ^ var5));
}

@NotNull
public final js M(long var1) {
var1 = a ^ var1;

try {
if (this.p != null) {
return this.p;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, -7176313312095470931L, var1);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"i">(5778, 1710983057915295620L ^ var1));
return null;
}

public final void y(short a, short a, @NotNull js <set-?>, int a) {
long var5 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"i">(17790, 7574874606368697903L ^ var5));
this.p = <set-?>;
}

@Override
public void w(long var1) {
long var10001 = var1 ^ 139522763903252L;
int var3 = (int)((var1 ^ 139522763903252L) >>> 48);
int var4 = (int)((var1 ^ 139522763903252L) << 16 >>> 48);
int var5 = (int)(var10001 << 32 >>> 32);
long var6 = var1 ^ 135137456124477L;

c_ var10000;
label29: {
try {
var10000 = this;
if (this.E.createNewFile()) {
var16 = new js(var6, new ArrayList());
break label29;
}
} catch (Exception var14) {
throw vm.a<"Å">(var14, -5035090572117975846L, var1);
}

c_ var12 = var10000;

js var9;
try {
var10000 = var12;
Json var15 = this.w;
String var10 = FilesKt.readText$default(this.E, null, 1, null);
boolean var11 = false;
var15.getSerializersModule();
var9 = var15.decodeFromString(js.S.F(), var10);
} catch (Exception var13) {
var10000 = var12;
zf.x().warn(a<"i">(27749, 412401045439998723L ^ var1));
var9 = new js(var6, new ArrayList());
}

var16 = var9;
}

js var8 = var16;
var10000.y((short)var3, (short)var4, var8, var5);
}

@Override
public void h(int var1, int var2, byte var3) {
long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
long var6 = var4 ^ 49995006559783L;
File var10000 = this.E;
Json var8 = this.w;
js var9 = this.M(var6);
boolean var10 = false;
var8.getSerializersModule();
FilesKt.writeText$default(var10000, var8.encodeToString(js.S.F(), var9), null, 2, null);
}

static {
long var0 = a ^ 29189185708627L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[5];
int var7 = 0;
String var6 = "xã\u000bzÿ¦Å¥¦\u008b>-_\u0083B\u0086 å×\u007fÊ\u0094\u0005~\u0090\u0090©\u001aú\u001eùZ¢ï-\u001b%,U\u0093J\u0018\u0006/6iÍN\u001b\u0010P.öIo\u0087>±\u008aÙZ¶GBµ\u0011";
int var8 = "xã\u000bzÿ¦Å¥¦\u008b>-_\u0083B\u0086 å×\u007fÊ\u0094\u0005~\u0090\u0090©\u001aú\u001eùZ¢ï-\u001b%,U\u0093J\u0018\u0006/6iÍN\u001b\u0010P.öIo\u0087>±\u008aÙZ¶GBµ\u0011"
.length();
char var5 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[5];
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "z\u009e;¬N\u001a1ïR\rIB\u0014ÅÉÔX\u0096LýLêÁAÊÃÇ_`\u0083|:ýÔ´\\(¤°ÊO\u0017á\u0019uÚ\u0011\u001b²\u0006¹^§R\\\u0095_\u0017¢\u0082ê\u0013w\u001có8\u0084ô\u001f\u0010\u0006ê'\u0002\u0081\u0089ÔÇZP>XS\u00837}°h\u0010\u009bs\u0088\u0091=+ã`Ï»éëcÙxE";
var8 = "z\u009e;¬N\u001a1ïR\rIB\u0014ÅÉÔX\u0096LýLêÁAÊÃÇ_`\u0083|:ýÔ´\\(¤°ÊO\u0017á\u0019uÚ\u0011\u001b²\u0006¹^§R\\\u0095_\u0017¢\u0082ê\u0013w\u001có8\u0084ô\u001f\u0010\u0006ê'\u0002\u0081\u0089ÔÇZP>XS\u00837}°h\u0010\u009bs\u0088\u0091=+ã`Ï»éëcÙxE"
.length();
var5 = 16;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15475;
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
throw new RuntimeException("su/catlean/c_", var10);
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
throw new RuntimeException("su/catlean/c_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
