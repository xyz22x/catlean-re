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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class l1 {
@NotNull
private final String m;
@NotNull
private final String Z;
@NotNull
private final ys u;
private final int l;
@Nullable
private final class_1799 H;
private float K;
@NotNull
private final fd n;
private final float j;
@NotNull
private final bg M;
@NotNull
private final bj D;
private static final long a = yz.a(-434578291666565723L, -4364688058005122557L, MethodHandles.lookup().lookupClass()).a(115184548285271L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long h;

public l1(@NotNull String title, @NotNull String message, @NotNull ys type, long a, int time, int a, @Nullable class_1799 item) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 4
// 002: bipush 32
// 004: lshl
// 005: iload 7
// 007: i2l
// 008: bipush 32
// 00a: lshl
// 00b: bipush 32
// 00d: lushr
// 00e: lor
// 00f: getstatic su/catlean/l1.a J
// 012: lxor
// 013: lstore 9
// 015: lload 9
// 017: dup2
// 018: ldc2_w 96993752121758
// 01b: lxor
// 01c: lstore 11
// 01e: dup2
// 01f: ldc2_w 69450608377619
// 022: lxor
// 023: lstore 13
// 025: dup2
// 026: ldc2_w 10324329021621
// 029: lxor
// 02a: lstore 15
// 02c: dup2
// 02d: ldc2_w 72414822662628
// 030: lxor
// 031: lstore 17
// 033: pop2
// 034: aload 1
// 035: sipush 27541
// 038: ldc2_w 5983114357484211980
// 03b: lload 9
// 03d: lxor
// 03e: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/l1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 046: aload 2
// 047: sipush 27000
// 04a: ldc2_w 8016737805585010152
// 04d: lload 9
// 04f: lxor
// 050: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/l1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 058: aload 3
// 059: sipush 5418
// 05c: ldc2_w 4880664008218259890
// 05f: lload 9
// 061: lxor
// 062: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/l1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06a: aload 0
// 06b: invokespecial java/lang/Object.<init> ()V
// 06e: aload 0
// 06f: aload 1
// 070: putfield su/catlean/l1.m Ljava/lang/String;
// 073: aload 0
// 074: aload 2
// 075: putfield su/catlean/l1.Z Ljava/lang/String;
// 078: aload 0
// 079: aload 3
// 07a: putfield su/catlean/l1.u Lsu/catlean/ys;
// 07d: aload 0
// 07e: iload 6
// 080: putfield su/catlean/l1.l I
// 083: aload 0
// 084: aload 8
// 086: putfield su/catlean/l1.H Lnet/minecraft/class_1799;
// 089: ldc2_w -2518279256218586058
// 08c: lload 9
// 08e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: aload 0
// 094: lload 11
// 096: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 099: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 09c: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 09f: i2f
// 0a0: fconst_2
// 0a1: fdiv
// 0a2: ldc 41.0
// 0a4: fadd
// 0a5: putfield su/catlean/l1.K F
// 0a8: aload 0
// 0a9: new su/catlean/fd
// 0ac: dup
// 0ad: getstatic su/catlean/_s.OUT_BACK Lsu/catlean/_s;
// 0b0: getstatic su/catlean/l1.h J
// 0b3: lload 13
// 0b5: invokespecial su/catlean/fd.<init> (Lsu/catlean/_s;JJ)V
// 0b8: putfield su/catlean/l1.n Lsu/catlean/fd;
// 0bb: astore 19
// 0bd: aload 0
// 0be: lload 17
// 0c0: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 0c3: aload 0
// 0c4: aload 19
// 0c6: ifnull 0f9
// 0c9: getfield su/catlean/l1.H Lnet/minecraft/class_1799;
// 0cc: ifnonnull 0f8
// 0cf: goto 0dd
// 0d2: ldc2_w -2484439753966410472
// 0d5: lload 9
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: aload 0
// 0de: getfield su/catlean/l1.m Ljava/lang/String;
// 0e1: aload 0
// 0e2: getfield su/catlean/l1.Z Ljava/lang/String;
// 0e5: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001 \u0001" ]
// 0ea: goto 0fc
// 0ed: ldc2_w -2484439753966410472
// 0f0: lload 9
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: aload 0
// 0f9: getfield su/catlean/l1.Z Ljava/lang/String;
// 0fc: lload 15
// 0fe: dup2_x1
// 0ff: pop2
// 100: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 103: ldc 20.0
// 105: fadd
// 106: putfield su/catlean/l1.j F
// 109: aload 0
// 10a: new su/catlean/bg
// 10d: dup
// 10e: invokespecial su/catlean/bg.<init> ()V
// 111: putfield su/catlean/l1.M Lsu/catlean/bg;
// 114: aload 0
// 115: aload 0
// 116: getfield su/catlean/l1.u Lsu/catlean/ys;
// 119: getstatic su/catlean/jc.L [I
// 11c: swap
// 11d: invokevirtual su/catlean/ys.ordinal ()I
// 120: iaload
// 121: tableswitch 104 1 6 39 59 68 77 86 95
// 148: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 14b: invokevirtual su/catlean/sg.A ()Lsu/catlean/bj;
// 14e: goto 191
// 151: ldc2_w -2484439753966410472
// 154: lload 9
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 15f: invokevirtual su/catlean/sg.C ()Lsu/catlean/bj;
// 162: goto 191
// 165: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 168: invokevirtual su/catlean/sg.B ()Lsu/catlean/bj;
// 16b: goto 191
// 16e: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 171: invokevirtual su/catlean/sg.g ()Lsu/catlean/bj;
// 174: goto 191
// 177: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 17a: invokevirtual su/catlean/sg.L ()Lsu/catlean/bj;
// 17d: goto 191
// 180: getstatic su/catlean/sg.H Lsu/catlean/sg;
// 183: invokevirtual su/catlean/sg.x ()Lsu/catlean/bj;
// 186: goto 191
// 189: new kotlin/NoWhenBranchMatchedException
// 18c: dup
// 18d: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 190: athrow
// 191: putfield su/catlean/l1.D Lsu/catlean/bj;
// 194: iload 7
// 196: ifgt 1ac
// 199: aload 19
// 19b: ifnonnull 1ba
// 19e: bipush 5
// 19f: anewarray 201
// 1a2: ldc2_w -2454193623761037363
// 1a5: lload 9
// 1a7: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: goto 1ba
// 1af: ldc2_w -2484439753966410472
// 1b2: lload 9
// 1b4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: athrow
// 1ba: return
}

public l1(long var1, String var3, String var4, ys var5, int var6, class_1799 var7, int var8, DefaultConstructorMarker var9) {
var1 = a ^ var1;
long var10 = (var1 ^ 86368345845300L) >>> 32;
int var12 = (int)((var1 ^ 86368345845300L) << 32 >>> 32);
if ((var8 & b<"j">(118, 8859995594290037122L ^ var1)) != 0) {
var7 = null;
}

this(var3, var4, var5, var10, var6, var12, var7);
}

@NotNull
public final String B() {
return this.m;
}

@NotNull
public final String S() {
return this.Z;
}

@NotNull
public final ys v() {
return this.u;
}

public final int h() {
return this.l;
}

@Nullable
public final class_1799 i() {
return this.H;
}

public final float w() {
return this.K;
}

public final void L(float <set-?>) {
this.K = <set-?>;
}

@NotNull
public final fd L() {
return this.n;
}

public final float a() {
return this.j;
}

@NotNull
public final bg f() {
return this.M;
}

@NotNull
public final bj O() {
return this.D;
}

public final boolean X(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 120140329046795L;
return this.M.c(this.l, var3);
}

@NotNull
public final String V() {
return this.m;
}

@NotNull
public final String Z() {
return this.Z;
}

@NotNull
public final ys Q() {
return this.u;
}

public final int U() {
return this.l;
}

@Nullable
public final class_1799 z() {
return this.H;
}

@NotNull
public final l1 q(long a, @NotNull String title, @NotNull String message, @NotNull ys type, int time, @Nullable class_1799 item) {
ax = a ^ ax;
long var8 = (ax ^ 63399052539804L) >>> 32;
int var10 = (int)((ax ^ 63399052539804L) << 32 >>> 32);
Intrinsics.checkNotNullParameter(title, a<"v">(21046, 2158608121934965826L ^ ax));
Intrinsics.checkNotNullParameter(message, a<"v">(32267, 4462454880557809790L ^ ax));
Intrinsics.checkNotNullParameter(type, a<"v">(14348, 6182076072567604863L ^ ax));
return new l1(title, message, type, var8, time, var10, item);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public static l1 U(l1 var0, String var1, String var2, ys var3, int var4, long var5, class_1799 var7, int var8, Object var9) {
var5 = a ^ var5;
long var10 = var5 ^ 2931438549173L;
String var12 = vm.a<"Å">(-3304378407952827617L, var5);

int var10000;
label89: {
label88: {
try {
var10000 = var8 & 1;
if (var12 == null) {
break label89;
}

if (var10000 == 0) {
break label88;
}
} catch (NoWhenBranchMatchedException var18) {
throw vm.a<"Å">(var18, -3266160625400534479L, var5);
}

var1 = var0.m;
}

var10000 = var8 & 2;
}

String var10001;
label80: {
label79: {
label78: {
try {
var10001 = var12;
if (var5 <= 0L) {
break label80;
}

if (var12 == null) {
break label79;
}

if (var10000 == 0) {
break label78;
}
} catch (NoWhenBranchMatchedException var17) {
throw vm.a<"Å">(var17, -3266160625400534479L, var5);
}

var2 = var0.Z;
}

var10000 = var8 & 4;
}

try {
var10001 = var12;
} catch (NoWhenBranchMatchedException var14) {
throw vm.a<"Å">(var14, -3266160625400534479L, var5);
}
}

label67: {
label66: {
label65: {
try {
if (var5 <= 0L) {
break label67;
}

if (var10001 == null) {
break label66;
}

if (var10000 == 0) {
break label65;
}
} catch (NoWhenBranchMatchedException var16) {
throw vm.a<"Å">(var16, -3266160625400534479L, var5);
}

var3 = var0.u;
}

var10000 = var8 & b<"j">(3319, 4113175482132889960L ^ var5);
}

try {
var10001 = var12;
} catch (NoWhenBranchMatchedException var13) {
throw vm.a<"Å">(var13, -3266160625400534479L, var5);
}
}

label54: {
label53: {
try {
if (var10001 == null) {
break label54;
}

if (var10000 == 0) {
break label53;
}
} catch (NoWhenBranchMatchedException var15) {
throw vm.a<"Å">(var15, -3266160625400534479L, var5);
}

var4 = var0.l;
}

var10000 = var8 & b<"j">(11048, 5592933436115723958L ^ var5);
}

if (var10000 != 0) {
var7 = var0.H;
}

return var0.q(var10, var1, var2, var3, var4, var7);
}

@NotNull
@Override
public String toString() {
long var1 = a ^ 122184332516931L;
class_1799 var3 = this.H;
int var4 = this.l;
ys var5 = this.u;
String var6 = this.Z;
String var7 = this.m;
return a<"v">(8957, 7688004022641043843L ^ var1)
+ var7
+ a<"v">(5838, 8295122315246083505L ^ var1)
+ var6
+ a<"v">(19315, 1959861221949685761L ^ var1)
+ var5
+ a<"v">(18299, 8388232838778833921L ^ var1)
+ var4
+ a<"v">(7888, 1829148710839391649L ^ var1)
+ var3
+ ")";
}

@Override
public int hashCode() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/l1.a J
// 03: ldc2_w 133414986256989
// 06: lxor
// 07: lstore 1
// 08: ldc2_w 9147770631638063048
// 0b: lload 1
// 0c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 0
// 12: getfield su/catlean/l1.m Ljava/lang/String;
// 15: invokevirtual java/lang/String.hashCode ()I
// 18: istore 4
// 1a: iload 4
// 1c: sipush 12821
// 1f: ldc2_w 8256801297551397726
// 22: lload 1
// 23: lxor
// 24: invokedynamic j (IJ)I bsm=su/catlean/l1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: imul
// 2a: aload 0
// 2b: getfield su/catlean/l1.Z Ljava/lang/String;
// 2e: invokevirtual java/lang/String.hashCode ()I
// 31: iadd
// 32: istore 4
// 34: astore 3
// 35: iload 4
// 37: sipush 24104
// 3a: ldc2_w 5291903933920345957
// 3d: lload 1
// 3e: lxor
// 3f: invokedynamic j (IJ)I bsm=su/catlean/l1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: imul
// 45: aload 0
// 46: getfield su/catlean/l1.u Lsu/catlean/ys;
// 49: invokevirtual su/catlean/ys.hashCode ()I
// 4c: iadd
// 4d: istore 4
// 4f: iload 4
// 51: sipush 24104
// 54: ldc2_w 5291903933920345957
// 57: lload 1
// 58: lxor
// 59: invokedynamic j (IJ)I bsm=su/catlean/l1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: imul
// 5f: aload 0
// 60: getfield su/catlean/l1.l I
// 63: invokestatic java/lang/Integer.hashCode (I)I
// 66: iadd
// 67: istore 4
// 69: iload 4
// 6b: sipush 24104
// 6e: ldc2_w 5291903933920345957
// 71: lload 1
// 72: lxor
// 73: invokedynamic j (IJ)I bsm=su/catlean/l1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: imul
// 79: aload 0
// 7a: getfield su/catlean/l1.H Lnet/minecraft/class_1799;
// 7d: aload 3
// 7e: ifnull a3
// 81: ifnonnull 9f
// 84: goto 91
// 87: ldc2_w 9113967894008137446
// 8a: lload 1
// 8b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90: athrow
// 91: bipush 0
// 92: goto a6
// 95: ldc2_w 9113967894008137446
// 98: lload 1
// 99: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e: athrow
// 9f: aload 0
// a0: getfield su/catlean/l1.H Lnet/minecraft/class_1799;
// a3: invokevirtual net/minecraft/class_1799.hashCode ()I
// a6: iadd
// a7: istore 4
// a9: iload 4
// ab: ireturn
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
// 000: getstatic su/catlean/l1.a J
// 003: ldc2_w 68988796377011
// 006: lxor
// 007: lstore 2
// 008: ldc2_w -352073495097175514
// 00b: lload 2
// 00c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: astore 4
// 013: aload 0
// 014: aload 4
// 016: ifnull 037
// 019: aload 1
// 01a: if_acmpne 036
// 01d: goto 02a
// 020: ldc2_w -318323551238814968
// 023: lload 2
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: bipush 1
// 02b: ireturn
// 02c: ldc2_w -318323551238814968
// 02f: lload 2
// 030: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: athrow
// 036: aload 1
// 037: aload 4
// 039: ifnull 05c
// 03c: instanceof su/catlean/l1
// 03f: ifne 05b
// 042: goto 04f
// 045: ldc2_w -318323551238814968
// 048: lload 2
// 049: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: athrow
// 04f: bipush 0
// 050: ireturn
// 051: ldc2_w -318323551238814968
// 054: lload 2
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: aload 1
// 05c: checkcast su/catlean/l1
// 05f: astore 5
// 061: aload 0
// 062: getfield su/catlean/l1.m Ljava/lang/String;
// 065: aload 5
// 067: getfield su/catlean/l1.m Ljava/lang/String;
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06d: aload 4
// 06f: ifnull 0ac
// 072: ifne 08e
// 075: goto 082
// 078: ldc2_w -318323551238814968
// 07b: lload 2
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: bipush 0
// 083: ireturn
// 084: ldc2_w -318323551238814968
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: aload 4
// 091: ifnull 0bc
// 094: getfield su/catlean/l1.Z Ljava/lang/String;
// 097: aload 5
// 099: getfield su/catlean/l1.Z Ljava/lang/String;
// 09c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09f: goto 0ac
// 0a2: ldc2_w -318323551238814968
// 0a5: lload 2
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: ifne 0bb
// 0af: bipush 0
// 0b0: ireturn
// 0b1: ldc2_w -318323551238814968
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: aload 4
// 0be: ifnull 0e6
// 0c1: getfield su/catlean/l1.u Lsu/catlean/ys;
// 0c4: aload 5
// 0c6: getfield su/catlean/l1.u Lsu/catlean/ys;
// 0c9: if_acmpeq 0e5
// 0cc: goto 0d9
// 0cf: ldc2_w -318323551238814968
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: bipush 0
// 0da: ireturn
// 0db: ldc2_w -318323551238814968
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: aload 0
// 0e6: getfield su/catlean/l1.l I
// 0e9: aload 4
// 0eb: ifnull 11b
// 0ee: aload 5
// 0f0: getfield su/catlean/l1.l I
// 0f3: if_icmpeq 10f
// 0f6: goto 103
// 0f9: ldc2_w -318323551238814968
// 0fc: lload 2
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: bipush 0
// 104: ireturn
// 105: ldc2_w -318323551238814968
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: aload 0
// 110: getfield su/catlean/l1.H Lnet/minecraft/class_1799;
// 113: aload 5
// 115: getfield su/catlean/l1.H Lnet/minecraft/class_1799;
// 118: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 11b: aload 4
// 11d: ifnull 13d
// 120: ifne 13c
// 123: goto 130
// 126: ldc2_w -318323551238814968
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: bipush 0
// 131: ireturn
// 132: ldc2_w -318323551238814968
// 135: lload 2
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: bipush 1
// 13d: ireturn
}

static {
long var16 = a ^ 59311624386931L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[11];
int var23 = 0;
String var22 = "\u0086¾ Ô\u00ad¦\u001c¤äê\u0085\u008eÁmF*\u0010æ_\u009e\u0002ð\u0098/Ì£é\u0083ë#z£Y\u0010é\":Ãdð'_WPÅbÆ\u0085\u008a,\u0010BÄK\u0094åi\u009d¾Ô=cv!R{Ë\u0010\u0014¾\u0001v\u008cmÝX3Ëú\u008c)ü¬r\u0010VT*XK\u0084\u0098ìp\u008bú Ú\nÂÚ(çW\u0001T\u0084Ë¯ÑèJ\tJ\u0007,\u008f\u0005h\u001c1\u000fÉûÖÚBpS\u0010ürÚ)\u009eÆÞXp[\u0093ú\u0018Ñë¼\\ò$»råÁ?ÄyÆ\u0001\u0006þÒ<\u0016£¨´,\u00103\u0087Ó·ú\u008b-\to\nX\u0095\n\u0019VÇ";
int var24 = "\u0086¾ Ô\u00ad¦\u001c¤äê\u0085\u008eÁmF*\u0010æ_\u009e\u0002ð\u0098/Ì£é\u0083ë#z£Y\u0010é\":Ãdð'_WPÅbÆ\u0085\u008a,\u0010BÄK\u0094åi\u009d¾Ô=cv!R{Ë\u0010\u0014¾\u0001v\u008cmÝX3Ëú\u008c)ü¬r\u0010VT*XK\u0084\u0098ìp\u008bú Ú\nÂÚ(çW\u0001T\u0084Ë¯ÑèJ\tJ\u0007,\u008f\u0005h\u001c1\u000fÉûÖÚBpS\u0010ürÚ)\u009eÆÞXp[\u0093ú\u0018Ñë¼\\ò$»råÁ?ÄyÆ\u0001\u0006þÒ<\u0016£¨´,\u00103\u0087Ó·ú\u008b-\to\nX\u0095\n\u0019VÇ"
.length();
char var21 = 16;
int var29 = -1;

label64:
while (true) {
String var30 = var22.substring(++var29, var29 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var43;
if ((var29 += var21) >= var24) {
b = var25;
c = new String[11];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[5];
int var8 = 0;
String var9 = "!y4.Y-\u0015\u0015\u0092øÑ\u0081]9\u0088Ô\u0094yBe\u009daîÃ";
int var10 = "!y4.Y-\u0015\u0015\u0092øÑ\u0081]9\u0088Ô\u0094yBe\u009daîÃ".length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var33 = var11;
var10001 = var8++;
long var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var52 = -1;

while (true) {
long var13 = var47;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var55 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var52) {
case 0:
var33[var10001] = var55;
if (var7 >= var10) {
e = var11;
f = new Integer[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -3308355504668934061L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var50 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var41 = -1;
h = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "£\u0014÷\u0018\u0011'O^\u009a×m±Ü?ùÃ";
var10 = "£\u0014÷\u0018\u0011'O^\u009a×m±Ü?ùÃ".length();
var7 = 0;
}

byte var40 = var7;
var7 += 8;
var12 = var9.substring(var40, var7).getBytes("ISO-8859-1");
var33 = var11;
var10001 = var8++;
var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var52 = 0;
}
}
}

var21 = var22.charAt(var29);
break;
default:
var25[var23++] = var43;
if ((var29 += var21) < var24) {
var21 = var22.charAt(var29);
continue label64;
}

var22 = "þåkx\u0081Ö\u0089ªõ\u000b\u0083S\u0099D\r|\u0010ê'µÉtß«\u0017\u0012\u0015³Á\u0080nØp";
var24 = "þåkx\u0081Ö\u0089ªõ\u000b\u0083S\u0099D\r|\u0010ê'µÉtß«\u0017\u0012\u0015³Á\u0080nØp".length();
var21 = 16;
var29 = -1;
}

var30 = var22.substring(++var29, var29 + var21);
var10001 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30799;
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
throw new RuntimeException("su/catlean/l1", var10);
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
throw new RuntimeException("su/catlean/l1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24160;
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
throw new RuntimeException("su/catlean/l1", var14);
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
throw new RuntimeException("su/catlean/l1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
