package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import net.minecraft.class_2338;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2846.class_2847;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class qh extends _g {
@NotNull
public static final qh t;
private static final long a = yz.a(-7323972480482300541L, -6484860920814028689L, MethodHandles.lookup().lookupClass()).a(101014859480704L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private qh(int var1, char var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 110291570781639L;
super(b<"o">(25413, 1838115996079218938L ^ var4), jt.n(), null, 4, null, var6);
}

@Flow
private final void P(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qh.a J
// 003: ldc2_w 38592553396079
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 56788119486987
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 27640969722688
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 22882171424036
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 32428685765091
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 58895419309405
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
// 046: pop2
// 047: ldc2_w 8902496119122763967
// 04a: lload 2
// 04b: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: istore 15
// 052: lload 10
// 054: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 057: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
// 05a: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 05d: getstatic net/minecraft/class_1802.field_8102 Lnet/minecraft/class_1792;
// 060: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 063: iload 15
// 065: ifne 08d
// 068: ifeq 108
// 06b: goto 078
// 06e: ldc2_w 8902385736775753200
// 071: lload 2
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: lload 10
// 07a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 07d: invokevirtual net/minecraft/class_746.method_6048 ()I
// 080: goto 08d
// 083: ldc2_w 8902385736775753200
// 086: lload 2
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: iload 15
// 08f: ifne 0bc
// 092: bipush 4
// 093: if_icmplt 108
// 096: goto 0a3
// 099: ldc2_w 8902385736775753200
// 09c: lload 2
// 09d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a2: athrow
// 0a3: aload 0
// 0a4: iload 12
// 0a6: iload 13
// 0a8: i2c
// 0a9: iload 14
// 0ab: i2c
// 0ac: invokespecial su/catlean/qh.K (ICC)Z
// 0af: goto 0bc
// 0b2: ldc2_w 8902385736775753200
// 0b5: lload 2
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: ifeq 108
// 0bf: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 0c2: new su/catlean/t5
// 0c5: dup
// 0c6: new su/catlean/_w
// 0c9: dup
// 0ca: lload 10
// 0cc: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cf: invokevirtual net/minecraft/class_746.method_36455 ()F
// 0d2: lload 6
// 0d4: ldc -90.0
// 0d6: bipush 0
// 0d7: aconst_null
// 0d8: sipush 21563
// 0db: ldc2_w 980605348143481218
// 0de: lload 2
// 0df: lxor
// 0e0: invokedynamic y (IJ)I bsm=su/catlean/qh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: aconst_null
// 0e6: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 0e9: lload 8
// 0eb: bipush 0
// 0ec: invokedynamic invoke ()Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/qh.w ()Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 0f1: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// 0f4: lload 4
// 0f6: dup2_x1
// 0f7: pop2
// 0f8: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 0fb: goto 108
// 0fe: ldc2_w 8902385736775753200
// 101: lload 2
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: return
}

private final boolean K(int param1, char param2, char param3) {
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
// 005: iload 2
// 006: i2l
// 007: bipush 48
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/qh.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 132729628612335
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 70538800380863
// 02a: lxor
// 02b: lstore 8
// 02d: dup2
// 02e: ldc2_w 48366389725533
// 031: lxor
// 032: lstore 10
// 034: pop2
// 035: new kotlin/ranges/IntRange
// 038: dup
// 039: bipush 0
// 03a: sipush 18929
// 03d: ldc2_w 2832369666227895536
// 040: lload 4
// 042: lxor
// 043: invokedynamic y (IJ)I bsm=su/catlean/qh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: invokespecial kotlin/ranges/IntRange.<init> (II)V
// 04b: checkcast java/lang/Iterable
// 04e: astore 14
// 050: bipush 0
// 051: istore 15
// 053: ldc2_w 6567045462125386008
// 056: lload 4
// 058: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: aload 14
// 05f: astore 16
// 061: new java/util/ArrayList
// 064: dup
// 065: aload 14
// 067: sipush 8296
// 06a: ldc2_w 8359852775971984747
// 06d: lload 4
// 06f: lxor
// 070: invokedynamic y (IJ)I bsm=su/catlean/qh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 078: invokespecial java/util/ArrayList.<init> (I)V
// 07b: checkcast java/util/Collection
// 07e: astore 17
// 080: bipush 0
// 081: istore 18
// 083: istore 12
// 085: aload 16
// 087: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 08c: astore 19
// 08e: aload 19
// 090: invokeinterface java/util/Iterator.hasNext ()Z 1
// 095: ifeq 131
// 098: aload 19
// 09a: checkcast kotlin/collections/IntIterator
// 09d: invokevirtual kotlin/collections/IntIterator.nextInt ()I
// 0a0: istore 20
// 0a2: aload 17
// 0a4: iload 20
// 0a6: istore 21
// 0a8: astore 24
// 0aa: bipush 0
// 0ab: istore 22
// 0ad: lload 10
// 0af: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0b2: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0b5: iload 12
// 0b7: iload 3
// 0b8: iflt 0c0
// 0bb: ifeq 13e
// 0be: iload 21
// 0c0: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 0c3: dup
// 0c4: sipush 16084
// 0c7: ldc2_w 6006952529279932997
// 0ca: lload 4
// 0cc: lxor
// 0cd: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/qh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d5: astore 23
// 0d7: aload 23
// 0d9: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0dc: instanceof net/minecraft/class_1744
// 0df: ifeq 122
// 0e2: new su/catlean/pi
// 0e5: dup
// 0e6: iload 21
// 0e8: aload 23
// 0ea: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
// 0ed: getstatic net/minecraft/class_1844.field_49274 Lnet/minecraft/class_1844;
// 0f0: invokevirtual net/minecraft/class_1799.method_58695 (Lnet/minecraft/class_9331;Ljava/lang/Object;)Ljava/lang/Object;
// 0f3: checkcast net/minecraft/class_1844
// 0f6: invokevirtual net/minecraft/class_1844.method_57397 ()Ljava/lang/Iterable;
// 0f9: dup
// 0fa: sipush 11162
// 0fd: ldc2_w 3487205645380898570
// 100: lload 4
// 102: lxor
// 103: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/qh.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 10b: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/lang/Iterable;)Ljava/lang/Object;
// 10e: checkcast net/minecraft/class_1293
// 111: invokespecial su/catlean/pi.<init> (ILnet/minecraft/class_1293;)V
// 114: goto 123
// 117: ldc2_w 6572324340215643470
// 11a: lload 4
// 11c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 121: athrow
// 122: aconst_null
// 123: aload 24
// 125: swap
// 126: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 12b: pop
// 12c: iload 12
// 12e: ifne 08e
// 131: aload 17
// 133: checkcast java/util/List
// 136: nop
// 137: checkcast java/lang/Iterable
// 13a: iload 1
// 13b: iflt 13e
// 13e: invokestatic kotlin/collections/CollectionsKt.filterNotNull (Ljava/lang/Iterable;)Ljava/util/List;
// 141: astore 13
// 143: aload 13
// 145: iload 12
// 147: ifeq 172
// 14a: invokeinterface java/util/List.isEmpty ()Z 1
// 14f: ifeq 16d
// 152: goto 160
// 155: ldc2_w 6572324340215643470
// 158: lload 4
// 15a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15f: athrow
// 160: bipush 0
// 161: ireturn
// 162: ldc2_w 6572324340215643470
// 165: lload 4
// 167: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: athrow
// 16d: aload 13
// 16f: checkcast java/lang/Iterable
// 172: astore 15
// 174: bipush 0
// 175: istore 16
// 177: aload 15
// 179: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 17e: astore 17
// 180: aload 17
// 182: iload 12
// 184: ifeq 1b7
// 187: invokeinterface java/util/Iterator.hasNext ()Z 1
// 18c: ifne 1b0
// 18f: goto 19d
// 192: ldc2_w 6572324340215643470
// 195: lload 4
// 197: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: athrow
// 19d: new java/util/NoSuchElementException
// 1a0: dup
// 1a1: invokespecial java/util/NoSuchElementException.<init> ()V
// 1a4: athrow
// 1a5: ldc2_w 6572324340215643470
// 1a8: lload 4
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: aload 17
// 1b2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1b7: astore 18
// 1b9: aload 17
// 1bb: iload 12
// 1bd: ifeq 1e8
// 1c0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1c5: ifne 1e6
// 1c8: goto 1d6
// 1cb: ldc2_w 6572324340215643470
// 1ce: lload 4
// 1d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d5: athrow
// 1d6: aload 18
// 1d8: goto 235
// 1db: ldc2_w 6572324340215643470
// 1de: lload 4
// 1e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e5: athrow
// 1e6: aload 18
// 1e8: checkcast su/catlean/pi
// 1eb: astore 19
// 1ed: bipush 0
// 1ee: istore 20
// 1f0: aload 19
// 1f2: invokevirtual su/catlean/pi.W ()I
// 1f5: istore 19
// 1f7: aload 17
// 1f9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1fe: astore 20
// 200: aload 20
// 202: checkcast su/catlean/pi
// 205: astore 21
// 207: bipush 0
// 208: istore 22
// 20a: aload 21
// 20c: invokevirtual su/catlean/pi.W ()I
// 20f: istore 21
// 211: iload 19
// 213: iload 21
// 215: if_icmple 220
// 218: aload 20
// 21a: astore 18
// 21c: iload 21
// 21e: istore 19
// 220: aload 17
// 222: invokeinterface java/util/Iterator.hasNext ()Z 1
// 227: ifne 1f7
// 22a: iload 12
// 22c: iload 3
// 22d: ifle 21e
// 230: ifeq 21c
// 233: aload 18
// 235: checkcast su/catlean/pi
// 238: invokevirtual su/catlean/pi.W ()I
// 23b: istore 14
// 23d: aload 13
// 23f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 244: astore 15
// 246: aload 15
// 248: invokeinterface java/util/Iterator.hasNext ()Z 1
// 24d: ifeq 2f6
// 250: aload 15
// 252: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 257: checkcast su/catlean/pi
// 25a: astore 16
// 25c: aload 0
// 25d: aload 16
// 25f: lload 8
// 261: invokespecial su/catlean/qh.j (Lsu/catlean/pi;J)Z
// 264: ifeq 246
// 267: aload 16
// 269: invokevirtual su/catlean/pi.W ()I
// 26c: iload 1
// 26d: ifle 264
// 270: iload 12
// 272: ifeq 264
// 275: iload 12
// 277: iload 3
// 278: ifle 272
// 27b: iload 2
// 27c: iflt 284
// 27f: ifeq 2f5
// 282: iload 14
// 284: if_icmpeq 2f4
// 287: goto 295
// 28a: ldc2_w 6572324340215643470
// 28d: lload 4
// 28f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 294: athrow
// 295: aload 16
// 297: invokevirtual su/catlean/pi.W ()I
// 29a: lload 6
// 29c: bipush 0
// 29d: aconst_null
// 29e: bipush 0
// 29f: sipush 2659
// 2a2: ldc2_w 3923050068590706529
// 2a5: lload 4
// 2a7: lxor
// 2a8: invokedynamic y (IJ)I bsm=su/catlean/qh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ad: aconst_null
// 2ae: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 2b1: iload 14
// 2b3: lload 6
// 2b5: bipush 0
// 2b6: aconst_null
// 2b7: bipush 0
// 2b8: sipush 20175
// 2bb: ldc2_w 1078887866682178511
// 2be: lload 4
// 2c0: lxor
// 2c1: invokedynamic y (IJ)I bsm=su/catlean/qh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c6: aconst_null
// 2c7: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 2ca: aload 16
// 2cc: invokevirtual su/catlean/pi.W ()I
// 2cf: lload 6
// 2d1: bipush 0
// 2d2: aconst_null
// 2d3: bipush 1
// 2d4: sipush 28738
// 2d7: ldc2_w 391646040707515716
// 2da: lload 4
// 2dc: lxor
// 2dd: invokedynamic y (IJ)I bsm=su/catlean/qh.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e2: aconst_null
// 2e3: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 2e6: goto 2f4
// 2e9: ldc2_w 6572324340215643470
// 2ec: lload 4
// 2ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f3: athrow
// 2f4: bipush 1
// 2f5: ireturn
// 2f6: bipush 0
// 2f7: ireturn
}

private final boolean j(pi param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/qh.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 79632407060775
// 00b: lxor
// 00c: lstore 4
// 00e: pop2
// 00f: ldc2_w 4426599431041934941
// 012: lload 2
// 013: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: istore 6
// 01a: iload 6
// 01c: ifne 045
// 01f: aload 1
// 020: invokevirtual su/catlean/pi.X ()Lnet/minecraft/class_1293;
// 023: dup
// 024: ifnull 044
// 027: goto 034
// 02a: ldc2_w 4425302434074434322
// 02d: lload 2
// 02e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: athrow
// 034: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
// 037: goto 046
// 03a: ldc2_w 4425302434074434322
// 03d: lload 2
// 03e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: athrow
// 044: pop
// 045: aconst_null
// 046: getstatic net/minecraft/class_1294.field_5910 Lnet/minecraft/class_6880;
// 049: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 04c: ifeq 0c3
// 04f: lload 2
// 050: lconst_0
// 051: lcmp
// 052: iflt 0b9
// 055: lload 4
// 057: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 05a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 05d: dup
// 05e: ifnull 0b8
// 061: goto 06e
// 064: ldc2_w 4425302434074434322
// 067: lload 2
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: getstatic net/minecraft/class_1294.field_5910 Lnet/minecraft/class_6880;
// 071: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 074: nop
// 075: iload 6
// 077: ifne 098
// 07a: goto 087
// 07d: ldc2_w 4425302434074434322
// 080: lload 2
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: ifne 09b
// 08a: goto 097
// 08d: ldc2_w 4425302434074434322
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: bipush 1
// 098: goto 09c
// 09b: bipush 0
// 09c: lload 2
// 09d: lconst_0
// 09e: lcmp
// 09f: iflt 0b5
// 0a2: bipush 1
// 0a3: if_icmpne 0b4
// 0a6: bipush 1
// 0a7: goto 0ba
// 0aa: ldc2_w 4425302434074434322
// 0ad: lload 2
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: bipush 0
// 0b5: goto 0ba
// 0b8: pop
// 0b9: bipush 0
// 0ba: lload 2
// 0bb: lconst_0
// 0bc: lcmp
// 0bd: ifle 16e
// 0c0: ifne 16d
// 0c3: lload 2
// 0c4: lconst_0
// 0c5: lcmp
// 0c6: ifle 0ef
// 0c9: aload 1
// 0ca: invokevirtual su/catlean/pi.X ()Lnet/minecraft/class_1293;
// 0cd: dup
// 0ce: ifnull 0ee
// 0d1: goto 0de
// 0d4: ldc2_w 4425302434074434322
// 0d7: lload 2
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
// 0e1: goto 0f0
// 0e4: ldc2_w 4425302434074434322
// 0e7: lload 2
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: pop
// 0ef: aconst_null
// 0f0: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
// 0f3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0f6: ifeq 17b
// 0f9: lload 2
// 0fa: lconst_0
// 0fb: lcmp
// 0fc: iflt 163
// 0ff: lload 4
// 101: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 104: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
// 107: dup
// 108: ifnull 162
// 10b: goto 118
// 10e: ldc2_w 4425302434074434322
// 111: lload 2
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
// 11b: invokevirtual net/minecraft/class_746.method_6059 (Lnet/minecraft/class_6880;)Z
// 11e: nop
// 11f: iload 6
// 121: ifne 142
// 124: goto 131
// 127: ldc2_w 4425302434074434322
// 12a: lload 2
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: ifne 145
// 134: goto 141
// 137: ldc2_w 4425302434074434322
// 13a: lload 2
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: bipush 1
// 142: goto 146
// 145: bipush 0
// 146: lload 2
// 147: lconst_0
// 148: lcmp
// 149: iflt 15f
// 14c: bipush 1
// 14d: if_icmpne 15e
// 150: bipush 1
// 151: goto 164
// 154: ldc2_w 4425302434074434322
// 157: lload 2
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: bipush 0
// 15f: goto 164
// 162: pop
// 163: bipush 0
// 164: lload 2
// 165: lconst_0
// 166: lcmp
// 167: iflt 16e
// 16a: ifeq 17b
// 16d: bipush 1
// 16e: goto 17c
// 171: ldc2_w 4425302434074434322
// 174: lload 2
// 175: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/util/NoSuchElementException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: athrow
// 17b: bipush 0
// 17c: ireturn
}

private static final Unit w() {
long var0 = a ^ 139367758663011L;
long var2 = var0 ^ 71417665173418L;
long var4 = var0 ^ 71085846135791L;
_r.a(var2, (class_2596)(new class_2846(class_2847.field_12974, class_2338.field_10980, zf.v(var4).method_5735())));
zf.v(var4).method_6075();
return Unit.INSTANCE;
}

static {
long var20 = a ^ 128838224164739L;
long var10001 = var20 ^ 53151432444573L;
int var22 = (int)((var20 ^ 53151432444573L) >>> 32);
int var23 = (int)((var20 ^ 53151432444573L) << 32 >>> 48);
int var24 = (int)(var10001 << 48 >>> 48);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[3];
int var16 = 0;
String var15 = "Ò\u0096\u0081*«|³7[VÔ¡æv\u001fO|}\u007f\u0098%ýÖI¶\\NÏó\u0093m¦(\u0088Jô½Ú\tsë¯¿\u0080Ï\u0099\u0011«ó86\u0005\u0086Ï\u000f~f1\u007fáhå;Ò\u0004_\u00810©û\u000e+½\u0010ÒâÆyý\u0092\u001c\u009e5bàñ³¥SÚ";
int var17 = "Ò\u0096\u0081*«|³7[VÔ¡æv\u001fO|}\u007f\u0098%ýÖI¶\\NÏó\u0093m¦(\u0088Jô½Ú\tsë¯¿\u0080Ï\u0099\u0011«ó86\u0005\u0086Ï\u000f~f1\u007fáhå;Ò\u0004_\u00810©û\u000e+½\u0010ÒâÆyý\u0092\u001c\u009e5bàñ³¥SÚ"
.length();
char var14 = ' ';
int var13 = -1;

while (true) {
byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
String var34 = b(var19).intern();
byte var29 = -1;
var18[var16++] = var34;
if ((var13 += var14) >= var17) {
b = var18;
c = new String[3];
g = new HashMap(13);
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
String var4 = "\u0016\u0087^\u0010\u0095\u0017¶#.«\u008b¾ò?wyT\u0002GÔ'a©(ÙBÏÙ¬n±M";
int var5 = "\u0016\u0087^\u0010\u0095\u0017¶#.«\u008b¾ò?wyT\u0002GÔ'a©(ÙBÏÙ¬n±M".length();
byte var2 = 0;

label32:
while (true) {
byte var31 = var2;
var2 += 8;
byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
int var32 = var3++;
long var37 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var40 = -1;

while (true) {
long var8 = var37;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var42 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var40) {
case 0:
var28[var32] = var42;
if (var2 >= var5) {
e = var6;
f = new Integer[6];
t = new qh(var22, (char)var23, (short)var24);
return;
}
break;
default:
var28[var32] = var42;
if (var2 < var5) {
continue label32;
}

var4 = "w\u00adK´ß\u0002\u0017xÎ9\u0090\u0005\u009d'-\u008a";
var5 = "w\u00adK´ß\u0002\u0017xÎ9\u0090\u0005\u009d'-\u008a".length();
var2 = 0;
}

byte var33 = var2;
var2 += 8;
var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
var28 = var6;
var32 = var3++;
var37 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var40 = 0;
}
}
}

var14 = var15.charAt(var13);
}
}

private static NoSuchElementException a(NoSuchElementException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16035;
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
throw new RuntimeException("su/catlean/qh", var10);
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
throw new RuntimeException("su/catlean/qh" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28464;
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
throw new RuntimeException("su/catlean/qh", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
f[var3] = var15;
}

return f[var3];
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
throw new RuntimeException("su/catlean/qh" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
