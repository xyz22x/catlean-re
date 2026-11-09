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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class n8 {
@NotNull
public static final n8 W;
private static float z;
@NotNull
private static final bg F;
@NotNull
private static final bg O;
private static boolean V;
private static float r;
private static long v;
private static final long a = yz.a(-8594906701976024921L, 3442588459598677257L, MethodHandles.lookup().lookupClass()).a(111904850753440L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

private n8() {
}

public final float Z() {
return z;
}

public final void y(float <set-?>) {
z = <set-?>;
}

@NotNull
public final bg J() {
return F;
}

@NotNull
public final bg n() {
return O;
}

public final boolean e() {
return V;
}

public final void Y(boolean <set-?>) {
V = <set-?>;
}

public final float d() {
return r;
}

public final void X(float <set-?>) {
r = <set-?>;
}

public final long V() {
return v;
}

public final void Q(long <set-?>) {
v = <set-?>;
}

public final void G(float damage, long a) {
ax = a ^ ax;
_g[] var10000 = vm.a<"Å">(2581986106789195735L, ax);
z = damage;
_g[] var4 = var10000;

label22: {
label21: {
try {
F.l();
var7 = V;
if (var4 == null) {
break label22;
}

if (!V) {
break label21;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 2541008612338407215L, ax);
}

var7 = false;
break label22;
}

var7 = true;
}

V = var7;
}

public final void P() {
O.l();
}

public final boolean r(
@Nullable t_ damage,
int a,
boolean random,
int a,
@NotNull zz damageSync,
boolean facePlaceSync,
short a,
boolean lowCrystals,
float stacksLeft,
float minDamage
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 2
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 4
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 32
// 00d: lushr
// 00e: lor
// 00f: iload 7
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/n8.a J
// 01c: lxor
// 01d: lstore 11
// 01f: lload 11
// 021: dup2
// 022: ldc2_w 138492981247517
// 025: lxor
// 026: lstore 13
// 028: dup2
// 029: ldc2_w 115011336404058
// 02c: lxor
// 02d: lstore 15
// 02f: dup2
// 030: ldc2_w 85316080549598
// 033: lxor
// 034: lstore 17
// 036: dup2
// 037: ldc2_w 28553921348949
// 03a: lxor
// 03b: lstore 19
// 03d: dup2
// 03e: ldc2_w 49513845865249
// 041: lxor
// 042: lstore 21
// 044: pop2
// 045: ldc2_w 1200612662861880491
// 048: lload 11
// 04a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: astore 23
// 051: aload 5
// 053: aload 23
// 055: ifnull 08a
// 058: sipush 24436
// 05b: ldc2_w 4406381940234907207
// 05e: lload 11
// 060: lxor
// 061: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/n8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 069: aload 1
// 06a: ifnonnull 088
// 06d: goto 07b
// 070: ldc2_w 1170682648377271379
// 073: lload 11
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: bipush 1
// 07c: ireturn
// 07d: ldc2_w 1170682648377271379
// 080: lload 11
// 082: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: athrow
// 088: aload 5
// 08a: getstatic su/catlean/zz.OFF Lsu/catlean/zz;
// 08d: iload 7
// 08f: ifgt 0ba
// 092: aload 23
// 094: ifnull 0ba
// 097: if_acmpne 0b5
// 09a: goto 0a8
// 09d: ldc2_w 1170682648377271379
// 0a0: lload 11
// 0a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a7: athrow
// 0a8: bipush 1
// 0a9: ireturn
// 0aa: ldc2_w 1170682648377271379
// 0ad: lload 11
// 0af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b4: athrow
// 0b5: aload 5
// 0b7: getstatic su/catlean/zz.CONDITIONS Lsu/catlean/zz;
// 0ba: if_acmpne 1e3
// 0bd: iload 8
// 0bf: aload 23
// 0c1: iload 4
// 0c3: ifle 142
// 0c6: ifnull 140
// 0c9: goto 0d7
// 0cc: ldc2_w 1170682648377271379
// 0cf: lload 11
// 0d1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d6: athrow
// 0d7: ifeq 13e
// 0da: goto 0e8
// 0dd: ldc2_w 1170682648377271379
// 0e0: lload 11
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0eb: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
// 0ee: dup
// 0ef: sipush 10131
// 0f2: ldc2_w 7866266271281878689
// 0f5: lload 11
// 0f7: lxor
// 0f8: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/n8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 100: bipush 1
// 101: lload 15
// 103: invokevirtual su/catlean/gg.O (Lnet/minecraft/class_1792;ZJ)I
// 106: i2f
// 107: sipush 25028
// 10a: ldc2_w 8609007903186032505
// 10d: lload 11
// 10f: lxor
// 110: invokedynamic y (IJ)I bsm=su/catlean/n8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: i2f
// 116: fload 9
// 118: fmul
// 119: fcmpg
// 11a: aload 23
// 11c: ifnull 1b4
// 11f: goto 12d
// 122: ldc2_w 1170682648377271379
// 125: lload 11
// 127: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12c: athrow
// 12d: ifle 1b3
// 130: goto 13e
// 133: ldc2_w 1170682648377271379
// 136: lload 11
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: iload 6
// 140: aload 23
// 142: iload 4
// 144: iflt 16f
// 147: ifnull 16d
// 14a: ifeq 1b7
// 14d: goto 15b
// 150: ldc2_w 1170682648377271379
// 153: lload 11
// 155: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15a: athrow
// 15b: aload 1
// 15c: invokevirtual su/catlean/t_.Y ()Z
// 15f: goto 16d
// 162: ldc2_w 1170682648377271379
// 165: lload 11
// 167: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16c: athrow
// 16d: aload 23
// 16f: iload 7
// 171: ifgt 19f
// 174: ifnull 19d
// 177: ifne 1b7
// 17a: goto 188
// 17d: ldc2_w 1170682648377271379
// 180: lload 11
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: aload 1
// 189: invokevirtual su/catlean/t_.c ()F
// 18c: fload 10
// 18e: fcmpg
// 18f: goto 19d
// 192: ldc2_w 1170682648377271379
// 195: lload 11
// 197: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19c: athrow
// 19d: aload 23
// 19f: ifnull 1b4
// 1a2: ifge 1b7
// 1a5: goto 1b3
// 1a8: ldc2_w 1170682648377271379
// 1ab: lload 11
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: athrow
// 1b3: bipush 1
// 1b4: goto 1b8
// 1b7: bipush 0
// 1b8: istore 24
// 1ba: iload 24
// 1bc: aload 23
// 1be: iload 2
// 1bf: iflt 1ef
// 1c2: ifnull 1ed
// 1c5: ifne 1e3
// 1c8: goto 1d6
// 1cb: ldc2_w 1170682648377271379
// 1ce: lload 11
// 1d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d5: athrow
// 1d6: bipush 1
// 1d7: ireturn
// 1d8: ldc2_w 1170682648377271379
// 1db: lload 11
// 1dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: athrow
// 1e3: aload 1
// 1e4: invokevirtual su/catlean/t_.c ()F
// 1e7: getstatic su/catlean/n8.z F
// 1ea: fsub
// 1eb: fconst_2
// 1ec: fcmpl
// 1ed: aload 23
// 1ef: ifnull 204
// 1f2: ifle 205
// 1f5: goto 203
// 1f8: ldc2_w 1170682648377271379
// 1fb: lload 11
// 1fd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 202: athrow
// 203: bipush 1
// 204: ireturn
// 205: getstatic su/catlean/n8.F Lsu/catlean/bg;
// 208: ldc 510.0
// 20a: iload 3
// 20b: aload 23
// 20d: ifnull 22f
// 210: ifeq 232
// 213: goto 221
// 216: ldc2_w 1170682648377271379
// 219: lload 11
// 21b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 220: athrow
// 221: sipush 15531
// 224: ldc2_w 4657755593597045268
// 227: lload 11
// 229: lxor
// 22a: invokedynamic y (IJ)I bsm=su/catlean/n8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22f: goto 233
// 232: bipush 0
// 233: i2f
// 234: fadd
// 235: getstatic su/catlean/nf.Z Lsu/catlean/nf;
// 238: lload 17
// 23a: invokevirtual su/catlean/nf.g (J)F
// 23d: fdiv
// 23e: f2i
// 23f: lload 21
// 241: invokevirtual su/catlean/bg.c (IJ)Z
// 244: aload 23
// 246: iload 7
// 248: ifge 27e
// 24b: ifnull 27c
// 24e: ifeq 26c
// 251: goto 25f
// 254: ldc2_w 1170682648377271379
// 257: lload 11
// 259: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25e: athrow
// 25f: bipush 1
// 260: ireturn
// 261: ldc2_w 1170682648377271379
// 264: lload 11
// 266: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 26b: athrow
// 26c: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 26f: bipush 0
// 270: bipush 1
// 271: aconst_null
// 272: lload 13
// 274: invokestatic su/catlean/ex.q (Lsu/catlean/ex;ZILjava/lang/Object;J)Ljava/util/List;
// 277: invokeinterface java/util/List.isEmpty ()Z 1
// 27c: aload 23
// 27e: ifnull 293
// 281: ifne 294
// 284: goto 292
// 287: ldc2_w 1170682648377271379
// 28a: lload 11
// 28c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 291: athrow
// 292: bipush 1
// 293: ireturn
// 294: lload 19
// 296: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 299: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 29c: iload 2
// 29d: iflt 2d0
// 2a0: aload 23
// 2a2: ifnull 2d0
// 2a5: ifnull 387
// 2a8: goto 2b6
// 2ab: ldc2_w 1170682648377271379
// 2ae: lload 11
// 2b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b5: athrow
// 2b6: lload 19
// 2b8: invokestatic su/catlean/zf.k (J)Lnet/minecraft/class_634;
// 2bb: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
// 2be: dup
// 2bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 2c2: goto 2d0
// 2c5: ldc2_w 1170682648377271379
// 2c8: lload 11
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
// 2d3: dup
// 2d4: sipush 21509
// 2d7: ldc2_w 8930585203007186228
// 2da: lload 11
// 2dc: lxor
// 2dd: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/n8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2e5: checkcast java/lang/CharSequence
// 2e8: sipush 8296
// 2eb: ldc2_w 3875180119227863384
// 2ee: lload 11
// 2f0: lxor
// 2f1: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/n8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f6: checkcast java/lang/CharSequence
// 2f9: bipush 0
// 2fa: bipush 2
// 2fb: aconst_null
// 2fc: invokestatic kotlin/text/StringsKt.contains$default (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
// 2ff: aload 23
// 301: ifnull 388
// 304: ifeq 387
// 307: goto 315
// 30a: ldc2_w 1170682648377271379
// 30d: lload 11
// 30f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 314: athrow
// 315: getstatic su/catlean/n8.V Z
// 318: aload 23
// 31a: iload 4
// 31c: iflt 366
// 31f: ifnull 364
// 322: goto 330
// 325: ldc2_w 1170682648377271379
// 328: lload 11
// 32a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32f: athrow
// 330: ifeq 34e
// 333: goto 341
// 336: ldc2_w 1170682648377271379
// 339: lload 11
// 33b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 340: athrow
// 341: bipush 1
// 342: ireturn
// 343: ldc2_w 1170682648377271379
// 346: lload 11
// 348: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34d: athrow
// 34e: getstatic su/catlean/n8.O Lsu/catlean/bg;
// 351: sipush 19859
// 354: ldc2_w 1227625430336650031
// 357: lload 11
// 359: lxor
// 35a: invokedynamic y (IJ)I bsm=su/catlean/n8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35f: lload 21
// 361: invokevirtual su/catlean/bg.c (IJ)Z
// 364: aload 23
// 366: ifnull 388
// 369: ifne 387
// 36c: goto 37a
// 36f: ldc2_w 1170682648377271379
// 372: lload 11
// 374: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 379: athrow
// 37a: bipush 1
// 37b: ireturn
// 37c: ldc2_w 1170682648377271379
// 37f: lload 11
// 381: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 386: athrow
// 387: bipush 0
// 388: ireturn
}

public final void Y(long a, float damage) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/n8.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: ldc2_w 9218629032220341229
// 09: lload 1
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 4
// 11: fload 3
// 12: aload 4
// 14: ifnull 35
// 17: fconst_0
// 18: fcmpg
// 19: ifge 34
// 1c: goto 29
// 1f: ldc2_w 9185462193243736853
// 22: lload 1
// 23: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: athrow
// 29: return
// 2a: ldc2_w 9185462193243736853
// 2d: lload 1
// 2e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33: athrow
// 34: fload 3
// 35: putstatic su/catlean/n8.r F
// 38: invokestatic su/catlean/zf.A ()J
// 3b: putstatic su/catlean/n8.v J
// 3e: return
}

public final float K(float currentDamage) {
return currentDamage;
}

public final void f() {
z = 0.0F;
r = 0.0F;
v = 0L;
}

static {
long var11 = a ^ 119406026992802L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[4];
int var18 = 0;
String var17 = "¬hß\u0007\u0090æ%_\u009b\nhæq\u008bx\u0088\u0010\u0003ÈmÀ{ä°\u008e-)T\u0092,9\u0018Ô";
int var19 = "¬hß\u0007\u0090æ%_\u009b\nhæq\u008bx\u0088\u0010\u0003ÈmÀ{ä°\u008e-)T\u0092,9\u0018Ô".length();
char var16 = 16;
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
b = var20;
c = new String[4];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "B\u0094C±\u001b\u0010\u0000\u0007ãØÝµØÖÎA¥Ùª\u009a#\u0092\"¸";
int var5 = "B\u0094C±\u001b\u0010\u0000\u0007ãØÝµØÖÎA¥Ùª\u009a#\u0092\"¸".length();
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

e = var6;
f = new Integer[3];
W = new n8();
F = new bg();
O = new bg();
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

var17 = "l\u00adªî\u001a\u0083ë\u008ae®ð_\u008c\u001aø`ø\"6îà#¤Á@\u001c\u0006\u0098ÓD\u009d9\u0018\u009bè\u000f*Ùò·òÐ\u0096\u0086yJ.XÃ)'dy\u0098ìì¡";
var19 = "l\u00adªî\u001a\u0083ë\u008ae®ð_\u008c\u001aø`ø\"6îà#¤Á@\u001c\u0006\u0098ÓD\u009d9\u0018\u009bè\u000f*Ùò·òÐ\u0096\u0086yJ.XÃ)'dy\u0098ìì¡".length();
var16 = ' ';
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 8367;
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
throw new RuntimeException("su/catlean/n8", var10);
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
throw new RuntimeException("su/catlean/n8" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 26403;
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
throw new RuntimeException("su/catlean/n8", var14);
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
throw new RuntimeException("su/catlean/n8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
