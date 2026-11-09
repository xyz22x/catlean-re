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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_442;
import org.jetbrains.annotations.NotNull;

public final class ie extends class_437 {
@NotNull
private final class_2960 e;
@NotNull
private final n7 W;
@NotNull
private final n7 Y;
private static final long a = yz.a(5236209869090529453L, -3483411034988702709L, MethodHandles.lookup().lookupClass()).a(250483077177830L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public ie(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 126720427373165L;
int var3 = (int)((var1 ^ 126720427373165L) >>> 32);
int var4 = (int)((var1 ^ 126720427373165L) << 32 >>> 48);
int var5 = (int)(var10001 << 48 >>> 48);
long var6 = var1 ^ 87124659177329L;
long var8 = var1 ^ 34668505888728L;
super(class_2561.method_30163(a<"d">(15430, 6780077558303807427L ^ var1)));
this.e = l6.J(a<"d">(11850, 5835160522869491149L ^ var1), a<"d">(2974, 7840881373075628048L ^ var1), var8);
this.W = new n7(
0.0F,
0.0F,
100.0F,
25.0F,
i4.h.E(var3, a<"d">(3241, 686142736845432616L ^ var1), var4, new Object[0], var5),
ie::u,
0,
var6,
null,
null,
0.0F,
0.0F,
b<"v">(8139, 2514349592373009704L ^ var1),
null
);
this.Y = new n7(
0.0F,
0.0F,
100.0F,
25.0F,
i4.h.E(var3, a<"d">(7623, 2865879997172512328L ^ var1), var4, new Object[0], var5),
ie::Q,
0,
var6,
null,
null,
0.0F,
0.0F,
b<"v">(11853, 7039061837819522221L ^ var1),
null
);
}

public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ie.a J
// 003: ldc2_w 43046342073716
// 006: lxor
// 007: lstore 5
// 009: lload 5
// 00b: dup2
// 00c: ldc2_w 266868752919
// 00f: lxor
// 010: dup2
// 011: bipush 32
// 013: lushr
// 014: l2i
// 015: istore 7
// 017: dup2
// 018: bipush 32
// 01a: lshl
// 01b: bipush 48
// 01d: lushr
// 01e: l2i
// 01f: istore 8
// 021: dup2
// 022: bipush 48
// 024: lshl
// 025: bipush 48
// 027: lushr
// 028: l2i
// 029: istore 9
// 02b: pop2
// 02c: dup2
// 02d: ldc2_w 88329908646083
// 030: lxor
// 031: lstore 10
// 033: dup2
// 034: ldc2_w 104888822129037
// 037: lxor
// 038: lstore 12
// 03a: dup2
// 03b: ldc2_w 72293967473975
// 03e: lxor
// 03f: lstore 14
// 041: dup2
// 042: ldc2_w 61205052043047
// 045: lxor
// 046: lstore 16
// 048: dup2
// 049: ldc2_w 112355829391811
// 04c: lxor
// 04d: lstore 18
// 04f: dup2
// 050: ldc2_w 95862463394133
// 053: lxor
// 054: lstore 20
// 056: dup2
// 057: ldc2_w 26960121499355
// 05a: lxor
// 05b: dup2
// 05c: bipush 48
// 05e: lushr
// 05f: l2i
// 060: istore 22
// 062: dup2
// 063: bipush 16
// 065: lshl
// 066: bipush 32
// 068: lushr
// 069: l2i
// 06a: istore 23
// 06c: dup2
// 06d: bipush 48
// 06f: lshl
// 070: bipush 48
// 072: lushr
// 073: l2i
// 074: istore 24
// 076: pop2
// 077: dup2
// 078: ldc2_w 119532573628055
// 07b: lxor
// 07c: lstore 25
// 07e: dup2
// 07f: ldc2_w 17771458735428
// 082: lxor
// 083: lstore 27
// 085: dup2
// 086: ldc2_w 86441639595086
// 089: lxor
// 08a: lstore 29
// 08c: pop2
// 08d: ldc2_w -1326238664447680774
// 090: lload 5
// 092: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: aload 1
// 098: sipush 32630
// 09b: ldc2_w 5470898122010436750
// 09e: lload 5
// 0a0: lxor
// 0a1: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0a9: astore 31
// 0ab: aload 0
// 0ac: getfield su/catlean/ie.field_22789 I
// 0af: i2f
// 0b0: fconst_2
// 0b1: fdiv
// 0b2: fstore 32
// 0b4: aload 0
// 0b5: getfield su/catlean/ie.field_22790 I
// 0b8: i2f
// 0b9: fconst_2
// 0ba: fdiv
// 0bb: fstore 33
// 0bd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0c0: aload 1
// 0c1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0c4: dup
// 0c5: sipush 29528
// 0c8: ldc2_w 1953863038048413866
// 0cb: lload 5
// 0cd: lxor
// 0ce: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0d6: fconst_0
// 0d7: fconst_0
// 0d8: aload 0
// 0d9: getfield su/catlean/ie.field_22789 I
// 0dc: i2f
// 0dd: aload 0
// 0de: getfield su/catlean/ie.field_22790 I
// 0e1: i2f
// 0e2: bipush 1
// 0e3: anewarray 378
// 0e6: astore 34
// 0e8: aload 34
// 0ea: bipush 0
// 0eb: new java/awt/Color
// 0ee: dup
// 0ef: sipush 15464
// 0f2: ldc2_w 4817793727955635955
// 0f5: lload 5
// 0f7: lxor
// 0f8: invokedynamic v (IJ)I bsm=su/catlean/ie.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: invokespecial java/awt/Color.<init> (I)V
// 100: aastore
// 101: aload 34
// 103: lload 20
// 105: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 108: lload 25
// 10a: invokestatic su/catlean/b8.i (J)Lsu/catlean/c6;
// 10d: lload 10
// 10f: sipush 17416
// 112: ldc2_w 8883242623961145336
// 115: lload 5
// 117: lxor
// 118: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 120: fconst_2
// 121: fdiv
// 122: fstore 34
// 124: lload 25
// 126: invokestatic su/catlean/b8.i (J)Lsu/catlean/c6;
// 129: aload 1
// 12a: sipush 15021
// 12d: ldc2_w 8190029686707249489
// 130: lload 5
// 132: lxor
// 133: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 138: fload 32
// 13a: fload 34
// 13c: fsub
// 13d: lload 12
// 13f: dup2_x1
// 140: pop2
// 141: fload 33
// 143: ldc 94.0
// 145: fsub
// 146: getstatic java/awt/Color.GRAY Ljava/awt/Color;
// 149: dup
// 14a: sipush 6654
// 14d: ldc2_w 4415910501866652160
// 150: lload 5
// 152: lxor
// 153: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15b: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 15e: lload 25
// 160: invokestatic su/catlean/b8.i (J)Lsu/catlean/c6;
// 163: aload 1
// 164: sipush 15021
// 167: ldc2_w 8190029686707249489
// 16a: lload 5
// 16c: lxor
// 16d: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: bipush 3
// 173: bipush 4
// 174: i2d
// 175: invokestatic su/catlean/zf.A ()J
// 178: l2d
// 179: ldc2_w 1200.0
// 17c: drem
// 17d: ldc2_w 1200.0
// 180: ddiv
// 181: dmul
// 182: d2i
// 183: isub
// 184: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 187: fload 32
// 189: fload 34
// 18b: fsub
// 18c: lload 12
// 18e: dup2_x1
// 18f: pop2
// 190: fload 33
// 192: ldc 94.0
// 194: fsub
// 195: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 198: dup
// 199: sipush 22783
// 19c: ldc2_w 701392343444652814
// 19f: lload 5
// 1a1: lxor
// 1a2: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1aa: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 1ad: lload 25
// 1af: invokestatic su/catlean/b8.i (J)Lsu/catlean/c6;
// 1b2: aload 1
// 1b3: getstatic su/catlean/i4.h Lsu/catlean/i4;
// 1b6: iload 7
// 1b8: sipush 25893
// 1bb: ldc2_w 2783213529238847186
// 1be: lload 5
// 1c0: lxor
// 1c1: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: bipush 0
// 1c7: anewarray 121
// 1ca: iload 8
// 1cc: swap
// 1cd: iload 9
// 1cf: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// 1d2: fload 32
// 1d4: fload 33
// 1d6: ldc 10.0
// 1d8: fsub
// 1d9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1dc: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 1df: dup
// 1e0: sipush 15947
// 1e3: ldc2_w 1771524223310751154
// 1e6: lload 5
// 1e8: lxor
// 1e9: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1f1: iload 22
// 1f3: i2c
// 1f4: iload 23
// 1f6: ldc 0.5
// 1f8: iload 24
// 1fa: i2s
// 1fb: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1fe: lload 14
// 200: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 203: aload 31
// 205: ifnull 297
// 208: getstatic su/catlean/os.D Lsu/catlean/os;
// 20b: invokevirtual su/catlean/os.Q ()Lsu/catlean/f0;
// 20e: getstatic su/catlean/os.D Lsu/catlean/os;
// 211: invokevirtual su/catlean/os.G ()Lsu/catlean/f0;
// 214: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 217: ifne 2b8
// 21a: goto 228
// 21d: ldc2_w -1335160173895320404
// 220: lload 5
// 222: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: athrow
// 228: fload 32
// 22a: ldc 85.0
// 22c: fsub
// 22d: fload 33
// 22f: ldc 108.0
// 231: fsub
// 232: ldc 65.0
// 234: ldc 65.0
// 236: ldc 32.5
// 238: fconst_2
// 239: fconst_0
// 23a: fconst_1
// 23b: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 23e: dup
// 23f: sipush 15947
// 242: ldc2_w 1771524223310751154
// 245: lload 5
// 247: lxor
// 248: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 250: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 253: dup
// 254: sipush 15947
// 257: ldc2_w 1771524223310751154
// 25a: lload 5
// 25c: lxor
// 25d: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 265: aload 1
// 266: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 269: getstatic su/catlean/wz.K Lsu/catlean/wz;
// 26c: getstatic su/catlean/os.D Lsu/catlean/os;
// 26f: invokevirtual su/catlean/os.Q ()Lsu/catlean/f0;
// 272: lload 18
// 274: bipush 0
// 275: bipush 1
// 276: bipush 1
// 277: aconst_null
// 278: invokestatic su/catlean/f0.Q (Lsu/catlean/f0;JIZILjava/lang/Object;)Ljava/lang/String;
// 27b: lload 16
// 27d: dup2_x1
// 27e: pop2
// 27f: invokevirtual su/catlean/wz.F (JLjava/lang/String;)Lnet/minecraft/class_2960;
// 282: lload 27
// 284: dup2_x1
// 285: pop2
// 286: invokestatic su/catlean/l2.h (FFFFFFFFLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;JLnet/minecraft/class_2960;)V
// 289: goto 297
// 28c: ldc2_w -1335160173895320404
// 28f: lload 5
// 291: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 296: athrow
// 297: aload 31
// 299: ifnonnull 316
// 29c: bipush 5
// 29d: anewarray 337
// 2a0: ldc2_w -1331188825944954949
// 2a3: lload 5
// 2a5: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: goto 2b8
// 2ad: ldc2_w -1335160173895320404
// 2b0: lload 5
// 2b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b7: athrow
// 2b8: fload 32
// 2ba: ldc 85.0
// 2bc: fsub
// 2bd: fload 33
// 2bf: ldc 108.0
// 2c1: fsub
// 2c2: ldc 65.0
// 2c4: ldc 65.0
// 2c6: ldc 32.5
// 2c8: fconst_2
// 2c9: fconst_0
// 2ca: fconst_1
// 2cb: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 2ce: dup
// 2cf: sipush 15947
// 2d2: ldc2_w 1771524223310751154
// 2d5: lload 5
// 2d7: lxor
// 2d8: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e0: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 2e3: dup
// 2e4: sipush 15947
// 2e7: ldc2_w 1771524223310751154
// 2ea: lload 5
// 2ec: lxor
// 2ed: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2f5: aload 1
// 2f6: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2f9: getstatic su/catlean/wz.K Lsu/catlean/wz;
// 2fc: lload 16
// 2fe: sipush 21050
// 301: ldc2_w 7805700938742008265
// 304: lload 5
// 306: lxor
// 307: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30c: invokevirtual su/catlean/wz.F (JLjava/lang/String;)Lnet/minecraft/class_2960;
// 30f: lload 27
// 311: dup2_x1
// 312: pop2
// 313: invokestatic su/catlean/l2.h (FFFFFFFFLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;JLnet/minecraft/class_2960;)V
// 316: fload 32
// 318: sipush 12555
// 31b: ldc2_w 573562106283066259
// 31e: lload 5
// 320: lxor
// 321: invokedynamic v (IJ)I bsm=su/catlean/ie.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 326: i2f
// 327: fadd
// 328: fload 33
// 32a: sipush 15958
// 32d: ldc2_w 8617612358019648712
// 330: lload 5
// 332: lxor
// 333: invokedynamic v (IJ)I bsm=su/catlean/ie.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 338: i2f
// 339: fsub
// 33a: ldc 65.0
// 33c: ldc 65.0
// 33e: ldc 32.5
// 340: fconst_2
// 341: fconst_0
// 342: fconst_1
// 343: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 346: dup
// 347: sipush 15947
// 34a: ldc2_w 1771524223310751154
// 34d: lload 5
// 34f: lxor
// 350: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 355: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 358: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 35b: dup
// 35c: sipush 15947
// 35f: ldc2_w 1771524223310751154
// 362: lload 5
// 364: lxor
// 365: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 36d: aload 1
// 36e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 371: aload 0
// 372: getfield su/catlean/ie.e Lnet/minecraft/class_2960;
// 375: lload 27
// 377: dup2_x1
// 378: pop2
// 379: invokestatic su/catlean/l2.h (FFFFFFFFLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;JLnet/minecraft/class_2960;)V
// 37c: aload 0
// 37d: getfield su/catlean/ie.Y Lsu/catlean/n7;
// 380: fload 32
// 382: ldc 110.0
// 384: fsub
// 385: fload 33
// 387: ldc 40.0
// 389: fadd
// 38a: iload 2
// 38b: i2f
// 38c: iload 3
// 38d: i2f
// 38e: lload 29
// 390: dup2_x1
// 391: pop2
// 392: aload 1
// 393: invokevirtual su/catlean/n7.k (FFFJFLnet/minecraft/class_332;)V
// 396: aload 0
// 397: getfield su/catlean/ie.W Lsu/catlean/n7;
// 39a: fload 32
// 39c: ldc 10.0
// 39e: fadd
// 39f: fload 33
// 3a1: ldc 40.0
// 3a3: fadd
// 3a4: iload 2
// 3a5: i2f
// 3a6: iload 3
// 3a7: i2f
// 3a8: lload 29
// 3aa: dup2_x1
// 3ab: pop2
// 3ac: aload 1
// 3ad: invokevirtual su/catlean/n7.k (FFFJFLnet/minecraft/class_332;)V
// 3b0: return
}

public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
long var3 = a ^ 25308900578471L;
long var5 = var3 ^ 57229763805674L;
Intrinsics.checkNotNullParameter(click, a<"d">(17399, 3269278541243765214L ^ var3));
double var7 = click.comp_4798();
double var9 = click.comp_4799();
this.W.P((float)var7, (float)var9, var5);
this.Y.P((float)var7, (float)var9, var5);
return super.method_25402(click, doubled);
}

protected void method_57734(@NotNull class_332 context) {
long var2 = a ^ 39927690753338L;
Intrinsics.checkNotNullParameter(context, a<"d">(20516, 1485728821184619420L ^ var2));
}

public void method_25420(@NotNull class_332 context, int mouseX, int mouseY, float deltaTicks) {
long var5 = a ^ 129104338535565L;
Intrinsics.checkNotNullParameter(context, a<"d">(20516, 1485641723264291371L ^ var5));
}

private static final Unit u() {
long var0 = a ^ 65584484389197L;
long var2 = var0 ^ 129063914774276L;
long var4 = var0 ^ 32442925301201L;
qv.x.D(true, var2);
zf.F(var4).method_1507((class_437)(new class_442()));
return Unit.INSTANCE;
}

private static final Unit Q() {
long var0 = a ^ 102793467961403L;
long var2 = var0 ^ 21686951521906L;
long var4 = var0 ^ 135630214925479L;
qv.x.D(false, var2);
zf.F(var4).method_1507((class_437)(new class_442()));
return Unit.INSTANCE;
}

static {
long var11 = a ^ 2495366296705L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[16];
int var18 = 0;
String var17 = "Û°Q4\u0095l<OhE¬¾\u000bòE?\u0018\u000bÖ/\\ÂÈ\u0087e^\u0012@ãèt¥CG#þ\u0098ð.v;\u0010\u007f§\u008e\u0013Ú!B\u0080¹,¼W\u007fL¹¼\u0010Ð¿\u0016¯g ÐõQ¤C2T9+\u001b\u0010ë;\u009f§+ad5§÷\u008fdùàß\u0017(9Äj\\F\nå\u000f\u0016Ð{`Êü%LK¹µ©\u0017\u0013:\u0092=\u008f{i\u001aüï\"o<ý¾h\u000f[N\u0010W$ÏJpseÁ\u007fû5O\u009b§\u0095ä\u0010;ÝZ1\u0004\u008e0,³$\u001b\nó/y\u008c\u0018$w¼D\u009f\fIT\u0080Ò¤\u007f¯\u0098\u008br\u0000 BEy¡÷]0 á\u0011 Ô¨Á\u00146æ\u009bÑØ's\t4\u0089è¡Ð¸\u0085\u0085ÿ\u0014eIuªô¦9Ôót¥\u0018vñ¤\u0090î\u009e\u0001âà8\u0010i©¢²\u0002&\u0095MW91ä\u009d¬´º\u0010ú.ô_Õö\u0012å\u000b·\u0081ß²ñq¬\u0010\u008fÊäu\u0002ÍáZlêÛ-Eº¼L(ä`£]b\u0007hÄ-¦¦DËÂ0\u0016ËÙúñA\u0018ºÌþúBÂ\u009e-\u000b¦\u00adm\u0088-\u001coå5";
int var19 = "Û°Q4\u0095l<OhE¬¾\u000bòE?\u0018\u000bÖ/\\ÂÈ\u0087e^\u0012@ãèt¥CG#þ\u0098ð.v;\u0010\u007f§\u008e\u0013Ú!B\u0080¹,¼W\u007fL¹¼\u0010Ð¿\u0016¯g ÐõQ¤C2T9+\u001b\u0010ë;\u009f§+ad5§÷\u008fdùàß\u0017(9Äj\\F\nå\u000f\u0016Ð{`Êü%LK¹µ©\u0017\u0013:\u0092=\u008f{i\u001aüï\"o<ý¾h\u000f[N\u0010W$ÏJpseÁ\u007fû5O\u009b§\u0095ä\u0010;ÝZ1\u0004\u008e0,³$\u001b\nó/y\u008c\u0018$w¼D\u009f\fIT\u0080Ò¤\u007f¯\u0098\u008br\u0000 BEy¡÷]0 á\u0011 Ô¨Á\u00146æ\u009bÑØ's\t4\u0089è¡Ð¸\u0085\u0085ÿ\u0014eIuªô¦9Ôót¥\u0018vñ¤\u0090î\u009e\u0001âà8\u0010i©¢²\u0002&\u0095MW91ä\u009d¬´º\u0010ú.ô_Õö\u0012å\u000b·\u0081ß²ñq¬\u0010\u008fÊäu\u0002ÍáZlêÛ-Eº¼L(ä`£]b\u0007hÄ-¦¦DËÂ0\u0016ËÙúñA\u0018ºÌþúBÂ\u009e-\u000b¦\u00adm\u0088-\u001coå5"
.length();
char var16 = 16;
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
c = new String[16];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[5];
int var3 = 0;
String var4 = "\u008b\u001c\u0012üÛ¿*\u009d» q\u0011QeþK \u0004eoïð\u0097\u0093";
int var5 = "\u008b\u001c\u0012üÛ¿*\u009d» q\u0011QeþK \u0004eoïð\u0097\u0093".length();
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
f = var6;
g = new Integer[5];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "JCrke\u001bÙ[W\u0015i{ÄìÃ\u0099";
var5 = "JCrke\u001bÙ[W\u0015i{ÄìÃ\u0099".length();
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

var17 = " ¬\u001d\u0015\u001dÒ.=}ÅÕW\u0089æ\t\u0098Ñå\u009c>\u0002P*n\\èË×ëæà\u008b\u001c\u0084ÿWs»-\u009e\u000fÞ\u009ayÁí\tM\u0013\u0092\u000e\u009aÇê$£\u001aAóÊô¥qe\u0018\u0082\u0006ùÿ(\u001dùº#\u0001ÏG ²$Ï KnD\u000fðÉ[";
var19 = " ¬\u001d\u0015\u001dÒ.=}ÅÕW\u0089æ\t\u0098Ñå\u009c>\u0002P*n\\èË×ëæà\u008b\u001c\u0084ÿWs»-\u009e\u000fÞ\u009ayÁí\tM\u0013\u0092\u000e\u009aÇê$£\u001aAóÊô¥qe\u0018\u0082\u0006ùÿ(\u001dùº#\u0001ÏG ²$Ï KnD\u000fðÉ["
.length();
var16 = '@';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14171;
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
throw new RuntimeException("su/catlean/ie", var10);
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
throw new RuntimeException("su/catlean/ie" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24123;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/ie", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/ie" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
