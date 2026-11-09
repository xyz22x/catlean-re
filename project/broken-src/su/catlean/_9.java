package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.AfterReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.WorldUpdateEvent;
import su.catlean.gofra.Flow;

public final class _9 extends _3 {
@NotNull
public static final _9 i;
static final KProperty[] n;
@NotNull
private static final cq c;
@NotNull
private static final cq O;
@NotNull
private static final c8 B;
@NotNull
private static final az y;
@NotNull
private static final cw S;
@NotNull
private static final cq l;
private static boolean w;
@NotNull
private static bg t;
@NotNull
private static bg F;
private static final long h = yz.a(-3998563069585926341L, -7283649374402881105L, MethodHandles.lookup().lookupClass()).a(78911273403758L);
private static final String[] m;
private static final String[] o;
private static final Map I = new HashMap(13);
private static final long[] W;
private static final Integer[] ob;
private static final Map pb;

private _9(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 84218364635439L;
super(c<"s">(26281, 4777986949163901185L ^ var1), jt.n(), f<"k">(24933, 6699377559088633368L ^ var1), var3, false);
}

private final boolean t(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 104014170157544L;
return (Boolean)c.E(this, var3, n[0]);
}

private final boolean F(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 9925248084199L;
return (Boolean)O.E(this, var3, n[1]);
}

private final int I(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 40318073089650L;
return ((Number)B.E(this, var3, n[2])).intValue();
}

private final dg T(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 70862933657038L;
return (dg)y.E(this, var3, n[3]);
}

private final void n(dg var1, long var2) {
var2 = h ^ var2;
long var4 = var2 ^ 108600879521554L;
y.b(this, var4, n[3], var1);
}

private final rs l(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 47581684756831L;
return (rs)S.E(this, var3, n[4]);
}

private final void P(rs var1, long var2) {
var2 = h ^ var2;
long var4 = var2 ^ 99601498572948L;
S.b(this, var4, n[4], var1);
}

private final boolean V(long var1) {
var1 = h ^ var1;
long var3 = var1 ^ 75725695932183L;
return (Boolean)l.E(this, var3, n[5]);
}

private final void a(boolean var1, long var2) {
var2 = h ^ var2;
long var4 = var2 ^ 75155286823341L;
l.b(this, var4, n[5], var1);
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
// 002: ldc2_w 103451004335712
// 005: lxor
// 006: dup2
// 007: bipush 56
// 009: lushr
// 00a: l2i
// 00b: istore 3
// 00c: dup2
// 00d: bipush 8
// 00f: lshl
// 010: bipush 8
// 012: lushr
// 013: lstore 4
// 015: pop2
// 016: dup2
// 017: ldc2_w 88141289065175
// 01a: lxor
// 01b: lstore 6
// 01d: dup2
// 01e: ldc2_w 70028441922719
// 021: lxor
// 022: lstore 8
// 024: dup2
// 025: ldc2_w 67464996320865
// 028: lxor
// 029: lstore 10
// 02b: pop2
// 02c: ldc2_w 2609227886096589632
// 02f: lload 1
// 030: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: astore 12
// 037: aload 12
// 039: ifnonnull 1d8
// 03c: aload 0
// 03d: lload 6
// 03f: invokespecial su/catlean/_9.l (J)Lsu/catlean/rs;
// 042: getstatic su/catlean/rs.OFF Lsu/catlean/rs;
// 045: if_acmpeq 1d4
// 048: goto 055
// 04b: ldc2_w 2617551739599912560
// 04e: lload 1
// 04f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: athrow
// 055: aload 0
// 056: lload 10
// 058: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05b: iload 3
// 05c: i2b
// 05d: swap
// 05e: lload 4
// 060: dup2_x1
// 061: pop2
// 062: checkcast net/minecraft/class_1297
// 065: invokevirtual su/catlean/_9.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 068: checkcast net/minecraft/class_2374
// 06b: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 06e: dup
// 06f: sipush 18442
// 072: ldc2_w 8465173372621635740
// 075: lload 1
// 076: lxor
// 077: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/_9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 07f: astore 13
// 081: aload 13
// 083: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 086: i2d
// 087: ldc2_w 0.301
// 08a: dadd
// 08b: aload 13
// 08d: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 090: i2d
// 091: ldc2_w 0.699
// 094: dadd
// 095: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 098: astore 14
// 09a: aload 13
// 09c: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 09f: i2d
// 0a0: ldc2_w 0.301
// 0a3: dadd
// 0a4: aload 13
// 0a6: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0a9: i2d
// 0aa: ldc2_w 0.699
// 0ad: dadd
// 0ae: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 0b1: astore 15
// 0b3: aload 0
// 0b4: lload 6
// 0b6: invokespecial su/catlean/_9.l (J)Lsu/catlean/rs;
// 0b9: aload 12
// 0bb: ifnonnull 0f9
// 0be: getstatic su/catlean/rs.DEFAULT Lsu/catlean/rs;
// 0c1: if_acmpne 0e6
// 0c4: goto 0d1
// 0c7: ldc2_w 2617551739599912560
// 0ca: lload 1
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: aload 13
// 0d3: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0d6: getfield net/minecraft/class_243.field_1352 D
// 0d9: goto 0ff
// 0dc: ldc2_w 2617551739599912560
// 0df: lload 1
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: lload 10
// 0e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0eb: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0ee: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 0f1: checkcast java/lang/Comparable
// 0f4: aload 14
// 0f6: invokestatic kotlin/ranges/RangesKt.coerceIn (Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;
// 0f9: checkcast java/lang/Number
// 0fc: invokevirtual java/lang/Number.doubleValue ()D
// 0ff: dstore 16
// 101: aload 0
// 102: lload 6
// 104: invokespecial su/catlean/_9.l (J)Lsu/catlean/rs;
// 107: aload 12
// 109: ifnonnull 147
// 10c: getstatic su/catlean/rs.DEFAULT Lsu/catlean/rs;
// 10f: if_acmpne 134
// 112: goto 11f
// 115: ldc2_w 2617551739599912560
// 118: lload 1
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: aload 13
// 121: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 124: getfield net/minecraft/class_243.field_1350 D
// 127: goto 14d
// 12a: ldc2_w 2617551739599912560
// 12d: lload 1
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: lload 10
// 136: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 139: invokevirtual net/minecraft/class_746.method_23321 ()D
// 13c: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
// 13f: checkcast java/lang/Comparable
// 142: aload 15
// 144: invokestatic kotlin/ranges/RangesKt.coerceIn (Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;
// 147: checkcast java/lang/Number
// 14a: invokevirtual java/lang/Number.doubleValue ()D
// 14d: dstore 18
// 14f: lload 10
// 151: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 154: new net/minecraft/class_243
// 157: dup
// 158: dload 16
// 15a: aload 0
// 15b: lload 10
// 15d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 160: iload 3
// 161: i2b
// 162: swap
// 163: lload 4
// 165: dup2_x1
// 166: pop2
// 167: checkcast net/minecraft/class_1297
// 16a: invokevirtual su/catlean/_9.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 16d: getfield net/minecraft/class_243.field_1351 D
// 170: dload 18
// 172: invokespecial net/minecraft/class_243.<init> (DDD)V
// 175: invokevirtual net/minecraft/class_746.method_33574 (Lnet/minecraft/class_243;)V
// 178: lload 1
// 179: lconst_0
// 17a: lcmp
// 17b: ifle 1d8
// 17e: aload 0
// 17f: lload 8
// 181: invokespecial su/catlean/_9.V (J)Z
// 184: aload 12
// 186: ifnonnull 1d5
// 189: ifeq 1d4
// 18c: goto 199
// 18f: ldc2_w 2617551739599912560
// 192: lload 1
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: lload 10
// 19b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 19e: astore 20
// 1a0: bipush 0
// 1a1: istore 21
// 1a3: aload 20
// 1a5: getfield net/minecraft/class_746.field_3944 Lnet/minecraft/class_634;
// 1a8: new net/minecraft/class_2828$class_2830
// 1ab: dup
// 1ac: dload 16
// 1ae: aload 20
// 1b0: invokevirtual net/minecraft/class_746.method_23318 ()D
// 1b3: dload 18
// 1b5: aload 20
// 1b7: invokevirtual net/minecraft/class_746.method_36454 ()F
// 1ba: aload 20
// 1bc: invokevirtual net/minecraft/class_746.method_36455 ()F
// 1bf: aload 20
// 1c1: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 1c4: aload 20
// 1c6: getfield net/minecraft/class_746.field_5976 Z
// 1c9: invokespecial net/minecraft/class_2828$class_2830.<init> (DDDFFZZ)V
// 1cc: checkcast net/minecraft/class_2596
// 1cf: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
// 1d2: nop
// 1d3: nop
// 1d4: bipush 0
// 1d5: putstatic su/catlean/_9.w Z
// 1d8: return
}

@Flow
private final void X(TickEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/_9.h J
// 03: ldc2_w 129584442385127
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 91853807119660
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 118206826290955
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 102700226269435
// 1b: lxor
// 1c: lstore 8
// 1e: dup2
// 1f: ldc2_w 126649596994314
// 22: lxor
// 23: lstore 10
// 25: pop2
// 26: ldc2_w -5665923587747727829
// 29: lload 2
// 2a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: astore 12
// 31: lload 4
// 33: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 36: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 39: aload 12
// 3b: ifnonnull 60
// 3e: ifnull b6
// 41: goto 4e
// 44: ldc2_w -5676744430706463973
// 47: lload 2
// 48: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d: athrow
// 4e: lload 10
// 50: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 53: goto 60
// 56: ldc2_w -5676744430706463973
// 59: lload 2
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: invokevirtual net/minecraft/class_746.method_23318 ()D
// 63: lload 10
// 65: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 68: getfield net/minecraft/class_746.field_6036 D
// 6b: invokestatic java/lang/Math.floor (D)D
// 6e: ldc 0.9
// 70: f2d
// 71: dadd
// 72: dcmpl
// 73: aload 12
// 75: ifnonnull ad
// 78: ifle b6
// 7b: goto 88
// 7e: ldc2_w -5676744430706463973
// 81: lload 2
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: aload 0
// 89: aload 12
// 8b: ifnonnull b1
// 8e: goto 9b
// 91: ldc2_w -5676744430706463973
// 94: lload 2
// 95: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a: athrow
// 9b: lload 6
// 9d: invokespecial su/catlean/_9.t (J)Z
// a0: goto ad
// a3: ldc2_w -5676744430706463973
// a6: lload 2
// a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac: athrow
// ad: ifeq b6
// b0: aload 0
// b1: lload 8
// b3: invokevirtual su/catlean/_9.d (J)V
// b6: return
}

@Flow
private final void p(WorldUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_9.h J
// 003: ldc2_w 127490611608637
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 73316760992103
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 25942912441931
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 64003075922142
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 20572174264240
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 4486523044864
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 140055520425772
// 030: lxor
// 031: dup2
// 032: bipush 16
// 034: lushr
// 035: lstore 14
// 037: dup2
// 038: bipush 48
// 03a: lshl
// 03b: bipush 48
// 03d: lushr
// 03e: l2i
// 03f: istore 16
// 041: pop2
// 042: dup2
// 043: ldc2_w 61705493162114
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 128674704178640
// 04d: lxor
// 04e: lstore 19
// 050: pop2
// 051: ldc2_w 8035722099559491825
// 054: lload 2
// 055: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: astore 21
// 05c: aload 0
// 05d: lload 8
// 05f: invokespecial su/catlean/_9.F (J)Z
// 062: aload 21
// 064: ifnonnull 092
// 067: ifeq 18b
// 06a: goto 077
// 06d: ldc2_w 8062042759384905153
// 070: lload 2
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: getstatic su/catlean/_9.t Lsu/catlean/bg;
// 07a: aload 0
// 07b: lload 6
// 07d: invokespecial su/catlean/_9.I (J)I
// 080: lload 10
// 082: invokevirtual su/catlean/bg.q (IJ)Z
// 085: goto 092
// 088: ldc2_w 8062042759384905153
// 08b: lload 2
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: aload 21
// 094: ifnonnull 0d3
// 097: ifeq 18b
// 09a: goto 0a7
// 09d: ldc2_w 8062042759384905153
// 0a0: lload 2
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: getstatic su/catlean/_9.F Lsu/catlean/bg;
// 0aa: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 0ad: aconst_null
// 0ae: lload 14
// 0b0: bipush 1
// 0b1: iload 16
// 0b3: i2c
// 0b4: aconst_null
// 0b5: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 0b8: i2d
// 0b9: ldc2_w 1.5
// 0bc: dmul
// 0bd: invokestatic java/lang/Math.ceil (D)D
// 0c0: d2i
// 0c1: lload 12
// 0c3: invokevirtual su/catlean/bg.c (IJ)Z
// 0c6: goto 0d3
// 0c9: ldc2_w 8062042759384905153
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: ifeq 18b
// 0d6: aload 0
// 0d7: checkcast su/catlean/_3
// 0da: aload 0
// 0db: lload 19
// 0dd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e0: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0e3: lload 19
// 0e5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0e8: invokevirtual net/minecraft/class_746.method_23318 ()D
// 0eb: lload 19
// 0ed: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f0: invokevirtual net/minecraft/class_746.method_23318 ()D
// 0f3: invokestatic java/lang/Math.floor (D)D
// 0f6: dsub
// 0f7: aload 21
// 0f9: ifnonnull 13f
// 0fc: goto 109
// 0ff: ldc2_w 8062042759384905153
// 102: lload 2
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: ldc2_w 0.8
// 10c: dcmpl
// 10d: ifle 137
// 110: goto 11d
// 113: ldc2_w 8062042759384905153
// 116: lload 2
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: lload 19
// 11f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 122: invokevirtual net/minecraft/class_746.method_23318 ()D
// 125: invokestatic java/lang/Math.floor (D)D
// 128: dconst_1
// 129: dadd
// 12a: goto 142
// 12d: ldc2_w 8062042759384905153
// 130: lload 2
// 131: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: athrow
// 137: lload 19
// 139: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13c: invokevirtual net/minecraft/class_746.method_23318 ()D
// 13f: invokestatic java/lang/Math.floor (D)D
// 142: lload 19
// 144: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 147: invokevirtual net/minecraft/class_746.method_23321 ()D
// 14a: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 14d: dup
// 14e: sipush 18442
// 151: ldc2_w 8465111471387183917
// 154: lload 2
// 155: lxor
// 156: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/_9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15e: new java/util/ArrayList
// 161: dup
// 162: invokespecial java/util/ArrayList.<init> ()V
// 165: checkcast java/util/List
// 168: lload 4
// 16a: dup2_x1
// 16b: pop2
// 16c: invokespecial su/catlean/_9.y (Lnet/minecraft/class_2338;JLjava/util/List;)Ljava/util/List;
// 16f: bipush 1
// 170: bipush 0
// 171: aconst_null
// 172: bipush 0
// 173: sipush 779
// 176: ldc2_w 2368813206268719347
// 179: lload 2
// 17a: lxor
// 17b: invokedynamic k (IJ)I bsm=su/catlean/_9.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: lload 17
// 182: aconst_null
// 183: invokestatic su/catlean/_3.s (Lsu/catlean/_3;Ljava/util/List;ZZLjava/util/List;ZIJLjava/lang/Object;)Z
// 186: pop
// 187: bipush 1
// 188: putstatic su/catlean/_9.w Z
// 18b: return
}

@Flow(
priority = 10
)
private final void k(AfterReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_9.h J
// 003: ldc2_w 7390119840381
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 61458810703655
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 74642612712057
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 16
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 87406836510366
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 131968090069
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 85031559765698
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 328428850064
// 03f: lxor
// 040: lstore 15
// 042: pop2
// 043: ldc2_w 6468554345202179761
// 046: lload 2
// 047: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: astore 17
// 04e: aload 0
// 04f: lload 9
// 051: invokespecial su/catlean/_9.F (J)Z
// 054: aload 17
// 056: ifnonnull 08f
// 059: ifeq 25f
// 05c: goto 069
// 05f: ldc2_w 6458817620330120065
// 062: lload 2
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: aload 1
// 06a: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 06d: aload 17
// 06f: ifnonnull 0a3
// 072: goto 07f
// 075: ldc2_w 6458817620330120065
// 078: lload 2
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: instanceof net/minecraft/class_2604
// 082: goto 08f
// 085: ldc2_w 6458817620330120065
// 088: lload 2
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: ifeq 25f
// 092: aload 1
// 093: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 096: goto 0a3
// 099: ldc2_w 6458817620330120065
// 09c: lload 2
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: astore 18
// 0a5: new net/minecraft/class_243
// 0a8: dup
// 0a9: aload 18
// 0ab: checkcast net/minecraft/class_2604
// 0ae: invokevirtual net/minecraft/class_2604.method_11175 ()D
// 0b1: aload 18
// 0b3: checkcast net/minecraft/class_2604
// 0b6: invokevirtual net/minecraft/class_2604.method_11174 ()D
// 0b9: aload 18
// 0bb: checkcast net/minecraft/class_2604
// 0be: invokevirtual net/minecraft/class_2604.method_11176 ()D
// 0c1: invokespecial net/minecraft/class_243.<init> (DDD)V
// 0c4: astore 19
// 0c6: aload 18
// 0c8: checkcast net/minecraft/class_2604
// 0cb: invokevirtual net/minecraft/class_2604.method_11169 ()Lnet/minecraft/class_1299;
// 0ce: getstatic net/minecraft/class_1299.field_6110 Lnet/minecraft/class_1299;
// 0d1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d4: aload 17
// 0d6: ifnonnull 107
// 0d9: ifeq 25f
// 0dc: goto 0e9
// 0df: ldc2_w 6458817620330120065
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: aload 19
// 0eb: lload 15
// 0ed: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f0: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0f3: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 0f6: ldc2_w 9.0
// 0f9: dcmpg
// 0fa: goto 107
// 0fd: ldc2_w 6458817620330120065
// 100: lload 2
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: ifge 25f
// 10a: aload 0
// 10b: lload 15
// 10d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 110: invokevirtual net/minecraft/class_746.method_23317 ()D
// 113: lload 15
// 115: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 118: invokevirtual net/minecraft/class_746.method_23318 ()D
// 11b: lload 15
// 11d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 120: invokevirtual net/minecraft/class_746.method_23318 ()D
// 123: invokestatic java/lang/Math.floor (D)D
// 126: dsub
// 127: aload 17
// 129: ifnonnull 16f
// 12c: goto 139
// 12f: ldc2_w 6458817620330120065
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: ldc2_w 0.8
// 13c: dcmpl
// 13d: ifle 167
// 140: goto 14d
// 143: ldc2_w 6458817620330120065
// 146: lload 2
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: lload 15
// 14f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 152: invokevirtual net/minecraft/class_746.method_23318 ()D
// 155: invokestatic java/lang/Math.floor (D)D
// 158: dconst_1
// 159: dadd
// 15a: goto 172
// 15d: ldc2_w 6458817620330120065
// 160: lload 2
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: lload 15
// 169: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 16c: invokevirtual net/minecraft/class_746.method_23318 ()D
// 16f: invokestatic java/lang/Math.floor (D)D
// 172: lload 15
// 174: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 177: invokevirtual net/minecraft/class_746.method_23321 ()D
// 17a: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 17d: dup
// 17e: sipush 24326
// 181: ldc2_w 327135344783633011
// 184: lload 2
// 185: lxor
// 186: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/_9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 18e: new java/util/ArrayList
// 191: dup
// 192: invokespecial java/util/ArrayList.<init> ()V
// 195: checkcast java/util/List
// 198: lload 4
// 19a: dup2_x1
// 19b: pop2
// 19c: invokespecial su/catlean/_9.y (Lnet/minecraft/class_2338;JLjava/util/List;)Ljava/util/List;
// 19f: astore 20
// 1a1: aload 20
// 1a3: checkcast java/util/Collection
// 1a6: invokeinterface java/util/Collection.isEmpty ()Z 1
// 1ab: aload 17
// 1ad: ifnonnull 1c1
// 1b0: ifne 1c4
// 1b3: goto 1c0
// 1b6: ldc2_w 6458817620330120065
// 1b9: lload 2
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: bipush 1
// 1c1: goto 1c5
// 1c4: bipush 0
// 1c5: ifeq 25f
// 1c8: lload 15
// 1ca: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1cd: checkcast net/minecraft/class_1297
// 1d0: lload 15
// 1d2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d5: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 1d8: invokestatic net/minecraft/class_2824.method_34206 (Lnet/minecraft/class_1297;Z)Lnet/minecraft/class_2824;
// 1db: dup
// 1dc: sipush 21902
// 1df: ldc2_w 7120270093858709742
// 1e2: lload 2
// 1e3: lxor
// 1e4: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/_9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ec: astore 21
// 1ee: iload 6
// 1f0: i2s
// 1f1: aload 21
// 1f3: aload 18
// 1f5: checkcast net/minecraft/class_2604
// 1f8: invokevirtual net/minecraft/class_2604.method_11167 ()I
// 1fb: lload 7
// 1fd: dup2_x1
// 1fe: pop2
// 1ff: invokestatic su/catlean/t0.x (SLnet/minecraft/class_2824;JI)V
// 202: lload 11
// 204: aload 21
// 206: checkcast net/minecraft/class_2596
// 209: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 20c: new net/minecraft/class_2879
// 20f: dup
// 210: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 213: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 216: checkcast net/minecraft/class_2596
// 219: lload 11
// 21b: dup2_x1
// 21c: pop2
// 21d: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 220: aload 0
// 221: checkcast su/catlean/_3
// 224: aload 20
// 226: checkcast java/lang/Iterable
// 229: astore 22
// 22b: bipush 0
// 22c: istore 23
// 22e: aload 22
// 230: new su/catlean/rh
// 233: dup
// 234: aload 19
// 236: invokespecial su/catlean/rh.<init> (Lnet/minecraft/class_243;)V
// 239: checkcast java/util/Comparator
// 23c: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 23f: bipush 1
// 240: bipush 0
// 241: aconst_null
// 242: bipush 0
// 243: sipush 10533
// 246: ldc2_w 1256619168369683615
// 249: lload 2
// 24a: lxor
// 24b: invokedynamic k (IJ)I bsm=su/catlean/_9.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: lload 13
// 252: aconst_null
// 253: invokestatic su/catlean/_3.s (Lsu/catlean/_3;Ljava/util/List;ZZLjava/util/List;ZIJLjava/lang/Object;)Z
// 256: pop
// 257: bipush 1
// 258: putstatic su/catlean/_9.w Z
// 25b: aload 1
// 25c: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.cancel ()V
// 25f: return
}

@Flow
private final void z(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_9.h J
// 003: ldc2_w 136475425634224
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 84947786314474
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 61516814361359
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 135151813572189
// 01b: lxor
// 01c: lstore 8
// 01e: pop2
// 01f: ldc2_w 7208452385736352636
// 022: lload 2
// 023: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 028: astore 10
// 02a: getstatic su/catlean/_9.w Z
// 02d: aload 10
// 02f: ifnonnull 043
// 032: ifeq 047
// 035: goto 042
// 038: ldc2_w 7237054531681107532
// 03b: lload 2
// 03c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 041: athrow
// 042: bipush 0
// 043: putstatic su/catlean/_9.w Z
// 046: return
// 047: aload 0
// 048: checkcast su/catlean/_3
// 04b: aload 0
// 04c: lload 8
// 04e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 051: invokevirtual net/minecraft/class_746.method_23317 ()D
// 054: lload 8
// 056: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 059: invokevirtual net/minecraft/class_746.method_23318 ()D
// 05c: lload 8
// 05e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 061: invokevirtual net/minecraft/class_746.method_23318 ()D
// 064: invokestatic java/lang/Math.floor (D)D
// 067: dsub
// 068: aload 10
// 06a: ifnonnull 0a3
// 06d: ldc2_w 0.8
// 070: dcmpl
// 071: ifle 09b
// 074: goto 081
// 077: ldc2_w 7237054531681107532
// 07a: lload 2
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: lload 8
// 083: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 086: invokevirtual net/minecraft/class_746.method_23318 ()D
// 089: invokestatic java/lang/Math.floor (D)D
// 08c: dconst_1
// 08d: dadd
// 08e: goto 0a6
// 091: ldc2_w 7237054531681107532
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: lload 8
// 09d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a0: invokevirtual net/minecraft/class_746.method_23318 ()D
// 0a3: invokestatic java/lang/Math.floor (D)D
// 0a6: lload 8
// 0a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ab: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0ae: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 0b1: dup
// 0b2: sipush 18442
// 0b5: ldc2_w 8465098122387783840
// 0b8: lload 2
// 0b9: lxor
// 0ba: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/_9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c2: new java/util/ArrayList
// 0c5: dup
// 0c6: invokespecial java/util/ArrayList.<init> ()V
// 0c9: checkcast java/util/List
// 0cc: lload 4
// 0ce: dup2_x1
// 0cf: pop2
// 0d0: invokespecial su/catlean/_9.y (Lnet/minecraft/class_2338;JLjava/util/List;)Ljava/util/List;
// 0d3: bipush 0
// 0d4: bipush 0
// 0d5: aconst_null
// 0d6: bipush 0
// 0d7: sipush 28898
// 0da: ldc2_w 4925616340143425692
// 0dd: lload 2
// 0de: lxor
// 0df: invokedynamic k (IJ)I bsm=su/catlean/_9.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: lload 6
// 0e6: aconst_null
// 0e7: invokestatic su/catlean/_3.s (Lsu/catlean/_3;Ljava/util/List;ZZLjava/util/List;ZIJLjava/lang/Object;)Z
// 0ea: ifeq 100
// 0ed: getstatic su/catlean/_9.F Lsu/catlean/bg;
// 0f0: invokevirtual su/catlean/bg.l ()V
// 0f3: goto 100
// 0f6: ldc2_w 7237054531681107532
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: return
}

private final List y(class_2338 param1, long param2, List param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/_9.h J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 28451561294950
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 65424432272002
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 57929104371500
// 019: lxor
// 01a: dup2
// 01b: bipush 16
// 01d: lushr
// 01e: lstore 9
// 020: dup2
// 021: bipush 48
// 023: lshl
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 11
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 15663063148690
// 02f: lxor
// 030: lstore 12
// 032: dup2
// 033: ldc2_w 1835183573742
// 036: lxor
// 037: lstore 14
// 039: dup2
// 03a: ldc2_w 51937678370481
// 03d: lxor
// 03e: lstore 16
// 040: dup2
// 041: ldc2_w 51820539976691
// 044: lxor
// 045: dup2
// 046: bipush 32
// 048: lushr
// 049: l2i
// 04a: istore 18
// 04c: dup2
// 04d: bipush 32
// 04f: lshl
// 050: bipush 48
// 052: lushr
// 053: l2i
// 054: istore 19
// 056: dup2
// 057: bipush 48
// 059: lshl
// 05a: bipush 48
// 05c: lushr
// 05d: l2i
// 05e: istore 20
// 060: pop2
// 061: dup2
// 062: ldc2_w 128004744852131
// 065: lxor
// 066: lstore 21
// 068: pop2
// 069: new java/util/ArrayList
// 06c: dup
// 06d: invokespecial java/util/ArrayList.<init> ()V
// 070: checkcast java/util/List
// 073: astore 24
// 075: ldc2_w 4927474013297099540
// 078: lload 2
// 079: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: getstatic su/catlean/mk.b Lkotlin/enums/EnumEntries;
// 081: checkcast java/lang/Iterable
// 084: astore 26
// 086: astore 23
// 088: bipush 0
// 089: istore 27
// 08b: aload 26
// 08d: astore 28
// 08f: new java/util/ArrayList
// 092: dup
// 093: invokespecial java/util/ArrayList.<init> ()V
// 096: checkcast java/util/Collection
// 099: astore 29
// 09b: bipush 0
// 09c: istore 30
// 09e: aload 28
// 0a0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0a5: astore 31
// 0a7: aload 31
// 0a9: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ae: ifeq 0f8
// 0b1: aload 31
// 0b3: lload 2
// 0b4: lconst_0
// 0b5: lcmp
// 0b6: iflt 0c3
// 0b9: aload 23
// 0bb: ifnonnull 109
// 0be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0c3: astore 32
// 0c5: aload 32
// 0c7: checkcast net/minecraft/class_2350
// 0ca: astore 33
// 0cc: bipush 0
// 0cd: istore 34
// 0cf: aload 33
// 0d1: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 0d4: if_acmpeq 0e5
// 0d7: bipush 1
// 0d8: goto 0e6
// 0db: ldc2_w 4901983486745812516
// 0de: lload 2
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: bipush 0
// 0e6: ifeq 0a7
// 0e9: aload 29
// 0eb: aload 32
// 0ed: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0f2: pop
// 0f3: aload 23
// 0f5: ifnull 0a7
// 0f8: aload 29
// 0fa: checkcast java/util/List
// 0fd: nop
// 0fe: lload 2
// 0ff: lconst_0
// 100: lcmp
// 101: ifle 0c3
// 104: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 109: astore 25
// 10b: aload 25
// 10d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 112: ifeq 3aa
// 115: aload 25
// 117: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 11c: checkcast net/minecraft/class_2350
// 11f: astore 26
// 121: aload 1
// 122: aload 26
// 124: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 127: dup
// 128: sipush 11010
// 12b: ldc2_w 330732216795874248
// 12e: lload 2
// 12f: lxor
// 130: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/_9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 138: astore 27
// 13a: aload 4
// 13c: aload 27
// 13e: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 143: aload 23
// 145: ifnonnull 165
// 148: ifne 180
// 14b: lload 12
// 14d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 150: aload 27
// 152: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 155: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 158: goto 165
// 15b: ldc2_w 4901983486745812516
// 15e: lload 2
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: aload 23
// 167: lload 2
// 168: lconst_0
// 169: lcmp
// 16a: iflt 19c
// 16d: ifnonnull 19a
// 170: ifne 192
// 173: goto 180
// 176: ldc2_w 4901983486745812516
// 179: lload 2
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: aload 23
// 182: ifnull 10b
// 185: goto 192
// 188: ldc2_w 4901983486745812516
// 18b: lload 2
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: aload 0
// 193: lload 5
// 195: aload 27
// 197: invokevirtual su/catlean/_9.m (JLnet/minecraft/class_2338;)Z
// 19a: aload 23
// 19c: ifnonnull 1d9
// 19f: ifeq 1df
// 1a2: goto 1af
// 1a5: ldc2_w 4901983486745812516
// 1a8: lload 2
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: aload 4
// 1b1: aload 1
// 1b2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1b7: pop
// 1b8: aload 24
// 1ba: aload 0
// 1bb: aload 27
// 1bd: lload 7
// 1bf: aload 4
// 1c1: invokespecial su/catlean/_9.y (Lnet/minecraft/class_2338;JLjava/util/List;)Ljava/util/List;
// 1c4: checkcast java/util/Collection
// 1c7: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
// 1cc: goto 1d9
// 1cf: ldc2_w 4901983486745812516
// 1d2: lload 2
// 1d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: athrow
// 1d9: pop
// 1da: aload 23
// 1dc: ifnull 10b
// 1df: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 1e2: aload 27
// 1e4: bipush 0
// 1e5: aload 0
// 1e6: lload 16
// 1e8: invokevirtual su/catlean/_9.w (J)Lsu/catlean/xx;
// 1eb: aload 0
// 1ec: lload 9
// 1ee: iload 11
// 1f0: i2s
// 1f1: invokevirtual su/catlean/_9.r (JS)Lsu/catlean/zr;
// 1f4: getstatic su/catlean/y4.ONLY_CRYSTALS Lsu/catlean/y4;
// 1f7: ldc 6.0
// 1f9: ldc 6.0
// 1fb: aload 0
// 1fc: invokevirtual su/catlean/_9.e ()I
// 1ff: aload 0
// 200: iload 18
// 202: iload 19
// 204: iload 20
// 206: invokevirtual su/catlean/_9.a (III)Lsu/catlean/yi;
// 209: lload 14
// 20b: dup2_x1
// 20c: pop2
// 20d: aconst_null
// 20e: bipush 0
// 20f: sipush 16672
// 212: ldc2_w 3068640596650744114
// 215: lload 2
// 216: lxor
// 217: invokedynamic k (IJ)I bsm=su/catlean/_9.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: aconst_null
// 21d: invokestatic su/catlean/gw.P (Lsu/catlean/gw;Lnet/minecraft/class_2338;ILsu/catlean/xx;Lsu/catlean/zr;Lsu/catlean/y4;FFIJLsu/catlean/yi;Ljava/util/List;ZILjava/lang/Object;)Lsu/catlean/t5;
// 220: ifnonnull 39b
// 223: getstatic su/catlean/mk.b Lkotlin/enums/EnumEntries;
// 226: checkcast java/lang/Iterable
// 229: astore 29
// 22b: bipush 0
// 22c: istore 30
// 22e: aload 29
// 230: astore 31
// 232: new java/util/ArrayList
// 235: dup
// 236: invokespecial java/util/ArrayList.<init> ()V
// 239: checkcast java/util/Collection
// 23c: astore 32
// 23e: bipush 0
// 23f: istore 33
// 241: aload 31
// 243: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 248: astore 34
// 24a: aload 34
// 24c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 251: ifeq 29b
// 254: aload 34
// 256: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 25b: astore 35
// 25d: aload 35
// 25f: checkcast net/minecraft/class_2350
// 262: astore 36
// 264: bipush 0
// 265: istore 37
// 267: aload 36
// 269: aload 23
// 26b: ifnonnull 11f
// 26e: lload 2
// 26f: lconst_0
// 270: lcmp
// 271: ifle 11c
// 274: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 277: if_acmpeq 288
// 27a: bipush 1
// 27b: goto 289
// 27e: ldc2_w 4901983486745812516
// 281: lload 2
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: bipush 0
// 289: ifeq 24a
// 28c: aload 32
// 28e: aload 35
// 290: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 295: pop
// 296: aload 23
// 298: ifnull 24a
// 29b: aload 32
// 29d: checkcast java/util/List
// 2a0: nop
// 2a1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 2a6: lload 2
// 2a7: lconst_0
// 2a8: lcmp
// 2a9: ifle 25b
// 2ac: astore 28
// 2ae: aload 28
// 2b0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2b5: ifeq 10b
// 2b8: aload 28
// 2ba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2bf: checkcast net/minecraft/class_2350
// 2c2: astore 29
// 2c4: aload 4
// 2c6: aload 27
// 2c8: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
// 2cd: aload 23
// 2cf: lload 2
// 2d0: lconst_0
// 2d1: lcmp
// 2d2: iflt 145
// 2d5: ifnonnull 112
// 2d8: aload 23
// 2da: lload 2
// 2db: lconst_0
// 2dc: lcmp
// 2dd: ifle 145
// 2e0: ifnonnull 300
// 2e3: ifne 2ae
// 2e6: goto 2f3
// 2e9: ldc2_w 4901983486745812516
// 2ec: lload 2
// 2ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f2: athrow
// 2f3: lload 12
// 2f5: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2f8: aload 27
// 2fa: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 2fd: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 300: ifne 306
// 303: goto 2ae
// 306: aload 27
// 308: aload 29
// 30a: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 30d: dup
// 30e: sipush 13191
// 311: ldc2_w 2400057387821521734
// 314: lload 2
// 315: lxor
// 316: invokedynamic s (IJ)Ljava/lang/String; bsm=su/catlean/_9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 31e: astore 30
// 320: aload 23
// 322: lload 2
// 323: lconst_0
// 324: lcmp
// 325: ifle 392
// 328: ifnonnull 390
// 32b: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 32e: aload 30
// 330: bipush 0
// 331: aload 0
// 332: lload 16
// 334: invokevirtual su/catlean/_9.w (J)Lsu/catlean/xx;
// 337: aload 0
// 338: lload 9
// 33a: iload 11
// 33c: i2s
// 33d: invokevirtual su/catlean/_9.r (JS)Lsu/catlean/zr;
// 340: getstatic su/catlean/y4.ONLY_CRYSTALS Lsu/catlean/y4;
// 343: ldc 6.0
// 345: ldc 6.0
// 347: aload 0
// 348: invokevirtual su/catlean/_9.e ()I
// 34b: aload 0
// 34c: iload 18
// 34e: iload 19
// 350: iload 20
// 352: invokevirtual su/catlean/_9.a (III)Lsu/catlean/yi;
// 355: lload 14
// 357: dup2_x1
// 358: pop2
// 359: aconst_null
// 35a: bipush 0
// 35b: sipush 21495
// 35e: ldc2_w 9000244849840081890
// 361: lload 2
// 362: lxor
// 363: invokedynamic k (IJ)I bsm=su/catlean/_9.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 368: aconst_null
// 369: invokestatic su/catlean/gw.P (Lsu/catlean/gw;Lnet/minecraft/class_2338;ILsu/catlean/xx;Lsu/catlean/zr;Lsu/catlean/y4;FFIJLsu/catlean/yi;Ljava/util/List;ZILjava/lang/Object;)Lsu/catlean/t5;
// 36c: ifnull 2ae
// 36f: goto 37c
// 372: ldc2_w 4901983486745812516
// 375: lload 2
// 376: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37b: athrow
// 37c: aload 24
// 37e: aload 30
// 380: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 385: pop
// 386: aload 24
// 388: aload 27
// 38a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 38f: pop
// 390: aload 23
// 392: lload 2
// 393: lconst_0
// 394: lcmp
// 395: ifle 3a7
// 398: ifnull 2ae
// 39b: aload 24
// 39d: aload 27
// 39f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 3a4: pop
// 3a5: aload 23
// 3a7: ifnull 10b
// 3aa: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 3ad: ldc 0.5
// 3af: bipush 1
// 3b0: fconst_0
// 3b1: lload 21
// 3b3: fconst_0
// 3b4: fconst_0
// 3b5: sipush 779
// 3b8: ldc2_w 2368838570981169942
// 3bb: lload 2
// 3bc: lxor
// 3bd: invokedynamic k (IJ)I bsm=su/catlean/_9.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c2: aconst_null
// 3c3: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 3c6: lload 2
// 3c7: lconst_0
// 3c8: lcmp
// 3c9: ifle 11c
// 3cc: astore 25
// 3ce: aload 24
// 3d0: checkcast java/lang/Iterable
// 3d3: astore 26
// 3d5: bipush 0
// 3d6: istore 27
// 3d8: aload 26
// 3da: new su/catlean/te
// 3dd: dup
// 3de: aload 25
// 3e0: invokespecial su/catlean/te.<init> ([D)V
// 3e3: checkcast java/util/Comparator
// 3e6: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 3e9: areturn
}

@NotNull
@Override
protected List R(long var1) {
long var3 = var1 ^ 59067967019128L;
return this.T(var3).e();
}

private static final boolean Z() {
long var0 = h ^ 92015106966443L;
long var2 = var0 ^ 29041357023048L;
return i.F(var2);
}

private static final boolean i() {
long var0 = h ^ 58663851538270L;
long var2 = var0 ^ 104301024709125L;

try {
if (i.l(var2) != rs.OFF) {
return true;
}
} catch (NumberFormatException var4) {
throw vm.a<"Å">(var4, -6592874555013824862L, var0);
}

return false;
}

static {
long var20 = h ^ 97641888017991L;
long var22 = var20 ^ 98580927363607L;
long var24 = var20 ^ 129806897297265L;
long var26 = var20 ^ 9282649146481L;
long var28 = var20 ^ 13295008605154L;
long var30 = var20 ^ 69432182637670L;
long var32 = var20 ^ 27303502741667L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[27];
int var16 = 0;
String var15 = "¡+ÿÐî\u009b\u0084\u0090\nÅI\u0086\u0092\u0092sbx\u0019ÃôÃ¦áÂ2`u\u0019Cö\u0002\u0082¹3\u0007þ\u001f{7)\u0018ÎN,\u0006KØcôÜi OBþ\u008ff%=\u0014\u0096©\t\u008d\u0089 ÿé\u009b\"D5ñûõö\u0084NÏÁ´TÈ\\¡¦³\u0080ù\u0098T]5Á\u0089¢a¶ c-<¨Fh~w}§Ô`åH¿¾/\u009cÑ¦Þ\u0005\u009bµ¨±\u001dE\u009fv\u001aV8ZXÐ\u001f*Ú\u0082Ïo\u001d#;\u0084J\u0017T9\u0098/çUyE´éòlh{ \"p\u0000à_\u0084{\u0095Z²\u0012\u0000\u0014\u001d°\u0099ÃäZ\u0014\u009aîèzU\u0092\u0018§»\u0013ÔÃ\u00822ßÚ\\dÏqp;BÕ§(Ü/, Z(#\u000b}Û;©-ØlÐì°\u0005\u008aY ã\u0092\u0011N¡Ø\u001f\u0016\u0084ì>ü°r\u001cl÷?ñÔâ\u008f'ò\u0010\u0091Ghr\b\u0092ä\u0003\\\u0006P\u0086¯±\u0005Ã \u0098\u0003\u001dvÎ^Õ\u0095\u0098ùé\u0013¸è]c÷\u0096¾^O;9Þ?Nß\u009e\nºÑ«\u0018P&Ê\\\u0018Ar\u009b?EÞùÙ¾îô»>·\u001f76\u00ad*\u0018¶HSÊ\u0005¼ýE\u0018#\bå\u008bæ\u009ePE qÂdá!À\u0010Ò¾;)\u00011é\u0093èMÖïq\u0085uØ V²ºô=v\u0094²[\u0018²a\u0012Ó\u008bú¨k\u009e6R\u000bYÜqI\u0006c!@Û¹(,]¯È½§z¦\u0088]\u0017\u001c)~kÝ\u0083\u008c\u0083i´QNédWu\u009d¡°3Ô~a\u0091ªþ´oä\u0010\u0011Zbú+í7â\u008a%ö¥\u0097ù\u0006\u0098\u0010\u000bù\u001c\u0093ÀckR\u0012Lth×ºfA\u0018úKQ¦/Onh0Ôè}óTãÈ»X\u0095ÔÝÃ\u001c\u0094 a²\u0097\u0006D/7Ê'Ç¯ÙÈ}rÓ¾¬\u0089Ì\u001a\fÅ\r;C8\u009a\u008d@\tk \u0012\u0015«ø\u0081ÈÔb\u0097 9øé8LÇóÐ|®\u0082Øë\u0085z\u000e®y]hD¸\u0018\u0085î\u008cT\u008e\u0080LÓÏZ\u009cÁ\u0090¬#\u0005\u0090\u0090\u0082Rp\u001ah§ \t¬ëªÆteA¸?¬æâF\u0015Tô\u0085ÁÁù\u007f@í\u001eÉ\u0097fZ¥\u0016\u0094\u0010\tP}ß\u0010j|ëé[ò»!&R9 ô\n\u008bÝG\u0083,ð\u007fÚ\u0016\u001dåR·è\u0017\u0083\u008fL5uÄ-\u0011þÆ´ÉÜ#\u009e@\u0094(gÌé\u0016â\u0099\u0018}\u0088\u001c¾õ\u008cë(<Î\u0090où\bz\u0086\u0017\u0017{Ã\u00812àµËz\u0017 ;\n-YU\\{»\u001fð\u0015#n\u0082O[a¬_âªZ\u009b´DÀÅ Õ(\u0089ýcþJ\u009a#Uµ\u0098Ü±\u001dXü¨¾\u0087>\bèt\bÝ\\¿\u00948xÕ";
int var17 = "¡+ÿÐî\u009b\u0084\u0090\nÅI\u0086\u0092\u0092sbx\u0019ÃôÃ¦áÂ2`u\u0019Cö\u0002\u0082¹3\u0007þ\u001f{7)\u0018ÎN,\u0006KØcôÜi OBþ\u008ff%=\u0014\u0096©\t\u008d\u0089 ÿé\u009b\"D5ñûõö\u0084NÏÁ´TÈ\\¡¦³\u0080ù\u0098T]5Á\u0089¢a¶ c-<¨Fh~w}§Ô`åH¿¾/\u009cÑ¦Þ\u0005\u009bµ¨±\u001dE\u009fv\u001aV8ZXÐ\u001f*Ú\u0082Ïo\u001d#;\u0084J\u0017T9\u0098/çUyE´éòlh{ \"p\u0000à_\u0084{\u0095Z²\u0012\u0000\u0014\u001d°\u0099ÃäZ\u0014\u009aîèzU\u0092\u0018§»\u0013ÔÃ\u00822ßÚ\\dÏqp;BÕ§(Ü/, Z(#\u000b}Û;©-ØlÐì°\u0005\u008aY ã\u0092\u0011N¡Ø\u001f\u0016\u0084ì>ü°r\u001cl÷?ñÔâ\u008f'ò\u0010\u0091Ghr\b\u0092ä\u0003\\\u0006P\u0086¯±\u0005Ã \u0098\u0003\u001dvÎ^Õ\u0095\u0098ùé\u0013¸è]c÷\u0096¾^O;9Þ?Nß\u009e\nºÑ«\u0018P&Ê\\\u0018Ar\u009b?EÞùÙ¾îô»>·\u001f76\u00ad*\u0018¶HSÊ\u0005¼ýE\u0018#\bå\u008bæ\u009ePE qÂdá!À\u0010Ò¾;)\u00011é\u0093èMÖïq\u0085uØ V²ºô=v\u0094²[\u0018²a\u0012Ó\u008bú¨k\u009e6R\u000bYÜqI\u0006c!@Û¹(,]¯È½§z¦\u0088]\u0017\u001c)~kÝ\u0083\u008c\u0083i´QNédWu\u009d¡°3Ô~a\u0091ªþ´oä\u0010\u0011Zbú+í7â\u008a%ö¥\u0097ù\u0006\u0098\u0010\u000bù\u001c\u0093ÀckR\u0012Lth×ºfA\u0018úKQ¦/Onh0Ôè}óTãÈ»X\u0095ÔÝÃ\u001c\u0094 a²\u0097\u0006D/7Ê'Ç¯ÙÈ}rÓ¾¬\u0089Ì\u001a\fÅ\r;C8\u009a\u008d@\tk \u0012\u0015«ø\u0081ÈÔb\u0097 9øé8LÇóÐ|®\u0082Øë\u0085z\u000e®y]hD¸\u0018\u0085î\u008cT\u008e\u0080LÓÏZ\u009cÁ\u0090¬#\u0005\u0090\u0090\u0082Rp\u001ah§ \t¬ëªÆteA¸?¬æâF\u0015Tô\u0085ÁÁù\u007f@í\u001eÉ\u0097fZ¥\u0016\u0094\u0010\tP}ß\u0010j|ëé[ò»!&R9 ô\n\u008bÝG\u0083,ð\u007fÚ\u0016\u001dåR·è\u0017\u0083\u008fL5uÄ-\u0011þÆ´ÉÜ#\u009e@\u0094(gÌé\u0016â\u0099\u0018}\u0088\u001c¾õ\u008cë(<Î\u0090où\bz\u0086\u0017\u0017{Ã\u00812àµËz\u0017 ;\n-YU\\{»\u001fð\u0015#n\u0082O[a¬_âªZ\u009b´DÀÅ Õ(\u0089ýcþJ\u009a#Uµ\u0098Ü±\u001dXü¨¾\u0087>\bèt\bÝ\\¿\u00948xÕ"
.length();
char var14 = '(';
int var42 = -1;

label54:
while (true) {
String var44 = var15.substring(++var42, var42 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var44.getBytes("ISO-8859-1"));
String var57 = c(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var57;
if ((var42 += var14) >= var17) {
m = var18;
o = new String[27];
pb = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[11];
int var3 = 0;
String var4 = "åõà\u0007+\u0099¾ÿV\u009f\u0014»´0J\u0080)(½i\u0097\u0094N0*A¸Â\b¯t\u008d@:îêd\u00911\bÃÓYÝ.ü\u001d\u008c\u0091\u0092\\\u0087Ò\u009c\b\u00adT4º\u0088\u0089óx£í6|\u0019\u0090\u0085\u0002í";
int var5 = "åõà\u0007+\u0099¾ÿV\u009f\u0014»´0J\u0080)(½i\u0097\u0094N0*A¸Â\b¯t\u008d@:îêd\u00911\bÃÓYÝ.ü\u001d\u008c\u0091\u0092\\\u0087Ò\u009c\b\u00adT4º\u0088\u0089óx£í6|\u0019\u0090\u0085\u0002í"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var47 = var6;
var10001 = var3++;
long var61 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var65 = -1;

while (true) {
long var8 = var61;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var67 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var65) {
case 0:
var47[var10001] = var67;
if (var2 >= var5) {
W = var6;
ob = new Integer[11];
KProperty[] var39 = new KProperty[f<"k">(19403, 4727778602339330628L ^ var20)];
var39[0] = Reflection.property1(
new PropertyReference1Impl(_9.class, c<"s">(14914, 5586098537665817366L ^ var20), c<"s">(29681, 3623112063300018864L ^ var20), 0)
);
var39[1] = Reflection.property1(
new PropertyReference1Impl(_9.class, c<"s">(24316, 2043814533648748478L ^ var20), c<"s">(28552, 3666804710736314053L ^ var20), 0)
);
var39[2] = Reflection.property1(new PropertyReference1Impl(_9.class, c<"s">(16748, 4891387560495779880L ^ var20), c<"s">(3627, 821164717488725882L ^ var20), 0));
var39[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_9.class, c<"s">(1547, 5223791637848905541L ^ var20), c<"s">(14131, 282559085125002867L ^ var20), 0)
);
var39[4] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_9.class, c<"s">(15755, 691205195839859922L ^ var20), c<"s">(6829, 171271861423623166L ^ var20), 0)
);
var39[5] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(_9.class, c<"s">(9333, 5391687905780036906L ^ var20), c<"s">(14668, 7977604586242697243L ^ var20), 0)
);
n = var39;
i = new _9(var26);
c = yp.t(i, c<"s">(3420, 7219244840954649631L ^ var20), true, var22, null, null, f<"k">(15785, 6433085594801019938L ^ var20), null);
O = yp.t(i, c<"s">(7663, 1333841854452812983L ^ var20), true, var22, null, null, f<"k">(5103, 6649081278223725159L ^ var20), null);
B = yp.L(
i,
c<"s">(9032, 1797994040622182938L ^ var20),
0,
new IntRange(0, f<"k">(31497, 3186474882682673797L ^ var20)),
var24,
null,
_9::Z,
f<"k">(31181, 1703291141743564876L ^ var20),
null
);
jk var48 = i;
String var55 = c<"s">(13580, 414955321292973136L ^ var20);
class_2248[] var43 = new class_2248[3];
class_2248 var10006 = class_2246.field_10540;
Intrinsics.checkNotNullExpressionValue(class_2246.field_10540, c<"s">(1328, 3349445517965087861L ^ var20));
var43[0] = var10006;
var10006 = class_2246.field_10443;
Intrinsics.checkNotNullExpressionValue(class_2246.field_10443, c<"s">(2788, 6933023987705174946L ^ var20));
var43[1] = var10006;
var10006 = class_2246.field_22108;
Intrinsics.checkNotNullExpressionValue(class_2246.field_22108, c<"s">(19031, 5588544663858518800L ^ var20));
var43[2] = var10006;
dg var63 = new dg(CollectionsKt.mutableListOf(var43), var28);
int var10005 = f<"k">(5103, 6649081278223725159L ^ var20);
Object var34 = null;
int var35 = var10005;
Object var36 = null;
Object var37 = null;
dg var38 = var63;
y = yp.y(var48, var55, var30, var38, (h)var37, (Function0)var36, var35, var34);
S = yp.L(i, c<"s">(4182, 1226908964708827398L ^ var20), rs.OFF, null, null, f<"k">(5103, 6649081278223725159L ^ var20), null, var32);
l = yp.t(i, c<"s">(4543, 8853942321217028329L ^ var20), false, var22, null, _9::i, 4, null);
t = new bg();
F = new bg();
return;
}
break;
default:
var47[var10001] = var67;
if (var2 < var5) {
continue label36;
}

var4 = "@«¸_\u0013ÌY¨P³;\u009f\u001bÉb}";
var5 = "@«¸_\u0013ÌY¨P³;\u009f\u001bÉb}".length();
var2 = 0;
}

byte var54 = var2;
var2 += 8;
var7 = var4.substring(var54, var2).getBytes("ISO-8859-1");
var47 = var6;
var10001 = var3++;
var61 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var65 = 0;
}
}
}

var14 = var15.charAt(var42);
break;
default:
var18[var16++] = var57;
if ((var42 += var14) < var17) {
var14 = var15.charAt(var42);
continue label54;
}

var15 = "áC¨üIü·3w\u0082ç4\u009a\u0096Å&÷30þËíú= \rÊ7´Û÷\u009f_j\nÂ\u0016;Ôø]Gß:\u0082\u008e9ÿIÉó\u0089\u0089±¦;¶";
var17 = "áC¨üIü·3w\u0082ç4\u009a\u0096Å&÷30þËíú= \rÊ7´Û÷\u009f_j\nÂ\u0016;Ôø]Gß:\u0082\u008e9ÿIÉó\u0089\u0089±¦;¶".length();
var14 = 24;
var42 = -1;
}

var44 = var15.substring(++var42, var42 + var14);
var10001 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
return var0;
}

private static String c(byte[] var0) {
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

private static String c(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 11666;
if (o[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])I.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
I.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/_9", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = m[var5].getBytes("ISO-8859-1");
o[var5] = c(((Cipher)var4[0]).doFinal(var9));
}

return o[var5];
}

private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/_9" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int f(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 23885;
if (ob[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = W[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])pb.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
pb.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/_9", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
ob[var3] = var15;
}

return ob[var3];
}

private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = f(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite f(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/_9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
