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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class db extends dj {
@NotNull
private final List m;
@NotNull
private final Function1 L;
@NotNull
private final Function1 R;
@Nullable
private String A;
private boolean i;
@NotNull
private String V;
private boolean C;
private boolean K;
private static final long a = yz.a(-5344454639855695446L, -8233699189029107586L, MethodHandles.lookup().lookupClass()).a(21027743833956L);
private static final String[] c;
private static final String[] d;
private static final Map g = new HashMap(13);
private static final long[] k;
private static final Integer[] n;
private static final Map o;
private static final long p;

public db(long a, @NotNull List list, @NotNull Function1 clickAction, @NotNull Function1 clickRemoveAction) {
ax = a ^ ax;
long var6 = ax ^ 60547057963050L;
Intrinsics.checkNotNullParameter(list, b<"m">(26959, 3222001609193818859L ^ ax));
Intrinsics.checkNotNullParameter(clickAction, b<"m">(11098, 3159184074768861432L ^ ax));
Intrinsics.checkNotNullParameter(clickRemoveAction, b<"m">(11248, 8389189407938758741L ^ ax));
super(var6);
this.m = list;
this.L = clickAction;
this.R = clickRemoveAction;
this.V = "";
}

@NotNull
public final List g() {
return this.m;
}

@NotNull
public final Function1 x() {
return this.L;
}

@NotNull
public final Function1 Y() {
return this.R;
}

@Override
public void B(@NotNull class_332 context, long a, int mouseX, int mouseY) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 2
// 001: dup2
// 002: ldc2_w 49135606458366
// 005: lxor
// 006: lstore 6
// 008: dup2
// 009: ldc2_w 85446347042374
// 00c: lxor
// 00d: lstore 8
// 00f: dup2
// 010: ldc2_w 31386901146457
// 013: lxor
// 014: lstore 10
// 016: dup2
// 017: ldc2_w 21275552979796
// 01a: lxor
// 01b: dup2
// 01c: bipush 48
// 01e: lushr
// 01f: l2i
// 020: istore 12
// 022: dup2
// 023: bipush 16
// 025: lshl
// 026: bipush 48
// 028: lushr
// 029: l2i
// 02a: istore 13
// 02c: dup2
// 02d: bipush 32
// 02f: lshl
// 030: bipush 32
// 032: lushr
// 033: l2i
// 034: istore 14
// 036: pop2
// 037: dup2
// 038: ldc2_w 42294086766012
// 03b: lxor
// 03c: lstore 15
// 03e: dup2
// 03f: ldc2_w 140651307937406
// 042: lxor
// 043: lstore 17
// 045: dup2
// 046: ldc2_w 126255758620571
// 049: lxor
// 04a: lstore 19
// 04c: dup2
// 04d: ldc2_w 83711771966610
// 050: lxor
// 051: lstore 21
// 053: dup2
// 054: ldc2_w 119233142815521
// 057: lxor
// 058: lstore 23
// 05a: dup2
// 05b: ldc2_w 6487619135641
// 05e: lxor
// 05f: lstore 25
// 061: dup2
// 062: ldc2_w 59344335851203
// 065: lxor
// 066: lstore 27
// 068: dup2
// 069: ldc2_w 58498614843597
// 06c: lxor
// 06d: dup2
// 06e: bipush 48
// 070: lushr
// 071: l2i
// 072: istore 29
// 074: dup2
// 075: bipush 16
// 077: lshl
// 078: bipush 32
// 07a: lushr
// 07b: l2i
// 07c: istore 30
// 07e: dup2
// 07f: bipush 48
// 081: lshl
// 082: bipush 48
// 084: lushr
// 085: l2i
// 086: istore 31
// 088: pop2
// 089: pop2
// 08a: ldc2_w -4942844427427670684
// 08d: lload 2
// 08e: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: aload 1
// 094: sipush 6648
// 097: ldc2_w 2793437762099273191
// 09a: lload 2
// 09b: lxor
// 09c: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0a4: lload 6
// 0a6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0a9: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 0ac: invokevirtual net/minecraft/class_1041.method_4486 ()I
// 0af: i2f
// 0b0: fconst_2
// 0b1: fdiv
// 0b2: aload 0
// 0b3: invokevirtual su/catlean/db.l ()F
// 0b6: fconst_2
// 0b7: fdiv
// 0b8: fsub
// 0b9: fstore 43
// 0bb: istore 42
// 0bd: lload 6
// 0bf: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c2: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 0c5: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 0c8: i2f
// 0c9: fconst_2
// 0ca: fdiv
// 0cb: aload 0
// 0cc: invokevirtual su/catlean/db.p ()F
// 0cf: fconst_2
// 0d0: fdiv
// 0d1: fsub
// 0d2: ldc 50.0
// 0d4: fsub
// 0d5: fstore 44
// 0d7: aload 0
// 0d8: fload 43
// 0da: aload 0
// 0db: invokevirtual su/catlean/db.l ()F
// 0de: fadd
// 0df: ldc 25.0
// 0e1: fsub
// 0e2: fstore 45
// 0e4: fload 43
// 0e6: aload 0
// 0e7: invokevirtual su/catlean/db.l ()F
// 0ea: fadd
// 0eb: bipush 5
// 0ec: i2f
// 0ed: fsub
// 0ee: fstore 46
// 0f0: iload 4
// 0f2: i2f
// 0f3: fstore 47
// 0f5: fload 45
// 0f7: fload 47
// 0f9: fcmpg
// 0fa: iload 42
// 0fc: ifne 121
// 0ff: ifgt 148
// 102: goto 10f
// 105: ldc2_w -5018967295239959075
// 108: lload 2
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: fload 47
// 111: fload 46
// 113: fcmpg
// 114: goto 121
// 117: ldc2_w -5018967295239959075
// 11a: lload 2
// 11b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 120: athrow
// 121: iload 42
// 123: ifne 145
// 126: ifgt 144
// 129: goto 136
// 12c: ldc2_w -5018967295239959075
// 12f: lload 2
// 130: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 135: athrow
// 136: bipush 1
// 137: goto 149
// 13a: ldc2_w -5018967295239959075
// 13d: lload 2
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: bipush 0
// 145: goto 149
// 148: bipush 0
// 149: ifeq 1d0
// 14c: fload 44
// 14e: ldc 28.0
// 150: fadd
// 151: fstore 45
// 153: fload 44
// 155: ldc 48.0
// 157: fadd
// 158: fstore 46
// 15a: iload 5
// 15c: i2f
// 15d: fstore 47
// 15f: fload 45
// 161: fload 47
// 163: fcmpg
// 164: iload 42
// 166: lload 2
// 167: lconst_0
// 168: lcmp
// 169: ifle 193
// 16c: ifne 191
// 16f: ifgt 1b8
// 172: goto 17f
// 175: ldc2_w -5018967295239959075
// 178: lload 2
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: fload 47
// 181: fload 46
// 183: fcmpg
// 184: goto 191
// 187: ldc2_w -5018967295239959075
// 18a: lload 2
// 18b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 190: athrow
// 191: iload 42
// 193: ifne 1b5
// 196: ifgt 1b4
// 199: goto 1a6
// 19c: ldc2_w -5018967295239959075
// 19f: lload 2
// 1a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a5: athrow
// 1a6: bipush 1
// 1a7: goto 1b9
// 1aa: ldc2_w -5018967295239959075
// 1ad: lload 2
// 1ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b3: athrow
// 1b4: bipush 0
// 1b5: goto 1b9
// 1b8: bipush 0
// 1b9: lload 2
// 1ba: lconst_0
// 1bb: lcmp
// 1bc: ifle 1c3
// 1bf: ifeq 1d0
// 1c2: bipush 1
// 1c3: goto 1d1
// 1c6: ldc2_w -5018967295239959075
// 1c9: lload 2
// 1ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cf: athrow
// 1d0: bipush 0
// 1d1: putfield su/catlean/db.C Z
// 1d4: lload 10
// 1d6: invokestatic su/catlean/b8.v (J)Lsu/catlean/c6;
// 1d9: lload 15
// 1db: aload 1
// 1dc: sipush 11525
// 1df: ldc2_w 7101025015973898521
// 1e2: lload 2
// 1e3: lxor
// 1e4: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e9: fload 43
// 1eb: aload 0
// 1ec: invokevirtual su/catlean/db.l ()F
// 1ef: fconst_2
// 1f0: fdiv
// 1f1: fadd
// 1f2: fload 44
// 1f4: bipush 3
// 1f5: i2f
// 1f6: fadd
// 1f7: sipush 15533
// 1fa: ldc2_w 8026283254415468965
// 1fd: lload 2
// 1fe: lxor
// 1ff: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: invokevirtual su/catlean/c6.g (JLnet/minecraft/class_332;Ljava/lang/String;FFI)V
// 207: aload 1
// 208: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 20b: dup
// 20c: sipush 11636
// 20f: ldc2_w 769955572087810400
// 212: lload 2
// 213: lxor
// 214: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 21c: fload 43
// 21e: ldc 5.0
// 220: fadd
// 221: iload 12
// 223: i2c
// 224: swap
// 225: fload 44
// 227: ldc 28.0
// 229: fadd
// 22a: aload 0
// 22b: invokevirtual su/catlean/db.l ()F
// 22e: ldc 33.0
// 230: fsub
// 231: ldc 20.0
// 233: ldc 4.0
// 235: fconst_0
// 236: ldc 0.1
// 238: fconst_1
// 239: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 23c: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 23f: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 242: dup
// 243: sipush 16569
// 246: ldc2_w 4432837395778798754
// 249: lload 2
// 24a: lxor
// 24b: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 253: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 256: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 259: fconst_0
// 25a: iload 13
// 25c: i2s
// 25d: fconst_0
// 25e: iload 14
// 260: fconst_0
// 261: sipush 20636
// 264: ldc2_w 8660471465963767187
// 267: lload 2
// 268: lxor
// 269: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: aconst_null
// 26f: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 272: aload 1
// 273: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 276: dup
// 277: sipush 18980
// 27a: ldc2_w 4600300875595910713
// 27d: lload 2
// 27e: lxor
// 27f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 284: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 287: fload 43
// 289: aload 0
// 28a: invokevirtual su/catlean/db.l ()F
// 28d: fadd
// 28e: ldc 24.5
// 290: fsub
// 291: iload 12
// 293: i2c
// 294: swap
// 295: fload 44
// 297: ldc 28.0
// 299: fadd
// 29a: ldc 20.5
// 29c: ldc 20.0
// 29e: ldc 4.0
// 2a0: fconst_0
// 2a1: ldc 0.1
// 2a3: fconst_1
// 2a4: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2a7: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 2aa: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 2ad: dup
// 2ae: sipush 2843
// 2b1: ldc2_w 4591873735260458766
// 2b4: lload 2
// 2b5: lxor
// 2b6: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2be: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2c1: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 2c4: fconst_0
// 2c5: iload 13
// 2c7: i2s
// 2c8: fconst_0
// 2c9: iload 14
// 2cb: fconst_0
// 2cc: sipush 10111
// 2cf: ldc2_w 5951430426810561145
// 2d2: lload 2
// 2d3: lxor
// 2d4: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d9: aconst_null
// 2da: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 2dd: lload 10
// 2df: invokestatic su/catlean/b8.v (J)Lsu/catlean/c6;
// 2e2: aload 1
// 2e3: ldc "+"
// 2e5: fload 43
// 2e7: aload 0
// 2e8: invokevirtual su/catlean/db.l ()F
// 2eb: fadd
// 2ec: ldc 15.0
// 2ee: fsub
// 2ef: fload 44
// 2f1: ldc 35.5
// 2f3: fadd
// 2f4: aload 0
// 2f5: getfield su/catlean/db.C Z
// 2f8: ifeq 30e
// 2fb: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2fe: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 301: goto 314
// 304: ldc2_w -5018967295239959075
// 307: lload 2
// 308: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30d: athrow
// 30e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 311: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 314: lload 23
// 316: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 319: lload 10
// 31b: invokestatic su/catlean/b8.v (J)Lsu/catlean/c6;
// 31e: aload 1
// 31f: aload 0
// 320: lload 2
// 321: lconst_0
// 322: lcmp
// 323: iflt 352
// 326: iload 42
// 328: ifne 352
// 32b: getfield su/catlean/db.i Z
// 32e: lload 2
// 32f: lconst_0
// 330: lcmp
// 331: ifle 38a
// 334: ifeq 387
// 337: goto 344
// 33a: ldc2_w -5018967295239959075
// 33d: lload 2
// 33e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 343: athrow
// 344: aload 0
// 345: goto 352
// 348: ldc2_w -5018967295239959075
// 34b: lload 2
// 34c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 351: athrow
// 352: getfield su/catlean/db.V Ljava/lang/String;
// 355: invokestatic su/catlean/zf.A ()J
// 358: sipush 20387
// 35b: ldc2_w 351956159632693933
// 35e: lload 2
// 35f: lxor
// 360: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 365: i2l
// 366: lrem
// 367: getstatic su/catlean/db.p J
// 36a: lcmp
// 36b: ifle 37d
// 36e: ldc "_"
// 370: goto 37f
// 373: ldc2_w -5018967295239959075
// 376: lload 2
// 377: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37c: athrow
// 37d: ldc ""
// 37f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 384: goto 394
// 387: sipush 31706
// 38a: ldc2_w 5399386125816348618
// 38d: lload 2
// 38e: lxor
// 38f: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 394: fload 43
// 396: ldc 7.0
// 398: fadd
// 399: fload 44
// 39b: sipush 29786
// 39e: ldc2_w 4422295569699529047
// 3a1: lload 2
// 3a2: lxor
// 3a3: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: i2f
// 3a9: fadd
// 3aa: aload 0
// 3ab: getfield su/catlean/db.i Z
// 3ae: ifeq 3c4
// 3b1: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3b4: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 3b7: goto 3ca
// 3ba: ldc2_w -5018967295239959075
// 3bd: lload 2
// 3be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c3: athrow
// 3c4: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 3c7: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 3ca: astore 32
// 3cc: fstore 33
// 3ce: fstore 34
// 3d0: lload 19
// 3d2: fload 34
// 3d4: fload 33
// 3d6: aload 32
// 3d8: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 3db: aload 1
// 3dc: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 3df: dup
// 3e0: sipush 18980
// 3e3: ldc2_w 4600300875595910713
// 3e6: lload 2
// 3e7: lxor
// 3e8: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ed: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3f0: fload 43
// 3f2: ldc 4.0
// 3f4: fadd
// 3f5: iload 12
// 3f7: i2c
// 3f8: swap
// 3f9: fload 44
// 3fb: ldc 53.0
// 3fd: fadd
// 3fe: aload 0
// 3ff: invokevirtual su/catlean/db.l ()F
// 402: ldc 8.0
// 404: fsub
// 405: aload 0
// 406: invokevirtual su/catlean/db.p ()F
// 409: ldc 57.0
// 40b: fsub
// 40c: ldc 4.0
// 40e: fconst_2
// 40f: ldc 0.1
// 411: fconst_1
// 412: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 415: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 418: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
// 41b: dup
// 41c: sipush 2843
// 41f: ldc2_w 4591873735260458766
// 422: lload 2
// 423: lxor
// 424: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 429: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 42c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 42f: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 432: fconst_0
// 433: iload 13
// 435: i2s
// 436: fconst_0
// 437: iload 14
// 439: fconst_0
// 43a: sipush 10111
// 43d: ldc2_w 5951430426810561145
// 440: lload 2
// 441: lxor
// 442: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 447: aconst_null
// 448: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 44b: aload 0
// 44c: aconst_null
// 44d: putfield su/catlean/db.A Ljava/lang/String;
// 450: aload 0
// 451: bipush 0
// 452: putfield su/catlean/db.K Z
// 455: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 458: lload 25
// 45a: aload 1
// 45b: new su/catlean/o7
// 45e: dup
// 45f: fload 43
// 461: fload 44
// 463: ldc 55.0
// 465: fadd
// 466: fload 43
// 468: aload 0
// 469: invokevirtual su/catlean/db.l ()F
// 46c: fadd
// 46d: fload 44
// 46f: aload 0
// 470: invokevirtual su/catlean/db.p ()F
// 473: fadd
// 474: ldc 6.0
// 476: fsub
// 477: invokespecial su/catlean/o7.<init> (FFFF)V
// 47a: invokevirtual su/catlean/jl.j (JLnet/minecraft/class_332;Lsu/catlean/o7;)V
// 47d: aload 0
// 47e: getfield su/catlean/db.m Ljava/util/List;
// 481: checkcast java/lang/Iterable
// 484: astore 46
// 486: bipush 0
// 487: istore 47
// 489: aload 46
// 48b: new su/catlean/by
// 48e: dup
// 48f: invokespecial su/catlean/by.<init> ()V
// 492: checkcast java/util/Comparator
// 495: invokestatic kotlin/collections/CollectionsKt.sortedWith (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
// 498: checkcast java/lang/Iterable
// 49b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 4a0: astore 45
// 4a2: bipush 0
// 4a3: istore 46
// 4a5: aload 45
// 4a7: invokeinterface java/util/Iterator.hasNext ()Z 1
// 4ac: ifeq a28
// 4af: iload 46
// 4b1: istore 47
// 4b3: iload 46
// 4b5: bipush 1
// 4b6: iadd
// 4b7: istore 46
// 4b9: aload 45
// 4bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 4c0: checkcast java/lang/String
// 4c3: astore 48
// 4c5: fload 44
// 4c7: ldc 58.0
// 4c9: fadd
// 4ca: iload 47
// 4cc: i2f
// 4cd: ldc 18.0
// 4cf: fmul
// 4d0: fadd
// 4d1: aload 0
// 4d2: invokevirtual su/catlean/db.X ()F
// 4d5: fadd
// 4d6: fstore 49
// 4d8: iload 42
// 4da: lload 2
// 4db: lconst_0
// 4dc: lcmp
// 4dd: ifle 4f7
// 4e0: ifne a37
// 4e3: fload 49
// 4e5: fload 44
// 4e7: sipush 1768
// 4ea: ldc2_w 6658446827271427043
// 4ed: lload 2
// 4ee: lxor
// 4ef: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f4: i2f
// 4f5: fadd
// 4f6: fcmpg
// 4f7: lload 2
// 4f8: lconst_0
// 4f9: lcmp
// 4fa: iflt 554
// 4fd: iload 42
// 4ff: ifne 554
// 502: goto 50f
// 505: ldc2_w -5018967295239959075
// 508: lload 2
// 509: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50e: athrow
// 50f: lload 2
// 510: lconst_0
// 511: lcmp
// 512: ifle 55f
// 515: iflt 55d
// 518: goto 525
// 51b: ldc2_w -5018967295239959075
// 51e: lload 2
// 51f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 524: athrow
// 525: fload 49
// 527: lload 2
// 528: lconst_0
// 529: lcmp
// 52a: ifle 583
// 52d: fload 44
// 52f: aload 0
// 530: invokevirtual su/catlean/db.p ()F
// 533: fadd
// 534: iload 42
// 536: ifne 582
// 539: goto 546
// 53c: ldc2_w -5018967295239959075
// 53f: lload 2
// 540: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 545: athrow
// 546: fcmpl
// 547: goto 554
// 54a: ldc2_w -5018967295239959075
// 54d: lload 2
// 54e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 553: athrow
// 554: lload 2
// 555: lconst_0
// 556: lcmp
// 557: iflt 55f
// 55a: ifle 57c
// 55d: iload 42
// 55f: ifeq 4a5
// 562: goto 56f
// 565: ldc2_w -5018967295239959075
// 568: lload 2
// 569: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 56e: athrow
// 56f: bipush 3
// 570: anewarray 328
// 573: ldc2_w -4931292738239090259
// 576: lload 2
// 577: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57c: fload 43
// 57e: aload 0
// 57f: invokevirtual su/catlean/db.l ()F
// 582: fadd
// 583: fstore 51
// 585: iload 4
// 587: i2f
// 588: fstore 52
// 58a: fload 43
// 58c: fload 52
// 58e: fcmpg
// 58f: iload 42
// 591: lload 2
// 592: lconst_0
// 593: lcmp
// 594: iflt 5be
// 597: ifne 5bc
// 59a: ifgt 5e3
// 59d: goto 5aa
// 5a0: ldc2_w -5018967295239959075
// 5a3: lload 2
// 5a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a9: athrow
// 5aa: fload 52
// 5ac: fload 51
// 5ae: fcmpg
// 5af: goto 5bc
// 5b2: ldc2_w -5018967295239959075
// 5b5: lload 2
// 5b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5bb: athrow
// 5bc: iload 42
// 5be: ifne 5e0
// 5c1: ifgt 5df
// 5c4: goto 5d1
// 5c7: ldc2_w -5018967295239959075
// 5ca: lload 2
// 5cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d0: athrow
// 5d1: bipush 1
// 5d2: goto 5e4
// 5d5: ldc2_w -5018967295239959075
// 5d8: lload 2
// 5d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5de: athrow
// 5df: bipush 0
// 5e0: goto 5e4
// 5e3: bipush 0
// 5e4: lload 2
// 5e5: lconst_0
// 5e6: lcmp
// 5e7: ifle 5f6
// 5ea: ifeq 69b
// 5ed: iload 5
// 5ef: i2f
// 5f0: fload 44
// 5f2: ldc 58.0
// 5f4: fadd
// 5f5: fcmpl
// 5f6: iload 42
// 5f8: lload 2
// 5f9: lconst_0
// 5fa: lcmp
// 5fb: ifle 631
// 5fe: ifne 62f
// 601: goto 60e
// 604: ldc2_w -5018967295239959075
// 607: lload 2
// 608: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60d: athrow
// 60e: ifle 69b
// 611: goto 61e
// 614: ldc2_w -5018967295239959075
// 617: lload 2
// 618: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 61d: athrow
// 61e: fload 49
// 620: ldc 17.0
// 622: fadd
// 623: fstore 51
// 625: iload 5
// 627: i2f
// 628: fstore 52
// 62a: fload 49
// 62c: fload 52
// 62e: fcmpg
// 62f: iload 42
// 631: lload 2
// 632: lconst_0
// 633: lcmp
// 634: ifle 65e
// 637: ifne 65c
// 63a: ifgt 683
// 63d: goto 64a
// 640: ldc2_w -5018967295239959075
// 643: lload 2
// 644: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 649: athrow
// 64a: fload 52
// 64c: fload 51
// 64e: fcmpg
// 64f: goto 65c
// 652: ldc2_w -5018967295239959075
// 655: lload 2
// 656: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65b: athrow
// 65c: iload 42
// 65e: ifne 680
// 661: ifgt 67f
// 664: goto 671
// 667: ldc2_w -5018967295239959075
// 66a: lload 2
// 66b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 670: athrow
// 671: bipush 1
// 672: goto 684
// 675: ldc2_w -5018967295239959075
// 678: lload 2
// 679: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 67e: athrow
// 67f: bipush 0
// 680: goto 684
// 683: bipush 0
// 684: lload 2
// 685: lconst_0
// 686: lcmp
// 687: iflt 68e
// 68a: ifeq 69b
// 68d: bipush 1
// 68e: goto 69c
// 691: ldc2_w -5018967295239959075
// 694: lload 2
// 695: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69a: athrow
// 69b: bipush 0
// 69c: istore 50
// 69e: iload 42
// 6a0: lload 2
// 6a1: lconst_0
// 6a2: lcmp
// 6a3: ifle 6ab
// 6a6: ifne 6ce
// 6a9: iload 50
// 6ab: ifeq 724
// 6ae: goto 6bb
// 6b1: ldc2_w -5018967295239959075
// 6b4: lload 2
// 6b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ba: athrow
// 6bb: aload 0
// 6bc: aload 48
// 6be: putfield su/catlean/db.A Ljava/lang/String;
// 6c1: goto 6ce
// 6c4: ldc2_w -5018967295239959075
// 6c7: lload 2
// 6c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cd: athrow
// 6ce: aload 1
// 6cf: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 6d2: dup
// 6d3: sipush 18980
// 6d6: ldc2_w 4600300875595910713
// 6d9: lload 2
// 6da: lxor
// 6db: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6e3: fload 43
// 6e5: ldc 6.0
// 6e7: fadd
// 6e8: iload 12
// 6ea: i2c
// 6eb: swap
// 6ec: fload 49
// 6ee: fconst_2
// 6ef: fsub
// 6f0: aload 0
// 6f1: invokevirtual su/catlean/db.l ()F
// 6f4: ldc 12.0
// 6f6: fsub
// 6f7: ldc 20.0
// 6f9: ldc 4.0
// 6fb: fconst_2
// 6fc: ldc 0.1
// 6fe: fconst_1
// 6ff: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 702: invokevirtual su/catlean/jh.g ()Ljava/awt/Color;
// 705: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 708: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 70b: fconst_0
// 70c: iload 13
// 70e: i2s
// 70f: fconst_0
// 710: iload 14
// 712: fconst_0
// 713: sipush 10111
// 716: ldc2_w 5951430426810561145
// 719: lload 2
// 71a: lxor
// 71b: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 720: aconst_null
// 721: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 724: lload 21
// 726: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 729: aload 1
// 72a: aload 48
// 72c: iload 42
// 72e: ifne 794
// 731: invokevirtual java/lang/String.length ()I
// 734: sipush 15201
// 737: ldc2_w 7434059231295516264
// 73a: lload 2
// 73b: lxor
// 73c: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 741: if_icmple 797
// 744: goto 751
// 747: ldc2_w -5018967295239959075
// 74a: lload 2
// 74b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 750: athrow
// 751: aload 48
// 753: bipush 0
// 754: sipush 17653
// 757: ldc2_w 2495863472832631295
// 75a: lload 2
// 75b: lxor
// 75c: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 761: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
// 764: dup
// 765: sipush 2275
// 768: ldc2_w 265634700838292731
// 76b: lload 2
// 76c: lxor
// 76d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 772: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 775: sipush 28916
// 778: ldc2_w 5734285696230339818
// 77b: lload 2
// 77c: lxor
// 77d: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 782: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 787: goto 794
// 78a: ldc2_w -5018967295239959075
// 78d: lload 2
// 78e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 793: athrow
// 794: goto 799
// 797: aload 48
// 799: fload 43
// 79b: ldc 10.0
// 79d: fadd
// 79e: fload 49
// 7a0: bipush 1
// 7a1: i2f
// 7a2: fadd
// 7a3: aload 48
// 7a5: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 7a8: invokevirtual su/catlean/yl.m ()Lsu/catlean/od;
// 7ab: lload 17
// 7ad: invokevirtual su/catlean/od.H (J)Lsu/catlean/mh;
// 7b0: invokevirtual su/catlean/mh.R ()Ljava/lang/String;
// 7b3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 7b6: ifeq 7cc
// 7b9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 7bc: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 7bf: goto 7d2
// 7c2: ldc2_w -5018967295239959075
// 7c5: lload 2
// 7c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7cb: athrow
// 7cc: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 7cf: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 7d2: astore 32
// 7d4: fstore 33
// 7d6: fstore 34
// 7d8: lload 19
// 7da: fload 34
// 7dc: fload 33
// 7de: aload 32
// 7e0: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 7e3: fload 43
// 7e5: aload 0
// 7e6: invokevirtual su/catlean/db.l ()F
// 7e9: fadd
// 7ea: ldc 20.0
// 7ec: fsub
// 7ed: fstore 52
// 7ef: fload 43
// 7f1: aload 0
// 7f2: invokevirtual su/catlean/db.l ()F
// 7f5: fadd
// 7f6: ldc 10.0
// 7f8: fsub
// 7f9: fstore 53
// 7fb: iload 4
// 7fd: i2f
// 7fe: fstore 54
// 800: fload 52
// 802: fload 54
// 804: fcmpg
// 805: iload 42
// 807: lload 2
// 808: lconst_0
// 809: lcmp
// 80a: iflt 834
// 80d: ifne 832
// 810: ifgt 859
// 813: goto 820
// 816: ldc2_w -5018967295239959075
// 819: lload 2
// 81a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 81f: athrow
// 820: fload 54
// 822: fload 53
// 824: fcmpg
// 825: goto 832
// 828: ldc2_w -5018967295239959075
// 82b: lload 2
// 82c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 831: athrow
// 832: iload 42
// 834: ifne 856
// 837: ifgt 855
// 83a: goto 847
// 83d: ldc2_w -5018967295239959075
// 840: lload 2
// 841: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 846: athrow
// 847: bipush 1
// 848: goto 85a
// 84b: ldc2_w -5018967295239959075
// 84e: lload 2
// 84f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 854: athrow
// 855: bipush 0
// 856: goto 85a
// 859: bipush 0
// 85a: ifeq 8e1
// 85d: fload 49
// 85f: ldc 3.0
// 861: fadd
// 862: fstore 52
// 864: fload 49
// 866: ldc 13.0
// 868: fadd
// 869: fstore 53
// 86b: iload 5
// 86d: i2f
// 86e: fstore 54
// 870: fload 52
// 872: fload 54
// 874: fcmpg
// 875: iload 42
// 877: lload 2
// 878: lconst_0
// 879: lcmp
// 87a: iflt 8a4
// 87d: ifne 8a2
// 880: ifgt 8c9
// 883: goto 890
// 886: ldc2_w -5018967295239959075
// 889: lload 2
// 88a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88f: athrow
// 890: fload 54
// 892: fload 53
// 894: fcmpg
// 895: goto 8a2
// 898: ldc2_w -5018967295239959075
// 89b: lload 2
// 89c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a1: athrow
// 8a2: iload 42
// 8a4: ifne 8c6
// 8a7: ifgt 8c5
// 8aa: goto 8b7
// 8ad: ldc2_w -5018967295239959075
// 8b0: lload 2
// 8b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8b6: athrow
// 8b7: bipush 1
// 8b8: goto 8ca
// 8bb: ldc2_w -5018967295239959075
// 8be: lload 2
// 8bf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c4: athrow
// 8c5: bipush 0
// 8c6: goto 8ca
// 8c9: bipush 0
// 8ca: lload 2
// 8cb: lconst_0
// 8cc: lcmp
// 8cd: iflt 8d4
// 8d0: ifeq 8e1
// 8d3: bipush 1
// 8d4: goto 8e2
// 8d7: ldc2_w -5018967295239959075
// 8da: lload 2
// 8db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8e0: athrow
// 8e1: bipush 0
// 8e2: istore 51
// 8e4: iload 51
// 8e6: ifeq 91a
// 8e9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 8ec: getstatic java/awt/Color.RED Ljava/awt/Color;
// 8ef: dup
// 8f0: sipush 24232
// 8f3: ldc2_w 4419364891098847922
// 8f6: lload 2
// 8f7: lxor
// 8f8: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 900: iload 29
// 902: i2c
// 903: iload 30
// 905: ldc 0.7
// 907: iload 31
// 909: i2s
// 90a: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 90d: goto 93e
// 910: ldc2_w -5018967295239959075
// 913: lload 2
// 914: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 919: athrow
// 91a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 91d: getstatic java/awt/Color.RED Ljava/awt/Color;
// 920: dup
// 921: sipush 3043
// 924: ldc2_w 6028568638516842490
// 927: lload 2
// 928: lxor
// 929: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 92e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 931: iload 29
// 933: i2c
// 934: iload 30
// 936: ldc 0.5
// 938: iload 31
// 93a: i2s
// 93b: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 93e: astore 52
// 940: fload 43
// 942: aload 0
// 943: invokevirtual su/catlean/db.l ()F
// 946: fadd
// 947: ldc 20.0
// 949: fsub
// 94a: fload 49
// 94c: ldc 3.0
// 94e: fadd
// 94f: ldc 10.0
// 951: ldc 10.0
// 953: ldc 3.0
// 955: aload 52
// 957: aload 52
// 959: aload 52
// 95b: aload 52
// 95d: aload 1
// 95e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 961: dup
// 962: sipush 18980
// 965: ldc2_w 4600300875595910713
// 968: lload 2
// 969: lxor
// 96a: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 96f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 972: iload 51
// 974: ifeq 985
// 977: fconst_2
// 978: goto 986
// 97b: ldc2_w -5018967295239959075
// 97e: lload 2
// 97f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 984: athrow
// 985: fconst_1
// 986: iload 51
// 988: ifeq 99b
// 98b: getstatic java/awt/Color.RED Ljava/awt/Color;
// 98e: goto 9bf
// 991: ldc2_w -5018967295239959075
// 994: lload 2
// 995: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 99a: athrow
// 99b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 99e: getstatic java/awt/Color.RED Ljava/awt/Color;
// 9a1: dup
// 9a2: sipush 3043
// 9a5: ldc2_w 6028568638516842490
// 9a8: lload 2
// 9a9: lxor
// 9aa: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/db.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9b2: iload 29
// 9b4: i2c
// 9b5: iload 30
// 9b7: ldc 0.5
// 9b9: iload 31
// 9bb: i2s
// 9bc: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 9bf: astore 53
// 9c1: aload 53
// 9c3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 9c6: aload 53
// 9c8: astore 32
// 9ca: fstore 33
// 9cc: astore 34
// 9ce: astore 35
// 9d0: astore 36
// 9d2: astore 37
// 9d4: astore 38
// 9d6: fstore 39
// 9d8: fstore 40
// 9da: fstore 41
// 9dc: lload 8
// 9de: fload 41
// 9e0: fload 40
// 9e2: fload 39
// 9e4: aload 38
// 9e6: aload 37
// 9e8: aload 36
// 9ea: aload 35
// 9ec: aload 34
// 9ee: fload 33
// 9f0: aload 32
// 9f2: invokestatic su/catlean/l7.p (FFJFFFLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;)V
// 9f5: aload 0
// 9f6: getfield su/catlean/db.K Z
// 9f9: iload 42
// 9fb: lload 2
// 9fc: lconst_0
// 9fd: lcmp
// 9fe: iflt a18
// a01: ifne a16
// a04: ifne 4a5
// a07: goto a14
// a0a: ldc2_w -5018967295239959075
// a0d: lload 2
// a0e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a13: athrow
// a14: iload 51
// a16: iload 42
// a18: ifne 4ac
// a1b: ifeq 4a5
// a1e: aload 0
// a1f: bipush 1
// a20: putfield su/catlean/db.K Z
// a23: iload 42
// a25: ifeq 4a5
// a28: getstatic su/catlean/jl.y Lsu/catlean/jl;
// a2b: lload 27
// a2d: aload 1
// a2e: invokevirtual su/catlean/jl.W (JLnet/minecraft/class_332;)V
// a31: lload 2
// a32: lconst_0
// a33: lcmp
// a34: iflt 4b9
// a37: return
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
// 010: ldc2_w 138412909566640
// 013: lxor
// 014: lstore 10
// 016: pop2
// 017: ldc2_w 8762865244424641971
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
// 02f: invokevirtual su/catlean/db.l ()F
// 032: fconst_2
// 033: fdiv
// 034: fsub
// 035: fstore 13
// 037: istore 12
// 039: lload 6
// 03b: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 03e: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 041: invokevirtual net/minecraft/class_1041.method_4502 ()I
// 044: i2f
// 045: fconst_2
// 046: fdiv
// 047: aload 0
// 048: invokevirtual su/catlean/db.p ()F
// 04b: fconst_2
// 04c: fdiv
// 04d: fsub
// 04e: ldc 50.0
// 050: fsub
// 051: fstore 14
// 053: aload 0
// 054: getfield su/catlean/db.K Z
// 057: iload 12
// 059: ifeq 0cb
// 05c: ifeq 0b5
// 05f: goto 06c
// 062: ldc2_w 8694034106106810147
// 065: lload 1
// 066: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: athrow
// 06c: aload 0
// 06d: iload 12
// 06f: lload 1
// 070: lconst_0
// 071: lcmp
// 072: ifle 0b8
// 075: ifeq 0b6
// 078: goto 085
// 07b: ldc2_w 8694034106106810147
// 07e: lload 1
// 07f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: athrow
// 085: getfield su/catlean/db.A Ljava/lang/String;
// 088: ifnull 0b5
// 08b: goto 098
// 08e: ldc2_w 8694034106106810147
// 091: lload 1
// 092: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: athrow
// 098: aload 0
// 099: getfield su/catlean/db.R Lkotlin/jvm/functions/Function1;
// 09c: aload 0
// 09d: getfield su/catlean/db.A Ljava/lang/String;
// 0a0: dup
// 0a1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0a4: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 0a9: pop
// 0aa: return
// 0ab: ldc2_w 8694034106106810147
// 0ae: lload 1
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: aload 0
// 0b6: iload 12
// 0b8: ifeq 0cf
// 0bb: getfield su/catlean/db.C Z
// 0be: goto 0cb
// 0c1: ldc2_w 8694034106106810147
// 0c4: lload 1
// 0c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ca: athrow
// 0cb: ifeq 0d4
// 0ce: aload 0
// 0cf: lload 10
// 0d1: invokespecial su/catlean/db.Q (J)V
// 0d4: fload 14
// 0d6: ldc 28.0
// 0d8: fadd
// 0d9: fstore 15
// 0db: fload 14
// 0dd: ldc 48.0
// 0df: fadd
// 0e0: fstore 16
// 0e2: iload 4
// 0e4: i2f
// 0e5: fstore 17
// 0e7: fload 15
// 0e9: fload 17
// 0eb: fcmpg
// 0ec: iload 12
// 0ee: lload 1
// 0ef: lconst_0
// 0f0: lcmp
// 0f1: ifle 11b
// 0f4: ifeq 119
// 0f7: ifgt 140
// 0fa: goto 107
// 0fd: ldc2_w 8694034106106810147
// 100: lload 1
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: fload 17
// 109: fload 16
// 10b: fcmpg
// 10c: goto 119
// 10f: ldc2_w 8694034106106810147
// 112: lload 1
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: iload 12
// 11b: ifeq 13d
// 11e: ifgt 13c
// 121: goto 12e
// 124: ldc2_w 8694034106106810147
// 127: lload 1
// 128: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: athrow
// 12e: bipush 1
// 12f: goto 141
// 132: ldc2_w 8694034106106810147
// 135: lload 1
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: bipush 0
// 13d: goto 141
// 140: bipush 0
// 141: ifeq 1e7
// 144: fload 13
// 146: ldc 4.0
// 148: fadd
// 149: fstore 15
// 14b: fload 13
// 14d: aload 0
// 14e: invokevirtual su/catlean/db.l ()F
// 151: fadd
// 152: ldc 33.0
// 154: fsub
// 155: fstore 16
// 157: iload 3
// 158: i2f
// 159: fstore 17
// 15b: fload 15
// 15d: fload 17
// 15f: fcmpg
// 160: iload 12
// 162: lload 1
// 163: lconst_0
// 164: lcmp
// 165: iflt 18f
// 168: ifeq 18d
// 16b: ifgt 1b4
// 16e: goto 17b
// 171: ldc2_w 8694034106106810147
// 174: lload 1
// 175: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: athrow
// 17b: fload 17
// 17d: fload 16
// 17f: fcmpg
// 180: goto 18d
// 183: ldc2_w 8694034106106810147
// 186: lload 1
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: iload 12
// 18f: ifeq 1b1
// 192: ifgt 1b0
// 195: goto 1a2
// 198: ldc2_w 8694034106106810147
// 19b: lload 1
// 19c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: athrow
// 1a2: bipush 1
// 1a3: goto 1b5
// 1a6: ldc2_w 8694034106106810147
// 1a9: lload 1
// 1aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1af: athrow
// 1b0: bipush 0
// 1b1: goto 1b5
// 1b4: bipush 0
// 1b5: ifeq 1e7
// 1b8: aload 0
// 1b9: aload 0
// 1ba: getfield su/catlean/db.i Z
// 1bd: iload 12
// 1bf: ifeq 1e0
// 1c2: goto 1cf
// 1c5: ldc2_w 8694034106106810147
// 1c8: lload 1
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: ifne 1e3
// 1d2: goto 1df
// 1d5: ldc2_w 8694034106106810147
// 1d8: lload 1
// 1d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1de: athrow
// 1df: bipush 1
// 1e0: goto 1e4
// 1e3: bipush 0
// 1e4: putfield su/catlean/db.i Z
// 1e7: aload 0
// 1e8: getfield su/catlean/db.A Ljava/lang/String;
// 1eb: dup
// 1ec: ifnull 20a
// 1ef: astore 17
// 1f1: bipush 0
// 1f2: istore 18
// 1f4: aload 0
// 1f5: getfield su/catlean/db.L Lkotlin/jvm/functions/Function1;
// 1f8: aload 0
// 1f9: getfield su/catlean/db.A Ljava/lang/String;
// 1fc: dup
// 1fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 200: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
// 205: pop
// 206: nop
// 207: goto 20b
// 20a: pop
// 20b: aload 0
// 20c: lload 8
// 20e: iload 3
// 20f: iload 4
// 211: iload 5
// 213: invokespecial su/catlean/dj.T (JIII)V
// 216: return
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
// 02: ldc2_w 20046362045052
// 05: lxor
// 06: lstore 4
// 08: dup2
// 09: ldc2_w 0
// 0c: lxor
// 0d: lstore 6
// 0f: pop2
// 10: ldc2_w 673178582638095743
// 13: lload 2
// 14: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19: istore 8
// 1b: iload 8
// 1d: ifeq e4
// 20: iload 1
// 21: lload 2
// 22: lconst_0
// 23: lcmp
// 24: iflt 5b
// 27: tableswitch 182 256 259 39 68 182 98
// 44: ldc2_w 606585367095148527
// 47: lload 2
// 48: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d: athrow
// 4e: aload 0
// 4f: bipush 0
// 50: putfield su/catlean/db.i Z
// 53: lload 2
// 54: lconst_0
// 55: lcmp
// 56: ifle e4
// 59: iload 8
// 5b: ifne dd
// 5e: goto 6b
// 61: ldc2_w 606585367095148527
// 64: lload 2
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: aload 0
// 6c: lload 4
// 6e: invokespecial su/catlean/db.Q (J)V
// 71: lload 2
// 72: lconst_0
// 73: lcmp
// 74: iflt e4
// 77: iload 8
// 79: ifne dd
// 7c: goto 89
// 7f: ldc2_w 606585367095148527
// 82: lload 2
// 83: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 88: athrow
// 89: aload 0
// 8a: aload 0
// 8b: getfield su/catlean/db.V Ljava/lang/String;
// 8e: bipush 1
// 8f: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 92: putfield su/catlean/db.V Ljava/lang/String;
// 95: aload 0
// 96: getfield su/catlean/db.V Ljava/lang/String;
// 99: checkcast java/lang/CharSequence
// 9c: invokeinterface java/lang/CharSequence.length ()I 1
// a1: iload 8
// a3: ifeq c4
// a6: goto b3
// a9: ldc2_w 606585367095148527
// ac: lload 2
// ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// b2: athrow
// b3: ifne c7
// b6: goto c3
// b9: ldc2_w 606585367095148527
// bc: lload 2
// bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// c2: athrow
// c3: bipush 1
// c4: goto c8
// c7: bipush 0
// c8: ifeq dd
// cb: aload 0
// cc: bipush 0
// cd: putfield su/catlean/db.i Z
// d0: goto dd
// d3: ldc2_w 606585367095148527
// d6: lload 2
// d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// dc: athrow
// dd: aload 0
// de: iload 1
// df: lload 6
// e1: invokespecial su/catlean/dj.w (IJ)V
// e4: return
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
private final void Q(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 76684999983457L;
long var5 = var1 ^ 13788984969710L;
long var10001 = var1 ^ 47127897243727L;
int var7 = (int)((var1 ^ 47127897243727L) >>> 32);
int var8 = (int)((var1 ^ 47127897243727L) << 32 >>> 48);
int var9 = (int)(var10001 << 48 >>> 48);
long var10 = var1 ^ 3666452804554L;
int var12 = vm.a<"Å">(7321864474398051231L, var1);

boolean var10000;
label60: {
label59: {
try {
var10000 = StringsKt.isBlank(this.V);
if (var12 != 0) {
break label60;
}

if (!var10000) {
break label59;
}
} catch (NumberFormatException var25) {
throw vm.a<"Å">(var25, 7251369388132045606L, var1);
}

var10000 = 0;
break label60;
}

var10000 = 1;
}

if (var10000) {
Iterable var13 = yl.g.m().s(var5);
boolean var14 = false;
var var16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var13, c<"w">(19161, 3117455855812149550L ^ var1)));
boolean var17 = false;

label48:
for (Object var19 : var13) {
mh var20 = (mh)var19;
ArrayList var22 = var16;
boolean var21 = false;

try {
var22.add(var20.R());
} catch (NumberFormatException var23) {
throw vm.a<"Å">(var23, 7251369388132045606L, var1);
}

while (true) {
try {
var10000 = var12;
if (var1 > 0L) {
if (var12 != 0) {
return;
}

var10000 = var12;
}

if (var10000 == 0) {
break;
}
} catch (NumberFormatException var24) {
throw vm.a<"Å">(var24, 7251369388132045606L, var1);
}

if (var1 > 0L) {
break label48;
}
}
}

if (!var16.contains(this.V)) {
mh var27 = q4.c.X(var7, var8, this.V, var9);
yl.g.m().s(var5).add(var27);
yl.g.m().m(var10, var27);
this.V = "";
this.i = false;
this.L(true);
fi.C.o(new dw(var3));
}
}
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
// 0c: getfield su/catlean/db.i Z
// 0f: iload 4
// 11: lload 1
// 12: lconst_0
// 13: lcmp
// 14: iflt 5d
// 17: ifeq 50
// 1a: ifeq 80
// 1d: goto 2a
// 20: ldc2_w 6821589438385924399
// 23: lload 1
// 24: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29: athrow
// 2a: aload 0
// 2b: iload 4
// 2d: ifeq 7c
// 30: goto 3d
// 33: ldc2_w 6821589438385924399
// 36: lload 1
// 37: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c: athrow
// 3d: getfield su/catlean/db.V Ljava/lang/String;
// 40: invokevirtual java/lang/String.length ()I
// 43: goto 50
// 46: ldc2_w 6821589438385924399
// 49: lload 1
// 4a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f: athrow
// 50: sipush 29311
// 53: ldc2_w 3023224817160356746
// 56: lload 1
// 57: lxor
// 58: invokedynamic w (IJ)I bsm=su/catlean/db.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d: if_icmpge 80
// 60: aload 0
// 61: aload 0
// 62: getfield su/catlean/db.V Ljava/lang/String;
// 65: iload 3
// 66: invokedynamic makeConcatWithConstants (Ljava/lang/String;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 6b: putfield su/catlean/db.V Ljava/lang/String;
// 6e: aload 0
// 6f: goto 7c
// 72: ldc2_w 6821589438385924399
// 75: lload 1
// 76: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7b: athrow
// 7c: fconst_0
// 7d: invokevirtual su/catlean/db.Z (F)V
// 80: return
}

static {
long var16 = a ^ 93996785590907L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[14];
int var23 = 0;
String var22 = "\u0001¤Æ\u0088pïUö\u0015.(¼L7\u008cÚ\u0018øQâ\u008c<Ëgo÷µ\u0094ÿö¢Ù\u008c*\u001a`Ìª~º\u000e\u0010\u0081\u001a?ÓÔZ\u008aÌ\u008f#\u0099\r?TPè\u0010\u0019¸32\f{Ë®Ke7ÈÈ»üu\u0018ÀSä«¤µVì Ò¡%¬©ðá\u009e\u0002Þ\u0086ÖÍ¤\u009e\u0010bI\u0081\u009d\u009e\u0096ÉõªxÔÝk«¯\u0014\u0010\u009a1@ÿkïÁùõ\u0011`\u0083Ó\u0019ò} T\u008f\u009ae\u001aÖVü\u0000À8\u0080ßY£¶@ãJCÍò\u0082\u0015.\u008bÑQÙà)_ ô#\u001c\u0097õ®þ}q<TÇrj2Â\u0086\u0090âÂ\u0086Á\u001d\u0013\\\u0085agÿË¹¦ \u008a Î*\u0004Í.\u0090ë4ú92se\u0084ÈÏÿ\u0006¿°yV\u0081~q\u000bÞwèE(\u0087ÑÕ\u008fIÈ\u0084ö\u001a\u0081êÿ©¬k0»êÓZ\u0092È¹/Á\u0015(\u0084m/Á!a§®\u00946@L¿\u0010ó\b¤\u0082DÑ«\u001cï\u00ad&õ;y\u000b\u008d";
int var24 = "\u0001¤Æ\u0088pïUö\u0015.(¼L7\u008cÚ\u0018øQâ\u008c<Ëgo÷µ\u0094ÿö¢Ù\u008c*\u001a`Ìª~º\u000e\u0010\u0081\u001a?ÓÔZ\u008aÌ\u008f#\u0099\r?TPè\u0010\u0019¸32\f{Ë®Ke7ÈÈ»üu\u0018ÀSä«¤µVì Ò¡%¬©ðá\u009e\u0002Þ\u0086ÖÍ¤\u009e\u0010bI\u0081\u009d\u009e\u0096ÉõªxÔÝk«¯\u0014\u0010\u009a1@ÿkïÁùõ\u0011`\u0083Ó\u0019ò} T\u008f\u009ae\u001aÖVü\u0000À8\u0080ßY£¶@ãJCÍò\u0082\u0015.\u008bÑQÙà)_ ô#\u001c\u0097õ®þ}q<TÇrj2Â\u0086\u0090âÂ\u0086Á\u001d\u0013\\\u0085agÿË¹¦ \u008a Î*\u0004Í.\u0090ë4ú92se\u0084ÈÏÿ\u0006¿°yV\u0081~q\u000bÞwèE(\u0087ÑÕ\u008fIÈ\u0084ö\u001a\u0081êÿ©¬k0»êÓZ\u0092È¹/Á\u0015(\u0084m/Á!a§®\u00946@L¿\u0010ó\b¤\u0082DÑ«\u001cï\u00ad&õ;y\u000b\u008d"
.length();
char var21 = 16;
int var29 = -1;

label64:
while (true) {
String var30 = var22.substring(++var29, var29 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = b(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var43;
if ((var29 += var21) >= var24) {
c = var25;
d = new String[14];
o = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[10];
int var8 = 0;
String var9 = "º\tã.!\u0014\u0006\u0080\u000e\u0002%ÞDv\u009e´!Á\u009föò/äc^\"\u0012<cOäG\u0090\u0007\u009eãéÛPÆ\u0083lD\u008aÙø\u001e¶é¯$øbÿ\u0012r\u008b\u0014d\u0007fÞÕÂ";
int var10 = "º\tã.!\u0014\u0006\u0080\u000e\u0002%ÞDv\u009e´!Á\u009föò/äc^\"\u0012<cOäG\u0090\u0007\u009eãéÛPÆ\u0083lD\u008aÙø\u001e¶é¯$øbÿ\u0012r\u008b\u0014d\u0007fÞÕÂ"
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
k = var11;
n = new Integer[10];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 955384685327864063L;
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
p = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "\u0004uàADòîD\u0094vÜ¤6\u0093\u008e\\";
var10 = "\u0004uàADòîD\u0094vÜ¤6\u0093\u008e\\".length();
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

var21 = var22.charAt(var29);
break;
default:
var25[var23++] = var43;
if ((var29 += var21) < var24) {
var21 = var22.charAt(var29);
continue label64;
}

var22 = "¼Í\u0001,«À\u000e«²\u0093ÜèóJï\u0086\u0005\u0080º\u008dÛ¼úþ Dp\u0000\fÅíÝn§7\fª\u0001\u0015³\u0084jî\u009f×\u0002ý8P\u001a¹þ§<\u00125$";
var24 = "¼Í\u0001,«À\u000e«²\u0093ÜèóJï\u0086\u0005\u0080º\u008dÛ¼úþ Dp\u0000\fÅíÝn§7\fª\u0001\u0015³\u0084jî\u009f×\u0002ý8P\u001a¹þ§<\u00125$".length();
var21 = 24;
var29 = -1;
}

var30 = var22.substring(++var29, var29 + var21);
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32427;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/db", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/db" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 12216;
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
throw new RuntimeException("su/catlean/db", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
n[var3] = var15;
}

return n[var3];
}

private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = c(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
throw new RuntimeException("su/catlean/db" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
