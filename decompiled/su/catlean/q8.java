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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_2596;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import net.minecraft.class_2828.class_2830;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class q8 extends _g {
@NotNull
public static final q8 K;
static final KProperty[] o;
@NotNull
private static final cq f;
@Nullable
private static class_2338 U;
@NotNull
private static final bg C;
private static final long a = yz.a(6052444199711677721L, 4870263944490121535L, MethodHandles.lookup().lookupClass()).a(113119130375600L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] e;
private static final Integer[] g;
private static final Map h;

private q8(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 122072375364133L;
super(b<"k">(9321, 2908427169349070521L ^ var1), jt.n(), null, 4, null, var3);
}

private final boolean e(int var1, int var2, int var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 85419709773720L;
return (Boolean)f.E(this, var6, o[0]);
}

@Override
public void O(long var1) {
int var3 = (int)((var1 ^ 103451004335712L) >>> 56);
long var4 = (var1 ^ 103451004335712L) << 8 >>> 8;
long var6 = var1 ^ 67464996320865L;
vm.a<"Å">(2655658487221413511L, var1);
U = class_2338.method_49638((class_2374)this.J((byte)var3, var4, (class_1297)zf.v(var6)));

try {
if (vm.a<"Å">(2620972475537570510L, var1) != null) {
vm.a<"Å">(new int[3], 2630560039055027712L, var1);
}
} catch (NumberFormatException var9) {
throw vm.a<"Å">(var9, 2597472071395217909L, var1);
}
}

@Flow
public final void H(@NotNull PlayerUpdateEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q8.a J
// 003: ldc2_w 120821111030847
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 103734241443494
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 32643636015233
// 014: lxor
// 015: dup2
// 016: bipush 56
// 018: lushr
// 019: l2i
// 01a: istore 6
// 01c: dup2
// 01d: bipush 8
// 01f: lshl
// 020: bipush 8
// 022: lushr
// 023: lstore 7
// 025: pop2
// 026: dup2
// 027: ldc2_w 44184427386185
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 137480680155472
// 031: lxor
// 032: lstore 11
// 034: dup2
// 035: ldc2_w 106181103681443
// 038: lxor
// 039: dup2
// 03a: bipush 32
// 03c: lushr
// 03d: l2i
// 03e: istore 13
// 040: dup2
// 041: bipush 32
// 043: lshl
// 044: bipush 48
// 046: lushr
// 047: l2i
// 048: istore 14
// 04a: dup2
// 04b: bipush 48
// 04d: lshl
// 04e: bipush 48
// 050: lushr
// 051: l2i
// 052: istore 15
// 054: pop2
// 055: dup2
// 056: ldc2_w 133654845815956
// 059: lxor
// 05a: lstore 16
// 05c: dup2
// 05d: ldc2_w 44115296685267
// 060: lxor
// 061: lstore 18
// 063: dup2
// 064: ldc2_w 139293391652037
// 067: lxor
// 068: lstore 20
// 06a: dup2
// 06b: ldc2_w 17519049886032
// 06e: lxor
// 06f: lstore 22
// 071: dup2
// 072: ldc2_w 88738882814833
// 075: lxor
// 076: lstore 24
// 078: dup2
// 079: ldc2_w 139625279172736
// 07c: lxor
// 07d: lstore 26
// 07f: dup2
// 080: ldc2_w 68438681042855
// 083: lxor
// 084: lstore 28
// 086: pop2
// 087: aload 1
// 088: ldc "e"
// 08a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 08d: ldc2_w 7078401821023936614
// 090: lload 2
// 091: invokedynamic Å (JJ)[I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: aload 0
// 097: lload 26
// 099: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 09c: iload 6
// 09e: i2b
// 09f: swap
// 0a0: lload 7
// 0a2: dup2_x1
// 0a3: pop2
// 0a4: checkcast net/minecraft/class_1297
// 0a7: invokevirtual su/catlean/q8.J (BJLnet/minecraft/class_1297;)Lnet/minecraft/class_243;
// 0aa: checkcast net/minecraft/class_2374
// 0ad: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
// 0b0: dup
// 0b1: sipush 14423
// 0b4: ldc2_w 1782779692705041302
// 0b7: lload 2
// 0b8: lxor
// 0b9: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/q8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0be: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c1: astore 31
// 0c3: astore 30
// 0c5: aload 0
// 0c6: iload 13
// 0c8: iload 14
// 0ca: iload 15
// 0cc: invokespecial su/catlean/q8.e (III)Z
// 0cf: aload 30
// 0d1: ifnull 0f9
// 0d4: ifne 10d
// 0d7: goto 0e4
// 0da: ldc2_w 7128442504752125716
// 0dd: lload 2
// 0de: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e3: athrow
// 0e4: aload 31
// 0e6: getstatic su/catlean/q8.U Lnet/minecraft/class_2338;
// 0e9: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
// 0ec: goto 0f9
// 0ef: ldc2_w 7128442504752125716
// 0f2: lload 2
// 0f3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f8: athrow
// 0f9: ifne 10d
// 0fc: aload 0
// 0fd: lload 24
// 0ff: invokevirtual su/catlean/q8.d (J)V
// 102: return
// 103: ldc2_w 7128442504752125716
// 106: lload 2
// 107: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10c: athrow
// 10d: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 110: bipush 1
// 111: anewarray 162
// 114: astore 33
// 116: aload 33
// 118: bipush 0
// 119: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
// 11c: dup
// 11d: sipush 4751
// 120: ldc2_w 1503414893496164682
// 123: lload 2
// 124: lxor
// 125: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/q8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 12d: aastore
// 12e: aload 33
// 130: lload 11
// 132: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_2248;J)Lsu/catlean/fg;
// 135: astore 32
// 137: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 13a: bipush 1
// 13b: anewarray 162
// 13e: astore 34
// 140: aload 34
// 142: bipush 0
// 143: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
// 146: dup
// 147: sipush 16867
// 14a: ldc2_w 4890695895332434467
// 14d: lload 2
// 14e: lxor
// 14f: invokedynamic k (IJ)Ljava/lang/String; bsm=su/catlean/q8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 154: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 157: aastore
// 158: aload 34
// 15a: lload 11
// 15c: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_2248;J)Lsu/catlean/fg;
// 15f: astore 33
// 161: aload 32
// 163: aload 30
// 165: ifnull 18f
// 168: invokevirtual su/catlean/fg.R ()Z
// 16b: ifne 18d
// 16e: goto 17b
// 171: ldc2_w 7128442504752125716
// 174: lload 2
// 175: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: athrow
// 17b: aload 33
// 17d: invokevirtual su/catlean/fg.a ()I
// 180: goto 192
// 183: ldc2_w 7128442504752125716
// 186: lload 2
// 187: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18c: athrow
// 18d: aload 32
// 18f: invokevirtual su/catlean/fg.a ()I
// 192: istore 34
// 194: aload 30
// 196: ifnull 1e9
// 199: iload 34
// 19b: bipush -1
// 19c: if_icmpeq 1d6
// 19f: goto 1ac
// 1a2: ldc2_w 7128442504752125716
// 1a5: lload 2
// 1a6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ab: athrow
// 1ac: lload 4
// 1ae: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1b1: invokevirtual net/minecraft/class_310.method_1542 ()Z
// 1b4: aload 30
// 1b6: ifnull 1ff
// 1b9: goto 1c6
// 1bc: ldc2_w 7128442504752125716
// 1bf: lload 2
// 1c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c5: athrow
// 1c6: ifeq 1ea
// 1c9: goto 1d6
// 1cc: ldc2_w 7128442504752125716
// 1cf: lload 2
// 1d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d5: athrow
// 1d6: aload 0
// 1d7: lload 24
// 1d9: invokevirtual su/catlean/q8.d (J)V
// 1dc: goto 1e9
// 1df: ldc2_w 7128442504752125716
// 1e2: lload 2
// 1e3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e8: athrow
// 1e9: return
// 1ea: getstatic su/catlean/q8.C Lsu/catlean/bg;
// 1ed: sipush 31529
// 1f0: ldc2_w 8798794218563612783
// 1f3: lload 2
// 1f4: lxor
// 1f5: invokedynamic t (IJ)I bsm=su/catlean/q8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1fa: lload 22
// 1fc: invokevirtual su/catlean/bg.c (IJ)Z
// 1ff: ifeq 313
// 202: lload 26
// 204: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 207: invokevirtual net/minecraft/class_746.method_36455 ()F
// 20a: fstore 35
// 20c: sipush 31249
// 20f: ldc2_w 5333881795079123286
// 212: lload 2
// 213: lxor
// 214: invokedynamic t (IJ)I bsm=su/catlean/q8.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: i2f
// 21a: fload 35
// 21c: fsub
// 21d: fstore 36
// 21f: aload 0
// 220: ldc2_w 0.42
// 223: fload 35
// 225: fload 36
// 227: ldc 0.25
// 229: fmul
// 22a: fadd
// 22b: lload 9
// 22d: dup2_x1
// 22e: pop2
// 22f: invokespecial su/catlean/q8.b (DJF)V
// 232: aload 0
// 233: ldc2_w 0.75
// 236: fload 35
// 238: fload 36
// 23a: ldc 0.5
// 23c: fmul
// 23d: fadd
// 23e: lload 9
// 240: dup2_x1
// 241: pop2
// 242: invokespecial su/catlean/q8.b (DJF)V
// 245: aload 0
// 246: ldc2_w 1.01
// 249: fload 35
// 24b: fload 36
// 24d: ldc 0.75
// 24f: fmul
// 250: fadd
// 251: lload 9
// 253: dup2_x1
// 254: pop2
// 255: invokespecial su/catlean/q8.b (DJF)V
// 258: aload 0
// 259: ldc2_w 1.16
// 25c: fload 35
// 25e: fload 36
// 260: fadd
// 261: lload 9
// 263: dup2_x1
// 264: pop2
// 265: invokespecial su/catlean/q8.b (DJF)V
// 268: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 26b: lload 28
// 26d: iload 34
// 26f: invokevirtual su/catlean/gg.B (JI)V
// 272: aload 31
// 274: invokedynamic predict (Lnet/minecraft/class_2338;)Lnet/minecraft/class_7204; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Lnet/minecraft/class_2596;, su/catlean/q8.D (Lnet/minecraft/class_2338;I)Lnet/minecraft/class_2596;, (I)Lnet/minecraft/class_2596; ]
// 279: lload 18
// 27b: dup2_x1
// 27c: pop2
// 27d: invokestatic su/catlean/_r.R (JLnet/minecraft/class_7204;)V
// 280: new net/minecraft/class_2879
// 283: dup
// 284: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 287: invokespecial net/minecraft/class_2879.<init> (Lnet/minecraft/class_1268;)V
// 28a: checkcast net/minecraft/class_2596
// 28d: lload 20
// 28f: dup2_x1
// 290: pop2
// 291: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 294: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 297: lload 16
// 299: invokevirtual su/catlean/gg.d (J)V
// 29c: new net/minecraft/class_2828$class_2830
// 29f: dup
// 2a0: lload 26
// 2a2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2a5: invokevirtual net/minecraft/class_746.method_23317 ()D
// 2a8: lload 26
// 2aa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2ad: invokevirtual net/minecraft/class_746.method_23318 ()D
// 2b0: fconst_1
// 2b1: f2d
// 2b2: dadd
// 2b3: lload 26
// 2b5: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2b8: invokevirtual net/minecraft/class_746.method_23321 ()D
// 2bb: lload 26
// 2bd: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2c0: invokevirtual net/minecraft/class_746.method_36454 ()F
// 2c3: ldc 90.0
// 2c5: bipush 1
// 2c6: lload 26
// 2c8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2cb: getfield net/minecraft/class_746.field_5976 Z
// 2ce: invokespecial net/minecraft/class_2828$class_2830.<init> (DDDFFZZ)V
// 2d1: checkcast net/minecraft/class_2596
// 2d4: lload 20
// 2d6: dup2_x1
// 2d7: pop2
// 2d8: invokestatic su/catlean/_r.a (JLnet/minecraft/class_2596;)V
// 2db: getstatic su/catlean/q8.C Lsu/catlean/bg;
// 2de: invokevirtual su/catlean/bg.l ()V
// 2e1: aload 0
// 2e2: aload 30
// 2e4: ifnull 30e
// 2e7: iload 13
// 2e9: iload 14
// 2eb: iload 15
// 2ed: invokespecial su/catlean/q8.e (III)Z
// 2f0: ifeq 313
// 2f3: goto 300
// 2f6: ldc2_w 7128442504752125716
// 2f9: lload 2
// 2fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2ff: athrow
// 300: aload 0
// 301: goto 30e
// 304: ldc2_w 7128442504752125716
// 307: lload 2
// 308: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30d: athrow
// 30e: lload 24
// 310: invokevirtual su/catlean/q8.d (J)V
// 313: aload 30
// 315: ifnonnull 332
// 318: bipush 1
// 319: anewarray 300
// 31c: ldc2_w 7118209181714835701
// 31f: lload 2
// 320: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 325: goto 332
// 328: ldc2_w 7128442504752125716
// 32b: lload 2
// 32c: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 331: athrow
// 332: return
}

private final void b(double var1, long var3, float var5) {
var3 = a ^ var3;
long var6 = var3 ^ 132952506480220L;
long var8 = var3 ^ 132738730426905L;
_r.a(
var6,
(class_2596)(
new class_2830(
zf.v(var8).method_23317(), zf.v(var8).method_23318() + var1, zf.v(var8).method_23321(), zf.v(var8).method_36454(), var5, false, zf.v(var8).field_5976
)
)
);
}

private static final class_2596 D(class_2338 var0, int var1) {
return (class_2596)(
new class_2885(class_1268.field_5808, new class_3965(var0.method_46558().method_1031(0.0, -0.5, 0.0), class_2350.field_11036, var0.method_10074(), false), var1)
);
}

static {
long var20 = a ^ 14482307244927L;
long var22 = var20 ^ 73773200259459L;
long var24 = var20 ^ 28201849700989L;
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
String var15 = "\u0089`¾\u00ad\u001e^¾\u001f÷\u0010¶B)7³åqs\u0016Þcõ6¡ Ã\u000b\u0083]}9YÉM,\u0019óÝ\u0092x¨D{Ç\u0016v\fÄ\u001c\r\u0018ª_ä÷Ê\u0018\u0010(·Í\tz«óÉ\u001fáOØzye©\u0010òÓ;²¢\t\u0004$\u0099Àü\u001dÇ´ÔA\u0018\u0003Q~\u0092ÄªBMû\rb\u0081\u0012Î~Á@Óed\nK7è";
int var17 = "\u0089`¾\u00ad\u001e^¾\u001f÷\u0010¶B)7³åqs\u0016Þcõ6¡ Ã\u000b\u0083]}9YÉM,\u0019óÝ\u0092x¨D{Ç\u0016v\fÄ\u001c\r\u0018ª_ä÷Ê\u0018\u0010(·Í\tz«óÉ\u001fáOØzye©\u0010òÓ;²¢\t\u0004$\u0099Àü\u001dÇ´ÔA\u0018\u0003Q~\u0092ÄªBMû\rb\u0081\u0012Î~Á@Óed\nK7è"
.length();
char var14 = 24;
int var28 = -1;

label45:
while (true) {
String var29 = var15.substring(++var28, var28 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
String var38 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var38;
if ((var28 += var14) >= var17) {
b = var18;
c = new String[7];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[3];
int var3 = 0;
String var4 = "\u0093\u001càk;6@6æ@¡±\u0007¥\u008b¹pW\u0088`,*·r";
int var5 = "\u0093\u001càk;6@6æ@¡±\u0007¥\u008b¹pW\u0088`,*·r".length();
byte var2 = 0;

do {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
var10001 = var3++;
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
long var10004 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
byte var43 = -1;
var6[var10001] = var10004;
} while (var2 < var5);

e = var6;
g = new Integer[3];
KProperty[] var26 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(q8.class, b<"k">(7757, 8744978483765185227L ^ var20), b<"k">(19398, 5561217188251262786L ^ var20), 0))
};
o = var26;
K = new q8(var22);
f = yp.t(K, b<"k">(6768, 8820664290458406647L ^ var20), true, var24, null, null, c<"t">(18239, 5421532342341102395L ^ var20), null);
C = new bg();
return;
}

var14 = var15.charAt(var28);
break;
default:
var18[var16++] = var38;
if ((var28 += var14) < var17) {
var14 = var15.charAt(var28);
continue label45;
}

var15 = "}.Ëßïâg\u008aRÒÎ\u008d\u0019\u0082\u0002TnÚ\u0087\u0082bþ¤Q³ûÉº\u0099XI6\u0010\u001d\u000b\u0016\u0004=\u009f\u000b\u0094`\u0014!²ßÛ~Ç";
var17 = "}.Ëßïâg\u008aRÒÎ\u008d\u0019\u0082\u0002TnÚ\u0087\u0082bþ¤Q³ûÉº\u0099XI6\u0010\u001d\u000b\u0016\u0004=\u009f\u000b\u0094`\u0014!²ßÛ~Ç".length();
var14 = ' ';
var28 = -1;
}

var29 = var15.substring(++var28, var28 + var14);
var10001 = 0;
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 4138;
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
throw new RuntimeException("su/catlean/q8", var10);
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
c[var5] = b(((Cipher)var4[0]).doFinal(var9));
}

return c[var5];
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
throw new RuntimeException("su/catlean/q8" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 10409;
if (g[var3] == null) {
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
throw new RuntimeException("su/catlean/q8", var14);
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
throw new RuntimeException("su/catlean/q8" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
