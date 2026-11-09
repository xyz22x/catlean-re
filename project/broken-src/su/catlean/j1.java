package su.catlean;

import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import org.jetbrains.annotations.NotNull;

public final class j1 {
@NotNull
private class_2960 u;
@NotNull
private class_591 X;
@NotNull
private ce K;
private double c;
private double V;
private double o;
private double H;
private double k;
private double g;
private double L;
private double Q;
private double F;
private double y;
private double a;
private double N;
private double v;
private double Y;
private double O;
private int B;
private double e;
private double U;
private double s;
private static final long b = yz.a(5678269027890003128L, 8501764410288743392L, MethodHandles.lookup().lookupClass()).a(28708935639791L);
private static final String[] d;
private static final String[] f;
private static final Map h = new HashMap(13);
private static final long[] i;
private static final Integer[] j;
private static final Map l;

public j1(@NotNull class_2960 texture, @NotNull class_591 model, char a, @NotNull ce part, short a, double x, int a, double y, double z) {
long var13 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ b;
Intrinsics.checkNotNullParameter(texture, a<"q">(31483, 1399455553115618193L ^ var13));
Intrinsics.checkNotNullParameter(model, a<"q">(5912, 4750673167367673470L ^ var13));
Intrinsics.checkNotNullParameter(part, a<"q">(18647, 693184338268932533L ^ var13));
super();
this.u = texture;
this.X = model;
this.K = part;
this.c = x;
this.V = yx;
this.o = z;
this.H = this.z();
this.k = this.z();
this.g = this.z();
this.L = this.J() * 5.0;
this.Q = this.J() * 5.0;
this.F = this.J() * 5.0;
this.y = this.L;
this.a = this.Q;
this.N = this.F;
this.v = this.J();
this.Y = this.J();
this.O = this.J();
this.e = this.c;
this.U = this.V;
this.s = this.o;
}

@NotNull
public final class_2960 S() {
return this.u;
}

public final void k(@NotNull class_2960 <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"q">(12916, 6942579736946095062L ^ ax));
this.u = <set-?>;
}

@NotNull
public final class_591 E() {
return this.X;
}

public final void g(@NotNull class_591 <set-?>, long a) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"q">(12916, 6942450299860660300L ^ ax));
this.X = <set-?>;
}

@NotNull
public final ce e() {
return this.K;
}

public final void X(@NotNull ce <set-?>, short a, char a, int a) {
long var5 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ b;
Intrinsics.checkNotNullParameter(<set-?>, a<"q">(3944, 6510289771082344002L ^ var5));
this.K = <set-?>;
}

public final double P() {
return this.c;
}

public final void C(double <set-?>) {
this.c = <set-?>;
}

public final double f() {
return this.V;
}

public final void T(double <set-?>) {
this.V = <set-?>;
}

public final double T() {
return this.o;
}

public final void Y(double <set-?>) {
this.o = <set-?>;
}

public final double z() {
return Math.random() * 0.3 - 0.15;
}

public final double J() {
return Math.random() * 5.0 - 2.5;
}

public final double j() {
return this.H;
}

public final void D(double <set-?>) {
this.H = <set-?>;
}

public final double Q() {
return this.k;
}

public final void Z(double <set-?>) {
this.k = <set-?>;
}

public final double B() {
return this.g;
}

public final void X(double <set-?>) {
this.g = <set-?>;
}

public final double i() {
return this.L;
}

public final void m(double <set-?>) {
this.L = <set-?>;
}

public final double K() {
return this.Q;
}

public final void e(double <set-?>) {
this.Q = <set-?>;
}

public final double V() {
return this.F;
}

public final void i(double <set-?>) {
this.F = <set-?>;
}

public final double W() {
return this.y;
}

public final void R(double <set-?>) {
this.y = <set-?>;
}

public final double l() {
return this.a;
}

public final void a(double <set-?>) {
this.a = <set-?>;
}

public final double r() {
return this.N;
}

public final void z(double <set-?>) {
this.N = <set-?>;
}

public final double U() {
return this.v;
}

public final void F(double <set-?>) {
this.v = <set-?>;
}

public final double A() {
return this.Y;
}

public final void W(double <set-?>) {
this.Y = <set-?>;
}

public final double F() {
return this.O;
}

public final void K(double <set-?>) {
this.O = <set-?>;
}

public final int H() {
return this.B;
}

public final void Y(int <set-?>) {
this.B = <set-?>;
}

public final double t() {
return this.e;
}

public final void A(double <set-?>) {
this.e = <set-?>;
}

public final double N() {
return this.U;
}

public final void S(double <set-?>) {
this.U = <set-?>;
}

public final double Y() {
return this.s;
}

public final void M(double <set-?>) {
this.s = <set-?>;
}

public final boolean m(char param1, int param2, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/j1.b J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 85152528298364
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 130382275975531
// 02a: lxor
// 02b: lstore 8
// 02d: dup2
// 02e: ldc2_w 80782888358980
// 031: lxor
// 032: lstore 10
// 034: pop2
// 035: aload 0
// 036: aload 0
// 037: getfield su/catlean/j1.c D
// 03a: putfield su/catlean/j1.e D
// 03d: ldc2_w 8466037773164921858
// 040: lload 4
// 042: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: aload 0
// 048: aload 0
// 049: getfield su/catlean/j1.V D
// 04c: putfield su/catlean/j1.U D
// 04f: aload 0
// 050: aload 0
// 051: getfield su/catlean/j1.o D
// 054: putfield su/catlean/j1.s D
// 057: astore 12
// 059: aload 0
// 05a: aload 0
// 05b: getfield su/catlean/j1.Q D
// 05e: putfield su/catlean/j1.a D
// 061: aload 0
// 062: aload 0
// 063: getfield su/catlean/j1.F D
// 066: putfield su/catlean/j1.N D
// 069: aload 0
// 06a: aload 0
// 06b: getfield su/catlean/j1.L D
// 06e: putfield su/catlean/j1.y D
// 071: aload 0
// 072: aload 0
// 073: getfield su/catlean/j1.k D
// 076: ldc2_w 0.08
// 079: dsub
// 07a: putfield su/catlean/j1.k D
// 07d: aload 0
// 07e: getfield su/catlean/j1.c D
// 081: aload 0
// 082: getfield su/catlean/j1.V D
// 085: ldc2_w 0.3
// 088: dsub
// 089: aload 0
// 08a: getfield su/catlean/j1.o D
// 08d: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 090: dup
// 091: sipush 2211
// 094: ldc2_w 5224936694528611742
// 097: lload 4
// 099: lxor
// 09a: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/j1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a2: astore 13
// 0a4: lload 8
// 0a6: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0a9: aload 13
// 0ab: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0ae: dup
// 0af: sipush 31398
// 0b2: ldc2_w 3565876168282007440
// 0b5: lload 4
// 0b7: lxor
// 0b8: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/j1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c0: astore 14
// 0c2: aload 0
// 0c3: aload 0
// 0c4: getfield su/catlean/j1.H D
// 0c7: ldc2_w 0.91
// 0ca: dmul
// 0cb: putfield su/catlean/j1.H D
// 0ce: aload 0
// 0cf: aload 0
// 0d0: getfield su/catlean/j1.k D
// 0d3: ldc2_w 0.98
// 0d6: dmul
// 0d7: putfield su/catlean/j1.k D
// 0da: aload 0
// 0db: aload 0
// 0dc: getfield su/catlean/j1.g D
// 0df: ldc2_w 0.91
// 0e2: dmul
// 0e3: putfield su/catlean/j1.g D
// 0e6: aload 0
// 0e7: aload 0
// 0e8: getfield su/catlean/j1.v D
// 0eb: ldc2_w 0.91
// 0ee: dmul
// 0ef: putfield su/catlean/j1.v D
// 0f2: aload 0
// 0f3: aload 0
// 0f4: getfield su/catlean/j1.Y D
// 0f7: ldc2_w 0.91
// 0fa: dmul
// 0fb: putfield su/catlean/j1.Y D
// 0fe: aload 0
// 0ff: aload 0
// 100: getfield su/catlean/j1.O D
// 103: ldc2_w 0.91
// 106: dmul
// 107: putfield su/catlean/j1.O D
// 10a: aload 14
// 10c: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 10f: instanceof net/minecraft/class_2404
// 112: aload 12
// 114: ifnonnull 163
// 117: ifeq 15e
// 11a: goto 128
// 11d: ldc2_w 8499815350910453775
// 120: lload 4
// 122: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: athrow
// 128: aload 0
// 129: ldc2_w 0.31
// 12c: putfield su/catlean/j1.k D
// 12f: aload 12
// 131: ifnull 1c4
// 134: goto 142
// 137: ldc2_w 8499815350910453775
// 13a: lload 4
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: bipush 4
// 143: anewarray 338
// 146: ldc2_w 8468174637987037113
// 149: lload 4
// 14b: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 150: goto 15e
// 153: ldc2_w 8499815350910453775
// 156: lload 4
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: aload 14
// 160: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 163: ifne 1c4
// 166: aload 0
// 167: dconst_0
// 168: putfield su/catlean/j1.k D
// 16b: aload 0
// 16c: aload 13
// 16e: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 171: i2d
// 172: dconst_1
// 173: dadd
// 174: putfield su/catlean/j1.V D
// 177: aload 0
// 178: aload 0
// 179: getfield su/catlean/j1.H D
// 17c: ldc2_w 0.8
// 17f: dmul
// 180: putfield su/catlean/j1.H D
// 183: aload 0
// 184: aload 0
// 185: getfield su/catlean/j1.g D
// 188: ldc2_w 0.8
// 18b: dmul
// 18c: putfield su/catlean/j1.g D
// 18f: aload 0
// 190: aload 0
// 191: getfield su/catlean/j1.L D
// 194: ldc -90.0
// 196: f2d
// 197: aload 0
// 198: getfield su/catlean/j1.L D
// 19b: ldc 360.0
// 19d: f2d
// 19e: drem
// 19f: dsub
// 1a0: bipush 2
// 1a1: i2d
// 1a2: ddiv
// 1a3: dadd
// 1a4: putfield su/catlean/j1.L D
// 1a7: aload 0
// 1a8: dconst_0
// 1a9: putfield su/catlean/j1.v D
// 1ac: aload 0
// 1ad: dconst_0
// 1ae: putfield su/catlean/j1.Y D
// 1b1: aload 0
// 1b2: dconst_0
// 1b3: putfield su/catlean/j1.O D
// 1b6: goto 1c4
// 1b9: ldc2_w 8499815350910453775
// 1bc: lload 4
// 1be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c3: athrow
// 1c4: lload 8
// 1c6: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1c9: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 1cc: dup
// 1cd: sipush 8102
// 1d0: ldc2_w 4557764310687122065
// 1d3: lload 4
// 1d5: lxor
// 1d6: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/j1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1de: astore 16
// 1e0: bipush 0
// 1e1: istore 17
// 1e3: aload 16
// 1e5: astore 18
// 1e7: new java/util/ArrayList
// 1ea: dup
// 1eb: invokespecial java/util/ArrayList.<init> ()V
// 1ee: checkcast java/util/Collection
// 1f1: astore 19
// 1f3: bipush 0
// 1f4: istore 20
// 1f6: aload 18
// 1f8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1fd: astore 21
// 1ff: aload 21
// 201: invokeinterface java/util/Iterator.hasNext ()Z 1
// 206: ifeq 271
// 209: aload 21
// 20b: iload 2
// 20c: ifle 219
// 20f: aload 12
// 211: ifnonnull 280
// 214: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 219: astore 22
// 21b: aload 22
// 21d: checkcast net/minecraft/class_1297
// 220: astore 23
// 222: bipush 0
// 223: istore 24
// 225: aload 23
// 227: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 22a: lload 6
// 22c: aload 23
// 22e: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 231: aload 0
// 232: getfield su/catlean/j1.c D
// 235: aload 0
// 236: getfield su/catlean/j1.V D
// 239: aload 0
// 23a: getfield su/catlean/j1.o D
// 23d: invokevirtual net/minecraft/class_243.method_1028 (DDD)D
// 240: ldc2_w 0.1
// 243: dcmpg
// 244: aload 12
// 246: ifnonnull 25b
// 249: ifge 25e
// 24c: goto 25a
// 24f: ldc2_w 8499815350910453775
// 252: lload 4
// 254: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 259: athrow
// 25a: bipush 1
// 25b: goto 25f
// 25e: bipush 0
// 25f: ifeq 1ff
// 262: aload 19
// 264: aload 22
// 266: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 26b: pop
// 26c: aload 12
// 26e: ifnull 1ff
// 271: aload 19
// 273: checkcast java/util/List
// 276: nop
// 277: iload 3
// 278: ifle 219
// 27b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 280: astore 15
// 282: aload 15
// 284: invokeinterface java/util/Iterator.hasNext ()Z 1
// 289: ifeq 2f6
// 28c: aload 15
// 28e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 293: dup
// 294: sipush 19996
// 297: ldc2_w 5191568196298789676
// 29a: lload 4
// 29c: lxor
// 29d: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/j1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2a5: checkcast net/minecraft/class_1297
// 2a8: astore 16
// 2aa: aload 0
// 2ab: getfield su/catlean/j1.c D
// 2ae: aload 16
// 2b0: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 2b3: dsub
// 2b4: dstore 17
// 2b6: aload 0
// 2b7: getfield su/catlean/j1.o D
// 2ba: aload 16
// 2bc: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 2bf: dsub
// 2c0: dstore 19
// 2c2: aload 0
// 2c3: dload 17
// 2c5: ldc2_w 0.5
// 2c8: dmul
// 2c9: putfield su/catlean/j1.H D
// 2cc: aload 0
// 2cd: iload 2
// 2ce: ifle 345
// 2d1: dload 19
// 2d3: ldc2_w 0.5
// 2d6: dmul
// 2d7: putfield su/catlean/j1.g D
// 2da: aload 12
// 2dc: ifnonnull 344
// 2df: aload 12
// 2e1: ifnull 282
// 2e4: iload 3
// 2e5: ifle 2da
// 2e8: goto 2f6
// 2eb: ldc2_w 8499815350910453775
// 2ee: lload 4
// 2f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f5: athrow
// 2f6: aload 0
// 2f7: aload 0
// 2f8: getfield su/catlean/j1.c D
// 2fb: aload 0
// 2fc: getfield su/catlean/j1.H D
// 2ff: dadd
// 300: putfield su/catlean/j1.c D
// 303: aload 0
// 304: aload 0
// 305: getfield su/catlean/j1.V D
// 308: aload 0
// 309: getfield su/catlean/j1.k D
// 30c: dadd
// 30d: putfield su/catlean/j1.V D
// 310: aload 0
// 311: aload 0
// 312: getfield su/catlean/j1.o D
// 315: aload 0
// 316: getfield su/catlean/j1.g D
// 319: dadd
// 31a: putfield su/catlean/j1.o D
// 31d: aload 0
// 31e: aload 0
// 31f: getfield su/catlean/j1.L D
// 322: aload 0
// 323: getfield su/catlean/j1.v D
// 326: dadd
// 327: putfield su/catlean/j1.L D
// 32a: aload 0
// 32b: aload 0
// 32c: getfield su/catlean/j1.Q D
// 32f: aload 0
// 330: getfield su/catlean/j1.Y D
// 333: dadd
// 334: putfield su/catlean/j1.Q D
// 337: aload 0
// 338: aload 0
// 339: getfield su/catlean/j1.F D
// 33c: aload 0
// 33d: getfield su/catlean/j1.O D
// 340: dadd
// 341: putfield su/catlean/j1.F D
// 344: aload 0
// 345: getfield su/catlean/j1.B I
// 348: istore 15
// 34a: aload 0
// 34b: iload 15
// 34d: bipush 1
// 34e: iadd
// 34f: putfield su/catlean/j1.B I
// 352: iload 15
// 354: aload 12
// 356: ifnonnull 390
// 359: getstatic su/catlean/kh.W Lsu/catlean/kh;
// 35c: lload 10
// 35e: invokevirtual su/catlean/kh.E (J)I
// 361: sipush 9933
// 364: ldc2_w 2454211769117759394
// 367: lload 4
// 369: lxor
// 36a: invokedynamic d (IJ)I bsm=su/catlean/j1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36f: imul
// 370: if_icmple 393
// 373: goto 381
// 376: ldc2_w 8499815350910453775
// 379: lload 4
// 37b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 380: athrow
// 381: bipush 1
// 382: goto 390
// 385: ldc2_w 8499815350910453775
// 388: lload 4
// 38a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38f: athrow
// 390: goto 394
// 393: bipush 0
// 394: ireturn
}

public final void N(@NotNull class_4587 stack, long a) {
ax = b ^ ax;
long var4 = ax ^ 100800047701818L;
long var6 = ax ^ 8175712305225L;
long var8 = ax ^ 90033734865956L;
long var10 = ax ^ 124316495031401L;
long var12 = ax ^ 78012023415444L;
long var10001 = ax ^ 72745278726153L;
int var14 = (int)((ax ^ 72745278726153L) >>> 48);
int var15 = (int)((ax ^ 72745278726153L) << 16 >>> 32);
int var16 = (int)(var10001 << 48 >>> 48);
long var17 = ax ^ 127049847166354L;
Intrinsics.checkNotNullParameter(stack, a<"q">(21489, 3019944783526180889L ^ ax));
String var10000 = vm.a<"Å">(-8958389782859992366L, ax);
class_4184 var51 = zf.F(var4).field_1773.method_19418();
Intrinsics.checkNotNullExpressionValue(var51, a<"q">(23933, 3919145604402296479L ^ ax));
class_4184 var36 = var51;
String var35 = var10000;

label48: {
label47: {
try {
double var57;
var48 = (var57 = this.k - 0.0) == 0.0 ? 0 : (var57 < 0.0 ? -1 : 1);
if (var35 != null) {
break label48;
}

if (!var48) {
break label47;
}
} catch (NumberFormatException var42) {
throw vm.a<"Å">(var42, -8996671928135385377L, ax);
}

var48 = 0;
break label48;
}

var48 = 1;
}

int var37 = var48;
GpuTextureView var49 = zf.F(var4).method_1531().method_4619(this.u).method_71659();
Intrinsics.checkNotNullExpressionValue(var49, a<"q">(32276, 3037785609747568120L ^ ax));
GpuTextureView var38 = var49;
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, a<"q">(18621, 6244880659780576087L ^ ax));
int var10003 = b<"d">(7920, 8357917287039146316L ^ ax);
Object var19 = null;
byte var20 = 4;
boolean var21 = false;
int var22 = var10003;
VertexFormat var23 = var10002;
g7 var39 = new g7(var6, var23, var22, var21, var20, (DefaultConstructorMarker)var19);

double var10004;
double var10005;
double var10006;
label38: {
try {
var50 = kh.W;
var52 = stack;
var53 = this.X;
var54 = var39;
var10004 = jl.y.b(var17, this.e, this.c) - (float)var36.method_71156().field_1352;
var10005 = jl.y.b(var17, this.U, this.V);
if (var37) {
var10006 = this.K.c();
break label38;
}
} catch (NumberFormatException var41) {
throw vm.a<"Å">(var41, -8996671928135385377L, ax);
}

var10006 = this.K.J();
}

var10005 = var10005 + var10006 - (float)var36.method_71156().field_1351;
var10006 = jl.y.b(var17, this.s, this.o) - (float)var36.method_71156().field_1350;
double var10007 = jl.y.b(var17, this.y, this.L) + 180.0;
double var10008 = jl.y.b(var17, this.a, this.Q);
double var10009 = jl.y.b(var17, this.N, this.F);
ce var10010 = this.K;
jl var10011 = jl.y;
Color var10012 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, a<"q">(23517, 7479801293867003964L ^ ax));
var19 = var10011.p(
var10012, (char)var14, var15, RangesKt.coerceIn(kh.W.E(var12) * b<"d">(30169, 1712064693656121956L ^ ax) - this.B, 0, 3) / 3.0F, (short)var16
);
ce var45 = var10010;
double var46 = var10009;
double var47 = var10008;
double var25 = var10007;
double var27 = var10006;
double var29 = var10005;
double var31 = var10004;
g7 var33 = var54;
class_591 var34 = var53;

try {
var50.E(var52, var10, var34, var33, var31, var29, var27, var25, var47, var46, var45, (Color)var19);
g7.R(
var8,
var39,
b6.R.m(),
null,
null,
new class_4587().method_23760().method_23761(),
null,
MapsKt.mapOf(TuplesKt.to(a<"q">(5311, 7547508048153509713L ^ ax), var38)),
b<"d">(6741, 6967068920804777451L ^ ax),
null
);
if (ax > 0L && vm.a<"Å">(-8997392954005742157L, ax) != null) {
vm.a<"Å">("xgGRIb", -8992698280001919571L, ax);
}
} catch (NumberFormatException var40) {
throw vm.a<"Å">(var40, -8996671928135385377L, ax);
}
}

static {
long var11 = b ^ 116350064207330L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[15];
int var18 = 0;
String var17 = "³{\u001f¨\u0003ª2,\u001d\u0090»,srÇD\u009c\u000b\u0090&»\u00adHrÚÑ\u000fÑß\u000b\u0093\rS:}XÀ\u0098\u0089F\u0010¢\u001bÓ\u0086ºØøG\u0088¼9È\u0092\u0016¸ì\u0010DÂ\u008eÚ\u0095àØùÄ\u0019õ¨¹3½W\u0010\u0089¾!ñ\u0017«\u0015\u008fÊ\t¤>\u001b\u0094\u0000d ×îÏÓpà7NM_m\u0019¤«ªPh¨±«ê\u000bÞ¢\u009c\u007f\u0091µ\u008dRÞ¼\u0010)%i®%\u0002bfµ\u0081ê0â{\u008c\u0099('wyyeÕ\u008bÂ°\"°lUØÖÓNJüx\u000fV¹\u00009Zîòê\u009fýÜ{¦\u0081´}.,t \u009cO×Ïô}\u0088\u0000\u0006:E×pÑCä³\u0018½X¡¬\u0083\u0015#$ÕDFS\u0011Á(\u0091\u0019tÛò\u008b´%\u0000üî#ºv¸\u008ay1\u001f\u0091u\u009dGþúIÎ`À\u0085¯¯±\\|\u008fÞ´Sn\u0010\u0092ð\u009bë\u008bÂ\u0090Q\u008b\"Hi\u0019øcí\u0018Èí½Û\u009e\u0001Ð×\u001f\u0099Àé&\fÔUÜDT¯\u001b¹s\u009d\u0010\u0011\u008b\u0005C¹ø©Y\u0083\u009e½¤\b×N¦(,¡\u008c~U\u009awÄu\u0000ûß¡%ã¢&å%-\u009fÛ é³ÅèfÁ\u0089\u0010@Í#÷c/\u0084nÅ";
int var19 = "³{\u001f¨\u0003ª2,\u001d\u0090»,srÇD\u009c\u000b\u0090&»\u00adHrÚÑ\u000fÑß\u000b\u0093\rS:}XÀ\u0098\u0089F\u0010¢\u001bÓ\u0086ºØøG\u0088¼9È\u0092\u0016¸ì\u0010DÂ\u008eÚ\u0095àØùÄ\u0019õ¨¹3½W\u0010\u0089¾!ñ\u0017«\u0015\u008fÊ\t¤>\u001b\u0094\u0000d ×îÏÓpà7NM_m\u0019¤«ªPh¨±«ê\u000bÞ¢\u009c\u007f\u0091µ\u008dRÞ¼\u0010)%i®%\u0002bfµ\u0081ê0â{\u008c\u0099('wyyeÕ\u008bÂ°\"°lUØÖÓNJüx\u000fV¹\u00009Zîòê\u009fýÜ{¦\u0081´}.,t \u009cO×Ïô}\u0088\u0000\u0006:E×pÑCä³\u0018½X¡¬\u0083\u0015#$ÕDFS\u0011Á(\u0091\u0019tÛò\u008b´%\u0000üî#ºv¸\u008ay1\u001f\u0091u\u009dGþúIÎ`À\u0085¯¯±\\|\u008fÞ´Sn\u0010\u0092ð\u009bë\u008bÂ\u0090Q\u008b\"Hi\u0019øcí\u0018Èí½Û\u009e\u0001Ð×\u001f\u0099Àé&\fÔUÜDT¯\u001b¹s\u009d\u0010\u0011\u008b\u0005C¹ø©Y\u0083\u009e½¤\b×N¦(,¡\u008c~U\u009awÄu\u0000ûß¡%ã¢&å%-\u009fÛ é³ÅèfÁ\u0089\u0010@Í#÷c/\u0084nÅ"
.length();
char var16 = '(';
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
d = var20;
f = new String[15];
l = new HashMap(13);
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
String var4 = "2ò\u0097\u008d-ï|:\u0094\u009e7±Ë\u008bN©";
int var5 = "2ò\u0097\u008d-ï|:\u0094\u009e7±Ë\u008bN©".length();
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
i = var6;
j = new Integer[4];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "¾\u008aö\u0097Ë\u009c\u008cÕßó\u0019{P~Âý";
var5 = "¾\u008aö\u0097Ë\u009c\u008cÕßó\u0019{P~Âý".length();
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

var17 = "dc\u0085 #ÁD²âMW\u001dQù\u0016Ý-\u001ba\u008b6©YÎÚ/\u0080È³à8pºê÷xqÎT\u0080Ü\u009f1uÁDOâU£+\u008cü\u0090»k\u0010ßâ\u0084&Ñ´\u008dT½\u000bÐÇù\u0012\u0083\u0094";
var19 = "dc\u0085 #ÁD²âMW\u001dQù\u0016Ý-\u001ba\u008b6©YÎÚ/\u0080È³à8pºê÷xqÎT\u0080Ü\u009f1uÁDOâU£+\u008cü\u0090»k\u0010ßâ\u0084&Ñ´\u008dT½\u000bÐÇù\u0012\u0083\u0094"
.length();
var16 = '8';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27033;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/j1", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
f[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/j1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 1485;
if (j[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/j1", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
j[var3] = var15;
}

return j[var3];
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
throw new RuntimeException("su/catlean/j1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
