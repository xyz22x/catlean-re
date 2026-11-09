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

public final class jd implements class_11281 {
private final float h;
private final float S;
private final float b;
private final float i;
@NotNull
private final Color A;
private static final long a = yz.a(-5614685526224578887L, -1720000299022954843L, MethodHandles.lookup().lookupClass()).a(166248311084952L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map j;

public jd(float uSizeX, float uSizeY, float radius, float uBorderWidth, long a, @NotNull Color uBorderColor) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(uBorderColor, a<"q">(13388, 4592726704147917935L ^ ax));
super();
this.h = uSizeX;
this.S = uSizeY;
this.b = radius;
this.i = uBorderWidth;
this.A = uBorderColor;
}

public final float s() {
return this.h;
}

public final float E() {
return this.S;
}

public final float m() {
return this.b;
}

public final float M() {
return this.i;
}

@NotNull
public final Color u() {
return this.A;
}

public void method_71104(@NotNull ByteBuffer buffer) {
long var2 = a ^ 88786892832246L;
long var4 = var2 ^ 87322427401472L;
long var6 = var2 ^ 26141400563117L;
long var10001 = var2 ^ 134200637682951L;
int var8 = (int)((var2 ^ 134200637682951L) >>> 48);
int var9 = (int)((var2 ^ 134200637682951L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
long var11 = (var2 ^ 107457586947593L) >>> 32;
int var13 = (int)((var2 ^ 107457586947593L) << 32 >>> 32);
Intrinsics.checkNotNullParameter(buffer, a<"q">(5770, 6244151683664831950L ^ var2));
Std140Builder.intoBuffer(buffer)
.putVec2(this.h, this.S)
.putFloat(this.b)
.putFloat(this.i)
.putVec4(jl.y.y(this.A, (char)var8, (short)var9, var10), jl.y.M(var6, this.A), jl.y.r(this.A, var11, var13), jl.y.G(var4, this.A));
}

public final float W() {
return this.h;
}

public final float f() {
return this.S;
}

public final float T() {
return this.b;
}

public final float P() {
return this.i;
}

@NotNull
public final Color H() {
return this.A;
}

@NotNull
public final jd V(float uSizeX, float uSizeY, float radius, float uBorderWidth, long a, @NotNull Color uBorderColor) {
ax = a ^ ax;
long var8 = ax ^ 52538219104036L;
Intrinsics.checkNotNullParameter(uBorderColor, a<"q">(19393, 3077206140846680634L ^ ax));
return new jd(uSizeX, uSizeY, radius, uBorderWidth, var8, uBorderColor);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static jd u(jd var0, float var1, float var2, float var3, float var4, long var5, Color var7, int var8, Object var9) {
var5 = a ^ var5;
long var10 = var5 ^ 33316229106366L;
String[] var12 = vm.a<"Å">(7259859138372536574L, var5);

int var10000;
label89: {
label88: {
try {
var10000 = var8 & 1;
if (var12 != null) {
break label89;
}

if (var10000 == 0) {
break label88;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 7232289053473067821L, var5);
}

var1 = var0.h;
}

var10000 = var8 & 2;
}

String[] var10001;
label80: {
label79: {
label78: {
try {
var10001 = var12;
if (var5 <= 0L) {
break label80;
}

if (var12 != null) {
break label79;
}

if (var10000 == 0) {
break label78;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 7232289053473067821L, var5);
}

var2 = var0.S;
}

var10000 = var8 & 4;
}

try {
var10001 = var12;
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 7232289053473067821L, var5);
}
}

label67: {
label66: {
label65: {
try {
if (var5 <= 0L) {
break label67;
}

if (var10001 != null) {
break label66;
}

if (var10000 == 0) {
break label65;
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 7232289053473067821L, var5);
}

var3 = var0.b;
}

var10000 = var8 & b<"f">(18500, 1408866597281925229L ^ var5);
}

try {
var10001 = var12;
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 7232289053473067821L, var5);
}
}

label54: {
label53: {
try {
if (var10001 != null) {
break label54;
}

if (var10000 == 0) {
break label53;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 7232289053473067821L, var5);
}

var4 = var0.i;
}

var10000 = var8 & b<"f">(30456, 8903166102455432915L ^ var5);
}

if (var10000 != 0) {
var7 = var0.A;
}

return var0.V(var1, var2, var3, var4, var10, var7);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 112360686389350L;
Color var3 = this.A;
float var4 = this.i;
float var5 = this.b;
float var6 = this.S;
float var7 = this.h;
return a<"q">(3513, 7027220030342613866L ^ var1)
+ var7
+ a<"q">(1222, 3921026399455691281L ^ var1)
+ var6
+ a<"q">(9882, 5250194042742956111L ^ var1)
+ var5
+ a<"q">(32597, 4644136214576052613L ^ var1)
+ var4
+ a<"q">(17710, 552232320433947644L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 28222578574188L;
int var3 = Float.hashCode(this.h);
var3 = var3 * b<"f">(5228, 7686400749737233441L ^ var1) + Float.hashCode(this.S);
var3 = var3 * b<"f">(8806, 1870291388131539497L ^ var1) + Float.hashCode(this.b);
var3 = var3 * b<"f">(8806, 1870291388131539497L ^ var1) + Float.hashCode(this.i);
return var3 * b<"f">(8806, 1870291388131539497L ^ var1) + this.A.hashCode();
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
// 000: getstatic su/catlean/jd.a J
// 003: ldc2_w 32375720965288
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 5431687561100896095
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 5476175874337766540
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 5476175874337766540
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/jd
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 5476175874337766540
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 5476175874337766540
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/jd
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/jd.h F
// 065: aload 5
// 067: getfield su/catlean/jd.h F
// 06a: invokestatic java/lang/Float.compare (FF)I
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w 5476175874337766540
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 5476175874337766540
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/jd.S F
// 092: aload 5
// 094: getfield su/catlean/jd.S F
// 097: invokestatic java/lang/Float.compare (FF)I
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 5476175874337766540
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 5476175874337766540
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/jd.b F
// 0bf: aload 5
// 0c1: getfield su/catlean/jd.b F
// 0c4: invokestatic java/lang/Float.compare (FF)I
// 0c7: aload 4
// 0c9: ifnonnull 0f4
// 0cc: ifeq 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 5476175874337766540
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 5476175874337766540
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/jd.i F
// 0ec: aload 5
// 0ee: getfield su/catlean/jd.i F
// 0f1: invokestatic java/lang/Float.compare (FF)I
// 0f4: aload 4
// 0f6: ifnonnull 121
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w 5476175874337766540
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 5476175874337766540
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/jd.A Ljava/awt/Color;
// 119: aload 5
// 11b: getfield su/catlean/jd.A Ljava/awt/Color;
// 11e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 121: aload 4
// 123: ifnonnull 143
// 126: ifne 142
// 129: goto 136
// 12c: ldc2_w 5476175874337766540
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w 5476175874337766540
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: bipush 1
// 143: ireturn
}

static {
long var11 = a ^ 8468846406543L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[8];
int var18 = 0;
String var17 = "\u009a¢\u009cX\u001bµ¡ü\u0019â¼\u008b-áß\u0010 ¥.Ü¶\u0088á\u009eYÆc¦«vU\u000f#s\u0005×p\u009c\r\u009daG^Ê\u001c\u0011÷\u0010Y \u009a\u0016\u0088YPú\u009dB,½³+ÁÌ\u0004\u0001\rFKëmGß\u0002~°Ãht\u000elM \u0087A¹\u000f\u0095s\u0013·òÍ\u0086iôº½\u0097\u00adÉ\u0095à\u0087\u008fÓo¨\t\u008d\u0086³íÜ¢ \u0001+¡Æì×-ºhî)ÂÝ²»²à7Ccñh\u008c° ¦çE3º}È ¼\u009d¹\u008bý\u0093H T\u000fy¸ÃiËá\u000e¿'\u008fAF¬\u008cBa\u001a\u0018ÆdB6";
int var19 = "\u009a¢\u009cX\u001bµ¡ü\u0019â¼\u008b-áß\u0010 ¥.Ü¶\u0088á\u009eYÆc¦«vU\u000f#s\u0005×p\u009c\r\u009daG^Ê\u001c\u0011÷\u0010Y \u009a\u0016\u0088YPú\u009dB,½³+ÁÌ\u0004\u0001\rFKëmGß\u0002~°Ãht\u000elM \u0087A¹\u000f\u0095s\u0013·òÍ\u0086iôº½\u0097\u00adÉ\u0095à\u0087\u008fÓo¨\t\u008d\u0086³íÜ¢ \u0001+¡Æì×-ºhî)ÂÝ²»²à7Ccñh\u008c° ¦çE3º}È ¼\u009d¹\u008bý\u0093H T\u000fy¸ÃiËá\u000e¿'\u008fAF¬\u008cBa\u001a\u0018ÆdB6"
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
c = var20;
d = new String[8];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "ßà\u00adsÎµ\u0003¨û.K4\u0098WúÌ";
int var5 = "ßà\u00adsÎµ\u0003¨û.K4\u0098WúÌ".length();
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
f = var6;
g = new Integer[4];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "çEÐ©\u0088>ìcÙê`d?Õ¹Ü";
var5 = "çEÐ©\u0088>ìcÙê`d?Õ¹Ü".length();
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

var17 = "ÈÜ_\u0016æ\tÓj\u0007\u0082qËl#¬M\n\u0083õ|u\u009aªÛaÕi\"Þ\u0098[0(Tµ¾iÄ\u007f¯5NP^\u0092,\u000eç\u00adÙü\u0000\\:äW>ä½ãf\u0091º\u0014lë$÷0\tíº\u0098";
var19 = "ÈÜ_\u0016æ\tÓj\u0007\u0082qËl#¬M\n\u0083õ|u\u009aªÛaÕi\"Þ\u0098[0(Tµ¾iÄ\u007f¯5NP^\u0092,\u000eç\u00adÙü\u0000\\:äW>ä½ãf\u0091º\u0014lë$÷0\tíº\u0098"
.length();
var16 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28745;
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
throw new RuntimeException("su/catlean/jd", var10);
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
throw new RuntimeException("su/catlean/jd" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9691;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])j.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/jd", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/jd" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
