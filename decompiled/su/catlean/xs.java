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
import net.minecraft.class_2960;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xs extends f6 {
@NotNull
private String r;
@Nullable
private class_2960 H;
private boolean f;
private boolean I;
@NotNull
private fd q;
private static String[] C;
private static final long a = yz.a(7966668218756344026L, 9202124005089686150L, MethodHandles.lookup().lookupClass()).a(271496403923358L);
private static final String[] c;
private static final String[] d;
private static final Map b = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;
private static final long i;

public xs(@NotNull String name, long a) {
ax = a ^ ax;
long var4 = ax ^ 74043677423934L;
Intrinsics.checkNotNullParameter(name, a<"d">(13866, 4489502963920442768L ^ ax));
super();
this.r = name;
this.q = new fd(_s.OUT_QUINT, i, var4);
}

@NotNull
public final String T() {
return this.r;
}

public final void Q(@NotNull String <set-?>, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"d">(24819, 8133720334437374165L ^ ax));
this.r = <set-?>;
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
// 023: ldc2_w 97956880838355
// 026: lxor
// 027: lstore 11
// 029: dup2
// 02a: ldc2_w 15727589290443
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 81101117301204
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 112712302870369
// 03b: lxor
// 03c: lstore 17
// 03e: dup2
// 03f: ldc2_w 117649217993747
// 042: lxor
// 043: lstore 19
// 045: dup2
// 046: ldc2_w 81010294496925
// 049: lxor
// 04a: dup2
// 04b: bipush 48
// 04d: lushr
// 04e: l2i
// 04f: istore 21
// 051: dup2
// 052: bipush 16
// 054: lshl
// 055: bipush 32
// 057: lushr
// 058: l2i
// 059: istore 22
// 05b: dup2
// 05c: bipush 48
// 05e: lshl
// 05f: bipush 48
// 061: lushr
// 062: l2i
// 063: istore 23
// 065: pop2
// 066: dup2
// 067: ldc2_w 71473437392130
// 06a: lxor
// 06b: lstore 24
// 06d: pop2
// 06e: ldc2_w 9019530598832995739
// 071: lload 1
// 072: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: aload 3
// 078: sipush 8074
// 07b: ldc2_w 3824909207672150572
// 07e: lload 1
// 07f: lxor
// 080: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/xs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 088: astore 41
// 08a: aload 0
// 08b: fload 4
// 08d: ldc 4.0
// 08f: fadd
// 090: fstore 42
// 092: fload 6
// 094: fload 4
// 096: ldc 102.0
// 098: fadd
// 099: fcmpg
// 09a: aload 41
// 09c: ifnull 0c1
// 09f: ifgt 0e8
// 0a2: goto 0af
// 0a5: ldc2_w 9048553991845477148
// 0a8: lload 1
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: fload 42
// 0b1: fload 6
// 0b3: fcmpg
// 0b4: goto 0c1
// 0b7: ldc2_w 9048553991845477148
// 0ba: lload 1
// 0bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c0: athrow
// 0c1: aload 41
// 0c3: ifnull 0e5
// 0c6: ifgt 0e4
// 0c9: goto 0d6
// 0cc: ldc2_w 9048553991845477148
// 0cf: lload 1
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: bipush 1
// 0d7: goto 0e9
// 0da: ldc2_w 9048553991845477148
// 0dd: lload 1
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: bipush 0
// 0e5: goto 0e9
// 0e8: bipush 0
// 0e9: lload 1
// 0ea: lconst_0
// 0eb: lcmp
// 0ec: ifle 0f7
// 0ef: ifeq 173
// 0f2: fload 5
// 0f4: fload 7
// 0f6: fcmpg
// 0f7: aload 41
// 0f9: lload 1
// 0fa: lconst_0
// 0fb: lcmp
// 0fc: iflt 136
// 0ff: ifnull 134
// 102: goto 10f
// 105: ldc2_w 9048553991845477148
// 108: lload 1
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: ifgt 15b
// 112: goto 11f
// 115: ldc2_w 9048553991845477148
// 118: lload 1
// 119: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11e: athrow
// 11f: fload 7
// 121: fload 5
// 123: ldc 25.0
// 125: fadd
// 126: fcmpg
// 127: goto 134
// 12a: ldc2_w 9048553991845477148
// 12d: lload 1
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: aload 41
// 136: ifnull 158
// 139: ifgt 157
// 13c: goto 149
// 13f: ldc2_w 9048553991845477148
// 142: lload 1
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: bipush 1
// 14a: goto 15c
// 14d: ldc2_w 9048553991845477148
// 150: lload 1
// 151: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: athrow
// 157: bipush 0
// 158: goto 15c
// 15b: bipush 0
// 15c: lload 1
// 15d: lconst_0
// 15e: lcmp
// 15f: iflt 166
// 162: ifeq 173
// 165: bipush 1
// 166: goto 174
// 169: ldc2_w 9048553991845477148
// 16c: lload 1
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: bipush 0
// 174: putfield su/catlean/xs.I Z
// 177: aload 0
// 178: getfield su/catlean/xs.q Lsu/catlean/fd;
// 17b: aload 0
// 17c: getfield su/catlean/xs.I Z
// 17f: ifeq 190
// 182: fconst_1
// 183: goto 191
// 186: ldc2_w 9048553991845477148
// 189: lload 1
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: fconst_0
// 191: lload 11
// 193: dup2_x1
// 194: pop2
// 195: invokevirtual su/catlean/fd.B (JF)V
// 198: aload 3
// 199: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 19c: dup
// 19d: sipush 11373
// 1a0: ldc2_w 1696126362234382793
// 1a3: lload 1
// 1a4: lxor
// 1a5: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/xs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1ad: fload 4
// 1af: ldc 4.0
// 1b1: fadd
// 1b2: fload 5
// 1b4: ldc 102.0
// 1b6: ldc 25.0
// 1b8: fconst_2
// 1b9: aload 0
// 1ba: getfield su/catlean/xs.I Z
// 1bd: ifeq 1ce
// 1c0: fconst_2
// 1c1: goto 1cf
// 1c4: ldc2_w 9048553991845477148
// 1c7: lload 1
// 1c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: athrow
// 1ce: fconst_0
// 1cf: ldc 0.15
// 1d1: fconst_1
// 1d2: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1d5: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 1d8: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1db: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 1de: fconst_0
// 1df: fconst_0
// 1e0: fconst_0
// 1e1: sipush 29384
// 1e4: ldc2_w 5118400025124628964
// 1e7: lload 1
// 1e8: lxor
// 1e9: invokedynamic p (IJ)I bsm=su/catlean/xs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: aconst_null
// 1ef: astore 26
// 1f1: istore 27
// 1f3: fstore 28
// 1f5: fstore 29
// 1f7: fstore 30
// 1f9: astore 31
// 1fb: astore 32
// 1fd: fstore 33
// 1ff: fstore 34
// 201: fstore 35
// 203: fstore 36
// 205: fstore 37
// 207: fstore 38
// 209: fstore 39
// 20b: fstore 40
// 20d: iload 8
// 20f: i2c
// 210: fload 40
// 212: fload 39
// 214: fload 38
// 216: fload 37
// 218: fload 36
// 21a: fload 35
// 21c: fload 34
// 21e: fload 33
// 220: aload 32
// 222: aload 31
// 224: fload 30
// 226: iload 9
// 228: i2s
// 229: fload 29
// 22b: iload 10
// 22d: fload 28
// 22f: iload 27
// 231: aload 26
// 233: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 236: aload 0
// 237: lload 1
// 238: lconst_0
// 239: lcmp
// 23a: iflt 263
// 23d: aload 41
// 23f: ifnull 263
// 242: getfield su/catlean/xs.H Lnet/minecraft/class_2960;
// 245: ifnonnull 2d5
// 248: goto 255
// 24b: ldc2_w 9048553991845477148
// 24e: lload 1
// 24f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 254: athrow
// 255: aload 0
// 256: goto 263
// 259: ldc2_w 9048553991845477148
// 25c: lload 1
// 25d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 262: athrow
// 263: getfield su/catlean/xs.f Z
// 266: lload 1
// 267: lconst_0
// 268: lcmp
// 269: ifle 367
// 26c: aload 41
// 26e: ifnull 367
// 271: ifne 32f
// 274: goto 281
// 277: ldc2_w 9048553991845477148
// 27a: lload 1
// 27b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 280: athrow
// 281: aload 0
// 282: bipush 1
// 283: putfield su/catlean/xs.f Z
// 286: aload 0
// 287: getstatic su/catlean/wz.K Lsu/catlean/wz;
// 28a: aload 0
// 28b: getfield su/catlean/xs.r Ljava/lang/String;
// 28e: sipush 25673
// 291: ldc2_w 1964108304744784356
// 294: lload 1
// 295: lxor
// 296: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/xs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29b: swap
// 29c: sipush 24226
// 29f: ldc2_w 3063961668597488385
// 2a2: lload 1
// 2a3: lxor
// 2a4: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/xs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 2ae: lload 17
// 2b0: dup2_x1
// 2b1: pop2
// 2b2: invokevirtual su/catlean/wz.F (JLjava/lang/String;)Lnet/minecraft/class_2960;
// 2b5: putfield su/catlean/xs.H Lnet/minecraft/class_2960;
// 2b8: aload 0
// 2b9: bipush 0
// 2ba: putfield su/catlean/xs.f Z
// 2bd: lload 1
// 2be: lconst_0
// 2bf: lcmp
// 2c0: iflt 35e
// 2c3: aload 41
// 2c5: ifnonnull 32f
// 2c8: goto 2d5
// 2cb: ldc2_w 9048553991845477148
// 2ce: lload 1
// 2cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d4: athrow
// 2d5: fload 4
// 2d7: ldc 6.0
// 2d9: fadd
// 2da: fload 5
// 2dc: bipush 2
// 2dd: i2f
// 2de: fadd
// 2df: ldc 20.0
// 2e1: ldc 20.0
// 2e3: fconst_2
// 2e4: fconst_0
// 2e5: fconst_0
// 2e6: fconst_1
// 2e7: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 2ea: dup
// 2eb: sipush 8000
// 2ee: ldc2_w 7815751803821513445
// 2f1: lload 1
// 2f2: lxor
// 2f3: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/xs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2fb: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 2fe: dup
// 2ff: sipush 28048
// 302: ldc2_w 1721774067646081072
// 305: lload 1
// 306: lxor
// 307: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/xs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 30f: aload 3
// 310: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 313: aload 0
// 314: getfield su/catlean/xs.H Lnet/minecraft/class_2960;
// 317: dup
// 318: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 31b: lload 24
// 31d: dup2_x1
// 31e: pop2
// 31f: invokestatic su/catlean/l2.h (FFFFFFFFLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;JLnet/minecraft/class_2960;)V
// 322: goto 32f
// 325: ldc2_w 9048553991845477148
// 328: lload 1
// 329: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32e: athrow
// 32f: lload 15
// 331: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 334: aload 3
// 335: aload 0
// 336: getfield su/catlean/xs.r Ljava/lang/String;
// 339: fload 4
// 33b: ldc 30.0
// 33d: fadd
// 33e: lload 13
// 340: dup2_x1
// 341: pop2
// 342: fload 5
// 344: ldc 7.0
// 346: fadd
// 347: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 34a: dup
// 34b: sipush 28048
// 34e: ldc2_w 1721774067646081072
// 351: lload 1
// 352: lxor
// 353: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/xs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 358: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 35b: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 35e: aload 0
// 35f: getfield su/catlean/xs.q Lsu/catlean/fd;
// 362: invokevirtual su/catlean/fd.a ()F
// 365: fconst_0
// 366: fcmpl
// 367: ifle 3f3
// 36a: getstatic su/catlean/ib.I Lsu/catlean/ib;
// 36d: invokevirtual su/catlean/ib.q ()Lsu/catlean/bj;
// 370: aload 3
// 371: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 374: dup
// 375: sipush 6053
// 378: ldc2_w 4936094851014873609
// 37b: lload 1
// 37c: lxor
// 37d: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/xs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 382: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 385: checkcast org/joml/Matrix3x2f
// 388: fload 4
// 38a: f2d
// 38b: ldc 85.0
// 38d: f2d
// 38e: dadd
// 38f: ldc 10.0
// 391: ldc 10.0
// 393: aload 0
// 394: getfield su/catlean/xs.q Lsu/catlean/fd;
// 397: invokevirtual su/catlean/fd.a ()F
// 39a: fmul
// 39b: fsub
// 39c: f2d
// 39d: dadd
// 39e: fload 5
// 3a0: f2d
// 3a1: fconst_2
// 3a2: f2d
// 3a3: dadd
// 3a4: fconst_0
// 3a5: fconst_0
// 3a6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3a9: getstatic java/awt/Color.RED Ljava/awt/Color;
// 3ac: dup
// 3ad: sipush 31738
// 3b0: ldc2_w 7673374918927302235
// 3b3: lload 1
// 3b4: lxor
// 3b5: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/xs.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ba: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3bd: aload 0
// 3be: getfield su/catlean/xs.q Lsu/catlean/fd;
// 3c1: invokevirtual su/catlean/fd.a ()F
// 3c4: iload 21
// 3c6: i2c
// 3c7: swap
// 3c8: iload 22
// 3ca: swap
// 3cb: iload 23
// 3cd: i2s
// 3ce: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3d1: aconst_null
// 3d2: fconst_0
// 3d3: sipush 20824
// 3d6: ldc2_w 2025492924081719925
// 3d9: lload 1
// 3da: lxor
// 3db: invokedynamic p (IJ)I bsm=su/catlean/xs.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e0: lload 19
// 3e2: aconst_null
// 3e3: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 3e6: goto 3f3
// 3e9: ldc2_w 9048553991845477148
// 3ec: lload 1
// 3ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f2: athrow
// 3f3: lload 1
// 3f4: lconst_0
// 3f5: lcmp
// 3f6: iflt 412
// 3f9: ldc2_w 9058670983393469223
// 3fc: lload 1
// 3fd: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 402: ifnull 41f
// 405: bipush 1
// 406: anewarray 1
// 409: ldc2_w 9028567627742395345
// 40c: lload 1
// 40d: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 412: goto 41f
// 415: ldc2_w 9048553991845477148
// 418: lload 1
// 419: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41e: athrow
// 41f: return
}

@Override
public boolean P(float x, float y, int button, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: lload 4
// 02: dup2
// 03: ldc2_w 118079633004369
// 06: lxor
// 07: lstore 6
// 09: pop2
// 0a: ldc2_w 8999282579518979155
// 0d: lload 4
// 0f: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14: astore 8
// 16: aload 0
// 17: getfield su/catlean/xs.I Z
// 1a: aload 8
// 1c: ifnull 4d
// 1f: ifeq 4c
// 22: goto 30
// 25: ldc2_w 8960750882887465684
// 28: lload 4
// 2a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f: athrow
// 30: getstatic su/catlean/c7.b Lsu/catlean/c7;
// 33: aload 0
// 34: getfield su/catlean/xs.r Ljava/lang/String;
// 37: lload 6
// 39: dup2_x1
// 3a: pop2
// 3b: invokevirtual su/catlean/c7.j (JLjava/lang/String;)Z
// 3e: pop
// 3f: bipush 1
// 40: ireturn
// 41: ldc2_w 8960750882887465684
// 44: lload 4
// 46: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b: athrow
// 4c: bipush 0
// 4d: ireturn
}

public static void C(String[] var0) {
C = var0;
}

public static String[] u() {
return C;
}

static {
long var25 = a ^ 138495489361584L;
String[] var10000 = new String[1];
vm.a<"Å">(var10000, -346792541960159819L, var25);
Cipher var16;
Cipher var29 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var29.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[10];
int var21 = 0;
String var20 = "\u009c\u0088\u0094×\u007fX\u008fÄ\bYÜ[Å§\u001dð\u0098*¢×¾Bv\u008f\u0010\u00109Å]\n|SÃFßþ¨ó\u0003[Ø\u0010ô9\u001f;d\u0087\u0089}ô\u001fîÅaHþú\u0010\u001d¸ç\u00816A¥[à\u0017D\u0016½åÒI\u0010:\u009eñ)#@¯R·w½÷f\u001ceà\u0010)\u0093¡:\b\u008aíé§\u0012³\"ß°p3\u0010°éfú£ó1\u009aÊéÈjßíº¥\u0010$\u0094NBùµö\u0093\u009e\u0089\u0012§\u008fnÅ\u0090";
int var22 = "\u009c\u0088\u0094×\u007fX\u008fÄ\bYÜ[Å§\u001dð\u0098*¢×¾Bv\u008f\u0010\u00109Å]\n|SÃFßþ¨ó\u0003[Ø\u0010ô9\u001f;d\u0087\u0089}ô\u001fîÅaHþú\u0010\u001d¸ç\u00816A¥[à\u0017D\u0016½åÒI\u0010:\u009eñ)#@¯R·w½÷f\u001ceà\u0010)\u0093¡:\b\u008aíé§\u0012³\"ß°p3\u0010°éfú£ó1\u009aÊéÈjßíº¥\u0010$\u0094NBùµö\u0093\u009e\u0089\u0012§\u008fnÅ\u0090"
.length();
char var19 = 24;
int var28 = -1;

label56:
while (true) {
String var30 = var20.substring(++var28, var28 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var30.getBytes("ISO-8859-1"));
String var41 = a(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var41;
if ((var28 += var19) >= var22) {
c = var23;
d = new String[10];
h = new HashMap(13);
Cipher var5;
Cipher var32 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var32.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[2];
int var8 = 0;
String var9 = "²m\u0085[YE-\u0016ý\u0096Ã\u0007Á±6°";
int var10 = "²m\u0085[YE-\u0016ý\u0096Ã\u0007Á±6°".length();
byte var7 = 0;

do {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
var10001 = var8++;
long var13 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
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
long var10004 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
byte var48 = -1;
var11[var10001] = var10004;
} while (var7 < var10);

e = var11;
g = new Integer[2];
Cipher var0;
Cipher var33 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var33.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 7348235890172288765L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var46 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var39 = -1;
i = var46;
return;
}

var19 = var20.charAt(var28);
break;
default:
var23[var21++] = var41;
if ((var28 += var19) < var22) {
var19 = var20.charAt(var28);
continue label56;
}

var20 = "Ñ\u0010\u009bÑU³Ë\u009e\u009flÍä\u0092j¯\u0088ZÑ\u0007l\u008dTwQ¬$ã{(\u0096\u0089µ8, \u0081\u008dñû\u009dß?\u0086!\u0082û¡\u0001\u00adÊã;ôß[\u001cÿðOâ\u001c<v\u0014Ùû¥±\u0086\u0084³M¨4ÓúãÇh\u0013ÞÒÃ@½GÃ1ñ";
var22 = "Ñ\u0010\u009bÑU³Ë\u009e\u009flÍä\u0092j¯\u0088ZÑ\u0007l\u008dTwQ¬$ã{(\u0096\u0089µ8, \u0081\u008dñû\u009dß?\u0086!\u0082û¡\u0001\u00adÊã;ôß[\u001cÿðOâ\u001c<v\u0014Ùû¥±\u0086\u0084³M¨4ÓúãÇh\u0013ÞÒÃ@½GÃ1ñ"
.length();
var19 = ' ';
var28 = -1;
}

var30 = var20.substring(++var28, var28 + var19);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 14659;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])b.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
b.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/xs", var10);
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
throw new RuntimeException("su/catlean/xs" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26570;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = e[var3];
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
throw new RuntimeException("su/catlean/xs", var14);
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
throw new RuntimeException("su/catlean/xs" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
