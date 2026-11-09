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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1293;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_1934;
import net.minecraft.class_332;
import net.minecraft.class_634;
import net.minecraft.class_640;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.RenderNameTagEvent;
import su.catlean.gofra.Flow;

public final class ko extends _g {
@NotNull
public static final ko u;
static final KProperty[] N;
@NotNull
private static final cw m;
@NotNull
private static final cw P;
@NotNull
private static final cp y;
@NotNull
private static final cq U;
@NotNull
private static final cq n;
@NotNull
private static final cq A;
@NotNull
private static final cq K;
@NotNull
private static final cq x;
@NotNull
private static final cq t;
@NotNull
private static final cq j;
@NotNull
private static final cq I;
@NotNull
private static final cq O;
@NotNull
private static final cp S;
@NotNull
private static final cq c;
@NotNull
private static final cq e;
@NotNull
private static final cs z;
@NotNull
private static final cs b;
@NotNull
private static final cs o;
@NotNull
private static final cs Y;
@NotNull
private static final cw d;
@NotNull
private static final cw F;
@NotNull
private static final cw k;
@NotNull
private static final Map D;
@NotNull
private static final bj J;
@NotNull
private static fd X;
@NotNull
private static final ab a;
@NotNull
private static final ab l;
@NotNull
private static final Map f;
@NotNull
private static String G;
private static int[] E;
private static final long g = yz.a(-3695841417763776280L, 4059309004257792429L, MethodHandles.lookup().lookupClass()).a(90005078074973L);
private static final String[] h;
private static final String[] i;
private static final Map w = new HashMap(13);
private static final long[] B;
private static final Integer[] C;
private static final Map L;

private ko(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 95458967973398L;
super(b<"t">(8754, 1028481503618279848L ^ var1), jt.z(), null, 4, null, var3);
}

@NotNull
public final at q(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 12284422316867L;
return (at)m.E(this, var3, N[0]);
}

private final al R(short var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ g;
long var6 = var4 ^ 104533027606572L;
return (al)P.E(this, var6, N[1]);
}

private final h n(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 42040615043911L;
return (h)y.E(this, var3, N[2]);
}

private final boolean g(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 94671285752790L;
return (Boolean)U.E(this, var3, N[3]);
}

private final boolean T(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 65127695547012L;
return (Boolean)n.E(this, var3, N[4]);
}

private final boolean C(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 104408464684215L;
return (Boolean)A.E(this, var3, N[5]);
}

private final boolean I(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 122182968194715L;
return (Boolean)K.E(this, var3, N[c<"u">(17715, 6827358283901805262L ^ var1)]);
}

private final boolean L(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 120877041323551L;
return (Boolean)x.E(this, var3, N[c<"u">(12630, 1332319865276034581L ^ var1)]);
}

private final boolean v(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 25109807033819L;
return (Boolean)t.E(this, var3, N[c<"u">(3672, 4323894993673532128L ^ var1)]);
}

private final boolean K(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 103333641934968L;
return (Boolean)j.E(this, var3, N[c<"u">(13627, 8840721954746711066L ^ var1)]);
}

private final boolean M(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ g;
long var6 = var4 ^ 132433495483259L;
return (Boolean)I.E(this, var6, N[c<"u">(26137, 6884479538196730907L ^ var4)]);
}

private final boolean t(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 21049268640260L;
return (Boolean)O.E(this, var3, N[c<"u">(9997, 4525604037407370339L ^ var1)]);
}

private final h Q(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 107035510800930L;
return (h)S.E(this, var3, N[c<"u">(30766, 373320876385774373L ^ var1)]);
}

private final boolean w(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 17850237562828L;
return (Boolean)c.E(this, var3, N[c<"u">(7548, 332687016057529323L ^ var1)]);
}

private final boolean h(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ g;
long var6 = var4 ^ 68685232210301L;
return (Boolean)e.E(this, var6, N[c<"u">(13876, 173618219593229917L ^ var4)]);
}

private final Color r(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 57201348376232L;
return (Color)z.E(this, var3, N[c<"u">(23296, 5381981268639382687L ^ var1)]);
}

private final Color P(int var1, short var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ g;
long var6 = var4 ^ 90874723388890L;
return (Color)b.E(this, var6, N[c<"u">(12006, 2636110750261097027L ^ var4)]);
}

private final Color B(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 22274872803000L;
return (Color)o.E(this, var3, N[c<"u">(15566, 8738241117106508604L ^ var1)]);
}

private final Color j(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 120057496339055L;
return (Color)Y.E(this, var3, N[c<"u">(8307, 5976654593378054958L ^ var1)]);
}

private final yu Z(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 109291727334918L;
return (yu)d.E(this, var3, N[c<"u">(15243, 2798014206530503840L ^ var1)]);
}

private final m7 e(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 112904450858354L;
return (m7)F.E(this, var3, N[c<"u">(6516, 533671745816958328L ^ var1)]);
}

@NotNull
public final _j H(long var1) {
var1 = g ^ var1;
long var3 = var1 ^ 74798583686300L;
return (_j)k.E(this, var3, N[c<"u">(27584, 7914098340675165792L ^ var1)]);
}

@Flow
private final void u(RenderNameTagEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ko.g J
// 03: ldc2_w 120589302831930
// 06: lxor
// 07: lstore 2
// 08: ldc2_w 8057567392862541750
// 0b: lload 2
// 0c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11: istore 4
// 13: aload 1
// 14: iload 4
// 16: ifne 3d
// 19: invokevirtual su/catlean/api/event/events/render/RenderNameTagEvent.getState ()Lnet/minecraft/class_10017;
// 1c: instanceof net/minecraft/class_10055
// 1f: ifeq 40
// 22: goto 2f
// 25: ldc2_w 8041877943629443956
// 28: lload 2
// 29: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: athrow
// 2f: aload 1
// 30: goto 3d
// 33: ldc2_w 8041877943629443956
// 36: lload 2
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: invokevirtual su/catlean/api/event/events/render/RenderNameTagEvent.cancel ()V
// 40: return
}

@Flow
private final void K(Render2DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ko.g J
// 003: ldc2_w 80331494174643
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 128640896009531
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 62185375282976
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 29600762001843
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 105080105173852
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 8369441603530
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 119573236842476
// 030: lxor
// 031: lstore 14
// 033: dup2
// 034: ldc2_w 32492923395343
// 037: lxor
// 038: lstore 16
// 03a: dup2
// 03b: ldc2_w 72437781256775
// 03e: lxor
// 03f: dup2
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 18
// 046: dup2
// 047: bipush 16
// 049: lshl
// 04a: bipush 32
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
// 05c: ldc2_w 95541176672915
// 05f: lxor
// 060: dup2
// 061: bipush 32
// 063: lushr
// 064: l2i
// 065: istore 21
// 067: dup2
// 068: bipush 32
// 06a: lshl
// 06b: bipush 32
// 06d: lushr
// 06e: l2i
// 06f: istore 22
// 071: pop2
// 072: dup2
// 073: ldc2_w 111042296635864
// 076: lxor
// 077: lstore 23
// 079: dup2
// 07a: ldc2_w 61259556283082
// 07d: lxor
// 07e: dup2
// 07f: bipush 8
// 081: lushr
// 082: lstore 25
// 084: dup2
// 085: bipush 56
// 087: lshl
// 088: bipush 56
// 08a: lushr
// 08b: l2i
// 08c: istore 27
// 08e: pop2
// 08f: dup2
// 090: ldc2_w 28820407721185
// 093: lxor
// 094: dup2
// 095: bipush 32
// 097: lushr
// 098: l2i
// 099: istore 28
// 09b: dup2
// 09c: bipush 32
// 09e: lshl
// 09f: bipush 48
// 0a1: lushr
// 0a2: l2i
// 0a3: istore 29
// 0a5: dup2
// 0a6: bipush 48
// 0a8: lshl
// 0a9: bipush 48
// 0ab: lushr
// 0ac: l2i
// 0ad: istore 30
// 0af: pop2
// 0b0: dup2
// 0b1: ldc2_w 82913831798410
// 0b4: lxor
// 0b5: lstore 31
// 0b7: dup2
// 0b8: ldc2_w 28845783582625
// 0bb: lxor
// 0bc: lstore 33
// 0be: dup2
// 0bf: ldc2_w 78942974447454
// 0c2: lxor
// 0c3: lstore 35
// 0c5: dup2
// 0c6: ldc2_w 28531632950395
// 0c9: lxor
// 0ca: lstore 37
// 0cc: dup2
// 0cd: ldc2_w 20903020677340
// 0d0: lxor
// 0d1: lstore 39
// 0d3: dup2
// 0d4: ldc2_w 92619613920957
// 0d7: lxor
// 0d8: lstore 41
// 0da: dup2
// 0db: ldc2_w 100508531568237
// 0de: lxor
// 0df: dup2
// 0e0: bipush 32
// 0e2: lushr
// 0e3: l2i
// 0e4: istore 43
// 0e6: dup2
// 0e7: bipush 32
// 0e9: lshl
// 0ea: bipush 48
// 0ec: lushr
// 0ed: l2i
// 0ee: istore 44
// 0f0: dup2
// 0f1: bipush 48
// 0f3: lshl
// 0f4: bipush 48
// 0f6: lushr
// 0f7: l2i
// 0f8: istore 45
// 0fa: pop2
// 0fb: dup2
// 0fc: ldc2_w 125058974286028
// 0ff: lxor
// 100: dup2
// 101: bipush 32
// 103: lushr
// 104: l2i
// 105: istore 46
// 107: dup2
// 108: bipush 32
// 10a: lshl
// 10b: bipush 48
// 10d: lushr
// 10e: l2i
// 10f: istore 47
// 111: dup2
// 112: bipush 48
// 114: lshl
// 115: bipush 48
// 117: lushr
// 118: l2i
// 119: istore 48
// 11b: pop2
// 11c: dup2
// 11d: ldc2_w 125331640911302
// 120: lxor
// 121: dup2
// 122: bipush 32
// 124: lushr
// 125: lstore 49
// 127: dup2
// 128: bipush 32
// 12a: lshl
// 12b: bipush 32
// 12d: lushr
// 12e: l2i
// 12f: istore 51
// 131: pop2
// 132: dup2
// 133: ldc2_w 65804452304677
// 136: lxor
// 137: lstore 52
// 139: dup2
// 13a: ldc2_w 66430428199735
// 13d: lxor
// 13e: lstore 54
// 140: dup2
// 141: ldc2_w 122460278537925
// 144: lxor
// 145: lstore 56
// 147: dup2
// 148: ldc2_w 96682066227443
// 14b: lxor
// 14c: lstore 58
// 14e: dup2
// 14f: ldc2_w 4223349753819
// 152: lxor
// 153: lstore 60
// 155: dup2
// 156: ldc2_w 36377698900508
// 159: lxor
// 15a: lstore 62
// 15c: dup2
// 15d: ldc2_w 67934148203807
// 160: lxor
// 161: lstore 64
// 163: pop2
// 164: ldc2_w -2640483250980248769
// 167: lload 2
// 168: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16d: aload 1
// 16e: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 171: astore 72
// 173: istore 71
// 175: getstatic su/catlean/ko.X Lsu/catlean/fd;
// 178: lload 33
// 17a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 17d: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 180: instanceof net/minecraft/class_408
// 183: iload 71
// 185: ifne 1b0
// 188: ifne 1b3
// 18b: goto 198
// 18e: ldc2_w -2660684262709704707
// 191: lload 2
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: lload 33
// 19a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 19d: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 1a0: instanceof su/catlean/rl
// 1a3: goto 1b0
// 1a6: ldc2_w -2660684262709704707
// 1a9: lload 2
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: ifeq 1c1
// 1b3: fconst_1
// 1b4: goto 1c2
// 1b7: ldc2_w -2660684262709704707
// 1ba: lload 2
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: fconst_0
// 1c2: lload 39
// 1c4: dup2_x1
// 1c5: pop2
// 1c6: invokevirtual su/catlean/fd.B (JF)V
// 1c9: ldc ""
// 1cb: putstatic su/catlean/ko.G Ljava/lang/String;
// 1ce: lload 6
// 1d0: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1d3: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 1d6: dup
// 1d7: sipush 24541
// 1da: ldc2_w 2158266114657660984
// 1dd: lload 2
// 1de: lxor
// 1df: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e7: checkcast java/lang/Iterable
// 1ea: astore 74
// 1ec: bipush 0
// 1ed: istore 75
// 1ef: aload 74
// 1f1: new su/catlean/lx
// 1f4: dup
// 1f5: invokespecial su/catlean/lx.<init> ()V
// 1f8: checkcast java/util/Comparator
// 1fb: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 1fe: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 203: astore 73
// 205: aload 73
// 207: invokeinterface java/util/Iterator.hasNext ()Z 1
// 20c: ifeq 82e
// 20f: aload 73
// 211: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 216: checkcast net/minecraft/class_742
// 219: astore 74
// 21b: aload 74
// 21d: lload 33
// 21f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 222: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 225: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 228: iload 71
// 22a: ifne 834
// 22d: iload 71
// 22f: ifne 26a
// 232: goto 23f
// 235: ldc2_w -2660684262709704707
// 238: lload 2
// 239: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23e: athrow
// 23f: ifeq 27f
// 242: goto 24f
// 245: ldc2_w -2660684262709704707
// 248: lload 2
// 249: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24e: athrow
// 24f: lload 33
// 251: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 254: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 257: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
// 25a: invokevirtual net/minecraft/class_5498.method_31034 ()Z
// 25d: goto 26a
// 260: ldc2_w -2660684262709704707
// 263: lload 2
// 264: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: athrow
// 26a: ifeq 27f
// 26d: iload 71
// 26f: ifeq 205
// 272: goto 27f
// 275: ldc2_w -2660684262709704707
// 278: lload 2
// 279: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27e: athrow
// 27f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 282: aload 74
// 284: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 287: aload 74
// 289: checkcast net/minecraft/class_1297
// 28c: aload 0
// 28d: lload 56
// 28f: invokespecial su/catlean/ko.e (J)Lsu/catlean/m7;
// 292: getstatic su/catlean/m7.Number Lsu/catlean/m7;
// 295: if_acmpne 2a7
// 298: ldc 0.4
// 29a: goto 2a9
// 29d: ldc2_w -2660684262709704707
// 2a0: lload 2
// 2a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a6: athrow
// 2a7: ldc 0.55
// 2a9: fstore 66
// 2ab: astore 67
// 2ad: iload 18
// 2af: i2s
// 2b0: iload 19
// 2b2: aload 67
// 2b4: fload 66
// 2b6: iload 20
// 2b8: invokevirtual su/catlean/jl.t (SILnet/minecraft/class_1297;FI)Lorg/joml/Vector4d;
// 2bb: astore 75
// 2bd: aload 75
// 2bf: ifnull 205
// 2c2: aload 0
// 2c3: lload 35
// 2c5: aload 74
// 2c7: checkcast net/minecraft/class_1657
// 2ca: invokespecial su/catlean/ko.c (JLnet/minecraft/class_1657;)Ljava/lang/String;
// 2cd: astore 76
// 2cf: lload 58
// 2d1: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 2d4: lload 31
// 2d6: aload 76
// 2d8: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 2db: fstore 77
// 2dd: aload 75
// 2df: getfield org/joml/Vector4d.x D
// 2e2: aload 75
// 2e4: getfield org/joml/Vector4d.z D
// 2e7: aload 75
// 2e9: getfield org/joml/Vector4d.x D
// 2ec: dsub
// 2ed: d2f
// 2ee: fconst_2
// 2ef: fdiv
// 2f0: f2d
// 2f1: dadd
// 2f2: fload 77
// 2f4: fconst_2
// 2f5: fdiv
// 2f6: f2d
// 2f7: dsub
// 2f8: d2f
// 2f9: fstore 78
// 2fb: fload 78
// 2fd: iload 71
// 2ff: ifne 33e
// 302: invokestatic java/lang/Float.isNaN (F)Z
// 305: ifeq 327
// 308: goto 315
// 30b: ldc2_w -2660684262709704707
// 30e: lload 2
// 30f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 314: athrow
// 315: iload 71
// 317: ifeq 205
// 31a: goto 327
// 31d: ldc2_w -2660684262709704707
// 320: lload 2
// 321: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 326: athrow
// 327: aload 0
// 328: aload 74
// 32a: checkcast net/minecraft/class_1657
// 32d: aload 72
// 32f: aload 75
// 331: getfield org/joml/Vector4d.x D
// 334: aload 75
// 336: getfield org/joml/Vector4d.y D
// 339: lload 4
// 33b: invokespecial su/catlean/ko.j (Lnet/minecraft/class_1657;Lnet/minecraft/class_332;DDJ)F
// 33e: fstore 79
// 340: bipush 0
// 341: istore 80
// 343: fload 78
// 345: bipush 2
// 346: i2f
// 347: fsub
// 348: fstore 81
// 34a: fload 78
// 34c: bipush 2
// 34d: i2f
// 34e: fsub
// 34f: fload 77
// 351: fadd
// 352: bipush 4
// 353: i2f
// 354: fadd
// 355: fstore 82
// 357: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 35a: invokevirtual su/catlean/w8.H ()F
// 35d: fstore 83
// 35f: fload 81
// 361: fload 83
// 363: fcmpg
// 364: iload 71
// 366: ifne 38b
// 369: ifgt 3b2
// 36c: goto 379
// 36f: ldc2_w -2660684262709704707
// 372: lload 2
// 373: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 378: athrow
// 379: fload 83
// 37b: fload 82
// 37d: fcmpg
// 37e: goto 38b
// 381: ldc2_w -2660684262709704707
// 384: lload 2
// 385: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38a: athrow
// 38b: iload 71
// 38d: ifne 3af
// 390: ifgt 3ae
// 393: goto 3a0
// 396: ldc2_w -2660684262709704707
// 399: lload 2
// 39a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39f: athrow
// 3a0: bipush 1
// 3a1: goto 3b3
// 3a4: ldc2_w -2660684262709704707
// 3a7: lload 2
// 3a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ad: athrow
// 3ae: bipush 0
// 3af: goto 3b3
// 3b2: bipush 0
// 3b3: ifeq 473
// 3b6: aload 75
// 3b8: getfield org/joml/Vector4d.y D
// 3bb: ldc 13.0
// 3bd: f2d
// 3be: dsub
// 3bf: d2f
// 3c0: fstore 81
// 3c2: aload 75
// 3c4: getfield org/joml/Vector4d.y D
// 3c7: ldc 13.0
// 3c9: f2d
// 3ca: dsub
// 3cb: d2f
// 3cc: sipush 15860
// 3cf: ldc2_w 8866616843476433448
// 3d2: lload 2
// 3d3: lxor
// 3d4: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: i2f
// 3da: fadd
// 3db: fstore 82
// 3dd: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 3e0: invokevirtual su/catlean/w8.u ()F
// 3e3: fstore 83
// 3e5: fload 81
// 3e7: fload 83
// 3e9: fcmpg
// 3ea: iload 71
// 3ec: ifne 411
// 3ef: ifgt 438
// 3f2: goto 3ff
// 3f5: ldc2_w -2660684262709704707
// 3f8: lload 2
// 3f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fe: athrow
// 3ff: fload 83
// 401: fload 82
// 403: fcmpg
// 404: goto 411
// 407: ldc2_w -2660684262709704707
// 40a: lload 2
// 40b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 410: athrow
// 411: iload 71
// 413: ifne 435
// 416: ifgt 434
// 419: goto 426
// 41c: ldc2_w -2660684262709704707
// 41f: lload 2
// 420: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 425: athrow
// 426: bipush 1
// 427: goto 439
// 42a: ldc2_w -2660684262709704707
// 42d: lload 2
// 42e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 433: athrow
// 434: bipush 0
// 435: goto 439
// 438: bipush 0
// 439: ifeq 473
// 43c: lload 33
// 43e: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 441: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 444: ifnull 473
// 447: goto 454
// 44a: ldc2_w -2660684262709704707
// 44d: lload 2
// 44e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 453: athrow
// 454: aload 74
// 456: invokevirtual net/minecraft/class_742.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 459: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 45c: dup
// 45d: sipush 9972
// 460: ldc2_w 4303609293881198877
// 463: lload 2
// 464: lxor
// 465: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 46d: putstatic su/catlean/ko.G Ljava/lang/String;
// 470: bipush 1
// 471: istore 80
// 473: aload 74
// 475: checkcast net/minecraft/class_1657
// 478: lload 52
// 47a: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 47d: ifeq 4db
// 480: getstatic su/catlean/ko.l Lsu/catlean/ab;
// 483: aload 1
// 484: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 487: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 48a: dup
// 48b: sipush 28122
// 48e: ldc2_w 3752197730825994800
// 491: lload 2
// 492: lxor
// 493: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 498: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 49b: fload 78
// 49d: bipush 2
// 49e: i2f
// 49f: fsub
// 4a0: aload 75
// 4a2: getfield org/joml/Vector4d.y D
// 4a5: ldc 13.0
// 4a7: f2d
// 4a8: dsub
// 4a9: d2f
// 4aa: fload 77
// 4ac: bipush 4
// 4ad: i2f
// 4ae: fadd
// 4af: ldc 12.0
// 4b1: iload 80
// 4b3: ifeq 4d2
// 4b6: goto 4c3
// 4b9: ldc2_w -2660684262709704707
// 4bc: lload 2
// 4bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c2: athrow
// 4c3: ldc 0.5
// 4c5: goto 4d3
// 4c8: ldc2_w -2660684262709704707
// 4cb: lload 2
// 4cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d1: athrow
// 4d2: fconst_1
// 4d3: invokevirtual su/catlean/ab.K (Lorg/joml/Matrix3x2fStack;FFFFF)V
// 4d6: iload 71
// 4d8: ifeq 531
// 4db: getstatic su/catlean/ko.a Lsu/catlean/ab;
// 4de: aload 1
// 4df: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 4e2: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4e5: dup
// 4e6: sipush 28122
// 4e9: ldc2_w 3752197730825994800
// 4ec: lload 2
// 4ed: lxor
// 4ee: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4f6: fload 78
// 4f8: bipush 2
// 4f9: i2f
// 4fa: fsub
// 4fb: aload 75
// 4fd: getfield org/joml/Vector4d.y D
// 500: ldc 13.0
// 502: f2d
// 503: dsub
// 504: d2f
// 505: fload 77
// 507: bipush 4
// 508: i2f
// 509: fadd
// 50a: ldc 12.0
// 50c: iload 80
// 50e: ifeq 52d
// 511: goto 51e
// 514: ldc2_w -2660684262709704707
// 517: lload 2
// 518: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51d: athrow
// 51e: ldc 0.5
// 520: goto 52e
// 523: ldc2_w -2660684262709704707
// 526: lload 2
// 527: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52c: athrow
// 52d: fconst_1
// 52e: invokevirtual su/catlean/ab.K (Lorg/joml/Matrix3x2fStack;FFFFF)V
// 531: lload 58
// 533: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 536: aload 72
// 538: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 53b: dup
// 53c: sipush 28122
// 53f: ldc2_w 3752197730825994800
// 542: lload 2
// 543: lxor
// 544: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 549: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 54c: aload 76
// 54e: fload 78
// 550: aload 75
// 552: getfield org/joml/Vector4d.y D
// 555: d2f
// 556: ldc 13.0
// 558: fsub
// 559: new java/awt/Color
// 55c: dup
// 55d: bipush -1
// 55e: invokespecial java/awt/Color.<init> (I)V
// 561: bipush 0
// 562: bipush 0
// 563: sipush 5172
// 566: ldc2_w 1931115879661065099
// 569: lload 2
// 56a: lxor
// 56b: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 570: aconst_null
// 571: astore 66
// 573: istore 67
// 575: istore 68
// 577: istore 69
// 579: astore 70
// 57b: lload 10
// 57d: aload 70
// 57f: iload 69
// 581: iload 68
// 583: iload 67
// 585: aload 66
// 587: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 58a: aload 0
// 58b: iload 71
// 58d: ifne 5fa
// 590: lload 56
// 592: invokespecial su/catlean/ko.e (J)Lsu/catlean/m7;
// 595: getstatic su/catlean/m7.Number Lsu/catlean/m7;
// 598: if_acmpeq 5f9
// 59b: goto 5a8
// 59e: ldc2_w -2660684262709704707
// 5a1: lload 2
// 5a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a7: athrow
// 5a8: aload 72
// 5aa: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 5ad: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 5b0: pop
// 5b1: aload 0
// 5b2: aload 75
// 5b4: getfield org/joml/Vector4d.x D
// 5b7: lload 14
// 5b9: dup2_x2
// 5ba: pop2
// 5bb: aload 75
// 5bd: getfield org/joml/Vector4d.y D
// 5c0: aload 72
// 5c2: aload 74
// 5c4: checkcast net/minecraft/class_1657
// 5c7: aload 74
// 5c9: getstatic net/minecraft/class_5134.field_23716 Lnet/minecraft/class_6880;
// 5cc: invokevirtual net/minecraft/class_742.method_45325 (Lnet/minecraft/class_6880;)D
// 5cf: d2f
// 5d0: aload 74
// 5d2: invokevirtual net/minecraft/class_742.method_6032 ()F
// 5d5: invokestatic net/minecraft/class_3532.method_15386 (F)I
// 5d8: aload 74
// 5da: invokevirtual net/minecraft/class_742.method_6067 ()F
// 5dd: invokestatic net/minecraft/class_3532.method_15386 (F)I
// 5e0: invokespecial su/catlean/ko.v (JDDLnet/minecraft/class_332;Lnet/minecraft/class_1657;FII)V
// 5e3: aload 72
// 5e5: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 5e8: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 5eb: pop
// 5ec: goto 5f9
// 5ef: ldc2_w -2660684262709704707
// 5f2: lload 2
// 5f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f8: athrow
// 5f9: aload 0
// 5fa: iload 46
// 5fc: iload 47
// 5fe: i2s
// 5ff: iload 48
// 601: i2c
// 602: invokespecial su/catlean/ko.M (ISC)Z
// 605: ifeq 639
// 608: fload 79
// 60a: aload 0
// 60b: lload 41
// 60d: aload 72
// 60f: aload 75
// 611: getfield org/joml/Vector4d.x D
// 614: d2f
// 615: aload 75
// 617: getfield org/joml/Vector4d.y D
// 61a: fload 79
// 61c: f2d
// 61d: dadd
// 61e: sipush 3377
// 621: ldc2_w 5632523531945069223
// 624: lload 2
// 625: lxor
// 626: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62b: i2d
// 62c: dsub
// 62d: d2f
// 62e: aload 74
// 630: checkcast net/minecraft/class_1657
// 633: invokespecial su/catlean/ko.q (JLnet/minecraft/class_332;FFLnet/minecraft/class_1657;)F
// 636: fsub
// 637: fstore 79
// 639: aload 74
// 63b: invokevirtual net/minecraft/class_742.method_6047 ()Lnet/minecraft/class_1799;
// 63e: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 641: dup
// 642: sipush 24467
// 645: ldc2_w 4017366767107813451
// 648: lload 2
// 649: lxor
// 64a: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 652: astore 81
// 654: aload 0
// 655: lload 8
// 657: invokespecial su/catlean/ko.t (J)Z
// 65a: iload 71
// 65c: ifne 756
// 65f: ifeq 74b
// 662: goto 66f
// 665: ldc2_w -2660684262709704707
// 668: lload 2
// 669: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66e: athrow
// 66f: lload 33
// 671: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 674: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 677: iload 71
// 679: ifne 753
// 67c: goto 689
// 67f: ldc2_w -2660684262709704707
// 682: lload 2
// 683: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 688: athrow
// 689: ifnonnull 74b
// 68c: goto 699
// 68f: ldc2_w -2660684262709704707
// 692: lload 2
// 693: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 698: athrow
// 699: aload 72
// 69b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 69e: aload 75
// 6a0: getfield org/joml/Vector4d.x D
// 6a3: d2f
// 6a4: ldc 97.0
// 6a6: fsub
// 6a7: aload 75
// 6a9: getfield org/joml/Vector4d.y D
// 6ac: d2f
// 6ad: fload 79
// 6af: fadd
// 6b0: ldc 20.0
// 6b2: fsub
// 6b3: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 6b6: pop
// 6b7: aload 0
// 6b8: aload 72
// 6ba: aload 81
// 6bc: instanceof net/minecraft/class_1747
// 6bf: iload 71
// 6c1: ifne 6f9
// 6c4: goto 6d1
// 6c7: ldc2_w -2660684262709704707
// 6ca: lload 2
// 6cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d0: athrow
// 6d1: ifeq 70e
// 6d4: goto 6e1
// 6d7: ldc2_w -2660684262709704707
// 6da: lload 2
// 6db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e0: athrow
// 6e1: aload 81
// 6e3: checkcast net/minecraft/class_1747
// 6e6: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
// 6e9: instanceof net/minecraft/class_2480
// 6ec: goto 6f9
// 6ef: ldc2_w -2660684262709704707
// 6f2: lload 2
// 6f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f8: athrow
// 6f9: ifeq 70e
// 6fc: aload 74
// 6fe: invokevirtual net/minecraft/class_742.method_6047 ()Lnet/minecraft/class_1799;
// 701: goto 713
// 704: ldc2_w -2660684262709704707
// 707: lload 2
// 708: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70d: athrow
// 70e: aload 74
// 710: invokevirtual net/minecraft/class_742.method_6079 ()Lnet/minecraft/class_1799;
// 713: astore 82
// 715: aload 82
// 717: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 71a: aload 82
// 71c: astore 66
// 71e: astore 67
// 720: lload 49
// 722: aload 67
// 724: iload 51
// 726: aload 66
// 728: invokespecial su/catlean/ko.J (JLnet/minecraft/class_332;ILnet/minecraft/class_1799;)V
// 72b: aload 72
// 72d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 730: aload 75
// 732: getfield org/joml/Vector4d.x D
// 735: d2f
// 736: ldc 97.0
// 738: fsub
// 739: fneg
// 73a: aload 75
// 73c: getfield org/joml/Vector4d.y D
// 73f: d2f
// 740: fload 79
// 742: fadd
// 743: ldc 20.0
// 745: fsub
// 746: fneg
// 747: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 74a: pop
// 74b: lload 33
// 74d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 750: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 753: instanceof net/minecraft/class_408
// 756: iload 71
// 758: ifne 783
// 75b: ifne 7ca
// 75e: goto 76b
// 761: ldc2_w -2660684262709704707
// 764: lload 2
// 765: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 76a: athrow
// 76b: lload 33
// 76d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 770: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 773: instanceof su/catlean/rl
// 776: goto 783
// 779: ldc2_w -2660684262709704707
// 77c: lload 2
// 77d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 782: athrow
// 783: iload 71
// 785: ifne 7ad
// 788: ifne 7ca
// 78b: goto 798
// 78e: ldc2_w -2660684262709704707
// 791: lload 2
// 792: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 797: athrow
// 798: getstatic su/catlean/ko.X Lsu/catlean/fd;
// 79b: invokevirtual su/catlean/fd.a ()F
// 79e: fconst_0
// 79f: fcmpg
// 7a0: goto 7ad
// 7a3: ldc2_w -2660684262709704707
// 7a6: lload 2
// 7a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ac: athrow
// 7ad: iload 71
// 7af: ifne 7c3
// 7b2: ifne 7c6
// 7b5: goto 7c2
// 7b8: ldc2_w -2660684262709704707
// 7bb: lload 2
// 7bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c1: athrow
// 7c2: bipush 1
// 7c3: goto 7c7
// 7c6: bipush 0
// 7c7: ifne 820
// 7ca: getstatic su/catlean/ko.J Lsu/catlean/bj;
// 7cd: aload 72
// 7cf: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 7d2: dup
// 7d3: sipush 28122
// 7d6: ldc2_w 3752197730825994800
// 7d9: lload 2
// 7da: lxor
// 7db: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7e3: checkcast org/joml/Matrix3x2f
// 7e6: fload 78
// 7e8: f2d
// 7e9: ldc2_w 18.0
// 7ec: dsub
// 7ed: aload 75
// 7ef: getfield org/joml/Vector4d.y D
// 7f2: ldc2_w 16.0
// 7f5: dsub
// 7f6: fconst_0
// 7f7: fconst_0
// 7f8: aconst_null
// 7f9: aconst_null
// 7fa: getstatic su/catlean/ko.X Lsu/catlean/fd;
// 7fd: invokevirtual su/catlean/fd.a ()F
// 800: sipush 2217
// 803: ldc2_w 1815098799749844747
// 806: lload 2
// 807: lxor
// 808: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 80d: lload 62
// 80f: aconst_null
// 810: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 813: goto 820
// 816: ldc2_w -2660684262709704707
// 819: lload 2
// 81a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81f: athrow
// 820: aload 72
// 822: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 825: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 828: pop
// 829: iload 71
// 82b: ifeq 205
// 82e: aload 0
// 82f: lload 37
// 831: invokespecial su/catlean/ko.w (J)Z
// 834: iload 71
// 836: ifne 879
// 839: ifeq 85e
// 83c: goto 849
// 83f: ldc2_w -2660684262709704707
// 842: lload 2
// 843: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 848: athrow
// 849: aload 0
// 84a: lload 12
// 84c: aload 72
// 84e: invokespecial su/catlean/ko.B (JLnet/minecraft/class_332;)V
// 851: goto 85e
// 854: ldc2_w -2660684262709704707
// 857: lload 2
// 858: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 85d: athrow
// 85e: aload 0
// 85f: iload 71
// 861: ifne 87d
// 864: lload 25
// 866: iload 27
// 868: i2b
// 869: invokespecial su/catlean/ko.h (JB)Z
// 86c: goto 879
// 86f: ldc2_w -2660684262709704707
// 872: lload 2
// 873: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 878: athrow
// 879: ifeq 884
// 87c: aload 0
// 87d: lload 54
// 87f: aload 72
// 881: invokespecial su/catlean/ko.j (JLnet/minecraft/class_332;)V
// 884: getstatic su/catlean/ko.a Lsu/catlean/ab;
// 887: aload 72
// 889: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 88c: dup
// 88d: sipush 28122
// 890: ldc2_w 3752197730825994800
// 893: lload 2
// 894: lxor
// 895: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 89d: aload 0
// 89e: lload 64
// 8a0: invokespecial su/catlean/ko.r (J)Ljava/awt/Color;
// 8a3: aload 0
// 8a4: iload 43
// 8a6: iload 44
// 8a8: i2s
// 8a9: iload 45
// 8ab: i2s
// 8ac: invokespecial su/catlean/ko.P (ISS)Ljava/awt/Color;
// 8af: iload 21
// 8b1: swap
// 8b2: iload 22
// 8b4: bipush 1
// 8b5: invokevirtual su/catlean/ab.w (Lorg/joml/Matrix3x2fStack;Ljava/awt/Color;ILjava/awt/Color;IZ)V
// 8b8: getstatic su/catlean/ko.l Lsu/catlean/ab;
// 8bb: aload 72
// 8bd: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 8c0: dup
// 8c1: sipush 28122
// 8c4: ldc2_w 3752197730825994800
// 8c7: lload 2
// 8c8: lxor
// 8c9: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8ce: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 8d1: aload 0
// 8d2: lload 16
// 8d4: invokespecial su/catlean/ko.B (J)Ljava/awt/Color;
// 8d7: aload 0
// 8d8: lload 23
// 8da: invokespecial su/catlean/ko.j (J)Ljava/awt/Color;
// 8dd: iload 21
// 8df: swap
// 8e0: iload 22
// 8e2: bipush 1
// 8e3: invokevirtual su/catlean/ab.w (Lorg/joml/Matrix3x2fStack;Ljava/awt/Color;ILjava/awt/Color;IZ)V
// 8e6: lload 58
// 8e8: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 8eb: iload 28
// 8ed: iload 29
// 8ef: i2c
// 8f0: iload 30
// 8f2: i2s
// 8f3: invokevirtual su/catlean/c6.g (ICS)V
// 8f6: lload 60
// 8f8: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 8fb: iload 28
// 8fd: iload 29
// 8ff: i2c
// 900: iload 30
// 902: i2s
// 903: invokevirtual su/catlean/c6.g (ICS)V
// 906: return
}

@Flow
private final void l(InputEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ko.g J
// 003: ldc2_w 72989881740599
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 19043003827493
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 137924300778085
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 64344161890834
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 25371190359660
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 99237812430096
// 029: lxor
// 02a: dup2
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 12
// 031: dup2
// 032: bipush 32
// 034: lshl
// 035: bipush 48
// 037: lushr
// 038: l2i
// 039: istore 13
// 03b: dup2
// 03c: bipush 48
// 03e: lshl
// 03f: bipush 48
// 041: lushr
// 042: l2i
// 043: istore 14
// 045: pop2
// 046: dup2
// 047: ldc2_w 49087180584218
// 04a: lxor
// 04b: dup2
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 15
// 052: dup2
// 053: bipush 16
// 055: lshl
// 056: bipush 32
// 058: lushr
// 059: l2i
// 05a: istore 16
// 05c: dup2
// 05d: bipush 48
// 05f: lshl
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 17
// 066: pop2
// 067: pop2
// 068: ldc2_w 6425180028596572453
// 06b: lload 2
// 06c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: istore 18
// 073: getstatic su/catlean/ko.G Ljava/lang/String;
// 076: checkcast java/lang/CharSequence
// 079: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
// 07c: iload 18
// 07e: ifeq 092
// 081: ifne 095
// 084: goto 091
// 087: ldc2_w 6455719504182953337
// 08a: lload 2
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: bipush 1
// 092: goto 096
// 095: bipush 0
// 096: ifeq 1d8
// 099: lload 4
// 09b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 09e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0a1: instanceof net/minecraft/class_408
// 0a4: ifeq 1d8
// 0a7: goto 0b4
// 0aa: ldc2_w 6455719504182953337
// 0ad: lload 2
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: aload 1
// 0b5: iload 18
// 0b7: ifeq 0eb
// 0ba: goto 0c7
// 0bd: ldc2_w 6455719504182953337
// 0c0: lload 2
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: invokevirtual su/catlean/api/event/events/client/InputEvent.getAction ()Lsu/catlean/api/event/events/client/InputEvent$Action;
// 0ca: getstatic su/catlean/api/event/events/client/InputEvent$Action.Press Lsu/catlean/api/event/events/client/InputEvent$Action;
// 0cd: if_acmpne 1d8
// 0d0: goto 0dd
// 0d3: ldc2_w 6455719504182953337
// 0d6: lload 2
// 0d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: athrow
// 0dd: aload 1
// 0de: goto 0eb
// 0e1: ldc2_w 6455719504182953337
// 0e4: lload 2
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: invokevirtual su/catlean/api/event/events/client/InputEvent.getDevice ()Lsu/catlean/api/event/events/client/InputEvent$Device;
// 0ee: getstatic su/catlean/api/event/events/client/InputEvent$Device.Mouse Lsu/catlean/api/event/events/client/InputEvent$Device;
// 0f1: if_acmpne 1d8
// 0f4: getstatic su/catlean/c7.b Lsu/catlean/c7;
// 0f7: lload 6
// 0f9: getstatic su/catlean/ko.G Ljava/lang/String;
// 0fc: invokevirtual su/catlean/c7.Y (JLjava/lang/String;)Z
// 0ff: iload 18
// 101: ifeq 19a
// 104: goto 111
// 107: ldc2_w 6455719504182953337
// 10a: lload 2
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: ifeq 17c
// 114: goto 121
// 117: ldc2_w 6455719504182953337
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: getstatic su/catlean/c7.b Lsu/catlean/c7;
// 124: lload 8
// 126: getstatic su/catlean/ko.G Ljava/lang/String;
// 129: invokevirtual su/catlean/c7.j (JLjava/lang/String;)Z
// 12c: pop
// 12d: aload 0
// 12e: checkcast su/catlean/_g
// 131: getstatic net/minecraft/class_124.field_1061 Lnet/minecraft/class_124;
// 134: getstatic su/catlean/ko.G Ljava/lang/String;
// 137: getstatic net/minecraft/class_124.field_1080 Lnet/minecraft/class_124;
// 13a: iload 12
// 13c: aload 0
// 13d: checkcast su/catlean/_g
// 140: sipush 31872
// 143: ldc2_w 4271044210682237341
// 146: lload 2
// 147: lxor
// 148: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: bipush 0
// 14e: anewarray 520
// 151: iload 13
// 153: i2c
// 154: bipush 0
// 155: bipush 4
// 156: aconst_null
// 157: iload 14
// 159: i2s
// 15a: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 15d: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001 \u0001" ]
// 162: bipush 0
// 163: bipush 2
// 164: aconst_null
// 165: lload 10
// 167: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 16a: iload 18
// 16c: ifne 1d8
// 16f: goto 17c
// 172: ldc2_w 6455719504182953337
// 175: lload 2
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: getstatic su/catlean/c7.b Lsu/catlean/c7;
// 17f: iload 15
// 181: i2c
// 182: iload 16
// 184: iload 17
// 186: i2s
// 187: getstatic su/catlean/ko.G Ljava/lang/String;
// 18a: invokevirtual su/catlean/c7.h (CISLjava/lang/String;)Z
// 18d: goto 19a
// 190: ldc2_w 6455719504182953337
// 193: lload 2
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: pop
// 19b: aload 0
// 19c: checkcast su/catlean/_g
// 19f: getstatic net/minecraft/class_124.field_1060 Lnet/minecraft/class_124;
// 1a2: getstatic su/catlean/ko.G Ljava/lang/String;
// 1a5: getstatic net/minecraft/class_124.field_1080 Lnet/minecraft/class_124;
// 1a8: iload 12
// 1aa: aload 0
// 1ab: checkcast su/catlean/_g
// 1ae: sipush 21850
// 1b1: ldc2_w 2757146768669063218
// 1b4: lload 2
// 1b5: lxor
// 1b6: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: bipush 0
// 1bc: anewarray 520
// 1bf: iload 13
// 1c1: i2c
// 1c2: bipush 0
// 1c3: bipush 4
// 1c4: aconst_null
// 1c5: iload 14
// 1c7: i2s
// 1c8: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 1cb: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001 \u0001" ]
// 1d0: bipush 0
// 1d1: bipush 2
// 1d2: aconst_null
// 1d3: lload 10
// 1d5: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 1d8: return
}

private final float j(class_1657 param1, class_332 param2, double param3, double param5, long param7) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ko.g J
// 003: lload 7
// 005: lxor
// 006: lstore 7
// 008: lload 7
// 00a: dup2
// 00b: ldc2_w 35328856258497
// 00e: lxor
// 00f: lstore 9
// 011: dup2
// 012: ldc2_w 88737901886929
// 015: lxor
// 016: lstore 11
// 018: dup2
// 019: ldc2_w 40702409702924
// 01c: lxor
// 01d: lstore 13
// 01f: dup2
// 020: ldc2_w 2830995179328
// 023: lxor
// 024: lstore 15
// 026: dup2
// 027: ldc2_w 63543470815163
// 02a: lxor
// 02b: lstore 17
// 02d: dup2
// 02e: ldc2_w 111653363774268
// 031: lxor
// 032: lstore 19
// 034: dup2
// 035: ldc2_w 121125267721135
// 038: lxor
// 039: lstore 21
// 03b: dup2
// 03c: ldc2_w 91156320421106
// 03f: lxor
// 040: lstore 23
// 042: pop2
// 043: new java/util/ArrayList
// 046: dup
// 047: invokespecial java/util/ArrayList.<init> ()V
// 04a: astore 31
// 04c: ldc2_w -6066662875748293695
// 04f: lload 7
// 051: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: fconst_0
// 057: fstore 32
// 059: istore 30
// 05b: aload 0
// 05c: lload 11
// 05e: invokespecial su/catlean/ko.Z (J)Lsu/catlean/yu;
// 061: getstatic su/catlean/yu.Durability Lsu/catlean/yu;
// 064: iload 30
// 066: ifeq 0f6
// 069: if_acmpeq 092
// 06c: goto 07a
// 06f: ldc2_w -6092416061457221731
// 072: lload 7
// 074: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: athrow
// 07a: aload 31
// 07c: aload 1
// 07d: invokevirtual net/minecraft/class_1657.method_6079 ()Lnet/minecraft/class_1799;
// 080: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 083: pop
// 084: goto 092
// 087: ldc2_w -6092416061457221731
// 08a: lload 7
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: aload 31
// 094: aload 1
// 095: lload 23
// 097: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 09a: bipush 0
// 09b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 0a0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 0a3: pop
// 0a4: aload 31
// 0a6: aload 1
// 0a7: lload 23
// 0a9: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 0ac: bipush 1
// 0ad: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 0b2: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 0b5: pop
// 0b6: aload 31
// 0b8: aload 1
// 0b9: lload 23
// 0bb: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 0be: bipush 2
// 0bf: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 0c4: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 0c7: pop
// 0c8: aload 31
// 0ca: aload 1
// 0cb: lload 23
// 0cd: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 0d0: bipush 3
// 0d1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 0d6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 0d9: pop
// 0da: iload 30
// 0dc: ifeq 119
// 0df: aload 0
// 0e0: lload 11
// 0e2: invokespecial su/catlean/ko.Z (J)Lsu/catlean/yu;
// 0e5: getstatic su/catlean/yu.Durability Lsu/catlean/yu;
// 0e8: goto 0f6
// 0eb: ldc2_w -6092416061457221731
// 0ee: lload 7
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: if_acmpeq 111
// 0f9: aload 31
// 0fb: aload 1
// 0fc: invokevirtual net/minecraft/class_1657.method_6047 ()Lnet/minecraft/class_1799;
// 0ff: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 102: pop
// 103: goto 111
// 106: ldc2_w -6092416061457221731
// 109: lload 7
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: aload 2
// 112: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 115: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 118: pop
// 119: fconst_0
// 11a: fstore 33
// 11c: aload 0
// 11d: lload 11
// 11f: invokespecial su/catlean/ko.Z (J)Lsu/catlean/yu;
// 122: getstatic su/catlean/yu.None Lsu/catlean/yu;
// 125: if_acmpeq 555
// 128: aload 31
// 12a: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
// 12d: dup
// 12e: sipush 24731
// 131: ldc2_w 9151941458305023788
// 134: lload 7
// 136: lxor
// 137: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 13f: astore 34
// 141: aload 34
// 143: invokeinterface java/util/Iterator.hasNext ()Z 1
// 148: ifeq 555
// 14b: aload 34
// 14d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 152: checkcast net/minecraft/class_1799
// 155: astore 35
// 157: iload 30
// 159: lload 7
// 15b: lconst_0
// 15c: lcmp
// 15d: iflt 168
// 160: ifeq 550
// 163: aload 35
// 165: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 168: ifne 542
// 16b: goto 179
// 16e: ldc2_w -6092416061457221731
// 171: lload 7
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: aload 0
// 17a: lload 11
// 17c: invokespecial su/catlean/ko.Z (J)Lsu/catlean/yu;
// 17f: getstatic su/catlean/yu.Full Lsu/catlean/yu;
// 182: if_acmpne 1f0
// 185: goto 193
// 188: ldc2_w -6092416061457221731
// 18b: lload 7
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: aload 2
// 194: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 197: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 19a: pop
// 19b: aload 2
// 19c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 19f: dload 3
// 1a0: d2f
// 1a1: ldc 55.0
// 1a3: fsub
// 1a4: fload 33
// 1a6: fadd
// 1a7: dload 5
// 1a9: d2f
// 1aa: ldc 33.0
// 1ac: fsub
// 1ad: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 1b0: pop
// 1b1: aload 2
// 1b2: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1b5: ldc 1.1
// 1b7: ldc 1.1
// 1b9: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 1bc: pop
// 1bd: aload 2
// 1be: aload 35
// 1c0: bipush 0
// 1c1: bipush 0
// 1c2: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 1c5: aload 2
// 1c6: lload 9
// 1c8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1cb: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
// 1ce: aload 35
// 1d0: bipush 0
// 1d1: bipush 0
// 1d2: invokevirtual net/minecraft/class_332.method_51431 (Lnet/minecraft/class_327;Lnet/minecraft/class_1799;II)V
// 1d5: aload 2
// 1d6: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1d9: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 1dc: pop
// 1dd: iload 30
// 1df: ifne 326
// 1e2: goto 1f0
// 1e5: ldc2_w -6092416061457221731
// 1e8: lload 7
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: aload 35
// 1f2: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 1f5: aload 35
// 1f7: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 1fa: isub
// 1fb: i2f
// 1fc: fstore 36
// 1fe: fload 36
// 200: aload 35
// 202: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 205: i2f
// 206: fdiv
// 207: ldc 100.0
// 209: fmul
// 20a: f2i
// 20b: istore 37
// 20d: iload 37
// 20f: sipush 9679
// 212: ldc2_w 3429797458483909145
// 215: lload 7
// 217: lxor
// 218: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: iload 30
// 21f: lload 7
// 221: lconst_0
// 222: lcmp
// 223: ifle 264
// 226: ifeq 25b
// 229: if_icmpge 24b
// 22c: goto 23a
// 22f: ldc2_w -6092416061457221731
// 232: lload 7
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: getstatic java/awt/Color.RED Ljava/awt/Color;
// 23d: goto 2d7
// 240: ldc2_w -6092416061457221731
// 243: lload 7
// 245: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: athrow
// 24b: sipush 16278
// 24e: ldc2_w 6776555615931009027
// 251: lload 7
// 253: lxor
// 254: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 259: iload 37
// 25b: lload 7
// 25d: lconst_0
// 25e: lcmp
// 25f: iflt 2a9
// 262: iload 30
// 264: ifeq 2a9
// 267: if_icmpgt 2bf
// 26a: goto 278
// 26d: ldc2_w -6092416061457221731
// 270: lload 7
// 272: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: athrow
// 278: iload 37
// 27a: iload 30
// 27c: ifeq 2bc
// 27f: goto 28d
// 282: ldc2_w -6092416061457221731
// 285: lload 7
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: sipush 23829
// 290: ldc2_w 9069536874999081632
// 293: lload 7
// 295: lxor
// 296: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29b: goto 2a9
// 29e: ldc2_w -6092416061457221731
// 2a1: lload 7
// 2a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a8: athrow
// 2a9: if_icmpge 2bb
// 2ac: bipush 1
// 2ad: goto 2c0
// 2b0: ldc2_w -6092416061457221731
// 2b3: lload 7
// 2b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ba: athrow
// 2bb: bipush 0
// 2bc: goto 2c0
// 2bf: bipush 0
// 2c0: ifeq 2d4
// 2c3: getstatic java/awt/Color.YELLOW Ljava/awt/Color;
// 2c6: goto 2d7
// 2c9: ldc2_w -6092416061457221731
// 2cc: lload 7
// 2ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d3: athrow
// 2d4: getstatic java/awt/Color.GREEN Ljava/awt/Color;
// 2d7: astore 38
// 2d9: lload 17
// 2db: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 2de: aload 2
// 2df: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2e2: dup
// 2e3: sipush 28122
// 2e6: ldc2_w 3752133909705093712
// 2e9: lload 7
// 2eb: lxor
// 2ec: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2f4: iload 37
// 2f6: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001%" ]
// 2fb: dload 3
// 2fc: d2f
// 2fd: ldc 35.0
// 2ff: fsub
// 300: fload 33
// 302: fadd
// 303: dload 5
// 305: d2f
// 306: ldc 22.0
// 308: fsub
// 309: aload 38
// 30b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 30e: lload 19
// 310: aload 38
// 312: bipush 0
// 313: bipush 0
// 314: sipush 5172
// 317: ldc2_w 1931069749476860907
// 31a: lload 7
// 31c: lxor
// 31d: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 322: aconst_null
// 323: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 326: fconst_0
// 327: fstore 36
// 329: aload 35
// 32b: invokestatic net/minecraft/class_1890.method_57532 (Lnet/minecraft/class_1799;)Lnet/minecraft/class_9304;
// 32e: dup
// 32f: sipush 7439
// 332: ldc2_w 8952459596623577843
// 335: lload 7
// 337: lxor
// 338: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 340: astore 37
// 342: iload 30
// 344: lload 7
// 346: lconst_0
// 347: lcmp
// 348: ifle 552
// 34b: ifeq 550
// 34e: aload 0
// 34f: lload 13
// 351: invokespecial su/catlean/ko.v (J)Z
// 354: ifeq 542
// 357: goto 365
// 35a: ldc2_w -6092416061457221731
// 35d: lload 7
// 35f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 364: athrow
// 365: aload 0
// 366: lload 21
// 368: invokespecial su/catlean/ko.K (J)Z
// 36b: iload 30
// 36d: lload 7
// 36f: lconst_0
// 370: lcmp
// 371: iflt 3af
// 374: ifeq 3ad
// 377: goto 385
// 37a: ldc2_w -6092416061457221731
// 37d: lload 7
// 37f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 384: athrow
// 385: ifeq 3dd
// 388: goto 396
// 38b: ldc2_w -6092416061457221731
// 38e: lload 7
// 390: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 395: athrow
// 396: aload 35
// 398: aload 1
// 399: invokevirtual net/minecraft/class_1657.method_6079 ()Lnet/minecraft/class_1799;
// 39c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 39f: goto 3ad
// 3a2: ldc2_w -6092416061457221731
// 3a5: lload 7
// 3a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ac: athrow
// 3ad: iload 30
// 3af: ifeq 3da
// 3b2: ifne 3dd
// 3b5: goto 3c3
// 3b8: ldc2_w -6092416061457221731
// 3bb: lload 7
// 3bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c2: athrow
// 3c3: aload 35
// 3c5: aload 1
// 3c6: invokevirtual net/minecraft/class_1657.method_6047 ()Lnet/minecraft/class_1799;
// 3c9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3cc: goto 3da
// 3cf: ldc2_w -6092416061457221731
// 3d2: lload 7
// 3d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: athrow
// 3da: ifeq 542
// 3dd: getstatic su/catlean/ko.D Ljava/util/Map;
// 3e0: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
// 3e5: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 3ea: astore 38
// 3ec: aload 38
// 3ee: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3f3: ifeq 542
// 3f6: aload 38
// 3f8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3fd: checkcast net/minecraft/class_5321
// 400: astore 39
// 402: aload 37
// 404: invokevirtual net/minecraft/class_9304.method_57534 ()Ljava/util/Set;
// 407: iload 30
// 409: ifeq 45d
// 40c: lload 15
// 40e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 411: invokevirtual net/minecraft/class_638.method_30349 ()Lnet/minecraft/class_5455;
// 414: aload 39
// 416: invokevirtual net/minecraft/class_5321.method_58273 ()Lnet/minecraft/class_5321;
// 419: invokeinterface net/minecraft/class_5455.method_46759 (Lnet/minecraft/class_5321;)Ljava/util/Optional; 2
// 41e: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 421: checkcast net/minecraft/class_2378
// 424: aload 39
// 426: invokevirtual net/minecraft/class_5321.method_29177 ()Lnet/minecraft/class_2960;
// 429: invokeinterface net/minecraft/class_2378.method_10223 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
// 42e: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 431: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
// 436: iload 30
// 438: ifeq 148
// 43b: lload 7
// 43d: lconst_0
// 43e: lcmp
// 43f: iflt 159
// 442: goto 450
// 445: ldc2_w -6092416061457221731
// 448: lload 7
// 44a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44f: athrow
// 450: ifeq 3ec
// 453: getstatic su/catlean/ko.D Ljava/util/Map;
// 456: aload 39
// 458: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 45d: checkcast java/lang/String
// 460: astore 40
// 462: aload 37
// 464: lload 15
// 466: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 469: invokevirtual net/minecraft/class_638.method_30349 ()Lnet/minecraft/class_5455;
// 46c: aload 39
// 46e: invokevirtual net/minecraft/class_5321.method_58273 ()Lnet/minecraft/class_5321;
// 471: invokeinterface net/minecraft/class_5455.method_46759 (Lnet/minecraft/class_5321;)Ljava/util/Optional; 2
// 476: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 479: checkcast net/minecraft/class_2378
// 47c: aload 39
// 47e: invokevirtual net/minecraft/class_5321.method_29177 ()Lnet/minecraft/class_2960;
// 481: invokeinterface net/minecraft/class_2378.method_10223 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
// 486: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 489: checkcast net/minecraft/class_6880
// 48c: invokevirtual net/minecraft/class_9304.method_57536 (Lnet/minecraft/class_6880;)I
// 48f: istore 41
// 491: aload 40
// 493: iload 41
// 495: invokedynamic makeConcatWithConstants (Ljava/lang/String;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 49a: astore 42
// 49c: lload 17
// 49e: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 4a1: aload 2
// 4a2: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4a5: dup
// 4a6: sipush 28122
// 4a9: ldc2_w 3752133909705093712
// 4ac: lload 7
// 4ae: lxor
// 4af: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4b7: aload 42
// 4b9: dload 3
// 4ba: d2f
// 4bb: ldc 50.0
// 4bd: fsub
// 4be: fload 33
// 4c0: fadd
// 4c1: dload 5
// 4c3: d2f
// 4c4: sipush 4007
// 4c7: ldc2_w 8841808570062551138
// 4ca: lload 7
// 4cc: lxor
// 4cd: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d2: i2f
// 4d3: fsub
// 4d4: fload 36
// 4d6: fadd
// 4d7: new java/awt/Color
// 4da: dup
// 4db: bipush -1
// 4dc: invokespecial java/awt/Color.<init> (I)V
// 4df: bipush 0
// 4e0: bipush 0
// 4e1: sipush 5172
// 4e4: ldc2_w 1931069749476860907
// 4e7: lload 7
// 4e9: lxor
// 4ea: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ef: aconst_null
// 4f0: astore 25
// 4f2: istore 26
// 4f4: istore 27
// 4f6: istore 28
// 4f8: astore 29
// 4fa: lload 19
// 4fc: aload 29
// 4fe: iload 28
// 500: iload 27
// 502: iload 26
// 504: aload 25
// 506: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 509: fload 36
// 50b: ldc 8.0
// 50d: fsub
// 50e: fstore 36
// 510: lload 7
// 512: lconst_0
// 513: lcmp
// 514: ifle 53d
// 517: fload 32
// 519: iload 30
// 51b: ifeq 53b
// 51e: fload 36
// 520: fcmpl
// 521: lload 7
// 523: lconst_0
// 524: lcmp
// 525: iflt 3f3
// 528: ifle 3ec
// 52b: goto 539
// 52e: ldc2_w -6092416061457221731
// 531: lload 7
// 533: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 538: athrow
// 539: fload 36
// 53b: fstore 32
// 53d: iload 30
// 53f: ifne 3ec
// 542: fload 33
// 544: ldc 18.0
// 546: fadd
// 547: fstore 33
// 549: lload 7
// 54b: lconst_0
// 54c: lcmp
// 54d: ifle 555
// 550: iload 30
// 552: ifne 141
// 555: fload 32
// 557: freturn
}

private final String c(long param1, class_1657 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ko.g J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 65482446186374
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 65463501761318
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 931106784247
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 103440829377797
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 95636788251236
// 027: lxor
// 028: lstore 12
// 02a: dup2
// 02b: ldc2_w 43672323109907
// 02e: lxor
// 02f: lstore 14
// 031: dup2
// 032: ldc2_w 105498110806430
// 035: lxor
// 036: dup2
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 16
// 03d: dup2
// 03e: bipush 16
// 040: lshl
// 041: bipush 32
// 043: lushr
// 044: l2i
// 045: istore 17
// 047: dup2
// 048: bipush 48
// 04a: lshl
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 18
// 051: pop2
// 052: dup2
// 053: ldc2_w 112488704033984
// 056: lxor
// 057: lstore 19
// 059: dup2
// 05a: ldc2_w 56865220293506
// 05d: lxor
// 05e: lstore 21
// 060: dup2
// 061: ldc2_w 74272355258929
// 064: lxor
// 065: lstore 23
// 067: dup2
// 068: ldc2_w 123139882987305
// 06b: lxor
// 06c: lstore 25
// 06e: dup2
// 06f: ldc2_w 117010263026237
// 072: lxor
// 073: lstore 27
// 075: dup2
// 076: ldc2_w 84960703683257
// 079: lxor
// 07a: lstore 29
// 07c: dup2
// 07d: ldc2_w 15590201218765
// 080: lxor
// 081: lstore 31
// 083: dup2
// 084: ldc2_w 613290367719
// 087: lxor
// 088: lstore 33
// 08a: dup2
// 08b: ldc2_w 2148888631457
// 08e: lxor
// 08f: lstore 35
// 091: dup2
// 092: ldc2_w 119909808674733
// 095: lxor
// 096: lstore 37
// 098: dup2
// 099: ldc2_w 75755364269358
// 09c: lxor
// 09d: lstore 39
// 09f: dup2
// 0a0: ldc2_w 65811611476790
// 0a3: lxor
// 0a4: lstore 41
// 0a6: pop2
// 0a7: ldc2_w -6818987122059617990
// 0aa: lload 1
// 0ab: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: istore 43
// 0b2: getstatic su/catlean/rq.G Lsu/catlean/rq;
// 0b5: aload 3
// 0b6: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 0b9: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 0bc: dup
// 0bd: sipush 30793
// 0c0: ldc2_w 1345296471565888920
// 0c3: lload 1
// 0c4: lxor
// 0c5: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0cd: lload 4
// 0cf: dup2_x1
// 0d0: pop2
// 0d1: invokevirtual su/catlean/rq.B (JLjava/lang/String;)Z
// 0d4: ifeq 0fd
// 0d7: getstatic net/minecraft/class_124.field_1080 Lnet/minecraft/class_124;
// 0da: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
// 0dd: sipush 1913
// 0e0: ldc2_w 4237165627798229732
// 0e3: lload 1
// 0e4: lxor
// 0e5: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: swap
// 0eb: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 0f0: goto 0ff
// 0f3: ldc2_w -6839190005849571848
// 0f6: lload 1
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: ldc ""
// 0ff: astore 44
// 101: aload 0
// 102: lload 41
// 104: invokespecial su/catlean/ko.T (J)Z
// 107: iload 43
// 109: lload 1
// 10a: lconst_0
// 10b: lcmp
// 10c: ifle 15e
// 10f: ifne 156
// 112: ifeq 150
// 115: goto 122
// 118: ldc2_w -6839190005849571848
// 11b: lload 1
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: aload 44
// 124: aload 0
// 125: aload 0
// 126: aload 3
// 127: lload 29
// 129: invokevirtual su/catlean/ko.F (Lnet/minecraft/class_1657;J)I
// 12c: lload 6
// 12e: invokespecial su/catlean/ko.E (IJ)Ljava/lang/String;
// 131: aload 0
// 132: aload 3
// 133: lload 29
// 135: invokevirtual su/catlean/ko.F (Lnet/minecraft/class_1657;J)I
// 138: getstatic net/minecraft/class_124.field_1068 Lnet/minecraft/class_124;
// 13b: sipush 9364
// 13e: ldc2_w 5570578534894121302
// 141: lload 1
// 142: lxor
// 143: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: swap
// 149: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 14e: astore 44
// 150: aload 0
// 151: lload 12
// 153: invokespecial su/catlean/ko.g (J)Z
// 156: lload 1
// 157: lconst_0
// 158: lcmp
// 159: iflt 19b
// 15c: iload 43
// 15e: ifne 19b
// 161: ifeq 187
// 164: goto 171
// 167: ldc2_w -6839190005849571848
// 16a: lload 1
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: aload 44
// 173: aload 0
// 174: aload 0
// 175: lload 27
// 177: aload 3
// 178: invokespecial su/catlean/ko.Y (JLnet/minecraft/class_1657;)Lnet/minecraft/class_1934;
// 17b: lload 8
// 17d: invokespecial su/catlean/ko.x (Lnet/minecraft/class_1934;J)Ljava/lang/String;
// 180: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001 " ]
// 185: astore 44
// 187: aload 0
// 188: iload 16
// 18a: i2s
// 18b: iload 17
// 18d: iload 18
// 18f: i2c
// 190: invokespecial su/catlean/ko.R (SIC)Lsu/catlean/al;
// 193: getstatic su/catlean/z8.s [I
// 196: swap
// 197: invokevirtual su/catlean/al.ordinal ()I
// 19a: iaload
// 19b: tableswitch 88 1 3 25 66 78
// 1b4: aload 3
// 1b5: invokevirtual net/minecraft/class_1657.method_5476 ()Lnet/minecraft/class_2561;
// 1b8: dup
// 1b9: sipush 27325
// 1bc: ldc2_w 2431547818519428865
// 1bf: lload 1
// 1c0: lxor
// 1c1: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1c9: lload 14
// 1cb: dup2_x1
// 1cc: pop2
// 1cd: invokestatic su/catlean/r5.D (JLnet/minecraft/class_2561;)Ljava/lang/String;
// 1d0: goto 1fb
// 1d3: ldc2_w -6839190005849571848
// 1d6: lload 1
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: aload 3
// 1de: invokevirtual net/minecraft/class_1657.method_5476 ()Lnet/minecraft/class_2561;
// 1e1: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 1e6: goto 1fb
// 1e9: aload 3
// 1ea: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 1ed: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 1f0: goto 1fb
// 1f3: new kotlin/NoWhenBranchMatchedException
// 1f6: dup
// 1f7: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 1fa: athrow
// 1fb: astore 45
// 1fd: aload 44
// 1ff: aload 45
// 201: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 204: aload 45
// 206: checkcast java/lang/CharSequence
// 209: astore 46
// 20b: astore 55
// 20d: bipush 0
// 20e: istore 47
// 210: aload 46
// 212: astore 48
// 214: new java/util/ArrayList
// 217: dup
// 218: aload 46
// 21a: invokeinterface java/lang/CharSequence.length ()I 1
// 21f: invokespecial java/util/ArrayList.<init> (I)V
// 222: checkcast java/util/Collection
// 225: astore 49
// 227: bipush 0
// 228: istore 50
// 22a: bipush 0
// 22b: istore 51
// 22d: iload 51
// 22f: aload 48
// 231: invokeinterface java/lang/CharSequence.length ()I 1
// 236: if_icmpge 2b4
// 239: aload 48
// 23b: iload 51
// 23d: invokeinterface java/lang/CharSequence.charAt (I)C 2
// 242: istore 52
// 244: aload 49
// 246: iload 52
// 248: istore 53
// 24a: astore 56
// 24c: bipush 0
// 24d: istore 54
// 24f: iload 43
// 251: lload 1
// 252: lconst_0
// 253: lcmp
// 254: iflt 2ee
// 257: ifne 2e8
// 25a: iload 43
// 25c: ifne 29e
// 25f: goto 26c
// 262: ldc2_w -6839190005849571848
// 265: lload 1
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: getstatic su/catlean/ko.f Ljava/util/Map;
// 26f: iload 53
// 271: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
// 274: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 279: checkcast java/lang/Character
// 27c: dup
// 27d: ifnull 29d
// 280: goto 28d
// 283: ldc2_w -6839190005849571848
// 286: lload 1
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: invokevirtual java/lang/Character.charValue ()C
// 290: goto 2a0
// 293: ldc2_w -6839190005849571848
// 296: lload 1
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: pop
// 29e: iload 53
// 2a0: invokestatic java/lang/Character.valueOf (C)Ljava/lang/Character;
// 2a3: aload 56
// 2a5: swap
// 2a6: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 2ab: pop
// 2ac: iinc 51 1
// 2af: iload 43
// 2b1: ifeq 22d
// 2b4: aload 49
// 2b6: checkcast java/util/List
// 2b9: nop
// 2ba: aload 55
// 2bc: swap
// 2bd: checkcast java/lang/Iterable
// 2c0: ldc ""
// 2c2: checkcast java/lang/CharSequence
// 2c5: aconst_null
// 2c6: aconst_null
// 2c7: bipush 0
// 2c8: aconst_null
// 2c9: aconst_null
// 2ca: sipush 4063
// 2cd: ldc2_w 4071491029407773251
// 2d0: lload 1
// 2d1: lxor
// 2d2: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: aconst_null
// 2d8: invokestatic kotlin/collections/CollectionsKt.joinToString$default (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
// 2db: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001 " ]
// 2e0: astore 44
// 2e2: lload 1
// 2e3: lconst_0
// 2e4: lcmp
// 2e5: ifle 2e8
// 2e8: aload 0
// 2e9: lload 10
// 2eb: invokespecial su/catlean/ko.C (J)Z
// 2ee: iload 43
// 2f0: lload 1
// 2f1: lconst_0
// 2f2: lcmp
// 2f3: ifle 36e
// 2f6: ifne 36c
// 2f9: ifeq 366
// 2fc: goto 309
// 2ff: ldc2_w -6839190005849571848
// 302: lload 1
// 303: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 308: athrow
// 309: aload 0
// 30a: iload 43
// 30c: ifne 367
// 30f: goto 31c
// 312: ldc2_w -6839190005849571848
// 315: lload 1
// 316: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31b: athrow
// 31c: lload 19
// 31e: invokespecial su/catlean/ko.e (J)Lsu/catlean/m7;
// 321: getstatic su/catlean/m7.Number Lsu/catlean/m7;
// 324: if_acmpne 366
// 327: goto 334
// 32a: ldc2_w -6839190005849571848
// 32d: lload 1
// 32e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 333: athrow
// 334: aload 44
// 336: aload 0
// 337: aload 0
// 338: aload 3
// 339: aload 0
// 33a: lload 39
// 33c: invokevirtual su/catlean/ko.H (J)Lsu/catlean/_j;
// 33f: lload 23
// 341: invokevirtual su/catlean/ko.A (Lnet/minecraft/class_1657;Lsu/catlean/_j;J)F
// 344: lload 31
// 346: invokespecial su/catlean/ko.x (FJ)Ljava/lang/String;
// 349: aload 0
// 34a: aload 0
// 34b: aload 3
// 34c: aload 0
// 34d: lload 39
// 34f: invokevirtual su/catlean/ko.H (J)Lsu/catlean/_j;
// 352: lload 23
// 354: invokevirtual su/catlean/ko.A (Lnet/minecraft/class_1657;Lsu/catlean/_j;J)F
// 357: lload 33
// 359: invokevirtual su/catlean/ko.z (FJ)F
// 35c: getstatic net/minecraft/class_124.field_1068 Lnet/minecraft/class_124;
// 35f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;FLnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001 \u0001" ]
// 364: astore 44
// 366: aload 0
// 367: lload 25
// 369: invokespecial su/catlean/ko.I (J)Z
// 36c: iload 43
// 36e: lload 1
// 36f: lconst_0
// 370: lcmp
// 371: iflt 3d0
// 374: ifne 3ce
// 377: ifeq 3c8
// 37a: goto 387
// 37d: ldc2_w -6839190005849571848
// 380: lload 1
// 381: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 386: athrow
// 387: aload 44
// 389: sipush 12643
// 38c: ldc2_w 3621201622578144489
// 38f: lload 1
// 390: lxor
// 391: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: bipush 1
// 397: anewarray 520
// 39a: astore 46
// 39c: aload 46
// 39e: bipush 0
// 39f: lload 21
// 3a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3a4: aload 3
// 3a5: checkcast net/minecraft/class_1297
// 3a8: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
// 3ab: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 3ae: aastore
// 3af: aload 46
// 3b1: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
// 3b4: sipush 21827
// 3b7: ldc2_w 2549230950541148412
// 3ba: lload 1
// 3bb: lxor
// 3bc: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c1: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 3c6: astore 44
// 3c8: aload 0
// 3c9: lload 37
// 3cb: invokespecial su/catlean/ko.L (J)Z
// 3ce: iload 43
// 3d0: ifne 3f9
// 3d3: ifeq 411
// 3d6: goto 3e3
// 3d9: ldc2_w -6839190005849571848
// 3dc: lload 1
// 3dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e2: athrow
// 3e3: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 3e6: aload 3
// 3e7: lload 35
// 3e9: invokevirtual su/catlean/dx.j (Lnet/minecraft/class_1657;J)I
// 3ec: goto 3f9
// 3ef: ldc2_w -6839190005849571848
// 3f2: lload 1
// 3f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f8: athrow
// 3f9: ifeq 411
// 3fc: aload 44
// 3fe: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
// 401: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 404: aload 3
// 405: lload 35
// 407: invokevirtual su/catlean/dx.j (Lnet/minecraft/class_1657;J)I
// 40a: invokedynamic makeConcatWithConstants (Ljava/lang/String;Lnet/minecraft/class_124;I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 40f: astore 44
// 411: aload 44
// 413: areturn
}

private final void B(long param1, class_332 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ko.g J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 32073163053705
// 00b: lxor
// 00c: dup2
// 00d: bipush 8
// 00f: lushr
// 010: lstore 4
// 012: dup2
// 013: bipush 56
// 015: lshl
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 33604395219554
// 021: lxor
// 022: lstore 7
// 024: dup2
// 025: ldc2_w 68623340012188
// 028: lxor
// 029: lstore 9
// 02b: dup2
// 02c: ldc2_w 125275724103089
// 02f: lxor
// 030: lstore 11
// 032: dup2
// 033: ldc2_w 2294842215451
// 036: lxor
// 037: lstore 13
// 039: dup2
// 03a: ldc2_w 25217639057869
// 03d: lxor
// 03e: lstore 15
// 040: pop2
// 041: ldc2_w 5893618752960375214
// 044: lload 1
// 045: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04a: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 04d: invokevirtual su/catlean/nf.V ()Ljava/util/List;
// 050: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 055: astore 23
// 057: istore 22
// 059: aload 23
// 05b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 060: ifeq 370
// 063: aload 23
// 065: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 06a: checkcast net/minecraft/class_2586
// 06d: astore 24
// 06f: aload 24
// 071: instanceof net/minecraft/class_2636
// 074: iload 22
// 076: ifne 060
// 079: ifeq 059
// 07c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 07f: aload 24
// 081: checkcast net/minecraft/class_2636
// 084: invokevirtual net/minecraft/class_2636.method_11016 ()Lnet/minecraft/class_2338;
// 087: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 08a: i2d
// 08b: ldc2_w 0.5
// 08e: dadd
// 08f: aload 24
// 091: checkcast net/minecraft/class_2636
// 094: invokevirtual net/minecraft/class_2636.method_11016 ()Lnet/minecraft/class_2338;
// 097: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 09a: i2d
// 09b: ldc 1.5
// 09d: f2d
// 09e: dadd
// 09f: aload 24
// 0a1: checkcast net/minecraft/class_2636
// 0a4: invokevirtual net/minecraft/class_2636.method_11016 ()Lnet/minecraft/class_2338;
// 0a7: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0aa: i2d
// 0ab: ldc2_w 0.5
// 0ae: dadd
// 0af: lload 4
// 0b1: dup2_x2
// 0b2: pop2
// 0b3: iload 6
// 0b5: i2b
// 0b6: invokevirtual su/catlean/jl.S (DDJDB)Lorg/joml/Vector4d;
// 0b9: astore 25
// 0bb: lload 1
// 0bc: lconst_0
// 0bd: lcmp
// 0be: iflt 0c6
// 0c1: aload 25
// 0c3: ifnull 059
// 0c6: aload 24
// 0c8: checkcast net/minecraft/class_2636
// 0cb: invokevirtual net/minecraft/class_2636.method_11390 ()Lnet/minecraft/class_1917;
// 0ce: lload 1
// 0cf: lconst_0
// 0d0: lcmp
// 0d1: iflt 0fe
// 0d4: iload 22
// 0d6: ifne 0fe
// 0d9: ifnull 126
// 0dc: goto 0e9
// 0df: ldc2_w 5873275264280808812
// 0e2: lload 1
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: aload 24
// 0eb: checkcast net/minecraft/class_2636
// 0ee: invokevirtual net/minecraft/class_2636.method_11390 ()Lnet/minecraft/class_1917;
// 0f1: goto 0fe
// 0f4: ldc2_w 5873275264280808812
// 0f7: lload 1
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: lload 11
// 100: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 103: checkcast net/minecraft/class_1937
// 106: aload 24
// 108: checkcast net/minecraft/class_2636
// 10b: invokevirtual net/minecraft/class_2636.method_11016 ()Lnet/minecraft/class_2338;
// 10e: invokevirtual net/minecraft/class_1917.method_8283 (Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;)Lnet/minecraft/class_1297;
// 111: iload 22
// 113: ifne 157
// 116: ifnonnull 138
// 119: goto 126
// 11c: ldc2_w 5873275264280808812
// 11f: lload 1
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: iload 22
// 128: ifeq 059
// 12b: goto 138
// 12e: ldc2_w 5873275264280808812
// 131: lload 1
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: aload 24
// 13a: checkcast net/minecraft/class_2636
// 13d: invokevirtual net/minecraft/class_2636.method_11390 ()Lnet/minecraft/class_1917;
// 140: lload 11
// 142: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 145: checkcast net/minecraft/class_1937
// 148: aload 24
// 14a: checkcast net/minecraft/class_2636
// 14d: invokevirtual net/minecraft/class_2636.method_11016 ()Lnet/minecraft/class_2338;
// 150: invokevirtual net/minecraft/class_1917.method_8283 (Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;)Lnet/minecraft/class_1297;
// 153: dup
// 154: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 157: invokevirtual net/minecraft/class_1297.method_5477 ()Lnet/minecraft/class_2561;
// 15a: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 15f: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
// 162: pop
// 163: sipush 20096
// 166: ldc2_w 2623384092273388538
// 169: lload 1
// 16a: lxor
// 16b: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: astore 28
// 172: bipush 1
// 173: anewarray 520
// 176: astore 29
// 178: aload 29
// 17a: bipush 0
// 17b: aload 24
// 17d: checkcast net/minecraft/class_2636
// 180: invokevirtual net/minecraft/class_2636.method_11390 ()Lnet/minecraft/class_1917;
// 183: getfield net/minecraft/class_1917.field_9154 I
// 186: i2f
// 187: ldc 20.0
// 189: fdiv
// 18a: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 18d: aastore
// 18e: aload 29
// 190: astore 29
// 192: aload 28
// 194: aload 29
// 196: aload 29
// 198: arraylength
// 199: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
// 19c: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
// 19f: dup
// 1a0: sipush 27949
// 1a3: ldc2_w 6480364119392880750
// 1a6: lload 1
// 1a7: lxor
// 1a8: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b0: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001 \u0001s" ]
// 1b5: astore 26
// 1b7: aload 24
// 1b9: checkcast net/minecraft/class_2636
// 1bc: invokevirtual net/minecraft/class_2636.method_11390 ()Lnet/minecraft/class_1917;
// 1bf: invokevirtual net/minecraft/class_1917.method_8278 ()D
// 1c2: aload 24
// 1c4: checkcast net/minecraft/class_2636
// 1c7: invokevirtual net/minecraft/class_2636.method_11390 ()Lnet/minecraft/class_1917;
// 1ca: invokevirtual net/minecraft/class_1917.method_8279 ()D
// 1cd: dcmpg
// 1ce: iload 22
// 1d0: ifne 1e4
// 1d3: ifne 1e7
// 1d6: goto 1e3
// 1d9: ldc2_w 5873275264280808812
// 1dc: lload 1
// 1dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: athrow
// 1e3: bipush 1
// 1e4: goto 1e8
// 1e7: bipush 0
// 1e8: lload 1
// 1e9: lconst_0
// 1ea: lcmp
// 1eb: ifle 1fe
// 1ee: ifeq 2a4
// 1f1: aload 24
// 1f3: checkcast net/minecraft/class_2636
// 1f6: invokevirtual net/minecraft/class_2636.method_11390 ()Lnet/minecraft/class_1917;
// 1f9: invokevirtual net/minecraft/class_1917.method_8278 ()D
// 1fc: dconst_0
// 1fd: dcmpg
// 1fe: iload 22
// 200: ifne 221
// 203: goto 210
// 206: ldc2_w 5873275264280808812
// 209: lload 1
// 20a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: athrow
// 210: ifne 224
// 213: goto 220
// 216: ldc2_w 5873275264280808812
// 219: lload 1
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: bipush 1
// 221: goto 225
// 224: bipush 0
// 225: lload 1
// 226: lconst_0
// 227: lcmp
// 228: ifle 23f
// 22b: ifeq 2a4
// 22e: aload 24
// 230: checkcast net/minecraft/class_2636
// 233: invokevirtual net/minecraft/class_2636.method_11390 ()Lnet/minecraft/class_1917;
// 236: getfield net/minecraft/class_1917.field_9154 I
// 239: i2f
// 23a: ldc 20.0
// 23c: fdiv
// 23d: fconst_1
// 23e: fcmpg
// 23f: iload 22
// 241: ifne 262
// 244: goto 251
// 247: ldc2_w 5873275264280808812
// 24a: lload 1
// 24b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: athrow
// 251: ifne 265
// 254: goto 261
// 257: ldc2_w 5873275264280808812
// 25a: lload 1
// 25b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 260: athrow
// 261: bipush 1
// 262: goto 266
// 265: bipush 0
// 266: ifeq 2a4
// 269: aload 24
// 26b: checkcast net/minecraft/class_2636
// 26e: invokevirtual net/minecraft/class_2636.method_11390 ()Lnet/minecraft/class_1917;
// 271: lload 11
// 273: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 276: checkcast net/minecraft/class_1937
// 279: aload 24
// 27b: checkcast net/minecraft/class_2636
// 27e: invokevirtual net/minecraft/class_2636.method_11016 ()Lnet/minecraft/class_2338;
// 281: invokevirtual net/minecraft/class_1917.method_8283 (Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;)Lnet/minecraft/class_1297;
// 284: dup
// 285: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 288: invokevirtual net/minecraft/class_1297.method_5477 ()Lnet/minecraft/class_2561;
// 28b: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 290: sipush 26005
// 293: ldc2_w 4009106554408665223
// 296: lload 1
// 297: lxor
// 298: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 2a2: astore 26
// 2a4: lload 7
// 2a6: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 2a9: lload 13
// 2ab: aload 26
// 2ad: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 2b0: fstore 27
// 2b2: aload 25
// 2b4: getfield org/joml/Vector4d.x D
// 2b7: aload 25
// 2b9: getfield org/joml/Vector4d.z D
// 2bc: aload 25
// 2be: getfield org/joml/Vector4d.x D
// 2c1: dsub
// 2c2: d2f
// 2c3: fconst_2
// 2c4: fdiv
// 2c5: f2d
// 2c6: dadd
// 2c7: fload 27
// 2c9: bipush 2
// 2ca: i2f
// 2cb: fdiv
// 2cc: f2d
// 2cd: dsub
// 2ce: d2f
// 2cf: fstore 28
// 2d1: lload 9
// 2d3: getstatic su/catlean/ko.a Lsu/catlean/ab;
// 2d6: aload 3
// 2d7: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2da: dup
// 2db: sipush 9989
// 2de: ldc2_w 8838621113984729663
// 2e1: lload 1
// 2e2: lxor
// 2e3: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2eb: fload 28
// 2ed: bipush 2
// 2ee: i2f
// 2ef: fsub
// 2f0: aload 25
// 2f2: getfield org/joml/Vector4d.y D
// 2f5: ldc 13.0
// 2f7: f2d
// 2f8: dsub
// 2f9: d2f
// 2fa: fload 27
// 2fc: bipush 4
// 2fd: i2f
// 2fe: fadd
// 2ff: ldc 11.0
// 301: fconst_0
// 302: sipush 7365
// 305: ldc2_w 1213409365493535168
// 308: lload 1
// 309: lxor
// 30a: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30f: aconst_null
// 310: invokestatic su/catlean/ab.N (JLsu/catlean/ab;Lorg/joml/Matrix3x2fStack;FFFFFILjava/lang/Object;)V
// 313: lload 7
// 315: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 318: aload 3
// 319: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 31c: dup
// 31d: sipush 28122
// 320: ldc2_w 3752117009565190305
// 323: lload 1
// 324: lxor
// 325: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 32d: aload 26
// 32f: fload 28
// 331: aload 25
// 333: getfield org/joml/Vector4d.y D
// 336: d2f
// 337: ldc 12.5
// 339: fsub
// 33a: new java/awt/Color
// 33d: dup
// 33e: bipush -1
// 33f: invokespecial java/awt/Color.<init> (I)V
// 342: bipush 0
// 343: bipush 0
// 344: sipush 1792
// 347: ldc2_w 6085916730398296665
// 34a: lload 1
// 34b: lxor
// 34c: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 351: aconst_null
// 352: astore 17
// 354: istore 18
// 356: istore 19
// 358: istore 20
// 35a: astore 21
// 35c: lload 15
// 35e: aload 21
// 360: iload 20
// 362: iload 19
// 364: iload 18
// 366: aload 17
// 368: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 36b: iload 22
// 36d: ifeq 059
// 370: lload 1
// 371: lconst_0
// 372: lcmp
// 373: iflt 059
// 376: return
}

private final void j(long param1, class_332 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ko.g J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 6736614632180
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 41126485491359
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 6177208059489
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 81396685896012
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 63642502793446
// 027: lxor
// 028: lstore 12
// 02a: dup2
// 02b: ldc2_w 49584658173232
// 02e: lxor
// 02f: lstore 14
// 031: pop2
// 032: ldc2_w -7655368583462838835
// 035: lload 1
// 036: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03b: lload 10
// 03d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 040: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 043: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 048: astore 22
// 04a: istore 21
// 04c: aload 22
// 04e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 053: ifeq 3cd
// 056: aload 22
// 058: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 05d: dup
// 05e: sipush 9934
// 061: ldc2_w 3392481128001603454
// 064: lload 1
// 065: lxor
// 066: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 06e: checkcast net/minecraft/class_1297
// 071: astore 23
// 073: ldc ""
// 075: astore 24
// 077: aload 23
// 079: instanceof net/minecraft/class_1676
// 07c: iload 21
// 07e: lload 1
// 07f: lconst_0
// 080: lcmp
// 081: iflt 11e
// 084: ifeq 11c
// 087: ifeq 10a
// 08a: goto 097
// 08d: ldc2_w -7674367636745025135
// 090: lload 1
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: lload 1
// 098: lconst_0
// 099: lcmp
// 09a: iflt 0ff
// 09d: aload 23
// 09f: checkcast net/minecraft/class_1676
// 0a2: invokevirtual net/minecraft/class_1676.method_24921 ()Lnet/minecraft/class_1297;
// 0a5: iload 21
// 0a7: ifeq 0e0
// 0aa: goto 0b7
// 0ad: ldc2_w -7674367636745025135
// 0b0: lload 1
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: ifnull 283
// 0ba: goto 0c7
// 0bd: ldc2_w -7674367636745025135
// 0c0: lload 1
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: aload 23
// 0c9: checkcast net/minecraft/class_1676
// 0cc: invokevirtual net/minecraft/class_1676.method_24921 ()Lnet/minecraft/class_1297;
// 0cf: dup
// 0d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0d3: goto 0e0
// 0d6: ldc2_w -7674367636745025135
// 0d9: lload 1
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: invokevirtual net/minecraft/class_1297.method_5476 ()Lnet/minecraft/class_2561;
// 0e3: dup
// 0e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0e7: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 0ec: dup
// 0ed: sipush 22300
// 0f0: ldc2_w 4684385686959585022
// 0f3: lload 1
// 0f4: lxor
// 0f5: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0fd: astore 24
// 0ff: iload 21
// 101: lload 1
// 102: lconst_0
// 103: lcmp
// 104: ifle 28d
// 107: ifne 283
// 10a: aload 23
// 10c: instanceof net/minecraft/class_1498
// 10f: goto 11c
// 112: ldc2_w -7674367636745025135
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: iload 21
// 11e: lload 1
// 11f: lconst_0
// 120: lcmp
// 121: iflt 1b5
// 124: ifeq 1ad
// 127: ifeq 19b
// 12a: goto 137
// 12d: ldc2_w -7674367636745025135
// 130: lload 1
// 131: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: athrow
// 137: lload 1
// 138: lconst_0
// 139: lcmp
// 13a: ifle 167
// 13d: aload 23
// 13f: checkcast net/minecraft/class_1498
// 142: invokevirtual net/minecraft/class_1498.method_35057 ()Lnet/minecraft/class_1309;
// 145: dup
// 146: ifnull 166
// 149: goto 156
// 14c: ldc2_w -7674367636745025135
// 14f: lload 1
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: invokevirtual net/minecraft/class_1309.method_5667 ()Ljava/util/UUID;
// 159: goto 168
// 15c: ldc2_w -7674367636745025135
// 15f: lload 1
// 160: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 165: athrow
// 166: pop
// 167: aconst_null
// 168: ifnull 283
// 16b: aload 23
// 16d: checkcast net/minecraft/class_1498
// 170: invokevirtual net/minecraft/class_1498.method_35057 ()Lnet/minecraft/class_1309;
// 173: dup
// 174: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 177: invokevirtual net/minecraft/class_1309.method_5667 ()Ljava/util/UUID;
// 17a: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
// 17d: dup
// 17e: sipush 6320
// 181: ldc2_w 9082251670896032005
// 184: lload 1
// 185: lxor
// 186: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 18e: astore 24
// 190: iload 21
// 192: lload 1
// 193: lconst_0
// 194: lcmp
// 195: ifle 28d
// 198: ifne 283
// 19b: aload 23
// 19d: instanceof net/minecraft/class_1321
// 1a0: goto 1ad
// 1a3: ldc2_w -7674367636745025135
// 1a6: lload 1
// 1a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: athrow
// 1ad: lload 1
// 1ae: lconst_0
// 1af: lcmp
// 1b0: ifle 1f5
// 1b3: iload 21
// 1b5: ifeq 1f5
// 1b8: ifeq 26b
// 1bb: goto 1c8
// 1be: ldc2_w -7674367636745025135
// 1c1: lload 1
// 1c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c7: athrow
// 1c8: aload 23
// 1ca: checkcast net/minecraft/class_1321
// 1cd: iload 21
// 1cf: lload 1
// 1d0: lconst_0
// 1d1: lcmp
// 1d2: iflt 215
// 1d5: ifeq 213
// 1d8: goto 1e5
// 1db: ldc2_w -7674367636745025135
// 1de: lload 1
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: invokevirtual net/minecraft/class_1321.method_6181 ()Z
// 1e8: goto 1f5
// 1eb: ldc2_w -7674367636745025135
// 1ee: lload 1
// 1ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: athrow
// 1f5: lload 1
// 1f6: lconst_0
// 1f7: lcmp
// 1f8: ifle 26d
// 1fb: ifeq 26b
// 1fe: aload 23
// 200: checkcast net/minecraft/class_1321
// 203: invokevirtual net/minecraft/class_1321.method_35057 ()Lnet/minecraft/class_1309;
// 206: goto 213
// 209: ldc2_w -7674367636745025135
// 20c: lload 1
// 20d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: athrow
// 213: iload 21
// 215: ifeq 241
// 218: ifnull 26b
// 21b: goto 228
// 21e: ldc2_w -7674367636745025135
// 221: lload 1
// 222: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: athrow
// 228: aload 23
// 22a: checkcast net/minecraft/class_1321
// 22d: invokevirtual net/minecraft/class_1321.method_35057 ()Lnet/minecraft/class_1309;
// 230: dup
// 231: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 234: goto 241
// 237: ldc2_w -7674367636745025135
// 23a: lload 1
// 23b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 240: athrow
// 241: invokevirtual net/minecraft/class_1309.method_5476 ()Lnet/minecraft/class_2561;
// 244: dup
// 245: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 248: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 24d: dup
// 24e: sipush 32419
// 251: ldc2_w 6004445773125377824
// 254: lload 1
// 255: lxor
// 256: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 25e: astore 24
// 260: iload 21
// 262: lload 1
// 263: lconst_0
// 264: lcmp
// 265: ifle 28d
// 268: ifne 283
// 26b: iload 21
// 26d: lload 1
// 26e: lconst_0
// 26f: lcmp
// 270: iflt 053
// 273: ifne 04c
// 276: goto 283
// 279: ldc2_w -7674367636745025135
// 27c: lload 1
// 27d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 282: athrow
// 283: aload 24
// 285: checkcast java/lang/CharSequence
// 288: invokeinterface java/lang/CharSequence.length ()I 1
// 28d: iload 21
// 28f: ifeq 2a3
// 292: ifne 2a6
// 295: goto 2a2
// 298: ldc2_w -7674367636745025135
// 29b: lload 1
// 29c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a1: athrow
// 2a2: bipush 1
// 2a3: goto 2a7
// 2a6: bipush 0
// 2a7: lload 1
// 2a8: lconst_0
// 2a9: lcmp
// 2aa: iflt 2b2
// 2ad: ifeq 2c8
// 2b0: iload 21
// 2b2: lload 1
// 2b3: lconst_0
// 2b4: lcmp
// 2b5: iflt 053
// 2b8: ifne 04c
// 2bb: goto 2c8
// 2be: ldc2_w -7674367636745025135
// 2c1: lload 1
// 2c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c7: athrow
// 2c8: lload 4
// 2ca: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2cd: aload 23
// 2cf: fconst_0
// 2d0: bipush 2
// 2d1: aconst_null
// 2d2: invokestatic su/catlean/jl.i (JLsu/catlean/jl;Lnet/minecraft/class_1297;FILjava/lang/Object;)Lorg/joml/Vector4d;
// 2d5: astore 25
// 2d7: aload 25
// 2d9: ifnull 04c
// 2dc: getstatic net/minecraft/class_124.field_1080 Lnet/minecraft/class_124;
// 2df: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
// 2e2: aload 24
// 2e4: sipush 21327
// 2e7: ldc2_w 2626654708755100317
// 2ea: lload 1
// 2eb: lxor
// 2ec: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f1: dup_x2
// 2f2: pop
// 2f3: ldc " "
// 2f5: swap
// 2f6: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
// 2fb: astore 26
// 2fd: lload 6
// 2ff: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 302: lload 12
// 304: aload 26
// 306: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 309: fstore 27
// 30b: aload 25
// 30d: getfield org/joml/Vector4d.x D
// 310: aload 25
// 312: getfield org/joml/Vector4d.z D
// 315: aload 25
// 317: getfield org/joml/Vector4d.x D
// 31a: dsub
// 31b: d2f
// 31c: bipush 2
// 31d: i2f
// 31e: fdiv
// 31f: f2d
// 320: dadd
// 321: fload 27
// 323: bipush 2
// 324: i2f
// 325: fdiv
// 326: f2d
// 327: dsub
// 328: bipush 1
// 329: i2d
// 32a: dmul
// 32b: d2f
// 32c: fstore 28
// 32e: lload 8
// 330: getstatic su/catlean/ko.a Lsu/catlean/ab;
// 333: aload 3
// 334: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 337: dup
// 338: sipush 28122
// 33b: ldc2_w 3752071875339045980
// 33e: lload 1
// 33f: lxor
// 340: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 345: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 348: fload 28
// 34a: bipush 2
// 34b: i2f
// 34c: fsub
// 34d: aload 25
// 34f: getfield org/joml/Vector4d.y D
// 352: ldc 13.0
// 354: f2d
// 355: dsub
// 356: d2f
// 357: fload 27
// 359: bipush 4
// 35a: i2f
// 35b: fadd
// 35c: ldc 12.0
// 35e: fconst_0
// 35f: sipush 2192
// 362: ldc2_w 2035731813822529919
// 365: lload 1
// 366: lxor
// 367: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36c: aconst_null
// 36d: invokestatic su/catlean/ab.N (JLsu/catlean/ab;Lorg/joml/Matrix3x2fStack;FFFFFILjava/lang/Object;)V
// 370: lload 6
// 372: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 375: aload 3
// 376: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 379: dup
// 37a: sipush 28122
// 37d: ldc2_w 3752071875339045980
// 380: lload 1
// 381: lxor
// 382: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 387: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 38a: aload 26
// 38c: fload 28
// 38e: aload 25
// 390: getfield org/joml/Vector4d.y D
// 393: d2f
// 394: ldc 12.0
// 396: fsub
// 397: new java/awt/Color
// 39a: dup
// 39b: bipush -1
// 39c: invokespecial java/awt/Color.<init> (I)V
// 39f: bipush 0
// 3a0: bipush 0
// 3a1: sipush 5172
// 3a4: ldc2_w 1931130684339396071
// 3a7: lload 1
// 3a8: lxor
// 3a9: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ae: aconst_null
// 3af: astore 16
// 3b1: istore 17
// 3b3: istore 18
// 3b5: istore 19
// 3b7: astore 20
// 3b9: lload 14
// 3bb: aload 20
// 3bd: iload 19
// 3bf: iload 18
// 3c1: iload 17
// 3c3: aload 16
// 3c5: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 3c8: iload 21
// 3ca: ifne 04c
// 3cd: lload 1
// 3ce: lconst_0
// 3cf: lcmp
// 3d0: iflt 04c
// 3d3: return
}

public final int F(@NotNull class_1657 entity, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ko.g J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 18369806602822
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -3549939384199989544
// 12: lload 2
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 1
// 19: sipush 14399
// 1c: ldc2_w 2297442157680444010
// 1f: lload 2
// 20: lxor
// 21: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 29: istore 6
// 2b: iload 6
// 2d: ifne 75
// 30: lload 4
// 32: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 35: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
// 38: dup
// 39: ifnull 67
// 3c: goto 49
// 3f: ldc2_w -3534108223058193894
// 42: lload 2
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: aload 1
// 4a: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
// 4d: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
// 50: lload 2
// 51: lconst_0
// 52: lcmp
// 53: iflt 77
// 56: dup
// 57: ifnonnull 77
// 5a: goto 67
// 5d: ldc2_w -3534108223058193894
// 60: lload 2
// 61: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66: athrow
// 67: pop
// 68: goto 75
// 6b: ldc2_w -3534108223058193894
// 6e: lload 2
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: bipush 0
// 76: ireturn
// 77: invokevirtual net/minecraft/class_640.method_2959 ()I
// 7a: lload 2
// 7b: lconst_0
// 7c: lcmp
// 7d: ifle 9a
// 80: ldc2_w -3576247472627396401
// 83: lload 2
// 84: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: ifnull a7
// 8c: iinc 6 1
// 8f: iload 6
// 91: ldc2_w -3564463492411097008
// 94: lload 2
// 95: invokedynamic Å (IJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a: goto a7
// 9d: ldc2_w -3534108223058193894
// a0: lload 2
// a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: athrow
// a7: ireturn
}

private final class_1934 Y(long var1, class_1657 var3) {
var1 = g ^ var1;
long var4 = var1 ^ 61142793036482L;

try {
if (var3 == null) {
return null;
}
} catch (NoWhenBranchMatchedException var6) {
throw vm.a<"Å">(var6, 9110910024542970526L, var1);
}

try {
if (var1 >= 0L) {
class_634 var10000 = zf.F(var4).method_1562();
Intrinsics.checkNotNull(var10000);
class_640 var9 = var10000.method_2871(var3.method_5667());
if (var9 != null) {
return var9.method_2958();
}
}
} catch (NoWhenBranchMatchedException var7) {
throw vm.a<"Å">(var7, 9110910024542970526L, var1);
}

return null;
}

private final String x(class_1934 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ko.g J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -2886146084352217194
// 09: lload 2
// 0a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: istore 4
// 11: aload 1
// 12: iload 4
// 14: ifne 40
// 17: ifnonnull 3f
// 1a: goto 27
// 1d: ldc2_w -2901973105145656492
// 20: lload 2
// 21: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: athrow
// 27: sipush 30571
// 2a: ldc2_w 5147789415323636847
// 2d: lload 2
// 2e: lxor
// 2f: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: areturn
// 35: ldc2_w -2901973105145656492
// 38: lload 2
// 39: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: athrow
// 3f: aload 1
// 40: astore 5
// 42: getstatic su/catlean/z8.R [I
// 45: aload 5
// 47: invokevirtual net/minecraft/class_1934.ordinal ()I
// 4a: iaload
// 4b: lload 2
// 4c: lconst_0
// 4d: lcmp
// 4e: ifle 73
// 51: tableswitch 105 1 4 31 57 73 89
// 70: sipush 12357
// 73: ldc2_w 4181506365656814390
// 76: lload 2
// 77: lxor
// 78: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d: goto c2
// 80: ldc2_w -2901973105145656492
// 83: lload 2
// 84: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: athrow
// 8a: sipush 30541
// 8d: ldc2_w 704321346611975239
// 90: lload 2
// 91: lxor
// 92: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: goto c2
// 9a: sipush 29789
// 9d: ldc2_w 1715094989193484145
// a0: lload 2
// a1: lxor
// a2: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7: goto c2
// aa: sipush 7375
// ad: ldc2_w 8253777458826084336
// b0: lload 2
// b1: lxor
// b2: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b7: goto c2
// ba: new kotlin/NoWhenBranchMatchedException
// bd: dup
// be: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// c1: athrow
// c2: areturn
}

public final float A(@NotNull class_1657 ent, @NotNull _j healthProvider, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ko.g J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 66855991323215
// 00b: lxor
// 00c: lstore 5
// 00e: pop2
// 00f: ldc2_w -4164674920420393392
// 012: lload 3
// 013: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: istore 7
// 01a: aload 1
// 01b: iload 7
// 01d: ifne 1a4
// 020: sipush 28318
// 023: ldc2_w 2584676103307631712
// 026: lload 3
// 027: lxor
// 028: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 030: aload 2
// 031: sipush 19597
// 034: ldc2_w 4325765614959050365
// 037: lload 3
// 038: lxor
// 039: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 041: aload 2
// 042: getstatic su/catlean/z8.m [I
// 045: swap
// 046: invokevirtual su/catlean/_j.ordinal ()I
// 049: iaload
// 04a: tableswitch 345 1 2 32 181
// 060: ldc2_w -4144334743168722286
// 063: lload 3
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: aconst_null
// 06b: astore 8
// 06d: ldc ""
// 06f: astore 8
// 071: fconst_0
// 072: fstore 9
// 074: aload 1
// 075: invokevirtual net/minecraft/class_1657.method_73183 ()Lnet/minecraft/class_1937;
// 078: invokevirtual net/minecraft/class_1937.method_8428 ()Lnet/minecraft/class_269;
// 07b: dup
// 07c: sipush 11871
// 07f: ldc2_w 4603650761952648331
// 082: lload 3
// 083: lxor
// 084: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08c: astore 10
// 08e: aload 10
// 090: getstatic net/minecraft/class_8646.field_45158 Lnet/minecraft/class_8646;
// 093: invokevirtual net/minecraft/class_269.method_1189 (Lnet/minecraft/class_8646;)Lnet/minecraft/class_266;
// 096: astore 11
// 098: iload 7
// 09a: ifne 0ee
// 09d: aload 11
// 09f: dup
// 0a0: ifnull 0ed
// 0a3: goto 0b0
// 0a6: ldc2_w -4144334743168722286
// 0a9: lload 3
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: astore 12
// 0b2: aload 12
// 0b4: astore 13
// 0b6: bipush 0
// 0b7: istore 14
// 0b9: nop
// 0ba: aload 10
// 0bc: aload 1
// 0bd: checkcast net/minecraft/class_9015
// 0c0: aload 13
// 0c2: invokevirtual net/minecraft/class_269.method_55430 (Lnet/minecraft/class_9015;Lnet/minecraft/class_266;)Lnet/minecraft/class_9013;
// 0c5: aload 13
// 0c7: getstatic net/minecraft/class_9025.field_47566 Lnet/minecraft/class_9025;
// 0ca: checkcast net/minecraft/class_9022
// 0cd: invokevirtual net/minecraft/class_266.method_55380 (Lnet/minecraft/class_9022;)Lnet/minecraft/class_9022;
// 0d0: invokestatic net/minecraft/class_9013.method_55398 (Lnet/minecraft/class_9013;Lnet/minecraft/class_9022;)Lnet/minecraft/class_5250;
// 0d3: invokevirtual net/minecraft/class_5250.getString ()Ljava/lang/String;
// 0d6: dup
// 0d7: sipush 32419
// 0da: ldc2_w 6004535630198639651
// 0dd: lload 3
// 0de: lxor
// 0df: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e7: astore 8
// 0e9: nop
// 0ea: goto 0ef
// 0ed: pop
// 0ee: nop
// 0ef: nop
// 0f0: aload 8
// 0f2: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
// 0f5: fstore 9
// 0f7: goto 0fc
// 0fa: astore 12
// 0fc: fload 9
// 0fe: freturn
// 0ff: lload 5
// 101: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 104: invokevirtual net/minecraft/class_638.method_8428 ()Lnet/minecraft/class_269;
// 107: getstatic net/minecraft/class_8646.field_45156 Lnet/minecraft/class_8646;
// 10a: invokevirtual net/minecraft/class_269.method_1189 (Lnet/minecraft/class_8646;)Lnet/minecraft/class_266;
// 10d: astore 8
// 10f: iload 7
// 111: ifne 138
// 114: aload 8
// 116: dup
// 117: ifnull 137
// 11a: goto 127
// 11d: ldc2_w -4144334743168722286
// 120: lload 3
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: invokevirtual net/minecraft/class_266.method_1118 ()Lnet/minecraft/class_274$class_275;
// 12a: goto 139
// 12d: ldc2_w -4144334743168722286
// 130: lload 3
// 131: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: athrow
// 137: pop
// 138: aconst_null
// 139: getstatic net/minecraft/class_274$class_275.field_1471 Lnet/minecraft/class_274$class_275;
// 13c: if_acmpne 1a1
// 13f: lload 3
// 140: lconst_0
// 141: lcmp
// 142: iflt 180
// 145: lload 5
// 147: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 14a: invokevirtual net/minecraft/class_638.method_8428 ()Lnet/minecraft/class_269;
// 14d: aload 1
// 14e: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 151: invokestatic net/minecraft/class_9015.method_55420 (Lcom/mojang/authlib/GameProfile;)Lnet/minecraft/class_9015;
// 154: aload 8
// 156: invokevirtual net/minecraft/class_269.method_55430 (Lnet/minecraft/class_9015;Lnet/minecraft/class_266;)Lnet/minecraft/class_9013;
// 159: dup
// 15a: ifnull 17f
// 15d: goto 16a
// 160: ldc2_w -4144334743168722286
// 163: lload 3
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: invokeinterface net/minecraft/class_9013.method_55397 ()I 1
// 16f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 172: goto 181
// 175: ldc2_w -4144334743168722286
// 178: lload 3
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: pop
// 180: aconst_null
// 181: astore 9
// 183: aload 9
// 185: iload 7
// 187: ifne 19c
// 18a: ifnull 1a1
// 18d: goto 19a
// 190: ldc2_w -4144334743168722286
// 193: lload 3
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: aload 9
// 19c: invokevirtual java/lang/Integer.intValue ()I
// 19f: i2f
// 1a0: freturn
// 1a1: fconst_0
// 1a2: freturn
// 1a3: aload 1
// 1a4: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 1a7: aload 1
// 1a8: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 1ab: fadd
// 1ac: freturn
}

private final void v(long param1, double param3, double param5, class_332 param7, class_1657 param8, float param9, int param10, int param11) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ko.g J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 48381612323182
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 12
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: lstore 13
// 01c: pop2
// 01d: pop2
// 01e: aload 7
// 020: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 023: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 026: pop
// 027: aload 7
// 029: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 02c: dload 3
// 02d: d2f
// 02e: ldc 44.0
// 030: fsub
// 031: dload 5
// 033: d2f
// 034: fconst_1
// 035: fadd
// 036: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 039: pop
// 03a: aload 7
// 03c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 03f: ldc 1.1
// 041: ldc 1.1
// 043: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 046: pop
// 047: ldc2_w -3379394625950295786
// 04a: lload 1
// 04b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: fload 9
// 052: f2d
// 053: ldc2_w 2.0
// 056: ddiv
// 057: invokestatic net/minecraft/class_3532.method_15384 (D)I
// 05a: istore 21
// 05c: iload 11
// 05e: i2d
// 05f: ldc2_w 2.0
// 062: ddiv
// 063: invokestatic net/minecraft/class_3532.method_15384 (D)I
// 066: istore 22
// 068: istore 20
// 06a: iload 21
// 06c: bipush 2
// 06d: imul
// 06e: istore 23
// 070: bipush 0
// 071: istore 24
// 073: iload 21
// 075: iload 22
// 077: iadd
// 078: bipush 1
// 079: isub
// 07a: istore 25
// 07c: bipush -1
// 07d: iload 25
// 07f: if_icmpge 256
// 082: iload 25
// 084: sipush 31642
// 087: ldc2_w 6484701414266943203
// 08a: lload 1
// 08b: lxor
// 08c: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: irem
// 092: istore 26
// 094: iload 26
// 096: sipush 1606
// 099: ldc2_w 7664892481755302706
// 09c: lload 1
// 09d: lxor
// 09e: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: imul
// 0a4: istore 27
// 0a6: iload 20
// 0a8: lload 1
// 0a9: lconst_0
// 0aa: lcmp
// 0ab: ifle 0b3
// 0ae: ifeq 265
// 0b1: iload 24
// 0b3: lload 1
// 0b4: lconst_0
// 0b5: lcmp
// 0b6: ifle 10e
// 0b9: sipush 26137
// 0bc: ldc2_w 6884465440716368699
// 0bf: lload 1
// 0c0: lxor
// 0c1: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: iload 20
// 0c8: ifeq 10d
// 0cb: goto 0d8
// 0ce: ldc2_w -3340408817936347830
// 0d1: lload 1
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: if_icmpge 10a
// 0db: goto 0e8
// 0de: ldc2_w -3340408817936347830
// 0e1: lload 1
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: aload 0
// 0e9: iload 12
// 0eb: lload 13
// 0ed: aload 7
// 0ef: getstatic su/catlean/jy.CONTAINER Lsu/catlean/jy;
// 0f2: iload 27
// 0f4: bipush 0
// 0f5: aload 8
// 0f7: invokespecial su/catlean/ko.k (IJLnet/minecraft/class_332;Lsu/catlean/jy;IZLnet/minecraft/class_1657;)V
// 0fa: iinc 24 1
// 0fd: goto 10a
// 100: ldc2_w -3340408817936347830
// 103: lload 1
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: iload 25
// 10c: bipush 2
// 10d: imul
// 10e: istore 28
// 110: iload 28
// 112: iload 10
// 114: iload 20
// 116: lload 1
// 117: lconst_0
// 118: lcmp
// 119: iflt 194
// 11c: ifeq 192
// 11f: if_icmpge 18e
// 122: goto 12f
// 125: ldc2_w -3340408817936347830
// 128: lload 1
// 129: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: athrow
// 12f: aload 0
// 130: aload 7
// 132: getstatic su/catlean/jy.NORMAL Lsu/catlean/jy;
// 135: iload 27
// 137: iload 28
// 139: bipush 1
// 13a: iadd
// 13b: iload 20
// 13d: ifeq 16d
// 140: goto 14d
// 143: ldc2_w -3340408817936347830
// 146: lload 1
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: iload 10
// 14f: if_icmpne 170
// 152: goto 15f
// 155: ldc2_w -3340408817936347830
// 158: lload 1
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: bipush 1
// 160: goto 16d
// 163: ldc2_w -3340408817936347830
// 166: lload 1
// 167: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: athrow
// 16d: goto 171
// 170: bipush 0
// 171: aload 8
// 173: astore 15
// 175: istore 16
// 177: istore 17
// 179: astore 18
// 17b: astore 19
// 17d: iload 12
// 17f: lload 13
// 181: aload 19
// 183: aload 18
// 185: iload 17
// 187: iload 16
// 189: aload 15
// 18b: invokespecial su/catlean/ko.k (IJLnet/minecraft/class_332;Lsu/catlean/jy;IZLnet/minecraft/class_1657;)V
// 18e: iload 25
// 190: iload 21
// 192: iload 20
// 194: ifeq 1b8
// 197: if_icmplt 24e
// 19a: goto 1a7
// 19d: ldc2_w -3340408817936347830
// 1a0: lload 1
// 1a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: athrow
// 1a7: iload 28
// 1a9: iload 23
// 1ab: goto 1b8
// 1ae: ldc2_w -3340408817936347830
// 1b1: lload 1
// 1b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: athrow
// 1b8: isub
// 1b9: istore 29
// 1bb: iload 20
// 1bd: lload 1
// 1be: lconst_0
// 1bf: lcmp
// 1c0: iflt 253
// 1c3: ifeq 251
// 1c6: iload 28
// 1c8: iload 23
// 1ca: isub
// 1cb: iload 11
// 1cd: if_icmpge 24e
// 1d0: goto 1dd
// 1d3: ldc2_w -3340408817936347830
// 1d6: lload 1
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: aload 7
// 1df: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1e2: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 1e5: pop
// 1e6: aload 0
// 1e7: aload 7
// 1e9: getstatic su/catlean/jy.ABSORBING Lsu/catlean/jy;
// 1ec: iload 27
// 1ee: iload 29
// 1f0: bipush 1
// 1f1: iadd
// 1f2: iload 20
// 1f4: ifeq 224
// 1f7: goto 204
// 1fa: ldc2_w -3340408817936347830
// 1fd: lload 1
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: iload 11
// 206: if_icmpne 227
// 209: goto 216
// 20c: ldc2_w -3340408817936347830
// 20f: lload 1
// 210: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 215: athrow
// 216: bipush 1
// 217: goto 224
// 21a: ldc2_w -3340408817936347830
// 21d: lload 1
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: goto 228
// 227: bipush 0
// 228: aload 8
// 22a: astore 15
// 22c: istore 16
// 22e: istore 17
// 230: astore 18
// 232: astore 19
// 234: iload 12
// 236: lload 13
// 238: aload 19
// 23a: aload 18
// 23c: iload 17
// 23e: iload 16
// 240: aload 15
// 242: invokespecial su/catlean/ko.k (IJLnet/minecraft/class_332;Lsu/catlean/jy;IZLnet/minecraft/class_1657;)V
// 245: aload 7
// 247: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 24a: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 24d: pop
// 24e: iinc 25 -1
// 251: iload 20
// 253: ifne 07c
// 256: aload 7
// 258: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 25b: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 25e: pop
// 25f: lload 1
// 260: lconst_0
// 261: lcmp
// 262: ifle 265
// 265: return
}

private final void k(int param1, long param2, class_332 param4, jy param5, int param6, boolean param7, class_1657 param8) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
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
// 00d: getstatic su/catlean/ko.g J
// 010: lxor
// 011: lstore 9
// 013: lload 9
// 015: dup2
// 016: ldc2_w 101656729427229
// 019: lxor
// 01a: lstore 11
// 01c: dup2
// 01d: ldc2_w 135350049544615
// 020: lxor
// 021: lstore 13
// 023: dup2
// 024: ldc2_w 102588275397517
// 027: lxor
// 028: lstore 15
// 02a: dup2
// 02b: ldc2_w 137481070255005
// 02e: lxor
// 02f: lstore 17
// 031: dup2
// 032: ldc2_w 11895862773553
// 035: lxor
// 036: lstore 19
// 038: dup2
// 039: ldc2_w 14097578150302
// 03c: lxor
// 03d: lstore 21
// 03f: dup2
// 040: ldc2_w 52366019145799
// 043: lxor
// 044: lstore 23
// 046: pop2
// 047: ldc2_w 6137448190852848931
// 04a: lload 9
// 04c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: istore 25
// 053: aload 0
// 054: lload 23
// 056: invokespecial su/catlean/ko.e (J)Lsu/catlean/m7;
// 059: getstatic su/catlean/m7.Dots Lsu/catlean/m7;
// 05c: if_acmpne 1eb
// 05f: aload 8
// 061: lload 13
// 063: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 066: ifeq 08b
// 069: goto 077
// 06c: ldc2_w 6165736862924786047
// 06f: lload 9
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: aload 0
// 078: lload 15
// 07a: invokespecial su/catlean/ko.B (J)Ljava/awt/Color;
// 07d: goto 091
// 080: ldc2_w 6165736862924786047
// 083: lload 9
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: aload 0
// 08c: lload 17
// 08e: invokespecial su/catlean/ko.r (J)Ljava/awt/Color;
// 091: astore 26
// 093: aload 5
// 095: getstatic su/catlean/jy.CONTAINER Lsu/catlean/jy;
// 098: iload 1
// 099: iflt 0ff
// 09c: iload 25
// 09e: ifeq 0ff
// 0a1: if_acmpne 0ec
// 0a4: goto 0b2
// 0a7: ldc2_w 6165736862924786047
// 0aa: lload 9
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0b5: aload 4
// 0b7: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0ba: dup
// 0bb: sipush 28122
// 0be: ldc2_w 3752126534622088370
// 0c1: lload 9
// 0c3: lxor
// 0c4: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0cc: iload 6
// 0ce: i2f
// 0cf: fconst_0
// 0d0: ldc 7.0
// 0d2: ldc 3.0
// 0d4: bipush 1
// 0d5: anewarray 1196
// 0d8: astore 27
// 0da: aload 27
// 0dc: bipush 0
// 0dd: aload 26
// 0df: aastore
// 0e0: aload 27
// 0e2: lload 21
// 0e4: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 0e7: iload 25
// 0e9: ifne 229
// 0ec: aload 5
// 0ee: getstatic su/catlean/jy.NORMAL Lsu/catlean/jy;
// 0f1: goto 0ff
// 0f4: ldc2_w 6165736862924786047
// 0f7: lload 9
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: if_acmpne 229
// 102: iload 7
// 104: ifeq 19c
// 107: goto 115
// 10a: ldc2_w 6165736862924786047
// 10d: lload 9
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 118: aload 4
// 11a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 11d: dup
// 11e: sipush 28122
// 121: ldc2_w 3752126534622088370
// 124: lload 9
// 126: lxor
// 127: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12f: iload 6
// 131: i2f
// 132: fconst_0
// 133: ldc 3.0
// 135: ldc 3.0
// 137: bipush 1
// 138: anewarray 1196
// 13b: astore 27
// 13d: aload 27
// 13f: bipush 0
// 140: aload 0
// 141: aload 8
// 143: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 146: aload 8
// 148: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 14b: fadd
// 14c: lload 19
// 14e: dup2_x1
// 14f: pop2
// 150: invokespecial su/catlean/ko.d (JF)Ljava/awt/Color;
// 153: aastore
// 154: aload 27
// 156: lload 21
// 158: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 15b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 15e: aload 4
// 160: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 163: dup
// 164: sipush 28122
// 167: ldc2_w 3752126534622088370
// 16a: lload 9
// 16c: lxor
// 16d: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 175: iload 6
// 177: i2f
// 178: ldc 3.0
// 17a: fadd
// 17b: fconst_0
// 17c: ldc 4.0
// 17e: ldc 3.0
// 180: bipush 1
// 181: anewarray 1196
// 184: astore 27
// 186: aload 27
// 188: bipush 0
// 189: aload 26
// 18b: aastore
// 18c: aload 27
// 18e: lload 21
// 190: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 193: iload 25
// 195: iload 1
// 196: iflt 1e8
// 199: ifne 229
// 19c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 19f: aload 4
// 1a1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1a4: dup
// 1a5: sipush 28122
// 1a8: ldc2_w 3752126534622088370
// 1ab: lload 9
// 1ad: lxor
// 1ae: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1b6: iload 6
// 1b8: i2f
// 1b9: fconst_0
// 1ba: ldc 7.0
// 1bc: ldc 3.0
// 1be: bipush 1
// 1bf: anewarray 1196
// 1c2: astore 27
// 1c4: aload 27
// 1c6: bipush 0
// 1c7: aload 0
// 1c8: aload 8
// 1ca: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 1cd: aload 8
// 1cf: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 1d2: fadd
// 1d3: lload 19
// 1d5: dup2_x1
// 1d6: pop2
// 1d7: invokespecial su/catlean/ko.d (JF)Ljava/awt/Color;
// 1da: aastore
// 1db: aload 27
// 1dd: lload 21
// 1df: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 1e2: iload 1
// 1e3: ifle 21b
// 1e6: iload 25
// 1e8: ifne 229
// 1eb: aload 4
// 1ed: getstatic net/minecraft/class_10799.field_56883 Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 1f0: aload 5
// 1f2: lload 11
// 1f4: iload 7
// 1f6: invokevirtual su/catlean/jy.Z (JZ)Lnet/minecraft/class_2960;
// 1f9: iload 6
// 1fb: bipush 0
// 1fc: sipush 4070
// 1ff: ldc2_w 3825808840909735654
// 202: lload 9
// 204: lxor
// 205: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: sipush 13627
// 20d: ldc2_w 8840803364805901324
// 210: lload 9
// 212: lxor
// 213: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: invokevirtual net/minecraft/class_332.method_52706 (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIII)V
// 21b: goto 229
// 21e: ldc2_w 6165736862924786047
// 221: lload 9
// 223: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 228: athrow
// 229: return
}

private final String x(float param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ko.g J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w 161445406686808626
// 09: lload 2
// 0a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: istore 4
// 11: fload 1
// 12: ldc 15.0
// 14: fcmpg
// 15: iload 4
// 17: ifeq 6d
// 1a: ifgt 69
// 1d: goto 2a
// 20: ldc2_w 180161728580132462
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: fload 1
// 2b: ldc 7.0
// 2d: fcmpl
// 2e: lload 2
// 2f: lconst_0
// 30: lcmp
// 31: ifle 6d
// 34: iload 4
// 36: ifeq 6d
// 39: goto 46
// 3c: ldc2_w 180161728580132462
// 3f: lload 2
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: ifle 69
// 49: goto 56
// 4c: ldc2_w 180161728580132462
// 4f: lload 2
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: getstatic net/minecraft/class_124.field_1054 Lnet/minecraft/class_124;
// 59: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001" ]
// 5e: areturn
// 5f: ldc2_w 180161728580132462
// 62: lload 2
// 63: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 68: athrow
// 69: fload 1
// 6a: ldc 15.0
// 6c: fcmpl
// 6d: ifle 83
// 70: getstatic net/minecraft/class_124.field_1060 Lnet/minecraft/class_124;
// 73: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001" ]
// 78: areturn
// 79: ldc2_w 180161728580132462
// 7c: lload 2
// 7d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82: athrow
// 83: getstatic net/minecraft/class_124.field_1061 Lnet/minecraft/class_124;
// 86: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001" ]
// 8b: areturn
}

private final String E(int param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ko.g J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 84362916603651
// 0b: lxor
// 0c: dup2
// 0d: bipush 16
// 0f: lushr
// 10: lstore 4
// 12: dup2
// 13: bipush 48
// 15: lshl
// 16: bipush 48
// 18: lushr
// 19: l2i
// 1a: istore 6
// 1c: pop2
// 1d: pop2
// 1e: ldc2_w 9161274079570003783
// 21: lload 2
// 22: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27: istore 7
// 29: iload 1
// 2a: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 2d: aconst_null
// 2e: lload 4
// 30: bipush 1
// 31: iload 6
// 33: i2c
// 34: aconst_null
// 35: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 38: iload 7
// 3a: ifne 6f
// 3d: if_icmple 60
// 40: goto 4d
// 43: ldc2_w 9181473527923008389
// 46: lload 2
// 47: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: athrow
// 4d: getstatic net/minecraft/class_124.field_1060 Lnet/minecraft/class_124;
// 50: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001" ]
// 55: areturn
// 56: ldc2_w 9181473527923008389
// 59: lload 2
// 5a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f: athrow
// 60: iload 1
// 61: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 64: aconst_null
// 65: lload 4
// 67: bipush 1
// 68: iload 6
// 6a: i2c
// 6b: aconst_null
// 6c: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 6f: lload 2
// 70: lconst_0
// 71: lcmp
// 72: ifle b7
// 75: iload 7
// 77: ifne b7
// 7a: if_icmpgt cd
// 7d: goto 8a
// 80: ldc2_w 9181473527923008389
// 83: lload 2
// 84: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: athrow
// 8a: iload 1
// 8b: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 8e: aconst_null
// 8f: lload 4
// 91: bipush 1
// 92: iload 6
// 94: i2c
// 95: aconst_null
// 96: invokestatic su/catlean/nf.f (Lsu/catlean/nf;Lnet/minecraft/class_1657;JICLjava/lang/Object;)I
// 99: isub
// 9a: invokestatic java/lang/Math.abs (I)I
// 9d: sipush 1757
// a0: ldc2_w 1423265008716375341
// a3: lload 2
// a4: lxor
// a5: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aa: goto b7
// ad: ldc2_w 9181473527923008389
// b0: lload 2
// b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b6: athrow
// b7: if_icmpge cd
// ba: getstatic net/minecraft/class_124.field_1054 Lnet/minecraft/class_124;
// bd: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001" ]
// c2: areturn
// c3: ldc2_w 9181473527923008389
// c6: lload 2
// c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cc: athrow
// cd: getstatic net/minecraft/class_124.field_1061 Lnet/minecraft/class_124;
// d0: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001" ]
// d5: areturn
}

private final Color d(long param1, float param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ko.g J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w -1781493958063263927
// 09: lload 1
// 0a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: istore 4
// 11: fload 3
// 12: ldc 15.0
// 14: fcmpg
// 15: iload 4
// 17: ifeq 79
// 1a: ifgt 75
// 1d: goto 2a
// 20: ldc2_w -1730687163098563819
// 23: lload 1
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: fload 3
// 2b: ldc 7.0
// 2d: fcmpl
// 2e: lload 1
// 2f: lconst_0
// 30: lcmp
// 31: ifle 79
// 34: iload 4
// 36: ifeq 79
// 39: goto 46
// 3c: ldc2_w -1730687163098563819
// 3f: lload 1
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: ifle 75
// 49: goto 56
// 4c: ldc2_w -1730687163098563819
// 4f: lload 1
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: getstatic java/awt/Color.YELLOW Ljava/awt/Color;
// 59: dup
// 5a: sipush 23333
// 5d: ldc2_w 2687284132467410952
// 60: lload 1
// 61: lxor
// 62: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6a: areturn
// 6b: ldc2_w -1730687163098563819
// 6e: lload 1
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: fload 3
// 76: ldc 15.0
// 78: fcmpl
// 79: ifle 9b
// 7c: getstatic java/awt/Color.GREEN Ljava/awt/Color;
// 7f: dup
// 80: sipush 12092
// 83: ldc2_w 7671439414470999090
// 86: lload 1
// 87: lxor
// 88: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 90: areturn
// 91: ldc2_w -1730687163098563819
// 94: lload 1
// 95: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a: athrow
// 9b: getstatic java/awt/Color.RED Ljava/awt/Color;
// 9e: dup
// 9f: sipush 18526
// a2: ldc2_w 1811125950082358050
// a5: lload 1
// a6: lxor
// a7: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// af: areturn
}

public final float z(float value, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ko.g J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -8150854263485794682
// 09: lload 2
// 0a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: istore 4
// 11: fload 1
// 12: iload 4
// 14: ifne 5e
// 17: invokestatic java/lang/Float.isNaN (F)Z
// 1a: ifne 50
// 1d: goto 2a
// 20: ldc2_w -8166681438898351548
// 23: lload 2
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: fload 1
// 2b: iload 4
// 2d: ifne 72
// 30: goto 3d
// 33: ldc2_w -8166681438898351548
// 36: lload 2
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: invokestatic java/lang/Float.isInfinite (F)Z
// 40: ifeq 5f
// 43: goto 50
// 46: ldc2_w -8166681438898351548
// 49: lload 2
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: fconst_1
// 51: goto 5e
// 54: ldc2_w -8166681438898351548
// 57: lload 2
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: freturn
// 5f: new java/math/BigDecimal
// 62: dup
// 63: fload 1
// 64: f2d
// 65: invokespecial java/math/BigDecimal.<init> (D)V
// 68: bipush 1
// 69: getstatic java/math/RoundingMode.HALF_UP Ljava/math/RoundingMode;
// 6c: invokevirtual java/math/BigDecimal.setScale (ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
// 6f: invokevirtual java/math/BigDecimal.floatValue ()F
// 72: freturn
}

private final float q(long param1, class_332 param3, float param4, float param5, class_1657 param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ko.g J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 13554538848078
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 7
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 56
// 019: lushr
// 01a: l2i
// 01b: istore 8
// 01d: dup2
// 01e: bipush 40
// 020: lshl
// 021: bipush 40
// 023: lushr
// 024: l2i
// 025: istore 9
// 027: pop2
// 028: dup2
// 029: ldc2_w 89843366980972
// 02c: lxor
// 02d: lstore 10
// 02f: dup2
// 030: ldc2_w 27530669567037
// 033: lxor
// 034: lstore 12
// 036: dup2
// 037: ldc2_w 76207598282938
// 03a: lxor
// 03b: lstore 14
// 03d: pop2
// 03e: ldc2_w 8123654421196343513
// 041: lload 1
// 042: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: fload 4
// 049: fstore 22
// 04b: istore 21
// 04d: new java/util/ArrayList
// 050: dup
// 051: aload 6
// 053: invokevirtual net/minecraft/class_1657.method_6026 ()Ljava/util/Collection;
// 056: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
// 059: astore 23
// 05b: iload 21
// 05d: ifne 08f
// 060: aload 23
// 062: invokevirtual java/util/ArrayList.isEmpty ()Z
// 065: ifeq 081
// 068: goto 075
// 06b: ldc2_w 8139485689704344603
// 06e: lload 1
// 06f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: athrow
// 075: fconst_0
// 076: freturn
// 077: ldc2_w 8139485689704344603
// 07a: lload 1
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: fload 22
// 083: aload 23
// 085: invokevirtual java/util/ArrayList.size ()I
// 088: i2f
// 089: ldc 12.5
// 08b: fmul
// 08c: fadd
// 08d: fstore 22
// 08f: fconst_0
// 090: fstore 24
// 092: invokestatic com/google/common/collect/Ordering.natural ()Lcom/google/common/collect/Ordering;
// 095: invokevirtual com/google/common/collect/Ordering.reverse ()Lcom/google/common/collect/Ordering;
// 098: aload 23
// 09a: checkcast java/lang/Iterable
// 09d: invokevirtual com/google/common/collect/Ordering.sortedCopy (Ljava/lang/Iterable;)Ljava/util/List;
// 0a0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0a5: astore 25
// 0a7: aload 25
// 0a9: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ae: ifeq 29c
// 0b1: aload 25
// 0b3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0b8: checkcast net/minecraft/class_1293
// 0bb: astore 26
// 0bd: lload 1
// 0be: lconst_0
// 0bf: lcmp
// 0c0: ifle 0cf
// 0c3: fload 22
// 0c5: ldc 25.0
// 0c7: fsub
// 0c8: iload 21
// 0ca: ifne 29e
// 0cd: fstore 22
// 0cf: ldc ""
// 0d1: astore 27
// 0d3: iload 21
// 0d5: lload 1
// 0d6: lconst_0
// 0d7: lcmp
// 0d8: iflt 0e3
// 0db: ifne 1b7
// 0de: aload 26
// 0e0: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 0e3: lload 1
// 0e4: lconst_0
// 0e5: lcmp
// 0e6: ifle 122
// 0e9: tableswitch 142 0 4 45 60 86 112 138
// 10c: ldc2_w 8139485689704344603
// 10f: lload 1
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: ldc "I"
// 118: astore 27
// 11a: lload 1
// 11b: lconst_0
// 11c: lcmp
// 11d: ifle 1b7
// 120: iload 21
// 122: ifeq 177
// 125: sipush 26948
// 128: ldc2_w 630510908767251823
// 12b: lload 1
// 12c: lxor
// 12d: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: astore 27
// 134: lload 1
// 135: lconst_0
// 136: lcmp
// 137: ifle 1b7
// 13a: iload 21
// 13c: ifeq 177
// 13f: sipush 767
// 142: ldc2_w 7020898301113190089
// 145: lload 1
// 146: lxor
// 147: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: astore 27
// 14e: lload 1
// 14f: lconst_0
// 150: lcmp
// 151: iflt 1b7
// 154: iload 21
// 156: ifeq 177
// 159: sipush 15937
// 15c: ldc2_w 3834760572983343623
// 15f: lload 1
// 160: lxor
// 161: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: astore 27
// 168: lload 1
// 169: lconst_0
// 16a: lcmp
// 16b: ifle 1b7
// 16e: iload 21
// 170: ifeq 177
// 173: ldc "V"
// 175: astore 27
// 177: aload 3
// 178: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 17b: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 17e: pop
// 17f: aload 3
// 180: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 183: fload 22
// 185: fload 5
// 187: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 18a: pop
// 18b: aload 3
// 18c: getstatic net/minecraft/class_10799.field_56883 Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 18f: aload 26
// 191: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
// 194: invokestatic net/minecraft/class_329.method_71644 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_2960;
// 197: bipush 0
// 198: bipush 0
// 199: sipush 25555
// 19c: ldc2_w 2262300453101244334
// 19f: lload 1
// 1a0: lxor
// 1a1: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: sipush 25555
// 1a9: ldc2_w 2262300453101244334
// 1ac: lload 1
// 1ad: lxor
// 1ae: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b3: bipush -1
// 1b4: invokevirtual net/minecraft/class_332.method_52707 (Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_2960;IIIII)V
// 1b7: aload 0
// 1b8: aload 26
// 1ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1bd: aload 26
// 1bf: iload 7
// 1c1: iload 8
// 1c3: i2b
// 1c4: iload 9
// 1c6: invokevirtual su/catlean/ko.Z (Lnet/minecraft/class_1293;IBI)Ljava/lang/String;
// 1c9: astore 28
// 1cb: lload 12
// 1cd: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 1d0: aload 3
// 1d1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 1d4: dup
// 1d5: sipush 28122
// 1d8: ldc2_w 3752168274187364822
// 1db: lload 1
// 1dc: lxor
// 1dd: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e5: aload 28
// 1e7: ldc 9.0
// 1e9: lload 12
// 1eb: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 1ee: lload 10
// 1f0: aload 28
// 1f2: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 1f5: fconst_2
// 1f6: fdiv
// 1f7: fsub
// 1f8: ldc -8.0
// 1fa: new java/awt/Color
// 1fd: dup
// 1fe: bipush -1
// 1ff: invokespecial java/awt/Color.<init> (I)V
// 202: bipush 0
// 203: bipush 0
// 204: sipush 5172
// 207: ldc2_w 1931104671281510509
// 20a: lload 1
// 20b: lxor
// 20c: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: aconst_null
// 212: astore 16
// 214: istore 17
// 216: istore 18
// 218: istore 19
// 21a: astore 20
// 21c: lload 14
// 21e: aload 20
// 220: iload 19
// 222: iload 18
// 224: iload 17
// 226: aload 16
// 228: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 22b: lload 12
// 22d: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 230: aload 3
// 231: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 234: dup
// 235: sipush 28122
// 238: ldc2_w 3752168274187364822
// 23b: lload 1
// 23c: lxor
// 23d: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 242: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 245: aload 27
// 247: ldc 9.0
// 249: lload 12
// 24b: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 24e: lload 10
// 250: aload 27
// 252: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 255: fconst_2
// 256: fdiv
// 257: fsub
// 258: ldc -16.0
// 25a: new java/awt/Color
// 25d: dup
// 25e: bipush -1
// 25f: invokespecial java/awt/Color.<init> (I)V
// 262: bipush 0
// 263: bipush 0
// 264: sipush 5172
// 267: ldc2_w 1931104671281510509
// 26a: lload 1
// 26b: lxor
// 26c: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 271: aconst_null
// 272: astore 16
// 274: istore 17
// 276: istore 18
// 278: istore 19
// 27a: astore 20
// 27c: lload 14
// 27e: aload 20
// 280: iload 19
// 282: iload 18
// 284: iload 17
// 286: aload 16
// 288: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 28b: aload 3
// 28c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 28f: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 292: pop
// 293: ldc 40.0
// 295: fstore 24
// 297: iload 21
// 299: ifeq 0a7
// 29c: fload 24
// 29e: freturn
}

private final void J(long param1, class_332 param3, int param4, class_1799 param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: bipush 32
// 003: lshl
// 004: iload 4
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/ko.g J
// 011: lxor
// 012: lstore 6
// 014: lload 6
// 016: dup2
// 017: ldc2_w 40832839972668
// 01a: lxor
// 01b: lstore 8
// 01d: dup2
// 01e: ldc2_w 79200265861264
// 021: lxor
// 022: lstore 10
// 024: pop2
// 025: ldc2_w 3113086043734123324
// 028: lload 6
// 02a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: istore 12
// 031: iload 12
// 033: ifeq 062
// 036: aload 5
// 038: getstatic net/minecraft/class_9334.field_49622 Lnet/minecraft/class_9331;
// 03b: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
// 03e: checkcast net/minecraft/class_9288
// 041: dup
// 042: ifnonnull 063
// 045: goto 053
// 048: ldc2_w 3138559091877853024
// 04b: lload 6
// 04d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: athrow
// 053: pop
// 054: goto 062
// 057: ldc2_w 3138559091877853024
// 05a: lload 6
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: return
// 063: astore 13
// 065: aload 5
// 067: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 06a: dup
// 06b: sipush 19345
// 06e: ldc2_w 6624774177941607587
// 071: lload 6
// 073: lxor
// 074: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 079: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 07c: astore 14
// 07e: aload 14
// 080: instanceof net/minecraft/class_1747
// 083: iload 12
// 085: lload 1
// 086: lconst_0
// 087: lcmp
// 088: ifle 0ba
// 08b: ifeq 0b8
// 08e: ifeq 0d3
// 091: goto 09f
// 094: ldc2_w 3138559091877853024
// 097: lload 6
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: aload 14
// 0a1: checkcast net/minecraft/class_1747
// 0a4: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
// 0a7: instanceof net/minecraft/class_2480
// 0aa: goto 0b8
// 0ad: ldc2_w 3138559091877853024
// 0b0: lload 6
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: iload 12
// 0ba: iload 4
// 0bc: ifge 0e5
// 0bf: ifeq 0e3
// 0c2: ifne 0d4
// 0c5: goto 0d3
// 0c8: ldc2_w 3138559091877853024
// 0cb: lload 6
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: return
// 0d4: aload 13
// 0d6: invokevirtual net/minecraft/class_9288.method_57489 ()Ljava/util/stream/Stream;
// 0d9: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
// 0de: invokeinterface java/util/List.isEmpty ()Z 1
// 0e3: iload 12
// 0e5: ifeq 131
// 0e8: ifeq 0fa
// 0eb: goto 0f9
// 0ee: ldc2_w 3138559091877853024
// 0f1: lload 6
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: return
// 0fa: lload 10
// 0fc: getstatic su/catlean/ko.a Lsu/catlean/ab;
// 0ff: aload 3
// 100: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 103: dup
// 104: sipush 28122
// 107: ldc2_w 3752137218960781997
// 10a: lload 6
// 10c: lxor
// 10d: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 115: ldc 12.0
// 117: ldc -79.0
// 119: ldc 169.0
// 11b: ldc 60.0
// 11d: fconst_0
// 11e: sipush 2192
// 121: ldc2_w 2035647761317511054
// 124: lload 6
// 126: lxor
// 127: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: aconst_null
// 12d: invokestatic su/catlean/ab.N (JLsu/catlean/ab;Lorg/joml/Matrix3x2fStack;FFFFFILjava/lang/Object;)V
// 130: bipush 0
// 131: istore 15
// 133: bipush 0
// 134: istore 16
// 136: aload 13
// 138: invokevirtual net/minecraft/class_9288.method_57489 ()Ljava/util/stream/Stream;
// 13b: invokeinterface java/util/stream/Stream.toList ()Ljava/util/List; 1
// 140: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 145: astore 17
// 147: aload 17
// 149: invokeinterface java/util/Iterator.hasNext ()Z 1
// 14e: ifeq 22b
// 151: aload 17
// 153: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 158: checkcast net/minecraft/class_1799
// 15b: astore 18
// 15d: aload 3
// 15e: aload 18
// 160: sipush 24309
// 163: ldc2_w 2111985254890924479
// 166: lload 6
// 168: lxor
// 169: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: iload 16
// 170: sipush 25555
// 173: ldc2_w 2262332615498290389
// 176: lload 6
// 178: lxor
// 179: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: imul
// 17f: iadd
// 180: sipush 9566
// 183: ldc2_w 4627300684850106990
// 186: lload 6
// 188: lxor
// 189: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: iload 15
// 190: sipush 25555
// 193: ldc2_w 2262332615498290389
// 196: lload 6
// 198: lxor
// 199: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: imul
// 19f: iadd
// 1a0: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 1a3: aload 3
// 1a4: lload 8
// 1a6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1a9: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
// 1ac: aload 18
// 1ae: sipush 24309
// 1b1: ldc2_w 2111985254890924479
// 1b4: lload 6
// 1b6: lxor
// 1b7: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: iload 16
// 1be: sipush 25555
// 1c1: ldc2_w 2262332615498290389
// 1c4: lload 6
// 1c6: lxor
// 1c7: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: imul
// 1cd: iadd
// 1ce: sipush 10997
// 1d1: ldc2_w 6410492383217163713
// 1d4: lload 6
// 1d6: lxor
// 1d7: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: iload 15
// 1de: sipush 25555
// 1e1: ldc2_w 2262332615498290389
// 1e4: lload 6
// 1e6: lxor
// 1e7: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ec: imul
// 1ed: iadd
// 1ee: invokevirtual net/minecraft/class_332.method_51431 (Lnet/minecraft/class_327;Lnet/minecraft/class_1799;II)V
// 1f1: iinc 16 1
// 1f4: iload 16
// 1f6: lload 1
// 1f7: lconst_0
// 1f8: lcmp
// 1f9: ifle 228
// 1fc: iload 12
// 1fe: ifeq 221
// 201: sipush 13627
// 204: ldc2_w 8840750847627297299
// 207: lload 6
// 209: lxor
// 20a: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20f: if_icmplt 147
// 212: goto 220
// 215: ldc2_w 3138559091877853024
// 218: lload 6
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: bipush 0
// 221: istore 16
// 223: iinc 15 1
// 226: iload 12
// 228: ifne 147
// 22b: lload 1
// 22c: lconst_0
// 22d: lcmp
// 22e: ifle 147
// 231: return
}

@NotNull
public final String Z(@NotNull class_1293 pe, int a, byte a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 2
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 56
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: iload 4
// 10: i2l
// 11: bipush 40
// 13: lshl
// 14: bipush 40
// 16: lushr
// 17: lor
// 18: getstatic su/catlean/ko.g J
// 1b: lxor
// 1c: lstore 5
// 1e: ldc2_w 1920862302914142924
// 21: lload 5
// 23: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: aload 1
// 29: sipush 9686
// 2c: ldc2_w 431192243375770500
// 2f: lload 5
// 31: lxor
// 32: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 3a: istore 7
// 3c: aload 1
// 3d: invokevirtual net/minecraft/class_1293.method_48559 ()Z
// 40: iload 7
// 42: ifne 89
// 45: ifeq 72
// 48: goto 56
// 4b: ldc2_w 1936549685730838030
// 4e: lload 5
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: sipush 1493
// 59: ldc2_w 64522259347549159
// 5c: lload 5
// 5e: lxor
// 5f: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64: goto f0
// 67: ldc2_w 1936549685730838030
// 6a: lload 5
// 6c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/RuntimeException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71: athrow
// 72: aload 1
// 73: invokevirtual net/minecraft/class_1293.method_5584 ()I
// 76: sipush 7004
// 79: ldc2_w 4840768598384745839
// 7c: lload 5
// 7e: lxor
// 7f: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: idiv
// 85: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
// 88: pop
// 89: sipush 32164
// 8c: ldc2_w 6594012579228963740
// 8f: lload 5
// 91: lxor
// 92: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97: astore 8
// 99: bipush 1
// 9a: anewarray 520
// 9d: astore 9
// 9f: aload 9
// a1: bipush 0
// a2: aload 1
// a3: invokevirtual net/minecraft/class_1293.method_5584 ()I
// a6: sipush 15382
// a9: ldc2_w 4030301958844267054
// ac: lload 5
// ae: lxor
// af: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b4: irem
// b5: sipush 17082
// b8: ldc2_w 134293418701964530
// bb: lload 5
// bd: lxor
// be: invokedynamic u (IJ)I bsm=su/catlean/ko.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c3: idiv
// c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// c7: aastore
// c8: aload 9
// ca: astore 9
// cc: aload 8
// ce: aload 9
// d0: aload 9
// d2: arraylength
// d3: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
// d6: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
// d9: dup
// da: sipush 25879
// dd: ldc2_w 638486737225403224
// e0: lload 5
// e2: lxor
// e3: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/ko.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// eb: invokedynamic makeConcatWithConstants (ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001:\u0001" ]
// f0: areturn
}

private static final boolean p() {
long var0 = g ^ 56532941414558L;
long var2 = var0 ^ 111585165115713L;
return u.v(var2);
}

static {
long var27 = g ^ 91108401090889L;
long var29 = var27 ^ 126741408276335L;
long var31 = var27 ^ 57313032068618L;
long var33 = var27 ^ 42712030388928L;
long var35 = var27 ^ 65513818782417L;
long var37 = var27 ^ 113191641335766L;
long var10001 = var27 ^ 35505832441842L;
int var39 = (int)((var27 ^ 35505832441842L) >>> 48);
int var40 = (int)((var27 ^ 35505832441842L) << 16 >>> 32);
int var41 = (int)(var10001 << 48 >>> 48);
long var42 = var27 ^ 98031366859902L;
int var44 = (int)((var27 ^ 93457300809813L) >>> 48);
long var45 = (var27 ^ 93457300809813L) << 16 >>> 16;
long var47 = var27 ^ 40924112629638L;
long var49 = var27 ^ 113958733944948L;
int[] var10000 = new int[3];
vm.a<"Å">(var10000, 7308824031609923306L, var27);
Cipher var18;
Cipher var56 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var56.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[112];
int var23 = 0;
String var22 = "\u0012ª³n\u0017ÈN+\u0011`;\n³\u0005`\u0088ß \u001f\u0015\u00ad\u001c\u0012X.¬Ô.m]Ò\u009e\u0010ï>Æü¤\r\u00164U-\u0001á\u001f\u0002ÿ>0ªþ\u0096k\u0006ÃîÜ\u0098ÚV(^\u0083ì\u001dhG5ÛhÝbÓÓ4u_\u0004¯Ík9¶Â\u009a\rò\u009e \\(\f\u00903\u000bc) >§(\u0092'\u008b\u0085ç\u0006\u009dÌdâ³õñe¼\u0003\u0082B¤hQQ\u009fï\u0017<Ën\u0017 \u008eÀñ\u000f\u00919 p\u001dZûf4\u0085l»Y_`¿oñ?C\u001d\u0005\\ágP¾c \u0003¾8\u0090Ã.m\u000f¾\u008eJ©i¢§ë¶\\SEÎyô@\u0098\u0088zFÜ'°\u000b {b\u0080\u0082ÓRÜ\u0090sú\u0081c\u0095\u0005\u0081'\u008a\u0014\r+?÷8\u0004¸\u0093\u009c\u0082Úz=æ@\u0013¯G\u0013Øü6\u00163\u0005\u009clJLMÂÿé\u009a,w,\u0015î²ál@XÍ°\u0088\u0085M@ç]\n¦Mps¾\u008c~*ÙuÎÈ\u0011Mh&®í'Fi\u0088X\u008f ¥\u0010WÎC³\u0003\u009eøÕ\\\u0011£è\u0088\u00adþ\u000f »NÉTJÿ&\u0016\u0094³Uîpù\n\u0087L=fÑbv\u0090Yz\rÿÑýÀ\u00adB\u0018\u001fDcû g.ÒKz\u0004\u0014¦\u0012{5²Õ\u0093¶Ð\u009fé¡\u0010cö|ÙËàÐ;®]tíSàDl($ÈØë\u001c\r\u0012ù\t¸Í:8\u008b\u0087e\u0086Â\u0091kðY\b_\u001d0?\u0081\u0005\u0002ªKB>^\u0084,\u008a÷\u001f\u0010¿F«©2\u0084f= Å\u0019 ÒÞ\u0095í\u0010ÉÒ¤K?³anÒ\u001e\u0092\u008e\u0016{iO øó\bÃ8ó±ÉÁ\u008a\u008fgÀ;n\u001b\u0015\u0010¢Î\b \u001e>Ål\fÕ\u0014´`Q@åæ+\u0007~ÏÃ@úËî\u008cË \u0080'Ù\u009f\u0082ÃÖ¨hS\u0012\u001fúH¼È2ì`A+1/U\u0016°²fN;íÕÛ2óÉ\u00121\u0087\u001a\u001d5/\u0099ûÏ\u0005 \u000fË\u0018¶\r§8¤÷\u0083 `b×\u0001M\\h\u008bT\u0011Ü¸^\u0010tj0Â\u0096£\u0011I_?'LÎlÛ\u0086cG\\03HÀÏcòû\u0015\bâÞ÷HV,È%ß\fûµ\u0013ðÝ\u0017%±\u0097\u009cx{\u0018}.ðO`È\u001bIúè rÍ\u0003)aÍèÎy+4\u0082Í@E\u0098Ã?`!cKK9a\u008d¦ÝÍùm+\u0012O\u000fù.9\u0095\f\u009eßC0sd´µ\u0010 \u001b5Ï\u000eZõÁï¢âP\u0097à¾¸\u0011\u0010B\u009ddÐ<ÇànWö\u008f8\fÃ\u009c\u0019¨Á\u008c¬´\u0091æî\u007f\u0081Î.ú\u0099êÃº3´j\u0013\u009b\u0081Î³ôN*!\u009e\u0014¹F\u0092íñ\u009f\u0083\u0010L¼8=\u0011ßÃcoU\u009d¸3\u00107\bY\u009f\u001c*LAf%\fèïo\u0081\r\u0010¥q\u009e\u0088mØ&\u008dqW\u0000G\u008a±Ù=\u0010·\u000e£ìò\u008aØ®#u\u0004¢h/\b³\u0010jí\n£\u0099\u009a\f\"8bkÜFV\u0001k\u0010+\u001fÝ\u0085UÝd\u001c¹ßñ8Ímâ¦ N\u0005E\u0007çA\u0095Ú`E¨P\u009fÎ\u008dÈì\u0082A\u0007w'H\u0000vd|£Á²dµ\u0018a\u0091_kÜ«ß÷úý<ªIÌ?ÝyÕA*Ì\u009e\u001aª8d\u0089 ×^ÃÙ¸\u0005\\{V\u008cq´M=É\u000f\u0015+µ®Mq\u0005ù\u000b\u0019\u0007¹£§ ¾E\u00977;À1kýç³¹\u001a\u0005\u008bÅ\u001b?%:L\u001e\u0018\u0097Ó\u008ecì¸®ºêH@\u0081÷\u0082âÛ1\u008a.s_\u0099%t\u0010\u0002B^\b( Bw¨\u001eÊBÖ\u0087ì\u0002\u0010Æ\u000e4yM%sÌ\u0082Cf\u008bB0Ù\u007f Xù ô$h\u0088Å«¥COe\u0002I\u0013ûíACZýB\u0000erg$\u0002G\u001c\u0081\u0010E©Þ\u0015\u0012¨çiÿÑX\u009f'\u0001æ\u0096\u0010\u0004Íå\u0019\u001fG\u0019öé\u001d\b\u001b\r¨È\u0016\u0018\u000f\u0018\u008c\u0091Ïîò\u001bí\u008a¹vaR%è\u009bgf5T\u0090Ç\u0090\u0018K+\u0099X\nËj;Cã\u008bèÀÜcÍ\u0098Ïx\u000b\u001f@\u0018\u009e\u0018ÕÁÃrºN´Z\u0017Ác÷up³\u0096ê\u0098³£\u0094¡§ô\u0010É\u0011Ù\u009b\u001d\u0012ØTÆ÷ï*÷z¹¹(!û\u0016\u008fMö`\u0085\u0007ÂqÊ\u0017ô-MÀ5¨\u008fõà\u0002vÎ4Ýë\u0087$m\u009eèNì\u0094{íÜz \u0097J\u0002#Ç^<w\u0006`¾ú\u0097¯\u0086¼\u0014Ê\u008cnü\u000f½.8Ø}\u0015\u0010\u009dft\u0018Ô\u0080æô\u0002\u001f\u001d¢+\u0010êÖS\u0000±\u0094§j\u0002¶ áz! Ì\u0096\u000eðhjûØ-S&\u0094Ý2\u000b\u0007à>W\u0084L\u0080D=9ß!\u0013Í\u0092r\u0004 \u008b£\u0087\u008aÁõ3=ç\u0096~\u009cxû>\u009fï\u0012í\u0089\u008dô\u008bÁ7-\u00129Ïþì¹\u0010?Ir<Ý\u0086ÊÁ<2äª\r¼cÆ\u0010\u0091±vÈ\u008f·vÚ\u0089ó\u0018\u0095Aqjf\u0010\u009e§b\u0012\u008c@õÉ³AÙà\u0095ób\u0084\u0010 Eüÿï\u008a$ó£tÅ\u0004²<ò\u008d Sö³Âp;à¸<\u0007E\u0010Y\u0015jQ\u0018ñ:\t\u009b8L±õøVKÝ~\u00101 ¯¶ýºÀ\u0004¸\u0007Xû\u0003ø l\u0093F$ß\u009b+ÿ´w\t.ÒLfRÛ\t' ù\u009dÇgúf:i\b²\u0093\u0097jç|ÞÊ\u0098c\u0019lL\u0007»ÿ¬\u009d\u0013Bûí\u001b\u0010d\u001b9<\u0097È×\tI¤îc\u0099ÝO\u009d([%µhMÆïj|Q\u009a\u0003\u0001wHßO\tÝ°½\u0005Õãw£ÔU\u001d\nWµõÛ\u0017No\u001cîÂ8ZA\f\u0088\u008f²=Ð\u0084õ`Í2F\u001d\u0019\t/ùÀn\u007f\u008d\u0082²²\u0099w\u008f\rê´\u0013\u001c\u0095\u0099TFéÑX\u008cû³Þàd:hu\u0007º\u00ad\u007fñ6(ÝÇb2ýÏÿj±\rwR\f\u008d\u0096í\u0086¶þU<Ê\u0099n\u00ad\tÙó8ã½VÜ¢*l#æ\u0002\u009e\u0018EòN\b»Uö0\u0084\u0004e\u0019\u008a\u008bI\u0000L¿º5ïÌ»Ë\u0018\u000bÀÍ\u009c\u0018Ø\u0095z(\u0083k\u0018\u008c\u009fø¸ú\u0087¥×°\u0017ìs(É\rzÃ\u001eä\u0004\u001ebcQbýÆvxûÿ\u008a?Y×ßäQ\u0000Ì²Ô¯\u0019ä\u000b^þôZ\u0006PP\u0010ë]@Õ,Ã2Cì0,à\u0086µ\u009bÿ\u0010%X´Ð\u0097æ¨\u0086«caõG=yZ ¶<É%F¹\u0014ÃÛ\u0095üó]¶³9\u000b4\u0092Î®\u00145â´\u0005ë\u0001fúKf \f\u0097\u008a\u009e!Þcº¯×+y·\u0019\u008d\u0019\u0011çe² ì\u009câí\u008c\u009då,éÕ^8Å¡\u0006P\u0087\u0081È6¬\u0018\u0091 \u0017^'%ë'ó±e\u0098\bFCí·ÍK0ã«\" 50Ò¶P£ Y#*ºÀ\u0083Å\u009fº\fh(« È\u0010-Z Õ[\u0096UQ\u009aÝ\u009c\u0088\u0093\t¡j\u0018]\u0019ø\u008fErTwÉ\n_&ÞìÿçuKÉ±kívî y£§\u0017ç×Á¢[pr\u001d\u0096\tü\u0099â°Ç,K´ßÌ\u0089HMàüçÓÇ\u0010\\\u0088)\u0085Ð\u001dF\u009c`\u0017\u0097Ö\tY`Ù\u0010+\u0084H¤\u0007@H\u009ewG8\u0000¢äB¯\u0010¸\u0004I}\u001båö\u009a\u0006\u007f¿L\tõÄK Á\u008bDÿ\u000e\u0012úÝ/§â\u001a/}\u0010ã9ÄÀ\u009d âæl\n\u00133\bÕi³\u00ad \u0015|*(ÏÆpÑ\u0082¤r¶«\u00ad}\u0014sgáòpí\u0089¥O<Q§\u009bèZª\u0018xñø:Â;\u009c\u008ds\u0005\u0080GPçägzt\u0085\u0004±,\u0006\u0085\u0010ì#ªØ¦\u008c±?Zm;#\bý!P\u0010P9ÃdØ æ¨\u0098ò\\\u00109¼SV\u0010ô\u00adËtÑMªø\u008a]\u0094hE\fþö \fÂ\u0006`\u001f¦\u001fND\u0014}\u00189{\u0088b\u0012b\u0085è\u0092«w\\Ò`Êã\u001e\u009e)^ *\ba\u009b\u00ad/r¹\u0087Ò*i~KIØ´b\u0015éÏ0\"\u001aØ=v,7¨»Û\u0018Aøñ]\u0094A\u0007erÞÓMÌ/\u008e±í\u008e\u0099aÃé/¼\u0010\u0016~ÄF$Dî/8i:~\u001a\u0002(9 p0Z¿B\u0096)Â÷a.ûNJn\u0000Ê\u009dK\u001cë\u008cyè®S\u007f¤\u007fj\u0095\u00198/[ü}\u0018 »\">\u001bÅúÕÈDøôRGhõ\r ÔSÊñ<\u0092\u0084½Û\u0014Ô¿\u008e\u000b\u0086cÜ£«\u008cj·*@g°b\u0001¥O:\u00ad\u0005 \u0016¾Â§ Ô¤\u0081ÞéEæd\u0085\u000bÝ°NÚ2\u0083ÈezSR\u0094ï\u0086íî<\u0010ÍÓz\u0011æY\u0091>s\u0000÷ìü±âc\u0010^\u0083öü{\u00153}6òH¥\u008bÅ\u00981\u0018¨/üõ\u000fv©\u009dxR!\u0010Ø\u009bÖh\u001d±\u00819æËEL AP+SØÁ\u001f×´þ\u009aFkQ\u009e\u0088'\u009bBXO\u0095\u0003\u000bÑní\u0094\u0090©_\u0015 ¯qÖ gð®Âò[\r\u008d©\u0007\u0099\u008dQú\u008a¬\u001a3VÛ;\u008a\u0016F\\ S- ¿Ã·lEc\u0095îÿV_ÓÂNa¹:¨\u0080^\u0085d¹æ¸qóÆ¿\f\u0015\u0005\u0018b&îò|E\u007fv^»©\u0092W\u009eÐ\u0097\u009f·Cß$\u000fPÒ\u0018\u0006\u0016\u0093\u0085ð\u008f\u0004\u0004â¤\u008cu\u0097\u008c<\u001b©Çå\u0092¸i}©(\u008ei¤4Ô5§j¬±<\\\u00ad\u001cy\\\u0004\u009a£nÎKch·&#ºEO\u009dÑE?C\u009a~È\u001a¾ Îø/ÿ*\u0006Ýë\u008f\r\u0099N#~ÛN{\u009f\u0012\u0094$¾mhÊ©p\u0090\u0019¶\u007f# \u007f=üã¦{ÖG/Ú\u0099\u0096\u0099\u0080\u009dV¿\u008e[By\u0083\u0093\u001ea\u0097Ç4:\u0012Sä\u0010\u001fD\u0088I«Ï§%¹\u0017ºïÂq\u008e³\u0018`£ãfOxå;\u0087À\u0013Ð9oõ\u00927ïy\u007f>ÃÇ,\u0010\u000eö¸\u0007^0\u0089DNì\u0013Y>Q\u007f9\u0018¼ÂLk!(\u0098É2\nd\\\u0089_\u0018ãj*ÅÆ\u0087\u001b\u0088\u0016\u0010\u001aP\u007f \u0000\u008a\u0088W¹ä\u0015\u008c\u001e÷\u0019[ f°\u0013= \u001cwÎ×3¯\u009e×*LÜ\fg\f\u001a\u000e)\u001e#º©èÏùÿ.° ®\u0019}\u0019\u0085Ý#\u0097íi\u0010që×Ö\tbüáe\u009d ô\u008c\u0003)3¢ð\u0089\u0000\u0000\u0010£HÁÀSã\u0085Ïà\u0095\u000fÝ\r9=û8u=\u0092ûMRhçß=!\u009f8\u009e\u0097&tî>\u009cÍ\u008e\u0097*¼Ì¶Ð¢\u0004¾ÉØ\u0098ÏãçþÖü+\n4\u0016hãéÙÙ\u0091Ú\u0080¡¼\u000b¨ \u009aþÍ}d¥I=Ñ\nòGA Ytý19dN\u0006oÂ\u0018¦ Û\u001b/\u0098\u0007\u00108®\u0094áÔNà\u0002×ÞR\u0098OóÂ\u009e@\f½\u009eA\ròE'$EÛ¢\u0001z}\u009dj-\u0000\u0015ÿ\u008dsÚÕ:8\u009c\u0017\u009eð\f\u0000±\u0089\u0098%?t.¶¶Ê\u0003\u001báHê¥®b¦üðÜîj56¼ò®g³\u0018b*\rçGvk4\u00ad9\u0081¶\u009f¼ßp\u0097\u001cï\u0080T\tà\u0010 \u001bÚD%v]ðµuL\u0011\r<f¤étiRX ?pÂ¦\u008e¤w\u0085(s\u009a øR-Ìt\u0017v-|µÆçG\u007fßnÈVÇñDS\u00adÞÀëêC÷*µ¦\u0018\u0012î\u0015DpKMuÎ¢\bÖª\\\u0083\u0000pÉ\u0099\u0014^£\u0089e";
int var24 = "\u0012ª³n\u0017ÈN+\u0011`;\n³\u0005`\u0088ß \u001f\u0015\u00ad\u001c\u0012X.¬Ô.m]Ò\u009e\u0010ï>Æü¤\r\u00164U-\u0001á\u001f\u0002ÿ>0ªþ\u0096k\u0006ÃîÜ\u0098ÚV(^\u0083ì\u001dhG5ÛhÝbÓÓ4u_\u0004¯Ík9¶Â\u009a\rò\u009e \\(\f\u00903\u000bc) >§(\u0092'\u008b\u0085ç\u0006\u009dÌdâ³õñe¼\u0003\u0082B¤hQQ\u009fï\u0017<Ën\u0017 \u008eÀñ\u000f\u00919 p\u001dZûf4\u0085l»Y_`¿oñ?C\u001d\u0005\\ágP¾c \u0003¾8\u0090Ã.m\u000f¾\u008eJ©i¢§ë¶\\SEÎyô@\u0098\u0088zFÜ'°\u000b {b\u0080\u0082ÓRÜ\u0090sú\u0081c\u0095\u0005\u0081'\u008a\u0014\r+?÷8\u0004¸\u0093\u009c\u0082Úz=æ@\u0013¯G\u0013Øü6\u00163\u0005\u009clJLMÂÿé\u009a,w,\u0015î²ál@XÍ°\u0088\u0085M@ç]\n¦Mps¾\u008c~*ÙuÎÈ\u0011Mh&®í'Fi\u0088X\u008f ¥\u0010WÎC³\u0003\u009eøÕ\\\u0011£è\u0088\u00adþ\u000f »NÉTJÿ&\u0016\u0094³Uîpù\n\u0087L=fÑbv\u0090Yz\rÿÑýÀ\u00adB\u0018\u001fDcû g.ÒKz\u0004\u0014¦\u0012{5²Õ\u0093¶Ð\u009fé¡\u0010cö|ÙËàÐ;®]tíSàDl($ÈØë\u001c\r\u0012ù\t¸Í:8\u008b\u0087e\u0086Â\u0091kðY\b_\u001d0?\u0081\u0005\u0002ªKB>^\u0084,\u008a÷\u001f\u0010¿F«©2\u0084f= Å\u0019 ÒÞ\u0095í\u0010ÉÒ¤K?³anÒ\u001e\u0092\u008e\u0016{iO øó\bÃ8ó±ÉÁ\u008a\u008fgÀ;n\u001b\u0015\u0010¢Î\b \u001e>Ål\fÕ\u0014´`Q@åæ+\u0007~ÏÃ@úËî\u008cË \u0080'Ù\u009f\u0082ÃÖ¨hS\u0012\u001fúH¼È2ì`A+1/U\u0016°²fN;íÕÛ2óÉ\u00121\u0087\u001a\u001d5/\u0099ûÏ\u0005 \u000fË\u0018¶\r§8¤÷\u0083 `b×\u0001M\\h\u008bT\u0011Ü¸^\u0010tj0Â\u0096£\u0011I_?'LÎlÛ\u0086cG\\03HÀÏcòû\u0015\bâÞ÷HV,È%ß\fûµ\u0013ðÝ\u0017%±\u0097\u009cx{\u0018}.ðO`È\u001bIúè rÍ\u0003)aÍèÎy+4\u0082Í@E\u0098Ã?`!cKK9a\u008d¦ÝÍùm+\u0012O\u000fù.9\u0095\f\u009eßC0sd´µ\u0010 \u001b5Ï\u000eZõÁï¢âP\u0097à¾¸\u0011\u0010B\u009ddÐ<ÇànWö\u008f8\fÃ\u009c\u0019¨Á\u008c¬´\u0091æî\u007f\u0081Î.ú\u0099êÃº3´j\u0013\u009b\u0081Î³ôN*!\u009e\u0014¹F\u0092íñ\u009f\u0083\u0010L¼8=\u0011ßÃcoU\u009d¸3\u00107\bY\u009f\u001c*LAf%\fèïo\u0081\r\u0010¥q\u009e\u0088mØ&\u008dqW\u0000G\u008a±Ù=\u0010·\u000e£ìò\u008aØ®#u\u0004¢h/\b³\u0010jí\n£\u0099\u009a\f\"8bkÜFV\u0001k\u0010+\u001fÝ\u0085UÝd\u001c¹ßñ8Ímâ¦ N\u0005E\u0007çA\u0095Ú`E¨P\u009fÎ\u008dÈì\u0082A\u0007w'H\u0000vd|£Á²dµ\u0018a\u0091_kÜ«ß÷úý<ªIÌ?ÝyÕA*Ì\u009e\u001aª8d\u0089 ×^ÃÙ¸\u0005\\{V\u008cq´M=É\u000f\u0015+µ®Mq\u0005ù\u000b\u0019\u0007¹£§ ¾E\u00977;À1kýç³¹\u001a\u0005\u008bÅ\u001b?%:L\u001e\u0018\u0097Ó\u008ecì¸®ºêH@\u0081÷\u0082âÛ1\u008a.s_\u0099%t\u0010\u0002B^\b( Bw¨\u001eÊBÖ\u0087ì\u0002\u0010Æ\u000e4yM%sÌ\u0082Cf\u008bB0Ù\u007f Xù ô$h\u0088Å«¥COe\u0002I\u0013ûíACZýB\u0000erg$\u0002G\u001c\u0081\u0010E©Þ\u0015\u0012¨çiÿÑX\u009f'\u0001æ\u0096\u0010\u0004Íå\u0019\u001fG\u0019öé\u001d\b\u001b\r¨È\u0016\u0018\u000f\u0018\u008c\u0091Ïîò\u001bí\u008a¹vaR%è\u009bgf5T\u0090Ç\u0090\u0018K+\u0099X\nËj;Cã\u008bèÀÜcÍ\u0098Ïx\u000b\u001f@\u0018\u009e\u0018ÕÁÃrºN´Z\u0017Ác÷up³\u0096ê\u0098³£\u0094¡§ô\u0010É\u0011Ù\u009b\u001d\u0012ØTÆ÷ï*÷z¹¹(!û\u0016\u008fMö`\u0085\u0007ÂqÊ\u0017ô-MÀ5¨\u008fõà\u0002vÎ4Ýë\u0087$m\u009eèNì\u0094{íÜz \u0097J\u0002#Ç^<w\u0006`¾ú\u0097¯\u0086¼\u0014Ê\u008cnü\u000f½.8Ø}\u0015\u0010\u009dft\u0018Ô\u0080æô\u0002\u001f\u001d¢+\u0010êÖS\u0000±\u0094§j\u0002¶ áz! Ì\u0096\u000eðhjûØ-S&\u0094Ý2\u000b\u0007à>W\u0084L\u0080D=9ß!\u0013Í\u0092r\u0004 \u008b£\u0087\u008aÁõ3=ç\u0096~\u009cxû>\u009fï\u0012í\u0089\u008dô\u008bÁ7-\u00129Ïþì¹\u0010?Ir<Ý\u0086ÊÁ<2äª\r¼cÆ\u0010\u0091±vÈ\u008f·vÚ\u0089ó\u0018\u0095Aqjf\u0010\u009e§b\u0012\u008c@õÉ³AÙà\u0095ób\u0084\u0010 Eüÿï\u008a$ó£tÅ\u0004²<ò\u008d Sö³Âp;à¸<\u0007E\u0010Y\u0015jQ\u0018ñ:\t\u009b8L±õøVKÝ~\u00101 ¯¶ýºÀ\u0004¸\u0007Xû\u0003ø l\u0093F$ß\u009b+ÿ´w\t.ÒLfRÛ\t' ù\u009dÇgúf:i\b²\u0093\u0097jç|ÞÊ\u0098c\u0019lL\u0007»ÿ¬\u009d\u0013Bûí\u001b\u0010d\u001b9<\u0097È×\tI¤îc\u0099ÝO\u009d([%µhMÆïj|Q\u009a\u0003\u0001wHßO\tÝ°½\u0005Õãw£ÔU\u001d\nWµõÛ\u0017No\u001cîÂ8ZA\f\u0088\u008f²=Ð\u0084õ`Í2F\u001d\u0019\t/ùÀn\u007f\u008d\u0082²²\u0099w\u008f\rê´\u0013\u001c\u0095\u0099TFéÑX\u008cû³Þàd:hu\u0007º\u00ad\u007fñ6(ÝÇb2ýÏÿj±\rwR\f\u008d\u0096í\u0086¶þU<Ê\u0099n\u00ad\tÙó8ã½VÜ¢*l#æ\u0002\u009e\u0018EòN\b»Uö0\u0084\u0004e\u0019\u008a\u008bI\u0000L¿º5ïÌ»Ë\u0018\u000bÀÍ\u009c\u0018Ø\u0095z(\u0083k\u0018\u008c\u009fø¸ú\u0087¥×°\u0017ìs(É\rzÃ\u001eä\u0004\u001ebcQbýÆvxûÿ\u008a?Y×ßäQ\u0000Ì²Ô¯\u0019ä\u000b^þôZ\u0006PP\u0010ë]@Õ,Ã2Cì0,à\u0086µ\u009bÿ\u0010%X´Ð\u0097æ¨\u0086«caõG=yZ ¶<É%F¹\u0014ÃÛ\u0095üó]¶³9\u000b4\u0092Î®\u00145â´\u0005ë\u0001fúKf \f\u0097\u008a\u009e!Þcº¯×+y·\u0019\u008d\u0019\u0011çe² ì\u009câí\u008c\u009då,éÕ^8Å¡\u0006P\u0087\u0081È6¬\u0018\u0091 \u0017^'%ë'ó±e\u0098\bFCí·ÍK0ã«\" 50Ò¶P£ Y#*ºÀ\u0083Å\u009fº\fh(« È\u0010-Z Õ[\u0096UQ\u009aÝ\u009c\u0088\u0093\t¡j\u0018]\u0019ø\u008fErTwÉ\n_&ÞìÿçuKÉ±kívî y£§\u0017ç×Á¢[pr\u001d\u0096\tü\u0099â°Ç,K´ßÌ\u0089HMàüçÓÇ\u0010\\\u0088)\u0085Ð\u001dF\u009c`\u0017\u0097Ö\tY`Ù\u0010+\u0084H¤\u0007@H\u009ewG8\u0000¢äB¯\u0010¸\u0004I}\u001båö\u009a\u0006\u007f¿L\tõÄK Á\u008bDÿ\u000e\u0012úÝ/§â\u001a/}\u0010ã9ÄÀ\u009d âæl\n\u00133\bÕi³\u00ad \u0015|*(ÏÆpÑ\u0082¤r¶«\u00ad}\u0014sgáòpí\u0089¥O<Q§\u009bèZª\u0018xñø:Â;\u009c\u008ds\u0005\u0080GPçägzt\u0085\u0004±,\u0006\u0085\u0010ì#ªØ¦\u008c±?Zm;#\bý!P\u0010P9ÃdØ æ¨\u0098ò\\\u00109¼SV\u0010ô\u00adËtÑMªø\u008a]\u0094hE\fþö \fÂ\u0006`\u001f¦\u001fND\u0014}\u00189{\u0088b\u0012b\u0085è\u0092«w\\Ò`Êã\u001e\u009e)^ *\ba\u009b\u00ad/r¹\u0087Ò*i~KIØ´b\u0015éÏ0\"\u001aØ=v,7¨»Û\u0018Aøñ]\u0094A\u0007erÞÓMÌ/\u008e±í\u008e\u0099aÃé/¼\u0010\u0016~ÄF$Dî/8i:~\u001a\u0002(9 p0Z¿B\u0096)Â÷a.ûNJn\u0000Ê\u009dK\u001cë\u008cyè®S\u007f¤\u007fj\u0095\u00198/[ü}\u0018 »\">\u001bÅúÕÈDøôRGhõ\r ÔSÊñ<\u0092\u0084½Û\u0014Ô¿\u008e\u000b\u0086cÜ£«\u008cj·*@g°b\u0001¥O:\u00ad\u0005 \u0016¾Â§ Ô¤\u0081ÞéEæd\u0085\u000bÝ°NÚ2\u0083ÈezSR\u0094ï\u0086íî<\u0010ÍÓz\u0011æY\u0091>s\u0000÷ìü±âc\u0010^\u0083öü{\u00153}6òH¥\u008bÅ\u00981\u0018¨/üõ\u000fv©\u009dxR!\u0010Ø\u009bÖh\u001d±\u00819æËEL AP+SØÁ\u001f×´þ\u009aFkQ\u009e\u0088'\u009bBXO\u0095\u0003\u000bÑní\u0094\u0090©_\u0015 ¯qÖ gð®Âò[\r\u008d©\u0007\u0099\u008dQú\u008a¬\u001a3VÛ;\u008a\u0016F\\ S- ¿Ã·lEc\u0095îÿV_ÓÂNa¹:¨\u0080^\u0085d¹æ¸qóÆ¿\f\u0015\u0005\u0018b&îò|E\u007fv^»©\u0092W\u009eÐ\u0097\u009f·Cß$\u000fPÒ\u0018\u0006\u0016\u0093\u0085ð\u008f\u0004\u0004â¤\u008cu\u0097\u008c<\u001b©Çå\u0092¸i}©(\u008ei¤4Ô5§j¬±<\\\u00ad\u001cy\\\u0004\u009a£nÎKch·&#ºEO\u009dÑE?C\u009a~È\u001a¾ Îø/ÿ*\u0006Ýë\u008f\r\u0099N#~ÛN{\u009f\u0012\u0094$¾mhÊ©p\u0090\u0019¶\u007f# \u007f=üã¦{ÖG/Ú\u0099\u0096\u0099\u0080\u009dV¿\u008e[By\u0083\u0093\u001ea\u0097Ç4:\u0012Sä\u0010\u001fD\u0088I«Ï§%¹\u0017ºïÂq\u008e³\u0018`£ãfOxå;\u0087À\u0013Ð9oõ\u00927ïy\u007f>ÃÇ,\u0010\u000eö¸\u0007^0\u0089DNì\u0013Y>Q\u007f9\u0018¼ÂLk!(\u0098É2\nd\\\u0089_\u0018ãj*ÅÆ\u0087\u001b\u0088\u0016\u0010\u001aP\u007f \u0000\u008a\u0088W¹ä\u0015\u008c\u001e÷\u0019[ f°\u0013= \u001cwÎ×3¯\u009e×*LÜ\fg\f\u001a\u000e)\u001e#º©èÏùÿ.° ®\u0019}\u0019\u0085Ý#\u0097íi\u0010që×Ö\tbüáe\u009d ô\u008c\u0003)3¢ð\u0089\u0000\u0000\u0010£HÁÀSã\u0085Ïà\u0095\u000fÝ\r9=û8u=\u0092ûMRhçß=!\u009f8\u009e\u0097&tî>\u009cÍ\u008e\u0097*¼Ì¶Ð¢\u0004¾ÉØ\u0098ÏãçþÖü+\n4\u0016hãéÙÙ\u0091Ú\u0080¡¼\u000b¨ \u009aþÍ}d¥I=Ñ\nòGA Ytý19dN\u0006oÂ\u0018¦ Û\u001b/\u0098\u0007\u00108®\u0094áÔNà\u0002×ÞR\u0098OóÂ\u009e@\f½\u009eA\ròE'$EÛ¢\u0001z}\u009dj-\u0000\u0015ÿ\u008dsÚÕ:8\u009c\u0017\u009eð\f\u0000±\u0089\u0098%?t.¶¶Ê\u0003\u001báHê¥®b¦üðÜîj56¼ò®g³\u0018b*\rçGvk4\u00ad9\u0081¶\u009f¼ßp\u0097\u001cï\u0080T\tà\u0010 \u001bÚD%v]ðµuL\u0011\r<f¤étiRX ?pÂ¦\u008e¤w\u0085(s\u009a øR-Ìt\u0017v-|µÆçG\u007fßnÈVÇñDS\u00adÞÀëêC÷*µ¦\u0018\u0012î\u0015DpKMuÎ¢\bÖª\\\u0083\u0000pÉ\u0099\u0014^£\u0089e"
.length();
char var21 = ' ';
int var54 = -1;

label64:
while (true) {
String var57 = var22.substring(++var54, var54 + var21);
byte var62 = -1;

while (true) {
byte[] var26 = var18.doFinal(var57.getBytes("ISO-8859-1"));
String var72 = b(var26).intern();
switch (var62) {
case 0:
var25[var23++] = var72;
if ((var54 += var21) >= var24) {
h = var25;
i = new String[112];
L = new HashMap(13);
Cipher var7;
Cipher var59 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var27 << var8 * 8 >>> 56);
}

var59.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var13 = new long[106];
int var10 = 0;
String var11 = "{h¨BMòÔ#·\u0090XáQ\u0000\u001d\u009d¤]iE|&.ad\u0011¦AÕ|Åð\u0089Â\u009ev+ÚÔ\u0081\u008cw\u0088ËV¢\u0007}¦\u0007\u0096K$Ì_Ú%$ÑÒ\u001a\u008dxáNW7KKìù¾cù¾ÂaT°¢\u001fý¹æ\u0007AºÑ+d®3À·D\fð\u000eú\b¤ÔØ\u00883hIÜ\u0016Æ\u001f×¬\\o\u0091ÜÔUu:Æ<Ù\u0090\u009br\u0081[aðIõÓ\u008cJÅºÉÇÌ+¹\u008aò\u0099\u001b\u001d;2ç\u0092\u0085êpxü0?\u0011\u0084÷Ù'(¸¥zääÐ¸\u0087L\u0093xTòO×0\u0086\u0011 \u0017§\u008fÄ\u0086çoÿ¥ù\u008b×,.\u0085zm²N¤L\n \u0004yµ)2ð<\u009c\u0002\u0002\r¹ê\u0010\u0082\u0089ÉH\t+õ\u0010'¬|xÕ\u001dS\rnÔÿãà \u0090>\u008e\t;QF*ùaäø\u009b§õNi\u0014Èêç\u001dy?P$Þ|¥ì\u00ad\tdÌm´Gúá$â$Èâì£\u0003Ý\u0091VãíÉa¼$;Ü|\u0083WD»·INè\u009c\u0004À\u0099ÒGß£p\bJRC@¢\u0019ØßÜÍ\u008eR\u0011ù£\u008a!õ\u0095%t¥Z¤\u0097\u009c(w\u009al¢;¨Äo\u0083\u009ah\u0010\b\b\"e£â\u009eK5)Ö\u008a\u0013ö\u00887-(Þ²\rÜ¦ä\u0084\u001cµÛ;\u008d6L\u008ctª0ÛQÆ\u008d\b#uµ¯VRí6\u0085§Á/{ï\u009a&½31Ê=8\u008e\\\u0001\u0015\"¬\u000eFË\u0092XæFè[¬^ël\u000bð¦°\f\u0086w\u0088+3l¬\u0019iR\u0089éÑ\u0019\u0005\u0091\u0004\u0080PÿÇ7ùÛÑk\u009fË\u0085\u0016\u0017þð¢â>â\u007fñõÑÆ@KUÜ\u0081 \u0091±\u0090\u009f\u008crê_\u0097ò7\u0087<©éÀ´º\u0092\u0090Ä\fÀÚn5\u008a7f=Æ6M\u000eÓòY(Úp\u0016,µ\u0084Uø\u001d\u009f§B§Å\u0014j¯\u0005\u0097seHùÈE¾\u008bÛÌ¤*ç<ôîyí\u000bªOùO«\u0089\u009f=ÒÔ{Îñ<¸\u0001`\u0082Gr>\u0017wï$ÒC\bE\u0006W\u0088Ü\u0006\u000e\u0011\u0001o8\u001a;F¹Ì¢pDÏI³T`=\u001eÓÖ\u0013Ëh\u0093ñÈª!*¡\u0099{\u0005Vlüd½â9½\u001bl\u001d\u0083o4¢®gp½Ò^%hÇ»è¯^ù|1\u0082\u0002|2\u008fÞ\u000b\u0011éÉþ\u0097\u0099¤\u0019É\u0011\u009c\u000eö\u007fí³&Õ\fvÚ¬\u001dÀ\u001cî=Ý\u0085\u0015'\u0094à\u0013\u001c +\u0007+\u0084@\u009b\u0014:/Ñ<6Qy\u0012x¸eo\u000f\u0014\u008c-Fó\u0095_³(úµ\u0083¸BdÓ6\r\n¢\u0016v\u0086T«æbCÎ¼ïæ<Ç\u0001\u0018&\rã(³'\u0012fÒüµ\u001f\u0097nÂ|Y¯Þ²\u0006EyM6!rÚ\u0007gTÜ¸\u000f\u0004\u008eE1ôÛýÞû\u0013£a\u0081qT\nü¿)@\u0097¯æ\u0094\u001dê·L\u001c";
int var12 = "{h¨BMòÔ#·\u0090XáQ\u0000\u001d\u009d¤]iE|&.ad\u0011¦AÕ|Åð\u0089Â\u009ev+ÚÔ\u0081\u008cw\u0088ËV¢\u0007}¦\u0007\u0096K$Ì_Ú%$ÑÒ\u001a\u008dxáNW7KKìù¾cù¾ÂaT°¢\u001fý¹æ\u0007AºÑ+d®3À·D\fð\u000eú\b¤ÔØ\u00883hIÜ\u0016Æ\u001f×¬\\o\u0091ÜÔUu:Æ<Ù\u0090\u009br\u0081[aðIõÓ\u008cJÅºÉÇÌ+¹\u008aò\u0099\u001b\u001d;2ç\u0092\u0085êpxü0?\u0011\u0084÷Ù'(¸¥zääÐ¸\u0087L\u0093xTòO×0\u0086\u0011 \u0017§\u008fÄ\u0086çoÿ¥ù\u008b×,.\u0085zm²N¤L\n \u0004yµ)2ð<\u009c\u0002\u0002\r¹ê\u0010\u0082\u0089ÉH\t+õ\u0010'¬|xÕ\u001dS\rnÔÿãà \u0090>\u008e\t;QF*ùaäø\u009b§õNi\u0014Èêç\u001dy?P$Þ|¥ì\u00ad\tdÌm´Gúá$â$Èâì£\u0003Ý\u0091VãíÉa¼$;Ü|\u0083WD»·INè\u009c\u0004À\u0099ÒGß£p\bJRC@¢\u0019ØßÜÍ\u008eR\u0011ù£\u008a!õ\u0095%t¥Z¤\u0097\u009c(w\u009al¢;¨Äo\u0083\u009ah\u0010\b\b\"e£â\u009eK5)Ö\u008a\u0013ö\u00887-(Þ²\rÜ¦ä\u0084\u001cµÛ;\u008d6L\u008ctª0ÛQÆ\u008d\b#uµ¯VRí6\u0085§Á/{ï\u009a&½31Ê=8\u008e\\\u0001\u0015\"¬\u000eFË\u0092XæFè[¬^ël\u000bð¦°\f\u0086w\u0088+3l¬\u0019iR\u0089éÑ\u0019\u0005\u0091\u0004\u0080PÿÇ7ùÛÑk\u009fË\u0085\u0016\u0017þð¢â>â\u007fñõÑÆ@KUÜ\u0081 \u0091±\u0090\u009f\u008crê_\u0097ò7\u0087<©éÀ´º\u0092\u0090Ä\fÀÚn5\u008a7f=Æ6M\u000eÓòY(Úp\u0016,µ\u0084Uø\u001d\u009f§B§Å\u0014j¯\u0005\u0097seHùÈE¾\u008bÛÌ¤*ç<ôîyí\u000bªOùO«\u0089\u009f=ÒÔ{Îñ<¸\u0001`\u0082Gr>\u0017wï$ÒC\bE\u0006W\u0088Ü\u0006\u000e\u0011\u0001o8\u001a;F¹Ì¢pDÏI³T`=\u001eÓÖ\u0013Ëh\u0093ñÈª!*¡\u0099{\u0005Vlüd½â9½\u001bl\u001d\u0083o4¢®gp½Ò^%hÇ»è¯^ù|1\u0082\u0002|2\u008fÞ\u000b\u0011éÉþ\u0097\u0099¤\u0019É\u0011\u009c\u000eö\u007fí³&Õ\fvÚ¬\u001dÀ\u001cî=Ý\u0085\u0015'\u0094à\u0013\u001c +\u0007+\u0084@\u009b\u0014:/Ñ<6Qy\u0012x¸eo\u000f\u0014\u008c-Fó\u0095_³(úµ\u0083¸BdÓ6\r\n¢\u0016v\u0086T«æbCÎ¼ïæ<Ç\u0001\u0018&\rã(³'\u0012fÒüµ\u001f\u0097nÂ|Y¯Þ²\u0006EyM6!rÚ\u0007gTÜ¸\u000f\u0004\u008eE1ôÛýÞû\u0013£a\u0081qT\nü¿)@\u0097¯æ\u0094\u001dê·L\u001c"
.length();
byte var9 = 0;

label46:
while (true) {
byte var66 = var9;
var9 += 8;
byte[] var14 = var11.substring(var66, var9).getBytes("ISO-8859-1");
long[] var60 = var13;
int var67 = var10++;
long var76 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var81 = -1;

while (true) {
long var15 = var76;
byte[] var17 = var7.doFinal(
new byte[]{
(byte)(var15 >>> 56),
(byte)(var15 >>> 48),
(byte)(var15 >>> 40),
(byte)(var15 >>> 32),
(byte)(var15 >>> 24),
(byte)(var15 >>> 16),
(byte)(var15 >>> 8),
(byte)var15
}
);
long var84 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var81) {
case 0:
var60[var67] = var84;
if (var9 >= var12) {
B = var13;
C = new Integer[106];
Cipher var2;
Cipher var61 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var61.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -2874376893843276662L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var79 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var69 = -1;
long var0 = var79;
KProperty[] var51 = new KProperty[c<"u">(27904, 4500896185973150813L ^ var27)];
var51[0] = Reflection.property1(new PropertyReference1Impl(ko.class, b<"t">(341, 3944821102907052107L ^ var27), b<"t">(29437, 8592705475873350557L ^ var27), 0));
var51[1] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(17242, 8906152411286540810L ^ var27), b<"t">(21651, 7210347973155554789L ^ var27), 0)
);
var51[2] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(16654, 5545941790167371799L ^ var27), b<"t">(10476, 4923107123284638093L ^ var27), 0)
);
var51[3] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(18588, 7053471714318752132L ^ var27), b<"t">(27177, 7123684181783657242L ^ var27), 0)
);
var51[4] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(16536, 7515686422803190182L ^ var27), b<"t">(5031, 2162857609854010014L ^ var27), 0)
);
var51[5] = Reflection.property1(new PropertyReference1Impl(ko.class, b<"t">(339, 6745639324899561519L ^ var27), b<"t">(29347, 8418029117805536180L ^ var27), 0));
var51[c<"u">(30292, 3301901599866490670L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(30800, 5397072445382043979L ^ var27), b<"t">(3037, 4041578216553405167L ^ var27), 0)
);
var51[c<"u">(9556, 8044727345386183714L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(18713, 7216898668938074157L ^ var27), b<"t">(30566, 658503038045431338L ^ var27), 0)
);
var51[c<"u">(3672, 4323954538287232813L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(523, 8760800231047680785L ^ var27), b<"t">(32643, 3022127006739902185L ^ var27), 0)
);
var51[c<"u">(13627, 8840720834470694004L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(1158, 6076704648929170891L ^ var27), b<"t">(30083, 8826598016818488539L ^ var27), 0)
);
var51[c<"u">(26137, 6884509760921640822L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(1538, 8524672192521393970L ^ var27), b<"t">(9472, 5629038664535503915L ^ var27), 0)
);
var51[c<"u">(28730, 2041615258281314617L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(2386, 8174742470019471375L ^ var27), b<"t">(12924, 782933163728036701L ^ var27), 0)
);
var51[c<"u">(15860, 8866627628411831506L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(5147, 8708253936371418407L ^ var27), b<"t">(25500, 8717246983970960094L ^ var27), 0)
);
var51[c<"u">(23762, 2626384014354228705L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(3750, 7900052351975808977L ^ var27), b<"t">(25925, 1359539955489780844L ^ var27), 0)
);
var51[c<"u">(9016, 35683565936761396L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(29091, 7220216693919097043L ^ var27), b<"t">(18953, 5006153163333442389L ^ var27), 0)
);
var51[c<"u">(23296, 5382025351388865057L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(1864, 8981464489837811247L ^ var27), b<"t">(12311, 8749439301151842686L ^ var27), 0)
);
var51[c<"u">(24309, 2112016332947498968L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(31462, 6643494093847702447L ^ var27), b<"t">(17144, 7285971653180822501L ^ var27), 0)
);
var51[c<"u">(14184, 7690931831577136678L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(27596, 187901311886670560L ^ var27), b<"t">(32472, 6710974454724833171L ^ var27), 0)
);
var51[c<"u">(25555, 2262301573428550322L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(22809, 2060635452117452854L ^ var27), b<"t">(7486, 9150162404456090701L ^ var27), 0)
);
var51[c<"u">(9811, 874192445514768185L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(2620, 3085527442361146177L ^ var27), b<"t">(3712, 8475192199861395346L ^ var27), 0)
);
var51[c<"u">(6516, 533608325507866652L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(24199, 873539957896646600L ^ var27), b<"t">(18937, 5660405923595294940L ^ var27), 0)
);
var51[c<"u">(30023, 6454360230831557651L ^ var27)] = Reflection.property1(
new PropertyReference1Impl(ko.class, b<"t">(19584, 5814170723573570980L ^ var27), b<"t">(21570, 3635209463900800294L ^ var27), 0)
);
N = var51;
u = new ko(var47);
m = yp.L(u, b<"t">(30285, 5462108236879406901L ^ var27), at.ON, null, null, c<"u">(15860, 8866627628411831506L ^ var27), null, var49);
P = yp.L(u, b<"t">(10187, 4891746155280496276L ^ var27), al.FULL, null, null, c<"u">(15860, 8866627628411831506L ^ var27), null, var49);
y = yp.B(u, b<"t">(24145, 1390284809271086895L ^ var27), (short)var39, w7.BOOLS, null, 4, var40, null, (char)var41);
U = yp.t(u, b<"t">(22766, 2057940323519564188L ^ var27), false, var33, u.n(var31), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
n = yp.t(u, b<"t">(9888, 2805030457707526132L ^ var27), false, var33, u.n(var31), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
A = yp.t(u, b<"t">(16242, 7691757168180227615L ^ var27), true, var33, u.n(var31), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
K = yp.t(u, b<"t">(15919, 448839435632635712L ^ var27), true, var33, u.n(var31), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
x = yp.t(u, b<"t">(16021, 7253967620506677191L ^ var27), true, var33, u.n(var31), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
t = yp.t(u, b<"t">(26845, 8578393761149073899L ^ var27), true, var33, u.n(var31), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
j = yp.l(var42, u, b<"t">(21204, 8375773914454492058L ^ var27), false, u.n(var31), ko::p);
I = yp.t(u, b<"t">(7410, 3085001629008612744L ^ var27), true, var33, u.n(var31), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
O = yp.t(u, b<"t">(16182, 300694990279470663L ^ var27), true, var33, u.n(var31), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
S = yp.B(u, b<"t">(13254, 5830504499507127038L ^ var27), (short)var39, w7.BOOLS, null, 4, var40, null, (char)var41);
c = yp.t(u, b<"t">(13396, 7722503784456217953L ^ var27), false, var33, u.Q(var29), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
e = yp.t(u, b<"t">(21352, 7850733988991107666L ^ var27), false, var33, u.Q(var29), null, c<"u">(3672, 4323954538287232813L ^ var27), null);
z = yp.b(
u,
(short)var44,
b<"t">(9401, 7550183405292844446L ^ var27),
new Color(
c<"u">(32548, 1073269851631650374L ^ var27),
c<"u">(5282, 3519628075760971202L ^ var27),
c<"u">(5282, 3519628075760971202L ^ var27),
c<"u">(31019, 9111459408092299343L ^ var27)
),
null,
null,
c<"u">(15860, 8866627628411831506L ^ var27),
null,
var45
);
b = yp.b(u, (short)var44, b<"t">(11670, 4800521966770912453L ^ var27), new Color(-1), null, null, c<"u">(15860, 8866627628411831506L ^ var27), null, var45);
o = yp.b(
u,
(short)var44,
b<"t">(405, 3872823040295817469L ^ var27),
new Color(
c<"u">(5282, 3519628075760971202L ^ var27),
c<"u">(5282, 3519628075760971202L ^ var27),
c<"u">(5282, 3519628075760971202L ^ var27),
c<"u">(28493, 6182045481550648949L ^ var27)
),
null,
null,
c<"u">(15860, 8866627628411831506L ^ var27),
null,
var45
);
Y = yp.b(
u,
(short)var44,
b<"t">(3361, 6605853980902972506L ^ var27),
new Color(0, c<"u">(28493, 6182045481550648949L ^ var27), 0, c<"u">(28493, 6182045481550648949L ^ var27)),
null,
null,
c<"u">(15860, 8866627628411831506L ^ var27),
null,
var45
);
d = yp.L(u, b<"t">(24322, 1201503604478217799L ^ var27), yu.Full, null, null, c<"u">(15860, 8866627628411831506L ^ var27), null, var49);
F = yp.L(u, b<"t">(6902, 1543165011882036194L ^ var27), m7.Number, null, null, c<"u">(15860, 8866627628411831506L ^ var27), null, var49);
k = yp.L(u, b<"t">(19243, 9102343330979322485L ^ var27), _j.Entity, null, null, c<"u">(15860, 8866627628411831506L ^ var27), null, var49);
D = new HashMap();
J = new bj(b<"t">(26611, 2280766284684048057L ^ var27), c<"u">(23296, 5382025351388865057L ^ var27), c<"u">(23296, 5382025351388865057L ^ var27), var35);
X = new fd(_s.OUT_QUINT, var0, var37);
var10001 = 7961869207756909160L ^ var27;
a = new ab();
l = new ab();
Pair[] var55 = new Pair[c<"u">(21271, var10001)];
var55[0] = TuplesKt.to(
Character.valueOf((char)c<"u">(19470, 7138414202784265587L ^ var27)), Character.valueOf((char)c<"u">(8965, 2232041607377836654L ^ var27))
);
var55[1] = TuplesKt.to(
Character.valueOf((char)c<"u">(13986, 2489525327908720521L ^ var27)), Character.valueOf((char)c<"u">(31607, 8199111494619988546L ^ var27))
);
var55[2] = TuplesKt.to(
Character.valueOf((char)c<"u">(17950, 4081551938292039533L ^ var27)), Character.valueOf((char)c<"u">(26516, 3135492359929831070L ^ var27))
);
var55[3] = TuplesKt.to(
Character.valueOf((char)c<"u">(29568, 1750170392269621942L ^ var27)), Character.valueOf((char)c<"u">(25210, 2529128166309665613L ^ var27))
);
var55[4] = TuplesKt.to(
Character.valueOf((char)c<"u">(25436, 7538907685370763861L ^ var27)), Character.valueOf((char)c<"u">(30821, 6586367925370421564L ^ var27))
);
var55[5] = TuplesKt.to(
Character.valueOf((char)c<"u">(20951, 2761573267784739061L ^ var27)), Character.valueOf((char)c<"u">(25125, 8724937739720989556L ^ var27))
);
var55[c<"u">(30292, 3301901599866490670L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(22316, 5862188638987169383L ^ var27)), Character.valueOf((char)c<"u">(12397, 3831187651971959066L ^ var27))
);
var55[c<"u">(9556, 8044727345386183714L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(7588, 5147471588731741426L ^ var27)), Character.valueOf((char)c<"u">(30301, 3285515137078071162L ^ var27))
);
var55[c<"u">(3672, 4323954538287232813L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(13257, 1688026953345321655L ^ var27)), Character.valueOf((char)c<"u">(31852, 4366533100934563172L ^ var27))
);
var55[c<"u">(13627, 8840720834470694004L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(14656, 8323969286693863501L ^ var27)), Character.valueOf((char)c<"u">(19436, 4674661705756947129L ^ var27))
);
var55[c<"u">(26137, 6884509760921640822L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(23402, 6733784976949453398L ^ var27)), Character.valueOf((char)c<"u">(15183, 7621635458018755171L ^ var27))
);
var55[c<"u">(28730, 2041615258281314617L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(13825, 1667244388154396450L ^ var27)), Character.valueOf((char)c<"u">(4240, 5794389176639973877L ^ var27))
);
var55[c<"u">(15860, 8866627628411831506L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(15848, 3575617109809480875L ^ var27)), Character.valueOf((char)c<"u">(6529, 5218033507542196401L ^ var27))
);
var55[c<"u">(23762, 2626384014354228705L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(13077, 3194851753808153173L ^ var27)), Character.valueOf((char)c<"u">(14416, 3699187809192296747L ^ var27))
);
var55[c<"u">(9016, 35683565936761396L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(28640, 8142803072999495332L ^ var27)), Character.valueOf((char)c<"u">(25006, 9113642581039519944L ^ var27))
);
var55[c<"u">(23296, 5382025351388865057L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(27046, 1640193836587323528L ^ var27)), Character.valueOf((char)c<"u">(5600, 6967521659466968250L ^ var27))
);
var55[c<"u">(24309, 2112016332947498968L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(29565, 2473788690289330752L ^ var27)), Character.valueOf((char)c<"u">(31093, 4745838030811267122L ^ var27))
);
var55[c<"u">(14184, 7690931831577136678L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(27622, 2344053899790258839L ^ var27)), Character.valueOf((char)c<"u">(30213, 7955164063766122325L ^ var27))
);
var55[c<"u">(25555, 2262301573428550322L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(23442, 2447986537874760364L ^ var27)), Character.valueOf((char)c<"u">(29851, 1078003318631828947L ^ var27))
);
var55[c<"u">(9811, 874192445514768185L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(494, 1800623389899978958L ^ var27)), Character.valueOf((char)c<"u">(25062, 404814376542869693L ^ var27))
);
var55[c<"u">(6516, 533608325507866652L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(27793, 8962780750158435738L ^ var27)), Character.valueOf((char)c<"u">(56, 8260460098052159760L ^ var27))
);
var55[c<"u">(30023, 6454360230831557651L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(3663, 988924922900150081L ^ var27)), Character.valueOf((char)c<"u">(10478, 7460189739466805707L ^ var27))
);
var55[c<"u">(19147, 355814055948530623L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(6994, 3847599493420573211L ^ var27)), Character.valueOf((char)c<"u">(2194, 5229448539614966224L ^ var27))
);
var55[c<"u">(7051, 1802587976972559065L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(11149, 2462381095684461280L ^ var27)), Character.valueOf((char)c<"u">(3486, 153009661659477175L ^ var27))
);
var55[c<"u">(2441, 8088436018210238702L ^ var27)] = TuplesKt.to(
Character.valueOf((char)c<"u">(14860, 8525878486184674122L ^ var27)), Character.valueOf((char)c<"u">(6531, 1711809135940559069L ^ var27))
);
f = MapsKt.mapOf(var55);
G = "";
D.put(class_1893.field_9107, "B");
D.put(class_1893.field_9111, "P");
D.put(class_1893.field_9118, "S");
D.put(class_1893.field_9131, "E");
D.put(class_1893.field_9119, "U");
D.put(class_1893.field_9103, b<"t">(19224, 2804063407175309902L ^ var27));
D.put(class_1893.field_9097, "T");
return;
}
break;
default:
var60[var67] = var84;
if (var9 < var12) {
continue label46;
}

var11 = "ú®\\\u0095- ûo\u0094}ê;\u0014n5¾";
var12 = "ú®\\\u0095- ûo\u0094}ê;\u0014n5¾".length();
var9 = 0;
}

byte var68 = var9;
var9 += 8;
var14 = var11.substring(var68, var9).getBytes("ISO-8859-1");
var60 = var13;
var67 = var10++;
var76 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var81 = 0;
}
}
}

var21 = var22.charAt(var54);
break;
default:
var25[var23++] = var72;
if ((var54 += var21) < var24) {
var21 = var22.charAt(var54);
continue label64;
}

var22 = "\u009d\u0086\u0017\t\u0098ë\u007f\u009b2f\u00126\u008a ®Á\u00022g¯»cÙ?¥M\u009d]oá\u0001b\u0018;·\u009a)\u009c\u0087\u008bÊ\u0081\u000f.æý\u0002gfIó\u0098*ã\u0006Ï\u0094";
var24 = "\u009d\u0086\u0017\t\u0098ë\u007f\u009b2f\u00126\u008a ®Á\u00022g¯»cÙ?¥M\u009d]oá\u0001b\u0018;·\u009a)\u009c\u0087\u008bÊ\u0081\u000f.æý\u0002gfIó\u0098*ã\u0006Ï\u0094"
.length();
var21 = ' ';
var54 = -1;
}

var57 = var22.substring(++var54, var54 + var21);
var62 = 0;
}
}
}

public static void k(int[] var0) {
E = var0;
}

public static int[] x() {
return E;
}

private static RuntimeException a(RuntimeException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13670;
if (i[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])w.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
w.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ko", var10);
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
throw new RuntimeException("su/catlean/ko" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 7544;
if (C[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = B[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])L.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
L.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ko", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
C[var3] = var15;
}

return C[var3];
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
throw new RuntimeException("su/catlean/ko" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
