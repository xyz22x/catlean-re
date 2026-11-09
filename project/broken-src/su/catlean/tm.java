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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class tm {
@NotNull
public static final tm R;
@NotNull
private static gs n;
@NotNull
private static gs w;
private static boolean O;
private static boolean y;
@NotNull
private static final List X;
@NotNull
private static final fd K;
@NotNull
private static String V;
@Nullable
private static Function0 C;
@NotNull
private static final String k;
@NotNull
private static final String m;
private static String Q;
private static final long a = yz.a(-482408673196424408L, 8158223245272477230L, MethodHandles.lookup().lookupClass()).a(107818970027006L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private tm() {
}

public final boolean B() {
return y;
}

public final void c(boolean <set-?>) {
y = <set-?>;
}

public final void N(@NotNull class_332 context, int mouseX, int mouseY, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tm.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 46037892560869
// 00e: lxor
// 00f: lstore 6
// 011: dup2
// 012: ldc2_w 24424801766223
// 015: lxor
// 016: dup2
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 8
// 01d: dup2
// 01e: bipush 16
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 9
// 027: dup2
// 028: bipush 32
// 02a: lshl
// 02b: bipush 32
// 02d: lushr
// 02e: l2i
// 02f: istore 10
// 031: pop2
// 032: dup2
// 033: ldc2_w 36154959935640
// 036: lxor
// 037: lstore 11
// 039: dup2
// 03a: ldc2_w 64954647113277
// 03d: lxor
// 03e: lstore 13
// 040: dup2
// 041: ldc2_w 119150507767648
// 044: lxor
// 045: lstore 15
// 047: dup2
// 048: ldc2_w 115579440229178
// 04b: lxor
// 04c: lstore 17
// 04e: dup2
// 04f: ldc2_w 96483187743809
// 052: lxor
// 053: lstore 19
// 055: dup2
// 056: ldc2_w 53167589771478
// 059: lxor
// 05a: dup2
// 05b: bipush 48
// 05d: lushr
// 05e: l2i
// 05f: istore 21
// 061: dup2
// 062: bipush 16
// 064: lshl
// 065: bipush 32
// 067: lushr
// 068: l2i
// 069: istore 22
// 06b: dup2
// 06c: bipush 48
// 06e: lshl
// 06f: bipush 48
// 071: lushr
// 072: l2i
// 073: istore 23
// 075: pop2
// 076: pop2
// 077: ldc2_w -6082841199862916873
// 07a: lload 4
// 07c: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: aload 1
// 082: bipush 99
// 084: ldc2_w 7915212262249029212
// 087: lload 4
// 089: lxor
// 08a: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 092: astore 25
// 094: lload 6
// 096: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 099: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 09c: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 09f: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0a2: aload 25
// 0a4: ifnull 0b9
// 0a7: ifne 0bc
// 0aa: goto 0b8
// 0ad: ldc2_w -6090051151752802003
// 0b0: lload 4
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: bipush 0
// 0b9: putstatic su/catlean/tm.y Z
// 0bc: getstatic su/catlean/tm.K Lsu/catlean/fd;
// 0bf: getstatic su/catlean/tm.y Z
// 0c2: ifeq 0d4
// 0c5: fconst_1
// 0c6: goto 0d5
// 0c9: ldc2_w -6090051151752802003
// 0cc: lload 4
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: fconst_0
// 0d5: lload 11
// 0d7: dup2_x1
// 0d8: pop2
// 0d9: invokevirtual su/catlean/fd.B (JF)V
// 0dc: lload 6
// 0de: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0e1: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 0e4: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 0e7: i2f
// 0e8: fconst_2
// 0e9: fdiv
// 0ea: fstore 26
// 0ec: ldc 5.0
// 0ee: fstore 27
// 0f0: ldc 220.0
// 0f2: fstore 28
// 0f4: ldc 16.0
// 0f6: fstore 29
// 0f8: aload 1
// 0f9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0fc: dup
// 0fd: sipush 26627
// 100: ldc2_w 5505608830045435437
// 103: lload 4
// 105: lxor
// 106: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 10e: fload 26
// 110: fload 28
// 112: fconst_2
// 113: fdiv
// 114: fsub
// 115: iload 8
// 117: i2c
// 118: swap
// 119: fload 27
// 11b: fload 28
// 11d: fload 29
// 11f: ldc 5.0
// 121: fconst_2
// 122: fconst_0
// 123: fconst_1
// 124: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 127: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 12a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 12d: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 130: fconst_0
// 131: iload 9
// 133: i2s
// 134: fconst_0
// 135: iload 10
// 137: fconst_0
// 138: sipush 32733
// 13b: ldc2_w 1577737426318355842
// 13e: lload 4
// 140: lxor
// 141: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: aconst_null
// 147: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 14a: getstatic su/catlean/tm.X Ljava/util/List;
// 14d: checkcast java/lang/Iterable
// 150: astore 30
// 152: bipush 0
// 153: istore 31
// 155: bipush 0
// 156: istore 32
// 158: aload 30
// 15a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 15f: astore 33
// 161: aload 33
// 163: invokeinterface java/util/Iterator.hasNext ()Z 1
// 168: ifeq 40d
// 16b: aload 33
// 16d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 172: astore 34
// 174: iload 32
// 176: iinc 32 1
// 179: istore 35
// 17b: iload 35
// 17d: lload 4
// 17f: lconst_0
// 180: lcmp
// 181: ifle 429
// 184: aload 25
// 186: ifnull 429
// 189: aload 25
// 18b: lload 4
// 18d: lconst_0
// 18e: lcmp
// 18f: iflt 1bb
// 192: ifnull 1b9
// 195: goto 1a3
// 198: ldc2_w -6090051151752802003
// 19b: lload 4
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: ifge 1b7
// 1a6: goto 1b4
// 1a9: ldc2_w -6090051151752802003
// 1ac: lload 4
// 1ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b3: athrow
// 1b4: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
// 1b7: iload 35
// 1b9: aload 34
// 1bb: checkcast su/catlean/gs
// 1be: astore 36
// 1c0: istore 37
// 1c2: bipush 0
// 1c3: istore 38
// 1c5: iload 37
// 1c7: aload 25
// 1c9: ifnull 217
// 1cc: tableswitch 128 0 4 47 78 95 112 118
// 1f0: ldc2_w -6090051151752802003
// 1f3: lload 4
// 1f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: athrow
// 1fb: lload 6
// 1fd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 200: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 203: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 206: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 209: goto 217
// 20c: ldc2_w -6090051151752802003
// 20f: lload 4
// 211: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: athrow
// 217: goto 24d
// 21a: lload 6
// 21c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 21f: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 222: getstatic su/catlean/s1.d Lsu/catlean/s1;
// 225: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 228: goto 24d
// 22b: lload 6
// 22d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 230: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 233: getstatic su/catlean/rl.B Lsu/catlean/rl;
// 236: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 239: goto 24d
// 23c: getstatic su/catlean/tm.O Z
// 23f: goto 24d
// 242: getstatic su/catlean/tm.R Lsu/catlean/tm;
// 245: pop
// 246: getstatic su/catlean/tm.y Z
// 249: goto 24d
// 24c: bipush 0
// 24d: istore 39
// 24f: aload 36
// 251: invokevirtual su/catlean/gs.S ()Lsu/catlean/fd;
// 254: iload 39
// 256: ifeq 268
// 259: fconst_1
// 25a: goto 269
// 25d: ldc2_w -6090051151752802003
// 260: lload 4
// 262: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 267: athrow
// 268: fconst_0
// 269: lload 11
// 26b: dup2_x1
// 26c: pop2
// 26d: invokevirtual su/catlean/fd.B (JF)V
// 270: fload 26
// 272: fload 28
// 274: fconst_2
// 275: fdiv
// 276: fsub
// 277: aload 36
// 279: invokevirtual su/catlean/gs.u ()F
// 27c: fadd
// 27d: fconst_2
// 27e: fadd
// 27f: fstore 40
// 281: iload 37
// 283: bipush 4
// 284: if_icmpne 296
// 287: fconst_1
// 288: goto 29e
// 28b: ldc2_w -6090051151752802003
// 28e: lload 4
// 290: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 295: athrow
// 296: fconst_1
// 297: getstatic su/catlean/tm.K Lsu/catlean/fd;
// 29a: invokevirtual su/catlean/fd.a ()F
// 29d: fsub
// 29e: fstore 41
// 2a0: aload 1
// 2a1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2a4: dup
// 2a5: sipush 1146
// 2a8: ldc2_w 4896980326984014422
// 2ab: lload 4
// 2ad: lxor
// 2ae: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2b6: iload 8
// 2b8: i2c
// 2b9: fload 40
// 2bb: fload 27
// 2bd: bipush 2
// 2be: i2f
// 2bf: fadd
// 2c0: ldc 40.0
// 2c2: fload 29
// 2c4: ldc 4.0
// 2c6: fsub
// 2c7: ldc 4.0
// 2c9: fconst_2
// 2ca: aload 36
// 2cc: invokevirtual su/catlean/gs.S ()Lsu/catlean/fd;
// 2cf: invokevirtual su/catlean/fd.a ()F
// 2d2: fmul
// 2d3: aload 36
// 2d5: invokevirtual su/catlean/gs.S ()Lsu/catlean/fd;
// 2d8: invokevirtual su/catlean/fd.a ()F
// 2db: ldc 5.0
// 2dd: fdiv
// 2de: fload 41
// 2e0: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2e3: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 2e6: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2e9: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 2ec: fconst_0
// 2ed: iload 9
// 2ef: i2s
// 2f0: fconst_0
// 2f1: iload 10
// 2f3: fconst_0
// 2f4: sipush 6097
// 2f7: ldc2_w 6011911091582043522
// 2fa: lload 4
// 2fc: lxor
// 2fd: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 302: aconst_null
// 303: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 306: lload 15
// 308: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 30b: aload 1
// 30c: iload 37
// 30e: lload 4
// 310: lconst_0
// 311: lcmp
// 312: ifle 341
// 315: aload 25
// 317: ifnull 341
// 31a: bipush 4
// 31b: if_icmpne 367
// 31e: goto 32c
// 321: ldc2_w -6090051151752802003
// 324: lload 4
// 326: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32b: athrow
// 32c: getstatic su/catlean/tm.R Lsu/catlean/tm;
// 32f: pop
// 330: getstatic su/catlean/tm.y Z
// 333: goto 341
// 336: ldc2_w -6090051151752802003
// 339: lload 4
// 33b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 340: athrow
// 341: lload 4
// 343: lconst_0
// 344: lcmp
// 345: ifle 34e
// 348: ifeq 367
// 34b: sipush 27627
// 34e: ldc2_w 2258089485819950551
// 351: lload 4
// 353: lxor
// 354: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 359: goto 36c
// 35c: ldc2_w -6090051151752802003
// 35f: lload 4
// 361: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 366: athrow
// 367: aload 36
// 369: invokevirtual su/catlean/gs.V ()Ljava/lang/String;
// 36c: fload 40
// 36e: ldc 20.0
// 370: fadd
// 371: fload 27
// 373: ldc 7.0
// 375: fadd
// 376: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 379: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 37c: dup
// 37d: sipush 21243
// 380: ldc2_w 6894093425759259846
// 383: lload 4
// 385: lxor
// 386: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 38e: aload 36
// 390: invokevirtual su/catlean/gs.V ()Ljava/lang/String;
// 393: sipush 8543
// 396: ldc2_w 3849903435595448190
// 399: lload 4
// 39b: lxor
// 39c: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3a4: lload 4
// 3a6: lconst_0
// 3a7: lcmp
// 3a8: ifle 3dd
// 3ab: aload 25
// 3ad: ifnull 3dd
// 3b0: ifeq 3f0
// 3b3: goto 3c1
// 3b6: ldc2_w -6090051151752802003
// 3b9: lload 4
// 3bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c0: athrow
// 3c1: lload 6
// 3c3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 3c6: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 3c9: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 3cc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 3cf: goto 3dd
// 3d2: ldc2_w -6090051151752802003
// 3d5: lload 4
// 3d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3dc: athrow
// 3dd: ifne 3f0
// 3e0: ldc 0.3
// 3e2: goto 3f2
// 3e5: ldc2_w -6090051151752802003
// 3e8: lload 4
// 3ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ef: athrow
// 3f0: fload 41
// 3f2: fstore 24
// 3f4: iload 21
// 3f6: i2c
// 3f7: iload 22
// 3f9: fload 24
// 3fb: iload 23
// 3fd: i2s
// 3fe: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 401: lload 17
// 403: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 406: nop
// 407: nop
// 408: aload 25
// 40a: ifnonnull 161
// 40d: nop
// 40e: aload 0
// 40f: aload 1
// 410: iload 2
// 411: iload 3
// 412: lload 19
// 414: fload 26
// 416: fload 27
// 418: fload 28
// 41a: fload 29
// 41c: invokespecial su/catlean/tm.R (Lnet/minecraft/class_332;IIJFFFF)V
// 41f: lload 4
// 421: lconst_0
// 422: lcmp
// 423: ifle 445
// 426: getstatic su/catlean/tm.O Z
// 429: ifeq 445
// 42c: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 42f: aload 1
// 430: iload 2
// 431: lload 13
// 433: iload 3
// 434: invokevirtual su/catlean/wv.Q (Lnet/minecraft/class_332;IJI)V
// 437: goto 445
// 43a: ldc2_w -6090051151752802003
// 43d: lload 4
// 43f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 444: athrow
// 445: return
}

private final void R(class_332 param1, int param2, int param3, long param4, float param6, float param7, float param8, float param9) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tm.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 123312018947461
// 00e: lxor
// 00f: dup2
// 010: bipush 48
// 012: lushr
// 013: l2i
// 014: istore 10
// 016: dup2
// 017: bipush 16
// 019: lshl
// 01a: bipush 48
// 01c: lushr
// 01d: l2i
// 01e: istore 11
// 020: dup2
// 021: bipush 32
// 023: lshl
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 12
// 02a: pop2
// 02b: dup2
// 02c: ldc2_w 9329083969604
// 02f: lxor
// 030: lstore 13
// 032: dup2
// 033: ldc2_w 11329671217578
// 036: lxor
// 037: lstore 15
// 039: dup2
// 03a: ldc2_w 19428241985866
// 03d: lxor
// 03e: lstore 17
// 040: dup2
// 041: ldc2_w 94880357072412
// 044: lxor
// 045: dup2
// 046: bipush 48
// 048: lushr
// 049: l2i
// 04a: istore 19
// 04c: dup2
// 04d: bipush 16
// 04f: lshl
// 050: bipush 32
// 052: lushr
// 053: l2i
// 054: istore 20
// 056: dup2
// 057: bipush 48
// 059: lshl
// 05a: bipush 48
// 05c: lushr
// 05d: l2i
// 05e: istore 21
// 060: pop2
// 061: pop2
// 062: ldc2_w 6728112002930617917
// 065: lload 4
// 067: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: aconst_null
// 06d: putstatic su/catlean/tm.C Lkotlin/jvm/functions/Function0;
// 070: astore 22
// 072: getstatic su/catlean/tm.y Z
// 075: ifeq 3b7
// 078: lload 15
// 07a: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 07d: aload 1
// 07e: getstatic su/catlean/tm.V Ljava/lang/String;
// 081: invokestatic java/lang/System.currentTimeMillis ()J
// 084: l2d
// 085: ldc2_w 1000.0
// 088: drem
// 089: ldc2_w 500.0
// 08c: dcmpl
// 08d: ifle 0ae
// 090: goto 09e
// 093: ldc2_w 6751367181699065831
// 096: lload 4
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: ldc ""
// 0a0: goto 0b0
// 0a3: ldc2_w 6751367181699065831
// 0a6: lload 4
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: ldc "_"
// 0b0: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 0b5: fload 6
// 0b7: fload 8
// 0b9: fconst_2
// 0ba: fdiv
// 0bb: fsub
// 0bc: ldc 6.0
// 0be: fadd
// 0bf: lload 17
// 0c1: dup2_x1
// 0c2: pop2
// 0c3: fload 7
// 0c5: fconst_2
// 0c6: fadd
// 0c7: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0ca: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 0cd: dup
// 0ce: sipush 11122
// 0d1: ldc2_w 8301334546600100742
// 0d4: lload 4
// 0d6: lxor
// 0d7: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0df: getstatic su/catlean/tm.K Lsu/catlean/fd;
// 0e2: invokevirtual su/catlean/fd.a ()F
// 0e5: iload 19
// 0e7: i2c
// 0e8: swap
// 0e9: iload 20
// 0eb: swap
// 0ec: iload 21
// 0ee: i2s
// 0ef: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 0f2: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 0f5: aload 0
// 0f6: lload 13
// 0f8: invokespecial su/catlean/tm.n (J)Ljava/util/Map;
// 0fb: astore 23
// 0fd: aload 23
// 0ff: invokeinterface java/util/Map.isEmpty ()Z 1
// 104: aload 22
// 106: ifnull 11b
// 109: ifne 11e
// 10c: goto 11a
// 10f: ldc2_w 6751367181699065831
// 112: lload 4
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: bipush 1
// 11b: goto 11f
// 11e: bipush 0
// 11f: ifeq 3b7
// 122: aload 1
// 123: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 126: dup
// 127: sipush 1146
// 12a: ldc2_w 4897092545844259996
// 12d: lload 4
// 12f: lxor
// 130: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 138: fload 6
// 13a: fload 8
// 13c: fconst_2
// 13d: fdiv
// 13e: fsub
// 13f: iload 10
// 141: i2c
// 142: swap
// 143: fload 7
// 145: fload 9
// 147: fadd
// 148: ldc 4.0
// 14a: fadd
// 14b: fload 8
// 14d: aload 23
// 14f: invokeinterface java/util/Map.size ()I 1
// 154: i2f
// 155: ldc 14.0
// 157: fmul
// 158: ldc 4.0
// 15a: fadd
// 15b: ldc 5.0
// 15d: fconst_2
// 15e: fconst_0
// 15f: fconst_1
// 160: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 163: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 166: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 169: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 16c: fconst_0
// 16d: iload 11
// 16f: i2s
// 170: fconst_0
// 171: iload 12
// 173: fconst_0
// 174: sipush 6097
// 177: ldc2_w 6012023310509765448
// 17a: lload 4
// 17c: lxor
// 17d: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 182: aconst_null
// 183: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 186: aload 23
// 188: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
// 18d: checkcast java/lang/Iterable
// 190: invokestatic kotlin/collections/CollectionsKt.withIndex (Ljava/lang/Iterable;)Ljava/lang/Iterable;
// 193: astore 24
// 195: bipush 0
// 196: istore 25
// 198: aload 24
// 19a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 19f: astore 26
// 1a1: aload 26
// 1a3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1a8: ifeq 3af
// 1ab: aload 26
// 1ad: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1b2: astore 27
// 1b4: aload 27
// 1b6: checkcast kotlin/collections/IndexedValue
// 1b9: astore 28
// 1bb: bipush 0
// 1bc: istore 29
// 1be: aload 28
// 1c0: invokevirtual kotlin/collections/IndexedValue.component1 ()I
// 1c3: istore 30
// 1c5: aload 28
// 1c7: invokevirtual kotlin/collections/IndexedValue.component2 ()Ljava/lang/Object;
// 1ca: checkcast java/util/Map$Entry
// 1cd: astore 31
// 1cf: aload 31
// 1d1: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
// 1d6: checkcast java/lang/String
// 1d9: astore 32
// 1db: aload 31
// 1dd: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
// 1e2: checkcast kotlin/jvm/functions/Function0
// 1e5: astore 33
// 1e7: fload 6
// 1e9: fload 8
// 1eb: fconst_2
// 1ec: fdiv
// 1ed: fsub
// 1ee: ldc 6.0
// 1f0: fadd
// 1f1: fstore 34
// 1f3: fload 7
// 1f5: fload 9
// 1f7: fadd
// 1f8: ldc 6.0
// 1fa: fadd
// 1fb: ldc 14.0
// 1fd: iload 30
// 1ff: i2f
// 200: fmul
// 201: fadd
// 202: fstore 35
// 204: fload 34
// 206: fconst_2
// 207: fsub
// 208: fstore 36
// 20a: fload 34
// 20c: fload 8
// 20e: fadd
// 20f: ldc 4.0
// 211: fsub
// 212: fstore 37
// 214: iload 2
// 215: i2f
// 216: fstore 38
// 218: aload 22
// 21a: ifnull 3b7
// 21d: fload 36
// 21f: fload 38
// 221: fcmpg
// 222: aload 22
// 224: lload 4
// 226: lconst_0
// 227: lcmp
// 228: ifle 262
// 22b: ifnull 260
// 22e: goto 23c
// 231: ldc2_w 6751367181699065831
// 234: lload 4
// 236: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23b: athrow
// 23c: ifgt 289
// 23f: goto 24d
// 242: ldc2_w 6751367181699065831
// 245: lload 4
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: fload 38
// 24f: fload 37
// 251: fcmpg
// 252: goto 260
// 255: ldc2_w 6751367181699065831
// 258: lload 4
// 25a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25f: athrow
// 260: aload 22
// 262: ifnull 286
// 265: ifgt 285
// 268: goto 276
// 26b: ldc2_w 6751367181699065831
// 26e: lload 4
// 270: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 275: athrow
// 276: bipush 1
// 277: goto 28a
// 27a: ldc2_w 6751367181699065831
// 27d: lload 4
// 27f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: athrow
// 285: bipush 0
// 286: goto 28a
// 289: bipush 0
// 28a: ifeq 36a
// 28d: fload 35
// 28f: fconst_2
// 290: fsub
// 291: fstore 36
// 293: fload 35
// 295: ldc 11.0
// 297: fadd
// 298: fstore 37
// 29a: iload 3
// 29b: i2f
// 29c: fstore 38
// 29e: fload 36
// 2a0: fload 38
// 2a2: fcmpg
// 2a3: aload 22
// 2a5: lload 4
// 2a7: lconst_0
// 2a8: lcmp
// 2a9: iflt 2d5
// 2ac: ifnull 2d3
// 2af: ifgt 2fc
// 2b2: goto 2c0
// 2b5: ldc2_w 6751367181699065831
// 2b8: lload 4
// 2ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bf: athrow
// 2c0: fload 38
// 2c2: fload 37
// 2c4: fcmpg
// 2c5: goto 2d3
// 2c8: ldc2_w 6751367181699065831
// 2cb: lload 4
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: aload 22
// 2d5: ifnull 2f9
// 2d8: ifgt 2f8
// 2db: goto 2e9
// 2de: ldc2_w 6751367181699065831
// 2e1: lload 4
// 2e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e8: athrow
// 2e9: bipush 1
// 2ea: goto 2fd
// 2ed: ldc2_w 6751367181699065831
// 2f0: lload 4
// 2f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f7: athrow
// 2f8: bipush 0
// 2f9: goto 2fd
// 2fc: bipush 0
// 2fd: ifeq 36a
// 300: aload 1
// 301: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 304: dup
// 305: sipush 1146
// 308: ldc2_w 4897092545844259996
// 30b: lload 4
// 30d: lxor
// 30e: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 313: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 316: fload 34
// 318: ldc 4.0
// 31a: fsub
// 31b: iload 10
// 31d: i2c
// 31e: swap
// 31f: fload 35
// 321: fload 8
// 323: ldc 4.0
// 325: fsub
// 326: ldc 14.0
// 328: ldc 4.0
// 32a: fconst_2
// 32b: fconst_0
// 32c: fconst_1
// 32d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 330: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 333: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 336: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 339: fconst_0
// 33a: iload 11
// 33c: i2s
// 33d: fconst_0
// 33e: iload 12
// 340: fconst_0
// 341: sipush 6097
// 344: ldc2_w 6012023310509765448
// 347: lload 4
// 349: lxor
// 34a: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34f: aconst_null
// 350: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 353: getstatic su/catlean/tm.R Lsu/catlean/tm;
// 356: pop
// 357: aload 33
// 359: putstatic su/catlean/tm.C Lkotlin/jvm/functions/Function0;
// 35c: goto 36a
// 35f: ldc2_w 6751367181699065831
// 362: lload 4
// 364: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 369: athrow
// 36a: lload 15
// 36c: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 36f: aload 1
// 370: aload 32
// 372: lload 17
// 374: fload 34
// 376: fload 35
// 378: fconst_1
// 379: fadd
// 37a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 37d: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 380: dup
// 381: sipush 11122
// 384: ldc2_w 8301334546600100742
// 387: lload 4
// 389: lxor
// 38a: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 392: getstatic su/catlean/tm.K Lsu/catlean/fd;
// 395: invokevirtual su/catlean/fd.a ()F
// 398: iload 19
// 39a: i2c
// 39b: swap
// 39c: iload 20
// 39e: swap
// 39f: iload 21
// 3a1: i2s
// 3a2: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3a5: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 3a8: nop
// 3a9: nop
// 3aa: aload 22
// 3ac: ifnonnull 1a1
// 3af: lload 4
// 3b1: lconst_0
// 3b2: lcmp
// 3b3: iflt 3b7
// 3b6: nop
// 3b7: return
}

private final Map n(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tm.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: ldc2_w 544996664102024434
// 009: lload 1
// 00a: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: new java/util/LinkedHashMap
// 012: dup
// 013: invokespecial java/util/LinkedHashMap.<init> ()V
// 016: checkcast java/util/Map
// 019: astore 4
// 01b: astore 3
// 01c: getstatic su/catlean/tm.V Ljava/lang/String;
// 01f: checkcast java/lang/CharSequence
// 022: invokeinterface java/lang/CharSequence.length ()I 1
// 027: aload 3
// 028: ifnull 03c
// 02b: ifne 03f
// 02e: goto 03b
// 031: ldc2_w 540032842584653096
// 034: lload 1
// 035: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: athrow
// 03b: bipush 1
// 03c: goto 040
// 03f: bipush 0
// 040: ifeq 050
// 043: aload 4
// 045: areturn
// 046: ldc2_w 540032842584653096
// 049: lload 1
// 04a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: athrow
// 050: aconst_null
// 051: astore 5
// 053: getstatic su/catlean/tm.V Ljava/lang/String;
// 056: ldc " "
// 058: ldc "-"
// 05a: bipush 0
// 05b: bipush 4
// 05c: aconst_null
// 05d: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 060: getstatic java/util/Locale.ROOT Ljava/util/Locale;
// 063: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
// 066: dup
// 067: sipush 26436
// 06a: ldc2_w 5693189595170280812
// 06d: lload 1
// 06e: lxor
// 06f: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 074: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 077: astore 5
// 079: aload 5
// 07b: astore 6
// 07d: bipush 0
// 07e: istore 7
// 080: aload 6
// 082: invokevirtual java/lang/String.length ()I
// 085: istore 8
// 087: iload 7
// 089: iload 8
// 08b: if_icmpge 111
// 08e: aload 6
// 090: iload 7
// 092: invokevirtual java/lang/String.charAt (I)C
// 095: istore 9
// 097: aload 3
// 098: lload 1
// 099: lconst_0
// 09a: lcmp
// 09b: ifle 10e
// 09e: ifnull 10d
// 0a1: sipush 5937
// 0a4: ldc2_w 3599901989818590484
// 0a7: lload 1
// 0a8: lxor
// 0a9: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: checkcast java/lang/CharSequence
// 0b1: iload 9
// 0b3: bipush 0
// 0b4: bipush 2
// 0b5: aconst_null
// 0b6: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
// 0b9: ifeq 10a
// 0bc: goto 0c9
// 0bf: ldc2_w 540032842584653096
// 0c2: lload 1
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: aload 5
// 0cb: iload 9
// 0cd: sipush 19232
// 0d0: ldc2_w 6722712843195529487
// 0d3: lload 1
// 0d4: lxor
// 0d5: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: sipush 928
// 0dd: ldc2_w 4268327134038913422
// 0e0: lload 1
// 0e1: lxor
// 0e2: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: checkcast java/lang/CharSequence
// 0ea: iload 9
// 0ec: bipush 0
// 0ed: bipush 0
// 0ee: sipush 10703
// 0f1: ldc2_w 1099045026154452882
// 0f4: lload 1
// 0f5: lxor
// 0f6: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: aconst_null
// 0fc: invokestatic kotlin/text/StringsKt.indexOf$default (Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
// 0ff: invokevirtual java/lang/String.charAt (I)C
// 102: bipush 0
// 103: bipush 4
// 104: aconst_null
// 105: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;
// 108: astore 5
// 10a: iinc 7 1
// 10d: aload 3
// 10e: ifnonnull 087
// 111: getstatic su/catlean/iq.a Lsu/catlean/iq;
// 114: invokevirtual su/catlean/iq.L ()Ljava/util/ArrayList;
// 117: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
// 11a: dup
// 11b: sipush 11429
// 11e: ldc2_w 7819197360671809155
// 121: lload 1
// 122: lxor
// 123: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12b: astore 6
// 12d: aload 6
// 12f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 134: ifeq 476
// 137: aload 6
// 139: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 13e: dup
// 13f: sipush 17582
// 142: ldc2_w 1805479183577953934
// 145: lload 1
// 146: lxor
// 147: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 14f: checkcast su/catlean/_g
// 152: astore 7
// 154: aload 4
// 156: aload 3
// 157: lload 1
// 158: lconst_0
// 159: lcmp
// 15a: ifle 161
// 15d: ifnull 47e
// 160: aload 3
// 161: ifnull 47e
// 164: goto 171
// 167: ldc2_w 540032842584653096
// 16a: lload 1
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: invokeinterface java/util/Map.size ()I 1
// 176: sipush 15862
// 179: ldc2_w 740032805888164769
// 17c: lload 1
// 17d: lxor
// 17e: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: if_icmpge 476
// 186: goto 193
// 189: ldc2_w 540032842584653096
// 18c: lload 1
// 18d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 192: athrow
// 193: aload 4
// 195: aload 7
// 197: invokevirtual su/catlean/_g.c ()Ljava/util/List;
// 19a: checkcast java/lang/Iterable
// 19d: astore 8
// 19f: astore 17
// 1a1: bipush 0
// 1a2: istore 9
// 1a4: aload 8
// 1a6: astore 10
// 1a8: new java/util/ArrayList
// 1ab: dup
// 1ac: invokespecial java/util/ArrayList.<init> ()V
// 1af: checkcast java/util/Collection
// 1b2: astore 11
// 1b4: bipush 0
// 1b5: istore 12
// 1b7: aload 10
// 1b9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1be: astore 13
// 1c0: aload 13
// 1c2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1c7: ifeq 26f
// 1ca: aload 13
// 1cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d1: astore 14
// 1d3: aload 14
// 1d5: checkcast su/catlean/a1
// 1d8: astore 15
// 1da: bipush 0
// 1db: istore 16
// 1dd: lload 1
// 1de: lconst_0
// 1df: lcmp
// 1e0: ifle 2ad
// 1e3: aload 15
// 1e5: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// 1e8: checkcast java/lang/CharSequence
// 1eb: aload 5
// 1ed: checkcast java/lang/CharSequence
// 1f0: bipush 0
// 1f1: bipush 2
// 1f2: aconst_null
// 1f3: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 1f6: aload 3
// 1f7: ifnull 2ab
// 1fa: aload 3
// 1fb: ifnull 25a
// 1fe: goto 20b
// 201: ldc2_w 540032842584653096
// 204: lload 1
// 205: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20a: athrow
// 20b: ifne 259
// 20e: goto 21b
// 211: ldc2_w 540032842584653096
// 214: lload 1
// 215: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21a: athrow
// 21b: aload 15
// 21d: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// 220: ldc "-"
// 222: ldc ""
// 224: bipush 0
// 225: bipush 4
// 226: aconst_null
// 227: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 22a: checkcast java/lang/CharSequence
// 22d: aload 5
// 22f: checkcast java/lang/CharSequence
// 232: bipush 0
// 233: bipush 2
// 234: aconst_null
// 235: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 238: aload 3
// 239: ifnull 25a
// 23c: goto 249
// 23f: ldc2_w 540032842584653096
// 242: lload 1
// 243: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 248: athrow
// 249: ifeq 25d
// 24c: goto 259
// 24f: ldc2_w 540032842584653096
// 252: lload 1
// 253: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 258: athrow
// 259: bipush 1
// 25a: goto 25e
// 25d: bipush 0
// 25e: ifeq 1c0
// 261: aload 11
// 263: aload 14
// 265: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 26a: pop
// 26b: aload 3
// 26c: ifnonnull 1c0
// 26f: aload 11
// 271: checkcast java/util/List
// 274: nop
// 275: aload 17
// 277: swap
// 278: checkcast java/lang/Iterable
// 27b: astore 8
// 27d: astore 17
// 27f: bipush 0
// 280: istore 9
// 282: aload 8
// 284: astore 10
// 286: new java/util/ArrayList
// 289: dup
// 28a: aload 8
// 28c: sipush 14008
// 28f: ldc2_w 7871265150596417764
// 292: lload 1
// 293: lxor
// 294: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 299: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 29c: invokespecial java/util/ArrayList.<init> (I)V
// 29f: checkcast java/util/Collection
// 2a2: astore 11
// 2a4: lload 1
// 2a5: lconst_0
// 2a6: lcmp
// 2a7: iflt 2ad
// 2aa: bipush 0
// 2ab: istore 12
// 2ad: aload 10
// 2af: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 2b4: astore 13
// 2b6: aload 13
// 2b8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 2bd: ifeq 328
// 2c0: aload 13
// 2c2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 2c7: astore 14
// 2c9: aload 11
// 2cb: aload 14
// 2cd: checkcast su/catlean/a1
// 2d0: astore 15
// 2d2: astore 18
// 2d4: bipush 0
// 2d5: istore 16
// 2d7: aload 7
// 2d9: lload 1
// 2da: lconst_0
// 2db: lcmp
// 2dc: ifle 339
// 2df: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 2e2: aload 15
// 2e4: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 2e7: sipush 24175
// 2ea: ldc2_w 1094747271685778515
// 2ed: lload 1
// 2ee: lxor
// 2ef: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f4: swap
// 2f5: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 2fa: aload 7
// 2fc: invokedynamic invoke (Lsu/catlean/_g;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/tm.X (Lsu/catlean/_g;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 301: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
// 304: aload 18
// 306: swap
// 307: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 30c: pop
// 30d: aload 3
// 30e: ifnull 337
// 311: aload 3
// 312: ifnonnull 2b6
// 315: lload 1
// 316: lconst_0
// 317: lcmp
// 318: iflt 30d
// 31b: goto 328
// 31e: ldc2_w 540032842584653096
// 321: lload 1
// 322: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 327: athrow
// 328: aload 11
// 32a: checkcast java/util/List
// 32d: nop
// 32e: aload 17
// 330: swap
// 331: checkcast java/lang/Iterable
// 334: invokestatic kotlin/collections/MapsKt.putAll (Ljava/util/Map;Ljava/lang/Iterable;)V
// 337: aload 7
// 339: invokevirtual su/catlean/_g.y ()Ljava/util/List;
// 33c: checkcast java/lang/Iterable
// 33f: astore 9
// 341: bipush 0
// 342: istore 10
// 344: aload 9
// 346: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 34b: astore 11
// 34d: aload 11
// 34f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 354: ifeq 38c
// 357: aload 11
// 359: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 35e: astore 12
// 360: aload 12
// 362: checkcast java/lang/String
// 365: astore 13
// 367: bipush 0
// 368: istore 14
// 36a: aload 13
// 36c: checkcast java/lang/CharSequence
// 36f: aload 5
// 371: checkcast java/lang/CharSequence
// 374: bipush 0
// 375: bipush 2
// 376: aconst_null
// 377: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 37a: ifeq 34d
// 37d: aload 12
// 37f: lload 1
// 380: lconst_0
// 381: lcmp
// 382: ifle 35e
// 385: aload 3
// 386: ifnull 362
// 389: goto 38d
// 38c: aconst_null
// 38d: checkcast java/lang/String
// 390: astore 8
// 392: aload 7
// 394: invokevirtual su/catlean/_g.U ()Ljava/lang/String;
// 397: aload 3
// 398: lload 1
// 399: lconst_0
// 39a: lcmp
// 39b: ifle 3cf
// 39e: ifnull 3ce
// 3a1: checkcast java/lang/CharSequence
// 3a4: aload 5
// 3a6: checkcast java/lang/CharSequence
// 3a9: bipush 0
// 3aa: bipush 2
// 3ab: aconst_null
// 3ac: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 3af: ifne 419
// 3b2: goto 3bf
// 3b5: ldc2_w 540032842584653096
// 3b8: lload 1
// 3b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3be: athrow
// 3bf: aload 8
// 3c1: goto 3ce
// 3c4: ldc2_w 540032842584653096
// 3c7: lload 1
// 3c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cd: athrow
// 3ce: aload 3
// 3cf: lload 1
// 3d0: lconst_0
// 3d1: lcmp
// 3d2: iflt 40c
// 3d5: ifnull 407
// 3d8: ifnonnull 419
// 3db: goto 3e8
// 3de: ldc2_w 540032842584653096
// 3e1: lload 1
// 3e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e7: athrow
// 3e8: aload 7
// 3ea: invokevirtual su/catlean/_g.U ()Ljava/lang/String;
// 3ed: ldc "-"
// 3ef: ldc ""
// 3f1: bipush 0
// 3f2: bipush 4
// 3f3: aconst_null
// 3f4: invokestatic kotlin/text/StringsKt.replace$default (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
// 3f7: checkcast java/lang/CharSequence
// 3fa: goto 407
// 3fd: ldc2_w 540032842584653096
// 400: lload 1
// 401: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 406: athrow
// 407: aload 5
// 409: checkcast java/lang/CharSequence
// 40c: bipush 0
// 40d: bipush 2
// 40e: aconst_null
// 40f: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 412: aload 3
// 413: ifnull 134
// 416: ifeq 12d
// 419: aload 4
// 41b: aload 8
// 41d: aload 3
// 41e: lload 1
// 41f: lconst_0
// 420: lcmp
// 421: ifle 450
// 424: ifnull 44e
// 427: ifnonnull 449
// 42a: goto 437
// 42d: ldc2_w 540032842584653096
// 430: lload 1
// 431: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 436: athrow
// 437: aload 7
// 439: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 43c: goto 465
// 43f: ldc2_w 540032842584653096
// 442: lload 1
// 443: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 448: athrow
// 449: aload 7
// 44b: invokevirtual su/catlean/_g.k ()Ljava/lang/String;
// 44e: aload 8
// 450: sipush 4752
// 453: ldc2_w 7082017342587003066
// 456: lload 1
// 457: lxor
// 458: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45d: swap
// 45e: ldc ")"
// 460: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
// 465: aload 7
// 467: invokedynamic invoke (Lsu/catlean/_g;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/tm.I (Lsu/catlean/_g;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 46c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 471: pop
// 472: aload 3
// 473: ifnonnull 12d
// 476: lload 1
// 477: lconst_0
// 478: lcmp
// 479: iflt 12d
// 47c: aload 4
// 47e: areturn
}

public final boolean H(long a, double mouseX, double mouseY, int button) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tm.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 63243700454535
// 00b: lxor
// 00c: lstore 8
// 00e: dup2
// 00f: ldc2_w 14870954295919
// 012: lxor
// 013: lstore 10
// 015: pop2
// 016: lload 8
// 018: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 01b: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 01e: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 021: i2f
// 022: fconst_2
// 023: fdiv
// 024: ldc 108.0
// 026: fsub
// 027: fstore 13
// 029: ldc2_w 1799039007908752277
// 02c: lload 1
// 02d: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 032: getstatic su/catlean/tm.X Ljava/util/List;
// 035: checkcast java/lang/Iterable
// 038: astore 14
// 03a: bipush 0
// 03b: istore 15
// 03d: aload 14
// 03f: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 044: astore 16
// 046: astore 12
// 048: aload 16
// 04a: invokeinterface java/util/Iterator.hasNext ()Z 1
// 04f: ifeq 1be
// 052: aload 16
// 054: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 059: astore 17
// 05b: aload 17
// 05d: checkcast su/catlean/gs
// 060: astore 18
// 062: bipush 0
// 063: istore 19
// 065: getstatic su/catlean/tm.R Lsu/catlean/tm;
// 068: pop
// 069: getstatic su/catlean/tm.y Z
// 06c: aload 12
// 06e: lload 1
// 06f: lconst_0
// 070: lcmp
// 071: iflt 079
// 074: ifnull 23d
// 077: aload 12
// 079: ifnull 0bb
// 07c: goto 089
// 07f: ldc2_w 1736659805888012879
// 082: lload 1
// 083: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: athrow
// 089: ifeq 0be
// 08c: goto 099
// 08f: ldc2_w 1736659805888012879
// 092: lload 1
// 093: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: athrow
// 099: aload 18
// 09b: invokevirtual su/catlean/gs.V ()Ljava/lang/String;
// 09e: sipush 12032
// 0a1: ldc2_w 5149467792585736768
// 0a4: lload 1
// 0a5: lxor
// 0a6: invokedynamic h (IJ)Ljava/lang/String; bsm=su/catlean/tm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ae: goto 0bb
// 0b1: ldc2_w 1736659805888012879
// 0b4: lload 1
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: ifeq 1b7
// 0be: fload 13
// 0c0: aload 18
// 0c2: invokevirtual su/catlean/gs.u ()F
// 0c5: fadd
// 0c6: fstore 20
// 0c8: fload 20
// 0ca: f2d
// 0cb: dload 3
// 0cc: dcmpg
// 0cd: aload 12
// 0cf: lload 1
// 0d0: lconst_0
// 0d1: lcmp
// 0d2: ifle 0ff
// 0d5: ifnull 0fd
// 0d8: ifgt 124
// 0db: goto 0e8
// 0de: ldc2_w 1736659805888012879
// 0e1: lload 1
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: dload 3
// 0e9: fload 20
// 0eb: ldc 40.0
// 0ed: fadd
// 0ee: f2d
// 0ef: dcmpg
// 0f0: goto 0fd
// 0f3: ldc2_w 1736659805888012879
// 0f6: lload 1
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: aload 12
// 0ff: ifnull 121
// 102: ifgt 120
// 105: goto 112
// 108: ldc2_w 1736659805888012879
// 10b: lload 1
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: bipush 1
// 113: goto 125
// 116: ldc2_w 1736659805888012879
// 119: lload 1
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: bipush 0
// 121: goto 125
// 124: bipush 0
// 125: lload 1
// 126: lconst_0
// 127: lcmp
// 128: iflt 134
// 12b: ifeq 1b7
// 12e: ldc2_w 7.0
// 131: dload 5
// 133: dcmpg
// 134: aload 12
// 136: lload 1
// 137: lconst_0
// 138: lcmp
// 139: iflt 171
// 13c: ifnull 16f
// 13f: goto 14c
// 142: ldc2_w 1736659805888012879
// 145: lload 1
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: ifgt 196
// 14f: goto 15c
// 152: ldc2_w 1736659805888012879
// 155: lload 1
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: dload 5
// 15e: ldc2_w 19.0
// 161: dcmpg
// 162: goto 16f
// 165: ldc2_w 1736659805888012879
// 168: lload 1
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: aload 12
// 171: ifnull 193
// 174: ifgt 192
// 177: goto 184
// 17a: ldc2_w 1736659805888012879
// 17d: lload 1
// 17e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: athrow
// 184: bipush 1
// 185: goto 197
// 188: ldc2_w 1736659805888012879
// 18b: lload 1
// 18c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 191: athrow
// 192: bipush 0
// 193: goto 197
// 196: bipush 0
// 197: lload 1
// 198: lconst_0
// 199: lcmp
// 19a: iflt 1ac
// 19d: ifeq 1b7
// 1a0: aload 18
// 1a2: invokevirtual su/catlean/gs.f ()Lkotlin/jvm/functions/Function0;
// 1a5: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 1aa: pop
// 1ab: bipush 1
// 1ac: ireturn
// 1ad: ldc2_w 1736659805888012879
// 1b0: lload 1
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: nop
// 1b8: nop
// 1b9: aload 12
// 1bb: ifnonnull 048
// 1be: nop
// 1bf: getstatic su/catlean/tm.C Lkotlin/jvm/functions/Function0;
// 1c2: lload 1
// 1c3: lconst_0
// 1c4: lcmp
// 1c5: ifle 059
// 1c8: aload 12
// 1ca: lload 1
// 1cb: lconst_0
// 1cc: lcmp
// 1cd: iflt 211
// 1d0: ifnull 20f
// 1d3: ifnonnull 1ff
// 1d6: goto 1e3
// 1d9: ldc2_w 1736659805888012879
// 1dc: lload 1
// 1dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: athrow
// 1e3: bipush 0
// 1e4: putstatic su/catlean/tm.y Z
// 1e7: lload 1
// 1e8: lconst_0
// 1e9: lcmp
// 1ea: ifle 23e
// 1ed: aload 12
// 1ef: ifnonnull 23e
// 1f2: goto 1ff
// 1f5: ldc2_w 1736659805888012879
// 1f8: lload 1
// 1f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fe: athrow
// 1ff: getstatic su/catlean/tm.C Lkotlin/jvm/functions/Function0;
// 202: goto 20f
// 205: ldc2_w 1736659805888012879
// 208: lload 1
// 209: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20e: athrow
// 20f: aload 12
// 211: ifnull 237
// 214: dup
// 215: ifnull 23b
// 218: goto 225
// 21b: ldc2_w 1736659805888012879
// 21e: lload 1
// 21f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 224: athrow
// 225: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 22a: goto 237
// 22d: ldc2_w 1736659805888012879
// 230: lload 1
// 231: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 236: athrow
// 237: pop
// 238: goto 23c
// 23b: pop
// 23c: bipush 1
// 23d: ireturn
// 23e: getstatic su/catlean/tm.O Z
// 241: aload 12
// 243: ifnull 271
// 246: ifeq 270
// 249: goto 256
// 24c: ldc2_w 1736659805888012879
// 24f: lload 1
// 250: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 255: athrow
// 256: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 259: dload 3
// 25a: lload 10
// 25c: dload 5
// 25e: iload 7
// 260: invokevirtual su/catlean/wv.R (DJDI)V
// 263: goto 270
// 266: ldc2_w 1736659805888012879
// 269: lload 1
// 26a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26f: athrow
// 270: bipush 0
// 271: ireturn
}

public final void r(long a, double mouseX, double mouseY, int button) {
ax = a ^ ax;
long var10001 = ax ^ 109375634579127L;
int var8 = (int)((ax ^ 109375634579127L) >>> 48);
int var9 = (int)((ax ^ 109375634579127L) << 16 >>> 32);
int var10 = (int)(var10001 << 48 >>> 48);

try {
if (O) {
wv.j.j((char)var8, var9, mouseX, (short)var10, mouseY, button);
}
} catch (NumberFormatException var11) {
throw vm.a<"Å">(var11, 1996706406047572451L, ax);
}
}

public final void U(long a, int keyCode, int scanCode, int modifiers) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/tm.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 53785641059489
// 00b: lxor
// 00c: lstore 6
// 00e: dup2
// 00f: ldc2_w 117530600450338
// 012: lxor
// 013: dup2
// 014: bipush 48
// 016: lushr
// 017: l2i
// 018: istore 8
// 01a: dup2
// 01b: bipush 16
// 01d: lshl
// 01e: bipush 32
// 020: lushr
// 021: l2i
// 022: istore 9
// 024: dup2
// 025: bipush 48
// 027: lshl
// 028: bipush 48
// 02a: lushr
// 02b: l2i
// 02c: istore 10
// 02e: pop2
// 02f: pop2
// 030: ldc2_w -6091055500119549926
// 033: lload 1
// 034: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 039: astore 11
// 03b: iload 3
// 03c: aload 11
// 03e: ifnull 0ce
// 041: sipush 7578
// 044: ldc2_w 6349130632541409068
// 047: lload 1
// 048: lxor
// 049: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04e: if_icmpne 0cb
// 051: goto 05e
// 054: ldc2_w -6082502872640990784
// 057: lload 1
// 058: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05d: athrow
// 05e: iload 8
// 060: i2s
// 061: iload 9
// 063: iload 10
// 065: i2c
// 066: sipush 9406
// 069: ldc2_w 8198353698446784015
// 06c: lload 1
// 06d: lxor
// 06e: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 073: invokestatic su/catlean/bx.k (SICI)Z
// 076: aload 11
// 078: lload 1
// 079: lconst_0
// 07a: lcmp
// 07b: ifle 0d0
// 07e: ifnull 0ce
// 081: goto 08e
// 084: ldc2_w -6082502872640990784
// 087: lload 1
// 088: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08d: athrow
// 08e: ifeq 0cb
// 091: goto 09e
// 094: ldc2_w -6082502872640990784
// 097: lload 1
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: getstatic su/catlean/tm.y Z
// 0a1: aload 11
// 0a3: ifnull 0c4
// 0a6: goto 0b3
// 0a9: ldc2_w -6082502872640990784
// 0ac: lload 1
// 0ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b2: athrow
// 0b3: ifne 0c7
// 0b6: goto 0c3
// 0b9: ldc2_w -6082502872640990784
// 0bc: lload 1
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: bipush 1
// 0c4: goto 0c8
// 0c7: bipush 0
// 0c8: putstatic su/catlean/tm.y Z
// 0cb: getstatic su/catlean/tm.y Z
// 0ce: aload 11
// 0d0: ifnull 12d
// 0d3: ifeq 12a
// 0d6: goto 0e3
// 0d9: ldc2_w -6082502872640990784
// 0dc: lload 1
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: iload 3
// 0e4: aload 11
// 0e6: lload 1
// 0e7: lconst_0
// 0e8: lcmp
// 0e9: ifle 12f
// 0ec: ifnull 12d
// 0ef: goto 0fc
// 0f2: ldc2_w -6082502872640990784
// 0f5: lload 1
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: sipush 1325
// 0ff: ldc2_w 7114098742052099994
// 102: lload 1
// 103: lxor
// 104: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 109: if_icmpne 12a
// 10c: goto 119
// 10f: ldc2_w -6082502872640990784
// 112: lload 1
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: bipush 0
// 11a: putstatic su/catlean/tm.y Z
// 11d: goto 12a
// 120: ldc2_w -6082502872640990784
// 123: lload 1
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: getstatic su/catlean/tm.y Z
// 12d: aload 11
// 12f: ifnull 1aa
// 132: ifeq 19a
// 135: goto 142
// 138: ldc2_w -6082502872640990784
// 13b: lload 1
// 13c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 141: athrow
// 142: iload 3
// 143: lload 1
// 144: lconst_0
// 145: lcmp
// 146: ifle 1aa
// 149: aload 11
// 14b: ifnull 1aa
// 14e: goto 15b
// 151: ldc2_w -6082502872640990784
// 154: lload 1
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: lload 1
// 15c: lconst_0
// 15d: lcmp
// 15e: ifle 19d
// 161: sipush 24781
// 164: ldc2_w 2289733728296465021
// 167: lload 1
// 168: lxor
// 169: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: if_icmpne 19a
// 171: goto 17e
// 174: ldc2_w -6082502872640990784
// 177: lload 1
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: getstatic su/catlean/tm.V Ljava/lang/String;
// 181: bipush 1
// 182: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 185: putstatic su/catlean/tm.V Ljava/lang/String;
// 188: aload 11
// 18a: ifnonnull 1c7
// 18d: goto 19a
// 190: ldc2_w -6082502872640990784
// 193: lload 1
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: getstatic su/catlean/tm.O Z
// 19d: goto 1aa
// 1a0: ldc2_w -6082502872640990784
// 1a3: lload 1
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: ifeq 1c7
// 1ad: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 1b0: lload 6
// 1b2: iload 3
// 1b3: iload 4
// 1b5: iload 5
// 1b7: invokevirtual su/catlean/wv.A (JIII)V
// 1ba: goto 1c7
// 1bd: ldc2_w -6082502872640990784
// 1c0: lload 1
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: return
}

public final void D(char chr, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/tm.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: lload 2
// 07: dup2
// 08: ldc2_w 91984782477045
// 0b: lxor
// 0c: lstore 4
// 0e: pop2
// 0f: ldc2_w -6849363020876590192
// 12: lload 2
// 13: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18: astore 6
// 1a: getstatic su/catlean/tm.y Z
// 1d: aload 6
// 1f: ifnull a1
// 22: ifeq 91
// 25: goto 32
// 28: ldc2_w -6909491556971193782
// 2b: lload 2
// 2c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: athrow
// 32: getstatic su/catlean/tm.V Ljava/lang/String;
// 35: invokevirtual java/lang/String.length ()I
// 38: lload 2
// 39: lconst_0
// 3a: lcmp
// 3b: iflt a1
// 3e: aload 6
// 40: ifnull a1
// 43: goto 50
// 46: ldc2_w -6909491556971193782
// 49: lload 2
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: lload 2
// 51: lconst_0
// 52: lcmp
// 53: ifle 94
// 56: sipush 22511
// 59: ldc2_w 4336126893913231062
// 5c: lload 2
// 5d: lxor
// 5e: invokedynamic l (IJ)I bsm=su/catlean/tm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: if_icmpge 91
// 66: goto 73
// 69: ldc2_w -6909491556971193782
// 6c: lload 2
// 6d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 72: athrow
// 73: getstatic su/catlean/tm.V Ljava/lang/String;
// 76: iload 1
// 77: invokedynamic makeConcatWithConstants (Ljava/lang/String;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 7c: putstatic su/catlean/tm.V Ljava/lang/String;
// 7f: aload 6
// 81: ifnonnull ba
// 84: goto 91
// 87: ldc2_w -6909491556971193782
// 8a: lload 2
// 8b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90: athrow
// 91: getstatic su/catlean/tm.O Z
// 94: goto a1
// 97: ldc2_w -6909491556971193782
// 9a: lload 2
// 9b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a0: athrow
// a1: ifeq ba
// a4: getstatic su/catlean/wv.j Lsu/catlean/wv;
// a7: lload 4
// a9: iload 1
// aa: invokevirtual su/catlean/wv.Y (JC)V
// ad: goto ba
// b0: ldc2_w -6909491556971193782
// b3: lload 2
// b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b9: athrow
// ba: return
}

public final boolean b(double mX, double mY, long a, double amount) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/tm.a J
// 03: lload 5
// 05: lxor
// 06: lstore 5
// 08: lload 5
// 0a: dup2
// 0b: ldc2_w 9852397590542
// 0e: lxor
// 0f: dup2
// 10: bipush 48
// 12: lushr
// 13: l2i
// 14: istore 9
// 16: dup2
// 17: bipush 16
// 19: lshl
// 1a: bipush 16
// 1c: lushr
// 1d: lstore 10
// 1f: pop2
// 20: pop2
// 21: ldc2_w 5996563942005645402
// 24: lload 5
// 26: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b: astore 12
// 2d: getstatic su/catlean/tm.O Z
// 30: aload 12
// 32: ifnull 62
// 35: ifeq 61
// 38: goto 46
// 3b: ldc2_w 6041211337201559936
// 3e: lload 5
// 40: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: athrow
// 46: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 49: iload 9
// 4b: i2s
// 4c: dload 1
// 4d: lload 10
// 4f: dload 3
// 50: dload 7
// 52: invokevirtual su/catlean/wv.m (SDJDD)Z
// 55: ireturn
// 56: ldc2_w 6041211337201559936
// 59: lload 5
// 5b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60: athrow
// 61: bipush 0
// 62: ireturn
}

private static final Unit V() {
long var0 = a ^ 29063477586656L;
long var2 = var0 ^ 59852214705442L;
zf.F(var2).method_1507(fi.C);
return Unit.INSTANCE;
}

private static final Unit N() {
long var0 = a ^ 90315110540461L;
long var2 = var0 ^ 138699856286575L;
zf.F(var2).method_1507(s1.d);
return Unit.INSTANCE;
}

private static final Unit M() {
long var0 = a ^ 48865673056771L;
long var2 = var0 ^ 484772111809L;
zf.F(var2).method_1507(rl.B);
return Unit.INSTANCE;
}

private static final Unit R() {
long var0 = a ^ 80188287919191L;
String var2 = vm.a<"Å">(-8078009568373736313L, var0);

boolean var10000;
label22: {
label21: {
try {
var10000 = O;
if (var2 == null) {
break label22;
}

if (!O) {
break label21;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, -8139262855401704099L, var0);
}

var10000 = false;
break label22;
}

var10000 = true;
}

O = var10000;
return Unit.INSTANCE;
}

private static final Unit D() {
long var0 = a ^ 105603282939339L;
String var2 = vm.a<"Å">(-8756952619552836325L, var0);

boolean var10000;
label22: {
label21: {
try {
var10000 = y;
if (var2 == null) {
break label22;
}

if (!y) {
break label21;
}
} catch (NumberFormatException var3) {
throw vm.a<"Å">(var3, -8748330875327873855L, var0);
}

var10000 = false;
break label22;
}

var10000 = true;
}

y = var10000;
V = "";
return Unit.INSTANCE;
}

private static final Unit X(_g var0) {
long var1 = a ^ 57943507964401L;
long var3 = var1 ^ 39600109771454L;
fi.C.d(var0, var3);
return Unit.INSTANCE;
}

private static final Unit I(_g var0) {
long var1 = a ^ 70426412418810L;
long var3 = var1 ^ 128757959000239L;
fi.C.x(var0, var3);
return Unit.INSTANCE;
}

static {
long var27 = a ^ 125124238212079L;
long var29 = var27 ^ 64666479424160L;
long var31 = var27 ^ 80747520787009L;
vm.a<"Å">("gogdhb", 5781914666684958106L, var27);
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[22];
int var23 = 0;
String var22 = "^SÚÕJzGDÜöÌ\u0087¬õ¼Õ\u0017RÜÒ«\u0087\u0011'êé/O\u0017\u008e\\´L³Z¾+ \u0091|\u0018u\u0019ñÈÍ÷\u0011\u0006å\u0092¾s\u0005íOëFý\u00914² \u00adÒ\u0010ÎuáUU_@\u000f\u008a7 0J\u0097Ø\u0000\u0018\u008a\u0017/Éfé\u00adô\f\n\u0019\u0090³\u0014æË\u009c\u0095hÁMeëõ\u0010ùé\nIX¶CÃD rÐw8@ápÊæ\u0094±C17\u0080\u0088\u0017Ç4MM¡8Ov6\u000fÏ\u008aû\u008aìì3\u007fHWEã ûÖq\u000exG\"{\u001dk§É\rÏ>Ôï_\u0092R\u008aªq\u000e0\u0005\u0015(*Ñ\u0088·eNO\u0012Ï(ãØ®\t¼SJrAÖ(\u00adÍÁ&Æ§*-ïQN\u0018c¡`\r\n+zqÞ\u0083Íþ<ãÂùñ¦hÌo!'±å@\u0019·Izq³¡1\u0094i\u001eÑ\u001a\u0083bd\u000fÝQ\u0001µËÐõtÅ\u0007^ÑÃðN\u0092{\u001f\u0092²ë7\u0003aÓ#\u0086\u00969\u0000³äc[DS¼-\u001e\u00ad¢}R\u001dçW]\u001aÐ\u0012L¡å[åÈ²\u008f~\u0096¾|N *¥[7\u001aÆ\u00adÕ\u0095âøÁ\u0017ì^mH\n\u0013\u0019\u0010`Í'\u000b\u0011\u0000D\u0004,4á\u0018é\u008e°+Ú\u0089¶)\u0016âmGä«Ï\u0098{\u000f\u0015¸ÖÜÍ\u008dhÚ¡\r¤\u0087ýf\u0095itá·\u000f\u0007s¿ç¼dY!HºË$n±¯lâ\u0090 Rzº\u008bC\u009dÄÕ\u0005Ü0u^Át\u009fq¥¡aJR9ñö\"ÊQfs\u0091\u0007\u0010\u009d\u0095sç}\n\u0018\u001bå¬Míà\u001e\b3@Í,\u000bÅN\u000eêCkÆX-«\u0091\u0002Me\u009e1Ê\u0099oKp»£$pç\u007fi\u0084\u0019\u0087\u0086_\u00180\u0017á\u0011Z\u009fhK\u009a¡â\nhm\u0007ëå¯\u001dx\u0083àãçhË\u0007\u00105ñ\u0087áPf\u0002\u0003é}¯ÆcVx\u001e\u0010\u0099x'L\u0000\u0085ê\u0094Ë \u0005Ù\u0003!&åx\u0010|ÝsM\u0018E')þ\u001cfé^¤Ç\u0003\u009ar¨ ÷\u000f4s\u0014\u009a\u000b4¼A¿ËÜrXÜ\u0091ä<O\u0000\u0001À\u0014¨\u0001)qh7\u008c±Ä\u0014¢ß\u0098\u0015ð\u007f·\u009f\u0019\u0011_à\u0083\u009f79¦mÝ2\u0093ûÌ\u001dQYÕ9ú\u0087{³\u0095\u0000\r©{Í \u008c÷ª\u001de\u009aC\u00871\u0081Ì{µÖ÷Ò\b%`E\u0018È\u008cèßã\u001851Í\u0086\u0004óC*;R¾º\t¿ßù\u001c\u001f\f\u009d´\u000e÷@\u0010\u009c\u0014/½>ÓKÊ\u001cçeÖ_¶C|\u0010\u001c\u000bF\u0089oE2jgCZoLL×\u009d\u0010\u0087<ê,â\u0013\u0080\u0018Æ\u0088Ì\u0000ñ\u0083§Í\u0010(Ïê.\u0010¥ç\u0005\u0000h\u0088\n¿B\u001eâ\u0010\u0017À(nB\u001eýVM[\u0019E\u0092ì\u0012ï";
int var24 = "^SÚÕJzGDÜöÌ\u0087¬õ¼Õ\u0017RÜÒ«\u0087\u0011'êé/O\u0017\u008e\\´L³Z¾+ \u0091|\u0018u\u0019ñÈÍ÷\u0011\u0006å\u0092¾s\u0005íOëFý\u00914² \u00adÒ\u0010ÎuáUU_@\u000f\u008a7 0J\u0097Ø\u0000\u0018\u008a\u0017/Éfé\u00adô\f\n\u0019\u0090³\u0014æË\u009c\u0095hÁMeëõ\u0010ùé\nIX¶CÃD rÐw8@ápÊæ\u0094±C17\u0080\u0088\u0017Ç4MM¡8Ov6\u000fÏ\u008aû\u008aìì3\u007fHWEã ûÖq\u000exG\"{\u001dk§É\rÏ>Ôï_\u0092R\u008aªq\u000e0\u0005\u0015(*Ñ\u0088·eNO\u0012Ï(ãØ®\t¼SJrAÖ(\u00adÍÁ&Æ§*-ïQN\u0018c¡`\r\n+zqÞ\u0083Íþ<ãÂùñ¦hÌo!'±å@\u0019·Izq³¡1\u0094i\u001eÑ\u001a\u0083bd\u000fÝQ\u0001µËÐõtÅ\u0007^ÑÃðN\u0092{\u001f\u0092²ë7\u0003aÓ#\u0086\u00969\u0000³äc[DS¼-\u001e\u00ad¢}R\u001dçW]\u001aÐ\u0012L¡å[åÈ²\u008f~\u0096¾|N *¥[7\u001aÆ\u00adÕ\u0095âøÁ\u0017ì^mH\n\u0013\u0019\u0010`Í'\u000b\u0011\u0000D\u0004,4á\u0018é\u008e°+Ú\u0089¶)\u0016âmGä«Ï\u0098{\u000f\u0015¸ÖÜÍ\u008dhÚ¡\r¤\u0087ýf\u0095itá·\u000f\u0007s¿ç¼dY!HºË$n±¯lâ\u0090 Rzº\u008bC\u009dÄÕ\u0005Ü0u^Át\u009fq¥¡aJR9ñö\"ÊQfs\u0091\u0007\u0010\u009d\u0095sç}\n\u0018\u001bå¬Míà\u001e\b3@Í,\u000bÅN\u000eêCkÆX-«\u0091\u0002Me\u009e1Ê\u0099oKp»£$pç\u007fi\u0084\u0019\u0087\u0086_\u00180\u0017á\u0011Z\u009fhK\u009a¡â\nhm\u0007ëå¯\u001dx\u0083àãçhË\u0007\u00105ñ\u0087áPf\u0002\u0003é}¯ÆcVx\u001e\u0010\u0099x'L\u0000\u0085ê\u0094Ë \u0005Ù\u0003!&åx\u0010|ÝsM\u0018E')þ\u001cfé^¤Ç\u0003\u009ar¨ ÷\u000f4s\u0014\u009a\u000b4¼A¿ËÜrXÜ\u0091ä<O\u0000\u0001À\u0014¨\u0001)qh7\u008c±Ä\u0014¢ß\u0098\u0015ð\u007f·\u009f\u0019\u0011_à\u0083\u009f79¦mÝ2\u0093ûÌ\u001dQYÕ9ú\u0087{³\u0095\u0000\r©{Í \u008c÷ª\u001de\u009aC\u00871\u0081Ì{µÖ÷Ò\b%`E\u0018È\u008cèßã\u001851Í\u0086\u0004óC*;R¾º\t¿ßù\u001c\u001f\f\u009d´\u000e÷@\u0010\u009c\u0014/½>ÓKÊ\u001cçeÖ_¶C|\u0010\u001c\u000bF\u0089oE2jgCZoLL×\u009d\u0010\u0087<ê,â\u0013\u0080\u0018Æ\u0088Ì\u0000ñ\u0083§Í\u0010(Ïê.\u0010¥ç\u0005\u0000h\u0088\n¿B\u001eâ\u0010\u0017À(nB\u001eýVM[\u0019E\u0092ì\u0012ï"
.length();
char var21 = '(';
int var36 = -1;

label64:
while (true) {
String var37 = var22.substring(++var36, var36 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var37.getBytes("ISO-8859-1"));
String var50 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var50;
if ((var36 += var21) >= var24) {
b = var25;
c = new String[22];
m = a<"h">(13742, 4751105519336427598L ^ var27);
k = a<"h">(18135, 1604751736612905784L ^ var27);
g = new HashMap(13);
Cipher var7;
var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var27 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var13 = new long[10];
int var10 = 0;
String var11 = "üãw\\J}n\u0086¾\u0004¶\tnEù\u008b©È\u0090ßö\u000emÄX\u0098á\u0016\u009c5ñ\u0080TâÜ±ãPâ²nPÕm\u0001\u0006ãÛBä\u0012\u001e\u001ex´\u0080L\u008c\u009b;¤ÙÑ\u00ad";
int var12 = "üãw\\J}n\u0086¾\u0004¶\tnEù\u008b©È\u0090ßö\u000emÄX\u0098á\u0016\u009c5ñ\u0080TâÜ±ãPâ²nPÕm\u0001\u0006ãÛBä\u0012\u001e\u001ex´\u0080L\u008c\u009b;¤ÙÑ\u00ad"
.length();
byte var9 = 0;

label46:
while (true) {
var10001 = var9;
var9 += 8;
byte[] var14 = var11.substring(var10001, var9).getBytes("ISO-8859-1");
long[] var40 = var13;
var10001 = var10++;
long var54 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var59 = -1;

while (true) {
long var15 = var54;
byte[] var17 = var7.doFinal(
new byte[]{
(byte)(var15 >>> 56),
(byte)(var15 >>> 48),
(byte)(var15 >>> 40),
(byte)(var15 >>> 32),
(byte)(var15 >>> 24),
(byte)(var15 >>> 16),
(byte)(var15 >>> 8),
(byte)var15
}
);
long var62 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var59) {
case 0:
var40[var10001] = var62;
if (var9 >= var12) {
e = var13;
f = new Integer[10];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -4776528872848550060L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var57 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var48 = -1;
long var0 = var57;
R = new tm();
K = new fd(_s.OUT_EXPO, var0, var29);
V = "";
gs[] var33 = new gs[]{
new gs(0.0F, a<"h">(765, 9112272089472050963L ^ var27), null, tm::V, 4, null, var31),
new gs(44.0F, a<"h">(1653, 784560947550528389L ^ var27), null, tm::N, 4, null, var31),
new gs(88.0F, a<"h">(15823, 8688093627927992355L ^ var27), null, tm::M, 4, null, var31),
new gs(132.0F, a<"h">(23009, 8741156644711267328L ^ var27), null, tm::R, 4, null, var31),
new gs(176.0F, a<"h">(8543, 3849995853195904182L ^ var27), null, tm::D, 4, null, var31)
};
X = CollectionsKt.mutableListOf(var33);
n = (gs)X.get(0);
w = n;
return;
}
break;
default:
var40[var10001] = var62;
if (var9 < var12) {
continue label46;
}

var11 = "\u0091è!\t\u0091Ñ\u00844\u009eWK\u00ad8q\u0005Ì";
var12 = "\u0091è!\t\u0091Ñ\u00844\u009eWK\u00ad8q\u0005Ì".length();
var9 = 0;
}

byte var47 = var9;
var9 += 8;
var14 = var11.substring(var47, var9).getBytes("ISO-8859-1");
var40 = var13;
var10001 = var10++;
var54 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var59 = 0;
}
}
}

var21 = var22.charAt(var36);
break;
default:
var25[var23++] = var50;
if ((var36 += var21) < var24) {
var21 = var22.charAt(var36);
continue label64;
}

var22 = "ÞE\u0006\u0089\u008c\u0018îyÜ\u0017àÙä/«¥\u0010dMÐ\u0018´\u008c\u001e{p¼QéÍ\u008eIB";
var24 = "ÞE\u0006\u0089\u008c\u0018îyÜ\u0017àÙä/«¥\u0010dMÐ\u0018´\u008c\u001e{p¼QéÍ\u008eIB".length();
var21 = 16;
var36 = -1;
}

var37 = var22.substring(++var36, var36 + var21);
var10001 = 0;
}
}
}

public static void i(String var0) {
Q = var0;
}

public static String E() {
return Q;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 29825;
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
throw new RuntimeException("su/catlean/tm", var10);
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
throw new RuntimeException("su/catlean/tm" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 14582;
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
throw new RuntimeException("su/catlean/tm", var14);
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
throw new RuntimeException("su/catlean/tm" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
