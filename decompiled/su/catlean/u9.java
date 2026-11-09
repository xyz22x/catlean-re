package su.catlean;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class u9 extends _g {
@NotNull
public static final u9 j;
@NotNull
private static final ConcurrentLinkedQueue h;
private static float k;
private static float o;
private static int z;
private static File C;
private static final long a = yz.a(-3861804502198670543L, 1664545703830537933L, MethodHandles.lookup().lookupClass()).a(196643281548153L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private u9(long var1, int var3) {
long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
long var6 = var4 ^ 13223303563131L;
super(b<"m">(5083, 8034592981909320521L ^ var4), jt.Q(), null, 4, null, var6);
}

public final int I() {
return z;
}

public final void D(int <set-?>) {
z = <set-?>;
}

@Override
public void O(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 57052227101120
// 005: lxor
// 006: dup2
// 007: bipush 48
// 009: lushr
// 00a: l2i
// 00b: istore 3
// 00c: dup2
// 00d: bipush 16
// 00f: lshl
// 010: bipush 48
// 012: lushr
// 013: l2i
// 014: istore 4
// 016: dup2
// 017: bipush 32
// 019: lshl
// 01a: bipush 32
// 01c: lushr
// 01d: l2i
// 01e: istore 5
// 020: pop2
// 021: pop2
// 022: ldc2_w 2637436620605547178
// 025: lload 1
// 026: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02b: sipush 16916
// 02e: ldc2_w 5115675174131519535
// 031: lload 1
// 032: lxor
// 033: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
// 03b: bipush 3
// 03c: anewarray 16
// 03f: astore 8
// 041: aload 8
// 043: bipush 0
// 044: sipush 11358
// 047: ldc2_w 2752747992024235617
// 04a: lload 1
// 04b: lxor
// 04c: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: aastore
// 052: aload 8
// 054: bipush 1
// 055: sipush 12542
// 058: ldc2_w 4064620560689242831
// 05b: lload 1
// 05c: lxor
// 05d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: aastore
// 063: aload 8
// 065: bipush 2
// 066: sipush 18469
// 069: ldc2_w 3534238944222763548
// 06c: lload 1
// 06d: lxor
// 06e: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: aastore
// 074: aload 8
// 076: invokestatic java/nio/file/Paths.get (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
// 079: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 07c: astore 7
// 07e: new java/io/File
// 081: dup
// 082: aload 7
// 084: invokespecial java/io/File.<init> (Ljava/lang/String;)V
// 087: putstatic su/catlean/u9.C Ljava/io/File;
// 08a: astore 6
// 08c: aload 6
// 08e: ifnull 0c9
// 091: getstatic su/catlean/u9.C Ljava/io/File;
// 094: lload 1
// 095: lconst_0
// 096: lcmp
// 097: ifle 0ca
// 09a: dup
// 09b: ifnonnull 0ca
// 09e: goto 0ab
// 0a1: ldc2_w 2611324011044272197
// 0a4: lload 1
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: pop
// 0ac: sipush 4373
// 0af: ldc2_w 2442415122106647330
// 0b2: lload 1
// 0b3: lxor
// 0b4: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
// 0bc: goto 0c9
// 0bf: ldc2_w 2611324011044272197
// 0c2: lload 1
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: aconst_null
// 0ca: invokevirtual java/io/File.exists ()Z
// 0cd: ifne 0f5
// 0d0: aload 0
// 0d1: iload 3
// 0d2: i2c
// 0d3: sipush 8434
// 0d6: ldc2_w 9082751542458462912
// 0d9: lload 1
// 0da: lxor
// 0db: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: iload 4
// 0e2: i2s
// 0e3: iload 5
// 0e5: invokespecial su/catlean/u9.k (CLjava/lang/String;SI)V
// 0e8: goto 0f5
// 0eb: ldc2_w 2611324011044272197
// 0ee: lload 1
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: lload 1
// 0f6: lconst_0
// 0f7: lcmp
// 0f8: iflt 10d
// 0fb: aload 6
// 0fd: ifnonnull 11a
// 100: bipush 3
// 101: anewarray 21
// 104: ldc2_w 2605814174822968852
// 107: lload 1
// 108: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: goto 11a
// 110: ldc2_w 2611324011044272197
// 113: lload 1
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: return
}

@Flow
private final void w(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/u9.a J
// 003: ldc2_w 135101329779759
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 76395052760592
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 7232342454327
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
// 027: ldc2_w 73915855015257
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 23336960337924
// 031: lxor
// 032: dup2
// 033: bipush 48
// 035: lushr
// 036: l2i
// 037: istore 11
// 039: dup2
// 03a: bipush 16
// 03c: lshl
// 03d: bipush 32
// 03f: lushr
// 040: l2i
// 041: istore 12
// 043: dup2
// 044: bipush 48
// 046: lshl
// 047: bipush 48
// 049: lushr
// 04a: l2i
// 04b: istore 13
// 04d: pop2
// 04e: dup2
// 04f: ldc2_w 2394338408245
// 052: lxor
// 053: lstore 14
// 055: dup2
// 056: ldc2_w 118090005505943
// 059: lxor
// 05a: dup2
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 16
// 061: dup2
// 062: bipush 16
// 064: lshl
// 065: bipush 48
// 067: lushr
// 068: l2i
// 069: istore 17
// 06b: dup2
// 06c: bipush 32
// 06e: lshl
// 06f: bipush 32
// 071: lushr
// 072: l2i
// 073: istore 18
// 075: pop2
// 076: dup2
// 077: ldc2_w 112006611693622
// 07a: lxor
// 07b: lstore 19
// 07d: pop2
// 07e: ldc2_w -6715616754545826563
// 081: lload 2
// 082: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: astore 21
// 089: aload 21
// 08b: ifnull 0d0
// 08e: iload 11
// 090: i2c
// 091: getstatic su/catlean/dx.K Lsu/catlean/dx;
// 094: ldc 6.0
// 096: getstatic su/catlean/w2.DISTANCE Lsu/catlean/w2;
// 099: bipush 0
// 09a: bipush 0
// 09b: sipush 1490
// 09e: ldc2_w 8627052485455785796
// 0a1: lload 2
// 0a2: lxor
// 0a3: invokedynamic n (IJ)I bsm=su/catlean/u9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: iload 12
// 0aa: iload 13
// 0ac: i2c
// 0ad: aconst_null
// 0ae: invokestatic su/catlean/dx.Y (CLsu/catlean/dx;FLsu/catlean/w2;ZZIICLjava/lang/Object;)Lnet/minecraft/class_1657;
// 0b1: dup
// 0b2: ifnonnull 0d1
// 0b5: goto 0c2
// 0b8: ldc2_w -6743557841504469486
// 0bb: lload 2
// 0bc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: athrow
// 0c2: pop
// 0c3: goto 0d0
// 0c6: ldc2_w -6743557841504469486
// 0c9: lload 2
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: return
// 0d1: astore 22
// 0d3: lload 4
// 0d5: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d8: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 0db: instanceof net/minecraft/class_3966
// 0de: aload 21
// 0e0: ifnull 124
// 0e3: ifeq 135
// 0e6: goto 0f3
// 0e9: ldc2_w -6743557841504469486
// 0ec: lload 2
// 0ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f2: athrow
// 0f3: lload 4
// 0f5: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0f8: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 0fb: dup
// 0fc: sipush 2934
// 0ff: ldc2_w 7018931019494563605
// 102: lload 2
// 103: lxor
// 104: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 10c: checkcast net/minecraft/class_3966
// 10f: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 112: aload 22
// 114: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 117: goto 124
// 11a: ldc2_w -6743557841504469486
// 11d: lload 2
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: ifeq 135
// 127: fconst_1
// 128: goto 136
// 12b: ldc2_w -6743557841504469486
// 12e: lload 2
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: fconst_0
// 136: fstore 23
// 138: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 13b: aload 22
// 13d: invokevirtual net/minecraft/class_1657.method_33571 ()Lnet/minecraft/class_243;
// 140: dup
// 141: sipush 17127
// 144: ldc2_w 7420662144305354380
// 147: lload 2
// 148: lxor
// 149: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 151: lload 14
// 153: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 156: astore 24
// 158: aload 24
// 15a: invokevirtual su/catlean/_w.q ()F
// 15d: lload 19
// 15f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 162: invokevirtual net/minecraft/class_746.method_36454 ()F
// 165: fsub
// 166: ldc 180.0
// 168: fdiv
// 169: fstore 25
// 16b: aload 24
// 16d: invokevirtual su/catlean/_w.N ()F
// 170: lload 19
// 172: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 175: invokevirtual net/minecraft/class_746.method_36455 ()F
// 178: fsub
// 179: ldc 90.0
// 17b: fdiv
// 17c: fstore 26
// 17e: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 181: aload 22
// 183: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 186: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
// 189: dup
// 18a: sipush 3242
// 18d: ldc2_w 7055128790940686542
// 190: lload 2
// 191: lxor
// 192: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 197: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 19a: lload 14
// 19c: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 19f: astore 27
// 1a1: aload 27
// 1a3: invokevirtual su/catlean/_w.q ()F
// 1a6: lload 19
// 1a8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ab: invokevirtual net/minecraft/class_746.method_36454 ()F
// 1ae: fsub
// 1af: ldc 180.0
// 1b1: fdiv
// 1b2: fstore 28
// 1b4: aload 27
// 1b6: invokevirtual su/catlean/_w.N ()F
// 1b9: lload 19
// 1bb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1be: invokevirtual net/minecraft/class_746.method_36455 ()F
// 1c1: fsub
// 1c2: ldc 90.0
// 1c4: fdiv
// 1c5: fstore 29
// 1c7: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 1ca: aload 0
// 1cb: iload 6
// 1cd: i2b
// 1ce: lload 7
// 1d0: aload 22
// 1d2: checkcast net/minecraft/class_1297
// 1d5: invokevirtual su/catlean/u9.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 1d8: lload 14
// 1da: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 1dd: astore 30
// 1df: aload 30
// 1e1: invokevirtual su/catlean/_w.q ()F
// 1e4: lload 19
// 1e6: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1e9: invokevirtual net/minecraft/class_746.method_36454 ()F
// 1ec: fsub
// 1ed: ldc 180.0
// 1ef: fdiv
// 1f0: fstore 31
// 1f2: aload 30
// 1f4: invokevirtual su/catlean/_w.N ()F
// 1f7: lload 19
// 1f9: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1fc: invokevirtual net/minecraft/class_746.method_36455 ()F
// 1ff: fsub
// 200: ldc 90.0
// 202: fdiv
// 203: fstore 32
// 205: lload 19
// 207: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 20a: invokevirtual net/minecraft/class_746.method_23317 ()D
// 20d: aload 22
// 20f: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 212: dsub
// 213: dstore 33
// 215: lload 19
// 217: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 21a: invokevirtual net/minecraft/class_746.method_23318 ()D
// 21d: aload 22
// 21f: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 222: dsub
// 223: dstore 35
// 225: lload 19
// 227: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 22a: invokevirtual net/minecraft/class_746.method_23321 ()D
// 22d: aload 22
// 22f: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 232: dsub
// 233: dstore 37
// 235: lload 19
// 237: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23a: invokevirtual net/minecraft/class_746.method_36454 ()F
// 23d: getstatic su/catlean/u9.k F
// 240: fsub
// 241: ldc 180.0
// 243: fdiv
// 244: fstore 39
// 246: lload 19
// 248: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 24b: invokevirtual net/minecraft/class_746.method_36455 ()F
// 24e: getstatic su/catlean/u9.o F
// 251: fsub
// 252: ldc 90.0
// 254: fdiv
// 255: fstore 40
// 257: lload 19
// 259: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 25c: invokevirtual net/minecraft/class_746.method_36454 ()F
// 25f: putstatic su/catlean/u9.k F
// 262: lload 19
// 264: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 267: invokevirtual net/minecraft/class_746.method_36455 ()F
// 26a: putstatic su/catlean/u9.o F
// 26d: lload 19
// 26f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 272: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 275: aload 22
// 277: invokevirtual net/minecraft/class_1657.method_33571 ()Lnet/minecraft/class_243;
// 27a: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 27d: ldc 6.0
// 27f: f2d
// 280: ddiv
// 281: dstore 41
// 283: lload 19
// 285: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 288: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
// 28b: aload 0
// 28c: iload 6
// 28e: i2b
// 28f: lload 7
// 291: aload 22
// 293: checkcast net/minecraft/class_1297
// 296: invokevirtual su/catlean/u9.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 299: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
// 29c: ldc 6.0
// 29e: f2d
// 29f: ddiv
// 2a0: dstore 43
// 2a2: new net/minecraft/class_243
// 2a5: dup
// 2a6: aload 22
// 2a8: invokevirtual net/minecraft/class_1657.method_23317 ()D
// 2ab: aload 22
// 2ad: getfield net/minecraft/class_1657.field_6014 D
// 2b0: dsub
// 2b1: aload 22
// 2b3: invokevirtual net/minecraft/class_1657.method_23318 ()D
// 2b6: aload 22
// 2b8: getfield net/minecraft/class_1657.field_6036 D
// 2bb: dsub
// 2bc: aload 22
// 2be: invokevirtual net/minecraft/class_1657.method_23321 ()D
// 2c1: aload 22
// 2c3: getfield net/minecraft/class_1657.field_5969 D
// 2c6: dsub
// 2c7: invokespecial net/minecraft/class_243.<init> (DDD)V
// 2ca: astore 45
// 2cc: lload 19
// 2ce: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2d1: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 2d4: dup
// 2d5: sipush 2417
// 2d8: ldc2_w 8295923217669070102
// 2db: lload 2
// 2dc: lxor
// 2dd: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e5: astore 46
// 2e7: fload 39
// 2e9: fload 40
// 2eb: fload 25
// 2ed: fload 26
// 2ef: fload 28
// 2f1: fload 29
// 2f3: fload 31
// 2f5: fload 32
// 2f7: dload 33
// 2f9: dload 35
// 2fb: dload 37
// 2fd: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 300: invokevirtual su/catlean/dm.o ()D
// 303: fload 23
// 305: dload 43
// 307: dload 41
// 309: aload 45
// 30b: getfield net/minecraft/class_243.field_1352 D
// 30e: aload 45
// 310: getfield net/minecraft/class_243.field_1351 D
// 313: aload 45
// 315: getfield net/minecraft/class_243.field_1350 D
// 318: aload 46
// 31a: getfield net/minecraft/class_243.field_1352 D
// 31d: aload 46
// 31f: getfield net/minecraft/class_243.field_1351 D
// 322: aload 46
// 324: getfield net/minecraft/class_243.field_1350 D
// 327: lload 19
// 329: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 32c: ldc 0.5
// 32e: invokevirtual net/minecraft/class_746.method_7261 (F)F
// 331: invokedynamic makeConcatWithConstants (FFFFFFFFDDDDFDDDDDDDDF)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001" ]
// 336: astore 47
// 338: aload 0
// 339: iload 16
// 33b: i2c
// 33c: aload 47
// 33e: iload 17
// 340: i2s
// 341: iload 18
// 343: invokespecial su/catlean/u9.k (CLjava/lang/String;SI)V
// 346: getstatic su/catlean/u9.z I
// 349: istore 48
// 34b: iload 48
// 34d: bipush 1
// 34e: iadd
// 34f: putstatic su/catlean/u9.z I
// 352: lload 19
// 354: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 357: getfield net/minecraft/class_746.field_6012 I
// 35a: sipush 26042
// 35d: ldc2_w 3929972464519139118
// 360: lload 2
// 361: lxor
// 362: invokedynamic n (IJ)I bsm=su/catlean/u9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 367: irem
// 368: ifne 3a7
// 36b: aload 0
// 36c: checkcast su/catlean/_g
// 36f: getstatic su/catlean/u9.z I
// 372: sipush 25926
// 375: ldc2_w 3130538108400136489
// 378: lload 2
// 379: lxor
// 37a: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37f: swap
// 380: sipush 29132
// 383: ldc2_w 1094049708613461422
// 386: lload 2
// 387: lxor
// 388: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/u9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38d: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 392: bipush 0
// 393: bipush 2
// 394: aconst_null
// 395: lload 9
// 397: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 39a: goto 3a7
// 39d: ldc2_w -6743557841504469486
// 3a0: lload 2
// 3a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a6: athrow
// 3a7: return
}

private final void k(char var1, String var2, short var3, int var4) {
long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
long var7 = var5 ^ 108329047932303L;

try {
h.add(var2);
if (h.size() >= c<"n">(19616, 8549953618824859350L ^ var5)) {
this.Y(var7);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 5371484617726596851L, var5);
}
}

private final void Y(long var1) {
var1 = a ^ var1;
String var3 = vm.a<"Å">(8706970750732320485L, var1);

try {
FileWriter var10000;
FileWriter var10001;
File var10002;
try {
var10000 = new FileWriter;
var10001 = var10000;
var10002 = C;
if (C == null) {
Intrinsics.throwUninitializedPropertyAccessException(b<"m">(32709, 6602188190160171447L ^ var1));
var10002 = null;
}
} catch (Throwable var18) {
throw vm.a<"Å">(var18, 8679026093248521226L, var1);
}

var10001./* $VF: Unable to resugar constructor */<init>(var10002, true);
var var4 = var10000;
Throwable var5 = null;

try {
FileWriter var6 = var4;
boolean var7 = false;

while (true) {
boolean var22;
if (!h.isEmpty()) {
try {
var22 = true;
if (var1 > 0L && var3 != null) {
}
} catch (Throwable var14) {
throw vm.a<"Å">(var14, 8679026093248521226L, var1);
}
} else {
var22 = false;
}

try {
if (!var22) {
break;
}

var6.append((CharSequence)h.poll());
var6.append("\n");
if (var3 != null) {
continue;
}
} catch (Throwable var15) {
throw vm.a<"Å">(var15, 8679026093248521226L, var1);
}

if (var1 <= 0L) {
}
break;
}

Unit var21 = Unit.INSTANCE;
} catch (Throwable var16) {
var5 = var16;
throw var16;
} finally {
CloseableKt.closeFinally(var4, var5);
}
} catch (IOException var19) {
System.out.println(b<"m">(15893, 6070678813608603744L ^ var1) + var19.getMessage());
}
}

static {
long var20 = a ^ 27147447471585L;
long var22 = (var20 ^ 58838879902275L) >>> 32;
int var24 = (int)((var20 ^ 58838879902275L) << 32 >>> 32);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[15];
int var16 = 0;
String var15 = "q¨gØ²£åmØÀxoI\fþ\u009b$'Ì2%·¢\u008e\u0099Ëz¢\u0007\u009f\u009e7\u0010NëÐ³}\u008c=ÐäP\u0093Õ2\n¸ú\u0018Lì©P4\u0095_f\u001e)»¬ã ?¹5óoëÎ\u0083\u0006b@ÒR#v#a\u008bî?wL\t\u007fþ$ R\"\u0019Q\u009aK\u001d\u0089ð\u0006*Ü \t\u001d#äo#ígjß\u0090Ø\rë\u009dDìò]`@jF\bÇí\u0086ù©Y±ÿÙ\u008d¥ HÜ\u0002^NÝºiýD¿Ø¾i\u009e=âß\u000b\u0099ËS!\u0004\u0017«\u001c\u001cd\u009e¢/(\u0000\u0089S\u0086\u00ad\u0017ÚgTmTj÷YrÇ«\u0012ÜjMÎ±K\f\u0099,TM-\u008c\u000fñª÷í%)0V\u0010s¯ýÆÙôc\u008a\u009f=/tg\u009f{r(\u0014?Æ¥¥\u0011Bìü¥\u009cÂ=C\u001aR\u009b\u008e.~Súä7ôA\u0000ý\u000b,±°\u0004ÓaÅÇ°\rU\u0010ü6+X¦}z7\u0094FÌa\u000fî\u009bÍ(\u0098Ó9\u009c¤p N\f5í\u0007R}T¾>°»©8Æ\u0084\u009c\u0006£J¼~ø\u001c#°Bµ\u008a\u0090plÝ \u0083\u0085 \u001a\u0007IQ«H]Æµ\fÚ\u008cðø/@\nBï²\u0086Å<CY.xæ\u0095Űq6í`>\u0011l\"`#\u0095ÃL{Á\u001a,MÜT\u0014W¿r\u0098?*\u0094à\u0082\u001b4\u0017(£2â×ü\u009a\u0099©åeõ\u0001U©Ö]%\u0006\u0086!3Dïú÷»ÐW¾¶÷MRËü]þ\u009c`ë·¼\u000b\u0005\u0018ú\u0002ænv\u00056õ\u009eEÖÒ3vê/·è\u001f\u008c\nÑò\u008b×>\u0002\"\u0093\u0003Â'¦á\u0080ÄL\u0099.^\u0017Ü\u0094K£\u00845\u008f\u0011Ô[°Ù2·\f$$/5\u0080÷QÕ,kÇÉ-Qù|[ò\"\u0010ã\u0016Â\u0003S½\u00820Ð\u0017\u0096+\u008b¬æS¸¬ÚNh¾æ§ñó\rkÓÍàøkÎÇH\u0088÷ÌiàØT)Ãë\fÕÈE\u0012\u0085\u0019ts¦\u009c¤\u00ad<ð\u0019Øý\u001d£Í\u008d\u0083Z>`/d°t¿AgÜ\u008d-ÓF}^\u0088©~å\t\u000bÎýM\u0092µ\u001cG|aL^\u0014§¢\u0096\f\u00ad@\u0018ëáëW³ÿß=Sº\rSÆÃ\u0095)3¥?\u0091\u0083Ô×-\u0088\u0007¨jÙ\u001bZ-d¸Y£fÃ\u0080~ùÆ\u000e«û\u0090\u0007YX\\?|Ì!Ç¬¶\u008eÔÊò5 \u0092Âíx²ìÄñ}B{Ì\u0000\u008d\u001f0Ä÷\u00ad¤\f üÂ\u0016\u0086\u0085\u0005\u0096Dö¼Î~OïÀ\u00ad#\u0010Ð_zzw,p\u0095\u0082ÆE9\u0005óº?";
int var17 = "q¨gØ²£åmØÀxoI\fþ\u009b$'Ì2%·¢\u008e\u0099Ëz¢\u0007\u009f\u009e7\u0010NëÐ³}\u008c=ÐäP\u0093Õ2\n¸ú\u0018Lì©P4\u0095_f\u001e)»¬ã ?¹5óoëÎ\u0083\u0006b@ÒR#v#a\u008bî?wL\t\u007fþ$ R\"\u0019Q\u009aK\u001d\u0089ð\u0006*Ü \t\u001d#äo#ígjß\u0090Ø\rë\u009dDìò]`@jF\bÇí\u0086ù©Y±ÿÙ\u008d¥ HÜ\u0002^NÝºiýD¿Ø¾i\u009e=âß\u000b\u0099ËS!\u0004\u0017«\u001c\u001cd\u009e¢/(\u0000\u0089S\u0086\u00ad\u0017ÚgTmTj÷YrÇ«\u0012ÜjMÎ±K\f\u0099,TM-\u008c\u000fñª÷í%)0V\u0010s¯ýÆÙôc\u008a\u009f=/tg\u009f{r(\u0014?Æ¥¥\u0011Bìü¥\u009cÂ=C\u001aR\u009b\u008e.~Súä7ôA\u0000ý\u000b,±°\u0004ÓaÅÇ°\rU\u0010ü6+X¦}z7\u0094FÌa\u000fî\u009bÍ(\u0098Ó9\u009c¤p N\f5í\u0007R}T¾>°»©8Æ\u0084\u009c\u0006£J¼~ø\u001c#°Bµ\u008a\u0090plÝ \u0083\u0085 \u001a\u0007IQ«H]Æµ\fÚ\u008cðø/@\nBï²\u0086Å<CY.xæ\u0095Űq6í`>\u0011l\"`#\u0095ÃL{Á\u001a,MÜT\u0014W¿r\u0098?*\u0094à\u0082\u001b4\u0017(£2â×ü\u009a\u0099©åeõ\u0001U©Ö]%\u0006\u0086!3Dïú÷»ÐW¾¶÷MRËü]þ\u009c`ë·¼\u000b\u0005\u0018ú\u0002ænv\u00056õ\u009eEÖÒ3vê/·è\u001f\u008c\nÑò\u008b×>\u0002\"\u0093\u0003Â'¦á\u0080ÄL\u0099.^\u0017Ü\u0094K£\u00845\u008f\u0011Ô[°Ù2·\f$$/5\u0080÷QÕ,kÇÉ-Qù|[ò\"\u0010ã\u0016Â\u0003S½\u00820Ð\u0017\u0096+\u008b¬æS¸¬ÚNh¾æ§ñó\rkÓÍàøkÎÇH\u0088÷ÌiàØT)Ãë\fÕÈE\u0012\u0085\u0019ts¦\u009c¤\u00ad<ð\u0019Øý\u001d£Í\u008d\u0083Z>`/d°t¿AgÜ\u008d-ÓF}^\u0088©~å\t\u000bÎýM\u0092µ\u001cG|aL^\u0014§¢\u0096\f\u00ad@\u0018ëáëW³ÿß=Sº\rSÆÃ\u0095)3¥?\u0091\u0083Ô×-\u0088\u0007¨jÙ\u001bZ-d¸Y£fÃ\u0080~ùÆ\u000e«û\u0090\u0007YX\\?|Ì!Ç¬¶\u008eÔÊò5 \u0092Âíx²ìÄñ}B{Ì\u0000\u008d\u001f0Ä÷\u00ad¤\f üÂ\u0016\u0086\u0085\u0005\u0096Dö¼Î~OïÀ\u00ad#\u0010Ð_zzw,p\u0095\u0082ÆE9\u0005óº?"
.length();
char var14 = ' ';
int var26 = -1;

label45:
while (true) {
String var27 = var15.substring(++var26, var26 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
String var36 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var26 += var14) >= var17) {
b = var18;
c = new String[15];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "\u0091Û(\u009at\fÉ§ÂF\n\\\u0094\u001c¯=àõ8»\tZ94";
int var5 = "\u0091Û(\u009at\fÉ§ÂF\n\\\u0094\u001c¯=àõ8»\tZ94".length();
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
byte var41 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[3];
j = new u9(var22, var24);
h = new ConcurrentLinkedQueue();
return;
}

var14 = var15.charAt(var26);
break;
default:
var18[var16++] = var36;
if ((var26 += var14) < var17) {
var14 = var15.charAt(var26);
continue label45;
}

var15 = "oÕ*C`ÇÙ¼\u000eÿ¥\u0082È\u0098\u001d\u008c\u008eqØg¨\u0010\u0092ÂÉ\u0080\u0017*\u0003WÏ\u0095ìLCB\u008eÄÔ/.\u0011h}*ô¸Ã\u0098EýZ\u007f·Z\u0013ú¹ÀZX\u0084ÉÎÃ-=\u0002b9õKÜ\u0092-÷\u001eIGÀÝ\\£øUøÙí\u0006C\u008e>¶?ì\u0089õ\u0017Y«\u009f1²rN\u0098óI\u0099qE§Z'zê0Ø³k î\u0097v\u0085n²Ûi§\u009dà\u0085\u009e¼.\u0094\u009fîjä×É\u00905\u0096\u00963\u0099ÅB;\\";
var17 = "oÕ*C`ÇÙ¼\u000eÿ¥\u0082È\u0098\u001d\u008c\u008eqØg¨\u0010\u0092ÂÉ\u0080\u0017*\u0003WÏ\u0095ìLCB\u008eÄÔ/.\u0011h}*ô¸Ã\u0098EýZ\u007f·Z\u0013ú¹ÀZX\u0084ÉÎÃ-=\u0002b9õKÜ\u0092-÷\u001eIGÀÝ\\£øUøÙí\u0006C\u008e>¶?ì\u0089õ\u0017Y«\u009f1²rN\u0098óI\u0099qE§Z'zê0Ø³k î\u0097v\u0085n²Ûi§\u009dà\u0085\u009e¼.\u0094\u009fîjä×É\u00905\u0096\u00963\u0099ÅB;\\"
.length();
var14 = 'x';
var26 = -1;
}

var27 = var15.substring(++var26, var26 + var14);
var10001 = 0;
}
}
}

private static Throwable a(Throwable var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14135;
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
throw new RuntimeException("su/catlean/u9", var10);
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
throw new RuntimeException("su/catlean/u9" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 2511;
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
throw new RuntimeException("su/catlean/u9", var14);
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
throw new RuntimeException("su/catlean/u9" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
