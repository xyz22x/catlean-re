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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cg {
private final double S;
private final double s;
private final double X;
private final double Y;
private final double e;
private final double t;
private static final long a = yz.a(-3239512913051586763L, -7393143654429478324L, MethodHandles.lookup().lookupClass()).a(26495476384043L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public cg(double westDelta, double eastDelta, double northDelta, double southDelta, double upDelta, double downDelta) {
this.S = westDelta;
this.s = eastDelta;
this.X = northDelta;
this.Y = southDelta;
this.e = upDelta;
this.t = downDelta;
}

public final double H() {
return this.S;
}

public final double m() {
return this.s;
}

public final double o() {
return this.X;
}

public final double g() {
return this.Y;
}

public final double O() {
return this.e;
}

public final double z() {
return this.t;
}

public final double T() {
return this.S;
}

public final double Q() {
return this.s;
}

public final double x() {
return this.X;
}

public final double D() {
return this.Y;
}

public final double B() {
return this.e;
}

public final double J() {
return this.t;
}

@NotNull
public final cg R(double westDelta, double eastDelta, double northDelta, double southDelta, double upDelta, double downDelta) {
return new cg(westDelta, eastDelta, northDelta, southDelta, upDelta, downDelta);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static cg z(cg var0, double var1, double var3, long var5, double var7, double var9, double var11, double var13, int var15, Object var16) {
var5 = a ^ var5;
_g[] var17 = vm.a<"Å">(-3274402256061193354L, var5);

int var10000;
label113: {
label112: {
try {
var10000 = var15 & 1;
if (var17 != null) {
break label113;
}

if (var10000 == 0) {
break label112;
}
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, -3261654583526016205L, var5);
}

var1 = var0.S;
}

var10000 = var15 & 2;
}

_g[] var10001;
label104: {
label103: {
label102: {
try {
var10001 = var17;
if (var5 < 0L) {
break label104;
}

if (var17 != null) {
break label103;
}

if (var10000 == 0) {
break label102;
}
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, -3261654583526016205L, var5);
}

var3 = var0.s;
}

var10000 = var15 & 4;
}

try {
var10001 = var17;
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, -3261654583526016205L, var5);
}
}

label91: {
label90: {
label89: {
try {
if (var5 <= 0L) {
break label91;
}

if (var10001 != null) {
break label90;
}

if (var10000 == 0) {
break label89;
}
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, -3261654583526016205L, var5);
}

var7 = var0.X;
}

var10000 = var15 & b<"n">(9068, 5806202488309179662L ^ var5);
}

try {
var10001 = var17;
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, -3261654583526016205L, var5);
}
}

label78: {
label77: {
label76: {
try {
if (var5 <= 0L) {
break label78;
}

if (var10001 != null) {
break label77;
}

if (var10000 == 0) {
break label76;
}
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, -3261654583526016205L, var5);
}

var9 = var0.Y;
}

var10000 = var15 & b<"n">(24810, 8764118536932927113L ^ var5);
}

try {
var10001 = var17;
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -3261654583526016205L, var5);
}
}

label65: {
label64: {
try {
if (var10001 != null) {
break label65;
}

if (var10000 == 0) {
break label64;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, -3261654583526016205L, var5);
}

var11 = var0.e;
}

var10000 = var15 & b<"n">(15075, 1146842736951819396L ^ var5);
}

if (var10000 != 0) {
var13 = var0.t;
}

return var0.R(var1, var3, var7, var9, var11, var13);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 71157201394567L;
double var3 = this.t;
double var5 = this.e;
double var7 = this.Y;
double var9 = this.X;
double var11 = this.s;
double var13 = this.S;
return a<"l">(2860, 6395433805111379388L ^ var1)
+ var13
+ a<"l">(2105, 5556890477743457963L ^ var1)
+ var11
+ a<"l">(3678, 568063586800943307L ^ var1)
+ var9
+ a<"l">(4299, 2316579818064010840L ^ var1)
+ var7
+ a<"l">(20017, 7096739053363069093L ^ var1)
+ var5
+ a<"l">(19722, 442603243608900507L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 30951404592184L;
int var3 = Double.hashCode(this.S);
var3 = var3 * b<"n">(15637, 2651257789948128664L ^ var1) + Double.hashCode(this.s);
var3 = var3 * b<"n">(11776, 5706394043729084044L ^ var1) + Double.hashCode(this.X);
var3 = var3 * b<"n">(11776, 5706394043729084044L ^ var1) + Double.hashCode(this.Y);
var3 = var3 * b<"n">(11776, 5706394043729084044L ^ var1) + Double.hashCode(this.e);
return var3 * b<"n">(11776, 5706394043729084044L ^ var1) + Double.hashCode(this.t);
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
// 000: getstatic su/catlean/cg.a J
// 003: ldc2_w 90210546891464
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 2491328284230931306
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 2495068750624312111
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 2495068750624312111
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/cg
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 2495068750624312111
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 2495068750624312111
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/cg
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/cg.S D
// 065: aload 5
// 067: getfield su/catlean/cg.S D
// 06a: invokestatic java/lang/Double.compare (DD)I
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w 2495068750624312111
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 2495068750624312111
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/cg.s D
// 092: aload 5
// 094: getfield su/catlean/cg.s D
// 097: invokestatic java/lang/Double.compare (DD)I
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 2495068750624312111
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 2495068750624312111
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/cg.X D
// 0bf: aload 5
// 0c1: getfield su/catlean/cg.X D
// 0c4: invokestatic java/lang/Double.compare (DD)I
// 0c7: aload 4
// 0c9: ifnonnull 0f4
// 0cc: ifeq 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 2495068750624312111
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 2495068750624312111
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/cg.Y D
// 0ec: aload 5
// 0ee: getfield su/catlean/cg.Y D
// 0f1: invokestatic java/lang/Double.compare (DD)I
// 0f4: aload 4
// 0f6: ifnonnull 121
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w 2495068750624312111
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 2495068750624312111
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/cg.e D
// 119: aload 5
// 11b: getfield su/catlean/cg.e D
// 11e: invokestatic java/lang/Double.compare (DD)I
// 121: aload 4
// 123: ifnonnull 14e
// 126: ifeq 142
// 129: goto 136
// 12c: ldc2_w 2495068750624312111
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w 2495068750624312111
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 0
// 143: getfield su/catlean/cg.t D
// 146: aload 5
// 148: getfield su/catlean/cg.t D
// 14b: invokestatic java/lang/Double.compare (DD)I
// 14e: aload 4
// 150: ifnonnull 170
// 153: ifeq 16f
// 156: goto 163
// 159: ldc2_w 2495068750624312111
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: bipush 0
// 164: ireturn
// 165: ldc2_w 2495068750624312111
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: bipush 1
// 170: ireturn
}

static {
long var11 = a ^ 131004363331857L;
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
String var17 = "N2¶\u000fì©\u0007_\u008a_\u001ac\u009bãG,\u0012võmÀ/j\u0082Ê*¡\u001a\u00054\u008eÌ0Í\u0082l\u0083\u009f*ßá]ýÀ\r\u008d£+5-ó§K\rÐ27²&Ô½z@§¬×Û#ÄÇ»ò\u009aK°{®\\Ène\u0018»`\u000e=¢Ià\u0014¨Ú©¸ØH0û`\u008dÂ\u0081Jú$p R-±\u0088mÜäeË\u00176\u00ad×hÑ\u001a\u001a èû(ÌiË&sw[ð\u001f°°";
int var19 = "N2¶\u000fì©\u0007_\u008a_\u001ac\u009bãG,\u0012võmÀ/j\u0082Ê*¡\u001a\u00054\u008eÌ0Í\u0082l\u0083\u009f*ßá]ýÀ\r\u008d£+5-ó§K\rÐ27²&Ô½z@§¬×Û#ÄÇ»ò\u009aK°{®\\Ène\u0018»`\u000e=¢Ià\u0014¨Ú©¸ØH0û`\u008dÂ\u0081Jú$p R-±\u0088mÜäeË\u00176\u00ad×hÑ\u001a\u001a èû(ÌiË&sw[ð\u001f°°"
.length();
char var16 = ' ';
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
h = new HashMap(13);
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
String var4 = "Iadå°MX³\u007f\bH\u0080[9\u0091¬@÷\tM9_´-";
int var5 = "Iadå°MX³\u007f\bH\u0080[9\u0091¬@÷\tM9_´-".length();
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
g = new Integer[5];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u0087cô.yïJOh.Þ×-\\1Æ";
var5 = "\u0087cô.yïJOh.Þ×-\\1Æ".length();
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

var17 = "\u009a\u001c\u0087.#¢[\u009e\u0003ôéL\u001bñUGíâN¸Ùà\u009a ÈV\u009eASÿ>n (\u0099:1\u0094ñè\u0007\u008ek§¨:ù\u009eIý«ü\u008f²Ê{×UB\"æ+ß\u008a\u009d";
var19 = "\u009a\u001c\u0087.#¢[\u009e\u0003ôéL\u001bñUGíâN¸Ùà\u009a ÈV\u009eASÿ>n (\u0099:1\u0094ñè\u0007\u008ek§¨:ù\u009eIý«ü\u008f²Ê{×UB\"æ+ß\u008a\u009d"
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3077;
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
throw new RuntimeException("su/catlean/cg", var10);
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
throw new RuntimeException("su/catlean/cg" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5540;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])h.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/cg", var14);
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
throw new RuntimeException("su/catlean/cg" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
