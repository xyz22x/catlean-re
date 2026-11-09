package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_3532;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class dx {
@NotNull
public static final dx K;
@NotNull
private static final Map C;
@NotNull
private static final Map h;
private static boolean T;
private static final long a = yz.a(7055298509209557053L, -4486721008109769127L, MethodHandles.lookup().lookupClass()).a(82006569698813L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long i;

private dx() {
}

@Flow(
priority = 10
)
private final void F(ReceivePacket param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dx.a J
// 003: ldc2_w 50524064249094
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 78429587339749
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 112039727614308
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 89172700231979
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 5224093147805
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w -6605798347197061254
// 029: lload 2
// 02a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: aload 1
// 030: invokevirtual su/catlean/api/event/events/network/ReceivePacket.getPacket ()Lnet/minecraft/class_2596;
// 033: astore 13
// 035: astore 12
// 037: aload 13
// 039: instanceof net/minecraft/class_2663
// 03c: aload 12
// 03e: ifnull 078
// 041: ifeq 1cf
// 044: goto 051
// 047: ldc2_w -6519955466238039009
// 04a: lload 2
// 04b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: athrow
// 051: aload 13
// 053: checkcast net/minecraft/class_2663
// 056: aload 12
// 058: ifnull 09a
// 05b: goto 068
// 05e: ldc2_w -6519955466238039009
// 061: lload 2
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: invokevirtual net/minecraft/class_2663.method_11470 ()B
// 06b: goto 078
// 06e: ldc2_w -6519955466238039009
// 071: lload 2
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: sipush 25763
// 07b: ldc2_w 4249037197156640878
// 07e: lload 2
// 07f: lxor
// 080: invokedynamic j (IJ)I bsm=su/catlean/dx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: if_icmpne 1cf
// 088: aload 13
// 08a: checkcast net/minecraft/class_2663
// 08d: goto 09a
// 090: ldc2_w -6519955466238039009
// 093: lload 2
// 094: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: athrow
// 09a: lload 6
// 09c: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 09f: checkcast net/minecraft/class_1937
// 0a2: invokevirtual net/minecraft/class_2663.method_11469 (Lnet/minecraft/class_1937;)Lnet/minecraft/class_1297;
// 0a5: astore 16
// 0a7: aload 16
// 0a9: aload 12
// 0ab: ifnull 0d0
// 0ae: instanceof net/minecraft/class_1657
// 0b1: ifeq 0d6
// 0b4: goto 0c1
// 0b7: ldc2_w -6519955466238039009
// 0ba: lload 2
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: aload 16
// 0c3: goto 0d0
// 0c6: ldc2_w -6519955466238039009
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: checkcast net/minecraft/class_1657
// 0d3: goto 0d7
// 0d6: aconst_null
// 0d7: dup
// 0d8: ifnonnull 0e7
// 0db: pop
// 0dc: return
// 0dd: ldc2_w -6519955466238039009
// 0e0: lload 2
// 0e1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: athrow
// 0e7: astore 14
// 0e9: aload 14
// 0eb: lload 4
// 0ed: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 0f3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f6: ifeq 104
// 0f9: return
// 0fa: ldc2_w -6519955466238039009
// 0fd: lload 2
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: getstatic su/catlean/dx.C Ljava/util/Map;
// 107: astore 15
// 109: aload 14
// 10b: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 10e: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 113: astore 16
// 115: getstatic su/catlean/dx.C Ljava/util/Map;
// 118: aload 14
// 11a: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 11d: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 122: dup
// 123: sipush 1238
// 126: ldc2_w 2962457263266148744
// 129: lload 2
// 12a: lxor
// 12b: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 133: bipush 0
// 134: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 137: invokeinterface java/util/Map.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 13c: checkcast java/lang/Number
// 13f: invokevirtual java/lang/Number.intValue ()I
// 142: bipush 1
// 143: iadd
// 144: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 147: astore 17
// 149: aload 15
// 14b: aload 16
// 14d: aload 17
// 14f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 154: pop
// 155: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 158: aload 12
// 15a: ifnull 182
// 15d: lload 10
// 15f: invokevirtual su/catlean/q1.f (J)Z
// 162: ifeq 1cf
// 165: goto 172
// 168: ldc2_w -6519955466238039009
// 16b: lload 2
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: getstatic su/catlean/q1.W Lsu/catlean/q1;
// 175: goto 182
// 178: ldc2_w -6519955466238039009
// 17b: lload 2
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: aload 14
// 184: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 187: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 18c: dup
// 18d: sipush 1238
// 190: ldc2_w 2962457263266148744
// 193: lload 2
// 194: lxor
// 195: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 19d: getstatic su/catlean/dx.C Ljava/util/Map;
// 1a0: aload 14
// 1a2: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
// 1a5: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 1aa: dup
// 1ab: sipush 1238
// 1ae: ldc2_w 2962457263266148744
// 1b1: lload 2
// 1b2: lxor
// 1b3: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1bb: bipush 0
// 1bc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 1bf: invokeinterface java/util/Map.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 1c4: checkcast java/lang/Number
// 1c7: invokevirtual java/lang/Number.intValue ()I
// 1ca: lload 8
// 1cc: invokevirtual su/catlean/q1.s (Ljava/lang/String;IJ)V
// 1cf: return
}

@Flow(
priority = 10
)
private final void R(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dx.a J
// 003: ldc2_w 43247300209776
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 122323071651858
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 120222595346101
// 014: lxor
// 015: lstore 6
// 017: pop2
// 018: ldc2_w 4406059478016163340
// 01b: lload 2
// 01c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 021: lload 4
// 023: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 026: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 029: dup
// 02a: sipush 2054
// 02d: ldc2_w 4188886954554926121
// 030: lload 2
// 031: lxor
// 032: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 037: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 03a: checkcast java/lang/Iterable
// 03d: astore 9
// 03f: astore 8
// 041: bipush 0
// 042: istore 10
// 044: aload 9
// 046: astore 11
// 048: new java/util/ArrayList
// 04b: dup
// 04c: invokespecial java/util/ArrayList.<init> ()V
// 04f: checkcast java/util/Collection
// 052: astore 12
// 054: bipush 0
// 055: istore 13
// 057: aload 11
// 059: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 05e: astore 14
// 060: aload 14
// 062: invokeinterface java/util/Iterator.hasNext ()Z 1
// 067: ifeq 170
// 06a: aload 14
// 06c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 071: astore 15
// 073: aload 15
// 075: checkcast net/minecraft/class_742
// 078: astore 16
// 07a: bipush 0
// 07b: istore 17
// 07d: aload 16
// 07f: invokevirtual net/minecraft/class_742.method_6032 ()F
// 082: fconst_0
// 083: fcmpg
// 084: aload 8
// 086: ifnull 17d
// 089: aload 8
// 08b: ifnull 110
// 08e: goto 09b
// 091: ldc2_w 4391710759840806249
// 094: lload 2
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: ifle 0f9
// 09e: goto 0ab
// 0a1: ldc2_w 4391710759840806249
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: aload 16
// 0ad: invokevirtual net/minecraft/class_742.method_5805 ()Z
// 0b0: aload 8
// 0b2: ifnull 110
// 0b5: goto 0c2
// 0b8: ldc2_w 4391710759840806249
// 0bb: lload 2
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: ifeq 0f9
// 0c5: goto 0d2
// 0c8: ldc2_w 4391710759840806249
// 0cb: lload 2
// 0cc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d1: athrow
// 0d2: aload 16
// 0d4: invokevirtual net/minecraft/class_742.method_29504 ()Z
// 0d7: aload 8
// 0d9: ifnull 110
// 0dc: goto 0e9
// 0df: ldc2_w 4391710759840806249
// 0e2: lload 2
// 0e3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e8: athrow
// 0e9: ifeq 15d
// 0ec: goto 0f9
// 0ef: ldc2_w 4391710759840806249
// 0f2: lload 2
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: aload 16
// 0fb: lload 6
// 0fd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 100: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 103: goto 110
// 106: ldc2_w 4391710759840806249
// 109: lload 2
// 10a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10f: athrow
// 110: aload 8
// 112: ifnull 144
// 115: ifne 15d
// 118: goto 125
// 11b: ldc2_w 4391710759840806249
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: getstatic su/catlean/dx.h Ljava/util/Map;
// 128: aload 16
// 12a: invokevirtual net/minecraft/class_742.method_5477 ()Lnet/minecraft/class_2561;
// 12d: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 132: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
// 137: goto 144
// 13a: ldc2_w 4391710759840806249
// 13d: lload 2
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: aload 8
// 146: ifnull 15a
// 149: ifne 15d
// 14c: goto 159
// 14f: ldc2_w 4391710759840806249
// 152: lload 2
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: bipush 1
// 15a: goto 15e
// 15d: bipush 0
// 15e: ifeq 060
// 161: aload 12
// 163: aload 15
// 165: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 16a: pop
// 16b: aload 8
// 16d: ifnonnull 060
// 170: aload 12
// 172: checkcast java/util/List
// 175: nop
// 176: checkcast java/lang/Iterable
// 179: astore 9
// 17b: nop
// 17c: bipush 0
// 17d: istore 10
// 17f: aload 9
// 181: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 186: astore 11
// 188: aload 11
// 18a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 18f: ifeq 239
// 192: aload 11
// 194: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 199: astore 12
// 19b: aload 12
// 19d: checkcast net/minecraft/class_742
// 1a0: astore 13
// 1a2: bipush 0
// 1a3: istore 14
// 1a5: getstatic su/catlean/api/event/events/network/PlayerEntityDeathEvent.INSTANCE Lsu/catlean/api/event/events/network/PlayerEntityDeathEvent;
// 1a8: astore 15
// 1aa: aload 15
// 1ac: astore 16
// 1ae: bipush 0
// 1af: istore 17
// 1b1: aload 16
// 1b3: aload 13
// 1b5: checkcast net/minecraft/class_1657
// 1b8: invokevirtual su/catlean/api/event/events/network/PlayerEntityDeathEvent.setPlayer (Lnet/minecraft/class_1657;)V
// 1bb: aload 16
// 1bd: getstatic su/catlean/dx.C Ljava/util/Map;
// 1c0: aload 13
// 1c2: invokevirtual net/minecraft/class_742.method_5477 ()Lnet/minecraft/class_2561;
// 1c5: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 1ca: dup
// 1cb: sipush 21490
// 1ce: ldc2_w 479174853779423189
// 1d1: lload 2
// 1d2: lxor
// 1d3: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1db: bipush 0
// 1dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 1df: invokeinterface java/util/Map.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 1e4: checkcast java/lang/Number
// 1e7: invokevirtual java/lang/Number.intValue ()I
// 1ea: invokevirtual su/catlean/api/event/events/network/PlayerEntityDeathEvent.setTotemsPopped (I)V
// 1ed: nop
// 1ee: aload 15
// 1f0: invokevirtual su/catlean/api/event/events/network/PlayerEntityDeathEvent.call ()Z
// 1f3: pop
// 1f4: getstatic su/catlean/dx.h Ljava/util/Map;
// 1f7: aload 13
// 1f9: invokevirtual net/minecraft/class_742.method_5477 ()Lnet/minecraft/class_2561;
// 1fc: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 201: invokestatic su/catlean/zf.A ()J
// 204: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 207: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 20c: pop
// 20d: getstatic su/catlean/dx.C Ljava/util/Map;
// 210: aload 13
// 212: invokevirtual net/minecraft/class_742.method_5477 ()Lnet/minecraft/class_2561;
// 215: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 21a: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
// 21f: pop
// 220: nop
// 221: nop
// 222: aload 8
// 224: ifnull 23a
// 227: aload 8
// 229: ifnonnull 188
// 22c: goto 239
// 22f: ldc2_w 4391710759840806249
// 232: lload 2
// 233: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 238: athrow
// 239: nop
// 23a: new java/util/ArrayList
// 23d: dup
// 23e: invokespecial java/util/ArrayList.<init> ()V
// 241: checkcast java/util/List
// 244: astore 9
// 246: getstatic su/catlean/dx.h Ljava/util/Map;
// 249: astore 10
// 24b: bipush 0
// 24c: istore 11
// 24e: aload 10
// 250: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 255: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 25a: astore 12
// 25c: aload 12
// 25e: invokeinterface java/util/Iterator.hasNext ()Z 1
// 263: ifeq 2e2
// 266: aload 12
// 268: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 26d: checkcast java/util/Map$Entry
// 270: astore 13
// 272: aload 13
// 274: astore 14
// 276: bipush 0
// 277: istore 15
// 279: aload 14
// 27b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 280: checkcast java/lang/String
// 283: astore 16
// 285: aload 14
// 287: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 28c: checkcast java/lang/Number
// 28f: invokevirtual java/lang/Number.longValue ()J
// 292: lstore 17
// 294: aload 8
// 296: ifnull 2e3
// 299: aload 8
// 29b: ifnull 2dd
// 29e: goto 2ab
// 2a1: ldc2_w 4391710759840806249
// 2a4: lload 2
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: athrow
// 2ab: invokestatic su/catlean/zf.A ()J
// 2ae: lload 17
// 2b0: lsub
// 2b1: getstatic su/catlean/dx.i J
// 2b4: lcmp
// 2b5: ifle 2dc
// 2b8: goto 2c5
// 2bb: ldc2_w 4391710759840806249
// 2be: lload 2
// 2bf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c4: athrow
// 2c5: aload 9
// 2c7: aload 16
// 2c9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 2ce: pop
// 2cf: goto 2dc
// 2d2: ldc2_w 4391710759840806249
// 2d5: lload 2
// 2d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2db: athrow
// 2dc: nop
// 2dd: aload 8
// 2df: ifnonnull 25c
// 2e2: nop
// 2e3: aload 9
// 2e5: checkcast java/lang/Iterable
// 2e8: astore 10
// 2ea: bipush 0
// 2eb: istore 11
// 2ed: aload 10
// 2ef: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2f4: astore 12
// 2f6: aload 12
// 2f8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2fd: ifeq 336
// 300: aload 12
// 302: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 307: astore 13
// 309: aload 13
// 30b: checkcast java/lang/String
// 30e: astore 14
// 310: bipush 0
// 311: istore 15
// 313: getstatic su/catlean/dx.h Ljava/util/Map;
// 316: aload 14
// 318: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
// 31d: pop
// 31e: nop
// 31f: aload 8
// 321: ifnull 337
// 324: aload 8
// 326: ifnonnull 2f6
// 329: goto 336
// 32c: ldc2_w 4391710759840806249
// 32f: lload 2
// 330: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 335: athrow
// 336: nop
// 337: return
}

public final int j(@NotNull class_1657 entity, long a) {
ax = a ^ ax;
long var4 = ax ^ 41953837699837L;
Intrinsics.checkNotNullParameter(entity, a<"x">(13374, 3236439741535259695L ^ ax));
String var10001 = entity.method_5477().getString();
Intrinsics.checkNotNullExpressionValue(var10001, a<"x">(1238, 2962491055641345218L ^ ax));
return this.B(var10001, var4);
}

public final int B(@NotNull String name, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/dx.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w 3048390474212272487
// 09: lload 2
// 0a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 1
// 10: sipush 30218
// 13: ldc2_w 4257541647584939336
// 16: lload 2
// 17: lxor
// 18: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 20: astore 4
// 22: aload 4
// 24: ifnull 55
// 27: getstatic su/catlean/dx.C Ljava/util/Map;
// 2a: aload 1
// 2b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
// 30: checkcast java/lang/Integer
// 33: dup
// 34: ifnull 54
// 37: goto 44
// 3a: ldc2_w 3141547261434814978
// 3d: lload 2
// 3e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43: athrow
// 44: invokevirtual java/lang/Integer.intValue ()I
// 47: goto 56
// 4a: ldc2_w 3141547261434814978
// 4d: lload 2
// 4e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: athrow
// 54: pop
// 55: bipush 0
// 56: ireturn
}

// $VF: Unable to simplify switch on enum
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
@Nullable
public final class_1657 t(long a, float range, @NotNull w2 targetBy, boolean ignoreNaked, boolean ignoreCreative) {
ax = a ^ ax;
long var7 = ax ^ 118123541762683L;
long var9 = ax ^ 125688957717205L;
long var11 = ax ^ 94698924422607L;

try {
Intrinsics.checkNotNullParameter(targetBy, a<"x">(13214, 334932319998919286L ^ ax));
switch (mn.a[targetBy.ordinal()]) {
case 1:
return this.E(range, ignoreNaked, ignoreCreative, var11);
case 2:
return this.f(var7, range, ignoreNaked, ignoreCreative);
case 3:
return this.H(range, var9, ignoreNaked, ignoreCreative);
default:
throw new NoWhenBranchMatchedException();
}
} catch (NoWhenBranchMatchedException var13) {
throw vm.a<"Å">(var13, 7004356215574636719L, ax);
}
}

public static class_1657 Y(char var0, dx var1, float var2, w2 var3, boolean var4, boolean var5, int var6, int var7, char var8, Object var9) {
long var10 = ((long)var0 << 48 | (long)var7 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ a;
long var12 = var10 ^ 27231792589633L;
String var14 = vm.a<"Å">(-2735904860234147551L, var10);

int var10000;
label37: {
label36: {
try {
var10000 = var6 & 4;
if (var14 == null) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NoWhenBranchMatchedException var16) {
throw vm.a<"Å">(var16, -2603336304279317948L, var10);
}

var4 = false;
}

var10000 = var6 & b<"j">(5694, 4026125818188555433L ^ var10);
}

label27: {
try {
if (var14 == null) {
break label27;
}

if (var10000 == 0) {
return var1.t(var12, var2, var3, var4, (boolean)var5);
}
} catch (NoWhenBranchMatchedException var15) {
throw vm.a<"Å">(var15, -2603336304279317948L, var10);
}

var10000 = 0;
}

var5 = var10000;
return var1.t(var12, var2, var3, var4, (boolean)var5);
}

private final List Z(int param1, byte param2, float param3, int param4, boolean param5, boolean param6) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 56
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 40
// 013: lshl
// 014: bipush 40
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/dx.a J
// 01b: lxor
// 01c: lstore 7
// 01e: lload 7
// 020: dup2
// 021: ldc2_w 70576950088908
// 024: lxor
// 025: lstore 9
// 027: dup2
// 028: ldc2_w 74112214971593
// 02b: lxor
// 02c: lstore 11
// 02e: dup2
// 02f: ldc2_w 72737219881579
// 032: lxor
// 033: lstore 13
// 035: pop2
// 036: ldc2_w -433655422762304814
// 039: lload 7
// 03b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: lload 9
// 042: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 045: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
// 048: dup
// 049: sipush 20358
// 04c: ldc2_w 3721518490312288116
// 04f: lload 7
// 051: lxor
// 052: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 05a: checkcast java/lang/Iterable
// 05d: astore 16
// 05f: astore 15
// 061: nop
// 062: bipush 0
// 063: istore 17
// 065: aload 16
// 067: astore 18
// 069: new java/util/ArrayList
// 06c: dup
// 06d: invokespecial java/util/ArrayList.<init> ()V
// 070: checkcast java/util/Collection
// 073: astore 19
// 075: bipush 0
// 076: istore 20
// 078: aload 18
// 07a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 07f: astore 21
// 081: aload 21
// 083: invokeinterface java/util/Iterator.hasNext ()Z 1
// 088: ifeq 211
// 08b: aload 21
// 08d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 092: astore 22
// 094: aload 22
// 096: checkcast net/minecraft/class_742
// 099: astore 23
// 09b: bipush 0
// 09c: istore 24
// 09e: iload 1
// 09f: ifle 225
// 0a2: aload 23
// 0a4: invokevirtual net/minecraft/class_742.method_29504 ()Z
// 0a7: aload 15
// 0a9: ifnull 223
// 0ac: aload 15
// 0ae: iload 2
// 0af: ifgt 0f3
// 0b2: ifnull 0f1
// 0b5: goto 0c3
// 0b8: ldc2_w -563984757044301385
// 0bb: lload 7
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: ifne 1fe
// 0c6: goto 0d4
// 0c9: ldc2_w -563984757044301385
// 0cc: lload 7
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: aload 23
// 0d6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0d9: aload 23
// 0db: checkcast net/minecraft/class_1657
// 0de: lload 11
// 0e0: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 0e3: goto 0f1
// 0e6: ldc2_w -563984757044301385
// 0e9: lload 7
// 0eb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: athrow
// 0f1: aload 15
// 0f3: iload 1
// 0f4: iflt 125
// 0f7: ifnull 123
// 0fa: ifne 1fe
// 0fd: goto 10b
// 100: ldc2_w -563984757044301385
// 103: lload 7
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: aload 23
// 10d: lload 13
// 10f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 112: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 115: goto 123
// 118: ldc2_w -563984757044301385
// 11b: lload 7
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: aload 15
// 125: iload 1
// 126: iflt 15c
// 129: ifnull 15a
// 12c: ifne 1fe
// 12f: goto 13d
// 132: ldc2_w -563984757044301385
// 135: lload 7
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: lload 13
// 13f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 142: aload 23
// 144: checkcast net/minecraft/class_1297
// 147: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
// 14a: fload 3
// 14b: fcmpg
// 14c: goto 15a
// 14f: ldc2_w -563984757044301385
// 152: lload 7
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: aload 15
// 15c: iload 2
// 15d: ifgt 178
// 160: ifnull 176
// 163: ifge 1fe
// 166: goto 174
// 169: ldc2_w -563984757044301385
// 16c: lload 7
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: iload 5
// 176: aload 15
// 178: ifnull 1bb
// 17b: ifeq 1b9
// 17e: goto 18c
// 181: ldc2_w -563984757044301385
// 184: lload 7
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: aload 23
// 18e: invokevirtual net/minecraft/class_742.method_6096 ()I
// 191: aload 15
// 193: iload 2
// 194: ifgt 1bd
// 197: ifnull 1bb
// 19a: goto 1a8
// 19d: ldc2_w -563984757044301385
// 1a0: lload 7
// 1a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: athrow
// 1a8: ifle 1fe
// 1ab: goto 1b9
// 1ae: ldc2_w -563984757044301385
// 1b1: lload 7
// 1b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: athrow
// 1b9: iload 6
// 1bb: aload 15
// 1bd: ifnull 1fb
// 1c0: ifeq 1fa
// 1c3: goto 1d1
// 1c6: ldc2_w -563984757044301385
// 1c9: lload 7
// 1cb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: athrow
// 1d1: aload 23
// 1d3: invokevirtual net/minecraft/class_742.method_68878 ()Z
// 1d6: aload 15
// 1d8: ifnull 1fb
// 1db: goto 1e9
// 1de: ldc2_w -563984757044301385
// 1e1: lload 7
// 1e3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: athrow
// 1e9: ifne 1fe
// 1ec: goto 1fa
// 1ef: ldc2_w -563984757044301385
// 1f2: lload 7
// 1f4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: athrow
// 1fa: bipush 1
// 1fb: goto 1ff
// 1fe: bipush 0
// 1ff: ifeq 081
// 202: aload 19
// 204: aload 22
// 206: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 20b: pop
// 20c: aload 15
// 20e: ifnonnull 081
// 211: aload 19
// 213: checkcast java/util/List
// 216: nop
// 217: checkcast java/lang/Iterable
// 21a: astore 16
// 21c: nop
// 21d: iload 4
// 21f: ifle 225
// 222: bipush 0
// 223: istore 17
// 225: aload 16
// 227: new su/catlean/n2
// 22a: dup
// 22b: invokespecial su/catlean/n2.<init> ()V
// 22e: checkcast java/util/Comparator
// 231: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 234: areturn
}

static List x(dx var0, float var1, boolean var2, boolean var3, int var4, int var5, Object var6, int var7) {
long var8 = ((long)var5 << 32 | (long)var7 << 32 >>> 32) ^ a;
long var10001 = var8 ^ 80420742844749L;
int var10 = (int)((var8 ^ 80420742844749L) >>> 32);
int var11 = (int)((var8 ^ 80420742844749L) << 32 >>> 56);
int var12 = (int)(var10001 << 40 >>> 40);
String var13 = vm.a<"Å">(-496408736275580363L, var8);

int var10000;
label37: {
label36: {
try {
var10000 = var4 & 2;
if (var13 == null) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NoWhenBranchMatchedException var15) {
throw vm.a<"Å">(var15, -519201997974163120L, var8);
}

var2 = false;
}

var10000 = var4 & 4;
}

label27: {
try {
if (var13 == null) {
break label27;
}

if (var10000 == 0) {
return var0.Z(var10, (byte)var11, var1, var12, var2, (boolean)var3);
}
} catch (NoWhenBranchMatchedException var14) {
throw vm.a<"Å">(var14, -519201997974163120L, var8);
}

var10000 = 0;
}

var3 = var10000;
return var0.Z(var10, (byte)var11, var1, var12, var2, (boolean)var3);
}

@Nullable
public final class_1657 H(float range, long a, boolean ignoreNaked, boolean ignoreCreative) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dx.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 97118634038221
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 6
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 56
// 019: lushr
// 01a: l2i
// 01b: istore 7
// 01d: dup2
// 01e: bipush 40
// 020: lshl
// 021: bipush 40
// 023: lushr
// 024: l2i
// 025: istore 8
// 027: pop2
// 028: dup2
// 029: ldc2_w 119870624016396
// 02c: lxor
// 02d: lstore 9
// 02f: pop2
// 030: aload 0
// 031: iload 6
// 033: iload 7
// 035: i2b
// 036: fload 1
// 037: iload 8
// 039: iload 4
// 03b: iload 5
// 03d: invokespecial su/catlean/dx.Z (IBFIZZ)Ljava/util/List;
// 040: checkcast java/lang/Iterable
// 043: astore 12
// 045: ldc2_w 8907125632828520629
// 048: lload 2
// 049: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: bipush 0
// 04f: istore 13
// 051: aload 12
// 053: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 058: astore 14
// 05a: astore 11
// 05c: aload 14
// 05e: aload 11
// 060: ifnull 08d
// 063: invokeinterface java/util/Iterator.hasNext ()Z 1
// 068: ifne 086
// 06b: goto 078
// 06e: ldc2_w 8812275604154102736
// 071: lload 2
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: aconst_null
// 079: goto 11e
// 07c: ldc2_w 8812275604154102736
// 07f: lload 2
// 080: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: athrow
// 086: aload 14
// 088: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 08d: astore 15
// 08f: aload 14
// 091: aload 11
// 093: ifnull 0bc
// 096: invokeinterface java/util/Iterator.hasNext ()Z 1
// 09b: ifne 0ba
// 09e: goto 0ab
// 0a1: ldc2_w 8812275604154102736
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: aload 15
// 0ad: goto 11e
// 0b0: ldc2_w 8812275604154102736
// 0b3: lload 2
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: aload 15
// 0bc: checkcast net/minecraft/class_1657
// 0bf: astore 16
// 0c1: bipush 0
// 0c2: istore 17
// 0c4: lload 9
// 0c6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c9: aload 16
// 0cb: checkcast net/minecraft/class_1297
// 0ce: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
// 0d1: fstore 16
// 0d3: aload 14
// 0d5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0da: astore 17
// 0dc: aload 17
// 0de: checkcast net/minecraft/class_1657
// 0e1: astore 18
// 0e3: bipush 0
// 0e4: istore 19
// 0e6: lload 9
// 0e8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0eb: aload 18
// 0ed: checkcast net/minecraft/class_1297
// 0f0: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
// 0f3: fstore 18
// 0f5: fload 16
// 0f7: fload 18
// 0f9: invokestatic java/lang/Float.compare (FF)I
// 0fc: ifle 107
// 0ff: aload 17
// 101: astore 15
// 103: fload 18
// 105: fstore 16
// 107: aload 14
// 109: invokeinterface java/util/Iterator.hasNext ()Z 1
// 10e: ifne 0d3
// 111: aload 11
// 113: lload 2
// 114: lconst_0
// 115: lcmp
// 116: iflt 101
// 119: ifnull 103
// 11c: aload 15
// 11e: checkcast net/minecraft/class_1657
// 121: areturn
}

public static class_1657 n(dx var0, float var1, boolean var2, boolean var3, int var4, Object var5, int var6, byte var7, int var8) {
long var9 = ((long)var6 << 32 | (long)var7 << 56 >>> 32 | (long)var8 << 40 >>> 40) ^ a;
long var11 = var9 ^ 23924931567497L;
String var13 = vm.a<"Å">(3872837459930150550L, var9);

int var10000;
label37: {
label36: {
try {
var10000 = var4 & 2;
if (var13 == null) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NoWhenBranchMatchedException var15) {
throw vm.a<"Å">(var15, 3776302699985862131L, var9);
}

var2 = false;
}

var10000 = var4 & 4;
}

label27: {
try {
if (var13 == null) {
break label27;
}

if (var10000 == 0) {
return var0.H(var1, var11, var2, (boolean)var3);
}
} catch (NoWhenBranchMatchedException var14) {
throw vm.a<"Å">(var14, 3776302699985862131L, var9);
}

var10000 = 0;
}

var3 = var10000;
return var0.H(var1, var11, var2, (boolean)var3);
}

@Nullable
public final class_1657 f(long a, float range, boolean ignoreNaked, boolean ignoreCreative) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dx.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 71926940470115
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 6
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 56
// 019: lushr
// 01a: l2i
// 01b: istore 7
// 01d: dup2
// 01e: bipush 40
// 020: lshl
// 021: bipush 40
// 023: lushr
// 024: l2i
// 025: istore 8
// 027: pop2
// 028: pop2
// 029: ldc2_w 2536211228541804571
// 02c: lload 1
// 02d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: aload 0
// 033: iload 6
// 035: iload 7
// 037: i2b
// 038: fload 3
// 039: iload 8
// 03b: iload 4
// 03d: iload 5
// 03f: invokespecial su/catlean/dx.Z (IBFIZZ)Ljava/util/List;
// 042: checkcast java/lang/Iterable
// 045: astore 10
// 047: astore 9
// 049: bipush 0
// 04a: istore 11
// 04c: aload 10
// 04e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 053: astore 12
// 055: aload 12
// 057: aload 9
// 059: ifnull 086
// 05c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 061: ifne 07f
// 064: goto 071
// 067: ldc2_w 2514526768562465662
// 06a: lload 1
// 06b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: athrow
// 071: aconst_null
// 072: goto 113
// 075: ldc2_w 2514526768562465662
// 078: lload 1
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: aload 12
// 081: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 086: astore 13
// 088: aload 12
// 08a: aload 9
// 08c: ifnull 0b5
// 08f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 094: ifne 0b3
// 097: goto 0a4
// 09a: ldc2_w 2514526768562465662
// 09d: lload 1
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: aload 13
// 0a6: goto 113
// 0a9: ldc2_w 2514526768562465662
// 0ac: lload 1
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: aload 13
// 0b5: checkcast net/minecraft/class_1657
// 0b8: astore 14
// 0ba: bipush 0
// 0bb: istore 15
// 0bd: aload 14
// 0bf: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 0c2: aload 14
// 0c4: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 0c7: fadd
// 0c8: fstore 14
// 0ca: aload 12
// 0cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0d1: astore 15
// 0d3: aload 15
// 0d5: checkcast net/minecraft/class_1657
// 0d8: astore 16
// 0da: bipush 0
// 0db: istore 17
// 0dd: aload 16
// 0df: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 0e2: aload 16
// 0e4: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 0e7: fadd
// 0e8: fstore 16
// 0ea: fload 14
// 0ec: fload 16
// 0ee: invokestatic java/lang/Float.compare (FF)I
// 0f1: ifle 0fc
// 0f4: aload 15
// 0f6: astore 13
// 0f8: fload 16
// 0fa: fstore 14
// 0fc: aload 12
// 0fe: invokeinterface java/util/Iterator.hasNext ()Z 1
// 103: ifne 0ca
// 106: aload 9
// 108: lload 1
// 109: lconst_0
// 10a: lcmp
// 10b: iflt 0f6
// 10e: ifnull 0f8
// 111: aload 13
// 113: checkcast net/minecraft/class_1657
// 116: areturn
}

public static class_1657 C(dx var0, long var1, float var3, boolean var4, boolean var5, int var6, Object var7) {
var1 = a ^ var1;
long var8 = var1 ^ 21054407635803L;
String var10 = vm.a<"Å">(-9096414744430722326L, var1);

int var10000;
label37: {
label36: {
try {
var10000 = var6 & 2;
if (var10 == null) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NoWhenBranchMatchedException var12) {
throw vm.a<"Å">(var12, -9217741889478604401L, var1);
}

var4 = false;
}

var10000 = var6 & 4;
}

label27: {
try {
if (var10 == null) {
break label27;
}

if (var10000 == 0) {
return var0.f(var8, var3, var4, (boolean)var5);
}
} catch (NoWhenBranchMatchedException var11) {
throw vm.a<"Å">(var11, -9217741889478604401L, var1);
}

var10000 = 0;
}

var5 = var10000;
return var0.f(var8, var3, var4, (boolean)var5);
}

@Nullable
public final class_1657 E(float range, boolean ignoreNaked, boolean ignoreCreative, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dx.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 136497345047767
// 00e: lxor
// 00f: dup2
// 010: bipush 32
// 012: lushr
// 013: l2i
// 014: istore 6
// 016: dup2
// 017: bipush 32
// 019: lshl
// 01a: bipush 56
// 01c: lushr
// 01d: l2i
// 01e: istore 7
// 020: dup2
// 021: bipush 40
// 023: lshl
// 024: bipush 40
// 026: lushr
// 027: l2i
// 028: istore 8
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 40573273326935
// 02f: lxor
// 030: lstore 9
// 032: pop2
// 033: aload 0
// 034: iload 6
// 036: iload 7
// 038: i2b
// 039: fload 1
// 03a: iload 8
// 03c: iload 2
// 03d: iload 3
// 03e: invokespecial su/catlean/dx.Z (IBFIZZ)Ljava/util/List;
// 041: checkcast java/lang/Iterable
// 044: astore 12
// 046: ldc2_w 326040256395102127
// 049: lload 4
// 04b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: bipush 0
// 051: istore 13
// 053: astore 11
// 055: aload 12
// 057: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 05c: astore 14
// 05e: aload 14
// 060: aload 11
// 062: ifnull 091
// 065: invokeinterface java/util/Iterator.hasNext ()Z 1
// 06a: ifne 08a
// 06d: goto 07b
// 070: ldc2_w 383185884123450570
// 073: lload 4
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: aconst_null
// 07c: goto 125
// 07f: ldc2_w 383185884123450570
// 082: lload 4
// 084: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: athrow
// 08a: aload 14
// 08c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 091: astore 15
// 093: aload 14
// 095: aload 11
// 097: ifnull 0c2
// 09a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 09f: ifne 0c0
// 0a2: goto 0b0
// 0a5: ldc2_w 383185884123450570
// 0a8: lload 4
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: aload 15
// 0b2: goto 125
// 0b5: ldc2_w 383185884123450570
// 0b8: lload 4
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: aload 15
// 0c2: checkcast net/minecraft/class_1657
// 0c5: astore 16
// 0c7: bipush 0
// 0c8: istore 17
// 0ca: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 0cd: lload 9
// 0cf: aload 16
// 0d1: checkcast net/minecraft/class_1309
// 0d4: invokespecial su/catlean/dx.a (JLnet/minecraft/class_1309;)F
// 0d7: fstore 16
// 0d9: aload 14
// 0db: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0e0: astore 17
// 0e2: aload 17
// 0e4: checkcast net/minecraft/class_1657
// 0e7: astore 18
// 0e9: bipush 0
// 0ea: istore 19
// 0ec: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 0ef: lload 9
// 0f1: aload 18
// 0f3: checkcast net/minecraft/class_1309
// 0f6: invokespecial su/catlean/dx.a (JLnet/minecraft/class_1309;)F
// 0f9: fstore 18
// 0fb: fload 16
// 0fd: fload 18
// 0ff: invokestatic java/lang/Float.compare (FF)I
// 102: ifle 10d
// 105: aload 17
// 107: astore 15
// 109: fload 18
// 10b: fstore 16
// 10d: aload 14
// 10f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 114: ifne 0d9
// 117: aload 11
// 119: lload 4
// 11b: lconst_0
// 11c: lcmp
// 11d: ifle 107
// 120: ifnull 109
// 123: aload 15
// 125: checkcast net/minecraft/class_1657
// 128: areturn
}

public static class_1657 X(dx var0, long var1, float var3, boolean var4, boolean var5, int var6, Object var7) {
var1 = a ^ var1;
long var8 = var1 ^ 114481053717526L;
String var10 = vm.a<"Å">(88467301398823443L, var1);

int var10000;
label37: {
label36: {
try {
var10000 = var6 & 2;
if (var10 == null) {
break label37;
}

if (var10000 == 0) {
break label36;
}
} catch (NoWhenBranchMatchedException var12) {
throw vm.a<"Å">(var12, 66787499261446518L, var1);
}

var4 = false;
}

var10000 = var6 & 4;
}

label27: {
try {
if (var10 == null) {
break label27;
}

if (var10000 == 0) {
return var0.E(var3, var4, (boolean)var5, var8);
}
} catch (NoWhenBranchMatchedException var11) {
throw vm.a<"Å">(var11, 66787499261446518L, var1);
}

var10000 = 0;
}

var5 = var10000;
return var0.E(var3, var4, (boolean)var5, var8);
}

@Nullable
public final class_1657 I(float range, int a, int a, short a, float fov) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
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
// 018: getstatic su/catlean/dx.a J
// 01b: lxor
// 01c: lstore 6
// 01e: lload 6
// 020: dup2
// 021: ldc2_w 102978271319188
// 024: lxor
// 025: dup2
// 026: bipush 32
// 028: lushr
// 029: l2i
// 02a: istore 8
// 02c: dup2
// 02d: bipush 32
// 02f: lshl
// 030: bipush 32
// 032: lushr
// 033: l2i
// 034: istore 9
// 036: pop2
// 037: dup2
// 038: ldc2_w 65114635042291
// 03b: lxor
// 03c: lstore 10
// 03e: pop2
// 03f: aload 0
// 040: fload 1
// 041: bipush 0
// 042: bipush 0
// 043: sipush 5752
// 046: ldc2_w 7892588533288698566
// 049: lload 6
// 04b: lxor
// 04c: invokedynamic j (IJ)I bsm=su/catlean/dx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: iload 8
// 053: aconst_null
// 054: iload 9
// 056: invokestatic su/catlean/dx.x (Lsu/catlean/dx;FZZIILjava/lang/Object;I)Ljava/util/List;
// 059: checkcast java/lang/Iterable
// 05c: astore 13
// 05e: nop
// 05f: ldc2_w -4890262421067530485
// 062: lload 6
// 064: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: bipush 0
// 06a: istore 14
// 06c: aload 13
// 06e: astore 15
// 070: new java/util/ArrayList
// 073: dup
// 074: invokespecial java/util/ArrayList.<init> ()V
// 077: checkcast java/util/Collection
// 07a: astore 16
// 07c: astore 12
// 07e: bipush 0
// 07f: istore 17
// 081: aload 15
// 083: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 088: astore 18
// 08a: aload 18
// 08c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 091: ifeq 0fb
// 094: aload 18
// 096: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 09b: astore 19
// 09d: aload 19
// 09f: checkcast net/minecraft/class_1657
// 0a2: astore 20
// 0a4: bipush 0
// 0a5: istore 21
// 0a7: iload 2
// 0a8: iflt 10f
// 0ab: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 0ae: lload 10
// 0b0: aload 20
// 0b2: checkcast net/minecraft/class_1309
// 0b5: invokespecial su/catlean/dx.a (JLnet/minecraft/class_1309;)F
// 0b8: fload 5
// 0ba: fcmpg
// 0bb: aload 12
// 0bd: ifnull 10d
// 0c0: aload 12
// 0c2: ifnull 0e5
// 0c5: goto 0d3
// 0c8: ldc2_w -4758820095677631378
// 0cb: lload 6
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: ifge 0e8
// 0d6: goto 0e4
// 0d9: ldc2_w -4758820095677631378
// 0dc: lload 6
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: bipush 1
// 0e5: goto 0e9
// 0e8: bipush 0
// 0e9: ifeq 08a
// 0ec: aload 16
// 0ee: aload 19
// 0f0: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0f5: pop
// 0f6: aload 12
// 0f8: ifnonnull 08a
// 0fb: aload 16
// 0fd: checkcast java/util/List
// 100: nop
// 101: checkcast java/lang/Iterable
// 104: astore 13
// 106: nop
// 107: iload 4
// 109: ifge 10f
// 10c: bipush 0
// 10d: istore 14
// 10f: aload 13
// 111: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 116: astore 15
// 118: aload 15
// 11a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 11f: iload 2
// 120: iflt 16b
// 123: aload 12
// 125: ifnull 16b
// 128: ifne 148
// 12b: goto 139
// 12e: ldc2_w -4758820095677631378
// 131: lload 6
// 133: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: athrow
// 139: aconst_null
// 13a: goto 1e0
// 13d: ldc2_w -4758820095677631378
// 140: lload 6
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: aload 15
// 14a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 14f: astore 16
// 151: aload 15
// 153: aload 12
// 155: ifnull 180
// 158: invokeinterface java/util/Iterator.hasNext ()Z 1
// 15d: goto 16b
// 160: ldc2_w -4758820095677631378
// 163: lload 6
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: ifne 17e
// 16e: aload 16
// 170: goto 1e0
// 173: ldc2_w -4758820095677631378
// 176: lload 6
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: aload 16
// 180: checkcast net/minecraft/class_1657
// 183: astore 17
// 185: bipush 0
// 186: istore 18
// 188: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 18b: lload 10
// 18d: aload 17
// 18f: checkcast net/minecraft/class_1309
// 192: invokespecial su/catlean/dx.a (JLnet/minecraft/class_1309;)F
// 195: fstore 17
// 197: aload 15
// 199: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 19e: astore 18
// 1a0: aload 18
// 1a2: checkcast net/minecraft/class_1657
// 1a5: astore 19
// 1a7: bipush 0
// 1a8: istore 20
// 1aa: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 1ad: lload 10
// 1af: aload 19
// 1b1: checkcast net/minecraft/class_1309
// 1b4: invokespecial su/catlean/dx.a (JLnet/minecraft/class_1309;)F
// 1b7: fstore 19
// 1b9: fload 17
// 1bb: fload 19
// 1bd: invokestatic java/lang/Float.compare (FF)I
// 1c0: ifle 1cb
// 1c3: aload 18
// 1c5: astore 16
// 1c7: fload 19
// 1c9: fstore 17
// 1cb: aload 15
// 1cd: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1d2: ifne 197
// 1d5: aload 12
// 1d7: iload 2
// 1d8: iflt 1c5
// 1db: ifnull 1c7
// 1de: aload 16
// 1e0: checkcast net/minecraft/class_1657
// 1e3: areturn
}

// $VF: Unable to simplify switch on enum
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
@Nullable
public final class_1657 d(float range, long a, @NotNull w2 targetBy, @NotNull Function1 predicate) {
ax = a ^ ax;
long var6 = ax ^ 61685571430490L;
long var8 = ax ^ 78170805332782L;
long var10 = ax ^ 18432506553023L;

try {
Intrinsics.checkNotNullParameter(targetBy, a<"x">(25519, 3861130654704095189L ^ ax));
Intrinsics.checkNotNullParameter(predicate, a<"x">(1122, 1756200124019517465L ^ ax));
switch (mn.a[targetBy.ordinal()]) {
case 1:
return this.r(range, var10, predicate);
case 2:
return this.E(range, var6, predicate);
case 3:
return this.h(range, var8, predicate);
default:
throw new NoWhenBranchMatchedException();
}
} catch (NoWhenBranchMatchedException var12) {
throw vm.a<"Å">(var12, -4854267493986077383L, ax);
}
}

@Nullable
public final class_1657 h(float range, long a, @NotNull Function1 predicate) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dx.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 7691334135623
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 6
// 01d: pop2
// 01e: dup2
// 01f: ldc2_w 15383949300833
// 022: lxor
// 023: lstore 7
// 025: pop2
// 026: aload 4
// 028: sipush 7247
// 02b: ldc2_w 2090220744603536061
// 02e: lload 2
// 02f: lxor
// 030: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 035: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 038: aload 0
// 039: fload 1
// 03a: bipush 0
// 03b: bipush 0
// 03c: sipush 4118
// 03f: ldc2_w 5489780597599092602
// 042: lload 2
// 043: lxor
// 044: invokedynamic j (IJ)I bsm=su/catlean/dx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 049: iload 5
// 04b: aconst_null
// 04c: iload 6
// 04e: invokestatic su/catlean/dx.x (Lsu/catlean/dx;FZZIILjava/lang/Object;I)Ljava/util/List;
// 051: checkcast java/lang/Iterable
// 054: astore 10
// 056: nop
// 057: bipush 0
// 058: istore 11
// 05a: ldc2_w -8651107663462611752
// 05d: lload 2
// 05e: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: aload 10
// 065: astore 12
// 067: new java/util/ArrayList
// 06a: dup
// 06b: invokespecial java/util/ArrayList.<init> ()V
// 06e: checkcast java/util/Collection
// 071: astore 13
// 073: bipush 0
// 074: istore 14
// 076: aload 12
// 078: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 07d: astore 15
// 07f: astore 9
// 081: aload 15
// 083: invokeinterface java/util/Iterator.hasNext ()Z 1
// 088: ifeq 0df
// 08b: aload 15
// 08d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 092: astore 16
// 094: lload 2
// 095: lconst_0
// 096: lcmp
// 097: iflt 0f4
// 09a: aload 4
// 09c: aload 16
// 09e: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 0a3: checkcast java/lang/Boolean
// 0a6: invokevirtual java/lang/Boolean.booleanValue ()Z
// 0a9: aload 9
// 0ab: ifnull 0f2
// 0ae: aload 9
// 0b0: ifnull 0d9
// 0b3: goto 0c0
// 0b6: ldc2_w -8780298534733623363
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: ifeq 081
// 0c3: goto 0d0
// 0c6: ldc2_w -8780298534733623363
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: aload 13
// 0d2: aload 16
// 0d4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0d9: pop
// 0da: aload 9
// 0dc: ifnonnull 081
// 0df: aload 13
// 0e1: checkcast java/util/List
// 0e4: nop
// 0e5: checkcast java/lang/Iterable
// 0e8: astore 10
// 0ea: nop
// 0eb: lload 2
// 0ec: lconst_0
// 0ed: lcmp
// 0ee: ifle 0f4
// 0f1: bipush 0
// 0f2: istore 11
// 0f4: aload 10
// 0f6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0fb: astore 12
// 0fd: aload 12
// 0ff: invokeinterface java/util/Iterator.hasNext ()Z 1
// 104: lload 2
// 105: lconst_0
// 106: lcmp
// 107: iflt 14f
// 10a: aload 9
// 10c: ifnull 14f
// 10f: ifne 12d
// 112: goto 11f
// 115: ldc2_w -8780298534733623363
// 118: lload 2
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: aconst_null
// 120: goto 1c5
// 123: ldc2_w -8780298534733623363
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: aload 12
// 12f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 134: astore 13
// 136: aload 12
// 138: aload 9
// 13a: ifnull 163
// 13d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 142: goto 14f
// 145: ldc2_w -8780298534733623363
// 148: lload 2
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: ifne 161
// 152: aload 13
// 154: goto 1c5
// 157: ldc2_w -8780298534733623363
// 15a: lload 2
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: aload 13
// 163: checkcast net/minecraft/class_1657
// 166: astore 14
// 168: bipush 0
// 169: istore 15
// 16b: lload 7
// 16d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 170: aload 14
// 172: checkcast net/minecraft/class_1297
// 175: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
// 178: fstore 14
// 17a: aload 12
// 17c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 181: astore 15
// 183: aload 15
// 185: checkcast net/minecraft/class_1657
// 188: astore 16
// 18a: bipush 0
// 18b: istore 17
// 18d: lload 7
// 18f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 192: aload 16
// 194: checkcast net/minecraft/class_1297
// 197: invokevirtual net/minecraft/class_746.method_5739 (Lnet/minecraft/class_1297;)F
// 19a: fstore 16
// 19c: fload 14
// 19e: fload 16
// 1a0: invokestatic java/lang/Float.compare (FF)I
// 1a3: ifle 1ae
// 1a6: aload 15
// 1a8: astore 13
// 1aa: fload 16
// 1ac: fstore 14
// 1ae: aload 12
// 1b0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1b5: ifne 17a
// 1b8: aload 9
// 1ba: lload 2
// 1bb: lconst_0
// 1bc: lcmp
// 1bd: ifle 1a8
// 1c0: ifnull 1aa
// 1c3: aload 13
// 1c5: checkcast net/minecraft/class_1657
// 1c8: areturn
}

@Nullable
public final class_1657 E(float range, long a, @NotNull Function1 predicate) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dx.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 134123284524083
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 6
// 01d: pop2
// 01e: pop2
// 01f: aload 4
// 021: sipush 1122
// 024: ldc2_w 1756133210536006121
// 027: lload 2
// 028: lxor
// 029: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 031: aload 0
// 032: fload 1
// 033: bipush 0
// 034: bipush 0
// 035: sipush 5752
// 038: ldc2_w 7892627754461198945
// 03b: lload 2
// 03c: lxor
// 03d: invokedynamic j (IJ)I bsm=su/catlean/dx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 042: iload 5
// 044: aconst_null
// 045: iload 6
// 047: invokestatic su/catlean/dx.x (Lsu/catlean/dx;FZZIILjava/lang/Object;I)Ljava/util/List;
// 04a: checkcast java/lang/Iterable
// 04d: astore 8
// 04f: ldc2_w 4937467365054023596
// 052: lload 2
// 053: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 058: nop
// 059: bipush 0
// 05a: istore 9
// 05c: astore 7
// 05e: aload 8
// 060: astore 10
// 062: new java/util/ArrayList
// 065: dup
// 066: invokespecial java/util/ArrayList.<init> ()V
// 069: checkcast java/util/Collection
// 06c: astore 11
// 06e: bipush 0
// 06f: istore 12
// 071: aload 10
// 073: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 078: astore 13
// 07a: aload 13
// 07c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 081: ifeq 0d8
// 084: aload 13
// 086: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 08b: astore 14
// 08d: lload 2
// 08e: lconst_0
// 08f: lcmp
// 090: ifle 0ed
// 093: aload 4
// 095: aload 14
// 097: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 09c: checkcast java/lang/Boolean
// 09f: invokevirtual java/lang/Boolean.booleanValue ()Z
// 0a2: aload 7
// 0a4: ifnull 0eb
// 0a7: aload 7
// 0a9: ifnull 0d2
// 0ac: goto 0b9
// 0af: ldc2_w 4995162699229170889
// 0b2: lload 2
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: ifeq 07a
// 0bc: goto 0c9
// 0bf: ldc2_w 4995162699229170889
// 0c2: lload 2
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: aload 11
// 0cb: aload 14
// 0cd: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0d2: pop
// 0d3: aload 7
// 0d5: ifnonnull 07a
// 0d8: aload 11
// 0da: checkcast java/util/List
// 0dd: nop
// 0de: checkcast java/lang/Iterable
// 0e1: astore 8
// 0e3: nop
// 0e4: lload 2
// 0e5: lconst_0
// 0e6: lcmp
// 0e7: ifle 0ed
// 0ea: bipush 0
// 0eb: istore 9
// 0ed: aload 8
// 0ef: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0f4: astore 10
// 0f6: aload 10
// 0f8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0fd: lload 2
// 0fe: lconst_0
// 0ff: lcmp
// 100: ifle 148
// 103: aload 7
// 105: ifnull 148
// 108: ifne 126
// 10b: goto 118
// 10e: ldc2_w 4995162699229170889
// 111: lload 2
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: aconst_null
// 119: goto 1ba
// 11c: ldc2_w 4995162699229170889
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: aload 10
// 128: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 12d: astore 11
// 12f: aload 10
// 131: aload 7
// 133: ifnull 15c
// 136: invokeinterface java/util/Iterator.hasNext ()Z 1
// 13b: goto 148
// 13e: ldc2_w 4995162699229170889
// 141: lload 2
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: ifne 15a
// 14b: aload 11
// 14d: goto 1ba
// 150: ldc2_w 4995162699229170889
// 153: lload 2
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: aload 11
// 15c: checkcast net/minecraft/class_1657
// 15f: astore 12
// 161: bipush 0
// 162: istore 13
// 164: aload 12
// 166: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 169: aload 12
// 16b: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 16e: fadd
// 16f: fstore 12
// 171: aload 10
// 173: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 178: astore 13
// 17a: aload 13
// 17c: checkcast net/minecraft/class_1657
// 17f: astore 14
// 181: bipush 0
// 182: istore 15
// 184: aload 14
// 186: invokevirtual net/minecraft/class_1657.method_6032 ()F
// 189: aload 14
// 18b: invokevirtual net/minecraft/class_1657.method_6067 ()F
// 18e: fadd
// 18f: fstore 14
// 191: fload 12
// 193: fload 14
// 195: invokestatic java/lang/Float.compare (FF)I
// 198: ifle 1a3
// 19b: aload 13
// 19d: astore 11
// 19f: fload 14
// 1a1: fstore 12
// 1a3: aload 10
// 1a5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1aa: ifne 171
// 1ad: aload 7
// 1af: lload 2
// 1b0: lconst_0
// 1b1: lcmp
// 1b2: iflt 19d
// 1b5: ifnull 19f
// 1b8: aload 11
// 1ba: checkcast net/minecraft/class_1657
// 1bd: areturn
}

@Nullable
public final class_1657 r(float range, long a, @NotNull Function1 predicate) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dx.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 89223368091350
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 6
// 01d: pop2
// 01e: dup2
// 01f: ldc2_w 61251582545841
// 022: lxor
// 023: lstore 7
// 025: pop2
// 026: ldc2_w -8187472992302609079
// 029: lload 2
// 02a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: aload 4
// 031: sipush 1122
// 034: ldc2_w 1756158664350112524
// 037: lload 2
// 038: lxor
// 039: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/dx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 041: astore 9
// 043: aload 0
// 044: fload 1
// 045: bipush 0
// 046: bipush 0
// 047: sipush 5752
// 04a: ldc2_w 7892584708882542724
// 04d: lload 2
// 04e: lxor
// 04f: invokedynamic j (IJ)I bsm=su/catlean/dx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: iload 5
// 056: aconst_null
// 057: iload 6
// 059: invokestatic su/catlean/dx.x (Lsu/catlean/dx;FZZIILjava/lang/Object;I)Ljava/util/List;
// 05c: checkcast java/lang/Iterable
// 05f: astore 10
// 061: nop
// 062: bipush 0
// 063: istore 11
// 065: aload 10
// 067: astore 12
// 069: new java/util/ArrayList
// 06c: dup
// 06d: invokespecial java/util/ArrayList.<init> ()V
// 070: checkcast java/util/Collection
// 073: astore 13
// 075: bipush 0
// 076: istore 14
// 078: aload 12
// 07a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 07f: astore 15
// 081: aload 15
// 083: invokeinterface java/util/Iterator.hasNext ()Z 1
// 088: ifeq 0df
// 08b: aload 15
// 08d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 092: astore 16
// 094: lload 2
// 095: lconst_0
// 096: lcmp
// 097: ifle 0f4
// 09a: aload 4
// 09c: aload 16
// 09e: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 0a3: checkcast java/lang/Boolean
// 0a6: invokevirtual java/lang/Boolean.booleanValue ()Z
// 0a9: aload 9
// 0ab: ifnull 0f2
// 0ae: aload 9
// 0b0: ifnull 0d9
// 0b3: goto 0c0
// 0b6: ldc2_w -8090915898820016596
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: ifeq 081
// 0c3: goto 0d0
// 0c6: ldc2_w -8090915898820016596
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: aload 13
// 0d2: aload 16
// 0d4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 0d9: pop
// 0da: aload 9
// 0dc: ifnonnull 081
// 0df: aload 13
// 0e1: checkcast java/util/List
// 0e4: nop
// 0e5: checkcast java/lang/Iterable
// 0e8: astore 10
// 0ea: nop
// 0eb: lload 2
// 0ec: lconst_0
// 0ed: lcmp
// 0ee: ifle 0f4
// 0f1: bipush 0
// 0f2: istore 11
// 0f4: aload 10
// 0f6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0fb: astore 12
// 0fd: aload 12
// 0ff: invokeinterface java/util/Iterator.hasNext ()Z 1
// 104: lload 2
// 105: lconst_0
// 106: lcmp
// 107: iflt 14f
// 10a: aload 9
// 10c: ifnull 14f
// 10f: ifne 12d
// 112: goto 11f
// 115: ldc2_w -8090915898820016596
// 118: lload 2
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: aconst_null
// 120: goto 1c5
// 123: ldc2_w -8090915898820016596
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: aload 12
// 12f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 134: astore 13
// 136: aload 12
// 138: aload 9
// 13a: ifnull 163
// 13d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 142: goto 14f
// 145: ldc2_w -8090915898820016596
// 148: lload 2
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: ifne 161
// 152: aload 13
// 154: goto 1c5
// 157: ldc2_w -8090915898820016596
// 15a: lload 2
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: aload 13
// 163: checkcast net/minecraft/class_1657
// 166: astore 14
// 168: bipush 0
// 169: istore 15
// 16b: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 16e: lload 7
// 170: aload 14
// 172: checkcast net/minecraft/class_1309
// 175: invokespecial su/catlean/dx.a (JLnet/minecraft/class_1309;)F
// 178: fstore 14
// 17a: aload 12
// 17c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 181: astore 15
// 183: aload 15
// 185: checkcast net/minecraft/class_1657
// 188: astore 16
// 18a: bipush 0
// 18b: istore 17
// 18d: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 190: lload 7
// 192: aload 16
// 194: checkcast net/minecraft/class_1309
// 197: invokespecial su/catlean/dx.a (JLnet/minecraft/class_1309;)F
// 19a: fstore 16
// 19c: fload 14
// 19e: fload 16
// 1a0: invokestatic java/lang/Float.compare (FF)I
// 1a3: ifle 1ae
// 1a6: aload 15
// 1a8: astore 13
// 1aa: fload 16
// 1ac: fstore 14
// 1ae: aload 12
// 1b0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1b5: ifne 17a
// 1b8: aload 9
// 1ba: lload 2
// 1bb: lconst_0
// 1bc: lcmp
// 1bd: iflt 1a8
// 1c0: ifnull 1aa
// 1c3: aload 13
// 1c5: checkcast net/minecraft/class_1657
// 1c8: areturn
}

private final float a(long var1, class_1309 var3) {
var1 = a ^ var1;
long var4 = var1 ^ 29570924266475L;
return Math.abs(
(float)class_3532.method_15338(
Math.toDegrees(Math.atan2(var3.method_23321() - zf.v(var4).method_23321(), var3.method_23317() - zf.v(var4).method_23317())) - 90.0
)
- class_3532.method_15393(zf.v(var4).method_36454())
);
}

static {
long var25 = a ^ 50533257735223L;
vm.a<"Å">(true, 4340303253061390988L, var25);
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[10];
int var21 = 0;
String var20 = "G\u0086qqþê¬\u0088\u0096ä7ñ\u001f´\u0080.ÿè\u0007p+\u0007åToB\u000b\u009c¡\u009cCï Z\u009cî»ç\u0085)\u001b[ºFb\u0080_\u0000\u0091\u001e'q¿\u0084\u0004S\u008fK*Þ[\u001bKC²\u0018D\u0098d¼¥9\tÿ¥ï69ìþ{2BÒ\u0091\u000fF\f\u009e\u0082\u0010Á¨nß\u0010¸\b\u0002ÿDrIµò7M êß÷Z\u0080<]\u0094\u0092\u001aÌ\u0010pua=\u0099Æ¤<\u0080\f\u001a\u008b×òµmQw|M\u0018 o\u0013\u0018\n§\u0080Û%\u009e³Í7\u009e7!ðÏ4²Ò¿_\u0003 U!¥o®¯\u00988H7\u0088\u0093\u0086t\u001b\tÈ\u0010S\r\u008aøEË/\u0016ð\u0084q!n\u0090\u0010õÎWÛ\u0080|ç¡\u001bË÷±\u0006Ú\u0019\r";
int var22 = "G\u0086qqþê¬\u0088\u0096ä7ñ\u001f´\u0080.ÿè\u0007p+\u0007åToB\u000b\u009c¡\u009cCï Z\u009cî»ç\u0085)\u001b[ºFb\u0080_\u0000\u0091\u001e'q¿\u0084\u0004S\u008fK*Þ[\u001bKC²\u0018D\u0098d¼¥9\tÿ¥ï69ìþ{2BÒ\u0091\u000fF\f\u009e\u0082\u0010Á¨nß\u0010¸\b\u0002ÿDrIµò7M êß÷Z\u0080<]\u0094\u0092\u001aÌ\u0010pua=\u0099Æ¤<\u0080\f\u001a\u008b×òµmQw|M\u0018 o\u0013\u0018\n§\u0080Û%\u009e³Í7\u009e7!ðÏ4²Ò¿_\u0003 U!¥o®¯\u00988H7\u0088\u0093\u0086t\u001b\tÈ\u0010S\r\u008aøEË/\u0016ð\u0084q!n\u0090\u0010õÎWÛ\u0080|ç¡\u001bË÷±\u0006Ú\u0019\r"
.length();
char var19 = ' ';
int var29 = -1;

label64:
while (true) {
String var30 = var20.substring(++var29, var29 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = a(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var43;
if ((var29 += var19) >= var22) {
b = var23;
c = new String[10];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[4];
int var8 = 0;
String var9 = "¿9m®Î&#\u0094\"\u0018#\u0081g8ZÀ";
int var10 = "¿9m®Î&#\u0094\"\u0018#\u0081g8ZÀ".length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var33 = var11;
var10001 = var8++;
long var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var52 = -1;

while (true) {
long var13 = var47;
byte[] var15 = var5.doFinal(
new byte[]{
(byte)(var13 >>> 56),
(byte)(var13 >>> 48),
(byte)(var13 >>> 40),
(byte)(var13 >>> 32),
(byte)(var13 >>> 24),
(byte)(var13 >>> 16),
(byte)(var13 >>> 8),
(byte)var13
}
);
long var55 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var52) {
case 0:
var33[var10001] = var55;
if (var7 >= var10) {
e = var11;
f = new Integer[4];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 8024962991458612173L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var50 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var41 = -1;
i = var50;
K = new dx();
C = new LinkedHashMap();
h = new LinkedHashMap();
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "Ø×È\u0017ÎÍt\u0007º\u0011\u0015÷\u0090@©&";
var10 = "Ø×È\u0017ÎÍt\u0007º\u0011\u0015÷\u0090@©&".length();
var7 = 0;
}

byte var40 = var7;
var7 += 8;
var12 = var9.substring(var40, var7).getBytes("ISO-8859-1");
var33 = var11;
var10001 = var8++;
var47 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var52 = 0;
}
}
}

var19 = var20.charAt(var29);
break;
default:
var23[var21++] = var43;
if ((var29 += var19) < var22) {
var19 = var20.charAt(var29);
continue label64;
}

var20 = "\u009f\u0001u\u0086îd\u0087¯§w\u0018\u0011Þ Ä0\u0011\rGðó[\u0005D÷3\u0091xÓÓ<H ¤\u008fk¯\u009f·¿\u0083 è\u0097*\u009cáÞþ¥\u0004Þ\u0087±_ýwDÙAq\u001dz/\u001b";
var22 = "\u009f\u0001u\u0086îd\u0087¯§w\u0018\u0011Þ Ä0\u0011\rGðó[\u0005D÷3\u0091xÓÓ<H ¤\u008fk¯\u009f·¿\u0083 è\u0097*\u009cáÞþ¥\u0004Þ\u0087±_ýwDÙAq\u001dz/\u001b"
.length();
var19 = ' ';
var29 = -1;
}

var30 = var20.substring(++var29, var29 + var19);
var10001 = 0;
}
}
}

public static void H(boolean var0) {
T = var0;
}

public static boolean d() {
return T;
}

public static boolean R() {
boolean var0 = d();

try {
return !var0;
} catch (NoWhenBranchMatchedException var1) {
throw a(var1);
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4596;
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
throw new RuntimeException("su/catlean/dx", var10);
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
throw new RuntimeException("su/catlean/dx" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 10336;
if (f[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])g.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/dx", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
}

private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
throw new RuntimeException("su/catlean/dx" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
