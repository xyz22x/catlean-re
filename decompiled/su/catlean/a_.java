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

public final class a_ implements class_11281 {
private final float S;
private final float Z;
private final float I;
private final float Q;
private final float F;
@NotNull
private final Color K;
@NotNull
private final Color o;
private final float q;
private static final long a = yz.a(-6363162574684976107L, 5767215486636573369L, MethodHandles.lookup().lookupClass()).a(257746452321548L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public a_(
short a,
float uSizeX,
float uSizeY,
float uRadius,
float uAlpha,
float uBorderWidth,
int a,
@NotNull Color uColor,
@NotNull Color uBorderColor,
short a,
float uMix
) {
long var12 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter(uColor, a<"k">(4959, 6906655287854464934L ^ var12));
Intrinsics.checkNotNullParameter(uBorderColor, a<"k">(30150, 7445293992861079868L ^ var12));
super();
this.S = uSizeX;
this.Z = uSizeY;
this.I = uRadius;
this.Q = uAlpha;
this.F = uBorderWidth;
this.K = uColor;
this.o = uBorderColor;
this.q = uMix;
}

public final float M() {
return this.S;
}

public final float l() {
return this.Z;
}

public final float Z() {
return this.I;
}

public final float k() {
return this.Q;
}

public final float h() {
return this.F;
}

@NotNull
public final Color Q() {
return this.K;
}

@NotNull
public final Color E() {
return this.o;
}

public final float X() {
return this.q;
}

public void method_71104(@NotNull ByteBuffer buffer) {
long var2 = a ^ 140680459427339L;
long var4 = var2 ^ 39904429279410L;
long var6 = var2 ^ 137332316819487L;
long var10001 = var2 ^ 18896417937589L;
int var8 = (int)((var2 ^ 18896417937589L) >>> 48);
int var9 = (int)((var2 ^ 18896417937589L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
long var11 = (var2 ^ 11659835689915L) >>> 32;
int var13 = (int)((var2 ^ 11659835689915L) << 32 >>> 32);
Intrinsics.checkNotNullParameter(buffer, a<"k">(23771, 8337826672256322299L ^ var2));
Std140Builder.intoBuffer(buffer)
.putVec2(this.S, this.Z)
.putFloat(this.I)
.putFloat(this.Q)
.putVec4(jl.y.y(this.K, (char)var8, (short)var9, var10), jl.y.M(var6, this.K), jl.y.r(this.K, var11, var13), jl.y.G(var4, this.K))
.putFloat(this.F)
.putVec4(jl.y.y(this.o, (char)var8, (short)var9, var10), jl.y.M(var6, this.o), jl.y.r(this.o, var11, var13), jl.y.G(var4, this.o))
.putFloat(this.q);
}

public final float U() {
return this.S;
}

public final float n() {
return this.Z;
}

public final float w() {
return this.I;
}

public final float r() {
return this.Q;
}

public final float F() {
return this.F;
}

@NotNull
public final Color B() {
return this.K;
}

@NotNull
public final Color m() {
return this.o;
}

public final float S() {
return this.q;
}

@NotNull
public final a_ b(
float uSizeX, float uSizeY, long a, float uRadius, float uAlpha, float uBorderWidth, @NotNull Color uColor, @NotNull Color uBorderColor, float uMix
) {
ax = a ^ ax;
long var10001 = ax ^ 96748643845073L;
int var11 = (int)((ax ^ 96748643845073L) >>> 48);
int var12 = (int)((ax ^ 96748643845073L) << 16 >>> 32);
int var13 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(uColor, a<"k">(20815, 8555897359802666718L ^ ax));
Intrinsics.checkNotNullParameter(uBorderColor, a<"k">(26796, 3704765552561993526L ^ ax));
return new a_((short)var11, uSizeX, uSizeY, uRadius, uAlpha, uBorderWidth, var12, uColor, uBorderColor, (short)var13, uMix);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static a_ Z(a_ var0, long var1, float var3, float var4, float var5, float var6, float var7, Color var8, Color var9, float var10, int var11, Object var12) {
var1 = a ^ var1;
long var13 = var1 ^ 89131818360695L;
String[] var15 = vm.a<"Å">(-8504367084600138300L, var1);

int var10000;
label161: {
label160: {
try {
var10000 = var11 & 1;
if (var15 != null) {
break label161;
}

if (var10000 == 0) {
break label160;
}
} catch (NumberFormatException var27) {
throw vm.a<"Å">(var27, -8513294464179931038L, var1);
}

var3 = var0.S;
}

var10000 = var11 & 2;
}

String[] var10001;
label152: {
label151: {
label150: {
try {
var10001 = var15;
if (var1 < 0L) {
break label152;
}

if (var15 != null) {
break label151;
}

if (var10000 == 0) {
break label150;
}
} catch (NumberFormatException var26) {
throw vm.a<"Å">(var26, -8513294464179931038L, var1);
}

var4 = var0.Z;
}

var10000 = var11 & 4;
}

try {
var10001 = var15;
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, -8513294464179931038L, var1);
}
}

label139: {
label138: {
label137: {
try {
if (var1 <= 0L) {
break label139;
}

if (var10001 != null) {
break label138;
}

if (var10000 == 0) {
break label137;
}
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, -8513294464179931038L, var1);
}

var5 = var0.I;
}

var10000 = var11 & b<"t">(10205, 1479405512086075631L ^ var1);
}

try {
var10001 = var15;
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, -8513294464179931038L, var1);
}
}

label126: {
label125: {
label124: {
try {
if (var1 < 0L) {
break label126;
}

if (var10001 != null) {
break label125;
}

if (var10000 == 0) {
break label124;
}
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, -8513294464179931038L, var1);
}

var6 = var0.Q;
}

var10000 = var11 & b<"t">(27972, 8033910565267305073L ^ var1);
}

try {
var10001 = var15;
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -8513294464179931038L, var1);
}
}

label113: {
label112: {
label111: {
try {
if (var1 < 0L) {
break label113;
}

if (var10001 != null) {
break label112;
}

if (var10000 == 0) {
break label111;
}
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, -8513294464179931038L, var1);
}

var7 = var0.F;
}

var10000 = var11 & b<"t">(6488, 4788752432554837615L ^ var1);
}

try {
var10001 = var15;
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, -8513294464179931038L, var1);
}
}

label100: {
label99: {
label98: {
try {
if (var1 < 0L) {
break label100;
}

if (var10001 != null) {
break label99;
}

if (var10000 == 0) {
break label98;
}
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, -8513294464179931038L, var1);
}

var8 = var0.K;
}

var10000 = var11 & b<"t">(21965, 6719105824185338622L ^ var1);
}

try {
var10001 = var15;
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, -8513294464179931038L, var1);
}
}

label87: {
label86: {
try {
if (var10001 != null) {
break label87;
}

if (var10000 == 0) {
break label86;
}
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, -8513294464179931038L, var1);
}

var9 = var0.o;
}

var10000 = var11 & b<"t">(23446, 1959122357781447846L ^ var1);
}

if (var10000 != 0) {
var10 = var0.q;
}

return var0.b(var3, var4, var13, var5, var6, var7, var8, var9, var10);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 36966515621531L;
float var3 = this.q;
Color var4 = this.o;
Color var5 = this.K;
float var6 = this.F;
float var7 = this.Q;
float var8 = this.I;
float var9 = this.Z;
float var10 = this.S;
return a<"k">(2805, 8385499547577187399L ^ var1)
+ var10
+ a<"k">(30073, 7112471468436849608L ^ var1)
+ var9
+ a<"k">(8147, 8686185175577913710L ^ var1)
+ var8
+ a<"k">(28802, 152495662492059197L ^ var1)
+ var7
+ a<"k">(23745, 6911223106115873405L ^ var1)
+ var6
+ a<"k">(26359, 1060051208771407949L ^ var1)
+ var5
+ a<"k">(22932, 338736592450989869L ^ var1)
+ var4
+ a<"k">(19013, 7219276265820536054L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 83923291448417L;
int var3 = Float.hashCode(this.S);
var3 = var3 * b<"t">(4654, 7816845894958846213L ^ var1) + Float.hashCode(this.Z);
var3 = var3 * b<"t">(28980, 582715975789867544L ^ var1) + Float.hashCode(this.I);
var3 = var3 * b<"t">(28980, 582715975789867544L ^ var1) + Float.hashCode(this.Q);
var3 = var3 * b<"t">(28980, 582715975789867544L ^ var1) + Float.hashCode(this.F);
var3 = var3 * b<"t">(28980, 582715975789867544L ^ var1) + this.K.hashCode();
var3 = var3 * b<"t">(28980, 582715975789867544L ^ var1) + this.o.hashCode();
return var3 * b<"t">(28980, 582715975789867544L ^ var1) + Float.hashCode(this.q);
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
// 000: getstatic su/catlean/a_.a J
// 003: ldc2_w 132696351719581
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 8150137364388814117
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 8159328712658747523
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 8159328712658747523
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/a_
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 8159328712658747523
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 8159328712658747523
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/a_
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/a_.S F
// 065: aload 5
// 067: getfield su/catlean/a_.S F
// 06a: invokestatic java/lang/Float.compare (FF)I
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w 8159328712658747523
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 8159328712658747523
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/a_.Z F
// 092: aload 5
// 094: getfield su/catlean/a_.Z F
// 097: invokestatic java/lang/Float.compare (FF)I
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 8159328712658747523
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 8159328712658747523
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/a_.I F
// 0bf: aload 5
// 0c1: getfield su/catlean/a_.I F
// 0c4: invokestatic java/lang/Float.compare (FF)I
// 0c7: aload 4
// 0c9: ifnonnull 0f4
// 0cc: ifeq 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 8159328712658747523
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 8159328712658747523
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/a_.Q F
// 0ec: aload 5
// 0ee: getfield su/catlean/a_.Q F
// 0f1: invokestatic java/lang/Float.compare (FF)I
// 0f4: aload 4
// 0f6: ifnonnull 121
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w 8159328712658747523
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 8159328712658747523
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/a_.F F
// 119: aload 5
// 11b: getfield su/catlean/a_.F F
// 11e: invokestatic java/lang/Float.compare (FF)I
// 121: aload 4
// 123: ifnonnull 14e
// 126: ifeq 142
// 129: goto 136
// 12c: ldc2_w 8159328712658747523
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w 8159328712658747523
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 0
// 143: getfield su/catlean/a_.K Ljava/awt/Color;
// 146: aload 5
// 148: getfield su/catlean/a_.K Ljava/awt/Color;
// 14b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 14e: aload 4
// 150: ifnonnull 17b
// 153: ifne 16f
// 156: goto 163
// 159: ldc2_w 8159328712658747523
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: bipush 0
// 164: ireturn
// 165: ldc2_w 8159328712658747523
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 0
// 170: getfield su/catlean/a_.o Ljava/awt/Color;
// 173: aload 5
// 175: getfield su/catlean/a_.o Ljava/awt/Color;
// 178: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 17b: aload 4
// 17d: ifnonnull 1a8
// 180: ifne 19c
// 183: goto 190
// 186: ldc2_w 8159328712658747523
// 189: lload 2
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: bipush 0
// 191: ireturn
// 192: ldc2_w 8159328712658747523
// 195: lload 2
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: aload 0
// 19d: getfield su/catlean/a_.q F
// 1a0: aload 5
// 1a2: getfield su/catlean/a_.q F
// 1a5: invokestatic java/lang/Float.compare (FF)I
// 1a8: aload 4
// 1aa: ifnonnull 1ca
// 1ad: ifeq 1c9
// 1b0: goto 1bd
// 1b3: ldc2_w 8159328712658747523
// 1b6: lload 2
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: bipush 0
// 1be: ireturn
// 1bf: ldc2_w 8159328712658747523
// 1c2: lload 2
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: bipush 1
// 1ca: ireturn
}

static {
long var11 = a ^ 118224647653834L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[13];
int var18 = 0;
String var17 = "ZyÛR\\IëgÖ\u0017,\u0093\u0018\u008a½äÝ)§c,GWfl¯å|´´\u0004*\u0010]¨q®ú®\u0081\u0082ö\u00adÃ\u000fa\u0098&ù\u0018\u0013\u007fi\u0098!\u0005uAíÌ/úv\u0003Ò9\u000f\u001a+oº\u0017\u0015\u0083\u0018®lD#Ú\u0089U \\\u009aÐ\u001ao<{ý\u000b\u0007`\u0001>ðg} ¬¸\u0091ã\u0014\u008e¿@FCÃIK>\u0088ñ\u0099:/«\u0085ã¬6BE\u001a*Ë¨#Ç ´Ù\u0001*5@Lsã.c¬>Ö%\r½B[¼z´ËÇ\u0095%ûu\u008b\u009em0\u0018;¹ë=sEp>\u009f¦PD¤ÏäQy¸\u0097O\u009a¶$\u0092 ®¬°Ìw¦Bªxâ\u0092óòk}Òä\u0095V\u0090\u00945»\u0087»\u0083¢Üß\"@\u0099 ÂlX!\u0014¹B0)\t°ÿ\u0003wc\u0086^:\u007f\u0000Úô~\u000b¹\u0099Ì\tOtó\u008b\u0010fàª°{¥\nç\"AÏ\u0097i\u009dUÿ\u0010\u0010\t\u0015ûÎ²>#\b£ í¬\u0083k.";
int var19 = "ZyÛR\\IëgÖ\u0017,\u0093\u0018\u008a½äÝ)§c,GWfl¯å|´´\u0004*\u0010]¨q®ú®\u0081\u0082ö\u00adÃ\u000fa\u0098&ù\u0018\u0013\u007fi\u0098!\u0005uAíÌ/úv\u0003Ò9\u000f\u001a+oº\u0017\u0015\u0083\u0018®lD#Ú\u0089U \\\u009aÐ\u001ao<{ý\u000b\u0007`\u0001>ðg} ¬¸\u0091ã\u0014\u008e¿@FCÃIK>\u0088ñ\u0099:/«\u0085ã¬6BE\u001a*Ë¨#Ç ´Ù\u0001*5@Lsã.c¬>Ö%\r½B[¼z´ËÇ\u0095%ûu\u008b\u009em0\u0018;¹ë=sEp>\u009f¦PD¤ÏäQy¸\u0097O\u009a¶$\u0092 ®¬°Ìw¦Bªxâ\u0092óòk}Òä\u0095V\u0090\u00945»\u0087»\u0083¢Üß\"@\u0099 ÂlX!\u0014¹B0)\t°ÿ\u0003wc\u0086^:\u007f\u0000Úô~\u000b¹\u0099Ì\tOtó\u008b\u0010fàª°{¥\nç\"AÏ\u0097i\u009dUÿ\u0010\u0010\t\u0015ûÎ²>#\b£ í¬\u0083k."
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
c = new String[13];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = "©X[êv\u008a3\u0080F\u0096Ð\u0092Í\u0010íìd?\u0091bÆÿM\u0094\u000b'À!ò]ÂhÓ2\u00adô?[Üµ";
int var5 = "©X[êv\u008a3\u0080F\u0096Ð\u0092Í\u0010íìd?\u0091bÆÿM\u0094\u000b'À!ò]ÂhÓ2\u00adô?[Üµ".length();
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
f = new Integer[7];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "þ§\u0013ho\u007f¥Ð\u0086XÞ÷\u001f\u0098\u00ad\u0001";
var5 = "þ§\u0013ho\u007f¥Ð\u0086XÞ÷\u001f\u0098\u00ad\u0001".length();
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

var17 = "ïE\r\u0083Ñ\nGRD'\u0018«e£6Û;\u009bMÝo2\u0012!´*F\u0081\n\u0099\u0012æx¿\u0084ÜË¼\u001bë\u00102Ù7\u0095Ü\u0018/\b\t\u0016¹QOêÜ¤";
var19 = "ïE\r\u0083Ñ\nGRD'\u0018«e£6Û;\u009bMÝo2\u0012!´*F\u0081\n\u0099\u0012æx¿\u0084ÜË¼\u001bë\u00102Ù7\u0095Ü\u0018/\b\t\u0016¹QOêÜ¤".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30870;
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
throw new RuntimeException("su/catlean/a_", var10);
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
throw new RuntimeException("su/catlean/a_" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 6139;
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
throw new RuntimeException("su/catlean/a_", var14);
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
throw new RuntimeException("su/catlean/a_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
