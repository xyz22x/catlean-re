package su.catlean;

import java.awt.Color;
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
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class tw {
@NotNull
private final ry y;
@NotNull
private final _g j;
private float D;
private float p;
private float I;
private float J;
@NotNull
private final fd P;
@NotNull
private final fd F;
@NotNull
private final fd Z;
@NotNull
private final fd v;
@NotNull
private final fd w;
@NotNull
private final fd m;
@NotNull
private final fd E;
@NotNull
private final List X;
private boolean l;
private boolean a;
private long r;
private static final long b = yz.a(-7372753313878987426L, 3777541502221453432L, MethodHandles.lookup().lookupClass()).a(64410153257794L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;
private static final long[] i;
private static final Long[] k;
private static final Map n;

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public tw(@NotNull ry catComponent, long a, @NotNull _g module, float x, float y) {
ax = b ^ ax;
long var10001 = ax ^ 3515260228587L;
int var7 = (int)((ax ^ 3515260228587L) >>> 32);
int var8 = (int)((ax ^ 3515260228587L) << 32 >>> 48);
int var9 = (int)(var10001 << 48 >>> 48);
var10001 = ax ^ 73619947565203L;
int var10 = (int)((ax ^ 73619947565203L) >>> 48);
int var11 = (int)((ax ^ 73619947565203L) << 16 >>> 48);
int var12 = (int)(var10001 << 32 >>> 32);
long var13 = ax ^ 54776653370525L;
long var15 = ax ^ 108667533445084L;
long var17 = ax ^ 115572654037597L;
var10001 = ax ^ 81785692854298L;
int var19 = (int)((ax ^ 81785692854298L) >>> 48);
int var20 = (int)((ax ^ 81785692854298L) << 16 >>> 32);
int var21 = (int)(var10001 << 48 >>> 48);
long var22 = ax ^ 110674456712420L;
long var24 = ax ^ 2621492057657L;
long var26 = ax ^ 93092651841198L;
long var28 = ax ^ 5175644682069L;
long var30 = ax ^ 100074819104061L;
long var32 = ax ^ 3971805774247L;
var10001 = ax ^ 81011290694423L;
int var34 = (int)((ax ^ 81011290694423L) >>> 48);
int var35 = (int)((ax ^ 81011290694423L) << 16 >>> 32);
int var36 = (int)(var10001 << 48 >>> 48);
long var37 = ax ^ 37079803336860L;
Intrinsics.checkNotNullParameter(catComponent, a<"s">(13536, 7894675845108581078L ^ ax));
Intrinsics.checkNotNullParameter(module, a<"s">(14497, 2754453130869755544L ^ ax));
super();
this.y = catComponent;
this.j = module;
this.D = x;
this.p = yx;
this.I = 120.0F;
this.J = 17.0F;
this.P = new fd(_s.OUT_QUINT, c<"f">(542, 2056235043133386882L ^ ax), var22);
this.F = new fd(_s.OUT_QUINT, c<"f">(30770, 8015806700977818287L ^ ax), var22);
this.Z = new fd(_s.OUT_QUINT, c<"f">(222, 5538930166900355648L ^ ax), var22);
this.v = new fd(_s.OUT_QUINT, c<"f">(30770, 8015806700977818287L ^ ax), var22);
this.w = new fd(_s.OUT_QUINT, c<"f">(30770, 8015806700977818287L ^ ax), var22);
this.m = new fd(_s.OUT_QUINT, c<"f">(30770, 8015806700977818287L ^ ax), var22);
this.E = new fd(_s.OUT_QUINT, c<"f">(30770, 8015806700977818287L ^ ax), var22);
this.X = new ArrayList();
Iterable var39 = this.j.c();
boolean var40 = false;

for (Object var42 : var39) {
a1 var43 = (a1)var42;
boolean var44 = false;
Object var45 = var43.F();

ru var74;
label255: {
label244: {
try {
if (ax <= 0L) {
break;
}

var10000 = var45 instanceof Boolean;
if (ax <= 0L) {
break label244;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(14858, 7831359790229965861L ^ ax));
var74 = new rm(var28, var43);
break label255;
}
} catch (NoSuchElementException var72) {
throw vm.a<"Å">(var72, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof Float;
} catch (NoSuchElementException var59) {
throw vm.a<"Å">(var59, 3914998854591741224L, ax);
}
}

label234: {
try {
if (ax <= 0L) {
break label234;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(22431, 5745966802039775656L ^ ax));
var74 = new ra(var43, var17);
break label255;
}
} catch (NoSuchElementException var71) {
throw vm.a<"Å">(var71, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof Integer;
} catch (NoSuchElementException var58) {
throw vm.a<"Å">(var58, 3914998854591741224L, ax);
}
}

label224: {
try {
if (ax <= 0L) {
break label224;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(5067, 6133993353988400615L ^ ax));
var74 = new r1(var24, var43);
break label255;
}
} catch (NoSuchElementException var70) {
throw vm.a<"Å">(var70, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof lj;
} catch (NoSuchElementException var57) {
throw vm.a<"Å">(var57, 3914998854591741224L, ax);
}
}

label214: {
try {
if (ax < 0L) {
break label214;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(27827, 5557604223927425682L ^ ax));
var74 = new rk(var43, var26);
break label255;
}
} catch (NoSuchElementException var69) {
throw vm.a<"Å">(var69, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof String;
} catch (NoSuchElementException var56) {
throw vm.a<"Å">(var56, 3914998854591741224L, ax);
}
}

label204: {
try {
if (ax < 0L) {
break label204;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(13448, 8026160374295315115L ^ ax));
var74 = new r6(var7, var8, var43, var9);
break label255;
}
} catch (NoSuchElementException var68) {
throw vm.a<"Å">(var68, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof Color;
} catch (NoSuchElementException var55) {
throw vm.a<"Å">(var55, 3914998854591741224L, ax);
}
}

label194: {
try {
if (ax < 0L) {
break label194;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(12791, 4537580740725622733L ^ ax));
var74 = new rx(var43, var30);
break label255;
}
} catch (NoSuchElementException var67) {
throw vm.a<"Å">(var67, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof h;
} catch (NoSuchElementException var54) {
throw vm.a<"Å">(var54, 3914998854591741224L, ax);
}
}

label184: {
try {
if (ax < 0L) {
break label184;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(15811, 5837639000607116267L ^ ax));
var74 = new r0(var43, this, var32);
break label255;
}
} catch (NoSuchElementException var66) {
throw vm.a<"Å">(var66, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof dg;
} catch (NoSuchElementException var53) {
throw vm.a<"Å">(var53, 3914998854591741224L, ax);
}
}

label174: {
try {
if (ax < 0L) {
break label174;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(32670, 6452203207152339362L ^ ax));
var74 = new r9((short)var34, var35, var36, var43);
break label255;
}
} catch (NoSuchElementException var65) {
throw vm.a<"Å">(var65, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof d4;
} catch (NoSuchElementException var52) {
throw vm.a<"Å">(var52, 3914998854591741224L, ax);
}
}

label164: {
try {
if (ax < 0L) {
break label164;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(4640, 3612615388757124106L ^ ax));
var74 = new r_((short)var19, var43, var20, (char)var21);
break label255;
}
} catch (NoSuchElementException var64) {
throw vm.a<"Å">(var64, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof nv;
} catch (NoSuchElementException var51) {
throw vm.a<"Å">(var51, 3914998854591741224L, ax);
}
}

label154: {
try {
if (ax <= 0L) {
break label154;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(22604, 634636021568614002L ^ ax));
var74 = new rn(var43, var13);
break label255;
}
} catch (NoSuchElementException var63) {
throw vm.a<"Å">(var63, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof id;
} catch (NoSuchElementException var50) {
throw vm.a<"Å">(var50, 3914998854591741224L, ax);
}
}

label144: {
try {
if (ax < 0L) {
break label144;
}

if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(6554, 4128206220285439909L ^ ax));
var74 = new ri(var37, var43);
break label255;
}
} catch (NoSuchElementException var62) {
throw vm.a<"Å">(var62, 3914998854591741224L, ax);
}

try {
var10000 = var45 instanceof oi;
} catch (NoSuchElementException var49) {
throw vm.a<"Å">(var49, 3914998854591741224L, ax);
}
}

try {
if (var10000) {
Intrinsics.checkNotNull(var43, a<"s">(13560, 3483612914308137672L ^ ax));
var74 = new ro(var43, var15);
break label255;
}
} catch (NoSuchElementException var61) {
throw vm.a<"Å">(var61, 3914998854591741224L, ax);
}

Intrinsics.checkNotNull(var43, a<"s">(6463, 4718497147711647519L ^ ax));
var74 = new rf((short)var10, (char)var11, var43, var12);
}

ru var46 = var74;

label125: {
try {
if (ax <= 0L
|| Intrinsics.areEqual(var43.e(), a<"s">(13469, 3068832399139226284L ^ ax))
|| Intrinsics.areEqual(var43.e(), a<"s">(13686, 8906308283119780703L ^ ax))) {
break label125;
}
} catch (NoSuchElementException var60) {
throw vm.a<"Å">(var60, 3914998854591741224L, ax);
}

boolean var48 = false;
this.X.add(var46);
}

if (ax <= 0L) {
break;
}
}
}

@NotNull
public final _g K() {
return this.j;
}

public final float k() {
return this.D;
}

public final void m(float <set-?>) {
this.D = <set-?>;
}

public final float Y() {
return this.p;
}

public final void n(float <set-?>) {
this.p = <set-?>;
}

public final float P() {
return this.I;
}

public final void e(float <set-?>) {
this.I = <set-?>;
}

public final float V() {
return this.J;
}

public final void x(float <set-?>) {
this.J = <set-?>;
}

@NotNull
public final List T(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/tw.b J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: aload 0
// 07: getfield su/catlean/tw.X Ljava/util/List;
// 0a: checkcast java/lang/Iterable
// 0d: astore 4
// 0f: ldc2_w 2408255522490969455
// 12: lload 1
// 13: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: bipush 0
// 19: istore 5
// 1b: aload 4
// 1d: astore 6
// 1f: new java/util/ArrayList
// 22: dup
// 23: invokespecial java/util/ArrayList.<init> ()V
// 26: checkcast java/util/Collection
// 29: astore 7
// 2b: bipush 0
// 2c: istore 8
// 2e: aload 6
// 30: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 35: astore 9
// 37: istore 3
// 38: aload 9
// 3a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3f: ifeq 90
// 42: aload 9
// 44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 49: astore 10
// 4b: aload 10
// 4d: checkcast su/catlean/ru
// 50: astore 11
// 52: bipush 0
// 53: istore 12
// 55: aload 11
// 57: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 5a: invokevirtual su/catlean/a1.c ()Lkotlin/jvm/functions/Function0;
// 5d: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 62: checkcast java/lang/Boolean
// 65: invokevirtual java/lang/Boolean.booleanValue ()Z
// 68: lload 1
// 69: lconst_0
// 6a: lcmp
// 6b: iflt 8d
// 6e: iload 3
// 6f: ifne 8b
// 72: ifeq 38
// 75: goto 82
// 78: ldc2_w 2448455947279493766
// 7b: lload 1
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: aload 7
// 84: aload 10
// 86: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 8b: pop
// 8c: iload 3
// 8d: ifeq 38
// 90: aload 7
// 92: checkcast java/util/List
// 95: nop
// 96: lload 1
// 97: lconst_0
// 98: lcmp
// 99: iflt 49
// 9c: areturn
}

public final void m(long a, @NotNull List value) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(value, a<"s">(24364, 4256817241053333068L ^ ax));
this.X.addAll(value);
}

public final boolean z() {
return this.l;
}

public final void G(boolean <set-?>) {
this.l = <set-?>;
}

public final void E(@NotNull class_332 context, int mouseX, int mouseY, char a, short a, int a, float factor, boolean hAnimation) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 4
// 002: i2l
// 003: bipush 48
// 005: lshl
// 006: iload 5
// 008: i2l
// 009: bipush 48
// 00b: lshl
// 00c: bipush 16
// 00e: lushr
// 00f: lor
// 010: iload 6
// 012: i2l
// 013: bipush 32
// 015: lshl
// 016: bipush 32
// 018: lushr
// 019: lor
// 01a: getstatic su/catlean/tw.b J
// 01d: lxor
// 01e: lstore 9
// 020: lload 9
// 022: dup2
// 023: ldc2_w 28265762117029
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 88243873467815
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 61668449675624
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 63694352095670
// 03b: lxor
// 03c: lstore 17
// 03e: dup2
// 03f: ldc2_w 31692093097511
// 042: lxor
// 043: lstore 19
// 045: dup2
// 046: ldc2_w 82634963213552
// 049: lxor
// 04a: dup2
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 21
// 051: dup2
// 052: bipush 16
// 054: lshl
// 055: bipush 32
// 057: lushr
// 058: l2i
// 059: istore 22
// 05b: dup2
// 05c: bipush 48
// 05e: lshl
// 05f: bipush 48
// 061: lushr
// 062: l2i
// 063: istore 23
// 065: pop2
// 066: dup2
// 067: ldc2_w 71447057612265
// 06a: lxor
// 06b: dup2
// 06c: bipush 48
// 06e: lushr
// 06f: l2i
// 070: istore 24
// 072: dup2
// 073: bipush 16
// 075: lshl
// 076: bipush 32
// 078: lushr
// 079: l2i
// 07a: istore 25
// 07c: dup2
// 07d: bipush 48
// 07f: lshl
// 080: bipush 48
// 082: lushr
// 083: l2i
// 084: istore 26
// 086: pop2
// 087: dup2
// 088: ldc2_w 63863362080413
// 08b: lxor
// 08c: lstore 27
// 08e: dup2
// 08f: ldc2_w 29598910585250
// 092: lxor
// 093: lstore 29
// 095: dup2
// 096: ldc2_w 137955886403719
// 099: lxor
// 09a: lstore 31
// 09c: dup2
// 09d: ldc2_w 19208424670029
// 0a0: lxor
// 0a1: lstore 33
// 0a3: dup2
// 0a4: ldc2_w 112797863280240
// 0a7: lxor
// 0a8: dup2
// 0a9: bipush 48
// 0ab: lushr
// 0ac: l2i
// 0ad: istore 35
// 0af: dup2
// 0b0: bipush 16
// 0b2: lshl
// 0b3: bipush 48
// 0b5: lushr
// 0b6: l2i
// 0b7: istore 36
// 0b9: dup2
// 0ba: bipush 32
// 0bc: lshl
// 0bd: bipush 32
// 0bf: lushr
// 0c0: l2i
// 0c1: istore 37
// 0c3: pop2
// 0c4: dup2
// 0c5: ldc2_w 105544157173499
// 0c8: lxor
// 0c9: lstore 38
// 0cb: dup2
// 0cc: ldc2_w 32080587451965
// 0cf: lxor
// 0d0: lstore 40
// 0d2: dup2
// 0d3: ldc2_w 8984481874929
// 0d6: lxor
// 0d7: lstore 42
// 0d9: pop2
// 0da: ldc2_w -2416468824851312014
// 0dd: lload 9
// 0df: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: aload 1
// 0e5: sipush 10869
// 0e8: ldc2_w 4289641374710117630
// 0eb: lload 9
// 0ed: lxor
// 0ee: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0f6: istore 44
// 0f8: aload 0
// 0f9: aload 0
// 0fa: getfield su/catlean/tw.l Z
// 0fd: ifeq 110
// 100: ldc 31.0
// 102: goto 112
// 105: ldc2_w -2384791803513170533
// 108: lload 9
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: ldc 17.0
// 112: putfield su/catlean/tw.J F
// 115: aload 0
// 116: getfield su/catlean/tw.P Lsu/catlean/fd;
// 119: aload 0
// 11a: getfield su/catlean/tw.j Lsu/catlean/_g;
// 11d: lload 29
// 11f: invokevirtual su/catlean/_g.f (J)Z
// 122: ifeq 134
// 125: fconst_1
// 126: goto 135
// 129: ldc2_w -2384791803513170533
// 12c: lload 9
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: fconst_0
// 135: lload 13
// 137: dup2_x1
// 138: pop2
// 139: invokevirtual su/catlean/fd.B (JF)V
// 13c: aload 0
// 13d: getfield su/catlean/tw.F Lsu/catlean/fd;
// 140: aload 0
// 141: getfield su/catlean/tw.D F
// 144: fstore 45
// 146: aload 0
// 147: getfield su/catlean/tw.D F
// 14a: aload 0
// 14b: getfield su/catlean/tw.I F
// 14e: fadd
// 14f: sipush 17105
// 152: ldc2_w 1568201349573607843
// 155: lload 9
// 157: lxor
// 158: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: i2f
// 15e: fsub
// 15f: fstore 46
// 161: iload 2
// 162: i2f
// 163: fstore 47
// 165: fload 45
// 167: fload 47
// 169: fcmpg
// 16a: iload 44
// 16c: iload 5
// 16e: iflt 19a
// 171: ifne 198
// 174: ifgt 1c1
// 177: goto 185
// 17a: ldc2_w -2384791803513170533
// 17d: lload 9
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: fload 47
// 187: fload 46
// 189: fcmpg
// 18a: goto 198
// 18d: ldc2_w -2384791803513170533
// 190: lload 9
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: iload 44
// 19a: ifne 1be
// 19d: ifgt 1bd
// 1a0: goto 1ae
// 1a3: ldc2_w -2384791803513170533
// 1a6: lload 9
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: bipush 1
// 1af: goto 1c2
// 1b2: ldc2_w -2384791803513170533
// 1b5: lload 9
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: bipush 0
// 1be: goto 1c2
// 1c1: bipush 0
// 1c2: ifeq 264
// 1c5: aload 0
// 1c6: getfield su/catlean/tw.p F
// 1c9: fstore 45
// 1cb: aload 0
// 1cc: getfield su/catlean/tw.p F
// 1cf: aload 0
// 1d0: getfield su/catlean/tw.J F
// 1d3: fadd
// 1d4: fstore 46
// 1d6: iload 3
// 1d7: i2f
// 1d8: fstore 47
// 1da: fload 45
// 1dc: fload 47
// 1de: fcmpg
// 1df: iload 44
// 1e1: iload 5
// 1e3: iflt 20f
// 1e6: ifne 20d
// 1e9: ifgt 236
// 1ec: goto 1fa
// 1ef: ldc2_w -2384791803513170533
// 1f2: lload 9
// 1f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: athrow
// 1fa: fload 47
// 1fc: fload 46
// 1fe: fcmpg
// 1ff: goto 20d
// 202: ldc2_w -2384791803513170533
// 205: lload 9
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: iload 44
// 20f: ifne 233
// 212: ifgt 232
// 215: goto 223
// 218: ldc2_w -2384791803513170533
// 21b: lload 9
// 21d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 222: athrow
// 223: bipush 1
// 224: goto 237
// 227: ldc2_w -2384791803513170533
// 22a: lload 9
// 22c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: athrow
// 232: bipush 0
// 233: goto 237
// 236: bipush 0
// 237: iload 4
// 239: iflt 243
// 23c: ifeq 264
// 23f: aload 0
// 240: getfield su/catlean/tw.l Z
// 243: ifne 264
// 246: goto 254
// 249: ldc2_w -2384791803513170533
// 24c: lload 9
// 24e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: athrow
// 254: ldc 0.5
// 256: goto 265
// 259: ldc2_w -2384791803513170533
// 25c: lload 9
// 25e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 263: athrow
// 264: fconst_0
// 265: iload 5
// 267: ifle 27d
// 26a: lload 13
// 26c: dup2_x1
// 26d: pop2
// 26e: invokevirtual su/catlean/fd.B (JF)V
// 271: aload 0
// 272: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 275: aload 0
// 276: getfield su/catlean/tw.l Z
// 279: ifeq 28b
// 27c: fconst_1
// 27d: goto 28c
// 280: ldc2_w -2384791803513170533
// 283: lload 9
// 285: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: athrow
// 28b: fconst_0
// 28c: iload 5
// 28e: iflt 2b9
// 291: lload 13
// 293: dup2_x1
// 294: pop2
// 295: invokevirtual su/catlean/fd.B (JF)V
// 298: aload 0
// 299: getfield su/catlean/tw.E Lsu/catlean/fd;
// 29c: iload 21
// 29e: i2s
// 29f: iload 22
// 2a1: iload 23
// 2a3: i2c
// 2a4: sipush 2387
// 2a7: ldc2_w 6852118643975801376
// 2aa: lload 9
// 2ac: lxor
// 2ad: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b2: invokestatic su/catlean/bx.k (SICI)Z
// 2b5: ifeq 2c7
// 2b8: fconst_0
// 2b9: goto 2c8
// 2bc: ldc2_w -2384791803513170533
// 2bf: lload 9
// 2c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c6: athrow
// 2c7: fconst_1
// 2c8: lload 13
// 2ca: dup2_x1
// 2cb: pop2
// 2cc: invokevirtual su/catlean/fd.B (JF)V
// 2cf: aload 0
// 2d0: ldc 17.0
// 2d2: ldc 14.0
// 2d4: aload 0
// 2d5: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 2d8: invokevirtual su/catlean/fd.a ()F
// 2db: fmul
// 2dc: fadd
// 2dd: putfield su/catlean/tw.J F
// 2e0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2e3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2e6: invokevirtual su/catlean/jh.i ()Ljava/awt/Color;
// 2e9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2ec: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 2ef: lload 31
// 2f1: dup2_x1
// 2f2: pop2
// 2f3: aload 0
// 2f4: getfield su/catlean/tw.P Lsu/catlean/fd;
// 2f7: invokevirtual su/catlean/fd.a ()F
// 2fa: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 2fd: astore 45
// 2ff: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 302: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 305: invokevirtual su/catlean/jh.h ()Ljava/awt/Color;
// 308: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 30b: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 30e: lload 31
// 310: dup2_x1
// 311: pop2
// 312: aload 0
// 313: getfield su/catlean/tw.P Lsu/catlean/fd;
// 316: invokevirtual su/catlean/fd.a ()F
// 319: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 31c: astore 46
// 31e: getstatic su/catlean/ew.O Lsu/catlean/ew;
// 321: lload 33
// 323: invokevirtual su/catlean/ew.I (J)Lsu/catlean/bl;
// 326: getstatic su/catlean/bl.DEFAULT Lsu/catlean/bl;
// 329: iload 44
// 32b: ifne 3f1
// 32e: if_acmpne 3c0
// 331: goto 33f
// 334: ldc2_w -2384791803513170533
// 337: lload 9
// 339: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33e: athrow
// 33f: aload 1
// 340: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 343: dup
// 344: bipush 88
// 346: ldc2_w 4661179971713736415
// 349: lload 9
// 34b: lxor
// 34c: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 351: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 354: aload 0
// 355: getfield su/catlean/tw.D F
// 358: iload 35
// 35a: i2c
// 35b: swap
// 35c: aload 0
// 35d: getfield su/catlean/tw.p F
// 360: aload 0
// 361: getfield su/catlean/tw.I F
// 364: sipush 17105
// 367: ldc2_w 1568201349573607843
// 36a: lload 9
// 36c: lxor
// 36d: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: i2f
// 373: fsub
// 374: ldc 17.0
// 376: ldc 14.0
// 378: aload 0
// 379: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 37c: invokevirtual su/catlean/fd.a ()F
// 37f: fmul
// 380: fadd
// 381: ldc 4.0
// 383: ldc 2.5
// 385: aload 0
// 386: getfield su/catlean/tw.F Lsu/catlean/fd;
// 389: invokevirtual su/catlean/fd.a ()F
// 38c: fadd
// 38d: fconst_1
// 38e: fconst_1
// 38f: aload 45
// 391: aload 46
// 393: fconst_0
// 394: iload 36
// 396: i2s
// 397: fconst_0
// 398: iload 37
// 39a: fconst_0
// 39b: sipush 205
// 39e: ldc2_w 3838204821351711671
// 3a1: lload 9
// 3a3: lxor
// 3a4: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a9: aconst_null
// 3aa: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 3ad: iload 44
// 3af: ifeq 6ef
// 3b2: goto 3c0
// 3b5: ldc2_w -2384791803513170533
// 3b8: lload 9
// 3ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bf: athrow
// 3c0: getstatic su/catlean/ew.O Lsu/catlean/ew;
// 3c3: iload 6
// 3c5: ifle 588
// 3c8: iload 44
// 3ca: ifne 588
// 3cd: goto 3db
// 3d0: ldc2_w -2384791803513170533
// 3d3: lload 9
// 3d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3da: athrow
// 3db: lload 33
// 3dd: invokevirtual su/catlean/ew.I (J)Lsu/catlean/bl;
// 3e0: getstatic su/catlean/bl.RECT Lsu/catlean/bl;
// 3e3: goto 3f1
// 3e6: ldc2_w -2384791803513170533
// 3e9: lload 9
// 3eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f0: athrow
// 3f1: if_acmpne 571
// 3f4: aload 0
// 3f5: getfield su/catlean/tw.y Lsu/catlean/ry;
// 3f8: invokevirtual su/catlean/ry.E ()Ljava/util/ArrayList;
// 3fb: checkcast java/util/List
// 3fe: astore 47
// 400: bipush 0
// 401: istore 48
// 403: aload 47
// 405: aload 47
// 407: invokeinterface java/util/List.size ()I 1
// 40c: invokeinterface java/util/List.listIterator (I)Ljava/util/ListIterator; 2
// 411: astore 49
// 413: aload 49
// 415: invokeinterface java/util/ListIterator.hasPrevious ()Z 1
// 41a: ifeq 457
// 41d: aload 49
// 41f: invokeinterface java/util/ListIterator.previous ()Ljava/lang/Object; 1
// 424: astore 50
// 426: aload 50
// 428: checkcast su/catlean/tw
// 42b: astore 51
// 42d: bipush 0
// 42e: istore 52
// 430: aload 51
// 432: getfield su/catlean/tw.j Lsu/catlean/_g;
// 435: invokevirtual su/catlean/_g.N ()Lsu/catlean/fu;
// 438: aload 0
// 439: getfield su/catlean/tw.y Lsu/catlean/ry;
// 43c: invokevirtual su/catlean/ry.U ()Lsu/catlean/fl;
// 43f: invokevirtual su/catlean/fl.g ()Lsu/catlean/fu;
// 442: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 445: ifeq 413
// 448: aload 50
// 44a: iload 5
// 44c: ifle 424
// 44f: iload 44
// 451: ifne 428
// 454: goto 46d
// 457: new java/util/NoSuchElementException
// 45a: dup
// 45b: sipush 8162
// 45e: ldc2_w 4681747407438381439
// 461: lload 9
// 463: lxor
// 464: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 469: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
// 46c: athrow
// 46d: checkcast su/catlean/tw
// 470: getfield su/catlean/tw.j Lsu/catlean/_g;
// 473: invokevirtual su/catlean/_g.U ()Ljava/lang/String;
// 476: aload 0
// 477: getfield su/catlean/tw.j Lsu/catlean/_g;
// 47a: invokevirtual su/catlean/_g.U ()Ljava/lang/String;
// 47d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 480: iload 5
// 482: iflt 4e4
// 485: ifeq 4f5
// 488: aload 1
// 489: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 48c: dup
// 48d: sipush 8591
// 490: ldc2_w 6652013552788979470
// 493: lload 9
// 495: lxor
// 496: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 49e: aload 0
// 49f: getfield su/catlean/tw.D F
// 4a2: aload 0
// 4a3: getfield su/catlean/tw.p F
// 4a6: aload 0
// 4a7: getfield su/catlean/tw.I F
// 4aa: sipush 17105
// 4ad: ldc2_w 1568201349573607843
// 4b0: lload 9
// 4b2: lxor
// 4b3: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b8: i2f
// 4b9: fsub
// 4ba: ldc 17.0
// 4bc: ldc 14.0
// 4be: aload 0
// 4bf: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 4c2: invokevirtual su/catlean/fd.a ()F
// 4c5: fmul
// 4c6: fadd
// 4c7: fconst_0
// 4c8: ldc 2.5
// 4ca: aload 0
// 4cb: getfield su/catlean/tw.F Lsu/catlean/fd;
// 4ce: invokevirtual su/catlean/fd.a ()F
// 4d1: fadd
// 4d2: fconst_1
// 4d3: fconst_1
// 4d4: aload 45
// 4d6: aload 46
// 4d8: ldc 4.0
// 4da: lload 15
// 4dc: ldc 4.0
// 4de: fconst_0
// 4df: invokestatic su/catlean/x1.R (Lorg/joml/Matrix3x2fStack;FFFFFFFFLjava/awt/Color;Ljava/awt/Color;FJFF)V
// 4e2: iload 44
// 4e4: ifeq 6ef
// 4e7: goto 4f5
// 4ea: ldc2_w -2384791803513170533
// 4ed: lload 9
// 4ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f4: athrow
// 4f5: aload 1
// 4f6: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4f9: dup
// 4fa: sipush 8591
// 4fd: ldc2_w 6652013552788979470
// 500: lload 9
// 502: lxor
// 503: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 508: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 50b: aload 0
// 50c: getfield su/catlean/tw.D F
// 50f: iload 35
// 511: i2c
// 512: swap
// 513: aload 0
// 514: getfield su/catlean/tw.p F
// 517: aload 0
// 518: getfield su/catlean/tw.I F
// 51b: sipush 17105
// 51e: ldc2_w 1568201349573607843
// 521: lload 9
// 523: lxor
// 524: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 529: i2f
// 52a: fsub
// 52b: ldc 17.0
// 52d: ldc 14.0
// 52f: aload 0
// 530: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 533: invokevirtual su/catlean/fd.a ()F
// 536: fmul
// 537: fadd
// 538: fconst_0
// 539: ldc 2.5
// 53b: aload 0
// 53c: getfield su/catlean/tw.F Lsu/catlean/fd;
// 53f: invokevirtual su/catlean/fd.a ()F
// 542: fadd
// 543: fconst_1
// 544: fconst_1
// 545: aload 45
// 547: aload 46
// 549: fconst_0
// 54a: iload 36
// 54c: i2s
// 54d: fconst_0
// 54e: iload 37
// 550: fconst_0
// 551: sipush 27704
// 554: ldc2_w 5437654895420288845
// 557: lload 9
// 559: lxor
// 55a: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55f: aconst_null
// 560: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 563: goto 6ef
// 566: ldc2_w -2384791803513170533
// 569: lload 9
// 56b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 570: athrow
// 571: aload 0
// 572: iload 44
// 574: ifne 59f
// 577: getfield su/catlean/tw.j Lsu/catlean/_g;
// 57a: goto 588
// 57d: ldc2_w -2384791803513170533
// 580: lload 9
// 582: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 587: athrow
// 588: lload 29
// 58a: invokevirtual su/catlean/_g.f (J)Z
// 58d: ifeq 6ef
// 590: aload 0
// 591: goto 59f
// 594: ldc2_w -2384791803513170533
// 597: lload 9
// 599: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59e: athrow
// 59f: getfield su/catlean/tw.y Lsu/catlean/ry;
// 5a2: invokevirtual su/catlean/ry.E ()Ljava/util/ArrayList;
// 5a5: checkcast java/util/List
// 5a8: astore 47
// 5aa: bipush 0
// 5ab: istore 48
// 5ad: aload 47
// 5af: aload 47
// 5b1: invokeinterface java/util/List.size ()I 1
// 5b6: invokeinterface java/util/List.listIterator (I)Ljava/util/ListIterator; 2
// 5bb: astore 49
// 5bd: aload 49
// 5bf: invokeinterface java/util/ListIterator.hasPrevious ()Z 1
// 5c4: ifeq 601
// 5c7: aload 49
// 5c9: invokeinterface java/util/ListIterator.previous ()Ljava/lang/Object; 1
// 5ce: astore 50
// 5d0: aload 50
// 5d2: checkcast su/catlean/tw
// 5d5: astore 51
// 5d7: bipush 0
// 5d8: istore 52
// 5da: aload 51
// 5dc: getfield su/catlean/tw.j Lsu/catlean/_g;
// 5df: invokevirtual su/catlean/_g.N ()Lsu/catlean/fu;
// 5e2: aload 0
// 5e3: getfield su/catlean/tw.y Lsu/catlean/ry;
// 5e6: invokevirtual su/catlean/ry.U ()Lsu/catlean/fl;
// 5e9: invokevirtual su/catlean/fl.g ()Lsu/catlean/fu;
// 5ec: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5ef: ifeq 5bd
// 5f2: aload 50
// 5f4: iload 6
// 5f6: ifle 5ce
// 5f9: iload 44
// 5fb: ifne 5d2
// 5fe: goto 617
// 601: new java/util/NoSuchElementException
// 604: dup
// 605: sipush 2143
// 608: ldc2_w 1397308967291786951
// 60b: lload 9
// 60d: lxor
// 60e: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 613: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
// 616: athrow
// 617: checkcast su/catlean/tw
// 61a: getfield su/catlean/tw.j Lsu/catlean/_g;
// 61d: invokevirtual su/catlean/_g.U ()Ljava/lang/String;
// 620: aload 0
// 621: getfield su/catlean/tw.j Lsu/catlean/_g;
// 624: invokevirtual su/catlean/_g.U ()Ljava/lang/String;
// 627: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 62a: iload 6
// 62c: iflt 678
// 62f: ifeq 689
// 632: aload 1
// 633: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 636: dup
// 637: sipush 8591
// 63a: ldc2_w 6652013552788979470
// 63d: lload 9
// 63f: lxor
// 640: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 645: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 648: aload 0
// 649: getfield su/catlean/tw.D F
// 64c: ldc 3.0
// 64e: fsub
// 64f: aload 0
// 650: getfield su/catlean/tw.p F
// 653: aload 0
// 654: getfield su/catlean/tw.I F
// 657: ldc 20.0
// 659: ldc 14.0
// 65b: aload 0
// 65c: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 65f: invokevirtual su/catlean/fd.a ()F
// 662: fmul
// 663: fadd
// 664: fconst_0
// 665: fconst_0
// 666: fconst_1
// 667: fconst_1
// 668: aload 45
// 66a: aload 46
// 66c: ldc 7.0
// 66e: lload 15
// 670: ldc 7.0
// 672: fconst_0
// 673: invokestatic su/catlean/x1.R (Lorg/joml/Matrix3x2fStack;FFFFFFFFLjava/awt/Color;Ljava/awt/Color;FJFF)V
// 676: iload 44
// 678: ifeq 6ef
// 67b: goto 689
// 67e: ldc2_w -2384791803513170533
// 681: lload 9
// 683: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 688: athrow
// 689: aload 1
// 68a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 68d: dup
// 68e: sipush 8591
// 691: ldc2_w 6652013552788979470
// 694: lload 9
// 696: lxor
// 697: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 69f: aload 0
// 6a0: getfield su/catlean/tw.D F
// 6a3: ldc 3.0
// 6a5: fsub
// 6a6: iload 35
// 6a8: i2c
// 6a9: swap
// 6aa: aload 0
// 6ab: getfield su/catlean/tw.p F
// 6ae: aload 0
// 6af: getfield su/catlean/tw.I F
// 6b2: ldc 19.0
// 6b4: ldc 14.0
// 6b6: aload 0
// 6b7: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 6ba: invokevirtual su/catlean/fd.a ()F
// 6bd: fmul
// 6be: fadd
// 6bf: fconst_0
// 6c0: fconst_0
// 6c1: fconst_1
// 6c2: fconst_1
// 6c3: aload 45
// 6c5: aload 46
// 6c7: fconst_0
// 6c8: iload 36
// 6ca: i2s
// 6cb: fconst_0
// 6cc: iload 37
// 6ce: fconst_0
// 6cf: sipush 27704
// 6d2: ldc2_w 5437654895420288845
// 6d5: lload 9
// 6d7: lxor
// 6d8: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6dd: aconst_null
// 6de: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 6e1: goto 6ef
// 6e4: ldc2_w -2384791803513170533
// 6e7: lload 9
// 6e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ee: athrow
// 6ef: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6f2: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 6f5: dup
// 6f6: sipush 7717
// 6f9: ldc2_w 95398014700355749
// 6fc: lload 9
// 6fe: lxor
// 6ff: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 704: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 707: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 70a: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 70d: lload 31
// 70f: dup2_x1
// 710: pop2
// 711: fload 7
// 713: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 716: astore 47
// 718: aload 0
// 719: getfield su/catlean/tw.F Lsu/catlean/fd;
// 71c: invokevirtual su/catlean/fd.a ()F
// 71f: fconst_0
// 720: fcmpg
// 721: iload 44
// 723: ifne 738
// 726: ifne 73b
// 729: goto 737
// 72c: ldc2_w -2384791803513170533
// 72f: lload 9
// 731: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 736: athrow
// 737: bipush 1
// 738: goto 73c
// 73b: bipush 0
// 73c: iload 5
// 73e: ifle 75d
// 741: ifne 7c7
// 744: iload 21
// 746: i2s
// 747: iload 22
// 749: iload 23
// 74b: i2c
// 74c: sipush 14758
// 74f: ldc2_w 3705213738189814486
// 752: lload 9
// 754: lxor
// 755: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75a: invokestatic su/catlean/bx.k (SICI)Z
// 75d: iload 44
// 75f: iload 4
// 761: iflt 7af
// 764: ifne 7ad
// 767: goto 775
// 76a: ldc2_w -2384791803513170533
// 76d: lload 9
// 76f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 774: athrow
// 775: ifeq 7c7
// 778: goto 786
// 77b: ldc2_w -2384791803513170533
// 77e: lload 9
// 780: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 785: athrow
// 786: iload 21
// 788: i2s
// 789: iload 22
// 78b: iload 23
// 78d: i2c
// 78e: sipush 28654
// 791: ldc2_w 8210262253954149535
// 794: lload 9
// 796: lxor
// 797: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79c: invokestatic su/catlean/bx.k (SICI)Z
// 79f: goto 7ad
// 7a2: ldc2_w -2384791803513170533
// 7a5: lload 9
// 7a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ac: athrow
// 7ad: iload 44
// 7af: ifne 7c4
// 7b2: ifeq 7c7
// 7b5: goto 7c3
// 7b8: ldc2_w -2384791803513170533
// 7bb: lload 9
// 7bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c2: athrow
// 7c3: bipush 1
// 7c4: goto 7c8
// 7c7: bipush 0
// 7c8: istore 48
// 7ca: invokestatic java/lang/System.currentTimeMillis ()J
// 7cd: aload 0
// 7ce: getfield su/catlean/tw.r J
// 7d1: lsub
// 7d2: iload 5
// 7d4: ifle 820
// 7d7: iload 44
// 7d9: ifne 820
// 7dc: sipush 19434
// 7df: ldc2_w 6223506289400926662
// 7e2: lload 9
// 7e4: lxor
// 7e5: invokedynamic f (IJ)J bsm=su/catlean/tw.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ea: lcmp
// 7eb: iflt 80f
// 7ee: goto 7fc
// 7f1: ldc2_w -2384791803513170533
// 7f4: lload 9
// 7f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7fb: athrow
// 7fc: iload 48
// 7fe: ifeq 846
// 801: goto 80f
// 804: ldc2_w -2384791803513170533
// 807: lload 9
// 809: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 80e: athrow
// 80f: invokestatic java/lang/System.currentTimeMillis ()J
// 812: goto 820
// 815: ldc2_w -2384791803513170533
// 818: lload 9
// 81a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81f: athrow
// 820: l2d
// 821: ldc2_w 15.0
// 824: ddiv
// 825: invokestatic java/lang/Math.sin (D)D
// 828: iload 48
// 82a: ifeq 83d
// 82d: ldc 0.5
// 82f: goto 83e
// 832: ldc2_w -2384791803513170533
// 835: lload 9
// 837: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83c: athrow
// 83d: fconst_1
// 83e: f2d
// 83f: dmul
// 840: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 843: goto 84a
// 846: fconst_0
// 847: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 84a: astore 49
// 84c: lload 17
// 84e: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 851: aload 1
// 852: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 855: dup
// 856: sipush 8591
// 859: ldc2_w 6652013552788979470
// 85c: lload 9
// 85e: lxor
// 85f: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 864: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 867: aload 0
// 868: getfield su/catlean/tw.j Lsu/catlean/_g;
// 86b: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 86e: aload 0
// 86f: getfield su/catlean/tw.D F
// 872: ldc 4.0
// 874: fadd
// 875: aload 49
// 877: checkcast java/lang/Number
// 87a: invokevirtual java/lang/Number.floatValue ()F
// 87d: fadd
// 87e: aload 0
// 87f: getfield su/catlean/tw.I F
// 882: ldc 8.0
// 884: fsub
// 885: fconst_2
// 886: fdiv
// 887: lload 17
// 889: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 88c: aload 0
// 88d: getfield su/catlean/tw.j Lsu/catlean/_g;
// 890: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 893: lload 42
// 895: dup2_x1
// 896: pop2
// 897: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 89a: fconst_2
// 89b: fdiv
// 89c: fsub
// 89d: getstatic su/catlean/ew.O Lsu/catlean/ew;
// 8a0: iload 5
// 8a2: iflt 8e9
// 8a5: iload 44
// 8a7: ifne 8e9
// 8aa: lload 40
// 8ac: invokevirtual su/catlean/ew.z (J)Lsu/catlean/bc;
// 8af: getstatic su/catlean/bc.LEFT Lsu/catlean/bc;
// 8b2: if_acmpne 8d2
// 8b5: goto 8c3
// 8b8: ldc2_w -2384791803513170533
// 8bb: lload 9
// 8bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c2: athrow
// 8c3: fconst_0
// 8c4: goto 90e
// 8c7: ldc2_w -2384791803513170533
// 8ca: lload 9
// 8cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d1: athrow
// 8d2: aload 0
// 8d3: iload 44
// 8d5: ifne 904
// 8d8: getfield su/catlean/tw.j Lsu/catlean/_g;
// 8db: goto 8e9
// 8de: ldc2_w -2384791803513170533
// 8e1: lload 9
// 8e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e8: athrow
// 8e9: lload 38
// 8eb: invokevirtual su/catlean/_g.m (J)Lsu/catlean/lj;
// 8ee: invokevirtual su/catlean/lj.X ()I
// 8f1: bipush -1
// 8f2: if_icmpeq 90d
// 8f5: aload 0
// 8f6: goto 904
// 8f9: ldc2_w -2384791803513170533
// 8fc: lload 9
// 8fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 903: athrow
// 904: getfield su/catlean/tw.E Lsu/catlean/fd;
// 907: invokevirtual su/catlean/fd.a ()F
// 90a: goto 90e
// 90d: fconst_1
// 90e: fmul
// 90f: fadd
// 910: aload 0
// 911: getfield su/catlean/tw.p F
// 914: aload 0
// 915: getfield su/catlean/tw.J F
// 918: fconst_2
// 919: fdiv
// 91a: fadd
// 91b: ldc 7.0
// 91d: fsub
// 91e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 921: aload 47
// 923: fconst_1
// 924: aload 0
// 925: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 928: invokevirtual su/catlean/fd.a ()F
// 92b: fsub
// 92c: iload 24
// 92e: i2c
// 92f: swap
// 930: iload 25
// 932: swap
// 933: iload 26
// 935: i2s
// 936: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 939: lload 19
// 93b: dup2_x1
// 93c: pop2
// 93d: bipush 0
// 93e: bipush 0
// 93f: sipush 3288
// 942: ldc2_w 1659304328626229155
// 945: lload 9
// 947: lxor
// 948: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94d: aconst_null
// 94e: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 951: aload 0
// 952: getfield su/catlean/tw.E Lsu/catlean/fd;
// 955: invokevirtual su/catlean/fd.a ()F
// 958: fconst_1
// 959: fcmpg
// 95a: iload 44
// 95c: ifne a7b
// 95f: ifge a5f
// 962: goto 970
// 965: ldc2_w -2384791803513170533
// 968: lload 9
// 96a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 96f: athrow
// 970: aload 0
// 971: getfield su/catlean/tw.l Z
// 974: iload 44
// 976: ifne a7b
// 979: goto 987
// 97c: ldc2_w -2384791803513170533
// 97f: lload 9
// 981: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 986: athrow
// 987: ifne a5f
// 98a: goto 998
// 98d: ldc2_w -2384791803513170533
// 990: lload 9
// 992: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 997: athrow
// 998: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 99b: aload 0
// 99c: getfield su/catlean/tw.j Lsu/catlean/_g;
// 99f: lload 38
// 9a1: invokevirtual su/catlean/_g.m (J)Lsu/catlean/lj;
// 9a4: invokevirtual su/catlean/lj.X ()I
// 9a7: lload 11
// 9a9: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 9ac: astore 50
// 9ae: aload 0
// 9af: getfield su/catlean/tw.j Lsu/catlean/_g;
// 9b2: lload 38
// 9b4: invokevirtual su/catlean/_g.m (J)Lsu/catlean/lj;
// 9b7: invokevirtual su/catlean/lj.X ()I
// 9ba: iload 44
// 9bc: iload 4
// 9be: iflt 9c5
// 9c1: ifne a7b
// 9c4: bipush -1
// 9c5: if_icmpeq a5f
// 9c8: goto 9d6
// 9cb: ldc2_w -2384791803513170533
// 9ce: lload 9
// 9d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d5: athrow
// 9d6: lload 17
// 9d8: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 9db: aload 1
// 9dc: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 9df: dup
// 9e0: sipush 8591
// 9e3: ldc2_w 6652013552788979470
// 9e6: lload 9
// 9e8: lxor
// 9e9: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9f1: aload 50
// 9f3: aload 0
// 9f4: getfield su/catlean/tw.D F
// 9f7: aload 0
// 9f8: getfield su/catlean/tw.I F
// 9fb: fadd
// 9fc: ldc 10.0
// 9fe: fsub
// 9ff: lload 17
// a01: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// a04: lload 42
// a06: aload 50
// a08: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// a0b: fsub
// a0c: aload 0
// a0d: getfield su/catlean/tw.p F
// a10: aload 0
// a11: getfield su/catlean/tw.J F
// a14: fconst_2
// a15: fdiv
// a16: fadd
// a17: ldc 7.0
// a19: fsub
// a1a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// a1d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// a20: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// a23: fconst_1
// a24: aload 0
// a25: getfield su/catlean/tw.E Lsu/catlean/fd;
// a28: invokevirtual su/catlean/fd.a ()F
// a2b: fsub
// a2c: iload 24
// a2e: i2c
// a2f: swap
// a30: iload 25
// a32: swap
// a33: iload 26
// a35: i2s
// a36: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// a39: lload 19
// a3b: dup2_x1
// a3c: pop2
// a3d: bipush 0
// a3e: bipush 0
// a3f: sipush 23281
// a42: ldc2_w 436685769220102536
// a45: lload 9
// a47: lxor
// a48: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4d: aconst_null
// a4e: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// a51: goto a5f
// a54: ldc2_w -2384791803513170533
// a57: lload 9
// a59: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5e: athrow
// a5f: aload 0
// a60: iload 44
// a62: ifne a7f
// a65: getfield su/catlean/tw.Z Lsu/catlean/fd;
// a68: invokevirtual su/catlean/fd.a ()F
// a6b: fconst_0
// a6c: fcmpl
// a6d: goto a7b
// a70: ldc2_w -2384791803513170533
// a73: lload 9
// a75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7a: athrow
// a7b: ifle a8b
// a7e: aload 0
// a7f: aload 1
// a80: iload 2
// a81: iload 3
// a82: aload 47
// a84: lload 27
// a86: aload 46
// a88: invokespecial su/catlean/tw.p (Lnet/minecraft/class_332;IILjava/awt/Color;JLjava/awt/Color;)V
// a8b: ldc2_w -2395118864949002157
// a8e: lload 9
// a90: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a95: ifnull ac5
// a98: iload 44
// a9a: ifeq aba
// a9d: goto aab
// aa0: ldc2_w -2384791803513170533
// aa3: lload 9
// aa5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aaa: athrow
// aab: bipush 0
// aac: goto abb
// aaf: ldc2_w -2384791803513170533
// ab2: lload 9
// ab4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab9: athrow
// aba: bipush 1
// abb: ldc2_w -2447719394072732165
// abe: lload 9
// ac0: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac5: return
}

private final void p(class_332 param1, int param2, int param3, Color param4, long param5, Color param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tw.b J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 3894961120497
// 00e: lxor
// 00f: lstore 8
// 011: dup2
// 012: ldc2_w 118960982943361
// 015: lxor
// 016: lstore 10
// 018: dup2
// 019: ldc2_w 26819030862342
// 01c: lxor
// 01d: dup2
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 12
// 024: dup2
// 025: bipush 16
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 13
// 02e: dup2
// 02f: bipush 32
// 031: lshl
// 032: bipush 32
// 034: lushr
// 035: l2i
// 036: istore 14
// 038: pop2
// 039: dup2
// 03a: ldc2_w 51348060502481
// 03d: lxor
// 03e: lstore 15
// 040: dup2
// 041: ldc2_w 134045504464585
// 044: lxor
// 045: lstore 17
// 047: dup2
// 048: ldc2_w 78200506396096
// 04b: lxor
// 04c: lstore 19
// 04e: dup2
// 04f: ldc2_w 107891284456017
// 052: lxor
// 053: lstore 21
// 055: dup2
// 056: ldc2_w 16335223536075
// 059: lxor
// 05a: lstore 23
// 05c: dup2
// 05d: ldc2_w 69015779614609
// 060: lxor
// 061: lstore 25
// 063: dup2
// 064: ldc2_w 68210894408095
// 067: lxor
// 068: dup2
// 069: bipush 48
// 06b: lushr
// 06c: l2i
// 06d: istore 27
// 06f: dup2
// 070: bipush 16
// 072: lshl
// 073: bipush 32
// 075: lushr
// 076: l2i
// 077: istore 28
// 079: dup2
// 07a: bipush 48
// 07c: lshl
// 07d: bipush 48
// 07f: lushr
// 080: l2i
// 081: istore 29
// 083: pop2
// 084: pop2
// 085: ldc2_w 7698605693382303552
// 088: lload 5
// 08a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: istore 30
// 091: aload 0
// 092: getfield su/catlean/tw.w Lsu/catlean/fd;
// 095: aload 0
// 096: getfield su/catlean/tw.D F
// 099: ldc 58.0
// 09b: fadd
// 09c: fstore 31
// 09e: aload 0
// 09f: getfield su/catlean/tw.D F
// 0a2: ldc 58.0
// 0a4: fadd
// 0a5: aload 0
// 0a6: getfield su/catlean/tw.I F
// 0a9: fconst_2
// 0aa: fdiv
// 0ab: fadd
// 0ac: sipush 17105
// 0af: ldc2_w 1568132430483895765
// 0b2: lload 5
// 0b4: lxor
// 0b5: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: i2f
// 0bb: fsub
// 0bc: fstore 32
// 0be: iload 2
// 0bf: i2f
// 0c0: fstore 33
// 0c2: fload 31
// 0c4: fload 33
// 0c6: fcmpg
// 0c7: iload 30
// 0c9: ifeq 0f0
// 0cc: ifgt 119
// 0cf: goto 0dd
// 0d2: ldc2_w 7679194335724249581
// 0d5: lload 5
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: fload 33
// 0df: fload 32
// 0e1: fcmpg
// 0e2: goto 0f0
// 0e5: ldc2_w 7679194335724249581
// 0e8: lload 5
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: iload 30
// 0f2: ifeq 116
// 0f5: ifgt 115
// 0f8: goto 106
// 0fb: ldc2_w 7679194335724249581
// 0fe: lload 5
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 1
// 107: goto 11a
// 10a: ldc2_w 7679194335724249581
// 10d: lload 5
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: bipush 0
// 116: goto 11a
// 119: bipush 0
// 11a: ifeq 1a4
// 11d: aload 0
// 11e: getfield su/catlean/tw.p F
// 121: ldc 15.0
// 123: fadd
// 124: fstore 31
// 126: aload 0
// 127: getfield su/catlean/tw.p F
// 12a: ldc 27.0
// 12c: fadd
// 12d: fstore 32
// 12f: iload 3
// 130: i2f
// 131: fstore 33
// 133: fload 31
// 135: fload 33
// 137: fcmpg
// 138: iload 30
// 13a: lload 5
// 13c: lconst_0
// 13d: lcmp
// 13e: ifle 16a
// 141: ifeq 168
// 144: ifgt 191
// 147: goto 155
// 14a: ldc2_w 7679194335724249581
// 14d: lload 5
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: fload 33
// 157: fload 32
// 159: fcmpg
// 15a: goto 168
// 15d: ldc2_w 7679194335724249581
// 160: lload 5
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: iload 30
// 16a: ifeq 18e
// 16d: ifgt 18d
// 170: goto 17e
// 173: ldc2_w 7679194335724249581
// 176: lload 5
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: bipush 1
// 17f: goto 192
// 182: ldc2_w 7679194335724249581
// 185: lload 5
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: bipush 0
// 18e: goto 192
// 191: bipush 0
// 192: ifeq 1a4
// 195: fconst_1
// 196: goto 1a5
// 199: ldc2_w 7679194335724249581
// 19c: lload 5
// 19e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: athrow
// 1a4: fconst_0
// 1a5: lload 15
// 1a7: dup2_x1
// 1a8: pop2
// 1a9: invokevirtual su/catlean/fd.B (JF)V
// 1ac: aload 0
// 1ad: getfield su/catlean/tw.v Lsu/catlean/fd;
// 1b0: aload 0
// 1b1: getfield su/catlean/tw.D F
// 1b4: fconst_2
// 1b5: fadd
// 1b6: fstore 31
// 1b8: aload 0
// 1b9: getfield su/catlean/tw.D F
// 1bc: fconst_2
// 1bd: fadd
// 1be: aload 0
// 1bf: getfield su/catlean/tw.I F
// 1c2: fconst_2
// 1c3: fdiv
// 1c4: fadd
// 1c5: sipush 17105
// 1c8: ldc2_w 1568132430483895765
// 1cb: lload 5
// 1cd: lxor
// 1ce: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: i2f
// 1d4: fsub
// 1d5: fstore 32
// 1d7: iload 2
// 1d8: i2f
// 1d9: fstore 33
// 1db: fload 31
// 1dd: fload 33
// 1df: fcmpg
// 1e0: iload 30
// 1e2: lload 5
// 1e4: lconst_0
// 1e5: lcmp
// 1e6: ifle 212
// 1e9: ifeq 210
// 1ec: ifgt 239
// 1ef: goto 1fd
// 1f2: ldc2_w 7679194335724249581
// 1f5: lload 5
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: fload 33
// 1ff: fload 32
// 201: fcmpg
// 202: goto 210
// 205: ldc2_w 7679194335724249581
// 208: lload 5
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: iload 30
// 212: ifeq 236
// 215: ifgt 235
// 218: goto 226
// 21b: ldc2_w 7679194335724249581
// 21e: lload 5
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: bipush 1
// 227: goto 23a
// 22a: ldc2_w 7679194335724249581
// 22d: lload 5
// 22f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 234: athrow
// 235: bipush 0
// 236: goto 23a
// 239: bipush 0
// 23a: ifeq 2c4
// 23d: aload 0
// 23e: getfield su/catlean/tw.p F
// 241: ldc 15.0
// 243: fadd
// 244: fstore 31
// 246: aload 0
// 247: getfield su/catlean/tw.p F
// 24a: ldc 27.0
// 24c: fadd
// 24d: fstore 32
// 24f: iload 3
// 250: i2f
// 251: fstore 33
// 253: fload 31
// 255: fload 33
// 257: fcmpg
// 258: iload 30
// 25a: lload 5
// 25c: lconst_0
// 25d: lcmp
// 25e: ifle 28a
// 261: ifeq 288
// 264: ifgt 2b1
// 267: goto 275
// 26a: ldc2_w 7679194335724249581
// 26d: lload 5
// 26f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 274: athrow
// 275: fload 33
// 277: fload 32
// 279: fcmpg
// 27a: goto 288
// 27d: ldc2_w 7679194335724249581
// 280: lload 5
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: iload 30
// 28a: ifeq 2ae
// 28d: ifgt 2ad
// 290: goto 29e
// 293: ldc2_w 7679194335724249581
// 296: lload 5
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: bipush 1
// 29f: goto 2b2
// 2a2: ldc2_w 7679194335724249581
// 2a5: lload 5
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: bipush 0
// 2ae: goto 2b2
// 2b1: bipush 0
// 2b2: ifeq 2c4
// 2b5: fconst_1
// 2b6: goto 2c5
// 2b9: ldc2_w 7679194335724249581
// 2bc: lload 5
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: fconst_0
// 2c5: lload 5
// 2c7: lconst_0
// 2c8: lcmp
// 2c9: iflt 2df
// 2cc: lload 15
// 2ce: dup2_x1
// 2cf: pop2
// 2d0: invokevirtual su/catlean/fd.B (JF)V
// 2d3: aload 0
// 2d4: getfield su/catlean/tw.m Lsu/catlean/fd;
// 2d7: aload 0
// 2d8: getfield su/catlean/tw.a Z
// 2db: ifeq 2ed
// 2de: fconst_1
// 2df: goto 2ee
// 2e2: ldc2_w 7679194335724249581
// 2e5: lload 5
// 2e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ec: athrow
// 2ed: fconst_0
// 2ee: lload 15
// 2f0: dup2_x1
// 2f1: pop2
// 2f2: invokevirtual su/catlean/fd.B (JF)V
// 2f5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2f8: lload 23
// 2fa: aload 1
// 2fb: new su/catlean/o7
// 2fe: dup
// 2ff: aload 0
// 300: getfield su/catlean/tw.D F
// 303: aload 0
// 304: getfield su/catlean/tw.p F
// 307: aload 0
// 308: getfield su/catlean/tw.D F
// 30b: aload 0
// 30c: getfield su/catlean/tw.I F
// 30f: fadd
// 310: aload 0
// 311: getfield su/catlean/tw.p F
// 314: aload 0
// 315: getfield su/catlean/tw.J F
// 318: fadd
// 319: invokespecial su/catlean/o7.<init> (FFFF)V
// 31c: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 31f: lload 19
// 321: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 324: aload 1
// 325: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 328: dup
// 329: sipush 8591
// 32c: ldc2_w 6652043044085205880
// 32f: lload 5
// 331: lxor
// 332: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 337: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 33a: sipush 6724
// 33d: ldc2_w 798561202424459452
// 340: lload 5
// 342: lxor
// 343: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 348: bipush 3
// 349: bipush 4
// 34a: i2d
// 34b: invokestatic java/lang/System.currentTimeMillis ()J
// 34e: sipush 5062
// 351: ldc2_w 9071068163530351822
// 354: lload 5
// 356: lxor
// 357: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35c: i2l
// 35d: lrem
// 35e: l2d
// 35f: ldc2_w 700.0
// 362: ddiv
// 363: dmul
// 364: d2i
// 365: isub
// 366: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 369: aload 0
// 36a: getfield su/catlean/tw.D F
// 36d: ldc 3.0
// 36f: fadd
// 370: sipush 13179
// 373: ldc2_w 5768940475387921521
// 376: lload 5
// 378: lxor
// 379: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37e: i2f
// 37f: fconst_1
// 380: aload 0
// 381: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 384: invokevirtual su/catlean/fd.a ()F
// 387: fsub
// 388: fmul
// 389: fadd
// 38a: aload 0
// 38b: getfield su/catlean/tw.p F
// 38e: fconst_2
// 38f: fadd
// 390: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 393: aload 4
// 395: aload 0
// 396: getfield su/catlean/tw.Z Lsu/catlean/fd;
// 399: invokevirtual su/catlean/fd.a ()F
// 39c: ldc 0.1
// 39e: fsub
// 39f: iload 27
// 3a1: i2c
// 3a2: swap
// 3a3: iload 28
// 3a5: swap
// 3a6: iload 29
// 3a8: i2s
// 3a9: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3ac: lload 21
// 3ae: dup2_x1
// 3af: pop2
// 3b0: bipush 0
// 3b1: bipush 0
// 3b2: sipush 23281
// 3b5: ldc2_w 436591423916715518
// 3b8: lload 5
// 3ba: lxor
// 3bb: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c0: aconst_null
// 3c1: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 3c4: aload 1
// 3c5: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3c8: dup
// 3c9: sipush 8591
// 3cc: ldc2_w 6652043044085205880
// 3cf: lload 5
// 3d1: lxor
// 3d2: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3da: aload 0
// 3db: getfield su/catlean/tw.D F
// 3de: fconst_2
// 3df: fadd
// 3e0: iload 12
// 3e2: i2c
// 3e3: swap
// 3e4: aload 0
// 3e5: getfield su/catlean/tw.p F
// 3e8: ldc 17.0
// 3ea: fadd
// 3eb: aload 0
// 3ec: getfield su/catlean/tw.I F
// 3ef: fconst_2
// 3f0: fdiv
// 3f1: sipush 17105
// 3f4: ldc2_w 1568132430483895765
// 3f7: lload 5
// 3f9: lxor
// 3fa: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ff: i2f
// 400: fsub
// 401: ldc 12.0
// 403: ldc 3.0
// 405: ldc 2.5
// 407: aload 0
// 408: getfield su/catlean/tw.v Lsu/catlean/fd;
// 40b: invokevirtual su/catlean/fd.a ()F
// 40e: fconst_2
// 40f: fdiv
// 410: fadd
// 411: fconst_1
// 412: aload 0
// 413: getfield su/catlean/tw.m Lsu/catlean/fd;
// 416: invokevirtual su/catlean/fd.a ()F
// 419: fsub
// 41a: fconst_1
// 41b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 41e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 421: invokevirtual su/catlean/jh.i ()Ljava/awt/Color;
// 424: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 427: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 42a: lload 8
// 42c: dup2_x1
// 42d: pop2
// 42e: fconst_1
// 42f: aload 0
// 430: getfield su/catlean/tw.m Lsu/catlean/fd;
// 433: invokevirtual su/catlean/fd.a ()F
// 436: fsub
// 437: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 43a: aload 7
// 43c: fconst_0
// 43d: iload 13
// 43f: i2s
// 440: fconst_0
// 441: iload 14
// 443: fconst_0
// 444: sipush 27704
// 447: ldc2_w 5437551895632419643
// 44a: lload 5
// 44c: lxor
// 44d: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 452: aconst_null
// 453: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 456: lload 10
// 458: invokestatic su/catlean/b8.M (J)Lsu/catlean/c6;
// 45b: aload 1
// 45c: sipush 16691
// 45f: ldc2_w 8383306845521341389
// 462: lload 5
// 464: lxor
// 465: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46a: aload 0
// 46b: getfield su/catlean/tw.D F
// 46e: ldc 15.0
// 470: fadd
// 471: lload 17
// 473: dup2_x1
// 474: pop2
// 475: aload 0
// 476: getfield su/catlean/tw.p F
// 479: ldc 17.0
// 47b: fadd
// 47c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 47f: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 482: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 485: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 488: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 48b: lload 8
// 48d: dup2_x1
// 48e: pop2
// 48f: aload 0
// 490: getfield su/catlean/tw.v Lsu/catlean/fd;
// 493: invokevirtual su/catlean/fd.a ()F
// 496: fconst_1
// 497: aload 0
// 498: getfield su/catlean/tw.m Lsu/catlean/fd;
// 49b: invokevirtual su/catlean/fd.a ()F
// 49e: fsub
// 49f: fconst_2
// 4a0: fdiv
// 4a1: fadd
// 4a2: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 4a5: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 4a8: aload 1
// 4a9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4ac: dup
// 4ad: sipush 8591
// 4b0: ldc2_w 6652043044085205880
// 4b3: lload 5
// 4b5: lxor
// 4b6: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4be: aload 0
// 4bf: getfield su/catlean/tw.D F
// 4c2: ldc 58.0
// 4c4: fadd
// 4c5: iload 12
// 4c7: i2c
// 4c8: swap
// 4c9: aload 0
// 4ca: getfield su/catlean/tw.p F
// 4cd: ldc 17.0
// 4cf: fadd
// 4d0: aload 0
// 4d1: getfield su/catlean/tw.I F
// 4d4: fconst_2
// 4d5: fdiv
// 4d6: sipush 17105
// 4d9: ldc2_w 1568132430483895765
// 4dc: lload 5
// 4de: lxor
// 4df: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e4: i2f
// 4e5: fsub
// 4e6: ldc 12.0
// 4e8: ldc 3.0
// 4ea: ldc 2.5
// 4ec: aload 0
// 4ed: getfield su/catlean/tw.w Lsu/catlean/fd;
// 4f0: invokevirtual su/catlean/fd.a ()F
// 4f3: fconst_2
// 4f4: fdiv
// 4f5: fadd
// 4f6: aload 0
// 4f7: getfield su/catlean/tw.m Lsu/catlean/fd;
// 4fa: invokevirtual su/catlean/fd.a ()F
// 4fd: fconst_1
// 4fe: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 501: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 504: invokevirtual su/catlean/jh.i ()Ljava/awt/Color;
// 507: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 50a: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 50d: lload 8
// 50f: dup2_x1
// 510: pop2
// 511: aload 0
// 512: getfield su/catlean/tw.m Lsu/catlean/fd;
// 515: invokevirtual su/catlean/fd.a ()F
// 518: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 51b: aload 7
// 51d: fconst_0
// 51e: iload 13
// 520: i2s
// 521: fconst_0
// 522: iload 14
// 524: fconst_0
// 525: sipush 27704
// 528: ldc2_w 5437551895632419643
// 52b: lload 5
// 52d: lxor
// 52e: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 533: aconst_null
// 534: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 537: lload 10
// 539: invokestatic su/catlean/b8.M (J)Lsu/catlean/c6;
// 53c: aload 1
// 53d: sipush 32274
// 540: ldc2_w 7714325282927531258
// 543: lload 5
// 545: lxor
// 546: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54b: aload 0
// 54c: getfield su/catlean/tw.D F
// 54f: ldc 76.0
// 551: fadd
// 552: lload 17
// 554: dup2_x1
// 555: pop2
// 556: aload 0
// 557: getfield su/catlean/tw.p F
// 55a: ldc 17.0
// 55c: fadd
// 55d: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 560: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 563: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 566: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 569: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 56c: lload 8
// 56e: dup2_x1
// 56f: pop2
// 570: aload 0
// 571: getfield su/catlean/tw.w Lsu/catlean/fd;
// 574: invokevirtual su/catlean/fd.a ()F
// 577: aload 0
// 578: getfield su/catlean/tw.m Lsu/catlean/fd;
// 57b: invokevirtual su/catlean/fd.a ()F
// 57e: fconst_2
// 57f: fdiv
// 580: fadd
// 581: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 584: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 587: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 58a: lload 25
// 58c: aload 1
// 58d: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 590: return
}

public final void D(short a, int a, double mouseX, int a, double mouseY, int button) {
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
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 5
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/tw.b J
// 01b: lxor
// 01c: lstore 9
// 01e: lload 9
// 020: dup2
// 021: ldc2_w 79084543433315
// 024: lxor
// 025: lstore 11
// 027: dup2
// 028: ldc2_w 56722196773611
// 02b: lxor
// 02c: lstore 13
// 02e: dup2
// 02f: ldc2_w 42881057206652
// 032: lxor
// 033: lstore 15
// 035: dup2
// 036: ldc2_w 22714845446275
// 039: lxor
// 03a: dup2
// 03b: bipush 48
// 03d: lushr
// 03e: l2i
// 03f: istore 17
// 041: dup2
// 042: bipush 16
// 044: lshl
// 045: bipush 32
// 047: lushr
// 048: l2i
// 049: istore 18
// 04b: dup2
// 04c: bipush 48
// 04e: lshl
// 04f: bipush 48
// 051: lushr
// 052: l2i
// 053: istore 19
// 055: pop2
// 056: dup2
// 057: ldc2_w 8924772868990
// 05a: lxor
// 05b: lstore 20
// 05d: dup2
// 05e: ldc2_w 129379717116996
// 061: lxor
// 062: lstore 22
// 064: dup2
// 065: ldc2_w 76299245094353
// 068: lxor
// 069: lstore 24
// 06b: pop2
// 06c: ldc2_w 4757390994654432769
// 06f: lload 9
// 071: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: istore 26
// 078: aload 0
// 079: iload 26
// 07b: ifne 336
// 07e: getfield su/catlean/tw.l Z
// 081: ifeq 335
// 084: goto 092
// 087: ldc2_w 4797701336252418536
// 08a: lload 9
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: aload 0
// 093: getfield su/catlean/tw.D F
// 096: ldc 58.0
// 098: fadd
// 099: fstore 27
// 09b: aload 0
// 09c: getfield su/catlean/tw.D F
// 09f: ldc 58.0
// 0a1: fadd
// 0a2: aload 0
// 0a3: getfield su/catlean/tw.I F
// 0a6: fconst_2
// 0a7: fdiv
// 0a8: fadd
// 0a9: sipush 27398
// 0ac: ldc2_w 6211306233109591053
// 0af: lload 9
// 0b1: lxor
// 0b2: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: i2f
// 0b8: fsub
// 0b9: fstore 28
// 0bb: dload 3
// 0bc: d2f
// 0bd: fstore 29
// 0bf: fload 27
// 0c1: fload 29
// 0c3: fcmpg
// 0c4: iload 26
// 0c6: iload 5
// 0c8: iflt 0f4
// 0cb: ifne 0f2
// 0ce: ifgt 11b
// 0d1: goto 0df
// 0d4: ldc2_w 4797701336252418536
// 0d7: lload 9
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: fload 29
// 0e1: fload 28
// 0e3: fcmpg
// 0e4: goto 0f2
// 0e7: ldc2_w 4797701336252418536
// 0ea: lload 9
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: iload 26
// 0f4: ifne 118
// 0f7: ifgt 117
// 0fa: goto 108
// 0fd: ldc2_w 4797701336252418536
// 100: lload 9
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: bipush 1
// 109: goto 11c
// 10c: ldc2_w 4797701336252418536
// 10f: lload 9
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: bipush 0
// 118: goto 11c
// 11b: bipush 0
// 11c: ifeq 1db
// 11f: aload 0
// 120: getfield su/catlean/tw.p F
// 123: ldc 15.0
// 125: fadd
// 126: fstore 27
// 128: aload 0
// 129: getfield su/catlean/tw.p F
// 12c: ldc 27.0
// 12e: fadd
// 12f: fstore 28
// 131: dload 6
// 133: d2f
// 134: fstore 29
// 136: fload 27
// 138: fload 29
// 13a: fcmpg
// 13b: iload 26
// 13d: iload 2
// 13e: iflt 16a
// 141: ifne 168
// 144: ifgt 191
// 147: goto 155
// 14a: ldc2_w 4797701336252418536
// 14d: lload 9
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: fload 29
// 157: fload 28
// 159: fcmpg
// 15a: goto 168
// 15d: ldc2_w 4797701336252418536
// 160: lload 9
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: iload 26
// 16a: ifne 18e
// 16d: ifgt 18d
// 170: goto 17e
// 173: ldc2_w 4797701336252418536
// 176: lload 9
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: bipush 1
// 17f: goto 192
// 182: ldc2_w 4797701336252418536
// 185: lload 9
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: bipush 0
// 18e: goto 192
// 191: bipush 0
// 192: iload 2
// 193: ifle 19b
// 196: ifeq 1db
// 199: iload 8
// 19b: iload 26
// 19d: iload 2
// 19e: iflt 20d
// 1a1: ifne 20b
// 1a4: goto 1b2
// 1a7: ldc2_w 4797701336252418536
// 1aa: lload 9
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: ifne 1db
// 1b5: goto 1c3
// 1b8: ldc2_w 4797701336252418536
// 1bb: lload 9
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: aload 0
// 1c4: bipush 1
// 1c5: putfield su/catlean/tw.a Z
// 1c8: iload 26
// 1ca: ifeq 335
// 1cd: goto 1db
// 1d0: ldc2_w 4797701336252418536
// 1d3: lload 9
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: aload 0
// 1dc: getfield su/catlean/tw.D F
// 1df: fconst_2
// 1e0: fadd
// 1e1: fstore 27
// 1e3: aload 0
// 1e4: getfield su/catlean/tw.D F
// 1e7: fconst_2
// 1e8: fadd
// 1e9: aload 0
// 1ea: getfield su/catlean/tw.I F
// 1ed: fconst_2
// 1ee: fdiv
// 1ef: fadd
// 1f0: sipush 17105
// 1f3: ldc2_w 1568098602192215504
// 1f6: lload 9
// 1f8: lxor
// 1f9: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: i2f
// 1ff: fsub
// 200: fstore 28
// 202: dload 3
// 203: d2f
// 204: fstore 29
// 206: fload 27
// 208: fload 29
// 20a: fcmpg
// 20b: iload 26
// 20d: iload 2
// 20e: ifle 23a
// 211: ifne 238
// 214: ifgt 261
// 217: goto 225
// 21a: ldc2_w 4797701336252418536
// 21d: lload 9
// 21f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 224: athrow
// 225: fload 29
// 227: fload 28
// 229: fcmpg
// 22a: goto 238
// 22d: ldc2_w 4797701336252418536
// 230: lload 9
// 232: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: athrow
// 238: iload 26
// 23a: ifne 25e
// 23d: ifgt 25d
// 240: goto 24e
// 243: ldc2_w 4797701336252418536
// 246: lload 9
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: bipush 1
// 24f: goto 262
// 252: ldc2_w 4797701336252418536
// 255: lload 9
// 257: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25c: athrow
// 25d: bipush 0
// 25e: goto 262
// 261: bipush 0
// 262: ifeq 30b
// 265: aload 0
// 266: getfield su/catlean/tw.p F
// 269: ldc 15.0
// 26b: fadd
// 26c: fstore 27
// 26e: aload 0
// 26f: getfield su/catlean/tw.p F
// 272: ldc 27.0
// 274: fadd
// 275: fstore 28
// 277: dload 6
// 279: d2f
// 27a: fstore 29
// 27c: fload 27
// 27e: fload 29
// 280: fcmpg
// 281: iload 26
// 283: iload 1
// 284: iflt 2b0
// 287: ifne 2ae
// 28a: ifgt 2d7
// 28d: goto 29b
// 290: ldc2_w 4797701336252418536
// 293: lload 9
// 295: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29a: athrow
// 29b: fload 29
// 29d: fload 28
// 29f: fcmpg
// 2a0: goto 2ae
// 2a3: ldc2_w 4797701336252418536
// 2a6: lload 9
// 2a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ad: athrow
// 2ae: iload 26
// 2b0: ifne 2d4
// 2b3: ifgt 2d3
// 2b6: goto 2c4
// 2b9: ldc2_w 4797701336252418536
// 2bc: lload 9
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: bipush 1
// 2c5: goto 2d8
// 2c8: ldc2_w 4797701336252418536
// 2cb: lload 9
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: bipush 0
// 2d4: goto 2d8
// 2d7: bipush 0
// 2d8: iload 5
// 2da: iflt 2e2
// 2dd: ifeq 30b
// 2e0: iload 8
// 2e2: ifne 30b
// 2e5: goto 2f3
// 2e8: ldc2_w 4797701336252418536
// 2eb: lload 9
// 2ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f2: athrow
// 2f3: aload 0
// 2f4: bipush 0
// 2f5: putfield su/catlean/tw.a Z
// 2f8: iload 26
// 2fa: ifeq 335
// 2fd: goto 30b
// 300: ldc2_w 4797701336252418536
// 303: lload 9
// 305: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30a: athrow
// 30b: aload 0
// 30c: getfield su/catlean/tw.j Lsu/catlean/_g;
// 30f: new su/catlean/lj
// 312: dup
// 313: iload 8
// 315: aload 0
// 316: getfield su/catlean/tw.a Z
// 319: bipush 1
// 31a: invokespecial su/catlean/lj.<init> (IZZ)V
// 31d: lload 11
// 31f: invokevirtual su/catlean/_g.N (Lsu/catlean/lj;J)V
// 322: aload 0
// 323: bipush 0
// 324: putfield su/catlean/tw.l Z
// 327: goto 335
// 32a: ldc2_w 4797701336252418536
// 32d: lload 9
// 32f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 334: athrow
// 335: aload 0
// 336: getfield su/catlean/tw.D F
// 339: fstore 27
// 33b: dload 3
// 33c: aload 0
// 33d: getfield su/catlean/tw.D F
// 340: aload 0
// 341: getfield su/catlean/tw.I F
// 344: fadd
// 345: sipush 17105
// 348: ldc2_w 1568098602192215504
// 34b: lload 9
// 34d: lxor
// 34e: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 353: i2f
// 354: fsub
// 355: f2d
// 356: dcmpg
// 357: iload 26
// 359: iload 2
// 35a: ifle 386
// 35d: ifne 384
// 360: ifgt 3ad
// 363: goto 371
// 366: ldc2_w 4797701336252418536
// 369: lload 9
// 36b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: athrow
// 371: fload 27
// 373: f2d
// 374: dload 3
// 375: dcmpg
// 376: goto 384
// 379: ldc2_w 4797701336252418536
// 37c: lload 9
// 37e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 383: athrow
// 384: iload 26
// 386: ifne 3aa
// 389: ifgt 3a9
// 38c: goto 39a
// 38f: ldc2_w 4797701336252418536
// 392: lload 9
// 394: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 399: athrow
// 39a: bipush 1
// 39b: goto 3ae
// 39e: ldc2_w 4797701336252418536
// 3a1: lload 9
// 3a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: athrow
// 3a9: bipush 0
// 3aa: goto 3ae
// 3ad: bipush 0
// 3ae: ifeq 666
// 3b1: aload 0
// 3b2: getfield su/catlean/tw.p F
// 3b5: fstore 27
// 3b7: dload 6
// 3b9: aload 0
// 3ba: getfield su/catlean/tw.p F
// 3bd: aload 0
// 3be: getfield su/catlean/tw.J F
// 3c1: fadd
// 3c2: f2d
// 3c3: dcmpg
// 3c4: iload 26
// 3c6: iload 1
// 3c7: iflt 3f4
// 3ca: ifne 3f2
// 3cd: ifgt 41b
// 3d0: goto 3de
// 3d3: ldc2_w 4797701336252418536
// 3d6: lload 9
// 3d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3dd: athrow
// 3de: fload 27
// 3e0: f2d
// 3e1: dload 6
// 3e3: dcmpg
// 3e4: goto 3f2
// 3e7: ldc2_w 4797701336252418536
// 3ea: lload 9
// 3ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f1: athrow
// 3f2: iload 26
// 3f4: ifne 418
// 3f7: ifgt 417
// 3fa: goto 408
// 3fd: ldc2_w 4797701336252418536
// 400: lload 9
// 402: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 407: athrow
// 408: bipush 1
// 409: goto 41c
// 40c: ldc2_w 4797701336252418536
// 40f: lload 9
// 411: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 416: athrow
// 417: bipush 0
// 418: goto 41c
// 41b: bipush 0
// 41c: iload 1
// 41d: iflt 427
// 420: ifeq 666
// 423: aload 0
// 424: getfield su/catlean/tw.l Z
// 427: iload 26
// 429: iload 1
// 42a: iflt 478
// 42d: ifne 476
// 430: goto 43e
// 433: ldc2_w 4797701336252418536
// 436: lload 9
// 438: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43d: athrow
// 43e: ifne 666
// 441: goto 44f
// 444: ldc2_w 4797701336252418536
// 447: lload 9
// 449: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44e: athrow
// 44f: iload 17
// 451: i2s
// 452: iload 18
// 454: iload 19
// 456: i2c
// 457: sipush 25134
// 45a: ldc2_w 6617830687594822953
// 45d: lload 9
// 45f: lxor
// 460: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 465: invokestatic su/catlean/bx.k (SICI)Z
// 468: goto 476
// 46b: ldc2_w 4797701336252418536
// 46e: lload 9
// 470: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 475: athrow
// 476: iload 26
// 478: ifne 55c
// 47b: ifeq 543
// 47e: goto 48c
// 481: ldc2_w 4797701336252418536
// 484: lload 9
// 486: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48b: athrow
// 48c: iload 17
// 48e: i2s
// 48f: iload 18
// 491: iload 19
// 493: i2c
// 494: sipush 7207
// 497: ldc2_w 3471303614774985515
// 49a: lload 9
// 49c: lxor
// 49d: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a2: invokestatic su/catlean/bx.k (SICI)Z
// 4a5: iload 26
// 4a7: iload 5
// 4a9: iflt 563
// 4ac: ifne 55c
// 4af: goto 4bd
// 4b2: ldc2_w 4797701336252418536
// 4b5: lload 9
// 4b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bc: athrow
// 4bd: iload 5
// 4bf: ifle 546
// 4c2: ifeq 543
// 4c5: goto 4d3
// 4c8: ldc2_w 4797701336252418536
// 4cb: lload 9
// 4cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d2: athrow
// 4d3: aload 0
// 4d4: getfield su/catlean/tw.j Lsu/catlean/_g;
// 4d7: iload 26
// 4d9: ifne 51b
// 4dc: goto 4ea
// 4df: ldc2_w 4797701336252418536
// 4e2: lload 9
// 4e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e9: athrow
// 4ea: lload 24
// 4ec: invokevirtual su/catlean/_g.f (J)Z
// 4ef: ifeq 517
// 4f2: goto 500
// 4f5: ldc2_w 4797701336252418536
// 4f8: lload 9
// 4fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ff: athrow
// 500: aload 0
// 501: getfield su/catlean/tw.j Lsu/catlean/_g;
// 504: lload 20
// 506: invokevirtual su/catlean/_g.d (J)V
// 509: goto 517
// 50c: ldc2_w 4797701336252418536
// 50f: lload 9
// 511: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 516: athrow
// 517: aload 0
// 518: getfield su/catlean/tw.j Lsu/catlean/_g;
// 51b: invokevirtual su/catlean/_g.c ()Ljava/util/List;
// 51e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 523: astore 27
// 525: aload 27
// 527: invokeinterface java/util/Iterator.hasNext ()Z 1
// 52c: ifeq 666
// 52f: aload 27
// 531: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 536: checkcast su/catlean/a1
// 539: astore 28
// 53b: aload 28
// 53d: invokevirtual su/catlean/a1.A ()V
// 540: goto 525
// 543: iload 17
// 545: i2s
// 546: iload 18
// 548: iload 19
// 54a: i2c
// 54b: sipush 23805
// 54e: ldc2_w 2912226271371985907
// 551: lload 9
// 553: lxor
// 554: invokedynamic k (IJ)I bsm=su/catlean/tw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 559: invokestatic su/catlean/bx.k (SICI)Z
// 55c: iload 5
// 55e: iflt 59f
// 561: iload 26
// 563: ifne 59f
// 566: ifeq 58f
// 569: goto 577
// 56c: ldc2_w 4797701336252418536
// 56f: lload 9
// 571: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 576: athrow
// 577: aload 0
// 578: bipush 1
// 579: putfield su/catlean/tw.l Z
// 57c: iload 26
// 57e: ifeq 666
// 581: goto 58f
// 584: ldc2_w 4797701336252418536
// 587: lload 9
// 589: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58e: athrow
// 58f: iload 8
// 591: goto 59f
// 594: ldc2_w 4797701336252418536
// 597: lload 9
// 599: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59e: athrow
// 59f: iload 2
// 5a0: ifle 5c7
// 5a3: tableswitch 195 0 2 25 53 176
// 5bc: aload 0
// 5bd: getfield su/catlean/tw.j Lsu/catlean/_g;
// 5c0: lload 13
// 5c2: invokevirtual su/catlean/_g.J (J)V
// 5c5: iload 26
// 5c7: ifeq 666
// 5ca: goto 5d8
// 5cd: ldc2_w 4797701336252418536
// 5d0: lload 9
// 5d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d7: athrow
// 5d8: aload 0
// 5d9: getfield su/catlean/tw.X Ljava/util/List;
// 5dc: checkcast java/util/Collection
// 5df: invokeinterface java/util/Collection.isEmpty ()Z 1
// 5e4: iload 26
// 5e6: ifne 609
// 5e9: goto 5f7
// 5ec: ldc2_w 4797701336252418536
// 5ef: lload 9
// 5f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f6: athrow
// 5f7: ifne 60c
// 5fa: goto 608
// 5fd: ldc2_w 4797701336252418536
// 600: lload 9
// 602: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 607: athrow
// 608: bipush 1
// 609: goto 60d
// 60c: bipush 0
// 60d: iload 1
// 60e: iflt 642
// 611: ifeq 63a
// 614: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 617: invokevirtual su/catlean/d2.R ()Lsu/catlean/lp;
// 61a: lload 15
// 61c: invokevirtual su/catlean/lp.L (J)V
// 61f: aload 0
// 620: getfield su/catlean/tw.y Lsu/catlean/ry;
// 623: aload 0
// 624: invokevirtual su/catlean/ry.u (Lsu/catlean/tw;)V
// 627: iload 26
// 629: ifeq 666
// 62c: goto 63a
// 62f: ldc2_w 4797701336252418536
// 632: lload 9
// 634: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 639: athrow
// 63a: aload 0
// 63b: lload 22
// 63d: invokevirtual su/catlean/tw.j (J)V
// 640: iload 26
// 642: ifeq 666
// 645: goto 653
// 648: ldc2_w 4797701336252418536
// 64b: lload 9
// 64d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 652: athrow
// 653: aload 0
// 654: bipush 1
// 655: putfield su/catlean/tw.l Z
// 658: goto 666
// 65b: ldc2_w 4797701336252418536
// 65e: lload 9
// 660: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 665: athrow
// 666: return
}

public final void j(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 24516904665043L;
d2.O.H().L(var3);
this.r = System.currentTimeMillis();
}

public final void R(short a, short a, int key, int a) {
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
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 32
// 013: lshl
// 014: bipush 32
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/tw.b J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 87443293068171
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 112449341166161
// 02b: lxor
// 02c: dup2
// 02d: bipush 48
// 02f: lushr
// 030: l2i
// 031: istore 9
// 033: dup2
// 034: bipush 16
// 036: lshl
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 10
// 03d: dup2
// 03e: bipush 48
// 040: lshl
// 041: bipush 48
// 043: lushr
// 044: l2i
// 045: istore 11
// 047: pop2
// 048: pop2
// 049: ldc2_w -4378668713275509075
// 04c: lload 5
// 04e: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: istore 12
// 055: aload 0
// 056: getfield su/catlean/tw.y Lsu/catlean/ry;
// 059: invokevirtual su/catlean/ry.Y ()Lsu/catlean/tw;
// 05c: aload 0
// 05d: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 060: iload 12
// 062: ifeq 0dc
// 065: ifeq 0d8
// 068: goto 076
// 06b: ldc2_w -4360377688980224000
// 06e: lload 5
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: aload 0
// 077: getfield su/catlean/tw.X Ljava/util/List;
// 07a: checkcast java/lang/Iterable
// 07d: astore 13
// 07f: bipush 0
// 080: istore 14
// 082: aload 13
// 084: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 089: astore 15
// 08b: aload 15
// 08d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 092: ifeq 0d7
// 095: aload 15
// 097: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 09c: astore 16
// 09e: aload 16
// 0a0: checkcast su/catlean/ru
// 0a3: astore 17
// 0a5: bipush 0
// 0a6: istore 18
// 0a8: aload 17
// 0aa: iload 3
// 0ab: iload 9
// 0ad: i2s
// 0ae: iload 10
// 0b0: iload 11
// 0b2: i2c
// 0b3: invokevirtual su/catlean/ru.V (ISIC)V
// 0b6: nop
// 0b7: iload 12
// 0b9: iload 1
// 0ba: iflt 0c2
// 0bd: ifeq 0d8
// 0c0: iload 12
// 0c2: ifne 08b
// 0c5: iload 2
// 0c6: iflt 0b7
// 0c9: goto 0d7
// 0cc: ldc2_w -4360377688980224000
// 0cf: lload 5
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: nop
// 0d8: aload 0
// 0d9: getfield su/catlean/tw.l Z
// 0dc: iload 4
// 0de: iflt 0f8
// 0e1: iload 12
// 0e3: ifeq 0f8
// 0e6: ifeq 16e
// 0e9: goto 0f7
// 0ec: ldc2_w -4360377688980224000
// 0ef: lload 5
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: iload 3
// 0f8: iload 1
// 0f9: iflt 134
// 0fc: lookupswitch 73 2 256 28 261 28
// 118: aload 0
// 119: iload 2
// 11a: ifle 16a
// 11d: getfield su/catlean/tw.j Lsu/catlean/_g;
// 120: new su/catlean/lj
// 123: dup
// 124: bipush -1
// 125: aload 0
// 126: getfield su/catlean/tw.a Z
// 129: bipush 0
// 12a: invokespecial su/catlean/lj.<init> (IZZ)V
// 12d: lload 7
// 12f: invokevirtual su/catlean/_g.N (Lsu/catlean/lj;J)V
// 132: iload 12
// 134: ifne 169
// 137: goto 145
// 13a: ldc2_w -4360377688980224000
// 13d: lload 5
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: aload 0
// 146: getfield su/catlean/tw.j Lsu/catlean/_g;
// 149: new su/catlean/lj
// 14c: dup
// 14d: iload 3
// 14e: aload 0
// 14f: getfield su/catlean/tw.a Z
// 152: bipush 0
// 153: invokespecial su/catlean/lj.<init> (IZZ)V
// 156: lload 7
// 158: invokevirtual su/catlean/_g.N (Lsu/catlean/lj;J)V
// 15b: goto 169
// 15e: ldc2_w -4360377688980224000
// 161: lload 5
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: aload 0
// 16a: bipush 0
// 16b: putfield su/catlean/tw.l Z
// 16e: return
}

public final void l(char char, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/tw.b J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 57822309818805
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -6307639418285792142
// 12: lload 2
// 13: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: istore 6
// 1a: aload 0
// 1b: getfield su/catlean/tw.y Lsu/catlean/ry;
// 1e: invokevirtual su/catlean/ry.Y ()Lsu/catlean/tw;
// 21: iload 6
// 23: ifne 48
// 26: aload 0
// 27: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2a: ifeq a6
// 2d: goto 3a
// 30: ldc2_w -6275839425789697125
// 33: lload 2
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: aload 0
// 3b: goto 48
// 3e: ldc2_w -6275839425789697125
// 41: lload 2
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: getfield su/catlean/tw.X Ljava/util/List;
// 4b: checkcast java/lang/Iterable
// 4e: astore 7
// 50: bipush 0
// 51: istore 8
// 53: aload 7
// 55: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 5a: astore 9
// 5c: aload 9
// 5e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 63: ifeq a5
// 66: aload 9
// 68: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 6d: astore 10
// 6f: aload 10
// 71: checkcast su/catlean/ru
// 74: astore 11
// 76: bipush 0
// 77: istore 12
// 79: aload 11
// 7b: iload 1
// 7c: lload 4
// 7e: invokevirtual su/catlean/ru.T (CJ)V
// 81: nop
// 82: iload 6
// 84: lload 2
// 85: lconst_0
// 86: lcmp
// 87: ifle 8f
// 8a: ifne a6
// 8d: iload 6
// 8f: ifeq 5c
// 92: lload 2
// 93: lconst_0
// 94: lcmp
// 95: iflt 82
// 98: goto a5
// 9b: ldc2_w -6275839425789697125
// 9e: lload 2
// 9f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4: athrow
// a5: nop
// a6: return
}

public final boolean v(double mouseX, long a, double mouseY, double verticalAmount) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tw.b J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 11239571096719
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 9
// 013: dup2
// 014: bipush 8
// 016: lshl
// 017: bipush 8
// 019: lushr
// 01a: lstore 10
// 01c: pop2
// 01d: pop2
// 01e: ldc2_w -2441037470211462263
// 021: lload 3
// 022: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 027: bipush 0
// 028: istore 13
// 02a: istore 12
// 02c: aload 0
// 02d: getfield su/catlean/tw.y Lsu/catlean/ry;
// 030: invokevirtual su/catlean/ry.Y ()Lsu/catlean/tw;
// 033: aload 0
// 034: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 037: iload 12
// 039: ifeq 1a9
// 03c: ifeq 1a7
// 03f: goto 04c
// 042: ldc2_w -2424983050016025308
// 045: lload 3
// 046: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: athrow
// 04c: aload 0
// 04d: getfield su/catlean/tw.X Ljava/util/List;
// 050: checkcast java/lang/Iterable
// 053: astore 14
// 055: bipush 0
// 056: istore 15
// 058: aload 14
// 05a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 05f: astore 16
// 061: aload 16
// 063: invokeinterface java/util/Iterator.hasNext ()Z 1
// 068: ifeq 1a0
// 06b: aload 16
// 06d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 072: astore 17
// 074: aload 17
// 076: checkcast su/catlean/ru
// 079: astore 18
// 07b: bipush 0
// 07c: istore 19
// 07e: iload 12
// 080: ifeq 1a7
// 083: aload 18
// 085: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 088: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 08b: iload 12
// 08d: ifeq 144
// 090: goto 09d
// 093: ldc2_w -2424983050016025308
// 096: lload 3
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: lload 3
// 09e: lconst_0
// 09f: lcmp
// 0a0: ifle 137
// 0a3: ifnull 12a
// 0a6: goto 0b3
// 0a9: ldc2_w -2424983050016025308
// 0ac: lload 3
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: aload 18
// 0b5: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 0b8: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 0bb: dup
// 0bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0bf: lload 3
// 0c0: lconst_0
// 0c1: lcmp
// 0c2: ifle 109
// 0c5: iload 12
// 0c7: ifeq 109
// 0ca: goto 0d7
// 0cd: ldc2_w -2424983050016025308
// 0d0: lload 3
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: invokevirtual su/catlean/h.L ()Z
// 0da: lload 3
// 0db: lconst_0
// 0dc: lcmp
// 0dd: ifle 19d
// 0e0: ifeq 199
// 0e3: goto 0f0
// 0e6: ldc2_w -2424983050016025308
// 0e9: lload 3
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: aload 18
// 0f2: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 0f5: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 0f8: dup
// 0f9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0fc: goto 109
// 0ff: ldc2_w -2424983050016025308
// 102: lload 3
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: invokevirtual su/catlean/h.x ()Lsu/catlean/w7;
// 10c: lload 3
// 10d: lconst_0
// 10e: lcmp
// 10f: ifle 144
// 112: iload 12
// 114: ifeq 144
// 117: getstatic su/catlean/w7.BOOLS Lsu/catlean/w7;
// 11a: if_acmpeq 199
// 11d: goto 12a
// 120: ldc2_w -2424983050016025308
// 123: lload 3
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: aload 18
// 12c: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 12f: invokevirtual su/catlean/a1.c ()Lkotlin/jvm/functions/Function0;
// 132: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 137: goto 144
// 13a: ldc2_w -2424983050016025308
// 13d: lload 3
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: checkcast java/lang/Boolean
// 147: invokevirtual java/lang/Boolean.booleanValue ()Z
// 14a: iload 12
// 14c: lload 3
// 14d: lconst_0
// 14e: lcmp
// 14f: iflt 183
// 152: ifeq 181
// 155: ifeq 199
// 158: goto 165
// 15b: ldc2_w -2424983050016025308
// 15e: lload 3
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: aload 18
// 167: iload 9
// 169: i2b
// 16a: dload 1
// 16b: dload 5
// 16d: dload 7
// 16f: lload 10
// 171: invokevirtual su/catlean/ru.S (BDDDJ)Z
// 174: goto 181
// 177: ldc2_w -2424983050016025308
// 17a: lload 3
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: iload 12
// 183: ifeq 197
// 186: ifeq 199
// 189: goto 196
// 18c: ldc2_w -2424983050016025308
// 18f: lload 3
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: bipush 1
// 197: istore 13
// 199: nop
// 19a: nop
// 19b: iload 12
// 19d: ifne 061
// 1a0: lload 3
// 1a1: lconst_0
// 1a2: lcmp
// 1a3: iflt 1a7
// 1a6: nop
// 1a7: iload 13
// 1a9: ireturn
}

public final float M(@NotNull h group, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tw.b J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: ldc2_w 3555178486738601152
// 009: lload 2
// 00a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: aload 1
// 010: sipush 31056
// 013: ldc2_w 572646499415099447
// 016: lload 2
// 017: lxor
// 018: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/tw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: istore 4
// 022: aload 1
// 023: iload 4
// 025: ifeq 049
// 028: invokevirtual su/catlean/h.L ()Z
// 02b: ifne 05f
// 02e: goto 03b
// 031: ldc2_w 3535761553837619821
// 034: lload 2
// 035: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: athrow
// 03b: aload 1
// 03c: goto 049
// 03f: ldc2_w 3535761553837619821
// 042: lload 2
// 043: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: athrow
// 049: invokevirtual su/catlean/h.x ()Lsu/catlean/w7;
// 04c: getstatic su/catlean/w7.BOOLS Lsu/catlean/w7;
// 04f: if_acmpeq 05f
// 052: ldc 13.0
// 054: freturn
// 055: ldc2_w 3535761553837619821
// 058: lload 2
// 059: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: athrow
// 05f: fconst_0
// 060: fstore 5
// 062: ldc 13.0
// 064: fstore 5
// 066: aload 0
// 067: getfield su/catlean/tw.X Ljava/util/List;
// 06a: checkcast java/lang/Iterable
// 06d: astore 7
// 06f: bipush 0
// 070: istore 8
// 072: aload 7
// 074: astore 9
// 076: new java/util/ArrayList
// 079: dup
// 07a: invokespecial java/util/ArrayList.<init> ()V
// 07d: checkcast java/util/Collection
// 080: astore 10
// 082: bipush 0
// 083: istore 11
// 085: aload 9
// 087: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 08c: astore 12
// 08e: aload 12
// 090: invokeinterface java/util/Iterator.hasNext ()Z 1
// 095: ifeq 11e
// 098: aload 12
// 09a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 09f: astore 13
// 0a1: aload 13
// 0a3: checkcast su/catlean/ru
// 0a6: astore 14
// 0a8: bipush 0
// 0a9: istore 15
// 0ab: aload 14
// 0ad: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 0b0: invokevirtual su/catlean/a1.m ()Lsu/catlean/h;
// 0b3: aload 1
// 0b4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b7: iload 4
// 0b9: lload 2
// 0ba: lconst_0
// 0bb: lcmp
// 0bc: ifle 0f4
// 0bf: ifeq 0f2
// 0c2: ifeq 10b
// 0c5: goto 0d2
// 0c8: ldc2_w 3535761553837619821
// 0cb: lload 2
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: aload 14
// 0d4: invokevirtual su/catlean/ru.A ()Lsu/catlean/a1;
// 0d7: invokevirtual su/catlean/a1.c ()Lkotlin/jvm/functions/Function0;
// 0da: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 0df: checkcast java/lang/Boolean
// 0e2: invokevirtual java/lang/Boolean.booleanValue ()Z
// 0e5: goto 0f2
// 0e8: ldc2_w 3535761553837619821
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: iload 4
// 0f4: ifeq 108
// 0f7: ifeq 10b
// 0fa: goto 107
// 0fd: ldc2_w 3535761553837619821
// 100: lload 2
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: bipush 1
// 108: goto 10c
// 10b: bipush 0
// 10c: ifeq 08e
// 10f: aload 10
// 111: aload 13
// 113: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 118: pop
// 119: iload 4
// 11b: ifne 08e
// 11e: aload 10
// 120: checkcast java/util/List
// 123: nop
// 124: astore 6
// 126: aload 6
// 128: checkcast java/lang/Iterable
// 12b: astore 7
// 12d: bipush 0
// 12e: istore 8
// 130: aload 7
// 132: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 137: lload 2
// 138: lconst_0
// 139: lcmp
// 13a: ifle 09f
// 13d: astore 9
// 13f: aload 9
// 141: invokeinterface java/util/Iterator.hasNext ()Z 1
// 146: ifeq 18d
// 149: aload 9
// 14b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 150: astore 10
// 152: aload 10
// 154: checkcast su/catlean/ru
// 157: astore 11
// 159: bipush 0
// 15a: istore 12
// 15c: fload 5
// 15e: aload 11
// 160: invokevirtual su/catlean/ru.d ()F
// 163: fconst_2
// 164: fadd
// 165: fadd
// 166: lload 2
// 167: lconst_0
// 168: lcmp
// 169: iflt 190
// 16c: fstore 5
// 16e: nop
// 16f: nop
// 170: iload 4
// 172: ifeq 18e
// 175: iload 4
// 177: ifne 13f
// 17a: lload 2
// 17b: lconst_0
// 17c: lcmp
// 17d: iflt 170
// 180: goto 18d
// 183: ldc2_w 3535761553837619821
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: nop
// 18e: fload 5
// 190: freturn
}

static {
long var22 = b ^ 70540637732069L;
Cipher var24;
Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var25 = 1; var25 < 8; var25++) {
var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var31 = new String[28];
int var29 = 0;
String var28 = "Ç5@õà¶*¶{ò\u0011¬g¨ÚßSZÏ>¬Ø\u001dh>ñ<C\u008a#K2³\u0083\u0012'Î& \u009cË\u0095S\u001a+4\u0000\u008eÚ'\u00ad,®\u0094ÖâÏ\u0002\u0093t\u001b\u009a¦/ ¶=ãLî\u0091°gìþ\u00ad8\\£\u00900ÂÉìD]\u0086'ñ]÷Ãi\u0098¼\u0086{Ð\u0016\u001f9\u0082nû\u0094\u00059\u009aÿ®\u0010Y\u0012Êÿ\u009fÌÐ¯W\u0095ÔmrÉ\u00ad\u0096\u0084J\u009c\u0000?\u0016ÛÌÔ\u0010·('@n6ôExkGû)Ç^ª\u0010¹BÌ\u0010\u000f\u008c\u009d8E7\u001dÔ\u001d\u008e¯û\u0010¯\u0003©®bÍÍøÐv ü!ñ\u0003m¨»\u0017\u0003öqîK»úòÇºïé\u008bP¦3tu!ì½áu×À\u008f?áð¢ºæ#\u0095ëJxô\u0097ópÞ\u000e\u0017Íâ\u0019¨\u009e¥Â*ã\n:|\b¡üË0³ +Àñp ñû89Øéè\u0091\u0001>àc\u0082`ýÂ\"Û\u0094Ü\u008f\fK\u008f\t\u0013Ë\r@\u001cÕßÞ\u0096/Sò·\\q\u0097ä=ÚìþèÝÏyõâ¤\u0080ÕX+N£\u0005=iJHçè¬\u001e\u0098\u0003¸;ù©zú(\u00122c&e\u0004ÔuÑ»Í)é²\u000e\u008c¿\u0018Û®Â°Ï¾ï \u0080\u001b\u0004ÌÛ\u008aÜ\u0092\u0094Ò\n[\u001c¹\u008b½M\u007f§q\u0089Î\u001a£æ\u000224,×s\fùòÊ\u009b{µæ\u009fÏñ^5LÇù[9nH¥²Q¾öÂÆE§Gê\u0084¡¿|ÞIÑY[|E7«#é\u0015\u0091\r{#[:³\u009drFu\u009a\u000eã+\fæ\u0087ÒÆ_v\u000f=ïÃ\u0089\u0093\u000bö¢Â4Z]\u009c\u009c\u0013Y\u001ad\u0087\u008d0¯\u0002&÷Û\u0010@_Ûì\\\fr\u000b·þÿ\bbûÑÔý'\u0096£±¤è\u009f\u0013¬ÛT\u001c]\u001a\u0098V\nC³\u0080\u000bï\bÓÕO,¨\f!~Ó\u008bu\u0005>i\u0002<è×¯9«SQÆôdÈû\t\u0088¢ñ½Ð\u0085¹\u0085Un\u001dòßøðNDìéE÷çÀ\u0083ÝÅ4\u000e\rþt<Å ÷»\u0006\u0098Íª\u009bx\u0098%´\u0089+<\u0092[l¸Ôz3¼\u0007¤hÆ\u0005ÄkÙb ®A\u008cL¬Á\u0090\u0001SÆA\fü\u0018K\u0014UI\u00adÁ+Ù¥>9÷¹\u008dx´õÔ?b-Ag¤nÈ´_\u0001\u0080¯yµg\u009c%\u0010±\u009fðUÜ\u0013{©þ±#.$6Æ\u0088ï°Ø°1e!\fCS\u0005@¦OÏ\u0089/Õ\u0090\u0010òCAÓÿóü÷)¾ªÒØ8Ù\u0004+x\t«þ\u0090\u007fezÌé«ºKª~\u000e®Èd\u0013$M\u008dá\u0087Ï\rUï>\u008a¿â9Â¬¨p\u0093 CÃa-\u000e\u0015\u001eñT´@9â?\u000ePØ\u0095WãìÕ\u0010øØGª(]ú\u0087\u001c\u0010ÊÌ\u0087÷¨\u0012\u00ad\u0010\u0088}ì4ÁáI\u0082ÀÐÇ\nIG\u0088d\u0005ÁôÃ½]X\fÆ\u008do\u008d¢lgr\u007fÔÖ¼s*|´`?\u0002^!yë8\u000bÝø[\u009fµ\u0096\u0016\u007fð.~Üªziúk\u0001nÁ\u0002\u0093d\u0089 Ñø\u0081°u®I\\¢*\u0085\u001cáÅËc@\u001f¡^Ai²\u001f\u0095\u0095~O&N\u0085\u0005¥ó\u0093&×ª\u0091èqc¶Á¬\u0016¹3|²£\u001d\u0014\u0016\u0001\u009e\u007f\u009c»=¿¶ñÃÿM÷\u000bmin¹ó\byu\u0091\u0085\fíTý|\u007f\u001f¿¯\u0006]x÷\\f\u0087\u0088\u009d\u0012\u009aº@Ô{\u0099&4Óh®øÁÁ\u009a3ÒÍ\u009d°R'\u0013\u001bÖ\u000fSkjÿ\u0010 \u009f\u0082-±R-,pû\u009b\u009b\u009dûÔ\u001d áR?¢à\u0098|\u0095o´)¸Â}¬®~i\u0081é\u000eÛu\u0019ÆÎºk2åt\u0085\u0088w\rÎÁßß¼f\u0005,2<ÅKøûSR \u009ej/Ãá\u0096\u0090\u0003\u0081\u001eS×¥:wFÑ\u0089bÏ¥tÛô\u0001J\u0082\u008b\t?Iñ+³g\u000b\u008d×\u007fv\u008b·´/Í\"\u001f\u0089ã\u0013HÐÅ\u0087{ô¡;G\u0007S^ª#øò_¸ÿ(?øÑ+Û<\bF8ÿ\u009fº!CÒ\u0019\u0091Ú»ñ¼ñ]ÉFÐ\u0090Ç\u0084ÏÖùHÊZÅ¹©(8ÕLa\f\u0087\u0017Ì\u0018\u0006h*ÖF>Pj9\u001e% ¶Cê\u0086\u0000y\u009cRk\u0019\u0019þ\u0010+YÕzÿö¶ìÛLFÄViôZ°9ù¾ñ?sÞ£\u000b[&\u009a\u0003S03\t÷\u0084«JNò\u008f:½Zµ\u0098ÑÐ y\u0082\u008e\u0019`<\u001f¹ãM\u0086\u0088Ð\u008c\u0015áHàf\u001dâTÕ\u0095\u000b\tw¬\u0012 \u0098§¦\u0081ædBîÍ«\u001c\u0012D\";í\u008d\u0001Ó¥WpÐJ\u008e£¦¶ô(Ýé.\u009d/tªhÏ\u001e\u0005Ñ¦l»æÞÖ´$üÁ²\u0082\u0012TRthgÉ± 0TçåÜ¼eÏIÎrÚwÄ'\u0006\u0082\u000f}é\u0090¥:\u0082\u008eà\u0002Ú\u00162\u000ej\u0011G\u0097\u0093*\u0099F\u000bñ\u0018\u0087Ï\u0005é¬\u009e¢àëX±Z\u0090%5(\u0002ëT÷\u001eòðx\u001e§¥;%£ð\u0004*Xí\u0014\u009e¤¢º!æ7?Ì¢þ\u0016t±\u000fùÉrjg paÆ\u009câßÙrU&ô\u001aò\u008a´}ð\u0099ÄÜù\u00915!ì±µf\u0088é\u0000+\u0015Ë~OÀr«\u0000\u009c QD$TÆµ¨\n\u0083\u001fZ$S1ìE\u009fÕ7ÅP»I~\u00825XûW'¸\u0016PÉÌñÀ\u00071z{W\u0091$/\u001a\u001e¾:#Á\rUÕ\u0092Êéf\u0003'å6\u0086\u009aÈ\u0095\u008f\u0019\u0006V=É¼\u0000\u0091;àÀ\u0018\u0085/\u009fï7«\u0089Bû\u0084Kì \u007f4ð\u000buð\u0017\u008e©\f\u0093ð \fÏæ£NDfÛ\u0082,ð\u009a|ðp\u008c)\u009e9¯ÚZªê¶Å¥\u008e:ì³\u009e=Ôÿv`¹'.ç\u0090ùðç\u0012ÆÔ\u00ad©¾\u0084-\u0005%\u0010Ñ\u0094ÏJO\u001fN\u0006\u0018¦\u0019Âû\u0097ØsX\u000bË#¼#\u0099\u0088\u0001ªòÆAôÜ\u009e[l\"\u0015<@g\u0002\u008fÙE\u0093\u001eÝµ·t@·©p?.©\u0093Ö<L\u0002\u008eî|\u0095W\u001f\u0090ªÏ\u008d^ÙÀm[\u0007ô¬ãp\u0091tüOYÃo\u00956§ë³\u0093t¶\u0018:º\u008f¿ðS2Q\u0080c\u0083d\r\u0088\u0090·\\\n\u0080Ãg°\u0087ñ7>%±\u0099\u0085`$\"(?\t«\u008bÆÙò \u009d\u001eìDs¿\u0013\u0014¤0ij\u008e0ZH´Êªýt¸\u000eÚ&ÁY<\u0005Üÿ¡(ñ!¹\u0083ï£\u008e ÎØ:û&²ÚÎf!\u0087§zÇoÆ7×÷½\u0000\u0099\b{g\b÷\u0097\r!àóY\u001a\u009f\u0012ªôÀ¢0\u001c\u0098y)±pÄÓwí%.×\u0080±¸\u009aaTùD «\u009f\u0001ú\u0087\u000eu2ÊÛ¢\u0090Rúø¨\\\u008f\u0088\u009fg\u0096\u009aÌ¥·\u001f¸\u0010jÞÁð\u0091£ØóÚ\u008c[\u0002\u001czSê¼V\u0012¶*~\u0097yaFñTÀ\u008e\u0012\u008e\u009b¨~1C>,©úv×Gò\u0010¡À¦)å$\u0094NÔSâØl<Î\u0007\u009d\u008c±v|ù\u0015ì\u0081Ò:2:A}s\\Ñ\u0018'u©k#ëÒ\r\u0095Î\u0010#è\u0087÷\u0091{Âë\u0015m\r@\u001a\u008eÝô\u0010Ý.\u000e×+¡{^aWk\u0081)\u0014\u009b.\u0090$#¬&`RTÞ\u0093âq\u0016\u0004$Câ\u00848þã\u0017î\u0010¶>Rò\u008dÀ?jï´\u007føJ\u0018\"w\u0098òy\u00810Q¤|}L\r\u0098|n)úx\u000eM\u0019©\u000b¢Þ_ dÙ\u0002'u\u007fâºXmñã6«ûDÀ\u0082½5/àLAhø\u0013yZ_\u0011\n¤<Ú\r\u0015.=×óÌ¦¸I\u0018\u0088Å\ts\u0005ó²l\u001bf\u009fç\u0094rÜH¢Ýã\u008f\u0087ÚBûÐÓ\u008fâSuJø\u0001";
int var30 = "Ç5@õà¶*¶{ò\u0011¬g¨ÚßSZÏ>¬Ø\u001dh>ñ<C\u008a#K2³\u0083\u0012'Î& \u009cË\u0095S\u001a+4\u0000\u008eÚ'\u00ad,®\u0094ÖâÏ\u0002\u0093t\u001b\u009a¦/ ¶=ãLî\u0091°gìþ\u00ad8\\£\u00900ÂÉìD]\u0086'ñ]÷Ãi\u0098¼\u0086{Ð\u0016\u001f9\u0082nû\u0094\u00059\u009aÿ®\u0010Y\u0012Êÿ\u009fÌÐ¯W\u0095ÔmrÉ\u00ad\u0096\u0084J\u009c\u0000?\u0016ÛÌÔ\u0010·('@n6ôExkGû)Ç^ª\u0010¹BÌ\u0010\u000f\u008c\u009d8E7\u001dÔ\u001d\u008e¯û\u0010¯\u0003©®bÍÍøÐv ü!ñ\u0003m¨»\u0017\u0003öqîK»úòÇºïé\u008bP¦3tu!ì½áu×À\u008f?áð¢ºæ#\u0095ëJxô\u0097ópÞ\u000e\u0017Íâ\u0019¨\u009e¥Â*ã\n:|\b¡üË0³ +Àñp ñû89Øéè\u0091\u0001>àc\u0082`ýÂ\"Û\u0094Ü\u008f\fK\u008f\t\u0013Ë\r@\u001cÕßÞ\u0096/Sò·\\q\u0097ä=ÚìþèÝÏyõâ¤\u0080ÕX+N£\u0005=iJHçè¬\u001e\u0098\u0003¸;ù©zú(\u00122c&e\u0004ÔuÑ»Í)é²\u000e\u008c¿\u0018Û®Â°Ï¾ï \u0080\u001b\u0004ÌÛ\u008aÜ\u0092\u0094Ò\n[\u001c¹\u008b½M\u007f§q\u0089Î\u001a£æ\u000224,×s\fùòÊ\u009b{µæ\u009fÏñ^5LÇù[9nH¥²Q¾öÂÆE§Gê\u0084¡¿|ÞIÑY[|E7«#é\u0015\u0091\r{#[:³\u009drFu\u009a\u000eã+\fæ\u0087ÒÆ_v\u000f=ïÃ\u0089\u0093\u000bö¢Â4Z]\u009c\u009c\u0013Y\u001ad\u0087\u008d0¯\u0002&÷Û\u0010@_Ûì\\\fr\u000b·þÿ\bbûÑÔý'\u0096£±¤è\u009f\u0013¬ÛT\u001c]\u001a\u0098V\nC³\u0080\u000bï\bÓÕO,¨\f!~Ó\u008bu\u0005>i\u0002<è×¯9«SQÆôdÈû\t\u0088¢ñ½Ð\u0085¹\u0085Un\u001dòßøðNDìéE÷çÀ\u0083ÝÅ4\u000e\rþt<Å ÷»\u0006\u0098Íª\u009bx\u0098%´\u0089+<\u0092[l¸Ôz3¼\u0007¤hÆ\u0005ÄkÙb ®A\u008cL¬Á\u0090\u0001SÆA\fü\u0018K\u0014UI\u00adÁ+Ù¥>9÷¹\u008dx´õÔ?b-Ag¤nÈ´_\u0001\u0080¯yµg\u009c%\u0010±\u009fðUÜ\u0013{©þ±#.$6Æ\u0088ï°Ø°1e!\fCS\u0005@¦OÏ\u0089/Õ\u0090\u0010òCAÓÿóü÷)¾ªÒØ8Ù\u0004+x\t«þ\u0090\u007fezÌé«ºKª~\u000e®Èd\u0013$M\u008dá\u0087Ï\rUï>\u008a¿â9Â¬¨p\u0093 CÃa-\u000e\u0015\u001eñT´@9â?\u000ePØ\u0095WãìÕ\u0010øØGª(]ú\u0087\u001c\u0010ÊÌ\u0087÷¨\u0012\u00ad\u0010\u0088}ì4ÁáI\u0082ÀÐÇ\nIG\u0088d\u0005ÁôÃ½]X\fÆ\u008do\u008d¢lgr\u007fÔÖ¼s*|´`?\u0002^!yë8\u000bÝø[\u009fµ\u0096\u0016\u007fð.~Üªziúk\u0001nÁ\u0002\u0093d\u0089 Ñø\u0081°u®I\\¢*\u0085\u001cáÅËc@\u001f¡^Ai²\u001f\u0095\u0095~O&N\u0085\u0005¥ó\u0093&×ª\u0091èqc¶Á¬\u0016¹3|²£\u001d\u0014\u0016\u0001\u009e\u007f\u009c»=¿¶ñÃÿM÷\u000bmin¹ó\byu\u0091\u0085\fíTý|\u007f\u001f¿¯\u0006]x÷\\f\u0087\u0088\u009d\u0012\u009aº@Ô{\u0099&4Óh®øÁÁ\u009a3ÒÍ\u009d°R'\u0013\u001bÖ\u000fSkjÿ\u0010 \u009f\u0082-±R-,pû\u009b\u009b\u009dûÔ\u001d áR?¢à\u0098|\u0095o´)¸Â}¬®~i\u0081é\u000eÛu\u0019ÆÎºk2åt\u0085\u0088w\rÎÁßß¼f\u0005,2<ÅKøûSR \u009ej/Ãá\u0096\u0090\u0003\u0081\u001eS×¥:wFÑ\u0089bÏ¥tÛô\u0001J\u0082\u008b\t?Iñ+³g\u000b\u008d×\u007fv\u008b·´/Í\"\u001f\u0089ã\u0013HÐÅ\u0087{ô¡;G\u0007S^ª#øò_¸ÿ(?øÑ+Û<\bF8ÿ\u009fº!CÒ\u0019\u0091Ú»ñ¼ñ]ÉFÐ\u0090Ç\u0084ÏÖùHÊZÅ¹©(8ÕLa\f\u0087\u0017Ì\u0018\u0006h*ÖF>Pj9\u001e% ¶Cê\u0086\u0000y\u009cRk\u0019\u0019þ\u0010+YÕzÿö¶ìÛLFÄViôZ°9ù¾ñ?sÞ£\u000b[&\u009a\u0003S03\t÷\u0084«JNò\u008f:½Zµ\u0098ÑÐ y\u0082\u008e\u0019`<\u001f¹ãM\u0086\u0088Ð\u008c\u0015áHàf\u001dâTÕ\u0095\u000b\tw¬\u0012 \u0098§¦\u0081ædBîÍ«\u001c\u0012D\";í\u008d\u0001Ó¥WpÐJ\u008e£¦¶ô(Ýé.\u009d/tªhÏ\u001e\u0005Ñ¦l»æÞÖ´$üÁ²\u0082\u0012TRthgÉ± 0TçåÜ¼eÏIÎrÚwÄ'\u0006\u0082\u000f}é\u0090¥:\u0082\u008eà\u0002Ú\u00162\u000ej\u0011G\u0097\u0093*\u0099F\u000bñ\u0018\u0087Ï\u0005é¬\u009e¢àëX±Z\u0090%5(\u0002ëT÷\u001eòðx\u001e§¥;%£ð\u0004*Xí\u0014\u009e¤¢º!æ7?Ì¢þ\u0016t±\u000fùÉrjg paÆ\u009câßÙrU&ô\u001aò\u008a´}ð\u0099ÄÜù\u00915!ì±µf\u0088é\u0000+\u0015Ë~OÀr«\u0000\u009c QD$TÆµ¨\n\u0083\u001fZ$S1ìE\u009fÕ7ÅP»I~\u00825XûW'¸\u0016PÉÌñÀ\u00071z{W\u0091$/\u001a\u001e¾:#Á\rUÕ\u0092Êéf\u0003'å6\u0086\u009aÈ\u0095\u008f\u0019\u0006V=É¼\u0000\u0091;àÀ\u0018\u0085/\u009fï7«\u0089Bû\u0084Kì \u007f4ð\u000buð\u0017\u008e©\f\u0093ð \fÏæ£NDfÛ\u0082,ð\u009a|ðp\u008c)\u009e9¯ÚZªê¶Å¥\u008e:ì³\u009e=Ôÿv`¹'.ç\u0090ùðç\u0012ÆÔ\u00ad©¾\u0084-\u0005%\u0010Ñ\u0094ÏJO\u001fN\u0006\u0018¦\u0019Âû\u0097ØsX\u000bË#¼#\u0099\u0088\u0001ªòÆAôÜ\u009e[l\"\u0015<@g\u0002\u008fÙE\u0093\u001eÝµ·t@·©p?.©\u0093Ö<L\u0002\u008eî|\u0095W\u001f\u0090ªÏ\u008d^ÙÀm[\u0007ô¬ãp\u0091tüOYÃo\u00956§ë³\u0093t¶\u0018:º\u008f¿ðS2Q\u0080c\u0083d\r\u0088\u0090·\\\n\u0080Ãg°\u0087ñ7>%±\u0099\u0085`$\"(?\t«\u008bÆÙò \u009d\u001eìDs¿\u0013\u0014¤0ij\u008e0ZH´Êªýt¸\u000eÚ&ÁY<\u0005Üÿ¡(ñ!¹\u0083ï£\u008e ÎØ:û&²ÚÎf!\u0087§zÇoÆ7×÷½\u0000\u0099\b{g\b÷\u0097\r!àóY\u001a\u009f\u0012ªôÀ¢0\u001c\u0098y)±pÄÓwí%.×\u0080±¸\u009aaTùD «\u009f\u0001ú\u0087\u000eu2ÊÛ¢\u0090Rúø¨\\\u008f\u0088\u009fg\u0096\u009aÌ¥·\u001f¸\u0010jÞÁð\u0091£ØóÚ\u008c[\u0002\u001czSê¼V\u0012¶*~\u0097yaFñTÀ\u008e\u0012\u008e\u009b¨~1C>,©úv×Gò\u0010¡À¦)å$\u0094NÔSâØl<Î\u0007\u009d\u008c±v|ù\u0015ì\u0081Ò:2:A}s\\Ñ\u0018'u©k#ëÒ\r\u0095Î\u0010#è\u0087÷\u0091{Âë\u0015m\r@\u001a\u008eÝô\u0010Ý.\u000e×+¡{^aWk\u0081)\u0014\u009b.\u0090$#¬&`RTÞ\u0093âq\u0016\u0004$Câ\u00848þã\u0017î\u0010¶>Rò\u008dÀ?jï´\u007føJ\u0018\"w\u0098òy\u00810Q¤|}L\r\u0098|n)úx\u000eM\u0019©\u000b¢Þ_ dÙ\u0002'u\u007fâºXmñã6«ûDÀ\u0082½5/àLAhø\u0013yZ_\u0011\n¤<Ú\r\u0015.=×óÌ¦¸I\u0018\u0088Å\ts\u0005ó²l\u001bf\u009fç\u0094rÜH¢Ýã\u008f\u0087ÚBûÐÓ\u008fâSuJø\u0001"
.length();
char var27 = 136;
int var36 = -1;

label81:
while (true) {
String var37 = var28.substring(++var36, var36 + var27);
int var10001 = -1;

while (true) {
byte[] var32 = var24.doFinal(var37.getBytes("ISO-8859-1"));
String var53 = a(var32).intern();
switch (var10001) {
case 0:
var31[var29++] = var53;
if ((var36 += var27) >= var30) {
c = var31;
d = new String[28];
h = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[14];
int var14 = 0;
String var15 = ";\u0010\u0015\n\u008a\u009c\u008bð»Ä6\\rw&»I\u0018ï\u0088\u009e¿5qø¨ìLýp;\b^±å=°\u001c]\u0087n\u001dê=\u0017\u0003\u001e×Z%C\u008e\u0099é@\u009eúu+:\u0081®ò\u0002½\u0088ÐGû¢½J\u0011þÇÎ\u0086\u0095ß5\u0092<Ü\u0093\u0011ÿ\u0081È\u0098¹üÁËÑVw";
int var16 = ";\u0010\u0015\n\u008a\u009c\u008bð»Ä6\\rw&»I\u0018ï\u0088\u009e¿5qø¨ìLýp;\b^±å=°\u001c]\u0087n\u001dê=\u0017\u0003\u001e×Z%C\u008e\u0099é@\u009eúu+:\u0081®ò\u0002½\u0088ÐGû¢½J\u0011þÇÎ\u0086\u0095ß5\u0092<Ü\u0093\u0011ÿ\u0081È\u0098¹üÁËÑVw"
.length();
byte var13 = 0;

label63:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var40 = var17;
var10001 = var14++;
long var57 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var63 = -1;

while (true) {
long var19 = var57;
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
long var68 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var63) {
case 0:
var40[var10001] = var68;
if (var13 >= var16) {
f = var17;
g = new Integer[14];
n = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "\u00946âÏ\u0014y\u008b\u0017\u0004<P\u0018b¶\u00036";
int var5 = "\u00946âÏ\u0014y\u008b\u0017\u0004<P\u0018b¶\u00036".length();
byte var2 = 0;

label47:
while (true) {
int var49 = var2;
var2 += 8;
byte[] var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
long[] var42 = var6;
var49 = var3++;
long var60 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var66 = -1;

while (true) {
long var8 = var60;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
var68 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var66) {
case 0:
var42[var49] = var68;
if (var2 >= var5) {
i = var6;
k = new Long[4];
return;
}
break;
default:
var42[var49] = var68;
if (var2 < var5) {
continue label47;
}

var4 = "\u008bo\u001b ó\t\u0084¬Xêó\u0019®k\u009d\u0089";
var5 = "\u008bo\u001b ó\t\u0084¬Xêó\u0019®k\u009d\u0089".length();
var2 = 0;
}

byte var51 = var2;
var2 += 8;
var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
var42 = var6;
var49 = var3++;
var60 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var66 = 0;
}
}
}
break;
default:
var40[var10001] = var68;
if (var13 < var16) {
continue label63;
}

var15 = "ôY\u0017Ó¢1\u00ad\u0090O\u001bÒþãÏsÇ";
var16 = "ôY\u0017Ó¢1\u00ad\u0090O\u001bÒþãÏsÇ".length();
var13 = 0;
}

byte var48 = var13;
var13 += 8;
var18 = var15.substring(var48, var13).getBytes("ISO-8859-1");
var40 = var17;
var10001 = var14++;
var57 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var63 = 0;
}
}
}

var27 = var28.charAt(var36);
break;
default:
var31[var29++] = var53;
if ((var36 += var27) < var30) {
var27 = var28.charAt(var36);
continue label81;
}

var28 = "\u009a\u0015Ql\u001a?JC\\²e¨¼\u001cl{\u0003ÜÎRHÂ°¤\u009a2ÚC\u008d\tÍ\u0007j$a\u0083hú«Ø·ÞÍd\u00802äï,HýÝ\u0086\u009f_çYÊÇ¢{¥M\u000b\u0016öÓS´/,w\u0015|bGf\u0084ôicRIS/Î\u0014ª\u0096´úÁ\u0081Æi\u0084Ätâ\u0015¦\u0097êÝ\u0013ßN6 \u0004bàt¦8@vû\u008cD6-ã\u000eØ@Fp\u0086RT\u0091 ¨ö5Í÷?\u001ff(\u001a\u0084 \u0098ë\u0017xäÁÞ1Ê\u0092\u009e\nàç}\u001fH\u0097Ç\u0096c\u0005\rÄGÉ\u0085!ÿì\u0019\u007fyH%î!®|ð\u0090\biã7yX\u0095\u0089S»)\u009f\u0091#\u008d\u0095\fû\\\u0090$Î<°è¡Ñ\u008fðm&àDcîâ+b¼\u008c+&®vX\u001b\u0007d\u008bIÓv\u008c\u0014\u0011\u001fÜB¡j\\Ù\u0093¡\u008aÅêÑWê ÝüÃ^ù+xäúÄ\u0096@C÷\t¸Oç\u007f\u000bð\u0004{\u009c\u0005\u0087¡lwâ\rx³yiímÞÙcë4÷_Z\u0001ï¸";
var30 = "\u009a\u0015Ql\u001a?JC\\²e¨¼\u001cl{\u0003ÜÎRHÂ°¤\u009a2ÚC\u008d\tÍ\u0007j$a\u0083hú«Ø·ÞÍd\u00802äï,HýÝ\u0086\u009f_çYÊÇ¢{¥M\u000b\u0016öÓS´/,w\u0015|bGf\u0084ôicRIS/Î\u0014ª\u0096´úÁ\u0081Æi\u0084Ätâ\u0015¦\u0097êÝ\u0013ßN6 \u0004bàt¦8@vû\u008cD6-ã\u000eØ@Fp\u0086RT\u0091 ¨ö5Í÷?\u001ff(\u001a\u0084 \u0098ë\u0017xäÁÞ1Ê\u0092\u009e\nàç}\u001fH\u0097Ç\u0096c\u0005\rÄGÉ\u0085!ÿì\u0019\u007fyH%î!®|ð\u0090\biã7yX\u0095\u0089S»)\u009f\u0091#\u008d\u0095\fû\\\u0090$Î<°è¡Ñ\u008fðm&àDcîâ+b¼\u008c+&®vX\u001b\u0007d\u008bIÓv\u008c\u0014\u0011\u001fÜB¡j\\Ù\u0093¡\u008aÅêÑWê ÝüÃ^ù+xäúÄ\u0096@C÷\t¸Oç\u007f\u000bð\u0004{\u009c\u0005\u0087¡lwâ\rx³yiímÞÙcë4÷_Z\u0001ï¸"
.length();
var27 = 144;
var36 = -1;
}

var37 = var28.substring(++var36, var36 + var27);
var10001 = 0;
}
}
}

private static NoSuchElementException a(NoSuchElementException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16666;
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
throw new RuntimeException("su/catlean/tw", var10);
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
throw new RuntimeException("su/catlean/tw" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7403;
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
throw new RuntimeException("su/catlean/tw", var14);
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
throw new RuntimeException("su/catlean/tw" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17854;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])n.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
n.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/tw", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
k[var3] = var15;
}

return k[var3];
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
throw new RuntimeException("su/catlean/tw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
