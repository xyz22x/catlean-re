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

public final class rm extends ru {
@NotNull
private final a1 H;
@NotNull
private final fd Y;
@NotNull
private final fd k;
@NotNull
private final bj C;
private static final long b = yz.a(4718599766369205009L, 6211608892161263409L, MethodHandles.lookup().lookupClass()).a(100633493970415L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map l;
private static final long[] m;
private static final Long[] n;
private static final Map o;

public rm(long a, @NotNull a1 setting) {
a = b ^ a;
long var4 = a ^ 125723256177537L;
long var6 = a ^ 51951361457798L;
long var8 = a ^ 7739373976045L;
Intrinsics.checkNotNullParameter(setting, a<"h">(1769, 4704114188051886849L ^ a));
super(var8, setting);
this.H = setting;
this.Y = new fd(_s.OUT_QUINT, c<"x">(26985, 1901554512218702039L ^ a), var4);
this.k = new fd(_s.OUT_QUINT, c<"x">(6004, 250137308467248843L ^ a), var4);
this.C = new bj(a<"h">(27079, 8087149860607908907L ^ a), b<"k">(30034, 4336710549051843026L ^ a), b<"k">(7377, 924365130783344720L ^ a), var6);
}

@NotNull
@Override
public a1 A() {
return this.H;
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
// 039: ldc2_w 115096991696004
// 03c: lxor
// 03d: lstore 16
// 03f: dup2
// 040: ldc2_w 24369959771588
// 043: lxor
// 044: lstore 18
// 046: dup2
// 047: ldc2_w 4763820429086
// 04a: lxor
// 04b: lstore 20
// 04d: dup2
// 04e: ldc2_w 57494645123396
// 051: lxor
// 052: lstore 22
// 054: pop2
// 055: ldc2_w 6640577628623117237
// 058: lload 4
// 05a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05f: aload 1
// 060: sipush 424
// 063: ldc2_w 4198554155615357232
// 066: lload 4
// 068: lxor
// 069: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/rm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 071: astore 24
// 073: aload 0
// 074: getfield su/catlean/rm.Y Lsu/catlean/fd;
// 077: aload 0
// 078: invokevirtual su/catlean/rm.A ()Lsu/catlean/a1;
// 07b: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 07e: checkcast java/lang/Boolean
// 081: invokevirtual java/lang/Boolean.booleanValue ()Z
// 084: ifeq 096
// 087: fconst_1
// 088: goto 097
// 08b: ldc2_w 6762112682045339278
// 08e: lload 4
// 090: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: athrow
// 096: fconst_0
// 097: lload 12
// 099: dup2_x1
// 09a: pop2
// 09b: invokevirtual su/catlean/fd.B (JF)V
// 09e: aload 0
// 09f: getfield su/catlean/rm.k Lsu/catlean/fd;
// 0a2: aload 0
// 0a3: invokevirtual su/catlean/rm.x ()F
// 0a6: aload 0
// 0a7: invokevirtual su/catlean/rm.F ()F
// 0aa: fadd
// 0ab: ldc 18.0
// 0ad: fsub
// 0ae: fstore 25
// 0b0: aload 0
// 0b1: invokevirtual su/catlean/rm.x ()F
// 0b4: aload 0
// 0b5: invokevirtual su/catlean/rm.F ()F
// 0b8: fadd
// 0b9: ldc 7.0
// 0bb: fsub
// 0bc: fstore 26
// 0be: iload 2
// 0bf: i2f
// 0c0: fstore 27
// 0c2: fload 25
// 0c4: fload 27
// 0c6: fcmpg
// 0c7: aload 24
// 0c9: lload 4
// 0cb: lconst_0
// 0cc: lcmp
// 0cd: iflt 0f9
// 0d0: ifnull 0f7
// 0d3: ifgt 120
// 0d6: goto 0e4
// 0d9: ldc2_w 6762112682045339278
// 0dc: lload 4
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: fload 27
// 0e6: fload 26
// 0e8: fcmpg
// 0e9: goto 0f7
// 0ec: ldc2_w 6762112682045339278
// 0ef: lload 4
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: aload 24
// 0f9: ifnull 11d
// 0fc: ifgt 11c
// 0ff: goto 10d
// 102: ldc2_w 6762112682045339278
// 105: lload 4
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: bipush 1
// 10e: goto 121
// 111: ldc2_w 6762112682045339278
// 114: lload 4
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: bipush 0
// 11d: goto 121
// 120: bipush 0
// 121: ifeq 1a8
// 124: aload 0
// 125: invokevirtual su/catlean/rm.R ()F
// 128: fstore 25
// 12a: aload 0
// 12b: invokevirtual su/catlean/rm.R ()F
// 12e: ldc 11.0
// 130: fadd
// 131: fstore 26
// 133: iload 3
// 134: i2f
// 135: fstore 27
// 137: fload 25
// 139: fload 27
// 13b: fcmpg
// 13c: aload 24
// 13e: lload 4
// 140: lconst_0
// 141: lcmp
// 142: iflt 16e
// 145: ifnull 16c
// 148: ifgt 195
// 14b: goto 159
// 14e: ldc2_w 6762112682045339278
// 151: lload 4
// 153: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 158: athrow
// 159: fload 27
// 15b: fload 26
// 15d: fcmpg
// 15e: goto 16c
// 161: ldc2_w 6762112682045339278
// 164: lload 4
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: aload 24
// 16e: ifnull 192
// 171: ifgt 191
// 174: goto 182
// 177: ldc2_w 6762112682045339278
// 17a: lload 4
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: bipush 1
// 183: goto 196
// 186: ldc2_w 6762112682045339278
// 189: lload 4
// 18b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: athrow
// 191: bipush 0
// 192: goto 196
// 195: bipush 0
// 196: ifeq 1a8
// 199: fconst_1
// 19a: goto 1a9
// 19d: ldc2_w 6762112682045339278
// 1a0: lload 4
// 1a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: athrow
// 1a8: fconst_0
// 1a9: lload 12
// 1ab: dup2_x1
// 1ac: pop2
// 1ad: invokevirtual su/catlean/fd.B (JF)V
// 1b0: aload 0
// 1b1: getfield su/catlean/rm.Y Lsu/catlean/fd;
// 1b4: invokevirtual su/catlean/fd.a ()F
// 1b7: fconst_0
// 1b8: fcmpg
// 1b9: aload 24
// 1bb: ifnull 1d0
// 1be: ifne 1d3
// 1c1: goto 1cf
// 1c4: ldc2_w 6762112682045339278
// 1c7: lload 4
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: bipush 1
// 1d0: goto 1d4
// 1d3: bipush 0
// 1d4: lload 4
// 1d6: lconst_0
// 1d7: lcmp
// 1d8: ifle 36a
// 1db: ifne 292
// 1de: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1e1: lload 20
// 1e3: aload 1
// 1e4: new su/catlean/o7
// 1e7: dup
// 1e8: aload 0
// 1e9: invokevirtual su/catlean/rm.x ()F
// 1ec: aload 0
// 1ed: invokevirtual su/catlean/rm.F ()F
// 1f0: fadd
// 1f1: ldc 18.0
// 1f3: fsub
// 1f4: aload 0
// 1f5: invokevirtual su/catlean/rm.R ()F
// 1f8: aload 0
// 1f9: invokevirtual su/catlean/rm.x ()F
// 1fc: aload 0
// 1fd: invokevirtual su/catlean/rm.F ()F
// 200: fadd
// 201: ldc 18.0
// 203: fsub
// 204: aload 0
// 205: getfield su/catlean/rm.Y Lsu/catlean/fd;
// 208: invokevirtual su/catlean/fd.a ()F
// 20b: sipush 4726
// 20e: ldc2_w 9128992751869459328
// 211: lload 4
// 213: lxor
// 214: invokedynamic k (IJ)I bsm=su/catlean/rm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: i2f
// 21a: fmul
// 21b: fadd
// 21c: aload 0
// 21d: invokevirtual su/catlean/rm.R ()F
// 220: ldc 11.0
// 222: fadd
// 223: invokespecial su/catlean/o7.<init> (FFFF)V
// 226: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 229: aload 0
// 22a: getfield su/catlean/rm.C Lsu/catlean/bj;
// 22d: aload 1
// 22e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 231: dup
// 232: sipush 11876
// 235: ldc2_w 2711472246719227646
// 238: lload 4
// 23a: lxor
// 23b: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/rm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 240: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 243: checkcast org/joml/Matrix3x2f
// 246: aload 0
// 247: invokevirtual su/catlean/rm.x ()F
// 24a: aload 0
// 24b: invokevirtual su/catlean/rm.F ()F
// 24e: fadd
// 24f: f2d
// 250: ldc2_w 18.5
// 253: dsub
// 254: aload 0
// 255: invokevirtual su/catlean/rm.R ()F
// 258: f2d
// 259: ldc2_w 1.5
// 25c: dsub
// 25d: fconst_0
// 25e: fconst_0
// 25f: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 262: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 265: aconst_null
// 266: fconst_0
// 267: sipush 9864
// 26a: ldc2_w 6622874835273469817
// 26d: lload 4
// 26f: lxor
// 270: invokedynamic k (IJ)I bsm=su/catlean/rm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 275: lload 18
// 277: aconst_null
// 278: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 27b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 27e: lload 22
// 280: aload 1
// 281: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// 284: goto 292
// 287: ldc2_w 6762112682045339278
// 28a: lload 4
// 28c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: athrow
// 292: lload 14
// 294: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 297: aload 1
// 298: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 29b: dup
// 29c: sipush 1233
// 29f: ldc2_w 3455358286728203338
// 2a2: lload 4
// 2a4: lxor
// 2a5: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/rm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2aa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2ad: aload 0
// 2ae: invokevirtual su/catlean/rm.A ()Lsu/catlean/a1;
// 2b1: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 2b4: aload 0
// 2b5: invokevirtual su/catlean/rm.x ()F
// 2b8: aload 0
// 2b9: invokevirtual su/catlean/rm.R ()F
// 2bc: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2bf: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 2c2: lload 16
// 2c4: dup2_x1
// 2c5: pop2
// 2c6: bipush 0
// 2c7: bipush 0
// 2c8: sipush 12786
// 2cb: ldc2_w 5621383835896305665
// 2ce: lload 4
// 2d0: lxor
// 2d1: invokedynamic k (IJ)I bsm=su/catlean/rm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d6: aconst_null
// 2d7: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 2da: aload 1
// 2db: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2de: dup
// 2df: sipush 1233
// 2e2: ldc2_w 3455358286728203338
// 2e5: lload 4
// 2e7: lxor
// 2e8: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/rm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2f0: aload 0
// 2f1: invokevirtual su/catlean/rm.x ()F
// 2f4: aload 0
// 2f5: invokevirtual su/catlean/rm.F ()F
// 2f8: fadd
// 2f9: ldc 18.0
// 2fb: fsub
// 2fc: iload 9
// 2fe: i2c
// 2ff: swap
// 300: aload 0
// 301: invokevirtual su/catlean/rm.R ()F
// 304: ldc 11.0
// 306: ldc 11.0
// 308: ldc 3.0
// 30a: ldc 2.5
// 30c: aload 0
// 30d: getfield su/catlean/rm.k Lsu/catlean/fd;
// 310: invokevirtual su/catlean/fd.a ()F
// 313: fadd
// 314: ldc 0.15
// 316: aload 0
// 317: getfield su/catlean/rm.Y Lsu/catlean/fd;
// 31a: invokevirtual su/catlean/fd.a ()F
// 31d: fmul
// 31e: fconst_1
// 31f: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 322: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 325: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 328: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 32b: fconst_0
// 32c: iload 10
// 32e: i2s
// 32f: fconst_0
// 330: iload 11
// 332: fconst_0
// 333: sipush 13852
// 336: ldc2_w 5521713074306965486
// 339: lload 4
// 33b: lxor
// 33c: invokedynamic k (IJ)I bsm=su/catlean/rm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 341: aconst_null
// 342: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 345: aload 0
// 346: invokevirtual su/catlean/rm.x ()F
// 349: aload 0
// 34a: invokevirtual su/catlean/rm.F ()F
// 34d: fadd
// 34e: ldc 18.0
// 350: fsub
// 351: fstore 25
// 353: aload 0
// 354: invokevirtual su/catlean/rm.x ()F
// 357: aload 0
// 358: invokevirtual su/catlean/rm.F ()F
// 35b: fadd
// 35c: ldc 7.0
// 35e: fsub
// 35f: fstore 26
// 361: iload 2
// 362: i2f
// 363: fstore 27
// 365: fload 25
// 367: fload 27
// 369: fcmpg
// 36a: aload 24
// 36c: lload 4
// 36e: lconst_0
// 36f: lcmp
// 370: iflt 39c
// 373: ifnull 39a
// 376: ifgt 3c3
// 379: goto 387
// 37c: ldc2_w 6762112682045339278
// 37f: lload 4
// 381: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 386: athrow
// 387: fload 27
// 389: fload 26
// 38b: fcmpg
// 38c: goto 39a
// 38f: ldc2_w 6762112682045339278
// 392: lload 4
// 394: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 399: athrow
// 39a: aload 24
// 39c: ifnull 3c0
// 39f: ifgt 3bf
// 3a2: goto 3b0
// 3a5: ldc2_w 6762112682045339278
// 3a8: lload 4
// 3aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3af: athrow
// 3b0: bipush 1
// 3b1: goto 3c4
// 3b4: ldc2_w 6762112682045339278
// 3b7: lload 4
// 3b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3be: athrow
// 3bf: bipush 0
// 3c0: goto 3c4
// 3c3: bipush 0
// 3c4: ifeq 499
// 3c7: aload 0
// 3c8: invokevirtual su/catlean/rm.R ()F
// 3cb: fstore 25
// 3cd: aload 0
// 3ce: invokevirtual su/catlean/rm.R ()F
// 3d1: ldc 11.0
// 3d3: fadd
// 3d4: fstore 26
// 3d6: iload 3
// 3d7: i2f
// 3d8: fstore 27
// 3da: fload 25
// 3dc: fload 27
// 3de: fcmpg
// 3df: aload 24
// 3e1: lload 4
// 3e3: lconst_0
// 3e4: lcmp
// 3e5: iflt 411
// 3e8: ifnull 40f
// 3eb: ifgt 438
// 3ee: goto 3fc
// 3f1: ldc2_w 6762112682045339278
// 3f4: lload 4
// 3f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fb: athrow
// 3fc: fload 27
// 3fe: fload 26
// 400: fcmpg
// 401: goto 40f
// 404: ldc2_w 6762112682045339278
// 407: lload 4
// 409: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40e: athrow
// 40f: aload 24
// 411: ifnull 435
// 414: ifgt 434
// 417: goto 425
// 41a: ldc2_w 6762112682045339278
// 41d: lload 4
// 41f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 424: athrow
// 425: bipush 1
// 426: goto 439
// 429: ldc2_w 6762112682045339278
// 42c: lload 4
// 42e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 433: athrow
// 434: bipush 0
// 435: goto 439
// 438: bipush 0
// 439: lload 4
// 43b: lconst_0
// 43c: lcmp
// 43d: iflt 446
// 440: ifeq 499
// 443: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 446: sipush 14408
// 449: ldc2_w 4966302128628158904
// 44c: lload 4
// 44e: lxor
// 44f: invokedynamic k (IJ)I bsm=su/catlean/rm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 454: if_icmpeq 499
// 457: goto 465
// 45a: ldc2_w 6762112682045339278
// 45d: lload 4
// 45f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 464: athrow
// 465: lload 7
// 467: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 46a: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 46d: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 470: sipush 15637
// 473: ldc2_w 6168127775171106018
// 476: lload 4
// 478: lxor
// 479: invokedynamic k (IJ)I bsm=su/catlean/rm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47e: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 481: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 484: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 487: bipush 0
// 488: invokevirtual su/catlean/fi.A (Z)V
// 48b: goto 499
// 48e: ldc2_w 6762112682045339278
// 491: lload 4
// 493: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 498: athrow
// 499: return
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
// 000: ldc2_w 8591482653260427430
// 003: lload 1
// 004: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 009: aload 0
// 00a: invokevirtual su/catlean/rm.x ()F
// 00d: aload 0
// 00e: invokevirtual su/catlean/rm.F ()F
// 011: fadd
// 012: ldc 18.0
// 014: fsub
// 015: fstore 9
// 017: astore 8
// 019: dload 3
// 01a: aload 0
// 01b: invokevirtual su/catlean/rm.x ()F
// 01e: aload 0
// 01f: invokevirtual su/catlean/rm.F ()F
// 022: fadd
// 023: ldc 7.0
// 025: fsub
// 026: f2d
// 027: dcmpg
// 028: aload 8
// 02a: lload 1
// 02b: lconst_0
// 02c: lcmp
// 02d: iflt 057
// 030: ifnull 055
// 033: ifgt 07c
// 036: goto 043
// 039: ldc2_w 8558203200216358301
// 03c: lload 1
// 03d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 042: athrow
// 043: fload 9
// 045: f2d
// 046: dload 3
// 047: dcmpg
// 048: goto 055
// 04b: ldc2_w 8558203200216358301
// 04e: lload 1
// 04f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: athrow
// 055: aload 8
// 057: ifnull 079
// 05a: ifgt 078
// 05d: goto 06a
// 060: ldc2_w 8558203200216358301
// 063: lload 1
// 064: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: athrow
// 06a: bipush 1
// 06b: goto 07d
// 06e: ldc2_w 8558203200216358301
// 071: lload 1
// 072: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: athrow
// 078: bipush 0
// 079: goto 07d
// 07c: bipush 0
// 07d: ifeq 128
// 080: aload 0
// 081: invokevirtual su/catlean/rm.R ()F
// 084: fstore 9
// 086: dload 5
// 088: aload 0
// 089: invokevirtual su/catlean/rm.R ()F
// 08c: ldc 11.0
// 08e: fadd
// 08f: f2d
// 090: dcmpg
// 091: aload 8
// 093: lload 1
// 094: lconst_0
// 095: lcmp
// 096: ifle 0c1
// 099: ifnull 0bf
// 09c: ifgt 0e6
// 09f: goto 0ac
// 0a2: ldc2_w 8558203200216358301
// 0a5: lload 1
// 0a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: athrow
// 0ac: fload 9
// 0ae: f2d
// 0af: dload 5
// 0b1: dcmpg
// 0b2: goto 0bf
// 0b5: ldc2_w 8558203200216358301
// 0b8: lload 1
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: aload 8
// 0c1: ifnull 0e3
// 0c4: ifgt 0e2
// 0c7: goto 0d4
// 0ca: ldc2_w 8558203200216358301
// 0cd: lload 1
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: bipush 1
// 0d5: goto 0e7
// 0d8: ldc2_w 8558203200216358301
// 0db: lload 1
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: bipush 0
// 0e3: goto 0e7
// 0e6: bipush 0
// 0e7: ifeq 128
// 0ea: aload 0
// 0eb: invokevirtual su/catlean/rm.A ()Lsu/catlean/a1;
// 0ee: aload 0
// 0ef: invokevirtual su/catlean/rm.A ()Lsu/catlean/a1;
// 0f2: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0f5: checkcast java/lang/Boolean
// 0f8: invokevirtual java/lang/Boolean.booleanValue ()Z
// 0fb: aload 8
// 0fd: ifnull 11e
// 100: goto 10d
// 103: ldc2_w 8558203200216358301
// 106: lload 1
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: ifne 121
// 110: goto 11d
// 113: ldc2_w 8558203200216358301
// 116: lload 1
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: bipush 1
// 11e: goto 122
// 121: bipush 0
// 122: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 125: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 128: return
}

@Override
public void U(double mouseX, double mouseY, int button) {
}

@Override
public void V(int key, short a, int a, char a) {
}

@Override
public void T(char char, long a) {
}

@Override
public boolean S(byte a, double mouseX, double mouseY, double verticalAmount, long a) {
return false;
}

@Override
public void L() {
}

static {
long var22 = b ^ 140680704305202L;
Cipher var24;
Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var25 = 1; var25 < 8; var25++) {
var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var31 = new String[5];
int var29 = 0;
String var28 = ";D3æfK7oïØðw\u0000ú^\u0085\u0010á6\u0093)|\u009f[_\u0083O;[&èVÖ v\u0091¨KÛ\u0000Õ\u0007\u000e\u0002È\u0005õ\u0013\u001aç\u0003Ý\u00876#F\rw#\u001bPX\u0092\u00120b";
int var30 = ";D3æfK7oïØðw\u0000ú^\u0085\u0010á6\u0093)|\u009f[_\u0083O;[&èVÖ v\u0091¨KÛ\u0000Õ\u0007\u000e\u0002È\u0005õ\u0013\u001aç\u0003Ý\u00876#F\rw#\u001bPX\u0092\u00120b"
.length();
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
e = new String[5];
l = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[8];
int var14 = 0;
String var15 = "^:~ò\u0093\u0098@:\u008dÆS\u00adøó7Kmn\\£\u0010ÁoÎ:\u009fM\u009a^kå51RÞÑ\u000b¼ <\u0092ÏµXuøî\u0007";
int var16 = "^:~ò\u0093\u0098@:\u008dÆS\u00adøó7Kmn\\£\u0010ÁoÎ:\u009fM\u009a^kå51RÞÑ\u000b¼ <\u0092ÏµXuøî\u0007".length();
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
h = new Integer[8];
o = new HashMap(13);
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
String var4 = "{!ÃÃ¬\u0094\u0003l3°èêß\u0014!;";
int var5 = "{!ÃÃ¬\u0094\u0003l3°èêß\u0014!;".length();
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

m = var6;
n = new Long[2];
return;
}
break;
default:
var39[var10001] = var62;
if (var13 < var16) {
continue label54;
}

var15 = "£áRAô\u008c\u00ad²:rò_Ï Ð?";
var16 = "£áRAô\u008c\u00ad²:rò_Ï Ð?".length();
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

var28 = "Ù\u0093\u0084\u0082£·Þvðl1\u0085=\u0080XPd,/&\u001dFì©\u0001~\u0012z°\u0018Ë¸\u0010ÅyÞ\u0003!¤Â\u001bI®Ô°R\u0084¤?";
var30 = "Ù\u0093\u0084\u0082£·Þvðl1\u0085=\u0080XPd,/&\u001dFì©\u0001~\u0012z°\u0018Ë¸\u0010ÅyÞ\u0003!¤Â\u001bI®Ô°R\u0084¤?".length();
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21929;
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
throw new RuntimeException("su/catlean/rm", var10);
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
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
throw new RuntimeException("su/catlean/rm" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13509;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/rm", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/rm" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 18938;
if (n[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = m[var3];
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
throw new RuntimeException("su/catlean/rm", var14);
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
throw new RuntimeException("su/catlean/rm" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
