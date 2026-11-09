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
import net.minecraft.class_241;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class i6 implements class_11281 {
private final float U;
@NotNull
private final Color M;
@NotNull
private final Color s;
private final int d;
private final int G;
private final float X;
private final float f;
private final int m;
private final float D;
@NotNull
private final class_241 Z;
private final float J;
private final float j;
private static final long a = yz.a(8216273370705814828L, -8309457020984873276L, MethodHandles.lookup().lookupClass()).a(155671392935085L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

public i6(
float time,
@NotNull Color color,
@NotNull Color color2,
int colorMode,
int glowQuality,
float glowRadius,
float glowAlphaMult,
int glowThinOutline,
float fillAlphaMult,
@NotNull class_241 uHalfTexelSize,
float uSaturation,
long a,
float uBrightness
) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(color, a<"y">(20733, 4492393169420941122L ^ ax));
Intrinsics.checkNotNullParameter(color2, a<"y">(32218, 1970212930300336744L ^ ax));
Intrinsics.checkNotNullParameter(uHalfTexelSize, a<"y">(17885, 5025955835917099619L ^ ax));
super();
this.U = time;
this.M = color;
this.s = color2;
this.d = colorMode;
this.G = glowQuality;
this.X = glowRadius;
this.f = glowAlphaMult;
this.m = glowThinOutline;
this.D = fillAlphaMult;
this.Z = uHalfTexelSize;
this.J = uSaturation;
this.j = uBrightness;
}

public final float n() {
return this.U;
}

@NotNull
public final Color u() {
return this.M;
}

@NotNull
public final Color O() {
return this.s;
}

public final int k() {
return this.d;
}

public final int Z() {
return this.G;
}

public final float A() {
return this.X;
}

public final float w() {
return this.f;
}

public final int m() {
return this.m;
}

public final float t() {
return this.D;
}

@NotNull
public final class_241 H() {
return this.Z;
}

public final float l() {
return this.J;
}

public final float T() {
return this.j;
}

public void method_71104(@NotNull ByteBuffer buffer) {
long var2 = a ^ 123495999864710L;
long var4 = var2 ^ 26945533006168L;
long var6 = var2 ^ 70559539694069L;
long var10001 = var2 ^ 50461268640095L;
int var8 = (int)((var2 ^ 50461268640095L) >>> 48);
int var9 = (int)((var2 ^ 50461268640095L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
long var11 = (var2 ^ 59723733013073L) >>> 32;
int var13 = (int)((var2 ^ 59723733013073L) << 32 >>> 32);
Intrinsics.checkNotNullParameter(buffer, a<"y">(3411, 7053960772184759063L ^ var2));
Std140Builder.intoBuffer(buffer)
.putFloat(this.U)
.putVec4(jl.y.y(this.M, (char)var8, (short)var9, var10), jl.y.M(var6, this.M), jl.y.r(this.M, var11, var13), jl.y.G(var4, this.M))
.putVec4(jl.y.y(this.s, (char)var8, (short)var9, var10), jl.y.M(var6, this.s), jl.y.r(this.s, var11, var13), jl.y.G(var4, this.s))
.putInt(this.d)
.putInt(this.G)
.putFloat(this.X)
.putFloat(this.f)
.putInt(this.m)
.putFloat(this.D)
.putVec2(this.Z.field_1343, this.Z.field_1342)
.putFloat(this.J)
.putFloat(this.j);
}

public final float e() {
return this.U;
}

@NotNull
public final Color r() {
return this.M;
}

@NotNull
public final Color i() {
return this.s;
}

public final int d() {
return this.d;
}

public final int M() {
return this.G;
}

public final float P() {
return this.X;
}

public final float q() {
return this.f;
}

public final int Y() {
return this.m;
}

public final float X() {
return this.D;
}

@NotNull
public final class_241 x() {
return this.Z;
}

public final float c() {
return this.J;
}

public final float S() {
return this.j;
}

@NotNull
public final i6 O(
long a,
float time,
@NotNull Color color,
@NotNull Color color2,
int colorMode,
int glowQuality,
float glowRadius,
float glowAlphaMult,
char a,
int glowThinOutline,
float fillAlphaMult,
@NotNull class_241 uHalfTexelSize,
float uSaturation,
float uBrightness
) {
long var16 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
long var18 = var16 ^ 14243538785817L;
Intrinsics.checkNotNullParameter(color, a<"y">(10758, 6081899003034293104L ^ var16));
Intrinsics.checkNotNullParameter(color2, a<"y">(3365, 8948822259528823894L ^ var16));
Intrinsics.checkNotNullParameter(uHalfTexelSize, a<"y">(23638, 4910406629906392361L ^ var16));
return new i6(
time, color, color2, colorMode, glowQuality, glowRadius, glowAlphaMult, glowThinOutline, fillAlphaMult, uHalfTexelSize, uSaturation, var18, uBrightness
);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static i6 c(
i6 var0,
float var1,
Color var2,
Color var3,
long var4,
int var6,
int var7,
float var8,
float var9,
int var10,
float var11,
class_241 var12,
float var13,
float var14,
int var15,
Object var16
) {
var4 = a ^ var4;
long var17 = (var4 ^ 32339828665152L) >>> 16;
int var19 = (int)((var4 ^ 32339828665152L) << 48 >>> 48);
String[] var20 = vm.a<"Å">(-4986889427793127691L, var4);

int var10000;
label257: {
label256: {
try {
var10000 = var15 & 1;
if (var20 != null) {
break label257;
}

if (var10000 == 0) {
break label256;
}
} catch (NumberFormatException var40) {
throw vm.a<"Å">(var40, -4973803045593719285L, var4);
}

var1 = var0.U;
}

var10000 = var15 & 2;
}

String[] var10001;
label248: {
label247: {
label246: {
try {
var10001 = var20;
if (var4 < 0L) {
break label248;
}

if (var20 != null) {
break label247;
}

if (var10000 == 0) {
break label246;
}
} catch (NumberFormatException var39) {
throw vm.a<"Å">(var39, -4973803045593719285L, var4);
}

var2 = var0.M;
}

var10000 = var15 & 4;
}

try {
var10001 = var20;
} catch (NumberFormatException var29) {
throw vm.a<"Å">(var29, -4973803045593719285L, var4);
}
}

label235: {
label234: {
label233: {
try {
if (var4 <= 0L) {
break label235;
}

if (var10001 != null) {
break label234;
}

if (var10000 == 0) {
break label233;
}
} catch (NumberFormatException var38) {
throw vm.a<"Å">(var38, -4973803045593719285L, var4);
}

var3 = var0.s;
}

var10000 = var15 & b<"v">(16924, 1209156274624014426L ^ var4);
}

try {
var10001 = var20;
} catch (NumberFormatException var28) {
throw vm.a<"Å">(var28, -4973803045593719285L, var4);
}
}

label222: {
label221: {
label220: {
try {
if (var4 < 0L) {
break label222;
}

if (var10001 != null) {
break label221;
}

if (var10000 == 0) {
break label220;
}
} catch (NumberFormatException var37) {
throw vm.a<"Å">(var37, -4973803045593719285L, var4);
}

var6 = var0.d;
}

var10000 = var15 & b<"v">(24462, 1455444465542346179L ^ var4);
}

try {
var10001 = var20;
} catch (NumberFormatException var27) {
throw vm.a<"Å">(var27, -4973803045593719285L, var4);
}
}

label209: {
label208: {
label207: {
try {
if (var4 < 0L) {
break label209;
}

if (var10001 != null) {
break label208;
}

if (var10000 == 0) {
break label207;
}
} catch (NumberFormatException var36) {
throw vm.a<"Å">(var36, -4973803045593719285L, var4);
}

var7 = var0.G;
}

var10000 = var15 & b<"v">(667, 2097662249521080535L ^ var4);
}

try {
var10001 = var20;
} catch (NumberFormatException var26) {
throw vm.a<"Å">(var26, -4973803045593719285L, var4);
}
}

label196: {
label195: {
label194: {
try {
if (var4 <= 0L) {
break label196;
}

if (var10001 != null) {
break label195;
}

if (var10000 == 0) {
break label194;
}
} catch (NumberFormatException var35) {
throw vm.a<"Å">(var35, -4973803045593719285L, var4);
}

var8 = var0.X;
}

var10000 = var15 & b<"v">(12899, 5838281433032710182L ^ var4);
}

try {
var10001 = var20;
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, -4973803045593719285L, var4);
}
}

label183: {
label182: {
label181: {
try {
if (var4 <= 0L) {
break label183;
}

if (var10001 != null) {
break label182;
}

if (var10000 == 0) {
break label181;
}
} catch (NumberFormatException var34) {
throw vm.a<"Å">(var34, -4973803045593719285L, var4);
}

var9 = var0.f;
}

var10000 = var15 & b<"v">(255, 3613495585505340087L ^ var4);
}

try {
var10001 = var20;
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, -4973803045593719285L, var4);
}
}

label170: {
label169: {
label168: {
try {
if (var4 <= 0L) {
break label170;
}

if (var10001 != null) {
break label169;
}

if (var10000 == 0) {
break label168;
}
} catch (NumberFormatException var33) {
throw vm.a<"Å">(var33, -4973803045593719285L, var4);
}

var10 = var0.m;
}

var10000 = var15 & b<"v">(22303, 9122319037960731989L ^ var4);
}

try {
var10001 = var20;
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, -4973803045593719285L, var4);
}
}

label157: {
label156: {
label155: {
try {
if (var4 < 0L) {
break label157;
}

if (var10001 != null) {
break label156;
}

if (var10000 == 0) {
break label155;
}
} catch (NumberFormatException var32) {
throw vm.a<"Å">(var32, -4973803045593719285L, var4);
}

var11 = var0.D;
}

var10000 = var15 & b<"v">(1220, 114629973756374669L ^ var4);
}

try {
var10001 = var20;
} catch (NumberFormatException var22) {
throw vm.a<"Å">(var22, -4973803045593719285L, var4);
}
}

label144: {
label143: {
label142: {
try {
if (var4 < 0L) {
break label144;
}

if (var10001 != null) {
break label143;
}

if (var10000 == 0) {
break label142;
}
} catch (NumberFormatException var31) {
throw vm.a<"Å">(var31, -4973803045593719285L, var4);
}

var12 = var0.Z;
}

var10000 = var15 & b<"v">(15790, 6531321466205100001L ^ var4);
}

try {
var10001 = var20;
} catch (NumberFormatException var21) {
throw vm.a<"Å">(var21, -4973803045593719285L, var4);
}
}

label131: {
label130: {
try {
if (var10001 != null) {
break label131;
}

if (var10000 == 0) {
break label130;
}
} catch (NumberFormatException var30) {
throw vm.a<"Å">(var30, -4973803045593719285L, var4);
}

var13 = var0.J;
}

var10000 = var15 & b<"v">(23715, 7775497259494520552L ^ var4);
}

if (var10000 != 0) {
var14 = var0.j;
}

return var0.O(var17, var1, var2, var3, var6, var7, var8, var9, (char)var19, var10, var11, var12, var13, var14);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 112551529884007L;
float var3 = this.j;
float var4 = this.J;
class_241 var5 = this.Z;
float var6 = this.D;
int var7 = this.m;
float var8 = this.f;
float var9 = this.X;
int var10 = this.G;
int var11 = this.d;
Color var12 = this.s;
Color var13 = this.M;
float var14 = this.U;
return a<"y">(11229, 7020572574263454573L ^ var1)
+ var14
+ a<"y">(22793, 7357226646551320998L ^ var1)
+ var13
+ a<"y">(2236, 1100988372318259224L ^ var1)
+ var12
+ a<"y">(9454, 7210375081685951552L ^ var1)
+ var11
+ a<"y">(31726, 5615308081095736141L ^ var1)
+ var10
+ a<"y">(7706, 4678603195603590825L ^ var1)
+ var9
+ a<"y">(20288, 5262887421572534252L ^ var1)
+ var8
+ a<"y">(23162, 5507573687138179805L ^ var1)
+ var7
+ a<"y">(8956, 7065334684674761310L ^ var1)
+ var6
+ a<"y">(25159, 3802176292681179894L ^ var1)
+ var5
+ a<"y">(3641, 511132436349980304L ^ var1)
+ var4
+ a<"y">(23009, 8698570144120002881L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 10352253748229L;
int var4 = Float.hashCode(this.U);
var4 = var4 * b<"v">(13600, 3585719215027136577L ^ var1) + this.M.hashCode();
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + this.s.hashCode();
vm.a<"Å">(5612708263600431578L, var1);
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + Integer.hashCode(this.d);
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + Integer.hashCode(this.G);
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + Float.hashCode(this.X);
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + Float.hashCode(this.f);
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + Integer.hashCode(this.m);
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + Float.hashCode(this.D);
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + this.Z.hashCode();
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + Float.hashCode(this.J);
var4 = var4 * b<"v">(18011, 2502751667045849904L ^ var1) + Float.hashCode(this.j);

try {
if (vm.a<"Å">(5586593437435319062L, var1) != null) {
vm.a<"Å">(new String[2], 5493489362575141690L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 5608910536504879396L, var1);
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
// 000: getstatic su/catlean/i6.a J
// 003: ldc2_w 135930277291347
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 7832369600011534476
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w 7818434360425416818
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w 7818434360425416818
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/i6
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w 7818434360425416818
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w 7818434360425416818
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/i6
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/i6.U F
// 065: aload 5
// 067: getfield su/catlean/i6.U F
// 06a: invokestatic java/lang/Float.compare (FF)I
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w 7818434360425416818
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w 7818434360425416818
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/i6.M Ljava/awt/Color;
// 092: aload 5
// 094: getfield su/catlean/i6.M Ljava/awt/Color;
// 097: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifne 0bb
// 0a2: goto 0af
// 0a5: ldc2_w 7818434360425416818
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w 7818434360425416818
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/i6.s Ljava/awt/Color;
// 0bf: aload 5
// 0c1: getfield su/catlean/i6.s Ljava/awt/Color;
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c7: aload 4
// 0c9: ifnonnull 0ec
// 0cc: ifne 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w 7818434360425416818
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w 7818434360425416818
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/i6.d I
// 0ec: aload 5
// 0ee: getfield su/catlean/i6.d I
// 0f1: aload 4
// 0f3: ifnonnull 12d
// 0f6: if_icmpeq 112
// 0f9: goto 106
// 0fc: ldc2_w 7818434360425416818
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 0
// 107: ireturn
// 108: ldc2_w 7818434360425416818
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: aload 0
// 113: getfield su/catlean/i6.G I
// 116: aload 4
// 118: ifnonnull 148
// 11b: aload 5
// 11d: getfield su/catlean/i6.G I
// 120: goto 12d
// 123: ldc2_w 7818434360425416818
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: if_icmpeq 13c
// 130: bipush 0
// 131: ireturn
// 132: ldc2_w 7818434360425416818
// 135: lload 2
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: aload 0
// 13d: getfield su/catlean/i6.X F
// 140: aload 5
// 142: getfield su/catlean/i6.X F
// 145: invokestatic java/lang/Float.compare (FF)I
// 148: aload 4
// 14a: ifnonnull 175
// 14d: ifeq 169
// 150: goto 15d
// 153: ldc2_w 7818434360425416818
// 156: lload 2
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: bipush 0
// 15e: ireturn
// 15f: ldc2_w 7818434360425416818
// 162: lload 2
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: aload 0
// 16a: getfield su/catlean/i6.f F
// 16d: aload 5
// 16f: getfield su/catlean/i6.f F
// 172: invokestatic java/lang/Float.compare (FF)I
// 175: aload 4
// 177: ifnonnull 19a
// 17a: ifeq 196
// 17d: goto 18a
// 180: ldc2_w 7818434360425416818
// 183: lload 2
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: bipush 0
// 18b: ireturn
// 18c: ldc2_w 7818434360425416818
// 18f: lload 2
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: aload 0
// 197: getfield su/catlean/i6.m I
// 19a: aload 4
// 19c: ifnonnull 1cc
// 19f: aload 5
// 1a1: getfield su/catlean/i6.m I
// 1a4: if_icmpeq 1c0
// 1a7: goto 1b4
// 1aa: ldc2_w 7818434360425416818
// 1ad: lload 2
// 1ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b3: athrow
// 1b4: bipush 0
// 1b5: ireturn
// 1b6: ldc2_w 7818434360425416818
// 1b9: lload 2
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: aload 0
// 1c1: getfield su/catlean/i6.D F
// 1c4: aload 5
// 1c6: getfield su/catlean/i6.D F
// 1c9: invokestatic java/lang/Float.compare (FF)I
// 1cc: aload 4
// 1ce: ifnonnull 1f9
// 1d1: ifeq 1ed
// 1d4: goto 1e1
// 1d7: ldc2_w 7818434360425416818
// 1da: lload 2
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: athrow
// 1e1: bipush 0
// 1e2: ireturn
// 1e3: ldc2_w 7818434360425416818
// 1e6: lload 2
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: aload 0
// 1ee: getfield su/catlean/i6.Z Lnet/minecraft/class_241;
// 1f1: aload 5
// 1f3: getfield su/catlean/i6.Z Lnet/minecraft/class_241;
// 1f6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1f9: aload 4
// 1fb: ifnonnull 226
// 1fe: ifne 21a
// 201: goto 20e
// 204: ldc2_w 7818434360425416818
// 207: lload 2
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: bipush 0
// 20f: ireturn
// 210: ldc2_w 7818434360425416818
// 213: lload 2
// 214: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: athrow
// 21a: aload 0
// 21b: getfield su/catlean/i6.J F
// 21e: aload 5
// 220: getfield su/catlean/i6.J F
// 223: invokestatic java/lang/Float.compare (FF)I
// 226: aload 4
// 228: ifnonnull 253
// 22b: ifeq 247
// 22e: goto 23b
// 231: ldc2_w 7818434360425416818
// 234: lload 2
// 235: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23a: athrow
// 23b: bipush 0
// 23c: ireturn
// 23d: ldc2_w 7818434360425416818
// 240: lload 2
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: aload 0
// 248: getfield su/catlean/i6.j F
// 24b: aload 5
// 24d: getfield su/catlean/i6.j F
// 250: invokestatic java/lang/Float.compare (FF)I
// 253: aload 4
// 255: ifnonnull 275
// 258: ifeq 274
// 25b: goto 268
// 25e: ldc2_w 7818434360425416818
// 261: lload 2
// 262: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 267: athrow
// 268: bipush 0
// 269: ireturn
// 26a: ldc2_w 7818434360425416818
// 26d: lload 2
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: bipush 1
// 275: ireturn
}

static {
long var11 = a ^ 5298140722440L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[19];
int var18 = 0;
String var17 = "èé\u009a\u001b(\u0086á\u009e\u0085·å\u001e\u0083f \u000f\u001d\u0019k\u0016Ö\u0089J\u0089¶Õum\u0018\u009b¢\u0090\u0018\u0016UÒ\u009f)¦\u0086\u0086\u0086EêÚlT\u000fñng\u0099þP}#i 8\u001b\u009d¤Dj\u0019Z\u0000\u0097\u000eÏ¯\u0090J§¾»jN[Lxr·ýFvJðñ\u0014(öÖº²\u00182qj9[*æ£<2tßt×à\u0094²=\u0011\u0082S%_\u008a¼\u0007Ã\u001fµ\rgd»\u0016ã\u0010Ï\u0003\n@Þ\u0012ó\u0081Q\u0017Á¦!\u0093»\t\u0018°\u0006G¤ãÙ«híÀÄ\tá!¯ô÷¿§yJ¦I\u0011(úÏ³Ëa®\u0000Ä\u0011vN\u0092Å\u001dû\u008b§n¡5Ñ;0Ú_x_iD»[x\r\u001fÈ*¯\u0089½9\u0010ª\u0019)Â¨F\u009a\u000fß\u001bï>\u009cÅ@¿ 3\u000få£`e!ñý(Ä\u0002¯-jö0¨\u0019gmD\u0095ûÑé\u000e>vï.Ø\u0010\u0010\u0080\u000b®rp\u0016u>ÏQ·\u00920\u0019\u0005\u0010;Afn\u008a!ÐÝre\u001f6Yý\u0095\\\u0018~:\u0006\u0016\u0007Èý°\u007fd\u008c\u0081±Y^Òø¼Ö4\u000b\u0085#È\u0010\u0089(4\nJX\u0094UEò\u001b2 µ\tk(\u008f\\ì¸\u008cz\u001dT=÷}sÉ\u008fyþ\u000f\u0016ST»\u0095\u001e\u0097×\u0090P×\u0090Ë\u0082\u0080\u0099&e´îJÁT\u0018\u0088_Ì\u0000\u0011\u0081\u0099R\u0089ÏOú>\u009f\u0094PÍÛ\u008bt\u0090µ % E³ÍÍ\bÒÿð5Â\u001b}ô3ã£\u009cr\u0010£2ÆQ8*ßî\u0099\u001f¦¢Í(\u0016\u0006*¼Ýd\u0005\u009eÿ â\u008dtöYs1\u0088WÚ<ÐÊH\u0086\u0098eñZ·ïd÷brÒ/4µô";
int var19 = "èé\u009a\u001b(\u0086á\u009e\u0085·å\u001e\u0083f \u000f\u001d\u0019k\u0016Ö\u0089J\u0089¶Õum\u0018\u009b¢\u0090\u0018\u0016UÒ\u009f)¦\u0086\u0086\u0086EêÚlT\u000fñng\u0099þP}#i 8\u001b\u009d¤Dj\u0019Z\u0000\u0097\u000eÏ¯\u0090J§¾»jN[Lxr·ýFvJðñ\u0014(öÖº²\u00182qj9[*æ£<2tßt×à\u0094²=\u0011\u0082S%_\u008a¼\u0007Ã\u001fµ\rgd»\u0016ã\u0010Ï\u0003\n@Þ\u0012ó\u0081Q\u0017Á¦!\u0093»\t\u0018°\u0006G¤ãÙ«híÀÄ\tá!¯ô÷¿§yJ¦I\u0011(úÏ³Ëa®\u0000Ä\u0011vN\u0092Å\u001dû\u008b§n¡5Ñ;0Ú_x_iD»[x\r\u001fÈ*¯\u0089½9\u0010ª\u0019)Â¨F\u009a\u000fß\u001bï>\u009cÅ@¿ 3\u000få£`e!ñý(Ä\u0002¯-jö0¨\u0019gmD\u0095ûÑé\u000e>vï.Ø\u0010\u0010\u0080\u000b®rp\u0016u>ÏQ·\u00920\u0019\u0005\u0010;Afn\u008a!ÐÝre\u001f6Yý\u0095\\\u0018~:\u0006\u0016\u0007Èý°\u007fd\u008c\u0081±Y^Òø¼Ö4\u000b\u0085#È\u0010\u0089(4\nJX\u0094UEò\u001b2 µ\tk(\u008f\\ì¸\u008cz\u001dT=÷}sÉ\u008fyþ\u000f\u0016ST»\u0095\u001e\u0097×\u0090P×\u0090Ë\u0082\u0080\u0099&e´îJÁT\u0018\u0088_Ì\u0000\u0011\u0081\u0099R\u0089ÏOú>\u009f\u0094PÍÛ\u008bt\u0090µ % E³ÍÍ\bÒÿð5Â\u001b}ô3ã£\u009cr\u0010£2ÆQ8*ßî\u0099\u001f¦¢Í(\u0016\u0006*¼Ýd\u0005\u009eÿ â\u008dtöYs1\u0088WÚ<ÐÊH\u0086\u0098eñZ·ïd÷brÒ/4µô"
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
c = new String[19];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[11];
int var3 = 0;
String var4 = "^LRMáVmû·\u0087²´\u008c¯\u0002W;üÏô,\fßÏÛÓ(\u0098Ì\u0012ðW{¾Þº\u001dotÚÆ©Ø^:`\"%\u008c\u0006H²\f(w\u009dF\u0005a\u008cÛ-\u0085apna\u0000D\rØÞ";
int var5 = "^LRMáVmû·\u0087²´\u008c¯\u0002W;üÏô,\fßÏÛÓ(\u0098Ì\u0012ðW{¾Þº\u001dotÚÆ©Ø^:`\"%\u008c\u0006H²\f(w\u009dF\u0005a\u008cÛ-\u0085apna\u0000D\rØÞ"
.length();
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
g = var6;
h = new Integer[11];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u008e\u0098\u0093\u0093Îö»¶ÅöæMÃ7!Ô";
var5 = "\u008e\u0098\u0093\u0093Îö»¶ÅöæMÃ7!Ô".length();
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

var17 = "&ß\u0017ùÐvBåwÏ<ëUu¢,Ø-a\u000b\u0094Î=hÆ¸²Í\u001d0ñÊlÞt¤²Í~E\u0018\u0018\u001am<·6øû'\u0090øÐ1@ )\u0017ËìA\u0083\u0090Ð\u0013";
var19 = "&ß\u0017ùÐvBåwÏ<ëUu¢,Ø-a\u000b\u0094Î=hÆ¸²Í\u001d0ñÊlÞt¤²Í~E\u0018\u0018\u001am<·6øû'\u0090øÐ1@ )\u0017ËìA\u0083\u0090Ð\u0013".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8469;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/i6", var10);
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
throw new RuntimeException("su/catlean/i6" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 20917;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/i6", var14);
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
throw new RuntimeException("su/catlean/i6" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
