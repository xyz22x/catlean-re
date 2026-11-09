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
import kotlin.ranges.RangesKt;
import net.minecraft.class_10055;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_591;
import org.jetbrains.annotations.NotNull;

public final class tk {
@NotNull
private final class_591 Y;
@NotNull
private final class_10055 i;
@NotNull
private class_243 m;
@NotNull
private final class_2960 M;
private float a;
private float b;
@NotNull
private class_243 G;
private static String[] N;
private static final long c = yz.a(-2108292055991162960L, -4210892576235190131L, MethodHandles.lookup().lookupClass()).a(40802403328362L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);

public tk(@NotNull class_591 model, @NotNull class_10055 state, @NotNull class_243 pos, @NotNull class_2960 texture, float alpha, long a) {
ax = c ^ ax;
Intrinsics.checkNotNullParameter(model, a<"o">(26188, 4079926944745700107L ^ ax));
Intrinsics.checkNotNullParameter(state, a<"o">(27163, 7972490256460691294L ^ ax));
String[] var10000 = vm.a<"Å">(-5235422289277385180L, ax);
Intrinsics.checkNotNullParameter(pos, a<"o">(27204, 942193167850583812L ^ ax));
Intrinsics.checkNotNullParameter(texture, a<"o">(27579, 3329412305783797503L ^ ax));
super();
this.Y = model;
this.i = state;
String[] var8 = var10000;

try {
this.m = pos;
this.M = texture;
this.a = alpha;
this.b = this.a;
this.G = this.m;
if (var8 == null) {
vm.a<"Å">(new _g[5], -5223104778868376130L, ax);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -5205397129496850191L, ax);
}
}

@NotNull
public final class_591 D() {
return this.Y;
}

@NotNull
public final class_10055 z() {
return this.i;
}

@NotNull
public final class_243 G() {
return this.m;
}

public final void g(long a, @NotNull class_243 <set-?>) {
ax = c ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"o">(13694, 7155416100709787481L ^ ax));
this.m = <set-?>;
}

@NotNull
public final class_2960 V() {
return this.M;
}

public final float N() {
return this.a;
}

public final void k(float <set-?>) {
this.a = <set-?>;
}

public final boolean W(float aSpeed, float ySpeed, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/tk.c J
// 03: lload 3
// 04: lxor
// 05: lstore 3
// 06: ldc2_w -2986945942457358352
// 09: lload 3
// 0a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 5
// 11: aload 0
// 12: getfield su/catlean/tk.a F
// 15: fconst_0
// 16: fcmpg
// 17: aload 5
// 19: ifnull 76
// 1c: ifgt 38
// 1f: goto 2c
// 22: ldc2_w -3020083886194560731
// 25: lload 3
// 26: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b: athrow
// 2c: bipush 1
// 2d: ireturn
// 2e: ldc2_w -3020083886194560731
// 31: lload 3
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: aload 0
// 3a: getfield su/catlean/tk.a F
// 3d: putfield su/catlean/tk.b F
// 40: aload 0
// 41: aload 0
// 42: getfield su/catlean/tk.a F
// 45: fload 1
// 46: fsub
// 47: putfield su/catlean/tk.a F
// 4a: aload 0
// 4b: aload 0
// 4c: getfield su/catlean/tk.m Lnet/minecraft/class_243;
// 4f: putfield su/catlean/tk.G Lnet/minecraft/class_243;
// 52: aload 0
// 53: new net/minecraft/class_243
// 56: dup
// 57: aload 0
// 58: getfield su/catlean/tk.m Lnet/minecraft/class_243;
// 5b: getfield net/minecraft/class_243.field_1352 D
// 5e: aload 0
// 5f: getfield su/catlean/tk.m Lnet/minecraft/class_243;
// 62: getfield net/minecraft/class_243.field_1351 D
// 65: fload 2
// 66: f2d
// 67: dadd
// 68: aload 0
// 69: getfield su/catlean/tk.m Lnet/minecraft/class_243;
// 6c: getfield net/minecraft/class_243.field_1350 D
// 6f: invokespecial net/minecraft/class_243.<init> (DDD)V
// 72: putfield su/catlean/tk.m Lnet/minecraft/class_243;
// 75: bipush 0
// 76: ireturn
}

public final float p(long var1) {
var1 = c ^ var1;
long var10001 = var1 ^ 32039250440926L;
int var3 = (int)((var1 ^ 32039250440926L) >>> 32);
int var4 = (int)((var1 ^ 32039250440926L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
String[] var6 = vm.a<"Å">(-704701931802736828L, var1);

try {
float var10000 = RangesKt.coerceIn(jl.y.B(this.b, this.a, zi.v.n(var3, (char)var4, var5)), 0.0F, 255.0F) / 255.0F;
if (vm.a<"Å">(-678489784927000572L, var1) != null) {
vm.a<"Å">(new String[3], -708381853308354567L, var1);
}

return var10000;
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -674738834295434863L, var1);
}
}

@NotNull
public final class_243 C(long var1) {
var1 = c ^ var1;
long var10001 = var1 ^ 54228592482553L;
int var3 = (int)((var1 ^ 54228592482553L) >>> 32);
int var4 = (int)((var1 ^ 54228592482553L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 39453207211721L;
return zi.v.q(var6, this.G, this.m, zi.v.n(var3, (char)var4, var5));
}

public static void T(String[] var0) {
N = var0;
}

public static String[] s() {
return N;
}

static {
long var9 = c ^ 3360678718998L;
String[] var10000 = new String[1];
vm.a<"Å">(var10000, 1531021267675061485L, var9);
Cipher var0;
Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
}

var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var7 = new String[5];
int var5 = 0;
String var4 = "k\u0016ªùb±©ðfôøÍ\u0083RØ8\u0010ò \u0011[=h\u0086±^\u001cÜjÕÄuÎ\u0010}\u001cÚ\u0093NÜ\u0012Øæ\u009c\u008aºÝÁ(\u0087";
int var6 = "k\u0016ªùb±©ðfôøÍ\u0083RØ8\u0010ò \u0011[=h\u0086±^\u001cÜjÕÄuÎ\u0010}\u001cÚ\u0093NÜ\u0012Øæ\u009c\u008aºÝÁ(\u0087".length();
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
e = new String[5];
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

var4 = "y¶<\u0082ùt;¢\u0095øU¸©\u0083\u0005\u0084\u0010\u000fw\u00adQ¨¤ZÒ\u00adó´\u001c\u0002\u0001\u000fm";
var6 = "y¶<\u0082ùt;¢\u0095øU¸©\u0083\u0005\u0084\u0010\u000fw\u00adQ¨¤ZÒ\u00adó´\u001c\u0002\u0001\u000fm".length();
var3 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27616;
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
throw new RuntimeException("su/catlean/tk", var10);
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
throw new RuntimeException("su/catlean/tk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
