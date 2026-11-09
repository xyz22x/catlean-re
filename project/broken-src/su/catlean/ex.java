package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2815;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.AfterReceivePacket;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.player.AttackBlockEvent;
import su.catlean.api.event.events.player.CollisionEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.world.UpdateBlockBreakingProgressEvent;
import su.catlean.gofra.Flow;

public final class ex extends _g {
@NotNull
public static final ex c;
static final KProperty[] G;
@NotNull
private static final cw A;
@NotNull
private static final cw U;
@NotNull
private static final cw X;
@NotNull
private static final cq D;
@NotNull
private static final cq E;
@NotNull
private static final cq w;
@NotNull
private static final cw F;
@NotNull
private static final cw y;
@NotNull
private static final cw x;
@NotNull
private static final cq b;
@NotNull
private static final cw t;
@NotNull
private static final ct h;
@NotNull
private static final ct L;
@NotNull
private static final cq l;
@NotNull
private static final cq V;
@NotNull
private static final cq n;
@NotNull
private static final cq B;
@NotNull
private static final cw a;
@NotNull
private static final cp T;
@NotNull
private static final cw z;
@NotNull
private static final cw Y;
@NotNull
private static final cs d;
@NotNull
private static final cs o;
@NotNull
private static final bg K;
@Nullable
private static class_2338 i;
@Nullable
private static class_2338 S;
@NotNull
private static AtomicBoolean I;
@NotNull
private static LinkedList J;
@NotNull
private static ConcurrentHashMap m;
private static String g;
private static final long e = yz.a(-4621689184939157071L, -4272911587249371302L, MethodHandles.lookup().lookupClass()).a(74883402458109L);
private static final String[] f;
private static final String[] j;
private static final Map k = new HashMap(13);
private static final long[] u;
private static final Integer[] C;
private static final Map N;
private static final long[] O;
private static final Long[] P;
private static final Map W;

private ex(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 9307432592351L;
super(b<"j">(15665, 7910527814131014151L ^ var1), jt.v(), null, 4, null, var3);
}

@NotNull
public final gx F9(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ e;
long var6 = var4 ^ 90341341320601L;
return (gx)A.E(this, var6, G[0]);
}

@NotNull
public final jp T(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 113073072759996L;
return (jp)U.E(this, var3, G[1]);
}

@NotNull
public final d0 D(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 98672927949114L;
return (d0)X.E(this, var3, G[2]);
}

private final boolean n(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 16238985635151L;
return (Boolean)D.E(this, var3, G[3]);
}

private final boolean F7(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 71857893803835L;
return (Boolean)E.E(this, var3, G[4]);
}

public final boolean x(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 18564777191874L;
return (Boolean)w.E(this, var3, G[5]);
}

private final oh Ft(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 108606317047343L;
return (oh)F.E(this, var3, G[c<"v">(26392, 6573087768254453146L ^ var1)]);
}

private final bu W(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 94279779324157L;
return (bu)y.E(this, var3, G[c<"v">(32474, 989390100841869998L ^ var1)]);
}

@NotNull
public final iw FC(int var1, char var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ e;
long var6 = var4 ^ 87359235383820L;
return (iw)x.E(this, var6, G[c<"v">(6369, 3399308789618812492L ^ var4)]);
}

private final boolean Fk(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 50208739727832L;
return (Boolean)b.E(this, var3, G[c<"v">(12660, 3112957040296162318L ^ var1)]);
}

private final zy K(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 127700020832557L;
return (zy)t.E(this, var3, G[c<"v">(14413, 7531098049394068965L ^ var1)]);
}

private final float A(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 70846539121985L;
return ((Number)h.E(this, var3, G[c<"v">(26063, 2973763153883954204L ^ var1)])).floatValue();
}

private final float t(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ e;
long var6 = var4 ^ 117682865537304L;
return ((Number)L.E(this, var6, G[c<"v">(13893, 8192079330471406531L ^ var4)])).floatValue();
}

private final boolean j(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 129850183699804L;
return (Boolean)l.E(this, var3, G[c<"v">(22326, 276640493716850378L ^ var1)]);
}

private final boolean I(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 94602487803468L;
return (Boolean)V.E(this, var3, G[c<"v">(6754, 6883512776123279533L ^ var1)]);
}

private final boolean F(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 101085503614428L;
return (Boolean)n.E(this, var3, G[c<"v">(16793, 1483296914587447519L ^ var1)]);
}

public final boolean Fl(int var1, int var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ e;
long var6 = var4 ^ 113119543127679L;
return (Boolean)B.E(this, var6, G[c<"v">(31799, 5021368919719071451L ^ var4)]);
}

private final cy i(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 99666347502746L;
return (cy)a.E(this, var3, G[c<"v">(29549, 5752163916002165608L ^ var1)]);
}

private final h V(int var1, short var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ e;
long var6 = var4 ^ 117765282656468L;
return (h)T.E(this, var6, G[c<"v">(30392, 6821754296517843663L ^ var4)]);
}

private final nc E(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 62417419254245L;
return (nc)z.E(this, var3, G[c<"v">(19022, 7926943565744353079L ^ var1)]);
}

private final xi FG(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 88268808110473L;
return (xi)Y.E(this, var3, G[c<"v">(3936, 8925598919667225164L ^ var1)]);
}

private final Color M(short var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ e;
long var6 = var4 ^ 86085275124354L;
return (Color)d.E(this, var6, G[c<"v">(3906, 7507925612013769048L ^ var4)]);
}

private final Color Fe(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ e;
long var6 = var4 ^ 80553128314518L;
return (Color)o.E(this, var6, G[c<"v">(21109, 6642622430427039864L ^ var4)]);
}

@NotNull
public final AtomicBoolean P() {
return I;
}

public final void m(@NotNull AtomicBoolean <set-?>, long a) {
ax = e ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"j">(25976, 2194655590669435L ^ ax));
I = <set-?>;
}

@NotNull
public final LinkedList Fn() {
return J;
}

public final void l(short a, @NotNull LinkedList <set-?>, int a, short a) {
long var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ e;
Intrinsics.checkNotNullParameter(<set-?>, b<"j">(10480, 8465061260398010349L ^ var5));
J = <set-?>;
}

@Override
public void b(long var1) {
long var3 = var1 ^ 37449534539012L;
this.P(var3, ii.TOGGLE);
}

@Override
public void O(long var1) {
long var3 = var1 ^ 6194460963406L;
this.P(var3, ii.TOGGLE);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void P(long var1, ii var3) {
var1 = e ^ var1;
long var4 = var1 ^ 92713472860373L;
Iterable var7 = J;
int var10000 = vm.a<"Å">(877916142505592704L, var1);
boolean var8 = false;
Iterator var9 = var7.iterator();
int var6 = var10000;

label38:
while (var9.hasNext()) {
Object var10 = var9.next();
sy var11 = (sy)var10;
boolean var12 = false;

try {
var11.a(var4, var3);
} catch (NoWhenBranchMatchedException var13) {
throw vm.a<"Å">(var13, 880219223970115584L, var1);
}

do {
try {
var10000 = var6;
if (var1 >= 0L) {
if (var6 == 0) {
return;
}

var10000 = var6;
}

if (var10000 != 0) {
continue label38;
}
} catch (NoWhenBranchMatchedException var14) {
throw vm.a<"Å">(var14, 880219223970115584L, var1);
}
} while (var1 < 0L);
break;
}

J.clear();
i = null;
I.set(false);
}

@Flow(
priority = -10
)
private final void T(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: ldc2_w 96020014091255
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 134712355714027
// 00d: lxor
// 00e: dup2
// 00f: bipush 32
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 32
// 018: lshl
// 019: bipush 32
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 105423509833419
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 84875953318761
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 111117069270083
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 76686167102058
// 038: lxor
// 039: dup2
// 03a: bipush 8
// 03c: lushr
// 03d: lstore 13
// 03f: dup2
// 040: bipush 56
// 042: lshl
// 043: bipush 56
// 045: lushr
// 046: l2i
// 047: istore 15
// 049: pop2
// 04a: dup2
// 04b: ldc2_w 113354846503652
// 04e: lxor
// 04f: lstore 16
// 051: dup2
// 052: ldc2_w 137013572699883
// 055: lxor
// 056: dup2
// 057: bipush 16
// 059: lushr
// 05a: lstore 18
// 05c: dup2
// 05d: bipush 48
// 05f: lshl
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 20
// 066: pop2
// 067: pop2
// 068: ldc2_w -3415506645727552713
// 06b: lload 2
// 06c: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: istore 21
// 073: lload 16
// 075: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 078: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 07b: getfield net/minecraft/class_1656.field_7477 Z
// 07e: iload 21
// 080: ifeq 0a6
// 083: ifne 0bb
// 086: goto 093
// 089: ldc2_w -3422603355758154569
// 08c: lload 2
// 08d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: athrow
// 093: getstatic su/catlean/ex.I Ljava/util/concurrent/atomic/AtomicBoolean;
// 096: invokevirtual java/util/concurrent/atomic/AtomicBoolean.get ()Z
// 099: goto 0a6
// 09c: ldc2_w -3422603355758154569
// 09f: lload 2
// 0a0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: athrow
// 0a6: iload 21
// 0a8: ifeq 0c4
// 0ab: ifeq 0bc
// 0ae: goto 0bb
// 0b1: ldc2_w -3422603355758154569
// 0b4: lload 2
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: return
// 0bc: lload 16
// 0be: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c1: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 0c4: ifeq 127
// 0c7: aload 0
// 0c8: lload 9
// 0ca: invokespecial su/catlean/ex.i (J)Lsu/catlean/cy;
// 0cd: getstatic su/catlean/cy.PAUSE Lsu/catlean/cy;
// 0d0: iload 21
// 0d2: ifeq 10e
// 0d5: goto 0e2
// 0d8: ldc2_w -3422603355758154569
// 0db: lload 2
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: if_acmpne 0f3
// 0e5: goto 0f2
// 0e8: ldc2_w -3422603355758154569
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: return
// 0f3: aload 0
// 0f4: iload 21
// 0f6: ifeq 128
// 0f9: lload 9
// 0fb: invokespecial su/catlean/ex.i (J)Lsu/catlean/cy;
// 0fe: getstatic su/catlean/cy.RESET Lsu/catlean/cy;
// 101: goto 10e
// 104: ldc2_w -3422603355758154569
// 107: lload 2
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: if_acmpne 127
// 111: aload 0
// 112: lload 7
// 114: getstatic su/catlean/ii.EATING Lsu/catlean/ii;
// 117: invokespecial su/catlean/ex.P (JLsu/catlean/ii;)V
// 11a: goto 127
// 11d: ldc2_w -3422603355758154569
// 120: lload 2
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: aload 0
// 128: lload 13
// 12a: iload 15
// 12c: i2b
// 12d: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 130: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 133: if_acmpne 1b8
// 136: iload 4
// 138: lload 5
// 13a: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 13d: dup
// 13e: sipush 6941
// 141: ldc2_w 5268480349812809384
// 144: lload 2
// 145: lxor
// 146: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 14e: checkcast su/catlean/mixins/accessors/InteractionManagerAccessor
// 151: iload 21
// 153: ifeq 1aa
// 156: goto 163
// 159: ldc2_w -3422603355758154569
// 15c: lload 2
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: invokeinterface su/catlean/mixins/accessors/InteractionManagerAccessor.getCurBlockDamageMP ()F 1
// 168: aload 0
// 169: lload 18
// 16b: iload 20
// 16d: i2c
// 16e: invokespecial su/catlean/ex.t (JC)F
// 171: fcmpg
// 172: ifge 1b8
// 175: goto 182
// 178: ldc2_w -3422603355758154569
// 17b: lload 2
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: iload 4
// 184: lload 5
// 186: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 189: dup
// 18a: sipush 28825
// 18d: ldc2_w 1766154922296718641
// 190: lload 2
// 191: lxor
// 192: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 19a: checkcast su/catlean/mixins/accessors/InteractionManagerAccessor
// 19d: goto 1aa
// 1a0: ldc2_w -3422603355758154569
// 1a3: lload 2
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: aload 0
// 1ab: lload 18
// 1ad: iload 20
// 1af: i2c
// 1b0: invokespecial su/catlean/ex.t (JC)F
// 1b3: invokeinterface su/catlean/mixins/accessors/InteractionManagerAccessor.setCurBlockDamageMP (F)V 2
// 1b8: getstatic su/catlean/ex.m Ljava/util/concurrent/ConcurrentHashMap;
// 1bb: checkcast java/util/Map
// 1be: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 1c3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 1c8: astore 22
// 1ca: aload 22
// 1cc: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1d1: ifeq 26d
// 1d4: aload 22
// 1d6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1db: checkcast java/util/Map$Entry
// 1de: astore 23
// 1e0: iload 21
// 1e2: ifeq 268
// 1e5: invokestatic su/catlean/zf.A ()J
// 1e8: aload 23
// 1ea: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 1ef: checkcast java/lang/Number
// 1f2: invokevirtual java/lang/Number.longValue ()J
// 1f5: lsub
// 1f6: sipush 29825
// 1f9: ldc2_w 2776162844612113972
// 1fc: lload 2
// 1fd: lxor
// 1fe: invokedynamic c (IJ)J bsm=su/catlean/ex.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: lcmp
// 204: iload 21
// 206: ifeq 27d
// 209: goto 216
// 20c: ldc2_w -3422603355758154569
// 20f: lload 2
// 210: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 215: athrow
// 216: ifgt 25a
// 219: goto 226
// 21c: ldc2_w -3422603355758154569
// 21f: lload 2
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: lload 11
// 228: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 22b: iload 21
// 22d: ifeq 267
// 230: goto 23d
// 233: ldc2_w -3422603355758154569
// 236: lload 2
// 237: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23c: athrow
// 23d: aload 23
// 23f: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 244: checkcast net/minecraft/class_2338
// 247: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 24a: ifeq 1ca
// 24d: goto 25a
// 250: ldc2_w -3422603355758154569
// 253: lload 2
// 254: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 259: athrow
// 25a: getstatic su/catlean/ex.m Ljava/util/concurrent/ConcurrentHashMap;
// 25d: aload 23
// 25f: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 264: invokevirtual java/util/concurrent/ConcurrentHashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
// 267: pop
// 268: iload 21
// 26a: ifne 1ca
// 26d: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 270: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/ex.Y (Lsu/catlean/sy;)Z, (Lsu/catlean/sy;)Ljava/lang/Boolean; ]
// 275: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/ex.g (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 27a: invokevirtual java/util/LinkedList.removeIf (Ljava/util/function/Predicate;)Z
// 27d: pop
// 27e: return
}

@Flow
private final void K(UpdateBlockBreakingProgressEvent var1) {
long var2 = e ^ 71946527345510L;
long var4 = (var2 ^ 91834426561275L) >>> 8;
int var6 = (int)((var2 ^ 91834426561275L) << 56 >>> 56);

try {
if (this.F9(var4, (byte)var6) == gx.PACKET) {
var1.cancel();
}
} catch (NoWhenBranchMatchedException var7) {
throw vm.a<"Å">(var7, -8065544122517558234L, var2);
}
}

@Flow
private final void q(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: ldc2_w 60167115166795
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 56324784524077
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
// 02b: ldc2_w 107125223431091
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 5375892071423
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 61792958913229
// 03c: lxor
// 03d: dup2
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: dup2
// 045: bipush 16
// 047: lshl
// 048: bipush 32
// 04a: lushr
// 04b: l2i
// 04c: istore 12
// 04e: dup2
// 04f: bipush 48
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 13
// 058: pop2
// 059: dup2
// 05a: ldc2_w 42054970300870
// 05d: lxor
// 05e: lstore 14
// 060: dup2
// 061: ldc2_w 70184745184333
// 064: lxor
// 065: dup2
// 066: bipush 48
// 068: lushr
// 069: l2i
// 06a: istore 16
// 06c: dup2
// 06d: bipush 16
// 06f: lshl
// 070: bipush 32
// 072: lushr
// 073: l2i
// 074: istore 17
// 076: dup2
// 077: bipush 48
// 079: lshl
// 07a: bipush 48
// 07c: lushr
// 07d: l2i
// 07e: istore 18
// 080: pop2
// 081: dup2
// 082: ldc2_w 7647760620888
// 085: lxor
// 086: lstore 19
// 088: dup2
// 089: ldc2_w 2570054107427
// 08c: lxor
// 08d: lstore 21
// 08f: dup2
// 090: ldc2_w 69523675438809
// 093: lxor
// 094: dup2
// 095: bipush 16
// 097: lushr
// 098: lstore 23
// 09a: dup2
// 09b: bipush 48
// 09d: lshl
// 09e: bipush 48
// 0a0: lushr
// 0a1: l2i
// 0a2: istore 25
// 0a4: pop2
// 0a5: dup2
// 0a6: ldc2_w 52527814072693
// 0a9: lxor
// 0aa: lstore 26
// 0ac: dup2
// 0ad: ldc2_w 49329316181205
// 0b0: lxor
// 0b1: lstore 28
// 0b3: dup2
// 0b4: ldc2_w 39935594581462
// 0b7: lxor
// 0b8: dup2
// 0b9: bipush 8
// 0bb: lushr
// 0bc: lstore 30
// 0be: dup2
// 0bf: bipush 56
// 0c1: lshl
// 0c2: bipush 56
// 0c4: lushr
// 0c5: l2i
// 0c6: istore 32
// 0c8: pop2
// 0c9: dup2
// 0ca: ldc2_w 86572338323882
// 0cd: lxor
// 0ce: lstore 33
// 0d0: dup2
// 0d1: ldc2_w 123254600715263
// 0d4: lxor
// 0d5: lstore 35
// 0d7: pop2
// 0d8: ldc2_w -3479770955824264014
// 0db: lload 2
// 0dc: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: istore 42
// 0e3: aload 0
// 0e4: lload 30
// 0e6: iload 32
// 0e8: i2b
// 0e9: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 0ec: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 0ef: if_acmpne 0fd
// 0f2: return
// 0f3: ldc2_w -3513905514034777333
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 100: checkcast java/lang/Iterable
// 103: astore 43
// 105: bipush 0
// 106: istore 44
// 108: aload 43
// 10a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 10f: astore 45
// 111: aload 45
// 113: invokeinterface java/util/Iterator.hasNext ()Z 1
// 118: ifeq 49d
// 11b: aload 45
// 11d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 122: astore 46
// 124: aload 46
// 126: checkcast su/catlean/sy
// 129: astore 47
// 12b: bipush 0
// 12c: istore 48
// 12e: iload 42
// 130: ifne 49e
// 133: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 136: lload 14
// 138: invokespecial su/catlean/ex.FG (J)Lsu/catlean/xi;
// 13b: getstatic su/catlean/xi.ALWAYS Lsu/catlean/xi;
// 13e: iload 42
// 140: ifne 178
// 143: goto 150
// 146: ldc2_w -3513905514034777333
// 149: lload 2
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: if_acmpeq 224
// 153: goto 160
// 156: ldc2_w -3513905514034777333
// 159: lload 2
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 163: lload 14
// 165: invokespecial su/catlean/ex.FG (J)Lsu/catlean/xi;
// 168: getstatic su/catlean/xi.REBREAK Lsu/catlean/xi;
// 16b: goto 178
// 16e: ldc2_w -3513905514034777333
// 171: lload 2
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: iload 42
// 17a: ifne 1e4
// 17d: if_acmpne 1ba
// 180: goto 18d
// 183: ldc2_w -3513905514034777333
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 190: iload 42
// 192: ifne 1ca
// 195: goto 1a2
// 198: ldc2_w -3513905514034777333
// 19b: lload 2
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: lload 26
// 1a4: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 1a7: getstatic su/catlean/d0.OFF Lsu/catlean/d0;
// 1aa: if_acmpne 224
// 1ad: goto 1ba
// 1b0: ldc2_w -3513905514034777333
// 1b3: lload 2
// 1b4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: athrow
// 1ba: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 1bd: goto 1ca
// 1c0: ldc2_w -3513905514034777333
// 1c3: lload 2
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: iload 42
// 1cc: ifne 1ea
// 1cf: lload 14
// 1d1: invokespecial su/catlean/ex.FG (J)Lsu/catlean/xi;
// 1d4: getstatic su/catlean/xi.AIR_REBREAK Lsu/catlean/xi;
// 1d7: goto 1e4
// 1da: ldc2_w -3513905514034777333
// 1dd: lload 2
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: if_acmpne 26c
// 1e7: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 1ea: lload 26
// 1ec: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 1ef: getstatic su/catlean/d0.OFF Lsu/catlean/d0;
// 1f2: if_acmpeq 26c
// 1f5: lload 9
// 1f7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1fa: aload 47
// 1fc: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 1ff: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 202: iload 42
// 204: ifne 279
// 207: goto 214
// 20a: ldc2_w -3513905514034777333
// 20d: lload 2
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: ifeq 26c
// 217: goto 224
// 21a: ldc2_w -3513905514034777333
// 21d: lload 2
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 227: new net/minecraft/class_238
// 22a: dup
// 22b: aload 47
// 22d: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 230: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 233: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 236: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 239: iload 11
// 23b: i2s
// 23c: iload 12
// 23e: iload 13
// 240: invokespecial su/catlean/ex.M (SII)Ljava/awt/Color;
// 243: iload 16
// 245: i2c
// 246: iload 17
// 248: fconst_1
// 249: iload 18
// 24b: i2s
// 24c: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 24f: aconst_null
// 250: bipush 4
// 251: aconst_null
// 252: astore 37
// 254: istore 38
// 256: astore 39
// 258: astore 40
// 25a: astore 41
// 25c: lload 35
// 25e: aload 41
// 260: aload 40
// 262: aload 39
// 264: iload 38
// 266: aload 37
// 268: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 26b: pop
// 26c: lload 9
// 26e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 271: aload 47
// 273: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 276: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 279: ifne 496
// 27c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 27f: aload 47
// 281: invokevirtual su/catlean/sy.G ()F
// 284: aload 47
// 286: invokevirtual su/catlean/sy.O ()F
// 289: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 28c: iload 4
// 28e: iload 5
// 290: i2c
// 291: iload 6
// 293: invokevirtual su/catlean/zi.n (ICI)F
// 296: invokevirtual su/catlean/jl.B (FFF)F
// 299: fconst_0
// 29a: fconst_1
// 29b: invokestatic java/lang/Math.clamp (FFF)F
// 29e: fstore 49
// 2a0: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 2a3: lload 28
// 2a5: invokespecial su/catlean/ex.i (J)Lsu/catlean/cy;
// 2a8: getstatic su/catlean/cy.PAUSE Lsu/catlean/cy;
// 2ab: if_acmpne 2df
// 2ae: lload 19
// 2b0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2b3: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 2b6: iload 42
// 2b8: ifne 2e6
// 2bb: goto 2c8
// 2be: ldc2_w -3513905514034777333
// 2c1: lload 2
// 2c2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c7: athrow
// 2c8: ifeq 2df
// 2cb: goto 2d8
// 2ce: ldc2_w -3513905514034777333
// 2d1: lload 2
// 2d2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: athrow
// 2d8: aload 47
// 2da: invokevirtual su/catlean/sy.O ()F
// 2dd: fstore 49
// 2df: aload 47
// 2e1: invokevirtual su/catlean/sy.O ()F
// 2e4: fconst_1
// 2e5: fcmpl
// 2e6: iload 42
// 2e8: ifne 30e
// 2eb: iflt 2fe
// 2ee: goto 2fb
// 2f1: ldc2_w -3513905514034777333
// 2f4: lload 2
// 2f5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fa: athrow
// 2fb: fconst_1
// 2fc: fstore 49
// 2fe: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 301: lload 33
// 303: invokespecial su/catlean/ex.E (J)Lsu/catlean/nc;
// 306: getstatic su/catlean/bw.i [I
// 309: swap
// 30a: invokevirtual su/catlean/nc.ordinal ()I
// 30d: iaload
// 30e: tableswitch 252 1 3 26 51 123
// 328: new net/minecraft/class_238
// 32b: dup
// 32c: aload 47
// 32e: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 331: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 334: goto 412
// 337: ldc2_w -3513905514034777333
// 33a: lload 2
// 33b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 340: athrow
// 341: new net/minecraft/class_238
// 344: dup
// 345: aload 47
// 347: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 34a: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 34d: i2d
// 34e: aload 47
// 350: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 353: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 356: i2d
// 357: aload 47
// 359: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 35c: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 35f: i2d
// 360: aload 47
// 362: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 365: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 368: bipush 1
// 369: iadd
// 36a: i2d
// 36b: aload 47
// 36d: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 370: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 373: i2f
// 374: fload 49
// 376: fadd
// 377: f2d
// 378: aload 47
// 37a: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 37d: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 380: bipush 1
// 381: iadd
// 382: i2d
// 383: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 386: goto 412
// 389: new net/minecraft/class_238
// 38c: dup
// 38d: aload 47
// 38f: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 392: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 395: i2d
// 396: aload 47
// 398: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 39b: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 39e: i2d
// 39f: aload 47
// 3a1: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 3a4: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 3a7: i2d
// 3a8: aload 47
// 3aa: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 3ad: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 3b0: i2d
// 3b1: aload 47
// 3b3: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 3b6: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 3b9: i2d
// 3ba: aload 47
// 3bc: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 3bf: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 3c2: i2d
// 3c3: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 3c6: fload 49
// 3c8: f2d
// 3c9: fload 49
// 3cb: f2d
// 3cc: fload 49
// 3ce: f2d
// 3cf: invokevirtual net/minecraft/class_238.method_1002 (DDD)Lnet/minecraft/class_238;
// 3d2: ldc2_w 0.5
// 3d5: fload 49
// 3d7: f2d
// 3d8: ldc2_w 0.5
// 3db: dmul
// 3dc: dadd
// 3dd: ldc2_w 0.5
// 3e0: fload 49
// 3e2: f2d
// 3e3: ldc2_w 0.5
// 3e6: dmul
// 3e7: dadd
// 3e8: ldc2_w 0.5
// 3eb: fload 49
// 3ed: f2d
// 3ee: ldc2_w 0.5
// 3f1: dmul
// 3f2: dadd
// 3f3: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
// 3f6: dup
// 3f7: sipush 3038
// 3fa: ldc2_w 6474886327980708318
// 3fd: lload 2
// 3fe: lxor
// 3ff: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 404: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 407: goto 412
// 40a: new kotlin/NoWhenBranchMatchedException
// 40d: dup
// 40e: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 411: athrow
// 412: astore 50
// 414: lload 7
// 416: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 419: aload 50
// 41b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 41e: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 421: iload 11
// 423: i2s
// 424: iload 12
// 426: iload 13
// 428: invokespecial su/catlean/ex.M (SII)Ljava/awt/Color;
// 42b: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 42e: lload 23
// 430: iload 25
// 432: i2c
// 433: invokespecial su/catlean/ex.Fe (JC)Ljava/awt/Color;
// 436: lload 21
// 438: dup2_x1
// 439: pop2
// 43a: fload 49
// 43c: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 43f: aconst_null
// 440: bipush 4
// 441: aconst_null
// 442: invokestatic su/catlean/zi.E (JLsu/catlean/zi;Lnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 445: pop
// 446: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 449: lload 35
// 44b: aload 50
// 44d: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 450: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 453: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 456: iload 11
// 458: i2s
// 459: iload 12
// 45b: iload 13
// 45d: invokespecial su/catlean/ex.M (SII)Ljava/awt/Color;
// 460: iload 16
// 462: i2c
// 463: iload 17
// 465: fconst_1
// 466: iload 18
// 468: i2s
// 469: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 46c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 46f: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 472: lload 23
// 474: iload 25
// 476: i2c
// 477: invokespecial su/catlean/ex.Fe (JC)Ljava/awt/Color;
// 47a: iload 16
// 47c: i2c
// 47d: iload 17
// 47f: fconst_1
// 480: iload 18
// 482: i2s
// 483: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 486: lload 21
// 488: dup2_x1
// 489: pop2
// 48a: fload 49
// 48c: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 48f: aconst_null
// 490: bipush 4
// 491: aconst_null
// 492: invokestatic su/catlean/zi.x (Lsu/catlean/zi;JLnet/minecraft/class_238;Ljava/awt/Color;Ljava/awt/Color;ILjava/lang/Object;)Z
// 495: pop
// 496: nop
// 497: nop
// 498: iload 42
// 49a: ifeq 111
// 49d: nop
// 49e: return
}

@Flow
private final void u(AttackBlockEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: ldc2_w 118384873773238
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 87947216945735
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 20742229836921
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 133320703869227
// 1b: lxor
// 1c: dup2
// 1d: bipush 8
// 1f: lushr
// 20: lstore 8
// 22: dup2
// 23: bipush 56
// 25: lshl
// 26: bipush 56
// 28: lushr
// 29: l2i
// 2a: istore 10
// 2c: pop2
// 2d: dup2
// 2e: ldc2_w 101050880217509
// 31: lxor
// 32: lstore 11
// 34: pop2
// 35: ldc2_w 236443187516817487
// 38: lload 2
// 39: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e: istore 13
// 40: aload 0
// 41: aload 1
// 42: invokevirtual su/catlean/api/event/events/player/AttackBlockEvent.getPos ()Lnet/minecraft/class_2338;
// 45: lload 4
// 47: dup2_x1
// 48: pop2
// 49: invokespecial su/catlean/ex.M (JLnet/minecraft/class_2338;)Z
// 4c: iload 13
// 4e: ifne 79
// 51: ifeq aa
// 54: goto 61
// 57: ldc2_w 270572899934699510
// 5a: lload 2
// 5b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: athrow
// 61: lload 11
// 63: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 66: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 69: getfield net/minecraft/class_1656.field_7477 Z
// 6c: goto 79
// 6f: ldc2_w 270572899934699510
// 72: lload 2
// 73: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 78: athrow
// 79: ifne aa
// 7c: aload 0
// 7d: iload 13
// 7f: ifne ba
// 82: goto 8f
// 85: ldc2_w 270572899934699510
// 88: lload 2
// 89: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e: athrow
// 8f: lload 8
// 91: iload 10
// 93: i2b
// 94: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 97: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 9a: if_acmpne b5
// 9d: goto aa
// a0: ldc2_w 270572899934699510
// a3: lload 2
// a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: athrow
// aa: return
// ab: ldc2_w 270572899934699510
// ae: lload 2
// af: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b4: athrow
// b5: aload 1
// b6: invokevirtual su/catlean/api/event/events/player/AttackBlockEvent.cancel ()V
// b9: aload 0
// ba: aload 1
// bb: invokevirtual su/catlean/api/event/events/player/AttackBlockEvent.getPos ()Lnet/minecraft/class_2338;
// be: aload 1
// bf: invokevirtual su/catlean/api/event/events/player/AttackBlockEvent.getDirection ()Lnet/minecraft/class_2350;
// c2: lload 6
// c4: invokevirtual su/catlean/ex.k (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;J)V
// c7: return
}

public final void k(@NotNull class_2338 pos, @NotNull class_2350 direction, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 88071467686978
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 35332981478653
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 138032438060081
// 019: lxor
// 01a: dup2
// 01b: bipush 8
// 01d: lushr
// 01e: lstore 9
// 020: dup2
// 021: bipush 56
// 023: lshl
// 024: bipush 56
// 026: lushr
// 027: l2i
// 028: istore 11
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 112856021983022
// 02f: lxor
// 030: dup2
// 031: bipush 8
// 033: lushr
// 034: lstore 12
// 036: dup2
// 037: bipush 56
// 039: lshl
// 03a: bipush 56
// 03c: lushr
// 03d: l2i
// 03e: istore 14
// 040: pop2
// 041: dup2
// 042: ldc2_w 38840242687011
// 045: lxor
// 046: dup2
// 047: bipush 32
// 049: lushr
// 04a: l2i
// 04b: istore 15
// 04d: dup2
// 04e: bipush 32
// 050: lshl
// 051: bipush 48
// 053: lushr
// 054: l2i
// 055: istore 16
// 057: dup2
// 058: bipush 48
// 05a: lshl
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 17
// 061: pop2
// 062: dup2
// 063: ldc2_w 74778869895072
// 066: lxor
// 067: lstore 18
// 069: dup2
// 06a: ldc2_w 40046784947061
// 06d: lxor
// 06e: lstore 20
// 070: pop2
// 071: aload 1
// 072: sipush 22772
// 075: ldc2_w 5041119431427952667
// 078: lload 3
// 079: lxor
// 07a: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 082: ldc2_w -2500311195644617142
// 085: lload 3
// 086: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: aload 2
// 08c: sipush 3342
// 08f: ldc2_w 907463603266930173
// 092: lload 3
// 093: lxor
// 094: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 09c: istore 22
// 09e: aload 0
// 09f: lload 5
// 0a1: aload 1
// 0a2: invokespecial su/catlean/ex.M (JLnet/minecraft/class_2338;)Z
// 0a5: iload 22
// 0a7: ifne 0d2
// 0aa: ifeq 109
// 0ad: goto 0ba
// 0b0: ldc2_w -2466746112046816781
// 0b3: lload 3
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: lload 18
// 0bc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0bf: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
// 0c2: getfield net/minecraft/class_1656.field_7477 Z
// 0c5: goto 0d2
// 0c8: ldc2_w -2466746112046816781
// 0cb: lload 3
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: ifne 109
// 0d5: aload 0
// 0d6: iload 22
// 0d8: lload 3
// 0d9: lconst_0
// 0da: lcmp
// 0db: ifle 117
// 0de: ifne 115
// 0e1: goto 0ee
// 0e4: ldc2_w -2466746112046816781
// 0e7: lload 3
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: lload 12
// 0f0: iload 14
// 0f2: i2b
// 0f3: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 0f6: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 0f9: if_acmpne 114
// 0fc: goto 109
// 0ff: ldc2_w -2466746112046816781
// 102: lload 3
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: return
// 10a: ldc2_w -2466746112046816781
// 10d: lload 3
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: aload 0
// 115: iload 15
// 117: iload 16
// 119: i2c
// 11a: aload 1
// 11b: iload 17
// 11d: i2s
// 11e: invokevirtual su/catlean/ex.Z (ICLnet/minecraft/class_2338;S)Z
// 121: iload 22
// 123: lload 3
// 124: lconst_0
// 125: lcmp
// 126: iflt 151
// 129: ifne 14f
// 12c: ifne 2f2
// 12f: goto 13c
// 132: ldc2_w -2466746112046816781
// 135: lload 3
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: aload 0
// 13d: lload 20
// 13f: invokevirtual su/catlean/ex.x (J)Z
// 142: goto 14f
// 145: ldc2_w -2466746112046816781
// 148: lload 3
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: iload 22
// 151: lload 3
// 152: lconst_0
// 153: lcmp
// 154: iflt 1c5
// 157: ifne 1c3
// 15a: ifne 1bd
// 15d: goto 16a
// 160: ldc2_w -2466746112046816781
// 163: lload 3
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 16d: checkcast java/util/Collection
// 170: invokeinterface java/util/Collection.isEmpty ()Z 1
// 175: iload 22
// 177: ifne 198
// 17a: goto 187
// 17d: ldc2_w -2466746112046816781
// 180: lload 3
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: ifne 19b
// 18a: goto 197
// 18d: ldc2_w -2466746112046816781
// 190: lload 3
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: bipush 1
// 198: goto 19c
// 19b: bipush 0
// 19c: ifeq 1bd
// 19f: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 1a2: invokevirtual java/util/LinkedList.removeFirst ()Ljava/lang/Object;
// 1a5: checkcast su/catlean/sy
// 1a8: lload 9
// 1aa: iload 11
// 1ac: i2b
// 1ad: invokevirtual su/catlean/sy.T (JB)V
// 1b0: goto 1bd
// 1b3: ldc2_w -2466746112046816781
// 1b6: lload 3
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: aload 0
// 1be: lload 20
// 1c0: invokevirtual su/catlean/ex.x (J)Z
// 1c3: iload 22
// 1c5: lload 3
// 1c6: lconst_0
// 1c7: lcmp
// 1c8: ifle 29c
// 1cb: ifne 29a
// 1ce: ifeq 290
// 1d1: goto 1de
// 1d4: ldc2_w -2466746112046816781
// 1d7: lload 3
// 1d8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: athrow
// 1de: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 1e1: invokevirtual java/util/LinkedList.size ()I
// 1e4: bipush 2
// 1e5: lload 3
// 1e6: lconst_0
// 1e7: lcmp
// 1e8: iflt 2b3
// 1eb: iload 22
// 1ed: ifne 2b3
// 1f0: goto 1fd
// 1f3: ldc2_w -2466746112046816781
// 1f6: lload 3
// 1f7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fc: athrow
// 1fd: if_icmplt 290
// 200: goto 20d
// 203: ldc2_w -2466746112046816781
// 206: lload 3
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 210: checkcast java/lang/Iterable
// 213: astore 23
// 215: bipush 0
// 216: istore 24
// 218: aload 23
// 21a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 21f: astore 25
// 221: aload 25
// 223: invokeinterface java/util/Iterator.hasNext ()Z 1
// 228: ifeq 25c
// 22b: aload 25
// 22d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 232: astore 26
// 234: aload 26
// 236: checkcast su/catlean/sy
// 239: astore 27
// 23b: bipush 0
// 23c: istore 28
// 23e: aload 27
// 240: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 243: getstatic su/catlean/ex.S Lnet/minecraft/class_2338;
// 246: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 249: ifeq 221
// 24c: aload 26
// 24e: lload 3
// 24f: lconst_0
// 250: lcmp
// 251: iflt 232
// 254: iload 22
// 256: ifne 236
// 259: goto 271
// 25c: new java/util/NoSuchElementException
// 25f: dup
// 260: sipush 9987
// 263: ldc2_w 6375582962955808714
// 266: lload 3
// 267: lxor
// 268: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26d: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
// 270: athrow
// 271: checkcast su/catlean/sy
// 274: astore 24
// 276: bipush 0
// 277: istore 25
// 279: aload 24
// 27b: lload 9
// 27d: iload 11
// 27f: i2b
// 280: invokevirtual su/catlean/sy.T (JB)V
// 283: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 286: pop
// 287: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 28a: aload 24
// 28c: invokevirtual java/util/LinkedList.remove (Ljava/lang/Object;)Z
// 28f: pop
// 290: aload 1
// 291: putstatic su/catlean/ex.S Lnet/minecraft/class_2338;
// 294: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 297: invokevirtual java/util/LinkedList.size ()I
// 29a: iload 22
// 29c: lload 3
// 29d: lconst_0
// 29e: lcmp
// 29f: iflt 2a6
// 2a2: ifne 2e6
// 2a5: bipush 2
// 2a6: goto 2b3
// 2a9: ldc2_w -2466746112046816781
// 2ac: lload 3
// 2ad: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b2: athrow
// 2b3: if_icmplt 2d5
// 2b6: new java/lang/Exception
// 2b9: dup
// 2ba: sipush 6339
// 2bd: ldc2_w 85971507112202264
// 2c0: lload 3
// 2c1: lxor
// 2c2: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c7: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
// 2ca: athrow
// 2cb: ldc2_w -2466746112046816781
// 2ce: lload 3
// 2cf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d4: athrow
// 2d5: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 2d8: new su/catlean/sy
// 2db: dup
// 2dc: aload 1
// 2dd: lload 7
// 2df: aload 2
// 2e0: invokespecial su/catlean/sy.<init> (Lnet/minecraft/class_2338;JLnet/minecraft/class_2350;)V
// 2e3: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
// 2e6: pop
// 2e7: lload 18
// 2e9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2ec: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 2ef: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 2f2: return
}

@Flow
private final void x(AfterReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: ldc2_w 126543074911191
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 79176668906638
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
// 02b: ldc2_w 48648063334322
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 117002177048297
// 035: lxor
// 036: lstore 9
// 038: dup2
// 039: ldc2_w 67153073719964
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 128847929295740
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 125950417086696
// 04a: lxor
// 04b: lstore 15
// 04d: pop2
// 04e: ldc2_w 8658481923005233966
// 051: lload 2
// 052: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: istore 17
// 059: aload 1
// 05a: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 05d: instanceof net/minecraft/class_2626
// 060: ifeq 1cf
// 063: aload 0
// 064: iload 17
// 066: ifne 09c
// 069: goto 076
// 06c: ldc2_w 8692048585298674839
// 06f: lload 2
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: lload 9
// 078: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 07b: getstatic su/catlean/d0.GRIM Lsu/catlean/d0;
// 07e: if_acmpne 1cf
// 081: goto 08e
// 084: ldc2_w 8692048585298674839
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 0
// 08f: goto 09c
// 092: ldc2_w 8692048585298674839
// 095: lload 2
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: lload 15
// 09e: invokespecial su/catlean/ex.F7 (J)Z
// 0a1: iload 17
// 0a3: ifne 0d6
// 0a6: ifeq 1cf
// 0a9: goto 0b6
// 0ac: ldc2_w 8692048585298674839
// 0af: lload 2
// 0b0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: athrow
// 0b6: aload 1
// 0b7: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 0ba: checkcast net/minecraft/class_2626
// 0bd: invokevirtual net/minecraft/class_2626.method_11308 ()Lnet/minecraft/class_2680;
// 0c0: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0c3: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 0c6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c9: goto 0d6
// 0cc: ldc2_w 8692048585298674839
// 0cf: lload 2
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: ifeq 1cf
// 0d9: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 0dc: invokevirtual java/util/LinkedList.iterator ()Ljava/util/Iterator;
// 0df: dup
// 0e0: sipush 7226
// 0e3: ldc2_w 6995246696384885182
// 0e6: lload 2
// 0e7: lxor
// 0e8: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f0: astore 18
// 0f2: aload 18
// 0f4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0f9: ifeq 1cf
// 0fc: aload 18
// 0fe: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 103: dup
// 104: sipush 21153
// 107: ldc2_w 554250356404961125
// 10a: lload 2
// 10b: lxor
// 10c: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 114: checkcast su/catlean/sy
// 117: astore 19
// 119: aload 19
// 11b: iload 4
// 11d: i2s
// 11e: iload 5
// 120: iload 6
// 122: invokevirtual su/catlean/sy.v (SII)Z
// 125: iload 17
// 127: ifne 14c
// 12a: ifeq 0f2
// 12d: goto 13a
// 130: ldc2_w 8692048585298674839
// 133: lload 2
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: aload 19
// 13c: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 13f: aload 1
// 140: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 143: checkcast net/minecraft/class_2626
// 146: invokevirtual net/minecraft/class_2626.method_11309 ()Lnet/minecraft/class_2338;
// 149: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 14c: iload 17
// 14e: ifne 184
// 151: ifeq 0f2
// 154: goto 161
// 157: ldc2_w 8692048585298674839
// 15a: lload 2
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: aload 0
// 162: aload 1
// 163: invokevirtual su/catlean/api/event/events/network/AfterReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 166: checkcast net/minecraft/class_2626
// 169: invokevirtual net/minecraft/class_2626.method_11309 ()Lnet/minecraft/class_2338;
// 16c: dup
// 16d: sipush 11190
// 170: ldc2_w 2154273432972084743
// 173: lload 2
// 174: lxor
// 175: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 17d: lload 7
// 17f: dup2_x1
// 180: pop2
// 181: invokespecial su/catlean/ex.K (JLnet/minecraft/class_2338;)Z
// 184: iload 17
// 186: ifne 1c9
// 189: ifeq 1c1
// 18c: goto 199
// 18f: ldc2_w 8692048585298674839
// 192: lload 2
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 0
// 19a: lload 11
// 19c: invokespecial su/catlean/ex.n (J)Z
// 19f: iload 17
// 1a1: ifne 1c9
// 1a4: goto 1b1
// 1a7: ldc2_w 8692048585298674839
// 1aa: lload 2
// 1ab: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b0: athrow
// 1b1: ifne 0f2
// 1b4: goto 1c1
// 1b7: ldc2_w 8692048585298674839
// 1ba: lload 2
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: aload 19
// 1c3: lload 13
// 1c5: bipush 1
// 1c6: invokevirtual su/catlean/sy.x (JZ)Z
// 1c9: pop
// 1ca: iload 17
// 1cc: ifeq 0f2
// 1cf: return
}

@Flow
private final void e(AfterSendPacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: ldc2_w 133424182482163
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 130749203544827
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
// 02b: ldc2_w 105723156781517
// 02e: lxor
// 02f: lstore 7
// 031: dup2
// 032: ldc2_w 104969836099208
// 035: lxor
// 036: dup2
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 9
// 03d: dup2
// 03e: bipush 32
// 040: lshl
// 041: bipush 48
// 043: lushr
// 044: l2i
// 045: istore 10
// 047: dup2
// 048: bipush 48
// 04a: lshl
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 11
// 051: pop2
// 052: dup2
// 053: ldc2_w 102027367278597
// 056: lxor
// 057: lstore 12
// 059: pop2
// 05a: ldc2_w 5736883062977381427
// 05d: lload 2
// 05e: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: istore 14
// 065: aload 1
// 066: invokevirtual su/catlean/api/event/events/network/AfterSendPacket.getPacket ()Lnet/minecraft/class_2596;
// 069: instanceof net/minecraft/class_2868
// 06c: iload 14
// 06e: ifeq 0aa
// 071: ifeq 115
// 074: goto 081
// 077: ldc2_w 5729799651791287219
// 07a: lload 2
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: aload 0
// 082: iload 14
// 084: ifeq 0ae
// 087: goto 094
// 08a: ldc2_w 5729799651791287219
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: iload 9
// 096: iload 10
// 098: iload 11
// 09a: invokevirtual su/catlean/ex.Fl (III)Z
// 09d: goto 0aa
// 0a0: ldc2_w 5729799651791287219
// 0a3: lload 2
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: ifeq 115
// 0ad: aload 0
// 0ae: iload 14
// 0b0: ifeq 0df
// 0b3: iload 4
// 0b5: iload 5
// 0b7: i2c
// 0b8: iload 6
// 0ba: i2c
// 0bb: invokevirtual su/catlean/ex.FC (ICC)Lsu/catlean/iw;
// 0be: getstatic su/catlean/iw.Silent Lsu/catlean/iw;
// 0c1: if_acmpeq 115
// 0c4: goto 0d1
// 0c7: ldc2_w 5729799651791287219
// 0ca: lload 2
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: aload 0
// 0d2: goto 0df
// 0d5: ldc2_w 5729799651791287219
// 0d8: lload 2
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: lload 7
// 0e1: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 0e4: getstatic su/catlean/d0.GRIM Lsu/catlean/d0;
// 0e7: if_acmpeq 115
// 0ea: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 0ed: lload 12
// 0ef: bipush 0
// 0f0: bipush 0
// 0f1: bipush 0
// 0f2: invokedynamic run ()Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/ex.Fd ()V, ()V ]
// 0f7: sipush 3443
// 0fa: ldc2_w 4321405466374296430
// 0fd: lload 2
// 0fe: lxor
// 0ff: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: aconst_null
// 105: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 108: goto 115
// 10b: ldc2_w 5729799651791287219
// 10e: lload 2
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: return
}

@Flow
private final void d(CollisionEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: ldc2_w 85318491508767
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 131571812063408
// 00d: lxor
// 00e: lstore 4
// 010: pop2
// 011: ldc2_w 856007052134729958
// 014: lload 2
// 015: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01a: istore 6
// 01c: aload 0
// 01d: lload 4
// 01f: invokevirtual su/catlean/ex.e (J)Z
// 022: ifeq 126
// 025: getstatic su/catlean/ex.m Ljava/util/concurrent/ConcurrentHashMap;
// 028: checkcast java/util/Map
// 02b: astore 8
// 02d: bipush 0
// 02e: istore 9
// 030: aload 8
// 032: astore 10
// 034: new java/util/LinkedHashMap
// 037: dup
// 038: invokespecial java/util/LinkedHashMap.<init> ()V
// 03b: checkcast java/util/Map
// 03e: astore 11
// 040: bipush 0
// 041: istore 12
// 043: aload 10
// 045: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 04a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 04f: astore 13
// 051: aload 13
// 053: invokeinterface java/util/Iterator.hasNext ()Z 1
// 058: ifeq 0be
// 05b: aload 13
// 05d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 062: checkcast java/util/Map$Entry
// 065: astore 14
// 067: aload 14
// 069: astore 15
// 06b: bipush 0
// 06c: istore 16
// 06e: iload 6
// 070: ifne 126
// 073: aload 1
// 074: invokevirtual su/catlean/api/event/events/player/CollisionEvent.getPos ()Lnet/minecraft/class_2338;
// 077: iload 6
// 079: ifne 0b8
// 07c: goto 089
// 07f: ldc2_w 822015427437426527
// 082: lload 2
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: aload 15
// 08b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 090: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 093: ifeq 051
// 096: goto 0a3
// 099: ldc2_w 822015427437426527
// 09c: lload 2
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: aload 11
// 0a5: aload 14
// 0a7: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 0ac: aload 14
// 0ae: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 0b3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 0b8: pop
// 0b9: iload 6
// 0bb: ifeq 051
// 0be: aload 11
// 0c0: nop
// 0c1: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 0c6: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 0cb: astore 7
// 0cd: aload 7
// 0cf: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0d4: ifeq 126
// 0d7: aload 7
// 0d9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0de: checkcast java/util/Map$Entry
// 0e1: astore 8
// 0e3: aload 1
// 0e4: iload 6
// 0e6: ifne 107
// 0e9: invokevirtual su/catlean/api/event/events/player/CollisionEvent.getPos ()Lnet/minecraft/class_2338;
// 0ec: aload 8
// 0ee: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 0f3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f6: ifeq 0cd
// 0f9: goto 106
// 0fc: ldc2_w 822015427437426527
// 0ff: lload 2
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: aload 1
// 107: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 10a: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 10d: dup
// 10e: sipush 8352
// 111: ldc2_w 2187505864088469246
// 114: lload 2
// 115: lxor
// 116: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 11e: invokevirtual su/catlean/api/event/events/player/CollisionEvent.setState (Lnet/minecraft/class_2680;)V
// 121: iload 6
// 123: ifeq 0cd
// 126: return
}

public final boolean e(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 48543280984843
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 110449946332830
// 011: lxor
// 012: lstore 5
// 014: pop2
// 015: ldc2_w -3909741783385292269
// 018: lload 1
// 019: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e: istore 7
// 020: aload 0
// 021: lload 5
// 023: invokevirtual su/catlean/ex.f (J)Z
// 026: iload 7
// 028: ifeq 04d
// 02b: ifeq 106
// 02e: goto 03b
// 031: ldc2_w -3916979125696023149
// 034: lload 1
// 035: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: athrow
// 03b: aload 0
// 03c: lload 3
// 03d: invokespecial su/catlean/ex.F (J)Z
// 040: goto 04d
// 043: ldc2_w -3916979125696023149
// 046: lload 1
// 047: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: athrow
// 04d: ifeq 106
// 050: getstatic su/catlean/ex.m Ljava/util/concurrent/ConcurrentHashMap;
// 053: checkcast java/util/Map
// 056: astore 8
// 058: bipush 0
// 059: istore 9
// 05b: aload 8
// 05d: iload 7
// 05f: ifeq 087
// 062: invokeinterface java/util/Map.isEmpty ()Z 1
// 067: ifeq 085
// 06a: goto 077
// 06d: ldc2_w -3916979125696023149
// 070: lload 1
// 071: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: athrow
// 077: bipush 0
// 078: goto 0ef
// 07b: ldc2_w -3916979125696023149
// 07e: lload 1
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: aload 8
// 087: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 08c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 091: astore 10
// 093: aload 10
// 095: invokeinterface java/util/Iterator.hasNext ()Z 1
// 09a: ifeq 0ee
// 09d: aload 10
// 09f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0a4: checkcast java/util/Map$Entry
// 0a7: astore 11
// 0a9: aload 11
// 0ab: astore 12
// 0ad: bipush 0
// 0ae: istore 13
// 0b0: invokestatic su/catlean/zf.A ()J
// 0b3: aload 12
// 0b5: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 0ba: checkcast java/lang/Number
// 0bd: invokevirtual java/lang/Number.longValue ()J
// 0c0: lsub
// 0c1: sipush 7085
// 0c4: ldc2_w 951887569138499645
// 0c7: lload 1
// 0c8: lxor
// 0c9: invokedynamic c (IJ)J bsm=su/catlean/ex.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: lcmp
// 0cf: iload 7
// 0d1: ifeq 0d8
// 0d4: ifge 0db
// 0d7: bipush 1
// 0d8: goto 0dc
// 0db: bipush 0
// 0dc: ifeq 093
// 0df: bipush 1
// 0e0: iload 7
// 0e2: lload 1
// 0e3: lconst_0
// 0e4: lcmp
// 0e5: ifle 0d1
// 0e8: ifeq 0cf
// 0eb: goto 0ef
// 0ee: bipush 0
// 0ef: lload 1
// 0f0: lconst_0
// 0f1: lcmp
// 0f2: iflt 0f9
// 0f5: ifeq 106
// 0f8: bipush 1
// 0f9: goto 107
// 0fc: ldc2_w -3916979125696023149
// 0ff: lload 1
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: bipush 0
// 107: ireturn
}

public final boolean Z(int a, char a, @NotNull class_2338 blockPos, short a) {
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
// 0e: iload 4
// 10: i2l
// 11: bipush 48
// 13: lshl
// 14: bipush 48
// 16: lushr
// 17: lor
// 18: getstatic su/catlean/ex.e J
// 1b: lxor
// 1c: lstore 5
// 1e: aload 3
// 1f: sipush 29425
// 22: ldc2_w 6974277640053812291
// 25: lload 5
// 27: lxor
// 28: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 30: ldc2_w -8425616574246565867
// 33: lload 5
// 35: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 3d: checkcast java/lang/Iterable
// 40: astore 8
// 42: istore 7
// 44: bipush 0
// 45: istore 9
// 47: aload 8
// 49: iload 7
// 4b: ifne a1
// 4e: instanceof java/util/Collection
// 51: ifeq 9f
// 54: goto 62
// 57: ldc2_w -8386981168702556244
// 5a: lload 5
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: aload 8
// 64: checkcast java/util/Collection
// 67: iload 7
// 69: ifne a1
// 6c: goto 7a
// 6f: ldc2_w -8386981168702556244
// 72: lload 5
// 74: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79: athrow
// 7a: invokeinterface java/util/Collection.isEmpty ()Z 1
// 7f: ifeq 9f
// 82: goto 90
// 85: ldc2_w -8386981168702556244
// 88: lload 5
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: bipush 0
// 91: goto e0
// 94: ldc2_w -8386981168702556244
// 97: lload 5
// 99: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e: athrow
// 9f: aload 8
// a1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// a6: astore 10
// a8: aload 10
// aa: invokeinterface java/util/Iterator.hasNext ()Z 1
// af: ifeq df
// b2: aload 10
// b4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// b9: astore 11
// bb: aload 11
// bd: checkcast su/catlean/sy
// c0: astore 12
// c2: bipush 0
// c3: istore 13
// c5: aload 12
// c7: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// ca: aload 3
// cb: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// ce: ifeq a8
// d1: bipush 1
// d2: iload 4
// d4: ifge ce
// d7: iload 7
// d9: ifne ce
// dc: goto e0
// df: bipush 0
// e0: ireturn
}

private final void Z(long var1) {
var1 = e ^ var1;
long var3 = var1 ^ 20033733509220L;
long var5 = var1 ^ 20249589740577L;
_r.a(var3, (class_2596)(new class_2815(zf.v(var5).field_7512.field_7763)));
}

private final float U(long param1, class_2680 param3, class_2338 param4, int param5, boolean param6) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 42019423118283
// 00b: lxor
// 00c: lstore 7
// 00e: dup2
// 00f: ldc2_w 99921603934191
// 012: lxor
// 013: lstore 9
// 015: dup2
// 016: ldc2_w 97821128132936
// 019: lxor
// 01a: lstore 11
// 01c: pop2
// 01d: ldc2_w -2619686766603822942
// 020: lload 1
// 021: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: istore 13
// 028: aload 3
// 029: iload 13
// 02b: ifne 054
// 02e: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 031: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 034: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 037: ifeq 053
// 03a: goto 047
// 03d: ldc2_w -2653667404978215141
// 040: lload 1
// 041: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: athrow
// 047: fconst_0
// 048: freturn
// 049: ldc2_w -2653667404978215141
// 04c: lload 1
// 04d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: athrow
// 053: aload 3
// 054: lload 9
// 056: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 059: checkcast net/minecraft/class_1922
// 05c: aload 4
// 05e: invokevirtual net/minecraft/class_2680.method_26214 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)F
// 061: fstore 14
// 063: fload 14
// 065: fconst_0
// 066: fcmpg
// 067: iload 13
// 069: lload 1
// 06a: lconst_0
// 06b: lcmp
// 06c: ifle 091
// 06f: ifne 090
// 072: ifge 08e
// 075: goto 082
// 078: ldc2_w -2653667404978215141
// 07b: lload 1
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: fconst_0
// 083: freturn
// 084: ldc2_w -2653667404978215141
// 087: lload 1
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: iload 5
// 090: bipush -1
// 091: if_icmpne 0a9
// 094: lload 11
// 096: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 099: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 09c: goto 0b6
// 09f: ldc2_w -2653667404978215141
// 0a2: lload 1
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: lload 11
// 0ab: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ae: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0b1: iload 5
// 0b3: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0b6: astore 16
// 0b8: aload 16
// 0ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0bd: aload 16
// 0bf: astore 15
// 0c1: aload 0
// 0c2: aload 3
// 0c3: lload 7
// 0c5: iload 5
// 0c7: iload 6
// 0c9: invokespecial su/catlean/ex.A (Lnet/minecraft/class_2680;JIZ)F
// 0cc: lload 1
// 0cd: lconst_0
// 0ce: lcmp
// 0cf: iflt 0da
// 0d2: fload 14
// 0d4: iload 13
// 0d6: ifne 113
// 0d9: fdiv
// 0da: aload 3
// 0db: invokevirtual net/minecraft/class_2680.method_29291 ()Z
// 0de: ifeq 104
// 0e1: goto 0ee
// 0e4: ldc2_w -2653667404978215141
// 0e7: lload 1
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: aload 15
// 0f0: aload 3
// 0f1: invokevirtual net/minecraft/class_1799.method_7951 (Lnet/minecraft/class_2680;)Z
// 0f4: ifeq 116
// 0f7: goto 104
// 0fa: ldc2_w -2653667404978215141
// 0fd: lload 1
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: ldc 30.0
// 106: goto 113
// 109: ldc2_w -2653667404978215141
// 10c: lload 1
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: goto 118
// 116: ldc 100.0
// 118: fdiv
// 119: freturn
}

private final boolean K(long param1, class_2338 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 1566742483540
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -3033391597350775072
// 12: lload 1
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: istore 6
// 1a: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 1d: iload 6
// 1f: ifne 47
// 22: lload 4
// 24: invokevirtual su/catlean/ux.f (J)Z
// 27: ifeq 89
// 2a: goto 37
// 2d: ldc2_w -3067376702273050279
// 30: lload 1
// 31: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36: athrow
// 37: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 3a: goto 47
// 3d: ldc2_w -3067376702273050279
// 40: lload 1
// 41: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46: athrow
// 47: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 4a: ifnull 89
// 4d: aload 3
// 4e: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 51: i2d
// 52: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 55: invokevirtual su/catlean/ux.j ()Lnet/minecraft/class_1657;
// 58: dup
// 59: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5c: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 5f: bipush 1
// 60: i2d
// 61: dadd
// 62: dcmpl
// 63: iload 6
// 65: ifne 86
// 68: goto 75
// 6b: ldc2_w -3067376702273050279
// 6e: lload 1
// 6f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74: athrow
// 75: ifle 89
// 78: goto 85
// 7b: ldc2_w -3067376702273050279
// 7e: lload 1
// 7f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: athrow
// 85: bipush 1
// 86: goto 8a
// 89: bipush 0
// 8a: ireturn
}

private final float a(class_2680 param1, long param2, int param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 109185770403868
// 0b: lxor
// 0c: lstore 5
// 0e: pop2
// 0f: ldc2_w -1517366204285670922
// 12: lload 2
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: fconst_1
// 19: fstore 8
// 1b: istore 7
// 1d: iload 4
// 1f: iload 7
// 21: ifne 52
// 24: bipush -1
// 25: if_icmpeq 6b
// 28: goto 35
// 2b: ldc2_w -1551353508770703793
// 2e: lload 2
// 2f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: athrow
// 35: lload 5
// 37: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 3d: iload 4
// 3f: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 42: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 45: goto 52
// 48: ldc2_w -1551353508770703793
// 4b: lload 2
// 4c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51: athrow
// 52: ifne 6b
// 55: fload 8
// 57: lload 5
// 59: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 5c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 5f: iload 4
// 61: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 64: aload 1
// 65: invokevirtual net/minecraft/class_1799.method_7924 (Lnet/minecraft/class_2680;)F
// 68: fmul
// 69: fstore 8
// 6b: fload 8
// 6d: freturn
}

private final float A(class_2680 param1, long param2, int param4, boolean param5) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 11703913865932
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 32493077975711
// 012: lxor
// 013: lstore 8
// 015: dup2
// 016: ldc2_w 73783979716777
// 019: lxor
// 01a: lstore 10
// 01c: dup2
// 01d: ldc2_w 127512047251711
// 020: lxor
// 021: lstore 12
// 023: dup2
// 024: ldc2_w 18458233791905
// 027: lxor
// 028: lstore 14
// 02a: pop2
// 02b: ldc2_w 2455072904226169109
// 02e: lload 2
// 02f: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 034: aload 0
// 035: aload 1
// 036: lload 8
// 038: iload 4
// 03a: invokespecial su/catlean/ex.a (Lnet/minecraft/class_2680;JI)F
// 03d: fstore 17
// 03f: istore 16
// 041: fload 17
// 043: fconst_1
// 044: fcmpl
// 045: iload 16
// 047: ifne 11d
// 04a: ifle 112
// 04d: goto 05a
// 050: ldc2_w 2493706122031161004
// 053: lload 2
// 054: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 059: athrow
// 05a: iload 4
// 05c: iload 16
// 05e: ifne 11d
// 061: goto 06e
// 064: ldc2_w 2493706122031161004
// 067: lload 2
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: bipush -1
// 06f: if_icmpeq 112
// 072: goto 07f
// 075: ldc2_w 2493706122031161004
// 078: lload 2
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: lload 12
// 081: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 084: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 087: iload 4
// 089: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 08c: dup
// 08d: sipush 31023
// 090: ldc2_w 5086344382651649733
// 093: lload 2
// 094: lxor
// 095: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 09d: astore 18
// 09f: lload 6
// 0a1: aload 18
// 0a3: getstatic net/minecraft/class_1893.field_9131 Lnet/minecraft/class_5321;
// 0a6: dup
// 0a7: sipush 12631
// 0aa: ldc2_w 5492816139978999465
// 0ad: lload 2
// 0ae: lxor
// 0af: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b7: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 0ba: istore 19
// 0bc: iload 19
// 0be: iload 16
// 0c0: ifne 11d
// 0c3: ifle 112
// 0c6: goto 0d3
// 0c9: ldc2_w 2493706122031161004
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: aload 18
// 0d5: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 0d8: iload 16
// 0da: lload 2
// 0db: lconst_0
// 0dc: lcmp
// 0dd: ifle 11f
// 0e0: ifne 11d
// 0e3: goto 0f0
// 0e6: ldc2_w 2493706122031161004
// 0e9: lload 2
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: ifne 112
// 0f3: goto 100
// 0f6: ldc2_w 2493706122031161004
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: fload 17
// 102: iload 19
// 104: i2d
// 105: ldc2_w 2.0
// 108: invokestatic java/lang/StrictMath.pow (DD)D
// 10b: bipush 1
// 10c: i2d
// 10d: dadd
// 10e: d2f
// 10f: fadd
// 110: fstore 17
// 112: lload 12
// 114: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 117: getstatic net/minecraft/class_1294.field_5917 Lnet/minecraft/class_6880;
// 11a: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 11d: iload 16
// 11f: lload 2
// 120: lconst_0
// 121: lcmp
// 122: iflt 165
// 125: ifne 163
// 128: ifeq 158
// 12b: goto 138
// 12e: ldc2_w 2493706122031161004
// 131: lload 2
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: fload 17
// 13a: bipush 1
// 13b: i2f
// 13c: lload 12
// 13e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 141: getstatic net/minecraft/class_1294.field_5917 Lnet/minecraft/class_6880;
// 144: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 147: dup
// 148: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 14b: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 14e: bipush 1
// 14f: iadd
// 150: i2f
// 151: ldc 0.2
// 153: fmul
// 154: fadd
// 155: fmul
// 156: fstore 17
// 158: lload 12
// 15a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 15d: getstatic net/minecraft/class_1294.field_5901 Lnet/minecraft/class_6880;
// 160: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 163: iload 16
// 165: lload 2
// 166: lconst_0
// 167: lcmp
// 168: iflt 1a9
// 16b: ifne 1a7
// 16e: ifeq 19f
// 171: goto 17e
// 174: ldc2_w 2493706122031161004
// 177: lload 2
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: fload 17
// 180: ldc 0.3
// 182: f2d
// 183: lload 12
// 185: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 188: getstatic net/minecraft/class_1294.field_5901 Lnet/minecraft/class_6880;
// 18b: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
// 18e: dup
// 18f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 192: invokevirtual net/minecraft/class_1293.method_5578 ()I
// 195: bipush 1
// 196: iadd
// 197: i2d
// 198: invokestatic java/lang/Math.pow (DD)D
// 19b: d2f
// 19c: fmul
// 19d: fstore 17
// 19f: lload 12
// 1a1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a4: invokevirtual net/minecraft/class_746.method_5869 ()Z
// 1a7: iload 16
// 1a9: lload 2
// 1aa: lconst_0
// 1ab: lcmp
// 1ac: ifle 1de
// 1af: ifne 1dc
// 1b2: ifeq 1da
// 1b5: goto 1c2
// 1b8: ldc2_w 2493706122031161004
// 1bb: lload 2
// 1bc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c1: athrow
// 1c2: fload 17
// 1c4: lload 12
// 1c6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1c9: getstatic net/minecraft/class_5134.field_51576 Lnet/minecraft/class_6880;
// 1cc: invokevirtual net/minecraft/class_746.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
// 1cf: dup
// 1d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1d3: invokevirtual net/minecraft/class_1324.method_6194 ()D
// 1d6: d2f
// 1d7: fmul
// 1d8: fstore 17
// 1da: iload 5
// 1dc: iload 16
// 1de: ifne 23e
// 1e1: ifne 228
// 1e4: goto 1f1
// 1e7: ldc2_w 2493706122031161004
// 1ea: lload 2
// 1eb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f0: athrow
// 1f1: getstatic su/catlean/ea.D Lsu/catlean/ea;
// 1f4: lload 14
// 1f6: invokevirtual su/catlean/ea.f (J)Z
// 1f9: lload 2
// 1fa: lconst_0
// 1fb: lcmp
// 1fc: iflt 23e
// 1ff: iload 16
// 201: ifne 23e
// 204: goto 211
// 207: ldc2_w 2493706122031161004
// 20a: lload 2
// 20b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: athrow
// 211: ifne 228
// 214: goto 221
// 217: ldc2_w 2493706122031161004
// 21a: lload 2
// 21b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: athrow
// 221: fload 17
// 223: ldc 5.0
// 225: fdiv
// 226: fstore 17
// 228: fload 17
// 22a: fconst_0
// 22b: iload 16
// 22d: ifne 257
// 230: fcmpg
// 231: goto 23e
// 234: ldc2_w 2493706122031161004
// 237: lload 2
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: ifge 24f
// 241: fconst_0
// 242: goto 258
// 245: ldc2_w 2493706122031161004
// 248: lload 2
// 249: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24e: athrow
// 24f: fload 17
// 251: aload 0
// 252: lload 10
// 254: invokespecial su/catlean/ex.A (J)F
// 257: fmul
// 258: freturn
}

private final int u(class_2338 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 24219514780400
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w 2230083450532304220
// 12: lload 2
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 0
// 19: lload 4
// 1b: aload 1
// 1c: bipush 1
// 1d: invokespecial su/catlean/ex.Y (JLnet/minecraft/class_2338;Z)I
// 20: istore 7
// 22: istore 6
// 24: iload 7
// 26: iload 6
// 28: ifeq 51
// 2b: bipush -1
// 2c: if_icmpeq 49
// 2f: goto 3c
// 32: ldc2_w 2227891731160982236
// 35: lload 2
// 36: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b: athrow
// 3c: iload 7
// 3e: ireturn
// 3f: ldc2_w 2227891731160982236
// 42: lload 2
// 43: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: athrow
// 49: aload 0
// 4a: lload 4
// 4c: aload 1
// 4d: bipush 0
// 4e: invokespecial su/catlean/ex.Y (JLnet/minecraft/class_2338;Z)I
// 51: ireturn
}

private final int Y(long param1, class_2338 param3, boolean param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 126042981727792
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 10892388127396
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 13190293482499
// 019: lxor
// 01a: lstore 9
// 01c: dup2
// 01d: ldc2_w 115234122627421
// 020: lxor
// 021: lstore 11
// 023: pop2
// 024: ldc2_w 4534654006933356009
// 027: lload 1
// 028: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: bipush -1
// 02e: istore 14
// 030: istore 13
// 032: iload 4
// 034: ifeq 046
// 037: ldc 3.4028235E38
// 039: goto 048
// 03c: ldc2_w 4496585322291020368
// 03f: lload 1
// 040: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: athrow
// 046: ldc 1.4E-45
// 048: fstore 15
// 04a: lload 7
// 04c: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 04f: aload 3
// 050: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 053: dup
// 054: sipush 742
// 057: ldc2_w 723758762000558570
// 05a: lload 1
// 05b: lxor
// 05c: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 064: astore 16
// 066: aload 16
// 068: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 06b: instanceof net/minecraft/class_2189
// 06e: iload 13
// 070: ifne 09c
// 073: ifeq 08f
// 076: goto 083
// 079: ldc2_w 4496585322291020368
// 07c: lload 1
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: bipush -1
// 084: ireturn
// 085: ldc2_w 4496585322291020368
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: sipush 29346
// 092: ldc2_w 2938992478093204806
// 095: lload 1
// 096: lxor
// 097: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: istore 17
// 09e: iload 17
// 0a0: sipush 4675
// 0a3: ldc2_w 2701567528899296653
// 0a6: lload 1
// 0a7: lxor
// 0a8: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: if_icmpge 304
// 0b0: iload 13
// 0b2: ifne 354
// 0b5: lload 9
// 0b7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ba: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0bd: iload 17
// 0bf: lload 1
// 0c0: lconst_0
// 0c1: lcmp
// 0c2: ifle 111
// 0c5: sipush 11387
// 0c8: ldc2_w 1368692970697720707
// 0cb: lload 1
// 0cc: lxor
// 0cd: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: iload 13
// 0d4: ifne 110
// 0d7: goto 0e4
// 0da: ldc2_w 4496585322291020368
// 0dd: lload 1
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: if_icmplt 114
// 0e7: goto 0f4
// 0ea: ldc2_w 4496585322291020368
// 0ed: lload 1
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: iload 17
// 0f6: sipush 8224
// 0f9: ldc2_w 3305775978029125612
// 0fc: lload 1
// 0fd: lxor
// 0fe: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: goto 110
// 106: ldc2_w 4496585322291020368
// 109: lload 1
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: isub
// 111: goto 116
// 114: iload 17
// 116: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 119: dup
// 11a: sipush 21151
// 11d: ldc2_w 3822751530600495615
// 120: lload 1
// 121: lxor
// 122: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12a: astore 18
// 12c: iload 13
// 12e: lload 1
// 12f: lconst_0
// 130: lcmp
// 131: iflt 301
// 134: ifne 2ff
// 137: aload 18
// 139: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
// 13c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 13f: ifne 2fc
// 142: goto 14f
// 145: ldc2_w 4496585322291020368
// 148: lload 1
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: aload 18
// 151: aload 16
// 153: invokevirtual net/minecraft/class_1799.method_7951 (Lnet/minecraft/class_2680;)Z
// 156: iload 13
// 158: ifne 1d8
// 15b: goto 168
// 15e: ldc2_w 4496585322291020368
// 161: lload 1
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: lload 1
// 169: lconst_0
// 16a: lcmp
// 16b: iflt 1cb
// 16e: ifne 1c0
// 171: goto 17e
// 174: ldc2_w 4496585322291020368
// 177: lload 1
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: iload 4
// 180: iload 13
// 182: lload 1
// 183: lconst_0
// 184: lcmp
// 185: iflt 1da
// 188: ifne 1d8
// 18b: goto 198
// 18e: ldc2_w 4496585322291020368
// 191: lload 1
// 192: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: athrow
// 198: lload 1
// 199: lconst_0
// 19a: lcmp
// 19b: ifle 1cb
// 19e: ifeq 1c0
// 1a1: goto 1ae
// 1a4: ldc2_w 4496585322291020368
// 1a7: lload 1
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: iload 13
// 1b0: ifeq 2fc
// 1b3: goto 1c0
// 1b6: ldc2_w 4496585322291020368
// 1b9: lload 1
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: aload 18
// 1c2: invokevirtual net/minecraft/class_1799.method_7936 ()I
// 1c5: aload 18
// 1c7: invokevirtual net/minecraft/class_1799.method_7919 ()I
// 1ca: isub
// 1cb: goto 1d8
// 1ce: ldc2_w 4496585322291020368
// 1d1: lload 1
// 1d2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: athrow
// 1d8: iload 13
// 1da: lload 1
// 1db: lconst_0
// 1dc: lcmp
// 1dd: ifle 1e4
// 1e0: ifne 25e
// 1e3: bipush 4
// 1e4: if_icmpgt 236
// 1e7: goto 1f4
// 1ea: ldc2_w 4496585322291020368
// 1ed: lload 1
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: getstatic su/catlean/qi.k Lsu/catlean/qi;
// 1f7: lload 11
// 1f9: invokevirtual su/catlean/qi.f (J)Z
// 1fc: iload 13
// 1fe: ifne 25e
// 201: goto 20e
// 204: ldc2_w 4496585322291020368
// 207: lload 1
// 208: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20d: athrow
// 20e: lload 1
// 20f: lconst_0
// 210: lcmp
// 211: iflt 251
// 214: ifeq 236
// 217: goto 224
// 21a: ldc2_w 4496585322291020368
// 21d: lload 1
// 21e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: athrow
// 224: iload 13
// 226: ifeq 2fc
// 229: goto 236
// 22c: ldc2_w 4496585322291020368
// 22f: lload 1
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: lload 5
// 238: aload 18
// 23a: getstatic net/minecraft/class_1893.field_9131 Lnet/minecraft/class_5321;
// 23d: dup
// 23e: sipush 27129
// 241: ldc2_w 37464567696769762
// 244: lload 1
// 245: lxor
// 246: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 24e: invokestatic su/catlean/lq.F (JLnet/minecraft/class_1799;Lnet/minecraft/class_5321;)I
// 251: goto 25e
// 254: ldc2_w 4496585322291020368
// 257: lload 1
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: i2f
// 25f: aload 18
// 261: lload 7
// 263: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 266: aload 3
// 267: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 26a: invokevirtual net/minecraft/class_1799.method_7924 (Lnet/minecraft/class_2680;)F
// 26d: fadd
// 26e: fstore 19
// 270: iload 4
// 272: iload 13
// 274: lload 1
// 275: lconst_0
// 276: lcmp
// 277: iflt 2e1
// 27a: ifne 2df
// 27d: ifne 2cd
// 280: goto 28d
// 283: ldc2_w 4496585322291020368
// 286: lload 1
// 287: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28c: athrow
// 28d: fload 19
// 28f: fload 15
// 291: fcmpl
// 292: lload 1
// 293: lconst_0
// 294: lcmp
// 295: iflt 2c4
// 298: iload 13
// 29a: ifne 2c0
// 29d: goto 2aa
// 2a0: ldc2_w 4496585322291020368
// 2a3: lload 1
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: ifle 2fc
// 2ad: goto 2ba
// 2b0: ldc2_w 4496585322291020368
// 2b3: lload 1
// 2b4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: athrow
// 2ba: fload 19
// 2bc: fstore 15
// 2be: iload 17
// 2c0: istore 14
// 2c2: iload 13
// 2c4: lload 1
// 2c5: lconst_0
// 2c6: lcmp
// 2c7: ifle 2d2
// 2ca: ifeq 2fc
// 2cd: fload 19
// 2cf: fload 15
// 2d1: fcmpg
// 2d2: goto 2df
// 2d5: ldc2_w 4496585322291020368
// 2d8: lload 1
// 2d9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2de: athrow
// 2df: iload 13
// 2e1: ifne 2fa
// 2e4: ifge 2fc
// 2e7: goto 2f4
// 2ea: ldc2_w 4496585322291020368
// 2ed: lload 1
// 2ee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f3: athrow
// 2f4: fload 19
// 2f6: fstore 15
// 2f8: iload 17
// 2fa: istore 14
// 2fc: iinc 17 1
// 2ff: iload 13
// 301: ifeq 09e
// 304: iload 14
// 306: lload 1
// 307: lconst_0
// 308: lcmp
// 309: iflt 0b2
// 30c: lload 1
// 30d: lconst_0
// 30e: lcmp
// 30f: ifle 351
// 312: sipush 8224
// 315: ldc2_w 3305775978029125612
// 318: lload 1
// 319: lxor
// 31a: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31f: iload 13
// 321: ifne 350
// 324: if_icmplt 354
// 327: goto 334
// 32a: ldc2_w 4496585322291020368
// 32d: lload 1
// 32e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 333: athrow
// 334: iload 14
// 336: sipush 8224
// 339: ldc2_w 3305775978029125612
// 33c: lload 1
// 33d: lxor
// 33e: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: goto 350
// 346: ldc2_w 4496585322291020368
// 349: lload 1
// 34a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34f: athrow
// 350: isub
// 351: goto 356
// 354: iload 14
// 356: ireturn
}

private final boolean M(long param1, class_2338 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 29911801329465
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 27639933290910
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 133374806713675
// 019: lxor
// 01a: lstore 8
// 01c: pop2
// 01d: ldc2_w 1977996229865789556
// 020: lload 1
// 021: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: lload 4
// 028: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 02b: aload 3
// 02c: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 02f: dup
// 030: sipush 17877
// 033: ldc2_w 5337005988438887178
// 036: lload 1
// 037: lxor
// 038: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 040: astore 11
// 042: istore 10
// 044: aload 11
// 046: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 049: invokevirtual net/minecraft/class_2248.method_36555 ()F
// 04c: ldc -1.0
// 04e: fcmpg
// 04f: iload 10
// 051: ifne 065
// 054: ifne 068
// 057: goto 064
// 05a: ldc2_w 2015930769565968333
// 05d: lload 1
// 05e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: athrow
// 064: bipush 1
// 065: goto 069
// 068: bipush 0
// 069: lload 1
// 06a: lconst_0
// 06b: lcmp
// 06c: iflt 08e
// 06f: ifne 10b
// 072: lload 6
// 074: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 077: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 07a: aload 3
// 07b: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 07e: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 081: lload 6
// 083: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 086: invokevirtual net/minecraft/class_746.method_55754 ()D
// 089: ldc 0.5
// 08b: f2d
// 08c: dadd
// 08d: dcmpg
// 08e: iload 10
// 090: ifne 108
// 093: goto 0a0
// 096: ldc2_w 2015930769565968333
// 099: lload 1
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: ifle 107
// 0a3: goto 0b0
// 0a6: ldc2_w 2015930769565968333
// 0a9: lload 1
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: aload 0
// 0b1: lload 8
// 0b3: invokevirtual su/catlean/ex.x (J)Z
// 0b6: iload 10
// 0b8: lload 1
// 0b9: lconst_0
// 0ba: lcmp
// 0bb: ifle 0f4
// 0be: ifne 0f2
// 0c1: goto 0ce
// 0c4: ldc2_w 2015930769565968333
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: ifeq 10b
// 0d1: goto 0de
// 0d4: ldc2_w 2015930769565968333
// 0d7: lload 1
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: aload 3
// 0df: getstatic su/catlean/ex.S Lnet/minecraft/class_2338;
// 0e2: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e5: goto 0f2
// 0e8: ldc2_w 2015930769565968333
// 0eb: lload 1
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: iload 10
// 0f4: ifne 108
// 0f7: ifne 10b
// 0fa: goto 107
// 0fd: ldc2_w 2015930769565968333
// 100: lload 1
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: bipush 1
// 108: goto 10c
// 10b: bipush 0
// 10c: ireturn
}

private final void Y(int param1, int param2, long param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ex.e J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 93493274676126
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 107962289725907
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 115182916288934
// 019: lxor
// 01a: lstore 9
// 01c: dup2
// 01d: ldc2_w 4913387337999
// 020: lxor
// 021: dup2
// 022: bipush 32
// 024: lushr
// 025: l2i
// 026: istore 11
// 028: dup2
// 029: bipush 32
// 02b: lshl
// 02c: bipush 48
// 02e: lushr
// 02f: l2i
// 030: istore 12
// 032: dup2
// 033: bipush 48
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 13
// 03c: pop2
// 03d: dup2
// 03e: ldc2_w 65458387066388
// 041: lxor
// 042: lstore 14
// 044: dup2
// 045: ldc2_w 40519013298249
// 048: lxor
// 049: lstore 16
// 04b: pop2
// 04c: ldc2_w 5506198502995707847
// 04f: lload 3
// 050: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: istore 18
// 057: aload 0
// 058: iload 11
// 05a: iload 12
// 05c: i2c
// 05d: iload 13
// 05f: i2c
// 060: invokevirtual su/catlean/ex.FC (ICC)Lsu/catlean/iw;
// 063: getstatic su/catlean/iw.Alternative Lsu/catlean/iw;
// 066: if_acmpeq 09f
// 069: iload 1
// 06a: sipush 29346
// 06d: ldc2_w 2938975210531139409
// 070: lload 3
// 071: lxor
// 072: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: iload 18
// 079: lload 3
// 07a: lconst_0
// 07b: lcmp
// 07c: ifle 0b0
// 07f: ifeq 0ae
// 082: goto 08f
// 085: ldc2_w 5507942963798159431
// 088: lload 3
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: if_icmplt 1d3
// 092: goto 09f
// 095: ldc2_w 5507942963798159431
// 098: lload 3
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: iload 2
// 0a0: bipush -1
// 0a1: goto 0ae
// 0a4: ldc2_w 5507942963798159431
// 0a7: lload 3
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: iload 18
// 0b0: lload 3
// 0b1: lconst_0
// 0b2: lcmp
// 0b3: iflt 16b
// 0b6: ifeq 169
// 0b9: if_icmpne 14e
// 0bc: goto 0c9
// 0bf: ldc2_w 5507942963798159431
// 0c2: lload 3
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: iload 1
// 0ca: lload 3
// 0cb: lconst_0
// 0cc: lcmp
// 0cd: iflt 11b
// 0d0: sipush 29346
// 0d3: ldc2_w 2938975210531139409
// 0d6: lload 3
// 0d7: lxor
// 0d8: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: iload 18
// 0df: ifeq 11a
// 0e2: goto 0ef
// 0e5: ldc2_w 5507942963798159431
// 0e8: lload 3
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: if_icmpge 11e
// 0f2: goto 0ff
// 0f5: ldc2_w 5507942963798159431
// 0f8: lload 3
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: iload 1
// 100: sipush 8224
// 103: ldc2_w 3305723262991564283
// 106: lload 3
// 107: lxor
// 108: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: goto 11a
// 110: ldc2_w 5507942963798159431
// 113: lload 3
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: iadd
// 11b: goto 11f
// 11e: iload 1
// 11f: lload 14
// 121: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 124: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 127: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 12a: lload 9
// 12c: dup2_x1
// 12d: pop2
// 12e: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 131: bipush 0
// 132: sipush 23128
// 135: ldc2_w 1909742288312403840
// 138: lload 3
// 139: lxor
// 13a: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: aconst_null
// 140: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 143: iload 18
// 145: lload 3
// 146: lconst_0
// 147: lcmp
// 148: ifle 1d0
// 14b: ifne 1c2
// 14e: iload 2
// 14f: sipush 29346
// 152: ldc2_w 2938975210531139409
// 155: lload 3
// 156: lxor
// 157: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: goto 169
// 15f: ldc2_w 5507942963798159431
// 162: lload 3
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: iload 18
// 16b: ifeq 199
// 16e: if_icmpge 19d
// 171: goto 17e
// 174: ldc2_w 5507942963798159431
// 177: lload 3
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: iload 2
// 17f: sipush 8224
// 182: ldc2_w 3305723262991564283
// 185: lload 3
// 186: lxor
// 187: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: goto 199
// 18f: ldc2_w 5507942963798159431
// 192: lload 3
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: iadd
// 19a: goto 19e
// 19d: iload 2
// 19e: lload 14
// 1a0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1a3: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1a6: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 1a9: lload 9
// 1ab: dup2_x1
// 1ac: pop2
// 1ad: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 1b0: bipush 0
// 1b1: sipush 6369
// 1b4: ldc2_w 3399316233294005567
// 1b7: lload 3
// 1b8: lxor
// 1b9: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: aconst_null
// 1bf: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 1c2: aload 0
// 1c3: lload 16
// 1c5: invokespecial su/catlean/ex.Z (J)V
// 1c8: lload 3
// 1c9: lconst_0
// 1ca: lcmp
// 1cb: iflt 240
// 1ce: iload 18
// 1d0: ifne 22f
// 1d3: lload 3
// 1d4: lconst_0
// 1d5: lcmp
// 1d6: iflt 222
// 1d9: aload 0
// 1da: iload 11
// 1dc: iload 12
// 1de: i2c
// 1df: iload 13
// 1e1: i2c
// 1e2: invokevirtual su/catlean/ex.FC (ICC)Lsu/catlean/iw;
// 1e5: getstatic su/catlean/iw.Silent Lsu/catlean/iw;
// 1e8: if_acmpne 219
// 1eb: goto 1f8
// 1ee: ldc2_w 5507942963798159431
// 1f1: lload 3
// 1f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: athrow
// 1f8: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1fb: iload 1
// 1fc: lload 7
// 1fe: invokevirtual su/catlean/gg.P (IJ)V
// 201: lload 3
// 202: lconst_0
// 203: lcmp
// 204: iflt 240
// 207: iload 18
// 209: ifne 22f
// 20c: goto 219
// 20f: ldc2_w 5507942963798159431
// 212: lload 3
// 213: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: athrow
// 219: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 21c: iload 1
// 21d: lload 5
// 21f: invokevirtual su/catlean/gg.f (IJ)V
// 222: goto 22f
// 225: ldc2_w 5507942963798159431
// 228: lload 3
// 229: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: athrow
// 22f: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 232: invokevirtual su/catlean/ux.I ()Ljava/util/concurrent/atomic/AtomicBoolean;
// 235: bipush 0
// 236: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 239: getstatic su/catlean/ex.I Ljava/util/concurrent/atomic/AtomicBoolean;
// 23c: bipush 0
// 23d: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 240: return
}

public final boolean l(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 19313092767686
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w 5867829860434893504
// 11: lload 1
// 12: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: istore 5
// 19: aload 0
// 1a: lload 3
// 1b: invokevirtual su/catlean/ex.x (J)Z
// 1e: iload 5
// 20: ifeq 79
// 23: ifeq 6e
// 26: goto 33
// 29: ldc2_w 5870282168356515136
// 2c: lload 1
// 2d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: athrow
// 33: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 36: invokevirtual java/util/LinkedList.size ()I
// 39: iload 5
// 3b: ifeq 6b
// 3e: goto 4b
// 41: ldc2_w 5870282168356515136
// 44: lload 1
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: bipush 1
// 4c: if_icmple 6a
// 4f: goto 5c
// 52: ldc2_w 5870282168356515136
// 55: lload 1
// 56: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b: athrow
// 5c: bipush 1
// 5d: goto ed
// 60: ldc2_w 5870282168356515136
// 63: lload 1
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: bipush 0
// 6b: goto ed
// 6e: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 71: checkcast java/util/Collection
// 74: invokeinterface java/util/Collection.isEmpty ()Z 1
// 79: iload 5
// 7b: ifeq 8f
// 7e: ifne 92
// 81: goto 8e
// 84: ldc2_w 5870282168356515136
// 87: lload 1
// 88: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d: athrow
// 8e: bipush 1
// 8f: goto 93
// 92: bipush 0
// 93: lload 1
// 94: lconst_0
// 95: lcmp
// 96: ifle ae
// 99: ifeq ec
// 9c: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 9f: checkcast java/util/List
// a2: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// a5: checkcast su/catlean/sy
// a8: invokevirtual su/catlean/sy.G ()F
// ab: ldc -1.0
// ad: fcmpg
// ae: iload 5
// b0: ifeq d1
// b3: goto c0
// b6: ldc2_w 5870282168356515136
// b9: lload 1
// ba: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bf: athrow
// c0: ifne d4
// c3: goto d0
// c6: ldc2_w 5870282168356515136
// c9: lload 1
// ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cf: athrow
// d0: bipush 1
// d1: goto d5
// d4: bipush 0
// d5: lload 1
// d6: lconst_0
// d7: lcmp
// d8: iflt df
// db: ifne ec
// de: bipush 1
// df: goto ed
// e2: ldc2_w 5870282168356515136
// e5: lload 1
// e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// eb: athrow
// ec: bipush 0
// ed: ireturn
}

@NotNull
public final List K(int a, boolean targetAfter, short a, char a) {
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
// 018: getstatic su/catlean/ex.e J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 129518990007062
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 12664527542336
// 02b: lxor
// 02c: lstore 9
// 02e: pop2
// 02f: ldc2_w -869842054865323965
// 032: lload 5
// 034: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039: istore 11
// 03b: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 03e: invokevirtual java/util/LinkedList.isEmpty ()Z
// 041: iload 11
// 043: ifeq 06c
// 046: ifeq 066
// 049: goto 057
// 04c: ldc2_w -867956752940036157
// 04f: lload 5
// 051: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: athrow
// 057: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 05a: areturn
// 05b: ldc2_w -867956752940036157
// 05e: lload 5
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 069: invokevirtual java/util/LinkedList.size ()I
// 06c: bipush 1
// 06d: iload 11
// 06f: ifeq 0ea
// 072: if_icmpne 0c2
// 075: goto 083
// 078: ldc2_w -867956752940036157
// 07b: lload 5
// 07d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: athrow
// 083: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 086: checkcast java/util/List
// 089: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 08c: checkcast su/catlean/sy
// 08f: astore 13
// 091: bipush 0
// 092: istore 14
// 094: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 097: aload 13
// 099: lload 7
// 09b: invokespecial su/catlean/ex.G (Lsu/catlean/sy;J)Z
// 09e: iload 3
// 09f: ifle 0bb
// 0a2: ifeq 0b9
// 0a5: aload 13
// 0a7: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 0aa: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
// 0ad: areturn
// 0ae: ldc2_w -867956752940036157
// 0b1: lload 5
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: iload 11
// 0bb: iload 3
// 0bc: ifle 0c8
// 0bf: ifne 1a1
// 0c2: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 0c5: invokevirtual java/util/LinkedList.size ()I
// 0c8: iload 11
// 0ca: ifeq 1b7
// 0cd: goto 0db
// 0d0: ldc2_w -867956752940036157
// 0d3: lload 5
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: bipush 2
// 0dc: goto 0ea
// 0df: ldc2_w -867956752940036157
// 0e2: lload 5
// 0e4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: athrow
// 0ea: if_icmpne 1a1
// 0ed: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 0f0: checkcast java/lang/Iterable
// 0f3: astore 13
// 0f5: bipush 0
// 0f6: istore 14
// 0f8: aload 13
// 0fa: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0ff: astore 15
// 101: aload 15
// 103: invokeinterface java/util/Iterator.hasNext ()Z 1
// 108: ifeq 13b
// 10b: aload 15
// 10d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 112: astore 16
// 114: aload 16
// 116: checkcast su/catlean/sy
// 119: astore 17
// 11b: bipush 0
// 11c: istore 18
// 11e: aload 17
// 120: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 123: getstatic su/catlean/ex.S Lnet/minecraft/class_2338;
// 126: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 129: ifeq 101
// 12c: aload 16
// 12e: iload 4
// 130: ifle 112
// 133: iload 11
// 135: ifeq 116
// 138: goto 151
// 13b: new java/util/NoSuchElementException
// 13e: dup
// 13f: sipush 16918
// 142: ldc2_w 606952685197403343
// 145: lload 5
// 147: lxor
// 148: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/ex.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
// 150: athrow
// 151: checkcast su/catlean/sy
// 154: astore 12
// 156: aload 0
// 157: aload 12
// 159: lload 7
// 15b: invokespecial su/catlean/ex.G (Lsu/catlean/sy;J)Z
// 15e: iload 4
// 160: iflt 1b7
// 163: iload 11
// 165: ifeq 1b7
// 168: ifeq 1a1
// 16b: goto 179
// 16e: ldc2_w -867956752940036157
// 171: lload 5
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: bipush 2
// 17a: anewarray 1395
// 17d: astore 13
// 17f: aload 13
// 181: bipush 0
// 182: getstatic su/catlean/ex.J Ljava/util/LinkedList;
// 185: checkcast java/util/List
// 188: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 18b: checkcast su/catlean/sy
// 18e: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 191: aastore
// 192: aload 13
// 194: bipush 1
// 195: aload 12
// 197: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 19a: aastore
// 19b: aload 13
// 19d: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 1a0: areturn
// 1a1: getstatic su/catlean/ex.K Lsu/catlean/bg;
// 1a4: sipush 28651
// 1a7: ldc2_w 4491813575798656391
// 1aa: lload 5
// 1ac: lxor
// 1ad: invokedynamic v (IJ)I bsm=su/catlean/ex.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: lload 9
// 1b4: invokevirtual su/catlean/bg.c (IJ)Z
// 1b7: ifne 1f6
// 1ba: getstatic su/catlean/ex.i Lnet/minecraft/class_2338;
// 1bd: ifnull 1f6
// 1c0: goto 1ce
// 1c3: ldc2_w -867956752940036157
// 1c6: lload 5
// 1c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: athrow
// 1ce: iload 2
// 1cf: ifeq 1f6
// 1d2: goto 1e0
// 1d5: ldc2_w -867956752940036157
// 1d8: lload 5
// 1da: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1df: athrow
// 1e0: getstatic su/catlean/ex.i Lnet/minecraft/class_2338;
// 1e3: dup
// 1e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1e7: invokestatic kotlin/collections/CollectionsKt.listOf (Ljava/lang/Object;)Ljava/util/List;
// 1ea: areturn
// 1eb: ldc2_w -867956752940036157
// 1ee: lload 5
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: invokestatic kotlin/collections/CollectionsKt.emptyList ()Ljava/util/List;
// 1f9: areturn
}

public static List q(ex var0, boolean var1, int var2, Object var3, long var4) {
var4 = e ^ var4;
long var10001 = var4 ^ 100577655168380L;
int var6 = (int)((var4 ^ 100577655168380L) >>> 32);
int var7 = (int)((var4 ^ 100577655168380L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
int var9 = vm.a<"Å">(8425642282911334211L, var4);

int var10000;
label20: {
try {
var10000 = var2 & 1;
if (var9 == 0) {
break label20;
}

if (var10000 == 0) {
return var0.K(var6, (boolean)var1, (short)var7, (char)var8);
}
} catch (NoWhenBranchMatchedException var10) {
throw vm.a<"Å">(var10, 8427417629914106051L, var4);
}

var10000 = 1;
}

var1 = var10000;
return var0.K(var6, (boolean)var1, (short)var7, (char)var8);
}

private final boolean G(sy param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 496863616605
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -1002233089921011440
// 12: lload 2
// 13: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: istore 6
// 1a: aload 1
// 1b: invokevirtual su/catlean/sy.O ()F
// 1e: fconst_1
// 1f: fcmpg
// 20: iload 6
// 22: ifne 55
// 25: ifge a2
// 28: goto 35
// 2b: ldc2_w -964301257958650199
// 2e: lload 2
// 2f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: athrow
// 35: aload 1
// 36: invokevirtual su/catlean/sy.O ()F
// 39: aload 1
// 3a: invokevirtual su/catlean/sy.O ()F
// 3d: aload 1
// 3e: invokevirtual su/catlean/sy.G ()F
// 41: fsub
// 42: ldc 2.5
// 44: fmul
// 45: fadd
// 46: fconst_1
// 47: fcmpl
// 48: goto 55
// 4b: ldc2_w -964301257958650199
// 4e: lload 2
// 4f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54: athrow
// 55: iload 6
// 57: lload 2
// 58: lconst_0
// 59: lcmp
// 5a: iflt 8b
// 5d: ifne 89
// 60: iflt a2
// 63: goto 70
// 66: ldc2_w -964301257958650199
// 69: lload 2
// 6a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f: athrow
// 70: lload 4
// 72: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 75: aload 1
// 76: invokevirtual su/catlean/sy.b ()Lnet/minecraft/class_2338;
// 79: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 7c: goto 89
// 7f: ldc2_w -964301257958650199
// 82: lload 2
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: iload 6
// 8b: ifne 9f
// 8e: ifne a2
// 91: goto 9e
// 94: ldc2_w -964301257958650199
// 97: lload 2
// 98: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d: athrow
// 9e: bipush 1
// 9f: goto a3
// a2: bipush 0
// a3: ireturn
}

private static final boolean Y() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: ldc2_w 61878669426517
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 46925830629064
// 0d: lxor
// 0e: dup2
// 0f: bipush 8
// 11: lushr
// 12: lstore 2
// 13: dup2
// 14: bipush 56
// 16: lshl
// 17: bipush 56
// 19: lushr
// 1a: l2i
// 1b: istore 4
// 1d: pop2
// 1e: dup2
// 1f: ldc2_w 16075608243725
// 22: lxor
// 23: lstore 5
// 25: pop2
// 26: ldc2_w 2610893569889972117
// 29: lload 0
// 2a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: istore 7
// 31: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 34: iload 7
// 36: ifeq 63
// 39: lload 2
// 3a: iload 4
// 3c: i2b
// 3d: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 40: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 43: if_acmpeq 81
// 46: goto 53
// 49: ldc2_w 2603669315419985941
// 4c: lload 0
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 56: goto 63
// 59: ldc2_w 2603669315419985941
// 5c: lload 0
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: lload 5
// 65: invokespecial su/catlean/ex.j (J)Z
// 68: iload 7
// 6a: ifeq 7e
// 6d: ifeq 81
// 70: goto 7d
// 73: ldc2_w 2603669315419985941
// 76: lload 0
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: bipush 1
// 7e: goto 82
// 81: bipush 0
// 82: ireturn
}

private static final boolean R() {
long var0 = e ^ 27426181815160L;
long var2 = (var0 ^ 11111662879461L) >>> 8;
int var4 = (int)((var0 ^ 11111662879461L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 4283441583389752L, var0);
}

return false;
}

private static final boolean L() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: ldc2_w 22220615764166
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 14615939171832
// 0d: lxor
// 0e: lstore 2
// 0f: dup2
// 10: ldc2_w 7555493646683
// 13: lxor
// 14: dup2
// 15: bipush 8
// 17: lushr
// 18: lstore 4
// 1a: dup2
// 1b: bipush 56
// 1d: lshl
// 1e: bipush 56
// 20: lushr
// 21: l2i
// 22: istore 6
// 24: pop2
// 25: pop2
// 26: ldc2_w -3226692460538130369
// 29: lload 0
// 2a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: istore 7
// 31: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 34: iload 7
// 36: ifne 64
// 39: lload 4
// 3b: iload 6
// 3d: i2b
// 3e: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 41: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 44: if_acmpeq 7c
// 47: goto 54
// 4a: ldc2_w -3192705787734151290
// 4d: lload 0
// 4e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: athrow
// 54: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 57: goto 64
// 5a: ldc2_w -3192705787734151290
// 5d: lload 0
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: lload 2
// 65: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 68: getstatic su/catlean/d0.GRIM Lsu/catlean/d0;
// 6b: if_acmpne 7c
// 6e: bipush 1
// 6f: goto 7d
// 72: ldc2_w -3192705787734151290
// 75: lload 0
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: bipush 0
// 7d: ireturn
}

private static final boolean r() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: ldc2_w 129878489884267
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 122462863158101
// 0d: lxor
// 0e: lstore 2
// 0f: dup2
// 10: ldc2_w 111004305063926
// 13: lxor
// 14: dup2
// 15: bipush 8
// 17: lushr
// 18: lstore 4
// 1a: dup2
// 1b: bipush 56
// 1d: lshl
// 1e: bipush 56
// 20: lushr
// 21: l2i
// 22: istore 6
// 24: pop2
// 25: pop2
// 26: ldc2_w -214607599076084053
// 29: lload 0
// 2a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: istore 7
// 31: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 34: iload 7
// 36: ifeq 64
// 39: lload 4
// 3b: iload 6
// 3d: i2b
// 3e: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 41: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 44: if_acmpeq 7c
// 47: goto 54
// 4a: ldc2_w -208193444174266069
// 4d: lload 0
// 4e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: athrow
// 54: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 57: goto 64
// 5a: ldc2_w -208193444174266069
// 5d: lload 0
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: lload 2
// 65: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 68: getstatic su/catlean/d0.GRIM Lsu/catlean/d0;
// 6b: if_acmpne 7c
// 6e: bipush 1
// 6f: goto 7d
// 72: ldc2_w -208193444174266069
// 75: lload 0
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: bipush 0
// 7d: ireturn
}

private static final boolean z() {
long var0 = e ^ 111618749371964L;
long var2 = (var0 ^ 131317660585889L) >>> 8;
int var4 = (int)((var0 ^ 131317660585889L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 957941472261665148L, var0);
}

return false;
}

private static final boolean h() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: ldc2_w 48631195289553
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 69064424021580
// 0d: lxor
// 0e: dup2
// 0f: bipush 8
// 11: lushr
// 12: lstore 2
// 13: dup2
// 14: bipush 56
// 16: lshl
// 17: bipush 56
// 19: lushr
// 1a: l2i
// 1b: istore 4
// 1d: pop2
// 1e: dup2
// 1f: ldc2_w 136442941022743
// 22: lxor
// 23: lstore 5
// 25: pop2
// 26: ldc2_w -2540076764619188463
// 29: lload 0
// 2a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: istore 7
// 31: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 34: iload 7
// 36: ifeq 63
// 39: lload 2
// 3a: iload 4
// 3c: i2b
// 3d: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 40: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 43: if_acmpeq 81
// 46: goto 53
// 49: ldc2_w -2547345176151220079
// 4c: lload 0
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 56: goto 63
// 59: ldc2_w -2547345176151220079
// 5c: lload 0
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: lload 5
// 65: invokevirtual su/catlean/ex.x (J)Z
// 68: iload 7
// 6a: ifeq 7e
// 6d: ifeq 81
// 70: goto 7d
// 73: ldc2_w -2547345176151220079
// 76: lload 0
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: bipush 1
// 7e: goto 82
// 81: bipush 0
// 82: ireturn
}

private static final boolean C() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ex.e J
// 03: ldc2_w 67544640168536
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 52248061393861
// 0d: lxor
// 0e: dup2
// 0f: bipush 8
// 11: lushr
// 12: lstore 2
// 13: dup2
// 14: bipush 56
// 16: lshl
// 17: bipush 56
// 19: lushr
// 1a: l2i
// 1b: istore 4
// 1d: pop2
// 1e: dup2
// 1f: ldc2_w 120176311682974
// 22: lxor
// 23: lstore 5
// 25: pop2
// 26: ldc2_w -5069270775977870687
// 29: lload 0
// 2a: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: istore 7
// 31: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 34: iload 7
// 36: ifne 63
// 39: lload 2
// 3a: iload 4
// 3c: i2b
// 3d: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 40: getstatic su/catlean/gx.DAMAGE Lsu/catlean/gx;
// 43: if_acmpeq 81
// 46: goto 53
// 49: ldc2_w -5102839667978025704
// 4c: lload 0
// 4d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: athrow
// 53: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 56: goto 63
// 59: ldc2_w -5102839667978025704
// 5c: lload 0
// 5d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 62: athrow
// 63: lload 5
// 65: invokevirtual su/catlean/ex.x (J)Z
// 68: iload 7
// 6a: ifne 7e
// 6d: ifne 81
// 70: goto 7d
// 73: ldc2_w -5102839667978025704
// 76: lload 0
// 77: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c: athrow
// 7d: bipush 1
// 7e: goto 82
// 81: bipush 0
// 82: ireturn
}

private static final boolean FZ() {
long var0 = e ^ 12456844241057L;
long var2 = (var0 ^ 28307335524668L) >>> 8;
int var4 = (int)((var0 ^ 28307335524668L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, -5488159094593564703L, var0);
}

return false;
}

private static final boolean g() {
long var0 = e ^ 28869832611985L;
long var2 = (var0 ^ 9531831943436L) >>> 8;
int var4 = (int)((var0 ^ 9531831943436L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 280970799529295825L, var0);
}

return false;
}

private static final boolean F6() {
long var0 = e ^ 25889607327812L;
long var2 = (var0 ^ 5915809036761L) >>> 8;
int var4 = (int)((var0 ^ 5915809036761L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 4265815661666912004L, var0);
}

return false;
}

private static final boolean Fi() {
long var0 = e ^ 26759819987676L;
long var2 = (var0 ^ 11802653725505L) >>> 8;
int var4 = (int)((var0 ^ 11802653725505L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, -7950199817446232676L, var0);
}

return false;
}

private static final boolean q() {
long var0 = e ^ 103498290830725L;
long var2 = (var0 ^ 84435159942168L) >>> 8;
int var4 = (int)((var0 ^ 84435159942168L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) == gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 500586840394398405L, var0);
}

return false;
}

private static final boolean F3() {
long var0 = e ^ 103457294903714L;
long var2 = (var0 ^ 84604449255487L) >>> 8;
int var4 = (int)((var0 ^ 84604449255487L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, -948727704824148254L, var0);
}

return false;
}

private static final boolean Fc() {
long var0 = e ^ 88892593154730L;
long var2 = (var0 ^ 72784363074359L) >>> 8;
int var4 = (int)((var0 ^ 72784363074359L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 3593168734557916650L, var0);
}

return false;
}

private static final boolean B() {
long var0 = e ^ 63644142160360L;
long var2 = (var0 ^ 47316767035509L) >>> 8;
int var4 = (int)((var0 ^ 47316767035509L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 5953502347703430824L, var0);
}

return false;
}

private static final boolean a() {
long var0 = e ^ 30473257847626L;
long var2 = (var0 ^ 10297701995223L) >>> 8;
int var4 = (int)((var0 ^ 10297701995223L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, -8053222822335943670L, var0);
}

return false;
}

private static final boolean p() {
long var0 = e ^ 45719783170300L;
long var2 = (var0 ^ 65414264813921L) >>> 8;
int var4 = (int)((var0 ^ 65414264813921L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 8902216377612502972L, var0);
}

return false;
}

private static final boolean w() {
long var0 = e ^ 46095436881108L;
long var2 = (var0 ^ 64900903667017L) >>> 8;
int var4 = (int)((var0 ^ 64900903667017L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 550291111701740436L, var0);
}

return false;
}

private static final boolean H() {
long var0 = e ^ 107425057267003L;
long var2 = (var0 ^ 126827650335910L) >>> 8;
int var4 = (int)((var0 ^ 126827650335910L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, -4157862018364360069L, var0);
}

return false;
}

private static final boolean F2() {
long var0 = e ^ 64782801110264L;
long var2 = (var0 ^ 43988764728677L) >>> 8;
int var4 = (int)((var0 ^ 43988764728677L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, 2274060383192114104L, var0);
}

return false;
}

private static final boolean v() {
long var0 = e ^ 129728511453020L;
long var2 = (var0 ^ 113345273052865L) >>> 8;
int var4 = (int)((var0 ^ 113345273052865L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, -4887713150843305956L, var0);
}

return false;
}

private static final boolean G() {
long var0 = e ^ 13701925427189L;
long var2 = (var0 ^ 33658569150056L) >>> 8;
int var4 = (int)((var0 ^ 33658569150056L) << 56 >>> 56);

try {
if (c.F9(var2, (byte)var4) != gx.DAMAGE) {
return true;
}
} catch (NoWhenBranchMatchedException var5) {
throw vm.a<"Å">(var5, -3710364368433008459L, var0);
}

return false;
}

private static final boolean Y(sy var0) {
long var1 = e ^ 121013438695962L;
long var10001 = var1 ^ 99638610151077L;
int var3 = (int)((var1 ^ 99638610151077L) >>> 48);
int var4 = (int)((var1 ^ 99638610151077L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
return sy.Y((short)var3, var4, var0, false, 1, null, (short)var5);
}

private static final boolean g(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final void Fd() {
long var0 = e ^ 53963013250282L;
long var2 = var0 ^ 106425476574079L;
Iterable var5 = J;
boolean var6 = false;
int var10000 = vm.a<"Å">(5153464382029876266L, var0);
Iterator var7 = var5.iterator();
int var4 = var10000;

while (var7.hasNext()) {
Object var8 = var7.next();
sy var9 = (sy)var8;
boolean var10 = false;

try {
var9.a(var2, ii.SWITCH);
if (var4 != 0 && var4 != 0) {
continue;
}
break;
} catch (NoWhenBranchMatchedException var11) {
throw vm.a<"Å">(var11, 5160313879079762858L, var0);
}
}
}

public static final int m(int a, ex $this, int a, class_2338 pos, short a) {
long var5 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ e;
long var7 = var5 ^ 42495886688316L;
return $this.u(pos, var7);
}

public static final zy C(long a, ex $this) {
ax = e ^ ax;
long var3 = ax ^ 36359399617068L;
return $this.K(var3);
}

public static final void C(ex $this, int slot, long a, short a, int from) {
long var6 = (axx << 16 | (long)ax << 48 >>> 48) ^ e;
long var8 = var6 ^ 126379515370600L;
$this.Y(slot, from, var8);
}

public static final oh z(ex $this, long a) {
ax = e ^ ax;
long var3 = ax ^ 119874971072399L;
return $this.Ft(var3);
}

public static final bu O(long a, ex $this) {
ax = e ^ ax;
long var3 = ax ^ 108558635964245L;
return $this.W(var3);
}

public static final boolean T(long a, ex $this) {
ax = e ^ ax;
long var3 = ax ^ 134824289929505L;
return $this.Fk(var3);
}

public static final class_2338 FO() {
return S;
}

public static final boolean q(ex $this, int a, int a, class_2338 pos, int a) {
long var5 = ((long)axxx << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ e;
long var7 = var5 ^ 138409732247226L;
return $this.M(var7, pos);
}

public static final cy D(ex $this, long a) {
ax = e ^ ax;
long var3 = ax ^ 9704949715829L;
return $this.i(var3);
}

public static final float K(ex $this, class_2680 state, class_2338 position, int slot, long a, boolean ground) {
ax = e ^ ax;
long var7 = ax ^ 3187780139392L;
return $this.U(var7, state, position, slot, ground);
}

public static final ConcurrentHashMap s() {
return m;
}

public static final boolean a(long a, ex $this) {
ax = e ^ ax;
long var3 = ax ^ 26788845449223L;
return $this.I(var3);
}

public static final boolean S(ex $this, long a) {
ax = e ^ ax;
long var3 = ax ^ 110721845598527L;
return $this.j(var3);
}

public static final boolean T(long a, ex $this, class_2338 bp) {
ax = e ^ ax;
long var4 = ax ^ 100356085073593L;
return $this.K(var4, bp);
}

public static final boolean g(long a, ex $this) {
ax = e ^ ax;
long var3 = ax ^ 5034876300335L;
return $this.n(var3);
}

public static final bg FU() {
return K;
}

public static final void a(class_2338 <set-?>) {
i = <set-?>;
}

static {
long var31 = e ^ 115510377353317L;
long var33 = var31 ^ 121889538753157L;
long var35 = var31 ^ 104248439983307L;
long var37 = var31 ^ 107489961950956L;
long var39 = var31 ^ 70695698850659L;
long var10001 = var31 ^ 97041713355257L;
int var41 = (int)((var31 ^ 97041713355257L) >>> 48);
int var42 = (int)((var31 ^ 97041713355257L) << 16 >>> 32);
int var43 = (int)(var10001 << 48 >>> 48);
long var44 = var31 ^ 30422502481721L;
long var46 = var31 ^ 34830130017919L;
var10001 = var31 ^ 73485685730485L;
int var48 = (int)((var31 ^ 73485685730485L) >>> 32);
int var49 = (int)((var31 ^ 73485685730485L) << 32 >>> 48);
int var50 = (int)(var10001 << 48 >>> 48);
vm.a<"Å">("VEFMUb", -8430128985089467116L, var31);
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[91];
int var27 = 0;
String var26 = "ø¤¼\u0085O\u007f\u0019´çÛ\u0092Ì\u0095-¡Ý\u0010«âv2\u0094c\u0099ºêä\u0083=¥µM¨ þ8Ï!\u001f îi¬ÊÓÁà\u001e)CÀ(\u0080^\bÆcY&\u001bjä*\u001bÄõ\u0098\u0098O\u009c²ßÕK!H\rU¿¿\u0015Æß¶úmÕexÔ\u0084úÜ¾Ø$\u0098He9\r<öch\u009e-Ø?Y\u008e\u0080c\u0001Ü\\\u0081\u009bÈ¿ß2l\u0019\u0087\\\u001d]\u008b!1R¥wìp¡\u009bXíiQû\u0093>¤éh¯.µþ\u0098%OÓ\u0015ë.é¬\u009dÁ\u0014©óv=>Î\u001dÉ\rfJ7lÜ\u0093\u000fÒßÿÔ®8\u0082s?\u0003$$dxÈ\u0086¿G23zæöÃmÊ\u0011öBè«Æ-ãVûfù'(¶¢v\u001c°\u0019óá\u001ftyÆ9;©æ\u0082(É\u0011Í,\b\u008a\u0093Õr¯?»7³\u0017ù²\u0003_\u0004PA ¥<¾\u001cõaçE¯\u008c¼ëà±\u0007ÖÌmV$ùEWÆúÿ\u0098\u00058\u0002ÁgX\u0082ÃÜÀÓ¦dõ/z\u001aü\u0017Û\u0001Õ_TÖC+7»M³\f¼\u001fØuø\u0011\u009b\u008b þÙÞè¹\u0017\\ÐÈL*\u0007å>\f²Vý¶Ïý\u0091)ÕÚÑåýõR\u009beªC~_\u009b\fCÿå?=\u001fu\u0095-ª£\u0087\u008fÀ!\u0010¬¨\u0084\u008d\u0089\u008b\u0094\n\u000bçv\u008dj*Íº K\u0084nD3»\u009b»W@¬*]ëÙÈ\u0016\u001eî+æ0O6êm2X\u0081ë¥à\u0010\u0095Bÿä Ù´ä\u0087k¸zR\u0089uQ8â¥P1\f\u0098 \u0094½ôË\u007fV9Ð\u00adW\u0080xY½1þpÃ\u0019\u0096,Ý\u0017ìg\u001fìÉ\"º±\u0019#u\u0002Óß\u0082\u008b°\u0084Q\u0015^ïz=ÿw\u00102\\\u000fe÷\u0013)\u0093±¯¬¡ß!\u001eð O\u009aª\u0094°YU\u008e\u0081Â\u0004\u0080akI³\u008cÉzÀõ\u009a\f\u00058\u0015%7&OOS ÷\u009f\u009c\u0089³\u000b\t©y³g<\u0084ºêgXÖ¶Ñ\u0015ç\u0017q\u00890TE¸ë¬þ0&¶+\u0011`àúß,\u0092J®-(\tk[M\u000b\u000397ækÐ\u0089ÐB\u009f!Ø\u0002i\u0099\u0083\u008e`\u0086\u001fÊæ\u0092\u0014Ã¶\u0097¹½ \u0099¬2bCU\u0089\t¦\u001e§\u009c¯åª9\u0015Îü\u0004\u001bv\u0087ÛjÌRßuhð» \u008c\u0080\u0018\u0017¶iä¹\u00927Ô\u009dH.·÷y\u008b\u0096\u008c%Ú5FÄ¹õ\u0001\u00ad\u0015\u008eà\u0010ªP\u0097Vúz+4öÐa*\u0005;vH\u0010&V\u0018¦\u0017\rr\\¥$Ì\u001dËãÏí\u0018]\u00897<Ï5î\u0095\u0017\u008a\u0016Í©öO\u00155\u0013\u0010|Tæ¢ö\u0018m·u=\u0080\u0098;\u009cÅçÂ6\u0088\u0086\\SÝ\u0080tfäËðë8J\u0014\u000f¬ÆCV|fQ¿*A_ÜÓ¿¿iØ´\u001a\u0000\nT\u008210gÎ¶RÆ³AsG§\u00adô\u008cU\u008aÍaÛ\u00ad\u000b\u001c\u0010´8sç^>(\rA±\u0087I4d1cG>Õ*Þ:g\u0087\u009b>Ôö91¹4ô\u008aç\u0013`O¦\u0099¤×\u000eô¥9\u0013 R8õ\u000bx2®»\u0003M\u0097þ\u0016\u0013Ó\u0011¨×\u009aPGãe'\u0095Ë|¬È?yÙ(ób\u001fQ¦v\u008e\u001eîed\u0091é¶+¾1\n\u0018LI¼®\u008bÿ8vï?~\u0083\u008e\u0010\u0016ZÓ\u0084ÓÄ¼ ZwÕj6\u0014\tÊ6¬\u00179ê\u0004u.ÚM%\u000fCç\u0088õ>Zã\u0000&®\u009c5(\u008ds÷v¾\u009a^Â·ÚWJ\u0003úµ'I\u0015®g¾5àa¹S¹õ;\u0091]\"Üû¹\u0003wêÛÔ0ÇZD Vºýe\u0006\u0096ÔqAØ\u007foª,{m\"\"ÃÏ(\u0082Ï\u0094\u001bÈ%c¥&çÊî\u009fRòF£\u0085Ö\u0014ø\u001a\u0087\u0018\rÒèÐ\u0088F\u0004\u0010oHV9=I¨Ç\b'\u009cW»\u0005\u0012\u0090(F\b`|\u0012\tô¸èà>_\u008fy\"\u0098¦dY^.Û;1ãn\u0005Ô¥6]\u0093\u00818ÖÌÉ\u0080ÆÞ\u0098Où\u0081EzÑB`ëà\u0081jÈ¨\u0088\u0003§Òú\u0083ê$1q|Ií 3¯ç\u0084Êu\n,uEò\u001f?HWnÄRÛqg^\u0011-\u001cß\u0017I$Àµ;>\u001f\u008c>5Ë\u0015ä?ç>~³a4\u0004ÇýkyC\b)Þ\u0096Ù\u0099Äer¦Æ¼¬{uÉ/Ìé\nìj\u0019!Ød ~\u0017^þ\u0099l\r¿.°ÛWV¾I\u000f3ó§±}¹\u0007\u0081(|\n\u007fh,æ\u008e}ÿ\u0080Ä«5i\u0007*\u0012@À\u0010·ñ¼2\u009b\u0086\u0018Nº»¨V\u001d\u0018\u008de\u0010\u0097²\f\u00164$Á åð<®\u00932Q% ÿAb\u009bfç\u0090÷Ô¿¥\u0080\u0097ñ°p½eñ\u0091ïÍ\u001cô\n'åVá¾Xn\u0010À\u0090#ÛõÃ\u0000\u001aÐÇÆî×\u0000ÌX\u0010üNÄ^\u00ad0\u0010ß-\u008f\u0086C\u0094sUÞ\u0018\u008bº\u0081 \u0012\\ëì\u001bèÒ\u009a«´íö²u\u008b8öêç\u001c Ãïm4;áK\u001eêdR·É¸\u0098$®\u0083£:I._\u0081Â\trUÄ¨§WXO[\u008bð\u00ad¼\u0099Þ¢\u0017T/dVhCìeÜ1\u0089¹\u0006¹¿D'\u001f£\u000eÐ\u0097B¯\u0015e©»ó½Õ8\rT\u0011òE\u0096º®Ï\t\u0000LG\u0097°Ü\u001deøÊP;\u0017Ã\u0094Ê!ô\u008a\u0011~Ï\u0013n\u0005pSTJd\u0002\u0096³ké\u00868\u001dÊñ\u00046I\u0095Î\u0091\u009fðÎÔ.9Sª\u0088\u0097Õ3\u0093j\u000fKA%\u008eª\u001d\u0099\u0086m\u0014 \u0099[@ö\u0014Ú\u0090 Ó`\u007f¤\u00801\u0010\u0003ØºÐ¿´\u0010¿f¨\u001baÝuP$'D³ÜÄü\u0081\u0018Ý»=¯¦xs\u0003 P«Ì\u0000GRö\u000f\u0083\u0080[çXy% \u0080\u0080£¦g\u0001Í\u009e\u008c_ÕIÈxí\u0013\u0089é\u0087z¤#\u0000y%\u0094¬«_\u0001?¼ ê0c\u0099\u007fX\u0088r¢äFz\u0095±ïÛ\u0082z¾þ\u0095A(\u00adÞª4¤-BÆ\\ \u009a\u0096ù2.Ã!JMäíL\u00ad¨\u0090Ï\u0096rbó/\u009e\u0095epØk\u009f\u0003bö| u\u001cª8=\u0099ÄN\u0092\u0092H\u0013h6ï\u0091f,'9h\u0081cl\u00804\u009cÅØèùM »M\u0097í25¸º9+ç-NÃVm¯ÙkÅ\u009bÜý´Ç\u007fËpt¾¿q\u0010ÝB\u008d\u0019l,5G%¢Ã\u0086ûñ\u0088Ã\u0010§^\u0095¹á§»H\u0097\u008a\u0090¤ß\rÓ\u0084(|\u0085Æp%~4\u0092íE\u001b\u0002\u0083¡\u008b_2Ö\u000eÀK&âr6\u008b\u009aÊ¦4>÷H\u009c¨d¿Ñ\u0015\u0013 ª¹O\u0000{\u001aÂ\u0093\u008bÉÆ:y\u0094\u0080\u0082l\\f0*¥äföèð¾¸|\u009c\u0014\u0010\u0006\n\u0092ÑÙt}Ñc5çWÌêº]\u0018óÈ°{ð\u0085O\u001dZÁ]\u0006¼/GÂ8ªü,\u008dÕR\u009e\u0010XÝÎ\u0015ø®ÙD\u0094Q±j\u0003ß&ã\u0018\u0010\u0090?\u0097\u0005l¹±©à\u001c¤/_I\u0090¨\u0007\u0094âÀg\\â8\u0087\u0012³?üTfuqÔÚw`¬\u0006r¡ÝU·pµ\u0019¶}/\u0085\u0089\u008aå+¬¤ØtÚ\u0012\u0003N3M\u00ad'\u0088`Ëuj\u001d\u0002bÄåW¾> è7\u0098F\u009do7ÜØËVå\u00885s¥#\u0000Ê\u0013\u0087I\u0084)áª\u0019>9â³1\u0018V\u001e!Û|!U'\b5Ð\u000b)}ã÷4\u009eWw½Üá¾ D\u0004ú;5=\u008dm\u001c4ÞÐ©ô\u0096]\n,òÐaIÉ\u009a'vM÷Þ\u009em \u0018§\u0012\u009d]\u0015\u0011ç¼:\u0092\n=\u0082\u001eöö\u0010º\u0091\u0018·õ\u0089\f\u0010UJåq\u000e\u0017¨|h?·\u0019\n¼\u0007ç TM+ß\u0086ÄéE×$vD ¹\f¯2¯÷g\u0006Þû\u009e¢ît+ö\u0081gH\u0010\u0085¨\u0096ì4yö¯NÿLTM\t@: °ûs\u009b\u0013y\u0083û\u008bRWE½\u009bK7äÉ\u008a\u0015g \u0015\u0018\f\u0017k\u0089S7\u000fÎ(?\u000bê`¸[¹\u00145³W»ÅcKö{æ\u0098Rj\nZ¿º\u0085ø\u008cÓÛêÖäØE<\u0019r¨\u00970\u008b\u008afÏ\u001dò\u0093\u0093Ñ+©ã9\u0094g\u009d^e\u0082\u0097¾U\u000eé¾<Sq\u001feÉüØ¤¼ËuÁ)E\\ËøH[,GyH¨vÖ\u0091DG~(\u0094\u0010\u009eÔC¢\u0081·\"¢.TPª#N\u009f\u008f\u0084\u0005X\u0082#o|\u0081OÕÃêé}®\u000er\u0087d];\u001fG\u0094ë\u0091ñ\nÀ\u00ad¢\n\u0090àítÈá\u0015§xoÖ½ÝÜ8û\u0088B\u0093µ\u0013\u0088¹:tí<H§uî\u009c\u009b74ÞÛfµw\u0012\u009a9¢´÷¶ÔâñÉ\u007f\u000eÜ°½{ñ5\u0015uD}\u0015f-ú¬h\u008d\u0019\u0010ä`\u0095D\u0098>[Gß\rj![½N>(é±)\u0007Ú{·\u009c\u008acÄ\tÙÒ3(H\u0003\u009e1;Ì%Dpè¿¶\u0093\"\u008cë\u008cð\u0099zþþú\u0003 ³\u0096Õ\u0007\u008bVgù\u009b6~Öæ^\u008d.,\u0096_tÝ\u001a\u0096ªNs\t\u0093\u0000\u00ad\u008c\u0085\u0018CßÑ\u000féå¿Øf¯2µûrá+|\\z´¦ø\u001f!8¯\u0006;ø\u000e«\r®æüÅf¡¯ÃäçúÄq\u009a\u001d Gk\u009fÙ\u0015\u009ah\u001f]ÊÈ\u0083ý»o'îØ¢\u008eé2\u0084Jrý\u008e\u0085×©B<\f\u0010êq\"ý\"\u0086\u009d¤L%xº\u0098Mõ}0ÊÝ\u0018V¼ú1ýw\u0082·í&ï×ÂÖãW§õ\u0092\u009eBb\u008e¨\nø\"¤\u0093ç\"õ+¶l£¨\u0098a.Ñ7¯C4\u0010tøÉ1\f~\u0084\u0086\u0084iÛ\u009fÐ$î\u0003\u0018\u0089Z*ÙÎ/Â\"\u009c\u000fÕü\u0001¤á¬Ó\u0082\u0004üÎo£® /ë·\u0018\u0092\u0014¡Këû¤zl<¢ì:Þ\b+L\u0082º\u0006£t\u0092ÆXYÿç ª¾o~/Hÿ\\ÕÞpf\u0001ùPü\u001aþÓ]h4Æ\u001e«\u001d\u009cß\u0081áL¦ H\u0089\u0087\u007f\u001dçA¦\u008c¬\u009a4@p¡\u0019\u001cG©õ-]ë9\rBf7Ì\u0080\u0011G Bi%Çê\u0087§O\u008fî¦\u0082å\u0012¢*\u0096aK\u009e\u0011¢r,Í]S\u0018X\u0000\u0000!8¡8\u00ad¿âlÑ\u007f\u0082Ii2\u008f\u008f\u00ad6Í&&\\ü M!{Cæà\u0011\u000e\u0003azË:\rsQ\u0014\t\u008b×ý¬\u0098ÙË\u0080\bh\u008bTË!«\u00800\nL¥mËøÑcE¼1\u00ad\u0092\"Ö\bz¢.\u0014uO\u001e¼ó\u0097\u0081Þ½o#ð\u0016¼#6-+ím*Ð\u001bwæ\n\u0012×0d÷Ô\u0002ÞR¡Á-\u0085À¨\u0090÷^£¤\u007fµÂ\u0012\nñ\u008e×\u008d\u0013a>\"òY\u00821\u009d-\u0089.Ü¹\u0092}§`x>¦g\u0018Óÿ\u0011@\u0091bû\u008b\u0010æIw%Xe\u0084\u0015\u0010öÊ¦W±Í ³üÂ\u009aè«\u001a\u0000ºLegñ#Z\u001af \u0001ºÊ@Øì~S<¸&\u0091\rq\u0010[4)½\u0007\u0012ÇõÞ,nä\u0085\u001f÷a ±¬\u0012\u0012ÍNû\u008e3L\u0098J¢\u0003\u007f°{æu\u0006\u007fa\u00adqÅ\u00ad\u00023\r\u0084ÿ\r\u0010ò±cµO^ÇA@Heë'Ýv:";
int var28 = "ø¤¼\u0085O\u007f\u0019´çÛ\u0092Ì\u0095-¡Ý\u0010«âv2\u0094c\u0099ºêä\u0083=¥µM¨ þ8Ï!\u001f îi¬ÊÓÁà\u001e)CÀ(\u0080^\bÆcY&\u001bjä*\u001bÄõ\u0098\u0098O\u009c²ßÕK!H\rU¿¿\u0015Æß¶úmÕexÔ\u0084úÜ¾Ø$\u0098He9\r<öch\u009e-Ø?Y\u008e\u0080c\u0001Ü\\\u0081\u009bÈ¿ß2l\u0019\u0087\\\u001d]\u008b!1R¥wìp¡\u009bXíiQû\u0093>¤éh¯.µþ\u0098%OÓ\u0015ë.é¬\u009dÁ\u0014©óv=>Î\u001dÉ\rfJ7lÜ\u0093\u000fÒßÿÔ®8\u0082s?\u0003$$dxÈ\u0086¿G23zæöÃmÊ\u0011öBè«Æ-ãVûfù'(¶¢v\u001c°\u0019óá\u001ftyÆ9;©æ\u0082(É\u0011Í,\b\u008a\u0093Õr¯?»7³\u0017ù²\u0003_\u0004PA ¥<¾\u001cõaçE¯\u008c¼ëà±\u0007ÖÌmV$ùEWÆúÿ\u0098\u00058\u0002ÁgX\u0082ÃÜÀÓ¦dõ/z\u001aü\u0017Û\u0001Õ_TÖC+7»M³\f¼\u001fØuø\u0011\u009b\u008b þÙÞè¹\u0017\\ÐÈL*\u0007å>\f²Vý¶Ïý\u0091)ÕÚÑåýõR\u009beªC~_\u009b\fCÿå?=\u001fu\u0095-ª£\u0087\u008fÀ!\u0010¬¨\u0084\u008d\u0089\u008b\u0094\n\u000bçv\u008dj*Íº K\u0084nD3»\u009b»W@¬*]ëÙÈ\u0016\u001eî+æ0O6êm2X\u0081ë¥à\u0010\u0095Bÿä Ù´ä\u0087k¸zR\u0089uQ8â¥P1\f\u0098 \u0094½ôË\u007fV9Ð\u00adW\u0080xY½1þpÃ\u0019\u0096,Ý\u0017ìg\u001fìÉ\"º±\u0019#u\u0002Óß\u0082\u008b°\u0084Q\u0015^ïz=ÿw\u00102\\\u000fe÷\u0013)\u0093±¯¬¡ß!\u001eð O\u009aª\u0094°YU\u008e\u0081Â\u0004\u0080akI³\u008cÉzÀõ\u009a\f\u00058\u0015%7&OOS ÷\u009f\u009c\u0089³\u000b\t©y³g<\u0084ºêgXÖ¶Ñ\u0015ç\u0017q\u00890TE¸ë¬þ0&¶+\u0011`àúß,\u0092J®-(\tk[M\u000b\u000397ækÐ\u0089ÐB\u009f!Ø\u0002i\u0099\u0083\u008e`\u0086\u001fÊæ\u0092\u0014Ã¶\u0097¹½ \u0099¬2bCU\u0089\t¦\u001e§\u009c¯åª9\u0015Îü\u0004\u001bv\u0087ÛjÌRßuhð» \u008c\u0080\u0018\u0017¶iä¹\u00927Ô\u009dH.·÷y\u008b\u0096\u008c%Ú5FÄ¹õ\u0001\u00ad\u0015\u008eà\u0010ªP\u0097Vúz+4öÐa*\u0005;vH\u0010&V\u0018¦\u0017\rr\\¥$Ì\u001dËãÏí\u0018]\u00897<Ï5î\u0095\u0017\u008a\u0016Í©öO\u00155\u0013\u0010|Tæ¢ö\u0018m·u=\u0080\u0098;\u009cÅçÂ6\u0088\u0086\\SÝ\u0080tfäËðë8J\u0014\u000f¬ÆCV|fQ¿*A_ÜÓ¿¿iØ´\u001a\u0000\nT\u008210gÎ¶RÆ³AsG§\u00adô\u008cU\u008aÍaÛ\u00ad\u000b\u001c\u0010´8sç^>(\rA±\u0087I4d1cG>Õ*Þ:g\u0087\u009b>Ôö91¹4ô\u008aç\u0013`O¦\u0099¤×\u000eô¥9\u0013 R8õ\u000bx2®»\u0003M\u0097þ\u0016\u0013Ó\u0011¨×\u009aPGãe'\u0095Ë|¬È?yÙ(ób\u001fQ¦v\u008e\u001eîed\u0091é¶+¾1\n\u0018LI¼®\u008bÿ8vï?~\u0083\u008e\u0010\u0016ZÓ\u0084ÓÄ¼ ZwÕj6\u0014\tÊ6¬\u00179ê\u0004u.ÚM%\u000fCç\u0088õ>Zã\u0000&®\u009c5(\u008ds÷v¾\u009a^Â·ÚWJ\u0003úµ'I\u0015®g¾5àa¹S¹õ;\u0091]\"Üû¹\u0003wêÛÔ0ÇZD Vºýe\u0006\u0096ÔqAØ\u007foª,{m\"\"ÃÏ(\u0082Ï\u0094\u001bÈ%c¥&çÊî\u009fRòF£\u0085Ö\u0014ø\u001a\u0087\u0018\rÒèÐ\u0088F\u0004\u0010oHV9=I¨Ç\b'\u009cW»\u0005\u0012\u0090(F\b`|\u0012\tô¸èà>_\u008fy\"\u0098¦dY^.Û;1ãn\u0005Ô¥6]\u0093\u00818ÖÌÉ\u0080ÆÞ\u0098Où\u0081EzÑB`ëà\u0081jÈ¨\u0088\u0003§Òú\u0083ê$1q|Ií 3¯ç\u0084Êu\n,uEò\u001f?HWnÄRÛqg^\u0011-\u001cß\u0017I$Àµ;>\u001f\u008c>5Ë\u0015ä?ç>~³a4\u0004ÇýkyC\b)Þ\u0096Ù\u0099Äer¦Æ¼¬{uÉ/Ìé\nìj\u0019!Ød ~\u0017^þ\u0099l\r¿.°ÛWV¾I\u000f3ó§±}¹\u0007\u0081(|\n\u007fh,æ\u008e}ÿ\u0080Ä«5i\u0007*\u0012@À\u0010·ñ¼2\u009b\u0086\u0018Nº»¨V\u001d\u0018\u008de\u0010\u0097²\f\u00164$Á åð<®\u00932Q% ÿAb\u009bfç\u0090÷Ô¿¥\u0080\u0097ñ°p½eñ\u0091ïÍ\u001cô\n'åVá¾Xn\u0010À\u0090#ÛõÃ\u0000\u001aÐÇÆî×\u0000ÌX\u0010üNÄ^\u00ad0\u0010ß-\u008f\u0086C\u0094sUÞ\u0018\u008bº\u0081 \u0012\\ëì\u001bèÒ\u009a«´íö²u\u008b8öêç\u001c Ãïm4;áK\u001eêdR·É¸\u0098$®\u0083£:I._\u0081Â\trUÄ¨§WXO[\u008bð\u00ad¼\u0099Þ¢\u0017T/dVhCìeÜ1\u0089¹\u0006¹¿D'\u001f£\u000eÐ\u0097B¯\u0015e©»ó½Õ8\rT\u0011òE\u0096º®Ï\t\u0000LG\u0097°Ü\u001deøÊP;\u0017Ã\u0094Ê!ô\u008a\u0011~Ï\u0013n\u0005pSTJd\u0002\u0096³ké\u00868\u001dÊñ\u00046I\u0095Î\u0091\u009fðÎÔ.9Sª\u0088\u0097Õ3\u0093j\u000fKA%\u008eª\u001d\u0099\u0086m\u0014 \u0099[@ö\u0014Ú\u0090 Ó`\u007f¤\u00801\u0010\u0003ØºÐ¿´\u0010¿f¨\u001baÝuP$'D³ÜÄü\u0081\u0018Ý»=¯¦xs\u0003 P«Ì\u0000GRö\u000f\u0083\u0080[çXy% \u0080\u0080£¦g\u0001Í\u009e\u008c_ÕIÈxí\u0013\u0089é\u0087z¤#\u0000y%\u0094¬«_\u0001?¼ ê0c\u0099\u007fX\u0088r¢äFz\u0095±ïÛ\u0082z¾þ\u0095A(\u00adÞª4¤-BÆ\\ \u009a\u0096ù2.Ã!JMäíL\u00ad¨\u0090Ï\u0096rbó/\u009e\u0095epØk\u009f\u0003bö| u\u001cª8=\u0099ÄN\u0092\u0092H\u0013h6ï\u0091f,'9h\u0081cl\u00804\u009cÅØèùM »M\u0097í25¸º9+ç-NÃVm¯ÙkÅ\u009bÜý´Ç\u007fËpt¾¿q\u0010ÝB\u008d\u0019l,5G%¢Ã\u0086ûñ\u0088Ã\u0010§^\u0095¹á§»H\u0097\u008a\u0090¤ß\rÓ\u0084(|\u0085Æp%~4\u0092íE\u001b\u0002\u0083¡\u008b_2Ö\u000eÀK&âr6\u008b\u009aÊ¦4>÷H\u009c¨d¿Ñ\u0015\u0013 ª¹O\u0000{\u001aÂ\u0093\u008bÉÆ:y\u0094\u0080\u0082l\\f0*¥äföèð¾¸|\u009c\u0014\u0010\u0006\n\u0092ÑÙt}Ñc5çWÌêº]\u0018óÈ°{ð\u0085O\u001dZÁ]\u0006¼/GÂ8ªü,\u008dÕR\u009e\u0010XÝÎ\u0015ø®ÙD\u0094Q±j\u0003ß&ã\u0018\u0010\u0090?\u0097\u0005l¹±©à\u001c¤/_I\u0090¨\u0007\u0094âÀg\\â8\u0087\u0012³?üTfuqÔÚw`¬\u0006r¡ÝU·pµ\u0019¶}/\u0085\u0089\u008aå+¬¤ØtÚ\u0012\u0003N3M\u00ad'\u0088`Ëuj\u001d\u0002bÄåW¾> è7\u0098F\u009do7ÜØËVå\u00885s¥#\u0000Ê\u0013\u0087I\u0084)áª\u0019>9â³1\u0018V\u001e!Û|!U'\b5Ð\u000b)}ã÷4\u009eWw½Üá¾ D\u0004ú;5=\u008dm\u001c4ÞÐ©ô\u0096]\n,òÐaIÉ\u009a'vM÷Þ\u009em \u0018§\u0012\u009d]\u0015\u0011ç¼:\u0092\n=\u0082\u001eöö\u0010º\u0091\u0018·õ\u0089\f\u0010UJåq\u000e\u0017¨|h?·\u0019\n¼\u0007ç TM+ß\u0086ÄéE×$vD ¹\f¯2¯÷g\u0006Þû\u009e¢ît+ö\u0081gH\u0010\u0085¨\u0096ì4yö¯NÿLTM\t@: °ûs\u009b\u0013y\u0083û\u008bRWE½\u009bK7äÉ\u008a\u0015g \u0015\u0018\f\u0017k\u0089S7\u000fÎ(?\u000bê`¸[¹\u00145³W»ÅcKö{æ\u0098Rj\nZ¿º\u0085ø\u008cÓÛêÖäØE<\u0019r¨\u00970\u008b\u008afÏ\u001dò\u0093\u0093Ñ+©ã9\u0094g\u009d^e\u0082\u0097¾U\u000eé¾<Sq\u001feÉüØ¤¼ËuÁ)E\\ËøH[,GyH¨vÖ\u0091DG~(\u0094\u0010\u009eÔC¢\u0081·\"¢.TPª#N\u009f\u008f\u0084\u0005X\u0082#o|\u0081OÕÃêé}®\u000er\u0087d];\u001fG\u0094ë\u0091ñ\nÀ\u00ad¢\n\u0090àítÈá\u0015§xoÖ½ÝÜ8û\u0088B\u0093µ\u0013\u0088¹:tí<H§uî\u009c\u009b74ÞÛfµw\u0012\u009a9¢´÷¶ÔâñÉ\u007f\u000eÜ°½{ñ5\u0015uD}\u0015f-ú¬h\u008d\u0019\u0010ä`\u0095D\u0098>[Gß\rj![½N>(é±)\u0007Ú{·\u009c\u008acÄ\tÙÒ3(H\u0003\u009e1;Ì%Dpè¿¶\u0093\"\u008cë\u008cð\u0099zþþú\u0003 ³\u0096Õ\u0007\u008bVgù\u009b6~Öæ^\u008d.,\u0096_tÝ\u001a\u0096ªNs\t\u0093\u0000\u00ad\u008c\u0085\u0018CßÑ\u000féå¿Øf¯2µûrá+|\\z´¦ø\u001f!8¯\u0006;ø\u000e«\r®æüÅf¡¯ÃäçúÄq\u009a\u001d Gk\u009fÙ\u0015\u009ah\u001f]ÊÈ\u0083ý»o'îØ¢\u008eé2\u0084Jrý\u008e\u0085×©B<\f\u0010êq\"ý\"\u0086\u009d¤L%xº\u0098Mõ}0ÊÝ\u0018V¼ú1ýw\u0082·í&ï×ÂÖãW§õ\u0092\u009eBb\u008e¨\nø\"¤\u0093ç\"õ+¶l£¨\u0098a.Ñ7¯C4\u0010tøÉ1\f~\u0084\u0086\u0084iÛ\u009fÐ$î\u0003\u0018\u0089Z*ÙÎ/Â\"\u009c\u000fÕü\u0001¤á¬Ó\u0082\u0004üÎo£® /ë·\u0018\u0092\u0014¡Këû¤zl<¢ì:Þ\b+L\u0082º\u0006£t\u0092ÆXYÿç ª¾o~/Hÿ\\ÕÞpf\u0001ùPü\u001aþÓ]h4Æ\u001e«\u001d\u009cß\u0081áL¦ H\u0089\u0087\u007f\u001dçA¦\u008c¬\u009a4@p¡\u0019\u001cG©õ-]ë9\rBf7Ì\u0080\u0011G Bi%Çê\u0087§O\u008fî¦\u0082å\u0012¢*\u0096aK\u009e\u0011¢r,Í]S\u0018X\u0000\u0000!8¡8\u00ad¿âlÑ\u007f\u0082Ii2\u008f\u008f\u00ad6Í&&\\ü M!{Cæà\u0011\u000e\u0003azË:\rsQ\u0014\t\u008b×ý¬\u0098ÙË\u0080\bh\u008bTË!«\u00800\nL¥mËøÑcE¼1\u00ad\u0092\"Ö\bz¢.\u0014uO\u001e¼ó\u0097\u0081Þ½o#ð\u0016¼#6-+ím*Ð\u001bwæ\n\u0012×0d÷Ô\u0002ÞR¡Á-\u0085À¨\u0090÷^£¤\u007fµÂ\u0012\nñ\u008e×\u008d\u0013a>\"òY\u00821\u009d-\u0089.Ü¹\u0092}§`x>¦g\u0018Óÿ\u0011@\u0091bû\u008b\u0010æIw%Xe\u0084\u0015\u0010öÊ¦W±Í ³üÂ\u009aè«\u001a\u0000ºLegñ#Z\u001af \u0001ºÊ@Øì~S<¸&\u0091\rq\u0010[4)½\u0007\u0012ÇõÞ,nä\u0085\u001f÷a ±¬\u0012\u0012ÍNû\u008e3L\u0098J¢\u0003\u007f°{æu\u0006\u007fa\u00adqÅ\u00ad\u00023\r\u0084ÿ\r\u0010ò±cµO^ÇA@Heë'Ýv:"
.length();
char var25 = 16;
int var54 = -1;

label72:
while (true) {
String var55 = var26.substring(++var54, var54 + var25);
byte var61 = -1;

while (true) {
byte[] var30 = var22.doFinal(var55.getBytes("ISO-8859-1"));
String var71 = b(var30).intern();
switch (var61) {
case 0:
var29[var27++] = var71;
if ((var54 += var25) >= var28) {
f = var29;
j = new String[91];
N = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[43];
int var14 = 0;
String var15 = "\nÆ1ú\u0097ê\u0083cÆÈð×Ë¾,þBzûþY\u0083»Áa©Ó¨bH¾þ\u0011S(Í%»´\u0015ÁÑ¹\u0082\u0092¥s\u0010¶ø\u0096ÓI\u0082\\©P:iæë\u0082Ñ.q%x\u0080ýUWy7z\u008d¿Òã¶I\u00045\u008cÊ(V\u0012ÓáµXî»ugºàÂÀbcÀá\u0014\u0001\u0096\u0090j±\u0004½\u008f\u0094¾ùF¸\u000b)<¿bW¢Óµ\u009dÆ?Q\u0003WCUÆ4'÷\u009b¬[\u0003ô\u0002zY\u0099\u001bk©à´Ý\u008eÜ\nRSì(\u0005&Õ\u0012!\u009b \u000eÂÅ\u008a«\u009f3\u0012[òç\u0097á\u0017p\u0082Q\u008c\u0011L\u008f\u0095ÄTJï`\u009a\u0006§¿\u0093õ'\\\u000fK\u001d\u0005Y\"·\u001eÁ\u0001\u001d\u0099\u000em\u0080B\u0087èTÔp½\u008e·ºÓ\u008bI¿K'¼.ª\u000ef\u0005ø±ïÑ«ç~iÜÇ¹ P\f>ÃÍÇ·ê8\u001b²±\u0093yÇ\u00120\t;c\rîd0ýÏ\u0097¾\u0016aÀkÈ\u00adïnTÊV)jzS\u001d»\u0098½Z7s ¤\u0003\u001bµ¢\u0088þ³V£í±9\u000b\u0091Ì|\u0088í\u0085\f\u0094\u001aö\tC";
int var16 = "\nÆ1ú\u0097ê\u0083cÆÈð×Ë¾,þBzûþY\u0083»Áa©Ó¨bH¾þ\u0011S(Í%»´\u0015ÁÑ¹\u0082\u0092¥s\u0010¶ø\u0096ÓI\u0082\\©P:iæë\u0082Ñ.q%x\u0080ýUWy7z\u008d¿Òã¶I\u00045\u008cÊ(V\u0012ÓáµXî»ugºàÂÀbcÀá\u0014\u0001\u0096\u0090j±\u0004½\u008f\u0094¾ùF¸\u000b)<¿bW¢Óµ\u009dÆ?Q\u0003WCUÆ4'÷\u009b¬[\u0003ô\u0002zY\u0099\u001bk©à´Ý\u008eÜ\nRSì(\u0005&Õ\u0012!\u009b \u000eÂÅ\u008a«\u009f3\u0012[òç\u0097á\u0017p\u0082Q\u008c\u0011L\u008f\u0095ÄTJï`\u009a\u0006§¿\u0093õ'\\\u000fK\u001d\u0005Y\"·\u001eÁ\u0001\u001d\u0099\u000em\u0080B\u0087èTÔp½\u008e·ºÓ\u008bI¿K'¼.ª\u000ef\u0005ø±ïÑ«ç~iÜÇ¹ P\f>ÃÍÇ·ê8\u001b²±\u0093yÇ\u00120\t;c\rîd0ýÏ\u0097¾\u0016aÀkÈ\u00adïnTÊV)jzS\u001d»\u0098½Z7s ¤\u0003\u001bµ¢\u0088þ³V£í±9\u000b\u0091Ì|\u0088í\u0085\f\u0094\u001aö\tC"
.length();
byte var13 = 0;

label54:
while (true) {
byte var65 = var13;
var13 += 8;
byte[] var18 = var15.substring(var65, var13).getBytes("ISO-8859-1");
long[] var58 = var17;
int var66 = var14++;
long var75 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var79 = -1;

while (true) {
long var19 = var75;
byte[] var21 = var11.doFinal(
new byte[]{
(byte)(var19 >>> 56),
(byte)(var19 >>> 48),
(byte)(var19 >>> 40),
(byte)(var19 >>> 32),
(byte)(var19 >>> 24),
(byte)(var19 >>> 16),
(byte)(var19 >>> 8),
(byte)var19
}
);
long var83 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var79) {
case 0:
var58[var66] = var83;
if (var13 >= var16) {
u = var17;
C = new Integer[43];
W = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "\b9£Å¾N±\u0085o¿*7+\u0096¦Q";
int var5 = "\b9£Å¾N±\u0085o¿*7+\u0096¦Q".length();
byte var2 = 0;

do {
byte var68 = var2;
var2 += 8;
byte[] var7 = var4.substring(var68, var2).getBytes("ISO-8859-1");
int var69 = var3++;
long var8 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
var83 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var82 = -1;
var6[var69] = var83;
} while (var2 < var5);

O = var6;
P = new Long[2];
KProperty[] var51 = new KProperty[c<"v">(8669, 5794332684725762894L ^ var31)];
var51[0] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(4230, 5403393734746869422L ^ var31), b<"j">(29917, 5675109288630807251L ^ var31), 0)
);
var51[1] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(9567, 3838815177580559215L ^ var31), b<"j">(17862, 2711149758243822526L ^ var31), 0)
);
var51[2] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(5555, 6759539294688840643L ^ var31), b<"j">(31187, 7585166399476033521L ^ var31), 0)
);
var51[3] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(12247, 8385866221819343348L ^ var31), b<"j">(1815, 2992164619551578422L ^ var31), 0)
);
var51[4] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(31699, 8595191115200226775L ^ var31), b<"j">(16568, 4877224419134267056L ^ var31), 0)
);
var51[5] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(23264, 5982015260984591604L ^ var31), b<"j">(30759, 2018284116899718747L ^ var31), 0)
);
var51[c<"v">(3443, 4321387698731948024L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(27333, 1180343688279356650L ^ var31), b<"j">(12171, 7802309022352716272L ^ var31), 0)
);
var51[c<"v">(29961, 3817674398310952850L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(24522, 5047390288334504395L ^ var31), b<"j">(9124, 2405443432734309783L ^ var31), 0)
);
var51[c<"v">(6369, 3399284028842934877L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(28742, 3790632366144155206L ^ var31), b<"j">(12590, 6101968668508270406L ^ var31), 0)
);
var51[c<"v">(29346, 2938938140913690675L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(7344, 958966110589452973L ^ var31), b<"j">(25739, 7115491810629024447L ^ var31), 0)
);
var51[c<"v">(16982, 4778708177077098724L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(12473, 8200741157561970384L ^ var31), b<"j">(2267, 8356834108250691242L ^ var31), 0)
);
var51[c<"v">(15216, 1758969398544245225L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(20877, 4441951813610262410L ^ var31), b<"j">(4519, 3831838892791009174L ^ var31), 0)
);
var51[c<"v">(28222, 3417910965671457954L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(57, 6173184642453118482L ^ var31), b<"j">(9834, 2429944497217222778L ^ var31), 0)
);
var51[c<"v">(4669, 2632404758098610343L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(31664, 2161646904221361613L ^ var31), b<"j">(7647, 1637929940800897997L ^ var31), 0)
);
var51[c<"v">(4783, 9031486164762953789L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(9105, 6339017450775690653L ^ var31), b<"j">(23770, 3336783990047982266L ^ var31), 0)
);
var51[c<"v">(4890, 7791523692114086287L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(25523, 1361269288357199314L ^ var31), b<"j">(8510, 3512943494467632926L ^ var31), 0)
);
var51[c<"v">(17868, 6444651512386314075L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(7872, 4604731897897025747L ^ var31), b<"j">(25133, 112780011783289872L ^ var31), 0)
);
var51[c<"v">(8928, 8089290187630524516L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(4211, 7290142840967237209L ^ var31), b<"j">(7499, 4808695927985177393L ^ var31), 0)
);
var51[c<"v">(19437, 5420230423357870461L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(23366, 8971310159563605316L ^ var31), b<"j">(23202, 6419368499484411081L ^ var31), 0)
);
var51[c<"v">(30357, 196067273008966664L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(1928, 6241841844400101797L ^ var31), b<"j">(7097, 6342859175617693139L ^ var31), 0)
);
var51[c<"v">(32442, 3005855481619833914L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(24875, 3152026863068118854L ^ var31), b<"j">(6441, 4687569152918161207L ^ var31), 0)
);
var51[c<"v">(14925, 9036306846378729682L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(1709, 2936279082611022017L ^ var31), b<"j">(19333, 7033844267007923625L ^ var31), 0)
);
var51[c<"v">(11127, 773602270034473412L ^ var31)] = Reflection.property1(
new PropertyReference1Impl(ex.class, b<"j">(13775, 8291057826300931012L ^ var31), b<"j">(26053, 6989354431853362102L ^ var31), 0)
);
G = var51;
c = new ex(var39);
A = yp.L(c, b<"j">(18432, 6521430228019336709L ^ var31), gx.PACKET, null, null, c<"v">(28222, 3417910965671457954L ^ var31), null, var46);
U = yp.L(c, b<"j">(11521, 2966668225171141486L ^ var31), jp.SEQUENTIAL, null, ex::Y, 4, null, var46);
X = yp.L(c, b<"j">(31370, 7306783931055662252L ^ var31), d0.OFF, null, ex::R, 4, null, var46);
D = yp.t(c, b<"j">(5063, 2543470108537261554L ^ var31), true, var35, null, ex::L, 4, null);
E = yp.t(c, b<"j">(21939, 405609469380479887L ^ var31), true, var35, null, ex::r, 4, null);
w = yp.t(c, b<"j">(9763, 7910082859775735845L ^ var31), false, var35, null, ex::z, 4, null);
F = yp.L(c, b<"j">(1982, 1824692428466461131L ^ var31), oh.NEW, null, ex::h, 4, null, var46);
y = yp.L(c, b<"j">(4632, 3441937970836081664L ^ var31), bu.ABORT, null, ex::C, 4, null, var46);
x = yp.L(c, b<"j">(15197, 1097892140459828545L ^ var31), iw.Alternative, null, ex::FZ, 4, null, var46);
b = yp.t(c, b<"j">(29685, 3975600784002051531L ^ var31), false, var35, null, ex::g, 4, null);
t = yp.L(c, b<"j">(3560, 1170816251646055319L ^ var31), zy.ONCE, null, ex::F6, 4, null, var46);
h = yp.k(
c, b<"j">(30620, 6374882626016438678L ^ var31), 1.0F, var33, RangesKt.rangeTo(0.5F, 2.0F), null, ex::Fi, c<"v">(6369, 3399284028842934877L ^ var31), null
);
L = yp.k(c, b<"j">(7542, 246596492629410671L ^ var31), 0.5F, var33, RangesKt.rangeTo(0.0F, 1.0F), null, ex::q, c<"v">(6369, 3399284028842934877L ^ var31), null);
l = yp.t(c, b<"j">(31666, 2927608006599140746L ^ var31), true, var35, null, ex::F3, 4, null);
V = yp.t(c, b<"j">(21671, 8598449116698593941L ^ var31), true, var35, null, ex::Fc, 4, null);
n = yp.t(c, b<"j">(13520, 6734631291520920257L ^ var31), true, var35, null, ex::B, 4, null);
B = yp.t(c, b<"j">(10177, 8083176641767717311L ^ var31), true, var35, null, ex::a, 4, null);
a = yp.L(c, b<"j">(31507, 3344166883693127015L ^ var31), cy.NONE, null, ex::p, 4, null, var46);
T = yp.B(c, b<"j">(13884, 2075768775485696053L ^ var31), (short)var41, null, ex::w, 2, var42, null, (char)var43);
z = yp.j(c, var37, b<"j">(3212, 6305919932557693595L ^ var31), nc.Shrink, c.V(var48, (short)var49, (short)var50), ex::H);
Y = yp.j(c, var37, b<"j">(29784, 3165392435351677527L ^ var31), xi.AIR_REBREAK, c.V(var48, (short)var49, (short)var50), ex::F2);
d = yp.u(
c,
b<"j">(28328, 3652250565949419710L ^ var31),
new Color(c<"v">(27773, 5911321451284035317L ^ var31), 0, 0, c<"v">(22679, 2374968499558564382L ^ var31)),
var44,
c.V(var48, (short)var49, (short)var50),
ex::v
);
o = yp.u(
c,
b<"j">(3929, 8564046235948716331L ^ var31),
new Color(c<"v">(23650, 3134049135519352564L ^ var31), c<"v">(27721, 5063379906679568069L ^ var31), 0, c<"v">(22679, 2374968499558564382L ^ var31)),
var44,
c.V(var48, (short)var49, (short)var50),
ex::G
);
K = new bg();
I = new AtomicBoolean(false);
J = new LinkedList();
m = new ConcurrentHashMap();
return;
}
break;
default:
var58[var66] = var83;
if (var13 < var16) {
continue label54;
}

var15 = "=ü9h%0\u008fED§.\u0019O÷¡+";
var16 = "=ü9h%0\u008fED§.\u0019O÷¡+".length();
var13 = 0;
}

byte var67 = var13;
var13 += 8;
var18 = var15.substring(var67, var13).getBytes("ISO-8859-1");
var58 = var17;
var66 = var14++;
var75 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var79 = 0;
}
}
}

var25 = var26.charAt(var54);
break;
default:
var29[var27++] = var71;
if ((var54 += var25) < var28) {
var25 = var26.charAt(var54);
continue label72;
}

var26 = "D³:.B\u0013\u0013\u008dK+\u0090j\u001bÎ\u008c#\neËpIåÄ\u000fâ\u000b\ts\u0097ûÑ¯ è¢°Ì\u009cçÝìó\u0090qv¨\u000e`\u0090)\u0082¾Ü2DÌðiÝxÊ¨\u0005i\u0000";
var28 = "D³:.B\u0013\u0013\u008dK+\u0090j\u001bÎ\u008c#\neËpIåÄ\u000fâ\u000b\ts\u0097ûÑ¯ è¢°Ì\u009cçÝìó\u0090qv¨\u000e`\u0090)\u0082¾Ü2DÌðiÝxÊ¨\u0005i\u0000"
.length();
var25 = ' ';
var54 = -1;
}

var55 = var26.substring(++var54, var54 + var25);
var61 = 0;
}
}
}

public static void h(String var0) {
g = var0;
}

public static String Q() {
return g;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5152;
if (j[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])k.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
k.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ex", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = f[var5].getBytes("ISO-8859-1");
j[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return j[var5];
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
throw new RuntimeException("su/catlean/ex" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 4227;
if (C[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = u[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])N.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
N.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ex", var14);
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
throw new RuntimeException("su/catlean/ex" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long e(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 4927;
if (P[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = O[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])W.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
W.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ex", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
P[var3] = var15;
}

return P[var3];
}

private static long e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = e(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
return var7;
}

private static CallSite e(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ex" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
