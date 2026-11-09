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
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty0;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class xt extends f6 {
private final float N;
@NotNull
private KMutableProperty0 B;
@NotNull
private KMutableProperty0 E;
private static final long a = yz.a(1213545277922537521L, -5138532633223638335L, MethodHandles.lookup().lookupClass()).a(35903523454605L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public xt(float width, long a, @NotNull KMutableProperty0 ref, @NotNull KMutableProperty0 hoverRef) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(ref, a<"x">(2079, 8814083320290226219L ^ ax));
Intrinsics.checkNotNullParameter(hoverRef, a<"x">(15374, 4518693229296026681L ^ ax));
super();
this.N = width;
this.B = ref;
this.E = hoverRef;
}

@Override
public void o(long a, @NotNull class_332 context, float x, float y, float mouseX, float mouseY) {
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
// 002: ldc2_w 122872324218116
// 005: lxor
// 006: dup2
// 007: bipush 48
// 009: lushr
// 00a: l2i
// 00b: istore 8
// 00d: dup2
// 00e: bipush 16
// 010: lshl
// 011: bipush 48
// 013: lushr
// 014: l2i
// 015: istore 9
// 017: dup2
// 018: bipush 32
// 01a: lshl
// 01b: bipush 32
// 01d: lushr
// 01e: l2i
// 01f: istore 10
// 021: pop2
// 022: dup2
// 023: ldc2_w 81101117301204
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 18592005668209
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 6627968639251
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 81010294496925
// 03b: lxor
// 03c: dup2
// 03d: bipush 48
// 03f: lushr
// 040: l2i
// 041: istore 17
// 043: dup2
// 044: bipush 16
// 046: lshl
// 047: bipush 32
// 049: lushr
// 04a: l2i
// 04b: istore 18
// 04d: dup2
// 04e: bipush 48
// 050: lshl
// 051: bipush 48
// 053: lushr
// 054: l2i
// 055: istore 19
// 057: pop2
// 058: pop2
// 059: ldc2_w 9052858178404779403
// 05c: lload 1
// 05d: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: aload 3
// 063: sipush 7339
// 066: ldc2_w 4223852315558175594
// 069: lload 1
// 06a: lxor
// 06b: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 073: astore 35
// 075: fload 4
// 077: fload 6
// 079: fcmpg
// 07a: aload 35
// 07c: ifnonnull 0a9
// 07f: ifgt 0d0
// 082: goto 08f
// 085: ldc2_w 9055539355173094248
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: fload 6
// 091: fload 4
// 093: aload 0
// 094: getfield su/catlean/xt.N F
// 097: ldc 88.0
// 099: fsub
// 09a: fadd
// 09b: fcmpg
// 09c: goto 0a9
// 09f: ldc2_w 9055539355173094248
// 0a2: lload 1
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: aload 35
// 0ab: ifnonnull 0cd
// 0ae: ifgt 0cc
// 0b1: goto 0be
// 0b4: ldc2_w 9055539355173094248
// 0b7: lload 1
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: bipush 1
// 0bf: goto 0d1
// 0c2: ldc2_w 9055539355173094248
// 0c5: lload 1
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: bipush 0
// 0cd: goto 0d1
// 0d0: bipush 0
// 0d1: lload 1
// 0d2: lconst_0
// 0d3: lcmp
// 0d4: iflt 0df
// 0d7: ifeq 15b
// 0da: fload 5
// 0dc: fload 7
// 0de: fcmpg
// 0df: aload 35
// 0e1: lload 1
// 0e2: lconst_0
// 0e3: lcmp
// 0e4: iflt 11e
// 0e7: ifnonnull 11c
// 0ea: goto 0f7
// 0ed: ldc2_w 9055539355173094248
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: ifgt 143
// 0fa: goto 107
// 0fd: ldc2_w 9055539355173094248
// 100: lload 1
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: fload 7
// 109: fload 5
// 10b: ldc 13.0
// 10d: fadd
// 10e: fcmpg
// 10f: goto 11c
// 112: ldc2_w 9055539355173094248
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: aload 35
// 11e: ifnonnull 140
// 121: ifgt 13f
// 124: goto 131
// 127: ldc2_w 9055539355173094248
// 12a: lload 1
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: bipush 1
// 132: goto 144
// 135: ldc2_w 9055539355173094248
// 138: lload 1
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: bipush 0
// 140: goto 144
// 143: bipush 0
// 144: lload 1
// 145: lconst_0
// 146: lcmp
// 147: iflt 14e
// 14a: ifeq 15b
// 14d: bipush 1
// 14e: goto 15c
// 151: ldc2_w 9055539355173094248
// 154: lload 1
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: bipush 0
// 15c: istore 36
// 15e: lload 1
// 15f: lconst_0
// 160: lcmp
// 161: iflt 180
// 164: iload 36
// 166: ifeq 180
// 169: aload 0
// 16a: getfield su/catlean/xt.E Lkotlin/reflect/KMutableProperty0;
// 16d: aload 0
// 16e: invokeinterface kotlin/reflect/KMutableProperty0.set (Ljava/lang/Object;)V 2
// 173: goto 180
// 176: ldc2_w 9055539355173094248
// 179: lload 1
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: aload 3
// 181: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 184: dup
// 185: sipush 15195
// 188: ldc2_w 5183263278568424600
// 18b: lload 1
// 18c: lxor
// 18d: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 195: fload 4
// 197: fload 5
// 199: aload 0
// 19a: getfield su/catlean/xt.N F
// 19d: ldc 88.0
// 19f: fsub
// 1a0: ldc 13.0
// 1a2: fconst_2
// 1a3: iload 36
// 1a5: ifeq 1b6
// 1a8: fconst_2
// 1a9: goto 1b7
// 1ac: ldc2_w 9055539355173094248
// 1af: lload 1
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: fconst_0
// 1b7: fconst_0
// 1b8: fconst_1
// 1b9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1bc: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 1bf: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 1c2: dup
// 1c3: sipush 530
// 1c6: ldc2_w 7503633894149160406
// 1c9: lload 1
// 1ca: lxor
// 1cb: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1d3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1d6: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 1d9: fconst_0
// 1da: fconst_0
// 1db: fconst_0
// 1dc: sipush 20645
// 1df: ldc2_w 374283329687980616
// 1e2: lload 1
// 1e3: lxor
// 1e4: invokedynamic h (IJ)I bsm=su/catlean/xt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e9: aconst_null
// 1ea: astore 20
// 1ec: istore 21
// 1ee: fstore 22
// 1f0: fstore 23
// 1f2: fstore 24
// 1f4: astore 25
// 1f6: astore 26
// 1f8: fstore 27
// 1fa: fstore 28
// 1fc: fstore 29
// 1fe: fstore 30
// 200: fstore 31
// 202: fstore 32
// 204: fstore 33
// 206: fstore 34
// 208: iload 8
// 20a: i2c
// 20b: fload 34
// 20d: fload 33
// 20f: fload 32
// 211: fload 31
// 213: fload 30
// 215: fload 29
// 217: fload 28
// 219: fload 27
// 21b: aload 26
// 21d: aload 25
// 21f: fload 24
// 221: iload 9
// 223: i2s
// 224: fload 23
// 226: iload 10
// 228: fload 22
// 22a: iload 21
// 22c: aload 20
// 22e: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 231: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 234: aload 3
// 235: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 238: dup
// 239: sipush 4656
// 23c: ldc2_w 7112572148243492345
// 23f: lload 1
// 240: lxor
// 241: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 249: fload 4
// 24b: aload 0
// 24c: getfield su/catlean/xt.N F
// 24f: ldc 88.0
// 251: fsub
// 252: ldc 0.33
// 254: fmul
// 255: fadd
// 256: fload 5
// 258: fconst_2
// 259: fadd
// 25a: ldc 0.5
// 25c: ldc 9.0
// 25e: bipush 1
// 25f: anewarray 178
// 262: astore 37
// 264: aload 37
// 266: bipush 0
// 267: new java/awt/Color
// 26a: dup
// 26b: sipush 25025
// 26e: ldc2_w 2877535619325279021
// 271: lload 1
// 272: lxor
// 273: invokedynamic h (IJ)I bsm=su/catlean/xt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 278: bipush 1
// 279: invokespecial java/awt/Color.<init> (IZ)V
// 27c: aastore
// 27d: aload 37
// 27f: lload 15
// 281: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 284: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 287: aload 3
// 288: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 28b: dup
// 28c: sipush 4656
// 28f: ldc2_w 7112572148243492345
// 292: lload 1
// 293: lxor
// 294: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 299: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 29c: fload 4
// 29e: aload 0
// 29f: getfield su/catlean/xt.N F
// 2a2: ldc 88.0
// 2a4: fsub
// 2a5: ldc 0.66
// 2a7: fmul
// 2a8: fadd
// 2a9: fload 5
// 2ab: fconst_2
// 2ac: fadd
// 2ad: ldc 0.5
// 2af: ldc 9.0
// 2b1: bipush 1
// 2b2: anewarray 178
// 2b5: astore 37
// 2b7: aload 37
// 2b9: bipush 0
// 2ba: new java/awt/Color
// 2bd: dup
// 2be: sipush 18150
// 2c1: ldc2_w 8360386634205928457
// 2c4: lload 1
// 2c5: lxor
// 2c6: invokedynamic h (IJ)I bsm=su/catlean/xt.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cb: bipush 1
// 2cc: invokespecial java/awt/Color.<init> (IZ)V
// 2cf: aastore
// 2d0: aload 37
// 2d2: lload 15
// 2d4: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 2d7: lload 11
// 2d9: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 2dc: aload 3
// 2dd: sipush 11599
// 2e0: ldc2_w 2044477400034366085
// 2e3: lload 1
// 2e4: lxor
// 2e5: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ea: fload 4
// 2ec: aload 0
// 2ed: getfield su/catlean/xt.N F
// 2f0: ldc 88.0
// 2f2: fsub
// 2f3: ldc 0.16
// 2f5: fmul
// 2f6: fadd
// 2f7: fload 5
// 2f9: ldc 5.0
// 2fb: fadd
// 2fc: aload 0
// 2fd: getfield su/catlean/xt.B Lkotlin/reflect/KMutableProperty0;
// 300: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 305: checkcast java/lang/Number
// 308: invokevirtual java/lang/Number.intValue ()I
// 30b: ifeq 33f
// 30e: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 311: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 314: dup
// 315: sipush 2949
// 318: ldc2_w 9035789400422052933
// 31b: lload 1
// 31c: lxor
// 31d: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 322: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 325: iload 17
// 327: i2c
// 328: iload 18
// 32a: ldc 0.5
// 32c: iload 19
// 32e: i2s
// 32f: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 332: goto 342
// 335: ldc2_w 9055539355173094248
// 338: lload 1
// 339: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33e: athrow
// 33f: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 342: astore 37
// 344: aload 37
// 346: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 349: aload 37
// 34b: lload 1
// 34c: lconst_0
// 34d: lcmp
// 34e: iflt 389
// 351: aload 35
// 353: ifnonnull 3d1
// 356: lload 13
// 358: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 35b: lload 11
// 35d: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 360: aload 3
// 361: sipush 3847
// 364: ldc2_w 8603979383713165504
// 367: lload 1
// 368: lxor
// 369: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36e: fload 4
// 370: aload 0
// 371: getfield su/catlean/xt.N F
// 374: ldc 88.0
// 376: fsub
// 377: ldc 0.49
// 379: fmul
// 37a: fadd
// 37b: fload 5
// 37d: ldc 5.0
// 37f: fadd
// 380: aload 0
// 381: getfield su/catlean/xt.B Lkotlin/reflect/KMutableProperty0;
// 384: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 389: checkcast java/lang/Number
// 38c: invokevirtual java/lang/Number.intValue ()I
// 38f: bipush 1
// 390: if_icmpeq 3d4
// 393: goto 3a0
// 396: ldc2_w 9055539355173094248
// 399: lload 1
// 39a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39f: athrow
// 3a0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3a3: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 3a6: dup
// 3a7: sipush 22570
// 3aa: ldc2_w 2383211951661557736
// 3ad: lload 1
// 3ae: lxor
// 3af: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3b7: iload 17
// 3b9: i2c
// 3ba: iload 18
// 3bc: ldc 0.5
// 3be: iload 19
// 3c0: i2s
// 3c1: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3c4: goto 3d1
// 3c7: ldc2_w 9055539355173094248
// 3ca: lload 1
// 3cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d0: athrow
// 3d1: goto 3d7
// 3d4: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 3d7: astore 37
// 3d9: aload 37
// 3db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 3de: aload 37
// 3e0: lload 1
// 3e1: lconst_0
// 3e2: lcmp
// 3e3: ifle 41e
// 3e6: aload 35
// 3e8: ifnonnull 466
// 3eb: lload 13
// 3ed: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 3f0: lload 11
// 3f2: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 3f5: aload 3
// 3f6: sipush 20522
// 3f9: ldc2_w 7572239826583367650
// 3fc: lload 1
// 3fd: lxor
// 3fe: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 403: fload 4
// 405: aload 0
// 406: getfield su/catlean/xt.N F
// 409: ldc 88.0
// 40b: fsub
// 40c: ldc 0.81
// 40e: fmul
// 40f: fadd
// 410: fload 5
// 412: ldc 5.0
// 414: fadd
// 415: aload 0
// 416: getfield su/catlean/xt.B Lkotlin/reflect/KMutableProperty0;
// 419: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 41e: checkcast java/lang/Number
// 421: invokevirtual java/lang/Number.intValue ()I
// 424: bipush 2
// 425: if_icmpeq 469
// 428: goto 435
// 42b: ldc2_w 9055539355173094248
// 42e: lload 1
// 42f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 434: athrow
// 435: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 438: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 43b: dup
// 43c: sipush 22570
// 43f: ldc2_w 2383211951661557736
// 442: lload 1
// 443: lxor
// 444: invokedynamic x (IJ)Ljava/lang/String; bsm=su/catlean/xt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 449: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 44c: iload 17
// 44e: i2c
// 44f: iload 18
// 451: ldc 0.5
// 453: iload 19
// 455: i2s
// 456: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 459: goto 466
// 45c: ldc2_w 9055539355173094248
// 45f: lload 1
// 460: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 465: athrow
// 466: goto 46c
// 469: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 46c: astore 37
// 46e: aload 37
// 470: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 473: aload 37
// 475: lload 13
// 477: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 47a: return
}

@Override
public boolean P(float x, float y, int button, long a) {
this.B.set((((Number)this.B.get()).intValue() + 1) % 3);
return false;
}

static {
long var11 = a ^ 111303942924811L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[11];
int var18 = 0;
String var17 = "¸\"¥e\u0000_ÔÈë\u0000$©W\u00195\u0011\u0010hu!j5\u0016Ä¡\u008e\u0089Íôª\u0096{·\u0010\u0098òß'\u008f\u001f\tÅ/\u0095\"ÑôYÂ\u001b\u0018á\u0001¿^Ò\u0095ZÇe\u001d¸\u0086D¯Ú»&\u0013ñF¿50N\u0018×i°\u0091]¿P\u0090\u0095'µ¯b¤«\u001cÌâr\u0093xÐ\u0090>\u0010\b^ûç³j Î%6Dé`>ó\u0083 æÊ\"ÖÎØ\u009cTë6\u009f{g »býÌë¾ãf \u009b¹:\\LÈ\u001bð\u0089\u0010Ê\u009e\u008aZ³ÞE\u0004èÌ\u000bqò×ex\u0010\u009e\u0090Zexì;þ(Èâ#!XY\u001f";
int var19 = "¸\"¥e\u0000_ÔÈë\u0000$©W\u00195\u0011\u0010hu!j5\u0016Ä¡\u008e\u0089Íôª\u0096{·\u0010\u0098òß'\u008f\u001f\tÅ/\u0095\"ÑôYÂ\u001b\u0018á\u0001¿^Ò\u0095ZÇe\u001d¸\u0086D¯Ú»&\u0013ñF¿50N\u0018×i°\u0091]¿P\u0090\u0095'µ¯b¤«\u001cÌâr\u0093xÐ\u0090>\u0010\b^ûç³j Î%6Dé`>ó\u0083 æÊ\"ÖÎØ\u009cTë6\u009f{g »býÌë¾ãf \u009b¹:\\LÈ\u001bð\u0089\u0010Ê\u009e\u008aZ³ÞE\u0004èÌ\u000bqò×ex\u0010\u009e\u0090Zexì;þ(Èâ#!XY\u001f"
.length();
char var16 = 16;
int var23 = -1;

label45:
while (true) {
String var24 = var17.substring(++var23, var23 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
String var33 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var33;
if ((var23 += var16) >= var19) {
b = var20;
c = new String[11];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "\u001d:Ê\u008a¸ø\nÞµ4T,\u0097jáý·Vj[G¡^½";
int var5 = "\u001d:Ê\u008a¸ø\nÞµ4T,\u0097jáý·Vj[G¡^½".length();
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
return;
}

var16 = var17.charAt(var23);
break;
default:
var20[var18++] = var33;
if ((var23 += var16) < var19) {
var16 = var17.charAt(var23);
continue label45;
}

var17 = "sÒ\u0084\f\\çY³\u0097GJËeì\u0090)G\u0082Åpí0¾\u000f\u0010H\u0098\u0002¤ØÆ\u0007nl\u0011x\u0003i³QÖ";
var19 = "sÒ\u0084\f\\çY³\u0097GJËeì\u0090)G\u0082Åpí0¾\u000f\u0010H\u0098\u0002¤ØÆ\u0007nl\u0011x\u0003i³QÖ".length();
var16 = 24;
var23 = -1;
}

var24 = var17.substring(++var23, var23 + var16);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 807;
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
throw new RuntimeException("su/catlean/xt", var10);
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
throw new RuntimeException("su/catlean/xt" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9738;
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
throw new RuntimeException("su/catlean/xt", var14);
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
throw new RuntimeException("su/catlean/xt" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
