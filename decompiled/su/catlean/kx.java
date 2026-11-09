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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2672;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.world.BlockStateEvent;
import su.catlean.gofra.Flow;

public final class kx extends _g {
@NotNull
public static final kx E;
static final KProperty[] z;
@NotNull
private static final az K;
@NotNull
private static final cj V;
@NotNull
private static final cq D;
@NotNull
private static final c8 y;
@NotNull
private static final cq u;
@NotNull
private static final cs x;
@NotNull
private static final cq t;
@NotNull
private static final cq a;
@NotNull
private static final cq b;
@NotNull
private static final ArrayList L;
private static final ExecutorService c;
@NotNull
private static final bg O;
private static long J;
private static boolean m;
private static final long d = yz.a(-3048513154843461334L, -3887378791680686365L, MethodHandles.lookup().lookupClass()).a(90942984204258L);
private static final String[] e;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map j;

private kx(int var1, short var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ d;
long var6 = var4 ^ 95575367005090L;
super(b<"d">(27647, 5382861717234410806L ^ var4), jt.z(), null, 4, null, var6);
}

private final dg v(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 70277135841191L;
return (dg)K.E(this, var3, z[0]);
}

private final void W(long var1, dg var3) {
var1 = d ^ var1;
long var4 = var1 ^ 115525491749903L;
K.b(this, var4, z[0], var3);
}

private final d4 g(long var1, short var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ d;
long var6 = var4 ^ 89066946297291L;
return (d4)V.E(this, var6, z[1]);
}

private final void n(long var1, d4 var3) {
var1 = d ^ var1;
long var4 = var1 ^ 32490398676683L;
V.b(this, var4, z[1], var3);
}

private final boolean t(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 109750037230261L;
return (Boolean)D.E(this, var3, z[2]);
}

private final int V(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 114469593826525L;
return ((Number)y.E(this, var3, z[3])).intValue();
}

private final boolean L(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 17680887081085L;
return (Boolean)u.E(this, var3, z[4]);
}

private final Color C(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 43308342053365L;
return (Color)x.E(this, var3, z[5]);
}

private final boolean j(int var1, char var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ d;
long var6 = var4 ^ 71321313375705L;
return (Boolean)t.E(this, var6, z[c<"a">(18841, 4983537029349101590L ^ var4)]);
}

private final boolean q(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 84179206956695L;
return (Boolean)a.E(this, var3, z[c<"a">(14004, 9135713432309415037L ^ var1)]);
}

private final boolean F(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 11617341761785L;
return (Boolean)b.E(this, var3, z[c<"a">(1520, 8335392886920708440L ^ var1)]);
}

@Override
public void O(long var1) {
L.clear();
J = System.currentTimeMillis();
m = true;
}

@Flow
public final void p(@NotNull PlayerUpdateEvent e) {
long var2 = d ^ 127297034226434L;

try {
Intrinsics.checkNotNullParameter(ex, "e");
if (m) {
c.submit(kx::P);
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -9082339193296195614L, var2);
}
}

@Flow
public final void W(@NotNull BlockStateEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
c.submit(kx::F);
}

@Flow
public final void j(@NotNull AfterReceivePacket e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kx.d J
// 03: ldc2_w 118138824403652
// 06: lxor
// 07: lstore 2
// 08: ldc2_w -6911282880438054323
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: aload 1
// 12: ldc "e"
// 14: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 17: astore 4
// 19: aload 1
// 1a: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 1d: aload 4
// 1f: ifnonnull 57
// 22: instanceof net/minecraft/class_2672
// 25: ifeq 6c
// 28: goto 35
// 2b: ldc2_w -6903151627607159260
// 2e: lload 2
// 2f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: athrow
// 35: aload 1
// 36: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 39: dup
// 3a: sipush 11415
// 3d: ldc2_w 6865659762107506913
// 40: lload 2
// 41: lxor
// 42: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 4a: goto 57
// 4d: ldc2_w -6903151627607159260
// 50: lload 2
// 51: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56: athrow
// 57: checkcast net/minecraft/class_2672
// 5a: astore 5
// 5c: getstatic su/catlean/kx.c Ljava/util/concurrent/ExecutorService;
// 5f: aload 5
// 61: invokedynamic run (Lnet/minecraft/class_2672;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/kx.F (Lnet/minecraft/class_2672;)V, ()V ]
// 66: invokeinterface java/util/concurrent/ExecutorService.submit (Ljava/lang/Runnable;)Ljava/util/concurrent/Future; 2
// 6b: pop
// 6c: return
}

private final void Z() {
m = false;
c.submit(kx::I);
}

private final List k(class_1923 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kx.d J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 63401102959933
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 61663171435232
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 71647794833342
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 16572146173793
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 16349273130165
// 027: lxor
// 028: lstore 12
// 02a: pop2
// 02b: ldc2_w -3776775327501895219
// 02e: lload 2
// 02f: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 034: new java/util/ArrayList
// 037: dup
// 038: invokespecial java/util/ArrayList.<init> ()V
// 03b: checkcast java/util/List
// 03e: astore 15
// 040: astore 14
// 042: new net/minecraft/class_2338$class_2339
// 045: dup
// 046: invokespecial net/minecraft/class_2338$class_2339.<init> ()V
// 049: astore 16
// 04b: aload 1
// 04c: getfield net/minecraft/class_1923.field_9181 I
// 04f: sipush 21814
// 052: ldc2_w 3592277697485324057
// 055: lload 2
// 056: lxor
// 057: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05c: imul
// 05d: istore 17
// 05f: aload 1
// 060: getfield net/minecraft/class_1923.field_9180 I
// 063: sipush 16803
// 066: ldc2_w 1410404392905452437
// 069: lload 2
// 06a: lxor
// 06b: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: imul
// 071: istore 18
// 073: sipush 11042
// 076: ldc2_w 3979069623715217679
// 079: lload 2
// 07a: lxor
// 07b: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: istore 19
// 082: iload 19
// 084: sipush 7732
// 087: ldc2_w 1363901268375860225
// 08a: lload 2
// 08b: lxor
// 08c: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: if_icmpge 1a9
// 094: bipush 0
// 095: istore 20
// 097: iload 20
// 099: sipush 16803
// 09c: ldc2_w 1410404392905452437
// 09f: lload 2
// 0a0: lxor
// 0a1: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: if_icmpge 19b
// 0a9: bipush 0
// 0aa: aload 14
// 0ac: ifnonnull 084
// 0af: istore 21
// 0b1: iload 21
// 0b3: sipush 16803
// 0b6: ldc2_w 1410404392905452437
// 0b9: lload 2
// 0ba: lxor
// 0bb: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: if_icmpge 18d
// 0c3: aload 16
// 0c5: iload 17
// 0c7: iload 20
// 0c9: iadd
// 0ca: iload 19
// 0cc: iload 18
// 0ce: iload 21
// 0d0: iadd
// 0d1: invokevirtual net/minecraft/class_2338$class_2339.method_10103 (III)Lnet/minecraft/class_2338$class_2339;
// 0d4: pop
// 0d5: lload 8
// 0d7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0da: aload 16
// 0dc: checkcast net/minecraft/class_2338
// 0df: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0e2: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0e5: dup
// 0e6: sipush 3594
// 0e9: ldc2_w 6563289613063367116
// 0ec: lload 2
// 0ed: lxor
// 0ee: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f6: astore 22
// 0f8: aload 14
// 0fa: lload 2
// 0fb: lconst_0
// 0fc: lcmp
// 0fd: ifle 18a
// 100: ifnonnull 188
// 103: aload 0
// 104: lload 10
// 106: aload 22
// 108: invokespecial su/catlean/kx.B (JLnet/minecraft/class_2248;)Z
// 10b: aload 14
// 10d: ifnonnull 099
// 110: lload 2
// 111: lconst_0
// 112: lcmp
// 113: iflt 0aa
// 116: goto 123
// 119: ldc2_w -3768644116161059420
// 11c: lload 2
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: ifeq 185
// 126: aload 15
// 128: new su/catlean/mw
// 12b: dup
// 12c: aload 16
// 12e: invokevirtual net/minecraft/class_2338$class_2339.method_10062 ()Lnet/minecraft/class_2338;
// 131: dup
// 132: sipush 15217
// 135: ldc2_w 5375895360943660198
// 138: lload 2
// 139: lxor
// 13a: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 142: aload 0
// 143: lload 4
// 145: invokespecial su/catlean/kx.L (J)Z
// 148: ifeq 174
// 14b: goto 158
// 14e: ldc2_w -3768644116161059420
// 151: lload 2
// 152: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: athrow
// 158: new java/awt/Color
// 15b: dup
// 15c: aload 22
// 15e: invokevirtual net/minecraft/class_2248.method_26403 ()Lnet/minecraft/class_3620;
// 161: getfield net/minecraft/class_3620.field_16011 I
// 164: invokespecial java/awt/Color.<init> (I)V
// 167: goto 17a
// 16a: ldc2_w -3768644116161059420
// 16d: lload 2
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: aload 0
// 175: lload 12
// 177: invokespecial su/catlean/kx.C (J)Ljava/awt/Color;
// 17a: lload 6
// 17c: invokespecial su/catlean/mw.<init> (Lnet/minecraft/class_2338;Ljava/awt/Color;J)V
// 17f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 184: pop
// 185: iinc 21 1
// 188: aload 14
// 18a: ifnull 0b1
// 18d: iinc 20 1
// 190: aload 14
// 192: lload 2
// 193: lconst_0
// 194: lcmp
// 195: ifle 1a6
// 198: ifnull 097
// 19b: iinc 19 1
// 19e: lload 2
// 19f: lconst_0
// 1a0: lcmp
// 1a1: ifle 0a9
// 1a4: aload 14
// 1a6: ifnull 082
// 1a9: lload 2
// 1aa: lconst_0
// 1ab: lcmp
// 1ac: ifle 094
// 1af: aload 15
// 1b1: areturn
}

@Flow
public final void r(@NotNull Render3DEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kx.d J
// 003: ldc2_w 105561313209229
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 117540411391478
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 56703744981186
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
// 031: dup2
// 032: ldc2_w 45148440310737
// 035: lxor
// 036: dup2
// 037: bipush 56
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 8
// 040: lshl
// 041: bipush 8
// 043: lushr
// 044: lstore 10
// 046: pop2
// 047: dup2
// 048: ldc2_w 50406292731195
// 04b: lxor
// 04c: lstore 12
// 04e: dup2
// 04f: ldc2_w 53695421665268
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 46529695043440
// 059: lxor
// 05a: lstore 16
// 05c: dup2
// 05d: ldc2_w 79532156292471
// 060: lxor
// 061: lstore 18
// 063: dup2
// 064: ldc2_w 73738104935740
// 067: lxor
// 068: lstore 20
// 06a: dup2
// 06b: ldc2_w 105676059365968
// 06e: lxor
// 06f: dup2
// 070: bipush 32
// 072: lushr
// 073: l2i
// 074: istore 22
// 076: dup2
// 077: bipush 32
// 079: lshl
// 07a: bipush 48
// 07c: lushr
// 07d: l2i
// 07e: istore 23
// 080: dup2
// 081: bipush 48
// 083: lshl
// 084: bipush 48
// 086: lushr
// 087: l2i
// 088: istore 24
// 08a: pop2
// 08b: dup2
// 08c: ldc2_w 126869055832773
// 08f: lxor
// 090: dup2
// 091: bipush 48
// 093: lushr
// 094: l2i
// 095: istore 25
// 097: dup2
// 098: bipush 16
// 09a: lshl
// 09b: bipush 32
// 09d: lushr
// 09e: l2i
// 09f: istore 26
// 0a1: dup2
// 0a2: bipush 48
// 0a4: lshl
// 0a5: bipush 48
// 0a7: lushr
// 0a8: l2i
// 0a9: istore 27
// 0ab: pop2
// 0ac: dup2
// 0ad: ldc2_w 81649673024464
// 0b0: lxor
// 0b1: lstore 28
// 0b3: dup2
// 0b4: ldc2_w 119082964533534
// 0b7: lxor
// 0b8: lstore 30
// 0ba: dup2
// 0bb: ldc2_w 80115384771412
// 0be: lxor
// 0bf: lstore 32
// 0c1: dup2
// 0c2: ldc2_w 125073034271298
// 0c5: lxor
// 0c6: dup2
// 0c7: bipush 16
// 0c9: lushr
// 0ca: lstore 34
// 0cc: dup2
// 0cd: bipush 48
// 0cf: lshl
// 0d0: bipush 48
// 0d2: lushr
// 0d3: l2i
// 0d4: istore 36
// 0d6: pop2
// 0d7: dup2
// 0d8: ldc2_w 109996821807137
// 0db: lxor
// 0dc: lstore 37
// 0de: dup2
// 0df: ldc2_w 68848652380538
// 0e2: lxor
// 0e3: lstore 39
// 0e5: dup2
// 0e6: ldc2_w 66723851986295
// 0e9: lxor
// 0ea: lstore 41
// 0ec: dup2
// 0ed: ldc2_w 8395925925500
// 0f0: lxor
// 0f1: lstore 43
// 0f3: pop2
// 0f4: ldc2_w 7016392327668863748
// 0f7: lload 2
// 0f8: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: aload 1
// 0fe: ldc "e"
// 100: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 103: astore 45
// 105: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 108: invokevirtual java/util/ArrayList.isEmpty ()Z
// 10b: aload 45
// 10d: ifnonnull 155
// 110: ifeq 154
// 113: goto 120
// 116: ldc2_w 7023961035747495789
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: aload 0
// 121: lload 34
// 123: iload 36
// 125: i2s
// 126: invokespecial su/catlean/kx.g (JS)Lsu/catlean/d4;
// 129: invokevirtual su/catlean/d4.q ()Ljava/util/List;
// 12c: invokeinterface java/util/List.isEmpty ()Z 1
// 131: aload 45
// 133: ifnonnull 155
// 136: goto 143
// 139: ldc2_w 7023961035747495789
// 13c: lload 2
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: ifeq 154
// 146: goto 153
// 149: ldc2_w 7023961035747495789
// 14c: lload 2
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: return
// 154: bipush 0
// 155: istore 46
// 157: getstatic su/catlean/nk.f Lsu/catlean/nk;
// 15a: invokevirtual su/catlean/nk.D ()I
// 15d: aload 45
// 15f: ifnonnull 1cd
// 162: sipush 1520
// 165: ldc2_w 8335457900240028954
// 168: lload 2
// 169: lxor
// 16a: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: if_icmpge 1c7
// 172: goto 17f
// 175: ldc2_w 7023961035747495789
// 178: lload 2
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: lload 28
// 181: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 184: getfield net/minecraft/class_746.field_6012 I
// 187: aload 45
// 189: ifnonnull 1cd
// 18c: goto 199
// 18f: ldc2_w 7023961035747495789
// 192: lload 2
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: sipush 16077
// 19c: ldc2_w 1596020416269942309
// 19f: lload 2
// 1a0: lxor
// 1a1: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: if_icmple 1c7
// 1a9: goto 1b6
// 1ac: ldc2_w 7023961035747495789
// 1af: lload 2
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: aload 0
// 1b7: lload 37
// 1b9: invokevirtual su/catlean/kx.d (J)V
// 1bc: return
// 1bd: ldc2_w 7023961035747495789
// 1c0: lload 2
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: aload 0
// 1c8: lload 30
// 1ca: invokespecial su/catlean/kx.q (J)Z
// 1cd: aload 45
// 1cf: ifnonnull 1f5
// 1d2: ifne 1f8
// 1d5: goto 1e2
// 1d8: ldc2_w 7023961035747495789
// 1db: lload 2
// 1dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: athrow
// 1e2: aload 0
// 1e3: lload 16
// 1e5: invokespecial su/catlean/kx.F (J)Z
// 1e8: goto 1f5
// 1eb: ldc2_w 7023961035747495789
// 1ee: lload 2
// 1ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: athrow
// 1f5: ifeq 718
// 1f8: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 1fb: checkcast java/lang/Iterable
// 1fe: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
// 201: dup
// 202: sipush 10867
// 205: ldc2_w 1411434116181469036
// 208: lload 2
// 209: lxor
// 20a: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 212: checkcast java/lang/Iterable
// 215: invokestatic kotlin/collections/CollectionsKt.filterNotNull (Ljava/lang/Iterable;)Ljava/util/List;
// 218: checkcast java/lang/Iterable
// 21b: astore 48
// 21d: bipush 0
// 21e: istore 49
// 220: aload 48
// 222: new su/catlean/x6
// 225: dup
// 226: invokespecial su/catlean/x6.<init> ()V
// 229: checkcast java/util/Comparator
// 22c: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 22f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 234: astore 47
// 236: aload 47
// 238: invokeinterface java/util/Iterator.hasNext ()Z 1
// 23d: ifeq 4ba
// 240: aload 47
// 242: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 247: checkcast su/catlean/l0
// 24a: astore 48
// 24c: aload 48
// 24e: invokevirtual su/catlean/l0.z ()Ljava/util/List;
// 251: checkcast java/lang/Iterable
// 254: astore 50
// 256: bipush 0
// 257: istore 51
// 259: aload 50
// 25b: new su/catlean/py
// 25e: dup
// 25f: invokespecial su/catlean/py.<init> ()V
// 262: checkcast java/util/Comparator
// 265: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 268: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 26d: astore 49
// 26f: aload 49
// 271: invokeinterface java/util/Iterator.hasNext ()Z 1
// 276: ifeq 236
// 279: aload 49
// 27b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 280: checkcast su/catlean/mw
// 283: astore 50
// 285: iload 46
// 287: aload 45
// 289: ifnonnull 276
// 28c: aload 45
// 28e: ifnonnull 23d
// 291: aload 45
// 293: ifnonnull 319
// 296: aload 0
// 297: lload 32
// 299: invokespecial su/catlean/kx.V (J)I
// 29c: if_icmple 2d4
// 29f: goto 2ac
// 2a2: ldc2_w 7023961035747495789
// 2a5: lload 2
// 2a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ab: athrow
// 2ac: aload 0
// 2ad: lload 20
// 2af: invokespecial su/catlean/kx.t (J)Z
// 2b2: aload 45
// 2b4: ifnonnull 319
// 2b7: goto 2c4
// 2ba: ldc2_w 7023961035747495789
// 2bd: lload 2
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: ifne 26f
// 2c7: goto 2d4
// 2ca: ldc2_w 7023961035747495789
// 2cd: lload 2
// 2ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d3: athrow
// 2d4: aload 50
// 2d6: invokevirtual su/catlean/mw.P ()Lnet/minecraft/class_2338;
// 2d9: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 2dc: aload 0
// 2dd: lload 28
// 2df: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e2: iload 9
// 2e4: i2b
// 2e5: swap
// 2e6: lload 10
// 2e8: dup2_x1
// 2e9: pop2
// 2ea: checkcast net/minecraft/class_1297
// 2ed: invokevirtual su/catlean/kx.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 2f0: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 2f3: lload 4
// 2f5: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2f8: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 2fb: invokevirtual net/minecraft/class_315.method_42503 ()Lnet/minecraft/class_7172;
// 2fe: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
// 301: checkcast java/lang/Number
// 304: invokevirtual java/lang/Number.intValue ()I
// 307: bipush 4
// 308: iadd
// 309: sipush 16803
// 30c: ldc2_w 1410411935802261852
// 30f: lload 2
// 310: lxor
// 311: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 316: imul
// 317: i2d
// 318: dcmpl
// 319: ifle 32e
// 31c: aload 45
// 31e: ifnull 26f
// 321: goto 32e
// 324: ldc2_w 7023961035747495789
// 327: lload 2
// 328: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32d: athrow
// 32e: new net/minecraft/class_238
// 331: dup
// 332: aload 50
// 334: invokevirtual su/catlean/mw.P ()Lnet/minecraft/class_2338;
// 337: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 33a: astore 51
// 33c: aload 0
// 33d: aload 45
// 33f: ifnonnull 37a
// 342: lload 14
// 344: invokespecial su/catlean/kx.L (J)Z
// 347: ifeq 379
// 34a: goto 357
// 34d: ldc2_w 7023961035747495789
// 350: lload 2
// 351: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 356: athrow
// 357: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 35a: aload 50
// 35c: invokevirtual su/catlean/mw.g ()Ljava/awt/Color;
// 35f: iload 25
// 361: i2c
// 362: iload 26
// 364: ldc 0.5
// 366: iload 27
// 368: i2s
// 369: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 36c: goto 37f
// 36f: ldc2_w 7023961035747495789
// 372: lload 2
// 373: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 378: athrow
// 379: aload 0
// 37a: lload 43
// 37c: invokespecial su/catlean/kx.C (J)Ljava/awt/Color;
// 37f: astore 52
// 381: aload 0
// 382: lload 30
// 384: invokespecial su/catlean/kx.q (J)Z
// 387: aload 45
// 389: ifnonnull 3bf
// 38c: ifeq 3b9
// 38f: goto 39c
// 392: ldc2_w 7023961035747495789
// 395: lload 2
// 396: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39b: athrow
// 39c: lload 12
// 39e: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 3a1: aload 51
// 3a3: aload 52
// 3a5: aconst_null
// 3a6: bipush 4
// 3a7: aconst_null
// 3a8: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 3ab: pop
// 3ac: goto 3b9
// 3af: ldc2_w 7023961035747495789
// 3b2: lload 2
// 3b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b8: athrow
// 3b9: aload 0
// 3ba: lload 16
// 3bc: invokespecial su/catlean/kx.F (J)Z
// 3bf: aload 45
// 3c1: ifnonnull 415
// 3c4: ifeq 409
// 3c7: goto 3d4
// 3ca: ldc2_w 7023961035747495789
// 3cd: lload 2
// 3ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d3: athrow
// 3d4: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 3d7: lload 41
// 3d9: aload 51
// 3db: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3de: aload 52
// 3e0: aload 52
// 3e2: invokevirtual java/awt/Color.getAlpha ()I
// 3e5: i2f
// 3e6: fconst_2
// 3e7: fmul
// 3e8: iload 25
// 3ea: i2c
// 3eb: swap
// 3ec: iload 26
// 3ee: swap
// 3ef: iload 27
// 3f1: i2s
// 3f2: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3f5: aconst_null
// 3f6: bipush 4
// 3f7: aconst_null
// 3f8: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 3fb: pop
// 3fc: goto 409
// 3ff: ldc2_w 7023961035747495789
// 402: lload 2
// 403: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 408: athrow
// 409: aload 0
// 40a: iload 22
// 40c: iload 23
// 40e: i2c
// 40f: iload 24
// 411: i2s
// 412: invokespecial su/catlean/kx.j (ICS)Z
// 415: ifeq 4b2
// 418: new net/minecraft/class_243
// 41b: dup
// 41c: dconst_0
// 41d: dconst_0
// 41e: ldc2_w 75.0
// 421: invokespecial net/minecraft/class_243.<init> (DDD)V
// 424: lload 4
// 426: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 429: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 42c: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 42f: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 432: f2d
// 433: invokestatic java/lang/Math.toRadians (D)D
// 436: d2f
// 437: fneg
// 438: invokevirtual net/minecraft/class_243.method_1037 (F)Lnet/minecraft/class_243;
// 43b: lload 4
// 43d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 440: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 443: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 446: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 449: f2d
// 44a: invokestatic java/lang/Math.toRadians (D)D
// 44d: d2f
// 44e: fneg
// 44f: invokevirtual net/minecraft/class_243.method_1024 (F)Lnet/minecraft/class_243;
// 452: lload 4
// 454: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 457: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 45a: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 45d: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 460: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 463: dup
// 464: sipush 18530
// 467: ldc2_w 8094307244265719143
// 46a: lload 2
// 46b: lxor
// 46c: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 471: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 474: astore 53
// 476: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 479: iload 6
// 47b: i2s
// 47c: aload 53
// 47e: aload 50
// 480: invokevirtual su/catlean/mw.P ()Lnet/minecraft/class_2338;
// 483: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 486: dup
// 487: sipush 5029
// 48a: ldc2_w 5522888532139089563
// 48d: lload 2
// 48e: lxor
// 48f: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 494: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 497: aload 52
// 499: aconst_null
// 49a: bipush 1
// 49b: iload 7
// 49d: iload 8
// 49f: i2c
// 4a0: sipush 1520
// 4a3: ldc2_w 8335457900240028954
// 4a6: lload 2
// 4a7: lxor
// 4a8: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ad: aconst_null
// 4ae: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// 4b1: pop
// 4b2: iinc 46 1
// 4b5: aload 45
// 4b7: ifnull 26f
// 4ba: lload 18
// 4bc: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 4bf: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 4c2: dup
// 4c3: sipush 5500
// 4c6: ldc2_w 8319254729232291962
// 4c9: lload 2
// 4ca: lxor
// 4cb: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4d3: astore 48
// 4d5: bipush 0
// 4d6: istore 49
// 4d8: aload 48
// 4da: astore 50
// 4dc: new java/util/ArrayList
// 4df: dup
// 4e0: invokespecial java/util/ArrayList.<init> ()V
// 4e3: checkcast java/util/Collection
// 4e6: astore 51
// 4e8: bipush 0
// 4e9: istore 52
// 4eb: aload 50
// 4ed: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 4f2: astore 53
// 4f4: aload 53
// 4f6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4fb: ifeq 55f
// 4fe: aload 53
// 500: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 505: astore 54
// 507: aload 54
// 509: checkcast net/minecraft/class_1297
// 50c: astore 55
// 50e: bipush 0
// 50f: istore 56
// 511: getstatic su/catlean/kx.E Lsu/catlean/kx;
// 514: lload 34
// 516: iload 36
// 518: i2s
// 519: invokespecial su/catlean/kx.g (JS)Lsu/catlean/d4;
// 51c: invokevirtual su/catlean/d4.q ()Ljava/util/List;
// 51f: aload 55
// 521: invokevirtual net/minecraft/class_1297.method_5864 ()Lnet/minecraft/class_1299;
// 524: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 529: aload 45
// 52b: ifnonnull 573
// 52e: aload 45
// 530: ifnonnull 559
// 533: goto 540
// 536: ldc2_w 7023961035747495789
// 539: lload 2
// 53a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53f: athrow
// 540: ifeq 4f4
// 543: goto 550
// 546: ldc2_w 7023961035747495789
// 549: lload 2
// 54a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54f: athrow
// 550: aload 51
// 552: aload 54
// 554: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 559: pop
// 55a: aload 45
// 55c: ifnull 4f4
// 55f: aload 51
// 561: checkcast java/util/List
// 564: nop
// 565: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 56a: astore 47
// 56c: aload 47
// 56e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 573: ifeq 718
// 576: aload 47
// 578: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 57d: dup
// 57e: sipush 14252
// 581: ldc2_w 8001338430654855840
// 584: lload 2
// 585: lxor
// 586: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 58e: checkcast net/minecraft/class_1297
// 591: astore 48
// 593: aload 45
// 595: ifnonnull 71e
// 598: aload 48
// 59a: lload 28
// 59c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 59f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 5a2: ifeq 5c4
// 5a5: goto 5b2
// 5a8: ldc2_w 7023961035747495789
// 5ab: lload 2
// 5ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b1: athrow
// 5b2: aload 45
// 5b4: ifnull 56c
// 5b7: goto 5c4
// 5ba: ldc2_w 7023961035747495789
// 5bd: lload 2
// 5be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c3: athrow
// 5c4: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 5c7: aload 48
// 5c9: lload 39
// 5cb: invokevirtual su/catlean/zi.S (Lnet/minecraft/class_1297;J)Lnet/minecraft/class_238;
// 5ce: astore 49
// 5d0: aload 0
// 5d1: lload 30
// 5d3: invokespecial su/catlean/kx.q (J)Z
// 5d6: aload 45
// 5d8: ifnonnull 612
// 5db: ifeq 60c
// 5de: goto 5eb
// 5e1: ldc2_w 7023961035747495789
// 5e4: lload 2
// 5e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ea: athrow
// 5eb: lload 12
// 5ed: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 5f0: aload 49
// 5f2: aload 0
// 5f3: lload 43
// 5f5: invokespecial su/catlean/kx.C (J)Ljava/awt/Color;
// 5f8: aconst_null
// 5f9: bipush 4
// 5fa: aconst_null
// 5fb: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 5fe: pop
// 5ff: goto 60c
// 602: ldc2_w 7023961035747495789
// 605: lload 2
// 606: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60b: athrow
// 60c: aload 0
// 60d: lload 16
// 60f: invokespecial su/catlean/kx.F (J)Z
// 612: aload 45
// 614: ifnonnull 670
// 617: ifeq 664
// 61a: goto 627
// 61d: ldc2_w 7023961035747495789
// 620: lload 2
// 621: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 626: athrow
// 627: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 62a: lload 41
// 62c: aload 49
// 62e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 631: aload 0
// 632: lload 43
// 634: invokespecial su/catlean/kx.C (J)Ljava/awt/Color;
// 637: aload 0
// 638: lload 43
// 63a: invokespecial su/catlean/kx.C (J)Ljava/awt/Color;
// 63d: invokevirtual java/awt/Color.getAlpha ()I
// 640: i2f
// 641: fconst_2
// 642: fmul
// 643: iload 25
// 645: i2c
// 646: swap
// 647: iload 26
// 649: swap
// 64a: iload 27
// 64c: i2s
// 64d: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 650: aconst_null
// 651: bipush 4
// 652: aconst_null
// 653: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 656: pop
// 657: goto 664
// 65a: ldc2_w 7023961035747495789
// 65d: lload 2
// 65e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 663: athrow
// 664: aload 0
// 665: iload 22
// 667: iload 23
// 669: i2c
// 66a: iload 24
// 66c: i2s
// 66d: invokespecial su/catlean/kx.j (ICS)Z
// 670: aload 45
// 672: ifnonnull 573
// 675: ifeq 56c
// 678: new net/minecraft/class_243
// 67b: dup
// 67c: dconst_0
// 67d: dconst_0
// 67e: ldc2_w 75.0
// 681: invokespecial net/minecraft/class_243.<init> (DDD)V
// 684: lload 4
// 686: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 689: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 68c: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 68f: invokevirtual net/minecraft/class_4184.method_19329 ()F
// 692: f2d
// 693: invokestatic java/lang/Math.toRadians (D)D
// 696: d2f
// 697: fneg
// 698: invokevirtual net/minecraft/class_243.method_1037 (F)Lnet/minecraft/class_243;
// 69b: lload 4
// 69d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 6a0: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 6a3: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 6a6: invokevirtual net/minecraft/class_4184.method_19330 ()F
// 6a9: f2d
// 6aa: invokestatic java/lang/Math.toRadians (D)D
// 6ad: d2f
// 6ae: fneg
// 6af: invokevirtual net/minecraft/class_243.method_1024 (F)Lnet/minecraft/class_243;
// 6b2: lload 4
// 6b4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 6b7: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 6ba: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 6bd: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 6c0: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 6c3: dup
// 6c4: sipush 21097
// 6c7: ldc2_w 473444232105779027
// 6ca: lload 2
// 6cb: lxor
// 6cc: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6d4: astore 50
// 6d6: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 6d9: iload 6
// 6db: i2s
// 6dc: aload 50
// 6de: aload 49
// 6e0: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 6e3: dup
// 6e4: sipush 1447
// 6e7: ldc2_w 5337471727927855290
// 6ea: lload 2
// 6eb: lxor
// 6ec: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/kx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6f4: aload 0
// 6f5: lload 43
// 6f7: invokespecial su/catlean/kx.C (J)Ljava/awt/Color;
// 6fa: aconst_null
// 6fb: bipush 1
// 6fc: iload 7
// 6fe: iload 8
// 700: i2c
// 701: sipush 1520
// 704: ldc2_w 8335457900240028954
// 707: lload 2
// 708: lxor
// 709: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70e: aconst_null
// 70f: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// 712: pop
// 713: aload 45
// 715: ifnull 56c
// 718: invokestatic java/lang/System.currentTimeMillis ()J
// 71b: putstatic su/catlean/kx.J J
// 71e: return
}

private final boolean B(long var1, class_2248 var3) {
var1 = d ^ var1;
long var4 = var1 ^ 15884204603060L;
return this.v(var4).e().contains(var3);
}

private static final boolean B() {
long var0 = d ^ 20445670556142L;
long var2 = var0 ^ 54468606443359L;
return E.t(var2);
}

private static final boolean h() {
long var0 = d ^ 51649970664680L;
long var2 = var0 ^ 138734594740369L;
String[] var4 = vm.a<"Å">(9095711442368105569L, var0);

try {
boolean var10000 = E.L(var2);
if (var4 != null) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 9088072323535081480L, var0);
}

return false;
}

private static final void P() {
E.Z();
}

private static final void F(BlockStateEvent param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kx.d J
// 03: ldc2_w 32637644375164
// 06: lxor
// 07: lstore 1
// 08: ldc2_w 1057859976155561205
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 14: astore 4
// 16: aload 4
// 18: monitorenter
// 19: astore 3
// 1a: nop
// 1b: bipush 0
// 1c: istore 5
// 1e: aload 0
// 1f: invokevirtual su/catlean/api/event/events/world/BlockStateEvent.getPos ()Lnet/minecraft/class_2338;
// 22: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 25: bipush 4
// 26: ishr
// 27: istore 6
// 29: aload 0
// 2a: invokevirtual su/catlean/api/event/events/world/BlockStateEvent.getPos ()Lnet/minecraft/class_2338;
// 2d: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 30: bipush 4
// 31: ishr
// 32: istore 7
// 34: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 37: checkcast java/lang/Iterable
// 3a: astore 8
// 3c: bipush 0
// 3d: istore 9
// 3f: aload 8
// 41: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 46: astore 10
// 48: aload 10
// 4a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4f: ifeq ac
// 52: aload 10
// 54: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 59: astore 11
// 5b: aload 11
// 5d: checkcast su/catlean/l0
// 60: astore 12
// 62: bipush 0
// 63: istore 13
// 65: aload 12
// 67: invokevirtual su/catlean/l0.Z ()I
// 6a: iload 7
// 6c: aload 3
// 6d: ifnonnull 98
// 70: if_icmpne 9f
// 73: aload 12
// 75: invokevirtual su/catlean/l0.i ()I
// 78: aload 3
// 79: ifnonnull 9c
// 7c: goto 89
// 7f: ldc2_w 1048040147268559004
// 82: lload 1
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: iload 6
// 8b: goto 98
// 8e: ldc2_w 1048040147268559004
// 91: lload 1
// 92: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: athrow
// 98: if_icmpne 9f
// 9b: bipush 1
// 9c: goto a0
// 9f: bipush 0
// a0: ifeq 48
// a3: aload 11
// a5: aload 3
// a6: ifnonnull 5d
// a9: goto ad
// ac: aconst_null
// ad: checkcast su/catlean/l0
// b0: dup
// b1: ifnull c5
// b4: bipush 1
// b5: invokevirtual su/catlean/l0.J (Z)V
// b8: goto c6
// bb: ldc2_w 1048040147268559004
// be: lload 1
// bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c4: athrow
// c5: pop
// c6: nop
// c7: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// ca: astore 5
// cc: aload 4
// ce: monitorexit
// cf: goto da
// d2: astore 6
// d4: aload 4
// d6: monitorexit
// d7: aload 6
// d9: athrow
// da: return
}

private static final void F(class_2672 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kx.d J
// 03: ldc2_w 18476051214207
// 06: lxor
// 07: lstore 1
// 08: ldc2_w 2714909068569466870
// 0b: lload 1
// 0c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 14: astore 4
// 16: astore 3
// 17: aload 4
// 19: monitorenter
// 1a: nop
// 1b: bipush 0
// 1c: istore 5
// 1e: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 21: checkcast java/lang/Iterable
// 24: astore 6
// 26: bipush 0
// 27: istore 7
// 29: aload 6
// 2b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 30: astore 8
// 32: aload 8
// 34: invokeinterface java/util/Iterator.hasNext ()Z 1
// 39: ifeq 9a
// 3c: aload 8
// 3e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 43: astore 9
// 45: aload 9
// 47: checkcast su/catlean/l0
// 4a: astore 10
// 4c: bipush 0
// 4d: istore 11
// 4f: aload 10
// 51: invokevirtual su/catlean/l0.Z ()I
// 54: aload 0
// 55: invokevirtual net/minecraft/class_2672.method_11524 ()I
// 58: aload 3
// 59: ifnonnull 86
// 5c: if_icmpne 8d
// 5f: aload 10
// 61: invokevirtual su/catlean/l0.i ()I
// 64: aload 3
// 65: ifnonnull 8a
// 68: goto 75
// 6b: ldc2_w 2704534261188348831
// 6e: lload 1
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: aload 0
// 76: invokevirtual net/minecraft/class_2672.method_11524 ()I
// 79: goto 86
// 7c: ldc2_w 2704534261188348831
// 7f: lload 1
// 80: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85: athrow
// 86: if_icmpne 8d
// 89: bipush 1
// 8a: goto 8e
// 8d: bipush 0
// 8e: ifeq 32
// 91: aload 9
// 93: aload 3
// 94: ifnonnull 47
// 97: goto 9b
// 9a: aconst_null
// 9b: checkcast su/catlean/l0
// 9e: dup
// 9f: ifnull b3
// a2: bipush 1
// a3: invokevirtual su/catlean/l0.J (Z)V
// a6: goto b4
// a9: ldc2_w 2704534261188348831
// ac: lload 1
// ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b2: athrow
// b3: pop
// b4: nop
// b5: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// b8: astore 5
// ba: aload 4
// bc: monitorexit
// bd: goto c8
// c0: astore 6
// c2: aload 4
// c4: monitorexit
// c5: aload 6
// c7: athrow
// c8: return
}

private static final boolean p(int var0, int var1, l0 var2) {
long var3 = d ^ 62127814467073L;
long var5 = var3 ^ 55420792801402L;
String[] var10000 = vm.a<"Å">(-3111033905178335608L, var3);
Intrinsics.checkNotNullParameter(var2, b<"d">(19032, 6547243549026841321L ^ var3));
String[] var7 = var10000;

try {
double var10;
int var9 = (
var10 = Math.hypot((double)var0 - var2.i(), (double)var1 - var2.Z())
- (((Number)zf.F(var5).field_1690.method_42503().method_41753()).intValue() + 4) * c<"a">(16803, 1410350911467533520L ^ var3)
)
== 0.0
? 0
: (var10 < 0.0 ? -1 : 1);
if (var7 != null) {
return (boolean)var9;
}

if (var9 > 0) {
return (boolean)1;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -3101212298862740767L, var3);
}

return (boolean)0;
}

private static final boolean f(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final void I() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kx.d J
// 003: ldc2_w 97062669185645
// 006: lxor
// 007: lstore 0
// 008: lload 0
// 009: dup2
// 00a: ldc2_w 32372476672751
// 00d: lxor
// 00e: lstore 2
// 00f: dup2
// 010: ldc2_w 41841169086491
// 013: lxor
// 014: lstore 4
// 016: dup2
// 017: ldc2_w 23875548295248
// 01a: lxor
// 01b: lstore 6
// 01d: dup2
// 01e: ldc2_w 90515420251374
// 021: lxor
// 022: dup2
// 023: bipush 32
// 025: lushr
// 026: l2i
// 027: istore 8
// 029: dup2
// 02a: bipush 32
// 02c: lshl
// 02d: bipush 48
// 02f: lushr
// 030: l2i
// 031: istore 9
// 033: dup2
// 034: bipush 48
// 036: lshl
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 10
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 125362759019056
// 042: lxor
// 043: lstore 11
// 045: pop2
// 046: ldc2_w -522694758158365980
// 049: lload 0
// 04a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 052: astore 14
// 054: aload 14
// 056: monitorenter
// 057: astore 13
// 059: nop
// 05a: bipush 0
// 05b: istore 15
// 05d: getstatic su/catlean/kx.O Lsu/catlean/bg;
// 060: sipush 17154
// 063: ldc2_w 4400145229596924425
// 066: lload 0
// 067: lxor
// 068: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: lload 6
// 06f: invokevirtual su/catlean/bg.q (IJ)Z
// 072: istore 16
// 074: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 077: lload 2
// 078: invokevirtual su/catlean/nf.C (J)Ljava/util/List;
// 07b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 080: astore 17
// 082: aload 17
// 084: invokeinterface java/util/Iterator.hasNext ()Z 1
// 089: ifeq 2aa
// 08c: aload 17
// 08e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 093: checkcast net/minecraft/class_1923
// 096: astore 18
// 098: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 09b: checkcast java/lang/Iterable
// 09e: astore 19
// 0a0: bipush 0
// 0a1: istore 20
// 0a3: aload 13
// 0a5: ifnonnull 2b3
// 0a8: aload 19
// 0aa: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0af: astore 21
// 0b1: aload 21
// 0b3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0b8: ifeq 11e
// 0bb: aload 21
// 0bd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c2: astore 22
// 0c4: aload 22
// 0c6: checkcast su/catlean/l0
// 0c9: astore 23
// 0cb: bipush 0
// 0cc: istore 24
// 0ce: aload 23
// 0d0: invokevirtual su/catlean/l0.Z ()I
// 0d3: aload 18
// 0d5: getfield net/minecraft/class_1923.field_9180 I
// 0d8: aload 13
// 0da: ifnonnull 109
// 0dd: if_icmpne 110
// 0e0: aload 23
// 0e2: invokevirtual su/catlean/l0.i ()I
// 0e5: aload 13
// 0e7: ifnonnull 10d
// 0ea: goto 0f7
// 0ed: ldc2_w -533070595238947187
// 0f0: lload 0
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: aload 18
// 0f9: getfield net/minecraft/class_1923.field_9181 I
// 0fc: goto 109
// 0ff: ldc2_w -533070595238947187
// 102: lload 0
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: if_icmpne 110
// 10c: bipush 1
// 10d: goto 111
// 110: bipush 0
// 111: ifeq 0b1
// 114: aload 22
// 116: aload 13
// 118: ifnonnull 0c6
// 11b: goto 11f
// 11e: aconst_null
// 11f: checkcast su/catlean/l0
// 122: astore 25
// 124: aload 25
// 126: aload 13
// 128: ifnonnull 1b5
// 12b: ifnull 1a6
// 12e: goto 13b
// 131: ldc2_w -533070595238947187
// 134: lload 0
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: iload 16
// 13d: aload 13
// 13f: ifnonnull 188
// 142: goto 14f
// 145: ldc2_w -533070595238947187
// 148: lload 0
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: ifeq 1a6
// 152: goto 15f
// 155: ldc2_w -533070595238947187
// 158: lload 0
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: aload 25
// 161: aload 13
// 163: ifnonnull 1b5
// 166: goto 173
// 169: ldc2_w -533070595238947187
// 16c: lload 0
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: invokevirtual su/catlean/l0.z ()Ljava/util/List;
// 176: invokeinterface java/util/List.isEmpty ()Z 1
// 17b: goto 188
// 17e: ldc2_w -533070595238947187
// 181: lload 0
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: ifeq 1a6
// 18b: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 18e: aload 25
// 190: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
// 193: pop
// 194: aload 13
// 196: ifnull 1e4
// 199: goto 1a6
// 19c: ldc2_w -533070595238947187
// 19f: lload 0
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: aload 25
// 1a8: goto 1b5
// 1ab: ldc2_w -533070595238947187
// 1ae: lload 0
// 1af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b4: athrow
// 1b5: aload 13
// 1b7: ifnonnull 1cc
// 1ba: ifnull 1e4
// 1bd: goto 1ca
// 1c0: ldc2_w -533070595238947187
// 1c3: lload 0
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: aload 25
// 1cc: invokevirtual su/catlean/l0.M ()Z
// 1cf: ifne 1e4
// 1d2: aload 13
// 1d4: ifnull 082
// 1d7: goto 1e4
// 1da: ldc2_w -533070595238947187
// 1dd: lload 0
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: getstatic su/catlean/kx.E Lsu/catlean/kx;
// 1e7: aload 18
// 1e9: lload 4
// 1eb: invokespecial su/catlean/kx.k (Lnet/minecraft/class_1923;J)Ljava/util/List;
// 1ee: astore 19
// 1f0: aload 13
// 1f2: ifnonnull 283
// 1f5: aload 25
// 1f7: ifnull 244
// 1fa: goto 207
// 1fd: ldc2_w -533070595238947187
// 200: lload 0
// 201: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 206: athrow
// 207: aload 25
// 209: invokevirtual su/catlean/l0.M ()Z
// 20c: aload 13
// 20e: ifnonnull 28e
// 211: goto 21e
// 214: ldc2_w -533070595238947187
// 217: lload 0
// 218: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: athrow
// 21e: ifeq 244
// 221: goto 22e
// 224: ldc2_w -533070595238947187
// 227: lload 0
// 228: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: athrow
// 22e: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 231: aload 25
// 233: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
// 236: pop
// 237: goto 244
// 23a: ldc2_w -533070595238947187
// 23d: lload 0
// 23e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 243: athrow
// 244: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 247: new su/catlean/l0
// 24a: dup
// 24b: aload 18
// 24d: getfield net/minecraft/class_1923.field_9181 I
// 250: aload 18
// 252: getfield net/minecraft/class_1923.field_9180 I
// 255: iload 8
// 257: swap
// 258: iload 9
// 25a: i2s
// 25b: swap
// 25c: aload 19
// 25e: bipush 0
// 25f: sipush 1520
// 262: ldc2_w 8335396047366806778
// 265: lload 0
// 266: lxor
// 267: invokedynamic a (IJ)I bsm=su/catlean/kx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26c: aconst_null
// 26d: iload 10
// 26f: invokespecial su/catlean/l0.<init> (IISILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;I)V
// 272: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 275: pop
// 276: lload 11
// 278: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 27b: invokevirtual net/minecraft/class_746.method_23317 ()D
// 27e: d2i
// 27f: bipush 4
// 280: ishr
// 281: istore 20
// 283: lload 11
// 285: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 288: invokevirtual net/minecraft/class_746.method_23321 ()D
// 28b: d2i
// 28c: bipush 4
// 28d: ishr
// 28e: istore 21
// 290: getstatic su/catlean/kx.L Ljava/util/ArrayList;
// 293: iload 20
// 295: iload 21
// 297: invokedynamic invoke (II)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/kx.p (IILsu/catlean/l0;)Z, (Lsu/catlean/l0;)Ljava/lang/Boolean; ]
// 29c: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/kx.f (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 2a1: invokevirtual java/util/ArrayList.removeIf (Ljava/util/function/Predicate;)Z
// 2a4: pop
// 2a5: aload 13
// 2a7: ifnull 082
// 2aa: getstatic su/catlean/kx.E Lsu/catlean/kx;
// 2ad: pop
// 2ae: bipush 1
// 2af: putstatic su/catlean/kx.m Z
// 2b2: nop
// 2b3: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 2b6: astore 15
// 2b8: aload 14
// 2ba: monitorexit
// 2bb: goto 2c6
// 2be: astore 16
// 2c0: aload 14
// 2c2: monitorexit
// 2c3: aload 16
// 2c5: athrow
// 2c6: return
}

static {
long var20 = d ^ 77436458330171L;
long var22 = (var20 ^ 39809583940233L) >>> 8;
int var24 = (int)((var20 ^ 39809583940233L) << 56 >>> 56);
long var10001 = var20 ^ 54650211109696L;
int var25 = (int)((var20 ^ 54650211109696L) >>> 32);
int var26 = (int)((var20 ^ 54650211109696L) << 32 >>> 48);
int var27 = (int)(var10001 << 48 >>> 48);
long var28 = var20 ^ 118457520891355L;
long var30 = var20 ^ 74883381635261L;
int var32 = (int)((var20 ^ 28156063215438L) >>> 48);
long var33 = (var20 ^ 28156063215438L) << 16 >>> 16;
long var35 = var20 ^ 130838100500091L;
long var37 = var20 ^ 14507657730986L;
var10001 = var20 ^ 77274250564943L;
int var39 = (int)((var20 ^ 77274250564943L) >>> 48);
int var40 = (int)((var20 ^ 77274250564943L) << 16 >>> 48);
int var41 = (int)(var10001 << 32 >>> 32);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[39];
int var16 = 0;
String var15 = ">×#K\u0089µ(¿\u0004°ÛÞµ\u008d\u0018ç\u0018FèIw«\u009c·o¨\u0097à{CDy¹©»5ÏõöÐv òÕ»°Á>R,øb\u007fèÛ5:ÅÝ\u0096ôYZÀïIÜ;E\u0002\u0097Ô½\u009f(\u000b ön°§gËN\u0080ÅÍVÀò\u001a\u0090Ol¡\u008fõD\"\u0018\f\u009d\u00864\u0017FÚëy\u001a4ô0\u0094o Ñ¾ÛÆÿ÷ôVRâ@\u0002Ó9\u008d±kFô\u0001\u0084ÿd?rÚæÒ\u0089/\u009d3\u0018\u008c¢\u009eå%ß7J7\u009d(z!\u0086\u0092dú\u001fÚþ×ìJi\u0018 w\u009c¿\u0003¼m\u0010ªÆy¤S'Ö\u00ad'é\u008cO\u0094*=6\u0010<e\u0013\u001ck\u0011z\r\u001d\u008bï\u0093§\u008a\u0091® =ÄJ\u0084!\u001cNx4yb\u00adHwQ¯bùïÆ½Ê\u0007Qgæ!\u0017 q\\Ø \u009alhça%\u0011H\u0083\u001a\u0007Fä\u0084²mR«\u001ewgíÝ\u0001\u001fÇJ´:\u0081\u0096)\u0010Ð\rGbTN°£9 9EÙ\u0017\u0016Ð\u0010¢ûjêCÑ±½*ÌòÍh5¿B\u0018{ÏG+«\u0018D\u0003üÁ«ê\fÎj×]ÓneÅ\u0096\u007f$0$\u0010k0êwf¨ÞÊÏÍËµtÌ\u0001Tç}!z0ù*WTKóÓ¡î\u0088\u00add\u0012/\u008b-ëÉ\u009fc?ã'\u0085% \u0097\u009fØñ\u0097\u0017LÚ\u0082\u0089F\t\u000eàQ»M`$hØ\u0001ÌIÞ\u0093)\u0005\u0019Ág+H¼ÖÈÙa\u0082f\u0088\u0002\u0084:à\u0015²\u0090 É\u00956þ¸¯\u0007³+n\b\u0019JlØVÎE\u0081\t×EÁ\u008dæ|\u0081¹\u0082C\u0091¶Êÿû\u0005s\u0094£í\u009fÚW\u0006\rq\u0013¿û\u0097\u0019z\u0010ã¸× s|m¹»ä³¢\u0017LþëòLîZ1¦á!\u000e\u009d\u0099Ex~h4\u0018\u0002æ\u0092\u0010Ï)3.§É(\u008d\u0087Á\u008d¥\u0019\u0005ß \u0010F\u0091y\u008e»\u0093Ý¬ôá\u009d°¼æ\u0094é +XW,b@F~%Q\u008f¶Òvá\u00ad\u0005.GL\u0010Å¥À\u008e\u0014\f¹«\u0091\u0091¢\u0010ÚiÐAk\u0002p\u007fôqµõ\u0094\u0003æ8\u0010¿\u001cÌíñÙY¯\u0014\u0081©Õ{\u001fÂ\r(Û\u0089\\U\u0091¾`\u008f\u001füAÅ\u0007;D\u008c\u0004`\u009dtO?-¢ñ\u0090¬\u009cÍt°\u0018\u0018ù\u009a\u008a%K\u009f\u001a\u0018P9á\u008a\u008al±)\u009b¹¬_¥\u009b½Ì:ÿèLä(Ö<\u0010Ô\u0007)ý OÒ\u0016Õ\faVwR²\u0010 c\u0099\u001b\u0006\u008aÀ\u0087\u0010xO¾\u0003\u000e#ªûªõº\u0017\u0080k¯Ý\u0096µ}ò¬µ+\u00858ló#\u0081ö\u0013oÆ|0\u00041ïdN\u0004ÑWwO\u00951 \u008aHG\u008d²ò7\nB\u0006\u0095\u00ad¤\u0084[õ\u009d\u009cp±çJg(Ñ\u0015óLX\"®yì0¼v\u0018@!iÙa9\u0090un\u009cT@sÊZm-´\\|^Ô# Ù:\u0019U¬\u000b`<q¿\n¤ÁCBcª\u008fýÇ]\u0018\u008dK\u008aô×a\u008e'G^VCÑ?ôúIw\bº\"Ýw¥\u0018\u0004Ý=\u0089küe¬ì_-«\u00918U§\f§=-ê Ìr\u0010\u009c\u0013Mq\u0098\u0001\u0080\u0018\u0087\u0001)¬ZÊ4^\u0010´\u0090Ò`ä\u0001Lá'*\u00adñ-À\u0012z@ßXÚ\u0093©\u001f\u0011_¸È\u009bÚ\\\u0083\u008c¬R~¤\u009a×\u008dË\u0090|Vú+D\u009bðþ§'\u0083¹\bnêí§\\ðAc\u0097H\u000f4±hô\u00ad?Óùu \u0083\\\u0082!\u0013\"\u00105¥_mÏ8\r\u000eóCÏ\"YÕ\fQ ÀjÀ6èãì¨\u0086¦'Éü¬\u0097ô&3¸\u0004¡üÌr\u001b¨½ë\u0082\u0086ÁÒ¨\u0014\u0003 \u0012¬q>¤yújæ\u001eo\u001d|É\u0086Å/ÆÝú3½P\u0086ä4Z2°q¦\u0085}eGL\u0016\u0089r£ÈîP-£\u000f\u0096R&õ¿cÍ¶N\u0084Â\"ë$òô8\tïW»3Æô¤;\u009d+\u009d\u0014\u0011'ªð\u0011+:_Öïþð½ª\u0005\u0097ÌùX!R\u0083÷÷[¡|\u009fù¾óvS\u0005}ÒÅ\u009fB\u0082Y|Ä$oÒ{S\u008bÛ=%ÃlwÄrýòG\u009dÀñÒ\"1\"\u0013º\u0082ãu0é¸Õïá{\"\u0081Öaæ\u0013[0\u0087W\u0010>6,1\u0004¦µ\u0083:\u0016ÖÊ1\u0006þ\u001b";
int var17 = ">×#K\u0089µ(¿\u0004°ÛÞµ\u008d\u0018ç\u0018FèIw«\u009c·o¨\u0097à{CDy¹©»5ÏõöÐv òÕ»°Á>R,øb\u007fèÛ5:ÅÝ\u0096ôYZÀïIÜ;E\u0002\u0097Ô½\u009f(\u000b ön°§gËN\u0080ÅÍVÀò\u001a\u0090Ol¡\u008fõD\"\u0018\f\u009d\u00864\u0017FÚëy\u001a4ô0\u0094o Ñ¾ÛÆÿ÷ôVRâ@\u0002Ó9\u008d±kFô\u0001\u0084ÿd?rÚæÒ\u0089/\u009d3\u0018\u008c¢\u009eå%ß7J7\u009d(z!\u0086\u0092dú\u001fÚþ×ìJi\u0018 w\u009c¿\u0003¼m\u0010ªÆy¤S'Ö\u00ad'é\u008cO\u0094*=6\u0010<e\u0013\u001ck\u0011z\r\u001d\u008bï\u0093§\u008a\u0091® =ÄJ\u0084!\u001cNx4yb\u00adHwQ¯bùïÆ½Ê\u0007Qgæ!\u0017 q\\Ø \u009alhça%\u0011H\u0083\u001a\u0007Fä\u0084²mR«\u001ewgíÝ\u0001\u001fÇJ´:\u0081\u0096)\u0010Ð\rGbTN°£9 9EÙ\u0017\u0016Ð\u0010¢ûjêCÑ±½*ÌòÍh5¿B\u0018{ÏG+«\u0018D\u0003üÁ«ê\fÎj×]ÓneÅ\u0096\u007f$0$\u0010k0êwf¨ÞÊÏÍËµtÌ\u0001Tç}!z0ù*WTKóÓ¡î\u0088\u00add\u0012/\u008b-ëÉ\u009fc?ã'\u0085% \u0097\u009fØñ\u0097\u0017LÚ\u0082\u0089F\t\u000eàQ»M`$hØ\u0001ÌIÞ\u0093)\u0005\u0019Ág+H¼ÖÈÙa\u0082f\u0088\u0002\u0084:à\u0015²\u0090 É\u00956þ¸¯\u0007³+n\b\u0019JlØVÎE\u0081\t×EÁ\u008dæ|\u0081¹\u0082C\u0091¶Êÿû\u0005s\u0094£í\u009fÚW\u0006\rq\u0013¿û\u0097\u0019z\u0010ã¸× s|m¹»ä³¢\u0017LþëòLîZ1¦á!\u000e\u009d\u0099Ex~h4\u0018\u0002æ\u0092\u0010Ï)3.§É(\u008d\u0087Á\u008d¥\u0019\u0005ß \u0010F\u0091y\u008e»\u0093Ý¬ôá\u009d°¼æ\u0094é +XW,b@F~%Q\u008f¶Òvá\u00ad\u0005.GL\u0010Å¥À\u008e\u0014\f¹«\u0091\u0091¢\u0010ÚiÐAk\u0002p\u007fôqµõ\u0094\u0003æ8\u0010¿\u001cÌíñÙY¯\u0014\u0081©Õ{\u001fÂ\r(Û\u0089\\U\u0091¾`\u008f\u001füAÅ\u0007;D\u008c\u0004`\u009dtO?-¢ñ\u0090¬\u009cÍt°\u0018\u0018ù\u009a\u008a%K\u009f\u001a\u0018P9á\u008a\u008al±)\u009b¹¬_¥\u009b½Ì:ÿèLä(Ö<\u0010Ô\u0007)ý OÒ\u0016Õ\faVwR²\u0010 c\u0099\u001b\u0006\u008aÀ\u0087\u0010xO¾\u0003\u000e#ªûªõº\u0017\u0080k¯Ý\u0096µ}ò¬µ+\u00858ló#\u0081ö\u0013oÆ|0\u00041ïdN\u0004ÑWwO\u00951 \u008aHG\u008d²ò7\nB\u0006\u0095\u00ad¤\u0084[õ\u009d\u009cp±çJg(Ñ\u0015óLX\"®yì0¼v\u0018@!iÙa9\u0090un\u009cT@sÊZm-´\\|^Ô# Ù:\u0019U¬\u000b`<q¿\n¤ÁCBcª\u008fýÇ]\u0018\u008dK\u008aô×a\u008e'G^VCÑ?ôúIw\bº\"Ýw¥\u0018\u0004Ý=\u0089küe¬ì_-«\u00918U§\f§=-ê Ìr\u0010\u009c\u0013Mq\u0098\u0001\u0080\u0018\u0087\u0001)¬ZÊ4^\u0010´\u0090Ò`ä\u0001Lá'*\u00adñ-À\u0012z@ßXÚ\u0093©\u001f\u0011_¸È\u009bÚ\\\u0083\u008c¬R~¤\u009a×\u008dË\u0090|Vú+D\u009bðþ§'\u0083¹\bnêí§\\ðAc\u0097H\u000f4±hô\u00ad?Óùu \u0083\\\u0082!\u0013\"\u00105¥_mÏ8\r\u000eóCÏ\"YÕ\fQ ÀjÀ6èãì¨\u0086¦'Éü¬\u0097ô&3¸\u0004¡üÌr\u001b¨½ë\u0082\u0086ÁÒ¨\u0014\u0003 \u0012¬q>¤yújæ\u001eo\u001d|É\u0086Å/ÆÝú3½P\u0086ä4Z2°q¦\u0085}eGL\u0016\u0089r£ÈîP-£\u000f\u0096R&õ¿cÍ¶N\u0084Â\"ë$òô8\tïW»3Æô¤;\u009d+\u009d\u0014\u0011'ªð\u0011+:_Öïþð½ª\u0005\u0097ÌùX!R\u0083÷÷[¡|\u009fù¾óvS\u0005}ÒÅ\u009fB\u0082Y|Ä$oÒ{S\u008bÛ=%ÃlwÄrýòG\u009dÀñÒ\"1\"\u0013º\u0082ãu0é¸Õïá{\"\u0081Öaæ\u0013[0\u0087W\u0010>6,1\u0004¦µ\u0083:\u0016ÖÊ1\u0006þ\u001b"
.length();
char var14 = 16;
int var50 = -1;

label54:
while (true) {
String var56 = var15.substring(++var50, var50 + var14);
byte var63 = -1;

while (true) {
byte[] var19 = var11.doFinal(var56.getBytes("ISO-8859-1"));
String var73 = b(var19).intern();
switch (var63) {
case 0:
var18[var16++] = var73;
if ((var50 += var14) >= var17) {
e = var18;
f = new String[39];
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
String var4 = "m¦|Ã\u0016T÷&åûÕ³ø\u0082õ1\u009aÈúæ\f¦\u0087\fî(\f\u009eÉbRé\u008a\u0015\u0097Ú¡çd ~\b\u0012\u0013í\u0098\u0016\u0001\u001fì)\u001ck¬\u001aGïíÖh8\u0084f\u008b\u001afìSzN\u0015H=ÒOkì«X\u0014I½ü\u0093PUH\u0089¡Íßæ¥Æ`tkåÖ\u008b] ®fÜMF1úî\u0011ã$9ëLf\u008aòØ²\u0015\u009e®fD»Ï\u0087lÿ\u0080YÎ=\u0012";
int var5 = "m¦|Ã\u0016T÷&åûÕ³ø\u0082õ1\u009aÈúæ\f¦\u0087\fî(\f\u009eÉbRé\u008a\u0015\u0097Ú¡çd ~\b\u0012\u0013í\u0098\u0016\u0001\u001fì)\u001ck¬\u001aGïíÖh8\u0084f\u008b\u001afìSzN\u0015H=ÒOkì«X\u0014I½ü\u0093PUH\u0089¡Íßæ¥Æ`tkåÖ\u008b] ®fÜMF1úî\u0011ã$9ëLf\u008aòØ²\u0015\u009e®fD»Ï\u0087lÿ\u0080YÎ=\u0012"
.length();
byte var2 = 0;

label36:
while (true) {
byte var67 = var2;
var2 += 8;
byte[] var7 = var4.substring(var67, var2).getBytes("ISO-8859-1");
long[] var59 = var6;
int var68 = var3++;
long var77 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var82 = -1;

while (true) {
long var8 = var77;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var84 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var82) {
case 0:
var59[var68] = var84;
if (var2 >= var5) {
h = var6;
i = new Integer[19];
KProperty[] var47 = new KProperty[c<"a">(380, 4604932837885919789L ^ var20)];
var47[0] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kx.class, b<"d">(8076, 2960058632918176035L ^ var20), b<"d">(570, 154159180311694512L ^ var20), 0)
);
var47[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kx.class, b<"d">(2458, 4128815015499368230L ^ var20), b<"d">(21498, 3353101376848485727L ^ var20), 0)
);
var47[2] = Reflection.property1(
new PropertyReference1Impl(kx.class, b<"d">(7029, 8354973402940642763L ^ var20), b<"d">(30541, 7845561851416738242L ^ var20), 0)
);
var47[3] = Reflection.property1(new PropertyReference1Impl(kx.class, b<"d">(4391, 7020731231946121114L ^ var20), b<"d">(3211, 4247359520332153402L ^ var20), 0));
var47[4] = Reflection.property1(new PropertyReference1Impl(kx.class, b<"d">(19262, 677559590336251293L ^ var20), b<"d">(5936, 4904395575520860566L ^ var20), 0));
var47[5] = Reflection.property1(
new PropertyReference1Impl(kx.class, b<"d">(14273, 6710265975860476256L ^ var20), b<"d">(21507, 4122372953038772900L ^ var20), 0)
);
var47[c<"a">(23594, 7688543588461387645L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(kx.class, b<"d">(2163, 2878355295539168966L ^ var20), b<"d">(8603, 3741818115843043127L ^ var20), 0)
);
var47[c<"a">(3156, 4178275056859270914L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(kx.class, b<"d">(8629, 8769925346312859393L ^ var20), b<"d">(12115, 7927599146638942705L ^ var20), 0)
);
var47[c<"a">(24383, 3346390623988489318L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(kx.class, b<"d">(5493, 3547607305581140952L ^ var20), b<"d">(6022, 3585075445523683632L ^ var20), 0)
);
z = var47;
E = new kx(var25, (short)var26, (short)var27);
jk var60 = E;
String var70 = b<"d">(28997, 3416002076483223499L ^ var20);
dg var79 = new dg(var22, null, 1, null, (byte)var24);
int var10005 = c<"a">(1963, 5030584386662483168L ^ var20);
Object var42 = null;
int var43 = var10005;
Object var44 = null;
Object var45 = null;
dg var46 = var79;
K = yp.y(var60, var70, var37, var46, (h)var45, (Function0)var44, var43, var42);
jk var61 = E;
String var71 = b<"d">(29929, 3326230363427371597L ^ var20);
d4 var80 = new d4(null, var35, 1, null);
var10005 = c<"a">(4353, 8736822438559339097L ^ var20);
var42 = null;
var43 = var10005;
var44 = null;
var45 = null;
d4 var55 = var80;
V = yp.I(var61, var71, (char)var39, var55, (h)var45, (Function0)var44, var43, var42, (char)var40, var41);
D = yp.t(E, b<"d">(24241, 3757085912263381009L ^ var20), true, var28, null, null, c<"a">(4353, 8736822438559339097L ^ var20), null);
y = yp.L(
E,
b<"d">(28872, 7661567114802003558L ^ var20),
c<"a">(28992, 8423555373180596756L ^ var20),
new IntRange(1, c<"a">(1717, 1618157056118441455L ^ var20)),
var30,
null,
kx::B,
c<"a">(1520, 8335415931362854572L ^ var20),
null
);
u = yp.t(E, b<"d">(13235, 7795914424804818180L ^ var20), false, var28, null, null, c<"a">(4353, 8736822438559339097L ^ var20), null);
x = yp.b(
E,
(short)var32,
b<"d">(27873, 495586514285093459L ^ var20),
new Color(c<"a">(26526, 8711469404713395403L ^ var20), 0, 0, c<"a">(10278, 2490245315486641017L ^ var20)),
null,
kx::h,
4,
null,
var33
);
t = yp.t(E, b<"d">(12643, 7698799882766401500L ^ var20), false, var28, null, null, c<"a">(4353, 8736822438559339097L ^ var20), null);
a = yp.t(E, b<"d">(835, 2436025659137494505L ^ var20), true, var28, null, null, c<"a">(4353, 8736822438559339097L ^ var20), null);
b = yp.t(E, b<"d">(16123, 4919874200452149315L ^ var20), true, var28, null, null, c<"a">(4353, 8736822438559339097L ^ var20), null);
L = new ArrayList();
c = Executors.newSingleThreadExecutor();
O = new bg();
return;
}
break;
default:
var59[var68] = var84;
if (var2 < var5) {
continue label36;
}

var4 = "2\u0013\r\u0094Æ@A\u0097}\\\u0081\u009d\u0002ín\u009b";
var5 = "2\u0013\r\u0094Æ@A\u0097}\\\u0081\u009d\u0002ín\u009b".length();
var2 = 0;
}

byte var69 = var2;
var2 += 8;
var7 = var4.substring(var69, var2).getBytes("ISO-8859-1");
var59 = var6;
var68 = var3++;
var77 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var82 = 0;
}
}
}

var14 = var15.charAt(var50);
break;
default:
var18[var16++] = var73;
if ((var50 += var14) < var17) {
var14 = var15.charAt(var50);
continue label54;
}

var15 = ">¶H¤¦Ö¤\u0011\u0002àp~Âª\u0019\u0003\u008f¡/a\u0011\u001a\b\u0012Ò·»\u0013y-ò¦ \u001bÞêõA·\u00ad\f!\u0001\u0007\u0089cú\u008aáf\u009dÐ\u0016\beSç!RceÔÃ\u0099\u0089";
var17 = ">¶H¤¦Ö¤\u0011\u0002àp~Âª\u0019\u0003\u008f¡/a\u0011\u001a\b\u0012Ò·»\u0013y-ò¦ \u001bÞêõA·\u00ad\f!\u0001\u0007\u0089cú\u008aáf\u009dÐ\u0016\beSç!RceÔÃ\u0099\u0089"
.length();
var14 = ' ';
var50 = -1;
}

var56 = var15.substring(++var50, var50 + var14);
var63 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 28067;
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
throw new RuntimeException("su/catlean/kx", var10);
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
throw new RuntimeException("su/catlean/kx" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 8274;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/kx", var14);
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
throw new RuntimeException("su/catlean/kx" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
