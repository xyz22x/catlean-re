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

public final class xw extends f6 {
@NotNull
private c2 t;
@NotNull
private final fd l;
private static String[] Y;
private static final long a = yz.a(-8482620632106143659L, -21771227850793055L, MethodHandles.lookup().lookupClass()).a(265861758158731L);
private static final String[] c;
private static final String[] d;
private static final Map b = new HashMap(13);
private static final long[] e;
private static final Integer[] f;
private static final Map g;
private static final long h;

public xw(long a, @NotNull c2 proxy) {
ax = a ^ ax;
long var4 = ax ^ 20483073149542L;
Intrinsics.checkNotNullParameter(proxy, a<"e">(25125, 2760494011942793595L ^ ax));
super();
this.t = proxy;
this.l = new fd(_s.OUT_QUINT, h, var4);
}

@NotNull
public final c2 b() {
return this.t;
}

public final void J(long a, @NotNull c2 <set-?>) {
ax = a ^ ax;
Intrinsics.checkNotNullParameter(<set-?>, a<"e">(19849, 4432835804135997759L ^ ax));
this.t = <set-?>;
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
// 02a: ldc2_w 97956880838355
// 02d: lxor
// 02e: lstore 13
// 030: dup2
// 031: ldc2_w 15727589290443
// 034: lxor
// 035: lstore 15
// 037: dup2
// 038: ldc2_w 1638017753221
// 03b: lxor
// 03c: lstore 17
// 03e: dup2
// 03f: ldc2_w 81101117301204
// 042: lxor
// 043: lstore 19
// 045: dup2
// 046: ldc2_w 16131101211356
// 049: lxor
// 04a: lstore 21
// 04c: dup2
// 04d: ldc2_w 81010294496925
// 050: lxor
// 051: dup2
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 23
// 058: dup2
// 059: bipush 16
// 05b: lshl
// 05c: bipush 32
// 05e: lushr
// 05f: l2i
// 060: istore 24
// 062: dup2
// 063: bipush 48
// 065: lshl
// 066: bipush 48
// 068: lushr
// 069: l2i
// 06a: istore 25
// 06c: pop2
// 06d: pop2
// 06e: ldc2_w 9044059772724316545
// 071: lload 1
// 072: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 077: aload 3
// 078: sipush 27871
// 07b: ldc2_w 5211830356582247105
// 07e: lload 1
// 07f: lxor
// 080: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/xw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 088: astore 26
// 08a: fload 4
// 08c: fload 6
// 08e: fcmpg
// 08f: aload 26
// 091: ifnonnull 0b9
// 094: ifgt 0e0
// 097: goto 0a4
// 09a: ldc2_w 9044212019749889784
// 09d: lload 1
// 09e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a3: athrow
// 0a4: fload 6
// 0a6: fload 4
// 0a8: ldc 70.0
// 0aa: fadd
// 0ab: fcmpg
// 0ac: goto 0b9
// 0af: ldc2_w 9044212019749889784
// 0b2: lload 1
// 0b3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0b8: athrow
// 0b9: aload 26
// 0bb: ifnonnull 0dd
// 0be: ifgt 0dc
// 0c1: goto 0ce
// 0c4: ldc2_w 9044212019749889784
// 0c7: lload 1
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: bipush 1
// 0cf: goto 0e1
// 0d2: ldc2_w 9044212019749889784
// 0d5: lload 1
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: bipush 0
// 0dd: goto 0e1
// 0e0: bipush 0
// 0e1: lload 1
// 0e2: lconst_0
// 0e3: lcmp
// 0e4: ifle 0ef
// 0e7: ifeq 16b
// 0ea: fload 5
// 0ec: fload 7
// 0ee: fcmpg
// 0ef: aload 26
// 0f1: lload 1
// 0f2: lconst_0
// 0f3: lcmp
// 0f4: iflt 12e
// 0f7: ifnonnull 12c
// 0fa: goto 107
// 0fd: ldc2_w 9044212019749889784
// 100: lload 1
// 101: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 106: athrow
// 107: ifgt 153
// 10a: goto 117
// 10d: ldc2_w 9044212019749889784
// 110: lload 1
// 111: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 116: athrow
// 117: fload 7
// 119: fload 5
// 11b: ldc 25.0
// 11d: fadd
// 11e: fcmpg
// 11f: goto 12c
// 122: ldc2_w 9044212019749889784
// 125: lload 1
// 126: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12b: athrow
// 12c: aload 26
// 12e: ifnonnull 150
// 131: ifgt 14f
// 134: goto 141
// 137: ldc2_w 9044212019749889784
// 13a: lload 1
// 13b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 140: athrow
// 141: bipush 1
// 142: goto 154
// 145: ldc2_w 9044212019749889784
// 148: lload 1
// 149: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14e: athrow
// 14f: bipush 0
// 150: goto 154
// 153: bipush 0
// 154: lload 1
// 155: lconst_0
// 156: lcmp
// 157: iflt 15e
// 15a: ifeq 16b
// 15d: bipush 1
// 15e: goto 16c
// 161: ldc2_w 9044212019749889784
// 164: lload 1
// 165: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16a: athrow
// 16b: bipush 0
// 16c: istore 27
// 16e: aload 0
// 16f: getfield su/catlean/xw.l Lsu/catlean/fd;
// 172: iload 27
// 174: ifeq 185
// 177: fconst_1
// 178: goto 186
// 17b: ldc2_w 9044212019749889784
// 17e: lload 1
// 17f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 184: athrow
// 185: fconst_0
// 186: lload 13
// 188: dup2_x1
// 189: pop2
// 18a: invokevirtual su/catlean/fd.B (JF)V
// 18d: lload 1
// 18e: lconst_0
// 18f: lcmp
// 190: iflt 1af
// 193: iload 27
// 195: ifeq 1af
// 198: getstatic su/catlean/il.r Lsu/catlean/il;
// 19b: aload 0
// 19c: checkcast su/catlean/f6
// 19f: invokevirtual su/catlean/il.v (Lsu/catlean/f6;)V
// 1a2: goto 1af
// 1a5: ldc2_w 9044212019749889784
// 1a8: lload 1
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1b2: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1b5: invokevirtual su/catlean/jh.i ()Ljava/awt/Color;
// 1b8: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1bb: invokevirtual su/catlean/jh.j ()Ljava/awt/Color;
// 1be: aload 0
// 1bf: getfield su/catlean/xw.t Lsu/catlean/c2;
// 1c2: getstatic su/catlean/jg.l Lsu/catlean/jg;
// 1c5: invokevirtual su/catlean/jg.N ()Lsu/catlean/c2;
// 1c8: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 1cb: ifeq 1dc
// 1ce: fconst_1
// 1cf: goto 1dd
// 1d2: ldc2_w 9044212019749889784
// 1d5: lload 1
// 1d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1db: athrow
// 1dc: fconst_0
// 1dd: lload 8
// 1df: dup2_x2
// 1e0: pop2
// 1e1: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 1e4: astore 28
// 1e6: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1e9: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1ec: invokevirtual su/catlean/jh.h ()Ljava/awt/Color;
// 1ef: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 1f2: invokevirtual su/catlean/jh.Z ()Ljava/awt/Color;
// 1f5: aload 0
// 1f6: getfield su/catlean/xw.t Lsu/catlean/c2;
// 1f9: getstatic su/catlean/jg.l Lsu/catlean/jg;
// 1fc: invokevirtual su/catlean/jg.N ()Lsu/catlean/c2;
// 1ff: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 202: ifeq 213
// 205: fconst_1
// 206: goto 214
// 209: ldc2_w 9044212019749889784
// 20c: lload 1
// 20d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 212: athrow
// 213: fconst_0
// 214: lload 8
// 216: dup2_x2
// 217: pop2
// 218: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 21b: astore 29
// 21d: aload 3
// 21e: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 221: dup
// 222: sipush 4685
// 225: ldc2_w 3806937328228029525
// 228: lload 1
// 229: lxor
// 22a: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/xw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 22f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 232: fload 4
// 234: ldc 4.0
// 236: fadd
// 237: iload 10
// 239: i2c
// 23a: swap
// 23b: fload 5
// 23d: ldc 70.0
// 23f: ldc 25.0
// 241: fconst_2
// 242: ldc 2.5
// 244: aload 0
// 245: getfield su/catlean/xw.l Lsu/catlean/fd;
// 248: invokevirtual su/catlean/fd.a ()F
// 24b: fadd
// 24c: fconst_1
// 24d: fconst_1
// 24e: aload 28
// 250: aload 29
// 252: fconst_0
// 253: iload 11
// 255: i2s
// 256: fconst_0
// 257: iload 12
// 259: fconst_0
// 25a: sipush 27055
// 25d: ldc2_w 5549819729214593860
// 260: lload 1
// 261: lxor
// 262: invokedynamic y (IJ)I bsm=su/catlean/xw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 267: aconst_null
// 268: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 26b: lload 19
// 26d: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 270: aload 3
// 271: aload 0
// 272: getfield su/catlean/xw.t Lsu/catlean/c2;
// 275: invokevirtual su/catlean/c2.j ()Ljava/lang/String;
// 278: fload 4
// 27a: ldc 6.0
// 27c: fadd
// 27d: lload 15
// 27f: dup2_x1
// 280: pop2
// 281: fload 5
// 283: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 286: dup
// 287: sipush 18144
// 28a: ldc2_w 1273353622452011258
// 28d: lload 1
// 28e: lxor
// 28f: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/xw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 294: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 297: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 29a: lload 19
// 29c: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 29f: aload 3
// 2a0: aload 0
// 2a1: getfield su/catlean/xw.t Lsu/catlean/c2;
// 2a4: invokevirtual su/catlean/c2.c ()Ljava/lang/String;
// 2a7: fload 4
// 2a9: ldc 6.0
// 2ab: fadd
// 2ac: lload 15
// 2ae: dup2_x1
// 2af: pop2
// 2b0: fload 5
// 2b2: ldc 11.0
// 2b4: fadd
// 2b5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2b8: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 2bb: dup
// 2bc: sipush 15561
// 2bf: ldc2_w 561612573102275280
// 2c2: lload 1
// 2c3: lxor
// 2c4: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/xw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2cc: iload 23
// 2ce: i2c
// 2cf: iload 24
// 2d1: ldc 0.7
// 2d3: iload 25
// 2d5: i2s
// 2d6: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 2d9: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 2dc: aload 0
// 2dd: getfield su/catlean/xw.t Lsu/catlean/c2;
// 2e0: invokevirtual su/catlean/c2.o ()I
// 2e3: aload 26
// 2e5: ifnonnull 330
// 2e8: tableswitch 65 -2 -1 49 34
// 300: ldc2_w 9044212019749889784
// 303: lload 1
// 304: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 309: athrow
// 30a: ldc "-"
// 30c: goto 342
// 30f: ldc2_w 9044212019749889784
// 312: lload 1
// 313: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 318: athrow
// 319: sipush 12172
// 31c: ldc2_w 7716049223976118675
// 31f: lload 1
// 320: lxor
// 321: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/xw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 326: goto 342
// 329: aload 0
// 32a: getfield su/catlean/xw.t Lsu/catlean/c2;
// 32d: invokevirtual su/catlean/c2.o ()I
// 330: sipush 8094
// 333: ldc2_w 7107907938771720578
// 336: lload 1
// 337: lxor
// 338: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/xw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33d: invokedynamic makeConcatWithConstants (ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 342: astore 30
// 344: lload 21
// 346: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 349: lload 17
// 34b: aload 30
// 34d: invokevirtual su/catlean/c6.D (JLjava/lang/String;)F
// 350: fstore 31
// 352: aload 3
// 353: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 356: dup
// 357: sipush 7795
// 35a: ldc2_w 6597368598369523812
// 35d: lload 1
// 35e: lxor
// 35f: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/xw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 364: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 367: fload 4
// 369: ldc 67.0
// 36b: fadd
// 36c: fload 31
// 36e: fsub
// 36f: iload 10
// 371: i2c
// 372: swap
// 373: fload 5
// 375: fconst_2
// 376: fadd
// 377: fload 31
// 379: ldc 4.0
// 37b: fadd
// 37c: ldc 8.0
// 37e: fconst_2
// 37f: fconst_2
// 380: ldc 0.15
// 382: fconst_1
// 383: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 386: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 389: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 38c: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 38f: fconst_0
// 390: iload 11
// 392: i2s
// 393: fconst_0
// 394: iload 12
// 396: fconst_0
// 397: sipush 5760
// 39a: ldc2_w 6230160073010324586
// 39d: lload 1
// 39e: lxor
// 39f: invokedynamic y (IJ)I bsm=su/catlean/xw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a4: aconst_null
// 3a5: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 3a8: lload 21
// 3aa: invokestatic su/catlean/b8.d (J)Lsu/catlean/c6;
// 3ad: aload 3
// 3ae: aload 30
// 3b0: fload 4
// 3b2: ldc 68.0
// 3b4: fadd
// 3b5: fload 31
// 3b7: fsub
// 3b8: lload 15
// 3ba: dup2_x1
// 3bb: pop2
// 3bc: fload 5
// 3be: ldc 0.5
// 3c0: fadd
// 3c1: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 3c4: dup
// 3c5: sipush 15561
// 3c8: ldc2_w 561612573102275280
// 3cb: lload 1
// 3cc: lxor
// 3cd: invokedynamic e (IJ)Ljava/lang/String; bsm=su/catlean/xw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3d2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 3d5: invokevirtual su/catlean/c6.e (Lnet/minecraft/class_332;Ljava/lang/String;JFFLjava/awt/Color;)V
// 3d8: lload 1
// 3d9: lconst_0
// 3da: lcmp
// 3db: ifle 3f7
// 3de: ldc2_w 9058670983393469223
// 3e1: lload 1
// 3e2: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e7: ifnull 404
// 3ea: bipush 2
// 3eb: anewarray 9
// 3ee: ldc2_w 9048403126066343900
// 3f1: lload 1
// 3f2: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f7: goto 404
// 3fa: ldc2_w 9044212019749889784
// 3fd: lload 1
// 3fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 403: athrow
// 404: return
}

@Override
public boolean P(float x, float y, int button, long a) {
return false;
}

public static void R(String[] var0) {
Y = var0;
}

public static String[] I() {
return Y;
}

static {
long var25 = a ^ 42822058745394L;
vm.a<"Å">(null, 3583255139004294132L, var25);
Cipher var16;
Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var17 = 1; var17 < 8; var17++) {
var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var23 = new String[9];
int var21 = 0;
String var20 = "ñÍøÞÃwãw_ì²\u009eÑÉjÊ\u0010\u00073Â\u001f\u001b±5&ïö\u0091\u008dºø\u007fp\u0010É\u009c\u0005 G#«ñt\u007fÄ\\3\u0005X(\u0010ÈK£\u0013\u0089K/]Ç \fØG4\u0095\u009a\u0010ó-ÌÇBfª\u0087+\u00180M|Â7\u001f\u0010ò1obíi\u007f_{Ùè\u0088*Oõº\u0010Ky\u0018lþëq\r\u0015sìèûõ\u0010^";
int var22 = "ñÍøÞÃwãw_ì²\u009eÑÉjÊ\u0010\u00073Â\u001f\u001b±5&ïö\u0091\u008dºø\u007fp\u0010É\u009c\u0005 G#«ñt\u007fÄ\\3\u0005X(\u0010ÈK£\u0013\u0089K/]Ç \fØG4\u0095\u009a\u0010ó-ÌÇBfª\u0087+\u00180M|Â7\u001f\u0010ò1obíi\u007f_{Ùè\u0088*Oõº\u0010Ky\u0018lþëq\r\u0015sìèûõ\u0010^"
.length();
char var19 = 16;
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
d = new String[9];
g = new HashMap(13);
Cipher var5;
var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var6 = 1; var6 < 8; var6++) {
var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var11 = new long[2];
int var8 = 0;
String var9 = "ÒÚËë!\u0083¶mò±\u0010\u0084Ò¹\u0086\u0098";
int var10 = "ÒÚËë!\u0083¶mò±\u0010\u0084Ò¹\u0086\u0098".length();
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

e = var11;
f = new Integer[2];
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var2 = -5825056215544704214L;
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
h = var45;
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

var20 = "\u0082s\u0019ÙB\u001a8Óçxfã\u0098Ã=\u001a\u000eÖs8HÂd¡\u0018Þ¶ì\u000f¸`x\u0014û\u008fd.Z\u0019\u0016ö\u008eäÖ½ÂËúC";
var22 = "\u0082s\u0019ÙB\u001a8Óçxfã\u0098Ã=\u001a\u000eÖs8HÂd¡\u0018Þ¶ì\u000f¸`x\u0014û\u008fd.Z\u0019\u0016ö\u008eäÖ½ÂËúC".length();
var19 = 24;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15096;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])b.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
b.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/xw", var10);
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
throw new RuntimeException("su/catlean/xw" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int b(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 19980;
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
throw new RuntimeException("su/catlean/xw", var14);
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
throw new RuntimeException("su/catlean/xw" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
