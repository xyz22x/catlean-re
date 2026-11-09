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

public final class ri extends ru {
@NotNull
private final a1 f;
@NotNull
private final fd U;
@NotNull
private final fd F;
private static final long b = yz.a(2113773637716041632L, 3094436497289953954L, MethodHandles.lookup().lookupClass()).a(243023801692939L);
private static final String[] d;
private static final String[] e;
private static final Map g = new HashMap(13);
private static final long[] h;
private static final Integer[] k;
private static final Map l;
private static final long[] m;
private static final Long[] n;
private static final Map o;

public ri(long a, @NotNull a1 setting) {
a = b ^ a;
long var4 = a ^ 88539691688895L;
long var6 = a ^ 41605557623251L;
Intrinsics.checkNotNullParameter(setting, a<"o">(25451, 4907606078418931011L ^ a));
super(var6, setting);
this.f = setting;
this.U = new fd(_s.OUT_QUINT, c<"z">(7586, 7774928846104120414L ^ a), var4);
this.F = new fd(_s.OUT_QUINT, c<"z">(2776, 6713052758451313445L ^ a), var4);
}

@NotNull
@Override
public a1 A() {
return this.f;
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
// 039: ldc2_w 120682356120742
// 03c: lxor
// 03d: lstore 16
// 03f: dup2
// 040: ldc2_w 57758330175306
// 043: lxor
// 044: dup2
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 18
// 04b: dup2
// 04c: bipush 16
// 04e: lshl
// 04f: bipush 32
// 051: lushr
// 052: l2i
// 053: istore 19
// 055: dup2
// 056: bipush 48
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 20
// 05f: pop2
// 060: pop2
// 061: ldc2_w 6640577628623117237
// 064: lload 4
// 066: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06b: aload 1
// 06c: sipush 23428
// 06f: ldc2_w 3518720458144524518
// 072: lload 4
// 074: lxor
// 075: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/ri.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07d: aload 0
// 07e: ldc 14.0
// 080: invokevirtual su/catlean/ri.m (F)V
// 083: astore 21
// 085: aload 0
// 086: getfield su/catlean/ri.U Lsu/catlean/fd;
// 089: aload 0
// 08a: invokevirtual su/catlean/ri.x ()F
// 08d: fstore 22
// 08f: aload 0
// 090: invokevirtual su/catlean/ri.x ()F
// 093: aload 0
// 094: invokevirtual su/catlean/ri.F ()F
// 097: fadd
// 098: ldc 7.0
// 09a: fsub
// 09b: fstore 23
// 09d: iload 2
// 09e: i2f
// 09f: fstore 24
// 0a1: fload 22
// 0a3: fload 24
// 0a5: fcmpg
// 0a6: aload 21
// 0a8: ifnull 0cf
// 0ab: ifgt 0f8
// 0ae: goto 0bc
// 0b1: ldc2_w 6674027637477912716
// 0b4: lload 4
// 0b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: athrow
// 0bc: fload 24
// 0be: fload 23
// 0c0: fcmpg
// 0c1: goto 0cf
// 0c4: ldc2_w 6674027637477912716
// 0c7: lload 4
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: aload 21
// 0d1: ifnull 0f5
// 0d4: ifgt 0f4
// 0d7: goto 0e5
// 0da: ldc2_w 6674027637477912716
// 0dd: lload 4
// 0df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e4: athrow
// 0e5: bipush 1
// 0e6: goto 0f9
// 0e9: ldc2_w 6674027637477912716
// 0ec: lload 4
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: bipush 0
// 0f5: goto 0f9
// 0f8: bipush 0
// 0f9: ifeq 18d
// 0fc: aload 0
// 0fd: invokevirtual su/catlean/ri.R ()F
// 100: fstore 22
// 102: aload 0
// 103: invokevirtual su/catlean/ri.R ()F
// 106: sipush 4015
// 109: ldc2_w 7411708090629062706
// 10c: lload 4
// 10e: lxor
// 10f: invokedynamic d (IJ)I bsm=su/catlean/ri.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: i2f
// 115: fadd
// 116: fstore 23
// 118: iload 3
// 119: i2f
// 11a: fstore 24
// 11c: fload 22
// 11e: fload 24
// 120: fcmpg
// 121: aload 21
// 123: lload 4
// 125: lconst_0
// 126: lcmp
// 127: ifle 153
// 12a: ifnull 151
// 12d: ifgt 17a
// 130: goto 13e
// 133: ldc2_w 6674027637477912716
// 136: lload 4
// 138: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: athrow
// 13e: fload 24
// 140: fload 23
// 142: fcmpg
// 143: goto 151
// 146: ldc2_w 6674027637477912716
// 149: lload 4
// 14b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 150: athrow
// 151: aload 21
// 153: ifnull 177
// 156: ifgt 176
// 159: goto 167
// 15c: ldc2_w 6674027637477912716
// 15f: lload 4
// 161: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 166: athrow
// 167: bipush 1
// 168: goto 17b
// 16b: ldc2_w 6674027637477912716
// 16e: lload 4
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: bipush 0
// 177: goto 17b
// 17a: bipush 0
// 17b: ifeq 18d
// 17e: fconst_1
// 17f: goto 18e
// 182: ldc2_w 6674027637477912716
// 185: lload 4
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: fconst_0
// 18e: lload 12
// 190: dup2_x1
// 191: pop2
// 192: invokevirtual su/catlean/fd.B (JF)V
// 195: aload 0
// 196: invokevirtual su/catlean/ri.x ()F
// 199: fstore 22
// 19b: aload 0
// 19c: invokevirtual su/catlean/ri.x ()F
// 19f: aload 0
// 1a0: invokevirtual su/catlean/ri.F ()F
// 1a3: fadd
// 1a4: ldc 7.0
// 1a6: fsub
// 1a7: fstore 23
// 1a9: iload 2
// 1aa: i2f
// 1ab: fstore 24
// 1ad: fload 22
// 1af: fload 24
// 1b1: fcmpg
// 1b2: aload 21
// 1b4: lload 4
// 1b6: lconst_0
// 1b7: lcmp
// 1b8: iflt 1e4
// 1bb: ifnull 1e2
// 1be: ifgt 20b
// 1c1: goto 1cf
// 1c4: ldc2_w 6674027637477912716
// 1c7: lload 4
// 1c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ce: athrow
// 1cf: fload 24
// 1d1: fload 23
// 1d3: fcmpg
// 1d4: goto 1e2
// 1d7: ldc2_w 6674027637477912716
// 1da: lload 4
// 1dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: athrow
// 1e2: aload 21
// 1e4: ifnull 208
// 1e7: ifgt 207
// 1ea: goto 1f8
// 1ed: ldc2_w 6674027637477912716
// 1f0: lload 4
// 1f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f7: athrow
// 1f8: bipush 1
// 1f9: goto 20c
// 1fc: ldc2_w 6674027637477912716
// 1ff: lload 4
// 201: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 206: athrow
// 207: bipush 0
// 208: goto 20c
// 20b: bipush 0
// 20c: ifeq 2ee
// 20f: aload 0
// 210: invokevirtual su/catlean/ri.R ()F
// 213: fstore 22
// 215: aload 0
// 216: invokevirtual su/catlean/ri.R ()F
// 219: sipush 15977
// 21c: ldc2_w 1302427807454081523
// 21f: lload 4
// 221: lxor
// 222: invokedynamic d (IJ)I bsm=su/catlean/ri.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 227: i2f
// 228: fadd
// 229: fstore 23
// 22b: iload 3
// 22c: i2f
// 22d: fstore 24
// 22f: fload 22
// 231: fload 24
// 233: fcmpg
// 234: aload 21
// 236: lload 4
// 238: lconst_0
// 239: lcmp
// 23a: iflt 266
// 23d: ifnull 264
// 240: ifgt 28d
// 243: goto 251
// 246: ldc2_w 6674027637477912716
// 249: lload 4
// 24b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 250: athrow
// 251: fload 24
// 253: fload 23
// 255: fcmpg
// 256: goto 264
// 259: ldc2_w 6674027637477912716
// 25c: lload 4
// 25e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 263: athrow
// 264: aload 21
// 266: ifnull 28a
// 269: ifgt 289
// 26c: goto 27a
// 26f: ldc2_w 6674027637477912716
// 272: lload 4
// 274: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 279: athrow
// 27a: bipush 1
// 27b: goto 28e
// 27e: ldc2_w 6674027637477912716
// 281: lload 4
// 283: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 288: athrow
// 289: bipush 0
// 28a: goto 28e
// 28d: bipush 0
// 28e: lload 4
// 290: lconst_0
// 291: lcmp
// 292: ifle 29b
// 295: ifeq 2ee
// 298: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 29b: sipush 28843
// 29e: ldc2_w 5832325199898869556
// 2a1: lload 4
// 2a3: lxor
// 2a4: invokedynamic d (IJ)I bsm=su/catlean/ri.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a9: if_icmpeq 2ee
// 2ac: goto 2ba
// 2af: ldc2_w 6674027637477912716
// 2b2: lload 4
// 2b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b9: athrow
// 2ba: lload 7
// 2bc: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 2bf: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 2c2: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 2c5: sipush 31378
// 2c8: ldc2_w 4891355196657661198
// 2cb: lload 4
// 2cd: lxor
// 2ce: invokedynamic d (IJ)I bsm=su/catlean/ri.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d3: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 2d6: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 2d9: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 2dc: bipush 0
// 2dd: invokevirtual su/catlean/fi.A (Z)V
// 2e0: goto 2ee
// 2e3: ldc2_w 6674027637477912716
// 2e6: lload 4
// 2e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ed: athrow
// 2ee: aload 0
// 2ef: getfield su/catlean/ri.F Lsu/catlean/fd;
// 2f2: lload 12
// 2f4: fconst_0
// 2f5: invokevirtual su/catlean/fd.B (JF)V
// 2f8: aload 1
// 2f9: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2fc: dup
// 2fd: sipush 20170
// 300: ldc2_w 8481439223921655210
// 303: lload 4
// 305: lxor
// 306: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/ri.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 30e: aload 0
// 30f: invokevirtual su/catlean/ri.x ()F
// 312: iload 9
// 314: i2c
// 315: swap
// 316: aload 0
// 317: invokevirtual su/catlean/ri.R ()F
// 31a: fconst_1
// 31b: fsub
// 31c: aload 0
// 31d: invokevirtual su/catlean/ri.F ()F
// 320: ldc 7.0
// 322: fsub
// 323: ldc 13.0
// 325: ldc 3.0
// 327: ldc 2.5
// 329: aload 0
// 32a: getfield su/catlean/ri.U Lsu/catlean/fd;
// 32d: invokevirtual su/catlean/fd.a ()F
// 330: fconst_2
// 331: fdiv
// 332: aload 0
// 333: getfield su/catlean/ri.F Lsu/catlean/fd;
// 336: invokevirtual su/catlean/fd.a ()F
// 339: fconst_2
// 33a: fdiv
// 33b: fadd
// 33c: fconst_1
// 33d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 340: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 343: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 346: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 349: fconst_0
// 34a: iload 10
// 34c: i2s
// 34d: fconst_0
// 34e: iload 11
// 350: fconst_0
// 351: sipush 31852
// 354: ldc2_w 1482541801760519154
// 357: lload 4
// 359: lxor
// 35a: invokedynamic d (IJ)I bsm=su/catlean/ri.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35f: aconst_null
// 360: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 363: lload 14
// 365: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 368: aload 1
// 369: aload 0
// 36a: invokevirtual su/catlean/ri.A ()Lsu/catlean/a1;
// 36d: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 370: aload 0
// 371: invokevirtual su/catlean/ri.x ()F
// 374: aload 0
// 375: invokevirtual su/catlean/ri.F ()F
// 378: ldc 7.0
// 37a: fsub
// 37b: fconst_2
// 37c: fdiv
// 37d: fadd
// 37e: aload 0
// 37f: invokevirtual su/catlean/ri.R ()F
// 382: fconst_2
// 383: fsub
// 384: aload 0
// 385: invokevirtual su/catlean/ri.d ()F
// 388: fconst_2
// 389: fdiv
// 38a: fadd
// 38b: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 38e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 391: invokevirtual su/catlean/jh.t ()Ljava/awt/Color;
// 394: iload 18
// 396: i2c
// 397: iload 19
// 399: fconst_1
// 39a: iload 20
// 39c: i2s
// 39d: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 3a0: lload 16
// 3a2: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 3a5: return
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
// 00a: invokevirtual su/catlean/ri.x ()F
// 00d: fstore 9
// 00f: astore 8
// 011: dload 3
// 012: aload 0
// 013: invokevirtual su/catlean/ri.x ()F
// 016: aload 0
// 017: invokevirtual su/catlean/ri.F ()F
// 01a: fadd
// 01b: ldc 7.0
// 01d: fsub
// 01e: f2d
// 01f: dcmpg
// 020: aload 8
// 022: lload 1
// 023: lconst_0
// 024: lcmp
// 025: ifle 04f
// 028: ifnull 04d
// 02b: ifgt 074
// 02e: goto 03b
// 031: ldc2_w 8614797955846282143
// 034: lload 1
// 035: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03a: athrow
// 03b: fload 9
// 03d: f2d
// 03e: dload 3
// 03f: dcmpg
// 040: goto 04d
// 043: ldc2_w 8614797955846282143
// 046: lload 1
// 047: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04c: athrow
// 04d: aload 8
// 04f: ifnull 071
// 052: ifgt 070
// 055: goto 062
// 058: ldc2_w 8614797955846282143
// 05b: lload 1
// 05c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: athrow
// 062: bipush 1
// 063: goto 075
// 066: ldc2_w 8614797955846282143
// 069: lload 1
// 06a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: athrow
// 070: bipush 0
// 071: goto 075
// 074: bipush 0
// 075: ifeq 116
// 078: aload 0
// 079: invokevirtual su/catlean/ri.R ()F
// 07c: fstore 9
// 07e: dload 5
// 080: aload 0
// 081: invokevirtual su/catlean/ri.R ()F
// 084: sipush 15977
// 087: ldc2_w 1302427525717957344
// 08a: lload 1
// 08b: lxor
// 08c: invokedynamic d (IJ)I bsm=su/catlean/ri.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: i2f
// 092: fadd
// 093: f2d
// 094: dcmpg
// 095: aload 8
// 097: lload 1
// 098: lconst_0
// 099: lcmp
// 09a: ifle 0c5
// 09d: ifnull 0c3
// 0a0: ifgt 0ea
// 0a3: goto 0b0
// 0a6: ldc2_w 8614797955846282143
// 0a9: lload 1
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: fload 9
// 0b2: f2d
// 0b3: dload 5
// 0b5: dcmpg
// 0b6: goto 0c3
// 0b9: ldc2_w 8614797955846282143
// 0bc: lload 1
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: aload 8
// 0c5: ifnull 0e7
// 0c8: ifgt 0e6
// 0cb: goto 0d8
// 0ce: ldc2_w 8614797955846282143
// 0d1: lload 1
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: bipush 1
// 0d9: goto 0eb
// 0dc: ldc2_w 8614797955846282143
// 0df: lload 1
// 0e0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e5: athrow
// 0e6: bipush 0
// 0e7: goto 0eb
// 0ea: bipush 0
// 0eb: ifeq 116
// 0ee: aload 0
// 0ef: invokevirtual su/catlean/ri.A ()Lsu/catlean/a1;
// 0f2: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0f5: checkcast su/catlean/id
// 0f8: invokevirtual su/catlean/id.s ()Lkotlin/jvm/functions/Function0;
// 0fb: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 100: pop
// 101: aload 0
// 102: getfield su/catlean/ri.F Lsu/catlean/fd;
// 105: fconst_1
// 106: invokevirtual su/catlean/fd.P (F)V
// 109: goto 116
// 10c: ldc2_w 8614797955846282143
// 10f: lload 1
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: return
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
long var22 = b ^ 31587632277356L;
Cipher var24;
Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var25 = 1; var25 < 8; var25++) {
var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var31 = new String[3];
int var29 = 0;
String var28 = "\u009f^ÉØ½\u0012\u0085\u001a÷ì\u0095 Ü)K\t\u0010LäûO|ûu´xFU\u001aõ4¹; \u0001tè!\u001c$¡\u000f\u007fËW\u0087\"\u008e\u0094e\u0080ù:ÐA\bãñÖo÷\u009f\u0014;Çb";
int var30 = "\u009f^ÉØ½\u0012\u0085\u001a÷ì\u0095 Ü)K\t\u0010LäûO|ûu´xFU\u001aõ4¹; \u0001tè!\u001c$¡\u000f\u007fËW\u0087\"\u008e\u0094e\u0080ù:ÐA\bãñÖo÷\u009f\u0014;Çb"
.length();
char var27 = 16;
int var26 = -1;

while (true) {
byte[] var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
String var44 = b(var32).intern();
int var10001 = -1;
var31[var29++] = var44;
if ((var26 += var27) >= var30) {
d = var31;
e = new String[3];
l = new HashMap(13);
Cipher var11;
var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var17 = new long[5];
int var14 = 0;
String var15 = "+TÁÙ\u009dßûùì\u001c\u0087\u0011üô§ìh\u0083ªù\u0004\u001bHö";
int var16 = "+TÁÙ\u009dßûùì\u001c\u0087\u0011üô§ìh\u0083ªù\u0004\u001bHö".length();
byte var13 = 0;

label50:
while (true) {
var10001 = var13;
var13 += 8;
byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
long[] var36 = var17;
var10001 = var14++;
long var47 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
byte var51 = -1;

while (true) {
long var19 = var47;
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
long var55 = (var21[0] & 255L) << 56
| (var21[1] & 255L) << 48
| (var21[2] & 255L) << 40
| (var21[3] & 255L) << 32
| (var21[4] & 255L) << 24
| (var21[5] & 255L) << 16
| (var21[6] & 255L) << 8
| var21[7] & 255L;
switch (var51) {
case 0:
var36[var10001] = var55;
if (var13 >= var16) {
h = var17;
k = new Integer[5];
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
String var4 = "ÒbÇ\u0083L\u00813Í¶8(áB^\u0006&";
int var5 = "ÒbÇ\u0083L\u00813Í¶8(áB^\u0006&".length();
byte var2 = 0;

do {
int var42 = var2;
var2 += 8;
byte[] var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
var42 = var3++;
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
var55 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var54 = -1;
var6[var42] = var55;
} while (var2 < var5);

m = var6;
n = new Long[2];
return;
}
break;
default:
var36[var10001] = var55;
if (var13 < var16) {
continue label50;
}

var15 = "<\u001f\u009aÐ«©ú\u0000\u0086Í\u0089Õ,^\"D";
var16 = "<\u001f\u009aÐ«©ú\u0000\u0086Í\u0089Õ,^\"D".length();
var13 = 0;
}

byte var41 = var13;
var13 += 8;
var18 = var15.substring(var41, var13).getBytes("ISO-8859-1");
var36 = var17;
var10001 = var14++;
var47 = (var18[0] & 255L) << 56
| (var18[1] & 255L) << 48
| (var18[2] & 255L) << 40
| (var18[3] & 255L) << 32
| (var18[4] & 255L) << 24
| (var18[5] & 255L) << 16
| (var18[6] & 255L) << 8
| var18[7] & 255L;
var51 = 0;
}
}
}

var27 = var28.charAt(var26);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 11858;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])g.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
g.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ri", var10);
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
throw new RuntimeException("su/catlean/ri" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21166;
if (k[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = h[var3];
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
throw new RuntimeException("su/catlean/ri", var14);
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
throw new RuntimeException("su/catlean/ri" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static long c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 20870;
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
throw new RuntimeException("su/catlean/ri", var14);
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
throw new RuntimeException("su/catlean/ri" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
