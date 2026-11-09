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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

public final class bi implements ym {
@NotNull
public static final bi x;
private static boolean Y;
private static final long a = yz.a(752162420255965056L, -1334067080689802843L, MethodHandles.lookup().lookupClass()).a(144219134720967L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private bi() {
}

public final int m(@NotNull class_1657 target, long a) {
ax = a ^ ax;
long var10001 = ax ^ 13064290213579L;
int var4 = (int)((ax ^ 13064290213579L) >>> 32);
int var5 = (int)((ax ^ 13064290213579L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
long var7 = (ax ^ 73094708627985L) >>> 16;
int var9 = (int)((ax ^ 73094708627985L) << 48 >>> 48);
Intrinsics.checkNotNullParameter(target, a<"y">(17257, 4533367065489366180L ^ ax));
int var10 = nf.f(nf.Z, null, var7, 1, (char)var9, null);
int var11 = nf.Z.z(var4, (short)var5, (short)var6, target);
float var12 = 0.12857F * (var10 + var11) - b<"e">(12645, 7190080322231374982L ^ ax);
return RangesKt.coerceIn(MathKt.roundToInt(var12), 0, b<"e">(14316, 7516698772564546060L ^ ax));
}

public final boolean j(@NotNull class_1657 $this$isInWeb, int a, byte a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 3
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
// 018: getstatic su/catlean/bi.a J
// 01b: lxor
// 01c: lstore 5
// 01e: lload 5
// 020: dup2
// 021: ldc2_w 112932040924005
// 024: lxor
// 025: dup2
// 026: bipush 56
// 028: lushr
// 029: l2i
// 02a: istore 7
// 02c: dup2
// 02d: bipush 8
// 02f: lshl
// 030: bipush 8
// 032: lushr
// 033: lstore 8
// 035: pop2
// 036: dup2
// 037: ldc2_w 8712332600771
// 03a: lxor
// 03b: lstore 10
// 03d: pop2
// 03e: ldc2_w -8578196838058570787
// 041: lload 5
// 043: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: aload 1
// 049: sipush 14008
// 04c: ldc2_w 982264501000663807
// 04f: lload 5
// 051: lxor
// 052: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/bi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 05a: astore 12
// 05c: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 05f: iload 7
// 061: i2b
// 062: lload 8
// 064: aload 1
// 065: checkcast net/minecraft/class_1297
// 068: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 06b: checkcast net/minecraft/class_2374
// 06e: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 071: dup
// 072: sipush 3170
// 075: ldc2_w 8053679337157150755
// 078: lload 5
// 07a: lxor
// 07b: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/bi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 083: astore 13
// 085: aload 13
// 087: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 08a: bipush 2
// 08b: isub
// 08c: istore 14
// 08e: aload 13
// 090: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 093: bipush 2
// 094: iadd
// 095: istore 15
// 097: iload 14
// 099: aload 12
// 09b: ifnull 210
// 09e: iload 15
// 0a0: if_icmpgt 20f
// 0a3: goto 0b1
// 0a6: ldc2_w -8528411871711478640
// 0a9: lload 5
// 0ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: athrow
// 0b1: aload 13
// 0b3: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0b6: bipush 1
// 0b7: isub
// 0b8: istore 16
// 0ba: aload 13
// 0bc: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0bf: bipush 4
// 0c0: iadd
// 0c1: istore 17
// 0c3: iload 16
// 0c5: iload 17
// 0c7: if_icmpgt 1db
// 0ca: aload 13
// 0cc: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0cf: bipush 2
// 0d0: isub
// 0d1: istore 18
// 0d3: aload 13
// 0d5: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0d8: bipush 2
// 0d9: iadd
// 0da: istore 19
// 0dc: iload 18
// 0de: iload 19
// 0e0: aload 12
// 0e2: ifnull 1f2
// 0e5: if_icmpgt 1a2
// 0e8: new net/minecraft/class_2338
// 0eb: dup
// 0ec: iload 14
// 0ee: iload 16
// 0f0: iload 18
// 0f2: invokespecial net/minecraft/class_2338.<init> (III)V
// 0f5: astore 20
// 0f7: aload 1
// 0f8: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 0fb: new net/minecraft/class_238
// 0fe: dup
// 0ff: aload 20
// 101: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 104: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 107: aload 12
// 109: ifnull 1a4
// 10c: ifeq 16a
// 10f: lload 10
// 111: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 114: aload 20
// 116: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 119: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 11c: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
// 11f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 122: aload 12
// 124: ifnull 16c
// 127: goto 135
// 12a: ldc2_w -8528411871711478640
// 12d: lload 5
// 12f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 134: athrow
// 135: iload 3
// 136: iflt 16c
// 139: aload 12
// 13b: ifnull 16c
// 13e: goto 14c
// 141: ldc2_w -8528411871711478640
// 144: lload 5
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: ifeq 16a
// 14f: goto 15d
// 152: ldc2_w -8528411871711478640
// 155: lload 5
// 157: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15c: athrow
// 15d: bipush 1
// 15e: ireturn
// 15f: ldc2_w -8528411871711478640
// 162: lload 5
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: iload 18
// 16c: iload 19
// 16e: aload 12
// 170: iload 2
// 171: iflt 1ac
// 174: ifnull 1a6
// 177: if_icmpeq 1a2
// 17a: goto 188
// 17d: ldc2_w -8528411871711478640
// 180: lload 5
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: iinc 18 1
// 18b: aload 12
// 18d: ifnonnull 0e8
// 190: iload 2
// 191: iflt 16a
// 194: goto 1a2
// 197: ldc2_w -8528411871711478640
// 19a: lload 5
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: iload 16
// 1a4: iload 17
// 1a6: iload 2
// 1a7: iflt 1f2
// 1aa: aload 12
// 1ac: ifnull 1f2
// 1af: if_icmpeq 1db
// 1b2: goto 1c0
// 1b5: ldc2_w -8528411871711478640
// 1b8: lload 5
// 1ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bf: athrow
// 1c0: iinc 16 1
// 1c3: aload 12
// 1c5: ifnonnull 0ca
// 1c8: iload 4
// 1ca: ifle 1a2
// 1cd: goto 1db
// 1d0: ldc2_w -8528411871711478640
// 1d3: lload 5
// 1d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1da: athrow
// 1db: iload 14
// 1dd: aload 12
// 1df: ifnull 210
// 1e2: iload 15
// 1e4: goto 1f2
// 1e7: ldc2_w -8528411871711478640
// 1ea: lload 5
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: if_icmpeq 20f
// 1f5: iinc 14 1
// 1f8: aload 12
// 1fa: ifnonnull 0b1
// 1fd: iload 3
// 1fe: ifle 20f
// 201: goto 20f
// 204: ldc2_w -8528411871711478640
// 207: lload 5
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: bipush 0
// 210: ireturn
}

public final boolean c(@NotNull class_1657 $this$isInBerry, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/bi.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 10020962747296
// 00b: lxor
// 00c: dup2
// 00d: bipush 56
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 8
// 016: lshl
// 017: bipush 8
// 019: lushr
// 01a: lstore 5
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 114655674465542
// 021: lxor
// 022: lstore 7
// 024: pop2
// 025: aload 1
// 026: sipush 14008
// 029: ldc2_w 982308048256952890
// 02c: lload 2
// 02d: lxor
// 02e: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/bi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 036: ldc2_w -8056534254430858472
// 039: lload 2
// 03a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03f: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 042: iload 4
// 044: i2b
// 045: lload 5
// 047: aload 1
// 048: checkcast net/minecraft/class_1297
// 04b: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 04e: checkcast net/minecraft/class_2374
// 051: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 054: dup
// 055: sipush 2422
// 058: ldc2_w 7205722134950368757
// 05b: lload 2
// 05c: lxor
// 05d: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/bi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 065: astore 10
// 067: aload 10
// 069: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 06c: bipush 2
// 06d: isub
// 06e: istore 11
// 070: aload 10
// 072: invokevirtual net/minecraft/class_2338.method_10263 ()I
// 075: bipush 2
// 076: iadd
// 077: istore 12
// 079: astore 9
// 07b: iload 11
// 07d: aload 9
// 07f: ifnull 1f4
// 082: iload 12
// 084: if_icmpgt 1f3
// 087: goto 094
// 08a: ldc2_w -7970930171242109867
// 08d: lload 2
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: aload 10
// 096: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 099: bipush 1
// 09a: isub
// 09b: istore 13
// 09d: aload 10
// 09f: invokevirtual net/minecraft/class_2338.method_10264 ()I
// 0a2: bipush 4
// 0a3: iadd
// 0a4: istore 14
// 0a6: iload 13
// 0a8: iload 14
// 0aa: if_icmpgt 1bf
// 0ad: aload 10
// 0af: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0b2: bipush 2
// 0b3: isub
// 0b4: istore 15
// 0b6: aload 10
// 0b8: invokevirtual net/minecraft/class_2338.method_10260 ()I
// 0bb: bipush 2
// 0bc: iadd
// 0bd: istore 16
// 0bf: iload 15
// 0c1: iload 16
// 0c3: aload 9
// 0c5: ifnull 1d5
// 0c8: if_icmpgt 185
// 0cb: new net/minecraft/class_2338
// 0ce: dup
// 0cf: iload 11
// 0d1: iload 13
// 0d3: iload 15
// 0d5: invokespecial net/minecraft/class_2338.<init> (III)V
// 0d8: astore 17
// 0da: aload 1
// 0db: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
// 0de: new net/minecraft/class_238
// 0e1: dup
// 0e2: aload 17
// 0e4: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
// 0e7: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
// 0ea: aload 9
// 0ec: ifnull 187
// 0ef: ifeq 14b
// 0f2: lload 7
// 0f4: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0f7: aload 17
// 0f9: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 0fc: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 0ff: getstatic net/minecraft/class_2246.field_16999 Lnet/minecraft/class_2248;
// 102: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 105: aload 9
// 107: ifnull 14d
// 10a: goto 117
// 10d: ldc2_w -7970930171242109867
// 110: lload 2
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: lload 2
// 118: lconst_0
// 119: lcmp
// 11a: iflt 14d
// 11d: aload 9
// 11f: ifnull 14d
// 122: goto 12f
// 125: ldc2_w -7970930171242109867
// 128: lload 2
// 129: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12e: athrow
// 12f: ifeq 14b
// 132: goto 13f
// 135: ldc2_w -7970930171242109867
// 138: lload 2
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: bipush 1
// 140: ireturn
// 141: ldc2_w -7970930171242109867
// 144: lload 2
// 145: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14a: athrow
// 14b: iload 15
// 14d: iload 16
// 14f: aload 9
// 151: lload 2
// 152: lconst_0
// 153: lcmp
// 154: ifle 191
// 157: ifnull 189
// 15a: if_icmpeq 185
// 15d: goto 16a
// 160: ldc2_w -7970930171242109867
// 163: lload 2
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: iinc 15 1
// 16d: aload 9
// 16f: ifnonnull 0cb
// 172: lload 2
// 173: lconst_0
// 174: lcmp
// 175: ifle 14b
// 178: goto 185
// 17b: ldc2_w -7970930171242109867
// 17e: lload 2
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: iload 13
// 187: iload 14
// 189: lload 2
// 18a: lconst_0
// 18b: lcmp
// 18c: iflt 1d5
// 18f: aload 9
// 191: ifnull 1d5
// 194: if_icmpeq 1bf
// 197: goto 1a4
// 19a: ldc2_w -7970930171242109867
// 19d: lload 2
// 19e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a3: athrow
// 1a4: iinc 13 1
// 1a7: aload 9
// 1a9: ifnonnull 0ad
// 1ac: lload 2
// 1ad: lconst_0
// 1ae: lcmp
// 1af: iflt 185
// 1b2: goto 1bf
// 1b5: ldc2_w -7970930171242109867
// 1b8: lload 2
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: iload 11
// 1c1: aload 9
// 1c3: ifnull 1f4
// 1c6: iload 12
// 1c8: goto 1d5
// 1cb: ldc2_w -7970930171242109867
// 1ce: lload 2
// 1cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d4: athrow
// 1d5: if_icmpeq 1f3
// 1d8: iinc 11 1
// 1db: aload 9
// 1dd: ifnonnull 094
// 1e0: lload 2
// 1e1: lconst_0
// 1e2: lcmp
// 1e3: ifle 1f3
// 1e6: goto 1f3
// 1e9: ldc2_w -7970930171242109867
// 1ec: lload 2
// 1ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f2: athrow
// 1f3: bipush 0
// 1f4: ireturn
}

@NotNull
public final List Q(long a, short a, @NotNull class_1657 $this$getAffectedBlocks) {
long var5 = (axx << 16 | (long)ax << 48 >>> 48) ^ a;
Intrinsics.checkNotNullParameter($this$getAffectedBlocks, a<"y">(14008, 982338128385299412L ^ var5));
double var8 = class_2338.method_49637(
$this$getAffectedBlocks.method_23317(), MathKt.roundToInt($this$getAffectedBlocks.method_23318()), $this$getAffectedBlocks.method_23321()
)
.method_10264();
vm.a<"Å">(3017231853351824118L, var5);
class_238 var10001 = $this$getAffectedBlocks.method_5829();
Intrinsics.checkNotNullExpressionValue(var10001, a<"y">(30790, 4074368122597383464L ^ var5));
class_238 var10 = var10001;
float var11 = 1.0E-5F;
class_2338[] var13 = new class_2338[4];
class_2338 var10003 = class_2338.method_49637(var10.field_1323, var8, var10.field_1321);
Intrinsics.checkNotNullExpressionValue(var10003, a<"y">(3170, 8053607806923925768L ^ var5));
var13[0] = var10003;
class_2338 var10002 = class_2338.method_49637(var10.field_1323, var8, var10.field_1324 - var11);
Intrinsics.checkNotNullExpressionValue(var10002, a<"y">(3170, 8053607806923925768L ^ var5));
var13[1] = var10002;
var10002 = class_2338.method_49637(var10.field_1320 - var11, var8, var10.field_1321);
Intrinsics.checkNotNullExpressionValue(var10002, a<"y">(3170, 8053607806923925768L ^ var5));
var13[2] = var10002;
var10002 = class_2338.method_49637(var10.field_1320 - var11, var8, var10.field_1324 - var11);
Intrinsics.checkNotNullExpressionValue(var10002, a<"y">(3170, 8053607806923925768L ^ var5));
var13[3] = var10002;
Set var12 = SetsKt.setOf(var13);

try {
List var10000 = CollectionsKt.toList(var12);
if (vm.a<"Å">(2914369069671593696L, var5) != null) {
vm.a<"Å">("ke0kob", 2940917686638559295L, var5);
}

return var10000;
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 2922763144362007995L, var5);
}
}

public final boolean t(@NotNull class_243 from, @NotNull class_243 to, long a) {
ax = a ^ ax;
long var5 = ax ^ 70744641310046L;

try {
Intrinsics.checkNotNullParameter(from, a<"y">(17558, 5307354371091869872L ^ ax));
Intrinsics.checkNotNullParameter(to, a<"y">(30954, 314300597446020303L ^ ax));
if (la.R(la.l, from, to, false, null, false, b<"e">(8156, 6688894368250581458L ^ ax), null, var5) == null) {
return true;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 4161780839561563381L, ax);
}

return false;
}

public final boolean L(long a, @NotNull class_1657 $this$isPartlyInWeb, boolean checkFace) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/bi.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 24351200685789
// 0b: lxor
// 0c: dup2
// 0d: bipush 56
// 0f: lushr
// 10: l2i
// 11: istore 5
// 13: dup2
// 14: bipush 8
// 16: lshl
// 17: bipush 8
// 19: lushr
// 1a: lstore 6
// 1c: pop2
// 1d: dup2
// 1e: ldc2_w 131390598877307
// 21: lxor
// 22: lstore 8
// 24: pop2
// 25: ldc2_w -194657540986388891
// 28: lload 1
// 29: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: aload 3
// 2f: sipush 14008
// 32: ldc2_w 982282590286939975
// 35: lload 1
// 36: lxor
// 37: invokedynamic y (IJ)Ljava/lang/String; bsm=su/catlean/bi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 3f: astore 10
// 41: lload 8
// 43: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 46: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 49: iload 5
// 4b: i2b
// 4c: lload 6
// 4e: aload 3
// 4f: checkcast net/minecraft/class_1297
// 52: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 55: checkcast net/minecraft/class_2374
// 58: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 5b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 5e: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// 61: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
// 64: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 67: aload 10
// 69: ifnull 7e
// 6c: ifeq e2
// 6f: goto 7c
// 72: ldc2_w -280192923890497240
// 75: lload 1
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: iload 4
// 7e: aload 10
// 80: ifnull df
// 83: ifeq de
// 86: goto 93
// 89: ldc2_w -280192923890497240
// 8c: lload 1
// 8d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92: athrow
// 93: lload 8
// 95: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 98: getstatic su/catlean/_x.I Lsu/catlean/_x;
// 9b: iload 5
// 9d: i2b
// 9e: lload 6
// a0: aload 3
// a1: checkcast net/minecraft/class_1297
// a4: invokevirtual su/catlean/_x.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// a7: checkcast net/minecraft/class_2374
// aa: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// ad: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
// b0: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// b3: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
// b6: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
// b9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// bc: aload 10
// be: ifnull df
// c1: goto ce
// c4: ldc2_w -280192923890497240
// c7: lload 1
// c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cd: athrow
// ce: ifeq e2
// d1: goto de
// d4: ldc2_w -280192923890497240
// d7: lload 1
// d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// dd: athrow
// de: bipush 1
// df: goto e3
// e2: bipush 0
// e3: ireturn
}

public final boolean T(@NotNull class_1657 $this$isPartlyInBerry, long a) {
ax = a ^ ax;
int var4 = (int)((ax ^ 27098626271770L) >>> 56);
long var5 = (ax ^ 27098626271770L) << 8 >>> 8;
long var7 = ax ^ 134136504095932L;
Intrinsics.checkNotNullParameter($this$isPartlyInBerry, a<"y">(24404, 7305477474000726633L ^ ax));
return Intrinsics.areEqual(
zf.z(var7).method_8320(class_2338.method_49638((class_2374)_x.I.J((byte)var4, var5, (class_1297)$this$isPartlyInBerry))).method_26204(), class_2246.field_16999
);
}

static {
long var20 = a ^ 80451334492750L;
vm.a<"Å">(false, 667126685164579411L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[8];
int var16 = 0;
String var15 = "\u009d\\Ùv\u0095G¸§b_öÎ\u0013L\u008e§h{P89¨Ñr:O\u0092~ÚmÃä\f}gÉ\u0007\u000fk!\u0010·å¨\u007f¥À¼3y$¯GËQ\u0092ë\u0010\u000f\u008d~\r\u000e\u0017\u0091û\u008cBrÎ«w\u0004\u001a\u00180@\u001b\u001fàË\u0082\u009aPWåîâ5Ý ¥E*¡\u0099J\u007fÇ ¶B\u009e(fX±¶÷<\u0082µ\u000e§Ê¥!ùú\u000fdñ|Z>Ó\u0085W¯Þ\b\u0095\u0010ØöY#äMë3i\u008ei\u008dp\u009c\u000eÏ";
int var17 = "\u009d\\Ùv\u0095G¸§b_öÎ\u0013L\u008e§h{P89¨Ñr:O\u0092~ÚmÃä\f}gÉ\u0007\u000fk!\u0010·å¨\u007f¥À¼3y$¯GËQ\u0092ë\u0010\u000f\u008d~\r\u000e\u0017\u0091û\u008cBrÎ«w\u0004\u001a\u00180@\u001b\u001fàË\u0082\u009aPWåîâ5Ý ¥E*¡\u0099J\u007fÇ ¶B\u009e(fX±¶÷<\u0082µ\u000e§Ê¥!ùú\u000fdñ|Z>Ó\u0085W¯Þ\b\u0095\u0010ØöY#äMë3i\u008ei\u008dp\u009c\u000eÏ"
.length();
char var14 = '(';
int var23 = -1;

label45:
while (true) {
String var24 = var15.substring(++var23, var23 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var33;
if ((var23 += var14) >= var17) {
b = var18;
c = new String[8];
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
String var4 = "SMI\u0003¿\t\u0004\u0081>ÇC\u0087E\u0094\u0016÷}ìYéÆ ÷þ";
int var5 = "SMI\u0003¿\t\u0004\u0081>ÇC\u0087E\u0094\u0016÷}ìYéÆ ÷þ".length();
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
byte var38 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
f = new Integer[3];
x = new bi();
return;
}

var14 = var15.charAt(var23);
break;
default:
var18[var16++] = var33;
if ((var23 += var14) < var17) {
var14 = var15.charAt(var23);
continue label45;
}

var15 = "\u009eix\u009d\u009fç×Åþ\nò\"\u007fí\u0005\u0089\u0010sF3\u0093ª\t£yQD\u0087]\u009dglO";
var17 = "\u009eix\u009d\u009fç×Åþ\nò\"\u007fí\u0005\u0089\u0010sF3\u0093ª\t£yQD\u0087]\u009dglO".length();
var14 = 16;
var23 = -1;
}

var24 = var15.substring(++var23, var23 + var14);
var10001 = 0;
}
}
}

public static void y(boolean var0) {
Y = var0;
}

public static boolean k() {
return Y;
}

public static boolean Y() {
boolean var0 = k();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19534;
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
throw new RuntimeException("su/catlean/bi", var10);
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
throw new RuntimeException("su/catlean/bi" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 30304;
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
throw new RuntimeException("su/catlean/bi", var14);
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
throw new RuntimeException("su/catlean/bi" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
