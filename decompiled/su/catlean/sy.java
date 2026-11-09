package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2846.class_2847;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sy {
@NotNull
private final class_2338 f;
private float x;
private float u;
@NotNull
private final ArrayDeque l;
private int b;
@NotNull
private final bg G;
private static int t;
private static final long a = yz.a(-2729110602017252816L, 1742512876529886977L, MethodHandles.lookup().lookupClass()).a(201082147273540L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

public sy(@NotNull class_2338 pos, long a, @Nullable class_2350 direction) {
ax = a ^ ax;
long var5 = ax ^ 25258088773770L;
Intrinsics.checkNotNullParameter(pos, a<"o">(22314, 4188300308882852118L ^ ax));
super();
this.f = pos;
this.l = new ArrayDeque();
this.G = new bg();
this.l(direction, var5);
}

@NotNull
public final class_2338 b() {
return this.f;
}

public final float O() {
return this.x;
}

public final float G() {
return this.u;
}

public final int u() {
return this.b;
}

public final void U(int <set-?>) {
this.b = <set-?>;
}

public final void l(@Nullable class_2350 direction, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sy.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: lload 2
// 007: dup2
// 008: ldc2_w 65563693654443
// 00b: lxor
// 00c: dup2
// 00d: bipush 16
// 00f: lushr
// 010: lstore 4
// 012: dup2
// 013: bipush 48
// 015: lshl
// 016: bipush 48
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: pop2
// 01d: dup2
// 01e: ldc2_w 739821036828
// 021: lxor
// 022: lstore 7
// 024: dup2
// 025: ldc2_w 99342029350845
// 028: lxor
// 029: lstore 9
// 02b: dup2
// 02c: ldc2_w 97139994061893
// 02f: lxor
// 030: lstore 11
// 032: dup2
// 033: ldc2_w 75586510925668
// 036: lxor
// 037: dup2
// 038: bipush 32
// 03a: lushr
// 03b: l2i
// 03c: istore 13
// 03e: dup2
// 03f: bipush 32
// 041: lshl
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 14
// 048: dup2
// 049: bipush 48
// 04b: lshl
// 04c: bipush 48
// 04e: lushr
// 04f: l2i
// 050: istore 15
// 052: pop2
// 053: dup2
// 054: ldc2_w 39835333156740
// 057: lxor
// 058: lstore 16
// 05a: dup2
// 05b: ldc2_w 125938160785298
// 05e: lxor
// 05f: lstore 18
// 061: dup2
// 062: ldc2_w 62022801193748
// 065: lxor
// 066: lstore 20
// 068: dup2
// 069: ldc2_w 113278507193906
// 06c: lxor
// 06d: lstore 22
// 06f: dup2
// 070: ldc2_w 126274410243031
// 073: lxor
// 074: lstore 24
// 076: dup2
// 077: ldc2_w 20574449684226
// 07a: lxor
// 07b: lstore 26
// 07d: pop2
// 07e: ldc2_w 3547194852712935997
// 081: lload 2
// 082: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 087: istore 28
// 089: aload 1
// 08a: dup
// 08b: iload 28
// 08d: ifne 0b7
// 090: ifnonnull 0c7
// 093: goto 0a0
// 096: ldc2_w 3568034702953982775
// 099: lload 2
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: pop
// 0a1: lload 24
// 0a3: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a6: invokevirtual net/minecraft/class_746.method_5735 ()Lnet/minecraft/class_2350;
// 0a9: dup
// 0aa: goto 0b7
// 0ad: ldc2_w 3568034702953982775
// 0b0: lload 2
// 0b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b6: athrow
// 0b7: sipush 2887
// 0ba: ldc2_w 3931234706224235801
// 0bd: lload 2
// 0be: lxor
// 0bf: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c7: astore 29
// 0c9: lload 24
// 0cb: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ce: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 0d1: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 0d4: istore 30
// 0d6: iload 13
// 0d8: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0db: aload 0
// 0dc: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 0df: iload 14
// 0e1: swap
// 0e2: iload 15
// 0e4: i2s
// 0e5: invokestatic su/catlean/ex.m (ILsu/catlean/ex;ILnet/minecraft/class_2338;S)I
// 0e8: istore 31
// 0ea: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0ed: iload 28
// 0ef: lload 2
// 0f0: lconst_0
// 0f1: lcmp
// 0f2: iflt 143
// 0f5: ifne 141
// 0f8: lload 9
// 0fa: dup2_x1
// 0fb: pop2
// 0fc: invokestatic su/catlean/ex.C (JLsu/catlean/ex;)Lsu/catlean/zy;
// 0ff: getstatic su/catlean/zy.ALWAYS Lsu/catlean/zy;
// 102: if_acmpne 13e
// 105: goto 112
// 108: ldc2_w 3568034702953982775
// 10b: lload 2
// 10c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 111: athrow
// 112: iload 31
// 114: bipush -1
// 115: if_icmpne 130
// 118: goto 125
// 11b: ldc2_w 3568034702953982775
// 11e: lload 2
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: return
// 126: ldc2_w 3568034702953982775
// 129: lload 2
// 12a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12f: athrow
// 130: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 133: iload 31
// 135: lload 4
// 137: iload 6
// 139: i2s
// 13a: bipush -1
// 13b: invokestatic su/catlean/ex.C (Lsu/catlean/ex;IJSI)V
// 13e: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 141: iload 28
// 143: lload 2
// 144: lconst_0
// 145: lcmp
// 146: iflt 23c
// 149: ifne 23a
// 14c: lload 26
// 14e: invokevirtual su/catlean/ex.x (J)Z
// 151: ifeq 21b
// 154: goto 161
// 157: ldc2_w 3568034702953982775
// 15a: lload 2
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: lload 2
// 162: lconst_0
// 163: lcmp
// 164: ifle 1f4
// 167: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 16a: lload 7
// 16c: invokestatic su/catlean/ex.z (Lsu/catlean/ex;J)Lsu/catlean/oh;
// 16f: getstatic su/catlean/oh.NEW Lsu/catlean/oh;
// 172: if_acmpne 1d6
// 175: goto 182
// 178: ldc2_w 3568034702953982775
// 17b: lload 2
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: aload 0
// 183: aload 29
// 185: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.h (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 18a: lload 16
// 18c: dup2_x1
// 18d: pop2
// 18e: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 191: new net/minecraft/class_2846
// 194: dup
// 195: getstatic net/minecraft/class_2846$class_2847.field_12971 Lnet/minecraft/class_2846$class_2847;
// 198: aload 0
// 199: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 19c: bipush 0
// 19d: sipush 9310
// 1a0: ldc2_w 9008584028188184213
// 1a3: lload 2
// 1a4: lxor
// 1a5: invokedynamic k (IJ)I bsm=su/catlean/sy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: bipush 0
// 1ab: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
// 1ae: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 1b1: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 1b4: checkcast net/minecraft/class_2596
// 1b7: lload 18
// 1b9: dup2_x1
// 1ba: pop2
// 1bb: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 1be: iload 28
// 1c0: lload 2
// 1c1: lconst_0
// 1c2: lcmp
// 1c3: ifle 218
// 1c6: ifeq 201
// 1c9: goto 1d6
// 1cc: ldc2_w 3568034702953982775
// 1cf: lload 2
// 1d0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d5: athrow
// 1d6: aload 0
// 1d7: aload 29
// 1d9: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.m (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 1de: lload 16
// 1e0: dup2_x1
// 1e1: pop2
// 1e2: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 1e5: aload 0
// 1e6: aload 29
// 1e8: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.a (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 1ed: lload 16
// 1ef: dup2_x1
// 1f0: pop2
// 1f1: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 1f4: goto 201
// 1f7: ldc2_w 3568034702953982775
// 1fa: lload 2
// 1fb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 200: athrow
// 201: aload 0
// 202: aload 29
// 204: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.M (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 209: lload 16
// 20b: dup2_x1
// 20c: pop2
// 20d: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 210: lload 2
// 211: lconst_0
// 212: lcmp
// 213: ifle 22a
// 216: iload 28
// 218: ifeq 2c9
// 21b: aload 0
// 21c: aload 29
// 21e: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.N (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 223: lload 16
// 225: dup2_x1
// 226: pop2
// 227: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 22a: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 22d: goto 23a
// 230: ldc2_w 3568034702953982775
// 233: lload 2
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: iload 28
// 23c: lload 2
// 23d: lconst_0
// 23e: lcmp
// 23f: ifle 2ce
// 242: ifne 2cc
// 245: lload 20
// 247: dup2_x1
// 248: pop2
// 249: invokestatic su/catlean/ex.O (JLsu/catlean/ex;)Lsu/catlean/bu;
// 24c: getstatic su/catlean/bu.NONE Lsu/catlean/bu;
// 24f: if_acmpeq 2c9
// 252: goto 25f
// 255: ldc2_w 3568034702953982775
// 258: lload 2
// 259: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25e: athrow
// 25f: lload 2
// 260: lconst_0
// 261: lcmp
// 262: iflt 2bc
// 265: lload 20
// 267: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 26a: invokestatic su/catlean/ex.O (JLsu/catlean/ex;)Lsu/catlean/bu;
// 26d: getstatic su/catlean/bu.ABORT Lsu/catlean/bu;
// 270: if_acmpne 2ad
// 273: goto 280
// 276: ldc2_w 3568034702953982775
// 279: lload 2
// 27a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: athrow
// 280: new net/minecraft/class_2846
// 283: dup
// 284: getstatic net/minecraft/class_2846$class_2847.field_12971 Lnet/minecraft/class_2846$class_2847;
// 287: aload 0
// 288: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 28b: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 28e: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 291: checkcast net/minecraft/class_2596
// 294: lload 18
// 296: dup2_x1
// 297: pop2
// 298: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 29b: iload 28
// 29d: ifeq 2c9
// 2a0: goto 2ad
// 2a3: ldc2_w 3568034702953982775
// 2a6: lload 2
// 2a7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ac: athrow
// 2ad: aload 0
// 2ae: aload 29
// 2b0: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.s (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 2b5: lload 16
// 2b7: dup2_x1
// 2b8: pop2
// 2b9: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 2bc: goto 2c9
// 2bf: ldc2_w 3568034702953982775
// 2c2: lload 2
// 2c3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c8: athrow
// 2c9: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 2cc: iload 28
// 2ce: lload 2
// 2cf: lconst_0
// 2d0: lcmp
// 2d1: iflt 30d
// 2d4: ifne 30b
// 2d7: lload 9
// 2d9: dup2_x1
// 2da: pop2
// 2db: invokestatic su/catlean/ex.C (JLsu/catlean/ex;)Lsu/catlean/zy;
// 2de: getstatic su/catlean/zy.ALWAYS Lsu/catlean/zy;
// 2e1: if_acmpne 37d
// 2e4: goto 2f1
// 2e7: ldc2_w 3568034702953982775
// 2ea: lload 2
// 2eb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f0: athrow
// 2f1: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 2f4: invokevirtual su/catlean/ex.P ()Ljava/util/concurrent/atomic/AtomicBoolean;
// 2f7: bipush 1
// 2f8: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 2fb: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 2fe: goto 30b
// 301: ldc2_w 3568034702953982775
// 304: lload 2
// 305: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30a: athrow
// 30b: iload 28
// 30d: lload 2
// 30e: lconst_0
// 30f: lcmp
// 310: iflt 373
// 313: ifne 371
// 316: lload 11
// 318: dup2_x1
// 319: pop2
// 31a: invokestatic su/catlean/ex.T (JLsu/catlean/ex;)Z
// 31d: ifeq 361
// 320: goto 32d
// 323: ldc2_w 3568034702953982775
// 326: lload 2
// 327: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32c: athrow
// 32d: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 330: lload 22
// 332: bipush 1
// 333: bipush 0
// 334: bipush 0
// 335: iload 30
// 337: iload 31
// 339: invokedynamic run (II)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/sy.c (II)V, ()V ]
// 33e: sipush 16874
// 341: ldc2_w 6131910164299639588
// 344: lload 2
// 345: lxor
// 346: invokedynamic k (IJ)I bsm=su/catlean/sy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34b: aconst_null
// 34c: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 34f: iload 28
// 351: ifeq 37d
// 354: goto 361
// 357: ldc2_w 3568034702953982775
// 35a: lload 2
// 35b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 360: athrow
// 361: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 364: goto 371
// 367: ldc2_w 3568034702953982775
// 36a: lload 2
// 36b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 370: athrow
// 371: iload 30
// 373: lload 4
// 375: iload 6
// 377: i2s
// 378: iload 31
// 37a: invokestatic su/catlean/ex.C (Lsu/catlean/ex;IJSI)V
// 37d: return
}

public final boolean x(long a, boolean async) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sy.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 124486363344667
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 16
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: dup2
// 01e: bipush 48
// 020: lshl
// 021: bipush 48
// 023: lushr
// 024: l2i
// 025: istore 6
// 027: pop2
// 028: dup2
// 029: ldc2_w 131342679386534
// 02c: lxor
// 02d: lstore 7
// 02f: dup2
// 030: ldc2_w 74668464368320
// 033: lxor
// 034: dup2
// 035: bipush 8
// 037: lushr
// 038: lstore 9
// 03a: dup2
// 03b: bipush 56
// 03d: lshl
// 03e: bipush 56
// 040: lushr
// 041: l2i
// 042: istore 11
// 044: pop2
// 045: dup2
// 046: ldc2_w 93156183534265
// 049: lxor
// 04a: lstore 12
// 04c: dup2
// 04d: ldc2_w 132452310614006
// 050: lxor
// 051: lstore 14
// 053: dup2
// 054: ldc2_w 134561237385553
// 057: lxor
// 058: lstore 16
// 05a: dup2
// 05b: ldc2_w 35665640812953
// 05e: lxor
// 05f: lstore 18
// 061: dup2
// 062: ldc2_w 123808590381602
// 065: lxor
// 066: dup2
// 067: bipush 32
// 069: lushr
// 06a: l2i
// 06b: istore 20
// 06d: dup2
// 06e: bipush 32
// 070: lshl
// 071: bipush 32
// 073: lushr
// 074: l2i
// 075: istore 21
// 077: pop2
// 078: dup2
// 079: ldc2_w 119003779014906
// 07c: lxor
// 07d: lstore 22
// 07f: dup2
// 080: ldc2_w 33674964371061
// 083: lxor
// 084: dup2
// 085: bipush 32
// 087: lushr
// 088: l2i
// 089: istore 24
// 08b: dup2
// 08c: bipush 32
// 08e: lshl
// 08f: bipush 48
// 091: lushr
// 092: l2i
// 093: istore 25
// 095: dup2
// 096: bipush 48
// 098: lshl
// 099: bipush 48
// 09b: lushr
// 09c: l2i
// 09d: istore 26
// 09f: pop2
// 0a0: dup2
// 0a1: ldc2_w 23635958827609
// 0a4: lxor
// 0a5: lstore 27
// 0a7: dup2
// 0a8: ldc2_w 133976395316184
// 0ab: lxor
// 0ac: lstore 29
// 0ae: dup2
// 0af: ldc2_w 75506411899503
// 0b2: lxor
// 0b3: lstore 31
// 0b5: dup2
// 0b6: ldc2_w 91617247462780
// 0b9: lxor
// 0ba: lstore 33
// 0bc: dup2
// 0bd: ldc2_w 94161715061205
// 0c0: lxor
// 0c1: lstore 35
// 0c3: dup2
// 0c4: ldc2_w 32513191609938
// 0c7: lxor
// 0c8: lstore 37
// 0ca: dup2
// 0cb: ldc2_w 32793248291633
// 0ce: lxor
// 0cf: lstore 39
// 0d1: dup2
// 0d2: ldc2_w 83595846651362
// 0d5: lxor
// 0d6: dup2
// 0d7: bipush 32
// 0d9: lushr
// 0da: l2i
// 0db: istore 41
// 0dd: dup2
// 0de: bipush 32
// 0e0: lshl
// 0e1: bipush 48
// 0e3: lushr
// 0e4: l2i
// 0e5: istore 42
// 0e7: dup2
// 0e8: bipush 48
// 0ea: lshl
// 0eb: bipush 48
// 0ed: lushr
// 0ee: l2i
// 0ef: istore 43
// 0f1: pop2
// 0f2: dup2
// 0f3: ldc2_w 97613368168927
// 0f6: lxor
// 0f7: dup2
// 0f8: bipush 8
// 0fa: lushr
// 0fb: lstore 44
// 0fd: dup2
// 0fe: bipush 56
// 100: lshl
// 101: bipush 56
// 103: lushr
// 104: l2i
// 105: istore 46
// 107: pop2
// 108: dup2
// 109: ldc2_w 80824280645745
// 10c: lxor
// 10d: lstore 47
// 10f: dup2
// 110: ldc2_w 127338083378582
// 113: lxor
// 114: lstore 49
// 116: dup2
// 117: ldc2_w 28652454505860
// 11a: lxor
// 11b: lstore 51
// 11d: dup2
// 11e: ldc2_w 136584631169022
// 121: lxor
// 122: dup2
// 123: bipush 48
// 125: lushr
// 126: l2i
// 127: istore 53
// 129: dup2
// 12a: bipush 16
// 12c: lshl
// 12d: bipush 16
// 12f: lushr
// 130: lstore 54
// 132: pop2
// 133: pop2
// 134: ldc2_w -7841695262179256190
// 137: lload 1
// 138: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13d: istore 56
// 13f: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 142: aload 0
// 143: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 146: iload 20
// 148: swap
// 149: iload 21
// 14b: invokevirtual su/catlean/gw.M (ILnet/minecraft/class_2338;I)Ljava/util/List;
// 14e: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/util/List;)Ljava/lang/Object;
// 151: checkcast net/minecraft/class_2350
// 154: dup
// 155: iload 56
// 157: ifeq 181
// 15a: ifnonnull 191
// 15d: goto 16a
// 160: ldc2_w -7853648756463760975
// 163: lload 1
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: pop
// 16b: lload 16
// 16d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 170: invokevirtual net/minecraft/class_746.method_5735 ()Lnet/minecraft/class_2350;
// 173: dup
// 174: goto 181
// 177: ldc2_w -7853648756463760975
// 17a: lload 1
// 17b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 180: athrow
// 181: sipush 2887
// 184: ldc2_w 3931226423203882911
// 187: lload 1
// 188: lxor
// 189: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 191: astore 57
// 193: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 196: invokevirtual su/catlean/ex.Fn ()Ljava/util/LinkedList;
// 199: checkcast java/lang/Iterable
// 19c: astore 59
// 19e: bipush 0
// 19f: istore 60
// 1a1: aload 59
// 1a3: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1a8: astore 61
// 1aa: aload 61
// 1ac: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1b1: ifeq 1f4
// 1b4: aload 61
// 1b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1bb: astore 62
// 1bd: aload 62
// 1bf: checkcast su/catlean/sy
// 1c2: astore 63
// 1c4: bipush 0
// 1c5: istore 64
// 1c7: lload 14
// 1c9: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1cc: aload 63
// 1ce: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 1d1: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 1d4: iload 56
// 1d6: ifeq 1dd
// 1d9: ifne 1e0
// 1dc: bipush 1
// 1dd: goto 1e1
// 1e0: bipush 0
// 1e1: ifeq 1aa
// 1e4: aload 62
// 1e6: lload 1
// 1e7: lconst_0
// 1e8: lcmp
// 1e9: iflt 1bb
// 1ec: iload 56
// 1ee: ifeq 1bf
// 1f1: goto 1f5
// 1f4: aconst_null
// 1f5: checkcast su/catlean/sy
// 1f8: astore 58
// 1fa: aload 0
// 1fb: iload 4
// 1fd: i2s
// 1fe: iload 5
// 200: iload 6
// 202: invokevirtual su/catlean/sy.v (SII)Z
// 205: istore 59
// 207: iload 41
// 209: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 20c: aload 0
// 20d: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 210: iload 42
// 212: swap
// 213: iload 43
// 215: i2s
// 216: invokestatic su/catlean/ex.m (ILsu/catlean/ex;ILnet/minecraft/class_2338;S)I
// 219: istore 60
// 21b: aload 0
// 21c: getfield su/catlean/sy.b I
// 21f: iload 56
// 221: ifeq 2b7
// 224: ifle 2a5
// 227: goto 234
// 22a: ldc2_w -7853648756463760975
// 22d: lload 1
// 22e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 233: athrow
// 234: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 237: lload 51
// 239: invokevirtual su/catlean/ex.x (J)Z
// 23c: iload 56
// 23e: ifeq 2b7
// 241: goto 24e
// 244: ldc2_w -7853648756463760975
// 247: lload 1
// 248: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24d: athrow
// 24e: ifeq 2a5
// 251: goto 25e
// 254: ldc2_w -7853648756463760975
// 257: lload 1
// 258: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: athrow
// 25e: aload 0
// 25f: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 262: invokestatic su/catlean/ex.FO ()Lnet/minecraft/class_2338;
// 265: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 268: iload 56
// 26a: lload 1
// 26b: lconst_0
// 26c: lcmp
// 26d: iflt 2b9
// 270: ifeq 2b7
// 273: goto 280
// 276: ldc2_w -7853648756463760975
// 279: lload 1
// 27a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 27f: athrow
// 280: ifne 2a5
// 283: goto 290
// 286: ldc2_w -7853648756463760975
// 289: lload 1
// 28a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28f: athrow
// 290: aload 0
// 291: lload 9
// 293: iload 11
// 295: i2b
// 296: invokevirtual su/catlean/sy.T (JB)V
// 299: bipush 1
// 29a: ireturn
// 29b: ldc2_w -7853648756463760975
// 29e: lload 1
// 29f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a4: athrow
// 2a5: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 2a8: aload 0
// 2a9: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 2ac: iload 24
// 2ae: swap
// 2af: iload 25
// 2b1: swap
// 2b2: iload 26
// 2b4: invokestatic su/catlean/ex.q (Lsu/catlean/ex;IILnet/minecraft/class_2338;I)Z
// 2b7: iload 56
// 2b9: lload 1
// 2ba: lconst_0
// 2bb: lcmp
// 2bc: iflt 2f5
// 2bf: ifeq 2f3
// 2c2: ifne 2e7
// 2c5: goto 2d2
// 2c8: ldc2_w -7853648756463760975
// 2cb: lload 1
// 2cc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d1: athrow
// 2d2: aload 0
// 2d3: lload 9
// 2d5: iload 11
// 2d7: i2b
// 2d8: invokevirtual su/catlean/sy.T (JB)V
// 2db: bipush 1
// 2dc: ireturn
// 2dd: ldc2_w -7853648756463760975
// 2e0: lload 1
// 2e1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2e6: athrow
// 2e7: lload 14
// 2e9: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 2ec: aload 0
// 2ed: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 2f0: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 2f3: iload 56
// 2f5: lload 1
// 2f6: lconst_0
// 2f7: lcmp
// 2f8: ifle 3ab
// 2fb: ifeq 3a9
// 2fe: ifeq 3a3
// 301: goto 30e
// 304: ldc2_w -7853648756463760975
// 307: lload 1
// 308: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30d: athrow
// 30e: aload 0
// 30f: fconst_0
// 310: putfield su/catlean/sy.x F
// 313: aload 0
// 314: ldc -1.0
// 316: putfield su/catlean/sy.u F
// 319: aload 0
// 31a: getfield su/catlean/sy.l Ljava/util/ArrayDeque;
// 31d: lload 16
// 31f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 322: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 325: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
// 328: invokevirtual java/util/ArrayDeque.add (Ljava/lang/Object;)Z
// 32b: pop
// 32c: aload 0
// 32d: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 330: invokestatic su/catlean/ex.FO ()Lnet/minecraft/class_2338;
// 333: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 336: iload 56
// 338: lload 1
// 339: lconst_0
// 33a: lcmp
// 33b: ifle 376
// 33e: ifeq 374
// 341: goto 34e
// 344: ldc2_w -7853648756463760975
// 347: lload 1
// 348: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34d: athrow
// 34e: ifne 3a1
// 351: goto 35e
// 354: ldc2_w -7853648756463760975
// 357: lload 1
// 358: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 35d: athrow
// 35e: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 361: invokevirtual su/catlean/ex.Fn ()Ljava/util/LinkedList;
// 364: invokevirtual java/util/LinkedList.size ()I
// 367: goto 374
// 36a: ldc2_w -7853648756463760975
// 36d: lload 1
// 36e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 373: athrow
// 374: iload 56
// 376: lload 1
// 377: lconst_0
// 378: lcmp
// 379: ifle 380
// 37c: ifeq 39e
// 37f: bipush 1
// 380: if_icmple 3a1
// 383: goto 390
// 386: ldc2_w -7853648756463760975
// 389: lload 1
// 38a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 38f: athrow
// 390: bipush 1
// 391: goto 39e
// 394: ldc2_w -7853648756463760975
// 397: lload 1
// 398: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39d: athrow
// 39e: goto 3a2
// 3a1: bipush 0
// 3a2: ireturn
// 3a3: aload 0
// 3a4: getfield su/catlean/sy.x F
// 3a7: fconst_0
// 3a8: fcmpg
// 3a9: iload 56
// 3ab: ifeq 3bf
// 3ae: ifne 3c2
// 3b1: goto 3be
// 3b4: ldc2_w -7853648756463760975
// 3b7: lload 1
// 3b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bd: athrow
// 3be: bipush 1
// 3bf: goto 3c3
// 3c2: bipush 0
// 3c3: lload 1
// 3c4: lconst_0
// 3c5: lcmp
// 3c6: iflt 3d3
// 3c9: ifeq 65e
// 3cc: aload 0
// 3cd: getfield su/catlean/sy.u F
// 3d0: ldc -1.0
// 3d2: fcmpg
// 3d3: iload 56
// 3d5: ifeq 3f6
// 3d8: goto 3e5
// 3db: ldc2_w -7853648756463760975
// 3de: lload 1
// 3df: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: athrow
// 3e5: ifne 3f9
// 3e8: goto 3f5
// 3eb: ldc2_w -7853648756463760975
// 3ee: lload 1
// 3ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f4: athrow
// 3f5: bipush 1
// 3f6: goto 3fa
// 3f9: bipush 0
// 3fa: ifeq 65e
// 3fd: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 400: lload 44
// 402: iload 46
// 404: i2b
// 405: invokevirtual su/catlean/ex.F9 (JB)Lsu/catlean/gx;
// 408: getstatic su/catlean/gx.PACKET Lsu/catlean/gx;
// 40b: if_acmpne 65e
// 40e: goto 41b
// 411: ldc2_w -7853648756463760975
// 414: lload 1
// 415: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41a: athrow
// 41b: aload 0
// 41c: getfield su/catlean/sy.G Lsu/catlean/bg;
// 41f: sipush 24561
// 422: ldc2_w 6924986403724908478
// 425: lload 1
// 426: lxor
// 427: invokedynamic k (IJ)I bsm=su/catlean/sy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42c: lload 39
// 42e: invokevirtual su/catlean/bg.q (IJ)Z
// 431: iload 56
// 433: ifeq 660
// 436: goto 443
// 439: ldc2_w -7853648756463760975
// 43c: lload 1
// 43d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 442: athrow
// 443: ifeq 65e
// 446: goto 453
// 449: ldc2_w -7853648756463760975
// 44c: lload 1
// 44d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 452: athrow
// 453: aload 0
// 454: getfield su/catlean/sy.b I
// 457: lload 1
// 458: lconst_0
// 459: lcmp
// 45a: iflt 530
// 45d: iload 56
// 45f: ifeq 530
// 462: goto 46f
// 465: ldc2_w -7853648756463760975
// 468: lload 1
// 469: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 46e: athrow
// 46f: ifle 504
// 472: goto 47f
// 475: ldc2_w -7853648756463760975
// 478: lload 1
// 479: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47e: athrow
// 47f: lload 1
// 480: lconst_0
// 481: lcmp
// 482: iflt 504
// 485: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 488: lload 33
// 48a: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 48d: getstatic su/catlean/d0.GRIM Lsu/catlean/d0;
// 490: if_acmpne 504
// 493: goto 4a0
// 496: ldc2_w -7853648756463760975
// 499: lload 1
// 49a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49f: athrow
// 4a0: aload 0
// 4a1: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 4a4: invokestatic su/catlean/ex.FO ()Lnet/minecraft/class_2338;
// 4a7: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 4aa: iload 56
// 4ac: lload 1
// 4ad: lconst_0
// 4ae: lcmp
// 4af: ifle 662
// 4b2: ifeq 660
// 4b5: goto 4c2
// 4b8: ldc2_w -7853648756463760975
// 4bb: lload 1
// 4bc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4c1: athrow
// 4c2: ifne 65e
// 4c5: goto 4d2
// 4c8: ldc2_w -7853648756463760975
// 4cb: lload 1
// 4cc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4d1: athrow
// 4d2: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 4d5: invokevirtual su/catlean/ex.Fn ()Ljava/util/LinkedList;
// 4d8: invokevirtual java/util/LinkedList.size ()I
// 4db: bipush 1
// 4dc: lload 1
// 4dd: lconst_0
// 4de: lcmp
// 4df: iflt 679
// 4e2: iload 56
// 4e4: ifeq 679
// 4e7: goto 4f4
// 4ea: ldc2_w -7853648756463760975
// 4ed: lload 1
// 4ee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f3: athrow
// 4f4: if_icmple 65e
// 4f7: goto 504
// 4fa: ldc2_w -7853648756463760975
// 4fd: lload 1
// 4fe: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 503: athrow
// 504: aload 0
// 505: lload 1
// 506: lconst_0
// 507: lcmp
// 508: ifle 55c
// 50b: iload 56
// 50d: ifeq 55c
// 510: goto 51d
// 513: ldc2_w -7853648756463760975
// 516: lload 1
// 517: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 51c: athrow
// 51d: getfield su/catlean/sy.l Ljava/util/ArrayDeque;
// 520: invokevirtual java/util/ArrayDeque.isEmpty ()Z
// 523: goto 530
// 526: ldc2_w -7853648756463760975
// 529: lload 1
// 52a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52f: athrow
// 530: ifne 54e
// 533: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 536: lload 33
// 538: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 53b: getstatic su/catlean/d0.NCP_AIR Lsu/catlean/d0;
// 53e: if_acmpeq 593
// 541: goto 54e
// 544: ldc2_w -7853648756463760975
// 547: lload 1
// 548: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54d: athrow
// 54e: aload 0
// 54f: goto 55c
// 552: ldc2_w -7853648756463760975
// 555: lload 1
// 556: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55b: athrow
// 55c: aload 57
// 55e: lload 31
// 560: invokevirtual su/catlean/sy.l (Lnet/minecraft/class_2350;J)V
// 563: lload 16
// 565: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 568: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 56b: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 56e: iload 56
// 570: lload 1
// 571: lconst_0
// 572: lcmp
// 573: ifle 57a
// 576: ifne 65c
// 579: bipush 1
// 57a: anewarray 281
// 57d: ldc2_w -7846975801057437404
// 580: lload 1
// 581: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 586: goto 593
// 589: ldc2_w -7853648756463760975
// 58c: lload 1
// 58d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 592: athrow
// 593: aload 0
// 594: getfield su/catlean/sy.l Ljava/util/ArrayDeque;
// 597: checkcast java/util/Collection
// 59a: invokeinterface java/util/Collection.isEmpty ()Z 1
// 59f: iload 56
// 5a1: ifeq 5b5
// 5a4: ifne 5b8
// 5a7: goto 5b4
// 5aa: ldc2_w -7853648756463760975
// 5ad: lload 1
// 5ae: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b3: athrow
// 5b4: bipush 1
// 5b5: goto 5b9
// 5b8: bipush 0
// 5b9: ifeq 65c
// 5bc: aload 0
// 5bd: getfield su/catlean/sy.l Ljava/util/ArrayDeque;
// 5c0: checkcast java/lang/Iterable
// 5c3: astore 61
// 5c5: bipush 0
// 5c6: istore 62
// 5c8: aload 61
// 5ca: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 5cf: astore 63
// 5d1: aload 63
// 5d3: invokeinterface java/util/Iterator.hasNext ()Z 1
// 5d8: ifeq 65b
// 5db: aload 63
// 5dd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 5e2: astore 64
// 5e4: aload 64
// 5e6: checkcast java/lang/Boolean
// 5e9: astore 65
// 5eb: bipush 0
// 5ec: istore 66
// 5ee: aload 0
// 5ef: aload 0
// 5f0: getfield su/catlean/sy.x F
// 5f3: putfield su/catlean/sy.u F
// 5f6: aload 0
// 5f7: aload 0
// 5f8: getfield su/catlean/sy.x F
// 5fb: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 5fe: lload 14
// 600: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 603: aload 0
// 604: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 607: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 60a: dup
// 60b: sipush 30320
// 60e: ldc2_w 5676576270956403373
// 611: lload 1
// 612: lxor
// 613: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 618: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 61b: aload 0
// 61c: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 61f: iload 60
// 621: aload 65
// 623: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 626: aload 65
// 628: invokevirtual java/lang/Boolean.booleanValue ()Z
// 62b: lload 18
// 62d: dup2_x1
// 62e: pop2
// 62f: invokestatic su/catlean/ex.K (Lsu/catlean/ex;Lnet/minecraft/class_2680;Lnet/minecraft/class_2338;IJZ)F
// 632: fadd
// 633: putfield su/catlean/sy.x F
// 636: nop
// 637: nop
// 638: iload 56
// 63a: lload 1
// 63b: lconst_0
// 63c: lcmp
// 63d: iflt 65d
// 640: ifeq 65c
// 643: iload 56
// 645: ifne 5d1
// 648: lload 1
// 649: lconst_0
// 64a: lcmp
// 64b: iflt 638
// 64e: goto 65b
// 651: ldc2_w -7853648756463760975
// 654: lload 1
// 655: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 65a: athrow
// 65b: nop
// 65c: bipush 0
// 65d: ireturn
// 65e: iload 60
// 660: iload 56
// 662: lload 1
// 663: lconst_0
// 664: lcmp
// 665: ifle 698
// 668: ifeq 690
// 66b: bipush -1
// 66c: goto 679
// 66f: ldc2_w -7853648756463760975
// 672: lload 1
// 673: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 678: athrow
// 679: if_icmpne 688
// 67c: bipush 0
// 67d: ireturn
// 67e: ldc2_w -7853648756463760975
// 681: lload 1
// 682: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 687: athrow
// 688: lload 16
// 68a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 68d: invokevirtual net/minecraft/class_746.method_6115 ()Z
// 690: lload 1
// 691: lconst_0
// 692: lcmp
// 693: iflt 73c
// 696: iload 56
// 698: ifeq 73c
// 69b: ifeq 71e
// 69e: goto 6ab
// 6a1: ldc2_w -7853648756463760975
// 6a4: lload 1
// 6a5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6aa: athrow
// 6ab: lload 1
// 6ac: lconst_0
// 6ad: lcmp
// 6ae: iflt 71e
// 6b1: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 6b4: lload 35
// 6b6: invokestatic su/catlean/ex.D (Lsu/catlean/ex;J)Lsu/catlean/cy;
// 6b9: getstatic su/catlean/cy.GRIM Lsu/catlean/cy;
// 6bc: if_acmpne 71e
// 6bf: goto 6cc
// 6c2: ldc2_w -7853648756463760975
// 6c5: lload 1
// 6c6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6cb: athrow
// 6cc: aload 0
// 6cd: aload 0
// 6ce: getfield su/catlean/sy.x F
// 6d1: putfield su/catlean/sy.u F
// 6d4: aload 0
// 6d5: aload 0
// 6d6: getfield su/catlean/sy.x F
// 6d9: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 6dc: lload 14
// 6de: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 6e1: aload 0
// 6e2: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 6e5: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 6e8: dup
// 6e9: sipush 25129
// 6ec: ldc2_w 2951183640232005363
// 6ef: lload 1
// 6f0: lxor
// 6f1: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6f9: aload 0
// 6fa: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 6fd: iload 60
// 6ff: lload 16
// 701: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 704: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 707: lload 18
// 709: dup2_x1
// 70a: pop2
// 70b: invokestatic su/catlean/ex.K (Lsu/catlean/ex;Lnet/minecraft/class_2680;Lnet/minecraft/class_2338;IJZ)F
// 70e: fadd
// 70f: putfield su/catlean/sy.x F
// 712: bipush 0
// 713: ireturn
// 714: ldc2_w -7853648756463760975
// 717: lload 1
// 718: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 71d: athrow
// 71e: aload 0
// 71f: iload 56
// 721: lload 1
// 722: lconst_0
// 723: lcmp
// 724: ifle 768
// 727: ifeq 766
// 72a: getfield su/catlean/sy.x F
// 72d: fconst_1
// 72e: fcmpl
// 72f: goto 73c
// 732: ldc2_w -7853648756463760975
// 735: lload 1
// 736: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73b: athrow
// 73c: lload 1
// 73d: lconst_0
// 73e: lcmp
// 73f: ifle 747
// 742: ifge 757
// 745: iload 59
// 747: ifeq ac5
// 74a: goto 757
// 74d: ldc2_w -7853648756463760975
// 750: lload 1
// 751: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 756: athrow
// 757: aload 58
// 759: goto 766
// 75c: ldc2_w -7853648756463760975
// 75f: lload 1
// 760: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 765: athrow
// 766: iload 56
// 768: ifeq 77d
// 76b: ifnull 88b
// 76e: goto 77b
// 771: ldc2_w -7853648756463760975
// 774: lload 1
// 775: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 77a: athrow
// 77b: aload 58
// 77d: aload 0
// 77e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 781: ifeq 88b
// 784: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 787: invokevirtual su/catlean/ex.Fn ()Ljava/util/LinkedList;
// 78a: checkcast java/lang/Iterable
// 78d: astore 61
// 78f: bipush 0
// 790: istore 62
// 792: aload 61
// 794: instanceof java/util/Collection
// 797: iload 56
// 799: ifeq 7e7
// 79c: ifeq 7e6
// 79f: goto 7ac
// 7a2: ldc2_w -7853648756463760975
// 7a5: lload 1
// 7a6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7ab: athrow
// 7ac: aload 61
// 7ae: checkcast java/util/Collection
// 7b1: invokeinterface java/util/Collection.isEmpty ()Z 1
// 7b6: iload 56
// 7b8: ifeq 7e7
// 7bb: goto 7c8
// 7be: ldc2_w -7853648756463760975
// 7c1: lload 1
// 7c2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7c7: athrow
// 7c8: ifeq 7e6
// 7cb: goto 7d8
// 7ce: ldc2_w -7853648756463760975
// 7d1: lload 1
// 7d2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d7: athrow
// 7d8: bipush 0
// 7d9: goto 887
// 7dc: ldc2_w -7853648756463760975
// 7df: lload 1
// 7e0: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e5: athrow
// 7e6: bipush 0
// 7e7: istore 63
// 7e9: aload 61
// 7eb: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 7f0: astore 64
// 7f2: aload 64
// 7f4: invokeinterface java/util/Iterator.hasNext ()Z 1
// 7f9: ifeq 87f
// 7fc: aload 64
// 7fe: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 803: astore 65
// 805: aload 65
// 807: checkcast su/catlean/sy
// 80a: astore 66
// 80c: bipush 0
// 80d: istore 67
// 80f: lload 14
// 811: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 814: aload 66
// 816: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 819: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 81c: iload 56
// 81e: lload 1
// 81f: lconst_0
// 820: lcmp
// 821: iflt 888
// 824: ifeq 887
// 827: iload 56
// 829: ifeq 84a
// 82c: goto 839
// 82f: ldc2_w -7853648756463760975
// 832: lload 1
// 833: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 838: athrow
// 839: ifne 84d
// 83c: goto 849
// 83f: ldc2_w -7853648756463760975
// 842: lload 1
// 843: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 848: athrow
// 849: bipush 1
// 84a: goto 84e
// 84d: bipush 0
// 84e: ifeq 7f2
// 851: iinc 63 1
// 854: iload 56
// 856: lload 1
// 857: lconst_0
// 858: lcmp
// 859: ifle 87c
// 85c: ifeq 87a
// 85f: iload 63
// 861: lload 1
// 862: lconst_0
// 863: lcmp
// 864: iflt 7f9
// 867: ifge 7f2
// 86a: goto 877
// 86d: ldc2_w -7853648756463760975
// 870: lload 1
// 871: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 876: athrow
// 877: invokestatic kotlin/collections/CollectionsKt.throwCountOverflow ()V
// 87a: iload 56
// 87c: ifne 7f2
// 87f: lload 1
// 880: lconst_0
// 881: lcmp
// 882: iflt b0b
// 885: iload 63
// 887: bipush 2
// 888: if_icmpeq b0b
// 88b: lload 14
// 88d: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 890: aload 0
// 891: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 894: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// 897: dup
// 898: sipush 25129
// 89b: ldc2_w 2951183640232005363
// 89e: lload 1
// 89f: lxor
// 8a0: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8a5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 8a8: astore 61
// 8aa: aload 61
// 8ac: invokevirtual net/minecraft/class_2680.method_26215 ()Z
// 8af: iload 56
// 8b1: ifeq b0c
// 8b4: ifne b0b
// 8b7: goto 8c4
// 8ba: ldc2_w -7853648756463760975
// 8bd: lload 1
// 8be: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8c3: athrow
// 8c4: aload 61
// 8c6: invokevirtual net/minecraft/class_2680.method_51176 ()Z
// 8c9: iload 56
// 8cb: ifeq b0c
// 8ce: goto 8db
// 8d1: ldc2_w -7853648756463760975
// 8d4: lload 1
// 8d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8da: athrow
// 8db: ifne b0b
// 8de: goto 8eb
// 8e1: ldc2_w -7853648756463760975
// 8e4: lload 1
// 8e5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 8ea: athrow
// 8eb: invokestatic su/catlean/ex.s ()Ljava/util/concurrent/ConcurrentHashMap;
// 8ee: aload 0
// 8ef: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 8f2: invokevirtual java/util/concurrent/ConcurrentHashMap.containsKey (Ljava/lang/Object;)Z
// 8f5: iload 56
// 8f7: lload 1
// 8f8: lconst_0
// 8f9: lcmp
// 8fa: iflt 964
// 8fd: ifeq 962
// 900: goto 90d
// 903: ldc2_w -7853648756463760975
// 906: lload 1
// 907: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 90c: athrow
// 90d: lload 1
// 90e: lconst_0
// 90f: lcmp
// 910: iflt 955
// 913: ifeq 94d
// 916: goto 923
// 919: ldc2_w -7853648756463760975
// 91c: lload 1
// 91d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 922: athrow
// 923: lload 47
// 925: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 928: invokestatic su/catlean/ex.a (JLsu/catlean/ex;)Z
// 92b: iload 56
// 92d: ifeq b0c
// 930: goto 93d
// 933: ldc2_w -7853648756463760975
// 936: lload 1
// 937: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 93c: athrow
// 93d: ifne b0b
// 940: goto 94d
// 943: ldc2_w -7853648756463760975
// 946: lload 1
// 947: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 94c: athrow
// 94d: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 950: lload 27
// 952: invokestatic su/catlean/ex.S (Lsu/catlean/ex;J)Z
// 955: goto 962
// 958: ldc2_w -7853648756463760975
// 95b: lload 1
// 95c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 961: athrow
// 962: iload 56
// 964: lload 1
// 965: lconst_0
// 966: lcmp
// 967: iflt a60
// 96a: ifeq a5e
// 96d: ifeq a5d
// 970: goto 97d
// 973: ldc2_w -7853648756463760975
// 976: lload 1
// 977: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 97c: athrow
// 97d: iload 3
// 97e: aload 0
// 97f: iload 60
// 981: aload 57
// 983: invokedynamic invoke (ZLsu/catlean/sy;ILnet/minecraft/class_2350;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/sy.C (ZLsu/catlean/sy;ILnet/minecraft/class_2350;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 988: astore 62
// 98a: getstatic su/catlean/_w.W Lsu/catlean/ye;
// 98d: aload 0
// 98e: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 991: invokevirtual net/minecraft/class_2338.method_46558 ()Lnet/minecraft/class_243;
// 994: dconst_0
// 995: ldc2_w 0.5
// 998: dconst_0
// 999: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
// 99c: dup
// 99d: sipush 18212
// 9a0: ldc2_w 7762174761376623611
// 9a3: lload 1
// 9a4: lxor
// 9a5: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9aa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 9ad: lload 37
// 9af: invokevirtual su/catlean/ye.I (Lnet/minecraft/class_243;J)Lsu/catlean/_w;
// 9b2: astore 63
// 9b4: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 9b7: lload 22
// 9b9: invokevirtual su/catlean/ex.T (J)Lsu/catlean/jp;
// 9bc: getstatic su/catlean/yr.h [I
// 9bf: swap
// 9c0: invokevirtual su/catlean/jp.ordinal ()I
// 9c3: iaload
// 9c4: tableswitch 133 1 3 28 69 98
// 9e0: new su/catlean/tu
// 9e3: dup
// 9e4: aload 63
// 9e6: bipush 10
// 9e8: ldc2_w 6826726670634649670
// 9eb: lload 1
// 9ec: lxor
// 9ed: invokedynamic k (IJ)I bsm=su/catlean/sy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9f2: aload 62
// 9f4: lload 7
// 9f6: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;ILkotlin/jvm/functions/Function0;J)V
// 9f9: checkcast su/catlean/t5
// 9fc: goto a51
// 9ff: ldc2_w -7853648756463760975
// a02: lload 1
// a03: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a08: athrow
// a09: new su/catlean/t5
// a0c: dup
// a0d: aload 63
// a0f: lload 49
// a11: sipush 14966
// a14: ldc2_w 6354885656324846136
// a17: lload 1
// a18: lxor
// a19: invokedynamic k (IJ)I bsm=su/catlean/sy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a1e: aload 62
// a20: invokespecial su/catlean/t5.<init> (Lsu/catlean/_w;JILkotlin/jvm/functions/Function0;)V
// a23: goto a51
// a26: new su/catlean/ty
// a29: dup
// a2a: iload 53
// a2c: i2s
// a2d: aload 63
// a2f: sipush 14966
// a32: ldc2_w 6354885656324846136
// a35: lload 1
// a36: lxor
// a37: invokedynamic k (IJ)I bsm=su/catlean/sy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a3c: aload 62
// a3e: lload 54
// a40: invokespecial su/catlean/ty.<init> (SLsu/catlean/_w;ILkotlin/jvm/functions/Function0;J)V
// a43: checkcast su/catlean/t5
// a46: goto a51
// a49: new kotlin/NoWhenBranchMatchedException
// a4c: dup
// a4d: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// a50: athrow
// a51: astore 64
// a53: getstatic su/catlean/_8.P Lsu/catlean/_8;
// a56: lload 12
// a58: aload 64
// a5a: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// a5d: iload 3
// a5e: iload 56
// a60: lload 1
// a61: lconst_0
// a62: lcmp
// a63: iflt a90
// a66: ifeq a8e
// a69: ifne aa3
// a6c: goto a79
// a6f: ldc2_w -7853648756463760975
// a72: lload 1
// a73: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a78: athrow
// a79: getstatic su/catlean/ex.c Lsu/catlean/ex;
// a7c: lload 27
// a7e: invokestatic su/catlean/ex.S (Lsu/catlean/ex;J)Z
// a81: goto a8e
// a84: ldc2_w -7853648756463760975
// a87: lload 1
// a88: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// a8d: athrow
// a8e: iload 56
// a90: ifeq b0c
// a93: ifne b0b
// a96: goto aa3
// a99: ldc2_w -7853648756463760975
// a9c: lload 1
// a9d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aa2: athrow
// aa3: aload 0
// aa4: iload 60
// aa6: lload 16
// aa8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// aab: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// aae: invokevirtual net/minecraft/class_1661.method_67532 ()I
// ab1: aload 57
// ab3: lload 29
// ab5: invokespecial su/catlean/sy.S (IILnet/minecraft/class_2350;J)V
// ab8: goto b0b
// abb: ldc2_w -7853648756463760975
// abe: lload 1
// abf: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// ac4: athrow
// ac5: aload 0
// ac6: aload 0
// ac7: getfield su/catlean/sy.x F
// aca: putfield su/catlean/sy.u F
// acd: aload 0
// ace: aload 0
// acf: getfield su/catlean/sy.x F
// ad2: getstatic su/catlean/ex.c Lsu/catlean/ex;
// ad5: lload 14
// ad7: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// ada: aload 0
// adb: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// ade: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
// ae1: dup
// ae2: sipush 25129
// ae5: ldc2_w 2951183640232005363
// ae8: lload 1
// ae9: lxor
// aea: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// aef: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// af2: aload 0
// af3: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// af6: iload 60
// af8: lload 16
// afa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// afd: invokevirtual net/minecraft/class_746.method_24828 ()Z
// b00: lload 18
// b02: dup2_x1
// b03: pop2
// b04: invokestatic su/catlean/ex.K (Lsu/catlean/ex;Lnet/minecraft/class_2680;Lnet/minecraft/class_2338;IJZ)F
// b07: fadd
// b08: putfield su/catlean/sy.x F
// b0b: bipush 0
// b0c: ireturn
}

public static boolean Y(short var0, int var1, sy var2, boolean var3, int var4, Object var5, short var6) {
long var7 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
long var9 = var7 ^ 139348867122429L;
int var11 = vm.a<"Å">(-4667839051543858026L, var7);

try {
int var10000 = var4 & 1;
if (var11 == 0) {
return (boolean)var10000;
}

if (var10000 == 0) {
return var2.x(var9, var3);
}
} catch (NoWhenBranchMatchedException var12) {
throw vm.a<"Å">(var12, -4677534975569746523L, var7);
}

var3 = false;
return var2.x(var9, var3);
}

public final boolean v(short param1, int param2, int param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 48
// 012: lshl
// 013: bipush 48
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/sy.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 121488305439374
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 53500536328360
// 02a: lxor
// 02b: lstore 8
// 02d: dup2
// 02e: ldc2_w 138902046951184
// 031: lxor
// 032: lstore 10
// 034: dup2
// 035: ldc2_w 130858268692497
// 038: lxor
// 039: lstore 12
// 03b: pop2
// 03c: ldc2_w 6115482134930448240
// 03f: lload 4
// 041: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 046: istore 14
// 048: aload 0
// 049: getfield su/catlean/sy.b I
// 04c: ifle 188
// 04f: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 052: iload 3
// 053: ifle 093
// 056: iload 14
// 058: ifeq 093
// 05b: goto 069
// 05e: ldc2_w 6120393252928343619
// 061: lload 4
// 063: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 068: athrow
// 069: lload 6
// 06b: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 06e: getstatic su/catlean/d0.GRIM Lsu/catlean/d0;
// 071: if_acmpne 188
// 074: goto 082
// 077: ldc2_w 6120393252928343619
// 07a: lload 4
// 07c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 081: athrow
// 082: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 085: goto 093
// 088: ldc2_w 6120393252928343619
// 08b: lload 4
// 08d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 092: athrow
// 093: aload 0
// 094: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 097: lload 10
// 099: dup2_x2
// 09a: pop2
// 09b: invokestatic su/catlean/ex.T (JLsu/catlean/ex;Lnet/minecraft/class_2338;)Z
// 09e: iload 14
// 0a0: ifeq 132
// 0a3: ifeq 11a
// 0a6: goto 0b4
// 0a9: ldc2_w 6120393252928343619
// 0ac: lload 4
// 0ae: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: athrow
// 0b4: lload 8
// 0b6: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0b9: invokestatic su/catlean/ex.g (JLsu/catlean/ex;)Z
// 0bc: iload 14
// 0be: ifeq 132
// 0c1: goto 0cf
// 0c4: ldc2_w 6120393252928343619
// 0c7: lload 4
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: iload 3
// 0d0: iflt 124
// 0d3: ifeq 11a
// 0d6: goto 0e4
// 0d9: ldc2_w 6120393252928343619
// 0dc: lload 4
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: getstatic su/catlean/j2.X Lsu/catlean/j2;
// 0e7: aload 0
// 0e8: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 0eb: lload 12
// 0ed: dup2_x1
// 0ee: pop2
// 0ef: invokevirtual su/catlean/j2.g (JLnet/minecraft/class_2338;)Z
// 0f2: iload 14
// 0f4: iload 1
// 0f5: iflt 134
// 0f8: ifeq 132
// 0fb: goto 109
// 0fe: ldc2_w 6120393252928343619
// 101: lload 4
// 103: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 108: athrow
// 109: ifeq 188
// 10c: goto 11a
// 10f: ldc2_w 6120393252928343619
// 112: lload 4
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: aload 0
// 11b: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 11e: invokestatic su/catlean/ex.FO ()Lnet/minecraft/class_2338;
// 121: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 124: goto 132
// 127: ldc2_w 6120393252928343619
// 12a: lload 4
// 12c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: athrow
// 132: iload 14
// 134: ifeq 185
// 137: ifne 176
// 13a: goto 148
// 13d: ldc2_w 6120393252928343619
// 140: lload 4
// 142: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: athrow
// 148: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 14b: invokevirtual su/catlean/ex.Fn ()Ljava/util/LinkedList;
// 14e: invokevirtual java/util/LinkedList.size ()I
// 151: iload 14
// 153: ifeq 185
// 156: goto 164
// 159: ldc2_w 6120393252928343619
// 15c: lload 4
// 15e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 163: athrow
// 164: bipush 1
// 165: if_icmpgt 188
// 168: goto 176
// 16b: ldc2_w 6120393252928343619
// 16e: lload 4
// 170: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: athrow
// 176: bipush 1
// 177: goto 185
// 17a: ldc2_w 6120393252928343619
// 17d: lload 4
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: goto 189
// 188: bipush 0
// 189: ireturn
}

private final void S(int param1, int param2, class_2350 param3, long param4) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sy.a J
// 003: lload 4
// 005: lxor
// 006: lstore 4
// 008: lload 4
// 00a: dup2
// 00b: ldc2_w 7510941814812
// 00e: lxor
// 00f: dup2
// 010: bipush 16
// 012: lushr
// 013: lstore 6
// 015: dup2
// 016: bipush 48
// 018: lshl
// 019: bipush 48
// 01b: lushr
// 01c: l2i
// 01d: istore 8
// 01f: pop2
// 020: dup2
// 021: ldc2_w 112836328969805
// 024: lxor
// 025: lstore 9
// 027: dup2
// 028: ldc2_w 111243167374834
// 02b: lxor
// 02c: lstore 11
// 02e: dup2
// 02f: ldc2_w 27827517697587
// 032: lxor
// 033: lstore 13
// 035: dup2
// 036: ldc2_w 87959738590757
// 039: lxor
// 03a: lstore 15
// 03c: dup2
// 03d: ldc2_w 99451284875141
// 040: lxor
// 041: lstore 17
// 043: dup2
// 044: ldc2_w 52517374049973
// 047: lxor
// 048: lstore 19
// 04a: pop2
// 04b: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 04e: iload 1
// 04f: lload 6
// 051: iload 8
// 053: i2s
// 054: bipush -1
// 055: invokestatic su/catlean/ex.C (Lsu/catlean/ex;IJSI)V
// 058: ldc2_w 4619996643926920115
// 05b: lload 4
// 05d: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 065: invokevirtual su/catlean/ex.P ()Ljava/util/concurrent/atomic/AtomicBoolean;
// 068: bipush 1
// 069: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set (Z)V
// 06c: istore 21
// 06e: aload 0
// 06f: aload 3
// 070: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.T (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 075: lload 13
// 077: dup2_x1
// 078: pop2
// 079: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 07c: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 07f: lload 9
// 081: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 084: iload 21
// 086: ifeq 0f7
// 089: getstatic su/catlean/d0.NCP_AIR Lsu/catlean/d0;
// 08c: if_acmpne 0e2
// 08f: goto 09d
// 092: ldc2_w 4626052089388849792
// 095: lload 4
// 097: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09c: athrow
// 09d: new net/minecraft/class_2846
// 0a0: dup
// 0a1: getstatic net/minecraft/class_2846$class_2847.field_12971 Lnet/minecraft/class_2846$class_2847;
// 0a4: aload 0
// 0a5: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 0a8: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 0ab: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 0ae: checkcast net/minecraft/class_2596
// 0b1: lload 15
// 0b3: dup2_x1
// 0b4: pop2
// 0b5: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 0b8: aload 0
// 0b9: aload 3
// 0ba: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.Q (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 0bf: lload 13
// 0c1: dup2_x1
// 0c2: pop2
// 0c3: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 0c6: aload 0
// 0c7: aload 3
// 0c8: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.o (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 0cd: lload 13
// 0cf: dup2_x1
// 0d0: pop2
// 0d1: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 0d4: goto 0e2
// 0d7: ldc2_w 4626052089388849792
// 0da: lload 4
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: getstatic su/catlean/ux.X Lsu/catlean/ux;
// 0e5: invokevirtual su/catlean/ux.N5 ()Ljava/util/Map;
// 0e8: aload 0
// 0e9: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 0ec: invokestatic su/catlean/zf.A ()J
// 0ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 0f2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 0f7: pop
// 0f8: aload 0
// 0f9: getfield su/catlean/sy.l Ljava/util/ArrayDeque;
// 0fc: invokevirtual java/util/ArrayDeque.clear ()V
// 0ff: new net/minecraft/class_2879
// 102: dup
// 103: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 106: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 109: checkcast net/minecraft/class_2596
// 10c: lload 15
// 10e: dup2_x1
// 10f: pop2
// 110: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 113: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 116: lload 19
// 118: invokevirtual su/catlean/ex.x (J)Z
// 11b: iload 21
// 11d: lload 4
// 11f: lconst_0
// 120: lcmp
// 121: iflt 179
// 124: ifeq 177
// 127: ifeq 161
// 12a: goto 138
// 12d: ldc2_w 4626052089388849792
// 130: lload 4
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: aload 0
// 139: getfield su/catlean/sy.b I
// 13c: iload 21
// 13e: ifeq 18e
// 141: goto 14f
// 144: ldc2_w 4626052089388849792
// 147: lload 4
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: bipush 1
// 150: if_icmplt 18d
// 153: goto 161
// 156: ldc2_w 4626052089388849792
// 159: lload 4
// 15b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 160: athrow
// 161: lload 11
// 163: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 166: invokestatic su/catlean/ex.T (JLsu/catlean/ex;)Z
// 169: goto 177
// 16c: ldc2_w 4626052089388849792
// 16f: lload 4
// 171: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: athrow
// 177: iload 21
// 179: ifeq 18e
// 17c: ifeq 191
// 17f: goto 18d
// 182: ldc2_w 4626052089388849792
// 185: lload 4
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: bipush 1
// 18e: goto 192
// 191: bipush 0
// 192: istore 22
// 194: iload 21
// 196: lload 4
// 198: lconst_0
// 199: lcmp
// 19a: ifle 1e5
// 19d: ifeq 1e3
// 1a0: iload 22
// 1a2: ifeq 1ef
// 1a5: goto 1b3
// 1a8: ldc2_w 4626052089388849792
// 1ab: lload 4
// 1ad: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b2: athrow
// 1b3: getstatic su/catlean/o8.g Lsu/catlean/o8;
// 1b6: lload 17
// 1b8: iload 22
// 1ba: bipush 0
// 1bb: bipush 0
// 1bc: iload 2
// 1bd: iload 1
// 1be: invokedynamic run (II)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, su/catlean/sy.N (II)V, ()V ]
// 1c3: sipush 6217
// 1c6: ldc2_w 2098025872425960241
// 1c9: lload 4
// 1cb: lxor
// 1cc: invokedynamic k (IJ)I bsm=su/catlean/sy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d1: aconst_null
// 1d2: invokestatic su/catlean/o8.p (Lsu/catlean/o8;JIBZLjava/lang/Runnable;ILjava/lang/Object;)V
// 1d5: goto 1e3
// 1d8: ldc2_w 4626052089388849792
// 1db: lload 4
// 1dd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e2: athrow
// 1e3: iload 21
// 1e5: lload 4
// 1e7: lconst_0
// 1e8: lcmp
// 1e9: iflt 21f
// 1ec: ifne 20a
// 1ef: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 1f2: iload 2
// 1f3: lload 6
// 1f5: iload 8
// 1f7: i2s
// 1f8: iload 1
// 1f9: invokestatic su/catlean/ex.C (Lsu/catlean/ex;IJSI)V
// 1fc: goto 20a
// 1ff: ldc2_w 4626052089388849792
// 202: lload 4
// 204: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 209: athrow
// 20a: invokestatic su/catlean/ex.FU ()Lsu/catlean/bg;
// 20d: invokevirtual su/catlean/bg.l ()V
// 210: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 213: pop
// 214: aload 0
// 215: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 218: invokestatic su/catlean/ex.a (Lnet/minecraft/class_2338;)V
// 21b: aload 0
// 21c: getfield su/catlean/sy.b I
// 21f: istore 23
// 221: aload 0
// 222: iload 23
// 224: bipush 1
// 225: iadd
// 226: putfield su/catlean/sy.b I
// 229: invokestatic su/catlean/ex.s ()Ljava/util/concurrent/ConcurrentHashMap;
// 22c: checkcast java/util/Map
// 22f: aload 0
// 230: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 233: invokestatic su/catlean/zf.A ()J
// 236: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
// 239: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
// 23e: pop
// 23f: aload 0
// 240: fconst_0
// 241: putfield su/catlean/sy.u F
// 244: aload 0
// 245: aload 0
// 246: getfield su/catlean/sy.u F
// 249: putfield su/catlean/sy.x F
// 24c: return
}

public final void a(long a, @NotNull ii reason) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/sy.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 43421741896988
// 00b: lxor
// 00c: dup2
// 00d: bipush 32
// 00f: lushr
// 010: l2i
// 011: istore 4
// 013: dup2
// 014: bipush 32
// 016: lshl
// 017: bipush 32
// 019: lushr
// 01a: l2i
// 01b: istore 5
// 01d: pop2
// 01e: dup2
// 01f: ldc2_w 21215835102545
// 022: lxor
// 023: lstore 6
// 025: dup2
// 026: ldc2_w 5174562198082
// 029: lxor
// 02a: lstore 8
// 02c: dup2
// 02d: ldc2_w 52301735717064
// 030: lxor
// 031: lstore 10
// 033: dup2
// 034: ldc2_w 135669761567292
// 037: lxor
// 038: lstore 12
// 03a: dup2
// 03b: ldc2_w 50391547273770
// 03e: lxor
// 03f: lstore 14
// 041: dup2
// 042: ldc2_w 50055634343535
// 045: lxor
// 046: lstore 16
// 048: pop2
// 049: ldc2_w 293547971981447100
// 04c: lload 1
// 04d: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: aload 3
// 053: sipush 22231
// 056: ldc2_w 839367308773010743
// 059: lload 1
// 05a: lxor
// 05b: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 060: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 063: istore 18
// 065: aload 0
// 066: getfield su/catlean/sy.l Ljava/util/ArrayDeque;
// 069: invokevirtual java/util/ArrayDeque.clear ()V
// 06c: getstatic su/catlean/gw.Y Lsu/catlean/gw;
// 06f: aload 0
// 070: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 073: iload 4
// 075: swap
// 076: iload 5
// 078: invokevirtual su/catlean/gw.M (ILnet/minecraft/class_2338;I)Ljava/util/List;
// 07b: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/util/List;)Ljava/lang/Object;
// 07e: checkcast net/minecraft/class_2350
// 081: dup
// 082: iload 18
// 084: ifeq 0ae
// 087: ifnonnull 0be
// 08a: goto 097
// 08d: ldc2_w 305237581321641615
// 090: lload 1
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: pop
// 098: lload 16
// 09a: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09d: invokevirtual net/minecraft/class_746.method_5735 ()Lnet/minecraft/class_2350;
// 0a0: dup
// 0a1: goto 0ae
// 0a4: ldc2_w 305237581321641615
// 0a7: lload 1
// 0a8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ad: athrow
// 0ae: sipush 25156
// 0b1: ldc2_w 4781170260419778977
// 0b4: lload 1
// 0b5: lxor
// 0b6: invokedynamic o (IJ)Ljava/lang/String; bsm=su/catlean/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bb: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0be: astore 19
// 0c0: aload 3
// 0c1: getstatic su/catlean/ii.SWITCH Lsu/catlean/ii;
// 0c4: if_acmpne 13d
// 0c7: getstatic su/catlean/ex.c Lsu/catlean/ex;
// 0ca: lload 8
// 0cc: invokevirtual su/catlean/ex.D (J)Lsu/catlean/d0;
// 0cf: getstatic su/catlean/d0.NCP_AIR Lsu/catlean/d0;
// 0d2: if_acmpne 13d
// 0d5: goto 0e2
// 0d8: ldc2_w 305237581321641615
// 0db: lload 1
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: lload 10
// 0e4: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 0e7: aload 0
// 0e8: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 0eb: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 0ee: iload 18
// 0f0: lload 1
// 0f1: lconst_0
// 0f2: lcmp
// 0f3: ifle 145
// 0f6: ifeq 143
// 0f9: goto 106
// 0fc: ldc2_w 305237581321641615
// 0ff: lload 1
// 100: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: athrow
// 106: ifeq 13d
// 109: goto 116
// 10c: ldc2_w 305237581321641615
// 10f: lload 1
// 110: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 115: athrow
// 116: aload 0
// 117: fconst_0
// 118: putfield su/catlean/sy.x F
// 11b: aload 0
// 11c: aload 0
// 11d: getfield su/catlean/sy.x F
// 120: putfield su/catlean/sy.u F
// 123: aload 0
// 124: aload 19
// 126: invokedynamic predict (Lsu/catlean/sy;Lnet/minecraft/class_2350;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/sy.v (Lsu/catlean/sy;Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 12b: lload 12
// 12d: dup2_x1
// 12e: pop2
// 12f: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 132: return
// 133: ldc2_w 305237581321641615
// 136: lload 1
// 137: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13c: athrow
// 13d: aload 0
// 13e: getfield su/catlean/sy.x F
// 141: fconst_0
// 142: fcmpg
// 143: iload 18
// 145: ifeq 159
// 148: ifne 15c
// 14b: goto 158
// 14e: ldc2_w 305237581321641615
// 151: lload 1
// 152: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: athrow
// 158: bipush 1
// 159: goto 15d
// 15c: bipush 0
// 15d: ifeq 161
// 160: return
// 161: aload 0
// 162: fconst_0
// 163: putfield su/catlean/sy.x F
// 166: aload 0
// 167: aload 0
// 168: getfield su/catlean/sy.x F
// 16b: putfield su/catlean/sy.u F
// 16e: new net/minecraft/class_2846
// 171: dup
// 172: getstatic net/minecraft/class_2846$class_2847.field_12971 Lnet/minecraft/class_2846$class_2847;
// 175: aload 0
// 176: getfield su/catlean/sy.f Lnet/minecraft/class_2338;
// 179: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
// 17c: invokespecial net/minecraft/class_2846.<init> (Lnet/minecraft/class_2846$class_2847;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)V
// 17f: checkcast net/minecraft/class_2596
// 182: lload 14
// 184: dup2_x1
// 185: pop2
// 186: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 189: aload 0
// 18a: aload 19
// 18c: lload 6
// 18e: invokevirtual su/catlean/sy.l (Lnet/minecraft/class_2350;J)V
// 191: lload 1
// 192: lconst_0
// 193: lcmp
// 194: iflt 1b1
// 197: ldc2_w 311170904263498432
// 19a: lload 1
// 19b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a0: ifnull 1be
// 1a3: iinc 18 1
// 1a6: iload 18
// 1a8: ldc2_w 288555438179936401
// 1ab: lload 1
// 1ac: invokedynamic Å (IJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b1: goto 1be
// 1b4: ldc2_w 305237581321641615
// 1b7: lload 1
// 1b8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bd: athrow
// 1be: return
}

public final void T(long var1, byte var3) {
long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
long var6 = var4 ^ 129533743281981L;
int var10000 = vm.a<"Å">(5838279512013068971L, var4);
this.l.clear();
int var8 = var10000;

label30: {
label29: {
try {
float var12;
var10000 = (var12 = this.x - 0.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
if (var8 == 0) {
break label30;
}

if (!var10000) {
break label29;
}
} catch (NoWhenBranchMatchedException var10) {
throw vm.a<"Å">(var10, 5848825635551693720L, var4);
}

var10000 = 0;
break label30;
}

var10000 = 1;
}

try {
if (!var10000) {
_r.a(var6, (class_2596)(new class_2846(class_2847.field_12971, this.f, class_2350.field_11033)));
}
} catch (NoWhenBranchMatchedException var9) {
throw vm.a<"Å">(var9, 5848825635551693720L, var4);
}
}

private static final class_2596 h(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12968, var0.f, var1, var2));
}

private static final class_2596 m(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12973, var0.f, var1, var2));
}

private static final class_2596 a(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12968, var0.f, var1, var2));
}

private static final class_2596 M(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12973, var0.f, var1, var2));
}

private static final class_2596 N(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12968, var0.f, var1, var2));
}

private static final class_2596 s(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12973, var0.f, var1, var2));
}

private static final void c(int var0, int var1) {
long var2 = a ^ 78459809300662L;
long var4 = (var2 ^ 139926431086924L) >>> 16;
int var6 = (int)((var2 ^ 139926431086924L) << 48 >>> 48);
ex.C(ex.c, var0, var4, (short)var6, var1);
ex.c.P().set(false);
}

private static final Unit C(boolean var0, sy var1, int var2, class_2350 var3) {
long var4 = a ^ 78755919579962L;
long var6 = var4 ^ 58797010717237L;
long var8 = var4 ^ 60204892958908L;

try {
if (!var0) {
var1.S(var2, zf.v(var8).method_31548().method_67532(), var3, var6);
}
} catch (NoWhenBranchMatchedException var10) {
throw vm.a<"Å">(var10, -2094331394283440036L, var4);
}

return Unit.INSTANCE;
}

private static final class_2596 T(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12973, var0.f, var1, var2));
}

private static final class_2596 Q(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12973, var0.f, var1, var2));
}

private static final class_2596 o(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12968, var0.f, var1, var2));
}

private static final void N(int var0, int var1) {
long var2 = a ^ 138369141561683L;
long var4 = (var2 ^ 76692608508073L) >>> 16;
int var6 = (int)((var2 ^ 76692608508073L) << 48 >>> 48);
ex.C(ex.c, var0, var4, (short)var6, var1);
}

private static final class_2596 v(sy var0, class_2350 var1, int var2) {
return (class_2596)(new class_2846(class_2847.field_12968, var0.f, var1, var2));
}

public static void Q(int var0) {
t = var0;
}

public static int n() {
return t;
}

public static int D() {
int var0 = n();

try {
return var0 == 0 ? 114 : 0;
} catch (NoWhenBranchMatchedException var1) {
throw a(var1);
}
}

static {
long var20 = a ^ 79451546707292L;
vm.a<"Å">(0, 5527098724663992356L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[7];
int var16 = 0;
String var15 = "\u0091\u0005ÝBCÆ+v\r+ü\u001bTl\u0015!üÎ½aX\u008dN\\£êLN\u009aÈ\u008e³Ñc\u000eÈÅì\u0017\u00ad(c»ü\u0083KØGþ\f(\u0097ÑF}\u0089\u0092\u0019±jOK£òb®+å«åÒK}a>ªé_¶µ²\u0010\u00ad>\u0014Ðö\\\u0001É\"óÉµ-\n\u000f©(M-t\u0080ý6\u009d®a@´îÖà\u009awtÀ@\u0017C\u001eæäXÊg\u0005\u001bTt³Ä¼\u0000º\u0019A®\u0018 ÑPya<ë\u0087á×Ü-ªNà\\|Õ=\u009b\\7\u0003Ji\u0013\u0005\u0000Z\tj\u0093Õ";
int var17 = "\u0091\u0005ÝBCÆ+v\r+ü\u001bTl\u0015!üÎ½aX\u008dN\\£êLN\u009aÈ\u008e³Ñc\u000eÈÅì\u0017\u00ad(c»ü\u0083KØGþ\f(\u0097ÑF}\u0089\u0092\u0019±jOK£òb®+å«åÒK}a>ªé_¶µ²\u0010\u00ad>\u0014Ðö\\\u0001É\"óÉµ-\n\u000f©(M-t\u0080ý6\u009d®a@´îÖà\u009awtÀ@\u0017C\u001eæäXÊg\u0005\u001bTt³Ä¼\u0000º\u0019A®\u0018 ÑPya<ë\u0087á×Ü-ªNà\\|Õ=\u009b\\7\u0003Ji\u0013\u0005\u0000Z\tj\u0093Õ"
.length();
char var14 = '(';
int var24 = -1;

label54:
while (true) {
String var25 = var15.substring(++var24, var24 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var36;
if ((var24 += var14) >= var17) {
c = var18;
d = new String[7];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[6];
int var3 = 0;
String var4 = "ÎÌådê«\u0018ã$ÚÄ\u009b\u001f,Ì\u0019\u0003gÁT\u0010\u0012\u0005¦5tj³\u000eÝÄf";
int var5 = "ÎÌådê«\u0018ã$ÚÄ\u009b\u001f,Ì\u0019\u0003gÁT\u0010\u0012\u0005¦5tj³\u000eÝÄf".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var28 = var6;
var10001 = var3++;
long var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var43 = -1;

while (true) {
long var8 = var40;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var45 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var43) {
case 0:
var28[var10001] = var45;
if (var2 >= var5) {
g = var6;
h = new Integer[6];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u009cû3½\u0087{\u00977!öi\u0017¸*\u000f¯";
var5 = "\u009cû3½\u0087{\u00977!öi\u0017¸*\u000f¯".length();
var2 = 0;
}

byte var34 = var2;
var2 += 8;
var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
var28 = var6;
var10001 = var3++;
var40 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var43 = 0;
}
}
}

var14 = var15.charAt(var24);
break;
default:
var18[var16++] = var36;
if ((var24 += var14) < var17) {
var14 = var15.charAt(var24);
continue label54;
}

var15 = "óÜ«ýF\u008a\t¼\u0000hÙ,\u001e(¼k(ú\u0084\u009c~\u009b\u008e>0m1¡\u001aÃ\u009aD\u00932Û-³Ù\u0086\u008a\u009cG\u0082VºÌ$ä«ÎBã<ùni½";
var17 = "óÜ«ýF\u008a\t¼\u0000hÙ,\u001e(¼k(ú\u0084\u009c~\u009b\u008e>0m1¡\u001aÃ\u009aD\u00932Û-³Ù\u0086\u008a\u009cG\u0082VºÌ$ä«ÎBã<ùni½".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 32485;
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
throw new RuntimeException("su/catlean/sy", var10);
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
throw new RuntimeException("su/catlean/sy" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 6770;
if (h[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = g[var3];
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
throw new RuntimeException("su/catlean/sy", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/sy" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
