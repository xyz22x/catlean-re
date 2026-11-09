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
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class uf extends _g {
@NotNull
public static final uf b;
static final KProperty[] x;
@NotNull
private static final cq U;
@NotNull
private static final cw L;
@NotNull
private static final c8 m;
@NotNull
private static final cq X;
@NotNull
private static final cq y;
private static final long a = yz.a(717985874428662954L, 7631229677846113430L, MethodHandles.lookup().lookupClass()).a(157918839428978L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private uf(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 70335785214513L;
super(b<"p">(6030, 6590697908409607948L ^ var1), jt.Q(), null, 4, null, var3);
}

private final boolean T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 84959231686147L;
return (Boolean)U.E(this, var3, x[0]);
}

private final void a(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 89260169392546L;
U.b(this, var4, x[0], var1);
}

private final ar G(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114506704185485L;
return (ar)L.E(this, var3, x[1]);
}

private final void Q(long var1, ar var3) {
var1 = a ^ var1;
long var4 = var1 ^ 4122620757662L;
L.b(this, var4, x[1], var3);
}

private final int s(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 56229471815548L;
return ((Number)m.E(this, var3, x[2])).intValue();
}

private final void v(int var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 115505600967723L;
m.b(this, var4, x[2], var1);
}

private final boolean j(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 21600977666982L;
return (Boolean)X.E(this, var3, x[3]);
}

private final void E(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 34157413764600L;
X.b(this, var4, x[3], var1);
}

private final boolean Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 84288660339292L;
return (Boolean)y.E(this, var3, x[4]);
}

private final void j(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 54028105910181L;
y.b(this, var4, x[4], var1);
}

@Flow
private final void q(SendPacket var1) {
System.out.println(var1.getPacket().getClass().getSimpleName());
}

@Flow
private final void Z(ReceivePacket var1) {
System.out.println(var1.getPacket().getClass().getSimpleName());
}

@Flow
private final void w(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/uf.a J
// 003: ldc2_w 106909107873817
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 83970205507022
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 133783140942911
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
// 027: ldc2_w 81224859995280
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 55380769630139
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 137517337969469
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 120207312444993
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 20723086238561
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 6271116945127
// 04d: lxor
// 04e: lstore 19
// 050: dup2
// 051: ldc2_w 35531777467714
// 054: lxor
// 055: lstore 21
// 057: pop2
// 058: ldc2_w -7584717406688139100
// 05b: lload 2
// 05c: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: astore 23
// 063: aload 23
// 065: ifnonnull 0a0
// 068: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 06b: lload 19
// 06d: ldc 256.0
// 06f: getstatic su/catlean/w2.FOV Lsu/catlean/w2;
// 072: aload 0
// 073: lload 11
// 075: invokespecial su/catlean/uf.j (J)Z
// 078: aload 0
// 079: lload 15
// 07b: invokespecial su/catlean/uf.Y (J)Z
// 07e: invokevirtual su/catlean/dx.t (JFLsu/catlean/w2;ZZ)Lnet/minecraft/class_1657;
// 081: dup
// 082: ifnonnull 0a1
// 085: goto 092
// 088: ldc2_w -7594785853427375344
// 08b: lload 2
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: pop
// 093: goto 0a0
// 096: ldc2_w -7594785853427375344
// 099: lload 2
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: return
// 0a1: astore 24
// 0a3: aload 0
// 0a4: lload 9
// 0a6: invokespecial su/catlean/uf.G (J)Lsu/catlean/ar;
// 0a9: getstatic su/catlean/so.U [I
// 0ac: swap
// 0ad: invokevirtual su/catlean/ar.ordinal ()I
// 0b0: iaload
// 0b1: tableswitch 92 1 3 27 56 75
// 0cc: getstatic su/catlean/lo.k Lsu/catlean/lo;
// 0cf: lload 21
// 0d1: aload 24
// 0d3: aload 0
// 0d4: lload 17
// 0d6: invokespecial su/catlean/uf.s (J)I
// 0d9: invokevirtual su/catlean/lo.w (JLnet/minecraft/class_1657;I)Lnet/minecraft/class_243;
// 0dc: goto 115
// 0df: ldc2_w -7594785853427375344
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: getstatic su/catlean/lo.k Lsu/catlean/lo;
// 0ec: lload 21
// 0ee: aload 24
// 0f0: aload 0
// 0f1: lload 17
// 0f3: invokespecial su/catlean/uf.s (J)I
// 0f6: invokevirtual su/catlean/lo.w (JLnet/minecraft/class_1657;I)Lnet/minecraft/class_243;
// 0f9: goto 115
// 0fc: aload 0
// 0fd: iload 6
// 0ff: i2b
// 100: lload 7
// 102: aload 24
// 104: checkcast net/minecraft/class_1297
// 107: invokevirtual su/catlean/uf.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 10a: goto 115
// 10d: new kotlin/NoWhenBranchMatchedException
// 110: dup
// 111: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 114: athrow
// 115: astore 25
// 117: aload 25
// 119: dconst_0
// 11a: ldc2_w 0.9
// 11d: dconst_0
// 11e: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 121: dup
// 122: sipush 20457
// 125: ldc2_w 5181006043549637321
// 128: lload 2
// 129: lxor
// 12a: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/uf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 132: astore 25
// 134: lload 4
// 136: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 139: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 13c: aload 25
// 13e: lload 13
// 140: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 143: bipush 0
// 144: bipush 2
// 145: aconst_null
// 146: invokestatic su/catlean/_8.C (JLsu/catlean/_8;Lsu/catlean/_w;IILjava/lang/Object;)V
// 149: return
}

public final void z(char a, @NotNull class_1792 item, int a, float yaw, short a) {
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
// 005: iload 3
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 5
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/uf.a J
// 01b: lxor
// 01c: lstore 6
// 01e: lload 6
// 020: dup2
// 021: ldc2_w 59499756628810
// 024: lxor
// 025: dup2
// 026: bipush 48
// 028: lushr
// 029: l2i
// 02a: istore 8
// 02c: dup2
// 02d: bipush 16
// 02f: lshl
// 030: bipush 32
// 032: lushr
// 033: l2i
// 034: istore 9
// 036: dup2
// 037: bipush 48
// 039: lshl
// 03a: bipush 48
// 03c: lushr
// 03d: l2i
// 03e: istore 10
// 040: pop2
// 041: dup2
// 042: ldc2_w 66203879469274
// 045: lxor
// 046: lstore 11
// 048: dup2
// 049: ldc2_w 85600957144831
// 04c: lxor
// 04d: lstore 13
// 04f: dup2
// 050: ldc2_w 7371595967569
// 053: lxor
// 054: lstore 15
// 056: dup2
// 057: ldc2_w 87744177610840
// 05a: lxor
// 05b: lstore 17
// 05d: pop2
// 05e: ldc2_w 8276488670752623810
// 061: lload 6
// 063: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: aload 2
// 069: sipush 20103
// 06c: ldc2_w 5475388987788197828
// 06f: lload 6
// 071: lxor
// 072: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/uf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07a: astore 19
// 07c: lload 17
// 07e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 081: invokevirtual net/minecraft/class_746.method_23317 ()D
// 084: dstore 20
// 086: lload 17
// 088: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 08b: invokevirtual net/minecraft/class_746.method_23318 ()D
// 08e: lload 17
// 090: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 093: lload 17
// 095: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 098: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 09b: invokevirtual net/minecraft/class_746.method_18381 (Lnet/minecraft/class_4050;)F
// 09e: f2d
// 09f: dadd
// 0a0: dstore 22
// 0a2: lload 17
// 0a4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a7: invokevirtual net/minecraft/class_746.method_23321 ()D
// 0aa: dstore 24
// 0ac: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0af: lload 17
// 0b1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b4: getfield net/minecraft/class_746.field_6004 F
// 0b7: lload 17
// 0b9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0bc: invokevirtual net/minecraft/class_746.method_36455 ()F
// 0bf: lload 15
// 0c1: invokevirtual su/catlean/jl.T (FFJ)F
// 0c4: fstore 26
// 0c6: fload 4
// 0c8: ldc 180.0
// 0ca: fdiv
// 0cb: ldc 3.1415927
// 0cd: fmul
// 0ce: f2d
// 0cf: invokestatic java/lang/Math.sin (D)D
// 0d2: d2f
// 0d3: fneg
// 0d4: fload 26
// 0d6: ldc 180.0
// 0d8: fdiv
// 0d9: ldc 3.1415927
// 0db: fmul
// 0dc: f2d
// 0dd: invokestatic java/lang/Math.cos (D)D
// 0e0: d2f
// 0e1: fmul
// 0e2: f2d
// 0e3: dstore 27
// 0e5: fload 26
// 0e7: ldc 180.0
// 0e9: fdiv
// 0ea: ldc 3.141593
// 0ec: fmul
// 0ed: f2d
// 0ee: invokestatic java/lang/Math.sin (D)D
// 0f1: d2f
// 0f2: fneg
// 0f3: f2d
// 0f4: dstore 29
// 0f6: fload 4
// 0f8: ldc 180.0
// 0fa: fdiv
// 0fb: ldc 3.1415927
// 0fd: fmul
// 0fe: f2d
// 0ff: invokestatic java/lang/Math.cos (D)D
// 102: d2f
// 103: fload 26
// 105: ldc 180.0
// 107: fdiv
// 108: ldc 3.1415927
// 10a: fmul
// 10b: f2d
// 10c: invokestatic java/lang/Math.cos (D)D
// 10f: d2f
// 110: fmul
// 111: f2d
// 112: dstore 31
// 114: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 117: fconst_0
// 118: lload 17
// 11a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 11d: invokevirtual net/minecraft/class_746.method_6048 ()I
// 120: i2f
// 121: fconst_1
// 122: fsub
// 123: invokestatic java/lang/Math.max (FF)F
// 126: lload 17
// 128: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12b: invokevirtual net/minecraft/class_746.method_6048 ()I
// 12e: i2f
// 12f: lload 15
// 131: invokevirtual su/catlean/jl.T (FFJ)F
// 134: ldc 20.0
// 136: fdiv
// 137: fstore 33
// 139: fload 33
// 13b: fload 33
// 13d: fmul
// 13e: fload 33
// 140: fconst_2
// 141: fmul
// 142: fadd
// 143: ldc 3.0
// 145: fdiv
// 146: fstore 33
// 148: fload 33
// 14a: aload 19
// 14c: ifnonnull 193
// 14f: fconst_1
// 150: fcmpl
// 151: ifgt 192
// 154: goto 162
// 157: ldc2_w 8286539396978329462
// 15a: lload 6
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: fload 33
// 164: fconst_0
// 165: fcmpg
// 166: aload 19
// 168: ifnonnull 18b
// 16b: goto 179
// 16e: ldc2_w 8286539396978329462
// 171: lload 6
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: ifne 18e
// 17c: goto 18a
// 17f: ldc2_w 8286539396978329462
// 182: lload 6
// 184: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 189: athrow
// 18a: bipush 1
// 18b: goto 18f
// 18e: bipush 0
// 18f: ifeq 195
// 192: fconst_1
// 193: fstore 33
// 195: dload 27
// 197: dload 27
// 199: dmul
// 19a: dload 29
// 19c: dload 29
// 19e: dmul
// 19f: dadd
// 1a0: dload 31
// 1a2: dload 31
// 1a4: dmul
// 1a5: dadd
// 1a6: d2f
// 1a7: invokestatic net/minecraft/class_3532.method_15355 (F)F
// 1aa: fstore 34
// 1ac: dload 27
// 1ae: fload 34
// 1b0: f2d
// 1b1: ddiv
// 1b2: dstore 27
// 1b4: dload 29
// 1b6: fload 34
// 1b8: f2d
// 1b9: ddiv
// 1ba: dstore 29
// 1bc: dload 31
// 1be: fload 34
// 1c0: f2d
// 1c1: ddiv
// 1c2: dstore 31
// 1c4: fload 33
// 1c6: fconst_2
// 1c7: fmul
// 1c8: fstore 35
// 1ca: dload 27
// 1cc: fload 35
// 1ce: f2d
// 1cf: dmul
// 1d0: dstore 27
// 1d2: dload 29
// 1d4: fload 35
// 1d6: f2d
// 1d7: dmul
// 1d8: dstore 29
// 1da: dload 31
// 1dc: fload 35
// 1de: f2d
// 1df: dmul
// 1e0: dstore 31
// 1e2: dload 27
// 1e4: lload 17
// 1e6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1e9: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 1ec: getfield net/minecraft/class_243.field_1352 D
// 1ef: dadd
// 1f0: dstore 27
// 1f2: dload 29
// 1f4: lload 17
// 1f6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1f9: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 1fc: getfield net/minecraft/class_243.field_1351 D
// 1ff: dadd
// 200: dstore 29
// 202: dload 31
// 204: lload 17
// 206: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 209: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 20c: getfield net/minecraft/class_243.field_1350 D
// 20f: dadd
// 210: dstore 31
// 212: aconst_null
// 213: astore 36
// 215: bipush 0
// 216: istore 37
// 218: iload 37
// 21a: sipush 22733
// 21d: ldc2_w 4398009064654368275
// 220: lload 6
// 222: lxor
// 223: invokedynamic y (IJ)I bsm=su/catlean/uf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 228: if_icmpge 640
// 22b: new net/minecraft/class_243
// 22e: dup
// 22f: dload 20
// 231: dload 22
// 233: dload 24
// 235: invokespecial net/minecraft/class_243.<init> (DDD)V
// 238: astore 36
// 23a: dload 20
// 23c: dload 27
// 23e: dadd
// 23f: dstore 20
// 241: dload 22
// 243: dload 29
// 245: dadd
// 246: dstore 22
// 248: dload 24
// 24a: dload 31
// 24c: dadd
// 24d: dstore 24
// 24f: dload 27
// 251: ldc2_w 0.99
// 254: dmul
// 255: dstore 27
// 257: dload 29
// 259: ldc2_w 0.99
// 25c: dmul
// 25d: dstore 29
// 25f: dload 31
// 261: ldc2_w 0.99
// 264: dmul
// 265: dstore 31
// 267: dload 29
// 269: ldc2_w 0.05
// 26c: dsub
// 26d: dstore 29
// 26f: new net/minecraft/class_243
// 272: dup
// 273: dload 20
// 275: dload 22
// 277: dload 24
// 279: invokespecial net/minecraft/class_243.<init> (DDD)V
// 27c: astore 38
// 27e: lload 13
// 280: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 283: new net/minecraft/class_3959
// 286: dup
// 287: aload 36
// 289: aload 38
// 28b: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
// 28e: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
// 291: lload 17
// 293: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 296: checkcast net/minecraft/class_1297
// 299: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
// 29c: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
// 29f: dup
// 2a0: sipush 28592
// 2a3: ldc2_w 699184387679608562
// 2a6: lload 6
// 2a8: lxor
// 2a9: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/uf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ae: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2b1: astore 39
// 2b3: iload 5
// 2b5: iflt 2c3
// 2b8: aload 39
// 2ba: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
// 2bd: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
// 2c0: if_acmpne 2f2
// 2c3: aload 19
// 2c5: ifnull 640
// 2c8: goto 2d6
// 2cb: ldc2_w 8286539396978329462
// 2ce: lload 6
// 2d0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d5: athrow
// 2d6: bipush 2
// 2d7: anewarray 550
// 2da: ldc2_w 8219285622870407213
// 2dd: lload 6
// 2df: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e4: goto 2f2
// 2e7: ldc2_w 8286539396978329462
// 2ea: lload 6
// 2ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f1: athrow
// 2f2: lload 13
// 2f4: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2f7: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 2fa: dup
// 2fb: sipush 22128
// 2fe: ldc2_w 5942305084731778859
// 301: lload 6
// 303: lxor
// 304: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/uf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 309: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 30c: astore 41
// 30e: nop
// 30f: bipush 0
// 310: istore 42
// 312: aload 41
// 314: astore 43
// 316: new java/util/ArrayList
// 319: dup
// 31a: invokespecial java/util/ArrayList.<init> ()V
// 31d: checkcast java/util/Collection
// 320: astore 44
// 322: bipush 0
// 323: istore 45
// 325: aload 43
// 327: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 32c: astore 46
// 32e: aload 46
// 330: invokeinterface java/util/Iterator.hasNext ()Z 1
// 335: ifeq 41a
// 338: aload 46
// 33a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 33f: astore 47
// 341: aload 47
// 343: checkcast net/minecraft/class_1297
// 346: astore 48
// 348: bipush 0
// 349: istore 49
// 34b: aload 48
// 34d: instanceof net/minecraft/class_1676
// 350: aload 19
// 352: ifnonnull 21a
// 355: aload 19
// 357: iload 1
// 358: iflt 352
// 35b: iload 3
// 35c: ifle 38d
// 35f: ifnonnull 38b
// 362: ifne 407
// 365: goto 373
// 368: ldc2_w 8286539396978329462
// 36b: lload 6
// 36d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: athrow
// 373: aload 48
// 375: lload 17
// 377: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 37a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 37d: goto 38b
// 380: ldc2_w 8286539396978329462
// 383: lload 6
// 385: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38a: athrow
// 38b: aload 19
// 38d: iload 1
// 38e: iflt 3c0
// 391: ifnonnull 3be
// 394: ifne 407
// 397: goto 3a5
// 39a: ldc2_w 8286539396978329462
// 39d: lload 6
// 39f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a4: athrow
// 3a5: aload 48
// 3a7: aload 38
// 3a9: invokevirtual net/minecraft/class_1297.method_5707 (Lnet/minecraft/class_243;)D
// 3ac: ldc2_w 25.0
// 3af: dcmpg
// 3b0: goto 3be
// 3b3: ldc2_w 8286539396978329462
// 3b6: lload 6
// 3b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bd: athrow
// 3be: aload 19
// 3c0: ifnonnull 404
// 3c3: iflt 403
// 3c6: goto 3d4
// 3c9: ldc2_w 8286539396978329462
// 3cc: lload 6
// 3ce: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d3: athrow
// 3d4: aload 48
// 3d6: aload 36
// 3d8: invokevirtual net/minecraft/class_1297.method_5707 (Lnet/minecraft/class_243;)D
// 3db: ldc2_w 25.0
// 3de: dcmpg
// 3df: aload 19
// 3e1: ifnonnull 404
// 3e4: goto 3f2
// 3e7: ldc2_w 8286539396978329462
// 3ea: lload 6
// 3ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f1: athrow
// 3f2: ifge 407
// 3f5: goto 403
// 3f8: ldc2_w 8286539396978329462
// 3fb: lload 6
// 3fd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 402: athrow
// 403: bipush 1
// 404: goto 408
// 407: bipush 0
// 408: ifeq 32e
// 40b: aload 44
// 40d: aload 47
// 40f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 414: pop
// 415: aload 19
// 417: ifnull 32e
// 41a: aload 44
// 41c: checkcast java/util/List
// 41f: nop
// 420: astore 40
// 422: bipush 0
// 423: istore 41
// 425: aload 40
// 427: checkcast java/lang/Iterable
// 42a: astore 42
// 42c: bipush 0
// 42d: istore 43
// 42f: aload 42
// 431: iload 1
// 432: iflt 30c
// 435: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 43a: astore 44
// 43c: aload 44
// 43e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 443: ifeq 53c
// 446: aload 44
// 448: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 44d: astore 45
// 44f: aload 45
// 451: checkcast net/minecraft/class_1297
// 454: astore 46
// 456: bipush 0
// 457: istore 47
// 459: aload 46
// 45b: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 45e: dup
// 45f: sipush 3598
// 462: ldc2_w 7221586305617674068
// 465: lload 6
// 467: lxor
// 468: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/uf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 470: astore 48
// 472: aload 48
// 474: aload 36
// 476: aload 38
// 478: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
// 47b: astore 49
// 47d: bipush 0
// 47e: istore 50
// 480: aload 19
// 482: iload 3
// 483: iflt 539
// 486: ifnonnull 537
// 489: aload 49
// 48b: invokevirtual java/util/Optional.isPresent ()Z
// 48e: aload 19
// 490: iload 3
// 491: iflt 546
// 494: ifnonnull 544
// 497: goto 4a5
// 49a: ldc2_w 8286539396978329462
// 49d: lload 6
// 49f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a4: athrow
// 4a5: ifeq 533
// 4a8: goto 4b6
// 4ab: ldc2_w 8286539396978329462
// 4ae: lload 6
// 4b0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b5: athrow
// 4b6: iload 41
// 4b8: aload 19
// 4ba: ifnonnull 531
// 4bd: goto 4cb
// 4c0: ldc2_w 8286539396978329462
// 4c3: lload 6
// 4c5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ca: athrow
// 4cb: ifne 533
// 4ce: goto 4dc
// 4d1: ldc2_w 8286539396978329462
// 4d4: lload 6
// 4d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4db: athrow
// 4dc: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 4df: iload 8
// 4e1: i2s
// 4e2: aload 36
// 4e4: aload 49
// 4e6: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
// 4e9: dup
// 4ea: sipush 8516
// 4ed: ldc2_w 8358974967231418395
// 4f0: lload 6
// 4f2: lxor
// 4f3: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/uf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4fb: checkcast net/minecraft/class_243
// 4fe: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 501: lload 11
// 503: iload 37
// 505: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 508: aconst_null
// 509: bipush 0
// 50a: iload 9
// 50c: iload 10
// 50e: i2c
// 50f: sipush 32330
// 512: ldc2_w 5687245257953855634
// 515: lload 6
// 517: lxor
// 518: invokedynamic y (IJ)I bsm=su/catlean/uf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51d: aconst_null
// 51e: invokestatic su/catlean/zi.L (Lsu/catlean/zi;SLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;Ljava/awt/Color;ZICILjava/lang/Object;)Z
// 521: pop
// 522: bipush 1
// 523: goto 531
// 526: ldc2_w 8286539396978329462
// 529: lload 6
// 52b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 530: athrow
// 531: istore 41
// 533: nop
// 534: nop
// 535: nop
// 536: nop
// 537: aload 19
// 539: ifnull 43c
// 53c: nop
// 53d: iload 5
// 53f: ifle 63b
// 542: iload 41
// 544: aload 19
// 546: iload 1
// 547: iflt 587
// 54a: ifnonnull 585
// 54d: ifeq 571
// 550: goto 55e
// 553: ldc2_w 8286539396978329462
// 556: lload 6
// 558: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55d: athrow
// 55e: aload 19
// 560: ifnull 640
// 563: goto 571
// 566: ldc2_w 8286539396978329462
// 569: lload 6
// 56b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 570: athrow
// 571: dload 22
// 573: ldc2_w -65.0
// 576: dcmpg
// 577: goto 585
// 57a: ldc2_w 8286539396978329462
// 57d: lload 6
// 57f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 584: athrow
// 585: aload 19
// 587: iload 1
// 588: iflt 5b3
// 58b: ifnonnull 5b1
// 58e: ifle 640
// 591: goto 59f
// 594: ldc2_w 8286539396978329462
// 597: lload 6
// 599: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 59e: athrow
// 59f: dload 27
// 5a1: dconst_0
// 5a2: dcmpg
// 5a3: goto 5b1
// 5a6: ldc2_w 8286539396978329462
// 5a9: lload 6
// 5ab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b0: athrow
// 5b1: aload 19
// 5b3: ifnonnull 5c8
// 5b6: ifne 5cb
// 5b9: goto 5c7
// 5bc: ldc2_w 8286539396978329462
// 5bf: lload 6
// 5c1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c6: athrow
// 5c7: bipush 1
// 5c8: goto 5cc
// 5cb: bipush 0
// 5cc: iload 1
// 5cd: iflt 5d7
// 5d0: ifeq 638
// 5d3: dload 29
// 5d5: dconst_0
// 5d6: dcmpg
// 5d7: aload 19
// 5d9: ifnonnull 5fc
// 5dc: goto 5ea
// 5df: ldc2_w 8286539396978329462
// 5e2: lload 6
// 5e4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e9: athrow
// 5ea: ifne 5ff
// 5ed: goto 5fb
// 5f0: ldc2_w 8286539396978329462
// 5f3: lload 6
// 5f5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5fa: athrow
// 5fb: bipush 1
// 5fc: goto 600
// 5ff: bipush 0
// 600: iload 5
// 602: ifle 60c
// 605: ifeq 638
// 608: dload 31
// 60a: dconst_0
// 60b: dcmpg
// 60c: aload 19
// 60e: ifnonnull 631
// 611: goto 61f
// 614: ldc2_w 8286539396978329462
// 617: lload 6
// 619: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61e: athrow
// 61f: ifne 634
// 622: goto 630
// 625: ldc2_w 8286539396978329462
// 628: lload 6
// 62a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62f: athrow
// 630: bipush 1
// 631: goto 635
// 634: bipush 0
// 635: ifeq 638
// 638: iinc 37 1
// 63b: aload 19
// 63d: ifnull 218
// 640: iload 5
// 642: iflt 26f
// 645: return
}

private static final boolean w() {
long var0 = a ^ 85430841672723L;
long var2 = var0 ^ 111424327131290L;

try {
if (b.G(var2) == ar.CUSTOM) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -390746606794584294L, var0);
}

return false;
}

static {
long var20 = a ^ 70002917144546L;
long var22 = var20 ^ 36730380748042L;
long var24 = var20 ^ 74640932163192L;
long var26 = var20 ^ 119044096639774L;
long var28 = var20 ^ 2882132931788L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[22];
int var16 = 0;
String var15 = "¾ÛG£\u009d\u0085áÏ¤\u008d3¶\u008a¯æ×Ñ&\u0015w,Å¡yþ\u0091üwýÀiO\u0010ß\u0010-nkÑÙ\u0010\f\u0086í\u0083\u008d\u0010»\u008dv0Ü4!åþT(yFHæòj\u0004*\u0090\u0095~Ó\u0090ÙÑ\u0016\u0092k]käÇþÂ¶§4\u0018GÑÿ\u008d9ç)w&:ùÜ qbé¾U\n3\u009e\u0005.'óú]Uôh\u0085IµËo.\u001fßd´ñð}±\u0081(d\u0087±Ød0\u009d¢\nä\u009fSÊØÉõ\u009fú°þA\u0004´\u0006\u0013M¿¯ò¬\u0094úÚ\u0096 <\tr[³ B\u0014x¤!ä`\tWg\rf`J²tç\u008eOÃ\u009a7\u00951ÚôÌG8[¹è\u0018.\u001c[NÐ\u009a9MpÃz~j<Íì%öô¼\u0096u3ó\u0010zÁQb\u008aó\u0011;ËÆ=\u001d=\u0010\n\u009e hÕhÎ(ßÐ\u0017Ú±J1C\u0088\u000bc1C\u0010\u0000õEÚ¤éÕgùyuÜ\u009f\u0018Å\u0094¹|nïq¶k\u008c\u008fÿàY\u0090i~\u0019\u000b\u0001¼\u0098E\u009487Ù\\±/9§â\u001cõæí=\u0095ËG¸UúÅDÐ{\u0090\n\u0010\u0080d\u0005©è\u0090\u0084fý\u009dL©jÝ/\u0012ð¹b\u001eFìNgg\u0010\u0007\u0083\u0083\u0001 ºdý¨;\u0013\u001d1h÷±ÿ\u0082ègi¹ì§ø°=\u0089C/\u0007×ÒJ.Ç\u0081 ¸\u008cñ°îF\u000fä\n\u001e\u001e\u00870\"\u008c\u0094Ý]\u009eõ°¸\u0094*»Í°\u0094»OLç\u0010\u001cÙØÞ¬Ó£\u000eï tê\u001cxÖv\u0010c\u001b\u001eãqaÚE\u0092/£\u0087!1ËI /¨:©\u0092\u007fÉ[FQø\u001dÈÕüE\u0096M^h+f\u0011¢l\u000fX?[0áï\u0018ÿ¾`\u0005ú\u0018o*{1ÂÍî_\u0099Þ¶H\u000bï³LAe ]è\u0006~2zyRW\u0090D1èì\u001al\u008c\"/\u0091è\u0087×\u0016:Ø¼<\b ñ\u008d\u0010I¯={îR\u009aH¨¾Y\u0018²§rô\u0018\fW\u009eûðÒ«ë?\u0091´ò²\u0004Å\u00163\u000fZ*\u0098\u0092-£";
int var17 = "¾ÛG£\u009d\u0085áÏ¤\u008d3¶\u008a¯æ×Ñ&\u0015w,Å¡yþ\u0091üwýÀiO\u0010ß\u0010-nkÑÙ\u0010\f\u0086í\u0083\u008d\u0010»\u008dv0Ü4!åþT(yFHæòj\u0004*\u0090\u0095~Ó\u0090ÙÑ\u0016\u0092k]käÇþÂ¶§4\u0018GÑÿ\u008d9ç)w&:ùÜ qbé¾U\n3\u009e\u0005.'óú]Uôh\u0085IµËo.\u001fßd´ñð}±\u0081(d\u0087±Ød0\u009d¢\nä\u009fSÊØÉõ\u009fú°þA\u0004´\u0006\u0013M¿¯ò¬\u0094úÚ\u0096 <\tr[³ B\u0014x¤!ä`\tWg\rf`J²tç\u008eOÃ\u009a7\u00951ÚôÌG8[¹è\u0018.\u001c[NÐ\u009a9MpÃz~j<Íì%öô¼\u0096u3ó\u0010zÁQb\u008aó\u0011;ËÆ=\u001d=\u0010\n\u009e hÕhÎ(ßÐ\u0017Ú±J1C\u0088\u000bc1C\u0010\u0000õEÚ¤éÕgùyuÜ\u009f\u0018Å\u0094¹|nïq¶k\u008c\u008fÿàY\u0090i~\u0019\u000b\u0001¼\u0098E\u009487Ù\\±/9§â\u001cõæí=\u0095ËG¸UúÅDÐ{\u0090\n\u0010\u0080d\u0005©è\u0090\u0084fý\u009dL©jÝ/\u0012ð¹b\u001eFìNgg\u0010\u0007\u0083\u0083\u0001 ºdý¨;\u0013\u001d1h÷±ÿ\u0082ègi¹ì§ø°=\u0089C/\u0007×ÒJ.Ç\u0081 ¸\u008cñ°îF\u000fä\n\u001e\u001e\u00870\"\u008c\u0094Ý]\u009eõ°¸\u0094*»Í°\u0094»OLç\u0010\u001cÙØÞ¬Ó£\u000eï tê\u001cxÖv\u0010c\u001b\u001eãqaÚE\u0092/£\u0087!1ËI /¨:©\u0092\u007fÉ[FQø\u001dÈÕüE\u0096M^h+f\u0011¢l\u000fX?[0áï\u0018ÿ¾`\u0005ú\u0018o*{1ÂÍî_\u0099Þ¶H\u000bï³LAe ]è\u0006~2zyRW\u0090D1èì\u001al\u008c\"/\u0091è\u0087×\u0016:Ø¼<\b ñ\u008d\u0010I¯={îR\u009aH¨¾Y\u0018²§rô\u0018\fW\u009eûðÒ«ë?\u0091´ò²\u0004Å\u00163\u000fZ*\u0098\u0092-£"
.length();
char var14 = '(';
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
c = var18;
d = new String[22];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[6];
int var3 = 0;
String var4 = "Þ\u001aá\u0099'¼\u008a\\Ñ·ä`þò¶¿\u0096ÍOR6\u0015cßj¾(´\tó^\u009c";
int var5 = "Þ\u001aá\u0099'¼\u008a\\Ñ·ä`þò¶¿\u0096ÍOR6\u0015cßj¾(´\tó^\u009c".length();
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
f = var6;
g = new Integer[6];
KProperty[] var30 = new KProperty[]{
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uf.class, b<"p">(16253, 6965492069255509436L ^ var20), b<"p">(6165, 2038581326763578070L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uf.class, b<"p">(9834, 2772048816913673406L ^ var20), b<"p">(19900, 7991405560985454437L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uf.class, b<"p">(1012, 6755830653799975202L ^ var20), b<"p">(23097, 3288382909824110826L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uf.class, b<"p">(7678, 6061694943129098020L ^ var20), b<"p">(13769, 6203398842492911390L ^ var20), 0)
),
Reflection.mutableProperty1(
new MutablePropertyReference1Impl(uf.class, b<"p">(25550, 2238980382145816850L ^ var20), b<"p">(25865, 4731683335481831384L ^ var20), 0)
)
};
x = var30;
b = new uf(var22);
U = yp.t(b, b<"p">(30503, 4996989648889527797L ^ var20), true, var24, null, null, c<"y">(30764, 4624211136615855466L ^ var20), null);
L = yp.L(b, b<"p">(10392, 7295022376204165701L ^ var20), ar.SMART, null, null, c<"y">(28316, 8562262120689214430L ^ var20), null, var28);
m = yp.L(
b,
b<"p">(29189, 6692848328455076061L ^ var20),
1,
new IntRange(1, c<"y">(3035, 2501891580660303516L ^ var20)),
var26,
null,
uf::w,
c<"y">(1048, 4339037536461441372L ^ var20),
null
);
X = yp.t(b, b<"p">(27463, 2023606666886914455L ^ var20), true, var24, null, null, c<"y">(28316, 8562262120689214430L ^ var20), null);
y = yp.t(b, b<"p">(6297, 6061998659096007244L ^ var20), true, var24, null, null, c<"y">(28316, 8562262120689214430L ^ var20), null);
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "<DcG8é¥G?ùim\u00adN7g";
var5 = "<DcG8é¥G?ùim\u00adN7g".length();
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

var15 = "\u0006\bW¨Óûná uM(Ü²²mïé\u0082dÿçhØ\u009bû\f\u001e¥G\u0090\u0095\u00949b½YsPÉ8m|æN\\\u0000u¥OgXn\u001e±\u008es(\u0002'¢\u00893â\u0016\u0001U¾È\u009cIà¢6Ë4'\f}°Ú8\u009dtªe@-ü5Ëi\bð!¦å";
var17 = "\u0006\bW¨Óûná uM(Ü²²mïé\u0082dÿçhØ\u009bû\f\u001e¥G\u0090\u0095\u00949b½YsPÉ8m|æN\\\u0000u¥OgXn\u001e±\u008es(\u0002'¢\u00893â\u0016\u0001U¾È\u009cIà¢6Ë4'\f}°Ú8\u009dtªe@-ü5Ëi\bð!¦å"
.length();
var14 = '(';
var33 = -1;
}

var34 = var15.substring(++var33, var33 + var14);
var10001 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 17017;
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
throw new RuntimeException("su/catlean/uf", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/uf" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17900;
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
throw new RuntimeException("su/catlean/uf", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/uf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
