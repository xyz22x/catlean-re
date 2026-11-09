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

public final class f7 {
@NotNull
private final gf c;
@NotNull
private final fd a;
@NotNull
private final fd h;
@NotNull
private final bj G;
private float I;
private float l;
private float N;
private float F;
private static String m;
private static final long b = yz.a(-5843255285202305967L, -7941828740618498001L, MethodHandles.lookup().lookupClass()).a(90371638727555L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] i;
private static final Map j;
private static final long[] k;
private static final Long[] n;
private static final Map o;

public f7(@NotNull gf widget, long a) {
ax = b ^ ax;
long var4 = ax ^ 129748740415649L;
long var6 = ax ^ 47719769087398L;
Intrinsics.checkNotNullParameter(widget, a<"w">(28704, 3659579093020764553L ^ ax));
super();
this.c = widget;
this.a = new fd(_s.OUT_QUINT, c<"d">(12052, 1427479373556161790L ^ ax), var4);
this.h = new fd(_s.OUT_QUINT, c<"d">(12591, 7858850178436399812L ^ ax), var4);
this.G = new bj(a<"w">(30976, 8646657428194091176L ^ ax), b<"q">(12388, 6924726219423946897L ^ ax), b<"q">(20549, 2451609142972086452L ^ ax), var6);
this.N = 116.0F;
this.F = 13.0F;
}

@NotNull
public final gf Q() {
return this.c;
}

public final float h() {
return this.I;
}

public final void N(float <set-?>) {
this.I = <set-?>;
}

public final float D() {
return this.l;
}

public final void c(float <set-?>) {
this.l = <set-?>;
}

public final float S() {
return this.N;
}

public final void i(float <set-?>) {
this.N = <set-?>;
}

public final float G() {
return this.F;
}

public final void p(float <set-?>) {
this.F = <set-?>;
}

public final void z(@NotNull class_332 context, int mouseX, long a, int mouseY, float xPos, float yPos) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/f7.b J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 56574185251671
// 00b: lxor
// 00c: lstore 8
// 00e: dup2
// 00f: ldc2_w 44644628942240
// 012: lxor
// 013: dup2
// 014: bipush 48
// 016: lushr
// 017: l2i
// 018: istore 10
// 01a: dup2
// 01b: bipush 16
// 01d: lshl
// 01e: bipush 48
// 020: lushr
// 021: l2i
// 022: istore 11
// 024: dup2
// 025: bipush 32
// 027: lshl
// 028: bipush 32
// 02a: lushr
// 02b: l2i
// 02c: istore 12
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 33318461963895
// 033: lxor
// 034: lstore 13
// 036: dup2
// 037: ldc2_w 91197576933775
// 03a: lxor
// 03b: lstore 15
// 03d: dup2
// 03e: ldc2_w 80363390787951
// 041: lxor
// 042: lstore 17
// 044: dup2
// 045: ldc2_w 48767304445111
// 048: lxor
// 049: lstore 19
// 04b: dup2
// 04c: ldc2_w 57873544239413
// 04f: lxor
// 050: dup2
// 051: bipush 48
// 053: lushr
// 054: l2i
// 055: istore 21
// 057: dup2
// 058: bipush 16
// 05a: lshl
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 22
// 061: dup2
// 062: bipush 32
// 064: lshl
// 065: bipush 32
// 067: lushr
// 068: l2i
// 069: istore 23
// 06b: pop2
// 06c: dup2
// 06d: ldc2_w 68331835178605
// 070: lxor
// 071: lstore 24
// 073: dup2
// 074: ldc2_w 15642622564407
// 077: lxor
// 078: lstore 26
// 07a: pop2
// 07b: ldc2_w 7872469682751850815
// 07e: lload 3
// 07f: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: aload 1
// 085: sipush 18492
// 088: ldc2_w 5355702216692383412
// 08b: lload 3
// 08c: lxor
// 08d: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/f7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 095: astore 28
// 097: aload 0
// 098: fload 6
// 09a: putfield su/catlean/f7.I F
// 09d: aload 0
// 09e: fload 7
// 0a0: putfield su/catlean/f7.l F
// 0a3: aload 0
// 0a4: getfield su/catlean/f7.a Lsu/catlean/fd;
// 0a7: aload 0
// 0a8: getfield su/catlean/f7.c Lsu/catlean/gf;
// 0ab: iload 21
// 0ad: i2s
// 0ae: iload 22
// 0b0: i2c
// 0b1: iload 23
// 0b3: invokevirtual su/catlean/gf.U (SCI)Z
// 0b6: ifeq 0c7
// 0b9: fconst_1
// 0ba: goto 0c8
// 0bd: ldc2_w 7911454392265611848
// 0c0: lload 3
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: fconst_0
// 0c8: lload 13
// 0ca: dup2_x1
// 0cb: pop2
// 0cc: invokevirtual su/catlean/fd.B (JF)V
// 0cf: aload 0
// 0d0: getfield su/catlean/f7.h Lsu/catlean/fd;
// 0d3: aload 0
// 0d4: getfield su/catlean/f7.I F
// 0d7: aload 0
// 0d8: getfield su/catlean/f7.N F
// 0db: fadd
// 0dc: ldc 18.0
// 0de: fsub
// 0df: fstore 29
// 0e1: aload 0
// 0e2: getfield su/catlean/f7.I F
// 0e5: aload 0
// 0e6: getfield su/catlean/f7.N F
// 0e9: fadd
// 0ea: ldc 7.0
// 0ec: fsub
// 0ed: fstore 30
// 0ef: iload 2
// 0f0: i2f
// 0f1: fstore 31
// 0f3: fload 29
// 0f5: fload 31
// 0f7: fcmpg
// 0f8: aload 28
// 0fa: lload 3
// 0fb: lconst_0
// 0fc: lcmp
// 0fd: ifle 127
// 100: ifnull 125
// 103: ifgt 14c
// 106: goto 113
// 109: ldc2_w 7911454392265611848
// 10c: lload 3
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: fload 31
// 115: fload 30
// 117: fcmpg
// 118: goto 125
// 11b: ldc2_w 7911454392265611848
// 11e: lload 3
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: aload 28
// 127: ifnull 149
// 12a: ifgt 148
// 12d: goto 13a
// 130: ldc2_w 7911454392265611848
// 133: lload 3
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: bipush 1
// 13b: goto 14d
// 13e: ldc2_w 7911454392265611848
// 141: lload 3
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: bipush 0
// 149: goto 14d
// 14c: bipush 0
// 14d: ifeq 1cf
// 150: aload 0
// 151: getfield su/catlean/f7.l F
// 154: fstore 29
// 156: aload 0
// 157: getfield su/catlean/f7.l F
// 15a: ldc 11.0
// 15c: fadd
// 15d: fstore 30
// 15f: iload 5
// 161: i2f
// 162: fstore 31
// 164: fload 29
// 166: fload 31
// 168: fcmpg
// 169: aload 28
// 16b: lload 3
// 16c: lconst_0
// 16d: lcmp
// 16e: iflt 198
// 171: ifnull 196
// 174: ifgt 1bd
// 177: goto 184
// 17a: ldc2_w 7911454392265611848
// 17d: lload 3
// 17e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: athrow
// 184: fload 31
// 186: fload 30
// 188: fcmpg
// 189: goto 196
// 18c: ldc2_w 7911454392265611848
// 18f: lload 3
// 190: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 195: athrow
// 196: aload 28
// 198: ifnull 1ba
// 19b: ifgt 1b9
// 19e: goto 1ab
// 1a1: ldc2_w 7911454392265611848
// 1a4: lload 3
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: bipush 1
// 1ac: goto 1be
// 1af: ldc2_w 7911454392265611848
// 1b2: lload 3
// 1b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b8: athrow
// 1b9: bipush 0
// 1ba: goto 1be
// 1bd: bipush 0
// 1be: ifeq 1cf
// 1c1: fconst_1
// 1c2: goto 1d0
// 1c5: ldc2_w 7911454392265611848
// 1c8: lload 3
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: fconst_0
// 1d0: lload 13
// 1d2: dup2_x1
// 1d3: pop2
// 1d4: invokevirtual su/catlean/fd.B (JF)V
// 1d7: aload 0
// 1d8: getfield su/catlean/f7.a Lsu/catlean/fd;
// 1db: invokevirtual su/catlean/fd.a ()F
// 1de: fconst_0
// 1df: fcmpg
// 1e0: aload 28
// 1e2: ifnull 1f6
// 1e5: ifne 1f9
// 1e8: goto 1f5
// 1eb: ldc2_w 7911454392265611848
// 1ee: lload 3
// 1ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f4: athrow
// 1f5: bipush 1
// 1f6: goto 1fa
// 1f9: bipush 0
// 1fa: ifne 2ad
// 1fd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 200: lload 24
// 202: aload 1
// 203: new su/catlean/o7
// 206: dup
// 207: aload 0
// 208: getfield su/catlean/f7.I F
// 20b: aload 0
// 20c: getfield su/catlean/f7.N F
// 20f: fadd
// 210: ldc 20.0
// 212: fsub
// 213: aload 0
// 214: getfield su/catlean/f7.l F
// 217: aload 0
// 218: getfield su/catlean/f7.I F
// 21b: aload 0
// 21c: getfield su/catlean/f7.N F
// 21f: fadd
// 220: ldc 20.0
// 222: fsub
// 223: aload 0
// 224: getfield su/catlean/f7.a Lsu/catlean/fd;
// 227: invokevirtual su/catlean/fd.a ()F
// 22a: sipush 18909
// 22d: ldc2_w 5214094461396487692
// 230: lload 3
// 231: lxor
// 232: invokedynamic q (IJ)I bsm=su/catlean/f7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: i2f
// 238: fmul
// 239: fadd
// 23a: aload 0
// 23b: getfield su/catlean/f7.l F
// 23e: ldc 11.0
// 240: fadd
// 241: invokespecial su/catlean/o7.<init> (FFFF)V
// 244: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 247: aload 0
// 248: getfield su/catlean/f7.G Lsu/catlean/bj;
// 24b: aload 1
// 24c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 24f: dup
// 250: sipush 17939
// 253: ldc2_w 3587686484872048798
// 256: lload 3
// 257: lxor
// 258: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/f7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 260: checkcast org/joml/Matrix3x2f
// 263: aload 0
// 264: getfield su/catlean/f7.I F
// 267: aload 0
// 268: getfield su/catlean/f7.N F
// 26b: fadd
// 26c: f2d
// 26d: ldc2_w 20.5
// 270: dsub
// 271: aload 0
// 272: getfield su/catlean/f7.l F
// 275: f2d
// 276: ldc2_w 1.5
// 279: dsub
// 27a: fconst_0
// 27b: fconst_0
// 27c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 27f: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 282: aconst_null
// 283: fconst_0
// 284: sipush 17386
// 287: ldc2_w 6371437667484271674
// 28a: lload 3
// 28b: lxor
// 28c: invokedynamic q (IJ)I bsm=su/catlean/f7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: lload 19
// 293: aconst_null
// 294: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 297: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 29a: lload 26
// 29c: aload 1
// 29d: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 2a0: goto 2ad
// 2a3: ldc2_w 7911454392265611848
// 2a6: lload 3
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: lload 15
// 2af: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 2b2: aload 1
// 2b3: aload 0
// 2b4: getfield su/catlean/f7.c Lsu/catlean/gf;
// 2b7: invokevirtual su/catlean/gf.A ()Ljava/lang/String;
// 2ba: aload 0
// 2bb: getfield su/catlean/f7.I F
// 2be: fconst_2
// 2bf: fadd
// 2c0: lload 17
// 2c2: dup2_x1
// 2c3: pop2
// 2c4: aload 0
// 2c5: getfield su/catlean/f7.l F
// 2c8: fconst_1
// 2c9: fsub
// 2ca: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2cd: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2d0: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 2d3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2d6: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 2d9: lload 8
// 2db: dup2_x1
// 2dc: pop2
// 2dd: aload 0
// 2de: getfield su/catlean/f7.a Lsu/catlean/fd;
// 2e1: invokevirtual su/catlean/fd.a ()F
// 2e4: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 2e7: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 2ea: aload 1
// 2eb: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2ee: dup
// 2ef: sipush 29615
// 2f2: ldc2_w 8146872181844641059
// 2f5: lload 3
// 2f6: lxor
// 2f7: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/f7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2fc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2ff: aload 0
// 300: getfield su/catlean/f7.I F
// 303: aload 0
// 304: getfield su/catlean/f7.N F
// 307: fadd
// 308: ldc 20.0
// 30a: fsub
// 30b: iload 10
// 30d: i2c
// 30e: swap
// 30f: aload 0
// 310: getfield su/catlean/f7.l F
// 313: ldc 11.0
// 315: ldc 11.0
// 317: ldc 3.0
// 319: ldc 2.5
// 31b: aload 0
// 31c: getfield su/catlean/f7.h Lsu/catlean/fd;
// 31f: invokevirtual su/catlean/fd.a ()F
// 322: fadd
// 323: ldc 0.15
// 325: aload 0
// 326: getfield su/catlean/f7.a Lsu/catlean/fd;
// 329: invokevirtual su/catlean/fd.a ()F
// 32c: fmul
// 32d: fconst_1
// 32e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 331: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 334: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 337: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 33a: fconst_0
// 33b: iload 11
// 33d: i2s
// 33e: fconst_0
// 33f: iload 12
// 341: fconst_0
// 342: sipush 19336
// 345: ldc2_w 7979683865912347738
// 348: lload 3
// 349: lxor
// 34a: invokedynamic q (IJ)I bsm=su/catlean/f7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34f: aconst_null
// 350: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 353: lload 3
// 354: lconst_0
// 355: lcmp
// 356: ifle 36b
// 359: aload 28
// 35b: ifnonnull 378
// 35e: bipush 5
// 35f: anewarray 65
// 362: ldc2_w 7882632654178445145
// 365: lload 3
// 366: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36b: goto 378
// 36e: ldc2_w 7911454392265611848
// 371: lload 3
// 372: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 377: athrow
// 378: return
}

public final void T(double mouseX, double mouseY, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/f7.b J
// 003: lload 5
// 005: lxor
// 006: lstore 5
// 008: lload 5
// 00a: dup2
// 00b: ldc2_w 88881818676528
// 00e: lxor
// 00f: dup2
// 010: bipush 48
// 012: lushr
// 013: l2i
// 014: istore 7
// 016: dup2
// 017: bipush 16
// 019: lshl
// 01a: bipush 48
// 01c: lushr
// 01d: l2i
// 01e: istore 8
// 020: dup2
// 021: bipush 32
// 023: lshl
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 9
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 91754290319312
// 02f: lxor
// 030: lstore 10
// 032: pop2
// 033: ldc2_w 1821078244041276730
// 036: lload 5
// 038: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: aload 0
// 03e: getfield su/catlean/f7.I F
// 041: aload 0
// 042: getfield su/catlean/f7.N F
// 045: fadd
// 046: ldc 20.0
// 048: fsub
// 049: fstore 13
// 04b: astore 12
// 04d: dload 1
// 04e: aload 0
// 04f: getfield su/catlean/f7.I F
// 052: aload 0
// 053: getfield su/catlean/f7.N F
// 056: fadd
// 057: ldc 7.0
// 059: fsub
// 05a: f2d
// 05b: dcmpg
// 05c: aload 12
// 05e: ifnull 085
// 061: ifgt 0ae
// 064: goto 072
// 067: ldc2_w 1859500312839286349
// 06a: lload 5
// 06c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: athrow
// 072: fload 13
// 074: f2d
// 075: dload 1
// 076: dcmpg
// 077: goto 085
// 07a: ldc2_w 1859500312839286349
// 07d: lload 5
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: aload 12
// 087: ifnull 0ab
// 08a: ifgt 0aa
// 08d: goto 09b
// 090: ldc2_w 1859500312839286349
// 093: lload 5
// 095: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09a: athrow
// 09b: bipush 1
// 09c: goto 0af
// 09f: ldc2_w 1859500312839286349
// 0a2: lload 5
// 0a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: athrow
// 0aa: bipush 0
// 0ab: goto 0af
// 0ae: bipush 0
// 0af: ifeq 162
// 0b2: aload 0
// 0b3: getfield su/catlean/f7.l F
// 0b6: fstore 13
// 0b8: dload 3
// 0b9: aload 0
// 0ba: getfield su/catlean/f7.l F
// 0bd: ldc 11.0
// 0bf: fadd
// 0c0: f2d
// 0c1: dcmpg
// 0c2: aload 12
// 0c4: lload 5
// 0c6: lconst_0
// 0c7: lcmp
// 0c8: ifle 0f4
// 0cb: ifnull 0f2
// 0ce: ifgt 11b
// 0d1: goto 0df
// 0d4: ldc2_w 1859500312839286349
// 0d7: lload 5
// 0d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0de: athrow
// 0df: fload 13
// 0e1: f2d
// 0e2: dload 3
// 0e3: dcmpg
// 0e4: goto 0f2
// 0e7: ldc2_w 1859500312839286349
// 0ea: lload 5
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: aload 12
// 0f4: ifnull 118
// 0f7: ifgt 117
// 0fa: goto 108
// 0fd: ldc2_w 1859500312839286349
// 100: lload 5
// 102: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 107: athrow
// 108: bipush 1
// 109: goto 11c
// 10c: ldc2_w 1859500312839286349
// 10f: lload 5
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: bipush 0
// 118: goto 11c
// 11b: bipush 0
// 11c: ifeq 162
// 11f: aload 0
// 120: getfield su/catlean/f7.c Lsu/catlean/gf;
// 123: aload 0
// 124: getfield su/catlean/f7.c Lsu/catlean/gf;
// 127: iload 7
// 129: i2s
// 12a: iload 8
// 12c: i2c
// 12d: iload 9
// 12f: invokevirtual su/catlean/gf.U (SCI)Z
// 132: aload 12
// 134: ifnull 157
// 137: goto 145
// 13a: ldc2_w 1859500312839286349
// 13d: lload 5
// 13f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 144: athrow
// 145: ifne 15a
// 148: goto 156
// 14b: ldc2_w 1859500312839286349
// 14e: lload 5
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: bipush 1
// 157: goto 15b
// 15a: bipush 0
// 15b: lload 10
// 15d: dup2_x1
// 15e: pop2
// 15f: invokevirtual su/catlean/gf.S (JZ)V
// 162: lload 5
// 164: lconst_0
// 165: lcmp
// 166: iflt 182
// 169: ldc2_w 1808193522495129478
// 16c: lload 5
// 16e: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 173: ifnull 190
// 176: ldc "urif5"
// 178: ldc2_w 1805568107989273080
// 17b: lload 5
// 17d: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: goto 190
// 185: ldc2_w 1859500312839286349
// 188: lload 5
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: return
}

public static void I(String var0) {
m = var0;
}

public static String J() {
return m;
}

static {
long var31 = b ^ 114476199065350L;
vm.a<"Å">("b5oUK", -7437489273141131202L, var31);
Cipher var22;
Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[5];
int var27 = 0;
String var26 = "ÚSü\u008f\u008a\u0007åÝ\u0089¥e\u000fhT _âÌ¬°P\n\u001cK H¯WG\u008eOÝ\u008f½Õs\u0082Õ\u0099\u009fâó\u0018Zf\u0006X&wä\u0089\u0091&\t[¤¤\u0010aÎ[\u0090ý\u0012¯U^\u001e2\u0098q\u008f Þ";
int var28 = "ÚSü\u008f\u008a\u0007åÝ\u0089¥e\u000fhT _âÌ¬°P\n\u001cK H¯WG\u008eOÝ\u008f½Õs\u0082Õ\u0099\u009fâó\u0018Zf\u0006X&wä\u0089\u0091&\t[¤¤\u0010aÎ[\u0090ý\u0012¯U^\u001e2\u0098q\u008f Þ"
.length();
char var25 = 24;
int var35 = -1;

label72:
while (true) {
String var36 = var26.substring(++var35, var35 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var36.getBytes("ISO-8859-1"));
String var50 = a(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var50;
if ((var35 += var25) >= var28) {
d = var29;
e = new String[5];
j = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[5];
int var14 = 0;
String var15 = "L/ú\rôoª¡I¤@Æø}\u009b\u0092÷±\u001aø}¬\u007fM";
int var16 = "L/ú\rôoª¡I¤@Æø}\u009b\u0092÷±\u001aø}¬\u007fM".length();
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
g = var17;
i = new Integer[5];
o = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[2];
int var3 = 0;
String var4 = "ah>\u001a\u0094\u0019«\u0080ñ\\H;\u0004¨Ê\u0002";
int var5 = "ah>\u001a\u0094\u0019«\u0080ñ\\H;\u0004¨Ê\u0002".length();
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

k = var6;
n = new Long[2];
return;
}
break;
default:
var39[var10001] = var62;
if (var13 < var16) {
continue label54;
}

var15 = "Ïp\u0081:\u0093¹D&Á.\u001cîÝ+\u008f\u0006";
var16 = "Ïp\u0081:\u0093¹D&Á.\u001cîÝ+\u008f\u0006".length();
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

var25 = var26.charAt(var35);
break;
default:
var29[var27++] = var50;
if ((var35 += var25) < var28) {
var25 = var26.charAt(var35);
continue label72;
}

var26 = "¡.\u00858\u001dÍ7Ü\u001c\u0099Õ±s\u0007\u0010g\u0010_é°\u009aâh¸àÅw\t£zËÀb";
var28 = "¡.\u00858\u001dÍ7Ü\u001c\u0099Õ±s\u0007\u0010g\u0010_é°\u009aâh¸àÅw\t£zËÀb".length();
var25 = 16;
var35 = -1;
}

var36 = var26.substring(++var35, var35 + var25);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6863;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/f7", var10);
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
e[var5] = a(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
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
throw new RuntimeException("su/catlean/f7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 11152;
if (i[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])j.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
j.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/f7", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
i[var3] = var15;
}

return i[var3];
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
throw new RuntimeException("su/catlean/f7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 12430;
if (n[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = k[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])o.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
o.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/f7", var14);
}

long var15 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
n[var3] = var15;
}

return n[var3];
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
throw new RuntimeException("su/catlean/f7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
