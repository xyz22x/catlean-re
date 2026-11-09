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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fz extends f6 {
@NotNull
public static final b I;
@NotNull
private final String K;
private float h;
@NotNull
private j0 M;
@NotNull
private final Function1 z;
@NotNull
private String T;
@Nullable
private static fz a;
private static final long b = yz.a(5052450183283551086L, 5507643534843729265L, MethodHandles.lookup().lookupClass()).a(193059715013021L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map i;
private static final long j;

public fz(@NotNull String name, float width, @NotNull j0 suggestions, long a, @NotNull Function1 onChange) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(name, a<"p">(9807, 9115395921129193977L ^ ax));
Intrinsics.checkNotNullParameter(suggestions, a<"p">(8601, 572654170049103398L ^ ax));
Intrinsics.checkNotNullParameter(onChange, a<"p">(12825, 1932315895696643501L ^ ax));
super();
this.K = name;
this.h = width;
this.M = suggestions;
this.z = onChange;
this.T = "";
}

public fz(String var1, float var2, j0 var3, long var4, Function1 var6, int var7, DefaultConstructorMarker var8) {
var4 = b ^ var4;
long var9 = var4 ^ 62441869750775L;
long var11 = var4 ^ 107027732693566L;
if ((var7 & 4) != 0) {
var3 = new j0(CollectionsKt.emptyList(), var9);
}

this(var1, var2, var3, var11, var6);
}

@NotNull
public final String h() {
return this.K;
}

public final float f() {
return this.h;
}

public final void j(float <set-?>) {
this.h = <set-?>;
}

@NotNull
public final j0 u() {
return this.M;
}

public final void d(long a, @NotNull j0 <set-?>) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"p">(32031, 2794430606242401445L ^ ax));
this.M = <set-?>;
}

@NotNull
public final String m() {
return this.T;
}

public final void M(long a, @NotNull String value) {
ax = b ^ ax;
Intrinsics.checkNotNullParameter(value, a<"p">(15986, 5118932570117132674L ^ ax));
this.T = value;
this.z.invoke(this);
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
// 002: ldc2_w 134444255136690
// 005: lxor
// 006: lstore 8
// 008: dup2
// 009: ldc2_w 122872324218116
// 00c: lxor
// 00d: dup2
// 00e: bipush 48
// 010: lushr
// 011: l2i
// 012: istore 10
// 014: dup2
// 015: bipush 16
// 017: lshl
// 018: bipush 48
// 01a: lushr
// 01b: l2i
// 01c: istore 11
// 01e: dup2
// 01f: bipush 32
// 021: lshl
// 022: bipush 32
// 024: lushr
// 025: l2i
// 026: istore 12
// 028: pop2
// 029: dup2
// 02a: ldc2_w 15727589290443
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 81101117301204
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 18592005668209
// 03b: lxor
// 03c: lstore 17
// 03e: dup2
// 03f: ldc2_w 6627968639251
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
// 066: pop2
// 067: ldc2_w 9041135080979609510
// 06a: lload 1
// 06b: invokedynamic Å (JJ)Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: aload 3
// 071: sipush 31691
// 074: ldc2_w 532036339478108757
// 077: lload 1
// 078: lxor
// 079: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 081: astore 39
// 083: fload 4
// 085: fload 6
// 087: fcmpg
// 088: aload 39
// 08a: ifnull 0b7
// 08d: ifgt 0de
// 090: goto 09d
// 093: ldc2_w 9024805019423380936
// 096: lload 1
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: fload 6
// 09f: fload 4
// 0a1: aload 0
// 0a2: getfield su/catlean/fz.h F
// 0a5: ldc 88.0
// 0a7: fsub
// 0a8: fadd
// 0a9: fcmpg
// 0aa: goto 0b7
// 0ad: ldc2_w 9024805019423380936
// 0b0: lload 1
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: aload 39
// 0b9: ifnull 0db
// 0bc: ifgt 0da
// 0bf: goto 0cc
// 0c2: ldc2_w 9024805019423380936
// 0c5: lload 1
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: bipush 1
// 0cd: goto 0df
// 0d0: ldc2_w 9024805019423380936
// 0d3: lload 1
// 0d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d9: athrow
// 0da: bipush 0
// 0db: goto 0df
// 0de: bipush 0
// 0df: lload 1
// 0e0: lconst_0
// 0e1: lcmp
// 0e2: ifle 0ed
// 0e5: ifeq 214
// 0e8: fload 5
// 0ea: fload 7
// 0ec: fcmpg
// 0ed: aload 39
// 0ef: lload 1
// 0f0: lconst_0
// 0f1: lcmp
// 0f2: iflt 12c
// 0f5: ifnull 12a
// 0f8: goto 105
// 0fb: ldc2_w 9024805019423380936
// 0fe: lload 1
// 0ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: athrow
// 105: ifgt 151
// 108: goto 115
// 10b: ldc2_w 9024805019423380936
// 10e: lload 1
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: fload 7
// 117: fload 5
// 119: ldc 13.0
// 11b: fadd
// 11c: fcmpg
// 11d: goto 12a
// 120: ldc2_w 9024805019423380936
// 123: lload 1
// 124: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 129: athrow
// 12a: aload 39
// 12c: ifnull 14e
// 12f: ifgt 14d
// 132: goto 13f
// 135: ldc2_w 9024805019423380936
// 138: lload 1
// 139: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13e: athrow
// 13f: bipush 1
// 140: goto 152
// 143: ldc2_w 9024805019423380936
// 146: lload 1
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: bipush 0
// 14e: goto 152
// 151: bipush 0
// 152: ifeq 214
// 155: getstatic su/catlean/s1.d Lsu/catlean/s1;
// 158: invokevirtual su/catlean/s1.r ()Ljava/util/Set;
// 15b: checkcast java/lang/Iterable
// 15e: astore 41
// 160: bipush 0
// 161: istore 42
// 163: aload 41
// 165: aload 39
// 167: ifnull 1b9
// 16a: instanceof java/util/Collection
// 16d: ifeq 1b7
// 170: goto 17d
// 173: ldc2_w 9024805019423380936
// 176: lload 1
// 177: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17c: athrow
// 17d: aload 41
// 17f: checkcast java/util/Collection
// 182: aload 39
// 184: ifnull 1b9
// 187: goto 194
// 18a: ldc2_w 9024805019423380936
// 18d: lload 1
// 18e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: athrow
// 194: invokeinterface java/util/Collection.isEmpty ()Z 1
// 199: ifeq 1b7
// 19c: goto 1a9
// 19f: ldc2_w 9024805019423380936
// 1a2: lload 1
// 1a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a8: athrow
// 1a9: bipush 1
// 1aa: goto 1fd
// 1ad: ldc2_w 9024805019423380936
// 1b0: lload 1
// 1b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b6: athrow
// 1b7: aload 41
// 1b9: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1be: astore 43
// 1c0: aload 43
// 1c2: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1c7: ifeq 1fc
// 1ca: aload 43
// 1cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1d1: astore 44
// 1d3: aload 44
// 1d5: checkcast su/catlean/i8
// 1d8: astore 45
// 1da: bipush 0
// 1db: istore 46
// 1dd: aload 45
// 1df: invokevirtual su/catlean/i8.W ()Lsu/catlean/cu;
// 1e2: ifnonnull 1e9
// 1e5: bipush 1
// 1e6: goto 1ea
// 1e9: bipush 0
// 1ea: ifne 1c0
// 1ed: bipush 0
// 1ee: lload 1
// 1ef: lconst_0
// 1f0: lcmp
// 1f1: ifle 1db
// 1f4: aload 39
// 1f6: ifnull 1db
// 1f9: goto 1fd
// 1fc: bipush 1
// 1fd: lload 1
// 1fe: lconst_0
// 1ff: lcmp
// 200: iflt 207
// 203: ifeq 214
// 206: bipush 1
// 207: goto 215
// 20a: ldc2_w 9024805019423380936
// 20d: lload 1
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: bipush 0
// 215: istore 40
// 217: lload 1
// 218: lconst_0
// 219: lcmp
// 21a: iflt 239
// 21d: iload 40
// 21f: ifeq 239
// 222: getstatic su/catlean/s1.d Lsu/catlean/s1;
// 225: aload 0
// 226: checkcast su/catlean/f6
// 229: invokevirtual su/catlean/s1.j (Lsu/catlean/f6;)V
// 22c: goto 239
// 22f: ldc2_w 9024805019423380936
// 232: lload 1
// 233: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 238: athrow
// 239: aload 3
// 23a: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 23d: dup
// 23e: sipush 30162
// 241: ldc2_w 377376878549636173
// 244: lload 1
// 245: lxor
// 246: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 24e: fload 4
// 250: fload 5
// 252: aload 0
// 253: getfield su/catlean/fz.h F
// 256: ldc 88.0
// 258: fsub
// 259: ldc 13.0
// 25b: fconst_2
// 25c: iload 40
// 25e: ifeq 26f
// 261: fconst_2
// 262: goto 270
// 265: ldc2_w 9024805019423380936
// 268: lload 1
// 269: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26e: athrow
// 26f: fconst_0
// 270: fconst_0
// 271: fconst_1
// 272: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 275: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 278: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 27b: dup
// 27c: sipush 484
// 27f: ldc2_w 7539454566563733624
// 282: lload 1
// 283: lxor
// 284: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 28c: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 28f: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 292: fconst_0
// 293: fconst_0
// 294: fconst_0
// 295: sipush 21151
// 298: ldc2_w 7209100076379883044
// 29b: lload 1
// 29c: lxor
// 29d: invokedynamic q (IJ)I bsm=su/catlean/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: aconst_null
// 2a3: astore 24
// 2a5: istore 25
// 2a7: fstore 26
// 2a9: fstore 27
// 2ab: fstore 28
// 2ad: astore 29
// 2af: astore 30
// 2b1: fstore 31
// 2b3: fstore 32
// 2b5: fstore 33
// 2b7: fstore 34
// 2b9: fstore 35
// 2bb: fstore 36
// 2bd: fstore 37
// 2bf: fstore 38
// 2c1: iload 10
// 2c3: i2c
// 2c4: fload 38
// 2c6: fload 37
// 2c8: fload 36
// 2ca: fload 35
// 2cc: fload 34
// 2ce: fload 33
// 2d0: fload 32
// 2d2: fload 31
// 2d4: aload 30
// 2d6: aload 29
// 2d8: fload 28
// 2da: iload 11
// 2dc: i2s
// 2dd: fload 27
// 2df: iload 12
// 2e1: fload 26
// 2e3: iload 25
// 2e5: aload 24
// 2e7: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 2ea: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2ed: aload 3
// 2ee: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2f1: dup
// 2f2: sipush 15762
// 2f5: ldc2_w 1463253224221858816
// 2f8: lload 1
// 2f9: lxor
// 2fa: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ff: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 302: fload 4
// 304: ldc 30.0
// 306: fadd
// 307: fload 5
// 309: fconst_2
// 30a: fadd
// 30b: ldc 0.5
// 30d: ldc 9.0
// 30f: bipush 1
// 310: anewarray 440
// 313: astore 41
// 315: aload 41
// 317: bipush 0
// 318: new java/awt/Color
// 31b: dup
// 31c: sipush 29786
// 31f: ldc2_w 6457124564173250784
// 322: lload 1
// 323: lxor
// 324: invokedynamic q (IJ)I bsm=su/catlean/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 329: bipush 1
// 32a: invokespecial java/awt/Color.<init> (IZ)V
// 32d: aastore
// 32e: aload 41
// 330: lload 19
// 332: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 335: lload 15
// 337: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 33a: aload 3
// 33b: aload 0
// 33c: getfield su/catlean/fz.K Ljava/lang/String;
// 33f: fload 4
// 341: ldc 14.0
// 343: fadd
// 344: fload 5
// 346: ldc 5.5
// 348: fadd
// 349: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 34c: dup
// 34d: sipush 11667
// 350: ldc2_w 1305243921283468296
// 353: lload 1
// 354: lxor
// 355: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 35d: lload 17
// 35f: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 362: aload 0
// 363: getfield su/catlean/fz.M Lsu/catlean/j0;
// 366: aload 0
// 367: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 36a: lload 8
// 36c: invokevirtual su/catlean/j0.X (Ljava/lang/String;J)Ljava/lang/String;
// 36f: astore 41
// 371: aload 41
// 373: checkcast java/lang/CharSequence
// 376: astore 42
// 378: aload 42
// 37a: lload 1
// 37b: lconst_0
// 37c: lcmp
// 37d: iflt 397
// 380: aload 39
// 382: ifnull 397
// 385: ifnull 3b1
// 388: goto 395
// 38b: ldc2_w 9024805019423380936
// 38e: lload 1
// 38f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 394: athrow
// 395: aload 42
// 397: invokeinterface java/lang/CharSequence.length ()I 1
// 39c: aload 39
// 39e: ifnull 3b2
// 3a1: ifne 3b5
// 3a4: goto 3b1
// 3a7: ldc2_w 9024805019423380936
// 3aa: lload 1
// 3ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b0: athrow
// 3b1: bipush 1
// 3b2: goto 3b6
// 3b5: bipush 0
// 3b6: ifne 400
// 3b9: lload 15
// 3bb: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 3be: aload 3
// 3bf: aload 41
// 3c1: fload 4
// 3c3: ldc 38.0
// 3c5: fadd
// 3c6: lload 13
// 3c8: dup2_x1
// 3c9: pop2
// 3ca: fload 5
// 3cc: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 3cf: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 3d2: dup
// 3d3: sipush 31196
// 3d6: ldc2_w 8391389233615738953
// 3d9: lload 1
// 3da: lxor
// 3db: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3e3: iload 21
// 3e5: i2c
// 3e6: iload 22
// 3e8: ldc 0.5
// 3ea: iload 23
// 3ec: i2s
// 3ed: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3f0: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 3f3: goto 400
// 3f6: ldc2_w 9024805019423380936
// 3f9: lload 1
// 3fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ff: athrow
// 400: aload 0
// 401: aload 39
// 403: ifnull 46d
// 406: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 409: invokevirtual java/lang/String.length ()I
// 40c: sipush 17399
// 40f: ldc2_w 8009154838913603406
// 412: lload 1
// 413: lxor
// 414: invokedynamic q (IJ)I bsm=su/catlean/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 419: if_icmple 46c
// 41c: goto 429
// 41f: ldc2_w 9024805019423380936
// 422: lload 1
// 423: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 428: athrow
// 429: aload 0
// 42a: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 42d: aload 0
// 42e: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 431: invokevirtual java/lang/String.length ()I
// 434: sipush 32223
// 437: ldc2_w 3256818405415446887
// 43a: lload 1
// 43b: lxor
// 43c: invokedynamic q (IJ)I bsm=su/catlean/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 441: isub
// 442: aload 0
// 443: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 446: invokevirtual java/lang/String.length ()I
// 449: bipush 1
// 44a: isub
// 44b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
// 44e: dup
// 44f: sipush 18872
// 452: ldc2_w 4869974101583898670
// 455: lload 1
// 456: lxor
// 457: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 45f: goto 470
// 462: ldc2_w 9024805019423380936
// 465: lload 1
// 466: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46b: athrow
// 46c: aload 0
// 46d: invokevirtual su/catlean/fz.m ()Ljava/lang/String;
// 470: astore 42
// 472: getstatic su/catlean/fz.a Lsu/catlean/fz;
// 475: aload 0
// 476: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 479: aload 39
// 47b: lload 1
// 47c: lconst_0
// 47d: lcmp
// 47e: iflt 4b9
// 481: ifnull 4b7
// 484: ifeq 4d0
// 487: goto 494
// 48a: ldc2_w 9024805019423380936
// 48d: lload 1
// 48e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 493: athrow
// 494: invokestatic su/catlean/zf.A ()J
// 497: sipush 25828
// 49a: ldc2_w 1618605108899967067
// 49d: lload 1
// 49e: lxor
// 49f: invokedynamic q (IJ)I bsm=su/catlean/fz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a4: i2l
// 4a5: lrem
// 4a6: getstatic su/catlean/fz.j J
// 4a9: lcmp
// 4aa: goto 4b7
// 4ad: ldc2_w 9024805019423380936
// 4b0: lload 1
// 4b1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b6: athrow
// 4b7: aload 39
// 4b9: ifnull 4cd
// 4bc: ifle 4d0
// 4bf: goto 4cc
// 4c2: ldc2_w 9024805019423380936
// 4c5: lload 1
// 4c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4cb: athrow
// 4cc: bipush 1
// 4cd: goto 4d1
// 4d0: bipush 0
// 4d1: istore 43
// 4d3: lload 15
// 4d5: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 4d8: aload 3
// 4d9: iload 40
// 4db: lload 1
// 4dc: lconst_0
// 4dd: lcmp
// 4de: ifle 532
// 4e1: aload 39
// 4e3: ifnull 532
// 4e6: ifne 59d
// 4e9: goto 4f6
// 4ec: ldc2_w 9024805019423380936
// 4ef: lload 1
// 4f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f5: athrow
// 4f6: aload 0
// 4f7: getfield su/catlean/fz.K Ljava/lang/String;
// 4fa: aload 39
// 4fc: ifnull 59a
// 4ff: goto 50c
// 502: ldc2_w 9024805019423380936
// 505: lload 1
// 506: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50b: athrow
// 50c: checkcast java/lang/CharSequence
// 50f: sipush 14436
// 512: ldc2_w 5855446997623953917
// 515: lload 1
// 516: lxor
// 517: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51c: checkcast java/lang/CharSequence
// 51f: bipush 0
// 520: bipush 2
// 521: aconst_null
// 522: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 525: goto 532
// 528: ldc2_w 9024805019423380936
// 52b: lload 1
// 52c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 531: athrow
// 532: lload 1
// 533: lconst_0
// 534: lcmp
// 535: iflt 583
// 538: ifne 580
// 53b: aload 0
// 53c: getfield su/catlean/fz.K Ljava/lang/String;
// 53f: lload 1
// 540: lconst_0
// 541: lcmp
// 542: iflt 59f
// 545: aload 39
// 547: ifnull 59f
// 54a: goto 557
// 54d: ldc2_w 9024805019423380936
// 550: lload 1
// 551: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 556: athrow
// 557: checkcast java/lang/CharSequence
// 55a: sipush 25606
// 55d: ldc2_w 1997373334384608667
// 560: lload 1
// 561: lxor
// 562: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 567: checkcast java/lang/CharSequence
// 56a: bipush 0
// 56b: bipush 2
// 56c: aconst_null
// 56d: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 570: ifeq 59d
// 573: goto 580
// 576: ldc2_w 9024805019423380936
// 579: lload 1
// 57a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57f: athrow
// 580: sipush 29375
// 583: ldc2_w 515228265396835109
// 586: lload 1
// 587: lxor
// 588: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58d: goto 59a
// 590: ldc2_w 9024805019423380936
// 593: lload 1
// 594: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 599: athrow
// 59a: goto 5ba
// 59d: aload 42
// 59f: iload 43
// 5a1: ifeq 5b3
// 5a4: ldc "|"
// 5a6: goto 5b5
// 5a9: ldc2_w 9024805019423380936
// 5ac: lload 1
// 5ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b2: athrow
// 5b3: ldc ""
// 5b5: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 5ba: fload 4
// 5bc: ldc 38.0
// 5be: fadd
// 5bf: lload 13
// 5c1: dup2_x1
// 5c2: pop2
// 5c3: fload 5
// 5c5: ldc 0.5
// 5c7: fadd
// 5c8: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 5cb: dup
// 5cc: sipush 31196
// 5cf: ldc2_w 8391389233615738953
// 5d2: lload 1
// 5d3: lxor
// 5d4: invokedynamic p (IJ)Ljava/lang/String; bsm=su/catlean/fz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5d9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5dc: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 5df: lload 1
// 5e0: lconst_0
// 5e1: lcmp
// 5e2: ifle 5f7
// 5e5: aload 39
// 5e7: ifnonnull 604
// 5ea: bipush 4
// 5eb: anewarray 119
// 5ee: ldc2_w 9061519494403356669
// 5f1: lload 1
// 5f2: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5f7: goto 604
// 5fa: ldc2_w 9024805019423380936
// 5fd: lload 1
// 5fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 603: athrow
// 604: return
}

@Override
public boolean P(float x, float y, int button, long a) {
return false;
}

@Nullable
public final Unit P(char var1, int var2, char var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 104450534930928L;
long var8 = var4 ^ 110734535507752L;
String var10 = vm.a<"Å">(5709074273210631652L, var4);

String var10000;
label32: {
try {
if (var10 != null) {
var10000 = this.M.X(this.m(), var6);
if (var10000 != null) {
break label32;
}
}
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 5727638508063074186L, var4);
}

return null;
}

String var11 = var10000;
boolean var12 = false;
this.M(var8, var11);
return Unit.INSTANCE;
}

public static final fz Z() {
return a;
}

public static final void T(fz <set-?>) {
a = <set-?>;
}

static {
long var16 = b ^ 72928682163331L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[15];
int var23 = 0;
String var22 = "\u0000\u0014\u001a³ËE±q\u008c\u0085¡O\u009eXMî \u008b\u0088=¹é»\u0016\u0004¿/4È¯\u009f ã\u000b\u0014U¨w\u009fM!ã\u0011\u0016¥òô1Ç\u0010X\u0083!ZaL\u009d«û7'=\t÷\tx ýêj=\u0097\u000fs¬\t\u008cù\u009aè±*y\u009f¶¤ú\u0085µPÙ\u0099\u0085òCw~%\u0011\u0018ä´ÑN\u00ad½©\u0080\u0006ßõõ\u0013¸\u0082ò(<p\u008fr:§/\u0010ÊDÕ\fYúlréàA\u001e\u009bj\u0015&\u0010ËÊë\u0010\u009d[à¥g\u0018\u0011É\u0082ºd] ±\u0010È\u0081æ×åk/WÂ\u008c\tãL\u0082Í×F\u001b\u0083ÌKxE\u0006î\r2sMn\u0018\u0091&\u0016Ë¯\u0015/wi\"fYú¿v¬Q¾ò\u000b\u00adpB\u0086 L]ûéïð.Ña§æRGÝ9b\b\u0014\u0016\u009f¿\u0000\nÿZó+\u0000Û'_\n\u0010[´q\u009bz\u008eý\u001csyÖß£j\u0099×\u0010c\u008eÌ÷F·\u001e)Ñv\u0085¶\u007f!Ñ`\u0010^êÔÞ\u0015±aèJf¨J\u0091\u007fä\u0095";
int var24 = "\u0000\u0014\u001a³ËE±q\u008c\u0085¡O\u009eXMî \u008b\u0088=¹é»\u0016\u0004¿/4È¯\u009f ã\u000b\u0014U¨w\u009fM!ã\u0011\u0016¥òô1Ç\u0010X\u0083!ZaL\u009d«û7'=\t÷\tx ýêj=\u0097\u000fs¬\t\u008cù\u009aè±*y\u009f¶¤ú\u0085µPÙ\u0099\u0085òCw~%\u0011\u0018ä´ÑN\u00ad½©\u0080\u0006ßõõ\u0013¸\u0082ò(<p\u008fr:§/\u0010ÊDÕ\fYúlréàA\u001e\u009bj\u0015&\u0010ËÊë\u0010\u009d[à¥g\u0018\u0011É\u0082ºd] ±\u0010È\u0081æ×åk/WÂ\u008c\tãL\u0082Í×F\u001b\u0083ÌKxE\u0006î\r2sMn\u0018\u0091&\u0016Ë¯\u0015/wi\"fYú¿v¬Q¾ò\u000b\u00adpB\u0086 L]ûéïð.Ña§æRGÝ9b\b\u0014\u0016\u009f¿\u0000\nÿZó+\u0000Û'_\n\u0010[´q\u009bz\u008eý\u001csyÖß£j\u0099×\u0010c\u008eÌ÷F·\u001e)Ñv\u0085¶\u007f!Ñ`\u0010^êÔÞ\u0015±aèJf¨J\u0091\u007fä\u0095"
.length();
char var21 = 16;
int var29 = -1;

label64:
while (true) {
String var30 = var22.substring(++var29, var29 + var21);
int var10001 = -1;

while (true) {
byte[] var26 = var18.doFinal(var30.getBytes("ISO-8859-1"));
String var43 = a(var26).intern();
switch (var10001) {
case 0:
var25[var23++] = var43;
if ((var29 += var21) >= var24) {
c = var25;
d = new String[15];
i = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[5];
int var8 = 0;
String var9 = "kÂ\u001f¼\u0099\u0093¡Ø®\u0018à8ac«µ\u0005ð\u0014°ÑQ¾=";
int var10 = "kÂ\u001f¼\u0099\u0093¡Ø®\u0018à8ac«µ\u0005ð\u0014°ÑQ¾=".length();
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
f = var11;
g = new Integer[5];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -5065655843582881852L;
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
j = var50;
I = new b(null);
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "¼\u009fM\u0087h*øl\u0095^hO.èA.";
var10 = "¼\u009fM\u0087h*øl\u0095^hO.èA.".length();
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

var22 = "ûkÇü\u0080\\5\u0093\u0005\u0099\u0013m11Rºs»È?°K\u0092dÈÐ\u001cÚ\u0080{\u009at\u0010¼$ö\u009eª+r}À/sï½·b\u0001";
var24 = "ûkÇü\u0080\\5\u0093\u0005\u0099\u0013m11Rºs»È?°K\u0092dÈÐ\u001cÚ\u0080{\u009at\u0010¼$ö\u009eª+r}À/sï½·b\u0001".length();
var21 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 7548;
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
throw new RuntimeException("su/catlean/fz", var10);
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
throw new RuntimeException("su/catlean/fz" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26716;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/fz", var14);
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
throw new RuntimeException("su/catlean/fz" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
