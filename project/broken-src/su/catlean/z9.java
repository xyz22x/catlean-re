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
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class z9 {
@NotNull
private final String I;
@NotNull
private final class_1799 n;
private final long r;
private static final long a = yz.a(8296092707410266524L, -2727629779065411214L, MethodHandles.lookup().lookupClass()).a(80388278923892L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public z9(@NotNull String itemName, @NotNull class_1799 i, long startTime, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(itemName, a<"v">(1672, 6024897292384927745L ^ ax));
Intrinsics.checkNotNullParameter(i, "i");
super();
this.I = itemName;
this.n = i;
this.r = startTime;
}

@NotNull
public final String v() {
return this.I;
}

@NotNull
public final class_1799 b() {
return this.n;
}

public final long u() {
return this.r;
}

@NotNull
public final String G() {
return this.I;
}

@NotNull
public final class_1799 N() {
return this.n;
}

public final long x() {
return this.r;
}

@NotNull
public final z9 m(long a, @NotNull String itemName, @NotNull class_1799 i, long startTime) {
ax = a ^ ax;
long var7 = ax ^ 104270383955406L;
Intrinsics.checkNotNullParameter(itemName, a<"v">(12120, 4551135602335703726L ^ ax));
Intrinsics.checkNotNullParameter(i, "i");
return new z9(itemName, i, startTime, var7);
}

public static z9 B(z9 var0, String var1, long var2, class_1799 var4, long var5, int var7, Object var8) {
var2 = a ^ var2;
long var9 = var2 ^ 112088629956127L;
int[] var11 = vm.a<"Å">(-5159778341614130388L, var2);

int var10000;
label51: {
label50: {
try {
var10000 = var7 & 1;
if (var11 == null) {
break label51;
}

if (var10000 == 0) {
break label50;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, -5044776141811246940L, var2);
}

var1 = var0.I;
}

var10000 = var7 & 2;
}

label42: {
label41: {
try {
if (var11 == null) {
break label42;
}

if (var10000 == 0) {
break label41;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, -5044776141811246940L, var2);
}

var4 = var0.n;
}

var10000 = var7 & 4;
}

if (var10000 != 0) {
var5 = var0.r;
}

try {
z9 var16 = var0.m(var9, var1, var4, var5);
if (var2 > 0L && vm.a<"Å">(-5056739243356739773L, var2) != null) {
vm.a<"Å">(new int[5], -5046783385461874846L, var2);
}

return var16;
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -5044776141811246940L, var2);
}
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 104599014048826L;
long var3 = this.r;
class_1799 var5 = this.n;
String var6 = this.I;
return a<"v">(28205, 4847086200368189816L ^ var1)
+ var6
+ a<"v">(12353, 523894766118080278L ^ var1)
+ var5
+ a<"v">(15085, 6604194612429784507L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 107757746572715L;
int var4 = this.I.hashCode();
int[] var10000 = vm.a<"Å">(4321638903054821553L, var1);
var4 = var4 * b<"a">(3292, 3397116966991262307L ^ var1) + this.n.hashCode();
int[] var3 = var10000;
var4 = var4 * b<"a">(25169, 4684416600765275375L ^ var1) + Long.hashCode(this.r);

try {
if (var3 == null) {
vm.a<"Å">(new _g[4], 4195595119426875396L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 4206390171714394937L, var1);
}
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
// 00: getstatic su/catlean/z9.a J
// 03: ldc2_w 74346371770007
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -8014812838109920371
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -7972435614272606203
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -7972435614272606203
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnull 5c
// 3c: instanceof su/catlean/z9
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -7972435614272606203
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -7972435614272606203
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/z9
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/z9.I Ljava/lang/String;
// 65: aload 5
// 67: getfield su/catlean/z9.I Ljava/lang/String;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -7972435614272606203
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -7972435614272606203
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/z9.n Lnet/minecraft/class_1799;
// 92: aload 5
// 94: getfield su/catlean/z9.n Lnet/minecraft/class_1799;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnull c5
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w -7972435614272606203
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w -7972435614272606203
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: getfield su/catlean/z9.r J
// bf: aload 5
// c1: getfield su/catlean/z9.r J
// c4: lcmp
// c5: aload 4
// c7: ifnull e7
// ca: ifeq e6
// cd: goto da
// d0: ldc2_w -7972435614272606203
// d3: lload 2
// d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d9: athrow
// da: bipush 0
// db: ireturn
// dc: ldc2_w -7972435614272606203
// df: lload 2
// e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e5: athrow
// e6: bipush 1
// e7: ireturn
}

static {
long var11 = a ^ 43743250564619L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[5];
int var18 = 0;
String var17 = "%o¤¤ã¼\u0013ï\u001b«êçò8Þ½/é}\u009f\u009d'W\u0016>`¾\u009e½ü~N(\u0014Ü¿if©\u001cSY6\u008bî\u008d\u0086®µ\u0091Î\u00adnÕpÀ\u009câÕ\u0003ÅO@P\r\b\u0002@0\u008aÝÇ  îz\u0090pÖã\u0092>EÆOð¶½\"\u001fö£q\u008c9¬b\u001cGÕ\u0092\u009c\u0000TZc";
int var19 = "%o¤¤ã¼\u0013ï\u001b«êçò8Þ½/é}\u009f\u009d'W\u0016>`¾\u009e½ü~N(\u0014Ü¿if©\u001cSY6\u008bî\u008d\u0086®µ\u0091Î\u00adnÕpÀ\u009câÕ\u0003ÅO@P\r\b\u0002@0\u008aÝÇ  îz\u0090pÖã\u0092>EÆOð¶½\"\u001fö£q\u008c9¬b\u001cGÕ\u0092\u009c\u0000TZc"
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
c = new String[5];
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
String var4 = ":Q\u001a\u0082ÓN¼Týÿ\u001b Nù\u0089\u0098";
int var5 = ":Q\u001a\u0082ÓN¼Týÿ\u001b Nù\u0089\u0098".length();
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

var17 = "(Óç%r7S '\u00adÿqédÞÖ Ó7ñÄêx\u0084j»õS\u0011yÙì ^r\\C\u0080½\u001a ÐÎ0E\u00adÀ\u009dµ";
var19 = "(Óç%r7S '\u00adÿqédÞÖ Ó7ñÄêx\u0084j»õS\u0011yÙì ^r\\C\u0080½\u001a ÐÎ0E\u00adÀ\u009dµ".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19931;
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
throw new RuntimeException("su/catlean/z9", var10);
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
throw new RuntimeException("su/catlean/z9" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17825;
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
throw new RuntimeException("su/catlean/z9", var14);
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
throw new RuntimeException("su/catlean/z9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
