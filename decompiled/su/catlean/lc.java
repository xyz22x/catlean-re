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

public final class lc implements class_11281 {
private final float e;
private final float D;
@NotNull
private final Color N;
@NotNull
private final Color C;
@NotNull
private final Color P;
@NotNull
private final Color g;
private final float Z;
private final float F;
private static final long a = yz.a(-3199097495515647968L, -6012671410044015894L, MethodHandles.lookup().lookupClass()).a(24272069776065L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map i;

public lc(
byte a,
float halfTexelSizeX,
float halfTexelSizeY,
@NotNull Color color1,
@NotNull Color color2,
@NotNull Color color3,
long a,
@NotNull Color color4,
float lineWidth,
float time
) {
long var12 = ((long)axx << 56 | ax << 8 >>> 8) ^ a;
Intrinsics.checkNotNullParameter(color1, a<"b">(11400, 8630042021760776169L ^ var12));
Intrinsics.checkNotNullParameter(color2, a<"b">(4784, 94274096983345627L ^ var12));
Intrinsics.checkNotNullParameter(color3, a<"b">(23935, 1306067191305324061L ^ var12));
Intrinsics.checkNotNullParameter(color4, a<"b">(31226, 1196365297127744146L ^ var12));
super();
this.e = halfTexelSizeX;
this.D = halfTexelSizeY;
this.N = color1;
this.C = color2;
this.P = color3;
this.g = color4;
this.Z = lineWidth;
this.F = time;
}

public final float U() {
return this.e;
}

public final float o() {
return this.D;
}

@NotNull
public final Color l() {
return this.N;
}

@NotNull
public final Color Z() {
return this.C;
}

@NotNull
public final Color E() {
return this.P;
}

@NotNull
public final Color B() {
return this.g;
}

public final float j() {
return this.Z;
}

public final float y() {
return this.F;
}

public void method_71104(@NotNull ByteBuffer buffer) {
long var2 = a ^ 34234046327032L;
long var4 = var2 ^ 35977679995334L;
long var6 = var2 ^ 132033308711275L;
long var10001 = var2 ^ 24042820358593L;
int var8 = (int)((var2 ^ 24042820358593L) >>> 48);
int var9 = (int)((var2 ^ 24042820358593L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
long var11 = (var2 ^ 15842152432335L) >>> 32;
int var13 = (int)((var2 ^ 15842152432335L) << 32 >>> 32);
String[] var10000 = vm.a<"Å">(-6415068228192810297L, var2);
Intrinsics.checkNotNullParameter(buffer, a<"b">(24094, 7445813521390492113L ^ var2));
Std140Builder.intoBuffer(buffer)
.putVec2(this.e, this.D)
.putVec4(jl.y.y(this.N, (char)var8, (short)var9, var10), jl.y.M(var6, this.N), jl.y.r(this.N, var11, var13), jl.y.G(var4, this.N))
.putVec4(jl.y.y(this.C, (char)var8, (short)var9, var10), jl.y.M(var6, this.C), jl.y.r(this.C, var11, var13), jl.y.G(var4, this.C))
.putVec4(jl.y.y(this.P, (char)var8, (short)var9, var10), jl.y.M(var6, this.P), jl.y.r(this.P, var11, var13), jl.y.G(var4, this.P))
.putVec4(jl.y.y(this.g, (char)var8, (short)var9, var10), jl.y.M(var6, this.g), jl.y.r(this.g, var11, var13), jl.y.G(var4, this.g))
.putFloat(this.Z)
.putFloat(this.F);
String[] var14 = var10000;

try {
if (var14 != null) {
vm.a<"Å">(new _g[2], -6418484232812516143L, var2);
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, -6443877072079076543L, var2);
}
}

public final float W() {
return this.e;
}

public final float b() {
return this.D;
}

@NotNull
public final Color s() {
return this.N;
}

@NotNull
public final Color T() {
return this.C;
}

@NotNull
public final Color H() {
return this.P;
}

@NotNull
public final Color P() {
return this.g;
}

public final float e() {
return this.Z;
}

public final float X() {
return this.F;
}

@NotNull
public final lc Y(
float halfTexelSizeX,
float halfTexelSizeY,
int a,
@NotNull Color color1,
int a,
char a,
@NotNull Color color2,
@NotNull Color color3,
@NotNull Color color4,
float lineWidth,
float time
) {
long var12 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
int var14 = (int)((var12 ^ 69380126930279L) >>> 56);
long var15 = (var12 ^ 69380126930279L) << 8 >>> 8;
Intrinsics.checkNotNullParameter(color1, a<"b">(6216, 2248534000274209139L ^ var12));
Intrinsics.checkNotNullParameter(color2, a<"b">(3420, 9199166437090716769L ^ var12));
Intrinsics.checkNotNullParameter(color3, a<"b">(1423, 1739271841874699454L ^ var12));
Intrinsics.checkNotNullParameter(color4, a<"b">(11705, 8520125065341848714L ^ var12));
return new lc((byte)var14, halfTexelSizeX, halfTexelSizeY, color1, color2, color3, var15, color4, lineWidth, time);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static lc P(
lc var0, float var1, float var2, Color var3, char var4, Color var5, Color var6, Color var7, float var8, long var9, float var11, int var12, Object var13
) {
long var14 = ((long)var4 << 48 | var9 << 16 >>> 16) ^ a;
long var10001 = var14 ^ 101358297704439L;
int var16 = (int)((var14 ^ 101358297704439L) >>> 32);
int var17 = (int)((var14 ^ 101358297704439L) << 32 >>> 48);
int var18 = (int)(var10001 << 48 >>> 48);
String[] var19 = vm.a<"Å">(2936949807934850300L, var14);

int var10000;
label161: {
label160: {
try {
var10000 = var12 & 1;
if (var19 != null) {
break label161;
}

if (var10000 == 0) {
break label160;
}
} catch (NumberFormatException var31) {
throw vm.a<"Å">(var31, 2930016883380243834L, var14);
}

var1 = var0.e;
}

var10000 = var12 & 2;
}

label152: {
label151: {
label150: {
try {
var32 = var19;
if (var4 < 0) {
break label152;
}

if (var19 != null) {
break label151;
}

if (var10000 == 0) {
break label150;
}
} catch (NumberFormatException var30) {
throw vm.a<"Å">(var30, 2930016883380243834L, var14);
}

var2 = var0.D;
}

var10000 = var12 & 4;
}

try {
var32 = var19;
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, 2930016883380243834L, var14);
}
}

label139: {
label138: {
label137: {
try {
if (var4 < 0) {
break label139;
}

if (var32 != null) {
break label138;
}

if (var10000 == 0) {
break label137;
}
} catch (NumberFormatException var29) {
throw vm.a<"Å">(var29, 2930016883380243834L, var14);
}

var3 = var0.N;
}

var10000 = var12 & b<"m">(13562, 3082434314013086871L ^ var14);
}

try {
var32 = var19;
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, 2930016883380243834L, var14);
}
}

label126: {
label125: {
label124: {
try {
if (var4 < 0) {
break label126;
}

if (var32 != null) {
break label125;
}

if (var10000 == 0) {
break label124;
}
} catch (NumberFormatException var28) {
throw vm.a<"Å">(var28, 2930016883380243834L, var14);
}

var5 = var0.C;
}

var10000 = var12 & b<"m">(20929, 2322528970404819373L ^ var14);
}

try {
var32 = var19;
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, 2930016883380243834L, var14);
}
}

label113: {
label112: {
label111: {
try {
if (var4 < 0) {
break label113;
}

if (var32 != null) {
break label112;
}

if (var10000 == 0) {
break label111;
}
} catch (NumberFormatException var27) {
throw vm.a<"Å">(var27, 2930016883380243834L, var14);
}

var6 = var0.P;
}

var10000 = var12 & b<"m">(6416, 7062012997582207352L ^ var14);
}

try {
var32 = var19;
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, 2930016883380243834L, var14);
}
}

label100: {
label99: {
label98: {
try {
if (var9 < 0L) {
break label100;
}

if (var32 != null) {
break label99;
}

if (var10000 == 0) {
break label98;
}
} catch (NumberFormatException var26) {
throw vm.a<"Å">(var26, 2930016883380243834L, var14);
}

var7 = var0.g;
}

var10000 = var12 & b<"m">(31633, 8047036065168940024L ^ var14);
}

try {
var32 = var19;
} catch (NumberFormatException var20) {
throw vm.a<"Å">(var20, 2930016883380243834L, var14);
}
}

label87: {
label86: {
try {
if (var32 != null) {
break label87;
}

if (var10000 == 0) {
break label86;
}
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, 2930016883380243834L, var14);
}

var8 = var0.Z;
}

var10000 = var12 & b<"m">(26632, 2667512852978092130L ^ var14);
}

if (var10000 != 0) {
var11 = var0.F;
}

return var0.Y(var1, var2, var16, var3, var17, (char)var18, var5, var6, var7, var8, var11);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 76111633906941L;
float var3 = this.F;
float var4 = this.Z;
Color var5 = this.g;
Color var6 = this.P;
Color var7 = this.C;
Color var8 = this.N;
float var9 = this.D;
float var10 = this.e;
return a<"b">(22249, 7379255274524542250L ^ var1)
+ var10
+ a<"b">(8413, 6850686083711726361L ^ var1)
+ var9
+ a<"b">(8709, 253746320565465541L ^ var1)
+ var8
+ a<"b">(2605, 8461619253108595168L ^ var1)
+ var7
+ a<"b">(26957, 964456932428135057L ^ var1)
+ var6
+ a<"b">(6587, 7864479348052052595L ^ var1)
+ var5
+ a<"b">(10223, 5875164389970310177L ^ var1)
+ var4
+ a<"b">(4934, 2398690277788106884L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 84921920976641L;
int var3 = Float.hashCode(this.e);
var3 = var3 * b<"m">(17073, 3969629916146774808L ^ var1) + Float.hashCode(this.D);
var3 = var3 * b<"m">(9063, 3226104354212991690L ^ var1) + this.N.hashCode();
var3 = var3 * b<"m">(9063, 3226104354212991690L ^ var1) + this.C.hashCode();
var3 = var3 * b<"m">(9063, 3226104354212991690L ^ var1) + this.P.hashCode();
var3 = var3 * b<"m">(9063, 3226104354212991690L ^ var1) + this.g.hashCode();
var3 = var3 * b<"m">(9063, 3226104354212991690L ^ var1) + Float.hashCode(this.Z);
return var3 * b<"m">(9063, 3226104354212991690L ^ var1) + Float.hashCode(this.F);
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
// 000: getstatic su/catlean/lc.a J
// 003: ldc2_w 90501226312145
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 4598267589560751086
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 4592530998593903208
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 4592530998593903208
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/lc
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 4592530998593903208
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 4592530998593903208
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/lc
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/lc.e F
// 065: aload 5
// 067: getfield su/catlean/lc.e F
// 06a: invokestatic java/lang/Float.compare (FF)I
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w 4592530998593903208
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 4592530998593903208
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/lc.D F
// 092: aload 5
// 094: getfield su/catlean/lc.D F
// 097: invokestatic java/lang/Float.compare (FF)I
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 4592530998593903208
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 4592530998593903208
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/lc.N Ljava/awt/Color;
// 0bf: aload 5
// 0c1: getfield su/catlean/lc.N Ljava/awt/Color;
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c7: aload 4
// 0c9: ifnonnull 0f4
// 0cc: ifne 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 4592530998593903208
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 4592530998593903208
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/lc.C Ljava/awt/Color;
// 0ec: aload 5
// 0ee: getfield su/catlean/lc.C Ljava/awt/Color;
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f4: aload 4
// 0f6: ifnonnull 121
// 0f9: ifne 115
// 0fc: goto 109
// 0ff: ldc2_w 4592530998593903208
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w 4592530998593903208
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/lc.P Ljava/awt/Color;
// 119: aload 5
// 11b: getfield su/catlean/lc.P Ljava/awt/Color;
// 11e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 121: aload 4
// 123: ifnonnull 14e
// 126: ifne 142
// 129: goto 136
// 12c: ldc2_w 4592530998593903208
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w 4592530998593903208
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 0
// 143: getfield su/catlean/lc.g Ljava/awt/Color;
// 146: aload 5
// 148: getfield su/catlean/lc.g Ljava/awt/Color;
// 14b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 14e: aload 4
// 150: ifnonnull 17b
// 153: ifne 16f
// 156: goto 163
// 159: ldc2_w 4592530998593903208
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: bipush 0
// 164: ireturn
// 165: ldc2_w 4592530998593903208
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 0
// 170: getfield su/catlean/lc.Z F
// 173: aload 5
// 175: getfield su/catlean/lc.Z F
// 178: invokestatic java/lang/Float.compare (FF)I
// 17b: aload 4
// 17d: ifnonnull 1a8
// 180: ifeq 19c
// 183: goto 190
// 186: ldc2_w 4592530998593903208
// 189: lload 2
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: bipush 0
// 191: ireturn
// 192: ldc2_w 4592530998593903208
// 195: lload 2
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: aload 0
// 19d: getfield su/catlean/lc.F F
// 1a0: aload 5
// 1a2: getfield su/catlean/lc.F F
// 1a5: invokestatic java/lang/Float.compare (FF)I
// 1a8: aload 4
// 1aa: ifnonnull 1ca
// 1ad: ifeq 1c9
// 1b0: goto 1bd
// 1b3: ldc2_w 4592530998593903208
// 1b6: lload 2
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: bipush 0
// 1be: ireturn
// 1bf: ldc2_w 4592530998593903208
// 1c2: lload 2
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: bipush 1
// 1ca: ireturn
}

static {
long var11 = a ^ 128876738321384L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[17];
int var18 = 0;
String var17 = "VT\u0084-½A±ü\u008eqW\u0012\u0082_íø T\u0010íé\u008eÊ±x>÷ob¹%¿Â+M¼\u008cyÑÎ\u0014\u0085çµõM\u0010\u0018á\u0018<Ç\u0006êq(ÔRÏ¿ßh*Î\\àÉ\u0007\"ßÏjò(\u0010Àu\u0090\u0012GLÑ°}³>Ò³ú\u0000\u0097\u0018tÃSÓ\u0089âj\u0082\u0086\u001eF&¹G#\u0080Îr\u0090ÔL\u0012\u0014\u0018\u0010\u0007WÌ\u0083Îó¶\bY\u008e[©<D×\u008f\u0010\u001eÃ10 3ôéÆT<ì»¯qÐ\u0010\u0085ûO¼=\u009b>(\u0016ÓBmËk@.(6»\u0007¹4bÈã¯Ä«éôîN\u001eô&\u0088\u009d\u0015¡Åß;\u0090hò`·\u0092ÃÐ\u0097\u001d\u009fÀI\u0018É\u00101\u0004\fÛ]¼.\u001d¸\"-Ù~(Ä\u008b\u0010ô»ÁÿØN{[H\u0086ÝìÐ\u001dE+\u0010I\u0099ª±\u0092ã\u009bMþ\u0007\u008dnÀ¡,7 ;ý2Ô»d\u009a\u0082d\u000eÖ\u0084ô÷2¢Óá\u009eÎ¡À\u0086ke.\u0014\u0094\u0019é\u0016&\u0010/\u0088%\u0001\u0082\u00975\u0018_[\u0001¬\u0002¥öM\u0010ü»u<$ö\u001cô\béjÔ©\u0014\u0095£";
int var19 = "VT\u0084-½A±ü\u008eqW\u0012\u0082_íø T\u0010íé\u008eÊ±x>÷ob¹%¿Â+M¼\u008cyÑÎ\u0014\u0085çµõM\u0010\u0018á\u0018<Ç\u0006êq(ÔRÏ¿ßh*Î\\àÉ\u0007\"ßÏjò(\u0010Àu\u0090\u0012GLÑ°}³>Ò³ú\u0000\u0097\u0018tÃSÓ\u0089âj\u0082\u0086\u001eF&¹G#\u0080Îr\u0090ÔL\u0012\u0014\u0018\u0010\u0007WÌ\u0083Îó¶\bY\u008e[©<D×\u008f\u0010\u001eÃ10 3ôéÆT<ì»¯qÐ\u0010\u0085ûO¼=\u009b>(\u0016ÓBmËk@.(6»\u0007¹4bÈã¯Ä«éôîN\u001eô&\u0088\u009d\u0015¡Åß;\u0090hò`·\u0092ÃÐ\u0097\u001d\u009fÀI\u0018É\u00101\u0004\fÛ]¼.\u001d¸\"-Ù~(Ä\u008b\u0010ô»ÁÿØN{[H\u0086ÝìÐ\u001dE+\u0010I\u0099ª±\u0092ã\u009bMþ\u0007\u008dnÀ¡,7 ;ý2Ô»d\u009a\u0082d\u000eÖ\u0084ô÷2¢Óá\u009eÎ¡À\u0086ke.\u0014\u0094\u0019é\u0016&\u0010/\u0088%\u0001\u0082\u00975\u0018_[\u0001¬\u0002¥öM\u0010ü»u<$ö\u001cô\béjÔ©\u0014\u0095£"
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
c = new String[17];
i = new HashMap(13);
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
String var4 = "S\u008bÉ\u001d\"ËezÜLù2\u00806°\u007fÇ\b\u0097MÅ\u008bê7ÙkOüy3½1¥þ2ç\u000br¹\u008f";
int var5 = "S\u008bÉ\u001d\"ËezÜLù2\u00806°\u007fÇ\b\u0097MÅ\u008bê7ÙkOüy3½1¥þ2ç\u000br¹\u008f".length();
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
h = new Integer[7];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "E\u0098J±\u0088P\rZz\u0098|Imãb±";
var5 = "E\u0098J±\u0088P\rZz\u0098|Imãb±".length();
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

var17 = "\u0085tï¶\u0002\u008bøc(ÆB¿.Õ6\u009b\r\u0011§Oäüê\u009a ØKµÙ\u0098¼´\bEý\u0083³è\u0086mø\u001d±\u0003(n\r\u0014\u0018Á\f½a¶E\u001e\u0011\u008f\u001cñMÈ¯¢yÈZÔ\u0080!lðn";
var19 = "\u0085tï¶\u0002\u008bøc(ÆB¿.Õ6\u009b\r\u0011§Oäüê\u009a ØKµÙ\u0098¼´\bEý\u0083³è\u0086mø\u001d±\u0003(n\r\u0014\u0018Á\f½a¶E\u001e\u0011\u008f\u001cñMÈ¯¢yÈZÔ\u0080!lðn"
.length();
var16 = '0';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8194;
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
throw new RuntimeException("su/catlean/lc", var10);
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
throw new RuntimeException("su/catlean/lc" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 2457;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/lc", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/lc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
