package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class rf extends ru {
@NotNull
private final a1 N;
private boolean p;
@NotNull
private final fd x;
@NotNull
private List u;
private float b;
private boolean O;
private static final long d = yz.a(-7932014170667442152L, 84409540271182523L, MethodHandles.lookup().lookupClass()).a(114073669680644L);
private static final String[] e;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] k;
private static final Map l;
private static final long m;

public rf(short a, char a, @NotNull a1 setting, int a) {
long var5 = ((long)a << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ d;
long var7 = var5 ^ 72914735297618L;
long var9 = var5 ^ 75395261901329L;
long var11 = var5 ^ 126288025884087L;
long var13 = var5 ^ 54716262846589L;
long var15 = var5 ^ 137494940471278L;
Intrinsics.checkNotNullParameter(setting, a<"e">(20092, 3070302309618464095L ^ var5));
super(var13, setting);
this.N = setting;
this.x = new fd(_s.OUT_QUINT, m, var9);
this.u = new ArrayList();
if (this.O) {
Object[] var10000 = this.A().F().getClass().getEnumConstants();
Intrinsics.checkNotNullExpressionValue(var10000, a<"e">(581, 1378175775400589669L ^ var5));
Object[] var17 = var10000;
boolean var18 = false;
int var19 = 0;
int var20 = var17.length;

while (var19 < var20) {
Object var21 = var17[var19];
Enum var22 = (Enum)var21;
boolean var23 = false;
List var36 = this.u;
float var10004 = this.b;
float var10005 = this.F() - 11.0F;
Intrinsics.checkNotNull(var22);
var36.add(new yh(1.0F, var10004, var10005, var22, null, b<"b">(6697, 2945248256630952328L ^ var5), var7, null));
this.b += 15.0F;
var19++;
if (axx <= 0 || a < 0) {
break;
}
}

if (axx >= 0) {
return;
}
}

float var26 = 0.0F;
var26 = 2.0F;
Object[] var37 = this.A().F().getClass().getEnumConstants();
Intrinsics.checkNotNullExpressionValue(var37, a<"e">(3268, 7025094664254355439L ^ var5));
Object[] var28 = var37;
boolean var30 = false;
Iterable var29 = ArraysKt.sortedWith(var28, new ll());
var30 = false;

for (Object var33 : var29) {
Enum var34 = (Enum)var33;
boolean var35 = false;
String var24 = var34.name();
float var25 = b8.d(var15).D(var11, var24) + 4.0F;
if (ax <= 0) {
break;
}

float var41;
int var38 = (var41 = var26 + var25 - (this.F() - 10.0F)) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
if (ax > 0) {
if (var38 > 0) {
this.b += 12.0F;
var26 = 2.0F;
}

List var39 = this.u;
float var40 = this.b;
Intrinsics.checkNotNull(var34);
var39.add(new yh(var26, var40, var25, var34, null, b<"b">(19658, 6835526690735966048L ^ var5), var7, null));
}

var26 += var25 + 2.0F;
if (a < 0) {
break;
}
}
}

@NotNull
@Override
public a1 A() {
return this.N;
}

@NotNull
public final List O() {
return this.u;
}

public final void d(short a, int a, char a, @NotNull List <set-?>) {
long var5 = ((long)a << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ d;
Intrinsics.checkNotNullParameter(<set-?>, a<"e">(778, 7660171144242462288L ^ var5));
this.u = <set-?>;
}

@Override
public void r(@NotNull class_332 context, int mouseX, int mouseY, long a, float factor) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 4
// 002: dup2
// 003: ldc2_w 49494862758009
// 006: lxor
// 007: lstore 7
// 009: dup2
// 00a: ldc2_w 39844814704388
// 00d: lxor
// 00e: lstore 9
// 010: dup2
// 011: ldc2_w 115096991696004
// 014: lxor
// 015: lstore 11
// 017: dup2
// 018: ldc2_w 127000398109451
// 01b: lxor
// 01c: lstore 13
// 01e: dup2
// 01f: ldc2_w 57758330175306
// 022: lxor
// 023: dup2
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 15
// 02a: dup2
// 02b: bipush 16
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 16
// 034: dup2
// 035: bipush 48
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 17
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 9915521765924
// 043: lxor
// 044: lstore 18
// 046: dup2
// 047: ldc2_w 20797107207379
// 04a: lxor
// 04b: dup2
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 20
// 052: dup2
// 053: bipush 16
// 055: lshl
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 21
// 05c: dup2
// 05d: bipush 32
// 05f: lshl
// 060: bipush 32
// 062: lushr
// 063: l2i
// 064: istore 22
// 066: pop2
// 067: dup2
// 068: ldc2_w 114903264084220
// 06b: lxor
// 06c: lstore 23
// 06e: dup2
// 06f: ldc2_w 136713714549074
// 072: lxor
// 073: lstore 25
// 075: dup2
// 076: ldc2_w 120682356120742
// 079: lxor
// 07a: lstore 27
// 07c: dup2
// 07d: ldc2_w 4763820429086
// 080: lxor
// 081: lstore 29
// 083: dup2
// 084: ldc2_w 57494645123396
// 087: lxor
// 088: lstore 31
// 08a: dup2
// 08b: ldc2_w 22712070180255
// 08e: lxor
// 08f: dup2
// 090: bipush 48
// 092: lushr
// 093: l2i
// 094: istore 33
// 096: dup2
// 097: bipush 16
// 099: lshl
// 09a: bipush 16
// 09c: lushr
// 09d: lstore 34
// 09f: pop2
// 0a0: pop2
// 0a1: ldc2_w 6640577628623117237
// 0a4: lload 4
// 0a6: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: aload 1
// 0ac: sipush 12938
// 0af: ldc2_w 6605146696358141259
// 0b2: lload 4
// 0b4: lxor
// 0b5: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0bd: astore 36
// 0bf: aload 0
// 0c0: aload 0
// 0c1: getfield su/catlean/rf.O Z
// 0c4: aload 36
// 0c6: ifnull 136
// 0c9: ifeq 11f
// 0cc: goto 0da
// 0cf: ldc2_w 6646176913872734168
// 0d2: lload 4
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: aload 0
// 0db: aload 36
// 0dd: ifnull 111
// 0e0: goto 0ee
// 0e3: ldc2_w 6646176913872734168
// 0e6: lload 4
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: getfield su/catlean/rf.p Z
// 0f1: ifeq 11a
// 0f4: goto 102
// 0f7: ldc2_w 6646176913872734168
// 0fa: lload 4
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: aload 0
// 103: goto 111
// 106: ldc2_w 6646176913872734168
// 109: lload 4
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: getfield su/catlean/rf.b F
// 114: ldc 15.0
// 116: fadd
// 117: goto 145
// 11a: ldc 14.0
// 11c: goto 145
// 11f: aload 0
// 120: aload 36
// 122: ifnull 13a
// 125: getfield su/catlean/rf.p Z
// 128: goto 136
// 12b: ldc2_w 6646176913872734168
// 12e: lload 4
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: ifeq 143
// 139: aload 0
// 13a: getfield su/catlean/rf.b F
// 13d: ldc 28.0
// 13f: fadd
// 140: goto 145
// 143: ldc 14.0
// 145: invokevirtual su/catlean/rf.m (F)V
// 148: aload 0
// 149: getfield su/catlean/rf.x Lsu/catlean/fd;
// 14c: aload 0
// 14d: getfield su/catlean/rf.p Z
// 150: ifeq 162
// 153: fconst_1
// 154: goto 163
// 157: ldc2_w 6646176913872734168
// 15a: lload 4
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: fconst_0
// 163: lload 9
// 165: dup2_x1
// 166: pop2
// 167: invokevirtual su/catlean/fd.B (JF)V
// 16a: aload 1
// 16b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 16e: dup
// 16f: sipush 14577
// 172: ldc2_w 5865376751204570939
// 175: lload 4
// 177: lxor
// 178: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 180: aload 0
// 181: invokevirtual su/catlean/rf.x ()F
// 184: iload 20
// 186: i2c
// 187: swap
// 188: aload 0
// 189: invokevirtual su/catlean/rf.R ()F
// 18c: fconst_1
// 18d: fsub
// 18e: aload 0
// 18f: invokevirtual su/catlean/rf.F ()F
// 192: ldc 7.0
// 194: fsub
// 195: aload 0
// 196: getfield su/catlean/rf.x Lsu/catlean/fd;
// 199: invokevirtual su/catlean/fd.a ()F
// 19c: aload 0
// 19d: invokevirtual su/catlean/rf.d ()F
// 1a0: ldc 14.0
// 1a2: fsub
// 1a3: fmul
// 1a4: ldc 14.0
// 1a6: fadd
// 1a7: fconst_1
// 1a8: fsub
// 1a9: ldc 3.0
// 1ab: ldc 2.5
// 1ad: fconst_0
// 1ae: fconst_1
// 1af: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1b2: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 1b5: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1b8: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 1bb: fconst_0
// 1bc: iload 21
// 1be: i2s
// 1bf: fconst_0
// 1c0: iload 22
// 1c2: fconst_0
// 1c3: sipush 10639
// 1c6: ldc2_w 2655654608284710601
// 1c9: lload 4
// 1cb: lxor
// 1cc: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d1: aconst_null
// 1d2: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 1d5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1d8: lload 29
// 1da: aload 1
// 1db: new su/catlean/o7
// 1de: dup
// 1df: aload 0
// 1e0: invokevirtual su/catlean/rf.x ()F
// 1e3: aload 0
// 1e4: invokevirtual su/catlean/rf.R ()F
// 1e7: fconst_1
// 1e8: fsub
// 1e9: aload 0
// 1ea: invokevirtual su/catlean/rf.x ()F
// 1ed: aload 0
// 1ee: invokevirtual su/catlean/rf.F ()F
// 1f1: fadd
// 1f2: ldc 7.0
// 1f4: fsub
// 1f5: aload 0
// 1f6: invokevirtual su/catlean/rf.R ()F
// 1f9: fconst_1
// 1fa: fsub
// 1fb: aload 0
// 1fc: getfield su/catlean/rf.x Lsu/catlean/fd;
// 1ff: invokevirtual su/catlean/fd.a ()F
// 202: aload 0
// 203: invokevirtual su/catlean/rf.d ()F
// 206: ldc 14.0
// 208: fsub
// 209: fmul
// 20a: ldc 14.0
// 20c: fadd
// 20d: fconst_1
// 20e: fsub
// 20f: fadd
// 210: invokespecial su/catlean/o7.<init> (FFFF)V
// 213: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 216: lload 23
// 218: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 21b: aload 0
// 21c: invokevirtual su/catlean/rf.A ()Lsu/catlean/a1;
// 21f: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 222: lload 25
// 224: dup2_x1
// 225: pop2
// 226: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 229: fconst_2
// 22a: fdiv
// 22b: fstore 37
// 22d: aload 0
// 22e: invokevirtual su/catlean/rf.F ()F
// 231: ldc 16.0
// 233: fsub
// 234: fconst_2
// 235: fdiv
// 236: fload 37
// 238: fsub
// 239: aload 0
// 23a: getfield su/catlean/rf.x Lsu/catlean/fd;
// 23d: invokevirtual su/catlean/fd.a ()F
// 240: fmul
// 241: fstore 38
// 243: lload 23
// 245: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 248: aload 1
// 249: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 24c: dup
// 24d: sipush 29964
// 250: ldc2_w 4400343846517234368
// 253: lload 4
// 255: lxor
// 256: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 25e: aload 0
// 25f: invokevirtual su/catlean/rf.A ()Lsu/catlean/a1;
// 262: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 265: aload 0
// 266: invokevirtual su/catlean/rf.x ()F
// 269: ldc 3.0
// 26b: fadd
// 26c: fload 38
// 26e: fadd
// 26f: aload 0
// 270: invokevirtual su/catlean/rf.R ()F
// 273: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 276: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 279: lload 11
// 27b: dup2_x1
// 27c: pop2
// 27d: bipush 0
// 27e: bipush 0
// 27f: sipush 4638
// 282: ldc2_w 7702088179755568475
// 285: lload 4
// 287: lxor
// 288: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28d: aconst_null
// 28e: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 291: aload 0
// 292: invokevirtual su/catlean/rf.A ()Lsu/catlean/a1;
// 295: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 298: checkcast java/lang/Enum
// 29b: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
// 29e: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 2a1: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 2a4: dup
// 2a5: sipush 19919
// 2a8: ldc2_w 8551864586108953095
// 2ab: lload 4
// 2ad: lxor
// 2ae: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2b6: checkcast java/lang/CharSequence
// 2b9: bipush 1
// 2ba: anewarray 29
// 2bd: astore 40
// 2bf: aload 40
// 2c1: bipush 0
// 2c2: ldc "_"
// 2c4: aastore
// 2c5: aload 40
// 2c7: bipush 0
// 2c8: bipush 0
// 2c9: sipush 30555
// 2cc: ldc2_w 7221297260706113561
// 2cf: lload 4
// 2d1: lxor
// 2d2: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: aconst_null
// 2d8: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
// 2db: checkcast java/lang/Iterable
// 2de: ldc " "
// 2e0: checkcast java/lang/CharSequence
// 2e3: aconst_null
// 2e4: aconst_null
// 2e5: bipush 0
// 2e6: aconst_null
// 2e7: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/rf.c (Ljava/lang/String;)Ljava/lang/CharSequence;, (Ljava/lang/String;)Ljava/lang/CharSequence; ]
// 2ec: sipush 3522
// 2ef: ldc2_w 2277232161314394762
// 2f2: lload 4
// 2f4: lxor
// 2f5: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fa: aconst_null
// 2fb: invokestatic kotlin/collections/CollectionsKt.joinToString$default (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
// 2fe: checkcast java/lang/CharSequence
// 301: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 304: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 307: astore 39
// 309: lload 23
// 30b: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 30e: lload 25
// 310: aload 39
// 312: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 315: fstore 40
// 317: lload 23
// 319: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 31c: aload 1
// 31d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 320: dup
// 321: sipush 29964
// 324: ldc2_w 4400343846517234368
// 327: lload 4
// 329: lxor
// 32a: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 332: aload 39
// 334: aload 0
// 335: invokevirtual su/catlean/rf.x ()F
// 338: aload 0
// 339: invokevirtual su/catlean/rf.F ()F
// 33c: fadd
// 33d: ldc 11.0
// 33f: fsub
// 340: fload 40
// 342: fsub
// 343: fload 38
// 345: fadd
// 346: iload 33
// 348: i2s
// 349: swap
// 34a: aload 0
// 34b: invokevirtual su/catlean/rf.R ()F
// 34e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 351: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 354: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 357: fconst_1
// 358: aload 0
// 359: getfield su/catlean/rf.x Lsu/catlean/fd;
// 35c: invokevirtual su/catlean/fd.a ()F
// 35f: fsub
// 360: iload 15
// 362: i2c
// 363: swap
// 364: iload 16
// 366: swap
// 367: iload 17
// 369: i2s
// 36a: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 36d: lload 34
// 36f: dup2_x1
// 370: pop2
// 371: bipush 0
// 372: bipush 0
// 373: sipush 18865
// 376: ldc2_w 3697277539844855551
// 379: lload 4
// 37b: lxor
// 37c: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 381: aconst_null
// 382: invokestatic su/catlean/c6.v (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;SFFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 385: aload 36
// 387: ifnull 835
// 38a: aload 0
// 38b: getfield su/catlean/rf.p Z
// 38e: ifeq 82c
// 391: goto 39f
// 394: ldc2_w 6646176913872734168
// 397: lload 4
// 399: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39e: athrow
// 39f: aload 0
// 3a0: getfield su/catlean/rf.u Ljava/util/List;
// 3a3: checkcast java/lang/Iterable
// 3a6: astore 41
// 3a8: bipush 0
// 3a9: istore 42
// 3ab: aload 41
// 3ad: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 3b2: astore 43
// 3b4: aload 43
// 3b6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3bb: ifeq 824
// 3be: aload 43
// 3c0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3c5: astore 44
// 3c7: aload 44
// 3c9: checkcast su/catlean/yh
// 3cc: astore 45
// 3ce: bipush 0
// 3cf: istore 46
// 3d1: aload 36
// 3d3: ifnull 835
// 3d6: aload 45
// 3d8: invokevirtual su/catlean/yh.i ()Lsu/catlean/fd;
// 3db: aload 45
// 3dd: invokevirtual su/catlean/yh.X ()Ljava/lang/Enum;
// 3e0: aload 0
// 3e1: invokevirtual su/catlean/rf.A ()Lsu/catlean/a1;
// 3e4: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 3e7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3ea: ifeq 40a
// 3ed: goto 3fb
// 3f0: ldc2_w 6646176913872734168
// 3f3: lload 4
// 3f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fa: athrow
// 3fb: fconst_1
// 3fc: goto 40b
// 3ff: ldc2_w 6646176913872734168
// 402: lload 4
// 404: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 409: athrow
// 40a: fconst_0
// 40b: lload 9
// 40d: dup2_x1
// 40e: pop2
// 40f: invokevirtual su/catlean/fd.B (JF)V
// 412: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 415: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 418: invokevirtual su/catlean/jh.i ()Ljava/awt/Color;
// 41b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 41e: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 421: lload 18
// 423: dup2_x1
// 424: pop2
// 425: aload 45
// 427: invokevirtual su/catlean/yh.i ()Lsu/catlean/fd;
// 42a: invokevirtual su/catlean/fd.a ()F
// 42d: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 430: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 433: astore 47
// 435: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 438: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 43b: invokevirtual su/catlean/jh.h ()Ljava/awt/Color;
// 43e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 441: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 444: lload 18
// 446: dup2_x1
// 447: pop2
// 448: aload 45
// 44a: invokevirtual su/catlean/yh.i ()Lsu/catlean/fd;
// 44d: invokevirtual su/catlean/fd.a ()F
// 450: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 453: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 456: astore 48
// 458: aload 36
// 45a: ifnull 60d
// 45d: aload 0
// 45e: getfield su/catlean/rf.O Z
// 461: ifeq 5a5
// 464: goto 472
// 467: ldc2_w 6646176913872734168
// 46a: lload 4
// 46c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 471: athrow
// 472: aload 1
// 473: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 476: dup
// 477: sipush 29964
// 47a: ldc2_w 4400343846517234368
// 47d: lload 4
// 47f: lxor
// 480: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 485: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 488: aload 0
// 489: invokevirtual su/catlean/rf.x ()F
// 48c: aload 45
// 48e: invokevirtual su/catlean/yh.F ()F
// 491: fadd
// 492: fconst_1
// 493: fadd
// 494: iload 20
// 496: i2c
// 497: swap
// 498: aload 0
// 499: invokevirtual su/catlean/rf.R ()F
// 49c: aload 45
// 49e: invokevirtual su/catlean/yh.j ()F
// 4a1: fadd
// 4a2: ldc 13.0
// 4a4: fadd
// 4a5: aload 45
// 4a7: invokevirtual su/catlean/yh.I ()F
// 4aa: ldc 13.0
// 4ac: fconst_2
// 4ad: ldc 2.5
// 4af: ldc 0.8
// 4b1: fconst_1
// 4b2: aload 47
// 4b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 4b7: aload 47
// 4b9: aload 48
// 4bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 4be: aload 48
// 4c0: fconst_0
// 4c1: iload 21
// 4c3: i2s
// 4c4: fconst_0
// 4c5: iload 22
// 4c7: fconst_0
// 4c8: sipush 13721
// 4cb: ldc2_w 8181677755704666836
// 4ce: lload 4
// 4d0: lxor
// 4d1: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d6: aconst_null
// 4d7: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 4da: lload 23
// 4dc: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 4df: aload 1
// 4e0: aload 45
// 4e2: invokevirtual su/catlean/yh.X ()Ljava/lang/Enum;
// 4e5: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
// 4e8: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 4eb: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 4ee: dup
// 4ef: sipush 16570
// 4f2: ldc2_w 3113963750035287929
// 4f5: lload 4
// 4f7: lxor
// 4f8: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 500: checkcast java/lang/CharSequence
// 503: bipush 1
// 504: anewarray 29
// 507: astore 49
// 509: aload 49
// 50b: bipush 0
// 50c: ldc "_"
// 50e: aastore
// 50f: aload 49
// 511: bipush 0
// 512: bipush 0
// 513: sipush 27533
// 516: ldc2_w 1715566526129288397
// 519: lload 4
// 51b: lxor
// 51c: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 521: aconst_null
// 522: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
// 525: checkcast java/lang/Iterable
// 528: ldc " "
// 52a: checkcast java/lang/CharSequence
// 52d: aconst_null
// 52e: aconst_null
// 52f: bipush 0
// 530: aconst_null
// 531: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/rf.l (Ljava/lang/String;)Ljava/lang/CharSequence;, (Ljava/lang/String;)Ljava/lang/CharSequence; ]
// 536: sipush 32605
// 539: ldc2_w 5187072389227225118
// 53c: lload 4
// 53e: lxor
// 53f: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 544: aconst_null
// 545: invokestatic kotlin/collections/CollectionsKt.joinToString$default (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
// 548: checkcast java/lang/CharSequence
// 54b: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 54e: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 551: aload 0
// 552: invokevirtual su/catlean/rf.x ()F
// 555: aload 45
// 557: invokevirtual su/catlean/yh.F ()F
// 55a: fadd
// 55b: fconst_1
// 55c: fadd
// 55d: aload 45
// 55f: invokevirtual su/catlean/yh.I ()F
// 562: fconst_2
// 563: fdiv
// 564: fadd
// 565: aload 0
// 566: invokevirtual su/catlean/rf.R ()F
// 569: aload 45
// 56b: invokevirtual su/catlean/yh.j ()F
// 56e: fadd
// 56f: ldc 18.0
// 571: fadd
// 572: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 575: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 578: lload 27
// 57a: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 57d: aload 36
// 57f: lload 4
// 581: lconst_0
// 582: lcmp
// 583: ifle 58d
// 586: ifnonnull 6b2
// 589: bipush 3
// 58a: anewarray 107
// 58d: ldc2_w 6635920812859938346
// 590: lload 4
// 592: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 597: goto 5a5
// 59a: ldc2_w 6646176913872734168
// 59d: lload 4
// 59f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a4: athrow
// 5a5: aload 1
// 5a6: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 5a9: dup
// 5aa: sipush 29964
// 5ad: ldc2_w 4400343846517234368
// 5b0: lload 4
// 5b2: lxor
// 5b3: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5bb: aload 0
// 5bc: invokevirtual su/catlean/rf.x ()F
// 5bf: aload 45
// 5c1: invokevirtual su/catlean/yh.F ()F
// 5c4: fadd
// 5c5: fconst_1
// 5c6: fadd
// 5c7: iload 20
// 5c9: i2c
// 5ca: swap
// 5cb: aload 0
// 5cc: invokevirtual su/catlean/rf.R ()F
// 5cf: aload 45
// 5d1: invokevirtual su/catlean/yh.j ()F
// 5d4: fadd
// 5d5: ldc 13.0
// 5d7: fadd
// 5d8: aload 45
// 5da: invokevirtual su/catlean/yh.I ()F
// 5dd: ldc 10.0
// 5df: fconst_2
// 5e0: ldc 2.5
// 5e2: ldc 0.8
// 5e4: fconst_1
// 5e5: aload 47
// 5e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5ea: aload 47
// 5ec: aload 48
// 5ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5f1: aload 48
// 5f3: fconst_0
// 5f4: iload 21
// 5f6: i2s
// 5f7: fconst_0
// 5f8: iload 22
// 5fa: fconst_0
// 5fb: sipush 13721
// 5fe: ldc2_w 8181677755704666836
// 601: lload 4
// 603: lxor
// 604: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 609: aconst_null
// 60a: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 60d: lload 13
// 60f: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 612: aload 1
// 613: aload 45
// 615: invokevirtual su/catlean/yh.X ()Ljava/lang/Enum;
// 618: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
// 61b: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 61e: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 621: dup
// 622: sipush 16570
// 625: ldc2_w 3113963750035287929
// 628: lload 4
// 62a: lxor
// 62b: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 630: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 633: checkcast java/lang/CharSequence
// 636: bipush 1
// 637: anewarray 29
// 63a: astore 49
// 63c: aload 49
// 63e: bipush 0
// 63f: ldc "_"
// 641: aastore
// 642: aload 49
// 644: bipush 0
// 645: bipush 0
// 646: sipush 27533
// 649: ldc2_w 1715566526129288397
// 64c: lload 4
// 64e: lxor
// 64f: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 654: aconst_null
// 655: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
// 658: checkcast java/lang/Iterable
// 65b: ldc " "
// 65d: checkcast java/lang/CharSequence
// 660: aconst_null
// 661: aconst_null
// 662: bipush 0
// 663: aconst_null
// 664: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/rf.x (Ljava/lang/String;)Ljava/lang/CharSequence;, (Ljava/lang/String;)Ljava/lang/CharSequence; ]
// 669: sipush 32605
// 66c: ldc2_w 5187072389227225118
// 66f: lload 4
// 671: lxor
// 672: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 677: aconst_null
// 678: invokestatic kotlin/collections/CollectionsKt.joinToString$default (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
// 67b: checkcast java/lang/CharSequence
// 67e: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
// 681: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 684: aload 0
// 685: invokevirtual su/catlean/rf.x ()F
// 688: aload 45
// 68a: invokevirtual su/catlean/yh.F ()F
// 68d: fadd
// 68e: fconst_1
// 68f: fadd
// 690: aload 45
// 692: invokevirtual su/catlean/yh.I ()F
// 695: fconst_2
// 696: fdiv
// 697: fadd
// 698: aload 0
// 699: invokevirtual su/catlean/rf.R ()F
// 69c: fconst_1
// 69d: fsub
// 69e: aload 45
// 6a0: invokevirtual su/catlean/yh.j ()F
// 6a3: fadd
// 6a4: ldc 18.0
// 6a6: fadd
// 6a7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 6aa: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 6ad: lload 27
// 6af: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 6b2: aload 0
// 6b3: invokevirtual su/catlean/rf.x ()F
// 6b6: aload 45
// 6b8: invokevirtual su/catlean/yh.F ()F
// 6bb: fadd
// 6bc: fconst_1
// 6bd: fadd
// 6be: fstore 49
// 6c0: aload 0
// 6c1: invokevirtual su/catlean/rf.x ()F
// 6c4: aload 45
// 6c6: invokevirtual su/catlean/yh.F ()F
// 6c9: fadd
// 6ca: fconst_1
// 6cb: fadd
// 6cc: aload 45
// 6ce: invokevirtual su/catlean/yh.I ()F
// 6d1: fadd
// 6d2: fstore 50
// 6d4: iload 2
// 6d5: i2f
// 6d6: fstore 51
// 6d8: fload 49
// 6da: fload 51
// 6dc: fcmpg
// 6dd: aload 36
// 6df: lload 4
// 6e1: lconst_0
// 6e2: lcmp
// 6e3: iflt 70f
// 6e6: ifnull 70d
// 6e9: ifgt 736
// 6ec: goto 6fa
// 6ef: ldc2_w 6646176913872734168
// 6f2: lload 4
// 6f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f9: athrow
// 6fa: fload 51
// 6fc: fload 50
// 6fe: fcmpg
// 6ff: goto 70d
// 702: ldc2_w 6646176913872734168
// 705: lload 4
// 707: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70c: athrow
// 70d: aload 36
// 70f: ifnull 733
// 712: ifgt 732
// 715: goto 723
// 718: ldc2_w 6646176913872734168
// 71b: lload 4
// 71d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 722: athrow
// 723: bipush 1
// 724: goto 737
// 727: ldc2_w 6646176913872734168
// 72a: lload 4
// 72c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 731: athrow
// 732: bipush 0
// 733: goto 737
// 736: bipush 0
// 737: ifeq 81d
// 73a: aload 0
// 73b: invokevirtual su/catlean/rf.R ()F
// 73e: fconst_1
// 73f: fsub
// 740: aload 45
// 742: invokevirtual su/catlean/yh.j ()F
// 745: fadd
// 746: ldc 14.0
// 748: fadd
// 749: fstore 49
// 74b: aload 0
// 74c: invokevirtual su/catlean/rf.R ()F
// 74f: aload 45
// 751: invokevirtual su/catlean/yh.j ()F
// 754: fadd
// 755: ldc 23.0
// 757: fadd
// 758: fstore 50
// 75a: iload 3
// 75b: i2f
// 75c: fstore 51
// 75e: fload 49
// 760: fload 51
// 762: fcmpg
// 763: aload 36
// 765: lload 4
// 767: lconst_0
// 768: lcmp
// 769: ifle 795
// 76c: ifnull 793
// 76f: ifgt 7bc
// 772: goto 780
// 775: ldc2_w 6646176913872734168
// 778: lload 4
// 77a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77f: athrow
// 780: fload 51
// 782: fload 50
// 784: fcmpg
// 785: goto 793
// 788: ldc2_w 6646176913872734168
// 78b: lload 4
// 78d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 792: athrow
// 793: aload 36
// 795: ifnull 7b9
// 798: ifgt 7b8
// 79b: goto 7a9
// 79e: ldc2_w 6646176913872734168
// 7a1: lload 4
// 7a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a8: athrow
// 7a9: bipush 1
// 7aa: goto 7bd
// 7ad: ldc2_w 6646176913872734168
// 7b0: lload 4
// 7b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b7: athrow
// 7b8: bipush 0
// 7b9: goto 7bd
// 7bc: bipush 0
// 7bd: lload 4
// 7bf: lconst_0
// 7c0: lcmp
// 7c1: ifle 7ca
// 7c4: ifeq 81d
// 7c7: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 7ca: sipush 20228
// 7cd: ldc2_w 8906824973105926211
// 7d0: lload 4
// 7d2: lxor
// 7d3: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d8: if_icmpeq 81d
// 7db: goto 7e9
// 7de: ldc2_w 6646176913872734168
// 7e1: lload 4
// 7e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e8: athrow
// 7e9: lload 7
// 7eb: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 7ee: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 7f1: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 7f4: sipush 7010
// 7f7: ldc2_w 1384712356549149742
// 7fa: lload 4
// 7fc: lxor
// 7fd: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 802: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 805: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 808: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 80b: bipush 0
// 80c: invokevirtual su/catlean/fi.A (Z)V
// 80f: goto 81d
// 812: ldc2_w 6646176913872734168
// 815: lload 4
// 817: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81c: athrow
// 81d: nop
// 81e: nop
// 81f: aload 36
// 821: ifnonnull 3b4
// 824: lload 4
// 826: lconst_0
// 827: lcmp
// 828: ifle 835
// 82b: nop
// 82c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 82f: lload 31
// 831: aload 1
// 832: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 835: return
}

@Override
public void W(long a, double mouseX, double mouseY, int button) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: ldc2_w 8591482653260427430
// 003: lload 1
// 004: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 009: aload 0
// 00a: invokevirtual su/catlean/rf.x ()F
// 00d: fstore 9
// 00f: astore 8
// 011: dload 3
// 012: aload 0
// 013: invokevirtual su/catlean/rf.x ()F
// 016: aload 0
// 017: invokevirtual su/catlean/rf.F ()F
// 01a: fadd
// 01b: ldc 7.0
// 01d: fsub
// 01e: f2d
// 01f: dcmpg
// 020: aload 8
// 022: lload 1
// 023: lconst_0
// 024: lcmp
// 025: iflt 04f
// 028: ifnull 04d
// 02b: ifgt 074
// 02e: goto 03b
// 031: ldc2_w 8586384746386386123
// 034: lload 1
// 035: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: athrow
// 03b: fload 9
// 03d: f2d
// 03e: dload 3
// 03f: dcmpg
// 040: goto 04d
// 043: ldc2_w 8586384746386386123
// 046: lload 1
// 047: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: athrow
// 04d: aload 8
// 04f: ifnull 071
// 052: ifgt 070
// 055: goto 062
// 058: ldc2_w 8586384746386386123
// 05b: lload 1
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: bipush 1
// 063: goto 075
// 066: ldc2_w 8586384746386386123
// 069: lload 1
// 06a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: athrow
// 070: bipush 0
// 071: goto 075
// 074: bipush 0
// 075: ifeq 11d
// 078: aload 0
// 079: invokevirtual su/catlean/rf.R ()F
// 07c: fstore 9
// 07e: dload 5
// 080: aload 0
// 081: invokevirtual su/catlean/rf.R ()F
// 084: sipush 22504
// 087: ldc2_w 7918682035255485370
// 08a: lload 1
// 08b: lxor
// 08c: invokedynamic b (IJ)I bsm=su/catlean/rf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: i2f
// 092: fadd
// 093: f2d
// 094: dcmpg
// 095: aload 8
// 097: lload 1
// 098: lconst_0
// 099: lcmp
// 09a: ifle 0c5
// 09d: ifnull 0c3
// 0a0: ifgt 0ea
// 0a3: goto 0b0
// 0a6: ldc2_w 8586384746386386123
// 0a9: lload 1
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: fload 9
// 0b2: f2d
// 0b3: dload 5
// 0b5: dcmpg
// 0b6: goto 0c3
// 0b9: ldc2_w 8586384746386386123
// 0bc: lload 1
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: aload 8
// 0c5: ifnull 0e7
// 0c8: ifgt 0e6
// 0cb: goto 0d8
// 0ce: ldc2_w 8586384746386386123
// 0d1: lload 1
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: bipush 1
// 0d9: goto 0eb
// 0dc: ldc2_w 8586384746386386123
// 0df: lload 1
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: bipush 0
// 0e7: goto 0eb
// 0ea: bipush 0
// 0eb: ifeq 11d
// 0ee: aload 0
// 0ef: aload 0
// 0f0: getfield su/catlean/rf.p Z
// 0f3: aload 8
// 0f5: ifnull 116
// 0f8: goto 105
// 0fb: ldc2_w 8586384746386386123
// 0fe: lload 1
// 0ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: athrow
// 105: ifne 119
// 108: goto 115
// 10b: ldc2_w 8586384746386386123
// 10e: lload 1
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: bipush 1
// 116: goto 11a
// 119: bipush 0
// 11a: putfield su/catlean/rf.p Z
// 11d: aload 0
// 11e: aload 8
// 120: ifnull 144
// 123: getfield su/catlean/rf.p Z
// 126: ifeq 2a4
// 129: goto 136
// 12c: ldc2_w 8586384746386386123
// 12f: lload 1
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: aload 0
// 137: goto 144
// 13a: ldc2_w 8586384746386386123
// 13d: lload 1
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: getfield su/catlean/rf.u Ljava/util/List;
// 147: checkcast java/lang/Iterable
// 14a: astore 9
// 14c: bipush 0
// 14d: istore 10
// 14f: aload 9
// 151: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 156: astore 11
// 158: aload 11
// 15a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 15f: ifeq 29d
// 162: aload 11
// 164: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 169: astore 12
// 16b: aload 12
// 16d: checkcast su/catlean/yh
// 170: astore 13
// 172: bipush 0
// 173: istore 14
// 175: aload 0
// 176: invokevirtual su/catlean/rf.x ()F
// 179: aload 13
// 17b: invokevirtual su/catlean/yh.F ()F
// 17e: fadd
// 17f: fconst_1
// 180: fadd
// 181: fstore 15
// 183: aload 8
// 185: ifnull 2a4
// 188: dload 3
// 189: aload 0
// 18a: invokevirtual su/catlean/rf.x ()F
// 18d: aload 13
// 18f: invokevirtual su/catlean/yh.F ()F
// 192: fadd
// 193: fconst_1
// 194: fadd
// 195: aload 13
// 197: invokevirtual su/catlean/yh.I ()F
// 19a: fadd
// 19b: f2d
// 19c: dcmpg
// 19d: aload 8
// 19f: lload 1
// 1a0: lconst_0
// 1a1: lcmp
// 1a2: ifle 1d9
// 1a5: ifnull 1d7
// 1a8: goto 1b5
// 1ab: ldc2_w 8586384746386386123
// 1ae: lload 1
// 1af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b4: athrow
// 1b5: ifgt 1fe
// 1b8: goto 1c5
// 1bb: ldc2_w 8586384746386386123
// 1be: lload 1
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: fload 15
// 1c7: f2d
// 1c8: dload 3
// 1c9: dcmpg
// 1ca: goto 1d7
// 1cd: ldc2_w 8586384746386386123
// 1d0: lload 1
// 1d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: athrow
// 1d7: aload 8
// 1d9: ifnull 1fb
// 1dc: ifgt 1fa
// 1df: goto 1ec
// 1e2: ldc2_w 8586384746386386123
// 1e5: lload 1
// 1e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1eb: athrow
// 1ec: bipush 1
// 1ed: goto 1ff
// 1f0: ldc2_w 8586384746386386123
// 1f3: lload 1
// 1f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: athrow
// 1fa: bipush 0
// 1fb: goto 1ff
// 1fe: bipush 0
// 1ff: ifeq 296
// 202: aload 0
// 203: invokevirtual su/catlean/rf.R ()F
// 206: fconst_1
// 207: fsub
// 208: aload 13
// 20a: invokevirtual su/catlean/yh.j ()F
// 20d: fadd
// 20e: ldc 14.0
// 210: fadd
// 211: fstore 15
// 213: dload 5
// 215: aload 0
// 216: invokevirtual su/catlean/rf.R ()F
// 219: aload 13
// 21b: invokevirtual su/catlean/yh.j ()F
// 21e: fadd
// 21f: ldc 23.0
// 221: fadd
// 222: f2d
// 223: dcmpg
// 224: aload 8
// 226: lload 1
// 227: lconst_0
// 228: lcmp
// 229: ifle 254
// 22c: ifnull 252
// 22f: ifgt 279
// 232: goto 23f
// 235: ldc2_w 8586384746386386123
// 238: lload 1
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: fload 15
// 241: f2d
// 242: dload 5
// 244: dcmpg
// 245: goto 252
// 248: ldc2_w 8586384746386386123
// 24b: lload 1
// 24c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 251: athrow
// 252: aload 8
// 254: ifnull 276
// 257: ifgt 275
// 25a: goto 267
// 25d: ldc2_w 8586384746386386123
// 260: lload 1
// 261: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 266: athrow
// 267: bipush 1
// 268: goto 27a
// 26b: ldc2_w 8586384746386386123
// 26e: lload 1
// 26f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 274: athrow
// 275: bipush 0
// 276: goto 27a
// 279: bipush 0
// 27a: ifeq 296
// 27d: aload 0
// 27e: invokevirtual su/catlean/rf.A ()Lsu/catlean/a1;
// 281: aload 13
// 283: invokevirtual su/catlean/yh.X ()Ljava/lang/Enum;
// 286: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 289: goto 296
// 28c: ldc2_w 8586384746386386123
// 28f: lload 1
// 290: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 295: athrow
// 296: nop
// 297: nop
// 298: aload 8
// 29a: ifnonnull 158
// 29d: lload 1
// 29e: lconst_0
// 29f: lcmp
// 2a0: iflt 2a4
// 2a3: nop
// 2a4: return
}

@Override
public void U(double mouseX, double mouseY, int button) {
}

@Override
public void V(int key, short a, int a, char a) {
}

@Override
public void T(char char, long a) {
}

@Override
public boolean S(byte a, double mouseX, double mouseY, double verticalAmount, long a) {
return false;
}

@Override
public void L() {
}

private static final CharSequence c(String var0) {
long var1 = d ^ 102480474158050L;
Intrinsics.checkNotNullParameter(var0, "s");
_g[] var10000 = vm.a<"Å">(-4855974396418688255L, var1);
String var4 = var0;
_g[] var3 = var10000;

label27: {
label26: {
try {
var10 = var4.length();
if (var3 == null) {
break label27;
}

if (var10 > 0) {
break label26;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -4859391039403219092L, var1);
}

var10 = 0;
break label27;
}

var10 = 1;
}

String var15;
if (var10 != 0) {
StringBuilder var11 = new StringBuilder();
char var5 = var0.charAt(0);
StringBuilder var7 = var11;
byte var6 = 0;
String var12 = String.valueOf(var5);
Intrinsics.checkNotNull(var12, a<"e">(10115, 7415683686287894773L ^ var1));
String var13 = var12.toUpperCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var13, a<"e">(28633, 2640727185959133350L ^ var1));
StringBuilder var14 = var7.append(var13);
var6 = 1;
String var10001 = var0.substring(var6);
Intrinsics.checkNotNullExpressionValue(var10001, a<"e">(3698, 7661108291158786310L ^ var1));
var15 = var14.append(var10001).toString();
} else {
var15 = var0;
}

return var15;
}

private static final CharSequence l(String var0) {
long var1 = d ^ 36763690062698L;
_g[] var10000 = vm.a<"Å">(6635035184192265097L, var1);
Intrinsics.checkNotNullParameter(var0, "s");
_g[] var3 = var10000;
String var4 = var0;

label27: {
label26: {
try {
var10 = var4.length();
if (var3 == null) {
break label27;
}

if (var10 > 0) {
break label26;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, 6631416051731679204L, var1);
}

var10 = 0;
break label27;
}

var10 = 1;
}

String var15;
if (var10 != 0) {
StringBuilder var11 = new StringBuilder();
char var5 = var0.charAt(0);
StringBuilder var7 = var11;
byte var6 = 0;
String var12 = String.valueOf(var5);
Intrinsics.checkNotNull(var12, a<"e">(4222, 2540198661239619467L ^ var1));
String var13 = var12.toUpperCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var13, a<"e">(6570, 8293645544954017362L ^ var1));
StringBuilder var14 = var7.append(var13);
var6 = 1;
String var10001 = var0.substring(var6);
Intrinsics.checkNotNullExpressionValue(var10001, a<"e">(21786, 3645346982035815137L ^ var1));
var15 = var14.append(var10001).toString();
} else {
var15 = var0;
}

return var15;
}

private static final CharSequence x(String var0) {
long var1 = d ^ 88525401122494L;
Intrinsics.checkNotNullParameter(var0, "s");
_g[] var10000 = vm.a<"Å">(-1603263100951843235L, var1);
String var4 = var0;
_g[] var3 = var10000;

label27: {
label26: {
try {
var10 = var4.length();
if (var3 == null) {
break label27;
}

if (var10 > 0) {
break label26;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -1597664958157163984L, var1);
}

var10 = 0;
break label27;
}

var10 = 1;
}

String var15;
if (var10 != 0) {
StringBuilder var11 = new StringBuilder();
char var5 = var0.charAt(0);
StringBuilder var7 = var11;
byte var6 = 0;
String var12 = String.valueOf(var5);
Intrinsics.checkNotNull(var12, a<"e">(4222, 2540286193873291871L ^ var1));
String var13 = var12.toUpperCase(Locale.ROOT);
Intrinsics.checkNotNullExpressionValue(var13, a<"e">(6570, 8293523036184085382L ^ var1));
StringBuilder var14 = var7.append(var13);
var6 = 1;
String var10001 = var0.substring(var6);
Intrinsics.checkNotNullExpressionValue(var10001, a<"e">(21786, 3645292439267233589L ^ var1));
var15 = var14.append(var10001).toString();
} else {
var15 = var0;
}

return var15;
}

static {
long var16 = d ^ 59613837250086L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[15];
int var23 = 0;
String var22 = "\u0080¼¯Ûe\u0080Ä±²²;°8Óà=J\u0092±\u000f¸È\u0083d\u0010h¼-õEá\r°¹\u009d)\u0013\u008eë|mXjÅµøeÓD¿2W\u0014\u0082\u00adlÖóî\u0003¿gÇG}M\u0019C@¡\u008eËÃ¤\u0011Kúª½^MH\u00ad'åDÅ\u009fúèEß\u0082Áóõ¨h\u009d\u0083c\u0015×çL,©6\u001aÆÀÑ\u0090\u0004\u007fÚk½\u009d\u0017o\u000b\u0092e\u0002\t\u008eÌù÷(DóäÓ\u0016+]¦Í_\u001c¾Ï¯ÖÍÁg\u0016\u00adê\u0015drüIÇ1\u0013w\u0015\u008a¦%p%+\u0004Þù(|\u0095\ns8Ç\u0082ò\u001d²\u001b×Ç_û¼~@\u0007ùA\u0095voXk`tØã\u0085!,sYI\u0083É\u001e'(U\u0012\u0007'^K½ÒÑ\u0003©hi÷\u0095Z\u007fø\u0095´2\u001ac¹É\u001a@\u0081¼Ô}?\u0012Ø\u009bS\u0085°\u001au\u0010¾\u00825+c \u0093\u0001i¡ð±Jã7\u0097 õ0\u0015\u007f¡þÆK{ÑOèW½\u001aÂ6\u0095ÛºìE\u000b¥ÇòÀOfP?Å0UÜ\u0098jO0\u009cy\\\u0014³3êWlA×K¯³\röv'ûO\u0014ÿ\u008a:\u0091ø\u0011\u0015y-\u009bÊ[{\u0091\u009a¤ßèÓ9ZX\u009a$,#\u000f\u000fË\u0090ÁÉ\u0088|Ûÿ\u008aµK\u0002Ì\\Û\u0089´»®@\u0094'â?Ì,x\u0089ÓÐ\u0085\u009dåh\n\u0006N£\u0080×Pq\t^X§@4\u0006'\u0083\u0093së\u0007ÝØS\u000ek\u000e¶àÜnÅ´<V·c\tTÔ\u0086ÑSôt¸pó\u0018jm\u001fÏÎÆñùü]r\u0098\u0097ªì9¢o,Ñ¦ÀÛ\u0003(Á\u008172/l\f\u0090®Õ\u0088\u0090³ÎQ\u0098@,\u0087î.£\u0084ð¨G\u0090vHÑ\f\u0089\nöG\ndÎ\u008ad\u0018Cè\u001f\u000fù\u0095ø\u007f\tö¯\u0012W\u0096èðå\u0017âkÏ^{W";
int var24 = "\u0080¼¯Ûe\u0080Ä±²²;°8Óà=J\u0092±\u000f¸È\u0083d\u0010h¼-õEá\r°¹\u009d)\u0013\u008eë|mXjÅµøeÓD¿2W\u0014\u0082\u00adlÖóî\u0003¿gÇG}M\u0019C@¡\u008eËÃ¤\u0011Kúª½^MH\u00ad'åDÅ\u009fúèEß\u0082Áóõ¨h\u009d\u0083c\u0015×çL,©6\u001aÆÀÑ\u0090\u0004\u007fÚk½\u009d\u0017o\u000b\u0092e\u0002\t\u008eÌù÷(DóäÓ\u0016+]¦Í_\u001c¾Ï¯ÖÍÁg\u0016\u00adê\u0015drüIÇ1\u0013w\u0015\u008a¦%p%+\u0004Þù(|\u0095\ns8Ç\u0082ò\u001d²\u001b×Ç_û¼~@\u0007ùA\u0095voXk`tØã\u0085!,sYI\u0083É\u001e'(U\u0012\u0007'^K½ÒÑ\u0003©hi÷\u0095Z\u007fø\u0095´2\u001ac¹É\u001a@\u0081¼Ô}?\u0012Ø\u009bS\u0085°\u001au\u0010¾\u00825+c \u0093\u0001i¡ð±Jã7\u0097 õ0\u0015\u007f¡þÆK{ÑOèW½\u001aÂ6\u0095ÛºìE\u000b¥ÇòÀOfP?Å0UÜ\u0098jO0\u009cy\\\u0014³3êWlA×K¯³\röv'ûO\u0014ÿ\u008a:\u0091ø\u0011\u0015y-\u009bÊ[{\u0091\u009a¤ßèÓ9ZX\u009a$,#\u000f\u000fË\u0090ÁÉ\u0088|Ûÿ\u008aµK\u0002Ì\\Û\u0089´»®@\u0094'â?Ì,x\u0089ÓÐ\u0085\u009dåh\n\u0006N£\u0080×Pq\t^X§@4\u0006'\u0083\u0093së\u0007ÝØS\u000ek\u000e¶àÜnÅ´<V·c\tTÔ\u0086ÑSôt¸pó\u0018jm\u001fÏÎÆñùü]r\u0098\u0097ªì9¢o,Ñ¦ÀÛ\u0003(Á\u008172/l\f\u0090®Õ\u0088\u0090³ÎQ\u0098@,\u0087î.£\u0084ð¨G\u0090vHÑ\f\u0089\nöG\ndÎ\u008ad\u0018Cè\u001f\u000fù\u0095ø\u007f\tö¯\u0012W\u0096èðå\u0017âkÏ^{W"
.length();
char var21 = 24;
int var29 = -1;

label64:
while (true) {
String var30 = var22.substring(++var29, var29 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = b(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var43;
if ((var29 += var21) >= var24) {
e = var25;
f = new String[15];
l = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[13];
int var8 = 0;
String var9 = "w»VÜ\"\u0094¿Ø\t¢[á\u000e\u0093\u0003cÀ,ðar\u0086Pw¼t;*Q\u00990\u008d<«Æ\b(:Èâdúè\u0013FX^ý\u0015PS\u0012l4J\u0092\u001euI\u0011\u0001&\u00ad¨>¦\u008eLa,óÞÐgc\t\u0005ÛÛ\u0013\u001a9°*û«-C";
int var10 = "w»VÜ\"\u0094¿Ø\t¢[á\u000e\u0093\u0003cÀ,ðar\u0086Pw¼t;*Q\u00990\u008d<«Æ\b(:Èâdúè\u0013FX^ý\u0015PS\u0012l4J\u0092\u001euI\u0011\u0001&\u00ad¨>¦\u008eLa,óÞÐgc\t\u0005ÛÛ\u0013\u001a9°*û«-C"
.length();
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
h = var11;
k = new Integer[13];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -290530894167218210L;
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
m = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "\u001e\u00970Í]¶køZ'\u0015\u008c\r¨BÊ";
var10 = "\u001e\u00970Í]¶køZ'\u0015\u008c\r¨BÊ".length();
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

var22 = "\u0095|Bo3¨X¬R\u0087\u000f®\u0091\u00855Ã(þ}I\u001aÛJ\r\t\u0092\u00932LôC0¬\u009d³U{UxUÏ\u000b\u0082\u0087 GÂ&\u0017ó«\u0093\u009c§{´+";
var24 = "\u0095|Bo3¨X¬R\u0087\u000f®\u0091\u00855Ã(þ}I\u001aÛJ\r\t\u0092\u00932LôC0¬\u009d³U{UxUÏ\u000b\u0082\u0087 GÂ&\u0017ó«\u0093\u009c§{´+".length();
var21 = 16;
var29 = -1;
}

var30 = var22.substring(++var29, var29 + var21);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String b(byte[] var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29424;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/rf", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = e[var5].getBytes("ISO-8859-1");
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
throw new RuntimeException("su/catlean/rf" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 628;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/rf", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
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
throw new RuntimeException("su/catlean/rf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
