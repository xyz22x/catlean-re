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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;

public final class bj {
@NotNull
private String p;
private int N;
private int q;
private int L;
@Nullable
private class_2960 K;
private static boolean h;
private static final long a = yz.a(5175348085078378909L, 471373585935156248L, MethodHandles.lookup().lookupClass()).a(90639656104317L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;

public bj(@NotNull String name, int width, int height, long a) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(name, a<"f">(18329, 6918824430478514906L ^ ax));
super();
this.p = name;
this.N = width;
this.q = height;
this.L = -1;
}

public bj(String var1, int var2, int var3, long var4, int var6, DefaultConstructorMarker var7) {
var4 = a ^ var4;
long var8 = var4 ^ 95024453542711L;
if ((var6 & 2) != 0) {
var2 = 0;
}

if ((var6 & 4) != 0) {
var3 = 0;
}

this(var1, var2, var3, var8);
}

public final int r() {
return this.N;
}

public final void j(int <set-?>) {
this.N = <set-?>;
}

public final int f() {
return this.q;
}

public final void d(int <set-?>) {
this.q = <set-?>;
}

private final void T(float param1, float param2, long param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/bj.a J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 127259870427573
// 00b: lxor
// 00c: lstore 5
// 00e: dup2
// 00f: ldc2_w 99592464382155
// 012: lxor
// 013: lstore 7
// 015: dup2
// 016: ldc2_w 74467293177454
// 019: lxor
// 01a: lstore 9
// 01c: pop2
// 01d: ldc2_w 4410946742644328569
// 020: lload 3
// 021: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 026: istore 11
// 028: aload 0
// 029: iload 11
// 02b: ifeq 055
// 02e: getfield su/catlean/bj.K Lnet/minecraft/class_2960;
// 031: ifnull 054
// 034: goto 041
// 037: ldc2_w 4394638429789881811
// 03a: lload 3
// 03b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 040: athrow
// 041: aload 0
// 042: lload 7
// 044: invokespecial su/catlean/bj.D (J)V
// 047: goto 054
// 04a: ldc2_w 4394638429789881811
// 04d: lload 3
// 04e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 053: athrow
// 054: aload 0
// 055: aload 0
// 056: getfield su/catlean/bj.p Ljava/lang/String;
// 059: sipush 12176
// 05c: ldc2_w 458458507527771130
// 05f: lload 3
// 060: lxor
// 061: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/bj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 066: swap
// 067: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 06c: lload 5
// 06e: dup2_x1
// 06f: pop2
// 070: invokestatic su/catlean/l6.m (JLjava/lang/String;)Lnet/minecraft/class_2960;
// 073: putfield su/catlean/bj.K Lnet/minecraft/class_2960;
// 076: nop
// 077: new com/github/weisj/jsvg/parser/SVGLoader
// 07a: dup
// 07b: invokespecial com/github/weisj/jsvg/parser/SVGLoader.<init> ()V
// 07e: aload 0
// 07f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
// 082: aload 0
// 083: getfield su/catlean/bj.p Ljava/lang/String;
// 086: sipush 7551
// 089: ldc2_w 6615202786772214044
// 08c: lload 3
// 08d: lxor
// 08e: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/bj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: swap
// 094: sipush 8840
// 097: ldc2_w 321582751114452705
// 09a: lload 3
// 09b: lxor
// 09c: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/bj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a1: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
// 0a6: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
// 0a9: dup
// 0aa: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 0ad: invokevirtual com/github/weisj/jsvg/parser/SVGLoader.load (Ljava/io/InputStream;)Lcom/github/weisj/jsvg/SVGDocument;
// 0b0: astore 12
// 0b2: new java/awt/image/BufferedImage
// 0b5: dup
// 0b6: fload 1
// 0b7: f2d
// 0b8: invokestatic java/lang/Math.ceil (D)D
// 0bb: d2i
// 0bc: fload 2
// 0bd: f2d
// 0be: invokestatic java/lang/Math.ceil (D)D
// 0c1: d2i
// 0c2: bipush 2
// 0c3: invokespecial java/awt/image/BufferedImage.<init> (III)V
// 0c6: astore 13
// 0c8: aload 13
// 0ca: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
// 0cd: astore 14
// 0cf: aload 14
// 0d1: getstatic java/awt/RenderingHints.KEY_ANTIALIASING Ljava/awt/RenderingHints$Key;
// 0d4: getstatic java/awt/RenderingHints.VALUE_ANTIALIAS_ON Ljava/lang/Object;
// 0d7: invokevirtual java/awt/Graphics2D.setRenderingHint (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
// 0da: aload 14
// 0dc: getstatic java/awt/RenderingHints.KEY_STROKE_CONTROL Ljava/awt/RenderingHints$Key;
// 0df: getstatic java/awt/RenderingHints.VALUE_STROKE_PURE Ljava/lang/Object;
// 0e2: invokevirtual java/awt/Graphics2D.setRenderingHint (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
// 0e5: iload 11
// 0e7: ifeq 119
// 0ea: aload 12
// 0ec: dup
// 0ed: ifnull 11c
// 0f0: goto 0fd
// 0f3: ldc2_w 4394638429789881811
// 0f6: lload 3
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: aconst_null
// 0fe: aload 14
// 100: new com/github/weisj/jsvg/attributes/ViewBox
// 103: dup
// 104: fload 1
// 105: fload 2
// 106: invokespecial com/github/weisj/jsvg/attributes/ViewBox.<init> (FF)V
// 109: invokevirtual com/github/weisj/jsvg/SVGDocument.render (Ljavax/swing/JComponent;Ljava/awt/Graphics2D;Lcom/github/weisj/jsvg/attributes/ViewBox;)V
// 10c: goto 119
// 10f: ldc2_w 4394638429789881811
// 112: lload 3
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: goto 11d
// 11c: pop
// 11d: aload 14
// 11f: invokevirtual java/awt/Graphics2D.dispose ()V
// 122: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 125: aload 0
// 126: getfield su/catlean/bj.K Lnet/minecraft/class_2960;
// 129: dup
// 12a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 12d: lload 9
// 12f: aload 13
// 131: invokevirtual su/catlean/jl.b (Lnet/minecraft/class_2960;JLjava/awt/image/BufferedImage;)V
// 134: goto 14d
// 137: astore 12
// 139: aload 0
// 13a: sipush 9305
// 13d: ldc2_w 802275855987300404
// 140: lload 3
// 141: lxor
// 142: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/bj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: invokestatic net/minecraft/class_2960.method_60656 (Ljava/lang/String;)Lnet/minecraft/class_2960;
// 14a: putfield su/catlean/bj.K Lnet/minecraft/class_2960;
// 14d: return
}

public final void a(
short a,
@NotNull Matrix3x2f stack,
double x,
short a,
double y,
float renderWidth,
float renderHeight,
int a,
@NotNull Color primaryColor,
@NotNull Color secondaryColor,
float alpha
) {
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
// 005: iload 5
// 007: i2l
// 008: bipush 48
// 00a: lshl
// 00b: bipush 16
// 00d: lushr
// 00e: lor
// 00f: iload 10
// 011: i2l
// 012: bipush 32
// 014: lshl
// 015: bipush 32
// 017: lushr
// 018: lor
// 019: getstatic su/catlean/bj.a J
// 01c: lxor
// 01d: lstore 14
// 01f: lload 14
// 021: dup2
// 022: ldc2_w 110804238972982
// 025: lxor
// 026: lstore 16
// 028: dup2
// 029: ldc2_w 13496208487975
// 02c: lxor
// 02d: dup2
// 02e: bipush 32
// 030: lushr
// 031: l2i
// 032: istore 18
// 034: dup2
// 035: bipush 32
// 037: lshl
// 038: bipush 48
// 03a: lushr
// 03b: l2i
// 03c: istore 19
// 03e: dup2
// 03f: bipush 48
// 041: lshl
// 042: bipush 48
// 044: lushr
// 045: l2i
// 046: istore 20
// 048: pop2
// 049: dup2
// 04a: ldc2_w 19111284578967
// 04d: lxor
// 04e: lstore 21
// 050: dup2
// 051: ldc2_w 137725042460421
// 054: lxor
// 055: dup2
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 23
// 05c: dup2
// 05d: bipush 16
// 05f: lshl
// 060: bipush 32
// 062: lushr
// 063: l2i
// 064: istore 24
// 066: dup2
// 067: bipush 48
// 069: lshl
// 06a: bipush 48
// 06c: lushr
// 06d: l2i
// 06e: istore 25
// 070: pop2
// 071: pop2
// 072: ldc2_w 7314386430107390158
// 075: lload 14
// 077: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07c: aload 2
// 07d: sipush 10310
// 080: ldc2_w 3459308582317362335
// 083: lload 14
// 085: lxor
// 086: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/bj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08e: aload 11
// 090: sipush 29771
// 093: ldc2_w 402670892319428752
// 096: lload 14
// 098: lxor
// 099: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/bj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0a1: istore 26
// 0a3: aload 12
// 0a5: sipush 30928
// 0a8: ldc2_w 8884193343249767432
// 0ab: lload 14
// 0ad: lxor
// 0ae: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/bj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0b6: dload 3
// 0b7: ldc 0.5
// 0b9: f2d
// 0ba: dadd
// 0bb: dstore 27
// 0bd: dload 6
// 0bf: fconst_2
// 0c0: f2d
// 0c1: dadd
// 0c2: dstore 29
// 0c4: lload 16
// 0c6: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0c9: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
// 0cc: invokevirtual net/minecraft/class_1041.method_4495 ()I
// 0cf: istore 31
// 0d1: aload 0
// 0d2: iload 26
// 0d4: ifeq 12e
// 0d7: getfield su/catlean/bj.L I
// 0da: iload 31
// 0dc: if_icmpne 119
// 0df: goto 0ed
// 0e2: ldc2_w 7227111212980264292
// 0e5: lload 14
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: aload 0
// 0ee: iload 26
// 0f0: iload 1
// 0f1: iflt 14a
// 0f4: ifeq 148
// 0f7: goto 105
// 0fa: ldc2_w 7227111212980264292
// 0fd: lload 14
// 0ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 104: athrow
// 105: getfield su/catlean/bj.K Lnet/minecraft/class_2960;
// 108: ifnonnull 147
// 10b: goto 119
// 10e: ldc2_w 7227111212980264292
// 111: lload 14
// 113: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 118: athrow
// 119: aload 0
// 11a: iload 31
// 11c: putfield su/catlean/bj.L I
// 11f: aload 0
// 120: goto 12e
// 123: ldc2_w 7227111212980264292
// 126: lload 14
// 128: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12d: athrow
// 12e: aload 0
// 12f: getfield su/catlean/bj.N I
// 132: aload 0
// 133: getfield su/catlean/bj.L I
// 136: imul
// 137: i2f
// 138: aload 0
// 139: getfield su/catlean/bj.q I
// 13c: aload 0
// 13d: getfield su/catlean/bj.L I
// 140: imul
// 141: i2f
// 142: lload 21
// 144: invokespecial su/catlean/bj.T (FFJ)V
// 147: aload 0
// 148: iload 26
// 14a: ifeq 1ca
// 14d: getfield su/catlean/bj.N I
// 150: fload 8
// 152: f2d
// 153: invokestatic java/lang/Math.ceil (D)D
// 156: d2f
// 157: f2i
// 158: if_icmpne 1a3
// 15b: goto 169
// 15e: ldc2_w 7227111212980264292
// 161: lload 14
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: aload 0
// 16a: iload 26
// 16c: iload 10
// 16e: ifgt 1ce
// 171: ifeq 1ca
// 174: goto 182
// 177: ldc2_w 7227111212980264292
// 17a: lload 14
// 17c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 181: athrow
// 182: getfield su/catlean/bj.q I
// 185: iload 5
// 187: ifle 293
// 18a: fload 9
// 18c: f2d
// 18d: invokestatic java/lang/Math.ceil (D)D
// 190: d2f
// 191: f2i
// 192: if_icmpeq 1d9
// 195: goto 1a3
// 198: ldc2_w 7227111212980264292
// 19b: lload 14
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 0
// 1a4: fload 8
// 1a6: f2d
// 1a7: invokestatic java/lang/Math.ceil (D)D
// 1aa: d2f
// 1ab: f2i
// 1ac: putfield su/catlean/bj.N I
// 1af: aload 0
// 1b0: fload 9
// 1b2: f2d
// 1b3: invokestatic java/lang/Math.ceil (D)D
// 1b6: d2f
// 1b7: f2i
// 1b8: putfield su/catlean/bj.q I
// 1bb: aload 0
// 1bc: goto 1ca
// 1bf: ldc2_w 7227111212980264292
// 1c2: lload 14
// 1c4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c9: athrow
// 1ca: aload 0
// 1cb: getfield su/catlean/bj.N I
// 1ce: i2f
// 1cf: aload 0
// 1d0: getfield su/catlean/bj.q I
// 1d3: i2f
// 1d4: lload 21
// 1d6: invokespecial su/catlean/bj.T (FFJ)V
// 1d9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1dc: aload 2
// 1dd: aload 0
// 1de: getfield su/catlean/bj.K Lnet/minecraft/class_2960;
// 1e1: dup
// 1e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1e5: dload 27
// 1e7: d2f
// 1e8: dload 29
// 1ea: d2f
// 1eb: fload 8
// 1ed: f2d
// 1ee: invokestatic java/lang/Math.ceil (D)D
// 1f1: d2f
// 1f2: fload 9
// 1f4: f2d
// 1f5: invokestatic java/lang/Math.ceil (D)D
// 1f8: d2f
// 1f9: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1fc: aload 11
// 1fe: fload 13
// 200: aload 11
// 202: invokevirtual java/awt/Color.getAlpha ()I
// 205: i2f
// 206: ldc 255.0
// 208: fdiv
// 209: fmul
// 20a: iload 23
// 20c: i2c
// 20d: swap
// 20e: iload 24
// 210: swap
// 211: iload 25
// 213: i2s
// 214: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 217: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 21a: aload 12
// 21c: fload 13
// 21e: aload 11
// 220: invokevirtual java/awt/Color.getAlpha ()I
// 223: i2f
// 224: ldc 255.0
// 226: fdiv
// 227: fmul
// 228: iload 23
// 22a: i2c
// 22b: swap
// 22c: iload 24
// 22e: swap
// 22f: iload 25
// 231: i2s
// 232: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 235: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 238: aload 11
// 23a: fload 13
// 23c: aload 11
// 23e: invokevirtual java/awt/Color.getAlpha ()I
// 241: i2f
// 242: ldc 255.0
// 244: fdiv
// 245: fmul
// 246: iload 23
// 248: i2c
// 249: swap
// 24a: iload 24
// 24c: swap
// 24d: iload 25
// 24f: i2s
// 250: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 253: iload 18
// 255: swap
// 256: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 259: aload 12
// 25b: fload 13
// 25d: aload 11
// 25f: invokevirtual java/awt/Color.getAlpha ()I
// 262: i2f
// 263: ldc 255.0
// 265: fdiv
// 266: fmul
// 267: iload 23
// 269: i2c
// 26a: swap
// 26b: iload 24
// 26d: swap
// 26e: iload 25
// 270: i2s
// 271: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 274: fconst_0
// 275: iload 19
// 277: i2c
// 278: fconst_0
// 279: fconst_0
// 27a: iload 20
// 27c: i2s
// 27d: fconst_0
// 27e: bipush 0
// 27f: sipush 26728
// 282: ldc2_w 9193921378016647337
// 285: lload 14
// 287: lxor
// 288: invokedynamic j (IJ)I bsm=su/catlean/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28d: aconst_null
// 28e: invokestatic su/catlean/jl.W (Lsu/catlean/jl;Lorg/joml/Matrix3x2f;Lnet/minecraft/class_2960;FFFFLjava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;FCFFSFZILjava/lang/Object;)V
// 291: iload 26
// 293: iload 1
// 294: iflt 29b
// 297: ifne 2b6
// 29a: bipush 4
// 29b: anewarray 525
// 29e: ldc2_w 7230756901260652133
// 2a1: lload 14
// 2a3: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2a8: goto 2b6
// 2ab: ldc2_w 7227111212980264292
// 2ae: lload 14
// 2b0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b5: athrow
// 2b6: return
}

public static void p(
bj param0,
Matrix3x2f param1,
double param2,
double param4,
float param6,
float param7,
Color param8,
Color param9,
float param10,
int param11,
long param12,
Object param14
) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/bj.a J
// 003: lload 12
// 005: lxor
// 006: lstore 12
// 008: lload 12
// 00a: dup2
// 00b: ldc2_w 105481816286603
// 00e: lxor
// 00f: dup2
// 010: bipush 48
// 012: lushr
// 013: l2i
// 014: istore 15
// 016: dup2
// 017: bipush 16
// 019: lshl
// 01a: bipush 48
// 01c: lushr
// 01d: l2i
// 01e: istore 16
// 020: dup2
// 021: bipush 32
// 023: lshl
// 024: bipush 32
// 026: lushr
// 027: l2i
// 028: istore 17
// 02a: pop2
// 02b: pop2
// 02c: ldc2_w -9067265300606486683
// 02f: lload 12
// 031: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 036: istore 18
// 038: iload 11
// 03a: sipush 15025
// 03d: ldc2_w 1177833792782659037
// 040: lload 12
// 042: lxor
// 043: invokedynamic j (IJ)I bsm=su/catlean/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 048: iand
// 049: iload 18
// 04b: ifeq 077
// 04e: ifeq 066
// 051: goto 05f
// 054: ldc2_w -8943961045659239729
// 057: lload 12
// 059: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05e: athrow
// 05f: aload 0
// 060: getfield su/catlean/bj.N I
// 063: i2f
// 064: fstore 6
// 066: iload 11
// 068: sipush 19940
// 06b: ldc2_w 194934647427996297
// 06e: lload 12
// 070: lxor
// 071: invokedynamic j (IJ)I bsm=su/catlean/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 076: iand
// 077: iload 18
// 079: lload 12
// 07b: lconst_0
// 07c: lcmp
// 07d: iflt 0ae
// 080: ifeq 0ac
// 083: ifeq 09b
// 086: goto 094
// 089: ldc2_w -8943961045659239729
// 08c: lload 12
// 08e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 093: athrow
// 094: aload 0
// 095: getfield su/catlean/bj.q I
// 098: i2f
// 099: fstore 7
// 09b: iload 11
// 09d: sipush 20257
// 0a0: ldc2_w 2507055916088301640
// 0a3: lload 12
// 0a5: lxor
// 0a6: invokedynamic j (IJ)I bsm=su/catlean/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ab: iand
// 0ac: iload 18
// 0ae: lload 12
// 0b0: lconst_0
// 0b1: lcmp
// 0b2: ifle 0f3
// 0b5: ifeq 0f1
// 0b8: ifeq 0e0
// 0bb: goto 0c9
// 0be: ldc2_w -8943961045659239729
// 0c1: lload 12
// 0c3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: athrow
// 0c9: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 0cc: dup
// 0cd: sipush 14156
// 0d0: ldc2_w 1582060588395983931
// 0d3: lload 12
// 0d5: lxor
// 0d6: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/bj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0de: astore 8
// 0e0: iload 11
// 0e2: sipush 9910
// 0e5: ldc2_w 2602800963517510110
// 0e8: lload 12
// 0ea: lxor
// 0eb: invokedynamic j (IJ)I bsm=su/catlean/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: iand
// 0f1: iload 18
// 0f3: ifeq 11c
// 0f6: ifeq 10b
// 0f9: goto 107
// 0fc: ldc2_w -8943961045659239729
// 0ff: lload 12
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: aload 8
// 109: astore 9
// 10b: iload 11
// 10d: sipush 31780
// 110: ldc2_w 1885282721543564111
// 113: lload 12
// 115: lxor
// 116: invokedynamic j (IJ)I bsm=su/catlean/bj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: iand
// 11c: ifeq 122
// 11f: fconst_1
// 120: fstore 10
// 122: aload 0
// 123: iload 15
// 125: i2s
// 126: aload 1
// 127: dload 2
// 128: iload 16
// 12a: i2s
// 12b: dload 4
// 12d: fload 6
// 12f: fload 7
// 131: iload 17
// 133: aload 8
// 135: aload 9
// 137: fload 10
// 139: invokevirtual su/catlean/bj.a (SLorg/joml/Matrix3x2f;DSDFFILjava/awt/Color;Ljava/awt/Color;F)V
// 13c: ldc2_w -8969595789252453100
// 13f: lload 12
// 141: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 146: ifnull 176
// 149: iload 18
// 14b: ifeq 16b
// 14e: goto 15c
// 151: ldc2_w -8943961045659239729
// 154: lload 12
// 156: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15b: athrow
// 15c: bipush 0
// 15d: goto 16c
// 160: ldc2_w -8943961045659239729
// 163: lload 12
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: bipush 1
// 16c: ldc2_w -8983343483614084202
// 16f: lload 12
// 171: invokedynamic Å (ZJJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 176: return
}

private final void D(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/bj.a J
// 03: lload 1
// 04: lxor
// 05: lstore 1
// 06: lload 1
// 07: dup2
// 08: ldc2_w 51896147483242
// 0b: lxor
// 0c: lstore 3
// 0d: pop2
// 0e: ldc2_w 5054539938317201486
// 11: lload 1
// 12: invokedynamic Å (JJ)Z bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17: istore 5
// 19: iload 5
// 1b: ifne 44
// 1e: aload 0
// 1f: getfield su/catlean/bj.K Lnet/minecraft/class_2960;
// 22: dup
// 23: ifnull 43
// 26: goto 33
// 29: ldc2_w 5050664587973394232
// 2c: lload 1
// 2d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 32: athrow
// 33: invokevirtual net/minecraft/class_2960.method_12836 ()Ljava/lang/String;
// 36: goto 45
// 39: ldc2_w 5050664587973394232
// 3c: lload 1
// 3d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42: athrow
// 43: pop
// 44: aconst_null
// 45: sipush 9569
// 48: ldc2_w 6476360774567764968
// 4b: lload 1
// 4c: lxor
// 4d: invokedynamic f (IJ)Ljava/lang/String; bsm=su/catlean/bj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 52: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 55: ifeq 9d
// 58: aload 0
// 59: iload 5
// 5b: ifne 9e
// 5e: goto 6b
// 61: ldc2_w 5050664587973394232
// 64: lload 1
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: getfield su/catlean/bj.K Lnet/minecraft/class_2960;
// 6e: ifnull 9d
// 71: goto 7e
// 74: ldc2_w 5050664587973394232
// 77: lload 1
// 78: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7d: athrow
// 7e: lload 3
// 7f: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 82: invokevirtual net/minecraft/class_310.method_1531 ()Lnet/minecraft/class_1060;
// 85: aload 0
// 86: getfield su/catlean/bj.K Lnet/minecraft/class_2960;
// 89: dup
// 8a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 8d: invokevirtual net/minecraft/class_1060.method_4615 (Lnet/minecraft/class_2960;)V
// 90: goto 9d
// 93: ldc2_w 5050664587973394232
// 96: lload 1
// 97: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 9c: athrow
// 9d: aload 0
// 9e: aconst_null
// 9f: putfield su/catlean/bj.K Lnet/minecraft/class_2960;
// a2: return
}

public static void v(boolean var0) {
h = var0;
}

public static boolean b() {
return h;
}

public static boolean P() {
boolean var0 = b();

try {
return !var0;
} catch (NumberFormatException var1) {
throw a(var1);
}
}

static {
long var20 = a ^ 125017045715582L;
vm.a<"Å">(true, -8512199149090715364L, var20);
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[10];
int var16 = 0;
String var15 = "\u0087*µ\u0012\u009b8\u008cCÉ¼YÐGJ2Krb P«ìL9\u009cq@Ù\u007fmù©\u0010^çCEõú^Vf^\u0091ß6,\u001f:\u0010\u0013M\tVÝ\u0085QâÌ=+Ç\u008dTü¿\u0010»Y q$<ª\u001f\u0016ç\u00982\u0004\u0015·\u009a\u0010Í\u0094\u0010\u0091?ÌÂ\u00adÄ\u0093¡\t¯\u009f\n\u000e\u0018Eè&Ú&Ó¨ærë*\u000b8\u0012ºå×$PýCÏúö \u0006Ç%Ì\u0089f£\u008eZã°H\u0005p\u009b÷1\u008e¸\u008c\u0086Äß»´~<´güÊÞ \u008e ´'â\u0019H¬\u0089\u0090\u0097\u0087i\u0013ÈÊ\u0007\u0007U3±\u0082£GúyûZQ0Çv";
int var17 = "\u0087*µ\u0012\u009b8\u008cCÉ¼YÐGJ2Krb P«ìL9\u009cq@Ù\u007fmù©\u0010^çCEõú^Vf^\u0091ß6,\u001f:\u0010\u0013M\tVÝ\u0085QâÌ=+Ç\u008dTü¿\u0010»Y q$<ª\u001f\u0016ç\u00982\u0004\u0015·\u009a\u0010Í\u0094\u0010\u0091?ÌÂ\u00adÄ\u0093¡\t¯\u009f\n\u000e\u0018Eè&Ú&Ó¨ærë*\u000b8\u0012ºå×$PýCÏúö \u0006Ç%Ì\u0089f£\u008eZã°H\u0005p\u009b÷1\u008e¸\u008c\u0086Äß»´~<´güÊÞ \u008e ´'â\u0019H¬\u0089\u0090\u0097\u0087i\u0013ÈÊ\u0007\u0007U3±\u0082£GúyûZQ0Çv"
.length();
char var14 = ' ';
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
b = var18;
c = new String[10];
g = new HashMap(13);
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
String var4 = "Eñ\"ï+v¬üì.[\u0005\u009eª%Ã\u0091?¶\u0086æp\bWAð\u00148v% \u0016";
int var5 = "Eñ\"ï+v¬üì.[\u0005\u009eª%Ã\u0091?¶\u0086æp\bWAð\u00148v% \u0016".length();
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
f = new Integer[6];
return;
}
break;
default:
var28[var10001] = var45;
if (var2 < var5) {
continue label36;
}

var4 = "u¼\u0095¸³\u0087õ\u009fCDÙ\u0080µØ\u0003\u009e";
var5 = "u¼\u0095¸³\u0087õ\u009fCDÙ\u0080µØ\u0003\u009e".length();
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

var15 = "ú§GQ_xÈmÁ<\u009cD&\u008d3[(5(\rM\u0001Ô\røÝ9\u009f\u001d©ÔózåË¦\u008e\u0084Æ_õgfÍ\u008b\u0095\u0089\u0080\u0014³mN\u009d¤o?Ð";
var17 = "ú§GQ_xÈmÁ<\u009cD&\u008d3[(5(\rM\u0001Ô\røÝ9\u009f\u001d©ÔózåË¦\u008e\u0084Æ_õgfÍ\u008b\u0095\u0089\u0080\u0014³mN\u009d¤o?Ð".length();
var14 = 16;
var24 = -1;
}

var25 = var15.substring(++var24, var24 + var14);
var10001 = 0;
}
}
}

private static Throwable a(Throwable var0) {
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 16802;
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
throw new RuntimeException("su/catlean/bj", var10);
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
throw new RuntimeException("su/catlean/bj" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21949;
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
throw new RuntimeException("su/catlean/bj", var14);
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
throw new RuntimeException("su/catlean/bj" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
