package su.catlean;

import com.google.common.collect.Queues;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class uc extends _g {
@NotNull
public static final uc Y;
static final KProperty[] X;
@NotNull
private static final cw N;
@NotNull
private static final cw P;
@NotNull
private static final cq j;
@NotNull
private static final cq W;
@NotNull
private static final cq f;
@NotNull
private static final cq w;
@NotNull
private static final cq d;
@NotNull
private static final cq O;
@NotNull
private static final cq J;
@NotNull
private static final cq A;
@NotNull
private static final cq a;
@NotNull
private static final cq L;
@NotNull
private static final cq y;
@NotNull
private static final cq B;
@NotNull
private static final bg V;
@Nullable
private static zl U;
private static int x;
@Nullable
private static _w i;
private static boolean h;
@NotNull
private static final ConcurrentLinkedQueue o;
@NotNull
private static final ConcurrentLinkedQueue S;
@NotNull
private static final bg l;
@NotNull
private static final class_2338[] D;
private static final long b = yz.a(3772004756923701576L, -5245564808337987449L, MethodHandles.lookup().lookupClass()).a(229853068187810L);
private static final String[] c;
private static final String[] e;
private static final Map g = new HashMap(13);
private static final long[] k;
private static final Integer[] m;
private static final Map n;

private uc(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 46903688290603L;
super(b<"q">(6125, 1059938518350726808L ^ var4), jt.V(), null, 4, null, var6);
}

private final fb V(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 54219286797139L;
return (fb)N.E(this, var6, X[0]);
}

private final mq l(int var1, char var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 94092848684725L;
return (mq)P.E(this, var6, X[1]);
}

private final boolean p(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 65287210546831L;
return (Boolean)j.E(this, var3, X[2]);
}

private final boolean q(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 106402708048692L;
return (Boolean)W.E(this, var3, X[3]);
}

private final boolean T(char var1, long var2) {
long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
long var6 = var4 ^ 65738491324199L;
return (Boolean)f.E(this, var6, X[4]);
}

private final boolean B(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 104355340807493L;
return (Boolean)w.E(this, var3, X[5]);
}

private final boolean h(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 120859640392367L;
return (Boolean)d.E(this, var3, X[c<"t">(389, 8974552529878214616L ^ var1)]);
}

private final boolean R(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 109940413242686L;
return (Boolean)O.E(this, var3, X[c<"t">(15422, 8763493532816682474L ^ var1)]);
}

private final boolean A(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 72760302051487L;
return (Boolean)J.E(this, var3, X[c<"t">(26624, 8486154664087307363L ^ var1)]);
}

private final boolean F(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 112410782768354L;
return (Boolean)A.E(this, var3, X[c<"t">(5290, 3789975965775856824L ^ var1)]);
}

private final boolean n(short var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 76831457664490L;
return (Boolean)a.E(this, var6, X[c<"t">(3335, 7584629707654257665L ^ var4)]);
}

private final boolean H(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 20606148711766L;
return (Boolean)L.E(this, var3, X[c<"t">(13236, 431316418137041432L ^ var1)]);
}

private final boolean M(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 91335060259258L;
return (Boolean)y.E(this, var3, X[c<"t">(23117, 4891796329879721743L ^ var1)]);
}

private final boolean D(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 122544703295073L;
return (Boolean)B.E(this, var3, X[c<"t">(26574, 7915669710445192536L ^ var1)]);
}

@Override
public void O(long var1) {
x = c<"t">(11303, 1385161315789851072L ^ var1);
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
// 02: ldc2_w 64129331416845
// 05: lxor
// 06: lstore 3
// 07: dup2
// 08: ldc2_w 44030506242343
// 0b: lxor
// 0c: dup2
// 0d: bipush 48
// 0f: lushr
// 10: l2i
// 11: istore 5
// 13: dup2
// 14: bipush 16
// 16: lshl
// 17: bipush 32
// 19: lushr
// 1a: l2i
// 1b: istore 6
// 1d: dup2
// 1e: bipush 48
// 20: lshl
// 21: bipush 48
// 23: lushr
// 24: l2i
// 25: istore 7
// 27: pop2
// 28: pop2
// 29: ldc2_w 1419675369082839990
// 2c: lload 1
// 2d: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: astore 8
// 34: aload 8
// 36: ifnull 99
// 39: getstatic su/catlean/uc.h Z
// 3c: ifeq 95
// 3f: goto 4c
// 42: ldc2_w 1418835501930229176
// 45: lload 1
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: lload 1
// 4d: lconst_0
// 4e: lcmp
// 4f: ifle 99
// 52: iload 5
// 54: i2s
// 55: iload 6
// 57: iload 7
// 59: i2c
// 5a: sipush 11437
// 5d: ldc2_w 480356093397663256
// 60: lload 1
// 61: lxor
// 62: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: invokestatic su/catlean/bx.k (SICI)Z
// 6a: ifne 95
// 6d: goto 7a
// 70: ldc2_w 1418835501930229176
// 73: lload 1
// 74: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79: athrow
// 7a: lload 3
// 7b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 7e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 81: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 84: bipush 0
// 85: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 88: goto 95
// 8b: ldc2_w 1418835501930229176
// 8e: lload 1
// 8f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94: athrow
// 95: aload 0
// 96: invokespecial su/catlean/uc.z ()V
// 99: return
}

@Flow(
priority = -10
)
private final void t(PlayerUpdateEvent var1) {
long var2 = b ^ 30069639042138L;
long var4 = var2 ^ 52716773914972L;
this.E(var4);
}

private final void E(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uc.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 117176628559464
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
// 01d: ldc2_w 108529215194159
// 020: lxor
// 021: lstore 6
// 023: dup2
// 024: ldc2_w 12954594541774
// 027: lxor
// 028: lstore 8
// 02a: dup2
// 02b: ldc2_w 103664022167793
// 02e: lxor
// 02f: lstore 10
// 031: dup2
// 032: ldc2_w 33228378768198
// 035: lxor
// 036: lstore 12
// 038: dup2
// 039: ldc2_w 121654137207925
// 03c: lxor
// 03d: lstore 14
// 03f: dup2
// 040: ldc2_w 102738200196859
// 043: lxor
// 044: lstore 16
// 046: dup2
// 047: ldc2_w 10854257704553
// 04a: lxor
// 04b: lstore 18
// 04d: dup2
// 04e: ldc2_w 3109222572450
// 051: lxor
// 052: lstore 20
// 054: dup2
// 055: ldc2_w 88366898894688
// 058: lxor
// 059: lstore 22
// 05b: dup2
// 05c: ldc2_w 121139012663658
// 05f: lxor
// 060: lstore 24
// 062: dup2
// 063: ldc2_w 3308371507321
// 066: lxor
// 067: lstore 26
// 069: dup2
// 06a: ldc2_w 10505391901228
// 06d: lxor
// 06e: lstore 28
// 070: dup2
// 071: ldc2_w 91521966482813
// 074: lxor
// 075: dup2
// 076: bipush 16
// 078: lushr
// 079: lstore 30
// 07b: dup2
// 07c: bipush 48
// 07e: lshl
// 07f: bipush 48
// 081: lushr
// 082: l2i
// 083: istore 32
// 085: pop2
// 086: dup2
// 087: ldc2_w 45607143780431
// 08a: lxor
// 08b: lstore 33
// 08d: dup2
// 08e: ldc2_w 104867154667417
// 091: lxor
// 092: lstore 35
// 094: dup2
// 095: ldc2_w 7132751387368
// 098: lxor
// 099: dup2
// 09a: bipush 48
// 09c: lushr
// 09d: l2i
// 09e: istore 37
// 0a0: dup2
// 0a1: bipush 16
// 0a3: lshl
// 0a4: bipush 16
// 0a6: lushr
// 0a7: lstore 38
// 0a9: pop2
// 0aa: dup2
// 0ab: ldc2_w 90991028794286
// 0ae: lxor
// 0af: lstore 40
// 0b1: dup2
// 0b2: ldc2_w 115400916837068
// 0b5: lxor
// 0b6: lstore 42
// 0b8: dup2
// 0b9: ldc2_w 132180498333616
// 0bc: lxor
// 0bd: lstore 44
// 0bf: dup2
// 0c0: ldc2_w 42912424891777
// 0c3: lxor
// 0c4: lstore 46
// 0c6: dup2
// 0c7: ldc2_w 14271088223900
// 0ca: lxor
// 0cb: dup2
// 0cc: bipush 32
// 0ce: lushr
// 0cf: l2i
// 0d0: istore 48
// 0d2: dup2
// 0d3: bipush 32
// 0d5: lshl
// 0d6: bipush 48
// 0d8: lushr
// 0d9: l2i
// 0da: istore 49
// 0dc: dup2
// 0dd: bipush 48
// 0df: lshl
// 0e0: bipush 48
// 0e2: lushr
// 0e3: l2i
// 0e4: istore 50
// 0e6: pop2
// 0e7: dup2
// 0e8: ldc2_w 140297346850128
// 0eb: lxor
// 0ec: lstore 51
// 0ee: dup2
// 0ef: ldc2_w 66251385419845
// 0f2: lxor
// 0f3: lstore 53
// 0f5: dup2
// 0f6: ldc2_w 109248020500618
// 0f9: lxor
// 0fa: lstore 55
// 0fc: dup2
// 0fd: ldc2_w 14856196025546
// 100: lxor
// 101: lstore 57
// 103: dup2
// 104: ldc2_w 100648174887213
// 107: lxor
// 108: lstore 59
// 10a: dup2
// 10b: ldc2_w 72668677885501
// 10e: lxor
// 10f: dup2
// 110: bipush 16
// 112: lushr
// 113: lstore 61
// 115: dup2
// 116: bipush 48
// 118: lshl
// 119: bipush 48
// 11b: lushr
// 11c: l2i
// 11d: istore 63
// 11f: pop2
// 120: dup2
// 121: ldc2_w 51715304597657
// 124: lxor
// 125: lstore 64
// 127: pop2
// 128: ldc2_w 7850231616282795252
// 12b: lload 1
// 12c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: astore 71
// 133: lload 33
// 135: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 138: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 13b: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 13e: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 141: aload 71
// 143: ifnull 1b7
// 146: ifeq 1a9
// 149: goto 156
// 14c: ldc2_w 7850517930878817018
// 14f: lload 1
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 159: invokevirtual su/catlean/dm.o ()D
// 15c: dconst_0
// 15d: dcmpg
// 15e: aload 71
// 160: ifnull 1b7
// 163: goto 170
// 166: ldc2_w 7850517930878817018
// 169: lload 1
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: ifgt 1a9
// 173: goto 180
// 176: ldc2_w 7850517930878817018
// 179: lload 1
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: aload 0
// 181: lload 10
// 183: invokespecial su/catlean/uc.R (J)Z
// 186: aload 71
// 188: ifnull 1b7
// 18b: goto 198
// 18e: ldc2_w 7850517930878817018
// 191: lload 1
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: ifeq 1a9
// 19b: goto 1a8
// 19e: ldc2_w 7850517930878817018
// 1a1: lload 1
// 1a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: athrow
// 1a8: return
// 1a9: aconst_null
// 1aa: putstatic su/catlean/uc.U Lsu/catlean/zl;
// 1ad: aload 0
// 1ae: lload 61
// 1b0: bipush 0
// 1b1: iload 63
// 1b3: i2c
// 1b4: invokespecial su/catlean/uc.A (JZC)I
// 1b7: istore 72
// 1b9: aload 0
// 1ba: lload 16
// 1bc: invokespecial su/catlean/uc.q (J)Z
// 1bf: aload 71
// 1c1: ifnull 231
// 1c4: ifne 22f
// 1c7: goto 1d4
// 1ca: ldc2_w 7850517930878817018
// 1cd: lload 1
// 1ce: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: athrow
// 1d4: lload 18
// 1d6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d9: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 1dc: aload 71
// 1de: ifnull 231
// 1e1: goto 1ee
// 1e4: ldc2_w 7850517930878817018
// 1e7: lload 1
// 1e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ed: athrow
// 1ee: ifeq 22f
// 1f1: goto 1fe
// 1f4: ldc2_w 7850517930878817018
// 1f7: lload 1
// 1f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: athrow
// 1fe: aload 0
// 1ff: iload 37
// 201: i2c
// 202: lload 38
// 204: invokespecial su/catlean/uc.T (CJ)Z
// 207: aload 71
// 209: lload 1
// 20a: lconst_0
// 20b: lcmp
// 20c: ifle 233
// 20f: ifnull 231
// 212: goto 21f
// 215: ldc2_w 7850517930878817018
// 218: lload 1
// 219: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21e: athrow
// 21f: ifeq 24d
// 222: goto 22f
// 225: ldc2_w 7850517930878817018
// 228: lload 1
// 229: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: athrow
// 22f: iload 72
// 231: aload 71
// 233: lload 1
// 234: lconst_0
// 235: lcmp
// 236: ifle 268
// 239: ifnull 266
// 23c: bipush -1
// 23d: if_icmpne 258
// 240: goto 24d
// 243: ldc2_w 7850517930878817018
// 246: lload 1
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: return
// 24e: ldc2_w 7850517930878817018
// 251: lload 1
// 252: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 257: athrow
// 258: lload 33
// 25a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 25d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 260: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 263: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 266: aload 71
// 268: ifnull 2e5
// 26b: ifeq 2ca
// 26e: goto 27b
// 271: ldc2_w 7850517930878817018
// 274: lload 1
// 275: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27a: athrow
// 27b: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 27e: lload 20
// 280: invokevirtual su/catlean/dm.Y (J)Z
// 283: aload 71
// 285: lload 1
// 286: lconst_0
// 287: lcmp
// 288: iflt 2e7
// 28b: ifnull 2e5
// 28e: goto 29b
// 291: ldc2_w 7850517930878817018
// 294: lload 1
// 295: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29a: athrow
// 29b: ifne 2ca
// 29e: goto 2ab
// 2a1: ldc2_w 7850517930878817018
// 2a4: lload 1
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: lload 18
// 2ad: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2b0: invokevirtual net/minecraft/class_746.method_23318 ()D
// 2b3: bipush 1
// 2b4: i2d
// 2b5: dsub
// 2b6: invokestatic java/lang/Math.floor (D)D
// 2b9: d2i
// 2ba: putstatic su/catlean/uc.x I
// 2bd: goto 2ca
// 2c0: ldc2_w 7850517930878817018
// 2c3: lload 1
// 2c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c9: athrow
// 2ca: aload 0
// 2cb: lload 18
// 2cd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2d0: iload 3
// 2d1: i2b
// 2d2: swap
// 2d3: lload 4
// 2d5: dup2_x1
// 2d6: pop2
// 2d7: checkcast net/minecraft/class_1297
// 2da: invokevirtual su/catlean/uc.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 2dd: getfield net/minecraft/class_243.field_1351 D
// 2e0: getstatic su/catlean/uc.x I
// 2e3: i2d
// 2e4: dcmpg
// 2e5: aload 71
// 2e7: ifnull 322
// 2ea: ifge 317
// 2ed: goto 2fa
// 2f0: ldc2_w 7850517930878817018
// 2f3: lload 1
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: sipush 28006
// 2fd: ldc2_w 8057392742358007947
// 300: lload 1
// 301: lxor
// 302: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 307: putstatic su/catlean/uc.x I
// 30a: goto 317
// 30d: ldc2_w 7850517930878817018
// 310: lload 1
// 311: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: athrow
// 317: aload 0
// 318: lload 30
// 31a: iload 72
// 31c: iload 32
// 31e: i2s
// 31f: invokespecial su/catlean/uc.C (JIS)Z
// 322: istore 73
// 324: iload 73
// 326: ifeq 33e
// 329: lload 18
// 32b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 32e: invokevirtual net/minecraft/class_746.method_23318 ()D
// 331: goto 349
// 334: ldc2_w 7850517930878817018
// 337: lload 1
// 338: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: athrow
// 33e: lload 18
// 340: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 343: invokevirtual net/minecraft/class_746.method_23318 ()D
// 346: invokestatic java/lang/Math.ceil (D)D
// 349: dstore 74
// 34b: aload 0
// 34c: lload 64
// 34e: invokespecial su/catlean/uc.H (J)Z
// 351: aload 71
// 353: ifnull 397
// 356: ifne 394
// 359: goto 366
// 35c: ldc2_w 7850517930878817018
// 35f: lload 1
// 360: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 365: athrow
// 366: aload 0
// 367: lload 10
// 369: invokespecial su/catlean/uc.R (J)Z
// 36c: lload 1
// 36d: lconst_0
// 36e: lcmp
// 36f: iflt 397
// 372: aload 71
// 374: ifnull 397
// 377: goto 384
// 37a: ldc2_w 7850517930878817018
// 37d: lload 1
// 37e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 383: athrow
// 384: ifeq 3cb
// 387: goto 394
// 38a: ldc2_w 7850517930878817018
// 38d: lload 1
// 38e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 393: athrow
// 394: getstatic su/catlean/uc.x I
// 397: sipush 28006
// 39a: ldc2_w 8057392742358007947
// 39d: lload 1
// 39e: lxor
// 39f: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a4: if_icmpeq 3cb
// 3a7: lload 18
// 3a9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3ac: invokevirtual net/minecraft/class_746.method_23317 ()D
// 3af: getstatic su/catlean/uc.x I
// 3b2: i2d
// 3b3: lload 18
// 3b5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3b8: invokevirtual net/minecraft/class_746.method_23321 ()D
// 3bb: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 3be: goto 3e3
// 3c1: ldc2_w 7850517930878817018
// 3c4: lload 1
// 3c5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ca: athrow
// 3cb: lload 18
// 3cd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3d0: invokevirtual net/minecraft/class_746.method_23317 ()D
// 3d3: dload 74
// 3d5: lload 18
// 3d7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3da: invokevirtual net/minecraft/class_746.method_23321 ()D
// 3dd: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 3e0: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 3e3: astore 77
// 3e5: aload 77
// 3e7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 3ea: aload 77
// 3ec: astore 76
// 3ee: aload 0
// 3ef: aload 71
// 3f1: ifnull 425
// 3f4: lload 59
// 3f6: invokespecial su/catlean/uc.F (J)Z
// 3f9: ifeq 424
// 3fc: goto 409
// 3ff: ldc2_w 7850517930878817018
// 402: lload 1
// 403: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 408: athrow
// 409: new su/catlean/zl
// 40c: dup
// 40d: aload 76
// 40f: lload 12
// 411: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 414: invokespecial su/catlean/zl.<init> (Lnet/minecraft/class_2338;JLnet/minecraft/class_2350;)V
// 417: goto 42c
// 41a: ldc2_w 7850517930878817018
// 41d: lload 1
// 41e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 423: athrow
// 424: aload 0
// 425: aload 76
// 427: lload 6
// 429: invokespecial su/catlean/uc.V (Lnet/minecraft/class_2338;J)Lsu/catlean/zl;
// 42c: putstatic su/catlean/uc.U Lsu/catlean/zl;
// 42f: aload 0
// 430: lload 1
// 431: lconst_0
// 432: lcmp
// 433: ifle 572
// 436: aload 71
// 438: ifnull 572
// 43b: lload 16
// 43d: invokespecial su/catlean/uc.q (J)Z
// 440: ifeq 571
// 443: goto 450
// 446: ldc2_w 7850517930878817018
// 449: lload 1
// 44a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44f: athrow
// 450: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 453: lload 20
// 455: invokevirtual su/catlean/dm.Y (J)Z
// 458: aload 71
// 45a: lload 1
// 45b: lconst_0
// 45c: lcmp
// 45d: iflt 497
// 460: ifnull 495
// 463: goto 470
// 466: ldc2_w 7850517930878817018
// 469: lload 1
// 46a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46f: athrow
// 470: ifeq 571
// 473: goto 480
// 476: ldc2_w 7850517930878817018
// 479: lload 1
// 47a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47f: athrow
// 480: lload 18
// 482: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 485: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 488: goto 495
// 48b: ldc2_w 7850517930878817018
// 48e: lload 1
// 48f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 494: athrow
// 495: aload 71
// 497: ifnull 507
// 49a: ifne 4ff
// 49d: goto 4aa
// 4a0: ldc2_w 7850517930878817018
// 4a3: lload 1
// 4a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a9: athrow
// 4aa: lload 8
// 4ac: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 4af: aload 76
// 4b1: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 4b4: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 4b7: aload 71
// 4b9: lload 1
// 4ba: lconst_0
// 4bb: lcmp
// 4bc: iflt 509
// 4bf: ifnull 507
// 4c2: goto 4cf
// 4c5: ldc2_w 7850517930878817018
// 4c8: lload 1
// 4c9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ce: athrow
// 4cf: ifeq 4ff
// 4d2: goto 4df
// 4d5: ldc2_w 7850517930878817018
// 4d8: lload 1
// 4d9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4de: athrow
// 4df: lload 33
// 4e1: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4e4: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 4e7: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 4ea: bipush 1
// 4eb: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 4ee: bipush 1
// 4ef: putstatic su/catlean/uc.h Z
// 4f2: goto 4ff
// 4f5: ldc2_w 7850517930878817018
// 4f8: lload 1
// 4f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fe: athrow
// 4ff: lload 18
// 501: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 504: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 507: aload 71
// 509: lload 1
// 50a: lconst_0
// 50b: lcmp
// 50c: ifle 53e
// 50f: ifnull 53c
// 512: ifeq 571
// 515: goto 522
// 518: ldc2_w 7850517930878817018
// 51b: lload 1
// 51c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 521: athrow
// 522: lload 8
// 524: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 527: aload 76
// 529: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 52c: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 52f: goto 53c
// 532: ldc2_w 7850517930878817018
// 535: lload 1
// 536: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53b: athrow
// 53c: aload 71
// 53e: ifnull 56e
// 541: ifne 571
// 544: goto 551
// 547: ldc2_w 7850517930878817018
// 54a: lload 1
// 54b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 550: athrow
// 551: lload 33
// 553: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 556: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 559: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 55c: bipush 0
// 55d: invokevirtual net/minecraft/class_304.method_23481 (Z)V
// 560: bipush 0
// 561: goto 56e
// 564: ldc2_w 7850517930878817018
// 567: lload 1
// 568: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56d: athrow
// 56e: putstatic su/catlean/uc.h Z
// 571: aload 0
// 572: iload 48
// 574: iload 49
// 576: i2c
// 577: iload 50
// 579: invokespecial su/catlean/uc.V (ICI)Lsu/catlean/fb;
// 57c: getstatic su/catlean/fb.VANILLA Lsu/catlean/fb;
// 57f: if_acmpne 592
// 582: ldc2_w -0.1
// 585: goto 595
// 588: ldc2_w 7850517930878817018
// 58b: lload 1
// 58c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 591: athrow
// 592: ldc2_w -0.25
// 595: dstore 77
// 597: getstatic su/catlean/uc.U Lsu/catlean/zl;
// 59a: astore 79
// 59c: lload 1
// 59d: lconst_0
// 59e: lcmp
// 59f: iflt 9a4
// 5a2: aload 79
// 5a4: ifnull 9a4
// 5a7: aload 0
// 5a8: lload 55
// 5aa: invokespecial su/catlean/uc.B (J)Z
// 5ad: aload 71
// 5af: ifnull 60e
// 5b2: goto 5bf
// 5b5: ldc2_w 7850517930878817018
// 5b8: lload 1
// 5b9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5be: athrow
// 5bf: ifeq 611
// 5c2: goto 5cf
// 5c5: ldc2_w 7850517930878817018
// 5c8: lload 1
// 5c9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ce: athrow
// 5cf: lload 8
// 5d1: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 5d4: lload 18
// 5d6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5d9: checkcast net/minecraft/class_1297
// 5dc: lload 18
// 5de: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5e1: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 5e4: dload 77
// 5e6: dconst_0
// 5e7: dload 77
// 5e9: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 5ec: dconst_0
// 5ed: ldc2_w -0.1
// 5f0: dconst_0
// 5f1: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 5f4: invokevirtual net/minecraft/class_638.method_20812 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/lang/Iterable;
// 5f7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 5fc: invokeinterface java/util/Iterator.hasNext ()Z 1
// 601: goto 60e
// 604: ldc2_w 7850517930878817018
// 607: lload 1
// 608: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60d: athrow
// 60e: ifne 9a4
// 611: aload 79
// 613: invokevirtual su/catlean/zl.v ()Lnet/minecraft/class_2338;
// 616: astore 80
// 618: aload 79
// 61a: invokevirtual su/catlean/zl.p ()Lnet/minecraft/class_2350;
// 61d: astore 81
// 61f: new kotlin/jvm/internal/Ref$ObjectRef
// 622: dup
// 623: invokespecial kotlin/jvm/internal/Ref$ObjectRef.<init> ()V
// 626: astore 82
// 628: aload 82
// 62a: new net/minecraft/class_3965
// 62d: dup
// 62e: aload 80
// 630: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 633: new net/minecraft/class_243
// 636: dup
// 637: aload 81
// 639: invokevirtual net/minecraft/class_2350.method_23955 ()Lorg/joml/Vector3f;
// 63c: checkcast org/joml/Vector3fc
// 63f: invokespecial net/minecraft/class_243.<init> (Lorg/joml/Vector3fc;)V
// 642: ldc2_w 0.5
// 645: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 648: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 64b: aload 81
// 64d: aload 80
// 64f: bipush 0
// 650: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 653: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 656: lload 18
// 658: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 65b: invokevirtual net/minecraft/class_746.method_23318 ()D
// 65e: lload 18
// 660: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 663: invokevirtual net/minecraft/class_746.method_23318 ()D
// 666: invokestatic java/lang/Math.floor (D)D
// 669: dsub
// 66a: ldc2_w 0.5
// 66d: dcmpg
// 66e: aload 71
// 670: ifnull 684
// 673: ifne 687
// 676: goto 683
// 679: ldc2_w 7850517930878817018
// 67c: lload 1
// 67d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 682: athrow
// 683: bipush 1
// 684: goto 688
// 687: bipush 0
// 688: ifeq 69b
// 68b: ldc2_w 0.39
// 68e: goto 6b1
// 691: ldc2_w 7850517930878817018
// 694: lload 1
// 695: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69a: athrow
// 69b: ldc2_w 0.82
// 69e: dconst_0
// 69f: ldc2_w 0.16
// 6a2: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 6a5: checkcast kotlin/ranges/ClosedRange
// 6a8: bipush 0
// 6a9: bipush 2
// 6aa: aconst_null
// 6ab: lload 42
// 6ad: invokestatic su/catlean/mf.k (Lkotlin/ranges/ClosedRange;ZILjava/lang/Object;J)D
// 6b0: dadd
// 6b1: dstore 83
// 6b3: aload 0
// 6b4: aload 71
// 6b6: ifnull 720
// 6b9: lload 51
// 6bb: invokespecial su/catlean/uc.A (J)Z
// 6be: ifeq 71b
// 6c1: goto 6ce
// 6c4: ldc2_w 7850517930878817018
// 6c7: lload 1
// 6c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cd: athrow
// 6ce: lload 18
// 6d0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6d3: invokevirtual net/minecraft/class_746.method_23317 ()D
// 6d6: ldc2_w -0.01
// 6d9: ldc2_w 0.01
// 6dc: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 6df: checkcast kotlin/ranges/ClosedRange
// 6e2: bipush 0
// 6e3: bipush 2
// 6e4: aconst_null
// 6e5: lload 42
// 6e7: invokestatic su/catlean/mf.k (Lkotlin/ranges/ClosedRange;ZILjava/lang/Object;J)D
// 6ea: dadd
// 6eb: aload 82
// 6ed: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 6f0: checkcast net/minecraft/class_3965
// 6f3: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 6f6: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 6f9: i2d
// 6fa: aload 82
// 6fc: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 6ff: checkcast net/minecraft/class_3965
// 702: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 705: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 708: i2d
// 709: dconst_1
// 70a: dadd
// 70b: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 70e: goto 729
// 711: ldc2_w 7850517930878817018
// 714: lload 1
// 715: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71a: athrow
// 71b: aload 82
// 71d: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 720: checkcast net/minecraft/class_3965
// 723: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 726: getfield net/minecraft/class_243.field_1352 D
// 729: dstore 85
// 72b: aload 0
// 72c: aload 71
// 72e: ifnull 798
// 731: lload 51
// 733: invokespecial su/catlean/uc.A (J)Z
// 736: ifeq 793
// 739: goto 746
// 73c: ldc2_w 7850517930878817018
// 73f: lload 1
// 740: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 745: athrow
// 746: lload 18
// 748: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 74b: invokevirtual net/minecraft/class_746.method_23321 ()D
// 74e: ldc2_w -0.01
// 751: ldc2_w 0.01
// 754: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 757: checkcast kotlin/ranges/ClosedRange
// 75a: bipush 0
// 75b: bipush 2
// 75c: aconst_null
// 75d: lload 42
// 75f: invokestatic su/catlean/mf.k (Lkotlin/ranges/ClosedRange;ZILjava/lang/Object;J)D
// 762: dadd
// 763: aload 82
// 765: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 768: checkcast net/minecraft/class_3965
// 76b: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 76e: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 771: i2d
// 772: aload 82
// 774: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 777: checkcast net/minecraft/class_3965
// 77a: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 77d: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 780: i2d
// 781: dconst_1
// 782: dadd
// 783: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
// 786: goto 7a1
// 789: ldc2_w 7850517930878817018
// 78c: lload 1
// 78d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 792: athrow
// 793: aload 82
// 795: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 798: checkcast net/minecraft/class_3965
// 79b: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 79e: getfield net/minecraft/class_243.field_1350 D
// 7a1: dstore 87
// 7a3: aload 82
// 7a5: new net/minecraft/class_3965
// 7a8: dup
// 7a9: new net/minecraft/class_243
// 7ac: dup
// 7ad: dload 85
// 7af: aload 80
// 7b1: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 7b4: i2d
// 7b5: dload 83
// 7b7: dadd
// 7b8: dload 87
// 7ba: invokespecial net/minecraft/class_243.<init> (DDD)V
// 7bd: aload 81
// 7bf: aload 80
// 7c1: bipush 0
// 7c2: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 7c5: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 7c8: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 7cb: aload 82
// 7cd: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 7d0: checkcast net/minecraft/class_3965
// 7d3: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 7d6: dup
// 7d7: sipush 11606
// 7da: ldc2_w 6080660606425063649
// 7dd: lload 1
// 7de: lxor
// 7df: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/uc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7e7: lload 24
// 7e9: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 7ec: astore 89
// 7ee: aload 0
// 7ef: lload 14
// 7f1: invokespecial su/catlean/uc.M (J)Z
// 7f4: aload 71
// 7f6: ifnull 88d
// 7f9: ifeq 887
// 7fc: goto 809
// 7ff: ldc2_w 7850517930878817018
// 802: lload 1
// 803: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 808: athrow
// 809: aload 0
// 80a: lload 40
// 80c: invokespecial su/catlean/uc.D (J)Z
// 80f: aload 71
// 811: lload 1
// 812: lconst_0
// 813: lcmp
// 814: iflt 895
// 817: ifnull 88d
// 81a: goto 827
// 81d: ldc2_w 7850517930878817018
// 820: lload 1
// 821: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 826: athrow
// 827: ifeq 887
// 82a: goto 837
// 82d: ldc2_w 7850517930878817018
// 830: lload 1
// 831: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 836: athrow
// 837: new net/minecraft/class_2828$class_2830
// 83a: dup
// 83b: lload 18
// 83d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 840: invokevirtual net/minecraft/class_746.method_23317 ()D
// 843: lload 18
// 845: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 848: invokevirtual net/minecraft/class_746.method_23318 ()D
// 84b: lload 18
// 84d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 850: invokevirtual net/minecraft/class_746.method_23321 ()D
// 853: aload 89
// 855: invokevirtual su/catlean/_w.q ()F
// 858: aload 89
// 85a: invokevirtual su/catlean/_w.N ()F
// 85d: lload 18
// 85f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 862: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 865: lload 18
// 867: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 86a: getfield net/minecraft/class_746.field_5976 Z
// 86d: invokespecial net/minecraft/class_2828$class_2830.<init> (DDDFFZZ)V
// 870: checkcast net/minecraft/class_2596
// 873: lload 28
// 875: dup2_x1
// 876: pop2
// 877: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 87a: goto 887
// 87d: ldc2_w 7850517930878817018
// 880: lload 1
// 881: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 886: athrow
// 887: aload 0
// 888: lload 14
// 88a: invokespecial su/catlean/uc.M (J)Z
// 88d: lload 1
// 88e: lconst_0
// 88f: lcmp
// 890: iflt 8bb
// 893: aload 71
// 895: ifnull 8bb
// 898: ifeq 8be
// 89b: goto 8a8
// 89e: ldc2_w 7850517930878817018
// 8a1: lload 1
// 8a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a7: athrow
// 8a8: aload 0
// 8a9: lload 40
// 8ab: invokespecial su/catlean/uc.D (J)Z
// 8ae: goto 8bb
// 8b1: ldc2_w 7850517930878817018
// 8b4: lload 1
// 8b5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8ba: athrow
// 8bb: ifeq 8f6
// 8be: new su/catlean/_w
// 8c1: dup
// 8c2: lload 18
// 8c4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8c7: invokevirtual net/minecraft/class_746.method_36454 ()F
// 8ca: lload 18
// 8cc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8cf: invokevirtual net/minecraft/class_746.method_36455 ()F
// 8d2: lload 57
// 8d4: dup2_x1
// 8d5: pop2
// 8d6: bipush 0
// 8d7: aconst_null
// 8d8: sipush 23117
// 8db: ldc2_w 4891755415778326455
// 8de: lload 1
// 8df: lxor
// 8e0: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e5: aconst_null
// 8e6: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 8e9: goto 8f8
// 8ec: ldc2_w 7850517930878817018
// 8ef: lload 1
// 8f0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f5: athrow
// 8f6: aload 89
// 8f8: astore 90
// 8fa: aload 0
// 8fb: iload 48
// 8fd: iload 49
// 8ff: i2c
// 900: iload 50
// 902: invokespecial su/catlean/uc.V (ICI)Lsu/catlean/fb;
// 905: getstatic su/catlean/x2.N [I
// 908: swap
// 909: invokevirtual su/catlean/fb.ordinal ()I
// 90c: iaload
// 90d: tableswitch 115 1 3 27 61 88
// 928: new su/catlean/t5
// 92b: dup
// 92c: aload 90
// 92e: lload 26
// 930: bipush 0
// 931: aload 82
// 933: invokedynamic invoke (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/uc.y (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 938: bipush 2
// 939: aconst_null
// 93a: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 93d: goto 988
// 940: ldc2_w 7850517930878817018
// 943: lload 1
// 944: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 949: athrow
// 94a: new su/catlean/tu
// 94d: dup
// 94e: aload 90
// 950: lload 44
// 952: bipush 0
// 953: aload 82
// 955: invokedynamic invoke (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/uc.M (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 95a: bipush 2
// 95b: aconst_null
// 95c: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 95f: checkcast su/catlean/t5
// 962: goto 988
// 965: new su/catlean/ty
// 968: dup
// 969: aload 90
// 96b: bipush 0
// 96c: aload 82
// 96e: invokedynamic invoke (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/uc.w (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 973: lload 53
// 975: bipush 2
// 976: aconst_null
// 977: invokespecial su/catlean/ty.<init> (Lsu/catlean/_w;ILkotlin/jvm/functions/Function0;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 97a: checkcast su/catlean/t5
// 97d: goto 988
// 980: new kotlin/NoWhenBranchMatchedException
// 983: dup
// 984: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 987: athrow
// 988: astore 91
// 98a: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 98d: lload 46
// 98f: aload 91
// 991: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 994: aload 89
// 996: putstatic su/catlean/uc.i Lsu/catlean/_w;
// 999: lload 1
// 99a: lconst_0
// 99b: lcmp
// 99c: ifle 9a4
// 99f: aload 71
// 9a1: ifnonnull a6f
// 9a4: getstatic su/catlean/uc.i Lsu/catlean/_w;
// 9a7: ifnull a6f
// 9aa: goto 9b7
// 9ad: ldc2_w 7850517930878817018
// 9b0: lload 1
// 9b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b6: athrow
// 9b7: aload 0
// 9b8: lload 22
// 9ba: invokespecial su/catlean/uc.h (J)Z
// 9bd: ifeq a6f
// 9c0: goto 9cd
// 9c3: ldc2_w 7850517930878817018
// 9c6: lload 1
// 9c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9cc: athrow
// 9cd: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 9d0: aload 0
// 9d1: lload 14
// 9d3: invokespecial su/catlean/uc.M (J)Z
// 9d6: lload 1
// 9d7: lconst_0
// 9d8: lcmp
// 9d9: iflt a11
// 9dc: aload 71
// 9de: ifnull a11
// 9e1: goto 9ee
// 9e4: ldc2_w 7850517930878817018
// 9e7: lload 1
// 9e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9ed: athrow
// 9ee: ifeq a28
// 9f1: goto 9fe
// 9f4: ldc2_w 7850517930878817018
// 9f7: lload 1
// 9f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9fd: athrow
// 9fe: aload 0
// 9ff: lload 40
// a01: invokespecial su/catlean/uc.D (J)Z
// a04: goto a11
// a07: ldc2_w 7850517930878817018
// a0a: lload 1
// a0b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a10: athrow
// a11: ifne a28
// a14: getstatic su/catlean/uc.i Lsu/catlean/_w;
// a17: dup
// a18: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// a1b: goto a53
// a1e: ldc2_w 7850517930878817018
// a21: lload 1
// a22: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a27: athrow
// a28: new su/catlean/_w
// a2b: dup
// a2c: lload 18
// a2e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// a31: invokevirtual net/minecraft/class_746.method_36454 ()F
// a34: lload 18
// a36: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// a39: invokevirtual net/minecraft/class_746.method_36455 ()F
// a3c: lload 57
// a3e: dup2_x1
// a3f: pop2
// a40: bipush 0
// a41: aconst_null
// a42: sipush 23117
// a45: ldc2_w 4891755415778326455
// a48: lload 1
// a49: lxor
// a4a: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a4f: aconst_null
// a50: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// a53: bipush 0
// a54: bipush 2
// a55: aconst_null
// a56: astore 66
// a58: istore 67
// a5a: istore 68
// a5c: astore 69
// a5e: astore 70
// a60: lload 35
// a62: aload 70
// a64: aload 69
// a66: iload 68
// a68: iload 67
// a6a: aload 66
// a6c: invokestatic su/catlean/_8.C (JLsu/catlean/_8;Lsu/catlean/_w;IILjava/lang/Object;)V
// a6f: return
}

private final boolean C(long param1, int param3, short param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: bipush 16
// 003: lshl
// 004: iload 4
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 48
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/uc.b J
// 011: lxor
// 012: lstore 5
// 014: lload 5
// 016: dup2
// 017: ldc2_w 18880582629758
// 01a: lxor
// 01b: lstore 7
// 01d: dup2
// 01e: ldc2_w 21152517228505
// 021: lxor
// 022: lstore 9
// 024: pop2
// 025: ldc2_w 6143396922997187908
// 028: lload 5
// 02a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: astore 11
// 031: iload 3
// 032: sipush 2836
// 035: ldc2_w 5178621470974779216
// 038: lload 5
// 03a: lxor
// 03b: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: aload 11
// 042: ifnull 0e0
// 045: if_icmpne 0cb
// 048: goto 056
// 04b: ldc2_w 6143682389327997770
// 04e: lload 5
// 050: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: athrow
// 056: lload 9
// 058: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05b: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 05e: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 061: instanceof net/minecraft/class_1747
// 064: aload 11
// 066: ifnull 161
// 069: goto 077
// 06c: ldc2_w 6143682389327997770
// 06f: lload 5
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: ifeq 160
// 07a: goto 088
// 07d: ldc2_w 6143682389327997770
// 080: lload 5
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: lload 9
// 08a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 08d: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 090: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 093: dup
// 094: sipush 27579
// 097: ldc2_w 1136044802695929778
// 09a: lload 5
// 09c: lxor
// 09d: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/uc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0a5: checkcast net/minecraft/class_1747
// 0a8: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
// 0ab: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 0ae: lload 7
// 0b0: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0b3: checkcast net/minecraft/class_1922
// 0b6: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
// 0b9: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
// 0bc: invokestatic net/minecraft/class_2248.method_9614 (Lnet/minecraft/class_265;)Z
// 0bf: ireturn
// 0c0: ldc2_w 6143682389327997770
// 0c3: lload 5
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: iload 3
// 0cc: aload 11
// 0ce: ifnull 161
// 0d1: bipush -1
// 0d2: goto 0e0
// 0d5: ldc2_w 6143682389327997770
// 0d8: lload 5
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: if_icmpeq 160
// 0e3: lload 9
// 0e5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e8: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0eb: iload 3
// 0ec: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0ef: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0f2: instanceof net/minecraft/class_1747
// 0f5: aload 11
// 0f7: ifnull 161
// 0fa: goto 108
// 0fd: ldc2_w 6143682389327997770
// 100: lload 5
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: ifeq 160
// 10b: goto 119
// 10e: ldc2_w 6143682389327997770
// 111: lload 5
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: lload 9
// 11b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 11e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 121: iload 3
// 122: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 125: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 128: dup
// 129: sipush 17731
// 12c: ldc2_w 6975711148960166217
// 12f: lload 5
// 131: lxor
// 132: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/uc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 13a: checkcast net/minecraft/class_1747
// 13d: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
// 140: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 143: lload 7
// 145: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 148: checkcast net/minecraft/class_1922
// 14b: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
// 14e: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
// 151: invokestatic net/minecraft/class_2248.method_9614 (Lnet/minecraft/class_265;)Z
// 154: ireturn
// 155: ldc2_w 6143682389327997770
// 158: lload 5
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: bipush 1
// 161: ireturn
}

private final void n(long param1, class_3965 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uc.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 62393255490817
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 71277525107251
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 73687910594272
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 98342938848750
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 25358439042574
// 027: lxor
// 028: lstore 12
// 02a: dup2
// 02b: ldc2_w 28645423793536
// 02e: lxor
// 02f: lstore 14
// 031: dup2
// 032: ldc2_w 87469617407423
// 035: lxor
// 036: lstore 16
// 038: dup2
// 039: ldc2_w 102727374931105
// 03c: lxor
// 03d: dup2
// 03e: bipush 8
// 040: lushr
// 041: lstore 18
// 043: dup2
// 044: bipush 56
// 046: lshl
// 047: bipush 56
// 049: lushr
// 04a: l2i
// 04b: istore 20
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 140056701237563
// 052: lxor
// 053: lstore 21
// 055: dup2
// 056: ldc2_w 26502202817319
// 059: lxor
// 05a: lstore 23
// 05c: dup2
// 05d: ldc2_w 135427102240377
// 060: lxor
// 061: lstore 25
// 063: dup2
// 064: ldc2_w 18141587450797
// 067: lxor
// 068: lstore 27
// 06a: dup2
// 06b: ldc2_w 20986792879340
// 06e: lxor
// 06f: lstore 29
// 071: dup2
// 072: ldc2_w 6080988285480
// 075: lxor
// 076: dup2
// 077: bipush 32
// 079: lushr
// 07a: l2i
// 07b: istore 31
// 07d: dup2
// 07e: bipush 32
// 080: lshl
// 081: bipush 32
// 083: lushr
// 084: lstore 32
// 086: pop2
// 087: dup2
// 088: ldc2_w 140360492343623
// 08b: lxor
// 08c: lstore 34
// 08e: dup2
// 08f: ldc2_w 81691502240867
// 092: lxor
// 093: lstore 36
// 095: dup2
// 096: ldc2_w 86830982514548
// 099: lxor
// 09a: lstore 38
// 09c: dup2
// 09d: ldc2_w 26698731605858
// 0a0: lxor
// 0a1: lstore 40
// 0a3: dup2
// 0a4: ldc2_w 129185642901639
// 0a7: lxor
// 0a8: lstore 42
// 0aa: dup2
// 0ab: ldc2_w 92164846881651
// 0ae: lxor
// 0af: dup2
// 0b0: bipush 16
// 0b2: lushr
// 0b3: lstore 44
// 0b5: dup2
// 0b6: bipush 48
// 0b8: lshl
// 0b9: bipush 48
// 0bb: lushr
// 0bc: l2i
// 0bd: istore 46
// 0bf: pop2
// 0c0: dup2
// 0c1: ldc2_w 116068597343595
// 0c4: lxor
// 0c5: dup2
// 0c6: bipush 48
// 0c8: lushr
// 0c9: l2i
// 0ca: istore 47
// 0cc: dup2
// 0cd: bipush 16
// 0cf: lshl
// 0d0: bipush 32
// 0d2: lushr
// 0d3: l2i
// 0d4: istore 48
// 0d6: dup2
// 0d7: bipush 48
// 0d9: lshl
// 0da: bipush 48
// 0dc: lushr
// 0dd: l2i
// 0de: istore 49
// 0e0: pop2
// 0e1: pop2
// 0e2: ldc2_w -6215053429151278662
// 0e5: lload 1
// 0e6: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: astore 50
// 0ed: lload 4
// 0ef: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f2: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0f5: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 0f8: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0fb: aload 50
// 0fd: ifnull 16d
// 100: ifeq 163
// 103: goto 110
// 106: ldc2_w -6215893603419220044
// 109: lload 1
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 113: invokevirtual su/catlean/dm.o ()D
// 116: dconst_0
// 117: dcmpg
// 118: aload 50
// 11a: ifnull 16d
// 11d: goto 12a
// 120: ldc2_w -6215893603419220044
// 123: lload 1
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: ifgt 163
// 12d: goto 13a
// 130: ldc2_w -6215893603419220044
// 133: lload 1
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: aload 0
// 13b: lload 16
// 13d: invokespecial su/catlean/uc.R (J)Z
// 140: aload 50
// 142: ifnull 16d
// 145: goto 152
// 148: ldc2_w -6215893603419220044
// 14b: lload 1
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: ifeq 163
// 155: goto 162
// 158: ldc2_w -6215893603419220044
// 15b: lload 1
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: return
// 163: aload 0
// 164: lload 44
// 166: bipush 1
// 167: iload 46
// 169: i2c
// 16a: invokespecial su/catlean/uc.A (JZC)I
// 16d: istore 51
// 16f: iload 51
// 171: aload 50
// 173: lload 1
// 174: lconst_0
// 175: lcmp
// 176: iflt 1aa
// 179: ifnull 1a8
// 17c: bipush -1
// 17d: if_icmpeq 685
// 180: goto 18d
// 183: ldc2_w -6215893603419220044
// 186: lload 1
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: lload 4
// 18f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 192: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 195: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 198: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 19b: goto 1a8
// 19e: ldc2_w -6215893603419220044
// 1a1: lload 1
// 1a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: athrow
// 1a8: aload 50
// 1aa: lload 1
// 1ab: lconst_0
// 1ac: lcmp
// 1ad: iflt 1e0
// 1b0: ifnull 1d8
// 1b3: ifeq 26a
// 1b6: goto 1c3
// 1b9: ldc2_w -6215893603419220044
// 1bc: lload 1
// 1bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c2: athrow
// 1c3: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1c6: lload 29
// 1c8: invokevirtual su/catlean/dm.Y (J)Z
// 1cb: goto 1d8
// 1ce: ldc2_w -6215893603419220044
// 1d1: lload 1
// 1d2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: athrow
// 1d8: lload 1
// 1d9: lconst_0
// 1da: lcmp
// 1db: ifle 206
// 1de: aload 50
// 1e0: ifnull 206
// 1e3: ifne 26a
// 1e6: goto 1f3
// 1e9: ldc2_w -6215893603419220044
// 1ec: lload 1
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: aload 0
// 1f4: lload 12
// 1f6: invokespecial su/catlean/uc.p (J)Z
// 1f9: goto 206
// 1fc: ldc2_w -6215893603419220044
// 1ff: lload 1
// 200: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 205: athrow
// 206: ifeq 26a
// 209: lload 23
// 20b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 20e: lload 23
// 210: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 213: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 216: getfield net/minecraft/class_243.field_1352 D
// 219: getstatic su/catlean/uc.V Lsu/catlean/bg;
// 21c: sipush 16874
// 21f: ldc2_w 7412979577038580050
// 222: lload 1
// 223: lxor
// 224: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: lload 34
// 22b: invokevirtual su/catlean/bg.q (IJ)Z
// 22e: ifeq 24e
// 231: goto 23e
// 234: ldc2_w -6215893603419220044
// 237: lload 1
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: ldc2_w -0.28
// 241: goto 251
// 244: ldc2_w -6215893603419220044
// 247: lload 1
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: ldc2_w 0.42
// 251: lload 23
// 253: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 256: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 259: getfield net/minecraft/class_243.field_1350 D
// 25c: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 25f: lload 1
// 260: lconst_0
// 261: lcmp
// 262: ifle 27d
// 265: aload 50
// 267: ifnonnull 27d
// 26a: getstatic su/catlean/uc.V Lsu/catlean/bg;
// 26d: invokevirtual su/catlean/bg.l ()V
// 270: goto 27d
// 273: ldc2_w -6215893603419220044
// 276: lload 1
// 277: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27c: athrow
// 27d: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 280: lload 14
// 282: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 285: aload 3
// 286: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 289: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 28c: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 28f: dup
// 290: sipush 1867
// 293: ldc2_w 3581171398743068547
// 296: lload 1
// 297: lxor
// 298: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/uc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2a0: lload 10
// 2a2: invokevirtual su/catlean/gw.D (Lnet/minecraft/class_2248;J)Z
// 2a5: aload 50
// 2a7: lload 1
// 2a8: lconst_0
// 2a9: lcmp
// 2aa: iflt 2d7
// 2ad: ifnull 2d5
// 2b0: ifeq 2ee
// 2b3: goto 2c0
// 2b6: ldc2_w -6215893603419220044
// 2b9: lload 1
// 2ba: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bf: athrow
// 2c0: lload 23
// 2c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c5: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 2c8: goto 2d5
// 2cb: ldc2_w -6215893603419220044
// 2ce: lload 1
// 2cf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d4: athrow
// 2d5: aload 50
// 2d7: ifnull 2eb
// 2da: ifne 2ee
// 2dd: goto 2ea
// 2e0: ldc2_w -6215893603419220044
// 2e3: lload 1
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: bipush 1
// 2eb: goto 2ef
// 2ee: bipush 0
// 2ef: istore 52
// 2f1: iload 52
// 2f3: aload 50
// 2f5: lload 1
// 2f6: lconst_0
// 2f7: lcmp
// 2f8: ifle 328
// 2fb: ifnull 326
// 2fe: ifeq 324
// 301: goto 30e
// 304: ldc2_w -6215893603419220044
// 307: lload 1
// 308: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30d: athrow
// 30e: getstatic su/catlean/wu.H Lsu/catlean/wu;
// 311: lload 6
// 313: bipush 1
// 314: invokevirtual su/catlean/wu.G (JZ)V
// 317: goto 324
// 31a: ldc2_w -6215893603419220044
// 31d: lload 1
// 31e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 323: athrow
// 324: iload 51
// 326: aload 50
// 328: ifnull 356
// 32b: sipush 2836
// 32e: ldc2_w 5178616118604817326
// 331: lload 1
// 332: lxor
// 333: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 338: if_icmpeq 359
// 33b: goto 348
// 33e: ldc2_w -6215893603419220044
// 341: lload 1
// 342: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 347: athrow
// 348: bipush 1
// 349: goto 356
// 34c: ldc2_w -6215893603419220044
// 34f: lload 1
// 350: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 355: athrow
// 356: goto 35a
// 359: bipush 0
// 35a: istore 53
// 35c: aload 0
// 35d: lload 36
// 35f: invokespecial su/catlean/uc.F (J)Z
// 362: aload 50
// 364: ifnull 4cf
// 367: ifeq 4b7
// 36a: goto 377
// 36d: ldc2_w -6215893603419220044
// 370: lload 1
// 371: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 376: athrow
// 377: getstatic su/catlean/ep.B Lsu/catlean/ep;
// 37a: lload 25
// 37c: invokevirtual su/catlean/ep.f (J)Z
// 37f: aload 50
// 381: ifnull 4cf
// 384: goto 391
// 387: ldc2_w -6215893603419220044
// 38a: lload 1
// 38b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 390: athrow
// 391: lload 1
// 392: lconst_0
// 393: lcmp
// 394: ifle 4c2
// 397: ifeq 4b7
// 39a: goto 3a7
// 39d: ldc2_w -6215893603419220044
// 3a0: lload 1
// 3a1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a6: athrow
// 3a7: getstatic su/catlean/ep.B Lsu/catlean/ep;
// 3aa: lload 18
// 3ac: iload 20
// 3ae: i2b
// 3af: invokevirtual su/catlean/ep.j (JB)Z
// 3b2: aload 50
// 3b4: ifnull 4cf
// 3b7: goto 3c4
// 3ba: ldc2_w -6215893603419220044
// 3bd: lload 1
// 3be: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c3: athrow
// 3c4: lload 1
// 3c5: lconst_0
// 3c6: lcmp
// 3c7: iflt 4c2
// 3ca: ifeq 4b7
// 3cd: goto 3da
// 3d0: ldc2_w -6215893603419220044
// 3d3: lload 1
// 3d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: athrow
// 3da: iload 53
// 3dc: ifeq 3fc
// 3df: goto 3ec
// 3e2: ldc2_w -6215893603419220044
// 3e5: lload 1
// 3e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3eb: athrow
// 3ec: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 3ef: goto 3ff
// 3f2: ldc2_w -6215893603419220044
// 3f5: lload 1
// 3f6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fb: athrow
// 3fc: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 3ff: fconst_0
// 400: lload 27
// 402: fconst_0
// 403: sipush 389
// 406: ldc2_w 8974561076176677179
// 409: lload 1
// 40a: lxor
// 40b: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 410: aconst_null
// 411: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 414: pop
// 415: iload 53
// 417: invokedynamic predict (Z)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/uc.A (ZI)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 41c: lload 38
// 41e: dup2_x1
// 41f: pop2
// 420: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 423: new net/minecraft/class_2846
// 426: dup
// 427: getstatic net/minecraft/class_2846$class_2847.field_12969 Lnet/minecraft/class_2846$class_2847;
// 42a: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
// 42d: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 430: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 433: checkcast net/minecraft/class_2596
// 436: lload 40
// 438: dup2_x1
// 439: pop2
// 43a: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 43d: iload 53
// 43f: aload 3
// 440: invokedynamic predict (ZLnet/minecraft/class_3965;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/uc.I (ZLnet/minecraft/class_3965;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 445: lload 38
// 447: dup2_x1
// 448: pop2
// 449: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 44c: lload 23
// 44e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 451: iload 53
// 453: ifeq 466
// 456: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 459: goto 469
// 45c: ldc2_w -6215893603419220044
// 45f: lload 1
// 460: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 465: athrow
// 466: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 469: lload 1
// 46a: lconst_0
// 46b: lcmp
// 46c: ifle 499
// 46f: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 472: new net/minecraft/class_2846
// 475: dup
// 476: getstatic net/minecraft/class_2846$class_2847.field_12969 Lnet/minecraft/class_2846$class_2847;
// 479: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
// 47c: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 47f: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 482: checkcast net/minecraft/class_2596
// 485: lload 40
// 487: dup2_x1
// 488: pop2
// 489: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 48c: lload 23
// 48e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 491: iload 53
// 493: ifeq 4a6
// 496: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 499: goto 4a9
// 49c: ldc2_w -6215893603419220044
// 49f: lload 1
// 4a0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a5: athrow
// 4a6: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 4a9: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 4ac: lload 1
// 4ad: lconst_0
// 4ae: lcmp
// 4af: iflt 5bd
// 4b2: aload 50
// 4b4: ifnonnull 5ad
// 4b7: lload 23
// 4b9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4bc: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 4bf: invokevirtual net/minecraft/class_1799.method_7947 ()I
// 4c2: goto 4cf
// 4c5: ldc2_w -6215893603419220044
// 4c8: lload 1
// 4c9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ce: athrow
// 4cf: istore 54
// 4d1: aload 0
// 4d2: iload 47
// 4d4: i2s
// 4d5: iload 48
// 4d7: iload 49
// 4d9: i2c
// 4da: invokespecial su/catlean/uc.n (SIC)Z
// 4dd: lload 1
// 4de: lconst_0
// 4df: lcmp
// 4e0: iflt 50f
// 4e3: ifeq 50d
// 4e6: new net/minecraft/class_2846
// 4e9: dup
// 4ea: getstatic net/minecraft/class_2846$class_2847.field_12969 Lnet/minecraft/class_2846$class_2847;
// 4ed: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
// 4f0: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 4f3: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 4f6: checkcast net/minecraft/class_2596
// 4f9: lload 40
// 4fb: dup2_x1
// 4fc: pop2
// 4fd: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 500: goto 50d
// 503: ldc2_w -6215893603419220044
// 506: lload 1
// 507: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50c: athrow
// 50d: iload 31
// 50f: lload 32
// 511: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 514: lload 23
// 516: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 519: iload 53
// 51b: ifeq 52e
// 51e: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 521: goto 531
// 524: ldc2_w -6215893603419220044
// 527: lload 1
// 528: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52d: athrow
// 52e: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 531: aload 3
// 532: invokevirtual net/minecraft/class_636.method_2896 (Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
// 535: pop
// 536: new net/minecraft/class_2879
// 539: dup
// 53a: iload 53
// 53c: ifeq 54f
// 53f: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 542: goto 552
// 545: ldc2_w -6215893603419220044
// 548: lload 1
// 549: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54e: athrow
// 54f: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// 552: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 555: checkcast net/minecraft/class_2596
// 558: lload 40
// 55a: dup2_x1
// 55b: pop2
// 55c: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 55f: aload 0
// 560: iload 47
// 562: i2s
// 563: iload 48
// 565: iload 49
// 567: i2c
// 568: invokespecial su/catlean/uc.n (SIC)Z
// 56b: aload 50
// 56d: lload 1
// 56e: lconst_0
// 56f: lcmp
// 570: iflt 5c1
// 573: ifnull 5bf
// 576: ifeq 5ad
// 579: new net/minecraft/class_2846
// 57c: dup
// 57d: getstatic net/minecraft/class_2846$class_2847.field_12969 Lnet/minecraft/class_2846$class_2847;
// 580: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
// 583: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 586: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 589: checkcast net/minecraft/class_2596
// 58c: lload 40
// 58e: dup2_x1
// 58f: pop2
// 590: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 593: lload 23
// 595: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 598: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 59b: iload 54
// 59d: invokevirtual net/minecraft/class_1799.method_7939 (I)V
// 5a0: goto 5ad
// 5a3: ldc2_w -6215893603419220044
// 5a6: lload 1
// 5a7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ac: athrow
// 5ad: getstatic su/catlean/uc.l Lsu/catlean/bg;
// 5b0: invokevirtual su/catlean/bg.l ()V
// 5b3: aload 3
// 5b4: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 5b7: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 5ba: putstatic su/catlean/uc.x I
// 5bd: iload 52
// 5bf: aload 50
// 5c1: lload 1
// 5c2: lconst_0
// 5c3: lcmp
// 5c4: iflt 606
// 5c7: ifnull 5fe
// 5ca: ifeq 5f0
// 5cd: goto 5da
// 5d0: ldc2_w -6215893603419220044
// 5d3: lload 1
// 5d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d9: athrow
// 5da: getstatic su/catlean/wu.H Lsu/catlean/wu;
// 5dd: lload 6
// 5df: bipush 0
// 5e0: invokevirtual su/catlean/wu.G (JZ)V
// 5e3: goto 5f0
// 5e6: ldc2_w -6215893603419220044
// 5e9: lload 1
// 5ea: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ef: athrow
// 5f0: aload 0
// 5f1: iload 51
// 5f3: lload 42
// 5f5: invokespecial su/catlean/uc.w (IJ)V
// 5f8: aload 0
// 5f9: lload 21
// 5fb: invokespecial su/catlean/uc.M (J)Z
// 5fe: lload 1
// 5ff: lconst_0
// 600: lcmp
// 601: ifle 62c
// 604: aload 50
// 606: ifnull 62c
// 609: ifeq 685
// 60c: goto 619
// 60f: ldc2_w -6215893603419220044
// 612: lload 1
// 613: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 618: athrow
// 619: aload 0
// 61a: lload 8
// 61c: invokespecial su/catlean/uc.D (J)Z
// 61f: goto 62c
// 622: ldc2_w -6215893603419220044
// 625: lload 1
// 626: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62b: athrow
// 62c: ifeq 685
// 62f: new net/minecraft/class_2828$class_2830
// 632: dup
// 633: lload 23
// 635: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 638: invokevirtual net/minecraft/class_746.method_23317 ()D
// 63b: lload 23
// 63d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 640: invokevirtual net/minecraft/class_746.method_23318 ()D
// 643: lload 23
// 645: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 648: invokevirtual net/minecraft/class_746.method_23321 ()D
// 64b: lload 23
// 64d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 650: invokevirtual net/minecraft/class_746.method_36454 ()F
// 653: lload 23
// 655: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 658: invokevirtual net/minecraft/class_746.method_36455 ()F
// 65b: lload 23
// 65d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 660: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 663: lload 23
// 665: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 668: getfield net/minecraft/class_746.field_5976 Z
// 66b: invokespecial net/minecraft/class_2828$class_2830.<init> (DDDFFZZ)V
// 66e: checkcast net/minecraft/class_2596
// 671: lload 40
// 673: dup2_x1
// 674: pop2
// 675: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 678: goto 685
// 67b: ldc2_w -6215893603419220044
// 67e: lload 1
// 67f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 684: athrow
// 685: return
}

private final zl V(class_2338 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uc.b J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 35880315607084
// 0b: lxor
// 0c: lstore 4
// 0e: dup2
// 0f: ldc2_w 47693056121610
// 12: lxor
// 13: lstore 6
// 15: pop2
// 16: ldc2_w -5470875765175925738
// 19: lload 2
// 1a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f: astore 8
// 21: lload 4
// 23: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 26: aload 1
// 27: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 2a: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 2d: ifne 3c
// 30: aconst_null
// 31: areturn
// 32: ldc2_w -5471716192812332520
// 35: lload 2
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: getstatic su/catlean/uc.D [Lnet/minecraft/class_2338;
// 3f: astore 9
// 41: bipush 0
// 42: istore 10
// 44: aload 9
// 46: arraylength
// 47: istore 11
// 49: iload 10
// 4b: iload 11
// 4d: if_icmpge af
// 50: aload 9
// 52: iload 10
// 54: aaload
// 55: astore 12
// 57: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 5a: aload 1
// 5b: aload 12
// 5d: checkcast net/minecraft/class_2382
// 60: invokevirtual net/minecraft/class_2338.method_10081 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_2338;
// 63: dup
// 64: sipush 8036
// 67: ldc2_w 200437043692767761
// 6a: lload 2
// 6b: lxor
// 6c: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/uc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 74: lload 6
// 76: dup2_x1
// 77: pop2
// 78: invokevirtual su/catlean/gw.u (JLnet/minecraft/class_2338;)Lsu/catlean/zl;
// 7b: astore 13
// 7d: aload 8
// 7f: lload 2
// 80: lconst_0
// 81: lcmp
// 82: iflt ac
// 85: ifnull aa
// 88: aload 13
// 8a: dup
// 8b: ifnull a6
// 8e: goto 9b
// 91: ldc2_w -5471716192812332520
// 94: lload 2
// 95: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a: athrow
// 9b: areturn
// 9c: ldc2_w -5471716192812332520
// 9f: lload 2
// a0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5: athrow
// a6: pop
// a7: iinc 10 1
// aa: aload 8
// ac: ifnonnull 49
// af: aconst_null
// b0: areturn
}

private final boolean V(class_1799 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uc.b J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -6032600806938354622
// 09: lload 2
// 0a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 4
// 11: aload 1
// 12: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 15: instanceof net/minecraft/class_1747
// 18: aload 4
// 1a: ifnull 5b
// 1d: ifeq ba
// 20: goto 2d
// 23: ldc2_w -6033449240402193844
// 26: lload 2
// 27: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: athrow
// 2d: aload 1
// 2e: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 31: dup
// 32: sipush 17731
// 35: ldc2_w 6975771396493101135
// 38: lload 2
// 39: lxor
// 3a: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/uc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 42: checkcast net/minecraft/class_1747
// 45: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
// 48: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 4b: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 4e: goto 5b
// 51: ldc2_w -6033449240402193844
// 54: lload 2
// 55: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a: athrow
// 5b: aload 4
// 5d: lload 2
// 5e: lconst_0
// 5f: lcmp
// 60: iflt a3
// 63: ifnull a1
// 66: ifne ba
// 69: goto 76
// 6c: ldc2_w -6033449240402193844
// 6f: lload 2
// 70: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75: athrow
// 76: aload 1
// 77: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 7a: dup
// 7b: sipush 17731
// 7e: ldc2_w 6975771396493101135
// 81: lload 2
// 82: lxor
// 83: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/uc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 8b: checkcast net/minecraft/class_1747
// 8e: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
// 91: instanceof net/minecraft/class_2346
// 94: goto a1
// 97: ldc2_w -6033449240402193844
// 9a: lload 2
// 9b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: athrow
// a1: aload 4
// a3: ifnull b7
// a6: ifne ba
// a9: goto b6
// ac: ldc2_w -6033449240402193844
// af: lload 2
// b0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b5: athrow
// b6: bipush 1
// b7: goto bb
// ba: bipush 0
// bb: ireturn
}

private final int A(long param1, boolean param3, char param4) {
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
// 004: iload 4
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 48
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/uc.b J
// 011: lxor
// 012: lstore 5
// 014: lload 5
// 016: dup2
// 017: ldc2_w 32910751825646
// 01a: lxor
// 01b: lstore 7
// 01d: dup2
// 01e: ldc2_w 111030089366172
// 021: lxor
// 022: dup2
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 9
// 029: dup2
// 02a: bipush 16
// 02c: lshl
// 02d: bipush 48
// 02f: lushr
// 030: l2i
// 031: istore 10
// 033: dup2
// 034: bipush 32
// 036: lshl
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 11
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 87457794856736
// 042: lxor
// 043: lstore 12
// 045: dup2
// 046: ldc2_w 8247496707723
// 049: lxor
// 04a: lstore 14
// 04c: dup2
// 04d: ldc2_w 61672555312741
// 050: lxor
// 051: lstore 16
// 053: dup2
// 054: ldc2_w 109879293292938
// 057: lxor
// 058: dup2
// 059: bipush 32
// 05b: lushr
// 05c: l2i
// 05d: istore 18
// 05f: dup2
// 060: bipush 32
// 062: lshl
// 063: bipush 48
// 065: lushr
// 066: l2i
// 067: istore 19
// 069: dup2
// 06a: bipush 48
// 06c: lshl
// 06d: bipush 48
// 06f: lushr
// 070: l2i
// 071: istore 20
// 073: pop2
// 074: dup2
// 075: ldc2_w 2296007158937
// 078: lxor
// 079: lstore 21
// 07b: pop2
// 07c: ldc2_w 4468041256736378372
// 07f: lload 5
// 081: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: bipush -1
// 087: istore 24
// 089: astore 23
// 08b: aload 0
// 08c: lload 21
// 08e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 091: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 094: dup
// 095: sipush 22710
// 098: ldc2_w 171336333059803102
// 09b: lload 5
// 09d: lxor
// 09e: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/uc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a6: lload 14
// 0a8: invokespecial su/catlean/uc.V (Lnet/minecraft/class_1799;J)Z
// 0ab: aload 23
// 0ad: ifnull 0fb
// 0b0: ifeq 0db
// 0b3: goto 0c1
// 0b6: ldc2_w 4468327017263235082
// 0b9: lload 5
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: sipush 2836
// 0c4: ldc2_w 5178640256620033040
// 0c7: lload 5
// 0c9: lxor
// 0ca: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: ireturn
// 0d0: ldc2_w 4468327017263235082
// 0d3: lload 5
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: aload 0
// 0dc: lload 21
// 0de: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e1: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 0e4: dup
// 0e5: sipush 28334
// 0e8: ldc2_w 5796452387911201229
// 0eb: lload 5
// 0ed: lxor
// 0ee: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/uc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f6: lload 14
// 0f8: invokespecial su/catlean/uc.V (Lnet/minecraft/class_1799;J)Z
// 0fb: aload 23
// 0fd: ifnull 12a
// 100: ifeq 12b
// 103: goto 111
// 106: ldc2_w 4468327017263235082
// 109: lload 5
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: lload 21
// 113: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 116: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 119: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 11c: goto 12a
// 11f: ldc2_w 4468327017263235082
// 122: lload 5
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: ireturn
// 12b: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 12e: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/uc.Z (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 133: lload 7
// 135: dup2_x1
// 136: pop2
// 137: invokevirtual su/catlean/gg.P (JLsu/catlean/n5;)Lsu/catlean/fg;
// 13a: astore 25
// 13c: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 13f: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/uc.g (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 144: iload 9
// 146: i2s
// 147: swap
// 148: iload 10
// 14a: i2s
// 14b: iload 11
// 14d: invokevirtual su/catlean/gg.j (SLsu/catlean/n5;SI)Lsu/catlean/fg;
// 150: astore 26
// 152: iload 3
// 153: aload 23
// 155: iload 4
// 157: iflt 27d
// 15a: ifnull 27b
// 15d: ifeq 259
// 160: goto 16e
// 163: ldc2_w 4468327017263235082
// 166: lload 5
// 168: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: athrow
// 16e: aload 0
// 16f: iload 18
// 171: iload 19
// 173: i2c
// 174: iload 20
// 176: i2c
// 177: invokespecial su/catlean/uc.l (ICC)Lsu/catlean/mq;
// 17a: getstatic su/catlean/x2.V [I
// 17d: swap
// 17e: invokevirtual su/catlean/mq.ordinal ()I
// 181: iaload
// 182: aload 23
// 184: lload 1
// 185: lconst_0
// 186: lcmp
// 187: ifle 1dc
// 18a: ifnull 1da
// 18d: goto 19b
// 190: ldc2_w 4468327017263235082
// 193: lload 5
// 195: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: athrow
// 19b: iload 4
// 19d: ifle 1cc
// 1a0: tableswitch 180 1 3 39 119 119
// 1bc: ldc2_w 4468327017263235082
// 1bf: lload 5
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: aload 26
// 1c9: invokevirtual su/catlean/fg.R ()Z
// 1cc: goto 1da
// 1cf: ldc2_w 4468327017263235082
// 1d2: lload 5
// 1d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d9: athrow
// 1da: aload 23
// 1dc: ifnull 320
// 1df: ifeq 31e
// 1e2: goto 1f0
// 1e5: ldc2_w 4468327017263235082
// 1e8: lload 5
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: aload 26
// 1f2: invokevirtual su/catlean/fg.a ()I
// 1f5: iload 24
// 1f7: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 1fa: bipush 1
// 1fb: lload 12
// 1fd: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 200: lload 21
// 202: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 205: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 208: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 20b: istore 24
// 20d: iload 4
// 20f: ifle 217
// 212: aload 23
// 214: ifnonnull 31e
// 217: aload 25
// 219: invokevirtual su/catlean/fg.R ()Z
// 21c: aload 23
// 21e: ifnull 320
// 221: goto 22f
// 224: ldc2_w 4468327017263235082
// 227: lload 5
// 229: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: athrow
// 22f: ifeq 31e
// 232: goto 240
// 235: ldc2_w 4468327017263235082
// 238: lload 5
// 23a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23f: athrow
// 240: lload 21
// 242: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 245: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 248: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 24b: istore 24
// 24d: aload 25
// 24f: lload 16
// 251: invokevirtual su/catlean/fg.x (J)V
// 254: aload 23
// 256: ifnonnull 31e
// 259: aload 0
// 25a: iload 18
// 25c: iload 19
// 25e: i2c
// 25f: iload 20
// 261: i2c
// 262: invokespecial su/catlean/uc.l (ICC)Lsu/catlean/mq;
// 265: getstatic su/catlean/x2.V [I
// 268: swap
// 269: invokevirtual su/catlean/mq.ordinal ()I
// 26c: iaload
// 26d: goto 27b
// 270: ldc2_w 4468327017263235082
// 273: lload 5
// 275: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27a: athrow
// 27b: aload 23
// 27d: ifnull 320
// 280: tableswitch 158 1 3 39 104 104
// 29c: ldc2_w 4468327017263235082
// 29f: lload 5
// 2a1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a6: athrow
// 2a7: aload 26
// 2a9: invokevirtual su/catlean/fg.R ()Z
// 2ac: aload 23
// 2ae: ifnull 320
// 2b1: goto 2bf
// 2b4: ldc2_w 4468327017263235082
// 2b7: lload 5
// 2b9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2be: athrow
// 2bf: ifeq 31e
// 2c2: goto 2d0
// 2c5: ldc2_w 4468327017263235082
// 2c8: lload 5
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: lload 21
// 2d2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2d5: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 2d8: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 2db: istore 24
// 2dd: lload 1
// 2de: lconst_0
// 2df: lcmp
// 2e0: iflt 2e8
// 2e3: aload 23
// 2e5: ifnonnull 31e
// 2e8: aload 25
// 2ea: invokevirtual su/catlean/fg.R ()Z
// 2ed: aload 23
// 2ef: ifnull 320
// 2f2: goto 300
// 2f5: ldc2_w 4468327017263235082
// 2f8: lload 5
// 2fa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ff: athrow
// 300: ifeq 31e
// 303: goto 311
// 306: ldc2_w 4468327017263235082
// 309: lload 5
// 30b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 310: athrow
// 311: lload 21
// 313: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 316: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 319: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 31c: istore 24
// 31e: iload 24
// 320: ireturn
}

@Flow
private final void A(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uc.b J
// 003: ldc2_w 19112295951826
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 14339418999004
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 22273243511868
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 32
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
// 031: pop2
// 032: ldc2_w 8135977044532691181
// 035: lload 2
// 036: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03b: astore 9
// 03d: aload 0
// 03e: iload 6
// 040: i2s
// 041: iload 7
// 043: iload 8
// 045: i2c
// 046: invokespecial su/catlean/uc.n (SIC)Z
// 049: ifne 057
// 04c: return
// 04d: ldc2_w 8136817478661885667
// 050: lload 2
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: aload 1
// 058: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 05b: astore 10
// 05d: aload 10
// 05f: instanceof net/minecraft/class_2797
// 062: aload 9
// 064: ifnull 089
// 067: ifne 1af
// 06a: goto 077
// 06d: ldc2_w 8136817478661885667
// 070: lload 2
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: aload 10
// 079: instanceof net/minecraft/class_7439
// 07c: goto 089
// 07f: ldc2_w 8136817478661885667
// 082: lload 2
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: aload 9
// 08b: ifnull 0b0
// 08e: ifne 1af
// 091: goto 09e
// 094: ldc2_w 8136817478661885667
// 097: lload 2
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: aload 10
// 0a0: instanceof net/minecraft/class_2761
// 0a3: goto 0b0
// 0a6: ldc2_w 8136817478661885667
// 0a9: lload 2
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: aload 9
// 0b2: ifnull 0d7
// 0b5: ifne 1af
// 0b8: goto 0c5
// 0bb: ldc2_w 8136817478661885667
// 0be: lload 2
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: aload 10
// 0c7: instanceof net/minecraft/class_7472
// 0ca: goto 0d7
// 0cd: ldc2_w 8136817478661885667
// 0d0: lload 2
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: aload 9
// 0d9: ifnull 0fe
// 0dc: ifne 1af
// 0df: goto 0ec
// 0e2: ldc2_w 8136817478661885667
// 0e5: lload 2
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: aload 10
// 0ee: instanceof net/minecraft/class_2767
// 0f1: goto 0fe
// 0f4: ldc2_w 8136817478661885667
// 0f7: lload 2
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: aload 9
// 100: ifnull 125
// 103: ifne 1af
// 106: goto 113
// 109: ldc2_w 8136817478661885667
// 10c: lload 2
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: aload 10
// 115: instanceof net/minecraft/class_2770
// 118: goto 125
// 11b: ldc2_w 8136817478661885667
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: aload 9
// 127: ifnull 14c
// 12a: ifne 1af
// 12d: goto 13a
// 130: ldc2_w 8136817478661885667
// 133: lload 2
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: aload 10
// 13c: instanceof net/minecraft/class_5894
// 13f: goto 14c
// 142: ldc2_w 8136817478661885667
// 145: lload 2
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: aload 9
// 14e: ifnull 173
// 151: ifne 1af
// 154: goto 161
// 157: ldc2_w 8136817478661885667
// 15a: lload 2
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: aload 10
// 163: instanceof net/minecraft/class_2749
// 166: goto 173
// 169: ldc2_w 8136817478661885667
// 16c: lload 2
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: aload 9
// 175: ifnull 19a
// 178: ifne 1af
// 17b: goto 188
// 17e: ldc2_w 8136817478661885667
// 181: lload 2
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: aload 10
// 18a: instanceof net/minecraft/class_2629
// 18d: goto 19a
// 190: ldc2_w 8136817478661885667
// 193: lload 2
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: aload 9
// 19c: ifnull 1b5
// 19f: ifeq 1b0
// 1a2: goto 1af
// 1a5: ldc2_w 8136817478661885667
// 1a8: lload 2
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: return
// 1b0: aload 10
// 1b2: instanceof net/minecraft/class_2708
// 1b5: aload 9
// 1b7: ifnull 1dc
// 1ba: ifne 1f1
// 1bd: goto 1ca
// 1c0: ldc2_w 8136817478661885667
// 1c3: lload 2
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: aload 10
// 1cc: instanceof net/minecraft/class_2661
// 1cf: goto 1dc
// 1d2: ldc2_w 8136817478661885667
// 1d5: lload 2
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: aload 9
// 1de: ifnull 216
// 1e1: ifeq 200
// 1e4: goto 1f1
// 1e7: ldc2_w 8136817478661885667
// 1ea: lload 2
// 1eb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f0: athrow
// 1f1: aload 0
// 1f2: invokespecial su/catlean/uc.z ()V
// 1f5: return
// 1f6: ldc2_w 8136817478661885667
// 1f9: lload 2
// 1fa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ff: athrow
// 200: getstatic su/catlean/uc.o Ljava/util/concurrent/ConcurrentLinkedQueue;
// 203: new su/catlean/d
// 206: dup
// 207: aload 1
// 208: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 20b: invokestatic su/catlean/zf.A ()J
// 20e: lload 4
// 210: invokespecial su/catlean/d.<init> (Lnet/minecraft/class_2596;JJ)V
// 213: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.add (Ljava/lang/Object;)Z
// 216: pop
// 217: aload 1
// 218: invokevirtual su/catlean/api/event/events/network/ReceivePacket.cancel ()V
// 21b: return
}

@Flow
private final void H(PostTasksProcessEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uc.b J
// 03: ldc2_w 33227595561643
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 81600923073327
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 135682870990825
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -6372097191363651692
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: aload 8
// 25: ifnull 6b
// 28: lload 4
// 2a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 30: ifnull 58
// 33: goto 40
// 36: ldc2_w -6371811465161139814
// 39: lload 2
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: lload 4
// 42: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 45: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 48: ifnonnull 6c
// 4b: goto 58
// 4e: ldc2_w -6371811465161139814
// 51: lload 2
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: getstatic su/catlean/uc.o Ljava/util/concurrent/ConcurrentLinkedQueue;
// 5b: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.clear ()V
// 5e: goto 6b
// 61: ldc2_w -6371811465161139814
// 64: lload 2
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: return
// 6c: aload 0
// 6d: bipush 0
// 6e: lload 6
// 70: bipush 1
// 71: aconst_null
// 72: invokestatic su/catlean/uc.c (Lsu/catlean/uc;ZJILjava/lang/Object;)V
// 75: getstatic su/catlean/uc.S Ljava/util/concurrent/ConcurrentLinkedQueue;
// 78: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/uc.j (Lnet/minecraft/class_2596;)Z, (Lnet/minecraft/class_2596;)Ljava/lang/Boolean; ]
// 7d: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/uc.T (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 82: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.removeIf (Ljava/util/function/Predicate;)Z
// 85: pop
// 86: return
}

private final void e(boolean var1) {
o.removeIf(uc::j);
}

static void c(uc var0, boolean var1, long var2, int var4, Object var5) {
var2 = b ^ var2;
int[] var6 = vm.a<"Å">(7833433090548931760L, var2);

label31: {
int var10000;
label30: {
try {
var10000 = var4 & 1;
if (var6 == null) {
break label30;
}

if (var10000 == 0) {
break label31;
}
} catch (NoWhenBranchMatchedException var8) {
throw vm.a<"Å">(var8, 7833718543441711806L, var2);
}

var10000 = 0;
}

var1 = var10000;
}

try {
var0.e((boolean)var1);
if (var2 >= 0L && var6 == null) {
vm.a<"Å">(new _g[5], 7810881534774830680L, var2);
}
} catch (NoWhenBranchMatchedException var7) {
throw vm.a<"Å">(var7, 7833718543441711806L, var2);
}
}

private final void z() {
o.removeIf(uc::g);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void w(int var1, long var2) {
var2 = b ^ var2;
long var4 = var2 ^ 115613915999444L;
long var6 = var2 ^ 81615495234279L;
long var10001 = var2 ^ 76157966994046L;
int var8 = (int)((var2 ^ 76157966994046L) >>> 32);
int var9 = (int)((var2 ^ 76157966994046L) << 32 >>> 48);
int var10 = (int)(var10001 << 48 >>> 48);
long var11 = var2 ^ 40382224111469L;
int[] var13 = vm.a<"Å">(5041090891580749296L, var2);

int var10000;
label56: {
try {
var10000 = var1;
if (var13 == null) {
break label56;
}

switch (var1) {
case -2:
case -1:
return;
}
} catch (NoWhenBranchMatchedException var17) {
throw vm.a<"Å">(var17, 5041367551090555902L, var2);
}

var10000 = x2.V[this.l(var8, (char)var9, (char)var10).ordinal()];
}

label45: {
label44: {
try {
if (var2 <= 0L || var13 == null) {
break label44;
}

switch (var10000) {
case 1:
break;
case 2:
default:
return;
case 3:
break label45;
}
} catch (NoWhenBranchMatchedException var16) {
throw vm.a<"Å">(var16, 5041367551090555902L, var2);
}

var10000 = var1;
}

try {
ag.r(var10000, zf.v(var11).method_31548().method_67532(), class_1713.field_7791, true, var4);
if (var2 < 0L || var13 != null) {
return;
}
} catch (NoWhenBranchMatchedException var15) {
throw vm.a<"Å">(var15, 5041367551090555902L, var2);
}
}

try {
gg.P.f(var1, var6);
} catch (NoWhenBranchMatchedException var14) {
throw vm.a<"Å">(var14, 5041367551090555902L, var2);
}
}

private static final boolean W() {
long var0 = b ^ 121089418517128L;
long var2 = var0 ^ 85917108723128L;
int[] var4 = vm.a<"Å">(-4056983206610585673L, var0);

try {
boolean var10000 = Y.q(var2);
if (var4 == null) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, -4057260430889944647L, var0);
}

return false;
}

private static final Unit y(ObjectRef var0) {
long var1 = b ^ 105280385757453L;
long var3 = var1 ^ 134891954116933L;
Y.n(var3, (class_3965)var0.element);
return Unit.INSTANCE;
}

private static final Unit M(ObjectRef var0) {
long var1 = b ^ 76844421839238L;
long var3 = var1 ^ 106159655342542L;
Y.n(var3, (class_3965)var0.element);
return Unit.INSTANCE;
}

private static final Unit w(ObjectRef var0) {
long var1 = b ^ 75225503586045L;
long var3 = var1 ^ 106671042461365L;
Y.n(var3, (class_3965)var0.element);
return Unit.INSTANCE;
}

private static final class_2596 A(boolean var0, int var1) {
long var2 = b ^ 64073512639208L;
long var4 = var2 ^ 70458384844441L;
long var6 = var2 ^ 51500963793140L;

class_2886 var10000;
class_2886 var10001;
class_1268 var10002;
label17: {
try {
var10000 = new class_2886;
var10001 = var10000;
if (var0) {
var10002 = class_1268.field_5808;
break label17;
}
} catch (NoWhenBranchMatchedException var8) {
throw vm.a<"Å">(var8, -4048204702612096551L, var2);
}

var10002 = class_1268.field_5810;
}

var10001./* $VF: Unable to resugar constructor */<init>(var10002, var1, dm.h.U(var4), dm.h.w(var6));
return (class_2596)var10000;
}

private static final class_2596 I(boolean var0, class_3965 var1, int var2) {
long var3 = b ^ 123482865802231L;

class_2885 var10000;
class_2885 var10001;
class_1268 var10002;
label17: {
try {
var10000 = new class_2885;
var10001 = var10000;
if (var0) {
var10002 = class_1268.field_5808;
break label17;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 490515560494446790L, var3);
}

var10002 = class_1268.field_5810;
}

var10001./* $VF: Unable to resugar constructor */<init>(var10002, var1, var2);
return (class_2596)var10000;
}

private static final boolean Z(class_1799 var0) {
long var1 = b ^ 87831625467822L;
long var3 = var1 ^ 69122830608926L;
Intrinsics.checkNotNullParameter(var0, b<"q">(29780, 1259934245334732719L ^ var1));
return Y.V(var0, var3);
}

private static final boolean g(class_1799 var0) {
long var1 = b ^ 21153203157563L;
long var3 = var1 ^ 107756706944907L;
Intrinsics.checkNotNullParameter(var0, b<"q">(5334, 4275433030236000915L ^ var1));
return Y.V(var0, var3);
}

private static final boolean j(class_2596 var0) {
long var1 = b ^ 113536890045318L;
long var3 = var1 ^ 94607866776448L;
uc var5 = Y;

try {
boolean var7 = false;
Intrinsics.checkNotNull(var0, b<"q">(3392, 2220597683181892242L ^ var1));
var0.method_65081((class_2547)zf.k(var3));
Object var9 = Result.constructor-impl(Unit.INSTANCE);
} catch (Throwable var8) {
Object var6 = Result.constructor-impl(ResultKt.createFailure(var8));
}

return true;
}

private static final boolean T(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean l(boolean param0, d param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/uc.b J
// 03: ldc2_w 112461540636330
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 3139214744836692885
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: iload 0
// 14: aload 4
// 16: ifnull 63
// 19: ifne 62
// 1c: goto 29
// 1f: ldc2_w 3140063695299057051
// 22: lload 2
// 23: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: athrow
// 29: aload 1
// 2a: invokevirtual su/catlean/d.d ()J
// 2d: invokestatic su/catlean/zf.A ()J
// 30: sipush 7566
// 33: ldc2_w 6250554751139903245
// 36: lload 2
// 37: lxor
// 38: invokedynamic t (IJ)I bsm=su/catlean/uc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d: i2l
// 3e: lsub
// 3f: lcmp
// 40: aload 4
// 42: ifnull 63
// 45: goto 52
// 48: ldc2_w 3140063695299057051
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: ifgt 66
// 55: goto 62
// 58: ldc2_w 3140063695299057051
// 5b: lload 2
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: bipush 1
// 63: goto 67
// 66: bipush 0
// 67: istore 5
// 69: iload 5
// 6b: istore 6
// 6d: bipush 0
// 6e: istore 7
// 70: iload 6
// 72: aload 4
// 74: ifnull a2
// 77: ifeq 9f
// 7a: goto 87
// 7d: ldc2_w 3140063695299057051
// 80: lload 2
// 81: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86: athrow
// 87: getstatic su/catlean/uc.S Ljava/util/concurrent/ConcurrentLinkedQueue;
// 8a: aload 1
// 8b: invokevirtual su/catlean/d.f ()Lnet/minecraft/class_2596;
// 8e: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.add (Ljava/lang/Object;)Z
// 91: pop
// 92: goto 9f
// 95: ldc2_w 3140063695299057051
// 98: lload 2
// 99: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e: athrow
// 9f: nop
// a0: iload 5
// a2: ireturn
}

private static final boolean j(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean y(d var0) {
long var1 = b ^ 117408672959563L;
long var3 = var1 ^ 100609952056397L;
uc var5 = Y;

try {
boolean var7 = false;
class_2596 var10000 = var0.f();
Intrinsics.checkNotNull(var10000, b<"q">(29800, 8038317981357769841L ^ var1));
var10000.method_65081((class_2547)zf.k(var3));
Object var9 = Result.constructor-impl(Unit.INSTANCE);
} catch (Throwable var8) {
Object var6 = Result.constructor-impl(ResultKt.createFailure(var8));
}

return true;
}

private static final boolean g(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = b ^ 96020141158510L;
long var10001 = var20 ^ 102020622713244L;
int var22 = (int)((var20 ^ 102020622713244L) >>> 48);
int var23 = (int)((var20 ^ 102020622713244L) << 16 >>> 32);
int var24 = (int)(var10001 << 48 >>> 48);
long var25 = var20 ^ 40049755286129L;
long var27 = var20 ^ 111125598490821L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[56];
int var16 = 0;
String var15 = "\u0006LõÙ\u0087\u000bÕe2Ã*¢7\u0087\u0004\u0002\u0010ñâ\u0014\u0080¹`í>ß\t(ºÃ(cÜ(HÄ\u0088Ñ$\u001e]u\u00admÄIBà1ìT¾C \u0086´ÜÁP\u00000Ü)Þ¼\u000f\u0000\u009c\u0006\u009cÿ5¨òØÈÉr§\u001açEY¡Y\u001aÜ\u0082\n\u0091²ï\u0018êC²\u0094\u0083\u0085pó8²j*©p½¯Ô =¨\u0097\u0012ðH3Àb6Q\u008c±ô÷¢îô[Ý\u0007Ì¤\u008eµö\u0087l%gÊld?ÈyCt¥\u009b\u0085§»Í\u008d\u001c\u008dÌS\u0085-cPl\u000f³\u0085î\u0013\u0001Â3À[\u0092*+õrh3\u009aá;\u000e@þ\\Ëi&¶\u0018\u001aJFX[\u009bê\u0019>Ä°^\u0018\u0011Ì\u008d²;\u0099¹eø[Ù\u0002_ëàmÑ\f3\u009e\u008e\tsìo×\u0097[[Z\u001f½\u0090ÿ\u0007\u0017\u0017\u0018Zólû«c\u0098\u00016:¡ä\u0084ªq\u0019TuJÀúE\u0087X\u0097xl|¬bH8æ&Ê@\u0087³m\u001c\u008f²\u009f\u0003¤à\u0010½>Ñ\u0087Ðèä\u008bà²äA¸ú\u0092`à\u0015Ê\u0086!\u0005ÃKC8ÀáÏÇNÞ\\.h,Ê\u0080\u007f¹= \u008eç5\u0019\f\u0019\u009däô\u001eòT´ø]äµ\u000f\u007fu&Ô\u001c½iwÝ\u0096íÔóì\u009e=»Kd²×Òiþëzô«%v¿\u0014k\t§j|%\u009c}\u008f\u0014ÁT\u008d\u0087O\u009b{\t_»)\u00adD\u001dÊÆ@iÙ\u0087{SàÆp\u00ad-).Õ(Ý\u0019Ô\u008aµI;j\u0093\u009cÈk\u0099\u0002.ãlÁlt¤\u001bÓë]Ë#\u0096RÑ®L¿4¬\u009eïÂºø[(\u001aa\u0084\u001a\nÚ´'ç{±\n\u0097òUrÉ£V\u0090Ü\u008bT\u0017>\u0087×Å-ssm=Ñb®Øq½\u0080!âÊM\u0000ª°s\u00954\u0011E\u008e²ð\u0017¿ü\u0007X\bêø\u009aET\u0010µÙ\u0019X=JA©\u009eiÍ\u0096k-ì\u0098\u0010l\u0081®½?\u0096ãçñ-¿ BÒ`C Ûÿ¾\fÈ²Æ\\¡òÒxâ~\nh²à\u0094\u0082Þc·\t¬w\u000fd_\u0089Õ4(ä\u0096Ç\u00ad\u001c\u0011«U´ú\u0015~cî\u00834\u0096ÐÖS6\u0002ºe`¼8\r\u0084©Wãz0l`\u0006~m]@S^f%þÛfêÙ\u001dwN\u0098ºIéúØ¨¶ò/Ú\u009aý\u0011«Ùd\u009c<\u0003$_ú¡\u001dbðp`ÂNº=\u001cÆ§\u0088Úg'v$YªÜ\u0007Pôîi\u0082Ø \u001c\u0092*Ø\nNÏôhª\u000f\"ZK$\u0095Å¨xèæ\u0099e@¶Ò\u0087\u008eúÁg¨\u0010´ío/\u0085¤¥¸ð\t\u0095\u000fÛþ\fG ó\u0010û@\u0083ÞM\u0085C[úG`Ø[®\u009a\u007f\u0002HPÕ=c'¨§\u0018ÁÇ\u008b\u009b Wö&LÕä©Y08<£Ec}Õ\u008c\u008dß\u0004j\u009cõ\u0013 Nì(âåy. t¯×æ,ÙÑ\fL\u009cÔ¦\u0006%\u008fæ,\u0091Ñ\u0084ïugPÛà¶à\u0005èÓ\f \u009fªJ\u008a|³·XòÔ£\u008f#\u0088Ù®\u0003-\u0007H\u000eô\u0005þ=v\u009b\u000e\rX\n,\u0010UB@8®\u000eì¹}\u0086ÏúeG÷è\u0010+ð\u001di\u009cx\u0002Þ·Þ\u0006¨\u0012`4ù\u0018s\u0016á\\1¡\u001f5/Q5kÚ7\u0000\u0098¾ÞãHøµÇ\u009d\u0010\u0094\u001bc±g3ô£\u009cO\u0091¬\u0089\u008a$Ä0È\u0088nt\u008d\u008bIG\u008dD?*Q\u0081\u0080°\u0018O\u0003M¬gÚ°\u009bï3N4Ø\u0099\u009fÍa\u000fÎÛbm==\u0097ú\u0001\u0086`ßÛ \u000b;fW.\u008fEñ'\rÆâð¢\u0015/ãåËÐ\u0095Ì1#*\u0098+S\u008b3x\u009d8L_û\u0019 óâp9ÙÕ\u001fÌ%2ÞÓwH\u0099Ñ\t\u0003!9.D\u0099÷r¬\u0093'SÕMx\u007fùì«FªEû`|i\u0095/\u0006@\u008eÎá\u00020\u0081Ü¼P=4ßº£;\u0085á\u0019)oæ4o\u001dÏý\u0014Ê)\u008fvÏôo\u0089y\u001b\nzL\u0007\"â\u00ad¼\u0019\u001cQÍªö£\b\u00185\u0082\u009b\fÐç}Iiò¼«\u0005í¦#â®A¬\"OÅ]\u0010\u0097Æ.\u009b³V7e\u009f&ÐV\u0012,D\u0097\u0018\u000f_\u0015<mh\u009af<\u0094f\u0000²\u008bzæ{-Ù\tÓr³Õ\u0018\u0006¾\u0080i}±}äïZèáú;\u0089}¸q\u00ad´c:uÂ s\u0007\u0083\u0096\u0094\u0019Àgª\u001fÄ\u008aj¼¿\u007f¾#Ö\u0098ë_\n\u0010ûÙ\u0089[[x)»\u0010\u0086&ÚDÛ\u008b¡ÿÛåN(k\u000b\u0003\u0099\u0018Øï:\u0017\u001ekY=\u0002}\u008a£\u001a¹ýýQ\u008eað\u007f\u0004Bwp¸\u0014'j\u0017Èã\u0011þX\u000e9ôU¹k¨]#\u0016ñ4\u000e=*DI\u0099\u0086\u0090J0(«Î±g\u0098\u0018|3\u0080ÃªãyÄûoú\u0005x÷\u0085¯\u0003Û\u0089\u0086\u0081\u009e\u0003ÁzçóA.\u0089»~\u009aú0\br\u0094\u00851ï\u0083¼Ã\u001e*®Â&\u001eWÿt.N?\u0091G·N½e,®ø\u0098î\t\u009ae\u0006ò|\u0018\u0006\u0087\u009fAZýQ\u0005,;Ð®\u0011\u009eúOÉªéäA5\u001c& õ3ùäì\u0001\u0096£w{\u000bº¨Õ\nÄ4\u0080¤©{*¬jAWg\u0093öÀá4p0oÒú\u0092\u008eÍ\f\u0096ÿÂ\u0006»Ê-\u0084®Û¬Á\u001e\u0090þv¡\u0015\u0089\u0089íùÕ\u0087À\u001f%#ÿ\u0098\u0007q»®ª\u009fä\u0015 \u008a_\u0014i®\\üñÿ¢1ê÷B&öÖ\fâ´Ç,\u000e Å\u0087ý´«I] ³¨\u001e\u0082JÀ\u0016±&%ju\u0010Â\u0081z8³\u001crÕV\u0089D·\u0014@Ag\u0089\u001b\u001f\u0081\u0018%ìh\nMí\u009dC{\\\u0097\\iø©{aÐoU\u007fó9¸ 3 \u009a\rñòÄ.â/\u0094¼ì¸\u0003ö\u001b\u000bLÄC/Á\u007f:Þ/-P\u00adÁ\u0013 \u0018¯\u0096_·¸)ÌÒbàw]W\u0090\u001cãº=®e\u009eQ\u008d R\u0085\u009f\u008bÿ{T\u0010U9!\u008aN±h;¨·Ðy·Qð\u0080 n÷¥>\b ¬æ\\\u0097 Èq|UÕ\u0003\u0084\u000bF#ù§À¸Ê\u0084§L\u0098K÷\u0018\u009f\u00adD`.Y\u0010Ó\u001dº\u008a,íß\u0086Þ\u0019l\u0004\u0016Ú]pÆ\u0010\u0004ñêÇf\u0084\r©|?\u009a\u000e:n¥\u007f ©¦\u0085Ùu\u0017\u0015ÔÝ\u0089\u0095 ï½Â\u0013\u008e\u0017\u0007\u0012ô\u0000\u008b\u008e½É\u001c«¡Ñ%`\u0018\u001fF\u0098'B\t«\nÞ\u001f³+Y;\u001fdÆ\u0094Fã\u0084Ï£\u009808Æ\u0003'ãö\u0088T\u0010>èsé\u000f\u008b4N\u0086\u0019®*÷G<ð\u0003°¦±`\u0011\u0016\u0000ÑÕ\u0000Ã*\u0083ó^\u0086F½{æ\u0018ñ0H/¦ó\u0005\u0006Äû\u000eÕÉçã0v£öj:Ãxq[H\u0010èöþ@·¨Ì\u008d8µF=Ç¨5\u0010Ä2½5?=H\u0010Ü\u0087ãÈ\n\u009b¥_ÚF\u000b\u0086\u0088s\u008bý\u0018HÏI\u0095ÖDä\u000fðë\u009c{W\u0087#×`¬L\u00ad\u008f0\u0013©(,¸¯Úñ\u0085Ïwë#D\u008cdf\u0015¸SqÍ\u0003\u009e¶|cô»_\u0019ó\u0011¢Þg¨Ô\u00961\u0083\u0015# Cá\u0014\u0080<8dØj-ú7*`\u009c6ÃI£k\u00adi¦Æ\u0089ÔáÃh¾°8 \u009eg{té\u008eÒ\u0080\nI5ó\u009dU\u0005Púe\u0087áÇÊâ\u0088gÅ\u000bÂß¹Üó\u0018\u0084h0®núp2\u0098#©+ÛWMG©NôÆ!GÉÈ\u0010\u001a®Ìd:b\u0017ÅÖÃöß\u0098\u0080.ð";
int var17 = "\u0006LõÙ\u0087\u000bÕe2Ã*¢7\u0087\u0004\u0002\u0010ñâ\u0014\u0080¹`í>ß\t(ºÃ(cÜ(HÄ\u0088Ñ$\u001e]u\u00admÄIBà1ìT¾C \u0086´ÜÁP\u00000Ü)Þ¼\u000f\u0000\u009c\u0006\u009cÿ5¨òØÈÉr§\u001açEY¡Y\u001aÜ\u0082\n\u0091²ï\u0018êC²\u0094\u0083\u0085pó8²j*©p½¯Ô =¨\u0097\u0012ðH3Àb6Q\u008c±ô÷¢îô[Ý\u0007Ì¤\u008eµö\u0087l%gÊld?ÈyCt¥\u009b\u0085§»Í\u008d\u001c\u008dÌS\u0085-cPl\u000f³\u0085î\u0013\u0001Â3À[\u0092*+õrh3\u009aá;\u000e@þ\\Ëi&¶\u0018\u001aJFX[\u009bê\u0019>Ä°^\u0018\u0011Ì\u008d²;\u0099¹eø[Ù\u0002_ëàmÑ\f3\u009e\u008e\tsìo×\u0097[[Z\u001f½\u0090ÿ\u0007\u0017\u0017\u0018Zólû«c\u0098\u00016:¡ä\u0084ªq\u0019TuJÀúE\u0087X\u0097xl|¬bH8æ&Ê@\u0087³m\u001c\u008f²\u009f\u0003¤à\u0010½>Ñ\u0087Ðèä\u008bà²äA¸ú\u0092`à\u0015Ê\u0086!\u0005ÃKC8ÀáÏÇNÞ\\.h,Ê\u0080\u007f¹= \u008eç5\u0019\f\u0019\u009däô\u001eòT´ø]äµ\u000f\u007fu&Ô\u001c½iwÝ\u0096íÔóì\u009e=»Kd²×Òiþëzô«%v¿\u0014k\t§j|%\u009c}\u008f\u0014ÁT\u008d\u0087O\u009b{\t_»)\u00adD\u001dÊÆ@iÙ\u0087{SàÆp\u00ad-).Õ(Ý\u0019Ô\u008aµI;j\u0093\u009cÈk\u0099\u0002.ãlÁlt¤\u001bÓë]Ë#\u0096RÑ®L¿4¬\u009eïÂºø[(\u001aa\u0084\u001a\nÚ´'ç{±\n\u0097òUrÉ£V\u0090Ü\u008bT\u0017>\u0087×Å-ssm=Ñb®Øq½\u0080!âÊM\u0000ª°s\u00954\u0011E\u008e²ð\u0017¿ü\u0007X\bêø\u009aET\u0010µÙ\u0019X=JA©\u009eiÍ\u0096k-ì\u0098\u0010l\u0081®½?\u0096ãçñ-¿ BÒ`C Ûÿ¾\fÈ²Æ\\¡òÒxâ~\nh²à\u0094\u0082Þc·\t¬w\u000fd_\u0089Õ4(ä\u0096Ç\u00ad\u001c\u0011«U´ú\u0015~cî\u00834\u0096ÐÖS6\u0002ºe`¼8\r\u0084©Wãz0l`\u0006~m]@S^f%þÛfêÙ\u001dwN\u0098ºIéúØ¨¶ò/Ú\u009aý\u0011«Ùd\u009c<\u0003$_ú¡\u001dbðp`ÂNº=\u001cÆ§\u0088Úg'v$YªÜ\u0007Pôîi\u0082Ø \u001c\u0092*Ø\nNÏôhª\u000f\"ZK$\u0095Å¨xèæ\u0099e@¶Ò\u0087\u008eúÁg¨\u0010´ío/\u0085¤¥¸ð\t\u0095\u000fÛþ\fG ó\u0010û@\u0083ÞM\u0085C[úG`Ø[®\u009a\u007f\u0002HPÕ=c'¨§\u0018ÁÇ\u008b\u009b Wö&LÕä©Y08<£Ec}Õ\u008c\u008dß\u0004j\u009cõ\u0013 Nì(âåy. t¯×æ,ÙÑ\fL\u009cÔ¦\u0006%\u008fæ,\u0091Ñ\u0084ïugPÛà¶à\u0005èÓ\f \u009fªJ\u008a|³·XòÔ£\u008f#\u0088Ù®\u0003-\u0007H\u000eô\u0005þ=v\u009b\u000e\rX\n,\u0010UB@8®\u000eì¹}\u0086ÏúeG÷è\u0010+ð\u001di\u009cx\u0002Þ·Þ\u0006¨\u0012`4ù\u0018s\u0016á\\1¡\u001f5/Q5kÚ7\u0000\u0098¾ÞãHøµÇ\u009d\u0010\u0094\u001bc±g3ô£\u009cO\u0091¬\u0089\u008a$Ä0È\u0088nt\u008d\u008bIG\u008dD?*Q\u0081\u0080°\u0018O\u0003M¬gÚ°\u009bï3N4Ø\u0099\u009fÍa\u000fÎÛbm==\u0097ú\u0001\u0086`ßÛ \u000b;fW.\u008fEñ'\rÆâð¢\u0015/ãåËÐ\u0095Ì1#*\u0098+S\u008b3x\u009d8L_û\u0019 óâp9ÙÕ\u001fÌ%2ÞÓwH\u0099Ñ\t\u0003!9.D\u0099÷r¬\u0093'SÕMx\u007fùì«FªEû`|i\u0095/\u0006@\u008eÎá\u00020\u0081Ü¼P=4ßº£;\u0085á\u0019)oæ4o\u001dÏý\u0014Ê)\u008fvÏôo\u0089y\u001b\nzL\u0007\"â\u00ad¼\u0019\u001cQÍªö£\b\u00185\u0082\u009b\fÐç}Iiò¼«\u0005í¦#â®A¬\"OÅ]\u0010\u0097Æ.\u009b³V7e\u009f&ÐV\u0012,D\u0097\u0018\u000f_\u0015<mh\u009af<\u0094f\u0000²\u008bzæ{-Ù\tÓr³Õ\u0018\u0006¾\u0080i}±}äïZèáú;\u0089}¸q\u00ad´c:uÂ s\u0007\u0083\u0096\u0094\u0019Àgª\u001fÄ\u008aj¼¿\u007f¾#Ö\u0098ë_\n\u0010ûÙ\u0089[[x)»\u0010\u0086&ÚDÛ\u008b¡ÿÛåN(k\u000b\u0003\u0099\u0018Øï:\u0017\u001ekY=\u0002}\u008a£\u001a¹ýýQ\u008eað\u007f\u0004Bwp¸\u0014'j\u0017Èã\u0011þX\u000e9ôU¹k¨]#\u0016ñ4\u000e=*DI\u0099\u0086\u0090J0(«Î±g\u0098\u0018|3\u0080ÃªãyÄûoú\u0005x÷\u0085¯\u0003Û\u0089\u0086\u0081\u009e\u0003ÁzçóA.\u0089»~\u009aú0\br\u0094\u00851ï\u0083¼Ã\u001e*®Â&\u001eWÿt.N?\u0091G·N½e,®ø\u0098î\t\u009ae\u0006ò|\u0018\u0006\u0087\u009fAZýQ\u0005,;Ð®\u0011\u009eúOÉªéäA5\u001c& õ3ùäì\u0001\u0096£w{\u000bº¨Õ\nÄ4\u0080¤©{*¬jAWg\u0093öÀá4p0oÒú\u0092\u008eÍ\f\u0096ÿÂ\u0006»Ê-\u0084®Û¬Á\u001e\u0090þv¡\u0015\u0089\u0089íùÕ\u0087À\u001f%#ÿ\u0098\u0007q»®ª\u009fä\u0015 \u008a_\u0014i®\\üñÿ¢1ê÷B&öÖ\fâ´Ç,\u000e Å\u0087ý´«I] ³¨\u001e\u0082JÀ\u0016±&%ju\u0010Â\u0081z8³\u001crÕV\u0089D·\u0014@Ag\u0089\u001b\u001f\u0081\u0018%ìh\nMí\u009dC{\\\u0097\\iø©{aÐoU\u007fó9¸ 3 \u009a\rñòÄ.â/\u0094¼ì¸\u0003ö\u001b\u000bLÄC/Á\u007f:Þ/-P\u00adÁ\u0013 \u0018¯\u0096_·¸)ÌÒbàw]W\u0090\u001cãº=®e\u009eQ\u008d R\u0085\u009f\u008bÿ{T\u0010U9!\u008aN±h;¨·Ðy·Qð\u0080 n÷¥>\b ¬æ\\\u0097 Èq|UÕ\u0003\u0084\u000bF#ù§À¸Ê\u0084§L\u0098K÷\u0018\u009f\u00adD`.Y\u0010Ó\u001dº\u008a,íß\u0086Þ\u0019l\u0004\u0016Ú]pÆ\u0010\u0004ñêÇf\u0084\r©|?\u009a\u000e:n¥\u007f ©¦\u0085Ùu\u0017\u0015ÔÝ\u0089\u0095 ï½Â\u0013\u008e\u0017\u0007\u0012ô\u0000\u008b\u008e½É\u001c«¡Ñ%`\u0018\u001fF\u0098'B\t«\nÞ\u001f³+Y;\u001fdÆ\u0094Fã\u0084Ï£\u009808Æ\u0003'ãö\u0088T\u0010>èsé\u000f\u008b4N\u0086\u0019®*÷G<ð\u0003°¦±`\u0011\u0016\u0000ÑÕ\u0000Ã*\u0083ó^\u0086F½{æ\u0018ñ0H/¦ó\u0005\u0006Äû\u000eÕÉçã0v£öj:Ãxq[H\u0010èöþ@·¨Ì\u008d8µF=Ç¨5\u0010Ä2½5?=H\u0010Ü\u0087ãÈ\n\u009b¥_ÚF\u000b\u0086\u0088s\u008bý\u0018HÏI\u0095ÖDä\u000fðë\u009c{W\u0087#×`¬L\u00ad\u008f0\u0013©(,¸¯Úñ\u0085Ïwë#D\u008cdf\u0015¸SqÍ\u0003\u009e¶|cô»_\u0019ó\u0011¢Þg¨Ô\u00961\u0083\u0015# Cá\u0014\u0080<8dØj-ú7*`\u009c6ÃI£k\u00adi¦Æ\u0089ÔáÃh¾°8 \u009eg{té\u008eÒ\u0080\nI5ó\u009dU\u0005Púe\u0087áÇÊâ\u0088gÅ\u000bÂß¹Üó\u0018\u0084h0®núp2\u0098#©+ÛWMG©NôÆ!GÉÈ\u0010\u001a®Ìd:b\u0017ÅÖÃöß\u0098\u0080.ð"
.length();
char var14 = 16;
int var32 = -1;

label54:
while (true) {
String var34 = var15.substring(++var32, var32 + var14);
byte var38 = -1;

while (true) {
byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
String var47 = b(var19).intern();
switch (var38) {
case 0:
var18[var16++] = var47;
if ((var32 += var14) >= var17) {
c = var18;
e = new String[56];
n = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[25];
int var3 = 0;
String var4 = "å\u009c\u00adMG\u007fit\u0095\u000f\u00adÝÚ\u0095\u0014\u0086ìCw`\u0096~G\u0085åª\u0090)¦¢PF\u001drÇyÆÎB÷=Î3INv(#M§-ÝÑ£ÿw|R@Å¹þE\u009e®Â\u0018w\u008a\u008a¨xyh\u0015\u001a\u008e\u001c\u000f\u0000{._É<9àÆ{PF\tgl\u0095xù\u0010|fL.;¦5\n\u0005\u009bBj?\u0088ô\u001bwÚX\u0017±m\u00858£å\u0092)\u008cl×Lt\u00005<¸æ%¼\f$\u008fº¶!âÕ\u0084\u009c\u0099aÖØÄ\u0098ÁÈ\u0088\u0098ðd\u0019\"è±±5\u008cØÈf\u008eÖú\u009au\u0096¼ÆE³»¸/e";
int var5 = "å\u009c\u00adMG\u007fit\u0095\u000f\u00adÝÚ\u0095\u0014\u0086ìCw`\u0096~G\u0085åª\u0090)¦¢PF\u001drÇyÆÎB÷=Î3INv(#M§-ÝÑ£ÿw|R@Å¹þE\u009e®Â\u0018w\u008a\u008a¨xyh\u0015\u001a\u008e\u001c\u000f\u0000{._É<9àÆ{PF\tgl\u0095xù\u0010|fL.;¦5\n\u0005\u009bBj?\u0088ô\u001bwÚX\u0017±m\u00858£å\u0092)\u008cl×Lt\u00005<¸æ%¼\f$\u008fº¶!âÕ\u0084\u009c\u0099aÖØÄ\u0098ÁÈ\u0088\u0098ðd\u0019\"è±±5\u008cØÈf\u008eÖú\u009au\u0096¼ÆE³»¸/e"
.length();
byte var2 = 0;

label36:
while (true) {
byte var42 = var2;
var2 += 8;
byte[] var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
long[] var37 = var6;
int var43 = var3++;
long var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var56 = -1;

while (true) {
long var8 = var51;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var58 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var56) {
case 0:
var37[var43] = var58;
if (var2 >= var5) {
k = var6;
m = new Integer[25];
KProperty[] var29 = new KProperty[c<"t">(22635, 9112435172097438756L ^ var20)];
var29[0] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(26325, 1937977686018747085L ^ var20), b<"q">(10658, 867975973326824883L ^ var20), 0)
);
var29[1] = Reflection.property1(new PropertyReference1Impl(uc.class, b<"q">(6196, 6587036902521279547L ^ var20), b<"q">(5139, 1547132056994912294L ^ var20), 0));
var29[2] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(12733, 2759727794939739536L ^ var20), b<"q">(16603, 6905175308362665160L ^ var20), 0)
);
var29[3] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(27706, 3871272010178027534L ^ var20), b<"q">(22802, 5009687202845316383L ^ var20), 0)
);
var29[4] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(23519, 5037116926505342913L ^ var20), b<"q">(13825, 7943124340603435558L ^ var20), 0)
);
var29[5] = Reflection.property1(new PropertyReference1Impl(uc.class, b<"q">(30382, 200924324582881958L ^ var20), b<"q">(1168, 1536168590852786311L ^ var20), 0));
var29[c<"t">(16521, 5607888968169499869L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(3376, 6627724902218563840L ^ var20), b<"q">(26510, 8500481736276044679L ^ var20), 0)
);
var29[c<"t">(956, 84013004884307936L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(8171, 6595727968621597650L ^ var20), b<"q">(12904, 6796866175007505992L ^ var20), 0)
);
var29[c<"t">(8537, 2707855865121426709L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(27917, 4089272938723369254L ^ var20), b<"q">(10058, 4912204840567417670L ^ var20), 0)
);
var29[c<"t">(17184, 6884951266886791034L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(15937, 3076327594790629992L ^ var20), b<"q">(18754, 1897404051314656612L ^ var20), 0)
);
var29[c<"t">(15645, 1260135772298957124L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(16327, 3993418242208747L ^ var20), b<"q">(26856, 5042007012975961287L ^ var20), 0)
);
var29[c<"t">(12584, 2561296689881963878L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(28371, 7280830930252980972L ^ var20), b<"q">(3843, 7647433671486702344L ^ var20), 0)
);
var29[c<"t">(4245, 8640387039913213131L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(13956, 5773671156655012535L ^ var20), b<"q">(16608, 8276783665071148226L ^ var20), 0)
);
var29[c<"t">(22047, 3515450838101277255L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(uc.class, b<"q">(4925, 93157837403725604L ^ var20), b<"q">(28815, 1033075226092665985L ^ var20), 0)
);
X = var29;
Y = new uc((char)var22, var23, (char)var24);
N = yp.L(Y, b<"q">(24925, 2766429774262365527L ^ var20), fb.GRIM, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null, var27);
P = yp.L(Y, b<"q">(19865, 949992525995524519L ^ var20), mq.Silent, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null, var27);
j = yp.t(Y, b<"q">(5230, 3621323829916801110L ^ var20), true, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
W = yp.t(Y, b<"q">(17425, 8865617780152584199L ^ var20), false, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
f = yp.t(Y, b<"q">(29226, 3273504391361297975L ^ var20), false, var25, null, uc::W, 4, null);
w = yp.t(Y, b<"q">(24294, 1291909052483752691L ^ var20), true, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
d = yp.t(Y, b<"q">(29726, 5137260771824433199L ^ var20), true, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
O = yp.t(Y, b<"q">(6021, 2232675045316205476L ^ var20), false, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
J = yp.t(Y, b<"q">(409, 6699292626556358076L ^ var20), true, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
A = yp.t(Y, b<"q">(9619, 754790784903391625L ^ var20), false, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
a = yp.t(Y, b<"q">(2464, 3872148794222675351L ^ var20), false, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
L = yp.t(Y, b<"q">(22921, 6133135363187070354L ^ var20), false, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
y = yp.t(Y, b<"q">(28444, 292571810248614706L ^ var20), true, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
B = yp.t(Y, b<"q">(28352, 7465880641431233236L ^ var20), false, var25, null, null, c<"t">(23117, 4891801464235472402L ^ var20), null);
V = new bg();
var10001 = 2187973559658555724L ^ var20;
ConcurrentLinkedQueue var53 = Queues.newConcurrentLinkedQueue();
Intrinsics.checkNotNullExpressionValue(var53, b<"q">(11239, 530580075665532877L ^ var20));
o = var53;
ConcurrentLinkedQueue var54 = Queues.newConcurrentLinkedQueue();
Intrinsics.checkNotNullExpressionValue(var54, b<"q">(16830, 8721837619530354070L ^ var20));
S = var54;
l = new bg();
class_2338[] var33 = new class_2338[c<"t">(17669, var10001)];
var33[0] = new class_2338(0, 0, 0);
var33[1] = new class_2338(-1, 0, 0);
var33[2] = new class_2338(1, 0, 0);
var33[3] = new class_2338(0, 0, 1);
var33[4] = new class_2338(0, 0, -1);
var33[5] = new class_2338(c<"t">(13181, 777978445117415211L ^ var20), 0, 0);
var33[c<"t">(389, 8974601328402820560L ^ var20)] = new class_2338(2, 0, 0);
var33[c<"t">(956, 84013004884307936L ^ var20)] = new class_2338(0, 0, 2);
var33[c<"t">(26624, 8486185577964799067L ^ var20)] = new class_2338(0, 0, c<"t">(2836, 5178603044517013317L ^ var20));
var33[c<"t">(5290, 3789932438930946301L ^ var20)] = new class_2338(0, -1, 0);
var33[c<"t">(3335, 7584658953544655180L ^ var20)] = new class_2338(1, -1, 0);
var33[c<"t">(13236, 431249389526441961L ^ var20)] = new class_2338(-1, -1, 0);
var33[c<"t">(23117, 4891801464235472402L ^ var20)] = new class_2338(0, -1, 1);
var33[c<"t">(26574, 7915686125321096094L ^ var20)] = new class_2338(0, -1, -1);
D = var33;
return;
}
break;
default:
var37[var43] = var58;
if (var2 < var5) {
continue label36;
}

var4 = "©l±ð\n®?\u001d_Å\u001bQy\u0098¬ö";
var5 = "©l±ð\n®?\u001d_Å\u001bQy\u0098¬ö".length();
var2 = 0;
}

byte var44 = var2;
var2 += 8;
var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
var37 = var6;
var43 = var3++;
var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var56 = 0;
}
}
}

var14 = var15.charAt(var32);
break;
default:
var18[var16++] = var47;
if ((var32 += var14) < var17) {
var14 = var15.charAt(var32);
continue label54;
}

var15 = "\u0002:V«Á\u009e<¦q\u001b\u0087Ýñ4n\u0013\n\u008cV@\u001aÔfÖ\u0013·}º\"Ø\u0001R\u0087\u0003\u0012i\u001e¢\u001eR\u0010ô\u0016-ÞÄøð]0` Ù\u009c\"þÉ";
var17 = "\u0002:V«Á\u009e<¦q\u001b\u0087Ýñ4n\u0013\n\u008cV@\u001aÔfÖ\u0013·}º\"Ø\u0001R\u0087\u0003\u0012i\u001e¢\u001eR\u0010ô\u0016-ÞÄøð]0` Ù\u009c\"þÉ"
.length();
var14 = '(';
var32 = -1;
}

var34 = var15.substring(++var32, var32 + var14);
var38 = 0;
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8348;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/uc", var10);
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
throw new RuntimeException("su/catlean/uc" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 16636;
if (m[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = k[var3];
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
throw new RuntimeException("su/catlean/uc", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
m[var3] = var15;
}

return m[var3];
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
throw new RuntimeException("su/catlean/uc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
