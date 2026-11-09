package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import net.minecraft.class_744;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class us extends _g {
@NotNull
public static final us z;
static final KProperty[] P;
@NotNull
private static final c8 G;
@NotNull
private static final cw K;
@NotNull
private static final cw b;
@NotNull
private static final av J;
@NotNull
private static final cq X;
@NotNull
private static final cq U;
@NotNull
private static final cq e;
@NotNull
private static final cq W;
@NotNull
private static final ct k;
@NotNull
private static final cp E;
@NotNull
private static final cq D;
@NotNull
private static final cq u;
@NotNull
private static final cq A;
@NotNull
private static class_243 m;
private static float t;
private static boolean L;
@NotNull
private static final Queue x;
@NotNull
private static final Queue S;
@NotNull
private static final AtomicBoolean j;
@Nullable
private static class_744 I;
@Nullable
private static class_243 N;
private static boolean Y;
private static String f;
private static final long a = yz.a(-5759693261412699404L, 2153976218910887908L, MethodHandles.lookup().lookupClass()).a(234038455752378L);
private static final String[] c;
private static final String[] d;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map l;

private us(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 79110471084890L;
super(b<"m">(13759, 4030934436046796956L ^ var1), jt.V(), null, 4, null, var3);
}

private final int j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 4341728538526L;
return ((Number)G.E(this, var3, P[0])).intValue();
}

private final void q(int var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 125020909963455L;
G.b(this, var4, P[0], var1);
}

@NotNull
public final st I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 36544545785413L;
return (st)K.E(this, var3, P[1]);
}

public final void o(@NotNull st <set-?>, long a) {
ax = a ^ ax;
long var4 = ax ^ 29562464741469L;
_g[] var10000 = vm.a<"Å">(8263241049007031219L, ax);
Intrinsics.checkNotNullParameter(<set-?>, b<"m">(25409, 5083029362463499840L ^ ax));
_g[] var6 = var10000;

try {
K.b(this, var4, P[1], <set-?>);
if (var6 != null) {
vm.a<"Å">(new _g[3], 8255900584660727983L, ax);
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 8252757140786123456L, ax);
}
}

private final st F(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 133008391981856L;
return (st)b.E(this, var3, P[2]);
}

private final void K(st var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 88418333295434L;
b.b(this, var4, P[2], var1);
}

private final lj x(int var1, int var2, byte var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 65504123451208L;
return (lj)J.E(this, var6, P[3]);
}

private final boolean P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 83974257933629L;
return (Boolean)X.E(this, var3, P[4]);
}

private final boolean T(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 89693239676644L;
return (Boolean)U.E(this, var6, P[5]);
}

private final boolean t(long var1, int var3) {
long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 5348283000833L;
return (Boolean)e.E(this, var6, P[c<"p">(28325, 722191188276409983L ^ var4)]);
}

private final boolean W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 6858251927420L;
return (Boolean)W.E(this, var3, P[c<"p">(16467, 4884929950607020027L ^ var1)]);
}

private final float L(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 117292527748558L;
return ((Number)k.E(this, var3, P[c<"p">(826, 7614086203533866536L ^ var1)])).floatValue();
}

private final h a(int var1, int var2) {
long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ a;
long var5 = var3 ^ 32173917074570L;
return (h)E.E(this, var5, P[c<"p">(10163, 7748151746966217725L ^ var3)]);
}

private final boolean s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 92886625532823L;
return (Boolean)D.E(this, var3, P[c<"p">(17344, 2217758102071396485L ^ var1)]);
}

private final boolean C(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 32924037248929L;
return (Boolean)u.E(this, var3, P[c<"p">(17643, 5595913485486392220L ^ var1)]);
}

private final boolean w(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 110170944721583L;
return (Boolean)A.E(this, var6, P[c<"p">(19352, 758557838379264497L ^ var4)]);
}

@Nullable
public final class_243 l() {
return N;
}

public final void t(@Nullable class_243 <set-?>) {
N = <set-?>;
}

@Override
public void O(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 32978412894279
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 103451004335712
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 8
// 016: lshl
// 017: bipush 8
// 019: lushr
// 01a: lstore 6
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 78664982282145
// 021: lxor
// 022: lstore 8
// 024: dup2
// 025: ldc2_w 20975573779856
// 028: lxor
// 029: lstore 10
// 02b: dup2
// 02c: ldc2_w 67464996320865
// 02f: lxor
// 030: lstore 12
// 032: pop2
// 033: ldc2_w 2600690300495713544
// 036: lload 1
// 037: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: astore 14
// 03e: aload 14
// 040: ifnonnull 0cb
// 043: lload 3
// 044: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 047: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 04a: ifnull 0b8
// 04d: goto 05a
// 050: ldc2_w 2611174216455963771
// 053: lload 1
// 054: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 059: athrow
// 05a: lload 3
// 05b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 05e: lload 1
// 05f: lconst_0
// 060: lcmp
// 061: ifle 09a
// 064: aload 14
// 066: ifnonnull 09a
// 069: goto 076
// 06c: ldc2_w 2611174216455963771
// 06f: lload 1
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 079: ifnull 0b8
// 07c: goto 089
// 07f: ldc2_w 2611174216455963771
// 082: lload 1
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: lload 3
// 08a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08d: goto 09a
// 090: ldc2_w 2611174216455963771
// 093: lload 1
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: invokevirtual net/minecraft/class_310.method_1496 ()Z
// 09d: aload 14
// 09f: lload 1
// 0a0: lconst_0
// 0a1: lcmp
// 0a2: iflt 0dc
// 0a5: ifnonnull 0da
// 0a8: ifeq 0cc
// 0ab: goto 0b8
// 0ae: ldc2_w 2611174216455963771
// 0b1: lload 1
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: lload 10
// 0bb: invokevirtual su/catlean/us.d (J)V
// 0be: goto 0cb
// 0c1: ldc2_w 2611174216455963771
// 0c4: lload 1
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: return
// 0cc: getstatic su/catlean/us.S Ljava/util/Queue;
// 0cf: invokeinterface java/util/Queue.clear ()V 1
// 0d4: aload 0
// 0d5: lload 8
// 0d7: invokespecial su/catlean/us.W (J)Z
// 0da: aload 14
// 0dc: ifnonnull 142
// 0df: ifne 113
// 0e2: goto 0ef
// 0e5: ldc2_w 2611174216455963771
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: aload 0
// 0f0: lload 12
// 0f2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f5: iload 5
// 0f7: i2b
// 0f8: swap
// 0f9: lload 6
// 0fb: dup2_x1
// 0fc: pop2
// 0fd: checkcast net/minecraft/class_1297
// 100: invokevirtual su/catlean/us.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 103: putstatic su/catlean/us.N Lnet/minecraft/class_243;
// 106: goto 113
// 109: ldc2_w 2611174216455963771
// 10c: lload 1
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: lload 12
// 115: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 118: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 11b: dup
// 11c: sipush 17567
// 11f: ldc2_w 2626100967273469696
// 122: lload 1
// 123: lxor
// 124: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/us.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12c: putstatic su/catlean/us.m Lnet/minecraft/class_243;
// 12f: lload 12
// 131: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 134: invokevirtual net/minecraft/class_746.method_36454 ()F
// 137: putstatic su/catlean/us.t F
// 13a: lload 12
// 13c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13f: invokevirtual net/minecraft/class_746.method_5624 ()Z
// 142: putstatic su/catlean/us.L Z
// 145: lload 12
// 147: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14a: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 14d: pop
// 14e: getstatic su/catlean/us.j Ljava/util/concurrent/atomic/AtomicBoolean;
// 151: bipush 0
// 152: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 155: getstatic su/catlean/us.x Ljava/util/Queue;
// 158: invokeinterface java/util/Queue.clear ()V 1
// 15d: lload 12
// 15f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 162: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 165: putstatic su/catlean/us.I Lnet/minecraft/class_744;
// 168: return
}

@Override
public void b(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 65044256163258
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 29291705890158
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w 1395453573672264258
// 12: lload 1
// 13: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 7
// 1a: aload 0
// 1b: lload 3
// 1c: invokevirtual su/catlean/us.S (J)Z
// 1f: aload 7
// 21: ifnonnull 49
// 24: ifeq 87
// 27: goto 34
// 2a: ldc2_w 1402561980347544369
// 2d: lload 1
// 2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: athrow
// 34: getstatic su/catlean/us.x Ljava/util/Queue;
// 37: invokeinterface java/util/Queue.isEmpty ()Z 1
// 3c: goto 49
// 3f: ldc2_w 1402561980347544369
// 42: lload 1
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: ifne 87
// 4c: getstatic su/catlean/us.x Ljava/util/Queue;
// 4f: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
// 54: dup
// 55: sipush 13751
// 58: ldc2_w 7186620415443456322
// 5b: lload 1
// 5c: lxor
// 5d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/us.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 65: checkcast net/minecraft/class_2596
// 68: lload 5
// 6a: dup2_x1
// 6b: pop2
// 6c: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 6f: aload 7
// 71: ifnull 34
// 74: lload 1
// 75: lconst_0
// 76: lcmp
// 77: ifle 87
// 7a: goto 87
// 7d: ldc2_w 1402561980347544369
// 80: lload 1
// 81: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86: athrow
// 87: return
}

@Flow
private final void F(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/us.a J
// 003: ldc2_w 98175333432608
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 85694754818739
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 138236395283339
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 32
// 029: lshl
// 02a: bipush 32
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 82661332595817
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 4927379293829
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 111489799260056
// 043: lxor
// 044: lstore 13
// 046: pop2
// 047: ldc2_w 6192126442962920689
// 04a: lload 2
// 04b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: astore 15
// 052: aload 1
// 053: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 056: instanceof net/minecraft/class_2708
// 059: aload 15
// 05b: ifnonnull 0b0
// 05e: ifeq 0a9
// 061: goto 06e
// 064: ldc2_w 6180514427767764354
// 067: lload 2
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: aload 0
// 06f: lload 11
// 071: invokespecial su/catlean/us.C (J)Z
// 074: aload 15
// 076: ifnonnull 0b0
// 079: goto 086
// 07c: ldc2_w 6180514427767764354
// 07f: lload 2
// 080: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: athrow
// 086: ifeq 0a9
// 089: goto 096
// 08c: ldc2_w 6180514427767764354
// 08f: lload 2
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: aload 0
// 097: lload 9
// 099: invokevirtual su/catlean/us.d (J)V
// 09c: goto 0a9
// 09f: ldc2_w 6180514427767764354
// 0a2: lload 2
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: aload 1
// 0aa: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0ad: instanceof net/minecraft/class_2743
// 0b0: aload 15
// 0b2: ifnonnull 13b
// 0b5: ifeq 134
// 0b8: goto 0c5
// 0bb: ldc2_w 6180514427767764354
// 0be: lload 2
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: aload 1
// 0c6: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0c9: checkcast net/minecraft/class_2743
// 0cc: invokevirtual net/minecraft/class_2743.method_11818 ()I
// 0cf: aload 15
// 0d1: ifnonnull 13b
// 0d4: goto 0e1
// 0d7: ldc2_w 6180514427767764354
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: lload 13
// 0e3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e6: invokevirtual net/minecraft/class_746.method_5628 ()I
// 0e9: if_icmpne 134
// 0ec: goto 0f9
// 0ef: ldc2_w 6180514427767764354
// 0f2: lload 2
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: aload 0
// 0fa: lload 4
// 0fc: invokespecial su/catlean/us.s (J)Z
// 0ff: aload 15
// 101: ifnonnull 13b
// 104: goto 111
// 107: ldc2_w 6180514427767764354
// 10a: lload 2
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: ifeq 134
// 114: goto 121
// 117: ldc2_w 6180514427767764354
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: aload 0
// 122: lload 9
// 124: invokevirtual su/catlean/us.d (J)V
// 127: goto 134
// 12a: ldc2_w 6180514427767764354
// 12d: lload 2
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: aload 1
// 135: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 138: instanceof net/minecraft/class_2664
// 13b: aload 15
// 13d: ifnonnull 257
// 140: ifeq 250
// 143: goto 150
// 146: ldc2_w 6180514427767764354
// 149: lload 2
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: aload 0
// 151: lload 4
// 153: invokespecial su/catlean/us.s (J)Z
// 156: aload 15
// 158: ifnonnull 257
// 15b: goto 168
// 15e: ldc2_w 6180514427767764354
// 161: lload 2
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: ifeq 250
// 16b: goto 178
// 16e: ldc2_w 6180514427767764354
// 171: lload 2
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: aload 1
// 179: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 17c: checkcast net/minecraft/class_2664
// 17f: invokevirtual net/minecraft/class_2664.comp_2884 ()Ljava/util/Optional;
// 182: dup
// 183: sipush 15581
// 186: ldc2_w 4449485422954946239
// 189: lload 2
// 18a: lxor
// 18b: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/us.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 193: invokestatic kotlin/jvm/optionals/OptionalsKt.getOrNull (Ljava/util/Optional;)Ljava/lang/Object;
// 196: checkcast net/minecraft/class_243
// 199: dup
// 19a: ifnull 24e
// 19d: goto 1aa
// 1a0: ldc2_w 6180514427767764354
// 1a3: lload 2
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: astore 16
// 1ac: bipush 0
// 1ad: istore 17
// 1af: aload 16
// 1b1: getfield net/minecraft/class_243.field_1352 D
// 1b4: dconst_0
// 1b5: dcmpg
// 1b6: aload 15
// 1b8: ifnonnull 1cc
// 1bb: ifne 1cf
// 1be: goto 1cb
// 1c1: ldc2_w 6180514427767764354
// 1c4: lload 2
// 1c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ca: athrow
// 1cb: bipush 1
// 1cc: goto 1d0
// 1cf: bipush 0
// 1d0: ifeq 235
// 1d3: aload 16
// 1d5: getfield net/minecraft/class_243.field_1351 D
// 1d8: dconst_0
// 1d9: dcmpg
// 1da: aload 15
// 1dc: ifnonnull 1fd
// 1df: goto 1ec
// 1e2: ldc2_w 6180514427767764354
// 1e5: lload 2
// 1e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1eb: athrow
// 1ec: ifne 200
// 1ef: goto 1fc
// 1f2: ldc2_w 6180514427767764354
// 1f5: lload 2
// 1f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: athrow
// 1fc: bipush 1
// 1fd: goto 201
// 200: bipush 0
// 201: ifeq 235
// 204: aload 16
// 206: getfield net/minecraft/class_243.field_1350 D
// 209: dconst_0
// 20a: dcmpg
// 20b: aload 15
// 20d: ifnonnull 22e
// 210: goto 21d
// 213: ldc2_w 6180514427767764354
// 216: lload 2
// 217: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: athrow
// 21d: ifne 231
// 220: goto 22d
// 223: ldc2_w 6180514427767764354
// 226: lload 2
// 227: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22c: athrow
// 22d: bipush 1
// 22e: goto 232
// 231: bipush 0
// 232: ifne 24a
// 235: getstatic su/catlean/us.z Lsu/catlean/us;
// 238: lload 9
// 23a: invokevirtual su/catlean/us.d (J)V
// 23d: goto 24a
// 240: ldc2_w 6180514427767764354
// 243: lload 2
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: nop
// 24b: goto 250
// 24e: pop
// 24f: nop
// 250: aload 1
// 251: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 254: instanceof net/minecraft/class_3944
// 257: aload 15
// 259: ifnonnull 297
// 25c: ifeq 2a0
// 25f: goto 26c
// 262: ldc2_w 6180514427767764354
// 265: lload 2
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: aload 0
// 26d: aload 15
// 26f: ifnonnull 29b
// 272: goto 27f
// 275: ldc2_w 6180514427767764354
// 278: lload 2
// 279: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27e: athrow
// 27f: iload 6
// 281: i2c
// 282: iload 7
// 284: i2c
// 285: iload 8
// 287: invokespecial su/catlean/us.w (CCI)Z
// 28a: goto 297
// 28d: ldc2_w 6180514427767764354
// 290: lload 2
// 291: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: athrow
// 297: ifeq 2a0
// 29a: aload 0
// 29b: lload 9
// 29d: invokevirtual su/catlean/us.d (J)V
// 2a0: return
}

public final void r(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 16770521694029L;
long var5 = var1 ^ 51258241610936L;
vm.a<"Å">(348053408289781195L, var1);
this.q(c<"p">(28968, 5785957163511973937L ^ var1), var3);

try {
this.K(st.OFF, var5);
if (vm.a<"Å">(332309951699360269L, var1) != null) {
vm.a<"Å">(new _g[3], 353615226757074878L, var1);
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, 360230426396353720L, var1);
}
}

@Flow
private final void p(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/us.a J
// 003: ldc2_w 124474090364222
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 120658188626336
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 50938827007879
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 8
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 58449699764539
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: lstore 9
// 031: dup2
// 032: bipush 32
// 034: lshl
// 035: bipush 32
// 037: lushr
// 038: l2i
// 039: istore 11
// 03b: pop2
// 03c: dup2
// 03d: ldc2_w 61336708853318
// 040: lxor
// 041: lstore 12
// 043: dup2
// 044: ldc2_w 105993529057246
// 047: lxor
// 048: dup2
// 049: bipush 16
// 04b: lushr
// 04c: lstore 14
// 04e: dup2
// 04f: bipush 48
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 16
// 058: pop2
// 059: dup2
// 05a: ldc2_w 68163156361140
// 05d: lxor
// 05e: dup2
// 05f: bipush 48
// 061: lushr
// 062: l2i
// 063: istore 17
// 065: dup2
// 066: bipush 16
// 068: lshl
// 069: bipush 32
// 06b: lushr
// 06c: l2i
// 06d: istore 18
// 06f: dup2
// 070: bipush 48
// 072: lshl
// 073: bipush 48
// 075: lushr
// 076: l2i
// 077: istore 19
// 079: pop2
// 07a: dup2
// 07b: ldc2_w 100436005016820
// 07e: lxor
// 07f: lstore 20
// 081: dup2
// 082: ldc2_w 109200876426359
// 085: lxor
// 086: lstore 22
// 088: dup2
// 089: ldc2_w 18457349248895
// 08c: lxor
// 08d: lstore 24
// 08f: dup2
// 090: ldc2_w 9823531178820
// 093: lxor
// 094: lstore 26
// 096: dup2
// 097: ldc2_w 50751346766552
// 09a: lxor
// 09b: lstore 28
// 09d: dup2
// 09e: ldc2_w 84771477579654
// 0a1: lxor
// 0a2: lstore 30
// 0a4: pop2
// 0a5: ldc2_w 3886872895597888751
// 0a8: lload 2
// 0a9: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: astore 32
// 0b0: lload 4
// 0b2: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 0b8: ifnull 0e3
// 0bb: getstatic su/catlean/us.j Ljava/util/concurrent/atomic/AtomicBoolean;
// 0be: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
// 0c1: aload 32
// 0c3: ifnonnull 0ea
// 0c6: goto 0d3
// 0c9: ldc2_w 3880890525698053532
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: ifeq 0e4
// 0d6: goto 0e3
// 0d9: ldc2_w 3880890525698053532
// 0dc: lload 2
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: return
// 0e4: aload 0
// 0e5: lload 12
// 0e7: invokespecial su/catlean/us.W (J)Z
// 0ea: aload 32
// 0ec: ifnonnull 252
// 0ef: ifeq 24b
// 0f2: goto 0ff
// 0f5: ldc2_w 3880890525698053532
// 0f8: lload 2
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: iload 17
// 101: i2c
// 102: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 105: aload 0
// 106: lload 20
// 108: invokespecial su/catlean/us.L (J)F
// 10b: getstatic su/catlean/w2.DISTANCE Lsu/catlean/w2;
// 10e: bipush 0
// 10f: bipush 1
// 110: bipush 4
// 111: iload 18
// 113: iload 19
// 115: i2c
// 116: aconst_null
// 117: invokestatic su/catlean/dx.Y (CLsu/catlean/dx;FLsu/catlean/w2;ZZIICLjava/lang/Object;)Lnet/minecraft/class_1657;
// 11a: astore 33
// 11c: aload 32
// 11e: ifnonnull 162
// 121: aload 33
// 123: ifnull 14b
// 126: goto 133
// 129: ldc2_w 3880890525698053532
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: getstatic su/catlean/um.E Lsu/catlean/um;
// 136: lload 28
// 138: invokevirtual su/catlean/um.f (J)Z
// 13b: ifne 163
// 13e: goto 14b
// 141: ldc2_w 3880890525698053532
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: aload 0
// 14c: lload 26
// 14e: invokespecial su/catlean/us.H (J)V
// 151: aconst_null
// 152: putstatic su/catlean/us.N Lnet/minecraft/class_243;
// 155: goto 162
// 158: ldc2_w 3880890525698053532
// 15b: lload 2
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: return
// 163: getstatic su/catlean/us.N Lnet/minecraft/class_243;
// 166: aload 32
// 168: ifnonnull 1ad
// 16b: ifnonnull 19f
// 16e: goto 17b
// 171: ldc2_w 3880890525698053532
// 174: lload 2
// 175: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: athrow
// 17b: aload 0
// 17c: lload 30
// 17e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 181: iload 6
// 183: i2b
// 184: swap
// 185: lload 7
// 187: dup2_x1
// 188: pop2
// 189: checkcast net/minecraft/class_1297
// 18c: invokevirtual su/catlean/us.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 18f: putstatic su/catlean/us.N Lnet/minecraft/class_243;
// 192: goto 19f
// 195: ldc2_w 3880890525698053532
// 198: lload 2
// 199: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: athrow
// 19f: aload 0
// 1a0: iload 6
// 1a2: i2b
// 1a3: lload 7
// 1a5: aload 33
// 1a7: checkcast net/minecraft/class_1297
// 1aa: invokevirtual su/catlean/us.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1ad: getstatic su/catlean/us.N Lnet/minecraft/class_243;
// 1b0: dup
// 1b1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1b4: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 1b7: dstore 34
// 1b9: aload 0
// 1ba: iload 6
// 1bc: i2b
// 1bd: lload 7
// 1bf: aload 33
// 1c1: checkcast net/minecraft/class_1297
// 1c4: invokevirtual su/catlean/us.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1c7: aload 0
// 1c8: lload 30
// 1ca: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1cd: iload 6
// 1cf: i2b
// 1d0: swap
// 1d1: lload 7
// 1d3: dup2_x1
// 1d4: pop2
// 1d5: checkcast net/minecraft/class_1297
// 1d8: invokevirtual su/catlean/us.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1db: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 1de: dstore 36
// 1e0: aload 32
// 1e2: ifnonnull 24a
// 1e5: dload 34
// 1e7: dload 36
// 1e9: dcmpg
// 1ea: ifle 220
// 1ed: goto 1fa
// 1f0: ldc2_w 3880890525698053532
// 1f3: lload 2
// 1f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: athrow
// 1fa: dload 34
// 1fc: dconst_1
// 1fd: dcmpg
// 1fe: aload 32
// 200: ifnonnull 252
// 203: goto 210
// 206: ldc2_w 3880890525698053532
// 209: lload 2
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: ifge 24b
// 213: goto 220
// 216: ldc2_w 3880890525698053532
// 219: lload 2
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: aload 0
// 221: lload 26
// 223: invokespecial su/catlean/us.H (J)V
// 226: aload 0
// 227: lload 30
// 229: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22c: iload 6
// 22e: i2b
// 22f: swap
// 230: lload 7
// 232: dup2_x1
// 233: pop2
// 234: checkcast net/minecraft/class_1297
// 237: invokevirtual su/catlean/us.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 23a: putstatic su/catlean/us.N Lnet/minecraft/class_243;
// 23d: goto 24a
// 240: ldc2_w 3880890525698053532
// 243: lload 2
// 244: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 249: athrow
// 24a: return
// 24b: aload 1
// 24c: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 24f: instanceof net/minecraft/class_2828
// 252: aload 32
// 254: ifnonnull 2aa
// 257: ifeq 2a1
// 25a: goto 267
// 25d: ldc2_w 3880890525698053532
// 260: lload 2
// 261: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 266: athrow
// 267: getstatic su/catlean/us.Y Z
// 26a: aload 32
// 26c: ifnonnull 2c8
// 26f: goto 27c
// 272: ldc2_w 3880890525698053532
// 275: lload 2
// 276: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: athrow
// 27c: ifeq 2c0
// 27f: goto 28c
// 282: ldc2_w 3880890525698053532
// 285: lload 2
// 286: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28b: athrow
// 28c: bipush 0
// 28d: putstatic su/catlean/us.Y Z
// 290: aload 0
// 291: lload 26
// 293: invokespecial su/catlean/us.H (J)V
// 296: return
// 297: ldc2_w 3880890525698053532
// 29a: lload 2
// 29b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a0: athrow
// 2a1: aload 0
// 2a2: lload 14
// 2a4: iload 16
// 2a6: i2c
// 2a7: invokespecial su/catlean/us.T (JC)Z
// 2aa: aload 32
// 2ac: ifnonnull 2c8
// 2af: ifeq 2c0
// 2b2: goto 2bf
// 2b5: ldc2_w 3880890525698053532
// 2b8: lload 2
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: return
// 2c0: aload 0
// 2c1: lload 9
// 2c3: iload 11
// 2c5: invokespecial su/catlean/us.t (JI)Z
// 2c8: aload 32
// 2ca: ifnonnull 3b8
// 2cd: ifeq 3b1
// 2d0: goto 2dd
// 2d3: ldc2_w 3880890525698053532
// 2d6: lload 2
// 2d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dc: athrow
// 2dd: aload 1
// 2de: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 2e1: instanceof net/minecraft/class_2813
// 2e4: aload 32
// 2e6: ifnonnull 31a
// 2e9: goto 2f6
// 2ec: ldc2_w 3880890525698053532
// 2ef: lload 2
// 2f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f5: athrow
// 2f6: ifne 3b0
// 2f9: goto 306
// 2fc: ldc2_w 3880890525698053532
// 2ff: lload 2
// 300: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 305: athrow
// 306: aload 1
// 307: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 30a: instanceof net/minecraft/class_2886
// 30d: goto 31a
// 310: ldc2_w 3880890525698053532
// 313: lload 2
// 314: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 319: athrow
// 31a: aload 32
// 31c: ifnonnull 343
// 31f: ifne 3b0
// 322: goto 32f
// 325: ldc2_w 3880890525698053532
// 328: lload 2
// 329: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32e: athrow
// 32f: aload 1
// 330: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 333: instanceof net/minecraft/class_2846
// 336: goto 343
// 339: ldc2_w 3880890525698053532
// 33c: lload 2
// 33d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 342: athrow
// 343: aload 32
// 345: ifnonnull 39b
// 348: ifeq 387
// 34b: goto 358
// 34e: ldc2_w 3880890525698053532
// 351: lload 2
// 352: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 357: athrow
// 358: aload 1
// 359: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 35c: checkcast net/minecraft/class_2846
// 35f: aload 32
// 361: ifnonnull 398
// 364: goto 371
// 367: ldc2_w 3880890525698053532
// 36a: lload 2
// 36b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: athrow
// 371: invokevirtual net/minecraft/class_2846.method_12363 ()Lnet/minecraft/class_2846$class_2847;
// 374: getstatic net/minecraft/class_2846$class_2847.field_12969 Lnet/minecraft/class_2846$class_2847;
// 377: if_acmpeq 3b0
// 37a: goto 387
// 37d: ldc2_w 3880890525698053532
// 380: lload 2
// 381: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 386: athrow
// 387: aload 1
// 388: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 38b: goto 398
// 38e: ldc2_w 3880890525698053532
// 391: lload 2
// 392: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 397: athrow
// 398: instanceof net/minecraft/class_2868
// 39b: aload 32
// 39d: ifnonnull 3b8
// 3a0: ifeq 3b1
// 3a3: goto 3b0
// 3a6: ldc2_w 3880890525698053532
// 3a9: lload 2
// 3aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3af: athrow
// 3b0: return
// 3b1: aload 1
// 3b2: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 3b5: instanceof net/minecraft/class_2824
// 3b8: aload 32
// 3ba: ifnonnull 40b
// 3bd: ifne 3f6
// 3c0: goto 3cd
// 3c3: ldc2_w 3880890525698053532
// 3c6: lload 2
// 3c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cc: athrow
// 3cd: aload 1
// 3ce: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 3d1: instanceof net/minecraft/class_2879
// 3d4: aload 32
// 3d6: ifnonnull 492
// 3d9: goto 3e6
// 3dc: ldc2_w 3880890525698053532
// 3df: lload 2
// 3e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e5: athrow
// 3e6: ifeq 48b
// 3e9: goto 3f6
// 3ec: ldc2_w 3880890525698053532
// 3ef: lload 2
// 3f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f5: athrow
// 3f6: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 3f9: lload 28
// 3fb: invokevirtual su/catlean/uy.f (J)Z
// 3fe: goto 40b
// 401: ldc2_w 3880890525698053532
// 404: lload 2
// 405: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40a: athrow
// 40b: aload 32
// 40d: ifnonnull 492
// 410: ifne 48b
// 413: goto 420
// 416: ldc2_w 3880890525698053532
// 419: lload 2
// 41a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41f: athrow
// 420: aload 0
// 421: lload 24
// 423: invokevirtual su/catlean/us.I (J)Lsu/catlean/st;
// 426: getstatic su/catlean/zq.b [I
// 429: swap
// 42a: invokevirtual su/catlean/st.ordinal ()I
// 42d: iaload
// 42e: aload 32
// 430: ifnonnull 492
// 433: goto 440
// 436: ldc2_w 3880890525698053532
// 439: lload 2
// 43a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43f: athrow
// 440: tableswitch 75 1 2 34 58
// 458: ldc2_w 3880890525698053532
// 45b: lload 2
// 45c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 461: athrow
// 462: aload 0
// 463: lload 22
// 465: invokevirtual su/catlean/us.d (J)V
// 468: aload 32
// 46a: ifnull 48b
// 46d: goto 47a
// 470: ldc2_w 3880890525698053532
// 473: lload 2
// 474: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 479: athrow
// 47a: bipush 1
// 47b: putstatic su/catlean/us.Y Z
// 47e: goto 48b
// 481: ldc2_w 3880890525698053532
// 484: lload 2
// 485: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48a: athrow
// 48b: aload 1
// 48c: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 48f: instanceof net/minecraft/class_6374
// 492: aload 32
// 494: ifnonnull 4d1
// 497: ifeq 4c1
// 49a: goto 4a7
// 49d: ldc2_w 3880890525698053532
// 4a0: lload 2
// 4a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a6: athrow
// 4a7: getstatic su/catlean/us.S Ljava/util/Queue;
// 4aa: aload 1
// 4ab: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 4ae: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
// 4b3: pop
// 4b4: goto 4c1
// 4b7: ldc2_w 3880890525698053532
// 4ba: lload 2
// 4bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c0: athrow
// 4c1: aload 1
// 4c2: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 4c5: getstatic su/catlean/us.x Ljava/util/Queue;
// 4c8: aload 1
// 4c9: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 4cc: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
// 4d1: pop
// 4d2: return
}

@Flow
private final void I(TickEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/us.a J
// 03: ldc2_w 46785073283192
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 61016451366481
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 62572593072433
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 24880671292096
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w 2933719087939377577
// 22: lload 2
// 23: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 10
// 2a: aload 0
// 2b: aload 10
// 2d: ifnonnull 6b
// 30: lload 4
// 32: invokevirtual su/catlean/us.S (J)Z
// 35: ifeq 5d
// 38: goto 45
// 3b: ldc2_w 2926753608877033690
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: lload 8
// 47: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4a: invokevirtual net/minecraft/class_746.method_29504 ()Z
// 4d: ifeq 70
// 50: goto 5d
// 53: ldc2_w 2926753608877033690
// 56: lload 2
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: aload 0
// 5e: goto 6b
// 61: ldc2_w 2926753608877033690
// 64: lload 2
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: lload 6
// 6d: invokevirtual su/catlean/us.d (J)V
// 70: return
}

@Flow
private final void n(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/us.a J
// 003: ldc2_w 92535057296801
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 25403170360891
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 118816716171909
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 52205862229741
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 40
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 56
// 030: lshl
// 031: bipush 56
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 100027944634133
// 03c: lxor
// 03d: dup2
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: dup2
// 045: bipush 16
// 047: lshl
// 048: bipush 32
// 04a: lushr
// 04b: l2i
// 04c: istore 12
// 04e: dup2
// 04f: bipush 48
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 13
// 058: pop2
// 059: dup2
// 05a: ldc2_w 77295750112488
// 05d: lxor
// 05e: lstore 14
// 060: dup2
// 061: ldc2_w 19087778926241
// 064: lxor
// 065: lstore 16
// 067: dup2
// 068: ldc2_w 50520204946395
// 06b: lxor
// 06c: lstore 18
// 06e: pop2
// 06f: ldc2_w -8831603590419418000
// 072: lload 2
// 073: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: astore 20
// 07a: aload 0
// 07b: iload 8
// 07d: iload 9
// 07f: iload 10
// 081: i2b
// 082: invokespecial su/catlean/us.x (IIB)Lsu/catlean/lj;
// 085: invokevirtual su/catlean/lj.X ()I
// 088: iload 11
// 08a: i2s
// 08b: swap
// 08c: iload 12
// 08e: swap
// 08f: iload 13
// 091: i2c
// 092: swap
// 093: invokestatic su/catlean/bx.k (SICI)Z
// 096: aload 20
// 098: ifnonnull 0dd
// 09b: ifeq 0d5
// 09e: goto 0ab
// 0a1: ldc2_w -8843780754599975677
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: getstatic su/catlean/us.N Lnet/minecraft/class_243;
// 0ae: ifnull 0d5
// 0b1: goto 0be
// 0b4: ldc2_w -8843780754599975677
// 0b7: lload 2
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: aload 0
// 0bf: lload 16
// 0c1: invokespecial su/catlean/us.n (J)V
// 0c4: aload 0
// 0c5: lload 14
// 0c7: invokevirtual su/catlean/us.d (J)V
// 0ca: return
// 0cb: ldc2_w -8843780754599975677
// 0ce: lload 2
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: getstatic su/catlean/us.x Ljava/util/Queue;
// 0d8: invokeinterface java/util/Queue.size ()I 1
// 0dd: aload 20
// 0df: ifnonnull 125
// 0e2: aload 0
// 0e3: lload 4
// 0e5: invokespecial su/catlean/us.j (J)I
// 0e8: if_icmple 15a
// 0eb: goto 0f8
// 0ee: ldc2_w -8843780754599975677
// 0f1: lload 2
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: aload 0
// 0f9: aload 20
// 0fb: ifnonnull 13d
// 0fe: goto 10b
// 101: ldc2_w -8843780754599975677
// 104: lload 2
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: lload 6
// 10d: invokespecial su/catlean/us.F (J)Lsu/catlean/st;
// 110: getstatic su/catlean/zq.b [I
// 113: swap
// 114: invokevirtual su/catlean/st.ordinal ()I
// 117: iaload
// 118: goto 125
// 11b: ldc2_w -8843780754599975677
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: tableswitch 53 1 2 23 34
// 13c: aload 0
// 13d: lload 14
// 13f: invokevirtual su/catlean/us.d (J)V
// 142: aload 20
// 144: ifnull 15a
// 147: aload 0
// 148: lload 18
// 14a: invokespecial su/catlean/us.H (J)V
// 14d: goto 15a
// 150: ldc2_w -8843780754599975677
// 153: lload 2
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: return
}

private final void H(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/us.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 111535452197252
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 75851629846864
// 11: lxor
// 12: lstore 5
// 14: dup2
// 15: ldc2_w 75515649611029
// 18: lxor
// 19: lstore 7
// 1b: pop2
// 1c: ldc2_w -8690825808299526532
// 1f: lload 1
// 20: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25: astore 9
// 27: aload 0
// 28: lload 3
// 29: invokevirtual su/catlean/us.S (J)Z
// 2c: ifne 3a
// 2f: return
// 30: ldc2_w -8698499372840655089
// 33: lload 1
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: getstatic su/catlean/us.j Ljava/util/concurrent/atomic/AtomicBoolean;
// 3d: bipush 1
// 3e: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 41: getstatic su/catlean/us.x Ljava/util/Queue;
// 44: invokeinterface java/util/Queue.isEmpty ()Z 1
// 49: ifne e2
// 4c: getstatic su/catlean/us.x Ljava/util/Queue;
// 4f: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
// 54: checkcast net/minecraft/class_2596
// 57: astore 10
// 59: aload 10
// 5b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5e: lload 5
// 60: aload 10
// 62: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 65: aload 9
// 67: lload 1
// 68: lconst_0
// 69: lcmp
// 6a: iflt 72
// 6d: ifnonnull f7
// 70: aload 9
// 72: lload 1
// 73: lconst_0
// 74: lcmp
// 75: iflt df
// 78: ifnonnull dd
// 7b: goto 88
// 7e: ldc2_w -8698499372840655089
// 81: lload 1
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: aload 10
// 8a: instanceof net/minecraft/class_2828
// 8d: lload 1
// 8e: lconst_0
// 8f: lcmp
// 90: iflt 49
// 93: ifeq 41
// 96: goto a3
// 99: ldc2_w -8698499372840655089
// 9c: lload 1
// 9d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a2: athrow
// a3: new net/minecraft/class_243
// a6: dup
// a7: aload 10
// a9: checkcast net/minecraft/class_2828
// ac: lload 7
// ae: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// b1: invokevirtual net/minecraft/class_746.method_23317 ()D
// b4: invokevirtual net/minecraft/class_2828.method_12269 (D)D
// b7: aload 10
// b9: checkcast net/minecraft/class_2828
// bc: lload 7
// be: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// c1: invokevirtual net/minecraft/class_746.method_23318 ()D
// c4: invokevirtual net/minecraft/class_2828.method_12268 (D)D
// c7: aload 10
// c9: checkcast net/minecraft/class_2828
// cc: lload 7
// ce: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// d1: invokevirtual net/minecraft/class_746.method_23321 ()D
// d4: invokevirtual net/minecraft/class_2828.method_12274 (D)D
// d7: invokespecial net/minecraft/class_243.<init> (DDD)V
// da: putstatic su/catlean/us.N Lnet/minecraft/class_243;
// dd: aload 9
// df: ifnull 41
// e2: getstatic su/catlean/us.j Ljava/util/concurrent/atomic/AtomicBoolean;
// e5: bipush 0
// e6: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// e9: getstatic su/catlean/us.x Ljava/util/Queue;
// ec: invokeinterface java/util/Queue.clear ()V 1
// f1: lload 1
// f2: lconst_0
// f3: lcmp
// f4: ifle f7
// f7: return
}

private final void n(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/us.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 97466973732425
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 132293782209578
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 131944716087407
// 018: lxor
// 019: lstore 7
// 01b: pop2
// 01c: getstatic su/catlean/us.x Ljava/util/Queue;
// 01f: invokeinterface java/util/Queue.clear ()V 1
// 024: ldc2_w 7068900269648810758
// 027: lload 1
// 028: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: lload 7
// 02f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 032: getstatic su/catlean/us.N Lnet/minecraft/class_243;
// 035: dup
// 036: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 039: invokevirtual net/minecraft/class_243.method_10216 ()D
// 03c: getstatic su/catlean/us.N Lnet/minecraft/class_243;
// 03f: dup
// 040: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 043: invokevirtual net/minecraft/class_243.method_10214 ()D
// 046: getstatic su/catlean/us.N Lnet/minecraft/class_243;
// 049: dup
// 04a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 04d: invokevirtual net/minecraft/class_243.method_10215 ()D
// 050: invokevirtual net/minecraft/class_746.method_23327 (DDD)V
// 053: lload 7
// 055: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 058: getstatic su/catlean/us.m Lnet/minecraft/class_243;
// 05b: invokevirtual net/minecraft/class_746.method_18799 (Lnet/minecraft/class_243;)V
// 05e: lload 7
// 060: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 063: getstatic su/catlean/us.t F
// 066: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 069: astore 9
// 06b: lload 7
// 06d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 070: getstatic su/catlean/us.L Z
// 073: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 076: lload 7
// 078: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07b: aload 9
// 07d: ifnonnull 0b7
// 080: bipush 0
// 081: invokevirtual net/minecraft/class_746.method_5660 (Z)V
// 084: lload 3
// 085: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 088: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 08b: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 08e: bipush 0
// 08f: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 092: getstatic su/catlean/us.I Lnet/minecraft/class_744;
// 095: ifnull 0c1
// 098: goto 0a5
// 09b: ldc2_w 7075863403625513589
// 09e: lload 1
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: lload 7
// 0a7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0aa: goto 0b7
// 0ad: ldc2_w 7075863403625513589
// 0b0: lload 1
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: getstatic su/catlean/us.I Lnet/minecraft/class_744;
// 0ba: dup
// 0bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0be: putfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 0c1: getstatic su/catlean/us.j Ljava/util/concurrent/atomic/AtomicBoolean;
// 0c4: bipush 1
// 0c5: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 0c8: getstatic su/catlean/us.S Ljava/util/Queue;
// 0cb: invokeinterface java/util/Queue.isEmpty ()Z 1
// 0d0: ifne 119
// 0d3: getstatic su/catlean/us.S Ljava/util/Queue;
// 0d6: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
// 0db: dup
// 0dc: sipush 11999
// 0df: ldc2_w 7428315531479202673
// 0e2: lload 1
// 0e3: lxor
// 0e4: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/us.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0ec: checkcast net/minecraft/class_2596
// 0ef: lload 5
// 0f1: dup2_x1
// 0f2: pop2
// 0f3: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 0f6: aload 9
// 0f8: lload 1
// 0f9: lconst_0
// 0fa: lcmp
// 0fb: ifle 103
// 0fe: ifnonnull 120
// 101: aload 9
// 103: ifnull 0c8
// 106: lload 1
// 107: lconst_0
// 108: lcmp
// 109: iflt 0f6
// 10c: goto 119
// 10f: ldc2_w 7075863403625513589
// 112: lload 1
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: getstatic su/catlean/us.j Ljava/util/concurrent/atomic/AtomicBoolean;
// 11c: bipush 0
// 11d: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 120: return
}

@Flow
private final void w(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/us.a J
// 003: ldc2_w 39324351512608
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 137037730560665
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
// 020: ldc2_w 68381957225993
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 35042389043838
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 52074653249817
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 35115354733208
// 038: lxor
// 039: lstore 13
// 03b: pop2
// 03c: ldc2_w 7561157539199752689
// 03f: lload 2
// 040: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: astore 15
// 047: aload 0
// 048: lload 7
// 04a: invokevirtual su/catlean/us.S (J)Z
// 04d: aload 15
// 04f: ifnonnull 075
// 052: ifeq 100
// 055: goto 062
// 058: ldc2_w 7549690667620436098
// 05b: lload 2
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: aload 0
// 063: lload 11
// 065: invokespecial su/catlean/us.P (J)Z
// 068: goto 075
// 06b: ldc2_w 7549690667620436098
// 06e: lload 2
// 06f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: athrow
// 075: ifeq 100
// 078: getstatic su/catlean/us.N Lnet/minecraft/class_243;
// 07b: dup
// 07c: ifnull 0fe
// 07f: goto 08c
// 082: ldc2_w 7549690667620436098
// 085: lload 2
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: astore 16
// 08e: bipush 0
// 08f: istore 17
// 091: getstatic su/catlean/us.z Lsu/catlean/us;
// 094: pop
// 095: aload 15
// 097: ifnonnull 0fb
// 09a: getstatic su/catlean/us.N Lnet/minecraft/class_243;
// 09d: getstatic su/catlean/us.z Lsu/catlean/us;
// 0a0: lload 13
// 0a2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a5: iload 4
// 0a7: i2b
// 0a8: swap
// 0a9: lload 5
// 0ab: dup2_x1
// 0ac: pop2
// 0ad: checkcast net/minecraft/class_1297
// 0b0: invokevirtual su/catlean/us.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0b3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b6: ifne 0fa
// 0b9: goto 0c6
// 0bc: ldc2_w 7549690667620436098
// 0bf: lload 2
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0c9: aload 1
// 0ca: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 0cd: aload 16
// 0cf: lload 13
// 0d1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d4: checkcast net/minecraft/class_1657
// 0d7: ldc 0.45
// 0d9: bipush 0
// 0da: sipush 3957
// 0dd: ldc2_w 5969163115813313115
// 0e0: lload 2
// 0e1: lxor
// 0e2: invokedynamic p (IJ)I bsm=su/catlean/us.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: aconst_null
// 0e8: lload 9
// 0ea: invokestatic su/catlean/zi.Q (Lsu/catlean/zi;Lnet/minecraft/class_4587;Lnet/minecraft/class_243;Lnet/minecraft/class_1657;FZILjava/lang/Object;J)V
// 0ed: goto 0fa
// 0f0: ldc2_w 7549690667620436098
// 0f3: lload 2
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: nop
// 0fb: goto 100
// 0fe: pop
// 0ff: nop
// 100: return
}

private static final boolean e() {
long var0 = a ^ 124712170669062L;
long var2 = (var0 ^ 105824705087206L) >>> 16;
int var4 = (int)((var0 ^ 105824705087206L) << 48 >>> 48);
_g[] var5 = vm.a<"Å">(7838781334794640855L, var0);

try {
boolean var10000 = z.T(var2, (char)var4);
if (var5 != null) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, 7846309618312023204L, var0);
}

return false;
}

private static final boolean R() {
long var0 = a ^ 34196373411101L;
long var2 = var0 ^ 98842363962981L;
return z.W(var2);
}

static {
long var20 = a ^ 3121195217834L;
long var22 = var20 ^ 110022416517161L;
long var24 = var20 ^ 10322579002081L;
long var26 = var20 ^ 25079976825289L;
long var28 = var20 ^ 63122265382063L;
long var30 = var20 ^ 120092746840221L;
long var10001 = var20 ^ 70346192783773L;
int var32 = (int)((var20 ^ 70346192783773L) >>> 48);
int var33 = (int)((var20 ^ 70346192783773L) << 16 >>> 32);
int var34 = (int)(var10001 << 48 >>> 48);
int var35 = (int)((var20 ^ 104819108563748L) >>> 32);
int var36 = (int)((var20 ^ 104819108563748L) << 32 >>> 32);
var10001 = var20 ^ 79189885524878L;
int var37 = (int)((var20 ^ 79189885524878L) >>> 32);
int var38 = (int)((var20 ^ 79189885524878L) << 32 >>> 48);
int var39 = (int)(var10001 << 48 >>> 48);
long var40 = var20 ^ 132033511269915L;
vm.a<"Å">("oV6YGb", -2641109758581306966L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[46];
int var16 = 0;
String var15 = "\u0086\u0002 ½\u0098;Ø\u0084WD\u0001¡Zàt\u0013\u0080\fË\u0096\"\u001aPïØYl\"P!\u0091\nK1!ÄÛÄÀ\u0098 æèëµõ\u0014Íã¾Ê'v¸càJ¢ù\u0095Z»2\u0082 þe\u00927?_\u008a\u0012\u0010\r~¦½\u0093\u008a!\u0089,AKYõ=yâ â\\0ßî\u0091µÜj\u0085\u0005Ü´\u008d;Ö\u0087À\u00072\u0097\u0087\\×Ý«ß\u0006JHÌ§\u0018O96\u0004\u000b®\u0002H(\u001c%\u0014\u008db\u0016ê0/\u008ay¸°t\u008f 0à\u0010¡æ{#'®\u0018²\u0016Á1W'\u0002\u0093p¤\u001c@ÙÑ\u0005\u0002\u0006øØ¢\u0095÷0¥¬\u009bN\u0087÷F_\u000b4-¹\u009d§åê\u0093\\\u0012\u0087\u008b\u0083\u00ad:½5å9A%\u0007µ¼¹ÙöÐ!æG\u000f<cð\u0080à\u0017\u0016\u0010|{Û½Mº£Í\u0014\u0003U\u00adí¶ø\u0018 mÓR\u001dþ¾ \u009a?}®UW¸\u0001ïþ\u0001I×\u001b¥Å\u0012\u0011ü\u0097Uà¨ÀT\u0018\u0003\u001b¡¸{OÜ\u001f\u0081\u00adÂcú\u0089t\u000bw#\u0096\u0095Çjdû @N\u001c{d}*V²\u009fýø$¯ÎEZ<64AÖ \u0093Ø\u0083Ì\u008d\u0016ïÉC(BhbÔ¸m\u0081\u001b(i0F|\u008e¸4\u0000Tã§Ìÿ\u001eN\u008côôV¢Iø\u001f\u0016\u0086!\u0005\u0093µxP\u0010ç |\u000bC¦j·Ò4åÝ-ÔU\u009a\u0010F}Ô>º\u0000zè8=\u008c\bõU¤b \u0085\t\u001déOÈ\u0081vÂµ\u0000\u0011w3J³\u0082Ó÷\u0095â 'QÖçú§¢\u0095Ú\u001f8æ\u008dx^ô\u0003§þü}làO\fPË¢\u0011Âî\u0080e¶ªCó\u001d\u0003Ç\u0081Ó\u001dr`;\u007fa9=´³+\rÐy\u0007\u009bC9iËç¿ó½{ Ìë¶½4\u008c6\u001eJ`Ö@w\u008cÅF0Þ¯Ë]\u0097eUP®¶ú\u008f¨wu(ªüòÝ1\nÐ÷áå¯%\u009b\u0081\u0085ã{\u001bXÆßÑ=µ¿ëT²\u009bìðÚä\u008eÉü\u009c\u008dýË\u0018\u0094\u0003\u0006\u009aÔ\u0015\u0081Çö6P\n\u009eÑ½KBw\u0088&º\u0084Ì¯ Æ_+e6à¥Z\u009dÁÃ\u0013\u0090¤¿ø¾\u001bYÚ\u0081î~\u0005\u000f\u0007$]\u0091ìï\u0089 µ\u008fô¨¤\u0016h6\u0016kßÉ÷\u009bóÉ\u00adï'ì\u0096\u007f|í\u0006x_¼\u0011`HC\u0018ü¢õ\u0016:;?R\u0098¹\u0002É#Pú¯°¡\"-\u009dI\u008bu\u0010q³t±aë\u0002Ã¹ \u0095Á¨]Ëj ¥É\u0088ø©Îë5\u0003uÿ/¢#çp\u001f\u0082óáÑ\u0094)¥À6\ný\u001bÉ¡²\u0018Z\nc\u0016Î\u00adß'\u001b\u00951ï0^Ó>U§´\u0093b\u008eX,\u0010&Æh\u0010k¾Ñ3Ï\u001aÌ}Õ\u0011èñ\u0018\u0016\u001e\tõ\u001e¦%<k9&¸Ïº\u0090\u00844¾æû1ºM½\u0010y\u0015?5~e×\u0005®®ëù\u0092ëC\u001d\u0018¯å\u000eIþ±Ëå&æ¦ñÖ¹óÚ\u001e`\u0093Äô\u0096¦\u0080(¾úÝÜ8s²N\u001b=\u0081k*Å\u008fcÌDï\u0001\u0094´¼=×\u0017®ý'q\u009c!\u009eS¹\u007fé\u001bµ\u008b +\u0003:\u0092Ò°>Þ¥\u0005Ybë\u0097_Iü)>Ó\u0087³9Pp:O®å\tZÆ®\u000b~H\u0014£:4\u0092\u0092©\u001e\u0005FL\u0081L{\u0012\u00122¹\u0089$ÏX¤aÒLdÉbNA\u00ad*ü?}ÚH×;{\u009b\u0098râ\u0018û<Z«\u008b\u0096!³P®×o×Êú½\u0090ÞNº¸\n\u000fJ9\u0019\u0094êÉXÔ\u0016Â\u009b\u0099ñ}\u0092\u0093@tX\u001f\u001e\u0089ñ\u008cs\u0007Ï\u0001\u007f¦d]\u0012¸K¢(\u0096\u0091ûì\u0003lË&j\u0016v\u000fÙ¯\u0095Ä\u000b (S\u0013\u0089n§Þu{ý\u0085\u0096é´\u0013\\¨ô*|ö{Ø\u001eòçÛ¡¨O\fûæ½\u0099_¬\rýðô \u008a\u0098×ÒÜÄyV\u0000íÛ{\u0096ô\u0081Ê¾LÎXû)Z\u0004¶»\u001c\u0080°¥)Ü\u0010û>åz2q\\\u0088\u0012\\\u0082w~~íÔ\u0010{\u0013£\to<Bä\u0019\bñ¼\u009dC\u0005ý\u0018\u000f½à\u0086J=\u009b\"\u008eµÿ\u0002÷×v8µãûP\u008b:$»0JQ\u0092qÞ\u001f\u008eÛà_¸<\u0095\u001b\u001f\u009f«wfA\u0080´rµ\u0013ÖÞ#Ð¯\u0014EÄ¥²äQþkhªsR\u001aïø¤<\u0018X©Ro\u0092\u009d\u009a\nÙ<»©B\u001fý\u009e\u009f)\u001d¹ÏF÷Ð r¸\u0004(y!Ñ¡\u0013{n!;ß<\u0084\u0094¬êK>\u008cZ´Ù\u008dÄØÊ°¹\u0000(k\u001fVÈÊ\u0014k\u0006é\u008f\u0096\u008d ÉÎyqð¤\u0013\u0086Æ½á\u009b\u0016û¥\rÂ¸l%Y\u0096\u0019ÓØ¾¹ u¶¢úÕ¨\u001aHÁUô±s\u009b\fö\u0085\u008aC+Wa6:lºG3Ä\u001a\u009f\u0007(*ÇÈ\u0089I¢ò|÷ÄL¹Í\u0001û\u0097u²÷oÈùÌa±\u0014SJ÷Pü*¢Ò\u00065\\\u00ad#/@\u000b~\u0081\u0096<Z.R7;\u0096¢\u0001ßûz\u00adxT#ô>OÁ\u0011EËvÏi¡P\u001fL&Hqr\u001eîµ ~\u009b«\rP`\u000eØs\u009d\u008e¢¬{É\u0003áë\u0003HJ\u009d0k \u0010ñ×wtbö/o\")i\u0092I/J\u0091¼\u009eªh\u0005éJ¤Ì@ý\u0086\u008aY#\u0090Ó½Ð«ck©/ù~\u008d\u0085\u0091";
int var17 = "\u0086\u0002 ½\u0098;Ø\u0084WD\u0001¡Zàt\u0013\u0080\fË\u0096\"\u001aPïØYl\"P!\u0091\nK1!ÄÛÄÀ\u0098 æèëµõ\u0014Íã¾Ê'v¸càJ¢ù\u0095Z»2\u0082 þe\u00927?_\u008a\u0012\u0010\r~¦½\u0093\u008a!\u0089,AKYõ=yâ â\\0ßî\u0091µÜj\u0085\u0005Ü´\u008d;Ö\u0087À\u00072\u0097\u0087\\×Ý«ß\u0006JHÌ§\u0018O96\u0004\u000b®\u0002H(\u001c%\u0014\u008db\u0016ê0/\u008ay¸°t\u008f 0à\u0010¡æ{#'®\u0018²\u0016Á1W'\u0002\u0093p¤\u001c@ÙÑ\u0005\u0002\u0006øØ¢\u0095÷0¥¬\u009bN\u0087÷F_\u000b4-¹\u009d§åê\u0093\\\u0012\u0087\u008b\u0083\u00ad:½5å9A%\u0007µ¼¹ÙöÐ!æG\u000f<cð\u0080à\u0017\u0016\u0010|{Û½Mº£Í\u0014\u0003U\u00adí¶ø\u0018 mÓR\u001dþ¾ \u009a?}®UW¸\u0001ïþ\u0001I×\u001b¥Å\u0012\u0011ü\u0097Uà¨ÀT\u0018\u0003\u001b¡¸{OÜ\u001f\u0081\u00adÂcú\u0089t\u000bw#\u0096\u0095Çjdû @N\u001c{d}*V²\u009fýø$¯ÎEZ<64AÖ \u0093Ø\u0083Ì\u008d\u0016ïÉC(BhbÔ¸m\u0081\u001b(i0F|\u008e¸4\u0000Tã§Ìÿ\u001eN\u008côôV¢Iø\u001f\u0016\u0086!\u0005\u0093µxP\u0010ç |\u000bC¦j·Ò4åÝ-ÔU\u009a\u0010F}Ô>º\u0000zè8=\u008c\bõU¤b \u0085\t\u001déOÈ\u0081vÂµ\u0000\u0011w3J³\u0082Ó÷\u0095â 'QÖçú§¢\u0095Ú\u001f8æ\u008dx^ô\u0003§þü}làO\fPË¢\u0011Âî\u0080e¶ªCó\u001d\u0003Ç\u0081Ó\u001dr`;\u007fa9=´³+\rÐy\u0007\u009bC9iËç¿ó½{ Ìë¶½4\u008c6\u001eJ`Ö@w\u008cÅF0Þ¯Ë]\u0097eUP®¶ú\u008f¨wu(ªüòÝ1\nÐ÷áå¯%\u009b\u0081\u0085ã{\u001bXÆßÑ=µ¿ëT²\u009bìðÚä\u008eÉü\u009c\u008dýË\u0018\u0094\u0003\u0006\u009aÔ\u0015\u0081Çö6P\n\u009eÑ½KBw\u0088&º\u0084Ì¯ Æ_+e6à¥Z\u009dÁÃ\u0013\u0090¤¿ø¾\u001bYÚ\u0081î~\u0005\u000f\u0007$]\u0091ìï\u0089 µ\u008fô¨¤\u0016h6\u0016kßÉ÷\u009bóÉ\u00adï'ì\u0096\u007f|í\u0006x_¼\u0011`HC\u0018ü¢õ\u0016:;?R\u0098¹\u0002É#Pú¯°¡\"-\u009dI\u008bu\u0010q³t±aë\u0002Ã¹ \u0095Á¨]Ëj ¥É\u0088ø©Îë5\u0003uÿ/¢#çp\u001f\u0082óáÑ\u0094)¥À6\ný\u001bÉ¡²\u0018Z\nc\u0016Î\u00adß'\u001b\u00951ï0^Ó>U§´\u0093b\u008eX,\u0010&Æh\u0010k¾Ñ3Ï\u001aÌ}Õ\u0011èñ\u0018\u0016\u001e\tõ\u001e¦%<k9&¸Ïº\u0090\u00844¾æû1ºM½\u0010y\u0015?5~e×\u0005®®ëù\u0092ëC\u001d\u0018¯å\u000eIþ±Ëå&æ¦ñÖ¹óÚ\u001e`\u0093Äô\u0096¦\u0080(¾úÝÜ8s²N\u001b=\u0081k*Å\u008fcÌDï\u0001\u0094´¼=×\u0017®ý'q\u009c!\u009eS¹\u007fé\u001bµ\u008b +\u0003:\u0092Ò°>Þ¥\u0005Ybë\u0097_Iü)>Ó\u0087³9Pp:O®å\tZÆ®\u000b~H\u0014£:4\u0092\u0092©\u001e\u0005FL\u0081L{\u0012\u00122¹\u0089$ÏX¤aÒLdÉbNA\u00ad*ü?}ÚH×;{\u009b\u0098râ\u0018û<Z«\u008b\u0096!³P®×o×Êú½\u0090ÞNº¸\n\u000fJ9\u0019\u0094êÉXÔ\u0016Â\u009b\u0099ñ}\u0092\u0093@tX\u001f\u001e\u0089ñ\u008cs\u0007Ï\u0001\u007f¦d]\u0012¸K¢(\u0096\u0091ûì\u0003lË&j\u0016v\u000fÙ¯\u0095Ä\u000b (S\u0013\u0089n§Þu{ý\u0085\u0096é´\u0013\\¨ô*|ö{Ø\u001eòçÛ¡¨O\fûæ½\u0099_¬\rýðô \u008a\u0098×ÒÜÄyV\u0000íÛ{\u0096ô\u0081Ê¾LÎXû)Z\u0004¶»\u001c\u0080°¥)Ü\u0010û>åz2q\\\u0088\u0012\\\u0082w~~íÔ\u0010{\u0013£\to<Bä\u0019\bñ¼\u009dC\u0005ý\u0018\u000f½à\u0086J=\u009b\"\u008eµÿ\u0002÷×v8µãûP\u008b:$»0JQ\u0092qÞ\u001f\u008eÛà_¸<\u0095\u001b\u001f\u009f«wfA\u0080´rµ\u0013ÖÞ#Ð¯\u0014EÄ¥²äQþkhªsR\u001aïø¤<\u0018X©Ro\u0092\u009d\u009a\nÙ<»©B\u001fý\u009e\u009f)\u001d¹ÏF÷Ð r¸\u0004(y!Ñ¡\u0013{n!;ß<\u0084\u0094¬êK>\u008cZ´Ù\u008dÄØÊ°¹\u0000(k\u001fVÈÊ\u0014k\u0006é\u008f\u0096\u008d ÉÎyqð¤\u0013\u0086Æ½á\u009b\u0016û¥\rÂ¸l%Y\u0096\u0019ÓØ¾¹ u¶¢úÕ¨\u001aHÁUô±s\u009b\fö\u0085\u008aC+Wa6:lºG3Ä\u001a\u009f\u0007(*ÇÈ\u0089I¢ò|÷ÄL¹Í\u0001û\u0097u²÷oÈùÌa±\u0014SJ÷Pü*¢Ò\u00065\\\u00ad#/@\u000b~\u0081\u0096<Z.R7;\u0096¢\u0001ßûz\u00adxT#ô>OÁ\u0011EËvÏi¡P\u001fL&Hqr\u001eîµ ~\u009b«\rP`\u000eØs\u009d\u008e¢¬{É\u0003áë\u0003HJ\u009d0k \u0010ñ×wtbö/o\")i\u0092I/J\u0091¼\u009eªh\u0005éJ¤Ì@ý\u0086\u008aY#\u0090Ó½Ð«ck©/ù~\u008d\u0085\u0091"
.length();
char var14 = '(';
int var45 = -1;

label54:
while (true) {
String var46 = var15.substring(++var45, var45 + var14);
byte var52 = -1;

while (true) {
byte[] var19 = var11.doFinal(var46.getBytes("ISO-8859-1"));
String var60 = b(var19).intern();
switch (var52) {
case 0:
var18[var16++] = var60;
if ((var45 += var14) >= var17) {
c = var18;
d = new String[46];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[21];
int var3 = 0;
String var4 = "\u001dÿÚöèé-äÉ\u0091´\u0090W\u0013´J£~Omgæk¯\u0007\u0092êX°#ø|%ý0ú\"+c\u009f\u0083\f\u001få¼jV¼SfrÓýÜ\u0012\f\n¢ù#ÃlYóÒëÎ\u0000\u001bK*J`{ð\u008b+L#taY\u0012Pá·\u008dÇH/ÒGÿ\u0001ß@µ\u0089Ó\u0098dòrðÊC½3.ËÒ^´¹vÌ\u0012&ÉüÌûæf\u0010\u008dB¿£\"Ø-7\u0002Fö\u0082\u0007ù\u008a\u0010-jKëß¦½@?ÇÓ";
int var5 = "\u001dÿÚöèé-äÉ\u0091´\u0090W\u0013´J£~Omgæk¯\u0007\u0092êX°#ø|%ý0ú\"+c\u009f\u0083\f\u001få¼jV¼SfrÓýÜ\u0012\f\n¢ù#ÃlYóÒëÎ\u0000\u001bK*J`{ð\u008b+L#taY\u0012Pá·\u008dÇH/ÒGÿ\u0001ß@µ\u0089Ó\u0098dòrðÊC½3.ËÒ^´¹vÌ\u0012&ÉüÌûæf\u0010\u008dB¿£\"Ø-7\u0002Fö\u0082\u0007ù\u008a\u0010-jKëß¦½@?ÇÓ"
.length();
byte var2 = 0;

label36:
while (true) {
byte var56 = var2;
var2 += 8;
byte[] var7 = var4.substring(var56, var2).getBytes("ISO-8859-1");
long[] var49 = var6;
int var57 = var3++;
long var64 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var67 = -1;

while (true) {
long var8 = var64;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var69 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var67) {
case 0:
var49[var57] = var69;
if (var2 >= var5) {
h = var6;
i = new Integer[21];
KProperty[] var42 = new KProperty[c<"p">(22523, 1930387607836979537L ^ var20)];
var42[0] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(us.class, b<"m">(15234, 3520083381412009831L ^ var20), b<"m">(5545, 7177164912477354367L ^ var20), 0)
);
var42[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(us.class, b<"m">(18044, 2333093282123344556L ^ var20), b<"m">(191, 5386189366763629649L ^ var20), 0)
);
var42[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(us.class, b<"m">(32265, 7177046207878058711L ^ var20), b<"m">(6378, 4304767562260329520L ^ var20), 0)
);
var42[3] = Reflection.property1(new PropertyReference1Impl(us.class, b<"m">(1599, 361747673892170464L ^ var20), b<"m">(8727, 2250572897514426069L ^ var20), 0));
var42[4] = Reflection.property1(
new PropertyReference1Impl(us.class, b<"m">(17400, 1352461266367180600L ^ var20), b<"m">(1750, 4937374079582415419L ^ var20), 0)
);
var42[5] = Reflection.property1(
new PropertyReference1Impl(us.class, b<"m">(16882, 7708548277605920035L ^ var20), b<"m">(32398, 4977170273695322711L ^ var20), 0)
);
var42[c<"p">(21043, 7998830465834415253L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(us.class, b<"m">(17210, 8605388345495285743L ^ var20), b<"m">(250, 1108109557769219121L ^ var20), 0)
);
var42[c<"p">(3136, 8099424525316532968L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(us.class, b<"m">(26700, 2285472700902622373L ^ var20), b<"m">(22813, 541953665842968025L ^ var20), 0)
);
var42[c<"p">(20888, 5137636151272634168L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(us.class, b<"m">(2146, 3946722693711307952L ^ var20), b<"m">(25219, 3847725641877868105L ^ var20), 0)
);
var42[c<"p">(2811, 2906849510910405720L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(us.class, b<"m">(28352, 888615688424342019L ^ var20), b<"m">(29605, 8619778483141730122L ^ var20), 0)
);
var42[c<"p">(21878, 6538623939000366040L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(us.class, b<"m">(18534, 5511132204468036786L ^ var20), b<"m">(16560, 2714371355171646547L ^ var20), 0)
);
var42[c<"p">(2563, 8177214206423248036L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(us.class, b<"m">(30606, 2945826841694591823L ^ var20), b<"m">(19522, 7474216145351663757L ^ var20), 0)
);
var42[c<"p">(360, 4338979631800985540L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(us.class, b<"m">(6313, 121464842224088167L ^ var20), b<"m">(12787, 3288529864939281704L ^ var20), 0)
);
P = var42;
z = new us(var22);
G = yp.L(
z,
b<"m">(5450, 8754590430954928514L ^ var20),
c<"p">(19128, 1111053978317876228L ^ var20),
new IntRange(1, c<"p">(16635, 6043052042436666949L ^ var20)),
var26,
null,
null,
c<"p">(21742, 123619823640605263L ^ var20),
null
);
K = yp.L(z, b<"m">(24423, 8041125238824170400L ^ var20), st.NONE, null, null, c<"p">(19352, 758530157879717159L ^ var20), null, var40);
b = yp.L(z, b<"m">(4920, 8180483574457090015L ^ var20), st.NONE, null, null, c<"p">(19352, 758530157879717159L ^ var20), null, var40);
J = yp.J(
z,
b<"m">(5838, 5854690453928655382L ^ var20),
new lj(c<"p">(26447, 4919101896880505335L ^ var20), false, var30, false, c<"p">(21043, 7998830465834415253L ^ var20), null),
null,
var37,
null,
var38,
(char)var39,
c<"p">(19352, 758530157879717159L ^ var20),
null
);
X = yp.t(z, b<"m">(11140, 5417716189443327840L ^ var20), true, var28, null, null, c<"p">(19352, 758530157879717159L ^ var20), null);
U = yp.t(z, b<"m">(7412, 8012273790428327971L ^ var20), false, var28, null, null, c<"p">(19352, 758530157879717159L ^ var20), null);
e = yp.t(z, b<"m">(27722, 2567537518284980394L ^ var20), true, var28, null, us::e, 4, null);
W = yp.t(z, b<"m">(3674, 5566179991517700792L ^ var20), false, var28, null, null, c<"p">(19352, 758530157879717159L ^ var20), null);
k = yp.k(
z, b<"m">(1309, 207345119207696891L ^ var20), 5.0F, var24, RangesKt.rangeTo(2.0F, 10.0F), null, us::R, c<"p">(20888, 5137636151272634168L ^ var20), null
);
E = yp.B(z, b<"m">(10976, 6676674716410545724L ^ var20), (short)var32, w7.BOOLS, null, 4, var33, null, (char)var34);
D = yp.t(z, b<"m">(13715, 2039582533897394546L ^ var20), true, var28, z.a(var35, var36), null, c<"p">(20888, 5137636151272634168L ^ var20), null);
u = yp.t(z, b<"m">(27046, 5995989657736168803L ^ var20), true, var28, z.a(var35, var36), null, c<"p">(20888, 5137636151272634168L ^ var20), null);
A = yp.t(z, b<"m">(13220, 6182143659570372457L ^ var20), true, var28, z.a(var35, var36), null, c<"p">(20888, 5137636151272634168L ^ var20), null);
class_243 var50 = class_243.field_1353;
Intrinsics.checkNotNullExpressionValue(class_243.field_1353, b<"m">(1619, 6703420193312058005L ^ var20));
m = var50;
x = new LinkedList();
S = new LinkedList();
j = new AtomicBoolean();
return;
}
break;
default:
var49[var57] = var69;
if (var2 < var5) {
continue label36;
}

var4 = "Øê\u009dv¤©ú/ôpÅgð´ó\u0089";
var5 = "Øê\u009dv¤©ú/ôpÅgð´ó\u0089".length();
var2 = 0;
}

byte var58 = var2;
var2 += 8;
var7 = var4.substring(var58, var2).getBytes("ISO-8859-1");
var49 = var6;
var57 = var3++;
var64 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var67 = 0;
}
}
}

var14 = var15.charAt(var45);
break;
default:
var18[var16++] = var60;
if ((var45 += var14) < var17) {
var14 = var15.charAt(var45);
continue label54;
}

var15 = "&0²üw\u0081\u001bÿv¶]æÞ%Ð²Ë¿uñ\u0015\u008e\u001b\u00979P$WóÍ¨b \u0097\u0098ò\u0093\nêx\u0086æ¢o\u0003AýV?\u0004Ë\u0018\u0092@e\u009blæ\u0013Q{ÎâÍ=";
var17 = "&0²üw\u0081\u001bÿv¶]æÞ%Ð²Ë¿uñ\u0015\u008e\u001b\u00979P$WóÍ¨b \u0097\u0098ò\u0093\nêx\u0086æ¢o\u0003AýV?\u0004Ë\u0018\u0092@e\u009blæ\u0013Q{ÎâÍ="
.length();
var14 = ' ';
var45 = -1;
}

var46 = var15.substring(++var45, var45 + var14);
var52 = 0;
}
}
}

public static void M(String var0) {
f = var0;
}

public static String i() {
return f;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 30393;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/us", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/us" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31953;
if (i[var3] == null) {
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
throw new RuntimeException("su/catlean/us", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/us" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
