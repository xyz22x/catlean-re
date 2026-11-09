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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PickUpBlockEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class q5 extends _g {
@NotNull
public static final q5 E;
static final KProperty[] I;
@NotNull
private static final cw t;
@NotNull
private static final cw u;
@NotNull
private static final cw T;
@NotNull
private static final cw e;
@NotNull
private static final cq A;
@NotNull
private static final cq n;
@NotNull
private static final c8 D;
@NotNull
private static final cq h;
@NotNull
private static final c8 x;
@NotNull
private static final c8 X;
@NotNull
private static final cq L;
@NotNull
private static final bg y;
private static boolean m;
private static final long a = yz.a(8412661908427240085L, -2868034301487351901L, MethodHandles.lookup().lookupClass()).a(117956561957485L);
private static final String[] b;
private static final String[] c;
private static final Map d = new HashMap(13);
private static final long[] f;
private static final Integer[] g;
private static final Map i;

private q5(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 140194822796256L;
super(b<"w">(18609, 7500834119848917323L ^ var1), jt.I(), null, 4, null, var3);
}

private final cn Z(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 92489806743778L;
return (cn)t.E(this, var3, I[0]);
}

private final cn T(char var1, int var2, int var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 36884205984542L;
return (cn)u.E(this, var6, I[1]);
}

private final cn h(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 23278140337689L;
return (cn)T.E(this, var3, I[2]);
}

private final cn F(char var1, int var2, short var3) {
long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 126552581300395L;
return (cn)e.E(this, var6, I[3]);
}

private final boolean Y(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 11024764736680L;
return (Boolean)A.E(this, var3, I[4]);
}

private final boolean g(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 51111244451755L;
return (Boolean)n.E(this, var3, I[5]);
}

private final int W(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 11909169046238L;
return ((Number)D.E(this, var3, I[c<"z">(12864, 4676473913994198534L ^ var1)])).intValue();
}

private final boolean R(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 20645366138309L;
return (Boolean)h.E(this, var3, I[c<"z">(27011, 1347594792492827357L ^ var1)]);
}

private final int P(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 123550444825811L;
return ((Number)x.E(this, var3, I[c<"z">(23890, 826416542180056833L ^ var1)])).intValue();
}

private final int V(long var1) {
var1 = a ^ var1;
long var3 = var1 ^ 105063590227185L;
return ((Number)X.E(this, var3, I[c<"z">(16591, 2765909831037698746L ^ var1)])).intValue();
}

private final boolean q(int var1, char var2, short var3) {
long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
long var6 = var4 ^ 139139351049453L;
return (Boolean)L.E(this, var6, I[c<"z">(961, 2207244934225107376L ^ var4)]);
}

@Flow
private final void Z(PickUpBlockEvent var1) {
var1.cancel();
}

@Flow(
priority = -10
)
private final void K(PlayerUpdateEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q5.a J
// 003: ldc2_w 28789511944170
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 72283282024948
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 16431946642188
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 135671301464304
// 01b: lxor
// 01c: dup2
// 01d: bipush 48
// 01f: lushr
// 020: l2i
// 021: istore 8
// 023: dup2
// 024: bipush 16
// 026: lshl
// 027: bipush 32
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
// 039: ldc2_w 87705229530615
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 108917229230453
// 043: lxor
// 044: lstore 13
// 046: dup2
// 047: ldc2_w 106756964296658
// 04a: lxor
// 04b: lstore 15
// 04d: dup2
// 04e: ldc2_w 46140764674885
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
// 06e: pop2
// 06f: ldc2_w -726965226503827435
// 072: lload 2
// 073: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 078: istore 20
// 07a: lload 4
// 07c: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 07f: iload 20
// 081: ifne 0a9
// 084: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 087: ifnonnull 3c5
// 08a: goto 097
// 08d: ldc2_w -782686018223436167
// 090: lload 2
// 091: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 096: athrow
// 097: lload 4
// 099: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 09c: goto 0a9
// 09f: ldc2_w -782686018223436167
// 0a2: lload 2
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 0ac: astore 21
// 0ae: lload 4
// 0b0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b3: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0b6: getfield net/minecraft/class_315.field_1871 Lnet/minecraft/class_304;
// 0b9: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0bc: iload 20
// 0be: ifne 24b
// 0c1: ifeq 23b
// 0c4: goto 0d1
// 0c7: ldc2_w -782686018223436167
// 0ca: lload 2
// 0cb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d0: athrow
// 0d1: bipush 1
// 0d2: putstatic su/catlean/q5.m Z
// 0d5: lload 15
// 0d7: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0da: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 0dd: iload 20
// 0df: ifne 138
// 0e2: goto 0ef
// 0e5: ldc2_w -782686018223436167
// 0e8: lload 2
// 0e9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ee: athrow
// 0ef: ifeq 126
// 0f2: goto 0ff
// 0f5: ldc2_w -782686018223436167
// 0f8: lload 2
// 0f9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fe: athrow
// 0ff: aload 0
// 100: iload 17
// 102: i2c
// 103: iload 18
// 105: iload 19
// 107: i2s
// 108: invokespecial su/catlean/q5.F (CIS)Lsu/catlean/cn;
// 10b: invokevirtual su/catlean/cn.b ()Lkotlin/jvm/functions/Function0;
// 10e: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 113: pop
// 114: iload 20
// 116: ifeq 3c5
// 119: goto 126
// 11c: ldc2_w -782686018223436167
// 11f: lload 2
// 120: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 125: athrow
// 126: aload 21
// 128: instanceof net/minecraft/class_3966
// 12b: goto 138
// 12e: ldc2_w -782686018223436167
// 131: lload 2
// 132: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 137: athrow
// 138: iload 20
// 13a: ifne 1bf
// 13d: ifeq 19b
// 140: goto 14d
// 143: ldc2_w -782686018223436167
// 146: lload 2
// 147: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14c: athrow
// 14d: aload 21
// 14f: checkcast net/minecraft/class_3966
// 152: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 155: instanceof net/minecraft/class_1657
// 158: iload 20
// 15a: ifne 1bf
// 15d: goto 16a
// 160: ldc2_w -782686018223436167
// 163: lload 2
// 164: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 169: athrow
// 16a: ifeq 19b
// 16d: goto 17a
// 170: ldc2_w -782686018223436167
// 173: lload 2
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: aload 0
// 17b: lload 11
// 17d: invokespecial su/catlean/q5.h (J)Lsu/catlean/cn;
// 180: invokevirtual su/catlean/cn.b ()Lkotlin/jvm/functions/Function0;
// 183: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 188: pop
// 189: iload 20
// 18b: ifeq 3c5
// 18e: goto 19b
// 191: ldc2_w -782686018223436167
// 194: lload 2
// 195: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: athrow
// 19b: aload 21
// 19d: iload 20
// 19f: ifne 235
// 1a2: goto 1af
// 1a5: ldc2_w -782686018223436167
// 1a8: lload 2
// 1a9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ae: athrow
// 1af: instanceof net/minecraft/class_3965
// 1b2: goto 1bf
// 1b5: ldc2_w -782686018223436167
// 1b8: lload 2
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: ifeq 215
// 1c2: lload 13
// 1c4: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 1c7: iload 20
// 1c9: ifne 235
// 1cc: goto 1d9
// 1cf: ldc2_w -782686018223436167
// 1d2: lload 2
// 1d3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d8: athrow
// 1d9: aload 21
// 1db: checkcast net/minecraft/class_3965
// 1de: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 1e1: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 1e4: ifne 215
// 1e7: goto 1f4
// 1ea: ldc2_w -782686018223436167
// 1ed: lload 2
// 1ee: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1f3: athrow
// 1f4: aload 0
// 1f5: lload 6
// 1f7: invokespecial su/catlean/q5.Z (J)Lsu/catlean/cn;
// 1fa: invokevirtual su/catlean/cn.b ()Lkotlin/jvm/functions/Function0;
// 1fd: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 202: pop
// 203: iload 20
// 205: ifeq 3c5
// 208: goto 215
// 20b: ldc2_w -782686018223436167
// 20e: lload 2
// 20f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 214: athrow
// 215: aload 0
// 216: iload 8
// 218: i2c
// 219: iload 9
// 21b: iload 10
// 21d: invokespecial su/catlean/q5.T (CII)Lsu/catlean/cn;
// 220: invokevirtual su/catlean/cn.b ()Lkotlin/jvm/functions/Function0;
// 223: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 228: goto 235
// 22b: ldc2_w -782686018223436167
// 22e: lload 2
// 22f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 234: athrow
// 235: pop
// 236: iload 20
// 238: ifeq 3c5
// 23b: getstatic su/catlean/q5.m Z
// 23e: goto 24b
// 241: ldc2_w -782686018223436167
// 244: lload 2
// 245: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 24a: athrow
// 24b: iload 20
// 24d: ifne 275
// 250: ifeq 3c5
// 253: goto 260
// 256: ldc2_w -782686018223436167
// 259: lload 2
// 25a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 25f: athrow
// 260: lload 15
// 262: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 265: invokevirtual net/minecraft/class_746.method_6128 ()Z
// 268: goto 275
// 26b: ldc2_w -782686018223436167
// 26e: lload 2
// 26f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 274: athrow
// 275: iload 20
// 277: ifne 2c3
// 27a: ifeq 2b1
// 27d: goto 28a
// 280: ldc2_w -782686018223436167
// 283: lload 2
// 284: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 289: athrow
// 28a: aload 0
// 28b: iload 17
// 28d: i2c
// 28e: iload 18
// 290: iload 19
// 292: i2s
// 293: invokespecial su/catlean/q5.F (CIS)Lsu/catlean/cn;
// 296: invokevirtual su/catlean/cn.I ()Lkotlin/jvm/functions/Function0;
// 299: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 29e: pop
// 29f: iload 20
// 2a1: ifeq 3c1
// 2a4: goto 2b1
// 2a7: ldc2_w -782686018223436167
// 2aa: lload 2
// 2ab: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2b0: athrow
// 2b1: aload 21
// 2b3: instanceof net/minecraft/class_3966
// 2b6: goto 2c3
// 2b9: ldc2_w -782686018223436167
// 2bc: lload 2
// 2bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2c2: athrow
// 2c3: iload 20
// 2c5: ifne 34a
// 2c8: ifeq 326
// 2cb: goto 2d8
// 2ce: ldc2_w -782686018223436167
// 2d1: lload 2
// 2d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2d7: athrow
// 2d8: aload 21
// 2da: checkcast net/minecraft/class_3966
// 2dd: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 2e0: instanceof net/minecraft/class_1657
// 2e3: iload 20
// 2e5: ifne 34a
// 2e8: goto 2f5
// 2eb: ldc2_w -782686018223436167
// 2ee: lload 2
// 2ef: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2f4: athrow
// 2f5: ifeq 326
// 2f8: goto 305
// 2fb: ldc2_w -782686018223436167
// 2fe: lload 2
// 2ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 304: athrow
// 305: aload 0
// 306: lload 11
// 308: invokespecial su/catlean/q5.h (J)Lsu/catlean/cn;
// 30b: invokevirtual su/catlean/cn.I ()Lkotlin/jvm/functions/Function0;
// 30e: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 313: pop
// 314: iload 20
// 316: ifeq 3c1
// 319: goto 326
// 31c: ldc2_w -782686018223436167
// 31f: lload 2
// 320: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 325: athrow
// 326: aload 21
// 328: iload 20
// 32a: ifne 3c0
// 32d: goto 33a
// 330: ldc2_w -782686018223436167
// 333: lload 2
// 334: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 339: athrow
// 33a: instanceof net/minecraft/class_3965
// 33d: goto 34a
// 340: ldc2_w -782686018223436167
// 343: lload 2
// 344: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 349: athrow
// 34a: ifeq 3a0
// 34d: lload 13
// 34f: invokestatic su/catlean/zf.z (J)Lnet/minecraft/class_638;
// 352: iload 20
// 354: ifne 3c0
// 357: goto 364
// 35a: ldc2_w -782686018223436167
// 35d: lload 2
// 35e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 363: athrow
// 364: aload 21
// 366: checkcast net/minecraft/class_3965
// 369: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
// 36c: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
// 36f: ifne 3a0
// 372: goto 37f
// 375: ldc2_w -782686018223436167
// 378: lload 2
// 379: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 37e: athrow
// 37f: aload 0
// 380: lload 6
// 382: invokespecial su/catlean/q5.Z (J)Lsu/catlean/cn;
// 385: invokevirtual su/catlean/cn.I ()Lkotlin/jvm/functions/Function0;
// 388: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 38d: pop
// 38e: iload 20
// 390: ifeq 3c1
// 393: goto 3a0
// 396: ldc2_w -782686018223436167
// 399: lload 2
// 39a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 39f: athrow
// 3a0: aload 0
// 3a1: iload 8
// 3a3: i2c
// 3a4: iload 9
// 3a6: iload 10
// 3a8: invokespecial su/catlean/q5.T (CII)Lsu/catlean/cn;
// 3ab: invokevirtual su/catlean/cn.I ()Lkotlin/jvm/functions/Function0;
// 3ae: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
// 3b3: goto 3c0
// 3b6: ldc2_w -782686018223436167
// 3b9: lload 2
// 3ba: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 3bf: athrow
// 3c0: pop
// 3c1: bipush 0
// 3c2: putstatic su/catlean/q5.m Z
// 3c5: return
}

@Flow
private final void O(Render3DEvent param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q5.a J
// 003: ldc2_w 115368644963165
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 56622917432643
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 136560967135163
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 95271005180852
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
// 039: ldc2_w 123583595171183
// 03c: lxor
// 03d: lstore 11
// 03f: dup2
// 040: ldc2_w 10609106287687
// 043: lxor
// 044: dup2
// 045: bipush 48
// 047: lushr
// 048: l2i
// 049: istore 13
// 04b: dup2
// 04c: bipush 16
// 04e: lshl
// 04f: bipush 32
// 051: lushr
// 052: l2i
// 053: istore 14
// 055: dup2
// 056: bipush 48
// 058: lshl
// 059: bipush 48
// 05b: lushr
// 05c: l2i
// 05d: istore 15
// 05f: pop2
// 060: dup2
// 061: ldc2_w 82349923488015
// 064: lxor
// 065: dup2
// 066: bipush 48
// 068: lushr
// 069: l2i
// 06a: istore 16
// 06c: dup2
// 06d: bipush 16
// 06f: lshl
// 070: bipush 16
// 072: lushr
// 073: lstore 17
// 075: pop2
// 076: dup2
// 077: ldc2_w 67096930486592
// 07a: lxor
// 07b: lstore 19
// 07d: dup2
// 07e: ldc2_w 100281922308082
// 081: lxor
// 082: dup2
// 083: bipush 48
// 085: lushr
// 086: l2i
// 087: istore 21
// 089: dup2
// 08a: bipush 16
// 08c: lshl
// 08d: bipush 32
// 08f: lushr
// 090: l2i
// 091: istore 22
// 093: dup2
// 094: bipush 48
// 096: lshl
// 097: bipush 48
// 099: lushr
// 09a: l2i
// 09b: istore 23
// 09d: pop2
// 09e: dup2
// 09f: ldc2_w 21827113401189
// 0a2: lxor
// 0a3: lstore 24
// 0a5: pop2
// 0a6: ldc2_w -1630797604124783454
// 0a9: lload 2
// 0aa: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: istore 26
// 0b1: lload 4
// 0b3: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b6: iload 26
// 0b8: ifne 0e0
// 0bb: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
// 0be: ifnonnull 234
// 0c1: goto 0ce
// 0c4: ldc2_w -1615624632816594226
// 0c7: lload 2
// 0c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0cd: athrow
// 0ce: lload 4
// 0d0: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0d3: goto 0e0
// 0d6: ldc2_w -1615624632816594226
// 0d9: lload 2
// 0da: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0df: athrow
// 0e0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
// 0e3: getfield net/minecraft/class_315.field_1871 Lnet/minecraft/class_304;
// 0e6: invokevirtual net/minecraft/class_304.method_1434 ()Z
// 0e9: iload 26
// 0eb: ifne 129
// 0ee: ifeq 234
// 0f1: goto 0fe
// 0f4: ldc2_w -1615624632816594226
// 0f7: lload 2
// 0f8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fd: athrow
// 0fe: aload 0
// 0ff: iload 26
// 101: ifne 12d
// 104: goto 111
// 107: ldc2_w -1615624632816594226
// 10a: lload 2
// 10b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 110: athrow
// 111: iload 8
// 113: iload 9
// 115: i2c
// 116: iload 10
// 118: i2s
// 119: invokespecial su/catlean/q5.q (ICS)Z
// 11c: goto 129
// 11f: ldc2_w -1615624632816594226
// 122: lload 2
// 123: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 128: athrow
// 129: ifeq 234
// 12c: aload 0
// 12d: lload 6
// 12f: invokespecial su/catlean/q5.Z (J)Lsu/catlean/cn;
// 132: getstatic su/catlean/cn.PEARL Lsu/catlean/cn;
// 135: iload 26
// 137: ifne 165
// 13a: if_acmpeq 1c4
// 13d: goto 14a
// 140: ldc2_w -1615624632816594226
// 143: lload 2
// 144: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 149: athrow
// 14a: aload 0
// 14b: iload 13
// 14d: i2c
// 14e: iload 14
// 150: iload 15
// 152: invokespecial su/catlean/q5.T (CII)Lsu/catlean/cn;
// 155: getstatic su/catlean/cn.PEARL Lsu/catlean/cn;
// 158: goto 165
// 15b: ldc2_w -1615624632816594226
// 15e: lload 2
// 15f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 164: athrow
// 165: iload 26
// 167: ifne 190
// 16a: if_acmpeq 1c4
// 16d: goto 17a
// 170: ldc2_w -1615624632816594226
// 173: lload 2
// 174: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 179: athrow
// 17a: aload 0
// 17b: lload 19
// 17d: invokespecial su/catlean/q5.h (J)Lsu/catlean/cn;
// 180: getstatic su/catlean/cn.PEARL Lsu/catlean/cn;
// 183: goto 190
// 186: ldc2_w -1615624632816594226
// 189: lload 2
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: iload 26
// 192: ifne 1c1
// 195: if_acmpeq 1c4
// 198: goto 1a5
// 19b: ldc2_w -1615624632816594226
// 19e: lload 2
// 19f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a4: athrow
// 1a5: aload 0
// 1a6: iload 21
// 1a8: i2c
// 1a9: iload 22
// 1ab: iload 23
// 1ad: i2s
// 1ae: invokespecial su/catlean/q5.F (CIS)Lsu/catlean/cn;
// 1b1: getstatic su/catlean/cn.PEARL Lsu/catlean/cn;
// 1b4: goto 1c1
// 1b7: ldc2_w -1615624632816594226
// 1ba: lload 2
// 1bb: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1c0: athrow
// 1c1: if_acmpne 234
// 1c4: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1c7: bipush 1
// 1c8: anewarray 525
// 1cb: astore 28
// 1cd: aload 28
// 1cf: bipush 0
// 1d0: getstatic net/minecraft/class_1802.field_8634 Lnet/minecraft/class_1792;
// 1d3: dup
// 1d4: sipush 29132
// 1d7: ldc2_w 31429905614359318
// 1da: lload 2
// 1db: lxor
// 1dc: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1e1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1e4: aastore
// 1e5: aload 28
// 1e7: iload 16
// 1e9: i2c
// 1ea: lload 17
// 1ec: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 1ef: invokevirtual su/catlean/fg.R ()Z
// 1f2: istore 27
// 1f4: iload 27
// 1f6: ifeq 234
// 1f9: getstatic su/catlean/kk.a Lsu/catlean/kk;
// 1fc: lload 24
// 1fe: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 201: lload 11
// 203: dup2_x1
// 204: pop2
// 205: checkcast net/minecraft/class_1657
// 208: getstatic net/minecraft/class_1802.field_8634 Lnet/minecraft/class_1792;
// 20b: dup
// 20c: sipush 29132
// 20f: ldc2_w 31429905614359318
// 212: lload 2
// 213: lxor
// 214: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 21c: lload 24
// 21e: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 221: invokevirtual net/minecraft/class_746.method_36454 ()F
// 224: invokevirtual su/catlean/kk.K (JLnet/minecraft/class_1657;Lnet/minecraft/class_1792;F)V
// 227: goto 234
// 22a: ldc2_w -1615624632816594226
// 22d: lload 2
// 22e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 233: athrow
// 234: return
}

private final boolean t(int param1, int param2, byte param3) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: iload 1
// 001: i2l
// 002: bipush 32
// 004: lshl
// 005: iload 2
// 006: i2l
// 007: bipush 40
// 009: lshl
// 00a: bipush 32
// 00c: lushr
// 00d: lor
// 00e: iload 3
// 00f: i2l
// 010: bipush 56
// 012: lshl
// 013: bipush 56
// 015: lushr
// 016: lor
// 017: getstatic su/catlean/q5.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 95332016886309
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 96653659680479
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 8
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 9
// 03c: dup2
// 03d: bipush 48
// 03f: lshl
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 10
// 046: pop2
// 047: dup2
// 048: ldc2_w 1907778227734
// 04b: lxor
// 04c: lstore 11
// 04e: dup2
// 04f: ldc2_w 34619376321268
// 052: lxor
// 053: dup2
// 054: bipush 16
// 056: lushr
// 057: lstore 13
// 059: dup2
// 05a: bipush 48
// 05c: lshl
// 05d: bipush 48
// 05f: lushr
// 060: l2i
// 061: istore 15
// 063: pop2
// 064: dup2
// 065: ldc2_w 57366751460147
// 068: lxor
// 069: lstore 16
// 06b: dup2
// 06c: ldc2_w 32012602417866
// 06f: lxor
// 070: lstore 18
// 072: pop2
// 073: ldc2_w 8138339876346598669
// 076: lload 4
// 078: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 07d: istore 20
// 07f: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 082: bipush 1
// 083: anewarray 525
// 086: astore 21
// 088: aload 21
// 08a: bipush 0
// 08b: getstatic net/minecraft/class_1802.field_8287 Lnet/minecraft/class_1792;
// 08e: dup
// 08f: sipush 25398
// 092: ldc2_w 5050524802124267599
// 095: lload 4
// 097: lxor
// 098: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0a0: aastore
// 0a1: iload 8
// 0a3: aload 21
// 0a5: iload 9
// 0a7: iload 10
// 0a9: i2c
// 0aa: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 0ad: invokevirtual su/catlean/fg.R ()Z
// 0b0: iload 20
// 0b2: ifne 0c7
// 0b5: ifne 0c8
// 0b8: goto 0c6
// 0bb: ldc2_w 8087105055259626337
// 0be: lload 4
// 0c0: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c5: athrow
// 0c6: bipush 0
// 0c7: ireturn
// 0c8: lload 18
// 0ca: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 0cd: lload 11
// 0cf: dup2_x1
// 0d0: pop2
// 0d1: invokestatic su/catlean/s_.z (JLnet/minecraft/class_746;)Ljava/util/List;
// 0d4: checkcast java/lang/Iterable
// 0d7: astore 21
// 0d9: bipush 0
// 0da: istore 22
// 0dc: aload 21
// 0de: iload 20
// 0e0: ifne 136
// 0e3: instanceof java/util/Collection
// 0e6: ifeq 134
// 0e9: goto 0f7
// 0ec: ldc2_w 8087105055259626337
// 0ef: lload 4
// 0f1: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f6: athrow
// 0f7: aload 21
// 0f9: checkcast java/util/Collection
// 0fc: iload 20
// 0fe: ifne 136
// 101: goto 10f
// 104: ldc2_w 8087105055259626337
// 107: lload 4
// 109: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 10e: athrow
// 10f: invokeinterface java/util/Collection.isEmpty ()Z 1
// 114: ifeq 134
// 117: goto 125
// 11a: ldc2_w 8087105055259626337
// 11d: lload 4
// 11f: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 124: athrow
// 125: bipush 0
// 126: goto 18f
// 129: ldc2_w 8087105055259626337
// 12c: lload 4
// 12e: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 133: athrow
// 134: aload 21
// 136: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
// 13b: astore 23
// 13d: aload 23
// 13f: invokeinterface java/util/Iterator.hasNext ()Z 1
// 144: ifeq 18e
// 147: aload 23
// 149: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
// 14e: astore 24
// 150: aload 24
// 152: checkcast net/minecraft/class_1799
// 155: astore 25
// 157: bipush 0
// 158: istore 26
// 15a: getstatic su/catlean/dm.h Lsu/catlean/dm;
// 15d: lload 13
// 15f: aload 25
// 161: iload 15
// 163: i2c
// 164: invokevirtual su/catlean/dm.Y (JLnet/minecraft/class_1799;C)F
// 167: getstatic su/catlean/q5.E Lsu/catlean/q5;
// 16a: lload 6
// 16c: invokespecial su/catlean/q5.P (J)I
// 16f: i2f
// 170: fcmpg
// 171: iload 20
// 173: ifne 17a
// 176: ifge 17d
// 179: bipush 1
// 17a: goto 17e
// 17d: bipush 0
// 17e: ifeq 13d
// 181: bipush 1
// 182: iload 20
// 184: iload 2
// 185: iflt 173
// 188: ifne 171
// 18b: goto 18f
// 18e: bipush 0
// 18f: iload 1
// 190: iflt 1a9
// 193: ifeq 1a3
// 196: bipush 1
// 197: ireturn
// 198: ldc2_w 8087105055259626337
// 19b: lload 4
// 19d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a2: athrow
// 1a3: aload 0
// 1a4: lload 16
// 1a6: invokespecial su/catlean/q5.R (J)Z
// 1a9: iload 20
// 1ab: ifne 1c0
// 1ae: ifne 1c3
// 1b1: goto 1bf
// 1b4: ldc2_w 8087105055259626337
// 1b7: lload 4
// 1b9: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1be: athrow
// 1bf: bipush 1
// 1c0: goto 1c4
// 1c3: bipush 0
// 1c4: ireturn
}

private final void p(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q5.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 15362204822189
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 97238731985652
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 136384751487479
// 018: lxor
// 019: lstore 7
// 01b: dup2
// 01c: ldc2_w 97453327115394
// 01f: lxor
// 020: lstore 9
// 022: dup2
// 023: ldc2_w 39012317664885
// 026: lxor
// 027: dup2
// 028: bipush 32
// 02a: lushr
// 02b: l2i
// 02c: istore 11
// 02e: dup2
// 02f: bipush 32
// 031: lshl
// 032: bipush 48
// 034: lushr
// 035: l2i
// 036: istore 12
// 038: dup2
// 039: bipush 48
// 03b: lshl
// 03c: bipush 48
// 03e: lushr
// 03f: l2i
// 040: istore 13
// 042: pop2
// 043: dup2
// 044: ldc2_w 53595809017866
// 047: lxor
// 048: dup2
// 049: bipush 48
// 04b: lushr
// 04c: l2i
// 04d: istore 14
// 04f: dup2
// 050: bipush 16
// 052: lshl
// 053: bipush 16
// 055: lushr
// 056: lstore 15
// 058: pop2
// 059: dup2
// 05a: ldc2_w 55707796470680
// 05d: lxor
// 05e: dup2
// 05f: bipush 32
// 061: lushr
// 062: l2i
// 063: istore 17
// 065: dup2
// 066: bipush 32
// 068: lshl
// 069: bipush 32
// 06b: lushr
// 06c: lstore 18
// 06e: pop2
// 06f: dup2
// 070: ldc2_w 15614634328064
// 073: lxor
// 074: lstore 20
// 076: dup2
// 077: ldc2_w 70411930667318
// 07a: lxor
// 07b: dup2
// 07c: bipush 32
// 07e: lushr
// 07f: l2i
// 080: istore 22
// 082: dup2
// 083: bipush 32
// 085: lshl
// 086: bipush 48
// 088: lushr
// 089: l2i
// 08a: istore 23
// 08c: dup2
// 08d: bipush 48
// 08f: lshl
// 090: bipush 48
// 092: lushr
// 093: l2i
// 094: istore 24
// 096: pop2
// 097: dup2
// 098: ldc2_w 77459344055581
// 09b: lxor
// 09c: lstore 25
// 09e: dup2
// 09f: ldc2_w 116003569703520
// 0a2: lxor
// 0a3: lstore 27
// 0a5: pop2
// 0a6: ldc2_w 5213836185659649447
// 0a9: lload 1
// 0aa: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: istore 29
// 0b1: getstatic su/catlean/q5.y Lsu/catlean/bg;
// 0b4: sipush 14045
// 0b7: ldc2_w 2018083722194410816
// 0ba: lload 1
// 0bb: lxor
// 0bc: invokedynamic z (IJ)I bsm=su/catlean/q5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c1: lload 20
// 0c3: invokevirtual su/catlean/bg.q (IJ)Z
// 0c6: ifeq 30b
// 0c9: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0cc: bipush 1
// 0cd: anewarray 525
// 0d0: astore 31
// 0d2: aload 31
// 0d4: bipush 0
// 0d5: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 0d8: dup
// 0d9: sipush 25549
// 0dc: ldc2_w 5385373982295881742
// 0df: lload 1
// 0e0: lxor
// 0e1: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e6: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0e9: aastore
// 0ea: iload 11
// 0ec: aload 31
// 0ee: iload 12
// 0f0: iload 13
// 0f2: i2c
// 0f3: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 0f6: invokevirtual su/catlean/fg.a ()I
// 0f9: istore 30
// 0fb: aload 0
// 0fc: lload 5
// 0fe: invokespecial su/catlean/q5.Y (J)Z
// 101: iload 29
// 103: lload 1
// 104: lconst_0
// 105: lcmp
// 106: iflt 207
// 109: ifne 205
// 10c: ifeq 1f2
// 10f: goto 11c
// 112: ldc2_w 5229065851811869643
// 115: lload 1
// 116: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11b: athrow
// 11c: aload 0
// 11d: lload 7
// 11f: invokespecial su/catlean/q5.g (J)Z
// 122: iload 29
// 124: lload 1
// 125: lconst_0
// 126: lcmp
// 127: ifle 165
// 12a: ifne 163
// 12d: goto 13a
// 130: ldc2_w 5229065851811869643
// 133: lload 1
// 134: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 139: athrow
// 13a: lload 1
// 13b: lconst_0
// 13c: lcmp
// 13d: iflt 19d
// 140: ifeq 18a
// 143: goto 150
// 146: ldc2_w 5229065851811869643
// 149: lload 1
// 14a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 14f: athrow
// 150: aload 0
// 151: lload 7
// 153: invokespecial su/catlean/q5.g (J)Z
// 156: goto 163
// 159: ldc2_w 5229065851811869643
// 15c: lload 1
// 15d: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 162: athrow
// 163: iload 29
// 165: lload 1
// 166: lconst_0
// 167: lcmp
// 168: iflt 187
// 16b: ifne 180
// 16e: ifeq 1ad
// 171: goto 17e
// 174: ldc2_w 5229065851811869643
// 177: lload 1
// 178: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17d: athrow
// 17e: iload 30
// 180: lload 1
// 181: lconst_0
// 182: lcmp
// 183: iflt 1e9
// 186: bipush -1
// 187: if_icmpeq 1ad
// 18a: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 18d: iload 30
// 18f: aload 0
// 190: lload 3
// 191: invokespecial su/catlean/q5.V (J)I
// 194: lload 25
// 196: dup2_x1
// 197: pop2
// 198: invokevirtual su/catlean/gg.r (IJI)V
// 19b: iload 29
// 19d: ifeq 30b
// 1a0: goto 1ad
// 1a3: ldc2_w 5229065851811869643
// 1a6: lload 1
// 1a7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ac: athrow
// 1ad: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1b0: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 1b3: bipush 1
// 1b4: anewarray 525
// 1b7: astore 31
// 1b9: aload 31
// 1bb: bipush 0
// 1bc: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 1bf: dup
// 1c0: sipush 10277
// 1c3: ldc2_w 157109039974953953
// 1c6: lload 1
// 1c7: lxor
// 1c8: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 1d0: aastore
// 1d1: aload 31
// 1d3: iload 14
// 1d5: i2c
// 1d6: lload 15
// 1d8: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 1db: invokevirtual su/catlean/fg.a ()I
// 1de: iload 22
// 1e0: iload 23
// 1e2: iload 24
// 1e4: invokevirtual su/catlean/gg.O (IIII)V
// 1e7: iload 29
// 1e9: lload 1
// 1ea: lconst_0
// 1eb: lcmp
// 1ec: iflt 1f8
// 1ef: ifeq 30b
// 1f2: aload 0
// 1f3: lload 7
// 1f5: invokespecial su/catlean/q5.g (J)Z
// 1f8: goto 205
// 1fb: ldc2_w 5229065851811869643
// 1fe: lload 1
// 1ff: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 204: athrow
// 205: iload 29
// 207: ifne 268
// 20a: ifeq 266
// 20d: goto 21a
// 210: ldc2_w 5229065851811869643
// 213: lload 1
// 214: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 219: athrow
// 21a: aload 0
// 21b: lload 7
// 21d: invokespecial su/catlean/q5.g (J)Z
// 220: iload 29
// 222: lload 1
// 223: lconst_0
// 224: lcmp
// 225: iflt 24b
// 228: ifne 24a
// 22b: goto 238
// 22e: ldc2_w 5229065851811869643
// 231: lload 1
// 232: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 237: athrow
// 238: ifeq 2a0
// 23b: goto 248
// 23e: ldc2_w 5229065851811869643
// 241: lload 1
// 242: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 247: athrow
// 248: iload 30
// 24a: bipush -1
// 24b: lload 1
// 24c: lconst_0
// 24d: lcmp
// 24e: ifle 269
// 251: iload 29
// 253: ifne 269
// 256: if_icmpeq 2a0
// 259: goto 266
// 25c: ldc2_w 5229065851811869643
// 25f: lload 1
// 260: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 265: athrow
// 266: iload 30
// 268: bipush -1
// 269: if_icmpeq 30b
// 26c: new su/catlean/i3
// 26f: dup
// 270: iload 30
// 272: lload 27
// 274: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 277: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 27a: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 27d: aload 0
// 27e: lload 9
// 280: invokespecial su/catlean/q5.W (J)I
// 283: iload 17
// 285: bipush 0
// 286: lload 18
// 288: invokespecial su/catlean/i3.<init> (IIIIZJ)V
// 28b: invokevirtual su/catlean/i3.start ()V
// 28e: iload 29
// 290: ifeq 30b
// 293: goto 2a0
// 296: ldc2_w 5229065851811869643
// 299: lload 1
// 29a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 29f: athrow
// 2a0: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 2a3: bipush 1
// 2a4: anewarray 525
// 2a7: astore 32
// 2a9: aload 32
// 2ab: bipush 0
// 2ac: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
// 2af: dup
// 2b0: sipush 10277
// 2b3: ldc2_w 157109039974953953
// 2b6: lload 1
// 2b7: lxor
// 2b8: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 2bd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 2c0: aastore
// 2c1: aload 32
// 2c3: iload 14
// 2c5: i2c
// 2c6: lload 15
// 2c8: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 2cb: invokevirtual su/catlean/fg.a ()I
// 2ce: istore 31
// 2d0: lload 1
// 2d1: lconst_0
// 2d2: lcmp
// 2d3: ifle 2fe
// 2d6: iload 31
// 2d8: bipush -1
// 2d9: if_icmpeq 30b
// 2dc: new su/catlean/i3
// 2df: dup
// 2e0: iload 31
// 2e2: lload 27
// 2e4: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 2e7: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 2ea: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 2ed: aload 0
// 2ee: lload 9
// 2f0: invokespecial su/catlean/q5.W (J)I
// 2f3: iload 17
// 2f5: bipush 1
// 2f6: lload 18
// 2f8: invokespecial su/catlean/i3.<init> (IIIIZJ)V
// 2fb: invokevirtual su/catlean/i3.start ()V
// 2fe: goto 30b
// 301: ldc2_w 5229065851811869643
// 304: lload 1
// 305: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 30a: athrow
// 30b: return
}

private final void M(long param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q5.a J
// 003: lload 1
// 004: lxor
// 005: lstore 1
// 006: lload 1
// 007: dup2
// 008: ldc2_w 65981404972854
// 00b: lxor
// 00c: lstore 3
// 00d: dup2
// 00e: ldc2_w 64048792597631
// 011: lxor
// 012: lstore 5
// 014: dup2
// 015: ldc2_w 130919994287875
// 018: lxor
// 019: dup2
// 01a: bipush 32
// 01c: lushr
// 01d: l2i
// 01e: istore 7
// 020: dup2
// 021: bipush 32
// 023: lshl
// 024: bipush 48
// 026: lushr
// 027: l2i
// 028: istore 8
// 02a: dup2
// 02b: bipush 48
// 02d: lshl
// 02e: bipush 48
// 030: lushr
// 031: l2i
// 032: istore 9
// 034: pop2
// 035: dup2
// 036: ldc2_w 13843825825303
// 039: lxor
// 03a: lstore 10
// 03c: dup2
// 03d: ldc2_w 135331343602544
// 040: lxor
// 041: lstore 12
// 043: dup2
// 044: ldc2_w 31834661680211
// 047: lxor
// 048: lstore 14
// 04a: dup2
// 04b: ldc2_w 32878437767090
// 04e: lxor
// 04f: lstore 16
// 051: pop2
// 052: ldc2_w 6569398657550925527
// 055: lload 1
// 056: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 05b: istore 18
// 05d: getstatic su/catlean/q5.y Lsu/catlean/bg;
// 060: sipush 31041
// 063: ldc2_w 6314889493945319867
// 066: lload 1
// 067: lxor
// 068: invokedynamic z (IJ)I bsm=su/catlean/q5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 06d: lload 12
// 06f: invokevirtual su/catlean/bg.q (IJ)Z
// 072: iload 18
// 074: ifne 0b0
// 077: ifeq 233
// 07a: goto 087
// 07d: ldc2_w 6620619695719260347
// 080: lload 1
// 081: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 086: athrow
// 087: lload 3
// 088: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 08b: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 08e: iload 18
// 090: ifne 0d8
// 093: goto 0a0
// 096: ldc2_w 6620619695719260347
// 099: lload 1
// 09a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 09f: athrow
// 0a0: instanceof net/minecraft/class_3966
// 0a3: goto 0b0
// 0a6: ldc2_w 6620619695719260347
// 0a9: lload 1
// 0aa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0af: athrow
// 0b0: ifeq 233
// 0b3: lload 3
// 0b4: invokestatic su/catlean/zf.F (J)Lnet/minecraft/class_310;
// 0b7: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
// 0ba: dup
// 0bb: sipush 22953
// 0be: ldc2_w 55159448553935116
// 0c1: lload 1
// 0c2: lxor
// 0c3: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 0cb: goto 0d8
// 0ce: ldc2_w 6620619695719260347
// 0d1: lload 1
// 0d2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d7: athrow
// 0d8: checkcast net/minecraft/class_3966
// 0db: astore 19
// 0dd: aload 19
// 0df: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 0e2: instanceof net/minecraft/class_1657
// 0e5: iload 18
// 0e7: lload 1
// 0e8: lconst_0
// 0e9: lcmp
// 0ea: iflt 12d
// 0ed: ifne 12b
// 0f0: ifeq 233
// 0f3: goto 100
// 0f6: ldc2_w 6620619695719260347
// 0f9: lload 1
// 0fa: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0ff: athrow
// 100: aload 19
// 102: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 105: dup
// 106: sipush 14825
// 109: ldc2_w 2262648216050807127
// 10c: lload 1
// 10d: lxor
// 10e: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 113: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 116: checkcast net/minecraft/class_1657
// 119: lload 16
// 11b: invokestatic su/catlean/zv.a (Lnet/minecraft/class_1657;J)Z
// 11e: goto 12b
// 121: ldc2_w 6620619695719260347
// 124: lload 1
// 125: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 12a: athrow
// 12b: iload 18
// 12d: ifne 1eb
// 130: ifeq 1bd
// 133: goto 140
// 136: ldc2_w 6620619695719260347
// 139: lload 1
// 13a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 13f: athrow
// 140: getstatic su/catlean/c7.b Lsu/catlean/c7;
// 143: aload 19
// 145: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 148: dup
// 149: sipush 5922
// 14c: ldc2_w 7355102160693534596
// 14f: lload 1
// 150: lxor
// 151: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 156: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 159: checkcast net/minecraft/class_1657
// 15c: lload 14
// 15e: dup2_x1
// 15f: pop2
// 160: invokevirtual su/catlean/c7.u (JLnet/minecraft/class_1657;)Z
// 163: pop
// 164: aload 0
// 165: checkcast su/catlean/_g
// 168: getstatic net/minecraft/class_124.field_1061 Lnet/minecraft/class_124;
// 16b: aload 19
// 16d: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 170: invokevirtual net/minecraft/class_1297.method_5477 ()Lnet/minecraft/class_2561;
// 173: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 178: getstatic net/minecraft/class_124.field_1080 Lnet/minecraft/class_124;
// 17b: iload 7
// 17d: aload 0
// 17e: checkcast su/catlean/_g
// 181: sipush 1529
// 184: ldc2_w 4601760339358485839
// 187: lload 1
// 188: lxor
// 189: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18e: bipush 0
// 18f: anewarray 624
// 192: iload 8
// 194: i2c
// 195: bipush 0
// 196: bipush 4
// 197: aconst_null
// 198: iload 9
// 19a: i2s
// 19b: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 19e: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001 \u0001" ]
// 1a3: bipush 0
// 1a4: bipush 2
// 1a5: aconst_null
// 1a6: lload 5
// 1a8: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 1ab: iload 18
// 1ad: ifeq 233
// 1b0: goto 1bd
// 1b3: ldc2_w 6620619695719260347
// 1b6: lload 1
// 1b7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1bc: athrow
// 1bd: getstatic su/catlean/c7.b Lsu/catlean/c7;
// 1c0: aload 19
// 1c2: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 1c5: dup
// 1c6: sipush 5922
// 1c9: ldc2_w 7355102160693534596
// 1cc: lload 1
// 1cd: lxor
// 1ce: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1d3: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
// 1d6: checkcast net/minecraft/class_1657
// 1d9: lload 10
// 1db: invokevirtual su/catlean/c7.Q (Lnet/minecraft/class_1657;J)Z
// 1de: goto 1eb
// 1e1: ldc2_w 6620619695719260347
// 1e4: lload 1
// 1e5: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1ea: athrow
// 1eb: pop
// 1ec: aload 0
// 1ed: checkcast su/catlean/_g
// 1f0: getstatic net/minecraft/class_124.field_1060 Lnet/minecraft/class_124;
// 1f3: aload 19
// 1f5: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
// 1f8: invokevirtual net/minecraft/class_1297.method_5477 ()Lnet/minecraft/class_2561;
// 1fb: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
// 200: getstatic net/minecraft/class_124.field_1080 Lnet/minecraft/class_124;
// 203: iload 7
// 205: aload 0
// 206: checkcast su/catlean/_g
// 209: sipush 22655
// 20c: ldc2_w 6110621104214036723
// 20f: lload 1
// 210: lxor
// 211: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 216: bipush 0
// 217: anewarray 624
// 21a: iload 8
// 21c: i2c
// 21d: bipush 0
// 21e: bipush 4
// 21f: aconst_null
// 220: iload 9
// 222: i2s
// 223: invokestatic su/catlean/o2.Z (ILsu/catlean/_g;Ljava/lang/String;[Ljava/lang/Object;CZILjava/lang/Object;S)Ljava/lang/String;
// 226: invokedynamic makeConcatWithConstants (Lnet/minecraft/class_124;Ljava/lang/String;Lnet/minecraft/class_124;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001 \u0001" ]
// 22b: bipush 0
// 22c: bipush 2
// 22d: aconst_null
// 22e: lload 5
// 230: invokestatic su/catlean/o2.S (Lsu/catlean/_g;Ljava/lang/String;ZILjava/lang/Object;J)V
// 233: return
}

private final void C(char param1, int param2, short param3) {
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
// 017: getstatic su/catlean/q5.a J
// 01a: lxor
// 01b: lstore 4
// 01d: lload 4
// 01f: dup2
// 020: ldc2_w 78034089811290
// 023: lxor
// 024: lstore 6
// 026: dup2
// 027: ldc2_w 1201341757880
// 02a: lxor
// 02b: dup2
// 02c: bipush 32
// 02e: lushr
// 02f: l2i
// 030: istore 8
// 032: dup2
// 033: bipush 32
// 035: lshl
// 036: bipush 48
// 038: lushr
// 039: l2i
// 03a: istore 9
// 03c: dup2
// 03d: bipush 48
// 03f: lshl
// 040: bipush 48
// 042: lushr
// 043: l2i
// 044: istore 10
// 046: pop2
// 047: dup2
// 048: ldc2_w 20694393036743
// 04b: lxor
// 04c: dup2
// 04d: bipush 48
// 04f: lushr
// 050: l2i
// 051: istore 11
// 053: dup2
// 054: bipush 16
// 056: lshl
// 057: bipush 16
// 059: lushr
// 05a: lstore 12
// 05c: pop2
// 05d: dup2
// 05e: ldc2_w 111281506999877
// 061: lxor
// 062: lstore 14
// 064: dup2
// 065: ldc2_w 87617721804558
// 068: lxor
// 069: lstore 16
// 06b: dup2
// 06c: ldc2_w 48788251209677
// 06f: lxor
// 070: lstore 18
// 072: dup2
// 073: ldc2_w 83484924900781
// 076: lxor
// 077: lstore 20
// 079: pop2
// 07a: ldc2_w 2852579632715678314
// 07d: lload 4
// 07f: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 084: istore 22
// 086: getstatic su/catlean/q5.y Lsu/catlean/bg;
// 089: sipush 15293
// 08c: ldc2_w 3982398177409417192
// 08f: lload 4
// 091: lxor
// 092: invokedynamic z (IJ)I bsm=su/catlean/q5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 097: lload 18
// 099: invokevirtual su/catlean/bg.q (IJ)Z
// 09c: ifeq 19b
// 09f: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0a2: bipush 1
// 0a3: anewarray 525
// 0a6: astore 24
// 0a8: aload 24
// 0aa: bipush 0
// 0ab: getstatic net/minecraft/class_1802.field_8634 Lnet/minecraft/class_1792;
// 0ae: dup
// 0af: sipush 14383
// 0b2: ldc2_w 1400136638983719963
// 0b5: lload 4
// 0b7: lxor
// 0b8: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0bd: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0c0: aastore
// 0c1: iload 8
// 0c3: aload 24
// 0c5: iload 9
// 0c7: iload 10
// 0c9: i2c
// 0ca: invokevirtual su/catlean/gg.Y (I[Lnet/minecraft/class_1792;IC)Lsu/catlean/fg;
// 0cd: invokevirtual su/catlean/fg.a ()I
// 0d0: istore 23
// 0d2: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 0d5: bipush 1
// 0d6: anewarray 525
// 0d9: astore 25
// 0db: aload 25
// 0dd: bipush 0
// 0de: getstatic net/minecraft/class_1802.field_8634 Lnet/minecraft/class_1792;
// 0e1: dup
// 0e2: sipush 29132
// 0e5: ldc2_w 31509129842001374
// 0e8: lload 4
// 0ea: lxor
// 0eb: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0f0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 0f3: aastore
// 0f4: aload 25
// 0f6: iload 11
// 0f8: i2c
// 0f9: lload 12
// 0fb: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 0fe: invokevirtual su/catlean/fg.a ()I
// 101: istore 24
// 103: iload 23
// 105: bipush -1
// 106: iload 2
// 107: ifle 131
// 10a: iload 22
// 10c: ifne 131
// 10f: if_icmpne 134
// 112: goto 120
// 115: ldc2_w 2836280141985176582
// 118: lload 4
// 11a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 11f: athrow
// 120: iload 24
// 122: bipush -1
// 123: goto 131
// 126: ldc2_w 2836280141985176582
// 129: lload 4
// 12b: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 130: athrow
// 131: if_icmpeq 19b
// 134: getstatic su/catlean/_8.P Lsu/catlean/_8;
// 137: new su/catlean/tu
// 13a: dup
// 13b: new su/catlean/_w
// 13e: dup
// 13f: lload 20
// 141: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 144: invokevirtual net/minecraft/class_746.method_36454 ()F
// 147: lload 20
// 149: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 14c: invokevirtual net/minecraft/class_746.method_36455 ()F
// 14f: lload 16
// 151: dup2_x1
// 152: pop2
// 153: bipush 0
// 154: aconst_null
// 155: sipush 19898
// 158: ldc2_w 7208653263029094886
// 15b: lload 4
// 15d: lxor
// 15e: invokedynamic z (IJ)I bsm=su/catlean/q5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 163: aconst_null
// 164: invokespecial su/catlean/_w.<init> (FJFZLsu/catlean/z3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
// 167: sipush 6995
// 16a: ldc2_w 5979047601078771468
// 16d: lload 4
// 16f: lxor
// 170: invokedynamic z (IJ)I bsm=su/catlean/q5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 175: iload 23
// 177: iload 24
// 179: invokedynamic invoke (II)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, su/catlean/q5.r (II)Lkotlin/Unit;, ()Lkotlin/Unit; ]
// 17e: lload 6
// 180: invokespecial su/catlean/tu.<init> (Lsu/catlean/_w;ILkotlin/jvm/functions/Function0;J)V
// 183: checkcast su/catlean/t5
// 186: lload 14
// 188: dup2_x1
// 189: pop2
// 18a: invokevirtual su/catlean/_8.C (JLsu/catlean/t5;)V
// 18d: goto 19b
// 190: ldc2_w 2836280141985176582
// 193: lload 4
// 195: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 19a: athrow
// 19b: return
}

private final void s(long var1) {
var1 = a ^ var1;
long var10001 = var1 ^ 33768286551126L;
int var3 = (int)((var1 ^ 33768286551126L) >>> 32);
int var4 = (int)((var1 ^ 33768286551126L) << 32 >>> 40);
int var5 = (int)(var10001 << 56 >>> 56);
long var6 = var1 ^ 117857968584227L;
long var8 = var1 ^ 72247184658280L;
long var10 = var1 ^ 83946651678988L;
long var12 = var1 ^ 76865245208011L;

try {
if (this.t(var3, var4, (byte)var5)) {
_8.P
.C(
var6,
new t5(
new _w(zf.v(var12).method_36454(), var8, 90.0F, false, null, c<"z">(25754, 5594586697467087033L ^ var1), null),
var10,
c<"z">(13510, 5517643152614660324L ^ var1),
q5::i
)
);
}
} catch (NumberFormatException var14) {
throw vm.a<"Å">(var14, 1097316754640434272L, var1);
}
}

private static final boolean v() {
long var0 = a ^ 46434071748743L;
long var2 = var0 ^ 106640272554027L;
int var4 = vm.a<"Å">(2487250256745875320L, var0);

try {
boolean var10000 = E.Y(var2);
if (var4 != 0) {
return var10000;
}

if (!var10000) {
return true;
}
} catch (NumberFormatException var5) {
throw vm.a<"Å">(var5, 2472026644619680020L, var0);
}

return false;
}

private static final Unit r(int param0, int param1) {
// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
// java.lang.RuntimeException: parsing failure!
//   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
//   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
//
// Bytecode:
// 000: getstatic su/catlean/q5.a J
// 003: ldc2_w 97645581637102
// 006: lxor
// 007: lstore 2
// 008: lload 2
// 009: dup2
// 00a: ldc2_w 78616577291547
// 00d: lxor
// 00e: lstore 4
// 010: dup2
// 011: ldc2_w 19828723109186
// 014: lxor
// 015: lstore 6
// 017: dup2
// 018: ldc2_w 59863778530881
// 01b: lxor
// 01c: lstore 8
// 01e: dup2
// 01f: ldc2_w 20729879509812
// 022: lxor
// 023: lstore 10
// 025: dup2
// 026: ldc2_w 134991573102524
// 029: lxor
// 02a: dup2
// 02b: bipush 48
// 02d: lushr
// 02e: l2i
// 02f: istore 12
// 031: dup2
// 032: bipush 16
// 034: lshl
// 035: bipush 16
// 037: lushr
// 038: lstore 13
// 03a: pop2
// 03b: dup2
// 03c: ldc2_w 132847239177262
// 03f: lxor
// 040: dup2
// 041: bipush 32
// 043: lushr
// 044: l2i
// 045: istore 15
// 047: dup2
// 048: bipush 32
// 04a: lshl
// 04b: bipush 32
// 04d: lushr
// 04e: lstore 16
// 050: pop2
// 051: dup2
// 052: ldc2_w 11487392749184
// 055: lxor
// 056: dup2
// 057: bipush 32
// 059: lushr
// 05a: l2i
// 05b: istore 18
// 05d: dup2
// 05e: bipush 32
// 060: lshl
// 061: bipush 48
// 063: lushr
// 064: l2i
// 065: istore 19
// 067: dup2
// 068: bipush 48
// 06a: lshl
// 06b: bipush 48
// 06d: lushr
// 06e: l2i
// 06f: istore 20
// 071: pop2
// 072: dup2
// 073: ldc2_w 13239157293739
// 076: lxor
// 077: lstore 21
// 079: dup2
// 07a: ldc2_w 39555516057046
// 07d: lxor
// 07e: lstore 23
// 080: pop2
// 081: ldc2_w 1724049743907746321
// 084: lload 2
// 085: invokedynamic Å (JJ)I bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 08a: istore 25
// 08c: getstatic su/catlean/q5.E Lsu/catlean/q5;
// 08f: lload 6
// 091: invokespecial su/catlean/q5.Y (J)Z
// 094: iload 25
// 096: ifne 17b
// 099: ifeq 166
// 09c: goto 0a9
// 09f: ldc2_w 1668326202000305277
// 0a2: lload 2
// 0a3: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0a8: athrow
// 0a9: getstatic su/catlean/q5.E Lsu/catlean/q5;
// 0ac: lload 8
// 0ae: invokespecial su/catlean/q5.g (J)Z
// 0b1: iload 25
// 0b3: ifne 0e8
// 0b6: goto 0c3
// 0b9: ldc2_w 1668326202000305277
// 0bc: lload 2
// 0bd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0c2: athrow
// 0c3: ifeq 102
// 0c6: goto 0d3
// 0c9: ldc2_w 1668326202000305277
// 0cc: lload 2
// 0cd: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0d2: athrow
// 0d3: getstatic su/catlean/q5.E Lsu/catlean/q5;
// 0d6: lload 8
// 0d8: invokespecial su/catlean/q5.g (J)Z
// 0db: goto 0e8
// 0de: ldc2_w 1668326202000305277
// 0e1: lload 2
// 0e2: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0e7: athrow
// 0e8: iload 25
// 0ea: ifne 0fe
// 0ed: ifeq 127
// 0f0: goto 0fd
// 0f3: ldc2_w 1668326202000305277
// 0f6: lload 2
// 0f7: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 0fc: athrow
// 0fd: iload 0
// 0fe: bipush -1
// 0ff: if_icmpeq 127
// 102: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 105: iload 0
// 106: getstatic su/catlean/q5.E Lsu/catlean/q5;
// 109: lload 4
// 10b: invokespecial su/catlean/q5.V (J)I
// 10e: lload 21
// 110: dup2_x1
// 111: pop2
// 112: invokevirtual su/catlean/gg.r (IJI)V
// 115: iload 25
// 117: ifeq 25a
// 11a: goto 127
// 11d: ldc2_w 1668326202000305277
// 120: lload 2
// 121: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 126: athrow
// 127: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 12a: getstatic su/catlean/gg.P Lsu/catlean/gg;
// 12d: bipush 1
// 12e: anewarray 525
// 131: astore 26
// 133: aload 26
// 135: bipush 0
// 136: getstatic net/minecraft/class_1802.field_8634 Lnet/minecraft/class_1792;
// 139: dup
// 13a: sipush 29132
// 13d: ldc2_w 31412457156851109
// 140: lload 2
// 141: lxor
// 142: invokedynamic w (IJ)Ljava/lang/String; bsm=su/catlean/q5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 147: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
// 14a: aastore
// 14b: aload 26
// 14d: iload 12
// 14f: i2c
// 150: lload 13
// 152: invokevirtual su/catlean/gg.o ([Lnet/minecraft/class_1792;CJ)Lsu/catlean/fg;
// 155: invokevirtual su/catlean/fg.a ()I
// 158: iload 18
// 15a: iload 19
// 15c: iload 20
// 15e: invokevirtual su/catlean/gg.O (IIII)V
// 161: iload 25
// 163: ifeq 25a
// 166: getstatic su/catlean/q5.E Lsu/catlean/q5;
// 169: lload 8
// 16b: invokespecial su/catlean/q5.g (J)Z
// 16e: goto 17b
// 171: ldc2_w 1668326202000305277
// 174: lload 2
// 175: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 17a: athrow
// 17b: iload 25
// 17d: ifne 1df
// 180: ifeq 1de
// 183: goto 190
// 186: ldc2_w 1668326202000305277
// 189: lload 2
// 18a: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 18f: athrow
// 190: getstatic su/catlean/q5.E Lsu/catlean/q5;
// 193: lload 8
// 195: invokespecial su/catlean/q5.g (J)Z
// 198: iload 25
// 19a: ifne 226
// 19d: goto 1aa
// 1a0: ldc2_w 1668326202000305277
// 1a3: lload 2
// 1a4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1a9: athrow
// 1aa: ifeq 218
// 1ad: goto 1ba
// 1b0: ldc2_w 1668326202000305277
// 1b3: lload 2
// 1b4: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1b9: athrow
// 1ba: iload 0
// 1bb: bipush -1
// 1bc: iload 25
// 1be: ifne 227
// 1c1: goto 1ce
// 1c4: ldc2_w 1668326202000305277
// 1c7: lload 2
// 1c8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1cd: athrow
// 1ce: if_icmpeq 218
// 1d1: goto 1de
// 1d4: ldc2_w 1668326202000305277
// 1d7: lload 2
// 1d8: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 1dd: athrow
// 1de: iload 0
// 1df: bipush -1
// 1e0: if_icmpeq 25a
// 1e3: new su/catlean/i3
// 1e6: dup
// 1e7: iload 0
// 1e8: lload 23
// 1ea: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 1ed: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 1f0: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 1f3: getstatic su/catlean/q5.E Lsu/catlean/q5;
// 1f6: lload 10
// 1f8: invokespecial su/catlean/q5.W (J)I
// 1fb: iload 15
// 1fd: bipush 0
// 1fe: lload 16
// 200: invokespecial su/catlean/i3.<init> (IIIIZJ)V
// 203: invokevirtual su/catlean/i3.start ()V
// 206: iload 25
// 208: ifeq 25a
// 20b: goto 218
// 20e: ldc2_w 1668326202000305277
// 211: lload 2
// 212: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 217: athrow
// 218: iload 1
// 219: goto 226
// 21c: ldc2_w 1668326202000305277
// 21f: lload 2
// 220: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 225: athrow
// 226: bipush -1
// 227: if_icmpeq 25a
// 22a: new su/catlean/i3
// 22d: dup
// 22e: iload 1
// 22f: lload 23
// 231: invokestatic su/catlean/zf.v (J)Lnet/minecraft/class_746;
// 234: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
// 237: invokevirtual net/minecraft/class_1661.method_67532 ()I
// 23a: getstatic su/catlean/q5.E Lsu/catlean/q5;
// 23d: lload 10
// 23f: invokespecial su/catlean/q5.W (J)I
// 242: iload 15
// 244: bipush 1
// 245: lload 16
// 247: invokespecial su/catlean/i3.<init> (IIIIZJ)V
// 24a: invokevirtual su/catlean/i3.start ()V
// 24d: goto 25a
// 250: ldc2_w 1668326202000305277
// 253: lload 2
// 254: invokedynamic Å (Ljava/lang/Object;JJ)Ljava/lang/NumberFormatException; bsm=su/catlean/vm.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
// 259: athrow
// 25a: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
// 25d: areturn
}

private static final Unit i() {
long var0 = a ^ 5544207059025L;
long var2 = var0 ^ 28881094617252L;
long var10001 = var0 ^ 58033312257148L;
int var4 = (int)((var0 ^ 58033312257148L) >>> 32);
int var5 = (int)((var0 ^ 58033312257148L) << 32 >>> 48);
int var6 = (int)(var10001 << 48 >>> 48);
long var7 = var0 ^ 89946363764500L;
gg var10000 = gg.P;
gg var10 = gg.P;
class_1792[] var9 = new class_1792[1];
class_1792 var10004 = class_1802.field_8287;
Intrinsics.checkNotNullExpressionValue(class_1802.field_8287, b<"w">(14860, 8898239840630727669L ^ var0));
var9[0] = var10004;
var10000.r(var10.Y(var4, var9, var5, (char)var6).a(), var7, E.V(var2));
return Unit.INSTANCE;
}

public static final void Z(int a, q5 $this, short a, int a) {
long var4 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var6 = var4 ^ 136447609465480L;
$this.p(var6);
}

public static final void a(int a, char a, int a, q5 $this) {
long var4 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var6 = var4 ^ 102071107535820L;
$this.M(var6);
}

public static final boolean q(int a, char a, int a, q5 $this) {
long var4 = ((long)ax << 32 | (long)axxx << 48 >>> 32 | (long)axx << 48 >>> 48) ^ a;
long var10001 = var4 ^ 49466939743796L;
int var6 = (int)((var4 ^ 49466939743796L) >>> 32);
int var7 = (int)((var4 ^ 49466939743796L) << 32 >>> 48);
int var8 = (int)(var10001 << 48 >>> 48);
return $this.q(var6, (char)var7, (short)var8);
}

public static final void g(q5 $this, long a) {
ax = a ^ ax;
long var10001 = ax ^ 33184457355480L;
int var3 = (int)((ax ^ 33184457355480L) >>> 48);
int var4 = (int)((ax ^ 33184457355480L) << 16 >>> 32);
int var5 = (int)(var10001 << 48 >>> 48);
$this.C((char)var3, var4, (short)var5);
}

public static final void B(q5 $this, long a) {
ax = a ^ ax;
long var3 = ax ^ 93767565686446L;
$this.s(var3);
}

static {
long var20 = a ^ 130657401033271L;
long var22 = var20 ^ 11476824135602L;
long var24 = var20 ^ 41607616142036L;
long var26 = var20 ^ 44400706400526L;
long var28 = var20 ^ 82521735539974L;
Cipher var11;
Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var12 = 1; var12 < 8; var12++) {
var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
String[] var18 = new String[45];
int var16 = 0;
String var15 = "UÄ\u0003Á°%)mZ\n\u0081\u0082\n\u0092K\u0083`ë'z·\u009c¿\u009c]\u0014'Æb\u0092ÄH8Þ\u001eu°aýZ¥r\u001aÈ\u008f\u000eñxEÖ\u0080á\u0007;b÷¸\u008cÔ®\u0006\u008dug-r(Õ\u001c3ó¿ò÷\u001a\u0094[Î¢²å÷ÍH8d[ýÐ\u0010\u0092J!R\u0087E\u007fHÏ;æ\u0086âç_- î4dù0\u0005\u0099\u007fÖ\u0094'GíäÍ\u00074\f,¼ßÏÂü\u0081ú\u008dS â\u009d\b\u0018ûE\u0012#h\u001fØ\u0084\u0083K\u0003éçD\u001eËÂ,y\u0080)\u009dAÿ\u0010µáK1%åa0ÐAi\u0092'\u0019\u00834\u0018d¬.[XãØ\"µï¼l©käëÙ\f?Åï\u0081¥\f 4xéd\u0085\"\u0012³÷Ø\u0089õpæx=R)JË/ìJpÅkJÊ±å>Æ\u0010)|é\u0015QU\u0089\u0080äa\u0013\u009bwJ\u001a\u001d\u0018\u009dº¢ÑßÞÔßêså\u0096ç\u0011O1TÕåïõ,\u001cþ \u0019FyÒ=\u0093´Ú\u001d¨Qw½C0Mº#ûN\u0099¾©XKTÐ\u008e*_È°(á\u0091Âõ\u0081Û¤@\u008d±ÄÉ@à$\u00ad\u008c¹òéê\u0007;BðE¸WuõÙc¥b*\u0088Õ]T\u0006\u0010\u0084©\u0010[ì-r\u0019IwÈ\u0081äOEPxY¼CÐ)\u0017TGqPþ ,®âÆÏ«r\u0012\u0003Y3\u0019\u001b¼¼®xc¢%e£@4`.\u009363Ü§ñ\u000eÜG¾öUndZW[|Åá!¸\u001f¥·h×Ê4¾\u008bÌÓ9\u0093Õ\u0082MÀ\u0084®\u0098\u0098\u009dfrnÁKNs/\u001f\u008bFÞæÀóQ\u000eÆ\u0088\u008aê£\u0099\bäÏ?JYgüÜ`\u0002¸\u009b\t²xH\u0091\u0014E¼\u0092\u009aù\u0014¦\u0097C}J\u0001cQ\u001bE¡\u009eälú¼õú\u0091)N¿Ð¤bæÿR®héð±ú¿¶¸À-\u0099ûËØåmG\u008dì©á?\u0005;ÄÓ§½þ5^¯{³86oä\u001fJ\u000e\u0013.Ñÿè)Á\u009aU\u0015Ú\u0012¬/½Ë É\u0004³zN\u0088\u00923\u0084Ð\u0095³EÈeî\u0098^µ\u009c\u0090,\u008fà\u0018fæV\u009a\u00943¢ËnõEç\tIÛ5..w\u0093.{aò üÝO¦W\u008e\u009c\u0012åÜ\bc\\\u0083\u001d².W.ÆéT\næ\u0018ÀLUñ\u0015\u009aæ8> ½#vðI\u001b\u008e+«\u001b½[´ÆÌ\u0003sì^û\u001d³[ei\u00156ÿ\u0081\u00132v!1¥_('å3z¶iÙ\u008eà\u0017\u0018i/£ÍIð\u00102e\u0013\u0083ök·\u009fÖØ\u0083ì \u0088èÛ \u000eôÙ\u007fð¾\u0014\u0086\u0004I\u008d1j\u0082Wé\u00042ígr®Vÿñ\u0086(\u0084EÍõE\u0018Ù>\u0081dq\u008bAjØ \u009c!å\n%I\u0081¢ûOù¨<< ÞóW8â_ë\u009f\u008bxÉjÿ\u001cùhÓj82ç\u0016-#e\u0002\u009e«\u000f\u0010ûåpøÕâ\u0007\fTÛ\u009c±4\u0000\u0080wdð²¶°º\u000e\u0096³]åáá:ë¸£\u009bOõI~Ä*>y\u0001Xs¨!è *¿\u0012\u000bµø-¥[\u001euv\u0018ÿ²@ç\u0001áÂ{ð2µ>u\u0003Ð¾ÝÐsyÁÇú)\u001eö\u0005H`GößºìØtÊÒ£\u000e\u0099y\u001c\nip\u001bþG.m\u0093¬\u0018T ÔöóH0Å®~\u0080\u007fû±õMxc=Fg¶¾\u0017\u0010#IG_¤Ä¥Q\u0086ºùS\u0096\u009b¨4 \u0003\u0092\u0099\u0017z\u0097éf\fË%÷`m©,àö:¾P).æÝµ\u0013&wÝ]g\u0018P\u001aÞ¸´å\u0081ë\u0005D\u0002rº\u0098,²åîè>½\u0090?p\u0018\u007f\u0085é\u0096\u008b»ahäã\u0007ØVh\u0083·ð@'I\u008fJÍ0\u0018\u0098Ö\u009b\u0087E¨#+0B\u000fCTæª¾Â\u009bÕ\u0019P\u0005ý¢ Ml\u0089\u0094J\r@fÿ»ý\u0007d\u0098e-\u0096\u0005jO`[½yÀú\u0082Ø`;cn\u0010ìÞ\u0016ß\u0085v\u0091²Y²\u0082\u0081\u000e`ª\u0094 \"P\u0012«Ztv3Ú\u0018:\u0098?\u0098cÇ\u0011\u008f\u008fhÌ³¡\u0015\u008fBßhWFM«(µÜ3Ô\f\u0013¡¤\u009e\u0016$¦\u0093ÚÙ\u0003;\u001cÝ¹\u001b\u001c\u000eÔË^:tF\u008aIÞ\u008e7pq%¬'Æ ü&²B\u001aÌ¼\t\u0092Ó½\u0094ùô\u0090YøA\u0083W$L\u0096ÂlÈi¿±ÆQJ @ºÆ\u0096_ìw}\u008b²\u008f\u009c®À\u008c¨fLkï»ÌöIG\u0012dqpKþ) b\u001b~\u0089\u008eU \u007f\u0000p±o\u009b\u001aà\u0012i\u000eªF*\u001cÍ»xñ`Os\u0090<s\u0010K\u0080âzÕ]\u0001\u001aÏêË\u0099y«,\u0018(x\u009a\u0093û£í\u008aÜ¹úÔñÌ\u0092T\\±âûõ\u0005\u0086\u0095\t»\u0091\u0090\u0087\u0010X\u0099þ§¤.¼=\u0093\u0090ú8¬X\u0002\u0096¼y\u001eÆ\u0006\u008d±Ö,usdþ\rs}§q©K<\fµH>QÞ\u0092Õ\u0000\fn~L*ªXUeP\\oÓÉ\u0092ú\u0082þ\u0011Ä\u0012\u00928»\u0014Äè\u001f\u008eá\u0091Á\u0015q\u0001òv4éß¾åAo\u008e\t2înP\u0084±\u0004 hû\u001bLy#v\u001a\u0004ðüN,\u001fg\u0095ÓN\u000eà\u001d~ò·¨(ÞË\u0017¼\u000e\u009cnWF\u0004\u0088²\u008e\u0007ìãz\u001fÇ\u00061\u0005ÙÞèÉ\u0082\u008d[õùØ\u000e>i\fý4o\\ °7\f±k\u008eº[Ô[IÎòÉ¾\u0090@l\u009a.äP»&('På\u000fñ\u0097] ék\u001b²»[\"ZQ\u0001ÅJ\f\t\u001dusX\u0001\u009eÈl7\u00930Vs§þ\u0006\u007fe";
int var17 = "UÄ\u0003Á°%)mZ\n\u0081\u0082\n\u0092K\u0083`ë'z·\u009c¿\u009c]\u0014'Æb\u0092ÄH8Þ\u001eu°aýZ¥r\u001aÈ\u008f\u000eñxEÖ\u0080á\u0007;b÷¸\u008cÔ®\u0006\u008dug-r(Õ\u001c3ó¿ò÷\u001a\u0094[Î¢²å÷ÍH8d[ýÐ\u0010\u0092J!R\u0087E\u007fHÏ;æ\u0086âç_- î4dù0\u0005\u0099\u007fÖ\u0094'GíäÍ\u00074\f,¼ßÏÂü\u0081ú\u008dS â\u009d\b\u0018ûE\u0012#h\u001fØ\u0084\u0083K\u0003éçD\u001eËÂ,y\u0080)\u009dAÿ\u0010µáK1%åa0ÐAi\u0092'\u0019\u00834\u0018d¬.[XãØ\"µï¼l©käëÙ\f?Åï\u0081¥\f 4xéd\u0085\"\u0012³÷Ø\u0089õpæx=R)JË/ìJpÅkJÊ±å>Æ\u0010)|é\u0015QU\u0089\u0080äa\u0013\u009bwJ\u001a\u001d\u0018\u009dº¢ÑßÞÔßêså\u0096ç\u0011O1TÕåïõ,\u001cþ \u0019FyÒ=\u0093´Ú\u001d¨Qw½C0Mº#ûN\u0099¾©XKTÐ\u008e*_È°(á\u0091Âõ\u0081Û¤@\u008d±ÄÉ@à$\u00ad\u008c¹òéê\u0007;BðE¸WuõÙc¥b*\u0088Õ]T\u0006\u0010\u0084©\u0010[ì-r\u0019IwÈ\u0081äOEPxY¼CÐ)\u0017TGqPþ ,®âÆÏ«r\u0012\u0003Y3\u0019\u001b¼¼®xc¢%e£@4`.\u009363Ü§ñ\u000eÜG¾öUndZW[|Åá!¸\u001f¥·h×Ê4¾\u008bÌÓ9\u0093Õ\u0082MÀ\u0084®\u0098\u0098\u009dfrnÁKNs/\u001f\u008bFÞæÀóQ\u000eÆ\u0088\u008aê£\u0099\bäÏ?JYgüÜ`\u0002¸\u009b\t²xH\u0091\u0014E¼\u0092\u009aù\u0014¦\u0097C}J\u0001cQ\u001bE¡\u009eälú¼õú\u0091)N¿Ð¤bæÿR®héð±ú¿¶¸À-\u0099ûËØåmG\u008dì©á?\u0005;ÄÓ§½þ5^¯{³86oä\u001fJ\u000e\u0013.Ñÿè)Á\u009aU\u0015Ú\u0012¬/½Ë É\u0004³zN\u0088\u00923\u0084Ð\u0095³EÈeî\u0098^µ\u009c\u0090,\u008fà\u0018fæV\u009a\u00943¢ËnõEç\tIÛ5..w\u0093.{aò üÝO¦W\u008e\u009c\u0012åÜ\bc\\\u0083\u001d².W.ÆéT\næ\u0018ÀLUñ\u0015\u009aæ8> ½#vðI\u001b\u008e+«\u001b½[´ÆÌ\u0003sì^û\u001d³[ei\u00156ÿ\u0081\u00132v!1¥_('å3z¶iÙ\u008eà\u0017\u0018i/£ÍIð\u00102e\u0013\u0083ök·\u009fÖØ\u0083ì \u0088èÛ \u000eôÙ\u007fð¾\u0014\u0086\u0004I\u008d1j\u0082Wé\u00042ígr®Vÿñ\u0086(\u0084EÍõE\u0018Ù>\u0081dq\u008bAjØ \u009c!å\n%I\u0081¢ûOù¨<< ÞóW8â_ë\u009f\u008bxÉjÿ\u001cùhÓj82ç\u0016-#e\u0002\u009e«\u000f\u0010ûåpøÕâ\u0007\fTÛ\u009c±4\u0000\u0080wdð²¶°º\u000e\u0096³]åáá:ë¸£\u009bOõI~Ä*>y\u0001Xs¨!è *¿\u0012\u000bµø-¥[\u001euv\u0018ÿ²@ç\u0001áÂ{ð2µ>u\u0003Ð¾ÝÐsyÁÇú)\u001eö\u0005H`GößºìØtÊÒ£\u000e\u0099y\u001c\nip\u001bþG.m\u0093¬\u0018T ÔöóH0Å®~\u0080\u007fû±õMxc=Fg¶¾\u0017\u0010#IG_¤Ä¥Q\u0086ºùS\u0096\u009b¨4 \u0003\u0092\u0099\u0017z\u0097éf\fË%÷`m©,àö:¾P).æÝµ\u0013&wÝ]g\u0018P\u001aÞ¸´å\u0081ë\u0005D\u0002rº\u0098,²åîè>½\u0090?p\u0018\u007f\u0085é\u0096\u008b»ahäã\u0007ØVh\u0083·ð@'I\u008fJÍ0\u0018\u0098Ö\u009b\u0087E¨#+0B\u000fCTæª¾Â\u009bÕ\u0019P\u0005ý¢ Ml\u0089\u0094J\r@fÿ»ý\u0007d\u0098e-\u0096\u0005jO`[½yÀú\u0082Ø`;cn\u0010ìÞ\u0016ß\u0085v\u0091²Y²\u0082\u0081\u000e`ª\u0094 \"P\u0012«Ztv3Ú\u0018:\u0098?\u0098cÇ\u0011\u008f\u008fhÌ³¡\u0015\u008fBßhWFM«(µÜ3Ô\f\u0013¡¤\u009e\u0016$¦\u0093ÚÙ\u0003;\u001cÝ¹\u001b\u001c\u000eÔË^:tF\u008aIÞ\u008e7pq%¬'Æ ü&²B\u001aÌ¼\t\u0092Ó½\u0094ùô\u0090YøA\u0083W$L\u0096ÂlÈi¿±ÆQJ @ºÆ\u0096_ìw}\u008b²\u008f\u009c®À\u008c¨fLkï»ÌöIG\u0012dqpKþ) b\u001b~\u0089\u008eU \u007f\u0000p±o\u009b\u001aà\u0012i\u000eªF*\u001cÍ»xñ`Os\u0090<s\u0010K\u0080âzÕ]\u0001\u001aÏêË\u0099y«,\u0018(x\u009a\u0093û£í\u008aÜ¹úÔñÌ\u0092T\\±âûõ\u0005\u0086\u0095\t»\u0091\u0090\u0087\u0010X\u0099þ§¤.¼=\u0093\u0090ú8¬X\u0002\u0096¼y\u001eÆ\u0006\u008d±Ö,usdþ\rs}§q©K<\fµH>QÞ\u0092Õ\u0000\fn~L*ªXUeP\\oÓÉ\u0092ú\u0082þ\u0011Ä\u0012\u00928»\u0014Äè\u001f\u008eá\u0091Á\u0015q\u0001òv4éß¾åAo\u008e\t2înP\u0084±\u0004 hû\u001bLy#v\u001a\u0004ðüN,\u001fg\u0095ÓN\u000eà\u001d~ò·¨(ÞË\u0017¼\u000e\u009cnWF\u0004\u0088²\u008e\u0007ìãz\u001fÇ\u00061\u0005ÙÞèÉ\u0082\u008d[õùØ\u000e>i\fý4o\\ °7\f±k\u008eº[Ô[IÎòÉ¾\u0090@l\u009a.äP»&('På\u000fñ\u0097] ék\u001b²»[\"ZQ\u0001ÅJ\f\t\u001dusX\u0001\u009eÈl7\u00930Vs§þ\u0006\u007fe"
.length();
char var14 = ' ';
int var33 = -1;

label54:
while (true) {
String var34 = var15.substring(++var33, var33 + var14);
int var10001 = -1;

while (true) {
byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
String var45 = b(var19).intern();
switch (var10001) {
case 0:
var18[var16++] = var45;
if ((var33 += var14) >= var17) {
b = var18;
c = new String[45];
i = new HashMap(13);
Cipher var0;
var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
var10002 = SecretKeyFactory.getInstance("DES");
var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

for (int var1 = 1; var1 < 8; var1++) {
var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
}

var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
long[] var6 = new long[25];
int var3 = 0;
String var4 = "öõ#±¥On\u008b¯Ä\u0001¼Y¦£\u000bÿ¼\u009dovíKq`î\r«qLä\u0011ÿ\u0089.°9W\u000b\u008b1¦\u0095w\u007f\u009a\u0011}5Ê\u0013`Øiïc\u0091Ù½\"\u0004\tK°7\u0005À\u0086Wèñg×{Õ\u001dþþì÷¿\u0099øfr?AãÆæ·p\u008có\u0017ºTWäûêA3Þ\u009aÔ\u008b\u0083·U\u0082#þrD·PQNØ¥Ìâ1ï¹Îá\u0005\u0000Z\u009eÂ0«Sf\u0002(\u0006ÍT\u00adW\u0085\u009aEÃi9d\u0010\rí-êØÞ19ã¨QLãÕß\u0091\u0019Á¯\u0019MAü\u0084uAd\u000fü>Ig";
int var5 = "öõ#±¥On\u008b¯Ä\u0001¼Y¦£\u000bÿ¼\u009dovíKq`î\r«qLä\u0011ÿ\u0089.°9W\u000b\u008b1¦\u0095w\u007f\u009a\u0011}5Ê\u0013`Øiïc\u0091Ù½\"\u0004\tK°7\u0005À\u0086Wèñg×{Õ\u001dþþì÷¿\u0099øfr?AãÆæ·p\u008có\u0017ºTWäûêA3Þ\u009aÔ\u008b\u0083·U\u0082#þrD·PQNØ¥Ìâ1ï¹Îá\u0005\u0000Z\u009eÂ0«Sf\u0002(\u0006ÍT\u00adW\u0085\u009aEÃi9d\u0010\rí-êØÞ19ã¨QLãÕß\u0091\u0019Á¯\u0019MAü\u0084uAd\u000fü>Ig"
.length();
byte var2 = 0;

label36:
while (true) {
var10001 = var2;
var2 += 8;
byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
long[] var37 = var6;
var10001 = var3++;
long var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
byte var52 = -1;

while (true) {
long var8 = var49;
byte[] var10 = var0.doFinal(
new byte[]{
(byte)(var8 >>> 56), (byte)(var8 >>> 48), (byte)(var8 >>> 40), (byte)(var8 >>> 32), (byte)(var8 >>> 24), (byte)(var8 >>> 16), (byte)(var8 >>> 8), (byte)var8
}
);
long var54 = (var10[0] & 255L) << 56
| (var10[1] & 255L) << 48
| (var10[2] & 255L) << 40
| (var10[3] & 255L) << 32
| (var10[4] & 255L) << 24
| (var10[5] & 255L) << 16
| (var10[6] & 255L) << 8
| var10[7] & 255L;
switch (var52) {
case 0:
var37[var10001] = var54;
if (var2 >= var5) {
f = var6;
g = new Integer[25];
KProperty[] var30 = new KProperty[c<"z">(8737, 6805225442735542740L ^ var20)];
var30[0] = Reflection.property1(
new PropertyReference1Impl(q5.class, b<"w">(11055, 7655263602794801309L ^ var20), b<"w">(19666, 3193316303565410164L ^ var20), 0)
);
var30[1] = Reflection.property1(
new PropertyReference1Impl(q5.class, b<"w">(3288, 2608739403082108797L ^ var20), b<"w">(19869, 6896857195022306859L ^ var20), 0)
);
var30[2] = Reflection.property1(new PropertyReference1Impl(q5.class, b<"w">(8311, 2044713136429310918L ^ var20), b<"w">(2196, 2221659568775990020L ^ var20), 0));
var30[3] = Reflection.property1(
new PropertyReference1Impl(q5.class, b<"w">(29608, 1352085694675251208L ^ var20), b<"w">(17244, 7750836826941800653L ^ var20), 0)
);
var30[4] = Reflection.property1(new PropertyReference1Impl(q5.class, b<"w">(5784, 5565509658162926887L ^ var20), b<"w">(4294, 7109240661770408801L ^ var20), 0));
var30[5] = Reflection.property1(
new PropertyReference1Impl(q5.class, b<"w">(29864, 1648030847094912773L ^ var20), b<"w">(26838, 4957079262296664899L ^ var20), 0)
);
var30[c<"z">(7706, 5776648740478381546L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(q5.class, b<"w">(19456, 1114310264140156856L ^ var20), b<"w">(11673, 3219339911810821683L ^ var20), 0)
);
var30[c<"z">(25310, 7837123866892407103L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(q5.class, b<"w">(421, 7292000708721508891L ^ var20), b<"w">(22780, 8537611778826787663L ^ var20), 0)
);
var30[c<"z">(27009, 6355499019634416227L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(q5.class, b<"w">(18023, 2200123909289592307L ^ var20), b<"w">(9485, 8687243069302974111L ^ var20), 0)
);
var30[c<"z">(17721, 2484643423601506010L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(q5.class, b<"w">(19900, 8409783170686242322L ^ var20), b<"w">(23492, 9148518192485095532L ^ var20), 0)
);
var30[c<"z">(21508, 3496335841824155639L ^ var20)] = Reflection.property1(
new PropertyReference1Impl(q5.class, b<"w">(14174, 792519537409635555L ^ var20), b<"w">(11516, 9121190702210494304L ^ var20), 0)
);
I = var30;
E = new q5(var26);
t = yp.L(E, b<"w">(29869, 8978016662191273754L ^ var20), cn.XP, null, null, c<"z">(25754, 5594525166692669309L ^ var20), null, var28);
u = yp.L(E, b<"w">(6418, 2534929908889688765L ^ var20), cn.PEARL, null, null, c<"z">(25754, 5594525166692669309L ^ var20), null, var28);
T = yp.L(E, b<"w">(394, 463227450412630574L ^ var20), cn.FRIEND, null, null, c<"z">(25754, 5594525166692669309L ^ var20), null, var28);
e = yp.L(E, b<"w">(10798, 6579131167610612108L ^ var20), cn.FIREWORK, null, null, c<"z">(25754, 5594525166692669309L ^ var20), null, var28);
A = yp.t(E, b<"w">(26224, 2084164715174946245L ^ var20), true, var22, null, null, c<"z">(25754, 5594525166692669309L ^ var20), null);
n = yp.t(E, b<"w">(30246, 2984966928407360952L ^ var20), true, var22, null, null, c<"z">(25754, 5594525166692669309L ^ var20), null);
D = yp.L(
E,
b<"w">(4551, 3791252713774977651L ^ var20),
c<"z">(1066, 492917466124253139L ^ var20),
new IntRange(0, c<"z">(4522, 7960890724485522014L ^ var20)),
var24,
null,
q5::v,
c<"z">(23890, 826416578073079478L ^ var20),
null
);
h = yp.t(E, b<"w">(28974, 2122893519890313907L ^ var20), true, var22, null, null, c<"z">(25754, 5594525166692669309L ^ var20), null);
x = yp.L(
E,
b<"w">(28950, 518422978938598061L ^ var20),
c<"z">(4151, 7135510341094007756L ^ var20),
new IntRange(0, c<"z">(6015, 8645554460098323607L ^ var20)),
var24,
null,
null,
c<"z">(12438, 6757638441232024423L ^ var20),
null
);
X = yp.L(
E,
b<"w">(22385, 2989474837694207210L ^ var20),
1,
new IntRange(1, c<"z">(17642, 4445660002485122844L ^ var20)),
var24,
null,
null,
c<"z">(5000, 1491684237622206578L ^ var20),
null
);
L = yp.t(E, b<"w">(16714, 3099332994880357085L ^ var20), true, var22, null, null, c<"z">(25754, 5594525166692669309L ^ var20), null);
y = new bg();
return;
}
break;
default:
var37[var10001] = var54;
if (var2 < var5) {
continue label36;
}

var4 = "3Åvß)j\u0015>\u009f\u0018ÒÎú\u0004ª\u0014";
var5 = "3Åvß)j\u0015>\u009f\u0018ÒÎú\u0004ª\u0014".length();
var2 = 0;
}

byte var43 = var2;
var2 += 8;
var7 = var4.substring(var43, var2).getBytes("ISO-8859-1");
var37 = var6;
var10001 = var3++;
var49 = (var7[0] & 255L) << 56
| (var7[1] & 255L) << 48
| (var7[2] & 255L) << 40
| (var7[3] & 255L) << 32
| (var7[4] & 255L) << 24
| (var7[5] & 255L) << 16
| (var7[6] & 255L) << 8
| var7[7] & 255L;
var52 = 0;
}
}
}

var14 = var15.charAt(var33);
break;
default:
var18[var16++] = var45;
if ((var33 += var14) < var17) {
var14 = var15.charAt(var33);
continue label54;
}

var15 = "\u008bÌY©\u0004\u009d¿$OkÏ9ÕäiÛ\u0086\u0086¼EQ)_õ³=l\u0016\u001c?\"6\u008f.ßY¾\u0081ëÈ\u0018±Ã\u0015zP\u0018\u0094¡ïv\u0006\u0084%}eD\u0083Ø\u0013Æf\u0084±\t";
var17 = "\u008bÌY©\u0004\u009d¿$OkÏ9ÕäiÛ\u0086\u0086¼EQ)_õ³=l\u0016\u001c?\"6\u008f.ßY¾\u0081ëÈ\u0018±Ã\u0015zP\u0018\u0094¡ïv\u0006\u0084%}eD\u0083Ø\u0013Æf\u0084±\t"
.length();
var14 = '(';
var33 = -1;
}

var34 = var15.substring(++var33, var33 + var14);
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
int var5 = var0 ^ (int)(var1 & 32767L) ^ 21207;
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
throw new RuntimeException("su/catlean/q5", var10);
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
throw new RuntimeException("su/catlean/q5" + " : " + var1 + " : " + var2.toString(), var5);
}
}

private static int c(int var0, long var1) {
int var3 = var0 ^ (int)(var1 & 32767L) ^ 8848;
if (g[var3] == null) {
byte[] var4 = new byte[]{
(byte)(var1 >>> 56), (byte)(var1 >>> 48), (byte)(var1 >>> 40), (byte)(var1 >>> 32), (byte)(var1 >>> 24), (byte)(var1 >>> 16), (byte)(var1 >>> 8), (byte)var1
};
long var5 = f[var3];
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
throw new RuntimeException("su/catlean/q5", var14);
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
throw new RuntimeException("su/catlean/q5" + " : " + var1 + " : " + var2.toString(), var5);
}
}
}
