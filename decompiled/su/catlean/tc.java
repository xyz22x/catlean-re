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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class tc implements b4 {
@NotNull
public static final tc s;
@NotNull
private static Function0 m;
@NotNull
private static Function0 X;
private static final long a = yz.a(6133856104906453840L, -2501179907936501617L, MethodHandles.lookup().lookupClass()).a(149998217995249L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private tc() {
}

@NotNull
public final Function0 h() {
return m;
}

public final void i(short a, @NotNull Function0 <set-?>, char a, int a) {
long var5 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(<set-?>, a<"i">(14816, 8512057891988436723L ^ var5));
m = <set-?>;
}

@NotNull
public final Function0 T() {
return X;
}

public final void Y(long a, @NotNull Function0 <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"i">(1008, 4401351576574262025L ^ ax));
X = <set-?>;
}

@Override
public void Q(int var1, long var2) {
}

@Override
public void P(@NotNull _w rotation, short a, int a, int a) {
long var5 = (long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48;
long var7 = var5 ^ 51433702095905L;
Intrinsics.checkNotNullParameter(rotation, a<"i">(16593, 8912002639329686332L ^ var5));
X.invoke();
X = tc::w;
qb.a.P(1);
dm.h.F(var7);
}

@Override
public void n(long var1) {
}

public final void f(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tc.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 68316883734862
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 134282607436537
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 59371670677491
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 70326405868821
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 12480945531533
// 026: lxor
// 027: lstore 11
// 029: pop2
// 02a: ldc2_w -8232556313533300921
// 02d: lload 1
// 02e: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 033: istore 13
// 035: getstatic su/catlean/um.E Lsu/catlean/um;
// 038: lload 5
// 03a: invokevirtual su/catlean/um.T (J)Z
// 03d: iload 13
// 03f: ifeq 065
// 042: ifeq 173
// 045: goto 052
// 048: ldc2_w -8267138292016516723
// 04b: lload 1
// 04c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 051: athrow
// 052: aload 0
// 053: lload 9
// 055: invokevirtual su/catlean/tc.I (J)I
// 058: goto 065
// 05b: ldc2_w -8267138292016516723
// 05e: lload 1
// 05f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: athrow
// 065: istore 14
// 067: iload 14
// 069: iload 13
// 06b: lload 1
// 06c: lconst_0
// 06d: lcmp
// 06e: ifle 09e
// 071: ifeq 09c
// 074: bipush -1
// 075: if_icmpeq 173
// 078: goto 085
// 07b: ldc2_w -8267138292016516723
// 07e: lload 1
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: lload 3
// 086: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 089: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 08c: instanceof net/minecraft/class_495
// 08f: goto 09c
// 092: ldc2_w -8267138292016516723
// 095: lload 1
// 096: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09b: athrow
// 09c: iload 13
// 09e: lload 1
// 09f: lconst_0
// 0a0: lcmp
// 0a1: ifle 0d0
// 0a4: ifeq 0ce
// 0a7: ifne 0e7
// 0aa: goto 0b7
// 0ad: ldc2_w -8267138292016516723
// 0b0: lload 1
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: lload 3
// 0b8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0bb: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0be: instanceof net/minecraft/class_476
// 0c1: goto 0ce
// 0c4: ldc2_w -8267138292016516723
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: iload 13
// 0d0: ifeq 0e4
// 0d3: ifne 0e7
// 0d6: goto 0e3
// 0d9: ldc2_w -8267138292016516723
// 0dc: lload 1
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: bipush 1
// 0e4: goto 0e8
// 0e7: bipush 0
// 0e8: istore 15
// 0ea: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 0ed: lload 7
// 0ef: invokevirtual su/catlean/dm.D (J)V
// 0f2: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 0f5: lload 11
// 0f7: bipush 2
// 0f8: bipush 0
// 0f9: bipush 0
// 0fa: invokedynamic run ()Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/tc.m ()V, ()V ]
// 0ff: sipush 13292
// 102: ldc2_w 8054118109651523074
// 105: lload 1
// 106: lxor
// 107: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: aconst_null
// 10d: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 110: iload 14
// 112: lload 1
// 113: lconst_0
// 114: lcmp
// 115: ifle 157
// 118: sipush 2553
// 11b: ldc2_w 7767759170583063569
// 11e: lload 1
// 11f: lxor
// 120: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: iload 13
// 127: ifeq 156
// 12a: if_icmpge 15a
// 12d: goto 13a
// 130: ldc2_w -8267138292016516723
// 133: lload 1
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: iload 14
// 13c: sipush 187
// 13f: ldc2_w 6590502996195599709
// 142: lload 1
// 143: lxor
// 144: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: goto 156
// 14c: ldc2_w -8267138292016516723
// 14f: lload 1
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: iadd
// 157: goto 15c
// 15a: iload 14
// 15c: istore 16
// 15e: iload 16
// 160: iload 15
// 162: invokedynamic invoke (IZ)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/tc.y (IZ)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 167: astore 17
// 169: aload 17
// 16b: putstatic su/catlean/tc.m Lkotlin/jvm/functions/Function0;
// 16e: aload 17
// 170: putstatic su/catlean/tc.X Lkotlin/jvm/functions/Function0;
// 173: return
}

public final int I(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tc.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 120839892405016
// 00b: lxor
// 00c: lstore 3
// 00d: pop2
// 00e: ldc2_w 6462778467653937975
// 011: lload 1
// 012: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 017: bipush -1
// 018: istore 6
// 01a: dconst_0
// 01b: dstore 7
// 01d: bipush 0
// 01e: istore 9
// 020: istore 5
// 022: iload 9
// 024: sipush 8776
// 027: ldc2_w 2864389187952448479
// 02a: lload 1
// 02b: lxor
// 02c: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 031: if_icmpge 39e
// 034: iload 9
// 036: sipush 3231
// 039: ldc2_w 3155732151440325890
// 03c: lload 1
// 03d: lxor
// 03e: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 043: iload 5
// 045: ifeq 3bf
// 048: if_icmpne 1ee
// 04b: goto 058
// 04e: ldc2_w 6428126397993035261
// 051: lload 1
// 052: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: athrow
// 058: lload 3
// 059: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 05c: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
// 05f: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 062: invokeinterface net/minecraft/class_9323.iterator ()Ljava/util/Iterator; 1
// 067: dup
// 068: sipush 19914
// 06b: ldc2_w 7736428657058971586
// 06e: lload 1
// 06f: lxor
// 070: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 078: astore 10
// 07a: aload 10
// 07c: invokeinterface java/util/Iterator.hasNext ()Z 1
// 081: ifeq 390
// 084: aload 10
// 086: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 08b: dup
// 08c: sipush 18279
// 08f: ldc2_w 2771574646703289697
// 092: lload 1
// 093: lxor
// 094: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 09c: checkcast net/minecraft/class_9336
// 09f: astore 11
// 0a1: aload 11
// 0a3: invokevirtual net/minecraft/class_9336.comp_2443 ()Lnet/minecraft/class_9331;
// 0a6: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 0a9: sipush 29329
// 0ac: ldc2_w 1743963572768948373
// 0af: lload 1
// 0b0: lxor
// 0b1: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0b9: iload 5
// 0bb: ifeq 0db
// 0be: ifeq 07a
// 0c1: aload 11
// 0c3: invokevirtual net/minecraft/class_9336.comp_2444 ()Ljava/lang/Object;
// 0c6: iload 5
// 0c8: ifeq 0f4
// 0cb: instanceof net/minecraft/class_9285
// 0ce: goto 0db
// 0d1: ldc2_w 6428126397993035261
// 0d4: lload 1
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: ifeq 07a
// 0de: aload 11
// 0e0: invokevirtual net/minecraft/class_9336.comp_2444 ()Ljava/lang/Object;
// 0e3: dup
// 0e4: sipush 25099
// 0e7: ldc2_w 4083916920932323357
// 0ea: lload 1
// 0eb: lxor
// 0ec: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0f4: checkcast net/minecraft/class_9285
// 0f7: invokevirtual net/minecraft/class_9285.comp_2393 ()Ljava/util/List;
// 0fa: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 0ff: astore 12
// 101: aload 12
// 103: invokeinterface java/util/Iterator.hasNext ()Z 1
// 108: ifeq 07a
// 10b: aload 12
// 10d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 112: dup
// 113: sipush 16747
// 116: ldc2_w 7978999328776975205
// 119: lload 1
// 11a: lxor
// 11b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 123: checkcast net/minecraft/class_9285$class_9287
// 126: astore 13
// 128: aload 13
// 12a: iload 5
// 12c: lload 1
// 12d: lconst_0
// 12e: lcmp
// 12f: ifle 2cd
// 132: lload 1
// 133: lconst_0
// 134: lcmp
// 135: ifle 19d
// 138: ifeq 195
// 13b: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
// 13e: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 143: checkcast net/minecraft/class_1320
// 146: invokevirtual net/minecraft/class_1320.method_26830 ()Ljava/lang/String;
// 149: dup
// 14a: sipush 24770
// 14d: ldc2_w 7891449741589435077
// 150: lload 1
// 151: lxor
// 152: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15a: checkcast java/lang/CharSequence
// 15d: sipush 21174
// 160: ldc2_w 4473549725661323447
// 163: lload 1
// 164: lxor
// 165: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: checkcast java/lang/CharSequence
// 16d: bipush 0
// 16e: bipush 2
// 16f: aconst_null
// 170: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 173: iload 5
// 175: ifeq 0b9
// 178: lload 1
// 179: lconst_0
// 17a: lcmp
// 17b: ifle 081
// 17e: goto 18b
// 181: ldc2_w 6428126397993035261
// 184: lload 1
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: iload 5
// 18d: ifeq 081
// 190: ifeq 101
// 193: aload 13
// 195: lload 1
// 196: lconst_0
// 197: lcmp
// 198: ifle 1b8
// 19b: iload 5
// 19d: ifeq 1b8
// 1a0: invokevirtual net/minecraft/class_9285$class_9287.comp_2397 ()Lnet/minecraft/class_9274;
// 1a3: getstatic net/minecraft/class_9274.field_49218 Lnet/minecraft/class_9274;
// 1a6: if_acmpne 101
// 1a9: goto 1b6
// 1ac: ldc2_w 6428126397993035261
// 1af: lload 1
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: aload 13
// 1b8: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
// 1bb: invokevirtual net/minecraft/class_1322.comp_2449 ()D
// 1be: dload 7
// 1c0: dcmpl
// 1c1: lload 1
// 1c2: lconst_0
// 1c3: lcmp
// 1c4: ifle 1eb
// 1c7: iload 5
// 1c9: ifeq 1e7
// 1cc: ifle 101
// 1cf: goto 1dc
// 1d2: ldc2_w 6428126397993035261
// 1d5: lload 1
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: aload 13
// 1de: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
// 1e1: invokevirtual net/minecraft/class_1322.comp_2449 ()D
// 1e4: dstore 7
// 1e6: bipush -1
// 1e7: istore 6
// 1e9: iload 5
// 1eb: ifne 101
// 1ee: lload 3
// 1ef: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1f2: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1f5: iload 9
// 1f7: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 1fa: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 1fd: invokeinterface net/minecraft/class_9323.iterator ()Ljava/util/Iterator; 1
// 202: dup
// 203: sipush 19201
// 206: ldc2_w 6571806182549223681
// 209: lload 1
// 20a: lxor
// 20b: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 213: lload 1
// 214: lconst_0
// 215: lcmp
// 216: iflt 078
// 219: astore 10
// 21b: aload 10
// 21d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 222: ifeq 390
// 225: aload 10
// 227: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 22c: dup
// 22d: sipush 16747
// 230: ldc2_w 7978999328776975205
// 233: lload 1
// 234: lxor
// 235: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 23d: checkcast net/minecraft/class_9336
// 240: astore 11
// 242: aload 11
// 244: invokevirtual net/minecraft/class_9336.comp_2443 ()Lnet/minecraft/class_9331;
// 247: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 24a: sipush 28135
// 24d: ldc2_w 5991601414510829552
// 250: lload 1
// 251: lxor
// 252: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 257: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 25a: iload 5
// 25c: ifeq 27c
// 25f: ifeq 21b
// 262: aload 11
// 264: invokevirtual net/minecraft/class_9336.comp_2444 ()Ljava/lang/Object;
// 267: iload 5
// 269: ifeq 295
// 26c: instanceof net/minecraft/class_9285
// 26f: goto 27c
// 272: ldc2_w 6428126397993035261
// 275: lload 1
// 276: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27b: athrow
// 27c: ifeq 21b
// 27f: aload 11
// 281: invokevirtual net/minecraft/class_9336.comp_2444 ()Ljava/lang/Object;
// 284: dup
// 285: sipush 9718
// 288: ldc2_w 5856996460337666047
// 28b: lload 1
// 28c: lxor
// 28d: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 292: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 295: checkcast net/minecraft/class_9285
// 298: invokevirtual net/minecraft/class_9285.comp_2393 ()Ljava/util/List;
// 29b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 2a0: astore 12
// 2a2: aload 12
// 2a4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2a9: ifeq 21b
// 2ac: aload 12
// 2ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2b3: dup
// 2b4: sipush 16747
// 2b7: ldc2_w 7978999328776975205
// 2ba: lload 1
// 2bb: lxor
// 2bc: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c4: checkcast net/minecraft/class_9285$class_9287
// 2c7: astore 13
// 2c9: aload 13
// 2cb: iload 5
// 2cd: lload 1
// 2ce: lconst_0
// 2cf: lcmp
// 2d0: ifle 269
// 2d3: lload 1
// 2d4: lconst_0
// 2d5: lcmp
// 2d6: ifle 33e
// 2d9: ifeq 336
// 2dc: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
// 2df: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 2e4: checkcast net/minecraft/class_1320
// 2e7: invokevirtual net/minecraft/class_1320.method_26830 ()Ljava/lang/String;
// 2ea: dup
// 2eb: sipush 5848
// 2ee: ldc2_w 8416647006209385687
// 2f1: lload 1
// 2f2: lxor
// 2f3: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2fb: checkcast java/lang/CharSequence
// 2fe: sipush 23963
// 301: ldc2_w 3869536259428478864
// 304: lload 1
// 305: lxor
// 306: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30b: checkcast java/lang/CharSequence
// 30e: bipush 0
// 30f: bipush 2
// 310: aconst_null
// 311: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 314: iload 5
// 316: ifeq 25a
// 319: lload 1
// 31a: lconst_0
// 31b: lcmp
// 31c: iflt 222
// 31f: goto 32c
// 322: ldc2_w 6428126397993035261
// 325: lload 1
// 326: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32b: athrow
// 32c: iload 5
// 32e: ifeq 222
// 331: ifeq 2a2
// 334: aload 13
// 336: lload 1
// 337: lconst_0
// 338: lcmp
// 339: ifle 359
// 33c: iload 5
// 33e: ifeq 359
// 341: invokevirtual net/minecraft/class_9285$class_9287.comp_2397 ()Lnet/minecraft/class_9274;
// 344: getstatic net/minecraft/class_9274.field_49218 Lnet/minecraft/class_9274;
// 347: if_acmpne 2a2
// 34a: goto 357
// 34d: ldc2_w 6428126397993035261
// 350: lload 1
// 351: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 356: athrow
// 357: aload 13
// 359: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
// 35c: invokevirtual net/minecraft/class_1322.comp_2449 ()D
// 35f: dload 7
// 361: dcmpl
// 362: lload 1
// 363: lconst_0
// 364: lcmp
// 365: ifle 38d
// 368: iload 5
// 36a: ifeq 389
// 36d: ifle 2a2
// 370: goto 37d
// 373: ldc2_w 6428126397993035261
// 376: lload 1
// 377: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37c: athrow
// 37d: aload 13
// 37f: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
// 382: invokevirtual net/minecraft/class_1322.comp_2449 ()D
// 385: dstore 7
// 387: iload 9
// 389: istore 6
// 38b: iload 5
// 38d: ifne 2a2
// 390: iinc 9 1
// 393: iload 5
// 395: lload 1
// 396: lconst_0
// 397: lcmp
// 398: ifle 222
// 39b: ifne 022
// 39e: iload 6
// 3a0: iload 5
// 3a2: lload 1
// 3a3: lconst_0
// 3a4: lcmp
// 3a5: ifle 043
// 3a8: lload 1
// 3a9: lconst_0
// 3aa: lcmp
// 3ab: iflt 3b2
// 3ae: ifeq 4de
// 3b1: bipush -1
// 3b2: goto 3bf
// 3b5: ldc2_w 6428126397993035261
// 3b8: lload 1
// 3b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3be: athrow
// 3bf: if_icmpne 4dc
// 3c2: bipush 0
// 3c3: istore 9
// 3c5: iload 9
// 3c7: sipush 20253
// 3ca: ldc2_w 5485781600322125447
// 3cd: lload 1
// 3ce: lxor
// 3cf: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d4: if_icmpge 4dc
// 3d7: lload 3
// 3d8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 3db: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 3de: iload 9
// 3e0: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
// 3e3: invokevirtual net/minecraft/class_1799.method_57353 ()Lnet/minecraft/class_9323;
// 3e6: dup
// 3e7: sipush 29612
// 3ea: ldc2_w 6920860799595495846
// 3ed: lload 1
// 3ee: lxor
// 3ef: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3f7: checkcast java/lang/Iterable
// 3fa: astore 10
// 3fc: bipush 0
// 3fd: istore 11
// 3ff: aload 10
// 401: iload 5
// 403: ifeq 467
// 406: instanceof java/util/Collection
// 409: iload 5
// 40b: ifeq 4de
// 40e: goto 41b
// 411: ldc2_w 6428126397993035261
// 414: lload 1
// 415: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41a: athrow
// 41b: ifeq 465
// 41e: goto 42b
// 421: ldc2_w 6428126397993035261
// 424: lload 1
// 425: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42a: athrow
// 42b: aload 10
// 42d: checkcast java/util/Collection
// 430: iload 5
// 432: ifeq 467
// 435: goto 442
// 438: ldc2_w 6428126397993035261
// 43b: lload 1
// 43c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 441: athrow
// 442: invokeinterface java/util/Collection.isEmpty ()Z 1
// 447: ifeq 465
// 44a: goto 457
// 44d: ldc2_w 6428126397993035261
// 450: lload 1
// 451: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 456: athrow
// 457: bipush 0
// 458: goto 4cd
// 45b: ldc2_w 6428126397993035261
// 45e: lload 1
// 45f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 464: athrow
// 465: aload 10
// 467: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 46c: astore 12
// 46e: aload 12
// 470: invokeinterface java/util/Iterator.hasNext ()Z 1
// 475: ifeq 4cc
// 478: aload 12
// 47a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 47f: astore 13
// 481: aload 13
// 483: checkcast net/minecraft/class_9336
// 486: astore 14
// 488: bipush 0
// 489: istore 15
// 48b: aload 14
// 48d: invokevirtual net/minecraft/class_9336.toString ()Ljava/lang/String;
// 490: dup
// 491: sipush 30641
// 494: ldc2_w 6144986338281571762
// 497: lload 1
// 498: lxor
// 499: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4a1: checkcast java/lang/CharSequence
// 4a4: sipush 317
// 4a7: ldc2_w 4499397662091883320
// 4aa: lload 1
// 4ab: lxor
// 4ac: invokedynamic i (IJ)Ljava/lang/String; bsm=su/catlean/tc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b1: checkcast java/lang/CharSequence
// 4b4: bipush 0
// 4b5: bipush 2
// 4b6: aconst_null
// 4b7: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 4ba: ifeq 46e
// 4bd: bipush 1
// 4be: lload 1
// 4bf: lconst_0
// 4c0: lcmp
// 4c1: ifle 4ba
// 4c4: iload 5
// 4c6: ifeq 4ba
// 4c9: goto 4cd
// 4cc: bipush 0
// 4cd: ifeq 4d4
// 4d0: iload 9
// 4d2: istore 6
// 4d4: iinc 9 1
// 4d7: iload 5
// 4d9: ifne 3c5
// 4dc: iload 6
// 4de: ireturn
}

public final void S() {
m.invoke();
m = tc::z;
}

private static final Unit p() {
return Unit.INSTANCE;
}

private static final Unit E() {
return Unit.INSTANCE;
}

private static final Unit w() {
return Unit.INSTANCE;
}

private static final void m() {
long var0 = a ^ 70370492559850L;
long var2 = var0 ^ 95625243553081L;
dm.h.F(var2);
}

private static final Unit y(int param0, boolean param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/tc.a J
// 03: ldc2_w 127186579379079
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 87765350580788
// 0d: lxor
// 0e: lstore 4
// 10: dup2
// 11: ldc2_w 89080102069823
// 14: lxor
// 15: lstore 6
// 17: dup2
// 18: ldc2_w 2534986021261
// 1b: lxor
// 1c: lstore 8
// 1e: pop2
// 1f: ldc2_w 3108901491870669218
// 22: lload 2
// 23: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 2b: bipush 1
// 2c: invokevirtual su/catlean/_n.m (Z)V
// 2f: istore 10
// 31: lload 8
// 33: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 36: getfield net/minecraft/class_746.field_7512 Lnet/minecraft/class_1703;
// 39: invokevirtual net/minecraft/class_1703.method_34255 ()Lnet/minecraft/class_1799;
// 3c: invokevirtual net/minecraft/class_1799.method_7960 ()Z
// 3f: iload 10
// 41: ifeq 85
// 44: ifne 84
// 47: goto 54
// 4a: ldc2_w 3143553564249675624
// 4d: lload 2
// 4e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53: athrow
// 54: sipush 27940
// 57: ldc2_w 7763999658184814120
// 5a: lload 2
// 5b: lxor
// 5c: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61: lload 6
// 63: bipush 0
// 64: aconst_null
// 65: bipush 0
// 66: sipush 7419
// 69: ldc2_w 3848521581975560177
// 6c: lload 2
// 6d: lxor
// 6e: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73: aconst_null
// 74: invokestatic su/catlean/ag.e (IJILnet/minecraft/class_1713;ZILjava/lang/Object;)V
// 77: goto 84
// 7a: ldc2_w 3143553564249675624
// 7d: lload 2
// 7e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 83: athrow
// 84: iload 0
// 85: sipush 8279
// 88: ldc2_w 5667788938804093790
// 8b: lload 2
// 8c: lxor
// 8d: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
// 95: iload 1
// 96: lload 4
// 98: invokestatic su/catlean/ag.r (IILnet/minecraft/class_1713;ZJ)V
// 9b: getstatic su/catlean/_n.e Lsu/catlean/_n;
// 9e: bipush 0
// 9f: invokevirtual su/catlean/_n.m (Z)V
// a2: getstatic su/catlean/qb.a Lsu/catlean/qb;
// a5: sipush 2420
// a8: ldc2_w 8884636087446325882
// ab: lload 2
// ac: lxor
// ad: invokedynamic r (IJ)I bsm=su/catlean/tc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b2: invokevirtual su/catlean/qb.P (I)V
// b5: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// b8: areturn
}

private static final Unit z() {
return Unit.INSTANCE;
}

static {
long var11 = a ^ 126497688771329L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[18];
int var18 = 0;
String var17 = "½\u008c>\u009cèê*Ø\\\u0095½Qµµ\u0006]ªÿ\u0098§,\u009e+Ô(\bÜÔz¬ÒÊ*\u001a\u0090\u0095\u009bÃÑ\u0086\u0095Ìq*¸\u0095Nèw Ý;4Í±Îàÿ`8èe\u001bÿ!8\u0098ìµ'\u008a6g\u0090ké`SË\u008bY \u0091\u0003ý\u0007Yª\u0087«<x/\u001a\u0084\u00adY¬VILÀº-\tù\u0088\u009bU4\u007fF\u0004Ç:\u009f|â\u0095¥\u0001Â rÈ³£\u0001á²\u009fÿ\u0084\u001d£\u0011uºlÜØ\u009e§)\u0091)\u008ck\u0086&\u0081ÔÁs\u009e\u0010<\u009c\u0085·;\u007f\u0001a3\u0000e\u000f\"\u0007.\u0000 &%¤ORò§Ý2!»\u0012\u0002(`Ý\u0005¬c½'Ì%PÿÆ+\u0005:y¸\u001d Ñ\u0005\u0080ú\u0004sÓa;<¶v£û#®Êç\u001bäá÷ÏTåùÅê\u001cÆùµ\u0018\u0000»M?\td\u008e=T_+´ÃÒ|h)8$lµ\u009a\u009d\u0097\u0018NÙ\fXRæY\u0000>@64j\u0094ªí°Úíxa\u008awò(\u0080¡\u0010¶üÒ\u0017V±\u000bVïm~\u00ad\u0004\u0095·ð\u0002Ç\u00adÕb\u0097ÔKmò\u0085ó\u008dÙ)t³lå\u0096o\u0010ûÈohÓä\u00adr}bï\u001d<çt\u0015 a5µ\u000e;\u0004#ÝC°F\u00ad¦ÞÕ\u0012Q¤OyH\u00910Þ\u000bZç½\u00859ª~ :Åx¤ã1ÚÑÊÒ\u009f\u009faÑ\u007fê´|ÙÝh\u0080zV)dÈs\u000f±MR\u0018\u0005\u0090MíýZºNzyáJ´íMý\u000fkÂð/v\u0099Ï ß¾c¹<y\u0006l§V\u009c\u0095!nM\u0080/7\u008f\u0019àü\u0000cÍ¤\u0087×îè\"¸\u0098&þ)5;0$x¡\u008fxXÝs¥U£%úû\u0014\u0018!b\u001ea\u001cÝ¾&UFëM\n\":@RTg ì¢\u0012\u0019â\u0083ÄÐË\f]\u0016R8ðÝ9É<Q9 6Ø%P\u0018,Y\u0081R\"Cy¨¼\u0092¤6\nîjt\u0082\t¬x{-¾ç\\{Öæ\u0001jªÌ\u0090Î\u0019B_iô§\u001c.4ÐcË¬^Ö9I\u001cÔ\u0098R'\u009a\u00980®\u0019¶B%Õ\u0019\u0093Uóù\u001fì\u0005d\\Ýë¥I\u0010¢<\u0002";
int var19 = "½\u008c>\u009cèê*Ø\\\u0095½Qµµ\u0006]ªÿ\u0098§,\u009e+Ô(\bÜÔz¬ÒÊ*\u001a\u0090\u0095\u009bÃÑ\u0086\u0095Ìq*¸\u0095Nèw Ý;4Í±Îàÿ`8èe\u001bÿ!8\u0098ìµ'\u008a6g\u0090ké`SË\u008bY \u0091\u0003ý\u0007Yª\u0087«<x/\u001a\u0084\u00adY¬VILÀº-\tù\u0088\u009bU4\u007fF\u0004Ç:\u009f|â\u0095¥\u0001Â rÈ³£\u0001á²\u009fÿ\u0084\u001d£\u0011uºlÜØ\u009e§)\u0091)\u008ck\u0086&\u0081ÔÁs\u009e\u0010<\u009c\u0085·;\u007f\u0001a3\u0000e\u000f\"\u0007.\u0000 &%¤ORò§Ý2!»\u0012\u0002(`Ý\u0005¬c½'Ì%PÿÆ+\u0005:y¸\u001d Ñ\u0005\u0080ú\u0004sÓa;<¶v£û#®Êç\u001bäá÷ÏTåùÅê\u001cÆùµ\u0018\u0000»M?\td\u008e=T_+´ÃÒ|h)8$lµ\u009a\u009d\u0097\u0018NÙ\fXRæY\u0000>@64j\u0094ªí°Úíxa\u008awò(\u0080¡\u0010¶üÒ\u0017V±\u000bVïm~\u00ad\u0004\u0095·ð\u0002Ç\u00adÕb\u0097ÔKmò\u0085ó\u008dÙ)t³lå\u0096o\u0010ûÈohÓä\u00adr}bï\u001d<çt\u0015 a5µ\u000e;\u0004#ÝC°F\u00ad¦ÞÕ\u0012Q¤OyH\u00910Þ\u000bZç½\u00859ª~ :Åx¤ã1ÚÑÊÒ\u009f\u009faÑ\u007fê´|ÙÝh\u0080zV)dÈs\u000f±MR\u0018\u0005\u0090MíýZºNzyáJ´íMý\u000fkÂð/v\u0099Ï ß¾c¹<y\u0006l§V\u009c\u0095!nM\u0080/7\u008f\u0019àü\u0000cÍ¤\u0087×îè\"¸\u0098&þ)5;0$x¡\u008fxXÝs¥U£%úû\u0014\u0018!b\u001ea\u001cÝ¾&UFëM\n\":@RTg ì¢\u0012\u0019â\u0083ÄÐË\f]\u0016R8ðÝ9É<Q9 6Ø%P\u0018,Y\u0081R\"Cy¨¼\u0092¤6\nîjt\u0082\t¬x{-¾ç\\{Öæ\u0001jªÌ\u0090Î\u0019B_iô§\u001c.4ÐcË¬^Ö9I\u001cÔ\u0098R'\u009a\u00980®\u0019¶B%Õ\u0019\u0093Uóù\u001fì\u0005d\\Ýë¥I\u0010¢<\u0002"
.length();
char var16 = 24;
int var24 = -1;

label54:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var36;
if ((var24 += var16) >= var19) {
b = var20;
c = new String[18];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[10];
int var3 = 0;
String var4 = "ã\u0086\u00adS¦>`Na\tÿ4B¦çacE2Í\u0096ñg\u009d3ÝA~9|#Ð\nBm5dB%Ò67ÁHÞ1¹Ø\u0014òp\u0014\u0087\u001bîÓ¿k\u000b;un[\u0019";
int var5 = "ã\u0086\u00adS¦>`Na\tÿ4B¦çacE2Í\u0096ñg\u009d3ÝA~9|#Ð\nBm5dB%Ò67ÁHÞ1¹Ø\u0014òp\u0014\u0087\u001bîÓ¿k\u000b;un[\u0019".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
e = var6;
f = new Integer[10];
s = new tc();
m = tc::p;
X = tc::E;
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u0080\u008dÛ\u0014 \u008dÑ¡\u0012\u0002¦*\u0017\u0088\u0086ó";
var5 = "\u0080\u008dÛ\u0014 \u008dÑ¡\u0012\u0002¦*\u0017\u0088\u0086ó".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var36;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label54;
}

var17 = "1ÔR\u008cJ»\t\u008b¾»\u0014\u0082nø¨^\\\u000fãUâ\t1@¼\u0017\u0010.¢\u008eÏ\u001f©¾Þt.É?a\u0099\u0087È\u001eÇÃ\u00817va\u009f¶q¢¶©B\bñ¤\nèì w»\u008c`\u0018Ælî`\u000b«)ía¼\u009c\u0084 \u0016>8ë¨[õ\u001e:ý\rÒ \u008aÝ&W\u0015ò%yï¦\u008cçU4\u0002\u0088Ú³»\u0090\u0005\u0000\t¾q\"õ`\u001b¾Î~Éó6\u008c8Ðüâª0L,ùôDÍ\u0085ÉG×\u0017±\u0095=lb\u0097\n\u0003\u001e`f§f\u0081ioz³m\u001bpbPy¾·¾N½q7\u001c¡wºE.";
var19 = "1ÔR\u008cJ»\t\u008b¾»\u0014\u0082nø¨^\\\u000fãUâ\t1@¼\u0017\u0010.¢\u008eÏ\u001f©¾Þt.É?a\u0099\u0087È\u001eÇÃ\u00817va\u009f¶q¢¶©B\bñ¤\nèì w»\u008c`\u0018Ælî`\u000b«)ía¼\u009c\u0084 \u0016>8ë¨[õ\u001e:ý\rÒ \u008aÝ&W\u0015ò%yï¦\u008cçU4\u0002\u0088Ú³»\u0090\u0005\u0000\t¾q\"õ`\u001b¾Î~Éó6\u008c8Ðüâª0L,ùôDÍ\u0085ÉG×\u0017±\u0095=lb\u0097\n\u0003\u001e`f§f\u0081ioz³m\u001bpbPy¾·¾N½q7\u001c¡wºE."
.length();
var16 = 136;
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
var10001 = 0;
}
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 27249;
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
throw new RuntimeException("su/catlean/tc", var10);
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
throw new RuntimeException("su/catlean/tc" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27113;
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
throw new RuntimeException("su/catlean/tc", var14);
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
throw new RuntimeException("su/catlean/tc" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
