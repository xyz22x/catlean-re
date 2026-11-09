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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class io {
private static final long a = yz.a(3446334409530900906L, 7232028930879722839L, MethodHandles.lookup().lookupClass()).a(152291902004432L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);

public static final void D(@NotNull String id, @NotNull i0 type, int a, short a, int a) {
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
// 018: getstatic su/catlean/io.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 91665873125117
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 64785959682138
// 02b: lxor
// 02c: lstore 9
// 02e: dup2
// 02f: ldc2_w 54787621580755
// 032: lxor
// 033: lstore 11
// 035: dup2
// 036: ldc2_w 98920239808055
// 039: lxor
// 03a: lstore 13
// 03c: dup2
// 03d: ldc2_w 72840544043441
// 040: lxor
// 041: dup2
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 15
// 048: dup2
// 049: bipush 16
// 04b: lshl
// 04c: bipush 32
// 04e: lushr
// 04f: l2i
// 050: istore 16
// 052: dup2
// 053: bipush 48
// 055: lshl
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 17
// 05c: pop2
// 05d: dup2
// 05e: ldc2_w 39219465373799
// 061: lxor
// 062: lstore 18
// 064: dup2
// 065: ldc2_w 112579105921282
// 068: lxor
// 069: lstore 20
// 06b: dup2
// 06c: ldc2_w 75118903431784
// 06f: lxor
// 070: dup2
// 071: bipush 32
// 073: lushr
// 074: l2i
// 075: istore 22
// 077: dup2
// 078: bipush 32
// 07a: lshl
// 07b: bipush 48
// 07d: lushr
// 07e: l2i
// 07f: istore 23
// 081: dup2
// 082: bipush 48
// 084: lshl
// 085: bipush 48
// 087: lushr
// 088: l2i
// 089: istore 24
// 08b: pop2
// 08c: dup2
// 08d: ldc2_w 109120138141348
// 090: lxor
// 091: lstore 25
// 093: dup2
// 094: ldc2_w 137047630660356
// 097: lxor
// 098: lstore 27
// 09a: dup2
// 09b: ldc2_w 105772638081088
// 09e: lxor
// 09f: dup2
// 0a0: bipush 32
// 0a2: lushr
// 0a3: l2i
// 0a4: istore 29
// 0a6: dup2
// 0a7: bipush 32
// 0a9: lshl
// 0aa: bipush 48
// 0ac: lushr
// 0ad: l2i
// 0ae: istore 30
// 0b0: dup2
// 0b1: bipush 48
// 0b3: lshl
// 0b4: bipush 48
// 0b6: lushr
// 0b7: l2i
// 0b8: istore 31
// 0ba: pop2
// 0bb: dup2
// 0bc: ldc2_w 24687078362503
// 0bf: lxor
// 0c0: lstore 32
// 0c2: dup2
// 0c3: ldc2_w 134029577743642
// 0c6: lxor
// 0c7: lstore 34
// 0c9: dup2
// 0ca: ldc2_w 132927817175392
// 0cd: lxor
// 0ce: lstore 36
// 0d0: dup2
// 0d1: ldc2_w 75231304181521
// 0d4: lxor
// 0d5: lstore 38
// 0d7: dup2
// 0d8: ldc2_w 9606849884253
// 0db: lxor
// 0dc: lstore 40
// 0de: pop2
// 0df: ldc2_w 800282861839994323
// 0e2: lload 5
// 0e4: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e9: aload 0
// 0ea: sipush 17422
// 0ed: ldc2_w 6330383588215856441
// 0f0: lload 5
// 0f2: lxor
// 0f3: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0fb: astore 42
// 0fd: aload 1
// 0fe: sipush 31509
// 101: ldc2_w 6678947653835268646
// 104: lload 5
// 106: lxor
// 107: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 10f: aload 1
// 110: getstatic su/catlean/za.N [I
// 113: swap
// 114: invokevirtual su/catlean/i0.ordinal ()I
// 117: iaload
// 118: tableswitch 461 1 2 24 250
// 130: getstatic su/catlean/iq.a Lsu/catlean/iq;
// 133: astore 46
// 135: bipush 0
// 136: istore 47
// 138: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 13b: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 13e: aload 46
// 140: invokevirtual su/catlean/iq.L ()Ljava/util/ArrayList;
// 143: checkcast java/util/List
// 146: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 149: invokevirtual su/catlean/yl.h ()Lsu/catlean/mx;
// 14c: lload 18
// 14e: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 151: invokevirtual su/catlean/sl.v ()Ljava/lang/String;
// 154: lload 25
// 156: invokevirtual su/catlean/oc.a (Ljava/util/List;Ljava/lang/String;J)V
// 159: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 15c: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 15f: lload 20
// 161: invokevirtual su/catlean/oc.i (J)Lsu/catlean/y_;
// 164: astore 48
// 166: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 169: invokevirtual su/catlean/yl.h ()Lsu/catlean/mx;
// 16c: lload 18
// 16e: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 171: lload 13
// 173: aload 0
// 174: invokevirtual su/catlean/sl.u (JLjava/lang/String;)V
// 177: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 17a: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 17d: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 180: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 183: lload 7
// 185: invokevirtual su/catlean/oc.F (J)Ljava/util/List;
// 188: checkcast java/lang/Iterable
// 18b: astore 49
// 18d: astore 50
// 18f: bipush 0
// 190: istore 51
// 192: aload 49
// 194: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 199: astore 52
// 19b: aload 52
// 19d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1a2: ifeq 1d2
// 1a5: aload 52
// 1a7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1ac: astore 53
// 1ae: aload 53
// 1b0: checkcast su/catlean/y_
// 1b3: astore 54
// 1b5: bipush 0
// 1b6: istore 55
// 1b8: aload 54
// 1ba: invokevirtual su/catlean/y_.q ()Ljava/lang/String;
// 1bd: aload 0
// 1be: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1c1: ifeq 19b
// 1c4: aload 53
// 1c6: iload 2
// 1c7: iflt 1ac
// 1ca: aload 42
// 1cc: ifnull 1b0
// 1cf: goto 1d3
// 1d2: aconst_null
// 1d3: aload 50
// 1d5: swap
// 1d6: checkcast su/catlean/y_
// 1d9: dup
// 1da: ifnonnull 1ea
// 1dd: pop
// 1de: return
// 1df: ldc2_w 851894999080292512
// 1e2: lload 5
// 1e4: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e9: athrow
// 1ea: lload 40
// 1ec: dup2_x1
// 1ed: pop2
// 1ee: invokevirtual su/catlean/oc.F (JLsu/catlean/y_;)V
// 1f1: aload 46
// 1f3: lload 11
// 1f5: invokevirtual su/catlean/iq.E (J)V
// 1f8: aload 46
// 1fa: iload 15
// 1fc: i2c
// 1fd: iload 16
// 1ff: iload 17
// 201: i2c
// 202: aload 48
// 204: invokevirtual su/catlean/iq.n (CICLsu/catlean/y_;)V
// 207: nop
// 208: iload 4
// 20a: ifle 316
// 20d: aload 42
// 20f: ifnonnull 2f8
// 212: getstatic su/catlean/w8.T Lsu/catlean/w8;
// 215: astore 46
// 217: bipush 0
// 218: istore 47
// 21a: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 21d: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 220: aload 46
// 222: invokevirtual su/catlean/w8.C ()Ljava/util/List;
// 225: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 228: invokevirtual su/catlean/yl.h ()Lsu/catlean/mx;
// 22b: lload 18
// 22d: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 230: invokevirtual su/catlean/sl.a ()Ljava/lang/String;
// 233: lload 38
// 235: dup2_x1
// 236: pop2
// 237: invokevirtual su/catlean/oe.V (Ljava/util/List;JLjava/lang/String;)V
// 23a: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 23d: invokevirtual su/catlean/yl.h ()Lsu/catlean/mx;
// 240: lload 18
// 242: invokevirtual su/catlean/mx.W (J)Lsu/catlean/sl;
// 245: aload 0
// 246: iload 29
// 248: iload 30
// 24a: i2s
// 24b: iload 31
// 24d: invokevirtual su/catlean/sl.p (Ljava/lang/String;ISI)V
// 250: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 253: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 256: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 259: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 25c: iload 22
// 25e: iload 23
// 260: i2c
// 261: iload 24
// 263: invokevirtual su/catlean/oe.K (ICI)Ljava/util/List;
// 266: checkcast java/lang/Iterable
// 269: astore 48
// 26b: astore 49
// 26d: bipush 0
// 26e: istore 50
// 270: aload 48
// 272: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 277: astore 51
// 279: aload 51
// 27b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 280: ifeq 2b0
// 283: aload 51
// 285: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 28a: astore 52
// 28c: aload 52
// 28e: checkcast su/catlean/jn
// 291: astore 53
// 293: bipush 0
// 294: istore 54
// 296: aload 53
// 298: invokevirtual su/catlean/jn.w ()Ljava/lang/String;
// 29b: aload 0
// 29c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 29f: ifeq 279
// 2a2: aload 52
// 2a4: iload 3
// 2a5: ifge 28a
// 2a8: aload 42
// 2aa: ifnull 28e
// 2ad: goto 2b1
// 2b0: aconst_null
// 2b1: aload 49
// 2b3: swap
// 2b4: checkcast su/catlean/jn
// 2b7: iload 3
// 2b8: ifge 2cc
// 2bb: dup
// 2bc: ifnonnull 2cc
// 2bf: pop
// 2c0: return
// 2c1: ldc2_w 851894999080292512
// 2c4: lload 5
// 2c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cb: athrow
// 2cc: lload 36
// 2ce: dup2_x1
// 2cf: pop2
// 2d0: invokevirtual su/catlean/oe.A (JLsu/catlean/jn;)V
// 2d3: aload 46
// 2d5: lload 34
// 2d7: invokevirtual su/catlean/w8.p (J)V
// 2da: nop
// 2db: iload 4
// 2dd: ifle 316
// 2e0: aload 42
// 2e2: ifnonnull 2f8
// 2e5: new kotlin/NoWhenBranchMatchedException
// 2e8: dup
// 2e9: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 2ec: athrow
// 2ed: ldc2_w 851894999080292512
// 2f0: lload 5
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: getstatic su/catlean/ad.x Lsu/catlean/ad;
// 2fb: getstatic net/minecraft/class_124.field_1068 Lnet/minecraft/class_124;
// 2fe: sipush 14271
// 301: ldc2_w 1321651483649666701
// 304: lload 5
// 306: lxor
// 307: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30c: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 311: lload 32
// 313: invokevirtual su/catlean/ad.a (Ljava/lang/String;J)V
// 316: getstatic su/catlean/iq.a Lsu/catlean/iq;
// 319: invokevirtual su/catlean/iq.L ()Ljava/util/ArrayList;
// 31c: checkcast java/lang/Iterable
// 31f: astore 44
// 321: bipush 0
// 322: istore 45
// 324: aload 44
// 326: astore 46
// 328: new java/util/ArrayList
// 32b: dup
// 32c: invokespecial java/util/ArrayList.<init> ()V
// 32f: checkcast java/util/Collection
// 332: astore 47
// 334: bipush 0
// 335: istore 48
// 337: aload 46
// 339: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 33e: astore 49
// 340: aload 49
// 342: invokeinterface java/util/Iterator.hasNext ()Z 1
// 347: ifeq 3ad
// 34a: aload 49
// 34c: iload 4
// 34e: ifle 35b
// 351: aload 42
// 353: ifnull 3bc
// 356: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 35b: astore 50
// 35d: aload 50
// 35f: checkcast su/catlean/_g
// 362: astore 51
// 364: bipush 0
// 365: istore 52
// 367: aload 51
// 369: lload 27
// 36b: invokevirtual su/catlean/_g.m (J)Lsu/catlean/lj;
// 36e: invokevirtual su/catlean/lj.X ()I
// 371: aload 42
// 373: ifnull 397
// 376: bipush -1
// 377: if_icmpeq 39a
// 37a: goto 388
// 37d: ldc2_w 851894999080292512
// 380: lload 5
// 382: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 387: athrow
// 388: bipush 1
// 389: goto 397
// 38c: ldc2_w 851894999080292512
// 38f: lload 5
// 391: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: athrow
// 397: goto 39b
// 39a: bipush 0
// 39b: ifeq 340
// 39e: aload 47
// 3a0: aload 50
// 3a2: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 3a7: pop
// 3a8: aload 42
// 3aa: ifnonnull 340
// 3ad: aload 47
// 3af: checkcast java/util/List
// 3b2: nop
// 3b3: iload 2
// 3b4: iflt 35b
// 3b7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 3bc: astore 43
// 3be: aload 43
// 3c0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3c5: ifeq 416
// 3c8: aload 43
// 3ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 3cf: checkcast su/catlean/_g
// 3d2: astore 44
// 3d4: getstatic su/catlean/ad.x Lsu/catlean/ad;
// 3d7: aload 44
// 3d9: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 3dc: getstatic net/minecraft/class_124.field_1068 Lnet/minecraft/class_124;
// 3df: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 3e2: aload 44
// 3e4: lload 27
// 3e6: invokevirtual su/catlean/_g.m (J)Lsu/catlean/lj;
// 3e9: invokevirtual su/catlean/lj.X ()I
// 3ec: lload 9
// 3ee: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 3f1: astore 56
// 3f3: astore 57
// 3f5: sipush 1982
// 3f8: ldc2_w 3432875230008401544
// 3fb: lload 5
// 3fd: lxor
// 3fe: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 403: aload 57
// 405: aload 56
// 407: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
// 40c: lload 32
// 40e: invokevirtual su/catlean/ad.a (Ljava/lang/String;J)V
// 411: aload 42
// 413: ifnonnull 3be
// 416: return
}

public static final void g(int a, byte a, @NotNull String id, @NotNull i0 type, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 0
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 1
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
// 018: getstatic su/catlean/io.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 78576100839504
// 024: lxor
// 025: lstore 7
// 027: dup2
// 028: ldc2_w 33672318406991
// 02b: lxor
// 02c: dup2
// 02d: bipush 48
// 02f: lushr
// 030: l2i
// 031: istore 9
// 033: dup2
// 034: bipush 16
// 036: lshl
// 037: bipush 32
// 039: lushr
// 03a: l2i
// 03b: istore 10
// 03d: dup2
// 03e: bipush 48
// 040: lshl
// 041: bipush 48
// 043: lushr
// 044: l2i
// 045: istore 11
// 047: pop2
// 048: dup2
// 049: ldc2_w 98958821037754
// 04c: lxor
// 04d: lstore 12
// 04f: dup2
// 050: ldc2_w 88482916875461
// 053: lxor
// 054: dup2
// 055: bipush 32
// 057: lushr
// 058: l2i
// 059: istore 14
// 05b: dup2
// 05c: bipush 32
// 05e: lshl
// 05f: bipush 48
// 061: lushr
// 062: l2i
// 063: istore 15
// 065: dup2
// 066: bipush 48
// 068: lshl
// 069: bipush 48
// 06b: lushr
// 06c: l2i
// 06d: istore 16
// 06f: pop2
// 070: dup2
// 071: ldc2_w 125669380208559
// 074: lxor
// 075: lstore 17
// 077: dup2
// 078: ldc2_w 75361554480159
// 07b: lxor
// 07c: dup2
// 07d: bipush 32
// 07f: lushr
// 080: l2i
// 081: istore 19
// 083: dup2
// 084: bipush 32
// 086: lshl
// 087: bipush 48
// 089: lushr
// 08a: l2i
// 08b: istore 20
// 08d: dup2
// 08e: bipush 48
// 090: lshl
// 091: bipush 48
// 093: lushr
// 094: l2i
// 095: istore 21
// 097: pop2
// 098: pop2
// 099: aload 2
// 09a: sipush 31688
// 09d: ldc2_w 9160161333020527709
// 0a0: lload 5
// 0a2: lxor
// 0a3: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0ab: ldc2_w 2717422293295063934
// 0ae: lload 5
// 0b0: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b5: aload 3
// 0b6: sipush 21335
// 0b9: ldc2_w 3298859639599146187
// 0bc: lload 5
// 0be: lxor
// 0bf: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c7: astore 22
// 0c9: aload 3
// 0ca: getstatic su/catlean/za.N [I
// 0cd: swap
// 0ce: invokevirtual su/catlean/i0.ordinal ()I
// 0d1: iaload
// 0d2: aload 22
// 0d4: ifnull 117
// 0d7: tableswitch 634 1 2 32 332
// 0ec: ldc2_w 2702051837540236813
// 0ef: lload 5
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: aload 2
// 0f8: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 0fb: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 0fe: lload 17
// 100: invokevirtual su/catlean/oc.i (J)Lsu/catlean/y_;
// 103: invokevirtual su/catlean/y_.q ()Ljava/lang/String;
// 106: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 109: goto 117
// 10c: ldc2_w 2702051837540236813
// 10f: lload 5
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: aload 22
// 119: iload 0
// 11a: iflt 187
// 11d: ifnull 185
// 120: ifeq 167
// 123: goto 131
// 126: ldc2_w 2702051837540236813
// 129: lload 5
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 134: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 137: lload 7
// 139: invokevirtual su/catlean/oc.F (J)Ljava/util/List;
// 13c: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 13f: checkcast su/catlean/y_
// 142: invokevirtual su/catlean/y_.q ()Ljava/lang/String;
// 145: aload 3
// 146: iload 19
// 148: iload 20
// 14a: i2s
// 14b: iload 21
// 14d: invokestatic su/catlean/io.D (Ljava/lang/String;Lsu/catlean/i0;ISI)V
// 150: iload 1
// 151: ifge 1f9
// 154: aload 22
// 156: ifnonnull 1dd
// 159: goto 167
// 15c: ldc2_w 2702051837540236813
// 15f: lload 5
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 16a: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 16d: lload 7
// 16f: invokevirtual su/catlean/oc.F (J)Ljava/util/List;
// 172: invokeinterface java/util/List.size ()I 1
// 177: goto 185
// 17a: ldc2_w 2702051837540236813
// 17d: lload 5
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: aload 22
// 187: ifnull 220
// 18a: bipush 1
// 18b: if_icmpne 1dd
// 18e: goto 19c
// 191: ldc2_w 2702051837540236813
// 194: lload 5
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: sipush 3360
// 19f: ldc2_w 550490262091397816
// 1a2: lload 5
// 1a4: lxor
// 1a5: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: aload 3
// 1ab: iload 9
// 1ad: i2c
// 1ae: iload 10
// 1b0: iload 11
// 1b2: i2s
// 1b3: invokestatic su/catlean/io.p (Ljava/lang/String;Lsu/catlean/i0;CIS)V
// 1b6: sipush 19350
// 1b9: ldc2_w 6801569886011603970
// 1bc: lload 5
// 1be: lxor
// 1bf: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: aload 3
// 1c5: iload 19
// 1c7: iload 20
// 1c9: i2s
// 1ca: iload 21
// 1cc: invokestatic su/catlean/io.D (Ljava/lang/String;Lsu/catlean/i0;ISI)V
// 1cf: goto 1dd
// 1d2: ldc2_w 2702051837540236813
// 1d5: lload 5
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 1e0: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 1e3: lload 7
// 1e5: invokevirtual su/catlean/oc.F (J)Ljava/util/List;
// 1e8: aload 2
// 1e9: invokedynamic invoke (Ljava/lang/String;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/io.G (Ljava/lang/String;Lsu/catlean/y_;)Z, (Lsu/catlean/y_;)Ljava/lang/Boolean; ]
// 1ee: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/io.X (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 1f3: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 1f8: pop
// 1f9: new java/io/File
// 1fc: dup
// 1fd: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 200: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 203: invokevirtual su/catlean/oc.U ()Ljava/io/File;
// 206: aload 2
// 207: sipush 14025
// 20a: ldc2_w 7517672702596923742
// 20d: lload 5
// 20f: lxor
// 210: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 215: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 21a: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
// 21d: invokevirtual java/io/File.delete ()Z
// 220: goto 359
// 223: aload 2
// 224: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 227: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 22a: lload 12
// 22c: invokevirtual su/catlean/oe.n (J)Lsu/catlean/jn;
// 22f: invokevirtual su/catlean/jn.w ()Ljava/lang/String;
// 232: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 235: aload 22
// 237: iload 0
// 238: ifle 2b0
// 23b: ifnull 2ae
// 23e: ifeq 28b
// 241: goto 24f
// 244: ldc2_w 2702051837540236813
// 247: lload 5
// 249: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24e: athrow
// 24f: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 252: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 255: iload 14
// 257: iload 15
// 259: i2c
// 25a: iload 16
// 25c: invokevirtual su/catlean/oe.K (ICI)Ljava/util/List;
// 25f: invokestatic kotlin/collections/CollectionsKt.first (Ljava/util/List;)Ljava/lang/Object;
// 262: checkcast su/catlean/jn
// 265: invokevirtual su/catlean/jn.w ()Ljava/lang/String;
// 268: aload 3
// 269: iload 19
// 26b: iload 20
// 26d: i2s
// 26e: iload 21
// 270: invokestatic su/catlean/io.D (Ljava/lang/String;Lsu/catlean/i0;ISI)V
// 273: iload 4
// 275: ifle 327
// 278: aload 22
// 27a: ifnonnull 306
// 27d: goto 28b
// 280: ldc2_w 2702051837540236813
// 283: lload 5
// 285: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: athrow
// 28b: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 28e: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 291: iload 14
// 293: iload 15
// 295: i2c
// 296: iload 16
// 298: invokevirtual su/catlean/oe.K (ICI)Ljava/util/List;
// 29b: invokeinterface java/util/List.size ()I 1
// 2a0: goto 2ae
// 2a3: ldc2_w 2702051837540236813
// 2a6: lload 5
// 2a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ad: athrow
// 2ae: aload 22
// 2b0: ifnull 34e
// 2b3: bipush 1
// 2b4: if_icmpne 306
// 2b7: goto 2c5
// 2ba: ldc2_w 2702051837540236813
// 2bd: lload 5
// 2bf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c4: athrow
// 2c5: sipush 19350
// 2c8: ldc2_w 6801569886011603970
// 2cb: lload 5
// 2cd: lxor
// 2ce: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d3: aload 3
// 2d4: iload 9
// 2d6: i2c
// 2d7: iload 10
// 2d9: iload 11
// 2db: i2s
// 2dc: invokestatic su/catlean/io.p (Ljava/lang/String;Lsu/catlean/i0;CIS)V
// 2df: sipush 19350
// 2e2: ldc2_w 6801569886011603970
// 2e5: lload 5
// 2e7: lxor
// 2e8: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: aload 3
// 2ee: iload 19
// 2f0: iload 20
// 2f2: i2s
// 2f3: iload 21
// 2f5: invokestatic su/catlean/io.D (Ljava/lang/String;Lsu/catlean/i0;ISI)V
// 2f8: goto 306
// 2fb: ldc2_w 2702051837540236813
// 2fe: lload 5
// 300: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 305: athrow
// 306: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 309: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 30c: iload 14
// 30e: iload 15
// 310: i2c
// 311: iload 16
// 313: invokevirtual su/catlean/oe.K (ICI)Ljava/util/List;
// 316: aload 2
// 317: invokedynamic invoke (Ljava/lang/String;)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, su/catlean/io.m (Ljava/lang/String;Lsu/catlean/jn;)Z, (Lsu/catlean/jn;)Ljava/lang/Boolean; ]
// 31c: invokedynamic test (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, su/catlean/io.c (Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z, (Ljava/lang/Object;)Z ]
// 321: invokeinterface java/util/List.removeIf (Ljava/util/function/Predicate;)Z 2
// 326: pop
// 327: new java/io/File
// 32a: dup
// 32b: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 32e: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 331: invokevirtual su/catlean/oe.U ()Ljava/io/File;
// 334: aload 2
// 335: sipush 17849
// 338: ldc2_w 6890692915348517408
// 33b: lload 5
// 33d: lxor
// 33e: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/io.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 348: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
// 34b: invokevirtual java/io/File.delete ()Z
// 34e: goto 359
// 351: new kotlin/NoWhenBranchMatchedException
// 354: dup
// 355: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 358: athrow
// 359: pop
// 35a: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
// $VF: Unable to simplify switch on enum
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
public static final void p(@NotNull String id, @NotNull i0 type, char a, int a, short a) {
long var5;
label31: {
var5 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
long var7 = var5 ^ 62857033987060L;
long var10001 = var5 ^ 21955982885208L;
int var9 = (int)((var5 ^ 21955982885208L) >>> 32);
int var10 = (int)((var5 ^ 21955982885208L) << 32 >>> 40);
int var11 = (int)(var10001 << 56 >>> 56);
var10001 = var5 ^ 21955982885208L;
int var12 = (int)((var5 ^ 21955982885208L) >>> 32);
int var13 = (int)((var5 ^ 21955982885208L) << 32 >>> 40);
int var14 = (int)(var10001 << 56 >>> 56);
long var15 = var5 ^ 33507977300545L;
_g[] var10000 = vm.a<"Å">(-1852255909587017597L, var5);
Intrinsics.checkNotNullParameter(id, a<"g">(17422, 6330460465850577001L ^ var5));
Intrinsics.checkNotNullParameter(type, a<"g">(31509, 6678901557967933302L ^ var5));
_g[] var17 = var10000;
yl var24;
switch (za.N[type.ordinal()]) {
case 1:
var24 = yl.g;
if (ax <= 0) {
break;
}

oc var18 = yl.g.l();
boolean var19 = false;
var18.a(iq.a.L(), id, var7);
var18.h(var9, var10, (byte)var11);
if (var17 != null) {
return;
}
case 2:
var24 = yl.g;
break;
default:
break label31;
}

oe var22 = var24.d();
boolean var23 = false;

try {
var22.V(w8.T.C(), var15, id);
var22.h(var12, var13, (byte)var14);
if (var17 != null) {
return;
}
} catch (NoWhenBranchMatchedException var21) {
throw vm.a<"Å">(var21, -1836672698216858128L, var5);
}
}

try {
throw new NoWhenBranchMatchedException();
} catch (NoWhenBranchMatchedException var20) {
throw vm.a<"Å">(var20, -1836672698216858128L, var5);
}
}

private static final boolean G(String var0, y_ var1) {
long var2 = a ^ 110984195723231L;
Intrinsics.checkNotNullParameter(var1, a<"g">(4810, 5562247161337453819L ^ var2));
return Intrinsics.areEqual(var1.q(), var0);
}

private static final boolean X(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

private static final boolean m(String var0, jn var1) {
long var2 = a ^ 62110723370745L;
Intrinsics.checkNotNullParameter(var1, a<"g">(26323, 2969254222806862287L ^ var2));
return Intrinsics.areEqual(var1.w(), var0);
}

private static final boolean c(Function1 var0, Object var1) {
return (Boolean)var0.invoke(var1);
}

static {
long var0 = a ^ 95362099258879L;
Cipher var2;
Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var9 = new String[12];
int var7 = 0;
String var6 = "CÊÕ\u0003\u0085ì\u001arÄ\u0093Ýy\u007f8\u0000T\u0010\u0088H\u008dJ(\u001b\u0095Ùð\u0081«£\u0090÷¯\u000f Ô\f\u009e³\u00853¯\u000eU\u0018\r\u0000I\u001eTÃhÛ.?\u0097qÕÿ\u0088clÜïú\u0016!\u0010¨\u0017¶äUcÏ/G;º\u00818ñ`9\u0010L$zùú²\u001e\u0004-~,\u008a'¿´J\u00103ÐwW5\n!¤/ÑU\u008d2I0\u009b\u0010\u008cP~\u009aâÊÃ£I\u001a\u0001!ªBd\u0097\u0010\u0015HöÞDP$2Å[\u008a\u0001S\u001fÀM\u0010|kä£g\u000e\u0013R\u0005\u0086ÇÇ\u000eTçÇ\u0010`ýìl0ó\u008eï]wSZ\"´\u008cz";
int var8 = "CÊÕ\u0003\u0085ì\u001arÄ\u0093Ýy\u007f8\u0000T\u0010\u0088H\u008dJ(\u001b\u0095Ùð\u0081«£\u0090÷¯\u000f Ô\f\u009e³\u00853¯\u000eU\u0018\r\u0000I\u001eTÃhÛ.?\u0097qÕÿ\u0088clÜïú\u0016!\u0010¨\u0017¶äUcÏ/G;º\u00818ñ`9\u0010L$zùú²\u001e\u0004-~,\u008a'¿´J\u00103ÐwW5\n!¤/ÑU\u008d2I0\u009b\u0010\u008cP~\u009aâÊÃ£I\u001a\u0001!ªBd\u0097\u0010\u0015HöÞDP$2Å[\u008a\u0001S\u001fÀM\u0010|kä£g\u000e\u0013R\u0005\u0086ÇÇ\u000eTçÇ\u0010`ýìl0ó\u008eï]wSZ\"´\u008cz"
.length();
char var5 = 16;
int var12 = -1;

label27:
while (true) {
String var13 = var6.substring(++var12, var12 + var5);
byte var10001 = -1;

while (true) {
byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
String var19 = a(var10).intern();
switch (var10001) {
case 0:
var9[var7++] = var19;
if ((var12 += var5) >= var8) {
b = var9;
c = new String[12];
return;
}

var5 = var6.charAt(var12);
break;
default:
var9[var7++] = var19;
if ((var12 += var5) < var8) {
var5 = var6.charAt(var12);
continue label27;
}

var6 = "4l_SéÙ\u008cpAô\u000e\\\u0087ó]k\u0003wh\u0007E¹®Ë\u0010\u009b\u0012fy!¬Û{&Ï\u001b\u00887\\,õ";
var8 = "4l_SéÙ\u008cpAô\u000e\\\u0087ó]k\u0003wh\u0007E¹®Ë\u0010\u009b\u0012fy!¬Û{&Ï\u001b\u00887\\,õ".length();
var5 = 24;
var12 = -1;
}

var13 = var6.substring(++var12, var12 + var5);
var10001 = 0;
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21340;
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
throw new RuntimeException("su/catlean/io", var10);
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
throw new RuntimeException("su/catlean/io" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
