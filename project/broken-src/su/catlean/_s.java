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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

public enum _s {
@NotNull
private final Function1 l;
public static final _s LINEAR;
public static final _s IN_QUAD;
public static final _s OUT_QUAD;
public static final _s IN_OUT_QUAD;
public static final _s IN_CUBIC;
public static final _s OUT_CUBIC;
public static final _s IN_QUART;
public static final _s OUT_QUART;
public static final _s IN_OUT_QUART;
public static final _s IN_QUINT;
public static final _s OUT_QUINT;
public static final _s IN_OUT_QUINT;
public static final _s IN_SINE;
public static final _s OUT_SINE;
public static final _s IN_OUT_SINE;
public static final _s IN_EXPO;
public static final _s OUT_EXPO;
public static final _s IN_OUT_EXPO;
public static final _s IN_CIRC;
public static final _s OUT_CIRC;
public static final _s IN_OUT_CIRC;
public static final _s SIGMOID;
public static final _s SIGMOID_2;
public static final _s SIGMOID_3;
public static final _s SIGMOID_4;
public static final _s SIGMOID_5;
public static final _s SIGMOID_6;
public static final _s SIGMOID_7;
public static final _s OUT_ELASTIC;
public static final _s IN_BACK;
public static final _s OUT_BACK;
public static final _s DECELERATE;
public static final _s IN_OUT_CUBIC;
private static int C;
private static final long a = yz.a(-9013688604926029903L, 4599953073514562494L, MethodHandles.lookup().lookupClass()).a(60604735909866L);
private static final long[] b;
private static final Integer[] c;
private static final Map d;

private _s(Function1 var3) {
this.l = var3;
}

@NotNull
public final Function1 a() {
return this.l;
}

@NotNull
public static EnumEntries W() {
return y;
}

private static final double b(double var0) {
return var0;
}

private static final double e(double var0) {
return Math.pow(var0, 2);
}

private static final double W(double var0) {
return var0 * (2 - var0);
}

private static final double E(double param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_s.a J
// 03: ldc2_w 39686212317962
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -5844322394492871087
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: dload 0
// 14: ldc2_w 0.5
// 17: dcmpg
// 18: iload 4
// 1a: ifeq 44
// 1d: ifge 43
// 20: goto 2d
// 23: ldc2_w -5840202223797153431
// 26: lload 2
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: bipush 2
// 2e: i2d
// 2f: dload 0
// 30: bipush 2
// 31: i2d
// 32: invokestatic java/lang/Math.pow (DD)D
// 35: dmul
// 36: goto 4f
// 39: ldc2_w -5840202223797153431
// 3c: lload 2
// 3d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: athrow
// 43: bipush -1
// 44: i2d
// 45: bipush 4
// 46: i2d
// 47: bipush 2
// 48: i2d
// 49: dload 0
// 4a: dmul
// 4b: dsub
// 4c: dload 0
// 4d: dmul
// 4e: dadd
// 4f: dreturn
}

private static final double F(double var0) {
return Math.pow(var0, 3);
}

private static final double m(double var0) {
return Math.pow(var0 - 1, 3) + 1;
}

private static final double c(double var0) {
return Math.pow(var0, 4);
}

private static final double G(double var0) {
return 1 - Math.pow(var0 - 1, 4);
}

private static final double Q(double param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_s.a J
// 03: ldc2_w 101736700417135
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 5257984966461304514
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: dload 0
// 14: ldc2_w 0.5
// 17: iload 4
// 19: ifne 57
// 1c: dcmpg
// 1d: ifge 45
// 20: goto 2d
// 23: ldc2_w 5302451563269862924
// 26: lload 2
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: ldc 8.0
// 2f: f2d
// 30: dload 0
// 31: dmul
// 32: dload 0
// 33: dmul
// 34: dload 0
// 35: dmul
// 36: dload 0
// 37: dmul
// 38: goto 58
// 3b: ldc2_w 5302451563269862924
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: fconst_1
// 46: f2d
// 47: ldc -2.0
// 49: f2d
// 4a: dload 0
// 4b: dmul
// 4c: fconst_2
// 4d: f2d
// 4e: dadd
// 4f: bipush 4
// 50: i2d
// 51: invokestatic java/lang/Math.pow (DD)D
// 54: fconst_2
// 55: f2d
// 56: ddiv
// 57: dsub
// 58: dreturn
}

private static final double p(double var0) {
return Math.pow(var0, 5);
}

private static final double h(double var0) {
return 1 + Math.pow(var0 - 1, 5);
}

private static final double S(double param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_s.a J
// 03: ldc2_w 41431249461353
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -216625432788821308
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: dload 0
// 14: ldc2_w 0.5
// 17: iload 4
// 19: ifne 59
// 1c: dcmpg
// 1d: ifge 47
// 20: goto 2d
// 23: ldc2_w -175518668403146230
// 26: lload 2
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: ldc 16.0
// 2f: f2d
// 30: dload 0
// 31: dmul
// 32: dload 0
// 33: dmul
// 34: dload 0
// 35: dmul
// 36: dload 0
// 37: dmul
// 38: dload 0
// 39: dmul
// 3a: goto 5a
// 3d: ldc2_w -175518668403146230
// 40: lload 2
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: fconst_1
// 48: f2d
// 49: ldc -2.0
// 4b: f2d
// 4c: dload 0
// 4d: dmul
// 4e: fconst_2
// 4f: f2d
// 50: dadd
// 51: bipush 5
// 52: i2d
// 53: invokestatic java/lang/Math.pow (DD)D
// 56: fconst_2
// 57: f2d
// 58: ddiv
// 59: dsub
// 5a: dreturn
}

private static final double k(double var0) {
return 1 - Math.cos(var0 * Math.PI / 2);
}

private static final double P(double var0) {
return Math.sin(var0 * Math.PI / 2);
}

private static final double t(double var0) {
return 1 - Math.cos(Math.PI * var0 / 2);
}

private static final double D(double var0) {
long var2 = a ^ 21530327668768L;
int var4 = vm.a<"Å">(-8883541118031043955L, var2);

int var10000;
label34: {
label33: {
try {
double var8;
var10000 = (var8 = var0 - 0.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
if (var4 != 0) {
break label34;
}

if (!var10000) {
break label33;
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -8801906647342384573L, var2);
}

var10000 = 0;
break label34;
}

var10000 = 1;
}

try {
if (var10000) {
return 0.0;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -8801906647342384573L, var2);
}

return Math.pow(2.0, a<"s">(10051, 525295534861678196L ^ var2) * var0 - a<"s">(32241, 5762997225879514335L ^ var2));
}

private static final double a(double var0) {
long var2 = a ^ 46352983739309L;
int var4 = vm.a<"Å">(-7549603253658849024L, var2);

int var10000;
label34: {
label33: {
try {
double var8;
var10000 = (var8 = var0 - 1.0) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
if (var4 != 0) {
break label34;
}

if (!var10000) {
break label33;
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -7614354188009936434L, var2);
}

var10000 = 0;
break label34;
}

var10000 = 1;
}

try {
if (var10000) {
return 1.0;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -7614354188009936434L, var2);
}

return 1 - Math.pow(2.0, a<"s">(17359, 8555492160562823527L ^ var2) * var0);
}

private static final double s(double param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_s.a J
// 03: ldc2_w 114864327322439
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -5201611903024246294
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: dload 0
// 14: dconst_0
// 15: dcmpg
// 16: iload 4
// 18: ifne 2c
// 1b: ifne 2f
// 1e: goto 2b
// 21: ldc2_w -5278742771033388764
// 24: lload 2
// 25: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: athrow
// 2b: bipush 1
// 2c: goto 30
// 2f: bipush 0
// 30: ifne 60
// 33: dload 0
// 34: dconst_1
// 35: dcmpg
// 36: iload 4
// 38: ifne 59
// 3b: goto 48
// 3e: ldc2_w -5278742771033388764
// 41: lload 2
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: ifne 5c
// 4b: goto 58
// 4e: ldc2_w -5278742771033388764
// 51: lload 2
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: bipush 1
// 59: goto 5d
// 5c: bipush 0
// 5d: ifeq 6e
// 60: dload 0
// 61: goto e8
// 64: ldc2_w -5278742771033388764
// 67: lload 2
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: dload 0
// 6f: ldc2_w 0.5
// 72: dcmpg
// 73: iload 4
// 75: ifne be
// 78: ifge bd
// 7b: goto 88
// 7e: ldc2_w -5278742771033388764
// 81: lload 2
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: ldc2_w 2.0
// 8b: sipush 26473
// 8e: ldc2_w 4017919327537399055
// 91: lload 2
// 92: lxor
// 93: invokedynamic s (IJ)I bsm=su/catlean/_s.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98: i2d
// 99: dload 0
// 9a: dmul
// 9b: sipush 32241
// 9e: ldc2_w 5762985273067118520
// a1: lload 2
// a2: lxor
// a3: invokedynamic s (IJ)I bsm=su/catlean/_s.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a8: i2d
// a9: dsub
// aa: invokestatic java/lang/Math.pow (DD)D
// ad: bipush 2
// ae: i2d
// af: ddiv
// b0: goto e8
// b3: ldc2_w -5278742771033388764
// b6: lload 2
// b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc: athrow
// bd: bipush 2
// be: i2d
// bf: ldc2_w 2.0
// c2: sipush 25687
// c5: ldc2_w 6754388464875963966
// c8: lload 2
// c9: lxor
// ca: invokedynamic s (IJ)I bsm=su/catlean/_s.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cf: i2d
// d0: dload 0
// d1: dmul
// d2: sipush 32241
// d5: ldc2_w 5762985273067118520
// d8: lload 2
// d9: lxor
// da: invokedynamic s (IJ)I bsm=su/catlean/_s.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// df: i2d
// e0: dadd
// e1: invokestatic java/lang/Math.pow (DD)D
// e4: dsub
// e5: bipush 2
// e6: i2d
// e7: ddiv
// e8: dreturn
}

private static final double x(double var0) {
return 1 - Math.sqrt(1 - Math.pow(var0, 2));
}

private static final double K(double var0) {
return Math.sqrt(1 - Math.pow(var0 - 1, 2));
}

private static final double v(double var0) {
long var2 = a ^ 107053008055413L;
int var4 = vm.a<"Å">(-5648764102249135826L, var2);

label31: {
double var10000;
double var10001;
label22: {
try {
var10000 = var0;
var10001 = 0.5;
if (var4 == 0) {
break label22;
}

if (var0 < 0.5) {
break label31;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -5653096976950112746L, var2);
}

var10000 = -2.0F * var0;
var10001 = 2.0F;
}

double var8 = var10000 + var10001;
return (Math.sqrt(1.0F - var8 * var8) + 1.0F) / 2.0F;
}

double var5 = 2.0F * var0;
return (1.0F - Math.sqrt(1.0F - var5 * var5)) / 2.0F;
}

private static final double H(double var0) {
double var2 = 10.0;
return 1 / (1 + Math.exp(-var2 * (var0 - 0.5)));
}

private static final double N(double var0) {
double var2 = 8.0;
return 1 / (1 + Math.exp(-var2 * (var0 - 0.5)));
}

private static final double j(double var0) {
double var2 = 12.0;
return 1 / (1 + Math.exp(-var2 * (var0 - 0.5)));
}

private static final double i(double var0) {
double var2 = 6.0;
return 1 / (1 + Math.exp(-var2 * (var0 - 0.5)));
}

private static final double T(double var0) {
double var2 = 14.0;
return 1 / (1 + Math.exp(-var2 * (var0 - 0.5)));
}

private static final double r(double var0) {
double var2 = 4.0;
return 1 / (1 + Math.exp(-var2 * (var0 - 0.5)));
}

private static final double C(double var0) {
double var2 = 16.0;
return 1 / (1 + Math.exp(-var2 * (var0 - 0.5)));
}

private static final double U(double var0) {
long var2 = a ^ 14451578397744L;
int var10000 = vm.a<"Å">(-5053352676293588629L, var2);
double var5 = var0;
int var4 = var10000;

label61: {
label60: {
try {
double var14;
var10000 = (var14 = var5 - 0.0) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
if (var4 == 0) {
break label61;
}

if (!var10000) {
break label60;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -5059435492429543853L, var2);
}

var10000 = 0;
break label61;
}

var10000 = 1;
}

try {
if (var10000) {
return 0.0;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -5059435492429543853L, var2);
}

label45: {
label44: {
try {
double var15;
var10000 = (var15 = var5 - 1.0) == 0.0 ? 0 : (var15 < 0.0 ? -1 : 1);
if (var4 == 0) {
break label45;
}

if (!var10000) {
break label44;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -5059435492429543853L, var2);
}

var10000 = 0;
break label45;
}

var10000 = 1;
}

try {
if (var10000) {
return 1.0;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -5059435492429543853L, var2);
}

return Math.pow(2.0, a<"s">(27894, 4405494531056435663L ^ var2) * var0)
* Math.sin((var0 * a<"s">(32241, 5763017360057700559L ^ var2) - 0.75) * (Math.PI * 2.0 / 3.0))
* 0.5
+ 1;
}

private static final double B(double var0) {
return 2.70158 * Math.pow(var0, 3) - 1.70158 * Math.pow(var0, 2);
}

private static final double l(double var0) {
return 1 + 2.70158 * Math.pow(var0 - 1, 3) + 1.70158 * Math.pow(var0 - 1, 2);
}

private static final double z(double var0) {
return 1 - Math.pow(var0 - 1, 2);
}

private static final double u(double param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_s.a J
// 03: ldc2_w 13033275095330
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -6506212559864085617
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: dload 0
// 14: ldc2_w 0.5
// 17: iload 4
// 19: ifne 55
// 1c: dcmpg
// 1d: ifge 43
// 20: goto 2d
// 23: ldc2_w -6567584405811700927
// 26: lload 2
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: ldc 4.0
// 2f: f2d
// 30: dload 0
// 31: dmul
// 32: dload 0
// 33: dmul
// 34: dload 0
// 35: dmul
// 36: goto 56
// 39: ldc2_w -6567584405811700927
// 3c: lload 2
// 3d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: athrow
// 43: fconst_1
// 44: f2d
// 45: ldc -2.0
// 47: f2d
// 48: dload 0
// 49: dmul
// 4a: fconst_2
// 4b: f2d
// 4c: dadd
// 4d: bipush 3
// 4e: i2d
// 4f: invokestatic java/lang/Math.pow (DD)D
// 52: fconst_2
// 53: f2d
// 54: ddiv
// 55: dsub
// 56: dreturn
}

static {
long var20 = a ^ 66978240592258L;
long var22 = var20 ^ 18631773291331L;
if (vm.a<"Å">(2624705013063013593L, var20) == 0) {
vm.a<"Å">(54, 2672546896043596119L, var20);
}

Cipher var12;
Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var13 = 1; var13 < 8; var13++) {
var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var11 = new String[33];
int var17 = 0;
String var16 = "\u009f÷¥ÜiWÁldQâÉ\u009aûc3\u0010,®>\u0014S\u0094ìÒ\u00980Å+#pH<\bøÏ¶_V¥¹e\u0010\u0099µ+GZM\u0000tÉ¹¨\u0018=Bor\u0010\u0000\u009cÊ@!\u0094\u000e;\fQ\u0096\u000f\u000fÛjä\bx\u0080mµT\u000bÉ\u0017\u0010û,ù\r{@\u0003oä®©[%9\u0093\u0016\br\u0083ùÍV\"\u0094\f\u0010;\u001cè3ý<ff¥Ânrüê¨j\u0010\u0012\u0090\u0005ÓÂaíßO\u0090fw¹\u0096Ô«\u0010ìú5¿\u0088\u0090ú\u008a]sõþ\u0094ÝYj\u0010uQß1]`\u0002\u0088ri6\u00adRóÿÈ\b\u0085\u0010e\u008fÊ\u001fÉÎ\u0010|ºñßò ^BñèÇb\u001aÛµ2\u0010ìú5¿\u0088\u0090ú\u008a\u0018g\\ò5úbH\u0010\u0099µ+GZM\u0000tÍÆD|}\u0098\u00944\u0010Kè\u0003_¥\u0091uá]ÒuÓUù{8\u0010A+{¸·Ï*±\u000eHüÆ3Ì\u009f$\u0010\u0099µ+GZM\u0000tm\u0085\u0080\u000béß±Ä\u0010\u009a¢Ò\u0012\u001eªz\u009dá\f5YÈ\u008c\u008b\u0093\u0010t\u0011)\u0018h\u0087û\u0019Ê\u0084Q¤(ýU]\bÖ©â3 °ý«\u0010\u0099µ+GZM\u0000t½LØ\u0018Î\u0081í\u0013\u0010¡|ñÒé'ryÄq\u0011Ò\u0019àË:\u0010Ü4L,\u008e °\u0084ìR¨ãÒ\u001al~\b\u009cq\u008d»\u0013ü¾^\u0010ìú5¿\u0088\u0090ú\u008aåG\u008eGl\u0018Xd\u0010Bµ\"äYÍ®~E\u0006{:OýPh\u0010\u0099µ+GZM\u0000t\u0089,AUc\u001df?\u0010<ë\u0010n ½l\u001cuL\u001c\u0007\u0015O<\u0016\u0010\u009f÷¥ÜiWÁl\u0096g¡^UÎ*\u0015";
int var18 = "\u009f÷¥ÜiWÁldQâÉ\u009aûc3\u0010,®>\u0014S\u0094ìÒ\u00980Å+#pH<\bøÏ¶_V¥¹e\u0010\u0099µ+GZM\u0000tÉ¹¨\u0018=Bor\u0010\u0000\u009cÊ@!\u0094\u000e;\fQ\u0096\u000f\u000fÛjä\bx\u0080mµT\u000bÉ\u0017\u0010û,ù\r{@\u0003oä®©[%9\u0093\u0016\br\u0083ùÍV\"\u0094\f\u0010;\u001cè3ý<ff¥Ânrüê¨j\u0010\u0012\u0090\u0005ÓÂaíßO\u0090fw¹\u0096Ô«\u0010ìú5¿\u0088\u0090ú\u008a]sõþ\u0094ÝYj\u0010uQß1]`\u0002\u0088ri6\u00adRóÿÈ\b\u0085\u0010e\u008fÊ\u001fÉÎ\u0010|ºñßò ^BñèÇb\u001aÛµ2\u0010ìú5¿\u0088\u0090ú\u008a\u0018g\\ò5úbH\u0010\u0099µ+GZM\u0000tÍÆD|}\u0098\u00944\u0010Kè\u0003_¥\u0091uá]ÒuÓUù{8\u0010A+{¸·Ï*±\u000eHüÆ3Ì\u009f$\u0010\u0099µ+GZM\u0000tm\u0085\u0080\u000béß±Ä\u0010\u009a¢Ò\u0012\u001eªz\u009dá\f5YÈ\u008c\u008b\u0093\u0010t\u0011)\u0018h\u0087û\u0019Ê\u0084Q¤(ýU]\bÖ©â3 °ý«\u0010\u0099µ+GZM\u0000t½LØ\u0018Î\u0081í\u0013\u0010¡|ñÒé'ryÄq\u0011Ò\u0019àË:\u0010Ü4L,\u008e °\u0084ìR¨ãÒ\u001al~\b\u009cq\u008d»\u0013ü¾^\u0010ìú5¿\u0088\u0090ú\u008aåG\u008eGl\u0018Xd\u0010Bµ\"äYÍ®~E\u0006{:OýPh\u0010\u0099µ+GZM\u0000t\u0089,AUc\u001df?\u0010<ë\u0010n ½l\u001cuL\u001c\u0007\u0015O<\u0016\u0010\u009f÷¥ÜiWÁl\u0096g¡^UÎ*\u0015"
.length();
char var15 = 16;
int var26 = -1;

label58:
while (true) {
String var27 = var16.substring(++var26, var26 + var15);
int var10001 = -1;

while (true) {
byte[] var19 = var12.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = a(var19).intern();
switch (var10001) {
case 0:
var11[var17++] = var38;
if ((var26 += var15) >= var18) {
d = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[58];
int var3 = 0;
String var4 = "¥\b\u008a\u001b½ìÝL\u001exST\u009bw7þ©\u0085|ó\u0019¯\fÛ\u0084\u0004\u0098qc%\u0096\u0091\to\b/ Q3\u0091³èö\u0089\u0003Vâx$Ð\u001d»Ê\rLIã\u0097h\u000fkS&ICk~}H&\u00027\u008e;k\u009fÁá\u0082<X&\u008d\u00031zè\u0015\u009cq\u0015\u0017]\f\u001cÝà¼ÇÁc~ë»\u0000¦UË¤s(Z\u008cCÈVv+Ò\u0007)\u0016\u001dò4wâ)\u001fON>ØÝ\u0091ï8Ó\u0088¿¾\u0091\u0098=YmàW \u008eåØÛ\u0096\u0097÷0Ì\u0012|ÙÐI¿ÿ#\u009fä\u001aÏUZvÄÁ¯\f\u0085\u0092½8\u001d\b^ñ}\u0007\u000e<\u0014^?-¨ûµ\u0014\u00056J¼ì\u0001y\u0016O++¹;\u008cì\u000f\u0000p+\tÑ3Í\rÇ\u0094ã(\u001cZøA6\u0095\u009f/\u008b]e-Ì\u0087\b\u0006\u001e¨\u0005Ã§*\u0017²á\u0097\u0088²Ë\u001b@ð³u\u001f\u0092\r\u007f\u009f\u0013åÚÇöh@ºàMd~\u0007dwÙ\u0089¡Rã¢m\u009ct\u001d\u0010\f\u0095{c3ú\u000fÿ\u0089£Æ=\u001b%bx¿L\u0019@º¤\u0013¬nÞÐ$C{fmw\u0010æl0\u009f¬¼±á4Y\u0083 4\u001d\u008f¹E\u0013ÂÔí\u009e1qkq\u0012£J\u0011\u0011¥\u008fó.\u0002e\u001es¤ÖzÌ,u±¾*1õÔ\u008d>÷E¿Ãr\u001aþzÜõ¡ý\u0012\u001f\u009e.\"\u0005éeÞN&?Ã\u008eÅ#¹ëy\u0093¾\u0083\u000e_%ÒN\tKàfz\u0091©àÓ\u0013iú¦\f÷z?¶?ûhDæè¼é³\u0084,¥d8";
int var5 = "¥\b\u008a\u001b½ìÝL\u001exST\u009bw7þ©\u0085|ó\u0019¯\fÛ\u0084\u0004\u0098qc%\u0096\u0091\to\b/ Q3\u0091³èö\u0089\u0003Vâx$Ð\u001d»Ê\rLIã\u0097h\u000fkS&ICk~}H&\u00027\u008e;k\u009fÁá\u0082<X&\u008d\u00031zè\u0015\u009cq\u0015\u0017]\f\u001cÝà¼ÇÁc~ë»\u0000¦UË¤s(Z\u008cCÈVv+Ò\u0007)\u0016\u001dò4wâ)\u001fON>ØÝ\u0091ï8Ó\u0088¿¾\u0091\u0098=YmàW \u008eåØÛ\u0096\u0097÷0Ì\u0012|ÙÐI¿ÿ#\u009fä\u001aÏUZvÄÁ¯\f\u0085\u0092½8\u001d\b^ñ}\u0007\u000e<\u0014^?-¨ûµ\u0014\u00056J¼ì\u0001y\u0016O++¹;\u008cì\u000f\u0000p+\tÑ3Í\rÇ\u0094ã(\u001cZøA6\u0095\u009f/\u008b]e-Ì\u0087\b\u0006\u001e¨\u0005Ã§*\u0017²á\u0097\u0088²Ë\u001b@ð³u\u001f\u0092\r\u007f\u009f\u0013åÚÇöh@ºàMd~\u0007dwÙ\u0089¡Rã¢m\u009ct\u001d\u0010\f\u0095{c3ú\u000fÿ\u0089£Æ=\u001b%bx¿L\u0019@º¤\u0013¬nÞÐ$C{fmw\u0010æl0\u009f¬¼±á4Y\u0083 4\u001d\u008f¹E\u0013ÂÔí\u009e1qkq\u0012£J\u0011\u0011¥\u008fó.\u0002e\u001es¤ÖzÌ,u±¾*1õÔ\u008d>÷E¿Ãr\u001aþzÜõ¡ý\u0012\u001f\u009e.\"\u0005éeÞN&?Ã\u008eÅ#¹ëy\u0093¾\u0083\u000e_%ÒN\tKàfz\u0091©àÓ\u0013iú¦\f÷z?¶?ûhDæè¼é³\u0084,¥d8"
.length();
byte var2 = 0;

label40:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var30[var10001] = var47;
if (var2 >= var5) {
b = var6;
c = new Integer[58];
LINEAR = new _s(_s::b);
IN_QUAD = new _s(_s::e);
OUT_QUAD = new _s(_s::W);
IN_OUT_QUAD = new _s(_s::E);
IN_CUBIC = new _s(_s::F);
OUT_CUBIC = new _s(_s::m);
IN_QUART = new _s(_s::c);
OUT_QUART = new _s(_s::G);
IN_OUT_QUART = new _s(_s::Q);
IN_QUINT = new _s(_s::p);
OUT_QUINT = new _s(_s::h);
IN_OUT_QUINT = new _s(_s::S);
IN_SINE = new _s(_s::k);
OUT_SINE = new _s(_s::P);
IN_OUT_SINE = new _s(_s::t);
IN_EXPO = new _s(_s::D);
OUT_EXPO = new _s(_s::a);
IN_OUT_EXPO = new _s(_s::s);
IN_CIRC = new _s(_s::x);
OUT_CIRC = new _s(_s::K);
IN_OUT_CIRC = new _s(_s::v);
SIGMOID = new _s(_s::H);
SIGMOID_2 = new _s(_s::N);
SIGMOID_3 = new _s(_s::j);
SIGMOID_4 = new _s(_s::i);
SIGMOID_5 = new _s(_s::T);
SIGMOID_6 = new _s(_s::r);
SIGMOID_7 = new _s(_s::C);
OUT_ELASTIC = new _s(_s::U);
IN_BACK = new _s(_s::B);
OUT_BACK = new _s(_s::l);
DECELERATE = new _s(_s::z);
IN_OUT_CUBIC = new _s(_s::u);
y = EnumEntriesKt.enumEntries(E);
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label40;
}

var4 = "î\u009bt<\u009aóÍ6;\u009dvÓÞ\u0014)G";
var5 = "î\u009bt<\u009aóÍ6;\u009dvÓÞ\u0014)G".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var30 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var15 = var16.charAt(var26);
break;
default:
var11[var17++] = var38;
if ((var26 += var15) < var18) {
var15 = var16.charAt(var26);
continue label58;
}

var16 = "\u0099µ+GZM\u0000t´\u0094gW\fU\u000b\u008c\b&Åà¾\b\u0002\bp";
var18 = "\u0099µ+GZM\u0000t´\u0094gW\fU\u000b\u008c\b&Åà¾\b\u0002\bp".length();
var15 = 16;
var26 = -1;
}

var27 = var16.substring(++var26, var26 + var15);
var10001 = 0;
}
}
}

public static void P(int var0) {
C = var0;
}

public static int m() {
return C;
}

public static int O() {
int var0 = m();

try {
return var0 == 0 ? 122 : 0;
} catch (NumberFormatException var1) {
throw a(var1);
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

private static int a(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21867;
if (c[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = b[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])d.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_s", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
c[var3] = var15;
}

return c[var3];
}

private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = a(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/_s" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
