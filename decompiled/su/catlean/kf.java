package su.catlean;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_10017;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1060;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_583;
import net.minecraft.class_591;
import net.minecraft.class_745;
import net.minecraft.class_897;
import net.minecraft.class_2703.class_2705;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class kf extends _g {
@NotNull
public static final kf G;
static final KProperty[] j;
@NotNull
private static final cw u;
@NotNull
private static final cs K;
@NotNull
private static final cq m;
@NotNull
private static final c8 c;
@NotNull
private static final c8 g;
@NotNull
private static final cq i;
@NotNull
private static final ct F;
@NotNull
private static final Map h;
@NotNull
private static final ArrayList z;
@NotNull
private static final bj S;
private static final long a = yz.a(8846461057793024515L, 1805070519772827770L, MethodHandles.lookup().lookupClass()).a(39305428616139L);
private static final String[] b;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] k;
private static final Map l;

private kf(byte var1, long var2) {
long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
long var6 = var4 ^ 70989945924969L;
super(b<"j">(18309, 151104026495773960L ^ var4), jt.z(), null, 4, null, var6);
}

private final ne T(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 20500436405970L;
return (ne)u.E(this, var3, j[0]);
}

private final Color q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 114214922878025L;
return (Color)K.E(this, var3, j[1]);
}

private final boolean i(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 32241560005420L;
return (Boolean)m.E(this, var3, j[2]);
}

private final int n(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 46482634714816L;
return ((Number)c.E(this, var3, j[3])).intValue();
}

private final void x(int var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 59730835536434L;
c.b(this, var4, j[3], var1);
}

private final int C(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 138883316283628L;
return ((Number)g.E(this, var6, j[4])).intValue();
}

private final void A(int var1, long var2) {
var2 = a ^ var2;
long var4 = var2 ^ 22138225784391L;
g.b(this, var4, j[4], var1);
}

private final boolean w(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 77498786607273L;
return (Boolean)i.E(this, var3, j[5]);
}

private final float H(long var1, short var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 79714463306227L;
return ((Number)F.E(this, var6, j[c<"m">(29073, 8522817208076462705L ^ var4)])).floatValue();
}

@Flow
private final void q(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kf.a J
// 003: ldc2_w 66851568865297
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 107062602053433
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 23849703887208
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 97729219379732
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 64856705332817
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 55076231951013
// 043: lxor
// 044: lstore 13
// 046: pop2
// 047: ldc2_w 9097825050060852830
// 04a: lload 2
// 04b: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: astore 15
// 052: aload 1
// 053: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 056: instanceof net/minecraft/class_2703
// 059: aload 15
// 05b: ifnonnull 133
// 05e: ifeq 11a
// 061: goto 06e
// 064: ldc2_w 9144210399544323130
// 067: lload 2
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: aload 1
// 06f: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 072: dup
// 073: sipush 5848
// 076: ldc2_w 7748878192419274394
// 079: lload 2
// 07a: lxor
// 07b: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 083: checkcast net/minecraft/class_2703
// 086: astore 16
// 088: aload 16
// 08a: aload 15
// 08c: ifnonnull 0b7
// 08f: invokevirtual net/minecraft/class_2703.method_46327 ()Ljava/util/EnumSet;
// 092: getstatic net/minecraft/class_2703$class_5893.field_29136 Lnet/minecraft/class_2703$class_5893;
// 095: invokevirtual java/util/EnumSet.contains (Ljava/lang/Object;)Z
// 098: ifeq 112
// 09b: goto 0a8
// 09e: ldc2_w 9144210399544323130
// 0a1: lload 2
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: aload 16
// 0aa: goto 0b7
// 0ad: ldc2_w 9144210399544323130
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: invokevirtual net/minecraft/class_2703.method_46330 ()Ljava/util/List;
// 0ba: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0bf: astore 17
// 0c1: aload 17
// 0c3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c8: ifeq 112
// 0cb: aload 17
// 0cd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0d2: dup
// 0d3: sipush 3230
// 0d6: ldc2_w 3241316707157533921
// 0d9: lload 2
// 0da: lxor
// 0db: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e3: checkcast net/minecraft/class_2703$class_2705
// 0e6: astore 18
// 0e8: getstatic su/catlean/kf.z Ljava/util/ArrayList;
// 0eb: aload 18
// 0ed: invokedynamic invoke (Lnet/minecraft/class_2703$class_2705;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/kf.B (Lnet/minecraft/class_2703$class_2705;Lsu/catlean/gt;)Z, (Lsu/catlean/gt;)Ljava/lang/Boolean; ]
// 0f2: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/kf.P (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 0f7: invokevirtual java/util/ArrayList.removeIf (Ljava/util/function/Predicate;)Z
// 0fa: pop
// 0fb: aload 15
// 0fd: ifnonnull 11a
// 100: aload 15
// 102: ifnull 0c1
// 105: goto 112
// 108: ldc2_w 9144210399544323130
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: getstatic su/catlean/kf.h Ljava/util/Map;
// 115: invokeinterface java/util/Map.clear ()V 1
// 11a: aload 1
// 11b: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 11e: aload 15
// 120: ifnonnull 147
// 123: instanceof net/minecraft/class_7828
// 126: goto 133
// 129: ldc2_w 9144210399544323130
// 12c: lload 2
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: ifeq 2df
// 136: aload 1
// 137: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 13a: goto 147
// 13d: ldc2_w 9144210399544323130
// 140: lload 2
// 141: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: athrow
// 147: checkcast net/minecraft/class_7828
// 14a: invokevirtual net/minecraft/class_7828.comp_1105 ()Ljava/util/List;
// 14d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 152: astore 16
// 154: aload 16
// 156: invokeinterface java/util/Iterator.hasNext ()Z 1
// 15b: ifeq 2df
// 15e: aload 16
// 160: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 165: dup
// 166: sipush 9618
// 169: ldc2_w 83261819040878017
// 16c: lload 2
// 16d: lxor
// 16e: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 176: checkcast java/util/UUID
// 179: astore 17
// 17b: getstatic su/catlean/kf.h Ljava/util/Map;
// 17e: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
// 183: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 188: astore 18
// 18a: aload 18
// 18c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 191: ifeq 154
// 194: aload 18
// 196: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 19b: dup
// 19c: sipush 9618
// 19f: ldc2_w 83261819040878017
// 1a2: lload 2
// 1a3: lxor
// 1a4: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ac: checkcast java/util/UUID
// 1af: astore 19
// 1b1: aload 19
// 1b3: aload 15
// 1b5: ifnonnull 1f3
// 1b8: aload 17
// 1ba: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1bd: aload 15
// 1bf: ifnonnull 191
// 1c2: goto 1cf
// 1c5: ldc2_w 9144210399544323130
// 1c8: lload 2
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: aload 15
// 1d1: ifnonnull 15b
// 1d4: ifne 1e9
// 1d7: aload 15
// 1d9: ifnull 18a
// 1dc: goto 1e9
// 1df: ldc2_w 9144210399544323130
// 1e2: lload 2
// 1e3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: athrow
// 1e9: getstatic su/catlean/kf.h Ljava/util/Map;
// 1ec: aload 19
// 1ee: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 1f3: checkcast net/minecraft/class_1657
// 1f6: dup
// 1f7: ifnull 2d8
// 1fa: astore 20
// 1fc: bipush 0
// 1fd: istore 21
// 1ff: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 202: aload 15
// 204: ifnonnull 246
// 207: lload 4
// 209: invokespecial su/catlean/kf.i (J)Z
// 20c: ifne 233
// 20f: goto 21c
// 212: ldc2_w 9144210399544323130
// 215: lload 2
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: aload 20
// 21e: lload 13
// 220: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 223: ifne 2d4
// 226: goto 233
// 229: ldc2_w 9144210399544323130
// 22c: lload 2
// 22d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 232: athrow
// 233: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 236: checkcast su/catlean/_g
// 239: goto 246
// 23c: ldc2_w 9144210399544323130
// 23f: lload 2
// 240: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 245: athrow
// 246: iload 8
// 248: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 24b: checkcast su/catlean/_g
// 24e: sipush 10603
// 251: ldc2_w 8860197826342502688
// 254: lload 2
// 255: lxor
// 256: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25b: bipush 4
// 25c: anewarray 558
// 25f: astore 22
// 261: aload 22
// 263: bipush 0
// 264: aload 20
// 266: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 269: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 26e: dup
// 26f: sipush 15383
// 272: ldc2_w 6740910241972245593
// 275: lload 2
// 276: lxor
// 277: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 27f: aastore
// 280: aload 22
// 282: bipush 1
// 283: aload 20
// 285: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 288: d2i
// 289: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 28c: aastore
// 28d: aload 22
// 28f: bipush 2
// 290: aload 20
// 292: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 295: d2i
// 296: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 299: aastore
// 29a: aload 22
// 29c: bipush 3
// 29d: aload 20
// 29f: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 2a2: d2i
// 2a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 2a6: aastore
// 2a7: aload 22
// 2a9: iload 9
// 2ab: i2c
// 2ac: bipush 0
// 2ad: bipush 4
// 2ae: aconst_null
// 2af: iload 10
// 2b1: i2s
// 2b2: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 2b5: bipush 0
// 2b6: bipush 2
// 2b7: aconst_null
// 2b8: lload 6
// 2ba: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 2bd: getstatic su/catlean/kf.z Ljava/util/ArrayList;
// 2c0: new su/catlean/gt
// 2c3: dup
// 2c4: lload 11
// 2c6: aload 19
// 2c8: aload 20
// 2ca: invokestatic java/lang/System.currentTimeMillis ()J
// 2cd: invokespecial su/catlean/gt.<init> (JLjava/util/UUID;Lnet/minecraft/class_1657;J)V
// 2d0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
// 2d3: pop
// 2d4: nop
// 2d5: goto 18a
// 2d8: pop
// 2d9: nop
// 2da: aload 15
// 2dc: ifnull 18a
// 2df: return
}

@Override
public void O(long var1) {
h.clear();
z.clear();
}

@Flow
private final void L(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kf.a J
// 003: ldc2_w 16932811708740
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 8629606089907
// 00d: lxor
// 00e: dup2
// 00f: bipush 16
// 011: lushr
// 012: lstore 4
// 014: dup2
// 015: bipush 48
// 017: lshl
// 018: bipush 48
// 01a: lushr
// 01b: l2i
// 01c: istore 6
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 10835455550953
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 3212353559541
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 137062437703383
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 1086108493138
// 038: lxor
// 039: lstore 13
// 03b: pop2
// 03c: ldc2_w -5254359338880940277
// 03f: lload 2
// 040: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: lload 9
// 047: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 04a: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 04d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 052: astore 16
// 054: astore 15
// 056: aload 16
// 058: invokeinterface java/util/Iterator.hasNext ()Z 1
// 05d: ifeq 0ef
// 060: aload 16
// 062: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 067: checkcast net/minecraft/class_742
// 06a: astore 17
// 06c: aload 15
// 06e: ifnonnull 1aa
// 071: aload 17
// 073: aload 15
// 075: ifnonnull 097
// 078: goto 085
// 07b: ldc2_w -5209555076380859025
// 07e: lload 2
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: ifnull 056
// 088: goto 095
// 08b: ldc2_w -5209555076380859025
// 08e: lload 2
// 08f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 094: athrow
// 095: aload 17
// 097: lload 13
// 099: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 09f: aload 15
// 0a1: ifnonnull 0d1
// 0a4: ifne 056
// 0a7: goto 0b4
// 0aa: ldc2_w -5209555076380859025
// 0ad: lload 2
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: aload 0
// 0b5: aload 15
// 0b7: ifnonnull 0e9
// 0ba: aload 17
// 0bc: checkcast net/minecraft/class_1657
// 0bf: lload 11
// 0c1: invokespecial su/catlean/kf.s (Lnet/minecraft/class_1657;J)Z
// 0c4: goto 0d1
// 0c7: ldc2_w -5209555076380859025
// 0ca: lload 2
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: ifeq 0d7
// 0d4: goto 056
// 0d7: getstatic su/catlean/kf.h Ljava/util/Map;
// 0da: aload 17
// 0dc: invokevirtual net/minecraft/class_742.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 0df: invokevirtual com/mojang/authlib/GameProfile.id ()Ljava/util/UUID;
// 0e2: aload 17
// 0e4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 0e9: pop
// 0ea: aload 15
// 0ec: ifnull 056
// 0ef: aload 0
// 0f0: lload 7
// 0f2: invokespecial su/catlean/kf.w (J)Z
// 0f5: ifeq 1aa
// 0f8: getstatic su/catlean/kf.z Ljava/util/ArrayList;
// 0fb: checkcast java/lang/Iterable
// 0fe: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
// 101: dup
// 102: sipush 14057
// 105: ldc2_w 2586940583683168207
// 108: lload 2
// 109: lxor
// 10a: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 112: checkcast java/lang/Iterable
// 115: astore 16
// 117: bipush 0
// 118: istore 17
// 11a: aload 16
// 11c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 121: astore 18
// 123: aload 18
// 125: invokeinterface java/util/Iterator.hasNext ()Z 1
// 12a: ifeq 1a9
// 12d: aload 18
// 12f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 134: astore 19
// 136: aload 19
// 138: checkcast su/catlean/gt
// 13b: astore 20
// 13d: bipush 0
// 13e: istore 21
// 140: aload 15
// 142: ifnonnull 1aa
// 145: aload 15
// 147: ifnonnull 1a4
// 14a: goto 157
// 14d: ldc2_w -5209555076380859025
// 150: lload 2
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: invokestatic su/catlean/zf.A ()J
// 15a: aload 20
// 15c: invokevirtual su/catlean/gt.x ()J
// 15f: lsub
// 160: l2f
// 161: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 164: lload 4
// 166: iload 6
// 168: i2s
// 169: invokespecial su/catlean/kf.H (JS)F
// 16c: sipush 32760
// 16f: ldc2_w 3821198536015564758
// 172: lload 2
// 173: lxor
// 174: invokedynamic m (IJ)I bsm=su/catlean/kf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: i2f
// 17a: fmul
// 17b: fcmpl
// 17c: ifle 1a2
// 17f: goto 18c
// 182: ldc2_w -5209555076380859025
// 185: lload 2
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: getstatic su/catlean/kf.z Ljava/util/ArrayList;
// 18f: aload 20
// 191: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
// 194: pop
// 195: goto 1a2
// 198: ldc2_w -5209555076380859025
// 19b: lload 2
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: nop
// 1a3: nop
// 1a4: aload 15
// 1a6: ifnull 123
// 1a9: nop
// 1aa: return
}

@Flow
private final void K(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kf.a J
// 003: ldc2_w 39375312379191
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 5427807120762
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 124976440991713
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 80581866700787
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 51369357273808
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 2539417595459
// 029: lxor
// 02a: dup2
// 02b: bipush 48
// 02d: lushr
// 02e: l2i
// 02f: istore 12
// 031: dup2
// 032: bipush 16
// 034: lshl
// 035: bipush 32
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
// 047: ldc2_w 32294729378271
// 04a: lxor
// 04b: dup2
// 04c: bipush 32
// 04e: lushr
// 04f: l2i
// 050: istore 15
// 052: dup2
// 053: bipush 32
// 055: lshl
// 056: bipush 48
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
// 067: dup2
// 068: ldc2_w 23591557500980
// 06b: lxor
// 06c: dup2
// 06d: bipush 48
// 06f: lushr
// 070: l2i
// 071: istore 18
// 073: dup2
// 074: bipush 16
// 076: lshl
// 077: bipush 32
// 079: lushr
// 07a: l2i
// 07b: istore 19
// 07d: dup2
// 07e: bipush 48
// 080: lshl
// 081: bipush 48
// 083: lushr
// 084: l2i
// 085: istore 20
// 087: pop2
// 088: pop2
// 089: ldc2_w 8315871065046057848
// 08c: lload 2
// 08d: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: astore 24
// 094: aload 0
// 095: aload 24
// 097: ifnonnull 0d4
// 09a: lload 6
// 09c: invokespecial su/catlean/kf.T (J)Lsu/catlean/ne;
// 09f: getstatic su/catlean/g5.o [I
// 0a2: swap
// 0a3: invokevirtual su/catlean/ne.ordinal ()I
// 0a6: iaload
// 0a7: tableswitch 322 1 2 31 66
// 0bc: ldc2_w 8340910514897395996
// 0bf: lload 2
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: aload 0
// 0c7: goto 0d4
// 0ca: ldc2_w 8340910514897395996
// 0cd: lload 2
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: aload 1
// 0d5: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 0d8: iload 12
// 0da: i2s
// 0db: swap
// 0dc: iload 13
// 0de: swap
// 0df: iload 14
// 0e1: invokespecial su/catlean/kf.t (SILnet/minecraft/class_4587;I)V
// 0e4: aload 24
// 0e6: ifnull 1fb
// 0e9: getstatic su/catlean/nn.x Lsu/catlean/nn;
// 0ec: aload 1
// 0ed: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 0f0: getstatic su/catlean/s8.BOTH Lsu/catlean/s8;
// 0f3: aload 0
// 0f4: lload 4
// 0f6: invokespecial su/catlean/kf.q (J)Ljava/awt/Color;
// 0f9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0fc: aload 0
// 0fd: lload 4
// 0ff: invokespecial su/catlean/kf.q (J)Ljava/awt/Color;
// 102: iload 18
// 104: i2c
// 105: iload 19
// 107: fconst_1
// 108: iload 20
// 10a: i2s
// 10b: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 10e: getstatic su/catlean/kf.z Ljava/util/ArrayList;
// 111: checkcast java/lang/Iterable
// 114: astore 25
// 116: astore 38
// 118: astore 37
// 11a: astore 36
// 11c: astore 35
// 11e: astore 34
// 120: bipush 0
// 121: istore 26
// 123: aload 25
// 125: astore 27
// 127: new java/util/ArrayList
// 12a: dup
// 12b: aload 25
// 12d: sipush 6884
// 130: ldc2_w 8507790058018729646
// 133: lload 2
// 134: lxor
// 135: invokedynamic m (IJ)I bsm=su/catlean/kf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 13d: invokespecial java/util/ArrayList.<init> (I)V
// 140: checkcast java/util/Collection
// 143: astore 28
// 145: bipush 0
// 146: istore 29
// 148: aload 27
// 14a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 14f: astore 30
// 151: aload 30
// 153: invokeinterface java/util/Iterator.hasNext ()Z 1
// 158: ifeq 197
// 15b: aload 30
// 15d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 162: astore 31
// 164: aload 28
// 166: aload 31
// 168: checkcast su/catlean/gt
// 16b: astore 32
// 16d: astore 39
// 16f: bipush 0
// 170: istore 33
// 172: aload 32
// 174: invokevirtual su/catlean/gt.g ()Lnet/minecraft/class_1657;
// 177: aload 39
// 179: swap
// 17a: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 17f: pop
// 180: aload 24
// 182: ifnonnull 1fb
// 185: aload 24
// 187: ifnull 151
// 18a: goto 197
// 18d: ldc2_w 8340910514897395996
// 190: lload 2
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: aload 28
// 199: checkcast java/util/List
// 19c: nop
// 19d: astore 39
// 19f: aload 34
// 1a1: aload 35
// 1a3: aload 36
// 1a5: aload 37
// 1a7: aload 38
// 1a9: aload 39
// 1ab: checkcast java/lang/Iterable
// 1ae: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
// 1b1: dup
// 1b2: sipush 14057
// 1b5: ldc2_w 2586900620543906748
// 1b8: lload 2
// 1b9: lxor
// 1ba: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1c2: aload 0
// 1c3: iload 15
// 1c5: iload 16
// 1c7: i2c
// 1c8: iload 17
// 1ca: invokespecial su/catlean/kf.C (ICI)I
// 1cd: aload 0
// 1ce: lload 8
// 1d0: invokespecial su/catlean/kf.n (J)I
// 1d3: istore 21
// 1d5: istore 22
// 1d7: astore 23
// 1d9: lload 10
// 1db: aload 23
// 1dd: iload 22
// 1df: iload 21
// 1e1: invokevirtual su/catlean/nn.B (Lnet/minecraft/class_4587;Lsu/catlean/s8;Ljava/awt/Color;Ljava/awt/Color;JLjava/util/ArrayList;II)V
// 1e4: aload 24
// 1e6: ifnull 1fb
// 1e9: new kotlin/NoWhenBranchMatchedException
// 1ec: dup
// 1ed: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 1f0: athrow
// 1f1: ldc2_w 8340910514897395996
// 1f4: lload 2
// 1f5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: athrow
// 1fb: return
}

@Flow
private final void e(Render2DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kf.a J
// 003: ldc2_w 108546197528214
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 116581101896545
// 00d: lxor
// 00e: dup2
// 00f: bipush 16
// 011: lushr
// 012: lstore 4
// 014: dup2
// 015: bipush 48
// 017: lshl
// 018: bipush 48
// 01a: lushr
// 01b: l2i
// 01c: istore 6
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 53285488400354
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 15869934789249
// 02a: lxor
// 02b: dup2
// 02c: bipush 56
// 02e: lushr
// 02f: l2i
// 030: istore 9
// 032: dup2
// 033: bipush 8
// 035: lshl
// 036: bipush 8
// 038: lushr
// 039: lstore 10
// 03b: pop2
// 03c: dup2
// 03d: ldc2_w 125817518723084
// 040: lxor
// 041: dup2
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 12
// 048: dup2
// 049: bipush 16
// 04b: lshl
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 13
// 052: dup2
// 053: bipush 32
// 055: lshl
// 056: bipush 32
// 058: lushr
// 059: l2i
// 05a: istore 14
// 05c: pop2
// 05d: dup2
// 05e: ldc2_w 366439717876
// 061: lxor
// 062: lstore 15
// 064: dup2
// 065: ldc2_w 109969563918907
// 068: lxor
// 069: lstore 17
// 06b: dup2
// 06c: ldc2_w 80935303774976
// 06f: lxor
// 070: lstore 19
// 072: dup2
// 073: ldc2_w 31693583494541
// 076: lxor
// 077: lstore 21
// 079: dup2
// 07a: ldc2_w 21867840748739
// 07d: lxor
// 07e: lstore 23
// 080: dup2
// 081: ldc2_w 130489870905627
// 084: lxor
// 085: lstore 25
// 087: dup2
// 088: ldc2_w 92375895364501
// 08b: lxor
// 08c: dup2
// 08d: bipush 48
// 08f: lushr
// 090: l2i
// 091: istore 27
// 093: dup2
// 094: bipush 16
// 096: lshl
// 097: bipush 32
// 099: lushr
// 09a: l2i
// 09b: istore 28
// 09d: dup2
// 09e: bipush 48
// 0a0: lshl
// 0a1: bipush 48
// 0a3: lushr
// 0a4: l2i
// 0a5: istore 29
// 0a7: pop2
// 0a8: pop2
// 0a9: ldc2_w 3514683320360190169
// 0ac: lload 2
// 0ad: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: getstatic su/catlean/kf.z Ljava/util/ArrayList;
// 0b5: checkcast java/lang/Iterable
// 0b8: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
// 0bb: dup
// 0bc: sipush 14057
// 0bf: ldc2_w 2586971775771054109
// 0c2: lload 2
// 0c3: lxor
// 0c4: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0cc: checkcast java/lang/Iterable
// 0cf: astore 31
// 0d1: bipush 0
// 0d2: istore 32
// 0d4: astore 30
// 0d6: aload 31
// 0d8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0dd: astore 33
// 0df: aload 33
// 0e1: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0e6: ifeq 423
// 0e9: aload 33
// 0eb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0f0: astore 34
// 0f2: aload 34
// 0f4: checkcast su/catlean/gt
// 0f7: astore 35
// 0f9: bipush 0
// 0fa: istore 36
// 0fc: aload 30
// 0fe: ifnonnull 424
// 101: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 104: lload 17
// 106: invokespecial su/catlean/kf.w (J)Z
// 109: ifeq 141
// 10c: goto 119
// 10f: ldc2_w 3486239784447107773
// 112: lload 2
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: fconst_1
// 11a: invokestatic su/catlean/zf.A ()J
// 11d: aload 35
// 11f: invokevirtual su/catlean/gt.x ()J
// 122: lsub
// 123: l2f
// 124: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 127: lload 4
// 129: iload 6
// 12b: i2s
// 12c: invokespecial su/catlean/kf.H (JS)F
// 12f: ldc 1000.0
// 131: fmul
// 132: fdiv
// 133: fsub
// 134: goto 142
// 137: ldc2_w 3486239784447107773
// 13a: lload 2
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: fconst_1
// 142: fstore 37
// 144: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 147: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 14a: aload 35
// 14c: invokevirtual su/catlean/gt.g ()Lnet/minecraft/class_1657;
// 14f: iload 9
// 151: i2b
// 152: swap
// 153: lload 10
// 155: dup2_x1
// 156: pop2
// 157: checkcast net/minecraft/class_1297
// 15a: invokevirtual su/catlean/kf.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 15d: dconst_0
// 15e: ldc2_w 2.0
// 161: dconst_0
// 162: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 165: dup
// 166: sipush 18001
// 169: ldc2_w 8450193961473466542
// 16c: lload 2
// 16d: lxor
// 16e: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 176: lload 19
// 178: invokevirtual su/catlean/jl.i (Lnet/minecraft/class_243;J)Lnet/minecraft/class_243;
// 17b: astore 38
// 17d: aconst_null
// 17e: astore 39
// 180: aload 38
// 182: getfield net/minecraft/class_243.field_1350 D
// 185: dconst_0
// 186: dcmpl
// 187: aload 30
// 189: ifnonnull 1b0
// 18c: ifle 202
// 18f: goto 19c
// 192: ldc2_w 3486239784447107773
// 195: lload 2
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: aload 38
// 19e: getfield net/minecraft/class_243.field_1350 D
// 1a1: dconst_1
// 1a2: dcmpg
// 1a3: goto 1b0
// 1a6: ldc2_w 3486239784447107773
// 1a9: lload 2
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: ifge 202
// 1b3: new org/joml/Vector4d
// 1b6: dup
// 1b7: aload 38
// 1b9: getfield net/minecraft/class_243.field_1352 D
// 1bc: aload 38
// 1be: getfield net/minecraft/class_243.field_1351 D
// 1c1: aload 38
// 1c3: getfield net/minecraft/class_243.field_1350 D
// 1c6: dconst_0
// 1c7: invokespecial org/joml/Vector4d.<init> (DDDD)V
// 1ca: astore 39
// 1cc: aload 39
// 1ce: aload 38
// 1d0: getfield net/minecraft/class_243.field_1352 D
// 1d3: aload 39
// 1d5: getfield org/joml/Vector4d.x D
// 1d8: invokestatic java/lang/Math.min (DD)D
// 1db: putfield org/joml/Vector4d.x D
// 1de: aload 39
// 1e0: aload 38
// 1e2: getfield net/minecraft/class_243.field_1351 D
// 1e5: aload 39
// 1e7: getfield org/joml/Vector4d.y D
// 1ea: invokestatic java/lang/Math.min (DD)D
// 1ed: putfield org/joml/Vector4d.y D
// 1f0: aload 39
// 1f2: aload 38
// 1f4: getfield net/minecraft/class_243.field_1352 D
// 1f7: aload 39
// 1f9: getfield org/joml/Vector4d.z D
// 1fc: invokestatic java/lang/Math.max (DD)D
// 1ff: putfield org/joml/Vector4d.z D
// 202: invokestatic java/lang/System.currentTimeMillis ()J
// 205: aload 35
// 207: invokevirtual su/catlean/gt.x ()J
// 20a: lsub
// 20b: l2f
// 20c: ldc 500.0
// 20e: fdiv
// 20f: fstore 40
// 211: invokestatic java/lang/System.currentTimeMillis ()J
// 214: aload 35
// 216: invokevirtual su/catlean/gt.x ()J
// 219: lsub
// 21a: l2d
// 21b: ldc2_w 1000.0
// 21e: ddiv
// 21f: d2i
// 220: istore 41
// 222: aload 35
// 224: invokevirtual su/catlean/gt.g ()Lnet/minecraft/class_1657;
// 227: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 22a: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 22f: aload 35
// 231: invokevirtual su/catlean/gt.g ()Lnet/minecraft/class_1657;
// 234: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 237: aload 35
// 239: invokevirtual su/catlean/gt.g ()Lnet/minecraft/class_1657;
// 23c: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 23f: fadd
// 240: f2i
// 241: iload 41
// 243: sipush 3327
// 246: ldc2_w 3615790203017542413
// 249: lload 2
// 24a: lxor
// 24b: invokedynamic m (IJ)I bsm=su/catlean/kf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: idiv
// 251: iload 41
// 253: sipush 12208
// 256: ldc2_w 6371941943816394826
// 259: lload 2
// 25a: lxor
// 25b: invokedynamic m (IJ)I bsm=su/catlean/kf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 260: irem
// 261: invokedynamic makeConcatWithConstants (Ljava/lang/String;III)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001 \u0001 \u0001:\u0001" ]
// 266: astore 42
// 268: aload 42
// 26a: bipush 0
// 26b: aload 42
// 26d: invokevirtual java/lang/String.length ()I
// 270: i2f
// 271: fconst_1
// 272: fload 40
// 274: fsub
// 275: fmul
// 276: f2i
// 277: invokestatic java/lang/Math.max (II)I
// 27a: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 27d: astore 42
// 27f: aload 30
// 281: ifnonnull 41e
// 284: aload 39
// 286: ifnull 41c
// 289: goto 296
// 28c: ldc2_w 3486239784447107773
// 28f: lload 2
// 290: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 295: athrow
// 296: aload 39
// 298: getfield org/joml/Vector4d.z D
// 29b: aload 39
// 29d: getfield org/joml/Vector4d.x D
// 2a0: dsub
// 2a1: d2f
// 2a2: fconst_2
// 2a3: fdiv
// 2a4: fstore 43
// 2a6: lload 15
// 2a8: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 2ab: lload 21
// 2ad: aload 42
// 2af: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 2b2: ldc 18.0
// 2b4: fadd
// 2b5: fstore 44
// 2b7: aload 39
// 2b9: getfield org/joml/Vector4d.x D
// 2bc: fload 43
// 2be: f2d
// 2bf: dadd
// 2c0: fload 44
// 2c2: fconst_2
// 2c3: fdiv
// 2c4: f2d
// 2c5: dsub
// 2c6: d2f
// 2c7: fstore 45
// 2c9: aload 1
// 2ca: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 2cd: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2d0: dup
// 2d1: sipush 25161
// 2d4: ldc2_w 1694328598672098490
// 2d7: lload 2
// 2d8: lxor
// 2d9: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2de: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e1: fload 45
// 2e3: bipush 2
// 2e4: i2f
// 2e5: fsub
// 2e6: iload 12
// 2e8: i2c
// 2e9: swap
// 2ea: aload 39
// 2ec: getfield org/joml/Vector4d.y D
// 2ef: d2f
// 2f0: ldc 13.0
// 2f2: fsub
// 2f3: fload 44
// 2f5: ldc 12.0
// 2f7: fconst_2
// 2f8: ldc 1.5
// 2fa: fconst_0
// 2fb: fconst_1
// 2fc: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2ff: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 302: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 305: fload 37
// 307: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 30a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 30d: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 310: lload 7
// 312: dup2_x1
// 313: pop2
// 314: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 317: fmul
// 318: iload 27
// 31a: i2c
// 31b: swap
// 31c: iload 28
// 31e: swap
// 31f: iload 29
// 321: i2s
// 322: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 325: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 328: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 32b: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 32e: fload 37
// 330: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 333: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 336: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 339: lload 7
// 33b: dup2_x1
// 33c: pop2
// 33d: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 340: fmul
// 341: iload 27
// 343: i2c
// 344: swap
// 345: iload 28
// 347: swap
// 348: iload 29
// 34a: i2s
// 34b: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 34e: fconst_0
// 34f: iload 13
// 351: i2s
// 352: fconst_0
// 353: iload 14
// 355: fconst_0
// 356: sipush 32336
// 359: ldc2_w 7066084286902225337
// 35c: lload 2
// 35d: lxor
// 35e: invokedynamic m (IJ)I bsm=su/catlean/kf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 363: aconst_null
// 364: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 367: getstatic su/catlean/kf.S Lsu/catlean/bj;
// 36a: aload 1
// 36b: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 36e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 371: dup
// 372: sipush 15001
// 375: ldc2_w 958437947128650830
// 378: lload 2
// 379: lxor
// 37a: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 382: checkcast org/joml/Matrix3x2f
// 385: fload 45
// 387: f2d
// 388: aload 39
// 38a: getfield org/joml/Vector4d.y D
// 38d: d2f
// 38e: f2d
// 38f: ldc2_w 13.5
// 392: dsub
// 393: fconst_0
// 394: fconst_0
// 395: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 398: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 39b: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 39e: fload 37
// 3a0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3a3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3a6: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 3a9: lload 7
// 3ab: dup2_x1
// 3ac: pop2
// 3ad: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 3b0: fmul
// 3b1: iload 27
// 3b3: i2c
// 3b4: swap
// 3b5: iload 28
// 3b7: swap
// 3b8: iload 29
// 3ba: i2s
// 3bb: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3be: aconst_null
// 3bf: fconst_0
// 3c0: sipush 20647
// 3c3: ldc2_w 2596995489263675220
// 3c6: lload 2
// 3c7: lxor
// 3c8: invokedynamic m (IJ)I bsm=su/catlean/kf.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cd: lload 25
// 3cf: aconst_null
// 3d0: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 3d3: lload 15
// 3d5: invokestatic su/catlean/b8.t (J)Lsu/catlean/c6;
// 3d8: aload 1
// 3d9: invokevirtual su/catlean/api/event/events/render/Render2DEvent.getContext ()Lnet/minecraft/class_332;
// 3dc: aload 42
// 3de: fload 45
// 3e0: ldc 12.0
// 3e2: fadd
// 3e3: lload 23
// 3e5: dup2_x1
// 3e6: pop2
// 3e7: aload 39
// 3e9: getfield org/joml/Vector4d.y D
// 3ec: d2f
// 3ed: ldc 13.0
// 3ef: fsub
// 3f0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3f3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3f6: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 3f9: fload 37
// 3fb: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3fe: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 401: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 404: lload 7
// 406: dup2_x1
// 407: pop2
// 408: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 40b: fmul
// 40c: iload 27
// 40e: i2c
// 40f: swap
// 410: iload 28
// 412: swap
// 413: iload 29
// 415: i2s
// 416: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 419: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 41c: nop
// 41d: nop
// 41e: aload 30
// 420: ifnull 0df
// 423: nop
// 424: return
}

private final boolean s(class_1657 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/kf.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w 6249459457322854053
// 09: lload 2
// 0a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 4
// 11: aload 1
// 12: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 15: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 18: dup
// 19: sipush 24776
// 1c: ldc2_w 2349632314214522985
// 1f: lload 2
// 20: lxor
// 21: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 29: checkcast java/lang/CharSequence
// 2c: ldc "-"
// 2e: checkcast java/lang/CharSequence
// 31: bipush 0
// 32: bipush 2
// 33: aconst_null
// 34: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 37: aload 4
// 39: ifnonnull 95
// 3c: ifne 94
// 3f: goto 4c
// 42: ldc2_w 6205325888275186881
// 45: lload 2
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: aload 1
// 4d: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
// 50: invokevirtual com/mojang/authlib/GameProfile.name ()Ljava/lang/String;
// 53: dup
// 54: sipush 27883
// 57: ldc2_w 438183036606033004
// 5a: lload 2
// 5b: lxor
// 5c: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 64: checkcast java/lang/CharSequence
// 67: ldc "_"
// 69: checkcast java/lang/CharSequence
// 6c: bipush 0
// 6d: bipush 2
// 6e: aconst_null
// 6f: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 72: aload 4
// 74: ifnonnull 95
// 77: goto 84
// 7a: ldc2_w 6205325888275186881
// 7d: lload 2
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: ifeq 98
// 87: goto 94
// 8a: ldc2_w 6205325888275186881
// 8d: lload 2
// 8e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93: athrow
// 94: bipush 1
// 95: goto 99
// 98: bipush 0
// 99: ireturn
}

private final void t(short param1, int param2, class_4587 param3, int param4) {
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
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/kf.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 30585964528122
// 024: lxor
// 025: dup2
// 026: bipush 16
// 028: lushr
// 029: lstore 7
// 02b: dup2
// 02c: bipush 48
// 02e: lshl
// 02f: bipush 48
// 031: lushr
// 032: l2i
// 033: istore 9
// 035: pop2
// 036: dup2
// 037: ldc2_w 23994747887776
// 03a: lxor
// 03b: lstore 10
// 03d: dup2
// 03e: ldc2_w 96743381803975
// 041: lxor
// 042: lstore 12
// 044: pop2
// 045: ldc2_w -5594077610592648638
// 048: lload 5
// 04a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: getstatic su/catlean/kf.z Ljava/util/ArrayList;
// 052: checkcast java/lang/Iterable
// 055: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
// 058: dup
// 059: sipush 25362
// 05c: ldc2_w 2351910304189892424
// 05f: lload 5
// 061: lxor
// 062: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 06a: checkcast java/lang/Iterable
// 06d: astore 15
// 06f: astore 14
// 071: bipush 0
// 072: istore 16
// 074: aload 15
// 076: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 07b: astore 17
// 07d: aload 17
// 07f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 084: ifeq 10c
// 087: aload 17
// 089: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 08e: astore 18
// 090: aload 18
// 092: checkcast su/catlean/gt
// 095: astore 19
// 097: bipush 0
// 098: istore 20
// 09a: aload 14
// 09c: ifnonnull 112
// 09f: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 0a2: aload 3
// 0a3: aload 19
// 0a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0a8: aload 19
// 0aa: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 0ad: lload 10
// 0af: invokespecial su/catlean/kf.w (J)Z
// 0b2: ifeq 0ec
// 0b5: goto 0c3
// 0b8: ldc2_w -5549862688438722522
// 0bb: lload 5
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: fconst_1
// 0c4: invokestatic su/catlean/zf.A ()J
// 0c7: aload 19
// 0c9: invokevirtual su/catlean/gt.x ()J
// 0cc: lsub
// 0cd: l2f
// 0ce: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 0d1: lload 7
// 0d3: iload 9
// 0d5: i2s
// 0d6: invokespecial su/catlean/kf.H (JS)F
// 0d9: ldc 1000.0
// 0db: fmul
// 0dc: fdiv
// 0dd: fsub
// 0de: goto 100
// 0e1: ldc2_w -5549862688438722522
// 0e4: lload 5
// 0e6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0eb: athrow
// 0ec: ldc 0.4
// 0ee: fconst_1
// 0ef: invokestatic su/catlean/zf.A ()J
// 0f2: aload 19
// 0f4: invokevirtual su/catlean/gt.x ()J
// 0f7: lsub
// 0f8: l2f
// 0f9: ldc 800.0
// 0fb: fdiv
// 0fc: fsub
// 0fd: invokestatic java/lang/Math.max (FF)F
// 100: lload 12
// 102: invokespecial su/catlean/kf.x (Lnet/minecraft/class_4587;Lsu/catlean/gt;FJ)V
// 105: nop
// 106: nop
// 107: aload 14
// 109: ifnull 07d
// 10c: nop
// 10d: iload 4
// 10f: iflt 112
// 112: return
}

private final void x(class_4587 var1, gt var2, float var3, long var4) {
var4 = a ^ var4;
long var6 = var4 ^ 98145487610499L;
long var8 = var4 ^ 6054285426160L;
int var10 = (int)((var4 ^ 29324764015780L) >>> 56);
long var11 = (var4 ^ 29324764015780L) << 8 >>> 8;
long var13 = var4 ^ 98263664860562L;
long var15 = var4 ^ 91313373276573L;
long var17 = (var4 ^ 71170181708761L) >>> 16;
int var19 = (int)((var4 ^ 71170181708761L) << 48 >>> 48);
long var10001 = var4 ^ 71224610446768L;
int var20 = (int)((var4 ^ 71224610446768L) >>> 48);
int var21 = (int)((var4 ^ 71224610446768L) << 16 >>> 32);
int var22 = (int)(var10001 << 48 >>> 48);
class_1657 var28 = var2.g();
class_897 var10000 = zf.F(var6).method_1561().method_3953((class_1297)var28);
Intrinsics.checkNotNull(var10000, b<"j">(24990, 8209623609621563757L ^ var4));
class_583 var43 = ((class_1007)var10000).method_4038();
Intrinsics.checkNotNullExpressionValue(var43, b<"j">(18414, 8612791160857128724L ^ var4));
class_591 var29 = (class_591)var43;
class_10017 var31 = zf.F(var6).method_1561().method_3953((class_1297)var28).method_62425((class_1297)var28, 1.0F);
Intrinsics.checkNotNull(var31, b<"j">(27851, 2980989504792904754L ^ var4));
class_10055 var30 = (class_10055)var31;
class_1060 var44 = zf.F(var6).method_1531();
Intrinsics.checkNotNull(var28, b<"j">(28655, 8646081540443850523L ^ var4));
GpuTextureView var45 = var44.method_4619(((class_745)var28).method_52814().comp_1626().comp_3627()).method_71659();
Intrinsics.checkNotNullExpressionValue(var45, b<"j">(15879, 7276530346718926566L ^ var4));
GpuTextureView var42 = var45;
VertexFormat var10002 = class_290.field_1575;
Intrinsics.checkNotNullExpressionValue(class_290.field_1575, b<"j">(28455, 1281561173913520112L ^ var4));
int var10003 = c<"m">(23215, 7989322862220501877L ^ var4);
Object var23 = null;
byte var24 = 4;
boolean var25 = false;
int var26 = var10003;
VertexFormat var27 = var10002;
g7 var32 = new g7(var8, var27, var26, var25, var24, (DefaultConstructorMarker)var23);
sp var33 = new sp(var32, jl.y.p(jh.f.t(), (char)var20, var21, var3, (short)var22), var13);
var1.method_22903();
class_243 var34 = this.J((byte)var10, var11, (class_1297)var28);
double var46 = var34.field_1352;
class_4184 var49 = zf.F(var6).method_1561().field_4686;
Intrinsics.checkNotNull(var49);
double var35 = var46 - var49.method_71156().method_10216();
double var47 = var34.field_1351;
class_4184 var50 = zf.F(var6).method_1561().field_4686;
Intrinsics.checkNotNull(var50);
double var37 = var47 - var50.method_71156().method_10214();
double var48 = var34.field_1350;
class_4184 var51 = zf.F(var6).method_1561().field_4686;
Intrinsics.checkNotNull(var51);
double var39 = var48 - var51.method_71156().method_10215();
var1.method_46416((float)var35, (float)var37, (float)var39);
var1.method_22905(var30.field_53453, var30.field_53453, var30.field_53453);
this.g(var17, var30, (short)var19, var1, var30.field_53446);
var1.method_22905(-1.0F, -1.0F, 1.0F);
var1.method_22905(0.9375F, 0.9375F, 0.9375F);
var1.method_46416(0.0F, -1.501F, 0.0F);
var29.method_62110(var30);
var29.method_62100(var1, var33, c<"m">(20895, 2897783625765447759L ^ var4), 0, jh.f.t().getRGB());
g7.R(
var15,
var32,
b6.R.J(),
null,
null,
new class_4587().method_23760().method_23761(),
null,
MapsKt.mapOf(TuplesKt.to(b<"j">(30320, 5985182268454428328L ^ var4), var42)),
c<"m">(6662, 1857433082246505438L ^ var4),
null
);
var1.method_22909();
}

public final void g(long a, @NotNull class_10055 state, short a, @NotNull class_4587 stack, float bodyYaw) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: bipush 16
// 003: lshl
// 004: iload 4
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 48
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/kf.a J
// 011: lxor
// 012: lstore 7
// 014: ldc2_w -6177866342572041636
// 017: lload 7
// 019: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e: aload 3
// 01f: sipush 16444
// 022: ldc2_w 3613117395977862262
// 025: lload 7
// 027: lxor
// 028: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 030: aload 5
// 032: sipush 11504
// 035: ldc2_w 8525723868800422069
// 038: lload 7
// 03a: lxor
// 03b: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 043: astore 9
// 045: aload 3
// 046: getfield net/minecraft/class_10055.field_53411 Z
// 049: aload 9
// 04b: ifnonnull 11b
// 04e: ifeq 115
// 051: goto 05f
// 054: ldc2_w -6132501861969397704
// 057: lload 7
// 059: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: athrow
// 05f: aload 5
// 061: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 064: ldc 180.0
// 066: fload 6
// 068: fsub
// 069: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 06e: checkcast org/joml/Quaternionfc
// 071: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 074: aload 3
// 075: getfield net/minecraft/class_10055.field_53459 Z
// 078: iload 4
// 07a: ifle 0cf
// 07d: aload 9
// 07f: ifnonnull 0cf
// 082: goto 090
// 085: ldc2_w -6132501861969397704
// 088: lload 7
// 08a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: athrow
// 090: ifne 0cb
// 093: goto 0a1
// 096: ldc2_w -6132501861969397704
// 099: lload 7
// 09b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a0: athrow
// 0a1: aload 5
// 0a3: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 0a6: aload 3
// 0a7: invokevirtual net/minecraft/class_10055.method_64259 ()F
// 0aa: ldc -90.0
// 0ac: aload 3
// 0ad: getfield net/minecraft/class_10055.field_53448 F
// 0b0: fsub
// 0b1: fmul
// 0b2: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 0b7: checkcast org/joml/Quaternionfc
// 0ba: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 0bd: goto 0cb
// 0c0: ldc2_w -6132501861969397704
// 0c3: lload 7
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: aload 3
// 0cc: getfield net/minecraft/class_10055.field_53535 Z
// 0cf: ifeq 1dc
// 0d2: aload 5
// 0d4: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 0d7: aload 3
// 0d8: getfield net/minecraft/class_10055.field_53521 F
// 0db: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 0e0: checkcast org/joml/Quaternionfc
// 0e3: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 0e6: aload 9
// 0e8: ifnull 1dc
// 0eb: goto 0f9
// 0ee: ldc2_w -6132501861969397704
// 0f1: lload 7
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: bipush 1
// 0fa: anewarray 601
// 0fd: ldc2_w -6175137923115540368
// 100: lload 7
// 102: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: goto 115
// 10a: ldc2_w -6132501861969397704
// 10d: lload 7
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: aload 3
// 116: getfield net/minecraft/class_10055.field_53403 F
// 119: fconst_0
// 11a: fcmpl
// 11b: ifle 1b9
// 11e: aload 5
// 120: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 123: ldc 180.0
// 125: fload 6
// 127: fsub
// 128: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 12d: checkcast org/joml/Quaternionfc
// 130: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 133: aload 5
// 135: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 138: aload 3
// 139: getfield net/minecraft/class_10055.field_53403 F
// 13c: fconst_0
// 13d: aload 3
// 13e: getfield net/minecraft/class_10055.field_53458 Z
// 141: ifeq 167
// 144: goto 152
// 147: ldc2_w -6132501861969397704
// 14a: lload 7
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: ldc -90.0
// 154: aload 3
// 155: getfield net/minecraft/class_10055.field_53448 F
// 158: fsub
// 159: goto 169
// 15c: ldc2_w -6132501861969397704
// 15f: lload 7
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: ldc -90.0
// 169: invokestatic net/minecraft/class_3532.method_16439 (FFF)F
// 16c: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 171: checkcast org/joml/Quaternionfc
// 174: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 177: aload 9
// 179: lload 1
// 17a: lconst_0
// 17b: lcmp
// 17c: iflt 1b6
// 17f: ifnonnull 1af
// 182: aload 3
// 183: getfield net/minecraft/class_10055.field_53412 Z
// 186: ifeq 1dc
// 189: goto 197
// 18c: ldc2_w -6132501861969397704
// 18f: lload 7
// 191: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 196: athrow
// 197: aload 5
// 199: fconst_0
// 19a: ldc -1.0
// 19c: ldc 0.3
// 19e: invokevirtual net/minecraft/class_4587.method_46416 (FFF)V
// 1a1: goto 1af
// 1a4: ldc2_w -6132501861969397704
// 1a7: lload 7
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: iload 4
// 1b1: iflt 1ce
// 1b4: aload 9
// 1b6: ifnull 1dc
// 1b9: aload 5
// 1bb: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 1be: ldc 180.0
// 1c0: fload 6
// 1c2: fsub
// 1c3: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 1c8: checkcast org/joml/Quaternionfc
// 1cb: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 1ce: goto 1dc
// 1d1: ldc2_w -6132501861969397704
// 1d4: lload 7
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: return
}

private static final boolean B(class_2705 param0, gt param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/kf.a J
// 003: ldc2_w 139900063261000
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 94836848861233
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 29765313966925
// 014: lxor
// 015: dup2
// 016: bipush 32
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 32
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 7
// 026: dup2
// 027: bipush 48
// 029: lshl
// 02a: bipush 48
// 02c: lushr
// 02d: l2i
// 02e: istore 8
// 030: pop2
// 031: pop2
// 032: ldc2_w -8135554409479799033
// 035: lload 2
// 036: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03b: aload 1
// 03c: sipush 13256
// 03f: ldc2_w 7612499582844054259
// 042: lload 2
// 043: lxor
// 044: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 049: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 04c: astore 9
// 04e: aload 1
// 04f: invokevirtual su/catlean/gt.u ()Ljava/util/UUID;
// 052: aload 9
// 054: ifnonnull 07d
// 057: aload 0
// 058: invokevirtual net/minecraft/class_2703$class_2705.comp_1107 ()Lcom/mojang/authlib/GameProfile;
// 05b: dup
// 05c: ifnull 07c
// 05f: goto 06c
// 062: ldc2_w -8088604460993651357
// 065: lload 2
// 066: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: athrow
// 06c: invokevirtual com/mojang/authlib/GameProfile.id ()Ljava/util/UUID;
// 06f: goto 07e
// 072: ldc2_w -8088604460993651357
// 075: lload 2
// 076: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: athrow
// 07c: pop
// 07d: aconst_null
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 081: ifeq 10d
// 084: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 087: checkcast su/catlean/_g
// 08a: iload 6
// 08c: getstatic su/catlean/kf.G Lsu/catlean/kf;
// 08f: checkcast su/catlean/_g
// 092: sipush 28116
// 095: ldc2_w 4866624041599071476
// 098: lload 2
// 099: lxor
// 09a: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: bipush 4
// 0a0: anewarray 558
// 0a3: astore 10
// 0a5: aload 10
// 0a7: bipush 0
// 0a8: aload 1
// 0a9: invokevirtual su/catlean/gt.g ()Lnet/minecraft/class_1657;
// 0ac: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 0af: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 0b4: dup
// 0b5: sipush 24152
// 0b8: ldc2_w 96081906689951580
// 0bb: lload 2
// 0bc: lxor
// 0bd: invokedynamic j (IJ)Ljava/lang/String; bsm=su/catlean/kf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c5: aastore
// 0c6: aload 10
// 0c8: bipush 1
// 0c9: aload 1
// 0ca: invokevirtual su/catlean/gt.g ()Lnet/minecraft/class_1657;
// 0cd: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 0d0: d2i
// 0d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 0d4: aastore
// 0d5: aload 10
// 0d7: bipush 2
// 0d8: aload 1
// 0d9: invokevirtual su/catlean/gt.g ()Lnet/minecraft/class_1657;
// 0dc: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 0df: d2i
// 0e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 0e3: aastore
// 0e4: aload 10
// 0e6: bipush 3
// 0e7: aload 1
// 0e8: invokevirtual su/catlean/gt.g ()Lnet/minecraft/class_1657;
// 0eb: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 0ee: d2i
// 0ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 0f2: aastore
// 0f3: aload 10
// 0f5: iload 7
// 0f7: i2c
// 0f8: bipush 0
// 0f9: bipush 4
// 0fa: aconst_null
// 0fb: iload 8
// 0fd: i2s
// 0fe: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 101: bipush 0
// 102: bipush 2
// 103: aconst_null
// 104: lload 4
// 106: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 109: bipush 1
// 10a: goto 10e
// 10d: bipush 0
// 10e: ireturn
}

private static final boolean P(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var20 = a ^ 35319565411781L;
long var22 = var20 ^ 26509496713760L;
long var24 = var20 ^ 44081878240366L;
long var26 = var20 ^ 8453361303816L;
long var28 = var20 ^ 58663485232255L;
int var30 = (int)((var20 ^ 99164602025723L) >>> 48);
long var31 = (var20 ^ 99164602025723L) << 16 >>> 16;
long var33 = var20 ^ 115904558708442L;
int var35 = (int)((var20 ^ 72270031902837L) >>> 56);
long var36 = (var20 ^ 72270031902837L) << 8 >>> 8;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[49];
int var16 = 0;
String var15 = "\u0012ãv*1x\u0081D<'p.\u009bä\\©S\u001cè·.æ\u0019ÒHW?;¡qöTÚ!E\u0016Â\u001a×° 22Oh¡\u0093^\u0003=û\u0089\u0018q\u0091bÏè\u0097û5¢\u0004\u0086Xj!<>FÒý\u009f \u0092ü6ÏÄ¢é\u001fk\u000f\u0083J0äºI\u001d\u008f\u001d3ìXS]\u007fOþ\u0087\u008bîN¡ĀWHX\u008dºö/ZI\u001e\n\u0094º^\u0091Ù)|. Ë\u0089øýSÞ\u0017\u0084î[»\u001b\u0006¬¢\u008a²ß'¤´\u0093FïNý®\u0016]$¨\u0081\f6(\u009fø(¢À\u008b\"\u008dVTX\u000ee\u0004Ï\u0092TÐáÒÍ\u0098ÍY\u0001\u0000Ü/\bÎvKÊÁ\u009d\u0086È\u0089Ìì¾\u0014\u009apéÓ\u001b3E\u0018\u0089¬\u0087Û5TÂmP\náæ[\u0006ÌÝÿ\u0080´)Á=à\u0012!ï\u0010Ù/\u0007\u008cµ0\r´\u001cË¬XÇæ;¾\u0013\u0087&î:,úÓn\u0094Ç\u008cì°lÀKÉiËV\bÙËµÙ|@ùañº\u0006\u000bä]¬6>K\u00193ï$N\u0011\u001bñ\u009f\u0086\u0093îÇmi\b¡\"ü\u0012OqÌìRw\u0083P\u009aæ\u0004\u000eï\u0004hÍ\u001b8\u0093:\"¶¡Óì<\u0015% gÍëÖîQH;>>¦_ehµº°\u0014M\u0080\u0084~M·Åæi¸\u0002\\qáìJÕq¦Âz9¢Æ¬T¡Ï\u0086\u0082\u0016Ç\u0099\u009b[Ï÷0V¥Ì\u0015Â'Q<\u008fó{ý2^â±ß\u0081\u009a\u0080áíöø\tÍe\f\u0089HG¢\u0013\u009b^\u0017#OÑ4\u0013\u0015\u0013f\u000e¹9|\u0010è\u000f¶ñðL\\¹mÒ(\u00886|Êúû§\u0099k\"b\u001a\u0092AýL'k@<X@ÕbÔü\u0084w\u0091$Ô¨ \u0096 LøÂÂ§ \u0093\r?\u0095d5¯\u0017ê\u0014\u0098\u0082ì§ß§g\u0096] Q\"\u0097r\u0010\u0017¶b®6vÃ!K\u0003\u0085ØÙ6à\u0086\u0018Ù,ÑÆ)z\u000eòæ½yg¹gÎ<\u001d\u000fT¢0GB\\\u0018+Ð\u0014æú*\u007fä\u0000\u0093±¬j{½n\u0013´\\\"K¾jT ãÓ\u0002Ê¯<ªTt\u0098Çä+®<)\u0097\u0002\u009cp¿\u0012+\u0081~Eóõ\u0093H®\u0082IÝÏ#Ù`\u008d\u0083²}\u0004´\u001ehøìÜà\u0014è\u008dü&®\u0083\u0013QËCsàMéF>)/\u00ad_N\u0081\u0096¢ÌH\u0001éÆLEüñ\u001d¶ìdÄfÓþ¤\u0083\rj\u00adZ4\u008dDE\u0095\u0097d\u008eVÁ)\u0018²(h÷\\~ß\u0014\u0000Ñà=\u0088¾òj Y$\u0003ã\u0088(Å:\u001d)ø8Îfp\u0089A\fæÈMñ\u0088ÇÖß\t\u0007®Ï'äO\u0018pB/H\u0083Ez\u0083~}[¬n\u0004\u0015mÙÄþr7\u00912\u0099 ø\u0095Y\u000b'\u009d\u007fé\u008aEY\u009dz¯\tÉ\u0094¶å~®çN\tèíHÉgâß) B\f\u00858¢±&É\u0007\u008e]:Îýè6xm-«\u0019\u0019r\u0087\u001aVS\u008då\u0017ÛH\u0010\bû!ß×\u0096D^«\u001f+¡í\u008dù#8Ïã\u009c\u0096³Óµ)õ\u008d\u0006e\u0092 ã|í\u008að/ªN\u0001àåtd·¡2¹TÔÅÄèó.M÷ç¹RAÐmC«®8àMí¦Ó\u0082 Ï\r3ë\u001a\u0091Ë\u009d\u0093_\u008a]\u0099V1\b¡B\u0002|P-ÆhË¨\u0006Òñ>´V¨0qÄP<ùP²Î\u0088½7Ãåõ×\u001bY\u0093Xü*ð\u008bl=ìdÑ\f²Ûa£É¿\u008fZ\u001bb\u0084¯\u0015ê|Í\rÅá\u0010ê\u0088ìª×EÎPÐñ:¯\u0095\u007fñÁÑák:z¿\u0094\u009eG#\u001a°:r\u008aÔoFaa\u001a\føÍ!\u001f%²\bê\u001bß¯\u0005\u001biûÈ.\\sq÷\u001b\u0011\u008e\u0013MN\u0085\u0094\u0085Uèô\u0006\u0080+»úq\u000bÙ7\u0080\u0003yH\u0018\u0087çàë¢s\u0082${\u0006Ä\u008b&\u0014OÅ\u000b%B5R¤ÛÛ\u0084q&äh\u008e\u001f\u0000¬([2á±¶\u0013±;\u0096\u00ad°¡t©\u0010Ôô\u0001ÁÌ8KºÁÆ²¾¶¾\u001f%\u0002\u0084\u0093y\u0098yi«w ÓãÇ\u0006ìÓ§Ò©@\u0019ägc\u0082\u001cÓ\u009b\u0082Xó½ç´¼J[\u009eèzÃB\u0010\u009cvÀ\u0016zZÙ\u0096*X?\u008e¡Ç-\u007f(q~ÊV¦°ó£iú»ñ4b\u0015;t{ä\\q\u008eË\u001cæüD\u009c'ëg\u0002\u008dÂs(\u0003\u0095\u0093ä\u0010A\u0084ñ\u00175\rtl\u0088ðß-äZDÞ \u0014ÌÁ§\u001eý\u008cÎöÜ]{¨ÓJÏ\u0016GßÆ¢\u001a2\u0014tÑ¸ ãÇ®Ù\u0010ä\u009bÂB\u0096àtSh\u0011\u001dsûöl\u008a8&ZÖH&>\u009e\u0081\u008f\t±Nµ;±³@>°»\u009dd/5\u0015®²|]ùr´V\u0099 ÖjÜ\u0015\u0099`\u00068ð°º\u0016`<ðæ¤×aÙà\u0010Ûç¸ÔÖ;\u009eÌ4»2Ô\u0083$$ø\u0010bCâ¹\u0080\u0081n\u0098z>\u008fò\u007fD#\r \u0017³´\\Ö\\Ú\u0080ÖN\u0094|ì¯&¶>BÎ\u009b\u0082\u008eþüWÓ\u0097^\u000bøKë \u0015£\u0006£ÏÅ\u009c(N©â\u001cí©KÀWvþIÎ\u008891Î\u008e\u0090´t\u0084[¼ \u001eä¨\u0098F¸ÈUc\u0088dTdBo.\u001fPá,-Ê??Ó\n\u0082ÊKË\u0099X\u0018\u0090\tª+\r\bÒZhÜ\u0004¾\u0000ó^\u0082\u0093Fk[\u0019X\u0087l([(ª=°øê3Ra\u0019Î¸1úE\u009aÒ8ÞëR\f\u001eûõ0~²\u0084rV<ê}öî\u0017T&(Zô\u00175S:áV`¹ ¢\u0018\u0011.Ôª?9-°.W\u0094výa\"ÆÄ\u000eC%E÷½ v\u0098\u0090(Ê:\n\u000e\rP\u000eö\u009fþê\u0096õ\u0014\u0019à½>c¾YëÙà´ü5Ýå\fù÷ ¾9±\u0006§\u008bÞ\u0010\u0093\"øvséÚ\u0080S\u008fI¨\u0084q#í ¢¹Ý\u0090Z\u0014¬äÇ¦¼Qli+\u0094MWF×\u0094\u0084u\bxV¯\u0090\u0082¤ª> ²,\u0004ª.T$;\u0001têÒ\u0081ºòøæ\u0080öøå\u008dî|,Þ<\u001f\u0005\u009d\u0001\u0019\u0018\u0003\u00adi\u008b«3E æ \u0084\u00144\u0016÷\u0081ì\u0085\u009bþ\u0012ì\u0084¼ \u0092\u0000ýê*Õ1Y\u0017\u008d\u0019VC¾i}\"Ù*`A¯\"\u001c4pÄ½¡jõÎ(OfZ\u0091±Ñ5 ûÂ\u0017ê|z9Ë\\²Ñj\u0087\u0089¯\u0006\u0087\u0097÷-\fg\u0096\u0007\u0088(yUÀsN\u001a ¡\nlÞ\u0093\u0087\u009fâö¦!\u008cºÿ\u0094\u00ad»ü%}m~Dì\u0007H\u0081³}\u0013\u0016\u0081\u0010%Wá\u0080\u009d\u008d\u009e\u000eô-W«\u0094=Ï¡ 0ü\u008e\b°g¸|ó¢û9Ë©\u0083É#v\u008bÒ\u0086\u0018\u0095ì[`\u000fzbÑË«\u0010x\u0005\\P\u008c®Nù»õZQ>sìµ ß \u009c\u0002Fb÷n=i¿J\u001eK\u001e>\u0012\u0093®\u0018Üá\u0097\u0003\u001fòûÀÔÒÀ[ 8ºB\u0090Z.£y¾Ñ-3R\u0091\u0089í\u0083;ôð_·á\u0092Ë\u0016\u001b²\u000fb60\u0018ß½M\u0090Çvkh\u0004ò`°WÞã.6<\u008ew\u009e×\u0087)";
int var17 = "\u0012ãv*1x\u0081D<'p.\u009bä\\©S\u001cè·.æ\u0019ÒHW?;¡qöTÚ!E\u0016Â\u001a×° 22Oh¡\u0093^\u0003=û\u0089\u0018q\u0091bÏè\u0097û5¢\u0004\u0086Xj!<>FÒý\u009f \u0092ü6ÏÄ¢é\u001fk\u000f\u0083J0äºI\u001d\u008f\u001d3ìXS]\u007fOþ\u0087\u008bîN¡ĀWHX\u008dºö/ZI\u001e\n\u0094º^\u0091Ù)|. Ë\u0089øýSÞ\u0017\u0084î[»\u001b\u0006¬¢\u008a²ß'¤´\u0093FïNý®\u0016]$¨\u0081\f6(\u009fø(¢À\u008b\"\u008dVTX\u000ee\u0004Ï\u0092TÐáÒÍ\u0098ÍY\u0001\u0000Ü/\bÎvKÊÁ\u009d\u0086È\u0089Ìì¾\u0014\u009apéÓ\u001b3E\u0018\u0089¬\u0087Û5TÂmP\náæ[\u0006ÌÝÿ\u0080´)Á=à\u0012!ï\u0010Ù/\u0007\u008cµ0\r´\u001cË¬XÇæ;¾\u0013\u0087&î:,úÓn\u0094Ç\u008cì°lÀKÉiËV\bÙËµÙ|@ùañº\u0006\u000bä]¬6>K\u00193ï$N\u0011\u001bñ\u009f\u0086\u0093îÇmi\b¡\"ü\u0012OqÌìRw\u0083P\u009aæ\u0004\u000eï\u0004hÍ\u001b8\u0093:\"¶¡Óì<\u0015% gÍëÖîQH;>>¦_ehµº°\u0014M\u0080\u0084~M·Åæi¸\u0002\\qáìJÕq¦Âz9¢Æ¬T¡Ï\u0086\u0082\u0016Ç\u0099\u009b[Ï÷0V¥Ì\u0015Â'Q<\u008fó{ý2^â±ß\u0081\u009a\u0080áíöø\tÍe\f\u0089HG¢\u0013\u009b^\u0017#OÑ4\u0013\u0015\u0013f\u000e¹9|\u0010è\u000f¶ñðL\\¹mÒ(\u00886|Êúû§\u0099k\"b\u001a\u0092AýL'k@<X@ÕbÔü\u0084w\u0091$Ô¨ \u0096 LøÂÂ§ \u0093\r?\u0095d5¯\u0017ê\u0014\u0098\u0082ì§ß§g\u0096] Q\"\u0097r\u0010\u0017¶b®6vÃ!K\u0003\u0085ØÙ6à\u0086\u0018Ù,ÑÆ)z\u000eòæ½yg¹gÎ<\u001d\u000fT¢0GB\\\u0018+Ð\u0014æú*\u007fä\u0000\u0093±¬j{½n\u0013´\\\"K¾jT ãÓ\u0002Ê¯<ªTt\u0098Çä+®<)\u0097\u0002\u009cp¿\u0012+\u0081~Eóõ\u0093H®\u0082IÝÏ#Ù`\u008d\u0083²}\u0004´\u001ehøìÜà\u0014è\u008dü&®\u0083\u0013QËCsàMéF>)/\u00ad_N\u0081\u0096¢ÌH\u0001éÆLEüñ\u001d¶ìdÄfÓþ¤\u0083\rj\u00adZ4\u008dDE\u0095\u0097d\u008eVÁ)\u0018²(h÷\\~ß\u0014\u0000Ñà=\u0088¾òj Y$\u0003ã\u0088(Å:\u001d)ø8Îfp\u0089A\fæÈMñ\u0088ÇÖß\t\u0007®Ï'äO\u0018pB/H\u0083Ez\u0083~}[¬n\u0004\u0015mÙÄþr7\u00912\u0099 ø\u0095Y\u000b'\u009d\u007fé\u008aEY\u009dz¯\tÉ\u0094¶å~®çN\tèíHÉgâß) B\f\u00858¢±&É\u0007\u008e]:Îýè6xm-«\u0019\u0019r\u0087\u001aVS\u008då\u0017ÛH\u0010\bû!ß×\u0096D^«\u001f+¡í\u008dù#8Ïã\u009c\u0096³Óµ)õ\u008d\u0006e\u0092 ã|í\u008að/ªN\u0001àåtd·¡2¹TÔÅÄèó.M÷ç¹RAÐmC«®8àMí¦Ó\u0082 Ï\r3ë\u001a\u0091Ë\u009d\u0093_\u008a]\u0099V1\b¡B\u0002|P-ÆhË¨\u0006Òñ>´V¨0qÄP<ùP²Î\u0088½7Ãåõ×\u001bY\u0093Xü*ð\u008bl=ìdÑ\f²Ûa£É¿\u008fZ\u001bb\u0084¯\u0015ê|Í\rÅá\u0010ê\u0088ìª×EÎPÐñ:¯\u0095\u007fñÁÑák:z¿\u0094\u009eG#\u001a°:r\u008aÔoFaa\u001a\føÍ!\u001f%²\bê\u001bß¯\u0005\u001biûÈ.\\sq÷\u001b\u0011\u008e\u0013MN\u0085\u0094\u0085Uèô\u0006\u0080+»úq\u000bÙ7\u0080\u0003yH\u0018\u0087çàë¢s\u0082${\u0006Ä\u008b&\u0014OÅ\u000b%B5R¤ÛÛ\u0084q&äh\u008e\u001f\u0000¬([2á±¶\u0013±;\u0096\u00ad°¡t©\u0010Ôô\u0001ÁÌ8KºÁÆ²¾¶¾\u001f%\u0002\u0084\u0093y\u0098yi«w ÓãÇ\u0006ìÓ§Ò©@\u0019ägc\u0082\u001cÓ\u009b\u0082Xó½ç´¼J[\u009eèzÃB\u0010\u009cvÀ\u0016zZÙ\u0096*X?\u008e¡Ç-\u007f(q~ÊV¦°ó£iú»ñ4b\u0015;t{ä\\q\u008eË\u001cæüD\u009c'ëg\u0002\u008dÂs(\u0003\u0095\u0093ä\u0010A\u0084ñ\u00175\rtl\u0088ðß-äZDÞ \u0014ÌÁ§\u001eý\u008cÎöÜ]{¨ÓJÏ\u0016GßÆ¢\u001a2\u0014tÑ¸ ãÇ®Ù\u0010ä\u009bÂB\u0096àtSh\u0011\u001dsûöl\u008a8&ZÖH&>\u009e\u0081\u008f\t±Nµ;±³@>°»\u009dd/5\u0015®²|]ùr´V\u0099 ÖjÜ\u0015\u0099`\u00068ð°º\u0016`<ðæ¤×aÙà\u0010Ûç¸ÔÖ;\u009eÌ4»2Ô\u0083$$ø\u0010bCâ¹\u0080\u0081n\u0098z>\u008fò\u007fD#\r \u0017³´\\Ö\\Ú\u0080ÖN\u0094|ì¯&¶>BÎ\u009b\u0082\u008eþüWÓ\u0097^\u000bøKë \u0015£\u0006£ÏÅ\u009c(N©â\u001cí©KÀWvþIÎ\u008891Î\u008e\u0090´t\u0084[¼ \u001eä¨\u0098F¸ÈUc\u0088dTdBo.\u001fPá,-Ê??Ó\n\u0082ÊKË\u0099X\u0018\u0090\tª+\r\bÒZhÜ\u0004¾\u0000ó^\u0082\u0093Fk[\u0019X\u0087l([(ª=°øê3Ra\u0019Î¸1úE\u009aÒ8ÞëR\f\u001eûõ0~²\u0084rV<ê}öî\u0017T&(Zô\u00175S:áV`¹ ¢\u0018\u0011.Ôª?9-°.W\u0094výa\"ÆÄ\u000eC%E÷½ v\u0098\u0090(Ê:\n\u000e\rP\u000eö\u009fþê\u0096õ\u0014\u0019à½>c¾YëÙà´ü5Ýå\fù÷ ¾9±\u0006§\u008bÞ\u0010\u0093\"øvséÚ\u0080S\u008fI¨\u0084q#í ¢¹Ý\u0090Z\u0014¬äÇ¦¼Qli+\u0094MWF×\u0094\u0084u\bxV¯\u0090\u0082¤ª> ²,\u0004ª.T$;\u0001têÒ\u0081ºòøæ\u0080öøå\u008dî|,Þ<\u001f\u0005\u009d\u0001\u0019\u0018\u0003\u00adi\u008b«3E æ \u0084\u00144\u0016÷\u0081ì\u0085\u009bþ\u0012ì\u0084¼ \u0092\u0000ýê*Õ1Y\u0017\u008d\u0019VC¾i}\"Ù*`A¯\"\u001c4pÄ½¡jõÎ(OfZ\u0091±Ñ5 ûÂ\u0017ê|z9Ë\\²Ñj\u0087\u0089¯\u0006\u0087\u0097÷-\fg\u0096\u0007\u0088(yUÀsN\u001a ¡\nlÞ\u0093\u0087\u009fâö¦!\u008cºÿ\u0094\u00ad»ü%}m~Dì\u0007H\u0081³}\u0013\u0016\u0081\u0010%Wá\u0080\u009d\u008d\u009e\u000eô-W«\u0094=Ï¡ 0ü\u008e\b°g¸|ó¢û9Ë©\u0083É#v\u008bÒ\u0086\u0018\u0095ì[`\u000fzbÑË«\u0010x\u0005\\P\u008c®Nù»õZQ>sìµ ß \u009c\u0002Fb÷n=i¿J\u001eK\u001e>\u0012\u0093®\u0018Üá\u0097\u0003\u001fòûÀÔÒÀ[ 8ºB\u0090Z.£y¾Ñ-3R\u0091\u0089í\u0083;ôð_·á\u0092Ë\u0016\u001b²\u000fb60\u0018ß½M\u0090Çvkh\u0004ò`°WÞã.6<\u008ew\u009e×\u0087)"
.length();
char var14 = '(';
int var41 = -1;

label54:
while (true) {
String var42 = var15.substring(++var41, var41 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var42.getBytes("ISO-8859-1"));
String var56 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var56;
if ((var41 += var14) >= var17) {
b = var18;
d = new String[49];
l = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[20];
int var3 = 0;
String var4 = "\u0010\u008cª¹\u001av~4E\u0015ØF ë\u0095\u009e±[óÝì¦\u0088\u0088¿¤§Fu/,+\u0093h×~êã³W]ò\u0004\u009d\u0086PÈH\u0081XR>·\u0012\u000bÐÄåäS \u008auì\r@\u0080úþ\u001dû\u009c\u0089\u0004\u0098\u009ee\u0010X0ß\u0011÷\u001b£}\u0004¥\u0092\u0098\u001e\u000f7?\r-\u0097\u008fOÇ\u0016x´ÓðM\u0010fTèÒë\u008c×â{Õ\u0006¹\\'°u\u001dU]¦*\u0086ÜÜ1iíP\"\"\u0084>3Å\u0002ªÏ";
int var5 = "\u0010\u008cª¹\u001av~4E\u0015ØF ë\u0095\u009e±[óÝì¦\u0088\u0088¿¤§Fu/,+\u0093h×~êã³W]ò\u0004\u009d\u0086PÈH\u0081XR>·\u0012\u000bÐÄåäS \u008auì\r@\u0080úþ\u001dû\u009c\u0089\u0004\u0098\u009ee\u0010X0ß\u0011÷\u001b£}\u0004¥\u0092\u0098\u001e\u000f7?\r-\u0097\u008fOÇ\u0016x´ÓðM\u0010fTèÒë\u008c×â{Õ\u0006¹\\'°u\u001dU]¦*\u0086ÜÜ1iíP\"\"\u0084>3Å\u0002ªÏ"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var45 = var6;
var10001 = var3++;
long var60 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var64 = -1;

while (true) {
long var8 = var60;
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
switch (var64) {
case 0:
var45[var10001] = var67;
if (var2 >= var5) {
f = var6;
k = new Integer[20];
KProperty[] var38 = new KProperty[c<"m">(27493, 1330640740944848832L ^ var20)];
var38[0] = Reflection.property1(
new PropertyReference1Impl(kf.class, b<"j">(8441, 5300946848781401460L ^ var20), b<"j">(11479, 3367708329273520479L ^ var20), 0)
);
var38[1] = Reflection.property1(
new PropertyReference1Impl(kf.class, b<"j">(18391, 1635935768734177862L ^ var20), b<"j">(17058, 3744337655810727740L ^ var20), 0)
);
var38[2] = Reflection.property1(
new PropertyReference1Impl(kf.class, b<"j">(10406, 3320768253615600905L ^ var20), b<"j">(7503, 8851006599111557330L ^ var20), 0)
);
var38[3] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kf.class, b<"j">(1653, 6131517173201918934L ^ var20), b<"j">(16571, 6053345665831083307L ^ var20), 0)
);
var38[4] = Reflection.mutableProperty1(
new MutablePropertyReference1Impl(kf.class, b<"j">(19434, 3486095610527061630L ^ var20), b<"j">(20696, 394408615935348035L ^ var20), 0)
);
var38[5] = Reflection.property1(new PropertyReference1Impl(kf.class, b<"j">(803, 749638982728900278L ^ var20), b<"j">(15356, 1564808078374331990L ^ var20), 0));
var38[c<"m">(24858, 4357057230928063934L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(kf.class, b<"j">(1370, 7461071547865585858L ^ var20), b<"j">(7287, 4375172383357518302L ^ var20), 0)
);
j = var38;
G = new kf((byte)var35, var36);
u = yp.L(G, b<"j">(29019, 1539694394631990481L ^ var20), ne.GHOST, null, null, c<"m">(15136, 3291774298936670088L ^ var20), null, var33);
jk var46 = G;
short var54 = (short)var30;
String var62 = b<"j">(8155, 1153296143235433087L ^ var20);
Color var66 = Color.WHITE;
Intrinsics.checkNotNullExpressionValue(Color.WHITE, b<"j">(7742, 565459401327100862L ^ var20));
K = yp.b(var46, var54, var62, var66, null, null, c<"m">(1321, 8496284274352900491L ^ var20), null, var31);
m = yp.t(G, b<"j">(2691, 2801466106008229640L ^ var20), false, var24, null, null, c<"m">(1321, 8496284274352900491L ^ var20), null);
c = yp.L(
G,
b<"j">(25733, 2429421942453516572L ^ var20),
c<"m">(26506, 8520284888524106547L ^ var20),
new IntRange(1, c<"m">(4343, 5184036561742126173L ^ var20)),
var26,
null,
null,
c<"m">(27572, 2572118374837495577L ^ var20),
null
);
g = yp.L(
G,
b<"j">(8097, 940300484117381639L ^ var20),
c<"m">(767, 4873135938073513540L ^ var20),
new IntRange(1, c<"m">(23215, 7989263364345140739L ^ var20)),
var26,
null,
null,
c<"m">(16039, 2486244224836760064L ^ var20),
null
);
i = yp.t(G, b<"j">(32720, 1520260509554549331L ^ var20), false, var24, null, null, c<"m">(1321, 8496284274352900491L ^ var20), null);
F = yp.k(
G, b<"j">(19727, 1275565870855393453L ^ var20), 1.0F, var22, RangesKt.rangeTo(0.0F, 3600.0F), null, null, c<"m">(16039, 2486244224836760064L ^ var20), null
);
ConcurrentMap var47 = Maps.newConcurrentMap();
Intrinsics.checkNotNullExpressionValue(var47, b<"j">(13747, 5032516356850968629L ^ var20));
h = var47;
z = new ArrayList();
S = new bj(b<"j">(27792, 4589068621160755509L ^ var20), c<"m">(20599, 7212795721732758740L ^ var20), c<"m">(6884, 8507790267173688924L ^ var20), var28);
return;
}
break;
default:
var45[var10001] = var67;
if (var2 < var5) {
continue label36;
}

var4 = "\u0003ë_¤F\u000fÌ.qþ\u0098z\u0085øI{";
var5 = "\u0003ë_¤F\u000fÌ.qþ\u0098z\u0085øI{".length();
var2 = 0;
}

byte var53 = var2;
var2 += 8;
var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
var45 = var6;
var10001 = var3++;
var60 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var64 = 0;
}
}
}

var14 = var15.charAt(var41);
break;
default:
var18[var16++] = var56;
if ((var41 += var14) < var17) {
var14 = var15.charAt(var41);
continue label54;
}

var15 = "\u009eK[aÐd\u0001»Ò8ì&Òªú¶Y\u000f9!\u0002\u0016ë\u001f\u0096ÑÔeÆñó@¼\u0085j\u0015\u0017tý/\u0010Ä©\u0092î\u0013\u0091áb\u009f¸\u0016Õ4¯\\s";
var17 = "\u009eK[aÐd\u0001»Ò8ì&Òªú¶Y\u000f9!\u0002\u0016ë\u001f\u0096ÑÔeÆñó@¼\u0085j\u0015\u0017tý/\u0010Ä©\u0092î\u0013\u0091áb\u009f¸\u0016Õ4¯\\s".length();
var14 = '(';
var41 = -1;
}

var42 = var15.substring(++var41, var41 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 5946;
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
throw new RuntimeException("su/catlean/kf", var10);
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
throw new RuntimeException("su/catlean/kf" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 1559;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/kf", var14);
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
throw new RuntimeException("su/catlean/kf" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
