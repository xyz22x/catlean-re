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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class e0 extends _g {
@NotNull
public static final e0 Y;
static final KProperty[] a;
@NotNull
private static final cw B;
@NotNull
private static final c8 D;
@NotNull
private static final cp G;
@NotNull
private static final cq b;
@NotNull
private static final cq k;
@NotNull
private static final cq A;
@NotNull
private static final cq o;
@NotNull
private static final cq i;
@NotNull
private static final cq d;
@NotNull
private static final cq K;
@NotNull
private static final cq x;
@NotNull
private static final i9 z;
private static final long c = yz.a(4533212411249400744L, -1052339863790756425L, MethodHandles.lookup().lookupClass()).a(275190483200967L);
private static final String[] e;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] j;
private static final Map l;

private e0(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ c;
long var6 = var4 ^ 124165743677573L;
super(b<"e">(26351, 8811353660709470388L ^ var4), jt.y(), null, 4, null, var6);
}

private final f9 l(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 36478873623456L;
return (f9)B.E(this, var3, a[0]);
}

private final void Z(int var1, int var2, f9 var3, short var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ c;
long var7 = var5 ^ 66782468444731L;
B.b(this, var7, a[0], var3);
}

private final int A(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 55970992587704L;
return ((Number)D.E(this, var3, a[1])).intValue();
}

private final void p(int var1, char var2, short var3, int var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
long var7 = var5 ^ 67610512528833L;
D.b(this, var7, a[1], var4);
}

private final h R(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 101740169891651L;
return (h)G.E(this, var3, a[2]);
}

private final boolean L(int var1, int var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 49290721442478L;
return (Boolean)b.E(this, var6, a[3]);
}

private final void F(long var1, boolean var3) {
var1 = c ^ var1;
long var4 = var1 ^ 59836009323773L;
b.b(this, var4, a[3], var3);
}

private final boolean r(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 81394992741813L;
return (Boolean)k.E(this, var3, a[4]);
}

private final void z(boolean var1, int var2, int var3, byte var4) {
long var5 = ((long)var2 << 32 | (long)var3 << 40 >>> 32 | (long)var4 << 56 >>> 56) ^ c;
long var7 = var5 ^ 58905533404509L;
k.b(this, var7, a[4], var1);
}

private final boolean I(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 45909675883275L;
return (Boolean)A.E(this, var3, a[5]);
}

private final void K(boolean var1, short var2, short var3, int var4) {
long var5 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ c;
long var7 = var5 ^ 118669952054181L;
A.b(this, var7, a[5], var1);
}

private final boolean K(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 55300104255663L;
return (Boolean)o.E(this, var3, a[c<"j">(3998, 1104568143336555540L ^ var1)]);
}

private final void V(boolean var1, long var2) {
var2 = c ^ var2;
long var4 = var2 ^ 48420190491194L;
o.b(this, var4, a[c<"j">(25345, 6930151623309121021L ^ var2)], var1);
}

private final boolean n(long var1, char var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ c;
long var6 = var4 ^ 107848519335478L;
return (Boolean)i.E(this, var6, a[c<"j">(26423, 4209676274491845166L ^ var4)]);
}

private final void O(boolean var1, long var2) {
var2 = c ^ var2;
long var4 = var2 ^ 103721333794738L;
i.b(this, var4, a[c<"j">(23154, 4813213849160472845L ^ var2)], var1);
}

private final boolean D(long var1) {
var1 = c ^ var1;
long var3 = var1 ^ 3651324841474L;
return (Boolean)d.E(this, var3, a[c<"j">(24225, 5604218505616155520L ^ var1)]);
}

private final void d(boolean var1, long var2) {
var2 = c ^ var2;
long var4 = var2 ^ 44660456987972L;
d.b(this, var4, a[c<"j">(3828, 4774603913574004597L ^ var2)], var1);
}

private final boolean Z(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ c;
long var6 = var4 ^ 133108409217104L;
return (Boolean)K.E(this, var6, a[c<"j">(18563, 3963793528760945649L ^ var4)]);
}

private final void c(int var1, boolean var2, short var3, int var4) {
long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ c;
long var7 = var5 ^ 34584549893420L;
K.b(this, var7, a[c<"j">(27308, 7152395942421523271L ^ var5)], var2);
}

private final boolean Y(long var1, int var3) {
long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ c;
long var6 = var4 ^ 75054814540112L;
return (Boolean)x.E(this, var6, a[c<"j">(2717, 4957815501496518889L ^ var4)]);
}

private final void T(int var1, boolean var2, short var3, char var4) {
long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ c;
long var7 = var5 ^ 15382900181537L;
x.b(this, var7, a[c<"j">(32108, 8184852908661363590L ^ var5)], var2);
}

@Flow
private final void Y(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e0.c J
// 003: ldc2_w 97840224258471
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 135995930341275
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 92144217238305
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 38201339866146
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 47121395582491
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 130847572142743
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 106872650118643
// 030: lxor
// 031: dup2
// 032: bipush 48
// 034: lushr
// 035: l2i
// 036: istore 14
// 038: dup2
// 039: bipush 16
// 03b: lshl
// 03c: bipush 48
// 03e: lushr
// 03f: l2i
// 040: istore 15
// 042: dup2
// 043: bipush 32
// 045: lshl
// 046: bipush 32
// 048: lushr
// 049: l2i
// 04a: istore 16
// 04c: pop2
// 04d: dup2
// 04e: ldc2_w 101702722467059
// 051: lxor
// 052: dup2
// 053: bipush 32
// 055: lushr
// 056: lstore 17
// 058: dup2
// 059: bipush 32
// 05b: lshl
// 05c: bipush 32
// 05e: lushr
// 05f: l2i
// 060: istore 19
// 062: pop2
// 063: pop2
// 064: ldc2_w 3345723776952733027
// 067: lload 2
// 068: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: istore 20
// 06f: getstatic su/catlean/e0.z Lsu/catlean/i9;
// 072: aload 0
// 073: lload 10
// 075: invokespecial su/catlean/e0.A (J)I
// 078: lload 12
// 07a: invokevirtual su/catlean/i9.e (IJ)Z
// 07d: iload 20
// 07f: ifeq 0a5
// 082: ifeq 136
// 085: goto 092
// 088: ldc2_w 3328336535922355564
// 08b: lload 2
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: aload 0
// 093: lload 4
// 095: invokespecial su/catlean/e0.W (J)Z
// 098: goto 0a5
// 09b: ldc2_w 3328336535922355564
// 09e: lload 2
// 09f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: athrow
// 0a5: iload 20
// 0a7: ifeq 0c7
// 0aa: ifeq 0bb
// 0ad: goto 0ba
// 0b0: ldc2_w 3328336535922355564
// 0b3: lload 2
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: return
// 0bb: aload 0
// 0bc: iload 14
// 0be: i2s
// 0bf: iload 15
// 0c1: i2s
// 0c2: iload 16
// 0c4: invokespecial su/catlean/e0.Z (SSI)Z
// 0c7: iload 20
// 0c9: ifeq 10d
// 0cc: ifeq 105
// 0cf: goto 0dc
// 0d2: ldc2_w 3328336535922355564
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: aload 0
// 0dd: lload 8
// 0df: invokespecial su/catlean/e0.M (J)Z
// 0e2: iload 20
// 0e4: ifeq 10d
// 0e7: goto 0f4
// 0ea: ldc2_w 3328336535922355564
// 0ed: lload 2
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: ifeq 105
// 0f7: goto 104
// 0fa: ldc2_w 3328336535922355564
// 0fd: lload 2
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: return
// 105: aload 0
// 106: lload 17
// 108: iload 19
// 10a: invokespecial su/catlean/e0.Y (JI)Z
// 10d: iload 20
// 10f: ifeq 135
// 112: ifeq 136
// 115: goto 122
// 118: ldc2_w 3328336535922355564
// 11b: lload 2
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: aload 0
// 123: lload 6
// 125: invokespecial su/catlean/e0.Q (J)Z
// 128: goto 135
// 12b: ldc2_w 3328336535922355564
// 12e: lload 2
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: pop
// 136: return
}

private final boolean W(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e0.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 122942025757834
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 57432540928424
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 53740035137211
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 133916538352208
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 30989168561140
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 108853256925562
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 13358124190374
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 33226744624467
// 03b: lxor
// 03c: lstore 17
// 03e: dup2
// 03f: ldc2_w 115385688020821
// 042: lxor
// 043: lstore 19
// 045: pop2
// 046: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 049: lload 13
// 04b: invokevirtual su/catlean/gw.c (J)Ljava/util/List;
// 04e: checkcast java/lang/Iterable
// 051: astore 23
// 053: nop
// 054: ldc2_w -6346252177137542158
// 057: lload 1
// 058: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: bipush 0
// 05e: istore 24
// 060: istore 21
// 062: aload 23
// 064: astore 25
// 066: new java/util/ArrayList
// 069: dup
// 06a: invokespecial java/util/ArrayList.<init> ()V
// 06d: checkcast java/util/Collection
// 070: astore 26
// 072: bipush 0
// 073: istore 27
// 075: aload 25
// 077: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 07c: astore 28
// 07e: aload 28
// 080: invokeinterface java/util/Iterator.hasNext ()Z 1
// 085: ifeq 188
// 088: aload 28
// 08a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 08f: astore 29
// 091: aload 29
// 093: checkcast net/minecraft/class_2338
// 096: astore 30
// 098: bipush 0
// 099: istore 31
// 09b: lload 11
// 09d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0a0: aload 30
// 0a2: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0a5: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0a8: dup
// 0a9: sipush 30251
// 0ac: ldc2_w 6594099033873249821
// 0af: lload 1
// 0b0: lxor
// 0b1: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b9: astore 32
// 0bb: lload 1
// 0bc: lconst_0
// 0bd: lcmp
// 0be: ifle 1c2
// 0c1: aload 32
// 0c3: getstatic net/minecraft/class_2246.field_10362 Lnet/minecraft/class_2248;
// 0c6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c9: iload 21
// 0cb: ifne 1c0
// 0ce: iload 21
// 0d0: lload 1
// 0d1: lconst_0
// 0d2: lcmp
// 0d3: ifle 126
// 0d6: ifne 124
// 0d9: goto 0e6
// 0dc: ldc2_w -6384149815385742278
// 0df: lload 1
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: ifeq 175
// 0e9: goto 0f6
// 0ec: ldc2_w -6384149815385742278
// 0ef: lload 1
// 0f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: athrow
// 0f6: lload 17
// 0f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fb: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0fe: aload 30
// 100: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 103: dconst_0
// 104: ldc2_w 0.4375
// 107: dconst_0
// 108: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 10b: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 10e: lload 17
// 110: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 113: invokevirtual net/minecraft/class_746.method_55754 ()D
// 116: dcmpg
// 117: goto 124
// 11a: ldc2_w -6384149815385742278
// 11d: lload 1
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: iload 21
// 126: lload 1
// 127: lconst_0
// 128: lcmp
// 129: ifle 15e
// 12c: ifne 15c
// 12f: ifge 175
// 132: goto 13f
// 135: ldc2_w -6384149815385742278
// 138: lload 1
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: lload 11
// 141: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 144: aload 30
// 146: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 149: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 14c: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 14f: goto 15c
// 152: ldc2_w -6384149815385742278
// 155: lload 1
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: iload 21
// 15e: ifne 172
// 161: ifeq 175
// 164: goto 171
// 167: ldc2_w -6384149815385742278
// 16a: lload 1
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: bipush 1
// 172: goto 176
// 175: bipush 0
// 176: ifeq 07e
// 179: aload 26
// 17b: aload 29
// 17d: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 182: pop
// 183: iload 21
// 185: ifeq 07e
// 188: aload 26
// 18a: checkcast java/util/List
// 18d: nop
// 18e: checkcast java/lang/Iterable
// 191: astore 23
// 193: nop
// 194: bipush 0
// 195: istore 24
// 197: aload 23
// 199: astore 25
// 19b: new java/util/ArrayList
// 19e: dup
// 19f: aload 23
// 1a1: sipush 32108
// 1a4: ldc2_w 8184777610109461619
// 1a7: lload 1
// 1a8: lxor
// 1a9: invokedynamic j (IJ)I bsm=su/catlean/e0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 1b1: invokespecial java/util/ArrayList.<init> (I)V
// 1b4: checkcast java/util/Collection
// 1b7: astore 26
// 1b9: lload 1
// 1ba: lconst_0
// 1bb: lcmp
// 1bc: ifle 1c2
// 1bf: bipush 0
// 1c0: istore 27
// 1c2: aload 25
// 1c4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1c9: astore 28
// 1cb: aload 28
// 1cd: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1d2: ifeq 232
// 1d5: aload 28
// 1d7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1dc: astore 29
// 1de: aload 26
// 1e0: aload 29
// 1e2: checkcast net/minecraft/class_2338
// 1e5: astore 30
// 1e7: lload 1
// 1e8: lconst_0
// 1e9: lcmp
// 1ea: iflt 243
// 1ed: astore 33
// 1ef: bipush 0
// 1f0: istore 31
// 1f2: new net/minecraft/class_3965
// 1f5: dup
// 1f6: aload 30
// 1f8: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 1fb: dconst_0
// 1fc: ldc2_w 0.4375
// 1ff: dconst_0
// 200: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 203: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 206: aload 30
// 208: bipush 0
// 209: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 20c: aload 33
// 20e: swap
// 20f: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 214: pop
// 215: iload 21
// 217: ifne 241
// 21a: iload 21
// 21c: ifeq 1cb
// 21f: lload 1
// 220: lconst_0
// 221: lcmp
// 222: iflt 215
// 225: goto 232
// 228: ldc2_w -6384149815385742278
// 22b: lload 1
// 22c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: athrow
// 232: aload 26
// 234: checkcast java/util/List
// 237: nop
// 238: checkcast java/lang/Iterable
// 23b: astore 23
// 23d: nop
// 23e: bipush 0
// 23f: istore 24
// 241: aload 23
// 243: new su/catlean/xf
// 246: dup
// 247: invokespecial su/catlean/xf.<init> ()V
// 24a: checkcast java/util/Comparator
// 24d: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 250: astore 22
// 252: aload 0
// 253: lload 5
// 255: invokespecial su/catlean/e0.i (J)Ljava/util/List;
// 258: astore 23
// 25a: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 25d: aload 23
// 25f: invokedynamic b (Ljava/util/List;)Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/e0.W (Ljava/util/List;Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 264: lload 15
// 266: dup2_x1
// 267: pop2
// 268: aload 0
// 269: lload 19
// 26b: invokespecial su/catlean/e0.l (J)Lsu/catlean/f9;
// 26e: invokevirtual su/catlean/gg.X (JLsu/catlean/n5;Lsu/catlean/f9;)Lsu/catlean/fg;
// 271: astore 24
// 273: aload 22
// 275: invokeinterface java/util/List.isEmpty ()Z 1
// 27a: iload 21
// 27c: ifne 2c4
// 27f: ifne 2b6
// 282: goto 28f
// 285: ldc2_w -6384149815385742278
// 288: lload 1
// 289: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28e: athrow
// 28f: aload 24
// 291: iload 21
// 293: ifne 2ca
// 296: goto 2a3
// 299: ldc2_w -6384149815385742278
// 29c: lload 1
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: invokevirtual su/catlean/fg.R ()Z
// 2a6: ifne 2c5
// 2a9: goto 2b6
// 2ac: ldc2_w -6384149815385742278
// 2af: lload 1
// 2b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b5: athrow
// 2b6: bipush 0
// 2b7: goto 2c4
// 2ba: ldc2_w -6384149815385742278
// 2bd: lload 1
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: ireturn
// 2c5: aload 22
// 2c7: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 2ca: checkcast net/minecraft/class_3965
// 2cd: astore 25
// 2cf: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 2d2: new su/catlean/tu
// 2d5: dup
// 2d6: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 2d9: aload 25
// 2db: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 2de: dup
// 2df: sipush 21232
// 2e2: ldc2_w 771584392228688611
// 2e5: lload 1
// 2e6: lxor
// 2e7: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ec: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2ef: lload 9
// 2f1: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 2f4: lload 3
// 2f5: bipush 0
// 2f6: aload 24
// 2f8: aload 25
// 2fa: invokedynamic invoke (Lsu/catlean/fg;Lnet/minecraft/class_3965;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/e0.G (Lsu/catlean/fg;Lnet/minecraft/class_3965;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 2ff: bipush 2
// 300: aconst_null
// 301: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 304: checkcast su/catlean/t5
// 307: lload 7
// 309: dup2_x1
// 30a: pop2
// 30b: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 30e: bipush 1
// 30f: ireturn
}

private final boolean Q(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e0.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 78809723154480
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 27065440803329
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 89842763101930
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 57530015944526
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 83003027912128
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 39976825196060
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 59673437221353
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 70972870366191
// 03b: lxor
// 03c: lstore 17
// 03e: pop2
// 03f: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 042: lload 11
// 044: invokevirtual su/catlean/gw.c (J)Ljava/util/List;
// 047: checkcast java/lang/Iterable
// 04a: astore 21
// 04c: nop
// 04d: ldc2_w -2064973850728030392
// 050: lload 1
// 051: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: bipush 0
// 057: istore 22
// 059: aload 21
// 05b: astore 23
// 05d: new java/util/ArrayList
// 060: dup
// 061: invokespecial java/util/ArrayList.<init> ()V
// 064: checkcast java/util/Collection
// 067: astore 24
// 069: bipush 0
// 06a: istore 25
// 06c: aload 23
// 06e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 073: astore 26
// 075: istore 19
// 077: aload 26
// 079: invokeinterface java/util/Iterator.hasNext ()Z 1
// 07e: ifeq 181
// 081: aload 26
// 083: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 088: astore 27
// 08a: aload 27
// 08c: checkcast net/minecraft/class_2338
// 08f: astore 28
// 091: bipush 0
// 092: istore 29
// 094: lload 9
// 096: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 099: aload 28
// 09b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 09e: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0a1: dup
// 0a2: sipush 10278
// 0a5: ldc2_w 6717496652520451201
// 0a8: lload 1
// 0a9: lxor
// 0aa: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b2: astore 30
// 0b4: lload 1
// 0b5: lconst_0
// 0b6: lcmp
// 0b7: ifle 1bb
// 0ba: aload 30
// 0bc: getstatic net/minecraft/class_2246.field_10114 Lnet/minecraft/class_2248;
// 0bf: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c2: iload 19
// 0c4: ifne 1b9
// 0c7: iload 19
// 0c9: lload 1
// 0ca: lconst_0
// 0cb: lcmp
// 0cc: ifle 11f
// 0cf: ifne 11d
// 0d2: goto 0df
// 0d5: ldc2_w -2027506121513181056
// 0d8: lload 1
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: ifeq 16e
// 0e2: goto 0ef
// 0e5: ldc2_w -2027506121513181056
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: lload 15
// 0f1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f4: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 0f7: aload 28
// 0f9: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0fc: dconst_0
// 0fd: ldc2_w 0.5
// 100: dconst_0
// 101: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 104: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 107: lload 15
// 109: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10c: invokevirtual net/minecraft/class_746.method_55754 ()D
// 10f: dcmpg
// 110: goto 11d
// 113: ldc2_w -2027506121513181056
// 116: lload 1
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: iload 19
// 11f: lload 1
// 120: lconst_0
// 121: lcmp
// 122: iflt 157
// 125: ifne 155
// 128: ifge 16e
// 12b: goto 138
// 12e: ldc2_w -2027506121513181056
// 131: lload 1
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: lload 9
// 13a: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 13d: aload 28
// 13f: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 142: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 145: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 148: goto 155
// 14b: ldc2_w -2027506121513181056
// 14e: lload 1
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: iload 19
// 157: ifne 16b
// 15a: ifeq 16e
// 15d: goto 16a
// 160: ldc2_w -2027506121513181056
// 163: lload 1
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: bipush 1
// 16b: goto 16f
// 16e: bipush 0
// 16f: ifeq 077
// 172: aload 24
// 174: aload 27
// 176: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 17b: pop
// 17c: iload 19
// 17e: ifeq 077
// 181: aload 24
// 183: checkcast java/util/List
// 186: nop
// 187: checkcast java/lang/Iterable
// 18a: astore 21
// 18c: nop
// 18d: bipush 0
// 18e: istore 22
// 190: aload 21
// 192: astore 23
// 194: new java/util/ArrayList
// 197: dup
// 198: aload 21
// 19a: sipush 32108
// 19d: ldc2_w 8184733370776641737
// 1a0: lload 1
// 1a1: lxor
// 1a2: invokedynamic j (IJ)I bsm=su/catlean/e0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 1aa: invokespecial java/util/ArrayList.<init> (I)V
// 1ad: checkcast java/util/Collection
// 1b0: astore 24
// 1b2: lload 1
// 1b3: lconst_0
// 1b4: lcmp
// 1b5: iflt 1bb
// 1b8: bipush 0
// 1b9: istore 25
// 1bb: aload 23
// 1bd: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1c2: astore 26
// 1c4: aload 26
// 1c6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1cb: ifeq 22b
// 1ce: aload 26
// 1d0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d5: astore 27
// 1d7: aload 24
// 1d9: aload 27
// 1db: checkcast net/minecraft/class_2338
// 1de: astore 28
// 1e0: lload 1
// 1e1: lconst_0
// 1e2: lcmp
// 1e3: ifle 23c
// 1e6: astore 31
// 1e8: bipush 0
// 1e9: istore 29
// 1eb: new net/minecraft/class_3965
// 1ee: dup
// 1ef: aload 28
// 1f1: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 1f4: dconst_0
// 1f5: ldc2_w 0.5
// 1f8: dconst_0
// 1f9: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 1fc: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 1ff: aload 28
// 201: bipush 0
// 202: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 205: aload 31
// 207: swap
// 208: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 20d: pop
// 20e: iload 19
// 210: ifne 23a
// 213: iload 19
// 215: ifeq 1c4
// 218: lload 1
// 219: lconst_0
// 21a: lcmp
// 21b: iflt 20e
// 21e: goto 22b
// 221: ldc2_w -2027506121513181056
// 224: lload 1
// 225: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22a: athrow
// 22b: aload 24
// 22d: checkcast java/util/List
// 230: nop
// 231: checkcast java/lang/Iterable
// 234: astore 21
// 236: nop
// 237: bipush 0
// 238: istore 22
// 23a: aload 21
// 23c: new su/catlean/_t
// 23f: dup
// 240: invokespecial su/catlean/_t.<init> ()V
// 243: checkcast java/util/Comparator
// 246: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 249: astore 20
// 24b: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 24e: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/e0.X (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 253: lload 13
// 255: dup2_x1
// 256: pop2
// 257: aload 0
// 258: lload 17
// 25a: invokespecial su/catlean/e0.l (J)Lsu/catlean/f9;
// 25d: invokevirtual su/catlean/gg.X (JLsu/catlean/n5;Lsu/catlean/f9;)Lsu/catlean/fg;
// 260: astore 21
// 262: aload 20
// 264: invokeinterface java/util/List.isEmpty ()Z 1
// 269: iload 19
// 26b: ifne 2b3
// 26e: ifne 2a5
// 271: goto 27e
// 274: ldc2_w -2027506121513181056
// 277: lload 1
// 278: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27d: athrow
// 27e: aload 21
// 280: iload 19
// 282: ifne 2b9
// 285: goto 292
// 288: ldc2_w -2027506121513181056
// 28b: lload 1
// 28c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: athrow
// 292: invokevirtual su/catlean/fg.R ()Z
// 295: ifne 2b4
// 298: goto 2a5
// 29b: ldc2_w -2027506121513181056
// 29e: lload 1
// 29f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a4: athrow
// 2a5: bipush 0
// 2a6: goto 2b3
// 2a9: ldc2_w -2027506121513181056
// 2ac: lload 1
// 2ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b2: athrow
// 2b3: ireturn
// 2b4: aload 20
// 2b6: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 2b9: checkcast net/minecraft/class_3965
// 2bc: astore 22
// 2be: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 2c1: new su/catlean/tu
// 2c4: dup
// 2c5: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 2c8: aload 22
// 2ca: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 2cd: dup
// 2ce: sipush 12142
// 2d1: ldc2_w 5710523473787612132
// 2d4: lload 1
// 2d5: lxor
// 2d6: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2de: lload 7
// 2e0: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 2e3: lload 3
// 2e4: bipush 0
// 2e5: aload 21
// 2e7: aload 22
// 2e9: invokedynamic invoke (Lsu/catlean/fg;Lnet/minecraft/class_3965;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/e0.P (Lsu/catlean/fg;Lnet/minecraft/class_3965;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 2ee: bipush 2
// 2ef: aconst_null
// 2f0: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 2f3: checkcast su/catlean/t5
// 2f6: lload 5
// 2f8: dup2_x1
// 2f9: pop2
// 2fa: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 2fd: bipush 1
// 2fe: ireturn
}

private final boolean M(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e0.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 60330861492019
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 116471592180994
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 36033364636137
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 76009348450381
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 63832540230339
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 93631804066079
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 78298329380586
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 54971934889196
// 03b: lxor
// 03c: lstore 17
// 03e: pop2
// 03f: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 042: lload 11
// 044: invokevirtual su/catlean/gw.c (J)Ljava/util/List;
// 047: checkcast java/lang/Iterable
// 04a: astore 21
// 04c: nop
// 04d: ldc2_w 2630505577324316556
// 050: lload 1
// 051: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 056: bipush 0
// 057: istore 22
// 059: aload 21
// 05b: astore 23
// 05d: new java/util/ArrayList
// 060: dup
// 061: invokespecial java/util/ArrayList.<init> ()V
// 064: checkcast java/util/Collection
// 067: astore 24
// 069: istore 19
// 06b: bipush 0
// 06c: istore 25
// 06e: aload 23
// 070: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 075: astore 26
// 077: aload 26
// 079: invokeinterface java/util/Iterator.hasNext ()Z 1
// 07e: ifeq 36e
// 081: aload 26
// 083: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 088: astore 27
// 08a: aload 27
// 08c: checkcast net/minecraft/class_2338
// 08f: astore 28
// 091: bipush 0
// 092: istore 29
// 094: lload 9
// 096: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 099: aload 28
// 09b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 09e: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0a1: dup
// 0a2: sipush 10278
// 0a5: ldc2_w 6717443126455675778
// 0a8: lload 1
// 0a9: lxor
// 0aa: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0b2: astore 30
// 0b4: lload 1
// 0b5: lconst_0
// 0b6: lcmp
// 0b7: iflt 3a8
// 0ba: aload 30
// 0bc: getstatic net/minecraft/class_2246.field_10102 Lnet/minecraft/class_2248;
// 0bf: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0c2: iload 19
// 0c4: ifeq 3a6
// 0c7: iload 19
// 0c9: lload 1
// 0ca: lconst_0
// 0cb: lcmp
// 0cc: ifle 106
// 0cf: ifeq 104
// 0d2: goto 0df
// 0d5: ldc2_w 2657027706987358083
// 0d8: lload 1
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: ifne 161
// 0e2: goto 0ef
// 0e5: ldc2_w 2657027706987358083
// 0e8: lload 1
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: aload 30
// 0f1: getstatic net/minecraft/class_2246.field_10566 Lnet/minecraft/class_2248;
// 0f4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f7: goto 104
// 0fa: ldc2_w 2657027706987358083
// 0fd: lload 1
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: iload 19
// 106: lload 1
// 107: lconst_0
// 108: lcmp
// 109: iflt 136
// 10c: ifeq 134
// 10f: ifne 161
// 112: goto 11f
// 115: ldc2_w 2657027706987358083
// 118: lload 1
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: aload 30
// 121: getstatic net/minecraft/class_2246.field_10219 Lnet/minecraft/class_2248;
// 124: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 127: goto 134
// 12a: ldc2_w 2657027706987358083
// 12d: lload 1
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: iload 19
// 136: ifeq 15e
// 139: ifne 161
// 13c: goto 149
// 13f: ldc2_w 2657027706987358083
// 142: lload 1
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: aload 30
// 14b: getstatic net/minecraft/class_2246.field_10534 Lnet/minecraft/class_2248;
// 14e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 151: goto 15e
// 154: ldc2_w 2657027706987358083
// 157: lload 1
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: ifeq 35b
// 161: getstatic su/catlean/z1.A Lkotlin/enums/EnumEntries;
// 164: checkcast java/lang/Iterable
// 167: astore 31
// 169: bipush 0
// 16a: istore 32
// 16c: aload 31
// 16e: astore 33
// 170: new java/util/ArrayList
// 173: dup
// 174: invokespecial java/util/ArrayList.<init> ()V
// 177: checkcast java/util/Collection
// 17a: astore 34
// 17c: bipush 0
// 17d: istore 35
// 17f: aload 33
// 181: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 186: astore 36
// 188: aload 36
// 18a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 18f: ifeq 213
// 192: aload 36
// 194: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 199: astore 37
// 19b: aload 37
// 19d: checkcast net/minecraft/class_2350
// 1a0: astore 38
// 1a2: bipush 0
// 1a3: istore 39
// 1a5: lload 1
// 1a6: lconst_0
// 1a7: lcmp
// 1a8: ifle 3c4
// 1ab: aload 38
// 1ad: iload 19
// 1af: ifeq 3c2
// 1b2: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 1b5: lload 1
// 1b6: lconst_0
// 1b7: lcmp
// 1b8: iflt 1ef
// 1bb: iload 19
// 1bd: ifeq 1ef
// 1c0: goto 1cd
// 1c3: ldc2_w 2657027706987358083
// 1c6: lload 1
// 1c7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cc: athrow
// 1cd: if_acmpeq 200
// 1d0: goto 1dd
// 1d3: ldc2_w 2657027706987358083
// 1d6: lload 1
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: aload 38
// 1df: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 1e2: goto 1ef
// 1e5: ldc2_w 2657027706987358083
// 1e8: lload 1
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: if_acmpeq 200
// 1f2: bipush 1
// 1f3: goto 201
// 1f6: ldc2_w 2657027706987358083
// 1f9: lload 1
// 1fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ff: athrow
// 200: bipush 0
// 201: ifeq 188
// 204: aload 34
// 206: aload 37
// 208: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 20d: pop
// 20e: iload 19
// 210: ifne 188
// 213: aload 34
// 215: checkcast java/util/List
// 218: nop
// 219: checkcast java/lang/Iterable
// 21c: astore 31
// 21e: nop
// 21f: bipush 0
// 220: lload 1
// 221: lconst_0
// 222: lcmp
// 223: iflt 238
// 226: istore 32
// 228: aload 31
// 22a: lload 1
// 22b: lconst_0
// 22c: lcmp
// 22d: ifle 199
// 230: iload 19
// 232: ifeq 284
// 235: instanceof java/util/Collection
// 238: ifeq 282
// 23b: goto 248
// 23e: ldc2_w 2657027706987358083
// 241: lload 1
// 242: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 247: athrow
// 248: aload 31
// 24a: checkcast java/util/Collection
// 24d: iload 19
// 24f: ifeq 284
// 252: goto 25f
// 255: ldc2_w 2657027706987358083
// 258: lload 1
// 259: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25e: athrow
// 25f: invokeinterface java/util/Collection.isEmpty ()Z 1
// 264: ifeq 282
// 267: goto 274
// 26a: ldc2_w 2657027706987358083
// 26d: lload 1
// 26e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 273: athrow
// 274: bipush 0
// 275: goto 2d3
// 278: ldc2_w 2657027706987358083
// 27b: lload 1
// 27c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 281: athrow
// 282: aload 31
// 284: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 289: astore 33
// 28b: aload 33
// 28d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 292: ifeq 2d2
// 295: aload 33
// 297: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 29c: astore 34
// 29e: aload 34
// 2a0: checkcast net/minecraft/class_2350
// 2a3: astore 35
// 2a5: bipush 0
// 2a6: istore 36
// 2a8: lload 9
// 2aa: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2ad: aload 28
// 2af: aload 35
// 2b1: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
// 2b4: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 2b7: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 2ba: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
// 2bd: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 2c0: ifeq 28b
// 2c3: bipush 1
// 2c4: lload 1
// 2c5: lconst_0
// 2c6: lcmp
// 2c7: iflt 2c0
// 2ca: iload 19
// 2cc: ifeq 2c0
// 2cf: goto 2d3
// 2d2: bipush 0
// 2d3: lload 1
// 2d4: lconst_0
// 2d5: lcmp
// 2d6: ifle 2fd
// 2d9: ifeq 35b
// 2dc: lload 15
// 2de: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e1: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 2e4: aload 28
// 2e6: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 2e9: dconst_0
// 2ea: ldc2_w 0.5
// 2ed: dconst_0
// 2ee: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 2f1: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 2f4: lload 15
// 2f6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2f9: invokevirtual net/minecraft/class_746.method_55754 ()D
// 2fc: dcmpg
// 2fd: iload 19
// 2ff: lload 1
// 300: lconst_0
// 301: lcmp
// 302: iflt 344
// 305: ifeq 342
// 308: goto 315
// 30b: ldc2_w 2657027706987358083
// 30e: lload 1
// 30f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 314: athrow
// 315: ifge 35b
// 318: goto 325
// 31b: ldc2_w 2657027706987358083
// 31e: lload 1
// 31f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 324: athrow
// 325: lload 9
// 327: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 32a: aload 28
// 32c: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 32f: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 332: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 335: goto 342
// 338: ldc2_w 2657027706987358083
// 33b: lload 1
// 33c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 341: athrow
// 342: iload 19
// 344: ifeq 358
// 347: ifeq 35b
// 34a: goto 357
// 34d: ldc2_w 2657027706987358083
// 350: lload 1
// 351: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 356: athrow
// 357: bipush 1
// 358: goto 35c
// 35b: bipush 0
// 35c: ifeq 077
// 35f: aload 24
// 361: aload 27
// 363: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 368: pop
// 369: iload 19
// 36b: ifne 077
// 36e: aload 24
// 370: checkcast java/util/List
// 373: nop
// 374: checkcast java/lang/Iterable
// 377: astore 21
// 379: nop
// 37a: bipush 0
// 37b: istore 22
// 37d: aload 21
// 37f: astore 23
// 381: new java/util/ArrayList
// 384: dup
// 385: aload 21
// 387: sipush 32108
// 38a: ldc2_w 8184855616182921162
// 38d: lload 1
// 38e: lxor
// 38f: invokedynamic j (IJ)I bsm=su/catlean/e0.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 394: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 397: invokespecial java/util/ArrayList.<init> (I)V
// 39a: checkcast java/util/Collection
// 39d: astore 24
// 39f: lload 1
// 3a0: lconst_0
// 3a1: lcmp
// 3a2: ifle 3a8
// 3a5: bipush 0
// 3a6: istore 25
// 3a8: aload 23
// 3aa: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 3af: astore 26
// 3b1: aload 26
// 3b3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3b8: ifeq 418
// 3bb: aload 26
// 3bd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3c2: astore 27
// 3c4: aload 24
// 3c6: aload 27
// 3c8: checkcast net/minecraft/class_2338
// 3cb: astore 28
// 3cd: lload 1
// 3ce: lconst_0
// 3cf: lcmp
// 3d0: ifle 429
// 3d3: astore 40
// 3d5: bipush 0
// 3d6: istore 29
// 3d8: new net/minecraft/class_3965
// 3db: dup
// 3dc: aload 28
// 3de: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 3e1: dconst_0
// 3e2: ldc2_w 0.5
// 3e5: dconst_0
// 3e6: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 3e9: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 3ec: aload 28
// 3ee: bipush 0
// 3ef: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
// 3f2: aload 40
// 3f4: swap
// 3f5: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 3fa: pop
// 3fb: iload 19
// 3fd: ifeq 427
// 400: iload 19
// 402: ifne 3b1
// 405: lload 1
// 406: lconst_0
// 407: lcmp
// 408: iflt 3fb
// 40b: goto 418
// 40e: ldc2_w 2657027706987358083
// 411: lload 1
// 412: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 417: athrow
// 418: aload 24
// 41a: checkcast java/util/List
// 41d: nop
// 41e: checkcast java/lang/Iterable
// 421: astore 21
// 423: nop
// 424: bipush 0
// 425: istore 22
// 427: aload 21
// 429: new su/catlean/w6
// 42c: dup
// 42d: invokespecial su/catlean/w6.<init> ()V
// 430: checkcast java/util/Comparator
// 433: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 436: astore 20
// 438: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 43b: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/e0.r (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 440: lload 13
// 442: dup2_x1
// 443: pop2
// 444: aload 0
// 445: lload 17
// 447: invokespecial su/catlean/e0.l (J)Lsu/catlean/f9;
// 44a: invokevirtual su/catlean/gg.X (JLsu/catlean/n5;Lsu/catlean/f9;)Lsu/catlean/fg;
// 44d: astore 21
// 44f: aload 20
// 451: invokeinterface java/util/List.isEmpty ()Z 1
// 456: iload 19
// 458: ifeq 4a0
// 45b: ifne 492
// 45e: goto 46b
// 461: ldc2_w 2657027706987358083
// 464: lload 1
// 465: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46a: athrow
// 46b: aload 21
// 46d: iload 19
// 46f: ifeq 4a6
// 472: goto 47f
// 475: ldc2_w 2657027706987358083
// 478: lload 1
// 479: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47e: athrow
// 47f: invokevirtual su/catlean/fg.R ()Z
// 482: ifne 4a1
// 485: goto 492
// 488: ldc2_w 2657027706987358083
// 48b: lload 1
// 48c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 491: athrow
// 492: bipush 0
// 493: goto 4a0
// 496: ldc2_w 2657027706987358083
// 499: lload 1
// 49a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49f: athrow
// 4a0: ireturn
// 4a1: aload 20
// 4a3: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 4a6: checkcast net/minecraft/class_3965
// 4a9: astore 22
// 4ab: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 4ae: new su/catlean/tu
// 4b1: dup
// 4b2: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 4b5: aload 22
// 4b7: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
// 4ba: dup
// 4bb: sipush 12142
// 4be: ldc2_w 5710471605851729127
// 4c1: lload 1
// 4c2: lxor
// 4c3: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4cb: lload 7
// 4cd: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 4d0: lload 3
// 4d1: bipush 0
// 4d2: aload 21
// 4d4: aload 22
// 4d6: invokedynamic invoke (Lsu/catlean/fg;Lnet/minecraft/class_3965;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/e0.H (Lsu/catlean/fg;Lnet/minecraft/class_3965;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 4db: bipush 2
// 4dc: aconst_null
// 4dd: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 4e0: checkcast su/catlean/t5
// 4e3: lload 5
// 4e5: dup2_x1
// 4e6: pop2
// 4e7: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 4ea: bipush 1
// 4eb: ireturn
}

private final List i(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/e0.c J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 112128863685439
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 58991219051942
// 011: lxor
// 012: dup2
// 013: bipush 16
// 015: lushr
// 016: lstore 5
// 018: dup2
// 019: bipush 48
// 01b: lshl
// 01c: bipush 48
// 01e: lushr
// 01f: l2i
// 020: istore 7
// 022: pop2
// 023: dup2
// 024: ldc2_w 93332423097746
// 027: lxor
// 028: lstore 8
// 02a: dup2
// 02b: ldc2_w 32674931002917
// 02e: lxor
// 02f: lstore 10
// 031: dup2
// 032: ldc2_w 135673285052734
// 035: lxor
// 036: dup2
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 12
// 03d: dup2
// 03e: bipush 32
// 040: lshl
// 041: bipush 48
// 043: lushr
// 044: l2i
// 045: istore 13
// 047: dup2
// 048: bipush 48
// 04a: lshl
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 14
// 051: pop2
// 052: dup2
// 053: ldc2_w 139026680711323
// 056: lxor
// 057: lstore 15
// 059: pop2
// 05a: ldc2_w 1767815859739452567
// 05d: lload 1
// 05e: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: new java/util/ArrayList
// 066: dup
// 067: invokespecial java/util/ArrayList.<init> ()V
// 06a: checkcast java/util/List
// 06d: astore 18
// 06f: istore 17
// 071: aload 0
// 072: iload 12
// 074: iload 13
// 076: iload 14
// 078: i2c
// 079: invokespecial su/catlean/e0.L (IIC)Z
// 07c: iload 17
// 07e: ifne 0c0
// 081: ifeq 0ba
// 084: goto 091
// 087: ldc2_w 1730490556036291423
// 08a: lload 1
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: aload 18
// 093: getstatic net/minecraft/class_1802.field_8317 Lnet/minecraft/class_1792;
// 096: dup
// 097: sipush 4819
// 09a: ldc2_w 4939988111117331884
// 09d: lload 1
// 09e: lxor
// 09f: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0ac: pop
// 0ad: goto 0ba
// 0b0: ldc2_w 1730490556036291423
// 0b3: lload 1
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: aload 0
// 0bb: lload 10
// 0bd: invokespecial su/catlean/e0.r (J)Z
// 0c0: iload 17
// 0c2: lload 1
// 0c3: lconst_0
// 0c4: lcmp
// 0c5: ifle 10c
// 0c8: ifne 10a
// 0cb: ifeq 104
// 0ce: goto 0db
// 0d1: ldc2_w 1730490556036291423
// 0d4: lload 1
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: aload 18
// 0dd: getstatic net/minecraft/class_1802.field_8179 Lnet/minecraft/class_1792;
// 0e0: dup
// 0e1: sipush 22002
// 0e4: ldc2_w 8513447832759495321
// 0e7: lload 1
// 0e8: lxor
// 0e9: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 0f6: pop
// 0f7: goto 104
// 0fa: ldc2_w 1730490556036291423
// 0fd: lload 1
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: aload 0
// 105: lload 15
// 107: invokespecial su/catlean/e0.I (J)Z
// 10a: iload 17
// 10c: lload 1
// 10d: lconst_0
// 10e: lcmp
// 10f: iflt 159
// 112: ifne 157
// 115: ifeq 14e
// 118: goto 125
// 11b: ldc2_w 1730490556036291423
// 11e: lload 1
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: aload 18
// 127: getstatic net/minecraft/class_1802.field_8567 Lnet/minecraft/class_1792;
// 12a: dup
// 12b: sipush 10968
// 12e: ldc2_w 8483325834098906499
// 131: lload 1
// 132: lxor
// 133: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 13b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 140: pop
// 141: goto 14e
// 144: ldc2_w 1730490556036291423
// 147: lload 1
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: aload 0
// 14f: lload 5
// 151: iload 7
// 153: i2c
// 154: invokespecial su/catlean/e0.n (JC)Z
// 157: iload 17
// 159: lload 1
// 15a: lconst_0
// 15b: lcmp
// 15c: iflt 1a2
// 15f: ifne 1a0
// 162: ifeq 19b
// 165: goto 172
// 168: ldc2_w 1730490556036291423
// 16b: lload 1
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: aload 18
// 174: getstatic net/minecraft/class_1802.field_46249 Lnet/minecraft/class_1792;
// 177: dup
// 178: sipush 21243
// 17b: ldc2_w 5360939430528445835
// 17e: lload 1
// 17f: lxor
// 180: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 185: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 188: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 18d: pop
// 18e: goto 19b
// 191: ldc2_w 1730490556036291423
// 194: lload 1
// 195: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: athrow
// 19b: aload 0
// 19c: lload 3
// 19d: invokespecial su/catlean/e0.K (J)Z
// 1a0: iload 17
// 1a2: lload 1
// 1a3: lconst_0
// 1a4: lcmp
// 1a5: ifle 1ec
// 1a8: ifne 1ea
// 1ab: ifeq 1e4
// 1ae: goto 1bb
// 1b1: ldc2_w 1730490556036291423
// 1b4: lload 1
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: aload 18
// 1bd: getstatic net/minecraft/class_1802.field_46250 Lnet/minecraft/class_1792;
// 1c0: dup
// 1c1: sipush 9438
// 1c4: ldc2_w 5478408997509143428
// 1c7: lload 1
// 1c8: lxor
// 1c9: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1d1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1d6: pop
// 1d7: goto 1e4
// 1da: ldc2_w 1730490556036291423
// 1dd: lload 1
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: aload 0
// 1e5: lload 8
// 1e7: invokespecial su/catlean/e0.D (J)Z
// 1ea: iload 17
// 1ec: ifne 227
// 1ef: ifeq 228
// 1f2: goto 1ff
// 1f5: ldc2_w 1730490556036291423
// 1f8: lload 1
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: aload 18
// 201: getstatic net/minecraft/class_1802.field_8309 Lnet/minecraft/class_1792;
// 204: dup
// 205: sipush 7605
// 208: ldc2_w 5269324860410307270
// 20b: lload 1
// 20c: lxor
// 20d: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/e0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 215: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 21a: goto 227
// 21d: ldc2_w 1730490556036291423
// 220: lload 1
// 221: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 226: athrow
// 227: pop
// 228: aload 18
// 22a: areturn
}

private static final boolean W(List var0, class_1799 var1) {
long var2 = c ^ 90948727503794L;
Intrinsics.checkNotNullParameter(var1, b<"e">(22785, 1484792199076405879L ^ var2));
return var0.contains(var1.method_7909());
}

private static final Unit B(class_3965 var0) {
long var1 = c ^ 97900028255137L;
int var3 = (int)((var1 ^ 92031740976908L) >>> 32);
long var4 = (var1 ^ 92031740976908L) << 32 >>> 32;
long var6 = var1 ^ 85962134482435L;
zf.Z(var3, var4).method_2896(zf.v(var6), class_1268.field_5808, var0);
zf.v(var6).method_6104(class_1268.field_5808);
return Unit.INSTANCE;
}

private static final Unit G(fg var0, class_3965 var1) {
long var2 = c ^ 120352802381533L;
long var4 = var2 ^ 14010604258457L;
long var6 = var2 ^ 13847152855417L;
gg.P.T(var4, var0.a(), Y.l(var6), e0::B);
return Unit.INSTANCE;
}

private static final boolean X(class_1799 var0) {
long var1 = c ^ 138386739679771L;
Intrinsics.checkNotNullParameter(var0, b<"e">(22785, 1484822044915125214L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_8790);
}

private static final Unit f(class_3965 var0) {
long var1 = c ^ 85696644918644L;
int var3 = (int)((var1 ^ 78379416480217L) >>> 32);
long var4 = (var1 ^ 78379416480217L) << 32 >>> 32;
long var6 = var1 ^ 99868458686678L;
zf.Z(var3, var4).method_2896(zf.v(var6), class_1268.field_5808, var0);
zf.v(var6).method_6104(class_1268.field_5808);
return Unit.INSTANCE;
}

private static final Unit P(fg var0, class_3965 var1) {
long var2 = c ^ 99927567934464L;
long var4 = var2 ^ 65051443543620L;
long var6 = var2 ^ 64939563201444L;
gg.P.T(var4, var0.a(), Y.l(var6), e0::f);
return Unit.INSTANCE;
}

private static final boolean r(class_1799 var0) {
long var1 = c ^ 117652874846520L;
Intrinsics.checkNotNullParameter(var0, b<"e">(10667, 6672300844914018402L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_17531);
}

private static final Unit P(class_3965 var0) {
long var1 = c ^ 2387782559592L;
int var3 = (int)((var1 ^ 9423657149381L) >>> 32);
long var4 = (var1 ^ 9423657149381L) << 32 >>> 32;
long var6 = var1 ^ 23155460231882L;
zf.Z(var3, var4).method_2896(zf.v(var6), class_1268.field_5808, var0);
zf.v(var6).method_6104(class_1268.field_5808);
return Unit.INSTANCE;
}

private static final Unit H(fg var0, class_3965 var1) {
long var2 = c ^ 78694726163802L;
long var4 = var2 ^ 42164770653982L;
long var6 = var2 ^ 42328305355518L;
gg.P.T(var4, var0.a(), Y.l(var6), e0::P);
return Unit.INSTANCE;
}

static {
long var20 = c ^ 93203169786113L;
long var22 = var20 ^ 95005209758152L;
long var10001 = var20 ^ 5619694729565L;
int var24 = (int)((var20 ^ 5619694729565L) >>> 48);
int var25 = (int)((var20 ^ 5619694729565L) << 16 >>> 48);
int var26 = (int)(var10001 << 32 >>> 32);
long var27 = var20 ^ 79766293707334L;
long var29 = var20 ^ 118566353343608L;
long var31 = var20 ^ 75257733388574L;
var10001 = var20 ^ 73530873383980L;
int var33 = (int)((var20 ^ 73530873383980L) >>> 48);
int var34 = (int)((var20 ^ 73530873383980L) << 16 >>> 32);
int var35 = (int)(var10001 << 48 >>> 48);
long var36 = var20 ^ 5566022427562L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[46];
int var16 = 0;
String var15 = "I\u00977°ÿûeÌ\u0002o $-â[\n¼<Þ\u000bR,©d  \u0080=ÑÙ\u0080\b¤ÐJ¢¸çù$.\u007fÇ¿Ï\u0004\u00150±¾áß\u0016ã\u0094\u0093|(\u008f¬ô\u007fûØ.©È6\u0086Í\u0090]\u00ad\u009b<R\u008fßÓ\u0084A\u0003\u0005.\t\u0000\u0005\u0091`\u000eÎË¡\u0013\u0096\u0003Î\f0#È¥\bÞcNéGýpÍ\u0086õ\u0003^\u008a½vÄ|ÁB\u009cêÊ^&ó\u0014µm»ÄÛ\u009bM(Ùé\u008d¥\u008cõ¿9±L\u0010|\rF\u00adålÉSU\u008d\u0096äÉä\u0010S\u0010\u001bs\f¸Ð$\fÝXÛÅcWðÝ{ Ûþ\u0096\u0083\u0096YJ\u0081§\u0006.¤\t[H=U\u0091áÆ¨÷gwÏoü¡0f¿d\u0018\u000fo\u0091f\u001e\u008d\u0086(Q\u0091`åp/¯j³ÆY\u001d¸GE_\u0018\u009fO]æáZª,Á\u001c)\u0080\u009dz@\u008fð»R\u0007!DQ\u0081\u0010R\u0091Ø\tÐ\u0091\u0088±ÕÃgC\u0004\u0012\u000b´\u0010è¢¾·÷¶Äd\u0019\u007f,îôdP\u0004\u0018Ðulg[¹ÿ\u0010¦\u0013¶¯ëÄ\u0090\u000fcOoûß\u009bÀ\u001d æÕ)P`E\bÿú\u0002Îô\u0081¸@;\f\u0081?ÝÐ\u00138ÕÊþ\u009añ\u008ayìt\u0010\n6J©&\u0086\u0001{²\u000e\u0085ñt_v=(\u0011;\u0088Ü~\fÎ3G½zC\u000bª¢¥õV¥\u008eÁQ\u0090cè¥õ\f õ$~¾üp\u009få-42\u00106(Ê\u0017Ù\u009a¡\u0018ÿ#\u0015Mª(X)\u0010ëUË\u0011\u008ao\u0094\u001f²CÂ#¹\u008e+x\u0010\u0093V3ø\u0098db@¤=\u009a\u001eY§oS ·c5yäwsm¬ò\u001fX'±Gm¼ëÚaaX\u0095\u008aæßÇ\u008a`Èn \u0010ü¾\u0094úß\"æ¸\u0007;Á\u0088-¬\t} Ö¿¯]ÌÍ\u0082\u008bÎ_^·HÝ\u0093æx»:W¥c#ão8\u0094U\u0087V#\u0019\u0018Mqa±=ãÀ/à·¯·y\f7ÛT\u00189²\u0097\u0002²\u008f\u0018Ýl¹6\u0010áMwÖ\u0096*v½\u00adj¥i\u0002¾\u009c\u0099HKP ;\u001e\u0019ØÛ\u008c÷%®\u0010È[Áo\u0085ÔÆ\u008d¨\u009aá \u0011\u009eê¼G\u0086Ýçd4\u0018\u009d²ovô\u001cÌj/dc:~atB\u00164\u008cT\u0095ð;ß\u0018jã\u007fÙãÖ\u000bÌËñtf Yü\u008bJ|7âÊ'a\u008a8:fáÙ\u0088©Ö\u0091Q¦ù\u00058´\u0010\u0088\u0094ê\u0084\u0086\u0014\u0011&\u0091v½ç´\u0016uº¨s»ÐïÉ¢²å\u008c\r:KJ©¡\u0001^æNe\u0003¥ft \b\u0010\u0089K\u0018èjÑ\u0099nËR\u008eÜ\u0001\u0018\u0081jÑ>\u000eæxk\u009er(1ê\u0094i\u009f\u0010\"\u0097/¢ÐÕÄªø\u0001\u0017\u001bÜ\nrw\u0010 ®ì\u008f\f±»¦e\u0000ùu¥¬|¢\u0010à\u0090\\ªRðåbË\toÀ ¿?É\u0018Î·\u001e\u0011ÚûZõ5TsT\u0001¦AÆn-\u0010ôKó\u0007ç ×DÜ\u0000¹ywWþäò¹Òi1\u009c\u008dÔ'#ÆÊ\u0086Å~óP@\u001cÌæð ÙD\u00862Âª\u0086\u009f[û,w}³\u009a\u0095\u0003>K¸(\u009cÌL)\u0006v\bØ0L¡ \u000bÞ<ï|\u0096\u0019h\u0084j\fÅ\u0082%\rM¶éU¹Uÿ\t¥áºçÂ¾O\u0085z\u0010\u0016ì²!fµ¨Z#¤®Á\u0081<\u009fc\u0010SSÀÿökwZoë¼FÈ\u009d\u0019«\u0018Bkë\u0014½Ç4ßW(2\u0092Ö=°\u0080÷W\u001eà\u009fÐÊ\u0010\u0018?m @TM\u0087;*\u009b\u001b\u000bÄ]õ\u0097jÿâBØÔ²Y\u0010°K\u0010\u0014ï¶µD\bh\u0004V\u001bà\u0002æ\u0010\u0016]VªÔúhqhås\u0018\u0095\u009f£®\u0010Ó¾\u001b\u008eN°ä\r¥ï¯\u0080é\u009cmÕ\u0010\tÂ\u00adï\\ËT\u0010s\u009aÙÆÞ\u009d\"è \u008fML\u0094\u0002Ò-³óÉ\u0003\u009có [\u000f5&ê\u009fó\u0091èÙ\u0099\u0094º\u0095ú<\u001cM";
int var17 = "I\u00977°ÿûeÌ\u0002o $-â[\n¼<Þ\u000bR,©d  \u0080=ÑÙ\u0080\b¤ÐJ¢¸çù$.\u007fÇ¿Ï\u0004\u00150±¾áß\u0016ã\u0094\u0093|(\u008f¬ô\u007fûØ.©È6\u0086Í\u0090]\u00ad\u009b<R\u008fßÓ\u0084A\u0003\u0005.\t\u0000\u0005\u0091`\u000eÎË¡\u0013\u0096\u0003Î\f0#È¥\bÞcNéGýpÍ\u0086õ\u0003^\u008a½vÄ|ÁB\u009cêÊ^&ó\u0014µm»ÄÛ\u009bM(Ùé\u008d¥\u008cõ¿9±L\u0010|\rF\u00adålÉSU\u008d\u0096äÉä\u0010S\u0010\u001bs\f¸Ð$\fÝXÛÅcWðÝ{ Ûþ\u0096\u0083\u0096YJ\u0081§\u0006.¤\t[H=U\u0091áÆ¨÷gwÏoü¡0f¿d\u0018\u000fo\u0091f\u001e\u008d\u0086(Q\u0091`åp/¯j³ÆY\u001d¸GE_\u0018\u009fO]æáZª,Á\u001c)\u0080\u009dz@\u008fð»R\u0007!DQ\u0081\u0010R\u0091Ø\tÐ\u0091\u0088±ÕÃgC\u0004\u0012\u000b´\u0010è¢¾·÷¶Äd\u0019\u007f,îôdP\u0004\u0018Ðulg[¹ÿ\u0010¦\u0013¶¯ëÄ\u0090\u000fcOoûß\u009bÀ\u001d æÕ)P`E\bÿú\u0002Îô\u0081¸@;\f\u0081?ÝÐ\u00138ÕÊþ\u009añ\u008ayìt\u0010\n6J©&\u0086\u0001{²\u000e\u0085ñt_v=(\u0011;\u0088Ü~\fÎ3G½zC\u000bª¢¥õV¥\u008eÁQ\u0090cè¥õ\f õ$~¾üp\u009få-42\u00106(Ê\u0017Ù\u009a¡\u0018ÿ#\u0015Mª(X)\u0010ëUË\u0011\u008ao\u0094\u001f²CÂ#¹\u008e+x\u0010\u0093V3ø\u0098db@¤=\u009a\u001eY§oS ·c5yäwsm¬ò\u001fX'±Gm¼ëÚaaX\u0095\u008aæßÇ\u008a`Èn \u0010ü¾\u0094úß\"æ¸\u0007;Á\u0088-¬\t} Ö¿¯]ÌÍ\u0082\u008bÎ_^·HÝ\u0093æx»:W¥c#ão8\u0094U\u0087V#\u0019\u0018Mqa±=ãÀ/à·¯·y\f7ÛT\u00189²\u0097\u0002²\u008f\u0018Ýl¹6\u0010áMwÖ\u0096*v½\u00adj¥i\u0002¾\u009c\u0099HKP ;\u001e\u0019ØÛ\u008c÷%®\u0010È[Áo\u0085ÔÆ\u008d¨\u009aá \u0011\u009eê¼G\u0086Ýçd4\u0018\u009d²ovô\u001cÌj/dc:~atB\u00164\u008cT\u0095ð;ß\u0018jã\u007fÙãÖ\u000bÌËñtf Yü\u008bJ|7âÊ'a\u008a8:fáÙ\u0088©Ö\u0091Q¦ù\u00058´\u0010\u0088\u0094ê\u0084\u0086\u0014\u0011&\u0091v½ç´\u0016uº¨s»ÐïÉ¢²å\u008c\r:KJ©¡\u0001^æNe\u0003¥ft \b\u0010\u0089K\u0018èjÑ\u0099nËR\u008eÜ\u0001\u0018\u0081jÑ>\u000eæxk\u009er(1ê\u0094i\u009f\u0010\"\u0097/¢ÐÕÄªø\u0001\u0017\u001bÜ\nrw\u0010 ®ì\u008f\f±»¦e\u0000ùu¥¬|¢\u0010à\u0090\\ªRðåbË\toÀ ¿?É\u0018Î·\u001e\u0011ÚûZõ5TsT\u0001¦AÆn-\u0010ôKó\u0007ç ×DÜ\u0000¹ywWþäò¹Òi1\u009c\u008dÔ'#ÆÊ\u0086Å~óP@\u001cÌæð ÙD\u00862Âª\u0086\u009f[û,w}³\u009a\u0095\u0003>K¸(\u009cÌL)\u0006v\bØ0L¡ \u000bÞ<ï|\u0096\u0019h\u0084j\fÅ\u0082%\rM¶éU¹Uÿ\t¥áºçÂ¾O\u0085z\u0010\u0016ì²!fµ¨Z#¤®Á\u0081<\u009fc\u0010SSÀÿökwZoë¼FÈ\u009d\u0019«\u0018Bkë\u0014½Ç4ßW(2\u0092Ö=°\u0080÷W\u001eà\u009fÐÊ\u0010\u0018?m @TM\u0087;*\u009b\u001b\u000bÄ]õ\u0097jÿâBØÔ²Y\u0010°K\u0010\u0014ï¶µD\bh\u0004V\u001bà\u0002æ\u0010\u0016]VªÔúhqhås\u0018\u0095\u009f£®\u0010Ó¾\u001b\u008eN°ä\r¥ï¯\u0080é\u009cmÕ\u0010\tÂ\u00adï\\ËT\u0010s\u009aÙÆÞ\u009d\"è \u008fML\u0094\u0002Ò-³óÉ\u0003\u009có [\u000f5&ê\u009fó\u0091èÙ\u0099\u0094º\u0095ú<\u001cM"
.length();
char var14 = 24;
int var41 = -1;

label54:
while (true) {
String var42 = var15.substring(++var41, var41 + var14);
byte var47 = -1;

while (true) {
byte[] var19 = var11.doFinal(var42.getBytes("ISO-8859-1"));
String var55 = b(var19).intern();
switch (var47) {
case 0:
var18[var16++] = var55;
if ((var41 += var14) >= var17) {
e = var18;
f = new String[46];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[13];
int var3 = 0;
String var4 = "\u0099´ñ\u008cöb\u001c\u0080\u00adç¹ÜjÚZJ~ü:(«ýÓXc4sÂÉqTóÐø3\u0082Õ\u0013\u0092å¿\u0018ìó\u0082/á(g¶îëõë\u001b`¹ýmCÇnÈuP\u0080\u001cG\u001eÁ\u0015\u0088àBw\u0016Ø ·½~L»ù®e\u0082¾";
int var5 = "\u0099´ñ\u008cöb\u001c\u0080\u00adç¹ÜjÚZJ~ü:(«ýÓXc4sÂÉqTóÐø3\u0082Õ\u0013\u0092å¿\u0018ìó\u0082/á(g¶îëõë\u001b`¹ýmCÇnÈuP\u0080\u001cG\u001eÁ\u0015\u0088àBw\u0016Ø ·½~L»ù®e\u0082¾"
.length();
byte var2 = 0;

label36:
while (true) {
byte var51 = var2;
var2 += 8;
byte[] var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
long[] var45 = var6;
int var52 = var3++;
long var59 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var62 = -1;

while (true) {
long var8 = var59;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var64 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var62) {
case 0:
var45[var52] = var64;
if (var2 >= var5) {
h = var6;
j = new Integer[13];
KProperty[] var38 = new KProperty[c<"j">(24365, 1442960326628409293L ^ var20)];
var38[0] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(9825, 4966309968809648026L ^ var20), b<"e">(7088, 7568225452198158919L ^ var20), 0)
);
var38[1] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(24057, 6204801475451069488L ^ var20), b<"e">(24855, 4422317549795481852L ^ var20), 0)
);
var38[2] = Reflection.property1(
new PropertyReference1Impl(e0.class, b<"e">(19298, 1413123349760815775L ^ var20), b<"e">(26566, 6807101843231612456L ^ var20), 0)
);
var38[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(25956, 6023405150015331468L ^ var20), b<"e">(25004, 8213575008644962389L ^ var20), 0)
);
var38[4] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(27429, 4810304572072432321L ^ var20), b<"e">(27809, 3789255808366515541L ^ var20), 0)
);
var38[5] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(15169, 5611582108077408907L ^ var20), b<"e">(21486, 4731243940406077972L ^ var20), 0)
);
var38[c<"j">(3998, 1104572408232521587L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(20910, 6649674939581376617L ^ var20), b<"e">(410, 3265622864746051702L ^ var20), 0)
);
var38[c<"j">(26423, 4209627629137643472L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(10058, 3388762684452888206L ^ var20), b<"e">(16670, 8997778421194930401L ^ var20), 0)
);
var38[c<"j">(3828, 4774642198935023125L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(13019, 3807223774539598627L ^ var20), b<"e">(22847, 8007696388508262642L ^ var20), 0)
);
var38[c<"j">(27308, 7152418671426652751L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(9126, 6472250441442482794L ^ var20), b<"e">(27100, 7778716747050258452L ^ var20), 0)
);
var38[c<"j">(32108, 8184859145894944131L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(e0.class, b<"e">(13534, 6247142857996193087L ^ var20), b<"e">(14734, 4179683286853861473L ^ var20), 0)
);
a = var38;
Y = new e0((char)var24, (short)var25, var26);
B = yp.L(Y, b<"e">(25004, 7613017583175997520L ^ var20), f9.SILENT_FULL, null, null, c<"j">(16933, 6969475242718978765L ^ var20), null, var36);
D = yp.L(
Y,
b<"e">(21911, 5745805603749866596L ^ var20),
0,
new IntRange(0, c<"j">(32108, 8184859145894944131L ^ var20)),
var29,
null,
null,
c<"j">(18883, 3841156390422079789L ^ var20),
null
);
G = yp.B(Y, b<"e">(16701, 5792369337307150539L ^ var20), (short)var33, w7.BOOLS, null, 4, var34, null, (char)var35);
b = yp.t(Y, b<"e">(21711, 102488206042148136L ^ var20), true, var31, Y.R(var27), null, c<"j">(3828, 4774642198935023125L ^ var20), null);
k = yp.t(Y, b<"e">(9017, 6836241178666162905L ^ var20), true, var31, Y.R(var27), null, c<"j">(3828, 4774642198935023125L ^ var20), null);
A = yp.t(Y, b<"e">(27825, 3364725047632958808L ^ var20), true, var31, Y.R(var27), null, c<"j">(3828, 4774642198935023125L ^ var20), null);
o = yp.t(Y, b<"e">(30820, 8351450737047601542L ^ var20), false, var31, Y.R(var27), null, c<"j">(3828, 4774642198935023125L ^ var20), null);
i = yp.t(Y, b<"e">(19113, 2438557628505895768L ^ var20), false, var31, Y.R(var27), null, c<"j">(3828, 4774642198935023125L ^ var20), null);
d = yp.t(Y, b<"e">(2631, 929153512660169650L ^ var20), false, var31, Y.R(var27), null, c<"j">(3828, 4774642198935023125L ^ var20), null);
K = yp.t(Y, b<"e">(4627, 1230687509252697042L ^ var20), false, var31, Y.R(var27), null, c<"j">(3828, 4774642198935023125L ^ var20), null);
x = yp.t(Y, b<"e">(11064, 4392429509954622154L ^ var20), false, var31, Y.R(var27), null, c<"j">(3828, 4774642198935023125L ^ var20), null);
z = new i9(var22);
return;
}
break;
default:
var45[var52] = var64;
if (var2 < var5) {
continue label36;
}

var4 = "ªØÝv\ra6\u008a\u0092e¦\u009b\u0015Ú\u0099j";
var5 = "ªØÝv\ra6\u008a\u0092e¦\u009b\u0015Ú\u0099j".length();
var2 = 0;
}

byte var53 = var2;
var2 += 8;
var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
var45 = var6;
var52 = var3++;
var59 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var62 = 0;
}
}
}

var14 = var15.charAt(var41);
break;
default:
var18[var16++] = var55;
if ((var41 += var14) < var17) {
var14 = var15.charAt(var41);
continue label54;
}

var15 = "´\u0000´qBm\u0002Ü&¡ÒðëøÅ \u001e£ñÇ~UléÚ^\u0005Ë\u008dÍ7\u0012(çÛ\u0089\u0006=[\u009cõíM\u0011¹:\u00ad¤Ý\u001dÕ-ov\u0084Z6\u00909\u0002lmó\"D\u0087eÉ¶½Uò÷";
var17 = "´\u0000´qBm\u0002Ü&¡ÒðëøÅ \u001e£ñÇ~UléÚ^\u0005Ë\u008dÍ7\u0012(çÛ\u0089\u0006=[\u009cõíM\u0011¹:\u00ad¤Ý\u001dÕ-ov\u0084Z6\u00909\u0002lmó\"D\u0087eÉ¶½Uò÷"
.length();
var14 = ' ';
var41 = -1;
}

var42 = var15.substring(++var41, var41 + var14);
var47 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 9761;
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
throw new RuntimeException("su/catlean/e0", var10);
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
throw new RuntimeException("su/catlean/e0" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 32551;
if (j[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/e0", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
j[var3] = var15;
}

return j[var3];
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
throw new RuntimeException("su/catlean/e0" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
