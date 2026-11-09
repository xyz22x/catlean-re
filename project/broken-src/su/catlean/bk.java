package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;

public final class bk {
@NotNull
private gi L;
@NotNull
private class_243 o;
private float S;
private float G;
private int U;
@NotNull
private class_243 j;
@NotNull
private Color u;
private float i;
private float h;
private boolean R;
private final int v;
@NotNull
private class_243 m;
private float w;
private float W;
private int a;
private static String E;
private static final long b = yz.a(270678252329196635L, -7554518609380639848L, MethodHandles.lookup().lookupClass()).a(280052282091776L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map k;

public bk(
@NotNull gi tex,
@NotNull class_243 pos,
float rotationSpeed,
float scale,
int lifetime,
@NotNull class_243 velocity,
@NotNull Color color,
float gravity,
float drag,
boolean useAgeFactor,
long a
) {
ax = b ^ ax;
long var13 = ax ^ 96708512786462L;
Intrinsics.checkNotNullParameter(tex, a<"v">(28886, 3087324134013547702L ^ ax));
Intrinsics.checkNotNullParameter(pos, a<"v">(5058, 6977834250436401062L ^ ax));
Intrinsics.checkNotNullParameter(velocity, a<"v">(4596, 6949330651231180184L ^ ax));
Intrinsics.checkNotNullParameter(color, a<"v">(21619, 1095454716712390683L ^ ax));
super();
this.L = tex;
this.o = pos;
this.S = rotationSpeed;
this.G = scale;
this.U = lifetime;
this.j = velocity;
this.u = color;
this.i = gravity;
this.h = drag;
this.R = useAgeFactor;
this.v = this.U;
this.m = this.o;
this.a = mf.f(new IntRange(0, 3), false, var13, 2, null);
}

public bk(
gi var1,
class_243 var2,
float var3,
long var4,
float var6,
int var7,
class_243 var8,
Color var9,
float var10,
float var11,
boolean var12,
int var13,
DefaultConstructorMarker var14
) {
var4 = b ^ var4;
long var15 = var4 ^ 22275298021336L;
if ((var13 & b<"t">(10486, 2949522228689550998L ^ var4)) != 0) {
Color var10000 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, a<"v">(16393, 1381503776711047966L ^ var4));
var9 = var10000;
}

if ((var13 & b<"t">(15029, 8295706591558544598L ^ var4)) != 0) {
var10 = 0.03F;
}

if ((var13 & b<"t">(9088, 8532848865498510818L ^ var4)) != 0) {
var11 = 0.99F;
}

if ((var13 & b<"t">(16078, 7177765101557164207L ^ var4)) != 0) {
var12 = true;
}

this(var1, var2, var3, var6, var7, var8, var9, var10, var11, var12, var15);
}

@NotNull
public final gi h() {
return this.L;
}

public final void D(long a, @NotNull gi <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"v">(24, 6060054919676968336L ^ ax));
this.L = <set-?>;
}

@NotNull
public final class_243 r() {
return this.o;
}

public final void e(@NotNull class_243 <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"v">(31859, 4200000997216421041L ^ ax));
this.o = <set-?>;
}

public final float y() {
return this.G;
}

public final void h(float <set-?>) {
this.G = <set-?>;
}

@NotNull
public final class_243 d() {
return this.j;
}

public final void M(@NotNull class_243 <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"v">(31859, 4199930256512230004L ^ ax));
this.j = <set-?>;
}

@NotNull
public final Color k() {
return this.u;
}

public final void L(long a, @NotNull Color <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"v">(31859, 4199985500144299777L ^ ax));
this.u = <set-?>;
}

public final boolean v(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/bk.b J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 8497745605581118447
// 09: lload 1
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 0
// 10: getfield su/catlean/bk.U I
// 13: istore 4
// 15: astore 3
// 16: aload 0
// 17: iload 4
// 19: bipush -1
// 1a: iadd
// 1b: putfield su/catlean/bk.U I
// 1e: aload 0
// 1f: getfield su/catlean/bk.U I
// 22: aload 3
// 23: ifnonnull c5
// 26: ifge 42
// 29: goto 36
// 2c: ldc2_w 8469923256208175193
// 2f: lload 1
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: bipush 1
// 37: ireturn
// 38: ldc2_w 8469923256208175193
// 3b: lload 1
// 3c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41: athrow
// 42: aload 0
// 43: aload 0
// 44: getfield su/catlean/bk.o Lnet/minecraft/class_243;
// 47: putfield su/catlean/bk.m Lnet/minecraft/class_243;
// 4a: aload 0
// 4b: aload 0
// 4c: getfield su/catlean/bk.o Lnet/minecraft/class_243;
// 4f: aload 0
// 50: getfield su/catlean/bk.j Lnet/minecraft/class_243;
// 53: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 56: dup
// 57: sipush 20454
// 5a: ldc2_w 798950129936879091
// 5d: lload 1
// 5e: lxor
// 5f: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 67: putfield su/catlean/bk.o Lnet/minecraft/class_243;
// 6a: aload 0
// 6b: aload 0
// 6c: getfield su/catlean/bk.j Lnet/minecraft/class_243;
// 6f: aload 0
// 70: getfield su/catlean/bk.h F
// 73: f2d
// 74: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 77: dup
// 78: sipush 404
// 7b: ldc2_w 1419952303571370893
// 7e: lload 1
// 7f: lxor
// 80: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 88: putfield su/catlean/bk.j Lnet/minecraft/class_243;
// 8b: aload 0
// 8c: aload 0
// 8d: getfield su/catlean/bk.j Lnet/minecraft/class_243;
// 90: dconst_0
// 91: aload 0
// 92: getfield su/catlean/bk.i F
// 95: f2d
// 96: dneg
// 97: dconst_0
// 98: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 9b: dup
// 9c: sipush 30419
// 9f: ldc2_w 6531878187225806044
// a2: lload 1
// a3: lxor
// a4: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// ac: putfield su/catlean/bk.j Lnet/minecraft/class_243;
// af: aload 0
// b0: aload 0
// b1: getfield su/catlean/bk.w F
// b4: putfield su/catlean/bk.W F
// b7: aload 0
// b8: aload 0
// b9: getfield su/catlean/bk.w F
// bc: aload 0
// bd: getfield su/catlean/bk.S F
// c0: fadd
// c1: putfield su/catlean/bk.w F
// c4: bipush 0
// c5: ireturn
}

public final void f(int a, short a, @NotNull class_4587 matrices, char a, @NotNull Quaternionfc base, @NotNull g7 polygon) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 2
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
// 018: getstatic su/catlean/bk.b J
// 01b: lxor
// 01c: lstore 7
// 01e: lload 7
// 020: dup2
// 021: ldc2_w 90882704429741
// 024: lxor
// 025: lstore 9
// 027: dup2
// 028: ldc2_w 54880777940089
// 02b: lxor
// 02c: lstore 11
// 02e: dup2
// 02f: ldc2_w 2156289068041
// 032: lxor
// 033: lstore 13
// 035: dup2
// 036: ldc2_w 75458185845009
// 039: lxor
// 03a: lstore 15
// 03c: dup2
// 03d: ldc2_w 37982400214384
// 040: lxor
// 041: dup2
// 042: bipush 32
// 044: lushr
// 045: l2i
// 046: istore 17
// 048: dup2
// 049: bipush 32
// 04b: lshl
// 04c: bipush 56
// 04e: lushr
// 04f: l2i
// 050: istore 18
// 052: dup2
// 053: bipush 40
// 055: lshl
// 056: bipush 40
// 058: lushr
// 059: l2i
// 05a: istore 19
// 05c: pop2
// 05d: dup2
// 05e: ldc2_w 23617074599579
// 061: lxor
// 062: lstore 20
// 064: dup2
// 065: ldc2_w 106548219038018
// 068: lxor
// 069: lstore 22
// 06b: dup2
// 06c: ldc2_w 65369724424322
// 06f: lxor
// 070: lstore 24
// 072: dup2
// 073: ldc2_w 82653494013342
// 076: lxor
// 077: dup2
// 078: bipush 48
// 07a: lushr
// 07b: l2i
// 07c: istore 26
// 07e: dup2
// 07f: bipush 16
// 081: lshl
// 082: bipush 32
// 084: lushr
// 085: l2i
// 086: istore 27
// 088: dup2
// 089: bipush 48
// 08b: lshl
// 08c: bipush 48
// 08e: lushr
// 08f: l2i
// 090: istore 28
// 092: pop2
// 093: pop2
// 094: ldc2_w -8165226188671721298
// 097: lload 7
// 099: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: aload 3
// 09f: sipush 13022
// 0a2: ldc2_w 7659533339973766030
// 0a5: lload 7
// 0a7: lxor
// 0a8: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0b0: aload 5
// 0b2: sipush 27197
// 0b5: ldc2_w 5361350357715325799
// 0b8: lload 7
// 0ba: lxor
// 0bb: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c3: astore 29
// 0c5: aload 6
// 0c7: sipush 29703
// 0ca: ldc2_w 2098470256695643481
// 0cd: lload 7
// 0cf: lxor
// 0d0: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0d8: aload 3
// 0d9: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 0dc: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0df: aload 0
// 0e0: getfield su/catlean/bk.U I
// 0e3: i2f
// 0e4: fconst_1
// 0e5: fadd
// 0e6: aload 0
// 0e7: getfield su/catlean/bk.U I
// 0ea: i2f
// 0eb: lload 24
// 0ed: invokevirtual su/catlean/jl.T (FFJ)F
// 0f0: fstore 30
// 0f2: aload 0
// 0f3: getfield su/catlean/bk.R Z
// 0f6: ifeq 10f
// 0f9: fload 30
// 0fb: aload 0
// 0fc: getfield su/catlean/bk.v I
// 0ff: i2f
// 100: fdiv
// 101: goto 110
// 104: ldc2_w -8157581591358059752
// 107: lload 7
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: fconst_1
// 110: fstore 31
// 112: aload 0
// 113: getfield su/catlean/bk.G F
// 116: fload 31
// 118: fmul
// 119: fstore 32
// 11b: lload 9
// 11d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 120: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 123: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 126: dup
// 127: sipush 22780
// 12a: ldc2_w 820780817683784096
// 12d: lload 7
// 12f: lxor
// 130: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 138: astore 33
// 13a: aload 0
// 13b: aload 29
// 13d: ifnonnull 179
// 140: getfield su/catlean/bk.u Ljava/awt/Color;
// 143: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 146: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 149: ifeq 178
// 14c: goto 15a
// 14f: ldc2_w -8157581591358059752
// 152: lload 7
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 15d: aload 0
// 15e: getfield su/catlean/bk.U I
// 161: bipush 2
// 162: imul
// 163: lload 13
// 165: dup2_x1
// 166: pop2
// 167: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 16a: goto 17c
// 16d: ldc2_w -8157581591358059752
// 170: lload 7
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: aload 0
// 179: getfield su/catlean/bk.u Ljava/awt/Color;
// 17c: astore 34
// 17e: iload 17
// 180: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 183: aload 0
// 184: getfield su/catlean/bk.m Lnet/minecraft/class_243;
// 187: aload 0
// 188: getfield su/catlean/bk.o Lnet/minecraft/class_243;
// 18b: fconst_0
// 18c: bipush 4
// 18d: iload 18
// 18f: i2b
// 190: aconst_null
// 191: iload 19
// 193: invokestatic su/catlean/zi.n (ILsu/catlean/zi;Lnet/minecraft/class_243;Lnet/minecraft/class_243;FIBLjava/lang/Object;I)Lnet/minecraft/class_243;
// 196: aload 33
// 198: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 19b: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 19e: dup
// 19f: sipush 5775
// 1a2: ldc2_w 7942390442685099984
// 1a5: lload 7
// 1a7: lxor
// 1a8: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b0: astore 35
// 1b2: aload 3
// 1b3: aload 35
// 1b5: getfield net/minecraft/class_243.field_1352 D
// 1b8: aload 35
// 1ba: getfield net/minecraft/class_243.field_1351 D
// 1bd: aload 35
// 1bf: getfield net/minecraft/class_243.field_1350 D
// 1c2: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 1c5: aload 3
// 1c6: lload 20
// 1c8: aload 5
// 1ca: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 1cd: aload 0
// 1ce: getfield su/catlean/bk.w F
// 1d1: fconst_0
// 1d2: fcmpg
// 1d3: aload 29
// 1d5: ifnonnull 1ea
// 1d8: ifne 1ed
// 1db: goto 1e9
// 1de: ldc2_w -8157581591358059752
// 1e1: lload 7
// 1e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: athrow
// 1e9: bipush 1
// 1ea: goto 1ee
// 1ed: bipush 0
// 1ee: iload 4
// 1f0: iflt 1fc
// 1f3: ifne 26b
// 1f6: aload 0
// 1f7: getfield su/catlean/bk.W F
// 1fa: fconst_0
// 1fb: fcmpg
// 1fc: aload 29
// 1fe: ifnonnull 221
// 201: goto 20f
// 204: ldc2_w -8157581591358059752
// 207: lload 7
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: ifne 224
// 212: goto 220
// 215: ldc2_w -8157581591358059752
// 218: lload 7
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: bipush 1
// 221: goto 225
// 224: bipush 0
// 225: ifne 26b
// 228: aload 3
// 229: getstatic net/minecraft/class_7833.field_40718 Lnet/minecraft/class_7833;
// 22c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 22f: aload 0
// 230: getfield su/catlean/bk.W F
// 233: aload 0
// 234: getfield su/catlean/bk.w F
// 237: lload 24
// 239: invokevirtual su/catlean/jl.T (FFJ)F
// 23c: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 241: dup
// 242: sipush 3887
// 245: ldc2_w 4790551904630044280
// 248: lload 7
// 24a: lxor
// 24b: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 253: checkcast org/joml/Quaternionfc
// 256: lload 20
// 258: dup2_x1
// 259: pop2
// 25a: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 25d: goto 26b
// 260: ldc2_w -8157581591358059752
// 263: lload 7
// 265: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: athrow
// 26b: aload 3
// 26c: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 26f: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 272: dup
// 273: sipush 15387
// 276: ldc2_w 4678817934342767949
// 279: lload 7
// 27b: lxor
// 27c: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/bk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 281: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 284: astore 36
// 286: aload 0
// 287: getfield su/catlean/bk.R Z
// 28a: ifne 29d
// 28d: aload 34
// 28f: goto 2af
// 292: ldc2_w -8157581591358059752
// 295: lload 7
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2a0: aload 34
// 2a2: iload 26
// 2a4: i2c
// 2a5: iload 27
// 2a7: fload 31
// 2a9: iload 28
// 2ab: i2s
// 2ac: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 2af: astore 37
// 2b1: aload 0
// 2b2: getfield su/catlean/bk.L Lsu/catlean/gi;
// 2b5: invokevirtual su/catlean/gi.o ()F
// 2b8: fstore 38
// 2ba: aload 0
// 2bb: getfield su/catlean/bk.L Lsu/catlean/gi;
// 2be: invokevirtual su/catlean/gi.L ()F
// 2c1: fstore 39
// 2c3: aload 0
// 2c4: getfield su/catlean/bk.L Lsu/catlean/gi;
// 2c7: invokevirtual su/catlean/gi.v ()F
// 2ca: fstore 40
// 2cc: aload 0
// 2cd: getfield su/catlean/bk.L Lsu/catlean/gi;
// 2d0: invokevirtual su/catlean/gi.w ()F
// 2d3: fstore 41
// 2d5: aload 3
// 2d6: fload 32
// 2d8: fneg
// 2d9: f2d
// 2da: ldc2_w 2.0
// 2dd: ddiv
// 2de: fload 32
// 2e0: fneg
// 2e1: f2d
// 2e2: ldc2_w 2.0
// 2e5: ddiv
// 2e6: ldc2_w -0.01
// 2e9: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 2ec: nop
// 2ed: aload 6
// 2ef: aload 36
// 2f1: fconst_0
// 2f2: lload 15
// 2f4: fload 32
// 2f6: fconst_0
// 2f7: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2fa: fload 39
// 2fc: lload 22
// 2fe: fload 40
// 300: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 303: aload 37
// 305: lload 11
// 307: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 30a: pop
// 30b: aload 6
// 30d: aload 36
// 30f: fload 32
// 311: lload 15
// 313: fload 32
// 315: fconst_0
// 316: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 319: fload 38
// 31b: lload 22
// 31d: fload 40
// 31f: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 322: aload 37
// 324: lload 11
// 326: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 329: pop
// 32a: aload 6
// 32c: aload 36
// 32e: fload 32
// 330: lload 15
// 332: fconst_0
// 333: fconst_0
// 334: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 337: fload 38
// 339: lload 22
// 33b: fload 41
// 33d: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 340: aload 37
// 342: lload 11
// 344: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 347: pop
// 348: aload 6
// 34a: aload 36
// 34c: fconst_0
// 34d: lload 15
// 34f: fconst_0
// 350: fconst_0
// 351: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 354: fload 39
// 356: lload 22
// 358: fload 41
// 35a: invokevirtual su/catlean/g7.j (FJF)Lsu/catlean/g7;
// 35d: aload 37
// 35f: lload 11
// 361: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 364: pop
// 365: aload 3
// 366: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 369: ldc2_w -8163372723616378844
// 36c: lload 7
// 36e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 373: iload 4
// 375: iflt 37f
// 378: ifnull 397
// 37b: bipush 5
// 37c: anewarray 200
// 37f: ldc2_w -8144662575859778481
// 382: lload 7
// 384: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 389: goto 397
// 38c: ldc2_w -8157581591358059752
// 38f: lload 7
// 391: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: athrow
// 397: return
}

public static void s(String var0) {
E = var0;
}

public static String G() {
return E;
}

static {
long var20 = b ^ 53591139172290L;
vm.a<"Å">("ryXZi", 1051447840270442886L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[17];
int var16 = 0;
String var15 = "çÙ\u0093Ða\u001d7mpÓoÊfã(I\u0018ÃÔÃ§V\u0006ãµ\u0087UßþÄ\u0004\u0018\u0004~fU»qäy\u0012(\u0092¬\u009b\u0090ÉW \u008dòRæÞ\u00adÇ3)ÕÄ«ë\u0002ó>gþ%\u0019\u0094Å\u009b\u0091xa+t:kTÕ{\u00100\n,ÛfÌ)\u0084¨\u0086\u0006\u0090FvÉ\u007f\u0010å¹[\u0000J\u0090ö\u0003`\u0083{\u0092\u0094\u0017Ë¤\u0010b¼|tÆ«\u000b\n®rõ\u000eÓÏÛU Õó\u008bQÞ\u0095\u0004\u0018\u009089\u0087¦iÛ¬ÙäÕô:ªAþe\"¼I7A1Ï\u0010tûVðyµÁùe·ÍN\u0096É\u0083Û ì\\AûÐß°!õ\u0093çJWn\u0010m\u0003'ï\u0083Ól%yç¸ÊÚË\u0089Dz(Ý\n\u0011ï\u0081kê\u0015\u009e°êü©§ó\u0097\u000f9\rØ\u001dç1y\u0097\u008e!x\u000fbÐîÿ,i\u0092ÕÅÁ\u0089 \u0006{\u0000Í pÝ¨\u0092n»9ï\n]\u0099¼[Óc´Ëx¹H\u0017\u0090àÃ\fEJ [)ÌÂ\u009e´o\u001e2éÒYù¡¯\u0011\r=\u0094îÙÑ\u0006\u0083»wÖ8\u008dÛçñ\u0010\u0093\u0014\u000bL[F\u0001¿ýÊ+`'|&½\u0010\u001cyîX¥\u008f×yé@1DÖUc\u001a Äk\u009e\u00957\u001d³(\u0004'¥\n3\u009aù\u009fl\fÈß\u0091}u©\u0099ð\u00029ã\u009dµo";
int var17 = "çÙ\u0093Ða\u001d7mpÓoÊfã(I\u0018ÃÔÃ§V\u0006ãµ\u0087UßþÄ\u0004\u0018\u0004~fU»qäy\u0012(\u0092¬\u009b\u0090ÉW \u008dòRæÞ\u00adÇ3)ÕÄ«ë\u0002ó>gþ%\u0019\u0094Å\u009b\u0091xa+t:kTÕ{\u00100\n,ÛfÌ)\u0084¨\u0086\u0006\u0090FvÉ\u007f\u0010å¹[\u0000J\u0090ö\u0003`\u0083{\u0092\u0094\u0017Ë¤\u0010b¼|tÆ«\u000b\n®rõ\u000eÓÏÛU Õó\u008bQÞ\u0095\u0004\u0018\u009089\u0087¦iÛ¬ÙäÕô:ªAþe\"¼I7A1Ï\u0010tûVðyµÁùe·ÍN\u0096É\u0083Û ì\\AûÐß°!õ\u0093çJWn\u0010m\u0003'ï\u0083Ól%yç¸ÊÚË\u0089Dz(Ý\n\u0011ï\u0081kê\u0015\u009e°êü©§ó\u0097\u000f9\rØ\u001dç1y\u0097\u008e!x\u000fbÐîÿ,i\u0092ÕÅÁ\u0089 \u0006{\u0000Í pÝ¨\u0092n»9ï\n]\u0099¼[Óc´Ëx¹H\u0017\u0090àÃ\fEJ [)ÌÂ\u009e´o\u001e2éÒYù¡¯\u0011\r=\u0094îÙÑ\u0006\u0083»wÖ8\u008dÛçñ\u0010\u0093\u0014\u000bL[F\u0001¿ýÊ+`'|&½\u0010\u001cyîX¥\u008f×yé@1DÖUc\u001a Äk\u009e\u00957\u001d³(\u0004'¥\n3\u009aù\u009fl\fÈß\u0091}u©\u0099ð\u00029ã\u009dµo"
.length();
char var14 = 16;
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
d = new String[17];
k = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "`_íGÊ\u0096\u0004µÂ\u0001ë\n<Åêp";
int var5 = "`_íGÊ\u0096\u0004µÂ\u0001ë\n<Åêp".length();
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

var4 = "\u0002Ð¢¹7ÝÃ\u0007\u0012©î\u0093Í8&^";
var5 = "\u0002Ð¢¹7ÝÃ\u0007\u0012©î\u0093Í8&^".length();
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

var15 = "@\u009cí\u0097k½C\u0015TÑc©d1¼B VØ\n«ú®\u00862²;\u00adsoÒÝ;>ô/\u001aJZö«\u0003Õê±`Ú\u0090ï";
var17 = "@\u009cí\u0097k½C\u0015TÑc©d1¼B VØ\n«ú®\u00862²;\u00adsoÒÝ;>ô/\u001aJZö«\u0003Õê±`Ú\u0090ï".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30394;
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
throw new RuntimeException("su/catlean/bk", var10);
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
throw new RuntimeException("su/catlean/bk" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 23496;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])k.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/bk", var14);
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
throw new RuntimeException("su/catlean/bk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
