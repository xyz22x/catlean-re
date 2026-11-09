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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class nr {
@NotNull
private gr I;
private float A;
private float n;
@NotNull
private String y;
@NotNull
private i0 U;
@NotNull
private final List r;
private float e;
private static final long a = yz.a(6372192607014350181L, -6895057981393438557L, MethodHandles.lookup().lookupClass()).a(221304856914690L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public nr(@NotNull gr type, long a, float x, float y, @NotNull String elementId, @NotNull i0 configType) {
ax = a ^ ax;
long var10001 = ax ^ 110539022780616L;
int var8 = (int)((ax ^ 110539022780616L) >>> 32);
int var9 = (int)((ax ^ 110539022780616L) << 32 >>> 48);
int var10 = (int)(var10001 << 48 >>> 48);
var10001 = ax ^ 127823536951603L;
int var11 = (int)((ax ^ 127823536951603L) >>> 32);
int var12 = (int)((ax ^ 127823536951603L) << 32 >>> 48);
int var13 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(type, a<"s">(10309, 1026402216618380740L ^ ax));
Intrinsics.checkNotNullParameter(elementId, a<"s">(1321, 3690868323821445293L ^ ax));
Intrinsics.checkNotNullParameter(configType, a<"s">(9374, 5882898770664145171L ^ ax));
super();
this.I = type;
_g[] var10000 = vm.a<"Å">(2854480520690051578L, ax);
this.A = x;
this.n = yx;
this.y = elementId;
this.U = configType;
_g[] var14 = var10000;

label31: {
label22: {
try {
this.r = new ArrayList();
this.e = 62.0F;
var18 = this;
if (var14 == null) {
break label22;
}

if (this.I == gr.Config) {
break label31;
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 2776781237330490069L, ax);
}

var18 = this;
}

var18.r.add(new tv(var11, var12, i4.h.E(var8, a<"s">(8887, 2744773768454522677L ^ ax), var9, new Object[0], var10), nr::q, var13));
return;
}

List var19 = this.r;
tv[] var15 = new tv[]{
new tv(var11, var12, i4.h.E(var8, a<"s">(20877, 3051544121437697034L ^ ax), var9, new Object[0], var10), nr::K, var13),
new tv(var11, var12, i4.h.E(var8, a<"s">(25591, 6205587977953379954L ^ ax), var9, new Object[0], var10), nr::E, var13),
new tv(var11, var12, i4.h.E(var8, a<"s">(11131, 4239722450089594616L ^ ax), var9, new Object[0], var10), nr::e, var13)
};
var19.addAll(CollectionsKt.listOf(var15));
}

public nr(gr var1, float var2, long var3, float var5, String var6, i0 var7, int var8, DefaultConstructorMarker var9) {
var3 = a ^ var3;
long var10 = var3 ^ 96890278734619L;
if ((var8 & 2) != 0) {
var2 = 0.0F;
}

if ((var8 & 4) != 0) {
var5 = 0.0F;
}

if ((var8 & b<"t">(2222, 5067967104275878064L ^ var3)) != 0) {
var6 = "";
}

if ((var8 & b<"t">(3700, 1097159615780722284L ^ var3)) != 0) {
var7 = i0.MODULES;
}

this(var1, var10, var2, var5, var6, var7);
}

@NotNull
public final gr B() {
return this.I;
}

public final void i(long a, @NotNull gr <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"s">(8271, 4994605043767423306L ^ ax));
this.I = <set-?>;
}

public final float T() {
return this.A;
}

public final void s(float <set-?>) {
this.A = <set-?>;
}

public final float K() {
return this.n;
}

public final void f(float <set-?>) {
this.n = <set-?>;
}

@NotNull
public final i0 n() {
return this.U;
}

public final void S(long a, @NotNull i0 <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"s">(2817, 5455319230584399392L ^ ax));
this.U = <set-?>;
}

public final float I() {
return this.e;
}

public final void r(float <set-?>) {
this.e = <set-?>;
}

public final void O(int a, @NotNull class_332 context, int mouseX, int mouseY, int a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 5
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 32
// 00d: lushr
// 00e: lor
// 00f: iload 6
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/nr.a J
// 01c: lxor
// 01d: lstore 7
// 01f: lload 7
// 021: dup2
// 022: ldc2_w 128836436973985
// 025: lxor
// 026: dup2
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 16
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: dup2
// 038: bipush 32
// 03a: lshl
// 03b: bipush 32
// 03d: lushr
// 03e: l2i
// 03f: istore 11
// 041: pop2
// 042: dup2
// 043: ldc2_w 22680622134638
// 046: lxor
// 047: lstore 12
// 049: dup2
// 04a: ldc2_w 91464289363313
// 04d: lxor
// 04e: lstore 14
// 050: pop2
// 051: ldc2_w -459075121510451258
// 054: lload 7
// 056: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: aload 2
// 05c: sipush 3476
// 05f: ldc2_w 5060758891686376996
// 062: lload 7
// 064: lxor
// 065: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/nr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06d: aload 0
// 06e: getfield su/catlean/nr.r Ljava/util/List;
// 071: invokeinterface java/util/List.size ()I 1
// 076: i2f
// 077: ldc 14.0
// 079: fmul
// 07a: fconst_2
// 07b: fadd
// 07c: fstore 20
// 07e: astore 19
// 080: aload 2
// 081: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 084: dup
// 085: sipush 26148
// 088: ldc2_w 1764329146823171486
// 08b: lload 7
// 08d: lxor
// 08e: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/nr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 096: aload 0
// 097: getfield su/catlean/nr.A F
// 09a: iload 9
// 09c: i2c
// 09d: swap
// 09e: aload 0
// 09f: getfield su/catlean/nr.n F
// 0a2: aload 0
// 0a3: getfield su/catlean/nr.e F
// 0a6: fload 20
// 0a8: ldc 4.0
// 0aa: fconst_1
// 0ab: ldc 0.07
// 0ad: fconst_1
// 0ae: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0b1: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 0b4: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 0b7: dup
// 0b8: sipush 29328
// 0bb: ldc2_w 4636493256548141348
// 0be: lload 7
// 0c0: lxor
// 0c1: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/nr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0cc: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 0cf: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 0d2: dup
// 0d3: sipush 31092
// 0d6: ldc2_w 7340533264361931459
// 0d9: lload 7
// 0db: lxor
// 0dc: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/nr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e4: fconst_0
// 0e5: iload 10
// 0e7: i2s
// 0e8: fconst_0
// 0e9: iload 11
// 0eb: fconst_0
// 0ec: sipush 12222
// 0ef: ldc2_w 3737339171664321194
// 0f2: lload 7
// 0f4: lxor
// 0f5: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: aconst_null
// 0fb: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 0fe: bipush 0
// 0ff: istore 21
// 101: aload 0
// 102: getfield su/catlean/nr.r Ljava/util/List;
// 105: checkcast java/lang/Iterable
// 108: astore 22
// 10a: bipush 0
// 10b: istore 23
// 10d: aload 22
// 10f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 114: astore 24
// 116: aload 24
// 118: invokeinterface java/util/Iterator.hasNext ()Z 1
// 11d: ifeq 3ad
// 120: aload 24
// 122: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 127: astore 25
// 129: aload 25
// 12b: checkcast su/catlean/tv
// 12e: astore 26
// 130: bipush 0
// 131: istore 27
// 133: aload 0
// 134: getfield su/catlean/nr.A F
// 137: fstore 28
// 139: aload 0
// 13a: getfield su/catlean/nr.A F
// 13d: aload 0
// 13e: getfield su/catlean/nr.e F
// 141: fadd
// 142: fstore 29
// 144: iload 3
// 145: i2f
// 146: fstore 30
// 148: aload 19
// 14a: ifnull 3b3
// 14d: fload 28
// 14f: fload 30
// 151: fcmpg
// 152: aload 19
// 154: iload 1
// 155: iflt 18f
// 158: ifnull 18d
// 15b: goto 169
// 15e: ldc2_w -525455911915131671
// 161: lload 7
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: ifgt 1b6
// 16c: goto 17a
// 16f: ldc2_w -525455911915131671
// 172: lload 7
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: fload 30
// 17c: fload 29
// 17e: fcmpg
// 17f: goto 18d
// 182: ldc2_w -525455911915131671
// 185: lload 7
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: aload 19
// 18f: ifnull 1b3
// 192: ifgt 1b2
// 195: goto 1a3
// 198: ldc2_w -525455911915131671
// 19b: lload 7
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: bipush 1
// 1a4: goto 1b7
// 1a7: ldc2_w -525455911915131671
// 1aa: lload 7
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: bipush 0
// 1b3: goto 1b7
// 1b6: bipush 0
// 1b7: ifeq 2e1
// 1ba: aload 0
// 1bb: getfield su/catlean/nr.n F
// 1be: bipush 2
// 1bf: i2f
// 1c0: fadd
// 1c1: iload 21
// 1c3: sipush 25811
// 1c6: ldc2_w 5805098528013291969
// 1c9: lload 7
// 1cb: lxor
// 1cc: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d1: imul
// 1d2: i2f
// 1d3: fadd
// 1d4: fstore 28
// 1d6: aload 0
// 1d7: getfield su/catlean/nr.n F
// 1da: sipush 17418
// 1dd: ldc2_w 4871858835120992540
// 1e0: lload 7
// 1e2: lxor
// 1e3: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: i2f
// 1e9: fadd
// 1ea: iload 21
// 1ec: sipush 17418
// 1ef: ldc2_w 4871858835120992540
// 1f2: lload 7
// 1f4: lxor
// 1f5: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: imul
// 1fb: i2f
// 1fc: fadd
// 1fd: fstore 29
// 1ff: iload 4
// 201: i2f
// 202: fstore 30
// 204: fload 28
// 206: fload 30
// 208: fcmpg
// 209: aload 19
// 20b: iload 5
// 20d: ifle 239
// 210: ifnull 237
// 213: ifgt 260
// 216: goto 224
// 219: ldc2_w -525455911915131671
// 21c: lload 7
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: fload 30
// 226: fload 29
// 228: fcmpg
// 229: goto 237
// 22c: ldc2_w -525455911915131671
// 22f: lload 7
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: aload 19
// 239: ifnull 25d
// 23c: ifgt 25c
// 23f: goto 24d
// 242: ldc2_w -525455911915131671
// 245: lload 7
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: bipush 1
// 24e: goto 261
// 251: ldc2_w -525455911915131671
// 254: lload 7
// 256: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: athrow
// 25c: bipush 0
// 25d: goto 261
// 260: bipush 0
// 261: ifeq 2e1
// 264: aload 2
// 265: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 268: dup
// 269: sipush 23759
// 26c: ldc2_w 4960004907670792051
// 26f: lload 7
// 271: lxor
// 272: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/nr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 27a: aload 0
// 27b: getfield su/catlean/nr.A F
// 27e: bipush 2
// 27f: i2f
// 280: fadd
// 281: iload 9
// 283: i2c
// 284: swap
// 285: aload 0
// 286: getfield su/catlean/nr.n F
// 289: bipush 2
// 28a: i2f
// 28b: fadd
// 28c: iload 21
// 28e: sipush 17418
// 291: ldc2_w 4871858835120992540
// 294: lload 7
// 296: lxor
// 297: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: imul
// 29d: i2f
// 29e: fadd
// 29f: aload 0
// 2a0: getfield su/catlean/nr.e F
// 2a3: bipush 4
// 2a4: i2f
// 2a5: fsub
// 2a6: ldc 12.0
// 2a8: fconst_2
// 2a9: fconst_2
// 2aa: ldc 0.1
// 2ac: fconst_1
// 2ad: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2b0: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 2b3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2b6: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 2b9: fconst_0
// 2ba: iload 10
// 2bc: i2s
// 2bd: fconst_0
// 2be: iload 11
// 2c0: fconst_0
// 2c1: sipush 20456
// 2c4: ldc2_w 2941981078695492349
// 2c7: lload 7
// 2c9: lxor
// 2ca: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: aconst_null
// 2d0: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 2d3: goto 2e1
// 2d6: ldc2_w -525455911915131671
// 2d9: lload 7
// 2db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e0: athrow
// 2e1: lload 14
// 2e3: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 2e6: aload 2
// 2e7: aload 26
// 2e9: invokevirtual su/catlean/tv.Q ()Ljava/lang/String;
// 2ec: aload 0
// 2ed: getfield su/catlean/nr.A F
// 2f0: bipush 5
// 2f1: i2f
// 2f2: fadd
// 2f3: aload 0
// 2f4: getfield su/catlean/nr.n F
// 2f7: bipush 2
// 2f8: i2f
// 2f9: fadd
// 2fa: iload 21
// 2fc: sipush 17418
// 2ff: ldc2_w 4871858835120992540
// 302: lload 7
// 304: lxor
// 305: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30a: imul
// 30b: i2f
// 30c: fadd
// 30d: iload 21
// 30f: aload 0
// 310: getfield su/catlean/nr.r Ljava/util/List;
// 313: invokeinterface java/util/List.size ()I 1
// 318: bipush 1
// 319: isub
// 31a: iload 5
// 31c: ifle 34d
// 31f: aload 19
// 321: ifnull 34d
// 324: if_icmpne 383
// 327: goto 335
// 32a: ldc2_w -525455911915131671
// 32d: lload 7
// 32f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 334: athrow
// 335: aload 0
// 336: getfield su/catlean/nr.r Ljava/util/List;
// 339: invokeinterface java/util/List.size ()I 1
// 33e: bipush 1
// 33f: goto 34d
// 342: ldc2_w -525455911915131671
// 345: lload 7
// 347: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34c: athrow
// 34d: if_icmple 383
// 350: new java/awt/Color
// 353: dup
// 354: sipush 16377
// 357: ldc2_w 6500563135672863465
// 35a: lload 7
// 35c: lxor
// 35d: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 362: bipush 0
// 363: bipush 0
// 364: sipush 16596
// 367: ldc2_w 4405159459818649031
// 36a: lload 7
// 36c: lxor
// 36d: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: invokespecial java/awt/Color.<init> (IIII)V
// 375: goto 386
// 378: ldc2_w -525455911915131671
// 37b: lload 7
// 37d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 382: athrow
// 383: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 386: astore 28
// 388: aload 28
// 38a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 38d: aload 28
// 38f: astore 16
// 391: fstore 17
// 393: fstore 18
// 395: lload 12
// 397: fload 18
// 399: fload 17
// 39b: aload 16
// 39d: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 3a0: iload 21
// 3a2: bipush 1
// 3a3: iadd
// 3a4: istore 21
// 3a6: nop
// 3a7: nop
// 3a8: aload 19
// 3aa: ifnonnull 116
// 3ad: nop
// 3ae: iload 6
// 3b0: iflt 3b3
// 3b3: return
}

public final void q(int a, float mX, float mY, short a, int button, short a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 4
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 32
// 00d: lushr
// 00e: lor
// 00f: iload 6
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/nr.a J
// 01c: lxor
// 01d: lstore 7
// 01f: ldc2_w -8651677649297077880
// 022: lload 7
// 024: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: bipush 0
// 02a: istore 10
// 02c: astore 9
// 02e: aload 0
// 02f: getfield su/catlean/nr.r Ljava/util/List;
// 032: checkcast java/lang/Iterable
// 035: astore 11
// 037: bipush 0
// 038: istore 12
// 03a: aload 11
// 03c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 041: astore 13
// 043: aload 13
// 045: invokeinterface java/util/Iterator.hasNext ()Z 1
// 04a: ifeq 1aa
// 04d: aload 13
// 04f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 054: astore 14
// 056: aload 14
// 058: checkcast su/catlean/tv
// 05b: astore 15
// 05d: bipush 0
// 05e: istore 16
// 060: aload 0
// 061: getfield su/catlean/nr.A F
// 064: fstore 17
// 066: aload 9
// 068: ifnull 1b0
// 06b: fload 2
// 06c: aload 0
// 06d: getfield su/catlean/nr.A F
// 070: aload 0
// 071: getfield su/catlean/nr.e F
// 074: fadd
// 075: fcmpg
// 076: aload 9
// 078: iload 6
// 07a: iflt 0b3
// 07d: ifnull 0b1
// 080: goto 08e
// 083: ldc2_w -8720327608363183449
// 086: lload 7
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: ifgt 0da
// 091: goto 09f
// 094: ldc2_w -8720327608363183449
// 097: lload 7
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: fload 17
// 0a1: fload 2
// 0a2: fcmpg
// 0a3: goto 0b1
// 0a6: ldc2_w -8720327608363183449
// 0a9: lload 7
// 0ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: athrow
// 0b1: aload 9
// 0b3: ifnull 0d7
// 0b6: ifgt 0d6
// 0b9: goto 0c7
// 0bc: ldc2_w -8720327608363183449
// 0bf: lload 7
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: bipush 1
// 0c8: goto 0db
// 0cb: ldc2_w -8720327608363183449
// 0ce: lload 7
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: bipush 0
// 0d7: goto 0db
// 0da: bipush 0
// 0db: ifeq 19d
// 0de: aload 0
// 0df: getfield su/catlean/nr.n F
// 0e2: bipush 2
// 0e3: i2f
// 0e4: fadd
// 0e5: iload 10
// 0e7: sipush 17418
// 0ea: ldc2_w 4871849520363491154
// 0ed: lload 7
// 0ef: lxor
// 0f0: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: imul
// 0f6: i2f
// 0f7: fadd
// 0f8: fstore 17
// 0fa: fload 3
// 0fb: aload 0
// 0fc: getfield su/catlean/nr.n F
// 0ff: sipush 17418
// 102: ldc2_w 4871849520363491154
// 105: lload 7
// 107: lxor
// 108: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: i2f
// 10e: fadd
// 10f: iload 10
// 111: sipush 17418
// 114: ldc2_w 4871849520363491154
// 117: lload 7
// 119: lxor
// 11a: invokedynamic t (IJ)I bsm=su/catlean/nr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: imul
// 120: i2f
// 121: fadd
// 122: fcmpg
// 123: aload 9
// 125: iload 1
// 126: iflt 151
// 129: ifnull 14f
// 12c: ifgt 178
// 12f: goto 13d
// 132: ldc2_w -8720327608363183449
// 135: lload 7
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: fload 17
// 13f: fload 3
// 140: fcmpg
// 141: goto 14f
// 144: ldc2_w -8720327608363183449
// 147: lload 7
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: aload 9
// 151: ifnull 175
// 154: ifgt 174
// 157: goto 165
// 15a: ldc2_w -8720327608363183449
// 15d: lload 7
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: bipush 1
// 166: goto 179
// 169: ldc2_w -8720327608363183449
// 16c: lload 7
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: bipush 0
// 175: goto 179
// 178: bipush 0
// 179: iload 1
// 17a: ifle 1a1
// 17d: ifeq 19d
// 180: aload 15
// 182: invokevirtual su/catlean/tv.L ()Lkotlin/jvm/functions/Function1;
// 185: aload 0
// 186: getfield su/catlean/nr.y Ljava/lang/String;
// 189: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 18e: pop
// 18f: goto 19d
// 192: ldc2_w -8720327608363183449
// 195: lload 7
// 197: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: athrow
// 19d: iload 10
// 19f: bipush 1
// 1a0: iadd
// 1a1: istore 10
// 1a3: nop
// 1a4: nop
// 1a5: aload 9
// 1a7: ifnonnull 043
// 1aa: nop
// 1ab: iload 4
// 1ad: ifle 1b0
// 1b0: return
}

private static final Unit K(nr var0, String var1) {
long var2 = a ^ 115509538969584L;
long var4 = var2 ^ 17811440729410L;
long var10001 = var2 ^ 29993031702272L;
int var6 = (int)((var2 ^ 29993031702272L) >>> 32);
int var7 = (int)((var2 ^ 29993031702272L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
_g[] var10000 = vm.a<"Å">(1026102306210742362L, var2);
Intrinsics.checkNotNullParameter(var1, a<"s">(27258, 5664476159684322896L ^ var2));
_g[] var9 = var10000;

label32: {
label31: {
try {
var12 = StringsKt.isBlank(var0.y);
if (var9 == null) {
break label32;
}

if (!var12) {
break label31;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 1092491960086403957L, var2);
}

var12 = false;
break label32;
}

var12 = true;
}

try {
if (var12) {
io.D(var0.y, var0.U, var6, (short)var7, var8);
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 1092491960086403957L, var2);
}

d2.O.c().L(var4);
return Unit.INSTANCE;
}

private static final Unit E(nr param0, String param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/nr.a J
// 003: ldc2_w 124044154027986
// 006: lxor
// 007: lstore 2
// 008: ldc2_w 7358718251759822968
// 00b: lload 2
// 00c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 011: aload 1
// 012: sipush 6236
// 015: ldc2_w 7643552840780233815
// 018: lload 2
// 019: lxor
// 01a: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/nr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 022: astore 4
// 024: aload 0
// 025: getfield su/catlean/nr.y Ljava/lang/String;
// 028: checkcast java/lang/CharSequence
// 02b: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
// 02e: aload 4
// 030: ifnull 044
// 033: ifne 047
// 036: goto 043
// 039: ldc2_w 7425123489119400791
// 03c: lload 2
// 03d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 042: athrow
// 043: bipush 1
// 044: goto 048
// 047: bipush 0
// 048: ifeq 0fd
// 04b: aload 0
// 04c: getfield su/catlean/nr.U Lsu/catlean/i0;
// 04f: getstatic su/catlean/i0.MODULES Lsu/catlean/i0;
// 052: if_acmpne 0b2
// 055: goto 062
// 058: ldc2_w 7425123489119400791
// 05b: lload 2
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: invokestatic net/minecraft/class_156.method_668 ()Lnet/minecraft/class_156$class_158;
// 065: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 068: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 06b: invokevirtual su/catlean/oc.U ()Ljava/io/File;
// 06e: astore 5
// 070: aload 5
// 072: astore 6
// 074: astore 8
// 076: bipush 0
// 077: istore 7
// 079: aload 4
// 07b: ifnull 0ad
// 07e: aload 6
// 080: invokevirtual java/io/File.exists ()Z
// 083: ifne 0a6
// 086: goto 093
// 089: ldc2_w 7425123489119400791
// 08c: lload 2
// 08d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: athrow
// 093: aload 6
// 095: invokevirtual java/io/File.createNewFile ()Z
// 098: pop
// 099: goto 0a6
// 09c: ldc2_w 7425123489119400791
// 09f: lload 2
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: aload 8
// 0a8: aload 5
// 0aa: invokevirtual net/minecraft/class_156$class_158.method_672 (Ljava/io/File;)V
// 0ad: aload 4
// 0af: ifnonnull 0fd
// 0b2: invokestatic net/minecraft/class_156.method_668 ()Lnet/minecraft/class_156$class_158;
// 0b5: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 0b8: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 0bb: invokevirtual su/catlean/oe.U ()Ljava/io/File;
// 0be: astore 5
// 0c0: aload 5
// 0c2: astore 6
// 0c4: astore 8
// 0c6: bipush 0
// 0c7: istore 7
// 0c9: aload 6
// 0cb: invokevirtual java/io/File.exists ()Z
// 0ce: aload 4
// 0d0: ifnull 0f5
// 0d3: ifne 0f6
// 0d6: goto 0e3
// 0d9: ldc2_w 7425123489119400791
// 0dc: lload 2
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: aload 6
// 0e5: invokevirtual java/io/File.createNewFile ()Z
// 0e8: goto 0f5
// 0eb: ldc2_w 7425123489119400791
// 0ee: lload 2
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: pop
// 0f6: aload 8
// 0f8: aload 5
// 0fa: invokevirtual net/minecraft/class_156$class_158.method_672 (Ljava/io/File;)V
// 0fd: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 100: areturn
}

private static final Unit e(nr var0, String var1) {
long var2 = a ^ 78370454728613L;
long var4 = var2 ^ 104689664284285L;
long var10001 = var2 ^ 36447584158200L;
int var6 = (int)((var2 ^ 36447584158200L) >>> 32);
int var7 = (int)((var2 ^ 36447584158200L) << 32 >>> 56);
int var8 = (int)(var10001 << 40 >>> 40);
_g[] var10000 = vm.a<"Å">(-5302886490073581553L, var2);
Intrinsics.checkNotNullParameter(var1, a<"s">(6236, 7643573225691278368L ^ var2));
_g[] var9 = var10000;

label32: {
label31: {
try {
var12 = StringsKt.isBlank(var0.y);
if (var9 == null) {
break label32;
}

if (!var12) {
break label31;
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, -5225193786870652128L, var2);
}

var12 = false;
break label32;
}

var12 = true;
}

try {
if (var12) {
io.g(var6, (byte)var7, var1, var0.U, var8);
ir.r.l(null);
ir.r.Y(var4);
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, -5225193786870652128L, var2);
}

return Unit.INSTANCE;
}

private static final Unit q(nr var0, String var1) {
long var2 = a ^ 134084731449793L;
long var10001 = var2 ^ 112922364142067L;
int var4 = (int)((var2 ^ 112922364142067L) >>> 48);
int var5 = (int)((var2 ^ 112922364142067L) << 16 >>> 32);
int var6 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(var1, a<"s">(6236, 7643545274108293700L ^ var2));
ir.r.f(null);
ir.r.l(new p9(var0.U, (char)var4, var5, (char)var6));
return Unit.INSTANCE;
}

static {
long var11 = a ^ 15286683413929L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[16];
int var18 = 0;
String var17 = "\u0013ÞÐU%´¾GuQG ²\u0094´\u0019 ¾\u0089»\u008cÓ©Z¬`¡\u0086ÜÖ\u009e&\u0096®#¾/|¸ßWTÂ\u0004\u0093n#ö\u001f(\b\"Û\u008a\u00ad p÷Û\u00ad\u001eq\u0005LF¡³Ea\týF4\u0089Û¶ÌeÌX0\u008aúQë=ÀàK¬(\u000e\u008b\u0095P¸,Ü%¿Æ\u0092ú4¯W.\u0019\u008d¼~+f\u0098\u000f\u0006Eþ³eû\u001a\u0080Êºw\"Ñfr\u007f8g¬Z\u0015\u000b\u0083ìÿ\u0092\u008eP¼\u0005\u0015\u000e\u0017/¢ýÝáÎØ\u0094Ï°Î\u0017i{6\u0006\u008e;\u009ea\u00adBEVÅ3í¾³Ó<º?C$Xp)s¾ Iâoâøo)L©¯\u008då±oÆw*TEµW\u001cJÍÑE\u0099òwët\u008d(Ñ\u000e*¿J\u007f\u000bÌ\b@\u000e\u00ad\u0085¼½\u0012\u008cû ]åÜ¢O}RU\u009d00'\u001f\u0000©ä\u001caçl½ \u000bÇ÷n\u009f?\u0007S¯W[øD+õ8\u008dGA\u0099Ó\u00974\nõòÒoãe\"¡\u0010\u0007I/Î©øÍ\tþ\u008bÓ{Íº§Ü +³¬eÞéï~JÕ\u001c\"&H½PÞ5gK|¯Ó\u0018}[\u0015¤Ýó\u0005¦ ±9\u000fïÏÙ|Võ¶©ÏØç-í\u0016ºíPA®ÍÕ\u009cu¤\u000eN\"ý^\u0010\u008b÷â\u00adA\u001dÀ\u009f¹ÝØwÇ\u0017Ûÿ\u0018\u0012\u009bö9£\\\u0084¼¾[|íK\u0096chµÜ\fó[Ñ\u0081\u0088\u0010\n«Ü\u0011å»Ëí$ÊMt\u000f¨\u0096½";
int var19 = "\u0013ÞÐU%´¾GuQG ²\u0094´\u0019 ¾\u0089»\u008cÓ©Z¬`¡\u0086ÜÖ\u009e&\u0096®#¾/|¸ßWTÂ\u0004\u0093n#ö\u001f(\b\"Û\u008a\u00ad p÷Û\u00ad\u001eq\u0005LF¡³Ea\týF4\u0089Û¶ÌeÌX0\u008aúQë=ÀàK¬(\u000e\u008b\u0095P¸,Ü%¿Æ\u0092ú4¯W.\u0019\u008d¼~+f\u0098\u000f\u0006Eþ³eû\u001a\u0080Êºw\"Ñfr\u007f8g¬Z\u0015\u000b\u0083ìÿ\u0092\u008eP¼\u0005\u0015\u000e\u0017/¢ýÝáÎØ\u0094Ï°Î\u0017i{6\u0006\u008e;\u009ea\u00adBEVÅ3í¾³Ó<º?C$Xp)s¾ Iâoâøo)L©¯\u008då±oÆw*TEµW\u001cJÍÑE\u0099òwët\u008d(Ñ\u000e*¿J\u007f\u000bÌ\b@\u000e\u00ad\u0085¼½\u0012\u008cû ]åÜ¢O}RU\u009d00'\u001f\u0000©ä\u001caçl½ \u000bÇ÷n\u009f?\u0007S¯W[øD+õ8\u008dGA\u0099Ó\u00974\nõòÒoãe\"¡\u0010\u0007I/Î©øÍ\tþ\u008bÓ{Íº§Ü +³¬eÞéï~JÕ\u001c\"&H½PÞ5gK|¯Ó\u0018}[\u0015¤Ýó\u0005¦ ±9\u000fïÏÙ|Võ¶©ÏØç-í\u0016ºíPA®ÍÕ\u009cu¤\u000eN\"ý^\u0010\u008b÷â\u00adA\u001dÀ\u009f¹ÝØwÇ\u0017Ûÿ\u0018\u0012\u009bö9£\\\u0084¼¾[|íK\u0096chµÜ\fó[Ñ\u0081\u0088\u0010\n«Ü\u0011å»Ëí$ÊMt\u000f¨\u0096½"
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
c = new String[16];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[8];
int var3 = 0;
String var4 = "Ò\u0084&\f@6 \u0092ù@2]@iKJaìjãAÁ)àñKæ\bü\u007f{Eù~\u0083\u0001\u0018h~Ó\u001d9áp\u0012\n»·";
int var5 = "Ò\u0084&\f@6 \u0092ù@2]@iKJaìjãAÁ)àñKæ\bü\u007f{Eù~\u0083\u0001\u0018h~Ó\u001d9áp\u0012\n»·".length();
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
g = new Integer[8];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = ")\u0000f\u001b7¿#Ö\u008b~#\u0088ÔGO\u000e";
var5 = ")\u0000f\u001b7¿#Ö\u008b~#\u0088ÔGO\u000e".length();
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

var17 = "3\"\u008c\u001fº\t-îP\u0097õD÷i¾ \u0010\få\u009a\u0002{\u0090¸±\u0002;Ý,Ax*\u0014";
var19 = "3\"\u008c\u001fº\t-îP\u0097õD÷i¾ \u0010\få\u009a\u0002{\u0090¸±\u0002;Ý,Ax*\u0014".length();
var16 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17407;
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
throw new RuntimeException("su/catlean/nr", var10);
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
throw new RuntimeException("su/catlean/nr" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 3410;
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
throw new RuntimeException("su/catlean/nr", var14);
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
throw new RuntimeException("su/catlean/nr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
