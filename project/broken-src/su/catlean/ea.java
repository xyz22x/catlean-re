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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.FreecamStateEvent;
import su.catlean.api.event.events.player.KeyboardInputEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.UpdateCrosshairTarget;
import su.catlean.api.event.events.render.SetupTerrainEvent;
import su.catlean.gofra.Flow;

public final class ea extends _g {
@NotNull
public static final ea D;
static final KProperty[] z;
@NotNull
private static final ct E;
@NotNull
private static final ct i;
@NotNull
private static final cq N;
private static float A;
private static float K;
private static float S;
private static float a;
@NotNull
private static class_243 T;
@NotNull
private static class_243 h;
private static float e;
private static float J;
private static float c;
@NotNull
private static class_243 L;
@NotNull
private static _w x;
private static final long b = yz.a(4967011047434778548L, -7256421303548544253L, MethodHandles.lookup().lookupClass()).a(179285947458093L);
private static final String[] d;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] j;
private static final Integer[] k;
private static final Map l;

private ea(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 91903260316310L;
super(b<"q">(7206, 7232713123547876430L ^ var4), jt.y(), null, 4, null, var6);
}

private final float x(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 90738204511101L;
return ((Number)E.E(this, var3, z[0])).floatValue();
}

private final float D(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 66381748479261L;
return ((Number)i.E(this, var3, z[1])).floatValue();
}

private final boolean L(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 24079794346752L;
return (Boolean)N.E(this, var3, z[2]);
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
// 000: lload 1
// 001: dup2
// 002: ldc2_w 32978412894279
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 62698557940930
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 67464996320865
// 012: lxor
// 013: lstore 7
// 015: pop2
// 016: ldc2_w 2597154808533792747
// 019: lload 1
// 01a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01f: astore 9
// 021: lload 3
// 022: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 025: aload 9
// 027: ifnonnull 04e
// 02a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 02d: ifnull 066
// 030: goto 03d
// 033: ldc2_w 2613866198881122005
// 036: lload 1
// 037: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03c: athrow
// 03d: lload 3
// 03e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 041: goto 04e
// 044: ldc2_w 2613866198881122005
// 047: lload 1
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 051: aload 9
// 053: ifnonnull 0ec
// 056: ifnonnull 067
// 059: goto 066
// 05c: ldc2_w 2613866198881122005
// 05f: lload 1
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: return
// 067: lload 3
// 068: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06b: bipush 0
// 06c: putfield net/minecraft/class_310.field_1730 Z
// 06f: lload 7
// 071: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 074: invokevirtual net/minecraft/class_746.method_36455 ()F
// 077: putstatic su/catlean/ea.K F
// 07a: lload 7
// 07c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07f: invokevirtual net/minecraft/class_746.method_36454 ()F
// 082: putstatic su/catlean/ea.A F
// 085: getstatic su/catlean/ea.K F
// 088: putstatic su/catlean/ea.a F
// 08b: getstatic su/catlean/ea.A F
// 08e: putstatic su/catlean/ea.S F
// 091: new net/minecraft/class_243
// 094: dup
// 095: lload 7
// 097: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09a: invokevirtual net/minecraft/class_746.method_23317 ()D
// 09d: lload 7
// 09f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a2: invokevirtual net/minecraft/class_746.method_23318 ()D
// 0a5: lload 7
// 0a7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0aa: lload 7
// 0ac: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0af: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 0b2: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 0b5: f2d
// 0b6: dadd
// 0b7: lload 7
// 0b9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0bc: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0bf: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0c2: putstatic su/catlean/ea.T Lnet/minecraft/class_243;
// 0c5: new net/minecraft/class_243
// 0c8: dup
// 0c9: lload 7
// 0cb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ce: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0d1: lload 7
// 0d3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d6: invokevirtual net/minecraft/class_746.method_23318 ()D
// 0d9: lload 7
// 0db: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0de: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0e1: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0e4: putstatic su/catlean/ea.h Lnet/minecraft/class_243;
// 0e7: lload 7
// 0e9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ec: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 0ef: dup
// 0f0: sipush 3623
// 0f3: ldc2_w 4840894563411998979
// 0f6: lload 1
// 0f7: lxor
// 0f8: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/ea.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 100: putstatic su/catlean/ea.L Lnet/minecraft/class_243;
// 103: new su/catlean/_w
// 106: dup
// 107: lload 7
// 109: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10c: invokevirtual net/minecraft/class_746.method_36454 ()F
// 10f: lload 7
// 111: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 114: invokevirtual net/minecraft/class_746.method_36455 ()F
// 117: lload 5
// 119: dup2_x1
// 11a: pop2
// 11b: bipush 0
// 11c: aconst_null
// 11d: sipush 19908
// 120: ldc2_w 6203530027474687602
// 123: lload 1
// 124: lxor
// 125: invokedynamic y (IJ)I bsm=su/catlean/ea.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: aconst_null
// 12b: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 12e: putstatic su/catlean/ea.x Lsu/catlean/_w;
// 131: return
}

@Override
public void b(long var1) {
long var3 = var1 ^ 64129331416845L;
long var5 = var1 ^ 60471910827463L;
long var7 = var1 ^ 65044256163258L;
long var9 = var1 ^ 29647348875563L;
int[] var11 = vm.a<"Å">(1387343038405902497L, var1);

long var15;
label44: {
label43: {
label42: {
try {
var10000 = this.S(var7);
if (var11 != null) {
break label42;
}

if (!var10000) {
return;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 1372602659313582495L, var1);
}

try {
var15 = var3;
if (var1 < 0L) {
break label44;
}

zf.F(var3).field_1730 = true;
if (var11 != null) {
break label43;
}

var10000 = this.L(var5);
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 1372602659313582495L, var1);
}
}

try {
if (!var10000) {
return;
}

zf.v(var9).method_18799(L);
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, 1372602659313582495L, var1);
}
}

var15 = var9;
}

zf.v(var15).method_64578(x.q(), false, x.N(), false);
}

@Flow(
priority = 10
)
private final void O(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ea.b J
// 003: ldc2_w 98229404994446
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 945387640384
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 82535520259319
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 80713617068492
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 47782802966445
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 78660165263205
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 15606811503511
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 97010978766064
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 35706559305830
// 03e: lxor
// 03f: lstore 18
// 041: pop2
// 042: ldc2_w 5336184654488787436
// 045: lload 2
// 046: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: astore 20
// 04d: aload 20
// 04f: ifnonnull 0a7
// 052: lload 4
// 054: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 057: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 05a: ifnull 094
// 05d: goto 06a
// 060: ldc2_w 5350641773089577170
// 063: lload 2
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: lload 4
// 06c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 06f: aload 20
// 071: ifnonnull 0ad
// 074: goto 081
// 077: ldc2_w 5350641773089577170
// 07a: lload 2
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 084: ifnonnull 0a8
// 087: goto 094
// 08a: ldc2_w 5350641773089577170
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: aload 0
// 095: lload 14
// 097: invokevirtual su/catlean/ea.d (J)V
// 09a: goto 0a7
// 09d: ldc2_w 5350641773089577170
// 0a0: lload 2
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: return
// 0a8: lload 4
// 0aa: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0ad: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0b0: instanceof net/minecraft/class_3928
// 0b3: aload 20
// 0b5: ifnonnull 0e0
// 0b8: ifne 0e3
// 0bb: goto 0c8
// 0be: ldc2_w 5350641773089577170
// 0c1: lload 2
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: lload 4
// 0ca: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0cd: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0d0: instanceof net/minecraft/class_8671
// 0d3: goto 0e0
// 0d6: ldc2_w 5350641773089577170
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: ifeq 0f6
// 0e3: aload 0
// 0e4: lload 14
// 0e6: invokevirtual su/catlean/ea.d (J)V
// 0e9: goto 0f6
// 0ec: ldc2_w 5350641773089577170
// 0ef: lload 2
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: getstatic su/catlean/ea.A F
// 0f9: putstatic su/catlean/ea.S F
// 0fc: getstatic su/catlean/ea.K F
// 0ff: putstatic su/catlean/ea.a F
// 102: lload 18
// 104: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 107: invokevirtual net/minecraft/class_746.method_36454 ()F
// 10a: putstatic su/catlean/ea.A F
// 10d: lload 18
// 10f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 112: invokevirtual net/minecraft/class_746.method_36455 ()F
// 115: putstatic su/catlean/ea.K F
// 118: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 11b: aload 0
// 11c: lload 6
// 11e: invokespecial su/catlean/ea.x (J)F
// 121: bipush 0
// 122: getstatic su/catlean/ea.e F
// 125: lload 16
// 127: getstatic su/catlean/ea.J F
// 12a: fconst_0
// 12b: sipush 9382
// 12e: ldc2_w 7578712497769812242
// 131: lload 2
// 132: lxor
// 133: invokedynamic y (IJ)I bsm=su/catlean/ea.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: aconst_null
// 139: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 13c: astore 21
// 13e: getstatic su/catlean/ea.T Lnet/minecraft/class_243;
// 141: putstatic su/catlean/ea.h Lnet/minecraft/class_243;
// 144: getstatic su/catlean/ea.T Lnet/minecraft/class_243;
// 147: aload 21
// 149: bipush 0
// 14a: daload
// 14b: getstatic su/catlean/ea.c F
// 14e: f2d
// 14f: aload 21
// 151: bipush 1
// 152: daload
// 153: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 156: dup
// 157: sipush 7471
// 15a: ldc2_w 4530971240204289027
// 15d: lload 2
// 15e: lxor
// 15f: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/ea.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 167: putstatic su/catlean/ea.T Lnet/minecraft/class_243;
// 16a: lload 4
// 16c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 16f: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 172: aload 20
// 174: ifnonnull 1a0
// 177: ifnull 1fe
// 17a: goto 187
// 17d: ldc2_w 5350641773089577170
// 180: lload 2
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: lload 4
// 189: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 18c: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 18f: dup
// 190: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 193: goto 1a0
// 196: ldc2_w 5350641773089577170
// 199: lload 2
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 1a3: ifnull 1fe
// 1a6: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1a9: lload 10
// 1ab: invokevirtual su/catlean/dm.Y (J)Z
// 1ae: ifne 1fe
// 1b1: goto 1be
// 1b4: ldc2_w 5350641773089577170
// 1b7: lload 2
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 1c1: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 1c4: lload 4
// 1c6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1c9: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 1cc: dup
// 1cd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1d0: invokevirtual net/minecraft/class_239.method_17784 ()Lnet/minecraft/class_243;
// 1d3: dup
// 1d4: sipush 5252
// 1d7: ldc2_w 7626018749360917931
// 1da: lload 2
// 1db: lxor
// 1dc: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/ea.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e4: lload 12
// 1e6: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 1e9: lload 8
// 1eb: dup2_x1
// 1ec: pop2
// 1ed: bipush 0
// 1ee: invokevirtual su/catlean/_8.O (JLsu/catlean/_w;I)V
// 1f1: goto 1fe
// 1f4: ldc2_w 5350641773089577170
// 1f7: lload 2
// 1f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: athrow
// 1fe: return
}

@Flow
private final void G(SetupTerrainEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ea.b J
// 03: ldc2_w 140263377848723
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 41898773042269
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 45041094617482
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w 581185820018646001
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: aload 8
// 25: ifnonnull 6b
// 28: lload 4
// 2a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 30: ifnull 58
// 33: goto 40
// 36: ldc2_w 602473619844209359
// 39: lload 2
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: lload 4
// 42: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 45: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 48: ifnonnull 6c
// 4b: goto 58
// 4e: ldc2_w 602473619844209359
// 51: lload 2
// 52: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57: athrow
// 58: aload 0
// 59: lload 6
// 5b: invokevirtual su/catlean/ea.d (J)V
// 5e: goto 6b
// 61: ldc2_w 602473619844209359
// 64: lload 2
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: return
// 6c: aload 1
// 6d: invokevirtual su/catlean/api/event/events/render/SetupTerrainEvent.cancel ()V
// 70: return
}

@Flow
private final void A(FreecamStateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ea.b J
// 03: ldc2_w 125159272375221
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 44384801029755
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 20515918282350
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 27112058992991
// 1b: lxor
// 1c: dup2
// 1d: bipush 32
// 1f: lushr
// 20: l2i
// 21: istore 8
// 23: dup2
// 24: bipush 32
// 26: lshl
// 27: bipush 56
// 29: lushr
// 2a: l2i
// 2b: istore 9
// 2d: dup2
// 2e: bipush 40
// 30: lshl
// 31: bipush 40
// 33: lushr
// 34: l2i
// 35: istore 10
// 37: pop2
// 38: dup2
// 39: ldc2_w 43164585511245
// 3c: lxor
// 3d: lstore 11
// 3f: dup2
// 40: ldc2_w 118475895853256
// 43: lxor
// 44: lstore 13
// 46: dup2
// 47: ldc2_w 15365084643099
// 4a: lxor
// 4b: lstore 15
// 4d: dup2
// 4e: ldc2_w 42552510530476
// 51: lxor
// 52: lstore 17
// 54: pop2
// 55: ldc2_w -6757995207695584809
// 58: lload 2
// 59: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: astore 19
// 60: aload 19
// 62: ifnonnull a8
// 65: lload 4
// 67: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 6a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 6d: ifnull 95
// 70: goto 7d
// 73: ldc2_w -6738963023120289559
// 76: lload 2
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: lload 4
// 7f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 82: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 85: ifnonnull a9
// 88: goto 95
// 8b: ldc2_w -6738963023120289559
// 8e: lload 2
// 8f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94: athrow
// 95: aload 0
// 96: lload 17
// 98: invokevirtual su/catlean/ea.d (J)V
// 9b: goto a8
// 9e: ldc2_w -6738963023120289559
// a1: lload 2
// a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7: athrow
// a8: return
// a9: aload 1
// aa: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.cancel ()V
// ad: aload 1
// ae: aload 0
// af: lload 11
// b1: invokespecial su/catlean/ea.P (J)D
// b4: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setX (D)V
// b7: aload 1
// b8: aload 0
// b9: lload 6
// bb: invokespecial su/catlean/ea.l (J)D
// be: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setY (D)V
// c1: aload 1
// c2: aload 0
// c3: iload 8
// c5: iload 9
// c7: i2b
// c8: iload 10
// ca: invokespecial su/catlean/ea.T (IBI)D
// cd: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setZ (D)V
// d0: aload 1
// d1: aload 0
// d2: lload 13
// d4: invokespecial su/catlean/ea.G (J)F
// d7: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setYaw (F)V
// da: aload 1
// db: aload 0
// dc: lload 15
// de: invokespecial su/catlean/ea.i (J)F
// e1: invokevirtual su/catlean/api/event/events/player/FreecamStateEvent.setPitch (F)V
// e4: return
}

@Flow
private final void h(UpdateCrosshairTarget param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ea.b J
// 003: ldc2_w 89248321407616
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 9489525413710
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 55353194813275
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 61949855649898
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 56
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 40
// 030: lshl
// 031: bipush 40
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 82736205871613
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 49504362403374
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 8509912490104
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 6926989568665
// 051: lxor
// 052: lstore 17
// 054: dup2
// 055: ldc2_w 7701900724535
// 058: lxor
// 059: lstore 19
// 05b: pop2
// 05c: ldc2_w 5405418886969809122
// 05f: lload 2
// 060: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: astore 21
// 067: aload 21
// 069: ifnonnull 0c1
// 06c: lload 4
// 06e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 071: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 074: ifnull 0ae
// 077: goto 084
// 07a: ldc2_w 5426631025665694172
// 07d: lload 2
// 07e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 083: athrow
// 084: lload 4
// 086: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 089: aload 21
// 08b: ifnonnull 0d3
// 08e: goto 09b
// 091: ldc2_w 5426631025665694172
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 09e: ifnonnull 0c2
// 0a1: goto 0ae
// 0a4: ldc2_w 5426631025665694172
// 0a7: lload 2
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: aload 0
// 0af: lload 17
// 0b1: invokevirtual su/catlean/ea.d (J)V
// 0b4: goto 0c1
// 0b7: ldc2_w 5426631025665694172
// 0ba: lload 2
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: return
// 0c2: invokestatic net/minecraft/class_10209.method_64146 ()Lnet/minecraft/class_3695;
// 0c5: invokeinterface net/minecraft/class_3695.method_15407 ()V 1
// 0ca: aload 1
// 0cb: invokevirtual su/catlean/api/event/events/player/UpdateCrosshairTarget.cancel ()V
// 0ce: lload 4
// 0d0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d3: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0d6: aload 0
// 0d7: lload 11
// 0d9: invokespecial su/catlean/ea.G (J)F
// 0dc: aload 0
// 0dd: lload 13
// 0df: invokespecial su/catlean/ea.i (J)F
// 0e2: aload 0
// 0e3: lload 15
// 0e5: invokespecial su/catlean/ea.P (J)D
// 0e8: aload 0
// 0e9: lload 6
// 0eb: invokespecial su/catlean/ea.l (J)D
// 0ee: aload 0
// 0ef: iload 8
// 0f1: iload 9
// 0f3: i2b
// 0f4: iload 10
// 0f6: invokespecial su/catlean/ea.T (IBI)D
// 0f9: lload 19
// 0fb: invokevirtual su/catlean/dm.p (FFDDDJ)Lnet/minecraft/class_239;
// 0fe: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 101: return
}

@Flow
private final void U(InputEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ea.b J
// 003: ldc2_w 56629444675376
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 116599174142718
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 86990729211433
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 110941141280553
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 107572096560195
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w -4128809665686121134
// 029: lload 2
// 02a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: astore 12
// 031: aload 12
// 033: ifnonnull 079
// 036: lload 4
// 038: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 03b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 03e: ifnull 066
// 041: goto 04e
// 044: ldc2_w -4107522002926218132
// 047: lload 2
// 048: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04d: athrow
// 04e: lload 4
// 050: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 053: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 056: ifnonnull 07a
// 059: goto 066
// 05c: ldc2_w -4107522002926218132
// 05f: lload 2
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: aload 0
// 067: lload 8
// 069: invokevirtual su/catlean/ea.d (J)V
// 06c: goto 079
// 06f: ldc2_w -4107522002926218132
// 072: lload 2
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: return
// 07a: aload 1
// 07b: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 07e: bipush -1
// 07f: aload 12
// 081: ifnonnull 0d2
// 084: if_icmpne 095
// 087: goto 094
// 08a: ldc2_w -4107522002926218132
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: return
// 095: lload 4
// 097: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 09a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 09d: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
// 0a0: dup
// 0a1: sipush 17587
// 0a4: ldc2_w 3815132418587103524
// 0a7: lload 2
// 0a8: lxor
// 0a9: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/ea.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0b1: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 0b4: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 0b9: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 0bc: aload 12
// 0be: ifnonnull 0d6
// 0c1: aload 1
// 0c2: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 0c5: goto 0d2
// 0c8: ldc2_w -4107522002926218132
// 0cb: lload 2
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: if_icmpne 0d9
// 0d5: bipush 1
// 0d6: goto 0da
// 0d9: bipush 0
// 0da: istore 13
// 0dc: lload 4
// 0de: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0e1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0e4: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
// 0e7: dup
// 0e8: sipush 11394
// 0eb: ldc2_w 5107029692223158548
// 0ee: lload 2
// 0ef: lxor
// 0f0: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/ea.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0f8: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 0fb: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 100: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 103: aload 12
// 105: ifnonnull 12a
// 108: aload 1
// 109: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 10c: if_icmpne 12d
// 10f: goto 11c
// 112: ldc2_w -4107522002926218132
// 115: lload 2
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: bipush 1
// 11d: goto 12a
// 120: ldc2_w -4107522002926218132
// 123: lload 2
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: goto 12e
// 12d: bipush 0
// 12e: istore 14
// 130: lload 4
// 132: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 135: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 138: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
// 13b: dup
// 13c: sipush 11394
// 13f: ldc2_w 5107029692223158548
// 142: lload 2
// 143: lxor
// 144: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/ea.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 14c: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 14f: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 154: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 157: aload 12
// 159: ifnonnull 17e
// 15c: aload 1
// 15d: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 160: if_icmpne 181
// 163: goto 170
// 166: ldc2_w -4107522002926218132
// 169: lload 2
// 16a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16f: athrow
// 170: bipush 1
// 171: goto 17e
// 174: ldc2_w -4107522002926218132
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: goto 182
// 181: bipush 0
// 182: istore 15
// 184: lload 4
// 186: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 189: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 18c: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
// 18f: dup
// 190: sipush 11394
// 193: ldc2_w 5107029692223158548
// 196: lload 2
// 197: lxor
// 198: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/ea.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1a0: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 1a3: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 1a8: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 1ab: aload 12
// 1ad: ifnonnull 1d2
// 1b0: aload 1
// 1b1: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 1b4: if_icmpne 1d5
// 1b7: goto 1c4
// 1ba: ldc2_w -4107522002926218132
// 1bd: lload 2
// 1be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c3: athrow
// 1c4: bipush 1
// 1c5: goto 1d2
// 1c8: ldc2_w -4107522002926218132
// 1cb: lload 2
// 1cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d1: athrow
// 1d2: goto 1d6
// 1d5: bipush 0
// 1d6: istore 16
// 1d8: lload 4
// 1da: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1dd: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1e0: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 1e3: dup
// 1e4: sipush 11394
// 1e7: ldc2_w 5107029692223158548
// 1ea: lload 2
// 1eb: lxor
// 1ec: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/ea.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1f4: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 1f7: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 1fc: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 1ff: aload 12
// 201: ifnonnull 226
// 204: aload 1
// 205: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 208: if_icmpne 229
// 20b: goto 218
// 20e: ldc2_w -4107522002926218132
// 211: lload 2
// 212: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 217: athrow
// 218: bipush 1
// 219: goto 226
// 21c: ldc2_w -4107522002926218132
// 21f: lload 2
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: goto 22a
// 229: bipush 0
// 22a: istore 17
// 22c: lload 4
// 22e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 231: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 234: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 237: dup
// 238: sipush 11394
// 23b: ldc2_w 5107029692223158548
// 23e: lload 2
// 23f: lxor
// 240: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/ea.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 245: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 248: checkcast su/catlean/mixins/accessors/KeyMappingAccessor
// 24b: invokeinterface su/catlean/mixins/accessors/KeyMappingAccessor.getKey ()Lnet/minecraft/class_3675$class_306; 1
// 250: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
// 253: aload 12
// 255: ifnonnull 27a
// 258: aload 1
// 259: invokevirtual su/catlean/api/event/events/client/InputEvent.getKey ()I
// 25c: if_icmpne 27d
// 25f: goto 26c
// 262: ldc2_w -4107522002926218132
// 265: lload 2
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: bipush 1
// 26d: goto 27a
// 270: ldc2_w -4107522002926218132
// 273: lload 2
// 274: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: athrow
// 27a: goto 27e
// 27d: bipush 0
// 27e: istore 18
// 280: aload 1
// 281: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 284: getstatic su/catlean/api/event/events/client/InputEvent$Action.Press Lsu/catlean/api/event/events/client/InputEvent$Action;
// 287: aload 12
// 289: ifnonnull 2b0
// 28c: if_acmpeq 2c5
// 28f: goto 29c
// 292: ldc2_w -4107522002926218132
// 295: lload 2
// 296: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29b: athrow
// 29c: aload 1
// 29d: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 2a0: getstatic su/catlean/api/event/events/client/InputEvent$Action.Hold Lsu/catlean/api/event/events/client/InputEvent$Action;
// 2a3: goto 2b0
// 2a6: ldc2_w -4107522002926218132
// 2a9: lload 2
// 2aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2af: athrow
// 2b0: aload 12
// 2b2: ifnonnull 3c4
// 2b5: if_acmpne 3bd
// 2b8: goto 2c5
// 2bb: ldc2_w -4107522002926218132
// 2be: lload 2
// 2bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c4: athrow
// 2c5: iload 13
// 2c7: aload 12
// 2c9: ifnonnull 2fc
// 2cc: goto 2d9
// 2cf: ldc2_w -4107522002926218132
// 2d2: lload 2
// 2d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d8: athrow
// 2d9: ifeq 2fa
// 2dc: goto 2e9
// 2df: ldc2_w -4107522002926218132
// 2e2: lload 2
// 2e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e8: athrow
// 2e9: fconst_1
// 2ea: putstatic su/catlean/ea.e F
// 2ed: goto 2fa
// 2f0: ldc2_w -4107522002926218132
// 2f3: lload 2
// 2f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f9: athrow
// 2fa: iload 14
// 2fc: aload 12
// 2fe: ifnonnull 325
// 301: ifeq 323
// 304: goto 311
// 307: ldc2_w -4107522002926218132
// 30a: lload 2
// 30b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 310: athrow
// 311: ldc -1.0
// 313: putstatic su/catlean/ea.e F
// 316: goto 323
// 319: ldc2_w -4107522002926218132
// 31c: lload 2
// 31d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 322: athrow
// 323: iload 15
// 325: aload 12
// 327: ifnonnull 34d
// 32a: ifeq 34b
// 32d: goto 33a
// 330: ldc2_w -4107522002926218132
// 333: lload 2
// 334: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 339: athrow
// 33a: fconst_1
// 33b: putstatic su/catlean/ea.J F
// 33e: goto 34b
// 341: ldc2_w -4107522002926218132
// 344: lload 2
// 345: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34a: athrow
// 34b: iload 16
// 34d: aload 12
// 34f: ifnonnull 376
// 352: ifeq 374
// 355: goto 362
// 358: ldc2_w -4107522002926218132
// 35b: lload 2
// 35c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 361: athrow
// 362: ldc -1.0
// 364: putstatic su/catlean/ea.J F
// 367: goto 374
// 36a: ldc2_w -4107522002926218132
// 36d: lload 2
// 36e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 373: athrow
// 374: iload 17
// 376: aload 12
// 378: ifnonnull 3a3
// 37b: ifeq 3a1
// 37e: goto 38b
// 381: ldc2_w -4107522002926218132
// 384: lload 2
// 385: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38a: athrow
// 38b: aload 0
// 38c: lload 6
// 38e: invokespecial su/catlean/ea.D (J)F
// 391: putstatic su/catlean/ea.c F
// 394: goto 3a1
// 397: ldc2_w -4107522002926218132
// 39a: lload 2
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: iload 18
// 3a3: ifeq 3bd
// 3a6: aload 0
// 3a7: lload 6
// 3a9: invokespecial su/catlean/ea.D (J)F
// 3ac: fneg
// 3ad: putstatic su/catlean/ea.c F
// 3b0: goto 3bd
// 3b3: ldc2_w -4107522002926218132
// 3b6: lload 2
// 3b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bc: athrow
// 3bd: aload 1
// 3be: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 3c1: getstatic su/catlean/api/event/events/client/InputEvent$Action.Release Lsu/catlean/api/event/events/client/InputEvent$Action;
// 3c4: if_acmpne 4c4
// 3c7: iload 13
// 3c9: aload 12
// 3cb: ifnonnull 3fe
// 3ce: goto 3db
// 3d1: ldc2_w -4107522002926218132
// 3d4: lload 2
// 3d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3da: athrow
// 3db: ifeq 3fc
// 3de: goto 3eb
// 3e1: ldc2_w -4107522002926218132
// 3e4: lload 2
// 3e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ea: athrow
// 3eb: fconst_0
// 3ec: putstatic su/catlean/ea.e F
// 3ef: goto 3fc
// 3f2: ldc2_w -4107522002926218132
// 3f5: lload 2
// 3f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fb: athrow
// 3fc: iload 14
// 3fe: aload 12
// 400: ifnonnull 426
// 403: ifeq 424
// 406: goto 413
// 409: ldc2_w -4107522002926218132
// 40c: lload 2
// 40d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 412: athrow
// 413: fconst_0
// 414: putstatic su/catlean/ea.e F
// 417: goto 424
// 41a: ldc2_w -4107522002926218132
// 41d: lload 2
// 41e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 423: athrow
// 424: iload 15
// 426: aload 12
// 428: ifnonnull 44e
// 42b: ifeq 44c
// 42e: goto 43b
// 431: ldc2_w -4107522002926218132
// 434: lload 2
// 435: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43a: athrow
// 43b: fconst_0
// 43c: putstatic su/catlean/ea.J F
// 43f: goto 44c
// 442: ldc2_w -4107522002926218132
// 445: lload 2
// 446: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44b: athrow
// 44c: iload 16
// 44e: aload 12
// 450: ifnonnull 476
// 453: ifeq 474
// 456: goto 463
// 459: ldc2_w -4107522002926218132
// 45c: lload 2
// 45d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 462: athrow
// 463: fconst_0
// 464: putstatic su/catlean/ea.J F
// 467: goto 474
// 46a: ldc2_w -4107522002926218132
// 46d: lload 2
// 46e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 473: athrow
// 474: iload 17
// 476: aload 12
// 478: ifnonnull 49e
// 47b: ifeq 49c
// 47e: goto 48b
// 481: ldc2_w -4107522002926218132
// 484: lload 2
// 485: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48a: athrow
// 48b: fconst_0
// 48c: putstatic su/catlean/ea.c F
// 48f: goto 49c
// 492: ldc2_w -4107522002926218132
// 495: lload 2
// 496: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49b: athrow
// 49c: iload 18
// 49e: aload 12
// 4a0: ifnonnull 4ce
// 4a3: ifeq 4c4
// 4a6: goto 4b3
// 4a9: ldc2_w -4107522002926218132
// 4ac: lload 2
// 4ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b2: athrow
// 4b3: fconst_0
// 4b4: putstatic su/catlean/ea.c F
// 4b7: goto 4c4
// 4ba: ldc2_w -4107522002926218132
// 4bd: lload 2
// 4be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c3: athrow
// 4c4: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 4c7: lload 10
// 4c9: invokevirtual su/catlean/dm.D (J)V
// 4cc: iload 13
// 4ce: aload 12
// 4d0: ifnonnull 4e5
// 4d3: ifne 544
// 4d6: goto 4e3
// 4d9: ldc2_w -4107522002926218132
// 4dc: lload 2
// 4dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e2: athrow
// 4e3: iload 14
// 4e5: aload 12
// 4e7: ifnonnull 4fc
// 4ea: ifne 544
// 4ed: goto 4fa
// 4f0: ldc2_w -4107522002926218132
// 4f3: lload 2
// 4f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f9: athrow
// 4fa: iload 15
// 4fc: aload 12
// 4fe: ifnonnull 513
// 501: ifne 544
// 504: goto 511
// 507: ldc2_w -4107522002926218132
// 50a: lload 2
// 50b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 510: athrow
// 511: iload 16
// 513: aload 12
// 515: ifnonnull 52a
// 518: ifne 544
// 51b: goto 528
// 51e: ldc2_w -4107522002926218132
// 521: lload 2
// 522: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 527: athrow
// 528: iload 17
// 52a: aload 12
// 52c: ifnonnull 541
// 52f: ifne 544
// 532: goto 53f
// 535: ldc2_w -4107522002926218132
// 538: lload 2
// 539: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53e: athrow
// 53f: iload 18
// 541: ifeq 555
// 544: aload 1
// 545: invokevirtual su/catlean/api/event/events/client/InputEvent.cancel ()V
// 548: goto 555
// 54b: ldc2_w -4107522002926218132
// 54e: lload 2
// 54f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 554: athrow
// 555: return
}

@Flow
public final void o(@NotNull KeyboardInputEvent e) {
Intrinsics.checkNotNullParameter(ex, "e");
ex.cancel();
}

@Flow(
priority = -10
)
private final void H(MoveEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ea.b J
// 03: ldc2_w 120205903815380
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 58108013870874
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 62077901288912
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 63999048434381
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w -6676626379829071690
// 22: lload 2
// 23: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 10
// 2a: aload 10
// 2c: ifnonnull 72
// 2f: lload 4
// 31: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 34: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 37: ifnull 5f
// 3a: goto 47
// 3d: ldc2_w -6693624124559445624
// 40: lload 2
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: lload 4
// 49: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 4f: ifnonnull 73
// 52: goto 5f
// 55: ldc2_w -6693624124559445624
// 58: lload 2
// 59: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e: athrow
// 5f: aload 0
// 60: lload 8
// 62: invokevirtual su/catlean/ea.d (J)V
// 65: goto 72
// 68: ldc2_w -6693624124559445624
// 6b: lload 2
// 6c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: athrow
// 72: return
// 73: aload 0
// 74: lload 6
// 76: invokespecial su/catlean/ea.L (J)Z
// 79: ifeq 9c
// 7c: aload 1
// 7d: dconst_0
// 7e: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 81: aload 1
// 82: dconst_0
// 83: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 86: aload 1
// 87: dconst_0
// 88: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 8b: aload 1
// 8c: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 8f: goto 9c
// 92: ldc2_w -6693624124559445624
// 95: lload 2
// 96: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9b: athrow
// 9c: return
}

@Flow
private final void L(SendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ea.b J
// 03: ldc2_w 45881052700629
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 123352776507931
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 137012655573201
// 14: lxor
// 15: lstore 6
// 17: pop2
// 18: ldc2_w -2425576219557605961
// 1b: lload 2
// 1c: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21: astore 8
// 23: lload 4
// 25: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 28: aload 8
// 2a: ifnonnull 52
// 2d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 30: ifnull e3
// 33: goto 40
// 36: ldc2_w -2442573071114220407
// 39: lload 2
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: lload 4
// 42: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 45: goto 52
// 48: ldc2_w -2442573071114220407
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
// 55: ifnull e3
// 58: aload 0
// 59: lload 6
// 5b: invokespecial su/catlean/ea.L (J)Z
// 5e: aload 8
// 60: ifnonnull a6
// 63: goto 70
// 66: ldc2_w -2442573071114220407
// 69: lload 2
// 6a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f: athrow
// 70: ifeq e3
// 73: goto 80
// 76: ldc2_w -2442573071114220407
// 79: lload 2
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: aload 1
// 81: aload 8
// 83: ifnonnull e0
// 86: goto 93
// 89: ldc2_w -2442573071114220407
// 8c: lload 2
// 8d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92: athrow
// 93: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// 96: instanceof net/minecraft/class_2828
// 99: goto a6
// 9c: ldc2_w -2442573071114220407
// 9f: lload 2
// a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5: athrow
// a6: ifne d2
// a9: aload 1
// aa: aload 8
// ac: ifnonnull e0
// af: goto bc
// b2: ldc2_w -2442573071114220407
// b5: lload 2
// b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bb: athrow
// bc: invokevirtual su/catlean/api/event/events/network/SendPacket.getPacket ()Lnet/minecraft/class_2596;
// bf: instanceof net/minecraft/class_2851
// c2: ifeq e3
// c5: goto d2
// c8: ldc2_w -2442573071114220407
// cb: lload 2
// cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d1: athrow
// d2: aload 1
// d3: goto e0
// d6: ldc2_w -2442573071114220407
// d9: lload 2
// da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// df: athrow
// e0: invokevirtual su/catlean/api/event/events/network/SendPacket.cancel ()V
// e3: return
}

private final float G(long var1) {
var1 = b ^ var1;
long var10001 = var1 ^ 20541654267495L;
int var3 = (int)((var1 ^ 20541654267495L) >>> 32);
int var4 = (int)((var1 ^ 20541654267495L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
return jl.y.B(S, A, zi.v.n(var3, (char)var4, var5));
}

private final float i(long var1) {
var1 = b ^ var1;
long var10001 = var1 ^ 128192388520372L;
int var3 = (int)((var1 ^ 128192388520372L) >>> 32);
int var4 = (int)((var1 ^ 128192388520372L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
return jl.y.B(a, K, zi.v.n(var3, (char)var4, var5));
}

private final double P(long var1) {
var1 = b ^ var1;
long var10001 = var1 ^ 103544722550754L;
int var3 = (int)((var1 ^ 103544722550754L) >>> 32);
int var4 = (int)((var1 ^ 103544722550754L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
return jl.y.W(h.field_1352, T.field_1352, zi.v.n(var3, (char)var4, var5));
}

private final double l(long var1) {
var1 = b ^ var1;
long var10001 = var1 ^ 118501766060225L;
int var3 = (int)((var1 ^ 118501766060225L) >>> 32);
int var4 = (int)((var1 ^ 118501766060225L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
return jl.y.W(h.field_1351, T.field_1351, zi.v.n(var3, (char)var4, var5));
}

private final double T(int var1, byte var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ b;
long var10001 = var4 ^ 107507041935344L;
int var6 = (int)((var4 ^ 107507041935344L) >>> 32);
int var7 = (int)((var4 ^ 107507041935344L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
return jl.y.W(h.field_1350, T.field_1350, zi.v.n(var6, (char)var7, var8));
}

static {
long var20 = b ^ 47627167865818L;
long var22 = var20 ^ 112045165679553L;
long var24 = var20 ^ 94472803163535L;
long var26 = var20 ^ 94710908312209L;
long var10001 = var20 ^ 98893777017237L;
int var28 = (int)((var20 ^ 98893777017237L) >>> 32);
int var29 = (int)((var20 ^ 98893777017237L) << 32 >>> 48);
int var30 = (int)(var10001 << 48 >>> 48);
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
String var15 = "\u009f\u0000\u009dÞ\u009cU3{\r0â\u0014\u0003í\rH\u0010\u0019\u0085V)`É\u0082\u008b¤W¾V\u0000_\u0092\u0085\u0010:r%Þ\u009e#\u000fü%>\u0013î\u0002\u008ehï Ö\u0002mÖ\u008c¢¬\u000b\bä*ñ\u0096\u001cPßJÄ\u0090·ÛèXt.Ë\u0011Ú\u001f\u0086Tr\u0010û\\oÍ\u0017Ð`\u0090\u0007)ÿ\u001bµ³e\b l\u0094Ñjð>Á\u008c¿ÄÏ\u000fI\u001a\u0094Å\u008b\u001aráà5\u008aþYÌ\f8¸Ï04 ½k§Ô\u0010(X\u0091\u000bás\u009cf=&\u001eø|#\u009fÅ]\u0003\u0083]ÁÛOÄI\u000f\u0087 SÓ\u008f¤»X\u0014\u0093!øùùñ´\u001a*ææQ¤¹\u0091ô\u0082Â8ÆÁ\u0091¬\u0088{ ®\u0089\u0081°õ\u008dl\u0083õ°ù2\u0098\u0098V\u0096®|n\u0001éÍÔ§\u0099(8/¨5\u007fÐ\u0010,/\u0087 ¦üÄr\u009eí¢L\u0014\u0098«] w²}N\u001cXq\u000fHï\u008e$Æ\u0006¢Òã×\u00877´{\u0015|å\u0098¥\u000b\u009fùA:(\u009c\u001eÕ0jP,÷2ÆºÖ\u008d\u008c¶¹b\u0001g¬U.òW<\u007f¶#\u0089ú\u0017¤Ø\u00136oÊfg.\u0088°ÿÑ\u001f£L\u0096KºüX¯|ke\"#K\u0005%ûë]åk,f\u000bÜéÊÐÜát;\u009cü§\u0082Ö\u0012Ò\u0098a\u0090YÙð\u0082³\u000f!\u0084³à!¨ÓW\u0018\u008aÓr<Ô5\u0005f¥\u0015\u001ccúbÖ \u00adófýêb\u001c?¬\u0090à\u0099ÇqáE\u0085vdqÿ|`C\tè¡_ëÅXuÉox!ó?Ò¢\\}\u0017f:\u00929$8pã\u009ff\u001d´¦sáë\u0088§ñÔA\u0084.L\u009b\u0080a\u0015\u0001ó,Fç!T¬m|Ì¼n\u001f5\u001cTb£\u0083Ta\bÏ¾P\r%Ð(þËç,U´\n\u001dãih\u0088ÀÌ,Ñ¡á\u008dßOK\u00adì¹¹\u001f*)åY-\u000e\u0086i¦Ui/¶G¡\u0083\u009c¾Ó\u0081b\u0006\b#ê\u0086\u0018â\u0007¤\u009c\u0086!ò_ß}(\u0087ä{¾\f²\u0006\u0080Åb3º\u001c?·7&©)>\u00adR\u009cÑÎ\t/«§®\u0010r\u008a+Æ\u0017;ó\u0004K»$ºq«ê¾";
int var17 = "\u009f\u0000\u009dÞ\u009cU3{\r0â\u0014\u0003í\rH\u0010\u0019\u0085V)`É\u0082\u008b¤W¾V\u0000_\u0092\u0085\u0010:r%Þ\u009e#\u000fü%>\u0013î\u0002\u008ehï Ö\u0002mÖ\u008c¢¬\u000b\bä*ñ\u0096\u001cPßJÄ\u0090·ÛèXt.Ë\u0011Ú\u001f\u0086Tr\u0010û\\oÍ\u0017Ð`\u0090\u0007)ÿ\u001bµ³e\b l\u0094Ñjð>Á\u008c¿ÄÏ\u000fI\u001a\u0094Å\u008b\u001aráà5\u008aþYÌ\f8¸Ï04 ½k§Ô\u0010(X\u0091\u000bás\u009cf=&\u001eø|#\u009fÅ]\u0003\u0083]ÁÛOÄI\u000f\u0087 SÓ\u008f¤»X\u0014\u0093!øùùñ´\u001a*ææQ¤¹\u0091ô\u0082Â8ÆÁ\u0091¬\u0088{ ®\u0089\u0081°õ\u008dl\u0083õ°ù2\u0098\u0098V\u0096®|n\u0001éÍÔ§\u0099(8/¨5\u007fÐ\u0010,/\u0087 ¦üÄr\u009eí¢L\u0014\u0098«] w²}N\u001cXq\u000fHï\u008e$Æ\u0006¢Òã×\u00877´{\u0015|å\u0098¥\u000b\u009fùA:(\u009c\u001eÕ0jP,÷2ÆºÖ\u008d\u008c¶¹b\u0001g¬U.òW<\u007f¶#\u0089ú\u0017¤Ø\u00136oÊfg.\u0088°ÿÑ\u001f£L\u0096KºüX¯|ke\"#K\u0005%ûë]åk,f\u000bÜéÊÐÜát;\u009cü§\u0082Ö\u0012Ò\u0098a\u0090YÙð\u0082³\u000f!\u0084³à!¨ÓW\u0018\u008aÓr<Ô5\u0005f¥\u0015\u001ccúbÖ \u00adófýêb\u001c?¬\u0090à\u0099ÇqáE\u0085vdqÿ|`C\tè¡_ëÅXuÉox!ó?Ò¢\\}\u0017f:\u00929$8pã\u009ff\u001d´¦sáë\u0088§ñÔA\u0084.L\u009b\u0080a\u0015\u0001ó,Fç!T¬m|Ì¼n\u001f5\u001cTb£\u0083Ta\bÏ¾P\r%Ð(þËç,U´\n\u001dãih\u0088ÀÌ,Ñ¡á\u008dßOK\u00adì¹¹\u001f*)åY-\u000e\u0086i¦Ui/¶G¡\u0083\u009c¾Ó\u0081b\u0006\b#ê\u0086\u0018â\u0007¤\u009c\u0086!ò_ß}(\u0087ä{¾\f²\u0006\u0080Åb3º\u001c?·7&©)>\u00adR\u009cÑÎ\t/«§®\u0010r\u008a+Æ\u0017;ó\u0004K»$ºq«ê¾"
.length();
char var14 = 16;
int var34 = -1;

label54:
while (true) {
String var35 = var15.substring(++var34, var34 + var14);
byte var42 = -1;

while (true) {
byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
String var50 = b(var19).intern();
switch (var42) {
case 0:
var18[var16++] = var50;
if ((var34 += var14) >= var17) {
d = var18;
f = new String[17];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "Ü[\u009d«\u0000\u00adj\u001e\u0002ï\u0098±\u001aªºaº= Þ_àÓÊ";
int var5 = "Ü[\u009d«\u0000\u00adj\u001e\u0002ï\u0098±\u001aªºaº= Þ_àÓÊ".length();
byte var2 = 0;

label36:
while (true) {
byte var46 = var2;
var2 += 8;
byte[] var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
long[] var38 = var6;
int var47 = var3++;
long var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var57 = -1;

while (true) {
long var8 = var54;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var59 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var57) {
case 0:
var38[var47] = var59;
if (var2 >= var5) {
j = var6;
k = new Integer[5];
KProperty[] var31 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ea.class, b<"q">(1005, 1678272392025557660L ^ var20), b<"q">(13359, 4684586365311417689L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ea.class, b<"q">(32738, 2887421547757581981L ^ var20), b<"q">(7927, 9095743334190110594L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ea.class, b<"q">(1270, 9213598316791221636L ^ var20), b<"q">(32677, 4413314417840600790L ^ var20), 0))
};
z = var31;
D = new ea(var28, (short)var29, (char)var30);
E = yp.k(
D, b<"q">(26639, 8598468573913162097L ^ var20), 1.0F, var22, RangesKt.rangeTo(0.1F, 3.0F), null, null, c<"y">(9870, 7337805702392284009L ^ var20), null
);
i = yp.k(
D, b<"q">(28502, 9089384363515651622L ^ var20), 0.42F, var22, RangesKt.rangeTo(0.1F, 3.0F), null, null, c<"y">(32051, 3640917465457809621L ^ var20), null
);
N = yp.t(D, b<"q">(29974, 5435979307441372271L ^ var20), true, var24, null, null, c<"y">(26030, 69628422378930250L ^ var20), null);
class_243 var39 = class_243.field_1353;
Intrinsics.checkNotNullExpressionValue(class_243.field_1353, b<"q">(4085, 3134393062755813013L ^ var20));
T = var39;
class_243 var40 = class_243.field_1353;
Intrinsics.checkNotNullExpressionValue(class_243.field_1353, b<"q">(18839, 6464769553802985699L ^ var20));
h = var40;
class_243 var41 = class_243.field_1353;
Intrinsics.checkNotNullExpressionValue(class_243.field_1353, b<"q">(18839, 6464769553802985699L ^ var20));
L = var41;
x = new _w(0.0F, var26, 0.0F, false, null, c<"y">(26030, 69628422378930250L ^ var20), null);
return;
}
break;
default:
var38[var47] = var59;
if (var2 < var5) {
continue label36;
}

var4 = "\u009e\u0012ÀbX¬¤\u0016Fõ§i  ja";
var5 = "\u009e\u0012ÀbX¬¤\u0016Fõ§i  ja".length();
var2 = 0;
}

byte var48 = var2;
var2 += 8;
var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
var38 = var6;
var47 = var3++;
var54 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var57 = 0;
}
}
}

var14 = var15.charAt(var34);
break;
default:
var18[var16++] = var50;
if ((var34 += var14) < var17) {
var14 = var15.charAt(var34);
continue label54;
}

var15 = "¹\u0018\u000bMy¨\u0018^½Ê¼(ÉñÖ\u001a\u0010`ä\u000b\u009bõïÓ\u009e¸!YI\u009b\u000fÚ3";
var17 = "¹\u0018\u000bMy¨\u0018^½Ê¼(ÉñÖ\u001a\u0010`ä\u000b\u009bõïÓ\u009e¸!YI\u009b\u000fÚ3".length();
var14 = 16;
var34 = -1;
}

var35 = var15.substring(++var34, var34 + var14);
var42 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4653;
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
throw new RuntimeException("su/catlean/ea", var10);
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
throw new RuntimeException("su/catlean/ea" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 32441;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = j[var3];
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
throw new RuntimeException("su/catlean/ea", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
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
throw new RuntimeException("su/catlean/ea" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
