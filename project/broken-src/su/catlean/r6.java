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
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class r6 extends ru {
@NotNull
private final a1 m;
@NotNull
private final fd e;
private boolean H;
private static final long b = yz.a(6732415591084321626L, -70907119201148730L, MethodHandles.lookup().lookupClass()).a(158741064847675L);
private static final String[] d;
private static final String[] f;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] k;
private static final Map l;
private static final long[] n;
private static final Long[] o;
private static final Map p;

public r6(int a, int a, @NotNull a1 setting, int a) {
long var5 = ((long)a << 32 | (long)ax << 48 >>> 32 | (long)axx << 48 >>> 48) ^ b;
long var7 = var5 ^ 122829037659509L;
long var9 = var5 ^ 29581881696025L;
Intrinsics.checkNotNullParameter(setting, a<"p">(1534, 8205062429503293539L ^ var5));
super(var9, setting);
this.m = setting;
this.e = new fd(_s.OUT_QUINT, c<"o">(21365, 1877652957693642298L ^ var5), var7);
}

@NotNull
@Override
public a1 A() {
return this.m;
}

@Override
public void r(@NotNull class_332 context, int mouseX, int mouseY, long a, float factor) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 4
// 002: dup2
// 003: ldc2_w 49494862758009
// 006: lxor
// 007: lstore 7
// 009: dup2
// 00a: ldc2_w 20797107207379
// 00d: lxor
// 00e: dup2
// 00f: bipush 48
// 011: lushr
// 012: l2i
// 013: istore 9
// 015: dup2
// 016: bipush 16
// 018: lshl
// 019: bipush 48
// 01b: lushr
// 01c: l2i
// 01d: istore 10
// 01f: dup2
// 020: bipush 32
// 022: lshl
// 023: bipush 32
// 025: lushr
// 026: l2i
// 027: istore 11
// 029: pop2
// 02a: dup2
// 02b: ldc2_w 39844814704388
// 02e: lxor
// 02f: lstore 12
// 031: dup2
// 032: ldc2_w 114903264084220
// 035: lxor
// 036: lstore 14
// 038: dup2
// 039: ldc2_w 136713714549074
// 03c: lxor
// 03d: lstore 16
// 03f: dup2
// 040: ldc2_w 126888773963804
// 043: lxor
// 044: lstore 18
// 046: dup2
// 047: ldc2_w 115096991696004
// 04a: lxor
// 04b: lstore 20
// 04d: dup2
// 04e: ldc2_w 127000398109451
// 051: lxor
// 052: lstore 22
// 054: dup2
// 055: ldc2_w 4763820429086
// 058: lxor
// 059: lstore 24
// 05b: dup2
// 05c: ldc2_w 57494645123396
// 05f: lxor
// 060: lstore 26
// 062: pop2
// 063: ldc2_w 6640577628623117237
// 066: lload 4
// 068: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: aload 1
// 06e: sipush 10681
// 071: ldc2_w 6380792193008877476
// 074: lload 4
// 076: lxor
// 077: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/r6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07f: astore 28
// 081: aload 0
// 082: getfield su/catlean/r6.H Z
// 085: aload 28
// 087: ifnull 0cb
// 08a: ifeq 0de
// 08d: goto 09b
// 090: ldc2_w 6659864036466162010
// 093: lload 4
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: invokestatic java/lang/System.currentTimeMillis ()J
// 09e: sipush 31596
// 0a1: ldc2_w 6616335131435648942
// 0a4: lload 4
// 0a6: lxor
// 0a7: invokedynamic z (IJ)I bsm=su/catlean/r6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: i2l
// 0ad: lrem
// 0ae: sipush 21900
// 0b1: ldc2_w 3720298993782364995
// 0b4: lload 4
// 0b6: lxor
// 0b7: invokedynamic o (IJ)J bsm=su/catlean/r6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bc: lcmp
// 0bd: goto 0cb
// 0c0: ldc2_w 6659864036466162010
// 0c3: lload 4
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: ifle 0de
// 0ce: ldc "|"
// 0d0: goto 0e0
// 0d3: ldc2_w 6659864036466162010
// 0d6: lload 4
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: ldc ""
// 0e0: astore 29
// 0e2: lload 14
// 0e4: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 0e7: aload 0
// 0e8: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 0eb: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 0ee: lload 16
// 0f0: dup2_x1
// 0f1: pop2
// 0f2: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 0f5: ldc 6.0
// 0f7: fadd
// 0f8: fstore 30
// 0fa: lload 14
// 0fc: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 0ff: aload 1
// 100: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 103: dup
// 104: sipush 28907
// 107: ldc2_w 2475639890324088565
// 10a: lload 4
// 10c: lxor
// 10d: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/r6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 115: aload 0
// 116: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 119: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 11c: aload 0
// 11d: invokevirtual su/catlean/r6.x ()F
// 120: fconst_1
// 121: fsub
// 122: aload 0
// 123: invokevirtual su/catlean/r6.R ()F
// 126: fconst_1
// 127: fsub
// 128: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 12b: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 12e: lload 20
// 130: dup2_x1
// 131: pop2
// 132: bipush 0
// 133: bipush 0
// 134: sipush 26692
// 137: ldc2_w 7561890673655436421
// 13a: lload 4
// 13c: lxor
// 13d: invokedynamic z (IJ)I bsm=su/catlean/r6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: aconst_null
// 143: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 146: aload 0
// 147: getfield su/catlean/r6.e Lsu/catlean/fd;
// 14a: aload 0
// 14b: invokevirtual su/catlean/r6.x ()F
// 14e: fload 30
// 150: fadd
// 151: fstore 31
// 153: aload 0
// 154: invokevirtual su/catlean/r6.x ()F
// 157: fload 30
// 159: fadd
// 15a: aload 0
// 15b: invokevirtual su/catlean/r6.F ()F
// 15e: fadd
// 15f: ldc 7.0
// 161: fsub
// 162: fload 30
// 164: fsub
// 165: fstore 32
// 167: iload 2
// 168: i2f
// 169: fstore 33
// 16b: fload 31
// 16d: fload 33
// 16f: fcmpg
// 170: aload 28
// 172: lload 4
// 174: lconst_0
// 175: lcmp
// 176: iflt 1a2
// 179: ifnull 1a0
// 17c: ifgt 1c9
// 17f: goto 18d
// 182: ldc2_w 6659864036466162010
// 185: lload 4
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: fload 33
// 18f: fload 32
// 191: fcmpg
// 192: goto 1a0
// 195: ldc2_w 6659864036466162010
// 198: lload 4
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: aload 28
// 1a2: ifnull 1c6
// 1a5: ifgt 1c5
// 1a8: goto 1b6
// 1ab: ldc2_w 6659864036466162010
// 1ae: lload 4
// 1b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b5: athrow
// 1b6: bipush 1
// 1b7: goto 1ca
// 1ba: ldc2_w 6659864036466162010
// 1bd: lload 4
// 1bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c4: athrow
// 1c5: bipush 0
// 1c6: goto 1ca
// 1c9: bipush 0
// 1ca: ifeq 251
// 1cd: aload 0
// 1ce: invokevirtual su/catlean/r6.R ()F
// 1d1: fstore 31
// 1d3: aload 0
// 1d4: invokevirtual su/catlean/r6.R ()F
// 1d7: ldc 12.0
// 1d9: fadd
// 1da: fstore 32
// 1dc: iload 3
// 1dd: i2f
// 1de: fstore 33
// 1e0: fload 31
// 1e2: fload 33
// 1e4: fcmpg
// 1e5: aload 28
// 1e7: lload 4
// 1e9: lconst_0
// 1ea: lcmp
// 1eb: ifle 217
// 1ee: ifnull 215
// 1f1: ifgt 23e
// 1f4: goto 202
// 1f7: ldc2_w 6659864036466162010
// 1fa: lload 4
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: fload 33
// 204: fload 32
// 206: fcmpg
// 207: goto 215
// 20a: ldc2_w 6659864036466162010
// 20d: lload 4
// 20f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 214: athrow
// 215: aload 28
// 217: ifnull 23b
// 21a: ifgt 23a
// 21d: goto 22b
// 220: ldc2_w 6659864036466162010
// 223: lload 4
// 225: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22a: athrow
// 22b: bipush 1
// 22c: goto 23f
// 22f: ldc2_w 6659864036466162010
// 232: lload 4
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: bipush 0
// 23b: goto 23f
// 23e: bipush 0
// 23f: ifeq 251
// 242: fconst_1
// 243: goto 252
// 246: ldc2_w 6659864036466162010
// 249: lload 4
// 24b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: athrow
// 251: fconst_0
// 252: lload 12
// 254: dup2_x1
// 255: pop2
// 256: invokevirtual su/catlean/fd.B (JF)V
// 259: aload 1
// 25a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 25d: dup
// 25e: sipush 22121
// 261: ldc2_w 6901740607663063158
// 264: lload 4
// 266: lxor
// 267: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/r6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 26f: aload 0
// 270: invokevirtual su/catlean/r6.x ()F
// 273: fload 30
// 275: fadd
// 276: iload 9
// 278: i2c
// 279: swap
// 27a: aload 0
// 27b: invokevirtual su/catlean/r6.R ()F
// 27e: aload 0
// 27f: invokevirtual su/catlean/r6.F ()F
// 282: ldc 7.0
// 284: fsub
// 285: fload 30
// 287: fsub
// 288: ldc 12.0
// 28a: ldc 3.0
// 28c: ldc 2.5
// 28e: aload 0
// 28f: getfield su/catlean/r6.e Lsu/catlean/fd;
// 292: invokevirtual su/catlean/fd.a ()F
// 295: fadd
// 296: fconst_0
// 297: fconst_1
// 298: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 29b: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 29e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2a1: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 2a4: fconst_0
// 2a5: iload 10
// 2a7: i2s
// 2a8: fconst_0
// 2a9: iload 11
// 2ab: fconst_0
// 2ac: sipush 17984
// 2af: ldc2_w 2815890871800396420
// 2b2: lload 4
// 2b4: lxor
// 2b5: invokedynamic z (IJ)I bsm=su/catlean/r6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ba: aconst_null
// 2bb: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 2be: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2c1: lload 24
// 2c3: aload 1
// 2c4: new su/catlean/o7
// 2c7: dup
// 2c8: aload 0
// 2c9: invokevirtual su/catlean/r6.x ()F
// 2cc: fload 30
// 2ce: fadd
// 2cf: fconst_1
// 2d0: fadd
// 2d1: aload 0
// 2d2: invokevirtual su/catlean/r6.R ()F
// 2d5: aload 0
// 2d6: invokevirtual su/catlean/r6.x ()F
// 2d9: aload 0
// 2da: invokevirtual su/catlean/r6.F ()F
// 2dd: fadd
// 2de: ldc 9.0
// 2e0: fsub
// 2e1: aload 0
// 2e2: invokevirtual su/catlean/r6.R ()F
// 2e5: ldc 12.0
// 2e7: fadd
// 2e8: invokespecial su/catlean/o7.<init> (FFFF)V
// 2eb: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 2ee: lload 22
// 2f0: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 2f3: aload 28
// 2f5: lload 4
// 2f7: lconst_0
// 2f8: lcmp
// 2f9: ifle 306
// 2fc: ifnull 386
// 2ff: aload 0
// 300: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 303: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 306: lload 16
// 308: dup2_x1
// 309: pop2
// 30a: checkcast java/lang/String
// 30d: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 310: fconst_2
// 311: fadd
// 312: fstore 31
// 314: lload 4
// 316: lconst_0
// 317: lcmp
// 318: ifle 359
// 31b: fload 31
// 31d: aload 0
// 31e: invokevirtual su/catlean/r6.F ()F
// 321: fload 31
// 323: fsub
// 324: fcmpg
// 325: ifge 373
// 328: lload 22
// 32a: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 32d: aload 1
// 32e: aload 0
// 32f: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 332: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 335: aload 29
// 337: invokedynamic makeConcatWithConstants (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 33c: aload 0
// 33d: invokevirtual su/catlean/r6.x ()F
// 340: fload 30
// 342: fadd
// 343: ldc 3.0
// 345: fadd
// 346: lload 18
// 348: dup2_x1
// 349: pop2
// 34a: aload 0
// 34b: invokevirtual su/catlean/r6.R ()F
// 34e: fconst_1
// 34f: fadd
// 350: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 353: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 356: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 359: lload 4
// 35b: lconst_0
// 35c: lcmp
// 35d: ifle 3d4
// 360: aload 28
// 362: ifnonnull 3b7
// 365: goto 373
// 368: ldc2_w 6659864036466162010
// 36b: lload 4
// 36d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 372: athrow
// 373: lload 22
// 375: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 378: goto 386
// 37b: ldc2_w 6659864036466162010
// 37e: lload 4
// 380: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 385: athrow
// 386: aload 1
// 387: aload 0
// 388: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 38b: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 38e: aload 29
// 390: invokedynamic makeConcatWithConstants (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 395: aload 0
// 396: invokevirtual su/catlean/r6.x ()F
// 399: aload 0
// 39a: invokevirtual su/catlean/r6.F ()F
// 39d: fadd
// 39e: ldc 10.0
// 3a0: fsub
// 3a1: fload 31
// 3a3: fsub
// 3a4: lload 18
// 3a6: dup2_x1
// 3a7: pop2
// 3a8: aload 0
// 3a9: invokevirtual su/catlean/r6.R ()F
// 3ac: fconst_1
// 3ad: fadd
// 3ae: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3b1: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 3b4: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 3b7: aload 0
// 3b8: invokevirtual su/catlean/r6.x ()F
// 3bb: fload 30
// 3bd: fadd
// 3be: fstore 32
// 3c0: aload 0
// 3c1: invokevirtual su/catlean/r6.x ()F
// 3c4: fload 30
// 3c6: fadd
// 3c7: aload 0
// 3c8: invokevirtual su/catlean/r6.F ()F
// 3cb: fadd
// 3cc: ldc 7.0
// 3ce: fsub
// 3cf: fload 30
// 3d1: fsub
// 3d2: fstore 33
// 3d4: iload 2
// 3d5: i2f
// 3d6: fstore 34
// 3d8: fload 32
// 3da: fload 34
// 3dc: fcmpg
// 3dd: aload 28
// 3df: lload 4
// 3e1: lconst_0
// 3e2: lcmp
// 3e3: ifle 40f
// 3e6: ifnull 40d
// 3e9: ifgt 436
// 3ec: goto 3fa
// 3ef: ldc2_w 6659864036466162010
// 3f2: lload 4
// 3f4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f9: athrow
// 3fa: fload 34
// 3fc: fload 33
// 3fe: fcmpg
// 3ff: goto 40d
// 402: ldc2_w 6659864036466162010
// 405: lload 4
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: aload 28
// 40f: ifnull 433
// 412: ifgt 432
// 415: goto 423
// 418: ldc2_w 6659864036466162010
// 41b: lload 4
// 41d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 422: athrow
// 423: bipush 1
// 424: goto 437
// 427: ldc2_w 6659864036466162010
// 42a: lload 4
// 42c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 431: athrow
// 432: bipush 0
// 433: goto 437
// 436: bipush 0
// 437: ifeq 50c
// 43a: aload 0
// 43b: invokevirtual su/catlean/r6.R ()F
// 43e: fstore 32
// 440: aload 0
// 441: invokevirtual su/catlean/r6.R ()F
// 444: ldc 12.0
// 446: fadd
// 447: fstore 33
// 449: iload 3
// 44a: i2f
// 44b: fstore 34
// 44d: fload 32
// 44f: fload 34
// 451: fcmpg
// 452: aload 28
// 454: lload 4
// 456: lconst_0
// 457: lcmp
// 458: iflt 484
// 45b: ifnull 482
// 45e: ifgt 4ab
// 461: goto 46f
// 464: ldc2_w 6659864036466162010
// 467: lload 4
// 469: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46e: athrow
// 46f: fload 34
// 471: fload 33
// 473: fcmpg
// 474: goto 482
// 477: ldc2_w 6659864036466162010
// 47a: lload 4
// 47c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 481: athrow
// 482: aload 28
// 484: ifnull 4a8
// 487: ifgt 4a7
// 48a: goto 498
// 48d: ldc2_w 6659864036466162010
// 490: lload 4
// 492: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 497: athrow
// 498: bipush 1
// 499: goto 4ac
// 49c: ldc2_w 6659864036466162010
// 49f: lload 4
// 4a1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a6: athrow
// 4a7: bipush 0
// 4a8: goto 4ac
// 4ab: bipush 0
// 4ac: lload 4
// 4ae: lconst_0
// 4af: lcmp
// 4b0: iflt 4b9
// 4b3: ifeq 50c
// 4b6: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 4b9: sipush 9169
// 4bc: ldc2_w 2017049709939990290
// 4bf: lload 4
// 4c1: lxor
// 4c2: invokedynamic z (IJ)I bsm=su/catlean/r6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c7: if_icmpeq 50c
// 4ca: goto 4d8
// 4cd: ldc2_w 6659864036466162010
// 4d0: lload 4
// 4d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d7: athrow
// 4d8: lload 7
// 4da: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 4dd: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 4e0: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 4e3: sipush 8332
// 4e6: ldc2_w 7226830047388900428
// 4e9: lload 4
// 4eb: lxor
// 4ec: invokedynamic z (IJ)I bsm=su/catlean/r6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f1: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 4f4: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 4f7: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 4fa: bipush 0
// 4fb: invokevirtual su/catlean/fi.A (Z)V
// 4fe: goto 50c
// 501: ldc2_w 6659864036466162010
// 504: lload 4
// 506: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50b: athrow
// 50c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 50f: lload 26
// 511: aload 1
// 512: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 515: ldc2_w 6656778101145289456
// 518: lload 4
// 51a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51f: lload 4
// 521: lconst_0
// 522: lcmp
// 523: ifle 52d
// 526: ifnull 545
// 529: bipush 2
// 52a: anewarray 206
// 52d: ldc2_w 6638004485223901686
// 530: lload 4
// 532: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 537: goto 545
// 53a: ldc2_w 6659864036466162010
// 53d: lload 4
// 53f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 544: athrow
// 545: return
}

@Override
public void W(long a, double mouseX, double mouseY, int button) {
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
// 002: ldc2_w 115855010917359
// 005: lxor
// 006: lstore 8
// 008: dup2
// 009: ldc2_w 138026233391681
// 00c: lxor
// 00d: lstore 10
// 00f: pop2
// 010: ldc2_w 8591482653260427430
// 013: lload 1
// 014: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 019: lload 8
// 01b: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 01e: aload 0
// 01f: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 022: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// 025: lload 10
// 027: dup2_x1
// 028: pop2
// 029: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 02c: ldc 6.0
// 02e: fadd
// 02f: fstore 13
// 031: astore 12
// 033: aload 0
// 034: invokevirtual su/catlean/r6.x ()F
// 037: fload 13
// 039: fadd
// 03a: fstore 14
// 03c: dload 3
// 03d: aload 0
// 03e: invokevirtual su/catlean/r6.x ()F
// 041: fload 13
// 043: fadd
// 044: aload 0
// 045: invokevirtual su/catlean/r6.F ()F
// 048: fadd
// 049: ldc 7.0
// 04b: fsub
// 04c: fload 13
// 04e: fsub
// 04f: f2d
// 050: dcmpg
// 051: aload 12
// 053: ifnull 078
// 056: ifgt 09f
// 059: goto 066
// 05c: ldc2_w 8610766840589636169
// 05f: lload 1
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: fload 14
// 068: f2d
// 069: dload 3
// 06a: dcmpg
// 06b: goto 078
// 06e: ldc2_w 8610766840589636169
// 071: lload 1
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: aload 12
// 07a: ifnull 09c
// 07d: ifgt 09b
// 080: goto 08d
// 083: ldc2_w 8610766840589636169
// 086: lload 1
// 087: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: athrow
// 08d: bipush 1
// 08e: goto 0a0
// 091: ldc2_w 8610766840589636169
// 094: lload 1
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: bipush 0
// 09c: goto 0a0
// 09f: bipush 0
// 0a0: ifeq 13c
// 0a3: aload 0
// 0a4: invokevirtual su/catlean/r6.R ()F
// 0a7: fstore 14
// 0a9: dload 5
// 0ab: aload 0
// 0ac: invokevirtual su/catlean/r6.R ()F
// 0af: ldc 12.0
// 0b1: fadd
// 0b2: f2d
// 0b3: dcmpg
// 0b4: aload 12
// 0b6: lload 1
// 0b7: lconst_0
// 0b8: lcmp
// 0b9: iflt 0e4
// 0bc: ifnull 0e2
// 0bf: ifgt 109
// 0c2: goto 0cf
// 0c5: ldc2_w 8610766840589636169
// 0c8: lload 1
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: fload 14
// 0d1: f2d
// 0d2: dload 5
// 0d4: dcmpg
// 0d5: goto 0e2
// 0d8: ldc2_w 8610766840589636169
// 0db: lload 1
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: aload 12
// 0e4: ifnull 106
// 0e7: ifgt 105
// 0ea: goto 0f7
// 0ed: ldc2_w 8610766840589636169
// 0f0: lload 1
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: bipush 1
// 0f8: goto 10a
// 0fb: ldc2_w 8610766840589636169
// 0fe: lload 1
// 0ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: athrow
// 105: bipush 0
// 106: goto 10a
// 109: bipush 0
// 10a: ifeq 13c
// 10d: aload 0
// 10e: aload 0
// 10f: getfield su/catlean/r6.H Z
// 112: aload 12
// 114: ifnull 135
// 117: goto 124
// 11a: ldc2_w 8610766840589636169
// 11d: lload 1
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: ifne 138
// 127: goto 134
// 12a: ldc2_w 8610766840589636169
// 12d: lload 1
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: bipush 1
// 135: goto 139
// 138: bipush 0
// 139: putfield su/catlean/r6.H Z
// 13c: return
}

@Override
public void U(double mouseX, double mouseY, int button) {
}

@Override
public void V(int key, short a, int a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 2
// 01: i2l
// 02: bipush 48
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 32
// 09: lshl
// 0a: bipush 16
// 0c: lushr
// 0d: lor
// 0e: iload 4
// 10: i2l
// 11: bipush 48
// 13: lshl
// 14: bipush 48
// 16: lushr
// 17: lor
// 18: lstore 5
// 1a: ldc2_w -3368314324986226980
// 1d: lload 5
// 1f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24: astore 7
// 26: aload 0
// 27: getfield su/catlean/r6.H Z
// 2a: aload 7
// 2c: ifnull 41
// 2f: ifeq b3
// 32: goto 40
// 35: ldc2_w -3385067743637375949
// 38: lload 5
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: iload 1
// 41: tableswitch 114 256 259 95 71 114 31
// 60: aload 0
// 61: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 64: aload 0
// 65: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 68: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 6b: checkcast java/lang/String
// 6e: bipush 1
// 6f: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 72: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 75: aload 7
// 77: ifnonnull b3
// 7a: goto 88
// 7d: ldc2_w -3385067743637375949
// 80: lload 5
// 82: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 87: athrow
// 88: aload 0
// 89: bipush 0
// 8a: putfield su/catlean/r6.H Z
// 8d: aload 7
// 8f: ifnonnull b3
// 92: goto a0
// 95: ldc2_w -3385067743637375949
// 98: lload 5
// 9a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9f: athrow
// a0: aload 0
// a1: bipush 0
// a2: putfield su/catlean/r6.H Z
// a5: goto b3
// a8: ldc2_w -3385067743637375949
// ab: lload 5
// ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b2: athrow
// b3: return
}

@Override
public void T(char char, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: ldc2_w 666088507151863459
// 03: lload 2
// 04: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09: astore 4
// 0b: aload 0
// 0c: aload 4
// 0e: ifnull 32
// 11: getfield su/catlean/r6.H Z
// 14: ifeq 45
// 17: goto 24
// 1a: ldc2_w 683120879634984012
// 1d: lload 2
// 1e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23: athrow
// 24: aload 0
// 25: goto 32
// 28: ldc2_w 683120879634984012
// 2b: lload 2
// 2c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: athrow
// 32: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 35: aload 0
// 36: invokevirtual su/catlean/r6.A ()Lsu/catlean/a1;
// 39: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 3c: iload 1
// 3d: invokedynamic makeConcatWithConstants (Ljava/lang/Object;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 42: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 45: return
}

@Override
public boolean S(byte a, double mouseX, double mouseY, double verticalAmount, long a) {
return false;
}

@Override
public void L() {
this.H = false;
}

static {
long var22 = b ^ 31111721448367L;
Cipher var24;
Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var25 = 1; var25 < 8; var25++) {
var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var31 = new String[4];
int var29 = 0;
String var28 = "[\u0080+@øØ«÷1\u00ad\fKT\u0082D`\u0010+\u007fð\u001a¦§§\u0097\u009eâ\u0097¢\u0088ßÙæ";
int var30 = "[\u0080+@øØ«÷1\u00ad\fKT\u0082D`\u0010+\u007fð\u001a¦§§\u0097\u009eâ\u0097¢\u0088ßÙæ".length();
char var27 = 16;
int var35 = -1;

label72:
while (true) {
String var36 = var28.substring(++var35, var35 + var27);
int var10001 = -1;

while (true) {
byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
String var50 = b(var32).intern();
switch (var10001) {
case 0:
var31[var29++] = var50;
if ((var35 += var27) >= var30) {
d = var31;
f = new String[4];
l = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[5];
int var14 = 0;
String var15 = "Ø´e\u001f\u008f\u0002ë\u008d\u0095ql\u00adoL{á`\u0099²ÙÞr\rý";
int var16 = "Ø´e\u001f\u008f\u0002ë\u008d\u0095ql\u00adoL{á`\u0099²ÙÞr\rý".length();
byte var13 = 0;

label54:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var39 = var17;
var10001 = var14++;
long var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var58 = -1;

while (true) {
long var19 = var54;
byte[] var21 = var11.doFinal(
new byte[]{
(byte)(var19 >>> 56),
(byte)(var19 >>> 48),
(byte)(var19 >>> 40),
(byte)(var19 >>> 32),
(byte)(var19 >>> 24),
(byte)(var19 >>> 16),
(byte)(var19 >>> 8),
(byte)var19
}
);
long var62 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var58) {
case 0:
var39[var10001] = var62;
if (var13 >= var16) {
h = var17;
k = new Integer[5];
p = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "Be«hÌßd¼Æ9Q¹\u0013jÃ2";
int var5 = "Be«hÌßd¼Æ9Q¹\u0013jÃ2".length();
byte var2 = 0;

do {
int var47 = var2;
var2 += 8;
byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
var47 = var3++;
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
var62 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var61 = -1;
var6[var47] = var62;
} while (var2 < var5);

n = var6;
o = new Long[2];
return;
}
break;
default:
var39[var10001] = var62;
if (var13 < var16) {
continue label54;
}

var15 = "vú¢Î-MË\t>\u0088\u0011)¢\u0092ª¾";
var16 = "vú¢Î-MË\t>\u0088\u0011)¢\u0092ª¾".length();
var13 = 0;
}

byte var46 = var13;
var13 += 8;
var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
var39 = var17;
var10001 = var14++;
var54 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var58 = 0;
}
}
}

var27 = var28.charAt(var35);
break;
default:
var31[var29++] = var50;
if ((var35 += var27) < var30) {
var27 = var28.charAt(var35);
continue label72;
}

var28 = "&S\u0088\u0013dUY%\u008döi\"sycD¹\u008bOwÓYØÝ£\u008dY\u00ad±\u0080þë eb\u008a¨\u001fF[w=Ç&O³U\u0083=ßñ\u00836Ëfñ´3©\u000bý\"\\÷\u0098";
var30 = "&S\u0088\u0013dUY%\u008döi\"sycD¹\u008bOwÓYØÝ£\u008dY\u00ad±\u0080þë eb\u008a¨\u001fF[w=Ç&O³U\u0083=ßñ\u00836Ëfñ´3©\u000bý\"\\÷\u0098".length();
var27 = ' ';
var35 = -1;
}

var36 = var28.substring(++var35, var35 + var27);
var10001 = 0;
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 19244;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/r6", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = d[var5].getBytes("ISO-8859-1");
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/r6" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 25072;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])l.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
l.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/r6", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
k[var3] = var15;
}

return k[var3];
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
throw new RuntimeException("su/catlean/r6" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5119;
if (o[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = n[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])p.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
p.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/r6", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
o[var3] = var15;
}

return o[var3];
}

private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
long var7 = c(var4, var5);
MethodHandle var9 = MethodHandles.constant(long.class, var7);
var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
throw new RuntimeException("su/catlean/r6" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
