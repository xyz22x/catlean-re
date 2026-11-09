package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_636;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.InteractionManagerAccessor;

public final class k_ extends _g {
@NotNull
public static final k_ C;
static final KProperty[] B;
@NotNull
private static final cq N;
@NotNull
private static final cw w;
@NotNull
private static final cs E;
@NotNull
private static final cs c;
@NotNull
private static final cs b;
private static float K;
private static float a;
@NotNull
private static final CopyOnWriteArrayList O;
private static final long d = yz.a(-5936121614274688790L, 8831190321826685800L, MethodHandles.lookup().lookupClass()).a(173938899466364L);
private static final String[] e;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] i;
private static final Map j;

private k_(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ d;
long var6 = var4 ^ 18147761758241L;
super(b<"w">(30362, 8680621514720457655L ^ var4), jt.z(), null, 4, null, var6);
}

private final boolean h(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ d;
long var6 = var4 ^ 7159247741152L;
return (Boolean)N.E(this, var6, B[0]);
}

private final c4 F(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ d;
long var6 = var4 ^ 87771718720229L;
return (c4)w.E(this, var6, B[1]);
}

private final Color e(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 116950563733063L;
return (Color)E.E(this, var3, B[2]);
}

private final Color W(int var1, int var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ d;
long var6 = var4 ^ 111021921789008L;
return (Color)c.E(this, var6, B[3]);
}

private final Color V(long var1) {
var1 = d ^ var1;
long var3 = var1 ^ 139233484844715L;
return (Color)b.E(this, var3, B[4]);
}

@Flow
private final void M(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k_.d J
// 003: ldc2_w 15963758750793
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 18151268402233
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 30805743226683
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
// 027: ldc2_w 80017399054509
// 02a: lxor
// 02b: dup2
// 02c: bipush 48
// 02e: lushr
// 02f: l2i
// 030: istore 9
// 032: dup2
// 033: bipush 16
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 10
// 03c: dup2
// 03d: bipush 32
// 03f: lshl
// 040: bipush 32
// 042: lushr
// 043: l2i
// 044: istore 11
// 046: pop2
// 047: dup2
// 048: ldc2_w 139955772804922
// 04b: lxor
// 04c: lstore 12
// 04e: pop2
// 04f: ldc2_w -7119491536795081672
// 052: lload 2
// 053: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: astore 19
// 05a: aload 0
// 05b: iload 9
// 05d: i2c
// 05e: iload 10
// 060: i2c
// 061: iload 11
// 063: invokespecial su/catlean/k_.h (CCI)Z
// 066: aload 19
// 068: ifnonnull 08f
// 06b: ifeq 1d2
// 06e: goto 07b
// 071: ldc2_w -7075451339190183781
// 074: lload 2
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: aload 1
// 07c: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 07f: instanceof net/minecraft/class_2620
// 082: goto 08f
// 085: ldc2_w -7075451339190183781
// 088: lload 2
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: aload 19
// 091: ifnonnull 0d9
// 094: ifeq 1d2
// 097: goto 0a4
// 09a: ldc2_w -7075451339190183781
// 09d: lload 2
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: aload 1
// 0a5: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0a8: checkcast net/minecraft/class_2620
// 0ab: invokevirtual net/minecraft/class_2620.method_11277 ()Lnet/minecraft/class_2338;
// 0ae: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0b1: aload 0
// 0b2: lload 12
// 0b4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b7: iload 6
// 0b9: i2b
// 0ba: swap
// 0bb: lload 7
// 0bd: dup2_x1
// 0be: pop2
// 0bf: checkcast net/minecraft/class_1297
// 0c2: invokevirtual su/catlean/k_.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0c5: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 0c8: ldc2_w 144.0
// 0cb: dcmpg
// 0cc: goto 0d9
// 0cf: ldc2_w -7075451339190183781
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: ifgt 1d2
// 0dc: getstatic su/catlean/k_.O Ljava/util/concurrent/CopyOnWriteArrayList;
// 0df: checkcast java/lang/Iterable
// 0e2: astore 20
// 0e4: bipush 0
// 0e5: istore 21
// 0e7: aload 20
// 0e9: aload 19
// 0eb: ifnonnull 13d
// 0ee: instanceof java/util/Collection
// 0f1: ifeq 13b
// 0f4: goto 101
// 0f7: ldc2_w -7075451339190183781
// 0fa: lload 2
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: aload 20
// 103: checkcast java/util/Collection
// 106: aload 19
// 108: ifnonnull 13d
// 10b: goto 118
// 10e: ldc2_w -7075451339190183781
// 111: lload 2
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: invokeinterface java/util/Collection.isEmpty ()Z 1
// 11d: ifeq 13b
// 120: goto 12d
// 123: ldc2_w -7075451339190183781
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: bipush 0
// 12e: goto 180
// 131: ldc2_w -7075451339190183781
// 134: lload 2
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: aload 20
// 13d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 142: astore 22
// 144: aload 22
// 146: invokeinterface java/util/Iterator.hasNext ()Z 1
// 14b: ifeq 17f
// 14e: aload 22
// 150: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 155: astore 23
// 157: aload 23
// 159: checkcast su/catlean/zo
// 15c: astore 24
// 15e: bipush 0
// 15f: istore 25
// 161: aload 24
// 163: invokevirtual su/catlean/zo.g ()Lnet/minecraft/class_2338;
// 166: aload 1
// 167: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 16a: checkcast net/minecraft/class_2620
// 16d: invokevirtual net/minecraft/class_2620.method_11277 ()Lnet/minecraft/class_2338;
// 170: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 173: ifeq 144
// 176: bipush 1
// 177: aload 19
// 179: ifnonnull 173
// 17c: goto 180
// 17f: bipush 0
// 180: ifne 1d2
// 183: getstatic su/catlean/k_.O Ljava/util/concurrent/CopyOnWriteArrayList;
// 186: new su/catlean/zo
// 189: dup
// 18a: aload 1
// 18b: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 18e: checkcast net/minecraft/class_2620
// 191: invokevirtual net/minecraft/class_2620.method_11277 ()Lnet/minecraft/class_2338;
// 194: dup
// 195: sipush 10753
// 198: ldc2_w 6229708457436382102
// 19b: lload 2
// 19c: lxor
// 19d: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1a5: fconst_0
// 1a6: fconst_0
// 1a7: sipush 825
// 1aa: ldc2_w 500267515906549480
// 1ad: lload 2
// 1ae: lxor
// 1af: invokedynamic g (IJ)I bsm=su/catlean/k_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b4: aconst_null
// 1b5: astore 14
// 1b7: istore 15
// 1b9: fstore 16
// 1bb: fstore 17
// 1bd: astore 18
// 1bf: lload 4
// 1c1: aload 18
// 1c3: fload 17
// 1c5: fload 16
// 1c7: iload 15
// 1c9: aload 14
// 1cb: invokespecial su/catlean/zo.<init> (JLnet/minecraft/class_2338;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1ce: invokevirtual java/util/concurrent/CopyOnWriteArrayList.add (Ljava/lang/Object;)Z
// 1d1: pop
// 1d2: return
}

@Flow
private final void a(PlayerUpdateEvent var1) {
long var2 = d ^ 88406448231622L;
int var4 = (int)((var2 ^ 66210402305722L) >>> 32);
long var5 = (var2 ^ 66210402305722L) << 32 >>> 32;
O.removeIf(k_::x);
a = K;
class_636 var10000 = zf.Z(var4, var5);
Intrinsics.checkNotNull(var10000, b<"w">(18838, 4210128563284793485L ^ var2));
K = ((InteractionManagerAccessor)var10000).getCurBlockDamageMP();
}

@Flow
public final void k(@NotNull Render3DEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/k_.d J
// 003: ldc2_w 70840554048823
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 18715178262626
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 48643448807243
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 85174378053790
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 56865100026083
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 71101248746615
// 038: lxor
// 039: lstore 13
// 03b: pop2
// 03c: ldc2_w -4878468478957664954
// 03f: lload 2
// 040: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: aload 1
// 046: ldc "e"
// 048: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04b: astore 15
// 04d: lload 4
// 04f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 052: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 055: aload 15
// 057: ifnonnull 07f
// 05a: ifnull 13f
// 05d: goto 06a
// 060: ldc2_w -4850169439567087131
// 063: lload 2
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: lload 4
// 06c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06f: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 072: goto 07f
// 075: ldc2_w -4850169439567087131
// 078: lload 2
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: aload 15
// 081: ifnonnull 0bd
// 084: instanceof net/minecraft/class_3965
// 087: ifeq 13f
// 08a: goto 097
// 08d: ldc2_w -4850169439567087131
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: lload 4
// 099: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 09c: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 09f: dup
// 0a0: sipush 16643
// 0a3: ldc2_w 7831970245941971437
// 0a6: lload 2
// 0a7: lxor
// 0a8: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0b0: goto 0bd
// 0b3: ldc2_w -4850169439567087131
// 0b6: lload 2
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: checkcast net/minecraft/class_3965
// 0c0: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 0c3: dup
// 0c4: sipush 9049
// 0c7: ldc2_w 7901194220505574324
// 0ca: lload 2
// 0cb: lxor
// 0cc: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/k_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d4: astore 16
// 0d6: iload 6
// 0d8: lload 7
// 0da: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 0dd: invokevirtual net/minecraft/class_636.method_2923 ()Z
// 0e0: aload 15
// 0e2: ifnonnull 10c
// 0e5: ifeq 13f
// 0e8: goto 0f5
// 0eb: ldc2_w -4850169439567087131
// 0ee: lload 2
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: lload 11
// 0f7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0fa: aload 16
// 0fc: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 0ff: goto 10c
// 102: ldc2_w -4850169439567087131
// 105: lload 2
// 106: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: athrow
// 10c: ifne 13f
// 10f: aload 0
// 110: aload 16
// 112: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 115: getstatic su/catlean/k_.a F
// 118: getstatic su/catlean/k_.K F
// 11b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 11e: lload 13
// 120: invokevirtual su/catlean/jl.K (J)F
// 123: invokevirtual su/catlean/jl.B (FFF)F
// 126: fconst_0
// 127: fconst_1
// 128: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 12b: lload 9
// 12d: dup2_x1
// 12e: pop2
// 12f: invokespecial su/catlean/k_.s (Lnet/minecraft/class_2338;JF)V
// 132: goto 13f
// 135: ldc2_w -4850169439567087131
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: getstatic su/catlean/k_.O Ljava/util/concurrent/CopyOnWriteArrayList;
// 142: checkcast java/lang/Iterable
// 145: astore 16
// 147: bipush 0
// 148: istore 17
// 14a: aload 16
// 14c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 151: astore 18
// 153: aload 18
// 155: invokeinterface java/util/Iterator.hasNext ()Z 1
// 15a: ifeq 1c1
// 15d: aload 18
// 15f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 164: astore 19
// 166: aload 19
// 168: checkcast su/catlean/zo
// 16b: astore 20
// 16d: bipush 0
// 16e: istore 21
// 170: getstatic su/catlean/k_.C Lsu/catlean/k_;
// 173: aload 20
// 175: invokevirtual su/catlean/zo.g ()Lnet/minecraft/class_2338;
// 178: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 17b: aload 20
// 17d: invokevirtual su/catlean/zo.w ()F
// 180: aload 20
// 182: invokevirtual su/catlean/zo.K ()F
// 185: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 188: lload 13
// 18a: invokevirtual su/catlean/jl.K (J)F
// 18d: invokevirtual su/catlean/jl.B (FFF)F
// 190: fconst_0
// 191: fconst_1
// 192: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 195: lload 9
// 197: dup2_x1
// 198: pop2
// 199: invokespecial su/catlean/k_.s (Lnet/minecraft/class_2338;JF)V
// 19c: nop
// 19d: aload 15
// 19f: ifnonnull 1c2
// 1a2: aload 15
// 1a4: ifnull 153
// 1a7: goto 1b4
// 1aa: ldc2_w -4850169439567087131
// 1ad: lload 2
// 1ae: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b3: athrow
// 1b4: bipush 3
// 1b5: anewarray 95
// 1b8: ldc2_w -4896333272946526671
// 1bb: lload 2
// 1bc: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c1: nop
// 1c2: return
}

private final void s(class_2338 var1, long var2, float var4) {
var2 = d ^ var2;
long var5 = var2 ^ 58051536765629L;
long var7 = var2 ^ 117917689745398L;
long var9 = var2 ^ 96706673793069L;
long var11 = var2 ^ 140473963093786L;
long var10001 = var2 ^ 111713055266273L;
int var13 = (int)((var2 ^ 111713055266273L) >>> 32);
int var14 = (int)((var2 ^ 111713055266273L) << 32 >>> 48);
int var15 = (int)(var10001 << 48 >>> 48);
long var16 = var2 ^ 96440084771824L;
var10001 = var2 ^ 10236632887251L;
int var18 = (int)((var2 ^ 10236632887251L) >>> 48);
int var19 = (int)((var2 ^ 10236632887251L) << 16 >>> 32);
int var20 = (int)(var10001 << 48 >>> 48);
long var21 = var2 ^ 77529471944801L;
long var23 = var2 ^ 28177842215120L;
class_238 var25 = this.c(var23, var1, var4);
zi.E(var9, zi.v, var25, jl.y.C(this.e(var7), var5, this.W(var13, var14, (char)var15), var4), null, 4, null);
zi.x(zi.v, var21, var25, jl.y.p(jl.y.C(this.e(var7), var5, this.W(var13, var14, (char)var15), var4), (char)var18, var19, 1.0F, (short)var20), null, 4, null);
zi var10000 = zi.v;
String var10002 = (int)(var4 * c<"g">(9818, 7730570584648766068L ^ var2)) + "%";
class_243 var10003 = var25.method_1005();
Intrinsics.checkNotNullExpressionValue(var10003, b<"w">(12910, 6119037278796614161L ^ var2));
zi.h(var10000, var16, var10002, var10003, this.V(var11), 0.0F, 0.0F, false, null, c<"g">(397, 479539785163109796L ^ var2), null);
}

private final class_238 c(long var1, class_2338 var3, float var4) {
var1 = d ^ var1;
long var5 = (var1 ^ 30412801688472L) >>> 16;
int var7 = (int)((var1 ^ 30412801688472L) << 48 >>> 48);

label49: {
label50: {
label51: {
try {
switch (ij.a[this.F(var5, (char)var7).ordinal()]) {
case 1:
return new class_238(var3);
case 2:
break label49;
case 3:
break label50;
case 4:
break label51;
case 5:
break;
default:
throw new NoWhenBranchMatchedException();
}
} catch (NoWhenBranchMatchedException var10) {
throw vm.a<"Å">(var10, 7277509409736958379L, var1);
}

class_238 var8 = new class_238(var3).method_35578((double)var3.method_10264() + (1.0F - var4));
Intrinsics.checkNotNull(var8);
return var8;
}

class_238 var12 = new class_238(var3).method_35578((double)var3.method_10264() + var4);
Intrinsics.checkNotNull(var12);
return var12;
}

class_238 var13 = new class_238(var3).method_1002(var4, var4, var4).method_989((double)var4 / 2.0F, (double)var4 / 2.0F, (double)var4 / 2.0F);
Intrinsics.checkNotNull(var13);
return var13;
}

float var9 = 1.0F - var4;
class_238 var14 = new class_238(var3).method_1002(var9, var9, var9).method_989((double)var9 / 2.0F, (double)var9 / 2.0F, (double)var9 / 2.0F);
Intrinsics.checkNotNull(var14);
return var14;
}

private static final boolean E(zo var0) {
long var1 = d ^ 55599873926959L;
long var3 = var1 ^ 93805927299327L;
return var0.o(var3);
}

private static final boolean x(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = d ^ 136273210810720L;
long var22 = var20 ^ 15048723863470L;
int var24 = (int)((var20 ^ 140225842404667L) >>> 48);
long var25 = (var20 ^ 140225842404667L) << 16 >>> 16;
long var10001 = var20 ^ 81659064373656L;
int var27 = (int)((var20 ^ 81659064373656L) >>> 32);
int var28 = (int)((var20 ^ 81659064373656L) << 32 >>> 48);
int var29 = (int)(var10001 << 48 >>> 48);
long var30 = var20 ^ 84466763181338L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[21];
int var16 = 0;
String var15 = "\u0087ñücF¢s¸\u0000¬ÀA\u000fgóy\u0088ÉD\u0091\u0089õHèÅÓ\u0014\u0084m7áò1\bzÌf/î\t)\u0090ï\u0014iüñ\u0097Ëpû\u0096\u00adM&\u0097g\u0093_\u001fF]\u0016ÿ»\u001c¡R\u0093ÏW\u0088 ¼¯\u008cw Y}\u0016Ä²Cu\u0005üÿ©)?\u0004\u001fþ\u0005\u0006\u008c´\u0089\u000e®Ç)F.2\u009cçË·å4 ?qèÔöæí\u0003\u009a¥O!r\u0011r\rÂA\\\u0095\u00adòõ\u0010¾\u001cCð¼\u000e¯\u0080ä\u000eÖ\u0085\u0013ß\u000f\u0092\u0010¨I:\u0096\u008c\u0090o\u008b]´fªnÁ\u007fÆ(·&´\t\u0003-qx5×\u0098\rÍÜ£\r¸ýY¦ZtUñ7Z\u0017[Àý\u001eõr@oÜÀ\u0092\u0092Ö\u0098\u000fL>o{.\u0093dc\u0093¿Á`Ë¬\u001cL/+k\u0096dÚ\u001eÁstÓUa\u007fÞù\u0098Ð\u0091oDZÂ×Ð®\u0017HbCÍ\u001fÓ\u009eZçµk\u0002Â&ÈVÉ*KÃ$öWé.ºe¢âÈA\u001f\u0012£ø]E\\]\u0005»+ctã\u00109\u0080ñ),\u0015\u001c\u0002þö¦\u0092ýe»1÷\u001d\u00ad+O¿ÉO¹¥\u00ad==Âãö¨fÁ\u000e@(\u0095·\u007f[6½å¬±ìf}ê\u0096]à*\u0014h\u00ad\u007fÄv\u009e S\u0001\u000b/[ñNa3úr_\u008cÊNãtY`9âÎ'QBÓýXÐûc \u0018\u0096ÓØ\u00ad.ßf\u0013e=\r7Ý\u009e¤÷íÑ-ûÑð\u0080¬ \u0089Ù\u00ad\u0096ç18\u0094^¹²mW¬M\u0094\u0084¹ø Ñ+äa\u001dÌQøx°¦k0õ\u0001þV\u008f\u009aK´p\u0089Îè{î\u0007Õµæ\u0094wÆ'¼,»>¬V\u000e±7v\u0095%\u0011TT²õ)zp0Â\u001a\u0001Ö}\u0010È^æ¯6\u0083.sÃ 8ÕJh9`8 D°\u008bvv\u0017\u0087 ß^_LYr\u009c\u008dE3Á±\u007fè\u0018ÄÂ\u000b\u001eÙ\u007f.æ<ÑETKö8``\u0010Ï\u0098-=ÄmzoÒ\u0005Èù\u0087á\u0018J¾\u001e\u00ad·ý3PÇc#l<³%\u000båp\u0084àÄ\u0014\u009dd8Ürë,d\u00adq\u0090\u0093hªdSê\u000fr\u001do>\u000b@ëÊbÇÎ]Ä\u007fy\u009a\u001a×à\u0005üÝ|Á\u009f\u0093\u0007ÑµS\u000e\u009a}OgKP9Ò®x\u0010§M©\u0086[aõÈUÇ\b\u001e÷µØü 7²*\u0085ÑQ<°\u001a\u0096\u0000\u00195\u0015\u0006ý\u0015`Ò`rÇü]\u009båÎn\u001b½þ\u008e Î96çºY»Ôº«Þ\u0016týr(á\u0000©\u008d\u0098jÅ ?ë\\x\u0000\u0003õB \u0080[\u001d££±\tL\\dð\n±WaLÒ\u0087]ùÂ<\u0010c\u0086\u0082~:\u0081\u0099\u0005ó8\u008eÃ8SI½`X\u0007\u0092ÑcÙæJÅdÛ\u0084?\u001b\u0005\u000bÙS!\u0099ÍêL¾\u0081¯æëÂô\u0085\u0016\fú\u0012@µA4êH\u0081\u009chü\u0019*«±\u0010cz·÷V-»MíQ;¹=6ÛÅ";
int var17 = "\u0087ñücF¢s¸\u0000¬ÀA\u000fgóy\u0088ÉD\u0091\u0089õHèÅÓ\u0014\u0084m7áò1\bzÌf/î\t)\u0090ï\u0014iüñ\u0097Ëpû\u0096\u00adM&\u0097g\u0093_\u001fF]\u0016ÿ»\u001c¡R\u0093ÏW\u0088 ¼¯\u008cw Y}\u0016Ä²Cu\u0005üÿ©)?\u0004\u001fþ\u0005\u0006\u008c´\u0089\u000e®Ç)F.2\u009cçË·å4 ?qèÔöæí\u0003\u009a¥O!r\u0011r\rÂA\\\u0095\u00adòõ\u0010¾\u001cCð¼\u000e¯\u0080ä\u000eÖ\u0085\u0013ß\u000f\u0092\u0010¨I:\u0096\u008c\u0090o\u008b]´fªnÁ\u007fÆ(·&´\t\u0003-qx5×\u0098\rÍÜ£\r¸ýY¦ZtUñ7Z\u0017[Àý\u001eõr@oÜÀ\u0092\u0092Ö\u0098\u000fL>o{.\u0093dc\u0093¿Á`Ë¬\u001cL/+k\u0096dÚ\u001eÁstÓUa\u007fÞù\u0098Ð\u0091oDZÂ×Ð®\u0017HbCÍ\u001fÓ\u009eZçµk\u0002Â&ÈVÉ*KÃ$öWé.ºe¢âÈA\u001f\u0012£ø]E\\]\u0005»+ctã\u00109\u0080ñ),\u0015\u001c\u0002þö¦\u0092ýe»1÷\u001d\u00ad+O¿ÉO¹¥\u00ad==Âãö¨fÁ\u000e@(\u0095·\u007f[6½å¬±ìf}ê\u0096]à*\u0014h\u00ad\u007fÄv\u009e S\u0001\u000b/[ñNa3úr_\u008cÊNãtY`9âÎ'QBÓýXÐûc \u0018\u0096ÓØ\u00ad.ßf\u0013e=\r7Ý\u009e¤÷íÑ-ûÑð\u0080¬ \u0089Ù\u00ad\u0096ç18\u0094^¹²mW¬M\u0094\u0084¹ø Ñ+äa\u001dÌQøx°¦k0õ\u0001þV\u008f\u009aK´p\u0089Îè{î\u0007Õµæ\u0094wÆ'¼,»>¬V\u000e±7v\u0095%\u0011TT²õ)zp0Â\u001a\u0001Ö}\u0010È^æ¯6\u0083.sÃ 8ÕJh9`8 D°\u008bvv\u0017\u0087 ß^_LYr\u009c\u008dE3Á±\u007fè\u0018ÄÂ\u000b\u001eÙ\u007f.æ<ÑETKö8``\u0010Ï\u0098-=ÄmzoÒ\u0005Èù\u0087á\u0018J¾\u001e\u00ad·ý3PÇc#l<³%\u000båp\u0084àÄ\u0014\u009dd8Ürë,d\u00adq\u0090\u0093hªdSê\u000fr\u001do>\u000b@ëÊbÇÎ]Ä\u007fy\u009a\u001a×à\u0005üÝ|Á\u009f\u0093\u0007ÑµS\u000e\u009a}OgKP9Ò®x\u0010§M©\u0086[aõÈUÇ\b\u001e÷µØü 7²*\u0085ÑQ<°\u001a\u0096\u0000\u00195\u0015\u0006ý\u0015`Ò`rÇü]\u009båÎn\u001b½þ\u008e Î96çºY»Ôº«Þ\u0016týr(á\u0000©\u008d\u0098jÅ ?ë\\x\u0000\u0003õB \u0080[\u001d££±\tL\\dð\n±WaLÒ\u0087]ùÂ<\u0010c\u0086\u0082~:\u0081\u0099\u0005ó8\u008eÃ8SI½`X\u0007\u0092ÑcÙæJÅdÛ\u0084?\u001b\u0005\u000bÙS!\u0099ÍêL¾\u0081¯æëÂô\u0085\u0016\fú\u0012@µA4êH\u0081\u009chü\u0019*«±\u0010cz·÷V-»MíQ;¹=6ÛÅ"
.length();
char var14 = 136;
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
byte var40 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var48 = b(var19).intern();
switch (var40) {
case 0:
var18[var16++] = var48;
if ((var35 += var14) >= var17) {
e = var18;
f = new String[21];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[8];
int var3 = 0;
String var4 = "àNzZN{\u0089\u0002ç\u0083µ _J\u00942cmãX\u001d=ä\n\u0085£b%\u007fÛå\u001c\u0093õì\u0085UÂã´Eo\u0010\u001fâ¢$×";
int var5 = "àNzZN{\u0089\u0002ç\u0083µ _J\u00942cmãX\u001d=ä\n\u0085£b%\u007fÛå\u001c\u0093õì\u0085UÂã´Eo\u0010\u001fâ¢$×".length();
byte var2 = 0;

label36:
while (true) {
byte var44 = var2;
var2 += 8;
byte[] var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
int var45 = var3++;
long var52 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var55 = -1;

while (true) {
long var8 = var52;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var57 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var55) {
case 0:
var39[var45] = var57;
if (var2 >= var5) {
h = var6;
i = new Integer[8];
KProperty[] var32 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(k_.class, b<"w">(29109, 4569932958531785986L ^ var20), b<"w">(26887, 8692435658449882545L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(k_.class, b<"w">(22213, 2567852324405850750L ^ var20), b<"w">(11897, 2382542617070226124L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(k_.class, b<"w">(19105, 5863985827080252949L ^ var20), b<"w">(7199, 5744606568537520300L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(k_.class, b<"w">(9792, 5615791270232408818L ^ var20), b<"w">(27105, 4029464007496469840L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(k_.class, b<"w">(20023, 3804353494254955151L ^ var20), b<"w">(4760, 937419629777647152L ^ var20), 0))
};
B = var32;
C = new k_(var27, (short)var28, (char)var29);
N = yp.t(C, b<"w">(16077, 2423154785095408241L ^ var20), true, var22, null, null, c<"g">(8857, 931881092526738019L ^ var20), null);
w = yp.L(C, b<"w">(14431, 513430941310180591L ^ var20), c4.SHRINK, null, null, c<"g">(16181, 5294474952358598602L ^ var20), null, var30);
E = yp.b(
C,
(short)var24,
b<"w">(21767, 8308105953811935658L ^ var20),
new Color(
c<"g">(13118, 4036794070594853824L ^ var20),
c<"g">(2731, 6805974910323368534L ^ var20),
c<"g">(2731, 6805974910323368534L ^ var20),
c<"g">(13589, 5666405119347006956L ^ var20)
),
null,
null,
c<"g">(16181, 5294474952358598602L ^ var20),
null,
var25
);
c = yp.b(
C,
(short)var24,
b<"w">(3823, 5560261268976757328L ^ var20),
new Color(
c<"g">(2731, 6805974910323368534L ^ var20),
c<"g">(2731, 6805974910323368534L ^ var20),
c<"g">(2731, 6805974910323368534L ^ var20),
c<"g">(13589, 5666405119347006956L ^ var20)
),
null,
null,
c<"g">(16181, 5294474952358598602L ^ var20),
null,
var25
);
b = yp.b(
C,
(short)var24,
b<"w">(29568, 3654958114972702507L ^ var20),
new Color(
c<"g">(2731, 6805974910323368534L ^ var20),
c<"g">(2731, 6805974910323368534L ^ var20),
c<"g">(2731, 6805974910323368534L ^ var20),
c<"g">(2731, 6805974910323368534L ^ var20)
),
null,
null,
c<"g">(16181, 5294474952358598602L ^ var20),
null,
var25
);
O = new CopyOnWriteArrayList();
return;
}
break;
default:
var39[var45] = var57;
if (var2 < var5) {
continue label36;
}

var4 = "XcÄwIÇÌ\u009a6üÓr#ó\fO";
var5 = "XcÄwIÇÌ\u009a6üÓr#ó\fO".length();
var2 = 0;
}

byte var46 = var2;
var2 += 8;
var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
var39 = var6;
var45 = var3++;
var52 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var55 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var48;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "\u001bW\u0010 J÷!Ç\u009dV-*aÞÛux¾\u007fý÷°Îï'íÃYVÀ{\u0013\u0010VÈ\u0015çÕð¤üÝ\u0005\u001f±z\u0014Sý";
var17 = "\u001bW\u0010 J÷!Ç\u009dV-*aÞÛux¾\u007fý÷°Îï'íÃYVÀ{\u0013\u0010VÈ\u0015çÕð¤üÝ\u0005\u001f±z\u0014Sý".length();
var14 = ' ';
var35 = -1;
}

var36 = var15.substring(++var35, var35 + var14);
var40 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13765;
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
throw new RuntimeException("su/catlean/k_", var10);
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
throw new RuntimeException("su/catlean/k_" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31111;
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
throw new RuntimeException("su/catlean/k_", var14);
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
throw new RuntimeException("su/catlean/k_" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
