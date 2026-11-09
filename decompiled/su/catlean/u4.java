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
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class u4 extends _g {
@NotNull
public static final u4 S;
static final KProperty[] u;
@NotNull
private static final cw A;
@NotNull
private static final cq V;
@NotNull
private static final cq y;
@NotNull
private static final cq j;
@NotNull
private static final c8 E;
@NotNull
private static final c8 z;
@NotNull
private static final cq T;
@NotNull
private static final ct x;
@NotNull
private static final ct c;
@NotNull
private static final ct o;
@NotNull
private static final cw O;
@NotNull
private static final ct n;
@NotNull
private static final c8 G;
private static double d;
private static int i;
private static int t;
private static float l;
@NotNull
private static final bg h;
private static final long a = yz.a(3763489360545130017L, 5495694745628708890L, MethodHandles.lookup().lookupClass()).a(168808784020748L);
private static final String[] b;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] k;
private static final Map m;

private u4(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 4719412282409L;
super(b<"o">(373, 3366533575113741553L ^ var1), jt.V(), null, 4, null, var3);
}

private final gq Z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 138659891555726L;
return (gq)A.E(this, var3, u[0]);
}

private final boolean Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 126381240930221L;
return (Boolean)V.E(this, var3, u[1]);
}

private final void k(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 243308521181L;
V.b(this, var4, u[1], var1);
}

private final boolean r(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 2636078030423L;
return (Boolean)y.E(this, var6, u[2]);
}

private final void j(boolean var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 38281829956876L;
y.b(this, var4, u[2], var1);
}

private final boolean A(int var1, int var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 104835845283114L;
return (Boolean)j.E(this, var6, u[3]);
}

private final void y(long var1, boolean var3, short var4) {
long var5 = (var1 << 16 | (long)var4 << 48 >>> 48) ^ a;
long var7 = var5 ^ 44386739198167L;
j.b(this, var7, u[3], var3);
}

private final int H(int var1, char var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 114342747193385L;
return ((Number)E.E(this, var6, u[4])).intValue();
}

private final int v(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 74802542004775L;
return ((Number)z.E(this, var3, u[5])).intValue();
}

private final boolean I(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 73337147166276L;
return (Boolean)T.E(this, var3, u[c<"q">(31515, 6044926734770550225L ^ var1)]);
}

private final float K(int var1, int var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 84895919946533L;
return ((Number)x.E(this, var6, u[c<"q">(9914, 3007384534649625884L ^ var4)])).floatValue();
}

private final void V(int var1, float var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 106712720599340L;
x.b(this, var6, u[c<"q">(27688, 2176714827595633256L ^ var4)], var2);
}

private final float s(char var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 74290601494506L;
return ((Number)c.E(this, var6, u[c<"q">(5333, 8993296689183413167L ^ var4)])).floatValue();
}

private final void Z(char var1, int var2, float var3, char var4) {
long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
long var7 = var5 ^ 30132968524835L;
c.b(this, var7, u[c<"q">(5333, 8993396753184804746L ^ var5)], var3);
}

private final float i(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 63424639646829L;
return ((Number)o.E(this, var3, u[c<"q">(350, 1052172964986322357L ^ var1)])).floatValue();
}

private final void n(float var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 96527980424822L;
o.b(this, var4, u[c<"q">(12275, 6279797687241250548L ^ var2)], var1);
}

private final px R(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 123204918878606L;
return (px)O.E(this, var3, u[c<"q">(2519, 1266261824106850526L ^ var1)]);
}

private final void C(px var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 74139201429673L;
O.b(this, var4, u[c<"q">(14312, 1335021456780132396L ^ var2)], var1);
}

private final float z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 76001528343729L;
return ((Number)n.E(this, var3, u[c<"q">(13938, 1443835991958395457L ^ var1)])).floatValue();
}

private final void i(byte var1, float var2, long var3) {
long var5 = ((long)var1 << 56 | var3 << 8 >>> 8) ^ a;
long var7 = var5 ^ 23037513284497L;
n.b(this, var7, u[c<"q">(8545, 5745817909060849026L ^ var5)], var2);
}

private final int T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 21127923206120L;
return ((Number)G.E(this, var3, u[c<"q">(28523, 3674535975018080287L ^ var1)])).intValue();
}

private final void m(int var1, int var2, int var3, byte var4) {
long var5 = ((long)var2 << 32 | (long)var3 << 40 >>> 32 | (long)var4 << 56 >>> 56) ^ a;
long var7 = var5 ^ 76128308938746L;
G.b(this, var7, u[c<"q">(30124, 7089933688250950945L ^ var5)], var1);
}

@Override
public void O(long var1) {
i = 1;
t = 0;
d = 0.2873;
int var10000 = vm.a<"Å">(2620191443214299061L, var1);
h.l();
int var3 = var10000;

try {
var10000 = var3;
if (var1 >= 0L) {
if (var3 != 0) {
return;
}

var10000 = 5;
}

vm.a<"Å">(new _g[var10000], 2605814174822968852L, var1);
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 2663721874717435670L, var1);
}
}

@Flow
private final void C(PreSyncEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u4.a J
// 003: ldc2_w 119380357684194
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 50809921030577
// 00d: lxor
// 00e: dup2
// 00f: bipush 48
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 16
// 018: lshl
// 019: bipush 32
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
// 02b: ldc2_w 90501883722344
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 6594192509721
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 14175583234677
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 104052927830091
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 16439200666834
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 126491725957836
// 051: lxor
// 052: dup2
// 053: bipush 32
// 055: lushr
// 056: l2i
// 057: istore 17
// 059: dup2
// 05a: bipush 32
// 05c: lshl
// 05d: bipush 48
// 05f: lushr
// 060: l2i
// 061: istore 18
// 063: dup2
// 064: bipush 48
// 066: lshl
// 067: bipush 48
// 069: lushr
// 06a: l2i
// 06b: istore 19
// 06d: pop2
// 06e: pop2
// 06f: ldc2_w -8723479537534710522
// 072: lload 2
// 073: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: istore 20
// 07a: lload 15
// 07c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07f: invokevirtual net/minecraft/class_746.method_52535 ()Z
// 082: iload 20
// 084: ifeq 0da
// 087: ifeq 0c5
// 08a: goto 097
// 08d: ldc2_w -8771812202032347739
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: aload 0
// 098: iload 4
// 09a: i2c
// 09b: iload 5
// 09d: iload 6
// 09f: i2c
// 0a0: invokespecial su/catlean/u4.r (CIC)Z
// 0a3: iload 20
// 0a5: ifeq 0da
// 0a8: goto 0b5
// 0ab: ldc2_w -8771812202032347739
// 0ae: lload 2
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: ifne 11b
// 0b8: goto 0c5
// 0bb: ldc2_w -8771812202032347739
// 0be: lload 2
// 0bf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: athrow
// 0c5: lload 15
// 0c7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ca: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 0cd: goto 0da
// 0d0: ldc2_w -8771812202032347739
// 0d3: lload 2
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: iload 20
// 0dc: ifeq 118
// 0df: ifeq 11c
// 0e2: goto 0ef
// 0e5: ldc2_w -8771812202032347739
// 0e8: lload 2
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: aload 0
// 0f0: iload 20
// 0f2: ifeq 11d
// 0f5: goto 102
// 0f8: ldc2_w -8771812202032347739
// 0fb: lload 2
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: iload 17
// 104: iload 18
// 106: iload 19
// 108: invokespecial su/catlean/u4.A (III)Z
// 10b: goto 118
// 10e: ldc2_w -8771812202032347739
// 111: lload 2
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: ifeq 11c
// 11b: return
// 11c: aload 0
// 11d: lload 7
// 11f: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 122: getstatic su/catlean/gq.MATRIX Lsu/catlean/gq;
// 125: if_acmpne 289
// 128: bipush 0
// 129: istore 21
// 12b: lload 11
// 12d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 130: lload 15
// 132: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 135: checkcast net/minecraft/class_1297
// 138: lload 15
// 13a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13d: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 140: ldc2_w 0.5
// 143: dconst_0
// 144: ldc2_w 0.5
// 147: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 14a: dconst_0
// 14b: ldc2_w -1.0
// 14e: dconst_0
// 14f: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 152: invokevirtual net/minecraft/class_638.method_20812 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/lang/Iterable;
// 155: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 15a: astore 22
// 15c: aload 22
// 15e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 163: ifeq 199
// 166: aload 22
// 168: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 16d: dup
// 16e: sipush 29124
// 171: ldc2_w 4645235131432908590
// 174: lload 2
// 175: lxor
// 176: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 17e: checkcast net/minecraft/class_265
// 181: astore 23
// 183: aload 23
// 185: invokestatic net/minecraft/class_259.method_1073 ()Lnet/minecraft/class_265;
// 188: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 18b: ifne 15c
// 18e: bipush 1
// 18f: istore 21
// 191: iload 20
// 193: ifeq 183
// 196: goto 199
// 199: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 19c: lload 9
// 19e: invokevirtual su/catlean/dm.Y (J)Z
// 1a1: iload 20
// 1a3: ifeq 23c
// 1a6: ifeq 227
// 1a9: goto 1b6
// 1ac: ldc2_w -8771812202032347739
// 1af: lload 2
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: iload 21
// 1b8: iload 20
// 1ba: ifeq 23c
// 1bd: goto 1ca
// 1c0: ldc2_w -8771812202032347739
// 1c3: lload 2
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: ifeq 227
// 1cd: goto 1da
// 1d0: ldc2_w -8771812202032347739
// 1d3: lload 2
// 1d4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d9: athrow
// 1da: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1dd: invokevirtual su/catlean/dm.o ()D
// 1e0: dconst_0
// 1e1: dcmpg
// 1e2: iload 20
// 1e4: ifeq 23c
// 1e7: goto 1f4
// 1ea: ldc2_w -8771812202032347739
// 1ed: lload 2
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: ifgt 227
// 1f7: goto 204
// 1fa: ldc2_w -8771812202032347739
// 1fd: lload 2
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: lload 15
// 206: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 209: bipush 1
// 20a: invokevirtual net/minecraft/class_746.method_24830 (Z)V
// 20d: lload 15
// 20f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 212: invokevirtual net/minecraft/class_746.method_6043 ()V
// 215: iload 20
// 217: ifne 289
// 21a: goto 227
// 21d: ldc2_w -8771812202032347739
// 220: lload 2
// 221: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 226: athrow
// 227: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 22a: invokevirtual su/catlean/dm.o ()D
// 22d: dconst_0
// 22e: dcmpl
// 22f: goto 23c
// 232: ldc2_w -8771812202032347739
// 235: lload 2
// 236: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23b: athrow
// 23c: iload 20
// 23e: ifeq 264
// 241: ifle 289
// 244: goto 251
// 247: ldc2_w -8771812202032347739
// 24a: lload 2
// 24b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: athrow
// 251: aload 0
// 252: lload 13
// 254: invokespecial su/catlean/u4.Y (J)Z
// 257: goto 264
// 25a: ldc2_w -8771812202032347739
// 25d: lload 2
// 25e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 263: athrow
// 264: ifeq 289
// 267: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 26a: ldc 1.088
// 26c: invokevirtual su/catlean/tq.x (F)V
// 26f: lload 15
// 271: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 274: dconst_0
// 275: ldc2_w -0.003
// 278: dconst_0
// 279: invokevirtual net/minecraft/class_746.method_5762 (DDD)V
// 27c: goto 289
// 27f: ldc2_w -8771812202032347739
// 282: lload 2
// 283: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 288: athrow
// 289: return
}

@Flow(
priority = -10
)
private final void t(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u4.a J
// 003: ldc2_w 53945430889767
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 53041607154198
// 00d: lxor
// 00e: dup2
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 8
// 018: lshl
// 019: bipush 8
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 17372560733357
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 89506102682800
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 58067500823954
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 47495786577537
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 59205221012228
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 91743946643991
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 51163387544585
// 04d: lxor
// 04e: dup2
// 04f: bipush 32
// 051: lushr
// 052: l2i
// 053: istore 19
// 055: dup2
// 056: bipush 32
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 20
// 05f: dup2
// 060: bipush 48
// 062: lshl
// 063: bipush 48
// 065: lushr
// 066: l2i
// 067: istore 21
// 069: pop2
// 06a: dup2
// 06b: ldc2_w 53059479244617
// 06e: lxor
// 06f: lstore 22
// 071: dup2
// 072: ldc2_w 108747003305675
// 075: lxor
// 076: lstore 24
// 078: dup2
// 079: ldc2_w 100148467976861
// 07c: lxor
// 07d: lstore 26
// 07f: dup2
// 080: ldc2_w 97289958737372
// 083: lxor
// 084: lstore 28
// 086: dup2
// 087: ldc2_w 28083207738882
// 08a: lxor
// 08b: dup2
// 08c: bipush 32
// 08e: lushr
// 08f: l2i
// 090: istore 30
// 092: dup2
// 093: bipush 32
// 095: lshl
// 096: bipush 48
// 098: lushr
// 099: l2i
// 09a: istore 31
// 09c: dup2
// 09d: bipush 48
// 09f: lshl
// 0a0: bipush 48
// 0a2: lushr
// 0a3: l2i
// 0a4: istore 32
// 0a6: pop2
// 0a7: dup2
// 0a8: ldc2_w 11335993749629
// 0ab: lxor
// 0ac: dup2
// 0ad: bipush 48
// 0af: lushr
// 0b0: l2i
// 0b1: istore 33
// 0b3: dup2
// 0b4: bipush 16
// 0b6: lshl
// 0b7: bipush 16
// 0b9: lushr
// 0ba: lstore 34
// 0bc: pop2
// 0bd: dup2
// 0be: ldc2_w 57737893666068
// 0c1: lxor
// 0c2: lstore 36
// 0c4: dup2
// 0c5: ldc2_w 71926649197694
// 0c8: lxor
// 0c9: lstore 38
// 0cb: dup2
// 0cc: ldc2_w 91405549710930
// 0cf: lxor
// 0d0: lstore 40
// 0d2: dup2
// 0d3: ldc2_w 79713179968846
// 0d6: lxor
// 0d7: lstore 42
// 0d9: dup2
// 0da: ldc2_w 66961895432710
// 0dd: lxor
// 0de: dup2
// 0df: bipush 32
// 0e1: lushr
// 0e2: l2i
// 0e3: istore 44
// 0e5: dup2
// 0e6: bipush 32
// 0e8: lshl
// 0e9: bipush 48
// 0eb: lushr
// 0ec: l2i
// 0ed: istore 45
// 0ef: dup2
// 0f0: bipush 48
// 0f2: lshl
// 0f3: bipush 48
// 0f5: lushr
// 0f6: l2i
// 0f7: istore 46
// 0f9: pop2
// 0fa: dup2
// 0fb: ldc2_w 24390684072202
// 0fe: lxor
// 0ff: dup2
// 100: bipush 32
// 102: lushr
// 103: l2i
// 104: istore 47
// 106: dup2
// 107: bipush 32
// 109: lshl
// 10a: bipush 48
// 10c: lushr
// 10d: l2i
// 10e: istore 48
// 110: dup2
// 111: bipush 48
// 113: lshl
// 114: bipush 48
// 116: lushr
// 117: l2i
// 118: istore 49
// 11a: pop2
// 11b: dup2
// 11c: ldc2_w 2050741483693
// 11f: lxor
// 120: lstore 50
// 122: dup2
// 123: ldc2_w 250827654565
// 126: lxor
// 127: lstore 52
// 129: dup2
// 12a: ldc2_w 55257844588233
// 12d: lxor
// 12e: dup2
// 12f: bipush 48
// 131: lushr
// 132: l2i
// 133: istore 54
// 135: dup2
// 136: bipush 16
// 138: lshl
// 139: bipush 32
// 13b: lushr
// 13c: l2i
// 13d: istore 55
// 13f: dup2
// 140: bipush 48
// 142: lshl
// 143: bipush 48
// 145: lushr
// 146: l2i
// 147: istore 56
// 149: pop2
// 14a: dup2
// 14b: ldc2_w 138008761681644
// 14e: lxor
// 14f: dup2
// 150: bipush 32
// 152: lushr
// 153: l2i
// 154: istore 57
// 156: dup2
// 157: bipush 32
// 159: lshl
// 15a: bipush 48
// 15c: lushr
// 15d: l2i
// 15e: istore 58
// 160: dup2
// 161: bipush 48
// 163: lshl
// 164: bipush 48
// 166: lushr
// 167: l2i
// 168: istore 59
// 16a: pop2
// 16b: dup2
// 16c: ldc2_w 127222747072372
// 16f: lxor
// 170: dup2
// 171: bipush 48
// 173: lushr
// 174: l2i
// 175: istore 60
// 177: dup2
// 178: bipush 16
// 17a: lshl
// 17b: bipush 32
// 17d: lushr
// 17e: l2i
// 17f: istore 61
// 181: dup2
// 182: bipush 48
// 184: lshl
// 185: bipush 48
// 187: lushr
// 188: l2i
// 189: istore 62
// 18b: pop2
// 18c: dup2
// 18d: ldc2_w 68102676811677
// 190: lxor
// 191: lstore 63
// 193: dup2
// 194: ldc2_w 99991146878768
// 197: lxor
// 198: lstore 65
// 19a: dup2
// 19b: ldc2_w 56503419541351
// 19e: lxor
// 19f: lstore 67
// 1a1: pop2
// 1a2: ldc2_w 5258403835579178757
// 1a5: lload 2
// 1a6: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: istore 69
// 1ad: lload 17
// 1af: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b2: invokevirtual net/minecraft/class_746.method_52535 ()Z
// 1b5: iload 69
// 1b7: ifne 20d
// 1ba: ifeq 1f8
// 1bd: goto 1ca
// 1c0: ldc2_w 5224490877346515808
// 1c3: lload 2
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: aload 0
// 1cb: iload 60
// 1cd: i2c
// 1ce: iload 61
// 1d0: iload 62
// 1d2: i2c
// 1d3: invokespecial su/catlean/u4.r (CIC)Z
// 1d6: iload 69
// 1d8: ifne 20d
// 1db: goto 1e8
// 1de: ldc2_w 5224490877346515808
// 1e1: lload 2
// 1e2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e7: athrow
// 1e8: ifne 24e
// 1eb: goto 1f8
// 1ee: ldc2_w 5224490877346515808
// 1f1: lload 2
// 1f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: athrow
// 1f8: lload 17
// 1fa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1fd: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 200: goto 20d
// 203: ldc2_w 5224490877346515808
// 206: lload 2
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: iload 69
// 20f: ifne 24b
// 212: ifeq 24f
// 215: goto 222
// 218: ldc2_w 5224490877346515808
// 21b: lload 2
// 21c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 221: athrow
// 222: aload 0
// 223: iload 69
// 225: ifne 250
// 228: goto 235
// 22b: ldc2_w 5224490877346515808
// 22e: lload 2
// 22f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 234: athrow
// 235: iload 19
// 237: iload 20
// 239: iload 21
// 23b: invokespecial su/catlean/u4.A (III)Z
// 23e: goto 24b
// 241: ldc2_w 5224490877346515808
// 244: lload 2
// 245: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: athrow
// 24b: ifeq 24f
// 24e: return
// 24f: aload 0
// 250: lload 7
// 252: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 255: getstatic su/catlean/gq.GRIM_ENTITY Lsu/catlean/gq;
// 258: iload 69
// 25a: ifne 759
// 25d: if_acmpne 750
// 260: goto 26d
// 263: ldc2_w 5224490877346515808
// 266: lload 2
// 267: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26c: athrow
// 26d: getstatic su/catlean/sz.D Lsu/catlean/sz;
// 270: aload 0
// 271: lload 24
// 273: invokespecial su/catlean/u4.T (J)I
// 276: iload 57
// 278: swap
// 279: iload 58
// 27b: swap
// 27c: iload 59
// 27e: i2c
// 27f: swap
// 280: invokevirtual su/catlean/sz.q (IICI)V
// 283: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 286: lload 28
// 288: invokevirtual su/catlean/dm.Y (J)Z
// 28b: iload 69
// 28d: ifne 2ae
// 290: goto 29d
// 293: ldc2_w 5224490877346515808
// 296: lload 2
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: ifeq 750
// 2a0: goto 2ad
// 2a3: ldc2_w 5224490877346515808
// 2a6: lload 2
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: bipush 0
// 2ae: istore 70
// 2b0: lload 9
// 2b2: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2b5: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 2b8: dup
// 2b9: sipush 19520
// 2bc: ldc2_w 5217457342688216161
// 2bf: lload 2
// 2c0: lxor
// 2c1: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c9: astore 72
// 2cb: nop
// 2cc: bipush 0
// 2cd: istore 73
// 2cf: aload 72
// 2d1: astore 74
// 2d3: new java/util/ArrayList
// 2d6: dup
// 2d7: invokespecial java/util/ArrayList.<init> ()V
// 2da: checkcast java/util/Collection
// 2dd: astore 75
// 2df: bipush 0
// 2e0: istore 76
// 2e2: aload 74
// 2e4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2e9: astore 77
// 2eb: aload 77
// 2ed: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2f2: ifeq 3ef
// 2f5: aload 77
// 2f7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2fc: astore 78
// 2fe: aload 78
// 300: checkcast net/minecraft/class_1297
// 303: astore 79
// 305: bipush 0
// 306: istore 80
// 308: aload 79
// 30a: lload 17
// 30c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 30f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 312: iload 69
// 314: ifne 770
// 317: iload 69
// 319: ifne 34b
// 31c: goto 329
// 31f: ldc2_w 5224490877346515808
// 322: lload 2
// 323: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 328: athrow
// 329: ifne 3dc
// 32c: goto 339
// 32f: ldc2_w 5224490877346515808
// 332: lload 2
// 333: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 338: athrow
// 339: aload 79
// 33b: instanceof net/minecraft/class_1531
// 33e: goto 34b
// 341: ldc2_w 5224490877346515808
// 344: lload 2
// 345: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34a: athrow
// 34b: iload 69
// 34d: ifne 39c
// 350: ifeq 38a
// 353: goto 360
// 356: ldc2_w 5224490877346515808
// 359: lload 2
// 35a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35f: athrow
// 360: getstatic su/catlean/u4.S Lsu/catlean/u4;
// 363: lload 67
// 365: invokespecial su/catlean/u4.I (J)Z
// 368: iload 69
// 36a: ifne 39c
// 36d: goto 37a
// 370: ldc2_w 5224490877346515808
// 373: lload 2
// 374: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 379: athrow
// 37a: ifeq 3dc
// 37d: goto 38a
// 380: ldc2_w 5224490877346515808
// 383: lload 2
// 384: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 389: athrow
// 38a: aload 79
// 38c: instanceof net/minecraft/class_1309
// 38f: goto 39c
// 392: ldc2_w 5224490877346515808
// 395: lload 2
// 396: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39b: athrow
// 39c: iload 69
// 39e: ifne 3d9
// 3a1: ifne 3d8
// 3a4: goto 3b1
// 3a7: ldc2_w 5224490877346515808
// 3aa: lload 2
// 3ab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b0: athrow
// 3b1: aload 79
// 3b3: instanceof net/minecraft/class_1690
// 3b6: iload 69
// 3b8: ifne 3d9
// 3bb: goto 3c8
// 3be: ldc2_w 5224490877346515808
// 3c1: lload 2
// 3c2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c7: athrow
// 3c8: ifeq 3dc
// 3cb: goto 3d8
// 3ce: ldc2_w 5224490877346515808
// 3d1: lload 2
// 3d2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d7: athrow
// 3d8: bipush 1
// 3d9: goto 3dd
// 3dc: bipush 0
// 3dd: ifeq 2eb
// 3e0: aload 75
// 3e2: aload 78
// 3e4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 3e9: pop
// 3ea: iload 69
// 3ec: ifeq 2eb
// 3ef: aload 75
// 3f1: checkcast java/util/List
// 3f4: nop
// 3f5: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 3fa: astore 71
// 3fc: aload 71
// 3fe: invokeinterface java/util/Iterator.hasNext ()Z 1
// 403: ifeq 5e9
// 406: aload 71
// 408: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 40d: dup
// 40e: sipush 20187
// 411: ldc2_w 2816756406562047721
// 414: lload 2
// 415: lxor
// 416: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 41e: checkcast net/minecraft/class_1297
// 421: astore 72
// 423: lload 17
// 425: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 428: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 42b: aload 0
// 42c: iload 44
// 42e: iload 45
// 430: iload 46
// 432: i2s
// 433: invokespecial su/catlean/u4.K (IIS)F
// 436: f2d
// 437: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
// 43a: aload 72
// 43c: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 43f: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 442: istore 73
// 444: getstatic su/catlean/sz.D Lsu/catlean/sz;
// 447: invokevirtual su/catlean/sz.W ()Ljava/util/Map;
// 44a: astore 75
// 44c: bipush 0
// 44d: istore 76
// 44f: aload 75
// 451: iload 69
// 453: ifne 48d
// 456: invokeinterface java/util/Map.isEmpty ()Z 1
// 45b: iload 69
// 45d: ifne 5f1
// 460: goto 46d
// 463: ldc2_w 5224490877346515808
// 466: lload 2
// 467: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46c: athrow
// 46d: ifeq 48b
// 470: goto 47d
// 473: ldc2_w 5224490877346515808
// 476: lload 2
// 477: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47c: athrow
// 47d: bipush 0
// 47e: goto 5b1
// 481: ldc2_w 5224490877346515808
// 484: lload 2
// 485: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48a: athrow
// 48b: aload 75
// 48d: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 492: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 497: astore 77
// 499: aload 77
// 49b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4a0: ifeq 5b0
// 4a3: aload 77
// 4a5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4aa: checkcast java/util/Map$Entry
// 4ad: astore 78
// 4af: aload 78
// 4b1: astore 79
// 4b3: bipush 0
// 4b4: istore 80
// 4b6: aload 79
// 4b8: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 4bd: checkcast java/lang/Number
// 4c0: iload 69
// 4c2: ifne 4e4
// 4c5: invokevirtual java/lang/Number.intValue ()I
// 4c8: goto 4d5
// 4cb: ldc2_w 5224490877346515808
// 4ce: lload 2
// 4cf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d4: athrow
// 4d5: aload 72
// 4d7: invokevirtual net/minecraft/class_1297.method_5628 ()I
// 4da: if_icmpne 5a2
// 4dd: aload 79
// 4df: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 4e4: checkcast java/lang/Iterable
// 4e7: astore 81
// 4e9: bipush 0
// 4ea: istore 82
// 4ec: aload 81
// 4ee: iload 69
// 4f0: ifne 542
// 4f3: instanceof java/util/Collection
// 4f6: ifeq 540
// 4f9: goto 506
// 4fc: ldc2_w 5224490877346515808
// 4ff: lload 2
// 500: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 505: athrow
// 506: aload 81
// 508: checkcast java/util/Collection
// 50b: iload 69
// 50d: ifne 542
// 510: goto 51d
// 513: ldc2_w 5224490877346515808
// 516: lload 2
// 517: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51c: athrow
// 51d: invokeinterface java/util/Collection.isEmpty ()Z 1
// 522: ifeq 540
// 525: goto 532
// 528: ldc2_w 5224490877346515808
// 52b: lload 2
// 52c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 531: athrow
// 532: bipush 0
// 533: goto 591
// 536: ldc2_w 5224490877346515808
// 539: lload 2
// 53a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53f: athrow
// 540: aload 81
// 542: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 547: astore 83
// 549: aload 83
// 54b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 550: ifeq 590
// 553: aload 83
// 555: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 55a: astore 84
// 55c: aload 84
// 55e: checkcast net/minecraft/class_238
// 561: astore 85
// 563: bipush 0
// 564: istore 86
// 566: lload 17
// 568: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 56b: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 56e: getstatic su/catlean/u4.S Lsu/catlean/u4;
// 571: iload 44
// 573: iload 45
// 575: iload 46
// 577: i2s
// 578: invokespecial su/catlean/u4.K (IIS)F
// 57b: f2d
// 57c: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
// 57f: aload 85
// 581: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 584: ifeq 549
// 587: bipush 1
// 588: iload 69
// 58a: ifne 584
// 58d: goto 591
// 590: bipush 0
// 591: ifeq 5a2
// 594: bipush 1
// 595: goto 5a3
// 598: ldc2_w 5224490877346515808
// 59b: lload 2
// 59c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a1: athrow
// 5a2: bipush 0
// 5a3: nop
// 5a4: ifeq 499
// 5a7: bipush 1
// 5a8: iload 69
// 5aa: ifne 4d5
// 5ad: goto 5b1
// 5b0: bipush 0
// 5b1: istore 74
// 5b3: iload 69
// 5b5: ifne 5e4
// 5b8: iload 74
// 5ba: ifne 5e1
// 5bd: goto 5ca
// 5c0: ldc2_w 5224490877346515808
// 5c3: lload 2
// 5c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c9: athrow
// 5ca: iload 73
// 5cc: iload 69
// 5ce: ifne 403
// 5d1: goto 5de
// 5d4: ldc2_w 5224490877346515808
// 5d7: lload 2
// 5d8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5dd: athrow
// 5de: ifeq 3fc
// 5e1: iinc 70 1
// 5e4: iload 69
// 5e6: ifeq 3fc
// 5e9: lload 17
// 5eb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5ee: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 5f1: ifeq 607
// 5f4: aload 0
// 5f5: lload 42
// 5f7: invokespecial su/catlean/u4.i (J)F
// 5fa: goto 612
// 5fd: ldc2_w 5224490877346515808
// 600: lload 2
// 601: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 606: athrow
// 607: aload 0
// 608: iload 54
// 60a: i2c
// 60b: iload 55
// 60d: iload 56
// 60f: invokespecial su/catlean/u4.s (CII)F
// 612: fstore 71
// 614: aload 0
// 615: lload 50
// 617: invokespecial su/catlean/u4.R (J)Lsu/catlean/px;
// 61a: getstatic su/catlean/j6.k [I
// 61d: swap
// 61e: invokevirtual su/catlean/px.ordinal ()I
// 621: iaload
// 622: tableswitch 233 1 3 26 51 62
// 63c: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 63f: lload 65
// 641: bipush 1
// 642: invokevirtual su/catlean/_8.f (JZ)Lsu/catlean/_w;
// 645: invokevirtual su/catlean/_w.q ()F
// 648: goto 713
// 64b: ldc2_w 5224490877346515808
// 64e: lload 2
// 64f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 654: athrow
// 655: lload 17
// 657: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 65a: invokevirtual net/minecraft/class_746.method_36454 ()F
// 65d: goto 713
// 660: getstatic su/catlean/um.E Lsu/catlean/um;
// 663: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 666: astore 75
// 668: getstatic su/catlean/um.E Lsu/catlean/um;
// 66b: lload 22
// 66d: invokevirtual su/catlean/um.f (J)Z
// 670: ifeq 6fc
// 673: aload 75
// 675: ifnull 6fc
// 678: goto 685
// 67b: ldc2_w 5224490877346515808
// 67e: lload 2
// 67f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 684: athrow
// 685: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 688: aload 0
// 689: iload 4
// 68b: i2b
// 68c: lload 5
// 68e: aload 75
// 690: invokevirtual su/catlean/u4.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 693: new net/minecraft/class_243
// 696: dup
// 697: aload 75
// 699: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 69c: aload 75
// 69e: getfield net/minecraft/class_1297.field_6014 D
// 6a1: dsub
// 6a2: aload 75
// 6a4: invokevirtual net/minecraft/class_1297.method_23318 ()D
// 6a7: aload 75
// 6a9: getfield net/minecraft/class_1297.field_6036 D
// 6ac: dsub
// 6ad: aload 75
// 6af: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 6b2: aload 75
// 6b4: getfield net/minecraft/class_1297.field_5969 D
// 6b7: dsub
// 6b8: invokespecial net/minecraft/class_243.<init> (DDD)V
// 6bb: aload 0
// 6bc: lload 11
// 6be: invokespecial su/catlean/u4.z (J)F
// 6c1: f2d
// 6c2: aload 0
// 6c3: lload 11
// 6c5: invokespecial su/catlean/u4.z (J)F
// 6c8: f2d
// 6c9: aload 0
// 6ca: lload 11
// 6cc: invokespecial su/catlean/u4.z (J)F
// 6cf: f2d
// 6d0: invokevirtual net/minecraft/class_243.method_18805 (DDD)Lnet/minecraft/class_243;
// 6d3: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
// 6d6: dup
// 6d7: sipush 3214
// 6da: ldc2_w 8045759375979742398
// 6dd: lload 2
// 6de: lxor
// 6df: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6e7: lload 36
// 6e9: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 6ec: invokevirtual su/catlean/_w.q ()F
// 6ef: goto 713
// 6f2: ldc2_w 5224490877346515808
// 6f5: lload 2
// 6f6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fb: athrow
// 6fc: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 6ff: lload 65
// 701: bipush 1
// 702: invokevirtual su/catlean/_8.f (JZ)Lsu/catlean/_w;
// 705: invokevirtual su/catlean/_w.q ()F
// 708: goto 713
// 70b: new kotlin/NoWhenBranchMatchedException
// 70e: dup
// 70f: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 712: athrow
// 713: fstore 72
// 715: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 718: fload 71
// 71a: ldc 100.0
// 71c: fdiv
// 71d: iload 70
// 71f: i2f
// 720: fmul
// 721: bipush 0
// 722: fconst_0
// 723: lload 13
// 725: fconst_0
// 726: fload 72
// 728: sipush 4869
// 72b: ldc2_w 6167552101618112225
// 72e: lload 2
// 72f: lxor
// 730: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 735: aconst_null
// 736: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 739: astore 74
// 73b: bipush 0
// 73c: istore 75
// 73e: lload 17
// 740: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 743: aload 74
// 745: bipush 0
// 746: daload
// 747: dconst_0
// 748: aload 74
// 74a: bipush 1
// 74b: daload
// 74c: invokevirtual net/minecraft/class_746.method_5762 (DDD)V
// 74f: nop
// 750: aload 0
// 751: lload 7
// 753: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 756: getstatic su/catlean/gq.FIREWORK Lsu/catlean/gq;
// 759: if_acmpne b45
// 75c: getstatic su/catlean/u4.t I
// 75f: istore 70
// 761: iload 70
// 763: bipush -1
// 764: iadd
// 765: putstatic su/catlean/u4.t I
// 768: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 76b: lload 38
// 76d: invokevirtual su/catlean/gg.O (J)I
// 770: istore 70
// 772: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 775: bipush 1
// 776: anewarray 890
// 779: astore 72
// 77b: aload 72
// 77d: bipush 0
// 77e: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 781: dup
// 782: sipush 4603
// 785: ldc2_w 6411426720191912406
// 788: lload 2
// 789: lxor
// 78a: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 792: aastore
// 793: iload 30
// 795: aload 72
// 797: iload 31
// 799: iload 32
// 79b: i2c
// 79c: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 79f: astore 71
// 7a1: lload 17
// 7a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7a6: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 7a9: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 7ac: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 7af: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 7b2: istore 72
// 7b4: aload 71
// 7b6: invokevirtual su/catlean/fg.R ()Z
// 7b9: iload 69
// 7bb: ifne 850
// 7be: ifne 84e
// 7c1: goto 7ce
// 7c4: ldc2_w 5224490877346515808
// 7c7: lload 2
// 7c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7cd: athrow
// 7ce: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 7d1: bipush 1
// 7d2: anewarray 890
// 7d5: astore 74
// 7d7: aload 74
// 7d9: bipush 0
// 7da: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 7dd: dup
// 7de: sipush 27857
// 7e1: ldc2_w 6056769005060449506
// 7e4: lload 2
// 7e5: lxor
// 7e6: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7eb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7ee: aastore
// 7ef: aload 74
// 7f1: iload 33
// 7f3: i2c
// 7f4: lload 34
// 7f6: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 7f9: astore 73
// 7fb: aload 73
// 7fd: invokevirtual su/catlean/fg.R ()Z
// 800: iload 69
// 802: ifne 850
// 805: ifeq 84e
// 808: goto 815
// 80b: ldc2_w 5224490877346515808
// 80e: lload 2
// 80f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 814: athrow
// 815: aload 73
// 817: invokevirtual su/catlean/fg.a ()I
// 81a: aload 0
// 81b: iload 47
// 81d: iload 48
// 81f: i2c
// 820: iload 49
// 822: i2c
// 823: invokespecial su/catlean/u4.H (ICC)I
// 826: bipush 1
// 827: isub
// 828: lload 52
// 82a: dup2_x1
// 82b: pop2
// 82c: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 82f: bipush 0
// 830: sipush 17568
// 833: ldc2_w 6103810677767274829
// 836: lload 2
// 837: lxor
// 838: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83d: aconst_null
// 83e: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 841: goto 84e
// 844: ldc2_w 5224490877346515808
// 847: lload 2
// 848: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84d: athrow
// 84e: iload 70
// 850: iload 69
// 852: ifne 878
// 855: bipush -1
// 856: if_icmpeq b45
// 859: goto 866
// 85c: ldc2_w 5224490877346515808
// 85f: lload 2
// 860: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 865: athrow
// 866: aload 71
// 868: invokevirtual su/catlean/fg.R ()Z
// 86b: goto 878
// 86e: ldc2_w 5224490877346515808
// 871: lload 2
// 872: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 877: athrow
// 878: iload 69
// 87a: ifne 8c6
// 87d: ifne 8b1
// 880: goto 88d
// 883: ldc2_w 5224490877346515808
// 886: lload 2
// 887: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88c: athrow
// 88d: iload 72
// 88f: iload 69
// 891: ifne 8c6
// 894: goto 8a1
// 897: ldc2_w 5224490877346515808
// 89a: lload 2
// 89b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a0: athrow
// 8a1: ifeq b45
// 8a4: goto 8b1
// 8a7: ldc2_w 5224490877346515808
// 8aa: lload 2
// 8ab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b0: athrow
// 8b1: lload 17
// 8b3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 8b6: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 8b9: goto 8c6
// 8bc: ldc2_w 5224490877346515808
// 8bf: lload 2
// 8c0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c5: athrow
// 8c6: iload 69
// 8c8: ifne 8f0
// 8cb: ifne b45
// 8ce: goto 8db
// 8d1: ldc2_w 5224490877346515808
// 8d4: lload 2
// 8d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8da: athrow
// 8db: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 8de: invokevirtual su/catlean/dm.o ()D
// 8e1: dconst_0
// 8e2: dcmpl
// 8e3: goto 8f0
// 8e6: ldc2_w 5224490877346515808
// 8e9: lload 2
// 8ea: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8ef: athrow
// 8f0: iload 69
// 8f2: ifne 908
// 8f5: ifle b45
// 8f8: goto 905
// 8fb: ldc2_w 5224490877346515808
// 8fe: lload 2
// 8ff: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 904: athrow
// 905: getstatic su/catlean/u4.t I
// 908: iload 69
// 90a: ifne 91f
// 90d: ifgt b45
// 910: goto 91d
// 913: ldc2_w 5224490877346515808
// 916: lload 2
// 917: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91c: athrow
// 91d: iload 70
// 91f: iload 69
// 921: ifne 9d7
// 924: sipush 29505
// 927: ldc2_w 6707579106998204066
// 92a: lload 2
// 92b: lxor
// 92c: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 931: if_icmpeq 9a1
// 934: goto 941
// 937: ldc2_w 5224490877346515808
// 93a: lload 2
// 93b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 940: athrow
// 941: iload 70
// 943: lload 52
// 945: bipush 0
// 946: aconst_null
// 947: bipush 0
// 948: sipush 9400
// 94b: ldc2_w 6969663346683208023
// 94e: lload 2
// 94f: lxor
// 950: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 955: aconst_null
// 956: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 959: sipush 30671
// 95c: ldc2_w 487016344194691622
// 95f: lload 2
// 960: lxor
// 961: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 966: lload 52
// 968: bipush 0
// 969: aconst_null
// 96a: bipush 0
// 96b: sipush 9400
// 96e: ldc2_w 6969663346683208023
// 971: lload 2
// 972: lxor
// 973: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 978: aconst_null
// 979: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 97c: iload 70
// 97e: lload 52
// 980: bipush 0
// 981: aconst_null
// 982: bipush 1
// 983: sipush 31515
// 986: ldc2_w 6044825350687112937
// 989: lload 2
// 98a: lxor
// 98b: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 990: aconst_null
// 991: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 994: goto 9a1
// 997: ldc2_w 5224490877346515808
// 99a: lload 2
// 99b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a0: athrow
// 9a1: getstatic su/catlean/qc.k Lsu/catlean/qc;
// 9a4: bipush 1
// 9a5: invokevirtual su/catlean/qc.K (Z)V
// 9a8: new net/minecraft/class_2848
// 9ab: dup
// 9ac: lload 17
// 9ae: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9b1: checkcast net/minecraft/class_1297
// 9b4: getstatic net/minecraft/class_2848$class_2849.field_12982 Lnet/minecraft/class_2848$class_2849;
// 9b7: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 9ba: checkcast net/minecraft/class_2596
// 9bd: lload 40
// 9bf: dup2_x1
// 9c0: pop2
// 9c1: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 9c4: lload 17
// 9c6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9c9: invokevirtual net/minecraft/class_746.method_23669 ()V
// 9cc: lload 17
// 9ce: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 9d1: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 9d4: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 9d7: istore 73
// 9d9: iload 73
// 9db: iload 69
// 9dd: ifne a35
// 9e0: aload 71
// 9e2: invokevirtual su/catlean/fg.a ()I
// 9e5: if_icmpeq a33
// 9e8: goto 9f5
// 9eb: ldc2_w 5224490877346515808
// 9ee: lload 2
// 9ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9f4: athrow
// 9f5: iload 72
// 9f7: iload 69
// 9f9: ifne a35
// 9fc: goto a09
// 9ff: ldc2_w 5224490877346515808
// a02: lload 2
// a03: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a08: athrow
// a09: ifne a33
// a0c: goto a19
// a0f: ldc2_w 5224490877346515808
// a12: lload 2
// a13: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a18: athrow
// a19: getstatic su/catlean/gg.P Lsu/catlean/gg;
// a1c: aload 71
// a1e: invokevirtual su/catlean/fg.a ()I
// a21: lload 63
// a23: invokevirtual su/catlean/gg.f (IJ)V
// a26: goto a33
// a29: ldc2_w 5224490877346515808
// a2c: lload 2
// a2d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a32: athrow
// a33: iload 72
// a35: ifeq a48
// a38: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
// a3b: goto a4b
// a3e: ldc2_w 5224490877346515808
// a41: lload 2
// a42: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a47: athrow
// a48: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// a4b: fconst_0
// a4c: lload 26
// a4e: fconst_0
// a4f: sipush 31515
// a52: ldc2_w 6044825350687112937
// a55: lload 2
// a56: lxor
// a57: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a5c: aconst_null
// a5d: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// a60: pop
// a61: iload 73
// a63: aload 71
// a65: invokevirtual su/catlean/fg.a ()I
// a68: iload 69
// a6a: ifne ad9
// a6d: if_icmpeq ab8
// a70: goto a7d
// a73: ldc2_w 5224490877346515808
// a76: lload 2
// a77: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7c: athrow
// a7d: iload 72
// a7f: iload 69
// a81: ifne aba
// a84: goto a91
// a87: ldc2_w 5224490877346515808
// a8a: lload 2
// a8b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a90: athrow
// a91: ifne ab8
// a94: goto aa1
// a97: ldc2_w 5224490877346515808
// a9a: lload 2
// a9b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aa0: athrow
// aa1: getstatic su/catlean/gg.P Lsu/catlean/gg;
// aa4: iload 73
// aa6: lload 63
// aa8: invokevirtual su/catlean/gg.f (IJ)V
// aab: goto ab8
// aae: ldc2_w 5224490877346515808
// ab1: lload 2
// ab2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ab7: athrow
// ab8: iload 70
// aba: iload 69
// abc: ifne b42
// abf: sipush 10794
// ac2: ldc2_w 2666142279056388032
// ac5: lload 2
// ac6: lxor
// ac7: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// acc: goto ad9
// acf: ldc2_w 5224490877346515808
// ad2: lload 2
// ad3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ad8: athrow
// ad9: if_icmpeq b3c
// adc: iload 70
// ade: lload 52
// ae0: bipush 0
// ae1: aconst_null
// ae2: bipush 0
// ae3: sipush 9400
// ae6: ldc2_w 6969663346683208023
// ae9: lload 2
// aea: lxor
// aeb: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// af0: aconst_null
// af1: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// af4: sipush 31515
// af7: ldc2_w 6044825350687112937
// afa: lload 2
// afb: lxor
// afc: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b01: lload 52
// b03: bipush 0
// b04: aconst_null
// b05: bipush 0
// b06: sipush 9400
// b09: ldc2_w 6969663346683208023
// b0c: lload 2
// b0d: lxor
// b0e: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b13: aconst_null
// b14: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// b17: iload 70
// b19: lload 52
// b1b: bipush 0
// b1c: aconst_null
// b1d: bipush 1
// b1e: sipush 31515
// b21: ldc2_w 6044825350687112937
// b24: lload 2
// b25: lxor
// b26: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b2b: aconst_null
// b2c: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// b2f: goto b3c
// b32: ldc2_w 5224490877346515808
// b35: lload 2
// b36: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b3b: athrow
// b3c: aload 0
// b3d: lload 15
// b3f: invokespecial su/catlean/u4.v (J)I
// b42: putstatic su/catlean/u4.t I
// b45: return
}

@Flow
private final void I(MoveEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u4.a J
// 003: ldc2_w 138601044493725
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 93125936036752
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
// 02b: ldc2_w 66709140445134
// 02e: lxor
// 02f: dup2
// 030: bipush 48
// 032: lushr
// 033: l2i
// 034: istore 7
// 036: dup2
// 037: bipush 16
// 039: lshl
// 03a: bipush 32
// 03c: lushr
// 03d: l2i
// 03e: istore 8
// 040: dup2
// 041: bipush 48
// 043: lshl
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 9
// 04a: pop2
// 04b: dup2
// 04c: ldc2_w 71272456561687
// 04f: lxor
// 050: lstore 10
// 052: dup2
// 053: ldc2_w 25712380958054
// 056: lxor
// 057: lstore 12
// 059: dup2
// 05a: ldc2_w 42513806032418
// 05d: lxor
// 05e: lstore 14
// 060: dup2
// 061: ldc2_w 33507041588234
// 064: lxor
// 065: lstore 16
// 067: dup2
// 068: ldc2_w 83834542016052
// 06b: lxor
// 06c: lstore 18
// 06e: dup2
// 06f: ldc2_w 31260808481453
// 072: lxor
// 073: lstore 20
// 075: dup2
// 076: ldc2_w 107300424602803
// 079: lxor
// 07a: dup2
// 07b: bipush 32
// 07d: lushr
// 07e: l2i
// 07f: istore 22
// 081: dup2
// 082: bipush 32
// 084: lshl
// 085: bipush 48
// 087: lushr
// 088: l2i
// 089: istore 23
// 08b: dup2
// 08c: bipush 48
// 08e: lshl
// 08f: bipush 48
// 091: lushr
// 092: l2i
// 093: istore 24
// 095: pop2
// 096: dup2
// 097: ldc2_w 140047799197683
// 09a: lxor
// 09b: lstore 25
// 09d: dup2
// 09e: ldc2_w 90853393654284
// 0a1: lxor
// 0a2: lstore 27
// 0a4: pop2
// 0a5: ldc2_w 6360161789027848127
// 0a8: lload 2
// 0a9: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: istore 29
// 0b0: lload 20
// 0b2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b5: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 0b8: getfield net/minecraft/class_1656.field_7479 Z
// 0bb: iload 29
// 0bd: ifne 0d9
// 0c0: ifeq 0d1
// 0c3: goto 0d0
// 0c6: ldc2_w 6357765300149623770
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: return
// 0d1: lload 20
// 0d3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d6: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 0d9: iload 29
// 0db: ifne 0fa
// 0de: ifeq 0ef
// 0e1: goto 0ee
// 0e4: ldc2_w 6357765300149623770
// 0e7: lload 2
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: return
// 0ef: lload 20
// 0f1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f4: invokevirtual net/minecraft/class_746.method_7344 ()Lnet/minecraft/class_1702;
// 0f7: invokevirtual net/minecraft/class_1702.method_7586 ()I
// 0fa: iload 29
// 0fc: ifne 12b
// 0ff: sipush 31515
// 102: ldc2_w 6044894750576750163
// 105: lload 2
// 106: lxor
// 107: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: if_icmpgt 127
// 10f: goto 11c
// 112: ldc2_w 6357765300149623770
// 115: lload 2
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: return
// 11d: ldc2_w 6357765300149623770
// 120: lload 2
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: aload 1
// 128: invokevirtual su/catlean/api/event/events/player/MoveEvent.getCancelled ()Z
// 12b: iload 29
// 12d: ifne 149
// 130: ifeq 141
// 133: goto 140
// 136: ldc2_w 6357765300149623770
// 139: lload 2
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: return
// 141: lload 20
// 143: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 146: invokevirtual net/minecraft/class_746.method_52535 ()Z
// 149: iload 29
// 14b: ifne 1a1
// 14e: ifeq 18c
// 151: goto 15e
// 154: ldc2_w 6357765300149623770
// 157: lload 2
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: aload 0
// 15f: iload 7
// 161: i2c
// 162: iload 8
// 164: iload 9
// 166: i2c
// 167: invokespecial su/catlean/u4.r (CIC)Z
// 16a: iload 29
// 16c: ifne 1a1
// 16f: goto 17c
// 172: ldc2_w 6357765300149623770
// 175: lload 2
// 176: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17b: athrow
// 17c: ifne 1e2
// 17f: goto 18c
// 182: ldc2_w 6357765300149623770
// 185: lload 2
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: lload 20
// 18e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 191: invokevirtual net/minecraft/class_746.method_5715 ()Z
// 194: goto 1a1
// 197: ldc2_w 6357765300149623770
// 19a: lload 2
// 19b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: athrow
// 1a1: iload 29
// 1a3: ifne 1df
// 1a6: ifeq 1e3
// 1a9: goto 1b6
// 1ac: ldc2_w 6357765300149623770
// 1af: lload 2
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: aload 0
// 1b7: iload 29
// 1b9: ifne 1e4
// 1bc: goto 1c9
// 1bf: ldc2_w 6357765300149623770
// 1c2: lload 2
// 1c3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c8: athrow
// 1c9: iload 22
// 1cb: iload 23
// 1cd: iload 24
// 1cf: invokespecial su/catlean/u4.A (III)Z
// 1d2: goto 1df
// 1d5: ldc2_w 6357765300149623770
// 1d8: lload 2
// 1d9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1de: athrow
// 1df: ifeq 1e3
// 1e2: return
// 1e3: aload 0
// 1e4: lload 10
// 1e6: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 1e9: getstatic su/catlean/gq.NCP Lsu/catlean/gq;
// 1ec: iload 29
// 1ee: ifne 217
// 1f1: if_acmpeq 22c
// 1f4: goto 201
// 1f7: ldc2_w 6357765300149623770
// 1fa: lload 2
// 1fb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 200: athrow
// 201: aload 0
// 202: lload 10
// 204: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 207: getstatic su/catlean/gq.STRICT_STRAFE Lsu/catlean/gq;
// 20a: goto 217
// 20d: ldc2_w 6357765300149623770
// 210: lload 2
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: iload 29
// 219: ifne 738
// 21c: if_acmpne 72f
// 21f: goto 22c
// 222: ldc2_w 6357765300149623770
// 225: lload 2
// 226: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22b: athrow
// 22c: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 22f: lload 12
// 231: invokevirtual su/catlean/dm.Y (J)Z
// 234: iload 29
// 236: ifne 27b
// 239: goto 246
// 23c: ldc2_w 6357765300149623770
// 23f: lload 2
// 240: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 245: athrow
// 246: ifeq 714
// 249: goto 256
// 24c: ldc2_w 6357765300149623770
// 24f: lload 2
// 250: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 255: athrow
// 256: aload 0
// 257: iload 29
// 259: ifne 294
// 25c: goto 269
// 25f: ldc2_w 6357765300149623770
// 262: lload 2
// 263: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 268: athrow
// 269: lload 18
// 26b: invokespecial su/catlean/u4.Y (J)Z
// 26e: goto 27b
// 271: ldc2_w 6357765300149623770
// 274: lload 2
// 275: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27a: athrow
// 27b: ifeq 293
// 27e: getstatic su/catlean/tq.I Lsu/catlean/tq;
// 281: ldc 1.088
// 283: invokevirtual su/catlean/tq.x (F)V
// 286: goto 293
// 289: ldc2_w 6357765300149623770
// 28c: lload 2
// 28d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 292: athrow
// 293: aload 0
// 294: lload 10
// 296: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 299: getstatic su/catlean/gq.NCP Lsu/catlean/gq;
// 29c: if_acmpne 311
// 29f: lload 20
// 2a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a4: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 2a7: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 2aa: getfield net/minecraft/class_241.field_1342 F
// 2ad: fconst_0
// 2ae: fcmpg
// 2af: iload 29
// 2b1: ifne 2f5
// 2b4: goto 2c1
// 2b7: ldc2_w 6357765300149623770
// 2ba: lload 2
// 2bb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c0: athrow
// 2c1: ifgt 311
// 2c4: goto 2d1
// 2c7: ldc2_w 6357765300149623770
// 2ca: lload 2
// 2cb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d0: athrow
// 2d1: getstatic su/catlean/u4.l F
// 2d4: fconst_0
// 2d5: iload 29
// 2d7: ifne 30d
// 2da: goto 2e7
// 2dd: ldc2_w 6357765300149623770
// 2e0: lload 2
// 2e1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: athrow
// 2e7: fcmpl
// 2e8: goto 2f5
// 2eb: ldc2_w 6357765300149623770
// 2ee: lload 2
// 2ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f4: athrow
// 2f5: ifle 311
// 2f8: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2fb: invokevirtual su/catlean/dm.r ()F
// 2fe: ldc 0.66
// 300: goto 30d
// 303: ldc2_w 6357765300149623770
// 306: lload 2
// 307: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30c: athrow
// 30d: fmul
// 30e: goto 317
// 311: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 314: invokevirtual su/catlean/dm.r ()F
// 317: fstore 30
// 319: lload 20
// 31b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 31e: getfield net/minecraft/class_746.field_5976 Z
// 321: iload 29
// 323: ifne 361
// 326: ifeq 360
// 329: goto 336
// 32c: ldc2_w 6357765300149623770
// 32f: lload 2
// 330: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 335: athrow
// 336: getstatic su/catlean/u5.g Lsu/catlean/u5;
// 339: lload 25
// 33b: invokevirtual su/catlean/u5.f (J)Z
// 33e: iload 29
// 340: ifne 361
// 343: goto 350
// 346: ldc2_w 6357765300149623770
// 349: lload 2
// 34a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34f: athrow
// 350: ifne 364
// 353: goto 360
// 356: ldc2_w 6357765300149623770
// 359: lload 2
// 35a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35f: athrow
// 360: bipush 1
// 361: goto 365
// 364: bipush 0
// 365: istore 31
// 367: getstatic su/catlean/u4.i I
// 36a: bipush 1
// 36b: iload 29
// 36d: ifne 44f
// 370: if_icmpne 42c
// 373: goto 380
// 376: ldc2_w 6357765300149623770
// 379: lload 2
// 37a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37f: athrow
// 380: lload 20
// 382: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 385: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 388: iload 29
// 38a: ifne 43c
// 38d: goto 39a
// 390: ldc2_w 6357765300149623770
// 393: lload 2
// 394: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 399: athrow
// 39a: ifeq 42c
// 39d: goto 3aa
// 3a0: ldc2_w 6357765300149623770
// 3a3: lload 2
// 3a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a9: athrow
// 3aa: iload 31
// 3ac: iload 29
// 3ae: ifne 43c
// 3b1: goto 3be
// 3b4: ldc2_w 6357765300149623770
// 3b7: lload 2
// 3b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bd: athrow
// 3be: ifeq 42c
// 3c1: goto 3ce
// 3c4: ldc2_w 6357765300149623770
// 3c7: lload 2
// 3c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cd: athrow
// 3ce: lload 20
// 3d0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3d3: lload 20
// 3d5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3d8: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 3db: getfield net/minecraft/class_243.field_1352 D
// 3de: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 3e1: lload 14
// 3e3: invokevirtual su/catlean/dm.n (J)D
// 3e6: lload 20
// 3e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3eb: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 3ee: getfield net/minecraft/class_243.field_1350 D
// 3f1: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 3f4: sipush 1373
// 3f7: aload 1
// 3f8: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 3fb: lload 14
// 3fd: invokevirtual su/catlean/dm.n (J)D
// 400: invokevirtual su/catlean/api/event/events/player/MoveEvent.setY (D)V
// 403: ldc2_w 811801875953963009
// 406: lload 2
// 407: lxor
// 408: getstatic su/catlean/u4.d D
// 40b: ldc2_w 2.149
// 40e: dmul
// 40f: putstatic su/catlean/u4.d D
// 412: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 417: putstatic su/catlean/u4.i I
// 41a: iload 29
// 41c: ifeq 51b
// 41f: goto 42c
// 422: ldc2_w 6357765300149623770
// 425: lload 2
// 426: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42b: athrow
// 42c: getstatic su/catlean/u4.i I
// 42f: goto 43c
// 432: ldc2_w 6357765300149623770
// 435: lload 2
// 436: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43b: athrow
// 43c: iload 29
// 43e: ifne 4ca
// 441: bipush 2
// 442: goto 44f
// 445: ldc2_w 6357765300149623770
// 448: lload 2
// 449: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 44e: athrow
// 44f: if_icmpne 48b
// 452: fload 30
// 454: f2d
// 455: ldc2_w 0.66
// 458: fload 30
// 45a: f2d
// 45b: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 45e: lload 27
// 460: invokevirtual su/catlean/dm.a (J)D
// 463: dsub
// 464: dmul
// 465: dsub
// 466: putstatic su/catlean/u4.d D
// 469: sipush 25108
// 46c: ldc2_w 762816977168119627
// 46f: lload 2
// 470: lxor
// 471: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 476: putstatic su/catlean/u4.i I
// 479: iload 29
// 47b: ifeq 51b
// 47e: goto 48b
// 481: ldc2_w 6357765300149623770
// 484: lload 2
// 485: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48a: athrow
// 48b: lload 16
// 48d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 490: lload 20
// 492: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 495: checkcast net/minecraft/class_1297
// 498: lload 20
// 49a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 49d: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 4a0: dconst_0
// 4a1: lload 20
// 4a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4a6: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 4a9: invokevirtual net/minecraft/class_243.method_10214 ()D
// 4ac: dconst_0
// 4ad: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 4b0: invokevirtual net/minecraft/class_638.method_20812 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/lang/Iterable;
// 4b3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 4b8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4bd: goto 4ca
// 4c0: ldc2_w 6357765300149623770
// 4c3: lload 2
// 4c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c9: athrow
// 4ca: iload 29
// 4cc: ifne 50a
// 4cf: ifne 509
// 4d2: goto 4df
// 4d5: ldc2_w 6357765300149623770
// 4d8: lload 2
// 4d9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4de: athrow
// 4df: lload 20
// 4e1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 4e4: getfield net/minecraft/class_746.field_5992 Z
// 4e7: iload 29
// 4e9: ifne 50a
// 4ec: goto 4f9
// 4ef: ldc2_w 6357765300149623770
// 4f2: lload 2
// 4f3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f8: athrow
// 4f9: ifeq 50d
// 4fc: goto 509
// 4ff: ldc2_w 6357765300149623770
// 502: lload 2
// 503: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 508: athrow
// 509: bipush 1
// 50a: putstatic su/catlean/u4.i I
// 50d: fload 30
// 50f: f2d
// 510: fload 30
// 512: f2d
// 513: ldc2_w 159.0
// 516: ddiv
// 517: dsub
// 518: putstatic su/catlean/u4.d D
// 51b: getstatic su/catlean/u4.d D
// 51e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 521: lload 27
// 523: invokevirtual su/catlean/dm.a (J)D
// 526: invokestatic java/lang/Math.max (DD)D
// 529: iload 29
// 52b: ifne 57a
// 52e: putstatic su/catlean/u4.d D
// 531: aload 0
// 532: lload 10
// 534: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 537: getstatic su/catlean/gq.STRICT_STRAFE Lsu/catlean/gq;
// 53a: if_acmpeq 56a
// 53d: goto 54a
// 540: ldc2_w 6357765300149623770
// 543: lload 2
// 544: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 549: athrow
// 54a: lload 20
// 54c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 54f: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 552: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 555: getfield net/minecraft/class_241.field_1342 F
// 558: fconst_1
// 559: fcmpg
// 55a: ifge 57d
// 55d: goto 56a
// 560: ldc2_w 6357765300149623770
// 563: lload 2
// 564: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 569: athrow
// 56a: ldc2_w 0.465
// 56d: goto 57a
// 570: ldc2_w 6357765300149623770
// 573: lload 2
// 574: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 579: athrow
// 57a: goto 580
// 57d: ldc2_w 0.576
// 580: dstore 32
// 582: aload 0
// 583: lload 10
// 585: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 588: getstatic su/catlean/gq.STRICT_STRAFE Lsu/catlean/gq;
// 58b: if_acmpeq 5ae
// 58e: lload 20
// 590: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 593: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 596: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 599: getfield net/minecraft/class_241.field_1342 F
// 59c: fconst_1
// 59d: fcmpg
// 59e: ifge 5be
// 5a1: goto 5ae
// 5a4: ldc2_w 6357765300149623770
// 5a7: lload 2
// 5a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ad: athrow
// 5ae: ldc2_w 0.44
// 5b1: goto 5c1
// 5b4: ldc2_w 6357765300149623770
// 5b7: lload 2
// 5b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5bd: athrow
// 5be: ldc2_w 0.57
// 5c1: dstore 34
// 5c3: lload 20
// 5c5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5c8: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
// 5cb: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 5ce: iload 29
// 5d0: ifne 625
// 5d3: ifeq 61a
// 5d6: goto 5e3
// 5d9: ldc2_w 6357765300149623770
// 5dc: lload 2
// 5dd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e2: athrow
// 5e3: lload 20
// 5e5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5e8: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
// 5eb: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 5ee: dup
// 5ef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5f2: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 5f5: i2d
// 5f6: dstore 36
// 5f8: dload 32
// 5fa: bipush 1
// 5fb: i2d
// 5fc: ldc2_w 0.2
// 5ff: dload 36
// 601: bipush 1
// 602: i2d
// 603: dadd
// 604: dmul
// 605: dadd
// 606: dmul
// 607: dstore 32
// 609: dload 34
// 60b: bipush 1
// 60c: i2d
// 60d: ldc2_w 0.2
// 610: dload 36
// 612: bipush 1
// 613: i2d
// 614: dadd
// 615: dmul
// 616: dadd
// 617: dmul
// 618: dstore 34
// 61a: lload 20
// 61c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 61f: getstatic net/minecraft/class_1294.field_5909 Lnet/minecraft/class_6880;
// 622: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 625: iload 29
// 627: ifne 659
// 62a: ifeq 67e
// 62d: goto 63a
// 630: ldc2_w 6357765300149623770
// 633: lload 2
// 634: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 639: athrow
// 63a: lload 20
// 63c: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 63f: getstatic net/minecraft/class_1294.field_5909 Lnet/minecraft/class_6880;
// 642: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 645: dup
// 646: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 649: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 64c: goto 659
// 64f: ldc2_w 6357765300149623770
// 652: lload 2
// 653: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 658: athrow
// 659: i2d
// 65a: dstore 36
// 65c: dload 32
// 65e: bipush 1
// 65f: i2d
// 660: ldc2_w 0.2
// 663: dload 36
// 665: bipush 1
// 666: i2d
// 667: dadd
// 668: dmul
// 669: dadd
// 66a: ddiv
// 66b: dstore 32
// 66d: dload 34
// 66f: bipush 1
// 670: i2d
// 671: ldc2_w 0.2
// 674: dload 36
// 676: bipush 1
// 677: i2d
// 678: dadd
// 679: dmul
// 67a: dadd
// 67b: ddiv
// 67c: dstore 34
// 67e: getstatic su/catlean/u4.d D
// 681: getstatic su/catlean/u4.t I
// 684: sipush 1311
// 687: ldc2_w 4320866975676584028
// 68a: lload 2
// 68b: lxor
// 68c: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 691: if_icmple 6a3
// 694: dload 32
// 696: goto 6a5
// 699: ldc2_w 6357765300149623770
// 69c: lload 2
// 69d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a2: athrow
// 6a3: dload 34
// 6a5: invokestatic java/lang/Math.min (DD)D
// 6a8: putstatic su/catlean/u4.d D
// 6ab: getstatic su/catlean/u4.t I
// 6ae: istore 36
// 6b0: iload 36
// 6b2: bipush 1
// 6b3: iadd
// 6b4: putstatic su/catlean/u4.t I
// 6b7: iload 29
// 6b9: ifne 70f
// 6bc: iload 36
// 6be: sipush 7678
// 6c1: ldc2_w 4366421353274230956
// 6c4: lload 2
// 6c5: lxor
// 6c6: invokedynamic q (IJ)I bsm=su/catlean/u4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cb: if_icmple 6ec
// 6ce: goto 6db
// 6d1: ldc2_w 6357765300149623770
// 6d4: lload 2
// 6d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6da: athrow
// 6db: bipush 0
// 6dc: putstatic su/catlean/u4.t I
// 6df: goto 6ec
// 6e2: ldc2_w 6357765300149623770
// 6e5: lload 2
// 6e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6eb: athrow
// 6ec: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 6ef: iload 4
// 6f1: iload 5
// 6f3: i2s
// 6f4: aload 1
// 6f5: iload 6
// 6f7: i2c
// 6f8: getstatic su/catlean/u4.d D
// 6fb: invokevirtual su/catlean/dm.Y (ISLsu/catlean/api/event/events/player/MoveEvent;CD)V
// 6fe: lload 20
// 700: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 703: getfield net/minecraft/class_746.field_3913 Lnet/minecraft/class_744;
// 706: invokevirtual net/minecraft/class_744.method_3128 ()Lnet/minecraft/class_241;
// 709: getfield net/minecraft/class_241.field_1342 F
// 70c: putstatic su/catlean/u4.l F
// 70f: iload 29
// 711: ifeq 72b
// 714: aload 1
// 715: dconst_0
// 716: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 719: aload 1
// 71a: dconst_0
// 71b: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 71e: goto 72b
// 721: ldc2_w 6357765300149623770
// 724: lload 2
// 725: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72a: athrow
// 72b: aload 1
// 72c: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 72f: aload 0
// 730: lload 10
// 732: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 735: getstatic su/catlean/gq.OLD_MATRIX Lsu/catlean/gq;
// 738: if_acmpne 817
// 73b: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 73e: invokevirtual su/catlean/dm.o ()D
// 741: ldc2_w 0.5
// 744: dcmpl
// 745: iload 29
// 747: ifne 77c
// 74a: goto 757
// 74d: ldc2_w 6357765300149623770
// 750: lload 2
// 751: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 756: athrow
// 757: ifle 817
// 75a: goto 767
// 75d: ldc2_w 6357765300149623770
// 760: lload 2
// 761: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 766: athrow
// 767: lload 20
// 769: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 76c: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 76f: goto 77c
// 772: ldc2_w 6357765300149623770
// 775: lload 2
// 776: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77b: athrow
// 77c: iload 29
// 77e: ifne 7d3
// 781: ifne 817
// 784: goto 791
// 787: ldc2_w 6357765300149623770
// 78a: lload 2
// 78b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 790: athrow
// 791: lload 16
// 793: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 796: lload 20
// 798: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 79b: checkcast net/minecraft/class_1297
// 79e: lload 20
// 7a0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7a3: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
// 7a6: ldc2_w -0.299
// 7a9: dconst_0
// 7aa: ldc2_w -0.299
// 7ad: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
// 7b0: dconst_0
// 7b1: aload 1
// 7b2: invokevirtual su/catlean/api/event/events/player/MoveEvent.getY ()D
// 7b5: dconst_0
// 7b6: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 7b9: invokevirtual net/minecraft/class_638.method_20812 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/lang/Iterable;
// 7bc: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 7c1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 7c6: goto 7d3
// 7c9: ldc2_w 6357765300149623770
// 7cc: lload 2
// 7cd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d2: athrow
// 7d3: ifeq 817
// 7d6: aload 1
// 7d7: aload 1
// 7d8: invokevirtual su/catlean/api/event/events/player/MoveEvent.getX ()D
// 7db: bipush 2
// 7dc: i2d
// 7dd: dmul
// 7de: invokevirtual su/catlean/api/event/events/player/MoveEvent.setX (D)V
// 7e1: aload 1
// 7e2: aload 1
// 7e3: invokevirtual su/catlean/api/event/events/player/MoveEvent.getZ ()D
// 7e6: bipush 2
// 7e7: i2d
// 7e8: dmul
// 7e9: invokevirtual su/catlean/api/event/events/player/MoveEvent.setZ (D)V
// 7ec: lload 20
// 7ee: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7f1: lload 20
// 7f3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7f6: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 7f9: ldc2_w 2.0
// 7fc: dconst_1
// 7fd: ldc2_w 2.0
// 800: invokevirtual net/minecraft/class_243.method_18805 (DDD)Lnet/minecraft/class_243;
// 803: invokevirtual net/minecraft/class_746.method_18799 (Lnet/minecraft/class_243;)V
// 806: aload 1
// 807: invokevirtual su/catlean/api/event/events/player/MoveEvent.cancel ()V
// 80a: goto 817
// 80d: ldc2_w 6357765300149623770
// 810: lload 2
// 811: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 816: athrow
// 817: return
}

private static final boolean q() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u4.a J
// 03: ldc2_w 69378764500266
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 1947699350688
// 0d: lxor
// 0e: lstore 2
// 0f: pop2
// 10: ldc2_w 8081615105262238670
// 13: lload 0
// 14: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: istore 4
// 1b: getstatic su/catlean/u4.S Lsu/catlean/u4;
// 1e: lload 2
// 1f: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 22: getstatic su/catlean/gq.NCP Lsu/catlean/gq;
// 25: iload 4
// 27: ifeq 51
// 2a: if_acmpeq 80
// 2d: goto 3a
// 30: ldc2_w 8109875497785111405
// 33: lload 0
// 34: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: athrow
// 3a: getstatic su/catlean/u4.S Lsu/catlean/u4;
// 3d: lload 2
// 3e: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 41: getstatic su/catlean/gq.STRICT_STRAFE Lsu/catlean/gq;
// 44: goto 51
// 47: ldc2_w 8109875497785111405
// 4a: lload 0
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: iload 4
// 53: ifeq 7d
// 56: if_acmpeq 80
// 59: goto 66
// 5c: ldc2_w 8109875497785111405
// 5f: lload 0
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: getstatic su/catlean/u4.S Lsu/catlean/u4;
// 69: lload 2
// 6a: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 6d: getstatic su/catlean/gq.MATRIX Lsu/catlean/gq;
// 70: goto 7d
// 73: ldc2_w 8109875497785111405
// 76: lload 0
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: if_acmpne 8e
// 80: bipush 1
// 81: goto 8f
// 84: ldc2_w 8109875497785111405
// 87: lload 0
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: bipush 0
// 8f: ireturn
}

private static final boolean x() {
long var0 = a ^ 137817630456051L;
long var2 = var0 ^ 74237731232121L;

try {
if (S.Z(var2) == gq.FIREWORK) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -6533224915928815948L, var0);
}

return false;
}

private static final boolean g() {
long var0 = a ^ 20946796018133L;
long var2 = var0 ^ 50379784231007L;

try {
if (S.Z(var2) == gq.FIREWORK) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 7238195927023429522L, var0);
}

return false;
}

private static final boolean M() {
long var0 = a ^ 119766265900267L;
long var2 = var0 ^ 90373540892001L;

try {
if (S.Z(var2) == gq.GRIM_ENTITY) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -5670802444318084436L, var0);
}

return false;
}

private static final boolean j() {
long var0 = a ^ 124323432982671L;
long var2 = var0 ^ 87749226793221L;

try {
if (S.Z(var2) == gq.GRIM_ENTITY) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -780988848012020024L, var0);
}

return false;
}

private static final boolean F() {
long var0 = a ^ 56734167454153L;
long var2 = var0 ^ 14592295350339L;

try {
if (S.Z(var2) == gq.GRIM_ENTITY) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 5507651985955426190L, var0);
}

return false;
}

private static final boolean V() {
long var0 = a ^ 137381291901316L;
long var2 = var0 ^ 72767087779854L;

try {
if (S.Z(var2) == gq.GRIM_ENTITY) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, -2584411809026498621L, var0);
}

return false;
}

private static final boolean Q() {
long var0 = a ^ 56483007942887L;
long var2 = var0 ^ 14852046106989L;

try {
if (S.Z(var2) == gq.GRIM_ENTITY) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 5566761999395917472L, var0);
}

return false;
}

private static final boolean E() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u4.a J
// 03: ldc2_w 38203362238502
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 31207545143724
// 0d: lxor
// 0e: lstore 2
// 0f: dup2
// 10: ldc2_w 20288190057900
// 13: lxor
// 14: lstore 4
// 16: pop2
// 17: ldc2_w 9077156521436293636
// 1a: lload 0
// 1b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20: istore 6
// 22: getstatic su/catlean/u4.S Lsu/catlean/u4;
// 25: iload 6
// 27: ifne 51
// 2a: lload 2
// 2b: invokespecial su/catlean/u4.Z (J)Lsu/catlean/gq;
// 2e: getstatic su/catlean/gq.GRIM_ENTITY Lsu/catlean/gq;
// 31: if_acmpne 6a
// 34: goto 41
// 37: ldc2_w 9043242806908894817
// 3a: lload 0
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: getstatic su/catlean/u4.S Lsu/catlean/u4;
// 44: goto 51
// 47: ldc2_w 9043242806908894817
// 4a: lload 0
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: lload 4
// 53: invokespecial su/catlean/u4.R (J)Lsu/catlean/px;
// 56: getstatic su/catlean/px.PREDICT Lsu/catlean/px;
// 59: if_acmpne 6a
// 5c: bipush 1
// 5d: goto 6b
// 60: ldc2_w 9043242806908894817
// 63: lload 0
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: bipush 0
// 6b: ireturn
}

private static final boolean B() {
long var0 = a ^ 52296779155443L;
long var2 = var0 ^ 19021093185145L;

try {
if (S.Z(var2) == gq.GRIM_ENTITY) {
return true;
}
} catch (NoWhenBranchMatchedException var4) {
throw vm.a<"Å">(var4, 6509109136281377204L, var0);
}

return false;
}

static {
long var20 = a ^ 1284142124620L;
long var22 = var20 ^ 93268697160335L;
long var24 = var20 ^ 110880654300353L;
long var26 = var20 ^ 83012140898727L;
long var28 = var20 ^ 41394169065077L;
long var30 = var20 ^ 39949017619132L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[45];
int var16 = 0;
String var15 = "I°b\rfO»*\u007fLKH}2¤õû@\u009cÏO«þ\u009e8{ò<\u0090<Ïø\u0080ÎàÈä\n÷Ô\u001c0â$Cp\u0090\u001f\u00adS:º\u0082C\u0094þ(¹Õ%9\u0099Ôî\u001cy\u001ah½ü4Òúõ#aV1VáxÜ~0ý~¯\u001aQêF®j9¶°ß \u001e\\ñ)J\u008d\u000eãnµåÌnÇú^½=\u008bQ:¥ý\u0011×\u001eD$\"RÃ° >zÃc\u001fÒ\u0092U¬3n¾\u0005ØºÃ\u0089ã#Vò¸;SÝ ´Iu Úý\u0010¢cé»\u008a\u0001\u009få\u0001ýÕ5í-\u0083Z Ý\"\u000f@\u0096C{F\u008dÙÁá\u00adÓ\t\u008e\u0010\u001e\u0001\u0086ýz#\u007fä¶v>\u0096\u009a·\u0091\u0018³ÅM\tR{\u008ed\u009e={\u000eHçDÐÓ\u0081\u0006h/\u0088h½ Öx+U\u00adîÐ\u0091tÕ\u0082µc\u0083\u0007CùÌ'\u0013Ön¤\u0081;\u0003!\u000e£a ± ´GÄ\u0098$u?ØlÐ\u0087ñð¸\u001fÄw/ø\u0089ïæãg×\u0084:X\u000f\u009eØ°8*K\u0087\u008aôru¨¾\u0083\u0005h`\u0010Á¤Õþ\n\u008e[q\u0096öÒ\u008c·÷ÊÍÀ*\u009c\u0016h\u0085óX\u0003\u0000\u008cwîo·jð\u0003\u0089\\f*\u0094µèD(^,ø\u009b\u0098\u00adÕ\u001e$y]\u0083ô\u0013x,U\u0086pªÉì©\u0099\u0019\"Ê$Ö)«òÉµÏB\u008d±h¥0ãâúì§\b¿\"&^¨KÇy\u008b==QØö\u0002¥«ÕÜùf\u0011«\u0001¢:ÿÁ®¸#¹½h6¥.4ý\u008a\u0097Ë\u0010Âû\u000eC<@Ð\u008a·\u0081ìèÄÊÊÎ -\u009eU\u0013?ñM#ï{O\u0085P%e(WVk_'ñ+\u0082ØÌ(²\u0093.î¯\u0010\u0000¾aËTeP\u0011Ül\u000bð±\u009c\u009eÜ8\u0095ò¾\u0007P\u008fÂ\u0086\u0005\u008d@\b5L\u008f¤¦_èîK¹\b6Y«z\rq\u0086MaÌÒÕK±êgw#àH\u0005,e^r)<\u0088û((OÛ î\u0081À6\u0087\u007f!¬ùWÂÀ\u0007ÜêÅ\u0081N\u0014à±hÊ?\t\u001f\u0081âp_!\u009a\u0018TÕ¡W\u0013²*¥Ñ\u008f/}\u008e\u0096Âï³¼îÛó¿\u0095õ(\u0095Kg<Á\u0006k\u0085~Ñ\u009dd^Jý\u0097@¬È\u008a\u0087e:\u001e\u0014¼Ó\u0001kVÐ\t\u0095\u001feº\u000e\u0011q=\u0018;²\u00ad\u008bGÉ¿É¡tú{Â¯ËÇòù©KÎÈhÿ(.²\u0018¡\u0094w\u0089²a\u000b91bÓVòH\u0015}\u0007&ÔÅ@u\u009dA8avW-ùQ*¨³Q\u001f\u001f\u0018°\u0003\fÄ\u0000é¿_\u009f²Wï\u008d\u0094\u009d`0é»I+¨Ü\u008a ý+\u0081tíoÅøý\u0095òõ\u0098\u000eÀ¼\u0017¤¢\u0000qÈü®¡rõ\u0096ñ\u0007¯ð(\u0080v+¹¤Ýó:Ü¡ ¿¡\u0085TÕ\u0006.D\u009cdih°\tèÍÕ\u008b]5¾MÅ½\u0080\u0002ýM° Ø^ae§=>!\u008a\"\u001bj\u0095\u0080Å¬ \u0016J\t%÷½j0 ÚÜ\u0000V±\u0017 \t{\u0089°o=|\u00866\u009b6RcG\u009f¸Sgº\u0015Æ\u001dzb\u0092úS\u008e\u000bÉ\u001b>\u0018\u0010\u0015µTç\u00064dlö\u008aÿÃ÷\u0098\u0005Yä\u008fÀ\u0086Vzê Z\u0083yU\u0011üÀÌ\u0018^M\u0013\r«ûÝû½Y´`Óì.ú?\u0016l\u0007¾\u0091\u0080(5\u000b\b.4ÓÈ\u0080Âí}¾ú\u009aXz\u0091×\u0098«äc\u0095U\u001cµ;5\u0019¬»DórI:¼±Ó\u001f\u0018÷ÀÂ¾\u0017\u0014G\u0096sÖ9j\u008c-Î¼\u0095ðk!\u0002@åy\u0010)Óx\u0003m\u008f\u001cÿé¯\u0091`Í\u000f\u009fQ .8¶Ø³\u0086æ;1µ.\u0016Ø\u009c$0üf/Ü\u008a¼UÌVÀ\u009eß\u0012Ö\u0011é x×\rgß\u0087]®Õ66·1Õl°ÛÔ\u0097BÍ¸\u000bÔ\u000f\u009d\u0082>mm~\u001e(£«¾Ë¤ÕÈ1£ä\u0098Ì¤Ï?ù\u0089ôv1 §ôoA3az%cY9_:Óm\u009c\u009eJ·\u0018E\u009cÖ[\u001b¡}{\u0019rö\u008bö×R\u0084jù~w=\u008aà\u0005 !âß\u001d\u008dÜR;\u0098ø6b÷@Í \u0081\u0086!'1UØÅÕ\u001fí¯8þ\u009aG(ò£ëì\u0005ÔR\u008aÜ\u0001n¾4\u001eô-u6)\u0018G\u0098]âgK\u0080pp}ü¨\b½\u0013&\u000bDÇó \u008dJ[û§ôãP\\\u009ap_y:«ã½k5\u0084'\u0005\u0085ÿ8ã¾?¶\u0018oÌ\u0010\u009f\u001e®o[Äü²á\u0084ø\u0011\u0096p\u007fY\u0010-ïN-ì\u0080Î¬ \u0000m¸ùëÙp\u0018¾Þ[÷j¼B\u0014\u008cu\u009bvo:¤ª¶áÜF+$.Ý ;\u001bI[²®û¸n¹O6\u0006\u0010ù\u008e`\u0012\rè:Z3\u00174ì\u0098ãÅß\u0010/(d\u001b>\u0099<\u001e«\u000782´ø\u0097\u001e2¦\u000f\u0006ñÇ\u0003\u0017\u0080å\u008e\u008bC2Ó£´\u001cY\u009e\u0097aWÅ Z";
int var17 = "I°b\rfO»*\u007fLKH}2¤õû@\u009cÏO«þ\u009e8{ò<\u0090<Ïø\u0080ÎàÈä\n÷Ô\u001c0â$Cp\u0090\u001f\u00adS:º\u0082C\u0094þ(¹Õ%9\u0099Ôî\u001cy\u001ah½ü4Òúõ#aV1VáxÜ~0ý~¯\u001aQêF®j9¶°ß \u001e\\ñ)J\u008d\u000eãnµåÌnÇú^½=\u008bQ:¥ý\u0011×\u001eD$\"RÃ° >zÃc\u001fÒ\u0092U¬3n¾\u0005ØºÃ\u0089ã#Vò¸;SÝ ´Iu Úý\u0010¢cé»\u008a\u0001\u009få\u0001ýÕ5í-\u0083Z Ý\"\u000f@\u0096C{F\u008dÙÁá\u00adÓ\t\u008e\u0010\u001e\u0001\u0086ýz#\u007fä¶v>\u0096\u009a·\u0091\u0018³ÅM\tR{\u008ed\u009e={\u000eHçDÐÓ\u0081\u0006h/\u0088h½ Öx+U\u00adîÐ\u0091tÕ\u0082µc\u0083\u0007CùÌ'\u0013Ön¤\u0081;\u0003!\u000e£a ± ´GÄ\u0098$u?ØlÐ\u0087ñð¸\u001fÄw/ø\u0089ïæãg×\u0084:X\u000f\u009eØ°8*K\u0087\u008aôru¨¾\u0083\u0005h`\u0010Á¤Õþ\n\u008e[q\u0096öÒ\u008c·÷ÊÍÀ*\u009c\u0016h\u0085óX\u0003\u0000\u008cwîo·jð\u0003\u0089\\f*\u0094µèD(^,ø\u009b\u0098\u00adÕ\u001e$y]\u0083ô\u0013x,U\u0086pªÉì©\u0099\u0019\"Ê$Ö)«òÉµÏB\u008d±h¥0ãâúì§\b¿\"&^¨KÇy\u008b==QØö\u0002¥«ÕÜùf\u0011«\u0001¢:ÿÁ®¸#¹½h6¥.4ý\u008a\u0097Ë\u0010Âû\u000eC<@Ð\u008a·\u0081ìèÄÊÊÎ -\u009eU\u0013?ñM#ï{O\u0085P%e(WVk_'ñ+\u0082ØÌ(²\u0093.î¯\u0010\u0000¾aËTeP\u0011Ül\u000bð±\u009c\u009eÜ8\u0095ò¾\u0007P\u008fÂ\u0086\u0005\u008d@\b5L\u008f¤¦_èîK¹\b6Y«z\rq\u0086MaÌÒÕK±êgw#àH\u0005,e^r)<\u0088û((OÛ î\u0081À6\u0087\u007f!¬ùWÂÀ\u0007ÜêÅ\u0081N\u0014à±hÊ?\t\u001f\u0081âp_!\u009a\u0018TÕ¡W\u0013²*¥Ñ\u008f/}\u008e\u0096Âï³¼îÛó¿\u0095õ(\u0095Kg<Á\u0006k\u0085~Ñ\u009dd^Jý\u0097@¬È\u008a\u0087e:\u001e\u0014¼Ó\u0001kVÐ\t\u0095\u001feº\u000e\u0011q=\u0018;²\u00ad\u008bGÉ¿É¡tú{Â¯ËÇòù©KÎÈhÿ(.²\u0018¡\u0094w\u0089²a\u000b91bÓVòH\u0015}\u0007&ÔÅ@u\u009dA8avW-ùQ*¨³Q\u001f\u001f\u0018°\u0003\fÄ\u0000é¿_\u009f²Wï\u008d\u0094\u009d`0é»I+¨Ü\u008a ý+\u0081tíoÅøý\u0095òõ\u0098\u000eÀ¼\u0017¤¢\u0000qÈü®¡rõ\u0096ñ\u0007¯ð(\u0080v+¹¤Ýó:Ü¡ ¿¡\u0085TÕ\u0006.D\u009cdih°\tèÍÕ\u008b]5¾MÅ½\u0080\u0002ýM° Ø^ae§=>!\u008a\"\u001bj\u0095\u0080Å¬ \u0016J\t%÷½j0 ÚÜ\u0000V±\u0017 \t{\u0089°o=|\u00866\u009b6RcG\u009f¸Sgº\u0015Æ\u001dzb\u0092úS\u008e\u000bÉ\u001b>\u0018\u0010\u0015µTç\u00064dlö\u008aÿÃ÷\u0098\u0005Yä\u008fÀ\u0086Vzê Z\u0083yU\u0011üÀÌ\u0018^M\u0013\r«ûÝû½Y´`Óì.ú?\u0016l\u0007¾\u0091\u0080(5\u000b\b.4ÓÈ\u0080Âí}¾ú\u009aXz\u0091×\u0098«äc\u0095U\u001cµ;5\u0019¬»DórI:¼±Ó\u001f\u0018÷ÀÂ¾\u0017\u0014G\u0096sÖ9j\u008c-Î¼\u0095ðk!\u0002@åy\u0010)Óx\u0003m\u008f\u001cÿé¯\u0091`Í\u000f\u009fQ .8¶Ø³\u0086æ;1µ.\u0016Ø\u009c$0üf/Ü\u008a¼UÌVÀ\u009eß\u0012Ö\u0011é x×\rgß\u0087]®Õ66·1Õl°ÛÔ\u0097BÍ¸\u000bÔ\u000f\u009d\u0082>mm~\u001e(£«¾Ë¤ÕÈ1£ä\u0098Ì¤Ï?ù\u0089ôv1 §ôoA3az%cY9_:Óm\u009c\u009eJ·\u0018E\u009cÖ[\u001b¡}{\u0019rö\u008bö×R\u0084jù~w=\u008aà\u0005 !âß\u001d\u008dÜR;\u0098ø6b÷@Í \u0081\u0086!'1UØÅÕ\u001fí¯8þ\u009aG(ò£ëì\u0005ÔR\u008aÜ\u0001n¾4\u001eô-u6)\u0018G\u0098]âgK\u0080pp}ü¨\b½\u0013&\u000bDÇó \u008dJ[û§ôãP\\\u009ap_y:«ã½k5\u0084'\u0005\u0085ÿ8ã¾?¶\u0018oÌ\u0010\u009f\u001e®o[Äü²á\u0084ø\u0011\u0096p\u007fY\u0010-ïN-ì\u0080Î¬ \u0000m¸ùëÙp\u0018¾Þ[÷j¼B\u0014\u008cu\u009bvo:¤ª¶áÜF+$.Ý ;\u001bI[²®û¸n¹O6\u0006\u0010ù\u008e`\u0012\rè:Z3\u00174ì\u0098ãÅß\u0010/(d\u001b>\u0099<\u001e«\u000782´ø\u0097\u001e2¦\u000f\u0006ñÇ\u0003\u0017\u0080å\u008e\u008bC2Ó£´\u001cY\u009e\u0097aWÅ Z"
.length();
char var14 = '8';
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var47 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var47;
if ((var35 += var14) >= var17) {
b = var18;
e = new String[45];
m = new HashMap(13);
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
String var4 = "©ÿÅL\u0097»\t\u008dpn\u0011÷ú/´\u0017kïr\u0095%i\u001d?(½ò°R\u0080Åå\u001etAtâr\u008dØ\u000b\u0002õ×+1¼U\u0015{í<{,\u000eß\u00927¿ü(\u008dÿÝ_ý>ÓVB8ù¬\u0089{`g·tk\u0000gi\tBZ\u008a©\u0013Á(³ÿNyË/\u0004¶å¯\u0017\u0005fïtÐ\"\u001a°ñúÑH\u001f\u00940m\u009eùæ8ùî¤Â«\u001bç`ÕÖ\u00900m\u0005c\u0094¶QÚÝ\u001aÁû\u001dµÕ\u009dgËJ\u0099-B!.}ÇÍR\u001fáf\u008d\u009fÝÿ.\u0004Ð{Ñl1W©\u008cê\u0006q77\u0012";
int var5 = "©ÿÅL\u0097»\t\u008dpn\u0011÷ú/´\u0017kïr\u0095%i\u001d?(½ò°R\u0080Åå\u001etAtâr\u008dØ\u000b\u0002õ×+1¼U\u0015{í<{,\u000eß\u00927¿ü(\u008dÿÝ_ý>ÓVB8ù¬\u0089{`g·tk\u0000gi\tBZ\u008a©\u0013Á(³ÿNyË/\u0004¶å¯\u0017\u0005fïtÐ\"\u001a°ñúÑH\u001f\u00940m\u009eùæ8ùî¤Â«\u001bç`ÕÖ\u00900m\u0005c\u0094¶QÚÝ\u001aÁû\u001dµÕ\u009dgËJ\u0099-B!.}ÇÍR\u001fáf\u008d\u009fÝÿ.\u0004Ð{Ñl1W©\u008cê\u0006q77\u0012"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
var10001 = var3++;
long var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var54 = -1;

while (true) {
long var8 = var51;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var56 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var54) {
case 0:
var39[var10001] = var56;
if (var2 >= var5) {
g = var6;
k = new Integer[25];
KProperty[] var32 = new KProperty[c<"q">(11180, 974476836929500460L ^ var20)];
var32[0] = Reflection.property1(
new PropertyReference1Impl(u4.class, b<"o">(28817, 6714391763896591316L ^ var20), b<"o">(11982, 6893453344952728975L ^ var20), 0)
);
var32[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u4.class, b<"o">(26625, 8103541794265070429L ^ var20), b<"o">(11708, 6913345027143876305L ^ var20), 0)
);
var32[2] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u4.class, b<"o">(11059, 3580656914890438756L ^ var20), b<"o">(4595, 1437221589258535576L ^ var20), 0)
);
var32[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u4.class, b<"o">(5592, 5415832670889871037L ^ var20), b<"o">(5988, 5075765835116479532L ^ var20), 0)
);
var32[4] = Reflection.property1(
new PropertyReference1Impl(u4.class, b<"o">(16621, 2087139639929983876L ^ var20), b<"o">(28153, 1952809277098589868L ^ var20), 0)
);
var32[5] = Reflection.property1(
new PropertyReference1Impl(u4.class, b<"o">(24126, 805574227058183537L ^ var20), b<"o">(12287, 8193952994660826286L ^ var20), 0)
);
var32[c<"q">(31515, 6044878104849032578L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(u4.class, b<"o">(6013, 5416822953828451367L ^ var20), b<"o">(27816, 7962521828252680168L ^ var20), 0)
);
var32[c<"q">(27688, 2176774216083616447L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u4.class, b<"o">(20287, 1047709324897508443L ^ var20), b<"o">(8562, 3422554518193746449L ^ var20), 0)
);
var32[c<"q">(5333, 8993344168014727762L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u4.class, b<"o">(27013, 3946996322319137498L ^ var20), b<"o">(29196, 6413854199636287826L ^ var20), 0)
);
var32[c<"q">(350, 1052213855361654735L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u4.class, b<"o">(15494, 7550060293185253351L ^ var20), b<"o">(22273, 5287101485263209569L ^ var20), 0)
);
var32[c<"q">(14312, 1334924310781159806L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u4.class, b<"o">(21260, 7623770812602073176L ^ var20), b<"o">(10803, 2466828468911946109L ^ var20), 0)
);
var32[c<"q">(8545, 5745749849361186792L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u4.class, b<"o">(11233, 7017707096414664883L ^ var20), b<"o">(8547, 1956353519231578672L ^ var20), 0)
);
var32[c<"q">(30124, 7090054597221985056L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u4.class, b<"o">(29659, 3401601143416971449L ^ var20), b<"o">(17878, 8149885983037511296L ^ var20), 0)
);
u = var32;
S = new u4(var30);
A = yp.L(S, b<"o">(27587, 5723226205383030949L ^ var20), gq.NCP, null, null, c<"q">(30124, 7090054597221985056L ^ var20), null, var28);
V = yp.t(S, b<"o">(21318, 2496661863649427466L ^ var20), false, var24, null, u4::q, 4, null);
y = yp.t(S, b<"o">(21096, 4065126540638961973L ^ var20), false, var24, null, null, c<"q">(30124, 7090054597221985056L ^ var20), null);
j = yp.t(S, b<"o">(19506, 8583333931649261433L ^ var20), false, var24, null, null, c<"q">(30124, 7090054597221985056L ^ var20), null);
E = yp.L(
S,
b<"o">(15462, 2822041548086226702L ^ var20),
1,
new IntRange(1, c<"q">(350, 1052213855361654735L ^ var20)),
var26,
null,
u4::x,
c<"q">(5333, 8993344168014727762L ^ var20),
null
);
z = yp.L(
S,
b<"o">(159, 1182607511889253330L ^ var20),
c<"q">(5333, 8993344168014727762L ^ var20),
new IntRange(1, c<"q">(29871, 438490035342715452L ^ var20)),
var26,
null,
u4::g,
c<"q">(5333, 8993344168014727762L ^ var20),
null
);
T = yp.t(S, b<"o">(19799, 3567721495318650388L ^ var20), false, var24, null, u4::M, 4, null);
x = yp.k(
S, b<"o">(19882, 5377462468158709480L ^ var20), 1.0F, var22, RangesKt.rangeTo(0.1F, 2.0F), null, u4::j, c<"q">(5333, 8993344168014727762L ^ var20), null
);
c = yp.k(
S, b<"o">(27013, 3946996322319137498L ^ var20), 8.0F, var22, RangesKt.rangeTo(0.1F, 10.0F), null, u4::F, c<"q">(5333, 8993344168014727762L ^ var20), null
);
o = yp.k(
S, b<"o">(31462, 8068535020904802700L ^ var20), 8.0F, var22, RangesKt.rangeTo(0.1F, 10.0F), null, u4::V, c<"q">(5333, 8993344168014727762L ^ var20), null
);
O = yp.L(S, b<"o">(9109, 5126512086704795845L ^ var20), px.SERVER, null, u4::Q, 4, null, var28);
n = yp.k(
S, b<"o">(1918, 8436546116219999289L ^ var20), 3.0F, var22, RangesKt.rangeTo(0.0F, 10.0F), null, u4::E, c<"q">(5333, 8993344168014727762L ^ var20), null
);
G = yp.L(
S,
b<"o">(5317, 8850902075651065740L ^ var20),
5,
new IntRange(0, c<"q">(31958, 6238613720284963411L ^ var20)),
var26,
null,
u4::B,
c<"q">(5333, 8993344168014727762L ^ var20),
null
);
h = new bg();
return;
}
break;
default:
var39[var10001] = var56;
if (var2 < var5) {
continue label36;
}

var4 = "ÍY \u00149©\u0087)FÅ¡\u0092*/\u009dv";
var5 = "ÍY \u00149©\u0087)FÅ¡\u0092*/\u009dv".length();
var2 = 0;
}

byte var45 = var2;
var2 += 8;
var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
var39 = var6;
var10001 = var3++;
var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var54 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var47;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "ZT\u001cëP\u0004\u001f3\u0014¸ÆÒ3Q+\u0006n\u0015\u001eoðîõìþ¼(\u007fÏ\u0014\u0017î\u0018×ÁFÚAÃ0MØ|Ù\u001e\u0083o ±³W\u0099yÊùßÇ";
var17 = "ZT\u001cëP\u0004\u001f3\u0014¸ÆÒ3Q+\u0006n\u0015\u001eoðîõìþ¼(\u007fÏ\u0014\u0017î\u0018×ÁFÚAÃ0MØ|Ù\u001e\u0083o ±³W\u0099yÊùßÇ".length();
var14 = ' ';
var35 = -1;
}

var36 = var15.substring(++var35, var35 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16722;
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
throw new RuntimeException("su/catlean/u4", var10);
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
throw new RuntimeException("su/catlean/u4" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 3218;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/u4", var14);
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
throw new RuntimeException("su/catlean/u4" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
