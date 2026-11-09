package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class z0 implements class_11281 {
private final float q;
private final float P;
@NotNull
private final Color k;
private final float p;
private static final long a = yz.a(-6525553850541739973L, -2200340985123166761L, MethodHandles.lookup().lookupClass()).a(63127432282481L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public z0(float halfTexelSizeX, float halfTexelSizeY, long a, @NotNull Color color, float lineWidth) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(color, a<"a">(27348, 1037147660693151566L ^ ax));
super();
this.q = halfTexelSizeX;
this.P = halfTexelSizeY;
this.k = color;
this.p = lineWidth;
}

public final float A() {
return this.q;
}

public final float h() {
return this.P;
}

@NotNull
public final Color W() {
return this.k;
}

public final float v() {
return this.p;
}

public void method_71104(@NotNull ByteBuffer buffer) {
long var2 = a ^ 120881921072125L;
long var4 = var2 ^ 35815211655996L;
long var6 = var2 ^ 132212822850449L;
long var10001 = var2 ^ 24153619280699L;
int var8 = (int)((var2 ^ 24153619280699L) >>> 48);
int var9 = (int)((var2 ^ 24153619280699L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
long var11 = (var2 ^ 15680355147829L) >>> 32;
int var13 = (int)((var2 ^ 15680355147829L) << 32 >>> 32);
Intrinsics.checkNotNullParameter(buffer, a<"a">(13522, 3616359918094774967L ^ var2));
Std140Builder.intoBuffer(buffer)
.putVec2(this.q, this.P)
.putVec4(jl.y.y(this.k, (char)var8, (short)var9, var10), jl.y.M(var6, this.k), jl.y.r(this.k, var11, var13), jl.y.G(var4, this.k))
.putFloat(this.p);
}

public final float j() {
return this.q;
}

public final float b() {
return this.P;
}

@NotNull
public final Color Y() {
return this.k;
}

public final float U() {
return this.p;
}

@NotNull
public final z0 N(float halfTexelSizeX, float halfTexelSizeY, @NotNull Color color, long a, float lineWidth) {
ax = a ^ ax;
long var7 = ax ^ 49914879175486L;
Intrinsics.checkNotNullParameter(color, a<"a">(8410, 1351571666145403062L ^ ax));
return new z0(halfTexelSizeX, halfTexelSizeY, var7, color, lineWidth);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static z0 f(z0 var0, long var1, float var3, float var4, Color var5, float var6, int var7, Object var8) {
var1 = a ^ var1;
long var9 = var1 ^ 58615325697689L;
String[] var11 = vm.a<"Å">(4204502894525732455L, var1);

int var10000;
label65: {
label64: {
try {
var10000 = var7 & 1;
if (var11 != null) {
break label65;
}

if (var10000 == 0) {
break label64;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 4217246488637688257L, var1);
}

var3 = var0.q;
}

var10000 = var7 & 2;
}

String[] var10001;
label56: {
label55: {
label54: {
try {
var10001 = var11;
if (var1 <= 0L) {
break label56;
}

if (var11 != null) {
break label55;
}

if (var10000 == 0) {
break label54;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 4217246488637688257L, var1);
}

var4 = var0.P;
}

var10000 = var7 & 4;
}

try {
var10001 = var11;
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 4217246488637688257L, var1);
}
}

label43: {
label42: {
try {
if (var10001 != null) {
break label43;
}

if (var10000 == 0) {
break label42;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 4217246488637688257L, var1);
}

var5 = var0.k;
}

var10000 = var7 & b<"l">(10450, 2881395744458284634L ^ var1);
}

if (var10000 != 0) {
var6 = var0.p;
}

return var0.N(var3, var4, var5, var9, var6);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 67885645537807L;
float var3 = this.p;
Color var4 = this.k;
float var5 = this.P;
float var6 = this.q;
return a<"a">(32473, 2077603476970799433L ^ var1)
+ var6
+ a<"a">(11781, 7354157288344932758L ^ var1)
+ var5
+ a<"a">(26087, 3529615143642438257L ^ var1)
+ var4
+ a<"a">(9969, 4787746366882634083L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 107378999226486L;
int var3 = Float.hashCode(this.q);
var3 = var3 * b<"l">(29249, 8467353818098585882L ^ var1) + Float.hashCode(this.P);
var3 = var3 * b<"l">(15099, 5096590060889348515L ^ var1) + this.k.hashCode();
return var3 * b<"l">(15099, 5096590060889348515L ^ var1) + Float.hashCode(this.p);
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
// 000: getstatic su/catlean/z0.a J
// 003: ldc2_w 126830004874344
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 8328853279217393576
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 8307392679626670094
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 8307392679626670094
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/z0
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 8307392679626670094
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 8307392679626670094
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/z0
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/z0.q F
// 065: aload 5
// 067: getfield su/catlean/z0.q F
// 06a: invokestatic java/lang/Float.compare (FF)I
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w 8307392679626670094
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 8307392679626670094
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/z0.P F
// 092: aload 5
// 094: getfield su/catlean/z0.P F
// 097: invokestatic java/lang/Float.compare (FF)I
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 8307392679626670094
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 8307392679626670094
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/z0.k Ljava/awt/Color;
// 0bf: aload 5
// 0c1: getfield su/catlean/z0.k Ljava/awt/Color;
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c7: aload 4
// 0c9: ifnonnull 0f4
// 0cc: ifne 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 8307392679626670094
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 8307392679626670094
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/z0.p F
// 0ec: aload 5
// 0ee: getfield su/catlean/z0.p F
// 0f1: invokestatic java/lang/Float.compare (FF)I
// 0f4: aload 4
// 0f6: ifnonnull 116
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w 8307392679626670094
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 8307392679626670094
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: bipush 1
// 116: ireturn
}

static {
long var11 = a ^ 7705093482594L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[7];
int var18 = 0;
String var17 = "¥\u0086çîj\n&0\u0002SÔ¼\u00ad]\u0004v\u0012\u008em\u0081L'ÖG'\u0092¢\u0084»\u0090 \u0003\u0095¢\u009búÃ,Iy \u000f]úr%\u0018b\u0001x\u0090S®$\u0081Ó\\È\u0093\u00854¦°3¢å¼ûÉ4xeÇ\u0010G¬,¤\u0087õ\\¨m¼ÇT\u001eå_'8.Ý\u001föºx,l\u0080c\u0092³8æEÉå\u0001\u0098ûï'¾\u0095?qS{¬å÷mì»>?1ïì£7N+\u001b²? 7Z¥\u0012:\f¹kã\u0010\u0086*Eà¬\u001b\u0014Æ\u0082%Îøë¬à#";
int var19 = "¥\u0086çîj\n&0\u0002SÔ¼\u00ad]\u0004v\u0012\u008em\u0081L'ÖG'\u0092¢\u0084»\u0090 \u0003\u0095¢\u009búÃ,Iy \u000f]úr%\u0018b\u0001x\u0090S®$\u0081Ó\\È\u0093\u00854¦°3¢å¼ûÉ4xeÇ\u0010G¬,¤\u0087õ\\¨m¼ÇT\u001eå_'8.Ý\u001föºx,l\u0080c\u0092³8æEÉå\u0001\u0098ûï'¾\u0095?qS{¬å÷mì»>?1ïì£7N+\u001b²? 7Z¥\u0012:\f¹kã\u0010\u0086*Eà¬\u001b\u0014Æ\u0082%Îøë¬à#"
.length();
char var16 = '(';
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
c = new String[7];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "B{ë^}/\u001bÂEò\u000b1b\r\u0015\u0096\u0091+:¼á&RÃ";
int var5 = "B{ë^}/\u001bÂEò\u000b1b\r\u0015\u0096\u0091+:¼á&RÃ".length();
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
f = new Integer[3];
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

var17 = "P\u0005\u0014÷Ê®\n\u009dÛ\u001c-\u0088\u009f§jèj\u0083£ª\bî\u0007ê¿«Ú\n¡åá+\u0010S´Wcñ\u0017Ñ åÿ\u0084ÑÁéÅ7";
var19 = "P\u0005\u0014÷Ê®\n\u009dÛ\u001c-\u0088\u009f§jèj\u0083£ª\bî\u0007ê¿«Ú\n¡åá+\u0010S´Wcñ\u0017Ñ åÿ\u0084ÑÁéÅ7".length();
var16 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 848;
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
throw new RuntimeException("su/catlean/z0", var10);
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
throw new RuntimeException("su/catlean/z0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 3555;
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
throw new RuntimeException("su/catlean/z0", var14);
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
throw new RuntimeException("su/catlean/z0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
