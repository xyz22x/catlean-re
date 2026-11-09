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

public final class xj extends f6 {
@NotNull
private wl V;
@NotNull
private final fd b;
private static boolean o;
private static final long a = yz.a(-4546518024628420997L, 3817716180005358337L, MethodHandles.lookup().lookupClass()).a(252118035970812L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;
private static final long i;

public xj(@NotNull wl macros, int a, int a) {
long var4 = ((long)axx << 32 | (long)ax << 32 >>> 32) ^ a;
long var6 = var4 ^ 132076665478556L;
Intrinsics.checkNotNullParameter(macros, a<"g">(9797, 253297102812008819L ^ var4));
super();
this.V = macros;
this.b = new fd(_s.OUT_QUINT, i, var6);
}

@NotNull
public final wl a() {
return this.V;
}

public final void L(long a, @NotNull wl <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"g">(27145, 8846360347683930546L ^ ax));
this.V = <set-?>;
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
// 002: ldc2_w 127744779498483
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
// 02a: ldc2_w 18569812997841
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 97956880838355
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 15727589290443
// 03b: lxor
// 03c: lstore 17
// 03e: dup2
// 03f: ldc2_w 81101117301204
// 042: lxor
// 043: lstore 19
// 045: dup2
// 046: ldc2_w 53580834126530
// 049: lxor
// 04a: lstore 21
// 04c: dup2
// 04d: ldc2_w 18592005668209
// 050: lxor
// 051: lstore 23
// 053: dup2
// 054: ldc2_w 81010294496925
// 057: lxor
// 058: dup2
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 25
// 05f: dup2
// 060: bipush 16
// 062: lshl
// 063: bipush 32
// 065: lushr
// 066: l2i
// 067: istore 26
// 069: dup2
// 06a: bipush 48
// 06c: lshl
// 06d: bipush 48
// 06f: lushr
// 070: l2i
// 071: istore 27
// 073: pop2
// 074: pop2
// 075: ldc2_w 9043843480442044075
// 078: lload 1
// 079: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07e: aload 3
// 07f: sipush 5894
// 082: ldc2_w 957394665602425472
// 085: lload 1
// 086: lxor
// 087: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08f: istore 28
// 091: fload 4
// 093: fload 6
// 095: fcmpg
// 096: iload 28
// 098: ifne 0c0
// 09b: ifgt 0e7
// 09e: goto 0ab
// 0a1: ldc2_w 9041252007319452164
// 0a4: lload 1
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: fload 6
// 0ad: fload 4
// 0af: ldc 70.0
// 0b1: fadd
// 0b2: fcmpg
// 0b3: goto 0c0
// 0b6: ldc2_w 9041252007319452164
// 0b9: lload 1
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: iload 28
// 0c2: ifne 0e4
// 0c5: ifgt 0e3
// 0c8: goto 0d5
// 0cb: ldc2_w 9041252007319452164
// 0ce: lload 1
// 0cf: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d4: athrow
// 0d5: bipush 1
// 0d6: goto 0e8
// 0d9: ldc2_w 9041252007319452164
// 0dc: lload 1
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: bipush 0
// 0e4: goto 0e8
// 0e7: bipush 0
// 0e8: lload 1
// 0e9: lconst_0
// 0ea: lcmp
// 0eb: ifle 0f6
// 0ee: ifeq 172
// 0f1: fload 5
// 0f3: fload 7
// 0f5: fcmpg
// 0f6: iload 28
// 0f8: lload 1
// 0f9: lconst_0
// 0fa: lcmp
// 0fb: ifle 135
// 0fe: ifne 133
// 101: goto 10e
// 104: ldc2_w 9041252007319452164
// 107: lload 1
// 108: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10d: athrow
// 10e: ifgt 15a
// 111: goto 11e
// 114: ldc2_w 9041252007319452164
// 117: lload 1
// 118: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11d: athrow
// 11e: fload 7
// 120: fload 5
// 122: ldc 25.0
// 124: fadd
// 125: fcmpg
// 126: goto 133
// 129: ldc2_w 9041252007319452164
// 12c: lload 1
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: iload 28
// 135: ifne 157
// 138: ifgt 156
// 13b: goto 148
// 13e: ldc2_w 9041252007319452164
// 141: lload 1
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: bipush 1
// 149: goto 15b
// 14c: ldc2_w 9041252007319452164
// 14f: lload 1
// 150: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 155: athrow
// 156: bipush 0
// 157: goto 15b
// 15a: bipush 0
// 15b: lload 1
// 15c: lconst_0
// 15d: lcmp
// 15e: iflt 165
// 161: ifeq 172
// 164: bipush 1
// 165: goto 173
// 168: ldc2_w 9041252007319452164
// 16b: lload 1
// 16c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 171: athrow
// 172: bipush 0
// 173: istore 29
// 175: getstatic su/catlean/ih.v Lsu/catlean/ih;
// 178: iload 29
// 17a: ifeq 18e
// 17d: aload 0
// 17e: checkcast su/catlean/f6
// 181: goto 194
// 184: ldc2_w 9041252007319452164
// 187: lload 1
// 188: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18d: athrow
// 18e: getstatic su/catlean/ih.v Lsu/catlean/ih;
// 191: invokevirtual su/catlean/ih.U ()Lsu/catlean/f6;
// 194: invokevirtual su/catlean/ih.N (Lsu/catlean/f6;)V
// 197: aload 0
// 198: getfield su/catlean/xj.b Lsu/catlean/fd;
// 19b: iload 29
// 19d: ifeq 1ae
// 1a0: fconst_1
// 1a1: goto 1af
// 1a4: ldc2_w 9041252007319452164
// 1a7: lload 1
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: fconst_0
// 1af: lload 15
// 1b1: dup2_x1
// 1b2: pop2
// 1b3: invokevirtual su/catlean/fd.B (JF)V
// 1b6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1b9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1bc: invokevirtual su/catlean/jh.i ()Ljava/awt/Color;
// 1bf: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1c2: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 1c5: aload 0
// 1c6: getfield su/catlean/xj.V Lsu/catlean/wl;
// 1c9: invokeinterface su/catlean/wl.I ()Z 1
// 1ce: ifeq 1df
// 1d1: fconst_1
// 1d2: goto 1e0
// 1d5: ldc2_w 9041252007319452164
// 1d8: lload 1
// 1d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1de: athrow
// 1df: fconst_0
// 1e0: lload 8
// 1e2: dup2_x2
// 1e3: pop2
// 1e4: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 1e7: astore 30
// 1e9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1ec: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1ef: invokevirtual su/catlean/jh.h ()Ljava/awt/Color;
// 1f2: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1f5: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 1f8: aload 0
// 1f9: getfield su/catlean/xj.V Lsu/catlean/wl;
// 1fc: invokeinterface su/catlean/wl.I ()Z 1
// 201: ifeq 212
// 204: fconst_1
// 205: goto 213
// 208: ldc2_w 9041252007319452164
// 20b: lload 1
// 20c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 211: athrow
// 212: fconst_0
// 213: lload 8
// 215: dup2_x2
// 216: pop2
// 217: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 21a: astore 31
// 21c: aload 3
// 21d: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 220: dup
// 221: sipush 24470
// 224: ldc2_w 763991572924394005
// 227: lload 1
// 228: lxor
// 229: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 231: fload 4
// 233: ldc 4.0
// 235: fadd
// 236: iload 10
// 238: i2c
// 239: swap
// 23a: fload 5
// 23c: ldc 70.0
// 23e: ldc 25.0
// 240: fconst_2
// 241: ldc 2.5
// 243: aload 0
// 244: getfield su/catlean/xj.b Lsu/catlean/fd;
// 247: invokevirtual su/catlean/fd.a ()F
// 24a: fadd
// 24b: fconst_1
// 24c: fconst_1
// 24d: aload 30
// 24f: aload 31
// 251: fconst_0
// 252: iload 11
// 254: i2s
// 255: fconst_0
// 256: iload 12
// 258: fconst_0
// 259: sipush 29677
// 25c: ldc2_w 8576175366232374202
// 25f: lload 1
// 260: lxor
// 261: invokedynamic y (IJ)I bsm=su/catlean/xj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 266: aconst_null
// 267: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 26a: aload 3
// 26b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 26e: dup
// 26f: sipush 6577
// 272: ldc2_w 3109523970515479606
// 275: lload 1
// 276: lxor
// 277: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 27f: fload 4
// 281: ldc 54.0
// 283: fadd
// 284: iload 10
// 286: i2c
// 287: swap
// 288: fload 5
// 28a: ldc 5.0
// 28c: fadd
// 28d: ldc 15.0
// 28f: ldc 15.0
// 291: fconst_2
// 292: fconst_2
// 293: fconst_0
// 294: fconst_1
// 295: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 298: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 29b: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 29e: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 2a1: fconst_0
// 2a2: iload 11
// 2a4: i2s
// 2a5: fconst_0
// 2a6: iload 12
// 2a8: fconst_0
// 2a9: sipush 22515
// 2ac: ldc2_w 2605818240516284326
// 2af: lload 1
// 2b0: lxor
// 2b1: invokedynamic y (IJ)I bsm=su/catlean/xj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b6: aconst_null
// 2b7: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 2ba: fload 4
// 2bc: ldc 54.0
// 2be: fadd
// 2bf: fstore 32
// 2c1: fload 6
// 2c3: fload 4
// 2c5: ldc 69.0
// 2c7: fadd
// 2c8: fcmpg
// 2c9: iload 28
// 2cb: lload 1
// 2cc: lconst_0
// 2cd: lcmp
// 2ce: iflt 2f8
// 2d1: ifne 2f6
// 2d4: ifgt 31d
// 2d7: goto 2e4
// 2da: ldc2_w 9041252007319452164
// 2dd: lload 1
// 2de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e3: athrow
// 2e4: fload 32
// 2e6: fload 6
// 2e8: fcmpg
// 2e9: goto 2f6
// 2ec: ldc2_w 9041252007319452164
// 2ef: lload 1
// 2f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f5: athrow
// 2f6: iload 28
// 2f8: ifne 31a
// 2fb: ifgt 319
// 2fe: goto 30b
// 301: ldc2_w 9041252007319452164
// 304: lload 1
// 305: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30a: athrow
// 30b: bipush 1
// 30c: goto 31e
// 30f: ldc2_w 9041252007319452164
// 312: lload 1
// 313: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 318: athrow
// 319: bipush 0
// 31a: goto 31e
// 31d: bipush 0
// 31e: ifeq 39c
// 321: fload 5
// 323: ldc 5.0
// 325: fadd
// 326: fstore 32
// 328: fload 7
// 32a: fload 5
// 32c: ldc 20.0
// 32e: fadd
// 32f: fcmpg
// 330: iload 28
// 332: lload 1
// 333: lconst_0
// 334: lcmp
// 335: iflt 35f
// 338: ifne 35d
// 33b: ifgt 384
// 33e: goto 34b
// 341: ldc2_w 9041252007319452164
// 344: lload 1
// 345: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34a: athrow
// 34b: fload 32
// 34d: fload 7
// 34f: fcmpg
// 350: goto 35d
// 353: ldc2_w 9041252007319452164
// 356: lload 1
// 357: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35c: athrow
// 35d: iload 28
// 35f: ifne 381
// 362: ifgt 380
// 365: goto 372
// 368: ldc2_w 9041252007319452164
// 36b: lload 1
// 36c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 371: athrow
// 372: bipush 1
// 373: goto 385
// 376: ldc2_w 9041252007319452164
// 379: lload 1
// 37a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37f: athrow
// 380: bipush 0
// 381: goto 385
// 384: bipush 0
// 385: ifeq 39c
// 388: getstatic su/catlean/ih.v Lsu/catlean/ih;
// 38b: bipush 1
// 38c: invokevirtual su/catlean/ih.t (Z)V
// 38f: goto 39c
// 392: ldc2_w 9041252007319452164
// 395: lload 1
// 396: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39b: athrow
// 39c: lload 19
// 39e: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 3a1: aload 3
// 3a2: aload 0
// 3a3: getfield su/catlean/xj.V Lsu/catlean/wl;
// 3a6: invokeinterface su/catlean/wl.W ()Ljava/lang/String; 1
// 3ab: fload 4
// 3ad: ldc 6.0
// 3af: fadd
// 3b0: lload 17
// 3b2: dup2_x1
// 3b3: pop2
// 3b4: fload 5
// 3b6: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 3b9: dup
// 3ba: sipush 27296
// 3bd: ldc2_w 8155545145675603755
// 3c0: lload 1
// 3c1: lxor
// 3c2: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3ca: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 3cd: aload 0
// 3ce: getfield su/catlean/xj.V Lsu/catlean/wl;
// 3d1: astore 33
// 3d3: aload 33
// 3d5: instanceof su/catlean/bp
// 3d8: lload 1
// 3d9: lconst_0
// 3da: lcmp
// 3db: ifle 412
// 3de: iload 28
// 3e0: ifne 412
// 3e3: ifeq 40d
// 3e6: goto 3f3
// 3e9: ldc2_w 9041252007319452164
// 3ec: lload 1
// 3ed: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f2: athrow
// 3f3: sipush 22983
// 3f6: ldc2_w 3586952602162195527
// 3f9: lload 1
// 3fa: lxor
// 3fb: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 400: goto 442
// 403: ldc2_w 9041252007319452164
// 406: lload 1
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: aload 33
// 40f: instanceof su/catlean/ft
// 412: lload 1
// 413: lconst_0
// 414: lcmp
// 415: iflt 438
// 418: ifeq 435
// 41b: sipush 24787
// 41e: ldc2_w 6508762567190828370
// 421: lload 1
// 422: lxor
// 423: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 428: goto 442
// 42b: ldc2_w 9041252007319452164
// 42e: lload 1
// 42f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 434: athrow
// 435: sipush 18579
// 438: ldc2_w 8333626930463898905
// 43b: lload 1
// 43c: lxor
// 43d: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 442: astore 32
// 444: lload 19
// 446: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 449: aload 3
// 44a: aload 32
// 44c: fload 4
// 44e: ldc 6.0
// 450: fadd
// 451: lload 17
// 453: dup2_x1
// 454: pop2
// 455: fload 5
// 457: ldc 11.0
// 459: fadd
// 45a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 45d: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 460: dup
// 461: sipush 3135
// 464: ldc2_w 1232582536015264187
// 467: lload 1
// 468: lxor
// 469: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 471: iload 25
// 473: i2c
// 474: iload 26
// 476: ldc 0.7
// 478: iload 27
// 47a: i2s
// 47b: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 47e: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 481: aload 3
// 482: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 485: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
// 488: pop
// 489: getstatic su/catlean/rj.B Lsu/catlean/rj;
// 48c: aload 0
// 48d: getfield su/catlean/xj.V Lsu/catlean/wl;
// 490: invokeinterface su/catlean/wl.X ()Lsu/catlean/lj; 1
// 495: invokevirtual su/catlean/lj.X ()I
// 498: lload 13
// 49a: invokevirtual su/catlean/rj.o (IJ)Ljava/lang/String;
// 49d: astore 33
// 49f: aload 33
// 4a1: astore 34
// 4a3: aload 33
// 4a5: invokevirtual java/lang/String.length ()I
// 4a8: bipush 1
// 4a9: lload 1
// 4aa: lconst_0
// 4ab: lcmp
// 4ac: ifle 527
// 4af: iload 28
// 4b1: ifne 527
// 4b4: if_icmple 551
// 4b7: goto 4c4
// 4ba: ldc2_w 9041252007319452164
// 4bd: lload 1
// 4be: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c3: athrow
// 4c4: aload 3
// 4c5: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4c8: fload 4
// 4ca: ldc 54.0
// 4cc: fadd
// 4cd: ldc 7.5
// 4cf: fadd
// 4d0: fload 5
// 4d2: ldc 5.0
// 4d4: fadd
// 4d5: ldc 7.5
// 4d7: fadd
// 4d8: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 4db: pop
// 4dc: aload 3
// 4dd: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4e0: ldc 0.5
// 4e2: ldc 0.5
// 4e4: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
// 4e7: pop
// 4e8: aload 3
// 4e9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 4ec: fload 4
// 4ee: ldc 54.0
// 4f0: fadd
// 4f1: ldc 7.5
// 4f3: fadd
// 4f4: fneg
// 4f5: fload 5
// 4f7: ldc 5.0
// 4f9: fadd
// 4fa: ldc 7.5
// 4fc: fadd
// 4fd: fneg
// 4fe: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
// 501: pop
// 502: aload 33
// 504: iload 28
// 506: ifne 54f
// 509: goto 516
// 50c: ldc2_w 9041252007319452164
// 50f: lload 1
// 510: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 515: athrow
// 516: invokevirtual java/lang/String.length ()I
// 519: bipush 5
// 51a: goto 527
// 51d: ldc2_w 9041252007319452164
// 520: lload 1
// 521: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 526: athrow
// 527: if_icmple 551
// 52a: aload 33
// 52c: bipush 0
// 52d: bipush 4
// 52e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
// 531: dup
// 532: sipush 24409
// 535: ldc2_w 6045827457024355035
// 538: lload 1
// 539: lxor
// 53a: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 53f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 542: goto 54f
// 545: ldc2_w 9041252007319452164
// 548: lload 1
// 549: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54e: athrow
// 54f: astore 34
// 551: lload 21
// 553: invokestatic su/catlean/b8.p (J)Lsu/catlean/c6;
// 556: aload 3
// 557: getstatic su/catlean/ih.v Lsu/catlean/ih;
// 55a: invokevirtual su/catlean/ih.O ()Lsu/catlean/xj;
// 55d: aload 0
// 55e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 561: lload 1
// 562: lconst_0
// 563: lcmp
// 564: ifle 56d
// 567: ifeq 5a4
// 56a: sipush 30878
// 56d: ldc2_w 5321230198390508827
// 570: lload 1
// 571: lxor
// 572: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 577: bipush 3
// 578: bipush 4
// 579: i2d
// 57a: invokestatic java/lang/System.currentTimeMillis ()J
// 57d: sipush 26618
// 580: ldc2_w 7079849952909717420
// 583: lload 1
// 584: lxor
// 585: invokedynamic y (IJ)I bsm=su/catlean/xj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 58a: i2l
// 58b: lrem
// 58c: l2d
// 58d: ldc2_w 700.0
// 590: ddiv
// 591: dmul
// 592: d2i
// 593: isub
// 594: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// 597: goto 5a6
// 59a: ldc2_w 9041252007319452164
// 59d: lload 1
// 59e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a3: athrow
// 5a4: aload 34
// 5a6: fload 4
// 5a8: ldc 61.5
// 5aa: fadd
// 5ab: fload 5
// 5ad: ldc 11.0
// 5af: fadd
// 5b0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 5b3: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 5b6: dup
// 5b7: sipush 3135
// 5ba: ldc2_w 1232582536015264187
// 5bd: lload 1
// 5be: lxor
// 5bf: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/xj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5c7: iload 25
// 5c9: i2c
// 5ca: iload 26
// 5cc: ldc 0.7
// 5ce: iload 27
// 5d0: i2s
// 5d1: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 5d4: lload 23
// 5d6: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 5d9: aload 3
// 5da: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 5dd: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
// 5e0: pop
// 5e1: return
}

@Override
public boolean P(float x, float y, int button, long a) {
return false;
}

public static void U(boolean var0) {
o = var0;
}

public static boolean o() {
return o;
}

public static boolean B() {
boolean var0 = o();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var25 = a ^ 6647273870432L;
vm.a<"Å">(false, -4858566641772810357L, var25);
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[12];
int var21 = 0;
String var20 = "\u0081\u0098Íþ\u0000kR\u0014³¬\u0003\u0080÷''O@\u0087M±[&Ý\u009a m\u0013}÷ø¿\" ^7\u009b05\u008eGÓ\u008d\u0084$BK\u0014ñ\u0089ºNÖ²à\u009c\u0080õ\u0010íWvb\u0081H)ó]\u009c·öáÇ`,\u0010È8Ògú\u0017q/\u0089sØS\u009føé\u0002\u0010N/l¼¼\u0002$ó ðè~\u0000C\u008aã\u0018ØàX%O\u009cM<²¡ÛÑ(BA\u0094c\u0091aK!'ù±\u0010\u0005$°\u0011\u0019õXQ<\b¨\u0096è²Ek\u0010öLòS]\u0080¤\u000eÐ!VSó\u00183ï\u0010¼\u0088`)õ¦³·Ú8\u0087O°k\u0094P\u0010ò\u009dÄô\u0082 V:?\u0012£qðo\u0017b";
int var22 = "\u0081\u0098Íþ\u0000kR\u0014³¬\u0003\u0080÷''O@\u0087M±[&Ý\u009a m\u0013}÷ø¿\" ^7\u009b05\u008eGÓ\u008d\u0084$BK\u0014ñ\u0089ºNÖ²à\u009c\u0080õ\u0010íWvb\u0081H)ó]\u009c·öáÇ`,\u0010È8Ògú\u0017q/\u0089sØS\u009føé\u0002\u0010N/l¼¼\u0002$ó ðè~\u0000C\u008aã\u0018ØàX%O\u009cM<²¡ÛÑ(BA\u0094c\u0091aK!'ù±\u0010\u0005$°\u0011\u0019õXQ<\b¨\u0096è²Ek\u0010öLòS]\u0080¤\u000eÐ!VSó\u00183ï\u0010¼\u0088`)õ¦³·Ú8\u0087O°k\u0094P\u0010ò\u009dÄô\u0082 V:?\u0012£qðo\u0017b"
.length();
char var19 = 24;
int var28 = -1;

label56:
while (true) {
String var29 = var20.substring(++var28, var28 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var29.getBytes("ISO-8859-1"));
String var40 = a(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var40;
if ((var28 += var19) >= var22) {
c = var23;
d = new String[12];
h = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[3];
int var8 = 0;
String var9 = "Ti{\u009få%ÜIÏ[ôS»½ó\u0004\u0097¬Ê\u0018q\u007f¤l";
int var10 = "Ti{\u009få%ÜIÏ[ôS»½ó\u0004\u0097¬Ê\u0018q\u007f¤l".length();
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
byte var47 = -1;
var11[var10001] = var10004;
} while (var7 < var10);

f = var11;
g = new Integer[3];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 2580411438336608074L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var45 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var38 = -1;
i = var45;
return;
}

var19 = var20.charAt(var28);
break;
default:
var23[var21++] = var40;
if ((var28 += var19) < var22) {
var19 = var20.charAt(var28);
continue label56;
}

var20 = "[!ûkã\u0086c\u001b\u0000\u0019\u0092ÿ«êg}\u0010\r\u009d\u0082\u0006f¢\u001aÿÚ/öI±D³¹";
var22 = "[!ûkã\u0086c\u001b\u0000\u0019\u0092ÿ«êg}\u0010\r\u009d\u0082\u0006f¢\u001aÿÚ/öI±D³¹".length();
var19 = 16;
var28 = -1;
}

var29 = var20.substring(++var28, var28 + var19);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18789;
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
throw new RuntimeException("su/catlean/xj", var10);
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
throw new RuntimeException("su/catlean/xj" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 29872;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/xj", var14);
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
throw new RuntimeException("su/catlean/xj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
