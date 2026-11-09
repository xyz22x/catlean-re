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
import org.joml.Matrix3x2f;

public final class aj {
@NotNull
private final Matrix3x2f G;
private final float t;
private final float F;
private final float U;
private final float K;
private final float S;
private static final long a = yz.a(2763421543991658377L, -4364985071800389148L, MethodHandles.lookup().lookupClass()).a(217028587453178L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public aj(@NotNull Matrix3x2f m, float x, float y, float w, float h, float a) {
Intrinsics.checkNotNullParameter(m, "m");
super();
this.G = m;
this.t = x;
this.F = y;
this.U = w;
this.K = h;
this.S = ax;
}

@NotNull
public final Matrix3x2f D() {
return this.G;
}

public final float d() {
return this.t;
}

public final float v() {
return this.F;
}

public final float C() {
return this.U;
}

public final float J() {
return this.K;
}

public final float w() {
return this.S;
}

@NotNull
public final Matrix3x2f x() {
return this.G;
}

public final float e() {
return this.t;
}

public final float A() {
return this.F;
}

public final float h() {
return this.U;
}

public final float L() {
return this.K;
}

public final float s() {
return this.S;
}

@NotNull
public final aj z(@NotNull Matrix3x2f m, float x, float y, float w, float h, float a) {
Intrinsics.checkNotNullParameter(m, "m");
return new aj(m, x, y, w, h, ax);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static aj X(aj var0, Matrix3x2f var1, float var2, float var3, int var4, float var5, float var6, float var7, long var8, int var10, Object var11) {
long var12 = ((long)var4 << 32 | var8 << 32 >>> 32) ^ a;
String var14 = vm.a<"Å">(4978741235500100643L, var12);

int var10000;
label113: {
label112: {
try {
var10000 = var10 & 1;
if (var14 == null) {
break label113;
}

if (var10000 == 0) {
break label112;
}
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, 5024513609672090664L, var12);
}

var1 = var0.G;
}

var10000 = var10 & 2;
}

String var10001;
label104: {
label103: {
label102: {
try {
var10001 = var14;
if (var8 < 0L) {
break label104;
}

if (var14 == null) {
break label103;
}

if (var10000 == 0) {
break label102;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, 5024513609672090664L, var12);
}

var2 = var0.t;
}

var10000 = var10 & 4;
}

try {
var10001 = var14;
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 5024513609672090664L, var12);
}
}

label91: {
label90: {
label89: {
try {
if (var4 < 0) {
break label91;
}

if (var10001 == null) {
break label90;
}

if (var10000 == 0) {
break label89;
}
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, 5024513609672090664L, var12);
}

var3 = var0.F;
}

var10000 = var10 & b<"p">(9185, 4897259296579801865L ^ var12);
}

try {
var10001 = var14;
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 5024513609672090664L, var12);
}
}

label78: {
label77: {
label76: {
try {
if (var8 <= 0L) {
break label78;
}

if (var10001 == null) {
break label77;
}

if (var10000 == 0) {
break label76;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, 5024513609672090664L, var12);
}

var5 = var0.U;
}

var10000 = var10 & b<"p">(23876, 7303775731256012206L ^ var12);
}

try {
var10001 = var14;
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 5024513609672090664L, var12);
}
}

label65: {
label64: {
try {
if (var10001 == null) {
break label65;
}

if (var10000 == 0) {
break label64;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 5024513609672090664L, var12);
}

var6 = var0.K;
}

var10000 = var10 & b<"p">(29600, 7513509954328101707L ^ var12);
}

if (var10000 != 0) {
var7 = var0.S;
}

return var0.z(var1, var2, var3, var5, var6, var7);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 118440447138279L;
float var3 = this.S;
float var4 = this.K;
float var5 = this.U;
float var6 = this.F;
float var7 = this.t;
Matrix3x2f var8 = this.G;
return a<"y">(26238, 6387107596709627547L ^ var1)
+ var8
+ a<"y">(17527, 7456556964862338198L ^ var1)
+ var7
+ a<"y">(13868, 2143426999387117260L ^ var1)
+ var6
+ a<"y">(26860, 7527735291883849743L ^ var1)
+ var5
+ a<"y">(19142, 1540310699636173348L ^ var1)
+ var4
+ a<"y">(6588, 5130603663636298072L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 115945900493947L;
int var3 = this.G.hashCode();
var3 = var3 * b<"p">(13705, 4359790730792118080L ^ var1) + Float.hashCode(this.t);
var3 = var3 * b<"p">(17464, 6920688540915029750L ^ var1) + Float.hashCode(this.F);
var3 = var3 * b<"p">(17464, 6920688540915029750L ^ var1) + Float.hashCode(this.U);
var3 = var3 * b<"p">(17464, 6920688540915029750L ^ var1) + Float.hashCode(this.K);
return var3 * b<"p">(17464, 6920688540915029750L ^ var1) + Float.hashCode(this.S);
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
// 000: getstatic su/catlean/aj.a J
// 003: ldc2_w 138461135370167
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -7137278606681999928
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -7182704106678174269
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -7182704106678174269
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnull 05c
// 03c: instanceof su/catlean/aj
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -7182704106678174269
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -7182704106678174269
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/aj
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/aj.G Lorg/joml/Matrix3x2f;
// 065: aload 5
// 067: getfield su/catlean/aj.G Lorg/joml/Matrix3x2f;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnull 09a
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -7182704106678174269
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -7182704106678174269
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/aj.t F
// 092: aload 5
// 094: getfield su/catlean/aj.t F
// 097: invokestatic java/lang/Float.compare (FF)I
// 09a: aload 4
// 09c: ifnull 0c7
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w -7182704106678174269
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w -7182704106678174269
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/aj.F F
// 0bf: aload 5
// 0c1: getfield su/catlean/aj.F F
// 0c4: invokestatic java/lang/Float.compare (FF)I
// 0c7: aload 4
// 0c9: ifnull 0f4
// 0cc: ifeq 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w -7182704106678174269
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w -7182704106678174269
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/aj.U F
// 0ec: aload 5
// 0ee: getfield su/catlean/aj.U F
// 0f1: invokestatic java/lang/Float.compare (FF)I
// 0f4: aload 4
// 0f6: ifnull 121
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w -7182704106678174269
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w -7182704106678174269
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/aj.K F
// 119: aload 5
// 11b: getfield su/catlean/aj.K F
// 11e: invokestatic java/lang/Float.compare (FF)I
// 121: aload 4
// 123: ifnull 14e
// 126: ifeq 142
// 129: goto 136
// 12c: ldc2_w -7182704106678174269
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w -7182704106678174269
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 0
// 143: getfield su/catlean/aj.S F
// 146: aload 5
// 148: getfield su/catlean/aj.S F
// 14b: invokestatic java/lang/Float.compare (FF)I
// 14e: aload 4
// 150: ifnull 170
// 153: ifeq 16f
// 156: goto 163
// 159: ldc2_w -7182704106678174269
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: bipush 0
// 164: ireturn
// 165: ldc2_w -7182704106678174269
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: bipush 1
// 170: ireturn
}

static {
long var11 = a ^ 36012723767603L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[6];
int var18 = 0;
String var17 = "vb#¨+\u0001ØsÍ\u00813w¼p®¦\u0010rX¯ROØ\u00927\u009a\u0094^&uëè\u0098\u0010B\u0001Xê.^\u0086¤E\u0082\u0015{90L\u0084\u0010Rsà\u0094û'Ò÷\u0014x[\u001f\u008fè±=";
int var19 = "vb#¨+\u0001ØsÍ\u00813w¼p®¦\u0010rX¯ROØ\u00927\u009a\u0094^&uëè\u0098\u0010B\u0001Xê.^\u0086¤E\u0082\u0015{90L\u0084\u0010Rsà\u0094û'Ò÷\u0014x[\u001f\u008fè±="
.length();
char var16 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var36;
if ((var24 += var16) >= var19) {
b = var20;
c = new String[6];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "\u009d\u0011î½\u0089åV'¬\u0090\u0093{\u0087LÅó¸\u009b¼ãußÞµ";
int var5 = "\u009d\u0011î½\u0089åV'¬\u0090\u0093{\u0087LÅó¸\u009b¼ãußÞµ".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
e = var6;
f = new Integer[5];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "l\u0003\u0081´\u001dm43ç\u000e\u009cuT\u0098ì+";
var5 = "l\u0003\u0081´\u001dm43ç\u000e\u009cuT\u0098ì+".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var36;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label54;
}

var17 = "¡l5\u0092\u0011,ùÎ±?eÓL :\u0015\u001eöT\u001f³+zöÌ¦&¤\u0098\u0019\u0094·¸\u0096·\u0094Ä*¢n\u0010\u0013\u008eZÔu\u0096q\u001e ¯)¸¸ð\\ç";
var19 = "¡l5\u0092\u0011,ùÎ±?eÓL :\u0015\u001eöT\u001f³+zöÌ¦&¤\u0098\u0019\u0094·¸\u0096·\u0094Ä*¢n\u0010\u0013\u008eZÔu\u0096q\u001e ¯)¸¸ð\\ç".length();
var16 = '(';
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21400;
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
throw new RuntimeException("su/catlean/aj", var10);
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
throw new RuntimeException("su/catlean/aj" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13352;
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
throw new RuntimeException("su/catlean/aj", var14);
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
throw new RuntimeException("su/catlean/aj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
