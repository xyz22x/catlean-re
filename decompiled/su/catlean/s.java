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
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class s {
@NotNull
private final class_2338 u;
@NotNull
private final class_243 l;
@NotNull
private final class_2350 V;
private static final long a = yz.a(152040341218178007L, 7334170069620271063L, MethodHandles.lookup().lookupClass()).a(246035861946895L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public s(long a, @NotNull class_2338 bp, @NotNull class_243 vec3d, @NotNull class_2350 dir) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(bp, a<"n">(21657, 8177375458368284981L ^ ax));
Intrinsics.checkNotNullParameter(vec3d, a<"n">(22806, 5133718510208771256L ^ ax));
Intrinsics.checkNotNullParameter(dir, a<"n">(2919, 8205406809194608335L ^ ax));
super();
this.u = bp;
this.l = vec3d;
this.V = dir;
}

@NotNull
public final class_2338 E() {
return this.u;
}

@NotNull
public final class_243 C() {
return this.l;
}

@NotNull
public final class_2350 B() {
return this.V;
}

@NotNull
public final class_2338 I() {
return this.u;
}

@NotNull
public final class_243 l() {
return this.l;
}

@NotNull
public final class_2350 q() {
return this.V;
}

@NotNull
public final s u(long a, @NotNull class_2338 bp, @NotNull class_243 vec3d, @NotNull class_2350 dir) {
ax = a ^ ax;
long var6 = ax ^ 124391892412567L;
Intrinsics.checkNotNullParameter(bp, a<"n">(3936, 1857395482076520173L ^ ax));
Intrinsics.checkNotNullParameter(vec3d, a<"n">(22997, 2146462414436091986L ^ ax));
Intrinsics.checkNotNullParameter(dir, a<"n">(19158, 6056670357009095517L ^ ax));
return new s(var6, bp, vec3d, dir);
}

public static s Z(s var0, int var1, class_2338 var2, int var3, class_243 var4, class_2350 var5, int var6, Object var7) {
long var8 = ((long)var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
long var10 = var8 ^ 135013958925936L;
int[] var12 = vm.a<"Å">(2610247796818023008L, var8);

int var10000;
label41: {
label40: {
try {
var10000 = var6 & 1;
if (var12 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 2655295985142461758L, var8);
}

var2 = var0.u;
}

var10000 = var6 & 2;
}

label32: {
label31: {
try {
if (var12 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 2655295985142461758L, var8);
}

var4 = var0.l;
}

var10000 = var6 & 4;
}

if (var10000 != 0) {
var5 = var0.V;
}

return var0.u(var10, var2, var4, var5);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 25878532871499L;
class_2350 var3 = this.V;
class_243 var4 = this.l;
class_2338 var5 = this.u;
return a<"n">(31040, 367634382406592236L ^ var1)
+ var5
+ a<"n">(11476, 2124689281262318462L ^ var1)
+ var4
+ a<"n">(28356, 5463670640898060651L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 62421982958442L;
int var3 = this.u.hashCode();
var3 = var3 * b<"x">(7517, 4407086290007894481L ^ var1) + this.l.hashCode();
return var3 * b<"x">(9742, 4131482567201297027L ^ var1) + this.V.hashCode();
}

@Override
public boolean equals(@Nullable Object other) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/s.a J
// 03: ldc2_w 82720917757318
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 6347377829292994127
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w 6410484474903562513
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w 6410484474903562513
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/s
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w 6410484474903562513
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w 6410484474903562513
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/s
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/s.u Lnet/minecraft/class_2338;
// 65: aload 5
// 67: getfield su/catlean/s.u Lnet/minecraft/class_2338;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull ac
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w 6410484474903562513
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w 6410484474903562513
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: aload 4
// 91: ifnonnull bc
// 94: getfield su/catlean/s.l Lnet/minecraft/class_243;
// 97: aload 5
// 99: getfield su/catlean/s.l Lnet/minecraft/class_243;
// 9c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9f: goto ac
// a2: ldc2_w 6410484474903562513
// a5: lload 2
// a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab: athrow
// ac: ifne bb
// af: bipush 0
// b0: ireturn
// b1: ldc2_w 6410484474903562513
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: getfield su/catlean/s.V Lnet/minecraft/class_2350;
// bf: aload 5
// c1: getfield su/catlean/s.V Lnet/minecraft/class_2350;
// c4: if_acmpeq d3
// c7: bipush 0
// c8: ireturn
// c9: ldc2_w 6410484474903562513
// cc: lload 2
// cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d2: athrow
// d3: bipush 1
// d4: ireturn
}

static {
long var11 = a ^ 22924161329862L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[9];
int var18 = 0;
String var17 = "p\boê`óÏÐ\u001e\u0017Þ\u001aõ»¢®÷ØÍHh \u001aË4M»¹\n¸?\u0002\u0010ÈÏ\u0091\u0095\u008aZ¹¦\u0012\u00198\u009e8A\u007f1\u0010õ¹ú\u008bmï\u0080\u0015^\u0096·«\u0093»Öù\u0010{6\u001a+ ,!%@%}hK±\bN\u0010|õ1;>\u0018½è\u0018ßÄ\u001d£\u0095A\u008a\u0010R«6\u0089Ý\u009eÓÏ\u0092[%®äx-\u000e äÞkW\u0013ð¯\u0011åÈ\u0010\u009c?9\u001dÏï\u001fäP»\u0016¹\u0016\u009eÇ·\u00905Þ<½";
int var19 = "p\boê`óÏÐ\u001e\u0017Þ\u001aõ»¢®÷ØÍHh \u001aË4M»¹\n¸?\u0002\u0010ÈÏ\u0091\u0095\u008aZ¹¦\u0012\u00198\u009e8A\u007f1\u0010õ¹ú\u008bmï\u0080\u0015^\u0096·«\u0093»Öù\u0010{6\u001a+ ,!%@%}hK±\bN\u0010|õ1;>\u0018½è\u0018ßÄ\u001d£\u0095A\u008a\u0010R«6\u0089Ý\u009eÓÏ\u0092[%®äx-\u000e äÞkW\u0013ð¯\u0011åÈ\u0010\u009c?9\u001dÏï\u001fäP»\u0016¹\u0016\u009eÇ·\u00905Þ<½"
.length();
char var16 = ' ';
int var23 = -1;

label45:
while (true) {
String var24 = var17.substring(++var23, var23 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var33;
if ((var23 += var16) >= var19) {
b = var20;
c = new String[9];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "\u001bç\u0001ð^5 Úü[&üO(H\u009b";
int var5 = "\u001bç\u0001ð^5 Úü[&üO(H\u009b".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[2];
return;
}

var16 = var17.charAt(var23);
break;
default:
var20[var18++] = var33;
if ((var23 += var16) < var19) {
var16 = var17.charAt(var23);
continue label45;
}

var17 = "ºî/Ö\\\u0089«\n\u0088G\u0013½¦BÈü\u0010\u008eÿ6#20òpqO¶!$ª\f\u009a";
var19 = "ºî/Ö\\\u0089«\n\u0088G\u0013½¦BÈü\u0010\u008eÿ6#20òpqO¶!$ª\f\u009a".length();
var16 = 16;
var23 = -1;
}

var24 = var17.substring(++var23, var23 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20054;
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
throw new RuntimeException("su/catlean/s", var10);
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
throw new RuntimeException("su/catlean/s" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9046;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/s", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/s" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
