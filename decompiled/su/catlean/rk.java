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

public final class rk extends ru {
@NotNull
private final a1 u;
@NotNull
private final fd h;
private boolean v;
private static final long b = yz.a(1649237000031516381L, -794842884603445305L, MethodHandles.lookup().lookupClass()).a(230624422831481L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] k;
private static final Map l;
private static final long m;

public rk(@NotNull a1 setting, long a) {
a = b ^ a;
long var4 = a ^ 75860303863861L;
long var6 = a ^ 54629145664089L;
Intrinsics.checkNotNullParameter(setting, a<"d">(21495, 7482091722943360077L ^ a));
super(var6, setting);
this.u = setting;
this.h = new fd(_s.OUT_QUINT, m, var4);
}

@NotNull
@Override
public a1 A() {
return this.u;
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
// 00a: ldc2_w 120713713833734
// 00d: lxor
// 00e: lstore 9
// 010: dup2
// 011: ldc2_w 20797107207379
// 014: lxor
// 015: dup2
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 11
// 01c: dup2
// 01d: bipush 16
// 01f: lshl
// 020: bipush 48
// 022: lushr
// 023: l2i
// 024: istore 12
// 026: dup2
// 027: bipush 32
// 029: lshl
// 02a: bipush 32
// 02c: lushr
// 02d: l2i
// 02e: istore 13
// 030: pop2
// 031: dup2
// 032: ldc2_w 39844814704388
// 035: lxor
// 036: lstore 14
// 038: dup2
// 039: ldc2_w 136713714549074
// 03c: lxor
// 03d: lstore 16
// 03f: dup2
// 040: ldc2_w 114903264084220
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
// 055: ldc2_w 120682356120742
// 058: lxor
// 059: lstore 24
// 05b: pop2
// 05c: ldc2_w 6640577628623117237
// 05f: lload 4
// 061: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: aload 1
// 067: sipush 18601
// 06a: ldc2_w 381190059179993552
// 06d: lload 4
// 06f: lxor
// 070: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/rk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 078: astore 26
// 07a: aload 0
// 07b: getfield su/catlean/rk.v Z
// 07e: ifeq 0be
// 081: sipush 23073
// 084: ldc2_w 7228623196682550105
// 087: lload 4
// 089: lxor
// 08a: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/rk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: bipush 3
// 090: bipush 4
// 091: i2d
// 092: invokestatic java/lang/System.currentTimeMillis ()J
// 095: sipush 28997
// 098: ldc2_w 2695439904384784979
// 09b: lload 4
// 09d: lxor
// 09e: invokedynamic e (IJ)I bsm=su/catlean/rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: i2l
// 0a4: lrem
// 0a5: l2d
// 0a6: ldc2_w 700.0
// 0a9: ddiv
// 0aa: dmul
// 0ab: d2i
// 0ac: isub
// 0ad: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 0b0: goto 0d3
// 0b3: ldc2_w 6630495664126261602
// 0b6: lload 4
// 0b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: athrow
// 0be: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 0c1: aload 0
// 0c2: invokevirtual su/catlean/rk.A ()Lsu/catlean/a1;
// 0c5: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0c8: checkcast su/catlean/lj
// 0cb: invokevirtual su/catlean/lj.X ()I
// 0ce: lload 9
// 0d0: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 0d3: astore 27
// 0d5: lload 22
// 0d7: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 0da: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 0dd: aload 0
// 0de: invokevirtual su/catlean/rk.A ()Lsu/catlean/a1;
// 0e1: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0e4: checkcast su/catlean/lj
// 0e7: invokevirtual su/catlean/lj.X ()I
// 0ea: lload 9
// 0ec: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 0ef: lload 16
// 0f1: dup2_x1
// 0f2: pop2
// 0f3: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 0f6: fstore 28
// 0f8: lload 18
// 0fa: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 0fd: aload 1
// 0fe: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 101: dup
// 102: sipush 32147
// 105: ldc2_w 469912414955232489
// 108: lload 4
// 10a: lxor
// 10b: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/rk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 113: aload 0
// 114: invokevirtual su/catlean/rk.A ()Lsu/catlean/a1;
// 117: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 11a: aload 0
// 11b: invokevirtual su/catlean/rk.x ()F
// 11e: aload 0
// 11f: invokevirtual su/catlean/rk.R ()F
// 122: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 125: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 128: lload 20
// 12a: dup2_x1
// 12b: pop2
// 12c: bipush 0
// 12d: bipush 0
// 12e: sipush 13125
// 131: ldc2_w 5538082627011467350
// 134: lload 4
// 136: lxor
// 137: invokedynamic e (IJ)I bsm=su/catlean/rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: aconst_null
// 13d: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 140: aload 0
// 141: getfield su/catlean/rk.h Lsu/catlean/fd;
// 144: aload 0
// 145: invokevirtual su/catlean/rk.x ()F
// 148: aload 0
// 149: invokevirtual su/catlean/rk.F ()F
// 14c: fadd
// 14d: fload 28
// 14f: fsub
// 150: ldc 15.0
// 152: fsub
// 153: fstore 29
// 155: aload 0
// 156: invokevirtual su/catlean/rk.x ()F
// 159: aload 0
// 15a: invokevirtual su/catlean/rk.F ()F
// 15d: fadd
// 15e: ldc 7.0
// 160: fsub
// 161: fstore 30
// 163: iload 2
// 164: i2f
// 165: fstore 31
// 167: fload 29
// 169: fload 31
// 16b: fcmpg
// 16c: aload 26
// 16e: lload 4
// 170: lconst_0
// 171: lcmp
// 172: ifle 19e
// 175: ifnull 19c
// 178: ifgt 1c5
// 17b: goto 189
// 17e: ldc2_w 6630495664126261602
// 181: lload 4
// 183: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 188: athrow
// 189: fload 31
// 18b: fload 30
// 18d: fcmpg
// 18e: goto 19c
// 191: ldc2_w 6630495664126261602
// 194: lload 4
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: aload 26
// 19e: ifnull 1c2
// 1a1: ifgt 1c1
// 1a4: goto 1b2
// 1a7: ldc2_w 6630495664126261602
// 1aa: lload 4
// 1ac: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: athrow
// 1b2: bipush 1
// 1b3: goto 1c6
// 1b6: ldc2_w 6630495664126261602
// 1b9: lload 4
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: bipush 0
// 1c2: goto 1c6
// 1c5: bipush 0
// 1c6: ifeq 24d
// 1c9: aload 0
// 1ca: invokevirtual su/catlean/rk.R ()F
// 1cd: fstore 29
// 1cf: aload 0
// 1d0: invokevirtual su/catlean/rk.R ()F
// 1d3: ldc 12.0
// 1d5: fadd
// 1d6: fstore 30
// 1d8: iload 3
// 1d9: i2f
// 1da: fstore 31
// 1dc: fload 29
// 1de: fload 31
// 1e0: fcmpg
// 1e1: aload 26
// 1e3: lload 4
// 1e5: lconst_0
// 1e6: lcmp
// 1e7: iflt 213
// 1ea: ifnull 211
// 1ed: ifgt 23a
// 1f0: goto 1fe
// 1f3: ldc2_w 6630495664126261602
// 1f6: lload 4
// 1f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: athrow
// 1fe: fload 31
// 200: fload 30
// 202: fcmpg
// 203: goto 211
// 206: ldc2_w 6630495664126261602
// 209: lload 4
// 20b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 210: athrow
// 211: aload 26
// 213: ifnull 237
// 216: ifgt 236
// 219: goto 227
// 21c: ldc2_w 6630495664126261602
// 21f: lload 4
// 221: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 226: athrow
// 227: bipush 1
// 228: goto 23b
// 22b: ldc2_w 6630495664126261602
// 22e: lload 4
// 230: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 235: athrow
// 236: bipush 0
// 237: goto 23b
// 23a: bipush 0
// 23b: ifeq 24d
// 23e: fconst_1
// 23f: goto 24e
// 242: ldc2_w 6630495664126261602
// 245: lload 4
// 247: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24c: athrow
// 24d: fconst_0
// 24e: lload 14
// 250: dup2_x1
// 251: pop2
// 252: invokevirtual su/catlean/fd.B (JF)V
// 255: aload 1
// 256: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 259: dup
// 25a: sipush 1012
// 25d: ldc2_w 1512363536743441035
// 260: lload 4
// 262: lxor
// 263: invokedynamic d (IJ)Ljava/lang/String; bsm=su/catlean/rk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 268: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 26b: aload 0
// 26c: invokevirtual su/catlean/rk.x ()F
// 26f: aload 0
// 270: invokevirtual su/catlean/rk.F ()F
// 273: fadd
// 274: fload 28
// 276: fsub
// 277: ldc 15.0
// 279: fsub
// 27a: iload 11
// 27c: i2c
// 27d: swap
// 27e: aload 0
// 27f: invokevirtual su/catlean/rk.R ()F
// 282: fload 28
// 284: ldc 8.0
// 286: fadd
// 287: ldc 12.0
// 289: ldc 3.0
// 28b: ldc 2.5
// 28d: aload 0
// 28e: getfield su/catlean/rk.h Lsu/catlean/fd;
// 291: invokevirtual su/catlean/fd.a ()F
// 294: fadd
// 295: fconst_0
// 296: fconst_1
// 297: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 29a: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 29d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2a0: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 2a3: fconst_0
// 2a4: iload 12
// 2a6: i2s
// 2a7: fconst_0
// 2a8: iload 13
// 2aa: fconst_0
// 2ab: sipush 32370
// 2ae: ldc2_w 7897322832839578978
// 2b1: lload 4
// 2b3: lxor
// 2b4: invokedynamic e (IJ)I bsm=su/catlean/rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: aconst_null
// 2ba: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 2bd: lload 22
// 2bf: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 2c2: aload 1
// 2c3: aload 27
// 2c5: aload 0
// 2c6: invokevirtual su/catlean/rk.x ()F
// 2c9: aload 0
// 2ca: invokevirtual su/catlean/rk.F ()F
// 2cd: fadd
// 2ce: fload 28
// 2d0: fconst_2
// 2d1: fdiv
// 2d2: fsub
// 2d3: ldc 11.0
// 2d5: fsub
// 2d6: aload 0
// 2d7: invokevirtual su/catlean/rk.R ()F
// 2da: ldc 5.0
// 2dc: fadd
// 2dd: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 2e0: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 2e3: lload 24
// 2e5: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 2e8: aload 0
// 2e9: invokevirtual su/catlean/rk.x ()F
// 2ec: aload 0
// 2ed: invokevirtual su/catlean/rk.F ()F
// 2f0: fadd
// 2f1: fload 28
// 2f3: fsub
// 2f4: ldc 15.0
// 2f6: fsub
// 2f7: fstore 29
// 2f9: aload 0
// 2fa: invokevirtual su/catlean/rk.x ()F
// 2fd: aload 0
// 2fe: invokevirtual su/catlean/rk.F ()F
// 301: fadd
// 302: ldc 7.0
// 304: fsub
// 305: fstore 30
// 307: iload 2
// 308: i2f
// 309: fstore 31
// 30b: fload 29
// 30d: fload 31
// 30f: fcmpg
// 310: aload 26
// 312: lload 4
// 314: lconst_0
// 315: lcmp
// 316: iflt 342
// 319: ifnull 340
// 31c: ifgt 369
// 31f: goto 32d
// 322: ldc2_w 6630495664126261602
// 325: lload 4
// 327: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32c: athrow
// 32d: fload 31
// 32f: fload 30
// 331: fcmpg
// 332: goto 340
// 335: ldc2_w 6630495664126261602
// 338: lload 4
// 33a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33f: athrow
// 340: aload 26
// 342: ifnull 366
// 345: ifgt 365
// 348: goto 356
// 34b: ldc2_w 6630495664126261602
// 34e: lload 4
// 350: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 355: athrow
// 356: bipush 1
// 357: goto 36a
// 35a: ldc2_w 6630495664126261602
// 35d: lload 4
// 35f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 364: athrow
// 365: bipush 0
// 366: goto 36a
// 369: bipush 0
// 36a: ifeq 43f
// 36d: aload 0
// 36e: invokevirtual su/catlean/rk.R ()F
// 371: fstore 29
// 373: aload 0
// 374: invokevirtual su/catlean/rk.R ()F
// 377: ldc 12.0
// 379: fadd
// 37a: fstore 30
// 37c: iload 3
// 37d: i2f
// 37e: fstore 31
// 380: fload 29
// 382: fload 31
// 384: fcmpg
// 385: aload 26
// 387: lload 4
// 389: lconst_0
// 38a: lcmp
// 38b: ifle 3b7
// 38e: ifnull 3b5
// 391: ifgt 3de
// 394: goto 3a2
// 397: ldc2_w 6630495664126261602
// 39a: lload 4
// 39c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a1: athrow
// 3a2: fload 31
// 3a4: fload 30
// 3a6: fcmpg
// 3a7: goto 3b5
// 3aa: ldc2_w 6630495664126261602
// 3ad: lload 4
// 3af: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b4: athrow
// 3b5: aload 26
// 3b7: ifnull 3db
// 3ba: ifgt 3da
// 3bd: goto 3cb
// 3c0: ldc2_w 6630495664126261602
// 3c3: lload 4
// 3c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ca: athrow
// 3cb: bipush 1
// 3cc: goto 3df
// 3cf: ldc2_w 6630495664126261602
// 3d2: lload 4
// 3d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: athrow
// 3da: bipush 0
// 3db: goto 3df
// 3de: bipush 0
// 3df: lload 4
// 3e1: lconst_0
// 3e2: lcmp
// 3e3: ifle 3ec
// 3e6: ifeq 43f
// 3e9: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 3ec: sipush 27102
// 3ef: ldc2_w 3285954342498140879
// 3f2: lload 4
// 3f4: lxor
// 3f5: invokedynamic e (IJ)I bsm=su/catlean/rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3fa: if_icmpeq 43f
// 3fd: goto 40b
// 400: ldc2_w 6630495664126261602
// 403: lload 4
// 405: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40a: athrow
// 40b: lload 7
// 40d: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 410: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 413: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 416: sipush 30192
// 419: ldc2_w 3780788719171477218
// 41c: lload 4
// 41e: lxor
// 41f: invokedynamic e (IJ)I bsm=su/catlean/rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 424: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 427: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 42a: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 42d: bipush 0
// 42e: invokevirtual su/catlean/fi.A (Z)V
// 431: goto 43f
// 434: ldc2_w 6630495664126261602
// 437: lload 4
// 439: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43e: athrow
// 43f: return
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
// 01f: invokevirtual su/catlean/rk.A ()Lsu/catlean/a1;
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
// 034: aload 12
// 036: ifnull 06f
// 039: getfield su/catlean/rk.v Z
// 03c: ifeq 06e
// 03f: goto 04c
// 042: ldc2_w 8581399575577449073
// 045: lload 1
// 046: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04b: athrow
// 04c: aload 0
// 04d: invokevirtual su/catlean/rk.A ()Lsu/catlean/a1;
// 050: new su/catlean/lj
// 053: dup
// 054: iload 7
// 056: bipush 0
// 057: bipush 1
// 058: invokespecial su/catlean/lj.<init> (IZZ)V
// 05b: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 05e: aload 0
// 05f: bipush 0
// 060: putfield su/catlean/rk.v Z
// 063: return
// 064: ldc2_w 8581399575577449073
// 067: lload 1
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: aload 0
// 06f: invokevirtual su/catlean/rk.x ()F
// 072: aload 0
// 073: invokevirtual su/catlean/rk.F ()F
// 076: fadd
// 077: fload 13
// 079: fsub
// 07a: ldc 15.0
// 07c: fsub
// 07d: fstore 14
// 07f: dload 3
// 080: aload 0
// 081: invokevirtual su/catlean/rk.x ()F
// 084: aload 0
// 085: invokevirtual su/catlean/rk.F ()F
// 088: fadd
// 089: ldc 7.0
// 08b: fsub
// 08c: f2d
// 08d: dcmpg
// 08e: aload 12
// 090: lload 1
// 091: lconst_0
// 092: lcmp
// 093: iflt 0bd
// 096: ifnull 0bb
// 099: ifgt 0e2
// 09c: goto 0a9
// 09f: ldc2_w 8581399575577449073
// 0a2: lload 1
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: fload 14
// 0ab: f2d
// 0ac: dload 3
// 0ad: dcmpg
// 0ae: goto 0bb
// 0b1: ldc2_w 8581399575577449073
// 0b4: lload 1
// 0b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ba: athrow
// 0bb: aload 12
// 0bd: ifnull 0df
// 0c0: ifgt 0de
// 0c3: goto 0d0
// 0c6: ldc2_w 8581399575577449073
// 0c9: lload 1
// 0ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: athrow
// 0d0: bipush 1
// 0d1: goto 0e3
// 0d4: ldc2_w 8581399575577449073
// 0d7: lload 1
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: bipush 0
// 0df: goto 0e3
// 0e2: bipush 0
// 0e3: ifeq 17f
// 0e6: aload 0
// 0e7: invokevirtual su/catlean/rk.R ()F
// 0ea: fstore 14
// 0ec: dload 5
// 0ee: aload 0
// 0ef: invokevirtual su/catlean/rk.R ()F
// 0f2: ldc 12.0
// 0f4: fadd
// 0f5: f2d
// 0f6: dcmpg
// 0f7: aload 12
// 0f9: lload 1
// 0fa: lconst_0
// 0fb: lcmp
// 0fc: ifle 127
// 0ff: ifnull 125
// 102: ifgt 14c
// 105: goto 112
// 108: ldc2_w 8581399575577449073
// 10b: lload 1
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: fload 14
// 114: f2d
// 115: dload 5
// 117: dcmpg
// 118: goto 125
// 11b: ldc2_w 8581399575577449073
// 11e: lload 1
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: aload 12
// 127: ifnull 149
// 12a: ifgt 148
// 12d: goto 13a
// 130: ldc2_w 8581399575577449073
// 133: lload 1
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: bipush 1
// 13b: goto 14d
// 13e: ldc2_w 8581399575577449073
// 141: lload 1
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: bipush 0
// 149: goto 14d
// 14c: bipush 0
// 14d: ifeq 17f
// 150: aload 0
// 151: aload 0
// 152: getfield su/catlean/rk.v Z
// 155: aload 12
// 157: ifnull 178
// 15a: goto 167
// 15d: ldc2_w 8581399575577449073
// 160: lload 1
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: ifne 17b
// 16a: goto 177
// 16d: ldc2_w 8581399575577449073
// 170: lload 1
// 171: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: athrow
// 177: bipush 1
// 178: goto 17c
// 17b: bipush 0
// 17c: putfield su/catlean/rk.v Z
// 17f: return
}

@Override
public void U(double mouseX, double mouseY, int button) {
}

@Override
public void V(int key, short a, int a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
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
// 1a: lload 5
// 1c: dup2
// 1d: ldc2_w 30484472853177
// 20: lxor
// 21: lstore 7
// 23: pop2
// 24: ldc2_w -3368314324986226980
// 27: lload 5
// 29: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e: astore 9
// 30: aload 0
// 31: getfield su/catlean/rk.v Z
// 34: aload 9
// 36: ifnull 4b
// 39: ifeq c2
// 3c: goto 4a
// 3f: ldc2_w -3356020164043082741
// 42: lload 5
// 44: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49: athrow
// 4a: iload 1
// 4b: lookupswitch 83 2 256 25 261 25
// 64: aload 0
// 65: iload 4
// 67: iflt be
// 6a: invokevirtual su/catlean/rk.A ()Lsu/catlean/a1;
// 6d: new su/catlean/lj
// 70: dup
// 71: bipush 0
// 72: bipush 0
// 73: lload 7
// 75: bipush 0
// 76: sipush 23797
// 79: ldc2_w 3881836831213468299
// 7c: lload 5
// 7e: lxor
// 7f: invokedynamic e (IJ)I bsm=su/catlean/rk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 84: aconst_null
// 85: invokespecial su/catlean/lj.<init> (IZJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 88: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 8b: aload 9
// 8d: ifnonnull bd
// 90: goto 9e
// 93: ldc2_w -3356020164043082741
// 96: lload 5
// 98: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9d: athrow
// 9e: aload 0
// 9f: invokevirtual su/catlean/rk.A ()Lsu/catlean/a1;
// a2: new su/catlean/lj
// a5: dup
// a6: iload 1
// a7: bipush 0
// a8: bipush 0
// a9: invokespecial su/catlean/lj.<init> (IZZ)V
// ac: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// af: goto bd
// b2: ldc2_w -3356020164043082741
// b5: lload 5
// b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// bc: athrow
// bd: aload 0
// be: bipush 0
// bf: putfield su/catlean/rk.v Z
// c2: return
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
this.v = false;
}

static {
long var16 = b ^ 106640466634490L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[5];
int var23 = 0;
String var22 = "ú¿\u001a£\u0094M\u0092ì\u009a\u001b}Ê\u0098ûÿ@\u0018®'\u0005\b)Ål¼Ô³¡Yz\u0095¸ÝÆ@6Y\u0083@ ÷\u0010ò¦\u008d¼X*v\u001aþ(\u001cGô¯Æm";
int var24 = "ú¿\u001a£\u0094M\u0092ì\u009a\u001b}Ê\u0098ûÿ@\u0018®'\u0005\b)Ål¼Ô³¡Yz\u0095¸ÝÆ@6Y\u0083@ ÷\u0010ò¦\u008d¼X*v\u001aþ(\u001cGô¯Æm".length();
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
d = var25;
e = new String[5];
l = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[6];
int var8 = 0;
String var9 = "p\fKú÷Öò\u008bØÐ\u0095*M\u0019ç\u0085\u0018\u008arû§\u0090Z_ç\u00adol\u0096£Ò¡";
int var10 = "p\fKú÷Öò\u008bØÐ\u0095*M\u0019ç\u0085\u0018\u008arû§\u0090Z_ç\u00adol\u0096£Ò¡".length();
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
g = var11;
k = new Integer[6];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -5021687202620479916L;
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
m = var50;
return;
}
break;
default:
var33[var10001] = var55;
if (var7 < var10) {
continue label46;
}

var9 = "\u0093¾4Ñ¿òVø\u0013h¿¢¢S}ö";
var10 = "\u0093¾4Ñ¿òVø\u0013h¿¢¢S}ö".length();
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

var22 = "gb\u008ep\u0091µà¦oÑ¥óFÛ_Î\u0018¥\u008fßBÙ\u0083 °K¤f^*\u0083\u0083\u0013m\u008f·âèk\u0006\u0090";
var24 = "gb\u008ep\u0091µà¦oÑ¥óFÛ_Î\u0018¥\u008fßBÙ\u0083 °K¤f^*\u0083\u0083\u0013m\u008f·âèk\u0006\u0090".length();
var21 = 16;
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

private static String a(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 31819;
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
throw new RuntimeException("su/catlean/rk", var10);
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
throw new RuntimeException("su/catlean/rk" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 13858;
if (k[var3] == null) {
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
throw new RuntimeException("su/catlean/rk", var14);
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
throw new RuntimeException("su/catlean/rk" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
