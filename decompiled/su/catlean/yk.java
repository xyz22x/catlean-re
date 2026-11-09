package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yk implements ym {
@NotNull
public static final yk l;
@NotNull
private static final ConcurrentHashMap v;
@NotNull
private static final ConcurrentHashMap n;
@NotNull
private static final ConcurrentHashMap K;
@NotNull
private static final ConcurrentHashMap g;
private static _g[] x;
private static final long a = yz.a(4988672442325891873L, -3532439275496439958L, MethodHandles.lookup().lookupClass()).a(14824217492474L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Long[] f;
private static final Map h;

private yk() {
}

@NotNull
public final ConcurrentHashMap A() {
return g;
}

public final void I(long a, @NotNull Pair crystal) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(crystal, a<"z">(23078, 5158292978347028430L ^ ax));
this.n(((Number)crystal.getFirst()).intValue(), zf.A());
this.O(crystal);
}

public final void o() {
v.clear();
n.clear();
K.clear();
}

public final void u(int var1, char var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = (var4 ^ 2275764462666L) >>> 16;
int var8 = (int)((var4 ^ 2275764462666L) << 48 >>> 48);
long var9 = zf.A();
long var11 = nf.f(nf.Z, null, var6, 1, (char)var8, null) * b<"q">(4020, 3345681685980772609L ^ var4);
v.entrySet().removeIf(yk::e);
n.entrySet().removeIf(yk::b);
K.entrySet().removeIf(yk::D);
g.entrySet().removeIf(yk::R);
}

public final boolean d(int id) {
return v.containsKey(id);
}

public final long Z(int id, long a) {
ax = a ^ ax;
Object var10000 = v.getOrDefault(id, b<"q">(2718, 8167347269938607353L ^ ax));
Intrinsics.checkNotNullExpressionValue(var10000, a<"z">(11701, 598790620748176008L ^ ax));
return ((Number)var10000).longValue();
}

@Nullable
public final Long n(int id, long deathTime) {
return v.putIfAbsent(id, deathTime);
}

public final boolean L(int id, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/yk.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 94799336257729
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -5086418146132331157
// 12: lload 2
// 13: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 6
// 1a: getstatic su/catlean/yk.n Ljava/util/concurrent/ConcurrentHashMap;
// 1d: iload 1
// 1e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 21: invokevirtual java/util/concurrent/ConcurrentHashMap.containsKey (Ljava/lang/Object;)Z
// 24: aload 6
// 26: ifnull 5c
// 29: ifeq 75
// 2c: goto 39
// 2f: ldc2_w -5080833848037512077
// 32: lload 2
// 33: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38: athrow
// 39: getstatic su/catlean/yk.n Ljava/util/concurrent/ConcurrentHashMap;
// 3c: iload 1
// 3d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 40: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
// 43: dup
// 44: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 47: checkcast su/catlean/je
// 4a: lload 4
// 4c: invokevirtual su/catlean/je.N (J)Z
// 4f: goto 5c
// 52: ldc2_w -5080833848037512077
// 55: lload 2
// 56: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b: athrow
// 5c: aload 6
// 5e: ifnull 72
// 61: ifeq 75
// 64: goto 71
// 67: ldc2_w -5080833848037512077
// 6a: lload 2
// 6b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70: athrow
// 71: bipush 1
// 72: goto 76
// 75: bipush 0
// 76: ireturn
}

private final void O(Pair var1) {
n.compute(var1.getFirst(), yk::U);
}

public final void E(short a, short a, @NotNull class_2338 blockPos, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 32
// 013: lshl
// 014: bipush 32
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/yk.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 15856538395201
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 107555093429111
// 02b: lxor
// 02c: lstore 9
// 02e: pop2
// 02f: ldc2_w 5674041559241818812
// 032: lload 5
// 034: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039: aload 3
// 03a: sipush 3879
// 03d: ldc2_w 472847726486586004
// 040: lload 5
// 042: lxor
// 043: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04b: astore 11
// 04d: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 050: aload 3
// 051: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// 054: dup
// 055: sipush 4557
// 058: ldc2_w 5719007132020808810
// 05b: lload 5
// 05d: lxor
// 05e: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 066: lload 7
// 068: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 06b: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 06e: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
// 071: dup
// 072: sipush 9721
// 075: ldc2_w 7514339940494190656
// 078: lload 5
// 07a: lxor
// 07b: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 083: lload 9
// 085: dup2_x1
// 086: pop2
// 087: invokevirtual su/catlean/ux.E (Lnet/minecraft/class_2338;JLjava/util/ArrayList;)Z
// 08a: istore 12
// 08c: getstatic su/catlean/yk.K Ljava/util/concurrent/ConcurrentHashMap;
// 08f: aload 3
// 090: aload 3
// 091: iload 12
// 093: invokedynamic invoke (Lnet/minecraft/class_2338;Z)Lkotlin/jvm/functions/Function2; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/yk.l (Lnet/minecraft/class_2338;ZLnet/minecraft/class_2338;Lsu/catlean/je;)Lsu/catlean/je;, (Lnet/minecraft/class_2338;Lsu/catlean/je;)Lsu/catlean/je; ]
// 098: invokedynamic apply (Lkotlin/jvm/functions/Function2;)Ljava/util/function/BiFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/yk.l (Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lsu/catlean/je;, (Ljava/lang/Object;Ljava/lang/Object;)Lsu/catlean/je; ]
// 09d: invokevirtual java/util/concurrent/ConcurrentHashMap.compute (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
// 0a0: pop
// 0a1: new net/minecraft/class_238
// 0a4: dup
// 0a5: aload 3
// 0a6: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 0a9: i2d
// 0aa: ldc2_w 0.5
// 0ad: dsub
// 0ae: aload 3
// 0af: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0b2: i2d
// 0b3: dconst_1
// 0b4: dadd
// 0b5: aload 3
// 0b6: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0b9: i2d
// 0ba: ldc2_w 0.5
// 0bd: dsub
// 0be: aload 3
// 0bf: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 0c2: i2d
// 0c3: ldc2_w 1.5
// 0c6: dadd
// 0c7: aload 3
// 0c8: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0cb: i2d
// 0cc: ldc2_w 3.0
// 0cf: dadd
// 0d0: aload 3
// 0d1: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0d4: i2d
// 0d5: ldc2_w 1.5
// 0d8: dadd
// 0d9: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 0dc: astore 13
// 0de: getstatic su/catlean/yk.g Ljava/util/concurrent/ConcurrentHashMap;
// 0e1: aload 13
// 0e3: aload 11
// 0e5: ifnull 112
// 0e8: invokevirtual java/util/concurrent/ConcurrentHashMap.containsKey (Ljava/lang/Object;)Z
// 0eb: ifne 11e
// 0ee: goto 0fc
// 0f1: ldc2_w 5668368995275152292
// 0f4: lload 5
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: getstatic su/catlean/yk.g Ljava/util/concurrent/ConcurrentHashMap;
// 0ff: checkcast java/util/Map
// 102: aload 13
// 104: goto 112
// 107: ldc2_w 5668368995275152292
// 10a: lload 5
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: invokestatic su/catlean/zf.A ()J
// 115: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 118: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 11d: pop
// 11e: aload 11
// 120: iload 4
// 122: iflt 12c
// 125: ifnonnull 144
// 128: bipush 2
// 129: anewarray 640
// 12c: ldc2_w 5669617451874665619
// 12f: lload 5
// 131: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 136: goto 144
// 139: ldc2_w 5668368995275152292
// 13c: lload 5
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: return
}

public final boolean Z(@NotNull class_2338 blockPos, short a, short a, int a, boolean ignoreMid) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 32
// 013: lshl
// 014: bipush 32
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/yk.a J
// 01b: lxor
// 01c: lstore 6
// 01e: aload 1
// 01f: sipush 24387
// 022: ldc2_w 3649808901444905445
// 025: lload 6
// 027: lxor
// 028: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 030: ldc2_w -5356922170531677782
// 033: lload 6
// 035: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: new net/minecraft/class_238
// 03d: dup
// 03e: aload 1
// 03f: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 042: i2d
// 043: ldc2_w 0.5
// 046: dsub
// 047: aload 1
// 048: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 04b: i2d
// 04c: dconst_1
// 04d: dadd
// 04e: aload 1
// 04f: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 052: i2d
// 053: ldc2_w 0.5
// 056: dsub
// 057: aload 1
// 058: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 05b: i2d
// 05c: ldc2_w 1.5
// 05f: dadd
// 060: aload 1
// 061: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 064: i2d
// 065: ldc2_w 3.0
// 068: dadd
// 069: aload 1
// 06a: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 06d: i2d
// 06e: ldc2_w 1.5
// 071: dadd
// 072: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 075: astore 9
// 077: getstatic su/catlean/yk.g Ljava/util/concurrent/ConcurrentHashMap;
// 07a: checkcast java/util/Map
// 07d: astore 10
// 07f: bipush 0
// 080: istore 11
// 082: astore 8
// 084: aload 10
// 086: aload 8
// 088: ifnull 0b2
// 08b: invokeinterface java/util/Map.isEmpty ()Z 1
// 090: ifeq 0b0
// 093: goto 0a1
// 096: ldc2_w -5351320313804857166
// 099: lload 6
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: bipush 0
// 0a2: goto 15a
// 0a5: ldc2_w -5351320313804857166
// 0a8: lload 6
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: aload 10
// 0b2: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 0b7: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 0bc: astore 12
// 0be: aload 12
// 0c0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c5: ifeq 159
// 0c8: aload 12
// 0ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0cf: checkcast java/util/Map$Entry
// 0d2: astore 13
// 0d4: aload 13
// 0d6: astore 14
// 0d8: bipush 0
// 0d9: istore 15
// 0db: aload 14
// 0dd: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 0e2: checkcast net/minecraft/class_238
// 0e5: aload 9
// 0e7: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 0ea: aload 8
// 0ec: ifnull 0f4
// 0ef: ifeq 147
// 0f2: iload 5
// 0f4: aload 8
// 0f6: ifnull 144
// 0f9: ifne 143
// 0fc: goto 10a
// 0ff: ldc2_w -5351320313804857166
// 102: lload 6
// 104: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: athrow
// 10a: aload 14
// 10c: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 111: checkcast net/minecraft/class_238
// 114: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 117: aload 9
// 119: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 11c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 11f: aload 8
// 121: ifnull 144
// 124: goto 132
// 127: ldc2_w -5351320313804857166
// 12a: lload 6
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: ifne 147
// 135: goto 143
// 138: ldc2_w -5351320313804857166
// 13b: lload 6
// 13d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: athrow
// 143: bipush 1
// 144: goto 148
// 147: bipush 0
// 148: ifeq 0be
// 14b: bipush 1
// 14c: aload 8
// 14e: iload 4
// 150: ifle 0ec
// 153: ifnull 0ea
// 156: goto 15a
// 159: bipush 0
// 15a: ldc2_w -5346057925544334497
// 15d: lload 6
// 15f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: iload 2
// 165: iflt 16f
// 168: ifnull 187
// 16b: bipush 3
// 16c: anewarray 640
// 16f: ldc2_w -5393210432074777164
// 172: lload 6
// 174: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: goto 187
// 17c: ldc2_w -5351320313804857166
// 17f: lload 6
// 181: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: athrow
// 187: ireturn
}

@Nullable
public final je E(@NotNull class_243 pos, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/yk.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 47827147479616
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 6626794796686612469
// 012: lload 2
// 013: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 1
// 019: sipush 17699
// 01c: ldc2_w 6921217082899324369
// 01f: lload 2
// 020: lxor
// 021: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 029: astore 6
// 02b: aconst_null
// 02c: astore 7
// 02e: getstatic su/catlean/yk.K Ljava/util/concurrent/ConcurrentHashMap;
// 031: invokevirtual java/util/concurrent/ConcurrentHashMap.entrySet ()Ljava/util/Set;
// 034: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 039: astore 8
// 03b: aload 8
// 03d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 042: ifeq 0cf
// 045: aload 8
// 047: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 04c: dup
// 04d: sipush 5048
// 050: ldc2_w 8864938241758759750
// 053: lload 2
// 054: lxor
// 055: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 05d: checkcast java/util/Map$Entry
// 060: astore 9
// 062: aload 9
// 064: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 069: dup
// 06a: sipush 4432
// 06d: ldc2_w 2520446498603796927
// 070: lload 2
// 071: lxor
// 072: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 07a: checkcast net/minecraft/class_2338
// 07d: astore 10
// 07f: aload 9
// 081: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 086: dup
// 087: sipush 14411
// 08a: ldc2_w 310307340821012646
// 08d: lload 2
// 08e: lxor
// 08f: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 097: checkcast su/catlean/je
// 09a: astore 11
// 09c: aload 1
// 09d: aload 10
// 09f: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 0a2: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 0a5: ldc2_w 0.3
// 0a8: dcmpg
// 0a9: ifge 03b
// 0ac: getstatic su/catlean/j2.X Lsu/catlean/j2;
// 0af: aload 10
// 0b1: lload 4
// 0b3: invokevirtual su/catlean/j2.Z (Lnet/minecraft/class_2338;J)V
// 0b6: aload 8
// 0b8: invokeinterface java/util/Iterator.remove ()V 1
// 0bd: aload 11
// 0bf: aload 6
// 0c1: lload 2
// 0c2: lconst_0
// 0c3: lcmp
// 0c4: iflt 087
// 0c7: ifnull 09a
// 0ca: astore 7
// 0cc: goto 0cf
// 0cf: getstatic su/catlean/yk.g Ljava/util/concurrent/ConcurrentHashMap;
// 0d2: invokevirtual java/util/concurrent/ConcurrentHashMap.entrySet ()Ljava/util/Set;
// 0d5: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 0da: astore 9
// 0dc: aload 9
// 0de: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0e3: ifeq 162
// 0e6: aload 9
// 0e8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0ed: dup
// 0ee: sipush 2860
// 0f1: ldc2_w 3504275146688238559
// 0f4: lload 2
// 0f5: lxor
// 0f6: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0fe: checkcast java/util/Map$Entry
// 101: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 106: dup
// 107: sipush 25975
// 10a: ldc2_w 1518040075881446799
// 10d: lload 2
// 10e: lxor
// 10f: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 117: checkcast net/minecraft/class_238
// 11a: astore 11
// 11c: aload 6
// 11e: lload 2
// 11f: lconst_0
// 120: lcmp
// 121: iflt 15f
// 124: ifnull 15d
// 127: aload 1
// 128: aload 11
// 12a: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 12d: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
// 130: ldc2_w 2.25
// 133: dcmpg
// 134: aload 6
// 136: ifnull 1a3
// 139: goto 146
// 13c: ldc2_w 6621192966536335085
// 13f: lload 2
// 140: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 145: athrow
// 146: ifge 0dc
// 149: goto 156
// 14c: ldc2_w 6621192966536335085
// 14f: lload 2
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: aload 9
// 158: invokeinterface java/util/Iterator.remove ()V 1
// 15d: aload 6
// 15f: ifnonnull 0dc
// 162: aload 7
// 164: aload 6
// 166: lload 2
// 167: lconst_0
// 168: lcmp
// 169: ifle 107
// 16c: ifnull 1a6
// 16f: ifnull 1a4
// 172: goto 17f
// 175: ldc2_w 6621192966536335085
// 178: lload 2
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: getstatic su/catlean/yk.K Ljava/util/concurrent/ConcurrentHashMap;
// 182: invokevirtual java/util/concurrent/ConcurrentHashMap.keySet ()Ljava/util/Set;
// 185: checkcast java/util/concurrent/ConcurrentHashMap$KeySetView
// 188: aload 1
// 189: invokedynamic invoke (Lnet/minecraft/class_243;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/yk.D (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Z, (Lnet/minecraft/class_2338;)Ljava/lang/Boolean; ]
// 18e: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/yk.O (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 193: invokevirtual java/util/concurrent/ConcurrentHashMap$KeySetView.removeIf (Ljava/util/function/Predicate;)Z
// 196: goto 1a3
// 199: ldc2_w 6621192966536335085
// 19c: lload 2
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: pop
// 1a4: aload 7
// 1a6: areturn
}

public final boolean z(long a, @NotNull class_2338 bp) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/yk.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 9215982980735
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -3470243428786699307
// 12: lload 1
// 13: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: aload 3
// 19: sipush 1170
// 1c: ldc2_w 6561048820442138702
// 1f: lload 1
// 20: lxor
// 21: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 29: astore 6
// 2b: aload 6
// 2d: ifnull 86
// 30: getstatic su/catlean/yk.K Ljava/util/concurrent/ConcurrentHashMap;
// 33: aload 3
// 34: invokevirtual java/util/concurrent/ConcurrentHashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
// 37: checkcast su/catlean/je
// 3a: dup
// 3b: ifnull 85
// 3e: goto 4b
// 41: ldc2_w -3475900603608720691
// 44: lload 1
// 45: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a: athrow
// 4b: lload 4
// 4d: invokevirtual su/catlean/je.N (J)Z
// 50: aload 6
// 52: ifnull 82
// 55: goto 62
// 58: ldc2_w -3475900603608720691
// 5b: lload 1
// 5c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: athrow
// 62: bipush 1
// 63: if_icmpne 81
// 66: goto 73
// 69: ldc2_w -3475900603608720691
// 6c: lload 1
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: bipush 1
// 74: goto 87
// 77: ldc2_w -3475900603608720691
// 7a: lload 1
// 7b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 80: athrow
// 81: bipush 0
// 82: goto 87
// 85: pop
// 86: bipush 0
// 87: ireturn
}

private static final boolean y(long var0, long var2, Entry var4) {
long var5 = a ^ 17584832544276L;
_g[] var10000 = vm.a<"Å">(-4826690284137123578L, var5);
Intrinsics.checkNotNullParameter(var4, a<"z">(20146, 4079790048782430396L ^ var5));
_g[] var7 = var10000;

try {
Object var10001 = var4.getValue();
Intrinsics.checkNotNullExpressionValue(var10001, a<"z">(14599, 4405977021093791490L ^ var5));
long var10;
int var9 = (var10 = var0 - ((Number)var10001).longValue() - var2) == 0L ? 0 : (var10 < 0L ? -1 : 1);
if (var7 == null) {
return (boolean)var9;
}

if (var9 > 0) {
return (boolean)1;
}
} catch (NumberFormatException var8) {
throw vm.a<"Å">(var8, -4823337679234897890L, var5);
}

return (boolean)0;
}

private static final boolean e(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean V(Entry var0) {
long var1 = a ^ 36112878394863L;
long var10001 = var1 ^ 75795524297058L;
int var3 = (int)((var1 ^ 75795524297058L) >>> 32);
int var4 = (int)((var1 ^ 75795524297058L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(var0, a<"z">(18391, 2285924288796367392L ^ var1));
return ((je)var0.getValue()).f(var3, (short)var4, var5);
}

private static final boolean b(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean h(Entry var0) {
long var1 = a ^ 53726267800015L;
long var10001 = var1 ^ 93367037822274L;
int var3 = (int)((var1 ^ 93367037822274L) >>> 32);
int var4 = (int)((var1 ^ 93367037822274L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
Intrinsics.checkNotNullParameter(var0, a<"z">(18391, 2285906675946208768L ^ var1));
return ((je)var0.getValue()).f(var3, (short)var4, var5);
}

private static final boolean D(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean a(Entry var0) {
long var1 = a ^ 93136657310777L;
long var3 = (var1 ^ 76071895662477L) >>> 16;
int var5 = (int)((var1 ^ 76071895662477L) << 48 >>> 48);
_g[] var10000 = vm.a<"Å">(2821924669790153515L, var1);
Intrinsics.checkNotNullParameter(var0, a<"z">(18391, 2285937909178770422L ^ var1));
_g[] var6 = var10000;

try {
long var8 = zf.A();
Object var10001 = var0.getValue();
Intrinsics.checkNotNullExpressionValue(var10001, a<"z">(9132, 199394577416701830L ^ var1));
double var10;
int var9 = (var10 = var8 - ((Number)var10001).longValue() - Math.max(nf.f(nf.Z, null, var3, 1, (char)var5, null) * 1.5, 50.0)) == 0.0
? 0
: (var10 < 0.0 ? -1 : 1);
if (var6 == null) {
return (boolean)var9;
}

if (var9 > 0) {
return (boolean)1;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 2827509207859720755L, var1);
}

return (boolean)0;
}

private static final boolean R(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final je C(Pair param0, int param1, je param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/yk.a J
// 03: ldc2_w 28261173846239
// 06: lxor
// 07: lstore 3
// 08: lload 3
// 09: dup2
// 0a: ldc2_w 88608504703563
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 5
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 32
// 1b: lushr
// 1c: lstore 6
// 1e: pop2
// 1f: dup2
// 20: ldc2_w 117222459808220
// 23: lxor
// 24: lstore 8
// 26: pop2
// 27: ldc2_w -6643037563774472243
// 2a: lload 3
// 2b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30: astore 10
// 32: aload 2
// 33: aload 10
// 35: ifnull 71
// 38: ifnonnull 68
// 3b: goto 48
// 3e: ldc2_w -6639685025711622443
// 41: lload 3
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: new su/catlean/je
// 4b: dup
// 4c: invokestatic su/catlean/zf.A ()J
// 4f: lload 8
// 51: bipush 1
// 52: aload 0
// 53: invokevirtual kotlin/Pair.getSecond ()Ljava/lang/Object;
// 56: checkcast net/minecraft/class_243
// 59: bipush 0
// 5a: invokespecial su/catlean/je.<init> (JJILnet/minecraft/class_243;Z)V
// 5d: areturn
// 5e: ldc2_w -6639685025711622443
// 61: lload 3
// 62: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67: athrow
// 68: aload 2
// 69: iload 5
// 6b: lload 6
// 6d: invokevirtual su/catlean/je.t (IJ)V
// 70: aload 2
// 71: areturn
}

private static final je U(Function2 var0, Object var1, Object var2) {
return var0.invoke(var1, var2);
}

private static final je l(class_2338 param0, boolean param1, class_2338 param2, je param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/yk.a J
// 03: ldc2_w 88679262104322
// 06: lxor
// 07: lstore 4
// 09: lload 4
// 0b: dup2
// 0c: ldc2_w 28062924317078
// 0f: lxor
// 10: dup2
// 11: bipush 32
// 13: lushr
// 14: l2i
// 15: istore 6
// 17: dup2
// 18: bipush 32
// 1a: lshl
// 1b: bipush 32
// 1d: lushr
// 1e: lstore 7
// 20: pop2
// 21: dup2
// 22: ldc2_w 39100673643009
// 25: lxor
// 26: lstore 9
// 28: pop2
// 29: ldc2_w 7499190036612883472
// 2c: lload 4
// 2e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: aload 2
// 34: sipush 23147
// 37: ldc2_w 6267120165345325435
// 3a: lload 4
// 3c: lxor
// 3d: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 45: astore 11
// 47: aload 3
// 48: aload 11
// 4a: ifnull 90
// 4d: ifnonnull 91
// 50: goto 5e
// 53: ldc2_w 7495767376230268168
// 56: lload 4
// 58: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: athrow
// 5e: new su/catlean/je
// 61: dup
// 62: invokestatic su/catlean/zf.A ()J
// 65: lload 9
// 67: bipush 1
// 68: aload 0
// 69: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 6c: dup
// 6d: sipush 9180
// 70: ldc2_w 2403525243325515970
// 73: lload 4
// 75: lxor
// 76: invokedynamic z (IJ)Ljava/lang/String; bsm=su/catlean/yk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 7e: bipush 1
// 7f: invokespecial su/catlean/je.<init> (JJILnet/minecraft/class_243;Z)V
// 82: goto 90
// 85: ldc2_w 7495767376230268168
// 88: lload 4
// 8a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8f: athrow
// 90: areturn
// 91: iload 1
// 92: ifne ab
// 95: aload 3
// 96: iload 6
// 98: lload 7
// 9a: invokevirtual su/catlean/je.t (IJ)V
// 9d: goto ab
// a0: ldc2_w 7495767376230268168
// a3: lload 4
// a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aa: athrow
// ab: aload 3
// ac: areturn
}

private static final je l(Function2 var0, Object var1, Object var2) {
return (je)var0.invoke(var1, var2);
}

private static final boolean D(class_243 var0, class_2338 var1) {
long var2 = a ^ 100537618070549L;
_g[] var4 = vm.a<"Å">(4541161470445875975L, var2);

try {
double var6;
int var10000 = (var6 = var0.method_1025(var1.method_46558()) - 0.3) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
if (var4 == null) {
return (boolean)var10000;
}

if (var10000 < 0) {
return (boolean)1;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 4544513974951143967L, var2);
}

return (boolean)0;
}

private static final boolean O(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 44824922767073L;
_g[] var10000 = new _g[3];
vm.a<"Å">(var10000, -180682762765912595L, var20);
Cipher var11;
Cipher var24 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var24.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[19];
int var16 = 0;
String var15 = "óN\u008eÌÞrÆ\u001dìÁD\u0097{VVß \u0092\u0088°à=ÅxonÝ$+sy¥]\u00ad-\u008fZ7#©Õ7»^y±\u0019 Å\u00104èpf%yâ\u0086Ze\u00839\u00ad\u00adM\u0017\u0010V\u0014Ô'lVâ(\u0088Íé¿hÚÔz mïl\u0086-ÓÆ\u009b\u0088&\u001cykXÉ\u0092[\u0000B0×\b½©\u0098²`³ eZ\r ßG\u0001ÜSiXòºÍk\u0082) ¡\u009cæ\u008eîÕ½Ä\u0005ÿ\u0001ûhùJ\u009d\u0018[\u0018ûsæ%a\u0018NÆuSt\u001buW/\u008b\u0092\u0086Kpsl´G Üj\u0002Ë\u0016ñGfC\u009eO$\u0012?Ïkr\u0082\u0085\u0088r¶ó\u008e\u0088ÛÜ\u009e\f\u0002Ü\u0011(C\u009c3\u0093½½Ã+\u0003\u0006\u008e\u009f\u0001a\u0098Ã\u008c\u0081Ä^å@ÐtS\u0083\u00919\u00adÏ°zËäâß\u0013\u0081$¹(e¿\\m\u001fcpüch}Ð\u001d]\u007fÂ\u0015Eï©S¾Ô Áì\u000fÔ\u0016ãÏ\u0016\u0000¤'BáK\u0094\u0092 Í¬X\fÌãÍg·1S§0\u0087û#Ã¿Â\u0083ü\u0004%ö\u0090O½×\u008dÕ\u001bñ(Ö\u0016\u008cÙ\u008fèÎp=\u0019×R~¾¹j|R(\u008ae\u001bdÞ\u0080Á.ÌÚ>\u0013n\"\u008c}Ê+ã\u0000Ê _¤Oö\u001e4\u0007jýt\u0086Ã*\u0093\u0014¨ðz+ X©ñF\nÒÿ\u000bQÅ\u0001\u001a\u0010\u00881\u000fÐ½D\rä\u0010Bµr%ú5b\u0010\u0084c]a\u0001\u0004üwu\u001f\u00912Õ\\>Q(Ã\nÀ¡\foÔ¾µw(f¥ç\u000e©µãìÇG9'¯<c\u009f8\u0004ã-)@º\u0007\u001cuYÎ\u0095\u0018Åø\u001d\u001b\u009f\u0091A\u000b×\u0096l\u0083\u0092\r×a>É R\u0089n\u008f\n";
int var17 = "óN\u008eÌÞrÆ\u001dìÁD\u0097{VVß \u0092\u0088°à=ÅxonÝ$+sy¥]\u00ad-\u008fZ7#©Õ7»^y±\u0019 Å\u00104èpf%yâ\u0086Ze\u00839\u00ad\u00adM\u0017\u0010V\u0014Ô'lVâ(\u0088Íé¿hÚÔz mïl\u0086-ÓÆ\u009b\u0088&\u001cykXÉ\u0092[\u0000B0×\b½©\u0098²`³ eZ\r ßG\u0001ÜSiXòºÍk\u0082) ¡\u009cæ\u008eîÕ½Ä\u0005ÿ\u0001ûhùJ\u009d\u0018[\u0018ûsæ%a\u0018NÆuSt\u001buW/\u008b\u0092\u0086Kpsl´G Üj\u0002Ë\u0016ñGfC\u009eO$\u0012?Ïkr\u0082\u0085\u0088r¶ó\u008e\u0088ÛÜ\u009e\f\u0002Ü\u0011(C\u009c3\u0093½½Ã+\u0003\u0006\u008e\u009f\u0001a\u0098Ã\u008c\u0081Ä^å@ÐtS\u0083\u00919\u00adÏ°zËäâß\u0013\u0081$¹(e¿\\m\u001fcpüch}Ð\u001d]\u007fÂ\u0015Eï©S¾Ô Áì\u000fÔ\u0016ãÏ\u0016\u0000¤'BáK\u0094\u0092 Í¬X\fÌãÍg·1S§0\u0087û#Ã¿Â\u0083ü\u0004%ö\u0090O½×\u008dÕ\u001bñ(Ö\u0016\u008cÙ\u008fèÎp=\u0019×R~¾¹j|R(\u008ae\u001bdÞ\u0080Á.ÌÚ>\u0013n\"\u008c}Ê+ã\u0000Ê _¤Oö\u001e4\u0007jýt\u0086Ã*\u0093\u0014¨ðz+ X©ñF\nÒÿ\u000bQÅ\u0001\u001a\u0010\u00881\u000fÐ½D\rä\u0010Bµr%ú5b\u0010\u0084c]a\u0001\u0004üwu\u001f\u00912Õ\\>Q(Ã\nÀ¡\foÔ¾µw(f¥ç\u000e©µãìÇG9'¯<c\u009f8\u0004ã-)@º\u0007\u001cuYÎ\u0095\u0018Åø\u001d\u001b\u009f\u0091A\u000b×\u0096l\u0083\u0092\r×a>É R\u0089n\u008f\n"
.length();
char var14 = 16;
int var23 = -1;

label45:
while (true) {
String var25 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var34 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var34;
if ((var23 += var14) >= var17) {
b = var18;
c = new String[19];
h = new HashMap(13);
Cipher var0;
Cipher var27 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var27.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "k\u009a  ì\u009bÏ]}«\u008b¸¹«DÝ";
int var5 = "k\u009a  ì\u009bÏ]}«\u008b¸¹«DÝ".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
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
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var39 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Long[2];
l = new yk();
v = new ConcurrentHashMap();
n = new ConcurrentHashMap();
K = new ConcurrentHashMap();
g = new ConcurrentHashMap();
return;
}

var14 = var15.charAt(var23);
break;
default:
var18[var16++] = var34;
if ((var23 += var14) < var17) {
var14 = var15.charAt(var23);
continue label45;
}

var15 = "å\u009f\u0018×Î-$U\u009eÖ\n\u0081óQÚ\u009e\u009c8\u000fXþ¯\u008d\\Ìöþ?\u0095\nð< ô\u009fPV.\u00150[©Y¦@¹¦;:ßF\u0010Ý,Z¬Ç\u001c¤IOùý\u0087\u0012";
var17 = "å\u009f\u0018×Î-$U\u009eÖ\n\u0081óQÚ\u009e\u009c8\u000fXþ¯\u008d\\Ìöþ?\u0095\nð< ô\u009fPV.\u00150[©Y¦@¹¦;:ßF\u0010Ý,Z¬Ç\u001c¤IOùý\u0087\u0012"
.length();
var14 = ' ';
var23 = -1;
}

var25 = var15.substring(++var23, var23 + var14);
var10001 = 0;
}
}
}

public static void f(_g[] var0) {
x = var0;
}

public static _g[] N() {
return x;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16959;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])d.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
d.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/yk", var10);
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
c[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/yk" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 19309;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
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
throw new RuntimeException("su/catlean/yk", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
f[var3] = var15;
}

return f[var3];
}

private static long b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = b(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
throw new RuntimeException("su/catlean/yk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
