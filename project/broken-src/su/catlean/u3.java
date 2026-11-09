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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_3965;
import net.minecraft.class_2828.class_2829;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.CollisionEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class u3 extends _g {
@NotNull
public static final u3 N;
static final KProperty[] L;
@NotNull
private static final cw I;
@NotNull
private static final cq T;
@NotNull
private static final cq f;
@NotNull
private static final cq Y;
@NotNull
private static final cq i;
@NotNull
private static final cq P;
@NotNull
private static final cw d;
@NotNull
private static final bg X;
private static final long a = yz.a(-6936183447961913769L, 7191527392490522757L, MethodHandles.lookup().lookupClass()).a(14901899939729L);
private static final String[] b;
private static final String[] c;
private static final Map e = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map j;

private u3(char var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 116546865109373L;
super(b<"o">(7380, 6313091293284417431L ^ var4), jt.V(), null, 4, null, var6);
}

private final wm Q(int var1, int var2, byte var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 29934429191945L;
return (wm)I.E(this, var6, L[0]);
}

private final boolean H(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 122512006718816L;
return (Boolean)T.E(this, var3, L[1]);
}

private final boolean W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 132181257399726L;
return (Boolean)f.E(this, var3, L[2]);
}

private final boolean q(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 109045999539985L;
return (Boolean)Y.E(this, var6, L[3]);
}

private final boolean V(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 94726152412835L;
return (Boolean)i.E(this, var6, L[4]);
}

private final boolean g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 23478728107383L;
return (Boolean)P.E(this, var3, L[5]);
}

private final f9 n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 19667998840640L;
return (f9)d.E(this, var3, L[c<"u">(22327, 5735131414400463071L ^ var1)]);
}

private final void x(int var1, short var2, short var3, f9 var4) {
long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var7 = var5 ^ 121492133013646L;
d.b(this, var7, L[c<"u">(22327, 5735067812707637501L ^ var5)], var4);
}

@Flow
private final void Q(CollisionEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u3.a J
// 003: ldc2_w 48319920301822
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 134085292027803
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 63891278913980
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
// 027: ldc2_w 123193659364851
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 9
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 40
// 038: lushr
// 039: l2i
// 03a: istore 10
// 03c: dup2
// 03d: bipush 56
// 03f: lshl
// 040: bipush 56
// 042: lushr
// 043: l2i
// 044: istore 11
// 046: pop2
// 047: dup2
// 048: ldc2_w 98228645487037
// 04b: lxor
// 04c: lstore 12
// 04e: pop2
// 04f: ldc2_w -5477120535098774394
// 052: lload 2
// 053: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: aload 0
// 059: lload 12
// 05b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05e: iload 6
// 060: i2b
// 061: swap
// 062: lload 7
// 064: dup2_x1
// 065: pop2
// 066: checkcast net/minecraft/class_1297
// 069: invokevirtual su/catlean/u3.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 06c: checkcast net/minecraft/class_2374
// 06f: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 072: dup
// 073: sipush 523
// 076: ldc2_w 7064787757071555115
// 079: lload 2
// 07a: lxor
// 07b: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 083: astore 15
// 085: astore 14
// 087: aload 0
// 088: iload 9
// 08a: iload 10
// 08c: iload 11
// 08e: i2b
// 08f: invokespecial su/catlean/u3.Q (IIB)Lsu/catlean/wm;
// 092: getstatic su/catlean/wm.VANILLA Lsu/catlean/wm;
// 095: if_acmpne 10c
// 098: aload 1
// 099: aload 14
// 09b: ifnonnull 0f2
// 09e: goto 0ab
// 0a1: ldc2_w -5485917570215590453
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: invokevirtual su/catlean/api/event/events/player/CollisionEvent.getPos ()Lnet/minecraft/class_2338;
// 0ae: aload 15
// 0b0: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 0b3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b6: ifeq 0e4
// 0b9: goto 0c6
// 0bc: ldc2_w -5485917570215590453
// 0bf: lload 2
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: lload 4
// 0c8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0cb: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0ce: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 0d1: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0d4: ifeq 10c
// 0d7: goto 0e4
// 0da: ldc2_w -5485917570215590453
// 0dd: lload 2
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: aload 1
// 0e5: goto 0f2
// 0e8: ldc2_w -5485917570215590453
// 0eb: lload 2
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: getstatic net/minecraft/class_2246.field_10124 Lnet/minecraft/class_2248;
// 0f5: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
// 0f8: dup
// 0f9: sipush 15392
// 0fc: ldc2_w 8226937311576220689
// 0ff: lload 2
// 100: lxor
// 101: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 109: invokevirtual su/catlean/api/event/events/player/CollisionEvent.setState (Lnet/minecraft/class_2680;)V
// 10c: return
}

@Override
public void O(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 32978412894279
// 005: lxor
// 006: lstore 3
// 007: dup2
// 008: ldc2_w 22016185369135
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 40
// 019: lushr
// 01a: l2i
// 01b: istore 6
// 01d: dup2
// 01e: bipush 56
// 020: lshl
// 021: bipush 56
// 023: lushr
// 024: l2i
// 025: istore 7
// 027: pop2
// 028: dup2
// 029: ldc2_w 93374518548743
// 02c: lxor
// 02d: dup2
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 8
// 034: dup2
// 035: bipush 16
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 9
// 03e: dup2
// 03f: bipush 32
// 041: lshl
// 042: bipush 32
// 044: lushr
// 045: l2i
// 046: istore 10
// 048: pop2
// 049: dup2
// 04a: ldc2_w 6620550408232
// 04d: lxor
// 04e: lstore 11
// 050: dup2
// 051: ldc2_w 68640045030270
// 054: lxor
// 055: lstore 13
// 057: dup2
// 058: ldc2_w 67109487395364
// 05b: lxor
// 05c: lstore 15
// 05e: dup2
// 05f: ldc2_w 67464996320865
// 062: lxor
// 063: lstore 17
// 065: pop2
// 066: ldc2_w 2603432330527128410
// 069: lload 1
// 06a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: astore 19
// 071: lload 3
// 072: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 075: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 078: aload 19
// 07a: ifnonnull 09f
// 07d: ifnull 232
// 080: goto 08d
// 083: ldc2_w 2594775991828042263
// 086: lload 1
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: lload 17
// 08f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 092: goto 09f
// 095: ldc2_w 2594775991828042263
// 098: lload 1
// 099: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: athrow
// 09f: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 0a2: ifeq 232
// 0a5: aload 0
// 0a6: iload 5
// 0a8: iload 6
// 0aa: iload 7
// 0ac: i2b
// 0ad: invokespecial su/catlean/u3.Q (IIB)Lsu/catlean/wm;
// 0b0: getstatic su/catlean/wm.STEP Lsu/catlean/wm;
// 0b3: if_acmpne 232
// 0b6: goto 0c3
// 0b9: ldc2_w 2594775991828042263
// 0bc: lload 1
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0c6: iload 8
// 0c8: i2c
// 0c9: iload 9
// 0cb: i2s
// 0cc: ldc2_w 0.44
// 0cf: iload 10
// 0d1: invokevirtual su/catlean/dm.H (CSDI)[D
// 0d4: astore 20
// 0d6: lload 17
// 0d8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0db: invokevirtual net/minecraft/class_746.method_36454 ()F
// 0de: sipush 12224
// 0e1: ldc2_w 7243435817631970923
// 0e4: lload 1
// 0e5: lxor
// 0e6: invokedynamic u (IJ)I bsm=su/catlean/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: i2f
// 0ec: frem
// 0ed: fstore 22
// 0ef: ldc 35.0
// 0f1: fload 22
// 0f3: fcmpg
// 0f4: aload 19
// 0f6: lload 1
// 0f7: lconst_0
// 0f8: lcmp
// 0f9: ifle 123
// 0fc: ifnonnull 121
// 0ff: ifgt 148
// 102: goto 10f
// 105: ldc2_w 2594775991828042263
// 108: lload 1
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: fload 22
// 111: ldc 55.0
// 113: fcmpg
// 114: goto 121
// 117: ldc2_w 2594775991828042263
// 11a: lload 1
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: aload 19
// 123: ifnonnull 145
// 126: ifgt 144
// 129: goto 136
// 12c: ldc2_w 2594775991828042263
// 12f: lload 1
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 1
// 137: goto 149
// 13a: ldc2_w 2594775991828042263
// 13d: lload 1
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: bipush 0
// 145: goto 149
// 148: bipush 0
// 149: istore 21
// 14b: new net/minecraft/class_2848
// 14e: dup
// 14f: lload 17
// 151: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 154: checkcast net/minecraft/class_1297
// 157: getstatic net/minecraft/class_2848$class_2849.field_12981 Lnet/minecraft/class_2848$class_2849;
// 15a: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
// 15d: checkcast net/minecraft/class_2596
// 160: lload 15
// 162: dup2_x1
// 163: pop2
// 164: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 167: iload 21
// 169: ifeq 1a6
// 16c: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 16f: iload 8
// 171: i2c
// 172: iload 9
// 174: i2s
// 175: ldc2_w 0.51
// 178: iload 10
// 17a: invokevirtual su/catlean/dm.H (CSDI)[D
// 17d: astore 23
// 17f: bipush 0
// 180: istore 24
// 182: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 185: aload 20
// 187: lload 11
// 189: aload 23
// 18b: invokespecial su/catlean/u3.c ([DJ[D)V
// 18e: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 191: lload 13
// 193: aload 20
// 195: aload 23
// 197: invokespecial su/catlean/u3.A (J[D[D)V
// 19a: nop
// 19b: lload 1
// 19c: lconst_0
// 19d: lcmp
// 19e: ifle 231
// 1a1: aload 19
// 1a3: ifnull 232
// 1a6: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1a9: iload 8
// 1ab: i2c
// 1ac: iload 9
// 1ae: i2s
// 1af: ldc2_w 0.57
// 1b2: iload 10
// 1b4: invokevirtual su/catlean/dm.H (CSDI)[D
// 1b7: astore 23
// 1b9: bipush 0
// 1ba: istore 24
// 1bc: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 1bf: aload 20
// 1c1: lload 11
// 1c3: aload 23
// 1c5: invokespecial su/catlean/u3.c ([DJ[D)V
// 1c8: lload 17
// 1ca: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1cd: lload 17
// 1cf: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1d2: invokevirtual net/minecraft/class_746.method_23317 ()D
// 1d5: aload 23
// 1d7: bipush 0
// 1d8: daload
// 1d9: dadd
// 1da: lload 17
// 1dc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1df: invokevirtual net/minecraft/class_746.method_23318 ()D
// 1e2: lload 17
// 1e4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1e7: invokevirtual net/minecraft/class_746.method_23321 ()D
// 1ea: aload 23
// 1ec: bipush 1
// 1ed: daload
// 1ee: dadd
// 1ef: invokevirtual net/minecraft/class_746.method_5814 (DDD)V
// 1f2: new net/minecraft/class_2828$class_2829
// 1f5: dup
// 1f6: lload 17
// 1f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1fb: invokevirtual net/minecraft/class_746.method_23317 ()D
// 1fe: lload 17
// 200: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 203: invokevirtual net/minecraft/class_746.method_23318 ()D
// 206: lload 17
// 208: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 20b: invokevirtual net/minecraft/class_746.method_23321 ()D
// 20e: bipush 1
// 20f: lload 17
// 211: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 214: getfield net/minecraft/class_746.field_5976 Z
// 217: invokespecial net/minecraft/class_2828$class_2829.<init> (DDDZZ)V
// 21a: checkcast net/minecraft/class_2596
// 21d: lload 15
// 21f: dup2_x1
// 220: pop2
// 221: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 224: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 227: lload 13
// 229: aload 20
// 22b: aload 23
// 22d: invokespecial su/catlean/u3.A (J[D[D)V
// 230: nop
// 231: nop
// 232: return
}

private final void c(double[] param1, long param2, double[] param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u3.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 90347272137786
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 128491061427744
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 128154947095141
// 019: lxor
// 01a: lstore 9
// 01c: pop2
// 01d: ldc2_w -2871759184273291426
// 020: lload 2
// 021: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: astore 11
// 028: aload 11
// 02a: ifnonnull 0cf
// 02d: getstatic su/catlean/la.l Lsu/catlean/la;
// 030: lload 9
// 032: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 035: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 038: dup
// 039: sipush 25788
// 03c: ldc2_w 8348214662393812801
// 03f: lload 2
// 040: lxor
// 041: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 049: lload 9
// 04b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 04e: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 051: aload 1
// 052: bipush 0
// 053: daload
// 054: dconst_0
// 055: aload 1
// 056: bipush 1
// 057: daload
// 058: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 05b: dup
// 05c: sipush 29179
// 05f: ldc2_w 1093718473835921929
// 062: lload 2
// 063: lxor
// 064: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 06c: bipush 0
// 06d: aconst_null
// 06e: bipush 0
// 06f: sipush 9065
// 072: ldc2_w 432255830492317384
// 075: lload 2
// 076: lxor
// 077: invokedynamic u (IJ)I bsm=su/catlean/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: aconst_null
// 07d: lload 5
// 07f: invokestatic su/catlean/la.R (Lsu/catlean/la;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZLjava/util/List;ZILjava/lang/Object;J)Lnet/minecraft/class_3965;
// 082: dup
// 083: ifnull 0ce
// 086: goto 093
// 089: ldc2_w -2880554636662165997
// 08c: lload 2
// 08d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: athrow
// 093: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
// 096: invokevirtual net/minecraft/class_3965.equals (Ljava/lang/Object;)Z
// 099: aload 11
// 09b: ifnonnull 0cb
// 09e: goto 0ab
// 0a1: ldc2_w -2880554636662165997
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: bipush 1
// 0ac: if_icmpne 0ca
// 0af: goto 0bc
// 0b2: ldc2_w -2880554636662165997
// 0b5: lload 2
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: bipush 1
// 0bd: goto 0d0
// 0c0: ldc2_w -2880554636662165997
// 0c3: lload 2
// 0c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: athrow
// 0ca: bipush 0
// 0cb: goto 0d0
// 0ce: pop
// 0cf: bipush 0
// 0d0: lload 2
// 0d1: lconst_0
// 0d2: lcmp
// 0d3: iflt 0da
// 0d6: ifeq 0e7
// 0d9: bipush 1
// 0da: goto 0e8
// 0dd: ldc2_w -2880554636662165997
// 0e0: lload 2
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: bipush 2
// 0e8: istore 12
// 0ea: lload 9
// 0ec: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ef: lload 9
// 0f1: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0f4: invokevirtual net/minecraft/class_746.method_23317 ()D
// 0f7: aload 4
// 0f9: bipush 0
// 0fa: daload
// 0fb: dadd
// 0fc: lload 9
// 0fe: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 101: invokevirtual net/minecraft/class_746.method_23318 ()D
// 104: iload 12
// 106: i2d
// 107: dadd
// 108: lload 9
// 10a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10d: invokevirtual net/minecraft/class_746.method_23321 ()D
// 110: aload 4
// 112: bipush 1
// 113: daload
// 114: dadd
// 115: invokevirtual net/minecraft/class_746.method_5814 (DDD)V
// 118: new net/minecraft/class_2828$class_2829
// 11b: dup
// 11c: lload 9
// 11e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 121: invokevirtual net/minecraft/class_746.method_23317 ()D
// 124: lload 9
// 126: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 129: invokevirtual net/minecraft/class_746.method_23318 ()D
// 12c: lload 9
// 12e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 131: invokevirtual net/minecraft/class_746.method_23321 ()D
// 134: bipush 1
// 135: lload 9
// 137: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 13a: getfield net/minecraft/class_746.field_5976 Z
// 13d: invokespecial net/minecraft/class_2828$class_2829.<init> (DDDZZ)V
// 140: checkcast net/minecraft/class_2596
// 143: lload 7
// 145: dup2_x1
// 146: pop2
// 147: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 14a: return
}

private final void A(long var1, double[] var3, double[] var4) {
var1 = a ^ var1;
int var5 = (int)((var1 ^ 52415435503922L) >>> 56);
long var6 = (var1 ^ 52415435503922L) << 8 >>> 8;
long var8 = var1 ^ 86799648704404L;
long var10 = var1 ^ 84337556770166L;
long var12 = var1 ^ 84553143646515L;
_g[] var14 = vm.a<"Å">(-6092439747095776248L, var1);

byte var10000;
label22: {
label21: {
try {
var10000 = zf.z(var8).method_22347(class_2338.method_49638((class_2374)this.J((byte)var5, var6, (class_1297)zf.v(var12)).method_1031(var3[0], -2.0, var3[1])));
if (var14 != null) {
break label22;
}

if (var10000 != 0) {
break label21;
}
} catch (NumberFormatException var16) {
throw vm.a<"Å">(var16, -6102361306622599867L, var1);
}

var10000 = 1;
break label22;
}

var10000 = 2;
}

byte var15 = var10000;
zf.v(var12).method_5814(zf.v(var12).method_23317() + var4[0], zf.v(var12).method_23318() - var15, zf.v(var12).method_23321() + var4[1]);
_r.a(var10, (class_2596)(new class_2829(zf.v(var12).method_23317(), zf.v(var12).method_23318(), zf.v(var12).method_23321(), true, zf.v(var12).field_5976)));
}

@Flow(
priority = -10
)
private final void V(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u3.a J
// 003: ldc2_w 78131412499191
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 23150184788882
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 95549604953525
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
// 027: ldc2_w 85680055326713
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 116564003261134
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 30184976111196
// 038: lxor
// 039: lstore 13
// 03b: dup2
// 03c: ldc2_w 61283094315795
// 03f: lxor
// 040: lstore 15
// 042: dup2
// 043: ldc2_w 75558820512868
// 046: lxor
// 047: lstore 17
// 049: dup2
// 04a: ldc2_w 43660511822401
// 04d: lxor
// 04e: lstore 19
// 050: dup2
// 051: ldc2_w 85663912909090
// 054: lxor
// 055: lstore 21
// 057: dup2
// 058: ldc2_w 59011160112564
// 05b: lxor
// 05c: lstore 23
// 05e: dup2
// 05f: ldc2_w 44215790439611
// 062: lxor
// 063: dup2
// 064: bipush 32
// 066: lushr
// 067: l2i
// 068: istore 25
// 06a: dup2
// 06b: bipush 32
// 06d: lshl
// 06e: bipush 32
// 070: lushr
// 071: lstore 26
// 073: pop2
// 074: dup2
// 075: ldc2_w 115050653651859
// 078: lxor
// 079: lstore 28
// 07b: dup2
// 07c: ldc2_w 24380615041459
// 07f: lxor
// 080: lstore 30
// 082: dup2
// 083: ldc2_w 31844950542842
// 086: lxor
// 087: dup2
// 088: bipush 32
// 08a: lushr
// 08b: l2i
// 08c: istore 32
// 08e: dup2
// 08f: bipush 32
// 091: lshl
// 092: bipush 40
// 094: lushr
// 095: l2i
// 096: istore 33
// 098: dup2
// 099: bipush 56
// 09b: lshl
// 09c: bipush 56
// 09e: lushr
// 09f: l2i
// 0a0: istore 34
// 0a2: pop2
// 0a3: dup2
// 0a4: ldc2_w 90539802344119
// 0a7: lxor
// 0a8: lstore 35
// 0aa: dup2
// 0ab: ldc2_w 54934063656727
// 0ae: lxor
// 0af: lstore 37
// 0b1: dup2
// 0b2: ldc2_w 110924474261986
// 0b5: lxor
// 0b6: dup2
// 0b7: bipush 48
// 0b9: lushr
// 0ba: l2i
// 0bb: istore 39
// 0bd: dup2
// 0be: bipush 16
// 0c0: lshl
// 0c1: bipush 48
// 0c3: lushr
// 0c4: l2i
// 0c5: istore 40
// 0c7: dup2
// 0c8: bipush 32
// 0ca: lshl
// 0cb: bipush 32
// 0cd: lushr
// 0ce: l2i
// 0cf: istore 41
// 0d1: pop2
// 0d2: dup2
// 0d3: ldc2_w 66083789003123
// 0d6: lxor
// 0d7: lstore 42
// 0d9: pop2
// 0da: ldc2_w -5767924641003097969
// 0dd: lload 2
// 0de: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: astore 44
// 0e5: aload 0
// 0e6: aload 44
// 0e8: ifnonnull 114
// 0eb: iload 32
// 0ed: iload 33
// 0ef: iload 34
// 0f1: i2b
// 0f2: invokespecial su/catlean/u3.Q (IIB)Lsu/catlean/wm;
// 0f5: getstatic su/catlean/wm.PEARL Lsu/catlean/wm;
// 0f8: if_acmpeq 113
// 0fb: goto 108
// 0fe: ldc2_w -5776016106678330942
// 101: lload 2
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: return
// 109: ldc2_w -5776016106678330942
// 10c: lload 2
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: aload 0
// 114: iload 39
// 116: i2c
// 117: iload 40
// 119: i2c
// 11a: iload 41
// 11c: invokespecial su/catlean/u3.q (CCI)Z
// 11f: ifeq 14b
// 122: lload 23
// 124: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 127: invokevirtual net/minecraft/class_746.method_18376 ()Lnet/minecraft/class_4050;
// 12a: getstatic net/minecraft/class_4050.field_18079 Lnet/minecraft/class_4050;
// 12d: if_acmpne 14b
// 130: goto 13d
// 133: ldc2_w -5776016106678330942
// 136: lload 2
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: bipush 1
// 13e: goto 14c
// 141: ldc2_w -5776016106678330942
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: bipush 0
// 14c: istore 45
// 14e: getstatic su/catlean/u3.X Lsu/catlean/bg;
// 151: sipush 21281
// 154: ldc2_w 3748381294316224860
// 157: lload 2
// 158: lxor
// 159: invokedynamic u (IJ)I bsm=su/catlean/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: lload 17
// 160: invokevirtual su/catlean/bg.c (IJ)Z
// 163: aload 44
// 165: ifnonnull 196
// 168: ifeq 1f3
// 16b: goto 178
// 16e: ldc2_w -5776016106678330942
// 171: lload 2
// 172: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: athrow
// 178: lload 23
// 17a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 17d: invokevirtual net/minecraft/class_746.method_7357 ()Lnet/minecraft/class_1796;
// 180: getstatic net/minecraft/class_1802.field_8634 Lnet/minecraft/class_1792;
// 183: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 186: invokevirtual net/minecraft/class_1796.method_7904 (Lnet/minecraft/class_1799;)Z
// 189: goto 196
// 18c: ldc2_w -5776016106678330942
// 18f: lload 2
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: aload 44
// 198: ifnonnull 1c0
// 19b: ifne 1f3
// 19e: goto 1ab
// 1a1: ldc2_w -5776016106678330942
// 1a4: lload 2
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: lload 23
// 1ad: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1b0: getfield net/minecraft/class_746.field_6012 I
// 1b3: goto 1c0
// 1b6: ldc2_w -5776016106678330942
// 1b9: lload 2
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: aload 44
// 1c2: ifnonnull 1f0
// 1c5: sipush 23990
// 1c8: ldc2_w 8877650507255189443
// 1cb: lload 2
// 1cc: lxor
// 1cd: invokedynamic u (IJ)I bsm=su/catlean/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d2: if_icmple 1f3
// 1d5: goto 1e2
// 1d8: ldc2_w -5776016106678330942
// 1db: lload 2
// 1dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: athrow
// 1e2: bipush 1
// 1e3: goto 1f0
// 1e6: ldc2_w -5776016106678330942
// 1e9: lload 2
// 1ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ef: athrow
// 1f0: goto 1f4
// 1f3: bipush 0
// 1f4: istore 46
// 1f6: lload 23
// 1f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1fb: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 1fe: aload 44
// 200: ifnonnull 254
// 203: ifeq 24c
// 206: goto 213
// 209: ldc2_w -5776016106678330942
// 20c: lload 2
// 20d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: athrow
// 213: iload 45
// 215: aload 44
// 217: ifnonnull 254
// 21a: goto 227
// 21d: ldc2_w -5776016106678330942
// 220: lload 2
// 221: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 226: athrow
// 227: ifeq 24c
// 22a: goto 237
// 22d: ldc2_w -5776016106678330942
// 230: lload 2
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: lload 23
// 239: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23c: invokevirtual net/minecraft/class_746.method_6043 ()V
// 23f: goto 24c
// 242: ldc2_w -5776016106678330942
// 245: lload 2
// 246: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: athrow
// 24c: lload 23
// 24e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 251: getfield net/minecraft/class_746.field_5976 Z
// 254: aload 44
// 256: ifnonnull 27c
// 259: ifeq 519
// 25c: goto 269
// 25f: ldc2_w -5776016106678330942
// 262: lload 2
// 263: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 268: athrow
// 269: aload 0
// 26a: lload 11
// 26c: invokespecial su/catlean/u3.E (J)Z
// 26f: goto 27c
// 272: ldc2_w -5776016106678330942
// 275: lload 2
// 276: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: athrow
// 27c: aload 44
// 27e: ifnonnull 293
// 281: ifne 519
// 284: goto 291
// 287: ldc2_w -5776016106678330942
// 28a: lload 2
// 28b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 290: athrow
// 291: iload 46
// 293: aload 44
// 295: ifnonnull 2bd
// 298: ifeq 519
// 29b: goto 2a8
// 29e: ldc2_w -5776016106678330942
// 2a1: lload 2
// 2a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a7: athrow
// 2a8: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 2ab: invokevirtual su/catlean/dm.o ()D
// 2ae: dconst_0
// 2af: dcmpl
// 2b0: goto 2bd
// 2b3: ldc2_w -5776016106678330942
// 2b6: lload 2
// 2b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bc: athrow
// 2bd: aload 44
// 2bf: ifnonnull 30b
// 2c2: ifgt 2f6
// 2c5: goto 2d2
// 2c8: ldc2_w -5776016106678330942
// 2cb: lload 2
// 2cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d1: athrow
// 2d2: iload 45
// 2d4: aload 44
// 2d6: ifnonnull 30b
// 2d9: goto 2e6
// 2dc: ldc2_w -5776016106678330942
// 2df: lload 2
// 2e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e5: athrow
// 2e6: ifne 519
// 2e9: goto 2f6
// 2ec: ldc2_w -5776016106678330942
// 2ef: lload 2
// 2f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f5: athrow
// 2f6: lload 23
// 2f8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2fb: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 2fe: goto 30b
// 301: ldc2_w -5776016106678330942
// 304: lload 2
// 305: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30a: athrow
// 30b: aload 44
// 30d: ifnonnull 3a1
// 310: ifne 36c
// 313: goto 320
// 316: ldc2_w -5776016106678330942
// 319: lload 2
// 31a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31f: athrow
// 320: aload 0
// 321: lload 28
// 323: invokespecial su/catlean/u3.H (J)Z
// 326: aload 44
// 328: ifnonnull 3a1
// 32b: goto 338
// 32e: ldc2_w -5776016106678330942
// 331: lload 2
// 332: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 337: athrow
// 338: ifeq 36c
// 33b: goto 348
// 33e: ldc2_w -5776016106678330942
// 341: lload 2
// 342: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 347: athrow
// 348: iload 45
// 34a: aload 44
// 34c: ifnonnull 3a1
// 34f: goto 35c
// 352: ldc2_w -5776016106678330942
// 355: lload 2
// 356: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35b: athrow
// 35c: ifeq 519
// 35f: goto 36c
// 362: ldc2_w -5776016106678330942
// 365: lload 2
// 366: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36b: athrow
// 36c: lload 15
// 36e: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 371: aload 0
// 372: lload 23
// 374: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 377: iload 6
// 379: i2b
// 37a: swap
// 37b: lload 7
// 37d: dup2_x1
// 37e: pop2
// 37f: checkcast net/minecraft/class_1297
// 382: invokevirtual su/catlean/u3.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 385: checkcast net/minecraft/class_2374
// 388: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 38b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 38e: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 391: instanceof net/minecraft/class_3736
// 394: goto 3a1
// 397: ldc2_w -5776016106678330942
// 39a: lload 2
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: aload 44
// 3a3: ifnonnull 3ea
// 3a6: ifeq 3eb
// 3a9: goto 3b6
// 3ac: ldc2_w -5776016106678330942
// 3af: lload 2
// 3b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b5: athrow
// 3b6: iload 25
// 3b8: lload 26
// 3ba: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 3bd: aload 0
// 3be: lload 23
// 3c0: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3c3: iload 6
// 3c5: i2b
// 3c6: swap
// 3c7: lload 7
// 3c9: dup2_x1
// 3ca: pop2
// 3cb: checkcast net/minecraft/class_1297
// 3ce: invokevirtual su/catlean/u3.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 3d1: checkcast net/minecraft/class_2374
// 3d4: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 3d7: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
// 3da: invokevirtual net/minecraft/class_636.method_2910 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
// 3dd: goto 3ea
// 3e0: ldc2_w -5776016106678330942
// 3e3: lload 2
// 3e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e9: athrow
// 3ea: pop
// 3eb: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 3ee: ldc 0.5
// 3f0: bipush 1
// 3f1: fconst_0
// 3f2: lload 21
// 3f4: fconst_0
// 3f5: fconst_0
// 3f6: sipush 32300
// 3f9: ldc2_w 679598581950917722
// 3fc: lload 2
// 3fd: lxor
// 3fe: invokedynamic u (IJ)I bsm=su/catlean/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 403: aconst_null
// 404: invokestatic su/catlean/dm.O (Lsu/catlean/dm;FZFJFFILjava/lang/Object;)[D
// 407: astore 47
// 409: lload 23
// 40b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 40e: invokevirtual net/minecraft/class_746.method_23317 ()D
// 411: aload 47
// 413: bipush 0
// 414: daload
// 415: dadd
// 416: lload 23
// 418: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 41b: invokevirtual net/minecraft/class_746.method_23318 ()D
// 41e: lload 23
// 420: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 423: invokevirtual net/minecraft/class_746.method_23321 ()D
// 426: aload 47
// 428: bipush 1
// 429: daload
// 42a: dadd
// 42b: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 42e: dup
// 42f: sipush 523
// 432: ldc2_w 7064819562239116834
// 435: lload 2
// 436: lxor
// 437: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 43f: astore 48
// 441: lload 4
// 443: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 446: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 449: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
// 44c: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 44f: ifeq 45d
// 452: return
// 453: ldc2_w -5776016106678330942
// 456: lload 2
// 457: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45c: athrow
// 45d: new kotlin/jvm/internal/Ref$ObjectRef
// 460: dup
// 461: invokespecial kotlin/jvm/internal/Ref$ObjectRef.<init> ()V
// 464: astore 49
// 466: aload 49
// 468: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 46b: aload 48
// 46d: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 470: dup
// 471: sipush 18240
// 474: ldc2_w 7073740522114515837
// 477: lload 2
// 478: lxor
// 479: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 481: lload 35
// 483: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 486: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 489: aload 49
// 48b: new su/catlean/_w
// 48e: dup
// 48f: aload 49
// 491: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 494: checkcast su/catlean/_w
// 497: invokevirtual su/catlean/_w.q ()F
// 49a: aload 0
// 49b: lload 9
// 49d: invokespecial su/catlean/u3.Z (J)F
// 4a0: lload 37
// 4a2: dup2_x1
// 4a3: pop2
// 4a4: bipush 0
// 4a5: aconst_null
// 4a6: sipush 16205
// 4a9: ldc2_w 3572112730577726782
// 4ac: lload 2
// 4ad: lxor
// 4ae: invokedynamic u (IJ)I bsm=su/catlean/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b3: aconst_null
// 4b4: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 4b7: putfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 4ba: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 4bd: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/u3.U (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 4c2: lload 19
// 4c4: dup2_x1
// 4c5: pop2
// 4c6: aload 0
// 4c7: lload 30
// 4c9: invokespecial su/catlean/u3.n (J)Lsu/catlean/f9;
// 4cc: invokevirtual su/catlean/gg.X (JLsu/catlean/n5;Lsu/catlean/f9;)Lsu/catlean/fg;
// 4cf: astore 50
// 4d1: aload 50
// 4d3: invokevirtual su/catlean/fg.R ()Z
// 4d6: ifeq 519
// 4d9: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 4dc: new su/catlean/t5
// 4df: dup
// 4e0: aload 49
// 4e2: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 4e5: checkcast su/catlean/_w
// 4e8: lload 42
// 4ea: sipush 14967
// 4ed: ldc2_w 2364660332864923654
// 4f0: lload 2
// 4f1: lxor
// 4f2: invokedynamic u (IJ)I bsm=su/catlean/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f7: aload 48
// 4f9: aload 49
// 4fb: aload 50
// 4fd: invokedynamic invoke (Lnet/minecraft/class_2338;Lkotlin/jvm/internal/Ref$ObjectRef;Lsu/catlean/fg;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/u3.d (Lnet/minecraft/class_2338;Lkotlin/jvm/internal/Ref$ObjectRef;Lsu/catlean/fg;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 502: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// 505: lload 13
// 507: dup2_x1
// 508: pop2
// 509: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 50c: goto 519
// 50f: ldc2_w -5776016106678330942
// 512: lload 2
// 513: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 518: athrow
// 519: return
}

private final void G(class_2338 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u3.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 122117648678478
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 64290707017135
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 30686471155471
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 68999084457880
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 15783531927289
// 027: lxor
// 028: lstore 12
// 02a: dup2
// 02b: ldc2_w 13064559357533
// 02e: lxor
// 02f: lstore 14
// 031: dup2
// 032: ldc2_w 28586465251752
// 035: lxor
// 036: lstore 16
// 038: pop2
// 039: lload 8
// 03b: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 03e: aload 1
// 03f: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 042: dup
// 043: sipush 20867
// 046: ldc2_w 3399808651605424556
// 049: lload 2
// 04a: lxor
// 04b: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 053: astore 25
// 055: aload 25
// 057: invokevirtual net/minecraft/class_2680.method_45474 ()Z
// 05a: ifeq 12b
// 05d: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 060: invokedynamic b ()Lsu/catlean/n5; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_1799;)Z, su/catlean/u3.L (Lnet/minecraft/class_1799;)Z, (Lnet/minecraft/class_1799;)Z ]
// 065: lload 14
// 067: dup2_x1
// 068: pop2
// 069: aload 0
// 06a: lload 6
// 06c: invokespecial su/catlean/u3.n (J)Lsu/catlean/f9;
// 06f: invokevirtual su/catlean/gg.X (JLsu/catlean/n5;Lsu/catlean/f9;)Lsu/catlean/fg;
// 072: astore 26
// 074: lload 2
// 075: lconst_0
// 076: lcmp
// 077: ifle 082
// 07a: aload 26
// 07c: invokevirtual su/catlean/fg.R ()Z
// 07f: ifeq 12b
// 082: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 085: aload 1
// 086: bipush -1
// 087: aload 0
// 088: lload 10
// 08a: invokespecial su/catlean/u3.g (J)Z
// 08d: ifeq 0ad
// 090: goto 09d
// 093: ldc2_w -8949959089741892130
// 096: lload 2
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: getstatic su/catlean/xx.GRIM Lsu/catlean/xx;
// 0a0: goto 0b0
// 0a3: ldc2_w -8949959089741892130
// 0a6: lload 2
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: getstatic su/catlean/xx.Strict Lsu/catlean/xx;
// 0b0: getstatic su/catlean/y4.ALL Lsu/catlean/y4;
// 0b3: lload 16
// 0b5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b8: invokevirtual net/minecraft/class_746.method_55754 ()D
// 0bb: d2f
// 0bc: lload 16
// 0be: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c1: invokevirtual net/minecraft/class_746.method_55754 ()D
// 0c4: d2f
// 0c5: aconst_null
// 0c6: sipush 18964
// 0c9: ldc2_w 7054367066608153716
// 0cc: lload 2
// 0cd: lxor
// 0ce: invokedynamic u (IJ)I bsm=su/catlean/u3.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: aconst_null
// 0d4: astore 18
// 0d6: istore 19
// 0d8: astore 20
// 0da: fstore 21
// 0dc: fstore 22
// 0de: astore 23
// 0e0: astore 24
// 0e2: lload 12
// 0e4: aload 24
// 0e6: aload 23
// 0e8: fload 22
// 0ea: fload 21
// 0ec: aload 20
// 0ee: iload 19
// 0f0: aload 18
// 0f2: invokestatic su/catlean/gw.j (Lsu/catlean/gw;Lnet/minecraft/class_2338;IJLsu/catlean/xx;Lsu/catlean/y4;FFLjava/util/List;ILjava/lang/Object;)Lnet/minecraft/class_3965;
// 0f5: astore 27
// 0f7: lload 2
// 0f8: lconst_0
// 0f9: lcmp
// 0fa: iflt 11e
// 0fd: aload 27
// 0ff: ifnull 12b
// 102: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 105: aload 26
// 107: invokevirtual su/catlean/fg.a ()I
// 10a: lload 4
// 10c: dup2_x1
// 10d: pop2
// 10e: aload 0
// 10f: lload 6
// 111: invokespecial su/catlean/u3.n (J)Lsu/catlean/f9;
// 114: aload 27
// 116: invokedynamic invoke (Lnet/minecraft/class_3965;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/u3.N (Lnet/minecraft/class_3965;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 11b: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 11e: goto 12b
// 121: ldc2_w -8949959089741892130
// 124: lload 2
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: return
}

private final float Z(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u3.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 93299234127456
// 0b: lxor
// 0c: dup2
// 0d: bipush 56
// 0f: lushr
// 10: l2i
// 11: istore 3
// 12: dup2
// 13: bipush 8
// 15: lshl
// 16: bipush 8
// 18: lushr
// 19: lstore 4
// 1b: pop2
// 1c: dup2
// 1d: ldc2_w 58826537992390
// 20: lxor
// 21: lstore 6
// 23: dup2
// 24: ldc2_w 61124108861025
// 27: lxor
// 28: lstore 8
// 2a: pop2
// 2b: ldc2_w 7791567264469119834
// 2e: lload 1
// 2f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: astore 10
// 36: lload 8
// 38: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3b: invokevirtual net/minecraft/class_746.method_23318 ()D
// 3e: invokestatic java/lang/Math.abs (D)D
// 41: lload 8
// 43: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 46: invokevirtual net/minecraft/class_746.method_23318 ()D
// 49: invokestatic java/lang/Math.floor (D)D
// 4c: dsub
// 4d: ldc2_w 0.1
// 50: dcmpl
// 51: aload 10
// 53: ifnonnull 9a
// 56: ifle 73
// 59: goto 66
// 5c: ldc2_w 7782912608632773143
// 5f: lload 1
// 60: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65: athrow
// 66: ldc 81.0
// 68: freturn
// 69: ldc2_w 7782912608632773143
// 6c: lload 1
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: lload 6
// 75: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 78: aload 0
// 79: lload 8
// 7b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 7e: iload 3
// 7f: i2b
// 80: swap
// 81: lload 4
// 83: dup2_x1
// 84: pop2
// 85: checkcast net/minecraft/class_1297
// 88: invokevirtual su/catlean/u3.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 8b: checkcast net/minecraft/class_2374
// 8e: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 91: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 94: getstatic net/minecraft/class_2246.field_9983 Lnet/minecraft/class_2248;
// 97: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9a: ifeq aa
// 9d: ldc 80.0
// 9f: freturn
// a0: ldc2_w 7782912608632773143
// a3: lload 1
// a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: athrow
// aa: ldc 85.0
// ac: freturn
}

private final boolean E(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u3.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 20271233211889
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 18111030534998
// 011: lxor
// 012: lstore 5
// 014: pop2
// 015: ldc2_w 8148721235094629997
// 018: lload 1
// 019: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e: lload 5
// 020: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 023: invokevirtual net/minecraft/class_746.method_23317 ()D
// 026: lload 5
// 028: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 02b: invokevirtual net/minecraft/class_746.method_23318 ()D
// 02e: invokestatic kotlin/math/MathKt.roundToInt (D)I
// 031: i2d
// 032: lload 5
// 034: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 037: invokevirtual net/minecraft/class_746.method_23321 ()D
// 03a: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
// 03d: dup
// 03e: sipush 7535
// 041: ldc2_w 414274410510288802
// 044: lload 1
// 045: lxor
// 046: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 04e: astore 8
// 050: lload 3
// 051: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 054: aload 8
// 056: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 059: dup
// 05a: sipush 23071
// 05d: ldc2_w 4902583851529322703
// 060: lload 1
// 061: lxor
// 062: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 06a: astore 9
// 06c: astore 7
// 06e: lload 3
// 06f: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 072: aload 8
// 074: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 077: dup
// 078: sipush 20867
// 07b: ldc2_w 3399798201906907986
// 07e: lload 1
// 07f: lxor
// 080: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 088: astore 10
// 08a: aload 9
// 08c: lload 3
// 08d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 090: checkcast net/minecraft/class_1922
// 093: aload 8
// 095: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
// 098: invokestatic net/minecraft/class_259.method_1073 ()Lnet/minecraft/class_265;
// 09b: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09e: aload 7
// 0a0: ifnonnull 0b4
// 0a3: ifne 0b7
// 0a6: goto 0b3
// 0a9: ldc2_w 8157516629491975968
// 0ac: lload 1
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: bipush 1
// 0b4: goto 0b8
// 0b7: bipush 0
// 0b8: istore 11
// 0ba: aload 10
// 0bc: lload 3
// 0bd: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0c0: checkcast net/minecraft/class_1922
// 0c3: aload 8
// 0c5: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 0c8: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
// 0cb: invokestatic net/minecraft/class_259.method_1073 ()Lnet/minecraft/class_265;
// 0ce: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0d1: aload 7
// 0d3: ifnonnull 0e7
// 0d6: ifne 0ea
// 0d9: goto 0e6
// 0dc: ldc2_w 8157516629491975968
// 0df: lload 1
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: bipush 1
// 0e7: goto 0eb
// 0ea: bipush 0
// 0eb: istore 12
// 0ed: iload 11
// 0ef: aload 7
// 0f1: lload 1
// 0f2: lconst_0
// 0f3: lcmp
// 0f4: iflt 10e
// 0f7: ifnonnull 10c
// 0fa: ifeq 158
// 0fd: goto 10a
// 100: ldc2_w 8157516629491975968
// 103: lload 1
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: iload 12
// 10c: aload 7
// 10e: lload 1
// 10f: lconst_0
// 110: lcmp
// 111: ifle 141
// 114: ifnonnull 13f
// 117: ifne 158
// 11a: goto 127
// 11d: ldc2_w 8157516629491975968
// 120: lload 1
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: aload 9
// 129: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 12c: getstatic net/minecraft/class_2246.field_9983 Lnet/minecraft/class_2248;
// 12f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 132: goto 13f
// 135: ldc2_w 8157516629491975968
// 138: lload 1
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: aload 7
// 141: ifnonnull 155
// 144: ifne 158
// 147: goto 154
// 14a: ldc2_w 8157516629491975968
// 14d: lload 1
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: bipush 1
// 155: goto 159
// 158: bipush 0
// 159: ireturn
}

private static final boolean e() {
long var0 = a ^ 81680084498951L;
long var10001 = var0 ^ 19450724780298L;
int var2 = (int)((var0 ^ 19450724780298L) >>> 32);
int var3 = (int)((var0 ^ 19450724780298L) << 32 >>> 40);
int var4 = (int)(var10001 << 56 >>> 56);

try {
if (N.Q(var2, var3, (byte)var4) == wm.PEARL) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 3397819352622127410L, var0);
}

return false;
}

private static final boolean x() {
long var0 = a ^ 47938332202235L;
long var10001 = var0 ^ 123560213506038L;
int var2 = (int)((var0 ^ 123560213506038L) >>> 32);
int var3 = (int)((var0 ^ 123560213506038L) << 32 >>> 40);
int var4 = (int)(var10001 << 56 >>> 56);

try {
if (N.Q(var2, var3, (byte)var4) == wm.PEARL) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -4477955293533849650L, var0);
}

return false;
}

private static final boolean h() {
long var0 = a ^ 71222222687400L;
long var10001 = var0 ^ 29960327266213L;
int var2 = (int)((var0 ^ 29960327266213L) >>> 32);
int var3 = (int)((var0 ^ 29960327266213L) << 32 >>> 40);
int var4 = (int)(var10001 << 56 >>> 56);

try {
if (N.Q(var2, var3, (byte)var4) == wm.PEARL) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 6451529877611753373L, var0);
}

return false;
}

private static final boolean F() {
long var0 = a ^ 62861715056123L;
long var10001 = var0 ^ 108667971262198L;
int var2 = (int)((var0 ^ 108667971262198L) >>> 32);
int var3 = (int)((var0 ^ 108667971262198L) << 32 >>> 40);
int var4 = (int)(var10001 << 56 >>> 56);

try {
if (N.Q(var2, var3, (byte)var4) == wm.PEARL) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, -1091267664046422322L, var0);
}

return false;
}

private static final boolean D() {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/u3.a J
// 03: ldc2_w 56230350259521
// 06: lxor
// 07: lstore 0
// 08: lload 0
// 09: dup2
// 0a: ldc2_w 41522640852966
// 0d: lxor
// 0e: dup2
// 0f: bipush 48
// 11: lushr
// 12: l2i
// 13: istore 2
// 14: dup2
// 15: bipush 16
// 17: lshl
// 18: bipush 48
// 1a: lushr
// 1b: l2i
// 1c: istore 3
// 1d: dup2
// 1e: bipush 32
// 20: lshl
// 21: bipush 32
// 23: lushr
// 24: l2i
// 25: istore 4
// 27: pop2
// 28: dup2
// 29: ldc2_w 115299469555276
// 2c: lxor
// 2d: dup2
// 2e: bipush 32
// 30: lushr
// 31: l2i
// 32: istore 5
// 34: dup2
// 35: bipush 32
// 37: lshl
// 38: bipush 40
// 3a: lushr
// 3b: l2i
// 3c: istore 6
// 3e: dup2
// 3f: bipush 56
// 41: lshl
// 42: bipush 56
// 44: lushr
// 45: l2i
// 46: istore 7
// 48: pop2
// 49: pop2
// 4a: ldc2_w 5783258753739673401
// 4d: lload 0
// 4e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: astore 8
// 55: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 58: aload 8
// 5a: ifnonnull 8a
// 5d: iload 5
// 5f: iload 6
// 61: iload 7
// 63: i2b
// 64: invokespecial su/catlean/u3.Q (IIB)Lsu/catlean/wm;
// 67: getstatic su/catlean/wm.PEARL Lsu/catlean/wm;
// 6a: if_acmpne ac
// 6d: goto 7a
// 70: ldc2_w 5791914853792425588
// 73: lload 0
// 74: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 79: athrow
// 7a: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 7d: goto 8a
// 80: ldc2_w 5791914853792425588
// 83: lload 0
// 84: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 89: athrow
// 8a: iload 2
// 8b: i2s
// 8c: iload 3
// 8d: i2c
// 8e: iload 4
// 90: invokespecial su/catlean/u3.V (SCI)Z
// 93: aload 8
// 95: ifnonnull a9
// 98: ifeq ac
// 9b: goto a8
// 9e: ldc2_w 5791914853792425588
// a1: lload 0
// a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a7: athrow
// a8: bipush 1
// a9: goto ad
// ac: bipush 0
// ad: ireturn
}

private static final boolean s() {
long var0 = a ^ 27031431862466L;
long var10001 = var0 ^ 74133937695695L;
int var2 = (int)((var0 ^ 74133937695695L) >>> 32);
int var3 = (int)((var0 ^ 74133937695695L) << 32 >>> 40);
int var4 = (int)(var10001 << 56 >>> 56);

try {
if (N.Q(var2, var3, (byte)var4) == wm.PEARL) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 1000406524393323511L, var0);
}

return false;
}

private static final boolean U(class_1799 var0) {
long var1 = a ^ 60365596265618L;
Intrinsics.checkNotNullParameter(var0, b<"o">(13674, 5379069627930248999L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_8634);
}

private static final Unit T() {
long var0 = a ^ 28740304584567L;
long var2 = var0 ^ 106523964303550L;
long var4 = var0 ^ 115266881358961L;
ag.K(class_1268.field_5808, 0.0F, var2, 0.0F, c<"u">(22327, 5735126808129716416L ^ var0), null);
_r.a(var4, (class_2596)(new class_2879(class_1268.field_5808)));
return Unit.INSTANCE;
}

private static final Unit d(class_2338 param0, ObjectRef param1, fg param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u3.a J
// 003: ldc2_w 43300538899529
// 006: lxor
// 007: lstore 3
// 008: lload 3
// 009: dup2
// 00a: ldc2_w 4305666498190
// 00d: lxor
// 00e: lstore 5
// 010: dup2
// 011: ldc2_w 79543202261509
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 7
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 32
// 022: lushr
// 023: lstore 8
// 025: pop2
// 026: dup2
// 027: ldc2_w 38664304194796
// 02a: lxor
// 02b: lstore 10
// 02d: dup2
// 02e: ldc2_w 54452290768622
// 031: lxor
// 032: dup2
// 033: bipush 48
// 035: lushr
// 036: l2i
// 037: istore 12
// 039: dup2
// 03a: bipush 16
// 03c: lshl
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 13
// 043: dup2
// 044: bipush 32
// 046: lshl
// 047: bipush 32
// 049: lushr
// 04a: l2i
// 04b: istore 14
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 130027447191309
// 052: lxor
// 053: lstore 15
// 055: dup2
// 056: ldc2_w 108672260812132
// 059: lxor
// 05a: lstore 17
// 05c: dup2
// 05d: ldc2_w 94109295243087
// 060: lxor
// 061: lstore 19
// 063: dup2
// 064: ldc2_w 135847192783099
// 067: lxor
// 068: lstore 21
// 06a: dup2
// 06b: ldc2_w 34732716604899
// 06e: lxor
// 06f: lstore 23
// 071: dup2
// 072: ldc2_w 94305823185674
// 075: lxor
// 076: lstore 25
// 078: pop2
// 079: ldc2_w -8553928371008793039
// 07c: lload 3
// 07d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 082: astore 27
// 084: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 087: aload 27
// 089: ifnonnull 0d4
// 08c: iload 12
// 08e: i2s
// 08f: iload 13
// 091: i2c
// 092: iload 14
// 094: invokespecial su/catlean/u3.V (SCI)Z
// 097: ifeq 0da
// 09a: goto 0a7
// 09d: ldc2_w -8545272863695044740
// 0a0: lload 3
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 0aa: aload 0
// 0ab: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
// 0ae: dup
// 0af: sipush 27815
// 0b2: ldc2_w 1930602967852158520
// 0b5: lload 3
// 0b6: lxor
// 0b7: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/u3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0bf: lload 5
// 0c1: invokespecial su/catlean/u3.G (Lnet/minecraft/class_2338;J)V
// 0c4: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 0c7: goto 0d4
// 0ca: ldc2_w -8545272863695044740
// 0cd: lload 3
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: aload 0
// 0d5: lload 5
// 0d7: invokespecial su/catlean/u3.G (Lnet/minecraft/class_2338;J)V
// 0da: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0dd: aload 1
// 0de: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 0e1: checkcast su/catlean/_w
// 0e4: invokevirtual su/catlean/_w.q ()F
// 0e7: aload 1
// 0e8: getfield kotlin/jvm/internal/Ref$ObjectRef.element Ljava/lang/Object;
// 0eb: checkcast su/catlean/_w
// 0ee: invokevirtual su/catlean/_w.N ()F
// 0f1: lload 17
// 0f3: ldc 3.0
// 0f5: bipush 0
// 0f6: bipush 0
// 0f7: invokevirtual su/catlean/dm.N (FFJFZZ)Lnet/minecraft/class_1297;
// 0fa: dup
// 0fb: ifnull 1e7
// 0fe: astore 28
// 100: bipush 0
// 101: istore 29
// 103: aload 28
// 105: instanceof net/minecraft/class_1533
// 108: aload 27
// 10a: ifnonnull 184
// 10d: ifeq 17f
// 110: goto 11d
// 113: ldc2_w -8545272863695044740
// 116: lload 3
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: aload 28
// 11f: checkcast net/minecraft/class_1533
// 122: invokevirtual net/minecraft/class_1533.method_6940 ()Lnet/minecraft/class_1799;
// 125: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 128: aload 27
// 12a: ifnonnull 184
// 12d: goto 13a
// 130: ldc2_w -8545272863695044740
// 133: lload 3
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: ifne 17f
// 13d: goto 14a
// 140: ldc2_w -8545272863695044740
// 143: lload 3
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: iload 7
// 14c: lload 8
// 14e: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 151: lload 25
// 153: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 156: checkcast net/minecraft/class_1657
// 159: aload 28
// 15b: invokevirtual net/minecraft/class_636.method_2918 (Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V
// 15e: new net/minecraft/class_2879
// 161: dup
// 162: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 165: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 168: checkcast net/minecraft/class_2596
// 16b: lload 19
// 16d: dup2_x1
// 16e: pop2
// 16f: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 172: goto 17f
// 175: ldc2_w -8545272863695044740
// 178: lload 3
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: aload 28
// 181: instanceof net/minecraft/class_1533
// 184: aload 27
// 186: ifnonnull 1ab
// 189: ifne 1ae
// 18c: goto 199
// 18f: ldc2_w -8545272863695044740
// 192: lload 3
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 28
// 19b: instanceof net/minecraft/class_1511
// 19e: goto 1ab
// 1a1: ldc2_w -8545272863695044740
// 1a4: lload 3
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: ifeq 1e3
// 1ae: iload 7
// 1b0: lload 8
// 1b2: invokestatic su/catlean/zf.Z (IJ)Lnet/minecraft/class_636;
// 1b5: lload 25
// 1b7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ba: checkcast net/minecraft/class_1657
// 1bd: aload 28
// 1bf: invokevirtual net/minecraft/class_636.method_2918 (Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V
// 1c2: new net/minecraft/class_2879
// 1c5: dup
// 1c6: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 1c9: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 1cc: checkcast net/minecraft/class_2596
// 1cf: lload 19
// 1d1: dup2_x1
// 1d2: pop2
// 1d3: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 1d6: goto 1e3
// 1d9: ldc2_w -8545272863695044740
// 1dc: lload 3
// 1dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: athrow
// 1e3: nop
// 1e4: goto 1e9
// 1e7: pop
// 1e8: nop
// 1e9: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1ec: aload 2
// 1ed: invokevirtual su/catlean/fg.a ()I
// 1f0: lload 10
// 1f2: dup2_x1
// 1f3: pop2
// 1f4: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 1f7: lload 15
// 1f9: invokespecial su/catlean/u3.n (J)Lsu/catlean/f9;
// 1fc: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/u3.T ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 201: invokevirtual su/catlean/gg.T (JILsu/catlean/f9;Lkotlin/jvm/functions/Function0;)V
// 204: aload 27
// 206: ifnonnull 23c
// 209: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 20c: lload 23
// 20e: invokespecial su/catlean/u3.W (J)Z
// 211: ifeq 236
// 214: goto 221
// 217: ldc2_w -8545272863695044740
// 21a: lload 3
// 21b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: athrow
// 221: getstatic su/catlean/u3.N Lsu/catlean/u3;
// 224: lload 21
// 226: invokevirtual su/catlean/u3.d (J)V
// 229: goto 236
// 22c: ldc2_w -8545272863695044740
// 22f: lload 3
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: getstatic su/catlean/u3.X Lsu/catlean/bg;
// 239: invokevirtual su/catlean/bg.l ()V
// 23c: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 23f: areturn
}

private static final boolean L(class_1799 var0) {
long var1 = a ^ 122352416222549L;
Intrinsics.checkNotNullParameter(var0, b<"o">(18176, 3946883712378180775L ^ var1));
return Intrinsics.areEqual(var0.method_7909(), class_1802.field_8281);
}

private static final Unit N(class_3965 var0) {
long var1 = a ^ 69147120373700L;
int var3 = (int)((var1 ^ 89997699053960L) >>> 32);
long var4 = (var1 ^ 89997699053960L) << 32 >>> 32;
long var6 = var1 ^ 83869598877831L;
zf.Z(var3, var4).method_2896(zf.v(var6), class_1268.field_5808, var0);
zf.v(var6).method_6104(class_1268.field_5808);
return Unit.INSTANCE;
}

static {
long var20 = a ^ 132679081937428L;
long var10001 = var20 ^ 53193618916272L;
int var22 = (int)((var20 ^ 53193618916272L) >>> 48);
int var23 = (int)((var20 ^ 53193618916272L) << 16 >>> 48);
int var24 = (int)(var10001 << 32 >>> 32);
long var25 = var20 ^ 14969103440106L;
long var27 = var20 ^ 84529161888350L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[33];
int var16 = 0;
String var15 = ")Ìb\u0087Û\u0086§rxí[Ñd\u0082Ò\ba8\u0013ÓFa:+ÕB*qO\u0006ðq(Å¬T°\u0003T÷\u008dÛ¯ð\u0001&ÒúäÌõ\u00ad\u0004!µÜ\u0005ÃN\u0091]¥\u0096\u000b°?ÂÇâP\\\u0096Ù\u0010¼ã*ñä\tÌÀ§\u008eN\n(m\u001dt\u0010\u0019ß\u0016Qz)\u009b?ÃÉ\u0094vZ¡ÖU\u0018Úø e)\u0014-f\u0019\u0084\u0082\u0007ÂUîV/\u0088\u0004tM3§Ú \u0088Îïò9\u0007\u0096Hs/\tÀQ'Á\u009fó«\u0083¦H)bGô\u0084g\u0091ßH\u000eÊ I\u0007$Ç\u0096\bx=s\u001d\u000eÝ\u000b\u009a\u0081'åÊo\u0010iøUi©\u001d¯9\u00900ß«\u0018~\u001f\u00994t\u001cÏ<ÒíêÄcÌÞªM\u000bO\u0083ùþß\u009f T8\u009a\u0000ÀæojV¼\u0082²êèéÅY\u00adXsårõ\bE\u0011ü¶* .I(+éß\u0012,ª1\u009ca6 aB{, SÌãR\u000f¢\u000eëQsú²²\u008c\u009aB7Vµ\nÚO\u0012\u008a ?\u0084\u0011Ñ³\u00adm\u0001\u001eU\u0091!Â&+^\u0005Âô«¸á\u0099³[\u0081\u0084X¿÷:Í(6½\u001cÙ4\u0081½xù\u000fè©ií\u000e\u008c\u0095\u0016£Å\u0099}ìBHWí\u00996bØH\u0004\u0082ÏM@â\u0018à \u009b@\nÎ,\u001e¦âÖ\u0098ýÌûÑî°_ý#\u007f\u0087\u0098ú\u009eWê\u0098hÓÔäÿ\u0010\u0006¶ßîb¡ñ4Ðü2ÄÓ)Ó\u00998þ:y«°Mò«\u0019ðýxJ¡óu3ý\u008a\u00adÏP@é\u0004F=h\u0017\u0019Ù`ç\u0083kO\u0094Ç\u0001w\u007f\u0092¨2ôÈ¼\u00050ÓÊ\u0019\u0003´÷\u0088 XæØ&zÿh)<\u0081È\u00973:Á¿\u001atÜ\u0014\u008f\u0092öÏ[Í\u0087;\u0095ní)\u0010¯\nfo\u009b,[ô\u0080\u0006\u000eñ\u0086\u009b2/8\røI/²?ØæÂÖ~\u001b«º°Iz\u001c3Àã\u0091\u0097·`Û,\u007få\u0002Ù\u0088-\u0007\u0082ú(\\ãge[¸´+-\u008a\u008bÎúöº÷Ã\u001c\u008c 73TÇ×c\f\u0094.\u0095¼ Õa2J7\u0013\u0099ä~\u0084I¤\u009e\u0090<\u0087.V\u0018 \u0010\u00178¤Ùªwâ&·\u0090#^Uê§» <{îv8Ô>âÀÈ_¨MüMn\u0012Ïà\u0001!ö\b\u001c×ÞDË\u008dzDÞ\u0010\u0099ó\u0092MÍ\u007föÓ4o^\u0004S\bÅÖ(|\u009fÿTÝ\u008a¼¥\u008ch\u0092\u0003LPoDsúp\u0088-¼[ïýq¶\u0086Ù¾GOc\u001a\u0001y$\u0002&>0áÃ\u0091ÀBªëR|\u0005ÕÎz¬\u0083`ID\"\u008dL\u0006Ì\u0014Ë.åÄ\u0019øC ù\u0002\u001b3¦¶\u009c½¼{;ñ\u009c\u009aG\u000f\u0018¦Ï\u008e\néVO\u0000ü>CU\u0082\u00001Týi}+_ÅÆ=\u0010¹i\u000f¢¦\u0088\u0012\u0096>\u007f³ö°á¶è\u0018'¢$>ø§\u0002¨\u008et]\u0084nO\u0004T\u007f¡Cx\u0003J\u0013ø\u0010&\u0000±výÑ\u0091êa\u0013ô9*\u008b\u008e\u000b\u0010\u0019|©Bkõ¡lô\u0001\u0080\u0098ÝÅãæ(`¬èº\u0013uÖi\u008fçÍè\u001cÃÈÈó\u001eZ®Â#£\u0097\u0002\u000e{è¿ìË[ºízÁúR\u008d\u0085\u0018x\u009dÒ5\u0012¸Ú\r)j\u0090ZtøÁ1é\u0091ønõ\u0089ö9";
int var17 = ")Ìb\u0087Û\u0086§rxí[Ñd\u0082Ò\ba8\u0013ÓFa:+ÕB*qO\u0006ðq(Å¬T°\u0003T÷\u008dÛ¯ð\u0001&ÒúäÌõ\u00ad\u0004!µÜ\u0005ÃN\u0091]¥\u0096\u000b°?ÂÇâP\\\u0096Ù\u0010¼ã*ñä\tÌÀ§\u008eN\n(m\u001dt\u0010\u0019ß\u0016Qz)\u009b?ÃÉ\u0094vZ¡ÖU\u0018Úø e)\u0014-f\u0019\u0084\u0082\u0007ÂUîV/\u0088\u0004tM3§Ú \u0088Îïò9\u0007\u0096Hs/\tÀQ'Á\u009fó«\u0083¦H)bGô\u0084g\u0091ßH\u000eÊ I\u0007$Ç\u0096\bx=s\u001d\u000eÝ\u000b\u009a\u0081'åÊo\u0010iøUi©\u001d¯9\u00900ß«\u0018~\u001f\u00994t\u001cÏ<ÒíêÄcÌÞªM\u000bO\u0083ùþß\u009f T8\u009a\u0000ÀæojV¼\u0082²êèéÅY\u00adXsårõ\bE\u0011ü¶* .I(+éß\u0012,ª1\u009ca6 aB{, SÌãR\u000f¢\u000eëQsú²²\u008c\u009aB7Vµ\nÚO\u0012\u008a ?\u0084\u0011Ñ³\u00adm\u0001\u001eU\u0091!Â&+^\u0005Âô«¸á\u0099³[\u0081\u0084X¿÷:Í(6½\u001cÙ4\u0081½xù\u000fè©ií\u000e\u008c\u0095\u0016£Å\u0099}ìBHWí\u00996bØH\u0004\u0082ÏM@â\u0018à \u009b@\nÎ,\u001e¦âÖ\u0098ýÌûÑî°_ý#\u007f\u0087\u0098ú\u009eWê\u0098hÓÔäÿ\u0010\u0006¶ßîb¡ñ4Ðü2ÄÓ)Ó\u00998þ:y«°Mò«\u0019ðýxJ¡óu3ý\u008a\u00adÏP@é\u0004F=h\u0017\u0019Ù`ç\u0083kO\u0094Ç\u0001w\u007f\u0092¨2ôÈ¼\u00050ÓÊ\u0019\u0003´÷\u0088 XæØ&zÿh)<\u0081È\u00973:Á¿\u001atÜ\u0014\u008f\u0092öÏ[Í\u0087;\u0095ní)\u0010¯\nfo\u009b,[ô\u0080\u0006\u000eñ\u0086\u009b2/8\røI/²?ØæÂÖ~\u001b«º°Iz\u001c3Àã\u0091\u0097·`Û,\u007få\u0002Ù\u0088-\u0007\u0082ú(\\ãge[¸´+-\u008a\u008bÎúöº÷Ã\u001c\u008c 73TÇ×c\f\u0094.\u0095¼ Õa2J7\u0013\u0099ä~\u0084I¤\u009e\u0090<\u0087.V\u0018 \u0010\u00178¤Ùªwâ&·\u0090#^Uê§» <{îv8Ô>âÀÈ_¨MüMn\u0012Ïà\u0001!ö\b\u001c×ÞDË\u008dzDÞ\u0010\u0099ó\u0092MÍ\u007föÓ4o^\u0004S\bÅÖ(|\u009fÿTÝ\u008a¼¥\u008ch\u0092\u0003LPoDsúp\u0088-¼[ïýq¶\u0086Ù¾GOc\u001a\u0001y$\u0002&>0áÃ\u0091ÀBªëR|\u0005ÕÎz¬\u0083`ID\"\u008dL\u0006Ì\u0014Ë.åÄ\u0019øC ù\u0002\u001b3¦¶\u009c½¼{;ñ\u009c\u009aG\u000f\u0018¦Ï\u008e\néVO\u0000ü>CU\u0082\u00001Týi}+_ÅÆ=\u0010¹i\u000f¢¦\u0088\u0012\u0096>\u007f³ö°á¶è\u0018'¢$>ø§\u0002¨\u008et]\u0084nO\u0004T\u007f¡Cx\u0003J\u0013ø\u0010&\u0000±výÑ\u0091êa\u0013ô9*\u008b\u008e\u000b\u0010\u0019|©Bkõ¡lô\u0001\u0080\u0098ÝÅãæ(`¬èº\u0013uÖi\u008fçÍè\u001cÃÈÈó\u001eZ®Â#£\u0097\u0002\u000e{è¿ìË[ºízÁúR\u008d\u0085\u0018x\u009dÒ5\u0012¸Ú\r)j\u0090ZtøÁ1é\u0091ønõ\u0089ö9"
.length();
char var14 = ' ';
int var32 = -1;

label54:
while (true) {
String var33 = var15.substring(++var32, var32 + var14);
byte var37 = -1;

while (true) {
byte[] var19 = var11.doFinal(var33.getBytes("ISO-8859-1"));
String var45 = b(var19).intern();
switch (var37) {
case 0:
var18[var16++] = var45;
if ((var32 += var14) >= var17) {
b = var18;
c = new String[33];
j = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[12];
int var3 = 0;
String var4 = "\u009b\u0013\u000bÄ\u0001È\fE\u008cD\u008bÜ´k\u008c\u0007\u008bï»k8±\u0016ÂP*\u000e\u008e£¼¸Ák_û\u0019ç\u0013\t\u001e\"\u0011¤ÐÖ J,^\u007fùyù~ç=\u009cÃ^61>½«B,N¿\u009b\u0000\u0015\u001f\u00adc\"cÙË2ò";
int var5 = "\u009b\u0013\u000bÄ\u0001È\fE\u008cD\u008bÜ´k\u008c\u0007\u008bï»k8±\u0016ÂP*\u000e\u008e£¼¸Ák_û\u0019ç\u0013\t\u001e\"\u0011¤ÐÖ J,^\u007fùyù~ç=\u009cÃ^61>½«B,N¿\u009b\u0000\u0015\u001f\u00adc\"cÙË2ò"
.length();
byte var2 = 0;

label36:
while (true) {
byte var41 = var2;
var2 += 8;
byte[] var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
long[] var36 = var6;
int var42 = var3++;
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
var36[var42] = var54;
if (var2 >= var5) {
g = var6;
h = new Integer[12];
KProperty[] var29 = new KProperty[c<"u">(28208, 3018967644140506279L ^ var20)];
var29[0] = Reflection.property1(
new PropertyReference1Impl(u3.class, b<"o">(31454, 5081516935439617562L ^ var20), b<"o">(27025, 806087311821774150L ^ var20), 0)
);
var29[1] = Reflection.property1(
new PropertyReference1Impl(u3.class, b<"o">(13204, 2919457110411298636L ^ var20), b<"o">(26320, 8819989434162188823L ^ var20), 0)
);
var29[2] = Reflection.property1(new PropertyReference1Impl(u3.class, b<"o">(5367, 3576331677636943929L ^ var20), b<"o">(6924, 8126081228244217793L ^ var20), 0));
var29[3] = Reflection.property1(new PropertyReference1Impl(u3.class, b<"o">(22543, 320787494645869789L ^ var20), b<"o">(2578, 6728717439298600659L ^ var20), 0));
var29[4] = Reflection.property1(
new PropertyReference1Impl(u3.class, b<"o">(9104, 2495784730670913349L ^ var20), b<"o">(15694, 3076404495127890327L ^ var20), 0)
);
var29[5] = Reflection.property1(new PropertyReference1Impl(u3.class, b<"o">(2044, 4358824386488824614L ^ var20), b<"o">(29958, 833627964230042066L ^ var20), 0));
var29[c<"u">(26809, 4906400573783542309L ^ var20)] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(u3.class, b<"o">(948, 3515549326683535229L ^ var20), b<"o">(7905, 4478235650818599465L ^ var20), 0)
);
L = var29;
N = new u3((char)var22, (short)var23, var24);
I = yp.L(N, b<"o">(81, 999974754580034708L ^ var20), wm.VANILLA, null, null, c<"u">(20370, 5130541071313513731L ^ var20), null, var27);
T = yp.t(N, b<"o">(1934, 1380032197379486546L ^ var20), false, var25, null, u3::e, 4, null);
f = yp.t(N, b<"o">(6626, 6777307417619426593L ^ var20), false, var25, null, u3::x, 4, null);
Y = yp.t(N, b<"o">(25132, 866057167771408106L ^ var20), true, var25, null, u3::h, 4, null);
i = yp.t(N, b<"o">(3866, 3979245325062241225L ^ var20), true, var25, null, u3::F, 4, null);
P = yp.t(N, b<"o">(26610, 7385462635455550255L ^ var20), true, var25, null, u3::D, 4, null);
d = yp.L(N, b<"o">(13273, 2431214898000054031L ^ var20), f9.SILENT_FULL, null, u3::s, 4, null, var27);
X = new bg();
return;
}
break;
default:
var36[var42] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "B>bq~\b25þåSÎ\u0005\u009cø,";
var5 = "B>bq~\b25þåSÎ\u0005\u009cø,".length();
var2 = 0;
}

byte var43 = var2;
var2 += 8;
var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
var36 = var6;
var42 = var3++;
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

var14 = var15.charAt(var32);
break;
default:
var18[var16++] = var45;
if ((var32 += var14) < var17) {
var14 = var15.charAt(var32);
continue label54;
}

var15 = "\u00054\u0011\u0013üKJ³ÄÓæï\u0096D\u0095Gz\u0018O\u008a·\u0018°Ùë*s6K\u0012H0\u0010\u0099XzÓt\u009c¸\u008f\u0089O\u0013Ò·\u0019XK";
var17 = "\u00054\u0011\u0013üKJ³ÄÓæï\u0096D\u0095Gz\u0018O\u008a·\u0018°Ùë*s6K\u0012H0\u0010\u0099XzÓt\u009c¸\u008f\u0089O\u0013Ò·\u0019XK".length();
var14 = ' ';
var32 = -1;
}

var33 = var15.substring(++var32, var32 + var14);
var37 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27390;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/u3", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/u3" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31917;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/u3", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/u3" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
