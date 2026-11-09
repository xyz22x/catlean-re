package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_3532;
import net.minecraft.class_745;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sx {
@NotNull
public static final sx M;
@NotNull
private static final Set u;
private static final long a = yz.a(-4464292581146452936L, -7821336938314189425L, MethodHandles.lookup().lookupClass()).a(71815905138206L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private sx() {
}

@NotNull
public final Set d() {
return u;
}

@Nullable
public final class_1297 y(int a, short a, short a, @Nullable class_1297 currentTraget) {
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
// 0e: iload 3
// 0f: i2l
// 10: bipush 48
// 12: lshl
// 13: bipush 48
// 15: lushr
// 16: lor
// 17: getstatic su/catlean/sx.a J
// 1a: lxor
// 1b: lstore 5
// 1d: lload 5
// 1f: dup2
// 20: ldc2_w 60769064109749
// 23: lxor
// 24: dup2
// 25: bipush 8
// 27: lushr
// 28: lstore 7
// 2a: dup2
// 2b: bipush 56
// 2d: lshl
// 2e: bipush 56
// 30: lushr
// 31: l2i
// 32: istore 9
// 34: pop2
// 35: dup2
// 36: ldc2_w 123446667839610
// 39: lxor
// 3a: lstore 10
// 3c: dup2
// 3d: ldc2_w 39381323014404
// 40: lxor
// 41: lstore 12
// 43: pop2
// 44: ldc2_w 6530083717737555096
// 47: lload 5
// 49: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e: aload 0
// 4f: lload 10
// 51: invokespecial su/catlean/sx.R (J)Lnet/minecraft/class_1297;
// 54: astore 15
// 56: istore 14
// 58: aload 4
// 5a: iload 14
// 5c: ifeq e5
// 5f: ifnull d5
// 62: goto 70
// 65: ldc2_w 6493606379864602916
// 68: lload 5
// 6a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f: athrow
// 70: getstatic su/catlean/um.E Lsu/catlean/um;
// 73: lload 12
// 75: invokevirtual su/catlean/um.H (J)Lsu/catlean/l8;
// 78: getstatic su/catlean/l8.FOV Lsu/catlean/l8;
// 7b: if_acmpeq d5
// 7e: goto 8c
// 81: ldc2_w 6493606379864602916
// 84: lload 5
// 86: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b: athrow
// 8c: aload 15
// 8e: iload 14
// 90: ifeq e5
// 93: goto a1
// 96: ldc2_w 6493606379864602916
// 99: lload 5
// 9b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: athrow
// a1: iload 3
// a2: ifle d7
// a5: instanceof net/minecraft/class_1676
// a8: ifne d5
// ab: goto b9
// ae: ldc2_w 6493606379864602916
// b1: lload 5
// b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b8: athrow
// b9: aload 0
// ba: aload 4
// bc: lload 7
// be: iload 9
// c0: i2b
// c1: invokespecial su/catlean/sx.r (Lnet/minecraft/class_1297;JB)Z
// c4: ifeq e6
// c7: goto d5
// ca: ldc2_w 6493606379864602916
// cd: lload 5
// cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d4: athrow
// d5: aload 15
// d7: goto e5
// da: ldc2_w 6493606379864602916
// dd: lload 5
// df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e4: athrow
// e5: areturn
// e6: aload 4
// e8: areturn
}

private final class_1297 R(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sx.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 35083329625328
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 24120240412156
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 129403197313304
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 125905546039893
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 39645138892007
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 63076392354867
// 02d: lxor
// 02e: dup2
// 02f: bipush 8
// 031: lushr
// 032: lstore 13
// 034: dup2
// 035: bipush 56
// 037: lshl
// 038: bipush 56
// 03a: lushr
// 03b: l2i
// 03c: istore 15
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 50353496908674
// 043: lxor
// 044: lstore 16
// 046: dup2
// 047: ldc2_w 41891303688768
// 04a: lxor
// 04b: lstore 18
// 04d: pop2
// 04e: new java/util/ArrayList
// 051: dup
// 052: invokespecial java/util/ArrayList.<init> ()V
// 055: checkcast java/util/List
// 058: astore 21
// 05a: ldc2_w 6378472454437941363
// 05d: lload 1
// 05e: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 063: lload 11
// 065: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 068: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
// 06b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 070: astore 22
// 072: istore 20
// 074: aload 22
// 076: invokeinterface java/util/Iterator.hasNext ()Z 1
// 07b: ifeq 1e6
// 07e: aload 22
// 080: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 085: dup
// 086: sipush 25047
// 089: ldc2_w 4540274803222744072
// 08c: lload 1
// 08d: lxor
// 08e: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/sx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 096: checkcast net/minecraft/class_1297
// 099: astore 23
// 09b: aload 23
// 09d: instanceof net/minecraft/class_1678
// 0a0: iload 20
// 0a2: lload 1
// 0a3: lconst_0
// 0a4: lcmp
// 0a5: ifle 0ad
// 0a8: ifne 1fc
// 0ab: iload 20
// 0ad: lload 1
// 0ae: lconst_0
// 0af: lcmp
// 0b0: iflt 117
// 0b3: ifne 115
// 0b6: goto 0c3
// 0b9: ldc2_w 6384945953098775458
// 0bc: lload 1
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: lload 1
// 0c4: lconst_0
// 0c5: lcmp
// 0c6: ifle 108
// 0c9: ifne 100
// 0cc: goto 0d9
// 0cf: ldc2_w 6384945953098775458
// 0d2: lload 1
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 23
// 0db: instanceof net/minecraft/class_1674
// 0de: iload 20
// 0e0: ifne 19c
// 0e3: goto 0f0
// 0e6: ldc2_w 6384945953098775458
// 0e9: lload 1
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: ifeq 191
// 0f3: goto 100
// 0f6: ldc2_w 6384945953098775458
// 0f9: lload 1
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: aload 23
// 102: checkcast net/minecraft/class_1676
// 105: invokevirtual net/minecraft/class_1676.method_5805 ()Z
// 108: goto 115
// 10b: ldc2_w 6384945953098775458
// 10e: lload 1
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: iload 20
// 117: ifne 19c
// 11a: ifeq 191
// 11d: goto 12a
// 120: ldc2_w 6384945953098775458
// 123: lload 1
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: aload 0
// 12b: lload 7
// 12d: aload 23
// 12f: invokespecial su/catlean/sx.e (JLnet/minecraft/class_1297;)Z
// 132: iload 20
// 134: ifne 19c
// 137: goto 144
// 13a: ldc2_w 6384945953098775458
// 13d: lload 1
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: ifeq 191
// 147: goto 154
// 14a: ldc2_w 6384945953098775458
// 14d: lload 1
// 14e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 153: athrow
// 154: getstatic su/catlean/um.E Lsu/catlean/um;
// 157: lload 5
// 159: invokevirtual su/catlean/um.a (J)Z
// 15c: iload 20
// 15e: lload 1
// 15f: lconst_0
// 160: lcmp
// 161: iflt 19e
// 164: ifne 19c
// 167: goto 174
// 16a: ldc2_w 6384945953098775458
// 16d: lload 1
// 16e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: athrow
// 174: ifeq 191
// 177: goto 184
// 17a: ldc2_w 6384945953098775458
// 17d: lload 1
// 17e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: athrow
// 184: aload 23
// 186: areturn
// 187: ldc2_w 6384945953098775458
// 18a: lload 1
// 18b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: athrow
// 191: aload 0
// 192: aload 23
// 194: lload 13
// 196: iload 15
// 198: i2b
// 199: invokespecial su/catlean/sx.r (Lnet/minecraft/class_1297;JB)Z
// 19c: iload 20
// 19e: lload 1
// 19f: lconst_0
// 1a0: lcmp
// 1a1: ifle 1c4
// 1a4: ifne 1bc
// 1a7: ifne 074
// 1aa: goto 1b7
// 1ad: ldc2_w 6384945953098775458
// 1b0: lload 1
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: aload 23
// 1b9: instanceof net/minecraft/class_1309
// 1bc: lload 1
// 1bd: lconst_0
// 1be: lcmp
// 1bf: iflt 1e3
// 1c2: iload 20
// 1c4: ifne 1e0
// 1c7: ifeq 074
// 1ca: goto 1d7
// 1cd: ldc2_w 6384945953098775458
// 1d0: lload 1
// 1d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d6: athrow
// 1d7: aload 21
// 1d9: aload 23
// 1db: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 1e0: pop
// 1e1: iload 20
// 1e3: ifeq 074
// 1e6: getstatic su/catlean/um.E Lsu/catlean/um;
// 1e9: lload 16
// 1eb: invokevirtual su/catlean/um.H (J)Lsu/catlean/l8;
// 1ee: getstatic su/catlean/o5.i [I
// 1f1: swap
// 1f2: lload 1
// 1f3: lconst_0
// 1f4: lcmp
// 1f5: ifle 086
// 1f8: invokevirtual su/catlean/l8.ordinal ()I
// 1fb: iaload
// 1fc: tableswitch 683 1 3 28 255 468
// 218: aload 21
// 21a: checkcast java/lang/Iterable
// 21d: astore 24
// 21f: bipush 0
// 220: istore 25
// 222: aload 24
// 224: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 229: astore 26
// 22b: aload 26
// 22d: iload 20
// 22f: ifne 25c
// 232: invokeinterface java/util/Iterator.hasNext ()Z 1
// 237: ifne 255
// 23a: goto 247
// 23d: ldc2_w 6384945953098775458
// 240: lload 1
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: aconst_null
// 248: goto 2f5
// 24b: ldc2_w 6384945953098775458
// 24e: lload 1
// 24f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 254: athrow
// 255: aload 26
// 257: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 25c: astore 27
// 25e: aload 26
// 260: iload 20
// 262: ifne 28b
// 265: invokeinterface java/util/Iterator.hasNext ()Z 1
// 26a: ifne 289
// 26d: goto 27a
// 270: ldc2_w 6384945953098775458
// 273: lload 1
// 274: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: athrow
// 27a: aload 27
// 27c: goto 2f5
// 27f: ldc2_w 6384945953098775458
// 282: lload 1
// 283: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 288: athrow
// 289: aload 27
// 28b: checkcast net/minecraft/class_1309
// 28e: astore 28
// 290: bipush 0
// 291: istore 30
// 293: lload 18
// 295: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 298: lload 3
// 299: aload 28
// 29b: checkcast net/minecraft/class_1297
// 29e: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 2a1: invokevirtual net/minecraft/class_746.method_5707 (Lnet/minecraft/class_243;)D
// 2a4: dstore 28
// 2a6: aload 26
// 2a8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2ad: astore 30
// 2af: aload 30
// 2b1: checkcast net/minecraft/class_1309
// 2b4: astore 31
// 2b6: bipush 0
// 2b7: istore 33
// 2b9: lload 18
// 2bb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2be: lload 3
// 2bf: aload 31
// 2c1: checkcast net/minecraft/class_1297
// 2c4: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 2c7: invokevirtual net/minecraft/class_746.method_5707 (Lnet/minecraft/class_243;)D
// 2ca: dstore 31
// 2cc: dload 28
// 2ce: dload 31
// 2d0: invokestatic java/lang/Double.compare (DD)I
// 2d3: ifle 2de
// 2d6: aload 30
// 2d8: astore 27
// 2da: dload 31
// 2dc: dstore 28
// 2de: aload 26
// 2e0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2e5: ifne 2a6
// 2e8: iload 20
// 2ea: lload 1
// 2eb: lconst_0
// 2ec: lcmp
// 2ed: iflt 2e5
// 2f0: ifne 2da
// 2f3: aload 27
// 2f5: checkcast net/minecraft/class_1297
// 2f8: goto 4af
// 2fb: aload 21
// 2fd: checkcast java/lang/Iterable
// 300: astore 24
// 302: bipush 0
// 303: istore 25
// 305: aload 24
// 307: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 30c: astore 26
// 30e: aload 26
// 310: iload 20
// 312: ifne 33f
// 315: invokeinterface java/util/Iterator.hasNext ()Z 1
// 31a: ifne 338
// 31d: goto 32a
// 320: ldc2_w 6384945953098775458
// 323: lload 1
// 324: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: athrow
// 32a: aconst_null
// 32b: goto 3ca
// 32e: ldc2_w 6384945953098775458
// 331: lload 1
// 332: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 337: athrow
// 338: aload 26
// 33a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 33f: astore 27
// 341: aload 26
// 343: iload 20
// 345: ifne 36e
// 348: invokeinterface java/util/Iterator.hasNext ()Z 1
// 34d: ifne 36c
// 350: goto 35d
// 353: ldc2_w 6384945953098775458
// 356: lload 1
// 357: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35c: athrow
// 35d: aload 27
// 35f: goto 3ca
// 362: ldc2_w 6384945953098775458
// 365: lload 1
// 366: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36b: athrow
// 36c: aload 27
// 36e: checkcast net/minecraft/class_1309
// 371: astore 28
// 373: bipush 0
// 374: istore 30
// 376: getstatic su/catlean/sx.M Lsu/catlean/sx;
// 379: lload 9
// 37b: aload 28
// 37d: invokespecial su/catlean/sx.i (JLnet/minecraft/class_1309;)F
// 380: fstore 28
// 382: aload 26
// 384: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 389: astore 30
// 38b: aload 30
// 38d: checkcast net/minecraft/class_1309
// 390: astore 31
// 392: bipush 0
// 393: istore 33
// 395: getstatic su/catlean/sx.M Lsu/catlean/sx;
// 398: lload 9
// 39a: aload 31
// 39c: invokespecial su/catlean/sx.i (JLnet/minecraft/class_1309;)F
// 39f: fstore 31
// 3a1: fload 28
// 3a3: fload 31
// 3a5: invokestatic java/lang/Float.compare (FF)I
// 3a8: ifle 3b3
// 3ab: aload 30
// 3ad: astore 27
// 3af: fload 31
// 3b1: fstore 28
// 3b3: aload 26
// 3b5: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3ba: ifne 382
// 3bd: iload 20
// 3bf: lload 1
// 3c0: lconst_0
// 3c1: lcmp
// 3c2: iflt 3ba
// 3c5: ifne 3af
// 3c8: aload 27
// 3ca: checkcast net/minecraft/class_1297
// 3cd: goto 4af
// 3d0: aload 21
// 3d2: checkcast java/lang/Iterable
// 3d5: astore 24
// 3d7: bipush 0
// 3d8: istore 25
// 3da: aload 24
// 3dc: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 3e1: astore 26
// 3e3: aload 26
// 3e5: iload 20
// 3e7: ifne 414
// 3ea: invokeinterface java/util/Iterator.hasNext ()Z 1
// 3ef: ifne 40d
// 3f2: goto 3ff
// 3f5: ldc2_w 6384945953098775458
// 3f8: lload 1
// 3f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fe: athrow
// 3ff: aconst_null
// 400: goto 4a1
// 403: ldc2_w 6384945953098775458
// 406: lload 1
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: aload 26
// 40f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 414: astore 27
// 416: aload 26
// 418: iload 20
// 41a: ifne 443
// 41d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 422: ifne 441
// 425: goto 432
// 428: ldc2_w 6384945953098775458
// 42b: lload 1
// 42c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 431: athrow
// 432: aload 27
// 434: goto 4a1
// 437: ldc2_w 6384945953098775458
// 43a: lload 1
// 43b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 440: athrow
// 441: aload 27
// 443: checkcast net/minecraft/class_1309
// 446: astore 28
// 448: bipush 0
// 449: istore 30
// 44b: aload 28
// 44d: invokevirtual net/minecraft/class_1309.method_6032 ()F
// 450: aload 28
// 452: invokevirtual net/minecraft/class_1309.method_6067 ()F
// 455: fadd
// 456: fstore 28
// 458: aload 26
// 45a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 45f: astore 30
// 461: aload 30
// 463: checkcast net/minecraft/class_1309
// 466: astore 31
// 468: bipush 0
// 469: istore 33
// 46b: aload 31
// 46d: invokevirtual net/minecraft/class_1309.method_6032 ()F
// 470: aload 31
// 472: invokevirtual net/minecraft/class_1309.method_6067 ()F
// 475: fadd
// 476: fstore 31
// 478: fload 28
// 47a: fload 31
// 47c: invokestatic java/lang/Float.compare (FF)I
// 47f: ifle 48a
// 482: aload 30
// 484: astore 27
// 486: fload 31
// 488: fstore 28
// 48a: aload 26
// 48c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 491: ifne 458
// 494: iload 20
// 496: lload 1
// 497: lconst_0
// 498: lcmp
// 499: iflt 491
// 49c: ifne 486
// 49f: aload 27
// 4a1: checkcast net/minecraft/class_1297
// 4a4: goto 4af
// 4a7: new kotlin/NoWhenBranchMatchedException
// 4aa: dup
// 4ab: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 4ae: athrow
// 4af: areturn
}

private final boolean r(class_1297 param1, long param2, byte param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: bipush 8
// 003: lshl
// 004: iload 4
// 006: i2l
// 007: bipush 56
// 009: lshl
// 00a: bipush 56
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/sx.a J
// 011: lxor
// 012: lstore 5
// 014: lload 5
// 016: dup2
// 017: ldc2_w 97765096264255
// 01a: lxor
// 01b: lstore 7
// 01d: dup2
// 01e: ldc2_w 118460536309596
// 021: lxor
// 022: dup2
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 9
// 029: dup2
// 02a: bipush 16
// 02c: lshl
// 02d: bipush 16
// 02f: lushr
// 030: lstore 10
// 032: pop2
// 033: dup2
// 034: ldc2_w 110449231477764
// 037: lxor
// 038: lstore 12
// 03a: dup2
// 03b: ldc2_w 84062089693778
// 03e: lxor
// 03f: lstore 14
// 041: dup2
// 042: ldc2_w 105946993744429
// 045: lxor
// 046: lstore 16
// 048: dup2
// 049: ldc2_w 87100473749042
// 04c: lxor
// 04d: lstore 18
// 04f: dup2
// 050: ldc2_w 106770084480143
// 053: lxor
// 054: lstore 20
// 056: dup2
// 057: ldc2_w 82980499424120
// 05a: lxor
// 05b: lstore 22
// 05d: dup2
// 05e: ldc2_w 49349967406155
// 061: lxor
// 062: lstore 24
// 064: dup2
// 065: ldc2_w 55747788939223
// 068: lxor
// 069: lstore 26
// 06b: dup2
// 06c: ldc2_w 34313024002191
// 06f: lxor
// 070: lstore 28
// 072: dup2
// 073: ldc2_w 130527435029395
// 076: lxor
// 077: lstore 30
// 079: dup2
// 07a: ldc2_w 69250937066043
// 07d: lxor
// 07e: lstore 32
// 080: pop2
// 081: ldc2_w -7616811938230501700
// 084: lload 5
// 086: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: istore 34
// 08d: aload 0
// 08e: aload 1
// 08f: lload 18
// 091: invokespecial su/catlean/sx.z (Lnet/minecraft/class_1297;J)Z
// 094: iload 34
// 096: ifne 0bb
// 099: ifeq 0b7
// 09c: goto 0aa
// 09f: ldc2_w -7614279095564176019
// 0a2: lload 5
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: bipush 0
// 0ab: ireturn
// 0ac: ldc2_w -7614279095564176019
// 0af: lload 5
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: aload 1
// 0b8: instanceof net/minecraft/class_1309
// 0bb: iload 34
// 0bd: lload 2
// 0be: lconst_0
// 0bf: lcmp
// 0c0: iflt 0ed
// 0c3: ifne 0eb
// 0c6: ifne 0e4
// 0c9: goto 0d7
// 0cc: ldc2_w -7614279095564176019
// 0cf: lload 5
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: bipush 1
// 0d8: ireturn
// 0d9: ldc2_w -7614279095564176019
// 0dc: lload 5
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: aload 1
// 0e5: checkcast net/minecraft/class_1309
// 0e8: invokevirtual net/minecraft/class_1309.method_29504 ()Z
// 0eb: iload 34
// 0ed: ifne 132
// 0f0: ifne 131
// 0f3: goto 101
// 0f6: ldc2_w -7614279095564176019
// 0f9: lload 5
// 0fb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 100: athrow
// 101: aload 1
// 102: checkcast net/minecraft/class_1309
// 105: invokevirtual net/minecraft/class_1309.method_5805 ()Z
// 108: iload 34
// 10a: iload 4
// 10c: iflt 139
// 10f: ifne 137
// 112: goto 120
// 115: ldc2_w -7614279095564176019
// 118: lload 5
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: ifne 133
// 123: goto 131
// 126: ldc2_w -7614279095564176019
// 129: lload 5
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: bipush 1
// 132: ireturn
// 133: aload 1
// 134: instanceof net/minecraft/class_1531
// 137: iload 34
// 139: iload 4
// 13b: ifle 165
// 13e: ifne 163
// 141: ifeq 15f
// 144: goto 152
// 147: ldc2_w -7614279095564176019
// 14a: lload 5
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: bipush 1
// 153: ireturn
// 154: ldc2_w -7614279095564176019
// 157: lload 5
// 159: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15e: athrow
// 15f: aload 1
// 160: instanceof net/minecraft/class_1451
// 163: iload 34
// 165: iload 4
// 167: iflt 191
// 16a: ifne 18f
// 16d: ifeq 18b
// 170: goto 17e
// 173: ldc2_w -7614279095564176019
// 176: lload 5
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: bipush 1
// 17f: ireturn
// 180: ldc2_w -7614279095564176019
// 183: lload 5
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: aload 1
// 18c: getfield net/minecraft/class_1297.field_6012 I
// 18f: iload 34
// 191: ifne 1a6
// 194: ifge 1a7
// 197: goto 1a5
// 19a: ldc2_w -7614279095564176019
// 19d: lload 5
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: bipush 1
// 1a6: ireturn
// 1a7: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 1aa: lload 7
// 1ac: aload 1
// 1ad: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1b0: getstatic su/catlean/um.E Lsu/catlean/um;
// 1b3: iload 34
// 1b5: ifne 1ee
// 1b8: lload 14
// 1ba: invokevirtual su/catlean/um.e (J)I
// 1bd: bipush 1
// 1be: if_icmpne 1eb
// 1c1: goto 1cf
// 1c4: ldc2_w -7614279095564176019
// 1c7: lload 5
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: sipush 32202
// 1d2: ldc2_w 7644860556738955630
// 1d5: lload 5
// 1d7: lxor
// 1d8: invokedynamic s (IJ)I bsm=su/catlean/sx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: goto 1f3
// 1e0: ldc2_w -7614279095564176019
// 1e3: lload 5
// 1e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ea: athrow
// 1eb: getstatic su/catlean/um.E Lsu/catlean/um;
// 1ee: lload 14
// 1f0: invokevirtual su/catlean/um.e (J)I
// 1f3: lload 30
// 1f5: dup2_x2
// 1f6: pop2
// 1f7: invokevirtual su/catlean/dm.v (JLnet/minecraft/class_243;I)Z
// 1fa: iload 34
// 1fc: lload 2
// 1fd: lconst_0
// 1fe: lcmp
// 1ff: ifle 22c
// 202: ifne 22a
// 205: ifne 223
// 208: goto 216
// 20b: ldc2_w -7614279095564176019
// 20e: lload 5
// 210: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 215: athrow
// 216: bipush 1
// 217: ireturn
// 218: ldc2_w -7614279095564176019
// 21b: lload 5
// 21d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 222: athrow
// 223: aload 0
// 224: lload 32
// 226: aload 1
// 227: invokespecial su/catlean/sx.f (JLnet/minecraft/class_1297;)Z
// 22a: iload 34
// 22c: iload 4
// 22e: iflt 258
// 231: ifne 256
// 234: ifeq 252
// 237: goto 245
// 23a: ldc2_w -7614279095564176019
// 23d: lload 5
// 23f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 244: athrow
// 245: bipush 1
// 246: ireturn
// 247: ldc2_w -7614279095564176019
// 24a: lload 5
// 24c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 251: athrow
// 252: aload 1
// 253: instanceof net/minecraft/class_1657
// 256: iload 34
// 258: ifne 488
// 25b: ifeq 481
// 25e: goto 26c
// 261: ldc2_w -7614279095564176019
// 264: lload 5
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: aload 1
// 26d: lload 20
// 26f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 272: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 275: iload 34
// 277: ifne 2cc
// 27a: goto 288
// 27d: ldc2_w -7614279095564176019
// 280: lload 5
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: ifne 2cb
// 28b: goto 299
// 28e: ldc2_w -7614279095564176019
// 291: lload 5
// 293: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 298: athrow
// 299: aload 1
// 29a: checkcast net/minecraft/class_1657
// 29d: lload 16
// 29f: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 2a2: iload 34
// 2a4: iload 4
// 2a6: ifle 2d6
// 2a9: ifne 2d4
// 2ac: goto 2ba
// 2af: ldc2_w -7614279095564176019
// 2b2: lload 5
// 2b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: athrow
// 2ba: ifeq 2cd
// 2bd: goto 2cb
// 2c0: ldc2_w -7614279095564176019
// 2c3: lload 5
// 2c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ca: athrow
// 2cb: bipush 1
// 2cc: ireturn
// 2cd: aload 1
// 2ce: checkcast net/minecraft/class_1657
// 2d1: invokevirtual net/minecraft/class_1657.method_68878 ()Z
// 2d4: iload 34
// 2d6: ifne 32f
// 2d9: ifeq 328
// 2dc: goto 2ea
// 2df: ldc2_w -7614279095564176019
// 2e2: lload 5
// 2e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e9: athrow
// 2ea: getstatic su/catlean/um.E Lsu/catlean/um;
// 2ed: lload 22
// 2ef: invokevirtual su/catlean/um.Bo (J)Z
// 2f2: iload 34
// 2f4: iload 4
// 2f6: ifle 331
// 2f9: ifne 32f
// 2fc: goto 30a
// 2ff: ldc2_w -7614279095564176019
// 302: lload 5
// 304: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 309: athrow
// 30a: ifeq 328
// 30d: goto 31b
// 310: ldc2_w -7614279095564176019
// 313: lload 5
// 315: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31a: athrow
// 31b: bipush 1
// 31c: ireturn
// 31d: ldc2_w -7614279095564176019
// 320: lload 5
// 322: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 327: athrow
// 328: aload 1
// 329: checkcast net/minecraft/class_1657
// 32c: invokevirtual net/minecraft/class_1657.method_6096 ()I
// 32f: iload 34
// 331: ifne 38b
// 334: ifne 384
// 337: goto 345
// 33a: ldc2_w -7614279095564176019
// 33d: lload 5
// 33f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 344: athrow
// 345: getstatic su/catlean/um.E Lsu/catlean/um;
// 348: lload 28
// 34a: invokevirtual su/catlean/um.r (J)Z
// 34d: iload 34
// 34f: lload 2
// 350: lconst_0
// 351: lcmp
// 352: ifle 38d
// 355: ifne 38b
// 358: goto 366
// 35b: ldc2_w -7614279095564176019
// 35e: lload 5
// 360: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 365: athrow
// 366: ifeq 384
// 369: goto 377
// 36c: ldc2_w -7614279095564176019
// 36f: lload 5
// 371: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 376: athrow
// 377: bipush 1
// 378: ireturn
// 379: ldc2_w -7614279095564176019
// 37c: lload 5
// 37e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 383: athrow
// 384: aload 1
// 385: checkcast net/minecraft/class_1657
// 388: invokevirtual net/minecraft/class_1657.method_5767 ()Z
// 38b: iload 34
// 38d: ifne 3e6
// 390: ifeq 3df
// 393: goto 3a1
// 396: ldc2_w -7614279095564176019
// 399: lload 5
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: getstatic su/catlean/um.E Lsu/catlean/um;
// 3a4: lload 12
// 3a6: invokevirtual su/catlean/um.B0 (J)Z
// 3a9: iload 34
// 3ab: iload 4
// 3ad: ifle 3e8
// 3b0: ifne 3e6
// 3b3: goto 3c1
// 3b6: ldc2_w -7614279095564176019
// 3b9: lload 5
// 3bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c0: athrow
// 3c1: ifeq 3df
// 3c4: goto 3d2
// 3c7: ldc2_w -7614279095564176019
// 3ca: lload 5
// 3cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d1: athrow
// 3d2: bipush 1
// 3d3: ireturn
// 3d4: ldc2_w -7614279095564176019
// 3d7: lload 5
// 3d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3de: athrow
// 3df: aload 1
// 3e0: checkcast net/minecraft/class_1657
// 3e3: invokevirtual net/minecraft/class_1657.method_22861 ()I
// 3e6: iload 34
// 3e8: iload 4
// 3ea: ifle 3f8
// 3ed: ifne 488
// 3f0: lload 20
// 3f2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3f5: invokevirtual net/minecraft/class_746.method_22861 ()I
// 3f8: if_icmpne 481
// 3fb: goto 409
// 3fe: ldc2_w -7614279095564176019
// 401: lload 5
// 403: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 408: athrow
// 409: getstatic su/catlean/um.E Lsu/catlean/um;
// 40c: lload 24
// 40e: invokevirtual su/catlean/um.K (J)Z
// 411: iload 34
// 413: ifne 488
// 416: goto 424
// 419: ldc2_w -7614279095564176019
// 41c: lload 5
// 41e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 423: athrow
// 424: ifeq 481
// 427: goto 435
// 42a: ldc2_w -7614279095564176019
// 42d: lload 5
// 42f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 434: athrow
// 435: lload 20
// 437: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 43a: invokevirtual net/minecraft/class_746.method_22861 ()I
// 43d: iload 34
// 43f: iload 4
// 441: iflt 48a
// 444: ifne 488
// 447: goto 455
// 44a: ldc2_w -7614279095564176019
// 44d: lload 5
// 44f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 454: athrow
// 455: sipush 14674
// 458: ldc2_w 1402068653985615351
// 45b: lload 5
// 45d: lxor
// 45e: invokedynamic s (IJ)I bsm=su/catlean/sx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 463: if_icmpeq 481
// 466: goto 474
// 469: ldc2_w -7614279095564176019
// 46c: lload 5
// 46e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 473: athrow
// 474: bipush 1
// 475: ireturn
// 476: ldc2_w -7614279095564176019
// 479: lload 5
// 47b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 480: athrow
// 481: aload 0
// 482: lload 26
// 484: aload 1
// 485: invokespecial su/catlean/sx.e (JLnet/minecraft/class_1297;)Z
// 488: iload 34
// 48a: ifne 4fc
// 48d: ifeq 4fb
// 490: goto 49e
// 493: ldc2_w -7614279095564176019
// 496: lload 5
// 498: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49d: athrow
// 49e: aload 1
// 49f: invokevirtual net/minecraft/class_1297.method_16914 ()Z
// 4a2: iload 34
// 4a4: lload 2
// 4a5: lconst_0
// 4a6: lcmp
// 4a7: iflt 4e7
// 4aa: ifne 4e5
// 4ad: goto 4bb
// 4b0: ldc2_w -7614279095564176019
// 4b3: lload 5
// 4b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ba: athrow
// 4bb: ifeq 4ff
// 4be: goto 4cc
// 4c1: ldc2_w -7614279095564176019
// 4c4: lload 5
// 4c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4cb: athrow
// 4cc: getstatic su/catlean/um.E Lsu/catlean/um;
// 4cf: iload 9
// 4d1: i2s
// 4d2: lload 10
// 4d4: invokevirtual su/catlean/um.Bn (SJ)Z
// 4d7: goto 4e5
// 4da: ldc2_w -7614279095564176019
// 4dd: lload 5
// 4df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e4: athrow
// 4e5: iload 34
// 4e7: ifne 4fc
// 4ea: ifeq 4ff
// 4ed: goto 4fb
// 4f0: ldc2_w -7614279095564176019
// 4f3: lload 5
// 4f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fa: athrow
// 4fb: bipush 1
// 4fc: goto 500
// 4ff: bipush 0
// 500: ireturn
}

private final boolean z(class_1297 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sx.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 116006200522481
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 109428710146045
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 37138851484391
// 019: lxor
// 01a: dup2
// 01b: bipush 48
// 01d: lushr
// 01e: l2i
// 01f: istore 8
// 021: dup2
// 022: bipush 16
// 024: lshl
// 025: bipush 48
// 027: lushr
// 028: l2i
// 029: istore 9
// 02b: dup2
// 02c: bipush 32
// 02e: lshl
// 02f: bipush 32
// 031: lushr
// 032: l2i
// 033: istore 10
// 035: pop2
// 036: dup2
// 037: ldc2_w 91328457377406
// 03a: lxor
// 03b: lstore 11
// 03d: pop2
// 03e: ldc2_w -5582892822541182350
// 041: lload 2
// 042: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 047: istore 13
// 049: aload 1
// 04a: instanceof net/minecraft/class_1678
// 04d: iload 13
// 04f: ifne 0a2
// 052: ifne 08e
// 055: goto 062
// 058: ldc2_w -5576981454698786397
// 05b: lload 2
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: aload 1
// 063: instanceof net/minecraft/class_1674
// 066: iload 13
// 068: lload 2
// 069: lconst_0
// 06a: lcmp
// 06b: ifle 0a4
// 06e: ifne 0a2
// 071: goto 07e
// 074: ldc2_w -5576981454698786397
// 077: lload 2
// 078: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: athrow
// 07e: ifeq 131
// 081: goto 08e
// 084: ldc2_w -5576981454698786397
// 087: lload 2
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: aload 1
// 08f: checkcast net/minecraft/class_1676
// 092: invokevirtual net/minecraft/class_1676.method_5805 ()Z
// 095: goto 0a2
// 098: ldc2_w -5576981454698786397
// 09b: lload 2
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: iload 13
// 0a4: lload 2
// 0a5: lconst_0
// 0a6: lcmp
// 0a7: iflt 0ea
// 0aa: ifne 0e8
// 0ad: ifeq 131
// 0b0: goto 0bd
// 0b3: ldc2_w -5576981454698786397
// 0b6: lload 2
// 0b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: athrow
// 0bd: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0c0: lload 4
// 0c2: aload 1
// 0c3: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0c6: iload 8
// 0c8: i2s
// 0c9: swap
// 0ca: iload 9
// 0cc: i2c
// 0cd: swap
// 0ce: iload 10
// 0d0: swap
// 0d1: invokevirtual su/catlean/dm.z (SCILnet/minecraft/class_243;)F
// 0d4: aload 0
// 0d5: lload 11
// 0d7: invokespecial su/catlean/sx.l (J)F
// 0da: fcmpg
// 0db: goto 0e8
// 0de: ldc2_w -5576981454698786397
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: iload 13
// 0ea: lload 2
// 0eb: lconst_0
// 0ec: lcmp
// 0ed: iflt 11a
// 0f0: ifne 118
// 0f3: ifge 131
// 0f6: goto 103
// 0f9: ldc2_w -5576981454698786397
// 0fc: lload 2
// 0fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 102: athrow
// 103: getstatic su/catlean/um.E Lsu/catlean/um;
// 106: lload 6
// 108: invokevirtual su/catlean/um.a (J)Z
// 10b: goto 118
// 10e: ldc2_w -5576981454698786397
// 111: lload 2
// 112: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 117: athrow
// 118: iload 13
// 11a: ifne 12e
// 11d: ifeq 131
// 120: goto 12d
// 123: ldc2_w -5576981454698786397
// 126: lload 2
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: bipush 1
// 12e: goto 132
// 131: bipush 0
// 132: ireturn
}

private final boolean f(long param1, class_1297 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sx.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 102513797301644
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 92651532487304
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 132954463733765
// 019: lxor
// 01a: dup2
// 01b: bipush 48
// 01d: lushr
// 01e: l2i
// 01f: istore 8
// 021: dup2
// 022: bipush 16
// 024: lshl
// 025: bipush 32
// 027: lushr
// 028: l2i
// 029: istore 9
// 02b: dup2
// 02c: bipush 48
// 02e: lshl
// 02f: bipush 48
// 031: lushr
// 032: l2i
// 033: istore 10
// 035: pop2
// 036: dup2
// 037: ldc2_w 74029414627546
// 03a: lxor
// 03b: lstore 11
// 03d: dup2
// 03e: ldc2_w 87660664491162
// 041: lxor
// 042: lstore 13
// 044: dup2
// 045: ldc2_w 60441646860938
// 048: lxor
// 049: dup2
// 04a: bipush 32
// 04c: lushr
// 04d: l2i
// 04e: istore 15
// 050: dup2
// 051: bipush 32
// 053: lshl
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 16
// 05a: dup2
// 05b: bipush 48
// 05d: lshl
// 05e: bipush 48
// 060: lushr
// 061: l2i
// 062: istore 17
// 064: pop2
// 065: dup2
// 066: ldc2_w 139704017201895
// 069: lxor
// 06a: dup2
// 06b: bipush 56
// 06d: lushr
// 06e: l2i
// 06f: istore 18
// 071: dup2
// 072: bipush 8
// 074: lshl
// 075: bipush 8
// 077: lushr
// 078: lstore 19
// 07a: pop2
// 07b: dup2
// 07c: ldc2_w 120612718231242
// 07f: lxor
// 080: lstore 21
// 082: pop2
// 083: ldc2_w -8174907148865116549
// 086: lload 1
// 087: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: istore 23
// 08e: aload 3
// 08f: instanceof net/minecraft/class_1588
// 092: iload 23
// 094: ifne 0f1
// 097: ifeq 0e8
// 09a: goto 0a7
// 09d: ldc2_w -8172936945950659158
// 0a0: lload 1
// 0a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: athrow
// 0a7: getstatic su/catlean/um.E Lsu/catlean/um;
// 0aa: iload 15
// 0ac: iload 16
// 0ae: iload 17
// 0b0: i2s
// 0b1: invokevirtual su/catlean/um.t (IIS)Z
// 0b4: iload 23
// 0b6: lload 1
// 0b7: lconst_0
// 0b8: lcmp
// 0b9: iflt 0f3
// 0bc: ifne 0f1
// 0bf: goto 0cc
// 0c2: ldc2_w -8172936945950659158
// 0c5: lload 1
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: ifne 0e8
// 0cf: goto 0dc
// 0d2: ldc2_w -8172936945950659158
// 0d5: lload 1
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 1
// 0dd: ireturn
// 0de: ldc2_w -8172936945950659158
// 0e1: lload 1
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: nop
// 0e9: getstatic su/catlean/um.E Lsu/catlean/um;
// 0ec: lload 13
// 0ee: invokevirtual su/catlean/um.Y (J)Z
// 0f1: iload 23
// 0f3: ifne 215
// 0f6: ifeq 211
// 0f9: goto 106
// 0fc: ldc2_w -8172936945950659158
// 0ff: lload 1
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: aload 3
// 107: instanceof net/minecraft/class_1560
// 10a: iload 23
// 10c: ifne 16b
// 10f: goto 11c
// 112: ldc2_w -8172936945950659158
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: ifeq 167
// 11f: goto 12c
// 122: ldc2_w -8172936945950659158
// 125: lload 1
// 126: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: athrow
// 12c: aload 3
// 12d: checkcast net/minecraft/class_1560
// 130: invokevirtual net/minecraft/class_1560.method_7028 ()Z
// 133: iload 23
// 135: lload 1
// 136: lconst_0
// 137: lcmp
// 138: iflt 16d
// 13b: ifne 16b
// 13e: goto 14b
// 141: ldc2_w -8172936945950659158
// 144: lload 1
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: ifne 167
// 14e: goto 15b
// 151: ldc2_w -8172936945950659158
// 154: lload 1
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: bipush 1
// 15c: ireturn
// 15d: ldc2_w -8172936945950659158
// 160: lload 1
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: aload 3
// 168: instanceof net/minecraft/class_1590
// 16b: iload 23
// 16d: ifne 1bf
// 170: ifeq 1bb
// 173: goto 180
// 176: ldc2_w -8172936945950659158
// 179: lload 1
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: aload 3
// 181: checkcast net/minecraft/class_1590
// 184: invokevirtual net/minecraft/class_1590.method_6510 ()Z
// 187: iload 23
// 189: lload 1
// 18a: lconst_0
// 18b: lcmp
// 18c: ifle 1c1
// 18f: ifne 1bf
// 192: goto 19f
// 195: ldc2_w -8172936945950659158
// 198: lload 1
// 199: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19e: athrow
// 19f: ifne 1bb
// 1a2: goto 1af
// 1a5: ldc2_w -8172936945950659158
// 1a8: lload 1
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: bipush 1
// 1b0: ireturn
// 1b1: ldc2_w -8172936945950659158
// 1b4: lload 1
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: aload 3
// 1bc: instanceof net/minecraft/class_1493
// 1bf: iload 23
// 1c1: ifne 215
// 1c4: ifeq 211
// 1c7: goto 1d4
// 1ca: ldc2_w -8172936945950659158
// 1cd: lload 1
// 1ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: athrow
// 1d4: aload 3
// 1d5: checkcast net/minecraft/class_1493
// 1d8: invokevirtual net/minecraft/class_1493.method_6510 ()Z
// 1db: iload 23
// 1dd: lload 1
// 1de: lconst_0
// 1df: lcmp
// 1e0: ifle 217
// 1e3: ifne 215
// 1e6: goto 1f3
// 1e9: ldc2_w -8172936945950659158
// 1ec: lload 1
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: ifne 211
// 1f6: goto 203
// 1f9: ldc2_w -8172936945950659158
// 1fc: lload 1
// 1fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 202: athrow
// 203: bipush 1
// 204: ireturn
// 205: ldc2_w -8172936945950659158
// 208: lload 1
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: astore 24
// 211: aload 3
// 212: instanceof net/minecraft/class_1657
// 215: iload 23
// 217: ifne 270
// 21a: ifeq 26c
// 21d: goto 22a
// 220: ldc2_w -8172936945950659158
// 223: lload 1
// 224: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: athrow
// 22a: getstatic su/catlean/um.E Lsu/catlean/um;
// 22d: iload 8
// 22f: i2c
// 230: iload 9
// 232: iload 10
// 234: i2c
// 235: invokevirtual su/catlean/um.F (CIC)Z
// 238: iload 23
// 23a: lload 1
// 23b: lconst_0
// 23c: lcmp
// 23d: ifle 272
// 240: ifne 270
// 243: goto 250
// 246: ldc2_w -8172936945950659158
// 249: lload 1
// 24a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24f: athrow
// 250: ifne 26c
// 253: goto 260
// 256: ldc2_w -8172936945950659158
// 259: lload 1
// 25a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25f: athrow
// 260: bipush 1
// 261: ireturn
// 262: ldc2_w -8172936945950659158
// 265: lload 1
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: aload 3
// 26d: instanceof net/minecraft/class_1657
// 270: iload 23
// 272: ifne 2f4
// 275: ifeq 2f0
// 278: goto 285
// 27b: ldc2_w -8172936945950659158
// 27e: lload 1
// 27f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: athrow
// 285: getstatic su/catlean/um.E Lsu/catlean/um;
// 288: iload 18
// 28a: i2b
// 28b: lload 19
// 28d: invokevirtual su/catlean/um.s (BJ)Z
// 290: iload 23
// 292: ifne 2f4
// 295: goto 2a2
// 298: ldc2_w -8172936945950659158
// 29b: lload 1
// 29c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a1: athrow
// 2a2: ifeq 2f0
// 2a5: goto 2b2
// 2a8: ldc2_w -8172936945950659158
// 2ab: lload 1
// 2ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b1: athrow
// 2b2: aload 0
// 2b3: aload 3
// 2b4: checkcast net/minecraft/class_1657
// 2b7: lload 11
// 2b9: invokespecial su/catlean/sx.Q (Lnet/minecraft/class_1657;J)Z
// 2bc: iload 23
// 2be: lload 1
// 2bf: lconst_0
// 2c0: lcmp
// 2c1: ifle 2f6
// 2c4: ifne 2f4
// 2c7: goto 2d4
// 2ca: ldc2_w -8172936945950659158
// 2cd: lload 1
// 2ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d3: athrow
// 2d4: ifeq 2f0
// 2d7: goto 2e4
// 2da: ldc2_w -8172936945950659158
// 2dd: lload 1
// 2de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e3: athrow
// 2e4: bipush 1
// 2e5: ireturn
// 2e6: ldc2_w -8172936945950659158
// 2e9: lload 1
// 2ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ef: athrow
// 2f0: aload 3
// 2f1: instanceof net/minecraft/class_1646
// 2f4: iload 23
// 2f6: ifne 349
// 2f9: ifeq 345
// 2fc: goto 309
// 2ff: ldc2_w -8172936945950659158
// 302: lload 1
// 303: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 308: athrow
// 309: getstatic su/catlean/um.E Lsu/catlean/um;
// 30c: lload 4
// 30e: invokevirtual su/catlean/um.j (J)Z
// 311: iload 23
// 313: lload 1
// 314: lconst_0
// 315: lcmp
// 316: ifle 34b
// 319: ifne 349
// 31c: goto 329
// 31f: ldc2_w -8172936945950659158
// 322: lload 1
// 323: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 328: athrow
// 329: ifne 345
// 32c: goto 339
// 32f: ldc2_w -8172936945950659158
// 332: lload 1
// 333: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 338: athrow
// 339: bipush 1
// 33a: ireturn
// 33b: ldc2_w -8172936945950659158
// 33e: lload 1
// 33f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 344: athrow
// 345: aload 3
// 346: instanceof net/minecraft/class_1308
// 349: iload 23
// 34b: ifne 39e
// 34e: ifeq 39a
// 351: goto 35e
// 354: ldc2_w -8172936945950659158
// 357: lload 1
// 358: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35d: athrow
// 35e: getstatic su/catlean/um.E Lsu/catlean/um;
// 361: lload 21
// 363: invokevirtual su/catlean/um.B3 (J)Z
// 366: iload 23
// 368: lload 1
// 369: lconst_0
// 36a: lcmp
// 36b: ifle 3a0
// 36e: ifne 39e
// 371: goto 37e
// 374: ldc2_w -8172936945950659158
// 377: lload 1
// 378: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37d: athrow
// 37e: ifne 39a
// 381: goto 38e
// 384: ldc2_w -8172936945950659158
// 387: lload 1
// 388: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38d: athrow
// 38e: bipush 1
// 38f: ireturn
// 390: ldc2_w -8172936945950659158
// 393: lload 1
// 394: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 399: athrow
// 39a: aload 3
// 39b: instanceof net/minecraft/class_1429
// 39e: iload 23
// 3a0: lload 1
// 3a1: lconst_0
// 3a2: lcmp
// 3a3: ifle 3d0
// 3a6: ifne 3ce
// 3a9: ifeq 3e7
// 3ac: goto 3b9
// 3af: ldc2_w -8172936945950659158
// 3b2: lload 1
// 3b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b8: athrow
// 3b9: getstatic su/catlean/um.E Lsu/catlean/um;
// 3bc: lload 6
// 3be: invokevirtual su/catlean/um.x (J)Z
// 3c1: goto 3ce
// 3c4: ldc2_w -8172936945950659158
// 3c7: lload 1
// 3c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cd: athrow
// 3ce: iload 23
// 3d0: ifne 3e4
// 3d3: ifne 3e7
// 3d6: goto 3e3
// 3d9: ldc2_w -8172936945950659158
// 3dc: lload 1
// 3dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e2: athrow
// 3e3: bipush 1
// 3e4: goto 3e8
// 3e7: bipush 0
// 3e8: ireturn
}

private final boolean e(long var1, class_1297 var3) {
var1 = a ^ var1;
long var4 = var1 ^ 87574342969287L;
long var10001 = var1 ^ 101444777206530L;
int var6 = (int)((var1 ^ 101444777206530L) >>> 48);
int var7 = (int)((var1 ^ 101444777206530L) << 16 >>> 48);
int var8 = (int)(var10001 << 32 >>> 32);
long var9 = var1 ^ 51215130343323L;
long var11 = var1 ^ 139203518563091L;
boolean var13 = vm.a<"Å">(-8935843715249996294L, var1);

try {
float var16;
int var10000 = (var16 = dm.h.z((short)var6, (char)var7, var8, um.E.h(var11).g().B(var4, var3)) - this.l(var9)) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
if (!var13) {
return (boolean)var10000;
}

if (var10000 <= 0) {
return (boolean)1;
}
} catch (NoWhenBranchMatchedException var14) {
throw vm.a<"Å">(var14, -8971195273466814394L, var1);
}

return (boolean)0;
}

private final float i(long var1, class_1309 var3) {
var1 = a ^ var1;
long var4 = var1 ^ 47038185624297L;
return (float)Math.abs(
class_3532.method_15338(Math.toDegrees(Math.atan2(var3.method_23321() - zf.v(var4).method_23321(), var3.method_23317() - zf.v(var4).method_23317())) - 90.0)
- class_3532.method_15393(zf.v(var4).method_36454())
);
}

private final float l(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/sx.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 110636087143538
// 0b: lxor
// 0c: lstore 3
// 0d: dup2
// 0e: ldc2_w 81136468145298
// 11: lxor
// 12: lstore 5
// 14: dup2
// 15: ldc2_w 137700417727683
// 18: lxor
// 19: lstore 7
// 1b: dup2
// 1c: ldc2_w 33045248473501
// 1f: lxor
// 20: lstore 9
// 22: pop2
// 23: ldc2_w 4469745399881422576
// 26: lload 1
// 27: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c: getstatic su/catlean/um.E Lsu/catlean/um;
// 2f: lload 3
// 30: invokevirtual su/catlean/um.P (J)F
// 33: fconst_2
// 34: fadd
// 35: fstore 12
// 37: istore 11
// 39: lload 7
// 3b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3e: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 41: iload 11
// 43: ifne 6b
// 46: ifne 80
// 49: goto 56
// 4c: ldc2_w 4474530354567863585
// 4f: lload 1
// 50: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55: athrow
// 56: getstatic su/catlean/ul.b Lsu/catlean/ul;
// 59: lload 9
// 5b: invokevirtual su/catlean/ul.f (J)Z
// 5e: goto 6b
// 61: ldc2_w 4474530354567863585
// 64: lload 1
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: iload 11
// 6d: ifne a7
// 70: ifeq 87
// 73: goto 80
// 76: ldc2_w 4474530354567863585
// 79: lload 1
// 7a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f: athrow
// 80: fload 12
// 82: ldc 64.0
// 84: fadd
// 85: fstore 12
// 87: getstatic su/catlean/um.E Lsu/catlean/um;
// 8a: iload 11
// 8c: ifne ad
// 8f: lload 5
// 91: invokevirtual su/catlean/um.Q (J)Lsu/catlean/g9;
// 94: invokevirtual su/catlean/g9.g ()Lsu/catlean/tt;
// 97: invokevirtual su/catlean/tt.i ()Z
// 9a: goto a7
// 9d: ldc2_w 4474530354567863585
// a0: lload 1
// a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a6: athrow
// a7: ifne b3
// aa: getstatic su/catlean/um.E Lsu/catlean/um;
// ad: lload 3
// ae: invokevirtual su/catlean/um.P (J)F
// b1: fstore 12
// b3: fload 12
// b5: freturn
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void L(@NotNull Function0 action, long a) {
ax = a ^ ax;
long var4 = ax ^ 38797378271343L;
long var6 = ax ^ 6989929150430L;
long var8 = ax ^ 138168564874651L;
Intrinsics.checkNotNullParameter(action, a<"q">(12318, 2748491865555050239L ^ ax));
boolean var10000 = vm.a<"Å">(-7268624238731991769L, ax);
List var10001 = zf.z(var6).method_18456();
Intrinsics.checkNotNullExpressionValue(var10001, a<"q">(9257, 9132494355309300430L ^ ax));
Iterable var12 = var10001;
boolean var13 = false;
var var15 = new ArrayList();
boolean var16 = false;
Iterator var17 = var12.iterator();
boolean var10 = var10000;

label113:
while (var17.hasNext()) {
Object var18 = var17.next();

try {
var36 = var18;
} catch (NoWhenBranchMatchedException var21) {
throw vm.a<"Å">(var21, -7232006025865267045L, ax);
}

do {
label109: {
label108: {
try {
var10000 = var36 instanceof class_745;
if (ax <= 0L) {
break label109;
}

if (!var10) {
break label108;
}

if (!var10000) {
continue label113;
}
} catch (NoWhenBranchMatchedException var24) {
throw vm.a<"Å">(var24, -7232006025865267045L, ax);
}

var15.add(var18);
}

var10000 = var10;
}

if (var10000) {
continue label113;
}

var36 = new _g[4];
} while (ax < 0L);

vm.a<"Å">(var36, -7263867253086449396L, ax);
break;
}

List var11 = var15;
var12 = var11;
var13 = false;
Iterator var14 = var12.iterator();

label91: {
label90:
while (true) {
if (var14.hasNext()) {
var38 = var14;
if (ax < 0L) {
break label91;
}

Object var30 = var14.next();
class_745 var32 = (class_745)var30;
boolean var34 = false;

try {
M.q((class_1657)var32, var4);
} catch (NoWhenBranchMatchedException var20) {
throw vm.a<"Å">(var20, -7232006025865267045L, ax);
}

do {
try {
if (!var10) {
break label90;
}

if (var10) {
continue label90;
}
} catch (NoWhenBranchMatchedException var23) {
throw vm.a<"Å">(var23, -7232006025865267045L, ax);
}
} while (ax <= 0L);
}

action.invoke();
var12 = var11;
var13 = false;
break;
}

var38 = var12.iterator();
}

var14 = var38;

label72:
while (var14.hasNext()) {
Object var31 = var14.next();
class_745 var33 = (class_745)var31;
boolean var35 = false;

try {
M.S((class_1657)var33, var8);
} catch (NoWhenBranchMatchedException var19) {
throw vm.a<"Å">(var19, -7232006025865267045L, ax);
}

do {
try {
var10000 = var10;
if (ax >= 0L) {
if (!var10) {
return;
}

var10000 = var10;
}

if (var10000) {
continue label72;
}
} catch (NoWhenBranchMatchedException var22) {
throw vm.a<"Å">(var22, -7232006025865267045L, ax);
}
} while (ax <= 0L);

return;
}
}

private final void q(class_1657 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sx.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 124658400955562
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 106276776750426
// 012: lxor
// 013: lstore 6
// 015: dup2
// 016: ldc2_w 58377656640851
// 019: lxor
// 01a: lstore 8
// 01c: dup2
// 01d: ldc2_w 131502389553584
// 020: lxor
// 021: lstore 10
// 023: dup2
// 024: ldc2_w 64220541906612
// 027: lxor
// 028: lstore 12
// 02a: pop2
// 02b: ldc2_w -6218356378677749836
// 02e: lload 2
// 02f: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 034: istore 14
// 036: aload 0
// 037: lload 10
// 039: aload 1
// 03a: invokevirtual su/catlean/sx.i (JLnet/minecraft/class_1657;)Z
// 03d: iload 14
// 03f: ifeq 0e3
// 042: ifne 0b9
// 045: goto 052
// 048: ldc2_w -6255044942563522040
// 04b: lload 2
// 04c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: athrow
// 052: aload 1
// 053: sipush 3965
// 056: ldc2_w 7987746921628570380
// 059: lload 2
// 05a: lxor
// 05b: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/sx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 063: aload 1
// 064: checkcast su/catlean/interfaces/Resolvable
// 067: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 06a: invokeinterface su/catlean/interfaces/Resolvable.savePosition (Lnet/minecraft/class_243;)V 2
// 06f: getstatic su/catlean/um.E Lsu/catlean/um;
// 072: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 075: aload 1
// 076: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 079: ifeq 0b8
// 07c: goto 089
// 07f: ldc2_w -6255044942563522040
// 082: lload 2
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 08c: aload 1
// 08d: checkcast net/minecraft/class_1297
// 090: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
// 093: dup
// 094: sipush 7784
// 097: ldc2_w 5498903422274929183
// 09a: lload 2
// 09b: lxor
// 09c: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/sx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a4: lload 4
// 0a6: dup2_x1
// 0a7: pop2
// 0a8: invokevirtual su/catlean/uy.x (JLnet/minecraft/class_238;)V
// 0ab: goto 0b8
// 0ae: ldc2_w -6255044942563522040
// 0b1: lload 2
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: return
// 0b9: aload 1
// 0ba: sipush 9741
// 0bd: ldc2_w 1282941188833589883
// 0c0: lload 2
// 0c1: lxor
// 0c2: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/sx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0ca: aload 1
// 0cb: checkcast su/catlean/interfaces/Resolvable
// 0ce: lload 6
// 0d0: aload 1
// 0d1: checkcast net/minecraft/class_1297
// 0d4: invokestatic su/catlean/p4.K (JLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0d7: invokeinterface su/catlean/interfaces/Resolvable.savePosition (Lnet/minecraft/class_243;)V 2
// 0dc: aload 1
// 0dd: checkcast net/minecraft/class_1309
// 0e0: invokevirtual net/minecraft/class_1309.method_6128 ()Z
// 0e3: iload 14
// 0e5: lload 2
// 0e6: lconst_0
// 0e7: lcmp
// 0e8: iflt 11b
// 0eb: ifeq 113
// 0ee: ifeq 21c
// 0f1: goto 0fe
// 0f4: ldc2_w -6255044942563522040
// 0f7: lload 2
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 101: lload 12
// 103: invokevirtual su/catlean/uy.f (J)Z
// 106: goto 113
// 109: ldc2_w -6255044942563522040
// 10c: lload 2
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: lload 2
// 114: lconst_0
// 115: lcmp
// 116: iflt 157
// 119: iload 14
// 11b: ifeq 157
// 11e: ifeq 21c
// 121: goto 12e
// 124: ldc2_w -6255044942563522040
// 127: lload 2
// 128: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: athrow
// 12e: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 131: lload 8
// 133: invokevirtual su/catlean/uy.PO (J)F
// 136: iload 14
// 138: ifeq 16f
// 13b: goto 148
// 13e: ldc2_w -6255044942563522040
// 141: lload 2
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: fconst_0
// 149: fcmpl
// 14a: goto 157
// 14d: ldc2_w -6255044942563522040
// 150: lload 2
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: ifle 21c
// 15a: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 15d: lload 8
// 15f: invokevirtual su/catlean/uy.PO (J)F
// 162: goto 16f
// 165: ldc2_w -6255044942563522040
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: fstore 15
// 171: aload 1
// 172: checkcast net/minecraft/class_1297
// 175: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 178: aload 1
// 179: checkcast net/minecraft/class_1297
// 17c: invokevirtual net/minecraft/class_1297.method_23317 ()D
// 17f: aload 1
// 180: getfield net/minecraft/class_1657.field_6014 D
// 183: dsub
// 184: fload 15
// 186: f2d
// 187: dmul
// 188: dadd
// 189: dstore 16
// 18b: aload 1
// 18c: checkcast net/minecraft/class_1297
// 18f: invokevirtual net/minecraft/class_1297.method_23318 ()D
// 192: aload 1
// 193: checkcast net/minecraft/class_1297
// 196: invokevirtual net/minecraft/class_1297.method_23318 ()D
// 199: aload 1
// 19a: getfield net/minecraft/class_1657.field_6036 D
// 19d: dsub
// 19e: fload 15
// 1a0: f2d
// 1a1: dmul
// 1a2: dadd
// 1a3: dstore 18
// 1a5: aload 1
// 1a6: checkcast net/minecraft/class_1297
// 1a9: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 1ac: aload 1
// 1ad: checkcast net/minecraft/class_1297
// 1b0: invokevirtual net/minecraft/class_1297.method_23321 ()D
// 1b3: aload 1
// 1b4: getfield net/minecraft/class_1657.field_5969 D
// 1b7: dsub
// 1b8: fload 15
// 1ba: f2d
// 1bb: dmul
// 1bc: dadd
// 1bd: dstore 20
// 1bf: aload 1
// 1c0: dload 16
// 1c2: dload 18
// 1c4: dload 20
// 1c6: invokevirtual net/minecraft/class_1657.method_5814 (DDD)V
// 1c9: lload 2
// 1ca: lconst_0
// 1cb: lcmp
// 1cc: iflt 20f
// 1cf: getstatic su/catlean/um.E Lsu/catlean/um;
// 1d2: invokevirtual su/catlean/um.BR ()Lnet/minecraft/class_1297;
// 1d5: aload 1
// 1d6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1d9: ifeq 21c
// 1dc: getstatic su/catlean/uy.U Lsu/catlean/uy;
// 1df: new net/minecraft/class_238
// 1e2: dup
// 1e3: dload 16
// 1e5: ldc2_w 0.3
// 1e8: dsub
// 1e9: dload 18
// 1eb: dconst_0
// 1ec: dadd
// 1ed: dload 20
// 1ef: ldc2_w 0.3
// 1f2: dsub
// 1f3: dload 16
// 1f5: ldc2_w 0.3
// 1f8: dadd
// 1f9: dload 18
// 1fb: ldc2_w 0.6
// 1fe: dadd
// 1ff: dload 20
// 201: ldc2_w 0.3
// 204: dadd
// 205: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
// 208: lload 4
// 20a: dup2_x1
// 20b: pop2
// 20c: invokevirtual su/catlean/uy.x (JLnet/minecraft/class_238;)V
// 20f: goto 21c
// 212: ldc2_w -6255044942563522040
// 215: lload 2
// 216: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21b: athrow
// 21c: return
}

private final void S(class_1657 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/sx.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -1420978929565855168
// 09: lload 2
// 0a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: aload 1
// 10: sipush 9741
// 13: ldc2_w 1282878101397569423
// 16: lload 2
// 17: lxor
// 18: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/sx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 20: istore 4
// 22: aload 1
// 23: checkcast su/catlean/interfaces/Resolvable
// 26: iload 4
// 28: ifeq 64
// 2b: invokeinterface su/catlean/interfaces/Resolvable.getSavedPosition ()Lnet/minecraft/class_243; 1
// 30: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 33: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 36: ifne 6c
// 39: goto 46
// 3c: ldc2_w -1385486754589667332
// 3f: lload 2
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: aload 1
// 47: aload 1
// 48: checkcast su/catlean/interfaces/Resolvable
// 4b: invokeinterface su/catlean/interfaces/Resolvable.getSavedPosition ()Lnet/minecraft/class_243; 1
// 50: invokevirtual net/minecraft/class_1657.method_33574 (Lnet/minecraft/class_243;)V
// 53: aload 1
// 54: checkcast su/catlean/interfaces/Resolvable
// 57: goto 64
// 5a: ldc2_w -1385486754589667332
// 5d: lload 2
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: getstatic net/minecraft/class_243.field_1353 Lnet/minecraft/class_243;
// 67: invokeinterface su/catlean/interfaces/Resolvable.savePosition (Lnet/minecraft/class_243;)V 2
// 6c: return
}

private final boolean Q(class_1657 param1, long param2) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sx.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 86686998467451
// 00b: lxor
// 00c: lstore 4
// 00e: dup2
// 00f: ldc2_w 31562464915054
// 012: lxor
// 013: lstore 6
// 015: pop2
// 016: ldc2_w -4884241495776509392
// 019: lload 2
// 01a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01f: istore 8
// 021: aload 1
// 022: iload 8
// 024: ifeq 04c
// 027: lload 6
// 029: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 02c: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 02f: ifeq 04b
// 032: goto 03f
// 035: ldc2_w -4848731728136511604
// 038: lload 2
// 039: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: athrow
// 03f: bipush 0
// 040: ireturn
// 041: ldc2_w -4848731728136511604
// 044: lload 2
// 045: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04a: athrow
// 04b: aload 1
// 04c: lload 4
// 04e: invokestatic su/catlean/s_.L (Lnet/minecraft/class_1657;J)Ljava/util/List;
// 051: checkcast java/lang/Iterable
// 054: invokestatic kotlin/collections/CollectionsKt.toList (Ljava/lang/Iterable;)Ljava/util/List;
// 057: astore 9
// 059: aload 9
// 05b: checkcast java/lang/Iterable
// 05e: astore 11
// 060: bipush 0
// 061: istore 12
// 063: aload 11
// 065: iload 8
// 067: ifeq 0b9
// 06a: instanceof java/util/Collection
// 06d: ifeq 0b7
// 070: goto 07d
// 073: ldc2_w -4848731728136511604
// 076: lload 2
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: aload 11
// 07f: checkcast java/util/Collection
// 082: iload 8
// 084: ifeq 0b9
// 087: goto 094
// 08a: ldc2_w -4848731728136511604
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: invokeinterface java/util/Collection.isEmpty ()Z 1
// 099: ifeq 0b7
// 09c: goto 0a9
// 09f: ldc2_w -4848731728136511604
// 0a2: lload 2
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: bipush 1
// 0aa: goto 12f
// 0ad: ldc2_w -4848731728136511604
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: aload 11
// 0b9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0be: astore 13
// 0c0: aload 13
// 0c2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0c7: ifeq 12e
// 0ca: aload 13
// 0cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0d1: astore 14
// 0d3: aload 14
// 0d5: checkcast net/minecraft/class_1799
// 0d8: astore 15
// 0da: bipush 0
// 0db: istore 16
// 0dd: aload 15
// 0df: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 0e2: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 0e5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0e8: iload 8
// 0ea: ifeq 102
// 0ed: ifne 11b
// 0f0: aload 15
// 0f2: invokevirtual net/minecraft/class_1799.method_7986 ()Z
// 0f5: goto 102
// 0f8: ldc2_w -4848731728136511604
// 0fb: lload 2
// 0fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: athrow
// 102: iload 8
// 104: ifeq 118
// 107: ifne 11b
// 10a: goto 117
// 10d: ldc2_w -4848731728136511604
// 110: lload 2
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: bipush 1
// 118: goto 11c
// 11b: bipush 0
// 11c: ifne 0c0
// 11f: bipush 0
// 120: iload 8
// 122: lload 2
// 123: lconst_0
// 124: lcmp
// 125: ifle 0ea
// 128: ifeq 0e8
// 12b: goto 12f
// 12e: bipush 1
// 12f: istore 10
// 131: aload 9
// 133: checkcast java/lang/Iterable
// 136: astore 12
// 138: bipush 0
// 139: istore 13
// 13b: aload 12
// 13d: iload 8
// 13f: ifeq 191
// 142: instanceof java/util/Collection
// 145: ifeq 18f
// 148: goto 155
// 14b: ldc2_w -4848731728136511604
// 14e: lload 2
// 14f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: athrow
// 155: aload 12
// 157: checkcast java/util/Collection
// 15a: iload 8
// 15c: ifeq 191
// 15f: goto 16c
// 162: ldc2_w -4848731728136511604
// 165: lload 2
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: invokeinterface java/util/Collection.isEmpty ()Z 1
// 171: ifeq 18f
// 174: goto 181
// 177: ldc2_w -4848731728136511604
// 17a: lload 2
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: bipush 1
// 182: goto 1cd
// 185: ldc2_w -4848731728136511604
// 188: lload 2
// 189: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: athrow
// 18f: aload 12
// 191: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 196: astore 14
// 198: aload 14
// 19a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 19f: ifeq 1cc
// 1a2: aload 14
// 1a4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1a9: astore 15
// 1ab: aload 15
// 1ad: checkcast net/minecraft/class_1799
// 1b0: astore 16
// 1b2: bipush 0
// 1b3: istore 17
// 1b5: aload 16
// 1b7: invokevirtual net/minecraft/class_1799.method_7923 ()Z
// 1ba: ifne 198
// 1bd: bipush 0
// 1be: lload 2
// 1bf: lconst_0
// 1c0: lcmp
// 1c1: iflt 1ba
// 1c4: iload 8
// 1c6: ifeq 1ba
// 1c9: goto 1cd
// 1cc: bipush 1
// 1cd: istore 11
// 1cf: aload 1
// 1d0: invokevirtual net/minecraft/class_1657.method_6079 ()Lnet/minecraft/class_1799;
// 1d3: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 1d6: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 1d9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1dc: istore 12
// 1de: aload 9
// 1e0: checkcast java/lang/Iterable
// 1e3: astore 14
// 1e5: bipush 0
// 1e6: istore 15
// 1e8: aload 14
// 1ea: iload 8
// 1ec: ifeq 23e
// 1ef: instanceof java/util/Collection
// 1f2: ifeq 23c
// 1f5: goto 202
// 1f8: ldc2_w -4848731728136511604
// 1fb: lload 2
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: aload 14
// 204: checkcast java/util/Collection
// 207: iload 8
// 209: ifeq 23e
// 20c: goto 219
// 20f: ldc2_w -4848731728136511604
// 212: lload 2
// 213: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 218: athrow
// 219: invokeinterface java/util/Collection.isEmpty ()Z 1
// 21e: ifeq 23c
// 221: goto 22e
// 224: ldc2_w -4848731728136511604
// 227: lload 2
// 228: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22d: athrow
// 22e: bipush 0
// 22f: goto 286
// 232: ldc2_w -4848731728136511604
// 235: lload 2
// 236: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23b: athrow
// 23c: aload 14
// 23e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 243: astore 16
// 245: aload 16
// 247: invokeinterface java/util/Iterator.hasNext ()Z 1
// 24c: ifeq 285
// 24f: aload 16
// 251: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 256: astore 17
// 258: aload 17
// 25a: checkcast net/minecraft/class_1799
// 25d: astore 18
// 25f: bipush 0
// 260: istore 19
// 262: getstatic su/catlean/sx.M Lsu/catlean/sx;
// 265: pop
// 266: getstatic su/catlean/sx.u Ljava/util/Set;
// 269: aload 18
// 26b: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 26e: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
// 273: ifeq 245
// 276: bipush 1
// 277: lload 2
// 278: lconst_0
// 279: lcmp
// 27a: ifle 273
// 27d: iload 8
// 27f: ifeq 273
// 282: goto 286
// 285: bipush 0
// 286: istore 13
// 288: aload 1
// 289: invokevirtual net/minecraft/class_1657.method_6047 ()Lnet/minecraft/class_1799;
// 28c: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
// 28f: getstatic net/minecraft/class_1802.field_8162 Lnet/minecraft/class_1792;
// 292: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 295: iload 8
// 297: ifeq 2ab
// 29a: ifne 2ae
// 29d: goto 2aa
// 2a0: ldc2_w -4848731728136511604
// 2a3: lload 2
// 2a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: athrow
// 2aa: bipush 1
// 2ab: goto 2af
// 2ae: bipush 0
// 2af: istore 14
// 2b1: iload 10
// 2b3: iload 8
// 2b5: lload 2
// 2b6: lconst_0
// 2b7: lcmp
// 2b8: iflt 2d2
// 2bb: ifeq 2d0
// 2be: ifeq 340
// 2c1: goto 2ce
// 2c4: ldc2_w -4848731728136511604
// 2c7: lload 2
// 2c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cd: athrow
// 2ce: iload 11
// 2d0: iload 8
// 2d2: lload 2
// 2d3: lconst_0
// 2d4: lcmp
// 2d5: iflt 2ef
// 2d8: ifeq 2ed
// 2db: ifeq 340
// 2de: goto 2eb
// 2e1: ldc2_w -4848731728136511604
// 2e4: lload 2
// 2e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ea: athrow
// 2eb: iload 12
// 2ed: iload 8
// 2ef: lload 2
// 2f0: lconst_0
// 2f1: lcmp
// 2f2: iflt 30c
// 2f5: ifeq 30a
// 2f8: ifeq 340
// 2fb: goto 308
// 2fe: ldc2_w -4848731728136511604
// 301: lload 2
// 302: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 307: athrow
// 308: iload 13
// 30a: iload 8
// 30c: lload 2
// 30d: lconst_0
// 30e: lcmp
// 30f: ifle 329
// 312: ifeq 327
// 315: ifeq 340
// 318: goto 325
// 31b: ldc2_w -4848731728136511604
// 31e: lload 2
// 31f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 324: athrow
// 325: iload 14
// 327: iload 8
// 329: ifeq 33d
// 32c: ifeq 340
// 32f: goto 33c
// 332: ldc2_w -4848731728136511604
// 335: lload 2
// 336: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33b: athrow
// 33c: bipush 1
// 33d: goto 341
// 340: bipush 0
// 341: ireturn
}

public final boolean i(long a, @NotNull class_1657 player) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sx.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: ldc2_w -3863362381619748203
// 009: lload 1
// 00a: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: aload 3
// 010: sipush 14342
// 013: ldc2_w 7254597460976715578
// 016: lload 1
// 017: lxor
// 018: invokedynamic q (IJ)Ljava/lang/String; bsm=su/catlean/sx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 020: istore 4
// 022: aload 3
// 023: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 026: aload 3
// 027: getfield net/minecraft/class_1657.field_6014 D
// 02a: dcmpg
// 02b: iload 4
// 02d: ifne 041
// 030: ifne 044
// 033: goto 040
// 036: ldc2_w -3855762948574893756
// 039: lload 1
// 03a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: athrow
// 040: bipush 1
// 041: goto 045
// 044: bipush 0
// 045: lload 1
// 046: lconst_0
// 047: lcmp
// 048: iflt 0c1
// 04b: ifeq 0c0
// 04e: aload 3
// 04f: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 052: aload 3
// 053: getfield net/minecraft/class_1657.field_6036 D
// 056: dcmpg
// 057: iload 4
// 059: ifne 07a
// 05c: goto 069
// 05f: ldc2_w -3855762948574893756
// 062: lload 1
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: ifne 07d
// 06c: goto 079
// 06f: ldc2_w -3855762948574893756
// 072: lload 1
// 073: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: athrow
// 079: bipush 1
// 07a: goto 07e
// 07d: bipush 0
// 07e: lload 1
// 07f: lconst_0
// 080: lcmp
// 081: iflt 0c1
// 084: ifeq 0c0
// 087: aload 3
// 088: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 08b: aload 3
// 08c: getfield net/minecraft/class_1657.field_5969 D
// 08f: dcmpg
// 090: iload 4
// 092: ifne 0b3
// 095: goto 0a2
// 098: ldc2_w -3855762948574893756
// 09b: lload 1
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: ifne 0b6
// 0a5: goto 0b2
// 0a8: ldc2_w -3855762948574893756
// 0ab: lload 1
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: bipush 1
// 0b3: goto 0b7
// 0b6: bipush 0
// 0b7: lload 1
// 0b8: lconst_0
// 0b9: lcmp
// 0ba: ifle 0c1
// 0bd: ifne 0ce
// 0c0: bipush 1
// 0c1: goto 0cf
// 0c4: ldc2_w -3855762948574893756
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: bipush 0
// 0cf: ldc2_w -3848047348235447287
// 0d2: lload 1
// 0d3: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: ifnull 105
// 0db: iload 4
// 0dd: ifeq 0fb
// 0e0: goto 0ed
// 0e3: ldc2_w -3855762948574893756
// 0e6: lload 1
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: bipush 0
// 0ee: goto 0fc
// 0f1: ldc2_w -3855762948574893756
// 0f4: lload 1
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: bipush 1
// 0fc: ldc2_w -3805758631381208678
// 0ff: lload 1
// 100: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: ireturn
}

static {
long var20 = a ^ 27199068484574L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[7];
int var16 = 0;
String var15 = "\u0095Ðwi8ÚÌ\u0097W\u0099\u0019M\u0003Ä\u009bc\u008bÂ:Uò]çk Ô¾\u001aWD\u0085\u0017×æÌ/Æ\u008eÓ\u0095\u0084M\u0003\u008c\u009d',\u0085\u009aKØÜOë[Ï(p\u0003\u001d\u0011\u0007å\u0015ïZÊ/\u0090¶\u001e\u0093\u0081ùûÇM¼Ú?Çk\u0086\u0018\n\u0006R\u0015gê7å~/ðJ\u0013Áÿñ\u0016-\u0013öz\u0090\u009c0ÒSÊª[Ó¦¸\u0085cãÙ*ê\u0093Ùg(¨~S£>eP¦é\u007f\u0017[\u001a/\u0006R\u0003ØÃd\u0091ÿÙ,äF\u0014\u0084½W|ï\b\u00054\u0004\u0018\bT[84ÄW(\u0086x-Ô8xrM\u00815½wwý{<_<ëÈä ù\u0098Y%)ªsJ$\u00834)\u0006Q8\u0097\"×\u0010®KÜ\u008ct\u0013Â¯\u0001Õ}s\u0082çd\u009d";
int var17 = "\u0095Ðwi8ÚÌ\u0097W\u0099\u0019M\u0003Ä\u009bc\u008bÂ:Uò]çk Ô¾\u001aWD\u0085\u0017×æÌ/Æ\u008eÓ\u0095\u0084M\u0003\u008c\u009d',\u0085\u009aKØÜOë[Ï(p\u0003\u001d\u0011\u0007å\u0015ïZÊ/\u0090¶\u001e\u0093\u0081ùûÇM¼Ú?Çk\u0086\u0018\n\u0006R\u0015gê7å~/ðJ\u0013Áÿñ\u0016-\u0013öz\u0090\u009c0ÒSÊª[Ó¦¸\u0085cãÙ*ê\u0093Ùg(¨~S£>eP¦é\u007f\u0017[\u001a/\u0006R\u0003ØÃd\u0091ÿÙ,äF\u0014\u0084½W|ï\b\u00054\u0004\u0018\bT[84ÄW(\u0086x-Ô8xrM\u00815½wwý{<_<ëÈä ù\u0098Y%)ªsJ$\u00834)\u0006Q8\u0097\"×\u0010®KÜ\u008ct\u0013Â¯\u0001Õ}s\u0082çd\u009d"
.length();
char var14 = 24;
int var25 = -1;

label54:
while (true) {
String var26 = var15.substring(++var25, var25 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
String var37 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var37;
if ((var25 += var14) >= var17) {
b = var18;
c = new String[7];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "¦¤\u008dÀm\u000e\u0085bF\u0088;\u000f\u009c{\flyd/\\xc\u001eÕ";
int var5 = "¦¤\u008dÀm\u000e\u0085bF\u0088;\u000f\u009c{\flyd/\\xc\u001eÕ".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var29 = var6;
var10001 = var3++;
long var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var44 = -1;

while (true) {
long var8 = var41;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var46 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var44) {
case 0:
var29[var10001] = var46;
if (var2 >= var5) {
e = var6;
f = new Integer[5];
M = new sx();
class_1792[] var22 = new class_1792[b<"s">(12543, 4689456070525414042L ^ var20)];
var22[0] = class_1802.field_8370;
var22[1] = class_1802.field_8570;
var22[2] = class_1802.field_8577;
var22[3] = class_1802.field_8267;
var22[4] = class_1802.field_8660;
var22[5] = class_1802.field_8396;
var22[b<"s">(31274, 5455094830075912264L ^ var20)] = class_1802.field_8523;
var22[b<"s">(3929, 2552959474172155197L ^ var20)] = class_1802.field_8743;
u = SetsKt.setOf(var22);
return;
}
break;
default:
var29[var10001] = var46;
if (var2 < var5) {
continue label36;
}

var4 = "ÂzÕóï\u0080è\u0080ï«Q\u0006\u0094j!8";
var5 = "ÂzÕóï\u0080è\u0080ï«Q\u0006\u0094j!8".length();
var2 = 0;
}

byte var35 = var2;
var2 += 8;
var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
var29 = var6;
var10001 = var3++;
var41 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var44 = 0;
}
}
}

var14 = var15.charAt(var25);
break;
default:
var18[var16++] = var37;
if ((var25 += var14) < var17) {
var14 = var15.charAt(var25);
continue label54;
}

var15 = "IujîvÇÎEö\u001c\u0000\u001dÄ÷\u009a\u0017Õhê8-Ã¾o\u0007BeùV¬ç)\u0088Õ\u008fkFò\u0087Á&[bjÄ·²µ\u0085\u001c\u0004BÏ]\u0088ùØªa+\u008a\fù&-ÔL·çjª\u009dÅÇxÝfñÈ7Ïgøí×>£\u0016i\u0001\u0089ð3 \u001d\u001cü\u0001ÑÇ\u000eB\u008aè®¸ÿôiªòÃÏWx@ª:`á\u0010±ne®Ñ#\u00ad\u008céôÖ]Í\u0010ÝÀ";
var17 = "IujîvÇÎEö\u001c\u0000\u001dÄ÷\u009a\u0017Õhê8-Ã¾o\u0007BeùV¬ç)\u0088Õ\u008fkFò\u0087Á&[bjÄ·²µ\u0085\u001c\u0004BÏ]\u0088ùØªa+\u008a\fù&-ÔL·çjª\u009dÅÇxÝfñÈ7Ïgøí×>£\u0016i\u0001\u0089ð3 \u001d\u001cü\u0001ÑÇ\u000eB\u008aè®¸ÿôiªòÃÏWx@ª:`á\u0010±ne®Ñ#\u00ad\u008céôÖ]Í\u0010ÝÀ"
.length();
var14 = 'x';
var25 = -1;
}

var26 = var15.substring(++var25, var25 + var14);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13553;
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
throw new RuntimeException("su/catlean/sx", var10);
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
throw new RuntimeException("su/catlean/sx" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25412;
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
throw new RuntimeException("su/catlean/sx", var14);
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
throw new RuntimeException("su/catlean/sx" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
