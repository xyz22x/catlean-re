package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
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
import org.joml.Matrix3x2fStack;

public final class rx extends ru {
@NotNull
private final a1 t;
private boolean J;
private boolean O;
private boolean Z;
private boolean h;
@NotNull
private final fd D;
@NotNull
private final fd r;
@NotNull
private final fd B;
@NotNull
private final ArrayList K;
private static final long b = yz.a(217593705347506475L, 8108681302133724723L, MethodHandles.lookup().lookupClass()).a(134993480702592L);
private static final String[] d;
private static final String[] e;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] k;
private static final Map l;
private static final long[] m;
private static final Long[] n;
private static final Map o;

public rx(@NotNull a1 setting, long a) {
a = b ^ a;
long var4 = a ^ 77463049195187L;
long var6 = a ^ 56221275223263L;
long var10001 = a ^ 76487498038020L;
int var8 = (int)((a ^ 76487498038020L) >>> 48);
int var9 = (int)((a ^ 76487498038020L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
Intrinsics.checkNotNullParameter(setting, a<"t">(7237, 3535559049951543116L ^ a));
super(var6, setting);
this.t = setting;
this.D = new fd(_s.OUT_QUINT, c<"k">(492, 7248019978311701447L ^ a), var4);
this.r = new fd(_s.OUT_QUINT, c<"k">(1844, 1833690425395385630L ^ a), var4);
this.B = new fd(_s.OUT_QUINT, c<"k">(1844, 1833690425395385630L ^ a), var4);
this.K = new ArrayList();
byte var11 = 4;

for (int var12 = 0; var12 < var11; var12++) {
boolean var14 = false;
this.K.add(new b7(this.A(), this.x(), this.R(), var12, (char)var8, (short)var9, var10));
if (a > 0L && a >= 0L) {
continue;
}
break;
}
}

@NotNull
@Override
public a1 A() {
return this.t;
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
// 003: ldc2_w 39844814704388
// 006: lxor
// 007: lstore 7
// 009: dup2
// 00a: ldc2_w 68939168652928
// 00d: lxor
// 00e: lstore 9
// 010: dup2
// 011: ldc2_w 115096991696004
// 014: lxor
// 015: lstore 11
// 017: dup2
// 018: ldc2_w 127000398109451
// 01b: lxor
// 01c: lstore 13
// 01e: dup2
// 01f: ldc2_w 57758330175306
// 022: lxor
// 023: dup2
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 15
// 02a: dup2
// 02b: bipush 16
// 02d: lshl
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 16
// 034: dup2
// 035: bipush 48
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 17
// 03e: pop2
// 03f: dup2
// 040: ldc2_w 133532887051749
// 043: lxor
// 044: lstore 18
// 046: dup2
// 047: ldc2_w 20797107207379
// 04a: lxor
// 04b: dup2
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 20
// 052: dup2
// 053: bipush 16
// 055: lshl
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 21
// 05c: dup2
// 05d: bipush 32
// 05f: lshl
// 060: bipush 32
// 062: lushr
// 063: l2i
// 064: istore 22
// 066: pop2
// 067: dup2
// 068: ldc2_w 81750728905703
// 06b: lxor
// 06c: lstore 23
// 06e: dup2
// 06f: ldc2_w 88672139111771
// 072: lxor
// 073: dup2
// 074: bipush 48
// 076: lushr
// 077: l2i
// 078: istore 25
// 07a: dup2
// 07b: bipush 16
// 07d: lshl
// 07e: bipush 32
// 080: lushr
// 081: l2i
// 082: istore 26
// 084: dup2
// 085: bipush 48
// 087: lshl
// 088: bipush 48
// 08a: lushr
// 08b: l2i
// 08c: istore 27
// 08e: pop2
// 08f: dup2
// 090: ldc2_w 105309425727100
// 093: lxor
// 094: lstore 28
// 096: dup2
// 097: ldc2_w 114903264084220
// 09a: lxor
// 09b: lstore 30
// 09d: dup2
// 09e: ldc2_w 24369959771588
// 0a1: lxor
// 0a2: lstore 32
// 0a4: dup2
// 0a5: ldc2_w 120682356120742
// 0a8: lxor
// 0a9: lstore 34
// 0ab: dup2
// 0ac: ldc2_w 135435160666308
// 0af: lxor
// 0b0: lstore 36
// 0b2: pop2
// 0b3: ldc2_w 6640577628623117237
// 0b6: lload 4
// 0b8: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: aload 1
// 0be: sipush 27769
// 0c1: ldc2_w 6454721793269972790
// 0c4: lload 4
// 0c6: lxor
// 0c7: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cc: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0cf: astore 53
// 0d1: aload 1
// 0d2: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0d5: dup
// 0d6: sipush 19011
// 0d9: ldc2_w 2180588589115185418
// 0dc: lload 4
// 0de: lxor
// 0df: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e7: astore 54
// 0e9: lload 30
// 0eb: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 0ee: aload 1
// 0ef: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0f2: dup
// 0f3: sipush 29589
// 0f6: ldc2_w 8634023434490716377
// 0f9: lload 4
// 0fb: lxor
// 0fc: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 101: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 104: aload 0
// 105: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 108: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 10b: aload 0
// 10c: invokevirtual su/catlean/rx.x ()F
// 10f: aload 0
// 110: invokevirtual su/catlean/rx.R ()F
// 113: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 116: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 119: lload 11
// 11b: dup2_x1
// 11c: pop2
// 11d: bipush 0
// 11e: bipush 0
// 11f: sipush 1102
// 122: ldc2_w 1552920580326929099
// 125: lload 4
// 127: lxor
// 128: invokedynamic y (IJ)I bsm=su/catlean/rx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: aconst_null
// 12e: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 131: aload 0
// 132: aload 0
// 133: getfield su/catlean/rx.J Z
// 136: ifeq 149
// 139: ldc 65.0
// 13b: goto 14b
// 13e: ldc2_w 6642180098654813081
// 141: lload 4
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: ldc 14.0
// 14b: invokevirtual su/catlean/rx.m (F)V
// 14e: aload 0
// 14f: getfield su/catlean/rx.D Lsu/catlean/fd;
// 152: aload 0
// 153: getfield su/catlean/rx.J Z
// 156: ifeq 168
// 159: fconst_1
// 15a: goto 169
// 15d: ldc2_w 6642180098654813081
// 160: lload 4
// 162: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 167: athrow
// 168: fconst_0
// 169: lload 7
// 16b: dup2_x1
// 16c: pop2
// 16d: invokevirtual su/catlean/fd.B (JF)V
// 170: fconst_1
// 171: aload 0
// 172: getfield su/catlean/rx.D Lsu/catlean/fd;
// 175: invokevirtual su/catlean/fd.a ()F
// 178: fsub
// 179: fstore 55
// 17b: aload 0
// 17c: getfield su/catlean/rx.r Lsu/catlean/fd;
// 17f: aload 0
// 180: aload 53
// 182: ifnull 1a8
// 185: getfield su/catlean/rx.J Z
// 188: ifeq 2a3
// 18b: goto 199
// 18e: ldc2_w 6642180098654813081
// 191: lload 4
// 193: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 198: athrow
// 199: aload 0
// 19a: goto 1a8
// 19d: ldc2_w 6642180098654813081
// 1a0: lload 4
// 1a2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: athrow
// 1a8: invokevirtual su/catlean/rx.x ()F
// 1ab: fstore 56
// 1ad: aload 0
// 1ae: invokevirtual su/catlean/rx.x ()F
// 1b1: ldc 25.0
// 1b3: fadd
// 1b4: fstore 57
// 1b6: iload 2
// 1b7: i2f
// 1b8: fstore 58
// 1ba: fload 56
// 1bc: fload 58
// 1be: fcmpg
// 1bf: aload 53
// 1c1: lload 4
// 1c3: lconst_0
// 1c4: lcmp
// 1c5: iflt 1f1
// 1c8: ifnull 1ef
// 1cb: ifgt 218
// 1ce: goto 1dc
// 1d1: ldc2_w 6642180098654813081
// 1d4: lload 4
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: fload 58
// 1de: fload 57
// 1e0: fcmpg
// 1e1: goto 1ef
// 1e4: ldc2_w 6642180098654813081
// 1e7: lload 4
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: aload 53
// 1f1: ifnull 215
// 1f4: ifgt 214
// 1f7: goto 205
// 1fa: ldc2_w 6642180098654813081
// 1fd: lload 4
// 1ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: athrow
// 205: bipush 1
// 206: goto 219
// 209: ldc2_w 6642180098654813081
// 20c: lload 4
// 20e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 213: athrow
// 214: bipush 0
// 215: goto 219
// 218: bipush 0
// 219: ifeq 2a3
// 21c: aload 0
// 21d: invokevirtual su/catlean/rx.R ()F
// 220: ldc 24.0
// 222: fadd
// 223: fstore 56
// 225: aload 0
// 226: invokevirtual su/catlean/rx.R ()F
// 229: ldc 34.0
// 22b: fadd
// 22c: fstore 57
// 22e: iload 3
// 22f: i2f
// 230: fstore 58
// 232: fload 56
// 234: fload 58
// 236: fcmpg
// 237: aload 53
// 239: lload 4
// 23b: lconst_0
// 23c: lcmp
// 23d: iflt 269
// 240: ifnull 267
// 243: ifgt 290
// 246: goto 254
// 249: ldc2_w 6642180098654813081
// 24c: lload 4
// 24e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 253: athrow
// 254: fload 58
// 256: fload 57
// 258: fcmpg
// 259: goto 267
// 25c: ldc2_w 6642180098654813081
// 25f: lload 4
// 261: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 266: athrow
// 267: aload 53
// 269: ifnull 28d
// 26c: ifgt 28c
// 26f: goto 27d
// 272: ldc2_w 6642180098654813081
// 275: lload 4
// 277: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27c: athrow
// 27d: bipush 1
// 27e: goto 291
// 281: ldc2_w 6642180098654813081
// 284: lload 4
// 286: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28b: athrow
// 28c: bipush 0
// 28d: goto 291
// 290: bipush 0
// 291: ifeq 2a3
// 294: fconst_1
// 295: goto 2a4
// 298: ldc2_w 6642180098654813081
// 29b: lload 4
// 29d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a2: athrow
// 2a3: fconst_0
// 2a4: lload 4
// 2a6: lconst_0
// 2a7: lcmp
// 2a8: ifle 2e2
// 2ab: lload 7
// 2ad: dup2_x1
// 2ae: pop2
// 2af: invokevirtual su/catlean/fd.B (JF)V
// 2b2: aload 0
// 2b3: getfield su/catlean/rx.B Lsu/catlean/fd;
// 2b6: aload 0
// 2b7: aload 53
// 2b9: ifnull 2df
// 2bc: getfield su/catlean/rx.J Z
// 2bf: ifeq 3da
// 2c2: goto 2d0
// 2c5: ldc2_w 6642180098654813081
// 2c8: lload 4
// 2ca: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2cf: athrow
// 2d0: aload 0
// 2d1: goto 2df
// 2d4: ldc2_w 6642180098654813081
// 2d7: lload 4
// 2d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2de: athrow
// 2df: invokevirtual su/catlean/rx.x ()F
// 2e2: fstore 56
// 2e4: aload 0
// 2e5: invokevirtual su/catlean/rx.x ()F
// 2e8: ldc 25.0
// 2ea: fadd
// 2eb: fstore 57
// 2ed: iload 2
// 2ee: i2f
// 2ef: fstore 58
// 2f1: fload 56
// 2f3: fload 58
// 2f5: fcmpg
// 2f6: aload 53
// 2f8: lload 4
// 2fa: lconst_0
// 2fb: lcmp
// 2fc: iflt 328
// 2ff: ifnull 326
// 302: ifgt 34f
// 305: goto 313
// 308: ldc2_w 6642180098654813081
// 30b: lload 4
// 30d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 312: athrow
// 313: fload 58
// 315: fload 57
// 317: fcmpg
// 318: goto 326
// 31b: ldc2_w 6642180098654813081
// 31e: lload 4
// 320: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 325: athrow
// 326: aload 53
// 328: ifnull 34c
// 32b: ifgt 34b
// 32e: goto 33c
// 331: ldc2_w 6642180098654813081
// 334: lload 4
// 336: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33b: athrow
// 33c: bipush 1
// 33d: goto 350
// 340: ldc2_w 6642180098654813081
// 343: lload 4
// 345: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34a: athrow
// 34b: bipush 0
// 34c: goto 350
// 34f: bipush 0
// 350: ifeq 3da
// 353: aload 0
// 354: invokevirtual su/catlean/rx.R ()F
// 357: ldc 38.0
// 359: fadd
// 35a: fstore 56
// 35c: aload 0
// 35d: invokevirtual su/catlean/rx.R ()F
// 360: ldc 47.0
// 362: fadd
// 363: fstore 57
// 365: iload 3
// 366: i2f
// 367: fstore 58
// 369: fload 56
// 36b: fload 58
// 36d: fcmpg
// 36e: aload 53
// 370: lload 4
// 372: lconst_0
// 373: lcmp
// 374: iflt 3a0
// 377: ifnull 39e
// 37a: ifgt 3c7
// 37d: goto 38b
// 380: ldc2_w 6642180098654813081
// 383: lload 4
// 385: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38a: athrow
// 38b: fload 58
// 38d: fload 57
// 38f: fcmpg
// 390: goto 39e
// 393: ldc2_w 6642180098654813081
// 396: lload 4
// 398: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39d: athrow
// 39e: aload 53
// 3a0: ifnull 3c4
// 3a3: ifgt 3c3
// 3a6: goto 3b4
// 3a9: ldc2_w 6642180098654813081
// 3ac: lload 4
// 3ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b3: athrow
// 3b4: bipush 1
// 3b5: goto 3c8
// 3b8: ldc2_w 6642180098654813081
// 3bb: lload 4
// 3bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c2: athrow
// 3c3: bipush 0
// 3c4: goto 3c8
// 3c7: bipush 0
// 3c8: ifeq 3da
// 3cb: fconst_1
// 3cc: goto 3db
// 3cf: ldc2_w 6642180098654813081
// 3d2: lload 4
// 3d4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d9: athrow
// 3da: fconst_0
// 3db: lload 7
// 3dd: dup2_x1
// 3de: pop2
// 3df: invokevirtual su/catlean/fd.B (JF)V
// 3e2: bipush 3
// 3e3: newarray 6
// 3e5: astore 56
// 3e7: aload 0
// 3e8: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 3eb: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 3ee: checkcast java/awt/Color
// 3f1: invokevirtual java/awt/Color.getRed ()I
// 3f4: lload 4
// 3f6: lconst_0
// 3f7: lcmp
// 3f8: iflt 489
// 3fb: aload 0
// 3fc: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 3ff: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 402: checkcast java/awt/Color
// 405: invokevirtual java/awt/Color.getGreen ()I
// 408: aload 0
// 409: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 40c: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 40f: checkcast java/awt/Color
// 412: invokevirtual java/awt/Color.getBlue ()I
// 415: aload 56
// 417: invokestatic java/awt/Color.RGBtoHSB (III[F)[F
// 41a: pop
// 41b: aload 54
// 41d: aload 0
// 41e: invokevirtual su/catlean/rx.x ()F
// 421: aload 0
// 422: invokevirtual su/catlean/rx.F ()F
// 425: fadd
// 426: ldc 18.0
// 428: fsub
// 429: iload 20
// 42b: i2c
// 42c: swap
// 42d: aload 0
// 42e: invokevirtual su/catlean/rx.R ()F
// 431: sipush 14443
// 434: ldc2_w 8325375237009116909
// 437: lload 4
// 439: lxor
// 43a: invokedynamic y (IJ)I bsm=su/catlean/rx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43f: i2f
// 440: aload 0
// 441: getfield su/catlean/rx.D Lsu/catlean/fd;
// 444: invokevirtual su/catlean/fd.a ()F
// 447: fmul
// 448: fadd
// 449: ldc 11.0
// 44b: ldc 11.0
// 44d: fload 55
// 44f: fmul
// 450: ldc 3.0
// 452: ldc 2.5
// 454: fconst_1
// 455: fconst_1
// 456: aload 0
// 457: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 45a: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 45d: checkcast java/awt/Color
// 460: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 463: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 466: fconst_0
// 467: iload 21
// 469: i2s
// 46a: fconst_0
// 46b: iload 22
// 46d: fconst_0
// 46e: sipush 8676
// 471: ldc2_w 2258352762329110381
// 474: lload 4
// 476: lxor
// 477: invokedynamic y (IJ)I bsm=su/catlean/rx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47c: aconst_null
// 47d: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 480: aload 0
// 481: aload 53
// 483: ifnull 59a
// 486: getfield su/catlean/rx.J Z
// 489: ifeq 995
// 48c: goto 49a
// 48f: ldc2_w 6642180098654813081
// 492: lload 4
// 494: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 499: athrow
// 49a: getstatic su/catlean/wv.j Lsu/catlean/wv;
// 49d: invokevirtual su/catlean/wv.r ()Lsu/catlean/bj;
// 4a0: aload 1
// 4a1: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4a4: dup
// 4a5: sipush 29589
// 4a8: ldc2_w 8634023434490716377
// 4ab: lload 4
// 4ad: lxor
// 4ae: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 4b6: checkcast org/joml/Matrix3x2f
// 4b9: aload 0
// 4ba: invokevirtual su/catlean/rx.x ()F
// 4bd: aload 0
// 4be: invokevirtual su/catlean/rx.F ()F
// 4c1: fadd
// 4c2: f2d
// 4c3: ldc2_w 17.0
// 4c6: dsub
// 4c7: aload 0
// 4c8: invokevirtual su/catlean/rx.R ()F
// 4cb: f2d
// 4cc: bipush 2
// 4cd: i2d
// 4ce: dsub
// 4cf: fconst_0
// 4d0: fconst_0
// 4d1: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 4d4: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 4d7: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 4da: aload 0
// 4db: getfield su/catlean/rx.D Lsu/catlean/fd;
// 4de: invokevirtual su/catlean/fd.a ()F
// 4e1: iload 15
// 4e3: i2c
// 4e4: swap
// 4e5: iload 16
// 4e7: swap
// 4e8: iload 17
// 4ea: i2s
// 4eb: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 4ee: aconst_null
// 4ef: fconst_0
// 4f0: sipush 18482
// 4f3: ldc2_w 30066667757338303
// 4f6: lload 4
// 4f8: lxor
// 4f9: invokedynamic y (IJ)I bsm=su/catlean/rx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4fe: lload 32
// 500: aconst_null
// 501: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 504: aload 0
// 505: invokevirtual su/catlean/rx.x ()F
// 508: aload 0
// 509: invokevirtual su/catlean/rx.F ()F
// 50c: fadd
// 50d: ldc 48.0
// 50f: aload 0
// 510: getfield su/catlean/rx.D Lsu/catlean/fd;
// 513: invokevirtual su/catlean/fd.a ()F
// 516: fmul
// 517: fsub
// 518: aload 0
// 519: invokevirtual su/catlean/rx.R ()F
// 51c: ldc 10.0
// 51e: aload 0
// 51f: getfield su/catlean/rx.D Lsu/catlean/fd;
// 522: invokevirtual su/catlean/fd.a ()F
// 525: fmul
// 526: fadd
// 527: ldc 40.0
// 529: aload 0
// 52a: getfield su/catlean/rx.D Lsu/catlean/fd;
// 52d: invokevirtual su/catlean/fd.a ()F
// 530: fmul
// 531: ldc 39.5
// 533: aload 0
// 534: getfield su/catlean/rx.D Lsu/catlean/fd;
// 537: invokevirtual su/catlean/fd.a ()F
// 53a: fmul
// 53b: ldc 3.0
// 53d: new java/awt/Color
// 540: dup
// 541: bipush 0
// 542: invokespecial java/awt/Color.<init> (I)V
// 545: new java/awt/Color
// 548: dup
// 549: bipush -1
// 54a: invokespecial java/awt/Color.<init> (I)V
// 54d: new java/awt/Color
// 550: dup
// 551: bipush 0
// 552: invokespecial java/awt/Color.<init> (I)V
// 555: new java/awt/Color
// 558: dup
// 559: aload 56
// 55b: bipush 0
// 55c: faload
// 55d: fconst_1
// 55e: fconst_1
// 55f: invokestatic java/awt/Color.HSBtoRGB (FFF)I
// 562: invokespecial java/awt/Color.<init> (I)V
// 565: aload 54
// 567: fconst_0
// 568: aconst_null
// 569: sipush 2322
// 56c: ldc2_w 2540463692621692828
// 56f: lload 4
// 571: lxor
// 572: invokedynamic y (IJ)I bsm=su/catlean/rx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 577: aconst_null
// 578: astore 38
// 57a: istore 39
// 57c: astore 40
// 57e: fstore 41
// 580: astore 42
// 582: astore 43
// 584: astore 44
// 586: lload 28
// 588: aload 44
// 58a: aload 43
// 58c: aload 42
// 58e: fload 41
// 590: aload 40
// 592: iload 39
// 594: aload 38
// 596: invokestatic su/catlean/l7.E (FFFFFLjava/awt/Color;Ljava/awt/Color;JLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;ILjava/lang/Object;)V
// 599: aload 0
// 59a: getfield su/catlean/rx.K Ljava/util/ArrayList;
// 59d: checkcast java/lang/Iterable
// 5a0: astore 57
// 5a2: bipush 0
// 5a3: istore 58
// 5a5: aload 57
// 5a7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 5ac: astore 59
// 5ae: aload 59
// 5b0: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5b5: ifeq 60f
// 5b8: aload 59
// 5ba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5bf: astore 60
// 5c1: aload 60
// 5c3: checkcast su/catlean/b7
// 5c6: astore 61
// 5c8: bipush 0
// 5c9: lload 4
// 5cb: lconst_0
// 5cc: lcmp
// 5cd: ifle 617
// 5d0: istore 62
// 5d2: aload 61
// 5d4: aload 0
// 5d5: invokevirtual su/catlean/rx.x ()F
// 5d8: invokevirtual su/catlean/b7.K (F)V
// 5db: aload 61
// 5dd: aload 0
// 5de: invokevirtual su/catlean/rx.R ()F
// 5e1: invokevirtual su/catlean/b7.h (F)V
// 5e4: aload 61
// 5e6: lload 9
// 5e8: aload 54
// 5ea: aload 1
// 5eb: invokevirtual su/catlean/b7.I (JLorg/joml/Matrix3x2fStack;Lnet/minecraft/class_332;)V
// 5ee: nop
// 5ef: nop
// 5f0: aload 53
// 5f2: ifnull 614
// 5f5: aload 53
// 5f7: ifnonnull 5ae
// 5fa: lload 4
// 5fc: lconst_0
// 5fd: lcmp
// 5fe: ifle 5f0
// 601: goto 60f
// 604: ldc2_w 6642180098654813081
// 607: lload 4
// 609: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 60e: athrow
// 60f: nop
// 610: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE Lkotlin/jvm/internal/StringCompanionObject;
// 613: pop
// 614: sipush 17066
// 617: ldc2_w 9043660876305928672
// 61a: lload 4
// 61c: lxor
// 61d: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 622: astore 59
// 624: bipush 3
// 625: anewarray 585
// 628: astore 60
// 62a: aload 60
// 62c: bipush 0
// 62d: aload 0
// 62e: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 631: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 634: checkcast java/awt/Color
// 637: invokevirtual java/awt/Color.getRed ()I
// 63a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 63d: aastore
// 63e: aload 60
// 640: bipush 1
// 641: aload 0
// 642: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 645: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 648: checkcast java/awt/Color
// 64b: invokevirtual java/awt/Color.getGreen ()I
// 64e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 651: aastore
// 652: aload 60
// 654: bipush 2
// 655: aload 0
// 656: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 659: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 65c: checkcast java/awt/Color
// 65f: invokevirtual java/awt/Color.getBlue ()I
// 662: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 665: aastore
// 666: aload 60
// 668: astore 60
// 66a: aload 59
// 66c: aload 60
// 66e: aload 60
// 670: arraylength
// 671: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
// 674: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
// 677: dup
// 678: sipush 11765
// 67b: ldc2_w 8293741336706776766
// 67e: lload 4
// 680: lxor
// 681: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 686: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 689: astore 57
// 68b: bipush 3
// 68c: istore 58
// 68e: bipush 0
// 68f: istore 59
// 691: iload 59
// 693: iload 58
// 695: if_icmpge 815
// 698: iload 59
// 69a: istore 60
// 69c: bipush 0
// 69d: istore 61
// 69f: aload 53
// 6a1: ifnull 8d1
// 6a4: aload 54
// 6a6: aload 0
// 6a7: invokevirtual su/catlean/rx.x ()F
// 6aa: aload 0
// 6ab: invokevirtual su/catlean/rx.R ()F
// 6ae: ldc 10.0
// 6b0: fadd
// 6b1: iload 60
// 6b3: i2f
// 6b4: ldc 14.0
// 6b6: fmul
// 6b7: fadd
// 6b8: ldc 27.0
// 6ba: ldc 11.0
// 6bc: fconst_2
// 6bd: fconst_2
// 6be: iload 60
// 6c0: tableswitch 66 1 2 35 56
// 6d8: ldc2_w 6642180098654813081
// 6db: lload 4
// 6dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e2: athrow
// 6e3: aload 0
// 6e4: getfield su/catlean/rx.r Lsu/catlean/fd;
// 6e7: invokevirtual su/catlean/fd.a ()F
// 6ea: goto 703
// 6ed: ldc2_w 6642180098654813081
// 6f0: lload 4
// 6f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f7: athrow
// 6f8: aload 0
// 6f9: getfield su/catlean/rx.B Lsu/catlean/fd;
// 6fc: invokevirtual su/catlean/fd.a ()F
// 6ff: goto 703
// 702: fconst_0
// 703: fadd
// 704: ldc 0.5
// 706: iload 60
// 708: tableswitch 55 1 2 24 45
// 720: aload 0
// 721: getfield su/catlean/rx.r Lsu/catlean/fd;
// 724: invokevirtual su/catlean/fd.a ()F
// 727: goto 740
// 72a: ldc2_w 6642180098654813081
// 72d: lload 4
// 72f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 734: athrow
// 735: aload 0
// 736: getfield su/catlean/rx.B Lsu/catlean/fd;
// 739: invokevirtual su/catlean/fd.a ()F
// 73c: goto 740
// 73f: fconst_0
// 740: fmul
// 741: fconst_1
// 742: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 745: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 748: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 74b: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 74e: fconst_0
// 74f: fconst_0
// 750: fconst_0
// 751: sipush 8676
// 754: ldc2_w 2258352762329110381
// 757: lload 4
// 759: lxor
// 75a: invokedynamic y (IJ)I bsm=su/catlean/rx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75f: aconst_null
// 760: astore 38
// 762: istore 39
// 764: fstore 40
// 766: fstore 41
// 768: fstore 42
// 76a: astore 43
// 76c: astore 44
// 76e: fstore 45
// 770: fstore 46
// 772: fstore 47
// 774: fstore 48
// 776: fstore 49
// 778: fstore 50
// 77a: fstore 51
// 77c: fstore 52
// 77e: iload 20
// 780: i2c
// 781: fload 52
// 783: fload 51
// 785: fload 50
// 787: fload 49
// 789: fload 48
// 78b: fload 47
// 78d: fload 46
// 78f: fload 45
// 791: aload 44
// 793: aload 43
// 795: fload 42
// 797: iload 21
// 799: i2s
// 79a: fload 41
// 79c: iload 22
// 79e: fload 40
// 7a0: iload 39
// 7a2: aload 38
// 7a4: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 7a7: lload 13
// 7a9: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 7ac: aload 1
// 7ad: bipush 3
// 7ae: anewarray 34
// 7b1: astore 62
// 7b3: aload 62
// 7b5: bipush 0
// 7b6: aload 57
// 7b8: aastore
// 7b9: aload 62
// 7bb: bipush 1
// 7bc: sipush 14570
// 7bf: ldc2_w 2727307376531598252
// 7c2: lload 4
// 7c4: lxor
// 7c5: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ca: aastore
// 7cb: aload 62
// 7cd: bipush 2
// 7ce: sipush 5513
// 7d1: ldc2_w 7701541453415270081
// 7d4: lload 4
// 7d6: lxor
// 7d7: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7dc: aastore
// 7dd: aload 62
// 7df: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 7e2: iload 60
// 7e4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 7e9: checkcast java/lang/String
// 7ec: aload 0
// 7ed: invokevirtual su/catlean/rx.x ()F
// 7f0: ldc 13.5
// 7f2: fadd
// 7f3: aload 0
// 7f4: invokevirtual su/catlean/rx.R ()F
// 7f7: ldc 14.5
// 7f9: fadd
// 7fa: iload 60
// 7fc: i2f
// 7fd: ldc 14.0
// 7ff: fmul
// 800: fadd
// 801: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 804: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 807: lload 34
// 809: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 80c: nop
// 80d: iinc 59 1
// 810: aload 53
// 812: ifnonnull 691
// 815: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 818: aload 1
// 819: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 81c: dup
// 81d: sipush 29589
// 820: ldc2_w 8634023434490716377
// 823: lload 4
// 825: lxor
// 826: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 82b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 82e: aload 0
// 82f: invokevirtual su/catlean/rx.x ()F
// 832: ldc 61.0
// 834: fadd
// 835: aload 0
// 836: invokevirtual su/catlean/rx.R ()F
// 839: ldc 10.0
// 83b: fadd
// 83c: fconst_2
// 83d: ldc 39.0
// 83f: bipush 4
// 840: anewarray 77
// 843: astore 58
// 845: aload 58
// 847: bipush 0
// 848: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 84b: aload 0
// 84c: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 84f: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 852: checkcast java/awt/Color
// 855: iload 15
// 857: i2c
// 858: iload 16
// 85a: fconst_0
// 85b: iload 17
// 85d: i2s
// 85e: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 861: aastore
// 862: aload 58
// 864: bipush 1
// 865: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 868: aload 0
// 869: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 86c: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 86f: checkcast java/awt/Color
// 872: iload 15
// 874: i2c
// 875: iload 16
// 877: fconst_0
// 878: iload 17
// 87a: i2s
// 87b: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 87e: aastore
// 87f: aload 58
// 881: bipush 2
// 882: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 885: aload 0
// 886: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 889: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 88c: checkcast java/awt/Color
// 88f: iload 15
// 891: i2c
// 892: iload 16
// 894: fconst_1
// 895: iload 17
// 897: i2s
// 898: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 89b: aastore
// 89c: aload 58
// 89e: bipush 3
// 89f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 8a2: aload 0
// 8a3: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 8a6: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 8a9: checkcast java/awt/Color
// 8ac: iload 15
// 8ae: i2c
// 8af: iload 16
// 8b1: fconst_1
// 8b2: iload 17
// 8b4: i2s
// 8b5: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 8b8: aastore
// 8b9: aload 58
// 8bb: lload 36
// 8bd: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 8c0: lload 4
// 8c2: lconst_0
// 8c3: lcmp
// 8c4: ifle 995
// 8c7: bipush 1
// 8c8: istore 58
// 8ca: iload 58
// 8cc: istore 59
// 8ce: iinc 58 1
// 8d1: fconst_1
// 8d2: ldc 107.0
// 8d4: iload 59
// 8d6: i2f
// 8d7: aload 0
// 8d8: getfield su/catlean/rx.D Lsu/catlean/fd;
// 8db: invokevirtual su/catlean/fd.a ()F
// 8de: fmul
// 8df: aload 0
// 8e0: getfield su/catlean/rx.D Lsu/catlean/fd;
// 8e3: invokevirtual su/catlean/fd.a ()F
// 8e6: fmul
// 8e7: fdiv
// 8e8: fdiv
// 8e9: fconst_0
// 8ea: fconst_1
// 8eb: invokestatic java/lang/Math.clamp (FFF)F
// 8ee: fstore 60
// 8f0: fload 60
// 8f2: fconst_1
// 8f3: fconst_1
// 8f4: invokestatic java/awt/Color.getHSBColor (FFF)Ljava/awt/Color;
// 8f7: astore 61
// 8f9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 8fc: aload 1
// 8fd: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 900: dup
// 901: sipush 29589
// 904: ldc2_w 8634023434490716377
// 907: lload 4
// 909: lxor
// 90a: invokedynamic t (IJ)Ljava/lang/String; bsm=su/catlean/rx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 912: aload 0
// 913: invokevirtual su/catlean/rx.x ()F
// 916: iload 59
// 918: i2f
// 919: fadd
// 91a: aload 0
// 91b: invokevirtual su/catlean/rx.R ()F
// 91e: ldc 55.0
// 920: fadd
// 921: fconst_1
// 922: fconst_2
// 923: bipush 4
// 924: anewarray 77
// 927: astore 62
// 929: aload 62
// 92b: bipush 0
// 92c: aload 61
// 92e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 931: aload 61
// 933: aastore
// 934: aload 62
// 936: bipush 1
// 937: aload 61
// 939: aastore
// 93a: aload 62
// 93c: bipush 2
// 93d: aload 61
// 93f: aastore
// 940: aload 62
// 942: bipush 3
// 943: aload 61
// 945: aastore
// 946: aload 62
// 948: lload 36
// 94a: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 94d: iload 58
// 94f: sipush 27579
// 952: ldc2_w 7724161830212787511
// 955: lload 4
// 957: lxor
// 958: invokedynamic y (IJ)I bsm=su/catlean/rx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 95d: if_icmple 8ca
// 960: aload 0
// 961: iload 25
// 963: i2s
// 964: aload 54
// 966: iload 2
// 967: iload 26
// 969: iload 27
// 96b: i2s
// 96c: invokespecial su/catlean/rx.C (SLorg/joml/Matrix3x2fStack;IIS)V
// 96f: aload 0
// 970: lload 18
// 972: aload 54
// 974: iload 2
// 975: iload 3
// 976: invokespecial su/catlean/rx.D (JLorg/joml/Matrix3x2fStack;II)V
// 979: lload 4
// 97b: lconst_0
// 97c: lcmp
// 97d: ifle 94d
// 980: aload 53
// 982: ifnull 94d
// 985: aload 0
// 986: lload 4
// 988: lconst_0
// 989: lcmp
// 98a: iflt 970
// 98d: aload 54
// 98f: iload 3
// 990: lload 23
// 992: invokespecial su/catlean/rx.z (Lorg/joml/Matrix3x2fStack;IJ)V
// 995: return
}

private final void D(long var1, Matrix3x2fStack var3, int var4, int var5) {
var1 = b ^ var1;
long var10001 = var1 ^ 20097867638364L;
int var6 = (int)((var1 ^ 20097867638364L) >>> 48);
int var7 = (int)((var1 ^ 20097867638364L) << 16 >>> 48);
int var8 = (int)(var10001 << 32 >>> 32);
var10001 = var1 ^ 57358125213125L;
int var9 = (int)((var1 ^ 57358125213125L) >>> 48);
int var10 = (int)((var1 ^ 57358125213125L) << 16 >>> 32);
int var11 = (int)(var10001 << 48 >>> 48);
_g[] var10000 = vm.a<"Å">(5091058274041692474L, var1);
float var13 = this.x() + this.F() - 48.0F + 2.0F;
float var14 = this.R() + 10.0F + 2.0F;
_g[] var12 = var10000;
float[] var15 = new float[3];

label20: {
try {
Color.RGBtoHSB(((Color)this.A().F()).getRed(), ((Color)this.A().F()).getGreen(), ((Color)this.A().F()).getBlue(), var15);
float var22 = var13 - 4.0F + b<"y">(946, 7973709942258675638L ^ var1) * var15[1];
char var10003 = (char)var6;
float var24 = var14 - 4.0F + b<"y">(9456, 8832580972096358648L ^ var1) * (1.0F - var15[2]);
Color var10010 = (Color)this.A().F();
Color var10011 = Color.BLACK;
Intrinsics.checkNotNullExpressionValue(Color.BLACK, a<"t">(21841, 5153285528648850579L ^ var1));
x1.n(
var3,
var10003,
var22,
var24,
7.0F,
7.0F,
2.5F,
1.5F,
1.0F,
1.0F,
var10010,
var10011,
0.0F,
(short)var7,
0.0F,
var8,
0.0F,
b<"y">(27297, 3840623251854575270L ^ var1),
null
);
var20 = this.O;
if (var12 == null) {
break label20;
}

if (!this.O) {
return;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 5089845169605320982L, var1);
}

var20 = var4;
}

float var16 = Math.clamp((var20 - var13) / 40.0F, 0.0F, 1.0F);
float var17 = Math.clamp(1.0F - (var5 - var14) / 40.0F, 0.0F, 1.0F);
this.A().H(jl.y.p(new Color(Color.HSBtoRGB(var15[0], var16, var17)), (char)var9, var10, ((Color)this.A().F()).getAlpha() / 255.0F, (short)var11));
}

private final void z(Matrix3x2fStack var1, int var2, long var3) {
var3 = b ^ var3;
long var10001 = var3 ^ 36764805142622L;
int var5 = (int)((var3 ^ 36764805142622L) >>> 48);
int var6 = (int)((var3 ^ 36764805142622L) << 16 >>> 48);
int var7 = (int)(var10001 << 32 >>> 32);
var10001 = var3 ^ 7705805315015L;
int var8 = (int)((var3 ^ 7705805315015L) >>> 48);
int var9 = (int)((var3 ^ 7705805315015L) << 16 >>> 32);
int var10 = (int)(var10001 << 48 >>> 48);
float var11 = this.R() + 11.0F;
x1.n(
var1,
(char)var5,
this.x() + 58.0F,
var11 - 4.0F + b<"y">(28860, 5134299399869276859L ^ var3) * (1.0F - ((Color)this.A().F()).getAlpha() / 255.0F),
7.0F,
7.0F,
2.5F,
1.0F,
1.0F,
1.0F,
(Color)this.A().F(),
jl.y.p((Color)this.A().F(), (char)var8, var9, 1.0F, (short)var10),
0.0F,
(short)var6,
0.0F,
var7,
0.0F,
b<"y">(8676, 2258401670414169056L ^ var3),
null
);
if (this.Z) {
float var12 = Math.clamp(1.0F - (var2 - var11) / 39.0F, 0.0F, 1.0F);
this.A().H(jl.y.p((Color)this.A().F(), (char)var8, var9, var12, (short)var10));
}
}

private final void C(short var1, Matrix3x2fStack var2, int var3, int var4, short var5) {
long var6 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ b;
long var10001 = var6 ^ 65491764045538L;
int var8 = (int)((var6 ^ 65491764045538L) >>> 48);
int var9 = (int)((var6 ^ 65491764045538L) << 16 >>> 48);
int var10 = (int)(var10001 << 32 >>> 32);
var10001 = var6 ^ 32975177360763L;
int var11 = (int)((var6 ^ 32975177360763L) >>> 48);
int var12 = (int)((var6 ^ 32975177360763L) << 16 >>> 32);
int var13 = (int)(var10001 << 48 >>> 48);
_g[] var10000 = vm.a<"Å">(5051133679507046788L, var6);
float var15 = this.x();
float[] var16 = new float[3];
Color.RGBtoHSB(((Color)this.A().F()).getRed(), ((Color)this.A().F()).getGreen(), ((Color)this.A().F()).getBlue(), var16);
_g[] var14 = var10000;

label20: {
try {
x1.n(
var2,
(char)var8,
var15 - 3.5F + b<"y">(22775, 5096988557644395593L ^ var6) * var16[0],
this.R() + 52.0F,
7.0F,
7.0F,
2.5F,
1.0F,
1.0F,
1.0F,
new Color(Color.HSBtoRGB(var16[0], 1.0F, 1.0F)),
new Color(Color.HSBtoRGB(var16[0], 1.0F, 1.0F)),
0.0F,
(short)var9,
0.0F,
var10,
0.0F,
b<"y">(8676, 2258395393255345500L ^ var6),
null
);
var19 = this.h;
if (var14 == null) {
break label20;
}

if (!this.h) {
return;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, 5052171138034442664L, var6);
}

var19 = var3;
}

float var17 = Math.clamp((var19 - var15) / 107.0F, 0.0F, 1.0F);
this.A().H(jl.y.p(new Color(Color.HSBtoRGB(var17, var16[1], var16[2])), (char)var11, var12, ((Color)this.A().F()).getAlpha() / 255.0F, (short)var13));
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
// 002: ldc2_w 138687564201394
// 005: lxor
// 006: lstore 8
// 008: dup2
// 009: ldc2_w 17677138035447
// 00c: lxor
// 00d: lstore 10
// 00f: pop2
// 010: ldc2_w 8591482653260427430
// 013: lload 1
// 014: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 019: aload 0
// 01a: getfield su/catlean/rx.K Ljava/util/ArrayList;
// 01d: checkcast java/lang/Iterable
// 020: astore 13
// 022: bipush 0
// 023: istore 14
// 025: aload 13
// 027: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 02c: astore 15
// 02e: astore 12
// 030: aload 15
// 032: invokeinterface java/util/Iterator.hasNext ()Z 1
// 037: ifeq 07f
// 03a: aload 15
// 03c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 041: astore 16
// 043: aload 16
// 045: checkcast su/catlean/b7
// 048: astore 17
// 04a: bipush 0
// 04b: istore 18
// 04d: aload 17
// 04f: dload 3
// 050: d2i
// 051: dload 5
// 053: d2i
// 054: lload 10
// 056: dup2_x1
// 057: pop2
// 058: invokevirtual su/catlean/b7.f (IJI)V
// 05b: nop
// 05c: aload 12
// 05e: lload 1
// 05f: lconst_0
// 060: lcmp
// 061: ifle 069
// 064: ifnull 080
// 067: aload 12
// 069: ifnonnull 030
// 06c: lload 1
// 06d: lconst_0
// 06e: lcmp
// 06f: iflt 05c
// 072: goto 07f
// 075: ldc2_w 8592518737364848778
// 078: lload 1
// 079: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: athrow
// 07f: nop
// 080: aload 0
// 081: invokevirtual su/catlean/rx.x ()F
// 084: fstore 13
// 086: dload 3
// 087: aload 0
// 088: invokevirtual su/catlean/rx.x ()F
// 08b: aload 0
// 08c: invokevirtual su/catlean/rx.F ()F
// 08f: fadd
// 090: f2d
// 091: dcmpg
// 092: aload 12
// 094: lload 1
// 095: lconst_0
// 096: lcmp
// 097: iflt 0c1
// 09a: ifnull 0bf
// 09d: ifgt 0e6
// 0a0: goto 0ad
// 0a3: ldc2_w 8592518737364848778
// 0a6: lload 1
// 0a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ac: athrow
// 0ad: fload 13
// 0af: f2d
// 0b0: dload 3
// 0b1: dcmpg
// 0b2: goto 0bf
// 0b5: ldc2_w 8592518737364848778
// 0b8: lload 1
// 0b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: athrow
// 0bf: aload 12
// 0c1: ifnull 0e3
// 0c4: ifgt 0e2
// 0c7: goto 0d4
// 0ca: ldc2_w 8592518737364848778
// 0cd: lload 1
// 0ce: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d3: athrow
// 0d4: bipush 1
// 0d5: goto 0e7
// 0d8: ldc2_w 8592518737364848778
// 0db: lload 1
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: bipush 0
// 0e3: goto 0e7
// 0e6: bipush 0
// 0e7: ifeq 199
// 0ea: aload 0
// 0eb: invokevirtual su/catlean/rx.R ()F
// 0ee: fstore 13
// 0f0: dload 5
// 0f2: aload 0
// 0f3: invokevirtual su/catlean/rx.R ()F
// 0f6: ldc 8.0
// 0f8: fadd
// 0f9: f2d
// 0fa: dcmpg
// 0fb: aload 12
// 0fd: lload 1
// 0fe: lconst_0
// 0ff: lcmp
// 100: iflt 12b
// 103: ifnull 129
// 106: ifgt 150
// 109: goto 116
// 10c: ldc2_w 8592518737364848778
// 10f: lload 1
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: fload 13
// 118: f2d
// 119: dload 5
// 11b: dcmpg
// 11c: goto 129
// 11f: ldc2_w 8592518737364848778
// 122: lload 1
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: aload 12
// 12b: ifnull 14d
// 12e: ifgt 14c
// 131: goto 13e
// 134: ldc2_w 8592518737364848778
// 137: lload 1
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: bipush 1
// 13f: goto 151
// 142: ldc2_w 8592518737364848778
// 145: lload 1
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: bipush 0
// 14d: goto 151
// 150: bipush 0
// 151: lload 1
// 152: lconst_0
// 153: lcmp
// 154: iflt 19d
// 157: ifeq 199
// 15a: aload 0
// 15b: aload 0
// 15c: getfield su/catlean/rx.J Z
// 15f: aload 12
// 161: ifnull 182
// 164: goto 171
// 167: ldc2_w 8592518737364848778
// 16a: lload 1
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: ifne 185
// 174: goto 181
// 177: ldc2_w 8592518737364848778
// 17a: lload 1
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: bipush 1
// 182: goto 186
// 185: bipush 0
// 186: putfield su/catlean/rx.J Z
// 189: aload 0
// 18a: bipush 0
// 18b: putfield su/catlean/rx.Z Z
// 18e: aload 0
// 18f: bipush 0
// 190: putfield su/catlean/rx.h Z
// 193: aload 0
// 194: bipush 0
// 195: putfield su/catlean/rx.O Z
// 198: return
// 199: aload 0
// 19a: getfield su/catlean/rx.J Z
// 19d: aload 12
// 19f: lload 1
// 1a0: lconst_0
// 1a1: lcmp
// 1a2: ifle 2c0
// 1a5: ifnull 2be
// 1a8: ifeq 2ad
// 1ab: goto 1b8
// 1ae: ldc2_w 8592518737364848778
// 1b1: lload 1
// 1b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b7: athrow
// 1b8: aload 0
// 1b9: invokevirtual su/catlean/rx.x ()F
// 1bc: ldc 57.0
// 1be: fadd
// 1bf: fstore 13
// 1c1: dload 3
// 1c2: aload 0
// 1c3: invokevirtual su/catlean/rx.x ()F
// 1c6: ldc 68.0
// 1c8: fadd
// 1c9: f2d
// 1ca: dcmpg
// 1cb: aload 12
// 1cd: lload 1
// 1ce: lconst_0
// 1cf: lcmp
// 1d0: iflt 1fa
// 1d3: ifnull 1f8
// 1d6: ifgt 21f
// 1d9: goto 1e6
// 1dc: ldc2_w 8592518737364848778
// 1df: lload 1
// 1e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e5: athrow
// 1e6: fload 13
// 1e8: f2d
// 1e9: dload 3
// 1ea: dcmpg
// 1eb: goto 1f8
// 1ee: ldc2_w 8592518737364848778
// 1f1: lload 1
// 1f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: athrow
// 1f8: aload 12
// 1fa: ifnull 21c
// 1fd: ifgt 21b
// 200: goto 20d
// 203: ldc2_w 8592518737364848778
// 206: lload 1
// 207: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 20c: athrow
// 20d: bipush 1
// 20e: goto 220
// 211: ldc2_w 8592518737364848778
// 214: lload 1
// 215: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21a: athrow
// 21b: bipush 0
// 21c: goto 220
// 21f: bipush 0
// 220: ifeq 2ad
// 223: aload 0
// 224: invokevirtual su/catlean/rx.R ()F
// 227: ldc 11.0
// 229: fadd
// 22a: fstore 13
// 22c: dload 5
// 22e: aload 0
// 22f: invokevirtual su/catlean/rx.R ()F
// 232: ldc 50.0
// 234: fadd
// 235: f2d
// 236: dcmpg
// 237: aload 12
// 239: lload 1
// 23a: lconst_0
// 23b: lcmp
// 23c: ifle 267
// 23f: ifnull 265
// 242: ifgt 28c
// 245: goto 252
// 248: ldc2_w 8592518737364848778
// 24b: lload 1
// 24c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 251: athrow
// 252: fload 13
// 254: f2d
// 255: dload 5
// 257: dcmpg
// 258: goto 265
// 25b: ldc2_w 8592518737364848778
// 25e: lload 1
// 25f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 264: athrow
// 265: aload 12
// 267: ifnull 289
// 26a: ifgt 288
// 26d: goto 27a
// 270: ldc2_w 8592518737364848778
// 273: lload 1
// 274: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: athrow
// 27a: bipush 1
// 27b: goto 28d
// 27e: ldc2_w 8592518737364848778
// 281: lload 1
// 282: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 287: athrow
// 288: bipush 0
// 289: goto 28d
// 28c: bipush 0
// 28d: lload 1
// 28e: lconst_0
// 28f: lcmp
// 290: iflt 2b1
// 293: ifeq 2ad
// 296: aload 0
// 297: bipush 1
// 298: putfield su/catlean/rx.Z Z
// 29b: aload 12
// 29d: ifnonnull 73c
// 2a0: goto 2ad
// 2a3: ldc2_w 8592518737364848778
// 2a6: lload 1
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: aload 0
// 2ae: getfield su/catlean/rx.J Z
// 2b1: goto 2be
// 2b4: ldc2_w 8592518737364848778
// 2b7: lload 1
// 2b8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bd: athrow
// 2be: aload 12
// 2c0: lload 1
// 2c1: lconst_0
// 2c2: lcmp
// 2c3: ifle 3de
// 2c6: ifnull 3dc
// 2c9: ifeq 3cb
// 2cc: goto 2d9
// 2cf: ldc2_w 8592518737364848778
// 2d2: lload 1
// 2d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d8: athrow
// 2d9: aload 0
// 2da: invokevirtual su/catlean/rx.x ()F
// 2dd: fstore 13
// 2df: dload 3
// 2e0: aload 0
// 2e1: invokevirtual su/catlean/rx.x ()F
// 2e4: ldc 108.0
// 2e6: fadd
// 2e7: f2d
// 2e8: dcmpg
// 2e9: aload 12
// 2eb: lload 1
// 2ec: lconst_0
// 2ed: lcmp
// 2ee: ifle 318
// 2f1: ifnull 316
// 2f4: ifgt 33d
// 2f7: goto 304
// 2fa: ldc2_w 8592518737364848778
// 2fd: lload 1
// 2fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 303: athrow
// 304: fload 13
// 306: f2d
// 307: dload 3
// 308: dcmpg
// 309: goto 316
// 30c: ldc2_w 8592518737364848778
// 30f: lload 1
// 310: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 315: athrow
// 316: aload 12
// 318: ifnull 33a
// 31b: ifgt 339
// 31e: goto 32b
// 321: ldc2_w 8592518737364848778
// 324: lload 1
// 325: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32a: athrow
// 32b: bipush 1
// 32c: goto 33e
// 32f: ldc2_w 8592518737364848778
// 332: lload 1
// 333: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 338: athrow
// 339: bipush 0
// 33a: goto 33e
// 33d: bipush 0
// 33e: ifeq 3cb
// 341: aload 0
// 342: invokevirtual su/catlean/rx.R ()F
// 345: ldc 53.0
// 347: fadd
// 348: fstore 13
// 34a: dload 5
// 34c: aload 0
// 34d: invokevirtual su/catlean/rx.R ()F
// 350: ldc 58.0
// 352: fadd
// 353: f2d
// 354: dcmpg
// 355: aload 12
// 357: lload 1
// 358: lconst_0
// 359: lcmp
// 35a: iflt 385
// 35d: ifnull 383
// 360: ifgt 3aa
// 363: goto 370
// 366: ldc2_w 8592518737364848778
// 369: lload 1
// 36a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36f: athrow
// 370: fload 13
// 372: f2d
// 373: dload 5
// 375: dcmpg
// 376: goto 383
// 379: ldc2_w 8592518737364848778
// 37c: lload 1
// 37d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 382: athrow
// 383: aload 12
// 385: ifnull 3a7
// 388: ifgt 3a6
// 38b: goto 398
// 38e: ldc2_w 8592518737364848778
// 391: lload 1
// 392: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 397: athrow
// 398: bipush 1
// 399: goto 3ab
// 39c: ldc2_w 8592518737364848778
// 39f: lload 1
// 3a0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a5: athrow
// 3a6: bipush 0
// 3a7: goto 3ab
// 3aa: bipush 0
// 3ab: lload 1
// 3ac: lconst_0
// 3ad: lcmp
// 3ae: iflt 3cf
// 3b1: ifeq 3cb
// 3b4: aload 0
// 3b5: bipush 1
// 3b6: putfield su/catlean/rx.h Z
// 3b9: aload 12
// 3bb: ifnonnull 73c
// 3be: goto 3cb
// 3c1: ldc2_w 8592518737364848778
// 3c4: lload 1
// 3c5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3ca: athrow
// 3cb: aload 0
// 3cc: getfield su/catlean/rx.J Z
// 3cf: goto 3dc
// 3d2: ldc2_w 8592518737364848778
// 3d5: lload 1
// 3d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3db: athrow
// 3dc: aload 12
// 3de: lload 1
// 3df: lconst_0
// 3e0: lcmp
// 3e1: iflt 509
// 3e4: ifnull 507
// 3e7: ifeq 4f6
// 3ea: goto 3f7
// 3ed: ldc2_w 8592518737364848778
// 3f0: lload 1
// 3f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f6: athrow
// 3f7: aload 0
// 3f8: invokevirtual su/catlean/rx.x ()F
// 3fb: aload 0
// 3fc: invokevirtual su/catlean/rx.F ()F
// 3ff: fadd
// 400: ldc 48.0
// 402: fsub
// 403: fstore 13
// 405: dload 3
// 406: aload 0
// 407: invokevirtual su/catlean/rx.x ()F
// 40a: aload 0
// 40b: invokevirtual su/catlean/rx.F ()F
// 40e: fadd
// 40f: ldc 8.0
// 411: fsub
// 412: f2d
// 413: dcmpg
// 414: aload 12
// 416: lload 1
// 417: lconst_0
// 418: lcmp
// 419: iflt 443
// 41c: ifnull 441
// 41f: ifgt 468
// 422: goto 42f
// 425: ldc2_w 8592518737364848778
// 428: lload 1
// 429: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42e: athrow
// 42f: fload 13
// 431: f2d
// 432: dload 3
// 433: dcmpg
// 434: goto 441
// 437: ldc2_w 8592518737364848778
// 43a: lload 1
// 43b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 440: athrow
// 441: aload 12
// 443: ifnull 465
// 446: ifgt 464
// 449: goto 456
// 44c: ldc2_w 8592518737364848778
// 44f: lload 1
// 450: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 455: athrow
// 456: bipush 1
// 457: goto 469
// 45a: ldc2_w 8592518737364848778
// 45d: lload 1
// 45e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 463: athrow
// 464: bipush 0
// 465: goto 469
// 468: bipush 0
// 469: ifeq 4f6
// 46c: aload 0
// 46d: invokevirtual su/catlean/rx.R ()F
// 470: ldc 11.0
// 472: fadd
// 473: fstore 13
// 475: dload 5
// 477: aload 0
// 478: invokevirtual su/catlean/rx.R ()F
// 47b: ldc 51.0
// 47d: fadd
// 47e: f2d
// 47f: dcmpg
// 480: aload 12
// 482: lload 1
// 483: lconst_0
// 484: lcmp
// 485: ifle 4b0
// 488: ifnull 4ae
// 48b: ifgt 4d5
// 48e: goto 49b
// 491: ldc2_w 8592518737364848778
// 494: lload 1
// 495: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49a: athrow
// 49b: fload 13
// 49d: f2d
// 49e: dload 5
// 4a0: dcmpg
// 4a1: goto 4ae
// 4a4: ldc2_w 8592518737364848778
// 4a7: lload 1
// 4a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ad: athrow
// 4ae: aload 12
// 4b0: ifnull 4d2
// 4b3: ifgt 4d1
// 4b6: goto 4c3
// 4b9: ldc2_w 8592518737364848778
// 4bc: lload 1
// 4bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c2: athrow
// 4c3: bipush 1
// 4c4: goto 4d6
// 4c7: ldc2_w 8592518737364848778
// 4ca: lload 1
// 4cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d0: athrow
// 4d1: bipush 0
// 4d2: goto 4d6
// 4d5: bipush 0
// 4d6: lload 1
// 4d7: lconst_0
// 4d8: lcmp
// 4d9: iflt 4fa
// 4dc: ifeq 4f6
// 4df: aload 0
// 4e0: bipush 1
// 4e1: putfield su/catlean/rx.O Z
// 4e4: aload 12
// 4e6: ifnonnull 73c
// 4e9: goto 4f6
// 4ec: ldc2_w 8592518737364848778
// 4ef: lload 1
// 4f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f5: athrow
// 4f6: aload 0
// 4f7: getfield su/catlean/rx.J Z
// 4fa: goto 507
// 4fd: ldc2_w 8592518737364848778
// 500: lload 1
// 501: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 506: athrow
// 507: aload 12
// 509: lload 1
// 50a: lconst_0
// 50b: lcmp
// 50c: iflt 634
// 50f: ifnull 632
// 512: ifeq 621
// 515: goto 522
// 518: ldc2_w 8592518737364848778
// 51b: lload 1
// 51c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 521: athrow
// 522: aload 0
// 523: invokevirtual su/catlean/rx.x ()F
// 526: fstore 13
// 528: dload 3
// 529: aload 0
// 52a: invokevirtual su/catlean/rx.x ()F
// 52d: ldc 25.0
// 52f: fadd
// 530: f2d
// 531: dcmpg
// 532: aload 12
// 534: lload 1
// 535: lconst_0
// 536: lcmp
// 537: ifle 561
// 53a: ifnull 55f
// 53d: ifgt 586
// 540: goto 54d
// 543: ldc2_w 8592518737364848778
// 546: lload 1
// 547: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54c: athrow
// 54d: fload 13
// 54f: f2d
// 550: dload 3
// 551: dcmpg
// 552: goto 55f
// 555: ldc2_w 8592518737364848778
// 558: lload 1
// 559: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55e: athrow
// 55f: aload 12
// 561: ifnull 583
// 564: ifgt 582
// 567: goto 574
// 56a: ldc2_w 8592518737364848778
// 56d: lload 1
// 56e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 573: athrow
// 574: bipush 1
// 575: goto 587
// 578: ldc2_w 8592518737364848778
// 57b: lload 1
// 57c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 581: athrow
// 582: bipush 0
// 583: goto 587
// 586: bipush 0
// 587: ifeq 621
// 58a: aload 0
// 58b: invokevirtual su/catlean/rx.R ()F
// 58e: ldc 24.0
// 590: fadd
// 591: fstore 13
// 593: dload 5
// 595: aload 0
// 596: invokevirtual su/catlean/rx.R ()F
// 599: ldc 34.0
// 59b: fadd
// 59c: f2d
// 59d: dcmpg
// 59e: aload 12
// 5a0: lload 1
// 5a1: lconst_0
// 5a2: lcmp
// 5a3: ifle 5ce
// 5a6: ifnull 5cc
// 5a9: ifgt 5f3
// 5ac: goto 5b9
// 5af: ldc2_w 8592518737364848778
// 5b2: lload 1
// 5b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b8: athrow
// 5b9: fload 13
// 5bb: f2d
// 5bc: dload 5
// 5be: dcmpg
// 5bf: goto 5cc
// 5c2: ldc2_w 8592518737364848778
// 5c5: lload 1
// 5c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5cb: athrow
// 5cc: aload 12
// 5ce: ifnull 5f0
// 5d1: ifgt 5ef
// 5d4: goto 5e1
// 5d7: ldc2_w 8592518737364848778
// 5da: lload 1
// 5db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e0: athrow
// 5e1: bipush 1
// 5e2: goto 5f4
// 5e5: ldc2_w 8592518737364848778
// 5e8: lload 1
// 5e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ee: athrow
// 5ef: bipush 0
// 5f0: goto 5f4
// 5f3: bipush 0
// 5f4: lload 1
// 5f5: lconst_0
// 5f6: lcmp
// 5f7: iflt 625
// 5fa: ifeq 621
// 5fd: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 600: aload 0
// 601: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 604: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 607: checkcast java/awt/Color
// 60a: lload 8
// 60c: invokevirtual su/catlean/jh.I (Ljava/awt/Color;J)V
// 60f: aload 12
// 611: ifnonnull 73c
// 614: goto 621
// 617: ldc2_w 8592518737364848778
// 61a: lload 1
// 61b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 620: athrow
// 621: aload 0
// 622: getfield su/catlean/rx.J Z
// 625: goto 632
// 628: ldc2_w 8592518737364848778
// 62b: lload 1
// 62c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 631: athrow
// 632: aload 12
// 634: lload 1
// 635: lconst_0
// 636: lcmp
// 637: iflt 65f
// 63a: ifnull 65d
// 63d: ifeq 73c
// 640: goto 64d
// 643: ldc2_w 8592518737364848778
// 646: lload 1
// 647: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 64c: athrow
// 64d: aload 0
// 64e: invokevirtual su/catlean/rx.x ()F
// 651: fstore 13
// 653: dload 3
// 654: aload 0
// 655: invokevirtual su/catlean/rx.x ()F
// 658: ldc 25.0
// 65a: fadd
// 65b: f2d
// 65c: dcmpg
// 65d: aload 12
// 65f: lload 1
// 660: lconst_0
// 661: lcmp
// 662: ifle 68c
// 665: ifnull 68a
// 668: ifgt 6b1
// 66b: goto 678
// 66e: ldc2_w 8592518737364848778
// 671: lload 1
// 672: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 677: athrow
// 678: fload 13
// 67a: f2d
// 67b: dload 3
// 67c: dcmpg
// 67d: goto 68a
// 680: ldc2_w 8592518737364848778
// 683: lload 1
// 684: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 689: athrow
// 68a: aload 12
// 68c: ifnull 6ae
// 68f: ifgt 6ad
// 692: goto 69f
// 695: ldc2_w 8592518737364848778
// 698: lload 1
// 699: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69e: athrow
// 69f: bipush 1
// 6a0: goto 6b2
// 6a3: ldc2_w 8592518737364848778
// 6a6: lload 1
// 6a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ac: athrow
// 6ad: bipush 0
// 6ae: goto 6b2
// 6b1: bipush 0
// 6b2: ifeq 73c
// 6b5: aload 0
// 6b6: invokevirtual su/catlean/rx.R ()F
// 6b9: ldc 38.0
// 6bb: fadd
// 6bc: fstore 13
// 6be: dload 5
// 6c0: aload 0
// 6c1: invokevirtual su/catlean/rx.R ()F
// 6c4: ldc 47.0
// 6c6: fadd
// 6c7: f2d
// 6c8: dcmpg
// 6c9: aload 12
// 6cb: lload 1
// 6cc: lconst_0
// 6cd: lcmp
// 6ce: ifle 6f9
// 6d1: ifnull 6f7
// 6d4: ifgt 71e
// 6d7: goto 6e4
// 6da: ldc2_w 8592518737364848778
// 6dd: lload 1
// 6de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6e3: athrow
// 6e4: fload 13
// 6e6: f2d
// 6e7: dload 5
// 6e9: dcmpg
// 6ea: goto 6f7
// 6ed: ldc2_w 8592518737364848778
// 6f0: lload 1
// 6f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f6: athrow
// 6f7: aload 12
// 6f9: ifnull 71b
// 6fc: ifgt 71a
// 6ff: goto 70c
// 702: ldc2_w 8592518737364848778
// 705: lload 1
// 706: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 70b: athrow
// 70c: bipush 1
// 70d: goto 71f
// 710: ldc2_w 8592518737364848778
// 713: lload 1
// 714: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 719: athrow
// 71a: bipush 0
// 71b: goto 71f
// 71e: bipush 0
// 71f: ifeq 73c
// 722: aload 0
// 723: invokevirtual su/catlean/rx.A ()Lsu/catlean/a1;
// 726: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 729: invokevirtual su/catlean/jh.l ()Ljava/awt/Color;
// 72c: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 72f: goto 73c
// 732: ldc2_w 8592518737364848778
// 735: lload 1
// 736: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73b: athrow
// 73c: return
}

@Override
public void U(double mouseX, double mouseY, int button) {
this.O = false;
this.h = false;
this.Z = false;
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@Override
public void V(int key, short a, int a, char a) {
long var5 = (long)a << 48 | (long)ax << 32 >>> 16 | (long)axx << 48 >>> 48;
int var7 = (int)((var5 ^ 70303453601542L) >>> 56);
long var8 = (var5 ^ 70303453601542L) << 8 >>> 8;
_g[] var10000 = vm.a<"Å">(-3368314324986226980L, var5);
Iterable var11 = this.K;
_g[] var10 = var10000;
boolean var12 = false;

label38:
for (Object var14 : var11) {
b7 var15 = (b7)var14;
boolean var16 = false;

try {
var15.y((byte)var7, key, var8);
} catch (NumberFormatException var17) {
throw vm.a<"Å">(var17, -3367418979510929680L, var5);
}

do {
try {
var10000 = var10;
if (axx > 0) {
if (var10 == null) {
return;
}

var10000 = var10;
}

if (var10000 != null) {
continue label38;
}
} catch (NumberFormatException var18) {
throw vm.a<"Å">(var18, -3367418979510929680L, var5);
}
} while (axx < 0);

return;
}
}

// $VF: Handled exception range with multiple entry points by splitting it
// $VF: Duplicated exception handlers to handle obfuscated exceptions
@Override
public void T(char char, long a) {
long var4 = a ^ 78532298840237L;
_g[] var10000 = vm.a<"Å">(666088507151863459L, a);
Iterable var7 = this.K;
_g[] var6 = var10000;
boolean var8 = false;

label38:
for (Object var10 : var7) {
b7 var11 = (b7)var10;
boolean var12 = false;

try {
var11.G(char, var4);
} catch (NumberFormatException var13) {
throw vm.a<"Å">(var13, 665330188279639695L, a);
}

do {
try {
var10000 = var6;
if (a > 0L) {
if (var6 == null) {
return;
}

var10000 = var6;
}

if (var10000 != null) {
continue label38;
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 665330188279639695L, a);
}
} while (a < 0L);

return;
}
}

@Override
public boolean S(byte a, double mouseX, double mouseY, double verticalAmount, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 1
// 01: i2l
// 02: bipush 56
// 04: lshl
// 05: lload 8
// 07: bipush 8
// 09: lshl
// 0a: bipush 8
// 0c: lushr
// 0d: lor
// 0e: lstore 10
// 10: lload 10
// 12: dup2
// 13: ldc2_w 89558228970238
// 16: lxor
// 17: lstore 12
// 19: pop2
// 1a: ldc2_w 6537910343375756582
// 1d: lload 10
// 1f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24: astore 14
// 26: aload 0
// 27: getfield su/catlean/rx.J Z
// 2a: aload 14
// 2c: ifnull 4e
// 2f: ifne 4d
// 32: goto 40
// 35: ldc2_w 6538808162785574154
// 38: lload 10
// 3a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f: athrow
// 40: bipush 0
// 41: ireturn
// 42: ldc2_w 6538808162785574154
// 45: lload 10
// 47: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c: athrow
// 4d: bipush 0
// 4e: istore 15
// 50: aload 0
// 51: getfield su/catlean/rx.K Ljava/util/ArrayList;
// 54: checkcast java/lang/Iterable
// 57: astore 16
// 59: bipush 0
// 5a: istore 17
// 5c: aload 16
// 5e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 63: astore 18
// 65: aload 18
// 67: invokeinterface java/util/Iterator.hasNext ()Z 1
// 6c: ifeq c5
// 6f: aload 18
// 71: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 76: astore 19
// 78: aload 19
// 7a: checkcast su/catlean/b7
// 7d: astore 20
// 7f: bipush 0
// 80: istore 21
// 82: aload 14
// 84: iload 1
// 85: iflt c2
// 88: ifnull c0
// 8b: aload 20
// 8d: dload 2
// 8e: dload 4
// 90: dload 6
// 92: lload 12
// 94: invokevirtual su/catlean/b7.d (DDDJ)Z
// 97: aload 14
// 99: ifnull c8
// 9c: goto aa
// 9f: ldc2_w 6538808162785574154
// a2: lload 10
// a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a9: athrow
// aa: ifeq be
// ad: goto bb
// b0: ldc2_w 6538808162785574154
// b3: lload 10
// b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ba: athrow
// bb: bipush 1
// bc: istore 15
// be: nop
// bf: nop
// c0: aload 14
// c2: ifnonnull 65
// c5: nop
// c6: iload 15
// c8: ireturn
}

@Override
public void L() {
this.O = false;
this.h = false;
this.Z = false;
}

static {
long var22 = b ^ 98005831403160L;
Cipher var24;
Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var25 = 1; var25 < 8; var25++) {
var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var31 = new String[9];
int var29 = 0;
String var28 = "Â.\u0014×ºÃÔ\u0099fz\u000b¯Ã\t%\u0002\u00108âØ\u0081ÌÏ±h[ã'¶°xr\u0000\u0018zC\u009aO\u0087(«B¸i@ðµïÑdCáUC®K-«\u0010H^CgÉÞ\u001diÃo\nqø\u00835û \u008ciRx4\u000e*#~c\u0084Àw£ÞÔV\u0087\u0013ÄÐ¸g<oÅ.iý\u0019 \f\u0018\u001b6A%tüË&â\u0017«Uûn:íõ\u0003\u001c\\'øÊ\\\u0010\u0090ß\u008b\u0095*\u009cìeWRì\u000e×48´";
int var30 = "Â.\u0014×ºÃÔ\u0099fz\u000b¯Ã\t%\u0002\u00108âØ\u0081ÌÏ±h[ã'¶°xr\u0000\u0018zC\u009aO\u0087(«B¸i@ðµïÑdCáUC®K-«\u0010H^CgÉÞ\u001diÃo\nqø\u00835û \u008ciRx4\u000e*#~c\u0084Àw£ÞÔV\u0087\u0013ÄÐ¸g<oÅ.iý\u0019 \f\u0018\u001b6A%tüË&â\u0017«Uûn:íõ\u0003\u001c\\'øÊ\\\u0010\u0090ß\u008b\u0095*\u009cìeWRì\u000e×48´"
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
e = new String[9];
l = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[11];
int var14 = 0;
String var15 = "AD\"¦z.B{ºàïR\fÇAA1ß\u0011\\Û]\u008f\tÀ\u00ad¶\u0096HËÍi¸¿\u008c¸\u0086÷\u000f\u0085gº\b:6óp\u0085Ù\u0082\u000b\u0006&\u000f¿×\fdëï\u001f}`£ê\u008eü\u009bÏTý4";
int var16 = "AD\"¦z.B{ºàïR\fÇAA1ß\u0011\\Û]\u008f\tÀ\u00ad¶\u0096HËÍi¸¿\u008c¸\u0086÷\u000f\u0085gº\b:6óp\u0085Ù\u0082\u000b\u0006&\u000f¿×\fdëï\u001f}`£ê\u008eü\u009bÏTý4"
.length();
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
k = new Integer[11];
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
String var4 = "äë®>±\u0083P²eÎT\u0094](éI";
int var5 = "äë®>±\u0083P²eÎT\u0094](éI".length();
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

var15 = "\u0005z`\u0005Ä\u0015fÃV;\u009eÓ ñÐ\u001a";
var16 = "\u0005z`\u0005Ä\u0015fÃV;\u009eÓ ñÐ\u001a".length();
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

var28 = "M¸3K\u008bzËFß@5\u0019\u0086Ö\u008f[ëI\u000e\u0019#\u0092?\u0080\u0010\u001b|\t»\u0015P\u008aº\u001dà¥g\u0018P+-";
var30 = "M¸3K\u008bzËFß@5\u0019\u0086Ö\u008f[ëI\u000e\u0019#\u0092?\u0080\u0010\u001b|\t»\u0015P\u008aº\u001dà¥g\u0018P+-".length();
var27 = 24;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 3710;
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
throw new RuntimeException("su/catlean/rx", var10);
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
throw new RuntimeException("su/catlean/rx" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27583;
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
throw new RuntimeException("su/catlean/rx", var14);
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
throw new RuntimeException("su/catlean/rx" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 32604;
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
throw new RuntimeException("su/catlean/rx", var14);
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
throw new RuntimeException("su/catlean/rx" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
