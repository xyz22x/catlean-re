package su.catlean;

import java.awt.Font;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class b8 {
public static c6 U;
public static c6 W;
public static c6 Q;
public static c6 T;
public static c6 Y;
public static c6 c;
public static c6 L;
public static c6 t;
public static c6 K;
public static c6 a;
@NotNull
private static final List R;
private static String[] J;
private static final long b = yz.a(-322321680349859716L, -196398282025928332L, MethodHandles.lookup().lookupClass()).a(191101755471682L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);

@NotNull
public static final c6 f(long var0) {
var0 = b ^ var0;

try {
if (U != null) {
return U;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, 9108265679141791349L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(12065, 4398754077371892783L ^ var0));
return null;
}

public static final void t(@NotNull c6 <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(16893, 2207192783555000233L ^ ax));
U = <set-?>;
}

@NotNull
public static final c6 p(long var0) {
var0 = b ^ var0;

try {
if (W != null) {
return W;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, 7309753520834280803L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(12213, 3243850756071497661L ^ var0));
return null;
}

public static final void B(long a, @NotNull c6 <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(16893, 2207248472090857665L ^ ax));
W = <set-?>;
}

@NotNull
public static final c6 n(long var0) {
var0 = b ^ var0;

try {
if (Q != null) {
return Q;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, -4712925711063112054L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(30309, 595383523573931405L ^ var0));
return null;
}

public static final void f(@NotNull c6 <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(10284, 8669395669667616976L ^ ax));
Q = <set-?>;
}

@NotNull
public static final c6 d(long var0) {
var0 = b ^ var0;

try {
if (T != null) {
return T;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, 7309139926537731453L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(20014, 3381219060338720307L ^ var0));
return null;
}

public static final void G(@NotNull c6 <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(16893, 2207187855501553396L ^ ax));
T = <set-?>;
}

@NotNull
public static final c6 k(long var0) {
var0 = b ^ var0;

try {
if (Y != null) {
return Y;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, -622893558654800055L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(31131, 2380187207634934717L ^ var0));
return null;
}

public static final void Q(int a, long a, @NotNull c6 <set-?>) {
long var4 = ((long)ax << 32 | axx << 32 >>> 32) ^ b;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(16893, 2207273318434055286L ^ var4));
Y = <set-?>;
}

@NotNull
public static final c6 t(long var0) {
var0 = b ^ var0;

try {
if (c != null) {
return c;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, -3940830709063265955L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(21318, 5935656650022965116L ^ var0));
return null;
}

public static final void a(@NotNull c6 <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(16893, 2207245291986646299L ^ ax));
c = <set-?>;
}

@NotNull
public static final c6 i(long var0) {
var0 = b ^ var0;

try {
if (L != null) {
return L;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, 6440845915381743984L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(26730, 6150109604045579376L ^ var0));
return null;
}

public static final void e(long a, @NotNull c6 <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(16893, 2207221067969922042L ^ ax));
L = <set-?>;
}

@NotNull
public static final c6 h(long var0) {
var0 = b ^ var0;

try {
if (t != null) {
return t;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, -2137385967964620220L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(11835, 8103414831646284059L ^ var0));
return null;
}

public static final void g(long a, @NotNull c6 <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(16893, 2207203430670074546L ^ ax));
t = <set-?>;
}

@NotNull
public static final c6 v(long var0) {
var0 = b ^ var0;

try {
if (K != null) {
return K;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, -956409432239674712L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(23039, 5180734098759974459L ^ var0));
return null;
}

public static final void i(long a, @NotNull c6 <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(16893, 2207214303433388897L ^ ax));
K = <set-?>;
}

@NotNull
public static final c6 M(long var0) {
var0 = b ^ var0;

try {
if (a != null) {
return a;
}
} catch (NumberFormatException var2) {
throw vm.a<"Å">(var2, -5895109419028826590L, var0);
}

Intrinsics.throwUninitializedPropertyAccessException(a<"f">(9041, 7800176329367967765L ^ var0));
return null;
}

public static final void q(long a, @NotNull c6 <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"f">(16893, 2207284108708090002L ^ ax));
a = <set-?>;
}

@NotNull
public static final List b() {
return R;
}

@NotNull
public static final Font G(int a, float size, int a, int a, @NotNull String name) {
long var5 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ b;
Intrinsics.checkNotNullParameter(name, a<"f">(26329, 2791113554767752725L ^ var5));
Font var10000 = Font.createFont(
0,
Objects.requireNonNull(
CatLean.class.getClassLoader().getResourceAsStream(a<"f">(15081, 1454630147495293483L ^ var5) + name + a<"f">(25283, 1082016091763354123L ^ var5))
)
)
.deriveFont(0, size);
Intrinsics.checkNotNullExpressionValue(var10000, a<"f">(13008, 6094419458082208272L ^ var5));
return var10000;
}

@NotNull
public static final c6 x(char a, int a, float size, short a, @NotNull String name) {
long var5 = ((long)ax << 48 | (long)axxx << 32 >>> 16 | (long)axx << 48 >>> 48) ^ b;
long var10001 = var5 ^ 43462366376044L;
int var7 = (int)((var5 ^ 43462366376044L) >>> 32);
int var8 = (int)((var5 ^ 43462366376044L) << 32 >>> 48);
int var9 = (int)(var10001 << 48 >>> 48);
long var10 = var5 ^ 77577180628333L;
Intrinsics.checkNotNullParameter(name, a<"f">(11301, 1548740246323361302L ^ var5));
c6 var12 = new c6(G(var7, size, var8, var9, name), G(var7, size, var8, var9, a<"f">(24321, 8578778762292987188L ^ var5)), var10, size);
R.add(var12);
return var12;
}

static {
long var9 = b ^ 54978020664727L;
String[] var10000 = new String[1];
vm.a<"Å">(var10000, -4147898798867597018L, var9);
Cipher var0;
Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[18];
int var5 = 0;
String var4 = "\fòfAÝIØjU\u009aþ´«üeþ\u0010¢ÕÜ\u0083'\u008eÚ?Ãå\u0088Ö\u00861f×\u0010&0`\u0000\u0089\u0016(-@.Ê¯C\u0001n1\u0010ËAÕnfµ\u0015X\u001eçÃ\u0089-x\u0001Y\u0010Êù\u001e3\nrª>%Ô\u009câ\u000e\u00858z\u0010ÝJM{Ä\u0091P\u008c.°ÃG\u0001è\u00adY\u0010ð\u0085\f\u0085Ù6s¤k¨\u000fbhK\u009bµ\u0010×Pû\u0011v\b)\u0016ûø]8ùÏBç(@DM\u0088Y$\u0018ÌÁ\u001eþÏ\u008bX\u0089Aj\u0004r|3Í£\u000fÌ+\u001c£\u001eª\u009fa «Ïn\u007f¾Ða\u0010zìKE\u0003ó\u0010\u008b©0Âõü¥ñI u\u0097_s«\"'§rÛ\u009fÚb´µ\t\u001e\u0094eúo.í\u0083\u008d,(\u0016;?IT\u0010\u0019¤6Õ!W@çñ¼ \u0087\u0086Þ=ú\u0010¶LßøÕçuè\u0007\u009f+$SAöy\u0010´!S:\u0014\u0085\u0018¢É\u001a\u000e¤5\u0011e\b\u0010²r1S\u007fÝÞ\u0090CYk\u0096¨\u001eJD\u0010öT×÷ù7\u001fbuK\u001cíï´¨\u007f";
int var6 = "\fòfAÝIØjU\u009aþ´«üeþ\u0010¢ÕÜ\u0083'\u008eÚ?Ãå\u0088Ö\u00861f×\u0010&0`\u0000\u0089\u0016(-@.Ê¯C\u0001n1\u0010ËAÕnfµ\u0015X\u001eçÃ\u0089-x\u0001Y\u0010Êù\u001e3\nrª>%Ô\u009câ\u000e\u00858z\u0010ÝJM{Ä\u0091P\u008c.°ÃG\u0001è\u00adY\u0010ð\u0085\f\u0085Ù6s¤k¨\u000fbhK\u009bµ\u0010×Pû\u0011v\b)\u0016ûø]8ùÏBç(@DM\u0088Y$\u0018ÌÁ\u001eþÏ\u008bX\u0089Aj\u0004r|3Í£\u000fÌ+\u001c£\u001eª\u009fa «Ïn\u007f¾Ða\u0010zìKE\u0003ó\u0010\u008b©0Âõü¥ñI u\u0097_s«\"'§rÛ\u009fÚb´µ\t\u001e\u0094eúo.í\u0083\u008d,(\u0016;?IT\u0010\u0019¤6Õ!W@çñ¼ \u0087\u0086Þ=ú\u0010¶LßøÕçuè\u0007\u009f+$SAöy\u0010´!S:\u0014\u0085\u0018¢É\u001a\u000e¤5\u0011e\b\u0010²r1S\u007fÝÞ\u0090CYk\u0096¨\u001eJD\u0010öT×÷ù7\u001fbuK\u001cíï´¨\u007f"
.length();
char var3 = 16;
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
d = var7;
e = new String[18];
R = new ArrayList();
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

var4 = "\u0011k³qúÊáo\u0010J\u001cvÖöÓU\u0010*m9\u0002\u0083:|ëÇ\u000b'¿\u0081)ûL";
var6 = "\u0011k³qúÊáo\u0010J\u001cvÖöÓU\u0010*m9\u0002\u0083:|ëÇ\u000b'¿\u0081)ûL".length();
var3 = 16;
var12 = -1;
}

var14 = var4.substring(++var12, var12 + var3);
var10001 = 0;
}
}
}

public static void A(String[] var0) {
J = var0;
}

public static String[] E() {
return J;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21691;
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
throw new RuntimeException("su/catlean/b8", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
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
throw new RuntimeException("su/catlean/b8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
