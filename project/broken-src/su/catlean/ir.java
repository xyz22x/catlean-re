package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ir extends i8 {
@NotNull
public static final ir r;
@NotNull
private static final List w;
private static float F;
@NotNull
private static i0 q;
@Nullable
private static re t;
@NotNull
private static final bg z;
@Nullable
private static nr j;
@NotNull
private static final bj J;
@NotNull
private static final bj v;
@NotNull
private static final fd B;
private static final long b = yz.a(425705382796610816L, -128053098784300283L, MethodHandles.lookup().lookupClass()).a(180578683749118L);
private static final String[] c;
private static final String[] e;
private static final Map i = new HashMap(13);
private static final long[] m;
private static final Integer[] n;
private static final Map s;

private ir(char var1, char var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 93240164557204L;
super(b<"g">(1711, 3902340285985332521L ^ var4), 0.0F, var6, 0.0F, 0.0F, 0.0F, d<"q">(21038, 4003523250712105267L ^ var4), null);
}

@Nullable
public final nr O() {
return j;
}

public final void f(@Nullable nr <set-?>) {
j = <set-?>;
}

@Override
public void Y(long var1) {
long var3 = var1 ^ 116290776716647L;
long var10001 = var1 ^ 139412124989938L;
int var5 = (int)((var1 ^ 139412124989938L) >>> 32);
int var6 = (int)((var1 ^ 139412124989938L) << 32 >>> 48);
int var7 = (int)(var10001 << 48 >>> 48);
long var8 = var1 ^ 111425449978190L;
w.clear();

for (y_ var11 : yl.g.l().F(var3)) {
w.add(new re(var11.q(), 0.0F, 0.0F, i0.MODULES, d<"q">(6514, 126120770499632124L ^ var1), null, var8));
if (var1 > 0L && var1 > 0L) {
continue;
}
break;
}

for (jn var12 : yl.g.d().K(var5, (char)var6, var7)) {
w.add(new re(var12.w(), 0.0F, 0.0F, i0.WIDGETS, d<"q">(6514, 126120770499632124L ^ var1), null, var8));
if (var1 < 0L) {
break;
}
}
}

@Override
public void p(@NotNull class_332 context, int mouseX, int mouseY, long a) {
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
// 003: ldc2_w 34939445883507
// 006: lxor
// 007: lstore 6
// 009: dup2
// 00a: ldc2_w 38443269427772
// 00d: lxor
// 00e: lstore 8
// 010: dup2
// 011: ldc2_w 132587743020005
// 014: lxor
// 015: lstore 10
// 017: dup2
// 018: ldc2_w 39651225804900
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 12
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 13
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 14
// 037: pop2
// 038: dup2
// 039: ldc2_w 55302899458674
// 03c: lxor
// 03d: dup2
// 03e: bipush 48
// 040: lushr
// 041: l2i
// 042: istore 15
// 044: dup2
// 045: bipush 16
// 047: lshl
// 048: bipush 32
// 04a: lushr
// 04b: l2i
// 04c: istore 16
// 04e: dup2
// 04f: bipush 48
// 051: lshl
// 052: bipush 48
// 054: lushr
// 055: l2i
// 056: istore 17
// 058: pop2
// 059: dup2
// 05a: ldc2_w 61082805113702
// 05d: lxor
// 05e: lstore 18
// 060: dup2
// 061: ldc2_w 22135879901675
// 064: lxor
// 065: dup2
// 066: bipush 48
// 068: lushr
// 069: l2i
// 06a: istore 20
// 06c: dup2
// 06d: bipush 16
// 06f: lshl
// 070: bipush 48
// 072: lushr
// 073: l2i
// 074: istore 21
// 076: dup2
// 077: bipush 32
// 079: lshl
// 07a: bipush 32
// 07c: lushr
// 07d: l2i
// 07e: istore 22
// 080: pop2
// 081: dup2
// 082: ldc2_w 27182768661316
// 085: lxor
// 086: lstore 23
// 088: dup2
// 089: ldc2_w 0
// 08c: lxor
// 08d: lstore 25
// 08f: dup2
// 090: ldc2_w 97910750751556
// 093: lxor
// 094: lstore 27
// 096: dup2
// 097: ldc2_w 129721350371956
// 09a: lxor
// 09b: lstore 29
// 09d: dup2
// 09e: ldc2_w 55127167163707
// 0a1: lxor
// 0a2: lstore 31
// 0a4: dup2
// 0a5: ldc2_w 117687767941534
// 0a8: lxor
// 0a9: lstore 33
// 0ab: dup2
// 0ac: ldc2_w 18562037465340
// 0af: lxor
// 0b0: lstore 35
// 0b2: pop2
// 0b3: aload 1
// 0b4: sipush 28920
// 0b7: ldc2_w 9134407277301582615
// 0ba: lload 4
// 0bc: lxor
// 0bd: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 0c5: ldc2_w -9085052825499922548
// 0c8: lload 4
// 0ca: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cf: aload 0
// 0d0: aload 1
// 0d1: iload 2
// 0d2: iload 3
// 0d3: lload 25
// 0d5: invokespecial su/catlean/i8.p (Lnet/minecraft/class_332;IIJ)V
// 0d8: astore 52
// 0da: getstatic su/catlean/ir.B Lsu/catlean/fd;
// 0dd: aload 0
// 0de: invokevirtual su/catlean/ir.W ()Lsu/catlean/cu;
// 0e1: ifnull 0f4
// 0e4: ldc 0.5
// 0e6: goto 0f5
// 0e9: ldc2_w -9122065712123611543
// 0ec: lload 4
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: fconst_0
// 0f5: lload 8
// 0f7: dup2_x1
// 0f8: pop2
// 0f9: invokevirtual su/catlean/fd.B (JF)V
// 0fc: aload 0
// 0fd: lload 29
// 0ff: aload 1
// 100: invokespecial su/catlean/ir.w (JLnet/minecraft/class_332;)V
// 103: aconst_null
// 104: putstatic su/catlean/ir.t Lsu/catlean/re;
// 107: aload 0
// 108: invokevirtual su/catlean/ir.y ()F
// 10b: getstatic su/catlean/ir.F F
// 10e: sipush 30630
// 111: ldc2_w 4348294629148939482
// 114: lload 4
// 116: lxor
// 117: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11c: i2f
// 11d: fadd
// 11e: fdiv
// 11f: f2d
// 120: invokestatic java/lang/Math.floor (D)D
// 123: d2f
// 124: f2i
// 125: istore 53
// 127: fconst_0
// 128: fstore 54
// 12a: ldc 15.0
// 12c: fstore 55
// 12e: ldc 3.0
// 130: aload 0
// 131: invokevirtual su/catlean/ir.y ()F
// 134: sipush 6514
// 137: ldc2_w 126234210891774466
// 13a: lload 4
// 13c: lxor
// 13d: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 142: i2f
// 143: fsub
// 144: iload 53
// 146: i2f
// 147: getstatic su/catlean/ir.F F
// 14a: fmul
// 14b: fsub
// 14c: iload 53
// 14e: i2f
// 14f: fdiv
// 150: invokestatic java/lang/Math.max (FF)F
// 153: fstore 56
// 155: getstatic su/catlean/ir.w Ljava/util/List;
// 158: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 15d: astore 57
// 15f: aload 57
// 161: invokeinterface java/util/Iterator.hasNext ()Z 1
// 166: ifeq 675
// 169: aload 57
// 16b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 170: checkcast su/catlean/re
// 173: astore 58
// 175: aload 52
// 177: lload 4
// 179: lconst_0
// 17a: lcmp
// 17b: iflt 76a
// 17e: ifnull 768
// 181: getstatic su/catlean/ir.q Lsu/catlean/i0;
// 184: aload 58
// 186: invokevirtual su/catlean/re.y ()Lsu/catlean/i0;
// 189: if_acmpeq 1ad
// 18c: goto 19a
// 18f: ldc2_w -9122065712123611543
// 192: lload 4
// 194: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 199: athrow
// 19a: aload 52
// 19c: ifnonnull 15f
// 19f: goto 1ad
// 1a2: ldc2_w -9122065712123611543
// 1a5: lload 4
// 1a7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: athrow
// 1ad: fload 54
// 1af: aload 0
// 1b0: invokevirtual su/catlean/ir.e ()F
// 1b3: fadd
// 1b4: bipush 4
// 1b5: i2f
// 1b6: fadd
// 1b7: fstore 59
// 1b9: fload 54
// 1bb: aload 0
// 1bc: invokevirtual su/catlean/ir.e ()F
// 1bf: fadd
// 1c0: bipush 4
// 1c1: i2f
// 1c2: fadd
// 1c3: getstatic su/catlean/ir.F F
// 1c6: fadd
// 1c7: fstore 60
// 1c9: iload 2
// 1ca: i2f
// 1cb: fstore 61
// 1cd: fload 59
// 1cf: fload 61
// 1d1: fcmpg
// 1d2: aload 52
// 1d4: lload 4
// 1d6: lconst_0
// 1d7: lcmp
// 1d8: ifle 204
// 1db: ifnull 202
// 1de: ifgt 22b
// 1e1: goto 1ef
// 1e4: ldc2_w -9122065712123611543
// 1e7: lload 4
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: fload 61
// 1f1: fload 60
// 1f3: fcmpg
// 1f4: goto 202
// 1f7: ldc2_w -9122065712123611543
// 1fa: lload 4
// 1fc: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 201: athrow
// 202: aload 52
// 204: ifnull 228
// 207: ifgt 227
// 20a: goto 218
// 20d: ldc2_w -9122065712123611543
// 210: lload 4
// 212: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 217: athrow
// 218: bipush 1
// 219: goto 22c
// 21c: ldc2_w -9122065712123611543
// 21f: lload 4
// 221: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 226: athrow
// 227: bipush 0
// 228: goto 22c
// 22b: bipush 0
// 22c: ifeq 2de
// 22f: fload 55
// 231: aload 0
// 232: invokevirtual su/catlean/ir.T ()F
// 235: fadd
// 236: sipush 1560
// 239: ldc2_w 233495033382085999
// 23c: lload 4
// 23e: lxor
// 23f: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 244: i2f
// 245: fadd
// 246: fstore 59
// 248: fload 55
// 24a: aload 0
// 24b: invokevirtual su/catlean/ir.T ()F
// 24e: fadd
// 24f: sipush 21734
// 252: ldc2_w 7737529639795783552
// 255: lload 4
// 257: lxor
// 258: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25d: i2f
// 25e: fadd
// 25f: getstatic su/catlean/ir.F F
// 262: fadd
// 263: fstore 60
// 265: iload 3
// 266: i2f
// 267: fstore 61
// 269: fload 59
// 26b: fload 61
// 26d: fcmpg
// 26e: aload 52
// 270: lload 4
// 272: lconst_0
// 273: lcmp
// 274: ifle 2a0
// 277: ifnull 29e
// 27a: ifgt 2c7
// 27d: goto 28b
// 280: ldc2_w -9122065712123611543
// 283: lload 4
// 285: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28a: athrow
// 28b: fload 61
// 28d: fload 60
// 28f: fcmpg
// 290: goto 29e
// 293: ldc2_w -9122065712123611543
// 296: lload 4
// 298: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29d: athrow
// 29e: aload 52
// 2a0: ifnull 2c4
// 2a3: ifgt 2c3
// 2a6: goto 2b4
// 2a9: ldc2_w -9122065712123611543
// 2ac: lload 4
// 2ae: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: athrow
// 2b4: bipush 1
// 2b5: goto 2c8
// 2b8: ldc2_w -9122065712123611543
// 2bb: lload 4
// 2bd: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c2: athrow
// 2c3: bipush 0
// 2c4: goto 2c8
// 2c7: bipush 0
// 2c8: ifeq 2de
// 2cb: aload 58
// 2cd: putstatic su/catlean/ir.t Lsu/catlean/re;
// 2d0: goto 2de
// 2d3: ldc2_w -9122065712123611543
// 2d6: lload 4
// 2d8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2dd: athrow
// 2de: aload 1
// 2df: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 2e2: dup
// 2e3: sipush 4578
// 2e6: ldc2_w 8112519598967859713
// 2e9: lload 4
// 2eb: lxor
// 2ec: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2f4: fload 54
// 2f6: aload 0
// 2f7: invokevirtual su/catlean/ir.e ()F
// 2fa: fadd
// 2fb: bipush 4
// 2fc: i2f
// 2fd: fadd
// 2fe: fload 55
// 300: aload 0
// 301: invokevirtual su/catlean/ir.T ()F
// 304: fadd
// 305: sipush 21734
// 308: ldc2_w 7737529639795783552
// 30b: lload 4
// 30d: lxor
// 30e: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 313: i2f
// 314: fadd
// 315: getstatic su/catlean/ir.F F
// 318: getstatic su/catlean/ir.F F
// 31b: ldc 4.0
// 31d: getstatic su/catlean/ir.t Lsu/catlean/re;
// 320: aload 58
// 322: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 325: ifeq 337
// 328: fconst_2
// 329: goto 338
// 32c: ldc2_w -9122065712123611543
// 32f: lload 4
// 331: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 336: athrow
// 337: fconst_0
// 338: fconst_0
// 339: fconst_1
// 33a: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 33d: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 340: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 343: dup
// 344: sipush 9984
// 347: ldc2_w 6335650394980031726
// 34a: lload 4
// 34c: lxor
// 34d: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 352: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 355: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 358: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 35b: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 35e: dup
// 35f: sipush 9984
// 362: ldc2_w 6335650394980031726
// 365: lload 4
// 367: lxor
// 368: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 36d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 370: fconst_0
// 371: fconst_0
// 372: fconst_0
// 373: sipush 28014
// 376: ldc2_w 2750051270653169175
// 379: lload 4
// 37b: lxor
// 37c: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 381: aconst_null
// 382: astore 37
// 384: istore 38
// 386: fstore 39
// 388: fstore 40
// 38a: fstore 41
// 38c: astore 42
// 38e: astore 43
// 390: fstore 44
// 392: fstore 45
// 394: fstore 46
// 396: fstore 47
// 398: fstore 48
// 39a: fstore 49
// 39c: fstore 50
// 39e: fstore 51
// 3a0: iload 20
// 3a2: i2c
// 3a3: fload 51
// 3a5: fload 50
// 3a7: fload 49
// 3a9: fload 48
// 3ab: fload 47
// 3ad: fload 46
// 3af: fload 45
// 3b1: fload 44
// 3b3: aload 43
// 3b5: aload 42
// 3b7: fload 41
// 3b9: iload 21
// 3bb: i2s
// 3bc: fload 40
// 3be: iload 22
// 3c0: fload 39
// 3c2: iload 38
// 3c4: aload 37
// 3c6: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 3c9: aload 58
// 3cb: aload 52
// 3cd: ifnull 441
// 3d0: invokevirtual su/catlean/re.w ()Ljava/lang/String;
// 3d3: invokevirtual java/lang/String.length ()I
// 3d6: sipush 27721
// 3d9: ldc2_w 6452014699008380723
// 3dc: lload 4
// 3de: lxor
// 3df: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e4: if_icmple 43f
// 3e7: goto 3f5
// 3ea: ldc2_w -9122065712123611543
// 3ed: lload 4
// 3ef: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3f4: athrow
// 3f5: aload 58
// 3f7: invokevirtual su/catlean/re.w ()Ljava/lang/String;
// 3fa: bipush 0
// 3fb: sipush 25958
// 3fe: ldc2_w 5077023020527240707
// 401: lload 4
// 403: lxor
// 404: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 409: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
// 40c: dup
// 40d: sipush 18586
// 410: ldc2_w 5410957913574077297
// 413: lload 4
// 415: lxor
// 416: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 41e: sipush 26193
// 421: ldc2_w 1913786967653866936
// 424: lload 4
// 426: lxor
// 427: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 42c: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
// 431: goto 444
// 434: ldc2_w -9122065712123611543
// 437: lload 4
// 439: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 43e: athrow
// 43f: aload 58
// 441: invokevirtual su/catlean/re.w ()Ljava/lang/String;
// 444: astore 59
// 446: lload 31
// 448: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 44b: aload 1
// 44c: aload 59
// 44e: fload 54
// 450: aload 0
// 451: invokevirtual su/catlean/ir.e ()F
// 454: fadd
// 455: bipush 4
// 456: i2f
// 457: fadd
// 458: getstatic su/catlean/ir.F F
// 45b: fconst_2
// 45c: fdiv
// 45d: fadd
// 45e: fload 55
// 460: aload 0
// 461: invokevirtual su/catlean/ir.T ()F
// 464: fadd
// 465: sipush 21734
// 468: ldc2_w 7737529639795783552
// 46b: lload 4
// 46d: lxor
// 46e: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 473: i2f
// 474: fadd
// 475: getstatic su/catlean/ir.F F
// 478: fconst_2
// 479: fdiv
// 47a: fadd
// 47b: ldc 12.0
// 47d: fadd
// 47e: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 481: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 484: lload 33
// 486: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 489: aload 58
// 48b: invokevirtual su/catlean/re.y ()Lsu/catlean/i0;
// 48e: getstatic su/catlean/l.i [I
// 491: swap
// 492: invokevirtual su/catlean/i0.ordinal ()I
// 495: iaload
// 496: tableswitch 45 1 2 22 39
// 4ac: getstatic su/catlean/ir.J Lsu/catlean/bj;
// 4af: goto 4cb
// 4b2: ldc2_w -9122065712123611543
// 4b5: lload 4
// 4b7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4bc: athrow
// 4bd: getstatic su/catlean/ir.v Lsu/catlean/bj;
// 4c0: goto 4cb
// 4c3: new kotlin/NoWhenBranchMatchedException
// 4c6: dup
// 4c7: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
// 4ca: athrow
// 4cb: astore 60
// 4cd: bipush 0
// 4ce: istore 61
// 4d0: aload 58
// 4d2: invokevirtual su/catlean/re.y ()Lsu/catlean/i0;
// 4d5: getstatic su/catlean/i0.MODULES Lsu/catlean/i0;
// 4d8: aload 52
// 4da: ifnull 521
// 4dd: if_acmpne 506
// 4e0: goto 4ee
// 4e3: ldc2_w -9122065712123611543
// 4e6: lload 4
// 4e8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4ed: athrow
// 4ee: aload 58
// 4f0: invokevirtual su/catlean/re.w ()Ljava/lang/String;
// 4f3: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 4f6: invokevirtual su/catlean/yl.l ()Lsu/catlean/oc;
// 4f9: lload 18
// 4fb: invokevirtual su/catlean/oc.i (J)Lsu/catlean/y_;
// 4fe: invokevirtual su/catlean/y_.q ()Ljava/lang/String;
// 501: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 504: istore 61
// 506: aload 58
// 508: aload 52
// 50a: ifnull 526
// 50d: invokevirtual su/catlean/re.y ()Lsu/catlean/i0;
// 510: getstatic su/catlean/i0.WIDGETS Lsu/catlean/i0;
// 513: goto 521
// 516: ldc2_w -9122065712123611543
// 519: lload 4
// 51b: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 520: athrow
// 521: if_acmpne 53c
// 524: aload 58
// 526: invokevirtual su/catlean/re.w ()Ljava/lang/String;
// 529: getstatic su/catlean/yl.g Lsu/catlean/yl;
// 52c: invokevirtual su/catlean/yl.d ()Lsu/catlean/oe;
// 52f: lload 6
// 531: invokevirtual su/catlean/oe.n (J)Lsu/catlean/jn;
// 534: invokevirtual su/catlean/jn.w ()Ljava/lang/String;
// 537: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 53a: istore 61
// 53c: lload 4
// 53e: lconst_0
// 53f: lcmp
// 540: ifle 617
// 543: iload 61
// 545: ifeq 5cb
// 548: aload 60
// 54a: aload 1
// 54b: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 54e: dup
// 54f: sipush 4578
// 552: ldc2_w 8112519598967859713
// 555: lload 4
// 557: lxor
// 558: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 55d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 560: checkcast org/joml/Matrix3x2f
// 563: fload 54
// 565: aload 0
// 566: invokevirtual su/catlean/ir.e ()F
// 569: fadd
// 56a: f2d
// 56b: ldc2_w 10.0
// 56e: dadd
// 56f: fload 55
// 571: aload 0
// 572: invokevirtual su/catlean/ir.T ()F
// 575: fadd
// 576: f2d
// 577: ldc2_w 18.0
// 57a: dadd
// 57b: fconst_0
// 57c: fconst_0
// 57d: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 580: lload 10
// 582: bipush 0
// 583: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 586: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 589: lload 10
// 58b: sipush 1781
// 58e: ldc2_w 6797134519646791050
// 591: lload 4
// 593: lxor
// 594: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 599: invokevirtual su/catlean/jh.Z (JI)Ljava/awt/Color;
// 59c: fconst_0
// 59d: sipush 29425
// 5a0: ldc2_w 5960548905226260868
// 5a3: lload 4
// 5a5: lxor
// 5a6: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ab: lload 35
// 5ad: aconst_null
// 5ae: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 5b1: lload 4
// 5b3: lconst_0
// 5b4: lcmp
// 5b5: iflt 630
// 5b8: aload 52
// 5ba: ifnonnull 625
// 5bd: goto 5cb
// 5c0: ldc2_w -9122065712123611543
// 5c3: lload 4
// 5c5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5ca: athrow
// 5cb: aload 60
// 5cd: aload 1
// 5ce: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 5d1: dup
// 5d2: sipush 4578
// 5d5: ldc2_w 8112519598967859713
// 5d8: lload 4
// 5da: lxor
// 5db: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 5e3: checkcast org/joml/Matrix3x2f
// 5e6: fload 54
// 5e8: aload 0
// 5e9: invokevirtual su/catlean/ir.e ()F
// 5ec: fadd
// 5ed: f2d
// 5ee: ldc2_w 10.0
// 5f1: dadd
// 5f2: fload 55
// 5f4: aload 0
// 5f5: invokevirtual su/catlean/ir.T ()F
// 5f8: fadd
// 5f9: f2d
// 5fa: ldc2_w 18.0
// 5fd: dadd
// 5fe: fconst_0
// 5ff: fconst_0
// 600: aconst_null
// 601: aconst_null
// 602: fconst_0
// 603: sipush 29282
// 606: ldc2_w 4501051479192391956
// 609: lload 4
// 60b: lxor
// 60c: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 611: lload 35
// 613: aconst_null
// 614: invokestatic su/catlean/bj.p (Lsu/catlean/bj;Lorg/joml/Matrix3x2f;DDFFLjava/awt/Color;Ljava/awt/Color;FIJLjava/lang/Object;)V
// 617: goto 625
// 61a: ldc2_w -9122065712123611543
// 61d: lload 4
// 61f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 624: athrow
// 625: fload 54
// 627: getstatic su/catlean/ir.F F
// 62a: fload 56
// 62c: fadd
// 62d: fadd
// 62e: fstore 54
// 630: fload 54
// 632: getstatic su/catlean/ir.F F
// 635: fadd
// 636: fload 56
// 638: fadd
// 639: lload 4
// 63b: lconst_0
// 63c: lcmp
// 63d: iflt 66e
// 640: aload 0
// 641: invokevirtual su/catlean/ir.y ()F
// 644: aload 52
// 646: ifnull 66d
// 649: fcmpl
// 64a: lload 4
// 64c: lconst_0
// 64d: lcmp
// 64e: ifle 166
// 651: ifle 15f
// 654: goto 662
// 657: ldc2_w -9122065712123611543
// 65a: lload 4
// 65c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 661: athrow
// 662: fconst_0
// 663: fstore 54
// 665: fload 55
// 667: getstatic su/catlean/ir.F F
// 66a: ldc 3.0
// 66c: fadd
// 66d: fadd
// 66e: fstore 55
// 670: aload 52
// 672: ifnonnull 15f
// 675: aload 0
// 676: invokevirtual su/catlean/ir.e ()F
// 679: aload 0
// 67a: invokevirtual su/catlean/ir.T ()F
// 67d: aload 0
// 67e: invokevirtual su/catlean/ir.y ()F
// 681: aload 0
// 682: invokevirtual su/catlean/ir.j ()F
// 685: ldc 5.0
// 687: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 68a: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 68d: dup
// 68e: sipush 2479
// 691: ldc2_w 9110325340002202181
// 694: lload 4
// 696: lxor
// 697: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 69c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 69f: getstatic su/catlean/ir.B Lsu/catlean/fd;
// 6a2: invokevirtual su/catlean/fd.a ()F
// 6a5: iload 15
// 6a7: i2c
// 6a8: swap
// 6a9: iload 16
// 6ab: swap
// 6ac: iload 17
// 6ae: i2s
// 6af: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 6b2: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6b5: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 6b8: dup
// 6b9: sipush 5008
// 6bc: ldc2_w 6720769580686780530
// 6bf: lload 4
// 6c1: lxor
// 6c2: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6c7: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6ca: getstatic su/catlean/ir.B Lsu/catlean/fd;
// 6cd: invokevirtual su/catlean/fd.a ()F
// 6d0: iload 15
// 6d2: i2c
// 6d3: swap
// 6d4: iload 16
// 6d6: swap
// 6d7: iload 17
// 6d9: i2s
// 6da: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 6dd: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 6e0: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 6e3: dup
// 6e4: sipush 5008
// 6e7: ldc2_w 6720769580686780530
// 6ea: lload 4
// 6ec: lxor
// 6ed: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 6f5: getstatic su/catlean/ir.B Lsu/catlean/fd;
// 6f8: invokevirtual su/catlean/fd.a ()F
// 6fb: iload 15
// 6fd: i2c
// 6fe: swap
// 6ff: iload 16
// 701: swap
// 702: iload 17
// 704: i2s
// 705: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 708: lload 27
// 70a: dup2_x1
// 70b: pop2
// 70c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 70f: getstatic java/awt/Color.BLACK Ljava/awt/Color;
// 712: dup
// 713: sipush 5008
// 716: ldc2_w 6720769580686780530
// 719: lload 4
// 71b: lxor
// 71c: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 721: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 724: getstatic su/catlean/ir.B Lsu/catlean/fd;
// 727: invokevirtual su/catlean/fd.a ()F
// 72a: iload 15
// 72c: i2c
// 72d: swap
// 72e: iload 16
// 730: swap
// 731: iload 17
// 733: i2s
// 734: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 737: aload 1
// 738: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 73b: dup
// 73c: sipush 4578
// 73f: ldc2_w 8112519598967859713
// 742: lload 4
// 744: lxor
// 745: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 74a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 74d: fconst_0
// 74e: aconst_null
// 74f: sipush 2072
// 752: ldc2_w 8234607427137088352
// 755: lload 4
// 757: lxor
// 758: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75d: aconst_null
// 75e: invokestatic su/catlean/l7.E (FFFFFLjava/awt/Color;Ljava/awt/Color;JLjava/awt/Color;Ljava/awt/Color;Lorg/joml/Matrix3x2fStack;FLjava/awt/Color;ILjava/lang/Object;)V
// 761: lload 4
// 763: lconst_0
// 764: lcmp
// 765: iflt 768
// 768: aload 52
// 76a: ifnull 7bc
// 76d: aload 0
// 76e: invokevirtual su/catlean/ir.W ()Lsu/catlean/cu;
// 771: dup
// 772: ifnull 7bf
// 775: goto 783
// 778: ldc2_w -9122065712123611543
// 77b: lload 4
// 77d: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 782: athrow
// 783: aload 1
// 784: aload 0
// 785: invokevirtual su/catlean/ir.e ()F
// 788: aload 0
// 789: invokevirtual su/catlean/ir.y ()F
// 78c: fconst_2
// 78d: fdiv
// 78e: fadd
// 78f: ldc 60.0
// 791: fsub
// 792: aload 0
// 793: invokevirtual su/catlean/ir.T ()F
// 796: aload 0
// 797: invokevirtual su/catlean/ir.j ()F
// 79a: bipush 2
// 79b: i2f
// 79c: fdiv
// 79d: fadd
// 79e: ldc 35.0
// 7a0: fsub
// 7a1: iload 2
// 7a2: i2f
// 7a3: lload 23
// 7a5: dup2_x1
// 7a6: pop2
// 7a7: iload 3
// 7a8: i2f
// 7a9: invokeinterface su/catlean/cu.Y (Lnet/minecraft/class_332;FFJFF)V 8
// 7ae: goto 7bc
// 7b1: ldc2_w -9122065712123611543
// 7b4: lload 4
// 7b6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7bb: athrow
// 7bc: goto 7c0
// 7bf: pop
// 7c0: lload 4
// 7c2: lconst_0
// 7c3: lcmp
// 7c4: ifle 7da
// 7c7: getstatic su/catlean/ir.j Lsu/catlean/nr;
// 7ca: dup
// 7cb: ifnull 7e8
// 7ce: iload 12
// 7d0: aload 1
// 7d1: iload 2
// 7d2: iload 3
// 7d3: iload 13
// 7d5: iload 14
// 7d7: invokevirtual su/catlean/nr.O (ILnet/minecraft/class_332;IIII)V
// 7da: goto 7e9
// 7dd: ldc2_w -9122065712123611543
// 7e0: lload 4
// 7e2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7e7: athrow
// 7e8: pop
// 7e9: ldc2_w -9126079954399748152
// 7ec: lload 4
// 7ee: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 7f3: lload 4
// 7f5: lconst_0
// 7f6: lcmp
// 7f7: ifle 801
// 7fa: ifnull 819
// 7fd: bipush 5
// 7fe: anewarray 92
// 801: ldc2_w -9139340199689419505
// 804: lload 4
// 806: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 80b: goto 819
// 80e: ldc2_w -9122065712123611543
// 811: lload 4
// 813: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 818: athrow
// 819: return
}

private final void w(long param1, class_332 param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ir.b J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 84801991177144
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
// 029: ldc2_w 117794359873384
// 02c: lxor
// 02d: lstore 7
// 02f: dup2
// 030: ldc2_w 55010886357965
// 033: lxor
// 034: lstore 9
// 036: dup2
// 037: ldc2_w 40577777586095
// 03a: lxor
// 03b: lstore 11
// 03d: dup2
// 03e: ldc2_w 117980006461473
// 041: lxor
// 042: dup2
// 043: bipush 48
// 045: lushr
// 046: l2i
// 047: istore 13
// 049: dup2
// 04a: bipush 16
// 04c: lshl
// 04d: bipush 32
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
// 05e: pop2
// 05f: bipush 0
// 060: istore 17
// 062: ldc 16.0
// 064: fstore 18
// 066: ldc2_w -3190745813871075873
// 069: lload 1
// 06a: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06f: ldc 3.5
// 071: fstore 19
// 073: aload 3
// 074: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 077: dup
// 078: sipush 10300
// 07b: ldc2_w 3440123806272536969
// 07e: lload 1
// 07f: lxor
// 080: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 085: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 088: aload 0
// 089: invokevirtual su/catlean/ir.e ()F
// 08c: fload 19
// 08e: fadd
// 08f: iload 4
// 091: i2c
// 092: swap
// 093: aload 0
// 094: invokevirtual su/catlean/ir.T ()F
// 097: fload 18
// 099: fadd
// 09a: aload 0
// 09b: invokevirtual su/catlean/ir.y ()F
// 09e: ldc 7.0
// 0a0: fsub
// 0a1: ldc 13.0
// 0a3: fconst_2
// 0a4: fconst_0
// 0a5: fconst_0
// 0a6: fconst_1
// 0a7: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0aa: invokevirtual su/catlean/jh.T ()Ljava/awt/Color;
// 0ad: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
// 0b0: dup
// 0b1: sipush 18462
// 0b4: ldc2_w 2089240293601812906
// 0b7: lload 1
// 0b8: lxor
// 0b9: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c1: getstatic su/catlean/jh.f Lsu/catlean/jh;
// 0c4: invokevirtual su/catlean/jh.F ()Ljava/awt/Color;
// 0c7: fconst_0
// 0c8: iload 5
// 0ca: i2s
// 0cb: fconst_0
// 0cc: iload 6
// 0ce: fconst_0
// 0cf: sipush 2488
// 0d2: ldc2_w 4080496789007267993
// 0d5: lload 1
// 0d6: lxor
// 0d7: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0dc: aconst_null
// 0dd: invokestatic su/catlean/x1.n (Lorg/joml/Matrix3x2fStack;CFFFFFFFFLjava/awt/Color;Ljava/awt/Color;FSFIFILjava/lang/Object;)V
// 0e0: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 0e3: aload 3
// 0e4: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
// 0e7: dup
// 0e8: sipush 4578
// 0eb: ldc2_w 8112439328817477714
// 0ee: lload 1
// 0ef: lxor
// 0f0: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f8: aload 0
// 0f9: invokevirtual su/catlean/ir.e ()F
// 0fc: aload 0
// 0fd: invokevirtual su/catlean/ir.y ()F
// 100: ldc 7.0
// 102: fsub
// 103: ldc 0.5
// 105: fmul
// 106: fadd
// 107: fload 19
// 109: fadd
// 10a: aload 0
// 10b: invokevirtual su/catlean/ir.T ()F
// 10e: fconst_2
// 10f: fadd
// 110: fload 18
// 112: fadd
// 113: ldc 0.5
// 115: ldc 9.0
// 117: bipush 1
// 118: anewarray 338
// 11b: astore 20
// 11d: aload 20
// 11f: bipush 0
// 120: new java/awt/Color
// 123: dup
// 124: sipush 4760
// 127: ldc2_w 7205953809553875884
// 12a: lload 1
// 12b: lxor
// 12c: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 131: bipush 1
// 132: invokespecial java/awt/Color.<init> (IZ)V
// 135: aastore
// 136: aload 20
// 138: lload 11
// 13a: invokevirtual su/catlean/jl.P (Lorg/joml/Matrix3x2fStack;FFFF[Ljava/awt/Color;J)V
// 13d: astore 16
// 13f: lload 7
// 141: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 144: aload 3
// 145: sipush 10395
// 148: ldc2_w 8737911784165065001
// 14b: lload 1
// 14c: lxor
// 14d: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 152: aload 0
// 153: invokevirtual su/catlean/ir.e ()F
// 156: aload 0
// 157: invokevirtual su/catlean/ir.y ()F
// 15a: ldc 7.0
// 15c: fsub
// 15d: ldc 0.25
// 15f: fmul
// 160: fadd
// 161: fload 19
// 163: fadd
// 164: aload 0
// 165: invokevirtual su/catlean/ir.T ()F
// 168: ldc 5.0
// 16a: fadd
// 16b: fload 18
// 16d: fadd
// 16e: getstatic su/catlean/ir.q Lsu/catlean/i0;
// 171: getstatic su/catlean/i0.MODULES Lsu/catlean/i0;
// 174: if_acmpeq 1a8
// 177: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 17a: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 17d: dup
// 17e: sipush 25892
// 181: ldc2_w 4167928485360569503
// 184: lload 1
// 185: lxor
// 186: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 18e: iload 13
// 190: i2c
// 191: iload 14
// 193: ldc 0.5
// 195: iload 15
// 197: i2s
// 198: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 19b: goto 1ab
// 19e: ldc2_w -3227760893369211846
// 1a1: lload 1
// 1a2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a7: athrow
// 1a8: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 1ab: astore 20
// 1ad: aload 20
// 1af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 1b2: lload 1
// 1b3: lconst_0
// 1b4: lcmp
// 1b5: ifle 1f3
// 1b8: aload 20
// 1ba: aload 16
// 1bc: ifnull 23a
// 1bf: lload 9
// 1c1: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 1c4: lload 7
// 1c6: invokestatic su/catlean/b8.f (J)Lsu/catlean/c6;
// 1c9: aload 3
// 1ca: sipush 18991
// 1cd: ldc2_w 8758439022270129048
// 1d0: lload 1
// 1d1: lxor
// 1d2: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d7: aload 0
// 1d8: invokevirtual su/catlean/ir.e ()F
// 1db: aload 0
// 1dc: invokevirtual su/catlean/ir.y ()F
// 1df: ldc 7.0
// 1e1: fsub
// 1e2: ldc 0.75
// 1e4: fmul
// 1e5: fadd
// 1e6: fload 19
// 1e8: fadd
// 1e9: aload 0
// 1ea: invokevirtual su/catlean/ir.T ()F
// 1ed: ldc 5.0
// 1ef: fadd
// 1f0: fload 18
// 1f2: fadd
// 1f3: getstatic su/catlean/ir.q Lsu/catlean/i0;
// 1f6: getstatic su/catlean/i0.WIDGETS Lsu/catlean/i0;
// 1f9: if_acmpeq 23d
// 1fc: goto 209
// 1ff: ldc2_w -3227760893369211846
// 202: lload 1
// 203: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 208: athrow
// 209: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 20c: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 20f: dup
// 210: sipush 23237
// 213: ldc2_w 7519275653328221050
// 216: lload 1
// 217: lxor
// 218: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ir.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 21d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 220: iload 13
// 222: i2c
// 223: iload 14
// 225: ldc 0.5
// 227: iload 15
// 229: i2s
// 22a: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 22d: goto 23a
// 230: ldc2_w -3227760893369211846
// 233: lload 1
// 234: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 239: athrow
// 23a: goto 240
// 23d: getstatic java/awt/Color.WHITE Ljava/awt/Color;
// 240: astore 20
// 242: aload 20
// 244: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 247: aload 20
// 249: lload 9
// 24b: invokevirtual su/catlean/c6.I (Lnet/minecraft/class_332;Ljava/lang/String;FFLjava/awt/Color;J)V
// 24e: return
}

@Override
public void c(float mX, float mY, short a, int button, int a, char a) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 3
// 001: i2l
// 002: bipush 48
// 004: lshl
// 005: iload 5
// 007: i2l
// 008: bipush 32
// 00a: lshl
// 00b: bipush 16
// 00d: lushr
// 00e: lor
// 00f: iload 6
// 011: i2l
// 012: bipush 48
// 014: lshl
// 015: bipush 48
// 017: lushr
// 018: lor
// 019: lstore 7
// 01b: lload 7
// 01d: dup2
// 01e: ldc2_w 0
// 021: lxor
// 022: dup2
// 023: bipush 48
// 025: lushr
// 026: l2i
// 027: istore 9
// 029: dup2
// 02a: bipush 16
// 02c: lshl
// 02d: bipush 32
// 02f: lushr
// 030: l2i
// 031: istore 10
// 033: dup2
// 034: bipush 48
// 036: lshl
// 037: bipush 48
// 039: lushr
// 03a: l2i
// 03b: istore 11
// 03d: pop2
// 03e: dup2
// 03f: ldc2_w 38836403100948
// 042: lxor
// 043: lstore 12
// 045: dup2
// 046: ldc2_w 126023736501908
// 049: lxor
// 04a: lstore 14
// 04c: dup2
// 04d: ldc2_w 76359761823462
// 050: lxor
// 051: dup2
// 052: bipush 32
// 054: lushr
// 055: l2i
// 056: istore 16
// 058: dup2
// 059: bipush 32
// 05b: lshl
// 05c: bipush 48
// 05e: lushr
// 05f: l2i
// 060: istore 17
// 062: dup2
// 063: bipush 48
// 065: lshl
// 066: bipush 48
// 068: lushr
// 069: l2i
// 06a: istore 18
// 06c: pop2
// 06d: dup2
// 06e: ldc2_w 3863036392059
// 071: lxor
// 072: lstore 19
// 074: dup2
// 075: ldc2_w 127291086940760
// 078: lxor
// 079: lstore 21
// 07b: dup2
// 07c: ldc2_w 122723470579105
// 07f: lxor
// 080: lstore 23
// 082: dup2
// 083: ldc2_w 132701681991706
// 086: lxor
// 087: dup2
// 088: bipush 32
// 08a: lushr
// 08b: l2i
// 08c: istore 25
// 08e: dup2
// 08f: bipush 32
// 091: lshl
// 092: bipush 48
// 094: lushr
// 095: l2i
// 096: istore 26
// 098: dup2
// 099: bipush 48
// 09b: lshl
// 09c: bipush 48
// 09e: lushr
// 09f: l2i
// 0a0: istore 27
// 0a2: pop2
// 0a3: pop2
// 0a4: ldc2_w -2799249495878314176
// 0a7: lload 7
// 0a9: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ae: aload 0
// 0af: fload 1
// 0b0: fload 2
// 0b1: iload 9
// 0b3: i2s
// 0b4: iload 4
// 0b6: iload 10
// 0b8: iload 11
// 0ba: i2c
// 0bb: invokespecial su/catlean/i8.c (FFSIIC)V
// 0be: astore 28
// 0c0: aload 28
// 0c2: ifnull 11f
// 0c5: aload 0
// 0c6: invokevirtual su/catlean/ir.W ()Lsu/catlean/cu;
// 0c9: dup
// 0ca: ifnull 11e
// 0cd: goto 0db
// 0d0: ldc2_w -2761955144726106459
// 0d3: lload 7
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: lload 12
// 0dd: fload 1
// 0de: fload 2
// 0df: iload 4
// 0e1: invokeinterface su/catlean/cu.y (JFFI)Z 6
// 0e6: aload 28
// 0e8: ifnull 11b
// 0eb: goto 0f9
// 0ee: ldc2_w -2761955144726106459
// 0f1: lload 7
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: bipush 1
// 0fa: if_icmpne 11a
// 0fd: goto 10b
// 100: ldc2_w -2761955144726106459
// 103: lload 7
// 105: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10a: athrow
// 10b: bipush 1
// 10c: goto 120
// 10f: ldc2_w -2761955144726106459
// 112: lload 7
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: bipush 0
// 11b: goto 120
// 11e: pop
// 11f: bipush 0
// 120: ifeq 124
// 123: return
// 124: iload 5
// 126: iflt 13f
// 129: getstatic su/catlean/ir.j Lsu/catlean/nr;
// 12c: dup
// 12d: ifnull 14d
// 130: iload 16
// 132: fload 1
// 133: fload 2
// 134: iload 17
// 136: i2s
// 137: iload 4
// 139: iload 18
// 13b: i2s
// 13c: invokevirtual su/catlean/nr.q (IFFSIS)V
// 13f: goto 14e
// 142: ldc2_w -2761955144726106459
// 145: lload 7
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: pop
// 14e: iload 3
// 14f: iflt 158
// 152: iload 4
// 154: bipush 1
// 155: if_icmpne 2a4
// 158: getstatic su/catlean/ir.t Lsu/catlean/re;
// 15b: ifnull 19c
// 15e: goto 16c
// 161: ldc2_w -2761955144726106459
// 164: lload 7
// 166: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 16b: athrow
// 16c: new su/catlean/nr
// 16f: dup
// 170: getstatic su/catlean/gr.Config Lsu/catlean/gr;
// 173: lload 14
// 175: fload 1
// 176: fload 2
// 177: getstatic su/catlean/ir.t Lsu/catlean/re;
// 17a: dup
// 17b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 17e: invokevirtual su/catlean/re.w ()Ljava/lang/String;
// 181: getstatic su/catlean/ir.t Lsu/catlean/re;
// 184: dup
// 185: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 188: invokevirtual su/catlean/re.y ()Lsu/catlean/i0;
// 18b: invokespecial su/catlean/nr.<init> (Lsu/catlean/gr;JFFLjava/lang/String;Lsu/catlean/i0;)V
// 18e: goto 2a5
// 191: ldc2_w -2761955144726106459
// 194: lload 7
// 196: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19b: athrow
// 19c: aload 0
// 19d: invokevirtual su/catlean/ir.e ()F
// 1a0: fstore 29
// 1a2: fload 1
// 1a3: aload 0
// 1a4: invokevirtual su/catlean/ir.e ()F
// 1a7: aload 0
// 1a8: invokevirtual su/catlean/ir.y ()F
// 1ab: fadd
// 1ac: fcmpg
// 1ad: aload 28
// 1af: iload 3
// 1b0: iflt 1db
// 1b3: ifnull 1d9
// 1b6: ifgt 202
// 1b9: goto 1c7
// 1bc: ldc2_w -2761955144726106459
// 1bf: lload 7
// 1c1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c6: athrow
// 1c7: fload 29
// 1c9: fload 1
// 1ca: fcmpg
// 1cb: goto 1d9
// 1ce: ldc2_w -2761955144726106459
// 1d1: lload 7
// 1d3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: athrow
// 1d9: aload 28
// 1db: ifnull 1ff
// 1de: ifgt 1fe
// 1e1: goto 1ef
// 1e4: ldc2_w -2761955144726106459
// 1e7: lload 7
// 1e9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ee: athrow
// 1ef: bipush 1
// 1f0: goto 203
// 1f3: ldc2_w -2761955144726106459
// 1f6: lload 7
// 1f8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fd: athrow
// 1fe: bipush 0
// 1ff: goto 203
// 202: bipush 0
// 203: ifeq 2a0
// 206: aload 0
// 207: invokevirtual su/catlean/ir.T ()F
// 20a: fstore 29
// 20c: fload 2
// 20d: aload 0
// 20e: invokevirtual su/catlean/ir.T ()F
// 211: aload 0
// 212: invokevirtual su/catlean/ir.j ()F
// 215: fadd
// 216: fcmpg
// 217: aload 28
// 219: iload 5
// 21b: ifle 246
// 21e: ifnull 244
// 221: ifgt 26d
// 224: goto 232
// 227: ldc2_w -2761955144726106459
// 22a: lload 7
// 22c: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 231: athrow
// 232: fload 29
// 234: fload 2
// 235: fcmpg
// 236: goto 244
// 239: ldc2_w -2761955144726106459
// 23c: lload 7
// 23e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 243: athrow
// 244: aload 28
// 246: ifnull 26a
// 249: ifgt 269
// 24c: goto 25a
// 24f: ldc2_w -2761955144726106459
// 252: lload 7
// 254: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 259: athrow
// 25a: bipush 1
// 25b: goto 26e
// 25e: ldc2_w -2761955144726106459
// 261: lload 7
// 263: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 268: athrow
// 269: bipush 0
// 26a: goto 26e
// 26d: bipush 0
// 26e: ifeq 2a0
// 271: new su/catlean/nr
// 274: dup
// 275: getstatic su/catlean/gr.Window Lsu/catlean/gr;
// 278: fload 1
// 279: lload 23
// 27b: fload 2
// 27c: aconst_null
// 27d: getstatic su/catlean/ir.q Lsu/catlean/i0;
// 280: sipush 30814
// 283: ldc2_w 6604097465991070710
// 286: lload 7
// 288: lxor
// 289: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28e: aconst_null
// 28f: invokespecial su/catlean/nr.<init> (Lsu/catlean/gr;FJFLjava/lang/String;Lsu/catlean/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 292: goto 2a5
// 295: ldc2_w -2761955144726106459
// 298: lload 7
// 29a: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29f: athrow
// 2a0: aconst_null
// 2a1: goto 2a5
// 2a4: aconst_null
// 2a5: putstatic su/catlean/ir.j Lsu/catlean/nr;
// 2a8: iload 4
// 2aa: ifne 351
// 2ad: getstatic su/catlean/ir.t Lsu/catlean/re;
// 2b0: ifnull 351
// 2b3: goto 2c1
// 2b6: ldc2_w -2761955144726106459
// 2b9: lload 7
// 2bb: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c0: athrow
// 2c1: getstatic su/catlean/ir.z Lsu/catlean/bg;
// 2c4: aload 28
// 2c6: ifnull 34d
// 2c9: goto 2d7
// 2cc: ldc2_w -2761955144726106459
// 2cf: lload 7
// 2d1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d6: athrow
// 2d7: iload 5
// 2d9: ifle 33f
// 2dc: sipush 8374
// 2df: ldc2_w 8542875343639534347
// 2e2: lload 7
// 2e4: lxor
// 2e5: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ea: lload 19
// 2ec: invokevirtual su/catlean/bg.c (IJ)Z
// 2ef: ifne 33c
// 2f2: goto 300
// 2f5: ldc2_w -2761955144726106459
// 2f8: lload 7
// 2fa: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ff: athrow
// 300: getstatic su/catlean/ir.t Lsu/catlean/re;
// 303: dup
// 304: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 307: invokevirtual su/catlean/re.w ()Ljava/lang/String;
// 30a: getstatic su/catlean/ir.t Lsu/catlean/re;
// 30d: dup
// 30e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
// 311: invokevirtual su/catlean/re.y ()Lsu/catlean/i0;
// 314: iload 25
// 316: iload 26
// 318: i2s
// 319: iload 27
// 31b: invokestatic su/catlean/io.D (Ljava/lang/String;Lsu/catlean/i0;ISI)V
// 31e: getstatic su/catlean/d2.O Lsu/catlean/d2;
// 321: invokevirtual su/catlean/d2.c ()Lsu/catlean/lp;
// 324: lload 21
// 326: invokevirtual su/catlean/lp.L (J)V
// 329: aload 28
// 32b: ifnonnull 350
// 32e: goto 33c
// 331: ldc2_w -2761955144726106459
// 334: lload 7
// 336: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 33b: athrow
// 33c: getstatic su/catlean/ir.z Lsu/catlean/bg;
// 33f: goto 34d
// 342: ldc2_w -2761955144726106459
// 345: lload 7
// 347: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34c: athrow
// 34d: invokevirtual su/catlean/bg.l ()V
// 350: return
// 351: aload 0
// 352: invokevirtual su/catlean/ir.T ()F
// 355: sipush 29143
// 358: ldc2_w 6579686053916641894
// 35b: lload 7
// 35d: lxor
// 35e: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 363: i2f
// 364: fadd
// 365: fstore 29
// 367: fload 2
// 368: aload 0
// 369: invokevirtual su/catlean/ir.T ()F
// 36c: sipush 1492
// 36f: ldc2_w 4943460865527185004
// 372: lload 7
// 374: lxor
// 375: invokedynamic q (IJ)I bsm=su/catlean/ir.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37a: i2f
// 37b: fadd
// 37c: fcmpg
// 37d: aload 28
// 37f: iload 3
// 380: iflt 3ab
// 383: ifnull 3a9
// 386: ifgt 3d2
// 389: goto 397
// 38c: ldc2_w -2761955144726106459
// 38f: lload 7
// 391: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 396: athrow
// 397: fload 29
// 399: fload 2
// 39a: fcmpg
// 39b: goto 3a9
// 39e: ldc2_w -2761955144726106459
// 3a1: lload 7
// 3a3: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3a8: athrow
// 3a9: aload 28
// 3ab: ifnull 3cf
// 3ae: ifgt 3ce
// 3b1: goto 3bf
// 3b4: ldc2_w -2761955144726106459
// 3b7: lload 7
// 3b9: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3be: athrow
// 3bf: bipush 1
// 3c0: goto 3d3
// 3c3: ldc2_w -2761955144726106459
// 3c6: lload 7
// 3c8: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3cd: athrow
// 3ce: bipush 0
// 3cf: goto 3d3
// 3d2: bipush 0
// 3d3: ifeq 4f8
// 3d6: aload 0
// 3d7: invokevirtual su/catlean/ir.e ()F
// 3da: ldc 3.5
// 3dc: fadd
// 3dd: fstore 29
// 3df: fload 1
// 3e0: aload 0
// 3e1: invokevirtual su/catlean/ir.e ()F
// 3e4: ldc 3.5
// 3e6: fadd
// 3e7: aload 0
// 3e8: invokevirtual su/catlean/ir.y ()F
// 3eb: ldc 7.0
// 3ed: fsub
// 3ee: ldc 0.5
// 3f0: fmul
// 3f1: fadd
// 3f2: fcmpg
// 3f3: aload 28
// 3f5: iload 3
// 3f6: iflt 421
// 3f9: ifnull 41f
// 3fc: ifgt 448
// 3ff: goto 40d
// 402: ldc2_w -2761955144726106459
// 405: lload 7
// 407: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 40c: athrow
// 40d: fload 29
// 40f: fload 1
// 410: fcmpg
// 411: goto 41f
// 414: ldc2_w -2761955144726106459
// 417: lload 7
// 419: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 41e: athrow
// 41f: aload 28
// 421: ifnull 445
// 424: ifgt 444
// 427: goto 435
// 42a: ldc2_w -2761955144726106459
// 42d: lload 7
// 42f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 434: athrow
// 435: bipush 1
// 436: goto 449
// 439: ldc2_w -2761955144726106459
// 43c: lload 7
// 43e: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 443: athrow
// 444: bipush 0
// 445: goto 449
// 448: bipush 0
// 449: iload 6
// 44b: ifle 48a
// 44e: ifeq 465
// 451: getstatic su/catlean/i0.MODULES Lsu/catlean/i0;
// 454: putstatic su/catlean/ir.q Lsu/catlean/i0;
// 457: goto 465
// 45a: ldc2_w -2761955144726106459
// 45d: lload 7
// 45f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 464: athrow
// 465: aload 0
// 466: invokevirtual su/catlean/ir.e ()F
// 469: ldc 3.5
// 46b: fadd
// 46c: aload 0
// 46d: invokevirtual su/catlean/ir.y ()F
// 470: ldc 7.0
// 472: fsub
// 473: ldc 0.5
// 475: fmul
// 476: fadd
// 477: fstore 29
// 479: fload 1
// 47a: aload 0
// 47b: invokevirtual su/catlean/ir.e ()F
// 47e: ldc 3.5
// 480: fadd
// 481: aload 0
// 482: invokevirtual su/catlean/ir.y ()F
// 485: ldc 7.0
// 487: fsub
// 488: fadd
// 489: fcmpg
// 48a: aload 28
// 48c: iload 5
// 48e: ifle 4b9
// 491: ifnull 4b7
// 494: ifgt 4e0
// 497: goto 4a5
// 49a: ldc2_w -2761955144726106459
// 49d: lload 7
// 49f: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4a4: athrow
// 4a5: fload 29
// 4a7: fload 1
// 4a8: fcmpg
// 4a9: goto 4b7
// 4ac: ldc2_w -2761955144726106459
// 4af: lload 7
// 4b1: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4b6: athrow
// 4b7: aload 28
// 4b9: ifnull 4dd
// 4bc: ifgt 4dc
// 4bf: goto 4cd
// 4c2: ldc2_w -2761955144726106459
// 4c5: lload 7
// 4c7: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4cc: athrow
// 4cd: bipush 1
// 4ce: goto 4e1
// 4d1: ldc2_w -2761955144726106459
// 4d4: lload 7
// 4d6: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4db: athrow
// 4dc: bipush 0
// 4dd: goto 4e1
// 4e0: bipush 0
// 4e1: ifeq 4f8
// 4e4: getstatic su/catlean/i0.WIDGETS Lsu/catlean/i0;
// 4e7: putstatic su/catlean/ir.q Lsu/catlean/i0;
// 4ea: goto 4f8
// 4ed: ldc2_w -2761955144726106459
// 4f0: lload 7
// 4f2: invokedynamic Å (Ljava/lang/Object;JJ)Lkotlin/NoWhenBranchMatchedException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 4f7: athrow
// 4f8: return
}

static {
long var27 = b ^ 116974108974201L;
long var10001 = var27 ^ 113035754388498L;
int var29 = (int)((var27 ^ 113035754388498L) >>> 48);
int var30 = (int)((var27 ^ 113035754388498L) << 16 >>> 48);
int var31 = (int)(var10001 << 32 >>> 32);
long var32 = var27 ^ 106867667102365L;
long var34 = var27 ^ 66339882555290L;
long var36 = var27 ^ 30736292976040L;
Cipher var18;
Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var19 = 1; var19 < 8; var19++) {
var10003[var19] = (byte)(var27 << var19 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var25 = new String[16];
int var23 = 0;
String var22 = ".\u0004æ*Q·Þ$\u0004\u000e¡æê¨p\"(ìdÍ~æ\u0088\u009f\u008dE\u0017¦ôðbä\u008dæË\u008a÷\u009fÜê\u008185\u008cï\u001dM\u0081<¨¦P\u0082\u0007ÈN¦ À(\u0011®4^S\n\u0083^íd*K©%FÛöz\u009e!\u0093-Ú-t~°l\u001að\u0010\rU\u0006\u0083\u0097\f8f\r \u0086×üqÍW\u0018¡}÷R\u0015\u0000\u0018\u0019qI´¸cek@ÀîmF{\u0018*Ü\u0010ö\u001c\u0010ÇÂ¶\u0003{\u000fMoÎG2\u0016` ¿\u00960JF\u0099\u0096\u0000\u0000b?P`ÉäpÝð\u0000Aß÷÷ï[e{)ê\u0088¯q \u0019\u001d4W.\bU\u000f>Å\u008f\u0010pV\u0007\u000bÙ\u0090&Ã'ÄMÁ\u008f\u0099³¨çü=Ç\u0010ye¨gèÁ)Ud\u008a\bú2z\u007f\u0006\u0010 \u0080\u001dÚ¢\u00983ÚÒµ\u001b1B¢\u0091T \u008f;\u0005\u000b>\r¥\u0019h\u000f\u0081Å1ùRQvâÍ7hå¾H\u000e¤³Pê\u00adãc\u0010nQpN&âl\u008eÈ@¥Z\u0089Ô\"\u0098(g\u0010ôÕÄGÕ0{x´\u007f')÷`%\u0081Ü3 Qó\u001fíÚsÈ)L\u0003¼ò4ð9Èq§\u0088\u0010\u0099¶¡rÉLvØ\u0092\u0090³Ú3¢|¶";
int var24 = ".\u0004æ*Q·Þ$\u0004\u000e¡æê¨p\"(ìdÍ~æ\u0088\u009f\u008dE\u0017¦ôðbä\u008dæË\u008a÷\u009fÜê\u008185\u008cï\u001dM\u0081<¨¦P\u0082\u0007ÈN¦ À(\u0011®4^S\n\u0083^íd*K©%FÛöz\u009e!\u0093-Ú-t~°l\u001að\u0010\rU\u0006\u0083\u0097\f8f\r \u0086×üqÍW\u0018¡}÷R\u0015\u0000\u0018\u0019qI´¸cek@ÀîmF{\u0018*Ü\u0010ö\u001c\u0010ÇÂ¶\u0003{\u000fMoÎG2\u0016` ¿\u00960JF\u0099\u0096\u0000\u0000b?P`ÉäpÝð\u0000Aß÷÷ï[e{)ê\u0088¯q \u0019\u001d4W.\bU\u000f>Å\u008f\u0010pV\u0007\u000bÙ\u0090&Ã'ÄMÁ\u008f\u0099³¨çü=Ç\u0010ye¨gèÁ)Ud\u008a\bú2z\u007f\u0006\u0010 \u0080\u001dÚ¢\u00983ÚÒµ\u001b1B¢\u0091T \u008f;\u0005\u000b>\r¥\u0019h\u000f\u0081Å1ùRQvâÍ7hå¾H\u000e¤³Pê\u00adãc\u0010nQpN&âl\u008eÈ@¥Z\u0089Ô\"\u0098(g\u0010ôÕÄGÕ0{x´\u007f')÷`%\u0081Ü3 Qó\u001fíÚsÈ)L\u0003¼ò4ð9Èq§\u0088\u0010\u0099¶¡rÉLvØ\u0092\u0090³Ú3¢|¶"
.length();
char var21 = 16;
int var40 = -1;

label64:
while (true) {
String var41 = var22.substring(++var40, var40 + var21);
byte var46 = -1;

while (true) {
byte[] var26 = var18.doFinal(var41.getBytes("ISO-8859-1"));
String var55 = b(var26).intern();
switch (var46) {
case 0:
var25[var23++] = var55;
if ((var40 += var21) >= var24) {
c = var25;
e = new String[16];
s = new HashMap(13);
Cipher var7;
var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var8 = 1; var8 < 8; var8++) {
var10003[var8] = (byte)(var27 << var8 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var13 = new long[20];
int var10 = 0;
String var11 = "Ù7s\u001cT Y~{ýª[õ/Û³Ö\u00933\u0003\u0097Ú¨Ñâ\u0019`\u00029YôÛ½Ù\u0004]¤Êa\u0018úÝLaúk\u0096â8\u0098\u009eKæ5\u007fàiuF¥¯~%c ë\u0088}\u0007\u0099ð)\u001e¸àX(\u0082ìcÄg\u0003ò\u001a\u0084O\fÐ1\u001bÙgës+ÿ%÷CvÝr~ÕM\u0093\u001d-wfÖÙO\b0\u001cçû¥´\u008fC°À\u0003G~°\u0096\u0015\u000e~þ!z×Ë;\u00998\u008dì5";
int var12 = "Ù7s\u001cT Y~{ýª[õ/Û³Ö\u00933\u0003\u0097Ú¨Ñâ\u0019`\u00029YôÛ½Ù\u0004]¤Êa\u0018úÝLaúk\u0096â8\u0098\u009eKæ5\u007fàiuF¥¯~%c ë\u0088}\u0007\u0099ð)\u001e¸àX(\u0082ìcÄg\u0003ò\u001a\u0084O\fÐ1\u001bÙgës+ÿ%÷CvÝr~ÕM\u0093\u001d-wfÖÙO\b0\u001cçû¥´\u008fC°À\u0003G~°\u0096\u0015\u000e~þ!z×Ë;\u00998\u008dì5"
.length();
byte var9 = 0;

label46:
while (true) {
byte var50 = var9;
var9 += 8;
byte[] var14 = var11.substring(var50, var9).getBytes("ISO-8859-1");
long[] var44 = var13;
int var51 = var10++;
long var59 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
byte var64 = -1;

while (true) {
long var15 = var59;
byte[] var17 = var7.doFinal(
new byte[]{
(byte)(var15 >>> 56),
(byte)(var15 >>> 48),
(byte)(var15 >>> 40),
(byte)(var15 >>> 32),
(byte)(var15 >>> 24),
(byte)(var15 >>> 16),
(byte)(var15 >>> 8),
(byte)var15
}
);
long var67 = (var17[0] & 255L) << 56
| (var17[1] & 255L) << 48
| (var17[2] & 255L) << 40
| (var17[3] & 255L) << 32
| (var17[4] & 255L) << 24
| (var17[5] & 255L) << 16
| (var17[6] & 255L) << 8
| var17[7] & 255L;
switch (var64) {
case 0:
var44[var51] = var67;
if (var9 >= var12) {
m = var13;
n = new Integer[20];
Cipher var2;
var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var27 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var3 = 1; var3 < 8; var3++) {
var10003[var3] = (byte)(var27 << var3 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long var4 = -9069110544338080271L;
byte[] var6 = var2.doFinal(
new byte[]{
(byte)(var4 >>> 56), (byte)(var4 >>> 48), (byte)(var4 >>> 40), (byte)(var4 >>> 32), (byte)(var4 >>> 24), (byte)(var4 >>> 16), (byte)(var4 >>> 8), (byte)var4
}
);
long var62 = (var6[0] & 255L) << 56
| (var6[1] & 255L) << 48
| (var6[2] & 255L) << 40
| (var6[3] & 255L) << 32
| (var6[4] & 255L) << 24
| (var6[5] & 255L) << 16
| (var6[6] & 255L) << 8
| var6[7] & 255L;
byte var53 = -1;
long var0 = var62;
r = new ir((char)var29, (char)var30, var31);
w = new ArrayList();
F = 40.0F;
q = i0.MODULES;
z = new bg();
J = new bj(b<"g">(20107, 5820410720058016061L ^ var27), d<"q">(28926, 6121991817943558099L ^ var27), d<"q">(28082, 7913123341797571223L ^ var27), var32);
v = new bj(b<"g">(15541, 2592014003860370190L ^ var27), d<"q">(28082, 7913123341797571223L ^ var27), d<"q">(28082, 7913123341797571223L ^ var27), var32);
B = new fd(_s.OUT_QUINT, var0, var34);
r.Y(var36);
return;
}
break;
default:
var44[var51] = var67;
if (var9 < var12) {
continue label46;
}

var11 = "\u0086'\u009cw,!\u0097\u0089ÅÛZ({I\rÄ";
var12 = "\u0086'\u009cw,!\u0097\u0089ÅÛZ({I\rÄ".length();
var9 = 0;
}

byte var52 = var9;
var9 += 8;
var14 = var11.substring(var52, var9).getBytes("ISO-8859-1");
var44 = var13;
var51 = var10++;
var59 = (var14[0] & 255L) << 56
| (var14[1] & 255L) << 48
| (var14[2] & 255L) << 40
| (var14[3] & 255L) << 32
| (var14[4] & 255L) << 24
| (var14[5] & 255L) << 16
| (var14[6] & 255L) << 8
| var14[7] & 255L;
var64 = 0;
}
}
}

var21 = var22.charAt(var40);
break;
default:
var25[var23++] = var55;
if ((var40 += var21) < var24) {
var21 = var22.charAt(var40);
continue label64;
}

var22 = "2e\tùäïý(l²\u0081\u009a\u0005\u0013t2\u0018V'\u001cü[eV.#\u0099oë@á\u0000±qV\u0083[t0\u0086ã";
var24 = "2e\tùäïý(l²\u0081\u009a\u0005\u0013t2\u0018V'\u001cü[eV.#\u0099oë@á\u0000±qV\u0083[t0\u0086ã".length();
var21 = 16;
var40 = -1;
}

var41 = var22.substring(++var40, var40 + var21);
var46 = 0;
}
}
}

private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 15337;
if (e[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])i.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
i.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ir", var10);
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
e[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return e[var5];
}

private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
String var7 = b(var4, var5);
MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
throw new RuntimeException("su/catlean/ir" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int d(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 9087;
if (n[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = m[var3];
byte[] var7 = new byte[]{
(byte)(var5 >>> 56), (byte)(var5 >>> 48), (byte)(var5 >>> 40), (byte)(var5 >>> 32), (byte)(var5 >>> 24), (byte)(var5 >>> 16), (byte)(var5 >>> 8), (byte)var5
};
Long var8 = Thread.currentThread().threadId();
Object[] var9 = (Object[])s.get(var8);

byte[] var10;
try {
if (var9 == null) {
var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
s.put(var8, var9);
}

DESKeySpec var11 = new DESKeySpec(var4);
SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
Cipher var13 = (Cipher)var9[0];
var13.init(2, var12, (IvParameterSpec)var9[2]);
var10 = var13.doFinal(var7);
} catch (Exception var14) {
throw new RuntimeException("su/catlean/ir", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
n[var3] = var15;
}

return n[var3];
}

private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
int var4 = (Integer)var3[0];
long var5 = (Long)var3[1];
int var7 = d(var4, var5);
MethodHandle var8 = MethodHandles.constant(int.class, var7);
var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
return var7;
}

private static CallSite d(Lookup var0, String var1, MethodType var2) {
MutableCallSite var3 = new MutableCallSite(var2);

try {
var3.setTarget(
MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2)
);
return var3;
} catch (Exception var5) {
throw new RuntimeException("su/catlean/ir" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
