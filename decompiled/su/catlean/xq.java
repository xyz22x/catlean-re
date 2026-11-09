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

public final class xq extends f6 {
private final float a;
@NotNull
private String X;
@NotNull
private String t;
@NotNull
private KMutableProperty0 j;
@NotNull
private KMutableProperty0 N;
private static final long b = yz.a(-2087992730846593787L, 4347984991775075098L, MethodHandles.lookup().lookupClass()).a(16389103837583L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

public xq(float width, long a, @NotNull String first, @NotNull String second, @NotNull KMutableProperty0 ref, @NotNull KMutableProperty0 hoverRef) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(first, a<"k">(25037, 4511870911466227951L ^ ax));
Intrinsics.checkNotNullParameter(second, a<"k">(18851, 8896318156672491650L ^ ax));
Intrinsics.checkNotNullParameter(ref, a<"k">(20304, 7484694269749913215L ^ ax));
Intrinsics.checkNotNullParameter(hoverRef, a<"k">(12416, 2169676097667373478L ^ ax));
super();
this.a = width;
this.X = first;
this.t = second;
this.j = ref;
this.N = hoverRef;
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
// 059: ldc2_w 9041135080979609510
// 05c: lload 1
// 05d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: aload 3
// 063: sipush 21256
// 066: ldc2_w 2858420165170612676
// 069: lload 1
// 06a: lxor
// 06b: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 073: astore 35
// 075: fload 4
// 077: fload 6
// 079: fcmpg
// 07a: aload 35
// 07c: ifnull 0a9
// 07f: ifgt 0d0
// 082: goto 08f
// 085: ldc2_w 9074812207801867554
// 088: lload 1
// 089: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08e: athrow
// 08f: fload 6
// 091: fload 4
// 093: aload 0
// 094: getfield su/catlean/xq.a F
// 097: ldc 88.0
// 099: fsub
// 09a: fadd
// 09b: fcmpg
// 09c: goto 0a9
// 09f: ldc2_w 9074812207801867554
// 0a2: lload 1
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: aload 35
// 0ab: ifnull 0cd
// 0ae: ifgt 0cc
// 0b1: goto 0be
// 0b4: ldc2_w 9074812207801867554
// 0b7: lload 1
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: bipush 1
// 0bf: goto 0d1
// 0c2: ldc2_w 9074812207801867554
// 0c5: lload 1
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: bipush 0
// 0cd: goto 0d1
// 0d0: bipush 0
// 0d1: lload 1
// 0d2: lconst_0
// 0d3: lcmp
// 0d4: ifle 0df
// 0d7: ifeq 15b
// 0da: fload 5
// 0dc: fload 7
// 0de: fcmpg
// 0df: aload 35
// 0e1: lload 1
// 0e2: lconst_0
// 0e3: lcmp
// 0e4: iflt 11e
// 0e7: ifnull 11c
// 0ea: goto 0f7
// 0ed: ldc2_w 9074812207801867554
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: ifgt 143
// 0fa: goto 107
// 0fd: ldc2_w 9074812207801867554
// 100: lload 1
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: fload 7
// 109: fload 5
// 10b: ldc 13.0
// 10d: fadd
// 10e: fcmpg
// 10f: goto 11c
// 112: ldc2_w 9074812207801867554
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: aload 35
// 11e: ifnull 140
// 121: ifgt 13f
// 124: goto 131
// 127: ldc2_w 9074812207801867554
// 12a: lload 1
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: bipush 1
// 132: goto 144
// 135: ldc2_w 9074812207801867554
// 138: lload 1
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: bipush 0
// 140: goto 144
// 143: bipush 0
// 144: lload 1
// 145: lconst_0
// 146: lcmp
// 147: ifle 14e
// 14a: ifeq 15b
// 14d: bipush 1
// 14e: goto 15c
// 151: ldc2_w 9074812207801867554
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
// 16a: getfield su/catlean/xq.N Lkotlin/reflect/KMutableProperty0;
// 16d: aload 0
// 16e: invokeinterface kotlin/reflect/KMutableProperty0.set (Ljava/lang/Object;)V 2
// 173: goto 180
// 176: ldc2_w 9074812207801867554
// 179: lload 1
// 17a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17f: athrow
// 180: aload 3
// 181: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 184: dup
// 185: sipush 10213
// 188: ldc2_w 972236930268871970
// 18b: lload 1
// 18c: lxor
// 18d: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 195: fload 4
// 197: fload 5
// 199: aload 0
// 19a: getfield su/catlean/xq.a F
// 19d: ldc 88.0
// 19f: fsub
// 1a0: ldc 13.0
// 1a2: fconst_2
// 1a3: iload 36
// 1a5: ifeq 1b6
// 1a8: fconst_2
// 1a9: goto 1b7
// 1ac: ldc2_w 9074812207801867554
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
// 1c3: sipush 6332
// 1c6: ldc2_w 5699911511329079926
// 1c9: lload 1
// 1ca: lxor
// 1cb: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1d3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1d6: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 1d9: fconst_0
// 1da: fconst_0
// 1db: fconst_0
// 1dc: sipush 11205
// 1df: ldc2_w 877828839681740348
// 1e2: lload 1
// 1e3: lxor
// 1e4: invokedynamic u (IJ)I bsm=su/catlean/xq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
// 239: sipush 6880
// 23c: ldc2_w 659114806919364654
// 23f: lload 1
// 240: lxor
// 241: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 249: fload 4
// 24b: aload 0
// 24c: getfield su/catlean/xq.a F
// 24f: ldc 88.0
// 251: fsub
// 252: fconst_2
// 253: fdiv
// 254: fadd
// 255: fload 5
// 257: fconst_2
// 258: fadd
// 259: ldc 0.5
// 25b: ldc 9.0
// 25d: bipush 1
// 25e: anewarray 414
// 261: astore 37
// 263: aload 37
// 265: bipush 0
// 266: new java/awt/Color
// 269: dup
// 26a: sipush 19457
// 26d: ldc2_w 3717443098094250489
// 270: lload 1
// 271: lxor
// 272: invokedynamic u (IJ)I bsm=su/catlean/xq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 277: bipush 1
// 278: invokespecial java/awt/Color.<init> (IZ)V
// 27b: aastore
// 27c: aload 37
// 27e: lload 15
// 280: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 283: lload 11
// 285: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 288: aload 3
// 289: aload 0
// 28a: getfield su/catlean/xq.X Ljava/lang/String;
// 28d: fload 4
// 28f: aload 0
// 290: getfield su/catlean/xq.a F
// 293: ldc 88.0
// 295: fsub
// 296: ldc 0.25
// 298: fmul
// 299: fadd
// 29a: fload 5
// 29c: ldc 5.0
// 29e: fadd
// 29f: aload 0
// 2a0: getfield su/catlean/xq.j Lkotlin/reflect/KMutableProperty0;
// 2a3: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 2a8: checkcast java/lang/Boolean
// 2ab: invokevirtual java/lang/Boolean.booleanValue ()Z
// 2ae: ifeq 2e2
// 2b1: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2b4: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 2b7: dup
// 2b8: sipush 7776
// 2bb: ldc2_w 6362733891346367661
// 2be: lload 1
// 2bf: lxor
// 2c0: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c8: iload 17
// 2ca: i2c
// 2cb: iload 18
// 2cd: ldc 0.5
// 2cf: iload 19
// 2d1: i2s
// 2d2: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 2d5: goto 2e5
// 2d8: ldc2_w 9074812207801867554
// 2db: lload 1
// 2dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e1: athrow
// 2e2: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 2e5: astore 37
// 2e7: aload 37
// 2e9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2ec: aload 37
// 2ee: lload 1
// 2ef: lconst_0
// 2f0: lcmp
// 2f1: ifle 323
// 2f4: aload 35
// 2f6: ifnull 36a
// 2f9: lload 13
// 2fb: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 2fe: lload 11
// 300: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 303: aload 3
// 304: aload 0
// 305: getfield su/catlean/xq.t Ljava/lang/String;
// 308: fload 4
// 30a: aload 0
// 30b: getfield su/catlean/xq.a F
// 30e: ldc 88.0
// 310: fsub
// 311: ldc 0.75
// 313: fmul
// 314: fadd
// 315: fload 5
// 317: ldc 5.0
// 319: fadd
// 31a: aload 0
// 31b: getfield su/catlean/xq.j Lkotlin/reflect/KMutableProperty0;
// 31e: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 323: checkcast java/lang/Boolean
// 326: invokevirtual java/lang/Boolean.booleanValue ()Z
// 329: ifne 36d
// 32c: goto 339
// 32f: ldc2_w 9074812207801867554
// 332: lload 1
// 333: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 338: athrow
// 339: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 33c: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 33f: dup
// 340: sipush 21427
// 343: ldc2_w 4455992701275294074
// 346: lload 1
// 347: lxor
// 348: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/xq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 350: iload 17
// 352: i2c
// 353: iload 18
// 355: ldc 0.5
// 357: iload 19
// 359: i2s
// 35a: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 35d: goto 36a
// 360: ldc2_w 9074812207801867554
// 363: lload 1
// 364: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 369: athrow
// 36a: goto 370
// 36d: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 370: astore 37
// 372: aload 37
// 374: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 377: aload 37
// 379: lload 13
// 37b: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 37e: lload 1
// 37f: lconst_0
// 380: lcmp
// 381: iflt 39b
// 384: ldc2_w 9058670983393469223
// 387: lload 1
// 388: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38d: ifnull 3a8
// 390: ldc "iBLcob"
// 392: ldc2_w 9070793849717023503
// 395: lload 1
// 396: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39b: goto 3a8
// 39e: ldc2_w 9074812207801867554
// 3a1: lload 1
// 3a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a7: athrow
// 3a8: return
}

@Override
public boolean P(float x, float y, int button, long a) {
String var6 = vm.a<"Å">(8984823015854225006L, ax);

KMutableProperty0 var10000;
boolean var10001;
label22: {
label21: {
try {
var10000 = this.j;
var10001 = (Boolean)this.j.get();
if (var6 == null) {
break label22;
}

if (!var10001) {
break label21;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, 8950944970333396202L, ax);
}

var10001 = false;
break label22;
}

var10001 = true;
}

var10000.set(var10001);
return false;
}

static {
long var11 = b ^ 39086991433629L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[10];
int var18 = 0;
String var17 = "0K7I°\u0085{ò¤y[ÑÐÌÈÏ\u00989â\u009aÁ\u000f\u0003± \u001bÐüÅ\u001d\u00840zÄ\u0018u¯\u0086þÿwâ\u0017ÐVë\u00adîã÷\u009aþ\u0088\u001a\u009dâ\f\u0010Rþ¥,(Ç\u0016Ý`ÐºLs[¡f\u0010ÚýbµC\u00149\u0016_6vÈì°\u0091¬ ¨©>÷B\u009ayµÅÐm\u0003øÙ\r&\u0007Â\u001a\u0093\u0084\u009dwçlM\u0086,\"Þé§\u0010!ß¡\u0088\u009f<\u008fµU¨ q\u0003\u0088\u00054\u0010ª5±BIÑ§\u0081\u0090a\u008a\u0006¥þ¼^\u0010\u0015{Û\u0013è$\u00837!Ã\u001aRò\u0096TØ";
int var19 = "0K7I°\u0085{ò¤y[ÑÐÌÈÏ\u00989â\u009aÁ\u000f\u0003± \u001bÐüÅ\u001d\u00840zÄ\u0018u¯\u0086þÿwâ\u0017ÐVë\u00adîã÷\u009aþ\u0088\u001a\u009dâ\f\u0010Rþ¥,(Ç\u0016Ý`ÐºLs[¡f\u0010ÚýbµC\u00149\u0016_6vÈì°\u0091¬ ¨©>÷B\u009ayµÅÐm\u0003øÙ\r&\u0007Â\u001a\u0093\u0084\u009dwçlM\u0086,\"Þé§\u0010!ß¡\u0088\u009f<\u008fµU¨ q\u0003\u0088\u00054\u0010ª5±BIÑ§\u0081\u0090a\u008a\u0006¥þ¼^\u0010\u0015{Û\u0013è$\u00837!Ã\u001aRò\u0096TØ"
.length();
char var16 = 24;
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
c = var20;
d = new String[10];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "«,ÏxÅG'üÙ§ádÝ\u001cÁ\u0019";
int var5 = "«,ÏxÅG'üÙ§ádÝ\u001cÁ\u0019".length();
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

f = var6;
g = new Integer[2];
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

var17 = "Õ txæ\u0089\t\u0018ô\u0007¶Aø\u0093¶; \u001eA®à£\u008b)Íù\u0004ø÷\u0012¬t\u0013éª^rl½®\b úW`âË\u0010&";
var19 = "Õ txæ\u0089\t\u0018ô\u0007¶Aø\u0093¶; \u001eA®à£\u008b)Íù\u0004ø÷\u0012¬t\u0013éª^rl½®\b úW`âË\u0010&".length();
var16 = 16;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 26153;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])e.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
e.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/xq", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = c[var5].getBytes("ISO-8859-1");
d[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/xq" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 6431;
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
throw new RuntimeException("su/catlean/xq", var14);
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
throw new RuntimeException("su/catlean/xq" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
