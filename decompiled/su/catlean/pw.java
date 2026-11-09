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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class pw extends gf {
@NotNull
public static final pw G;
private static final long a = yz.a(-4030466965672635098L, 5267453608353006125L, MethodHandles.lookup().lookupClass()).a(137591095079909L);
private static final String[] b;
private static final String[] c;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private pw(byte var1, int var2, int var3) {
long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ a;
long var10001 = var4 ^ 73795638791800L;
int var6 = (int)((var4 ^ 73795638791800L) >>> 48);
int var7 = (int)((var4 ^ 73795638791800L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
super((char)var6, var7, b<"e">(18144, 217600490541986183L ^ var4), (char)var8);
}

@Override
public void h(long a, @NotNull class_332 context) {
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
// 002: ldc2_w 112807673159841
// 005: lxor
// 006: lstore 4
// 008: dup2
// 009: ldc2_w 50910300018319
// 00c: lxor
// 00d: lstore 6
// 00f: dup2
// 010: ldc2_w 4149061658461
// 013: lxor
// 014: lstore 8
// 016: dup2
// 017: ldc2_w 89424814517768
// 01a: lxor
// 01b: dup2
// 01c: bipush 48
// 01e: lushr
// 01f: l2i
// 020: istore 10
// 022: dup2
// 023: bipush 16
// 025: lshl
// 026: bipush 32
// 028: lushr
// 029: l2i
// 02a: istore 11
// 02c: dup2
// 02d: bipush 48
// 02f: lshl
// 030: bipush 48
// 032: lushr
// 033: l2i
// 034: istore 12
// 036: pop2
// 037: dup2
// 038: ldc2_w 109580710346244
// 03b: lxor
// 03c: lstore 13
// 03e: dup2
// 03f: ldc2_w 104104530525409
// 042: lxor
// 043: dup2
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 15
// 04a: dup2
// 04b: bipush 16
// 04d: lshl
// 04e: bipush 32
// 050: lushr
// 051: l2i
// 052: istore 16
// 054: dup2
// 055: bipush 48
// 057: lshl
// 058: bipush 48
// 05a: lushr
// 05b: l2i
// 05c: istore 17
// 05e: pop2
// 05f: dup2
// 060: ldc2_w 117179548680370
// 063: lxor
// 064: dup2
// 065: bipush 48
// 067: lushr
// 068: l2i
// 069: istore 18
// 06b: dup2
// 06c: bipush 16
// 06e: lshl
// 06f: bipush 32
// 071: lushr
// 072: l2i
// 073: istore 19
// 075: dup2
// 076: bipush 48
// 078: lshl
// 079: bipush 48
// 07b: lushr
// 07c: l2i
// 07d: istore 20
// 07f: pop2
// 080: dup2
// 081: ldc2_w 137326906772616
// 084: lxor
// 085: dup2
// 086: bipush 48
// 088: lushr
// 089: l2i
// 08a: istore 21
// 08c: dup2
// 08d: bipush 16
// 08f: lshl
// 090: bipush 48
// 092: lushr
// 093: l2i
// 094: istore 22
// 096: dup2
// 097: bipush 32
// 099: lshl
// 09a: bipush 32
// 09c: lushr
// 09d: l2i
// 09e: istore 23
// 0a0: pop2
// 0a1: dup2
// 0a2: ldc2_w 64416723276910
// 0a5: lxor
// 0a6: dup2
// 0a7: bipush 48
// 0a9: lushr
// 0aa: l2i
// 0ab: istore 24
// 0ad: dup2
// 0ae: bipush 16
// 0b0: lshl
// 0b1: bipush 16
// 0b3: lushr
// 0b4: lstore 25
// 0b6: pop2
// 0b7: dup2
// 0b8: ldc2_w 128377113661390
// 0bb: lxor
// 0bc: lstore 27
// 0be: dup2
// 0bf: ldc2_w 20173347401993
// 0c2: lxor
// 0c3: lstore 29
// 0c5: dup2
// 0c6: ldc2_w 99949442920536
// 0c9: lxor
// 0ca: lstore 31
// 0cc: dup2
// 0cd: ldc2_w 20494741382199
// 0d0: lxor
// 0d1: lstore 33
// 0d3: dup2
// 0d4: ldc2_w 23238624456863
// 0d7: lxor
// 0d8: lstore 35
// 0da: dup2
// 0db: ldc2_w 30591967126976
// 0de: lxor
// 0df: lstore 37
// 0e1: pop2
// 0e2: aload 3
// 0e3: sipush 9697
// 0e6: ldc2_w 3179959868119726873
// 0e9: lload 1
// 0ea: lxor
// 0eb: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0f3: aload 0
// 0f4: lload 37
// 0f6: invokevirtual su/catlean/pw.p (J)F
// 0f9: fstore 40
// 0fb: aload 0
// 0fc: lload 6
// 0fe: invokevirtual su/catlean/pw.V (J)F
// 101: fstore 41
// 103: fconst_0
// 104: fstore 42
// 106: getstatic su/catlean/zg.v Lsu/catlean/zg;
// 109: iload 18
// 10b: i2c
// 10c: iload 19
// 10e: iload 20
// 110: invokevirtual su/catlean/zg.h (CII)Ljava/util/List;
// 113: checkcast java/lang/Iterable
// 116: astore 44
// 118: bipush 0
// 119: istore 45
// 11b: ldc2_w -5990705277528627281
// 11e: lload 1
// 11f: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: aload 44
// 126: astore 46
// 128: new java/util/ArrayList
// 12b: dup
// 12c: invokespecial java/util/ArrayList.<init> ()V
// 12f: checkcast java/util/Collection
// 132: astore 47
// 134: istore 39
// 136: bipush 0
// 137: istore 48
// 139: aload 46
// 13b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 140: astore 49
// 142: aload 49
// 144: invokeinterface java/util/Iterator.hasNext ()Z 1
// 149: ifeq 1ca
// 14c: aload 49
// 14e: lload 1
// 14f: lconst_0
// 150: lcmp
// 151: ifle 15e
// 154: iload 39
// 156: ifeq 1db
// 159: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 15e: astore 50
// 160: aload 50
// 162: checkcast su/catlean/wl
// 165: astore 51
// 167: bipush 0
// 168: istore 52
// 16a: aload 51
// 16c: invokeinterface su/catlean/wl.I ()Z 1
// 171: iload 39
// 173: lload 1
// 174: lconst_0
// 175: lcmp
// 176: iflt 1a0
// 179: ifeq 19e
// 17c: ifeq 1b7
// 17f: goto 18c
// 182: ldc2_w -6031152530899291735
// 185: lload 1
// 186: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: athrow
// 18c: aload 51
// 18e: instanceof su/catlean/ft
// 191: goto 19e
// 194: ldc2_w -6031152530899291735
// 197: lload 1
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: iload 39
// 1a0: ifeq 1b4
// 1a3: ifeq 1b7
// 1a6: goto 1b3
// 1a9: ldc2_w -6031152530899291735
// 1ac: lload 1
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: athrow
// 1b3: bipush 1
// 1b4: goto 1b8
// 1b7: bipush 0
// 1b8: ifeq 142
// 1bb: aload 47
// 1bd: aload 50
// 1bf: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 1c4: pop
// 1c5: iload 39
// 1c7: ifne 142
// 1ca: aload 47
// 1cc: checkcast java/util/List
// 1cf: nop
// 1d0: lload 1
// 1d1: lconst_0
// 1d2: lcmp
// 1d3: ifle 15e
// 1d6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 1db: astore 43
// 1dd: aload 43
// 1df: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1e4: ifeq 4b3
// 1e7: aload 43
// 1e9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1ee: checkcast su/catlean/wl
// 1f1: astore 44
// 1f3: aload 44
// 1f5: sipush 8200
// 1f8: ldc2_w 5710911611874295537
// 1fb: lload 1
// 1fc: lxor
// 1fd: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 202: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 205: aload 44
// 207: checkcast su/catlean/ft
// 20a: astore 45
// 20c: lload 1
// 20d: lconst_0
// 20e: lcmp
// 20f: ifle 4bb
// 212: iload 39
// 214: lload 1
// 215: lconst_0
// 216: lcmp
// 217: ifle 21f
// 21a: ifeq 4bb
// 21d: iload 39
// 21f: ifeq 25b
// 222: goto 22f
// 225: ldc2_w -6031152530899291735
// 228: lload 1
// 229: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: athrow
// 22f: getstatic su/catlean/zg.v Lsu/catlean/zg;
// 232: aload 45
// 234: invokevirtual su/catlean/ft.E ()Ljava/lang/String;
// 237: lload 4
// 239: invokevirtual su/catlean/zg.e (Ljava/lang/String;J)Lnet/minecraft/class_1792;
// 23c: dup
// 23d: ifnonnull 25e
// 240: goto 24d
// 243: ldc2_w -6031152530899291735
// 246: lload 1
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: pop
// 24e: goto 25b
// 251: ldc2_w -6031152530899291735
// 254: lload 1
// 255: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25a: athrow
// 25b: goto 1dd
// 25e: astore 46
// 260: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 263: bipush 1
// 264: anewarray 365
// 267: astore 48
// 269: aload 48
// 26b: bipush 0
// 26c: aload 46
// 26e: aastore
// 26f: aload 48
// 271: iload 24
// 273: i2c
// 274: lload 25
// 276: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 279: invokevirtual su/catlean/fg.R ()Z
// 27c: istore 47
// 27e: aload 45
// 280: invokevirtual su/catlean/ft.X ()Lsu/catlean/lj;
// 283: invokevirtual su/catlean/lj.X ()I
// 286: iload 10
// 288: i2s
// 289: swap
// 28a: iload 11
// 28c: swap
// 28d: iload 12
// 28f: i2c
// 290: swap
// 291: invokestatic su/catlean/bx.k (SICI)Z
// 294: istore 48
// 296: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 299: aload 45
// 29b: invokevirtual su/catlean/ft.X ()Lsu/catlean/lj;
// 29e: invokevirtual su/catlean/lj.X ()I
// 2a1: lload 8
// 2a3: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 2a6: astore 49
// 2a8: lload 31
// 2aa: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 2ad: lload 29
// 2af: aload 49
// 2b1: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 2b4: ldc 22.0
// 2b6: fadd
// 2b7: fstore 50
// 2b9: lload 13
// 2bb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2be: invokevirtual net/minecraft/class_746.method_7357 ()Lnet/minecraft/class_1796;
// 2c1: aload 46
// 2c3: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 2c6: invokevirtual net/minecraft/class_1796.method_7904 (Lnet/minecraft/class_1799;)Z
// 2c9: istore 51
// 2cb: aload 0
// 2cc: checkcast su/catlean/gf
// 2cf: aload 3
// 2d0: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2d3: dup
// 2d4: sipush 1803
// 2d7: ldc2_w 8972313959619402229
// 2da: lload 1
// 2db: lxor
// 2dc: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e4: fload 40
// 2e6: iload 15
// 2e8: i2s
// 2e9: iload 16
// 2eb: fload 41
// 2ed: fload 50
// 2ef: ldc 16.0
// 2f1: iload 17
// 2f3: i2s
// 2f4: fconst_0
// 2f5: bipush 0
// 2f6: sipush 9125
// 2f9: ldc2_w 4217049483865312155
// 2fc: lload 1
// 2fd: lxor
// 2fe: invokedynamic w (IJ)I bsm=su/catlean/pw.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 303: aconst_null
// 304: invokestatic su/catlean/gf.b (Lsu/catlean/gf;Lorg/joml/Matrix3x2fStack;FSIFFFSFZILjava/lang/Object;)V
// 307: iload 39
// 309: lload 1
// 30a: lconst_0
// 30b: lcmp
// 30c: ifle 314
// 30f: ifeq 3d5
// 312: iload 51
// 314: ifeq 3a0
// 317: goto 324
// 31a: ldc2_w -6031152530899291735
// 31d: lload 1
// 31e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 323: athrow
// 324: lload 13
// 326: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 329: invokevirtual net/minecraft/class_746.method_7357 ()Lnet/minecraft/class_1796;
// 32c: aload 46
// 32e: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 331: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 334: lload 33
// 336: invokevirtual su/catlean/jl.K (J)F
// 339: invokevirtual net/minecraft/class_1796.method_7905 (Lnet/minecraft/class_1799;F)F
// 33c: fstore 52
// 33e: aload 3
// 33f: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 342: dup
// 343: sipush 871
// 346: ldc2_w 680602837713493404
// 349: lload 1
// 34a: lxor
// 34b: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 350: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 353: iload 21
// 355: i2c
// 356: fload 40
// 358: fload 41
// 35a: ldc 16.0
// 35c: fconst_1
// 35d: fload 52
// 35f: fsub
// 360: fmul
// 361: fadd
// 362: fload 50
// 364: ldc 16.0
// 366: fload 52
// 368: fmul
// 369: ldc 3.0
// 36b: fconst_0
// 36c: fconst_0
// 36d: fconst_1
// 36e: getstatic java/awt/Color.RED Ljava/awt/Color;
// 371: dup
// 372: bipush 41
// 374: ldc2_w 3563198994527067859
// 377: lload 1
// 378: lxor
// 379: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 381: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 384: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 387: fconst_0
// 388: iload 22
// 38a: i2s
// 38b: fconst_0
// 38c: iload 23
// 38e: fconst_0
// 38f: sipush 23007
// 392: ldc2_w 8150690150747451874
// 395: lload 1
// 396: lxor
// 397: invokedynamic w (IJ)I bsm=su/catlean/pw.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39c: aconst_null
// 39d: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 3a0: aload 3
// 3a1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3a4: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 3a7: pop
// 3a8: aload 3
// 3a9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3ac: fload 40
// 3ae: fconst_2
// 3af: fadd
// 3b0: fload 41
// 3b2: fconst_2
// 3b3: fadd
// 3b4: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 3b7: pop
// 3b8: aload 3
// 3b9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3bc: ldc 0.7
// 3be: invokevirtual org/joml/Matrix3x2fStack.scale (F)Lorg/joml/Matrix3x2f;
// 3c1: pop
// 3c2: aload 3
// 3c3: aload 46
// 3c5: invokevirtual net/minecraft/class_1792.method_7854 ()Lnet/minecraft/class_1799;
// 3c8: bipush 0
// 3c9: bipush 0
// 3ca: invokevirtual net/minecraft/class_332.method_51427 (Lnet/minecraft/class_1799;II)V
// 3cd: aload 3
// 3ce: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3d1: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 3d4: pop
// 3d5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3d8: aload 3
// 3d9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3dc: dup
// 3dd: sipush 871
// 3e0: ldc2_w 680602837713493404
// 3e3: lload 1
// 3e4: lxor
// 3e5: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3ed: fload 40
// 3ef: sipush 21496
// 3f2: ldc2_w 2341117516544129988
// 3f5: lload 1
// 3f6: lxor
// 3f7: invokedynamic w (IJ)I bsm=su/catlean/pw.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fc: i2f
// 3fd: fadd
// 3fe: fload 41
// 400: ldc 4.0
// 402: fadd
// 403: ldc 0.5
// 405: ldc 9.0
// 407: bipush 1
// 408: anewarray 287
// 40b: astore 52
// 40d: aload 52
// 40f: bipush 0
// 410: new java/awt/Color
// 413: dup
// 414: sipush 29176
// 417: ldc2_w 800486475751233991
// 41a: lload 1
// 41b: lxor
// 41c: invokedynamic w (IJ)I bsm=su/catlean/pw.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 421: bipush 1
// 422: invokespecial java/awt/Color.<init> (IZ)V
// 425: aastore
// 426: aload 52
// 428: lload 35
// 42a: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 42d: iload 48
// 42f: lload 1
// 430: lconst_0
// 431: lcmp
// 432: ifle 45f
// 435: iload 39
// 437: ifeq 45f
// 43a: ifeq 45d
// 43d: goto 44a
// 440: ldc2_w -6031152530899291735
// 443: lload 1
// 444: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 449: athrow
// 44a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 44d: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 450: goto 478
// 453: ldc2_w -6031152530899291735
// 456: lload 1
// 457: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45c: athrow
// 45d: iload 47
// 45f: ifeq 475
// 462: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 465: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 468: goto 478
// 46b: ldc2_w -6031152530899291735
// 46e: lload 1
// 46f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 474: athrow
// 475: getstatic java/awt/Color.RED Ljava/awt/Color;
// 478: astore 52
// 47a: aload 0
// 47b: aload 3
// 47c: aload 49
// 47e: fload 40
// 480: ldc 18.0
// 482: fadd
// 483: fload 41
// 485: ldc 3.0
// 487: fadd
// 488: lload 27
// 48a: dup2_x1
// 48b: pop2
// 48c: aload 52
// 48e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 491: aload 52
// 493: invokevirtual su/catlean/pw.Z (Lnet/minecraft/class_332;Ljava/lang/String;FJFLjava/awt/Color;)V
// 496: fload 40
// 498: fload 50
// 49a: fconst_2
// 49b: fadd
// 49c: fadd
// 49d: fstore 40
// 49f: fload 42
// 4a1: fload 50
// 4a3: fconst_2
// 4a4: fadd
// 4a5: fadd
// 4a6: fstore 42
// 4a8: lload 1
// 4a9: lconst_0
// 4aa: lcmp
// 4ab: iflt 4bb
// 4ae: iload 39
// 4b0: ifne 1dd
// 4b3: aload 0
// 4b4: fload 42
// 4b6: ldc 16.0
// 4b8: invokevirtual su/catlean/pw.X (FF)V
// 4bb: return
}

static {
long var20 = a ^ 35488116036715L;
long var10001 = var20 ^ 63723483664536L;
int var22 = (int)((var20 ^ 63723483664536L) >>> 56);
int var23 = (int)((var20 ^ 63723483664536L) << 8 >>> 32);
int var24 = (int)(var10001 << 40 >>> 40);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[6];
int var16 = 0;
String var15 = "\u0017Þ9L>±ZÓö¿é\u0007X´\u001c'Òî\u0098\u0088\u0082\u0096ï\u0002Å½<ÙÐY¹\u0089\u0010ÝRöÖV.068\u0018VâÜ\u0084\u0080a\u0088æ\f_»\u0091þ\u0000\u001f5\u000f>\u0087j¯*9Ø¢\u0012\u009d\\\u0003\u0011\u0091ÿ\u0015\u0080A]\u001dd=I\u000búaÉË@¦þ¦´\u0092f\u0007w8^eÑ\u009bj<¢ÁÂSÃ\u001fÁ£\u009cP¡Ô&\u008czåzª\n7¸Ä\u0084ï¼\u0096±:\u008a\u0016î\u0002Âä\u0016-d¦<$z»\u0097~¿\u0085\u0019ÖµNF×\u0019\u0082\u0080K+\u008dÄK\u0003\u008aRªä\u001e³L\u0013\u00811 \u00adh>±[\u00admËÖ{\u0010\u001e\u0014l¢UáJ\u0014Ç¨_b#¯äî";
int var17 = "\u0017Þ9L>±ZÓö¿é\u0007X´\u001c'Òî\u0098\u0088\u0082\u0096ï\u0002Å½<ÙÐY¹\u0089\u0010ÝRöÖV.068\u0018VâÜ\u0084\u0080a\u0088æ\f_»\u0091þ\u0000\u001f5\u000f>\u0087j¯*9Ø¢\u0012\u009d\\\u0003\u0011\u0091ÿ\u0015\u0080A]\u001dd=I\u000búaÉË@¦þ¦´\u0092f\u0007w8^eÑ\u009bj<¢ÁÂSÃ\u001fÁ£\u009cP¡Ô&\u008czåzª\n7¸Ä\u0084ï¼\u0096±:\u008a\u0016î\u0002Âä\u0016-d¦<$z»\u0097~¿\u0085\u0019ÖµNF×\u0019\u0082\u0080K+\u008dÄK\u0003\u008aRªä\u001e³L\u0013\u00811 \u00adh>±[\u00admËÖ{\u0010\u001e\u0014l¢UáJ\u0014Ç¨_b#¯äî"
.length();
char var14 = ' ';
int var27 = -1;

label54:
while (true) {
String var28 = var15.substring(++var27, var27 + var14);
byte var32 = -1;

while (true) {
byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
String var40 = b(var19).intern();
switch (var32) {
case 0:
var18[var16++] = var40;
if ((var27 += var14) >= var17) {
b = var18;
c = new String[6];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "ò6D\u001dèµõÇF`\u0005&f\u000fÜ¡";
int var5 = "ò6D\u001dèµõÇF`\u0005&f\u000fÜ¡".length();
byte var2 = 0;

label36:
while (true) {
byte var36 = var2;
var2 += 8;
byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
long[] var31 = var6;
int var37 = var3++;
long var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var47 = -1;

while (true) {
long var8 = var44;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var49 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var47) {
case 0:
var31[var37] = var49;
if (var2 >= var5) {
g = var6;
h = new Integer[4];
G = new pw((byte)var22, var23, var24);
return;
}
break;
default:
var31[var37] = var49;
if (var2 < var5) {
continue label36;
}

var4 = "ýó9Éiô;y'Éóöì\u000e \u0012";
var5 = "ýó9Éiô;y'Éóöì\u000e \u0012".length();
var2 = 0;
}

byte var38 = var2;
var2 += 8;
var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
var31 = var6;
var37 = var3++;
var44 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var47 = 0;
}
}
}

var14 = var15.charAt(var27);
break;
default:
var18[var16++] = var40;
if ((var27 += var14) < var17) {
var14 = var15.charAt(var27);
continue label54;
}

var15 = "ù\u0097\u0088\u0096\u001f\u0010f\tå\u000fr\u0011lßà(\u009f¾1{\u0091\u0000âCöÔx\u000bS¥®+\u0018\u0012\u007f»\u0097Jîw\u0093¬Gq¿£üf5'uq®\u0004.Oñ";
var17 = "ù\u0097\u0088\u0096\u001f\u0010f\tå\u000fr\u0011lßà(\u009f¾1{\u0091\u0000âCöÔx\u000bS¥®+\u0018\u0012\u007f»\u0097Jîw\u0093¬Gq¿£üf5'uq®\u0004.Oñ"
.length();
var14 = ' ';
var27 = -1;
}

var28 = var15.substring(++var27, var27 + var14);
var32 = 0;
}
}
}

private static NumberFormatException a(NumberFormatException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 13200;
if (c[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/pw", var10);
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
throw new RuntimeException("su/catlean/pw" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 17749;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])i.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/pw", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/pw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
