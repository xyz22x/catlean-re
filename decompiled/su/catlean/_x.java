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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2846.class_2847;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _x extends _g {
@NotNull
public static final _x I;
static final KProperty[] E;
@NotNull
private static final cw d;
@NotNull
private static final cq C;
@NotNull
private static final cq h;
@NotNull
private static final cq e;
@NotNull
private static final cq L;
@NotNull
private static final cq u;
@NotNull
private static final cq j;
@NotNull
private static final cq t;
@NotNull
private static final cq F;
@NotNull
private static final ct Y;
@NotNull
private static final ct A;
private static boolean k;
private static boolean a;
private static int X;
private static boolean O;
private static final long b = yz.a(-6031132881689212375L, -1660236390689321593L, MethodHandles.lookup().lookupClass()).a(265243028793865L);
private static final String[] c;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] i;
private static final Integer[] l;
private static final Map m;
private static final long[] n;
private static final Long[] o;
private static final Map w;

private _x(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 9375985692863L;
super(b<"z">(7689, 8508297698189163217L ^ var1), jt.c(), null, 4, null, var3);
}

private final zn Z(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 74696899056366L;
return (zn)d.E(this, var3, E[0]);
}

private final boolean E(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 110834260996783L;
return (Boolean)C.E(this, var3, E[1]);
}

private final void s(byte var1, long var2, boolean var4) {
long var5 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
long var7 = var5 ^ 57980964804213L;
C.b(this, var7, E[1], var4);
}

private final boolean H(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 70122064450835L;
return (Boolean)h.E(this, var3, E[2]);
}

private final void A(boolean var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 121953538849909L;
h.b(this, var4, E[2], var1);
}

private final boolean a(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 96982589369995L;
return (Boolean)e.E(this, var3, E[3]);
}

private final void t(boolean var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 139395019270443L;
e.b(this, var4, E[3], var1);
}

private final boolean C(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 51179198948642L;
return (Boolean)L.E(this, var6, E[4]);
}

private final void y(byte var1, boolean var2, long var3) {
long var5 = ((long)var1 << 56 | var3 << 8 >>> 8) ^ b;
long var7 = var5 ^ 120755343625771L;
L.b(this, var7, E[4], var2);
}

private final boolean e(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 26583339060316L;
return (Boolean)u.E(this, var3, E[5]);
}

private final void p(boolean var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 114974977754404L;
u.b(this, var4, E[5], var1);
}

private final boolean F(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 14844571999008L;
return (Boolean)j.E(this, var3, E[c<"f">(3681, 8365690531934218540L ^ var1)]);
}

private final void E(boolean var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 117188477068751L;
j.b(this, var4, E[c<"f">(3681, 8365636241386651695L ^ var2)], var1);
}

private final boolean w(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 387151083559L;
return (Boolean)t.E(this, var3, E[c<"f">(4415, 3497123079160943995L ^ var1)]);
}

private final void G(boolean var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 116086343907663L;
t.b(this, var4, E[c<"f">(4415, 3497074608483746815L ^ var2)], var1);
}

private final boolean r(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 115326175885141L;
return (Boolean)F.E(this, var3, E[c<"f">(18093, 4353916691222662546L ^ var1)]);
}

private final void l(long var1, boolean var3) {
var1 = b ^ var1;
long var4 = var1 ^ 43692114680003L;
F.b(this, var4, E[c<"f">(18093, 4353928069387859432L ^ var1)], var3);
}

private final float D(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 72737077806967L;
return ((Number)Y.E(this, var3, E[c<"f">(29405, 1893946745906579906L ^ var1)])).floatValue();
}

private final void N(long var1, float var3) {
var1 = b ^ var1;
long var4 = var1 ^ 15713972366755L;
Y.b(this, var4, E[c<"f">(29405, 1894008967086945530L ^ var1)], var3);
}

private final float I(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 37321013123153L;
return ((Number)A.E(this, var3, E[c<"f">(23166, 2161855439548939844L ^ var1)])).floatValue();
}

private final void t(long var1, float var3) {
var1 = b ^ var1;
long var4 = var1 ^ 1423034969551L;
A.b(this, var4, E[c<"f">(23166, 2161834884119845942L ^ var1)], var3);
}

@Flow
private final void n(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_x.b J
// 003: ldc2_w 104507353855335
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 103265357889044
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 16558509706482
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 68432870302002
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 101307666164621
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 76869096999776
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 79133591721960
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 42710916963902
// 037: lxor
// 038: lstore 16
// 03a: pop2
// 03b: ldc2_w 6472609059911380448
// 03e: lload 2
// 03f: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: aload 1
// 045: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 048: astore 19
// 04a: istore 18
// 04c: aload 19
// 04e: instanceof net/minecraft/class_2743
// 051: iload 18
// 053: ifeq 1f7
// 056: ifeq 1f2
// 059: goto 066
// 05c: ldc2_w 6447099350266171980
// 05f: lload 2
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: aload 19
// 068: checkcast net/minecraft/class_2743
// 06b: invokevirtual net/minecraft/class_2743.method_11818 ()I
// 06e: iload 18
// 070: ifeq 1f7
// 073: goto 080
// 076: ldc2_w 6447099350266171980
// 079: lload 2
// 07a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: athrow
// 080: lload 12
// 082: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 085: invokevirtual net/minecraft/class_746.method_5628 ()I
// 088: if_icmpne 1f2
// 08b: goto 098
// 08e: ldc2_w 6447099350266171980
// 091: lload 2
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: aload 0
// 099: lload 6
// 09b: invokespecial su/catlean/_x.g (J)Z
// 09e: iload 18
// 0a0: ifeq 0cf
// 0a3: goto 0b0
// 0a6: ldc2_w 6447099350266171980
// 0a9: lload 2
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: ifne 0c1
// 0b3: goto 0c0
// 0b6: ldc2_w 6447099350266171980
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: return
// 0c1: aload 0
// 0c2: lload 10
// 0c4: invokespecial su/catlean/_x.Z (J)Lsu/catlean/zn;
// 0c7: getstatic su/catlean/d3.D [I
// 0ca: swap
// 0cb: invokevirtual su/catlean/zn.ordinal ()I
// 0ce: iaload
// 0cf: tableswitch 273 1 4 29 133 155 193
// 0ec: aload 19
// 0ee: checkcast su/catlean/mixins/accessors/ClientboundSetEntityMotionPacketAccessor
// 0f1: new net/minecraft/class_243
// 0f4: dup
// 0f5: aload 19
// 0f7: checkcast net/minecraft/class_2743
// 0fa: invokevirtual net/minecraft/class_2743.method_73085 ()Lnet/minecraft/class_243;
// 0fd: getfield net/minecraft/class_243.field_1352 D
// 100: aload 0
// 101: lload 8
// 103: invokespecial su/catlean/_x.I (J)F
// 106: f2d
// 107: dmul
// 108: ldc2_w 100.0
// 10b: ddiv
// 10c: aload 19
// 10e: checkcast net/minecraft/class_2743
// 111: invokevirtual net/minecraft/class_2743.method_73085 ()Lnet/minecraft/class_243;
// 114: getfield net/minecraft/class_243.field_1351 D
// 117: aload 0
// 118: lload 4
// 11a: invokespecial su/catlean/_x.D (J)F
// 11d: f2d
// 11e: dmul
// 11f: ldc2_w 100.0
// 122: ddiv
// 123: aload 19
// 125: checkcast net/minecraft/class_2743
// 128: invokevirtual net/minecraft/class_2743.method_73085 ()Lnet/minecraft/class_243;
// 12b: getfield net/minecraft/class_243.field_1350 D
// 12e: aload 0
// 12f: lload 8
// 131: invokespecial su/catlean/_x.I (J)F
// 134: f2d
// 135: dmul
// 136: ldc2_w 100.0
// 139: ddiv
// 13a: invokespecial net/minecraft/class_243.<init> (DDD)V
// 13d: invokeinterface su/catlean/mixins/accessors/ClientboundSetEntityMotionPacketAccessor.setMovement (Lnet/minecraft/class_243;)V 2
// 142: iload 18
// 144: ifne 1f2
// 147: goto 154
// 14a: ldc2_w 6447099350266171980
// 14d: lload 2
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: aload 1
// 155: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 158: iload 18
// 15a: ifne 1f2
// 15d: goto 16a
// 160: ldc2_w 6447099350266171980
// 163: lload 2
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: aload 1
// 16b: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 16e: sipush 3681
// 171: ldc2_w 8365668213173446151
// 174: lload 2
// 175: lxor
// 176: invokedynamic f (IJ)I bsm=su/catlean/_x.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: putstatic su/catlean/_x.X I
// 17e: iload 18
// 180: ifne 1f2
// 183: goto 190
// 186: ldc2_w 6447099350266171980
// 189: lload 2
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 193: invokevirtual su/catlean/dm.K ()J
// 196: sipush 5186
// 199: ldc2_w 5388264959779893816
// 19c: lload 2
// 19d: lxor
// 19e: invokedynamic g (IJ)J bsm=su/catlean/_x.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: lcmp
// 1a4: iload 18
// 1a6: ifeq 1f7
// 1a9: goto 1b6
// 1ac: ldc2_w 6447099350266171980
// 1af: lload 2
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: ifle 1f2
// 1b9: goto 1c6
// 1bc: ldc2_w 6447099350266171980
// 1bf: lload 2
// 1c0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: athrow
// 1c6: aload 1
// 1c7: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 1ca: bipush 1
// 1cb: putstatic su/catlean/_x.k Z
// 1ce: iload 18
// 1d0: ifne 1f2
// 1d3: goto 1e0
// 1d6: ldc2_w 6447099350266171980
// 1d9: lload 2
// 1da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1df: athrow
// 1e0: new kotlin/NoWhenBranchMatchedException
// 1e3: dup
// 1e4: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 1e7: athrow
// 1e8: ldc2_w 6447099350266171980
// 1eb: lload 2
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: aload 19
// 1f4: instanceof net/minecraft/class_2664
// 1f7: iload 18
// 1f9: ifeq 231
// 1fc: ifeq 4d4
// 1ff: goto 20c
// 202: ldc2_w 6447099350266171980
// 205: lload 2
// 206: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20b: athrow
// 20c: aload 0
// 20d: iload 18
// 20f: ifeq 4d5
// 212: goto 21f
// 215: ldc2_w 6447099350266171980
// 218: lload 2
// 219: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21e: athrow
// 21f: lload 14
// 221: invokespecial su/catlean/_x.a (J)Z
// 224: goto 231
// 227: ldc2_w 6447099350266171980
// 22a: lload 2
// 22b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: athrow
// 231: ifeq 4d4
// 234: getstatic su/catlean/_v.V Lsu/catlean/_v;
// 237: lload 16
// 239: invokevirtual su/catlean/_v.f (J)Z
// 23c: ifne 4d4
// 23f: goto 24c
// 242: ldc2_w 6447099350266171980
// 245: lload 2
// 246: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: athrow
// 24c: aload 1
// 24d: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 250: dup
// 251: sipush 19152
// 254: ldc2_w 6266213667972322928
// 257: lload 2
// 258: lxor
// 259: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/_x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 261: checkcast su/catlean/mixins/accessors/ClientboundExplodePacketAccessor
// 264: astore 20
// 266: aload 0
// 267: lload 6
// 269: invokespecial su/catlean/_x.g (J)Z
// 26c: iload 18
// 26e: ifeq 299
// 271: ifeq 365
// 274: goto 281
// 277: ldc2_w 6447099350266171980
// 27a: lload 2
// 27b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 280: athrow
// 281: aload 19
// 283: checkcast net/minecraft/class_2664
// 286: invokevirtual net/minecraft/class_2664.comp_2884 ()Ljava/util/Optional;
// 289: invokevirtual java/util/Optional.isPresent ()Z
// 28c: goto 299
// 28f: ldc2_w 6447099350266171980
// 292: lload 2
// 293: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 298: athrow
// 299: iload 18
// 29b: ifeq 2ce
// 29e: ifeq 365
// 2a1: goto 2ae
// 2a4: ldc2_w 6447099350266171980
// 2a7: lload 2
// 2a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ad: athrow
// 2ae: aload 19
// 2b0: checkcast net/minecraft/class_2664
// 2b3: invokevirtual net/minecraft/class_2664.comp_2884 ()Ljava/util/Optional;
// 2b6: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 2b9: checkcast net/minecraft/class_243
// 2bc: getfield net/minecraft/class_243.field_1352 D
// 2bf: dconst_0
// 2c0: dcmpg
// 2c1: goto 2ce
// 2c4: ldc2_w 6447099350266171980
// 2c7: lload 2
// 2c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cd: athrow
// 2ce: iload 18
// 2d0: ifeq 2e4
// 2d3: ifne 2e7
// 2d6: goto 2e3
// 2d9: ldc2_w 6447099350266171980
// 2dc: lload 2
// 2dd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e2: athrow
// 2e3: bipush 1
// 2e4: goto 2e8
// 2e7: bipush 0
// 2e8: ifeq 366
// 2eb: aload 19
// 2ed: checkcast net/minecraft/class_2664
// 2f0: invokevirtual net/minecraft/class_2664.comp_2884 ()Ljava/util/Optional;
// 2f3: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 2f6: checkcast net/minecraft/class_243
// 2f9: getfield net/minecraft/class_243.field_1351 D
// 2fc: dconst_0
// 2fd: dcmpg
// 2fe: iload 18
// 300: ifeq 321
// 303: goto 310
// 306: ldc2_w 6447099350266171980
// 309: lload 2
// 30a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30f: athrow
// 310: ifne 324
// 313: goto 320
// 316: ldc2_w 6447099350266171980
// 319: lload 2
// 31a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31f: athrow
// 320: bipush 1
// 321: goto 325
// 324: bipush 0
// 325: ifeq 366
// 328: aload 19
// 32a: checkcast net/minecraft/class_2664
// 32d: invokevirtual net/minecraft/class_2664.comp_2884 ()Ljava/util/Optional;
// 330: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 333: checkcast net/minecraft/class_243
// 336: getfield net/minecraft/class_243.field_1350 D
// 339: dconst_0
// 33a: dcmpg
// 33b: iload 18
// 33d: ifeq 35e
// 340: goto 34d
// 343: ldc2_w 6447099350266171980
// 346: lload 2
// 347: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34c: athrow
// 34d: ifne 361
// 350: goto 35d
// 353: ldc2_w 6447099350266171980
// 356: lload 2
// 357: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35c: athrow
// 35d: bipush 1
// 35e: goto 362
// 361: bipush 0
// 362: ifeq 366
// 365: return
// 366: aload 0
// 367: lload 10
// 369: invokespecial su/catlean/_x.Z (J)Lsu/catlean/zn;
// 36c: getstatic su/catlean/d3.D [I
// 36f: swap
// 370: invokevirtual su/catlean/zn.ordinal ()I
// 373: iaload
// 374: tableswitch 334 1 4 63 32 316 227
// 394: aload 20
// 396: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 399: invokestatic java/util/Optional.of (Ljava/lang/Object;)Ljava/util/Optional;
// 39c: invokeinterface su/catlean/mixins/accessors/ClientboundExplodePacketAccessor.setPlayerKnockback (Ljava/util/Optional;)V 2
// 3a1: iload 18
// 3a3: ifne 4d4
// 3a6: goto 3b3
// 3a9: ldc2_w 6447099350266171980
// 3ac: lload 2
// 3ad: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b2: athrow
// 3b3: aload 19
// 3b5: checkcast net/minecraft/class_2664
// 3b8: invokevirtual net/minecraft/class_2664.comp_2884 ()Ljava/util/Optional;
// 3bb: iload 18
// 3bd: ifeq 409
// 3c0: goto 3cd
// 3c3: ldc2_w 6447099350266171980
// 3c6: lload 2
// 3c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cc: athrow
// 3cd: invokevirtual java/util/Optional.isPresent ()Z
// 3d0: ifeq 4d4
// 3d3: goto 3e0
// 3d6: ldc2_w 6447099350266171980
// 3d9: lload 2
// 3da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3df: athrow
// 3e0: aload 19
// 3e2: checkcast net/minecraft/class_2664
// 3e5: invokevirtual net/minecraft/class_2664.comp_2884 ()Ljava/util/Optional;
// 3e8: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 3eb: dup
// 3ec: sipush 6660
// 3ef: ldc2_w 8697678925337020078
// 3f2: lload 2
// 3f3: lxor
// 3f4: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/_x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3fc: goto 409
// 3ff: ldc2_w 6447099350266171980
// 402: lload 2
// 403: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 408: athrow
// 409: checkcast net/minecraft/class_243
// 40c: astore 21
// 40e: aload 20
// 410: new net/minecraft/class_243
// 413: dup
// 414: aload 21
// 416: getfield net/minecraft/class_243.field_1352 D
// 419: aload 0
// 41a: lload 8
// 41c: invokespecial su/catlean/_x.I (J)F
// 41f: f2d
// 420: dmul
// 421: ldc 100.0
// 423: f2d
// 424: ddiv
// 425: aload 21
// 427: getfield net/minecraft/class_243.field_1350 D
// 42a: aload 0
// 42b: lload 4
// 42d: invokespecial su/catlean/_x.D (J)F
// 430: f2d
// 431: dmul
// 432: ldc 100.0
// 434: f2d
// 435: ddiv
// 436: aload 21
// 438: getfield net/minecraft/class_243.field_1351 D
// 43b: aload 0
// 43c: lload 8
// 43e: invokespecial su/catlean/_x.I (J)F
// 441: f2d
// 442: dmul
// 443: ldc 100.0
// 445: f2d
// 446: ddiv
// 447: invokespecial net/minecraft/class_243.<init> (DDD)V
// 44a: invokestatic java/util/Optional.of (Ljava/lang/Object;)Ljava/util/Optional;
// 44d: invokeinterface su/catlean/mixins/accessors/ClientboundExplodePacketAccessor.setPlayerKnockback (Ljava/util/Optional;)V 2
// 452: iload 18
// 454: ifne 4d4
// 457: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 45a: invokevirtual su/catlean/dm.K ()J
// 45d: sipush 23256
// 460: ldc2_w 3585251738365672611
// 463: lload 2
// 464: lxor
// 465: invokedynamic g (IJ)J bsm=su/catlean/_x.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46a: lcmp
// 46b: iload 18
// 46d: ifeq 4a8
// 470: goto 47d
// 473: ldc2_w 6447099350266171980
// 476: lload 2
// 477: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47c: athrow
// 47d: ifle 4d4
// 480: goto 48d
// 483: ldc2_w 6447099350266171980
// 486: lload 2
// 487: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48c: athrow
// 48d: aload 20
// 48f: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 492: invokestatic java/util/Optional.of (Ljava/lang/Object;)Ljava/util/Optional;
// 495: invokeinterface su/catlean/mixins/accessors/ClientboundExplodePacketAccessor.setPlayerKnockback (Ljava/util/Optional;)V 2
// 49a: bipush 1
// 49b: goto 4a8
// 49e: ldc2_w 6447099350266171980
// 4a1: lload 2
// 4a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a7: athrow
// 4a8: putstatic su/catlean/_x.k Z
// 4ab: iload 18
// 4ad: ifne 4d4
// 4b0: iload 18
// 4b2: ifne 4d4
// 4b5: goto 4c2
// 4b8: ldc2_w 6447099350266171980
// 4bb: lload 2
// 4bc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c1: athrow
// 4c2: new kotlin/NoWhenBranchMatchedException
// 4c5: dup
// 4c6: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 4c9: athrow
// 4ca: ldc2_w 6447099350266171980
// 4cd: lload 2
// 4ce: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d3: athrow
// 4d4: aload 0
// 4d5: lload 10
// 4d7: invokespecial su/catlean/_x.Z (J)Lsu/catlean/zn;
// 4da: getstatic su/catlean/zn.OldGrim Lsu/catlean/zn;
// 4dd: if_acmpne 53c
// 4e0: aload 19
// 4e2: instanceof net/minecraft/class_6373
// 4e5: iload 18
// 4e7: ifeq 541
// 4ea: goto 4f7
// 4ed: ldc2_w 6447099350266171980
// 4f0: lload 2
// 4f1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f6: athrow
// 4f7: ifeq 53c
// 4fa: goto 507
// 4fd: ldc2_w 6447099350266171980
// 500: lload 2
// 501: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 506: athrow
// 507: getstatic su/catlean/_x.X I
// 50a: iload 18
// 50c: ifeq 541
// 50f: goto 51c
// 512: ldc2_w 6447099350266171980
// 515: lload 2
// 516: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51b: athrow
// 51c: ifle 53c
// 51f: goto 52c
// 522: ldc2_w 6447099350266171980
// 525: lload 2
// 526: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52b: athrow
// 52c: aload 1
// 52d: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 530: getstatic su/catlean/_x.X I
// 533: istore 20
// 535: iload 20
// 537: bipush -1
// 538: iadd
// 539: putstatic su/catlean/_x.X I
// 53c: aload 19
// 53e: instanceof net/minecraft/class_2708
// 541: iload 18
// 543: ifeq 557
// 546: ifeq 55a
// 549: goto 556
// 54c: ldc2_w 6447099350266171980
// 54f: lload 2
// 550: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 555: athrow
// 556: bipush 0
// 557: putstatic su/catlean/_x.a Z
// 55a: return
}

private final boolean g(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_x.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 15645194676987
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 3
// 012: dup2
// 013: bipush 8
// 015: lshl
// 016: bipush 8
// 018: lushr
// 019: lstore 4
// 01b: pop2
// 01c: dup2
// 01d: ldc2_w 60510575124702
// 020: lxor
// 021: lstore 6
// 023: dup2
// 024: ldc2_w 112678685914417
// 027: lxor
// 028: lstore 8
// 02a: dup2
// 02b: ldc2_w 52226687898789
// 02e: lxor
// 02f: lstore 10
// 031: dup2
// 032: ldc2_w 122461783250013
// 035: lxor
// 036: lstore 12
// 038: dup2
// 039: ldc2_w 9431813934570
// 03c: lxor
// 03d: lstore 14
// 03f: dup2
// 040: ldc2_w 64677210325977
// 043: lxor
// 044: lstore 16
// 046: dup2
// 047: ldc2_w 120361446009594
// 04a: lxor
// 04b: lstore 18
// 04d: pop2
// 04e: ldc2_w 4050300909499960842
// 051: lload 1
// 052: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: aload 0
// 058: lload 18
// 05a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05d: iload 3
// 05e: i2b
// 05f: swap
// 060: lload 4
// 062: dup2_x1
// 063: pop2
// 064: checkcast net/minecraft/class_1297
// 067: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 06a: checkcast net/minecraft/class_2374
// 06d: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 070: dup
// 071: sipush 2697
// 074: ldc2_w 3531545768219064240
// 077: lload 1
// 078: lxor
// 079: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/_x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 081: astore 21
// 083: istore 20
// 085: lload 12
// 087: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 08a: aload 21
// 08c: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 08f: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 092: instanceof net/minecraft/class_2189
// 095: iload 20
// 097: ifne 10a
// 09a: ifne 104
// 09d: goto 0aa
// 0a0: ldc2_w 4099008132184224726
// 0a3: lload 1
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: aload 0
// 0ab: lload 16
// 0ad: invokespecial su/catlean/_x.F (J)Z
// 0b0: iload 20
// 0b2: ifne 103
// 0b5: goto 0c2
// 0b8: ldc2_w 4099008132184224726
// 0bb: lload 1
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: ifeq 102
// 0c5: goto 0d2
// 0c8: ldc2_w 4099008132184224726
// 0cb: lload 1
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: lload 18
// 0d4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d7: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 0da: iload 20
// 0dc: lload 1
// 0dd: lconst_0
// 0de: lcmp
// 0df: ifle 10c
// 0e2: ifne 10a
// 0e5: goto 0f2
// 0e8: ldc2_w 4099008132184224726
// 0eb: lload 1
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: ifeq 104
// 0f5: goto 102
// 0f8: ldc2_w 4099008132184224726
// 0fb: lload 1
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: bipush 1
// 103: ireturn
// 104: aload 0
// 105: lload 6
// 107: invokespecial su/catlean/_x.w (J)Z
// 10a: iload 20
// 10c: ifne 167
// 10f: ifeq 15f
// 112: goto 11f
// 115: ldc2_w 4099008132184224726
// 118: lload 1
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 122: lload 8
// 124: invokevirtual su/catlean/dm.Y (J)Z
// 127: iload 20
// 129: lload 1
// 12a: lconst_0
// 12b: lcmp
// 12c: ifle 169
// 12f: ifne 167
// 132: goto 13f
// 135: ldc2_w 4099008132184224726
// 138: lload 1
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: ifne 15f
// 142: goto 14f
// 145: ldc2_w 4099008132184224726
// 148: lload 1
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: bipush 1
// 150: putstatic su/catlean/_x.a Z
// 153: bipush 1
// 154: ireturn
// 155: ldc2_w 4099008132184224726
// 158: lload 1
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: lload 18
// 161: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 164: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 167: iload 20
// 169: ifne 1ef
// 16c: ifne 1dc
// 16f: goto 17c
// 172: ldc2_w 4099008132184224726
// 175: lload 1
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: lload 18
// 17e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 181: invokevirtual net/minecraft/class_746.method_5869 ()Z
// 184: iload 20
// 186: lload 1
// 187: lconst_0
// 188: lcmp
// 189: ifle 1f1
// 18c: ifne 1ef
// 18f: goto 19c
// 192: ldc2_w 4099008132184224726
// 195: lload 1
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: lload 1
// 19d: lconst_0
// 19e: lcmp
// 19f: ifle 1e2
// 1a2: ifne 1dc
// 1a5: goto 1b2
// 1a8: ldc2_w 4099008132184224726
// 1ab: lload 1
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: lload 18
// 1b4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b7: invokevirtual net/minecraft/class_746.method_5771 ()Z
// 1ba: iload 20
// 1bc: ifne 21c
// 1bf: goto 1cc
// 1c2: ldc2_w 4099008132184224726
// 1c5: lload 1
// 1c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cb: athrow
// 1cc: ifeq 216
// 1cf: goto 1dc
// 1d2: ldc2_w 4099008132184224726
// 1d5: lload 1
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: aload 0
// 1dd: lload 14
// 1df: invokespecial su/catlean/_x.H (J)Z
// 1e2: goto 1ef
// 1e5: ldc2_w 4099008132184224726
// 1e8: lload 1
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: iload 20
// 1f1: lload 1
// 1f2: lconst_0
// 1f3: lcmp
// 1f4: ifle 21e
// 1f7: ifne 21c
// 1fa: ifeq 216
// 1fd: goto 20a
// 200: ldc2_w 4099008132184224726
// 203: lload 1
// 204: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 209: athrow
// 20a: bipush 0
// 20b: ireturn
// 20c: ldc2_w 4099008132184224726
// 20f: lload 1
// 210: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 215: athrow
// 216: aload 0
// 217: lload 6
// 219: invokespecial su/catlean/_x.w (J)Z
// 21c: iload 20
// 21e: ifne 266
// 221: ifne 265
// 224: goto 231
// 227: ldc2_w 4099008132184224726
// 22a: lload 1
// 22b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: athrow
// 231: aload 0
// 232: lload 10
// 234: invokespecial su/catlean/_x.e (J)Z
// 237: iload 20
// 239: ifne 266
// 23c: goto 249
// 23f: ldc2_w 4099008132184224726
// 242: lload 1
// 243: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 248: athrow
// 249: ifne 265
// 24c: goto 259
// 24f: ldc2_w 4099008132184224726
// 252: lload 1
// 253: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: athrow
// 259: bipush 1
// 25a: ireturn
// 25b: ldc2_w 4099008132184224726
// 25e: lload 1
// 25f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 264: athrow
// 265: bipush 0
// 266: ireturn
}

@Flow(
priority = -10
)
private final void V(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_x.b J
// 003: ldc2_w 53359482234442
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 22585536370913
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 80467203070028
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
// 027: ldc2_w 36758884927366
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 40243931417502
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 81749780170227
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 87417996459869
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 44484291045098
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 56799805601952
// 04d: lxor
// 04e: lstore 19
// 050: dup2
// 051: ldc2_w 46388037233672
// 054: lxor
// 055: lstore 21
// 057: dup2
// 058: ldc2_w 136889999598622
// 05b: lxor
// 05c: lstore 23
// 05e: dup2
// 05f: ldc2_w 46601476282445
// 062: lxor
// 063: lstore 25
// 065: pop2
// 066: ldc2_w 5403822774155624141
// 069: lload 2
// 06a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: istore 27
// 071: lload 25
// 073: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 076: invokevirtual net/minecraft/class_746.method_5799 ()Z
// 079: iload 27
// 07b: ifeq 0cb
// 07e: ifne 0b8
// 081: goto 08e
// 084: ldc2_w 5356430565875401057
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: lload 25
// 090: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 093: invokevirtual net/minecraft/class_746.method_5869 ()Z
// 096: iload 27
// 098: ifeq 0e9
// 09b: goto 0a8
// 09e: ldc2_w 5356430565875401057
// 0a1: lload 2
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: ifeq 0e1
// 0ab: goto 0b8
// 0ae: ldc2_w 5356430565875401057
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: lload 15
// 0bb: invokespecial su/catlean/_x.H (J)Z
// 0be: goto 0cb
// 0c1: ldc2_w 5356430565875401057
// 0c4: lload 2
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: iload 27
// 0cd: ifeq 0e9
// 0d0: ifeq 0e1
// 0d3: goto 0e0
// 0d6: ldc2_w 5356430565875401057
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: return
// 0e1: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0e4: lload 9
// 0e6: invokevirtual su/catlean/dm.Y (J)Z
// 0e9: iload 27
// 0eb: ifeq 11d
// 0ee: ifeq 10f
// 0f1: goto 0fe
// 0f4: ldc2_w 5356430565875401057
// 0f7: lload 2
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: bipush 0
// 0ff: putstatic su/catlean/_x.a Z
// 102: goto 10f
// 105: ldc2_w 5356430565875401057
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: aload 0
// 110: lload 19
// 112: invokespecial su/catlean/_x.Z (J)Lsu/catlean/zn;
// 115: getstatic su/catlean/d3.D [I
// 118: swap
// 119: invokevirtual su/catlean/zn.ordinal ()I
// 11c: iaload
// 11d: iload 27
// 11f: ifeq 265
// 122: bipush 4
// 123: if_icmpne 262
// 126: goto 133
// 129: ldc2_w 5356430565875401057
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: getstatic su/catlean/_x.k Z
// 136: iload 27
// 138: ifeq 265
// 13b: goto 148
// 13e: ldc2_w 5356430565875401057
// 141: lload 2
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: ifeq 262
// 14b: goto 158
// 14e: ldc2_w 5356430565875401057
// 151: lload 2
// 152: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: athrow
// 158: lload 25
// 15a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 15d: invokevirtual net/minecraft/class_746.method_20448 ()Z
// 160: iload 27
// 162: ifeq 1a7
// 165: goto 172
// 168: ldc2_w 5356430565875401057
// 16b: lload 2
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: ifne 1aa
// 175: goto 182
// 178: ldc2_w 5356430565875401057
// 17b: lload 2
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: aload 0
// 183: iload 27
// 185: ifeq 1ab
// 188: goto 195
// 18b: ldc2_w 5356430565875401057
// 18e: lload 2
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: lload 4
// 197: invokespecial su/catlean/_x.E (J)Z
// 19a: goto 1a7
// 19d: ldc2_w 5356430565875401057
// 1a0: lload 2
// 1a1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: athrow
// 1a7: ifeq 1c7
// 1aa: aload 0
// 1ab: lload 25
// 1ad: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b0: iload 6
// 1b2: i2b
// 1b3: swap
// 1b4: lload 7
// 1b6: dup2_x1
// 1b7: pop2
// 1b8: checkcast net/minecraft/class_1297
// 1bb: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1be: checkcast net/minecraft/class_2374
// 1c1: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 1c4: goto 1d2
// 1c7: lload 25
// 1c9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1cc: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
// 1cf: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 1d2: astore 30
// 1d4: aload 30
// 1d6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1d9: aload 30
// 1db: astore 29
// 1dd: lload 17
// 1df: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1e2: aload 29
// 1e4: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 1e7: iload 27
// 1e9: ifeq 25f
// 1ec: ifeq 25e
// 1ef: goto 1fc
// 1f2: ldc2_w 5356430565875401057
// 1f5: lload 2
// 1f6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: athrow
// 1fc: new net/minecraft/class_2828$class_2830
// 1ff: dup
// 200: lload 25
// 202: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 205: invokevirtual net/minecraft/class_746.method_23317 ()D
// 208: lload 25
// 20a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 20d: invokevirtual net/minecraft/class_746.method_23318 ()D
// 210: lload 25
// 212: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 215: invokevirtual net/minecraft/class_746.method_23321 ()D
// 218: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 21b: lload 11
// 21d: invokevirtual su/catlean/dm.U (J)F
// 220: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 223: lload 13
// 225: invokevirtual su/catlean/dm.w (J)F
// 228: lload 25
// 22a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22d: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 230: lload 25
// 232: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 235: getfield net/minecraft/class_746.field_5976 Z
// 238: invokespecial net/minecraft/class_2828$class_2830.<init> (DDDFFZZ)V
// 23b: checkcast net/minecraft/class_2596
// 23e: lload 21
// 240: dup2_x1
// 241: pop2
// 242: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 245: invokedynamic predict ()Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/_x.q (I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 24a: lload 23
// 24c: dup2_x1
// 24d: pop2
// 24e: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 251: goto 25e
// 254: ldc2_w 5356430565875401057
// 257: lload 2
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: bipush 0
// 25f: putstatic su/catlean/_x.k Z
// 262: getstatic su/catlean/_x.X I
// 265: iload 27
// 267: ifeq 27d
// 26a: ifle 286
// 26d: goto 27a
// 270: ldc2_w 5356430565875401057
// 273: lload 2
// 274: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: athrow
// 27a: getstatic su/catlean/_x.X I
// 27d: istore 28
// 27f: iload 28
// 281: bipush -1
// 282: iadd
// 283: putstatic su/catlean/_x.X I
// 286: return
}

@Flow
private final void w(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_x.b J
// 03: ldc2_w 49469373520602
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 119191357812473
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w 3896410102352101421
// 14: lload 2
// 15: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: istore 6
// 1c: aload 0
// 1d: lload 4
// 1f: invokespecial su/catlean/_x.w (J)Z
// 22: iload 6
// 24: ifne 3a
// 27: ifeq 7c
// 2a: goto 37
// 2d: ldc2_w 3946773138000854513
// 30: lload 2
// 31: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36: athrow
// 37: getstatic su/catlean/_x.a Z
// 3a: iload 6
// 3c: ifne 75
// 3f: ifeq 7c
// 42: goto 4f
// 45: ldc2_w 3946773138000854513
// 48: lload 2
// 49: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: athrow
// 4f: aload 1
// 50: iload 6
// 52: ifne 79
// 55: goto 62
// 58: ldc2_w 3946773138000854513
// 5b: lload 2
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 65: instanceof net/minecraft/class_2828
// 68: goto 75
// 6b: ldc2_w 3946773138000854513
// 6e: lload 2
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: ifeq 7c
// 78: aload 1
// 79: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// 7c: return
}

public final void L(long var1, short var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 77075406452581L;
boolean var8 = vm.a<"Å">(-6881391845928086349L, var4);

boolean var10000;
label20: {
try {
var10000 = this.r(var6);
if (!var8) {
break label20;
}

if (!var10000) {
return;
}
} catch (NoWhenBranchMatchedException var9) {
throw vm.a<"Å">(var9, -6905280993660916961L, var4);
}

var10000 = false;
}

a = var10000;
}

@Override
public void O(long var1) {
X = 0;
}

private static final boolean n() {
long var0 = b ^ 109528183324080L;
long var2 = var0 ^ 106319779603290L;

try {
if (I.Z(var2) == zn.GrimNew) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 1274393498052860571L, var0);
}

return false;
}

private static final boolean j() {
long var0 = b ^ 117853263748161L;
long var2 = var0 ^ 56908542467097L;
return I.e(var2);
}

private static final boolean h() {
long var0 = b ^ 94147241036153L;
long var2 = var0 ^ 23342178286938L;
return I.w(var2);
}

private static final boolean Y() {
long var0 = b ^ 78103053641889L;
long var2 = var0 ^ 74937717175883L;

try {
if (I.Z(var2) == zn.Custom) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 341898325340131210L, var0);
}

return false;
}

private static final boolean A() {
long var0 = b ^ 50921094166876L;
long var2 = var0 ^ 49894525839286L;

try {
if (I.Z(var2) == zn.Custom) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 1532283734102711927L, var0);
}

return false;
}

private static final class_2596 q(int var0) {
long var1 = b ^ 58317420802853L;
long var3 = var1 ^ 18722685324686L;
int var5 = (int)((var1 ^ 84261198843171L) >>> 56);
long var6 = (var1 ^ 84261198843171L) << 8 >>> 8;
long var8 = var1 ^ 52707531279650L;

class_2846 var10000;
class_2846 var10001;
class_2847 var10002;
class_2338 var10003;
label21: {
label20: {
try {
var10000 = new class_2846;
var10001 = var10000;
var10002 = class_2847.field_12973;
if (zf.v(var8).method_20448() || I.E(var3)) {
break label20;
}
} catch (NoWhenBranchMatchedException var10) {
throw vm.a<"Å">(var10, 2250349239933670414L, var1);
}

var10003 = zf.v(var8).method_24515().method_10084();
break label21;
}

var10003 = class_2338.method_49638((class_2374)I.J((byte)var5, var6, (class_1297)zf.v(var8)));
}

var10001./* $VF: Unable to resugar constructor */<init>(var10002, var10003, class_2350.field_11033, var0);
return (class_2596)var10000;
}

static {
long var31 = b ^ 2105606807897L;
long var33 = var31 ^ 44359739867455L;
long var35 = var31 ^ 49023282824365L;
long var37 = var31 ^ 31463769164515L;
long var39 = var31 ^ 103216728895575L;
vm.a<"Å">(true, -8225537008915501643L, var31);
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[37];
int var27 = 0;
String var26 = "Ð\u0012Ú¡ÊßEÅ¤\u0000\u0099\u009e\u0018<è®\u008bQ]±\u0082\u001eÕÆ\f\u0090z\t\u0097yIüÓ\u0016Èù\u0005\u001bH` û\u0080,ç6\u0005\u0011 äkèÌ\u0002\u00ad\u0098Õ³0½\u0088\u000b/Åúª\u0084x¥\u0019$\u0083, \u008a\u001e@ \u0083æ-\u008e\u008dQ\u0080\u0001aÜ:<\u009f\b\u0007oâþa¢\u000b.IbP\u008f\u009cK\u0018àÃGßúÆÇU¿J;\u009a\u001a\u0083-Å\u0093þ¶\u0002Íï´µ\u0018Ì×º:©OÊ½\u0085Ãò%\u0083\u009fÒC®¥ÑÜ°\u0082\u0010\u0000 ö\u0015ïða9\u000b¹!NëÛ\u0007yÜº\u0004Ü\u009e\u0000ôPr\u008e(0K\u0092ïû»k\u0018ô(Åõ\u0004CÛ\u001e/$ì\u009dýSß¦y¢\u0097¶[¬ã\u009c\u0018,I\u0099MW]=s\u0080\u0089l\tmÀ\u0007Ú¡½f\u0080:§M¬\u0018ÙÖ\u00106\u00943¶Çá]D-Ì\u0086Â\u0087_\u0003\u001d×©(¶®(\u008cú®\u0012\u0014{+<]\u0095\u009axf©Y!C9hÏ\u0087\nT\u0094àîjüÐ\u001f\u0014G\u000e¹\u009e \u0018\u0017½Ú\u0018cóÄ*L\u0084\u001bL'0\u0006\u008d³µÔ\u0000\u008b3ÙöÕç\u0089x0\u009b\u0098\u0091í\u0084ô\u0090,bs\tçÚÇ\u001e\fp(ÔP\u001d\bãÞëvË]$PtâÎ1\u0085\u0013?ý\u001c[UÐÛ/\u0090Rkz \u0015!¥Û%:ÉO©«%þ\u0098¢ÐMòAB#«\u00946Æª\u0000ËÑh\u0081øQ\u0018|5¶{\u0092\u0005\n·\u00191É_'Uä¢\u00801:{\u0011Ü\u0088` µ\nÖjJ\u008bR×\ng-\u001e¦!Ó\u008c@¯5ù!\u00ad\u0097\u0087Æ\u008e¾}Jj-È ç\u0011\u001f\b1\u0018E\u0001Y\u0089¥Si¼\u0080ä9À÷\u0010AÃ2\u0010+\"$f[(\u0081é ãÚßìíG6\u0003å¬\u0002ÒÂÝ\u0000\u0090\u008aîgÙ\u0094WfI\u0018°R|É¾4s(ØV-#\u0010\u0016¶#¢á\u009c÷,\u0098\u001b\n´JS¥l5K\bÓû¼1ºe\u0089U°¶[ÿÿ\u0093A²(\u0081½à\u0098_=T\u009cG\u0014\u009bÃ\"àNtd)\u0001\u0005x\u001fÝ\u009fÎ§_¸¨þÿ\u0019ì\u0098×g[Õâ1(e,>)V{\u0099§A+ ¢$Áø\u0007wÜ5¢¯É\u0083yníÓ\u009czfí\\\u0015£\u008f\u008dê\nÝY ]Á\u001e§]Ñ\u00883¨\f&\u0082Ü\u001e]ê\u0097TY\u0016[/13RVN{yý²\u0014\u0010#Ì \u0000Üa6bHcv\u0088Ü5\u0013½ Pæ\u0095\u009b`¢q¦ÿ\u0084ø\u009dÎæ Ø%\u001b?çÒU¨©\bIê\u001a²\u008clf \u008b»\u007flr\nì§\u0014¡\u0093Yøì2~¿\u0088\u0011^E&6éî \u001eåY¥\u0014§ j]ÿJª!\u0002\u009a\u0089ÑÐðÜ\u0014GNÕá\u0080\u0006Å#{û!Þÿ\u001c\u0004È\u00862(ÛµÌ\u0019pk1@¢lK{tý[Ù\u009eÃÒ\u000eÑîÛmêc\u0006\tÀ~âÑ\bãÆi\u001cÒ0þ\u0010Jwb]~þØð`5vQ\u0019\u0013Öi ¢s\u0098ùÌÈï®\u0094´,¡ \rE`\u0092\u0010Ï_;µ³n¦\u009eÅ4)B¼@ \u008fCàNÆx\u000b\u0003fdÓúß¶Æ¨1®)\u008c\u0087\u0004\u0006\u0090\u0003>FSº^ªGâÇ³\u00ad(>\u0006Àjû\u0001\u001eOì\u0093ÞÚØ=ú@\u0090ÃM\u0017)uö!d`é\u0015Ñ\u001c¡ä\u0081\u007f\u0080\u0087ÿ)KÈiïäu\u0087LíÒ\r\u0003ª£V¨ÂòE~\u0091(cÐê¯\t!È\u0092¬eoÉ]D\u009b¿[Ïfnjÿ\u0016ÃlQÊÿÅ\u009d\n\u0002\u0080S\u008aÊN1Ï[\u001bF¦ó\\\u0080\u00adÊ\u008e\u001a¬dÀó-phã²£¸!\u001c\u0018\u0093¾d(ùå§uO¦ü4WQ¢}\u0012õ'ï\u0017nÄ\u0089 Ó!}áÍºE\u0096z\u0005ù\u000ftä´T\u0099±+uJ³@çóu\u0080Í\fãÌ\u008c ^C\u00849Â)\u0000\u007f÷ÌäÌ|æiÃ#ç|B&w\u009báó^G±\u009fÏ_\u0004(\u0007½mpA)\u007f\u0092@üB%T³á¿Ö ýàÜ$}W\u009e\u0092Îç\u0095Pê(\u0014\u0011âÃ\u000f0uä\u0010eqi\u0004µ\u0090Wp_ëH\u0017Úó\f\u0088 Án>!jäM¾#×¬Y\u001aa÷Ü\u0019þ¾ã=\u001a\u007f\u0012°MÕ2°S-)";
int var28 = "Ð\u0012Ú¡ÊßEÅ¤\u0000\u0099\u009e\u0018<è®\u008bQ]±\u0082\u001eÕÆ\f\u0090z\t\u0097yIüÓ\u0016Èù\u0005\u001bH` û\u0080,ç6\u0005\u0011 äkèÌ\u0002\u00ad\u0098Õ³0½\u0088\u000b/Åúª\u0084x¥\u0019$\u0083, \u008a\u001e@ \u0083æ-\u008e\u008dQ\u0080\u0001aÜ:<\u009f\b\u0007oâþa¢\u000b.IbP\u008f\u009cK\u0018àÃGßúÆÇU¿J;\u009a\u001a\u0083-Å\u0093þ¶\u0002Íï´µ\u0018Ì×º:©OÊ½\u0085Ãò%\u0083\u009fÒC®¥ÑÜ°\u0082\u0010\u0000 ö\u0015ïða9\u000b¹!NëÛ\u0007yÜº\u0004Ü\u009e\u0000ôPr\u008e(0K\u0092ïû»k\u0018ô(Åõ\u0004CÛ\u001e/$ì\u009dýSß¦y¢\u0097¶[¬ã\u009c\u0018,I\u0099MW]=s\u0080\u0089l\tmÀ\u0007Ú¡½f\u0080:§M¬\u0018ÙÖ\u00106\u00943¶Çá]D-Ì\u0086Â\u0087_\u0003\u001d×©(¶®(\u008cú®\u0012\u0014{+<]\u0095\u009axf©Y!C9hÏ\u0087\nT\u0094àîjüÐ\u001f\u0014G\u000e¹\u009e \u0018\u0017½Ú\u0018cóÄ*L\u0084\u001bL'0\u0006\u008d³µÔ\u0000\u008b3ÙöÕç\u0089x0\u009b\u0098\u0091í\u0084ô\u0090,bs\tçÚÇ\u001e\fp(ÔP\u001d\bãÞëvË]$PtâÎ1\u0085\u0013?ý\u001c[UÐÛ/\u0090Rkz \u0015!¥Û%:ÉO©«%þ\u0098¢ÐMòAB#«\u00946Æª\u0000ËÑh\u0081øQ\u0018|5¶{\u0092\u0005\n·\u00191É_'Uä¢\u00801:{\u0011Ü\u0088` µ\nÖjJ\u008bR×\ng-\u001e¦!Ó\u008c@¯5ù!\u00ad\u0097\u0087Æ\u008e¾}Jj-È ç\u0011\u001f\b1\u0018E\u0001Y\u0089¥Si¼\u0080ä9À÷\u0010AÃ2\u0010+\"$f[(\u0081é ãÚßìíG6\u0003å¬\u0002ÒÂÝ\u0000\u0090\u008aîgÙ\u0094WfI\u0018°R|É¾4s(ØV-#\u0010\u0016¶#¢á\u009c÷,\u0098\u001b\n´JS¥l5K\bÓû¼1ºe\u0089U°¶[ÿÿ\u0093A²(\u0081½à\u0098_=T\u009cG\u0014\u009bÃ\"àNtd)\u0001\u0005x\u001fÝ\u009fÎ§_¸¨þÿ\u0019ì\u0098×g[Õâ1(e,>)V{\u0099§A+ ¢$Áø\u0007wÜ5¢¯É\u0083yníÓ\u009czfí\\\u0015£\u008f\u008dê\nÝY ]Á\u001e§]Ñ\u00883¨\f&\u0082Ü\u001e]ê\u0097TY\u0016[/13RVN{yý²\u0014\u0010#Ì \u0000Üa6bHcv\u0088Ü5\u0013½ Pæ\u0095\u009b`¢q¦ÿ\u0084ø\u009dÎæ Ø%\u001b?çÒU¨©\bIê\u001a²\u008clf \u008b»\u007flr\nì§\u0014¡\u0093Yøì2~¿\u0088\u0011^E&6éî \u001eåY¥\u0014§ j]ÿJª!\u0002\u009a\u0089ÑÐðÜ\u0014GNÕá\u0080\u0006Å#{û!Þÿ\u001c\u0004È\u00862(ÛµÌ\u0019pk1@¢lK{tý[Ù\u009eÃÒ\u000eÑîÛmêc\u0006\tÀ~âÑ\bãÆi\u001cÒ0þ\u0010Jwb]~þØð`5vQ\u0019\u0013Öi ¢s\u0098ùÌÈï®\u0094´,¡ \rE`\u0092\u0010Ï_;µ³n¦\u009eÅ4)B¼@ \u008fCàNÆx\u000b\u0003fdÓúß¶Æ¨1®)\u008c\u0087\u0004\u0006\u0090\u0003>FSº^ªGâÇ³\u00ad(>\u0006Àjû\u0001\u001eOì\u0093ÞÚØ=ú@\u0090ÃM\u0017)uö!d`é\u0015Ñ\u001c¡ä\u0081\u007f\u0080\u0087ÿ)KÈiïäu\u0087LíÒ\r\u0003ª£V¨ÂòE~\u0091(cÐê¯\t!È\u0092¬eoÉ]D\u009b¿[Ïfnjÿ\u0016ÃlQÊÿÅ\u009d\n\u0002\u0080S\u008aÊN1Ï[\u001bF¦ó\\\u0080\u00adÊ\u008e\u001a¬dÀó-phã²£¸!\u001c\u0018\u0093¾d(ùå§uO¦ü4WQ¢}\u0012õ'ï\u0017nÄ\u0089 Ó!}áÍºE\u0096z\u0005ù\u000ftä´T\u0099±+uJ³@çóu\u0080Í\fãÌ\u008c ^C\u00849Â)\u0000\u007f÷ÌäÌ|æiÃ#ç|B&w\u009báó^G±\u009fÏ_\u0004(\u0007½mpA)\u007f\u0092@üB%T³á¿Ö ýàÜ$}W\u009e\u0092Îç\u0095Pê(\u0014\u0011âÃ\u000f0uä\u0010eqi\u0004µ\u0090Wp_ëH\u0017Úó\f\u0088 Án>!jäM¾#×¬Y\u001aa÷Ü\u0019þ¾ã=\u001a\u007f\u0012°MÕ2°S-)"
.length();
char var25 = '(';
int var44 = -1;

label72:
while (true) {
String var45 = var26.substring(++var44, var44 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var45.getBytes("ISO-8859-1"));
String var59 = b(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var59;
if ((var44 += var25) >= var28) {
c = var29;
f = new String[37];
m = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[13];
int var14 = 0;
String var15 = "åë\u0091ço¼\u00130X2»àíÖéèhü*Æ\fÒ\u001eÊòÊB¢æ¡ËÔ\u001dnÆ\u0014X\u000fèÒ\u0086e]\u001b;Fð\u0081ü3\re\u0085¼`\u0093µ¦<\u0096~tÛÎ\u0083H¹»¶\u0013#%Ú\u0091z@M\u0090\u008a\u0098\u009dM\u008cówL\u0015ê";
int var16 = "åë\u0091ço¼\u00130X2»àíÖéèhü*Æ\fÒ\u001eÊòÊB¢æ¡ËÔ\u001dnÆ\u0014X\u000fèÒ\u0086e]\u001b;Fð\u0081ü3\re\u0085¼`\u0093µ¦<\u0096~tÛÎ\u0083H¹»¶\u0013#%Ú\u0091z@M\u0090\u008a\u0098\u009dM\u008cówL\u0015ê"
.length();
byte var13 = 0;

label54:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var48 = var17;
var10001 = var14++;
long var63 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var67 = -1;

while (true) {
long var19 = var63;
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
long var71 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var67) {
case 0:
var48[var10001] = var71;
if (var13 >= var16) {
i = var17;
l = new Integer[13];
w = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "'ûÐÜXs\u0080&Pô·u&¨W$";
int var5 = "'ûÐÜXs\u0080&Pô·u&¨W$".length();
byte var2 = 0;

do {
int var56 = var2;
var2 += 8;
byte[] var7 = var4.substring(var56, var2).getBytes("ISO-8859-1");
var56 = var3++;
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
var71 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var70 = -1;
var6[var56] = var71;
} while (var2 < var5);

n = var6;
o = new Long[2];
KProperty[] var41 = new KProperty[c<"f">(11856, 7117512287929176577L ^ var31)];
var41[0] = Reflection.property1(
new PropertyReference1Impl(_x.class, b<"z">(9717, 5624551657412603222L ^ var31), b<"z">(13151, 5235859898164820950L ^ var31), 0)
);
var41[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(28696, 3736844168525510802L ^ var31), b<"z">(15926, 7141816742503462579L ^ var31), 0)
);
var41[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(10352, 1759591096228618486L ^ var31), b<"z">(9787, 433543837172706969L ^ var31), 0)
);
var41[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(27385, 8967310062880219749L ^ var31), b<"z">(16949, 3971998104829315767L ^ var31), 0)
);
var41[4] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(21125, 2106566290603956765L ^ var31), b<"z">(27738, 5494580432525649118L ^ var31), 0)
);
var41[5] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(14546, 8146335836719296594L ^ var31), b<"z">(14113, 571581554505990078L ^ var31), 0)
);
var41[c<"f">(4482, 2464243465621777878L ^ var31)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(26803, 350649359080972330L ^ var31), b<"z">(3536, 1920253012718224731L ^ var31), 0)
);
var41[c<"f">(30005, 6366205037518178670L ^ var31)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(4453, 3470494945645107684L ^ var31), b<"z">(22399, 5763738768807452633L ^ var31), 0)
);
var41[c<"f">(27395, 1376089989617375060L ^ var31)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(6903, 3608201825918390881L ^ var31), b<"z">(5527, 7853786294416907527L ^ var31), 0)
);
var41[c<"f">(21366, 6506166062290300714L ^ var31)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(11489, 3351887410976728128L ^ var31), b<"z">(14652, 5583526384419254702L ^ var31), 0)
);
var41[c<"f">(19946, 174483225685914035L ^ var31)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_x.class, b<"z">(25185, 2448777957022788347L ^ var31), b<"z">(7125, 5340948813746967366L ^ var31), 0)
);
E = var41;
I = new _x(var33);
d = yp.L(I, b<"z">(11121, 2194385146709844966L ^ var31), zn.GrimNew, null, null, c<"f">(10238, 7461059057430535083L ^ var31), null, var39);
C = yp.t(I, b<"z">(24443, 4528724993964365815L ^ var31), false, var37, null, _x::n, 4, null);
h = yp.t(I, b<"z">(1074, 8715228436847594659L ^ var31), false, var37, null, null, c<"f">(24144, 376512425648415242L ^ var31), null);
e = yp.t(I, b<"z">(8886, 5612654960466635299L ^ var31), true, var37, null, null, c<"f">(24144, 376512425648415242L ^ var31), null);
L = yp.t(I, b<"z">(3589, 8216666720792708773L ^ var31), false, var37, null, null, c<"f">(24144, 376512425648415242L ^ var31), null);
u = yp.t(I, b<"z">(24414, 3400934830422382553L ^ var31), false, var37, null, null, c<"f">(24144, 376512425648415242L ^ var31), null);
j = yp.t(I, b<"z">(15419, 1509216213465117878L ^ var31), false, var37, null, _x::j, 4, null);
t = yp.t(I, b<"z">(26419, 8544685604201295805L ^ var31), false, var37, null, null, c<"f">(24144, 376512425648415242L ^ var31), null);
F = yp.t(I, b<"z">(25825, 649737735907077242L ^ var31), false, var37, null, _x::h, 4, null);
Y = yp.k(
I, b<"z">(25600, 1517871143002172547L ^ var31), 0.0F, var35, RangesKt.rangeTo(0.0F, 100.0F), null, _x::Y, c<"f">(18093, 4353914801626675954L ^ var31), null
);
A = yp.k(
I, b<"z">(6874, 1334048600882975314L ^ var31), 0.0F, var35, RangesKt.rangeTo(0.0F, 100.0F), null, _x::A, c<"f">(18093, 4353914801626675954L ^ var31), null
);
return;
}
break;
default:
var48[var10001] = var71;
if (var13 < var16) {
continue label54;
}

var15 = "*Uò\u0016 q\u0016w³ê¢vj?¾\u008c";
var16 = "*Uò\u0016 q\u0016w³ê¢vj?¾\u008c".length();
var13 = 0;
}

byte var55 = var13;
var13 += 8;
var18 = var15.substring(var55, var13).getBytes("ISO-8859-1");
var48 = var17;
var10001 = var14++;
var63 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var67 = 0;
}
}
}

var25 = var26.charAt(var44);
break;
default:
var29[var27++] = var59;
if ((var44 += var25) < var28) {
var25 = var26.charAt(var44);
continue label72;
}

var26 = "¿`7¼\u009493ÏxMd&\u0088Û\u001d4'\u0088ê\u0099c\u008döì\u009f\u0091>\u009a=j®ú ûH\u0099}\u0086,*x\u008fvEÕ¦:Ôø³\u0092ÉÕâµúy`+«bó0g{";
var28 = "¿`7¼\u009493ÏxMd&\u0088Û\u001d4'\u0088ê\u0099c\u008döì\u009f\u0091>\u009a=j®ú ûH\u0099}\u0086,*x\u008fvEÕ¦:Ôø³\u0092ÉÕâµúy`+«bó0g{".length();
var25 = ' ';
var44 = -1;
}

var45 = var26.substring(++var44, var44 + var25);
var10001 = 0;
}
}
}

public static void R(boolean var0) {
O = var0;
}

public static boolean q() {
return O;
}

public static boolean i() {
boolean var0 = q();

try {
return !var0;
} catch (NoWhenBranchMatchedException var1) {
throw a(var1);
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 1203;
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
throw new RuntimeException("su/catlean/_x", var10);
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
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/_x" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 12396;
if (l[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = i[var3];
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
throw new RuntimeException("su/catlean/_x", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
l[var3] = var15;
}

return l[var3];
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
throw new RuntimeException("su/catlean/_x" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long e(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 15988;
if (o[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = n[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])w.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
w.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_x", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
o[var3] = var15;
}

return o[var3];
}

private static long e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = e(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
return var7;
}

private static CallSite e(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/_x" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
