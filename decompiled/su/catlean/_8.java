package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import net.minecraft.class_10185;
import net.minecraft.class_1297;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_3532;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_2828.class_2830;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.api.event.events.player.EventPostPlayerTravel;
import su.catlean.api.event.events.player.FixVelocityEvent;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.KeyboardInputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PostInteractItemEvent;
import su.catlean.api.event.events.player.PostSyncEvent;
import su.catlean.api.event.events.player.PreInteractItemEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.render.LookRenderEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.world.FireWorkVectorEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.ClientInputAccessor;

public final class _8 implements ym {
@NotNull
public static final _8 P;
@NotNull
private static ArrayList r;
@NotNull
private static ArrayList Y;
@NotNull
private static _w H;
@Nullable
private static _w S;
@Nullable
private static _w l;
@Nullable
private static _w m;
@Nullable
private static _w O;
@Nullable
private static t5 D;
@Nullable
private static t5 F;
private static float i;
private static float y;
private static float V;
private static _g[] c;
private static final long a = yz.a(-6489381357325265935L, 4620271491898570590L, MethodHandles.lookup().lookupClass()).a(88327190344314L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private _8() {
}

@Nullable
public final _w c() {
return l;
}

public final void F(@Nullable _w <set-?>) {
l = <set-?>;
}

@Nullable
public final _w H() {
return m;
}

public final void f(@Nullable _w <set-?>) {
m = <set-?>;
}

public final void C(long a, @NotNull t5 sequence) {
ax = a ^ ax;
long var4 = (ax ^ 42966116682822L) >>> 16;
int var6 = (int)((ax ^ 42966116682822L) << 48 >>> 48);
Intrinsics.checkNotNullParameter(sequence, a<"c">(7894, 2509724017166109344L ^ ax));
_x.I.L(var4, (short)var6);
r.add(sequence);
}

public final void o(@NotNull t5 sequence, short a, int a, int a) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var7 = (var5 ^ 77540647252176L) >>> 16;
int var9 = (int)((var5 ^ 77540647252176L) << 48 >>> 48);
Intrinsics.checkNotNullParameter(sequence, a<"c">(23602, 1551218841775699152L ^ var5));
_x.I.L(var7, (short)var9);
Y.add(sequence);
}

public final void O(long a, @NotNull _w rotation, int priority) {
ax = a ^ ax;
long var5 = ax ^ 63931616974232L;
long var7 = (ax ^ 106492595645956L) >>> 16;
int var9 = (int)((ax ^ 106492595645956L) << 48 >>> 48);
Intrinsics.checkNotNullParameter(rotation, a<"c">(5194, 6173039616477340287L ^ ax));
_x.I.L(var7, (short)var9);
r.add(new t5(rotation, var5, priority, _8::X));
}

public static void C(long var0, _8 var2, _w var3, int var4, int var5, Object var6) {
var0 = a ^ var0;
long var7 = var0 ^ 111237757495471L;
_g[] var9 = vm.a<"Å">(8296754179837625051L, var0);

label21: {
int var10000;
label20: {
try {
var10000 = var5 & 2;
if (var9 != null) {
break label20;
}

if (var10000 == 0) {
break label21;
}
} catch (NumberFormatException var10) {
throw vm.a<"Å">(var10, 8309518751256290221L, var0);
}

var10000 = b<"v">(18811, 1314822464763588912L ^ var0);
}

var4 = var10000;
}

var2.O(var7, var3, var4);
}

@NotNull
public final _w f(long a, boolean clientSide) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_8.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 21390005882083
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 103338872366593
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 56348551178348
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 96044057536369
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 91277476197842
// 027: lxor
// 028: lstore 12
// 02a: pop2
// 02b: ldc2_w -6344266989312518644
// 02e: lload 1
// 02f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 034: getstatic su/catlean/_8.r Ljava/util/ArrayList;
// 037: checkcast java/lang/Iterable
// 03a: astore 15
// 03c: astore 14
// 03e: bipush 0
// 03f: istore 16
// 041: aload 15
// 043: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 048: astore 17
// 04a: aload 17
// 04c: aload 14
// 04e: ifnonnull 07b
// 051: invokeinterface java/util/Iterator.hasNext ()Z 1
// 056: ifne 074
// 059: goto 066
// 05c: ldc2_w -6375398902431221894
// 05f: lload 1
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: aconst_null
// 067: goto 0f9
// 06a: ldc2_w -6375398902431221894
// 06d: lload 1
// 06e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: athrow
// 074: aload 17
// 076: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 07b: astore 18
// 07d: aload 17
// 07f: aload 14
// 081: ifnonnull 0aa
// 084: invokeinterface java/util/Iterator.hasNext ()Z 1
// 089: ifne 0a8
// 08c: goto 099
// 08f: ldc2_w -6375398902431221894
// 092: lload 1
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: aload 18
// 09b: goto 0f9
// 09e: ldc2_w -6375398902431221894
// 0a1: lload 1
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: aload 18
// 0aa: checkcast su/catlean/t5
// 0ad: astore 19
// 0af: bipush 0
// 0b0: istore 20
// 0b2: aload 19
// 0b4: invokevirtual su/catlean/t5.b ()I
// 0b7: istore 19
// 0b9: aload 17
// 0bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c0: astore 20
// 0c2: aload 20
// 0c4: checkcast su/catlean/t5
// 0c7: astore 21
// 0c9: bipush 0
// 0ca: istore 22
// 0cc: aload 21
// 0ce: invokevirtual su/catlean/t5.b ()I
// 0d1: istore 21
// 0d3: iload 19
// 0d5: iload 21
// 0d7: if_icmpge 0e2
// 0da: aload 20
// 0dc: astore 18
// 0de: iload 21
// 0e0: istore 19
// 0e2: aload 17
// 0e4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0e9: ifne 0b9
// 0ec: aload 14
// 0ee: lload 1
// 0ef: lconst_0
// 0f0: lcmp
// 0f1: ifle 0dc
// 0f4: ifnonnull 0de
// 0f7: aload 18
// 0f9: checkcast su/catlean/t5
// 0fc: lload 1
// 0fd: lconst_0
// 0fe: lcmp
// 0ff: ifle 148
// 102: dup
// 103: ifnull 148
// 106: invokevirtual su/catlean/t5.O ()Lsu/catlean/_w;
// 109: dup
// 10a: lload 1
// 10b: lconst_0
// 10c: lcmp
// 10d: iflt 145
// 110: aload 14
// 112: ifnonnull 145
// 115: goto 122
// 118: ldc2_w -6375398902431221894
// 11b: lload 1
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: ifnull 148
// 125: goto 132
// 128: ldc2_w -6375398902431221894
// 12b: lload 1
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: lload 4
// 134: invokevirtual su/catlean/_w.s (J)Lsu/catlean/_w;
// 137: dup
// 138: goto 145
// 13b: ldc2_w -6375398902431221894
// 13e: lload 1
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: ifnonnull 1bd
// 148: pop
// 149: iload 3
// 14a: ifeq 192
// 14d: goto 15a
// 150: ldc2_w -6375398902431221894
// 153: lload 1
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: new su/catlean/_w
// 15d: dup
// 15e: lload 12
// 160: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 163: invokevirtual net/minecraft/class_746.method_36454 ()F
// 166: lload 12
// 168: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16b: invokevirtual net/minecraft/class_746.method_36455 ()F
// 16e: lload 10
// 170: dup2_x1
// 171: pop2
// 172: bipush 0
// 173: aconst_null
// 174: sipush 24441
// 177: ldc2_w 7142562614269457383
// 17a: lload 1
// 17b: lxor
// 17c: invokedynamic v (IJ)I bsm=su/catlean/_8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: aconst_null
// 182: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 185: goto 1bd
// 188: ldc2_w -6375398902431221894
// 18b: lload 1
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: new su/catlean/_w
// 195: dup
// 196: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 199: lload 6
// 19b: invokevirtual su/catlean/dm.U (J)F
// 19e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1a1: lload 8
// 1a3: invokevirtual su/catlean/dm.w (J)F
// 1a6: lload 10
// 1a8: dup2_x1
// 1a9: pop2
// 1aa: bipush 0
// 1ab: aconst_null
// 1ac: sipush 24441
// 1af: ldc2_w 7142562614269457383
// 1b2: lload 1
// 1b3: lxor
// 1b4: invokedynamic v (IJ)I bsm=su/catlean/_8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: aconst_null
// 1ba: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1bd: areturn
}

public static _w S(_8 var0, boolean var1, int var2, long var3, Object var5) {
var3 = a ^ var3;
long var6 = var3 ^ 85130593410236L;
_g[] var8 = vm.a<"Å">(-8953801328068038075L, var3);

int var10000;
label20: {
try {
var10000 = var2 & 1;
if (var8 != null) {
break label20;
}

if (var10000 == 0) {
return var0.f(var6, (boolean)var1);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -8948899226898345165L, var3);
}

var10000 = 0;
}

var1 = var10000;
return var0.f(var6, (boolean)var1);
}

@Flow(
priority = 20
)
private final void u(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_8.a J
// 03: ldc2_w 104770800428331
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 2060336860111105391
// 0b: lload 2
// 0c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: astore 4
// 13: getstatic su/catlean/_8.F Lsu/catlean/t5;
// 16: aload 4
// 18: ifnonnull 47
// 1b: ifnull 4c
// 1e: goto 2b
// 21: ldc2_w 2082180104421723161
// 24: lload 2
// 25: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a: athrow
// 2b: getstatic su/catlean/_8.F Lsu/catlean/t5;
// 2e: dup
// 2f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 32: invokevirtual su/catlean/t5.A ()Lkotlin/jvm/functions/Function0;
// 35: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 3a: goto 47
// 3d: ldc2_w 2082180104421723161
// 40: lload 2
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: pop
// 48: aconst_null
// 49: putstatic su/catlean/_8.F Lsu/catlean/t5;
// 4c: return
}

@Flow(
priority = -20
)
private final void Y(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_8.a J
// 003: ldc2_w 12232484636073
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 49073899443970
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 111463689095924
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 119648769060403
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: getstatic su/catlean/_8.Y Ljava/util/ArrayList;
// 022: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/_8.h (Lsu/catlean/t5;)Z, (Lsu/catlean/t5;)Ljava/lang/Boolean; ]
// 027: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/_8.D (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 02c: invokevirtual java/util/ArrayList.removeIf (Ljava/util/function/Predicate;)Z
// 02f: pop
// 030: ldc2_w 8941225381116087789
// 033: lload 2
// 034: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039: getstatic su/catlean/_8.r Ljava/util/ArrayList;
// 03c: checkcast java/lang/Iterable
// 03f: astore 11
// 041: bipush 0
// 042: istore 12
// 044: astore 10
// 046: aload 11
// 048: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 04d: astore 13
// 04f: aload 13
// 051: aload 10
// 053: ifnonnull 080
// 056: invokeinterface java/util/Iterator.hasNext ()Z 1
// 05b: ifne 079
// 05e: goto 06b
// 061: ldc2_w 8964194795861847195
// 064: lload 2
// 065: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06a: athrow
// 06b: aconst_null
// 06c: goto 0f8
// 06f: ldc2_w 8964194795861847195
// 072: lload 2
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: aload 13
// 07b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 080: astore 14
// 082: aload 13
// 084: aload 10
// 086: ifnonnull 0af
// 089: invokeinterface java/util/Iterator.hasNext ()Z 1
// 08e: ifne 0ad
// 091: goto 09e
// 094: ldc2_w 8964194795861847195
// 097: lload 2
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: aload 14
// 0a0: goto 0f8
// 0a3: ldc2_w 8964194795861847195
// 0a6: lload 2
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: aload 14
// 0af: checkcast su/catlean/t5
// 0b2: astore 15
// 0b4: bipush 0
// 0b5: istore 16
// 0b7: aload 15
// 0b9: invokevirtual su/catlean/t5.b ()I
// 0bc: istore 15
// 0be: aload 13
// 0c0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c5: astore 16
// 0c7: aload 16
// 0c9: checkcast su/catlean/t5
// 0cc: astore 17
// 0ce: bipush 0
// 0cf: istore 18
// 0d1: aload 17
// 0d3: invokevirtual su/catlean/t5.b ()I
// 0d6: istore 17
// 0d8: iload 15
// 0da: iload 17
// 0dc: if_icmpge 0e7
// 0df: aload 16
// 0e1: astore 14
// 0e3: iload 17
// 0e5: istore 15
// 0e7: aload 13
// 0e9: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ee: ifne 0be
// 0f1: aload 10
// 0f3: ifnonnull 0e3
// 0f6: aload 14
// 0f8: checkcast su/catlean/t5
// 0fb: putstatic su/catlean/_8.D Lsu/catlean/t5;
// 0fe: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 101: aload 10
// 103: ifnonnull 12a
// 106: ifnull 3ae
// 109: goto 116
// 10c: ldc2_w 8964194795861847195
// 10f: lload 2
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 119: dup
// 11a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 11d: goto 12a
// 120: ldc2_w 8964194795861847195
// 123: lload 2
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: invokevirtual su/catlean/t5.O ()Lsu/catlean/_w;
// 12d: putstatic su/catlean/_8.S Lsu/catlean/_w;
// 130: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 133: dup
// 134: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 137: invokevirtual su/catlean/_w.q ()F
// 13a: lload 8
// 13c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13f: invokevirtual net/minecraft/class_746.method_36454 ()F
// 142: fcmpg
// 143: aload 10
// 145: ifnonnull 159
// 148: ifne 15c
// 14b: goto 158
// 14e: ldc2_w 8964194795861847195
// 151: lload 2
// 152: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: athrow
// 158: bipush 1
// 159: goto 15d
// 15c: bipush 0
// 15d: ifeq 305
// 160: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 163: dup
// 164: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 167: invokevirtual su/catlean/_w.N ()F
// 16a: lload 8
// 16c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16f: invokevirtual net/minecraft/class_746.method_36455 ()F
// 172: fcmpg
// 173: aload 10
// 175: ifnonnull 196
// 178: goto 185
// 17b: ldc2_w 8964194795861847195
// 17e: lload 2
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: ifne 199
// 188: goto 195
// 18b: ldc2_w 8964194795861847195
// 18e: lload 2
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: bipush 1
// 196: goto 19a
// 199: bipush 0
// 19a: ifeq 305
// 19d: getstatic su/catlean/_8.r Ljava/util/ArrayList;
// 1a0: checkcast java/lang/Iterable
// 1a3: astore 12
// 1a5: bipush 0
// 1a6: istore 13
// 1a8: aload 12
// 1aa: astore 14
// 1ac: new java/util/ArrayList
// 1af: dup
// 1b0: invokespecial java/util/ArrayList.<init> ()V
// 1b3: checkcast java/util/Collection
// 1b6: astore 15
// 1b8: bipush 0
// 1b9: istore 16
// 1bb: aload 14
// 1bd: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1c2: astore 17
// 1c4: aload 17
// 1c6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1cb: ifeq 227
// 1ce: aload 17
// 1d0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d5: astore 18
// 1d7: aload 18
// 1d9: checkcast su/catlean/t5
// 1dc: astore 19
// 1de: bipush 0
// 1df: istore 20
// 1e1: aload 19
// 1e3: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 1e6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1e9: aload 10
// 1eb: ifnonnull 233
// 1ee: aload 10
// 1f0: ifnonnull 211
// 1f3: goto 200
// 1f6: ldc2_w 8964194795861847195
// 1f9: lload 2
// 1fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ff: athrow
// 200: ifne 214
// 203: goto 210
// 206: ldc2_w 8964194795861847195
// 209: lload 2
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: bipush 1
// 211: goto 215
// 214: bipush 0
// 215: ifeq 1c4
// 218: aload 15
// 21a: aload 18
// 21c: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 221: pop
// 222: aload 10
// 224: ifnull 1c4
// 227: aload 15
// 229: checkcast java/util/List
// 22c: nop
// 22d: checkcast java/lang/Iterable
// 230: astore 12
// 232: bipush 0
// 233: istore 13
// 235: aload 12
// 237: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 23c: astore 14
// 23e: aload 14
// 240: invokeinterface java/util/Iterator.hasNext ()Z 1
// 245: aload 10
// 247: ifnonnull 28a
// 24a: ifne 268
// 24d: goto 25a
// 250: ldc2_w 8964194795861847195
// 253: lload 2
// 254: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 259: athrow
// 25a: aconst_null
// 25b: goto 2e7
// 25e: ldc2_w 8964194795861847195
// 261: lload 2
// 262: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 267: athrow
// 268: aload 14
// 26a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 26f: astore 15
// 271: aload 14
// 273: aload 10
// 275: ifnonnull 29e
// 278: invokeinterface java/util/Iterator.hasNext ()Z 1
// 27d: goto 28a
// 280: ldc2_w 8964194795861847195
// 283: lload 2
// 284: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: athrow
// 28a: ifne 29c
// 28d: aload 15
// 28f: goto 2e7
// 292: ldc2_w 8964194795861847195
// 295: lload 2
// 296: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29b: athrow
// 29c: aload 15
// 29e: checkcast su/catlean/t5
// 2a1: astore 16
// 2a3: bipush 0
// 2a4: istore 17
// 2a6: aload 16
// 2a8: invokevirtual su/catlean/t5.b ()I
// 2ab: istore 16
// 2ad: aload 14
// 2af: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2b4: astore 17
// 2b6: aload 17
// 2b8: checkcast su/catlean/t5
// 2bb: astore 18
// 2bd: bipush 0
// 2be: istore 19
// 2c0: aload 18
// 2c2: invokevirtual su/catlean/t5.b ()I
// 2c5: istore 18
// 2c7: iload 16
// 2c9: iload 18
// 2cb: if_icmpge 2d6
// 2ce: aload 17
// 2d0: astore 15
// 2d2: iload 18
// 2d4: istore 16
// 2d6: aload 14
// 2d8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2dd: ifne 2ad
// 2e0: aload 10
// 2e2: ifnonnull 2d2
// 2e5: aload 15
// 2e7: checkcast su/catlean/t5
// 2ea: dup
// 2eb: ifnull 303
// 2ee: astore 13
// 2f0: bipush 0
// 2f1: istore 14
// 2f3: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 2f6: pop
// 2f7: aload 13
// 2f9: invokevirtual su/catlean/t5.O ()Lsu/catlean/_w;
// 2fc: putstatic su/catlean/_8.S Lsu/catlean/_w;
// 2ff: nop
// 300: goto 305
// 303: pop
// 304: nop
// 305: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 308: dup
// 309: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 30c: lload 4
// 30e: invokevirtual su/catlean/_w.s (J)Lsu/catlean/_w;
// 311: putstatic su/catlean/_8.S Lsu/catlean/_w;
// 314: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 317: instanceof su/catlean/tu
// 31a: aload 10
// 31c: ifnonnull 368
// 31f: ifeq 350
// 322: goto 32f
// 325: ldc2_w 8964194795861847195
// 328: lload 2
// 329: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32e: athrow
// 32f: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 332: dup
// 333: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 336: invokevirtual su/catlean/t5.A ()Lkotlin/jvm/functions/Function0;
// 339: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 33e: pop
// 33f: aconst_null
// 340: putstatic su/catlean/_8.D Lsu/catlean/t5;
// 343: goto 350
// 346: ldc2_w 8964194795861847195
// 349: lload 2
// 34a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34f: athrow
// 350: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 353: aload 10
// 355: ifnonnull 3a1
// 358: instanceof su/catlean/ty
// 35b: goto 368
// 35e: ldc2_w 8964194795861847195
// 361: lload 2
// 362: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 367: athrow
// 368: ifeq 3a8
// 36b: new su/catlean/t5
// 36e: dup
// 36f: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 372: dup
// 373: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 376: invokevirtual su/catlean/t5.O ()Lsu/catlean/_w;
// 379: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 37c: dup
// 37d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 380: invokevirtual su/catlean/t5.b ()I
// 383: lload 6
// 385: dup2_x1
// 386: pop2
// 387: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 38a: dup
// 38b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 38e: invokevirtual su/catlean/t5.A ()Lkotlin/jvm/functions/Function0;
// 391: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// 394: goto 3a1
// 397: ldc2_w 8964194795861847195
// 39a: lload 2
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: putstatic su/catlean/_8.F Lsu/catlean/t5;
// 3a4: aconst_null
// 3a5: putstatic su/catlean/_8.D Lsu/catlean/t5;
// 3a8: getstatic su/catlean/_8.r Ljava/util/ArrayList;
// 3ab: invokevirtual java/util/ArrayList.clear ()V
// 3ae: return
}

@Flow(
priority = 20
)
private final void k(PreSyncEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_8.a J
// 03: ldc2_w 14328655188075
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 121651031484754
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 117621318056945
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -6208322910635927505
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: new su/catlean/_w
// 24: dup
// 25: lload 6
// 27: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a: invokevirtual net/minecraft/class_746.method_36454 ()F
// 2d: lload 6
// 2f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 32: invokevirtual net/minecraft/class_746.method_36455 ()F
// 35: lload 4
// 37: dup2_x1
// 38: pop2
// 39: bipush 0
// 3a: aconst_null
// 3b: sipush 1308
// 3e: ldc2_w 3146865222515255200
// 41: lload 2
// 42: lxor
// 43: invokedynamic v (IJ)I bsm=su/catlean/_8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: aconst_null
// 49: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 4c: putstatic su/catlean/_8.H Lsu/catlean/_w;
// 4f: astore 8
// 51: getstatic su/catlean/_8.l Lsu/catlean/_w;
// 54: putstatic su/catlean/_8.m Lsu/catlean/_w;
// 57: aconst_null
// 58: putstatic su/catlean/_8.l Lsu/catlean/_w;
// 5b: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 5e: aload 8
// 60: ifnonnull a7
// 63: ifnull ae
// 66: goto 73
// 69: ldc2_w -6222512866763605671
// 6c: lload 2
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: lload 6
// 75: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 78: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 7b: dup
// 7c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 7f: invokevirtual su/catlean/_w.q ()F
// 82: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 85: lload 6
// 87: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8a: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 8d: dup
// 8e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 91: invokevirtual su/catlean/_w.N ()F
// 94: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 97: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 9a: goto a7
// 9d: ldc2_w -6222512866763605671
// a0: lload 2
// a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: athrow
// a7: putstatic su/catlean/_8.l Lsu/catlean/_w;
// aa: aconst_null
// ab: putstatic su/catlean/_8.S Lsu/catlean/_w;
// ae: return
}

@Flow(
priority = -20
)
private final void e(PostSyncEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_8.a J
// 03: ldc2_w 16943480071554
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 115006483598872
// 0d: lxor
// 0e: lstore 4
// 10: pop2
// 11: ldc2_w -2576453349060956730
// 14: lload 2
// 15: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a: astore 6
// 1c: aload 6
// 1e: ifnonnull 71
// 21: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 24: ifnull 55
// 27: goto 34
// 2a: ldc2_w -2572624229464109904
// 2d: lload 2
// 2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: athrow
// 34: getstatic su/catlean/_8.D Lsu/catlean/t5;
// 37: dup
// 38: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 3b: invokevirtual su/catlean/t5.A ()Lkotlin/jvm/functions/Function0;
// 3e: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 43: pop
// 44: aconst_null
// 45: putstatic su/catlean/_8.D Lsu/catlean/t5;
// 48: goto 55
// 4b: ldc2_w -2572624229464109904
// 4e: lload 2
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: lload 4
// 57: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5a: getstatic su/catlean/_8.H Lsu/catlean/_w;
// 5d: invokevirtual su/catlean/_w.q ()F
// 60: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 63: lload 4
// 65: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 68: getstatic su/catlean/_8.H Lsu/catlean/_w;
// 6b: invokevirtual su/catlean/_w.N ()F
// 6e: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 71: return
}

@Flow
private final void o(LookRenderEvent var1) {
long var2 = a ^ 126205833207585L;
long var10001 = var2 ^ 36249181430478L;
int var4 = (int)((var2 ^ 36249181430478L) >>> 32);
int var5 = (int)((var2 ^ 36249181430478L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
_g[] var7 = vm.a<"Å">(-1829054136900118683L, var2);

_w var10000;
label26: {
try {
var10000 = l;
if (var7 != null) {
break label26;
}

if (l == null) {
return;
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, -1806138868802669037L, var2);
}

var10000 = m;
}

try {
if (var10000 != null) {
i = var1.getBodyYaw();
jl var10 = jl.y;
_w var10002 = m;
Intrinsics.checkNotNull(m);
float var12 = var10002.q();
_w var10003 = l;
Intrinsics.checkNotNull(l);
var1.setBodyYaw(class_3532.method_15393(var10.B(var12, var10003.q(), zi.v.n(var4, (char)var5, var6))));
var1.setYaw(0.0F);
jl var11 = jl.y;
var10002 = m;
Intrinsics.checkNotNull(m);
float var14 = var10002.N();
var10003 = l;
Intrinsics.checkNotNull(l);
var1.setPitch(class_3532.method_15393(var11.B(var14, var10003.N(), zi.v.n(var4, (char)var5, var6))));
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -1806138868802669037L, var2);
}
}

@Flow
private final void L(JumpEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_8.a J
// 03: ldc2_w 123745887663722
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 68490389500812
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 48
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 48
// 22: lshl
// 23: bipush 48
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: dup2
// 2b: ldc2_w 43603519459182
// 2e: lxor
// 2f: dup2
// 30: bipush 32
// 32: lushr
// 33: l2i
// 34: istore 7
// 36: dup2
// 37: bipush 32
// 39: lshl
// 3a: bipush 56
// 3c: lushr
// 3d: l2i
// 3e: istore 8
// 40: dup2
// 41: bipush 40
// 43: lshl
// 44: bipush 40
// 46: lushr
// 47: l2i
// 48: istore 9
// 4a: pop2
// 4b: dup2
// 4c: ldc2_w 119985982439077
// 4f: lxor
// 50: lstore 10
// 52: pop2
// 53: ldc2_w -8082018806418211282
// 56: lload 2
// 57: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: astore 12
// 5e: aload 12
// 60: ifnonnull b0
// 63: aload 0
// 64: iload 7
// 66: iload 8
// 68: i2b
// 69: iload 9
// 6b: invokespecial su/catlean/_8.C (IBI)Z
// 6e: ifne 99
// 71: goto 7e
// 74: ldc2_w -8096262633305677992
// 77: lload 2
// 78: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d: athrow
// 7e: aload 0
// 7f: iload 4
// 81: iload 5
// 83: i2c
// 84: iload 6
// 86: invokespecial su/catlean/_8.V (ICI)Z
// 89: ifeq b4
// 8c: goto 99
// 8f: ldc2_w -8096262633305677992
// 92: lload 2
// 93: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98: athrow
// 99: aload 1
// 9a: aload 0
// 9b: lload 10
// 9d: invokevirtual su/catlean/_8.k (J)F
// a0: invokevirtual su/catlean/api/event/events/player/JumpEvent.setYaw (F)V
// a3: goto b0
// a6: ldc2_w -8096262633305677992
// a9: lload 2
// aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af: athrow
// b0: aload 1
// b1: invokevirtual su/catlean/api/event/events/player/JumpEvent.cancel ()V
// b4: return
}

@Flow
private final void H(FixVelocityEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_8.a J
// 03: ldc2_w 84791933955371
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 4257753426125
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 48
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 48
// 22: lshl
// 23: bipush 48
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: dup2
// 2b: ldc2_w 57354071773493
// 2e: lxor
// 2f: lstore 7
// 31: dup2
// 32: ldc2_w 88740826129892
// 35: lxor
// 36: lstore 9
// 38: pop2
// 39: ldc2_w -3127790473958316689
// 3c: lload 2
// 3d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: astore 11
// 44: aload 11
// 46: ifnonnull 8b
// 49: aload 0
// 4a: iload 4
// 4c: iload 5
// 4e: i2c
// 4f: iload 6
// 51: invokespecial su/catlean/_8.V (ICI)Z
// 54: ifeq 8f
// 57: goto 64
// 5a: ldc2_w -3105951495699528679
// 5d: lload 2
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: aload 1
// 65: aload 0
// 66: aload 0
// 67: lload 9
// 69: invokevirtual su/catlean/_8.k (J)F
// 6c: aload 1
// 6d: invokevirtual su/catlean/api/event/events/player/FixVelocityEvent.getMovementInput ()Lnet/minecraft/class_243;
// 70: lload 7
// 72: dup2_x1
// 73: pop2
// 74: aload 1
// 75: invokevirtual su/catlean/api/event/events/player/FixVelocityEvent.getSpeed ()F
// 78: invokespecial su/catlean/_8.p (FJLnet/minecraft/class_243;F)Lnet/minecraft/class_243;
// 7b: invokevirtual su/catlean/api/event/events/player/FixVelocityEvent.setVelocity (Lnet/minecraft/class_243;)V
// 7e: goto 8b
// 81: ldc2_w -3105951495699528679
// 84: lload 2
// 85: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a: athrow
// 8b: aload 1
// 8c: invokevirtual su/catlean/api/event/events/player/FixVelocityEvent.cancel ()V
// 8f: return
}

@Flow
private final void r(KeyboardInputEvent var1) {
long var2 = a ^ 7738945681573L;
long var10001 = var2 ^ 81126058147139L;
int var4 = (int)((var2 ^ 81126058147139L) >>> 32);
int var5 = (int)((var2 ^ 81126058147139L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
long var7 = var2 ^ 106618865701695L;
if (this.V(var4, (char)var5, var6)) {
float var9 = zf.v(var7).field_3913.method_3128().field_1342;
float var10 = zf.v(var7).field_3913.method_3128().field_1343;
float var11 = zf.v(var7).method_36454();
_w var19 = S;
Intrinsics.checkNotNull(S);
float var12 = (var11 - var19.q()) * (float) (Math.PI / 180.0);
float var13 = (float)Math.cos(var12);
float var14 = (float)Math.sin(var12);
float var15 = MathKt.roundToInt(var9 * var13 + var10 * var14);
float var16 = MathKt.roundToInt(var10 * var13 - var9 * var14);

class_744 var18;
class_10185 var10002;
boolean var10003;
label39: {
try {
var18 = zf.v(var7).field_3913;
Intrinsics.checkNotNull(var18, a<"c">(17137, 7633570903163721382L ^ var2));
((ClientInputAccessor)var18).setMoveVector(new class_241(var16, var15));
var18 = zf.v(var7).field_3913;
var20 = new class_10185;
var10002 = var20;
if (var15 > 0.0F) {
var10003 = true;
break label39;
}
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, 102240862942876055L, var2);
}

var10003 = false;
}

var10002./* $VF: Unable to resugar constructor */<init>(
var10003,
var15 < 0.0F,
var16 > 0.0F,
var16 < 0.0F,
zf.v(var7).field_3913.field_54155.comp_3163(),
zf.v(var7).field_3913.field_54155.comp_3164(),
ja.E.w() ? false : zf.v(var7).field_3913.field_54155.comp_3165()
);
var18.field_54155 = var20;
}
}

@Flow
private final void O(PreInteractItemEvent var1) {
long var2 = a ^ 90757718178620L;
long var4 = var2 ^ 67049247792513L;
long var6 = var2 ^ 58801642999974L;
y = zf.v(var6).method_36454();
V = zf.v(var6).method_36455();
_w var8 = this.f(var4, true);
zf.v(var6).method_36456(var8.q());
zf.v(var6).method_36457(var8.N());
}

@Flow
private final void I(PostInteractItemEvent var1) {
long var2 = a ^ 51989244126190L;
long var4 = var2 ^ 79960730224756L;
zf.v(var4).method_36456(y);
zf.v(var4).method_36457(V);
}

private final boolean V(int param1, char param2, int param3) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/_8.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 76155853520947
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 18160939287511
// 02a: lxor
// 02b: lstore 8
// 02d: dup2
// 02e: ldc2_w 127223346878089
// 031: lxor
// 032: lstore 10
// 034: pop2
// 035: ldc2_w 337631949288174935
// 038: lload 4
// 03a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: astore 12
// 041: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 044: ifnull 18a
// 047: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 04a: lload 8
// 04c: invokevirtual su/catlean/_a.f (J)Z
// 04f: ifeq 18a
// 052: goto 060
// 055: ldc2_w 350481188429059105
// 058: lload 4
// 05a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: athrow
// 060: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 063: dup
// 064: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 067: invokevirtual su/catlean/_w.n ()Lsu/catlean/z3;
// 06a: getstatic su/catlean/z3.FORCE Lsu/catlean/z3;
// 06d: if_acmpeq 18a
// 070: goto 07e
// 073: ldc2_w 350481188429059105
// 076: lload 4
// 078: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: athrow
// 07e: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 081: lload 6
// 083: invokevirtual su/catlean/_a.j (J)Lsu/catlean/lu;
// 086: getstatic su/catlean/lu.FOCUS Lsu/catlean/lu;
// 089: if_acmpeq 18a
// 08c: goto 09a
// 08f: ldc2_w 350481188429059105
// 092: lload 4
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: lload 10
// 09c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09f: invokevirtual net/minecraft/class_746.method_3144 ()Z
// 0a2: aload 12
// 0a4: iload 2
// 0a5: iflt 0e2
// 0a8: ifnonnull 0e0
// 0ab: goto 0b9
// 0ae: ldc2_w 350481188429059105
// 0b1: lload 4
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: ifne 18a
// 0bc: goto 0ca
// 0bf: ldc2_w 350481188429059105
// 0c2: lload 4
// 0c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: athrow
// 0ca: lload 10
// 0cc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cf: invokevirtual net/minecraft/class_746.method_5681 ()Z
// 0d2: goto 0e0
// 0d5: ldc2_w 350481188429059105
// 0d8: lload 4
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: aload 12
// 0e2: iload 3
// 0e3: iflt 112
// 0e6: ifnonnull 110
// 0e9: ifne 18a
// 0ec: goto 0fa
// 0ef: ldc2_w 350481188429059105
// 0f2: lload 4
// 0f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f9: athrow
// 0fa: getstatic su/catlean/ea.D Lsu/catlean/ea;
// 0fd: lload 8
// 0ff: invokevirtual su/catlean/ea.f (J)Z
// 102: goto 110
// 105: ldc2_w 350481188429059105
// 108: lload 4
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: aload 12
// 112: iload 3
// 113: ifle 142
// 116: ifnonnull 140
// 119: ifne 18a
// 11c: goto 12a
// 11f: ldc2_w 350481188429059105
// 122: lload 4
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: getstatic su/catlean/kl.x Lsu/catlean/kl;
// 12d: lload 8
// 12f: invokevirtual su/catlean/kl.f (J)Z
// 132: goto 140
// 135: ldc2_w 350481188429059105
// 138: lload 4
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: aload 12
// 142: iload 1
// 143: ifle 172
// 146: ifnonnull 170
// 149: ifne 18a
// 14c: goto 15a
// 14f: ldc2_w 350481188429059105
// 152: lload 4
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: getstatic su/catlean/_0.D Lsu/catlean/_0;
// 15d: lload 8
// 15f: invokevirtual su/catlean/_0.f (J)Z
// 162: goto 170
// 165: ldc2_w 350481188429059105
// 168: lload 4
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: aload 12
// 172: ifnonnull 187
// 175: ifne 18a
// 178: goto 186
// 17b: ldc2_w 350481188429059105
// 17e: lload 4
// 180: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 185: athrow
// 186: bipush 1
// 187: goto 18b
// 18a: bipush 0
// 18b: ireturn
}

private final boolean C(int param1, byte param2, int param3) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 56
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 40
// 012: lshl
// 013: bipush 40
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/_8.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 101850846543057
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 10337873706805
// 02a: lxor
// 02b: lstore 8
// 02d: dup2
// 02e: ldc2_w 116925845351019
// 031: lxor
// 032: lstore 10
// 034: pop2
// 035: ldc2_w -554616091100640843
// 038: lload 4
// 03a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: astore 12
// 041: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 044: ifnull 261
// 047: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 04a: lload 8
// 04c: invokevirtual su/catlean/_a.f (J)Z
// 04f: aload 12
// 051: ifnonnull 1e7
// 054: goto 062
// 057: ldc2_w -558673771677177661
// 05a: lload 4
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: iload 1
// 063: iflt 1d9
// 066: ifne 1d1
// 069: goto 077
// 06c: ldc2_w -558673771677177661
// 06f: lload 4
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 07a: lload 8
// 07c: invokevirtual su/catlean/_a.f (J)Z
// 07f: aload 12
// 081: iload 3
// 082: ifle 0df
// 085: ifnonnull 0dd
// 088: goto 096
// 08b: ldc2_w -558673771677177661
// 08e: lload 4
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: iload 1
// 097: iflt 0cf
// 09a: ifeq 0c7
// 09d: goto 0ab
// 0a0: ldc2_w -558673771677177661
// 0a3: lload 4
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 0ae: lload 6
// 0b0: invokevirtual su/catlean/_a.j (J)Lsu/catlean/lu;
// 0b3: getstatic su/catlean/lu.FOCUS Lsu/catlean/lu;
// 0b6: if_acmpeq 1d1
// 0b9: goto 0c7
// 0bc: ldc2_w -558673771677177661
// 0bf: lload 4
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 0ca: lload 8
// 0cc: invokevirtual su/catlean/uy.f (J)Z
// 0cf: goto 0dd
// 0d2: ldc2_w -558673771677177661
// 0d5: lload 4
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: aload 12
// 0df: ifnonnull 1e7
// 0e2: ifne 1d1
// 0e5: goto 0f3
// 0e8: ldc2_w -558673771677177661
// 0eb: lload 4
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: getstatic su/catlean/ul.b Lsu/catlean/ul;
// 0f6: lload 8
// 0f8: invokevirtual su/catlean/ul.f (J)Z
// 0fb: aload 12
// 0fd: ifnonnull 1e7
// 100: goto 10e
// 103: ldc2_w -558673771677177661
// 106: lload 4
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: iload 1
// 10f: iflt 1d9
// 112: ifne 1d1
// 115: goto 123
// 118: ldc2_w -558673771677177661
// 11b: lload 4
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 126: dup
// 127: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 12a: invokevirtual su/catlean/_w.n ()Lsu/catlean/z3;
// 12d: getstatic su/catlean/z3.FORCE Lsu/catlean/z3;
// 130: if_acmpeq 1d1
// 133: goto 141
// 136: ldc2_w -558673771677177661
// 139: lload 4
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: lload 10
// 143: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 146: invokevirtual net/minecraft/class_746.method_3144 ()Z
// 149: aload 12
// 14b: ifnonnull 1e7
// 14e: goto 15c
// 151: ldc2_w -558673771677177661
// 154: lload 4
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: iload 1
// 15d: ifle 1d9
// 160: ifne 1d1
// 163: goto 171
// 166: ldc2_w -558673771677177661
// 169: lload 4
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: lload 10
// 173: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 176: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 179: aload 12
// 17b: ifnonnull 1e7
// 17e: goto 18c
// 181: ldc2_w -558673771677177661
// 184: lload 4
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: iload 2
// 18d: ifle 1d9
// 190: ifne 1d1
// 193: goto 1a1
// 196: ldc2_w -558673771677177661
// 199: lload 4
// 19b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: athrow
// 1a1: lload 10
// 1a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a6: invokevirtual net/minecraft/class_746.method_5681 ()Z
// 1a9: aload 12
// 1ab: iload 2
// 1ac: ifle 1e9
// 1af: ifnonnull 1e7
// 1b2: goto 1c0
// 1b5: ldc2_w -558673771677177661
// 1b8: lload 4
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: ifeq 261
// 1c3: goto 1d1
// 1c6: ldc2_w -558673771677177661
// 1c9: lload 4
// 1cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: athrow
// 1d1: getstatic su/catlean/ea.D Lsu/catlean/ea;
// 1d4: lload 8
// 1d6: invokevirtual su/catlean/ea.f (J)Z
// 1d9: goto 1e7
// 1dc: ldc2_w -558673771677177661
// 1df: lload 4
// 1e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e6: athrow
// 1e7: aload 12
// 1e9: iload 3
// 1ea: ifle 219
// 1ed: ifnonnull 217
// 1f0: ifne 261
// 1f3: goto 201
// 1f6: ldc2_w -558673771677177661
// 1f9: lload 4
// 1fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 200: athrow
// 201: getstatic su/catlean/kl.x Lsu/catlean/kl;
// 204: lload 8
// 206: invokevirtual su/catlean/kl.f (J)Z
// 209: goto 217
// 20c: ldc2_w -558673771677177661
// 20f: lload 4
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: aload 12
// 219: iload 2
// 21a: ifle 249
// 21d: ifnonnull 247
// 220: ifne 261
// 223: goto 231
// 226: ldc2_w -558673771677177661
// 229: lload 4
// 22b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 230: athrow
// 231: getstatic su/catlean/_0.D Lsu/catlean/_0;
// 234: lload 8
// 236: invokevirtual su/catlean/_0.f (J)Z
// 239: goto 247
// 23c: ldc2_w -558673771677177661
// 23f: lload 4
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: aload 12
// 249: ifnonnull 25e
// 24c: ifne 261
// 24f: goto 25d
// 252: ldc2_w -558673771677177661
// 255: lload 4
// 257: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25c: athrow
// 25d: bipush 1
// 25e: goto 262
// 261: bipush 0
// 262: ireturn
}

@Flow
private final void c(EventPlayerTravel param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_8.a J
// 003: ldc2_w 129279394362895
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 38173090795275
// 00d: lxor
// 00e: dup2
// 00f: bipush 32
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 32
// 018: lshl
// 019: bipush 56
// 01b: lushr
// 01c: l2i
// 01d: istore 5
// 01f: dup2
// 020: bipush 40
// 022: lshl
// 023: bipush 40
// 025: lushr
// 026: l2i
// 027: istore 6
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 24429849677622
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 20228405124501
// 035: lxor
// 036: lstore 9
// 038: pop2
// 039: ldc2_w 1131498244890164811
// 03c: lload 2
// 03d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 042: astore 11
// 044: aload 11
// 046: ifnonnull 09f
// 049: aload 0
// 04a: iload 4
// 04c: iload 5
// 04e: i2b
// 04f: iload 6
// 051: invokespecial su/catlean/_8.C (IBI)Z
// 054: ifeq 105
// 057: goto 064
// 05a: ldc2_w 1135268948573839165
// 05d: lload 2
// 05e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: athrow
// 064: new su/catlean/_w
// 067: dup
// 068: lload 9
// 06a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06d: invokevirtual net/minecraft/class_746.method_36454 ()F
// 070: lload 9
// 072: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 075: invokevirtual net/minecraft/class_746.method_36455 ()F
// 078: lload 7
// 07a: dup2_x1
// 07b: pop2
// 07c: bipush 0
// 07d: aconst_null
// 07e: sipush 24441
// 081: ldc2_w 7142493209097771936
// 084: lload 2
// 085: lxor
// 086: invokedynamic v (IJ)I bsm=su/catlean/_8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: aconst_null
// 08c: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 08f: putstatic su/catlean/_8.O Lsu/catlean/_w;
// 092: goto 09f
// 095: ldc2_w 1135268948573839165
// 098: lload 2
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: lload 9
// 0a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a4: aload 11
// 0a6: ifnonnull 0ce
// 0a9: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 0ac: dup
// 0ad: ifnull 0cd
// 0b0: goto 0bd
// 0b3: ldc2_w 1135268948573839165
// 0b6: lload 2
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: invokevirtual su/catlean/_w.q ()F
// 0c0: goto 0cf
// 0c3: ldc2_w 1135268948573839165
// 0c6: lload 2
// 0c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: athrow
// 0cd: pop
// 0ce: fconst_0
// 0cf: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 0d2: lload 9
// 0d4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d7: aload 11
// 0d9: ifnonnull 101
// 0dc: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 0df: dup
// 0e0: ifnull 100
// 0e3: goto 0f0
// 0e6: ldc2_w 1135268948573839165
// 0e9: lload 2
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: invokevirtual su/catlean/_w.N ()F
// 0f3: goto 102
// 0f6: ldc2_w 1135268948573839165
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: pop
// 101: fconst_0
// 102: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 105: return
}

@Flow
private final void u(EventPostPlayerTravel param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_8.a J
// 03: ldc2_w 88301496817644
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 8163168169704
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 56
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 40
// 22: lshl
// 23: bipush 40
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: dup2
// 2b: ldc2_w 61292234652790
// 2e: lxor
// 2f: lstore 7
// 31: pop2
// 32: aload 0
// 33: iload 4
// 35: iload 5
// 37: i2b
// 38: iload 6
// 3a: invokespecial su/catlean/_8.C (IBI)Z
// 3d: ifeq 84
// 40: getstatic su/catlean/_8.O Lsu/catlean/_w;
// 43: ifnull 84
// 46: goto 53
// 49: ldc2_w 7936025080226594526
// 4c: lload 2
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: lload 7
// 55: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 58: getstatic su/catlean/_8.O Lsu/catlean/_w;
// 5b: dup
// 5c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5f: invokevirtual su/catlean/_w.q ()F
// 62: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 65: lload 7
// 67: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 6a: getstatic su/catlean/_8.O Lsu/catlean/_w;
// 6d: dup
// 6e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 71: invokevirtual su/catlean/_w.N ()F
// 74: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 77: goto 84
// 7a: ldc2_w 7936025080226594526
// 7d: lload 2
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: return
}

@Flow
private final void E(FireWorkVectorEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_8.a J
// 003: ldc2_w 4174974282585
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 117397362152208
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 4425623444861
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 7751936611741
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 110217205219523
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w 5973345341437420317
// 029: lload 2
// 02a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: astore 12
// 031: getstatic su/catlean/_a.n Lsu/catlean/_a;
// 034: lload 8
// 036: invokevirtual su/catlean/_a.f (J)Z
// 039: aload 12
// 03b: ifnonnull 0b7
// 03e: ifne 0a2
// 041: goto 04e
// 044: ldc2_w 5951294977777402475
// 047: lload 2
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 051: lload 8
// 053: invokevirtual su/catlean/uy.f (J)Z
// 056: aload 12
// 058: ifnonnull 0b7
// 05b: goto 068
// 05e: ldc2_w 5951294977777402475
// 061: lload 2
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: ifne 0a2
// 06b: goto 078
// 06e: ldc2_w 5951294977777402475
// 071: lload 2
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: getstatic su/catlean/ul.b Lsu/catlean/ul;
// 07b: lload 8
// 07d: invokevirtual su/catlean/ul.f (J)Z
// 080: aload 12
// 082: ifnonnull 0b7
// 085: goto 092
// 088: ldc2_w 5951294977777402475
// 08b: lload 2
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: ifeq 163
// 095: goto 0a2
// 098: ldc2_w 5951294977777402475
// 09b: lload 2
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: lload 10
// 0a4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a7: invokevirtual net/minecraft/class_746.method_3144 ()Z
// 0aa: goto 0b7
// 0ad: ldc2_w 5951294977777402475
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: aload 12
// 0b9: ifnonnull 135
// 0bc: ifne 120
// 0bf: goto 0cc
// 0c2: ldc2_w 5951294977777402475
// 0c5: lload 2
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: lload 10
// 0ce: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d1: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 0d4: aload 12
// 0d6: ifnonnull 135
// 0d9: goto 0e6
// 0dc: ldc2_w 5951294977777402475
// 0df: lload 2
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: ifne 120
// 0e9: goto 0f6
// 0ec: ldc2_w 5951294977777402475
// 0ef: lload 2
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: lload 10
// 0f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fb: invokevirtual net/minecraft/class_746.method_5681 ()Z
// 0fe: aload 12
// 100: ifnonnull 135
// 103: goto 110
// 106: ldc2_w 5951294977777402475
// 109: lload 2
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: ifeq 163
// 113: goto 120
// 116: ldc2_w 5951294977777402475
// 119: lload 2
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: getstatic su/catlean/ea.D Lsu/catlean/ea;
// 123: lload 8
// 125: invokevirtual su/catlean/ea.f (J)Z
// 128: goto 135
// 12b: ldc2_w 5951294977777402475
// 12e: lload 2
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: ifne 163
// 138: aload 1
// 139: invokevirtual su/catlean/api/event/events/world/FireWorkVectorEvent.cancel ()V
// 13c: aload 1
// 13d: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 140: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 143: lload 6
// 145: invokevirtual su/catlean/dm.w (J)F
// 148: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 14b: lload 4
// 14d: invokevirtual su/catlean/dm.U (J)F
// 150: invokevirtual su/catlean/dm.y (FF)Lnet/minecraft/class_243;
// 153: invokevirtual su/catlean/api/event/events/world/FireWorkVectorEvent.setVector (Lnet/minecraft/class_243;)V
// 156: goto 163
// 159: ldc2_w 5951294977777402475
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: return
}

@Flow
private final void r(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_8.a J
// 003: ldc2_w 30800923164118
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 86020013621305
// 00d: lxor
// 00e: dup2
// 00f: bipush 32
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 32
// 018: lshl
// 019: bipush 48
// 01b: lushr
// 01c: l2i
// 01d: istore 5
// 01f: dup2
// 020: bipush 48
// 022: lshl
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 6
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 45911727290712
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 27228123628306
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 136281872078412
// 03c: lxor
// 03d: lstore 11
// 03f: pop2
// 040: ldc2_w -4293467287449356910
// 043: lload 2
// 044: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 049: getstatic su/catlean/_8.l Lsu/catlean/_w;
// 04c: astore 14
// 04e: getstatic su/catlean/_8.m Lsu/catlean/_w;
// 051: astore 15
// 053: astore 13
// 055: aload 14
// 057: aload 13
// 059: ifnonnull 06e
// 05c: ifnull 10a
// 05f: goto 06c
// 062: ldc2_w -4316664442835987228
// 065: lload 2
// 066: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: athrow
// 06c: aload 15
// 06e: ifnull 10a
// 071: getstatic su/catlean/um.E Lsu/catlean/um;
// 074: lload 9
// 076: invokevirtual su/catlean/um.f (J)Z
// 079: aload 13
// 07b: ifnonnull 0b0
// 07e: goto 08b
// 081: ldc2_w -4316664442835987228
// 084: lload 2
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: ifeq 10a
// 08e: goto 09b
// 091: ldc2_w -4316664442835987228
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: getstatic su/catlean/tp.nc Lsu/catlean/tp;
// 09e: lload 7
// 0a0: invokevirtual su/catlean/tp.t (J)Z
// 0a3: goto 0b0
// 0a6: ldc2_w -4316664442835987228
// 0a9: lload 2
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: ifeq 10a
// 0b3: lload 11
// 0b5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b8: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0bb: aload 15
// 0bd: invokevirtual su/catlean/_w.q ()F
// 0c0: aload 14
// 0c2: invokevirtual su/catlean/_w.q ()F
// 0c5: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0c8: iload 4
// 0ca: iload 5
// 0cc: i2c
// 0cd: iload 6
// 0cf: invokevirtual su/catlean/zi.n (ICI)F
// 0d2: invokevirtual su/catlean/jl.B (FFF)F
// 0d5: invokevirtual net/minecraft/class_746.method_36456 (F)V
// 0d8: lload 11
// 0da: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0dd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0e0: aload 15
// 0e2: invokevirtual su/catlean/_w.N ()F
// 0e5: aload 14
// 0e7: invokevirtual su/catlean/_w.N ()F
// 0ea: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 0ed: iload 4
// 0ef: iload 5
// 0f1: i2c
// 0f2: iload 6
// 0f4: invokevirtual su/catlean/zi.n (ICI)F
// 0f7: invokevirtual su/catlean/jl.B (FFF)F
// 0fa: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 0fd: goto 10a
// 100: ldc2_w -4316664442835987228
// 103: lload 2
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: return
}

public final float k(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_8.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 5298151890422249598
// 09: lload 1
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 3
// 10: aload 3
// 11: ifnonnull 39
// 14: getstatic su/catlean/_8.S Lsu/catlean/_w;
// 17: dup
// 18: ifnull 38
// 1b: goto 28
// 1e: ldc2_w 5329020196685289736
// 21: lload 1
// 22: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: athrow
// 28: invokevirtual su/catlean/_w.q ()F
// 2b: goto 3a
// 2e: ldc2_w 5329020196685289736
// 31: lload 1
// 32: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: athrow
// 38: pop
// 39: fconst_0
// 3a: freturn
}

public final void r(float yaw, float pitch, long a) {
ax = a ^ ax;
long var5 = ax ^ 125737678576190L;
class_746 var7 = zf.v(var5);
boolean var8 = false;
var7.field_3944
.method_52787((class_2596)(new class_2830(var7.method_23317(), var7.method_23318(), var7.method_23321(), yaw, pitch, var7.method_24828(), var7.field_5976)));
}

@NotNull
public final _w P(@NotNull class_243 to, long a) {
ax = a ^ ax;
int var4 = (int)((ax ^ 59146445357035L) >>> 56);
long var5 = (ax ^ 59146445357035L) << 8 >>> 8;
long var7 = ax ^ 97298808826937L;
long var9 = ax ^ 60189592576596L;
long var11 = ax ^ 91103500315977L;
long var13 = ax ^ 95135163744234L;
Intrinsics.checkNotNullParameter(to, a<"c">(24025, 8314519114885948766L ^ ax));
double var15 = class_3532.method_15338(
Math.toDegrees(Math.atan2(to.field_1350 - zf.v(var13).method_23321(), to.field_1352 - zf.v(var13).method_23317()))
- b<"v">(17672, 6660165790634288045L ^ ax)
- dm.h.U(var7)
);
double var17 = -Math.toDegrees(
Math.atan2(
to.field_1351 - (_x.I.J((byte)var4, var5, (class_1297)zf.v(var13)).field_1351 + zf.v(var13).method_18381(zf.v(var13).method_18376())),
Math.hypot(to.field_1352 - zf.v(var13).method_23317(), to.field_1350 - zf.v(var13).method_23321())
)
)
- dm.h.w(var9);
double var19 = dm.h.U(var7) + var15;
double var21 = dm.h.w(var9) + var17;
return new _w((float)var19, var11, (float)var21, false, null, b<"v">(24441, 7142567552142326239L ^ ax), null);
}

private final class_243 p(float param1, long param2, class_243 param4, float param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_8.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w 9031887201601227951
// 09: lload 2
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 4
// 11: invokevirtual net/minecraft/class_243.method_1027 ()D
// 14: dstore 7
// 16: astore 6
// 18: dload 7
// 1a: ldc2_w 1.0E-7
// 1d: dcmpg
// 1e: aload 6
// 20: ifnonnull 56
// 23: ifge 52
// 26: goto 33
// 29: ldc2_w 9017648180769533401
// 2c: lload 2
// 2d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: athrow
// 33: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 36: dup
// 37: sipush 5700
// 3a: ldc2_w 409716372135411291
// 3d: lload 2
// 3e: lxor
// 3f: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 47: areturn
// 48: ldc2_w 9017648180769533401
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: dload 7
// 54: dconst_1
// 55: dcmpl
// 56: ifle 6b
// 59: aload 4
// 5b: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
// 5e: goto 6d
// 61: ldc2_w 9017648180769533401
// 64: lload 2
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: aload 4
// 6d: fload 5
// 6f: f2d
// 70: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
// 73: dup
// 74: sipush 24031
// 77: ldc2_w 3881361544534078914
// 7a: lload 2
// 7b: lxor
// 7c: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 84: astore 9
// 86: fload 1
// 87: ldc 0.017453292
// 89: fmul
// 8a: f2d
// 8b: invokestatic java/lang/Math.sin (D)D
// 8e: d2f
// 8f: fstore 10
// 91: fload 1
// 92: ldc 0.017453292
// 94: fmul
// 95: f2d
// 96: invokestatic java/lang/Math.cos (D)D
// 99: d2f
// 9a: fstore 11
// 9c: new net/minecraft/class_243
// 9f: dup
// a0: aload 9
// a2: getfield net/minecraft/class_243.field_1352 D
// a5: fload 11
// a7: f2d
// a8: dmul
// a9: aload 9
// ab: getfield net/minecraft/class_243.field_1350 D
// ae: fload 10
// b0: f2d
// b1: dmul
// b2: dsub
// b3: aload 9
// b5: getfield net/minecraft/class_243.field_1351 D
// b8: aload 9
// ba: getfield net/minecraft/class_243.field_1350 D
// bd: fload 11
// bf: f2d
// c0: dmul
// c1: aload 9
// c3: getfield net/minecraft/class_243.field_1352 D
// c6: fload 10
// c8: f2d
// c9: dmul
// ca: dadd
// cb: invokespecial net/minecraft/class_243.<init> (DDD)V
// ce: areturn
}

private static final Unit X() {
return Unit.INSTANCE;
}

private static final boolean h(t5 param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_8.a J
// 03: ldc2_w 19430775641013
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 103918936693476
// 0d: lxor
// 0e: lstore 3
// 0f: dup2
// 10: ldc2_w 130145746466863
// 13: lxor
// 14: lstore 5
// 16: pop2
// 17: ldc2_w 7640787297616370673
// 1a: lload 1
// 1b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: aload 0
// 21: sipush 30333
// 24: ldc2_w 5030324403504875837
// 27: lload 1
// 28: lxor
// 29: invokedynamic c (IJ)Ljava/lang/String; bsm=su/catlean/_8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 31: astore 7
// 33: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 36: aload 0
// 37: invokevirtual su/catlean/t5.O ()Lsu/catlean/_w;
// 3a: invokevirtual su/catlean/_w.q ()F
// 3d: aload 0
// 3e: invokevirtual su/catlean/t5.O ()Lsu/catlean/_w;
// 41: invokevirtual su/catlean/_w.N ()F
// 44: lload 3
// 45: invokevirtual su/catlean/_8.r (FFJ)V
// 48: aload 0
// 49: invokevirtual su/catlean/t5.A ()Lkotlin/jvm/functions/Function0;
// 4c: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 51: pop
// 52: aload 0
// 53: invokevirtual su/catlean/t5.O ()Lsu/catlean/_w;
// 56: invokevirtual su/catlean/_w.R ()Z
// 59: aload 7
// 5b: ifnonnull 93
// 5e: ifeq 92
// 61: goto 6e
// 64: ldc2_w 7672776006227999367
// 67: lload 1
// 68: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d: athrow
// 6e: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 71: lload 5
// 73: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 76: invokevirtual net/minecraft/class_746.method_36454 ()F
// 79: lload 5
// 7b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7e: invokevirtual net/minecraft/class_746.method_36455 ()F
// 81: lload 3
// 82: invokevirtual su/catlean/_8.r (FFJ)V
// 85: goto 92
// 88: ldc2_w 7672776006227999367
// 8b: lload 1
// 8c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91: athrow
// 92: bipush 1
// 93: ireturn
}

private static final boolean D(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 102685213202519L;
long var22 = var20 ^ 69030648717678L;
vm.a<"Å">(null, -6826064951216941816L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[8];
int var16 = 0;
String var15 = "Kê[\u008eÊY\u0094~h\fü\u0010Ä\u0012Ó(×\u0006[lP\u008eæÐ£ào\u0005ßFÞ\u0002\u0010\u0087b\u0015XÀ\u0003ã\u0083(Åw@Ï\u0015é¯\u0010Ö|\u0007-ú6\u0082Ç;Mk/²k\u0004`\u0010\u0083sç\u0097Ä×¥Ú\u0089:9<ªÍP\u0082\u0090C\u008c\u0092\u0098\u000e\u001d;/xÊ\u0007UÔ®-¼!}\r¤S2\u009c«d.*uy¶©øIs{\u0086\u0095Å²×\u0015¦Ûüfð\rËè\u001c\u0005&¤\u0097,ðüè\u008a=\u0091\bæàÍ\u0085É\\ÌF^úOEa÷=¹ùlÊ¦~ha4¡óIr\u0098\u0010Ã\u0003xB»2w\u0080÷æ7¯®\u009a³áhXZjÉ\u0015|Ø\u001b>ú\u001bß\u008c\u000eí¬údÙ\u0017JÅM@QGÍ]Øuò::\u0086¾ k\u0002\u0093\u0094\u000b(Vº¼:.e-²¹ªXÍ\u008d4qÜ\u001d\bî\u008f\u001eã,\u009aSV";
int var17 = "Kê[\u008eÊY\u0094~h\fü\u0010Ä\u0012Ó(×\u0006[lP\u008eæÐ£ào\u0005ßFÞ\u0002\u0010\u0087b\u0015XÀ\u0003ã\u0083(Åw@Ï\u0015é¯\u0010Ö|\u0007-ú6\u0082Ç;Mk/²k\u0004`\u0010\u0083sç\u0097Ä×¥Ú\u0089:9<ªÍP\u0082\u0090C\u008c\u0092\u0098\u000e\u001d;/xÊ\u0007UÔ®-¼!}\r¤S2\u009c«d.*uy¶©øIs{\u0086\u0095Å²×\u0015¦Ûüfð\rËè\u001c\u0005&¤\u0097,ðüè\u008a=\u0091\bæàÍ\u0085É\\ÌF^úOEa÷=¹ùlÊ¦~ha4¡óIr\u0098\u0010Ã\u0003xB»2w\u0080÷æ7¯®\u009a³áhXZjÉ\u0015|Ø\u001b>ú\u001bß\u008c\u000eí¬údÙ\u0017JÅM@QGÍ]Øuò::\u0086¾ k\u0002\u0093\u0094\u000b(Vº¼:.e-²¹ªXÍ\u008d4qÜ\u001d\bî\u008f\u001eã,\u009aSV"
.length();
char var14 = ' ';
int var26 = -1;

label54:
while (true) {
String var27 = var15.substring(++var26, var26 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var38 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var26 += var14) >= var17) {
b = var18;
d = new String[8];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "\u0086¹Ô\u0090Ð±¢ó\u009e\u0085C%´ä\u0081\u0016";
int var5 = "\u0086¹Ô\u0090Ð±¢ó\u009e\u0085C%´ä\u0081\u0016".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var30 = var6;
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
var30[var10001] = var47;
if (var2 >= var5) {
f = var6;
g = new Integer[4];
P = new _8();
r = new ArrayList();
Y = new ArrayList();
H = new _w(0.0F, var22, 0.0F, false, null, b<"v">(24441, 7142448748438828536L ^ var20), null);
return;
}
break;
default:
var30[var10001] = var47;
if (var2 < var5) {
continue label36;
}

var4 = "\u001cUPzb{vNøuÛ¹å×O\u0014";
var5 = "\u001cUPzb{vNøuÛ¹å×O\u0014".length();
var2 = 0;
}

byte var36 = var2;
var2 += 8;
var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
var30 = var6;
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

var14 = var15.charAt(var26);
break;
default:
var18[var16++] = var38;
if ((var26 += var14) < var17) {
var14 = var15.charAt(var26);
continue label54;
}

var15 = "ÞÙé~µ[Â\u0091ò5HA\u0001J\u0011\u0099nsÔ¨'%uâ\u0018'\u000f\u0002ÇATu\u009f¿äÍ®\u0000Óïk\u0013½|?ñø|\u009e";
var17 = "ÞÙé~µ[Â\u0091ò5HA\u0001J\u0011\u0099nsÔ¨'%uâ\u0018'\u000f\u0002ÇATu\u009f¿äÍ®\u0000Óïk\u0013½|?ñø|\u009e".length();
var14 = 24;
var26 = -1;
}

var27 = var15.substring(++var26, var26 + var14);
var10001 = 0;
}
}
}

public static void m(_g[] var0) {
c = var0;
}

public static _g[] N() {
return c;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5123;
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
throw new RuntimeException("su/catlean/_8", var10);
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
throw new RuntimeException("su/catlean/_8" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18979;
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
throw new RuntimeException("su/catlean/_8", var14);
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
throw new RuntimeException("su/catlean/_8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
