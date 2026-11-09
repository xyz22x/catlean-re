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
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;

public final class b7 {
@NotNull
private final a1 j;
private float C;
private float M;
private final int L;
private boolean Z;
@NotNull
private String w;
private static final long a = yz.a(-1535281206626056300L, 4328898319864735754L, MethodHandles.lookup().lookupClass()).a(101460224601739L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public b7(@NotNull a1 setting, float x, float y, int index, char a, short a, int a) {
long var8 = ((long)axxx << 48 | (long)ax << 48 >>> 16 | (long)axx << 32 >>> 32) ^ a;
Intrinsics.checkNotNullParameter(setting, a<"v">(6019, 7450894213757562345L ^ var8));
super();
this.j = setting;
this.C = x;
this.M = y;
this.L = index;
this.w = "-";
}

@NotNull
public final a1 y() {
return this.j;
}

public final float I() {
return this.C;
}

public final void K(float <set-?>) {
this.C = <set-?>;
}

public final float N() {
return this.M;
}

public final void h(float <set-?>) {
this.M = <set-?>;
}

public final int Q() {
return this.L;
}

public final void I(long a, @Nullable Matrix3x2fStack m, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/b7.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 86441264041573
// 00b: lxor
// 00c: dup2
// 00d: bipush 48
// 00f: lushr
// 010: l2i
// 011: istore 5
// 013: dup2
// 014: bipush 16
// 016: lshl
// 017: bipush 48
// 019: lushr
// 01a: l2i
// 01b: istore 6
// 01d: dup2
// 01e: bipush 32
// 020: lshl
// 021: bipush 32
// 023: lushr
// 024: l2i
// 025: istore 7
// 027: pop2
// 028: dup2
// 029: ldc2_w 52731685644733
// 02c: lxor
// 02d: lstore 8
// 02f: dup2
// 030: ldc2_w 54660237766160
// 033: lxor
// 034: lstore 10
// 036: dup2
// 037: ldc2_w 115396916612604
// 03a: lxor
// 03b: dup2
// 03c: bipush 48
// 03e: lushr
// 03f: l2i
// 040: istore 12
// 042: dup2
// 043: bipush 16
// 045: lshl
// 046: bipush 32
// 048: lushr
// 049: l2i
// 04a: istore 13
// 04c: dup2
// 04d: bipush 48
// 04f: lshl
// 050: bipush 48
// 052: lushr
// 053: l2i
// 054: istore 14
// 056: pop2
// 057: pop2
// 058: ldc2_w -1252477473857918717
// 05b: lload 1
// 05c: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 061: aload 4
// 063: sipush 10133
// 066: ldc2_w 2847497858842134591
// 069: lload 1
// 06a: lxor
// 06b: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/b7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 070: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 073: astore 16
// 075: aload 4
// 077: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 07a: dup
// 07b: sipush 14555
// 07e: ldc2_w 341891586350389104
// 081: lload 1
// 082: lxor
// 083: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/b7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08b: aload 0
// 08c: getfield su/catlean/b7.C F
// 08f: ldc 40.0
// 091: fadd
// 092: iload 5
// 094: i2c
// 095: swap
// 096: aload 0
// 097: getfield su/catlean/b7.M F
// 09a: ldc 10.0
// 09c: fadd
// 09d: aload 0
// 09e: getfield su/catlean/b7.L I
// 0a1: i2f
// 0a2: ldc 10.0
// 0a4: fmul
// 0a5: fadd
// 0a6: ldc 15.0
// 0a8: ldc 8.0
// 0aa: fconst_2
// 0ab: fconst_2
// 0ac: fconst_0
// 0ad: fconst_1
// 0ae: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0b1: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 0b4: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0b7: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 0ba: fconst_0
// 0bb: iload 6
// 0bd: i2s
// 0be: fconst_0
// 0bf: iload 7
// 0c1: fconst_0
// 0c2: sipush 5790
// 0c5: ldc2_w 9061888579673910634
// 0c8: lload 1
// 0c9: lxor
// 0ca: invokedynamic s (IJ)I bsm=su/catlean/b7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: aconst_null
// 0d0: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 0d3: lload 8
// 0d5: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 0d8: aload 4
// 0da: sipush 1535
// 0dd: ldc2_w 7278310891369835095
// 0e0: lload 1
// 0e1: lxor
// 0e2: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/b7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: aload 0
// 0e8: getfield su/catlean/b7.L I
// 0eb: invokevirtual java/lang/String.charAt (I)C
// 0ee: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
// 0f1: aload 0
// 0f2: getfield su/catlean/b7.C F
// 0f5: ldc 34.0
// 0f7: fadd
// 0f8: aload 0
// 0f9: getfield su/catlean/b7.M F
// 0fc: ldc 13.5
// 0fe: fadd
// 0ff: aload 0
// 100: getfield su/catlean/b7.L I
// 103: i2f
// 104: ldc 10.0
// 106: fmul
// 107: fadd
// 108: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 10b: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 10e: lload 10
// 110: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 113: lload 8
// 115: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 118: aload 4
// 11a: aload 0
// 11b: getfield su/catlean/b7.Z Z
// 11e: aload 16
// 120: ifnull 145
// 123: ifeq 144
// 126: goto 133
// 129: ldc2_w -1193914051407332977
// 12c: lload 1
// 12d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 132: athrow
// 133: aload 0
// 134: getfield su/catlean/b7.w Ljava/lang/String;
// 137: goto 1b1
// 13a: ldc2_w -1193914051407332977
// 13d: lload 1
// 13e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 143: athrow
// 144: bipush 4
// 145: anewarray 345
// 148: astore 17
// 14a: aload 17
// 14c: bipush 0
// 14d: aload 0
// 14e: getfield su/catlean/b7.j Lsu/catlean/a1;
// 151: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 154: checkcast java/awt/Color
// 157: invokevirtual java/awt/Color.getRed ()I
// 15a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 15d: aastore
// 15e: aload 17
// 160: bipush 1
// 161: aload 0
// 162: getfield su/catlean/b7.j Lsu/catlean/a1;
// 165: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 168: checkcast java/awt/Color
// 16b: invokevirtual java/awt/Color.getGreen ()I
// 16e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 171: aastore
// 172: aload 17
// 174: bipush 2
// 175: aload 0
// 176: getfield su/catlean/b7.j Lsu/catlean/a1;
// 179: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 17c: checkcast java/awt/Color
// 17f: invokevirtual java/awt/Color.getBlue ()I
// 182: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 185: aastore
// 186: aload 17
// 188: bipush 3
// 189: aload 0
// 18a: getfield su/catlean/b7.j Lsu/catlean/a1;
// 18d: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 190: checkcast java/awt/Color
// 193: invokevirtual java/awt/Color.getAlpha ()I
// 196: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 199: aastore
// 19a: aload 17
// 19c: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 19f: aload 0
// 1a0: getfield su/catlean/b7.L I
// 1a3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 1a8: checkcast java/lang/Number
// 1ab: invokevirtual java/lang/Number.intValue ()I
// 1ae: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 1b1: aload 0
// 1b2: getfield su/catlean/b7.C F
// 1b5: ldc 47.0
// 1b7: fadd
// 1b8: aload 0
// 1b9: getfield su/catlean/b7.M F
// 1bc: ldc 13.0
// 1be: fadd
// 1bf: aload 0
// 1c0: getfield su/catlean/b7.L I
// 1c3: i2f
// 1c4: ldc 10.0
// 1c6: fmul
// 1c7: fadd
// 1c8: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1cb: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1ce: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 1d1: aload 0
// 1d2: getfield su/catlean/b7.Z Z
// 1d5: ifeq 1f4
// 1d8: invokestatic java/lang/System.currentTimeMillis ()J
// 1db: l2d
// 1dc: ldc2_w 50.0
// 1df: ddiv
// 1e0: invokestatic java/lang/Math.sin (D)D
// 1e3: d2f
// 1e4: ldc 0.5
// 1e6: fadd
// 1e7: goto 1f5
// 1ea: ldc2_w -1193914051407332977
// 1ed: lload 1
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: fconst_1
// 1f5: fstore 15
// 1f7: iload 12
// 1f9: i2c
// 1fa: iload 13
// 1fc: fload 15
// 1fe: iload 14
// 200: i2s
// 201: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 204: lload 10
// 206: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 209: return
}

public final void f(int mouseX, long a, int mouseY) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/b7.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: aload 0
// 007: getfield su/catlean/b7.C F
// 00a: ldc 40.0
// 00c: fadd
// 00d: fstore 6
// 00f: ldc2_w -2739770629470478745
// 012: lload 2
// 013: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 0
// 019: getfield su/catlean/b7.C F
// 01c: ldc 55.0
// 01e: fadd
// 01f: fstore 7
// 021: astore 5
// 023: iload 1
// 024: i2f
// 025: fstore 8
// 027: fload 6
// 029: fload 8
// 02b: fcmpg
// 02c: aload 5
// 02e: ifnull 053
// 031: ifgt 07a
// 034: goto 041
// 037: ldc2_w -2879363660841709845
// 03a: lload 2
// 03b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: athrow
// 041: fload 8
// 043: fload 7
// 045: fcmpg
// 046: goto 053
// 049: ldc2_w -2879363660841709845
// 04c: lload 2
// 04d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: athrow
// 053: aload 5
// 055: ifnull 077
// 058: ifgt 076
// 05b: goto 068
// 05e: ldc2_w -2879363660841709845
// 061: lload 2
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: bipush 1
// 069: goto 07b
// 06c: ldc2_w -2879363660841709845
// 06f: lload 2
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: bipush 0
// 077: goto 07b
// 07a: bipush 0
// 07b: ifeq 1a4
// 07e: aload 0
// 07f: getfield su/catlean/b7.M F
// 082: ldc 10.0
// 084: fadd
// 085: aload 0
// 086: getfield su/catlean/b7.L I
// 089: i2f
// 08a: ldc 10.0
// 08c: fmul
// 08d: fadd
// 08e: fstore 6
// 090: aload 0
// 091: getfield su/catlean/b7.M F
// 094: ldc 18.0
// 096: fadd
// 097: aload 0
// 098: getfield su/catlean/b7.L I
// 09b: i2f
// 09c: ldc 10.0
// 09e: fmul
// 09f: fadd
// 0a0: fstore 7
// 0a2: iload 4
// 0a4: i2f
// 0a5: fstore 8
// 0a7: fload 6
// 0a9: fload 8
// 0ab: fcmpg
// 0ac: aload 5
// 0ae: lload 2
// 0af: lconst_0
// 0b0: lcmp
// 0b1: iflt 0db
// 0b4: ifnull 0d9
// 0b7: ifgt 100
// 0ba: goto 0c7
// 0bd: ldc2_w -2879363660841709845
// 0c0: lload 2
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: fload 8
// 0c9: fload 7
// 0cb: fcmpg
// 0cc: goto 0d9
// 0cf: ldc2_w -2879363660841709845
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 5
// 0db: ifnull 0fd
// 0de: ifgt 0fc
// 0e1: goto 0ee
// 0e4: ldc2_w -2879363660841709845
// 0e7: lload 2
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: bipush 1
// 0ef: goto 101
// 0f2: ldc2_w -2879363660841709845
// 0f5: lload 2
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: bipush 0
// 0fd: goto 101
// 100: bipush 0
// 101: ifeq 1a4
// 104: aload 0
// 105: aload 0
// 106: getfield su/catlean/b7.Z Z
// 109: aload 5
// 10b: ifnull 12c
// 10e: goto 11b
// 111: ldc2_w -2879363660841709845
// 114: lload 2
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: ifne 12f
// 11e: goto 12b
// 121: ldc2_w -2879363660841709845
// 124: lload 2
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: bipush 1
// 12c: goto 130
// 12f: bipush 0
// 130: putfield su/catlean/b7.Z Z
// 133: aload 0
// 134: bipush 4
// 135: anewarray 345
// 138: astore 6
// 13a: aload 6
// 13c: bipush 0
// 13d: aload 0
// 13e: getfield su/catlean/b7.j Lsu/catlean/a1;
// 141: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 144: checkcast java/awt/Color
// 147: invokevirtual java/awt/Color.getRed ()I
// 14a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 14d: aastore
// 14e: aload 6
// 150: bipush 1
// 151: aload 0
// 152: getfield su/catlean/b7.j Lsu/catlean/a1;
// 155: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 158: checkcast java/awt/Color
// 15b: invokevirtual java/awt/Color.getGreen ()I
// 15e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 161: aastore
// 162: aload 6
// 164: bipush 2
// 165: aload 0
// 166: getfield su/catlean/b7.j Lsu/catlean/a1;
// 169: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 16c: checkcast java/awt/Color
// 16f: invokevirtual java/awt/Color.getBlue ()I
// 172: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 175: aastore
// 176: aload 6
// 178: bipush 3
// 179: aload 0
// 17a: getfield su/catlean/b7.j Lsu/catlean/a1;
// 17d: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 180: checkcast java/awt/Color
// 183: invokevirtual java/awt/Color.getAlpha ()I
// 186: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 189: aastore
// 18a: aload 6
// 18c: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 18f: aload 0
// 190: getfield su/catlean/b7.L I
// 193: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 198: checkcast java/lang/Number
// 19b: invokevirtual java/lang/Number.intValue ()I
// 19e: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 1a1: putfield su/catlean/b7.w Ljava/lang/String;
// 1a4: return
}

public final void G(char char, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/b7.a J
// 03: lload 2
// 04: lxor
// 05: lstore 2
// 06: ldc2_w -4781329270757230024
// 09: lload 2
// 0a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f: astore 4
// 11: aload 0
// 12: getfield su/catlean/b7.w Ljava/lang/String;
// 15: invokevirtual java/lang/String.length ()I
// 18: aload 4
// 1a: ifnull 51
// 1d: bipush 3
// 1e: if_icmpge 62
// 21: goto 2e
// 24: ldc2_w -4875888229194667340
// 27: lload 2
// 28: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d: athrow
// 2e: aload 0
// 2f: aload 4
// 31: ifnull 55
// 34: goto 41
// 37: ldc2_w -4875888229194667340
// 3a: lload 2
// 3b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40: athrow
// 41: getfield su/catlean/b7.Z Z
// 44: goto 51
// 47: ldc2_w -4875888229194667340
// 4a: lload 2
// 4b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 50: athrow
// 51: ifeq 62
// 54: aload 0
// 55: aload 0
// 56: getfield su/catlean/b7.w Ljava/lang/String;
// 59: iload 1
// 5a: invokedynamic makeConcatWithConstants (Ljava/lang/String;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 5f: putfield su/catlean/b7.w Ljava/lang/String;
// 62: return
}

public final void y(byte a, int key, long a) {
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
// 002: bipush 56
// 004: lshl
// 005: lload 3
// 006: bipush 8
// 008: lshl
// 009: bipush 8
// 00b: lushr
// 00c: lor
// 00d: getstatic su/catlean/b7.a J
// 010: lxor
// 011: lstore 5
// 013: ldc2_w 2481776690974942700
// 016: lload 5
// 018: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 01d: astore 7
// 01f: aload 0
// 020: getfield su/catlean/b7.Z Z
// 023: aload 7
// 025: ifnull 03a
// 028: ifeq 16b
// 02b: goto 039
// 02e: ldc2_w 2558354518377395552
// 031: lload 5
// 033: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 038: athrow
// 039: iload 2
// 03a: aload 7
// 03c: ifnull 082
// 03f: tableswitch 300 257 259 36 300 191
// 058: ldc2_w 2558354518377395552
// 05b: lload 5
// 05d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 062: athrow
// 063: aload 0
// 064: bipush 0
// 065: putfield su/catlean/b7.Z Z
// 068: nop
// 069: aload 0
// 06a: getfield su/catlean/b7.w Ljava/lang/String;
// 06d: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 070: bipush 0
// 071: sipush 16988
// 074: ldc2_w 7717688668447274309
// 077: lload 5
// 079: lxor
// 07a: invokedynamic s (IJ)I bsm=su/catlean/b7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: invokestatic net/minecraft/class_3532.method_15340 (III)I
// 082: istore 8
// 084: aload 0
// 085: getfield su/catlean/b7.j Lsu/catlean/a1;
// 088: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 08b: checkcast java/awt/Color
// 08e: astore 9
// 090: aload 0
// 091: getfield su/catlean/b7.j Lsu/catlean/a1;
// 094: new java/awt/Color
// 097: dup
// 098: aload 0
// 099: getfield su/catlean/b7.L I
// 09c: ifne 0af
// 09f: iload 8
// 0a1: goto 0b4
// 0a4: ldc2_w 2558354518377395552
// 0a7: lload 5
// 0a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: athrow
// 0af: aload 9
// 0b1: invokevirtual java/awt/Color.getRed ()I
// 0b4: aload 0
// 0b5: getfield su/catlean/b7.L I
// 0b8: bipush 1
// 0b9: if_icmpne 0c1
// 0bc: iload 8
// 0be: goto 0c6
// 0c1: aload 9
// 0c3: invokevirtual java/awt/Color.getGreen ()I
// 0c6: aload 0
// 0c7: getfield su/catlean/b7.L I
// 0ca: bipush 2
// 0cb: if_icmpne 0d3
// 0ce: iload 8
// 0d0: goto 0d8
// 0d3: aload 9
// 0d5: invokevirtual java/awt/Color.getBlue ()I
// 0d8: aload 0
// 0d9: getfield su/catlean/b7.L I
// 0dc: bipush 3
// 0dd: if_icmpne 0e5
// 0e0: iload 8
// 0e2: goto 0ea
// 0e5: aload 9
// 0e7: invokevirtual java/awt/Color.getAlpha ()I
// 0ea: invokespecial java/awt/Color.<init> (IIII)V
// 0ed: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 0f0: goto 16b
// 0f3: astore 8
// 0f5: iload 1
// 0f6: iflt 0fe
// 0f9: aload 7
// 0fb: ifnonnull 16b
// 0fe: aload 0
// 0ff: getfield su/catlean/b7.w Ljava/lang/String;
// 102: checkcast java/lang/CharSequence
// 105: invokeinterface java/lang/CharSequence.length ()I 1
// 10a: aload 7
// 10c: ifnull 12f
// 10f: goto 11d
// 112: ldc2_w 2558354518377395552
// 115: lload 5
// 117: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: athrow
// 11d: ifle 132
// 120: goto 12e
// 123: ldc2_w 2558354518377395552
// 126: lload 5
// 128: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: athrow
// 12e: bipush 1
// 12f: goto 133
// 132: bipush 0
// 133: ifeq 16b
// 136: aload 0
// 137: aload 0
// 138: getfield su/catlean/b7.w Ljava/lang/String;
// 13b: bipush 0
// 13c: aload 0
// 13d: getfield su/catlean/b7.w Ljava/lang/String;
// 140: invokevirtual java/lang/String.length ()I
// 143: bipush 1
// 144: isub
// 145: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
// 148: dup
// 149: sipush 14392
// 14c: ldc2_w 7533828191792028538
// 14f: lload 5
// 151: lxor
// 152: invokedynamic v (IJ)Ljava/lang/String; bsm=su/catlean/b7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 157: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 15a: putfield su/catlean/b7.w Ljava/lang/String;
// 15d: goto 16b
// 160: ldc2_w 2558354518377395552
// 163: lload 5
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: return
}

public final boolean d(double mouseX, double mouseY, double verticalAmount, long a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/b7.a J
// 003: lload 7
// 005: lxor
// 006: lstore 7
// 008: aload 0
// 009: getfield su/catlean/b7.C F
// 00c: ldc 40.0
// 00e: fadd
// 00f: fstore 10
// 011: aload 0
// 012: getfield su/catlean/b7.C F
// 015: ldc 55.0
// 017: fadd
// 018: fstore 11
// 01a: ldc2_w -2561596673428153362
// 01d: lload 7
// 01f: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 024: dload 1
// 025: d2f
// 026: fstore 12
// 028: astore 9
// 02a: fload 10
// 02c: fload 12
// 02e: fcmpg
// 02f: aload 9
// 031: ifnull 058
// 034: ifgt 081
// 037: goto 045
// 03a: ldc2_w -2485016929396356254
// 03d: lload 7
// 03f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 044: athrow
// 045: fload 12
// 047: fload 11
// 049: fcmpg
// 04a: goto 058
// 04d: ldc2_w -2485016929396356254
// 050: lload 7
// 052: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 057: athrow
// 058: aload 9
// 05a: ifnull 07e
// 05d: ifgt 07d
// 060: goto 06e
// 063: ldc2_w -2485016929396356254
// 066: lload 7
// 068: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: athrow
// 06e: bipush 1
// 06f: goto 082
// 072: ldc2_w -2485016929396356254
// 075: lload 7
// 077: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: athrow
// 07d: bipush 0
// 07e: goto 082
// 081: bipush 0
// 082: ifeq 2c2
// 085: aload 0
// 086: getfield su/catlean/b7.M F
// 089: ldc 10.0
// 08b: fadd
// 08c: aload 0
// 08d: getfield su/catlean/b7.L I
// 090: i2f
// 091: ldc 10.0
// 093: fmul
// 094: fadd
// 095: fstore 10
// 097: aload 0
// 098: getfield su/catlean/b7.M F
// 09b: ldc 18.0
// 09d: fadd
// 09e: aload 0
// 09f: getfield su/catlean/b7.L I
// 0a2: i2f
// 0a3: ldc 10.0
// 0a5: fmul
// 0a6: fadd
// 0a7: fstore 11
// 0a9: dload 3
// 0aa: d2f
// 0ab: fstore 12
// 0ad: fload 10
// 0af: fload 12
// 0b1: fcmpg
// 0b2: aload 9
// 0b4: lload 7
// 0b6: lconst_0
// 0b7: lcmp
// 0b8: iflt 0e4
// 0bb: ifnull 0e2
// 0be: ifgt 10b
// 0c1: goto 0cf
// 0c4: ldc2_w -2485016929396356254
// 0c7: lload 7
// 0c9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ce: athrow
// 0cf: fload 12
// 0d1: fload 11
// 0d3: fcmpg
// 0d4: goto 0e2
// 0d7: ldc2_w -2485016929396356254
// 0da: lload 7
// 0dc: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e1: athrow
// 0e2: aload 9
// 0e4: ifnull 108
// 0e7: ifgt 107
// 0ea: goto 0f8
// 0ed: ldc2_w -2485016929396356254
// 0f0: lload 7
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: bipush 1
// 0f9: goto 10c
// 0fc: ldc2_w -2485016929396356254
// 0ff: lload 7
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: bipush 0
// 108: goto 10c
// 10b: bipush 0
// 10c: ifeq 2c2
// 10f: bipush 4
// 110: anewarray 345
// 113: astore 11
// 115: aload 11
// 117: bipush 0
// 118: aload 0
// 119: getfield su/catlean/b7.j Lsu/catlean/a1;
// 11c: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 11f: checkcast java/awt/Color
// 122: invokevirtual java/awt/Color.getRed ()I
// 125: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 128: aastore
// 129: aload 11
// 12b: bipush 1
// 12c: aload 0
// 12d: getfield su/catlean/b7.j Lsu/catlean/a1;
// 130: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 133: checkcast java/awt/Color
// 136: invokevirtual java/awt/Color.getGreen ()I
// 139: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 13c: aastore
// 13d: aload 11
// 13f: bipush 2
// 140: aload 0
// 141: getfield su/catlean/b7.j Lsu/catlean/a1;
// 144: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 147: checkcast java/awt/Color
// 14a: invokevirtual java/awt/Color.getBlue ()I
// 14d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 150: aastore
// 151: aload 11
// 153: bipush 3
// 154: aload 0
// 155: getfield su/catlean/b7.j Lsu/catlean/a1;
// 158: invokevirtual su/catlean/a1.F ()Ljava/lang/Object;
// 15b: checkcast java/awt/Color
// 15e: invokevirtual java/awt/Color.getAlpha ()I
// 161: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 164: aastore
// 165: aload 11
// 167: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 16a: astore 10
// 16c: aload 10
// 16e: checkcast java/lang/Iterable
// 171: astore 12
// 173: bipush 0
// 174: istore 13
// 176: aload 12
// 178: astore 14
// 17a: new java/util/ArrayList
// 17d: dup
// 17e: aload 12
// 180: sipush 10538
// 183: ldc2_w 4773448145259651120
// 186: lload 7
// 188: lxor
// 189: invokedynamic s (IJ)I bsm=su/catlean/b7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 191: invokespecial java/util/ArrayList.<init> (I)V
// 194: checkcast java/util/Collection
// 197: astore 15
// 199: bipush 0
// 19a: istore 16
// 19c: bipush 0
// 19d: istore 17
// 19f: aload 14
// 1a1: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1a6: astore 18
// 1a8: aload 18
// 1aa: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1af: ifeq 26b
// 1b2: aload 18
// 1b4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1b9: astore 19
// 1bb: aload 15
// 1bd: iload 17
// 1bf: iinc 17 1
// 1c2: istore 20
// 1c4: aload 9
// 1c6: ifnull 274
// 1c9: iload 20
// 1cb: aload 9
// 1cd: lload 7
// 1cf: lconst_0
// 1d0: lcmp
// 1d1: ifle 1fd
// 1d4: ifnull 1fb
// 1d7: goto 1e5
// 1da: ldc2_w -2485016929396356254
// 1dd: lload 7
// 1df: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e4: athrow
// 1e5: ifge 1f9
// 1e8: goto 1f6
// 1eb: ldc2_w -2485016929396356254
// 1ee: lload 7
// 1f0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f5: athrow
// 1f6: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
// 1f9: iload 20
// 1fb: aload 19
// 1fd: checkcast java/lang/Number
// 200: invokevirtual java/lang/Number.intValue ()I
// 203: istore 21
// 205: istore 22
// 207: astore 24
// 209: bipush 0
// 20a: istore 23
// 20c: iload 22
// 20e: lload 7
// 210: lconst_0
// 211: lcmp
// 212: iflt 255
// 215: aload 0
// 216: getfield su/catlean/b7.L I
// 219: aload 9
// 21b: ifnull 244
// 21e: if_icmpne 258
// 221: goto 22f
// 224: ldc2_w -2485016929396356254
// 227: lload 7
// 229: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22e: athrow
// 22f: iload 21
// 231: dload 5
// 233: d2i
// 234: iadd
// 235: bipush 0
// 236: goto 244
// 239: ldc2_w -2485016929396356254
// 23c: lload 7
// 23e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 243: athrow
// 244: sipush 19779
// 247: ldc2_w 4445045182568301659
// 24a: lload 7
// 24c: lxor
// 24d: invokedynamic s (IJ)I bsm=su/catlean/b7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: invokestatic net/minecraft/class_3532.method_15340 (III)I
// 255: goto 25a
// 258: iload 21
// 25a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 25d: aload 24
// 25f: swap
// 260: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 265: pop
// 266: aload 9
// 268: ifnonnull 1a8
// 26b: aload 15
// 26d: lload 7
// 26f: lconst_0
// 270: lcmp
// 271: iflt 1b9
// 274: checkcast java/util/List
// 277: nop
// 278: astore 11
// 27a: aload 0
// 27b: getfield su/catlean/b7.j Lsu/catlean/a1;
// 27e: new java/awt/Color
// 281: dup
// 282: aload 11
// 284: bipush 0
// 285: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 28a: checkcast java/lang/Number
// 28d: invokevirtual java/lang/Number.intValue ()I
// 290: aload 11
// 292: bipush 1
// 293: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 298: checkcast java/lang/Number
// 29b: invokevirtual java/lang/Number.intValue ()I
// 29e: aload 11
// 2a0: bipush 2
// 2a1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 2a6: checkcast java/lang/Number
// 2a9: invokevirtual java/lang/Number.intValue ()I
// 2ac: aload 11
// 2ae: bipush 3
// 2af: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 2b4: checkcast java/lang/Number
// 2b7: invokevirtual java/lang/Number.intValue ()I
// 2ba: invokespecial java/awt/Color.<init> (IIII)V
// 2bd: invokevirtual su/catlean/a1.H (Ljava/lang/Object;)V
// 2c0: bipush 1
// 2c1: ireturn
// 2c2: bipush 0
// 2c3: ireturn
}

static {
long var11 = a ^ 129482475997912L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[5];
int var18 = 0;
String var17 = "·1\u0006J\u008eÜ;9Ë\u0016Ã\u0093I]L\u0011\u00106\u009c÷ß\u000bÂÍÆ:\u001b×*9\\\u0007ê\u0018;ÐÀ¼ø;ºeû\u008dáô\\\u0094\b#\u0012Nóp\rÜ\u001cv";
int var19 = "·1\u0006J\u008eÜ;9Ë\u0016Ã\u0093I]L\u0011\u00106\u009c÷ß\u000bÂÍÆ:\u001b×*9\\\u0007ê\u0018;ÐÀ¼ø;ºeû\u008dáô\\\u0094\b#\u0012Nóp\rÜ\u001cv"
.length();
char var16 = 16;
int var24 = -1;

label54:
while (true) {
String var25 = var17.substring(++var24, var24 + var16);
int var10001 = -1;

while (true) {
byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
String var36 = a(var21).intern();
switch (var10001) {
case 0:
var20[var18++] = var36;
if ((var24 += var16) >= var19) {
b = var20;
c = new String[5];
g = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "Ë\u009c¦à\u001c¶ÁÕÜ³Þ\u009a0Y£¯";
int var5 = "Ë\u009c¦à\u001c¶ÁÕÜ³Þ\u009a0Y£¯".length();
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
e = var6;
f = new Integer[4];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "\u0013)Qá\u000b\bý|ÛXqx\u0080Èûÿ";
var5 = "\u0013)Qá\u000b\bý|ÛXqx\u0080Èûÿ".length();
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

var16 = var17.charAt(var24);
break;
default:
var20[var18++] = var36;
if ((var24 += var16) < var19) {
var16 = var17.charAt(var24);
continue label54;
}

var17 = "ðQ4\u0006\u0091ÇLÞAåØ\u0005\u0019\u0083\"?\u0018KÝñ©\nvU\\\\0Û\u000eöÍù#\u000b²ÿº6ËU`";
var19 = "ðQ4\u0006\u0091ÇLÞAåØ\u0005\u0019\u0083\"?\u0018KÝñ©\nvU\\\\0Û\u000eöÍù#\u000b²ÿº6ËU`".length();
var16 = 16;
var24 = -1;
}

var25 = var17.substring(++var24, var24 + var16);
var10001 = 0;
}
}
}

private static Exception a(Exception var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16431;
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
throw new RuntimeException("su/catlean/b7", var10);
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
throw new RuntimeException("su/catlean/b7" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5233;
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
throw new RuntimeException("su/catlean/b7", var14);
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
throw new RuntimeException("su/catlean/b7" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
