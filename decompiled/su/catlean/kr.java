package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class kr extends _g {
@NotNull
public static final kr j;
static final KProperty[] U;
@NotNull
private static final cs z;
@NotNull
private static final cs d;
@NotNull
private static final ct O;
@NotNull
private static final c8 G;
@NotNull
private static final HashMap E;
@NotNull
private static final ArrayList a;
@NotNull
private static final DecimalFormat w;
private static final long b = yz.a(238869510665001619L, -7529362997906066858L, MethodHandles.lookup().lookupClass()).a(50413436651046L);
private static final String[] c;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private kr(short var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 114024060182481L;
super(b<"j">(31771, 5613327804134267125L ^ var4), jt.F(), null, 4, null, var6);
}

private final Color M(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 90685617466705L;
return (Color)z.E(this, var3, U[0]);
}

private final Color H(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 110180484534491L;
return (Color)d.E(this, var3, U[1]);
}

private final float q(byte var1, int var2, int var3) {
long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ b;
long var6 = var4 ^ 111063559837634L;
return ((Number)O.E(this, var6, U[2])).floatValue();
}

private final int C(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ b;
long var6 = var4 ^ 96768658990578L;
return ((Number)G.E(this, var6, U[3])).intValue();
}

@NotNull
public final DecimalFormat g() {
return w;
}

@Override
public void O(long var1) {
a.clear();
E.clear();
}

@Flow
private final void a(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kr.b J
// 003: ldc2_w 116798799083942
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 44328572902586
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 49308848394314
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 21123786846969
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 18834738285662
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w 6774304728335131188
// 029: lload 2
// 02a: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: lload 8
// 031: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 034: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 037: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 03c: astore 13
// 03e: astore 12
// 040: aload 13
// 042: invokeinterface java/util/Iterator.hasNext ()Z 1
// 047: ifeq 1c3
// 04a: aload 13
// 04c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 051: dup
// 052: sipush 27619
// 055: ldc2_w 2998603601325416253
// 058: lload 2
// 059: lxor
// 05a: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 062: checkcast net/minecraft/class_1297
// 065: astore 14
// 067: lload 10
// 069: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06c: aload 14
// 06e: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
// 071: ldc 10.0
// 073: fcmpl
// 074: aload 12
// 076: ifnull 1d3
// 079: aload 12
// 07b: ifnull 0b2
// 07e: goto 08b
// 081: ldc2_w 6835663167043645480
// 084: lload 2
// 085: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: athrow
// 08b: ifgt 040
// 08e: goto 09b
// 091: ldc2_w 6835663167043645480
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: aload 14
// 09d: aload 12
// 09f: ifnull 0d4
// 0a2: instanceof net/minecraft/class_1309
// 0a5: goto 0b2
// 0a8: ldc2_w 6835663167043645480
// 0ab: lload 2
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: ifne 0b8
// 0b5: goto 040
// 0b8: getstatic su/catlean/kr.E Ljava/util/HashMap;
// 0bb: aload 14
// 0bd: checkcast net/minecraft/class_1309
// 0c0: invokevirtual net/minecraft/class_1309.method_5628 ()I
// 0c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 0c6: aload 14
// 0c8: checkcast net/minecraft/class_1309
// 0cb: invokevirtual net/minecraft/class_1309.method_6063 ()F
// 0ce: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 0d1: invokevirtual java/util/HashMap.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
// 0d4: checkcast java/lang/Float
// 0d7: dup
// 0d8: ifnull 0eb
// 0db: invokevirtual java/lang/Float.floatValue ()F
// 0de: goto 0ee
// 0e1: ldc2_w 6835663167043645480
// 0e4: lload 2
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: pop
// 0ec: ldc 20.0
// 0ee: fstore 15
// 0f0: aload 14
// 0f2: checkcast net/minecraft/class_1309
// 0f5: invokevirtual net/minecraft/class_1309.method_6032 ()F
// 0f8: aload 14
// 0fa: checkcast net/minecraft/class_1309
// 0fd: invokevirtual net/minecraft/class_1309.method_6067 ()F
// 100: fadd
// 101: fstore 16
// 103: getstatic su/catlean/kr.E Ljava/util/HashMap;
// 106: checkcast java/util/Map
// 109: aload 14
// 10b: checkcast net/minecraft/class_1309
// 10e: invokevirtual net/minecraft/class_1309.method_5628 ()I
// 111: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 114: fload 16
// 116: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 119: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 11e: pop
// 11f: fload 15
// 121: fload 16
// 123: fcmpg
// 124: aload 12
// 126: ifnull 13a
// 129: ifne 13d
// 12c: goto 139
// 12f: ldc2_w 6835663167043645480
// 132: lload 2
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: bipush 1
// 13a: goto 13e
// 13d: bipush 0
// 13e: ifeq 153
// 141: aload 12
// 143: ifnonnull 040
// 146: goto 153
// 149: ldc2_w 6835663167043645480
// 14c: lload 2
// 14d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: athrow
// 153: getstatic su/catlean/kr.a Ljava/util/ArrayList;
// 156: new su/catlean/fh
// 159: dup
// 15a: aload 14
// 15c: fload 16
// 15e: fload 15
// 160: fsub
// 161: aload 14
// 163: checkcast net/minecraft/class_1309
// 166: invokevirtual net/minecraft/class_1309.method_23317 ()D
// 169: lload 6
// 16b: ldc2_w -0.5
// 16e: ldc2_w 0.5
// 171: bipush 0
// 172: bipush 4
// 173: aconst_null
// 174: invokestatic su/catlean/mf.a (JDDZILjava/lang/Object;)D
// 177: dadd
// 178: aload 14
// 17a: checkcast net/minecraft/class_1309
// 17d: invokevirtual net/minecraft/class_1309.method_23318 ()D
// 180: aload 14
// 182: checkcast net/minecraft/class_1309
// 185: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
// 188: invokevirtual net/minecraft/class_238.method_17940 ()D
// 18b: fconst_2
// 18c: f2d
// 18d: ddiv
// 18e: dadd
// 18f: aload 14
// 191: checkcast net/minecraft/class_1309
// 194: invokevirtual net/minecraft/class_1309.method_23321 ()D
// 197: lload 6
// 199: ldc2_w -0.5
// 19c: ldc2_w 0.5
// 19f: bipush 0
// 1a0: bipush 4
// 1a1: aconst_null
// 1a2: invokestatic su/catlean/mf.a (JDDZILjava/lang/Object;)D
// 1a5: dadd
// 1a6: bipush 0
// 1a7: lload 4
// 1a9: sipush 18170
// 1ac: ldc2_w 5301556505482452443
// 1af: lload 2
// 1b0: lxor
// 1b1: invokedynamic h (IJ)I bsm=su/catlean/kr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: aconst_null
// 1b7: invokespecial su/catlean/fh.<init> (Lnet/minecraft/class_1297;FDDDIJILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 1ba: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 1bd: pop
// 1be: aload 12
// 1c0: ifnonnull 040
// 1c3: getstatic su/catlean/kr.a Ljava/util/ArrayList;
// 1c6: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/kr.F (Lsu/catlean/fh;)Z, (Lsu/catlean/fh;)Ljava/lang/Boolean; ]
// 1cb: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/kr.O (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 1d0: invokevirtual java/util/ArrayList.removeIf (Ljava/util/function/Predicate;)Z
// 1d3: pop
// 1d4: return
}

@Flow
private final void f(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kr.b J
// 003: ldc2_w 11104974863007
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 51592461379136
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 20734482731881
// 014: lxor
// 015: dup2
// 016: bipush 8
// 018: lushr
// 019: lstore 6
// 01b: dup2
// 01c: bipush 56
// 01e: lshl
// 01f: bipush 56
// 021: lushr
// 022: l2i
// 023: istore 8
// 025: pop2
// 026: dup2
// 027: ldc2_w 25127034610257
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 27089683274698
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 79315259342450
// 038: lxor
// 039: dup2
// 03a: bipush 48
// 03c: lushr
// 03d: l2i
// 03e: istore 13
// 040: dup2
// 041: bipush 16
// 043: lshl
// 044: bipush 32
// 046: lushr
// 047: l2i
// 048: istore 14
// 04a: dup2
// 04b: bipush 48
// 04d: lshl
// 04e: bipush 48
// 050: lushr
// 051: l2i
// 052: istore 15
// 054: pop2
// 055: dup2
// 056: ldc2_w 68056071085322
// 059: lxor
// 05a: lstore 16
// 05c: pop2
// 05d: getstatic su/catlean/kr.a Ljava/util/ArrayList;
// 060: checkcast java/lang/Iterable
// 063: astore 28
// 065: ldc2_w 6717763578781442317
// 068: lload 2
// 069: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: bipush 0
// 06f: istore 29
// 071: astore 27
// 073: aload 28
// 075: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 07a: astore 30
// 07c: aload 30
// 07e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 083: ifeq 1bd
// 086: aload 30
// 088: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 08d: astore 31
// 08f: aload 31
// 091: checkcast su/catlean/fh
// 094: astore 32
// 096: bipush 0
// 097: istore 33
// 099: getstatic su/catlean/kr.j Lsu/catlean/kr;
// 09c: lload 6
// 09e: iload 8
// 0a0: i2b
// 0a1: invokespecial su/catlean/kr.C (JB)I
// 0a4: i2f
// 0a5: fconst_2
// 0a6: fdiv
// 0a7: fstore 34
// 0a9: aload 27
// 0ab: ifnull 1be
// 0ae: aload 32
// 0b0: invokevirtual su/catlean/fh.k ()I
// 0b3: i2f
// 0b4: fload 34
// 0b6: aload 27
// 0b8: ifnull 101
// 0bb: goto 0c8
// 0be: ldc2_w 6765610937213956881
// 0c1: lload 2
// 0c2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: athrow
// 0c8: fcmpg
// 0c9: ifge 0f4
// 0cc: goto 0d9
// 0cf: ldc2_w 6765610937213956881
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 32
// 0db: invokevirtual su/catlean/fh.k ()I
// 0de: i2f
// 0df: ldc 4.0
// 0e1: fdiv
// 0e2: fconst_0
// 0e3: fconst_1
// 0e4: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
// 0e7: goto 102
// 0ea: ldc2_w 6765610937213956881
// 0ed: lload 2
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: fconst_1
// 0f5: aload 32
// 0f7: invokevirtual su/catlean/fh.k ()I
// 0fa: i2f
// 0fb: fload 34
// 0fd: fsub
// 0fe: fload 34
// 100: fdiv
// 101: fsub
// 102: fstore 35
// 104: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 107: getstatic su/catlean/kr.j Lsu/catlean/kr;
// 10a: pop
// 10b: getstatic su/catlean/kr.w Ljava/text/DecimalFormat;
// 10e: aload 32
// 110: invokevirtual su/catlean/fh.Z ()F
// 113: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
// 116: invokevirtual java/text/DecimalFormat.format (Ljava/lang/Object;)Ljava/lang/String;
// 119: dup
// 11a: sipush 595
// 11d: ldc2_w 2962707729883706787
// 120: lload 2
// 121: lxor
// 122: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 127: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12a: new net/minecraft/class_243
// 12d: dup
// 12e: aload 32
// 130: invokevirtual su/catlean/fh.z ()D
// 133: aload 32
// 135: invokevirtual su/catlean/fh.D ()D
// 138: aload 32
// 13a: invokevirtual su/catlean/fh.M ()D
// 13d: invokespecial net/minecraft/class_243.<init> (DDD)V
// 140: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 143: aload 32
// 145: invokevirtual su/catlean/fh.Z ()F
// 148: fconst_0
// 149: fcmpl
// 14a: ifle 162
// 14d: getstatic su/catlean/kr.j Lsu/catlean/kr;
// 150: lload 11
// 152: invokespecial su/catlean/kr.M (J)Ljava/awt/Color;
// 155: goto 16a
// 158: ldc2_w 6765610937213956881
// 15b: lload 2
// 15c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: athrow
// 162: getstatic su/catlean/kr.j Lsu/catlean/kr;
// 165: lload 4
// 167: invokespecial su/catlean/kr.H (J)Ljava/awt/Color;
// 16a: iload 13
// 16c: i2c
// 16d: iload 14
// 16f: fload 35
// 171: iload 15
// 173: i2s
// 174: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 177: fconst_0
// 178: fconst_0
// 179: bipush 1
// 17a: lload 16
// 17c: invokestatic su/catlean/b8.h (J)Lsu/catlean/c6;
// 17f: sipush 26394
// 182: ldc2_w 725523851078729475
// 185: lload 2
// 186: lxor
// 187: invokedynamic h (IJ)I bsm=su/catlean/kr.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: aconst_null
// 18d: astore 18
// 18f: istore 19
// 191: astore 20
// 193: istore 21
// 195: fstore 22
// 197: fstore 23
// 199: astore 24
// 19b: astore 25
// 19d: astore 26
// 19f: lload 9
// 1a1: aload 26
// 1a3: aload 25
// 1a5: aload 24
// 1a7: fload 23
// 1a9: fload 22
// 1ab: iload 21
// 1ad: aload 20
// 1af: iload 19
// 1b1: aload 18
// 1b3: invokestatic su/catlean/zi.h (Lsu/catlean/zi;JLjava/lang/String;Lnet/minecraft/class_243;Ljava/awt/Color;FFZLsu/catlean/c6;ILjava/lang/Object;)V
// 1b6: nop
// 1b7: nop
// 1b8: aload 27
// 1ba: ifnonnull 07c
// 1bd: nop
// 1be: return
}

private static final boolean F(fh param0) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kr.b J
// 03: ldc2_w 118469240965023
// 06: lxor
// 07: lstore 1
// 08: lload 1
// 09: dup2
// 0a: ldc2_w 126982023605865
// 0d: lxor
// 0e: dup2
// 0f: bipush 8
// 11: lushr
// 12: lstore 3
// 13: dup2
// 14: bipush 56
// 16: lshl
// 17: bipush 56
// 19: lushr
// 1a: l2i
// 1b: istore 5
// 1d: pop2
// 1e: pop2
// 1f: aload 0
// 20: sipush 17557
// 23: ldc2_w 3084666163607522919
// 26: lload 1
// 27: lxor
// 28: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 30: ldc2_w -2289469326207378419
// 33: lload 1
// 34: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39: aload 0
// 3a: invokevirtual su/catlean/fh.k ()I
// 3d: istore 7
// 3f: aload 0
// 40: iload 7
// 42: bipush 1
// 43: iadd
// 44: invokevirtual su/catlean/fh.J (I)V
// 47: astore 6
// 49: iload 7
// 4b: aload 6
// 4d: ifnull 78
// 50: getstatic su/catlean/kr.j Lsu/catlean/kr;
// 53: lload 3
// 54: iload 5
// 56: i2b
// 57: invokespecial su/catlean/kr.C (JB)I
// 5a: if_icmplt 7b
// 5d: goto 6a
// 60: ldc2_w -2241623919869030895
// 63: lload 1
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: bipush 1
// 6b: goto 78
// 6e: ldc2_w -2241623919869030895
// 71: lload 1
// 72: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77: athrow
// 78: goto 7c
// 7b: bipush 0
// 7c: ireturn
}

private static final boolean O(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = b ^ 43362904450417L;
long var22 = var20 ^ 118691247803258L;
long var24 = var20 ^ 127951355136082L;
long var10001 = var20 ^ 107687852255865L;
int var26 = (int)((var20 ^ 107687852255865L) >>> 48);
int var27 = (int)((var20 ^ 107687852255865L) << 16 >>> 48);
int var28 = (int)(var10001 << 32 >>> 32);
int var29 = (int)((var20 ^ 46034573823905L) >>> 48);
long var30 = (var20 ^ 46034573823905L) << 16 >>> 16;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[19];
int var16 = 0;
String var15 = "k\u008c«Ö\t^.¤\u001aª\u0094/°÷0ú\u0091©Hô=\rhXn·8\u001e\u0010St£\u001dï=¼8¿É%\u009fï& St4Å¾\u0018íËr>Ý>\u0010æ8\u0090\u001cO+PÊâ1£Õ\u001eNüü0\u008ciêò¼g\u0082$NÞ·ta{~ù\u0019Ú¾Nc\u0004´\u009bà\u0082£\u0083÷\u0000¥ÄÉFß\u0089átû\u008a=û½SìØàx\u0010[\u0017.\u0016>î\b\u001eK*\t>\u008dnèä\u0018qM1#ös#}jK\u0084Ö]ZFò\u0099a\u0015aiô\u009b6\u0010°¡oÕV)* Þ2+Å\u008aÖ1ñ ~¼+\u0084(È\u0083þ\u00866\u0098r\u009aWâ¾\u0098bd5h\u0017s2\u0090CÎé` 0¼ dôá\u0011ó\u0098\u0080\r\u0017\u0004Ü,\u0005tî\b\u0083ÌPÆ£.3¦Õ·#j@$¦h\u0010¼%Ï\u001b\u000b³|@AsÄxÿ ©ã\u0010)\u001b4Ü\u0017e\u000b%úd\u0011ýW9\u001bÝ\u0010áv)ÐÇ\"ÑYCÙ5\u0017«¶\u0081d\u0010C\u0085A\u0089±¶\u0081Z±!8ê\u008b}#1 PRÒEÎÛ:v\u0083\u008fßü\u008d\u0089Ê\u0013ü'ØÉC(EÆ®\u001a\u0089\u009aCïö# \\\u001c4Ïz\u008e\u009cpÆo\u009eÔ ¯p9þ/\u009f¾¾\u0003óGß\u0010®ì×\u008ciü(tb¯\u0096\u0088ãooHYº_\u000bô\u0094%\u0018x(Ò?\fFo;\u008e^ôq\u0001\u0080Ù\u009axçÿCm\u009cW\u0010cfk\u0091\u008cLÛ\f4\u0084ûþ\u0096\u008düé\u0018ûëæ*/i[Ø\u008fû\u0088]\u0003`0$\u0085©Â½'=§Z";
int var17 = "k\u008c«Ö\t^.¤\u001aª\u0094/°÷0ú\u0091©Hô=\rhXn·8\u001e\u0010St£\u001dï=¼8¿É%\u009fï& St4Å¾\u0018íËr>Ý>\u0010æ8\u0090\u001cO+PÊâ1£Õ\u001eNüü0\u008ciêò¼g\u0082$NÞ·ta{~ù\u0019Ú¾Nc\u0004´\u009bà\u0082£\u0083÷\u0000¥ÄÉFß\u0089átû\u008a=û½SìØàx\u0010[\u0017.\u0016>î\b\u001eK*\t>\u008dnèä\u0018qM1#ös#}jK\u0084Ö]ZFò\u0099a\u0015aiô\u009b6\u0010°¡oÕV)* Þ2+Å\u008aÖ1ñ ~¼+\u0084(È\u0083þ\u00866\u0098r\u009aWâ¾\u0098bd5h\u0017s2\u0090CÎé` 0¼ dôá\u0011ó\u0098\u0080\r\u0017\u0004Ü,\u0005tî\b\u0083ÌPÆ£.3¦Õ·#j@$¦h\u0010¼%Ï\u001b\u000b³|@AsÄxÿ ©ã\u0010)\u001b4Ü\u0017e\u000b%úd\u0011ýW9\u001bÝ\u0010áv)ÐÇ\"ÑYCÙ5\u0017«¶\u0081d\u0010C\u0085A\u0089±¶\u0081Z±!8ê\u008b}#1 PRÒEÎÛ:v\u0083\u008fßü\u008d\u0089Ê\u0013ü'ØÉC(EÆ®\u001a\u0089\u009aCïö# \\\u001c4Ïz\u008e\u009cpÆo\u009eÔ ¯p9þ/\u009f¾¾\u0003óGß\u0010®ì×\u008ciü(tb¯\u0096\u0088ãooHYº_\u000bô\u0094%\u0018x(Ò?\fFo;\u008e^ôq\u0001\u0080Ù\u009axçÿCm\u009cW\u0010cfk\u0091\u008cLÛ\f4\u0084ûþ\u0096\u008düé\u0018ûëæ*/i[Ø\u008fû\u0088]\u0003`0$\u0085©Â½'=§Z"
.length();
char var14 = '8';
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
byte var42 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var52 = b(var19).intern();
switch (var42) {
case 0:
var18[var16++] = var52;
if ((var35 += var14) >= var17) {
c = var18;
e = new String[19];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = "Y*=½øÒEåé¢0Ûz\u009e\u001bÆÉ-·Ûù\u0087\nà0jú\u00148µ\u001aCÍ\u009c\u0019z!¹&µ";
int var5 = "Y*=½øÒEåé¢0Ûz\u009e\u001bÆÉ-·Ûù\u0087\nà0jú\u00148µ\u001aCÍ\u009c\u0019z!¹&µ".length();
byte var2 = 0;

label36:
while (true) {
byte var46 = var2;
var2 += 8;
byte[] var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
int var47 = var3++;
long var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var61 = -1;

while (true) {
long var8 = var56;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var65 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var61) {
case 0:
var39[var47] = var65;
if (var2 >= var5) {
g = var6;
h = new Integer[7];
KProperty[] var32 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(kr.class, b<"j">(26343, 4054551368365870828L ^ var20), b<"j">(3642, 3723849803748730420L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kr.class, b<"j">(5583, 7916961492364852682L ^ var20), b<"j">(24657, 8303413926807373917L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kr.class, b<"j">(9932, 2826036878192168653L ^ var20), b<"j">(10301, 6677813724964372542L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(kr.class, b<"j">(28626, 7966790214362171359L ^ var20), b<"j">(15387, 3808323037708276753L ^ var20), 0))
};
U = var32;
j = new kr((short)var26, (char)var27, var28);
jk var40 = j;
short var49 = (short)var29;
String var58 = b<"j">(27790, 6996610284237587590L ^ var20);
Color var63 = Color.GREEN;
Intrinsics.checkNotNullExpressionValue(Color.GREEN, b<"j">(1883, 1057014032231231327L ^ var20));
z = yp.b(var40, var49, var58, var63, null, null, c<"h">(29825, 812419641778320242L ^ var20), null, var30);
jk var41 = j;
short var50 = (short)var29;
String var59 = b<"j">(22294, 8754162714223099668L ^ var20);
Color var64 = Color.RED;
Intrinsics.checkNotNullExpressionValue(Color.RED, b<"j">(29754, 2868771064345893949L ^ var20));
d = yp.b(var41, var50, var59, var64, null, null, c<"h">(28652, 8417010617687910428L ^ var20), null, var30);
O = yp.k(
j, b<"j">(14213, 1569579622349528970L ^ var20), 0.5F, var22, RangesKt.rangeTo(0.1F, 3.0F), null, null, c<"h">(10764, 6163720921237614072L ^ var20), null
);
G = yp.L(
j,
b<"j">(5851, 431192459969724125L ^ var20),
c<"h">(3363, 6741637966734936790L ^ var20),
new IntRange(5, c<"h">(14251, 7917880208876499033L ^ var20)),
var24,
null,
null,
c<"h">(26394, 725564908238676205L ^ var20),
null
);
E = new HashMap();
a = new ArrayList();
w = new DecimalFormat(b<"j">(5029, 5049866826964270010L ^ var20));
return;
}
break;
default:
var39[var47] = var65;
if (var2 < var5) {
continue label36;
}

var4 = "ER\n¾\"î¨uÏwÀÏ\u0082\u0003Ú\u0014";
var5 = "ER\n¾\"î¨uÏwÀÏ\u0082\u0003Ú\u0014".length();
var2 = 0;
}

byte var48 = var2;
var2 += 8;
var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
var39 = var6;
var47 = var3++;
var56 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var61 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var52;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "@a\u0081h\bû\u0085ðþµ7}l\u0016£I\u0010I<É\u0092ª½í\u0005îí\u009dé`Bòß";
var17 = "@a\u0081h\bû\u0085ðþµ7}l\u0016£I\u0010I<É\u0092ª½í\u0005îí\u009dé`Bòß".length();
var14 = 16;
var35 = -1;
}

var36 = var15.substring(++var35, var35 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27624;
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
throw new RuntimeException("su/catlean/kr", var10);
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
throw new RuntimeException("su/catlean/kr" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17424;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/kr", var14);
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
throw new RuntimeException("su/catlean/kr" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
