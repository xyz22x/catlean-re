package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ry {
@NotNull
private final nd e;
private int x;
private int j;
private int W;
private int u;
private int g;
private float n;
private float C;
@NotNull
private fl D;
@NotNull
private fl S;
private int t;
@NotNull
private final ArrayList F;
@NotNull
private final ArrayList V;
@NotNull
private final fd Y;
@NotNull
private final fd P;
@NotNull
private final fd q;
@Nullable
private tw o;
private boolean T;
private static final long a = yz.a(-2612193076119182194L, 1906156425104328316L, MethodHandles.lookup().lookupClass()).a(170863618330489L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] h;
private static final Map i;
private static final long[] k;
private static final Long[] l;
private static final Map m;

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public ry(char a, @NotNull nd category, long a, int offset) {
long var6 = ((long)axx << 48 | ax << 16 >>> 16) ^ a;
long var8 = var6 ^ 130475353778758L;
long var10 = var6 ^ 118191751005842L;
long var12 = var6 ^ 54942112791236L;
long var14 = var6 ^ 19480057894091L;
Intrinsics.checkNotNullParameter(category, a<"v">(22243, 4409942458055389099L ^ var6));
super();
this.e = category;
this.x = offset;
this.j = (int)(zf.F(var8).method_22683().method_4486() / 2.0F + (this.x - 2) * 125.0F);
this.W = b<"n">(12820, 579964761967074793L ^ var6);
this.u = this.j;
this.g = this.W;
this.n = 120.0F;
this.C = 350.0F;
this.t = -1;
this.F = new ArrayList();
this.V = new ArrayList();
this.Y = new fd(_s.OUT_QUINT, c<"o">(16723, 1399083168731350086L ^ var6), var14);
this.P = new fd(_s.OUT_EXPO, c<"o">(20951, 4431693654185071809L ^ var6), var14);
this.q = new fd(_s.OUT_QUINT, c<"o">(32581, 6687247758505704018L ^ var6), var14);
this.T = true;
int var16 = 0;
Iterable var17 = iq.a.L();
boolean var18 = false;
var17 = CollectionsKt.sortedWith(var17, new rc());
var18 = false;
Iterator var19 = var17.iterator();

int var10000;
while (true) {
if (var19.hasNext()) {
Object var20 = var19.next();
_g var21 = (_g)var20;
boolean var22 = false;
if (axx >= 0) {
var10000 = this.e.B().contains(var21.N());
if (ax < 0L) {
break;
}

if (var10000 != 0) {
this.V.add(new tw(this, var12, var21, this.j + 3.0F, this.W + 45.0F + b<"n">(13881, 456586398601583052L ^ var6) * var16));
var16++;
}
}

if (ax > 0L) {
continue;
}
}

try {
var10000 = this.e.B().size();
break;
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, -679524185873046676L, var6);
}
}

byte var10001;
label67: {
try {
var10001 = 2;
if (axx < 0) {
break label67;
}

if (var10000 == 2) {
this.F.add(new fl(var10, 0.0F, 54.0F, (fu)this.e.B().get(0), null, b<"n">(9612, 7485980411210861171L ^ var6), null));
this.F.add(new fl(var10, 56.0F, 54.0F, (fu)this.e.B().get(1), null, b<"n">(23083, 2723836893320082909L ^ var6), null));
}
} catch (NumberFormatException var28) {
throw vm.a<"Å">(var28, -679524185873046676L, var6);
}

try {
var10000 = this.e.B().size();
var10001 = 3;
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, -679524185873046676L, var6);
}
}

label83: {
label57: {
try {
if (axx < 0) {
break label57;
}

if (var10000 == var10001) {
this.F.add(new fl(var10, 0.0F, 35.5F, (fu)this.e.B().get(0), null, b<"n">(23083, 2723836893320082909L ^ var6), null));
this.F.add(new fl(var10, 37.5F, 35.5F, (fu)this.e.B().get(1), null, b<"n">(23083, 2723836893320082909L ^ var6), null));
this.F.add(new fl(var10, 74.5F, 35.5F, (fu)this.e.B().get(2), null, b<"n">(23083, 2723836893320082909L ^ var6), null));
}
} catch (NumberFormatException var27) {
throw vm.a<"Å">(var27, -679524185873046676L, var6);
}

try {
var31 = this;
if (axx < 0) {
break label83;
}

var10000 = this.e.B().size();
var10001 = 4;
} catch (NumberFormatException var26) {
throw vm.a<"Å">(var26, -679524185873046676L, var6);
}
}

try {
if (var10000 == var10001) {
this.F.add(new fl(var10, 0.0F, 27.0F, (fu)this.e.B().get(0), null, b<"n">(23083, 2723836893320082909L ^ var6), null));
this.F.add(new fl(var10, 28.0F, 27.0F, (fu)this.e.B().get(1), null, b<"n">(23083, 2723836893320082909L ^ var6), null));
this.F.add(new fl(var10, 56.0F, 27.0F, (fu)this.e.B().get(2), null, b<"n">(23083, 2723836893320082909L ^ var6), null));
this.F.add(new fl(var10, 83.0F, 27.0F, (fu)this.e.B().get(3), null, b<"n">(23083, 2723836893320082909L ^ var6), null));
}
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, -679524185873046676L, var6);
}

Object var32 = this.F.get(0);
Intrinsics.checkNotNullExpressionValue(var32, a<"v">(2033, 7190896570646019771L ^ var6));
this.D = (fl)var32;
var31 = this;
}

var31.S = this.D;
}

@NotNull
public final nd m() {
return this.e;
}

public final int I() {
return this.x;
}

public final void u(int <set-?>) {
this.x = <set-?>;
}

public final int h() {
return this.j;
}

public final void v(int <set-?>) {
this.j = <set-?>;
}

public final int q() {
return this.W;
}

public final void n(int <set-?>) {
this.W = <set-?>;
}

public final int A() {
return this.u;
}

public final void L(int <set-?>) {
this.u = <set-?>;
}

public final int W() {
return this.g;
}

public final void J(int <set-?>) {
this.g = <set-?>;
}

public final float X() {
return this.n;
}

public final void M(float <set-?>) {
this.n = <set-?>;
}

public final float L() {
return this.C;
}

public final void L(float <set-?>) {
this.C = <set-?>;
}

@NotNull
public final fl U() {
return this.D;
}

public final void P(@NotNull fl <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"v">(8787, 757751371168070442L ^ ax));
this.D = <set-?>;
}

@NotNull
public final ArrayList T() {
return this.F;
}

@NotNull
public final ArrayList E() {
return this.V;
}

@Nullable
public final tw Y() {
return this.o;
}

public final void u(@Nullable tw <set-?>) {
this.o = <set-?>;
}

public final boolean B() {
return this.T;
}

public final void n(boolean <set-?>) {
this.T = <set-?>;
}

public final void O(@NotNull class_332 context, int mouseX, long a, int mouseY) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ry.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 48537750473995
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 18597964426020
// 012: lxor
// 013: lstore 8
// 015: dup2
// 016: ldc2_w 42752259319625
// 019: lxor
// 01a: lstore 10
// 01c: dup2
// 01d: ldc2_w 40801666089590
// 020: lxor
// 021: lstore 12
// 023: dup2
// 024: ldc2_w 84990127924921
// 027: lxor
// 028: lstore 14
// 02a: dup2
// 02b: ldc2_w 126514375008899
// 02e: lxor
// 02f: lstore 16
// 031: dup2
// 032: ldc2_w 84353146164839
// 035: lxor
// 036: lstore 18
// 038: dup2
// 039: ldc2_w 58965875896888
// 03c: lxor
// 03d: dup2
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 20
// 044: dup2
// 045: bipush 16
// 047: lshl
// 048: bipush 32
// 04a: lushr
// 04b: l2i
// 04c: istore 21
// 04e: dup2
// 04f: bipush 48
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 22
// 058: pop2
// 059: dup2
// 05a: ldc2_w 48582453696075
// 05d: lxor
// 05e: dup2
// 05f: bipush 32
// 061: lushr
// 062: l2i
// 063: istore 23
// 065: dup2
// 066: bipush 32
// 068: lshl
// 069: bipush 48
// 06b: lushr
// 06c: l2i
// 06d: istore 24
// 06f: dup2
// 070: bipush 48
// 072: lshl
// 073: bipush 48
// 075: lushr
// 076: l2i
// 077: istore 25
// 079: pop2
// 07a: dup2
// 07b: ldc2_w 30917324800428
// 07e: lxor
// 07f: lstore 26
// 081: dup2
// 082: ldc2_w 116170156658062
// 085: lxor
// 086: lstore 28
// 088: dup2
// 089: ldc2_w 5994986177132
// 08c: lxor
// 08d: lstore 30
// 08f: dup2
// 090: ldc2_w 58740039525430
// 093: lxor
// 094: lstore 32
// 096: dup2
// 097: ldc2_w 56854114150885
// 09a: lxor
// 09b: lstore 34
// 09d: dup2
// 09e: ldc2_w 134190019562934
// 0a1: lxor
// 0a2: lstore 36
// 0a4: pop2
// 0a5: ldc2_w -3354624552021941017
// 0a8: lload 3
// 0a9: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: aload 1
// 0af: sipush 15704
// 0b2: ldc2_w 6512656462824579927
// 0b5: lload 3
// 0b6: lxor
// 0b7: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0bf: istore 43
// 0c1: lload 28
// 0c3: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 0c6: ldc 50.0
// 0c8: invokevirtual su/catlean/c6.b (F)V
// 0cb: lload 18
// 0cd: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 0d0: ldc 50.0
// 0d2: invokevirtual su/catlean/c6.b (F)V
// 0d5: aload 0
// 0d6: iload 43
// 0d8: ifeq 163
// 0db: getfield su/catlean/ry.T Z
// 0de: ifeq 147
// 0e1: goto 0ee
// 0e4: ldc2_w -3324638569963912159
// 0e7: lload 3
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: aload 0
// 0ef: lload 6
// 0f1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f4: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 0f7: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 0fa: bipush 2
// 0fb: idiv
// 0fc: aload 0
// 0fd: getfield su/catlean/ry.x I
// 100: bipush 2
// 101: isub
// 102: sipush 18280
// 105: ldc2_w 6677579763364777938
// 108: lload 3
// 109: lxor
// 10a: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: imul
// 110: iadd
// 111: putfield su/catlean/ry.j I
// 114: aload 0
// 115: sipush 25115
// 118: ldc2_w 1242755949936732844
// 11b: lload 3
// 11c: lxor
// 11d: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: putfield su/catlean/ry.W I
// 125: aload 0
// 126: aload 0
// 127: getfield su/catlean/ry.j I
// 12a: putfield su/catlean/ry.u I
// 12d: aload 0
// 12e: aload 0
// 12f: getfield su/catlean/ry.W I
// 132: putfield su/catlean/ry.g I
// 135: aload 0
// 136: bipush 0
// 137: putfield su/catlean/ry.T Z
// 13a: goto 147
// 13d: ldc2_w -3324638569963912159
// 140: lload 3
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: aload 0
// 148: aload 0
// 149: aload 0
// 14a: getfield su/catlean/ry.j I
// 14d: i2f
// 14e: lload 34
// 150: dup2_x1
// 151: pop2
// 152: aload 0
// 153: getfield su/catlean/ry.u I
// 156: i2f
// 157: ldc 13.0
// 159: invokespecial su/catlean/ry.R (JFFF)F
// 15c: invokestatic kotlin/math/MathKt.roundToInt (F)I
// 15f: putfield su/catlean/ry.j I
// 162: aload 0
// 163: aload 0
// 164: aload 0
// 165: getfield su/catlean/ry.W I
// 168: i2f
// 169: lload 34
// 16b: dup2_x1
// 16c: pop2
// 16d: aload 0
// 16e: getfield su/catlean/ry.g I
// 171: i2f
// 172: ldc 13.0
// 174: invokespecial su/catlean/ry.R (JFFF)F
// 177: invokestatic kotlin/math/MathKt.roundToInt (F)I
// 17a: putfield su/catlean/ry.W I
// 17d: aload 1
// 17e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 181: dup
// 182: sipush 12574
// 185: ldc2_w 1424273219993612056
// 188: lload 3
// 189: lxor
// 18a: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 192: aload 0
// 193: getfield su/catlean/ry.j I
// 196: i2f
// 197: aload 0
// 198: getfield su/catlean/ry.W I
// 19b: i2f
// 19c: aload 0
// 19d: getfield su/catlean/ry.n F
// 1a0: ldc 25.0
// 1a2: ldc 7.0
// 1a4: fconst_2
// 1a5: fconst_0
// 1a6: fconst_1
// 1a7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1aa: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 1ad: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 1b0: dup
// 1b1: sipush 32699
// 1b4: ldc2_w 8138933853953548725
// 1b7: lload 3
// 1b8: lxor
// 1b9: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1c1: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1c4: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 1c7: fconst_0
// 1c8: lload 14
// 1ca: fconst_0
// 1cb: ldc 7.0
// 1cd: invokestatic su/catlean/x1.R (Lorg/joml/Matrix3x2fStack;FFFFFFFFLjava/awt/Color;Ljava/awt/Color;FJFF)V
// 1d0: aload 1
// 1d1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1d4: dup
// 1d5: sipush 12574
// 1d8: ldc2_w 1424273219993612056
// 1db: lload 3
// 1dc: lxor
// 1dd: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e5: aload 0
// 1e6: getfield su/catlean/ry.j I
// 1e9: i2f
// 1ea: aload 0
// 1eb: getfield su/catlean/ry.W I
// 1ee: i2f
// 1ef: ldc 24.0
// 1f1: fadd
// 1f2: aload 0
// 1f3: getfield su/catlean/ry.n F
// 1f6: aload 0
// 1f7: getfield su/catlean/ry.Y Lsu/catlean/fd;
// 1fa: invokevirtual su/catlean/fd.a ()F
// 1fd: ldc 24.0
// 1ff: fsub
// 200: fconst_0
// 201: fconst_2
// 202: fconst_0
// 203: fconst_1
// 204: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 207: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 20a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 20d: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 210: ldc 7.0
// 212: lload 14
// 214: ldc 7.0
// 216: fconst_0
// 217: invokestatic su/catlean/x1.R (Lorg/joml/Matrix3x2fStack;FFFFFFFFLjava/awt/Color;Ljava/awt/Color;FJFF)V
// 21a: lload 26
// 21c: invokestatic su/catlean/b8.v (J)Lsu/catlean/c6;
// 21f: aload 1
// 220: aload 0
// 221: getfield su/catlean/ry.e Lsu/catlean/nd;
// 224: invokevirtual su/catlean/nd.h ()Ljava/lang/String;
// 227: astore 44
// 229: aload 44
// 22b: checkcast java/lang/CharSequence
// 22e: invokeinterface java/lang/CharSequence.length ()I 1
// 233: iload 43
// 235: ifeq 249
// 238: ifle 24c
// 23b: goto 248
// 23e: ldc2_w -3324638569963912159
// 241: lload 3
// 242: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 247: athrow
// 248: bipush 1
// 249: goto 24d
// 24c: bipush 0
// 24d: ifeq 2a7
// 250: aload 44
// 252: bipush 0
// 253: invokevirtual java/lang/String.charAt (I)C
// 256: istore 45
// 258: astore 49
// 25a: astore 48
// 25c: bipush 0
// 25d: istore 46
// 25f: iload 45
// 261: invokestatic java/lang/Character.toUpperCase (C)C
// 264: nop
// 265: istore 50
// 267: aload 48
// 269: aload 49
// 26b: iload 50
// 26d: istore 45
// 26f: aload 44
// 271: astore 46
// 273: bipush 1
// 274: istore 47
// 276: aload 46
// 278: iload 47
// 27a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
// 27d: dup
// 27e: sipush 6475
// 281: ldc2_w 8918074915605481295
// 284: lload 3
// 285: lxor
// 286: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 28e: astore 46
// 290: new java/lang/StringBuilder
// 293: dup
// 294: invokespecial java/lang/StringBuilder.<init> ()V
// 297: iload 45
// 299: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
// 29c: aload 46
// 29e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 2a1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
// 2a4: goto 2a9
// 2a7: aload 44
// 2a9: aload 0
// 2aa: getfield su/catlean/ry.j I
// 2ad: i2f
// 2ae: aload 0
// 2af: getfield su/catlean/ry.n F
// 2b2: fconst_2
// 2b3: fdiv
// 2b4: fadd
// 2b5: aload 0
// 2b6: getfield su/catlean/ry.W I
// 2b9: i2f
// 2ba: ldc 5.0
// 2bc: fadd
// 2bd: sipush 14366
// 2c0: ldc2_w 974944780200587432
// 2c3: lload 3
// 2c4: lxor
// 2c5: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ca: istore 38
// 2cc: fstore 39
// 2ce: fstore 40
// 2d0: astore 41
// 2d2: astore 42
// 2d4: lload 10
// 2d6: aload 42
// 2d8: aload 41
// 2da: fload 40
// 2dc: fload 39
// 2de: iload 38
// 2e0: invokevirtual su/catlean/c6.g (JLnet/minecraft/class_332;Ljava/lang/String;FFI)V
// 2e3: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2e6: aload 1
// 2e7: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2ea: dup
// 2eb: sipush 12574
// 2ee: ldc2_w 1424273219993612056
// 2f1: lload 3
// 2f2: lxor
// 2f3: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2fb: aload 0
// 2fc: getfield su/catlean/ry.j I
// 2ff: i2f
// 300: aload 0
// 301: getfield su/catlean/ry.W I
// 304: i2f
// 305: ldc 41.0
// 307: fadd
// 308: aload 0
// 309: getfield su/catlean/ry.n F
// 30c: fconst_1
// 30d: bipush 1
// 30e: anewarray 297
// 311: astore 44
// 313: aload 44
// 315: bipush 0
// 316: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 319: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 31c: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 31f: iload 20
// 321: i2c
// 322: iload 21
// 324: ldc 0.3
// 326: iload 22
// 328: i2s
// 329: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 32c: aastore
// 32d: aload 44
// 32f: lload 36
// 331: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 334: aload 0
// 335: getfield su/catlean/ry.P Lsu/catlean/fd;
// 338: lload 12
// 33a: fconst_1
// 33b: invokevirtual su/catlean/fd.B (JF)V
// 33e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 341: lload 30
// 343: aload 1
// 344: new su/catlean/o7
// 347: dup
// 348: aload 0
// 349: getfield su/catlean/ry.j I
// 34c: i2f
// 34d: fconst_1
// 34e: fadd
// 34f: aload 0
// 350: getfield su/catlean/ry.W I
// 353: i2f
// 354: aload 0
// 355: getfield su/catlean/ry.j I
// 358: i2f
// 359: aload 0
// 35a: getfield su/catlean/ry.n F
// 35d: fadd
// 35e: aload 0
// 35f: getfield su/catlean/ry.W I
// 362: i2f
// 363: aload 0
// 364: getfield su/catlean/ry.Y Lsu/catlean/fd;
// 367: invokevirtual su/catlean/fd.a ()F
// 36a: fadd
// 36b: invokespecial su/catlean/o7.<init> (FFFF)V
// 36e: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 371: aload 0
// 372: iload 43
// 374: lload 3
// 375: lconst_0
// 376: lcmp
// 377: ifle 3d7
// 37a: ifeq 3d6
// 37d: getfield su/catlean/ry.o Lsu/catlean/tw;
// 380: ifnonnull 3d5
// 383: goto 390
// 386: ldc2_w -3324638569963912159
// 389: lload 3
// 38a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38f: athrow
// 390: aload 0
// 391: iload 2
// 392: iload 5
// 394: aload 1
// 395: aload 0
// 396: getfield su/catlean/ry.Y Lsu/catlean/fd;
// 399: invokevirtual su/catlean/fd.x ()Z
// 39c: lload 8
// 39e: dup2_x1
// 39f: pop2
// 3a0: invokespecial su/catlean/ry.Y (IILnet/minecraft/class_332;JZ)V
// 3a3: lload 3
// 3a4: lconst_0
// 3a5: lcmp
// 3a6: ifle 408
// 3a9: iload 43
// 3ab: ifne 3df
// 3ae: goto 3bb
// 3b1: ldc2_w -3324638569963912159
// 3b4: lload 3
// 3b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ba: athrow
// 3bb: bipush 4
// 3bc: anewarray 78
// 3bf: ldc2_w -3358128461318857896
// 3c2: lload 3
// 3c3: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c8: goto 3d5
// 3cb: ldc2_w -3324638569963912159
// 3ce: lload 3
// 3cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d4: athrow
// 3d5: aload 0
// 3d6: iload 2
// 3d7: lload 16
// 3d9: iload 5
// 3db: aload 1
// 3dc: invokespecial su/catlean/ry.K (IJILnet/minecraft/class_332;)V
// 3df: lload 28
// 3e1: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 3e4: iload 23
// 3e6: iload 24
// 3e8: i2c
// 3e9: iload 25
// 3eb: i2s
// 3ec: invokevirtual su/catlean/c6.g (ICS)V
// 3ef: lload 18
// 3f1: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 3f4: iload 23
// 3f6: iload 24
// 3f8: i2c
// 3f9: iload 25
// 3fb: i2s
// 3fc: invokevirtual su/catlean/c6.g (ICS)V
// 3ff: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 402: lload 32
// 404: aload 1
// 405: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 408: return
}

private final void K(int param1, long param2, int param4, class_332 param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ry.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 102786715717798
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 133345810538402
// 012: lxor
// 013: lstore 8
// 015: dup2
// 016: ldc2_w 70555639388147
// 019: lxor
// 01a: lstore 10
// 01c: dup2
// 01d: ldc2_w 59351709569114
// 020: lxor
// 021: lstore 12
// 023: dup2
// 024: ldc2_w 59193220633634
// 027: lxor
// 028: lstore 14
// 02a: dup2
// 02b: ldc2_w 82815415094626
// 02e: lxor
// 02f: lstore 16
// 031: dup2
// 032: ldc2_w 116531277934572
// 035: lxor
// 036: dup2
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 18
// 03d: dup2
// 03e: bipush 16
// 040: lshl
// 041: bipush 32
// 043: lushr
// 044: l2i
// 045: istore 19
// 047: dup2
// 048: bipush 48
// 04a: lshl
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 20
// 051: pop2
// 052: pop2
// 053: aload 0
// 054: getfield su/catlean/ry.q Lsu/catlean/fd;
// 057: lload 8
// 059: fconst_1
// 05a: invokevirtual su/catlean/fd.B (JF)V
// 05d: ldc2_w -3700368023709370061
// 060: lload 2
// 061: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: lload 12
// 068: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 06b: aload 5
// 06d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 070: dup
// 071: sipush 6523
// 074: ldc2_w 6083973807935429292
// 077: lload 2
// 078: lxor
// 079: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 081: aload 0
// 082: getfield su/catlean/ry.o Lsu/catlean/tw;
// 085: dup
// 086: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 089: invokevirtual su/catlean/tw.K ()Lsu/catlean/_g;
// 08c: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 08f: aload 0
// 090: getfield su/catlean/ry.j I
// 093: i2f
// 094: ldc 8.0
// 096: fadd
// 097: ldc 40.0
// 099: bipush 1
// 09a: i2f
// 09b: aload 0
// 09c: getfield su/catlean/ry.q Lsu/catlean/fd;
// 09f: invokevirtual su/catlean/fd.a ()F
// 0a2: fsub
// 0a3: fmul
// 0a4: fadd
// 0a5: aload 0
// 0a6: getfield su/catlean/ry.W I
// 0a9: i2f
// 0aa: sipush 20681
// 0ad: ldc2_w 1319650376481654176
// 0b0: lload 2
// 0b1: lxor
// 0b2: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: i2f
// 0b8: fadd
// 0b9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0bc: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 0bf: lload 14
// 0c1: dup2_x1
// 0c2: pop2
// 0c3: bipush 0
// 0c4: bipush 0
// 0c5: sipush 14933
// 0c8: ldc2_w 6399345191699623743
// 0cb: lload 2
// 0cc: lxor
// 0cd: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: aconst_null
// 0d3: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 0d6: istore 21
// 0d8: fconst_0
// 0d9: fstore 22
// 0db: iload 21
// 0dd: ifeq 261
// 0e0: aload 0
// 0e1: getfield su/catlean/ry.o Lsu/catlean/tw;
// 0e4: dup
// 0e5: ifnull 260
// 0e8: goto 0f5
// 0eb: ldc2_w -3744498411042891275
// 0ee: lload 2
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: lload 10
// 0f7: invokevirtual su/catlean/tw.T (J)Ljava/util/List;
// 0fa: iload 21
// 0fc: ifeq 12d
// 0ff: goto 10c
// 102: ldc2_w -3744498411042891275
// 105: lload 2
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: dup
// 10d: ifnull 260
// 110: goto 11d
// 113: ldc2_w -3744498411042891275
// 116: lload 2
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: checkcast java/lang/Iterable
// 120: goto 12d
// 123: ldc2_w -3744498411042891275
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: astore 23
// 12f: bipush 0
// 130: istore 24
// 132: aload 23
// 134: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 139: astore 25
// 13b: aload 25
// 13d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 142: ifeq 256
// 145: aload 25
// 147: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 14c: astore 26
// 14e: aload 26
// 150: checkcast su/catlean/ru
// 153: astore 27
// 155: bipush 0
// 156: istore 28
// 158: iload 21
// 15a: ifeq 25d
// 15d: aload 27
// 15f: iload 21
// 161: ifeq 230
// 164: goto 171
// 167: ldc2_w -3744498411042891275
// 16a: lload 2
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: lload 2
// 172: lconst_0
// 173: lcmp
// 174: iflt 223
// 177: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 17a: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 17d: ifnull 204
// 180: goto 18d
// 183: ldc2_w -3744498411042891275
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: aload 27
// 18f: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 192: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 195: dup
// 196: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 199: lload 2
// 19a: lconst_0
// 19b: lcmp
// 19c: iflt 1fb
// 19f: iload 21
// 1a1: ifeq 1fb
// 1a4: goto 1b1
// 1a7: ldc2_w -3744498411042891275
// 1aa: lload 2
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: invokevirtual su/catlean/h.L ()Z
// 1b4: lload 2
// 1b5: lconst_0
// 1b6: lcmp
// 1b7: ifle 253
// 1ba: ifeq 24f
// 1bd: goto 1ca
// 1c0: ldc2_w -3744498411042891275
// 1c3: lload 2
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: lload 2
// 1cb: lconst_0
// 1cc: lcmp
// 1cd: ifle 243
// 1d0: aload 27
// 1d2: iload 21
// 1d4: ifeq 230
// 1d7: goto 1e4
// 1da: ldc2_w -3744498411042891275
// 1dd: lload 2
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 1e7: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 1ea: dup
// 1eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1ee: goto 1fb
// 1f1: ldc2_w -3744498411042891275
// 1f4: lload 2
// 1f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: athrow
// 1fb: invokevirtual su/catlean/h.x ()Lsu/catlean/w7;
// 1fe: getstatic su/catlean/w7.BOOLS Lsu/catlean/w7;
// 201: if_acmpeq 24f
// 204: aload 27
// 206: aload 0
// 207: getfield su/catlean/ry.j I
// 20a: i2f
// 20b: ldc 5.0
// 20d: fadd
// 20e: invokevirtual su/catlean/ru.V (F)V
// 211: aload 27
// 213: aload 0
// 214: getfield su/catlean/ry.W I
// 217: i2f
// 218: ldc 47.0
// 21a: fadd
// 21b: fload 22
// 21d: fadd
// 21e: invokevirtual su/catlean/ru.S (F)V
// 221: aload 27
// 223: goto 230
// 226: ldc2_w -3744498411042891275
// 229: lload 2
// 22a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22f: athrow
// 230: aload 5
// 232: iload 1
// 233: iload 4
// 235: aload 0
// 236: getfield su/catlean/ry.P Lsu/catlean/fd;
// 239: invokevirtual su/catlean/fd.a ()F
// 23c: lload 6
// 23e: dup2_x1
// 23f: pop2
// 240: invokevirtual su/catlean/ru.r (Lnet/minecraft/class_332;IIJF)V
// 243: fload 22
// 245: aload 27
// 247: invokevirtual su/catlean/ru.d ()F
// 24a: fconst_2
// 24b: fadd
// 24c: fadd
// 24d: fstore 22
// 24f: nop
// 250: nop
// 251: iload 21
// 253: ifne 13b
// 256: nop
// 257: lload 2
// 258: lconst_0
// 259: lcmp
// 25a: ifle 25d
// 25d: goto 262
// 260: pop
// 261: nop
// 262: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 265: invokevirtual su/catlean/wv.r ()Lsu/catlean/bj;
// 268: aload 5
// 26a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 26d: dup
// 26e: sipush 12574
// 271: ldc2_w 1424356495195714252
// 274: lload 2
// 275: lxor
// 276: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 27e: checkcast org/joml/Matrix3x2f
// 281: aload 0
// 282: getfield su/catlean/ry.j I
// 285: i2f
// 286: aload 0
// 287: getfield su/catlean/ry.n F
// 28a: fadd
// 28b: f2d
// 28c: ldc2_w 15.0
// 28f: dsub
// 290: aload 0
// 291: getfield su/catlean/ry.W I
// 294: i2d
// 295: ldc2_w 26.0
// 298: dadd
// 299: fconst_0
// 29a: fconst_0
// 29b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 29e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2a1: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 2a4: aload 0
// 2a5: getfield su/catlean/ry.q Lsu/catlean/fd;
// 2a8: invokevirtual su/catlean/fd.a ()F
// 2ab: iload 18
// 2ad: i2c
// 2ae: swap
// 2af: iload 19
// 2b1: swap
// 2b2: iload 20
// 2b4: i2s
// 2b5: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 2b8: aconst_null
// 2b9: fconst_0
// 2ba: sipush 3428
// 2bd: ldc2_w 4530550093947082767
// 2c0: lload 2
// 2c1: lxor
// 2c2: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c7: lload 16
// 2c9: aconst_null
// 2ca: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 2cd: aload 0
// 2ce: getfield su/catlean/ry.Y Lsu/catlean/fd;
// 2d1: ldc 49.0
// 2d3: fload 22
// 2d5: fadd
// 2d6: lload 8
// 2d8: dup2_x1
// 2d9: pop2
// 2da: invokevirtual su/catlean/fd.B (JF)V
// 2dd: return
}

private final void Y(int param1, int param2, class_332 param3, long param4, boolean param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ry.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 61044504070949
// 00e: lxor
// 00f: lstore 7
// 011: dup2
// 012: ldc2_w 48840505026002
// 015: lxor
// 016: dup2
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 9
// 01d: dup2
// 01e: bipush 16
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 10
// 027: dup2
// 028: bipush 32
// 02a: lshl
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 11
// 031: pop2
// 032: dup2
// 033: ldc2_w 29397924632069
// 036: lxor
// 037: lstore 12
// 039: dup2
// 03a: ldc2_w 94560766220797
// 03d: lxor
// 03e: lstore 14
// 040: dup2
// 041: ldc2_w 91547901855143
// 044: lxor
// 045: lstore 16
// 047: dup2
// 048: ldc2_w 15507033940297
// 04b: lxor
// 04c: dup2
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 18
// 053: dup2
// 054: bipush 16
// 056: lshl
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 19
// 05d: dup2
// 05e: bipush 32
// 060: lshl
// 061: bipush 32
// 063: lushr
// 064: l2i
// 065: istore 20
// 067: pop2
// 068: pop2
// 069: ldc2_w 5031840839816382928
// 06c: lload 4
// 06e: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: aload 0
// 074: getfield su/catlean/ry.q Lsu/catlean/fd;
// 077: lload 12
// 079: fconst_0
// 07a: invokevirtual su/catlean/fd.B (JF)V
// 07d: aload 0
// 07e: getfield su/catlean/ry.F Ljava/util/ArrayList;
// 081: checkcast java/lang/Iterable
// 084: astore 22
// 086: istore 21
// 088: bipush 0
// 089: istore 23
// 08b: aload 22
// 08d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 092: astore 24
// 094: aload 24
// 096: invokeinterface java/util/Iterator.hasNext ()Z 1
// 09b: ifeq 26b
// 09e: aload 24
// 0a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0a5: astore 25
// 0a7: aload 25
// 0a9: checkcast su/catlean/fl
// 0ac: astore 26
// 0ae: bipush 0
// 0af: istore 27
// 0b1: iload 21
// 0b3: ifne 273
// 0b6: aload 26
// 0b8: invokevirtual su/catlean/fl.c ()Lsu/catlean/fd;
// 0bb: aload 26
// 0bd: aload 0
// 0be: getfield su/catlean/ry.D Lsu/catlean/fl;
// 0c1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c4: ifeq 0e4
// 0c7: goto 0d5
// 0ca: ldc2_w 5021440409192599634
// 0cd: lload 4
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: fconst_1
// 0d6: goto 0e5
// 0d9: ldc2_w 5021440409192599634
// 0dc: lload 4
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: fconst_0
// 0e5: lload 12
// 0e7: dup2_x1
// 0e8: pop2
// 0e9: invokevirtual su/catlean/fd.B (JF)V
// 0ec: lload 4
// 0ee: lconst_0
// 0ef: lcmp
// 0f0: iflt 177
// 0f3: aload 26
// 0f5: invokevirtual su/catlean/fl.c ()Lsu/catlean/fd;
// 0f8: invokevirtual su/catlean/fd.a ()F
// 0fb: f2d
// 0fc: ldc2_w 0.001
// 0ff: dcmpl
// 100: ifle 185
// 103: aload 3
// 104: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 107: dup
// 108: sipush 12574
// 10b: ldc2_w 1424324223871531883
// 10e: lload 4
// 110: lxor
// 111: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 119: aload 0
// 11a: getfield su/catlean/ry.j I
// 11d: i2f
// 11e: aload 26
// 120: invokevirtual su/catlean/fl.l ()F
// 123: fadd
// 124: ldc 5.0
// 126: fadd
// 127: iload 9
// 129: i2c
// 12a: swap
// 12b: aload 0
// 12c: getfield su/catlean/ry.W I
// 12f: i2f
// 130: ldc 27.0
// 132: fadd
// 133: aload 26
// 135: invokevirtual su/catlean/fl.s ()F
// 138: ldc 11.5
// 13a: fconst_2
// 13b: fconst_2
// 13c: aload 26
// 13e: invokevirtual su/catlean/fl.c ()Lsu/catlean/fd;
// 141: invokevirtual su/catlean/fd.a ()F
// 144: fmul
// 145: ldc 0.05
// 147: aload 26
// 149: invokevirtual su/catlean/fl.c ()Lsu/catlean/fd;
// 14c: invokevirtual su/catlean/fd.a ()F
// 14f: fmul
// 150: fconst_1
// 151: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 154: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 157: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 15a: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 15d: fconst_0
// 15e: iload 10
// 160: i2s
// 161: fconst_0
// 162: iload 11
// 164: fconst_0
// 165: sipush 15113
// 168: ldc2_w 4967779733310351311
// 16b: lload 4
// 16d: lxor
// 16e: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: aconst_null
// 174: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 177: goto 185
// 17a: ldc2_w 5021440409192599634
// 17d: lload 4
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 188: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 18b: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 18e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 191: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 194: lload 7
// 196: dup2_x1
// 197: pop2
// 198: aload 26
// 19a: invokevirtual su/catlean/fl.c ()Lsu/catlean/fd;
// 19d: invokevirtual su/catlean/fd.a ()F
// 1a0: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 1a3: astore 28
// 1a5: lload 14
// 1a7: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 1aa: aload 3
// 1ab: aload 26
// 1ad: invokevirtual su/catlean/fl.g ()Lsu/catlean/fu;
// 1b0: invokevirtual su/catlean/fu.q ()Ljava/lang/String;
// 1b3: astore 29
// 1b5: aload 29
// 1b7: checkcast java/lang/CharSequence
// 1ba: invokeinterface java/lang/CharSequence.length ()I 1
// 1bf: iload 21
// 1c1: ifne 1d6
// 1c4: ifle 1d9
// 1c7: goto 1d5
// 1ca: ldc2_w 5021440409192599634
// 1cd: lload 4
// 1cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d4: athrow
// 1d5: bipush 1
// 1d6: goto 1da
// 1d9: bipush 0
// 1da: ifeq 235
// 1dd: aload 29
// 1df: bipush 0
// 1e0: invokevirtual java/lang/String.charAt (I)C
// 1e3: istore 30
// 1e5: astore 31
// 1e7: astore 32
// 1e9: bipush 0
// 1ea: istore 33
// 1ec: iload 30
// 1ee: invokestatic java/lang/Character.toUpperCase (C)C
// 1f1: nop
// 1f2: istore 34
// 1f4: aload 32
// 1f6: aload 31
// 1f8: iload 34
// 1fa: istore 30
// 1fc: aload 29
// 1fe: astore 33
// 200: bipush 1
// 201: istore 35
// 203: aload 33
// 205: iload 35
// 207: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
// 20a: dup
// 20b: sipush 32457
// 20e: ldc2_w 203903069221188792
// 211: lload 4
// 213: lxor
// 214: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 21c: astore 33
// 21e: new java/lang/StringBuilder
// 221: dup
// 222: invokespecial java/lang/StringBuilder.<init> ()V
// 225: iload 30
// 227: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
// 22a: aload 33
// 22c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
// 22f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
// 232: goto 237
// 235: aload 29
// 237: aload 0
// 238: getfield su/catlean/ry.j I
// 23b: i2f
// 23c: aload 26
// 23e: invokevirtual su/catlean/fl.l ()F
// 241: fadd
// 242: ldc 5.0
// 244: fadd
// 245: aload 26
// 247: invokevirtual su/catlean/fl.s ()F
// 24a: ldc 0.2
// 24c: fdiv
// 24d: invokestatic kotlin/math/MathKt.roundToInt (F)I
// 250: i2f
// 251: ldc 10.0
// 253: fdiv
// 254: fadd
// 255: aload 0
// 256: getfield su/catlean/ry.W I
// 259: i2f
// 25a: ldc 31.5
// 25c: fadd
// 25d: aload 28
// 25f: lload 16
// 261: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 264: nop
// 265: nop
// 266: iload 21
// 268: ifeq 094
// 26b: nop
// 26c: lload 4
// 26e: lconst_0
// 26f: lcmp
// 270: ifle 273
// 273: fconst_0
// 274: fstore 22
// 276: fconst_0
// 277: fstore 23
// 279: fconst_0
// 27a: fstore 24
// 27c: aload 0
// 27d: getfield su/catlean/ry.V Ljava/util/ArrayList;
// 280: checkcast java/lang/Iterable
// 283: astore 25
// 285: bipush 0
// 286: istore 26
// 288: aload 25
// 28a: astore 27
// 28c: new java/util/ArrayList
// 28f: dup
// 290: invokespecial java/util/ArrayList.<init> ()V
// 293: checkcast java/util/Collection
// 296: astore 28
// 298: bipush 0
// 299: istore 29
// 29b: aload 27
// 29d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2a2: astore 30
// 2a4: aload 30
// 2a6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2ab: ifeq 384
// 2ae: aload 30
// 2b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2b5: astore 31
// 2b7: aload 31
// 2b9: checkcast su/catlean/tw
// 2bc: astore 32
// 2be: bipush 0
// 2bf: istore 33
// 2c1: lload 4
// 2c3: lconst_0
// 2c4: lcmp
// 2c5: ifle 39a
// 2c8: aload 32
// 2ca: invokevirtual su/catlean/tw.K ()Lsu/catlean/_g;
// 2cd: invokevirtual su/catlean/_g.N ()Lsu/catlean/fu;
// 2d0: aload 0
// 2d1: getfield su/catlean/ry.D Lsu/catlean/fl;
// 2d4: invokevirtual su/catlean/fl.g ()Lsu/catlean/fu;
// 2d7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2da: iload 21
// 2dc: ifne 398
// 2df: iload 21
// 2e1: ifne 36e
// 2e4: goto 2f2
// 2e7: ldc2_w 5021440409192599634
// 2ea: lload 4
// 2ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f1: athrow
// 2f2: ifne 36d
// 2f5: goto 303
// 2f8: ldc2_w 5021440409192599634
// 2fb: lload 4
// 2fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: athrow
// 303: aload 32
// 305: invokevirtual su/catlean/tw.K ()Lsu/catlean/_g;
// 308: invokevirtual su/catlean/_g.N ()Lsu/catlean/fu;
// 30b: aload 0
// 30c: getfield su/catlean/ry.S Lsu/catlean/fl;
// 30f: invokevirtual su/catlean/fl.g ()Lsu/catlean/fu;
// 312: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 315: iload 21
// 317: lload 4
// 319: lconst_0
// 31a: lcmp
// 31b: iflt 359
// 31e: ifne 357
// 321: goto 32f
// 324: ldc2_w 5021440409192599634
// 327: lload 4
// 329: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32e: athrow
// 32f: ifeq 371
// 332: goto 340
// 335: ldc2_w 5021440409192599634
// 338: lload 4
// 33a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33f: athrow
// 340: aload 0
// 341: getfield su/catlean/ry.P Lsu/catlean/fd;
// 344: invokevirtual su/catlean/fd.a ()F
// 347: fconst_1
// 348: fcmpg
// 349: goto 357
// 34c: ldc2_w 5021440409192599634
// 34f: lload 4
// 351: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 356: athrow
// 357: iload 21
// 359: ifne 36e
// 35c: ifge 371
// 35f: goto 36d
// 362: ldc2_w 5021440409192599634
// 365: lload 4
// 367: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36c: athrow
// 36d: bipush 1
// 36e: goto 372
// 371: bipush 0
// 372: ifeq 2a4
// 375: aload 28
// 377: aload 31
// 379: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 37e: pop
// 37f: iload 21
// 381: ifeq 2a4
// 384: aload 28
// 386: checkcast java/util/List
// 389: nop
// 38a: checkcast java/lang/Iterable
// 38d: astore 25
// 38f: nop
// 390: lload 4
// 392: lconst_0
// 393: lcmp
// 394: iflt 39a
// 397: bipush 0
// 398: istore 26
// 39a: aload 25
// 39c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 3a1: astore 27
// 3a3: aload 27
// 3a5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3aa: ifeq 529
// 3ad: aload 27
// 3af: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3b4: astore 28
// 3b6: aload 28
// 3b8: checkcast su/catlean/tw
// 3bb: astore 29
// 3bd: bipush 0
// 3be: istore 30
// 3c0: iload 21
// 3c2: lload 4
// 3c4: lconst_0
// 3c5: lcmp
// 3c6: ifle 3de
// 3c9: ifne 541
// 3cc: aload 29
// 3ce: invokevirtual su/catlean/tw.K ()Lsu/catlean/_g;
// 3d1: invokevirtual su/catlean/_g.N ()Lsu/catlean/fu;
// 3d4: aload 0
// 3d5: getfield su/catlean/ry.D Lsu/catlean/fl;
// 3d8: invokevirtual su/catlean/fl.g ()Lsu/catlean/fu;
// 3db: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3de: iload 21
// 3e0: ifne 42e
// 3e3: goto 3f1
// 3e6: ldc2_w 5021440409192599634
// 3e9: lload 4
// 3eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f0: athrow
// 3f1: ifeq 42a
// 3f4: goto 402
// 3f7: ldc2_w 5021440409192599634
// 3fa: lload 4
// 3fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 401: athrow
// 402: aload 0
// 403: getfield su/catlean/ry.j I
// 406: i2f
// 407: aload 0
// 408: getfield su/catlean/ry.t I
// 40b: i2f
// 40c: aload 0
// 40d: getfield su/catlean/ry.n F
// 410: fconst_1
// 411: aload 0
// 412: getfield su/catlean/ry.P Lsu/catlean/fd;
// 415: invokevirtual su/catlean/fd.a ()F
// 418: fsub
// 419: fmul
// 41a: fmul
// 41b: fsub
// 41c: goto 442
// 41f: ldc2_w 5021440409192599634
// 422: lload 4
// 424: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 429: athrow
// 42a: aload 0
// 42b: getfield su/catlean/ry.j I
// 42e: i2f
// 42f: aload 0
// 430: getfield su/catlean/ry.t I
// 433: i2f
// 434: aload 0
// 435: getfield su/catlean/ry.n F
// 438: aload 0
// 439: getfield su/catlean/ry.P Lsu/catlean/fd;
// 43c: invokevirtual su/catlean/fd.a ()F
// 43f: fmul
// 440: fmul
// 441: fadd
// 442: fstore 31
// 444: aload 29
// 446: fload 31
// 448: ldc 3.0
// 44a: fadd
// 44b: invokevirtual su/catlean/tw.m (F)V
// 44e: aload 29
// 450: iload 21
// 452: lload 4
// 454: lconst_0
// 455: lcmp
// 456: iflt 4f0
// 459: ifne 4ec
// 45c: invokevirtual su/catlean/tw.K ()Lsu/catlean/_g;
// 45f: invokevirtual su/catlean/_g.N ()Lsu/catlean/fu;
// 462: aload 0
// 463: getfield su/catlean/ry.D Lsu/catlean/fl;
// 466: invokevirtual su/catlean/fl.g ()Lsu/catlean/fu;
// 469: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 46c: ifeq 4dc
// 46f: goto 47d
// 472: ldc2_w 5021440409192599634
// 475: lload 4
// 477: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47c: athrow
// 47d: aload 29
// 47f: aload 0
// 480: getfield su/catlean/ry.W I
// 483: i2f
// 484: ldc 44.0
// 486: fadd
// 487: fload 22
// 489: fadd
// 48a: invokevirtual su/catlean/tw.n (F)V
// 48d: fload 22
// 48f: aload 29
// 491: invokevirtual su/catlean/tw.V ()F
// 494: fconst_2
// 495: fadd
// 496: iload 21
// 498: ifne 4c6
// 49b: goto 4a9
// 49e: ldc2_w 5021440409192599634
// 4a1: lload 4
// 4a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a8: athrow
// 4a9: fadd
// 4aa: fstore 22
// 4ac: fload 24
// 4ae: aload 29
// 4b0: invokevirtual su/catlean/tw.z ()Z
// 4b3: ifeq 4c9
// 4b6: ldc 31.0
// 4b8: goto 4c6
// 4bb: ldc2_w 5021440409192599634
// 4be: lload 4
// 4c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c5: athrow
// 4c6: goto 4cb
// 4c9: ldc 17.0
// 4cb: fconst_2
// 4cc: fadd
// 4cd: fadd
// 4ce: fstore 24
// 4d0: iload 21
// 4d2: lload 4
// 4d4: lconst_0
// 4d5: lcmp
// 4d6: ifle 526
// 4d9: ifeq 506
// 4dc: aload 29
// 4de: goto 4ec
// 4e1: ldc2_w 5021440409192599634
// 4e4: lload 4
// 4e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4eb: athrow
// 4ec: aload 0
// 4ed: getfield su/catlean/ry.W I
// 4f0: i2f
// 4f1: ldc 44.0
// 4f3: fadd
// 4f4: fload 23
// 4f6: fadd
// 4f7: invokevirtual su/catlean/tw.n (F)V
// 4fa: fload 23
// 4fc: aload 29
// 4fe: invokevirtual su/catlean/tw.V ()F
// 501: fconst_2
// 502: fadd
// 503: fadd
// 504: fstore 23
// 506: aload 29
// 508: aload 3
// 509: iload 1
// 50a: iload 2
// 50b: aload 0
// 50c: getfield su/catlean/ry.P Lsu/catlean/fd;
// 50f: invokevirtual su/catlean/fd.a ()F
// 512: iload 18
// 514: i2c
// 515: swap
// 516: iload 19
// 518: i2s
// 519: swap
// 51a: iload 20
// 51c: swap
// 51d: iload 6
// 51f: invokevirtual su/catlean/tw.E (Lnet/minecraft/class_332;IICSIFZ)V
// 522: nop
// 523: nop
// 524: iload 21
// 526: ifeq 3a3
// 529: nop
// 52a: aload 0
// 52b: getfield su/catlean/ry.Y Lsu/catlean/fd;
// 52e: ldc 45.0
// 530: fload 24
// 532: fadd
// 533: lload 12
// 535: dup2_x1
// 536: pop2
// 537: invokevirtual su/catlean/fd.B (JF)V
// 53a: lload 4
// 53c: lconst_0
// 53d: lcmp
// 53e: iflt 3b6
// 541: return
}

public final void y(long a, @NotNull fl selector) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ry.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 116333522865100
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -5136941236969147215
// 12: lload 1
// 13: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 3
// 19: sipush 17736
// 1c: ldc2_w 293412456044638811
// 1f: lload 1
// 20: lxor
// 21: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/ry.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 29: aload 0
// 2a: aload 0
// 2b: getfield su/catlean/ry.D Lsu/catlean/fl;
// 2e: putfield su/catlean/ry.S Lsu/catlean/fl;
// 31: istore 6
// 33: aload 0
// 34: aload 3
// 35: putfield su/catlean/ry.D Lsu/catlean/fl;
// 38: aload 0
// 39: aload 0
// 3a: getfield su/catlean/ry.S Lsu/catlean/fl;
// 3d: invokevirtual su/catlean/fl.l ()F
// 40: aload 0
// 41: getfield su/catlean/ry.D Lsu/catlean/fl;
// 44: invokevirtual su/catlean/fl.l ()F
// 47: fcmpl
// 48: iload 6
// 4a: ifne 5e
// 4d: ifle 61
// 50: goto 5d
// 53: ldc2_w -5129909150551282381
// 56: lload 1
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: bipush 1
// 5e: goto 62
// 61: bipush -1
// 62: putfield su/catlean/ry.t I
// 65: iload 6
// 67: lload 1
// 68: lconst_0
// 69: lcmp
// 6a: ifle a5
// 6d: ifne 9d
// 70: aload 0
// 71: getfield su/catlean/ry.t I
// 74: bipush 1
// 75: if_icmpne a8
// 78: goto 85
// 7b: ldc2_w -5129909150551282381
// 7e: lload 1
// 7f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: athrow
// 85: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 88: invokevirtual su/catlean/d2.m ()Lsu/catlean/lp;
// 8b: lload 4
// 8d: invokevirtual su/catlean/lp.L (J)V
// 90: goto 9d
// 93: ldc2_w -5129909150551282381
// 96: lload 1
// 97: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9c: athrow
// 9d: lload 1
// 9e: lconst_0
// 9f: lcmp
// a0: ifle d6
// a3: iload 6
// a5: ifeq c0
// a8: getstatic su/catlean/d2.O Lsu/catlean/d2;
// ab: invokevirtual su/catlean/d2.w ()Lsu/catlean/lp;
// ae: lload 4
// b0: invokevirtual su/catlean/lp.L (J)V
// b3: goto c0
// b6: ldc2_w -5129909150551282381
// b9: lload 1
// ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bf: athrow
// c0: aload 0
// c1: getfield su/catlean/ry.P Lsu/catlean/fd;
// c4: fconst_0
// c5: invokevirtual su/catlean/fd.A (F)V
// c8: aload 0
// c9: getfield su/catlean/ry.P Lsu/catlean/fd;
// cc: aload 0
// cd: getfield su/catlean/ry.P Lsu/catlean/fd;
// d0: invokevirtual su/catlean/fd.a ()F
// d3: invokevirtual su/catlean/fd.P (F)V
// d6: return
}

public final void b(double mouseX, double mouseY, long a, int button) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ry.a J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 113984916228511
// 00e: lxor
// 00f: lstore 8
// 011: dup2
// 012: ldc2_w 48397816265147
// 015: lxor
// 016: lstore 10
// 018: dup2
// 019: ldc2_w 73459045840531
// 01c: lxor
// 01d: dup2
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 12
// 024: dup2
// 025: bipush 16
// 027: lshl
// 028: bipush 32
// 02a: lushr
// 02b: l2i
// 02c: istore 13
// 02e: dup2
// 02f: bipush 48
// 031: lshl
// 032: bipush 48
// 034: lushr
// 035: l2i
// 036: istore 14
// 038: pop2
// 039: dup2
// 03a: ldc2_w 53375708321277
// 03d: lxor
// 03e: lstore 15
// 040: dup2
// 041: ldc2_w 36457245179140
// 044: lxor
// 045: lstore 17
// 047: pop2
// 048: ldc2_w 1044170799097725561
// 04b: lload 5
// 04d: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: istore 19
// 054: aload 0
// 055: iload 19
// 057: ifne 344
// 05a: getfield su/catlean/ry.o Lsu/catlean/tw;
// 05d: ifnonnull 335
// 060: goto 06e
// 063: ldc2_w 1010686656572218363
// 066: lload 5
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: aload 0
// 06f: getfield su/catlean/ry.F Ljava/util/ArrayList;
// 072: checkcast java/lang/Iterable
// 075: astore 20
// 077: bipush 0
// 078: istore 21
// 07a: aload 20
// 07c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 081: astore 22
// 083: aload 22
// 085: invokeinterface java/util/Iterator.hasNext ()Z 1
// 08a: ifeq 21e
// 08d: aload 22
// 08f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 094: astore 23
// 096: aload 23
// 098: checkcast su/catlean/fl
// 09b: astore 24
// 09d: bipush 0
// 09e: istore 25
// 0a0: aload 24
// 0a2: invokevirtual su/catlean/fl.l ()F
// 0a5: aload 0
// 0a6: getfield su/catlean/ry.j I
// 0a9: i2f
// 0aa: fadd
// 0ab: fstore 26
// 0ad: lload 5
// 0af: lconst_0
// 0b0: lcmp
// 0b1: ifle 232
// 0b4: dload 1
// 0b5: aload 24
// 0b7: invokevirtual su/catlean/fl.l ()F
// 0ba: aload 24
// 0bc: invokevirtual su/catlean/fl.s ()F
// 0bf: fadd
// 0c0: aload 0
// 0c1: getfield su/catlean/ry.j I
// 0c4: i2f
// 0c5: fadd
// 0c6: f2d
// 0c7: dcmpg
// 0c8: iload 19
// 0ca: ifne 230
// 0cd: iload 19
// 0cf: lload 5
// 0d1: lconst_0
// 0d2: lcmp
// 0d3: iflt 10d
// 0d6: ifne 10b
// 0d9: goto 0e7
// 0dc: ldc2_w 1010686656572218363
// 0df: lload 5
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: ifgt 134
// 0ea: goto 0f8
// 0ed: ldc2_w 1010686656572218363
// 0f0: lload 5
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: fload 26
// 0fa: f2d
// 0fb: dload 1
// 0fc: dcmpg
// 0fd: goto 10b
// 100: ldc2_w 1010686656572218363
// 103: lload 5
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: iload 19
// 10d: ifne 131
// 110: ifgt 130
// 113: goto 121
// 116: ldc2_w 1010686656572218363
// 119: lload 5
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: bipush 1
// 122: goto 135
// 125: ldc2_w 1010686656572218363
// 128: lload 5
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: bipush 0
// 131: goto 135
// 134: bipush 0
// 135: ifeq 217
// 138: aload 0
// 139: getfield su/catlean/ry.W I
// 13c: sipush 8506
// 13f: ldc2_w 712871533679703635
// 142: lload 5
// 144: lxor
// 145: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: iadd
// 14b: istore 26
// 14d: aload 0
// 14e: getfield su/catlean/ry.W I
// 151: sipush 26014
// 154: ldc2_w 4667534638065070845
// 157: lload 5
// 159: lxor
// 15a: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: iadd
// 160: istore 27
// 162: dload 3
// 163: d2i
// 164: istore 28
// 166: iload 26
// 168: iload 28
// 16a: lload 5
// 16c: lconst_0
// 16d: lcmp
// 16e: ifle 1ac
// 171: iload 19
// 173: ifne 1ac
// 176: if_icmpgt 1c2
// 179: goto 187
// 17c: ldc2_w 1010686656572218363
// 17f: lload 5
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: iload 28
// 189: iload 19
// 18b: ifne 1bf
// 18e: goto 19c
// 191: ldc2_w 1010686656572218363
// 194: lload 5
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: iload 27
// 19e: goto 1ac
// 1a1: ldc2_w 1010686656572218363
// 1a4: lload 5
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: if_icmpgt 1be
// 1af: bipush 1
// 1b0: goto 1c3
// 1b3: ldc2_w 1010686656572218363
// 1b6: lload 5
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: bipush 0
// 1bf: goto 1c3
// 1c2: bipush 0
// 1c3: lload 5
// 1c5: lconst_0
// 1c6: lcmp
// 1c7: ifle 21b
// 1ca: ifeq 217
// 1cd: aload 0
// 1ce: iload 19
// 1d0: ifne 210
// 1d3: goto 1e1
// 1d6: ldc2_w 1010686656572218363
// 1d9: lload 5
// 1db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e0: athrow
// 1e1: getfield su/catlean/ry.D Lsu/catlean/fl;
// 1e4: aload 24
// 1e6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1e9: lload 5
// 1eb: lconst_0
// 1ec: lcmp
// 1ed: iflt 21b
// 1f0: ifne 217
// 1f3: goto 201
// 1f6: ldc2_w 1010686656572218363
// 1f9: lload 5
// 1fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 200: athrow
// 201: aload 0
// 202: goto 210
// 205: ldc2_w 1010686656572218363
// 208: lload 5
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: lload 8
// 212: aload 24
// 214: invokevirtual su/catlean/ry.y (JLsu/catlean/fl;)V
// 217: nop
// 218: nop
// 219: iload 19
// 21b: ifeq 083
// 21e: nop
// 21f: aload 0
// 220: getfield su/catlean/ry.V Ljava/util/ArrayList;
// 223: checkcast java/lang/Iterable
// 226: astore 20
// 228: lload 5
// 22a: lconst_0
// 22b: lcmp
// 22c: ifle 232
// 22f: bipush 0
// 230: istore 21
// 232: aload 20
// 234: astore 22
// 236: new java/util/ArrayList
// 239: dup
// 23a: invokespecial java/util/ArrayList.<init> ()V
// 23d: checkcast java/util/Collection
// 240: astore 23
// 242: bipush 0
// 243: istore 24
// 245: aload 22
// 247: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 24c: astore 25
// 24e: aload 25
// 250: invokeinterface java/util/Iterator.hasNext ()Z 1
// 255: ifeq 2bc
// 258: aload 25
// 25a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 25f: astore 26
// 261: aload 26
// 263: checkcast su/catlean/tw
// 266: astore 27
// 268: bipush 0
// 269: istore 28
// 26b: lload 5
// 26d: lconst_0
// 26e: lcmp
// 26f: ifle 2d2
// 272: aload 27
// 274: invokevirtual su/catlean/tw.K ()Lsu/catlean/_g;
// 277: invokevirtual su/catlean/_g.N ()Lsu/catlean/fu;
// 27a: aload 0
// 27b: getfield su/catlean/ry.D Lsu/catlean/fl;
// 27e: invokevirtual su/catlean/fl.g ()Lsu/catlean/fu;
// 281: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 284: iload 19
// 286: ifne 2d0
// 289: iload 19
// 28b: ifne 2b6
// 28e: goto 29c
// 291: ldc2_w 1010686656572218363
// 294: lload 5
// 296: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29b: athrow
// 29c: ifeq 24e
// 29f: goto 2ad
// 2a2: ldc2_w 1010686656572218363
// 2a5: lload 5
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: aload 23
// 2af: aload 26
// 2b1: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 2b6: pop
// 2b7: iload 19
// 2b9: ifeq 24e
// 2bc: aload 23
// 2be: checkcast java/util/List
// 2c1: nop
// 2c2: checkcast java/lang/Iterable
// 2c5: astore 20
// 2c7: nop
// 2c8: lload 5
// 2ca: lconst_0
// 2cb: lcmp
// 2cc: ifle 2d2
// 2cf: bipush 0
// 2d0: istore 21
// 2d2: aload 20
// 2d4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2d9: astore 22
// 2db: aload 22
// 2dd: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2e2: ifeq 32f
// 2e5: aload 22
// 2e7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2ec: astore 23
// 2ee: aload 23
// 2f0: checkcast su/catlean/tw
// 2f3: astore 24
// 2f5: bipush 0
// 2f6: istore 25
// 2f8: aload 24
// 2fa: iload 12
// 2fc: i2s
// 2fd: iload 13
// 2ff: dload 1
// 300: iload 14
// 302: dload 3
// 303: iload 7
// 305: invokevirtual su/catlean/tw.D (SIDIDI)V
// 308: nop
// 309: iload 19
// 30b: lload 5
// 30d: lconst_0
// 30e: lcmp
// 30f: ifle 332
// 312: ifne 330
// 315: iload 19
// 317: ifeq 2db
// 31a: lload 5
// 31c: lconst_0
// 31d: lcmp
// 31e: iflt 309
// 321: goto 32f
// 324: ldc2_w 1010686656572218363
// 327: lload 5
// 329: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32e: athrow
// 32f: nop
// 330: iload 19
// 332: ifeq 685
// 335: aload 0
// 336: goto 344
// 339: ldc2_w 1010686656572218363
// 33c: lload 5
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: getfield su/catlean/ry.j I
// 347: bipush 3
// 348: iadd
// 349: istore 20
// 34b: aload 0
// 34c: getfield su/catlean/ry.j I
// 34f: aload 0
// 350: getfield su/catlean/ry.n F
// 353: f2i
// 354: iadd
// 355: bipush 3
// 356: isub
// 357: istore 21
// 359: dload 1
// 35a: d2i
// 35b: istore 22
// 35d: iload 20
// 35f: iload 22
// 361: lload 5
// 363: lconst_0
// 364: lcmp
// 365: ifle 3a3
// 368: iload 19
// 36a: ifne 3a3
// 36d: if_icmpgt 3b9
// 370: goto 37e
// 373: ldc2_w 1010686656572218363
// 376: lload 5
// 378: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37d: athrow
// 37e: iload 22
// 380: iload 19
// 382: ifne 3b6
// 385: goto 393
// 388: ldc2_w 1010686656572218363
// 38b: lload 5
// 38d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 392: athrow
// 393: iload 21
// 395: goto 3a3
// 398: ldc2_w 1010686656572218363
// 39b: lload 5
// 39d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a2: athrow
// 3a3: if_icmpgt 3b5
// 3a6: bipush 1
// 3a7: goto 3ba
// 3aa: ldc2_w 1010686656572218363
// 3ad: lload 5
// 3af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b4: athrow
// 3b5: bipush 0
// 3b6: goto 3ba
// 3b9: bipush 0
// 3ba: ifeq 475
// 3bd: aload 0
// 3be: getfield su/catlean/ry.W I
// 3c1: sipush 28968
// 3c4: ldc2_w 7179416985527723590
// 3c7: lload 5
// 3c9: lxor
// 3ca: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cf: iadd
// 3d0: istore 20
// 3d2: aload 0
// 3d3: getfield su/catlean/ry.W I
// 3d6: sipush 15109
// 3d9: ldc2_w 4783136351811693678
// 3dc: lload 5
// 3de: lxor
// 3df: invokedynamic n (IJ)I bsm=su/catlean/ry.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: iadd
// 3e5: istore 21
// 3e7: dload 3
// 3e8: d2i
// 3e9: istore 22
// 3eb: iload 20
// 3ed: iload 22
// 3ef: lload 5
// 3f1: lconst_0
// 3f2: lcmp
// 3f3: iflt 431
// 3f6: iload 19
// 3f8: ifne 431
// 3fb: if_icmpgt 447
// 3fe: goto 40c
// 401: ldc2_w 1010686656572218363
// 404: lload 5
// 406: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40b: athrow
// 40c: iload 22
// 40e: iload 19
// 410: ifne 444
// 413: goto 421
// 416: ldc2_w 1010686656572218363
// 419: lload 5
// 41b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 420: athrow
// 421: iload 21
// 423: goto 431
// 426: ldc2_w 1010686656572218363
// 429: lload 5
// 42b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 430: athrow
// 431: if_icmpgt 443
// 434: bipush 1
// 435: goto 448
// 438: ldc2_w 1010686656572218363
// 43b: lload 5
// 43d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 442: athrow
// 443: bipush 0
// 444: goto 448
// 447: bipush 0
// 448: lload 5
// 44a: lconst_0
// 44b: lcmp
// 44c: iflt 464
// 44f: ifeq 475
// 452: aload 0
// 453: aconst_null
// 454: putfield su/catlean/ry.o Lsu/catlean/tw;
// 457: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 45a: invokevirtual su/catlean/d2.N ()Lsu/catlean/lp;
// 45d: lload 17
// 45f: invokevirtual su/catlean/lp.L (J)V
// 462: iload 19
// 464: ifeq 685
// 467: goto 475
// 46a: ldc2_w 1010686656572218363
// 46d: lload 5
// 46f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 474: athrow
// 475: aload 0
// 476: getfield su/catlean/ry.o Lsu/catlean/tw;
// 479: astore 20
// 47b: aload 20
// 47d: iload 19
// 47f: ifne 495
// 482: ifnull 676
// 485: goto 493
// 488: ldc2_w 1010686656572218363
// 48b: lload 5
// 48d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 492: athrow
// 493: aload 20
// 495: lload 15
// 497: invokevirtual su/catlean/tw.T (J)Ljava/util/List;
// 49a: astore 21
// 49c: aload 21
// 49e: iload 19
// 4a0: ifne 4c7
// 4a3: ifnull 676
// 4a6: goto 4b4
// 4a9: ldc2_w 1010686656572218363
// 4ac: lload 5
// 4ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b3: athrow
// 4b4: aload 21
// 4b6: checkcast java/lang/Iterable
// 4b9: goto 4c7
// 4bc: ldc2_w 1010686656572218363
// 4bf: lload 5
// 4c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c6: athrow
// 4c7: astore 23
// 4c9: nop
// 4ca: bipush 0
// 4cb: istore 24
// 4cd: aload 23
// 4cf: astore 25
// 4d1: new java/util/ArrayList
// 4d4: dup
// 4d5: invokespecial java/util/ArrayList.<init> ()V
// 4d8: checkcast java/util/Collection
// 4db: astore 26
// 4dd: bipush 0
// 4de: istore 27
// 4e0: aload 25
// 4e2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 4e7: astore 28
// 4e9: aload 28
// 4eb: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4f0: ifeq 5fb
// 4f3: aload 28
// 4f5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4fa: astore 29
// 4fc: aload 29
// 4fe: checkcast su/catlean/ru
// 501: astore 30
// 503: bipush 0
// 504: istore 31
// 506: lload 5
// 508: lconst_0
// 509: lcmp
// 50a: iflt 611
// 50d: aload 30
// 50f: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 512: invokevirtual su/catlean/a1.c ()Lkotlin/jvm/functions/Function0;
// 515: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 51a: checkcast java/lang/Boolean
// 51d: invokevirtual java/lang/Boolean.booleanValue ()Z
// 520: iload 19
// 522: ifne 60f
// 525: iload 19
// 527: ifne 5b3
// 52a: goto 538
// 52d: ldc2_w 1010686656572218363
// 530: lload 5
// 532: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 537: athrow
// 538: ifeq 57c
// 53b: goto 549
// 53e: ldc2_w 1010686656572218363
// 541: lload 5
// 543: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 548: athrow
// 549: aload 30
// 54b: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 54e: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 551: iload 19
// 553: lload 5
// 555: lconst_0
// 556: lcmp
// 557: ifle 59f
// 55a: ifne 596
// 55d: goto 56b
// 560: ldc2_w 1010686656572218363
// 563: lload 5
// 565: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56a: athrow
// 56b: ifnull 5d9
// 56e: goto 57c
// 571: ldc2_w 1010686656572218363
// 574: lload 5
// 576: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57b: athrow
// 57c: aload 30
// 57e: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 581: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 584: dup
// 585: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 588: goto 596
// 58b: ldc2_w 1010686656572218363
// 58e: lload 5
// 590: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 595: athrow
// 596: lload 5
// 598: lconst_0
// 599: lcmp
// 59a: ifle 5d0
// 59d: iload 19
// 59f: ifne 5d0
// 5a2: invokevirtual su/catlean/h.L ()Z
// 5a5: goto 5b3
// 5a8: ldc2_w 1010686656572218363
// 5ab: lload 5
// 5ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b2: athrow
// 5b3: ifeq 5e8
// 5b6: aload 30
// 5b8: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 5bb: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 5be: dup
// 5bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5c2: goto 5d0
// 5c5: ldc2_w 1010686656572218363
// 5c8: lload 5
// 5ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5cf: athrow
// 5d0: invokevirtual su/catlean/h.x ()Lsu/catlean/w7;
// 5d3: getstatic su/catlean/w7.BOOLS Lsu/catlean/w7;
// 5d6: if_acmpeq 5e8
// 5d9: bipush 1
// 5da: goto 5e9
// 5dd: ldc2_w 1010686656572218363
// 5e0: lload 5
// 5e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e7: athrow
// 5e8: bipush 0
// 5e9: ifeq 4e9
// 5ec: aload 26
// 5ee: aload 29
// 5f0: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 5f5: pop
// 5f6: iload 19
// 5f8: ifeq 4e9
// 5fb: aload 26
// 5fd: checkcast java/util/List
// 600: nop
// 601: checkcast java/lang/Iterable
// 604: astore 23
// 606: nop
// 607: lload 5
// 609: lconst_0
// 60a: lcmp
// 60b: ifle 611
// 60e: bipush 0
// 60f: istore 24
// 611: aload 23
// 613: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 618: astore 25
// 61a: aload 25
// 61c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 621: ifeq 669
// 624: aload 25
// 626: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 62b: astore 26
// 62d: aload 26
// 62f: checkcast su/catlean/ru
// 632: astore 27
// 634: bipush 0
// 635: istore 28
// 637: aload 27
// 639: lload 10
// 63b: dload 1
// 63c: dload 3
// 63d: iload 7
// 63f: invokevirtual su/catlean/ru.W (JDDI)V
// 642: nop
// 643: iload 19
// 645: lload 5
// 647: lconst_0
// 648: lcmp
// 649: iflt 673
// 64c: ifne 66a
// 64f: iload 19
// 651: ifeq 61a
// 654: lload 5
// 656: lconst_0
// 657: lcmp
// 658: iflt 643
// 65b: goto 669
// 65e: ldc2_w 1010686656572218363
// 661: lload 5
// 663: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 668: athrow
// 669: nop
// 66a: lload 5
// 66c: lconst_0
// 66d: lcmp
// 66e: ifle 677
// 671: iload 19
// 673: ifeq 685
// 676: nop
// 677: goto 685
// 67a: ldc2_w 1010686656572218363
// 67d: lload 5
// 67f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 684: athrow
// 685: return
}

public final void I(double mouseX, double mouseY, int button, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ry.a J
// 03: lload 6
// 05: lxor
// 06: lstore 6
// 08: lload 6
// 0a: dup2
// 0b: ldc2_w 96953476460594
// 0e: lxor
// 0f: lstore 8
// 11: pop2
// 12: ldc2_w 7760488759755941814
// 15: lload 6
// 17: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c: istore 10
// 1e: aload 0
// 1f: getfield su/catlean/ry.o Lsu/catlean/tw;
// 22: iload 10
// 24: ifne 4a
// 27: ifnull ea
// 2a: goto 38
// 2d: ldc2_w 7766957349684821556
// 30: lload 6
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: aload 0
// 39: getfield su/catlean/ry.o Lsu/catlean/tw;
// 3c: goto 4a
// 3f: ldc2_w 7766957349684821556
// 42: lload 6
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: dup
// 4b: ifnull e8
// 4e: lload 8
// 50: invokevirtual su/catlean/tw.T (J)Ljava/util/List;
// 53: iload 10
// 55: ifne 89
// 58: goto 66
// 5b: ldc2_w 7766957349684821556
// 5e: lload 6
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: dup
// 67: ifnull e8
// 6a: goto 78
// 6d: ldc2_w 7766957349684821556
// 70: lload 6
// 72: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77: athrow
// 78: checkcast java/lang/Iterable
// 7b: goto 89
// 7e: ldc2_w 7766957349684821556
// 81: lload 6
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: astore 11
// 8b: bipush 0
// 8c: istore 12
// 8e: aload 11
// 90: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 95: astore 13
// 97: aload 13
// 99: invokeinterface java/util/Iterator.hasNext ()Z 1
// 9e: ifeq e4
// a1: aload 13
// a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// a8: astore 14
// aa: aload 14
// ac: checkcast su/catlean/ru
// af: astore 15
// b1: bipush 0
// b2: istore 16
// b4: aload 15
// b6: dload 1
// b7: dload 3
// b8: iload 5
// ba: invokevirtual su/catlean/ru.U (DDI)V
// bd: nop
// be: iload 10
// c0: lload 6
// c2: lconst_0
// c3: lcmp
// c4: iflt cc
// c7: ifne e5
// ca: iload 10
// cc: ifeq 97
// cf: lload 6
// d1: lconst_0
// d2: lcmp
// d3: iflt be
// d6: goto e4
// d9: ldc2_w 7766957349684821556
// dc: lload 6
// de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e3: athrow
// e4: nop
// e5: goto ea
// e8: pop
// e9: nop
// ea: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void O(int key, long a) {
ax = a ^ ax;
long var10001 = ax ^ 83194496933834L;
int var4 = (int)((ax ^ 83194496933834L) >>> 48);
int var5 = (int)((ax ^ 83194496933834L) << 16 >>> 48);
int var6 = (int)(var10001 << 32 >>> 32);
Iterable var8 = this.V;
boolean var10000 = vm.a<"Å">(7407474435709545160L, ax);
boolean var9 = false;
boolean var7 = var10000;

label38:
for (Object var11 : var8) {
tw var12 = (tw)var11;
boolean var13 = false;

try {
var12.R((short)var4, (short)var5, key, var6);
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 7401577095760556874L, ax);
}

do {
try {
var10000 = var7;
if (ax >= 0L) {
if (var7) {
return;
}

var10000 = var7;
}

if (!var10000) {
continue label38;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 7401577095760556874L, ax);
}
} while (ax <= 0L);

return;
}
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void V(int a, char char, short a, int a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 85006635605390L;
Iterable var10 = this.V;
boolean var11 = false;
boolean var10000 = vm.a<"Å">(5698121058664383255L, var5);
Iterator var12 = var10.iterator();
boolean var9 = var10000;

label38:
while (var12.hasNext()) {
Object var13 = var12.next();
tw var14 = (tw)var13;
boolean var15 = false;

try {
var14.l(char, var7);
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, 5722042190623251093L, var5);
}

do {
try {
var10000 = var9;
if (axx >= 0) {
if (var9) {
return;
}

var10000 = var9;
}

if (!var10000) {
continue label38;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 5722042190623251093L, var5);
}
} while (axxx <= 0);

return;
}
}

public final boolean X(double mouseX, double mouseY, double verticalAmount, double horizontalAmmount, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ry.a J
// 03: lload 9
// 05: lxor
// 06: lstore 9
// 08: lload 9
// 0a: dup2
// 0b: ldc2_w 124172499303919
// 0e: lxor
// 0f: lstore 11
// 11: pop2
// 12: ldc2_w -7363964978868464183
// 15: lload 9
// 17: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c: bipush 0
// 1d: istore 14
// 1f: istore 13
// 21: aload 0
// 22: getfield su/catlean/ry.V Ljava/util/ArrayList;
// 25: checkcast java/lang/Iterable
// 28: astore 15
// 2a: bipush 0
// 2b: istore 16
// 2d: aload 15
// 2f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 34: astore 17
// 36: aload 17
// 38: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3d: ifeq 98
// 40: aload 17
// 42: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 47: astore 18
// 49: aload 18
// 4b: checkcast su/catlean/tw
// 4e: astore 19
// 50: bipush 0
// 51: istore 20
// 53: iload 13
// 55: lload 9
// 57: lconst_0
// 58: lcmp
// 59: iflt 95
// 5c: ifne 93
// 5f: aload 19
// 61: dload 1
// 62: lload 11
// 64: dload 3
// 65: dload 5
// 67: invokevirtual su/catlean/tw.v (DJDD)Z
// 6a: iload 13
// 6c: ifne 9b
// 6f: goto 7d
// 72: ldc2_w -7370425315315135413
// 75: lload 9
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: ifeq 91
// 80: goto 8e
// 83: ldc2_w -7370425315315135413
// 86: lload 9
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: bipush 1
// 8f: istore 14
// 91: nop
// 92: nop
// 93: iload 13
// 95: ifeq 36
// 98: nop
// 99: iload 14
// 9b: ireturn
}

public final void d(double verticalAmount, double horizontalAmmount) {
this.g += (int)(verticalAmount * 10.0F);
this.u += (int)(horizontalAmmount * 10.0F);
}

private final float R(long var1, float var3, float var4, float var5) {
var1 = a ^ var1;

float var10000;
label17: {
try {
if (nk.f.D() > 5) {
var10000 = 1.0F / nk.f.D();
break label17;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 5147225343578378899L, var1);
}

var10000 = 0.016F;
}

float var6 = Math.clamp(var10000 * var5, 0.0F, 1.0F);
return (1.0F - var6) * var3 + var6 * var4;
}

public final void d(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ry.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 108388241933608
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w -2402404522736184660
// 11: lload 1
// 12: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: istore 5
// 19: iload 5
// 1b: ifne c3
// 1e: aload 0
// 1f: getfield su/catlean/ry.o Lsu/catlean/tw;
// 22: dup
// 23: ifnull c2
// 26: goto 33
// 29: ldc2_w -2390289662662145234
// 2c: lload 1
// 2d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: athrow
// 33: lload 3
// 34: invokevirtual su/catlean/tw.T (J)Ljava/util/List;
// 37: iload 5
// 39: ifne 6a
// 3c: goto 49
// 3f: ldc2_w -2390289662662145234
// 42: lload 1
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: dup
// 4a: ifnull c2
// 4d: goto 5a
// 50: ldc2_w -2390289662662145234
// 53: lload 1
// 54: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59: athrow
// 5a: checkcast java/lang/Iterable
// 5d: goto 6a
// 60: ldc2_w -2390289662662145234
// 63: lload 1
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: astore 6
// 6c: bipush 0
// 6d: istore 7
// 6f: aload 6
// 71: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 76: astore 8
// 78: aload 8
// 7a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 7f: ifeq be
// 82: aload 8
// 84: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 89: astore 9
// 8b: aload 9
// 8d: checkcast su/catlean/ru
// 90: astore 10
// 92: bipush 0
// 93: istore 11
// 95: aload 10
// 97: invokevirtual su/catlean/ru.L ()V
// 9a: nop
// 9b: iload 5
// 9d: lload 1
// 9e: lconst_0
// 9f: lcmp
// a0: ifle a8
// a3: ifne bf
// a6: iload 5
// a8: ifeq 78
// ab: lload 1
// ac: lconst_0
// ad: lcmp
// ae: iflt 9b
// b1: goto be
// b4: ldc2_w -2390289662662145234
// b7: lload 1
// b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bd: athrow
// be: nop
// bf: goto c4
// c2: pop
// c3: nop
// c4: aload 0
// c5: bipush 1
// c6: putfield su/catlean/ry.T Z
// c9: return
}

private final float U(float param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ry.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w 8775809826433742285
// 09: lload 2
// 0a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: istore 4
// 11: fload 1
// 12: invokestatic java/lang/Float.isNaN (F)Z
// 15: iload 4
// 17: ifne 49
// 1a: ifeq 38
// 1d: goto 2a
// 20: ldc2_w 8769350071416237135
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: fconst_1
// 2b: goto 4d
// 2e: ldc2_w 8769350071416237135
// 31: lload 2
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: fload 1
// 39: ldc 100.0
// 3b: fmul
// 3c: invokestatic kotlin/math/MathKt.roundToInt (F)I
// 3f: i2f
// 40: ldc 100.0
// 42: fdiv
// 43: ldc 10.0
// 45: fmul
// 46: invokestatic kotlin/math/MathKt.roundToInt (F)I
// 49: i2f
// 4a: ldc 10.0
// 4c: fdiv
// 4d: freturn
}

static {
long var22 = a ^ 26139283733853L;
Cipher var24;
Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var25 = 1; var25 < 8; var25++) {
var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var31 = new String[10];
int var29 = 0;
String var28 = "kì|\u0087Ô¢\u0011Íz\u0004ëXßÃsQ7}\u0092E\u0019+0«\u0018\u0017\u000e¤Ó\u0018\u009dNµ\u000fñËóvHEÖ³\u0006£Kôtï\u009b\u0018\u008b\u0002ú>zâ\u0014VîõÕÜF_G\u0091\u001a*v¤?p¡M \u0080®_6Ã\u0093Ï\u0080\u0000KyE\b\u0005â\r\u0004E\u0086ãV\u0007g]çë\u0082\u0087kÔÛ6\u0018l\u00807?_»¿\\\u0010\u00adçl·±ðÅ\u0092&\u0019çÐG\u0013t J\u001fÐX<\u001b\u009c\u0005°õ¿ñöF\u009bJéÏ%/ýYL¨«\u0015\u0091hÓ1õ\u0091\u0010K#ìSP³\u007fE£\u0093\u0091è;°\u009b¹ i\u009bÇÞ\u0013\u001a^\u008c!]\u000f\u0001½\"\u008as\"t!-é|ù\u0093G¶h¹*º3¬";
int var30 = "kì|\u0087Ô¢\u0011Íz\u0004ëXßÃsQ7}\u0092E\u0019+0«\u0018\u0017\u000e¤Ó\u0018\u009dNµ\u000fñËóvHEÖ³\u0006£Kôtï\u009b\u0018\u008b\u0002ú>zâ\u0014VîõÕÜF_G\u0091\u001a*v¤?p¡M \u0080®_6Ã\u0093Ï\u0080\u0000KyE\b\u0005â\r\u0004E\u0086ãV\u0007g]çë\u0082\u0087kÔÛ6\u0018l\u00807?_»¿\\\u0010\u00adçl·±ðÅ\u0092&\u0019çÐG\u0013t J\u001fÐX<\u001b\u009c\u0005°õ¿ñöF\u009bJéÏ%/ýYL¨«\u0015\u0091hÓ1õ\u0091\u0010K#ìSP³\u007fE£\u0093\u0091è;°\u009b¹ i\u009bÇÞ\u0013\u001a^\u008c!]\u000f\u0001½\"\u008as\"t!-é|ù\u0093G¶h¹*º3¬"
.length();
char var27 = 24;
int var35 = -1;

label72:
while (true) {
String var36 = var28.substring(++var35, var35 + var27);
int var10001 = -1;

while (true) {
byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
String var50 = a(var32).intern();
switch (var10001) {
case 0:
var31[var29++] = var50;
if ((var35 += var27) >= var30) {
b = var31;
c = new String[10];
i = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[15];
int var14 = 0;
String var15 = "Æ/D\u0081m\u0003É\u0081\u0098\u0080\u0095\tu\b=ðxÓ\u0002\u000fD±6\u0019ìn-\u0018*²r\u008f\u0001j^Ëmÿ\u009eØ\u0015eýÓÇÏ0¡É\u009e\u0001çÄ\u0090Y1ªëB^]ü\"5MÂÕ\u0087èXxV\u000e\u008d\u0001×\u0017µi\u008d\u0015ÀumÁÕD'«©\u009c\u0080p\u0087\u008eÄ¨\u0003\u0000ûØ|Ê³";
int var16 = "Æ/D\u0081m\u0003É\u0081\u0098\u0080\u0095\tu\b=ðxÓ\u0002\u000fD±6\u0019ìn-\u0018*²r\u008f\u0001j^Ëmÿ\u009eØ\u0015eýÓÇÏ0¡É\u009e\u0001çÄ\u0090Y1ªëB^]ü\"5MÂÕ\u0087èXxV\u000e\u008d\u0001×\u0017µi\u008d\u0015ÀumÁÕD'«©\u009c\u0080p\u0087\u008eÄ¨\u0003\u0000ûØ|Ê³"
.length();
byte var13 = 0;

label54:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var39 = var17;
var10001 = var14++;
long var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var58 = -1;

while (true) {
long var19 = var54;
byte[] var21 = var11.doFinal(
new byte[]{
(byte)(var19 >>> 56),
(byte)(var19 >>> 48),
(byte)(var19 >>> 40),
(byte)(var19 >>> 32),
(byte)(var19 >>> 24),
(byte)(var19 >>> 16),
(byte)(var19 >>> 8),
(byte)var19
}
);
long var62 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var58) {
case 0:
var39[var10001] = var62;
if (var13 >= var16) {
f = var17;
h = new Integer[15];
m = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "¿Ã\u009dÍ\u00ad@h;\u0092\u0019(ÅzÌÎsÑ;2\u0080\u009b\u0092\u0011\u008f";
int var5 = "¿Ã\u009dÍ\u00ad@h;\u0092\u0019(ÅzÌÎsÑ;2\u0080\u009b\u0092\u0011\u008f".length();
byte var2 = 0;

do {
int var47 = var2;
var2 += 8;
byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var47 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
var62 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var61 = -1;
var6[var47] = var62;
} while (var2 < var5);

k = var6;
l = new Long[3];
return;
}
break;
default:
var39[var10001] = var62;
if (var13 < var16) {
continue label54;
}

var15 = "\u0012Qø\t^wuæ\u0081<\u001fâ¨q\u0097À";
var16 = "\u0012Qø\t^wuæ\u0081<\u001fâ¨q\u0097À".length();
var13 = 0;
}

byte var46 = var13;
var13 += 8;
var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
var39 = var17;
var10001 = var14++;
var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var58 = 0;
}
}
}

var27 = var28.charAt(var35);
break;
default:
var31[var29++] = var50;
if ((var35 += var27) < var30) {
var27 = var28.charAt(var35);
continue label72;
}

var28 = "î>|\u001dïþ\u0097Ê(@\u0084ã\u008cs~\u0016\u008f¼{¡à\u0080HaÚ\u0012\u0098¨\u0019íg\u000e\u0010\u0080\u009cn,ò±\u0084\u0016v³Ãþ\u000e£GN";
var30 = "î>|\u001dïþ\u0097Ê(@\u0084ã\u008cs~\u0016\u008f¼{¡à\u0080HaÚ\u0012\u0098¨\u0019íg\u000e\u0010\u0080\u009cn,ò±\u0084\u0016v³Ãþ\u000e£GN".length();
var27 = ' ';
var35 = -1;
}

var36 = var28.substring(++var35, var35 + var27);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 20036;
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
throw new RuntimeException("su/catlean/ry", var10);
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
throw new RuntimeException("su/catlean/ry" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 22769;
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
throw new RuntimeException("su/catlean/ry", var14);
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
throw new RuntimeException("su/catlean/ry" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 29208;
if (l[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = k[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])m.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
m.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ry", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
l[var3] = var15;
}

return l[var3];
}

private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = c(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
return var7;
}

private static CallSite c(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ry" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
