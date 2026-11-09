package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.text.StringsKt;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class wv {
@NotNull
public static final wv j;
private static float i;
private static float x;
private static float U;
private static float Z;
@Nullable
private static o_ v;
@Nullable
private static o_ T;
@NotNull
private static List Q;
private static float p;
@NotNull
private static String A;
private static boolean y;
private static boolean w;
@NotNull
private static final fd E;
@NotNull
private static final fd k;
@NotNull
private static final fd l;
@NotNull
private static final bj m;
@NotNull
private static final bj B;
private static _g[] X;
private static final long a = yz.a(1428862826641159312L, -8649840468328195377L, MethodHandles.lookup().lookupClass()).a(205450255537806L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long[] h;
private static final Long[] n;
private static final Map o;

private wv() {
}

public final float T() {
return i;
}

public final void A(float <set-?>) {
i = <set-?>;
}

public final float v() {
return x;
}

public final void w(float <set-?>) {
x = <set-?>;
}

@NotNull
public final bj r() {
return B;
}

public final void Q(@NotNull class_332 context, int mouseX, long a, int mouseY) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wv.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 8464880740701
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 15994752198176
// 012: lxor
// 013: lstore 8
// 015: dup2
// 016: ldc2_w 14800330375967
// 019: lxor
// 01a: lstore 10
// 01c: dup2
// 01d: ldc2_w 42225954841767
// 020: lxor
// 021: dup2
// 022: bipush 8
// 024: lushr
// 025: lstore 12
// 027: dup2
// 028: bipush 56
// 02a: lshl
// 02b: bipush 56
// 02d: lushr
// 02e: l2i
// 02f: istore 14
// 031: pop2
// 032: dup2
// 033: ldc2_w 7206546872994
// 036: lxor
// 037: dup2
// 038: bipush 32
// 03a: lushr
// 03b: l2i
// 03c: istore 15
// 03e: dup2
// 03f: bipush 32
// 041: lshl
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 16
// 048: dup2
// 049: bipush 48
// 04b: lshl
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 17
// 052: pop2
// 053: dup2
// 054: ldc2_w 98778104166712
// 057: lxor
// 058: lstore 18
// 05a: dup2
// 05b: ldc2_w 113387371868721
// 05e: lxor
// 05f: lstore 20
// 061: dup2
// 062: ldc2_w 33221056370286
// 065: lxor
// 066: dup2
// 067: bipush 48
// 069: lushr
// 06a: l2i
// 06b: istore 22
// 06d: dup2
// 06e: bipush 16
// 070: lshl
// 071: bipush 32
// 073: lushr
// 074: l2i
// 075: istore 23
// 077: dup2
// 078: bipush 48
// 07a: lshl
// 07b: bipush 48
// 07d: lushr
// 07e: l2i
// 07f: istore 24
// 081: pop2
// 082: dup2
// 083: ldc2_w 39263158942464
// 086: lxor
// 087: lstore 25
// 089: dup2
// 08a: ldc2_w 72519171026239
// 08d: lxor
// 08e: lstore 27
// 090: dup2
// 091: ldc2_w 139766369399945
// 094: lxor
// 095: lstore 29
// 097: dup2
// 098: ldc2_w 61964527916535
// 09b: lxor
// 09c: dup2
// 09d: bipush 48
// 09f: lushr
// 0a0: l2i
// 0a1: istore 31
// 0a3: dup2
// 0a4: bipush 16
// 0a6: lshl
// 0a7: bipush 48
// 0a9: lushr
// 0aa: l2i
// 0ab: istore 32
// 0ad: dup2
// 0ae: bipush 32
// 0b0: lshl
// 0b1: bipush 32
// 0b3: lushr
// 0b4: l2i
// 0b5: istore 33
// 0b7: pop2
// 0b8: dup2
// 0b9: ldc2_w 61063454008826
// 0bc: lxor
// 0bd: lstore 34
// 0bf: dup2
// 0c0: ldc2_w 129150931853144
// 0c3: lxor
// 0c4: lstore 36
// 0c6: dup2
// 0c7: ldc2_w 72774089337304
// 0ca: lxor
// 0cb: lstore 38
// 0cd: dup2
// 0ce: ldc2_w 66636875347168
// 0d1: lxor
// 0d2: lstore 40
// 0d4: dup2
// 0d5: ldc2_w 78561485829506
// 0d8: lxor
// 0d9: lstore 42
// 0db: dup2
// 0dc: ldc2_w 51557329544762
// 0df: lxor
// 0e0: lstore 44
// 0e2: dup2
// 0e3: ldc2_w 34065707499616
// 0e6: lxor
// 0e7: lstore 46
// 0e9: dup2
// 0ea: ldc2_w 89732556483040
// 0ed: lxor
// 0ee: lstore 48
// 0f0: pop2
// 0f1: ldc2_w 8442573117658011206
// 0f4: lload 3
// 0f5: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: aload 1
// 0fb: sipush 6671
// 0fe: ldc2_w 151446841989326317
// 101: lload 3
// 102: lxor
// 103: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 10b: astore 65
// 10d: getstatic su/catlean/wv.l Lsu/catlean/fd;
// 110: getstatic su/catlean/wv.y Z
// 113: ifeq 124
// 116: fconst_1
// 117: goto 125
// 11a: ldc2_w 8495688591926523508
// 11d: lload 3
// 11e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 123: athrow
// 124: fconst_0
// 125: lload 8
// 127: dup2_x1
// 128: pop2
// 129: invokevirtual su/catlean/fd.B (JF)V
// 12c: getstatic su/catlean/wv.k Lsu/catlean/fd;
// 12f: getstatic su/catlean/wv.U F
// 132: getstatic su/catlean/wv.i F
// 135: fadd
// 136: ldc 21.0
// 138: fsub
// 139: fstore 66
// 13b: getstatic su/catlean/wv.U F
// 13e: getstatic su/catlean/wv.i F
// 141: fadd
// 142: ldc 7.0
// 144: fsub
// 145: fstore 67
// 147: iload 2
// 148: i2f
// 149: fstore 68
// 14b: fload 66
// 14d: fload 68
// 14f: fcmpg
// 150: aload 65
// 152: lload 3
// 153: lconst_0
// 154: lcmp
// 155: iflt 17f
// 158: ifnull 17d
// 15b: ifgt 1a4
// 15e: goto 16b
// 161: ldc2_w 8495688591926523508
// 164: lload 3
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: fload 68
// 16d: fload 67
// 16f: fcmpg
// 170: goto 17d
// 173: ldc2_w 8495688591926523508
// 176: lload 3
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: aload 65
// 17f: ifnull 1a1
// 182: ifgt 1a0
// 185: goto 192
// 188: ldc2_w 8495688591926523508
// 18b: lload 3
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: bipush 1
// 193: goto 1a5
// 196: ldc2_w 8495688591926523508
// 199: lload 3
// 19a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19f: athrow
// 1a0: bipush 0
// 1a1: goto 1a5
// 1a4: bipush 0
// 1a5: ifeq 254
// 1a8: getstatic su/catlean/wv.Z F
// 1ab: ldc 31.0
// 1ad: fadd
// 1ae: fstore 66
// 1b0: getstatic su/catlean/wv.Z F
// 1b3: ldc 45.0
// 1b5: fadd
// 1b6: fstore 67
// 1b8: iload 5
// 1ba: i2f
// 1bb: fstore 68
// 1bd: fload 66
// 1bf: fload 68
// 1c1: fcmpg
// 1c2: aload 65
// 1c4: lload 3
// 1c5: lconst_0
// 1c6: lcmp
// 1c7: ifle 1f1
// 1ca: ifnull 1ef
// 1cd: ifgt 216
// 1d0: goto 1dd
// 1d3: ldc2_w 8495688591926523508
// 1d6: lload 3
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: fload 68
// 1df: fload 67
// 1e1: fcmpg
// 1e2: goto 1ef
// 1e5: ldc2_w 8495688591926523508
// 1e8: lload 3
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: aload 65
// 1f1: ifnull 213
// 1f4: ifgt 212
// 1f7: goto 204
// 1fa: ldc2_w 8495688591926523508
// 1fd: lload 3
// 1fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 203: athrow
// 204: bipush 1
// 205: goto 217
// 208: ldc2_w 8495688591926523508
// 20b: lload 3
// 20c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: athrow
// 212: bipush 0
// 213: goto 217
// 216: bipush 0
// 217: lload 3
// 218: lconst_0
// 219: lcmp
// 21a: iflt 223
// 21d: ifeq 254
// 220: getstatic su/catlean/wv.y Z
// 223: ifeq 254
// 226: goto 233
// 229: ldc2_w 8495688591926523508
// 22c: lload 3
// 22d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 232: athrow
// 233: getstatic su/catlean/wv.T Lsu/catlean/o_;
// 236: ifnonnull 254
// 239: goto 246
// 23c: ldc2_w 8495688591926523508
// 23f: lload 3
// 240: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 245: athrow
// 246: fconst_1
// 247: goto 255
// 24a: ldc2_w 8495688591926523508
// 24d: lload 3
// 24e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: athrow
// 254: fconst_0
// 255: lload 8
// 257: dup2_x1
// 258: pop2
// 259: invokevirtual su/catlean/fd.B (JF)V
// 25c: aload 1
// 25d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 260: dup
// 261: sipush 7649
// 264: ldc2_w 751774297664610816
// 267: lload 3
// 268: lxor
// 269: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 271: iload 31
// 273: i2c
// 274: getstatic su/catlean/wv.U F
// 277: getstatic su/catlean/wv.Z F
// 27a: getstatic su/catlean/wv.i F
// 27d: getstatic su/catlean/wv.x F
// 280: ldc 5.0
// 282: fconst_0
// 283: fconst_0
// 284: fconst_1
// 285: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 288: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 28b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 28e: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 291: fconst_0
// 292: iload 32
// 294: i2s
// 295: fconst_0
// 296: iload 33
// 298: fconst_0
// 299: sipush 17038
// 29c: ldc2_w 5254586093289728108
// 29f: lload 3
// 2a0: lxor
// 2a1: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a6: aconst_null
// 2a7: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 2aa: aload 1
// 2ab: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2ae: dup
// 2af: sipush 6302
// 2b2: ldc2_w 4309843667234908024
// 2b5: lload 3
// 2b6: lxor
// 2b7: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2bf: getstatic su/catlean/wv.U F
// 2c2: ldc 5.0
// 2c4: fadd
// 2c5: getstatic su/catlean/wv.Z F
// 2c8: ldc 6.0
// 2ca: fadd
// 2cb: ldc 15.0
// 2cd: ldc 15.0
// 2cf: ldc 3.0
// 2d1: fconst_1
// 2d2: fconst_0
// 2d3: fconst_1
// 2d4: getstatic su/catlean/wv.U F
// 2d7: ldc 5.0
// 2d9: fadd
// 2da: fstore 67
// 2dc: getstatic su/catlean/wv.U F
// 2df: ldc 20.0
// 2e1: fadd
// 2e2: fstore 68
// 2e4: iload 2
// 2e5: i2f
// 2e6: fstore 69
// 2e8: fload 67
// 2ea: fload 69
// 2ec: fcmpg
// 2ed: aload 65
// 2ef: lload 3
// 2f0: lconst_0
// 2f1: lcmp
// 2f2: iflt 31c
// 2f5: ifnull 31a
// 2f8: ifgt 341
// 2fb: goto 308
// 2fe: ldc2_w 8495688591926523508
// 301: lload 3
// 302: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 307: athrow
// 308: fload 69
// 30a: fload 68
// 30c: fcmpg
// 30d: goto 31a
// 310: ldc2_w 8495688591926523508
// 313: lload 3
// 314: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 319: athrow
// 31a: aload 65
// 31c: ifnull 33e
// 31f: ifgt 33d
// 322: goto 32f
// 325: ldc2_w 8495688591926523508
// 328: lload 3
// 329: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32e: athrow
// 32f: bipush 1
// 330: goto 342
// 333: ldc2_w 8495688591926523508
// 336: lload 3
// 337: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33c: athrow
// 33d: bipush 0
// 33e: goto 342
// 341: bipush 0
// 342: ifeq 3d9
// 345: getstatic su/catlean/wv.Z F
// 348: ldc 6.0
// 34a: fadd
// 34b: fstore 67
// 34d: getstatic su/catlean/wv.Z F
// 350: ldc 21.0
// 352: fadd
// 353: fstore 68
// 355: iload 5
// 357: i2f
// 358: fstore 69
// 35a: fload 67
// 35c: fload 69
// 35e: fcmpg
// 35f: aload 65
// 361: lload 3
// 362: lconst_0
// 363: lcmp
// 364: iflt 38e
// 367: ifnull 38c
// 36a: ifgt 3b3
// 36d: goto 37a
// 370: ldc2_w 8495688591926523508
// 373: lload 3
// 374: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 379: athrow
// 37a: fload 69
// 37c: fload 68
// 37e: fcmpg
// 37f: goto 38c
// 382: ldc2_w 8495688591926523508
// 385: lload 3
// 386: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38b: athrow
// 38c: aload 65
// 38e: ifnull 3b0
// 391: ifgt 3af
// 394: goto 3a1
// 397: ldc2_w 8495688591926523508
// 39a: lload 3
// 39b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a0: athrow
// 3a1: bipush 1
// 3a2: goto 3b4
// 3a5: ldc2_w 8495688591926523508
// 3a8: lload 3
// 3a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ae: athrow
// 3af: bipush 0
// 3b0: goto 3b4
// 3b3: bipush 0
// 3b4: ifeq 3d9
// 3b7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3ba: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 3bd: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 3c0: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 3c3: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 3c6: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 3c9: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 3cc: goto 3e2
// 3cf: ldc2_w 8495688591926523508
// 3d2: lload 3
// 3d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d8: athrow
// 3d9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3dc: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 3df: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 3e2: astore 66
// 3e4: aload 66
// 3e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 3e9: aload 66
// 3eb: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3ee: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 3f1: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 3f4: dup
// 3f5: sipush 7475
// 3f8: ldc2_w 6874772394151797471
// 3fb: lload 3
// 3fc: lxor
// 3fd: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 402: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 405: fconst_0
// 406: fconst_0
// 407: fconst_0
// 408: sipush 17156
// 40b: ldc2_w 1476984990620215787
// 40e: lload 3
// 40f: lxor
// 410: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 415: aconst_null
// 416: astore 50
// 418: istore 51
// 41a: fstore 52
// 41c: fstore 53
// 41e: fstore 54
// 420: astore 55
// 422: astore 56
// 424: fstore 57
// 426: fstore 58
// 428: fstore 59
// 42a: fstore 60
// 42c: fstore 61
// 42e: fstore 62
// 430: fstore 63
// 432: fstore 64
// 434: iload 31
// 436: i2c
// 437: fload 64
// 439: fload 63
// 43b: fload 62
// 43d: fload 61
// 43f: fload 60
// 441: fload 59
// 443: fload 58
// 445: fload 57
// 447: aload 56
// 449: aload 55
// 44b: fload 54
// 44d: iload 32
// 44f: i2s
// 450: fload 53
// 452: iload 33
// 454: fload 52
// 456: iload 51
// 458: aload 50
// 45a: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 45d: getstatic su/catlean/wv.m Lsu/catlean/bj;
// 460: aload 1
// 461: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 464: dup
// 465: sipush 6302
// 468: ldc2_w 4309843667234908024
// 46b: lload 3
// 46c: lxor
// 46d: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 472: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 475: checkcast org/joml/Matrix3x2f
// 478: getstatic su/catlean/wv.U F
// 47b: f2d
// 47c: ldc2_w 7.5
// 47f: dadd
// 480: getstatic su/catlean/wv.Z F
// 483: f2d
// 484: ldc2_w 7.5
// 487: dadd
// 488: fconst_0
// 489: fconst_0
// 48a: aconst_null
// 48b: aconst_null
// 48c: fconst_0
// 48d: sipush 9087
// 490: ldc2_w 2166643464138590610
// 493: lload 3
// 494: lxor
// 495: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49a: lload 40
// 49c: aconst_null
// 49d: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 4a0: lload 34
// 4a2: invokestatic su/catlean/b8.v (J)Lsu/catlean/c6;
// 4a5: lload 10
// 4a7: aload 1
// 4a8: sipush 12731
// 4ab: ldc2_w 7420309458493460060
// 4ae: lload 3
// 4af: lxor
// 4b0: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b5: getstatic su/catlean/wv.U F
// 4b8: getstatic su/catlean/wv.i F
// 4bb: fconst_2
// 4bc: fdiv
// 4bd: fadd
// 4be: getstatic su/catlean/wv.Z F
// 4c1: bipush 5
// 4c2: i2f
// 4c3: fadd
// 4c4: sipush 7584
// 4c7: ldc2_w 3532760134048462665
// 4ca: lload 3
// 4cb: lxor
// 4cc: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d1: invokevirtual su/catlean/c6.g (JLnet/minecraft/class_332;Ljava/lang/String;FFI)V
// 4d4: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 4d7: aload 1
// 4d8: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4db: dup
// 4dc: sipush 6302
// 4df: ldc2_w 4309843667234908024
// 4e2: lload 3
// 4e3: lxor
// 4e4: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4ec: getstatic su/catlean/wv.U F
// 4ef: sipush 14009
// 4f2: ldc2_w 8986847507445783642
// 4f5: lload 3
// 4f6: lxor
// 4f7: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fc: i2f
// 4fd: fadd
// 4fe: getstatic su/catlean/wv.Z F
// 501: sipush 26229
// 504: ldc2_w 1617250703961672850
// 507: lload 3
// 508: lxor
// 509: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50e: i2f
// 50f: fadd
// 510: getstatic su/catlean/wv.i F
// 513: sipush 29466
// 516: ldc2_w 2153190026047642097
// 519: lload 3
// 51a: lxor
// 51b: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 520: i2f
// 521: fsub
// 522: ldc 0.5
// 524: bipush 1
// 525: anewarray 96
// 528: astore 66
// 52a: aload 66
// 52c: bipush 0
// 52d: new java/awt/Color
// 530: dup
// 531: sipush 2147
// 534: ldc2_w 4299418987673035395
// 537: lload 3
// 538: lxor
// 539: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53e: bipush 1
// 53f: invokespecial java/awt/Color.<init> (IZ)V
// 542: aastore
// 543: aload 66
// 545: lload 48
// 547: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 54a: aconst_null
// 54b: putstatic su/catlean/wv.v Lsu/catlean/o_;
// 54e: aload 65
// 550: ifnull c4a
// 553: getstatic su/catlean/wv.T Lsu/catlean/o_;
// 556: ifnonnull ad8
// 559: goto 566
// 55c: ldc2_w 8495688591926523508
// 55f: lload 3
// 560: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 565: athrow
// 566: aload 1
// 567: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 56a: dup
// 56b: sipush 6302
// 56e: ldc2_w 4309843667234908024
// 571: lload 3
// 572: lxor
// 573: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 578: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 57b: getstatic su/catlean/wv.U F
// 57e: ldc 4.0
// 580: fadd
// 581: iload 31
// 583: i2c
// 584: swap
// 585: getstatic su/catlean/wv.Z F
// 588: ldc 28.0
// 58a: fadd
// 58b: getstatic su/catlean/wv.i F
// 58e: ldc 8.0
// 590: fsub
// 591: ldc 20.0
// 593: ldc 4.0
// 595: fconst_0
// 596: ldc 0.1
// 598: fconst_1
// 599: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 59c: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 59f: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 5a2: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 5a5: fconst_0
// 5a6: iload 32
// 5a8: i2s
// 5a9: fconst_0
// 5aa: iload 33
// 5ac: fconst_0
// 5ad: sipush 17156
// 5b0: ldc2_w 1476984990620215787
// 5b3: lload 3
// 5b4: lxor
// 5b5: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ba: aconst_null
// 5bb: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 5be: aload 1
// 5bf: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 5c2: dup
// 5c3: sipush 6302
// 5c6: ldc2_w 4309843667234908024
// 5c9: lload 3
// 5ca: lxor
// 5cb: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5d3: getstatic su/catlean/wv.U F
// 5d6: getstatic su/catlean/wv.i F
// 5d9: fadd
// 5da: ldc 21.0
// 5dc: fsub
// 5dd: iload 31
// 5df: i2c
// 5e0: swap
// 5e1: getstatic su/catlean/wv.Z F
// 5e4: ldc 31.0
// 5e6: fadd
// 5e7: ldc 14.0
// 5e9: ldc 14.0
// 5eb: ldc 3.0
// 5ed: fconst_0
// 5ee: ldc 0.2
// 5f0: getstatic su/catlean/wv.k Lsu/catlean/fd;
// 5f3: invokevirtual su/catlean/fd.a ()F
// 5f6: ldc 10.0
// 5f8: fdiv
// 5f9: fadd
// 5fa: fconst_1
// 5fb: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 5fe: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 601: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 604: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 607: fconst_0
// 608: iload 32
// 60a: i2s
// 60b: fconst_0
// 60c: iload 33
// 60e: fconst_0
// 60f: sipush 17156
// 612: ldc2_w 1476984990620215787
// 615: lload 3
// 616: lxor
// 617: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61c: aconst_null
// 61d: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 620: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 623: aload 1
// 624: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 627: dup
// 628: sipush 6302
// 62b: ldc2_w 4309843667234908024
// 62e: lload 3
// 62f: lxor
// 630: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 635: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 638: getstatic su/catlean/wv.U F
// 63b: getstatic su/catlean/wv.i F
// 63e: fadd
// 63f: ldc 14.0
// 641: fsub
// 642: getstatic su/catlean/wv.Z F
// 645: ldc 35.0
// 647: fadd
// 648: fconst_1
// 649: ldc 6.0
// 64b: bipush 1
// 64c: anewarray 96
// 64f: astore 66
// 651: aload 66
// 653: bipush 0
// 654: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 657: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 65a: aastore
// 65b: aload 66
// 65d: lload 48
// 65f: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 662: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 665: aload 1
// 666: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 669: dup
// 66a: sipush 6302
// 66d: ldc2_w 4309843667234908024
// 670: lload 3
// 671: lxor
// 672: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 677: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 67a: getstatic su/catlean/wv.U F
// 67d: getstatic su/catlean/wv.i F
// 680: fadd
// 681: ldc 16.5
// 683: fsub
// 684: getstatic su/catlean/wv.Z F
// 687: ldc 37.5
// 689: fadd
// 68a: ldc 6.0
// 68c: fconst_1
// 68d: bipush 1
// 68e: anewarray 96
// 691: astore 66
// 693: aload 66
// 695: bipush 0
// 696: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 699: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 69c: aastore
// 69d: aload 66
// 69f: lload 48
// 6a1: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 6a4: lload 20
// 6a6: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 6a9: aload 1
// 6aa: getstatic su/catlean/wv.A Ljava/lang/String;
// 6ad: invokestatic java/lang/System.currentTimeMillis ()J
// 6b0: sipush 19545
// 6b3: ldc2_w 5680189426248181439
// 6b6: lload 3
// 6b7: lxor
// 6b8: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6bd: i2l
// 6be: lrem
// 6bf: sipush 25097
// 6c2: ldc2_w 9094291414175447536
// 6c5: lload 3
// 6c6: lxor
// 6c7: invokedynamic q (IJ)J bsm=su/catlean/wv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cc: lcmp
// 6cd: lload 3
// 6ce: lconst_0
// 6cf: lcmp
// 6d0: iflt 6eb
// 6d3: aload 65
// 6d5: ifnull 6eb
// 6d8: ifle 6fd
// 6db: goto 6e8
// 6de: ldc2_w 8495688591926523508
// 6e1: lload 3
// 6e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e7: athrow
// 6e8: getstatic su/catlean/wv.y Z
// 6eb: ifeq 6fd
// 6ee: ldc "_"
// 6f0: goto 6ff
// 6f3: ldc2_w 8495688591926523508
// 6f6: lload 3
// 6f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6fc: athrow
// 6fd: ldc ""
// 6ff: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 704: getstatic su/catlean/wv.U F
// 707: ldc 10.0
// 709: fadd
// 70a: lload 18
// 70c: dup2_x1
// 70d: pop2
// 70e: getstatic su/catlean/wv.Z F
// 711: ldc 31.5
// 713: fadd
// 714: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 717: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 71a: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 71d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 720: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 723: lload 25
// 725: dup2_x1
// 726: pop2
// 727: getstatic su/catlean/wv.l Lsu/catlean/fd;
// 72a: invokevirtual su/catlean/fd.a ()F
// 72d: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 730: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 733: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 736: invokevirtual su/catlean/yl.y ()Lsu/catlean/o4;
// 739: lload 12
// 73b: iload 14
// 73d: i2b
// 73e: invokevirtual su/catlean/o4.Z (JB)Ljava/util/List;
// 741: invokeinterface java/util/List.size ()I 1
// 746: sipush 16303
// 749: ldc2_w 9183555188727453003
// 74c: lload 3
// 74d: lxor
// 74e: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 753: imul
// 754: i2f
// 755: ldc 52.0
// 757: fadd
// 758: putstatic su/catlean/wv.x F
// 75b: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 75e: invokevirtual su/catlean/yl.y ()Lsu/catlean/o4;
// 761: lload 12
// 763: iload 14
// 765: i2b
// 766: invokevirtual su/catlean/o4.Z (JB)Ljava/util/List;
// 769: checkcast java/lang/Iterable
// 76c: astore 66
// 76e: bipush 0
// 76f: istore 67
// 771: bipush 0
// 772: istore 68
// 774: aload 66
// 776: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 77b: astore 69
// 77d: aload 69
// 77f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 784: ifeq ad4
// 787: aload 69
// 789: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 78e: astore 70
// 790: iload 68
// 792: iinc 68 1
// 795: istore 71
// 797: lload 3
// 798: lconst_0
// 799: lcmp
// 79a: ifle f65
// 79d: iload 71
// 79f: aload 65
// 7a1: ifnull f59
// 7a4: aload 65
// 7a6: lload 3
// 7a7: lconst_0
// 7a8: lcmp
// 7a9: iflt 7d3
// 7ac: ifnull 7d1
// 7af: goto 7bc
// 7b2: ldc2_w 8495688591926523508
// 7b5: lload 3
// 7b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7bb: athrow
// 7bc: ifge 7cf
// 7bf: goto 7cc
// 7c2: ldc2_w 8495688591926523508
// 7c5: lload 3
// 7c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7cb: athrow
// 7cc: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
// 7cf: iload 71
// 7d1: aload 70
// 7d3: checkcast su/catlean/o_
// 7d6: astore 72
// 7d8: istore 73
// 7da: bipush 0
// 7db: istore 74
// 7dd: getstatic su/catlean/wv.U F
// 7e0: ldc 4.0
// 7e2: fadd
// 7e3: fstore 75
// 7e5: getstatic su/catlean/wv.U F
// 7e8: ldc 4.0
// 7ea: fadd
// 7eb: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 7ee: pop
// 7ef: getstatic su/catlean/wv.i F
// 7f2: fadd
// 7f3: ldc 8.0
// 7f5: fsub
// 7f6: fstore 76
// 7f8: iload 2
// 7f9: i2f
// 7fa: fstore 77
// 7fc: fload 75
// 7fe: fload 77
// 800: fcmpg
// 801: aload 65
// 803: lload 3
// 804: lconst_0
// 805: lcmp
// 806: ifle 830
// 809: ifnull 82e
// 80c: ifgt 855
// 80f: goto 81c
// 812: ldc2_w 8495688591926523508
// 815: lload 3
// 816: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81b: athrow
// 81c: fload 77
// 81e: fload 76
// 820: fcmpg
// 821: goto 82e
// 824: ldc2_w 8495688591926523508
// 827: lload 3
// 828: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82d: athrow
// 82e: aload 65
// 830: ifnull 852
// 833: ifgt 851
// 836: goto 843
// 839: ldc2_w 8495688591926523508
// 83c: lload 3
// 83d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 842: athrow
// 843: bipush 1
// 844: goto 856
// 847: ldc2_w 8495688591926523508
// 84a: lload 3
// 84b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 850: athrow
// 851: bipush 0
// 852: goto 856
// 855: bipush 0
// 856: ifeq 90b
// 859: getstatic su/catlean/wv.Z F
// 85c: ldc 52.0
// 85e: fadd
// 85f: iload 73
// 861: sipush 16303
// 864: ldc2_w 9183555188727453003
// 867: lload 3
// 868: lxor
// 869: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 86e: imul
// 86f: i2f
// 870: fadd
// 871: fstore 75
// 873: getstatic su/catlean/wv.Z F
// 876: ldc 72.0
// 878: fadd
// 879: iload 73
// 87b: sipush 16303
// 87e: ldc2_w 9183555188727453003
// 881: lload 3
// 882: lxor
// 883: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 888: imul
// 889: i2f
// 88a: fadd
// 88b: fstore 76
// 88d: iload 5
// 88f: i2f
// 890: fstore 77
// 892: fload 75
// 894: fload 77
// 896: fcmpg
// 897: aload 65
// 899: lload 3
// 89a: lconst_0
// 89b: lcmp
// 89c: ifle 8c6
// 89f: ifnull 8c4
// 8a2: ifgt 8eb
// 8a5: goto 8b2
// 8a8: ldc2_w 8495688591926523508
// 8ab: lload 3
// 8ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b1: athrow
// 8b2: fload 77
// 8b4: fload 76
// 8b6: fcmpg
// 8b7: goto 8c4
// 8ba: ldc2_w 8495688591926523508
// 8bd: lload 3
// 8be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c3: athrow
// 8c4: aload 65
// 8c6: ifnull 8e8
// 8c9: ifgt 8e7
// 8cc: goto 8d9
// 8cf: ldc2_w 8495688591926523508
// 8d2: lload 3
// 8d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8d8: athrow
// 8d9: bipush 1
// 8da: goto 8ec
// 8dd: ldc2_w 8495688591926523508
// 8e0: lload 3
// 8e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e6: athrow
// 8e7: bipush 0
// 8e8: goto 8ec
// 8eb: bipush 0
// 8ec: lload 3
// 8ed: lconst_0
// 8ee: lcmp
// 8ef: iflt 986
// 8f2: ifeq 90b
// 8f5: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 8f8: pop
// 8f9: aload 72
// 8fb: putstatic su/catlean/wv.v Lsu/catlean/o_;
// 8fe: goto 90b
// 901: ldc2_w 8495688591926523508
// 904: lload 3
// 905: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90a: athrow
// 90b: aload 1
// 90c: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 90f: dup
// 910: sipush 6302
// 913: ldc2_w 4309843667234908024
// 916: lload 3
// 917: lxor
// 918: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 91d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 920: getstatic su/catlean/wv.U F
// 923: ldc 4.0
// 925: fadd
// 926: iload 31
// 928: i2c
// 929: swap
// 92a: getstatic su/catlean/wv.Z F
// 92d: ldc 52.0
// 92f: fadd
// 930: iload 73
// 932: sipush 16303
// 935: ldc2_w 9183555188727453003
// 938: lload 3
// 939: lxor
// 93a: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93f: imul
// 940: i2f
// 941: fadd
// 942: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 945: pop
// 946: getstatic su/catlean/wv.i F
// 949: ldc 8.0
// 94b: fsub
// 94c: ldc 20.0
// 94e: ldc 4.0
// 950: fconst_2
// 951: fconst_0
// 952: fconst_1
// 953: aload 72
// 955: invokevirtual su/catlean/o_.t ()Ljava/awt/Color;
// 958: aload 72
// 95a: invokevirtual su/catlean/o_.a ()Ljava/awt/Color;
// 95d: fconst_0
// 95e: iload 32
// 960: i2s
// 961: fconst_0
// 962: iload 33
// 964: fconst_0
// 965: sipush 17156
// 968: ldc2_w 1476984990620215787
// 96b: lload 3
// 96c: lxor
// 96d: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 972: aconst_null
// 973: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 976: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 979: invokevirtual su/catlean/yl.y ()Lsu/catlean/o4;
// 97c: lload 29
// 97e: invokevirtual su/catlean/o4.k (J)Lsu/catlean/o_;
// 981: aload 72
// 983: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 986: lload 3
// 987: lconst_0
// 988: lcmp
// 989: ifle 9b8
// 98c: aload 65
// 98e: ifnull 9b8
// 991: ifeq 9b0
// 994: goto 9a1
// 997: ldc2_w 8495688591926523508
// 99a: lload 3
// 99b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9a0: athrow
// 9a1: ldc 0.55
// 9a3: goto 9cc
// 9a6: ldc2_w 8495688591926523508
// 9a9: lload 3
// 9aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9af: athrow
// 9b0: getstatic su/catlean/wv.v Lsu/catlean/o_;
// 9b3: aload 72
// 9b5: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 9b8: ifeq 9ca
// 9bb: ldc 0.5
// 9bd: goto 9cc
// 9c0: ldc2_w 8495688591926523508
// 9c3: lload 3
// 9c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9c9: athrow
// 9ca: ldc 0.4
// 9cc: fstore 75
// 9ce: getstatic su/catlean/wv.U F
// 9d1: ldc 4.0
// 9d3: fadd
// 9d4: getstatic su/catlean/wv.Z F
// 9d7: ldc 52.0
// 9d9: fadd
// 9da: iload 73
// 9dc: sipush 16303
// 9df: ldc2_w 9183555188727453003
// 9e2: lload 3
// 9e3: lxor
// 9e4: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9e9: imul
// 9ea: i2f
// 9eb: fadd
// 9ec: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 9ef: pop
// 9f0: getstatic su/catlean/wv.i F
// 9f3: ldc 8.0
// 9f5: fsub
// 9f6: ldc 20.0
// 9f8: ldc 4.0
// 9fa: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 9fd: aload 72
// 9ff: invokevirtual su/catlean/o_.b ()Ljava/awt/Color;
// a02: iload 22
// a04: i2c
// a05: iload 23
// a07: fload 75
// a09: iload 24
// a0b: i2s
// a0c: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// a0f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// a12: aload 72
// a14: invokevirtual su/catlean/o_.V ()Ljava/awt/Color;
// a17: iload 22
// a19: i2c
// a1a: iload 23
// a1c: fload 75
// a1e: iload 24
// a20: i2s
// a21: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// a24: getstatic su/catlean/jl.y Lsu/catlean/jl;
// a27: aload 72
// a29: invokevirtual su/catlean/o_.t ()Ljava/awt/Color;
// a2c: iload 22
// a2e: i2c
// a2f: iload 23
// a31: fload 75
// a33: iload 24
// a35: i2s
// a36: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// a39: lload 36
// a3b: dup2_x1
// a3c: pop2
// a3d: getstatic su/catlean/jl.y Lsu/catlean/jl;
// a40: aload 72
// a42: invokevirtual su/catlean/o_.a ()Ljava/awt/Color;
// a45: iload 22
// a47: i2c
// a48: iload 23
// a4a: fload 75
// a4c: iload 24
// a4e: i2s
// a4f: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// a52: aload 1
// a53: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// a56: dup
// a57: sipush 6302
// a5a: ldc2_w 4309843667234908024
// a5d: lload 3
// a5e: lxor
// a5f: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a64: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// a67: fconst_0
// a68: aconst_null
// a69: sipush 13265
// a6c: ldc2_w 2362392524215753023
// a6f: lload 3
// a70: lxor
// a71: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a76: aconst_null
// a77: invokestatic su/catlean/l7.E (FFFFFLjava/awt/Color;Ljava/awt/Color;JLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;ILjava/lang/Object;)V
// a7a: lload 20
// a7c: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// a7f: aload 1
// a80: aload 72
// a82: invokevirtual su/catlean/o_.z ()Ljava/lang/String;
// a85: getstatic su/catlean/wv.U F
// a88: ldc 4.0
// a8a: fadd
// a8b: getstatic su/catlean/wv.j Lsu/catlean/wv;
// a8e: pop
// a8f: getstatic su/catlean/wv.i F
// a92: fconst_2
// a93: fdiv
// a94: ldc 4.0
// a96: fsub
// a97: fadd
// a98: getstatic su/catlean/wv.Z F
// a9b: ldc 61.0
// a9d: fadd
// a9e: iload 73
// aa0: sipush 16303
// aa3: ldc2_w 9183555188727453003
// aa6: lload 3
// aa7: lxor
// aa8: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aad: imul
// aae: i2f
// aaf: fadd
// ab0: aload 72
// ab2: invokevirtual su/catlean/o_.I ()Ljava/awt/Color;
// ab5: lload 42
// ab7: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// aba: nop
// abb: nop
// abc: aload 65
// abe: ifnonnull 77d
// ac1: bipush 1
// ac2: anewarray 109
// ac5: lload 3
// ac6: lconst_0
// ac7: lcmp
// ac8: iflt 78e
// acb: ldc2_w 8445283267747282702
// ace: lload 3
// acf: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ad4: nop
// ad5: goto f38
// ad8: aload 1
// ad9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// adc: dup
// add: sipush 6302
// ae0: ldc2_w 4309843667234908024
// ae3: lload 3
// ae4: lxor
// ae5: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aea: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// aed: getstatic su/catlean/wv.U F
// af0: ldc 4.0
// af2: fadd
// af3: iload 31
// af5: i2c
// af6: swap
// af7: getstatic su/catlean/wv.Z F
// afa: ldc 28.0
// afc: fadd
// afd: getstatic su/catlean/wv.i F
// b00: ldc 8.0
// b02: fsub
// b03: ldc 20.0
// b05: ldc 4.0
// b07: fconst_0
// b08: ldc 0.1
// b0a: fconst_1
// b0b: getstatic su/catlean/wv.T Lsu/catlean/o_;
// b0e: dup
// b0f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// b12: invokevirtual su/catlean/o_.t ()Ljava/awt/Color;
// b15: getstatic su/catlean/wv.T Lsu/catlean/o_;
// b18: dup
// b19: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// b1c: invokevirtual su/catlean/o_.a ()Ljava/awt/Color;
// b1f: fconst_0
// b20: iload 32
// b22: i2s
// b23: fconst_0
// b24: iload 33
// b26: fconst_0
// b27: sipush 17156
// b2a: ldc2_w 1476984990620215787
// b2d: lload 3
// b2e: lxor
// b2f: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b34: aconst_null
// b35: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// b38: lload 20
// b3a: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// b3d: aload 1
// b3e: getstatic su/catlean/wv.T Lsu/catlean/o_;
// b41: dup
// b42: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// b45: invokevirtual su/catlean/o_.z ()Ljava/lang/String;
// b48: getstatic su/catlean/wv.U F
// b4b: ldc 10.0
// b4d: fadd
// b4e: lload 18
// b50: dup2_x1
// b51: pop2
// b52: getstatic su/catlean/wv.Z F
// b55: ldc 31.5
// b57: fadd
// b58: getstatic su/catlean/jl.y Lsu/catlean/jl;
// b5b: getstatic su/catlean/wv.T Lsu/catlean/o_;
// b5e: dup
// b5f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// b62: invokevirtual su/catlean/o_.b ()Ljava/awt/Color;
// b65: iload 22
// b67: i2c
// b68: iload 23
// b6a: ldc 0.5
// b6c: iload 24
// b6e: i2s
// b6f: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// b72: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// b75: aload 1
// b76: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// b79: dup
// b7a: sipush 6302
// b7d: ldc2_w 4309843667234908024
// b80: lload 3
// b81: lxor
// b82: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b87: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// b8a: getstatic su/catlean/wv.U F
// b8d: getstatic su/catlean/wv.i F
// b90: fadd
// b91: ldc 19.0
// b93: fsub
// b94: iload 31
// b96: i2c
// b97: swap
// b98: getstatic su/catlean/wv.Z F
// b9b: ldc 33.0
// b9d: fadd
// b9e: ldc 10.5
// ba0: ldc 10.5
// ba2: fconst_2
// ba3: fconst_2
// ba4: fconst_0
// ba5: fconst_1
// ba6: getstatic su/catlean/jh.f Lsu/catlean/jh;
// ba9: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// bac: getstatic su/catlean/jh.f Lsu/catlean/jh;
// baf: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// bb2: fconst_0
// bb3: iload 32
// bb5: i2s
// bb6: fconst_0
// bb7: iload 33
// bb9: fconst_0
// bba: sipush 17156
// bbd: ldc2_w 1476984990620215787
// bc0: lload 3
// bc1: lxor
// bc2: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc7: aconst_null
// bc8: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// bcb: getstatic su/catlean/wv.B Lsu/catlean/bj;
// bce: aload 1
// bcf: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// bd2: dup
// bd3: sipush 6302
// bd6: ldc2_w 4309843667234908024
// bd9: lload 3
// bda: lxor
// bdb: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// be0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// be3: checkcast org/joml/Matrix3x2f
// be6: getstatic su/catlean/wv.U F
// be9: getstatic su/catlean/wv.i F
// bec: fadd
// bed: f2d
// bee: ldc2_w 19.0
// bf1: dsub
// bf2: getstatic su/catlean/wv.Z F
// bf5: f2d
// bf6: ldc2_w 32.0
// bf9: dadd
// bfa: fconst_0
// bfb: fconst_0
// bfc: getstatic su/catlean/jh.f Lsu/catlean/jh;
// bff: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// c02: aconst_null
// c03: fconst_0
// c04: sipush 5536
// c07: ldc2_w 1781291964393111365
// c0a: lload 3
// c0b: lxor
// c0c: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c11: lload 40
// c13: aconst_null
// c14: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// c17: getstatic su/catlean/jl.y Lsu/catlean/jl;
// c1a: lload 44
// c1c: aload 1
// c1d: new su/catlean/o7
// c20: dup
// c21: getstatic su/catlean/wv.U F
// c24: getstatic su/catlean/wv.Z F
// c27: sipush 3972
// c2a: ldc2_w 5085526130771502446
// c2d: lload 3
// c2e: lxor
// c2f: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c34: i2f
// c35: fadd
// c36: getstatic su/catlean/wv.U F
// c39: getstatic su/catlean/wv.i F
// c3c: fadd
// c3d: getstatic su/catlean/wv.Z F
// c40: getstatic su/catlean/wv.x F
// c43: fadd
// c44: invokespecial su/catlean/o7.<init> (FFFF)V
// c47: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// c4a: fconst_0
// c4b: fstore 66
// c4d: getstatic su/catlean/wv.Q Ljava/util/List;
// c50: checkcast java/lang/Iterable
// c53: astore 67
// c55: bipush 0
// c56: istore 68
// c58: aload 67
// c5a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// c5f: astore 69
// c61: aload 69
// c63: invokeinterface java/util/Iterator.hasNext ()Z 1
// c68: ifeq cd7
// c6b: aload 69
// c6d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// c72: astore 70
// c74: aload 70
// c76: checkcast su/catlean/wb
// c79: astore 71
// c7b: bipush 0
// c7c: istore 72
// c7e: aload 71
// c80: getstatic su/catlean/wv.U F
// c83: ldc 5.0
// c85: fadd
// c86: invokevirtual su/catlean/wb.E (F)V
// c89: aload 71
// c8b: getstatic su/catlean/wv.Z F
// c8e: ldc 52.0
// c90: fadd
// c91: fload 66
// c93: fadd
// c94: getstatic su/catlean/wv.p F
// c97: fadd
// c98: invokevirtual su/catlean/wb.V (F)V
// c9b: aload 71
// c9d: aload 1
// c9e: lload 27
// ca0: iload 2
// ca1: iload 5
// ca3: invokevirtual su/catlean/wb.J (Lnet/minecraft/class_332;JII)V
// ca6: fload 66
// ca8: aload 71
// caa: invokevirtual su/catlean/wb.C ()F
// cad: fconst_2
// cae: fadd
// caf: fadd
// cb0: lload 3
// cb1: lconst_0
// cb2: lcmp
// cb3: iflt cdf
// cb6: fstore 66
// cb8: nop
// cb9: nop
// cba: aload 65
// cbc: ifnull cd9
// cbf: aload 65
// cc1: ifnonnull c61
// cc4: lload 3
// cc5: lconst_0
// cc6: lcmp
// cc7: iflt cba
// cca: goto cd7
// ccd: ldc2_w 8495688591926523508
// cd0: lload 3
// cd1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cd6: athrow
// cd7: nop
// cd8: nop
// cd9: getstatic su/catlean/wv.U F
// cdc: ldc 5.0
// cde: fadd
// cdf: fstore 67
// ce1: getstatic su/catlean/wv.U F
// ce4: ldc 115.0
// ce6: fadd
// ce7: fstore 68
// ce9: iload 2
// cea: i2f
// ceb: fstore 69
// ced: fload 67
// cef: fload 69
// cf1: fcmpg
// cf2: aload 65
// cf4: lload 3
// cf5: lconst_0
// cf6: lcmp
// cf7: iflt d21
// cfa: ifnull d1f
// cfd: ifgt d46
// d00: goto d0d
// d03: ldc2_w 8495688591926523508
// d06: lload 3
// d07: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d0c: athrow
// d0d: fload 69
// d0f: fload 68
// d11: fcmpg
// d12: goto d1f
// d15: ldc2_w 8495688591926523508
// d18: lload 3
// d19: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d1e: athrow
// d1f: aload 65
// d21: ifnull d43
// d24: ifgt d42
// d27: goto d34
// d2a: ldc2_w 8495688591926523508
// d2d: lload 3
// d2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d33: athrow
// d34: bipush 1
// d35: goto d47
// d38: ldc2_w 8495688591926523508
// d3b: lload 3
// d3c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d41: athrow
// d42: bipush 0
// d43: goto d47
// d46: bipush 0
// d47: ifeq dde
// d4a: getstatic su/catlean/wv.Z F
// d4d: ldc 52.0
// d4f: fadd
// d50: fload 66
// d52: fadd
// d53: getstatic su/catlean/wv.p F
// d56: fadd
// d57: fstore 67
// d59: getstatic su/catlean/wv.Z F
// d5c: ldc 64.0
// d5e: fadd
// d5f: fload 66
// d61: fadd
// d62: getstatic su/catlean/wv.p F
// d65: fadd
// d66: fstore 68
// d68: iload 5
// d6a: i2f
// d6b: fstore 69
// d6d: fload 67
// d6f: fload 69
// d71: fcmpg
// d72: aload 65
// d74: lload 3
// d75: lconst_0
// d76: lcmp
// d77: ifle da1
// d7a: ifnull d9f
// d7d: ifgt dc6
// d80: goto d8d
// d83: ldc2_w 8495688591926523508
// d86: lload 3
// d87: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d8c: athrow
// d8d: fload 69
// d8f: fload 68
// d91: fcmpg
// d92: goto d9f
// d95: ldc2_w 8495688591926523508
// d98: lload 3
// d99: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// d9e: athrow
// d9f: aload 65
// da1: ifnull dc3
// da4: ifgt dc2
// da7: goto db4
// daa: ldc2_w 8495688591926523508
// dad: lload 3
// dae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// db3: athrow
// db4: bipush 1
// db5: goto dc7
// db8: ldc2_w 8495688591926523508
// dbb: lload 3
// dbc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// dc1: athrow
// dc2: bipush 0
// dc3: goto dc7
// dc6: bipush 0
// dc7: lload 3
// dc8: lconst_0
// dc9: lcmp
// dca: iflt dd1
// dcd: ifeq dde
// dd0: bipush 1
// dd1: goto ddf
// dd4: ldc2_w 8495688591926523508
// dd7: lload 3
// dd8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ddd: athrow
// dde: bipush 0
// ddf: putstatic su/catlean/wv.w Z
// de2: getstatic su/catlean/wv.E Lsu/catlean/fd;
// de5: getstatic su/catlean/wv.w Z
// de8: ifeq df9
// deb: fconst_1
// dec: goto dfa
// def: ldc2_w 8495688591926523508
// df2: lload 3
// df3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// df8: athrow
// df9: fconst_0
// dfa: lload 8
// dfc: dup2_x1
// dfd: pop2
// dfe: invokevirtual su/catlean/fd.B (JF)V
// e01: aload 1
// e02: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// e05: dup
// e06: sipush 6302
// e09: ldc2_w 4309843667234908024
// e0c: lload 3
// e0d: lxor
// e0e: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e13: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// e16: getstatic su/catlean/wv.U F
// e19: ldc 5.0
// e1b: fadd
// e1c: iload 31
// e1e: i2c
// e1f: swap
// e20: getstatic su/catlean/wv.Z F
// e23: ldc 52.0
// e25: fadd
// e26: fload 66
// e28: fadd
// e29: getstatic su/catlean/wv.p F
// e2c: fadd
// e2d: ldc 110.0
// e2f: ldc 12.0
// e31: ldc 3.0
// e33: fconst_2
// e34: ldc 0.4
// e36: fconst_1
// e37: getstatic su/catlean/jl.y Lsu/catlean/jl;
// e3a: getstatic java/awt/Color.RED Ljava/awt/Color;
// e3d: dup
// e3e: sipush 16216
// e41: ldc2_w 4487552013096894648
// e44: lload 3
// e45: lxor
// e46: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e4b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// e4e: ldc 0.5
// e50: getstatic su/catlean/wv.E Lsu/catlean/fd;
// e53: invokevirtual su/catlean/fd.a ()F
// e56: ldc 5.0
// e58: fdiv
// e59: fadd
// e5a: iload 22
// e5c: i2c
// e5d: swap
// e5e: iload 23
// e60: swap
// e61: iload 24
// e63: i2s
// e64: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// e67: getstatic java/awt/Color.RED Ljava/awt/Color;
// e6a: dup
// e6b: sipush 17086
// e6e: ldc2_w 7238630220188466513
// e71: lload 3
// e72: lxor
// e73: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e78: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// e7b: fconst_0
// e7c: iload 32
// e7e: i2s
// e7f: fconst_0
// e80: iload 33
// e82: fconst_0
// e83: sipush 17156
// e86: ldc2_w 1476984990620215787
// e89: lload 3
// e8a: lxor
// e8b: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// e90: aconst_null
// e91: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// e94: lload 38
// e96: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// e99: aload 1
// e9a: getstatic su/catlean/i4.h Lsu/catlean/i4;
// e9d: iload 15
// e9f: sipush 17602
// ea2: ldc2_w 2055901851925265199
// ea5: lload 3
// ea6: lxor
// ea7: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// eac: bipush 0
// ead: anewarray 513
// eb0: iload 16
// eb2: swap
// eb3: iload 17
// eb5: invokevirtual su/catlean/i4.E (ILjava/lang/String;I[Ljava/lang/Object;I)Ljava/lang/String;
// eb8: getstatic su/catlean/wv.U F
// ebb: ldc 5.0
// ebd: fadd
// ebe: ldc 55.0
// ec0: fadd
// ec1: getstatic su/catlean/wv.Z F
// ec4: ldc 57.0
// ec6: fadd
// ec7: fload 66
// ec9: fadd
// eca: getstatic su/catlean/wv.p F
// ecd: fadd
// ece: getstatic su/catlean/jh.f Lsu/catlean/jh;
// ed1: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// ed4: lload 42
// ed6: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// ed9: fload 66
// edb: ldc 16.0
// edd: fadd
// ede: fstore 66
// ee0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// ee3: lload 46
// ee5: aload 1
// ee6: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// ee9: fload 66
// eeb: fconst_0
// eec: fcmpg
// eed: aload 65
// eef: ifnull f03
// ef2: ifne f06
// ef5: goto f02
// ef8: ldc2_w 8495688591926523508
// efb: lload 3
// efc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f01: athrow
// f02: bipush 1
// f03: goto f07
// f06: bipush 0
// f07: ifne f33
// f0a: getstatic su/catlean/wv.p F
// f0d: fload 66
// f0f: fneg
// f10: sipush 23665
// f13: ldc2_w 8250762836155102877
// f16: lload 3
// f17: lxor
// f18: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f1d: i2f
// f1e: fadd
// f1f: fconst_0
// f20: invokestatic java/lang/Math.clamp (FFF)F
// f23: putstatic su/catlean/wv.p F
// f26: goto f33
// f29: ldc2_w 8495688591926523508
// f2c: lload 3
// f2d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// f32: athrow
// f33: ldc 262.0
// f35: putstatic su/catlean/wv.x F
// f38: lload 6
// f3a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// f3d: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// f40: invokevirtual net/minecraft/class_1041.method_4486 ()I
// f43: i2f
// f44: getstatic su/catlean/wv.i F
// f47: fsub
// f48: ldc 5.0
// f4a: fsub
// f4b: putstatic su/catlean/wv.U F
// f4e: lload 6
// f50: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// f53: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// f56: invokevirtual net/minecraft/class_1041.method_4502 ()I
// f59: i2f
// f5a: fconst_2
// f5b: fdiv
// f5c: getstatic su/catlean/wv.x F
// f5f: fconst_2
// f60: fdiv
// f61: fsub
// f62: putstatic su/catlean/wv.Z F
// f65: return
}

public final void R(double mouseX, long a, double mouseY, int button) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wv.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 102077267908130
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 8
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 9
// 01d: dup2
// 01e: bipush 48
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 10
// 027: pop2
// 028: dup2
// 029: ldc2_w 25248520302798
// 02c: lxor
// 02d: lstore 11
// 02f: dup2
// 030: ldc2_w 723201194903
// 033: lxor
// 034: dup2
// 035: bipush 8
// 037: lushr
// 038: lstore 13
// 03a: dup2
// 03b: bipush 56
// 03d: lshl
// 03e: bipush 56
// 040: lushr
// 041: l2i
// 042: istore 15
// 044: pop2
// 045: dup2
// 046: ldc2_w 60499150673690
// 049: lxor
// 04a: lstore 16
// 04c: dup2
// 04d: ldc2_w 61037440825990
// 050: lxor
// 051: lstore 18
// 053: dup2
// 054: ldc2_w 87686029497735
// 057: lxor
// 058: lstore 20
// 05a: pop2
// 05b: ldc2_w -1577898923431097994
// 05e: lload 3
// 05f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 064: astore 22
// 066: getstatic su/catlean/wv.T Lsu/catlean/o_;
// 069: ifnull 0be
// 06c: getstatic su/catlean/wv.w Z
// 06f: aload 22
// 071: ifnull 0b8
// 074: goto 081
// 077: ldc2_w -1524863146040104636
// 07a: lload 3
// 07b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 080: athrow
// 081: ifeq 0be
// 084: goto 091
// 087: ldc2_w -1524863146040104636
// 08a: lload 3
// 08b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: athrow
// 091: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 094: invokevirtual su/catlean/yl.y ()Lsu/catlean/o4;
// 097: lload 13
// 099: iload 15
// 09b: i2b
// 09c: invokevirtual su/catlean/o4.Z (JB)Ljava/util/List;
// 09f: getstatic su/catlean/wv.T Lsu/catlean/o_;
// 0a2: dup
// 0a3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0a6: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
// 0ab: goto 0b8
// 0ae: ldc2_w -1524863146040104636
// 0b1: lload 3
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: pop
// 0b9: aconst_null
// 0ba: putstatic su/catlean/wv.T Lsu/catlean/o_;
// 0bd: return
// 0be: getstatic su/catlean/wv.U F
// 0c1: ldc 5.0
// 0c3: fadd
// 0c4: fstore 23
// 0c6: getstatic su/catlean/wv.U F
// 0c9: ldc 20.0
// 0cb: fadd
// 0cc: fstore 24
// 0ce: dload 1
// 0cf: d2f
// 0d0: fstore 25
// 0d2: fload 23
// 0d4: fload 25
// 0d6: fcmpg
// 0d7: aload 22
// 0d9: lload 3
// 0da: lconst_0
// 0db: lcmp
// 0dc: iflt 106
// 0df: ifnull 104
// 0e2: ifgt 12b
// 0e5: goto 0f2
// 0e8: ldc2_w -1524863146040104636
// 0eb: lload 3
// 0ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f1: athrow
// 0f2: fload 25
// 0f4: fload 24
// 0f6: fcmpg
// 0f7: goto 104
// 0fa: ldc2_w -1524863146040104636
// 0fd: lload 3
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: aload 22
// 106: ifnull 128
// 109: ifgt 127
// 10c: goto 119
// 10f: ldc2_w -1524863146040104636
// 112: lload 3
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: bipush 1
// 11a: goto 12c
// 11d: ldc2_w -1524863146040104636
// 120: lload 3
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: bipush 0
// 128: goto 12c
// 12b: bipush 0
// 12c: ifeq 1ec
// 12f: getstatic su/catlean/wv.Z F
// 132: ldc 6.0
// 134: fadd
// 135: fstore 23
// 137: getstatic su/catlean/wv.Z F
// 13a: ldc 21.0
// 13c: fadd
// 13d: fstore 24
// 13f: dload 5
// 141: d2f
// 142: fstore 25
// 144: fload 23
// 146: fload 25
// 148: fcmpg
// 149: aload 22
// 14b: lload 3
// 14c: lconst_0
// 14d: lcmp
// 14e: ifle 178
// 151: ifnull 176
// 154: ifgt 19d
// 157: goto 164
// 15a: ldc2_w -1524863146040104636
// 15d: lload 3
// 15e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 163: athrow
// 164: fload 25
// 166: fload 24
// 168: fcmpg
// 169: goto 176
// 16c: ldc2_w -1524863146040104636
// 16f: lload 3
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: aload 22
// 178: ifnull 19a
// 17b: ifgt 199
// 17e: goto 18b
// 181: ldc2_w -1524863146040104636
// 184: lload 3
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: bipush 1
// 18c: goto 19e
// 18f: ldc2_w -1524863146040104636
// 192: lload 3
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: bipush 0
// 19a: goto 19e
// 19d: bipush 0
// 19e: ifeq 1ec
// 1a1: invokestatic net/minecraft/class_156.method_668 ()Lnet/minecraft/class_156$class_158;
// 1a4: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 1a7: invokevirtual su/catlean/yl.y ()Lsu/catlean/o4;
// 1aa: invokevirtual su/catlean/o4.U ()Ljava/io/File;
// 1ad: astore 23
// 1af: aload 23
// 1b1: astore 24
// 1b3: astore 34
// 1b5: bipush 0
// 1b6: istore 25
// 1b8: aload 24
// 1ba: invokevirtual java/io/File.exists ()Z
// 1bd: aload 22
// 1bf: ifnull 1e4
// 1c2: ifne 1e5
// 1c5: goto 1d2
// 1c8: ldc2_w -1524863146040104636
// 1cb: lload 3
// 1cc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d1: athrow
// 1d2: aload 24
// 1d4: invokevirtual java/io/File.createNewFile ()Z
// 1d7: goto 1e4
// 1da: ldc2_w -1524863146040104636
// 1dd: lload 3
// 1de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e3: athrow
// 1e4: pop
// 1e5: aload 34
// 1e7: aload 23
// 1e9: invokevirtual net/minecraft/class_156$class_158.method_672 (Ljava/io/File;)V
// 1ec: getstatic su/catlean/wv.U F
// 1ef: getstatic su/catlean/wv.i F
// 1f2: fadd
// 1f3: ldc 21.0
// 1f5: fsub
// 1f6: fstore 23
// 1f8: dload 1
// 1f9: getstatic su/catlean/wv.U F
// 1fc: getstatic su/catlean/wv.i F
// 1ff: fadd
// 200: ldc 7.0
// 202: fsub
// 203: f2d
// 204: dcmpg
// 205: aload 22
// 207: lload 3
// 208: lconst_0
// 209: lcmp
// 20a: ifle 234
// 20d: ifnull 232
// 210: ifgt 259
// 213: goto 220
// 216: ldc2_w -1524863146040104636
// 219: lload 3
// 21a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21f: athrow
// 220: fload 23
// 222: f2d
// 223: dload 1
// 224: dcmpg
// 225: goto 232
// 228: ldc2_w -1524863146040104636
// 22b: lload 3
// 22c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: athrow
// 232: aload 22
// 234: ifnull 256
// 237: ifgt 255
// 23a: goto 247
// 23d: ldc2_w -1524863146040104636
// 240: lload 3
// 241: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 246: athrow
// 247: bipush 1
// 248: goto 25a
// 24b: ldc2_w -1524863146040104636
// 24e: lload 3
// 24f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 254: athrow
// 255: bipush 0
// 256: goto 25a
// 259: bipush 0
// 25a: ifeq 323
// 25d: getstatic su/catlean/wv.Z F
// 260: ldc 31.0
// 262: fadd
// 263: fstore 23
// 265: dload 5
// 267: getstatic su/catlean/wv.Z F
// 26a: ldc 45.0
// 26c: fadd
// 26d: f2d
// 26e: dcmpg
// 26f: aload 22
// 271: lload 3
// 272: lconst_0
// 273: lcmp
// 274: iflt 29f
// 277: ifnull 29d
// 27a: ifgt 2c4
// 27d: goto 28a
// 280: ldc2_w -1524863146040104636
// 283: lload 3
// 284: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: athrow
// 28a: fload 23
// 28c: f2d
// 28d: dload 5
// 28f: dcmpg
// 290: goto 29d
// 293: ldc2_w -1524863146040104636
// 296: lload 3
// 297: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29c: athrow
// 29d: aload 22
// 29f: ifnull 2c1
// 2a2: ifgt 2c0
// 2a5: goto 2b2
// 2a8: ldc2_w -1524863146040104636
// 2ab: lload 3
// 2ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b1: athrow
// 2b2: bipush 1
// 2b3: goto 2c5
// 2b6: ldc2_w -1524863146040104636
// 2b9: lload 3
// 2ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bf: athrow
// 2c0: bipush 0
// 2c1: goto 2c5
// 2c4: bipush 0
// 2c5: lload 3
// 2c6: lconst_0
// 2c7: lcmp
// 2c8: ifle 2d1
// 2cb: ifeq 323
// 2ce: getstatic su/catlean/wv.y Z
// 2d1: aload 22
// 2d3: lload 3
// 2d4: lconst_0
// 2d5: lcmp
// 2d6: iflt 33d
// 2d9: ifnull 33b
// 2dc: goto 2e9
// 2df: ldc2_w -1524863146040104636
// 2e2: lload 3
// 2e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e8: athrow
// 2e9: ifeq 323
// 2ec: goto 2f9
// 2ef: ldc2_w -1524863146040104636
// 2f2: lload 3
// 2f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f8: athrow
// 2f9: lload 3
// 2fa: lconst_0
// 2fb: lcmp
// 2fc: ifle 32b
// 2ff: getstatic su/catlean/wv.T Lsu/catlean/o_;
// 302: ifnonnull 323
// 305: goto 312
// 308: ldc2_w -1524863146040104636
// 30b: lload 3
// 30c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 311: athrow
// 312: aload 0
// 313: lload 18
// 315: invokespecial su/catlean/wv.V (J)V
// 318: return
// 319: ldc2_w -1524863146040104636
// 31c: lload 3
// 31d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 322: athrow
// 323: getstatic su/catlean/wv.U F
// 326: ldc 4.0
// 328: fadd
// 329: fstore 23
// 32b: dload 1
// 32c: getstatic su/catlean/wv.U F
// 32f: ldc 4.0
// 331: fadd
// 332: getstatic su/catlean/wv.i F
// 335: fadd
// 336: ldc 8.0
// 338: fsub
// 339: f2d
// 33a: dcmpg
// 33b: aload 22
// 33d: lload 3
// 33e: lconst_0
// 33f: lcmp
// 340: ifle 36a
// 343: ifnull 368
// 346: ifgt 38f
// 349: goto 356
// 34c: ldc2_w -1524863146040104636
// 34f: lload 3
// 350: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 355: athrow
// 356: fload 23
// 358: f2d
// 359: dload 1
// 35a: dcmpg
// 35b: goto 368
// 35e: ldc2_w -1524863146040104636
// 361: lload 3
// 362: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 367: athrow
// 368: aload 22
// 36a: ifnull 38c
// 36d: ifgt 38b
// 370: goto 37d
// 373: ldc2_w -1524863146040104636
// 376: lload 3
// 377: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37c: athrow
// 37d: bipush 1
// 37e: goto 390
// 381: ldc2_w -1524863146040104636
// 384: lload 3
// 385: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38a: athrow
// 38b: bipush 0
// 38c: goto 390
// 38f: bipush 0
// 390: ifeq 485
// 393: getstatic su/catlean/wv.Z F
// 396: ldc 28.0
// 398: fadd
// 399: fstore 23
// 39b: dload 5
// 39d: getstatic su/catlean/wv.Z F
// 3a0: ldc 48.0
// 3a2: fadd
// 3a3: f2d
// 3a4: dcmpg
// 3a5: aload 22
// 3a7: lload 3
// 3a8: lconst_0
// 3a9: lcmp
// 3aa: iflt 3d5
// 3ad: ifnull 3d3
// 3b0: ifgt 3fa
// 3b3: goto 3c0
// 3b6: ldc2_w -1524863146040104636
// 3b9: lload 3
// 3ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bf: athrow
// 3c0: fload 23
// 3c2: f2d
// 3c3: dload 5
// 3c5: dcmpg
// 3c6: goto 3d3
// 3c9: ldc2_w -1524863146040104636
// 3cc: lload 3
// 3cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d2: athrow
// 3d3: aload 22
// 3d5: ifnull 3f7
// 3d8: ifgt 3f6
// 3db: goto 3e8
// 3de: ldc2_w -1524863146040104636
// 3e1: lload 3
// 3e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e7: athrow
// 3e8: bipush 1
// 3e9: goto 3fb
// 3ec: ldc2_w -1524863146040104636
// 3ef: lload 3
// 3f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f5: athrow
// 3f6: bipush 0
// 3f7: goto 3fb
// 3fa: bipush 0
// 3fb: ifeq 485
// 3fe: getstatic su/catlean/wv.T Lsu/catlean/o_;
// 401: astore 23
// 403: aload 23
// 405: aload 22
// 407: ifnull 41c
// 40a: ifnull 42a
// 40d: goto 41a
// 410: ldc2_w -1524863146040104636
// 413: lload 3
// 414: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 419: athrow
// 41a: aload 23
// 41c: astore 25
// 41e: bipush 0
// 41f: istore 26
// 421: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 424: pop
// 425: aconst_null
// 426: putstatic su/catlean/wv.T Lsu/catlean/o_;
// 429: return
// 42a: lload 3
// 42b: lconst_0
// 42c: lcmp
// 42d: iflt 47f
// 430: getstatic su/catlean/wv.y Z
// 433: aload 22
// 435: ifnull 47c
// 438: ifeq 46e
// 43b: goto 448
// 43e: ldc2_w -1524863146040104636
// 441: lload 3
// 442: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 447: athrow
// 448: bipush 0
// 449: putstatic su/catlean/wv.y Z
// 44c: sipush 16369
// 44f: ldc2_w 2053712419880951588
// 452: lload 3
// 453: lxor
// 454: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 459: putstatic su/catlean/wv.A Ljava/lang/String;
// 45c: aload 22
// 45e: ifnonnull 484
// 461: goto 46e
// 464: ldc2_w -1524863146040104636
// 467: lload 3
// 468: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46d: athrow
// 46e: bipush 1
// 46f: goto 47c
// 472: ldc2_w -1524863146040104636
// 475: lload 3
// 476: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47b: athrow
// 47c: putstatic su/catlean/wv.y Z
// 47f: ldc ""
// 481: putstatic su/catlean/wv.A Ljava/lang/String;
// 484: return
// 485: getstatic su/catlean/wv.Q Ljava/util/List;
// 488: checkcast java/lang/Iterable
// 48b: astore 23
// 48d: bipush 0
// 48e: istore 24
// 490: aload 23
// 492: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 497: astore 25
// 499: aload 25
// 49b: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4a0: ifeq 4e7
// 4a3: aload 25
// 4a5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4aa: astore 26
// 4ac: aload 26
// 4ae: checkcast su/catlean/wb
// 4b1: astore 27
// 4b3: bipush 0
// 4b4: istore 28
// 4b6: aload 27
// 4b8: dload 1
// 4b9: dload 5
// 4bb: iload 7
// 4bd: lload 11
// 4bf: invokevirtual su/catlean/wb.r (DDIJ)V
// 4c2: nop
// 4c3: nop
// 4c4: lload 3
// 4c5: lconst_0
// 4c6: lcmp
// 4c7: ifle 4e8
// 4ca: aload 22
// 4cc: ifnull 4e8
// 4cf: aload 22
// 4d1: ifnonnull 499
// 4d4: lload 3
// 4d5: lconst_0
// 4d6: lcmp
// 4d7: ifle 4c4
// 4da: goto 4e7
// 4dd: ldc2_w -1524863146040104636
// 4e0: lload 3
// 4e1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4e6: athrow
// 4e7: nop
// 4e8: iload 7
// 4ea: ifne 525
// 4ed: getstatic su/catlean/wv.v Lsu/catlean/o_;
// 4f0: lload 3
// 4f1: lconst_0
// 4f2: lcmp
// 4f3: ifle 519
// 4f6: dup
// 4f7: ifnull 519
// 4fa: goto 507
// 4fd: ldc2_w -1524863146040104636
// 500: lload 3
// 501: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 506: athrow
// 507: astore 25
// 509: bipush 0
// 50a: istore 26
// 50c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 50f: lload 20
// 511: aload 25
// 513: invokevirtual su/catlean/jh.i (JLsu/catlean/o_;)V
// 516: goto 60d
// 519: lload 3
// 51a: lconst_0
// 51b: lcmp
// 51c: ifle 528
// 51f: pop
// 520: aload 22
// 522: ifnonnull 60d
// 525: getstatic su/catlean/wv.v Lsu/catlean/o_;
// 528: dup
// 529: ifnull 60b
// 52c: goto 539
// 52f: ldc2_w -1524863146040104636
// 532: lload 3
// 533: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 538: athrow
// 539: astore 25
// 53b: bipush 0
// 53c: istore 26
// 53e: getstatic su/catlean/wv.Q Ljava/util/List;
// 541: invokeinterface java/util/List.clear ()V 1
// 546: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 549: pop
// 54a: getstatic su/catlean/wv.v Lsu/catlean/o_;
// 54d: putstatic su/catlean/wv.T Lsu/catlean/o_;
// 550: bipush 0
// 551: istore 27
// 553: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 556: getstatic su/catlean/wv.T Lsu/catlean/o_;
// 559: dup
// 55a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 55d: lload 16
// 55f: dup2_x1
// 560: pop2
// 561: invokevirtual su/catlean/jh.I (JLsu/catlean/o_;)Ljava/util/Map;
// 564: astore 28
// 566: bipush 0
// 567: istore 29
// 569: aload 28
// 56b: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 570: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
// 575: astore 30
// 577: aload 30
// 579: invokeinterface java/util/Iterator.hasNext ()Z 1
// 57e: ifeq 606
// 581: aload 30
// 583: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 588: checkcast java/util/Map$Entry
// 58b: astore 31
// 58d: aload 31
// 58f: astore 32
// 591: bipush 0
// 592: istore 33
// 594: getstatic su/catlean/wv.Q Ljava/util/List;
// 597: new su/catlean/wb
// 59a: dup
// 59b: aload 32
// 59d: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 5a2: checkcast java/lang/String
// 5a5: getstatic su/catlean/wv.T Lsu/catlean/o_;
// 5a8: dup
// 5a9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 5ac: getstatic su/catlean/wv.U F
// 5af: ldc 4.0
// 5b1: fadd
// 5b2: iload 8
// 5b4: swap
// 5b5: iload 9
// 5b7: i2s
// 5b8: swap
// 5b9: getstatic su/catlean/wv.Z F
// 5bc: ldc 55.0
// 5be: fadd
// 5bf: iload 27
// 5c1: i2f
// 5c2: ldc 16.0
// 5c4: fmul
// 5c5: fadd
// 5c6: aload 32
// 5c8: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 5cd: checkcast java/awt/Color
// 5d0: iload 10
// 5d2: invokespecial su/catlean/wb.<init> (Ljava/lang/String;Lsu/catlean/o_;ISFFLjava/awt/Color;I)V
// 5d5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
// 5da: pop
// 5db: iload 27
// 5dd: bipush 1
// 5de: iadd
// 5df: istore 27
// 5e1: nop
// 5e2: nop
// 5e3: aload 22
// 5e5: lload 3
// 5e6: lconst_0
// 5e7: lcmp
// 5e8: iflt 5f0
// 5eb: ifnull 608
// 5ee: aload 22
// 5f0: ifnonnull 577
// 5f3: lload 3
// 5f4: lconst_0
// 5f5: lcmp
// 5f6: ifle 5e3
// 5f9: goto 606
// 5fc: ldc2_w -1524863146040104636
// 5ff: lload 3
// 600: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 605: athrow
// 606: nop
// 607: nop
// 608: goto 60d
// 60b: pop
// 60c: nop
// 60d: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void j(char a, int a, double mouseX, short a, double mouseY, int button) {
long var9 = ((long)axxx << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48) ^ a;
_g[] var10000 = vm.a<"Å">(-5373321346802493950L, var9);
Iterable var12 = Q;
_g[] var11 = var10000;
boolean var13 = false;

label38:
for (Object var15 : var12) {
wb var16 = (wb)var15;
boolean var17 = false;

try {
var16.T();
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -5358556837576002000L, var9);
}

do {
try {
var10000 = var11;
if (axx < 0) {
if (var11 == null) {
return;
}

var10000 = var11;
}

if (var10000 != null) {
continue label38;
}
} catch (NumberFormatException var19) {
throw vm.a<"Å">(var19, -5358556837576002000L, var9);
}
} while (axxx < 0);

return;
}
}

public final void A(long a, int keyCode, int scanCode, int modifiers) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/wv.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 83385487232967
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 74593296397796
// 012: lxor
// 013: lstore 8
// 015: pop2
// 016: getstatic su/catlean/wv.Q Ljava/util/List;
// 019: checkcast java/lang/Iterable
// 01c: astore 11
// 01e: ldc2_w 2259488835296164919
// 021: lload 1
// 022: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 027: bipush 0
// 028: istore 12
// 02a: aload 11
// 02c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 031: astore 13
// 033: astore 10
// 035: aload 13
// 037: invokeinterface java/util/Iterator.hasNext ()Z 1
// 03c: ifeq 07f
// 03f: aload 13
// 041: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 046: astore 14
// 048: aload 14
// 04a: checkcast su/catlean/wb
// 04d: astore 15
// 04f: bipush 0
// 050: istore 16
// 052: aload 15
// 054: iload 3
// 055: lload 8
// 057: invokevirtual su/catlean/wb.X (IJ)V
// 05a: nop
// 05b: nop
// 05c: lload 1
// 05d: lconst_0
// 05e: lcmp
// 05f: ifle 080
// 062: aload 10
// 064: ifnull 080
// 067: aload 10
// 069: ifnonnull 035
// 06c: lload 1
// 06d: lconst_0
// 06e: lcmp
// 06f: iflt 05c
// 072: goto 07f
// 075: ldc2_w 2276540310992657413
// 078: lload 1
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: nop
// 080: getstatic su/catlean/wv.y Z
// 083: lload 1
// 084: lconst_0
// 085: lcmp
// 086: iflt 09f
// 089: aload 10
// 08b: ifnull 09f
// 08e: ifeq 111
// 091: goto 09e
// 094: ldc2_w 2276540310992657413
// 097: lload 1
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: iload 3
// 09f: tableswitch 114 256 259 81 57 114 29
// 0bc: getstatic su/catlean/wv.A Ljava/lang/String;
// 0bf: bipush 1
// 0c0: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 0c3: putstatic su/catlean/wv.A Ljava/lang/String;
// 0c6: aload 10
// 0c8: ifnonnull 111
// 0cb: goto 0d8
// 0ce: ldc2_w 2276540310992657413
// 0d1: lload 1
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: aload 0
// 0d9: lload 6
// 0db: invokespecial su/catlean/wv.V (J)V
// 0de: aload 10
// 0e0: ifnonnull 111
// 0e3: goto 0f0
// 0e6: ldc2_w 2276540310992657413
// 0e9: lload 1
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: bipush 0
// 0f1: putstatic su/catlean/wv.y Z
// 0f4: sipush 16369
// 0f7: ldc2_w 2053708248119061093
// 0fa: lload 1
// 0fb: lxor
// 0fc: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/wv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: putstatic su/catlean/wv.A Ljava/lang/String;
// 104: goto 111
// 107: ldc2_w 2276540310992657413
// 10a: lload 1
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: return
}

private final void V(long var1) {
var1 = a ^ var1;
long var3 = (var1 ^ 37750690034068L) >>> 8;
int var5 = (int)((var1 ^ 37750690034068L) << 56 >>> 56);
long var6 = (var1 ^ 72228375695529L) >>> 16;
int var8 = (int)((var1 ^ 72228375695529L) << 48 >>> 48);
_g[] var9 = vm.a<"Å">(-6910474870556638347L, var1);

boolean var10000;
label22: {
label21: {
try {
var10000 = StringsKt.isBlank(A);
if (var9 == null) {
break label22;
}

if (!var10000) {
break label21;
}
} catch (NumberFormatException var12) {
throw vm.a<"Å">(var12, -6857368210091564217L, var1);
}

var10000 = false;
break label22;
}

jh var10 = jh.f;
boolean var11 = false;
long var10001 = 2053749652512150823L ^ var1;
yl.g
.y()
.Z(var3, (byte)var5)
.add(
new o_(A, var10.t(), var10.H(), var10.g(), var10.T(), var6, var10.F(), var10.n(), var10.r(), var10.S(), (char)var8, var10.i(), var10.j(), var10.Z(), var10.h())
);
y = false;
A = a<"t">(16369, var10001);
return;
}

y = var10000;
A = a<"t">(26634, 5360774880105284311L ^ var1);
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
public final void Y(long a, char chr) {
ax = a ^ ax;
long var4 = ax ^ 834516960107L;
_g[] var10000 = vm.a<"Å">(6234432730967160297L, ax);
Iterable var7 = Q;
_g[] var6 = var10000;
boolean var8 = false;

label45:
for (Object var10 : var7) {
wb var11 = (wb)var10;
boolean var12 = false;

try {
var11.P(var4, chr);
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 6217663280530806235L, ax);
}

while (true) {
try {
if (ax < 0L || var6 == null) {
break label45;
}

if (var6 != null) {
break;
}
} catch (NumberFormatException var15) {
throw vm.a<"Å">(var15, 6217663280530806235L, ax);
}

if (ax > 0L) {
break label45;
}
}
}

try {
if (ax >= 0L && y) {
A = A + chr;
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 6217663280530806235L, ax);
}
}

public final boolean m(short a, double mX, long a, double mY, double amount) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: lload 4
// 007: bipush 16
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: getstatic su/catlean/wv.a J
// 011: lxor
// 012: lstore 10
// 014: ldc2_w -309548352115042088
// 017: lload 10
// 019: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01e: getstatic su/catlean/wv.U F
// 021: fstore 13
// 023: astore 12
// 025: dload 2
// 026: getstatic su/catlean/wv.U F
// 029: getstatic su/catlean/wv.i F
// 02c: fadd
// 02d: f2d
// 02e: dcmpg
// 02f: aload 12
// 031: ifnull 058
// 034: ifgt 081
// 037: goto 045
// 03a: ldc2_w -326239188003653398
// 03d: lload 10
// 03f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: athrow
// 045: fload 13
// 047: f2d
// 048: dload 2
// 049: dcmpg
// 04a: goto 058
// 04d: ldc2_w -326239188003653398
// 050: lload 10
// 052: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: athrow
// 058: aload 12
// 05a: ifnull 07e
// 05d: ifgt 07d
// 060: goto 06e
// 063: ldc2_w -326239188003653398
// 066: lload 10
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: bipush 1
// 06f: goto 082
// 072: ldc2_w -326239188003653398
// 075: lload 10
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: bipush 0
// 07e: goto 082
// 081: bipush 0
// 082: ifeq 1bd
// 085: getstatic su/catlean/wv.Z F
// 088: fstore 13
// 08a: dload 6
// 08c: getstatic su/catlean/wv.Z F
// 08f: getstatic su/catlean/wv.x F
// 092: fadd
// 093: f2d
// 094: dcmpg
// 095: aload 12
// 097: lload 4
// 099: lconst_0
// 09a: lcmp
// 09b: ifle 0c8
// 09e: ifnull 0c6
// 0a1: ifgt 0ef
// 0a4: goto 0b2
// 0a7: ldc2_w -326239188003653398
// 0aa: lload 10
// 0ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b1: athrow
// 0b2: fload 13
// 0b4: f2d
// 0b5: dload 6
// 0b7: dcmpg
// 0b8: goto 0c6
// 0bb: ldc2_w -326239188003653398
// 0be: lload 10
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: aload 12
// 0c8: ifnull 0ec
// 0cb: ifgt 0eb
// 0ce: goto 0dc
// 0d1: ldc2_w -326239188003653398
// 0d4: lload 10
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 1
// 0dd: goto 0f0
// 0e0: ldc2_w -326239188003653398
// 0e3: lload 10
// 0e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ea: athrow
// 0eb: bipush 0
// 0ec: goto 0f0
// 0ef: bipush 0
// 0f0: ifeq 1bd
// 0f3: getstatic su/catlean/wv.p F
// 0f6: dload 8
// 0f8: d2f
// 0f9: ldc 10.0
// 0fb: fmul
// 0fc: fadd
// 0fd: putstatic su/catlean/wv.p F
// 100: fconst_0
// 101: fstore 13
// 103: ldc 14.0
// 105: fstore 13
// 107: getstatic su/catlean/wv.Q Ljava/util/List;
// 10a: checkcast java/lang/Iterable
// 10d: astore 14
// 10f: bipush 0
// 110: istore 15
// 112: aload 14
// 114: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 119: astore 16
// 11b: aload 16
// 11d: invokeinterface java/util/Iterator.hasNext ()Z 1
// 122: ifeq 169
// 125: aload 16
// 127: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 12c: astore 17
// 12e: aload 17
// 130: checkcast su/catlean/wb
// 133: astore 18
// 135: bipush 0
// 136: istore 19
// 138: fload 13
// 13a: aload 18
// 13c: invokevirtual su/catlean/wb.C ()F
// 13f: fconst_2
// 140: fadd
// 141: fadd
// 142: fstore 13
// 144: nop
// 145: nop
// 146: iload 1
// 147: iflt 16a
// 14a: aload 12
// 14c: ifnull 16a
// 14f: aload 12
// 151: ifnonnull 11b
// 154: lload 4
// 156: lconst_0
// 157: lcmp
// 158: ifle 146
// 15b: goto 169
// 15e: ldc2_w -326239188003653398
// 161: lload 10
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: nop
// 16a: fload 13
// 16c: ldc 14.0
// 16e: fcmpg
// 16f: aload 12
// 171: ifnull 186
// 174: ifne 189
// 177: goto 185
// 17a: ldc2_w -326239188003653398
// 17d: lload 10
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: bipush 1
// 186: goto 18a
// 189: bipush 0
// 18a: iload 1
// 18b: iflt 1bc
// 18e: ifeq 19e
// 191: bipush 0
// 192: ireturn
// 193: ldc2_w -326239188003653398
// 196: lload 10
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: getstatic su/catlean/wv.p F
// 1a1: fload 13
// 1a3: fneg
// 1a4: sipush 13953
// 1a7: ldc2_w 3514988766051570430
// 1aa: lload 10
// 1ac: lxor
// 1ad: invokedynamic u (IJ)I bsm=su/catlean/wv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: i2f
// 1b3: fadd
// 1b4: fconst_0
// 1b5: invokestatic java/lang/Math.clamp (FFF)F
// 1b8: putstatic su/catlean/wv.p F
// 1bb: bipush 1
// 1bc: ireturn
// 1bd: bipush 0
// 1be: ireturn
}

static {
long var31 = a ^ 51998135344951L;
long var33 = var31 ^ 43867955933947L;
long var35 = var31 ^ 71437807078518L;
long var37 = var31 ^ 32568962118001L;
_g[] var10000 = new _g[2];
vm.a<"Å">(var10000, -1242876506261713609L, var31);
Cipher var22;
Cipher var42 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var23 = 1; var23 < 8; var23++) {
var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
}

var42.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var29 = new String[12];
int var27 = 0;
String var26 = "È\u0091²\u001e¶ï\f\u000f\u0081?]À\nçÄÈ\u0018cÛÄKî\u001c¬Q[1I\u001f¹ÂÉqç¯J\u0004¶\u0014öp ÏWz\u008b7hPuRÃÄEÐèqß\u001e6ÒÊªöèóïìMa\u0011\u0001ÊÞ\u0018\u0094Q=î¦Ô\u0016\u0080ÚxøzfíE\u008cÙ\b4TQ(â\u0004\u0010TÄÁëÏxÃR1M9\u0001½\u0006F\u0083  F`¸ÊÖI\u0001t\u007f1\u0091òçÚD\u0088\u0083T×NÇ?ü0ZøÉ\u008dèóÛ\u0010ÚýR\u0018_Ùä×\u0007\u0017\u0083\u0001\u008e\u0084\u00adõ\u0018\n t\bìú¼&Þ¤4RîRo\u0093¾kâ\b\u0080Å$\u009d \u0019\u0018D¡Ð²ý×Ö£¯nÅÌ\u0013ß\u0016¨\u0080ÒÁ¬¶\u0099¡¨·×e³Ù±(ú¦Â¢¿\u0003ÞCR¿q½\u009fKw\u008dîåoà~\u001aXG¶!Ô\u001c\u0083Zª£tMÈI\u0096ÿð\u001e";
int var28 = "È\u0091²\u001e¶ï\f\u000f\u0081?]À\nçÄÈ\u0018cÛÄKî\u001c¬Q[1I\u001f¹ÂÉqç¯J\u0004¶\u0014öp ÏWz\u008b7hPuRÃÄEÐèqß\u001e6ÒÊªöèóïìMa\u0011\u0001ÊÞ\u0018\u0094Q=î¦Ô\u0016\u0080ÚxøzfíE\u008cÙ\b4TQ(â\u0004\u0010TÄÁëÏxÃR1M9\u0001½\u0006F\u0083  F`¸ÊÖI\u0001t\u007f1\u0091òçÚD\u0088\u0083T×NÇ?ü0ZøÉ\u008dèóÛ\u0010ÚýR\u0018_Ùä×\u0007\u0017\u0083\u0001\u008e\u0084\u00adõ\u0018\n t\bìú¼&Þ¤4RîRo\u0093¾kâ\b\u0080Å$\u009d \u0019\u0018D¡Ð²ý×Ö£¯nÅÌ\u0013ß\u0016¨\u0080ÒÁ¬¶\u0099¡¨·×e³Ù±(ú¦Â¢¿\u0003ÞCR¿q½\u009fKw\u008dîåoà~\u001aXG¶!Ô\u001c\u0083Zª£tMÈI\u0096ÿð\u001e"
.length();
char var25 = 16;
int var41 = -1;

label72:
while (true) {
String var43 = var26.substring(++var41, var41 + var25);
int var10001 = -1;

while (true) {
byte[] var30 = var22.doFinal(var43.getBytes("ISO-8859-1"));
String var57 = a(var30).intern();
switch (var10001) {
case 0:
var29[var27++] = var57;
if ((var41 += var25) >= var28) {
b = var29;
c = new String[12];
g = new HashMap(13);
Cipher var11;
Cipher var45 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
}

var45.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[16];
int var14 = 0;
String var15 = "®\u0080ì\u000e\\íÀ+Ã¨?ÃëÇFù\u0007z[\u0096µ±\u001cÜ\u0011Æ\u009d×®\u001d\u0090¯ÍñN«-[3\u009c3ú®øµê+\u0087;\u0015\u0019Ó÷cÏ\u0014\u0099ýp¾2ýÓeî \u008b\u0097Õ1^Á\u0097òPâ\\`æ_´\u0084n&»-\rd©m~\u0083´§øöx>XZì\u0001\u009a\u008c¯\u00adÍÑë\u001aÊ|";
int var16 = "®\u0080ì\u000e\\íÀ+Ã¨?ÃëÇFù\u0007z[\u0096µ±\u001cÜ\u0011Æ\u009d×®\u001d\u0090¯ÍñN«-[3\u009c3ú®øµê+\u0087;\u0015\u0019Ó÷cÏ\u0014\u0099ýp¾2ýÓeî \u008b\u0097Õ1^Á\u0097òPâ\\`æ_´\u0084n&»-\rd©m~\u0083´§øöx>XZì\u0001\u009a\u008c¯\u00adÍÑë\u001aÊ|"
.length();
byte var13 = 0;

label54:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var46 = var17;
var10001 = var14++;
long var61 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var65 = -1;

while (true) {
long var19 = var61;
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
long var69 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var65) {
case 0:
var46[var10001] = var69;
if (var13 >= var16) {
e = var17;
f = new Integer[16];
o = new HashMap(13);
Cipher var0;
Cipher var47 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
}

var47.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "\u0002JÅëôóéùÔú»\u008e;ýÌxS\u0085ðs\u0004&\u0096\u0005";
int var5 = "\u0002JÅëôóéùÔú»\u008e;ýÌxS\u0085ðs\u0004&\u0096\u0005".length();
byte var2 = 0;

do {
int var54 = var2;
var2 += 8;
byte[] var7 = var4.substring(var54, var2).getBytes("ISO-8859-1");
var54 = var3++;
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
var69 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var68 = -1;
var6[var54] = var69;
} while (var2 < var5);

h = var6;
n = new Long[3];
j = new wv();
i = 120.0F;
x = 270.0F;
U = zf.F(var33).method_22683().method_4486() - i - 5.0F;
Z = zf.F(var33).method_22683().method_4502() / 2.0F - x / 2.0F;
Q = new ArrayList();
A = a<"t">(16369, 2053718433127455666L ^ var31);
E = new fd(_s.OUT_QUINT, c<"q">(5371, 8205344201502004391L ^ var31), var35);
k = new fd(_s.OUT_QUINT, c<"q">(17159, 4509320939462738778L ^ var31), var35);
l = new fd(_s.OUT_QUINT, c<"q">(17159, 4509320939462738778L ^ var31), var35);
m = new bj(a<"t">(28684, 7436098501698557001L ^ var31), b<"u">(32631, 6238620895942463033L ^ var31), b<"u">(32631, 6238620895942463033L ^ var31), var37);
B = new bj(a<"t">(29720, 6604236106974761050L ^ var31), b<"u">(32631, 6238620895942463033L ^ var31), b<"u">(32631, 6238620895942463033L ^ var31), var37);
return;
}
break;
default:
var46[var10001] = var69;
if (var13 < var16) {
continue label54;
}

var15 = "2\u0092G§iºÿëJ¨\u0004Ôû¼ß\u0018";
var16 = "2\u0092G§iºÿëJ¨\u0004Ôû¼ß\u0018".length();
var13 = 0;
}

byte var53 = var13;
var13 += 8;
var18 = var15.substring(var53, var13).getBytes("ISO-8859-1");
var46 = var17;
var10001 = var14++;
var61 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var65 = 0;
}
}
}

var25 = var26.charAt(var41);
break;
default:
var29[var27++] = var57;
if ((var41 += var25) < var28) {
var25 = var26.charAt(var41);
continue label72;
}

var26 = "Á\rÆöÃ\u0010\u00862üEl\u0018þ¦ÞÊln96\u0002¢Ç»\u0010Ó®A\u0081Ê\u0092\u0004bd:\räÕ\u0002\u0001l";
var28 = "Á\rÆöÃ\u0010\u00862üEl\u0018þ¦ÞÊln96\u0002¢Ç»\u0010Ó®A\u0081Ê\u0092\u0004bd:\räÕ\u0002\u0001l".length();
var25 = 24;
var41 = -1;
}

var43 = var26.substring(++var41, var41 + var25);
var10001 = 0;
}
}
}

public static void w(_g[] var0) {
X = var0;
}

public static _g[] Q() {
return X;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3056;
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
throw new RuntimeException("su/catlean/wv", var10);
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
throw new RuntimeException("su/catlean/wv" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 24308;
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
throw new RuntimeException("su/catlean/wv", var14);
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
throw new RuntimeException("su/catlean/wv" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 28655;
if (n[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/wv", var14);
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
throw new RuntimeException("su/catlean/wv" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
