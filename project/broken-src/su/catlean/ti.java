package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ti {
private float f;
private float n;
private float t;
private final float r;
private float b;
private float A;
private boolean U;
private final float q;
private final int g;
private int K;
private static String[] o;
private static final long a = yz.a(1258532364230898749L, -780104895118626961L, MethodHandles.lookup().lookupClass()).a(223123135537519L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map j;

public ti(float yaw, float prevYaw, float pitch, float radius, float alpha, float prevAlpha, boolean fadeIn, float spinSpeed, int lifeTime, int age) {
this.f = yaw;
this.n = prevYaw;
this.t = pitch;
this.r = radius;
this.b = alpha;
this.A = prevAlpha;
this.U = fadeIn;
this.q = spinSpeed;
this.g = lifeTime;
this.K = age;
}

public ti(
float var1,
float var2,
float var3,
float var4,
float var5,
float var6,
boolean var7,
float var8,
int var9,
int var10,
int var11,
long var12,
DefaultConstructorMarker var14
) {
var12 = a ^ var12;
if ((var11 & 2) != 0) {
var2 = var1;
}

if ((var11 & b<"u">(15169, 3284804653344635219L ^ var12)) != 0) {
var5 = 0.0F;
}

if ((var11 & b<"u">(2154, 1200896028887419502L ^ var12)) != 0) {
var6 = 0.0F;
}

if ((var11 & b<"u">(452, 296798598765085652L ^ var12)) != 0) {
var7 = true;
}

if ((var11 & b<"u">(370, 9042027417960350572L ^ var12)) != 0) {
var8 = 1.5F + ThreadLocalRandom.current().nextFloat() * 1.0F;
}

if ((var11 & b<"u">(13170, 3651126143444693357L ^ var12)) != 0) {
var9 = ThreadLocalRandom.current().nextInt(b<"u">(2691, 990507465895151765L ^ var12), b<"u">(9062, 6420965545661833597L ^ var12));
}

if ((var11 & b<"u">(13766, 3898887027800848338L ^ var12)) != 0) {
var10 = 0;
}

this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
}

public final float b() {
return this.f;
}

public final void G(float <set-?>) {
this.f = <set-?>;
}

public final float I() {
return this.n;
}

public final void P(float <set-?>) {
this.n = <set-?>;
}

public final float A() {
return this.t;
}

public final void c(float <set-?>) {
this.t = <set-?>;
}

public final float E() {
return this.r;
}

public final float O() {
return this.b;
}

public final void g(float <set-?>) {
this.b = <set-?>;
}

public final float D() {
return this.A;
}

public final void E(float <set-?>) {
this.A = <set-?>;
}

public final boolean G() {
return this.U;
}

public final void I(boolean <set-?>) {
this.U = <set-?>;
}

public final float z() {
return this.q;
}

public final int Z() {
return this.g;
}

public final int B() {
return this.K;
}

public final void O(int <set-?>) {
this.K = <set-?>;
}

public final float r() {
return this.f;
}

public final float P() {
return this.n;
}

public final float J() {
return this.t;
}

public final float x() {
return this.r;
}

public final float F() {
return this.b;
}

public final float l() {
return this.A;
}

public final boolean N() {
return this.U;
}

public final float h() {
return this.q;
}

public final int w() {
return this.g;
}

public final int d() {
return this.K;
}

@NotNull
public final ti v(float yaw, float prevYaw, float pitch, float radius, float alpha, float prevAlpha, boolean fadeIn, float spinSpeed, int lifeTime, int age) {
return new ti(yaw, prevYaw, pitch, radius, alpha, prevAlpha, fadeIn, spinSpeed, lifeTime, age);
}

public static ti g(
ti param0,
float param1,
float param2,
float param3,
float param4,
float param5,
float param6,
boolean param7,
float param8,
long param9,
int param11,
int param12,
int param13,
Object param14
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ti.a J
// 003: lload 9
// 005: lxor
// 006: lstore 9
// 008: ldc2_w 7551780177275202822
// 00b: lload 9
// 00d: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 012: astore 15
// 014: iload 13
// 016: bipush 1
// 017: iand
// 018: aload 15
// 01a: ifnonnull 037
// 01d: ifeq 033
// 020: goto 02e
// 023: ldc2_w 7502319723393630894
// 026: lload 9
// 028: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: athrow
// 02e: aload 0
// 02f: getfield su/catlean/ti.f F
// 032: fstore 1
// 033: iload 13
// 035: bipush 2
// 036: iand
// 037: aload 15
// 039: lload 9
// 03b: lconst_0
// 03c: lcmp
// 03d: ifle 05f
// 040: ifnonnull 05d
// 043: ifeq 059
// 046: goto 054
// 049: ldc2_w 7502319723393630894
// 04c: lload 9
// 04e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: athrow
// 054: aload 0
// 055: getfield su/catlean/ti.n F
// 058: fstore 2
// 059: iload 13
// 05b: bipush 4
// 05c: iand
// 05d: aload 15
// 05f: lload 9
// 061: lconst_0
// 062: lcmp
// 063: iflt 092
// 066: ifnonnull 090
// 069: ifeq 07f
// 06c: goto 07a
// 06f: ldc2_w 7502319723393630894
// 072: lload 9
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: aload 0
// 07b: getfield su/catlean/ti.t F
// 07e: fstore 3
// 07f: iload 13
// 081: sipush 19358
// 084: ldc2_w 3257121995438111833
// 087: lload 9
// 089: lxor
// 08a: invokedynamic u (IJ)I bsm=su/catlean/ti.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: iand
// 090: aload 15
// 092: lload 9
// 094: lconst_0
// 095: lcmp
// 096: iflt 0c6
// 099: ifnonnull 0c4
// 09c: ifeq 0b3
// 09f: goto 0ad
// 0a2: ldc2_w 7502319723393630894
// 0a5: lload 9
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: aload 0
// 0ae: getfield su/catlean/ti.r F
// 0b1: fstore 4
// 0b3: iload 13
// 0b5: sipush 23093
// 0b8: ldc2_w 5086093651486551545
// 0bb: lload 9
// 0bd: lxor
// 0be: invokedynamic u (IJ)I bsm=su/catlean/ti.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c3: iand
// 0c4: aload 15
// 0c6: lload 9
// 0c8: lconst_0
// 0c9: lcmp
// 0ca: ifle 0fa
// 0cd: ifnonnull 0f8
// 0d0: ifeq 0e7
// 0d3: goto 0e1
// 0d6: ldc2_w 7502319723393630894
// 0d9: lload 9
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: aload 0
// 0e2: getfield su/catlean/ti.b F
// 0e5: fstore 5
// 0e7: iload 13
// 0e9: sipush 3023
// 0ec: ldc2_w 1669822394123090954
// 0ef: lload 9
// 0f1: lxor
// 0f2: invokedynamic u (IJ)I bsm=su/catlean/ti.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: iand
// 0f8: aload 15
// 0fa: lload 9
// 0fc: lconst_0
// 0fd: lcmp
// 0fe: iflt 12e
// 101: ifnonnull 12c
// 104: ifeq 11b
// 107: goto 115
// 10a: ldc2_w 7502319723393630894
// 10d: lload 9
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/ti.A F
// 119: fstore 6
// 11b: iload 13
// 11d: sipush 18082
// 120: ldc2_w 3236210617030259053
// 123: lload 9
// 125: lxor
// 126: invokedynamic u (IJ)I bsm=su/catlean/ti.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: iand
// 12c: aload 15
// 12e: lload 9
// 130: lconst_0
// 131: lcmp
// 132: iflt 162
// 135: ifnonnull 160
// 138: ifeq 14f
// 13b: goto 149
// 13e: ldc2_w 7502319723393630894
// 141: lload 9
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: aload 0
// 14a: getfield su/catlean/ti.U Z
// 14d: istore 7
// 14f: iload 13
// 151: sipush 26265
// 154: ldc2_w 5146880497268330842
// 157: lload 9
// 159: lxor
// 15a: invokedynamic u (IJ)I bsm=su/catlean/ti.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: iand
// 160: aload 15
// 162: lload 9
// 164: lconst_0
// 165: lcmp
// 166: ifle 196
// 169: ifnonnull 194
// 16c: ifeq 183
// 16f: goto 17d
// 172: ldc2_w 7502319723393630894
// 175: lload 9
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: aload 0
// 17e: getfield su/catlean/ti.q F
// 181: fstore 8
// 183: iload 13
// 185: sipush 18401
// 188: ldc2_w 4533477478310522912
// 18b: lload 9
// 18d: lxor
// 18e: invokedynamic u (IJ)I bsm=su/catlean/ti.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: iand
// 194: aload 15
// 196: lload 9
// 198: lconst_0
// 199: lcmp
// 19a: iflt 1ca
// 19d: ifnonnull 1c8
// 1a0: ifeq 1b7
// 1a3: goto 1b1
// 1a6: ldc2_w 7502319723393630894
// 1a9: lload 9
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: aload 0
// 1b2: getfield su/catlean/ti.g I
// 1b5: istore 11
// 1b7: iload 13
// 1b9: sipush 10580
// 1bc: ldc2_w 3412532520329698975
// 1bf: lload 9
// 1c1: lxor
// 1c2: invokedynamic u (IJ)I bsm=su/catlean/ti.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: iand
// 1c8: aload 15
// 1ca: ifnonnull 1f0
// 1cd: ifeq 1f2
// 1d0: goto 1de
// 1d3: ldc2_w 7502319723393630894
// 1d6: lload 9
// 1d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: athrow
// 1de: aload 0
// 1df: getfield su/catlean/ti.K I
// 1e2: goto 1f0
// 1e5: ldc2_w 7502319723393630894
// 1e8: lload 9
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: istore 12
// 1f2: aload 0
// 1f3: fload 1
// 1f4: fload 2
// 1f5: fload 3
// 1f6: fload 4
// 1f8: fload 5
// 1fa: fload 6
// 1fc: iload 7
// 1fe: fload 8
// 200: iload 11
// 202: iload 12
// 204: invokevirtual su/catlean/ti.v (FFFFFFZFII)Lsu/catlean/ti;
// 207: lload 9
// 209: lconst_0
// 20a: lcmp
// 20b: iflt 229
// 20e: ldc2_w 7499614563403986562
// 211: lload 9
// 213: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: ifnull 237
// 21b: bipush 5
// 21c: anewarray 16
// 21f: ldc2_w 7539525382911617429
// 222: lload 9
// 224: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: goto 237
// 22c: ldc2_w 7502319723393630894
// 22f: lload 9
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: areturn
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 50726334621390L;
int var3 = this.K;
int var4 = this.g;
float var5 = this.q;
boolean var6 = this.U;
float var7 = this.A;
float var8 = this.b;
float var9 = this.r;
float var10 = this.t;
float var11 = this.n;
float var12 = this.f;
return a<"v">(7621, 5280625849739169068L ^ var1)
+ var12
+ a<"v">(8781, 8030165934937305763L ^ var1)
+ var11
+ a<"v">(32160, 3494313686066736463L ^ var1)
+ var10
+ a<"v">(12222, 3200861235310427997L ^ var1)
+ var9
+ a<"v">(26106, 6361793550948840720L ^ var1)
+ var8
+ a<"v">(20203, 3609087844241153536L ^ var1)
+ var7
+ a<"v">(14522, 3147039521569826902L ^ var1)
+ var6
+ a<"v">(4427, 3195809498934460835L ^ var1)
+ var5
+ a<"v">(25963, 3550562967349835142L ^ var1)
+ var4
+ a<"v">(12189, 658731530431561599L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
long var1 = a ^ 65369997840655L;
String[] var10000 = vm.a<"Å">(-4550261096093874927L, var1);
int var4 = Float.hashCode(this.f);
var4 = var4 * b<"u">(17058, 4758707941637102975L ^ var1) + Float.hashCode(this.n);
String[] var3 = var10000;
var4 = var4 * b<"u">(28690, 4884357783662964683L ^ var1) + Float.hashCode(this.t);
var4 = var4 * b<"u">(28690, 4884357783662964683L ^ var1) + Float.hashCode(this.r);
var4 = var4 * b<"u">(28690, 4884357783662964683L ^ var1) + Float.hashCode(this.b);
var4 = var4 * b<"u">(28690, 4884357783662964683L ^ var1) + Float.hashCode(this.A);
var4 = var4 * b<"u">(28690, 4884357783662964683L ^ var1) + Boolean.hashCode(this.U);
var4 = var4 * b<"u">(28690, 4884357783662964683L ^ var1) + Float.hashCode(this.q);
var4 = var4 * b<"u">(28690, 4884357783662964683L ^ var1) + Integer.hashCode(this.g);
var4 = var4 * b<"u">(28690, 4884357783662964683L ^ var1) + Integer.hashCode(this.K);

try {
if (var3 != null) {
vm.a<"Å">(new _g[1], -4579399249192760753L, var1);
}

return var4;
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -4608605593726326087L, var1);
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
// 000: getstatic su/catlean/ti.a J
// 003: ldc2_w 136032401052370
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -9005095439812606260
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnonnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -8946487049190299292
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -8946487049190299292
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnonnull 05c
// 03c: instanceof su/catlean/ti
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -8946487049190299292
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -8946487049190299292
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/ti
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/ti.f F
// 065: aload 5
// 067: getfield su/catlean/ti.f F
// 06a: invokestatic java/lang/Float.compare (FF)I
// 06d: aload 4
// 06f: ifnonnull 09a
// 072: ifeq 08e
// 075: goto 082
// 078: ldc2_w -8946487049190299292
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -8946487049190299292
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: getfield su/catlean/ti.n F
// 092: aload 5
// 094: getfield su/catlean/ti.n F
// 097: invokestatic java/lang/Float.compare (FF)I
// 09a: aload 4
// 09c: ifnonnull 0c7
// 09f: ifeq 0bb
// 0a2: goto 0af
// 0a5: ldc2_w -8946487049190299292
// 0a8: lload 2
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w -8946487049190299292
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: getfield su/catlean/ti.t F
// 0bf: aload 5
// 0c1: getfield su/catlean/ti.t F
// 0c4: invokestatic java/lang/Float.compare (FF)I
// 0c7: aload 4
// 0c9: ifnonnull 0f4
// 0cc: ifeq 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w -8946487049190299292
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: ireturn
// 0de: ldc2_w -8946487049190299292
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: getfield su/catlean/ti.r F
// 0ec: aload 5
// 0ee: getfield su/catlean/ti.r F
// 0f1: invokestatic java/lang/Float.compare (FF)I
// 0f4: aload 4
// 0f6: ifnonnull 121
// 0f9: ifeq 115
// 0fc: goto 109
// 0ff: ldc2_w -8946487049190299292
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: bipush 0
// 10a: ireturn
// 10b: ldc2_w -8946487049190299292
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 0
// 116: getfield su/catlean/ti.b F
// 119: aload 5
// 11b: getfield su/catlean/ti.b F
// 11e: invokestatic java/lang/Float.compare (FF)I
// 121: aload 4
// 123: ifnonnull 14e
// 126: ifeq 142
// 129: goto 136
// 12c: ldc2_w -8946487049190299292
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 0
// 137: ireturn
// 138: ldc2_w -8946487049190299292
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 0
// 143: getfield su/catlean/ti.A F
// 146: aload 5
// 148: getfield su/catlean/ti.A F
// 14b: invokestatic java/lang/Float.compare (FF)I
// 14e: aload 4
// 150: ifnonnull 173
// 153: ifeq 16f
// 156: goto 163
// 159: ldc2_w -8946487049190299292
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: bipush 0
// 164: ireturn
// 165: ldc2_w -8946487049190299292
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 0
// 170: getfield su/catlean/ti.U Z
// 173: aload 4
// 175: ifnonnull 1a5
// 178: aload 5
// 17a: getfield su/catlean/ti.U Z
// 17d: if_icmpeq 199
// 180: goto 18d
// 183: ldc2_w -8946487049190299292
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: bipush 0
// 18e: ireturn
// 18f: ldc2_w -8946487049190299292
// 192: lload 2
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 0
// 19a: getfield su/catlean/ti.q F
// 19d: aload 5
// 19f: getfield su/catlean/ti.q F
// 1a2: invokestatic java/lang/Float.compare (FF)I
// 1a5: aload 4
// 1a7: ifnonnull 1ca
// 1aa: ifeq 1c6
// 1ad: goto 1ba
// 1b0: ldc2_w -8946487049190299292
// 1b3: lload 2
// 1b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: athrow
// 1ba: bipush 0
// 1bb: ireturn
// 1bc: ldc2_w -8946487049190299292
// 1bf: lload 2
// 1c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: athrow
// 1c6: aload 0
// 1c7: getfield su/catlean/ti.g I
// 1ca: aload 5
// 1cc: getfield su/catlean/ti.g I
// 1cf: aload 4
// 1d1: ifnonnull 20b
// 1d4: if_icmpeq 1f0
// 1d7: goto 1e4
// 1da: ldc2_w -8946487049190299292
// 1dd: lload 2
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: bipush 0
// 1e5: ireturn
// 1e6: ldc2_w -8946487049190299292
// 1e9: lload 2
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: aload 0
// 1f1: getfield su/catlean/ti.K I
// 1f4: aload 4
// 1f6: ifnonnull 21b
// 1f9: aload 5
// 1fb: getfield su/catlean/ti.K I
// 1fe: goto 20b
// 201: ldc2_w -8946487049190299292
// 204: lload 2
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: if_icmpeq 21a
// 20e: bipush 0
// 20f: ireturn
// 210: ldc2_w -8946487049190299292
// 213: lload 2
// 214: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: athrow
// 21a: bipush 1
// 21b: ireturn
}

public static void Y(String[] var0) {
o = var0;
}

public static String[] X() {
return o;
}

static {
long var20 = a ^ 22759677013178L;
vm.a<"Å">(null, 9008184485456575543L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "³N\u001fT]¶)\u0019?'nm\tÞd2C\u0082.\u0007\u0013Á¼¸ wìe\u008cºW\u0000\u00867x{àLrÜç|=*\u0000³¥Û¹7EõØ\u008bñÊ¦ Íbw_\u008c6»·Nã\u0002Î²\t\u0018 T#Y\u0080½?\u0086\u008a\u000f§ßFÅ\u0084×Ú Ì\u009bpß\u0010¬\u008b¹\u0014áãsabV.\u0094\u0001\u0013´ü½ïæ\u008aéöG\u009dÔ¹f Z\u00810Ó¨6_2àg|À\u009d\u001b¦ÞCvÇE%eZ\u0002¼Õ¢ù:©I\u0007 »\u0087#\u000f*ÑÇg¥ \u0019Ø\u0099K\u0015c}\u0000Ý\u001e³\u000eó\u0096XÌN»]íd\u0090 9\u0094 \u0085nä\u001e'©\tf\u008ed³µÁ\u0098T\u0080W\u0000$Þ\u0004\u009b\u0006\u0019R`ë~A\u0018Æ\u009dJI\u0001\u008a9x\u0000YñIÔj\u0084ÿþVÀ¼\u001c;Ãù";
int var17 = "³N\u001fT]¶)\u0019?'nm\tÞd2C\u0082.\u0007\u0013Á¼¸ wìe\u008cºW\u0000\u00867x{àLrÜç|=*\u0000³¥Û¹7EõØ\u008bñÊ¦ Íbw_\u008c6»·Nã\u0002Î²\t\u0018 T#Y\u0080½?\u0086\u008a\u000f§ßFÅ\u0084×Ú Ì\u009bpß\u0010¬\u008b¹\u0014áãsabV.\u0094\u0001\u0013´ü½ïæ\u008aéöG\u009dÔ¹f Z\u00810Ó¨6_2àg|À\u009d\u001b¦ÞCvÇE%eZ\u0002¼Õ¢ù:©I\u0007 »\u0087#\u000f*ÑÇg¥ \u0019Ø\u0099K\u0015c}\u0000Ý\u001e³\u000eó\u0096XÌN»]íd\u0090 9\u0094 \u0085nä\u001e'©\tf\u008ed³µÁ\u0098T\u0080W\u0000$Þ\u0004\u009b\u0006\u0019R`ë~A\u0018Æ\u009dJI\u0001\u008a9x\u0000YñIÔj\u0084ÿþVÀ¼\u001c;Ãù"
.length();
char var14 = 24;
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
c = var18;
d = new String[10];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[17];
int var3 = 0;
String var4 = "al`:®À\u0003`õj\u0094\\}¼\u001eð\u0084\u001f&ëné!|\u001fwïÐFà.Ò9|\u008fqMý\u0005ì¹<\u000eA\u0005¬Ñï(Ñé\u009aíÝ\u0013\u0093¼Ìí\u000fÃò2N\b\u008eº÷î\u0094öÂÒ\u0099\u009etÍ\u0002#»>&qK\u00034ú\u0013\u0002Ç=À\u001a\u0000%Z'FÚSkrYárÀ¦ìZ_áv1¼×\u001c\u0019Æ\u0092ô";
int var5 = "al`:®À\u0003`õj\u0094\\}¼\u001eð\u0084\u001f&ëné!|\u001fwïÐFà.Ò9|\u008fqMý\u0005ì¹<\u000eA\u0005¬Ñï(Ñé\u009aíÝ\u0013\u0093¼Ìí\u000fÃò2N\b\u008eº÷î\u0094öÂÒ\u0099\u009etÍ\u0002#»>&qK\u00034ú\u0013\u0002Ç=À\u001a\u0000%Z'FÚSkrYárÀ¦ìZ_áv1¼×\u001c\u0019Æ\u0092ô"
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
h = var6;
i = new Integer[17];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "y¬©q\u00adá\u009bB/G0*\u0015\b\u009b\u001e";
var5 = "y¬©q\u00adá\u009bB/G0*\u0015\b\u009b\u001e".length();
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

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "æ\u0083®\u0084¨[\u001b,Ô\u001bqêaí\u0015U çµbdÄÇx)Â§ûäìa±|»B5\u001fÅ\u0013¤`¸Õ\u0097\u0093\u0081\u0095\u001cæ";
var17 = "æ\u0083®\u0084¨[\u001b,Ô\u001bqêaí\u0015U çµbdÄÇx)Â§ûäìa±|»B5\u001fÅ\u0013¤`¸Õ\u0097\u0093\u0081\u0095\u001cæ".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26238;
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
throw new RuntimeException("su/catlean/ti", var10);
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
throw new RuntimeException("su/catlean/ti" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7808;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/ti", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/ti" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
