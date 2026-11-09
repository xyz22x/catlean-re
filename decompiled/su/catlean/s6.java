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
import org.jetbrains.annotations.Nullable;

public final class s6 {
@NotNull
private final String q;
@NotNull
private final Number U;
@NotNull
private final String l;
private static final long a = yz.a(1394539461176179732L, 7348031326951668882L, MethodHandles.lookup().lookupClass()).a(114291661978187L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public s6(@NotNull String name, short a, @NotNull Number value, int a, @NotNull String overrideName, char a) {
long var7 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(name, a<"w">(1451, 5575874701451646220L ^ var7));
Intrinsics.checkNotNullParameter(value, a<"w">(15567, 2804447817415126125L ^ var7));
Intrinsics.checkNotNullParameter(overrideName, a<"w">(60, 6167466578296492185L ^ var7));
super();
this.q = name;
this.U = value;
this.l = overrideName;
}

@NotNull
public final String P() {
return this.q;
}

@NotNull
public final Number V() {
return this.U;
}

@NotNull
public final String H() {
return this.l;
}

@NotNull
public final String w() {
return this.q;
}

@NotNull
public final Number G() {
return this.U;
}

@NotNull
public final String m() {
return this.l;
}

@NotNull
public final s6 H(@NotNull String name, @NotNull Number value, long a, @NotNull String overrideName) {
ax = a ^ ax;
long var10001 = ax ^ 92877360415873L;
int var6 = (int)((ax ^ 92877360415873L) >>> 48);
int var7 = (int)((ax ^ 92877360415873L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(name, a<"w">(16224, 5224582194812912928L ^ ax));
Intrinsics.checkNotNullParameter(value, a<"w">(6004, 2112872906949700925L ^ ax));
Intrinsics.checkNotNullParameter(overrideName, a<"w">(20510, 7910113291393100378L ^ ax));
return new s6(name, (short)var6, value, var7, overrideName, (char)var8);
}

public static s6 s(s6 var0, String var1, long var2, Number var4, String var5, int var6, Object var7) {
var2 = a ^ var2;
long var8 = var2 ^ 72678736506230L;
_g[] var10 = vm.a<"Å">(2983619049443554289L, var2);

int var10000;
label41: {
label40: {
try {
var10000 = var6 & 1;
if (var10 != null) {
break label41;
}

if (var10000 == 0) {
break label40;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 2990537721758696719L, var2);
}

var1 = var0.q;
}

var10000 = var6 & 2;
}

label32: {
label31: {
try {
if (var10 != null) {
break label32;
}

if (var10000 == 0) {
break label31;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 2990537721758696719L, var2);
}

var4 = var0.U;
}

var10000 = var6 & 4;
}

if (var10000 != 0) {
var5 = var0.l;
}

return var0.H(var1, var4, var8, var5);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 58156397553821L;
String var3 = this.l;
Number var4 = this.U;
String var5 = this.q;
return a<"w">(5598, 1908707867052786226L ^ var1)
+ var5
+ a<"w">(30393, 8426134265327264080L ^ var1)
+ var4
+ a<"w">(29454, 1265405616810730720L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 51132317217472L;
vm.a<"Å">(2126475379180685076L, var1);
int var4 = this.q.hashCode();
var4 = var4 * b<"y">(3715, 8168314925918091289L ^ var1) + this.U.hashCode();
var4 = var4 * b<"y">(17085, 6086463696473469990L ^ var1) + this.l.hashCode();

try {
if (vm.a<"Å">(2158546836986528613L, var1) != null) {
vm.a<"Å">(new _g[1], 2042214004207497829L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 2118298856341074410L, var1);
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
// 00: getstatic su/catlean/s6.a J
// 03: ldc2_w 55683403229966
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -8913505252497465638
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: aload 0
// 14: aload 4
// 16: ifnonnull 37
// 19: aload 1
// 1a: if_acmpne 36
// 1d: goto 2a
// 20: ldc2_w -8886822850020644828
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 1
// 2b: ireturn
// 2c: ldc2_w -8886822850020644828
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: aload 4
// 39: ifnonnull 5c
// 3c: instanceof su/catlean/s6
// 3f: ifne 5b
// 42: goto 4f
// 45: ldc2_w -8886822850020644828
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: bipush 0
// 50: ireturn
// 51: ldc2_w -8886822850020644828
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 1
// 5c: checkcast su/catlean/s6
// 5f: astore 5
// 61: aload 0
// 62: getfield su/catlean/s6.q Ljava/lang/String;
// 65: aload 5
// 67: getfield su/catlean/s6.q Ljava/lang/String;
// 6a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 6d: aload 4
// 6f: ifnonnull 9a
// 72: ifne 8e
// 75: goto 82
// 78: ldc2_w -8886822850020644828
// 7b: lload 2
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: bipush 0
// 83: ireturn
// 84: ldc2_w -8886822850020644828
// 87: lload 2
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: aload 0
// 8f: getfield su/catlean/s6.U Ljava/lang/Number;
// 92: aload 5
// 94: getfield su/catlean/s6.U Ljava/lang/Number;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: aload 4
// 9c: ifnonnull c7
// 9f: ifne bb
// a2: goto af
// a5: ldc2_w -8886822850020644828
// a8: lload 2
// a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ae: athrow
// af: bipush 0
// b0: ireturn
// b1: ldc2_w -8886822850020644828
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: getfield su/catlean/s6.l Ljava/lang/String;
// bf: aload 5
// c1: getfield su/catlean/s6.l Ljava/lang/String;
// c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// c7: aload 4
// c9: ifnonnull e9
// cc: ifne e8
// cf: goto dc
// d2: ldc2_w -8886822850020644828
// d5: lload 2
// d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// db: athrow
// dc: bipush 0
// dd: ireturn
// de: ldc2_w -8886822850020644828
// e1: lload 2
// e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e7: athrow
// e8: bipush 1
// e9: ireturn
}

static {
long var11 = a ^ 74438599845711L;
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
String var17 = "Á\u0082ÅÑ\u0097æ\u0017ïµ'5¿Æwþ\u0018 ½g¨/§Æ\u0094ßC5\u0000¼ÑØ\u001e\u0010À&-r\u008eü¯\u00954/LÈ\u009c\u0013Fa\u0010\u009eø\u0084å\u0082ûëþÞz\rc¼5\u007f)\u0018Ê_]Z\u0003¡\u008e½\u0001\u009fÝëÏÆØE±Âk%fú\u001bP S\u0097Å&ÏêÆÕ4ßOÝ\u001bAí: îP÷épÓÎÓç\u009dì®Ø\u0088Z SÛ½2\u000e4ÙÙøo)\u0096)©+\u001eÆZKàè\u0080Å²Éj,\u0018ôWîÅ@\u000f!\u0018Xî ëÑÕ)\u008e¢\u0084\u001ffKT×\u008a³\u0011GeÒ®kø\u001f\u0092\u0082I*z3ë\rg\u0097*¢Ê\u0000FP\u008e¥ÍmÃ\u0017\u001d\u0087téÈ\u0097ê\u008azTç[\n@";
int var19 = "Á\u0082ÅÑ\u0097æ\u0017ïµ'5¿Æwþ\u0018 ½g¨/§Æ\u0094ßC5\u0000¼ÑØ\u001e\u0010À&-r\u008eü¯\u00954/LÈ\u009c\u0013Fa\u0010\u009eø\u0084å\u0082ûëþÞz\rc¼5\u007f)\u0018Ê_]Z\u0003¡\u008e½\u0001\u009fÝëÏÆØE±Âk%fú\u001bP S\u0097Å&ÏêÆÕ4ßOÝ\u001bAí: îP÷épÓÎÓç\u009dì®Ø\u0088Z SÛ½2\u000e4ÙÙøo)\u0096)©+\u001eÆZKàè\u0080Å²Éj,\u0018ôWîÅ@\u000f!\u0018Xî ëÑÕ)\u008e¢\u0084\u001ffKT×\u008a³\u0011GeÒ®kø\u001f\u0092\u0082I*z3ë\rg\u0097*¢Ê\u0000FP\u008e¥ÍmÃ\u0017\u001d\u0087téÈ\u0097ê\u008azTç[\n@"
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
String var4 = "H\u0016Rô\u0099õ\u0080vªÚê\u0098\u008f·Õ\u0016";
int var5 = "H\u0016Rô\u0099õ\u0080vªÚê\u0098\u008f·Õ\u0016".length();
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

var17 = "\u001c:m\u0080¸\u0086müÞw¢üü\b\u0004N\u0010Sm*¥[ñ¹A\u0083ÙB}\u0097ÆÃe";
var19 = "\u001c:m\u0080¸\u0086müÞw¢üü\b\u0004N\u0010Sm*¥[ñ¹A\u0083ÙB}\u0097ÆÃe".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4370;
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
throw new RuntimeException("su/catlean/s6", var10);
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
throw new RuntimeException("su/catlean/s6" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27198;
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
throw new RuntimeException("su/catlean/s6", var14);
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
throw new RuntimeException("su/catlean/s6" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
