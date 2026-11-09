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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2404;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_2848.class_2849;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

public final class m1 implements jr {
@NotNull
public static final m1 L;
private static boolean o;
private static boolean E;
private static float W;
@Nullable
private static class_1799 G;
@Nullable
private static class_1799 z;
@NotNull
private static class_1792 a;
@NotNull
private static class_1792 m;
private static int x;
private static int l;
private static long b;
private static final long c = yz.a(-7776498086378487126L, 8067530436925902127L, MethodHandles.lookup().lookupClass()).a(239646615889226L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private m1() {
}

public final boolean v() {
return o;
}

public final void H(boolean <set-?>) {
o = <set-?>;
}

public final boolean B() {
return E;
}

public final void Z(boolean <set-?>) {
E = <set-?>;
}

public final float F() {
return W;
}

public final void o(float <set-?>) {
W = <set-?>;
}

@Nullable
public final class_1799 W() {
return G;
}

public final void v(@Nullable class_1799 <set-?>) {
G = <set-?>;
}

@Nullable
public final class_1799 t() {
return z;
}

public final void z(@Nullable class_1799 <set-?>) {
z = <set-?>;
}

@NotNull
public final class_1792 f() {
return a;
}

public final void X(@NotNull class_1792 <set-?>, long a) {
ax = c ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(27448, 563319415547990239L ^ ax));
a = <set-?>;
}

@NotNull
public final class_1792 q() {
return m;
}

public final void D(long a, @NotNull class_1792 <set-?>) {
ax = c ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"n">(11305, 4567161618141475362L ^ ax));
m = <set-?>;
}

public final int U() {
return x;
}

public final void g(int <set-?>) {
x = <set-?>;
}

public final int S() {
return l;
}

public final void Z(int <set-?>) {
l = <set-?>;
}

public final long Z() {
return b;
}

public final void f(long <set-?>) {
b = <set-?>;
}

@Override
public void w(long a, @NotNull PreSyncEvent e) {
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
// 002: ldc2_w 130258743495244
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 45837667436396
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 103154035415969
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 39778333166276
// 01a: lxor
// 01b: dup2
// 01c: bipush 32
// 01e: lushr
// 01f: l2i
// 020: istore 10
// 022: dup2
// 023: bipush 32
// 025: lshl
// 026: bipush 32
// 028: lushr
// 029: lstore 11
// 02b: pop2
// 02c: dup2
// 02d: ldc2_w 95510200616042
// 030: lxor
// 031: lstore 13
// 033: pop2
// 034: ldc2_w 6232619157977255585
// 037: lload 1
// 038: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: aload 3
// 03e: ldc "e"
// 040: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 043: astore 15
// 045: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 048: lload 6
// 04a: invokevirtual su/catlean/ut.FB (J)Z
// 04d: aload 15
// 04f: ifnonnull 19b
// 052: ifeq 193
// 055: goto 062
// 058: ldc2_w 6233036512003490051
// 05b: lload 1
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: lload 4
// 064: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 067: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 06a: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 06d: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 070: aload 15
// 072: ifnonnull 10c
// 075: goto 082
// 078: ldc2_w 6233036512003490051
// 07b: lload 1
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: ifeq 0fe
// 085: goto 092
// 088: ldc2_w 6233036512003490051
// 08b: lload 1
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: lload 13
// 094: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 097: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 09a: aload 15
// 09c: ifnonnull 10c
// 09f: goto 0ac
// 0a2: ldc2_w 6233036512003490051
// 0a5: lload 1
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: ifeq 0fe
// 0af: goto 0bc
// 0b2: ldc2_w 6233036512003490051
// 0b5: lload 1
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: getstatic su/catlean/m1.o Z
// 0bf: aload 15
// 0c1: lload 1
// 0c2: lconst_0
// 0c3: lcmp
// 0c4: ifle 114
// 0c7: ifnonnull 10c
// 0ca: goto 0d7
// 0cd: ldc2_w 6233036512003490051
// 0d0: lload 1
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: ifeq 0fe
// 0da: goto 0e7
// 0dd: ldc2_w 6233036512003490051
// 0e0: lload 1
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: lload 13
// 0e9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ec: ldc -45.0
// 0ee: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 0f1: goto 0fe
// 0f4: ldc2_w 6233036512003490051
// 0f7: lload 1
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: lload 4
// 100: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 103: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 106: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 109: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 10c: lload 1
// 10d: lconst_0
// 10e: lcmp
// 10f: iflt 14e
// 112: aload 15
// 114: ifnonnull 14e
// 117: ifeq 181
// 11a: goto 127
// 11d: ldc2_w 6233036512003490051
// 120: lload 1
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: lload 13
// 129: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12c: aload 15
// 12e: ifnonnull 186
// 131: goto 13e
// 134: ldc2_w 6233036512003490051
// 137: lload 1
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 141: goto 14e
// 144: ldc2_w 6233036512003490051
// 147: lload 1
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: lload 1
// 14f: lconst_0
// 150: lcmp
// 151: ifle 15a
// 154: ifeq 181
// 157: getstatic su/catlean/m1.o Z
// 15a: ifeq 181
// 15d: goto 16a
// 160: ldc2_w 6233036512003490051
// 163: lload 1
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: lload 13
// 16c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16f: ldc 45.0
// 171: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 174: goto 181
// 177: ldc2_w 6233036512003490051
// 17a: lload 1
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: lload 13
// 183: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 186: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 189: iload 10
// 18b: lload 11
// 18d: invokevirtual su/catlean/dm.b (IJ)F
// 190: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 193: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 196: lload 8
// 198: invokevirtual su/catlean/dm.Y (J)Z
// 19b: aload 15
// 19d: ifnonnull 252
// 1a0: ifne 24c
// 1a3: goto 1b0
// 1a6: ldc2_w 6233036512003490051
// 1a9: lload 1
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: lload 4
// 1b2: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b5: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1b8: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 1bb: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 1be: aload 15
// 1c0: ifnonnull 252
// 1c3: goto 1d0
// 1c6: ldc2_w 6233036512003490051
// 1c9: lload 1
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: ifeq 24c
// 1d3: goto 1e0
// 1d6: ldc2_w 6233036512003490051
// 1d9: lload 1
// 1da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1df: athrow
// 1e0: lload 13
// 1e2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1e5: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 1e8: aload 15
// 1ea: ifnonnull 252
// 1ed: goto 1fa
// 1f0: ldc2_w 6233036512003490051
// 1f3: lload 1
// 1f4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: athrow
// 1fa: ifeq 24c
// 1fd: goto 20a
// 200: ldc2_w 6233036512003490051
// 203: lload 1
// 204: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 209: athrow
// 20a: getstatic su/catlean/m1.o Z
// 20d: aload 15
// 20f: lload 1
// 210: lconst_0
// 211: lcmp
// 212: iflt 25a
// 215: ifnonnull 252
// 218: goto 225
// 21b: ldc2_w 6233036512003490051
// 21e: lload 1
// 21f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 224: athrow
// 225: ifeq 24c
// 228: goto 235
// 22b: ldc2_w 6233036512003490051
// 22e: lload 1
// 22f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 234: athrow
// 235: lload 13
// 237: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23a: ldc -90.0
// 23c: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 23f: goto 24c
// 242: ldc2_w 6233036512003490051
// 245: lload 1
// 246: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: athrow
// 24c: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 24f: invokevirtual su/catlean/dm.Z ()I
// 252: lload 1
// 253: lconst_0
// 254: lcmp
// 255: ifle 295
// 258: aload 15
// 25a: ifnonnull 295
// 25d: bipush 5
// 25e: if_icmpge 2af
// 261: goto 26e
// 264: ldc2_w 6233036512003490051
// 267: lload 1
// 268: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: athrow
// 26e: lload 13
// 270: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 273: aload 15
// 275: ifnonnull 2aa
// 278: goto 285
// 27b: ldc2_w 6233036512003490051
// 27e: lload 1
// 27f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: athrow
// 285: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 288: goto 295
// 28b: ldc2_w 6233036512003490051
// 28e: lload 1
// 28f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 294: athrow
// 295: ifne 2af
// 298: lload 13
// 29a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 29d: goto 2aa
// 2a0: ldc2_w 6233036512003490051
// 2a3: lload 1
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: ldc -45.0
// 2ac: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 2af: return
}

@Override
public void y(@NotNull PreElytraEvent e, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 2
// 01: dup2
// 02: ldc2_w 79805115683167
// 05: lxor
// 06: lstore 4
// 08: pop2
// 09: ldc2_w -8985903558872163436
// 0c: lload 2
// 0d: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12: aload 1
// 13: ldc "e"
// 15: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 18: astore 6
// 1a: aload 6
// 1c: ifnonnull 51
// 1f: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 22: invokevirtual su/catlean/dm.Z ()I
// 25: bipush 4
// 26: if_icmpge 5b
// 29: goto 36
// 2c: ldc2_w -8956199612054186954
// 2f: lload 2
// 30: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35: athrow
// 36: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 39: lload 4
// 3b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3e: invokevirtual net/minecraft/class_746.method_36455 ()F
// 41: invokevirtual su/catlean/ut.Y (F)V
// 44: goto 51
// 47: ldc2_w -8956199612054186954
// 4a: lload 2
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: lload 4
// 53: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 56: ldc -45.0
// 58: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 5b: return
}

@Override
public void b(long a, @NotNull AfterElytraEvent e) {
long var4 = ax ^ 18213801518595L;

try {
Intrinsics.checkNotNullParameter(ex, "e");
if (dm.h.Z() < 4) {
zf.v(var4).method_36457(ut.D.i());
}
} catch (NoWhenBranchMatchedException var6) {
throw vm.a<"Å">(var6, -5410661664582409366L, ax);
}
}

@Override
public void h(@NotNull MoveEvent e, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: dup2
// 002: ldc2_w 52389835191008
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 116402100060533
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 100790074306642
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 79012752166395
// 01a: lxor
// 01b: dup2
// 01c: bipush 32
// 01e: lushr
// 01f: l2i
// 020: istore 10
// 022: dup2
// 023: bipush 32
// 025: lshl
// 026: bipush 48
// 028: lushr
// 029: l2i
// 02a: istore 11
// 02c: dup2
// 02d: bipush 48
// 02f: lshl
// 030: bipush 48
// 032: lushr
// 033: l2i
// 034: istore 12
// 036: pop2
// 037: dup2
// 038: ldc2_w 101872121627510
// 03b: lxor
// 03c: lstore 13
// 03e: dup2
// 03f: ldc2_w 4452337967885
// 042: lxor
// 043: lstore 15
// 045: dup2
// 046: ldc2_w 123833832724325
// 049: lxor
// 04a: lstore 17
// 04c: dup2
// 04d: ldc2_w 100179738131501
// 050: lxor
// 051: lstore 19
// 053: dup2
// 054: ldc2_w 16494758083782
// 057: lxor
// 058: lstore 21
// 05a: pop2
// 05b: ldc2_w -1237663305365850611
// 05e: lload 2
// 05f: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: aload 1
// 065: ldc "e"
// 067: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 06a: astore 23
// 06c: lload 21
// 06e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 071: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 074: aload 23
// 076: ifnonnull 08c
// 079: ifeq 54c
// 07c: goto 089
// 07f: ldc2_w -1284536951421748817
// 082: lload 2
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: getstatic su/catlean/m1.o Z
// 08c: aload 23
// 08e: lload 2
// 08f: lconst_0
// 090: lcmp
// 091: iflt 0be
// 094: ifnonnull 0bc
// 097: ifeq 54c
// 09a: goto 0a7
// 09d: ldc2_w -1284536951421748817
// 0a0: lload 2
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: lload 21
// 0a9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ac: getfield net/minecraft/class_746.field_5976 Z
// 0af: goto 0bc
// 0b2: ldc2_w -1284536951421748817
// 0b5: lload 2
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: aload 23
// 0be: lload 2
// 0bf: lconst_0
// 0c0: lcmp
// 0c1: ifle 0ee
// 0c4: ifnonnull 0ec
// 0c7: ifne 107
// 0ca: goto 0d7
// 0cd: ldc2_w -1284536951421748817
// 0d0: lload 2
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: lload 21
// 0d9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0dc: getfield net/minecraft/class_746.field_5992 Z
// 0df: goto 0ec
// 0e2: ldc2_w -1284536951421748817
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: aload 23
// 0ee: lload 2
// 0ef: lconst_0
// 0f0: lcmp
// 0f1: iflt 127
// 0f4: ifnonnull 125
// 0f7: ifeq 11f
// 0fa: goto 107
// 0fd: ldc2_w -1284536951421748817
// 100: lload 2
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 10a: fconst_0
// 10b: invokevirtual su/catlean/ut.E (F)V
// 10e: fconst_0
// 10f: putstatic su/catlean/m1.W F
// 112: goto 11f
// 115: ldc2_w -1284536951421748817
// 118: lload 2
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 122: invokevirtual su/catlean/dm.Z ()I
// 125: aload 23
// 127: lload 2
// 128: lconst_0
// 129: lcmp
// 12a: ifle 167
// 12d: ifnonnull 165
// 130: bipush 4
// 131: if_icmpge 157
// 134: goto 141
// 137: ldc2_w -1284536951421748817
// 13a: lload 2
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: aload 1
// 142: ldc2_w 0.2
// 145: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 148: aload 1
// 149: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 14c: return
// 14d: ldc2_w -1284536951421748817
// 150: lload 2
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: lload 4
// 159: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 15c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 15f: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 162: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 165: aload 23
// 167: lload 2
// 168: lconst_0
// 169: lcmp
// 16a: iflt 204
// 16d: ifnonnull 1fc
// 170: ifeq 1e1
// 173: goto 180
// 176: ldc2_w -1284536951421748817
// 179: lload 2
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: aload 1
// 181: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 184: lload 6
// 186: invokevirtual su/catlean/ut.FF (J)F
// 189: f2d
// 18a: sipush 20642
// 18d: ldc2_w 8535613111877159444
// 190: lload 2
// 191: lxor
// 192: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: istore 25
// 199: dstore 29
// 19b: astore 28
// 19d: bipush 0
// 19e: istore 26
// 1a0: getstatic su/catlean/m1.L Lsu/catlean/m1;
// 1a3: pop
// 1a4: getstatic su/catlean/m1.L Lsu/catlean/m1;
// 1a7: pop
// 1a8: getstatic su/catlean/m1.W F
// 1ab: iload 25
// 1ad: i2f
// 1ae: fadd
// 1af: putstatic su/catlean/m1.W F
// 1b2: getstatic su/catlean/m1.L Lsu/catlean/m1;
// 1b5: pop
// 1b6: getstatic su/catlean/m1.W F
// 1b9: fstore 31
// 1bb: aload 28
// 1bd: dload 29
// 1bf: fload 31
// 1c1: nop
// 1c2: ldc 100.0
// 1c4: fdiv
// 1c5: f2d
// 1c6: dstore 24
// 1c8: dconst_1
// 1c9: dstore 26
// 1cb: dload 24
// 1cd: dload 26
// 1cf: invokestatic java/lang/Math.min (DD)D
// 1d2: dmul
// 1d3: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 1d6: lload 2
// 1d7: lconst_0
// 1d8: lcmp
// 1d9: iflt 33a
// 1dc: aload 23
// 1de: ifnull 33a
// 1e1: lload 4
// 1e3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1e6: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1e9: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 1ec: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 1ef: goto 1fc
// 1f2: ldc2_w -1284536951421748817
// 1f5: lload 2
// 1f6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fb: athrow
// 1fc: lload 2
// 1fd: lconst_0
// 1fe: lcmp
// 1ff: iflt 296
// 202: aload 23
// 204: ifnonnull 296
// 207: ifeq 279
// 20a: goto 217
// 20d: ldc2_w -1284536951421748817
// 210: lload 2
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: aload 1
// 218: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 21b: lload 6
// 21d: invokevirtual su/catlean/ut.FF (J)F
// 220: fneg
// 221: f2d
// 222: sipush 17898
// 225: ldc2_w 4331814722158976848
// 228: lload 2
// 229: lxor
// 22a: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22f: istore 25
// 231: dstore 29
// 233: astore 28
// 235: bipush 0
// 236: istore 26
// 238: getstatic su/catlean/m1.L Lsu/catlean/m1;
// 23b: pop
// 23c: getstatic su/catlean/m1.L Lsu/catlean/m1;
// 23f: pop
// 240: getstatic su/catlean/m1.W F
// 243: iload 25
// 245: i2f
// 246: fadd
// 247: putstatic su/catlean/m1.W F
// 24a: getstatic su/catlean/m1.L Lsu/catlean/m1;
// 24d: pop
// 24e: getstatic su/catlean/m1.W F
// 251: fstore 31
// 253: aload 28
// 255: dload 29
// 257: fload 31
// 259: nop
// 25a: ldc 100.0
// 25c: fdiv
// 25d: f2d
// 25e: dstore 24
// 260: dconst_1
// 261: dstore 26
// 263: dload 24
// 265: dload 26
// 267: invokestatic java/lang/Math.min (DD)D
// 26a: dmul
// 26b: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 26e: lload 2
// 26f: lconst_0
// 270: lcmp
// 271: iflt 33a
// 274: aload 23
// 276: ifnull 33a
// 279: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 27c: lload 19
// 27e: invokevirtual su/catlean/ut.FG (J)Lsu/catlean/oz;
// 281: getstatic su/catlean/yv.D [I
// 284: swap
// 285: invokevirtual su/catlean/oz.ordinal ()I
// 288: iaload
// 289: goto 296
// 28c: ldc2_w -1284536951421748817
// 28f: lload 2
// 290: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 295: athrow
// 296: tableswitch 146 1 3 26 86 117
// 2b0: aload 1
// 2b1: lload 21
// 2b3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2b6: getfield net/minecraft/class_746.field_6012 I
// 2b9: bipush 2
// 2ba: irem
// 2bb: ifne 2db
// 2be: goto 2cb
// 2c1: ldc2_w -1284536951421748817
// 2c4: lload 2
// 2c5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ca: athrow
// 2cb: ldc2_w 0.08
// 2ce: goto 2de
// 2d1: ldc2_w -1284536951421748817
// 2d4: lload 2
// 2d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2da: athrow
// 2db: ldc2_w -0.08
// 2de: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 2e1: lload 2
// 2e2: lconst_0
// 2e3: lcmp
// 2e4: iflt 33a
// 2e7: aload 23
// 2e9: ifnull 33a
// 2ec: aload 1
// 2ed: ldc2_w -0.08
// 2f0: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 2f3: lload 2
// 2f4: lconst_0
// 2f5: lcmp
// 2f6: iflt 33a
// 2f9: aload 23
// 2fb: ifnull 33a
// 2fe: goto 30b
// 301: ldc2_w -1284536951421748817
// 304: lload 2
// 305: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30a: athrow
// 30b: aload 1
// 30c: dconst_0
// 30d: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 310: lload 2
// 311: lconst_0
// 312: lcmp
// 313: iflt 33a
// 316: aload 23
// 318: ifnull 33a
// 31b: goto 328
// 31e: ldc2_w -1284536951421748817
// 321: lload 2
// 322: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 327: athrow
// 328: new kotlin/NoWhenBranchMatchedException
// 32b: dup
// 32c: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 32f: athrow
// 330: ldc2_w -1284536951421748817
// 333: lload 2
// 334: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 339: athrow
// 33a: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 33d: lload 15
// 33f: invokevirtual su/catlean/dm.Y (J)Z
// 342: aload 23
// 344: lload 2
// 345: lconst_0
// 346: lcmp
// 347: ifle 389
// 34a: ifnonnull 381
// 34d: ifne 371
// 350: goto 35d
// 353: ldc2_w -1284536951421748817
// 356: lload 2
// 357: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35c: athrow
// 35d: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 360: fconst_0
// 361: invokevirtual su/catlean/ut.E (F)V
// 364: goto 371
// 367: ldc2_w -1284536951421748817
// 36a: lload 2
// 36b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: athrow
// 371: lload 21
// 373: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 376: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 379: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 37c: getfield net/minecraft/class_241.field_1343 F
// 37f: fconst_0
// 380: fcmpl
// 381: lload 2
// 382: lconst_0
// 383: lcmp
// 384: iflt 414
// 387: aload 23
// 389: ifnonnull 414
// 38c: ifle 3e5
// 38f: goto 39c
// 392: ldc2_w -1284536951421748817
// 395: lload 2
// 396: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39b: athrow
// 39c: lload 21
// 39e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3a1: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 3a4: dup
// 3a5: sipush 838
// 3a8: ldc2_w 573912377283717601
// 3ab: lload 2
// 3ac: lxor
// 3ad: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 3b5: checkcast su/catlean/mixins/accessors/ClientInputAccessor
// 3b8: new net/minecraft/class_241
// 3bb: dup
// 3bc: fconst_1
// 3bd: lload 21
// 3bf: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3c2: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 3c5: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 3c8: getfield net/minecraft/class_241.field_1342 F
// 3cb: invokespecial net/minecraft/class_241.<init> (FF)V
// 3ce: invokeinterface su/catlean/mixins/accessors/ClientInputAccessor.setMoveVector (Lnet/minecraft/class_241;)V 2
// 3d3: aload 23
// 3d5: ifnull 45c
// 3d8: goto 3e5
// 3db: ldc2_w -1284536951421748817
// 3de: lload 2
// 3df: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: athrow
// 3e5: lload 21
// 3e7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3ea: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 3ed: aload 23
// 3ef: ifnonnull 43d
// 3f2: goto 3ff
// 3f5: ldc2_w -1284536951421748817
// 3f8: lload 2
// 3f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fe: athrow
// 3ff: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 402: getfield net/minecraft/class_241.field_1343 F
// 405: fconst_0
// 406: fcmpg
// 407: goto 414
// 40a: ldc2_w -1284536951421748817
// 40d: lload 2
// 40e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 413: athrow
// 414: ifge 45c
// 417: lload 21
// 419: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 41c: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 41f: dup
// 420: sipush 18702
// 423: ldc2_w 1111722785128997797
// 426: lload 2
// 427: lxor
// 428: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 430: goto 43d
// 433: ldc2_w -1284536951421748817
// 436: lload 2
// 437: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43c: athrow
// 43d: checkcast su/catlean/mixins/accessors/ClientInputAccessor
// 440: new net/minecraft/class_241
// 443: dup
// 444: ldc -1.0
// 446: lload 21
// 448: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 44b: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 44e: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 451: getfield net/minecraft/class_241.field_1342 F
// 454: invokespecial net/minecraft/class_241.<init> (FF)V
// 457: invokeinterface su/catlean/mixins/accessors/ClientInputAccessor.setMoveVector (Lnet/minecraft/class_241;)V 2
// 45c: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 45f: aload 1
// 460: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 463: lload 17
// 465: invokevirtual su/catlean/ut.FN (J)F
// 468: f2d
// 469: sipush 17898
// 46c: ldc2_w 4331814722158976848
// 46f: lload 2
// 470: lxor
// 471: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 476: istore 25
// 478: dstore 30
// 47a: astore 29
// 47c: astore 28
// 47e: bipush 0
// 47f: istore 26
// 481: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 484: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 487: invokevirtual su/catlean/ut.x ()F
// 48a: iload 25
// 48c: i2f
// 48d: fadd
// 48e: invokevirtual su/catlean/ut.E (F)V
// 491: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 494: invokevirtual su/catlean/ut.x ()F
// 497: fstore 32
// 499: aload 28
// 49b: iload 10
// 49d: iload 11
// 49f: i2s
// 4a0: aload 29
// 4a2: dload 30
// 4a4: fload 32
// 4a6: nop
// 4a7: ldc 100.0
// 4a9: fdiv
// 4aa: f2d
// 4ab: dstore 24
// 4ad: dconst_1
// 4ae: dstore 26
// 4b0: dload 24
// 4b2: dload 26
// 4b4: invokestatic java/lang/Math.min (DD)D
// 4b7: dmul
// 4b8: iload 12
// 4ba: i2c
// 4bb: dup_x2
// 4bc: pop
// 4bd: invokevirtual su/catlean/dm.Y (ISLsu/catlean/api/event/events/player/MoveEvent;CD)V
// 4c0: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 4c3: lload 8
// 4c5: invokevirtual su/catlean/ut.Fc (J)Z
// 4c8: aload 23
// 4ca: lload 2
// 4cb: lconst_0
// 4cc: lcmp
// 4cd: iflt 4fe
// 4d0: ifnonnull 4f6
// 4d3: ifeq 548
// 4d6: goto 4e3
// 4d9: ldc2_w -1284536951421748817
// 4dc: lload 2
// 4dd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e2: athrow
// 4e3: aload 0
// 4e4: lload 13
// 4e6: invokevirtual su/catlean/m1.C (J)Z
// 4e9: goto 4f6
// 4ec: ldc2_w -1284536951421748817
// 4ef: lload 2
// 4f0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f5: athrow
// 4f6: lload 2
// 4f7: lconst_0
// 4f8: lcmp
// 4f9: iflt 524
// 4fc: aload 23
// 4fe: ifnonnull 524
// 501: ifne 548
// 504: goto 511
// 507: ldc2_w -1284536951421748817
// 50a: lload 2
// 50b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 510: athrow
// 511: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 514: invokevirtual su/catlean/dm.Z ()I
// 517: goto 524
// 51a: ldc2_w -1284536951421748817
// 51d: lload 2
// 51e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 523: athrow
// 524: sipush 2077
// 527: ldc2_w 6504897010504364
// 52a: lload 2
// 52b: lxor
// 52c: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 531: if_icmple 548
// 534: aload 1
// 535: ldc2_w 0.42
// 538: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 53b: goto 548
// 53e: ldc2_w -1284536951421748817
// 541: lload 2
// 542: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 547: athrow
// 548: aload 1
// 549: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 54c: return
}

@Override
public void j(long a, @NotNull AfterSendPacket event) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 1
// 01: dup2
// 02: ldc2_w 100112727355052
// 05: lxor
// 06: lstore 4
// 08: dup2
// 09: ldc2_w 36138565521496
// 0c: lxor
// 0d: lstore 6
// 0f: pop2
// 10: aload 3
// 11: sipush 27358
// 14: ldc2_w 8371663258893474295
// 17: lload 1
// 18: lxor
// 19: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 21: aload 3
// 22: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 25: instanceof net/minecraft/class_2848
// 28: ifeq 77
// 2b: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 2e: lload 6
// 30: invokevirtual su/catlean/ut.FX (J)Lsu/catlean/dz;
// 33: getstatic su/catlean/dz.FIRE_WORK Lsu/catlean/dz;
// 36: if_acmpne 77
// 39: goto 46
// 3c: ldc2_w -600863486213119958
// 3f: lload 1
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: aload 3
// 47: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 4a: checkcast net/minecraft/class_2848
// 4d: invokevirtual net/minecraft/class_2848.method_12365 ()Lnet/minecraft/class_2848$class_2849;
// 50: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 53: if_acmpne 77
// 56: goto 63
// 59: ldc2_w -600863486213119958
// 5c: lload 1
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: aload 0
// 64: lload 4
// 66: bipush 0
// 67: invokespecial su/catlean/m1.S (JZ)V
// 6a: goto 77
// 6d: ldc2_w -600863486213119958
// 70: lload 1
// 71: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76: athrow
// 77: return
}

private final void S(long param1, boolean param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/m1.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 76177278902816
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 39228715165472
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 131726780680121
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 47227210953239
// 020: lxor
// 021: dup2
// 022: bipush 48
// 024: lushr
// 025: l2i
// 026: istore 10
// 028: dup2
// 029: bipush 16
// 02b: lshl
// 02c: bipush 16
// 02e: lushr
// 02f: lstore 11
// 031: pop2
// 032: dup2
// 033: ldc2_w 48141368014762
// 036: lxor
// 037: lstore 13
// 039: pop2
// 03a: ldc2_w 7331520509918608737
// 03d: lload 1
// 03e: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: astore 15
// 045: iload 3
// 046: aload 15
// 048: ifnonnull 099
// 04b: ifeq 098
// 04e: goto 05b
// 051: ldc2_w 7295915760112972483
// 054: lload 1
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: invokestatic java/lang/System.currentTimeMillis ()J
// 05e: getstatic su/catlean/m1.b J
// 061: lsub
// 062: l2f
// 063: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 066: lload 8
// 068: invokevirtual su/catlean/ut.E (J)F
// 06b: ldc 1000.0
// 06d: fmul
// 06e: fcmpg
// 06f: aload 15
// 071: lload 1
// 072: lconst_0
// 073: lcmp
// 074: iflt 09b
// 077: ifnonnull 099
// 07a: goto 087
// 07d: ldc2_w 7295915760112972483
// 080: lload 1
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: ifge 098
// 08a: goto 097
// 08d: ldc2_w 7295915760112972483
// 090: lload 1
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: return
// 098: iload 3
// 099: aload 15
// 09b: ifnonnull 0e0
// 09e: ifeq 0df
// 0a1: goto 0ae
// 0a4: ldc2_w 7295915760112972483
// 0a7: lload 1
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: lload 13
// 0b0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b3: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 0b6: aload 15
// 0b8: lload 1
// 0b9: lconst_0
// 0ba: lcmp
// 0bb: iflt 0e2
// 0be: ifnonnull 0e0
// 0c1: goto 0ce
// 0c4: ldc2_w 7295915760112972483
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: ifne 0df
// 0d1: goto 0de
// 0d4: ldc2_w 7295915760112972483
// 0d7: lload 1
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: return
// 0df: iload 3
// 0e0: aload 15
// 0e2: ifnonnull 132
// 0e5: ifne 129
// 0e8: goto 0f5
// 0eb: ldc2_w 7295915760112972483
// 0ee: lload 1
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0f8: invokevirtual su/catlean/dm.Z ()I
// 0fb: aload 15
// 0fd: ifnonnull 132
// 100: goto 10d
// 103: ldc2_w 7295915760112972483
// 106: lload 1
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: bipush 1
// 10e: if_icmple 129
// 111: goto 11e
// 114: ldc2_w 7295915760112972483
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: return
// 11f: ldc2_w 7295915760112972483
// 122: lload 1
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: aload 0
// 12a: iload 10
// 12c: i2s
// 12d: lload 11
// 12f: invokespecial su/catlean/m1.n (SJ)I
// 132: istore 16
// 134: iload 16
// 136: aload 15
// 138: ifnonnull 171
// 13b: bipush -1
// 13c: if_icmpne 15b
// 13f: goto 14c
// 142: ldc2_w 7295915760112972483
// 145: lload 1
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: bipush -1
// 14d: putstatic su/catlean/m1.l I
// 150: return
// 151: ldc2_w 7295915760112972483
// 154: lload 1
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: iload 16
// 15d: putstatic su/catlean/m1.l I
// 160: lload 13
// 162: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 165: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 168: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 16b: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 16e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 171: istore 17
// 173: lload 13
// 175: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 178: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 17b: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 17e: istore 18
// 180: iload 17
// 182: aload 15
// 184: ifnonnull 1dc
// 187: ifne 1da
// 18a: goto 197
// 18d: ldc2_w 7295915760112972483
// 190: lload 1
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: iload 18
// 199: lload 1
// 19a: lconst_0
// 19b: lcmp
// 19c: iflt 1dc
// 19f: aload 15
// 1a1: ifnonnull 1dc
// 1a4: goto 1b1
// 1a7: ldc2_w 7295915760112972483
// 1aa: lload 1
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: iload 16
// 1b3: if_icmpeq 1da
// 1b6: goto 1c3
// 1b9: ldc2_w 7295915760112972483
// 1bc: lload 1
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1c6: iload 16
// 1c8: lload 4
// 1ca: invokevirtual su/catlean/gg.f (IJ)V
// 1cd: goto 1da
// 1d0: ldc2_w 7295915760112972483
// 1d3: lload 1
// 1d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d9: athrow
// 1da: iload 17
// 1dc: ifeq 1ef
// 1df: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 1e2: goto 1f2
// 1e5: ldc2_w 7295915760112972483
// 1e8: lload 1
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1f2: fconst_0
// 1f3: lload 6
// 1f5: fconst_0
// 1f6: sipush 1312
// 1f9: ldc2_w 5458241947217761532
// 1fc: lload 1
// 1fd: lxor
// 1fe: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: aconst_null
// 204: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 207: pop
// 208: iload 17
// 20a: aload 15
// 20c: ifnonnull 263
// 20f: ifne 262
// 212: goto 21f
// 215: ldc2_w 7295915760112972483
// 218: lload 1
// 219: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21e: athrow
// 21f: lload 1
// 220: lconst_0
// 221: lcmp
// 222: ifle 26c
// 225: iload 18
// 227: aload 15
// 229: ifnonnull 263
// 22c: goto 239
// 22f: ldc2_w 7295915760112972483
// 232: lload 1
// 233: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 238: athrow
// 239: iload 16
// 23b: if_icmpeq 262
// 23e: goto 24b
// 241: ldc2_w 7295915760112972483
// 244: lload 1
// 245: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: athrow
// 24b: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 24e: iload 18
// 250: lload 4
// 252: invokevirtual su/catlean/gg.f (IJ)V
// 255: goto 262
// 258: ldc2_w 7295915760112972483
// 25b: lload 1
// 25c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 261: athrow
// 262: bipush 1
// 263: putstatic su/catlean/m1.o Z
// 266: invokestatic java/lang/System.currentTimeMillis ()J
// 269: putstatic su/catlean/m1.b J
// 26c: return
}

@Override
public void A(@NotNull ReceivePacket e, long a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: bipush 16
// 003: lshl
// 004: iload 4
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 48
// 00c: lushr
// 00d: lor
// 00e: lstore 5
// 010: lload 5
// 012: dup2
// 013: ldc2_w 3733546473051
// 016: lxor
// 017: lstore 7
// 019: dup2
// 01a: ldc2_w 32332956399917
// 01d: lxor
// 01e: lstore 9
// 020: dup2
// 021: ldc2_w 59965465244143
// 024: lxor
// 025: dup2
// 026: bipush 32
// 028: lushr
// 029: l2i
// 02a: istore 11
// 02c: dup2
// 02d: bipush 32
// 02f: lshl
// 030: bipush 48
// 032: lushr
// 033: l2i
// 034: istore 12
// 036: dup2
// 037: bipush 48
// 039: lshl
// 03a: bipush 48
// 03c: lushr
// 03d: l2i
// 03e: istore 13
// 040: pop2
// 041: dup2
// 042: ldc2_w 113746228604004
// 045: lxor
// 046: lstore 14
// 048: pop2
// 049: ldc2_w -2440115554946922755
// 04c: lload 5
// 04e: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: aload 1
// 054: ldc "e"
// 056: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 059: astore 16
// 05b: aload 1
// 05c: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 05f: instanceof net/minecraft/class_2708
// 062: aload 16
// 064: ifnonnull 0b1
// 067: ifeq 10c
// 06a: goto 078
// 06d: ldc2_w -2387910136439076513
// 070: lload 5
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 07b: fconst_0
// 07c: invokevirtual su/catlean/ut.E (F)V
// 07f: fconst_0
// 080: putstatic su/catlean/m1.W F
// 083: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 086: aload 16
// 088: iload 4
// 08a: iflt 0b9
// 08d: ifnonnull 0b7
// 090: goto 09e
// 093: ldc2_w -2387910136439076513
// 096: lload 5
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: lload 7
// 0a0: invokevirtual su/catlean/ut.Fm (J)Z
// 0a3: goto 0b1
// 0a6: ldc2_w -2387910136439076513
// 0a9: lload 5
// 0ab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: athrow
// 0b1: ifeq 10c
// 0b4: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0b7: aload 16
// 0b9: ifnonnull 0e6
// 0bc: lload 9
// 0be: invokevirtual su/catlean/ut.FX (J)Lsu/catlean/dz;
// 0c1: getstatic su/catlean/dz.FIRE_WORK Lsu/catlean/dz;
// 0c4: if_acmpne 10c
// 0c7: goto 0d5
// 0ca: ldc2_w -2387910136439076513
// 0cd: lload 5
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 0d8: goto 0e6
// 0db: ldc2_w -2387910136439076513
// 0de: lload 5
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 0e9: iload 11
// 0eb: sipush 3808
// 0ee: ldc2_w 5471388455356208317
// 0f1: lload 5
// 0f3: lxor
// 0f4: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: bipush 0
// 0fa: anewarray 581
// 0fd: iload 12
// 0ff: swap
// 100: iload 13
// 102: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 105: lload 14
// 107: dup2_x1
// 108: pop2
// 109: invokevirtual su/catlean/ut.f (JLjava/lang/String;)V
// 10c: return
}

@Override
public void P(int a, @NotNull PlayerUpdateEvent e, char a, char a) {
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
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: lstore 5
// 01a: lload 5
// 01c: dup2
// 01d: ldc2_w 110443321443084
// 020: lxor
// 021: lstore 7
// 023: dup2
// 024: ldc2_w 137606229105562
// 027: lxor
// 028: lstore 9
// 02a: dup2
// 02b: ldc2_w 17991996193528
// 02e: lxor
// 02f: lstore 11
// 031: dup2
// 032: ldc2_w 58820124427973
// 035: lxor
// 036: lstore 13
// 038: dup2
// 039: ldc2_w 87805362475745
// 03c: lxor
// 03d: lstore 15
// 03f: dup2
// 040: ldc2_w 77790739854221
// 043: lxor
// 044: lstore 17
// 046: dup2
// 047: ldc2_w 75341532821871
// 04a: lxor
// 04b: lstore 19
// 04d: dup2
// 04e: ldc2_w 46515859238589
// 051: lxor
// 052: lstore 21
// 054: dup2
// 055: ldc2_w 46251444692251
// 058: lxor
// 059: dup2
// 05a: bipush 32
// 05c: lushr
// 05d: l2i
// 05e: istore 23
// 060: dup2
// 061: bipush 32
// 063: lshl
// 064: bipush 48
// 066: lushr
// 067: l2i
// 068: istore 24
// 06a: dup2
// 06b: bipush 48
// 06d: lshl
// 06e: bipush 48
// 070: lushr
// 071: l2i
// 072: istore 25
// 074: pop2
// 075: dup2
// 076: ldc2_w 75690733423914
// 079: lxor
// 07a: lstore 26
// 07c: pop2
// 07d: ldc2_w -6971954781823399967
// 080: lload 5
// 082: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: aload 2
// 088: ldc "e"
// 08a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08d: astore 28
// 08f: lload 17
// 091: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 094: lload 26
// 096: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 099: lload 9
// 09b: dup2_x1
// 09c: pop2
// 09d: checkcast net/minecraft/class_1297
// 0a0: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0a3: checkcast net/minecraft/class_2374
// 0a6: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0a9: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 0ac: istore 29
// 0ae: aload 0
// 0af: lload 11
// 0b1: invokevirtual su/catlean/m1.c (J)Z
// 0b4: aload 28
// 0b6: ifnonnull 0cc
// 0b9: ifeq 11b
// 0bc: goto 0ca
// 0bf: ldc2_w -6935504231641003965
// 0c2: lload 5
// 0c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: athrow
// 0ca: iload 29
// 0cc: aload 28
// 0ce: iload 3
// 0cf: iflt 103
// 0d2: ifnonnull 101
// 0d5: ifeq 11b
// 0d8: goto 0e6
// 0db: ldc2_w -6935504231641003965
// 0de: lload 5
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: lload 26
// 0e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0eb: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 0ee: invokevirtual net/minecraft/class_243.method_10214 ()D
// 0f1: dconst_0
// 0f2: dcmpg
// 0f3: goto 101
// 0f6: ldc2_w -6935504231641003965
// 0f9: lload 5
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: aload 28
// 103: ifnonnull 118
// 106: ifge 11b
// 109: goto 117
// 10c: ldc2_w -6935504231641003965
// 10f: lload 5
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: bipush 1
// 118: goto 11c
// 11b: bipush 0
// 11c: istore 30
// 11e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 121: invokevirtual su/catlean/dm.o ()D
// 124: dconst_0
// 125: dcmpl
// 126: aload 28
// 128: ifnonnull 169
// 12b: ifle 167
// 12e: goto 13c
// 131: ldc2_w -6935504231641003965
// 134: lload 5
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: iload 29
// 13e: aload 28
// 140: iload 4
// 142: ifle 16b
// 145: ifnonnull 169
// 148: goto 156
// 14b: ldc2_w -6935504231641003965
// 14e: lload 5
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: ifne 183
// 159: goto 167
// 15c: ldc2_w -6935504231641003965
// 15f: lload 5
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: iload 30
// 169: aload 28
// 16b: iload 1
// 16c: iflt 1b4
// 16f: ifnonnull 1b2
// 172: ifeq 19c
// 175: goto 183
// 178: ldc2_w -6935504231641003965
// 17b: lload 5
// 17d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: athrow
// 183: aload 0
// 184: lload 21
// 186: invokespecial su/catlean/m1.r (J)V
// 189: aload 28
// 18b: ifnull 1dc
// 18e: goto 19c
// 191: ldc2_w -6935504231641003965
// 194: lload 5
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: lload 26
// 19e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a1: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 1a4: goto 1b2
// 1a7: ldc2_w -6935504231641003965
// 1aa: lload 5
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: aload 28
// 1b4: iload 3
// 1b5: iflt 1e6
// 1b8: ifnonnull 1e4
// 1bb: ifeq 1dc
// 1be: goto 1cc
// 1c1: ldc2_w -6935504231641003965
// 1c4: lload 5
// 1c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cb: athrow
// 1cc: bipush 0
// 1cd: putstatic su/catlean/m1.E Z
// 1d0: return
// 1d1: ldc2_w -6935504231641003965
// 1d4: lload 5
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1df: lload 15
// 1e1: invokevirtual su/catlean/dm.Y (J)Z
// 1e4: aload 28
// 1e6: iload 1
// 1e7: iflt 221
// 1ea: ifnonnull 21f
// 1ed: ifne 213
// 1f0: goto 1fe
// 1f3: ldc2_w -6935504231641003965
// 1f6: lload 5
// 1f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: athrow
// 1fe: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 201: fconst_0
// 202: invokevirtual su/catlean/ut.E (F)V
// 205: goto 213
// 208: ldc2_w -6935504231641003965
// 20b: lload 5
// 20d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: athrow
// 213: aload 0
// 214: iload 23
// 216: iload 24
// 218: i2s
// 219: iload 25
// 21b: i2c
// 21c: invokespecial su/catlean/m1.J (ISC)Z
// 21f: aload 28
// 221: iload 1
// 222: iflt 244
// 225: ifnonnull 242
// 228: ifne 23a
// 22b: goto 239
// 22e: ldc2_w -6935504231641003965
// 231: lload 5
// 233: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 238: athrow
// 239: return
// 23a: lload 26
// 23c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23f: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 242: aload 28
// 244: ifnonnull 2e8
// 247: ifne 2e2
// 24a: goto 258
// 24d: ldc2_w -6935504231641003965
// 250: lload 5
// 252: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 257: athrow
// 258: getstatic su/catlean/m1.E Z
// 25b: aload 28
// 25d: ifnonnull 2e8
// 260: goto 26e
// 263: ldc2_w -6935504231641003965
// 266: lload 5
// 268: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: athrow
// 26e: ifne 2e2
// 271: goto 27f
// 274: ldc2_w -6935504231641003965
// 277: lload 5
// 279: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27e: athrow
// 27f: lload 26
// 281: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 284: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 287: invokevirtual net/minecraft/class_243.method_10214 ()D
// 28a: dconst_0
// 28b: dcmpg
// 28c: iload 3
// 28d: ifle 2e8
// 290: aload 28
// 292: ifnonnull 2e8
// 295: goto 2a3
// 298: ldc2_w -6935504231641003965
// 29b: lload 5
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: ifge 2e2
// 2a6: goto 2b4
// 2a9: ldc2_w -6935504231641003965
// 2ac: lload 5
// 2ae: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: athrow
// 2b4: new net/minecraft/class_2848
// 2b7: dup
// 2b8: lload 26
// 2ba: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2bd: checkcast net/minecraft/class_1297
// 2c0: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 2c3: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 2c6: checkcast net/minecraft/class_2596
// 2c9: lload 19
// 2cb: dup2_x1
// 2cc: pop2
// 2cd: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 2d0: bipush 1
// 2d1: putstatic su/catlean/m1.E Z
// 2d4: goto 2e2
// 2d7: ldc2_w -6935504231641003965
// 2da: lload 5
// 2dc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e1: athrow
// 2e2: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2e5: invokevirtual su/catlean/dm.Z ()I
// 2e8: bipush 4
// 2e9: if_icmpge 309
// 2ec: lload 7
// 2ee: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2f1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 2f4: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 2f7: bipush 0
// 2f8: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 2fb: goto 309
// 2fe: ldc2_w -6935504231641003965
// 301: lload 5
// 303: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 308: athrow
// 309: aload 0
// 30a: lload 13
// 30c: bipush 1
// 30d: invokespecial su/catlean/m1.S (JZ)V
// 310: return
}

@Override
public void m(char param1, int param2, short param3) {
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
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: lstore 4
// 019: lload 4
// 01b: dup2
// 01c: ldc2_w 91144016260959
// 01f: lxor
// 020: lstore 6
// 022: dup2
// 023: ldc2_w 76409422996716
// 026: lxor
// 027: lstore 8
// 029: dup2
// 02a: ldc2_w 128037284970081
// 02d: lxor
// 02e: lstore 10
// 030: dup2
// 031: ldc2_w 8237046633915
// 034: lxor
// 035: dup2
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 12
// 03c: dup2
// 03d: bipush 16
// 03f: lshl
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 13
// 046: dup2
// 047: bipush 32
// 049: lshl
// 04a: bipush 32
// 04c: lushr
// 04d: l2i
// 04e: istore 14
// 050: pop2
// 051: dup2
// 052: ldc2_w 83214263772695
// 055: lxor
// 056: dup2
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 15
// 05d: dup2
// 05e: bipush 16
// 060: lshl
// 061: bipush 32
// 063: lushr
// 064: l2i
// 065: istore 16
// 067: dup2
// 068: bipush 48
// 06a: lshl
// 06b: bipush 48
// 06d: lushr
// 06e: l2i
// 06f: istore 17
// 071: pop2
// 072: dup2
// 073: ldc2_w 96087070894725
// 076: lxor
// 077: lstore 18
// 079: pop2
// 07a: fconst_0
// 07b: putstatic su/catlean/m1.W F
// 07e: bipush -1
// 07f: putstatic su/catlean/m1.l I
// 082: ldc2_w -5147130986191282098
// 085: lload 4
// 087: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 08f: dup
// 090: sipush 25405
// 093: ldc2_w 2518078677872549840
// 096: lload 4
// 098: lxor
// 099: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a1: putstatic su/catlean/m1.m Lnet/minecraft/class_1792;
// 0a4: aconst_null
// 0a5: putstatic su/catlean/m1.z Lnet/minecraft/class_1799;
// 0a8: bipush 0
// 0a9: putstatic su/catlean/m1.o Z
// 0ac: astore 20
// 0ae: lload 18
// 0b0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b3: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 0b6: invokevirtual net/minecraft/class_746.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
// 0b9: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0bc: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 0bf: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c2: aload 20
// 0c4: ifnonnull 15a
// 0c7: ifne 153
// 0ca: goto 0d8
// 0cd: ldc2_w -5156850174279225364
// 0d0: lload 4
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: lload 18
// 0da: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0dd: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 0e0: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
// 0e3: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0e6: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 0e9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ec: aload 20
// 0ee: ifnonnull 15a
// 0f1: goto 0ff
// 0f4: ldc2_w -5156850174279225364
// 0f7: lload 4
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: ifne 153
// 102: goto 110
// 105: ldc2_w -5156850174279225364
// 108: lload 4
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 113: lload 8
// 115: invokevirtual su/catlean/gg.O (J)I
// 118: bipush -1
// 119: aload 20
// 11b: iload 3
// 11c: ifgt 15d
// 11f: ifnonnull 15b
// 122: goto 130
// 125: ldc2_w -5156850174279225364
// 128: lload 4
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: if_icmpne 153
// 133: goto 141
// 136: ldc2_w -5156850174279225364
// 139: lload 4
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: aload 0
// 142: lload 10
// 144: invokespecial su/catlean/m1.p (J)V
// 147: return
// 148: ldc2_w -5156850174279225364
// 14b: lload 4
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: aload 0
// 154: lload 6
// 156: bipush 0
// 157: invokespecial su/catlean/m1.j (JZ)I
// 15a: bipush -1
// 15b: aload 20
// 15d: ifnonnull 191
// 160: if_icmpne 189
// 163: goto 171
// 166: ldc2_w -5156850174279225364
// 169: lload 4
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: aload 0
// 172: iload 12
// 174: i2s
// 175: iload 13
// 177: i2c
// 178: iload 14
// 17a: invokespecial su/catlean/m1.i (SCI)V
// 17d: return
// 17e: ldc2_w -5156850174279225364
// 181: lload 4
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: aload 0
// 18a: lload 6
// 18c: bipush 1
// 18d: invokespecial su/catlean/m1.j (JZ)I
// 190: bipush -1
// 191: if_icmpeq 195
// 194: return
// 195: lload 18
// 197: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 19d: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1a0: iload 15
// 1a2: i2c
// 1a3: iload 16
// 1a5: iload 17
// 1a7: invokevirtual su/catlean/ut.kQ (CII)I
// 1aa: bipush 1
// 1ab: isub
// 1ac: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 1af: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
// 1b2: putstatic su/catlean/m1.z Lnet/minecraft/class_1799;
// 1b5: lload 18
// 1b7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ba: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1bd: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1c0: iload 15
// 1c2: i2c
// 1c3: iload 16
// 1c5: iload 17
// 1c7: invokevirtual su/catlean/ut.kQ (CII)I
// 1ca: bipush 1
// 1cb: isub
// 1cc: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 1cf: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1d2: dup
// 1d3: sipush 12300
// 1d6: ldc2_w 8339320570217483495
// 1d9: lload 4
// 1db: lxor
// 1dc: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e4: putstatic su/catlean/m1.m Lnet/minecraft/class_1792;
// 1e7: iload 3
// 1e8: ifgt 206
// 1eb: ldc2_w -5135235335274912214
// 1ee: lload 4
// 1f0: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: ifnull 214
// 1f8: bipush 5
// 1f9: anewarray 18
// 1fc: ldc2_w -5168675152223864214
// 1ff: lload 4
// 201: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 206: goto 214
// 209: ldc2_w -5156850174279225364
// 20c: lload 4
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: return
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
// 02: ldc2_w 115322306114422
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 85510088156605
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w 4010927170984488822
// 12: lload 1
// 13: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: bipush 0
// 19: putstatic su/catlean/m1.E Z
// 1c: astore 7
// 1e: aload 7
// 20: ifnonnull 69
// 23: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 26: lload 3
// 27: invokevirtual su/catlean/ut.H (J)Z
// 2a: ifeq 45
// 2d: goto 3a
// 30: ldc2_w 3987702964553474260
// 33: lload 1
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: return
// 3b: ldc2_w 3987702964553474260
// 3e: lload 1
// 3f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: athrow
// 45: lload 5
// 47: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4a: dconst_0
// 4b: lload 5
// 4d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 50: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 53: invokevirtual net/minecraft/class_243.method_10214 ()D
// 56: dconst_0
// 57: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 5a: new java/lang/Thread
// 5d: dup
// 5e: invokedynamic run ()Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/m1.k ()V, ()V ]
// 63: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
// 66: invokevirtual java/lang/Thread.start ()V
// 69: return
}

@Override
public void U(long a, @NotNull FireWorkVelocityEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void s(@NotNull SetPoseEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
}

@Override
public void k(long a, @NotNull ReceivePacket e) {
Intrinsics.checkNotNullParameter(ex, "e");
}

private final int j(long var1, boolean var3) {
var1 = c ^ var1;
long var10001 = var1 ^ 23207976449418L;
int var4 = (int)((var1 ^ 23207976449418L) >>> 32);
int var5 = (int)((var1 ^ 23207976449418L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
int var7 = (int)((var1 ^ 7552621302773L) >>> 48);
long var8 = (var1 ^ 7552621302773L) << 16 >>> 16;
int var13;
if (var3) {
gg var10000 = gg.P;
class_1792[] var10 = new class_1792[1];
class_1792 var10003 = class_1802.field_8639;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8639, a<"n">(28366, 7344450740018069814L ^ var1));
var10[0] = var10003;
var13 = var10000.Y(var4, var10, var5, (char)var6).a();
} else {
gg var14 = gg.P;
class_1792[] var12 = new class_1792[1];
class_1792 var15 = class_1802.field_8639;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8639, a<"n">(30877, 4281941895537874786L ^ var1));
var12[0] = var15;
var13 = var14.o(var12, (char)var7, var8).a();
}

return var13;
}

private final void i(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ c;
long var10001 = var4 ^ 48256899219106L;
int var6 = (int)((var4 ^ 48256899219106L) >>> 32);
int var7 = (int)((var4 ^ 48256899219106L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
long var9 = var4 ^ 134251963491113L;
ut.D.f(var9, i4.h.E(var6, a<"n">(6955, 4532507326378692150L ^ var4), var7, new Object[0], var8));
o = false;
}

private final void p(long var1) {
var1 = c ^ var1;
long var10001 = var1 ^ 97776969684344L;
int var3 = (int)((var1 ^ 97776969684344L) >>> 32);
int var4 = (int)((var1 ^ 97776969684344L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 9995165255923L;
ut.D.f(var6, i4.h.E(var3, a<"n">(19568, 3913581992065495733L ^ var1), var4, new Object[0], var5));
o = false;
}

private final void G(long var1, int var3) {
var1 = c ^ var1;
long var4 = var1 ^ 57346796374358L;
long var10001 = var1 ^ 135963285199478L;
int var6 = (int)((var1 ^ 135963285199478L) >>> 48);
int var7 = (int)((var1 ^ 135963285199478L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
ag.e(var3, var4, 0, null, false, b<"w">(23879, 3182889289433345501L ^ var1), null);
ag.e(ut.D.kQ((char)var6, var7, var8) - 1 + b<"w">(16259, 6221635125639253778L ^ var1), var4, 0, null, false, b<"w">(7133, 3397116518884191053L ^ var1), null);
ag.e(var3, var4, 0, null, true, b<"w">(10299, 6825727591371446445L ^ var1), null);
}

private final void K(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/m1.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 120871694897274
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 1227432981570
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 86439245686626
// 018: lxor
// 019: dup2
// 01a: bipush 48
// 01c: lushr
// 01d: l2i
// 01e: istore 7
// 020: dup2
// 021: bipush 16
// 023: lshl
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 8
// 02a: dup2
// 02b: bipush 48
// 02d: lshl
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 9
// 034: pop2
// 035: pop2
// 036: ldc2_w -440030528213556933
// 039: lload 1
// 03a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: astore 10
// 041: getstatic su/catlean/m1.l I
// 044: bipush -1
// 045: if_icmpeq 0b7
// 048: getstatic su/catlean/m1.z Lnet/minecraft/class_1799;
// 04b: ifnull 0b7
// 04e: goto 05b
// 051: ldc2_w -497026372317368679
// 054: lload 1
// 055: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: athrow
// 05b: getstatic su/catlean/m1.m Lnet/minecraft/class_1792;
// 05e: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 061: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 064: aload 10
// 066: lload 1
// 067: lconst_0
// 068: lcmp
// 069: ifle 0a4
// 06c: ifnonnull 0a2
// 06f: goto 07c
// 072: ldc2_w -497026372317368679
// 075: lload 1
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: ifne 0b7
// 07f: goto 08c
// 082: ldc2_w -497026372317368679
// 085: lload 1
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: getstatic su/catlean/m1.m Lnet/minecraft/class_1792;
// 08f: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 092: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 095: goto 0a2
// 098: ldc2_w -497026372317368679
// 09b: lload 1
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: aload 10
// 0a4: ifnonnull 0c3
// 0a7: ifeq 0b8
// 0aa: goto 0b7
// 0ad: ldc2_w -497026372317368679
// 0b0: lload 1
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: return
// 0b8: aload 0
// 0b9: getstatic su/catlean/m1.z Lnet/minecraft/class_1799;
// 0bc: getstatic su/catlean/m1.m Lnet/minecraft/class_1792;
// 0bf: lload 3
// 0c0: invokespecial su/catlean/m1.l (Lnet/minecraft/class_1799;Lnet/minecraft/class_1792;J)I
// 0c3: istore 11
// 0c5: iload 11
// 0c7: sipush 17898
// 0ca: ldc2_w 4331882157333465190
// 0cd: lload 1
// 0ce: lxor
// 0cf: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: aload 10
// 0d6: lload 1
// 0d7: lconst_0
// 0d8: lcmp
// 0d9: ifle 101
// 0dc: ifnonnull 0ff
// 0df: if_icmpge 134
// 0e2: goto 0ef
// 0e5: ldc2_w -497026372317368679
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: iload 11
// 0f1: bipush -1
// 0f2: goto 0ff
// 0f5: ldc2_w -497026372317368679
// 0f8: lload 1
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: aload 10
// 101: ifnonnull 130
// 104: if_icmpeq 134
// 107: goto 114
// 10a: ldc2_w -497026372317368679
// 10d: lload 1
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: iload 11
// 116: sipush 4665
// 119: ldc2_w 5215383691471658934
// 11c: lload 1
// 11d: lxor
// 11e: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: goto 130
// 126: ldc2_w -497026372317368679
// 129: lload 1
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: iadd
// 131: goto 136
// 134: iload 11
// 136: istore 11
// 138: iload 11
// 13a: lload 5
// 13c: bipush 0
// 13d: aconst_null
// 13e: bipush 0
// 13f: sipush 7133
// 142: ldc2_w 3397066846760703577
// 145: lload 1
// 146: lxor
// 147: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: aconst_null
// 14d: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 150: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 153: iload 7
// 155: i2c
// 156: iload 8
// 158: iload 9
// 15a: invokevirtual su/catlean/ut.kQ (CII)I
// 15d: bipush 1
// 15e: isub
// 15f: sipush 4665
// 162: ldc2_w 5215383691471658934
// 165: lload 1
// 166: lxor
// 167: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: iadd
// 16d: lload 5
// 16f: bipush 0
// 170: aconst_null
// 171: bipush 0
// 172: sipush 7133
// 175: ldc2_w 3397066846760703577
// 178: lload 1
// 179: lxor
// 17a: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: aconst_null
// 180: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 183: iload 11
// 185: lload 5
// 187: bipush 0
// 188: aconst_null
// 189: bipush 0
// 18a: sipush 7133
// 18d: ldc2_w 3397066846760703577
// 190: lload 1
// 191: lxor
// 192: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: aconst_null
// 198: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 19b: return
}

private final void D(long var1) {
var1 = c ^ var1;
x = -1;
class_1792 var10000 = class_1802.field_8162;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8162, a<"n">(25405, 2518151150786653488L ^ var1));
a = var10000;
G = null;
}

private final int l(class_1799 param1, class_1792 param2, long param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/m1.c J
// 03: lload 3
// 04: lxor
// 05: lstore 3
// 06: lload 3
// 07: dup2
// 08: ldc2_w 111983606663119
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w 6186684880089992452
// 12: lload 3
// 13: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 7
// 1a: aload 1
// 1b: ifnonnull 2a
// 1e: bipush -1
// 1f: ireturn
// 20: ldc2_w 6135313003082285734
// 23: lload 3
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: bipush 0
// 2b: istore 8
// 2d: iload 8
// 2f: sipush 15679
// 32: ldc2_w 5533909578057063553
// 35: lload 3
// 36: lxor
// 37: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: if_icmpge ce
// 3f: lload 5
// 41: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 44: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 47: iload 8
// 49: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 4c: dup
// 4d: sipush 29684
// 50: ldc2_w 4510801249608983122
// 53: lload 3
// 54: lxor
// 55: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5d: astore 9
// 5f: aload 7
// 61: lload 3
// 62: lconst_0
// 63: lcmp
// 64: iflt cb
// 67: ifnonnull c9
// 6a: aload 9
// 6c: aload 1
// 6d: invokestatic net/minecraft/class_1799.method_7984 (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
// 70: aload 7
// 72: ifnonnull cf
// 75: goto 82
// 78: ldc2_w 6135313003082285734
// 7b: lload 3
// 7c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: athrow
// 82: ifeq c6
// 85: goto 92
// 88: ldc2_w 6135313003082285734
// 8b: lload 3
// 8c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91: athrow
// 92: aload 9
// 94: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 97: aload 2
// 98: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9b: aload 7
// 9d: ifnonnull c5
// a0: goto ad
// a3: ldc2_w 6135313003082285734
// a6: lload 3
// a7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac: athrow
// ad: ifne c3
// b0: goto bd
// b3: ldc2_w 6135313003082285734
// b6: lload 3
// b7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc: athrow
// bd: lload 3
// be: lconst_0
// bf: lcmp
// c0: ifge c6
// c3: iload 8
// c5: ireturn
// c6: iinc 8 1
// c9: aload 7
// cb: ifnull 2d
// ce: bipush -1
// cf: ireturn
}

private final int n(short param1, long param2) {
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
// 005: lload 2
// 006: bipush 16
// 008: lshl
// 009: bipush 16
// 00b: lushr
// 00c: lor
// 00d: getstatic su/catlean/m1.c J
// 010: lxor
// 011: lstore 4
// 013: lload 4
// 015: dup2
// 016: ldc2_w 13465237978956
// 019: lxor
// 01a: dup2
// 01b: bipush 32
// 01d: lushr
// 01e: l2i
// 01f: istore 6
// 021: dup2
// 022: bipush 32
// 024: lshl
// 025: bipush 48
// 027: lushr
// 028: l2i
// 029: istore 7
// 02b: dup2
// 02c: bipush 48
// 02e: lshl
// 02f: bipush 48
// 031: lushr
// 032: l2i
// 033: istore 8
// 035: pop2
// 036: dup2
// 037: ldc2_w 112534657487705
// 03a: lxor
// 03b: lstore 9
// 03d: dup2
// 03e: ldc2_w 134970468254753
// 041: lxor
// 042: dup2
// 043: bipush 32
// 045: lushr
// 046: l2i
// 047: istore 11
// 049: dup2
// 04a: bipush 32
// 04c: lshl
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 12
// 053: dup2
// 054: bipush 48
// 056: lshl
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 13
// 05d: pop2
// 05e: dup2
// 05f: ldc2_w 47532757293482
// 062: lxor
// 063: lstore 14
// 065: dup2
// 066: ldc2_w 104293951994914
// 069: lxor
// 06a: lstore 16
// 06c: dup2
// 06d: ldc2_w 12378557023942
// 070: lxor
// 071: dup2
// 072: bipush 48
// 074: lushr
// 075: l2i
// 076: istore 18
// 078: dup2
// 079: bipush 16
// 07b: lshl
// 07c: bipush 48
// 07e: lushr
// 07f: l2i
// 080: istore 19
// 082: dup2
// 083: bipush 32
// 085: lshl
// 086: bipush 32
// 088: lushr
// 089: l2i
// 08a: istore 20
// 08c: pop2
// 08d: dup2
// 08e: ldc2_w 78688530101610
// 091: lxor
// 092: dup2
// 093: bipush 48
// 095: lushr
// 096: l2i
// 097: istore 21
// 099: dup2
// 09a: bipush 16
// 09c: lshl
// 09d: bipush 32
// 09f: lushr
// 0a0: l2i
// 0a1: istore 22
// 0a3: dup2
// 0a4: bipush 48
// 0a6: lshl
// 0a7: bipush 48
// 0a9: lushr
// 0aa: l2i
// 0ab: istore 23
// 0ad: pop2
// 0ae: dup2
// 0af: ldc2_w 100449872640504
// 0b2: lxor
// 0b3: lstore 24
// 0b5: pop2
// 0b6: ldc2_w 3165110918147879731
// 0b9: lload 4
// 0bb: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: astore 26
// 0c2: lload 24
// 0c4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c7: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 0ca: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0cd: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 0d0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d3: aload 26
// 0d5: ifnonnull 10a
// 0d8: ifeq 103
// 0db: goto 0e9
// 0de: ldc2_w 3103609242141031569
// 0e1: lload 4
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: sipush 17579
// 0ec: ldc2_w 7590159458167921440
// 0ef: lload 4
// 0f1: lxor
// 0f2: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: ireturn
// 0f8: ldc2_w 3103609242141031569
// 0fb: lload 4
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: aload 0
// 104: lload 16
// 106: bipush 1
// 107: invokespecial su/catlean/m1.j (JZ)I
// 10a: istore 27
// 10c: aload 0
// 10d: lload 16
// 10f: bipush 0
// 110: invokespecial su/catlean/m1.j (JZ)I
// 113: istore 28
// 115: iload 28
// 117: bipush -1
// 118: lload 2
// 119: lconst_0
// 11a: lcmp
// 11b: iflt 163
// 11e: aload 26
// 120: ifnonnull 163
// 123: if_icmpne 14d
// 126: goto 134
// 129: ldc2_w 3103609242141031569
// 12c: lload 4
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: aload 0
// 135: iload 18
// 137: i2s
// 138: iload 19
// 13a: i2c
// 13b: iload 20
// 13d: invokespecial su/catlean/m1.i (SCI)V
// 140: bipush -1
// 141: ireturn
// 142: ldc2_w 3103609242141031569
// 145: lload 4
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: iload 27
// 14f: aload 26
// 151: ifnonnull 1fa
// 154: bipush -1
// 155: goto 163
// 158: ldc2_w 3103609242141031569
// 15b: lload 4
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: if_icmpne 1f8
// 166: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 169: iload 6
// 16b: iload 7
// 16d: i2c
// 16e: iload 8
// 170: i2s
// 171: invokevirtual su/catlean/ut.kA (ICS)Z
// 174: aload 26
// 176: ifnonnull 1f7
// 179: goto 187
// 17c: ldc2_w 3103609242141031569
// 17f: lload 4
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: iload 1
// 188: iflt 1f5
// 18b: ifne 1e0
// 18e: goto 19c
// 191: ldc2_w 3103609242141031569
// 194: lload 4
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 19f: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 1a2: iload 11
// 1a4: sipush 32191
// 1a7: ldc2_w 6476205233397731883
// 1aa: lload 4
// 1ac: lxor
// 1ad: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: bipush 0
// 1b3: anewarray 581
// 1b6: iload 12
// 1b8: swap
// 1b9: iload 13
// 1bb: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 1be: lload 14
// 1c0: dup2_x1
// 1c1: pop2
// 1c2: invokevirtual su/catlean/ut.f (JLjava/lang/String;)V
// 1c5: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1c8: iload 21
// 1ca: i2c
// 1cb: iload 22
// 1cd: iload 23
// 1cf: invokevirtual su/catlean/ut.kQ (CII)I
// 1d2: bipush 1
// 1d3: isub
// 1d4: ireturn
// 1d5: ldc2_w 3103609242141031569
// 1d8: lload 4
// 1da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1df: athrow
// 1e0: aload 0
// 1e1: lload 9
// 1e3: iload 28
// 1e5: invokespecial su/catlean/m1.G (JI)V
// 1e8: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1eb: iload 21
// 1ed: i2c
// 1ee: iload 22
// 1f0: iload 23
// 1f2: invokevirtual su/catlean/ut.kQ (CII)I
// 1f5: bipush 1
// 1f6: isub
// 1f7: ireturn
// 1f8: iload 27
// 1fa: ireturn
}

private final boolean J(int param1, short param2, char param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 2
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: iload 3
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: getstatic su/catlean/m1.c J
// 1a: lxor
// 1b: lstore 4
// 1d: lload 4
// 1f: dup2
// 20: ldc2_w 94812638680079
// 23: lxor
// 24: lstore 6
// 26: dup2
// 27: ldc2_w 58944421679561
// 2a: lxor
// 2b: dup2
// 2c: bipush 48
// 2e: lushr
// 2f: l2i
// 30: istore 8
// 32: dup2
// 33: bipush 16
// 35: lshl
// 36: bipush 16
// 38: lushr
// 39: lstore 9
// 3b: pop2
// 3c: pop2
// 3d: ldc2_w 5071286692040761023
// 40: lload 4
// 42: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: astore 11
// 49: aload 0
// 4a: lload 6
// 4c: invokespecial su/catlean/m1.e (J)Z
// 4f: aload 11
// 51: ifnonnull 7b
// 54: ifeq 72
// 57: goto 65
// 5a: ldc2_w 5088596805831364893
// 5d: lload 4
// 5f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: athrow
// 65: bipush 0
// 66: ireturn
// 67: ldc2_w 5088596805831364893
// 6a: lload 4
// 6c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: athrow
// 72: aload 0
// 73: iload 8
// 75: i2s
// 76: lload 9
// 78: invokespecial su/catlean/m1.n (SJ)I
// 7b: aload 11
// 7d: ifnonnull a1
// 80: bipush -1
// 81: if_icmpeq a4
// 84: goto 92
// 87: ldc2_w 5088596805831364893
// 8a: lload 4
// 8c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91: athrow
// 92: bipush 1
// 93: goto a1
// 96: ldc2_w 5088596805831364893
// 99: lload 4
// 9b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: athrow
// a1: goto a5
// a4: bipush 0
// a5: ireturn
}

private final boolean e(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/m1.c J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 61155935346905
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 62657500494910
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w -1284976995375188235
// 18: lload 1
// 19: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: lload 5
// 20: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 26: invokevirtual net/minecraft/class_746.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
// 29: dup
// 2a: sipush 2006
// 2d: ldc2_w 8213273033129864583
// 30: lload 1
// 31: lxor
// 32: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3a: astore 8
// 3c: astore 7
// 3e: aload 8
// 40: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 43: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 46: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 49: aload 7
// 4b: ifnonnull 8a
// 4e: ifeq 89
// 51: goto 5e
// 54: ldc2_w -1237258933465663145
// 57: lload 1
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 61: lload 3
// 62: aload 8
// 64: invokevirtual su/catlean/ut.Y (JLnet/minecraft/class_1799;)Z
// 67: aload 7
// 69: ifnonnull 8a
// 6c: goto 79
// 6f: ldc2_w -1237258933465663145
// 72: lload 1
// 73: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: athrow
// 79: ifne 8d
// 7c: goto 89
// 7f: ldc2_w -1237258933465663145
// 82: lload 1
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: bipush 1
// 8a: goto 8e
// 8d: bipush 0
// 8e: ireturn
}

private final void r(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/m1.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 114018830188640
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 42759884984763
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 94995416375209
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 26314117598006
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 58247154819026
// 026: lxor
// 027: lstore 11
// 029: pop2
// 02a: ldc2_w 992714131589764377
// 02d: lload 1
// 02e: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 036: lload 5
// 038: invokevirtual su/catlean/gg.O (J)I
// 03b: istore 14
// 03d: astore 13
// 03f: iload 14
// 041: aload 13
// 043: ifnonnull 0aa
// 046: bipush -1
// 047: if_icmpne 0a4
// 04a: goto 057
// 04d: ldc2_w 952603177812646587
// 050: lload 1
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: lload 11
// 059: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05c: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 05f: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
// 062: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 065: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
// 068: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 06b: aload 13
// 06d: lload 1
// 06e: lconst_0
// 06f: lcmp
// 070: iflt 0b2
// 073: ifnonnull 0aa
// 076: goto 083
// 079: ldc2_w 952603177812646587
// 07c: lload 1
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: ifne 0a4
// 086: goto 093
// 089: ldc2_w 952603177812646587
// 08c: lload 1
// 08d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: athrow
// 093: aload 0
// 094: lload 9
// 096: invokespecial su/catlean/m1.p (J)V
// 099: return
// 09a: ldc2_w 952603177812646587
// 09d: lload 1
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: aload 0
// 0a5: lload 7
// 0a7: invokespecial su/catlean/m1.e (J)Z
// 0aa: lload 1
// 0ab: lconst_0
// 0ac: lcmp
// 0ad: iflt 0c9
// 0b0: aload 13
// 0b2: ifnonnull 0c9
// 0b5: ifne 0c6
// 0b8: goto 0c5
// 0bb: ldc2_w 952603177812646587
// 0be: lload 1
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: return
// 0c6: getstatic su/catlean/m1.x I
// 0c9: bipush -1
// 0ca: lload 1
// 0cb: lconst_0
// 0cc: lcmp
// 0cd: ifle 17e
// 0d0: aload 13
// 0d2: ifnonnull 17e
// 0d5: if_icmpne 129
// 0d8: goto 0e5
// 0db: ldc2_w 952603177812646587
// 0de: lload 1
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: lload 11
// 0e7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ea: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
// 0ed: invokevirtual net/minecraft/class_746.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
// 0f0: dup
// 0f1: sipush 20855
// 0f4: ldc2_w 7512877220701935814
// 0f7: lload 1
// 0f8: lxor
// 0f9: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 101: astore 15
// 103: iload 14
// 105: putstatic su/catlean/m1.x I
// 108: aload 15
// 10a: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 10d: dup
// 10e: sipush 29684
// 111: ldc2_w 4510853066264984143
// 114: lload 1
// 115: lxor
// 116: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 11e: putstatic su/catlean/m1.a Lnet/minecraft/class_1792;
// 121: aload 15
// 123: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
// 126: putstatic su/catlean/m1.G Lnet/minecraft/class_1799;
// 129: iload 14
// 12b: lload 3
// 12c: bipush 0
// 12d: aconst_null
// 12e: bipush 0
// 12f: sipush 7133
// 132: ldc2_w 3397025710446371451
// 135: lload 1
// 136: lxor
// 137: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: aconst_null
// 13d: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 140: sipush 10299
// 143: ldc2_w 6825636860265845147
// 146: lload 1
// 147: lxor
// 148: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: lload 1
// 14e: lconst_0
// 14f: lcmp
// 150: ifle 170
// 153: lload 3
// 154: bipush 0
// 155: aconst_null
// 156: bipush 0
// 157: sipush 7133
// 15a: ldc2_w 3397025710446371451
// 15d: lload 1
// 15e: lxor
// 15f: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: aconst_null
// 165: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 168: aload 13
// 16a: ifnonnull 1ad
// 16d: getstatic su/catlean/m1.x I
// 170: bipush -1
// 171: goto 17e
// 174: ldc2_w 952603177812646587
// 177: lload 1
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: if_icmpeq 1a6
// 181: getstatic su/catlean/m1.x I
// 184: lload 3
// 185: bipush 0
// 186: aconst_null
// 187: bipush 0
// 188: sipush 7133
// 18b: ldc2_w 3397025710446371451
// 18e: lload 1
// 18f: lxor
// 190: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: aconst_null
// 196: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 199: goto 1a6
// 19c: ldc2_w 952603177812646587
// 19f: lload 1
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 1a9: bipush 1
// 1aa: invokevirtual su/catlean/ut.e (Z)V
// 1ad: return
}

private final void R(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/m1.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 121377947663478
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 82277707496760
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 2851517552718
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 29479105979356
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 90010713262076
// 026: lxor
// 027: lstore 11
// 029: pop2
// 02a: ldc2_w -3032979620576834249
// 02d: lload 1
// 02e: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: astore 18
// 035: aload 18
// 037: ifnonnull 343
// 03a: getstatic su/catlean/m1.x I
// 03d: bipush -1
// 03e: if_icmpeq 33d
// 041: goto 04e
// 044: ldc2_w -3092223964852682091
// 047: lload 1
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: getstatic su/catlean/m1.a Lnet/minecraft/class_1792;
// 051: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 054: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 057: aload 18
// 059: ifnonnull 08c
// 05c: goto 069
// 05f: ldc2_w -3092223964852682091
// 062: lload 1
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: ifne 33d
// 06c: goto 079
// 06f: ldc2_w -3092223964852682091
// 072: lload 1
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: getstatic su/catlean/ut.D Lsu/catlean/ut;
// 07c: invokevirtual su/catlean/ut.F1 ()Z
// 07f: goto 08c
// 082: ldc2_w -3092223964852682091
// 085: lload 1
// 086: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: athrow
// 08c: ifne 090
// 08f: return
// 090: lload 11
// 092: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 095: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 098: getstatic su/catlean/m1.x I
// 09b: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 09e: dup
// 09f: sipush 29684
// 0a2: ldc2_w 4510814425654714977
// 0a5: lload 1
// 0a6: lxor
// 0a7: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/m1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0af: astore 19
// 0b1: aload 19
// 0b3: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
// 0b6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b9: aload 18
// 0bb: lload 1
// 0bc: lconst_0
// 0bd: lcmp
// 0be: iflt 0ef
// 0c1: ifnonnull 0ed
// 0c4: ifne 106
// 0c7: goto 0d4
// 0ca: ldc2_w -3092223964852682091
// 0cd: lload 1
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: aload 19
// 0d6: getstatic su/catlean/m1.G Lnet/minecraft/class_1799;
// 0d9: dup
// 0da: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0dd: invokestatic net/minecraft/class_1799.method_7984 (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
// 0e0: goto 0ed
// 0e3: ldc2_w -3092223964852682091
// 0e6: lload 1
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: aload 18
// 0ef: ifnonnull 103
// 0f2: ifne 106
// 0f5: goto 102
// 0f8: ldc2_w -3092223964852682091
// 0fb: lload 1
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: bipush 1
// 103: goto 107
// 106: bipush 0
// 107: istore 20
// 109: aload 0
// 10a: getstatic su/catlean/m1.G Lnet/minecraft/class_1799;
// 10d: getstatic su/catlean/m1.a Lnet/minecraft/class_1792;
// 110: lload 3
// 111: invokespecial su/catlean/m1.l (Lnet/minecraft/class_1799;Lnet/minecraft/class_1792;J)I
// 114: istore 21
// 116: iload 21
// 118: sipush 17898
// 11b: ldc2_w 4331878265606300778
// 11e: lload 1
// 11f: lxor
// 120: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: aload 18
// 127: lload 1
// 128: lconst_0
// 129: lcmp
// 12a: ifle 152
// 12d: ifnonnull 150
// 130: if_icmpge 185
// 133: goto 140
// 136: ldc2_w -3092223964852682091
// 139: lload 1
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: iload 21
// 142: bipush -1
// 143: goto 150
// 146: ldc2_w -3092223964852682091
// 149: lload 1
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: aload 18
// 152: ifnonnull 181
// 155: if_icmpeq 185
// 158: goto 165
// 15b: ldc2_w -3092223964852682091
// 15e: lload 1
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: iload 21
// 167: sipush 4665
// 16a: ldc2_w 5215379886684550074
// 16d: lload 1
// 16e: lxor
// 16f: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 174: goto 181
// 177: ldc2_w -3092223964852682091
// 17a: lload 1
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: iadd
// 182: goto 187
// 185: iload 21
// 187: istore 21
// 189: lload 11
// 18b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 18e: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 191: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
// 194: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 197: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 19a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 19d: lload 1
// 19e: lconst_0
// 19f: lcmp
// 1a0: iflt 23e
// 1a3: aload 18
// 1a5: ifnonnull 23e
// 1a8: ifne 23c
// 1ab: goto 1b8
// 1ae: ldc2_w -3092223964852682091
// 1b1: lload 1
// 1b2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: athrow
// 1b8: sipush 10299
// 1bb: ldc2_w 6825748031059167669
// 1be: lload 1
// 1bf: lxor
// 1c0: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: lload 7
// 1c7: bipush 0
// 1c8: aconst_null
// 1c9: bipush 0
// 1ca: sipush 7133
// 1cd: ldc2_w 3397066270647630421
// 1d0: lload 1
// 1d1: lxor
// 1d2: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: aconst_null
// 1d8: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 1db: getstatic su/catlean/m1.x I
// 1de: bipush -1
// 1df: aload 18
// 1e1: ifnonnull 212
// 1e4: goto 1f1
// 1e7: ldc2_w -3092223964852682091
// 1ea: lload 1
// 1eb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f0: athrow
// 1f1: if_icmpeq 23b
// 1f4: goto 201
// 1f7: ldc2_w -3092223964852682091
// 1fa: lload 1
// 1fb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 200: athrow
// 201: getstatic su/catlean/m1.x I
// 204: bipush 0
// 205: goto 212
// 208: ldc2_w -3092223964852682091
// 20b: lload 1
// 20c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: athrow
// 212: aconst_null
// 213: bipush 0
// 214: sipush 7133
// 217: ldc2_w 3397066270647630421
// 21a: lload 1
// 21b: lxor
// 21c: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: aconst_null
// 222: astore 13
// 224: istore 14
// 226: istore 15
// 228: astore 16
// 22a: istore 17
// 22c: lload 7
// 22e: iload 17
// 230: aload 16
// 232: iload 15
// 234: iload 14
// 236: aload 13
// 238: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 23b: return
// 23c: iload 21
// 23e: bipush -1
// 23f: aload 18
// 241: ifnonnull 27b
// 244: if_icmpne 255
// 247: goto 254
// 24a: ldc2_w -3092223964852682091
// 24d: lload 1
// 24e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: athrow
// 254: return
// 255: iload 21
// 257: lload 7
// 259: bipush 0
// 25a: aconst_null
// 25b: bipush 0
// 25c: sipush 7133
// 25f: ldc2_w 3397066270647630421
// 262: lload 1
// 263: lxor
// 264: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: aconst_null
// 26a: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 26d: sipush 10299
// 270: ldc2_w 6825748031059167669
// 273: lload 1
// 274: lxor
// 275: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27a: bipush 0
// 27b: aconst_null
// 27c: bipush 0
// 27d: sipush 7133
// 280: ldc2_w 3397066270647630421
// 283: lload 1
// 284: lxor
// 285: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: aconst_null
// 28b: astore 13
// 28d: istore 14
// 28f: istore 15
// 291: astore 16
// 293: istore 17
// 295: lload 7
// 297: iload 17
// 299: aload 16
// 29b: iload 15
// 29d: iload 14
// 29f: aload 13
// 2a1: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 2a4: iload 20
// 2a6: aload 18
// 2a8: ifnonnull 2fe
// 2ab: ifne 2eb
// 2ae: goto 2bb
// 2b1: ldc2_w -3092223964852682091
// 2b4: lload 1
// 2b5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ba: athrow
// 2bb: iload 21
// 2bd: lload 7
// 2bf: bipush 0
// 2c0: aconst_null
// 2c1: bipush 0
// 2c2: sipush 7133
// 2c5: ldc2_w 3397066270647630421
// 2c8: lload 1
// 2c9: lxor
// 2ca: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: aconst_null
// 2d0: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 2d3: lload 1
// 2d4: lconst_0
// 2d5: lcmp
// 2d6: ifle 343
// 2d9: aload 18
// 2db: ifnull 33d
// 2de: goto 2eb
// 2e1: ldc2_w -3092223964852682091
// 2e4: lload 1
// 2e5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ea: athrow
// 2eb: aload 0
// 2ec: lload 5
// 2ee: invokespecial su/catlean/m1.M (J)I
// 2f1: goto 2fe
// 2f4: ldc2_w -3092223964852682091
// 2f7: lload 1
// 2f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fd: athrow
// 2fe: istore 22
// 300: aload 18
// 302: ifnonnull 343
// 305: iload 22
// 307: bipush -1
// 308: if_icmpeq 33d
// 30b: goto 318
// 30e: ldc2_w -3092223964852682091
// 311: lload 1
// 312: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 317: athrow
// 318: iload 22
// 31a: lload 7
// 31c: bipush 0
// 31d: aconst_null
// 31e: bipush 0
// 31f: sipush 7133
// 322: ldc2_w 3397066270647630421
// 325: lload 1
// 326: lxor
// 327: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32c: aconst_null
// 32d: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 330: goto 33d
// 333: ldc2_w -3092223964852682091
// 336: lload 1
// 337: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33c: athrow
// 33d: aload 0
// 33e: lload 9
// 340: invokespecial su/catlean/m1.D (J)V
// 343: return
}

private final int M(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/m1.c J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 71921172186753
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w 6094955443505351754
// 11: lload 1
// 12: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: sipush 17898
// 1a: ldc2_w 4331896459844543767
// 1d: lload 1
// 1e: lxor
// 1f: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24: istore 6
// 26: astore 5
// 28: iload 6
// 2a: sipush 26308
// 2d: ldc2_w 4185503169431225912
// 30: lload 1
// 31: lxor
// 32: invokedynamic w (IJ)I bsm=su/catlean/m1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: if_icmpge 81
// 3a: lload 3
// 3b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 41: iload 6
// 43: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 46: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 49: aload 5
// 4b: lload 1
// 4c: lconst_0
// 4d: lcmp
// 4e: iflt 56
// 51: ifnonnull 88
// 54: aload 5
// 56: ifnonnull 78
// 59: goto 66
// 5c: ldc2_w 6082997622362932200
// 5f: lload 1
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: ifeq 79
// 69: goto 76
// 6c: ldc2_w 6082997622362932200
// 6f: lload 1
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: iload 6
// 78: ireturn
// 79: iinc 6 1
// 7c: aload 5
// 7e: ifnull 28
// 81: lload 1
// 82: lconst_0
// 83: lcmp
// 84: iflt 3a
// 87: bipush -1
// 88: ireturn
}

public final boolean C(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/m1.c J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 12994280684882
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 10748043903989
// 11: lxor
// 12: lstore 5
// 14: pop2
// 15: ldc2_w 1288567163090962750
// 18: lload 1
// 19: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e: astore 7
// 20: lload 5
// 22: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 25: invokevirtual net/minecraft/class_746.method_23318 ()D
// 28: dconst_0
// 29: dcmpg
// 2a: aload 7
// 2c: ifnonnull 74
// 2f: ifge 4b
// 32: goto 3f
// 35: ldc2_w 1233826545664018076
// 38: lload 1
// 39: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: athrow
// 3f: bipush 0
// 40: ireturn
// 41: ldc2_w 1233826545664018076
// 44: lload 1
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: lload 3
// 4c: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 4f: lload 5
// 51: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 54: checkcast net/minecraft/class_1297
// 57: lload 5
// 59: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5c: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 5f: dconst_0
// 60: ldc2_w -3.0
// 63: dconst_0
// 64: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 67: invokevirtual net/minecraft/class_638.method_20812 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/lang/Iterable;
// 6a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 6f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 74: aload 7
// 76: ifnonnull 8a
// 79: ifne 8d
// 7c: goto 89
// 7f: ldc2_w 1233826545664018076
// 82: lload 1
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: bipush 1
// 8a: goto 8e
// 8d: bipush 0
// 8e: ireturn
}

public final boolean c(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 14284811367728L;
long var5 = var1 ^ 16402466884503L;
return zf.z(var3).method_8320(class_2338.method_49637(zf.v(var5).method_23317(), zf.v(var5).method_23318() - 0.1, zf.v(var5).method_23321())).method_26204() instanceof class_2404;
}

private static final void k() {
long var0 = c ^ 16978699096355L;
long var2 = var0 ^ 105906517436860L;
long var4 = var0 ^ 109781165393328L;
long var6 = var0 ^ 114585755109964L;
long var8 = var0 ^ 38995048634921L;
long var10 = var0 ^ 114786711993865L;
_r.a(var6, (class_2596)(new class_2848((class_1297)zf.v(var10), class_2849.field_12982)));
L.K(var2);
l = -1;
class_1792 var10000 = class_1802.field_8162;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8162, a<"n">(956, 1709527805723536336L ^ var0));
m = var10000;
z = null;
L.R(var4);
L.D(var8);
}

static {
long var20 = c ^ 137547252340825L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[17];
int var16 = 0;
String var15 = "´¸!xÍ\u001d\u009a¥7ÞY\u0095p\"ï\bx\u0085Èï\f¬×õ³\u0019Æ]âó«\u009d\u0091\u000f\u008dµXC\u001eyÏr·3wÌ;¢üúàl\u000eK\u0081ý\u0010ÔÀ#\u008fóf$\u001b-áa\u0015\u0017¦\u009e÷0\u008c\u001eo\u0088V\u0088;&\u0011%\u0091»2¥\u0082º7\u0005rg¯'\u0083Î7X\u0014ï°]\u008c\u001e\u0088\u0015fý§ï\u008c\u0017Ev)\u0089¡\u001dM¯ \u0095ç¡\b7(</ïC\u0083\u0090ø\n\u00026\u0087î\u009c¹\u0082PUÞMBñ\\\u0013w0\r \u0089\txc¶á|N.\u0095l<4÷çJÝç[\u0013\u009bÕÈ\u0003_\u0085Ïu\u0019ÓÇ\u0011\u0088\u0082Ø9\u0002\u0015åô\u0093ètªXÈ¥ú \u001b\u001e\u0086ã\bn\n(ùVf<yô\"vú1sNÕîÒ BÞ\u001f\u0096<\u0084 h\u009cA\u000f\u0082â\u0018³É÷üà\u0096{øï»\u008d^Eã)[OLb\u0005\u0092¿\u009fL§\u0019f `WT2\fº5\u00ad\u0085\b¹Þ§ü.+zE\u009b±\u0098Ì\bÃ\u001f§0\u001d®1³F\u00913ñ®ÊjyÁ\\\u00980\u0003_r\u008fÕ\u008eM<I\u0004\u001f\u0010¦¼\"ø\u0097bOçKkQ¼^Üó=(\u000eµ§L\u000b¦&ðå\u0081X\u001b\u008d>«\u0005\u0083jI&\u0004zlo\u009c3\u0004¾~Ñüû8þíZYsx-8Z>³\u00001®Û¸°ü\f\u0096Âî\u0005æ\b\u0016\u001cÈRFãÌ\u008aáÞC\u0017+U·]\u0094!1öÈB\u008bò}£ËøÄþ\u001cÔkV\u007f°Õ\u0081Ê\u0088ä)è&2,ÚøÓ·÷\u0086P¨TR}F{ \u0081\u009d5~Ú¹\f[\u008e«;x+\u0084©X3;rö\\L\u0097\u009d²wa÷¡8øÊ\u0018Ös\u0089¿Ë½V\u0081>QâÃG\u0006â\u0002®\u009a\u0011Oñ%¸99¾\u0090:ç\r\u001d\u009cxPÄP\u001ek\u0084H:J}så´#\u00972\u001bz:Ô©Ï\u0005\u0082\u0097¥\u0089\bE#»· \u0093YÄÕ5C\u00adúß\u001e»Á\u009bä4¨\b \u001dE.×8\u0084\u0086C¶\u008aÅ\u008bP.¸o8\u009d\u0014ë$>È×\u0003\u0098· Ó`»µ(\u009fkÛ\u000e*\u0097\u009aZó6âödÜmWúÙ+9\u0097¼\\ª&b\u0018Æ\t\u0096UU÷]\u0083©R×.ï\u0010n/\u0088ùÚ\u0002ð§ï\u008d\u0018_pn\u00177 4dÑ¶N7\u0089òê¦ìWÎ|pgÉ\u008csî;Àv¹QD_áÉ¢1m\u0010øT\u009d³±¥¤ö\u0081#\u008c\u0003{Yø¢";
int var17 = "´¸!xÍ\u001d\u009a¥7ÞY\u0095p\"ï\bx\u0085Èï\f¬×õ³\u0019Æ]âó«\u009d\u0091\u000f\u008dµXC\u001eyÏr·3wÌ;¢üúàl\u000eK\u0081ý\u0010ÔÀ#\u008fóf$\u001b-áa\u0015\u0017¦\u009e÷0\u008c\u001eo\u0088V\u0088;&\u0011%\u0091»2¥\u0082º7\u0005rg¯'\u0083Î7X\u0014ï°]\u008c\u001e\u0088\u0015fý§ï\u008c\u0017Ev)\u0089¡\u001dM¯ \u0095ç¡\b7(</ïC\u0083\u0090ø\n\u00026\u0087î\u009c¹\u0082PUÞMBñ\\\u0013w0\r \u0089\txc¶á|N.\u0095l<4÷çJÝç[\u0013\u009bÕÈ\u0003_\u0085Ïu\u0019ÓÇ\u0011\u0088\u0082Ø9\u0002\u0015åô\u0093ètªXÈ¥ú \u001b\u001e\u0086ã\bn\n(ùVf<yô\"vú1sNÕîÒ BÞ\u001f\u0096<\u0084 h\u009cA\u000f\u0082â\u0018³É÷üà\u0096{øï»\u008d^Eã)[OLb\u0005\u0092¿\u009fL§\u0019f `WT2\fº5\u00ad\u0085\b¹Þ§ü.+zE\u009b±\u0098Ì\bÃ\u001f§0\u001d®1³F\u00913ñ®ÊjyÁ\\\u00980\u0003_r\u008fÕ\u008eM<I\u0004\u001f\u0010¦¼\"ø\u0097bOçKkQ¼^Üó=(\u000eµ§L\u000b¦&ðå\u0081X\u001b\u008d>«\u0005\u0083jI&\u0004zlo\u009c3\u0004¾~Ñüû8þíZYsx-8Z>³\u00001®Û¸°ü\f\u0096Âî\u0005æ\b\u0016\u001cÈRFãÌ\u008aáÞC\u0017+U·]\u0094!1öÈB\u008bò}£ËøÄþ\u001cÔkV\u007f°Õ\u0081Ê\u0088ä)è&2,ÚøÓ·÷\u0086P¨TR}F{ \u0081\u009d5~Ú¹\f[\u008e«;x+\u0084©X3;rö\\L\u0097\u009d²wa÷¡8øÊ\u0018Ös\u0089¿Ë½V\u0081>QâÃG\u0006â\u0002®\u009a\u0011Oñ%¸99¾\u0090:ç\r\u001d\u009cxPÄP\u001ek\u0084H:J}så´#\u00972\u001bz:Ô©Ï\u0005\u0082\u0097¥\u0089\bE#»· \u0093YÄÕ5C\u00adúß\u001e»Á\u009bä4¨\b \u001dE.×8\u0084\u0086C¶\u008aÅ\u008bP.¸o8\u009d\u0014ë$>È×\u0003\u0098· Ó`»µ(\u009fkÛ\u000e*\u0097\u009aZó6âödÜmWúÙ+9\u0097¼\\ª&b\u0018Æ\t\u0096UU÷]\u0083©R×.ï\u0010n/\u0088ùÚ\u0002ð§ï\u008d\u0018_pn\u00177 4dÑ¶N7\u0089òê¦ìWÎ|pgÉ\u008csî;Àv¹QD_áÉ¢1m\u0010øT\u009d³±¥¤ö\u0081#\u008c\u0003{Yø¢"
.length();
char var14 = '8';
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var38 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var24 += var14) >= var17) {
d = var18;
e = new String[17];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[12];
int var3 = 0;
String var4 = "|:f;Q±(³¹\u00951\nûÎÎPëéá\u00128Zÿ\t®ô3Ò\u0099]Û|q\n§i\u001e\u0095\u0018:\u001a!-Q¾/ævÄp\u001a&Îh³=\u0013\u008fÓ\u0012\u0085¡w#\u0088Zsðïb\u0015\u0016ï¨Ä\u0016ù¥vÜ";
int var5 = "|:f;Q±(³¹\u00951\nûÎÎPëéá\u00128Zÿ\t®ô3Ò\u0099]Û|q\n§i\u001e\u0095\u0018:\u001a!-Q¾/ævÄp\u001a&Îh³=\u0013\u008fÓ\u0012\u0085¡w#\u0088Zsðïb\u0015\u0016ï¨Ä\u0016ù¥vÜ"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var45 = -1;

while (true) {
long var8 = var42;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var47 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var45) {
case 0:
var28[var10001] = var47;
if (var2 >= var5) {
g = var6;
h = new Integer[12];
L = new m1();
class_1792 var29 = class_1802.field_8162;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8162, a<"n">(25405, 2518161309834838566L ^ var20));
a = var29;
class_1792 var30 = class_1802.field_8162;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8162, a<"n">(25405, 2518161309834838566L ^ var20));
m = var30;
x = -1;
l = -1;
return;
}
break;
default:
var28[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "¤§âZ\u0086Z>¯\u009a7gºIéîÙ";
var5 = "¤§âZ\u0086Z>¯\u009a7gºIéîÙ".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var42 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var45 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var38;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "Æ\u009b\u008fÏçWð.r´fÀgRi6öÅÅ<Ã$J\u00130\u0093ü6\u0098D\u0004\u009cMPWÖ\u0007Ã2;W¨Ûp>èÿ_\u0010Ám©¶Su\u0006ôØï\u001c7\u0007ÞK\u0017";
var17 = "Æ\u009b\u008fÏçWð.r´fÀgRi6öÅÅ<Ã$J\u00130\u0093ü6\u0098D\u0004\u009cMPWÖ\u0007Ã2;W¨Ûp>èÿ_\u0010Ám©¶Su\u0006ôØï\u001c7\u0007ÞK\u0017".length();
var14 = '0';
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17675;
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
throw new RuntimeException("su/catlean/m1", var10);
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
e[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/m1" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 29976;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/m1", var14);
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
throw new RuntimeException("su/catlean/m1" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
