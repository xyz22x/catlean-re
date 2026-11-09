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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class dt extends dj {
@NotNull
private final String k;
@Nullable
private Object g;
private boolean W;
private boolean a;
@NotNull
private String w;
private static int p;
private static final long c = yz.a(-9219217513324587150L, 942296700733091177L, MethodHandles.lookup().lookupClass()).a(247475559679938L);
private static final String[] i;
private static final String[] m;
private static final Map n = new HashMap(13);
private static final long[] u;
private static final Integer[] A;
private static final Map B;
private static final long C;

public dt(int a, int a, @NotNull String title, byte a) {
long var5 = ((long)axxx << 32 | (long)ax << 40 >>> 32 | (long)axx << 56 >>> 56) ^ c;
long var7 = var5 ^ 95963845695957L;
Intrinsics.checkNotNullParameter(title, b<"n">(10593, 3913483959331140908L ^ var5));
super(var7);
this.k = title;
this.W = true;
this.w = "";
}

@NotNull
protected final String x() {
return this.w;
}

protected final void I(@NotNull String <set-?>, long a) {
ax = c ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, b<"n">(11483, 2305760007214717560L ^ ax));
this.w = <set-?>;
}

@Override
public void B(@NotNull class_332 context, long a, int mouseX, int mouseY) {
long var6 = ax ^ 49135606458366L;
long var8 = ax ^ 31386901146457L;
long var10001 = ax ^ 138498907406235L;
int var10 = (int)((ax ^ 138498907406235L) >>> 32);
int var11 = (int)((ax ^ 138498907406235L) << 32 >>> 48);
int var12 = (int)(var10001 << 48 >>> 48);
long var13 = ax ^ 42294086766012L;
long var15 = ax ^ 52204105005381L;
long var17 = ax ^ 116260126008077L;
Intrinsics.checkNotNullParameter(context, b<"n">(28775, 3535944608719077988L ^ ax));
float var19 = zf.F(var6).method_22683().method_4486() / 2.0F - this.l() / 2.0F;
float var20 = zf.F(var6).method_22683().method_4502() / 2.0F - this.p() / 2.0F - 50.0F;
b8.v(var8).g(var13, context, this.k, var19 + this.l() / 2.0F, var20 + 3, e<"k">(12411, 4732257175529804104L ^ ax));
this.N(context, var19, var20, var15);
this.T(context, var19, var20, var17);
this.k(context, var10, var19, var20, mouseX, (char)var11, (short)var12, mouseY);
}

private final void N(class_332 param1, float param2, float param3, long param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dt.c J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 127910599150513
// 00e: lxor
// 00f: dup2
// 010: bipush 48
// 012: lushr
// 013: l2i
// 014: istore 6
// 016: dup2
// 017: bipush 16
// 019: lshl
// 01a: bipush 48
// 01c: lushr
// 01d: l2i
// 01e: istore 7
// 020: dup2
// 021: bipush 32
// 023: lshl
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 8
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 135823190375356
// 02f: lxor
// 030: lstore 9
// 032: dup2
// 033: ldc2_w 24018223687550
// 036: lxor
// 037: lstore 11
// 039: pop2
// 03a: ldc2_w -1476909450847350872
// 03d: lload 4
// 03f: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: aload 1
// 045: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 048: dup
// 049: sipush 1161
// 04c: ldc2_w 2857181265898055271
// 04f: lload 4
// 051: lxor
// 052: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 05a: fload 2
// 05b: ldc 4.0
// 05d: fadd
// 05e: iload 6
// 060: i2c
// 061: swap
// 062: fload 3
// 063: ldc 28.0
// 065: fadd
// 066: aload 0
// 067: invokevirtual su/catlean/dt.l ()F
// 06a: ldc 8.0
// 06c: fsub
// 06d: ldc 20.0
// 06f: ldc 4.0
// 071: fconst_0
// 072: ldc 0.1
// 074: fconst_1
// 075: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 078: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 07b: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 07e: dup
// 07f: sipush 8798
// 082: ldc2_w 1247713508160012471
// 085: lload 4
// 087: lxor
// 088: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 090: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 093: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 096: fconst_0
// 097: iload 7
// 099: i2s
// 09a: fconst_0
// 09b: iload 8
// 09d: fconst_0
// 09e: sipush 6023
// 0a1: ldc2_w 697165824351348316
// 0a4: lload 4
// 0a6: lxor
// 0a7: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: aconst_null
// 0ad: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 0b0: istore 16
// 0b2: lload 9
// 0b4: invokestatic su/catlean/b8.v (J)Lsu/catlean/c6;
// 0b7: aload 1
// 0b8: aload 0
// 0b9: iload 16
// 0bb: ifeq 0e8
// 0be: getfield su/catlean/dt.a Z
// 0c1: lload 4
// 0c3: lconst_0
// 0c4: lcmp
// 0c5: ifle 122
// 0c8: ifeq 11f
// 0cb: goto 0d9
// 0ce: ldc2_w -1451054332974502498
// 0d1: lload 4
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 0
// 0da: goto 0e8
// 0dd: ldc2_w -1451054332974502498
// 0e0: lload 4
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: getfield su/catlean/dt.w Ljava/lang/String;
// 0eb: invokestatic su/catlean/zf.A ()J
// 0ee: sipush 11312
// 0f1: ldc2_w 7580963278538284515
// 0f4: lload 4
// 0f6: lxor
// 0f7: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: i2l
// 0fd: lrem
// 0fe: getstatic su/catlean/dt.C J
// 101: lcmp
// 102: ifle 115
// 105: ldc "_"
// 107: goto 117
// 10a: ldc2_w -1451054332974502498
// 10d: lload 4
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: ldc ""
// 117: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 11c: goto 12d
// 11f: sipush 18579
// 122: ldc2_w 8244247815852321407
// 125: lload 4
// 127: lxor
// 128: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: fload 2
// 12e: ldc 8.0
// 130: fadd
// 131: fload 3
// 132: ldc 29.5
// 134: fadd
// 135: aload 0
// 136: getfield su/catlean/dt.a Z
// 139: ifeq 150
// 13c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 13f: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 142: goto 156
// 145: ldc2_w -1451054332974502498
// 148: lload 4
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 153: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 156: astore 13
// 158: fstore 14
// 15a: fstore 15
// 15c: lload 11
// 15e: fload 15
// 160: fload 14
// 162: aload 13
// 164: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 167: return
}

private final void T(class_332 param1, float param2, float param3, long param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/dt.c J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 55610656821753
// 00e: lxor
// 00f: dup2
// 010: bipush 48
// 012: lushr
// 013: l2i
// 014: istore 6
// 016: dup2
// 017: bipush 16
// 019: lshl
// 01a: bipush 48
// 01c: lushr
// 01d: l2i
// 01e: istore 7
// 020: dup2
// 021: bipush 32
// 023: lshl
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 8
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 120847207200319
// 02f: lxor
// 030: lstore 9
// 032: dup2
// 033: ldc2_w 85467259892108
// 036: lxor
// 037: lstore 11
// 039: pop2
// 03a: ldc2_w -5636060957152979488
// 03d: lload 4
// 03f: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: istore 28
// 046: aload 1
// 047: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 04a: dup
// 04b: sipush 24681
// 04e: ldc2_w 5846090232989128907
// 051: lload 4
// 053: lxor
// 054: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 059: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 05c: fload 2
// 05d: ldc 4.0
// 05f: fadd
// 060: fload 3
// 061: ldc 52.0
// 063: fadd
// 064: aload 0
// 065: invokevirtual su/catlean/dt.l ()F
// 068: ldc 8.0
// 06a: fsub
// 06b: ldc 17.0
// 06d: ldc 4.0
// 06f: fconst_2
// 070: ldc 0.1
// 072: fconst_1
// 073: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 076: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 079: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 07c: dup
// 07d: sipush 12505
// 080: ldc2_w 4677498494577887356
// 083: lload 4
// 085: lxor
// 086: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 091: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 094: fconst_0
// 095: fconst_0
// 096: fconst_0
// 097: sipush 4176
// 09a: ldc2_w 8077204918395468746
// 09d: lload 4
// 09f: lxor
// 0a0: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a5: aconst_null
// 0a6: iload 28
// 0a8: ifeq 1d8
// 0ab: astore 13
// 0ad: istore 14
// 0af: fstore 15
// 0b1: fstore 16
// 0b3: fstore 17
// 0b5: astore 18
// 0b7: astore 19
// 0b9: fstore 20
// 0bb: fstore 21
// 0bd: fstore 22
// 0bf: fstore 23
// 0c1: fstore 24
// 0c3: fstore 25
// 0c5: fstore 26
// 0c7: fstore 27
// 0c9: lload 4
// 0cb: lconst_0
// 0cc: lcmp
// 0cd: iflt 189
// 0d0: iload 6
// 0d2: i2c
// 0d3: fload 27
// 0d5: fload 26
// 0d7: fload 25
// 0d9: fload 24
// 0db: fload 23
// 0dd: fload 22
// 0df: fload 21
// 0e1: fload 20
// 0e3: aload 19
// 0e5: aload 18
// 0e7: fload 17
// 0e9: iload 7
// 0eb: i2s
// 0ec: fload 16
// 0ee: iload 8
// 0f0: fload 15
// 0f2: iload 14
// 0f4: aload 13
// 0f6: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 0f9: aload 0
// 0fa: getfield su/catlean/dt.W Z
// 0fd: ifeq 173
// 100: aload 1
// 101: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 104: dup
// 105: sipush 24681
// 108: ldc2_w 5846090232989128907
// 10b: lload 4
// 10d: lxor
// 10e: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 116: fload 2
// 117: ldc 6.0
// 119: fadd
// 11a: iload 6
// 11c: i2c
// 11d: swap
// 11e: fload 3
// 11f: ldc 54.0
// 121: fadd
// 122: aload 0
// 123: invokevirtual su/catlean/dt.l ()F
// 126: fconst_2
// 127: fdiv
// 128: ldc 8.0
// 12a: fsub
// 12b: ldc 13.0
// 12d: ldc 3.0
// 12f: fconst_2
// 130: ldc 0.1
// 132: fconst_1
// 133: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 136: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 139: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 13c: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 13f: fconst_0
// 140: iload 7
// 142: i2s
// 143: fconst_0
// 144: iload 8
// 146: fconst_0
// 147: sipush 4176
// 14a: ldc2_w 8077204918395468746
// 14d: lload 4
// 14f: lxor
// 150: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: aconst_null
// 156: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 159: lload 4
// 15b: lconst_0
// 15c: lcmp
// 15d: ifle 21f
// 160: iload 28
// 162: ifne 21f
// 165: goto 173
// 168: ldc2_w -5650725589244299306
// 16b: lload 4
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: aload 1
// 174: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 177: dup
// 178: sipush 24681
// 17b: ldc2_w 5846090232989128907
// 17e: lload 4
// 180: lxor
// 181: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 186: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 189: fload 2
// 18a: ldc 6.0
// 18c: fadd
// 18d: aload 0
// 18e: invokevirtual su/catlean/dt.l ()F
// 191: fconst_2
// 192: fdiv
// 193: fadd
// 194: bipush 4
// 195: i2f
// 196: fsub
// 197: fload 3
// 198: ldc 54.0
// 19a: fadd
// 19b: aload 0
// 19c: invokevirtual su/catlean/dt.l ()F
// 19f: fconst_2
// 1a0: fdiv
// 1a1: ldc 8.0
// 1a3: fsub
// 1a4: ldc 13.0
// 1a6: ldc 3.0
// 1a8: fconst_2
// 1a9: ldc 0.1
// 1ab: fconst_1
// 1ac: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1af: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 1b2: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1b5: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 1b8: fconst_0
// 1b9: fconst_0
// 1ba: fconst_0
// 1bb: sipush 4176
// 1be: ldc2_w 8077204918395468746
// 1c1: lload 4
// 1c3: lxor
// 1c4: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: aconst_null
// 1ca: goto 1d8
// 1cd: ldc2_w -5650725589244299306
// 1d0: lload 4
// 1d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: athrow
// 1d8: astore 13
// 1da: istore 14
// 1dc: fstore 15
// 1de: fstore 16
// 1e0: fstore 17
// 1e2: astore 18
// 1e4: astore 19
// 1e6: fstore 20
// 1e8: fstore 21
// 1ea: fstore 22
// 1ec: fstore 23
// 1ee: fstore 24
// 1f0: fstore 25
// 1f2: fstore 26
// 1f4: fstore 27
// 1f6: iload 6
// 1f8: i2c
// 1f9: fload 27
// 1fb: fload 26
// 1fd: fload 25
// 1ff: fload 24
// 201: fload 23
// 203: fload 22
// 205: fload 21
// 207: fload 20
// 209: aload 19
// 20b: aload 18
// 20d: fload 17
// 20f: iload 7
// 211: i2s
// 212: fload 16
// 214: iload 8
// 216: fload 15
// 218: iload 14
// 21a: aload 13
// 21c: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 21f: lload 9
// 221: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 224: aload 1
// 225: sipush 6777
// 228: ldc2_w 2901509131949859542
// 22b: lload 4
// 22d: lxor
// 22e: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 233: fload 2
// 234: aload 0
// 235: invokevirtual su/catlean/dt.l ()F
// 238: ldc 4.0
// 23a: fdiv
// 23b: fadd
// 23c: fload 3
// 23d: ldc 60.5
// 23f: fadd
// 240: aload 0
// 241: getfield su/catlean/dt.W Z
// 244: ifeq 25b
// 247: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 24a: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 24d: goto 261
// 250: ldc2_w -5650725589244299306
// 253: lload 4
// 255: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25a: athrow
// 25b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 25e: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 261: lload 4
// 263: lconst_0
// 264: lcmp
// 265: ifle 29e
// 268: lload 11
// 26a: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 26d: lload 9
// 26f: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 272: aload 1
// 273: sipush 15596
// 276: ldc2_w 3402394920853947467
// 279: lload 4
// 27b: lxor
// 27c: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 281: fload 2
// 282: bipush 3
// 283: i2f
// 284: aload 0
// 285: invokevirtual su/catlean/dt.l ()F
// 288: fmul
// 289: ldc 4.0
// 28b: fdiv
// 28c: fadd
// 28d: fload 3
// 28e: ldc 60.5
// 290: fadd
// 291: aload 0
// 292: getfield su/catlean/dt.W Z
// 295: ifne 2ac
// 298: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 29b: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 29e: goto 2b2
// 2a1: ldc2_w -5650725589244299306
// 2a4: lload 4
// 2a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ab: athrow
// 2ac: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2af: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 2b2: lload 11
// 2b4: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 2b7: return
}

@NotNull
protected abstract List a(long var1);

@NotNull
protected abstract String n(long var1, Object var3);

protected abstract boolean O(Object var1, long var2);

protected abstract void v(Object var1, long var2);

private final void k(class_332 param1, int param2, float param3, float param4, int param5, char param6, short param7, int param8) {
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
// 005: iload 6
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 32
// 00d: lushr
// 00e: lor
// 00f: iload 7
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/dt.c J
// 01c: lxor
// 01d: lstore 9
// 01f: lload 9
// 021: dup2
// 022: ldc2_w 126684658674524
// 025: lxor
// 026: lstore 11
// 028: dup2
// 029: ldc2_w 42717692054895
// 02c: lxor
// 02d: dup2
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 13
// 034: dup2
// 035: bipush 16
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 14
// 03e: dup2
// 03f: bipush 32
// 041: lshl
// 042: bipush 32
// 044: lushr
// 045: l2i
// 046: istore 15
// 048: pop2
// 049: dup2
// 04a: ldc2_w 78427457577376
// 04d: lxor
// 04e: lstore 16
// 050: dup2
// 051: ldc2_w 133740172225193
// 054: lxor
// 055: lstore 18
// 057: dup2
// 058: ldc2_w 53218421816994
// 05b: lxor
// 05c: lstore 20
// 05e: dup2
// 05f: ldc2_w 40837151545302
// 062: lxor
// 063: lstore 22
// 065: dup2
// 066: ldc2_w 520950749432
// 069: lxor
// 06a: lstore 24
// 06c: dup2
// 06d: ldc2_w 85649638578548
// 070: lxor
// 071: lstore 26
// 073: dup2
// 074: ldc2_w 115257080773011
// 077: lxor
// 078: lstore 28
// 07a: pop2
// 07b: ldc2_w -1343118676194442401
// 07e: lload 9
// 080: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: aload 0
// 086: aconst_null
// 087: putfield su/catlean/dt.g Ljava/lang/Object;
// 08a: istore 33
// 08c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 08f: lload 20
// 091: aload 1
// 092: new su/catlean/o7
// 095: dup
// 096: fload 3
// 097: fload 4
// 099: ldc 71.0
// 09b: fadd
// 09c: fload 3
// 09d: aload 0
// 09e: invokevirtual su/catlean/dt.l ()F
// 0a1: fadd
// 0a2: fload 4
// 0a4: aload 0
// 0a5: invokevirtual su/catlean/dt.p ()F
// 0a8: fadd
// 0a9: invokespecial su/catlean/o7.<init> (FFFF)V
// 0ac: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 0af: aload 0
// 0b0: lload 26
// 0b2: invokevirtual su/catlean/dt.a (J)Ljava/util/List;
// 0b5: checkcast java/lang/Iterable
// 0b8: astore 35
// 0ba: bipush 0
// 0bb: istore 36
// 0bd: aload 35
// 0bf: astore 37
// 0c1: new java/util/ArrayList
// 0c4: dup
// 0c5: invokespecial java/util/ArrayList.<init> ()V
// 0c8: checkcast java/util/Collection
// 0cb: astore 38
// 0cd: bipush 0
// 0ce: istore 39
// 0d0: aload 37
// 0d2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0d7: astore 40
// 0d9: aload 40
// 0db: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0e0: ifeq 1ca
// 0e3: aload 40
// 0e5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0ea: astore 41
// 0ec: aload 41
// 0ee: astore 42
// 0f0: bipush 0
// 0f1: istore 43
// 0f3: aload 0
// 0f4: getfield su/catlean/dt.W Z
// 0f7: iload 33
// 0f9: ifne 157
// 0fc: ifne 13d
// 0ff: goto 10d
// 102: ldc2_w -1368386983716689088
// 105: lload 9
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: aload 0
// 10e: aload 42
// 110: lload 22
// 112: invokevirtual su/catlean/dt.O (Ljava/lang/Object;J)Z
// 115: iload 33
// 117: iload 2
// 118: iflt 159
// 11b: ifne 157
// 11e: goto 12c
// 121: ldc2_w -1368386983716689088
// 124: lload 9
// 126: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: athrow
// 12c: ifeq 1b7
// 12f: goto 13d
// 132: ldc2_w -1368386983716689088
// 135: lload 9
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: aload 0
// 13e: getfield su/catlean/dt.w Ljava/lang/String;
// 141: checkcast java/lang/CharSequence
// 144: invokeinterface java/lang/CharSequence.length ()I 1
// 149: goto 157
// 14c: ldc2_w -1368386983716689088
// 14f: lload 9
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: iload 33
// 159: ifne 16e
// 15c: ifne 171
// 15f: goto 16d
// 162: ldc2_w -1368386983716689088
// 165: lload 9
// 167: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: athrow
// 16d: bipush 1
// 16e: goto 172
// 171: bipush 0
// 172: iload 2
// 173: iflt 18f
// 176: ifne 1b3
// 179: aload 0
// 17a: lload 11
// 17c: aload 42
// 17e: invokevirtual su/catlean/dt.n (JLjava/lang/Object;)Ljava/lang/String;
// 181: checkcast java/lang/CharSequence
// 184: aload 0
// 185: getfield su/catlean/dt.w Ljava/lang/String;
// 188: checkcast java/lang/CharSequence
// 18b: bipush 1
// 18c: invokestatic kotlin/text/StringsKt.contains (Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
// 18f: iload 33
// 191: ifne 1b4
// 194: goto 1a2
// 197: ldc2_w -1368386983716689088
// 19a: lload 9
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: ifeq 1b7
// 1a5: goto 1b3
// 1a8: ldc2_w -1368386983716689088
// 1ab: lload 9
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: athrow
// 1b3: bipush 1
// 1b4: goto 1b8
// 1b7: bipush 0
// 1b8: ifeq 0d9
// 1bb: aload 38
// 1bd: aload 41
// 1bf: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1c4: pop
// 1c5: iload 33
// 1c7: ifeq 0d9
// 1ca: aload 38
// 1cc: checkcast java/util/List
// 1cf: nop
// 1d0: astore 34
// 1d2: aload 34
// 1d4: checkcast java/lang/Iterable
// 1d7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1dc: iload 7
// 1de: ifgt 0ea
// 1e1: astore 35
// 1e3: bipush 0
// 1e4: istore 36
// 1e6: aload 35
// 1e8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1ed: ifeq 50b
// 1f0: iload 36
// 1f2: istore 37
// 1f4: iload 36
// 1f6: bipush 1
// 1f7: iadd
// 1f8: istore 36
// 1fa: aload 35
// 1fc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 201: astore 38
// 203: fload 4
// 205: ldc 78.0
// 207: fadd
// 208: iload 37
// 20a: i2f
// 20b: ldc 20.0
// 20d: fmul
// 20e: fadd
// 20f: aload 0
// 210: invokevirtual su/catlean/dt.X ()F
// 213: fadd
// 214: fstore 39
// 216: iload 6
// 218: ifle 514
// 21b: iload 33
// 21d: iload 7
// 21f: ifgt 23a
// 222: ifne 514
// 225: fload 39
// 227: fload 4
// 229: sipush 1385
// 22c: ldc2_w 5031788513208316519
// 22f: lload 9
// 231: lxor
// 232: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: i2f
// 238: fadd
// 239: fcmpg
// 23a: iload 33
// 23c: ifne 27f
// 23f: goto 24d
// 242: ldc2_w -1368386983716689088
// 245: lload 9
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: iflt 1e6
// 250: goto 25e
// 253: ldc2_w -1368386983716689088
// 256: lload 9
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: fload 39
// 260: iload 2
// 261: ifle 28b
// 264: fload 4
// 266: aload 0
// 267: invokevirtual su/catlean/dt.p ()F
// 26a: fadd
// 26b: iload 33
// 26d: ifne 28a
// 270: fcmpl
// 271: goto 27f
// 274: ldc2_w -1368386983716689088
// 277: lload 9
// 279: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27e: athrow
// 27f: ifle 285
// 282: goto 1e6
// 285: fload 3
// 286: aload 0
// 287: invokevirtual su/catlean/dt.l ()F
// 28a: fadd
// 28b: fstore 41
// 28d: iload 5
// 28f: i2f
// 290: fstore 42
// 292: fload 3
// 293: fload 42
// 295: fcmpg
// 296: iload 33
// 298: iload 7
// 29a: ifge 2c6
// 29d: ifne 2c4
// 2a0: ifgt 2ed
// 2a3: goto 2b1
// 2a6: ldc2_w -1368386983716689088
// 2a9: lload 9
// 2ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: athrow
// 2b1: fload 42
// 2b3: fload 41
// 2b5: fcmpg
// 2b6: goto 2c4
// 2b9: ldc2_w -1368386983716689088
// 2bc: lload 9
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: iload 33
// 2c6: ifne 2ea
// 2c9: ifgt 2e9
// 2cc: goto 2da
// 2cf: ldc2_w -1368386983716689088
// 2d2: lload 9
// 2d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: athrow
// 2da: bipush 1
// 2db: goto 2ee
// 2de: ldc2_w -1368386983716689088
// 2e1: lload 9
// 2e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e8: athrow
// 2e9: bipush 0
// 2ea: goto 2ee
// 2ed: bipush 0
// 2ee: iload 2
// 2ef: ifle 2fe
// 2f2: ifeq 3b3
// 2f5: iload 8
// 2f7: i2f
// 2f8: fload 4
// 2fa: ldc 74.0
// 2fc: fadd
// 2fd: fcmpl
// 2fe: iload 33
// 300: iload 6
// 302: ifle 347
// 305: ifne 345
// 308: goto 316
// 30b: ldc2_w -1368386983716689088
// 30e: lload 9
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: ifle 3b3
// 319: goto 327
// 31c: ldc2_w -1368386983716689088
// 31f: lload 9
// 321: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 326: athrow
// 327: fload 39
// 329: sipush 20004
// 32c: ldc2_w 5660023678444861741
// 32f: lload 9
// 331: lxor
// 332: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 337: i2f
// 338: fadd
// 339: fstore 41
// 33b: iload 8
// 33d: i2f
// 33e: fstore 42
// 340: fload 39
// 342: fload 42
// 344: fcmpg
// 345: iload 33
// 347: iload 2
// 348: ifle 374
// 34b: ifne 372
// 34e: ifgt 39b
// 351: goto 35f
// 354: ldc2_w -1368386983716689088
// 357: lload 9
// 359: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35e: athrow
// 35f: fload 42
// 361: fload 41
// 363: fcmpg
// 364: goto 372
// 367: ldc2_w -1368386983716689088
// 36a: lload 9
// 36c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 371: athrow
// 372: iload 33
// 374: ifne 398
// 377: ifgt 397
// 37a: goto 388
// 37d: ldc2_w -1368386983716689088
// 380: lload 9
// 382: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 387: athrow
// 388: bipush 1
// 389: goto 39c
// 38c: ldc2_w -1368386983716689088
// 38f: lload 9
// 391: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: athrow
// 397: bipush 0
// 398: goto 39c
// 39b: bipush 0
// 39c: iload 6
// 39e: ifle 3a5
// 3a1: ifeq 3b3
// 3a4: bipush 1
// 3a5: goto 3b4
// 3a8: ldc2_w -1368386983716689088
// 3ab: lload 9
// 3ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b2: athrow
// 3b3: bipush 0
// 3b4: istore 40
// 3b6: iload 33
// 3b8: iload 2
// 3b9: ifle 3c1
// 3bc: ifne 3e6
// 3bf: iload 40
// 3c1: ifeq 43d
// 3c4: goto 3d2
// 3c7: ldc2_w -1368386983716689088
// 3ca: lload 9
// 3cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d1: athrow
// 3d2: aload 0
// 3d3: aload 38
// 3d5: putfield su/catlean/dt.g Ljava/lang/Object;
// 3d8: goto 3e6
// 3db: ldc2_w -1368386983716689088
// 3de: lload 9
// 3e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e5: athrow
// 3e6: aload 1
// 3e7: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3ea: dup
// 3eb: sipush 24681
// 3ee: ldc2_w 5846068543964890205
// 3f1: lload 9
// 3f3: lxor
// 3f4: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3fc: fload 3
// 3fd: ldc 6.0
// 3ff: fadd
// 400: iload 13
// 402: i2c
// 403: swap
// 404: fload 39
// 406: fconst_2
// 407: fsub
// 408: aload 0
// 409: invokevirtual su/catlean/dt.l ()F
// 40c: ldc 12.0
// 40e: fsub
// 40f: ldc 20.0
// 411: ldc 4.0
// 413: fconst_2
// 414: ldc 0.1
// 416: fconst_1
// 417: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 41a: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 41d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 420: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 423: fconst_0
// 424: iload 14
// 426: i2s
// 427: fconst_0
// 428: iload 15
// 42a: fconst_0
// 42b: sipush 4176
// 42e: ldc2_w 8077183246532716380
// 431: lload 9
// 433: lxor
// 434: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 439: aconst_null
// 43a: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 43d: lload 18
// 43f: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 442: aload 1
// 443: aload 0
// 444: lload 11
// 446: aload 38
// 448: invokevirtual su/catlean/dt.n (JLjava/lang/Object;)Ljava/lang/String;
// 44b: sipush 14151
// 44e: ldc2_w 6752162928239214669
// 451: lload 9
// 453: lxor
// 454: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 459: iload 6
// 45b: iflt 471
// 45e: invokestatic kotlin/text/StringsKt.take (Ljava/lang/String;I)Ljava/lang/String;
// 461: aload 0
// 462: lload 11
// 464: aload 38
// 466: invokevirtual su/catlean/dt.n (JLjava/lang/Object;)Ljava/lang/String;
// 469: iload 33
// 46b: ifne 4ac
// 46e: invokevirtual java/lang/String.length ()I
// 471: sipush 28942
// 474: ldc2_w 32452312331011585
// 477: lload 9
// 479: lxor
// 47a: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47f: if_icmple 4af
// 482: goto 490
// 485: ldc2_w -1368386983716689088
// 488: lload 9
// 48a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48f: athrow
// 490: sipush 22055
// 493: ldc2_w 8116770523112534556
// 496: lload 9
// 498: lxor
// 499: invokedynamic n (IJ)Ljava/lang/String; bsm=su/catlean/dt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49e: goto 4ac
// 4a1: ldc2_w -1368386983716689088
// 4a4: lload 9
// 4a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ab: athrow
// 4ac: goto 4b1
// 4af: ldc ""
// 4b1: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 4b6: fload 3
// 4b7: ldc 27.0
// 4b9: fadd
// 4ba: fload 39
// 4bc: ldc 1.5
// 4be: fadd
// 4bf: aload 0
// 4c0: aload 38
// 4c2: lload 22
// 4c4: invokevirtual su/catlean/dt.O (Ljava/lang/Object;J)Z
// 4c7: ifeq 4de
// 4ca: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 4cd: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 4d0: goto 4e4
// 4d3: ldc2_w -1368386983716689088
// 4d6: lload 9
// 4d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4dd: athrow
// 4de: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 4e1: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 4e4: astore 30
// 4e6: fstore 31
// 4e8: fstore 32
// 4ea: lload 16
// 4ec: fload 32
// 4ee: fload 31
// 4f0: aload 30
// 4f2: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 4f5: aload 0
// 4f6: aload 1
// 4f7: fload 3
// 4f8: fload 39
// 4fa: lload 28
// 4fc: aload 38
// 4fe: invokevirtual su/catlean/dt.j (Lnet/minecraft/class_332;FFJLjava/lang/Object;)V
// 501: iload 6
// 503: ifle 514
// 506: iload 33
// 508: ifeq 1e6
// 50b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 50e: lload 24
// 510: aload 1
// 511: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 514: return
}

@Override
public void T(long a, int mouseX, int mouseY, int mouseButton) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 1
// 001: dup2
// 002: ldc2_w 86391959954688
// 005: lxor
// 006: lstore 6
// 008: dup2
// 009: ldc2_w 0
// 00c: lxor
// 00d: lstore 8
// 00f: dup2
// 010: ldc2_w 40614691011106
// 013: lxor
// 014: lstore 10
// 016: pop2
// 017: ldc2_w 8762068688832321434
// 01a: lload 1
// 01b: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 020: lload 6
// 022: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 025: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 028: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 02b: i2f
// 02c: fconst_2
// 02d: fdiv
// 02e: aload 0
// 02f: invokevirtual su/catlean/dt.l ()F
// 032: fconst_2
// 033: fdiv
// 034: fsub
// 035: fstore 13
// 037: lload 6
// 039: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 03c: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 03f: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 042: i2f
// 043: fconst_2
// 044: fdiv
// 045: aload 0
// 046: invokevirtual su/catlean/dt.p ()F
// 049: fconst_2
// 04a: fdiv
// 04b: fsub
// 04c: ldc 50.0
// 04e: fsub
// 04f: fstore 14
// 051: fload 13
// 053: ldc 6.0
// 055: fadd
// 056: fstore 15
// 058: istore 12
// 05a: fload 13
// 05c: aload 0
// 05d: invokevirtual su/catlean/dt.l ()F
// 060: fconst_2
// 061: fdiv
// 062: fadd
// 063: fconst_2
// 064: fsub
// 065: fstore 16
// 067: iload 3
// 068: i2f
// 069: fstore 17
// 06b: fload 15
// 06d: fload 17
// 06f: fcmpg
// 070: iload 12
// 072: ifne 097
// 075: ifgt 0be
// 078: goto 085
// 07b: ldc2_w 8775216505829523333
// 07e: lload 1
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: fload 17
// 087: fload 16
// 089: fcmpg
// 08a: goto 097
// 08d: ldc2_w 8775216505829523333
// 090: lload 1
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: iload 12
// 099: ifne 0bb
// 09c: ifgt 0ba
// 09f: goto 0ac
// 0a2: ldc2_w 8775216505829523333
// 0a5: lload 1
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: bipush 1
// 0ad: goto 0bf
// 0b0: ldc2_w 8775216505829523333
// 0b3: lload 1
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: bipush 0
// 0bb: goto 0bf
// 0be: bipush 0
// 0bf: ifeq 15a
// 0c2: fload 14
// 0c4: ldc 54.0
// 0c6: fadd
// 0c7: fstore 15
// 0c9: fload 14
// 0cb: ldc 67.0
// 0cd: fadd
// 0ce: fstore 16
// 0d0: iload 4
// 0d2: i2f
// 0d3: fstore 17
// 0d5: fload 15
// 0d7: fload 17
// 0d9: fcmpg
// 0da: iload 12
// 0dc: lload 1
// 0dd: lconst_0
// 0de: lcmp
// 0df: iflt 109
// 0e2: ifne 107
// 0e5: ifgt 12e
// 0e8: goto 0f5
// 0eb: ldc2_w 8775216505829523333
// 0ee: lload 1
// 0ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f4: athrow
// 0f5: fload 17
// 0f7: fload 16
// 0f9: fcmpg
// 0fa: goto 107
// 0fd: ldc2_w 8775216505829523333
// 100: lload 1
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: iload 12
// 109: ifne 12b
// 10c: ifgt 12a
// 10f: goto 11c
// 112: ldc2_w 8775216505829523333
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: bipush 1
// 11d: goto 12f
// 120: ldc2_w 8775216505829523333
// 123: lload 1
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: bipush 0
// 12b: goto 12f
// 12e: bipush 0
// 12f: lload 1
// 130: lconst_0
// 131: lcmp
// 132: ifle 17a
// 135: ifeq 15a
// 138: aload 0
// 139: bipush 1
// 13a: putfield su/catlean/dt.W Z
// 13d: aload 0
// 13e: lload 1
// 13f: lconst_0
// 140: lcmp
// 141: iflt 384
// 144: fconst_0
// 145: invokevirtual su/catlean/dt.Z (F)V
// 148: iload 12
// 14a: ifeq 380
// 14d: goto 15a
// 150: ldc2_w 8775216505829523333
// 153: lload 1
// 154: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 159: athrow
// 15a: fload 13
// 15c: aload 0
// 15d: invokevirtual su/catlean/dt.l ()F
// 160: fconst_2
// 161: fdiv
// 162: fadd
// 163: fstore 15
// 165: fload 13
// 167: aload 0
// 168: invokevirtual su/catlean/dt.l ()F
// 16b: fadd
// 16c: ldc 12.0
// 16e: fsub
// 16f: fstore 16
// 171: iload 3
// 172: i2f
// 173: fstore 17
// 175: fload 15
// 177: fload 17
// 179: fcmpg
// 17a: iload 12
// 17c: lload 1
// 17d: lconst_0
// 17e: lcmp
// 17f: ifle 1a9
// 182: ifne 1a7
// 185: ifgt 1ce
// 188: goto 195
// 18b: ldc2_w 8775216505829523333
// 18e: lload 1
// 18f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 194: athrow
// 195: fload 17
// 197: fload 16
// 199: fcmpg
// 19a: goto 1a7
// 19d: ldc2_w 8775216505829523333
// 1a0: lload 1
// 1a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a6: athrow
// 1a7: iload 12
// 1a9: ifne 1cb
// 1ac: ifgt 1ca
// 1af: goto 1bc
// 1b2: ldc2_w 8775216505829523333
// 1b5: lload 1
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: bipush 1
// 1bd: goto 1cf
// 1c0: ldc2_w 8775216505829523333
// 1c3: lload 1
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: bipush 0
// 1cb: goto 1cf
// 1ce: bipush 0
// 1cf: ifeq 26a
// 1d2: fload 14
// 1d4: ldc 54.0
// 1d6: fadd
// 1d7: fstore 15
// 1d9: fload 14
// 1db: ldc 67.0
// 1dd: fadd
// 1de: fstore 16
// 1e0: iload 4
// 1e2: i2f
// 1e3: fstore 17
// 1e5: fload 15
// 1e7: fload 17
// 1e9: fcmpg
// 1ea: iload 12
// 1ec: lload 1
// 1ed: lconst_0
// 1ee: lcmp
// 1ef: iflt 219
// 1f2: ifne 217
// 1f5: ifgt 23e
// 1f8: goto 205
// 1fb: ldc2_w 8775216505829523333
// 1fe: lload 1
// 1ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: athrow
// 205: fload 17
// 207: fload 16
// 209: fcmpg
// 20a: goto 217
// 20d: ldc2_w 8775216505829523333
// 210: lload 1
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: iload 12
// 219: ifne 23b
// 21c: ifgt 23a
// 21f: goto 22c
// 222: ldc2_w 8775216505829523333
// 225: lload 1
// 226: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22b: athrow
// 22c: bipush 1
// 22d: goto 23f
// 230: ldc2_w 8775216505829523333
// 233: lload 1
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: bipush 0
// 23b: goto 23f
// 23e: bipush 0
// 23f: lload 1
// 240: lconst_0
// 241: lcmp
// 242: ifle 282
// 245: ifeq 26a
// 248: aload 0
// 249: bipush 0
// 24a: putfield su/catlean/dt.W Z
// 24d: aload 0
// 24e: lload 1
// 24f: lconst_0
// 250: lcmp
// 251: iflt 384
// 254: fconst_0
// 255: invokevirtual su/catlean/dt.Z (F)V
// 258: iload 12
// 25a: ifeq 380
// 25d: goto 26a
// 260: ldc2_w 8775216505829523333
// 263: lload 1
// 264: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 269: athrow
// 26a: fload 14
// 26c: ldc 28.0
// 26e: fadd
// 26f: fstore 15
// 271: fload 14
// 273: ldc 48.0
// 275: fadd
// 276: fstore 16
// 278: iload 4
// 27a: i2f
// 27b: fstore 17
// 27d: fload 15
// 27f: fload 17
// 281: fcmpg
// 282: iload 12
// 284: lload 1
// 285: lconst_0
// 286: lcmp
// 287: ifle 2b1
// 28a: ifne 2af
// 28d: ifgt 2d6
// 290: goto 29d
// 293: ldc2_w 8775216505829523333
// 296: lload 1
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: fload 17
// 29f: fload 16
// 2a1: fcmpg
// 2a2: goto 2af
// 2a5: ldc2_w 8775216505829523333
// 2a8: lload 1
// 2a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ae: athrow
// 2af: iload 12
// 2b1: ifne 2d3
// 2b4: ifgt 2d2
// 2b7: goto 2c4
// 2ba: ldc2_w 8775216505829523333
// 2bd: lload 1
// 2be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c3: athrow
// 2c4: bipush 1
// 2c5: goto 2d7
// 2c8: ldc2_w 8775216505829523333
// 2cb: lload 1
// 2cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d1: athrow
// 2d2: bipush 0
// 2d3: goto 2d7
// 2d6: bipush 0
// 2d7: ifeq 380
// 2da: fload 13
// 2dc: ldc 4.0
// 2de: fadd
// 2df: fstore 15
// 2e1: fload 13
// 2e3: ldc 4.0
// 2e5: fadd
// 2e6: aload 0
// 2e7: invokevirtual su/catlean/dt.l ()F
// 2ea: fadd
// 2eb: ldc 8.0
// 2ed: fsub
// 2ee: fstore 16
// 2f0: iload 3
// 2f1: i2f
// 2f2: fstore 17
// 2f4: fload 15
// 2f6: fload 17
// 2f8: fcmpg
// 2f9: iload 12
// 2fb: lload 1
// 2fc: lconst_0
// 2fd: lcmp
// 2fe: iflt 328
// 301: ifne 326
// 304: ifgt 34d
// 307: goto 314
// 30a: ldc2_w 8775216505829523333
// 30d: lload 1
// 30e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 313: athrow
// 314: fload 17
// 316: fload 16
// 318: fcmpg
// 319: goto 326
// 31c: ldc2_w 8775216505829523333
// 31f: lload 1
// 320: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 325: athrow
// 326: iload 12
// 328: ifne 34a
// 32b: ifgt 349
// 32e: goto 33b
// 331: ldc2_w 8775216505829523333
// 334: lload 1
// 335: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33a: athrow
// 33b: bipush 1
// 33c: goto 34e
// 33f: ldc2_w 8775216505829523333
// 342: lload 1
// 343: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 348: athrow
// 349: bipush 0
// 34a: goto 34e
// 34d: bipush 0
// 34e: ifeq 380
// 351: aload 0
// 352: aload 0
// 353: getfield su/catlean/dt.a Z
// 356: iload 12
// 358: ifne 379
// 35b: goto 368
// 35e: ldc2_w 8775216505829523333
// 361: lload 1
// 362: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 367: athrow
// 368: ifne 37c
// 36b: goto 378
// 36e: ldc2_w 8775216505829523333
// 371: lload 1
// 372: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 377: athrow
// 378: bipush 1
// 379: goto 37d
// 37c: bipush 0
// 37d: putfield su/catlean/dt.a Z
// 380: aload 0
// 381: getfield su/catlean/dt.g Ljava/lang/Object;
// 384: dup
// 385: ifnull 398
// 388: astore 17
// 38a: bipush 0
// 38b: istore 18
// 38d: aload 0
// 38e: aload 17
// 390: lload 10
// 392: invokevirtual su/catlean/dt.v (Ljava/lang/Object;J)V
// 395: goto 399
// 398: pop
// 399: aload 0
// 39a: lload 8
// 39c: iload 3
// 39d: iload 4
// 39f: iload 5
// 3a1: invokespecial su/catlean/dj.T (JIII)V
// 3a4: lload 1
// 3a5: lconst_0
// 3a6: lcmp
// 3a7: iflt 3c4
// 3aa: ldc2_w 8725939750818441097
// 3ad: lload 1
// 3ae: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b3: ifnull 3d1
// 3b6: iinc 12 1
// 3b9: iload 12
// 3bb: ldc2_w 8743259005578243237
// 3be: lload 1
// 3bf: invokedynamic Å (IJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c4: goto 3d1
// 3c7: ldc2_w 8775216505829523333
// 3ca: lload 1
// 3cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d0: athrow
// 3d1: return
}

@Override
public void w(int key, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 2
// 01: dup2
// 02: ldc2_w 0
// 05: lxor
// 06: lstore 4
// 08: pop2
// 09: ldc2_w 672567780086327126
// 0c: lload 2
// 0d: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12: istore 6
// 14: iload 6
// 16: ifne c2
// 19: iload 1
// 1a: lload 2
// 1b: lconst_0
// 1c: lcmp
// 1d: ifle 57
// 20: tableswitch 155 256 259 42 42 155 71
// 40: ldc2_w 651820398485933897
// 43: lload 2
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: aload 0
// 4b: bipush 0
// 4c: putfield su/catlean/dt.a Z
// 4f: lload 2
// 50: lconst_0
// 51: lcmp
// 52: ifle c2
// 55: iload 6
// 57: ifeq bb
// 5a: goto 67
// 5d: ldc2_w 651820398485933897
// 60: lload 2
// 61: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 66: athrow
// 67: aload 0
// 68: aload 0
// 69: getfield su/catlean/dt.w Ljava/lang/String;
// 6c: bipush 1
// 6d: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 70: putfield su/catlean/dt.w Ljava/lang/String;
// 73: aload 0
// 74: getfield su/catlean/dt.w Ljava/lang/String;
// 77: checkcast java/lang/CharSequence
// 7a: invokeinterface java/lang/CharSequence.length ()I 1
// 7f: iload 6
// 81: ifne a2
// 84: goto 91
// 87: ldc2_w 651820398485933897
// 8a: lload 2
// 8b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90: athrow
// 91: ifne a5
// 94: goto a1
// 97: ldc2_w 651820398485933897
// 9a: lload 2
// 9b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: athrow
// a1: bipush 1
// a2: goto a6
// a5: bipush 0
// a6: ifeq bb
// a9: aload 0
// aa: bipush 0
// ab: putfield su/catlean/dt.a Z
// ae: goto bb
// b1: ldc2_w 651820398485933897
// b4: lload 2
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: aload 0
// bc: iload 1
// bd: lload 4
// bf: invokespecial su/catlean/dj.w (IJ)V
// c2: return
}

@Override
public void I(long a, char char) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: ldc2_w 6888181981803199423
// 03: lload 1
// 04: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09: istore 4
// 0b: aload 0
// 0c: getfield su/catlean/dt.a Z
// 0f: iload 4
// 11: lload 1
// 12: lconst_0
// 13: lcmp
// 14: ifle 5d
// 17: ifeq 50
// 1a: ifeq 80
// 1d: goto 2a
// 20: ldc2_w 6902780643331070345
// 23: lload 1
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: aload 0
// 2b: iload 4
// 2d: ifeq 7c
// 30: goto 3d
// 33: ldc2_w 6902780643331070345
// 36: lload 1
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: getfield su/catlean/dt.w Ljava/lang/String;
// 40: invokevirtual java/lang/String.length ()I
// 43: goto 50
// 46: ldc2_w 6902780643331070345
// 49: lload 1
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: sipush 14292
// 53: ldc2_w 4992135469599666710
// 56: lload 1
// 57: lxor
// 58: invokedynamic k (IJ)I bsm=su/catlean/dt.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: if_icmpge 80
// 60: aload 0
// 61: aload 0
// 62: getfield su/catlean/dt.w Ljava/lang/String;
// 65: iload 3
// 66: invokedynamic makeConcatWithConstants (Ljava/lang/String;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 6b: putfield su/catlean/dt.w Ljava/lang/String;
// 6e: aload 0
// 6f: goto 7c
// 72: ldc2_w 6902780643331070345
// 75: lload 1
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: fconst_0
// 7d: invokevirtual su/catlean/dt.Z (F)V
// 80: return
}

public void j(@NotNull class_332 context, float x, float y, long a, Object component) {
Intrinsics.checkNotNullParameter(context, b<"n">(29865, 4722312863181285644L ^ ax));
}

public static void c(int var0) {
p = var0;
}

public static int O() {
return p;
}

public static int R() {
int var0 = O();

try {
return var0 == 0 ? 123 : 0;
} catch (NumberFormatException var1) {
throw b(var1);
}
}

static {
long var25 = c ^ 47266396716796L;
vm.a<"Å">(18, 1604260536822498224L, var25);
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[12];
int var21 = 0;
String var20 = "\u0099\u0003Ua°U\u001bÛ\u0084ÓZ×\u001a\u001c\u0099\u0017\u0018Á\u009eÈL\u009f\u007f)QÍ\u0093°r¬tGð\u0091õ¡\u0010ÚÜ\u0086É  4çpµ¯\\m\u0088±¯)ÀC\u0003z\u0014k81(S÷·ÀG³>`Nu\u0015 ×Qå\nº±\u008d~\u0001ïP«+é\u0001¡\u000fOH`|ÐA5'\u0014ü\n¡\u0000n\u008f\u0010L6\u001a\u0003|oTñ \u009eî\\Ýåhs\u0018~\u0003a£\u0092[\u0005êQäÒ¢ \u0096ú¾\u0016\u0001En\u009d\u0000\u0000\u008b é\u001c¹nÃ\u0081$ô9Kís\u0006\u001b0ÿ y\u0014h¶¦T½L\u001cç-\u0002\u009bµ\u009d\u0010S\u0096i[°\u0081î+1ò*ë©7\"{\u0010V\u0012Â4$\u0017è\u0014\u0003òÂ\u0010§#Ú\f\u0010ÒXjÅÊðj\u00984eNIø<\u0001L";
int var22 = "\u0099\u0003Ua°U\u001bÛ\u0084ÓZ×\u001a\u001c\u0099\u0017\u0018Á\u009eÈL\u009f\u007f)QÍ\u0093°r¬tGð\u0091õ¡\u0010ÚÜ\u0086É  4çpµ¯\\m\u0088±¯)ÀC\u0003z\u0014k81(S÷·ÀG³>`Nu\u0015 ×Qå\nº±\u008d~\u0001ïP«+é\u0001¡\u000fOH`|ÐA5'\u0014ü\n¡\u0000n\u008f\u0010L6\u001a\u0003|oTñ \u009eî\\Ýåhs\u0018~\u0003a£\u0092[\u0005êQäÒ¢ \u0096ú¾\u0016\u0001En\u009d\u0000\u0000\u008b é\u001c¹nÃ\u0081$ô9Kís\u0006\u001b0ÿ y\u0014h¶¦T½L\u001cç-\u0002\u009bµ\u009d\u0010S\u0096i[°\u0081î+1ò*ë©7\"{\u0010V\u0012Â4$\u0017è\u0014\u0003òÂ\u0010§#Ú\f\u0010ÒXjÅÊðj\u00984eNIø<\u0001L"
.length();
char var19 = 16;
int var29 = -1;

label64:
while (true) {
String var30 = var20.substring(++var29, var29 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = b(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var43;
if ((var29 += var19) >= var22) {
i = var23;
m = new String[12];
B = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[9];
int var8 = 0;
String var9 = "¼Hq4Ï\u0002\u0014¡q\u00897ñ\b¬l\u0018§\u0096íL\u008buò~\u0007aÛ\u0017\u008d\u0015¥aW\u0087B~ññ\u0097{ÎÝR\u0095 \u0093pv\u008d#»Ä\u0001®¶Û";
int var10 = "¼Hq4Ï\u0002\u0014¡q\u00897ñ\b¬l\u0018§\u0096íL\u008buò~\u0007aÛ\u0017\u008d\u0015¥aW\u0087B~ññ\u0097{ÎÝR\u0095 \u0093pv\u008d#»Ä\u0001®¶Û"
.length();
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
u = var11;
A = new Integer[9];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 4334370763473607785L;
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
C = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "¡7JÁ\u0000u\u008c¿\u001ehÞ0»jD\u001f";
var10 = "¡7JÁ\u0000u\u008c¿\u001ehÞ0»jD\u001f".length();
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

var20 = "Ø\u001ax\u0083¹ûoDúÝ ¤)>âÄ\u0010\\cüªì(\u001dÇ@x\r#kÑV\u0005";
var22 = "Ø\u001ax\u0083¹ûoDúÝ ¤)>âÄ\u0010\\cüªì(\u001dÇ@x\r#kÑV\u0005".length();
var19 = 16;
var29 = -1;
}

var30 = var20.substring(++var29, var29 + var19);
var10001 = 0;
}
}
}

private static NumberFormatException b(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18622;
if (m[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])n.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
n.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/dt", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = i[var5].getBytes("ISO-8859-1");
m[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return m[var5];
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
throw new RuntimeException("su/catlean/dt" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int e(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 23425;
if (A[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = u[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])B.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
B.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/dt", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
A[var3] = var15;
}

return A[var3];
}

private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = e(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite e(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/dt" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
