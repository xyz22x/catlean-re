package su.catlean;

import java.awt.Color;
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
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

public abstract class r2 extends ru {
@NotNull
private final a1 r;
@NotNull
private final fd y;
private boolean W;
private float t;
private boolean z;
@NotNull
private String g;
private static _g[] Y;
private static final long d = yz.a(-6044693024914837947L, 4109558334446878684L, MethodHandles.lookup().lookupClass()).a(164732883170410L);
private static final String[] e;
private static final String[] f;
private static final Map h = new HashMap(13);
private static final long[] n;
private static final Integer[] o;
private static final Map p;
private static final long q;

public r2(long a, @NotNull a1 setting) {
a = d ^ a;
long var4 = a ^ 66323698953646L;
long var6 = a ^ 80281463723970L;
Intrinsics.checkNotNullParameter(setting, a<"m">(10291, 1013481558798858786L ^ a));
super(var6, setting);
this.r = setting;
this.m(24.0F);
this.y = new fd(_s.OUT_QUINT, q, var4);
this.g = "-";
}

@NotNull
@Override
public a1 A() {
return this.r;
}

public final boolean k() {
return this.W;
}

public final void k(boolean <set-?>) {
this.W = <set-?>;
}

public final float X() {
return this.t;
}

public final void H(float <set-?>) {
this.t = <set-?>;
}

@Override
public void r(@NotNull class_332 context, int mouseX, int mouseY, long a, float factor) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: lload 4
// 002: dup2
// 003: ldc2_w 49494862758009
// 006: lxor
// 007: lstore 7
// 009: dup2
// 00a: ldc2_w 94342518848505
// 00d: lxor
// 00e: lstore 9
// 010: dup2
// 011: ldc2_w 39844814704388
// 014: lxor
// 015: lstore 11
// 017: dup2
// 018: ldc2_w 123542913096216
// 01b: lxor
// 01c: lstore 13
// 01e: dup2
// 01f: ldc2_w 53557726993676
// 022: lxor
// 023: dup2
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 15
// 02a: dup2
// 02b: bipush 16
// 02d: lshl
// 02e: bipush 16
// 030: lushr
// 031: lstore 16
// 033: pop2
// 034: dup2
// 035: ldc2_w 7601121533689
// 038: lxor
// 039: lstore 18
// 03b: dup2
// 03c: ldc2_w 30062071045099
// 03f: lxor
// 040: lstore 20
// 042: dup2
// 043: ldc2_w 7423815019863
// 046: lxor
// 047: lstore 22
// 049: dup2
// 04a: ldc2_w 114903264084220
// 04d: lxor
// 04e: lstore 24
// 050: dup2
// 051: ldc2_w 115096991696004
// 054: lxor
// 055: lstore 26
// 057: dup2
// 058: ldc2_w 75045879653201
// 05b: lxor
// 05c: lstore 28
// 05e: pop2
// 05f: ldc2_w 6640577628623117237
// 062: lload 4
// 064: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 069: aload 1
// 06a: sipush 3602
// 06d: ldc2_w 7900520359056379739
// 070: lload 4
// 072: lxor
// 073: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/r2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07b: astore 30
// 07d: lload 24
// 07f: invokestatic su/catlean/b8.n (J)Lsu/catlean/c6;
// 082: aload 1
// 083: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 086: dup
// 087: sipush 11015
// 08a: ldc2_w 2318204476004903503
// 08d: lload 4
// 08f: lxor
// 090: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/r2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 095: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 098: aload 0
// 099: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 09c: invokevirtual su/catlean/a1.Q ()Ljava/lang/String;
// 09f: aload 0
// 0a0: invokevirtual su/catlean/r2.x ()F
// 0a3: aload 0
// 0a4: invokevirtual su/catlean/r2.R ()F
// 0a7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0aa: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 0ad: lload 26
// 0af: dup2_x1
// 0b0: pop2
// 0b1: bipush 0
// 0b2: bipush 0
// 0b3: sipush 27143
// 0b6: ldc2_w 8953833183376084317
// 0b9: lload 4
// 0bb: lxor
// 0bc: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: aconst_null
// 0c2: invokestatic su/catlean/c6.W (Lsu/catlean/c6;Lorg/joml/Matrix3x2fStack;Ljava/lang/String;FFJLjava/awt/Color;ZIILjava/lang/Object;)V
// 0c5: aload 0
// 0c6: getfield su/catlean/r2.y Lsu/catlean/fd;
// 0c9: aload 0
// 0ca: getfield su/catlean/r2.W Z
// 0cd: aload 30
// 0cf: ifnull 0f9
// 0d2: ifne 0fc
// 0d5: goto 0e3
// 0d8: ldc2_w 6643326828298582818
// 0db: lload 4
// 0dd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e2: athrow
// 0e3: aload 0
// 0e4: iload 2
// 0e5: lload 28
// 0e7: iload 3
// 0e8: invokespecial su/catlean/r2.F (IJI)Z
// 0eb: goto 0f9
// 0ee: ldc2_w 6643326828298582818
// 0f1: lload 4
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: ifeq 10b
// 0fc: fconst_1
// 0fd: goto 10c
// 100: ldc2_w 6643326828298582818
// 103: lload 4
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: fconst_0
// 10c: lload 11
// 10e: dup2_x1
// 10f: pop2
// 110: invokevirtual su/catlean/fd.B (JF)V
// 113: aload 0
// 114: aload 0
// 115: aload 0
// 116: getfield su/catlean/r2.t F
// 119: aload 0
// 11a: iload 15
// 11c: i2c
// 11d: lload 16
// 11f: invokevirtual su/catlean/r2.J (CJ)F
// 122: lload 18
// 124: dup2_x1
// 125: pop2
// 126: ldc 15.0
// 128: invokespecial su/catlean/r2.r (FJFF)F
// 12b: putfield su/catlean/r2.t F
// 12e: aload 0
// 12f: iload 2
// 130: lload 28
// 132: iload 3
// 133: invokespecial su/catlean/r2.F (IJI)Z
// 136: aload 30
// 138: ifnull 1de
// 13b: ifeq 1bc
// 13e: goto 14c
// 141: ldc2_w 6643326828298582818
// 144: lload 4
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 14f: lload 4
// 151: lconst_0
// 152: lcmp
// 153: ifle 1de
// 156: aload 30
// 158: ifnull 1de
// 15b: goto 169
// 15e: ldc2_w 6643326828298582818
// 161: lload 4
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: sipush 5612
// 16c: ldc2_w 6732583503080846015
// 16f: lload 4
// 171: lxor
// 172: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 177: if_icmpeq 1bc
// 17a: goto 188
// 17d: ldc2_w 6643326828298582818
// 180: lload 4
// 182: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 187: athrow
// 188: lload 7
// 18a: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 18d: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 190: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 193: sipush 25731
// 196: ldc2_w 3649495959554589658
// 199: lload 4
// 19b: lxor
// 19c: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a1: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 1a4: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 1a7: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 1aa: bipush 0
// 1ab: invokevirtual su/catlean/fi.A (Z)V
// 1ae: goto 1bc
// 1b1: ldc2_w 6643326828298582818
// 1b4: lload 4
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: lload 4
// 1be: lconst_0
// 1bf: lcmp
// 1c0: ifle 255
// 1c3: aload 0
// 1c4: iload 2
// 1c5: aload 30
// 1c7: ifnull 24e
// 1ca: lload 13
// 1cc: iload 3
// 1cd: invokespecial su/catlean/r2.y (IJI)Z
// 1d0: goto 1de
// 1d3: ldc2_w 6643326828298582818
// 1d6: lload 4
// 1d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: athrow
// 1de: lload 4
// 1e0: lconst_0
// 1e1: lcmp
// 1e2: ifle 1eb
// 1e5: ifeq 23e
// 1e8: invokestatic org/lwjgl/glfw/GLFW.glfwGetPlatform ()I
// 1eb: sipush 25751
// 1ee: ldc2_w 3606392934505776073
// 1f1: lload 4
// 1f3: lxor
// 1f4: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f9: if_icmpeq 23e
// 1fc: goto 20a
// 1ff: ldc2_w 6643326828298582818
// 202: lload 4
// 204: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 209: athrow
// 20a: lload 7
// 20c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 20f: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 212: invokevirtual net/minecraft/class_1041.method_4490 ()J
// 215: sipush 31612
// 218: ldc2_w 5576008967215979566
// 21b: lload 4
// 21d: lxor
// 21e: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: invokestatic org/lwjgl/glfw/GLFW.glfwCreateStandardCursor (I)J
// 226: invokestatic org/lwjgl/glfw/GLFW.glfwSetCursor (JJ)V
// 229: getstatic su/catlean/fi.C Lsu/catlean/fi;
// 22c: bipush 0
// 22d: invokevirtual su/catlean/fi.A (Z)V
// 230: goto 23e
// 233: ldc2_w 6643326828298582818
// 236: lload 4
// 238: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23d: athrow
// 23e: aload 0
// 23f: lload 22
// 241: aload 1
// 242: invokespecial su/catlean/r2.T (JLnet/minecraft/class_332;)V
// 245: aload 0
// 246: lload 9
// 248: aload 1
// 249: invokespecial su/catlean/r2.Q (JLnet/minecraft/class_332;)V
// 24c: aload 0
// 24d: iload 2
// 24e: lload 20
// 250: dup2_x1
// 251: pop2
// 252: invokevirtual su/catlean/r2.K (JI)V
// 255: return
}

private final boolean F(int param1, long param2, int param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/r2.d J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: ldc2_w 3005972207909858858
// 009: lload 2
// 00a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: aload 0
// 010: invokevirtual su/catlean/r2.x ()F
// 013: bipush 2
// 014: i2f
// 015: fadd
// 016: fstore 6
// 018: astore 5
// 01a: aload 0
// 01b: invokevirtual su/catlean/r2.x ()F
// 01e: aload 0
// 01f: invokevirtual su/catlean/r2.F ()F
// 022: fadd
// 023: ldc 9.0
// 025: fsub
// 026: fstore 7
// 028: iload 1
// 029: i2f
// 02a: fstore 8
// 02c: fload 6
// 02e: fload 8
// 030: fcmpg
// 031: aload 5
// 033: ifnull 058
// 036: ifgt 07f
// 039: goto 046
// 03c: ldc2_w 3003513292403134141
// 03f: lload 2
// 040: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 045: athrow
// 046: fload 8
// 048: fload 7
// 04a: fcmpg
// 04b: goto 058
// 04e: ldc2_w 3003513292403134141
// 051: lload 2
// 052: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: athrow
// 058: aload 5
// 05a: ifnull 07c
// 05d: ifgt 07b
// 060: goto 06d
// 063: ldc2_w 3003513292403134141
// 066: lload 2
// 067: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06c: athrow
// 06d: bipush 1
// 06e: goto 080
// 071: ldc2_w 3003513292403134141
// 074: lload 2
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: bipush 0
// 07c: goto 080
// 07f: bipush 0
// 080: ifeq 10b
// 083: aload 0
// 084: invokevirtual su/catlean/r2.R ()F
// 087: ldc 9.0
// 089: fadd
// 08a: fstore 6
// 08c: aload 0
// 08d: invokevirtual su/catlean/r2.R ()F
// 090: ldc 21.0
// 092: fadd
// 093: fstore 7
// 095: iload 4
// 097: i2f
// 098: fstore 8
// 09a: fload 6
// 09c: fload 8
// 09e: fcmpg
// 09f: aload 5
// 0a1: lload 2
// 0a2: lconst_0
// 0a3: lcmp
// 0a4: iflt 0ce
// 0a7: ifnull 0cc
// 0aa: ifgt 0f3
// 0ad: goto 0ba
// 0b0: ldc2_w 3003513292403134141
// 0b3: lload 2
// 0b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b9: athrow
// 0ba: fload 8
// 0bc: fload 7
// 0be: fcmpg
// 0bf: goto 0cc
// 0c2: ldc2_w 3003513292403134141
// 0c5: lload 2
// 0c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cb: athrow
// 0cc: aload 5
// 0ce: ifnull 0f0
// 0d1: ifgt 0ef
// 0d4: goto 0e1
// 0d7: ldc2_w 3003513292403134141
// 0da: lload 2
// 0db: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e0: athrow
// 0e1: bipush 1
// 0e2: goto 0f4
// 0e5: ldc2_w 3003513292403134141
// 0e8: lload 2
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: bipush 0
// 0f0: goto 0f4
// 0f3: bipush 0
// 0f4: lload 2
// 0f5: lconst_0
// 0f6: lcmp
// 0f7: ifle 0fe
// 0fa: ifeq 10b
// 0fd: bipush 1
// 0fe: goto 10c
// 101: ldc2_w 3003513292403134141
// 104: lload 2
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: bipush 0
// 10c: ireturn
}

private final boolean y(int param1, long param2, int param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/r2.d J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 1834852650372
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 80352521702613
// 012: lxor
// 013: lstore 7
// 015: pop2
// 016: ldc2_w -7998832916528015517
// 019: lload 2
// 01a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01f: astore 9
// 021: lload 7
// 023: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 026: aload 0
// 027: aload 9
// 029: ifnull 057
// 02c: getfield su/catlean/r2.z Z
// 02f: ifeq 050
// 032: goto 03f
// 035: ldc2_w -8005241308688484364
// 038: lload 2
// 039: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03e: athrow
// 03f: aload 0
// 040: getfield su/catlean/r2.g Ljava/lang/String;
// 043: goto 05a
// 046: ldc2_w -8005241308688484364
// 049: lload 2
// 04a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 04f: athrow
// 050: aload 0
// 051: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 054: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 057: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 05a: lload 5
// 05c: dup2_x1
// 05d: pop2
// 05e: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 061: fstore 10
// 063: aload 0
// 064: invokevirtual su/catlean/r2.x ()F
// 067: aload 0
// 068: invokevirtual su/catlean/r2.F ()F
// 06b: fadd
// 06c: fload 10
// 06e: fsub
// 06f: sipush 20921
// 072: ldc2_w 5811986169270303287
// 075: lload 2
// 076: lxor
// 077: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: i2f
// 07d: fsub
// 07e: fstore 11
// 080: aload 0
// 081: invokevirtual su/catlean/r2.x ()F
// 084: aload 0
// 085: invokevirtual su/catlean/r2.F ()F
// 088: fadd
// 089: fload 10
// 08b: fsub
// 08c: sipush 621
// 08f: ldc2_w 8243937830601009638
// 092: lload 2
// 093: lxor
// 094: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 099: i2f
// 09a: fsub
// 09b: fload 10
// 09d: fadd
// 09e: ldc 6.0
// 0a0: fadd
// 0a1: fstore 12
// 0a3: iload 1
// 0a4: i2f
// 0a5: fstore 13
// 0a7: fload 11
// 0a9: fload 13
// 0ab: fcmpg
// 0ac: aload 9
// 0ae: lload 2
// 0af: lconst_0
// 0b0: lcmp
// 0b1: ifle 0db
// 0b4: ifnull 0d9
// 0b7: ifgt 100
// 0ba: goto 0c7
// 0bd: ldc2_w -8005241308688484364
// 0c0: lload 2
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: fload 13
// 0c9: fload 12
// 0cb: fcmpg
// 0cc: goto 0d9
// 0cf: ldc2_w -8005241308688484364
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 9
// 0db: ifnull 0fd
// 0de: ifgt 0fc
// 0e1: goto 0ee
// 0e4: ldc2_w -8005241308688484364
// 0e7: lload 2
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: bipush 1
// 0ef: goto 101
// 0f2: ldc2_w -8005241308688484364
// 0f5: lload 2
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: bipush 0
// 0fd: goto 101
// 100: bipush 0
// 101: ifeq 18b
// 104: aload 0
// 105: invokevirtual su/catlean/r2.R ()F
// 108: fconst_1
// 109: fadd
// 10a: fstore 11
// 10c: aload 0
// 10d: invokevirtual su/catlean/r2.R ()F
// 110: ldc 11.0
// 112: fadd
// 113: fstore 12
// 115: iload 4
// 117: i2f
// 118: fstore 13
// 11a: fload 11
// 11c: fload 13
// 11e: fcmpg
// 11f: aload 9
// 121: lload 2
// 122: lconst_0
// 123: lcmp
// 124: ifle 14e
// 127: ifnull 14c
// 12a: ifgt 173
// 12d: goto 13a
// 130: ldc2_w -8005241308688484364
// 133: lload 2
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: fload 13
// 13c: fload 12
// 13e: fcmpg
// 13f: goto 14c
// 142: ldc2_w -8005241308688484364
// 145: lload 2
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: aload 9
// 14e: ifnull 170
// 151: ifgt 16f
// 154: goto 161
// 157: ldc2_w -8005241308688484364
// 15a: lload 2
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: bipush 1
// 162: goto 174
// 165: ldc2_w -8005241308688484364
// 168: lload 2
// 169: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16e: athrow
// 16f: bipush 0
// 170: goto 174
// 173: bipush 0
// 174: lload 2
// 175: lconst_0
// 176: lcmp
// 177: iflt 17e
// 17a: ifeq 18b
// 17d: bipush 1
// 17e: goto 18c
// 181: ldc2_w -8005241308688484364
// 184: lload 2
// 185: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: athrow
// 18b: bipush 0
// 18c: ireturn
}

private final void T(long var1, class_332 var3) {
var1 = d ^ var1;
long var4 = var1 ^ 78502702412376L;
long var10001 = var1 ^ 28083908134730L;
int var6 = (int)((var1 ^ 28083908134730L) >>> 48);
int var7 = (int)((var1 ^ 28083908134730L) << 16 >>> 48);
int var8 = (int)(var10001 << 32 >>> 32);
Matrix3x2fStack var10000 = var3.method_51448();
Intrinsics.checkNotNullExpressionValue(var10000, a<"m">(11015, 2318194719828447702L ^ var1));
x1.n(
var10000,
(char)var6,
this.x(),
this.R() + 15.0F,
this.F() - 7.0F,
4.0F,
2.0F,
2.0F,
0.0F,
1.0F,
jh.f.j(),
jh.f.Z(),
0.0F,
(short)var7,
0.0F,
var8,
0.0F,
c<"c">(18532, 3025513151046161570L ^ var1),
null
);
float var10 = this.x();
float var12 = this.R() + 15.0F;
float var10003 = (this.F() - 7.0F) * this.t;
Color var10006 = jh.f.S();
Color var10007 = jh.f.S();
Color var10008 = jh.f.S();
Color var10009 = jh.f.S();
Matrix3x2fStack var10010 = var3.method_51448();
Intrinsics.checkNotNullExpressionValue(var10010, a<"m">(11015, 2318194719828447702L ^ var1));
l7.p(var10, var12, var4, var10003, 4.0F, 2.0F, var10006, var10007, var10008, var10009, var10010, 1.0F, jh.f.Z());
float var11 = this.x() - 2 + (this.F() - 11.0F) * this.t;
float var13 = this.R() + 15.0F - 1.5F;
var10006 = jh.f.S();
var10007 = jh.f.S();
var10008 = jh.f.S();
var10009 = jh.f.S();
var10010 = var3.method_51448();
Intrinsics.checkNotNullExpressionValue(var10010, a<"m">(11015, 2318194719828447702L ^ var1));
l7.p(var11, var13, var4, 7.0F, 7.0F, 2.5F, var10006, var10007, var10008, var10009, var10010, 1.0F + this.y.a(), jh.f.Z());
}

private final void Q(long param1, class_332 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/r2.d J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 81945339335140
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 16
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: dup2
// 01e: bipush 32
// 020: lshl
// 021: bipush 32
// 023: lushr
// 024: l2i
// 025: istore 6
// 027: pop2
// 028: dup2
// 029: ldc2_w 39833449540709
// 02c: lxor
// 02d: lstore 7
// 02f: dup2
// 030: ldc2_w 47325417585963
// 033: lxor
// 034: lstore 9
// 036: dup2
// 037: ldc2_w 119321718353204
// 03a: lxor
// 03b: lstore 11
// 03d: dup2
// 03e: ldc2_w 122404856930200
// 041: lxor
// 042: dup2
// 043: bipush 32
// 045: lushr
// 046: l2i
// 047: istore 13
// 049: dup2
// 04a: bipush 32
// 04c: lshl
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 14
// 053: dup2
// 054: bipush 48
// 056: lshl
// 057: bipush 48
// 059: lushr
// 05a: l2i
// 05b: istore 15
// 05d: pop2
// 05e: dup2
// 05f: ldc2_w 119755469542013
// 062: lxor
// 063: dup2
// 064: bipush 48
// 066: lushr
// 067: l2i
// 068: istore 16
// 06a: dup2
// 06b: bipush 16
// 06d: lshl
// 06e: bipush 32
// 070: lushr
// 071: l2i
// 072: istore 17
// 074: dup2
// 075: bipush 48
// 077: lshl
// 078: bipush 48
// 07a: lushr
// 07b: l2i
// 07c: istore 18
// 07e: pop2
// 07f: pop2
// 080: ldc2_w 3539629500260480642
// 083: lload 1
// 084: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 089: astore 22
// 08b: getstatic su/catlean/oo.k Lsu/catlean/oo;
// 08e: aload 0
// 08f: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 092: invokevirtual su/catlean/a1.e ()Ljava/lang/String;
// 095: aload 0
// 096: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 099: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 09c: checkcast java/lang/Number
// 09f: aload 0
// 0a0: aload 22
// 0a2: ifnull 0d0
// 0a5: getfield su/catlean/r2.z Z
// 0a8: ifeq 0c9
// 0ab: goto 0b8
// 0ae: ldc2_w 3532668051406673429
// 0b1: lload 1
// 0b2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b7: athrow
// 0b8: aload 0
// 0b9: getfield su/catlean/r2.g Ljava/lang/String;
// 0bc: goto 0d3
// 0bf: ldc2_w 3532668051406673429
// 0c2: lload 1
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: aload 0
// 0ca: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 0cd: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 0d0: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 0d3: astore 19
// 0d5: astore 20
// 0d7: astore 21
// 0d9: iload 13
// 0db: aload 21
// 0dd: aload 20
// 0df: aload 19
// 0e1: iload 14
// 0e3: i2c
// 0e4: iload 15
// 0e6: i2s
// 0e7: invokevirtual su/catlean/oo.w (ILjava/lang/String;Ljava/lang/Number;Ljava/lang/String;CS)Ljava/lang/String;
// 0ea: astore 23
// 0ec: lload 11
// 0ee: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 0f1: lload 7
// 0f3: aload 23
// 0f5: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 0f8: fstore 24
// 0fa: aload 3
// 0fb: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0fe: dup
// 0ff: sipush 11335
// 102: ldc2_w 2391017417966796861
// 105: lload 1
// 106: lxor
// 107: invokedynamic m (IJ)Ljava/lang/String; bsm=su/catlean/r2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 10f: aload 0
// 110: invokevirtual su/catlean/r2.x ()F
// 113: aload 0
// 114: invokevirtual su/catlean/r2.F ()F
// 117: fadd
// 118: fload 24
// 11a: fsub
// 11b: sipush 621
// 11e: ldc2_w 8243975826983421959
// 121: lload 1
// 122: lxor
// 123: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: i2f
// 129: fsub
// 12a: iload 4
// 12c: i2c
// 12d: swap
// 12e: aload 0
// 12f: invokevirtual su/catlean/r2.R ()F
// 132: fconst_1
// 133: fadd
// 134: fload 24
// 136: ldc 6.0
// 138: fadd
// 139: ldc 10.0
// 13b: ldc 3.0
// 13d: fconst_2
// 13e: fconst_0
// 13f: fconst_1
// 140: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 143: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 146: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 149: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 14c: fconst_0
// 14d: iload 5
// 14f: i2s
// 150: fconst_0
// 151: iload 6
// 153: fconst_0
// 154: sipush 18473
// 157: ldc2_w 3815929993281749573
// 15a: lload 1
// 15b: lxor
// 15c: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 161: aconst_null
// 162: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 165: lload 11
// 167: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 16a: aload 3
// 16b: aload 23
// 16d: aload 0
// 16e: invokevirtual su/catlean/r2.x ()F
// 171: aload 0
// 172: invokevirtual su/catlean/r2.F ()F
// 175: fadd
// 176: sipush 14233
// 179: ldc2_w 1675824216296799730
// 17c: lload 1
// 17d: lxor
// 17e: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 183: i2f
// 184: fsub
// 185: fload 24
// 187: fsub
// 188: aload 0
// 189: invokevirtual su/catlean/r2.R ()F
// 18c: ldc 0.5
// 18e: fadd
// 18f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 192: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 195: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 198: aload 0
// 199: getfield su/catlean/r2.z Z
// 19c: ifeq 1bb
// 19f: invokestatic java/lang/System.currentTimeMillis ()J
// 1a2: l2d
// 1a3: ldc2_w 50.0
// 1a6: ddiv
// 1a7: invokestatic java/lang/Math.sin (D)D
// 1aa: d2f
// 1ab: ldc 0.5
// 1ad: fadd
// 1ae: goto 1bc
// 1b1: ldc2_w 3532668051406673429
// 1b4: lload 1
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: fconst_1
// 1bc: fstore 19
// 1be: iload 16
// 1c0: i2c
// 1c1: iload 17
// 1c3: fload 19
// 1c5: iload 18
// 1c7: i2s
// 1c8: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1cb: astore 19
// 1cd: fstore 20
// 1cf: fstore 21
// 1d1: lload 9
// 1d3: fload 21
// 1d5: fload 20
// 1d7: aload 19
// 1d9: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 1dc: return
}

public abstract void K(long var1, int var3);

public abstract float J(char var1, long var2);

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
// 002: ldc2_w 138026233391681
// 005: lxor
// 006: lstore 8
// 008: dup2
// 009: ldc2_w 58510585015056
// 00c: lxor
// 00d: lstore 10
// 00f: dup2
// 010: ldc2_w 76550846777410
// 013: lxor
// 014: lstore 12
// 016: pop2
// 017: ldc2_w 8591482653260427430
// 01a: lload 1
// 01b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 020: lload 10
// 022: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 025: aload 0
// 026: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 029: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 02c: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 02f: lload 8
// 031: dup2_x1
// 032: pop2
// 033: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 036: fstore 15
// 038: astore 14
// 03a: iload 7
// 03c: aload 14
// 03e: ifnull 094
// 041: ifne 092
// 044: goto 051
// 047: ldc2_w 8584660591060652081
// 04a: lload 1
// 04b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 050: athrow
// 051: aload 0
// 052: dload 3
// 053: d2i
// 054: dload 5
// 056: d2i
// 057: lload 12
// 059: dup2_x1
// 05a: pop2
// 05b: invokespecial su/catlean/r2.F (IJI)Z
// 05e: aload 14
// 060: ifnull 094
// 063: goto 070
// 066: ldc2_w 8584660591060652081
// 069: lload 1
// 06a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: athrow
// 070: ifeq 092
// 073: goto 080
// 076: ldc2_w 8584660591060652081
// 079: lload 1
// 07a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: athrow
// 080: aload 0
// 081: bipush 1
// 082: putfield su/catlean/r2.W Z
// 085: goto 092
// 088: ldc2_w 8584660591060652081
// 08b: lload 1
// 08c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 091: athrow
// 092: iload 7
// 094: ifne 1c4
// 097: aload 0
// 098: invokevirtual su/catlean/r2.x ()F
// 09b: aload 0
// 09c: invokevirtual su/catlean/r2.F ()F
// 09f: fadd
// 0a0: fload 15
// 0a2: fsub
// 0a3: sipush 621
// 0a6: ldc2_w 8243880782813285923
// 0a9: lload 1
// 0aa: lxor
// 0ab: invokedynamic c (IJ)I bsm=su/catlean/r2.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b0: i2f
// 0b1: fsub
// 0b2: fstore 16
// 0b4: dload 3
// 0b5: aload 0
// 0b6: invokevirtual su/catlean/r2.x ()F
// 0b9: aload 0
// 0ba: invokevirtual su/catlean/r2.F ()F
// 0bd: fadd
// 0be: ldc 7.0
// 0c0: fsub
// 0c1: f2d
// 0c2: dcmpg
// 0c3: aload 14
// 0c5: lload 1
// 0c6: lconst_0
// 0c7: lcmp
// 0c8: ifle 0f2
// 0cb: ifnull 0f0
// 0ce: ifgt 117
// 0d1: goto 0de
// 0d4: ldc2_w 8584660591060652081
// 0d7: lload 1
// 0d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dd: athrow
// 0de: fload 16
// 0e0: f2d
// 0e1: dload 3
// 0e2: dcmpg
// 0e3: goto 0f0
// 0e6: ldc2_w 8584660591060652081
// 0e9: lload 1
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: aload 14
// 0f2: ifnull 114
// 0f5: ifgt 113
// 0f8: goto 105
// 0fb: ldc2_w 8584660591060652081
// 0fe: lload 1
// 0ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: athrow
// 105: bipush 1
// 106: goto 118
// 109: ldc2_w 8584660591060652081
// 10c: lload 1
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: bipush 0
// 114: goto 118
// 117: bipush 0
// 118: ifeq 1c4
// 11b: aload 0
// 11c: invokevirtual su/catlean/r2.R ()F
// 11f: fconst_1
// 120: fadd
// 121: fstore 16
// 123: dload 5
// 125: aload 0
// 126: invokevirtual su/catlean/r2.R ()F
// 129: ldc 11.0
// 12b: fadd
// 12c: f2d
// 12d: dcmpg
// 12e: aload 14
// 130: lload 1
// 131: lconst_0
// 132: lcmp
// 133: iflt 15e
// 136: ifnull 15c
// 139: ifgt 183
// 13c: goto 149
// 13f: ldc2_w 8584660591060652081
// 142: lload 1
// 143: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 148: athrow
// 149: fload 16
// 14b: f2d
// 14c: dload 5
// 14e: dcmpg
// 14f: goto 15c
// 152: ldc2_w 8584660591060652081
// 155: lload 1
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: aload 14
// 15e: ifnull 180
// 161: ifgt 17f
// 164: goto 171
// 167: ldc2_w 8584660591060652081
// 16a: lload 1
// 16b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 170: athrow
// 171: bipush 1
// 172: goto 184
// 175: ldc2_w 8584660591060652081
// 178: lload 1
// 179: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17e: athrow
// 17f: bipush 0
// 180: goto 184
// 183: bipush 0
// 184: ifeq 1c4
// 187: aload 0
// 188: aload 0
// 189: getfield su/catlean/r2.z Z
// 18c: aload 14
// 18e: ifnull 1af
// 191: goto 19e
// 194: ldc2_w 8584660591060652081
// 197: lload 1
// 198: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19d: athrow
// 19e: ifne 1b2
// 1a1: goto 1ae
// 1a4: ldc2_w 8584660591060652081
// 1a7: lload 1
// 1a8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ad: athrow
// 1ae: bipush 1
// 1af: goto 1b3
// 1b2: bipush 0
// 1b3: putfield su/catlean/r2.z Z
// 1b6: aload 0
// 1b7: aload 0
// 1b8: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 1bb: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 1be: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
// 1c1: putfield su/catlean/r2.g Ljava/lang/String;
// 1c4: return
}

@Override
public void U(double mouseX, double mouseY, int button) {
this.W = false;
}

@Override
public void V(int key, short a, int a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
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
// 1d: ldc2_w 54976434334551
// 20: lxor
// 21: dup2
// 22: bipush 32
// 24: lushr
// 25: l2i
// 26: istore 7
// 28: dup2
// 29: bipush 32
// 2b: lshl
// 2c: bipush 48
// 2e: lushr
// 2f: l2i
// 30: istore 8
// 32: dup2
// 33: bipush 48
// 35: lshl
// 36: bipush 48
// 38: lushr
// 39: l2i
// 3a: istore 9
// 3c: pop2
// 3d: pop2
// 3e: ldc2_w -3368314324986226980
// 41: lload 5
// 43: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 48: astore 10
// 4a: aload 0
// 4b: getfield su/catlean/r2.z Z
// 4e: aload 10
// 50: ifnull 65
// 53: ifeq ff
// 56: goto 64
// 59: ldc2_w -3361775144629062069
// 5c: lload 5
// 5e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 63: athrow
// 64: iload 1
// 65: tableswitch 154 257 259 27 154 72
// 80: aload 0
// 81: bipush 0
// 82: putfield su/catlean/r2.z Z
// 85: nop
// 86: aload 0
// 87: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 8a: aload 0
// 8b: aload 0
// 8c: getfield su/catlean/r2.g Ljava/lang/String;
// 8f: iload 7
// 91: swap
// 92: iload 8
// 94: i2c
// 95: swap
// 96: iload 9
// 98: swap
// 99: invokevirtual su/catlean/r2.s (ICILjava/lang/String;)Ljava/lang/Number;
// 9c: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 9f: goto ff
// a2: astore 11
// a4: iload 3
// a5: iflt ad
// a8: aload 10
// aa: ifnonnull ff
// ad: aload 0
// ae: getfield su/catlean/r2.g Ljava/lang/String;
// b1: checkcast java/lang/CharSequence
// b4: invokeinterface java/lang/CharSequence.length ()I 1
// b9: aload 10
// bb: ifnull de
// be: goto cc
// c1: ldc2_w -3361775144629062069
// c4: lload 5
// c6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// cb: athrow
// cc: ifle e1
// cf: goto dd
// d2: ldc2_w -3361775144629062069
// d5: lload 5
// d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// dc: athrow
// dd: bipush 1
// de: goto e2
// e1: bipush 0
// e2: ifeq ff
// e5: aload 0
// e6: aload 0
// e7: getfield su/catlean/r2.g Ljava/lang/String;
// ea: bipush 1
// eb: invokestatic kotlin/text/StringsKt.dropLast (Ljava/lang/String;I)Ljava/lang/String;
// ee: putfield su/catlean/r2.g Ljava/lang/String;
// f1: goto ff
// f4: ldc2_w -3361775144629062069
// f7: lload 5
// f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// fe: athrow
// ff: return
}

@Override
public void T(char char, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: ldc2_w 666088507151863459
// 03: lload 2
// 04: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09: astore 4
// 0b: aload 0
// 0c: aload 4
// 0e: ifnull 32
// 11: getfield su/catlean/r2.z Z
// 14: ifeq 3f
// 17: goto 24
// 1a: ldc2_w 659688633786330676
// 1d: lload 2
// 1e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 23: athrow
// 24: aload 0
// 25: goto 32
// 28: ldc2_w 659688633786330676
// 2b: lload 2
// 2c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 31: athrow
// 32: aload 0
// 33: getfield su/catlean/r2.g Ljava/lang/String;
// 36: iload 1
// 37: invokedynamic makeConcatWithConstants (Ljava/lang/String;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 3c: putfield su/catlean/r2.g Ljava/lang/String;
// 3f: return
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
// 13: ldc2_w 129579831121055
// 16: lxor
// 17: dup2
// 18: bipush 32
// 1a: lushr
// 1b: l2i
// 1c: istore 12
// 1e: dup2
// 1f: bipush 32
// 21: lshl
// 22: bipush 48
// 24: lushr
// 25: l2i
// 26: istore 13
// 28: dup2
// 29: bipush 48
// 2b: lshl
// 2c: bipush 48
// 2e: lushr
// 2f: l2i
// 30: istore 14
// 32: pop2
// 33: dup2
// 34: ldc2_w 5197409592770
// 37: lxor
// 38: lstore 15
// 3a: pop2
// 3b: ldc2_w 6537910343375756582
// 3e: lload 10
// 40: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 45: astore 17
// 47: aload 0
// 48: dload 2
// 49: d2i
// 4a: dload 4
// 4c: d2i
// 4d: lload 15
// 4f: dup2_x1
// 50: pop2
// 51: invokespecial su/catlean/r2.F (IJI)Z
// 54: aload 17
// 56: ifnull 9a
// 59: ifeq 99
// 5c: goto 6a
// 5f: ldc2_w 6530947849779166641
// 62: lload 10
// 64: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69: athrow
// 6a: aload 0
// 6b: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 6e: aload 0
// 6f: aload 0
// 70: invokevirtual su/catlean/r2.A ()Lsu/catlean/a1;
// 73: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 76: iload 12
// 78: swap
// 79: checkcast java/lang/Number
// 7c: dload 6
// 7e: d2i
// 7f: iload 13
// 81: swap
// 82: iload 14
// 84: i2c
// 85: swap
// 86: invokevirtual su/catlean/r2.i (ILjava/lang/Number;ICI)Ljava/lang/Number;
// 89: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 8c: bipush 1
// 8d: ireturn
// 8e: ldc2_w 6530947849779166641
// 91: lload 10
// 93: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 98: athrow
// 99: bipush 0
// 9a: ireturn
}

@NotNull
public final IntRange H(int var1, char var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ d;
a1 var10000 = this.A();
Intrinsics.checkNotNull(var10000, a<"m">(26564, 2207962357349083820L ^ var4));
return ((c8)var10000).i();
}

@NotNull
public final ClosedFloatingPointRange U(long var1) {
var1 = d ^ var1;
a1 var10000 = this.A();
Intrinsics.checkNotNull(var10000, a<"m">(14120, 3614686925820709005L ^ var1));
return ((ct)var10000).r();
}

@NotNull
public abstract Number s(int var1, char var2, int var3, @NotNull String var4);

@NotNull
public abstract Number i(int var1, @NotNull Number var2, int var3, char var4, int var5);

private final float r(float var1, long var2, float var4, float var5) {
var2 = d ^ var2;

float var10000;
label17: {
try {
if (nk.f.D() > 5) {
var10000 = 1.0F / nk.f.D();
break label17;
}
} catch (NumberFormatException var7) {
throw vm.a<"Å">(var7, -7780287471630945515L, var2);
}

var10000 = 0.016F;
}

float var6 = Math.clamp(var10000 * var5, 0.0F, 1.0F);
return (1.0F - var6) * var1 + var6 * var4;
}

@Override
public void L() {
this.W = false;
this.z = false;
}

public static void i(_g[] var0) {
Y = var0;
}

public static _g[] W() {
return Y;
}

static {
long var25 = d ^ 102829605927243L;
_g[] var10000 = new _g[3];
vm.a<"Å">(var10000, -1248749303637288125L, var25);
Cipher var16;
Cipher var30 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var30.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[6];
int var21 = 0;
String var20 = "¸çc\u000b³\u0097Ûr|è~gÍ\u009e¬\u0001E0\u0002Fbð2°&¡(J\u0000ïæÆ\u0010Ó\u0093\u009f\u0091³Ü¬Áæ\u0018¬Í2¹,u\u0088¢\fô¬\f¶=\f\u001cª;¸ý\u0091k+ö2È\u009b\u0081ØVEsYVíÁuë#Ïµ\u0003\u0000\u0082U±\u0019³Ì[E?´\u009d¯\u0097Ì\u000fR\u007fG3'ô\u00ad¾in©Æ¸Ñ°àÜ¼\b\r\u0088HØ¼\u0093\u0081\u0015\u0011Laìæ\u0096\u0000²\u001d\u0092èøMk\u0005\u009aOÍû\u0014ýâ\u001e\u0004\u0002\u0018\u0017+\u009c¬«<Ãí|M4/D\u0004\u0015\u0012\u008dDe\u0095NH\u0011úØ?ÞÃ.³Þ\u0089\u0010wþ\u008cT\u0007¡kváE%%OB\u008f~";
int var22 = "¸çc\u000b³\u0097Ûr|è~gÍ\u009e¬\u0001E0\u0002Fbð2°&¡(J\u0000ïæÆ\u0010Ó\u0093\u009f\u0091³Ü¬Áæ\u0018¬Í2¹,u\u0088¢\fô¬\f¶=\f\u001cª;¸ý\u0091k+ö2È\u009b\u0081ØVEsYVíÁuë#Ïµ\u0003\u0000\u0082U±\u0019³Ì[E?´\u009d¯\u0097Ì\u000fR\u007fG3'ô\u00ad¾in©Æ¸Ñ°àÜ¼\b\r\u0088HØ¼\u0093\u0081\u0015\u0011Laìæ\u0096\u0000²\u001d\u0092èøMk\u0005\u009aOÍû\u0014ýâ\u001e\u0004\u0002\u0018\u0017+\u009c¬«<Ãí|M4/D\u0004\u0015\u0012\u008dDe\u0095NH\u0011úØ?ÞÃ.³Þ\u0089\u0010wþ\u008cT\u0007¡kváE%%OB\u008f~"
.length();
char var19 = ' ';
int var29 = -1;

label64:
while (true) {
String var31 = var20.substring(++var29, var29 + var19);
int var10001 = -1;

while (true) {
byte[] var24 = var16.doFinal(var31.getBytes("ISO-8859-1"));
String var44 = b(var24).intern();
switch (var10001) {
case 0:
var23[var21++] = var44;
if ((var29 += var19) >= var22) {
e = var23;
f = new String[6];
p = new HashMap(13);
Cipher var5;
Cipher var33 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var33.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[10];
int var8 = 0;
String var9 = "ê¹\u0082\u009bÌ¶¨\u0092ÉEr\u001e<\u0085(¿K\u0091X/èaì\u0087\u0007\t`<Ëa/\u001a]#i\u000e×\u0007\u0017ë°o\u00adtè;\u009e\u0007sx%Æ<\u009bò$¥Ì\u0011Ïùz³^";
int var10 = "ê¹\u0082\u009bÌ¶¨\u0092ÉEr\u001e<\u0085(¿K\u0091X/èaì\u0087\u0007\t`<Ëa/\u001a]#i\u000e×\u0007\u0017ë°o\u00adtè;\u009e\u0007sx%Æ<\u009bò$¥Ì\u0011Ïùz³^"
.length();
byte var7 = 0;

label46:
while (true) {
var10001 = var7;
var7 += 8;
byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
long[] var34 = var11;
var10001 = var8++;
long var48 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
byte var53 = -1;

while (true) {
long var13 = var48;
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
long var56 = (var15[0] & 255L) << 56
| (var15[1] & 255L) << 48
| (var15[2] & 255L) << 40
| (var15[3] & 255L) << 32
| (var15[4] & 255L) << 24
| (var15[5] & 255L) << 16
| (var15[6] & 255L) << 8
| var15[7] & 255L;
switch (var53) {
case 0:
var34[var10001] = var56;
if (var7 >= var10) {
n = var11;
o = new Integer[10];
Cipher var0;
Cipher var35 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var35.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = 3529252192888429906L;
byte[] var4 = var0.doFinal(
new byte[]{
(byte)(var2 >>> 56), (byte)(var2 >>> 48), (byte)(var2 >>> 40), (byte)(var2 >>> 32), (byte)(var2 >>> 24), (byte)(var2 >>> 16), (byte)(var2 >>> 8), (byte)var2
}
);
long var51 = (var4[0] & 255L) << 56
| (var4[1] & 255L) << 48
| (var4[2] & 255L) << 40
| (var4[3] & 255L) << 32
| (var4[4] & 255L) << 24
| (var4[5] & 255L) << 16
| (var4[6] & 255L) << 8
| var4[7] & 255L;
byte var42 = -1;
q = var51;
return;
}
break;
default:
var34[var10001] = var56;
if (var7 < var10) {
continue label46;
}

var9 = "Ø\u0094\u0019ò÷3\u0018\u0016´\u0004Q¸ÒsM\u000e";
var10 = "Ø\u0094\u0019ò÷3\u0018\u0016´\u0004Q¸ÒsM\u000e".length();
var7 = 0;
}

byte var41 = var7;
var7 += 8;
var12 = var9.substring(var41, var7).getBytes("ISO-8859-1");
var34 = var11;
var10001 = var8++;
var48 = (var12[0] & 255L) << 56
| (var12[1] & 255L) << 48
| (var12[2] & 255L) << 40
| (var12[3] & 255L) << 32
| (var12[4] & 255L) << 24
| (var12[5] & 255L) << 16
| (var12[6] & 255L) << 8
| var12[7] & 255L;
var53 = 0;
}
}
}

var19 = var20.charAt(var29);
break;
default:
var23[var21++] = var44;
if ((var29 += var19) < var22) {
var19 = var20.charAt(var29);
continue label64;
}

var20 = "¢ÅHGøÓ\u0010\u008e\u0012;Û#ÍÇ\u0099È%âßÈ\u0016¥ß\u0096\u0098ýä'HÊ_L÷ >²S\u0080\"\u00ad\\\u009bïµfþ|Ôu¢(ú©Z/çsÏLM\u00adÁÙÞlXÚ§Tí¾9\u0097\u0091Ô£Â\u001eS¨|\u008a) \u0099¢s-áì\u008c\\\u009caFß®#|«³\u0004~ØPÚÌ\u0090G\u0099Á)é¡q\u001d\u0087Aá¥\u0096\u0093Õ#ð@T\u0084\u0018\u008a}\u0082\u009bntÚG\"&ÈÝ©'\u001bç\u001e°ü]ëÇ0j";
var22 = "¢ÅHGøÓ\u0010\u008e\u0012;Û#ÍÇ\u0099È%âßÈ\u0016¥ß\u0096\u0098ýä'HÊ_L÷ >²S\u0080\"\u00ad\\\u009bïµfþ|Ôu¢(ú©Z/çsÏLM\u00adÁÙÞlXÚ§Tí¾9\u0097\u0091Ô£Â\u001eS¨|\u008a) \u0099¢s-áì\u008c\\\u009caFß®#|«³\u0004~ØPÚÌ\u0090G\u0099Á)é¡q\u001d\u0087Aá¥\u0096\u0093Õ#ð@T\u0084\u0018\u008a}\u0082\u009bntÚG\"&ÈÝ©'\u001bç\u001e°ü]ëÇ0j"
.length();
var19 = 128;
var29 = -1;
}

var31 = var20.substring(++var29, var29 + var19);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 23672;
if (f[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])h.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
h.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/r2", var10);
}

byte[] var6 = new byte[8];
var6[0] = (byte)(var1 >>> 56);

for (int var7 = 1; var7 < 8; var7++) {
var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
}

DESKeySpec var11 = new DESKeySpec(var6);
SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
byte[] var9 = e[var5].getBytes("ISO-8859-1");
f[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return f[var5];
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
throw new RuntimeException("su/catlean/r2" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 14954;
if (o[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = n[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])p.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
p.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/r2", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
o[var3] = var15;
}

return o[var3];
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
throw new RuntimeException("su/catlean/r2" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
