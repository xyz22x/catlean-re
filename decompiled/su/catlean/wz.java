package su.catlean;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;

public final class wz {
@NotNull
public static final wz K;
@NotNull
private static final ConcurrentHashMap C;
@NotNull
private static final ConcurrentHashMap Q;
@NotNull
private static final class_2960 O;
private static int V;
private static final long a = yz.a(-5246863676177136358L, 9119616779345220253L, MethodHandles.lookup().lookupClass()).a(126625378116895L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private wz() {
}

@NotNull
public final class_2960 F(long a, @NotNull String url) {
ax = a ^ ax;
_g[] var10000 = vm.a<"Å">(-3317443646543478793L, ax);
Intrinsics.checkNotNullParameter(url, a<"k">(6561, 3170496686182655523L ^ ax));
_g[] var4 = var10000;

label22: {
Object var10001;
label21: {
try {
var10000 = (class_2960)C.get(url);
var10001 = var10000;
if (var4 != null) {
break label21;
}

if (var10000 != null) {
break label22;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -3348503706276317395L, ax);
}

var10000 = Q.computeIfAbsent(url, wz::O);
var10001 = var10000;
}

Intrinsics.checkNotNullExpressionValue(var10001, a<"k">(17761, 6576086116778261225L ^ ax));
CompletableFuture var5 = (CompletableFuture)var10000;
return O;
}

Object var6 = var10000;
boolean var7 = false;
return (class_2960)var6;
}

@NotNull
public final BufferedImage h(@NotNull BufferedImage image, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(image, a<"k">(29177, 4997283592973944510L ^ ax));
int var4 = image.getWidth();
int var5 = image.getHeight();
int var6 = Math.min(var4, var5);
int var7 = (var4 - var6) / 2;
int var8 = (var5 - var6) / 2;
BufferedImage var10000 = image.getSubimage(var7, var8, var6, var6);
Intrinsics.checkNotNullExpressionValue(var10000, a<"k">(4755, 7023954689578198487L ^ ax));
return var10000;
}

@NotNull
public final class_1011 D(int a, @NotNull class_1011 image, short a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/wz.a J
// 01b: lxor
// 01c: lstore 5
// 01e: ldc2_w -1639453670343702722
// 021: lload 5
// 023: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: aload 2
// 029: sipush 28680
// 02c: ldc2_w 9140819960015107906
// 02f: lload 5
// 031: lxor
// 032: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/wz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 03a: astore 7
// 03c: sipush 3546
// 03f: ldc2_w 8453550598200573890
// 042: lload 5
// 044: lxor
// 045: invokedynamic w (IJ)I bsm=su/catlean/wz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04a: istore 8
// 04c: sipush 27751
// 04f: ldc2_w 8849635647134457468
// 052: lload 5
// 054: lxor
// 055: invokedynamic w (IJ)I bsm=su/catlean/wz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: istore 9
// 05c: aload 2
// 05d: invokevirtual net/minecraft/class_1011.method_4307 ()I
// 060: istore 10
// 062: aload 2
// 063: invokevirtual net/minecraft/class_1011.method_4323 ()I
// 066: istore 11
// 068: aload 2
// 069: invokevirtual net/minecraft/class_1011.method_4323 ()I
// 06c: istore 12
// 06e: iload 8
// 070: iload 10
// 072: if_icmplt 0a7
// 075: iload 9
// 077: iload 12
// 079: aload 7
// 07b: iload 4
// 07d: ifle 085
// 080: ifnonnull 0b0
// 083: aload 7
// 085: ifnonnull 0b0
// 088: goto 096
// 08b: ldc2_w -1635133666260676636
// 08e: lload 5
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: if_icmpge 0b8
// 099: goto 0a7
// 09c: ldc2_w -1635133666260676636
// 09f: lload 5
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: iload 8
// 0a9: bipush 2
// 0aa: imul
// 0ab: istore 8
// 0ad: iload 9
// 0af: bipush 2
// 0b0: imul
// 0b1: istore 9
// 0b3: aload 7
// 0b5: ifnull 06e
// 0b8: new net/minecraft/class_1011
// 0bb: dup
// 0bc: iload 8
// 0be: iload 9
// 0c0: bipush 1
// 0c1: invokespecial net/minecraft/class_1011.<init> (IIZ)V
// 0c4: astore 13
// 0c6: bipush 0
// 0c7: iload 1
// 0c8: iflt 077
// 0cb: istore 14
// 0cd: iload 14
// 0cf: iload 10
// 0d1: if_icmpge 11f
// 0d4: aload 7
// 0d6: ifnonnull 127
// 0d9: bipush 0
// 0da: istore 15
// 0dc: iload 15
// 0de: iload 11
// 0e0: if_icmpge 117
// 0e3: aload 13
// 0e5: iload 14
// 0e7: iload 15
// 0e9: aload 2
// 0ea: iload 14
// 0ec: iload 15
// 0ee: invokevirtual net/minecraft/class_1011.method_61940 (II)I
// 0f1: invokevirtual net/minecraft/class_1011.method_61941 (III)V
// 0f4: iinc 15 1
// 0f7: aload 7
// 0f9: iload 3
// 0fa: ifle 11c
// 0fd: ifnonnull 11a
// 100: aload 7
// 102: ifnull 0dc
// 105: iload 1
// 106: iflt 0f7
// 109: goto 117
// 10c: ldc2_w -1635133666260676636
// 10f: lload 5
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: iinc 14 1
// 11a: aload 7
// 11c: ifnull 0cd
// 11f: aload 2
// 120: invokevirtual net/minecraft/class_1011.close ()V
// 123: iload 1
// 124: ifle 127
// 127: aload 13
// 129: areturn
}

private static final String r(int var0) {
long var1 = a ^ 97811744737213L;
return a<"k">(6225, 7129118272496100331L ^ var1) + var0;
}

private static final void u(class_2960 var0, class_1011 var1, String var2, CompletableFuture var3, int var4) {
long var5 = a ^ 27635154359454L;
long var7 = var5 ^ 62046598290156L;
zf.F(var7).method_1531().method_4616(var0, (class_1044)(new class_1043(wz::r, var1)));
C.put(var2, var0);
var3.complete(var0);
Q.remove(var2);
}

private static final void y(String var0, CompletableFuture var1) {
long var2 = a ^ 56197953409830L;
long var4 = var2 ^ 20137188040020L;
long var6 = var2 ^ 63972193961056L;

try {
class_2960 var8 = l6.m(var6, a<"k">(27184, 6263994384035120411L ^ var2) + (int)(Random.Default.nextFloat() * b<"w">(3254, 5997597687982069446L ^ var2)));
InputStream var9 = URI.create(var0).toURL().openStream();
class_1011 var10000 = class_1011.method_4309(var9);
Intrinsics.checkNotNullExpressionValue(var10000, a<"k">(1679, 5746611580728666533L ^ var2));
class_1011 var10 = var10000;
V++;
int var11 = V;
zf.F(var4).execute(wz::u);
} catch (Exception var12) {
var1.complete(O);
Q.remove(var0);
}
}

private static final CompletableFuture A(String var0, String var1) {
long var2 = a ^ 140024375263287L;
Intrinsics.checkNotNullParameter(var1, a<"k">(3053, 4451336972936050652L ^ var2));
CompletableFuture var4 = new CompletableFuture();
boolean var6 = false;
new Thread(wz::y).start();
return var4;
}

private static final CompletableFuture O(Function1 var0, Object var1) {
return (CompletableFuture)var0.invoke(var1);
}

static {
long var20 = a ^ 36544123156093L;
long var22 = var20 ^ 120430915259973L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[11];
int var16 = 0;
String var15 = "~%:@øêkóN\u001aîÏÂ×ä_\u0010\u009e)2¦Cm\u001f2Ã^\u0016=çSý\u0010\u0010¬õ\u000eÉãU}Úï¾»Xî\n?\u009b(¸\rtI\u0017úà\u0014\u0002F°2@æØj\u009aÊúü;\u0018_àÉäñ\u0016½\u007fç\u0011ÌnþV\u0098Fs\u0085(d>m[¸1In\u0014|\u0090A0°Ù½6\u0087\b\u00991ù\u0086F#ÉÇ\nàsü1-&¿$ñõ\u008f@0:qÿ\u0080^\u0085s,'6·ôÌ\u0007+âq¯#Ñ\u0016ü\u0083\u0083Ü\u009aíJÑÛ§~áB\u008f\u009f\u007fB\u008e£}íÄ¥ÊÉ\u0096\u008f\u0010My8¾\u0082\u0001\u001e\u0094zé¯sZ±\u0095Ä\u0010IÃdÀRkÍºè\u0016´µ¸\u00936\u009c\u0018y}\u001fZUoÉ\u000bN?\u0085\u00adô\u0088\u000fc\u0090Ü+ÜXoøù";
int var17 = "~%:@øêkóN\u001aîÏÂ×ä_\u0010\u009e)2¦Cm\u001f2Ã^\u0016=çSý\u0010\u0010¬õ\u000eÉãU}Úï¾»Xî\n?\u009b(¸\rtI\u0017úà\u0014\u0002F°2@æØj\u009aÊúü;\u0018_àÉäñ\u0016½\u007fç\u0011ÌnþV\u0098Fs\u0085(d>m[¸1In\u0014|\u0090A0°Ù½6\u0087\b\u00991ù\u0086F#ÉÇ\nàsü1-&¿$ñõ\u008f@0:qÿ\u0080^\u0085s,'6·ôÌ\u0007+âq¯#Ñ\u0016ü\u0083\u0083Ü\u009aíJÑÛ§~áB\u008f\u009f\u007fB\u008e£}íÄ¥ÊÉ\u0096\u008f\u0010My8¾\u0082\u0001\u001e\u0094zé¯sZ±\u0095Ä\u0010IÃdÀRkÍºè\u0016´µ¸\u00936\u009c\u0018y}\u001fZUoÉ\u000bN?\u0085\u00adô\u0088\u000fc\u0090Ü+ÜXoøù"
.length();
char var14 = 16;
int var25 = -1;

label45:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var35 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var35;
if ((var25 += var14) >= var17) {
b = var18;
c = new String[11];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "`\u0093J\u000e\u0095ù\u001cÁ\f\u0093\u00026sa M~-`DõRM\u0099";
int var5 = "`\u0093J\u000e\u0095ù\u001cÁ\f\u0093\u00026sa M~-`DõRM\u0099".length();
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
byte var40 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[3];
K = new wz();
C = new ConcurrentHashMap();
Q = new ConcurrentHashMap();
O = l6.J(a<"k">(12242, 5712524065916528045L ^ var20), a<"k">(31647, 2300166197806166499L ^ var20), var22);
return;
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var35;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label45;
}

var15 = "ÁIîY!ü3ZÜ¡\u0002é\u0090\\1©ªë\u0018U9\u0086::jùL<@b¬<(#h*\u0090¨X\tR¥ì\u0095\u008fÅè\u0093§!)v\u0082Rº\u008aI\u009cU([°VßÇ\u001fLî\u001fÉwi\u0090";
var17 = "ÁIîY!ü3ZÜ¡\u0002é\u0090\\1©ªë\u0018U9\u0086::jùL<@b¬<(#h*\u0090¨X\tR¥ì\u0095\u008fÅè\u0093§!)v\u0082Rº\u008aI\u009cU([°VßÇ\u001fLî\u001fÉwi\u0090"
.length();
var14 = ' ';
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12095;
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
throw new RuntimeException("su/catlean/wz", var10);
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
throw new RuntimeException("su/catlean/wz" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 23149;
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
throw new RuntimeException("su/catlean/wz", var14);
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
throw new RuntimeException("su/catlean/wz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
