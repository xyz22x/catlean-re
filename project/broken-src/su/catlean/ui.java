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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.TridentUseEvent;
import su.catlean.api.event.events.player.TridentWeatherEvent;
import su.catlean.gofra.Flow;

public final class ui extends _g {
@NotNull
public static final ui a;
static final KProperty[] X;
@NotNull
private static final cw B;
@NotNull
private static final ct W;
@NotNull
private static final c8 t;
@NotNull
private static final cq e;
private static final long b = yz.a(3093449907022646038L, -9088610704999788548L, MethodHandles.lookup().lookupClass()).a(113229408984033L);
private static final String[] c;
private static final String[] d;
private static final Map f = new HashMap(13);
private static final long[] g;
private static final Integer[] h;
private static final Map i;

private ui(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 128629757119612L;
super(b<"u">(27833, 8337088721007422162L ^ var1), jt.V(), null, 4, null, var3);
}

private final rz C(byte var1, long var2) {
long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
long var6 = var4 ^ 90152265652547L;
return (rz)B.E(this, var6, X[0]);
}

private final float h(long var1, short var3) {
long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 90234995709200L;
return ((Number)W.E(this, var6, X[1])).floatValue();
}

public final int g(long var1) {
var1 = b ^ var1;
long var3 = var1 ^ 139005344246258L;
String[] var5 = vm.a<"Å">(-6608847664900748613L, var1);

try {
int var10000 = ((Number)t.E(this, var3, X[2])).intValue();
if (vm.a<"Å">(-6582100914003461578L, var1) != null) {
vm.a<"Å">(new String[5], -6566974522739928237L, var1);
}

return var10000;
} catch (NumberFormatException var6) {
throw vm.a<"Å">(var6, -6605331509025828157L, var1);
}
}

private final boolean R(int var1, short var2, char var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
long var6 = var4 ^ 7490760735626L;
return (Boolean)e.E(this, var6, X[3]);
}

@Flow
public final void w(@NotNull TridentUseEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/ui.b J
// 003: ldc2_w 42425206370043
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 61209331776444
// 00d: lxor
// 00e: dup2
// 00f: bipush 56
// 011: lushr
// 012: l2i
// 013: istore 4
// 015: dup2
// 016: bipush 8
// 018: lshl
// 019: bipush 8
// 01b: lushr
// 01c: lstore 5
// 01e: pop2
// 01f: dup2
// 020: ldc2_w 26637011077901
// 023: lxor
// 024: lstore 7
// 026: dup2
// 027: ldc2_w 5534257203691
// 02a: lxor
// 02b: lstore 9
// 02d: dup2
// 02e: ldc2_w 57467289647087
// 031: lxor
// 032: dup2
// 033: bipush 16
// 035: lushr
// 036: lstore 11
// 038: dup2
// 039: bipush 48
// 03b: lshl
// 03c: bipush 48
// 03e: lushr
// 03f: l2i
// 040: istore 13
// 042: pop2
// 043: dup2
// 044: ldc2_w 7831961106252
// 047: lxor
// 048: lstore 14
// 04a: dup2
// 04b: ldc2_w 106125582063989
// 04e: lxor
// 04f: dup2
// 050: bipush 32
// 052: lushr
// 053: l2i
// 054: istore 16
// 056: dup2
// 057: bipush 32
// 059: lshl
// 05a: bipush 48
// 05c: lushr
// 05d: l2i
// 05e: istore 17
// 060: dup2
// 061: bipush 48
// 063: lshl
// 064: bipush 48
// 066: lushr
// 067: l2i
// 068: istore 18
// 06a: pop2
// 06b: pop2
// 06c: ldc2_w -6512859443133625490
// 06f: lload 2
// 070: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 075: aload 1
// 076: ldc "e"
// 078: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 07b: astore 19
// 07d: aload 19
// 07f: ifnull 2b4
// 082: lload 14
// 084: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 087: invokevirtual net/minecraft/class_746.method_6048 ()I
// 08a: aload 0
// 08b: lload 7
// 08d: invokevirtual su/catlean/ui.g (J)I
// 090: if_icmplt 2b0
// 093: goto 0a0
// 096: ldc2_w -6521175724324220138
// 099: lload 2
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: lload 14
// 0a2: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0a5: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 0a8: lload 14
// 0aa: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0ad: checkcast net/minecraft/class_1309
// 0b0: invokestatic net/minecraft/class_1890.method_60123 (Lnet/minecraft/class_1799;Lnet/minecraft/class_1309;)F
// 0b3: fstore 20
// 0b5: aload 0
// 0b6: iload 16
// 0b8: iload 17
// 0ba: i2s
// 0bb: iload 18
// 0bd: i2c
// 0be: invokespecial su/catlean/ui.R (ISC)Z
// 0c1: aload 19
// 0c3: ifnull 123
// 0c6: ifne 100
// 0c9: goto 0d6
// 0cc: ldc2_w -6521175724324220138
// 0cf: lload 2
// 0d0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d5: athrow
// 0d6: lload 14
// 0d8: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0db: invokevirtual net/minecraft/class_746.method_5721 ()Z
// 0de: aload 19
// 0e0: ifnull 123
// 0e3: goto 0f0
// 0e6: ldc2_w -6521175724324220138
// 0e9: lload 2
// 0ea: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ef: athrow
// 0f0: ifeq 2b0
// 0f3: goto 100
// 0f6: ldc2_w -6521175724324220138
// 0f9: lload 2
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: fload 20
// 102: aload 19
// 104: ifnull 13b
// 107: goto 114
// 10a: ldc2_w -6521175724324220138
// 10d: lload 2
// 10e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: athrow
// 114: fconst_0
// 115: fcmpl
// 116: goto 123
// 119: ldc2_w -6521175724324220138
// 11c: lload 2
// 11d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 122: athrow
// 123: ifle 2b0
// 126: lload 14
// 128: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 12b: invokevirtual net/minecraft/class_746.method_36454 ()F
// 12e: goto 13b
// 131: ldc2_w -6521175724324220138
// 134: lload 2
// 135: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13a: athrow
// 13b: fstore 21
// 13d: lload 14
// 13f: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 142: invokevirtual net/minecraft/class_746.method_36455 ()F
// 145: fstore 22
// 147: fload 21
// 149: ldc 0.017453292
// 14b: fmul
// 14c: f2d
// 14d: invokestatic java/lang/Math.sin (D)D
// 150: d2f
// 151: fneg
// 152: fload 22
// 154: ldc 0.017453292
// 156: fmul
// 157: f2d
// 158: invokestatic java/lang/Math.cos (D)D
// 15b: d2f
// 15c: fmul
// 15d: fstore 23
// 15f: fload 22
// 161: ldc 0.017453292
// 163: fmul
// 164: f2d
// 165: invokestatic java/lang/Math.sin (D)D
// 168: d2f
// 169: fneg
// 16a: fstore 24
// 16c: fload 21
// 16e: ldc 0.017453292
// 170: fmul
// 171: f2d
// 172: invokestatic java/lang/Math.cos (D)D
// 175: d2f
// 176: fload 22
// 178: ldc 0.017453292
// 17a: fmul
// 17b: f2d
// 17c: invokestatic java/lang/Math.cos (D)D
// 17f: d2f
// 180: fmul
// 181: fstore 25
// 183: fload 23
// 185: fload 23
// 187: fmul
// 188: fload 24
// 18a: fload 24
// 18c: fmul
// 18d: fadd
// 18e: fload 25
// 190: fload 25
// 192: fmul
// 193: fadd
// 194: f2d
// 195: invokestatic java/lang/Math.sqrt (D)D
// 198: d2f
// 199: fstore 26
// 19b: aload 0
// 19c: aload 19
// 19e: ifnull 1de
// 1a1: iload 4
// 1a3: i2b
// 1a4: lload 5
// 1a6: invokespecial su/catlean/ui.C (BJ)Lsu/catlean/rz;
// 1a9: getstatic su/catlean/rz.Factor Lsu/catlean/rz;
// 1ac: if_acmpne 1dd
// 1af: goto 1bc
// 1b2: ldc2_w -6521175724324220138
// 1b5: lload 2
// 1b6: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bb: athrow
// 1bc: aload 0
// 1bd: lload 11
// 1bf: iload 13
// 1c1: i2s
// 1c2: invokespecial su/catlean/ui.h (JS)F
// 1c5: ldc 3.0
// 1c7: fmul
// 1c8: fconst_1
// 1c9: fload 20
// 1cb: fadd
// 1cc: ldc 4.0
// 1ce: fdiv
// 1cf: fmul
// 1d0: goto 1e6
// 1d3: ldc2_w -6521175724324220138
// 1d6: lload 2
// 1d7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dc: athrow
// 1dd: aload 0
// 1de: lload 11
// 1e0: iload 13
// 1e2: i2s
// 1e3: invokespecial su/catlean/ui.h (JS)F
// 1e6: fstore 27
// 1e8: fload 23
// 1ea: fload 27
// 1ec: fload 26
// 1ee: fdiv
// 1ef: fmul
// 1f0: fstore 23
// 1f2: fload 24
// 1f4: fload 27
// 1f6: fload 26
// 1f8: fdiv
// 1f9: fmul
// 1fa: fstore 24
// 1fc: fload 25
// 1fe: fload 27
// 200: fload 26
// 202: fdiv
// 203: fmul
// 204: fstore 25
// 206: lload 14
// 208: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 20b: fload 23
// 20d: f2d
// 20e: fload 24
// 210: f2d
// 211: fload 25
// 213: f2d
// 214: invokevirtual net/minecraft/class_746.method_5762 (DDD)V
// 217: lload 14
// 219: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 21c: sipush 11743
// 21f: ldc2_w 5827960929349229928
// 222: lload 2
// 223: lxor
// 224: invokedynamic l (IJ)I bsm=su/catlean/ui.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 229: ldc 8.0
// 22b: lload 14
// 22d: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 230: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 233: invokevirtual net/minecraft/class_746.method_40126 (IFLnet/minecraft/class_1799;)V
// 236: lload 14
// 238: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 23b: aload 19
// 23d: ifnull 28b
// 240: invokevirtual net/minecraft/class_746.method_24828 ()Z
// 243: ifeq 277
// 246: goto 253
// 249: ldc2_w -6521175724324220138
// 24c: lload 2
// 24d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 252: athrow
// 253: lload 14
// 255: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 258: getstatic net/minecraft/class_1313.field_6308 Lnet/minecraft/class_1313;
// 25b: new net/minecraft/class_243
// 25e: dup
// 25f: dconst_0
// 260: ldc2_w 1.1999999284744263
// 263: dconst_0
// 264: invokespecial net/minecraft/class_243.<init> (DDD)V
// 267: invokevirtual net/minecraft/class_746.method_5784 (Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V
// 26a: goto 277
// 26d: ldc2_w -6521175724324220138
// 270: lload 2
// 271: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 276: athrow
// 277: lload 14
// 279: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 27c: invokevirtual net/minecraft/class_746.method_6030 ()Lnet/minecraft/class_1799;
// 27f: getstatic net/minecraft/class_9701.field_51654 Lnet/minecraft/class_9331;
// 282: invokestatic net/minecraft/class_1890.method_60165 (Lnet/minecraft/class_1799;Lnet/minecraft/class_9331;)Ljava/util/Optional;
// 285: getstatic net/minecraft/class_3417.field_15001 Lnet/minecraft/class_6880;
// 288: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
// 28b: checkcast net/minecraft/class_6880
// 28e: astore 28
// 290: lload 9
// 292: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 295: aconst_null
// 296: lload 14
// 298: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 29b: checkcast net/minecraft/class_1297
// 29e: aload 28
// 2a0: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
// 2a5: checkcast net/minecraft/class_3414
// 2a8: getstatic net/minecraft/class_3419.field_15248 Lnet/minecraft/class_3419;
// 2ab: fconst_1
// 2ac: fconst_1
// 2ad: invokevirtual net/minecraft/class_638.method_43129 (Lnet/minecraft/class_1297;Lnet/minecraft/class_1297;Lnet/minecraft/class_3414;Lnet/minecraft/class_3419;FF)V
// 2b0: aload 1
// 2b1: invokevirtual su/catlean/api/event/events/player/TridentUseEvent.cancel ()V
// 2b4: aload 19
// 2b6: ifnonnull 2d3
// 2b9: bipush 5
// 2ba: anewarray 292
// 2bd: ldc2_w -6555960762070618311
// 2c0: lload 2
// 2c1: invokedynamic Å (Ljava/lang/Object;JJ)V bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c6: goto 2d3
// 2c9: ldc2_w -6521175724324220138
// 2cc: lload 2
// 2cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d2: athrow
// 2d3: return
}

@Flow
public final void C(@NotNull TridentWeatherEvent e) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 00: getstatic su/catlean/ui.b J
// 03: ldc2_w 55761665278184
// 06: lxor
// 07: lstore 2
// 08: lload 2
// 09: dup2
// 0a: ldc2_w 128263502722918
// 0d: lxor
// 0e: dup2
// 0f: bipush 32
// 11: lushr
// 12: l2i
// 13: istore 4
// 15: dup2
// 16: bipush 32
// 18: lshl
// 19: bipush 48
// 1b: lushr
// 1c: l2i
// 1d: istore 5
// 1f: dup2
// 20: bipush 48
// 22: lshl
// 23: bipush 48
// 25: lushr
// 26: l2i
// 27: istore 6
// 29: pop2
// 2a: pop2
// 2b: ldc2_w 832806344437425533
// 2e: lload 2
// 2f: invokedynamic Å (JJ)[Ljava/lang/String; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 34: astore 7
// 36: aload 1
// 37: aload 7
// 39: ifnull 6b
// 3c: ldc "e"
// 3e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
// 41: aload 0
// 42: iload 4
// 44: iload 5
// 46: i2s
// 47: iload 6
// 49: i2c
// 4a: invokespecial su/catlean/ui.R (ISC)Z
// 4d: ifeq 6e
// 50: goto 5d
// 53: ldc2_w 834068734747065605
// 56: lload 2
// 57: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 5c: athrow
// 5d: aload 1
// 5e: goto 6b
// 61: ldc2_w 834068734747065605
// 64: lload 2
// 65: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 6a: athrow
// 6b: invokevirtual su/catlean/api/event/events/player/TridentWeatherEvent.cancel ()V
// 6e: return
}

static {
long var20 = b ^ 40565088808450L;
long var22 = var20 ^ 56038410644550L;
long var24 = var20 ^ 49870999449454L;
long var26 = var20 ^ 3284846535176L;
long var28 = var20 ^ 124439370805927L;
long var30 = var20 ^ 74223185909948L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[13];
int var16 = 0;
String var15 = "\\¯ç(ß\u0093\u000b\u001b\u007f\u0015\u008fó·».I \u0083àäI\u0098±h£¨\u00adìHißË\u0086³Õ\u0085µ^\u007f2ë¥®\u000eÖÇPn\u0088(°\u0090¹\u0089\u009c°Àâ\u001f\u0014¿\u0097ùSi J\u000fÎ\u001eÆîA\u008cÅ*bH\u009f©QA\u009ei87o=^?\u0010\u0082FQËvÁ2Ò±àZÁ-%Þ\u0018 ³b\\ò\u0085É{\u0089\u0017§\u00ad3®ÍíÆÍ\u009føÕó<©ø(\u009b(¸\u008e®Ó.\u0010\u0093Z\u009d\u009bwçç¨ÉÌ×à%@\u0006D(¤Î~BOj\u008fQÕÙEW®\b¤uà\n¨8Â\u008f:µ3·\u0019¥\u0093\u0013RI(Ú.êÊù\u008b\u0093 Æ-vÛl\\>\u00824ÝÌ\u0003|(sÿ×ñ\u0004î\u009b_\u008f\u0080\u009fBç/ê2#^\u0018ÿâhå¡\u0000\u0097\u007f\u0086v\"[èSu\u008f\u001f\u0092e\u0083K\tî%\u0010Û\u0016Ï¢\u008bÁd\u001e_\u008b'jÃ¤Ðj ù<bs#énº\u00898¨@\u0095ËÚÇX\u0099ÐÚ\túï[\u00185D\u0088Ñ®Þ\u0007";
int var17 = "\\¯ç(ß\u0093\u000b\u001b\u007f\u0015\u008fó·».I \u0083àäI\u0098±h£¨\u00adìHißË\u0086³Õ\u0085µ^\u007f2ë¥®\u000eÖÇPn\u0088(°\u0090¹\u0089\u009c°Àâ\u001f\u0014¿\u0097ùSi J\u000fÎ\u001eÆîA\u008cÅ*bH\u009f©QA\u009ei87o=^?\u0010\u0082FQËvÁ2Ò±àZÁ-%Þ\u0018 ³b\\ò\u0085É{\u0089\u0017§\u00ad3®ÍíÆÍ\u009føÕó<©ø(\u009b(¸\u008e®Ó.\u0010\u0093Z\u009d\u009bwçç¨ÉÌ×à%@\u0006D(¤Î~BOj\u008fQÕÙEW®\b¤uà\n¨8Â\u008f:µ3·\u0019¥\u0093\u0013RI(Ú.êÊù\u008b\u0093 Æ-vÛl\\>\u00824ÝÌ\u0003|(sÿ×ñ\u0004î\u009b_\u008f\u0080\u009fBç/ê2#^\u0018ÿâhå¡\u0000\u0097\u007f\u0086v\"[èSu\u008f\u001f\u0092e\u0083K\tî%\u0010Û\u0016Ï¢\u008bÁd\u001e_\u008b'jÃ¤Ðj ù<bs#énº\u00898¨@\u0095ËÚÇX\u0099ÐÚ\túï[\u00185D\u0088Ñ®Þ\u0007"
.length();
char var14 = 16;
int var35 = -1;

label54:
while (true) {
String var36 = var15.substring(++var35, var35 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
String var47 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var47;
if ((var35 += var14) >= var17) {
c = var18;
d = new String[13];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[7];
int var3 = 0;
String var4 = "\u0015\n´'÷øADÄ¹ø\b÷áIîýÀ}\u0090¸ö\u009a\tÃ\u0081È\u0014JØ\u0090JÆøöl\u0004©ø\u0085";
int var5 = "\u0015\n´'÷øADÄ¹ø\b÷áIîýÀ}\u0090¸ö\u009a\tÃ\u0081È\u0014JØ\u0090JÆøöl\u0004©ø\u0085".length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var39 = var6;
var10001 = var3++;
long var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var54 = -1;

while (true) {
long var8 = var51;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var56 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var54) {
case 0:
var39[var10001] = var56;
if (var2 >= var5) {
g = var6;
h = new Integer[7];
KProperty[] var32 = new KProperty[]{
Reflection.property1(new PropertyReference1Impl(ui.class, b<"u">(10335, 203893735043831370L ^ var20), b<"u">(15702, 7121272641462469446L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ui.class, b<"u">(26199, 3713472897726961742L ^ var20), b<"u">(3801, 7500651478409851087L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ui.class, b<"u">(11277, 6086170967760376341L ^ var20), b<"u">(10491, 5607906103471314661L ^ var20), 0)),
Reflection.property1(new PropertyReference1Impl(ui.class, b<"u">(24871, 3513396340816273210L ^ var20), b<"u">(29968, 4691308156982938378L ^ var20), 0))
};
X = var32;
a = new ui(var28);
B = yp.L(a, b<"u">(9230, 6672538218987526674L ^ var20), rz.Motion, null, null, c<"l">(2414, 1542868943654320422L ^ var20), null, var30);
W = yp.k(
a, b<"u">(3366, 6005235143484322609L ^ var20), 1.0F, var22, RangesKt.rangeTo(0.1F, 20.0F), null, null, c<"l">(15832, 7470328804150529431L ^ var20), null
);
t = yp.L(
a,
b<"u">(16818, 4687573965026361261L ^ var20),
c<"l">(22646, 5261944837487241274L ^ var20),
new IntRange(0, c<"l">(17639, 2606805417829610668L ^ var20)),
var24,
null,
null,
c<"l">(32710, 8105567713484312460L ^ var20),
null
);
e = yp.t(a, b<"u">(12776, 4953439523525464051L ^ var20), true, var26, null, null, c<"l">(7933, 8157164187967123120L ^ var20), null);
return;
}
break;
default:
var39[var10001] = var56;
if (var2 < var5) {
continue label36;
}

var4 = "§\u008c·'Àà4wÌp\u0019\u0084F=#\u009b";
var5 = "§\u008c·'Àà4wÌp\u0019\u0084F=#\u009b".length();
var2 = 0;
}

byte var45 = var2;
var2 += 8;
var7 = var4.substring(var45, var2).getBytes("ISO-8859-1");
var39 = var6;
var10001 = var3++;
var51 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var54 = 0;
}
}
}

var14 = var15.charAt(var35);
break;
default:
var18[var16++] = var47;
if ((var35 += var14) < var17) {
var14 = var15.charAt(var35);
continue label54;
}

var15 = "i\u009eõÛ\nTö\u007f\u00117éTÙ¥¶\u00950\r\u001dÏS4Æ\u0091ñNLÕ\u0016Ü»è:\u001eÜÆRÏ\u0088\u0096üÆ\u008aG\u0001\u0084n³þ'ã¸/\u0097h\u0005z\u009d\u000eê³}\u0016³V";
var17 = "i\u009eõÛ\nTö\u007f\u00117éTÙ¥¶\u00950\r\u001dÏS4Æ\u0091ñNLÕ\u0016Ü»è:\u001eÜÆRÏ\u0088\u0096üÆ\u008aG\u0001\u0084n³þ'ã¸/\u0097h\u0005z\u009d\u000eê³}\u0016³V"
.length();
var14 = 16;
var35 = -1;
}

var36 = var15.substring(++var35, var35 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 6854;
if (d[var5] == null) {
Object[] var4;
try {
Long var3 = Thread.currentThread().threadId();
var4 = (Object[])f.get(var3);
if (var4 == null) {
var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
f.put(var3, var4);
}
} catch (Exception var10) {
throw new RuntimeException("su/catlean/ui", var10);
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
throw new RuntimeException("su/catlean/ui" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 21652;
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
throw new RuntimeException("su/catlean/ui", var14);
}

int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
h[var3] = var15;
}

return h[var3];
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
throw new RuntimeException("su/catlean/ui" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
