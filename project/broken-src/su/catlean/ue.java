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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class ue extends _g {
@NotNull
public static final ue X;
static final KProperty[] a;
@NotNull
private static final cw Y;
@NotNull
private static final c8 A;
private static final long b = yz.a(-5243057997229491718L, -891529913416286181L, MethodHandles.lookup().lookupClass()).a(19624012616299L);
private static final String[] c;
private static final String[] d;
private static final Map e = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map h;

private ue(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 89913912329325L;
super(b<"g">(5027, 170554263899639688L ^ var1), jt.V(), null, 4, null, var3);
}

private final af R(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 49346487198407L;
return (af)Y.E(this, var3, a[0]);
}

private final int p(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 87288912876976L;
return ((Number)A.E(this, var6, a[1])).intValue();
}

@Flow(
priority = -10
)
private final void R(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ue.b J
// 003: ldc2_w 35394217678791
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 27328551488538
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 52888389735094
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 125915722550825
// 01b: lxor
// 01c: dup2
// 01d: bipush 32
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 32
// 026: lshl
// 027: bipush 48
// 029: lushr
// 02a: l2i
// 02b: istore 9
// 02d: dup2
// 02e: bipush 48
// 030: lshl
// 031: bipush 48
// 033: lushr
// 034: l2i
// 035: istore 10
// 037: pop2
// 038: dup2
// 039: ldc2_w 69323450043944
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 83636887451908
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 52312391634547
// 04a: lxor
// 04b: dup2
// 04c: bipush 32
// 04e: lushr
// 04f: l2i
// 050: istore 15
// 052: dup2
// 053: bipush 32
// 055: lshl
// 056: bipush 48
// 058: lushr
// 059: l2i
// 05a: istore 16
// 05c: dup2
// 05d: bipush 48
// 05f: lshl
// 060: bipush 48
// 062: lushr
// 063: l2i
// 064: istore 17
// 066: pop2
// 067: dup2
// 068: ldc2_w 62119809417788
// 06b: lxor
// 06c: lstore 18
// 06e: dup2
// 06f: ldc2_w 132752896920859
// 072: lxor
// 073: lstore 20
// 075: pop2
// 076: ldc2_w 5825432270169046055
// 079: lload 2
// 07a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07f: astore 22
// 081: lload 18
// 083: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 086: getfield net/minecraft/class_746.field_5976 Z
// 089: aload 22
// 08b: ifnull 0ad
// 08e: ifne 09f
// 091: goto 09e
// 094: ldc2_w 5828398486922433295
// 097: lload 2
// 098: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: athrow
// 09e: return
// 09f: aload 0
// 0a0: lload 13
// 0a2: invokespecial su/catlean/ue.R (J)Lsu/catlean/af;
// 0a5: getstatic su/catlean/g0.U [I
// 0a8: swap
// 0a9: invokevirtual su/catlean/af.ordinal ()I
// 0ac: iaload
// 0ad: tableswitch 500 1 3 27 175 226
// 0c8: lload 18
// 0ca: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cd: lload 18
// 0cf: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0d2: getfield net/minecraft/class_746.field_6012 I
// 0d5: aload 0
// 0d6: iload 15
// 0d8: iload 16
// 0da: i2s
// 0db: iload 17
// 0dd: i2c
// 0de: invokespecial su/catlean/ue.p (ISC)I
// 0e1: irem
// 0e2: aload 22
// 0e4: ifnull 105
// 0e7: goto 0f4
// 0ea: ldc2_w 5828398486922433295
// 0ed: lload 2
// 0ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f3: athrow
// 0f4: ifne 108
// 0f7: goto 104
// 0fa: ldc2_w 5828398486922433295
// 0fd: lload 2
// 0fe: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 103: athrow
// 104: bipush 1
// 105: goto 109
// 108: bipush 0
// 109: invokevirtual net/minecraft/class_746.method_24830 (Z)V
// 10c: lload 18
// 10e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 111: aload 22
// 113: ifnull 13b
// 116: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 119: ifeq 2a1
// 11c: goto 129
// 11f: ldc2_w 5828398486922433295
// 122: lload 2
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: lload 18
// 12b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12e: goto 13b
// 131: ldc2_w 5828398486922433295
// 134: lload 2
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: lload 18
// 13d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 140: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 143: invokevirtual net/minecraft/class_243.method_10216 ()D
// 146: ldc2_w 0.42
// 149: lload 18
// 14b: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14e: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 151: invokevirtual net/minecraft/class_243.method_10215 ()D
// 154: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 157: aload 22
// 159: ifnonnull 2a1
// 15c: lload 18
// 15e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 161: lload 18
// 163: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 166: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 169: invokevirtual net/minecraft/class_243.method_10216 ()D
// 16c: ldc2_w 0.21
// 16f: lload 18
// 171: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 174: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 177: invokevirtual net/minecraft/class_243.method_10215 ()D
// 17a: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 17d: aload 22
// 17f: ifnonnull 2a1
// 182: goto 18f
// 185: ldc2_w 5828398486922433295
// 188: lload 2
// 189: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: athrow
// 18f: lload 18
// 191: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 194: getfield net/minecraft/class_746.field_6012 I
// 197: bipush 2
// 198: irem
// 199: aload 22
// 19b: ifnull 1d6
// 19e: goto 1ab
// 1a1: ldc2_w 5828398486922433295
// 1a4: lload 2
// 1a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1aa: athrow
// 1ab: ifne 2a1
// 1ae: goto 1bb
// 1b1: ldc2_w 5828398486922433295
// 1b4: lload 2
// 1b5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ba: athrow
// 1bb: lload 4
// 1bd: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 1c0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 1c3: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 1c6: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 1c9: goto 1d6
// 1cc: ldc2_w 5828398486922433295
// 1cf: lload 2
// 1d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d5: athrow
// 1d6: ifeq 2a1
// 1d9: aload 0
// 1da: lload 13
// 1dc: invokespecial su/catlean/ue.R (J)Lsu/catlean/af;
// 1df: getstatic su/catlean/af.WATER_BUCKET Lsu/catlean/af;
// 1e2: if_acmpne 2a1
// 1e5: goto 1f2
// 1e8: ldc2_w 5828398486922433295
// 1eb: lload 2
// 1ec: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f1: athrow
// 1f2: lload 18
// 1f4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1f7: invokevirtual net/minecraft/class_746.method_36455 ()F
// 1fa: fstore 23
// 1fc: lload 18
// 1fe: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 201: ldc 82.0
// 203: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 206: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 209: bipush 1
// 20a: anewarray 248
// 20d: astore 25
// 20f: aload 25
// 211: bipush 0
// 212: getstatic net/minecraft/class_1802.field_8705 Lnet/minecraft/class_1792;
// 215: dup
// 216: sipush 4207
// 219: ldc2_w 6211025771595794853
// 21c: lload 2
// 21d: lxor
// 21e: invokedynamic g (IJ)Ljava/lang/String; bsm=su/catlean/ue.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 223: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 226: aastore
// 227: iload 8
// 229: aload 25
// 22b: iload 9
// 22d: iload 10
// 22f: i2c
// 230: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 233: astore 24
// 235: aload 22
// 237: ifnull 28f
// 23a: aload 24
// 23c: invokevirtual su/catlean/fg.R ()Z
// 23f: ifeq 297
// 242: goto 24f
// 245: ldc2_w 5828398486922433295
// 248: lload 2
// 249: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24e: athrow
// 24f: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 252: aload 24
// 254: invokevirtual su/catlean/fg.a ()I
// 257: lload 20
// 259: dup2_x1
// 25a: pop2
// 25b: invokevirtual su/catlean/gg.B (JI)V
// 25e: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 261: fconst_0
// 262: lload 6
// 264: fconst_0
// 265: sipush 27413
// 268: ldc2_w 6146695031730880921
// 26b: lload 2
// 26c: lxor
// 26d: invokedynamic z (IJ)I bsm=su/catlean/ue.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 272: aconst_null
// 273: invokestatic su/catlean/ag.K (Lnet/minecraft/class_1268;FJFILjava/lang/Object;)Lnet/minecraft/class_1269;
// 276: pop
// 277: lload 18
// 279: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 27c: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
// 27f: invokevirtual net/minecraft/class_746.method_6104 (Lnet/minecraft/class_1268;)V
// 282: goto 28f
// 285: ldc2_w 5828398486922433295
// 288: lload 2
// 289: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 28e: athrow
// 28f: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 292: lload 11
// 294: invokevirtual su/catlean/gg.d (J)V
// 297: lload 18
// 299: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 29c: fload 23
// 29e: invokevirtual net/minecraft/class_746.method_36457 (F)V
// 2a1: return
}

@Flow
private final void U(PreSyncEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ue.b J
// 003: ldc2_w 131433907961688
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 87290382263429
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 110821728056680
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 30409280180635
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 122897965001379
// 022: lxor
// 023: lstore 10
// 025: pop2
// 026: ldc2_w -556405179006233416
// 029: lload 2
// 02a: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 02f: astore 12
// 031: aload 0
// 032: lload 8
// 034: invokespecial su/catlean/ue.R (J)Lsu/catlean/af;
// 037: getstatic su/catlean/g0.U [I
// 03a: swap
// 03b: invokevirtual su/catlean/af.ordinal ()I
// 03e: iaload
// 03f: aload 12
// 041: ifnull 07b
// 044: tableswitch 336 4 5 34 240
// 05c: ldc2_w -541005685021787248
// 05f: lload 2
// 060: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 065: athrow
// 066: lload 10
// 068: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 06b: getfield net/minecraft/class_746.field_5976 Z
// 06e: goto 07b
// 071: ldc2_w -541005685021787248
// 074: lload 2
// 075: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07a: athrow
// 07b: aload 12
// 07d: ifnull 0ab
// 080: ifeq 194
// 083: goto 090
// 086: ldc2_w -541005685021787248
// 089: lload 2
// 08a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08f: athrow
// 090: lload 4
// 092: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 095: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 098: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
// 09b: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 09e: goto 0ab
// 0a1: ldc2_w -541005685021787248
// 0a4: lload 2
// 0a5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0aa: athrow
// 0ab: aload 12
// 0ad: ifnull 0dc
// 0b0: ifeq 194
// 0b3: goto 0c0
// 0b6: ldc2_w -541005685021787248
// 0b9: lload 2
// 0ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bf: athrow
// 0c0: lload 10
// 0c2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0c5: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 0c8: invokevirtual net/minecraft/class_243.method_10214 ()D
// 0cb: ldc2_w -0.3739040364667221
// 0ce: dcmpg
// 0cf: goto 0dc
// 0d2: ldc2_w -541005685021787248
// 0d5: lload 2
// 0d6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0db: athrow
// 0dc: ifgt 194
// 0df: aload 0
// 0e0: lload 8
// 0e2: invokespecial su/catlean/ue.R (J)Lsu/catlean/af;
// 0e5: getstatic su/catlean/af.MATRIX_2 Lsu/catlean/af;
// 0e8: if_acmpne 194
// 0eb: goto 0f8
// 0ee: ldc2_w -541005685021787248
// 0f1: lload 2
// 0f2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f7: athrow
// 0f8: lload 10
// 0fa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0fd: bipush 1
// 0fe: invokevirtual net/minecraft/class_746.method_24830 (Z)V
// 101: lload 10
// 103: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 106: lload 10
// 108: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 10b: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 10e: invokevirtual net/minecraft/class_243.method_10216 ()D
// 111: ldc2_w 0.48114514191918
// 114: lload 10
// 116: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 119: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
// 11c: invokevirtual net/minecraft/class_243.method_10215 ()D
// 11f: invokevirtual net/minecraft/class_746.method_18800 (DDD)V
// 122: aload 12
// 124: ifnonnull 194
// 127: goto 134
// 12a: ldc2_w -541005685021787248
// 12d: lload 2
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: lload 10
// 136: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 139: getfield net/minecraft/class_746.field_5976 Z
// 13c: aload 12
// 13e: ifnull 173
// 141: goto 14e
// 144: ldc2_w -541005685021787248
// 147: lload 2
// 148: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14d: athrow
// 14e: ifeq 194
// 151: goto 15e
// 154: ldc2_w -541005685021787248
// 157: lload 2
// 158: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 15d: athrow
// 15e: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 161: lload 6
// 163: invokevirtual su/catlean/dm.Y (J)Z
// 166: goto 173
// 169: ldc2_w -541005685021787248
// 16c: lload 2
// 16d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 172: athrow
// 173: ifeq 194
// 176: lload 10
// 178: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 17b: bipush 1
// 17c: invokevirtual net/minecraft/class_746.method_24830 (Z)V
// 17f: lload 10
// 181: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 184: invokevirtual net/minecraft/class_746.method_6043 ()V
// 187: goto 194
// 18a: ldc2_w -541005685021787248
// 18d: lload 2
// 18e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 193: athrow
// 194: return
}

static {
long var20 = b ^ 108272409331594L;
long var22 = var20 ^ 90174148004522L;
long var24 = var20 ^ 20387698119486L;
long var26 = var20 ^ 66904309562744L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[8];
int var16 = 0;
String var15 = "²µ %\"\u0016\u0098í\u0099èY]\u0013«ùÝHõéâ\u001fÀ%\u008e\u009a4üCù\u0002,\u008b\u0010zS7eWH\u0085oµ^áéûAÆï\u00102\u0095ÅIì]¥£À¹Yóö>\u009e(\u0010rÒ·L\u008f)\u000bì§\u0090*Ñvã\u0087¦\u0010§´@\u0098\u000fÏ\u0013Ãë\u0093,þÎ;\u0004ô\u0018èÐJ\u008eôì\u001f\u001b\u0011z_6\u0085îN³Ø\u0081îçKwAT";
int var17 = "²µ %\"\u0016\u0098í\u0099èY]\u0013«ùÝHõéâ\u001fÀ%\u008e\u009a4üCù\u0002,\u008b\u0010zS7eWH\u0085oµ^áéûAÆï\u00102\u0095ÅIì]¥£À¹Yóö>\u009e(\u0010rÒ·L\u008f)\u000bì§\u0090*Ñvã\u0087¦\u0010§´@\u0098\u000fÏ\u0013Ãë\u0093,þÎ;\u0004ô\u0018èÐJ\u008eôì\u001f\u001b\u0011z_6\u0085îN³Ø\u0081îçKwAT"
.length();
char var14 = ' ';
int var31 = -1;

label54:
while (true) {
String var32 = var15.substring(++var31, var31 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
String var43 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var43;
if ((var31 += var14) >= var17) {
c = var18;
d = new String[8];
h = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[4];
int var3 = 0;
String var4 = "Î\u0082Ã\u0004 /pTBÈb\u0088\u007fñ\u00adÉ";
int var5 = "Î\u0082Ã\u0004 /pTBÈb\u0088\u007fñ\u00adÉ".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var35 = var6;
var10001 = var3++;
long var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var50 = -1;

while (true) {
long var8 = var47;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var52 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var50) {
case 0:
var35[var10001] = var52;
if (var2 >= var5) {
f = var6;
g = new Integer[4];
KProperty[] var28 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ue.class, b<"g">(3719, 4054656005502224132L ^ var20), b<"g">(26188, 3993819911226896332L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ue.class, b<"g">(27495, 1593984948974297825L ^ var20), b<"g">(11637, 4421698674978514167L ^ var20), 0))
};
a = var28;
X = new ue(var24);
Y = yp.L(X, b<"g">(15268, 6724426112431419937L ^ var20), af.DEFAULT, null, null, c<"z">(8805, 1347755892709152935L ^ var20), null, var26);
A = yp.L(
X,
b<"g">(5706, 1058763612056117198L ^ var20),
2,
new IntRange(1, c<"z">(1651, 2262480273100405936L ^ var20)),
var22,
null,
null,
c<"z">(27481, 474464751416480153L ^ var20),
null
);
return;
}
break;
default:
var35[var10001] = var52;
if (var2 < var5) {
continue label36;
}

var4 = "\u009a\u0011§\u0002g\u0086\\ºZ\u0019\u001d×îþ5o";
var5 = "\u009a\u0011§\u0002g\u0086\\ºZ\u0019\u001d×îþ5o".length();
var2 = 0;
}

byte var41 = var2;
var2 += 8;
var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
var35 = var6;
var10001 = var3++;
var47 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var50 = 0;
}
}
}

var14 = var15.charAt(var31);
break;
default:
var18[var16++] = var43;
if ((var31 += var14) < var17) {
var14 = var15.charAt(var31);
continue label54;
}

var15 = "ð8\u008b1Ó\u008dd¨\u007f\u00025Àc\u000f\u0006 0@\u008fu)x\u0080øÆó\\X\u009bqa\u0084Ö\nLÝÎV Â¥ÿ\u0084 \u0091,$\u0086îÓqGH6\u0083¥\u00ads\u0004\u0015-\u0001\u0099EJ";
var17 = "ð8\u008b1Ó\u008dd¨\u007f\u00025Àc\u000f\u0006 0@\u008fu)x\u0080øÆó\\X\u009bqa\u0084Ö\nLÝÎV Â¥ÿ\u0084 \u0091,$\u0086îÓqGH6\u0083¥\u00ads\u0004\u0015-\u0001\u0099EJ"
.length();
var14 = 16;
var31 = -1;
}

var32 = var15.substring(++var31, var31 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 18585;
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
throw new RuntimeException("su/catlean/ue", var10);
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
throw new RuntimeException("su/catlean/ue" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 31709;
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
throw new RuntimeException("su/catlean/ue", var14);
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
throw new RuntimeException("su/catlean/ue" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
