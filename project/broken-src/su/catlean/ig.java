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
import kotlin.reflect.KMutableProperty0;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;

public final class ig {
@NotNull
private KMutableProperty0 g;
private float H;
private float E;
private final int N;
private boolean Y;
@NotNull
private String w;
private static final long a = yz.a(-697669283160861921L, 4089222421860816994L, MethodHandles.lookup().lookupClass()).a(89414752554512L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map h;

public ig(@NotNull KMutableProperty0 setting, float x, byte a, int a, int a, float y, int index) {
long var8 = ((long)axxx << 56 | (long)ax << 32 >>> 8 | (long)axx << 40 >>> 40) ^ a;
Intrinsics.checkNotNullParameter(setting, a<"k">(8563, 3875550647050836008L ^ var8));
super();
this.g = setting;
this.H = x;
this.E = y;
this.N = index;
this.w = "-";
}

@NotNull
public final KMutableProperty0 k() {
return this.g;
}

public final void K(long a, @NotNull KMutableProperty0 <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"k">(6038, 5638921475608264202L ^ ax));
this.g = <set-?>;
}

public final float p() {
return this.H;
}

public final void Y(float <set-?>) {
this.H = <set-?>;
}

public final float e() {
return this.E;
}

public final void G(float <set-?>) {
this.E = <set-?>;
}

public final int x() {
return this.N;
}

public final void f(char a, @Nullable Matrix3x2fStack m, int a, char a, @NotNull class_332 context) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 3
// 006: i2l
// 007: bipush 32
// 009: lshl
// 00a: bipush 16
// 00c: lushr
// 00d: lor
// 00e: iload 4
// 010: i2l
// 011: bipush 48
// 013: lshl
// 014: bipush 48
// 016: lushr
// 017: lor
// 018: getstatic su/catlean/ig.a J
// 01b: lxor
// 01c: lstore 6
// 01e: lload 6
// 020: dup2
// 021: ldc2_w 73961972826175
// 024: lxor
// 025: dup2
// 026: bipush 48
// 028: lushr
// 029: l2i
// 02a: istore 8
// 02c: dup2
// 02d: bipush 16
// 02f: lshl
// 030: bipush 48
// 032: lushr
// 033: l2i
// 034: istore 9
// 036: dup2
// 037: bipush 32
// 039: lshl
// 03a: bipush 32
// 03c: lushr
// 03d: l2i
// 03e: istore 10
// 040: pop2
// 041: dup2
// 042: ldc2_w 37586276739047
// 045: lxor
// 046: lstore 11
// 048: dup2
// 049: ldc2_w 66435187892298
// 04c: lxor
// 04d: lstore 13
// 04f: dup2
// 050: ldc2_w 111227874395046
// 053: lxor
// 054: dup2
// 055: bipush 48
// 057: lushr
// 058: l2i
// 059: istore 15
// 05b: dup2
// 05c: bipush 16
// 05e: lshl
// 05f: bipush 32
// 061: lushr
// 062: l2i
// 063: istore 16
// 065: dup2
// 066: bipush 48
// 068: lshl
// 069: bipush 48
// 06b: lushr
// 06c: l2i
// 06d: istore 17
// 06f: pop2
// 070: pop2
// 071: ldc2_w -6853791873141161074
// 074: lload 6
// 076: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07b: aload 5
// 07d: sipush 543
// 080: ldc2_w 9142972847293827873
// 083: lload 6
// 085: lxor
// 086: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ig.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08e: astore 19
// 090: aload 5
// 092: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 095: dup
// 096: sipush 21633
// 099: ldc2_w 7019432514030755256
// 09c: lload 6
// 09e: lxor
// 09f: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ig.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a4: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a7: aload 0
// 0a8: getfield su/catlean/ig.H F
// 0ab: ldc 40.0
// 0ad: fadd
// 0ae: iload 8
// 0b0: i2c
// 0b1: swap
// 0b2: aload 0
// 0b3: getfield su/catlean/ig.E F
// 0b6: ldc 10.0
// 0b8: fadd
// 0b9: aload 0
// 0ba: getfield su/catlean/ig.N I
// 0bd: i2f
// 0be: ldc 10.0
// 0c0: fmul
// 0c1: fadd
// 0c2: ldc 15.0
// 0c4: ldc 8.0
// 0c6: fconst_2
// 0c7: fconst_2
// 0c8: fconst_0
// 0c9: fconst_1
// 0ca: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0cd: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 0d0: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0d3: invokevirtual su/catlean/jh.S ()Ljava/awt/Color;
// 0d6: fconst_0
// 0d7: iload 9
// 0d9: i2s
// 0da: fconst_0
// 0db: iload 10
// 0dd: fconst_0
// 0de: sipush 10167
// 0e1: ldc2_w 5200957712016370939
// 0e4: lload 6
// 0e6: lxor
// 0e7: invokedynamic g (IJ)I bsm=su/catlean/ig.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: aconst_null
// 0ed: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 0f0: lload 11
// 0f2: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 0f5: aload 5
// 0f7: sipush 4255
// 0fa: ldc2_w 512665452872702375
// 0fd: lload 6
// 0ff: lxor
// 100: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ig.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 105: aload 0
// 106: getfield su/catlean/ig.N I
// 109: invokevirtual java/lang/String.charAt (I)C
// 10c: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
// 10f: aload 0
// 110: getfield su/catlean/ig.H F
// 113: ldc 34.0
// 115: fadd
// 116: aload 0
// 117: getfield su/catlean/ig.E F
// 11a: ldc 13.5
// 11c: fadd
// 11d: aload 0
// 11e: getfield su/catlean/ig.N I
// 121: i2f
// 122: ldc 10.0
// 124: fmul
// 125: fadd
// 126: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 129: invokevirtual su/catlean/jh.n ()Ljava/awt/Color;
// 12c: lload 13
// 12e: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 131: lload 11
// 133: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 136: aload 5
// 138: aload 0
// 139: getfield su/catlean/ig.Y Z
// 13c: aload 19
// 13e: ifnull 165
// 141: ifeq 164
// 144: goto 152
// 147: ldc2_w -6892988880229910262
// 14a: lload 6
// 14c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 151: athrow
// 152: aload 0
// 153: getfield su/catlean/ig.w Ljava/lang/String;
// 156: goto 1d9
// 159: ldc2_w -6892988880229910262
// 15c: lload 6
// 15e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 163: athrow
// 164: bipush 4
// 165: anewarray 150
// 168: astore 20
// 16a: aload 20
// 16c: bipush 0
// 16d: aload 0
// 16e: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 171: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 176: checkcast java/awt/Color
// 179: invokevirtual java/awt/Color.getRed ()I
// 17c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 17f: aastore
// 180: aload 20
// 182: bipush 1
// 183: aload 0
// 184: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 187: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 18c: checkcast java/awt/Color
// 18f: invokevirtual java/awt/Color.getGreen ()I
// 192: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 195: aastore
// 196: aload 20
// 198: bipush 2
// 199: aload 0
// 19a: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 19d: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 1a2: checkcast java/awt/Color
// 1a5: invokevirtual java/awt/Color.getBlue ()I
// 1a8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 1ab: aastore
// 1ac: aload 20
// 1ae: bipush 3
// 1af: aload 0
// 1b0: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 1b3: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 1b8: checkcast java/awt/Color
// 1bb: invokevirtual java/awt/Color.getAlpha ()I
// 1be: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 1c1: aastore
// 1c2: aload 20
// 1c4: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 1c7: aload 0
// 1c8: getfield su/catlean/ig.N I
// 1cb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 1d0: checkcast java/lang/Number
// 1d3: invokevirtual java/lang/Number.intValue ()I
// 1d6: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 1d9: aload 0
// 1da: getfield su/catlean/ig.H F
// 1dd: ldc 47.0
// 1df: fadd
// 1e0: aload 0
// 1e1: getfield su/catlean/ig.E F
// 1e4: ldc 13.0
// 1e6: fadd
// 1e7: aload 0
// 1e8: getfield su/catlean/ig.N I
// 1eb: i2f
// 1ec: ldc 10.0
// 1ee: fmul
// 1ef: fadd
// 1f0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1f3: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1f6: invokevirtual su/catlean/jh.r ()Ljava/awt/Color;
// 1f9: aload 0
// 1fa: getfield su/catlean/ig.Y Z
// 1fd: ifeq 21d
// 200: invokestatic java/lang/System.currentTimeMillis ()J
// 203: l2d
// 204: ldc2_w 50.0
// 207: ddiv
// 208: invokestatic java/lang/Math.sin (D)D
// 20b: d2f
// 20c: ldc 0.5
// 20e: fadd
// 20f: goto 21e
// 212: ldc2_w -6892988880229910262
// 215: lload 6
// 217: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21c: athrow
// 21d: fconst_1
// 21e: fstore 18
// 220: iload 15
// 222: i2c
// 223: iload 16
// 225: fload 18
// 227: iload 17
// 229: i2s
// 22a: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 22d: lload 13
// 22f: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 232: return
}

public final void m(int mouseX, long a, int mouseY) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ig.a J
// 003: lload 2
// 004: lxor
// 005: lstore 2
// 006: aload 0
// 007: getfield su/catlean/ig.H F
// 00a: ldc 40.0
// 00c: fadd
// 00d: fstore 6
// 00f: ldc2_w -3156447543343564962
// 012: lload 2
// 013: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 0
// 019: getfield su/catlean/ig.H F
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
// 037: ldc2_w -3132442561424011814
// 03a: lload 2
// 03b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: athrow
// 041: fload 8
// 043: fload 7
// 045: fcmpg
// 046: goto 053
// 049: ldc2_w -3132442561424011814
// 04c: lload 2
// 04d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: athrow
// 053: aload 5
// 055: ifnull 077
// 058: ifgt 076
// 05b: goto 068
// 05e: ldc2_w -3132442561424011814
// 061: lload 2
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: bipush 1
// 069: goto 07b
// 06c: ldc2_w -3132442561424011814
// 06f: lload 2
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: bipush 0
// 077: goto 07b
// 07a: bipush 0
// 07b: ifeq 1ac
// 07e: aload 0
// 07f: getfield su/catlean/ig.E F
// 082: ldc 10.0
// 084: fadd
// 085: aload 0
// 086: getfield su/catlean/ig.N I
// 089: i2f
// 08a: ldc 10.0
// 08c: fmul
// 08d: fadd
// 08e: fstore 6
// 090: aload 0
// 091: getfield su/catlean/ig.E F
// 094: ldc 18.0
// 096: fadd
// 097: aload 0
// 098: getfield su/catlean/ig.N I
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
// 0b1: ifle 0db
// 0b4: ifnull 0d9
// 0b7: ifgt 100
// 0ba: goto 0c7
// 0bd: ldc2_w -3132442561424011814
// 0c0: lload 2
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: fload 8
// 0c9: fload 7
// 0cb: fcmpg
// 0cc: goto 0d9
// 0cf: ldc2_w -3132442561424011814
// 0d2: lload 2
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 5
// 0db: ifnull 0fd
// 0de: ifgt 0fc
// 0e1: goto 0ee
// 0e4: ldc2_w -3132442561424011814
// 0e7: lload 2
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: bipush 1
// 0ef: goto 101
// 0f2: ldc2_w -3132442561424011814
// 0f5: lload 2
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: bipush 0
// 0fd: goto 101
// 100: bipush 0
// 101: ifeq 1ac
// 104: aload 0
// 105: aload 0
// 106: getfield su/catlean/ig.Y Z
// 109: aload 5
// 10b: ifnull 12c
// 10e: goto 11b
// 111: ldc2_w -3132442561424011814
// 114: lload 2
// 115: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11a: athrow
// 11b: ifne 12f
// 11e: goto 12b
// 121: ldc2_w -3132442561424011814
// 124: lload 2
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: bipush 1
// 12c: goto 130
// 12f: bipush 0
// 130: putfield su/catlean/ig.Y Z
// 133: aload 0
// 134: bipush 4
// 135: anewarray 150
// 138: astore 6
// 13a: aload 6
// 13c: bipush 0
// 13d: aload 0
// 13e: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 141: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 146: checkcast java/awt/Color
// 149: invokevirtual java/awt/Color.getRed ()I
// 14c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 14f: aastore
// 150: aload 6
// 152: bipush 1
// 153: aload 0
// 154: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 157: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 15c: checkcast java/awt/Color
// 15f: invokevirtual java/awt/Color.getGreen ()I
// 162: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 165: aastore
// 166: aload 6
// 168: bipush 2
// 169: aload 0
// 16a: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 16d: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 172: checkcast java/awt/Color
// 175: invokevirtual java/awt/Color.getBlue ()I
// 178: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 17b: aastore
// 17c: aload 6
// 17e: bipush 3
// 17f: aload 0
// 180: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 183: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 188: checkcast java/awt/Color
// 18b: invokevirtual java/awt/Color.getAlpha ()I
// 18e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 191: aastore
// 192: aload 6
// 194: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 197: aload 0
// 198: getfield su/catlean/ig.N I
// 19b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 1a0: checkcast java/lang/Number
// 1a3: invokevirtual java/lang/Number.intValue ()I
// 1a6: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
// 1a9: putfield su/catlean/ig.w Ljava/lang/String;
// 1ac: return
}

public final void x(char char, int a, char a, int a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: iload 2
// 01: i2l
// 02: bipush 32
// 04: lshl
// 05: iload 3
// 06: i2l
// 07: bipush 48
// 09: lshl
// 0a: bipush 32
// 0c: lushr
// 0d: lor
// 0e: iload 4
// 10: i2l
// 11: bipush 48
// 13: lshl
// 14: bipush 48
// 16: lushr
// 17: lor
// 18: getstatic su/catlean/ig.a J
// 1b: lxor
// 1c: lstore 5
// 1e: ldc2_w -2766213397107098896
// 21: lload 5
// 23: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28: astore 7
// 2a: aload 0
// 2b: getfield su/catlean/ig.w Ljava/lang/String;
// 2e: invokevirtual java/lang/String.length ()I
// 31: aload 7
// 33: ifnull 6d
// 36: bipush 3
// 37: if_icmpge 7e
// 3a: goto 48
// 3d: ldc2_w -2798652733780213644
// 40: lload 5
// 42: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 47: athrow
// 48: aload 0
// 49: aload 7
// 4b: ifnull 71
// 4e: goto 5c
// 51: ldc2_w -2798652733780213644
// 54: lload 5
// 56: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5b: athrow
// 5c: getfield su/catlean/ig.Y Z
// 5f: goto 6d
// 62: ldc2_w -2798652733780213644
// 65: lload 5
// 67: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c: athrow
// 6d: ifeq 7e
// 70: aload 0
// 71: aload 0
// 72: getfield su/catlean/ig.w Ljava/lang/String;
// 75: iload 1
// 76: invokedynamic makeConcatWithConstants (Ljava/lang/String;C)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 7b: putfield su/catlean/ig.w Ljava/lang/String;
// 7e: return
}

public final void W(long a, int key) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ig.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: ldc2_w 6199592795064350053
// 009: lload 1
// 00a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 00f: astore 4
// 011: aload 0
// 012: getfield su/catlean/ig.Y Z
// 015: aload 4
// 017: ifnull 02b
// 01a: ifeq 15e
// 01d: goto 02a
// 020: ldc2_w 6249940151275507681
// 023: lload 1
// 024: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 029: athrow
// 02a: iload 3
// 02b: aload 4
// 02d: ifnull 074
// 030: tableswitch 302 257 259 38 302 197
// 04c: ldc2_w 6249940151275507681
// 04f: lload 1
// 050: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 055: athrow
// 056: aload 0
// 057: bipush 0
// 058: putfield su/catlean/ig.Y Z
// 05b: nop
// 05c: aload 0
// 05d: getfield su/catlean/ig.w Ljava/lang/String;
// 060: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
// 063: bipush 0
// 064: sipush 11716
// 067: ldc2_w 4573869035238035553
// 06a: lload 1
// 06b: lxor
// 06c: invokedynamic g (IJ)I bsm=su/catlean/ig.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 071: invokestatic net/minecraft/class_3532.method_15340 (III)I
// 074: istore 5
// 076: aload 0
// 077: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 07a: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 07f: checkcast java/awt/Color
// 082: astore 6
// 084: aload 0
// 085: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 088: new java/awt/Color
// 08b: dup
// 08c: aload 0
// 08d: getfield su/catlean/ig.N I
// 090: ifne 0a2
// 093: iload 5
// 095: goto 0a7
// 098: ldc2_w 6249940151275507681
// 09b: lload 1
// 09c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: athrow
// 0a2: aload 6
// 0a4: invokevirtual java/awt/Color.getRed ()I
// 0a7: aload 0
// 0a8: getfield su/catlean/ig.N I
// 0ab: bipush 1
// 0ac: if_icmpne 0b4
// 0af: iload 5
// 0b1: goto 0b9
// 0b4: aload 6
// 0b6: invokevirtual java/awt/Color.getGreen ()I
// 0b9: aload 0
// 0ba: getfield su/catlean/ig.N I
// 0bd: bipush 2
// 0be: if_icmpne 0c6
// 0c1: iload 5
// 0c3: goto 0cb
// 0c6: aload 6
// 0c8: invokevirtual java/awt/Color.getBlue ()I
// 0cb: aload 0
// 0cc: getfield su/catlean/ig.N I
// 0cf: bipush 3
// 0d0: if_icmpne 0d8
// 0d3: iload 5
// 0d5: goto 0dd
// 0d8: aload 6
// 0da: invokevirtual java/awt/Color.getAlpha ()I
// 0dd: invokespecial java/awt/Color.<init> (IIII)V
// 0e0: invokeinterface kotlin/reflect/KMutableProperty0.set (Ljava/lang/Object;)V 2
// 0e5: goto 15e
// 0e8: astore 5
// 0ea: lload 1
// 0eb: lconst_0
// 0ec: lcmp
// 0ed: iflt 0f5
// 0f0: aload 4
// 0f2: ifnonnull 15e
// 0f5: aload 0
// 0f6: getfield su/catlean/ig.w Ljava/lang/String;
// 0f9: checkcast java/lang/CharSequence
// 0fc: invokeinterface java/lang/CharSequence.length ()I 1
// 101: aload 4
// 103: ifnull 124
// 106: goto 113
// 109: ldc2_w 6249940151275507681
// 10c: lload 1
// 10d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 112: athrow
// 113: ifle 127
// 116: goto 123
// 119: ldc2_w 6249940151275507681
// 11c: lload 1
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: bipush 1
// 124: goto 128
// 127: bipush 0
// 128: ifeq 15e
// 12b: aload 0
// 12c: aload 0
// 12d: getfield su/catlean/ig.w Ljava/lang/String;
// 130: bipush 0
// 131: aload 0
// 132: getfield su/catlean/ig.w Ljava/lang/String;
// 135: invokevirtual java/lang/String.length ()I
// 138: bipush 1
// 139: isub
// 13a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
// 13d: dup
// 13e: sipush 12154
// 141: ldc2_w 2153788210179625134
// 144: lload 1
// 145: lxor
// 146: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/ig.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 14e: putfield su/catlean/ig.w Ljava/lang/String;
// 151: goto 15e
// 154: ldc2_w 6249940151275507681
// 157: lload 1
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: return
}

public final void L(double mouseX, long a, double mouseY, double verticalAmount) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ig.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: aload 0
// 007: getfield su/catlean/ig.H F
// 00a: ldc 40.0
// 00c: fadd
// 00d: fstore 10
// 00f: ldc2_w -2377821276167259028
// 012: lload 3
// 013: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 018: aload 0
// 019: getfield su/catlean/ig.H F
// 01c: ldc 55.0
// 01e: fadd
// 01f: fstore 11
// 021: astore 9
// 023: dload 1
// 024: d2f
// 025: fstore 12
// 027: fload 10
// 029: fload 12
// 02b: fcmpg
// 02c: aload 9
// 02e: ifnull 053
// 031: ifgt 07a
// 034: goto 041
// 037: ldc2_w -2326927668794833176
// 03a: lload 3
// 03b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: athrow
// 041: fload 12
// 043: fload 11
// 045: fcmpg
// 046: goto 053
// 049: ldc2_w -2326927668794833176
// 04c: lload 3
// 04d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 052: athrow
// 053: aload 9
// 055: ifnull 077
// 058: ifgt 076
// 05b: goto 068
// 05e: ldc2_w -2326927668794833176
// 061: lload 3
// 062: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 067: athrow
// 068: bipush 1
// 069: goto 07b
// 06c: ldc2_w -2326927668794833176
// 06f: lload 3
// 070: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: athrow
// 076: bipush 0
// 077: goto 07b
// 07a: bipush 0
// 07b: ifeq 2b6
// 07e: aload 0
// 07f: getfield su/catlean/ig.E F
// 082: ldc 10.0
// 084: fadd
// 085: aload 0
// 086: getfield su/catlean/ig.N I
// 089: i2f
// 08a: ldc 10.0
// 08c: fmul
// 08d: fadd
// 08e: fstore 10
// 090: aload 0
// 091: getfield su/catlean/ig.E F
// 094: ldc 18.0
// 096: fadd
// 097: aload 0
// 098: getfield su/catlean/ig.N I
// 09b: i2f
// 09c: ldc 10.0
// 09e: fmul
// 09f: fadd
// 0a0: fstore 11
// 0a2: dload 5
// 0a4: d2f
// 0a5: fstore 12
// 0a7: fload 10
// 0a9: fload 12
// 0ab: fcmpg
// 0ac: aload 9
// 0ae: lload 3
// 0af: lconst_0
// 0b0: lcmp
// 0b1: iflt 0db
// 0b4: ifnull 0d9
// 0b7: ifgt 100
// 0ba: goto 0c7
// 0bd: ldc2_w -2326927668794833176
// 0c0: lload 3
// 0c1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c6: athrow
// 0c7: fload 12
// 0c9: fload 11
// 0cb: fcmpg
// 0cc: goto 0d9
// 0cf: ldc2_w -2326927668794833176
// 0d2: lload 3
// 0d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d8: athrow
// 0d9: aload 9
// 0db: ifnull 0fd
// 0de: ifgt 0fc
// 0e1: goto 0ee
// 0e4: ldc2_w -2326927668794833176
// 0e7: lload 3
// 0e8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ed: athrow
// 0ee: bipush 1
// 0ef: goto 101
// 0f2: ldc2_w -2326927668794833176
// 0f5: lload 3
// 0f6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fb: athrow
// 0fc: bipush 0
// 0fd: goto 101
// 100: bipush 0
// 101: ifeq 2b6
// 104: bipush 4
// 105: anewarray 150
// 108: astore 11
// 10a: aload 11
// 10c: bipush 0
// 10d: aload 0
// 10e: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 111: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 116: checkcast java/awt/Color
// 119: invokevirtual java/awt/Color.getRed ()I
// 11c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 11f: aastore
// 120: aload 11
// 122: bipush 1
// 123: aload 0
// 124: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 127: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 12c: checkcast java/awt/Color
// 12f: invokevirtual java/awt/Color.getGreen ()I
// 132: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 135: aastore
// 136: aload 11
// 138: bipush 2
// 139: aload 0
// 13a: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 13d: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 142: checkcast java/awt/Color
// 145: invokevirtual java/awt/Color.getBlue ()I
// 148: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 14b: aastore
// 14c: aload 11
// 14e: bipush 3
// 14f: aload 0
// 150: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 153: invokeinterface kotlin/reflect/KMutableProperty0.get ()Ljava/lang/Object; 1
// 158: checkcast java/awt/Color
// 15b: invokevirtual java/awt/Color.getAlpha ()I
// 15e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 161: aastore
// 162: aload 11
// 164: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
// 167: astore 10
// 169: aload 10
// 16b: checkcast java/lang/Iterable
// 16e: astore 12
// 170: bipush 0
// 171: istore 13
// 173: aload 12
// 175: astore 14
// 177: new java/util/ArrayList
// 17a: dup
// 17b: aload 12
// 17d: sipush 25493
// 180: ldc2_w 2184088911504004922
// 183: lload 3
// 184: lxor
// 185: invokedynamic g (IJ)I bsm=su/catlean/ig.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18a: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
// 18d: invokespecial java/util/ArrayList.<init> (I)V
// 190: checkcast java/util/Collection
// 193: astore 15
// 195: bipush 0
// 196: istore 16
// 198: bipush 0
// 199: istore 17
// 19b: aload 14
// 19d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 1a2: astore 18
// 1a4: aload 18
// 1a6: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1ab: ifeq 260
// 1ae: aload 18
// 1b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1b5: astore 19
// 1b7: aload 15
// 1b9: iload 17
// 1bb: iinc 17 1
// 1be: istore 20
// 1c0: aload 9
// 1c2: ifnull 268
// 1c5: iload 20
// 1c7: aload 9
// 1c9: lload 3
// 1ca: lconst_0
// 1cb: lcmp
// 1cc: ifle 1f6
// 1cf: ifnull 1f4
// 1d2: goto 1df
// 1d5: ldc2_w -2326927668794833176
// 1d8: lload 3
// 1d9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1de: athrow
// 1df: ifge 1f2
// 1e2: goto 1ef
// 1e5: ldc2_w -2326927668794833176
// 1e8: lload 3
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
// 1f2: iload 20
// 1f4: aload 19
// 1f6: checkcast java/lang/Number
// 1f9: invokevirtual java/lang/Number.intValue ()I
// 1fc: istore 21
// 1fe: istore 22
// 200: astore 24
// 202: bipush 0
// 203: istore 23
// 205: iload 22
// 207: lload 3
// 208: lconst_0
// 209: lcmp
// 20a: iflt 24a
// 20d: aload 0
// 20e: getfield su/catlean/ig.N I
// 211: aload 9
// 213: ifnull 23a
// 216: if_icmpne 24d
// 219: goto 226
// 21c: ldc2_w -2326927668794833176
// 21f: lload 3
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: iload 21
// 228: dload 7
// 22a: d2i
// 22b: iadd
// 22c: bipush 0
// 22d: goto 23a
// 230: ldc2_w -2326927668794833176
// 233: lload 3
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: sipush 20333
// 23d: ldc2_w 3830206510903753664
// 240: lload 3
// 241: lxor
// 242: invokedynamic g (IJ)I bsm=su/catlean/ig.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 247: invokestatic net/minecraft/class_3532.method_15340 (III)I
// 24a: goto 24f
// 24d: iload 21
// 24f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
// 252: aload 24
// 254: swap
// 255: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 25a: pop
// 25b: aload 9
// 25d: ifnonnull 1a4
// 260: aload 15
// 262: lload 3
// 263: lconst_0
// 264: lcmp
// 265: ifle 1b5
// 268: checkcast java/util/List
// 26b: nop
// 26c: astore 11
// 26e: aload 0
// 26f: getfield su/catlean/ig.g Lkotlin/reflect/KMutableProperty0;
// 272: new java/awt/Color
// 275: dup
// 276: aload 11
// 278: bipush 0
// 279: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 27e: checkcast java/lang/Number
// 281: invokevirtual java/lang/Number.intValue ()I
// 284: aload 11
// 286: bipush 1
// 287: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 28c: checkcast java/lang/Number
// 28f: invokevirtual java/lang/Number.intValue ()I
// 292: aload 11
// 294: bipush 2
// 295: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 29a: checkcast java/lang/Number
// 29d: invokevirtual java/lang/Number.intValue ()I
// 2a0: aload 11
// 2a2: bipush 3
// 2a3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
// 2a8: checkcast java/lang/Number
// 2ab: invokevirtual java/lang/Number.intValue ()I
// 2ae: invokespecial java/awt/Color.<init> (IIII)V
// 2b1: invokeinterface kotlin/reflect/KMutableProperty0.set (Ljava/lang/Object;)V 2
// 2b6: return
}

static {
long var11 = a ^ 32681342880950L;
Cipher var13;
Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var14 = 1; var14 < 8; var14++) {
var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var20 = new String[6];
int var18 = 0;
String var17 = "\u0005É\b|¤mà\u009fe¡°¼¶òz\u0007\u0010>ùÔËRÍ³\u0081á%j\u009b\u0090A½¿\u0010·ÇàÜ£+\u001b\u0086Î\u0091lç0\u0006[4\u0018³\u0082'BR\u009b\u008d\u0007ÃÒçÍ\u009dzf§\u0019+æ\u0000\u0004z\u001b¤";
int var19 = "\u0005É\b|¤mà\u009fe¡°¼¶òz\u0007\u0010>ùÔËRÍ³\u0081á%j\u009b\u0090A½¿\u0010·ÇàÜ£+\u001b\u0086Î\u0091lç0\u0006[4\u0018³\u0082'BR\u009b\u008d\u0007ÃÒçÍ\u009dzf§\u0019+æ\u0000\u0004z\u001b¤"
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
c = new String[6];
h = new HashMap(13);
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
String var4 = "VÉÁOóµPY\u0083\u0006¾Pt~ðÔ";
int var5 = "VÉÁOóµPY\u0083\u0006¾Pt~ðÔ".length();
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

var4 = "n\u0092hòlæ\u0018n\u0088¢í\u0017ÅT=g";
var5 = "n\u0092hòlæ\u0018n\u0088¢í\u0017ÅT=g".length();
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

var17 = "»!Û\u0086\u0003\u009fy{XHâ\u0006x3;¨yå\"ì\u0015[ÔY\u0018.\u000eòü\u009e¦?rC ªz~\u0018âo\t`×|®>,á";
var19 = "»!Û\u0086\u0003\u009fy{XHâ\u0006x3;¨yå\"ì\u0015[ÔY\u0018.\u000eòü\u009e¦?rC ªz~\u0018âo\t`×|®>,á".length();
var16 = 24;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 10464;
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
throw new RuntimeException("su/catlean/ig", var10);
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
throw new RuntimeException("su/catlean/ig" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 27282;
if (f[var3] == null) {
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
throw new RuntimeException("su/catlean/ig", var14);
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
throw new RuntimeException("su/catlean/ig" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
