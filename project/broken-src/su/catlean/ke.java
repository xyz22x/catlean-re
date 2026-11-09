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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class ke extends _g {
@NotNull
public static final ke a;
static final KProperty[] o;
@NotNull
private static final cs J;
@NotNull
private static final cs T;
@NotNull
private static final cs w;
@NotNull
private static final c8 y;
@NotNull
private static final Color x;
@NotNull
private static final List U;
private static final long b = yz.a(-7616602262718149376L, -4904436483192952751L, MethodHandles.lookup().lookupClass()).a(195494187096868L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private ke(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 91674859979642L;
super(b<"g">(1306, 7158463278618855605L ^ var1), jt.F(), null, 4, null, var3);
}

private final Color W(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 29522969800354L;
return (Color)J.E(this, var3, o[0]);
}

private final Color Z(short var1, short var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
long var6 = var4 ^ 100744070729704L;
return (Color)T.E(this, var6, o[1]);
}

private final Color a(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 6356652707349L;
return (Color)w.E(this, var3, o[2]);
}

private final int I(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 68358351172292L;
return ((Number)y.E(this, var3, o[3])).intValue();
}

@Override
public void O(long var1) {
U.clear();
}

@Override
public void b(long var1) {
U.clear();
}

@Flow
private final void I(TickEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ke.b J
// 003: ldc2_w 124848803840712
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 110120727866298
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 111447809040653
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 47922244739182
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 41408213875001
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 16939170823176
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 117563202978084
// 030: lxor
// 031: dup2
// 032: bipush 48
// 034: lushr
// 035: l2i
// 036: istore 14
// 038: dup2
// 039: bipush 16
// 03b: lshl
// 03c: bipush 48
// 03e: lushr
// 03f: l2i
// 040: istore 15
// 042: dup2
// 043: bipush 32
// 045: lshl
// 046: bipush 32
// 048: lushr
// 049: l2i
// 04a: istore 16
// 04c: pop2
// 04d: dup2
// 04e: ldc2_w 138141074445449
// 051: lxor
// 052: dup2
// 053: bipush 48
// 055: lushr
// 056: l2i
// 057: istore 17
// 059: dup2
// 05a: bipush 16
// 05c: lshl
// 05d: bipush 32
// 05f: lushr
// 060: l2i
// 061: istore 18
// 063: dup2
// 064: bipush 48
// 066: lshl
// 067: bipush 48
// 069: lushr
// 06a: l2i
// 06b: istore 19
// 06d: pop2
// 06e: dup2
// 06f: ldc2_w 37767404875763
// 072: lxor
// 073: lstore 20
// 075: dup2
// 076: ldc2_w 75329220371868
// 079: lxor
// 07a: lstore 22
// 07c: dup2
// 07d: ldc2_w 70507027003879
// 080: lxor
// 081: lstore 24
// 083: dup2
// 084: ldc2_w 28411063800062
// 087: lxor
// 088: lstore 26
// 08a: dup2
// 08b: ldc2_w 9166950665779
// 08e: lxor
// 08f: lstore 28
// 091: dup2
// 092: ldc2_w 80116228967414
// 095: lxor
// 096: lstore 30
// 098: dup2
// 099: ldc2_w 15372471871893
// 09c: lxor
// 09d: lstore 32
// 09f: pop2
// 0a0: ldc2_w 3966202490003666576
// 0a3: lload 2
// 0a4: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a9: astore 34
// 0ab: aload 0
// 0ac: lload 6
// 0ae: invokevirtual su/catlean/ke.S (J)Z
// 0b1: aload 34
// 0b3: ifnull 0db
// 0b6: ifeq 0f0
// 0b9: goto 0c6
// 0bc: ldc2_w 4034239034976417526
// 0bf: lload 2
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: lload 4
// 0c8: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0cb: invokevirtual net/minecraft/class_310.method_1493 ()Z
// 0ce: goto 0db
// 0d1: ldc2_w 4034239034976417526
// 0d4: lload 2
// 0d5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0da: athrow
// 0db: aload 34
// 0dd: ifnull 0f9
// 0e0: ifeq 0f1
// 0e3: goto 0f0
// 0e6: ldc2_w 4034239034976417526
// 0e9: lload 2
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: return
// 0f1: getstatic su/catlean/ke.U Ljava/util/List;
// 0f4: invokeinterface java/util/List.size ()I 1
// 0f9: aload 0
// 0fa: lload 12
// 0fc: invokespecial su/catlean/ke.I (J)I
// 0ff: if_icmpge 11a
// 102: aload 0
// 103: lload 20
// 105: invokespecial su/catlean/ke.t (J)V
// 108: aload 34
// 10a: ifnonnull 0f1
// 10d: goto 11a
// 110: ldc2_w 4034239034976417526
// 113: lload 2
// 114: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 119: athrow
// 11a: getstatic su/catlean/ke.U Ljava/util/List;
// 11d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 122: astore 35
// 124: aload 35
// 126: invokeinterface java/util/Iterator.hasNext ()Z 1
// 12b: ifeq 5b4
// 12e: aload 35
// 130: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 135: checkcast su/catlean/fw
// 138: astore 36
// 13a: aload 36
// 13c: aload 36
// 13e: invokevirtual su/catlean/fw.q ()F
// 141: invokevirtual su/catlean/fw.j (F)V
// 144: aload 36
// 146: aload 36
// 148: invokevirtual su/catlean/fw.S ()F
// 14b: invokevirtual su/catlean/fw.e (F)V
// 14e: aload 36
// 150: aload 36
// 152: invokevirtual su/catlean/fw.Y ()F
// 155: invokevirtual su/catlean/fw.W (F)V
// 158: aload 36
// 15a: aload 36
// 15c: invokevirtual su/catlean/fw.C ()F
// 15f: ldc -0.00125
// 161: ldc 0.00125
// 163: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 166: checkcast kotlin/ranges/ClosedRange
// 169: lload 28
// 16b: bipush 0
// 16c: bipush 2
// 16d: aconst_null
// 16e: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 171: fadd
// 172: invokevirtual su/catlean/fw.J (F)V
// 175: aload 36
// 177: aload 36
// 179: invokevirtual su/catlean/fw.H ()F
// 17c: ldc 2.0E-4
// 17e: ldc 6.0E-4
// 180: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 183: checkcast kotlin/ranges/ClosedRange
// 186: lload 28
// 188: bipush 0
// 189: bipush 2
// 18a: aconst_null
// 18b: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 18e: fadd
// 18f: invokevirtual su/catlean/fw.N (F)V
// 192: aload 36
// 194: aload 36
// 196: invokevirtual su/catlean/fw.R ()F
// 199: ldc -0.00125
// 19b: ldc 0.00125
// 19d: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 1a0: checkcast kotlin/ranges/ClosedRange
// 1a3: lload 28
// 1a5: bipush 0
// 1a6: bipush 2
// 1a7: aconst_null
// 1a8: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 1ab: fadd
// 1ac: invokevirtual su/catlean/fw.n (F)V
// 1af: aload 36
// 1b1: aload 36
// 1b3: invokevirtual su/catlean/fw.C ()F
// 1b6: ldc 0.99
// 1b8: fmul
// 1b9: invokevirtual su/catlean/fw.J (F)V
// 1bc: aload 36
// 1be: aload 36
// 1c0: invokevirtual su/catlean/fw.H ()F
// 1c3: ldc 0.99
// 1c5: fmul
// 1c6: invokevirtual su/catlean/fw.N (F)V
// 1c9: aload 36
// 1cb: aload 36
// 1cd: invokevirtual su/catlean/fw.R ()F
// 1d0: ldc 0.99
// 1d2: fmul
// 1d3: invokevirtual su/catlean/fw.n (F)V
// 1d6: aload 36
// 1d8: aload 36
// 1da: invokevirtual su/catlean/fw.q ()F
// 1dd: aload 36
// 1df: invokevirtual su/catlean/fw.C ()F
// 1e2: fadd
// 1e3: invokevirtual su/catlean/fw.x (F)V
// 1e6: aload 36
// 1e8: aload 36
// 1ea: invokevirtual su/catlean/fw.S ()F
// 1ed: aload 36
// 1ef: invokevirtual su/catlean/fw.H ()F
// 1f2: fadd
// 1f3: invokevirtual su/catlean/fw.h (F)V
// 1f6: aload 36
// 1f8: aload 36
// 1fa: invokevirtual su/catlean/fw.Y ()F
// 1fd: aload 36
// 1ff: invokevirtual su/catlean/fw.R ()F
// 202: fadd
// 203: invokevirtual su/catlean/fw.a (F)V
// 206: aload 36
// 208: aload 36
// 20a: invokevirtual su/catlean/fw.K ()F
// 20d: aload 36
// 20f: invokevirtual su/catlean/fw.b ()F
// 212: fadd
// 213: invokevirtual su/catlean/fw.T (F)V
// 216: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 219: aload 36
// 21b: invokevirtual su/catlean/fw.N ()I
// 21e: i2f
// 21f: fconst_1
// 220: fsub
// 221: aload 36
// 223: invokevirtual su/catlean/fw.N ()I
// 226: i2f
// 227: lload 32
// 229: invokevirtual su/catlean/jl.T (FFJ)F
// 22c: ldc 60.0
// 22e: fdiv
// 22f: f2d
// 230: invokestatic java/lang/Math.sin (D)D
// 233: d2f
// 234: fstore 37
// 236: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 239: aload 36
// 23b: invokevirtual su/catlean/fw.s ()F
// 23e: aload 36
// 240: invokevirtual su/catlean/fw.q ()F
// 243: lload 32
// 245: invokevirtual su/catlean/jl.T (FFJ)F
// 248: fload 37
// 24a: fadd
// 24b: fstore 38
// 24d: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 250: aload 36
// 252: invokevirtual su/catlean/fw.a ()F
// 255: aload 36
// 257: invokevirtual su/catlean/fw.S ()F
// 25a: lload 32
// 25c: invokevirtual su/catlean/jl.T (FFJ)F
// 25f: fstore 39
// 261: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 264: aload 36
// 266: invokevirtual su/catlean/fw.V ()F
// 269: aload 36
// 26b: invokevirtual su/catlean/fw.Y ()F
// 26e: lload 32
// 270: invokevirtual su/catlean/jl.T (FFJ)F
// 273: fload 37
// 275: fsub
// 276: fstore 40
// 278: aload 36
// 27a: invokevirtual su/catlean/fw.g ()I
// 27d: aload 36
// 27f: invokevirtual su/catlean/fw.N ()I
// 282: isub
// 283: i2f
// 284: ldc 10.0
// 286: fcmpg
// 287: aload 34
// 289: ifnull 2b4
// 28c: ifge 2bb
// 28f: goto 29c
// 292: ldc2_w 4034239034976417526
// 295: lload 2
// 296: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29b: athrow
// 29c: aload 36
// 29e: invokevirtual su/catlean/fw.g ()I
// 2a1: aload 36
// 2a3: invokevirtual su/catlean/fw.N ()I
// 2a6: isub
// 2a7: goto 2b4
// 2aa: ldc2_w 4034239034976417526
// 2ad: lload 2
// 2ae: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b3: athrow
// 2b4: i2f
// 2b5: ldc 10.0
// 2b7: fdiv
// 2b8: goto 2bc
// 2bb: fconst_1
// 2bc: fstore 41
// 2be: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2c1: aload 0
// 2c2: lload 8
// 2c4: invokespecial su/catlean/ke.W (J)Ljava/awt/Color;
// 2c7: aload 0
// 2c8: iload 14
// 2ca: i2s
// 2cb: iload 15
// 2cd: i2s
// 2ce: iload 16
// 2d0: invokespecial su/catlean/ke.Z (SSI)Ljava/awt/Color;
// 2d3: lload 24
// 2d5: dup2_x1
// 2d6: pop2
// 2d7: ldc 0.5
// 2d9: invokevirtual su/catlean/jl.C (Ljava/awt/Color;JLjava/awt/Color;F)Ljava/awt/Color;
// 2dc: astore 42
// 2de: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 2e1: getstatic su/catlean/fo.FIRE_FLY Lsu/catlean/fo;
// 2e4: invokevirtual su/catlean/fo.g ()Lsu/catlean/gi;
// 2e7: astore 43
// 2e9: new net/minecraft/class_243
// 2ec: dup
// 2ed: fload 38
// 2ef: f2d
// 2f0: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 2f3: invokevirtual kotlin/random/Random$Default.nextFloat ()F
// 2f6: ldc 0.5
// 2f8: fsub
// 2f9: f2d
// 2fa: ldc2_w 0.06
// 2fd: dmul
// 2fe: dadd
// 2ff: fload 39
// 301: f2d
// 302: ldc2_w 0.5
// 305: dadd
// 306: fload 40
// 308: f2d
// 309: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 30c: invokevirtual kotlin/random/Random$Default.nextFloat ()F
// 30f: ldc 0.5
// 311: fsub
// 312: f2d
// 313: ldc2_w 0.06
// 316: dmul
// 317: dadd
// 318: invokespecial net/minecraft/class_243.<init> (DDD)V
// 31b: astore 44
// 31d: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 320: invokevirtual kotlin/random/Random$Default.nextFloat ()F
// 323: ldc 20.0
// 325: fmul
// 326: fstore 45
// 328: new net/minecraft/class_243
// 32b: dup
// 32c: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 32f: invokevirtual kotlin/random/Random$Default.nextDouble ()D
// 332: ldc2_w 0.5
// 335: dsub
// 336: ldc2_w 0.02
// 339: dmul
// 33a: aload 36
// 33c: invokevirtual su/catlean/fw.C ()F
// 33f: f2d
// 340: dadd
// 341: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 344: invokevirtual kotlin/random/Random$Default.nextDouble ()D
// 347: ldc2_w 0.06
// 34a: dmul
// 34b: aload 36
// 34d: invokevirtual su/catlean/fw.H ()F
// 350: f2d
// 351: dadd
// 352: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 355: invokevirtual kotlin/random/Random$Default.nextDouble ()D
// 358: ldc2_w 0.5
// 35b: dsub
// 35c: ldc2_w 0.02
// 35f: dmul
// 360: aload 36
// 362: invokevirtual su/catlean/fw.R ()F
// 365: f2d
// 366: dadd
// 367: invokespecial net/minecraft/class_243.<init> (DDD)V
// 36a: astore 46
// 36c: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 36f: aload 0
// 370: lload 8
// 372: invokespecial su/catlean/ke.W (J)Ljava/awt/Color;
// 375: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 378: aload 0
// 379: lload 8
// 37b: invokespecial su/catlean/ke.W (J)Ljava/awt/Color;
// 37e: lload 26
// 380: dup2_x1
// 381: pop2
// 382: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 385: fload 41
// 387: fmul
// 388: iload 17
// 38a: i2c
// 38b: swap
// 38c: iload 18
// 38e: swap
// 38f: iload 19
// 391: i2s
// 392: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 395: astore 47
// 397: new su/catlean/bk
// 39a: dup
// 39b: aload 43
// 39d: aload 44
// 39f: fload 45
// 3a1: lload 30
// 3a3: ldc 0.25
// 3a5: sipush 23283
// 3a8: ldc2_w 5806685551615932920
// 3ab: lload 2
// 3ac: lxor
// 3ad: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3b2: aload 46
// 3b4: aload 47
// 3b6: fconst_0
// 3b7: fconst_0
// 3b8: bipush 0
// 3b9: sipush 4916
// 3bc: ldc2_w 5189692793795817528
// 3bf: lload 2
// 3c0: lxor
// 3c1: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3c6: aconst_null
// 3c7: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 3ca: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 3cd: pop
// 3ce: aload 36
// 3d0: invokevirtual su/catlean/fw.N ()I
// 3d3: bipush 2
// 3d4: irem
// 3d5: aload 34
// 3d7: ifnull 559
// 3da: ifne 554
// 3dd: goto 3ea
// 3e0: ldc2_w 4034239034976417526
// 3e3: lload 2
// 3e4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3e9: athrow
// 3ea: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 3ed: getstatic su/catlean/fo.FIRE_FLY Lsu/catlean/fo;
// 3f0: invokevirtual su/catlean/fo.g ()Lsu/catlean/gi;
// 3f3: astore 43
// 3f5: new net/minecraft/class_243
// 3f8: dup
// 3f9: fload 38
// 3fb: f2d
// 3fc: ldc2_w -0.03
// 3ff: ldc2_w 0.03
// 402: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 405: checkcast kotlin/ranges/ClosedRange
// 408: bipush 0
// 409: bipush 2
// 40a: aconst_null
// 40b: lload 10
// 40d: invokestatic su/catlean/mf.k (Lkotlin/ranges/ClosedRange;ZILjava/lang/Object;J)D
// 410: dadd
// 411: fload 39
// 413: f2d
// 414: dconst_1
// 415: dadd
// 416: fload 40
// 418: f2d
// 419: ldc2_w -0.03
// 41c: ldc2_w 0.03
// 41f: invokestatic kotlin/ranges/RangesKt.rangeTo (DD)Lkotlin/ranges/ClosedFloatingPointRange;
// 422: checkcast kotlin/ranges/ClosedRange
// 425: bipush 0
// 426: bipush 2
// 427: aconst_null
// 428: lload 10
// 42a: invokestatic su/catlean/mf.k (Lkotlin/ranges/ClosedRange;ZILjava/lang/Object;J)D
// 42d: dadd
// 42e: invokespecial net/minecraft/class_243.<init> (DDD)V
// 431: astore 44
// 433: fconst_0
// 434: ldc 20.0
// 436: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 439: checkcast kotlin/ranges/ClosedRange
// 43c: lload 28
// 43e: bipush 0
// 43f: bipush 2
// 440: aconst_null
// 441: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 444: fstore 45
// 446: new net/minecraft/class_243
// 449: dup
// 44a: aload 36
// 44c: invokevirtual su/catlean/fw.C ()F
// 44f: f2d
// 450: aload 36
// 452: invokevirtual su/catlean/fw.H ()F
// 455: f2d
// 456: aload 36
// 458: invokevirtual su/catlean/fw.R ()F
// 45b: f2d
// 45c: invokespecial net/minecraft/class_243.<init> (DDD)V
// 45f: astore 46
// 461: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 464: aload 42
// 466: ldc 0.5
// 468: fload 41
// 46a: fmul
// 46b: iload 17
// 46d: i2c
// 46e: swap
// 46f: iload 18
// 471: swap
// 472: iload 19
// 474: i2s
// 475: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 478: astore 47
// 47a: new su/catlean/bk
// 47d: dup
// 47e: aload 43
// 480: aload 44
// 482: fload 45
// 484: lload 30
// 486: ldc 1.5
// 488: bipush 2
// 489: aload 46
// 48b: aload 47
// 48d: fconst_0
// 48e: fconst_0
// 48f: bipush 0
// 490: sipush 9690
// 493: ldc2_w 7269412304922609367
// 496: lload 2
// 497: lxor
// 498: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 49d: aconst_null
// 49e: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 4a1: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 4a4: pop
// 4a5: getstatic su/catlean/dh.S Lsu/catlean/dh;
// 4a8: getstatic su/catlean/fo.FIRE_FLY Lsu/catlean/fo;
// 4ab: invokevirtual su/catlean/fo.g ()Lsu/catlean/gi;
// 4ae: astore 43
// 4b0: new net/minecraft/class_243
// 4b3: dup
// 4b4: fload 38
// 4b6: f2d
// 4b7: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 4ba: invokevirtual kotlin/random/Random$Default.nextFloat ()F
// 4bd: ldc 0.5
// 4bf: fsub
// 4c0: f2d
// 4c1: ldc2_w 0.06
// 4c4: dmul
// 4c5: dadd
// 4c6: fload 39
// 4c8: f2d
// 4c9: dconst_1
// 4ca: dadd
// 4cb: fload 40
// 4cd: f2d
// 4ce: getstatic kotlin/random/Random.Default Lkotlin/random/Random$Default;
// 4d1: invokevirtual kotlin/random/Random$Default.nextFloat ()F
// 4d4: ldc 0.5
// 4d6: fsub
// 4d7: f2d
// 4d8: ldc2_w 0.06
// 4db: dmul
// 4dc: dadd
// 4dd: invokespecial net/minecraft/class_243.<init> (DDD)V
// 4e0: astore 44
// 4e2: fconst_0
// 4e3: ldc 20.0
// 4e5: invokestatic kotlin/ranges/RangesKt.rangeTo (FF)Lkotlin/ranges/ClosedFloatingPointRange;
// 4e8: checkcast kotlin/ranges/ClosedRange
// 4eb: lload 28
// 4ed: bipush 0
// 4ee: bipush 2
// 4ef: aconst_null
// 4f0: invokestatic su/catlean/mf.p (Lkotlin/ranges/ClosedRange;JZILjava/lang/Object;)F
// 4f3: fstore 45
// 4f5: new net/minecraft/class_243
// 4f8: dup
// 4f9: aload 36
// 4fb: invokevirtual su/catlean/fw.C ()F
// 4fe: f2d
// 4ff: aload 36
// 501: invokevirtual su/catlean/fw.H ()F
// 504: f2d
// 505: aload 36
// 507: invokevirtual su/catlean/fw.R ()F
// 50a: f2d
// 50b: invokespecial net/minecraft/class_243.<init> (DDD)V
// 50e: astore 46
// 510: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 513: aload 42
// 515: ldc 0.2
// 517: fload 41
// 519: fmul
// 51a: iload 17
// 51c: i2c
// 51d: swap
// 51e: iload 18
// 520: swap
// 521: iload 19
// 523: i2s
// 524: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 527: astore 47
// 529: new su/catlean/bk
// 52c: dup
// 52d: aload 43
// 52f: aload 44
// 531: fload 45
// 533: lload 30
// 535: ldc 3.0
// 537: bipush 2
// 538: aload 46
// 53a: aload 47
// 53c: fconst_0
// 53d: fconst_0
// 53e: bipush 0
// 53f: sipush 19827
// 542: ldc2_w 7869539843276533363
// 545: lload 2
// 546: lxor
// 547: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 54c: aconst_null
// 54d: invokespecial su/catlean/bk.<init> (Lsu/catlean/gi;Lnet/minecraft/class_243;FJFILnet/minecraft/class_243;Ljava/awt/Color;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 550: invokevirtual su/catlean/dh.a (Lsu/catlean/bk;)Z
// 553: pop
// 554: aload 36
// 556: invokevirtual su/catlean/fw.N ()I
// 559: istore 43
// 55b: aload 36
// 55d: iload 43
// 55f: bipush 1
// 560: iadd
// 561: invokevirtual su/catlean/fw.e (I)V
// 564: aload 34
// 566: ifnull 5af
// 569: iload 43
// 56b: aload 36
// 56d: invokevirtual su/catlean/fw.g ()I
// 570: if_icmpgt 5a8
// 573: goto 580
// 576: ldc2_w 4034239034976417526
// 579: lload 2
// 57a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 57f: athrow
// 580: aload 36
// 582: invokevirtual su/catlean/fw.S ()F
// 585: f2d
// 586: lload 22
// 588: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 58b: invokevirtual net/minecraft/class_746.method_23318 ()D
// 58e: dsub
// 58f: ldc2_w 20.0
// 592: dcmpl
// 593: aload 34
// 595: ifnull 12b
// 598: goto 5a5
// 59b: ldc2_w 4034239034976417526
// 59e: lload 2
// 59f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5a4: athrow
// 5a5: ifle 124
// 5a8: aload 35
// 5aa: invokeinterface java/util/Iterator.remove ()V 1
// 5af: aload 34
// 5b1: ifnonnull 124
// 5b4: return
}

private final void t(long var1) {
var1 = b ^ var1;
int var3 = (int)((var1 ^ 15310245248597L) >>> 56);
long var4 = (var1 ^ 15310245248597L) << 8 >>> 8;
long var10001 = var1 ^ 78028440560024L;
int var6 = (int)((var1 ^ 78028440560024L) >>> 48);
int var7 = (int)((var1 ^ 78028440560024L) << 16 >>> 32);
int var8 = (int)(var10001 << 48 >>> 48);
long var9 = var1 ^ 72615728533979L;
long var11 = var1 ^ 121641170648660L;
class_243 var10000 = this.J((byte)var3, var4, (class_1297)zf.v(var11)).method_1019(zf.v(var11).method_18798().method_1021(10.0));
Intrinsics.checkNotNullExpressionValue(var10000, b<"g">(27554, 4922000379779766420L ^ var1));
class_243 var13 = var10000;
U.add(
new fw(
(float)(var13.field_1352 + mf.D(var9, -48.0F, 48.0F, false, 4, null)),
(float)(var13.field_1351 + 4.0F + mf.D(var9, -2.0F, 2.0F, false, 4, null)),
(char)var6,
(float)(var13.field_1350 + mf.D(var9, -48.0F, 48.0F, false, 4, null)),
var7,
(char)var8,
0.0F,
0.0F,
0.0F,
0.0F,
0.0F,
0.0F,
0,
0.0F,
0.0F,
0,
0,
c<"x">(769, 6239514669596015553L ^ var1),
null
)
);
}

@Flow(
priority = -10
)
private final void c(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ke.b J
// 003: ldc2_w 26230059223097
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 2684138266955
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 104119310188088
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 9067629783637
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 84865537436391
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 76564018259325
// 029: lxor
// 02a: lstore 12
// 02c: dup2
// 02d: ldc2_w 118389288723300
// 030: lxor
// 031: lstore 14
// 033: pop2
// 034: ldc2_w 9078041274555464801
// 037: lload 2
// 038: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 03d: astore 21
// 03f: getstatic su/catlean/ke.U Ljava/util/List;
// 042: invokeinterface java/util/List.isEmpty ()Z 1
// 047: ifeq 055
// 04a: return
// 04b: ldc2_w 9010886263561976839
// 04e: lload 2
// 04f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 054: athrow
// 055: lload 4
// 057: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 05a: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
// 05d: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
// 060: dup
// 061: sipush 5551
// 064: ldc2_w 3076088388963809186
// 067: lload 2
// 068: lxor
// 069: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 071: astore 22
// 073: new su/catlean/g7
// 076: dup
// 077: getstatic net/minecraft/class_290.field_1576 Lcom/mojang/blaze3d/vertex/VertexFormat;
// 07a: dup
// 07b: sipush 25888
// 07e: ldc2_w 4157041693408708412
// 081: lload 2
// 082: lxor
// 083: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 088: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 08b: sipush 7631
// 08e: ldc2_w 6586067112362865721
// 091: lload 2
// 092: lxor
// 093: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 098: getstatic su/catlean/ke.U Ljava/util/List;
// 09b: invokeinterface java/util/List.size ()I 1
// 0a0: imul
// 0a1: bipush 0
// 0a2: bipush 4
// 0a3: aconst_null
// 0a4: astore 16
// 0a6: istore 17
// 0a8: istore 18
// 0aa: istore 19
// 0ac: astore 20
// 0ae: lload 6
// 0b0: aload 20
// 0b2: iload 19
// 0b4: iload 18
// 0b6: iload 17
// 0b8: aload 16
// 0ba: invokespecial su/catlean/g7.<init> (JLcom/mojang/blaze3d/vertex/VertexFormat;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 0bd: astore 23
// 0bf: getstatic su/catlean/ke.U Ljava/util/List;
// 0c2: checkcast java/lang/Iterable
// 0c5: astore 25
// 0c7: bipush 0
// 0c8: istore 26
// 0ca: aload 25
// 0cc: astore 27
// 0ce: new java/util/ArrayList
// 0d1: dup
// 0d2: invokespecial java/util/ArrayList.<init> ()V
// 0d5: checkcast java/util/Collection
// 0d8: astore 28
// 0da: bipush 0
// 0db: istore 29
// 0dd: aload 27
// 0df: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 0e4: astore 30
// 0e6: aload 30
// 0e8: invokeinterface java/util/Iterator.hasNext ()Z 1
// 0ed: ifeq 190
// 0f0: aload 30
// 0f2: aload 21
// 0f4: ifnull 19b
// 0f7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 0fc: astore 31
// 0fe: aload 31
// 100: checkcast su/catlean/fw
// 103: astore 32
// 105: bipush 0
// 106: istore 33
// 108: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 10b: invokevirtual su/catlean/zi.K ()Lnet/minecraft/class_4604;
// 10e: aload 32
// 110: invokevirtual su/catlean/fw.q ()F
// 113: f2d
// 114: aload 32
// 116: invokevirtual su/catlean/fw.S ()F
// 119: f2d
// 11a: ldc2_w 1.5
// 11d: dadd
// 11e: aload 32
// 120: invokevirtual su/catlean/fw.Y ()F
// 123: f2d
// 124: invokevirtual net/minecraft/class_4604.method_74404 (DDD)Z
// 127: aload 21
// 129: ifnull 17a
// 12c: ifne 179
// 12f: goto 13c
// 132: ldc2_w 9010886263561976839
// 135: lload 2
// 136: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13b: athrow
// 13c: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 13f: invokevirtual su/catlean/zi.K ()Lnet/minecraft/class_4604;
// 142: aload 32
// 144: invokevirtual su/catlean/fw.q ()F
// 147: f2d
// 148: aload 32
// 14a: invokevirtual su/catlean/fw.S ()F
// 14d: f2d
// 14e: aload 32
// 150: invokevirtual su/catlean/fw.Y ()F
// 153: f2d
// 154: invokevirtual net/minecraft/class_4604.method_74404 (DDD)Z
// 157: aload 21
// 159: ifnull 17a
// 15c: goto 169
// 15f: ldc2_w 9010886263561976839
// 162: lload 2
// 163: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 168: athrow
// 169: ifeq 17d
// 16c: goto 179
// 16f: ldc2_w 9010886263561976839
// 172: lload 2
// 173: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 178: athrow
// 179: bipush 1
// 17a: goto 17e
// 17d: bipush 0
// 17e: ifeq 0e6
// 181: aload 28
// 183: aload 31
// 185: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
// 18a: pop
// 18b: aload 21
// 18d: ifnonnull 0e6
// 190: aload 28
// 192: checkcast java/util/List
// 195: nop
// 196: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
// 19b: astore 24
// 19d: aload 24
// 19f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 1a4: ifeq 2e0
// 1a7: aload 24
// 1a9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 1ae: checkcast su/catlean/fw
// 1b1: astore 25
// 1b3: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1b6: aload 25
// 1b8: invokevirtual su/catlean/fw.N ()I
// 1bb: i2f
// 1bc: fconst_1
// 1bd: fsub
// 1be: aload 25
// 1c0: invokevirtual su/catlean/fw.N ()I
// 1c3: i2f
// 1c4: lload 14
// 1c6: invokevirtual su/catlean/jl.T (FFJ)F
// 1c9: fconst_0
// 1ca: invokestatic kotlin/ranges/RangesKt.coerceAtLeast (FF)F
// 1cd: fstore 26
// 1cf: fload 26
// 1d1: ldc 60.0
// 1d3: fdiv
// 1d4: f2d
// 1d5: invokestatic java/lang/Math.sin (D)D
// 1d8: d2f
// 1d9: fstore 27
// 1db: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1de: aload 25
// 1e0: invokevirtual su/catlean/fw.s ()F
// 1e3: aload 25
// 1e5: invokevirtual su/catlean/fw.q ()F
// 1e8: lload 14
// 1ea: invokevirtual su/catlean/jl.T (FFJ)F
// 1ed: fload 27
// 1ef: fadd
// 1f0: fstore 28
// 1f2: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1f5: aload 25
// 1f7: invokevirtual su/catlean/fw.a ()F
// 1fa: aload 25
// 1fc: invokevirtual su/catlean/fw.S ()F
// 1ff: lload 14
// 201: invokevirtual su/catlean/jl.T (FFJ)F
// 204: fstore 29
// 206: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 209: aload 25
// 20b: invokevirtual su/catlean/fw.V ()F
// 20e: aload 25
// 210: invokevirtual su/catlean/fw.Y ()F
// 213: lload 14
// 215: invokevirtual su/catlean/jl.T (FFJ)F
// 218: fload 27
// 21a: fsub
// 21b: fstore 30
// 21d: aload 1
// 21e: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 221: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 224: aload 1
// 225: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 228: fload 28
// 22a: f2d
// 22b: aload 22
// 22d: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 230: getfield net/minecraft/class_243.field_1352 D
// 233: dsub
// 234: fload 29
// 236: f2d
// 237: aload 22
// 239: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 23c: getfield net/minecraft/class_243.field_1351 D
// 23f: dsub
// 240: fload 30
// 242: f2d
// 243: aload 22
// 245: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
// 248: getfield net/minecraft/class_243.field_1350 D
// 24b: dsub
// 24c: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
// 24f: aload 1
// 250: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 253: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 256: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 259: aload 25
// 25b: invokevirtual su/catlean/fw.K ()F
// 25e: aload 25
// 260: invokevirtual su/catlean/fw.b ()F
// 263: fsub
// 264: aload 25
// 266: invokevirtual su/catlean/fw.K ()F
// 269: lload 14
// 26b: invokevirtual su/catlean/jl.T (FFJ)F
// 26e: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
// 273: checkcast org/joml/Quaternionfc
// 276: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
// 279: aload 0
// 27a: aload 23
// 27c: aload 1
// 27d: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 280: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 283: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 286: dup
// 287: sipush 26653
// 28a: ldc2_w 8335432640242174479
// 28d: lload 2
// 28e: lxor
// 28f: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 294: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 297: lload 10
// 299: fload 28
// 29b: fload 29
// 29d: fload 30
// 29f: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 2a2: aload 25
// 2a4: invokevirtual su/catlean/fw.K ()F
// 2a7: aload 25
// 2a9: invokevirtual su/catlean/fw.b ()F
// 2ac: fsub
// 2ad: aload 25
// 2af: invokevirtual su/catlean/fw.K ()F
// 2b2: lload 14
// 2b4: invokevirtual su/catlean/jl.T (FFJ)F
// 2b7: fload 26
// 2b9: aload 25
// 2bb: invokevirtual su/catlean/fw.g ()I
// 2be: i2f
// 2bf: invokespecial su/catlean/ke.h (Lsu/catlean/g7;Lorg/joml/Matrix4f;JFFFFFF)V
// 2c2: aload 1
// 2c3: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 2c6: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 2c9: aload 21
// 2cb: ifnull 373
// 2ce: aload 21
// 2d0: ifnonnull 19d
// 2d3: goto 2e0
// 2d6: ldc2_w 9010886263561976839
// 2d9: lload 2
// 2da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2df: athrow
// 2e0: aload 1
// 2e1: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 2e4: invokevirtual net/minecraft/class_4587.method_22903 ()V
// 2e7: aload 1
// 2e8: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 2eb: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
// 2ee: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 2f1: invokevirtual su/catlean/zi.b ()F
// 2f4: fneg
// 2f5: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 2fa: dup
// 2fb: sipush 12063
// 2fe: ldc2_w 242843247863500034
// 301: lload 2
// 302: lxor
// 303: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 308: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 30b: checkcast org/joml/Quaternionfc
// 30e: lload 12
// 310: dup2_x1
// 311: pop2
// 312: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 315: aload 1
// 316: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 319: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
// 31c: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 31f: invokevirtual su/catlean/zi.F ()F
// 322: fneg
// 323: invokeinterface net/minecraft/class_7833.rotation (F)Lorg/joml/Quaternionf; 2
// 328: dup
// 329: sipush 13849
// 32c: ldc2_w 7949961176029238284
// 32f: lload 2
// 330: lxor
// 331: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 336: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 339: checkcast org/joml/Quaternionfc
// 33c: lload 12
// 33e: dup2_x1
// 33f: pop2
// 340: invokestatic su/catlean/m8.y (Lnet/minecraft/class_4587;JLorg/joml/Quaternionfc;)V
// 343: lload 8
// 345: aload 23
// 347: getstatic su/catlean/b6.R Lsu/catlean/b6;
// 34a: invokevirtual su/catlean/b6.Q ()Lcom/mojang/blaze3d/pipeline/RenderPipeline;
// 34d: aconst_null
// 34e: aconst_null
// 34f: aload 1
// 350: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 353: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
// 356: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
// 359: aconst_null
// 35a: aconst_null
// 35b: sipush 8409
// 35e: ldc2_w 9092195202267728167
// 361: lload 2
// 362: lxor
// 363: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 368: aconst_null
// 369: invokestatic su/catlean/g7.R (JLsu/catlean/g7;Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/class_276;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Matrix4f;Lorg/joml/Matrix3x2f;Ljava/util/Map;ILjava/lang/Object;)V
// 36c: aload 1
// 36d: invokevirtual su/catlean/api/event/events/render/Render3DEvent.getStack ()Lnet/minecraft/class_4587;
// 370: invokevirtual net/minecraft/class_4587.method_22909 ()V
// 373: return
}

private final void h(g7 param1, Matrix4f param2, long param3, float param5, float param6, float param7, float param8, float param9, float param10) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ke.b J
// 003: lload 3
// 004: lxor
// 005: lstore 3
// 006: lload 3
// 007: dup2
// 008: ldc2_w 64683881137363
// 00b: lxor
// 00c: lstore 11
// 00e: dup2
// 00f: ldc2_w 5501733354867
// 012: lxor
// 013: dup2
// 014: bipush 32
// 016: lushr
// 017: l2i
// 018: istore 13
// 01a: dup2
// 01b: bipush 32
// 01d: lshl
// 01e: bipush 56
// 020: lushr
// 021: l2i
// 022: istore 14
// 024: dup2
// 025: bipush 40
// 027: lshl
// 028: bipush 40
// 02a: lushr
// 02b: l2i
// 02c: istore 15
// 02e: pop2
// 02f: dup2
// 030: ldc2_w 40013061685571
// 033: lxor
// 034: lstore 16
// 036: dup2
// 037: ldc2_w 89255113061419
// 03a: lxor
// 03b: lstore 18
// 03d: dup2
// 03e: ldc2_w 25866656945396
// 041: lxor
// 042: lstore 20
// 044: dup2
// 045: ldc2_w 81289846478089
// 048: lxor
// 049: dup2
// 04a: bipush 48
// 04c: lushr
// 04d: l2i
// 04e: istore 22
// 050: dup2
// 051: bipush 16
// 053: lshl
// 054: bipush 48
// 056: lushr
// 057: l2i
// 058: istore 23
// 05a: dup2
// 05b: bipush 32
// 05d: lshl
// 05e: bipush 32
// 060: lushr
// 061: l2i
// 062: istore 24
// 064: pop2
// 065: dup2
// 066: ldc2_w 104049562370212
// 069: lxor
// 06a: dup2
// 06b: bipush 48
// 06d: lushr
// 06e: l2i
// 06f: istore 25
// 071: dup2
// 072: bipush 16
// 074: lshl
// 075: bipush 32
// 077: lushr
// 078: l2i
// 079: istore 26
// 07b: dup2
// 07c: bipush 48
// 07e: lshl
// 07f: bipush 48
// 081: lushr
// 082: l2i
// 083: istore 27
// 085: pop2
// 086: pop2
// 087: ldc2_w -6690120181325258051
// 08a: lload 3
// 08b: invokedynamic Å (JJ)[Lsu/catlean/_g; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 090: ldc 0.33
// 092: fstore 29
// 094: astore 28
// 096: ldc 0.2
// 098: fstore 30
// 09a: ldc 0.08
// 09c: fstore 31
// 09e: ldc 0.78
// 0a0: fstore 32
// 0a2: ldc 1.3299999
// 0a4: fstore 33
// 0a6: ldc 0.78
// 0a8: fload 30
// 0aa: fadd
// 0ab: fstore 34
// 0ad: fconst_0
// 0ae: fload 9
// 0b0: fcmpg
// 0b1: aload 28
// 0b3: ifnull 0d8
// 0b6: ifgt 0ff
// 0b9: goto 0c6
// 0bc: ldc2_w -6642426795656797477
// 0bf: lload 3
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: fload 9
// 0c8: ldc 10.0
// 0ca: fcmpg
// 0cb: goto 0d8
// 0ce: ldc2_w -6642426795656797477
// 0d1: lload 3
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: aload 28
// 0da: ifnull 0fc
// 0dd: ifgt 0fb
// 0e0: goto 0ed
// 0e3: ldc2_w -6642426795656797477
// 0e6: lload 3
// 0e7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ec: athrow
// 0ed: bipush 1
// 0ee: goto 100
// 0f1: ldc2_w -6642426795656797477
// 0f4: lload 3
// 0f5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fa: athrow
// 0fb: bipush 0
// 0fc: goto 100
// 0ff: bipush 0
// 100: ifeq 115
// 103: fload 9
// 105: ldc 10.0
// 107: fdiv
// 108: goto 151
// 10b: ldc2_w -6642426795656797477
// 10e: lload 3
// 10f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 114: athrow
// 115: fload 10
// 117: fload 9
// 119: fsub
// 11a: lload 3
// 11b: lconst_0
// 11c: lcmp
// 11d: iflt 14d
// 120: ldc 10.0
// 122: aload 28
// 124: ifnull 14c
// 127: fcmpg
// 128: ifge 150
// 12b: goto 138
// 12e: ldc2_w -6642426795656797477
// 131: lload 3
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: fload 10
// 13a: fload 9
// 13c: fsub
// 13d: ldc 20.0
// 13f: goto 14c
// 142: ldc2_w -6642426795656797477
// 145: lload 3
// 146: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14b: athrow
// 14c: fdiv
// 14d: goto 151
// 150: fconst_1
// 151: fstore 35
// 153: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 156: aload 0
// 157: iload 22
// 159: i2s
// 15a: iload 23
// 15c: i2s
// 15d: iload 24
// 15f: invokespecial su/catlean/ke.Z (SSI)Ljava/awt/Color;
// 162: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 165: aload 0
// 166: iload 22
// 168: i2s
// 169: iload 23
// 16b: i2s
// 16c: iload 24
// 16e: invokespecial su/catlean/ke.Z (SSI)Ljava/awt/Color;
// 171: lload 11
// 173: dup2_x1
// 174: pop2
// 175: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 178: fload 35
// 17a: fmul
// 17b: iload 25
// 17d: i2c
// 17e: swap
// 17f: iload 26
// 181: swap
// 182: iload 27
// 184: i2s
// 185: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 188: astore 36
// 18a: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 18d: aload 0
// 18e: lload 20
// 190: invokespecial su/catlean/ke.a (J)Ljava/awt/Color;
// 193: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 196: aload 0
// 197: lload 20
// 199: invokespecial su/catlean/ke.a (J)Ljava/awt/Color;
// 19c: lload 11
// 19e: dup2_x1
// 19f: pop2
// 1a0: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 1a3: fload 35
// 1a5: fmul
// 1a6: iload 25
// 1a8: i2c
// 1a9: swap
// 1aa: iload 26
// 1ac: swap
// 1ad: iload 27
// 1af: i2s
// 1b0: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1b3: astore 37
// 1b5: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1b8: getstatic su/catlean/ke.x Ljava/awt/Color;
// 1bb: getstatic su/catlean/jl.y Lsu/catlean/jl;
// 1be: lload 11
// 1c0: getstatic su/catlean/ke.x Ljava/awt/Color;
// 1c3: invokevirtual su/catlean/jl.G (JLjava/awt/Color;)F
// 1c6: fload 35
// 1c8: fmul
// 1c9: iload 25
// 1cb: i2c
// 1cc: swap
// 1cd: iload 26
// 1cf: swap
// 1d0: iload 27
// 1d2: i2s
// 1d3: invokevirtual su/catlean/jl.p (Ljava/awt/Color;CIFS)Ljava/awt/Color;
// 1d6: astore 38
// 1d8: aload 1
// 1d9: aload 2
// 1da: fload 29
// 1dc: fneg
// 1dd: lload 18
// 1df: fload 32
// 1e1: fload 29
// 1e3: fneg
// 1e4: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 1e7: aload 36
// 1e9: lload 16
// 1eb: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 1ee: pop
// 1ef: aload 1
// 1f0: aload 2
// 1f1: fload 29
// 1f3: fneg
// 1f4: lload 18
// 1f6: fload 33
// 1f8: fload 29
// 1fa: fneg
// 1fb: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 1fe: aload 36
// 200: lload 16
// 202: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 205: pop
// 206: aload 1
// 207: aload 2
// 208: fload 29
// 20a: lload 18
// 20c: fload 33
// 20e: fload 29
// 210: fneg
// 211: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 214: aload 36
// 216: lload 16
// 218: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 21b: pop
// 21c: aload 1
// 21d: aload 2
// 21e: fload 29
// 220: lload 18
// 222: fload 32
// 224: fload 29
// 226: fneg
// 227: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 22a: aload 36
// 22c: lload 16
// 22e: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 231: pop
// 232: aload 1
// 233: aload 2
// 234: fload 29
// 236: fneg
// 237: fload 31
// 239: fadd
// 23a: fload 32
// 23c: fload 30
// 23e: fsub
// 23f: lload 18
// 241: dup2_x1
// 242: pop2
// 243: fload 29
// 245: fneg
// 246: fload 31
// 248: fadd
// 249: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 24c: aload 37
// 24e: lload 16
// 250: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 253: pop
// 254: aload 1
// 255: aload 2
// 256: fload 29
// 258: fneg
// 259: fload 34
// 25b: fload 30
// 25d: fsub
// 25e: lload 18
// 260: dup2_x1
// 261: pop2
// 262: fload 29
// 264: fneg
// 265: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 268: aload 36
// 26a: lload 16
// 26c: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 26f: pop
// 270: aload 1
// 271: aload 2
// 272: fload 29
// 274: fload 34
// 276: fload 30
// 278: fsub
// 279: lload 18
// 27b: dup2_x1
// 27c: pop2
// 27d: fload 29
// 27f: fneg
// 280: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 283: aload 36
// 285: lload 16
// 287: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 28a: pop
// 28b: aload 1
// 28c: aload 2
// 28d: fload 29
// 28f: fload 31
// 291: fsub
// 292: fload 32
// 294: fload 30
// 296: fsub
// 297: lload 18
// 299: dup2_x1
// 29a: pop2
// 29b: fload 29
// 29d: fneg
// 29e: fload 31
// 2a0: fadd
// 2a1: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2a4: aload 37
// 2a6: lload 16
// 2a8: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2ab: pop
// 2ac: aload 1
// 2ad: aload 2
// 2ae: fload 29
// 2b0: fneg
// 2b1: lload 18
// 2b3: fload 32
// 2b5: fload 29
// 2b7: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2ba: aload 36
// 2bc: lload 16
// 2be: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2c1: pop
// 2c2: aload 1
// 2c3: aload 2
// 2c4: fload 29
// 2c6: fneg
// 2c7: lload 18
// 2c9: fload 33
// 2cb: fload 29
// 2cd: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2d0: aload 36
// 2d2: lload 16
// 2d4: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2d7: pop
// 2d8: aload 1
// 2d9: aload 2
// 2da: fload 29
// 2dc: lload 18
// 2de: fload 33
// 2e0: fload 29
// 2e2: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2e5: aload 36
// 2e7: lload 16
// 2e9: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 2ec: pop
// 2ed: aload 1
// 2ee: aload 2
// 2ef: fload 29
// 2f1: lload 18
// 2f3: fload 32
// 2f5: fload 29
// 2f7: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 2fa: aload 36
// 2fc: lload 16
// 2fe: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 301: pop
// 302: aload 1
// 303: aload 2
// 304: fload 29
// 306: fneg
// 307: fload 31
// 309: fadd
// 30a: fload 32
// 30c: fload 30
// 30e: fsub
// 30f: lload 18
// 311: dup2_x1
// 312: pop2
// 313: fload 29
// 315: fload 31
// 317: fsub
// 318: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 31b: aload 37
// 31d: lload 16
// 31f: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 322: pop
// 323: aload 1
// 324: aload 2
// 325: fload 29
// 327: fneg
// 328: fload 34
// 32a: fload 30
// 32c: fsub
// 32d: lload 18
// 32f: dup2_x1
// 330: pop2
// 331: fload 29
// 333: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 336: aload 36
// 338: lload 16
// 33a: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 33d: pop
// 33e: aload 1
// 33f: aload 2
// 340: fload 29
// 342: fload 34
// 344: fload 30
// 346: fsub
// 347: lload 18
// 349: dup2_x1
// 34a: pop2
// 34b: fload 29
// 34d: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 350: aload 36
// 352: lload 16
// 354: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 357: pop
// 358: aload 1
// 359: aload 2
// 35a: fload 29
// 35c: fload 31
// 35e: fsub
// 35f: fload 32
// 361: fload 30
// 363: fsub
// 364: lload 18
// 366: dup2_x1
// 367: pop2
// 368: fload 29
// 36a: fload 31
// 36c: fsub
// 36d: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 370: aload 37
// 372: lload 16
// 374: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 377: pop
// 378: aload 1
// 379: aload 2
// 37a: fload 29
// 37c: fneg
// 37d: lload 18
// 37f: fload 32
// 381: fload 29
// 383: fneg
// 384: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 387: aload 36
// 389: lload 16
// 38b: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 38e: pop
// 38f: aload 1
// 390: aload 2
// 391: fload 29
// 393: fneg
// 394: lload 18
// 396: fload 33
// 398: fload 29
// 39a: fneg
// 39b: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 39e: aload 36
// 3a0: lload 16
// 3a2: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3a5: pop
// 3a6: aload 1
// 3a7: aload 2
// 3a8: fload 29
// 3aa: fneg
// 3ab: lload 18
// 3ad: fload 33
// 3af: fload 29
// 3b1: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 3b4: aload 36
// 3b6: lload 16
// 3b8: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3bb: pop
// 3bc: aload 1
// 3bd: aload 2
// 3be: fload 29
// 3c0: fneg
// 3c1: lload 18
// 3c3: fload 32
// 3c5: fload 29
// 3c7: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 3ca: aload 36
// 3cc: lload 16
// 3ce: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3d1: pop
// 3d2: aload 1
// 3d3: aload 2
// 3d4: fload 29
// 3d6: fneg
// 3d7: fload 31
// 3d9: fadd
// 3da: fload 32
// 3dc: fload 30
// 3de: fsub
// 3df: lload 18
// 3e1: dup2_x1
// 3e2: pop2
// 3e3: fload 29
// 3e5: fneg
// 3e6: fload 31
// 3e8: fadd
// 3e9: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 3ec: aload 37
// 3ee: lload 16
// 3f0: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 3f3: pop
// 3f4: aload 1
// 3f5: aload 2
// 3f6: fload 29
// 3f8: fneg
// 3f9: fload 34
// 3fb: fload 30
// 3fd: fsub
// 3fe: lload 18
// 400: dup2_x1
// 401: pop2
// 402: fload 29
// 404: fneg
// 405: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 408: aload 36
// 40a: lload 16
// 40c: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 40f: pop
// 410: aload 1
// 411: aload 2
// 412: fload 29
// 414: fneg
// 415: fload 34
// 417: fload 30
// 419: fsub
// 41a: lload 18
// 41c: dup2_x1
// 41d: pop2
// 41e: fload 29
// 420: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 423: aload 36
// 425: lload 16
// 427: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 42a: pop
// 42b: aload 1
// 42c: aload 2
// 42d: fload 29
// 42f: fneg
// 430: fload 31
// 432: fadd
// 433: fload 32
// 435: fload 30
// 437: fsub
// 438: lload 18
// 43a: dup2_x1
// 43b: pop2
// 43c: fload 29
// 43e: fload 31
// 440: fsub
// 441: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 444: aload 37
// 446: lload 16
// 448: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 44b: pop
// 44c: aload 1
// 44d: aload 2
// 44e: fload 29
// 450: lload 18
// 452: fload 32
// 454: fload 29
// 456: fneg
// 457: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 45a: aload 36
// 45c: lload 16
// 45e: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 461: pop
// 462: aload 1
// 463: aload 2
// 464: fload 29
// 466: lload 18
// 468: fload 33
// 46a: fload 29
// 46c: fneg
// 46d: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 470: aload 36
// 472: lload 16
// 474: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 477: pop
// 478: aload 1
// 479: aload 2
// 47a: fload 29
// 47c: lload 18
// 47e: fload 33
// 480: fload 29
// 482: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 485: aload 36
// 487: lload 16
// 489: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 48c: pop
// 48d: aload 1
// 48e: aload 2
// 48f: fload 29
// 491: lload 18
// 493: fload 32
// 495: fload 29
// 497: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 49a: aload 36
// 49c: lload 16
// 49e: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 4a1: pop
// 4a2: aload 1
// 4a3: aload 2
// 4a4: fload 29
// 4a6: fload 31
// 4a8: fsub
// 4a9: fload 32
// 4ab: fload 30
// 4ad: fsub
// 4ae: lload 18
// 4b0: dup2_x1
// 4b1: pop2
// 4b2: fload 29
// 4b4: fneg
// 4b5: fload 31
// 4b7: fadd
// 4b8: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 4bb: aload 37
// 4bd: lload 16
// 4bf: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 4c2: pop
// 4c3: aload 1
// 4c4: aload 2
// 4c5: fload 29
// 4c7: fload 34
// 4c9: fload 30
// 4cb: fsub
// 4cc: lload 18
// 4ce: dup2_x1
// 4cf: pop2
// 4d0: fload 29
// 4d2: fneg
// 4d3: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 4d6: aload 36
// 4d8: lload 16
// 4da: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 4dd: pop
// 4de: aload 1
// 4df: aload 2
// 4e0: fload 29
// 4e2: fload 34
// 4e4: fload 30
// 4e6: fsub
// 4e7: lload 18
// 4e9: dup2_x1
// 4ea: pop2
// 4eb: fload 29
// 4ed: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 4f0: aload 36
// 4f2: lload 16
// 4f4: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 4f7: pop
// 4f8: aload 1
// 4f9: aload 2
// 4fa: fload 29
// 4fc: fload 31
// 4fe: fsub
// 4ff: fload 32
// 501: fload 30
// 503: fsub
// 504: lload 18
// 506: dup2_x1
// 507: pop2
// 508: fload 29
// 50a: fload 31
// 50c: fsub
// 50d: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 510: aload 37
// 512: lload 16
// 514: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 517: pop
// 518: aload 1
// 519: aload 2
// 51a: fload 29
// 51c: fneg
// 51d: lload 18
// 51f: fload 33
// 521: fload 29
// 523: fneg
// 524: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 527: aload 36
// 529: lload 16
// 52b: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 52e: pop
// 52f: aload 1
// 530: aload 2
// 531: fload 29
// 533: lload 18
// 535: fload 33
// 537: fload 29
// 539: fneg
// 53a: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 53d: aload 36
// 53f: lload 16
// 541: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 544: pop
// 545: aload 1
// 546: aload 2
// 547: fload 29
// 549: lload 18
// 54b: fload 33
// 54d: fload 29
// 54f: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 552: aload 36
// 554: lload 16
// 556: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 559: pop
// 55a: aload 1
// 55b: aload 2
// 55c: fload 29
// 55e: fneg
// 55f: lload 18
// 561: fload 33
// 563: fload 29
// 565: invokevirtual su/catlean/g7.O (Lorg/joml/Matrix4f;FJFF)Lsu/catlean/g7;
// 568: aload 36
// 56a: lload 16
// 56c: invokevirtual su/catlean/g7.n (Ljava/awt/Color;J)Lsu/catlean/g7;
// 56f: pop
// 570: fload 8
// 572: f2d
// 573: invokestatic java/lang/Math.toRadians (D)D
// 576: dstore 39
// 578: aload 0
// 579: fload 5
// 57b: fload 29
// 57d: fsub
// 57e: fload 31
// 580: fadd
// 581: fload 6
// 583: ldc 0.58
// 585: fadd
// 586: fload 7
// 588: fload 31
// 58a: fadd
// 58b: fload 29
// 58d: fsub
// 58e: fload 5
// 590: fload 6
// 592: ldc 0.58
// 594: fadd
// 595: fload 7
// 597: dload 39
// 599: invokespecial su/catlean/ke.b (FFFFFFD)Lnet/minecraft/class_243;
// 59c: astore 41
// 59e: aload 0
// 59f: fload 5
// 5a1: fload 29
// 5a3: fadd
// 5a4: fload 31
// 5a6: fsub
// 5a7: fload 6
// 5a9: ldc 0.58
// 5ab: fadd
// 5ac: fload 7
// 5ae: fload 31
// 5b0: fadd
// 5b1: fload 29
// 5b3: fsub
// 5b4: fload 5
// 5b6: fload 6
// 5b8: ldc 0.58
// 5ba: fadd
// 5bb: fload 7
// 5bd: dload 39
// 5bf: invokespecial su/catlean/ke.b (FFFFFFD)Lnet/minecraft/class_243;
// 5c2: astore 42
// 5c4: aload 0
// 5c5: fload 5
// 5c7: fload 29
// 5c9: fsub
// 5ca: fload 31
// 5cc: fadd
// 5cd: fload 6
// 5cf: ldc 0.58
// 5d1: fadd
// 5d2: fload 7
// 5d4: fload 31
// 5d6: fsub
// 5d7: fload 29
// 5d9: fadd
// 5da: fload 5
// 5dc: fload 6
// 5de: ldc 0.58
// 5e0: fadd
// 5e1: fload 7
// 5e3: dload 39
// 5e5: invokespecial su/catlean/ke.b (FFFFFFD)Lnet/minecraft/class_243;
// 5e8: astore 43
// 5ea: aload 0
// 5eb: fload 5
// 5ed: fload 29
// 5ef: fadd
// 5f0: fload 31
// 5f2: fsub
// 5f3: fload 6
// 5f5: ldc 0.58
// 5f7: fadd
// 5f8: fload 7
// 5fa: fload 31
// 5fc: fsub
// 5fd: fload 29
// 5ff: fadd
// 600: fload 5
// 602: fload 6
// 604: ldc 0.58
// 606: fadd
// 607: fload 7
// 609: dload 39
// 60b: invokespecial su/catlean/ke.b (FFFFFFD)Lnet/minecraft/class_243;
// 60e: astore 44
// 610: aload 0
// 611: fload 5
// 613: fload 29
// 615: fsub
// 616: fload 31
// 618: fadd
// 619: fload 6
// 61b: ldc 0.58
// 61d: fadd
// 61e: fload 7
// 620: fload 5
// 622: fload 6
// 624: ldc 0.58
// 626: fadd
// 627: fload 7
// 629: dload 39
// 62b: invokespecial su/catlean/ke.b (FFFFFFD)Lnet/minecraft/class_243;
// 62e: astore 45
// 630: aload 0
// 631: fload 5
// 633: fload 29
// 635: fadd
// 636: fload 31
// 638: fsub
// 639: fload 6
// 63b: ldc 0.58
// 63d: fadd
// 63e: fload 7
// 640: fload 5
// 642: fload 6
// 644: ldc 0.58
// 646: fadd
// 647: fload 7
// 649: dload 39
// 64b: invokespecial su/catlean/ke.b (FFFFFFD)Lnet/minecraft/class_243;
// 64e: astore 46
// 650: aload 0
// 651: fload 5
// 653: fload 6
// 655: ldc 0.58
// 657: fadd
// 658: fload 7
// 65a: fload 31
// 65c: fadd
// 65d: fload 29
// 65f: fsub
// 660: fload 5
// 662: fload 6
// 664: ldc 0.58
// 666: fadd
// 667: fload 7
// 669: dload 39
// 66b: invokespecial su/catlean/ke.b (FFFFFFD)Lnet/minecraft/class_243;
// 66e: astore 47
// 670: aload 0
// 671: fload 5
// 673: fload 6
// 675: ldc 0.58
// 677: fadd
// 678: fload 7
// 67a: fload 31
// 67c: fsub
// 67d: fload 29
// 67f: fadd
// 680: fload 5
// 682: fload 6
// 684: ldc 0.58
// 686: fadd
// 687: fload 7
// 689: dload 39
// 68b: invokespecial su/catlean/ke.b (FFFFFFD)Lnet/minecraft/class_243;
// 68e: astore 48
// 690: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 693: iload 13
// 695: iload 14
// 697: i2b
// 698: aload 41
// 69a: aload 42
// 69c: aload 38
// 69e: iload 15
// 6a0: aconst_null
// 6a1: sipush 20211
// 6a4: ldc2_w 6660193539931208152
// 6a7: lload 3
// 6a8: lxor
// 6a9: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6ae: aconst_null
// 6af: invokestatic su/catlean/zi.C (Lsu/catlean/zi;IBLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;ILjava/awt/Color;ILjava/lang/Object;)Z
// 6b2: pop
// 6b3: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 6b6: iload 13
// 6b8: iload 14
// 6ba: i2b
// 6bb: aload 43
// 6bd: aload 44
// 6bf: aload 38
// 6c1: iload 15
// 6c3: aconst_null
// 6c4: sipush 17118
// 6c7: ldc2_w 5104180701346002423
// 6ca: lload 3
// 6cb: lxor
// 6cc: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6d1: aconst_null
// 6d2: invokestatic su/catlean/zi.C (Lsu/catlean/zi;IBLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;ILjava/awt/Color;ILjava/lang/Object;)Z
// 6d5: pop
// 6d6: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 6d9: iload 13
// 6db: iload 14
// 6dd: i2b
// 6de: aload 45
// 6e0: aload 46
// 6e2: aload 38
// 6e4: iload 15
// 6e6: aconst_null
// 6e7: sipush 17118
// 6ea: ldc2_w 5104180701346002423
// 6ed: lload 3
// 6ee: lxor
// 6ef: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6f4: aconst_null
// 6f5: invokestatic su/catlean/zi.C (Lsu/catlean/zi;IBLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;ILjava/awt/Color;ILjava/lang/Object;)Z
// 6f8: pop
// 6f9: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 6fc: iload 13
// 6fe: iload 14
// 700: i2b
// 701: aload 42
// 703: aload 44
// 705: aload 38
// 707: iload 15
// 709: aconst_null
// 70a: sipush 17118
// 70d: ldc2_w 5104180701346002423
// 710: lload 3
// 711: lxor
// 712: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 717: aconst_null
// 718: invokestatic su/catlean/zi.C (Lsu/catlean/zi;IBLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;ILjava/awt/Color;ILjava/lang/Object;)Z
// 71b: pop
// 71c: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 71f: iload 13
// 721: iload 14
// 723: i2b
// 724: aload 41
// 726: aload 43
// 728: aload 38
// 72a: iload 15
// 72c: aconst_null
// 72d: sipush 17118
// 730: ldc2_w 5104180701346002423
// 733: lload 3
// 734: lxor
// 735: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 73a: aconst_null
// 73b: invokestatic su/catlean/zi.C (Lsu/catlean/zi;IBLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;ILjava/awt/Color;ILjava/lang/Object;)Z
// 73e: pop
// 73f: getstatic su/catlean/zi.v Lsu/catlean/zi;
// 742: iload 13
// 744: iload 14
// 746: i2b
// 747: aload 47
// 749: aload 48
// 74b: aload 38
// 74d: iload 15
// 74f: aconst_null
// 750: sipush 17118
// 753: ldc2_w 5104180701346002423
// 756: lload 3
// 757: lxor
// 758: invokedynamic x (IJ)I bsm=su/catlean/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 75d: aconst_null
// 75e: invokestatic su/catlean/zi.C (Lsu/catlean/zi;IBLnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;ILjava/awt/Color;ILjava/lang/Object;)Z
// 761: pop
// 762: return
}

private final class_243 b(float var1, float var2, float var3, float var4, float var5, float var6, double var7) {
double var9 = Math.sin(var7);
double var11 = Math.cos(var7);
float var13 = var1 - var4;
float var14 = var3 - var6;
float var15 = var2 - var5;
double var16 = var13 * var11 + var14 * var9;
double var18 = -var13 * var9 + var14 * var11;
return new class_243(var4 + var16, (double)var5 + var15, var6 + var18);
}

static {
long var20 = b ^ 83953863487990L;
long var22 = var20 ^ 89475063320185L;
int var24 = (int)((var20 ^ 14157087000970L) >>> 48);
long var25 = (var20 ^ 14157087000970L) << 16 >>> 16;
long var10001 = var20 ^ 70870467127223L;
int var27 = (int)((var20 ^ 70870467127223L) >>> 48);
int var28 = (int)((var20 ^ 70870467127223L) << 16 >>> 32);
int var29 = (int)(var10001 << 48 >>> 48);
long var30 = var20 ^ 68233247023701L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[22];
int var16 = 0;
String var15 = "}\u0001ôÉ\u0091»\u0088ÀkO\u009cÄ ^Ðæo\f \u0086L[Iè°\u0004º³d\u0085ãÊ\u0086PzÅ%'Ñ\u0018¾\u0089kNE\u0087\u0088ÝÉâúI\t}\u0092$uz\u009c¶µ\f\u0087\u0016\u0018Ä%c\u001bØ\u0014$\u0085fÏ_Ò¼1\u0003ù \u0019½.\u0088ÑßÁ få\u000b\u0097ÒQv\u000bna\u001eú\r\u0090øÉÅ\u007fB\u0089Æ6AS²\u0094|\u001eÃ¤ñ0 Û°[«;1KAæûjù\u0006 -\u0004¡\u001b\u008f¿\u001a/þ¡g\u008b.7\u008eÏà\u0017\u0010P0\u001a\u0096+X\u009aú'},Í;¤¦Ù òÝÈñÒãR;zÂòH_`$\r]\u0085\u0006Ö\u0010\u0019\u008d2Ëá&\u0099ÐwÆ1\u00104_\u0005Ñ>ûFe\bÿsõ\bË\"È\u0018°±&«\b\u0011û\u008d\u008f}5\u0001\u0012ßÁÍ2D½ç÷UÃ\u008c\u00100\u0007aÞ#c¤æ\u00950b-\u0016\u0007Ã\u0097  \u000efíºõæH±\u0089\u0006#&IæE.©l3Üà\u009cq[;ß\u008bQÆP]\u0018\u0013\u0013\u009c \u0013¦û\u0098jcPÎÅÌGPÀÊnØðpd\u008c\u0010\u009cÿfWUz Ûz\u000b\f#Cò=o\u0010\u008aâ\u0006ÚN(=\u0099\nhFÄ×î\u0011â\u0018H#ò1\u0011ñàç\u0084¥u©{íÝ5\u0017\u009fã\u0002åXô¥\u0010\u008aR\u0085\tê¦É\u000f|ïõÚ\u0011@\u001d~\u0010\u001d}¥~\u0014\u0092û\u0017ÖÉCH\u0001`Ù\\\u0018R\r9.?d\u000425W\u0090(\u0087Ðhä×´úÓÈ,Ñm \u008f¶/\u00adÀ¤Ý³°\u001cÁIgóm,tÂðfJT¡\u0085\u0084¡w\u0091d\u000bÓ\u008c(å\u001d\u0089&\u0002M\u0016\n)\r\u0010\rþ\u0017HfU3\u0017Ë¤d\u0090\u000b\u0017¸:\u0084¾\u0017ÈÄ\u0012\u0094¹\\\u00178\u0083¥ \u0001Ý\u0080ìÛ\u0081ØA\rA$ëÊ\u0082|Ù\u008f\u0090Ww;0YÚ\u0082=\u0090é\u008bªÆ«";
int var17 = "}\u0001ôÉ\u0091»\u0088ÀkO\u009cÄ ^Ðæo\f \u0086L[Iè°\u0004º³d\u0085ãÊ\u0086PzÅ%'Ñ\u0018¾\u0089kNE\u0087\u0088ÝÉâúI\t}\u0092$uz\u009c¶µ\f\u0087\u0016\u0018Ä%c\u001bØ\u0014$\u0085fÏ_Ò¼1\u0003ù \u0019½.\u0088ÑßÁ få\u000b\u0097ÒQv\u000bna\u001eú\r\u0090øÉÅ\u007fB\u0089Æ6AS²\u0094|\u001eÃ¤ñ0 Û°[«;1KAæûjù\u0006 -\u0004¡\u001b\u008f¿\u001a/þ¡g\u008b.7\u008eÏà\u0017\u0010P0\u001a\u0096+X\u009aú'},Í;¤¦Ù òÝÈñÒãR;zÂòH_`$\r]\u0085\u0006Ö\u0010\u0019\u008d2Ëá&\u0099ÐwÆ1\u00104_\u0005Ñ>ûFe\bÿsõ\bË\"È\u0018°±&«\b\u0011û\u008d\u008f}5\u0001\u0012ßÁÍ2D½ç÷UÃ\u008c\u00100\u0007aÞ#c¤æ\u00950b-\u0016\u0007Ã\u0097  \u000efíºõæH±\u0089\u0006#&IæE.©l3Üà\u009cq[;ß\u008bQÆP]\u0018\u0013\u0013\u009c \u0013¦û\u0098jcPÎÅÌGPÀÊnØðpd\u008c\u0010\u009cÿfWUz Ûz\u000b\f#Cò=o\u0010\u008aâ\u0006ÚN(=\u0099\nhFÄ×î\u0011â\u0018H#ò1\u0011ñàç\u0084¥u©{íÝ5\u0017\u009fã\u0002åXô¥\u0010\u008aR\u0085\tê¦É\u000f|ïõÚ\u0011@\u001d~\u0010\u001d}¥~\u0014\u0092û\u0017ÖÉCH\u0001`Ù\\\u0018R\r9.?d\u000425W\u0090(\u0087Ðhä×´úÓÈ,Ñm \u008f¶/\u00adÀ¤Ý³°\u001cÁIgóm,tÂðfJT¡\u0085\u0084¡w\u0091d\u000bÓ\u008c(å\u001d\u0089&\u0002M\u0016\n)\r\u0010\rþ\u0017HfU3\u0017Ë¤d\u0090\u000b\u0017¸:\u0084¾\u0017ÈÄ\u0012\u0094¹\\\u00178\u0083¥ \u0001Ý\u0080ìÛ\u0081ØA\rA$ëÊ\u0082|Ù\u008f\u0090Ww;0YÚ\u0082=\u0090é\u008bªÆ«"
.length();
char var14 = '@';
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
byte var43 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var54 = b(var19).intern();
switch (var43) {
case 0:
var18[var16++] = var54;
if ((var35 += var14) >= var17) {
c = var18;
d = new String[22];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[14];
int var3 = 0;
String var4 = "\u001eþÓ\u0082\u0004\u00130R>\tQÎ\u00ad²x 9§Ì\u0005\u000b\u0012ÕÚú)Ä\u009f\u0081!W1¬ê.Uxâ\u0081Â»4ÅN£'\u008e\u008f\u0093\u0089'#^Ô±ç[õk/ ò£íD\u0087¾±¥<\u008bNÇ\"²]6\u007f?Ö£æbÚ±´Ýæ®\u008c\u001et.u\t\u0094";
int var5 = "\u001eþÓ\u0082\u0004\u00130R>\tQÎ\u00ad²x 9§Ì\u0005\u000b\u0012ÕÚú)Ä\u009f\u0081!W1¬ê.Uxâ\u0081Â»4ÅN£'\u008e\u008f\u0093\u0089'#^Ô±ç[õk/ ò£íD\u0087¾±¥<\u008bNÇ\"²]6\u007f?Ö£æbÚ±´Ýæ®\u008c\u001et.u\t\u0094"
.length();
byte var2 = 0;

label36:
while (true) {
byte var47 = var2;
var2 += 8;
byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
int var48 = var3++;
long var58 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var64 = -1;

while (true) {
long var8 = var58;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var69 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var64) {
case 0:
var39[var48] = var69;
if (var2 >= var5) {
f = var6;
g = new Integer[14];
KProperty[] var32 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ke.class, b<"g">(17645, 1513937527599587132L ^ var20), b<"g">(27586, 3099787624853860359L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ke.class, b<"g">(12466, 827239222720211822L ^ var20), b<"g">(19700, 8233115062292567856L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ke.class, b<"g">(3535, 1610316614182704652L ^ var20), b<"g">(3931, 7394922650579113099L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ke.class, b<"g">(17640, 3662545805247962934L ^ var20), b<"g">(29119, 68897302105057898L ^ var20), 0))
};
o = var32;
a = new ke(var30);
jk var40 = a;
short var50 = (short)var24;
String var60 = b<"g">(21792, 7140014324701023991L ^ var20);
Color var66 = Color.YELLOW;
Intrinsics.checkNotNullExpressionValue(Color.YELLOW, b<"g">(29344, 7662947501904685439L ^ var20));
J = yp.b(var40, var50, var60, var66, null, null, c<"x">(23409, 5708160522698099534L ^ var20), null, var25);
jk var41 = a;
short var51 = (short)var24;
String var61 = b<"g">(12801, 6677547391922514389L ^ var20);
jl var67 = jl.y;
Color var70 = Color.YELLOW;
Intrinsics.checkNotNullExpressionValue(Color.YELLOW, b<"g">(5034, 7200326011057703026L ^ var20));
T = yp.b(var41, var51, var61, var67.p(var70, (char)var27, var28, 0.2F, (short)var29), null, null, c<"x">(23409, 5708160522698099534L ^ var20), null, var25);
jk var42 = a;
short var52 = (short)var24;
String var62 = b<"g">(10072, 7161072360314616961L ^ var20);
jl var68 = jl.y;
Color var71 = Color.ORANGE;
Intrinsics.checkNotNullExpressionValue(Color.ORANGE, b<"g">(10198, 1427450186624154637L ^ var20));
w = yp.b(var42, var52, var62, var68.p(var71, (char)var27, var28, 0.2F, (short)var29), null, null, c<"x">(23409, 5708160522698099534L ^ var20), null, var25);
y = yp.L(
a,
b<"g">(32138, 3540296664536573532L ^ var20),
c<"x">(19827, 7869483022346132813L ^ var20),
new IntRange(0, c<"x">(16251, 7260554602083544907L ^ var20)),
var22,
null,
null,
c<"x">(588, 5938596296707920504L ^ var20),
null
);
x = new Color(c<"x">(14178, 1315062714977249113L ^ var20), c<"x">(1854, 3592399614308964105L ^ var20), c<"x">(1854, 3592399614308964105L ^ var20));
U = new ArrayList();
return;
}
break;
default:
var39[var48] = var69;
if (var2 < var5) {
continue label36;
}

var4 = "\u0097ÖÑFDû\u00189I\t³µ>ô¨\u009c";
var5 = "\u0097ÖÑFDû\u00189I\t³µ>ô¨\u009c".length();
var2 = 0;
}

byte var49 = var2;
var2 += 8;
var7 = var4.substring(var49, var2).getBytes("ISO-8859-1");
var39 = var6;
var48 = var3++;
var58 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var64 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var54;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "¾8äçH\u0090â\u0082üFÑÆ3v7¨\n%¹«\u001ePÆ\fý9Z¤×F3\u0086\u0011Hzja\rÂ9UB8W\u009e\u0099Î¾\u009b\u001a°â\"\u0090²é8\u009eF\\àÄ\u008bSø¦Øv\u0087ÒÄ\u0017qD²ü\u0007ú¶F#\u0085=\u009b£\u008eM\u0001)5±\u009f\u0098:mÇ\u00026\u0015¢9\u009að®ØÞ<µ\u0082o¦\u0095\u001f";
var17 = "¾8äçH\u0090â\u0082üFÑÆ3v7¨\n%¹«\u001ePÆ\fý9Z¤×F3\u0086\u0011Hzja\rÂ9UB8W\u009e\u0099Î¾\u009b\u001a°â\"\u0090²é8\u009eF\\àÄ\u008bSø¦Øv\u0087ÒÄ\u0017qD²ü\u0007ú¶F#\u0085=\u009b£\u008eM\u0001)5±\u009f\u0098:mÇ\u00026\u0015¢9\u009að®ØÞ<µ\u0082o¦\u0095\u001f"
.length();
var14 = '8';
var35 = -1;
}

var36 = var15.substring(++var35, var35 + var14);
var43 = 0;
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

private static String b(int var0, long var1) {
int var5 = var0 ^ (int)(var1 & 32767L) ^ 24093;
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
throw new RuntimeException("su/catlean/ke", var10);
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
d[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return d[var5];
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
throw new RuntimeException("su/catlean/ke" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 5630;
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
throw new RuntimeException("su/catlean/ke", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
g[var3] = var15;
}

return g[var3];
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
throw new RuntimeException("su/catlean/ke" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
