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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_2596;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.api.event.events.player.EventPostPlayerTravel;
import su.catlean.api.event.events.player.FallFlyingEvent;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.player.ShouldStopSprintingEvent;
import su.catlean.gofra.Flow;

public final class _0 extends _g {
@NotNull
public static final _0 D;
static final KProperty[] c;
@NotNull
private static final cq F;
@NotNull
private static final cq d;
@NotNull
private static final cw k;
@NotNull
private static final cq g;
@NotNull
private static final cq x;
@NotNull
private static final ct y;
@NotNull
private static final cq m;
private static float j;
private static float a;
private static float T;
private static float w;
private static float A;
private static boolean V;
private static boolean L;
private static boolean f;
private static boolean K;
private static int b;
@NotNull
private static final Queue l;
@NotNull
private static final Queue O;
@NotNull
private static final LinkedList C;
@NotNull
private static final LinkedList N;
private static boolean B;
private static double G;
private static final long e = yz.a(-470473023837798775L, 2556780326439791241L, MethodHandles.lookup().lookupClass()).a(166764164087599L);
private static final String[] h;
private static final String[] i;
private static final Map n = new HashMap(13);
private static final long[] o;
private static final Integer[] t;
private static final Map u;

private _0(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 101967666279694L;
super(b<"v">(8068, 571813488924792248L ^ var1), jt.c(), null, 4, null, var3);
}

private final boolean p(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 35200148290181L;
return (Boolean)F.E(this, var3, c[0]);
}

private final void l(char var1, boolean var2, char var3, int var4) {
long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ e;
long var7 = var5 ^ 44082406872135L;
F.b(this, var7, c[0], var2);
}

private final boolean l(char var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ e;
long var6 = var4 ^ 30333207193660L;
return (Boolean)d.E(this, var6, c[1]);
}

private final void d(boolean var1, long var2) {
var2 = e ^ var2;
long var4 = var2 ^ 28497877041986L;
d.b(this, var4, c[1], var1);
}

private final t6 Y(long var1, int var3) {
long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ e;
long var6 = var4 ^ 82596213978587L;
return (t6)k.E(this, var6, c[2]);
}

private final void x(long var1, t6 var3) {
var1 = e ^ var1;
long var4 = var1 ^ 43718322939023L;
k.b(this, var4, c[2], var3);
}

private final boolean Z(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 91686431574529L;
return (Boolean)g.E(this, var3, c[3]);
}

private final void r(boolean var1, short var2, int var3, short var4) {
long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ e;
long var7 = var5 ^ 46477705900884L;
g.b(this, var7, c[3], var1);
}

private final boolean H(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 99979009782857L;
return (Boolean)x.E(this, var3, c[4]);
}

private final void k(boolean var1, byte var2, long var3) {
long var5 = ((long)var2 << 56 | var3 << 8 >>> 8) ^ e;
long var7 = var5 ^ 14890692903957L;
x.b(this, var7, c[4], var1);
}

private final float V(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 138818102280744L;
return ((Number)y.E(this, var3, c[5])).floatValue();
}

private final void w(float var1, short var2, int var3, short var4) {
long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ e;
long var7 = var5 ^ 59771863550855L;
y.b(this, var7, c[5], var1);
}

private final boolean Q(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 119816712820515L;
return (Boolean)m.E(this, var3, c[c<"g">(7455, 7081334068889765098L ^ var1)]);
}

private final void H(boolean var1, long var2) {
var2 = e ^ var2;
long var4 = var2 ^ 21850746122919L;
m.b(this, var4, c[c<"g">(21493, 3832395207604329L ^ var2)], var1);
}

@Override
public void O(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 32978412894279
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 67464996320865
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w 2646257265504916477
// 12: lload 1
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: bipush 0
// 19: putstatic su/catlean/_0.K Z
// 1c: istore 7
// 1e: bipush 0
// 1f: putstatic su/catlean/_0.b I
// 22: iload 7
// 24: ifne 62
// 27: lload 3
// 28: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 2e: ifnull 56
// 31: goto 3e
// 34: ldc2_w 2623007067860359779
// 37: lload 1
// 38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: athrow
// 3e: lload 5
// 40: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 43: invokevirtual net/minecraft/class_746.method_36454 ()F
// 46: putstatic su/catlean/_0.A F
// 49: goto 56
// 4c: ldc2_w 2623007067860359779
// 4f: lload 1
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: getstatic su/catlean/_0.C Ljava/util/LinkedList;
// 59: invokevirtual java/util/LinkedList.clear ()V
// 5c: getstatic su/catlean/_0.N Ljava/util/LinkedList;
// 5f: invokevirtual java/util/LinkedList.clear ()V
// 62: lload 1
// 63: lconst_0
// 64: lcmp
// 65: iflt 82
// 68: ldc2_w 2620972475537570510
// 6b: lload 1
// 6c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: ifnull 8f
// 74: iinc 7 1
// 77: iload 7
// 79: ldc2_w 2737517070520783029
// 7c: lload 1
// 7d: invokedynamic Å (IJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82: goto 8f
// 85: ldc2_w 2623007067860359779
// 88: lload 1
// 89: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e: athrow
// 8f: return
}

@Flow(
priority = -10
)
private final void n(PreElytraEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_0.e J
// 003: ldc2_w 128819971243431
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 122078793106922
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 24095539350310
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 83187508786059
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 61001751620877
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w -4649978253539413482
// 029: lload 2
// 02a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: lload 10
// 031: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 034: invokevirtual net/minecraft/class_746.method_36454 ()F
// 037: putstatic su/catlean/_0.a F
// 03a: istore 12
// 03c: aload 0
// 03d: lload 4
// 03f: invokespecial su/catlean/_0.H (J)Z
// 042: iload 12
// 044: ifeq 094
// 047: ifne 07f
// 04a: goto 057
// 04d: ldc2_w -4680716489119481585
// 050: lload 2
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: aload 0
// 058: lload 6
// 05a: invokespecial su/catlean/_0.p (J)Z
// 05d: iload 12
// 05f: ifeq 094
// 062: goto 06f
// 065: ldc2_w -4680716489119481585
// 068: lload 2
// 069: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: athrow
// 06f: ifeq 102
// 072: goto 07f
// 075: ldc2_w -4680716489119481585
// 078: lload 2
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: lload 10
// 081: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 084: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 087: goto 094
// 08a: ldc2_w -4680716489119481585
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: iload 12
// 096: ifeq 0e7
// 099: ifeq 102
// 09c: goto 0a9
// 09f: ldc2_w -4680716489119481585
// 0a2: lload 2
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: lload 10
// 0ab: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ae: invokevirtual net/minecraft/class_746.method_36455 ()F
// 0b1: putstatic su/catlean/_0.j F
// 0b4: lload 10
// 0b6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b9: aload 0
// 0ba: lload 8
// 0bc: invokespecial su/catlean/_0.V (J)F
// 0bf: iload 12
// 0c1: ifeq 0ff
// 0c4: goto 0d1
// 0c7: ldc2_w -4680716489119481585
// 0ca: lload 2
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 0d4: aload 0
// 0d5: lload 6
// 0d7: invokespecial su/catlean/_0.p (J)Z
// 0da: goto 0e7
// 0dd: ldc2_w -4680716489119481585
// 0e0: lload 2
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: ifeq 102
// 0ea: lload 10
// 0ec: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ef: getstatic su/catlean/_0.A F
// 0f2: goto 0ff
// 0f5: ldc2_w -4680716489119481585
// 0f8: lload 2
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 102: return
}

@Flow(
priority = -10
)
private final void l(AfterElytraEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: ldc2_w 79521828697491
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 90699204709854
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 44599157031698
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 11000237892921
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w 8593932486650903074
// 22: lload 2
// 23: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: istore 10
// 2a: aload 0
// 2b: lload 4
// 2d: invokespecial su/catlean/_0.H (J)Z
// 30: iload 10
// 32: ifeq 94
// 35: ifne 6d
// 38: goto 45
// 3b: ldc2_w 8592582616258021691
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: aload 0
// 46: lload 6
// 48: invokespecial su/catlean/_0.p (J)Z
// 4b: iload 10
// 4d: ifeq 94
// 50: goto 5d
// 53: ldc2_w 8592582616258021691
// 56: lload 2
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: ifeq ba
// 60: goto 6d
// 63: ldc2_w 8592582616258021691
// 66: lload 2
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: lload 8
// 6f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 72: iload 10
// 74: ifeq b4
// 77: goto 84
// 7a: ldc2_w 8592582616258021691
// 7d: lload 2
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 87: goto 94
// 8a: ldc2_w 8592582616258021691
// 8d: lload 2
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: ifeq ba
// 97: lload 8
// 99: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9c: getstatic su/catlean/_0.j F
// 9f: invokevirtual net/minecraft/class_746.method_36457 (F)V
// a2: lload 8
// a4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// a7: goto b4
// aa: ldc2_w 8592582616258021691
// ad: lload 2
// ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3: athrow
// b4: getstatic su/catlean/_0.a F
// b7: invokevirtual net/minecraft/class_746.method_36456 (F)V
// ba: return
}

@Flow
public final void m(@NotNull EventPlayerTravel e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: ldc2_w 59848246308468
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 94429856676431
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 95303508580597
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 9823198322776
// 1b: lxor
// 1c: lstore 8
// 1e: dup2
// 1f: ldc2_w 127803973074654
// 22: lxor
// 23: lstore 10
// 25: pop2
// 26: ldc2_w -6006475694359715387
// 29: lload 2
// 2a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: aload 1
// 30: ldc "e"
// 32: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 35: istore 12
// 37: aload 0
// 38: lload 6
// 3a: invokespecial su/catlean/_0.p (J)Z
// 3d: iload 12
// 3f: ifeq 65
// 42: ifeq a4
// 45: goto 52
// 48: ldc2_w -5991614477484797220
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: aload 0
// 53: lload 4
// 55: invokevirtual su/catlean/_0.S (J)Z
// 58: goto 65
// 5b: ldc2_w -5991614477484797220
// 5e: lload 2
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: ifeq a4
// 68: lload 10
// 6a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6d: invokevirtual net/minecraft/class_746.method_36454 ()F
// 70: putstatic su/catlean/_0.T F
// 73: lload 10
// 75: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 78: invokevirtual net/minecraft/class_746.method_36455 ()F
// 7b: putstatic su/catlean/_0.w F
// 7e: lload 10
// 80: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 83: aload 0
// 84: lload 8
// 86: invokespecial su/catlean/_0.V (J)F
// 89: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 8c: lload 10
// 8e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 91: getstatic su/catlean/_0.A F
// 94: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 97: goto a4
// 9a: ldc2_w -5991614477484797220
// 9d: lload 2
// 9e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a3: athrow
// a4: return
}

@Flow
public final void s(@NotNull EventPostPlayerTravel e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: ldc2_w 101729907286875
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 69309994547040
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 66274638747098
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 33912959071217
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w 2417268370830355690
// 22: lload 2
// 23: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: aload 1
// 29: ldc "e"
// 2b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 2e: istore 10
// 30: aload 0
// 31: lload 6
// 33: invokespecial su/catlean/_0.p (J)Z
// 36: iload 10
// 38: ifeq 5e
// 3b: ifeq 84
// 3e: goto 4b
// 41: ldc2_w 2447399135413067763
// 44: lload 2
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: aload 0
// 4c: lload 4
// 4e: invokevirtual su/catlean/_0.S (J)Z
// 51: goto 5e
// 54: ldc2_w 2447399135413067763
// 57: lload 2
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: ifeq 84
// 61: lload 8
// 63: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 66: getstatic su/catlean/_0.T F
// 69: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 6c: lload 8
// 6e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 71: getstatic su/catlean/_0.w F
// 74: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 77: goto 84
// 7a: ldc2_w 2447399135413067763
// 7d: lload 2
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: return
}

@Flow(
priority = -10
)
private final void O(JumpEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: ldc2_w 93962758164533
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 59057853621940
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w 1317107774036550915
// 14: lload 2
// 15: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: istore 6
// 1c: iload 6
// 1e: ifne 4b
// 21: aload 0
// 22: lload 4
// 24: invokespecial su/catlean/_0.p (J)Z
// 27: ifeq 4f
// 2a: goto 37
// 2d: ldc2_w 1340068808744430749
// 30: lload 2
// 31: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36: athrow
// 37: aload 1
// 38: getstatic su/catlean/_0.A F
// 3b: invokevirtual su/catlean/api/event/events/player/JumpEvent.setYaw (F)V
// 3e: goto 4b
// 41: ldc2_w 1340068808744430749
// 44: lload 2
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: aload 1
// 4c: invokevirtual su/catlean/api/event/events/player/JumpEvent.cancel ()V
// 4f: return
}

@Flow
private final void p(FallFlyingEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: ldc2_w 106649191671103
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 258262111166
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 112503142666330
// 14: lxor
// 15: dup2
// 16: bipush 32
// 18: lushr
// 19: l2i
// 1a: istore 6
// 1c: dup2
// 1d: bipush 32
// 1f: lshl
// 20: bipush 32
// 22: lushr
// 23: lstore 7
// 25: pop2
// 26: pop2
// 27: ldc2_w -1733920232114574706
// 2a: lload 2
// 2b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30: istore 9
// 32: aload 0
// 33: lload 4
// 35: invokespecial su/catlean/_0.p (J)Z
// 38: iload 9
// 3a: ifeq 8c
// 3d: ifeq 7b
// 40: goto 4d
// 43: ldc2_w -1760110372322862697
// 46: lload 2
// 47: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: athrow
// 4d: getstatic su/catlean/_0.V Z
// 50: ifeq ec
// 53: goto 60
// 56: ldc2_w -1760110372322862697
// 59: lload 2
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: aload 1
// 61: bipush 1
// 62: invokevirtual su/catlean/api/event/events/player/FallFlyingEvent.setValue (Z)V
// 65: aload 1
// 66: invokevirtual su/catlean/api/event/events/player/FallFlyingEvent.cancel ()V
// 69: iload 9
// 6b: ifne ec
// 6e: goto 7b
// 71: ldc2_w -1760110372322862697
// 74: lload 2
// 75: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7a: athrow
// 7b: aload 1
// 7c: invokevirtual su/catlean/api/event/events/player/FallFlyingEvent.getValue ()Z
// 7f: goto 8c
// 82: ldc2_w -1760110372322862697
// 85: lload 2
// 86: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b: athrow
// 8c: istore 10
// 8e: getstatic su/catlean/_0.V Z
// 91: iload 9
// 93: ifeq e9
// 96: ifeq e7
// 99: goto a6
// 9c: ldc2_w -1760110372322862697
// 9f: lload 2
// a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5: athrow
// a6: iload 10
// a8: iload 9
// aa: ifeq e9
// ad: goto ba
// b0: ldc2_w -1760110372322862697
// b3: lload 2
// b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b9: athrow
// ba: ifne e7
// bd: goto ca
// c0: ldc2_w -1760110372322862697
// c3: lload 2
// c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c9: athrow
// ca: aload 1
// cb: aload 0
// cc: iload 6
// ce: lload 7
// d0: invokespecial su/catlean/_0.E (IJ)Z
// d3: invokevirtual su/catlean/api/event/events/player/FallFlyingEvent.setValue (Z)V
// d6: aload 1
// d7: invokevirtual su/catlean/api/event/events/player/FallFlyingEvent.cancel ()V
// da: goto e7
// dd: ldc2_w -1760110372322862697
// e0: lload 2
// e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e6: athrow
// e7: iload 10
// e9: putstatic su/catlean/_0.V Z
// ec: return
}

@Flow
private final void Z(ShouldStopSprintingEvent var1) {
long var2 = e ^ 5867244881290L;
long var4 = var2 ^ 64084835149669L;

try {
if (this.A(var4)) {
var1.cancel();
}
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -8707796361974351582L, var2);
}
}

@Flow
private final void d(SetPoseEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: ldc2_w 132612869980929
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 117920487736580
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 78626588172782
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 26797470283136
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w -9118835539522734537
// 22: lload 2
// 23: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: istore 10
// 2a: aload 0
// 2b: lload 6
// 2d: invokespecial su/catlean/_0.A (J)Z
// 30: iload 10
// 32: ifne 58
// 35: ifeq 9b
// 38: goto 45
// 3b: ldc2_w -9102675817370320983
// 3e: lload 2
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: aload 0
// 46: lload 4
// 48: invokespecial su/catlean/_0.Z (J)Z
// 4b: goto 58
// 4e: ldc2_w -9102675817370320983
// 51: lload 2
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: iload 10
// 5a: ifne 80
// 5d: ifeq 9b
// 60: goto 6d
// 63: ldc2_w -9102675817370320983
// 66: lload 2
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: aload 0
// 6e: lload 8
// 70: invokespecial su/catlean/_0.p (J)Z
// 73: goto 80
// 76: ldc2_w -9102675817370320983
// 79: lload 2
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: ifeq 9b
// 83: aload 1
// 84: invokevirtual su/catlean/api/event/events/player/SetPoseEvent.cancel ()V
// 87: aload 1
// 88: getstatic net/minecraft/class_4050.field_18076 Lnet/minecraft/class_4050;
// 8b: invokevirtual su/catlean/api/event/events/player/SetPoseEvent.setPose (Lnet/minecraft/class_4050;)V
// 8e: goto 9b
// 91: ldc2_w -9102675817370320983
// 94: lload 2
// 95: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a: athrow
// 9b: return
}

@Flow
private final void B(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_0.e J
// 003: ldc2_w 87673057571046
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 49801753898602
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 43545284369016
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 111050017892838
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 92496889010912
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 53608484187399
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 123841148506633
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 15319451017292
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 15091195501431
// 03e: lxor
// 03f: dup2
// 040: bipush 32
// 042: lushr
// 043: l2i
// 044: istore 18
// 046: dup2
// 047: bipush 32
// 049: lshl
// 04a: bipush 48
// 04c: lushr
// 04d: l2i
// 04e: istore 19
// 050: dup2
// 051: bipush 48
// 053: lshl
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 20
// 05a: pop2
// 05b: dup2
// 05c: ldc2_w 94087345260715
// 05f: lxor
// 060: lstore 21
// 062: dup2
// 063: ldc2_w 139813414441861
// 066: lxor
// 067: lstore 23
// 069: dup2
// 06a: ldc2_w 10664807133935
// 06d: lxor
// 06e: lstore 25
// 070: dup2
// 071: ldc2_w 52226462811751
// 074: lxor
// 075: lstore 27
// 077: dup2
// 078: ldc2_w 124508354313930
// 07b: lxor
// 07c: lstore 29
// 07e: dup2
// 07f: ldc2_w 80341247608195
// 082: lxor
// 083: dup2
// 084: bipush 32
// 086: lushr
// 087: l2i
// 088: istore 31
// 08a: dup2
// 08b: bipush 32
// 08d: lshl
// 08e: bipush 32
// 090: lushr
// 091: lstore 32
// 093: pop2
// 094: pop2
// 095: ldc2_w 8229994065432559447
// 098: lload 2
// 099: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: istore 34
// 0a0: aload 0
// 0a1: lload 21
// 0a3: invokespecial su/catlean/_0.H (J)Z
// 0a6: iload 34
// 0a8: ifeq 0ce
// 0ab: ifne 0e3
// 0ae: goto 0bb
// 0b1: ldc2_w 8235953089097206862
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 0
// 0bc: lload 27
// 0be: invokespecial su/catlean/_0.p (J)Z
// 0c1: goto 0ce
// 0c4: ldc2_w 8235953089097206862
// 0c7: lload 2
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: iload 34
// 0d0: ifeq 14c
// 0d3: ifeq 149
// 0d6: goto 0e3
// 0d9: ldc2_w 8235953089097206862
// 0dc: lload 2
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 0e6: new su/catlean/_w
// 0e9: dup
// 0ea: aload 0
// 0eb: lload 27
// 0ed: invokespecial su/catlean/_0.p (J)Z
// 0f0: ifeq 110
// 0f3: goto 100
// 0f6: ldc2_w 8235953089097206862
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: getstatic su/catlean/_0.A F
// 103: goto 118
// 106: ldc2_w 8235953089097206862
// 109: lload 2
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: lload 16
// 112: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 115: invokevirtual net/minecraft/class_746.method_36454 ()F
// 118: aload 0
// 119: lload 29
// 11b: invokespecial su/catlean/_0.V (J)F
// 11e: lload 25
// 120: dup2_x1
// 121: pop2
// 122: bipush 0
// 123: aconst_null
// 124: sipush 3289
// 127: ldc2_w 2644226830350122273
// 12a: lload 2
// 12b: lxor
// 12c: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: aconst_null
// 132: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 135: sipush 13477
// 138: ldc2_w 2577448578216215898
// 13b: lload 2
// 13c: lxor
// 13d: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: lload 8
// 144: dup2_x2
// 145: pop2
// 146: invokevirtual su/catlean/_8.O (JLsu/catlean/_w;I)V
// 149: getstatic su/catlean/_0.b I
// 14c: iload 34
// 14e: ifeq 202
// 151: ifle 1fc
// 154: goto 161
// 157: ldc2_w 8235953089097206862
// 15a: lload 2
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: getstatic su/catlean/_0.b I
// 164: istore 35
// 166: iload 35
// 168: bipush -1
// 169: iadd
// 16a: putstatic su/catlean/_0.b I
// 16d: lload 4
// 16f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 172: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 175: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 178: bipush 0
// 179: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 17c: lload 4
// 17e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 181: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 184: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 187: bipush 0
// 188: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 18b: lload 4
// 18d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 190: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 193: getfield net/minecraft/class_315.field_1867 Lnet/minecraft/class_304;
// 196: bipush 0
// 197: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 19a: aload 0
// 19b: lload 10
// 19d: invokespecial su/catlean/_0.h (J)V
// 1a0: aload 0
// 1a1: lload 23
// 1a3: invokespecial su/catlean/_0.R (J)V
// 1a6: aload 0
// 1a7: iload 18
// 1a9: iload 19
// 1ab: iload 20
// 1ad: invokespecial su/catlean/_0.i (III)V
// 1b0: aload 0
// 1b1: lload 12
// 1b3: invokespecial su/catlean/_0.w (J)V
// 1b6: lload 16
// 1b8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1bb: invokevirtual net/minecraft/class_746.method_36454 ()F
// 1be: putstatic su/catlean/_0.A F
// 1c1: bipush 0
// 1c2: putstatic su/catlean/_0.V Z
// 1c5: bipush 0
// 1c6: putstatic su/catlean/_0.L Z
// 1c9: lload 16
// 1cb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ce: iload 34
// 1d0: ifeq 1f8
// 1d3: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 1d6: ifeq 1fb
// 1d9: goto 1e6
// 1dc: ldc2_w 8235953089097206862
// 1df: lload 2
// 1e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e5: athrow
// 1e6: lload 16
// 1e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1eb: goto 1f8
// 1ee: ldc2_w 8235953089097206862
// 1f1: lload 2
// 1f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: athrow
// 1f8: invokevirtual net/minecraft/class_746.method_66281 ()V
// 1fb: return
// 1fc: aload 0
// 1fd: lload 14
// 1ff: invokespecial su/catlean/_0.A (J)Z
// 202: iload 34
// 204: ifeq 286
// 207: ifne 236
// 20a: goto 217
// 20d: ldc2_w 8235953089097206862
// 210: lload 2
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: aload 0
// 218: lload 10
// 21a: invokespecial su/catlean/_0.h (J)V
// 21d: aload 0
// 21e: lload 23
// 220: invokespecial su/catlean/_0.R (J)V
// 223: bipush 0
// 224: putstatic su/catlean/_0.V Z
// 227: bipush 0
// 228: putstatic su/catlean/_0.f Z
// 22b: return
// 22c: ldc2_w 8235953089097206862
// 22f: lload 2
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: lload 16
// 238: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23b: bipush 1
// 23c: invokevirtual net/minecraft/class_746.method_5728 (Z)V
// 23f: lload 4
// 241: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 244: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 247: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 24a: bipush 1
// 24b: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 24e: lload 4
// 250: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 253: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 256: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 259: bipush 1
// 25a: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 25d: lload 4
// 25f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 262: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 265: getfield net/minecraft/class_315.field_1867 Lnet/minecraft/class_304;
// 268: bipush 1
// 269: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 26c: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 26f: invokevirtual su/catlean/dm.o ()D
// 272: iload 34
// 274: ifeq 29d
// 277: dconst_1
// 278: dcmpl
// 279: goto 286
// 27c: ldc2_w 8235953089097206862
// 27f: lload 2
// 280: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 285: athrow
// 286: ifle 297
// 289: fconst_0
// 28a: goto 29e
// 28d: ldc2_w 8235953089097206862
// 290: lload 2
// 291: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: athrow
// 297: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 29a: invokevirtual su/catlean/dm.o ()D
// 29d: d2f
// 29e: fstore 35
// 2a0: lload 16
// 2a2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a5: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 2a8: iload 34
// 2aa: ifeq 2d2
// 2ad: ifeq 2ce
// 2b0: goto 2bd
// 2b3: ldc2_w 8235953089097206862
// 2b6: lload 2
// 2b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bc: athrow
// 2bd: bipush 0
// 2be: putstatic su/catlean/_0.f Z
// 2c1: goto 2ce
// 2c4: ldc2_w 8235953089097206862
// 2c7: lload 2
// 2c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cd: athrow
// 2ce: fload 35
// 2d0: fconst_0
// 2d1: fcmpl
// 2d2: iload 34
// 2d4: ifeq 2ea
// 2d7: ifle 3f7
// 2da: goto 2e7
// 2dd: ldc2_w 8235953089097206862
// 2e0: lload 2
// 2e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: athrow
// 2e7: getstatic su/catlean/_0.f Z
// 2ea: iload 34
// 2ec: ifeq 3a1
// 2ef: ifne 387
// 2f2: goto 2ff
// 2f5: ldc2_w 8235953089097206862
// 2f8: lload 2
// 2f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fe: athrow
// 2ff: aload 0
// 300: lload 6
// 302: invokespecial su/catlean/_0.v (J)Z
// 305: iload 34
// 307: ifeq 3a1
// 30a: goto 317
// 30d: ldc2_w 8235953089097206862
// 310: lload 2
// 311: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: athrow
// 317: ifeq 387
// 31a: goto 327
// 31d: ldc2_w 8235953089097206862
// 320: lload 2
// 321: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 326: athrow
// 327: getstatic su/catlean/_0.O Ljava/util/Queue;
// 32a: invokeinterface java/util/Queue.size ()I 1
// 32f: iload 34
// 331: ifeq 384
// 334: goto 341
// 337: ldc2_w 8235953089097206862
// 33a: lload 2
// 33b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 340: athrow
// 341: sipush 9129
// 344: ldc2_w 4397770130118529628
// 347: lload 2
// 348: lxor
// 349: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34e: if_icmple 37d
// 351: goto 35e
// 354: ldc2_w 8235953089097206862
// 357: lload 2
// 358: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35d: athrow
// 35e: aload 0
// 35f: lload 23
// 361: invokespecial su/catlean/_0.R (J)V
// 364: lload 16
// 366: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 369: invokevirtual net/minecraft/class_746.method_66281 ()V
// 36c: bipush 0
// 36d: putstatic su/catlean/_0.V Z
// 370: goto 37d
// 373: ldc2_w 8235953089097206862
// 376: lload 2
// 377: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37c: athrow
// 37d: aload 0
// 37e: lload 10
// 380: invokespecial su/catlean/_0.h (J)V
// 383: bipush 1
// 384: putstatic su/catlean/_0.f Z
// 387: lload 16
// 389: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 38c: iload 34
// 38e: ifeq 40d
// 391: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 394: goto 3a1
// 397: ldc2_w 8235953089097206862
// 39a: lload 2
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: ifne 3f7
// 3a4: getstatic su/catlean/_0.V Z
// 3a7: iload 34
// 3a9: ifeq 3de
// 3ac: goto 3b9
// 3af: ldc2_w 8235953089097206862
// 3b2: lload 2
// 3b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b8: athrow
// 3b9: ifne 3f7
// 3bc: goto 3c9
// 3bf: ldc2_w 8235953089097206862
// 3c2: lload 2
// 3c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c8: athrow
// 3c9: aload 0
// 3ca: iload 31
// 3cc: lload 32
// 3ce: invokespecial su/catlean/_0.E (IJ)Z
// 3d1: goto 3de
// 3d4: ldc2_w 8235953089097206862
// 3d7: lload 2
// 3d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3dd: athrow
// 3de: iload 34
// 3e0: ifeq 3f4
// 3e3: ifeq 3f7
// 3e6: goto 3f3
// 3e9: ldc2_w 8235953089097206862
// 3ec: lload 2
// 3ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f2: athrow
// 3f3: bipush 1
// 3f4: putstatic su/catlean/_0.V Z
// 3f7: lload 16
// 3f9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3fc: dup
// 3fd: sipush 11386
// 400: ldc2_w 5135443649684369589
// 403: lload 2
// 404: lxor
// 405: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 40d: checkcast su/catlean/mixins/accessors/LivingEntityAccessor
// 410: bipush 0
// 411: invokeinterface su/catlean/mixins/accessors/LivingEntityAccessor.setLastJumpCooldown (I)V 2
// 416: return
}

@Flow
private final void U(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_0.e J
// 003: ldc2_w 75341434380640
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 95821200910181
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 49081261607934
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 104561753410406
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 127620305519107
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 7524320457162
// 029: lxor
// 02a: lstore 12
// 02c: pop2
// 02d: ldc2_w 7183457763420483281
// 030: lload 2
// 031: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: istore 14
// 038: aload 1
// 039: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 03c: instanceof net/minecraft/class_2708
// 03f: iload 14
// 041: ifeq 094
// 044: ifeq 08d
// 047: goto 054
// 04a: ldc2_w 7191668663604649416
// 04d: lload 2
// 04e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: athrow
// 054: bipush 0
// 055: putstatic su/catlean/_0.V Z
// 058: sipush 12138
// 05b: bipush 0
// 05c: putstatic su/catlean/_0.L Z
// 05f: ldc2_w 7759828149915602712
// 062: lload 2
// 063: lxor
// 064: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: putstatic su/catlean/_0.b I
// 06c: aload 0
// 06d: lload 8
// 06f: invokespecial su/catlean/_0.h (J)V
// 072: aload 0
// 073: lload 10
// 075: invokespecial su/catlean/_0.R (J)V
// 078: lload 12
// 07a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07d: invokevirtual net/minecraft/class_746.method_66281 ()V
// 080: goto 08d
// 083: ldc2_w 7191668663604649416
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: aload 1
// 08e: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 091: instanceof net/minecraft/class_2739
// 094: iload 14
// 096: ifeq 138
// 099: ifeq 131
// 09c: goto 0a9
// 09f: ldc2_w 7191668663604649416
// 0a2: lload 2
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: lload 12
// 0ab: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ae: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 0b1: iload 14
// 0b3: ifeq 138
// 0b6: goto 0c3
// 0b9: ldc2_w 7191668663604649416
// 0bc: lload 2
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: ifeq 131
// 0c6: goto 0d3
// 0c9: ldc2_w 7191668663604649416
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: getstatic su/catlean/_0.V Z
// 0d6: iload 14
// 0d8: ifeq 138
// 0db: goto 0e8
// 0de: ldc2_w 7191668663604649416
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: ifeq 131
// 0eb: goto 0f8
// 0ee: ldc2_w 7191668663604649416
// 0f1: lload 2
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: aload 0
// 0f9: lload 4
// 0fb: invokespecial su/catlean/_0.Z (J)Z
// 0fe: iload 14
// 100: ifeq 138
// 103: goto 110
// 106: ldc2_w 7191668663604649416
// 109: lload 2
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: ifeq 131
// 113: goto 120
// 116: ldc2_w 7191668663604649416
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: aload 1
// 121: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 124: goto 131
// 127: ldc2_w 7191668663604649416
// 12a: lload 2
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: aload 1
// 132: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 135: instanceof net/minecraft/class_6373
// 138: iload 14
// 13a: ifeq 162
// 13d: ifeq 1e9
// 140: goto 14d
// 143: ldc2_w 7191668663604649416
// 146: lload 2
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: lload 12
// 14f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 152: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 155: goto 162
// 158: ldc2_w 7191668663604649416
// 15b: lload 2
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: iload 14
// 164: ifeq 17a
// 167: ifeq 1e9
// 16a: goto 177
// 16d: ldc2_w 7191668663604649416
// 170: lload 2
// 171: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: athrow
// 177: getstatic su/catlean/_0.V Z
// 17a: iload 14
// 17c: ifeq 1a2
// 17f: ifeq 1e9
// 182: goto 18f
// 185: ldc2_w 7191668663604649416
// 188: lload 2
// 189: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: athrow
// 18f: aload 0
// 190: lload 6
// 192: invokespecial su/catlean/_0.v (J)Z
// 195: goto 1a2
// 198: ldc2_w 7191668663604649416
// 19b: lload 2
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: iload 14
// 1a4: ifeq 1e8
// 1a7: ifeq 1e9
// 1aa: goto 1b7
// 1ad: ldc2_w 7191668663604649416
// 1b0: lload 2
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: aload 1
// 1b8: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 1bb: getstatic su/catlean/_0.O Ljava/util/Queue;
// 1be: aload 1
// 1bf: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 1c2: dup
// 1c3: sipush 2043
// 1c6: ldc2_w 7695282736961505972
// 1c9: lload 2
// 1ca: lxor
// 1cb: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1d3: checkcast net/minecraft/class_6373
// 1d6: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
// 1db: goto 1e8
// 1de: ldc2_w 7191668663604649416
// 1e1: lload 2
// 1e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: athrow
// 1e8: pop
// 1e9: return
}

@Flow
private final void J(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_0.e J
// 003: ldc2_w 74644043903406
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 48126182267696
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 2087950981695
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: dup2
// 032: ldc2_w 66649845886031
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 79427780413553
// 03c: lxor
// 03d: dup2
// 03e: bipush 32
// 040: lushr
// 041: lstore 11
// 043: dup2
// 044: bipush 32
// 046: lshl
// 047: bipush 32
// 049: lushr
// 04a: l2i
// 04b: istore 13
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 4012750004131
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 1860872495364
// 059: lxor
// 05a: lstore 16
// 05c: pop2
// 05d: ldc2_w 3736958671468397720
// 060: lload 2
// 061: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: istore 18
// 068: aload 0
// 069: iload 18
// 06b: ifne 143
// 06e: lload 11
// 070: iload 13
// 072: invokespecial su/catlean/_0.Y (JI)Lsu/catlean/t6;
// 075: getstatic su/catlean/t6.FULL Lsu/catlean/t6;
// 078: if_acmpne 142
// 07b: goto 088
// 07e: ldc2_w 3676054319295155462
// 081: lload 2
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: lload 16
// 08a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 08d: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 090: iload 18
// 092: ifne 148
// 095: goto 0a2
// 098: ldc2_w 3676054319295155462
// 09b: lload 2
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: ifeq 142
// 0a5: goto 0b2
// 0a8: ldc2_w 3676054319295155462
// 0ab: lload 2
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: getstatic su/catlean/_0.V Z
// 0b5: iload 18
// 0b7: ifne 148
// 0ba: goto 0c7
// 0bd: ldc2_w 3676054319295155462
// 0c0: lload 2
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: ifeq 142
// 0ca: goto 0d7
// 0cd: ldc2_w 3676054319295155462
// 0d0: lload 2
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: getstatic su/catlean/_0.K Z
// 0da: iload 18
// 0dc: ifne 148
// 0df: goto 0ec
// 0e2: ldc2_w 3676054319295155462
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: ifne 142
// 0ef: goto 0fc
// 0f2: ldc2_w 3676054319295155462
// 0f5: lload 2
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: aload 0
// 0fd: lload 4
// 0ff: invokespecial su/catlean/_0.v (J)Z
// 102: iload 18
// 104: ifne 148
// 107: goto 114
// 10a: ldc2_w 3676054319295155462
// 10d: lload 2
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: ifeq 142
// 117: goto 124
// 11a: ldc2_w 3676054319295155462
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: aload 1
// 125: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 128: getstatic su/catlean/_0.l Ljava/util/Queue;
// 12b: aload 1
// 12c: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 12f: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
// 134: pop
// 135: goto 142
// 138: ldc2_w 3676054319295155462
// 13b: lload 2
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: aload 0
// 143: lload 4
// 145: invokespecial su/catlean/_0.v (J)Z
// 148: iload 18
// 14a: ifne 160
// 14d: ifne 5a6
// 150: goto 15d
// 153: ldc2_w 3676054319295155462
// 156: lload 2
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: getstatic su/catlean/_0.K Z
// 160: ifne 5a6
// 163: lload 16
// 165: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 168: dup
// 169: sipush 32412
// 16c: ldc2_w 8711973220129923864
// 16f: lload 2
// 170: lxor
// 171: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 179: checkcast su/catlean/mixins/accessors/LocalPlayerAccessor
// 17c: invokeinterface su/catlean/mixins/accessors/LocalPlayerAccessor.getLastBaseY ()D 1
// 181: dstore 19
// 183: getstatic su/catlean/_0.B Z
// 186: iload 18
// 188: ifne 1b2
// 18b: ifne 1cb
// 18e: goto 19b
// 191: ldc2_w 3676054319295155462
// 194: lload 2
// 195: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: athrow
// 19b: aload 0
// 19c: dload 19
// 19e: invokespecial su/catlean/_0.t (D)D
// 1a1: ldc2_w 0.4
// 1a4: dcmpl
// 1a5: goto 1b2
// 1a8: ldc2_w 3676054319295155462
// 1ab: lload 2
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: iload 18
// 1b4: ifne 1c8
// 1b7: iflt 1cb
// 1ba: goto 1c7
// 1bd: ldc2_w 3676054319295155462
// 1c0: lload 2
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: bipush 1
// 1c8: goto 1cc
// 1cb: bipush 0
// 1cc: istore 21
// 1ce: aload 1
// 1cf: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 1d2: instanceof net/minecraft/class_6374
// 1d5: iload 18
// 1d7: ifne 393
// 1da: ifeq 37a
// 1dd: goto 1ea
// 1e0: ldc2_w 3676054319295155462
// 1e3: lload 2
// 1e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e9: athrow
// 1ea: getstatic su/catlean/_0.V Z
// 1ed: iload 18
// 1ef: ifne 224
// 1f2: goto 1ff
// 1f5: ldc2_w 3676054319295155462
// 1f8: lload 2
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: ifeq 367
// 202: goto 20f
// 205: ldc2_w 3676054319295155462
// 208: lload 2
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: lload 16
// 211: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 214: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 217: goto 224
// 21a: ldc2_w 3676054319295155462
// 21d: lload 2
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: iload 18
// 226: ifne 25e
// 229: ifeq 367
// 22c: goto 239
// 22f: ldc2_w 3676054319295155462
// 232: lload 2
// 233: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 238: athrow
// 239: lload 14
// 23b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 23e: lload 16
// 240: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 243: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 246: dconst_0
// 247: ldc2_w -1.0
// 24a: dconst_0
// 24b: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 24e: invokevirtual net/minecraft/class_638.method_18026 (Lnet/minecraft/class_238;)Z
// 251: goto 25e
// 254: ldc2_w 3676054319295155462
// 257: lload 2
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: iload 18
// 260: ifne 33a
// 263: ifne 338
// 266: goto 273
// 269: ldc2_w 3676054319295155462
// 26c: lload 2
// 26d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 272: athrow
// 273: getstatic su/catlean/_0.B Z
// 276: iload 18
// 278: ifne 2c7
// 27b: goto 288
// 27e: ldc2_w 3676054319295155462
// 281: lload 2
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: ifeq 2c4
// 28b: goto 298
// 28e: ldc2_w 3676054319295155462
// 291: lload 2
// 292: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 297: athrow
// 298: aload 0
// 299: dload 19
// 29b: invokespecial su/catlean/_0.t (D)D
// 29e: ldc2_w 0.8
// 2a1: dcmpg
// 2a2: iload 18
// 2a4: ifne 333
// 2a7: goto 2b4
// 2aa: ldc2_w 3676054319295155462
// 2ad: lload 2
// 2ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: athrow
// 2b4: iflt 308
// 2b7: goto 2c4
// 2ba: ldc2_w 3676054319295155462
// 2bd: lload 2
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: getstatic su/catlean/_0.B Z
// 2c7: iload 18
// 2c9: ifne 33a
// 2cc: ifne 338
// 2cf: goto 2dc
// 2d2: ldc2_w 3676054319295155462
// 2d5: lload 2
// 2d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2db: athrow
// 2dc: aload 0
// 2dd: dload 19
// 2df: invokespecial su/catlean/_0.t (D)D
// 2e2: ldc2_w 0.4
// 2e5: dcmpg
// 2e6: iload 18
// 2e8: ifne 33a
// 2eb: goto 2f8
// 2ee: ldc2_w 3676054319295155462
// 2f1: lload 2
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: ifge 338
// 2fb: goto 308
// 2fe: ldc2_w 3676054319295155462
// 301: lload 2
// 302: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 307: athrow
// 308: getstatic su/catlean/_0.C Ljava/util/LinkedList;
// 30b: aload 1
// 30c: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 30f: dup
// 310: sipush 16341
// 313: ldc2_w 4594346765701128778
// 316: lload 2
// 317: lxor
// 318: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 320: checkcast net/minecraft/class_6374
// 323: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
// 326: goto 333
// 329: ldc2_w 3676054319295155462
// 32c: lload 2
// 32d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 332: athrow
// 333: pop
// 334: aload 1
// 335: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 338: iload 21
// 33a: iload 18
// 33c: ifne 393
// 33f: ifeq 37a
// 342: goto 34f
// 345: ldc2_w 3676054319295155462
// 348: lload 2
// 349: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34e: athrow
// 34f: aload 0
// 350: lload 9
// 352: invokespecial su/catlean/_0.w (J)V
// 355: iload 18
// 357: ifeq 37a
// 35a: goto 367
// 35d: ldc2_w 3676054319295155462
// 360: lload 2
// 361: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 366: athrow
// 367: aload 0
// 368: lload 9
// 36a: invokespecial su/catlean/_0.w (J)V
// 36d: goto 37a
// 370: ldc2_w 3676054319295155462
// 373: lload 2
// 374: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 379: athrow
// 37a: aload 1
// 37b: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 37e: iload 18
// 380: ifne 3b8
// 383: instanceof net/minecraft/class_2828
// 386: goto 393
// 389: ldc2_w 3676054319295155462
// 38c: lload 2
// 38d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 392: athrow
// 393: ifeq 5a6
// 396: aload 1
// 397: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 39a: dup
// 39b: sipush 3535
// 39e: ldc2_w 8530050622942154840
// 3a1: lload 2
// 3a2: lxor
// 3a3: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 3ab: goto 3b8
// 3ae: ldc2_w 3676054319295155462
// 3b1: lload 2
// 3b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b7: athrow
// 3b8: checkcast net/minecraft/class_2828
// 3bb: astore 22
// 3bd: getstatic su/catlean/_0.V Z
// 3c0: iload 18
// 3c2: ifne 3ea
// 3c5: ifeq 58f
// 3c8: goto 3d5
// 3cb: ldc2_w 3676054319295155462
// 3ce: lload 2
// 3cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d4: athrow
// 3d5: lload 16
// 3d7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3da: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 3dd: goto 3ea
// 3e0: ldc2_w 3676054319295155462
// 3e3: lload 2
// 3e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e9: athrow
// 3ea: iload 18
// 3ec: ifne 418
// 3ef: ifeq 58f
// 3f2: goto 3ff
// 3f5: ldc2_w 3676054319295155462
// 3f8: lload 2
// 3f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fe: athrow
// 3ff: aload 22
// 401: getstatic su/catlean/_0.G D
// 404: invokevirtual net/minecraft/class_2828.method_12268 (D)D
// 407: getstatic su/catlean/_0.G D
// 40a: dcmpg
// 40b: goto 418
// 40e: ldc2_w 3676054319295155462
// 411: lload 2
// 412: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 417: athrow
// 418: iload 18
// 41a: ifne 45c
// 41d: ifge 443
// 420: goto 42d
// 423: ldc2_w 3676054319295155462
// 426: lload 2
// 427: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42c: athrow
// 42d: bipush 1
// 42e: putstatic su/catlean/_0.B Z
// 431: iload 18
// 433: ifeq 482
// 436: goto 443
// 439: ldc2_w 3676054319295155462
// 43c: lload 2
// 43d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 442: athrow
// 443: aload 22
// 445: getstatic su/catlean/_0.G D
// 448: invokevirtual net/minecraft/class_2828.method_12268 (D)D
// 44b: getstatic su/catlean/_0.G D
// 44e: dcmpl
// 44f: goto 45c
// 452: ldc2_w 3676054319295155462
// 455: lload 2
// 456: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45b: athrow
// 45c: iload 18
// 45e: ifne 4a5
// 461: ifle 482
// 464: goto 471
// 467: ldc2_w 3676054319295155462
// 46a: lload 2
// 46b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 470: athrow
// 471: bipush 0
// 472: putstatic su/catlean/_0.B Z
// 475: goto 482
// 478: ldc2_w 3676054319295155462
// 47b: lload 2
// 47c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 481: athrow
// 482: aload 22
// 484: getstatic su/catlean/_0.G D
// 487: invokevirtual net/minecraft/class_2828.method_12268 (D)D
// 48a: putstatic su/catlean/_0.G D
// 48d: lload 14
// 48f: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 492: lload 16
// 494: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 497: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 49a: dconst_0
// 49b: ldc2_w -1.0
// 49e: dconst_0
// 49f: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 4a2: invokevirtual net/minecraft/class_638.method_18026 (Lnet/minecraft/class_238;)Z
// 4a5: iload 18
// 4a7: ifne 570
// 4aa: ifne 56e
// 4ad: goto 4ba
// 4b0: ldc2_w 3676054319295155462
// 4b3: lload 2
// 4b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b9: athrow
// 4ba: getstatic su/catlean/_0.B Z
// 4bd: iload 18
// 4bf: ifne 513
// 4c2: goto 4cf
// 4c5: ldc2_w 3676054319295155462
// 4c8: lload 2
// 4c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ce: athrow
// 4cf: ifeq 510
// 4d2: goto 4df
// 4d5: ldc2_w 3676054319295155462
// 4d8: lload 2
// 4d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4de: athrow
// 4df: aload 0
// 4e0: aload 22
// 4e2: dload 19
// 4e4: invokevirtual net/minecraft/class_2828.method_12268 (D)D
// 4e7: invokespecial su/catlean/_0.t (D)D
// 4ea: ldc2_w 0.8
// 4ed: dcmpg
// 4ee: iload 18
// 4f0: ifne 569
// 4f3: goto 500
// 4f6: ldc2_w 3676054319295155462
// 4f9: lload 2
// 4fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ff: athrow
// 500: iflt 554
// 503: goto 510
// 506: ldc2_w 3676054319295155462
// 509: lload 2
// 50a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50f: athrow
// 510: getstatic su/catlean/_0.B Z
// 513: iload 18
// 515: ifne 570
// 518: ifne 56e
// 51b: goto 528
// 51e: ldc2_w 3676054319295155462
// 521: lload 2
// 522: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 527: athrow
// 528: aload 0
// 529: dload 19
// 52b: invokespecial su/catlean/_0.t (D)D
// 52e: ldc2_w 0.4
// 531: dcmpg
// 532: iload 18
// 534: ifne 570
// 537: goto 544
// 53a: ldc2_w 3676054319295155462
// 53d: lload 2
// 53e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 543: athrow
// 544: ifge 56e
// 547: goto 554
// 54a: ldc2_w 3676054319295155462
// 54d: lload 2
// 54e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 553: athrow
// 554: getstatic su/catlean/_0.N Ljava/util/LinkedList;
// 557: aload 22
// 559: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
// 55c: goto 569
// 55f: ldc2_w 3676054319295155462
// 562: lload 2
// 563: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 568: athrow
// 569: pop
// 56a: aload 1
// 56b: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 56e: iload 21
// 570: ifeq 5a6
// 573: aload 0
// 574: iload 6
// 576: iload 7
// 578: iload 8
// 57a: invokespecial su/catlean/_0.i (III)V
// 57d: iload 18
// 57f: ifeq 5a6
// 582: goto 58f
// 585: ldc2_w 3676054319295155462
// 588: lload 2
// 589: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58e: athrow
// 58f: aload 0
// 590: iload 6
// 592: iload 7
// 594: iload 8
// 596: invokespecial su/catlean/_0.i (III)V
// 599: goto 5a6
// 59c: ldc2_w 3676054319295155462
// 59f: lload 2
// 5a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a5: athrow
// 5a6: return
}

private final double t(double var1) {
return var1 - Math.floor(var1);
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
// 000: lload 1
// 001: dup2
// 002: ldc2_w 64129331416845
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 73907896531847
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 29281619393040
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 7
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 8
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 9
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 43815837977696
// 033: lxor
// 034: lstore 10
// 036: dup2
// 037: ldc2_w 114558609552098
// 03a: lxor
// 03b: lstore 12
// 03d: dup2
// 03e: ldc2_w 44030506242343
// 041: lxor
// 042: dup2
// 043: bipush 48
// 045: lushr
// 046: l2i
// 047: istore 14
// 049: dup2
// 04a: bipush 16
// 04c: lshl
// 04d: bipush 32
// 04f: lushr
// 050: l2i
// 051: istore 15
// 053: dup2
// 054: bipush 48
// 056: lshl
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 16
// 05d: pop2
// 05e: pop2
// 05f: ldc2_w 1392132249108045360
// 062: lload 1
// 063: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: istore 17
// 06a: lload 3
// 06b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 071: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 074: dup
// 075: sipush 12502
// 078: ldc2_w 393905644906351986
// 07b: lload 1
// 07c: lxor
// 07d: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 085: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 088: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 08d: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 090: iload 14
// 092: i2s
// 093: swap
// 094: iload 15
// 096: swap
// 097: iload 16
// 099: i2c
// 09a: swap
// 09b: invokestatic su/catlean/bx.k (SICI)Z
// 09e: iload 17
// 0a0: ifeq 102
// 0a3: ifne 0ce
// 0a6: goto 0b3
// 0a9: ldc2_w 1381739404069367081
// 0ac: lload 1
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: lload 3
// 0b4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b7: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0ba: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 0bd: bipush 0
// 0be: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 0c1: goto 0ce
// 0c4: ldc2_w 1381739404069367081
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: lload 3
// 0cf: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d2: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0d5: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 0d8: dup
// 0d9: sipush 8060
// 0dc: ldc2_w 3947833979797873361
// 0df: lload 1
// 0e0: lxor
// 0e1: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0e9: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 0ec: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 0f1: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 0f4: iload 14
// 0f6: i2s
// 0f7: swap
// 0f8: iload 15
// 0fa: swap
// 0fb: iload 16
// 0fd: i2c
// 0fe: swap
// 0ff: invokestatic su/catlean/bx.k (SICI)Z
// 102: lload 1
// 103: lconst_0
// 104: lcmp
// 105: ifle 15e
// 108: iload 17
// 10a: ifeq 13d
// 10d: ifne 138
// 110: goto 11d
// 113: ldc2_w 1381739404069367081
// 116: lload 1
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: lload 3
// 11e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 121: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 124: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 127: bipush 0
// 128: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 12b: goto 138
// 12e: ldc2_w 1381739404069367081
// 131: lload 1
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: bipush 0
// 139: putstatic su/catlean/_0.V Z
// 13c: bipush 0
// 13d: putstatic su/catlean/_0.L Z
// 140: aload 0
// 141: lload 5
// 143: invokespecial su/catlean/_0.h (J)V
// 146: aload 0
// 147: lload 12
// 149: invokespecial su/catlean/_0.R (J)V
// 14c: aload 0
// 14d: iload 7
// 14f: iload 8
// 151: iload 9
// 153: invokespecial su/catlean/_0.i (III)V
// 156: aload 0
// 157: lload 10
// 159: invokespecial su/catlean/_0.w (J)V
// 15c: iload 17
// 15e: lload 1
// 15f: lconst_0
// 160: lcmp
// 161: ifle 168
// 164: ifne 181
// 167: bipush 5
// 168: anewarray 570
// 16b: ldc2_w 1397120299992947038
// 16e: lload 1
// 16f: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: goto 181
// 177: ldc2_w 1381739404069367081
// 17a: lload 1
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: return
}

private final boolean E(int param1, long param2) {
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
// 005: lload 2
// 006: bipush 32
// 008: lshl
// 009: bipush 32
// 00b: lushr
// 00c: lor
// 00d: getstatic su/catlean/_0.e J
// 010: lxor
// 011: lstore 4
// 013: lload 4
// 015: dup2
// 016: ldc2_w 116723868872869
// 019: lxor
// 01a: lstore 6
// 01c: dup2
// 01d: ldc2_w 77609147733071
// 020: lxor
// 021: lstore 8
// 023: dup2
// 024: ldc2_w 114983644740024
// 027: lxor
// 028: lstore 10
// 02a: dup2
// 02b: ldc2_w 108742344674400
// 02e: lxor
// 02f: dup2
// 030: bipush 48
// 032: lushr
// 033: l2i
// 034: istore 12
// 036: dup2
// 037: bipush 16
// 039: lshl
// 03a: bipush 16
// 03c: lushr
// 03d: lstore 13
// 03f: pop2
// 040: dup2
// 041: ldc2_w 45919295957091
// 044: lxor
// 045: lstore 15
// 047: dup2
// 048: ldc2_w 65471716053583
// 04b: lxor
// 04c: lstore 17
// 04e: dup2
// 04f: ldc2_w 27797595045921
// 052: lxor
// 053: lstore 19
// 055: dup2
// 056: ldc2_w 65803670742538
// 059: lxor
// 05a: lstore 21
// 05c: pop2
// 05d: ldc2_w -5417159148968148074
// 060: lload 4
// 062: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: istore 23
// 069: aload 0
// 06a: lload 8
// 06c: invokespecial su/catlean/_0.A (J)Z
// 06f: iload 23
// 071: ifne 46d
// 074: ifeq 46c
// 077: goto 085
// 07a: ldc2_w -5472492000593884664
// 07d: lload 4
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 088: lload 15
// 08a: invokevirtual su/catlean/gg.O (J)I
// 08d: istore 24
// 08f: iload 24
// 091: sipush 15586
// 094: ldc2_w 2492306549905689433
// 097: lload 4
// 099: lxor
// 09a: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: iload 23
// 0a1: ifne 1c1
// 0a4: if_icmpeq 186
// 0a7: goto 0b5
// 0aa: ldc2_w -5472492000593884664
// 0ad: lload 4
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: iload 24
// 0b7: bipush -1
// 0b8: iload 23
// 0ba: lload 2
// 0bb: lconst_0
// 0bc: lcmp
// 0bd: iflt 1c3
// 0c0: ifne 1c1
// 0c3: goto 0d1
// 0c6: ldc2_w -5472492000593884664
// 0c9: lload 4
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: if_icmpeq 186
// 0d4: goto 0e2
// 0d7: ldc2_w -5472492000593884664
// 0da: lload 4
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: aload 0
// 0e3: lload 6
// 0e5: invokespecial su/catlean/_0.Z (J)Z
// 0e8: iload 23
// 0ea: ifne 1b3
// 0ed: goto 0fb
// 0f0: ldc2_w -5472492000593884664
// 0f3: lload 4
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: ifeq 186
// 0fe: goto 10c
// 101: ldc2_w -5472492000593884664
// 104: lload 4
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: aload 0
// 10d: lload 19
// 10f: invokespecial su/catlean/_0.p (J)Z
// 112: iload 23
// 114: iload 1
// 115: iflt 1b6
// 118: ifne 1b3
// 11b: goto 129
// 11e: ldc2_w -5472492000593884664
// 121: lload 4
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: ifeq 186
// 12c: goto 13a
// 12f: ldc2_w -5472492000593884664
// 132: lload 4
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: iload 24
// 13c: lload 10
// 13e: bipush 0
// 13f: aconst_null
// 140: bipush 0
// 141: sipush 25529
// 144: ldc2_w 1061724044180837388
// 147: lload 4
// 149: lxor
// 14a: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: aconst_null
// 150: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 153: sipush 21493
// 156: ldc2_w 3938235714659395
// 159: lload 4
// 15b: lxor
// 15c: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: lload 10
// 163: bipush 0
// 164: aconst_null
// 165: bipush 0
// 166: sipush 8140
// 169: ldc2_w 5253863167041513596
// 16c: lload 4
// 16e: lxor
// 16f: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: aconst_null
// 175: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 178: goto 186
// 17b: ldc2_w -5472492000593884664
// 17e: lload 4
// 180: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 185: athrow
// 186: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 189: bipush 1
// 18a: invokevirtual su/catlean/qc.K (Z)V
// 18d: lload 21
// 18f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 192: invokevirtual net/minecraft/class_746.method_23669 ()V
// 195: new net/minecraft/class_2848
// 198: dup
// 199: lload 21
// 19b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19e: checkcast net/minecraft/class_1297
// 1a1: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 1a4: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 1a7: checkcast net/minecraft/class_2596
// 1aa: lload 17
// 1ac: dup2_x1
// 1ad: pop2
// 1ae: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 1b1: iload 24
// 1b3: sipush 28671
// 1b6: ldc2_w 9186087556227848270
// 1b9: lload 4
// 1bb: lxor
// 1bc: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c1: iload 23
// 1c3: ifne 2cf
// 1c6: if_icmpeq 2a8
// 1c9: goto 1d7
// 1cc: ldc2_w -5472492000593884664
// 1cf: lload 4
// 1d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: athrow
// 1d7: iload 24
// 1d9: bipush -1
// 1da: iload 1
// 1db: ifle 2cf
// 1de: iload 23
// 1e0: ifne 2cf
// 1e3: goto 1f1
// 1e6: ldc2_w -5472492000593884664
// 1e9: lload 4
// 1eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f0: athrow
// 1f1: if_icmpeq 2a8
// 1f4: goto 202
// 1f7: ldc2_w -5472492000593884664
// 1fa: lload 4
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: aload 0
// 203: lload 6
// 205: invokespecial su/catlean/_0.Z (J)Z
// 208: iload 23
// 20a: ifne 2aa
// 20d: goto 21b
// 210: ldc2_w -5472492000593884664
// 213: lload 4
// 215: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21a: athrow
// 21b: ifeq 2a8
// 21e: goto 22c
// 221: ldc2_w -5472492000593884664
// 224: lload 4
// 226: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22b: athrow
// 22c: aload 0
// 22d: lload 19
// 22f: invokespecial su/catlean/_0.p (J)Z
// 232: iload 23
// 234: lload 2
// 235: lconst_0
// 236: lcmp
// 237: ifle 2ac
// 23a: ifne 2aa
// 23d: goto 24b
// 240: ldc2_w -5472492000593884664
// 243: lload 4
// 245: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: athrow
// 24b: ifeq 2a8
// 24e: goto 25c
// 251: ldc2_w -5472492000593884664
// 254: lload 4
// 256: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: athrow
// 25c: sipush 21493
// 25f: ldc2_w 3938235714659395
// 262: lload 4
// 264: lxor
// 265: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26a: lload 10
// 26c: bipush 0
// 26d: aconst_null
// 26e: bipush 0
// 26f: sipush 8140
// 272: ldc2_w 5253863167041513596
// 275: lload 4
// 277: lxor
// 278: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27d: aconst_null
// 27e: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 281: iload 24
// 283: lload 10
// 285: bipush 0
// 286: aconst_null
// 287: bipush 1
// 288: sipush 21493
// 28b: ldc2_w 3938235714659395
// 28e: lload 4
// 290: lxor
// 291: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: aconst_null
// 297: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 29a: goto 2a8
// 29d: ldc2_w -5472492000593884664
// 2a0: lload 4
// 2a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a7: athrow
// 2a8: iload 24
// 2aa: iload 23
// 2ac: iload 1
// 2ad: iflt 2c1
// 2b0: ifne 46b
// 2b3: sipush 28671
// 2b6: ldc2_w 9186087556227848270
// 2b9: lload 4
// 2bb: lxor
// 2bc: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c1: goto 2cf
// 2c4: ldc2_w -5472492000593884664
// 2c7: lload 4
// 2c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ce: athrow
// 2cf: lload 2
// 2d0: lconst_0
// 2d1: lcmp
// 2d2: iflt 2e0
// 2d5: if_icmpne 46a
// 2d8: aload 0
// 2d9: lload 6
// 2db: invokespecial su/catlean/_0.Z (J)Z
// 2de: iload 23
// 2e0: ifne 46b
// 2e3: goto 2f1
// 2e6: ldc2_w -5472492000593884664
// 2e9: lload 4
// 2eb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f0: athrow
// 2f1: ifeq 46a
// 2f4: goto 302
// 2f7: ldc2_w -5472492000593884664
// 2fa: lload 4
// 2fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 301: athrow
// 302: aload 0
// 303: lload 19
// 305: invokespecial su/catlean/_0.p (J)Z
// 308: iload 23
// 30a: ifne 46b
// 30d: goto 31b
// 310: ldc2_w -5472492000593884664
// 313: lload 4
// 315: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31a: athrow
// 31b: ifeq 46a
// 31e: goto 32c
// 321: ldc2_w -5472492000593884664
// 324: lload 4
// 326: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32b: athrow
// 32c: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 32f: sipush 21493
// 332: ldc2_w 3938235714659395
// 335: lload 4
// 337: lxor
// 338: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: anewarray 841
// 340: astore 26
// 342: aload 26
// 344: bipush 0
// 345: getstatic net/minecraft/class_1802.field_22028 Lnet/minecraft/class_1792;
// 348: dup
// 349: sipush 21541
// 34c: ldc2_w 2008625869033361074
// 34f: lload 4
// 351: lxor
// 352: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 357: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 35a: aastore
// 35b: aload 26
// 35d: bipush 1
// 35e: getstatic net/minecraft/class_1802.field_8058 Lnet/minecraft/class_1792;
// 361: dup
// 362: sipush 24224
// 365: ldc2_w 1603858310029657121
// 368: lload 4
// 36a: lxor
// 36b: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 373: aastore
// 374: aload 26
// 376: bipush 2
// 377: getstatic net/minecraft/class_1802.field_8523 Lnet/minecraft/class_1792;
// 37a: dup
// 37b: sipush 10556
// 37e: ldc2_w 1773051489937765304
// 381: lload 4
// 383: lxor
// 384: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 389: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 38c: aastore
// 38d: aload 26
// 38f: bipush 3
// 390: getstatic net/minecraft/class_1802.field_8678 Lnet/minecraft/class_1792;
// 393: dup
// 394: sipush 23081
// 397: ldc2_w 2545336454397640833
// 39a: lload 4
// 39c: lxor
// 39d: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3a5: aastore
// 3a6: aload 26
// 3a8: bipush 4
// 3a9: getstatic net/minecraft/class_1802.field_8577 Lnet/minecraft/class_1792;
// 3ac: dup
// 3ad: sipush 8372
// 3b0: ldc2_w 6492806727557429815
// 3b3: lload 4
// 3b5: lxor
// 3b6: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3be: aastore
// 3bf: aload 26
// 3c1: bipush 5
// 3c2: getstatic net/minecraft/class_1802.field_8873 Lnet/minecraft/class_1792;
// 3c5: dup
// 3c6: sipush 16910
// 3c9: ldc2_w 1479526080854186120
// 3cc: lload 4
// 3ce: lxor
// 3cf: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3d7: aastore
// 3d8: aload 26
// 3da: iload 12
// 3dc: i2c
// 3dd: lload 13
// 3df: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 3e2: astore 25
// 3e4: aload 25
// 3e6: invokevirtual su/catlean/fg.R ()Z
// 3e9: iload 23
// 3eb: ifne 46b
// 3ee: ifeq 46a
// 3f1: goto 3ff
// 3f4: ldc2_w -5472492000593884664
// 3f7: lload 4
// 3f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fe: athrow
// 3ff: aload 25
// 401: invokevirtual su/catlean/fg.a ()I
// 404: lload 10
// 406: bipush 0
// 407: aconst_null
// 408: bipush 0
// 409: sipush 8140
// 40c: ldc2_w 5253863167041513596
// 40f: lload 4
// 411: lxor
// 412: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 417: aconst_null
// 418: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 41b: sipush 21493
// 41e: ldc2_w 3938235714659395
// 421: lload 4
// 423: lxor
// 424: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 429: lload 10
// 42b: bipush 0
// 42c: aconst_null
// 42d: bipush 0
// 42e: sipush 8140
// 431: ldc2_w 5253863167041513596
// 434: lload 4
// 436: lxor
// 437: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43c: aconst_null
// 43d: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 440: aload 25
// 442: invokevirtual su/catlean/fg.a ()I
// 445: lload 10
// 447: bipush 0
// 448: aconst_null
// 449: bipush 1
// 44a: sipush 21493
// 44d: ldc2_w 3938235714659395
// 450: lload 4
// 452: lxor
// 453: invokedynamic g (IJ)I bsm=su/catlean/_0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 458: aconst_null
// 459: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 45c: goto 46a
// 45f: ldc2_w -5472492000593884664
// 462: lload 4
// 464: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 469: athrow
// 46a: bipush 1
// 46b: ireturn
// 46c: bipush 0
// 46d: ireturn
}

private final boolean A(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_0.e J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 91925194581807
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 118753314863629
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 82334125798459
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 18075629846505
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 36265729415083
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 2658455220608
// 02d: lxor
// 02e: lstore 13
// 030: pop2
// 031: ldc2_w -6676485535343373284
// 034: lload 1
// 035: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: istore 15
// 03c: lload 13
// 03e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 041: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 044: getfield net/minecraft/class_1656.field_7479 Z
// 047: iload 15
// 049: ifne 24d
// 04c: ifne 24c
// 04f: goto 05c
// 052: ldc2_w -6663088606740783742
// 055: lload 1
// 056: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: athrow
// 05c: lload 13
// 05e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 061: invokevirtual net/minecraft/class_746.method_5765 ()Z
// 064: iload 15
// 066: ifne 24d
// 069: goto 076
// 06c: ldc2_w -6663088606740783742
// 06f: lload 1
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: ifne 24c
// 079: goto 086
// 07c: ldc2_w -6663088606740783742
// 07f: lload 1
// 080: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: athrow
// 086: lload 13
// 088: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 08b: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 08e: iload 15
// 090: ifne 24d
// 093: goto 0a0
// 096: ldc2_w -6663088606740783742
// 099: lload 1
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: ifne 24c
// 0a3: goto 0b0
// 0a6: ldc2_w -6663088606740783742
// 0a9: lload 1
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: lload 13
// 0b2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b5: getstatic net/minecraft/class_1294.field_5902 Lnet/minecraft/class_6880;
// 0b8: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 0bb: iload 15
// 0bd: ifne 24d
// 0c0: goto 0cd
// 0c3: ldc2_w -6663088606740783742
// 0c6: lload 1
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: ifne 24c
// 0d0: goto 0dd
// 0d3: ldc2_w -6663088606740783742
// 0d6: lload 1
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: lload 13
// 0df: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e2: invokevirtual net/minecraft/class_746.method_7344 ()Lnet/minecraft/class_1702;
// 0e5: invokevirtual net/minecraft/class_1702.method_7586 ()I
// 0e8: i2f
// 0e9: ldc 6.0
// 0eb: fcmpl
// 0ec: iload 15
// 0ee: ifne 24d
// 0f1: goto 0fe
// 0f4: ldc2_w -6663088606740783742
// 0f7: lload 1
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: ifle 24c
// 101: goto 10e
// 104: ldc2_w -6663088606740783742
// 107: lload 1
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: lload 13
// 110: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 113: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 116: invokevirtual net/minecraft/class_746.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
// 119: dup
// 11a: sipush 21181
// 11d: ldc2_w 3129245741461036954
// 120: lload 1
// 121: lxor
// 122: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/_0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12a: astore 16
// 12c: aload 16
// 12e: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 131: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
// 134: iload 15
// 136: ifne 1ed
// 139: ifeq 1db
// 13c: goto 149
// 13f: ldc2_w -6663088606740783742
// 142: lload 1
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: aload 0
// 14a: aload 16
// 14c: lload 7
// 14e: invokevirtual su/catlean/_0.B (Lnet/minecraft/class_1799;J)Z
// 151: iload 15
// 153: ifne 247
// 156: goto 163
// 159: ldc2_w -6663088606740783742
// 15c: lload 1
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: lload 1
// 164: lconst_0
// 165: lcmp
// 166: ifle 23a
// 169: ifne 239
// 16c: goto 179
// 16f: ldc2_w -6663088606740783742
// 172: lload 1
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: aload 0
// 17a: lload 5
// 17c: invokespecial su/catlean/_0.Q (J)Z
// 17f: iload 15
// 181: lload 1
// 182: lconst_0
// 183: lcmp
// 184: iflt 1ef
// 187: ifne 1ed
// 18a: goto 197
// 18d: ldc2_w -6663088606740783742
// 190: lload 1
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: lload 1
// 198: lconst_0
// 199: lcmp
// 19a: iflt 1e0
// 19d: ifeq 1db
// 1a0: goto 1ad
// 1a3: ldc2_w -6663088606740783742
// 1a6: lload 1
// 1a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: athrow
// 1ad: aload 0
// 1ae: lload 11
// 1b0: invokespecial su/catlean/_0.p (J)Z
// 1b3: iload 15
// 1b5: ifne 247
// 1b8: goto 1c5
// 1bb: ldc2_w -6663088606740783742
// 1be: lload 1
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: lload 1
// 1c6: lconst_0
// 1c7: lcmp
// 1c8: ifle 23a
// 1cb: ifeq 239
// 1ce: goto 1db
// 1d1: ldc2_w -6663088606740783742
// 1d4: lload 1
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: aload 0
// 1dc: lload 3
// 1dd: invokespecial su/catlean/_0.Z (J)Z
// 1e0: goto 1ed
// 1e3: ldc2_w -6663088606740783742
// 1e6: lload 1
// 1e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: athrow
// 1ed: iload 15
// 1ef: lload 1
// 1f0: lconst_0
// 1f1: lcmp
// 1f2: ifle 21f
// 1f5: ifne 21d
// 1f8: ifeq 24a
// 1fb: goto 208
// 1fe: ldc2_w -6663088606740783742
// 201: lload 1
// 202: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 207: athrow
// 208: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 20b: lload 9
// 20d: invokevirtual su/catlean/gg.O (J)I
// 210: goto 21d
// 213: ldc2_w -6663088606740783742
// 216: lload 1
// 217: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: athrow
// 21d: iload 15
// 21f: lload 1
// 220: lconst_0
// 221: lcmp
// 222: ifle 229
// 225: ifne 247
// 228: bipush -1
// 229: if_icmpeq 24a
// 22c: goto 239
// 22f: ldc2_w -6663088606740783742
// 232: lload 1
// 233: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 238: athrow
// 239: bipush 1
// 23a: goto 247
// 23d: ldc2_w -6663088606740783742
// 240: lload 1
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: goto 24b
// 24a: bipush 0
// 24b: ireturn
// 24c: bipush 0
// 24d: ireturn
}

public final boolean B(@NotNull class_1799 s, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w 1487997676124611554
// 09: lload 2
// 0a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 1
// 10: ldc "s"
// 12: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 15: istore 4
// 17: aload 1
// 18: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 1b: iload 4
// 1d: ifne 4a
// 20: aload 1
// 21: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 24: bipush 1
// 25: isub
// 26: if_icmpge 63
// 29: goto 36
// 2c: ldc2_w 1475423594804931196
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: aload 1
// 37: getstatic net/minecraft/class_9334.field_54197 Lnet/minecraft/class_9331;
// 3a: invokevirtual net/minecraft/class_1799.method_57826 (Lnet/minecraft/class_9331;)Z
// 3d: goto 4a
// 40: ldc2_w 1475423594804931196
// 43: lload 2
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: iload 4
// 4c: ifne 60
// 4f: ifeq 63
// 52: goto 5f
// 55: ldc2_w 1475423594804931196
// 58: lload 2
// 59: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: athrow
// 5f: bipush 1
// 60: goto 64
// 63: bipush 0
// 64: ireturn
}

private final boolean v(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 5101046411102
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 83933444853091
// 11: lxor
// 12: dup2
// 13: bipush 48
// 15: lushr
// 16: l2i
// 17: istore 5
// 19: dup2
// 1a: bipush 16
// 1c: lshl
// 1d: bipush 16
// 1f: lushr
// 20: lstore 6
// 22: pop2
// 23: pop2
// 24: ldc2_w 3137767879497770730
// 27: lload 1
// 28: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d: istore 8
// 2f: aload 0
// 30: lload 3
// 31: invokespecial su/catlean/_0.Z (J)Z
// 34: iload 8
// 36: ifeq 75
// 39: ifne 74
// 3c: goto 49
// 3f: ldc2_w 3167898669883971059
// 42: lload 1
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: aload 0
// 4a: iload 5
// 4c: i2c
// 4d: lload 6
// 4f: invokespecial su/catlean/_0.l (CJ)Z
// 52: iload 8
// 54: ifeq 75
// 57: goto 64
// 5a: ldc2_w 3167898669883971059
// 5d: lload 1
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: ifeq 78
// 67: goto 74
// 6a: ldc2_w 3167898669883971059
// 6d: lload 1
// 6e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: athrow
// 74: bipush 1
// 75: goto 79
// 78: bipush 0
// 79: ireturn
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void h(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 42581007322412L;
int var10000 = vm.a<"Å">(-6119295707546720654L, var1);
K = true;
int var5 = var10000;

label36:
while (!l.isEmpty()) {
try {
Object var9 = l.poll();
Intrinsics.checkNotNullExpressionValue(var9, b<"v">(25150, 4412437062607857609L ^ var1));
_r.a(var3, (class_2596)var9);
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -6093703770382838421L, var1);
}

do {
try {
var10000 = var5;
if (var1 > 0L) {
if (var5 == 0) {
return;
}

var10000 = var5;
}

if (var10000 != 0) {
continue label36;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -6093703770382838421L, var1);
}
} while (var1 < 0L);
break;
}

K = false;
}

private final void R(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 49777240456746
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 79180909328296
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w -2128285137999515881
// 18: lload 1
// 19: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: istore 7
// 20: lload 3
// 21: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 24: invokevirtual net/minecraft/class_310.method_18854 ()Z
// 27: iload 7
// 29: ifeq 51
// 2c: ifeq 88
// 2f: goto 3c
// 32: ldc2_w -2158354810933470194
// 35: lload 1
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: getstatic su/catlean/_0.O Ljava/util/Queue;
// 3f: invokeinterface java/util/Queue.isEmpty ()Z 1
// 44: goto 51
// 47: ldc2_w -2158354810933470194
// 4a: lload 1
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: lload 1
// 52: lconst_0
// 53: lcmp
// 54: iflt 72
// 57: ifne 88
// 5a: getstatic su/catlean/_0.O Ljava/util/Queue;
// 5d: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
// 62: checkcast net/minecraft/class_6373
// 65: lload 5
// 67: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 6a: checkcast net/minecraft/class_8705
// 6d: invokevirtual net/minecraft/class_6373.method_36949 (Lnet/minecraft/class_8705;)V
// 70: iload 7
// 72: ifne 3c
// 75: lload 1
// 76: lconst_0
// 77: lcmp
// 78: iflt 88
// 7b: goto 88
// 7e: ldc2_w -2158354810933470194
// 81: lload 1
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void w(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 72960879540939L;
long var5 = var1 ^ 72607651401358L;
int var10000 = vm.a<"Å">(-2525252650035539563L, var1);
K = true;
int var7 = var10000;

label36:
while (!C.isEmpty()) {
try {
Object var11 = C.poll();
Intrinsics.checkNotNullExpressionValue(var11, b<"v">(23656, 6842555531877723762L ^ var1));
_r.a(var3, (class_2596)var11);
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -2555313035161820532L, var1);
}

do {
try {
var10000 = var7;
if (var1 > 0L) {
if (var7 == 0) {
return;
}

var10000 = var7;
}

if (var10000 != 0) {
continue label36;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -2555313035161820532L, var1);
}
} while (var1 < 0L);
break;
}

K = false;
A = zf.v(var5).method_36454();
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void i(int var1, int var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ e;
long var6 = var4 ^ 139790527646907L;
int var10000 = vm.a<"Å">(3063781866960349157L, var4);
K = true;
int var8 = var10000;

label36:
while (!N.isEmpty()) {
try {
Object var11 = N.poll();
Intrinsics.checkNotNullExpressionValue(var11, b<"v">(25150, 4412535570189575774L ^ var4));
_r.a(var6, (class_2596)var11);
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 3096657046413628668L, var4);
}

do {
try {
var10000 = var8;
if (var2 >= 0) {
if (var8 == 0) {
return;
}

var10000 = var8;
}

if (var10000 != 0) {
continue label36;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 3096657046413628668L, var4);
}
} while (var3 <= 0);
break;
}

K = false;
}

private static final boolean L() {
long var0 = e ^ 108595566679710L;
long var2 = var0 ^ 2231010943007L;
return D.p(var2);
}

private static final boolean z() {
long var0 = e ^ 125518608939522L;
long var2 = var0 ^ 20802785856643L;
return D.p(var2);
}

private static final boolean F() {
long var0 = e ^ 76208398332400L;
long var2 = var0 ^ 41286248859505L;
int var4 = vm.a<"Å">(8295847172610408001L, var0);

try {
boolean var10000 = D.p(var2);
if (var4 == 0) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 8313065750979579224L, var0);
}

return false;
}

private static final boolean n() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_0.e J
// 03: ldc2_w 99033186959069
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 70641043949200
// 0d: lxor
// 0e: lstore 2
// 0f: dup2
// 10: ldc2_w 64677499209820
// 13: lxor
// 14: lstore 4
// 16: pop2
// 17: ldc2_w 8984472273551739883
// 1a: lload 0
// 1b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: istore 6
// 22: getstatic su/catlean/_0.D Lsu/catlean/_0;
// 25: lload 2
// 26: invokespecial su/catlean/_0.H (J)Z
// 29: iload 6
// 2b: ifne 53
// 2e: ifeq 6c
// 31: goto 3e
// 34: ldc2_w 8966928678679577205
// 37: lload 0
// 38: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: athrow
// 3e: getstatic su/catlean/_0.D Lsu/catlean/_0;
// 41: lload 4
// 43: invokespecial su/catlean/_0.p (J)Z
// 46: goto 53
// 49: ldc2_w 8966928678679577205
// 4c: lload 0
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: iload 6
// 55: ifne 69
// 58: ifne 6c
// 5b: goto 68
// 5e: ldc2_w 8966928678679577205
// 61: lload 0
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: bipush 1
// 69: goto 6d
// 6c: bipush 0
// 6d: ireturn
}

private static final boolean B() {
long var0 = e ^ 20024847512480L;
long var2 = var0 ^ 126398595089697L;
int var4 = vm.a<"Å">(-5633429421648771434L, var0);

try {
boolean var10000 = D.p(var2);
if (var4 != 0) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -5688707993593164024L, var0);
}

return false;
}

static {
long var20 = e ^ 85132381447997L;
long var22 = var20 ^ 62288205982820L;
long var24 = var20 ^ 9540195525162L;
long var26 = var20 ^ 81159871142046L;
long var28 = var20 ^ 53760825770730L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[38];
int var16 = 0;
String var15 = "\u0082\u0017¿À\u0094ì\u009c$N¶Aû}i=»dt¡Ã\u001eÞY\u0080ÓÆ_+*z¡\u0006C\u001dd9kæNÉ$á)\r_ÓiÐ{\bèáûò\u000eÜñ\f\bû\u008cÒþ\u0089\u001c\u0011\u0019JO0Í\u00adßØÁ\u0087,\u0080 ê\u0089\u0013rÂdo\n\u001e\u009b\u0085\u0086bÔ+Vú\u0092>/3\u001d\u0015n\u0098\u001cþí|ÇVwlÈÛÙ\u001f:8¯µ¦ê\f\u0098)\u0098\r`\u0098«\b\u00167/k\u0098 \u008fN\u0095\u0095:ô\u0014Ün×¢N+b\\8#<ÆÎ\u0010\u0082JÿÎ÷ÃZ,\u0083\n\u0098\u0018Ó±\u0088\u008a!wðÛO\u00879Öê\u0089Ü»^\u000fáñ\u0085\u0094];¨ÄÝb\u009ecX\f\u00ad\u0098\u0090+®TS\u000fò'\u0091ub$ÛJHÚ$ý\u0010z\u0015q\u008aÙÈPÇiÑû C;8üqÃ¿¤õ|®Üóí{9ÄO$Þ§hkB\u000e\u0003×'\u0095\u000bïC¬\u0093Ð\u000b²Z\u008d\u009d¹íâ\u0096\u009f\u009be\u0005\u008f2RRry©¯=w»\u007fÚÊU\u0001\u0000ç\u0097\u000f2|W\u001c\b;´¼¢Î$ 2å/Ú¤ì´ásÔî.U¦WG\u0083Û\u00adÄy¯\u0014F\u0098\u0011 ´\tl\f×QdÇZ)}v\u0017 Y.\u000bns\u0085\u0014 H\u0083×\u0090ýíeä\u001a$ìX×·Ëü¬o«JÍ³\u0096\u0086\u000bö²\u007f8b~Ä\u00881`ÙRTì¤%îVgU\rÇ¨¯\u00112+\u001c\u0095Ö9\u008c:]îê\u009f»j\u0003(þ¤\u0092\u0099\u00ad`E|Ó¸ª\u007f©\u0004Eßß\u009e*\u0098 \u0081\u009aJØË¯\u001eüÐ©È_h|{ÑùwÛ]¨üã¿8ìáñ\u001cÞnÆ\u0003\r\u0082ÈRb\u0001\u009c\u0081ïó·\u000f¶CÈXÃ~\u0015Tº¢¶Y<\u0088:aý+OÛL\u0081ý\u000e£ÃÔ¯+æ\u0082Õ¡\u0092É\u009d\u0016\u0090!¢BoL)¹'\u0018\u0094\u001cµ6l6\u0016é\u0014fÙ\u008dEEL\u0083ÔO\u0003Sbõâèf\u0002\u0096¸=MÞ\u0099Ï\u001fD\u0092gAÁ6èõx\u0017ç`Ñm\u0090\u008d+ëq×ö3ï\u0019Á\fÝ\u0018Í\u000b °\u009275ÄãmÑ¹\u0002\u00824§?$\u0080y\u0081£C=Ãþ¥jð¨ÒëÆu©aé¥©\u00146¼ÙÄ\r¿Qò¿Ë\u000ee\u0002áC\n\u0089\u0001e,Ó\b\u000ez\u0093Æt\u0088µ\f\u0003^\u0017\u0018*Æõr\rm\u0097\\:\u0011R~\u0097)N°H\u000b\"Tº\u0007¶a\u0018Æ|y\u00adróÖ\u009c\u000fúè\u0016]QÖ|©\u0015³þIxÏé\u0090\u0081MÉÉý\u00ad ²· +2øhQæWö)ó3\u00ad®Õ÷\u0012µ¢ÛBÎÿ¾¬ÿî\u00ad¶°¦í\u0082\u0003½oq.\nÿz`\u0010\\\u001c'GÎrd´Ý<iî\r1\u0088ù$xS]!Òv´\u0091¡\u001e\u0006Ï\u001dFE\u0095nº`e¸0õ\u0085\u007fãÛ\u000eaèé$·ë÷·\u009e\t)t¢Ýâ\f@ö\u0011ÿfº#\n\u0081º\u009dÌ&\\¾TC\u0014¶ %ª¢8\u001a3e\u0098Uv\u001a(¥\u0084{ÙÒ.\u0005h{rA\u0088\u0014Ôb\u0084¥\u0088¥)¸N+øÐCÂ\u0017¥\u0088cãu\rIèû\u0093÷\b\u0010\u009b¶\u0091\u008d\u0085Ò$1ð\u009bgÂb\u0001\u000f\\(YÃ§2¢Pù$7«Yàlc3ØÈ, Rä±\u0004x\u0003SYÀí\u0090e¥FÇò\u0019Ãy¯Á *\u000fàæT:¡ñ \u009b9Ø\u001a\u008fpbàk»¼\t\u009cdË3zNÿÛ[wí(é\u008b°9ÊAëþõhìÝ\u0083S\u008a\u000füôûà,P\u008f4\u009eO\u009b\\d3\u0093åØC\u0095LZ\u001f0p(Þ*CNxÛç|\n\u009dÞ\u0095w\u0005úf\u0004n\u001a\u008dA\u0015è÷f\u009bÀ&\u0081\"Û2uù0b~Ésg ¦\nª¬ó6íw¥\u009eej*°Óº°\\ºn4un5õ\u0089\u0098K\u000ePË\u00978w#Ò\u009b\u009aék\u0004¬fqÆ¨Sl¦\u0012«r\u001f@¶ÏÈ§Ã+Ï\u0094\u0000ÿ¾ÉO#óTÓ*?\u0092<±È\u000b\u0080\u0095½\u0004®^\u0099ÃòÐ\u0099 NWiä\u009d\u007fõ.h\u0016k\u0016æý¢%á5\u0004Ð\u0005\u0082\u0007|¬<C\u0094jìÒ\u0006\u0010\u0093:ñ\b\u008a4\u0087\u0099\u0089õú\u0091\u008c\u0017#\u0099 @Í\u00027\u008fãµP0ªX¤Ír¼\u0005\nI\u001d\u009ck[\u0083ô\u000b¡(Ê\u001bëê\u0080 %l:\u0093\u001eèàÔ¯\u0011R\u0019\u0095¸úë\fDx\u0091\u0018uA¶X@\u000bx\u000f3¿®\u007f,¬\u007fNÎµ+K\n\u0004\u0014°q»ô4m\u0082Á[áµå5]Ø\u0004\u008d×þ\u009cC5\u00059pLµ\r´û\u0081ç®\u0002í\f\u0084á\u0089go,Æ¼L½>:{\r\føë\u00ad~\fÎÔ\u000bjõíY\u0083g!Ò\u0087Xd¸¯~_óÑtsþ-\u008dJÙmk\u009b\u009aòí}°e\u008b~M¸èð\u0002Óx\u0011mkó\u000bþ\u0094.Bç\u00047¦MÉ\u0010ÑuBÆ1+UÖø¨\u0010\u0007\u001c;µq ¹YX§/ÁõÊ\rvÏÐ´Mg~¼\u0018\në-\u009bNÛíWjô-\u0010PY \u001fõ\u0011òDq\u0099b÷]_<D-#Õz«\u008b\u000f¹d/Â5Ü_\u0087»U¢½0\u0018]Î£!Êk±×h¬}Ezï:Ø\u009a\u0086(PrsÏ&\u008a¢\u0090\u000fÆÊUöM E\u009b@jð\u0082ýo1\u008f\u0000\u001c®\u0010\f<Õ\u0017o¿(7\u000e\u0002\u008b£½Â\u0096T(ÿ\n8kÕ\u0005îL??¨G\u0087ÂP\u008cº\u009f-\u001a\u0016äÐ\u000fÓA?«÷\u0006\t(\"ï\r\\¯¼p\u0000\u0018R÷>ñx5ù¤§\u0092DÄI\bVùì\u0014ï~\u0088Ò<¦ ú\u008cÝXÍ#\u008a\u001d:{I=õq.\u0013\u0000Dõ7ÁÁà¬Ä?\u00010\f¡a$Í\u009cí\u0003íÈÕZw\u0016¬u³§\u0094%\n\u008a\u0005\u0004\u0096\u0096¯\u0002,y\u0083Å\u008b³+\u0099.Ço±ú\u001b\u0005ü2ôù=Îì6\u009aÄ\"ãï\u0081_\u0096(\nBÐÔ5Åý\u0085:Ò×5\u0017w×O¨ºO\u007faM\u0089\u0011ìJ\u001c\u009d¨¥H´\u0096\u000eL½\u0088û\u0081ÏÚ\u008b9Ö\u009d%+À\u0085þÇÆ\u008cî\u0082Áv:X\u009bë& \u001dóKS\u008b\u001aÍ\u0080ò\u0018êéaÔ\"âZ»L\u0015\u0014+¹o\u0081JÖ\u008a§\u009aû\u0005Ox\u0010Yuë\u0007_ÄÐ|¾\u001a/h}Úêî\u0018Ôä¦ù§Î\u0010sàß\u001cÙj¼½î\u0015É@>\u001døk½(\u0093é\u0099i\u0099À\u0094#r\u009aCÁ\u0006\rrrÄïùn°`R\u0081ÎgC}\u0089¾´,´îåÆ\u0095j\u0003\u0086(¡ÞéCE©ëÀCn\u0098Ï~*|èþ½\u0097ýR\u0084ò²»ä\u0081M±½÷Øe\u001cf\u0013#É\u008bh(tÞbh\n\u008e§'\u0007Æf\u00adb4ìºsjÒJ¿\t}ÐJÎ\u008eW>¼©ù0<\u009d\u0087oâï\u008d";
int var17 = "\u0082\u0017¿À\u0094ì\u009c$N¶Aû}i=»dt¡Ã\u001eÞY\u0080ÓÆ_+*z¡\u0006C\u001dd9kæNÉ$á)\r_ÓiÐ{\bèáûò\u000eÜñ\f\bû\u008cÒþ\u0089\u001c\u0011\u0019JO0Í\u00adßØÁ\u0087,\u0080 ê\u0089\u0013rÂdo\n\u001e\u009b\u0085\u0086bÔ+Vú\u0092>/3\u001d\u0015n\u0098\u001cþí|ÇVwlÈÛÙ\u001f:8¯µ¦ê\f\u0098)\u0098\r`\u0098«\b\u00167/k\u0098 \u008fN\u0095\u0095:ô\u0014Ün×¢N+b\\8#<ÆÎ\u0010\u0082JÿÎ÷ÃZ,\u0083\n\u0098\u0018Ó±\u0088\u008a!wðÛO\u00879Öê\u0089Ü»^\u000fáñ\u0085\u0094];¨ÄÝb\u009ecX\f\u00ad\u0098\u0090+®TS\u000fò'\u0091ub$ÛJHÚ$ý\u0010z\u0015q\u008aÙÈPÇiÑû C;8üqÃ¿¤õ|®Üóí{9ÄO$Þ§hkB\u000e\u0003×'\u0095\u000bïC¬\u0093Ð\u000b²Z\u008d\u009d¹íâ\u0096\u009f\u009be\u0005\u008f2RRry©¯=w»\u007fÚÊU\u0001\u0000ç\u0097\u000f2|W\u001c\b;´¼¢Î$ 2å/Ú¤ì´ásÔî.U¦WG\u0083Û\u00adÄy¯\u0014F\u0098\u0011 ´\tl\f×QdÇZ)}v\u0017 Y.\u000bns\u0085\u0014 H\u0083×\u0090ýíeä\u001a$ìX×·Ëü¬o«JÍ³\u0096\u0086\u000bö²\u007f8b~Ä\u00881`ÙRTì¤%îVgU\rÇ¨¯\u00112+\u001c\u0095Ö9\u008c:]îê\u009f»j\u0003(þ¤\u0092\u0099\u00ad`E|Ó¸ª\u007f©\u0004Eßß\u009e*\u0098 \u0081\u009aJØË¯\u001eüÐ©È_h|{ÑùwÛ]¨üã¿8ìáñ\u001cÞnÆ\u0003\r\u0082ÈRb\u0001\u009c\u0081ïó·\u000f¶CÈXÃ~\u0015Tº¢¶Y<\u0088:aý+OÛL\u0081ý\u000e£ÃÔ¯+æ\u0082Õ¡\u0092É\u009d\u0016\u0090!¢BoL)¹'\u0018\u0094\u001cµ6l6\u0016é\u0014fÙ\u008dEEL\u0083ÔO\u0003Sbõâèf\u0002\u0096¸=MÞ\u0099Ï\u001fD\u0092gAÁ6èõx\u0017ç`Ñm\u0090\u008d+ëq×ö3ï\u0019Á\fÝ\u0018Í\u000b °\u009275ÄãmÑ¹\u0002\u00824§?$\u0080y\u0081£C=Ãþ¥jð¨ÒëÆu©aé¥©\u00146¼ÙÄ\r¿Qò¿Ë\u000ee\u0002áC\n\u0089\u0001e,Ó\b\u000ez\u0093Æt\u0088µ\f\u0003^\u0017\u0018*Æõr\rm\u0097\\:\u0011R~\u0097)N°H\u000b\"Tº\u0007¶a\u0018Æ|y\u00adróÖ\u009c\u000fúè\u0016]QÖ|©\u0015³þIxÏé\u0090\u0081MÉÉý\u00ad ²· +2øhQæWö)ó3\u00ad®Õ÷\u0012µ¢ÛBÎÿ¾¬ÿî\u00ad¶°¦í\u0082\u0003½oq.\nÿz`\u0010\\\u001c'GÎrd´Ý<iî\r1\u0088ù$xS]!Òv´\u0091¡\u001e\u0006Ï\u001dFE\u0095nº`e¸0õ\u0085\u007fãÛ\u000eaèé$·ë÷·\u009e\t)t¢Ýâ\f@ö\u0011ÿfº#\n\u0081º\u009dÌ&\\¾TC\u0014¶ %ª¢8\u001a3e\u0098Uv\u001a(¥\u0084{ÙÒ.\u0005h{rA\u0088\u0014Ôb\u0084¥\u0088¥)¸N+øÐCÂ\u0017¥\u0088cãu\rIèû\u0093÷\b\u0010\u009b¶\u0091\u008d\u0085Ò$1ð\u009bgÂb\u0001\u000f\\(YÃ§2¢Pù$7«Yàlc3ØÈ, Rä±\u0004x\u0003SYÀí\u0090e¥FÇò\u0019Ãy¯Á *\u000fàæT:¡ñ \u009b9Ø\u001a\u008fpbàk»¼\t\u009cdË3zNÿÛ[wí(é\u008b°9ÊAëþõhìÝ\u0083S\u008a\u000füôûà,P\u008f4\u009eO\u009b\\d3\u0093åØC\u0095LZ\u001f0p(Þ*CNxÛç|\n\u009dÞ\u0095w\u0005úf\u0004n\u001a\u008dA\u0015è÷f\u009bÀ&\u0081\"Û2uù0b~Ésg ¦\nª¬ó6íw¥\u009eej*°Óº°\\ºn4un5õ\u0089\u0098K\u000ePË\u00978w#Ò\u009b\u009aék\u0004¬fqÆ¨Sl¦\u0012«r\u001f@¶ÏÈ§Ã+Ï\u0094\u0000ÿ¾ÉO#óTÓ*?\u0092<±È\u000b\u0080\u0095½\u0004®^\u0099ÃòÐ\u0099 NWiä\u009d\u007fõ.h\u0016k\u0016æý¢%á5\u0004Ð\u0005\u0082\u0007|¬<C\u0094jìÒ\u0006\u0010\u0093:ñ\b\u008a4\u0087\u0099\u0089õú\u0091\u008c\u0017#\u0099 @Í\u00027\u008fãµP0ªX¤Ír¼\u0005\nI\u001d\u009ck[\u0083ô\u000b¡(Ê\u001bëê\u0080 %l:\u0093\u001eèàÔ¯\u0011R\u0019\u0095¸úë\fDx\u0091\u0018uA¶X@\u000bx\u000f3¿®\u007f,¬\u007fNÎµ+K\n\u0004\u0014°q»ô4m\u0082Á[áµå5]Ø\u0004\u008d×þ\u009cC5\u00059pLµ\r´û\u0081ç®\u0002í\f\u0084á\u0089go,Æ¼L½>:{\r\føë\u00ad~\fÎÔ\u000bjõíY\u0083g!Ò\u0087Xd¸¯~_óÑtsþ-\u008dJÙmk\u009b\u009aòí}°e\u008b~M¸èð\u0002Óx\u0011mkó\u000bþ\u0094.Bç\u00047¦MÉ\u0010ÑuBÆ1+UÖø¨\u0010\u0007\u001c;µq ¹YX§/ÁõÊ\rvÏÐ´Mg~¼\u0018\në-\u009bNÛíWjô-\u0010PY \u001fõ\u0011òDq\u0099b÷]_<D-#Õz«\u008b\u000f¹d/Â5Ü_\u0087»U¢½0\u0018]Î£!Êk±×h¬}Ezï:Ø\u009a\u0086(PrsÏ&\u008a¢\u0090\u000fÆÊUöM E\u009b@jð\u0082ýo1\u008f\u0000\u001c®\u0010\f<Õ\u0017o¿(7\u000e\u0002\u008b£½Â\u0096T(ÿ\n8kÕ\u0005îL??¨G\u0087ÂP\u008cº\u009f-\u001a\u0016äÐ\u000fÓA?«÷\u0006\t(\"ï\r\\¯¼p\u0000\u0018R÷>ñx5ù¤§\u0092DÄI\bVùì\u0014ï~\u0088Ò<¦ ú\u008cÝXÍ#\u008a\u001d:{I=õq.\u0013\u0000Dõ7ÁÁà¬Ä?\u00010\f¡a$Í\u009cí\u0003íÈÕZw\u0016¬u³§\u0094%\n\u008a\u0005\u0004\u0096\u0096¯\u0002,y\u0083Å\u008b³+\u0099.Ço±ú\u001b\u0005ü2ôù=Îì6\u009aÄ\"ãï\u0081_\u0096(\nBÐÔ5Åý\u0085:Ò×5\u0017w×O¨ºO\u007faM\u0089\u0011ìJ\u001c\u009d¨¥H´\u0096\u000eL½\u0088û\u0081ÏÚ\u008b9Ö\u009d%+À\u0085þÇÆ\u008cî\u0082Áv:X\u009bë& \u001dóKS\u008b\u001aÍ\u0080ò\u0018êéaÔ\"âZ»L\u0015\u0014+¹o\u0081JÖ\u008a§\u009aû\u0005Ox\u0010Yuë\u0007_ÄÐ|¾\u001a/h}Úêî\u0018Ôä¦ù§Î\u0010sàß\u001cÙj¼½î\u0015É@>\u001døk½(\u0093é\u0099i\u0099À\u0094#r\u009aCÁ\u0006\rrrÄïùn°`R\u0081ÎgC}\u0089¾´,´îåÆ\u0095j\u0003\u0086(¡ÞéCE©ëÀCn\u0098Ï~*|èþ½\u0097ýR\u0084ò²»ä\u0081M±½÷Øe\u001cf\u0013#É\u008bh(tÞbh\n\u008e§'\u0007Æf\u00adb4ìºsjÒJ¿\t}ÐJÎ\u008eW>¼©ù0<\u009d\u0087oâï\u008d"
.length();
char var14 = 136;
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
h = var18;
i = new String[38];
u = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[13];
int var3 = 0;
String var4 = "`]\u009d¢¦Ñ}\u009deÇ?K\u0000ø\u009a\"\u009e\u0012\u008b\u009dÜb`Ò=\\jLeÝrçrû@¼q\u0089ÁÉ^q\u0098\u0004.|%n±z|¾³+h\u0003\u000e\u0015PèU·6ú5\u0019rwíp\u008bCMåÝ\u0017pA\u001fp\u0097!`$ùóB¡";
int var5 = "`]\u009d¢¦Ñ}\u009deÇ?K\u0000ø\u009a\"\u009e\u0012\u008b\u009dÜb`Ò=\\jLeÝrçrû@¼q\u0089ÁÉ^q\u0098\u0004.|%n±z|¾³+h\u0003\u000e\u0015PèU·6ú5\u0019rwíp\u008bCMåÝ\u0017pA\u001fp\u0097!`$ùóB¡"
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
o = var6;
t = new Integer[13];
KProperty[] var30 = new KProperty[c<"g">(17410, 173992886402458149L ^ var20)];
var30[0] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_0.class, b<"v">(24476, 4580834954084783259L ^ var20), b<"v">(10840, 7940249631400550734L ^ var20), 0)
);
var30[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_0.class, b<"v">(29663, 1711694298892155115L ^ var20), b<"v">(23540, 7938615834130223339L ^ var20), 0)
);
var30[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_0.class, b<"v">(15903, 3582945736467215633L ^ var20), b<"v">(22012, 5199702300250480380L ^ var20), 0)
);
var30[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_0.class, b<"v">(20284, 4769846604310578234L ^ var20), b<"v">(29236, 4775265474674276615L ^ var20), 0)
);
var30[4] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_0.class, b<"v">(6291, 8575527554744734626L ^ var20), b<"v">(26833, 945126291685352419L ^ var20), 0)
);
var30[5] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_0.class, b<"v">(21194, 1728602916604778949L ^ var20), b<"v">(2316, 1052100171996742148L ^ var20), 0)
);
var30[c<"g">(21493, 3880364086769118L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_0.class, b<"v">(25416, 1464004877274294365L ^ var20), b<"v">(15767, 7023210411559941770L ^ var20), 0)
);
c = var30;
D = new _0(var28);
F = yp.t(D, b<"v">(6249, 5475824867929248619L ^ var20), true, var24, null, null, c<"g">(31583, 5530745816826486134L ^ var20), null);
d = yp.t(D, b<"v">(1865, 9085538186068839496L ^ var20), true, var24, null, null, c<"g">(31583, 5530745816826486134L ^ var20), null);
k = yp.L(D, b<"v">(6734, 3671464123268714836L ^ var20), t6.SEMI, null, _0::L, 4, null, var26);
g = yp.t(D, b<"v">(2116, 3730765037137642305L ^ var20), true, var24, null, _0::z, 4, null);
x = yp.t(D, b<"v">(5624, 6461897253870395125L ^ var20), true, var24, null, _0::F, 4, null);
y = yp.k(
D, b<"v">(24513, 2916819220174214346L ^ var20), 87.0F, var22, RangesKt.rangeTo(0.0F, 90.0F), null, _0::n, c<"g">(20657, 6693032104862561940L ^ var20), null
);
m = yp.t(D, b<"v">(12989, 4582244846502476205L ^ var20), true, var24, null, _0::B, 4, null);
l = new LinkedList();
O = new LinkedList();
C = new LinkedList();
N = new LinkedList();
B = true;
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "¯\u009f3Xg°âT»)\u009c\bõ]â¼";
var5 = "¯\u009f3Xg°âT»)\u009c\bõ]â¼".length();
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

var15 = "ÿò@\u0083\u009aÞÉ\b\u0095Q¢þ´\u0095\u0091\u0086²+|ÇôäÄ\"(³\\\u0085¥el½\u0089\u001dK\u009a'TD÷ 3¬Y\u00164,¸¬óãõ.\u00156À²/\u0081Ft\u009c`Õ·Þ\u0015\u008eÑÝÁ%,";
var17 = "ÿò@\u0083\u009aÞÉ\b\u0095Q¢þ´\u0095\u0091\u0086²+|ÇôäÄ\"(³\\\u0085¥el½\u0089\u001dK\u009a'TD÷ 3¬Y\u00164,¸¬óãõ.\u00156À²/\u0081Ft\u009c`Õ·Þ\u0015\u008eÑÝÁ%,"
.length();
var14 = '(';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 12265;
if (i[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])n.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
n.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_0", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = h[var5].getBytes("ISO-8859-1");
i[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return i[var5];
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
throw new RuntimeException("su/catlean/_0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 727;
if (t[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = o[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])u.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
u.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
t[var3] = var15;
}

return t[var3];
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
throw new RuntimeException("su/catlean/_0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
