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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _f extends _g {
@NotNull
public static final _f U;
static final KProperty[] B;
@NotNull
private static final cq c;
@NotNull
private static final c8 I;
@NotNull
private static final ct K;
@NotNull
private static final ct l;
@NotNull
private static final c8 w;
@NotNull
private static final cq P;
@NotNull
private static final ct m;
@NotNull
private static final c8 i;
@NotNull
private static final c8 d;
@NotNull
private static final c8 y;
private static final long a = yz.a(-3363508769263124191L, -1191212947661654777L, MethodHandles.lookup().lookupClass()).a(32579613076829L);
private static final String[] b;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map j;

private _f(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 39723996894539L;
super(b<"c">(31658, 5056583185653765538L ^ var1), jt.c(), null, 4, null, var3);
}

private final boolean G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 97656702248356L;
return (Boolean)c.E(this, var3, B[0]);
}

private final int C(short var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
long var6 = var4 ^ 1533511107099L;
return ((Number)I.E(this, var6, B[1])).intValue();
}

private final float V(int var1, short var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 43074350830724L;
return ((Number)K.E(this, var6, B[2])).floatValue();
}

private final float Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 71892701662641L;
return ((Number)l.E(this, var3, B[3])).floatValue();
}

private final int L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 87468708589776L;
return ((Number)w.E(this, var3, B[4])).intValue();
}

private final boolean z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 87960443074939L;
return (Boolean)P.E(this, var3, B[5]);
}

private final float W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 34525140221574L;
return ((Number)m.E(this, var3, B[c<"t">(30838, 2097028989919749107L ^ var1)])).floatValue();
}

public final int e(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 2378000892005L;
int[] var5 = vm.a<"Å">(-3636053042939604636L, var1);

try {
int var10000 = ((Number)i.E(this, var3, B[c<"t">(4539, 8527495913182491866L ^ var1)])).intValue();
if (vm.a<"Å">(-3661195245162277983L, var1) != null) {
vm.a<"Å">(new int[3], -3619447028670930686L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -3638877783304251699L, var1);
}
}

public final int H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 94510498671608L;
int[] var5 = vm.a<"Å">(-6478583262677681415L, var1);

try {
int var10000 = ((Number)d.E(this, var3, B[c<"t">(14196, 4100606785139816841L ^ var1)])).intValue();
if (var5 != null) {
vm.a<"Å">(new _g[3], -6423360998858838810L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -6476936907929174704L, var1);
}
}

private final int n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 22798555662124L;
return ((Number)y.E(this, var3, B[c<"t">(26244, 5380948677752276144L ^ var1)])).intValue();
}

@Flow
private final void S(PlayerUpdateEvent var1) {
long var2 = a ^ 62384814750423L;
long var4 = var2 ^ 8081653167538L;
long var6 = (var2 ^ 29225026799945L) >>> 16;
int var8 = (int)((var2 ^ 29225026799945L) << 48 >>> 48);
long var9 = var2 ^ 10700061473563L;
long var11 = var2 ^ 14816371616070L;
int[] var13 = vm.a<"Å">(-1253068527986314638L, var2);

try {
if (!_a.n.f(var11)) {
return;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, -1254804201009383973L, var2);
}

class_2338 var14 = this.B(var6, (char)var8);

class_2338 var10000;
try {
label43: {
if (var13 == null) {
var10000 = var14;
if (var14 != null) {
break label43;
}
}

return;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -1254804201009383973L, var2);
}

class_2338 var15 = var10000;
boolean var16 = false;
class_243 var20 = var15.method_10074().method_46558();
Intrinsics.checkNotNullExpressionValue(var20, b<"c">(17417, 2343153396989051127L ^ var2));
class_243 var17 = var20;
_8.P.O(var4, _w.W.I(var17, var9).n(z3.FORCE), 0);
}

@Flow(
priority = -10
)
private final void q(MoveEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_f.a J
// 003: ldc2_w 26805561343615
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 50413832337585
// 00d: lxor
// 00e: dup2
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 8
// 018: lshl
// 019: bipush 8
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 64082054581729
// 023: lxor
// 024: dup2
// 025: bipush 16
// 027: lushr
// 028: lstore 7
// 02a: dup2
// 02b: bipush 48
// 02d: lshl
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 9
// 034: pop2
// 035: dup2
// 036: ldc2_w 78920487800061
// 039: lxor
// 03a: lstore 10
// 03c: dup2
// 03d: ldc2_w 25694572989184
// 040: lxor
// 041: lstore 12
// 043: dup2
// 044: ldc2_w 136602866233070
// 047: lxor
// 048: dup2
// 049: bipush 48
// 04b: lushr
// 04c: l2i
// 04d: istore 14
// 04f: dup2
// 050: bipush 16
// 052: lshl
// 053: bipush 32
// 055: lushr
// 056: l2i
// 057: istore 15
// 059: dup2
// 05a: bipush 48
// 05c: lshl
// 05d: bipush 48
// 05f: lushr
// 060: l2i
// 061: istore 16
// 063: pop2
// 064: dup2
// 065: ldc2_w 50189039562222
// 068: lxor
// 069: lstore 17
// 06b: dup2
// 06c: ldc2_w 86400144767152
// 06f: lxor
// 070: lstore 19
// 072: pop2
// 073: ldc2_w 3041077690848884442
// 076: lload 2
// 077: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: astore 21
// 07e: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 081: lload 17
// 083: invokevirtual su/catlean/_a.f (J)Z
// 086: ifeq 094
// 089: return
// 08a: ldc2_w 3043917565603885427
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: aload 0
// 095: lload 7
// 097: iload 9
// 099: i2c
// 09a: invokespecial su/catlean/_f.B (JC)Lnet/minecraft/class_2338;
// 09d: astore 22
// 09f: aload 21
// 0a1: ifnonnull 18a
// 0a4: aload 22
// 0a6: dup
// 0a7: ifnull 189
// 0aa: goto 0b7
// 0ad: ldc2_w 3043917565603885427
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: astore 23
// 0b9: bipush 0
// 0ba: istore 24
// 0bc: aload 23
// 0be: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 0c1: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0c4: dup
// 0c5: sipush 19372
// 0c8: ldc2_w 974193850018499581
// 0cb: lload 2
// 0cc: lxor
// 0cd: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d5: astore 25
// 0d7: aload 25
// 0d9: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 0dc: lload 19
// 0de: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e1: iload 4
// 0e3: i2b
// 0e4: swap
// 0e5: lload 5
// 0e7: dup2_x1
// 0e8: pop2
// 0e9: checkcast net/minecraft/class_1297
// 0ec: invokevirtual su/catlean/_f.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0ef: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 0f2: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
// 0f5: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 0f8: iload 14
// 0fa: i2c
// 0fb: iload 15
// 0fd: iload 16
// 0ff: i2c
// 100: invokespecial su/catlean/_f.p (CIC)D
// 103: aload 25
// 105: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 108: lload 19
// 10a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10d: iload 4
// 10f: i2b
// 110: swap
// 111: lload 5
// 113: dup2_x1
// 114: pop2
// 115: checkcast net/minecraft/class_1297
// 118: invokevirtual su/catlean/_f.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 11b: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 11e: invokestatic java/lang/Math.min (DD)D
// 121: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 124: dup
// 125: sipush 27874
// 128: ldc2_w 6904470290088176818
// 12b: lload 2
// 12c: lxor
// 12d: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 135: astore 26
// 137: aload 1
// 138: aload 26
// 13a: getfield net/minecraft/class_243.field_1352 D
// 13d: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 140: aload 1
// 141: aload 26
// 143: getfield net/minecraft/class_243.field_1350 D
// 146: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 149: aload 1
// 14a: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 14d: aload 21
// 14f: ifnonnull 186
// 152: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 155: lload 12
// 157: invokespecial su/catlean/_f.z (J)Z
// 15a: ifeq 185
// 15d: goto 16a
// 160: ldc2_w 3043917565603885427
// 163: lload 2
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 16d: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 170: lload 10
// 172: invokespecial su/catlean/_f.W (J)F
// 175: invokevirtual su/catlean/tq.x (F)V
// 178: goto 185
// 17b: ldc2_w 3043917565603885427
// 17e: lload 2
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: nop
// 186: goto 18b
// 189: pop
// 18a: nop
// 18b: return
}

private final class_2338 B(long param1, char param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: bipush 16
// 003: lshl
// 004: iload 3
// 005: i2l
// 006: bipush 48
// 008: lshl
// 009: bipush 48
// 00b: lushr
// 00c: lor
// 00d: getstatic su/catlean/_f.a J
// 010: lxor
// 011: lstore 4
// 013: lload 4
// 015: dup2
// 016: ldc2_w 136408598569200
// 019: lxor
// 01a: dup2
// 01b: bipush 56
// 01d: lushr
// 01e: l2i
// 01f: istore 6
// 021: dup2
// 022: bipush 8
// 024: lshl
// 025: bipush 8
// 027: lushr
// 028: lstore 7
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 128666764717508
// 02f: lxor
// 030: lstore 9
// 032: dup2
// 033: ldc2_w 8853772036129
// 036: lxor
// 037: dup2
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 11
// 03e: dup2
// 03f: bipush 16
// 041: lshl
// 042: bipush 16
// 044: lushr
// 045: lstore 12
// 047: pop2
// 048: dup2
// 049: ldc2_w 89855421927326
// 04c: lxor
// 04d: lstore 14
// 04f: dup2
// 050: ldc2_w 90480055578000
// 053: lxor
// 054: dup2
// 055: bipush 32
// 057: lushr
// 058: l2i
// 059: istore 16
// 05b: dup2
// 05c: bipush 32
// 05e: lshl
// 05f: bipush 56
// 061: lushr
// 062: l2i
// 063: istore 17
// 065: dup2
// 066: bipush 40
// 068: lshl
// 069: bipush 40
// 06b: lushr
// 06c: l2i
// 06d: istore 18
// 06f: pop2
// 070: dup2
// 071: ldc2_w 32797750373654
// 074: lxor
// 075: lstore 19
// 077: dup2
// 078: ldc2_w 12377196816991
// 07b: lxor
// 07c: lstore 21
// 07e: dup2
// 07f: ldc2_w 43655306123795
// 082: lxor
// 083: lstore 23
// 085: dup2
// 086: ldc2_w 53967535821568
// 089: lxor
// 08a: lstore 25
// 08c: dup2
// 08d: ldc2_w 101827521413570
// 090: lxor
// 091: lstore 27
// 093: dup2
// 094: ldc2_w 34485927239921
// 097: lxor
// 098: lstore 29
// 09a: pop2
// 09b: ldc2_w -5587483046749720933
// 09e: lload 4
// 0a0: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: aload 0
// 0a6: lload 29
// 0a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ab: iload 6
// 0ad: i2b
// 0ae: swap
// 0af: lload 7
// 0b1: dup2_x1
// 0b2: pop2
// 0b3: checkcast net/minecraft/class_1297
// 0b6: invokevirtual su/catlean/_f.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0b9: checkcast net/minecraft/class_2374
// 0bc: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0bf: dup
// 0c0: sipush 28988
// 0c3: ldc2_w 5669295898047293748
// 0c6: lload 4
// 0c8: lxor
// 0c9: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d1: astore 32
// 0d3: astore 31
// 0d5: lload 29
// 0d7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0da: invokevirtual net/minecraft/class_746.method_36455 ()F
// 0dd: aload 0
// 0de: iload 11
// 0e0: i2s
// 0e1: lload 12
// 0e3: invokespecial su/catlean/_f.C (SJ)I
// 0e6: i2f
// 0e7: fcmpg
// 0e8: aload 31
// 0ea: ifnonnull 115
// 0ed: ifge 10b
// 0f0: goto 0fe
// 0f3: ldc2_w -5584609566827828942
// 0f6: lload 4
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: aconst_null
// 0ff: areturn
// 100: ldc2_w -5584609566827828942
// 103: lload 4
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: getstatic su/catlean/wc.g Lsu/catlean/wc;
// 10e: aload 32
// 110: lload 9
// 112: invokevirtual su/catlean/wc.d (Lnet/minecraft/class_2338;J)Z
// 115: aload 31
// 117: ifnonnull 152
// 11a: ifeq 15d
// 11d: goto 12b
// 120: ldc2_w -5584609566827828942
// 123: lload 4
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: aload 0
// 12c: aload 31
// 12e: ifnonnull 156
// 131: goto 13f
// 134: ldc2_w -5584609566827828942
// 137: lload 4
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: lload 14
// 141: invokespecial su/catlean/_f.G (J)Z
// 144: goto 152
// 147: ldc2_w -5584609566827828942
// 14a: lload 4
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: ifeq 15b
// 155: aload 0
// 156: lload 25
// 158: invokevirtual su/catlean/_f.d (J)V
// 15b: aconst_null
// 15c: areturn
// 15d: new java/util/ArrayList
// 160: dup
// 161: invokespecial java/util/ArrayList.<init> ()V
// 164: checkcast java/util/List
// 167: astore 33
// 169: aload 32
// 16b: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 16e: aload 0
// 16f: lload 21
// 171: invokevirtual su/catlean/_f.e (J)I
// 174: isub
// 175: istore 34
// 177: aload 32
// 179: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 17c: aload 0
// 17d: lload 21
// 17f: invokevirtual su/catlean/_f.e (J)I
// 182: iadd
// 183: istore 35
// 185: iload 34
// 187: lload 1
// 188: lconst_0
// 189: lcmp
// 18a: ifle 1bf
// 18d: iload 35
// 18f: aload 31
// 191: ifnonnull 1be
// 194: if_icmpgt 347
// 197: goto 1a5
// 19a: ldc2_w -5584609566827828942
// 19d: lload 4
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: aload 32
// 1a7: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 1aa: aload 0
// 1ab: lload 21
// 1ad: invokevirtual su/catlean/_f.e (J)I
// 1b0: goto 1be
// 1b3: ldc2_w -5584609566827828942
// 1b6: lload 4
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: isub
// 1bf: istore 36
// 1c1: aload 32
// 1c3: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 1c6: aload 0
// 1c7: lload 21
// 1c9: invokevirtual su/catlean/_f.e (J)I
// 1cc: iadd
// 1cd: istore 37
// 1cf: iload 36
// 1d1: lload 1
// 1d2: lconst_0
// 1d3: lcmp
// 1d4: iflt 326
// 1d7: iload 37
// 1d9: if_icmpgt 324
// 1dc: aload 32
// 1de: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 1e1: aload 0
// 1e2: lload 27
// 1e4: invokevirtual su/catlean/_f.H (J)I
// 1e7: isub
// 1e8: istore 38
// 1ea: aload 32
// 1ec: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 1ef: istore 39
// 1f1: iload 38
// 1f3: iload 39
// 1f5: aload 31
// 1f7: ifnonnull 328
// 1fa: if_icmpgt 2ea
// 1fd: new net/minecraft/class_2338
// 200: dup
// 201: iload 34
// 203: iload 38
// 205: iload 36
// 207: invokespecial net/minecraft/class_2338.<init> (III)V
// 20a: astore 41
// 20c: aload 41
// 20e: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 211: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 214: dup
// 215: sipush 17417
// 218: ldc2_w 2343275385943759902
// 21b: lload 4
// 21d: lxor
// 21e: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 226: astore 42
// 228: getstatic su/catlean/la.l Lsu/catlean/la;
// 22b: lload 23
// 22d: aload 42
// 22f: invokevirtual su/catlean/la.c (JLnet/minecraft/class_243;)Z
// 232: istore 44
// 234: iload 44
// 236: aload 31
// 238: ifnonnull 2ec
// 23b: ifeq 2b0
// 23e: getstatic su/catlean/wc.g Lsu/catlean/wc;
// 241: aload 41
// 243: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 246: dup
// 247: sipush 196
// 24a: ldc2_w 5842520014075517135
// 24d: lload 4
// 24f: lxor
// 250: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_f.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 255: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 258: lload 9
// 25a: invokevirtual su/catlean/wc.d (Lnet/minecraft/class_2338;J)Z
// 25d: aload 31
// 25f: ifnonnull 2b2
// 262: goto 270
// 265: ldc2_w -5584609566827828942
// 268: lload 4
// 26a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26f: athrow
// 270: iload 3
// 271: iflt 2b2
// 274: aload 31
// 276: ifnonnull 2b2
// 279: goto 287
// 27c: ldc2_w -5584609566827828942
// 27f: lload 4
// 281: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 286: athrow
// 287: ifeq 2b0
// 28a: goto 298
// 28d: ldc2_w -5584609566827828942
// 290: lload 4
// 292: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 297: athrow
// 298: aload 33
// 29a: aload 41
// 29c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 2a1: pop
// 2a2: goto 2b0
// 2a5: ldc2_w -5584609566827828942
// 2a8: lload 4
// 2aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2af: athrow
// 2b0: iload 38
// 2b2: iload 39
// 2b4: aload 31
// 2b6: lload 1
// 2b7: lconst_0
// 2b8: lcmp
// 2b9: ifle 2f6
// 2bc: ifnonnull 2ee
// 2bf: if_icmpeq 2ea
// 2c2: goto 2d0
// 2c5: ldc2_w -5584609566827828942
// 2c8: lload 4
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: iinc 38 1
// 2d3: aload 31
// 2d5: ifnull 1fd
// 2d8: iload 3
// 2d9: iflt 2b0
// 2dc: goto 2ea
// 2df: ldc2_w -5584609566827828942
// 2e2: lload 4
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: iload 36
// 2ec: iload 37
// 2ee: lload 1
// 2ef: lconst_0
// 2f0: lcmp
// 2f1: iflt 328
// 2f4: aload 31
// 2f6: ifnonnull 328
// 2f9: if_icmpeq 324
// 2fc: goto 30a
// 2ff: ldc2_w -5584609566827828942
// 302: lload 4
// 304: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 309: athrow
// 30a: iinc 36 1
// 30d: aload 31
// 30f: ifnull 1dc
// 312: iload 3
// 313: iflt 2ea
// 316: goto 324
// 319: ldc2_w -5584609566827828942
// 31c: lload 4
// 31e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 323: athrow
// 324: iload 34
// 326: iload 35
// 328: if_icmpeq 347
// 32b: iinc 34 1
// 32e: aload 31
// 330: ifnull 1a5
// 333: lload 1
// 334: lconst_0
// 335: lcmp
// 336: iflt 1cf
// 339: goto 347
// 33c: ldc2_w -5584609566827828942
// 33f: lload 4
// 341: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 346: athrow
// 347: aload 33
// 349: checkcast java/lang/Iterable
// 34c: astore 35
// 34e: bipush 0
// 34f: istore 36
// 351: aload 35
// 353: astore 37
// 355: new java/util/ArrayList
// 358: dup
// 359: invokespecial java/util/ArrayList.<init> ()V
// 35c: checkcast java/util/Collection
// 35f: astore 38
// 361: bipush 0
// 362: istore 39
// 364: aload 37
// 366: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 36b: astore 41
// 36d: aload 41
// 36f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 374: ifeq 3e7
// 377: aload 41
// 379: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 37e: astore 42
// 380: aload 42
// 382: checkcast net/minecraft/class_2338
// 385: astore 44
// 387: bipush 0
// 388: istore 45
// 38a: iload 3
// 38b: iflt 3fa
// 38e: getstatic su/catlean/u_.c Lsu/catlean/u_;
// 391: iload 16
// 393: iload 17
// 395: i2b
// 396: aload 44
// 398: iload 18
// 39a: invokevirtual su/catlean/u_.l (IBLnet/minecraft/class_2338;I)F
// 39d: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 3a0: lload 19
// 3a2: invokespecial su/catlean/_f.n (J)I
// 3a5: i2f
// 3a6: fcmpg
// 3a7: aload 31
// 3a9: ifnonnull 3f8
// 3ac: aload 31
// 3ae: ifnonnull 3d1
// 3b1: goto 3bf
// 3b4: ldc2_w -5584609566827828942
// 3b7: lload 4
// 3b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3be: athrow
// 3bf: ifgt 3d4
// 3c2: goto 3d0
// 3c5: ldc2_w -5584609566827828942
// 3c8: lload 4
// 3ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cf: athrow
// 3d0: bipush 1
// 3d1: goto 3d5
// 3d4: bipush 0
// 3d5: ifeq 36d
// 3d8: aload 38
// 3da: aload 42
// 3dc: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 3e1: pop
// 3e2: aload 31
// 3e4: ifnull 36d
// 3e7: aload 38
// 3e9: checkcast java/util/List
// 3ec: nop
// 3ed: checkcast java/lang/Iterable
// 3f0: astore 35
// 3f2: nop
// 3f3: iload 3
// 3f4: ifle 3fa
// 3f7: bipush 0
// 3f8: istore 36
// 3fa: aload 35
// 3fc: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 401: astore 37
// 403: aload 37
// 405: invokeinterface java/util/Iterator.hasNext ()Z 1
// 40a: iload 3
// 40b: iflt 456
// 40e: aload 31
// 410: ifnonnull 456
// 413: ifne 433
// 416: goto 424
// 419: ldc2_w -5584609566827828942
// 41c: lload 4
// 41e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 423: athrow
// 424: aconst_null
// 425: goto 4ef
// 428: ldc2_w -5584609566827828942
// 42b: lload 4
// 42d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 432: athrow
// 433: aload 37
// 435: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 43a: astore 38
// 43c: aload 37
// 43e: aload 31
// 440: ifnonnull 46b
// 443: invokeinterface java/util/Iterator.hasNext ()Z 1
// 448: goto 456
// 44b: ldc2_w -5584609566827828942
// 44e: lload 4
// 450: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 455: athrow
// 456: ifne 469
// 459: aload 38
// 45b: goto 4ef
// 45e: ldc2_w -5584609566827828942
// 461: lload 4
// 463: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 468: athrow
// 469: aload 38
// 46b: checkcast net/minecraft/class_2338
// 46e: astore 39
// 470: bipush 0
// 471: istore 41
// 473: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 476: lload 29
// 478: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 47b: iload 6
// 47d: i2b
// 47e: swap
// 47f: lload 7
// 481: dup2_x1
// 482: pop2
// 483: checkcast net/minecraft/class_1297
// 486: invokevirtual su/catlean/_f.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 489: aload 39
// 48b: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 48e: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 491: dstore 39
// 493: aload 37
// 495: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 49a: astore 41
// 49c: aload 41
// 49e: checkcast net/minecraft/class_2338
// 4a1: astore 42
// 4a3: bipush 0
// 4a4: istore 44
// 4a6: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 4a9: lload 29
// 4ab: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4ae: iload 6
// 4b0: i2b
// 4b1: swap
// 4b2: lload 7
// 4b4: dup2_x1
// 4b5: pop2
// 4b6: checkcast net/minecraft/class_1297
// 4b9: invokevirtual su/catlean/_f.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 4bc: aload 42
// 4be: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 4c1: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 4c4: dstore 42
// 4c6: dload 39
// 4c8: dload 42
// 4ca: invokestatic java/lang/Double.compare (DD)I
// 4cd: ifle 4d8
// 4d0: aload 41
// 4d2: astore 38
// 4d4: dload 42
// 4d6: dstore 39
// 4d8: aload 37
// 4da: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4df: ifne 493
// 4e2: aload 31
// 4e4: lload 1
// 4e5: lconst_0
// 4e6: lcmp
// 4e7: ifle 4d2
// 4ea: ifnonnull 4d4
// 4ed: aload 38
// 4ef: checkcast net/minecraft/class_2338
// 4f2: astore 34
// 4f4: iload 3
// 4f5: ifle 525
// 4f8: aload 31
// 4fa: ifnonnull 525
// 4fd: aload 34
// 4ff: dup
// 500: ifnonnull 612
// 503: goto 511
// 506: ldc2_w -5584609566827828942
// 509: lload 4
// 50b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 510: athrow
// 511: pop
// 512: aload 33
// 514: checkcast java/lang/Iterable
// 517: astore 35
// 519: bipush 0
// 51a: istore 36
// 51c: aload 35
// 51e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 523: astore 37
// 525: aload 37
// 527: invokeinterface java/util/Iterator.hasNext ()Z 1
// 52c: iload 3
// 52d: iflt 578
// 530: aload 31
// 532: ifnonnull 578
// 535: ifne 555
// 538: goto 546
// 53b: ldc2_w -5584609566827828942
// 53e: lload 4
// 540: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 545: athrow
// 546: aconst_null
// 547: goto 60f
// 54a: ldc2_w -5584609566827828942
// 54d: lload 4
// 54f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 554: athrow
// 555: aload 37
// 557: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 55c: astore 38
// 55e: aload 37
// 560: aload 31
// 562: ifnonnull 58d
// 565: invokeinterface java/util/Iterator.hasNext ()Z 1
// 56a: goto 578
// 56d: ldc2_w -5584609566827828942
// 570: lload 4
// 572: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 577: athrow
// 578: ifne 58b
// 57b: aload 38
// 57d: goto 60f
// 580: ldc2_w -5584609566827828942
// 583: lload 4
// 585: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58a: athrow
// 58b: aload 38
// 58d: checkcast net/minecraft/class_2338
// 590: astore 39
// 592: bipush 0
// 593: istore 41
// 595: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 598: lload 29
// 59a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 59d: iload 6
// 59f: i2b
// 5a0: swap
// 5a1: lload 7
// 5a3: dup2_x1
// 5a4: pop2
// 5a5: checkcast net/minecraft/class_1297
// 5a8: invokevirtual su/catlean/_f.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 5ab: aload 39
// 5ad: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 5b0: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 5b3: dstore 39
// 5b5: aload 37
// 5b7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5bc: astore 41
// 5be: aload 41
// 5c0: checkcast net/minecraft/class_2338
// 5c3: astore 42
// 5c5: bipush 0
// 5c6: istore 44
// 5c8: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 5cb: lload 29
// 5cd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5d0: iload 6
// 5d2: i2b
// 5d3: swap
// 5d4: lload 7
// 5d6: dup2_x1
// 5d7: pop2
// 5d8: checkcast net/minecraft/class_1297
// 5db: invokevirtual su/catlean/_f.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 5de: aload 42
// 5e0: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 5e3: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 5e6: dstore 42
// 5e8: dload 39
// 5ea: dload 42
// 5ec: invokestatic java/lang/Double.compare (DD)I
// 5ef: ifle 5fa
// 5f2: aload 41
// 5f4: astore 38
// 5f6: dload 42
// 5f8: dstore 39
// 5fa: aload 37
// 5fc: invokeinterface java/util/Iterator.hasNext ()Z 1
// 601: ifne 5b5
// 604: aload 31
// 606: iload 3
// 607: ifle 5f4
// 60a: ifnonnull 5f6
// 60d: aload 38
// 60f: checkcast net/minecraft/class_2338
// 612: areturn
}

private final double p(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var10001 = var4 ^ 114557374995889L;
int var6 = (int)((var4 ^ 114557374995889L) >>> 32);
int var7 = (int)((var4 ^ 114557374995889L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
long var9 = var4 ^ 15941344953476L;
long var11 = var4 ^ 618836539877L;

try {
if (dm.h.K() < this.L(var11) * c<"t">(13939, 8503759065420173290L ^ var4)) {
return 0.2873 * this.Y(var9);
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 1256571756797364797L, var4);
}

return 0.2873 * this.V(var6, (short)var7, (short)var8);
}

private static final boolean s() {
long var0 = a ^ 51691368819168L;
long var2 = var0 ^ 29446187055729L;
int[] var4 = vm.a<"Å">(4443684414214545733L, var0);

try {
boolean var10000 = _a.n.f(var2);
if (var4 != null) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 4440863162303981292L, var0);
}

return false;
}

private static final boolean j() {
long var0 = a ^ 52876228246077L;
long var2 = var0 ^ 6406361377196L;
int[] var4 = vm.a<"Å">(3347929868658717336L, var0);

try {
boolean var10000 = _a.n.f(var2);
if (var4 != null) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 3349555040697136433L, var0);
}

return false;
}

private static final boolean M() {
long var0 = a ^ 92927103417308L;
long var2 = var0 ^ 106931445622861L;
int[] var4 = vm.a<"Å">(3429307400230974329L, var0);

try {
boolean var10000 = _a.n.f(var2);
if (var4 != null) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 3431010655915685072L, var0);
}

return false;
}

private static final boolean T() {
long var0 = a ^ 55384610253419L;
long var2 = var0 ^ 8364720191994L;
int[] var4 = vm.a<"Å">(4476646414924554958L, var0);

try {
boolean var10000 = _a.n.f(var2);
if (var4 != null) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 4479393707565983079L, var0);
}

return false;
}

private static final boolean l() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_f.a J
// 03: ldc2_w 10025901526357
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 6738977749034
// 0d: lxor
// 0e: lstore 2
// 0f: dup2
// 10: ldc2_w 66911201484484
// 13: lxor
// 14: lstore 4
// 16: pop2
// 17: ldc2_w -7413481943635655184
// 1a: lload 0
// 1b: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: astore 6
// 22: getstatic su/catlean/_f.U Lsu/catlean/_f;
// 25: lload 2
// 26: invokespecial su/catlean/_f.z (J)Z
// 29: aload 6
// 2b: ifnonnull 53
// 2e: ifeq 6c
// 31: goto 3e
// 34: ldc2_w -7416237156062035367
// 37: lload 0
// 38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: athrow
// 3e: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 41: lload 4
// 43: invokevirtual su/catlean/_a.f (J)Z
// 46: goto 53
// 49: ldc2_w -7416237156062035367
// 4c: lload 0
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: aload 6
// 55: ifnonnull 69
// 58: ifne 6c
// 5b: goto 68
// 5e: ldc2_w -7416237156062035367
// 61: lload 0
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: bipush 1
// 69: goto 6d
// 6c: bipush 0
// 6d: ireturn
}

static {
long var20 = a ^ 46817702926260L;
long var22 = var20 ^ 83532797315720L;
long var24 = var20 ^ 136285136422086L;
long var26 = var20 ^ 92723848513952L;
long var28 = var20 ^ 52231550554662L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[36];
int var16 = 0;
String var15 = "È~A@\u008d:ÏfbÔP?ìæE¨O\u001bø\u001a½ÕÊ¸w·\u0019Þ\u0013÷Öê\u0018÷ä^£\u0018\nßçüüÍ©êºr1VÓ\"/ßÊ_¼\u0010\u001eÃ1\bGz\u0016éËü[=[q>\u009a(Ii\u008fÓÖ\u0084'éh{°úÒ\u0099ÿ\u0094å\u00942ÓÞÞ'y>ÖË¿\u001fn;§ê\u0014\u0014ðÓ\\H, ¦ãy®g\u0018ölÖêï\u0018¶\u0082ÁãoÏ\u0082\u0005+v\u0082\u00920¡}¯\u0094^û) \u009f\u0018\u008aÔkM1\u0080Á\u0015\u0099\u008eõ.î\u0092C»\u008f\u008fä?\u009eÝL²Wg\u0019oN«(\u009d²Z\u00125\t[\u009b`×ùÃî«6¤\tú=\u0088xêº·Ma\u0092\føèø ³HT¡\u000f/8\u0099(\u007fEÁý«A\u001cÑL\u0090¯¼gQ¾¹Ê\u0087ç6TÁ\u0003¡]î¬\u000e¦eÜã\u001fX\u009e.á°h¡ ¤û-9V¼§Â\u000eº\u0007\u001al#_A³\u0016^;\u008a=±\u0017AÇ7'´´\u000fÕ\u0018OÕº\u008am¿»?\u0088Mr\u0094¹¶«¶Ozð\u0016|\u008bÅm Û{êA\u0083S)\u0010éuSO«Úè§\u008d\u00adk\u0000PUò\u0087q\u0089.\u0015\u000f%Àu\u0018kÂS\u007fJ/<\u0083é\u0014\u0092\u009eè³1Ý\u001fªä©¼÷ò9\u0010P\u0003k-\u009bô\u007fg¸¨1Óíè¥\u0018 >\u0018Hj«a|\u0092ò\u0010h\u0007F\u009b\u0016'.VØRú Ë\u000e!ÈõªæMÝ\\\u0018\u0017\u009dÚ¥©\u0088âa8\u0004Z»b#«\u0007\"ÉÔ \u0088\u009d\u0001T(\u0096ÁE!\u0017\u0012\u0004ØÖ=\u001b'n_·e\u0003O0\u009bsÆ9Ftoª0\u0083{Þ\u0081 \u007f£ó\u00886Ó\b\u0018>DBd]#\u0018öï²\u000e%0Ö°ß \u0007\u0005:Ä¥W« o\u0006üïáý0ªv>³ë0\u0084I@Ó\u008eO\u007f|&îúã¿/ùåÏ\u0093A\u0018àØ\u0095mâf8k\u0080Mñ\u001f23t>u\u007f \u0081\nñfs\u0010ªÎf9\u0005B(ý»·nê\u0083\u001f\u001cU\u0018\u0093a\u001d± ºi|å2b¢\u0015Xôf\u0013\u009e B\u0093\u009e0w(ä\u0002T\u0011\u0083Õ\u001fàkËý}í\u0096ò«\u009bvE¸VÎòJ\u00880e\u008a\u0004Q\u001a.Cs\u0080\u0010k\u0007©\u001f ø\u009eÊI\u0096x.\u001f¯âuZvl<xÙ¸(\u001a+À)¨<\u0097YÄ£\b+*\u0018ÇM£\u008f#¹\u001aÙÙ\t[ú§\u0094¼\u000b·À\u0006ós¤*\u0085 Î¥\tºv«²\u0011rþº\u0007:éøâq\u0000½ÿß\u0019r½T\u0084\bê\u0089§ÿ°\u0010¡\\`z\u0098ïÎ\u008a0{\u0088Nµ\u008exä(ÓzÚô\u0098Ãíõ\u001c\u007fS0{¹\u0091î\u008ciïì0\u0016Muâ\u000b¼\u0010ÜBEýY\u0018çLÏ¢\u0004\\\u0018Ì\u0012\u0097`ò\u001cZ~~Mõ\u0091\u0095Bg\u0012àÌ[Ó\u0006,k±(£\u0005\u0095í·l\u0018\u0016ø)\u000eX\u0007jÕÃ[Y\\z,K,½\u0085%\"hóÕ2,üsF\f\u009c²ø*\u0018j¸y\u0088\u007f\u0004\u0003%ué(}£E£ZeßXX<\u0019\u0003Q +\u000fæÈ\\\u008d2L>8é\u0081\u001e\fûê\u009fÖ\u00adgYK¥õ\u0006\u0011U\u0096Mlì«(f¯ÕÆ\u0087¿&$\u0015ÑBô\u000e\u0014pÖë\u001d¼T\u0084\u0001_\u0016µ\u008d<»\u0019e¿B')\u0095Hö±V\u009a(\u009d\u008bF\tM\u001a\u0017÷p\rß¹\u0010\u0082ÿ·e¨ÖäõrÉ®Ì³ÉW\u0090\u0003\u001bh\u0004Ê²\r¥G®Ò(Dv¾\u0094¶\u009b©ó©ÉÉHÁ²§íát\u009c\u0018\u0098\u009aræ#ð¼ù5\u00866HyÒ\u0083\u0003\u0088bò\u000f";
int var17 = "È~A@\u008d:ÏfbÔP?ìæE¨O\u001bø\u001a½ÕÊ¸w·\u0019Þ\u0013÷Öê\u0018÷ä^£\u0018\nßçüüÍ©êºr1VÓ\"/ßÊ_¼\u0010\u001eÃ1\bGz\u0016éËü[=[q>\u009a(Ii\u008fÓÖ\u0084'éh{°úÒ\u0099ÿ\u0094å\u00942ÓÞÞ'y>ÖË¿\u001fn;§ê\u0014\u0014ðÓ\\H, ¦ãy®g\u0018ölÖêï\u0018¶\u0082ÁãoÏ\u0082\u0005+v\u0082\u00920¡}¯\u0094^û) \u009f\u0018\u008aÔkM1\u0080Á\u0015\u0099\u008eõ.î\u0092C»\u008f\u008fä?\u009eÝL²Wg\u0019oN«(\u009d²Z\u00125\t[\u009b`×ùÃî«6¤\tú=\u0088xêº·Ma\u0092\føèø ³HT¡\u000f/8\u0099(\u007fEÁý«A\u001cÑL\u0090¯¼gQ¾¹Ê\u0087ç6TÁ\u0003¡]î¬\u000e¦eÜã\u001fX\u009e.á°h¡ ¤û-9V¼§Â\u000eº\u0007\u001al#_A³\u0016^;\u008a=±\u0017AÇ7'´´\u000fÕ\u0018OÕº\u008am¿»?\u0088Mr\u0094¹¶«¶Ozð\u0016|\u008bÅm Û{êA\u0083S)\u0010éuSO«Úè§\u008d\u00adk\u0000PUò\u0087q\u0089.\u0015\u000f%Àu\u0018kÂS\u007fJ/<\u0083é\u0014\u0092\u009eè³1Ý\u001fªä©¼÷ò9\u0010P\u0003k-\u009bô\u007fg¸¨1Óíè¥\u0018 >\u0018Hj«a|\u0092ò\u0010h\u0007F\u009b\u0016'.VØRú Ë\u000e!ÈõªæMÝ\\\u0018\u0017\u009dÚ¥©\u0088âa8\u0004Z»b#«\u0007\"ÉÔ \u0088\u009d\u0001T(\u0096ÁE!\u0017\u0012\u0004ØÖ=\u001b'n_·e\u0003O0\u009bsÆ9Ftoª0\u0083{Þ\u0081 \u007f£ó\u00886Ó\b\u0018>DBd]#\u0018öï²\u000e%0Ö°ß \u0007\u0005:Ä¥W« o\u0006üïáý0ªv>³ë0\u0084I@Ó\u008eO\u007f|&îúã¿/ùåÏ\u0093A\u0018àØ\u0095mâf8k\u0080Mñ\u001f23t>u\u007f \u0081\nñfs\u0010ªÎf9\u0005B(ý»·nê\u0083\u001f\u001cU\u0018\u0093a\u001d± ºi|å2b¢\u0015Xôf\u0013\u009e B\u0093\u009e0w(ä\u0002T\u0011\u0083Õ\u001fàkËý}í\u0096ò«\u009bvE¸VÎòJ\u00880e\u008a\u0004Q\u001a.Cs\u0080\u0010k\u0007©\u001f ø\u009eÊI\u0096x.\u001f¯âuZvl<xÙ¸(\u001a+À)¨<\u0097YÄ£\b+*\u0018ÇM£\u008f#¹\u001aÙÙ\t[ú§\u0094¼\u000b·À\u0006ós¤*\u0085 Î¥\tºv«²\u0011rþº\u0007:éøâq\u0000½ÿß\u0019r½T\u0084\bê\u0089§ÿ°\u0010¡\\`z\u0098ïÎ\u008a0{\u0088Nµ\u008exä(ÓzÚô\u0098Ãíõ\u001c\u007fS0{¹\u0091î\u008ciïì0\u0016Muâ\u000b¼\u0010ÜBEýY\u0018çLÏ¢\u0004\\\u0018Ì\u0012\u0097`ò\u001cZ~~Mõ\u0091\u0095Bg\u0012àÌ[Ó\u0006,k±(£\u0005\u0095í·l\u0018\u0016ø)\u000eX\u0007jÕÃ[Y\\z,K,½\u0085%\"hóÕ2,üsF\f\u009c²ø*\u0018j¸y\u0088\u007f\u0004\u0003%ué(}£E£ZeßXX<\u0019\u0003Q +\u000fæÈ\\\u008d2L>8é\u0081\u001e\fûê\u009fÖ\u00adgYK¥õ\u0006\u0011U\u0096Mlì«(f¯ÕÆ\u0087¿&$\u0015ÑBô\u000e\u0014pÖë\u001d¼T\u0084\u0001_\u0016µ\u008d<»\u0019e¿B')\u0095Hö±V\u009a(\u009d\u008bF\tM\u001a\u0017÷p\rß¹\u0010\u0082ÿ·e¨ÖäõrÉ®Ì³ÉW\u0090\u0003\u001bh\u0004Ê²\r¥G®Ò(Dv¾\u0094¶\u009b©ó©ÉÉHÁ²§íát\u009c\u0018\u0098\u009aræ#ð¼ù5\u00866HyÒ\u0083\u0003\u0088bò\u000f"
.length();
char var14 = ' ';
int var33 = -1;

label54:
while (true) {
String var34 = var15.substring(++var33, var33 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
String var45 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var45;
if ((var33 += var14) >= var17) {
b = var18;
e = new String[36];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[19];
int var3 = 0;
String var4 = "\n\u0097þ%\u0083~¢(\u0000ä¼\u0097'ÕW¿sÅ0÷°£ø9~èpwãHäã¸*ÓF\u0097ò¸\u0014\u00026\u00817a\u0093g\u008c\u0013\u0012_\u001dDè\u0016Ô¦MÕm\u0099¸ \n©bß\u008a\u0017\u0086¿ÚýÖ;Ö\u0018\u0017\u0000y\u0090jO\\er\u0089\u0098UA,øª^üä»ìu\\óN\nûÜ\u001f4|\u0096SßBqV^r8åÖâ½&\u0086\u0080:\u008a¶k7\u0092\u0006Aø\u0089{p";
int var5 = "\n\u0097þ%\u0083~¢(\u0000ä¼\u0097'ÕW¿sÅ0÷°£ø9~èpwãHäã¸*ÓF\u0097ò¸\u0014\u00026\u00817a\u0093g\u008c\u0013\u0012_\u001dDè\u0016Ô¦MÕm\u0099¸ \n©bß\u008a\u0017\u0086¿ÚýÖ;Ö\u0018\u0017\u0000y\u0090jO\\er\u0089\u0098UA,øª^üä»ìu\\óN\nûÜ\u001f4|\u0096SßBqV^r8åÖâ½&\u0086\u0080:\u008a¶k7\u0092\u0006Aø\u0089{p"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var37 = var6;
var10001 = var3++;
long var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var52 = -1;

while (true) {
long var8 = var49;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var54 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var52) {
case 0:
var37[var10001] = var54;
if (var2 >= var5) {
g = var6;
h = new Integer[19];
KProperty[] var30 = new KProperty[c<"t">(461, 5457680619181959892L ^ var20)];
var30[0] = Reflection.property1(
new PropertyReference1Impl(_f.class, b<"c">(13971, 3030835844768669440L ^ var20), b<"c">(2339, 1415974485282562227L ^ var20), 0)
);
var30[1] = Reflection.property1(
new PropertyReference1Impl(_f.class, b<"c">(21268, 8023132318458772101L ^ var20), b<"c">(10495, 6783082861427097960L ^ var20), 0)
);
var30[2] = Reflection.property1(new PropertyReference1Impl(_f.class, b<"c">(3490, 8797349761368269843L ^ var20), b<"c">(1257, 5174291043072814436L ^ var20), 0));
var30[3] = Reflection.property1(new PropertyReference1Impl(_f.class, b<"c">(3477, 6961865060079903760L ^ var20), b<"c">(6639, 6244707810463363187L ^ var20), 0));
var30[4] = Reflection.property1(new PropertyReference1Impl(_f.class, b<"c">(8050, 5496275256620660478L ^ var20), b<"c">(13508, 588885879583415629L ^ var20), 0));
var30[5] = Reflection.property1(
new PropertyReference1Impl(_f.class, b<"c">(24935, 3389650231713745120L ^ var20), b<"c">(13023, 5299641556606950235L ^ var20), 0)
);
var30[c<"t">(31126, 463339635576312461L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_f.class, b<"c">(2714, 1128124097611932458L ^ var20), b<"c">(27688, 1969565457665508775L ^ var20), 0)
);
var30[c<"t">(18342, 2231810007244876982L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_f.class, b<"c">(25067, 4106435611549091937L ^ var20), b<"c">(30492, 3361488942465801866L ^ var20), 0)
);
var30[c<"t">(6030, 7038608588331416728L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_f.class, b<"c">(23019, 7463958462406291563L ^ var20), b<"c">(1551, 5365898265057701764L ^ var20), 0)
);
var30[c<"t">(17226, 8100158524606261341L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(_f.class, b<"c">(14338, 5467161061786882433L ^ var20), b<"c">(18581, 904114307462816038L ^ var20), 0)
);
B = var30;
U = new _f(var28);
c = yp.t(U, b<"c">(24010, 3474904353358836831L ^ var20), false, var24, null, null, c<"t">(18639, 1861769470092125149L ^ var20), null);
I = yp.L(
U,
b<"c">(20031, 5537006346160727968L ^ var20),
c<"t">(30645, 5386421944128380095L ^ var20),
new IntRange(0, c<"t">(11164, 5922803921658527878L ^ var20)),
var26,
null,
null,
c<"t">(9135, 4407693052497873060L ^ var20),
null
);
K = yp.k(
U, b<"c">(20595, 8060317429551659498L ^ var20), 2.0F, var22, RangesKt.rangeTo(0.1F, 5.0F), null, _f::s, c<"t">(14196, 4100558265527327841L ^ var20), null
);
l = yp.k(
U, b<"c">(3587, 1292606646958892977L ^ var20), 1.0F, var22, RangesKt.rangeTo(0.1F, 5.0F), null, _f::j, c<"t">(14196, 4100558265527327841L ^ var20), null
);
w = yp.L(
U,
b<"c">(8281, 6228602186552740319L ^ var20),
c<"t">(4023, 1731399003656316073L ^ var20),
new IntRange(1, c<"t">(31154, 4468713977893851818L ^ var20)),
var26,
null,
_f::M,
c<"t">(14196, 4100558265527327841L ^ var20),
null
);
P = yp.t(U, b<"c">(21334, 5610702254998813390L ^ var20), false, var24, null, _f::T, 4, null);
m = yp.k(
U, b<"c">(26211, 2464525129324384235L ^ var20), 1.0F, var22, RangesKt.rangeTo(1.0F, 10.0F), null, _f::l, c<"t">(14196, 4100558265527327841L ^ var20), null
);
i = yp.L(U, b<"c">(17410, 6152626090113166742L ^ var20), 3, new IntRange(1, 3), var26, null, null, c<"t">(674, 6992445389868296637L ^ var20), null);
d = yp.L(U, b<"c">(31966, 7942760275596334400L ^ var20), 3, new IntRange(1, 3), var26, null, null, c<"t">(674, 6992445389868296637L ^ var20), null);
y = yp.L(
U,
b<"c">(22964, 8097182063848747046L ^ var20),
c<"t">(14108, 6092107813303540749L ^ var20),
new IntRange(c<"t">(4023, 1731399003656316073L ^ var20), c<"t">(9093, 8510163303841482904L ^ var20)),
var26,
null,
null,
c<"t">(674, 6992445389868296637L ^ var20),
null
);
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "Sö¹NwÕW^Õ\u0014\u000eô\u0088|oZ";
var5 = "Sö¹NwÕW^Õ\u0014\u000eô\u0088|oZ".length();
var2 = 0;
}

byte var43 = var2;
var2 += 8;
var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
var37 = var6;
var10001 = var3++;
var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var52 = 0;
}
}
}

var14 = var15.charAt(var33);
break;
default:
var18[var16++] = var45;
if ((var33 += var14) < var17) {
var14 = var15.charAt(var33);
continue label54;
}

var15 = "éjHï'#º\u001f?>lÐ7\u0006 zµ¡[\u00adÔ\rÃÐ\u00932Õ\u0088\u009e¡wO \u0081\f\u0091Gïéº\t]ÈÁ\u0095\u0017½b\u0095Ü\u001aL³p\u0086\u0015º´¸Åðªº\u0090\u0019";
var17 = "éjHï'#º\u001f?>lÐ7\u0006 zµ¡[\u00adÔ\rÃÐ\u00932Õ\u0088\u009e¡wO \u0081\f\u0091Gïéº\t]ÈÁ\u0095\u0017½b\u0095Ü\u001aL³p\u0086\u0015º´¸Åðªº\u0090\u0019"
.length();
var14 = ' ';
var33 = -1;
}

var34 = var15.substring(++var33, var33 + var14);
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27527;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_f", var10);
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
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/_f" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 10510;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/_f", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
throw new RuntimeException("su/catlean/_f" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
